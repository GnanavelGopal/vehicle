package forLoop;

public class UseStringRev {
	public static void main(String[] args) {
		String[] a= {"gnanavel","gopal","aravind"};
		StringArrayRev m=new StringArrayRev();
		String[] revString=m.getReverse(a);
		for(int i=0;i<revString.length;i++) {
			System.out.print(revString[i]);
		}
		
	}
}
