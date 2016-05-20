package hello;

import static org.junit.Assert.*;

import org.junit.Test;

public class PersonTest {

	@Test
	public void test_create_person_instance() {
		Person person = new Person();
		person.setFirstName("Joe");
		person.setLastName("Soap");
		
		assertEquals("Expect first name to be Joe", person.getFirstName(), "Joe");
		assertEquals("Expect last name to be Soap", person.getLastName(), "Soap");
	}

}
