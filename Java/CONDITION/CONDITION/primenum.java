package CONDITION;
import java.util.*;

public class primenum 

{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter prime num");
		int n=sc.nextInt();
		int count = 0;
		for(int i = 1;i < n; i++) {
			if(n%i == 0) {
				count ++;
			}
		}
		
		if(count == 2) {
			System.out.println("PRIME NUMBER");
		}
		else {
			System.out.println("NOT A PRIME NUMBER");
		}
		sc.close();
  }
	
}
