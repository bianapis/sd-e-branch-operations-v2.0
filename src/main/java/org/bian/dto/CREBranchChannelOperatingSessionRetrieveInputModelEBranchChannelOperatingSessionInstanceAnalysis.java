package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CREBranchChannelOperatingSessionRetrieveInputModelEBranchChannelOperatingSessionInstanceAnalysis
 */
public class CREBranchChannelOperatingSessionRetrieveInputModelEBranchChannelOperatingSessionInstanceAnalysis   {
  private String eBranchChannelOperatingSessionInstanceAnalysisReference = null;

  private String eBranchChannelOperatingSessionInstanceAnalysisReportType = null;

  private String eBranchChannelOperatingSessionInstanceAnalysisParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return eBranchChannelOperatingSessionInstanceAnalysisReference
  **/

  public String getEBranchChannelOperatingSessionInstanceAnalysisReference() {
    return eBranchChannelOperatingSessionInstanceAnalysisReference;
  }

  public void setEBranchChannelOperatingSessionInstanceAnalysisReference(String eBranchChannelOperatingSessionInstanceAnalysisReference) {
    this.eBranchChannelOperatingSessionInstanceAnalysisReference = eBranchChannelOperatingSessionInstanceAnalysisReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return eBranchChannelOperatingSessionInstanceAnalysisReportType
  **/

  public String getEBranchChannelOperatingSessionInstanceAnalysisReportType() {
    return eBranchChannelOperatingSessionInstanceAnalysisReportType;
  }

  public void setEBranchChannelOperatingSessionInstanceAnalysisReportType(String eBranchChannelOperatingSessionInstanceAnalysisReportType) {
    this.eBranchChannelOperatingSessionInstanceAnalysisReportType = eBranchChannelOperatingSessionInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return eBranchChannelOperatingSessionInstanceAnalysisParameters
  **/

  public String getEBranchChannelOperatingSessionInstanceAnalysisParameters() {
    return eBranchChannelOperatingSessionInstanceAnalysisParameters;
  }

  public void setEBranchChannelOperatingSessionInstanceAnalysisParameters(String eBranchChannelOperatingSessionInstanceAnalysisParameters) {
    this.eBranchChannelOperatingSessionInstanceAnalysisParameters = eBranchChannelOperatingSessionInstanceAnalysisParameters;
  }


}

