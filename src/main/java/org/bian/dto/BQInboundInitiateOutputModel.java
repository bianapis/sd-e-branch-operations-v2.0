package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQInboundInitiateOutputModelEBranchChannelOperatingSessionInstanceRecord;
import org.bian.dto.BQInboundInitiateOutputModelInboundInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQInboundInitiateOutputModel
 */
public class BQInboundInitiateOutputModel   {
  private BQInboundInitiateOutputModelEBranchChannelOperatingSessionInstanceRecord eBranchChannelOperatingSessionInstanceRecord = null;

  private String inboundInstanceReference = null;

  private String inboundInitiateActionReference = null;

  private Object inboundInitiateActionRecord = null;

  private String inboundInstanceStatus = null;

  private BQInboundInitiateOutputModelInboundInstanceRecord inboundInstanceRecord = null;


  /**
   * Get eBranchChannelOperatingSessionInstanceRecord
   * @return eBranchChannelOperatingSessionInstanceRecord
  **/

  public BQInboundInitiateOutputModelEBranchChannelOperatingSessionInstanceRecord getEBranchChannelOperatingSessionInstanceRecord() {
    return eBranchChannelOperatingSessionInstanceRecord;
  }

  @JsonProperty("eBranchChannelOperatingSessionInstanceRecord")
  public void setEBranchChannelOperatingSessionInstanceRecord(BQInboundInitiateOutputModelEBranchChannelOperatingSessionInstanceRecord eBranchChannelOperatingSessionInstanceRecord) {
    this.eBranchChannelOperatingSessionInstanceRecord = eBranchChannelOperatingSessionInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Inbound instance 
   * @return inboundInstanceReference
  **/

  public String getInboundInstanceReference() {
    return inboundInstanceReference;
  }

  public void setInboundInstanceReference(String inboundInstanceReference) {
    this.inboundInstanceReference = inboundInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call 
   * @return inboundInitiateActionReference
  **/

  public String getInboundInitiateActionReference() {
    return inboundInitiateActionReference;
  }

  public void setInboundInitiateActionReference(String inboundInitiateActionReference) {
    this.inboundInitiateActionReference = inboundInitiateActionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return inboundInitiateActionRecord
  **/

  public Object getInboundInitiateActionRecord() {
    return inboundInitiateActionRecord;
  }

  public void setInboundInitiateActionRecord(Object inboundInitiateActionRecord) {
    this.inboundInitiateActionRecord = inboundInitiateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Inbound instance (e.g. initialised, pending, active) 
   * @return inboundInstanceStatus
  **/

  public String getInboundInstanceStatus() {
    return inboundInstanceStatus;
  }

  public void setInboundInstanceStatus(String inboundInstanceStatus) {
    this.inboundInstanceStatus = inboundInstanceStatus;
  }


  /**
   * Get inboundInstanceRecord
   * @return inboundInstanceRecord
  **/

  public BQInboundInitiateOutputModelInboundInstanceRecord getInboundInstanceRecord() {
    return inboundInstanceRecord;
  }

  public void setInboundInstanceRecord(BQInboundInitiateOutputModelInboundInstanceRecord inboundInstanceRecord) {
    this.inboundInstanceRecord = inboundInstanceRecord;
  }


}

