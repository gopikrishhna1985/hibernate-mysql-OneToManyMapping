package com.hibernate.startup;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {
		Employee empObj = new Employee();
		empObj.setName("John");

		Address addr1 = new Address();
		addr1.setCity("NewYork");
		addr1.setState("NY");
		addr1.setStreet("Lexington Ave");
		addr1.setZipCode("10023");
		empObj.getAddressSet().add(addr1);

		Address addr2 = new Address();
		addr2.setCity("NewYork");
		addr2.setState("NY");
		addr2.setStreet("Madison Ave");
		addr2.setZipCode("91111");
		empObj.getAddressSet().add(addr2);

		Address addr3 = new Address();
		addr3.setCity("Los Angeles");
		addr3.setState("CA");
		addr3.setStreet("Hollywood Ave");
		addr3.setZipCode("06822");
		empObj.getAddressSet().add(addr3);

		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(empObj);
		// session.save(student2);
		session.getTransaction().commit();
		session.close();
	}
}
