package io.shree.bms.api;

import io.shree.bms.DBtables.Customer;
import io.shree.bms.DBtables.Order;
import io.shree.bms.repos.CustomerRepo;
import io.shree.bms.repos.OrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("order")
public class OrderController {

    //add
    //retive by ID
    @Autowired
    private OrderRepo orderRepo;
    @Autowired
    private CustomerRepo customerRepo;
    @PostMapping(path = "/addorder")
    public @ResponseBody String addNewOrder(@RequestParam String name, @RequestParam String price, @RequestParam String orderDate,
                                            @RequestParam String delivDate, @RequestParam Long customer,
                                            @RequestParam String preference, @RequestParam String allergies) {
        Order order = new Order();
        Customer cust = customerRepo.getById(customer);
        order.setName(name);
        order.setPrice(price);
        order.setOrderDate(orderDate);
        order.setDelivDate(delivDate);

        order.setCust(cust);
        order.setPreference(preference);
        order.setAllergies(allergies);


        orderRepo.save(order);
        return "Order Added";
    }

    @GetMapping(path = "/allorders")
    public @ResponseBody Iterable<Order> getAllOrders() {
        return orderRepo.findAll();
    }

    @GetMapping(path = "/byid")
    public @ResponseBody Order getAllOrderbyid(@RequestParam long id) {
        return orderRepo.findById(id).get();
    }
}



