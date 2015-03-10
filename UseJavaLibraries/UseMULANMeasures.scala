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
println("Hamming Loss: " + HL.getValue)

// The values area accumulated. To start a fresh metric call reset
HL.reset

HL.updateBipartition(t, t)
println("Hamming Loss: " + HL.getValue)
HL.updateBipartition(p, t)
println("Hamming Loss: " + HL.getValue)

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

println("\nSample-based bipartition-based metrics\n")
println("Accuracy: " + Acc.getValue)
println("Precision: " + Prec.getValue)
println("Recall: " + Rec.getValue)
println("F-measure: " + Fm.getValue)
println("Subset Accuracy: " + SA.getValue)

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

println("\nSample-based ranking-based metrics\n")
println("One error: " + OE.getValue)
println("Coverage: " + CO.getValue)
println("Ranking loss: " + RL.getValue)
println("Average precision: " + AP.getValue)

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

println("\nLabel-based metrics\n")
println("Macro precision: " + MP.getValue)
println("Macro recall: " + MR.getValue)
println("Macro F-measure: " + MaF.getValue)
MP.getValue
MR.getValue
MaF.getValue
