package com.example.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.AmazonInvoice;

public interface AmazonInvoiceRepo  extends JpaRepository<AmazonInvoice, Integer>{

}
