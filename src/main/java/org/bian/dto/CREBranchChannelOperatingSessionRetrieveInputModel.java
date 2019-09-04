package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CREBranchChannelOperatingSessionRetrieveInputModelEBranchChannelOperatingSessionInstanceAnalysis;
import org.bian.dto.CREBranchChannelOperatingSessionRetrieveInputModelEBranchChannelOperatingSessionInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CREBranchChannelOperatingSessionRetrieveInputModel
 */
public class CREBranchChannelOperatingSessionRetrieveInputModel   {
  private Object eBranchChannelOperatingSessionRetrieveActionTaskRecord = null;

  private String eBranchChannelOperatingSessionRetrieveActionRequest = null;

  private CREBranchChannelOperatingSessionRetrieveInputModelEBranchChannelOperatingSessionInstanceReportRecord eBranchChannelOperatingSessionInstanceReportRecord = null;

  private CREBranchChannelOperatingSessionRetrieveInputModelEBranchChannelOperatingSessionInstanceAnalysis eBranchChannelOperatingSessionInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return eBranchChannelOperatingSessionRetrieveActionTaskRecord
  **/

  public Object getEBranchChannelOperatingSessionRetrieveActionTaskRecord() {
    return eBranchChannelOperatingSessionRetrieveActionTaskRecord;
  }

  public void setEBranchChannelOperatingSessionRetrieveActionTaskRecord(Object eBranchChannelOperatingSessionRetrieveActionTaskRecord) {
    this.eBranchChannelOperatingSessionRetrieveActionTaskRecord = eBranchChannelOperatingSessionRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return eBranchChannelOperatingSessionRetrieveActionRequest
  **/

  public String getEBranchChannelOperatingSessionRetrieveActionRequest() {
    return eBranchChannelOperatingSessionRetrieveActionRequest;
  }

  public void setEBranchChannelOperatingSessionRetrieveActionRequest(String eBranchChannelOperatingSessionRetrieveActionRequest) {
    this.eBranchChannelOperatingSessionRetrieveActionRequest = eBranchChannelOperatingSessionRetrieveActionRequest;
  }


  /**
   * Get eBranchChannelOperatingSessionInstanceReportRecord
   * @return eBranchChannelOperatingSessionInstanceReportRecord
  **/

  public CREBranchChannelOperatingSessionRetrieveInputModelEBranchChannelOperatingSessionInstanceReportRecord getEBranchChannelOperatingSessionInstanceReportRecord() {
    return eBranchChannelOperatingSessionInstanceReportRecord;
  }

  public void setEBranchChannelOperatingSessionInstanceReportRecord(CREBranchChannelOperatingSessionRetrieveInputModelEBranchChannelOperatingSessionInstanceReportRecord eBranchChannelOperatingSessionInstanceReportRecord) {
    this.eBranchChannelOperatingSessionInstanceReportRecord = eBranchChannelOperatingSessionInstanceReportRecord;
  }


  /**
   * Get eBranchChannelOperatingSessionInstanceAnalysis
   * @return eBranchChannelOperatingSessionInstanceAnalysis
  **/

  public CREBranchChannelOperatingSessionRetrieveInputModelEBranchChannelOperatingSessionInstanceAnalysis getEBranchChannelOperatingSessionInstanceAnalysis() {
    return eBranchChannelOperatingSessionInstanceAnalysis;
  }

  public void setEBranchChannelOperatingSessionInstanceAnalysis(CREBranchChannelOperatingSessionRetrieveInputModelEBranchChannelOperatingSessionInstanceAnalysis eBranchChannelOperatingSessionInstanceAnalysis) {
    this.eBranchChannelOperatingSessionInstanceAnalysis = eBranchChannelOperatingSessionInstanceAnalysis;
  }


}

