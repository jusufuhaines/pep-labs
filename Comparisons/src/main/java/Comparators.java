
/**
 * If we want to make programs that "do something", we're going to need to create instructions that change
 * depending on the current state of the program.
 * Therefore, we're inevitably going to run into boolean expressions (ie true/false statements).
 * Let's start with the different ways to compare two numbers, in this case a and b.
 * 
 * Additional Resource if needed: https://www.oreilly.com/library/view/java-for-dummies/9781118239742/a17.html
 */
import java.util.Scanner;

public class Comparators {
    /**
     * @param a the first number to be compared.
     * @param b the second number to be compared.
     * @return true if a is equal to b, false otherwise.
     */

     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the first number":);
     String ainput = sc.nextLine();
     double a = Double.parseDouble(ainput);

     System.out.println("Enter the second number:");
     String binput = sc.nextLine();
     double b = Double.parseDouble(binput);

    Static void true(String text){
        text = "true";
        return text;
    }

    Static void false(String text1){
        text1 = "false";
        return text1;
    }
     public static void main (String args[]){
        if(a==b){
            String text = new String("true");
            return text;
        }
        else{
            String text = new String("false");
            return text;
        }
     }


        
    public boolean isEqual(int a, int b){
        return false;
    }

    /**
     * @param a the first number to be compared.
     * @param b the second number to be compared.
     * @return true if a is greater than b, false otherwise.
     */
    public boolean greaterThan(int a, int b){
        return false;
    }
    /**
     * @param a the first number to be compared.
     * @param b the second number to be compared.
     * @return true if a is less than b, false otherwise.
     */
    public boolean lessThan(int a, int b){
        return false;
    }
    /**
     * @param a the first number to be compared.
     * @param b the second number to be compared.
     * @return true if a is greater than or equal to b, false otherwise.
     */
    public boolean greaterThanOrEqualTo(int a, int b){
        return false;
    }
    /**
     * @param a the first number to be compared.
     * @param b the second number to be compared.
     * @return true if a is less than or equal to b, false otherwise.
     */
    public boolean lessThanOrEqualTo(int a, int b){
        return false;
    }

    /**
     * @param a the first number to be compared.
     * @param b the second number to be compared.
     * @return true if a is not equal to b, false otherwise.
     */
    public boolean notEqualTo(int a, int b){
        return false;
    }
}