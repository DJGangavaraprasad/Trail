package com.dj.hospitaldatamanagement;

import com.dj.hospitaldatamanagement.Repository.PersonRepository;
import com.dj.hospitaldatamanagement.entity.PersonEntity;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		try {
			System.out.println("Hello World!");
			PersonEntity n = new PersonEntity();
			n.setId(1);
			n.setName("dj");
			n.setAge(23);
			n.setAddress("bangalore");
			n.setEmail("dj@gmail.com");
			PersonRepository c = new PersonRepository();
			c.SavePerson(n);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
