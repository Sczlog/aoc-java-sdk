package com.arcfra.aoc.model;

import java.util.Objects;
import java.util.Arrays;
import com.arcfra.aoc.model.ConsistentType;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * VmSnapshotCreationParamsData
 */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class VmSnapshotCreationParamsData {
  public static final String SERIALIZED_NAME_CONSISTENT_TYPE = "consistent_type";
  @SerializedName(SERIALIZED_NAME_CONSISTENT_TYPE)
  private ConsistentType consistentType;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_VM_ID = "vm_id";
  @SerializedName(SERIALIZED_NAME_VM_ID)
  private String vmId;

  public VmSnapshotCreationParamsData() { 
  }

  public VmSnapshotCreationParamsData consistentType(ConsistentType consistentType) {
    
    this.consistentType = consistentType;
    return this;
  }

   /**
   * Get consistentType
   * @return consistentType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ConsistentType getConsistentType() {
    return consistentType;
  }


  public void setConsistentType(ConsistentType consistentType) {
    this.consistentType = consistentType;
  }


  public VmSnapshotCreationParamsData name(String name) {
    
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


  public VmSnapshotCreationParamsData vmId(String vmId) {
    
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VmSnapshotCreationParamsData vmSnapshotCreationParamsData = (VmSnapshotCreationParamsData) o;
    return Objects.equals(this.consistentType, vmSnapshotCreationParamsData.consistentType) &&
        Objects.equals(this.name, vmSnapshotCreationParamsData.name) &&
        Objects.equals(this.vmId, vmSnapshotCreationParamsData.vmId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(consistentType, name, vmId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VmSnapshotCreationParamsData {\n");
    sb.append("    consistentType: ").append(toIndentedString(consistentType)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    vmId: ").append(toIndentedString(vmId)).append("\n");
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

