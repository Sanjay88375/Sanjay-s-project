import java.util.Arrays;
public class StringOrder {
   public static void main(String args[]) {
      String str = "This is a easiest example";
	  char charArray[] = str.toCharArray();
      Arrays.sort(charArray);
      System.out.println(new String(charArray));
   }
}