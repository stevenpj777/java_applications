public class StringManipulatorTesting {
  public static void main(String[] args) {
    StringManipulator output = new StringManipulator();
    String result = output.trimAndConcat("steven  ", "johnson  ");
    System.out.println(result);


    StringManipulator output1 = new StringManipulator();
    int result1 = output1.getIndexOrNull("steven", 'z');
    System.out.println(result1);

    StringManipulator output2 = new StringManipulator();
    int result2 = output2.getIndexOrNull("steven", "ev");
    System.out.println(result2);

    StringManipulator output3 = new StringManipulator();
    String result3 = output3.concatSubstring("steven", 1, 2, "zen");
    System.out.println(result3);

  }

}
