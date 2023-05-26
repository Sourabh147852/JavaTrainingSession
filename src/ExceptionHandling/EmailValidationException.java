package ExceptionHandling;

public class EmailValidationException extends Exception{
    public EmailValidationException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return "Invalid Email Provided";
    }
}
