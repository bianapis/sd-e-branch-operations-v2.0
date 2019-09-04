package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQOutboundInitiateOutputModelOutboundInstanceRecord
 */
public class BQOutboundInitiateOutputModelOutboundInstanceRecord   {
  private Object customerContactDialogueRecord = null;

  private String eBranchOutboundConnectionStartTime = null;

  private String eBranchOutboundConnectionDuration = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: This is the payload of the exchange - it is the specific session within the contact that handles the customer interaction. Content passes through the E-Branch facility transparently 
   * @return customerContactDialogueRecord
  **/

  public Object getCustomerContactDialogueRecord() {
    return customerContactDialogueRecord;
  }

  
  public void setCustomerContactDialogueRecord(Object customerContactDialogueRecord) {
    this.customerContactDialogueRecord = customerContactDialogueRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::DateTime  general-info: Log of the initial connection 
   * @return eBranchOutboundConnectionStartTime
  **/

  public String getEBranchOutboundConnectionStartTime() {
    return eBranchOutboundConnectionStartTime;
  }

  @JsonProperty("eBranchOutboundConnectionStartTime")
  public void setEBranchOutboundConnectionStartTime(String eBranchOutboundConnectionStartTime) {
    this.eBranchOutboundConnectionStartTime = eBranchOutboundConnectionStartTime;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Connection duration for capacity planning purposes 
   * @return eBranchOutboundConnectionDuration
  **/

  public String getEBranchOutboundConnectionDuration() {
    return eBranchOutboundConnectionDuration;
  }

  @JsonProperty("eBranchOutboundConnectionDuration")
  public void setEBranchOutboundConnectionDuration(String eBranchOutboundConnectionDuration) {
    this.eBranchOutboundConnectionDuration = eBranchOutboundConnectionDuration;
  }


}

