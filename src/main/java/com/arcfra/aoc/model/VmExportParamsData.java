package com.arcfra.aoc.model;

import java.util.Objects;
import java.util.Arrays;
import com.arcfra.aoc.model.VmExportFileType;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * VmExportParamsData
 */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class VmExportParamsData {
  public static final String SERIALIZED_NAME_KEEP_MAC = "keep_mac";
  @SerializedName(SERIALIZED_NAME_KEEP_MAC)
  private Boolean keepMac;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private VmExportFileType type;

  public VmExportParamsData() { 
  }

  public VmExportParamsData keepMac(Boolean keepMac) {
    
    this.keepMac = keepMac;
    return this;
  }

   /**
   * Get keepMac
   * @return keepMac
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getKeepMac() {
    return keepMac;
  }


  public void setKeepMac(Boolean keepMac) {
    this.keepMac = keepMac;
  }


  public VmExportParamsData type(VmExportFileType type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public VmExportFileType getType() {
    return type;
  }


  public void setType(VmExportFileType type) {
    this.type = type;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VmExportParamsData vmExportParamsData = (VmExportParamsData) o;
    return Objects.equals(this.keepMac, vmExportParamsData.keepMac) &&
        Objects.equals(this.type, vmExportParamsData.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(keepMac, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VmExportParamsData {\n");
    sb.append("    keepMac: ").append(toIndentedString(keepMac)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

