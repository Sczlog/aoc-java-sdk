package com.arcfra.aoc.model;

import java.util.Objects;
import java.util.Arrays;
import com.arcfra.aoc.model.VmSnapshotCreationParamsData;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * VmSnapshotCreationParams
 */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class VmSnapshotCreationParams {
  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private List<VmSnapshotCreationParamsData> data = new ArrayList<VmSnapshotCreationParamsData>();

  public VmSnapshotCreationParams() { 
  }

  public VmSnapshotCreationParams data(List<VmSnapshotCreationParamsData> data) {
    
    this.data = data;
    return this;
  }

  public VmSnapshotCreationParams addDataItem(VmSnapshotCreationParamsData dataItem) {
    this.data.add(dataItem);
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<VmSnapshotCreationParamsData> getData() {
    return data;
  }


  public void setData(List<VmSnapshotCreationParamsData> data) {
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
    VmSnapshotCreationParams vmSnapshotCreationParams = (VmSnapshotCreationParams) o;
    return Objects.equals(this.data, vmSnapshotCreationParams.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VmSnapshotCreationParams {\n");
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

