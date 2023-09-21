package forLoop;

import java.util.Arrays;

public class SortArray {
	public static void main(String[] args) {
//		String[] a = { "ramesh", "rajesh", "arjun", "anjali", "ganapathi" };
//		Arrays.sort(a);
//		System.out.println("Sorted Array " + Arrays.toString(a));
//		String a="gnanavel";
//		char[] b=a.toCharArray();
//		Arrays.sort(b);
//		System.out.println("Sorted Array "+Arrays.toString(b));
		String a="gnanavel";
		char[] b=a.toCharArray();
		char max=0;
		for(int i=0;i<b.length;i++) {
			for(int j=i+1;j<b.length;j++) {
				if(b[i]>b[j]) {
					max=b[i];
					b[i]=b[j];
					b[j]=max;
				}
			}
			
		}
		System.out.print(b);
	}
}
