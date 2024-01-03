import com.amazon.OrderService;
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
        /*GreetingService greetingService = (GreetingService) beanFactory.getBean("greetingService");
        greetingService.sayGreeting();*/
        /*RoundTable roundTable=(RoundTable) beanFactory.getBean("roundTable");
        try {
            roundTable.printGrail();
        } catch (QuestFailException e) {
            throw new RuntimeException(e);
        }
       *//* Person person=(Person) beanFactory.getBean("p");
        System.out.println(person.getName());*/
        OrderService orderService=(OrderService) beanFactory.getBean("orders");
        orderService.availableQuantity();
        orderService.price();
        orderService.rating();
        orderService.submitOrder();
    }
}