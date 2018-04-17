package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    InvoiceDao invoiceDao;

    @Autowired
    ProductDao productDao;

    @Test
    public void testInvoiceDaoSave() {
        //Given
        Product x = new Product("X");
        Item item1 = new Item(x, new BigDecimal(35), 10);
        Item item2 = new Item(x, new BigDecimal(35), 15);
        Invoice invoice = new Invoice("1.2018");
        productDao.save(x);
        x.getItems().add(item1);
        x.getItems().add(item2);
        invoice.getItems().add(item1);
        invoice.getItems().add(item2);
        item1.setProduct(x);
        item2.setProduct(x);
        item1.setInvoice(invoice);
        item2.setInvoice(invoice);

        //When
        invoiceDao.save(invoice);
        int id = invoice.getId();

        //Then
        Assert.assertNotEquals(0, id);

        //CleanUp
        try {
            invoiceDao.delete(id);
        } catch (Exception e) {
            //do nothing
        }
    }
}
