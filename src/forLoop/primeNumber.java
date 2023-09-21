package forLoop;

public class primeNumber {
	public static void main(String[] args) {
		int a = 25;
		int b = 110;
		for (int i = a; i < b; i++) {
			boolean isPrime = true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					isPrime = false;

				}
			}

			if (isPrime == true) {
				System.out.println(i);
			}

		}
	}
}
