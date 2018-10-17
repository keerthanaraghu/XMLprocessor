package com.xml.procesor;

import java.io.File;
import java.io.StringReader;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import com.xml.vo.Employee;

public class XmlProcessor {
	
	public void convertToXml(Employee employee) throws JAXBException {
		JAXBContext jaxbContext = JAXBContext.newInstance(Employee.class);
        Marshaller marshaller = jaxbContext.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        marshaller.marshal(employee, new File("employee.xml"));
	}
	
	
	
	
	
	public Employee convertToObject(String xml) throws JAXBException {
		JAXBContext jaxbContext = JAXBContext.newInstance(Employee.class);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        StringReader reader = new StringReader(xml);
        Employee employee = (Employee) unmarshaller.unmarshal(reader);
		return employee;
		
	}

}
