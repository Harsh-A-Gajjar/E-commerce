package com.project.E_commerce.services;
import com.project.E_commerce.model.Customer;
import com.project.E_commerce.model.Seller;
import java.util.List;

public interface AdminServices {
    List<Customer> getAllCustomers();

    void deleteCustomerByID(long id);

    Customer addNewCustomer(Customer customer);

    List<Seller> getAllSellers();

    void deleteSellerById(long id);

    Seller addNewSeller(Seller seller);
}
