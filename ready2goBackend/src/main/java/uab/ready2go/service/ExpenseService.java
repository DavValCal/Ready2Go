package uab.ready2go.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import uab.ready2go.model.Expense;
import uab.ready2go.repository.ExpenseRepository;

import java.util.NoSuchElementException;

@Service
public class ExpenseService {

    @Autowired
    private ExpenseRepository expenseRepository;

}
