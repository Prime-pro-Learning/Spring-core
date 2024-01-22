import com.amazon.Order;
import com.amazon.OrderDao.OrderDao;
import com.amazon.OrderService;
import com.amazon.SubmitOrder;
import com.spring.GreetingService;
import com.spring.Person;
import com.spring.QuestFailException;
import com.spring.RoundTable;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class Main {
    public static void main(String[] args) {
        BeanFactory beanFactory=new XmlBeanFactory( new FileSystemResource("C:\\Users\\SURESH\\OneDrive\\Spring\\spring-core\\src\\spring-core.xml"));

        /*Person person = (Person) beanFactory.getBean("person");
        System.out.println(person.getId());
        System.out.println(person.getName());*/
        /*SubmitOrder order=(SubmitOrder) beanFactory.getBean("submitOrder");
        order.perform();*/
        OrderDao orderDao=(OrderDao) beanFactory.getBean("orderDao");
        String s = orderDao.saveOrder(new Order(123, "des1", 125, "Laptop"));
        System.out.println(s);

    }
}