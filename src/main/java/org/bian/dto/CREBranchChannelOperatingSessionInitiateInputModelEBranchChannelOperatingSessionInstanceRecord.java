package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CREBranchChannelOperatingSessionInitiateInputModelEBranchChannelOperatingSessionInstanceRecordEBranchProductionIssueRecord;

import javax.validation.Valid;
  
/**
 * CREBranchChannelOperatingSessionInitiateInputModelEBranchChannelOperatingSessionInstanceRecord
 */
public class CREBranchChannelOperatingSessionInitiateInputModelEBranchChannelOperatingSessionInstanceRecord   {
  private String eBranchOperationsServiceMenu = null;

  private String eBranchServiceSessionReportType = null;

  private CREBranchChannelOperatingSessionInitiateInputModelEBranchChannelOperatingSessionInstanceRecordEBranchProductionIssueRecord eBranchProductionIssueRecord = null;


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


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: Session reports that can be accessed during the session (e.g. real-time status, session statistics) 
   * @return eBranchServiceSessionReportType
  **/

  public String getEBranchServiceSessionReportType() {
    return eBranchServiceSessionReportType;
  }

  public void setEBranchServiceSessionReportType(String eBranchServiceSessionReportType) {
    this.eBranchServiceSessionReportType = eBranchServiceSessionReportType;
  }


  /**
   * Get eBranchProductionIssueRecord
   * @return eBranchProductionIssueRecord
  **/

  public CREBranchChannelOperatingSessionInitiateInputModelEBranchChannelOperatingSessionInstanceRecordEBranchProductionIssueRecord getEBranchProductionIssueRecord() {
    return eBranchProductionIssueRecord;
  }

  public void setEBranchProductionIssueRecord(CREBranchChannelOperatingSessionInitiateInputModelEBranchChannelOperatingSessionInstanceRecordEBranchProductionIssueRecord eBranchProductionIssueRecord) {
    this.eBranchProductionIssueRecord = eBranchProductionIssueRecord;
  }


}

