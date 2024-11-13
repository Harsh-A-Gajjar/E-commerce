package com.project.E_commerce.controllers;
import com.project.E_commerce.model.Customer;
import com.project.E_commerce.model.Seller;
import com.project.E_commerce.services.AdminServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user/admin")
public class AdminController {

    private AdminServices adminService;
    @Autowired
    public AdminController(AdminServices adminService){
        this.adminService = adminService;
    }

    // Customer Management
    @GetMapping("/customers")
    public List<Customer> getAllCustomers(){
        return adminService.getAllCustomers();
    }
    @DeleteMapping("/customer/{id}")
    public void deleteCustomer(@PathVariable long id){
        adminService.deleteCustomerByID(id);
    }
    @PostMapping("/customer")
    public ResponseEntity<Customer> addNewCustomer(@RequestBody Customer customer){
        return new ResponseEntity<Customer>(adminService.addNewCustomer(customer),HttpStatus.CREATED);
    }

    // Seller Management
    @GetMapping("/sellers")
    public List<Seller> getAllSellers(){
        return adminService.getAllSellers();
    }
    @DeleteMapping("/seller/{id}")
    public void deleteSeller(@PathVariable long id){
        adminService.deleteSellerById(id);
    }
    @PostMapping("/seller")
    public ResponseEntity<Seller> addNewSeller(@RequestBody Seller seller){
        return new ResponseEntity<Seller>(adminService.addNewSeller(seller), HttpStatus.CREATED);
    }

}
