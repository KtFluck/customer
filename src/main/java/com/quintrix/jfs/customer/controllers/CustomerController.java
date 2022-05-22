package com.quintrix.jfs.customer.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.quintrix.jfs.car.soap.calculator.Calculator;
import com.quintrix.jfs.car.soap.calculator.CalculatorSoap;
import com.quintrix.jfs.customer.documents.Customer;
import com.quintrix.jfs.customer.repository.CustomerRepository;

@RestController
public class CustomerController {

  @Autowired
  CustomerRepository customerRepository;

  @RequestMapping(method = RequestMethod.GET, value = "/customer")
  List<Customer> getCustomer(@RequestParam(name = "name", required = false) String name) {

    return customerRepository.findAll();
  }

  // must be in main controller to work, the calculator controller does not work!
  @RequestMapping(method = RequestMethod.GET, value = "/add")
  Integer getAdd(@RequestParam(name = "first", required = true) Integer first,
      @RequestParam(name = "second", required = true) Integer second) {

    Calculator calcService = new Calculator();
    CalculatorSoap calculatorSoapProxy = calcService.getCalculatorSoap();
    int sum = calculatorSoapProxy.add(first, second);
    System.out.println(sum);


    return sum;
  }
}
