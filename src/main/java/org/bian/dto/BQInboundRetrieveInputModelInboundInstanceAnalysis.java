package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQInboundRetrieveInputModelInboundInstanceAnalysis
 */
public class BQInboundRetrieveInputModelInboundInstanceAnalysis   {
  private String inboundInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return inboundInstanceAnalysisReference
  **/

  public String getInboundInstanceAnalysisReference() {
    return inboundInstanceAnalysisReference;
  }

  public void setInboundInstanceAnalysisReference(String inboundInstanceAnalysisReference) {
    this.inboundInstanceAnalysisReference = inboundInstanceAnalysisReference;
  }


}

