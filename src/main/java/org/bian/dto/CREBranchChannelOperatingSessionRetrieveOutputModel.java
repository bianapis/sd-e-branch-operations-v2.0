package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CREBranchChannelOperatingSessionRetrieveOutputModelEBranchChannelOperatingSessionInstanceAnalysis;
import org.bian.dto.CREBranchChannelOperatingSessionRetrieveOutputModelEBranchChannelOperatingSessionInstanceRecord;
import org.bian.dto.CREBranchChannelOperatingSessionRetrieveOutputModelEBranchChannelOperatingSessionInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CREBranchChannelOperatingSessionRetrieveOutputModel
 */
public class CREBranchChannelOperatingSessionRetrieveOutputModel   {
  private CREBranchChannelOperatingSessionRetrieveOutputModelEBranchChannelOperatingSessionInstanceRecord eBranchChannelOperatingSessionInstanceRecord = null;

  private String eBranchChannelOperatingSessionRetrieveActionTaskReference = null;

  private Object eBranchChannelOperatingSessionRetrieveActionTaskRecord = null;

  private String eBranchChannelOperatingSessionRetrieveActionResponse = null;

  private CREBranchChannelOperatingSessionRetrieveOutputModelEBranchChannelOperatingSessionInstanceReportRecord eBranchChannelOperatingSessionInstanceReportRecord = null;

  private CREBranchChannelOperatingSessionRetrieveOutputModelEBranchChannelOperatingSessionInstanceAnalysis eBranchChannelOperatingSessionInstanceAnalysis = null;


  /**
   * Get eBranchChannelOperatingSessionInstanceRecord
   * @return eBranchChannelOperatingSessionInstanceRecord
  **/

  public CREBranchChannelOperatingSessionRetrieveOutputModelEBranchChannelOperatingSessionInstanceRecord getEBranchChannelOperatingSessionInstanceRecord() {
    return eBranchChannelOperatingSessionInstanceRecord;
  }

  @JsonProperty("eBranchChannelOperatingSessionInstanceRecord")
  public void setEBranchChannelOperatingSessionInstanceRecord(CREBranchChannelOperatingSessionRetrieveOutputModelEBranchChannelOperatingSessionInstanceRecord eBranchChannelOperatingSessionInstanceRecord) {
    this.eBranchChannelOperatingSessionInstanceRecord = eBranchChannelOperatingSessionInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a EBranch Channel Operating Session instance retrieve service call 
   * @return eBranchChannelOperatingSessionRetrieveActionTaskReference
  **/

  public String getEBranchChannelOperatingSessionRetrieveActionTaskReference() {
    return eBranchChannelOperatingSessionRetrieveActionTaskReference;
  }

  @JsonProperty("eBranchChannelOperatingSessionRetrieveActionTaskReference")
  public void setEBranchChannelOperatingSessionRetrieveActionTaskReference(String eBranchChannelOperatingSessionRetrieveActionTaskReference) {
    this.eBranchChannelOperatingSessionRetrieveActionTaskReference = eBranchChannelOperatingSessionRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return eBranchChannelOperatingSessionRetrieveActionTaskRecord
  **/

  public Object getEBranchChannelOperatingSessionRetrieveActionTaskRecord() {
    return eBranchChannelOperatingSessionRetrieveActionTaskRecord;
  }

  @JsonProperty("eBranchChannelOperatingSessionRetrieveActionTaskRecord")
  public void setEBranchChannelOperatingSessionRetrieveActionTaskRecord(Object eBranchChannelOperatingSessionRetrieveActionTaskRecord) {
    this.eBranchChannelOperatingSessionRetrieveActionTaskRecord = eBranchChannelOperatingSessionRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return eBranchChannelOperatingSessionRetrieveActionResponse
  **/

  public String getEBranchChannelOperatingSessionRetrieveActionResponse() {
    return eBranchChannelOperatingSessionRetrieveActionResponse;
  }

  @JsonProperty("eBranchChannelOperatingSessionRetrieveActionResponse")
  public void setEBranchChannelOperatingSessionRetrieveActionResponse(String eBranchChannelOperatingSessionRetrieveActionResponse) {
    this.eBranchChannelOperatingSessionRetrieveActionResponse = eBranchChannelOperatingSessionRetrieveActionResponse;
  }


  /**
   * Get eBranchChannelOperatingSessionInstanceReportRecord
   * @return eBranchChannelOperatingSessionInstanceReportRecord
  **/

  public CREBranchChannelOperatingSessionRetrieveOutputModelEBranchChannelOperatingSessionInstanceReportRecord getEBranchChannelOperatingSessionInstanceReportRecord() {
    return eBranchChannelOperatingSessionInstanceReportRecord;
  }

  @JsonProperty("eBranchChannelOperatingSessionInstanceReportRecord")
  public void setEBranchChannelOperatingSessionInstanceReportRecord(CREBranchChannelOperatingSessionRetrieveOutputModelEBranchChannelOperatingSessionInstanceReportRecord eBranchChannelOperatingSessionInstanceReportRecord) {
    this.eBranchChannelOperatingSessionInstanceReportRecord = eBranchChannelOperatingSessionInstanceReportRecord;
  }


  /**
   * Get eBranchChannelOperatingSessionInstanceAnalysis
   * @return eBranchChannelOperatingSessionInstanceAnalysis
  **/

  public CREBranchChannelOperatingSessionRetrieveOutputModelEBranchChannelOperatingSessionInstanceAnalysis getEBranchChannelOperatingSessionInstanceAnalysis() {
    return eBranchChannelOperatingSessionInstanceAnalysis;
  }

  @JsonProperty("eBranchChannelOperatingSessionInstanceAnalysis")
  public void setEBranchChannelOperatingSessionInstanceAnalysis(CREBranchChannelOperatingSessionRetrieveOutputModelEBranchChannelOperatingSessionInstanceAnalysis eBranchChannelOperatingSessionInstanceAnalysis) {
    this.eBranchChannelOperatingSessionInstanceAnalysis = eBranchChannelOperatingSessionInstanceAnalysis;
  }


}

