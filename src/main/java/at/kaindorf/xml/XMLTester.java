package at.kaindorf.xml;

import jakarta.xml.bind.JAXB;

import java.io.File;
import java.nio.file.Paths;

/**
 * <h3>Created by IntelliJ IDEA.</h3><br>
 * <b>Project:</b> XML-Test<br>
 * <b>User:</b> Simon Schoeggler<br>
 * <b>Date:</b> 22. März 2023<br>
 * <b>Time:</b> 08:16<br>
 */

public class XMLTester {
    public static void main(String[] args) {
        File file =
                Paths.get(System.getProperty("user.dir"), "src", "main", "resources", "customersRes.xml")
                        .toFile();
        Customers customers = JAXB.unmarshal(file, Customers.class);
        customers.getCustomers().forEach(System.out::println);

        File file2 =
                Paths.get(System.getProperty("user.dir"), "src", "main", "resources", "customersRes2.xml")
                        .toFile();
        //JAXB.marshal(customers, System.out);
        JAXB.marshal(customers, file2);
    }
}
