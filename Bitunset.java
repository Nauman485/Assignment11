package geekster;
import java.util.*;

public class Bitunset {
	
	public static void main(String []args) {
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number");
	int n=sc.nextInt();
	System.out.println("Enter Shifting bit");
	int s=sc.nextInt();
	sc.close();
	int mask=~(1<<(s));
	n=n&mask;
	System.out.println(n);
	}
}
