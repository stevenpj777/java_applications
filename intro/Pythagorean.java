// import java.lang.Math;
// public class Pythagorean {
//   public double calculateHypotenuse(int legA, int legB) {
//     // the hypotenuse is the side across the right angle.
//         // calculate the value of c given legA and legB
//         double c = Math.sqrt(legA) + Math.sqrt(legB);
//         return c;
//   }
// }



// import Math
import java.lang.Math;
public class Pythagorean {
	public double calculateHypotenuse(int legA, int legB) {
		double hypoteneuse = Math.sqrt((legA * legA) + (legB *legB));
		return hypoteneuse;
	}
}
