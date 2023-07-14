package com.sacral.SacralTesting.repository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ReportRepository extends JpaRepository<Report, Long> {
    Report findByColumnsAndFiltersAndSortingOptions(String columns, String filters, String sortingOptions);

    boolean existsByColumnsAndFiltersAndSortingOptions(String columns, String filters, String sortingOptions);

    void deleteByColumnsAndFiltersAndSortingOptions(String columns, String filters, String sortingOptions);

    Report saveReportTemplate(Report reportTemplate);

    byte[] generateReportInExcelFormat(Report report);

    String generateReportInMobileAppFormat(Report report);

    void generateReportInTimelyManner(Report report);

    boolean validateReportAccuracyAndUpToDate(Report report);

    boolean checkIfReportSecureAndAccessibleToAuthorizedUsers(Report report);

    void makeReportEasyToUnderstandAndInterpret(Report report);
}