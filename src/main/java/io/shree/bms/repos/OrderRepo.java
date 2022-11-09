package io.shree.bms.repos;

import io.shree.bms.DBtables.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepo extends JpaRepository<Order, Long> {


}
