import org.apache.spark.SparkContext
import org.apache.spark.SparkContext._
import org.apache.spark.SparkConf

object WordCount {
  def main(args: Array[String]): Unit = {
    System.setProperty("hadoop.home.dir", "c://hadoop//")
    val sc = new SparkContext(new SparkConf().setAppName("Spark Count"))
    val text = sc.textFile("D:/Viswanath/Softwares/software/HADOOP/Spark/Spark_toLearn/spark_example/wordcountexample/inputfile/wordcountinput.txt");
   // val counts = text.flatMap(line => line.split(" ")).map(word => (word, 1)).reduceByKey(_ + _);

   // sc.textFile("D:/Viswanath/Soft")

  }
}