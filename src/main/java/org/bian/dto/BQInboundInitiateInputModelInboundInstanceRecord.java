package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQInboundInitiateInputModelInboundInstanceRecord
 */
public class BQInboundInitiateInputModelInboundInstanceRecord   {
  private String eBranchDeviceReference = null;

  private String eBranchDevicePropertyValue = null;

  private String eBranchInboundConnectionContactRecordReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the device being used for access (captured for security and identification) 
   * @return eBranchDeviceReference
  **/

  public String getEBranchDeviceReference() {
    return eBranchDeviceReference;
  }

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

  public void setEBranchDevicePropertyValue(String eBranchDevicePropertyValue) {
    this.eBranchDevicePropertyValue = eBranchDevicePropertyValue;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: This is returned by SD-Contact Handler for reference if the connection leads to a log-in session  
   * @return eBranchInboundConnectionContactRecordReference
  **/

  public String getEBranchInboundConnectionContactRecordReference() {
    return eBranchInboundConnectionContactRecordReference;
  }

  public void setEBranchInboundConnectionContactRecordReference(String eBranchInboundConnectionContactRecordReference) {
    this.eBranchInboundConnectionContactRecordReference = eBranchInboundConnectionContactRecordReference;
  }


}

