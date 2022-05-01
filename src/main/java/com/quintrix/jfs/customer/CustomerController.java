package com.quintrix.jfs.customer;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.quintrix.jfs.customer.documents.Customer;
import com.quintrix.jfs.customer.repository.CustomerRepository;

@RestController
public class CustomerController {

  @Autowired
  CustomerRepository customerRepository;

  @RequestMapping(method = RequestMethod.GET, value = "/customer")
  List<Customer> getCustomer(@RequestParam(name = "name", required = false) String make) {

    return customerRepository.findAll();
  }

}
