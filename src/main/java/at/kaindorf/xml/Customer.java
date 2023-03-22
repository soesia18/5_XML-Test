package at.kaindorf.xml;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import lombok.*;

/**
 * <h3>Created by IntelliJ IDEA.</h3><br>
 * <b>Project:</b> XML-Test<br>
 * <b>User:</b> Simon Schoeggler<br>
 * <b>Date:</b> 22. März 2023<br>
 * <b>Time:</b> 08:18<br>
 */

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@XmlAccessorType(XmlAccessType.FIELD)
@ToString
public class Customer {
    @XmlAttribute(name = "id")
    private int id;
    @XmlElement(name = "customerName")
    private String name;
    @XmlElement(name = "customerAddress")
    private String address;
    @XmlElement(name = "sales")
    private double sales;
}
