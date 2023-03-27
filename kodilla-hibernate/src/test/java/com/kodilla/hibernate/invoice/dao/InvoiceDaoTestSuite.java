package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    private InvoiceDao invoiceDao;

    @Test
    public void testInvoiceDaoSave() {

        Invoice invoice = new Invoice("1");
        Product product1 = new Product("Product1");
        Product product2 = new Product("Product2");

        Item item1 = new Item(product1,new BigDecimal(100),10,new BigDecimal(20));
        Item item2 = new Item(product1,new BigDecimal(150),30,new BigDecimal(50));

        item1.setProduct(product1);
        item2.setProduct(product2);

        product1.getItems().add(item1);
        product2.getItems().add(item2);

        item1.setInvoice(invoice);
        item2.setInvoice(invoice);

        invoice.getItems().add(item1);
        invoice.getItems().add(item2);

        invoiceDao.save(invoice);
        int invoiceId = invoice.getId();

        assertNotEquals(0, invoiceId);

        invoiceDao.deleteById(invoiceId);
    }
}
