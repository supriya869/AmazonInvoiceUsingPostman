package com.example.service;

import java.util.List;

import com.example.model.AmazonInvoice;

public interface AmazonInvoiceService {
	public AmazonInvoice saveRecord(AmazonInvoice amazonInvoice);
	public AmazonInvoice updateRecord(AmazonInvoice amazonInvoice,int CustomerId);
	public void deleteRecord(int cid);
	public AmazonInvoice getOneRecord(int cid);
	public List<AmazonInvoice>getAllRecord();
	
	

}
