package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQOutboundRetrieveOutputModelOutboundInstanceReport
 */
public class BQOutboundRetrieveOutputModelOutboundInstanceReport   {
  private Object outboundInstanceReportRecord = null;

  private String outboundInstanceReportType = null;

  private String outboundInstanceReportParameters = null;

  private Object outboundInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return outboundInstanceReportRecord
  **/

  public Object getOutboundInstanceReportRecord() {
    return outboundInstanceReportRecord;
  }

  public void setOutboundInstanceReportRecord(Object outboundInstanceReportRecord) {
    this.outboundInstanceReportRecord = outboundInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return outboundInstanceReportType
  **/

  public String getOutboundInstanceReportType() {
    return outboundInstanceReportType;
  }

  public void setOutboundInstanceReportType(String outboundInstanceReportType) {
    this.outboundInstanceReportType = outboundInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return outboundInstanceReportParameters
  **/

  public String getOutboundInstanceReportParameters() {
    return outboundInstanceReportParameters;
  }

  public void setOutboundInstanceReportParameters(String outboundInstanceReportParameters) {
    this.outboundInstanceReportParameters = outboundInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return outboundInstanceReport
  **/

  public Object getOutboundInstanceReport() {
    return outboundInstanceReport;
  }

  public void setOutboundInstanceReport(Object outboundInstanceReport) {
    this.outboundInstanceReport = outboundInstanceReport;
  }


}

