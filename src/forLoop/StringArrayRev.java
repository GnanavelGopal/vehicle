package forLoop;


public class StringArrayRev {
	public  String[] getReverse(String[] a) {
		String[] rev=new String[a.length];
		for (int i = 0; i < a.length; i++) {
			String c = " ";
			for (int j = a[i].length() - 1; j >= 0; j--) {
				c = c + a[i].charAt(j);

			}
			rev[i]=c;
		}
		return rev;
	}
}
