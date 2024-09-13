package com.arcfra.aoc.model;

import java.util.Objects;
import java.util.Arrays;
import com.arcfra.aoc.model.MountDisksParams;
import com.arcfra.aoc.model.MountNewCreateDisksParams;
import com.arcfra.aoc.model.VmCdRomParams;
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
 * VmDiskParams
 */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class VmDiskParams {
  public static final String SERIALIZED_NAME_MOUNT_CD_ROMS = "mount_cd_roms";
  @SerializedName(SERIALIZED_NAME_MOUNT_CD_ROMS)
  private List<VmCdRomParams> mountCdRoms = null;

  public static final String SERIALIZED_NAME_MOUNT_DISKS = "mount_disks";
  @SerializedName(SERIALIZED_NAME_MOUNT_DISKS)
  private List<MountDisksParams> mountDisks = null;

  public static final String SERIALIZED_NAME_MOUNT_NEW_CREATE_DISKS = "mount_new_create_disks";
  @SerializedName(SERIALIZED_NAME_MOUNT_NEW_CREATE_DISKS)
  private List<MountNewCreateDisksParams> mountNewCreateDisks = null;

  public VmDiskParams() { 
  }

  public VmDiskParams mountCdRoms(List<VmCdRomParams> mountCdRoms) {
    
    this.mountCdRoms = mountCdRoms;
    return this;
  }

  public VmDiskParams addMountCdRomsItem(VmCdRomParams mountCdRomsItem) {
    if (this.mountCdRoms == null) {
      this.mountCdRoms = new ArrayList<VmCdRomParams>();
    }
    this.mountCdRoms.add(mountCdRomsItem);
    return this;
  }

   /**
   * Get mountCdRoms
   * @return mountCdRoms
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<VmCdRomParams> getMountCdRoms() {
    return mountCdRoms;
  }


  public void setMountCdRoms(List<VmCdRomParams> mountCdRoms) {
    this.mountCdRoms = mountCdRoms;
  }


  public VmDiskParams mountDisks(List<MountDisksParams> mountDisks) {
    
    this.mountDisks = mountDisks;
    return this;
  }

  public VmDiskParams addMountDisksItem(MountDisksParams mountDisksItem) {
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


  public VmDiskParams mountNewCreateDisks(List<MountNewCreateDisksParams> mountNewCreateDisks) {
    
    this.mountNewCreateDisks = mountNewCreateDisks;
    return this;
  }

  public VmDiskParams addMountNewCreateDisksItem(MountNewCreateDisksParams mountNewCreateDisksItem) {
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
    VmDiskParams vmDiskParams = (VmDiskParams) o;
    return Objects.equals(this.mountCdRoms, vmDiskParams.mountCdRoms) &&
        Objects.equals(this.mountDisks, vmDiskParams.mountDisks) &&
        Objects.equals(this.mountNewCreateDisks, vmDiskParams.mountNewCreateDisks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mountCdRoms, mountDisks, mountNewCreateDisks);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VmDiskParams {\n");
    sb.append("    mountCdRoms: ").append(toIndentedString(mountCdRoms)).append("\n");
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

