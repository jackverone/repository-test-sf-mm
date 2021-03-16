package com.example.web.controller;

import com.example.invoice.service.InvoiceService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class InvoiceController {
    private final InvoiceService invoiceService;

    public InvoiceController(InvoiceService invoiceService) {
        this.invoiceService = invoiceService;
    }

    @GetMapping
    public String listView(ModelMap modelMap) {
        modelMap.addAttribute("invoices", invoiceService.list());
        return "invoices";
    }
}
