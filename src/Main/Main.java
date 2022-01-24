package Main;

import Adapters.MernisServiceAdapter;

import java.time.LocalDate;

import Abstract.BaseCustomerManager;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) throws Exception {
		BaseCustomerManager neroCustomerManager = new NeroCustomerManager();
		BaseCustomerManager starbucksCustomerManager = new StarbucksCustomerManager(new MernisServiceAdapter());

		Customer customer1 = new Customer(1, "Duygu", "Kayým", LocalDate.parse("1997-08-18"), "12345678910");

		starbucksCustomerManager.save(customer1);
		System.out.println("----------------");
		neroCustomerManager.save(customer1);

	}

}
