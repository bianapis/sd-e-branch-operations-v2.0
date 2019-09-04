package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CREBranchChannelOperatingSessionInitiateOutputModelEBranchChannelOperatingSessionInstanceRecord;

import javax.validation.Valid;
  
/**
 * CREBranchChannelOperatingSessionInitiateOutputModel
 */
public class CREBranchChannelOperatingSessionInitiateOutputModel   {
  private String eBranchChannelOperatingSessionInstanceReference = null;

  private String eBranchChannelOperatingSessionInitiateActionReference = null;

  private Object eBranchChannelOperatingSessionInitiateActionRecord = null;

  private String eBranchChannelOperatingSessionInstanceStatus = null;

  private CREBranchChannelOperatingSessionInitiateOutputModelEBranchChannelOperatingSessionInstanceRecord eBranchChannelOperatingSessionInstanceRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the EBranch Channel Operating Session instance 
   * @return eBranchChannelOperatingSessionInstanceReference
  **/

  public String getEBranchChannelOperatingSessionInstanceReference() {
    return eBranchChannelOperatingSessionInstanceReference;
  }

  @JsonProperty("eBranchChannelOperatingSessionInstanceReference")
  public void setEBranchChannelOperatingSessionInstanceReference(String eBranchChannelOperatingSessionInstanceReference) {
    this.eBranchChannelOperatingSessionInstanceReference = eBranchChannelOperatingSessionInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call 
   * @return eBranchChannelOperatingSessionInitiateActionReference
  **/

  public String getEBranchChannelOperatingSessionInitiateActionReference() {
    return eBranchChannelOperatingSessionInitiateActionReference;
  }

  @JsonProperty("eBranchChannelOperatingSessionInitiateActionReference")
  public void setEBranchChannelOperatingSessionInitiateActionReference(String eBranchChannelOperatingSessionInitiateActionReference) {
    this.eBranchChannelOperatingSessionInitiateActionReference = eBranchChannelOperatingSessionInitiateActionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return eBranchChannelOperatingSessionInitiateActionRecord
  **/

  public Object getEBranchChannelOperatingSessionInitiateActionRecord() {
    return eBranchChannelOperatingSessionInitiateActionRecord;
  }

  @JsonProperty("eBranchChannelOperatingSessionInitiateActionRecord")
  public void setEBranchChannelOperatingSessionInitiateActionRecord(Object eBranchChannelOperatingSessionInitiateActionRecord) {
    this.eBranchChannelOperatingSessionInitiateActionRecord = eBranchChannelOperatingSessionInitiateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the EBranch Channel Operating Session instance (e.g. initialised, pending, active) 
   * @return eBranchChannelOperatingSessionInstanceStatus
  **/

  public String getEBranchChannelOperatingSessionInstanceStatus() {
    return eBranchChannelOperatingSessionInstanceStatus;
  }
  
  @JsonProperty("eBranchChannelOperatingSessionInstanceStatus")
  public void setEBranchChannelOperatingSessionInstanceStatus(String eBranchChannelOperatingSessionInstanceStatus) {
    this.eBranchChannelOperatingSessionInstanceStatus = eBranchChannelOperatingSessionInstanceStatus;
  }


  /**
   * Get eBranchChannelOperatingSessionInstanceRecord
   * @return eBranchChannelOperatingSessionInstanceRecord
  **/

  public CREBranchChannelOperatingSessionInitiateOutputModelEBranchChannelOperatingSessionInstanceRecord getEBranchChannelOperatingSessionInstanceRecord() {
    return eBranchChannelOperatingSessionInstanceRecord;
  }

  @JsonProperty("eBranchChannelOperatingSessionInstanceRecord")
  public void setEBranchChannelOperatingSessionInstanceRecord(CREBranchChannelOperatingSessionInitiateOutputModelEBranchChannelOperatingSessionInstanceRecord eBranchChannelOperatingSessionInstanceRecord) {
    this.eBranchChannelOperatingSessionInstanceRecord = eBranchChannelOperatingSessionInstanceRecord;
  }


}

