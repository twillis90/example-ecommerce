package com.commerce.example.repositories;

import com.commerce.example.models.AdminAccount;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AdminAccountRepository extends CrudRepository<AdminAccount, Long> {
    Optional<AdminAccount> findByAdminLogin(String adminLogin);
}
