package service;

import dao.DonationDao;
import dao.OtherIncomeDao;
import dao.PaymentDao;
import dao.StudentDao;
import domain.OtherIncome;
import domain.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class PaymentService {

    @Autowired
    PaymentDao paymentDao;

    @Autowired
    StudentDao studentDao;

    @Autowired
    DonationDao donationDao;
    @Autowired
    OtherIncomeDao otherIncomeDao;

    public Student getStudent(Long id){
        return studentDao.findById(id).get();
    }

    public void studentPaymentIncome(Student student){

    }

    public void donationIncome(Student student){

    }

    public void otherPaymentIncome(OtherIncome otherIncome){

    }











}
