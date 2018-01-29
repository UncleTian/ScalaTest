package com.lin.luo.tian.practise.chapter9

import java.io.{File, FileWriter, PrintWriter}
import java.util.stream.Collectors

import scala.collection.mutable.ArrayBuffer
import scala.io.Source

object FileTest {

  def main(args: Array[String]): Unit = {
    exe11
  }

  def exe13 : Unit = {
    val array = Array("Hello", "World")
    val flatArray = array.map(_.split("").toList).flatten
    val flatArray2 = array.map(_.split("").toList).flatMap((x) => x)
    flatArray2.foreach(println(_))
  }

  def exe12 : Unit = {
    var li= List(1,2,3,4)
    var res = li.flatMap(x => List(x*x))
    println(res)
  }

  def exe11: Unit = {
    val directoryPath = "D:\\TestFiles"
    var direcotry = new File(directoryPath)

    var dirs = subdirs(direcotry)
    var count = 0;
    dirs.foreach(f => println(f.getName))

    println(count)

    println(getClassFiles(direcotry))
  }

  def countFiles(dir : File) : Int = {
    dir.listFiles().filter((f) => f.getName.endsWith(".class")).length
  }

  //count class files under given directory
  def getClassFiles(file : File) : Int = {
    var count = 0
    if (file.isDirectory) {
      file.listFiles().foreach(f => count += getClassFiles(f))
    } else if(file.getName.endsWith(".class")) {
      count += 1
    }

    count
  }

  def subdirs(dir : File) : Iterator[File] = {
    val  children = dir.listFiles().filter(_.isDirectory)
    children.toIterator ++ children.toIterator.flatMap(subdirs _)
  }

  def exe10: Unit = {
    var webPage = Source.fromURL("http://www.sina.com.cn/").mkString
    val imgPattern = """(<img.+src=")(.+)("\s+alt.+)""".r
    val srcList = new ArrayBuffer[String]
    for (imgPattern(g1, g2, g3) <- imgPattern.findAllIn(webPage)) srcList += g2

    srcList.foreach((img) => {
      println(img)
    })
    //println(webPage)
  }

  def exe9(n: Int): Unit = {
    for (i <- 0 to n) println("%-10d%-10.5f".format(math.pow(2, i).toInt, 1.0 / Math.pow(2, i)))
  }

  def exe8 = {
    var source = Source.fromFile("myfile3.txt").mkString
    val floatPattern = "[0-9]+.[0-9]+".r
    val values = floatPattern.findAllIn(source).toArray
    var doubleValues: Array[Double] = values.map(_.toDouble)
    println(doubleValues.size)

    println("sum = " + doubleValues.sum)
    println("max = " + doubleValues.max)
    println("min = " + doubleValues.min)
    println("avg = " + doubleValues.sum / doubleValues.size)
  }

  def exe7 = {
    var source = Source.fromFile("myfile2.txt").getLines().toArray
    var writer = new PrintWriter(new File("D:\\out.txt"))
    source.foreach((str) => writer.println(formatLine(str, "[ ]+", getMaxSize(source))))
    writer.close()
  }

  def formatLine(line: String, regex: String, size: Int): String = {
    val words = line.split(regex)
    var str = ""
    var style = "%-" + size + "s"
    words.foreach((w) => str += style.format(w))
    str
  }

  def getMaxSize(array: Array[String]): Int = {
    var maxSize = 0
    array.foreach((str) => {
      str.split("[ ]+").foreach((w) => {
        if (w.length > maxSize) maxSize = w.length
      })
    })

    maxSize
  }

  def exe6 = {
    var source = Source.fromFile("myfile.txt").mkString
    source.replaceAll("\t", " ")
    var writer = new PrintWriter(new File("D:\\out.txt"))
    //for (i <- 0.to(lines.length - 1)) println(lines(i))
    writer.close()
  }

  def exe5 = {
    var person = Person("Jack", 23)
    import java.io._
    var oos = new ObjectOutputStream(new FileOutputStream("D:\\Person.txt"))
    oos.writeObject(person)
    oos.close()
    println(person)

    var ois = new ObjectInputStream(new FileInputStream("D:\\Person.txt"))
    var personFromFile = ois.readObject()
    ois.close()
    println(personFromFile)
  }

  def exe4 = {
    var source = Source.fromURL("http://news.sina.com.cn/c/nd/2018-01-23/doc-ifyqwiqi7564294.shtml", "UTF-8")
    //println(source.mkString)

    var writer = new FileWriter(new File("D:\\sina.html"))
    writer.write(source.mkString)
    writer.close()
  }


  def exe1 = {
    var source = Source.fromFile("myfile.txt")
    val lines = source.getLines()
    var i = 0;
    lines.foreach((line) => {
      i = i + 1;
      println(i + ":" + line)
    })
  }

  def exe2 = {
    var source = Source.fromFile("myfile.txt")
    val iter = source.buffered
    var count = 0

    while (iter.hasNext) {
      println(iter.next())
      println(iter.head)
      Thread.sleep(1000)
    }

    source.close()

    println(count)
  }

  def exe3 = {
    println("How old are you ?")
    val age = readInt()
    println(age)
  }

}
