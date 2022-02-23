
package com.journaldev.sparkdemo;

import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaPairRDD;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;
import scala.Tuple2;

import java.util.Arrays;

public class WordCounter {

    private static void wordCount(String fileName) {

        SparkConf sparkConf = new SparkConf().setMaster("local").setAppName("JD Word Counter");

        JavaSparkContext sparkContext = new JavaSparkContext(sparkConf);

        JavaRDD<String> inputFile = sparkContext.textFile(fileName);

        JavaRDD<String> wordsFromFile = inputFile.flatMap(line -> Arrays.asList(line.split(" ")));

        JavaPairRDD countData = wordsFromFile.mapToPair(word -> new Tuple2(word, 1)).reduceByKey((x, y) -> (int) x + (int) y);

        countData.saveAsTextFile("CountData");
    }

    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("Denise Case says - you need a file.");
            System.exit(0);
        }

        wordCount(args[0]);
    }
}
