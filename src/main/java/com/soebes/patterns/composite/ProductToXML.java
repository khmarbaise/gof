package com.soebes.patterns.composite;

public class ProductToXML extends BaseToXML {

  private StringBuilder xml;

  private Product product;

  public ProductToXML(Product product) {
    super();
    this.xml = new StringBuilder();
    this.product = product;
  }

  public String toXML() {
    xml.append("<Product");
    xml.append(" id=\"" + product.getId() + "\"");
    xml.append(" color=\"" + product.getColor() + "\"");
    xml.append(" size=\"" + product.getSize() + "\"");
    xml.append(">");
    xml.append("<Price");
    xml.append(" currency=\"" + product.getPrice().getCurrency() + "\">");
    xml.append(product.getPrice().getPriceValue());
    xml.append("</Price>");
    xml.append("<Name>" + product.getName() + "</Name>");
    xml.append("</Product>");
    return xml.toString();
  }

}
