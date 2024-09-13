package com.arcfra.aoc.model;

import java.util.Objects;
import java.util.Arrays;
import com.arcfra.aoc.model.ContentLibraryVmdkCdromModify;
import com.arcfra.aoc.model.ContentLibraryVmdkCdromMount;
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
 * ContentLibraryVmTemplateOvfDiskOperate
 */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class ContentLibraryVmTemplateOvfDiskOperate {
  public static final String SERIALIZED_NAME_MOUNT_NEW_CD_ROMS = "mount_new_cd_roms";
  @SerializedName(SERIALIZED_NAME_MOUNT_NEW_CD_ROMS)
  private List<ContentLibraryVmdkCdromMount> mountNewCdRoms = null;

  public static final String SERIALIZED_NAME_MODIFY_CD_ROMS = "modify_cd_roms";
  @SerializedName(SERIALIZED_NAME_MODIFY_CD_ROMS)
  private List<ContentLibraryVmdkCdromModify> modifyCdRoms = null;

  public static final String SERIALIZED_NAME_MODIFY_VMDK_DISKS = "modify_vmdk_disks";
  @SerializedName(SERIALIZED_NAME_MODIFY_VMDK_DISKS)
  private List<VmdkDiskModify> modifyVmdkDisks = null;

  public ContentLibraryVmTemplateOvfDiskOperate() { 
  }

  public ContentLibraryVmTemplateOvfDiskOperate mountNewCdRoms(List<ContentLibraryVmdkCdromMount> mountNewCdRoms) {
    
    this.mountNewCdRoms = mountNewCdRoms;
    return this;
  }

  public ContentLibraryVmTemplateOvfDiskOperate addMountNewCdRomsItem(ContentLibraryVmdkCdromMount mountNewCdRomsItem) {
    if (this.mountNewCdRoms == null) {
      this.mountNewCdRoms = new ArrayList<ContentLibraryVmdkCdromMount>();
    }
    this.mountNewCdRoms.add(mountNewCdRomsItem);
    return this;
  }

   /**
   * Get mountNewCdRoms
   * @return mountNewCdRoms
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<ContentLibraryVmdkCdromMount> getMountNewCdRoms() {
    return mountNewCdRoms;
  }


  public void setMountNewCdRoms(List<ContentLibraryVmdkCdromMount> mountNewCdRoms) {
    this.mountNewCdRoms = mountNewCdRoms;
  }


  public ContentLibraryVmTemplateOvfDiskOperate modifyCdRoms(List<ContentLibraryVmdkCdromModify> modifyCdRoms) {
    
    this.modifyCdRoms = modifyCdRoms;
    return this;
  }

  public ContentLibraryVmTemplateOvfDiskOperate addModifyCdRomsItem(ContentLibraryVmdkCdromModify modifyCdRomsItem) {
    if (this.modifyCdRoms == null) {
      this.modifyCdRoms = new ArrayList<ContentLibraryVmdkCdromModify>();
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

  public List<ContentLibraryVmdkCdromModify> getModifyCdRoms() {
    return modifyCdRoms;
  }


  public void setModifyCdRoms(List<ContentLibraryVmdkCdromModify> modifyCdRoms) {
    this.modifyCdRoms = modifyCdRoms;
  }


  public ContentLibraryVmTemplateOvfDiskOperate modifyVmdkDisks(List<VmdkDiskModify> modifyVmdkDisks) {
    
    this.modifyVmdkDisks = modifyVmdkDisks;
    return this;
  }

  public ContentLibraryVmTemplateOvfDiskOperate addModifyVmdkDisksItem(VmdkDiskModify modifyVmdkDisksItem) {
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
    ContentLibraryVmTemplateOvfDiskOperate contentLibraryVmTemplateOvfDiskOperate = (ContentLibraryVmTemplateOvfDiskOperate) o;
    return Objects.equals(this.mountNewCdRoms, contentLibraryVmTemplateOvfDiskOperate.mountNewCdRoms) &&
        Objects.equals(this.modifyCdRoms, contentLibraryVmTemplateOvfDiskOperate.modifyCdRoms) &&
        Objects.equals(this.modifyVmdkDisks, contentLibraryVmTemplateOvfDiskOperate.modifyVmdkDisks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mountNewCdRoms, modifyCdRoms, modifyVmdkDisks);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContentLibraryVmTemplateOvfDiskOperate {\n");
    sb.append("    mountNewCdRoms: ").append(toIndentedString(mountNewCdRoms)).append("\n");
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

