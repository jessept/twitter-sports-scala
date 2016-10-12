/**
  * Created by jesseprestwood-taylor on 10/12/16.
  */

import org.apache.spark.{SparkContext, SparkConf}
object WordCountTest {
  def main(args: Array[String]) = {
    val conf = new SparkConf()
      .setMaster("local[*]")
      .setAppName("Test Spark")
      .set("spark.executor.memory", "2g")

    val sc = new SparkContext(conf)
    val lines = sc.parallelize(Seq("This is the first sentence", " This is the second sentence",
      " This is the third sentence"))
    val counts = lines.flatMap(line => line.split(" "))
      .map(word => (word, 1))
      .reduceByKey(_+_)

    counts.foreach(println)
  }
}