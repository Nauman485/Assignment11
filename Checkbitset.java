package geekster;
import java.util.*;

public class Checkbitset {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int n=sc.nextInt();
		System.out.println("Enter shifting bit");
		int s=sc.nextInt();
		sc.close();
		int mask=1<<(s);
		int set=n&mask;
		System.out.println(set);
		if(set>0) {
			System.out.println("bit is set");	
		}
		else {
			System.out.println("bit is not set");
		}
		
	}

}
