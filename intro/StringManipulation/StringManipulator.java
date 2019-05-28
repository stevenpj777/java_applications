public class StringManipulator {
  public String trimAndConcat(String test1, String test2) {
    String string1 = test1.trim();
    String string2 = test2.trim();
    String string3 = string1.concat(string2);
    return string3;
  }

  public Integer getIndexOrNull(String test4, char letter) {

    int a = test4.indexOf(letter);
      return a;
  }

  public Integer getIndexOrNull(String test5, String test6) {
    int b = test5.indexOf(test6);
    return b;
  }

  public String concatSubstring(String str1, int x, int y,  String str2) {
    String newString = str1.substring(x, y);
    newString = newString.concat(str2);
    return newString;
  }



}
