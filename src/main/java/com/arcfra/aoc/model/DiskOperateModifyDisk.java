package com.arcfra.aoc.model;

import java.util.Objects;
import java.util.Arrays;
import com.arcfra.aoc.model.Bus;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * DiskOperateModifyDisk
 */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class DiskOperateModifyDisk {
  public static final String SERIALIZED_NAME_VM_VOLUME_ID = "vm_volume_id";
  @SerializedName(SERIALIZED_NAME_VM_VOLUME_ID)
  private String vmVolumeId;

  public static final String SERIALIZED_NAME_BUS = "bus";
  @SerializedName(SERIALIZED_NAME_BUS)
  private Bus bus;

  public static final String SERIALIZED_NAME_DISK_INDEX = "disk_index";
  @SerializedName(SERIALIZED_NAME_DISK_INDEX)
  private Integer diskIndex;

  public DiskOperateModifyDisk() { 
  }

  public DiskOperateModifyDisk vmVolumeId(String vmVolumeId) {
    
    this.vmVolumeId = vmVolumeId;
    return this;
  }

   /**
   * Get vmVolumeId
   * @return vmVolumeId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getVmVolumeId() {
    return vmVolumeId;
  }


  public void setVmVolumeId(String vmVolumeId) {
    this.vmVolumeId = vmVolumeId;
  }


  public DiskOperateModifyDisk bus(Bus bus) {
    
    this.bus = bus;
    return this;
  }

   /**
   * Get bus
   * @return bus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Bus getBus() {
    return bus;
  }


  public void setBus(Bus bus) {
    this.bus = bus;
  }


  public DiskOperateModifyDisk diskIndex(Integer diskIndex) {
    
    this.diskIndex = diskIndex;
    return this;
  }

   /**
   * Get diskIndex
   * @return diskIndex
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getDiskIndex() {
    return diskIndex;
  }


  public void setDiskIndex(Integer diskIndex) {
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
    DiskOperateModifyDisk diskOperateModifyDisk = (DiskOperateModifyDisk) o;
    return Objects.equals(this.vmVolumeId, diskOperateModifyDisk.vmVolumeId) &&
        Objects.equals(this.bus, diskOperateModifyDisk.bus) &&
        Objects.equals(this.diskIndex, diskOperateModifyDisk.diskIndex);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vmVolumeId, bus, diskIndex);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DiskOperateModifyDisk {\n");
    sb.append("    vmVolumeId: ").append(toIndentedString(vmVolumeId)).append("\n");
    sb.append("    bus: ").append(toIndentedString(bus)).append("\n");
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

