package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.AmazonInvoice;
import com.example.repo.AmazonInvoiceRepo;
@Service
public class AmazonInvoiceImpl  implements AmazonInvoiceService{

@Autowired
private AmazonInvoiceRepo  amazonInvoiceRepo; 

	
public AmazonInvoice  saveRecord(AmazonInvoice amazonInvoice) {
     //Calculate total and discount
    calculateTotalAndDiscount(amazonInvoice);
    // Save the invoice to the database
    return amazonInvoiceRepo.save(amazonInvoice);
}

// Other service methods...

private void calculateTotalAndDiscount(AmazonInvoice invoice) {
    // Example logic for calculating total and discount
    double total = invoice.getPrice() * invoice.getQunatity();

    // Apply a 10% discount for totals less than or equal to 2500
    // Apply a 30% discount for totals greater than 2500
    double discount;
    if (total <= 2500) {
        discount = total * 0.1;  // 10% discount
    } else {
        discount = total * 0.3;  // 30% discount
    }
    invoice.setTotal(total);
    invoice.setDiscount(discount);
  
    


}

	public AmazonInvoice updateRecord(AmazonInvoice amazonInvoice, int CustomerId) {
		// TODO Auto-generated method stub
		AmazonInvoice oldRecord=amazonInvoiceRepo.findById(CustomerId).get();
		oldRecord.setCname(amazonInvoice.getCname() );
		oldRecord.setCustomerId(amazonInvoice.getCustomerId());
		oldRecord.setMobilenumber(amazonInvoice.getMobilenumber());
		 //Calculate total and discount
	    calculateTotalAndDiscount(amazonInvoice);
	    // Save the invoice to the database
	    return amazonInvoiceRepo.save(oldRecord);
	}

	
	
	public void deleteRecord(int CustomerId) {
		amazonInvoiceRepo.deleteById(CustomerId);
		
		
		
	}

	@Override
	public AmazonInvoice getOneRecord(int CustomerId) {
     AmazonInvoice get= amazonInvoiceRepo.findById(CustomerId).get();
		return get;
		
	}

	@Override
	public List<AmazonInvoice> getAllRecord() {
		// TODO Auto-generated method stub
		List< AmazonInvoice> getAll=amazonInvoiceRepo.findAll();
		return  getAll;
	}

}
