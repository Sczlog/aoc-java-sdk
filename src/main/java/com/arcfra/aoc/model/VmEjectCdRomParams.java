package com.arcfra.aoc.model;

import java.util.Objects;
import java.util.Arrays;
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
 * VmEjectCdRomParams
 */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class VmEjectCdRomParams {
  public static final String SERIALIZED_NAME_WHERE = "where";
  @SerializedName(SERIALIZED_NAME_WHERE)
  private VmDiskWhereInput where;

  public VmEjectCdRomParams() { 
  }

  public VmEjectCdRomParams where(VmDiskWhereInput where) {
    
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
    VmEjectCdRomParams vmEjectCdRomParams = (VmEjectCdRomParams) o;
    return Objects.equals(this.where, vmEjectCdRomParams.where);
  }

  @Override
  public int hashCode() {
    return Objects.hash(where);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VmEjectCdRomParams {\n");
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

