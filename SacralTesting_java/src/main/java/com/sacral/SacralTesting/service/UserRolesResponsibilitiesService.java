package com.sacral.SacralTesting.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sacral.SacralTesting.repository.UserRolesResponsibilitiesRepository;

@Service
public class UserRolesResponsibilitiesService {

    @Autowired
    private UserRolesResponsibilitiesRepository userRolesResponsibilitiesRepository;

    public List<UserRolesResponsibilities> findByLeadGenerationProposalQuotationGeneration(String leadGenerationProposalQuotationGeneration) {
        return userRolesResponsibilitiesRepository.findByLeadGenerationProposalQuotationGeneration(leadGenerationProposalQuotationGeneration);
    }

    public List<UserRolesResponsibilities> findByConfigureMasterPoliciesReinsurance(String configureMasterPoliciesReinsurance) {
        return userRolesResponsibilitiesRepository.findByConfigureMasterPoliciesReinsurance(configureMasterPoliciesReinsurance);
    }

    public List<UserRolesResponsibilities> findByApproveDeviationsUnderwritingReinsurance(String approveDeviationsUnderwritingReinsurance) {
        return userRolesResponsibilitiesRepository.findByApproveDeviationsUnderwritingReinsurance(approveDeviationsUnderwritingReinsurance);
    }

    public List<UserRolesResponsibilities> findByApprovalDecisionsDeviationsUnderwritingPricingReinsurance(
            String approvalDecisionsDeviationsUnderwritingPricingReinsurance) {
        return userRolesResponsibilitiesRepository
                .findByApprovalDecisionsDeviationsUnderwritingPricingReinsurance(approvalDecisionsDeviationsUnderwritingPricingReinsurance);
    }

    public List<UserRolesResponsibilities> findByPerformValuations(String performValuations) {
        return userRolesResponsibilitiesRepository.findByPerformValuations(performValuations);
    }

    public List<UserRolesResponsibilities> findByMakePricingDecisions(String makePricingDecisions) {
        return userRolesResponsibilitiesRepository.findByMakePricingDecisions(makePricingDecisions);
    }

    public List<UserRolesResponsibilities> findByMakeUnderwritingPricingDecisions(String makeUnderwritingPricingDecisions) {
        return userRolesResponsibilitiesRepository.findByMakeUnderwritingPricingDecisions(makeUnderwritingPricingDecisions);
    }

    public List<UserRolesResponsibilities> findByManageMemberDataPayments(String manageMemberDataPayments) {
        return userRolesResponsibilitiesRepository.findByManageMemberDataPayments(manageMemberDataPayments);
    }

    public List<UserRolesResponsibilities> findByAcknowledgeReceiptOfClaimForms(String acknowledgeReceiptOfClaimForms) {
        return userRolesResponsibilitiesRepository.findByAcknowledgeReceiptOfClaimForms(acknowledgeReceiptOfClaimForms);
    }

    public List<UserRolesResponsibilities> findByUpdateLeadsDocumentCollection(String updateLeadsDocumentCollection) {
        return userRolesResponsibilitiesRepository.findByUpdateLeadsDocumentCollection(updateLeadsDocumentCollection);
    }

}