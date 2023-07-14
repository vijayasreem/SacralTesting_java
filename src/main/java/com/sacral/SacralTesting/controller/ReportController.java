package com.sacral.SacralTesting.controller;

import com.sacral.SacralTesting.repository.ReportRepository;
import com.sacral.SacralTesting.service.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReportController {

    @Autowired
    private ReportRepository reportRepository;

    @Autowired
    private ReportService reportService;

    @GetMapping("/report/columns/filters/sortingOptions")
    public Report findByColumnsAndFiltersAndSortingOptions(String columns, String filters, String sortingOptions) {
        return reportService.findByColumnsAndFiltersAndSortingOptions(columns, filters, sortingOptions);
    }

    @GetMapping("/report/columns/filters/sortingOptions/exists")
    public boolean existsByColumnsAndFiltersAndSortingOptions(String columns, String filters, String sortingOptions) {
        return reportService.existsByColumnsAndFiltersAndSortingOptions(columns, filters, sortingOptions);
    }

    @PostMapping("/report/template/delete")
    public void deleteByColumnsAndFiltersAndSortingOptions(String columns, String filters, String sortingOptions) {
        reportService.deleteByColumnsAndFiltersAndSortingOptions(columns, filters, sortingOptions);
    }

    @PostMapping("/report/save")
    public Report saveReportTemplate(@RequestBody Report reportTemplate) {
        return reportService.saveReportTemplate(reportTemplate);
    }

    @GetMapping("/report/excel")
    public byte[] generateReportInExcelFormat(Report report) {
        return reportService.generateReportInExcelFormat(report);
    }

    @GetMapping("/report/mobile")
    public String generateReportInMobileAppFormat(Report report) {
        return reportService.generateReportInMobileAppFormat(report);
    }

    @PostMapping("/report/timely")
    public void generateReportInTimelyManner(@RequestBody Report report) {
        reportService.generateReportInTimelyManner(report);
    }

    @GetMapping("/report/accuracy")
    public boolean validateReportAccuracyAndUpToDate(Report report) {
        return reportService.validateReportAccuracyAndUpToDate(report);
    }

    @GetMapping("/report/secure")
    public boolean checkIfReportSecureAndAccessibleToAuthorizedUsers(Report report) {
        return reportService.checkIfReportSecureAndAccessibleToAuthorizedUsers(report);
    }

    @PostMapping("/report/interpret")
    public void makeReportEasyToUnderstandAndInterpret(@RequestBody Report report) {
        reportService.makeReportEasyToUnderstandAndInterpret(report);
    }
}