package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CREBranchChannelOperatingSessionInitiateInputModelEBranchChannelOperatingSessionInstanceRecord;

import javax.validation.Valid;
  
/**
 * CREBranchChannelOperatingSessionInitiateInputModel
 */
public class CREBranchChannelOperatingSessionInitiateInputModel   {
  private String eBranchOperationsServicingSessionReference = null;

  private Object eBranchChannelOperatingSessionInitiateActionRecord = null;

  private String eBranchChannelOperatingSessionInstanceStatus = null;

  private CREBranchChannelOperatingSessionInitiateInputModelEBranchChannelOperatingSessionInstanceRecord eBranchChannelOperatingSessionInstanceRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return eBranchOperationsServicingSessionReference
  **/

  public String getEBranchOperationsServicingSessionReference() {
    return eBranchOperationsServicingSessionReference;
  }

  public void setEBranchOperationsServicingSessionReference(String eBranchOperationsServicingSessionReference) {
    this.eBranchOperationsServicingSessionReference = eBranchOperationsServicingSessionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return eBranchChannelOperatingSessionInitiateActionRecord
  **/

  public Object getEBranchChannelOperatingSessionInitiateActionRecord() {
    return eBranchChannelOperatingSessionInitiateActionRecord;
  }

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

  public void setEBranchChannelOperatingSessionInstanceStatus(String eBranchChannelOperatingSessionInstanceStatus) {
    this.eBranchChannelOperatingSessionInstanceStatus = eBranchChannelOperatingSessionInstanceStatus;
  }


  /**
   * Get eBranchChannelOperatingSessionInstanceRecord
   * @return eBranchChannelOperatingSessionInstanceRecord
  **/

  public CREBranchChannelOperatingSessionInitiateInputModelEBranchChannelOperatingSessionInstanceRecord getEBranchChannelOperatingSessionInstanceRecord() {
    return eBranchChannelOperatingSessionInstanceRecord;
  }

  public void setEBranchChannelOperatingSessionInstanceRecord(CREBranchChannelOperatingSessionInitiateInputModelEBranchChannelOperatingSessionInstanceRecord eBranchChannelOperatingSessionInstanceRecord) {
    this.eBranchChannelOperatingSessionInstanceRecord = eBranchChannelOperatingSessionInstanceRecord;
  }


}

