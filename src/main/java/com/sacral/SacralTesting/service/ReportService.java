package com.sacral.SacralTesting.service;

import com.sacral.SacralTesting.repository.ReportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReportService {

    @Autowired
    private ReportRepository reportRepository;

    public Report findByColumnsAndFiltersAndSortingOptions(String columns, String filters, String sortingOptions) {
        return reportRepository.findByColumnsAndFiltersAndSortingOptions(columns, filters, sortingOptions);
    }

    public boolean existsByColumnsAndFiltersAndSortingOptions(String columns, String filters, String sortingOptions) {
        return reportRepository.existsByColumnsAndFiltersAndSortingOptions(columns, filters, sortingOptions);
    }

    public void deleteByColumnsAndFiltersAndSortingOptions(String columns, String filters, String sortingOptions) {
        reportRepository.deleteByColumnsAndFiltersAndSortingOptions(columns, filters, sortingOptions);
    }

    public Report saveReportTemplate(Report reportTemplate) {
        return reportRepository.saveReportTemplate(reportTemplate);
    }

    public byte[] generateReportInExcelFormat(Report report) {
        return reportRepository.generateReportInExcelFormat(report);
    }

    public String generateReportInMobileAppFormat(Report report) {
        return reportRepository.generateReportInMobileAppFormat(report);
    }

    public void generateReportInTimelyManner(Report report) {
        reportRepository.generateReportInTimelyManner(report);
    }

    public boolean validateReportAccuracyAndUpToDate(Report report) {
        return reportRepository.validateReportAccuracyAndUpToDate(report);
    }

    public boolean checkIfReportSecureAndAccessibleToAuthorizedUsers(Report report) {
        return reportRepository.checkIfReportSecureAndAccessibleToAuthorizedUsers(report);
    }

    public void makeReportEasyToUnderstandAndInterpret(Report report) {
        reportRepository.makeReportEasyToUnderstandAndInterpret(report);
    }
}