package com.arcfra.aoc.model;

import java.util.Objects;
import java.util.Arrays;
import com.arcfra.aoc.model.VmDiskParams;
import com.arcfra.aoc.model.VmdkCdromModify;
import com.arcfra.aoc.model.VmdkDiskModify;
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
 * OvfDiskOperate
 */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class OvfDiskOperate {
  public static final String SERIALIZED_NAME_NEW_DISKS = "new_disks";
  @SerializedName(SERIALIZED_NAME_NEW_DISKS)
  private VmDiskParams newDisks;

  public static final String SERIALIZED_NAME_MODIFY_CD_ROMS = "modify_cd_roms";
  @SerializedName(SERIALIZED_NAME_MODIFY_CD_ROMS)
  private List<VmdkCdromModify> modifyCdRoms = null;

  public static final String SERIALIZED_NAME_MODIFY_VMDK_DISKS = "modify_vmdk_disks";
  @SerializedName(SERIALIZED_NAME_MODIFY_VMDK_DISKS)
  private List<VmdkDiskModify> modifyVmdkDisks = null;

  public OvfDiskOperate() { 
  }

  public OvfDiskOperate newDisks(VmDiskParams newDisks) {
    
    this.newDisks = newDisks;
    return this;
  }

   /**
   * Get newDisks
   * @return newDisks
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VmDiskParams getNewDisks() {
    return newDisks;
  }


  public void setNewDisks(VmDiskParams newDisks) {
    this.newDisks = newDisks;
  }


  public OvfDiskOperate modifyCdRoms(List<VmdkCdromModify> modifyCdRoms) {
    
    this.modifyCdRoms = modifyCdRoms;
    return this;
  }

  public OvfDiskOperate addModifyCdRomsItem(VmdkCdromModify modifyCdRomsItem) {
    if (this.modifyCdRoms == null) {
      this.modifyCdRoms = new ArrayList<VmdkCdromModify>();
    }
    this.modifyCdRoms.add(modifyCdRomsItem);
    return this;
  }

   /**
   * Get modifyCdRoms
   * @return modifyCdRoms
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<VmdkCdromModify> getModifyCdRoms() {
    return modifyCdRoms;
  }


  public void setModifyCdRoms(List<VmdkCdromModify> modifyCdRoms) {
    this.modifyCdRoms = modifyCdRoms;
  }


  public OvfDiskOperate modifyVmdkDisks(List<VmdkDiskModify> modifyVmdkDisks) {
    
    this.modifyVmdkDisks = modifyVmdkDisks;
    return this;
  }

  public OvfDiskOperate addModifyVmdkDisksItem(VmdkDiskModify modifyVmdkDisksItem) {
    if (this.modifyVmdkDisks == null) {
      this.modifyVmdkDisks = new ArrayList<VmdkDiskModify>();
    }
    this.modifyVmdkDisks.add(modifyVmdkDisksItem);
    return this;
  }

   /**
   * Get modifyVmdkDisks
   * @return modifyVmdkDisks
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<VmdkDiskModify> getModifyVmdkDisks() {
    return modifyVmdkDisks;
  }


  public void setModifyVmdkDisks(List<VmdkDiskModify> modifyVmdkDisks) {
    this.modifyVmdkDisks = modifyVmdkDisks;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OvfDiskOperate ovfDiskOperate = (OvfDiskOperate) o;
    return Objects.equals(this.newDisks, ovfDiskOperate.newDisks) &&
        Objects.equals(this.modifyCdRoms, ovfDiskOperate.modifyCdRoms) &&
        Objects.equals(this.modifyVmdkDisks, ovfDiskOperate.modifyVmdkDisks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(newDisks, modifyCdRoms, modifyVmdkDisks);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OvfDiskOperate {\n");
    sb.append("    newDisks: ").append(toIndentedString(newDisks)).append("\n");
    sb.append("    modifyCdRoms: ").append(toIndentedString(modifyCdRoms)).append("\n");
    sb.append("    modifyVmdkDisks: ").append(toIndentedString(modifyVmdkDisks)).append("\n");
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

