public class Lab00
{
   public static void main(String[] args)
   {
      int x = 0;
      String y = "hello";
      double z = 9.8;

      System.out.println("x: " + x + " y: " + y + " z: " + z);

      int[] nums = {3, 6, -1, 2};

      for (int num : nums)
            System.out.println(num);

      char test = 'l';
      int numFound = char_count(y, test);
      System.out.println("Found: " + numFound);

      for (int i = 0; i < 11; i ++)
            System.out.print(i + " ");
   }

      public static int char_count(String s, char c)
      {
            char[] charlist = s.toCharArray();
            int count = 0;
            for (char ch : charlist){
                  if (ch == c)
                        count++;   
            }          
            return count;
      }  

}
      
   
   
