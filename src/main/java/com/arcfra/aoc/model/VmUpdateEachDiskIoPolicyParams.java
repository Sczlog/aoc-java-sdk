package com.arcfra.aoc.model;

import java.util.Objects;
import java.util.Arrays;
import com.arcfra.aoc.model.VmRestrictIoParamsData;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * VmUpdateEachDiskIoPolicyParams
 */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class VmUpdateEachDiskIoPolicyParams {
  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private VmRestrictIoParamsData data;

  public static final String SERIALIZED_NAME_BOOT = "boot";
  @SerializedName(SERIALIZED_NAME_BOOT)
  private Integer boot;

  public VmUpdateEachDiskIoPolicyParams() { 
  }

  public VmUpdateEachDiskIoPolicyParams data(VmRestrictIoParamsData data) {
    
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public VmRestrictIoParamsData getData() {
    return data;
  }


  public void setData(VmRestrictIoParamsData data) {
    this.data = data;
  }


  public VmUpdateEachDiskIoPolicyParams boot(Integer boot) {
    
    this.boot = boot;
    return this;
  }

   /**
   * Get boot
   * @return boot
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getBoot() {
    return boot;
  }


  public void setBoot(Integer boot) {
    this.boot = boot;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VmUpdateEachDiskIoPolicyParams vmUpdateEachDiskIoPolicyParams = (VmUpdateEachDiskIoPolicyParams) o;
    return Objects.equals(this.data, vmUpdateEachDiskIoPolicyParams.data) &&
        Objects.equals(this.boot, vmUpdateEachDiskIoPolicyParams.boot);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, boot);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VmUpdateEachDiskIoPolicyParams {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    boot: ").append(toIndentedString(boot)).append("\n");
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

