package wikipedia

import org.apache.spark.SparkConf

object Main {
  def main(args: Array[String]): Unit = {
    println(WikipediaRanking.rankLangs(WikipediaRanking.langs, WikipediaRanking.wikiRdd))

  }
}
