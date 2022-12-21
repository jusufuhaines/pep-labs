
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
        
    public static boolean isEqual(int a, int b){
        if(a==b){
            return true;
        }
        else{
            return false;
        }
    }

    /**
     * @param a the first number to be compared.
     * @param b the second number to be compared.
     * @return true if a is greater than b, false otherwise.
     */
    public static boolean greaterThan(int a, int b){
        if(a>b){
            return true;
        }
        else{
            return false;
        }
    }
    /**
     * @param a the first number to be compared.
     * @param b the second number to be compared.
     * @return true if a is less than b, false otherwise.
     */
    public static boolean lessThan(int a, int b){
        if(a<b){
            return true;
        }
        else{
            return false;
        }
    }
    /**
     * @param a the first number to be compared.
     * @param b the second number to be compared.
     * @return true if a is greater than or equal to b, false otherwise.
     */
    public static boolean greaterThanOrEqualTo(int a, int b){
        if(a>=b){
            return true;
        }
        else{
            return false;
        }
    }
    /**
     * @param a the first number to be compared.
     * @param b the second number to be compared.
     * @return true if a is less than or equal to b, false otherwise.
     */
    public static boolean lessThanOrEqualTo(int a, int b){
        if(a<=b){
            return true;
        }
        else{
            return false;
        }
    }

    /**
     * @param a the first number to be compared.
     * @param b the second number to be compared.
     * @return true if a is not equal to b, false otherwise.
     */
    public static boolean notEqualTo(int a, int b){
        if(a!=b){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main (String args[]){
        Comparators.isEqual(7,7);
        Comparators.isEqual(7,8);
        Comparators.greaterThan(84,9);
        Comparators.greaterThan(9,84);
        Comparators.greaterThan(84,84);
        Comparators.lessThan(8,9);
        lessThan(9,8);
        lessThan(9,9);
        greaterThanOrEqualTo(9,1);
        greaterThanOrEqualTo(1,9);
        greaterThanOrEqualTo(1,1);
        lessThanOrEqualTo(2,3);
        lessThanOrEqualTo(3,2);
        lessThanOrEqualTo(2,2);
        notEqualTo(7,0);
        notEqualTo(0,0);
    }
}