package requiredExample;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
 
public class RequiredMain{
 
        public static void main(String[] args) {
        ApplicationContext Context = new ClassPathXmlApplicationContext("reqiured.xml");
 
        Country countryObj = (Country) Context.getBean("CountryBean");
        String countryName=countryObj.getCountryName();
        countryObj.display();

      
               
    }
}