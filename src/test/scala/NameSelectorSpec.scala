import org.scalatest._
import org.scalatest.matchers.ShouldMatchers

import com.example.NameSelector

class NameSelectorSpec extends FlatSpec with ShouldMatchers {

  // NameSelector#namesFromFilePathが指定のファイルから名前を読み込むことを試験
  "namesFromFilePath" should "read names from file" in {
    val path = "src/test/resources/test_names.txt"

    val actuary = NameSelector.namesFromFile(path)
    actuary.size should be === 3
    actuary should be === List("hoge", "fuga", "piyo")
  }
}
