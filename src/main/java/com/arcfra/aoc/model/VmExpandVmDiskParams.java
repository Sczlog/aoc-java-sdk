package com.arcfra.aoc.model;

import java.util.Objects;
import java.util.Arrays;
import com.arcfra.aoc.model.ByteUnit;
import com.arcfra.aoc.model.VmDiskWhereInput;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * VmExpandVmDiskParams
 */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class VmExpandVmDiskParams {
  public static final String SERIALIZED_NAME_SIZE_UNIT = "size_unit";
  @SerializedName(SERIALIZED_NAME_SIZE_UNIT)
  private ByteUnit sizeUnit;

  public static final String SERIALIZED_NAME_SIZE = "size";
  @SerializedName(SERIALIZED_NAME_SIZE)
  private Long size;

  public static final String SERIALIZED_NAME_WHERE = "where";
  @SerializedName(SERIALIZED_NAME_WHERE)
  private VmDiskWhereInput where;

  public VmExpandVmDiskParams() { 
  }

  public VmExpandVmDiskParams sizeUnit(ByteUnit sizeUnit) {
    
    this.sizeUnit = sizeUnit;
    return this;
  }

   /**
   * Get sizeUnit
   * @return sizeUnit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ByteUnit getSizeUnit() {
    return sizeUnit;
  }


  public void setSizeUnit(ByteUnit sizeUnit) {
    this.sizeUnit = sizeUnit;
  }


  public VmExpandVmDiskParams size(Long size) {
    
    this.size = size;
    return this;
  }

   /**
   * Get size
   * @return size
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Long getSize() {
    return size;
  }


  public void setSize(Long size) {
    this.size = size;
  }


  public VmExpandVmDiskParams where(VmDiskWhereInput where) {
    
    this.where = where;
    return this;
  }

   /**
   * Get where
   * @return where
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public VmDiskWhereInput getWhere() {
    return where;
  }


  public void setWhere(VmDiskWhereInput where) {
    this.where = where;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VmExpandVmDiskParams vmExpandVmDiskParams = (VmExpandVmDiskParams) o;
    return Objects.equals(this.sizeUnit, vmExpandVmDiskParams.sizeUnit) &&
        Objects.equals(this.size, vmExpandVmDiskParams.size) &&
        Objects.equals(this.where, vmExpandVmDiskParams.where);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sizeUnit, size, where);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VmExpandVmDiskParams {\n");
    sb.append("    sizeUnit: ").append(toIndentedString(sizeUnit)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    where: ").append(toIndentedString(where)).append("\n");
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

