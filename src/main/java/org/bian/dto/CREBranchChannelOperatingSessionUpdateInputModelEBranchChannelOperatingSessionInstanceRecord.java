package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CREBranchChannelOperatingSessionUpdateInputModelEBranchChannelOperatingSessionInstanceRecordEBranchProductionIssueRecord;

import javax.validation.Valid;
  
/**
 * CREBranchChannelOperatingSessionUpdateInputModelEBranchChannelOperatingSessionInstanceRecord
 */
public class CREBranchChannelOperatingSessionUpdateInputModelEBranchChannelOperatingSessionInstanceRecord   {
  private String eBranchOperationsServiceMenu = null;

  private String eBranchServiceSessionStatistics = null;

  private String eBranchServiceSessionReportType = null;

  private Object eBranchServiceSessionReport = null;

  private CREBranchChannelOperatingSessionUpdateInputModelEBranchChannelOperatingSessionInstanceRecordEBranchProductionIssueRecord eBranchProductionIssueRecord = null;


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


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: Session reports that can be accessed during the session (e.g. real-time status, session statistics) 
   * @return eBranchServiceSessionReportType
  **/

  public String getEBranchServiceSessionReportType() {
    return eBranchServiceSessionReportType;
  }

  @JsonProperty("eBranchServiceSessionReportType")
  public void setEBranchServiceSessionReportType(String eBranchServiceSessionReportType) {
    this.eBranchServiceSessionReportType = eBranchServiceSessionReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The session activity report 
   * @return eBranchServiceSessionReport
  **/

  public Object getEBranchServiceSessionReport() {
    return eBranchServiceSessionReport;
  }

  @JsonProperty("eBranchServiceSessionReport")
  public void setEBranchServiceSessionReport(Object eBranchServiceSessionReport) {
    this.eBranchServiceSessionReport = eBranchServiceSessionReport;
  }


  /**
   * Get eBranchProductionIssueRecord
   * @return eBranchProductionIssueRecord
  **/

  public CREBranchChannelOperatingSessionUpdateInputModelEBranchChannelOperatingSessionInstanceRecordEBranchProductionIssueRecord getEBranchProductionIssueRecord() {
    return eBranchProductionIssueRecord;
  }

  @JsonProperty("eBranchProductionIssueRecord")
  public void setEBranchProductionIssueRecord(CREBranchChannelOperatingSessionUpdateInputModelEBranchChannelOperatingSessionInstanceRecordEBranchProductionIssueRecord eBranchProductionIssueRecord) {
    this.eBranchProductionIssueRecord = eBranchProductionIssueRecord;
  }


}

