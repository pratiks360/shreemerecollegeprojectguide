package io.shree.bms.repos;


import io.shree.bms.DBtables.Expense;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExpenseRepo extends JpaRepository<Expense, Long> {

}