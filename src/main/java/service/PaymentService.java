package service;

import dao.DonationDao;
import dao.OtherIncomeDao;
import dao.PaymentDao;
import dao.StudentFeeDao;
import domain.Donation;
import domain.OtherIncome;
import domain.StudentFee;
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

    public List<Donation> allDonations() {
        return donationDao.findAll();
    }


    public String otherPayment(OtherIncome otherIncome) {

        try {
            otherIncomeDao.save(otherIncome);
        } catch (Exception e) {
            return "Error in saving" + e.getMessage();
        }

        return "successfully saved";
    }

    public List<OtherIncome> allOtherIncomes() {
        return otherIncomeDao.findAll();
    }


}
