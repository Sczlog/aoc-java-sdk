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
import java.util.ArrayList;
import java.util.List;

/**
 * VmRemoveNicParamsData
 */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class VmRemoveNicParamsData {
  public static final String SERIALIZED_NAME_NIC_INDEX = "nic_index";
  @SerializedName(SERIALIZED_NAME_NIC_INDEX)
  private List<Integer> nicIndex = new ArrayList<Integer>();

  public VmRemoveNicParamsData() { 
  }

  public VmRemoveNicParamsData nicIndex(List<Integer> nicIndex) {
    
    this.nicIndex = nicIndex;
    return this;
  }

  public VmRemoveNicParamsData addNicIndexItem(Integer nicIndexItem) {
    this.nicIndex.add(nicIndexItem);
    return this;
  }

   /**
   * Get nicIndex
   * @return nicIndex
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<Integer> getNicIndex() {
    return nicIndex;
  }


  public void setNicIndex(List<Integer> nicIndex) {
    this.nicIndex = nicIndex;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VmRemoveNicParamsData vmRemoveNicParamsData = (VmRemoveNicParamsData) o;
    return Objects.equals(this.nicIndex, vmRemoveNicParamsData.nicIndex);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nicIndex);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VmRemoveNicParamsData {\n");
    sb.append("    nicIndex: ").append(toIndentedString(nicIndex)).append("\n");
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

