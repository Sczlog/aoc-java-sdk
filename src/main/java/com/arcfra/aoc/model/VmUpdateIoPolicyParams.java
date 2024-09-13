package com.arcfra.aoc.model;

import java.util.Objects;
import java.util.Arrays;
import com.arcfra.aoc.model.VmUpdateIoPolicyParamsData;
import com.arcfra.aoc.model.VmWhereInput;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * VmUpdateIoPolicyParams
 */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class VmUpdateIoPolicyParams {
  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private VmUpdateIoPolicyParamsData data;

  public static final String SERIALIZED_NAME_WHERE = "where";
  @SerializedName(SERIALIZED_NAME_WHERE)
  private VmWhereInput where;

  public VmUpdateIoPolicyParams() { 
  }

  public VmUpdateIoPolicyParams data(VmUpdateIoPolicyParamsData data) {
    
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public VmUpdateIoPolicyParamsData getData() {
    return data;
  }


  public void setData(VmUpdateIoPolicyParamsData data) {
    this.data = data;
  }


  public VmUpdateIoPolicyParams where(VmWhereInput where) {
    
    this.where = where;
    return this;
  }

   /**
   * Get where
   * @return where
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public VmWhereInput getWhere() {
    return where;
  }


  public void setWhere(VmWhereInput where) {
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
    VmUpdateIoPolicyParams vmUpdateIoPolicyParams = (VmUpdateIoPolicyParams) o;
    return Objects.equals(this.data, vmUpdateIoPolicyParams.data) &&
        Objects.equals(this.where, vmUpdateIoPolicyParams.where);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, where);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VmUpdateIoPolicyParams {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

