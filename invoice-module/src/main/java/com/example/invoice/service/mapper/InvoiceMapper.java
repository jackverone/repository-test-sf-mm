package com.example.invoice.service.mapper;

import com.example.invoice.dao.entity.InvoiceEntity;
import com.example.invoice.web.dto.InvoiceDto;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class InvoiceMapper {
    public List<InvoiceDto> fromList(List<InvoiceEntity> invoiceEntities) {
        return new ArrayList<>();
    }
}
