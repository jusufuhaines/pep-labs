
/**
 * This class represents a custom exception which may be thrown in the CustomExceptionThrower class.
 * By extending Exception, CustomException has inherited all the behavior of Exception while being its own class!
 * Potentially, this class could also override some the behavior of Exception.
 */
public class CustomException extends Exception{
private String code;

    public void CustomExceptiom(String code, String message){
        System.out.println(message);
        this.setCode(code);
    }
    public void setCode(String code){
        this.code = code;
    }
    

}
