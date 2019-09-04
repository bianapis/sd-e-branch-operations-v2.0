package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CREBranchChannelOperatingSessionRequestOutputModelEBranchChannelOperatingSessionInstanceRecordEBranchProductionIssueRecord;

import javax.validation.Valid;
  
/**
 * CREBranchChannelOperatingSessionRequestOutputModelEBranchChannelOperatingSessionInstanceRecord
 */
public class CREBranchChannelOperatingSessionRequestOutputModelEBranchChannelOperatingSessionInstanceRecord   {
  private CREBranchChannelOperatingSessionRequestOutputModelEBranchChannelOperatingSessionInstanceRecordEBranchProductionIssueRecord eBranchProductionIssueRecord = null;


  /**
   * Get eBranchProductionIssueRecord
   * @return eBranchProductionIssueRecord
  **/

  public CREBranchChannelOperatingSessionRequestOutputModelEBranchChannelOperatingSessionInstanceRecordEBranchProductionIssueRecord getEBranchProductionIssueRecord() {
    return eBranchProductionIssueRecord;
  }

  @JsonProperty("eBranchProductionIssueRecord")
  public void setEBranchProductionIssueRecord(CREBranchChannelOperatingSessionRequestOutputModelEBranchChannelOperatingSessionInstanceRecordEBranchProductionIssueRecord eBranchProductionIssueRecord) {
    this.eBranchProductionIssueRecord = eBranchProductionIssueRecord;
  }


}

