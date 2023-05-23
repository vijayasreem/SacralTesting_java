ricingDecisions) {
        this.makeUnderwritingPricingDecisions = makeUnderwritingPricingDecisions;
    }

    public String getManageMemberDataPayments() {
        return manageMemberDataPayments;
    }

    public void setManageMemberDataPayments(String manageMemberDataPayments) {
        this.manageMemberDataPayments = manageMemberDataPayments;
    }

    public String getAcknowledgeReceiptOfClaimForms() {
        return acknowledgeReceiptOfClaimForms;
    }

    public void setAcknowledgeReceiptOfClaimForms(String acknowledgeReceiptOfClaimForms) {
        this.acknowledgeReceiptOfClaimForms = acknowledgeReceiptOfClaimForms;
    }

    public String getUpdateLeadsDocumentCollection() {
        return updateLeadsDocumentCollection;
    }

    public void setUpdateLeadsDocumentCollection(String updateLeadsDocumentCollection) {
        this.updateLeadsDocumentCollection = updateLeadsDocumentCollection;
    }

}

package com.sacral.SacralTesting.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sacral.SacralTesting.model.UserRolesResponsibilities;
import com.sacral.SacralTesting.service.UserRolesResponsibilitiesService;

@RestController
@RequestMapping("/user-roles-responsibilities")
public class UserRolesResponsibilitiesController {

    @Autowired
    private UserRolesResponsibilitiesService userRolesResponsibilitiesService;

    @GetMapping("/lead-generation-proposal-quotation-generation/{leadGenerationProposalQuotationGeneration}")
    public List<UserRolesResponsibilities> findByLeadGenerationProposalQuotationGeneration(@PathVariable String leadGenerationProposalQuotationGeneration) {
        return userRolesResponsibilitiesService.findByLeadGenerationProposalQuotationGeneration(leadGenerationProposalQuotationGeneration);
    }

    @GetMapping("/configure-master-policies-reinsurance/{configureMasterPoliciesReinsurance}")
    public List<UserRolesResponsibilities> findByConfigureMasterPoliciesReinsurance(@PathVariable String configureMasterPoliciesReinsurance) {
        return userRolesResponsibilitiesService.findByConfigureMasterPoliciesReinsurance(configureMasterPoliciesReinsurance);
    }

    @GetMapping("/approve-deviations-underwriting-reinsurance/{approveDeviationsUnderwritingReinsurance}")
    public List<UserRolesResponsibilities> findByApproveDeviationsUnderwritingReinsurance(@PathVariable String approveDeviationsUnderwritingReinsurance) {
        return userRolesResponsibilitiesService.findByApproveDeviationsUnderwritingReinsurance(approveDeviationsUnderwritingReinsurance);
    }

    @GetMapping("/approval-decisions-deviations-underwriting-pricing-reinsurance/{approvalDecisionsDeviationsUnderwritingPricingReinsurance}")
    public List<UserRolesResponsibilities> findByApprovalDecisionsDeviationsUnderwritingPricingReinsurance(
            @PathVariable String approvalDecisionsDeviationsUnderwritingPricingReinsurance) {
        return userRolesResponsibilitiesService
                .findByApprovalDecisionsDeviationsUnderwritingPricingReinsurance(approvalDecisionsDeviationsUnderwritingPricingReinsurance);
    }

    @GetMapping("/perform-valuations/{performValuations}")
    public List<UserRolesResponsibilities> findByPerformValuations(@PathVariable String performValuations) {
        return userRolesResponsibilitiesService.findByPerformValuations(performValuations);
    }

    @GetMapping("/make-pricing-decisions/{makePricingDecisions}")