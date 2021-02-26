
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EmailServiceTest {
    private EmailService emailServiceObject;    //creating a variable of class EmailService type
    private Order orderObject;      //creating a variable of class Order type
    EmailServiceTest()
    {
        /*
        * using constructor to create object of EmailService and Object class*/
        emailServiceObject = new EmailService();
        orderObject = new Order();
    }

    /*
    * Method to test getInstance() of EmailService class*/
    @Test
    void shouldReturn_InstanceOfEmailService()
    {
        /*
        * Creating a variable of EmailService type to check if the
        * getInstance() method returns the null pointer or the
        * object of EmailService class.*/
        EmailService instanceReturnedBack = EmailService.getInstance();
        /*
        * Using the assertInstanceOf() to check if the returned object
        * is of EmailService type*/
        assertInstanceOf(EmailService.class, instanceReturnedBack);
    }

    /*
     * Method to test sendEmail(Order order, String cc) of EmailService class*/
    @Test
    void sendEmailTest_shouldReturnTrue()
    {
        /*
        * Making a final constant to store and pass the string in the sendEmail()*/
        final String MESSAGE_STRING = "Email sent";
        /*
        using a boolean variable to store the output of sendEmail()
        and testing it using assertTrue() function*/
        boolean emailSendAcknowledgement = emailServiceObject.sendEmail(orderObject, MESSAGE_STRING);
        assertTrue(emailSendAcknowledgement);
    }

    /*
     * Method to test sendEmail(Order order) of EmailService class*/
    @Test
    public void sendEmailTest_shouldThrowRuntimeException(){
        /*
        * using a variable of Exception class type to store the instance of
        * RuntimeException which was thrown by the sendEmail()*/
        Exception exception = assertThrows(RuntimeException.class, () ->{
            emailServiceObject.sendEmail(orderObject);
        });
        /*
        * checking the exception variable if its the type of
        * RuntimeException class using assertInstanceOf() */
        assertInstanceOf(RuntimeException.class, exception);
    }
}
