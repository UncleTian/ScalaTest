package com.lin.luo.tian.practise.chapter5

import scala.beans.BeanProperty

class Student(@BeanProperty var name : String, @BeanProperty var age : Int) {

  override def toString: String = name + "," + age

}
