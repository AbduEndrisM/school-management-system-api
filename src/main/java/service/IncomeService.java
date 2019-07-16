package service;

import dao.IncomeDao;
import domain.Income;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class IncomeService {

    @Autowired
    IncomeDao incomeDao;

    public void studentPayment(Income income){
        incomeDao.save(income);
    }









}
