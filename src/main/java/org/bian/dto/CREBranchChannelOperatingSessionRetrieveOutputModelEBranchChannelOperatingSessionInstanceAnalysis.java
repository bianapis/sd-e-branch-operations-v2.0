package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CREBranchChannelOperatingSessionRetrieveOutputModelEBranchChannelOperatingSessionInstanceAnalysis
 */
public class CREBranchChannelOperatingSessionRetrieveOutputModelEBranchChannelOperatingSessionInstanceAnalysis   {
  private String eBranchChannelOperatingSessionInstanceAnalysisData = null;

  private String eBranchChannelOperatingSessionInstanceAnalysisReportType = null;

  private Object eBranchChannelOperatingSessionInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return eBranchChannelOperatingSessionInstanceAnalysisData
  **/

  public String getEBranchChannelOperatingSessionInstanceAnalysisData() {
    return eBranchChannelOperatingSessionInstanceAnalysisData;
  }

  
  @JsonProperty("eBranchChannelOperatingSessionInstanceAnalysisData")
  public void setEBranchChannelOperatingSessionInstanceAnalysisData(String eBranchChannelOperatingSessionInstanceAnalysisData) {
    this.eBranchChannelOperatingSessionInstanceAnalysisData = eBranchChannelOperatingSessionInstanceAnalysisData;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return eBranchChannelOperatingSessionInstanceAnalysisReportType
  **/

  public String getEBranchChannelOperatingSessionInstanceAnalysisReportType() {
    return eBranchChannelOperatingSessionInstanceAnalysisReportType;
  }

  @JsonProperty("eBranchChannelOperatingSessionInstanceAnalysisReportType")
  public void setEBranchChannelOperatingSessionInstanceAnalysisReportType(String eBranchChannelOperatingSessionInstanceAnalysisReportType) {
    this.eBranchChannelOperatingSessionInstanceAnalysisReportType = eBranchChannelOperatingSessionInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return eBranchChannelOperatingSessionInstanceAnalysisReport
  **/

  public Object getEBranchChannelOperatingSessionInstanceAnalysisReport() {
    return eBranchChannelOperatingSessionInstanceAnalysisReport;
  }

  @JsonProperty("eBranchChannelOperatingSessionInstanceAnalysisReport")
  public void setEBranchChannelOperatingSessionInstanceAnalysisReport(Object eBranchChannelOperatingSessionInstanceAnalysisReport) {
    this.eBranchChannelOperatingSessionInstanceAnalysisReport = eBranchChannelOperatingSessionInstanceAnalysisReport;
  }


}

