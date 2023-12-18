/*
 * Generates three random integers, each in a given range [a,b),
 * prints them, and then prints the minimal number that was generated.
 */
public class GenThree {
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int range = b - a;
      		int n1 = (int) (Math.random() * range + a);
      		int n2 = (int) (Math.random() * range + a);
      		int n3 = (int) (Math.random() * range + a);
		System.out.println (n1);
      		System.out.println (n2);
      		System.out.println (n3);
      		System.out.println("The minimal generated number was " + Math.min(Math.min(n1, n2), n3));
	}
}
