package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQInboundInitiateOutputModelInboundInstanceRecord
 */
public class BQInboundInitiateOutputModelInboundInstanceRecord   {
  private String eBranchInboundConnectionStartTime = null;

  private String eBranchInboundConnectionDuration = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::DateTime  general-info: Log of the initial connection 
   * @return eBranchInboundConnectionStartTime
  **/

  public String getEBranchInboundConnectionStartTime() {
    return eBranchInboundConnectionStartTime;
  }

  @JsonProperty("eBranchInboundConnectionStartTime")
  public void setEBranchInboundConnectionStartTime(String eBranchInboundConnectionStartTime) {
    this.eBranchInboundConnectionStartTime = eBranchInboundConnectionStartTime;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Connection duration for capacity planning purposes 
   * @return eBranchInboundConnectionDuration
  **/

  public String getEBranchInboundConnectionDuration() {
    return eBranchInboundConnectionDuration;
  }

  @JsonProperty("eBranchInboundConnectionDuration")
  public void setEBranchInboundConnectionDuration(String eBranchInboundConnectionDuration) {
    this.eBranchInboundConnectionDuration = eBranchInboundConnectionDuration;
  }


}

