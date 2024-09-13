package com.arcfra.aoc.model;

import java.util.Objects;
import java.util.Arrays;
import com.arcfra.aoc.model.BPSUnit;
import com.arcfra.aoc.model.ByteUnit;
import com.arcfra.aoc.model.IscsiTargetCommonParams;
import com.arcfra.aoc.model.IscsiTargetCommonParamsInitiatorChaps;
import com.arcfra.aoc.model.IscsiTargetCreationParamsAllOf;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * IscsiTargetCreationParams
 */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class IscsiTargetCreationParams {
  public static final String SERIALIZED_NAME_STRIPE_SIZE_UNIT = "stripe_size_unit";
  @SerializedName(SERIALIZED_NAME_STRIPE_SIZE_UNIT)
  private ByteUnit stripeSizeUnit;

  public static final String SERIALIZED_NAME_STRIPE_SIZE = "stripe_size";
  @SerializedName(SERIALIZED_NAME_STRIPE_SIZE)
  private Long stripeSize;

  public static final String SERIALIZED_NAME_STRIPE_NUM = "stripe_num";
  @SerializedName(SERIALIZED_NAME_STRIPE_NUM)
  private Integer stripeNum;

  public static final String SERIALIZED_NAME_REPLICA_NUM = "replica_num";
  @SerializedName(SERIALIZED_NAME_REPLICA_NUM)
  private Integer replicaNum;

  public static final String SERIALIZED_NAME_THIN_PROVISION = "thin_provision";
  @SerializedName(SERIALIZED_NAME_THIN_PROVISION)
  private Boolean thinProvision;

  public static final String SERIALIZED_NAME_CLUSTER_ID = "cluster_id";
  @SerializedName(SERIALIZED_NAME_CLUSTER_ID)
  private String clusterId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_BPS_WR_MAX_LENGTH = "bps_wr_max_length";
  @SerializedName(SERIALIZED_NAME_BPS_WR_MAX_LENGTH)
  private Long bpsWrMaxLength;

  public static final String SERIALIZED_NAME_BPS_WR_MAX_UNIT = "bps_wr_max_unit";
  @SerializedName(SERIALIZED_NAME_BPS_WR_MAX_UNIT)
  private BPSUnit bpsWrMaxUnit;

  public static final String SERIALIZED_NAME_BPS_WR_MAX_SIZE = "bps_wr_max_size";
  @SerializedName(SERIALIZED_NAME_BPS_WR_MAX_SIZE)
  private BPSUnit bpsWrMaxSize;

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

  public static final String SERIALIZED_NAME_INITIATOR_CHAPS = "initiator_chaps";
  @SerializedName(SERIALIZED_NAME_INITIATOR_CHAPS)
  private List<IscsiTargetCommonParamsInitiatorChaps> initiatorChaps = null;

  public static final String SERIALIZED_NAME_CHAP_SECRET = "chap_secret";
  @SerializedName(SERIALIZED_NAME_CHAP_SECRET)
  private String chapSecret;

  public static final String SERIALIZED_NAME_CHAP_NAME = "chap_name";
  @SerializedName(SERIALIZED_NAME_CHAP_NAME)
  private String chapName;

  public static final String SERIALIZED_NAME_CHAP_ENABLED = "chap_enabled";
  @SerializedName(SERIALIZED_NAME_CHAP_ENABLED)
  private Boolean chapEnabled;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_IQN_WHITELIST = "iqn_whitelist";
  @SerializedName(SERIALIZED_NAME_IQN_WHITELIST)
  private String iqnWhitelist;

  public static final String SERIALIZED_NAME_IP_WHITELIST = "ip_whitelist";
  @SerializedName(SERIALIZED_NAME_IP_WHITELIST)
  private String ipWhitelist;

  public IscsiTargetCreationParams() { 
  }

  public IscsiTargetCreationParams stripeSizeUnit(ByteUnit stripeSizeUnit) {
    
    this.stripeSizeUnit = stripeSizeUnit;
    return this;
  }

   /**
   * Get stripeSizeUnit
   * @return stripeSizeUnit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ByteUnit getStripeSizeUnit() {
    return stripeSizeUnit;
  }


  public void setStripeSizeUnit(ByteUnit stripeSizeUnit) {
    this.stripeSizeUnit = stripeSizeUnit;
  }


  public IscsiTargetCreationParams stripeSize(Long stripeSize) {
    
    this.stripeSize = stripeSize;
    return this;
  }

   /**
   * Get stripeSize
   * @return stripeSize
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Long getStripeSize() {
    return stripeSize;
  }


  public void setStripeSize(Long stripeSize) {
    this.stripeSize = stripeSize;
  }


  public IscsiTargetCreationParams stripeNum(Integer stripeNum) {
    
    this.stripeNum = stripeNum;
    return this;
  }

   /**
   * Get stripeNum
   * @return stripeNum
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getStripeNum() {
    return stripeNum;
  }


  public void setStripeNum(Integer stripeNum) {
    this.stripeNum = stripeNum;
  }


  public IscsiTargetCreationParams replicaNum(Integer replicaNum) {
    
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


  public IscsiTargetCreationParams thinProvision(Boolean thinProvision) {
    
    this.thinProvision = thinProvision;
    return this;
  }

   /**
   * Get thinProvision
   * @return thinProvision
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boolean getThinProvision() {
    return thinProvision;
  }


  public void setThinProvision(Boolean thinProvision) {
    this.thinProvision = thinProvision;
  }


  public IscsiTargetCreationParams clusterId(String clusterId) {
    
    this.clusterId = clusterId;
    return this;
  }

   /**
   * Get clusterId
   * @return clusterId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getClusterId() {
    return clusterId;
  }


  public void setClusterId(String clusterId) {
    this.clusterId = clusterId;
  }


  public IscsiTargetCreationParams name(String name) {
    
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


  public IscsiTargetCreationParams bpsWrMaxLength(Long bpsWrMaxLength) {
    
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


  public IscsiTargetCreationParams bpsWrMaxUnit(BPSUnit bpsWrMaxUnit) {
    
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


  public IscsiTargetCreationParams bpsWrMaxSize(BPSUnit bpsWrMaxSize) {
    
    this.bpsWrMaxSize = bpsWrMaxSize;
    return this;
  }

   /**
   * Get bpsWrMaxSize
   * @return bpsWrMaxSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BPSUnit getBpsWrMaxSize() {
    return bpsWrMaxSize;
  }


  public void setBpsWrMaxSize(BPSUnit bpsWrMaxSize) {
    this.bpsWrMaxSize = bpsWrMaxSize;
  }


  public IscsiTargetCreationParams bpsWrMax(Long bpsWrMax) {
    
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


  public IscsiTargetCreationParams bpsRdMaxLength(Long bpsRdMaxLength) {
    
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


  public IscsiTargetCreationParams bpsRdMaxUnit(BPSUnit bpsRdMaxUnit) {
    
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


  public IscsiTargetCreationParams bpsRdMax(Long bpsRdMax) {
    
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


  public IscsiTargetCreationParams bpsMaxLength(Long bpsMaxLength) {
    
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


  public IscsiTargetCreationParams bpsMaxUnit(BPSUnit bpsMaxUnit) {
    
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


  public IscsiTargetCreationParams bpsMax(Long bpsMax) {
    
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


  public IscsiTargetCreationParams iopsWrMaxLength(Long iopsWrMaxLength) {
    
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


  public IscsiTargetCreationParams iopsWrMax(Long iopsWrMax) {
    
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


  public IscsiTargetCreationParams iopsRdMaxLength(Long iopsRdMaxLength) {
    
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


  public IscsiTargetCreationParams iopsRdMax(Long iopsRdMax) {
    
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


  public IscsiTargetCreationParams iopsMaxLength(Long iopsMaxLength) {
    
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


  public IscsiTargetCreationParams iopsMax(Long iopsMax) {
    
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


  public IscsiTargetCreationParams bpsWrUnit(BPSUnit bpsWrUnit) {
    
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


  public IscsiTargetCreationParams bpsWr(Long bpsWr) {
    
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


  public IscsiTargetCreationParams bpsRdUnit(BPSUnit bpsRdUnit) {
    
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


  public IscsiTargetCreationParams bpsRd(Long bpsRd) {
    
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


  public IscsiTargetCreationParams bpsUnit(BPSUnit bpsUnit) {
    
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


  public IscsiTargetCreationParams bps(Long bps) {
    
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


  public IscsiTargetCreationParams iopsWr(Long iopsWr) {
    
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


  public IscsiTargetCreationParams iopsRd(Long iopsRd) {
    
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


  public IscsiTargetCreationParams iops(Long iops) {
    
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


  public IscsiTargetCreationParams initiatorChaps(List<IscsiTargetCommonParamsInitiatorChaps> initiatorChaps) {
    
    this.initiatorChaps = initiatorChaps;
    return this;
  }

  public IscsiTargetCreationParams addInitiatorChapsItem(IscsiTargetCommonParamsInitiatorChaps initiatorChapsItem) {
    if (this.initiatorChaps == null) {
      this.initiatorChaps = new ArrayList<IscsiTargetCommonParamsInitiatorChaps>();
    }
    this.initiatorChaps.add(initiatorChapsItem);
    return this;
  }

   /**
   * Get initiatorChaps
   * @return initiatorChaps
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<IscsiTargetCommonParamsInitiatorChaps> getInitiatorChaps() {
    return initiatorChaps;
  }


  public void setInitiatorChaps(List<IscsiTargetCommonParamsInitiatorChaps> initiatorChaps) {
    this.initiatorChaps = initiatorChaps;
  }


  public IscsiTargetCreationParams chapSecret(String chapSecret) {
    
    this.chapSecret = chapSecret;
    return this;
  }

   /**
   * Get chapSecret
   * @return chapSecret
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getChapSecret() {
    return chapSecret;
  }


  public void setChapSecret(String chapSecret) {
    this.chapSecret = chapSecret;
  }


  public IscsiTargetCreationParams chapName(String chapName) {
    
    this.chapName = chapName;
    return this;
  }

   /**
   * Get chapName
   * @return chapName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getChapName() {
    return chapName;
  }


  public void setChapName(String chapName) {
    this.chapName = chapName;
  }


  public IscsiTargetCreationParams chapEnabled(Boolean chapEnabled) {
    
    this.chapEnabled = chapEnabled;
    return this;
  }

   /**
   * Get chapEnabled
   * @return chapEnabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getChapEnabled() {
    return chapEnabled;
  }


  public void setChapEnabled(Boolean chapEnabled) {
    this.chapEnabled = chapEnabled;
  }


  public IscsiTargetCreationParams description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public IscsiTargetCreationParams iqnWhitelist(String iqnWhitelist) {
    
    this.iqnWhitelist = iqnWhitelist;
    return this;
  }

   /**
   * Get iqnWhitelist
   * @return iqnWhitelist
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIqnWhitelist() {
    return iqnWhitelist;
  }


  public void setIqnWhitelist(String iqnWhitelist) {
    this.iqnWhitelist = iqnWhitelist;
  }


  public IscsiTargetCreationParams ipWhitelist(String ipWhitelist) {
    
    this.ipWhitelist = ipWhitelist;
    return this;
  }

   /**
   * Get ipWhitelist
   * @return ipWhitelist
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIpWhitelist() {
    return ipWhitelist;
  }


  public void setIpWhitelist(String ipWhitelist) {
    this.ipWhitelist = ipWhitelist;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IscsiTargetCreationParams iscsiTargetCreationParams = (IscsiTargetCreationParams) o;
    return Objects.equals(this.stripeSizeUnit, iscsiTargetCreationParams.stripeSizeUnit) &&
        Objects.equals(this.stripeSize, iscsiTargetCreationParams.stripeSize) &&
        Objects.equals(this.stripeNum, iscsiTargetCreationParams.stripeNum) &&
        Objects.equals(this.replicaNum, iscsiTargetCreationParams.replicaNum) &&
        Objects.equals(this.thinProvision, iscsiTargetCreationParams.thinProvision) &&
        Objects.equals(this.clusterId, iscsiTargetCreationParams.clusterId) &&
        Objects.equals(this.name, iscsiTargetCreationParams.name) &&
        Objects.equals(this.bpsWrMaxLength, iscsiTargetCreationParams.bpsWrMaxLength) &&
        Objects.equals(this.bpsWrMaxUnit, iscsiTargetCreationParams.bpsWrMaxUnit) &&
        Objects.equals(this.bpsWrMaxSize, iscsiTargetCreationParams.bpsWrMaxSize) &&
        Objects.equals(this.bpsWrMax, iscsiTargetCreationParams.bpsWrMax) &&
        Objects.equals(this.bpsRdMaxLength, iscsiTargetCreationParams.bpsRdMaxLength) &&
        Objects.equals(this.bpsRdMaxUnit, iscsiTargetCreationParams.bpsRdMaxUnit) &&
        Objects.equals(this.bpsRdMax, iscsiTargetCreationParams.bpsRdMax) &&
        Objects.equals(this.bpsMaxLength, iscsiTargetCreationParams.bpsMaxLength) &&
        Objects.equals(this.bpsMaxUnit, iscsiTargetCreationParams.bpsMaxUnit) &&
        Objects.equals(this.bpsMax, iscsiTargetCreationParams.bpsMax) &&
        Objects.equals(this.iopsWrMaxLength, iscsiTargetCreationParams.iopsWrMaxLength) &&
        Objects.equals(this.iopsWrMax, iscsiTargetCreationParams.iopsWrMax) &&
        Objects.equals(this.iopsRdMaxLength, iscsiTargetCreationParams.iopsRdMaxLength) &&
        Objects.equals(this.iopsRdMax, iscsiTargetCreationParams.iopsRdMax) &&
        Objects.equals(this.iopsMaxLength, iscsiTargetCreationParams.iopsMaxLength) &&
        Objects.equals(this.iopsMax, iscsiTargetCreationParams.iopsMax) &&
        Objects.equals(this.bpsWrUnit, iscsiTargetCreationParams.bpsWrUnit) &&
        Objects.equals(this.bpsWr, iscsiTargetCreationParams.bpsWr) &&
        Objects.equals(this.bpsRdUnit, iscsiTargetCreationParams.bpsRdUnit) &&
        Objects.equals(this.bpsRd, iscsiTargetCreationParams.bpsRd) &&
        Objects.equals(this.bpsUnit, iscsiTargetCreationParams.bpsUnit) &&
        Objects.equals(this.bps, iscsiTargetCreationParams.bps) &&
        Objects.equals(this.iopsWr, iscsiTargetCreationParams.iopsWr) &&
        Objects.equals(this.iopsRd, iscsiTargetCreationParams.iopsRd) &&
        Objects.equals(this.iops, iscsiTargetCreationParams.iops) &&
        Objects.equals(this.initiatorChaps, iscsiTargetCreationParams.initiatorChaps) &&
        Objects.equals(this.chapSecret, iscsiTargetCreationParams.chapSecret) &&
        Objects.equals(this.chapName, iscsiTargetCreationParams.chapName) &&
        Objects.equals(this.chapEnabled, iscsiTargetCreationParams.chapEnabled) &&
        Objects.equals(this.description, iscsiTargetCreationParams.description) &&
        Objects.equals(this.iqnWhitelist, iscsiTargetCreationParams.iqnWhitelist) &&
        Objects.equals(this.ipWhitelist, iscsiTargetCreationParams.ipWhitelist);
  }

  @Override
  public int hashCode() {
    return Objects.hash(stripeSizeUnit, stripeSize, stripeNum, replicaNum, thinProvision, clusterId, name, bpsWrMaxLength, bpsWrMaxUnit, bpsWrMaxSize, bpsWrMax, bpsRdMaxLength, bpsRdMaxUnit, bpsRdMax, bpsMaxLength, bpsMaxUnit, bpsMax, iopsWrMaxLength, iopsWrMax, iopsRdMaxLength, iopsRdMax, iopsMaxLength, iopsMax, bpsWrUnit, bpsWr, bpsRdUnit, bpsRd, bpsUnit, bps, iopsWr, iopsRd, iops, initiatorChaps, chapSecret, chapName, chapEnabled, description, iqnWhitelist, ipWhitelist);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IscsiTargetCreationParams {\n");
    sb.append("    stripeSizeUnit: ").append(toIndentedString(stripeSizeUnit)).append("\n");
    sb.append("    stripeSize: ").append(toIndentedString(stripeSize)).append("\n");
    sb.append("    stripeNum: ").append(toIndentedString(stripeNum)).append("\n");
    sb.append("    replicaNum: ").append(toIndentedString(replicaNum)).append("\n");
    sb.append("    thinProvision: ").append(toIndentedString(thinProvision)).append("\n");
    sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    bpsWrMaxLength: ").append(toIndentedString(bpsWrMaxLength)).append("\n");
    sb.append("    bpsWrMaxUnit: ").append(toIndentedString(bpsWrMaxUnit)).append("\n");
    sb.append("    bpsWrMaxSize: ").append(toIndentedString(bpsWrMaxSize)).append("\n");
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
    sb.append("    initiatorChaps: ").append(toIndentedString(initiatorChaps)).append("\n");
    sb.append("    chapSecret: ").append(toIndentedString(chapSecret)).append("\n");
    sb.append("    chapName: ").append(toIndentedString(chapName)).append("\n");
    sb.append("    chapEnabled: ").append(toIndentedString(chapEnabled)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    iqnWhitelist: ").append(toIndentedString(iqnWhitelist)).append("\n");
    sb.append("    ipWhitelist: ").append(toIndentedString(ipWhitelist)).append("\n");
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

