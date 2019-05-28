import java.util.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;

public class BubbleSort {

  public ArrayList oddArray() {
    ArrayList<Integer> myArray = new ArrayList<Integer>();
    for (int i= 1; i < 256; i=i+2) {
      myArray.add(i);
    }
    return myArray;
  }
  
  }
