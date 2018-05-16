class MockBufferedWriter {

//  private var _instance: MockBufferedWriter = null
  private val stringBuilder: StringBuilder = new StringBuilder

//  def getInstance: MockBufferedWriter = {
//    if (_instance == null) {
//      _instance = new MockBufferedWriter
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
