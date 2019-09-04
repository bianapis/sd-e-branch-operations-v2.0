package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQInboundInitiateInputModelEBranchChannelOperatingSessionInstanceRecord
 */
public class BQInboundInitiateInputModelEBranchChannelOperatingSessionInstanceRecord   {
  private String eBranchOperationsServiceMenu = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The channel customer selection menu - selection is configurable for the session. This is used optionally to identify the purpose of the connection 
   * @return eBranchOperationsServiceMenu
  **/

  public String getEBranchOperationsServiceMenu() {
    return eBranchOperationsServiceMenu;
  }

  public void setEBranchOperationsServiceMenu(String eBranchOperationsServiceMenu) {
    this.eBranchOperationsServiceMenu = eBranchOperationsServiceMenu;
  }


}

