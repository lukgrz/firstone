package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.transaction.Transactional;
import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    InvoiceDao invoiceDao;
    @Autowired
    ProductDao productDao;
    @Autowired
    ItemDao itemDao;

    @Test
    @Transactional
    @Rollback(value = false)
    void testInvoiceDao(){
        Product apple = new Product("Apple");
        Product banana = new Product("Banana");
        Product tomato = new Product("Tomato");

        Item item1 = new Item(new BigDecimal("2.75"),10);
        Item item2 = new Item(new BigDecimal("3.8"),6);
        Item item3 = new Item(new BigDecimal("10.0"),5);
        Item item4 = new Item(new BigDecimal("2.75"),5);

        Invoice invoice = new Invoice("123/2021");

        item1.setProduct(apple);
        item2.setProduct(banana);
        item3.setProduct(tomato);
        item4.setProduct(apple);

        invoice.getItems().add(item1);
        invoice.getItems().add(item2);
        invoice.getItems().add(item3);
        invoice.getItems().add(item4);

        //When
        productDao.save(banana);
        productDao.save(apple);
        productDao.save(tomato);
        itemDao.save(item1);
        itemDao.save(item2);
        itemDao.save(item3);
        itemDao.save(item4);
        invoiceDao.save(invoice);
        int result = invoice.getItems().size();
        int id = invoice.getId();
        //Then
        assertEquals(4,result);
        //CleanUp
        invoiceDao.deleteById(id);

    }
}
