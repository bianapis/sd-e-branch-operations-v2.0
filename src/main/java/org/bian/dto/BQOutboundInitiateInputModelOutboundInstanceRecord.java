package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQOutboundInitiateInputModelOutboundInstanceRecord
 */
public class BQOutboundInitiateInputModelOutboundInstanceRecord   {
  private String employeeBusinessUnitReference = null;

  private String customerContactRecordReference = null;

  private Object customerContactDialogueRecord = null;

  private String eBranchCustomerDeviceReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the source of outbound connection 
   * @return employeeBusinessUnitReference
  **/

  public String getEmployeeBusinessUnitReference() {
    return employeeBusinessUnitReference;
  }

  public void setEmployeeBusinessUnitReference(String employeeBusinessUnitReference) {
    this.employeeBusinessUnitReference = employeeBusinessUnitReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: The outbound connection will be part of a customer contact to ensure all logging is performed 
   * @return customerContactRecordReference
  **/

  public String getCustomerContactRecordReference() {
    return customerContactRecordReference;
  }

  public void setCustomerContactRecordReference(String customerContactRecordReference) {
    this.customerContactRecordReference = customerContactRecordReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the device being connected to  
   * @return eBranchCustomerDeviceReference
  **/

  public String getEBranchCustomerDeviceReference() {
    return eBranchCustomerDeviceReference;
  }

  public void setEBranchCustomerDeviceReference(String eBranchCustomerDeviceReference) {
    this.eBranchCustomerDeviceReference = eBranchCustomerDeviceReference;
  }


}

