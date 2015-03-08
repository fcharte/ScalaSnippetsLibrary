// HOW TO USE: scala -cp "weka-3.7.6.jar;mulan.jar" UseMULANMeasures.scala 
import mulan.evaluation.measure._		// Metrics definitions
import mulan.classifier._				// MultiLabelOutput definition

// Create the object that computes a metric
val HL = new HammingLoss
HL.getIdealValue  // Gets the ideal value (0 -> minimize / 1 -> maximize)

// We can prepare vectors with true labels and potential predictions
val p = Array(true, false, false, true)
val t = Array(true, false, true, false)

// And update de bipartition
HL.updateBipartition(p, t)
HL.getValue

// The values area accumulated. To start a fresh metric call reset
HL.reset

HL.updateBipartition(t, t)
HL.getValue
HL.updateBipartition(p, t)
HL.getValue

// Some other example based metrics
val Acc = new ExampleBasedAccuracy(true)
val Prec = new ExampleBasedPrecision(true)
val Rec = new ExampleBasedRecall(true)
val Fm = new ExampleBasedFMeasure(true)
val SA = new SubsetAccuracy

// The update() method is the standard way to give the inputs
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

// Ranking based measures
val OE = new OneError
val CO = new Coverage
val RL = new RankingLoss
val AP = new AveragePrecision

// In this case the predictions are the ranking order of each label
OE.update(new MultiLabelOutput(Array(1, 2)),  Array(true, false))
CO.update(new MultiLabelOutput(Array(1, 2)),  Array(true, false))
RL.update(new MultiLabelOutput(Array(1, 2)),  Array(true, false))
AP.update(new MultiLabelOutput(Array(1, 2)),  Array(true, false))

OE.getValue
CO.getValue
RL.getValue
AP.getValue

// Macro-averaged measures
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
