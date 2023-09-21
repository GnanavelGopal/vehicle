package forLoop;

public class Practice {
	public static void main(String[] args) {
		int a = 370;
		int temp = a;
		int p = 0;
		while(a>0) {
			int num=a%10;
			p=p+(num*num*num);
			a=a/10;
		}
		if(temp==p) {
			System.out.println("Armstrong");
		}
		else {
			System.out.println("Not Armstrong");
		}
	}
}
