// HOW TO USE: scala -cp "weka-3.7.6.jar;mulan.jar" UseMULANMeasures.scala 
import mulan.evaluation.measure._
import mulan.classifier._

val HL = new HammingLoss
HL.getIdealValue

val p = Array(true, false, false, true)
val t = Array(true, false, true, false)

HL.updateBipartition(p, t)
HL.getValue

HL.reset
HL.updateBipartition(t, t)
HL.getValue
HL.updateBipartition(p, t)
HL.getValue

val Acc = new ExampleBasedAccuracy(true)
val Prec = new ExampleBasedPrecision(true)
val Rec = new ExampleBasedRecall(true)
val Fm = new ExampleBasedFMeasure(true)
val SA = new SubsetAccuracy

Acc.update(new MultiLabelOutput(t), p)
Prec.update(new MultiLabelOutput(t), p)
Rec.update(new MultiLabelOutput(t), p)
Fm.update(new MultiLabelOutput(t), p)
SA.update(new MultiLabelOutput(t), p)
HL.update(new MultiLabelOutput(t), p)

Acc.getValue
Prec.getValue
Rec.getValue
Fm.getValue
SA.getValue

val OE = new OneError
val CO = new Coverage
val RL = new RankingLoss
val AP = new AveragePrecision

OE.update(new MultiLabelOutput(Array(1, 2)),  Array(true, false))
CO.update(new MultiLabelOutput(Array(1, 2)),  Array(true, false))
RL.update(new MultiLabelOutput(Array(1, 2)),  Array(true, false))
AP.update(new MultiLabelOutput(Array(1, 2)),  Array(true, false))

OE.getValue
CO.getValue
RL.getValue
AP.getValue

val MP = new MacroPrecision(2, true)
val MR = new MacroRecall(2, true)
val MaF = new MacroFMeasure(2, true)

MP.update(new MultiLabelOutput(Array(true, true)), Array(false, true))
MP.update(new MultiLabelOutput(Array(true, true)), Array(true, true))
MR.update(new MultiLabelOutput(Array(true, true)), Array(false, true))
MR.update(new MultiLabelOutput(Array(true, true)), Array(true, true))
MaF.update(new MultiLabelOutput(Array(true, true)), Array(false, true))
MaF.update(new MultiLabelOutput(Array(true, true)), Array(true, true))

MP.getValue
MR.getValue
MaF.getValue
