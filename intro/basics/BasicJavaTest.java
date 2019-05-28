import java.util.Arrays;

public class BasicJavaTest {
  public static void main (String[] arg) {
    BasicJava placeholder = new BasicJava();
    placeholder.printOneTo255();
    placeholder.printOdd255();
    placeholder.printSum();
    placeholder.iterateArray();
    placeholder.iterateArray2();
    placeholder.findMax();
    placeholder.getAverage();
    placeholder.oddArray();
    System.out.println(placeholder.oddArray());

    int[] myArray = {1,3,6,-4,9,6,19,5};
    System.out.println(placeholder.greaterThanY(myArray,4));

    System.out.println(Arrays.toString(placeholder.squareValues(myArray)));
    int[] myArray2 = {1,3,6,-4,9,6,19,5};

    System.out.println(Arrays.toString(placeholder.eliminateNegatives(myArray2)));
    int[] myArray3 = {1,3,6,-4,9,6,19,5};
    System.out.println(Arrays.toString(placeholder.maxMinAvg(myArray3)));


  }
}
