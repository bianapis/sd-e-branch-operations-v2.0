package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQInboundRetrieveInputModelInboundInstanceAnalysis;
import org.bian.dto.BQInboundRetrieveInputModelInboundInstanceReport;

import javax.validation.Valid;
  
/**
 * BQInboundRetrieveInputModel
 */
public class BQInboundRetrieveInputModel   {
  private Object inboundRetrieveActionTaskRecord = null;

  private String inboundRetrieveActionRequest = null;

  private BQInboundRetrieveInputModelInboundInstanceReport inboundInstanceReport = null;

  private BQInboundRetrieveInputModelInboundInstanceAnalysis inboundInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return inboundRetrieveActionTaskRecord
  **/

  public Object getInboundRetrieveActionTaskRecord() {
    return inboundRetrieveActionTaskRecord;
  }

  public void setInboundRetrieveActionTaskRecord(Object inboundRetrieveActionTaskRecord) {
    this.inboundRetrieveActionTaskRecord = inboundRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return inboundRetrieveActionRequest
  **/

  public String getInboundRetrieveActionRequest() {
    return inboundRetrieveActionRequest;
  }

  public void setInboundRetrieveActionRequest(String inboundRetrieveActionRequest) {
    this.inboundRetrieveActionRequest = inboundRetrieveActionRequest;
  }


  /**
   * Get inboundInstanceReport
   * @return inboundInstanceReport
  **/

  public BQInboundRetrieveInputModelInboundInstanceReport getInboundInstanceReport() {
    return inboundInstanceReport;
  }

  public void setInboundInstanceReport(BQInboundRetrieveInputModelInboundInstanceReport inboundInstanceReport) {
    this.inboundInstanceReport = inboundInstanceReport;
  }


  /**
   * Get inboundInstanceAnalysis
   * @return inboundInstanceAnalysis
  **/

  public BQInboundRetrieveInputModelInboundInstanceAnalysis getInboundInstanceAnalysis() {
    return inboundInstanceAnalysis;
  }

  public void setInboundInstanceAnalysis(BQInboundRetrieveInputModelInboundInstanceAnalysis inboundInstanceAnalysis) {
    this.inboundInstanceAnalysis = inboundInstanceAnalysis;
  }


}

