package coffeeshopdemo.concretes;

import coffeeshopdemo.abstracts.CustomerCheckService;
import coffeeshopdemo.entities.Customer;

public class CustomerCheckManager implements CustomerCheckService {

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		return false;
	}

}
