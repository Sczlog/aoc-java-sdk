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
 * VmDiskOperateRemoveDisks
 */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class VmDiskOperateRemoveDisks {
  public static final String SERIALIZED_NAME_DISK_INDEX = "disk_index";
  @SerializedName(SERIALIZED_NAME_DISK_INDEX)
  private List<Integer> diskIndex = new ArrayList<Integer>();

  public VmDiskOperateRemoveDisks() { 
  }

  public VmDiskOperateRemoveDisks diskIndex(List<Integer> diskIndex) {
    
    this.diskIndex = diskIndex;
    return this;
  }

  public VmDiskOperateRemoveDisks addDiskIndexItem(Integer diskIndexItem) {
    this.diskIndex.add(diskIndexItem);
    return this;
  }

   /**
   * Get diskIndex
   * @return diskIndex
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<Integer> getDiskIndex() {
    return diskIndex;
  }


  public void setDiskIndex(List<Integer> diskIndex) {
    this.diskIndex = diskIndex;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VmDiskOperateRemoveDisks vmDiskOperateRemoveDisks = (VmDiskOperateRemoveDisks) o;
    return Objects.equals(this.diskIndex, vmDiskOperateRemoveDisks.diskIndex);
  }

  @Override
  public int hashCode() {
    return Objects.hash(diskIndex);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VmDiskOperateRemoveDisks {\n");
    sb.append("    diskIndex: ").append(toIndentedString(diskIndex)).append("\n");
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

