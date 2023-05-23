@Repository
public interface BatchProcessRepository {

    // Bulk Claims Settlement
    void acceptBulkClaimsSettlementRequests(Annexure annexure);
    void validateInputFileFormat(Annexure annexure);
    void processClaimsSettlementRequests(Annexure annexure);
    void generateClaimsSettlementReport();

    // Bulk Data Upload for New Business and Renewal
    void allowBulkDataUpload(Annexure annexure);
    void validateDataUploadFileFormat(Annexure annexure);
    void createNewBusinessRecords(Annexure annexure);
    void updateRelevantFields(Annexure annexure);
    void generateDataUploadReport();

    // Bulk Data Movement within LIC (Transfer in –Out Cases / Conversion)
    void allowBulkDataMovement(Annexure annexure);
    void validateDataMovementFileFormat(Annexure annexure);
    void updateRelevantFieldsInSystem(Annexure annexure);
    void generateDataMovementReport();

}