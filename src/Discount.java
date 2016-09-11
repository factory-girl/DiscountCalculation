import java.util.Scanner;

/**
 * A class that provides the program's working method which the user interacts with
 * through input and receives a response.
 */
public class Discount
{
    public static void main(String[] args)
    {
        Customer customer1 = new Customer();
        boolean more = true;
        do
        {
           Scanner in = new Scanner(System.in);
           System.out.println("Please enter a purchase amount, -1 to quit: "); 

           double input = in.nextDouble();
  
           if (input == -1)
           {
               more = false;
           }
           else
           {
              customer1.makePurchase(input);
           }
         } 
         while (more);
         System.out.println("Total sale, including discounts : "
                         + customer1.getTotal());
    }
}