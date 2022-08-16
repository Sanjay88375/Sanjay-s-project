/*import java.util.Scanner;
public class Timepass {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = x/y;
		System.out.println(z);
	}

}*/
/*import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Timepass {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        scanner.close();
        if (N%2==0)
        {
            if (N>=2 && N<=5)
            {
                System.out.println("Not Weird");              
            }
            else if (N>=6 && N<=20)
            {
                System.out.println("Weird");
            }
            else
            {
                System.out.println("Not Weird");
            }
        }
        else
            {
                System.out.println("Weird");
            }
    }
}*/

import java.util.Scanner;

public class Timepass {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d = scan.nextDouble();
        String s = scan.nextLine();

        // Write your code here.

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}

