package xmlparser;

import java.io.FileNotFoundException;

import javax.xml.bind.JAXBException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.xml.procesor.XmlProcessor;
import com.xml.vo.Department;
import com.xml.vo.Employee;

public class FeedProcessorTest {
	
	Employee employee;
	String xml;

	@Before
	public void setUp() {
			Department department = new Department("1", "HR");
			employee=new Employee("sample", department,"raghu","111","raman");

			 xml = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n" + 
					"<employee type=\"sample\">\n" + 
					"    <department>\n" + 
					"        <identifier>1001</identifier>\n" + 
					"        <name>Finance</name>\n" + 
					"    </department>\n" + 
					"    <firstName>raghu</firstName>\n" + 
					"    <eid>11100</eid>\n" + 
					"    <lastName>raman</lastName>\n" + 
					"</employee>";
	}

	@After
	public void tearDown() {
		employee = null;
	}

	@Test
	public void testObjectToXml() throws JAXBException, FileNotFoundException {
		XmlProcessor xmlProcessor = new XmlProcessor();
		xmlProcessor.convertToXml(employee);
	}
	
	@Test
	public void testXmlToObject() throws JAXBException {
		XmlProcessor xmlProcessor = new XmlProcessor();
		System.out.println(xmlProcessor.convertToObject(xml));
		
	}
	


}
