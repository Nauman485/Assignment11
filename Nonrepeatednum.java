package geekster;
import java.util.*;

public class Nonrepeatednum {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length of array");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter element of array");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		sc.close();
		for(int i=0;i<a.length;i++) {
			int count=0;
			for(int j=0;j<a.length;j++) {
				if(a[i]==a[j] && i!=j) {
					count++;
				}
			}
			if(count==0) {
				System.out.println(a[i]);
			}
			}
		}
	}

