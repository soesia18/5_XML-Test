package at.kaindorf.xml;

import jakarta.xml.bind.annotation.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

/**
 * <h3>Created by IntelliJ IDEA.</h3><br>
 * <b>Project:</b> XML-Test<br>
 * <b>User:</b> Simon Schoeggler<br>
 * <b>Date:</b> 22. März 2023<br>
 * <b>Time:</b> 08:19<br>
 */

@XmlRootElement(name = "customers")
@XmlAccessorType(XmlAccessType.FIELD)
@Getter
@Setter
public class Customers {
    @XmlElement(name = "customer")
    private List<Customer> customers = new ArrayList<>();
}
