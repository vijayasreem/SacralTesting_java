package com.sacral.SacralTesting.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class UserRolesResponsibilities {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Lead generation, creation, proposal, and quotation generation
    private String leadGenerationProposalQuotationGeneration;

    // Configure master policies, map units, underwrite policies, manage reinsurance, issue policy bonds, collect stamp duty, and generate reports
    private String configureMasterPoliciesReinsurance;

    // Approve deviations in underwriting, reinsurance, and statutory reports
    private String approveDeviationsUnderwritingReinsurance;

    // Make all approval decisions pertaining to deviations, underwriting pricing, reinsurance, delayed claims, new product configuration, unit code, ZO code creation, scheme-wise interest tables, premium rate tables, and centralized collection and payment-related activities
    private String approvalDecisionsDeviationsUnderwritingPricingReinsurance;

    // Perform valuations
    private String performValuations;

    // Make pricing decisions
    private String makePricingDecisions;

    // Make underwriting pricing decisions and decisions related to underwriting
    private String makeUnderwritingPricingDecisions;

    // Manage member data, payments, claim forms, changes in scheme rules, consent for renewal, member addition, request for conversion, withdrawal, surrender, member-level payments, TDS details, GST, funding based on valuations, and non-monetary services
    private String manageMemberDataPayments;

    // Acknowledge receipt of claim forms
    private String acknowledgeReceiptOfClaimForms;

    // Update leads, coordinate with customers on document collection, and acknowledge commission receipts
    private String updateLeadsDocumentCollection;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLeadGenerationProposalQuotationGeneration() {
        return leadGenerationProposalQuotationGeneration;
    }

    public void setLeadGenerationProposalQuotationGeneration(String leadGenerationProposalQuotationGeneration) {
        this.leadGenerationProposalQuotationGeneration = leadGenerationProposalQuotationGeneration;
    }

    public String getConfigureMasterPoliciesReinsurance() {
        return configureMasterPoliciesReinsurance;
    }

    public void setConfigureMasterPoliciesReinsurance(String configureMasterPoliciesReinsurance) {
        this.configureMasterPoliciesReinsurance = configureMasterPoliciesReinsurance;
    }

    public String getApproveDeviationsUnderwritingReinsurance() {
        return approveDeviationsUnderwritingReinsurance;
    }

    public void setApproveDeviationsUnderwritingReinsurance(String approveDeviationsUnderwritingReinsurance) {
        this.approveDeviationsUnderwritingReinsurance = approveDeviationsUnderwritingReinsurance;
    }

    public String getApprovalDecisionsDeviationsUnderwritingPricingReinsurance() {
        return approvalDecisionsDeviationsUnderwritingPricingReinsurance;
    }

    public void setApprovalDecisionsDeviationsUnderwritingPricingReinsurance(
            String approvalDecisionsDeviationsUnderwritingPricingReinsurance) {
        this.approvalDecisionsDeviationsUnderwritingPricingReinsurance = approvalDecisionsDeviationsUnderwritingPricingReinsurance;
    }

    public String getPerformValuations() {
        return performValuations;
    }

    public void setPerformValuations(String performValuations) {
        this.performValuations = performValuations;
    }

    public String getMakePricingDecisions() {
        return makePricingDecisions;
    }

    public void setMakePricingDecisions(String makePricingDecisions) {
        this.makePricingDecisions = makePricingDecisions;
    }

    public String getMakeUnderwritingPricingDecisions() {
        return makeUnderwritingPricingDecisions;
    }

    public void setMakeUnderwritingPricingDecisions(String makeUnderwritingP