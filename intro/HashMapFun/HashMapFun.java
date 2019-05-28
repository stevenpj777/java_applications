import java.util.Set;
import java.util.HashMap;
import java.util.*;

public class HashMapFun {
    public static void main(String[] args) {
        HashMap<String, String> tracklist = new HashMap<String, String>();
        tracklist.put("nninja@codingdojo.com", "Nancy Ninja");
        tracklist.put("ssamurai@codingdojo.com", "Sam Samurai");
        tracklist.put("wwizard@codingdojo.com", "Walter Wizard");
        // get the keys by using the keySet method
        Set<String> keys = tracklist.keySet();
        for(String key : keys) {
            System.out.println(key);
            System.out.println(tracklist.get(key));
        }
    }
}
