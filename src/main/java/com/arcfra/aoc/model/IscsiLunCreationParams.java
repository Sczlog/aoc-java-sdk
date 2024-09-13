package com.arcfra.aoc.model;

import java.util.Objects;
import java.util.Arrays;
import com.arcfra.aoc.model.BPSUnit;
import com.arcfra.aoc.model.ByteUnit;
import com.arcfra.aoc.model.IscsiLunCommonParams;
import com.arcfra.aoc.model.IscsiLunCreationParamsAllOf;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * IscsiLunCreationParams
 */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class IscsiLunCreationParams {
  public static final String SERIALIZED_NAME_LUN_ID = "lun_id";
  @SerializedName(SERIALIZED_NAME_LUN_ID)
  private Integer lunId;

  public static final String SERIALIZED_NAME_ASSIGNED_SIZE_UNIT = "assigned_size_unit";
  @SerializedName(SERIALIZED_NAME_ASSIGNED_SIZE_UNIT)
  private ByteUnit assignedSizeUnit;

  public static final String SERIALIZED_NAME_ASSIGNED_SIZE = "assigned_size";
  @SerializedName(SERIALIZED_NAME_ASSIGNED_SIZE)
  private Long assignedSize;

  public static final String SERIALIZED_NAME_REPLICA_NUM = "replica_num";
  @SerializedName(SERIALIZED_NAME_REPLICA_NUM)
  private Integer replicaNum;

  public static final String SERIALIZED_NAME_ISCSI_TARGET_ID = "iscsi_target_id";
  @SerializedName(SERIALIZED_NAME_ISCSI_TARGET_ID)
  private String iscsiTargetId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_BPS_WR_MAX_LENGTH = "bps_wr_max_length";
  @SerializedName(SERIALIZED_NAME_BPS_WR_MAX_LENGTH)
  private Long bpsWrMaxLength;

  public static final String SERIALIZED_NAME_BPS_WR_MAX_UNIT = "bps_wr_max_unit";
  @SerializedName(SERIALIZED_NAME_BPS_WR_MAX_UNIT)
  private BPSUnit bpsWrMaxUnit;

  public static final String SERIALIZED_NAME_BPS_WR_MAX = "bps_wr_max";
  @SerializedName(SERIALIZED_NAME_BPS_WR_MAX)
  private Long bpsWrMax;

  public static final String SERIALIZED_NAME_BPS_RD_MAX_LENGTH = "bps_rd_max_length";
  @SerializedName(SERIALIZED_NAME_BPS_RD_MAX_LENGTH)
  private Long bpsRdMaxLength;

  public static final String SERIALIZED_NAME_BPS_RD_MAX_UNIT = "bps_rd_max_unit";
  @SerializedName(SERIALIZED_NAME_BPS_RD_MAX_UNIT)
  private BPSUnit bpsRdMaxUnit;

  public static final String SERIALIZED_NAME_BPS_RD_MAX = "bps_rd_max";
  @SerializedName(SERIALIZED_NAME_BPS_RD_MAX)
  private Long bpsRdMax;

  public static final String SERIALIZED_NAME_BPS_MAX_LENGTH = "bps_max_length";
  @SerializedName(SERIALIZED_NAME_BPS_MAX_LENGTH)
  private Long bpsMaxLength;

  public static final String SERIALIZED_NAME_BPS_MAX_UNIT = "bps_max_unit";
  @SerializedName(SERIALIZED_NAME_BPS_MAX_UNIT)
  private BPSUnit bpsMaxUnit;

  public static final String SERIALIZED_NAME_BPS_MAX = "bps_max";
  @SerializedName(SERIALIZED_NAME_BPS_MAX)
  private Long bpsMax;

  public static final String SERIALIZED_NAME_IOPS_WR_MAX_LENGTH = "iops_wr_max_length";
  @SerializedName(SERIALIZED_NAME_IOPS_WR_MAX_LENGTH)
  private Long iopsWrMaxLength;

  public static final String SERIALIZED_NAME_IOPS_WR_MAX = "iops_wr_max";
  @SerializedName(SERIALIZED_NAME_IOPS_WR_MAX)
  private Long iopsWrMax;

  public static final String SERIALIZED_NAME_IOPS_RD_MAX_LENGTH = "iops_rd_max_length";
  @SerializedName(SERIALIZED_NAME_IOPS_RD_MAX_LENGTH)
  private Long iopsRdMaxLength;

  public static final String SERIALIZED_NAME_IOPS_RD_MAX = "iops_rd_max";
  @SerializedName(SERIALIZED_NAME_IOPS_RD_MAX)
  private Long iopsRdMax;

  public static final String SERIALIZED_NAME_IOPS_MAX_LENGTH = "iops_max_length";
  @SerializedName(SERIALIZED_NAME_IOPS_MAX_LENGTH)
  private Long iopsMaxLength;

  public static final String SERIALIZED_NAME_IOPS_MAX = "iops_max";
  @SerializedName(SERIALIZED_NAME_IOPS_MAX)
  private Long iopsMax;

  public static final String SERIALIZED_NAME_BPS_WR_UNIT = "bps_wr_unit";
  @SerializedName(SERIALIZED_NAME_BPS_WR_UNIT)
  private BPSUnit bpsWrUnit;

  public static final String SERIALIZED_NAME_BPS_WR = "bps_wr";
  @SerializedName(SERIALIZED_NAME_BPS_WR)
  private Long bpsWr;

  public static final String SERIALIZED_NAME_BPS_RD_UNIT = "bps_rd_unit";
  @SerializedName(SERIALIZED_NAME_BPS_RD_UNIT)
  private BPSUnit bpsRdUnit;

  public static final String SERIALIZED_NAME_BPS_RD = "bps_rd";
  @SerializedName(SERIALIZED_NAME_BPS_RD)
  private Long bpsRd;

  public static final String SERIALIZED_NAME_BPS_UNIT = "bps_unit";
  @SerializedName(SERIALIZED_NAME_BPS_UNIT)
  private BPSUnit bpsUnit;

  public static final String SERIALIZED_NAME_BPS = "bps";
  @SerializedName(SERIALIZED_NAME_BPS)
  private Long bps;

  public static final String SERIALIZED_NAME_IOPS_WR = "iops_wr";
  @SerializedName(SERIALIZED_NAME_IOPS_WR)
  private Long iopsWr;

  public static final String SERIALIZED_NAME_IOPS_RD = "iops_rd";
  @SerializedName(SERIALIZED_NAME_IOPS_RD)
  private Long iopsRd;

  public static final String SERIALIZED_NAME_IOPS = "iops";
  @SerializedName(SERIALIZED_NAME_IOPS)
  private Long iops;

  public static final String SERIALIZED_NAME_ALLOWED_INITIATORS = "allowed_initiators";
  @SerializedName(SERIALIZED_NAME_ALLOWED_INITIATORS)
  private String allowedInitiators;

  public IscsiLunCreationParams() { 
  }

  public IscsiLunCreationParams lunId(Integer lunId) {
    
    this.lunId = lunId;
    return this;
  }

   /**
   * Get lunId
   * @return lunId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getLunId() {
    return lunId;
  }


  public void setLunId(Integer lunId) {
    this.lunId = lunId;
  }


  public IscsiLunCreationParams assignedSizeUnit(ByteUnit assignedSizeUnit) {
    
    this.assignedSizeUnit = assignedSizeUnit;
    return this;
  }

   /**
   * Get assignedSizeUnit
   * @return assignedSizeUnit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ByteUnit getAssignedSizeUnit() {
    return assignedSizeUnit;
  }


  public void setAssignedSizeUnit(ByteUnit assignedSizeUnit) {
    this.assignedSizeUnit = assignedSizeUnit;
  }


  public IscsiLunCreationParams assignedSize(Long assignedSize) {
    
    this.assignedSize = assignedSize;
    return this;
  }

   /**
   * Get assignedSize
   * @return assignedSize
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Long getAssignedSize() {
    return assignedSize;
  }


  public void setAssignedSize(Long assignedSize) {
    this.assignedSize = assignedSize;
  }


  public IscsiLunCreationParams replicaNum(Integer replicaNum) {
    
    this.replicaNum = replicaNum;
    return this;
  }

   /**
   * Get replicaNum
   * @return replicaNum
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getReplicaNum() {
    return replicaNum;
  }


  public void setReplicaNum(Integer replicaNum) {
    this.replicaNum = replicaNum;
  }


  public IscsiLunCreationParams iscsiTargetId(String iscsiTargetId) {
    
    this.iscsiTargetId = iscsiTargetId;
    return this;
  }

   /**
   * Get iscsiTargetId
   * @return iscsiTargetId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getIscsiTargetId() {
    return iscsiTargetId;
  }


  public void setIscsiTargetId(String iscsiTargetId) {
    this.iscsiTargetId = iscsiTargetId;
  }


  public IscsiLunCreationParams name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public IscsiLunCreationParams bpsWrMaxLength(Long bpsWrMaxLength) {
    
    this.bpsWrMaxLength = bpsWrMaxLength;
    return this;
  }

   /**
   * Get bpsWrMaxLength
   * @return bpsWrMaxLength
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getBpsWrMaxLength() {
    return bpsWrMaxLength;
  }


  public void setBpsWrMaxLength(Long bpsWrMaxLength) {
    this.bpsWrMaxLength = bpsWrMaxLength;
  }


  public IscsiLunCreationParams bpsWrMaxUnit(BPSUnit bpsWrMaxUnit) {
    
    this.bpsWrMaxUnit = bpsWrMaxUnit;
    return this;
  }

   /**
   * Get bpsWrMaxUnit
   * @return bpsWrMaxUnit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BPSUnit getBpsWrMaxUnit() {
    return bpsWrMaxUnit;
  }


  public void setBpsWrMaxUnit(BPSUnit bpsWrMaxUnit) {
    this.bpsWrMaxUnit = bpsWrMaxUnit;
  }


  public IscsiLunCreationParams bpsWrMax(Long bpsWrMax) {
    
    this.bpsWrMax = bpsWrMax;
    return this;
  }

   /**
   * Get bpsWrMax
   * @return bpsWrMax
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getBpsWrMax() {
    return bpsWrMax;
  }


  public void setBpsWrMax(Long bpsWrMax) {
    this.bpsWrMax = bpsWrMax;
  }


  public IscsiLunCreationParams bpsRdMaxLength(Long bpsRdMaxLength) {
    
    this.bpsRdMaxLength = bpsRdMaxLength;
    return this;
  }

   /**
   * Get bpsRdMaxLength
   * @return bpsRdMaxLength
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getBpsRdMaxLength() {
    return bpsRdMaxLength;
  }


  public void setBpsRdMaxLength(Long bpsRdMaxLength) {
    this.bpsRdMaxLength = bpsRdMaxLength;
  }


  public IscsiLunCreationParams bpsRdMaxUnit(BPSUnit bpsRdMaxUnit) {
    
    this.bpsRdMaxUnit = bpsRdMaxUnit;
    return this;
  }

   /**
   * Get bpsRdMaxUnit
   * @return bpsRdMaxUnit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BPSUnit getBpsRdMaxUnit() {
    return bpsRdMaxUnit;
  }


  public void setBpsRdMaxUnit(BPSUnit bpsRdMaxUnit) {
    this.bpsRdMaxUnit = bpsRdMaxUnit;
  }


  public IscsiLunCreationParams bpsRdMax(Long bpsRdMax) {
    
    this.bpsRdMax = bpsRdMax;
    return this;
  }

   /**
   * Get bpsRdMax
   * @return bpsRdMax
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getBpsRdMax() {
    return bpsRdMax;
  }


  public void setBpsRdMax(Long bpsRdMax) {
    this.bpsRdMax = bpsRdMax;
  }


  public IscsiLunCreationParams bpsMaxLength(Long bpsMaxLength) {
    
    this.bpsMaxLength = bpsMaxLength;
    return this;
  }

   /**
   * Get bpsMaxLength
   * @return bpsMaxLength
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getBpsMaxLength() {
    return bpsMaxLength;
  }


  public void setBpsMaxLength(Long bpsMaxLength) {
    this.bpsMaxLength = bpsMaxLength;
  }


  public IscsiLunCreationParams bpsMaxUnit(BPSUnit bpsMaxUnit) {
    
    this.bpsMaxUnit = bpsMaxUnit;
    return this;
  }

   /**
   * Get bpsMaxUnit
   * @return bpsMaxUnit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BPSUnit getBpsMaxUnit() {
    return bpsMaxUnit;
  }


  public void setBpsMaxUnit(BPSUnit bpsMaxUnit) {
    this.bpsMaxUnit = bpsMaxUnit;
  }


  public IscsiLunCreationParams bpsMax(Long bpsMax) {
    
    this.bpsMax = bpsMax;
    return this;
  }

   /**
   * Get bpsMax
   * @return bpsMax
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getBpsMax() {
    return bpsMax;
  }


  public void setBpsMax(Long bpsMax) {
    this.bpsMax = bpsMax;
  }


  public IscsiLunCreationParams iopsWrMaxLength(Long iopsWrMaxLength) {
    
    this.iopsWrMaxLength = iopsWrMaxLength;
    return this;
  }

   /**
   * Get iopsWrMaxLength
   * @return iopsWrMaxLength
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getIopsWrMaxLength() {
    return iopsWrMaxLength;
  }


  public void setIopsWrMaxLength(Long iopsWrMaxLength) {
    this.iopsWrMaxLength = iopsWrMaxLength;
  }


  public IscsiLunCreationParams iopsWrMax(Long iopsWrMax) {
    
    this.iopsWrMax = iopsWrMax;
    return this;
  }

   /**
   * Get iopsWrMax
   * @return iopsWrMax
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getIopsWrMax() {
    return iopsWrMax;
  }


  public void setIopsWrMax(Long iopsWrMax) {
    this.iopsWrMax = iopsWrMax;
  }


  public IscsiLunCreationParams iopsRdMaxLength(Long iopsRdMaxLength) {
    
    this.iopsRdMaxLength = iopsRdMaxLength;
    return this;
  }

   /**
   * Get iopsRdMaxLength
   * @return iopsRdMaxLength
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getIopsRdMaxLength() {
    return iopsRdMaxLength;
  }


  public void setIopsRdMaxLength(Long iopsRdMaxLength) {
    this.iopsRdMaxLength = iopsRdMaxLength;
  }


  public IscsiLunCreationParams iopsRdMax(Long iopsRdMax) {
    
    this.iopsRdMax = iopsRdMax;
    return this;
  }

   /**
   * Get iopsRdMax
   * @return iopsRdMax
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getIopsRdMax() {
    return iopsRdMax;
  }


  public void setIopsRdMax(Long iopsRdMax) {
    this.iopsRdMax = iopsRdMax;
  }


  public IscsiLunCreationParams iopsMaxLength(Long iopsMaxLength) {
    
    this.iopsMaxLength = iopsMaxLength;
    return this;
  }

   /**
   * Get iopsMaxLength
   * @return iopsMaxLength
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getIopsMaxLength() {
    return iopsMaxLength;
  }


  public void setIopsMaxLength(Long iopsMaxLength) {
    this.iopsMaxLength = iopsMaxLength;
  }


  public IscsiLunCreationParams iopsMax(Long iopsMax) {
    
    this.iopsMax = iopsMax;
    return this;
  }

   /**
   * Get iopsMax
   * @return iopsMax
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getIopsMax() {
    return iopsMax;
  }


  public void setIopsMax(Long iopsMax) {
    this.iopsMax = iopsMax;
  }


  public IscsiLunCreationParams bpsWrUnit(BPSUnit bpsWrUnit) {
    
    this.bpsWrUnit = bpsWrUnit;
    return this;
  }

   /**
   * Get bpsWrUnit
   * @return bpsWrUnit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BPSUnit getBpsWrUnit() {
    return bpsWrUnit;
  }


  public void setBpsWrUnit(BPSUnit bpsWrUnit) {
    this.bpsWrUnit = bpsWrUnit;
  }


  public IscsiLunCreationParams bpsWr(Long bpsWr) {
    
    this.bpsWr = bpsWr;
    return this;
  }

   /**
   * Get bpsWr
   * @return bpsWr
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getBpsWr() {
    return bpsWr;
  }


  public void setBpsWr(Long bpsWr) {
    this.bpsWr = bpsWr;
  }


  public IscsiLunCreationParams bpsRdUnit(BPSUnit bpsRdUnit) {
    
    this.bpsRdUnit = bpsRdUnit;
    return this;
  }

   /**
   * Get bpsRdUnit
   * @return bpsRdUnit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BPSUnit getBpsRdUnit() {
    return bpsRdUnit;
  }


  public void setBpsRdUnit(BPSUnit bpsRdUnit) {
    this.bpsRdUnit = bpsRdUnit;
  }


  public IscsiLunCreationParams bpsRd(Long bpsRd) {
    
    this.bpsRd = bpsRd;
    return this;
  }

   /**
   * Get bpsRd
   * @return bpsRd
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getBpsRd() {
    return bpsRd;
  }


  public void setBpsRd(Long bpsRd) {
    this.bpsRd = bpsRd;
  }


  public IscsiLunCreationParams bpsUnit(BPSUnit bpsUnit) {
    
    this.bpsUnit = bpsUnit;
    return this;
  }

   /**
   * Get bpsUnit
   * @return bpsUnit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BPSUnit getBpsUnit() {
    return bpsUnit;
  }


  public void setBpsUnit(BPSUnit bpsUnit) {
    this.bpsUnit = bpsUnit;
  }


  public IscsiLunCreationParams bps(Long bps) {
    
    this.bps = bps;
    return this;
  }

   /**
   * Get bps
   * @return bps
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getBps() {
    return bps;
  }


  public void setBps(Long bps) {
    this.bps = bps;
  }


  public IscsiLunCreationParams iopsWr(Long iopsWr) {
    
    this.iopsWr = iopsWr;
    return this;
  }

   /**
   * Get iopsWr
   * @return iopsWr
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getIopsWr() {
    return iopsWr;
  }


  public void setIopsWr(Long iopsWr) {
    this.iopsWr = iopsWr;
  }


  public IscsiLunCreationParams iopsRd(Long iopsRd) {
    
    this.iopsRd = iopsRd;
    return this;
  }

   /**
   * Get iopsRd
   * @return iopsRd
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getIopsRd() {
    return iopsRd;
  }


  public void setIopsRd(Long iopsRd) {
    this.iopsRd = iopsRd;
  }


  public IscsiLunCreationParams iops(Long iops) {
    
    this.iops = iops;
    return this;
  }

   /**
   * Get iops
   * @return iops
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getIops() {
    return iops;
  }


  public void setIops(Long iops) {
    this.iops = iops;
  }


  public IscsiLunCreationParams allowedInitiators(String allowedInitiators) {
    
    this.allowedInitiators = allowedInitiators;
    return this;
  }

   /**
   * Get allowedInitiators
   * @return allowedInitiators
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAllowedInitiators() {
    return allowedInitiators;
  }


  public void setAllowedInitiators(String allowedInitiators) {
    this.allowedInitiators = allowedInitiators;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IscsiLunCreationParams iscsiLunCreationParams = (IscsiLunCreationParams) o;
    return Objects.equals(this.lunId, iscsiLunCreationParams.lunId) &&
        Objects.equals(this.assignedSizeUnit, iscsiLunCreationParams.assignedSizeUnit) &&
        Objects.equals(this.assignedSize, iscsiLunCreationParams.assignedSize) &&
        Objects.equals(this.replicaNum, iscsiLunCreationParams.replicaNum) &&
        Objects.equals(this.iscsiTargetId, iscsiLunCreationParams.iscsiTargetId) &&
        Objects.equals(this.name, iscsiLunCreationParams.name) &&
        Objects.equals(this.bpsWrMaxLength, iscsiLunCreationParams.bpsWrMaxLength) &&
        Objects.equals(this.bpsWrMaxUnit, iscsiLunCreationParams.bpsWrMaxUnit) &&
        Objects.equals(this.bpsWrMax, iscsiLunCreationParams.bpsWrMax) &&
        Objects.equals(this.bpsRdMaxLength, iscsiLunCreationParams.bpsRdMaxLength) &&
        Objects.equals(this.bpsRdMaxUnit, iscsiLunCreationParams.bpsRdMaxUnit) &&
        Objects.equals(this.bpsRdMax, iscsiLunCreationParams.bpsRdMax) &&
        Objects.equals(this.bpsMaxLength, iscsiLunCreationParams.bpsMaxLength) &&
        Objects.equals(this.bpsMaxUnit, iscsiLunCreationParams.bpsMaxUnit) &&
        Objects.equals(this.bpsMax, iscsiLunCreationParams.bpsMax) &&
        Objects.equals(this.iopsWrMaxLength, iscsiLunCreationParams.iopsWrMaxLength) &&
        Objects.equals(this.iopsWrMax, iscsiLunCreationParams.iopsWrMax) &&
        Objects.equals(this.iopsRdMaxLength, iscsiLunCreationParams.iopsRdMaxLength) &&
        Objects.equals(this.iopsRdMax, iscsiLunCreationParams.iopsRdMax) &&
        Objects.equals(this.iopsMaxLength, iscsiLunCreationParams.iopsMaxLength) &&
        Objects.equals(this.iopsMax, iscsiLunCreationParams.iopsMax) &&
        Objects.equals(this.bpsWrUnit, iscsiLunCreationParams.bpsWrUnit) &&
        Objects.equals(this.bpsWr, iscsiLunCreationParams.bpsWr) &&
        Objects.equals(this.bpsRdUnit, iscsiLunCreationParams.bpsRdUnit) &&
        Objects.equals(this.bpsRd, iscsiLunCreationParams.bpsRd) &&
        Objects.equals(this.bpsUnit, iscsiLunCreationParams.bpsUnit) &&
        Objects.equals(this.bps, iscsiLunCreationParams.bps) &&
        Objects.equals(this.iopsWr, iscsiLunCreationParams.iopsWr) &&
        Objects.equals(this.iopsRd, iscsiLunCreationParams.iopsRd) &&
        Objects.equals(this.iops, iscsiLunCreationParams.iops) &&
        Objects.equals(this.allowedInitiators, iscsiLunCreationParams.allowedInitiators);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lunId, assignedSizeUnit, assignedSize, replicaNum, iscsiTargetId, name, bpsWrMaxLength, bpsWrMaxUnit, bpsWrMax, bpsRdMaxLength, bpsRdMaxUnit, bpsRdMax, bpsMaxLength, bpsMaxUnit, bpsMax, iopsWrMaxLength, iopsWrMax, iopsRdMaxLength, iopsRdMax, iopsMaxLength, iopsMax, bpsWrUnit, bpsWr, bpsRdUnit, bpsRd, bpsUnit, bps, iopsWr, iopsRd, iops, allowedInitiators);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IscsiLunCreationParams {\n");
    sb.append("    lunId: ").append(toIndentedString(lunId)).append("\n");
    sb.append("    assignedSizeUnit: ").append(toIndentedString(assignedSizeUnit)).append("\n");
    sb.append("    assignedSize: ").append(toIndentedString(assignedSize)).append("\n");
    sb.append("    replicaNum: ").append(toIndentedString(replicaNum)).append("\n");
    sb.append("    iscsiTargetId: ").append(toIndentedString(iscsiTargetId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    bpsWrMaxLength: ").append(toIndentedString(bpsWrMaxLength)).append("\n");
    sb.append("    bpsWrMaxUnit: ").append(toIndentedString(bpsWrMaxUnit)).append("\n");
    sb.append("    bpsWrMax: ").append(toIndentedString(bpsWrMax)).append("\n");
    sb.append("    bpsRdMaxLength: ").append(toIndentedString(bpsRdMaxLength)).append("\n");
    sb.append("    bpsRdMaxUnit: ").append(toIndentedString(bpsRdMaxUnit)).append("\n");
    sb.append("    bpsRdMax: ").append(toIndentedString(bpsRdMax)).append("\n");
    sb.append("    bpsMaxLength: ").append(toIndentedString(bpsMaxLength)).append("\n");
    sb.append("    bpsMaxUnit: ").append(toIndentedString(bpsMaxUnit)).append("\n");
    sb.append("    bpsMax: ").append(toIndentedString(bpsMax)).append("\n");
    sb.append("    iopsWrMaxLength: ").append(toIndentedString(iopsWrMaxLength)).append("\n");
    sb.append("    iopsWrMax: ").append(toIndentedString(iopsWrMax)).append("\n");
    sb.append("    iopsRdMaxLength: ").append(toIndentedString(iopsRdMaxLength)).append("\n");
    sb.append("    iopsRdMax: ").append(toIndentedString(iopsRdMax)).append("\n");
    sb.append("    iopsMaxLength: ").append(toIndentedString(iopsMaxLength)).append("\n");
    sb.append("    iopsMax: ").append(toIndentedString(iopsMax)).append("\n");
    sb.append("    bpsWrUnit: ").append(toIndentedString(bpsWrUnit)).append("\n");
    sb.append("    bpsWr: ").append(toIndentedString(bpsWr)).append("\n");
    sb.append("    bpsRdUnit: ").append(toIndentedString(bpsRdUnit)).append("\n");
    sb.append("    bpsRd: ").append(toIndentedString(bpsRd)).append("\n");
    sb.append("    bpsUnit: ").append(toIndentedString(bpsUnit)).append("\n");
    sb.append("    bps: ").append(toIndentedString(bps)).append("\n");
    sb.append("    iopsWr: ").append(toIndentedString(iopsWr)).append("\n");
    sb.append("    iopsRd: ").append(toIndentedString(iopsRd)).append("\n");
    sb.append("    iops: ").append(toIndentedString(iops)).append("\n");
    sb.append("    allowedInitiators: ").append(toIndentedString(allowedInitiators)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

