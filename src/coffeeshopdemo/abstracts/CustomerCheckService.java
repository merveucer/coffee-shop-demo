package coffeeshopdemo.abstracts;

import coffeeshopdemo.entities.Customer;

public interface CustomerCheckService {
	
	boolean checkIfRealPerson(Customer customer);

}
