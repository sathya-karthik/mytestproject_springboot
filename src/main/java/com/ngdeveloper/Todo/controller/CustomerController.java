package com.ngdeveloper.Todo.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ngdeveloper.Todo.entity.CustomerEntity;
import com.ngdeveloper.Todo.service.CustomerService;

@RestController
public class CustomerController {
	
@Autowired
private CustomerService cs;

@RequestMapping(path="/feedCustomerData")
public void setDataInDB()
{
	try {
		// save customer data

		cs.saveCustomerData();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

@RequestMapping(path="/feedCustomerDataBulk")
public void setDataInDBBulk()
{
	try {
		cs.saveCustomerDataBulk();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

@RequestMapping(path="/getCoupons/{store}")
public List<CustomerEntity> getCoupons(@PathVariable("store") String storeName)
{
	try {
		return cs.getStoreData(storeName); 
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return null;
}


}
