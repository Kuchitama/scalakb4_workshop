import org.scalatest._
import org.scalatest.matchers.ShouldMatchers

import com.example.NameSelector

class NameSelectorSpec extends FlatSpec with ShouldMatchers {

  // NameSelector#names に参加者の名前が含まれることを試験
  "names" should "contains names of participants" in {
    val names = NameSelector.names
    
    // 1件以上の名前があること
    names.size should be > 0
    // 名前が含まれていること
    names should contain("aa7th")
  }
}
