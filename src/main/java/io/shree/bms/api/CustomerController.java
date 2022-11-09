package io.shree.bms.api;


import io.shree.bms.DBtables.Customer;
import io.shree.bms.repos.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("customer")
public class CustomerController {


    //Add
    //retrive by phone


    @Autowired
    private CustomerRepo customerRepo;

    @PostMapping(path = "/addcustomer")
    public @ResponseBody String addNewCustomer(@RequestParam String custFirstName, @RequestParam String custLastName,
                                               @RequestParam String custEmail, @RequestParam String custNum, @RequestParam String custAddress) {

        Customer customer = new Customer();

        customer.setCustFirstName(custFirstName);
        customer.setCustLastName(custLastName);
        customer.setCustEmail(custEmail);
        customer.setPhone(custNum);
        customer.setCustAddress(custAddress);


        customerRepo.save(customer);
        return "Customer Created";
    }

    @GetMapping(path = "/allCustomers")
    public @ResponseBody Iterable<Customer> getAllCustomers() {
        return customerRepo.findAll();
    }

    @GetMapping(path = "/bynum")
    public @ResponseBody Customer getAllCustomerbyNum(@RequestParam String phone) {
        return customerRepo.findByphone(phone);
    }


}