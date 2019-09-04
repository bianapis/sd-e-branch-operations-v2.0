package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQInboundInitiateOutputModelEBranchChannelOperatingSessionInstanceRecord
 */
public class BQInboundInitiateOutputModelEBranchChannelOperatingSessionInstanceRecord   {
  private String eBranchServiceSessionStatistics = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Service activity statistics that are maintained during the session 
   * @return eBranchServiceSessionStatistics
  **/

  public String getEBranchServiceSessionStatistics() {
    return eBranchServiceSessionStatistics;
  }

  @JsonProperty("eBranchServiceSessionStatistics")
  public void setEBranchServiceSessionStatistics(String eBranchServiceSessionStatistics) {
    this.eBranchServiceSessionStatistics = eBranchServiceSessionStatistics;
  }


}

