package forLoop;

public class Duplicate {
	public static void main(String[] args) {

		String a = "Helloworld";
		char[] x = a.toCharArray();
		
		/*
		 * for (int i = 0; i < a.length()-1; i++) { for (int j = i + 1; j <
		 * a.length()-1; j++) { if (a.charAt(j) == a.charAt(i)) {
		 * System.out.println(a.charAt(j)); } } }
		 */
		for (int i = 0; i < x.length; i++) {
			int count = 0;
			int count1=0;
			for (int j = i + 1; j < x.length; j++) {
				if (x[j] == x[i]) {
					count++;
					x[j]=0;
				}

			}
			if (count > 0 && x[i]!=0) {
				System.out.println(x[i]+count);
			}
		}
	}
}
