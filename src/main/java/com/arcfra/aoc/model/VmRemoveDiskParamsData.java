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
 * VmRemoveDiskParamsData
 */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class VmRemoveDiskParamsData {
  public static final String SERIALIZED_NAME_DISK_IDS = "disk_ids";
  @SerializedName(SERIALIZED_NAME_DISK_IDS)
  private List<String> diskIds = new ArrayList<String>();

  public VmRemoveDiskParamsData() { 
  }

  public VmRemoveDiskParamsData diskIds(List<String> diskIds) {
    
    this.diskIds = diskIds;
    return this;
  }

  public VmRemoveDiskParamsData addDiskIdsItem(String diskIdsItem) {
    this.diskIds.add(diskIdsItem);
    return this;
  }

   /**
   * Get diskIds
   * @return diskIds
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<String> getDiskIds() {
    return diskIds;
  }


  public void setDiskIds(List<String> diskIds) {
    this.diskIds = diskIds;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VmRemoveDiskParamsData vmRemoveDiskParamsData = (VmRemoveDiskParamsData) o;
    return Objects.equals(this.diskIds, vmRemoveDiskParamsData.diskIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(diskIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VmRemoveDiskParamsData {\n");
    sb.append("    diskIds: ").append(toIndentedString(diskIds)).append("\n");
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

