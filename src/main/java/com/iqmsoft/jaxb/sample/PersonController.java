package com.iqmsoft.jaxb.sample;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value="/person")
public class PersonController {
    final Logger logger = LoggerFactory.getLogger(PersonController.class);

    @RequestMapping("/random")
    @ResponseBody
    public Person randomContact() {
    	Person p = Person.randomContact();
    	logger.info("Returning contact : {}", p);
        return p;
    }

    @RequestMapping(value = "/edit", method = RequestMethod.POST)
    @ResponseBody
    public Person editContact(@RequestBody Person contact) {
        logger.info("Received person: {}", contact);
        contact.setFirstName(contact.getFirstName() + "-EDITED");
        return contact;
    }
}
