package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQInboundRetrieveOutputModelInboundInstanceRecord
 */
public class BQInboundRetrieveOutputModelInboundInstanceRecord   {
  private String eBranchDeviceReference = null;

  private String eBranchDevicePropertyValue = null;

  private String eBranchInboundConnectionStartTime = null;

  private String eBranchInboundConnectionDuration = null;

  private String eBranchInboundConnectionContactRecordReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the device being used for access (captured for security and identification) 
   * @return eBranchDeviceReference
  **/

  public String getEBranchDeviceReference() {
    return eBranchDeviceReference;
  }

  
  @JsonProperty("eBranchDeviceReference")
  public void setEBranchDeviceReference(String eBranchDeviceReference) {
    this.eBranchDeviceReference = eBranchDeviceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Property of the Device e.g. URL if available 
   * @return eBranchDevicePropertyValue
  **/

  public String getEBranchDevicePropertyValue() {
    return eBranchDevicePropertyValue;
  }

  @JsonProperty("eBranchDevicePropertyValue")
  public void setEBranchDevicePropertyValue(String eBranchDevicePropertyValue) {
    this.eBranchDevicePropertyValue = eBranchDevicePropertyValue;
  }


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


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: This is returned by SD-Contact Handler for reference if the connection leads to a log-in session  
   * @return eBranchInboundConnectionContactRecordReference
  **/

  public String getEBranchInboundConnectionContactRecordReference() {
    return eBranchInboundConnectionContactRecordReference;
  }

  @JsonProperty("eBranchInboundConnectionContactRecordReference")
  public void setEBranchInboundConnectionContactRecordReference(String eBranchInboundConnectionContactRecordReference) {
    this.eBranchInboundConnectionContactRecordReference = eBranchInboundConnectionContactRecordReference;
  }


}

