package Java8HW;

public class UsePrimeNumber {
	public static void main(String[] args) {
		PrimeNumber n = (x) -> {
			boolean y = true;
			for (int i = 2; i < x; i++) {
				if (x % i == 0) {
					y = false;
				}
			}
			if (y = true) {
				System.out.println("PrimeNumber");
			} else {
				System.out.println("Notprime");
			}
		};
		n.findPrime(7);
	}
}
