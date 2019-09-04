package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQInboundRetrieveOutputModelInboundInstanceAnalysis
 */
public class BQInboundRetrieveOutputModelInboundInstanceAnalysis   {
  private Object inboundInstanceAnalysisRecord = null;

  private String inboundInstanceAnalysisReportType = null;

  private String inboundInstanceAnalysisParameters = null;

  private Object inboundInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return inboundInstanceAnalysisRecord
  **/

  public Object getInboundInstanceAnalysisRecord() {
    return inboundInstanceAnalysisRecord;
  }

  public void setInboundInstanceAnalysisRecord(Object inboundInstanceAnalysisRecord) {
    this.inboundInstanceAnalysisRecord = inboundInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return inboundInstanceAnalysisReportType
  **/

  public String getInboundInstanceAnalysisReportType() {
    return inboundInstanceAnalysisReportType;
  }

  public void setInboundInstanceAnalysisReportType(String inboundInstanceAnalysisReportType) {
    this.inboundInstanceAnalysisReportType = inboundInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return inboundInstanceAnalysisParameters
  **/

  public String getInboundInstanceAnalysisParameters() {
    return inboundInstanceAnalysisParameters;
  }

  public void setInboundInstanceAnalysisParameters(String inboundInstanceAnalysisParameters) {
    this.inboundInstanceAnalysisParameters = inboundInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return inboundInstanceAnalysisReport
  **/

  public Object getInboundInstanceAnalysisReport() {
    return inboundInstanceAnalysisReport;
  }

  public void setInboundInstanceAnalysisReport(Object inboundInstanceAnalysisReport) {
    this.inboundInstanceAnalysisReport = inboundInstanceAnalysisReport;
  }


}

