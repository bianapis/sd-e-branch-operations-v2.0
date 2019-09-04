package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CREBranchChannelOperatingSessionControlInputModelEBranchChannelOperatingSessionControlActionRequest;

import javax.validation.Valid;
  
/**
 * CREBranchChannelOperatingSessionControlInputModel
 */
public class CREBranchChannelOperatingSessionControlInputModel   {
  private String eBranchOperationsServicingSessionReference = null;

  private String eBranchChannelOperatingSessionInstanceReference = null;

  private Object eBranchChannelOperatingSessionControlActionTaskRecord = null;

  private CREBranchChannelOperatingSessionControlInputModelEBranchChannelOperatingSessionControlActionRequest eBranchChannelOperatingSessionControlActionRequest = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The processing control service call consolidated processing record 
   * @return eBranchChannelOperatingSessionControlActionTaskRecord
  **/

  public Object getEBranchChannelOperatingSessionControlActionTaskRecord() {
    return eBranchChannelOperatingSessionControlActionTaskRecord;
  }

  public void setEBranchChannelOperatingSessionControlActionTaskRecord(Object eBranchChannelOperatingSessionControlActionTaskRecord) {
    this.eBranchChannelOperatingSessionControlActionTaskRecord = eBranchChannelOperatingSessionControlActionTaskRecord;
  }


  /**
   * Get eBranchChannelOperatingSessionControlActionRequest
   * @return eBranchChannelOperatingSessionControlActionRequest
  **/

  public CREBranchChannelOperatingSessionControlInputModelEBranchChannelOperatingSessionControlActionRequest getEBranchChannelOperatingSessionControlActionRequest() {
    return eBranchChannelOperatingSessionControlActionRequest;
  }

  public void setEBranchChannelOperatingSessionControlActionRequest(CREBranchChannelOperatingSessionControlInputModelEBranchChannelOperatingSessionControlActionRequest eBranchChannelOperatingSessionControlActionRequest) {
    this.eBranchChannelOperatingSessionControlActionRequest = eBranchChannelOperatingSessionControlActionRequest;
  }


}

