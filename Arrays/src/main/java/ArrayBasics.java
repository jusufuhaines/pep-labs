
/**
 * An array is a group of some predefined number of elements.
 * For instance, we could have an array of 10 ints or 10 Strings.
 *
 * Or, we could have an array of our own custom Objects, such as our own Bird class for a birdwatching
 * application. This would allow us to keep track of many birds and their own behavior.
 *
 * For the following problems, all of the syntax we need is in this documentation:
 * https://www.learnjavaonline.org/en/Arrays
 */
public class ArrayBasics {
    /**
     * @param arr the array we're getting data from.
     * @return the length of arr.
     */
    public int getLengthOfArray(int[] arr){ //created a method
        return arr.length; 
    }

    /**
     * @param arr the array we're getting data from.
     * @param n the index (number) of the element we're looking to return.
     *          Indexes in arrays start counting from zero.
     * @return the element at index n of arr.
     */
    public int getNthElementOfArray(int[] arr, int n){ //created a method
        return arr[n];
       
    }

    /**
     *
     * @param arr the array we're getting data from.
     * @param n the index (number) of the element we're looking to modify.
     *          Indexes in arrays start counting from zero.
     * @param val the value that we will assign to a spot in the array.
     * @return nothing. Because of pass-by-reference, any change to the array will be reflected across our java program.
     */
    public void setNthElementOfArray(int[] arr, int n, int val){ //created a method
        arr[n] = val;

    }

    /**
     * @param n the size of the array we wish to create
     * @return a new int array that can contain n elements.
     */
    public int[] returnNewArraySizeN(int n){    //created a method2
        int[] arr = new int[n];
        return arr;
    }
    public static void main(String[] args){
        ArrayBasics i = new ArrayBasics();
        int[] jus = new int[5];
        int[] ufu = new int[3];
        int[] hai = {8,4,7,3,8,5};
        int[] nes = {5,3,9,1,0};
        int[] nest = {6,4,8};
        int[] shotgun = {9,3,7,3,6};
        int[] handgun = {9,3,4};
        

        i.getLengthOfArray(jus);
        i.getLengthOfArray(ufu);
        i.getNthElementOfArray(hai, 2);
        i.getNthElementOfArray(nes, 0);
        i.getNthElementOfArray(nest, 2);
        i.setNthElementOfArray(shotgun, 2, 7);
        i.setNthElementOfArray(handgun, 0, 2);
        i.returnNewArraySizeN(2);
        
    }

}
