package com.iqmsoft.jaxb.sample;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.Date;
import java.util.Random;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Setter
@XmlRootElement
public class Person implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@XmlElement
    private Long id;

    @XmlElement
    private int version;

    @Getter private String firstName;

    @XmlElement
    private String lastName;

    @XmlElement
    private Date birthDate;

    public static Person randomContact() {
        Random random = new Random();
        return new Person(random.nextLong(), random.nextInt(), "name-" + random.nextLong(), "surname-" + random.nextLong(), new Date());
    }
}
