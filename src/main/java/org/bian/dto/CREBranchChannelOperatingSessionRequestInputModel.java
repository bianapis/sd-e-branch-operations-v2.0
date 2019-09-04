package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CREBranchChannelOperatingSessionRequestInputModelEBranchChannelOperatingSessionInstanceRecord;
import org.bian.dto.CREBranchChannelOperatingSessionRequestInputModelRequestRecordType;

import javax.validation.Valid;
  
/**
 * CREBranchChannelOperatingSessionRequestInputModel
 */
public class CREBranchChannelOperatingSessionRequestInputModel   {
  private String eBranchOperationsServicingSessionReference = null;

  private String eBranchChannelOperatingSessionInstanceReference = null;

  private CREBranchChannelOperatingSessionRequestInputModelEBranchChannelOperatingSessionInstanceRecord eBranchChannelOperatingSessionInstanceRecord = null;

  private Object eBranchChannelOperatingSessionRequestActionTaskRecord = null;

  private CREBranchChannelOperatingSessionRequestInputModelRequestRecordType requestRecordType = null;


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

  public CREBranchChannelOperatingSessionRequestInputModelEBranchChannelOperatingSessionInstanceRecord getEBranchChannelOperatingSessionInstanceRecord() {
    return eBranchChannelOperatingSessionInstanceRecord;
  }

  public void setEBranchChannelOperatingSessionInstanceRecord(CREBranchChannelOperatingSessionRequestInputModelEBranchChannelOperatingSessionInstanceRecord eBranchChannelOperatingSessionInstanceRecord) {
    this.eBranchChannelOperatingSessionInstanceRecord = eBranchChannelOperatingSessionInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return eBranchChannelOperatingSessionRequestActionTaskRecord
  **/

  public Object getEBranchChannelOperatingSessionRequestActionTaskRecord() {
    return eBranchChannelOperatingSessionRequestActionTaskRecord;
  }

  public void setEBranchChannelOperatingSessionRequestActionTaskRecord(Object eBranchChannelOperatingSessionRequestActionTaskRecord) {
    this.eBranchChannelOperatingSessionRequestActionTaskRecord = eBranchChannelOperatingSessionRequestActionTaskRecord;
  }


  /**
   * Get requestRecordType
   * @return requestRecordType
  **/

  public CREBranchChannelOperatingSessionRequestInputModelRequestRecordType getRequestRecordType() {
    return requestRecordType;
  }

  public void setRequestRecordType(CREBranchChannelOperatingSessionRequestInputModelRequestRecordType requestRecordType) {
    this.requestRecordType = requestRecordType;
  }


}

