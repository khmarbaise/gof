package com.soebes.patterns.composite;

public class BaseToXML {

  private StringBuilder xml;

  public BaseToXML() {
    xml = new StringBuilder();
  }

  protected void addStartTag(String tag) {
    xml.append("<");
    xml.append(tag);
    xml.append(">");
  }

  protected void addEndTag(String tag) {
    xml.append("</");
    xml.append(tag);
    xml.append(">");
  }

  protected void addTagWithValue(String tag, String value) {
    addStartTag(tag);
    xml.append(value);
    addEndTag(tag);
  }

}
