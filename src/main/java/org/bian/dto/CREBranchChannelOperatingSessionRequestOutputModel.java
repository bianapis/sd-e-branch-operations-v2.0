package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CREBranchChannelOperatingSessionRequestOutputModelEBranchChannelOperatingSessionInstanceRecord;

import javax.validation.Valid;
  
/**
 * CREBranchChannelOperatingSessionRequestOutputModel
 */
public class CREBranchChannelOperatingSessionRequestOutputModel   {
  private CREBranchChannelOperatingSessionRequestOutputModelEBranchChannelOperatingSessionInstanceRecord eBranchChannelOperatingSessionInstanceRecord = null;

  private String eBranchChannelOperatingSessionRequestActionTaskReference = null;

  private Object eBranchChannelOperatingSessionRequestActionTaskRecord = null;

  private String requestRecordReference = null;

  private Object requestResponseRecord = null;


  /**
   * Get eBranchChannelOperatingSessionInstanceRecord
   * @return eBranchChannelOperatingSessionInstanceRecord
  **/

  public CREBranchChannelOperatingSessionRequestOutputModelEBranchChannelOperatingSessionInstanceRecord getEBranchChannelOperatingSessionInstanceRecord() {
    return eBranchChannelOperatingSessionInstanceRecord;
  }

  @JsonProperty("eBranchChannelOperatingSessionInstanceRecord")
  public void setEBranchChannelOperatingSessionInstanceRecord(CREBranchChannelOperatingSessionRequestOutputModelEBranchChannelOperatingSessionInstanceRecord eBranchChannelOperatingSessionInstanceRecord) {
    this.eBranchChannelOperatingSessionInstanceRecord = eBranchChannelOperatingSessionInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a EBranch Channel Operating Session instance request service call 
   * @return eBranchChannelOperatingSessionRequestActionTaskReference
  **/

  public String getEBranchChannelOperatingSessionRequestActionTaskReference() {
    return eBranchChannelOperatingSessionRequestActionTaskReference;
  }

  @JsonProperty("eBranchChannelOperatingSessionRequestActionTaskReference")
  public void setEBranchChannelOperatingSessionRequestActionTaskReference(String eBranchChannelOperatingSessionRequestActionTaskReference) {
    this.eBranchChannelOperatingSessionRequestActionTaskReference = eBranchChannelOperatingSessionRequestActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return eBranchChannelOperatingSessionRequestActionTaskRecord
  **/

  public Object getEBranchChannelOperatingSessionRequestActionTaskRecord() {
    return eBranchChannelOperatingSessionRequestActionTaskRecord;
  }

  @JsonProperty("eBranchChannelOperatingSessionRequestActionTaskRecord")
  public void setEBranchChannelOperatingSessionRequestActionTaskRecord(Object eBranchChannelOperatingSessionRequestActionTaskRecord) {
    this.eBranchChannelOperatingSessionRequestActionTaskRecord = eBranchChannelOperatingSessionRequestActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the service request record 
   * @return requestRecordReference
  **/

  public String getRequestRecordReference() {
    return requestRecordReference;
  }

  public void setRequestRecordReference(String requestRecordReference) {
    this.requestRecordReference = requestRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the request action service response 
   * @return requestResponseRecord
  **/

  public Object getRequestResponseRecord() {
    return requestResponseRecord;
  }

  public void setRequestResponseRecord(Object requestResponseRecord) {
    this.requestResponseRecord = requestResponseRecord;
  }


}

