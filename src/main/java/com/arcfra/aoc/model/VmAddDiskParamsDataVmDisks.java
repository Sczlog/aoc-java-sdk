package com.arcfra.aoc.model;

import java.util.Objects;
import java.util.Arrays;
import com.arcfra.aoc.model.MountDisksParams;
import com.arcfra.aoc.model.MountNewCreateDisksParams;
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
 * VmAddDiskParamsDataVmDisks
 */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class VmAddDiskParamsDataVmDisks {
  public static final String SERIALIZED_NAME_MOUNT_DISKS = "mount_disks";
  @SerializedName(SERIALIZED_NAME_MOUNT_DISKS)
  private List<MountDisksParams> mountDisks = null;

  public static final String SERIALIZED_NAME_MOUNT_NEW_CREATE_DISKS = "mount_new_create_disks";
  @SerializedName(SERIALIZED_NAME_MOUNT_NEW_CREATE_DISKS)
  private List<MountNewCreateDisksParams> mountNewCreateDisks = null;

  public VmAddDiskParamsDataVmDisks() { 
  }

  public VmAddDiskParamsDataVmDisks mountDisks(List<MountDisksParams> mountDisks) {
    
    this.mountDisks = mountDisks;
    return this;
  }

  public VmAddDiskParamsDataVmDisks addMountDisksItem(MountDisksParams mountDisksItem) {
    if (this.mountDisks == null) {
      this.mountDisks = new ArrayList<MountDisksParams>();
    }
    this.mountDisks.add(mountDisksItem);
    return this;
  }

   /**
   * Get mountDisks
   * @return mountDisks
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<MountDisksParams> getMountDisks() {
    return mountDisks;
  }


  public void setMountDisks(List<MountDisksParams> mountDisks) {
    this.mountDisks = mountDisks;
  }


  public VmAddDiskParamsDataVmDisks mountNewCreateDisks(List<MountNewCreateDisksParams> mountNewCreateDisks) {
    
    this.mountNewCreateDisks = mountNewCreateDisks;
    return this;
  }

  public VmAddDiskParamsDataVmDisks addMountNewCreateDisksItem(MountNewCreateDisksParams mountNewCreateDisksItem) {
    if (this.mountNewCreateDisks == null) {
      this.mountNewCreateDisks = new ArrayList<MountNewCreateDisksParams>();
    }
    this.mountNewCreateDisks.add(mountNewCreateDisksItem);
    return this;
  }

   /**
   * Get mountNewCreateDisks
   * @return mountNewCreateDisks
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<MountNewCreateDisksParams> getMountNewCreateDisks() {
    return mountNewCreateDisks;
  }


  public void setMountNewCreateDisks(List<MountNewCreateDisksParams> mountNewCreateDisks) {
    this.mountNewCreateDisks = mountNewCreateDisks;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VmAddDiskParamsDataVmDisks vmAddDiskParamsDataVmDisks = (VmAddDiskParamsDataVmDisks) o;
    return Objects.equals(this.mountDisks, vmAddDiskParamsDataVmDisks.mountDisks) &&
        Objects.equals(this.mountNewCreateDisks, vmAddDiskParamsDataVmDisks.mountNewCreateDisks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mountDisks, mountNewCreateDisks);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VmAddDiskParamsDataVmDisks {\n");
    sb.append("    mountDisks: ").append(toIndentedString(mountDisks)).append("\n");
    sb.append("    mountNewCreateDisks: ").append(toIndentedString(mountNewCreateDisks)).append("\n");
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

