package com.project.E_commerce.services.Impl;
import com.project.E_commerce.model.Customer;
import com.project.E_commerce.model.Seller;
import com.project.E_commerce.repository.CustomerRepository;
import com.project.E_commerce.repository.SellerRepository;
import com.project.E_commerce.services.AdminServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class AdminServiceIMPL implements AdminServices {

    private CustomerRepository customerRepository;
    private SellerRepository sellerRepository;

    @Autowired
    public AdminServiceIMPL(CustomerRepository customerRepository, SellerRepository sellerRepository){
        this.customerRepository = customerRepository;
        this.sellerRepository = sellerRepository;
    }

    @Override
    public List<Customer> getAllCustomers() {
        List<Customer> customers = customerRepository.findAll();
        return customers;
    }

    @Override
    public void deleteCustomerByID(long id) {
        customerRepository.deleteById(id);
    }

    @Override
    public Customer addNewCustomer(Customer customer) {
        customerRepository.save(customer);
       return customer;
    }

    @Override
    public List<Seller> getAllSellers() {
       return sellerRepository.findAll();
    }

    @Override
    public void deleteSellerById(long id) {
        sellerRepository.deleteById(id);
    }

    @Override
    public Seller addNewSeller(Seller seller) {
        sellerRepository.save(seller);
        return seller;
    }
}
