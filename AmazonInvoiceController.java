package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.AmazonInvoice;
import com.example.service.AmazonInvoiceService;

@RestController
public class AmazonInvoiceController {
	 @Autowired
	    private AmazonInvoiceService amazonInvoiceService;

	    @PostMapping("/save")
	    private String saveData(@RequestBody AmazonInvoice amazonInvoice) {
	        AmazonInvoice savedInvoice = amazonInvoiceService.saveRecord(amazonInvoice);

	        if (savedInvoice != null) {
	        	//savedInvoice.tostring we get in postman datasaved successfully after total inserted data
	            return "Data saved successfully: " + savedInvoice.toString();
	        } else {
	            return "Data failed to save";
	        }
	    }
	    @DeleteMapping("delete/{CustomerId}")
	    public void delete(@PathVariable int CustomerId)
	    {
	    	amazonInvoiceService.deleteRecord(CustomerId);
	    	
	    }
	    @GetMapping("/get/{CustomerId}")
	    public AmazonInvoice getOne(@PathVariable int CustomerId)
	    {
	    	
	    	 AmazonInvoice get=amazonInvoiceService.getOneRecord(CustomerId);
	    	 return get;
	    }
	@GetMapping("/getAll")
	public List<AmazonInvoice> getAll()
	{
		List<AmazonInvoice> getAll=amazonInvoiceService.getAllRecord();
		return  getAll;
	}
	@PutMapping("/update/{CustomerId}")
	public AmazonInvoice update(@RequestBody AmazonInvoice amazonInvoice,@PathVariable int CustomerId) {
	
		return amazonInvoice ;
		
	}
	
	

}
