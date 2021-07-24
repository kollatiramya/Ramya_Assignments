package injectExample;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
 
public class InjectMain {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("inject.xml");
        StudentHolder studentHolder = (StudentHolder) context.getBean("studentHolder");
            studentHolder.displayStudentDetails();
    }
}