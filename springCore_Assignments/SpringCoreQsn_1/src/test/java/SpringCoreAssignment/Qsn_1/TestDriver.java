package SpringCoreAssignment.Qsn_1;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertAll;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import SpringCoreAssignment.Qsn_1.Customer;
 //@RunWith(SpringRunner.class)
//@Configuration(proxyBeanMethods="/beans.xml")
class TestDriver {
    @Autowired
    Customer customer;
	@Test
	public void test() {
	
		 assertAll(
		()->assertEquals(customer.getCustomerName(),"ramya"),
		()->assertEquals(customer.getCustomerId(),1234),
		()->assertEquals(customer.getCustomerContact(),9876543),
		()->assertEquals(customer.getCustomerAddress().getStreet(),"jrcolney"),
		()->assertEquals(customer.getCustomerAddress().getCity(),"vizianagarm"),
		()->assertEquals(customer.getCustomerAddress().getState(),"Andhra Pradesh"),
		()->assertEquals(customer.getCustomerAddress().getZip(),535128),
		()->assertEquals(customer.getCustomerAddress().getCountry(),"india"));
	}

}