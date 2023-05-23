@Service
public class BatchProcessService {

    private BatchProcessRepository batchProcessRepository;

    public BatchProcessService(BatchProcessRepository batchProcessRepository) {
        this.batchProcessRepository = batchProcessRepository;
    }

    // Bulk Claims Settlement
    public void acceptBulkClaimsSettlementRequests(Annexure annexure) {
        batchProcessRepository.acceptBulkClaimsSettlementRequests(annexure);
    }
    public void validateInputFileFormat(Annexure annexure) {
        batchProcessRepository.validateInputFileFormat(annexure);
    }
    public void processClaimsSettlementRequests(Annexure annexure) {
        batchProcessRepository.processClaimsSettlementRequests(annexure);
    }
    public void generateClaimsSettlementReport() {
        batchProcessRepository.generateClaimsSettlementReport();
    }

    // Bulk Data Upload for New Business and Renewal
    public void allowBulkDataUpload(Annexure annexure) {
        batchProcessRepository.allowBulkDataUpload(annexure);
    }
    public void validateDataUploadFileFormat(Annexure annexure) {
        batchProcessRepository.validateDataUploadFileFormat(annexure);
    }
    public void createNewBusinessRecords(Annexure annexure) {
        batchProcessRepository.createNewBusinessRecords(annexure);
    }
    public void updateRelevantFields(Annexure annexure) {
        batchProcessRepository.updateRelevantFields(annexure);
    }
    public void generateDataUploadReport() {
        batchProcessRepository.generateDataUploadReport();
    }

    // Bulk Data Movement within LIC (Transfer in –Out Cases / Conversion)
    public void allowBulkDataMovement(Annexure annexure) {
        batchProcessRepository.allowBulkDataMovement(annexure);
    }
    public void validateDataMovementFileFormat(Annexure annexure) {
        batchProcessRepository.validateDataMovementFileFormat(annexure);
    }
    public void updateRelevantFieldsInSystem(Annexure annexure) {
        batchProcessRepository.updateRelevantFieldsInSystem(annexure);
    }
    public void generateDataMovementReport() {
        batchProcessRepository.generateDataMovementReport();
    }

}