package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CREBranchChannelOperatingSessionControlOutputModel
 */
public class CREBranchChannelOperatingSessionControlOutputModel   {
  private String eBranchChannelOperatingSessionControlActionTaskReference = null;

  private Object eBranchChannelOperatingSessionControlActionTaskRecord = null;

  private String eBranchChannelOperatingSessionControlActionResponse = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a EBranch Channel Operating Session instance control processing service call 
   * @return eBranchChannelOperatingSessionControlActionTaskReference
  **/

  public String getEBranchChannelOperatingSessionControlActionTaskReference() {
    return eBranchChannelOperatingSessionControlActionTaskReference;
  }

  @JsonProperty("eBranchChannelOperatingSessionControlActionTaskReference")
  public void setEBranchChannelOperatingSessionControlActionTaskReference(String eBranchChannelOperatingSessionControlActionTaskReference) {
    this.eBranchChannelOperatingSessionControlActionTaskReference = eBranchChannelOperatingSessionControlActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The processing control service call consolidated processing record 
   * @return eBranchChannelOperatingSessionControlActionTaskRecord
  **/

  public Object getEBranchChannelOperatingSessionControlActionTaskRecord() {
    return eBranchChannelOperatingSessionControlActionTaskRecord;
  }

  @JsonProperty("eBranchChannelOperatingSessionControlActionTaskRecord")
  public void setEBranchChannelOperatingSessionControlActionTaskRecord(Object eBranchChannelOperatingSessionControlActionTaskRecord) {
    this.eBranchChannelOperatingSessionControlActionTaskRecord = eBranchChannelOperatingSessionControlActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the control action service response 
   * @return eBranchChannelOperatingSessionControlActionResponse
  **/

  public String getEBranchChannelOperatingSessionControlActionResponse() {
    return eBranchChannelOperatingSessionControlActionResponse;
  }

  @JsonProperty("eBranchChannelOperatingSessionControlActionResponse")
  public void setEBranchChannelOperatingSessionControlActionResponse(String eBranchChannelOperatingSessionControlActionResponse) {
    this.eBranchChannelOperatingSessionControlActionResponse = eBranchChannelOperatingSessionControlActionResponse;
  }


}

