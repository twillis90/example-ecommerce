package com.commerce.example.repositories;

import com.commerce.example.models.UserAccount;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserAccountRepository extends CrudRepository <UserAccount, Long>{
    Optional<UserAccount> findByUserEmail(String userEmail);
}
