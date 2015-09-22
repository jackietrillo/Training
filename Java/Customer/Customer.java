/**
 * @(#)Customer.java
 *
 *
 * @author 
 * @version 1.00 2015/9/15
 */

import java.util.ArrayList;

public class Customer {
	private String name;
	private ArrayList<Init>;
	private int invoiceCounter;
	
   	public Customer (){   
		this.name = "";
		this.invoiceCounter = 0;
   	}
		
    public Customer (String name) {
		this.name = name;
		this.invoices = new ArrayList<Invoice>();
	}
	
	public Customer (String name, Invoice invoice) {
		this.name = name;
		this.invoices = new ArrayList<Invoice>();
		this.invoices.add(invoice);
	}
		
	public void setName(String name){
		this.name = name;
	}
	
	public ArrayList<Invoice> getInvoices(){
		return this.invoices;
	}
	
	public String toString(){
		String output = String.format("Customer's name is %s.\n", name);
		output += String.format("Customer has %d invoices", this.invoices.size())
		for(int i = 0; i < obj.length; i++){
			
		}
	}
	
	public double getTotalDue(){
		double sum = 0;
 		for(Invoice invoice : this.invoices){          
 				sum += invoice.getAmountDue();
 		}
 		return sum;
	}
	
	public void addInvoice(Invoice invoice){
		this.invoices.add(invoice);
	}
	
}