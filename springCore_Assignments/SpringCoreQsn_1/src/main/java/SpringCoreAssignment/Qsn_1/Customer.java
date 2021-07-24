package SpringCoreAssignment.Qsn_1;

public class Customer {
	private int customerId;
	private String customerName;
	private long customerContact;
	private Address customerAddress;
	
	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public long getCustomerContact() {
		return customerContact;
	}

	public void setCustomerContact(long customerContact) {
		this.customerContact = customerContact;
	}

	public Address getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(Address customerAddress) {
		this.customerAddress = customerAddress;
	}

	public void display(){
		System.out.println("Customer Details = customerid=" + customerId + "\ncustomername=" + customerName + 
				            "\ncustomercontact="+ customerContact);
		System.out.println("Address =Street:"+getCustomerAddress().getStreet()+"\nCity:"+getCustomerAddress().getCity()+
				            "\nState:"+getCustomerAddress().getState()+"\nZipCode:"+getCustomerAddress().getZip()+
				            "\n Country:" +getCustomerAddress().getCountry());
				}
			}
