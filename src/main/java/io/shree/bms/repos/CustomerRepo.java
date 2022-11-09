package io.shree.bms.repos;

import io.shree.bms.DBtables.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepo extends JpaRepository<Customer, Long> {
        Customer findByphone(String phone);
}


