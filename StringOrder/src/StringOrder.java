import java.util.Arrays;
public class StringOrder {
   public static void main(String args[]) {
      String str = "This is a easiest example"; // taking String
	  char charArray[] = str.toCharArray(); // Defining char to read the characters
      Arrays.sort(charArray); // for sorting
      System.out.println(new String(charArray));
   }
}