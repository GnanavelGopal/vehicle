package forLoop;

public class StringCount {
	public static void main(String[] args) {
		String a = "b3n5j6";
		String[] b = a.split("");
		for (int i = 0; i < a.length(); i = i + 2) {
			int m=Integer.parseInt(b[i+1]);
			for (int j = 0; j < m; j++) {
				System.out.print(b[i]);
			}
		}
	}
}
