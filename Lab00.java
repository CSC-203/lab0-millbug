
public class Lab00
{
   public static void main(String[] args) {
      // declaring variables
      int x = 5;
      String y = "hello";
      double z = 9.8;

      // printing variables
      System.out.println(" x: " + x + " y: " + y + " z: " + z);

      // array to represent list
      int [] nums = {3, 6, -1, 2}; // defining array; does not need to be created with 'new' exp?
      for (int b: nums) {
         System.out.println(b);
      }

      // calling defined function
      int numFound = char_count(y,'l');
      System.out.println("Found: " + numFound);

      // counting 'for' loop
      for (int i = 1; i < 11; i++) {
         System.out.print(i + " ");
      }
   }


      // function definition
      public static int char_count (String s, char c) {
         int count = 0;
         for (int i = 0; i < s.length(); i++) { // index increments up to length of string in arg
            if (s.charAt(i) == c) {
               count += 1;
            }
         }
         return count;
      }
}
         // "char item : s" doesn't work b/c foreach is not applicable to String type !

