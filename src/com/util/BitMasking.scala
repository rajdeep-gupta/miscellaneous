package com.util

import scala.collection.mutable
import com.util.enums.DistributionTypes._

/**
  * @author rajdeep-gupta
  */
object BitMasking {

  def main(args: Array[String]): Unit = {
    val resMap = new mutable.HashMap[String, Any]

    resMap += ("distribution_types" -> 3)
    dstrbTyps(resMap)

    resMap += ("distribution_types" -> 51)
    dstrbTyps(resMap)

    resMap += ("distribution_types" -> 110)
    dstrbTyps(resMap)
  }

  def dstrbTyps(resultMap: mutable.Map[String, Any]): Unit = {
    val distribution_types = resultMap("distribution_types").asInstanceOf[Int]

    val dstrbTyps: java.util.ArrayList[String] = new java.util.ArrayList[String]

    val distTypeEnums = Seq(SEARCH, CONTENT, SEARCH_PARTNER, PLACEMENT, RETARGETING, GENERIC, PRODUCT_TARGET, SHOPPING)

    (0 to 7).foreach(i => {
      if (isBitSet(distribution_types, i)) {
        dstrbTyps.add(distTypeEnums(i).toString)
      }
    })

     println(dstrbTyps)
  }

  // where the magic happens
  def isBitSet(bitmask: Int, bit: Int): Boolean = {
    val shifted = 1 << bit
    val chk = bitmask & shifted
    chk == shifted
  }
}