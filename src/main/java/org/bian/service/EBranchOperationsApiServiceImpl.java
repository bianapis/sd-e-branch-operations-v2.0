/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class EBranchOperationsApiServiceImpl implements EBranchOperationsApiService {

	public SDEBranchOperationsActivateOutputModel activate(SDEBranchOperationsActivateInputModel request){
		return JsonReader.read("activate-SDEBranchOperationsActivateOutputModel.json",new TypeReference<SDEBranchOperationsActivateOutputModel>(){});
	}
	
	public SDEBranchOperationsConfigureOutputModel configure(String sdReferenceId, SDEBranchOperationsConfigureInputModel request){
		return JsonReader.read("configure-SDEBranchOperationsConfigureOutputModel.json",new TypeReference<SDEBranchOperationsConfigureOutputModel>(){});
	}
	
	public CREBranchChannelOperatingSessionControlOutputModel control(String sdReferenceId, String crReferenceId, CREBranchChannelOperatingSessionControlInputModel request){
		return JsonReader.read("control-CREBranchChannelOperatingSessionControlOutputModel.json",new TypeReference<CREBranchChannelOperatingSessionControlOutputModel>(){});
	}
	
	public SDEBranchOperationsFeedbackOutputModel feedback(String sdReferenceId, SDEBranchOperationsFeedbackInputModel request){
		return JsonReader.read("feedback-SDEBranchOperationsFeedbackOutputModel.json",new TypeReference<SDEBranchOperationsFeedbackOutputModel>(){});
	}
	
	public CREBranchChannelOperatingSessionInitiateOutputModel initiate(String sdReferenceId, CREBranchChannelOperatingSessionInitiateInputModel request){
		return JsonReader.read("initiate-CREBranchChannelOperatingSessionInitiateOutputModel.json",new TypeReference<CREBranchChannelOperatingSessionInitiateOutputModel>(){});
	}
	
	public BQInboundInitiateOutputModel initiateInbound(String sdReferenceId, String crReferenceId, BQInboundInitiateInputModel request){
		return JsonReader.read("initiate-BQInboundInitiateOutputModel.json",new TypeReference<BQInboundInitiateOutputModel>(){});
	}
	
	public BQOutboundInitiateOutputModel initiateOutbound(String sdReferenceId, String crReferenceId, BQOutboundInitiateInputModel request){
		return JsonReader.read("initiate-BQOutboundInitiateOutputModel.json",new TypeReference<BQOutboundInitiateOutputModel>(){});
	}
	
	public CREBranchChannelOperatingSessionRequestOutputModel request(String sdReferenceId, String crReferenceId, CREBranchChannelOperatingSessionRequestInputModel request){
		return JsonReader.read("request-CREBranchChannelOperatingSessionRequestOutputModel.json",new TypeReference<CREBranchChannelOperatingSessionRequestOutputModel>(){});
	}
	
	public BQInboundRetrieveOutputModel retrieveInbound(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQInboundRetrieveOutputModel.json",new TypeReference<BQInboundRetrieveOutputModel>(){});
	}
	
	public BQOutboundRetrieveOutputModel retrieveOutbound(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQOutboundRetrieveOutputModel.json",new TypeReference<BQOutboundRetrieveOutputModel>(){});
	}
	
	public CREBranchChannelOperatingSessionRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId){
		return JsonReader.read("retrieve-CREBranchChannelOperatingSessionRetrieveOutputModel.json",new TypeReference<CREBranchChannelOperatingSessionRetrieveOutputModel>(){});
	}
	
	public List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveRefIds(String sdReferenceId){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public SDEBranchOperationsRetrieveOutputModel retrieveSD(String sdReferenceId){
		return JsonReader.read("retrieveSD-SDEBranchOperationsRetrieveOutputModel.json",new TypeReference<SDEBranchOperationsRetrieveOutputModel>(){});
	}
	
	public CREBranchChannelOperatingSessionUpdateOutputModel update(String sdReferenceId, String crReferenceId, CREBranchChannelOperatingSessionUpdateInputModel request){
		return JsonReader.read("update-CREBranchChannelOperatingSessionUpdateOutputModel.json",new TypeReference<CREBranchChannelOperatingSessionUpdateOutputModel>(){});
	}
	
}
