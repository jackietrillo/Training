mport java.util.ArrayList;

public class CustomerDriver {

	public static void main(String[] args)
	{
		ArrayList<Customer> customers = new ArrayList<Customer>();

		Customer customer1 = new Customer("Conner Cheng");
		Invoice invoice = new Invoice("I0001", 20.00);
		customer.addInvoice(invoice);
		
		customers.add(customer1);

		System.out.println(customer.toString() );
		System.out.println(customer.getTotalDue());

		
	}

}