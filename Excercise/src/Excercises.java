import java.util.Scanner;
public class Excercises {	

			public static void main(String[] args) {
				// TODO Auto-generated method stub
				int x ,y,t;
				Scanner sc=new Scanner(System.in);
				System.out.println("Ënter the value of X and y");
				x=sc.nextInt();
				y=sc.nextInt();
				System.out.println("before swapping numbers:"+x+" "+y);
				t=x;
				x=y;
				y=t;
				System.out.println("After swapping numbers:"+x+" "+y);
				System.out.println();
			

			}}
/*package anudip;
import java.util.Scanner;
public class Greatest {

	public static void main(String[] args) {
		
			Scanner in = new Scanner(System.in);
			 
			System.out.println("Enter three numbers");
			int num1 = in.nextInt();
			int num2 = in.nextInt();
			int num3 = in.nextInt();
			
			if(num1>num2 && num1>num3)
				System.out.println(num1+" is greater");
			else if(num2>num3)
				System.out.println(num2+" is greater");
			else
				System.out.println(num3+" is greater");
	}

}
package anudip;
import java.util.Scanner;
public class TempIndicater {

	public static void main(String[] args) {
		
			Scanner in = new Scanner(System.in);
			 
			System.out.println("Enter the tempreature");
			int temp = in.nextInt();
			
			
			if(temp<100)
				System.out.println("Green Indicater is On, No need to worry");
			else if(temp>=100 && temp<=200)
				System.out.println("Yello indicater is On, Be Alert");
			else
				System.out.println("Red Indicater is On, In Danger");
	}

}
Syed Asif5:29 PM
import java.util.Scanner;
public class Temperature {
    public static void main(String[] args) {
        System.out.println("Enter the temperature");
        Scanner obj1 = new Scanner(System.in);
        int temperature = obj1.nextInt();
        if (temperature > 0 && temperature < 100) {
            System.out.println("Green signal");

        }
        elseif(temperature > 100 && temperature < 200)
        {
            System.out.println("Yellow signal");
        }
        else   Sy
Anees Hyder5:31 PM
import java.util.Scanner;

public class Led {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the temprature");
		int temp= sc.nextInt();
		
		
		if (temp < 100)
		{
		    System.out.println("green");
		}
		else (temp > 100 && temp<=200)
		{
			System.out.println(" yellow");
		}
		else if (temp >200 && temp<=300)
		{
			System.out.println(" red");
		}
		

	}
	
package anudip;
import java.util.Scanner;
public class FindingArea {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		//program for coverting days to month and days
		System.out.println("Enter days");
		
		int n = in.nextInt();
		
		int mon = n/30;
		int days = n%30;
		
		System.out.println("There are "+mon+" months and "+days+"days");
		
		
		 

	}

}
Shivani Raghav4:17 PM
import java.util.Scanner;
public class Days {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m ,year,week,day;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of days:");
		m=s.nextInt();
		year=m/365;
		year=m%365;
		System.out.println("No. of years:"+year);
		week=m/7;
		m=m/7;
		System.out.println("No. of weeks:"+week);
		day=m;
		System.out.println("No. of days:"+day);
		
		
		
		

	}
Satyam Choudhary4:17 PM
((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0)
Himanshu Shukla4:19 PM
import java.util.Scanner;
 public class LeapYear { 	public static void main(String[] args){ Scanner sc=new Scanner(System.in); 		System.out.println("Check Leap Year, Century Year or Not"); 		System.out.println("-------------------------------------"); 		System.out.print("Enter year: ");
int year = sc.nextInt();
if (year % 100 == 0){
if(year % 400 == 0){ 				System.out.println("Year '"+year+"' is a Century Year and a Leap Year!"); 			} else
 {
System.out.println("Year '"+year+"' is a C)
Ashish Shrivastav4:21 PM
yes mam present
Anees Hyder4:22 PM
import java.util.Scanner; 
public class Daysinayear {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number of days");
		int days= sc.nextInt();
		 
		 int months = days/30;
		int day   = days%30;
		 
		 System.out.println("there are"+months+"months and "+days+"days");
		 
		
	

	}

}

import java.util.*;
public class Exchange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x ,y,t;
		Scanner sc=new Scanner(System.in);
		System.out.println("Ënter the value of X and y");
		x=sc.nextInt();
		y=sc.nextInt();
		System.out.println("before swapping numbers:"+x+" "+y);
		t=x;
		x=y;
		y=t;
		System.out.println("After swapping numbers:"+x+" "+y);
		System.out.println();
	

	}
Anees Hyder2:37 PM
import java.util.Scanner;
public class Exercises {

	public static void main(String[] args) {
		
		Scanner obj1= new Scanner(System.in);
		Scanner obj2= new Scanner(System.in);
		
		int length = obj1.nextInt();
		int bredth = obj2.nextInt();
		int Area   = length*bredth;
		
		System.out.println("the area of rectangle is "+Area);
		
	

	}

}
Shivam Sharma2:38 PM
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int length, area;
System.out.println("enter length");
Scanner s=new Scanner (System.in);
length=s.nextInt();
area=length*length;
System.out.println("area of square is :" + area);

	}

}
Himanshu Shukla2:42 PM
public class Main.

{

public static void main (String args[])

{ float p, r, t, si; // principal amount, rate, time and simple interest respectively.

p = 13000; r = 12; t = 2;

si = (p*r*t)/100;

System.out.println("Simple Interest is: " +si);

}}
Shivam Sharma2:42 PM
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int length,width, area;
System.out.println("enter length");
Scanner s=new Scanner (System.in);
length=s.nextInt();
System.out.println("enter width");
Scanner r=new Scanner (System.in);
width=r.nextInt();
area=length*width;
System.out.println("area of rectangle is :" + area);

	}

}
Nikhil Vishwakarma2:43 PM
done
Anushka2:44 PM
public static void main(String args[]) 
    {
        float p, r, t;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the Principal : ");
        p = s.nextFloat();
        System.out.print("Enter the Rate of interest : ");
        r = s.nextFloat();
        System.out.print("Enter the Time period : ");
        t = s.nextFloat();
        float si;
        si = (r * t * p) / 100;
        System.out.print("The Simple Interest is : " + si);
    }
}
Himanshu Shukla2:44 PM
public class temperature  

 {  

   public static void main (String args[])  

    { float Fahrenheit, Celsius;  

          Celsius= 13;  

          Fahrenheit =((Celsius*9)/5)+32;  

          System.out.println("Temperature in Fahrenheit is: "+Fahrenheit);  

    }}
Shivani Raghav2:49 PM
public class Temperature {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double Fahrenheit,Celsius;
		Celsius=15;
		Fahrenheit=(Celsius*1.8+32);
		System.out.println("Temperature in Fahrenheitis:"+Fahrenheit);
		
		
		

	}
anju maurya2:49 PM
Public class temperature
{
Public static void main (string args[])
{ Float Fahrenheit , celsius;
     Celsius=13;
       Fahrenheit=((celcius*9)/5)+32!
        System.out.prinyln("Temperature in F ahrenheitis;"+Fahrenheit);
*/