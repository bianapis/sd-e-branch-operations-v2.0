package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CREBranchChannelOperatingSessionRetrieveOutputModelEBranchChannelOperatingSessionInstanceReportRecord
 */
public class CREBranchChannelOperatingSessionRetrieveOutputModelEBranchChannelOperatingSessionInstanceReportRecord   {
  private String eBranchChannelOperatingSessionInstanceReportData = null;

  private String eBranchChannelOperatingSessionInstanceReportType = null;

  private Object eBranchChannelOperatingSessionInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return eBranchChannelOperatingSessionInstanceReportData
  **/

  public String getEBranchChannelOperatingSessionInstanceReportData() {
    return eBranchChannelOperatingSessionInstanceReportData;
  }
 
  @JsonProperty("eBranchChannelOperatingSessionInstanceReportData")
  public void setEBranchChannelOperatingSessionInstanceReportData(String eBranchChannelOperatingSessionInstanceReportData) {
    this.eBranchChannelOperatingSessionInstanceReportData = eBranchChannelOperatingSessionInstanceReportData;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return eBranchChannelOperatingSessionInstanceReportType
  **/

  public String getEBranchChannelOperatingSessionInstanceReportType() {
    return eBranchChannelOperatingSessionInstanceReportType;
  }

  @JsonProperty("eBranchChannelOperatingSessionInstanceReportType")
  public void setEBranchChannelOperatingSessionInstanceReportType(String eBranchChannelOperatingSessionInstanceReportType) {
    this.eBranchChannelOperatingSessionInstanceReportType = eBranchChannelOperatingSessionInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return eBranchChannelOperatingSessionInstanceReport
  **/

  public Object getEBranchChannelOperatingSessionInstanceReport() {
    return eBranchChannelOperatingSessionInstanceReport;
  }

  @JsonProperty("eBranchChannelOperatingSessionInstanceReport")
  public void setEBranchChannelOperatingSessionInstanceReport(Object eBranchChannelOperatingSessionInstanceReport) {
    this.eBranchChannelOperatingSessionInstanceReport = eBranchChannelOperatingSessionInstanceReport;
  }


}

