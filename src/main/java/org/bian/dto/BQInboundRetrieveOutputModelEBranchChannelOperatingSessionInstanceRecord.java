package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQInboundRetrieveOutputModelEBranchChannelOperatingSessionInstanceRecord
 */
public class BQInboundRetrieveOutputModelEBranchChannelOperatingSessionInstanceRecord   {
  private String eBranchOperationsServiceMenu = null;

  private String eBranchServiceSessionStatistics = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The channel customer selection menu - selection is configurable for the session. This is used optionally to identify the purpose of the connection 
   * @return eBranchOperationsServiceMenu
  **/

  public String getEBranchOperationsServiceMenu() {
    return eBranchOperationsServiceMenu;
  }

  @JsonProperty("eBranchOperationsServiceMenu")
  public void setEBranchOperationsServiceMenu(String eBranchOperationsServiceMenu) {
    this.eBranchOperationsServiceMenu = eBranchOperationsServiceMenu;
  }


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

