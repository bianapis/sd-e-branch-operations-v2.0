package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CREBranchChannelOperatingSessionRequestInputModelEBranchChannelOperatingSessionInstanceRecordEBranchProductionIssueRecord;

import javax.validation.Valid;
  
/**
 * CREBranchChannelOperatingSessionRequestInputModelEBranchChannelOperatingSessionInstanceRecord
 */
public class CREBranchChannelOperatingSessionRequestInputModelEBranchChannelOperatingSessionInstanceRecord   {
  private CREBranchChannelOperatingSessionRequestInputModelEBranchChannelOperatingSessionInstanceRecordEBranchProductionIssueRecord eBranchProductionIssueRecord = null;


  /**
   * Get eBranchProductionIssueRecord
   * @return eBranchProductionIssueRecord
  **/

  public CREBranchChannelOperatingSessionRequestInputModelEBranchChannelOperatingSessionInstanceRecordEBranchProductionIssueRecord getEBranchProductionIssueRecord() {
    return eBranchProductionIssueRecord;
  }

  public void setEBranchProductionIssueRecord(CREBranchChannelOperatingSessionRequestInputModelEBranchChannelOperatingSessionInstanceRecordEBranchProductionIssueRecord eBranchProductionIssueRecord) {
    this.eBranchProductionIssueRecord = eBranchProductionIssueRecord;
  }


}

