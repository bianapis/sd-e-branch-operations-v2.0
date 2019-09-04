/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface EBranchOperationsApiService {

	SDEBranchOperationsActivateOutputModel activate(SDEBranchOperationsActivateInputModel request);
	
	SDEBranchOperationsConfigureOutputModel configure(String sdReferenceId, SDEBranchOperationsConfigureInputModel request);
	
	CREBranchChannelOperatingSessionControlOutputModel control(String sdReferenceId, String crReferenceId, CREBranchChannelOperatingSessionControlInputModel request);
	
	SDEBranchOperationsFeedbackOutputModel feedback(String sdReferenceId, SDEBranchOperationsFeedbackInputModel request);
	
	CREBranchChannelOperatingSessionInitiateOutputModel initiate(String sdReferenceId, CREBranchChannelOperatingSessionInitiateInputModel request);
	
	BQInboundInitiateOutputModel initiateInbound(String sdReferenceId, String crReferenceId, BQInboundInitiateInputModel request);
	
	BQOutboundInitiateOutputModel initiateOutbound(String sdReferenceId, String crReferenceId, BQOutboundInitiateInputModel request);
	
	CREBranchChannelOperatingSessionRequestOutputModel request(String sdReferenceId, String crReferenceId, CREBranchChannelOperatingSessionRequestInputModel request);
	
	BQInboundRetrieveOutputModel retrieveInbound(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQOutboundRetrieveOutputModel retrieveOutbound(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	CREBranchChannelOperatingSessionRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId);
	
	List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier);
	
	List<String> retrieveBQs();
	
	List<String> retrieveRefIds(String sdReferenceId);
	
	SDEBranchOperationsRetrieveOutputModel retrieveSD(String sdReferenceId);
	
	CREBranchChannelOperatingSessionUpdateOutputModel update(String sdReferenceId, String crReferenceId, CREBranchChannelOperatingSessionUpdateInputModel request);
	
}
