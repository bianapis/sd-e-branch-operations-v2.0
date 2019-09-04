package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CREBranchChannelOperatingSessionUpdateInputModelEBranchChannelOperatingSessionInstanceRecord;

import javax.validation.Valid;
  
/**
 * CREBranchChannelOperatingSessionUpdateOutputModel
 */
public class CREBranchChannelOperatingSessionUpdateOutputModel   {
  private CREBranchChannelOperatingSessionUpdateInputModelEBranchChannelOperatingSessionInstanceRecord eBranchChannelOperatingSessionInstanceRecord = null;

  private String eBranchChannelOperatingSessionUpdateActionTaskReference = null;

  private Object eBranchChannelOperatingSessionUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


  /**
   * Get eBranchChannelOperatingSessionInstanceRecord
   * @return eBranchChannelOperatingSessionInstanceRecord
  **/

  public CREBranchChannelOperatingSessionUpdateInputModelEBranchChannelOperatingSessionInstanceRecord getEBranchChannelOperatingSessionInstanceRecord() {
    return eBranchChannelOperatingSessionInstanceRecord;
  }

  @JsonProperty("eBranchChannelOperatingSessionInstanceRecord")
  public void setEBranchChannelOperatingSessionInstanceRecord(CREBranchChannelOperatingSessionUpdateInputModelEBranchChannelOperatingSessionInstanceRecord eBranchChannelOperatingSessionInstanceRecord) {
    this.eBranchChannelOperatingSessionInstanceRecord = eBranchChannelOperatingSessionInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return eBranchChannelOperatingSessionUpdateActionTaskReference
  **/

  public String getEBranchChannelOperatingSessionUpdateActionTaskReference() {
    return eBranchChannelOperatingSessionUpdateActionTaskReference;
  }

  @JsonProperty("eBranchChannelOperatingSessionUpdateActionTaskReference")
  public void setEBranchChannelOperatingSessionUpdateActionTaskReference(String eBranchChannelOperatingSessionUpdateActionTaskReference) {
    this.eBranchChannelOperatingSessionUpdateActionTaskReference = eBranchChannelOperatingSessionUpdateActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return eBranchChannelOperatingSessionUpdateActionTaskRecord
  **/

  public Object getEBranchChannelOperatingSessionUpdateActionTaskRecord() {
    return eBranchChannelOperatingSessionUpdateActionTaskRecord;
  }

  @JsonProperty("eBranchChannelOperatingSessionUpdateActionTaskRecord")
  public void setEBranchChannelOperatingSessionUpdateActionTaskRecord(Object eBranchChannelOperatingSessionUpdateActionTaskRecord) {
    this.eBranchChannelOperatingSessionUpdateActionTaskRecord = eBranchChannelOperatingSessionUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the Update action service response 
   * @return updateResponseRecord
  **/

  public Object getUpdateResponseRecord() {
    return updateResponseRecord;
  }

  public void setUpdateResponseRecord(Object updateResponseRecord) {
    this.updateResponseRecord = updateResponseRecord;
  }


}

