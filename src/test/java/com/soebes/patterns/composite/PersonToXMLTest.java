package com.soebes.patterns.composite;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import com.soebes.patterns.composite.Person;
import com.soebes.patterns.composite.PersonToXML;

/**
 * See http://www.industriallogic.com/xp/refactoring/implicitTreeWithComposite.
 * html
 * 
 * @author Karl Heinz Marbaise
 * 
 */
public class PersonToXMLTest {

  private Person person;

  @Test
  public void firstTest() {

    person = new Person();
    person.setAlter(23);
    person.setName("DerName");
    person.setVorname("VornameDer");

    PersonToXML personToXml = new PersonToXML(person);
    String xml = personToXml.toXML();
    assertEquals(xml,
        "<Person><Vorname>VornameDer</Vorname><Name>DerName</Name></Person>");
  }
}
