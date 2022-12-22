
public class IfStatement {
    /**
     * An if statement uses a conditional statement (within parentheses) to determine if the code
     * within {curly braces} should run.
     * If statements can be coupled with an else{} statement or else if(){} statement.
     *
     * Let's make an if statement that does the following:
     * if bool is true, return x.
     * if bool is false, return y.
     *
     * Additional Resource if needed: https://www.w3schools.com/java/java_conditions.asp
     *
     * @param bool a true/false value that determines if x or y is to be returned.
     * @param x first number to be compared.
     * @param y second number to be compared.
     * @return x if bool is true. if bool is false, return y.
     */
    public static int ifExample(boolean bool, int x, int y){
        if(bool=true){
            return x;
        }
        else{
            bool = false;
            return y;
        }
    }
    public static void main(String args[]){
        IfStatement try3 = new IfStatement();
        IfStatement try1 = new IfStatement();
        try3.ifExample(true, 0, 1);
        try1.ifExample(false,0,1);
    }
}
