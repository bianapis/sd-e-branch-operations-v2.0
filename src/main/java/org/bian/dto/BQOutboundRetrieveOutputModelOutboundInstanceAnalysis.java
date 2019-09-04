package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQOutboundRetrieveOutputModelOutboundInstanceAnalysis
 */
public class BQOutboundRetrieveOutputModelOutboundInstanceAnalysis   {
  private Object outboundInstanceAnalysisRecord = null;

  private String outboundInstanceAnalysisReportType = null;

  private String outboundInstanceAnalysisParameters = null;

  private Object outboundInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return outboundInstanceAnalysisRecord
  **/

  public Object getOutboundInstanceAnalysisRecord() {
    return outboundInstanceAnalysisRecord;
  }

  public void setOutboundInstanceAnalysisRecord(Object outboundInstanceAnalysisRecord) {
    this.outboundInstanceAnalysisRecord = outboundInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return outboundInstanceAnalysisReportType
  **/

  public String getOutboundInstanceAnalysisReportType() {
    return outboundInstanceAnalysisReportType;
  }

  public void setOutboundInstanceAnalysisReportType(String outboundInstanceAnalysisReportType) {
    this.outboundInstanceAnalysisReportType = outboundInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return outboundInstanceAnalysisParameters
  **/

  public String getOutboundInstanceAnalysisParameters() {
    return outboundInstanceAnalysisParameters;
  }

  public void setOutboundInstanceAnalysisParameters(String outboundInstanceAnalysisParameters) {
    this.outboundInstanceAnalysisParameters = outboundInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate
   * @return outboundInstanceAnalysisReport
  **/

  public Object getOutboundInstanceAnalysisReport() {
    return outboundInstanceAnalysisReport;
  }

  public void setOutboundInstanceAnalysisReport(Object outboundInstanceAnalysisReport) {
    this.outboundInstanceAnalysisReport = outboundInstanceAnalysisReport;
  }


}

