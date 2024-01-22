package com.amazon;

import com.amazon.OrderDao.OrderDao;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

public class SubmitOrder implements Performer{
    private Map<String,Order> orders;

    private Order order;
    public SubmitOrder(){

    }
    @Override
    public void perform() {
       // for(Order order:orders) order.submit();
        for(Map.Entry<String,Order> entry:orders.entrySet()){
            System.out.println("Map-->key:"+entry.getKey());
            entry.getValue().submit();
        }
    }

    /*public void setOrders(Collection<Order> orders) {
        this.orders = orders;
    }*/

    public void setOrders(Map<String,Order> orders) {
        this.orders = orders;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    /*public static void main(String[] args) {
        SubmitOrder order1=new SubmitOrder();
        Order order2=new Order(741,"Des",120,"name");
        order1.setOrder(order2);
        ArrayList<Order> list=new ArrayList<>();
        list.add(new Order(123,"des1",125,"Laptop"));
        list.add(new Order(123,"des1",125,"Laptop"));
        order1.setOrders(list);
    }*/
    public static void main(String[] args) {
        OrderDao orderDao=new OrderDao();
        orderDao.jdbcTemplate=new JdbcTemplate();
    }
}
