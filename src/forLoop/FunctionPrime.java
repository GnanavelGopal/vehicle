package forLoop;

public class FunctionPrime {
	public void getPrime(int[] a) {
		for(int i=0;i<a.length;i++) {
			boolean m=true;
			for(int j=2;j<a[i];j++) {
				if(a[i]%j==0) {
					m=false;
				}
			}
			if(m==true) {
				System.out.println(a[i]+" is prime number");
			}
		}
	}
}
