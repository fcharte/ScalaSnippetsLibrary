How to access MULAN from Scala
==============================
[MULAN](http://mulan.sourceforge.net/) is a Java library for machine learning with multilabel datasets. It is built in top of WEKA, so the file format of the datasets is **ARFF**. The [UseMulan.scala](https://github.com/fcharte/ScalaSnippetsLibrary/blob/master/UseJavaLibraries/UseMULAN.scala) snippet shows how to work with this library, loading the multilabel dataset indicated in the command line and printing some information about it.

How to use the snippet
----------------------
To run this snippet you will need the WEKA and MULAN libraries, two `.jar` files that are available at the [MULAN](http://mulan.sourceforge.net/) and [WEKA](http://www.cs.waikato.ac.nz/ml/weka/) websites.

Run the snippet using the following syntax: `scala -cp "weka.jar;mulan.jar" UseMULAN.scala dataset.arff dataset.xml`, changing the last two parameter to the name of the multilabel dataset to be loaded.

The following image shows the output produced by the snippet working with the `emotions` dataset:

![Output from the script](UseMulanoutput.png).
