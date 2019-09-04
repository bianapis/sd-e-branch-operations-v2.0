package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQInboundInitiateOutputModelEBranchChannelOperatingSessionInstanceRecord;
import org.bian.dto.BQOutboundInitiateOutputModelOutboundInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQOutboundInitiateOutputModel
 */
public class BQOutboundInitiateOutputModel   {
  private BQInboundInitiateOutputModelEBranchChannelOperatingSessionInstanceRecord eBranchChannelOperatingSessionInstanceRecord = null;

  private String outboundInstanceReference = null;

  private String outboundInitiateActionReference = null;

  private Object outboundInitiateActionRecord = null;

  private String outboundInstanceStatus = null;

  private BQOutboundInitiateOutputModelOutboundInstanceRecord outboundInstanceRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Outbound instance 
   * @return outboundInstanceReference
  **/

  public String getOutboundInstanceReference() {
    return outboundInstanceReference;
  }

  public void setOutboundInstanceReference(String outboundInstanceReference) {
    this.outboundInstanceReference = outboundInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call 
   * @return outboundInitiateActionReference
  **/

  public String getOutboundInitiateActionReference() {
    return outboundInitiateActionReference;
  }

  public void setOutboundInitiateActionReference(String outboundInitiateActionReference) {
    this.outboundInitiateActionReference = outboundInitiateActionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return outboundInitiateActionRecord
  **/

  public Object getOutboundInitiateActionRecord() {
    return outboundInitiateActionRecord;
  }

  public void setOutboundInitiateActionRecord(Object outboundInitiateActionRecord) {
    this.outboundInitiateActionRecord = outboundInitiateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Outbound instance (e.g. initialised, pending, active) 
   * @return outboundInstanceStatus
  **/

  public String getOutboundInstanceStatus() {
    return outboundInstanceStatus;
  }

  public void setOutboundInstanceStatus(String outboundInstanceStatus) {
    this.outboundInstanceStatus = outboundInstanceStatus;
  }


  /**
   * Get outboundInstanceRecord
   * @return outboundInstanceRecord
  **/

  public BQOutboundInitiateOutputModelOutboundInstanceRecord getOutboundInstanceRecord() {
    return outboundInstanceRecord;
  }

  public void setOutboundInstanceRecord(BQOutboundInitiateOutputModelOutboundInstanceRecord outboundInstanceRecord) {
    this.outboundInstanceRecord = outboundInstanceRecord;
  }


}

