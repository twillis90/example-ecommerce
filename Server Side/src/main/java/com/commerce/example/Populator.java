package com.commerce.example;


import com.commerce.example.models.AdminAccount;
import com.commerce.example.models.Product;
import com.commerce.example.models.ProductIdentifier;
import com.commerce.example.models.UserAccount;
import com.commerce.example.repositories.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class Populator implements CommandLineRunner {

    @Resource
    public AdminAccountRepository adminRepo;

    @Resource
    public ProductIdentifierRepository productIdentifierRepo;

    @Resource
    public ProductRepository productRepo;

    @Resource
    public ProductReviewRepository productReviewRepo;

    @Resource
    public UserAccountRepository userRepo;

    @Override
    public void run(String... args) throws Exception {
        ProductIdentifier digital = new ProductIdentifier("digital");
        ProductIdentifier physical = new ProductIdentifier("physical");
        ProductIdentifier product = new ProductIdentifier("product");
        Product testProduct1 = new Product("test product 1", "really super cool product for sale", 19.99, 5, physical, product);
        Product testProduct2 = new Product("test product 2", "cool as hell", 15.99, 5, digital, product);
        AdminAccount admin1 = new AdminAccount("Mike", "Hauncho", "mikeHauncho", "buttCheeks", "mikey@gmail.com");
        UserAccount user1 = new UserAccount("Teddy", "Swims", "teddyBswimmin@gmail.com", "call911", "1234 Doowop St", "Atlanta", "30301", "Georgia", "US");

        productIdentifierRepo.save(digital);
        productIdentifierRepo.save(physical);
        productIdentifierRepo.save(product);
        productRepo.save(testProduct1);
        productRepo.save(testProduct2);
        adminRepo.save(admin1);
        userRepo.save(user1);

    }
}
