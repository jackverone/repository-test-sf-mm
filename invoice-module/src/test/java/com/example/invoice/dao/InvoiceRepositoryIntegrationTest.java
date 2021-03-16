package com.example.invoice.dao;

import com.example.invoice.dao.entity.InvoiceEntity;
import com.example.invoice.dao.repository.InvoiceRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class InvoiceRepositoryIntegrationTest {

    private static final int INVOICE_LIST_SIZE_1 = 1;
    private static final String INVOICE_NAME_IT_SERVICES = "IT Services";

    @Autowired
    private InvoiceRepository invoiceRepository;

    @Test
    void givenEntityAndRepository_whenSave_thenEntitySavedAndFindAllEqualsOne() {
        // given
        InvoiceEntity invoiceEntity = new InvoiceEntity();
        invoiceEntity.setName(INVOICE_NAME_IT_SERVICES);

        // when
        InvoiceEntity savedInvoiceEntity = invoiceRepository.save(invoiceEntity);
        List<InvoiceEntity> invoiceEntities = invoiceRepository.findAll();

        // then
        assertAll(
                () -> assertNotNull(savedInvoiceEntity, "Saved InvoiceEntity is null"),
                () -> assertNotNull(savedInvoiceEntity.getId(), "Saved InvoiceEntity ID is null"),
                () -> assertEquals(INVOICE_LIST_SIZE_1, invoiceEntities.size(), "InvoiceEntities size is not " + INVOICE_LIST_SIZE_1)
        );
    }

    @SpringBootApplication
    static class TestConfiguration {
    }
}