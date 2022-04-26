import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ConvertorJSON {
    public static void writeJson(Employee employee) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            mapper.writerWithDefaultPrettyPrinter().writeValue(
                    new File("employee.json"), employee);
            System.out.println("Json written to the file");
        } catch (JsonGenerationException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (JsonMappingException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    public static Employee readJson() {
        ObjectMapper mapper = new ObjectMapper();
        Employee employee=null;
        try {
            BufferedReader br = new BufferedReader(
                    new FileReader("employee.json"));
            //convert the json string back to object
             employee = mapper.readValue(br, Employee.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return employee;
    }
}
