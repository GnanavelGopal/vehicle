package forLoop;

public class StringReverse {
	public String getString(String a) {
		String[] b = a.split(" ");
		String m = " ";
		for (int i = b.length - 1; i >= 0; i--) {
			m = m + b[i] + " ";
		}
		return (m);

	}

	public void getDissending(int[] a) {
		int temp = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
			System.out.println(a[i]);
		}
	}

	public void getAssending(int[] a) {
		int temp = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[j] < a[i]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
			System.out.println(a[i]);
		}
	}

	public void duplicate(int[] a, int[] b) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if (a[i] == b[j]) {
					continue;
				}
				else {
					System.out.print(a[i]+" "+b[j]);
				}
			}

		}
	}

	public void armstrong(int a) {
		int num = a;
		int temp = 0;
		int temp1 = 0;
		for (int i = a; i >= 0; i=a/10) {
			temp = num % 10;
		//	num = num / 10;
			temp1 = temp1 + (temp * temp * temp);
		}
		if (num == temp1) {
			System.out.println("It is Armstrong Number");
		} else {
			System.out.println("It is not Armstrong number");
		}
	}
}
