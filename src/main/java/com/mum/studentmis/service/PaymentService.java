package com.mum.studentmis.service;

import com.mum.studentmis.dao.OtherIncomeDao;
import com.mum.studentmis.dao.DonationDao;
import com.mum.studentmis.dao.PaymentDao;
import com.mum.studentmis.dao.StudentFeeDao;
import com.mum.studentmis.domain.Donation;
import com.mum.studentmis.domain.OtherIncome;
import com.mum.studentmis.domain.StudentFee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class PaymentService {

    @Autowired
    PaymentDao paymentDao;

    @Autowired
    StudentFeeDao studentDao;

    @Autowired
    DonationDao donationDao;
    @Autowired
    OtherIncomeDao otherIncomeDao;


    public String studentPayment(StudentFee studentFee) {
        try {
            studentDao.save(studentFee);
        } catch (Exception e) {
            return "Error in saving" + e.getMessage();
        }

        return "successfully saved";
    }

    public double allStudentPayments() {

        List<StudentFee> studentFeeList = studentDao.findAll();
        double totalfee = studentFeeList.stream()
                                        .mapToDouble(f -> f.getAmount())
                                        .sum();
        return totalfee;
    }


    public String donationPayment(Donation donation) {

        try {
            donationDao.save(donation);
        } catch (Exception e) {
            return "Error in saving" + e.getMessage();
        }

        return "successfully saved";
    }

    public double allDonations() {
        List<Donation> donationList = donationDao.findAll();
        double totalfee = donationList.stream()
                .mapToDouble(f -> f.getAmount())
                .sum();

        return totalfee;
    }


    public String otherPayment(OtherIncome otherIncome) {

        try {
            otherIncomeDao.save(otherIncome);
        } catch (Exception e) {
            return "Error in saving" + e.getMessage();
        }

        return "successfully saved";
    }

    public double allOtherIncomes() {

        List<OtherIncome> otherIncomeList = otherIncomeDao.findAll();
        double totalfee = otherIncomeList.stream()
                .mapToDouble(f -> f.getAmount())
                .sum();
        return totalfee;

         }

public double totalIncome(){
        double total=0.0;
        return allDonations() + allOtherIncomes() + allStudentPayments();
}

}
