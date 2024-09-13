package com.arcfra.aoc.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * VmTemplateCreationParams
 */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class VmTemplateCreationParams {
  public static final String SERIALIZED_NAME_CLUSTER_ID = "cluster_id";
  @SerializedName(SERIALIZED_NAME_CLUSTER_ID)
  private String clusterId;

  public static final String SERIALIZED_NAME_CLOUD_INIT_SUPPORTED = "cloud_init_supported";
  @SerializedName(SERIALIZED_NAME_CLOUD_INIT_SUPPORTED)
  private Boolean cloudInitSupported;

  public static final String SERIALIZED_NAME_VM_ID = "vm_id";
  @SerializedName(SERIALIZED_NAME_VM_ID)
  private String vmId;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public VmTemplateCreationParams() { 
  }

  public VmTemplateCreationParams clusterId(String clusterId) {
    
    this.clusterId = clusterId;
    return this;
  }

   /**
   * Get clusterId
   * @return clusterId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getClusterId() {
    return clusterId;
  }


  public void setClusterId(String clusterId) {
    this.clusterId = clusterId;
  }


  public VmTemplateCreationParams cloudInitSupported(Boolean cloudInitSupported) {
    
    this.cloudInitSupported = cloudInitSupported;
    return this;
  }

   /**
   * Get cloudInitSupported
   * @return cloudInitSupported
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boolean getCloudInitSupported() {
    return cloudInitSupported;
  }


  public void setCloudInitSupported(Boolean cloudInitSupported) {
    this.cloudInitSupported = cloudInitSupported;
  }


  public VmTemplateCreationParams vmId(String vmId) {
    
    this.vmId = vmId;
    return this;
  }

   /**
   * Get vmId
   * @return vmId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getVmId() {
    return vmId;
  }


  public void setVmId(String vmId) {
    this.vmId = vmId;
  }


  public VmTemplateCreationParams description(String description) {
    
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


  public VmTemplateCreationParams name(String name) {
    
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
    VmTemplateCreationParams vmTemplateCreationParams = (VmTemplateCreationParams) o;
    return Objects.equals(this.clusterId, vmTemplateCreationParams.clusterId) &&
        Objects.equals(this.cloudInitSupported, vmTemplateCreationParams.cloudInitSupported) &&
        Objects.equals(this.vmId, vmTemplateCreationParams.vmId) &&
        Objects.equals(this.description, vmTemplateCreationParams.description) &&
        Objects.equals(this.name, vmTemplateCreationParams.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clusterId, cloudInitSupported, vmId, description, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VmTemplateCreationParams {\n");
    sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
    sb.append("    cloudInitSupported: ").append(toIndentedString(cloudInitSupported)).append("\n");
    sb.append("    vmId: ").append(toIndentedString(vmId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

