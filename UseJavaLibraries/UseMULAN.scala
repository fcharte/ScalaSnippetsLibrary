// HOW TO USE: scala -cp "weka-3.7.6.jar;mulan.jar" UseMULAN.scala dataset.arff dataset.xml
import mulan.data._
val mld = {new MultiLabelInstances(args(0), args(1))}

println("NumInstances: " + mld.getNumInstances)
println("NumLabels: " + mld.getNumLabels)
println("Cardinality: " + mld.getCardinality)

val stat = {
  val stat = new Statistics
  stat.calculateStats(mld)
  stat.calculatePhi(mld)
  stat
}

println("Stat\n" + stat)

println("PhiCorrelations")
stat.printPhiCorrelations()

val chi = new UnconditionalChiSquareIdentifier()
println("Dependence")
println(chi.calculateDependence(mld))
println("CriticalValue: " + chi.getCriticalValue)
println("Coocurrence\n" + stat.calculateCoocurrence(mld))
