package com.arcfra.aoc.model;

import java.util.Objects;
import java.util.Arrays;
import com.arcfra.aoc.model.UpdateVmVolumeParamsData;
import com.arcfra.aoc.model.VmVolumeWhereInput;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * UpdateVmVolumeParams
 */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class UpdateVmVolumeParams {
  public static final String SERIALIZED_NAME_WHERE = "where";
  @SerializedName(SERIALIZED_NAME_WHERE)
  private VmVolumeWhereInput where;

  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private UpdateVmVolumeParamsData data;

  public UpdateVmVolumeParams() { 
  }

  public UpdateVmVolumeParams where(VmVolumeWhereInput where) {
    
    this.where = where;
    return this;
  }

   /**
   * Get where
   * @return where
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public VmVolumeWhereInput getWhere() {
    return where;
  }


  public void setWhere(VmVolumeWhereInput where) {
    this.where = where;
  }


  public UpdateVmVolumeParams data(UpdateVmVolumeParamsData data) {
    
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public UpdateVmVolumeParamsData getData() {
    return data;
  }


  public void setData(UpdateVmVolumeParamsData data) {
    this.data = data;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateVmVolumeParams updateVmVolumeParams = (UpdateVmVolumeParams) o;
    return Objects.equals(this.where, updateVmVolumeParams.where) &&
        Objects.equals(this.data, updateVmVolumeParams.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(where, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateVmVolumeParams {\n");
    sb.append("    where: ").append(toIndentedString(where)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

