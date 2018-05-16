package com.util.enums

/**
  * @author rajdeep-gupta
  */
object DistributionTypes extends Enumeration {

  type DistributionType = Value

  val SEARCH = Value("Search")                  // bit 0 = 1
  val CONTENT = Value("Content")                // bit 1 = 2
  val SEARCH_PARTNER = Value("Search Partner")  // bit 2 = 4
  val PLACEMENT = Value("Placement")            // bit 3 = 8
  val RETARGETING = Value("Retargeting")        // bit 4 = 16
  val GENERIC = Value("Generic")                // bit 5 = 32
  val PRODUCT_TARGET = Value("Product Target")  // bit 6 = 64
  val SHOPPING = Value("Shopping")              // bit 7 = 128

}