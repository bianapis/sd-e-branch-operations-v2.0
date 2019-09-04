package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQInboundRetrieveOutputModelInboundInstanceReport
 */
public class BQInboundRetrieveOutputModelInboundInstanceReport   {
  private Object inboundInstanceReportRecord = null;

  private String inboundInstanceReportType = null;

  private String inboundInstanceReportParameters = null;

  private Object inboundInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return inboundInstanceReportRecord
  **/

  public Object getInboundInstanceReportRecord() {
    return inboundInstanceReportRecord;
  }

  public void setInboundInstanceReportRecord(Object inboundInstanceReportRecord) {
    this.inboundInstanceReportRecord = inboundInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return inboundInstanceReportType
  **/

  public String getInboundInstanceReportType() {
    return inboundInstanceReportType;
  }

  public void setInboundInstanceReportType(String inboundInstanceReportType) {
    this.inboundInstanceReportType = inboundInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return inboundInstanceReportParameters
  **/

  public String getInboundInstanceReportParameters() {
    return inboundInstanceReportParameters;
  }

  public void setInboundInstanceReportParameters(String inboundInstanceReportParameters) {
    this.inboundInstanceReportParameters = inboundInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return inboundInstanceReport
  **/

  public Object getInboundInstanceReport() {
    return inboundInstanceReport;
  }

  public void setInboundInstanceReport(Object inboundInstanceReport) {
    this.inboundInstanceReport = inboundInstanceReport;
  }


}

