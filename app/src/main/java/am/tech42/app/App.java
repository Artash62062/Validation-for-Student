package am.tech42.app;
import java.util.List;
import am.tech42.lib.validator;

public class App {
    public static void main(String[] args) throws Exception {
        Student student = new Student();
        student.setFirstName("");
        student.setLastName("last Name");
        student.setGpa(-20);
        String password ="Pas sword";
        String userName = "userName";
        student.setUsername(userName.toCharArray());
        student.setPassword(password.toCharArray());
        
        List <String> errors = validator.validate(student);
       
        System.out.println(errors.toString());
    }
}