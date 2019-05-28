import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;
import java.util.*;


public class BasicJava {
  public void printOneTo255() {
    for (int i = 1; i < 256; i++) {
      System.out.println(i);
    }
  }

public void printOdd255() {
  for (int i = 1; i < 256; i=i+2) {
    System.out.println(i);
  }
}

public void printSum(){
    int sum = 0;
    for (int i=0;i<256;i++){
        sum +=i;
        // System.out.println("New number : "+i+" Sum: "+sum);
        System.out.println(String.format("New number : %s Sum: %s", i, sum));
    }
}

public void iterateArray() {
  int[] myArray = {1,3,5,7,9,11,13};
  for (int i : myArray) {
    System.out.println(i);
  }
}

// ANOTHER way of doing an array!!!! pay attention to brackets vs. parenthesis
public void iterateArray2() {
  int[] myArray = {1,3,5,7,9,11,13};
  for (int i = 0; i < myArray.length; i++) {
    System.out.println(myArray[i]);
  }
  }

public void findMax() {
  int[] myArray = {1,3,6,4,9,6,19,5};
  int max = myArray[0];
  for (int i = 1; i < myArray.length; i++) {
    if (myArray[i] > max) {
      max = myArray[i];
    }
  }
  System.out.println(String.format("Max number : %s", max));
}

public void getAverage() {
  int[] myArray = {1,3,6,4,9,6,19,5};
  int sum = 0;
  int avg = 0;
  for (int i = 0; i < myArray.length; i++) {
    sum += myArray[i];
  }
  avg = sum/myArray.length;
  System.out.println(String.format("Avg number : %s", avg));

}

public ArrayList oddArray() {
  ArrayList<Integer> myArray = new ArrayList<Integer>();
  for (int i= 1; i < 256; i=i+2) {
    myArray.add(i);
  }
  return myArray;
}

// : USE size for an array list and length for an array
public int greaterThanY(int[] myArray, int x) {
  int count = 0;
  for (int i = 0; i < myArray.length; i++) {
    if (myArray[i] > x) {
      count++;
    }
  }
  return count;

}

public int[] squareValues(int[] myArray) {
  // int[] myArray = {1,3,6,4,9,6,19,5};
  for (int i= 0; i < myArray.length; i++) {
    myArray[i] *= myArray[i];
  }
  return myArray;
}


public int[] eliminateNegatives(int[] myArray){
    for (int i=0; i<myArray.length;i++){
        if (myArray[i]<0){
            myArray[i] = 0;
        }
    }
    return myArray;
}


public int[] maxMinAvg(int[] myArray){
    int max = myArray[0];
    int min = myArray[0];
    int sum = 0;
    for (int i=0;i<myArray.length;i++){
        if (myArray[i]>max){
            max = myArray[i];
        }else if (myArray[i]<min){
            min = myArray[i];
        }
        sum += myArray[i];
    }
    int[] result = {max, min, sum/myArray.length};
    return result;
}







}
