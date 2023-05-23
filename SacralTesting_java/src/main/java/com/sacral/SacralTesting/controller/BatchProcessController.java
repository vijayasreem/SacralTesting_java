package com.sacral.SacralTesting.controller;

import Annexure;
import com.sacral.SacralTesting.service.BatchProcessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/batchProcess")
public class BatchProcessController {

    private BatchProcessService batchProcessService;

    @Autowired
    public BatchProcessController(BatchProcessService batchProcessService) {
        this.batchProcessService = batchProcessService;
    }

    // Bulk Claims Settlement
    @RequestMapping("/acceptBulkClaimsSettlementRequests")
    public void acceptBulkClaimsSettlementRequests(Annexure annexure) {
        batchProcessService.acceptBulkClaimsSettlementRequests(annexure);
    }
    
    @RequestMapping("/validateInputFileFormat")
    public void validateInputFileFormat(Annexure annexure) {
        batchProcessService.validateInputFileFormat(annexure);
    }
    
    @RequestMapping("/processClaimsSettlementRequests")
    public void processClaimsSettlementRequests(Annexure annexure) {
        batchProcessService.processClaimsSettlementRequests(annexure);
    }
    
    @RequestMapping("/generateClaimsSettlementReport")
    public void generateClaimsSettlementReport() {
        batchProcessService.generateClaimsSettlementReport();
    }
    
    // Bulk Data Upload for New Business and Renewal
    @RequestMapping("/allowBulkDataUpload")
    public void allowBulkDataUpload(Annexure annexure) {
        batchProcessService.allowBulkDataUpload(annexure);
    }
    
    @RequestMapping("/validateDataUploadFileFormat")
    public void validateDataUploadFileFormat(Annexure annexure) {
        batchProcessService.validateDataUploadFileFormat(annexure);
    }
    
    @RequestMapping("/createNewBusinessRecords")
    public void createNewBusinessRecords(Annexure annexure) {
        batchProcessService.createNewBusinessRecords(annexure);
    }
    
    @RequestMapping("/updateRelevantFields")
    public void updateRelevantFields(Annexure annexure) {
        batchProcessService.updateRelevantFields(annexure);
    }
    
    @RequestMapping("/generateDataUploadReport")
    public void generateDataUploadReport() {
        batchProcessService.generateDataUploadReport();
    }
    
    // Bulk Data Movement within LIC (Transfer in –Out Cases / Conversion)
    @RequestMapping("/allowBulkDataMovement")
    public void allowBulkDataMovement(Annexure annexure) {
        batchProcessService.allowBulkDataMovement(annexure);
    }
    
    @RequestMapping("/validateDataMovementFileFormat")
    public void validateDataMovementFileFormat(Annexure annexure) {
        batchProcessService.validateDataMovementFileFormat(annexure);
    }
    
    @RequestMapping("/updateRelevantFieldsInSystem")
    public void updateRelevantFieldsInSystem(Annexure annexure) {
        batchProcessService.updateRelevantFieldsInSystem(annexure);
    }
    
    @RequestMapping("/generateDataMovementReport")
    public void generateDataMovementReport() {
        batchProcessService.generateDataMovementReport();
    }
}