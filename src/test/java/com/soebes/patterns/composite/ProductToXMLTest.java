package com.soebes.patterns.composite;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import com.soebes.patterns.composite.Product.Color;

/**
 * See http://www.industriallogic.com/xp/refactoring/implicitTreeWithComposite.
 * html
 * 
 * @author Karl Heinz Marbaise
 * 
 */
public class ProductToXMLTest {

    private Product product;

    @Test
    public void firstTest() {

        product = new Product();
        product.setColor(Color.BLUE);
        product.setId(20L);
        Price price = new Price("EUR", 20.56f);
        product.setPrice(price);
        product.setSize(200);
        product.setName("FirstProduct");

        ProductToXML productToXml = new ProductToXML(product);
        String xml = productToXml.toXML();
        assertEquals(xml,
                "<Product id=\"20\" color=\"BLUE\" size=\"200\"><Price currency=\"EUR\">20.56</Price><Name>FirstProduct</Name></Product>");
    }
}
