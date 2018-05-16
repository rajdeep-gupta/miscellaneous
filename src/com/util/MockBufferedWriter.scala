package com.util

/**
  * @author rajdeep-gupta
  */
private class MockBufferedWriter {

  //  private var _instance: references.MockBufferedWriter = null
  private val stringBuilder: StringBuilder = new StringBuilder

  //  def getInstance: references.MockBufferedWriter = {
  //    if (_instance == null) {
  //      _instance = new references.MockBufferedWriter
  //    }
  //
  //    _instance
  //  }

  def get: String = {
    this.stringBuilder.toString
  }

  def write(string: String): Unit = {
    this.stringBuilder.append(string)
  }
}
