package King;
import java.util.Scanner;
public class Percentage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the First Subject's marks");
		int a = sc.nextInt();
		System.out.println("Enter the Second Subject's marks");
		int b = sc.nextInt();
		System.out.println("Enter the Third Subject's marks");
		int c = sc.nextInt();
		int d = (a+b+c)/3;
		System.out.println(d);
		if (d>90)
		{
			System.out.println("Disstinction");
		}
		else if(d>=70 && d<=90)
		{
			System.out.println("First Class");
		}
		else if(d>=60 && d<=70)
		{
			System.out.println("Second Class");
		}
		else if(d>=40 && d<=60)
		{
			System.out.println("Third Class");
		}
		else
		{
			System.out.println("Fail");
		}
		/*int d = (a>b)?((a>c)?a:b):((b>c)?b:c);
		System.out.println(d);*/
	}

}
