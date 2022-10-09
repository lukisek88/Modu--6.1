package com.kodilla.hibernate.invoice.dao;

import static org.junit.jupiter.api.Assertions.*;
import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import javax.transaction.Transactional;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Transactional
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    InvoiceDao invoiceDao;

    @Test
    public void testInvoiceDaoSave() {
        //Given
        Invoice invoice = new Invoice("00002/10/2022");

        Product keyboard= new Product("keyboard");
        Product mouse  = new Product("mouse");
        Product camera = new Product("camera");

        Item itemKeyboard = new Item(keyboard, new BigDecimal(50), 2);
        Item itemMouse= new Item(mouse, new BigDecimal(40), 1);
        Item itemCamera = new Item(camera, new BigDecimal(250), 1);

        itemKeyboard.setInvoice(invoice);
        itemMouse.setInvoice(invoice);
        itemCamera.setInvoice(invoice);

        List<Item> items = new ArrayList<>();
        items.add(itemKeyboard);
        items.add(itemMouse);
        items.add(itemCamera);

        invoice.setItems(items);

        //When
        invoiceDao.save(invoice);
        int invoiceId = invoice.getId();
        int itemSize = invoice.getItems().size();

        Invoice invoiceReadFromDB = invoiceDao.findById(invoiceId);

        //Then
       assertEquals(invoiceId, invoiceReadFromDB.getId());
       assertEquals(3, itemSize);
       assertEquals(itemSize, invoiceReadFromDB.getItems().size());
    }
}