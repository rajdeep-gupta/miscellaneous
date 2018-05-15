class MockBufferedWriter {

  private var _instance: MockBufferedWriter = null
  var stringBuilder: StringBuilder = new StringBuilder

  def getInstance: MockBufferedWriter = {
    if (_instance == null) {
      _instance = new MockBufferedWriter
    }

    _instance
  }

  def write(string: String): Unit = {
    this.stringBuilder.append(string)
  }
}