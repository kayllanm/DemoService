package hello;

import static org.springframework.restdocs.hypermedia.HypermediaDocumentation.linkWithRel;
import static org.springframework.restdocs.hypermedia.HypermediaDocumentation.links;
import static org.springframework.restdocs.mockmvc.MockMvcRestDocumentation.document;
import static org.springframework.restdocs.mockmvc.MockMvcRestDocumentation.documentationConfiguration;
import static org.springframework.restdocs.mockmvc.RestDocumentationRequestBuilders.get;
import static org.springframework.restdocs.payload.PayloadDocumentation.fieldWithPath;
import static org.springframework.restdocs.payload.PayloadDocumentation.responseFields;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.junit.Assert.*;

import java.util.UUID;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.restdocs.RestDocumentation;
import org.springframework.restdocs.mockmvc.RestDocumentationResultHandler;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class) 
public class PersonTest {

	@Rule
    public RestDocumentation restDocumentation = new RestDocumentation("target/generated-snippets");

	@Autowired
	private WebApplicationContext context;
	private MockMvc mockMvc;
	

	@Test
	public void test_create_person_instance() {
		Person person = new Person();
		person.setFirstName("Joe");
		 person.setLastName("Soap");
		
		assertEquals("Expect first name to be Joe", person.getFirstName(), "Joe");
		 assertEquals("Expect last name to be Soap", person.getLastName(), "Soap");
	}

}
