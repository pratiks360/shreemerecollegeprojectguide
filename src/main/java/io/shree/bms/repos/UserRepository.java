package io.shree.bms.repos;

import io.shree.bms.DBtables.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository< UserEntity, Long > {
    UserEntity findByEmail(String email);
}