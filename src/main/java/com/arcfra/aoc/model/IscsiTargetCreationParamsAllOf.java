package com.arcfra.aoc.model;

import java.util.Objects;
import java.util.Arrays;
import com.arcfra.aoc.model.ByteUnit;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * IscsiTargetCreationParamsAllOf
 */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class IscsiTargetCreationParamsAllOf {
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

  public IscsiTargetCreationParamsAllOf() { 
  }

  public IscsiTargetCreationParamsAllOf stripeSizeUnit(ByteUnit stripeSizeUnit) {
    
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


  public IscsiTargetCreationParamsAllOf stripeSize(Long stripeSize) {
    
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


  public IscsiTargetCreationParamsAllOf stripeNum(Integer stripeNum) {
    
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


  public IscsiTargetCreationParamsAllOf replicaNum(Integer replicaNum) {
    
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


  public IscsiTargetCreationParamsAllOf thinProvision(Boolean thinProvision) {
    
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


  public IscsiTargetCreationParamsAllOf clusterId(String clusterId) {
    
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


  public IscsiTargetCreationParamsAllOf name(String name) {
    
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IscsiTargetCreationParamsAllOf iscsiTargetCreationParamsAllOf = (IscsiTargetCreationParamsAllOf) o;
    return Objects.equals(this.stripeSizeUnit, iscsiTargetCreationParamsAllOf.stripeSizeUnit) &&
        Objects.equals(this.stripeSize, iscsiTargetCreationParamsAllOf.stripeSize) &&
        Objects.equals(this.stripeNum, iscsiTargetCreationParamsAllOf.stripeNum) &&
        Objects.equals(this.replicaNum, iscsiTargetCreationParamsAllOf.replicaNum) &&
        Objects.equals(this.thinProvision, iscsiTargetCreationParamsAllOf.thinProvision) &&
        Objects.equals(this.clusterId, iscsiTargetCreationParamsAllOf.clusterId) &&
        Objects.equals(this.name, iscsiTargetCreationParamsAllOf.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(stripeSizeUnit, stripeSize, stripeNum, replicaNum, thinProvision, clusterId, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IscsiTargetCreationParamsAllOf {\n");
    sb.append("    stripeSizeUnit: ").append(toIndentedString(stripeSizeUnit)).append("\n");
    sb.append("    stripeSize: ").append(toIndentedString(stripeSize)).append("\n");
    sb.append("    stripeNum: ").append(toIndentedString(stripeNum)).append("\n");
    sb.append("    replicaNum: ").append(toIndentedString(replicaNum)).append("\n");
    sb.append("    thinProvision: ").append(toIndentedString(thinProvision)).append("\n");
    sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

