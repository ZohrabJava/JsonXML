
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.Unmarshaller;


import java.io.*;
import java.util.*;

public class ConvertorXml {
    public static void writeXML(Employee employee){
        try {
            // create an instance of `JAXBContext`

            JAXBContext context = JAXBContext.newInstance(Employee.class);

            // create an instance of `Marshaller`
            Marshaller marshaller = context.createMarshaller();

            // enable pretty-print XML output
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            // create XML file
            File file = new File("employee.xml");

            // create `Book` object


            // convert book object to XML file
            marshaller.marshal(employee, file);

        } catch (JAXBException ex) {
            ex.printStackTrace();
        }
    }
    public static Employee readXML(){
        File xmlFile = new File("employee.xml");
        Employee employee=null;
        JAXBContext jaxbContext;
        try
        {
            jaxbContext = JAXBContext.newInstance(Employee.class);

            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();

             employee = (Employee) jaxbUnmarshaller.unmarshal(xmlFile);
             
        }
        catch (JAXBException e)
        {
            e.printStackTrace();
        }
        return employee;
    }
}
