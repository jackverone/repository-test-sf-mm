package com.example.invoice.service;

import com.example.invoice.dao.entity.InvoiceEntity;
import com.example.invoice.dao.repository.InvoiceRepository;
import com.example.invoice.service.mapper.InvoiceMapper;
import com.example.invoice.web.dto.InvoiceDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InvoiceService {
    private final InvoiceRepository invoiceRepository;
    private final InvoiceMapper invoiceMapper;

    public InvoiceService(InvoiceRepository invoiceRepository, InvoiceMapper invoiceMapper) {
        this.invoiceRepository = invoiceRepository;
        this.invoiceMapper = invoiceMapper;
    }

    public List<InvoiceDto> list() {
        List<InvoiceEntity> invoiceEntities = invoiceRepository.findAll();
        return invoiceMapper.fromList(invoiceEntities);
    }
}
