
public class Parrot {
    /**
     * This method should return whatever String was passed into it by whatever invoked it (in this case, the test),
     * instead of returning "return text please!"
     *
     * for example:
     * String str = copy("hello");
     * System.out.println(str); -> prints out "hello"
     *
     * @param text is a parameter passed into this method by whatever called it.
     * @return text.
     */

    public static String copy(String text){
        return text;
    }
    public static void main (String args[]){
        copy("hello");
        copy("polly");
    }
/*public String yes(String text){
        return text;
     }
    public static void main(String[] args){
        yes("wassup");
        yes("Wass goodie");
    }
} */
}
    