package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQOutboundRetrieveInputModelOutboundInstanceAnalysis;
import org.bian.dto.BQOutboundRetrieveInputModelOutboundInstanceReport;

import javax.validation.Valid;
  
/**
 * BQOutboundRetrieveInputModel
 */
public class BQOutboundRetrieveInputModel   {
  private Object outboundRetrieveActionTaskRecord = null;

  private String outboundRetrieveActionRequest = null;

  private BQOutboundRetrieveInputModelOutboundInstanceReport outboundInstanceReport = null;

  private BQOutboundRetrieveInputModelOutboundInstanceAnalysis outboundInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return outboundRetrieveActionTaskRecord
  **/

  public Object getOutboundRetrieveActionTaskRecord() {
    return outboundRetrieveActionTaskRecord;
  }

  public void setOutboundRetrieveActionTaskRecord(Object outboundRetrieveActionTaskRecord) {
    this.outboundRetrieveActionTaskRecord = outboundRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return outboundRetrieveActionRequest
  **/

  public String getOutboundRetrieveActionRequest() {
    return outboundRetrieveActionRequest;
  }

  public void setOutboundRetrieveActionRequest(String outboundRetrieveActionRequest) {
    this.outboundRetrieveActionRequest = outboundRetrieveActionRequest;
  }


  /**
   * Get outboundInstanceReport
   * @return outboundInstanceReport
  **/

  public BQOutboundRetrieveInputModelOutboundInstanceReport getOutboundInstanceReport() {
    return outboundInstanceReport;
  }

  public void setOutboundInstanceReport(BQOutboundRetrieveInputModelOutboundInstanceReport outboundInstanceReport) {
    this.outboundInstanceReport = outboundInstanceReport;
  }


  /**
   * Get outboundInstanceAnalysis
   * @return outboundInstanceAnalysis
  **/

  public BQOutboundRetrieveInputModelOutboundInstanceAnalysis getOutboundInstanceAnalysis() {
    return outboundInstanceAnalysis;
  }

  public void setOutboundInstanceAnalysis(BQOutboundRetrieveInputModelOutboundInstanceAnalysis outboundInstanceAnalysis) {
    this.outboundInstanceAnalysis = outboundInstanceAnalysis;
  }


}

