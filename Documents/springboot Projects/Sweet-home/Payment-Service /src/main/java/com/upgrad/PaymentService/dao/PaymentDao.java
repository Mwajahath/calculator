package com.upgrad.PaymentService.dao;

import com.upgrad.PaymentService.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentDao extends JpaRepository<Payment,Integer> {



}
