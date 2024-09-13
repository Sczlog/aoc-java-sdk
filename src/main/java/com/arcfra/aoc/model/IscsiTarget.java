package com.arcfra.aoc.model;

import java.util.Objects;
import java.util.Arrays;
import com.arcfra.aoc.model.EntityAsyncStatus;
import com.arcfra.aoc.model.NestedCluster;
import com.arcfra.aoc.model.NestedInitiatorChap;
import com.arcfra.aoc.model.NestedIscsiLun;
import com.arcfra.aoc.model.NestedLabel;
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
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * IscsiTarget
 */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class IscsiTarget {
  public static final String SERIALIZED_NAME_BPS = "bps";
  @SerializedName(SERIALIZED_NAME_BPS)
  private Long bps;

  public static final String SERIALIZED_NAME_BPS_MAX = "bps_max";
  @SerializedName(SERIALIZED_NAME_BPS_MAX)
  private Long bpsMax;

  public static final String SERIALIZED_NAME_BPS_MAX_LENGTH = "bps_max_length";
  @SerializedName(SERIALIZED_NAME_BPS_MAX_LENGTH)
  private Long bpsMaxLength;

  public static final String SERIALIZED_NAME_BPS_RD = "bps_rd";
  @SerializedName(SERIALIZED_NAME_BPS_RD)
  private Long bpsRd;

  public static final String SERIALIZED_NAME_BPS_RD_MAX = "bps_rd_max";
  @SerializedName(SERIALIZED_NAME_BPS_RD_MAX)
  private Long bpsRdMax;

  public static final String SERIALIZED_NAME_BPS_RD_MAX_LENGTH = "bps_rd_max_length";
  @SerializedName(SERIALIZED_NAME_BPS_RD_MAX_LENGTH)
  private Long bpsRdMaxLength;

  public static final String SERIALIZED_NAME_BPS_WR = "bps_wr";
  @SerializedName(SERIALIZED_NAME_BPS_WR)
  private Long bpsWr;

  public static final String SERIALIZED_NAME_BPS_WR_MAX = "bps_wr_max";
  @SerializedName(SERIALIZED_NAME_BPS_WR_MAX)
  private Long bpsWrMax;

  public static final String SERIALIZED_NAME_BPS_WR_MAX_LENGTH = "bps_wr_max_length";
  @SerializedName(SERIALIZED_NAME_BPS_WR_MAX_LENGTH)
  private Long bpsWrMaxLength;

  public static final String SERIALIZED_NAME_CHAP_ENABLED = "chap_enabled";
  @SerializedName(SERIALIZED_NAME_CHAP_ENABLED)
  private Boolean chapEnabled;

  public static final String SERIALIZED_NAME_CHAP_NAME = "chap_name";
  @SerializedName(SERIALIZED_NAME_CHAP_NAME)
  private String chapName;

  public static final String SERIALIZED_NAME_CHAP_SECRET = "chap_secret";
  @SerializedName(SERIALIZED_NAME_CHAP_SECRET)
  private String chapSecret;

  public static final String SERIALIZED_NAME_CLUSTER = "cluster";
  @SerializedName(SERIALIZED_NAME_CLUSTER)
  private NestedCluster cluster;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_ENTITY_ASYNC_STATUS = "entityAsyncStatus";
  @SerializedName(SERIALIZED_NAME_ENTITY_ASYNC_STATUS)
  private EntityAsyncStatus entityAsyncStatus;

  public static final String SERIALIZED_NAME_EXTERNAL_USE = "external_use";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_USE)
  private Boolean externalUse;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_INITIATOR_CHAPS = "initiator_chaps";
  @SerializedName(SERIALIZED_NAME_INITIATOR_CHAPS)
  private List<NestedInitiatorChap> initiatorChaps = null;

  public static final String SERIALIZED_NAME_INTERNAL = "internal";
  @SerializedName(SERIALIZED_NAME_INTERNAL)
  private Boolean internal;

  public static final String SERIALIZED_NAME_IO_SIZE = "io_size";
  @SerializedName(SERIALIZED_NAME_IO_SIZE)
  private Long ioSize;

  public static final String SERIALIZED_NAME_IOPS = "iops";
  @SerializedName(SERIALIZED_NAME_IOPS)
  private Long iops;

  public static final String SERIALIZED_NAME_IOPS_MAX = "iops_max";
  @SerializedName(SERIALIZED_NAME_IOPS_MAX)
  private Long iopsMax;

  public static final String SERIALIZED_NAME_IOPS_MAX_LENGTH = "iops_max_length";
  @SerializedName(SERIALIZED_NAME_IOPS_MAX_LENGTH)
  private Long iopsMaxLength;

  public static final String SERIALIZED_NAME_IOPS_RD = "iops_rd";
  @SerializedName(SERIALIZED_NAME_IOPS_RD)
  private Long iopsRd;

  public static final String SERIALIZED_NAME_IOPS_RD_MAX = "iops_rd_max";
  @SerializedName(SERIALIZED_NAME_IOPS_RD_MAX)
  private Long iopsRdMax;

  public static final String SERIALIZED_NAME_IOPS_RD_MAX_LENGTH = "iops_rd_max_length";
  @SerializedName(SERIALIZED_NAME_IOPS_RD_MAX_LENGTH)
  private Long iopsRdMaxLength;

  public static final String SERIALIZED_NAME_IOPS_WR = "iops_wr";
  @SerializedName(SERIALIZED_NAME_IOPS_WR)
  private Long iopsWr;

  public static final String SERIALIZED_NAME_IOPS_WR_MAX = "iops_wr_max";
  @SerializedName(SERIALIZED_NAME_IOPS_WR_MAX)
  private Long iopsWrMax;

  public static final String SERIALIZED_NAME_IOPS_WR_MAX_LENGTH = "iops_wr_max_length";
  @SerializedName(SERIALIZED_NAME_IOPS_WR_MAX_LENGTH)
  private Long iopsWrMaxLength;

  public static final String SERIALIZED_NAME_IP_WHITELIST = "ip_whitelist";
  @SerializedName(SERIALIZED_NAME_IP_WHITELIST)
  private String ipWhitelist;

  public static final String SERIALIZED_NAME_IQN_NAME = "iqn_name";
  @SerializedName(SERIALIZED_NAME_IQN_NAME)
  private String iqnName;

  public static final String SERIALIZED_NAME_IQN_WHITELIST = "iqn_whitelist";
  @SerializedName(SERIALIZED_NAME_IQN_WHITELIST)
  private String iqnWhitelist;

  public static final String SERIALIZED_NAME_LABELS = "labels";
  @SerializedName(SERIALIZED_NAME_LABELS)
  private List<NestedLabel> labels = null;

  public static final String SERIALIZED_NAME_LOCAL_ID = "local_id";
  @SerializedName(SERIALIZED_NAME_LOCAL_ID)
  private String localId;

  public static final String SERIALIZED_NAME_LUNS = "luns";
  @SerializedName(SERIALIZED_NAME_LUNS)
  private List<NestedIscsiLun> luns = null;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_REPLICA_NUM = "replica_num";
  @SerializedName(SERIALIZED_NAME_REPLICA_NUM)
  private Integer replicaNum;

  public static final String SERIALIZED_NAME_STRIPE_NUM = "stripe_num";
  @SerializedName(SERIALIZED_NAME_STRIPE_NUM)
  private Integer stripeNum;

  public static final String SERIALIZED_NAME_STRIPE_SIZE = "stripe_size";
  @SerializedName(SERIALIZED_NAME_STRIPE_SIZE)
  private Long stripeSize;

  public static final String SERIALIZED_NAME_THIN_PROVISION = "thin_provision";
  @SerializedName(SERIALIZED_NAME_THIN_PROVISION)
  private Boolean thinProvision;

  public IscsiTarget() { 
  }

  public IscsiTarget bps(Long bps) {
    
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


  public IscsiTarget bpsMax(Long bpsMax) {
    
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


  public IscsiTarget bpsMaxLength(Long bpsMaxLength) {
    
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


  public IscsiTarget bpsRd(Long bpsRd) {
    
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


  public IscsiTarget bpsRdMax(Long bpsRdMax) {
    
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


  public IscsiTarget bpsRdMaxLength(Long bpsRdMaxLength) {
    
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


  public IscsiTarget bpsWr(Long bpsWr) {
    
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


  public IscsiTarget bpsWrMax(Long bpsWrMax) {
    
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


  public IscsiTarget bpsWrMaxLength(Long bpsWrMaxLength) {
    
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


  public IscsiTarget chapEnabled(Boolean chapEnabled) {
    
    this.chapEnabled = chapEnabled;
    return this;
  }

   /**
   * Get chapEnabled
   * @return chapEnabled
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boolean getChapEnabled() {
    return chapEnabled;
  }


  public void setChapEnabled(Boolean chapEnabled) {
    this.chapEnabled = chapEnabled;
  }


  public IscsiTarget chapName(String chapName) {
    
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


  public IscsiTarget chapSecret(String chapSecret) {
    
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


  public IscsiTarget cluster(NestedCluster cluster) {
    
    this.cluster = cluster;
    return this;
  }

   /**
   * Get cluster
   * @return cluster
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public NestedCluster getCluster() {
    return cluster;
  }


  public void setCluster(NestedCluster cluster) {
    this.cluster = cluster;
  }


  public IscsiTarget description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public IscsiTarget entityAsyncStatus(EntityAsyncStatus entityAsyncStatus) {
    
    this.entityAsyncStatus = entityAsyncStatus;
    return this;
  }

   /**
   * Get entityAsyncStatus
   * @return entityAsyncStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public EntityAsyncStatus getEntityAsyncStatus() {
    return entityAsyncStatus;
  }


  public void setEntityAsyncStatus(EntityAsyncStatus entityAsyncStatus) {
    this.entityAsyncStatus = entityAsyncStatus;
  }


  public IscsiTarget externalUse(Boolean externalUse) {
    
    this.externalUse = externalUse;
    return this;
  }

   /**
   * Get externalUse
   * @return externalUse
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boolean getExternalUse() {
    return externalUse;
  }


  public void setExternalUse(Boolean externalUse) {
    this.externalUse = externalUse;
  }


  public IscsiTarget id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public IscsiTarget initiatorChaps(List<NestedInitiatorChap> initiatorChaps) {
    
    this.initiatorChaps = initiatorChaps;
    return this;
  }

  public IscsiTarget addInitiatorChapsItem(NestedInitiatorChap initiatorChapsItem) {
    if (this.initiatorChaps == null) {
      this.initiatorChaps = new ArrayList<NestedInitiatorChap>();
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

  public List<NestedInitiatorChap> getInitiatorChaps() {
    return initiatorChaps;
  }


  public void setInitiatorChaps(List<NestedInitiatorChap> initiatorChaps) {
    this.initiatorChaps = initiatorChaps;
  }


  public IscsiTarget internal(Boolean internal) {
    
    this.internal = internal;
    return this;
  }

   /**
   * Get internal
   * @return internal
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boolean getInternal() {
    return internal;
  }


  public void setInternal(Boolean internal) {
    this.internal = internal;
  }


  public IscsiTarget ioSize(Long ioSize) {
    
    this.ioSize = ioSize;
    return this;
  }

   /**
   * Get ioSize
   * @return ioSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getIoSize() {
    return ioSize;
  }


  public void setIoSize(Long ioSize) {
    this.ioSize = ioSize;
  }


  public IscsiTarget iops(Long iops) {
    
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


  public IscsiTarget iopsMax(Long iopsMax) {
    
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


  public IscsiTarget iopsMaxLength(Long iopsMaxLength) {
    
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


  public IscsiTarget iopsRd(Long iopsRd) {
    
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


  public IscsiTarget iopsRdMax(Long iopsRdMax) {
    
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


  public IscsiTarget iopsRdMaxLength(Long iopsRdMaxLength) {
    
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


  public IscsiTarget iopsWr(Long iopsWr) {
    
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


  public IscsiTarget iopsWrMax(Long iopsWrMax) {
    
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


  public IscsiTarget iopsWrMaxLength(Long iopsWrMaxLength) {
    
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


  public IscsiTarget ipWhitelist(String ipWhitelist) {
    
    this.ipWhitelist = ipWhitelist;
    return this;
  }

   /**
   * Get ipWhitelist
   * @return ipWhitelist
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getIpWhitelist() {
    return ipWhitelist;
  }


  public void setIpWhitelist(String ipWhitelist) {
    this.ipWhitelist = ipWhitelist;
  }


  public IscsiTarget iqnName(String iqnName) {
    
    this.iqnName = iqnName;
    return this;
  }

   /**
   * Get iqnName
   * @return iqnName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getIqnName() {
    return iqnName;
  }


  public void setIqnName(String iqnName) {
    this.iqnName = iqnName;
  }


  public IscsiTarget iqnWhitelist(String iqnWhitelist) {
    
    this.iqnWhitelist = iqnWhitelist;
    return this;
  }

   /**
   * Get iqnWhitelist
   * @return iqnWhitelist
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getIqnWhitelist() {
    return iqnWhitelist;
  }


  public void setIqnWhitelist(String iqnWhitelist) {
    this.iqnWhitelist = iqnWhitelist;
  }


  public IscsiTarget labels(List<NestedLabel> labels) {
    
    this.labels = labels;
    return this;
  }

  public IscsiTarget addLabelsItem(NestedLabel labelsItem) {
    if (this.labels == null) {
      this.labels = new ArrayList<NestedLabel>();
    }
    this.labels.add(labelsItem);
    return this;
  }

   /**
   * Get labels
   * @return labels
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<NestedLabel> getLabels() {
    return labels;
  }


  public void setLabels(List<NestedLabel> labels) {
    this.labels = labels;
  }


  public IscsiTarget localId(String localId) {
    
    this.localId = localId;
    return this;
  }

   /**
   * Get localId
   * @return localId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getLocalId() {
    return localId;
  }


  public void setLocalId(String localId) {
    this.localId = localId;
  }


  public IscsiTarget luns(List<NestedIscsiLun> luns) {
    
    this.luns = luns;
    return this;
  }

  public IscsiTarget addLunsItem(NestedIscsiLun lunsItem) {
    if (this.luns == null) {
      this.luns = new ArrayList<NestedIscsiLun>();
    }
    this.luns.add(lunsItem);
    return this;
  }

   /**
   * Get luns
   * @return luns
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<NestedIscsiLun> getLuns() {
    return luns;
  }


  public void setLuns(List<NestedIscsiLun> luns) {
    this.luns = luns;
  }


  public IscsiTarget name(String name) {
    
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


  public IscsiTarget replicaNum(Integer replicaNum) {
    
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


  public IscsiTarget stripeNum(Integer stripeNum) {
    
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


  public IscsiTarget stripeSize(Long stripeSize) {
    
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


  public IscsiTarget thinProvision(Boolean thinProvision) {
    
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IscsiTarget iscsiTarget = (IscsiTarget) o;
    return Objects.equals(this.bps, iscsiTarget.bps) &&
        Objects.equals(this.bpsMax, iscsiTarget.bpsMax) &&
        Objects.equals(this.bpsMaxLength, iscsiTarget.bpsMaxLength) &&
        Objects.equals(this.bpsRd, iscsiTarget.bpsRd) &&
        Objects.equals(this.bpsRdMax, iscsiTarget.bpsRdMax) &&
        Objects.equals(this.bpsRdMaxLength, iscsiTarget.bpsRdMaxLength) &&
        Objects.equals(this.bpsWr, iscsiTarget.bpsWr) &&
        Objects.equals(this.bpsWrMax, iscsiTarget.bpsWrMax) &&
        Objects.equals(this.bpsWrMaxLength, iscsiTarget.bpsWrMaxLength) &&
        Objects.equals(this.chapEnabled, iscsiTarget.chapEnabled) &&
        Objects.equals(this.chapName, iscsiTarget.chapName) &&
        Objects.equals(this.chapSecret, iscsiTarget.chapSecret) &&
        Objects.equals(this.cluster, iscsiTarget.cluster) &&
        Objects.equals(this.description, iscsiTarget.description) &&
        Objects.equals(this.entityAsyncStatus, iscsiTarget.entityAsyncStatus) &&
        Objects.equals(this.externalUse, iscsiTarget.externalUse) &&
        Objects.equals(this.id, iscsiTarget.id) &&
        Objects.equals(this.initiatorChaps, iscsiTarget.initiatorChaps) &&
        Objects.equals(this.internal, iscsiTarget.internal) &&
        Objects.equals(this.ioSize, iscsiTarget.ioSize) &&
        Objects.equals(this.iops, iscsiTarget.iops) &&
        Objects.equals(this.iopsMax, iscsiTarget.iopsMax) &&
        Objects.equals(this.iopsMaxLength, iscsiTarget.iopsMaxLength) &&
        Objects.equals(this.iopsRd, iscsiTarget.iopsRd) &&
        Objects.equals(this.iopsRdMax, iscsiTarget.iopsRdMax) &&
        Objects.equals(this.iopsRdMaxLength, iscsiTarget.iopsRdMaxLength) &&
        Objects.equals(this.iopsWr, iscsiTarget.iopsWr) &&
        Objects.equals(this.iopsWrMax, iscsiTarget.iopsWrMax) &&
        Objects.equals(this.iopsWrMaxLength, iscsiTarget.iopsWrMaxLength) &&
        Objects.equals(this.ipWhitelist, iscsiTarget.ipWhitelist) &&
        Objects.equals(this.iqnName, iscsiTarget.iqnName) &&
        Objects.equals(this.iqnWhitelist, iscsiTarget.iqnWhitelist) &&
        Objects.equals(this.labels, iscsiTarget.labels) &&
        Objects.equals(this.localId, iscsiTarget.localId) &&
        Objects.equals(this.luns, iscsiTarget.luns) &&
        Objects.equals(this.name, iscsiTarget.name) &&
        Objects.equals(this.replicaNum, iscsiTarget.replicaNum) &&
        Objects.equals(this.stripeNum, iscsiTarget.stripeNum) &&
        Objects.equals(this.stripeSize, iscsiTarget.stripeSize) &&
        Objects.equals(this.thinProvision, iscsiTarget.thinProvision);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(bps, bpsMax, bpsMaxLength, bpsRd, bpsRdMax, bpsRdMaxLength, bpsWr, bpsWrMax, bpsWrMaxLength, chapEnabled, chapName, chapSecret, cluster, description, entityAsyncStatus, externalUse, id, initiatorChaps, internal, ioSize, iops, iopsMax, iopsMaxLength, iopsRd, iopsRdMax, iopsRdMaxLength, iopsWr, iopsWrMax, iopsWrMaxLength, ipWhitelist, iqnName, iqnWhitelist, labels, localId, luns, name, replicaNum, stripeNum, stripeSize, thinProvision);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IscsiTarget {\n");
    sb.append("    bps: ").append(toIndentedString(bps)).append("\n");
    sb.append("    bpsMax: ").append(toIndentedString(bpsMax)).append("\n");
    sb.append("    bpsMaxLength: ").append(toIndentedString(bpsMaxLength)).append("\n");
    sb.append("    bpsRd: ").append(toIndentedString(bpsRd)).append("\n");
    sb.append("    bpsRdMax: ").append(toIndentedString(bpsRdMax)).append("\n");
    sb.append("    bpsRdMaxLength: ").append(toIndentedString(bpsRdMaxLength)).append("\n");
    sb.append("    bpsWr: ").append(toIndentedString(bpsWr)).append("\n");
    sb.append("    bpsWrMax: ").append(toIndentedString(bpsWrMax)).append("\n");
    sb.append("    bpsWrMaxLength: ").append(toIndentedString(bpsWrMaxLength)).append("\n");
    sb.append("    chapEnabled: ").append(toIndentedString(chapEnabled)).append("\n");
    sb.append("    chapName: ").append(toIndentedString(chapName)).append("\n");
    sb.append("    chapSecret: ").append(toIndentedString(chapSecret)).append("\n");
    sb.append("    cluster: ").append(toIndentedString(cluster)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    entityAsyncStatus: ").append(toIndentedString(entityAsyncStatus)).append("\n");
    sb.append("    externalUse: ").append(toIndentedString(externalUse)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    initiatorChaps: ").append(toIndentedString(initiatorChaps)).append("\n");
    sb.append("    internal: ").append(toIndentedString(internal)).append("\n");
    sb.append("    ioSize: ").append(toIndentedString(ioSize)).append("\n");
    sb.append("    iops: ").append(toIndentedString(iops)).append("\n");
    sb.append("    iopsMax: ").append(toIndentedString(iopsMax)).append("\n");
    sb.append("    iopsMaxLength: ").append(toIndentedString(iopsMaxLength)).append("\n");
    sb.append("    iopsRd: ").append(toIndentedString(iopsRd)).append("\n");
    sb.append("    iopsRdMax: ").append(toIndentedString(iopsRdMax)).append("\n");
    sb.append("    iopsRdMaxLength: ").append(toIndentedString(iopsRdMaxLength)).append("\n");
    sb.append("    iopsWr: ").append(toIndentedString(iopsWr)).append("\n");
    sb.append("    iopsWrMax: ").append(toIndentedString(iopsWrMax)).append("\n");
    sb.append("    iopsWrMaxLength: ").append(toIndentedString(iopsWrMaxLength)).append("\n");
    sb.append("    ipWhitelist: ").append(toIndentedString(ipWhitelist)).append("\n");
    sb.append("    iqnName: ").append(toIndentedString(iqnName)).append("\n");
    sb.append("    iqnWhitelist: ").append(toIndentedString(iqnWhitelist)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    localId: ").append(toIndentedString(localId)).append("\n");
    sb.append("    luns: ").append(toIndentedString(luns)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    replicaNum: ").append(toIndentedString(replicaNum)).append("\n");
    sb.append("    stripeNum: ").append(toIndentedString(stripeNum)).append("\n");
    sb.append("    stripeSize: ").append(toIndentedString(stripeSize)).append("\n");
    sb.append("    thinProvision: ").append(toIndentedString(thinProvision)).append("\n");
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

