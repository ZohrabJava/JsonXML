import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {


        List<PhoneNumber> phoneNumbers = new ArrayList<PhoneNumber>();
        phoneNumbers.add(new PhoneNumber("Home", "+37477555688"));

        Employee employee = new Employee("Ando", "Hovhannisyan",
                25, new Address("Yerevan", "Armenia", "Sayran", "2510"),
                phoneNumbers);
//        ConvertorJSON.writeJson(employee);
//        System.out.println(ConvertorJSON.readJson());
//        ConvertorXml.writeXML(employee);
        System.out.println(ConvertorXml.readXML());
    }
}
