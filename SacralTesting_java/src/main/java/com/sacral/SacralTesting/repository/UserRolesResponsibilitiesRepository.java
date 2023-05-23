package com.sacral.SacralTesting.repository;

import org.springframework.data.repository.CrudRepository;

public interface UserRolesResponsibilitiesRepository extends CrudRepository<UserRolesResponsibilities, Long> {

    // Lead generation, creation, proposal, and quotation generation
    List<UserRolesResponsibilities> findByLeadGenerationProposalQuotationGeneration(String leadGenerationProposalQuotationGeneration);

    // Configure master policies, map units, underwrite policies, manage reinsurance, issue policy bonds, collect stamp duty, and generate reports
    List<UserRolesResponsibilities> findByConfigureMasterPoliciesReinsurance(String configureMasterPoliciesReinsurance);

    // Approve deviations in underwriting, reinsurance, and statutory reports
    List<UserRolesResponsibilities> findByApproveDeviationsUnderwritingReinsurance(String approveDeviationsUnderwritingReinsurance);

    // Make all approval decisions pertaining to deviations, underwriting pricing, reinsurance, delayed claims, new product configuration, unit code, ZO code creation, scheme-wise interest tables, premium rate tables, and centralized collection and payment-related activities
    List<UserRolesResponsibilities> findByApprovalDecisionsDeviationsUnderwritingPricingReinsurance(
            String approvalDecisionsDeviationsUnderwritingPricingReinsurance);

    // Perform valuations
    List<UserRolesResponsibilities> findByPerformValuations(String performValuations);

    // Make pricing decisions
    List<UserRolesResponsibilities> findByMakePricingDecisions(String makePricingDecisions);

    // Make underwriting pricing decisions and decisions related to underwriting
    List<UserRolesResponsibilities> findByMakeUnderwritingPricingDecisions(String makeUnderwritingPricingDecisions);

    // Manage member data, payments, claim forms, changes in scheme rules, consent for renewal, member addition, request for conversion, withdrawal, surrender, member-level payments, TDS details, GST, funding based on valuations, and non-monetary services
    List<UserRolesResponsibilities> findByManageMemberDataPayments(String manageMemberDataPayments);

    // Acknowledge receipt of claim forms
    List<UserRolesResponsibilities> findByAcknowledgeReceiptOfClaimForms(String acknowledgeReceiptOfClaimForms);

    // Update leads, coordinate with customers on document collection, and acknowledge commission receipts
    List<UserRolesResponsibilities> findByUpdateLeadsDocumentCollection(String updateLeadsDocumentCollection);

}