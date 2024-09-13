package com.arcfra.aoc.model;

import java.util.Objects;
import java.util.Arrays;
import com.arcfra.aoc.model.VmVolumeElfStoragePolicyType;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ImportVmVolumeParams
 */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class ImportVmVolumeParams {
  public static final String SERIALIZED_NAME_UPLOAD_TASK_ID = "upload_task_id";
  @SerializedName(SERIALIZED_NAME_UPLOAD_TASK_ID)
  private String uploadTaskId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_STORAGE_POLICY = "storage_policy";
  @SerializedName(SERIALIZED_NAME_STORAGE_POLICY)
  private VmVolumeElfStoragePolicyType storagePolicy;

  public static final String SERIALIZED_NAME_CLUSTER_ID = "cluster_id";
  @SerializedName(SERIALIZED_NAME_CLUSTER_ID)
  private String clusterId;

  public ImportVmVolumeParams() { 
  }

  public ImportVmVolumeParams uploadTaskId(String uploadTaskId) {
    
    this.uploadTaskId = uploadTaskId;
    return this;
  }

   /**
   * Get uploadTaskId
   * @return uploadTaskId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getUploadTaskId() {
    return uploadTaskId;
  }


  public void setUploadTaskId(String uploadTaskId) {
    this.uploadTaskId = uploadTaskId;
  }


  public ImportVmVolumeParams name(String name) {
    
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


  public ImportVmVolumeParams storagePolicy(VmVolumeElfStoragePolicyType storagePolicy) {
    
    this.storagePolicy = storagePolicy;
    return this;
  }

   /**
   * Get storagePolicy
   * @return storagePolicy
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public VmVolumeElfStoragePolicyType getStoragePolicy() {
    return storagePolicy;
  }


  public void setStoragePolicy(VmVolumeElfStoragePolicyType storagePolicy) {
    this.storagePolicy = storagePolicy;
  }


  public ImportVmVolumeParams clusterId(String clusterId) {
    
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImportVmVolumeParams importVmVolumeParams = (ImportVmVolumeParams) o;
    return Objects.equals(this.uploadTaskId, importVmVolumeParams.uploadTaskId) &&
        Objects.equals(this.name, importVmVolumeParams.name) &&
        Objects.equals(this.storagePolicy, importVmVolumeParams.storagePolicy) &&
        Objects.equals(this.clusterId, importVmVolumeParams.clusterId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uploadTaskId, name, storagePolicy, clusterId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImportVmVolumeParams {\n");
    sb.append("    uploadTaskId: ").append(toIndentedString(uploadTaskId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    storagePolicy: ").append(toIndentedString(storagePolicy)).append("\n");
    sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
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

