import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.*;

public class PuzzleJava {
  public static void main(String[] args) {
    sumArray();
    System.out.println("\n");

    // shuffleArray();
    System.out.println("\n");
    System.out.println(shuffleNames());
    shuffleAlphabet();
    System.out.println(Arrays.toString(getRandomArr()));
    System.out.println(getRandomArr2());

    System.out.println(randString());
    System.out.println(randString10());


    // randString();
    // System.out.println(randStringArray());

  }

  public static ArrayList shuffleNames(){
      ArrayList<String> myArray = new ArrayList<String>();
      ArrayList<String> newArray = new ArrayList<String>();

      myArray.add("Nancy");
      myArray.add("Jinichi");
      myArray.add("Fujibayashi");
      myArray.add("Momochi");
      myArray.add("Ishikawa");
      Collections.shuffle(myArray);
      for (String name : myArray) {
        System.out.println(name);
        if (name.length() > 5)
        newArray.add(name);
      }
      return newArray;
  }

  public static void shuffleAlphabet() {

    String[] letters = {"a","b","c","d","e","f"};

    for (int i = 0 ;i < letters.length; i++) {
      System.out.println(letters[i]);
    }
    Collections.shuffle(Arrays.asList(letters));
    for (int i = 0 ;i < letters.length; i++) {
      System.out.println(letters[i]);
    }
    String first = letters[0];
    String last = letters[letters.length - 1];
    System.out.println(String.format("First letter: %s", first));
    System.out.println(String.format("Last letter : %s", last));

  }

  public static int[] getRandomArr() {
    int[] randomArr;
    randomArr = new int[10];
    // int[] randomArr = new int[10];
    Random rand = new Random();
    int random = 0;
    for (int i = 0; i < 10; i++) {
      random = 55 + rand.nextInt(100 - 55 + 1);
      randomArr[i] = random;
    }
    return randomArr;
  }

  public static ArrayList getRandomArr2() {
    ArrayList<Integer> myArray = new ArrayList<Integer>();

    Random rand = new Random();
    int random = 0;
    for (int i = 0; i < 10; i++) {
      random = 55 + rand.nextInt(100 - 55 + 1);
      myArray.add(random);
    }
    Collections.sort(myArray);
    System.out.println("max value is " + Collections.max(myArray));
    System.out.println("min value is " + Collections.min(myArray));

    return myArray;
  }

  public static String randString() {
    char[] letters = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
    String newString = "";

    Random rand = new Random();
    int random = 0;

    for (int i = 0; i < 5; i++) {
      random = 1 + rand.nextInt(26 - 1 + 1);
      newString += letters[random];
    }
    return newString;
  }




  public static String randString10() {
    char[] letters = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
    String newString = "";
    String[] arr = new String[10];

    Random rand = new Random();
    int random = 0;

    for (int y = 0; y <10; y++) {


        for (int i = 0; i < 5; i++) {
          random = rand.nextInt(25) + 1;
          newString += letters[random];
        }

    }

    return newString;
  }






  // public static ArrayList<String> shuffleNames(){
  //   ArrayList<String> newarr = new ArrayList();
  //   newarr = {"Nancy", "Jinichi", "Fujibayashi", "Momochi", "Ishikawa"};
  //
  //   for (String name: newarr) {
  //     System.out.println(name);
  //   }
  //   return newarr;
  // }


    // List names = new ArrayList();
    // Collections.addAll(names, "Nancy", "Jinichi", "Fujibayashi","Momochi", "Ishikawa");
    // names.forEach(System.out::println);
    //
    // Collections.shuffle(names);
    // System.out.println("Final collection after shuffle: \n"+names);

    // Collections.sort(names);
    // System.out.println("Alphabetical Order:");
    // names.forEach(System.out::println);

    // Collections.sort(names, Comparator.reverseOrder());
    // System.out.println("Sorted according to reverse of natural ordering:");
    // names.forEach(System.out::println);



  public static ArrayList<Integer> sumArray() {
    ArrayList<Integer> myArray = new ArrayList<Integer>();
    int[] arr = {3,5,1,2,7,9,8,13,25,32};
    int sum = 0;

    // OR: loop like
    // for(int num : arr){
    //     sum += num;
    //     if(num>10){
    for (int i = 0; i < arr.length; i++) {
      sum += arr[i];
      if (arr[i] > 10) {
        myArray.add(arr[i]);
      }
    }
    System.out.println(String.format("Sum is %s", sum));

    return myArray;
  }




}
