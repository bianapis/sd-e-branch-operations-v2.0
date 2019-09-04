package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CREBranchChannelOperatingSessionUpdateInputModelEBranchChannelOperatingSessionInstanceRecord;

import javax.validation.Valid;
  
/**
 * CREBranchChannelOperatingSessionUpdateInputModel
 */
public class CREBranchChannelOperatingSessionUpdateInputModel   {
  private String eBranchOperationsServicingSessionReference = null;

  private String eBranchChannelOperatingSessionInstanceReference = null;

  private CREBranchChannelOperatingSessionUpdateInputModelEBranchChannelOperatingSessionInstanceRecord eBranchChannelOperatingSessionInstanceRecord = null;

  private Object eBranchChannelOperatingSessionUpdateActionTaskRecord = null;

  private String updateActionRequest = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the EBranch Channel Operating Session instance 
   * @return eBranchChannelOperatingSessionInstanceReference
  **/

  public String getEBranchChannelOperatingSessionInstanceReference() {
    return eBranchChannelOperatingSessionInstanceReference;
  }

  public void setEBranchChannelOperatingSessionInstanceReference(String eBranchChannelOperatingSessionInstanceReference) {
    this.eBranchChannelOperatingSessionInstanceReference = eBranchChannelOperatingSessionInstanceReference;
  }


  /**
   * Get eBranchChannelOperatingSessionInstanceRecord
   * @return eBranchChannelOperatingSessionInstanceRecord
  **/

  public CREBranchChannelOperatingSessionUpdateInputModelEBranchChannelOperatingSessionInstanceRecord getEBranchChannelOperatingSessionInstanceRecord() {
    return eBranchChannelOperatingSessionInstanceRecord;
  }

  public void setEBranchChannelOperatingSessionInstanceRecord(CREBranchChannelOperatingSessionUpdateInputModelEBranchChannelOperatingSessionInstanceRecord eBranchChannelOperatingSessionInstanceRecord) {
    this.eBranchChannelOperatingSessionInstanceRecord = eBranchChannelOperatingSessionInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return eBranchChannelOperatingSessionUpdateActionTaskRecord
  **/

  public Object getEBranchChannelOperatingSessionUpdateActionTaskRecord() {
    return eBranchChannelOperatingSessionUpdateActionTaskRecord;
  }

  public void setEBranchChannelOperatingSessionUpdateActionTaskRecord(Object eBranchChannelOperatingSessionUpdateActionTaskRecord) {
    this.eBranchChannelOperatingSessionUpdateActionTaskRecord = eBranchChannelOperatingSessionUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return updateActionRequest
  **/

  public String getUpdateActionRequest() {
    return updateActionRequest;
  }

  public void setUpdateActionRequest(String updateActionRequest) {
    this.updateActionRequest = updateActionRequest;
  }


}

