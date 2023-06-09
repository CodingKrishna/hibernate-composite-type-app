package com.pioneercoders.compositetype;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class App {

	public static void main(String[] args) {

		SessionFactory sessionFactory = HibenateUtils.getSessionFactory();
		Session session = sessionFactory.getCurrentSession();
		Transaction transaction =session.getTransaction();
		transaction.begin();
		
		EmployeeEntity employeeEntity = new EmployeeEntity();
		employeeEntity.setEmployeeName("Rama Krishna");
		employeeEntity.setAge(24);
		
		Address address = new Address();
		address.setCity("Bangalore");
		address.setState("Karnataka");
		address.setStreet("BTM");
		address.setZipcode("560029");
		
		employeeEntity.setAddress(address);

		session.save(employeeEntity);
		transaction.commit();
		
	}

}