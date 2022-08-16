import java.util.Scanner;
public class Triangle {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the First angle");
		int a = sc.nextInt();
		System.out.println("Enter the Second angle");
		int b = sc.nextInt();
		System.out.println("Enter the Third angle");
		int c = sc.nextInt();
		int d = a+b+c;
		if (d==180) {
			System.out.println("It's a triangle");			
			if (a<90 && b<90 && c<90)
			{
				System.out.println("Acute-angled Triangle");
			}
			else if(a>90 || b>90 || c>90)
			{
				System.out.println("Obtuse angle");
			}
			else
			{
				System.out.println("Right angle");
			}
		}
		else
			System.out.println("It's not a triangle");
		}}
