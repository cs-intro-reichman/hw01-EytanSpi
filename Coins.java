/*
 * Write a program that gets a quantity of cents as a command-line argument.
 * The program prints how to represent this quantity using as many quarters as possible, plus the remainder in cents.
 */
public class Coins {
	public static void main(String[] args) {
		int totalCents = Integer.parseInt(args[0]);
		int numQuarters = totalCents / 25;
		int remainder = totalCents - numQuarters * 25;
		System.out.println("Use " + numQuarters + " quarters and " + remainder + " cents");
	}
}
