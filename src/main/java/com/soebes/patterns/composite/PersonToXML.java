package com.soebes.patterns.composite;

public class PersonToXML {

    private StringBuilder xml;

    private Person person;

    public PersonToXML(Person person) {
        super();
        this.xml = new StringBuilder();
        this.person = person;
    }

    public String toXML() {
        xml.append("<Person>");
        xml.append("<Vorname>");
        xml.append(person.getVorname());
        xml.append("</Vorname>");
        xml.append("<Name>");
        xml.append(person.getName());
        xml.append("</Name>");
        xml.append("</Person>");
        return xml.toString();
    }

}
