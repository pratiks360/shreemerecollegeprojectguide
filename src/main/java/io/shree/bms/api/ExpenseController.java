package io.shree.bms.api;

import io.shree.bms.DBtables.Expense;
import io.shree.bms.repos.ExpenseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/expense")
public class ExpenseController {
    @Autowired
    ExpenseRepo expenseRepo;



    @PostMapping(path = "/addexpense")
    public @ResponseBody String addNewCustomer(@RequestParam String expense_type, @RequestParam int amount,
                                               @RequestParam String expenseDate) {


        Expense expense =  new Expense();

        expense.setExpense_type(expense_type);
        expense.setAmount(amount);
        expense.getExpenseDate(expenseDate);
        expenseRepo.save(expense);


        return "Expense Added";
    }


}
