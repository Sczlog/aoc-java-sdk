package com.arcfra.aoc.model;

import java.util.Objects;
import java.util.Arrays;
import com.arcfra.aoc.model.VmPlacementGroupUpdationParamsData;
import com.arcfra.aoc.model.VmPlacementGroupWhereInput;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * VmPlacementGroupUpdationParams
 */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class VmPlacementGroupUpdationParams {
  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private VmPlacementGroupUpdationParamsData data;

  public static final String SERIALIZED_NAME_WHERE = "where";
  @SerializedName(SERIALIZED_NAME_WHERE)
  private VmPlacementGroupWhereInput where;

  public VmPlacementGroupUpdationParams() { 
  }

  public VmPlacementGroupUpdationParams data(VmPlacementGroupUpdationParamsData data) {
    
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public VmPlacementGroupUpdationParamsData getData() {
    return data;
  }


  public void setData(VmPlacementGroupUpdationParamsData data) {
    this.data = data;
  }


  public VmPlacementGroupUpdationParams where(VmPlacementGroupWhereInput where) {
    
    this.where = where;
    return this;
  }

   /**
   * Get where
   * @return where
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public VmPlacementGroupWhereInput getWhere() {
    return where;
  }


  public void setWhere(VmPlacementGroupWhereInput where) {
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
    VmPlacementGroupUpdationParams vmPlacementGroupUpdationParams = (VmPlacementGroupUpdationParams) o;
    return Objects.equals(this.data, vmPlacementGroupUpdationParams.data) &&
        Objects.equals(this.where, vmPlacementGroupUpdationParams.where);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, where);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VmPlacementGroupUpdationParams {\n");
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

