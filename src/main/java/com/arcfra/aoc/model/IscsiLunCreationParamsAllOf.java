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
 * IscsiLunCreationParamsAllOf
 */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class IscsiLunCreationParamsAllOf {
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

  public IscsiLunCreationParamsAllOf() { 
  }

  public IscsiLunCreationParamsAllOf lunId(Integer lunId) {
    
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


  public IscsiLunCreationParamsAllOf assignedSizeUnit(ByteUnit assignedSizeUnit) {
    
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


  public IscsiLunCreationParamsAllOf assignedSize(Long assignedSize) {
    
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


  public IscsiLunCreationParamsAllOf replicaNum(Integer replicaNum) {
    
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


  public IscsiLunCreationParamsAllOf iscsiTargetId(String iscsiTargetId) {
    
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


  public IscsiLunCreationParamsAllOf name(String name) {
    
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
    IscsiLunCreationParamsAllOf iscsiLunCreationParamsAllOf = (IscsiLunCreationParamsAllOf) o;
    return Objects.equals(this.lunId, iscsiLunCreationParamsAllOf.lunId) &&
        Objects.equals(this.assignedSizeUnit, iscsiLunCreationParamsAllOf.assignedSizeUnit) &&
        Objects.equals(this.assignedSize, iscsiLunCreationParamsAllOf.assignedSize) &&
        Objects.equals(this.replicaNum, iscsiLunCreationParamsAllOf.replicaNum) &&
        Objects.equals(this.iscsiTargetId, iscsiLunCreationParamsAllOf.iscsiTargetId) &&
        Objects.equals(this.name, iscsiLunCreationParamsAllOf.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lunId, assignedSizeUnit, assignedSize, replicaNum, iscsiTargetId, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IscsiLunCreationParamsAllOf {\n");
    sb.append("    lunId: ").append(toIndentedString(lunId)).append("\n");
    sb.append("    assignedSizeUnit: ").append(toIndentedString(assignedSizeUnit)).append("\n");
    sb.append("    assignedSize: ").append(toIndentedString(assignedSize)).append("\n");
    sb.append("    replicaNum: ").append(toIndentedString(replicaNum)).append("\n");
    sb.append("    iscsiTargetId: ").append(toIndentedString(iscsiTargetId)).append("\n");
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

