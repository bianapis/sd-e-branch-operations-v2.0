package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CREBranchChannelOperatingSessionRetrieveInputModelEBranchChannelOperatingSessionInstanceReportRecord
 */
public class CREBranchChannelOperatingSessionRetrieveInputModelEBranchChannelOperatingSessionInstanceReportRecord   {
  private String eBranchChannelOperatingSessionInstanceReportReference = null;

  private String eBranchChannelOperatingSessionInstanceReportType = null;

  private String eBranchChannelOperatingSessionInstanceReportParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return eBranchChannelOperatingSessionInstanceReportReference
  **/

  public String getEBranchChannelOperatingSessionInstanceReportReference() {
    return eBranchChannelOperatingSessionInstanceReportReference;
  }

  public void setEBranchChannelOperatingSessionInstanceReportReference(String eBranchChannelOperatingSessionInstanceReportReference) {
    this.eBranchChannelOperatingSessionInstanceReportReference = eBranchChannelOperatingSessionInstanceReportReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return eBranchChannelOperatingSessionInstanceReportType
  **/

  public String getEBranchChannelOperatingSessionInstanceReportType() {
    return eBranchChannelOperatingSessionInstanceReportType;
  }

  public void setEBranchChannelOperatingSessionInstanceReportType(String eBranchChannelOperatingSessionInstanceReportType) {
    this.eBranchChannelOperatingSessionInstanceReportType = eBranchChannelOperatingSessionInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return eBranchChannelOperatingSessionInstanceReportParameters
  **/

  public String getEBranchChannelOperatingSessionInstanceReportParameters() {
    return eBranchChannelOperatingSessionInstanceReportParameters;
  }

  public void setEBranchChannelOperatingSessionInstanceReportParameters(String eBranchChannelOperatingSessionInstanceReportParameters) {
    this.eBranchChannelOperatingSessionInstanceReportParameters = eBranchChannelOperatingSessionInstanceReportParameters;
  }


}

