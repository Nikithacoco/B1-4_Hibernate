package com.tns.inheritance;

package com.tns.inheritance2;

import javax.persistence.EntityManager;

public class InheritanceTest {

	public static void main(String[] args) {
		EntityManagerFactory factory=Persistence.createEntityMangerFactory("JPA")
        EntityManagerem=factory.createEntityManager();
		em.getTransaction().begin();
		
		//create one Employee
		Employee emp=new Employee();
		emp.setName("Nikitha");
		emp.setSalary(25000);
		em.persist(emp);
		
		//create one manager
		Manager manager=new Manager ();
		manager.setName("Shiwani");
		manager.setSalary(70000);
		manager.setDeptName("program Specialist");
		em.persist(manager);
		
		em.getTransaction().commit();
		System.out.println("added one emp and one manager");
		em.close();
		factory.close();
		
	}


}
