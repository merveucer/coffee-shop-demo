package coffeeshopdemo;

import java.time.LocalDate;

import coffeeshopdemo.abstracts.BaseCustomerManager;
import coffeeshopdemo.adapters.MernisServiceAdapter;
import coffeeshopdemo.concretes.CustomerCheckManager;
import coffeeshopdemo.concretes.NeroCustomerManager;
import coffeeshopdemo.concretes.StarbucksCustomerManager;
import coffeeshopdemo.entities.Customer;

public class Main {

	public static void main(String[] args) {
		
		BaseCustomerManager customerManager1 = new NeroCustomerManager();
		customerManager1.save(new Customer(1, "Merve", "Üçer", LocalDate.of(1900, 1, 1), "11111111111"));
		
		BaseCustomerManager customerManager2 = new StarbucksCustomerManager(new CustomerCheckManager()); // Testing
		customerManager2.save(new Customer(1, "Merve", "Üçer", LocalDate.of(1900, 1, 1), "11111111111"));
		
		BaseCustomerManager customerManager3 = new StarbucksCustomerManager(new MernisServiceAdapter()); // Real Checking
		customerManager3.save(new Customer(1, "Merve", "Üçer", LocalDate.of(1900, 1, 1), "11111111111"));

	}

}
