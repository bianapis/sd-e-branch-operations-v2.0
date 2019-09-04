package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQInboundInitiateOutputModelEBranchChannelOperatingSessionInstanceRecord;
import org.bian.dto.BQOutboundInitiateInputModelOutboundInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQOutboundInitiateInputModel
 */
public class BQOutboundInitiateInputModel   {
  private BQInboundInitiateOutputModelEBranchChannelOperatingSessionInstanceRecord eBranchChannelOperatingSessionInstanceRecord = null;

  private String eBranchChannelOperatingSessionInstanceReference = null;

  private Object outboundInitiateActionRecord = null;

  private BQOutboundInitiateInputModelOutboundInstanceRecord outboundInstanceRecord = null;


  /**
   * Get eBranchChannelOperatingSessionInstanceRecord
   * @return eBranchChannelOperatingSessionInstanceRecord
  **/

  public BQInboundInitiateOutputModelEBranchChannelOperatingSessionInstanceRecord getEBranchChannelOperatingSessionInstanceRecord() {
    return eBranchChannelOperatingSessionInstanceRecord;
  }

  public void setEBranchChannelOperatingSessionInstanceRecord(BQInboundInitiateOutputModelEBranchChannelOperatingSessionInstanceRecord eBranchChannelOperatingSessionInstanceRecord) {
    this.eBranchChannelOperatingSessionInstanceRecord = eBranchChannelOperatingSessionInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent EBranch Channel Operating Session instance 
   * @return eBranchChannelOperatingSessionInstanceReference
  **/

  public String getEBranchChannelOperatingSessionInstanceReference() {
    return eBranchChannelOperatingSessionInstanceReference;
  }

  public void setEBranchChannelOperatingSessionInstanceReference(String eBranchChannelOperatingSessionInstanceReference) {
    this.eBranchChannelOperatingSessionInstanceReference = eBranchChannelOperatingSessionInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return outboundInitiateActionRecord
  **/

  public Object getOutboundInitiateActionRecord() {
    return outboundInitiateActionRecord;
  }

  public void setOutboundInitiateActionRecord(Object outboundInitiateActionRecord) {
    this.outboundInitiateActionRecord = outboundInitiateActionRecord;
  }


  /**
   * Get outboundInstanceRecord
   * @return outboundInstanceRecord
  **/

  public BQOutboundInitiateInputModelOutboundInstanceRecord getOutboundInstanceRecord() {
    return outboundInstanceRecord;
  }

  public void setOutboundInstanceRecord(BQOutboundInitiateInputModelOutboundInstanceRecord outboundInstanceRecord) {
    this.outboundInstanceRecord = outboundInstanceRecord;
  }


}

