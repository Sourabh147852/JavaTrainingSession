package ExceptionHandling;

public class MailValidatorUtil {

    public void validateMail(String mailid)throws EmailValidationException{
    //is mail contaim@
        boolean isContainAt=mailid.contains("@");
        boolean isContainDot=mailid.contains(".");
        if(isContainDot&&isContainAt){
            System.out.println("Mail is valid");
        }else {
            System.out.println("Mail is invalid, raising exception");
            throw new EmailValidationException("Mail id is not a valid mail");
        }
    }
}
