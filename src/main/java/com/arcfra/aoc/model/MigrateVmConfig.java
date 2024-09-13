package com.arcfra.aoc.model;

import java.util.Objects;
import java.util.Arrays;
import com.arcfra.aoc.model.MigrateType;
import com.arcfra.aoc.model.VlanMapping;
import com.arcfra.aoc.model.VmVolumeElfStoragePolicyType;
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
 * MigrateVmConfig
 */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class MigrateVmConfig {
  public static final String SERIALIZED_NAME_REMOVE_UNMOVABLE_DEVICES = "remove_unmovable_devices";
  @SerializedName(SERIALIZED_NAME_REMOVE_UNMOVABLE_DEVICES)
  private Boolean removeUnmovableDevices;

  public static final String SERIALIZED_NAME_NEW_NAME = "new_name";
  @SerializedName(SERIALIZED_NAME_NEW_NAME)
  private String newName;

  public static final String SERIALIZED_NAME_NETWORK_MAPPING = "network_mapping";
  @SerializedName(SERIALIZED_NAME_NETWORK_MAPPING)
  private List<VlanMapping> networkMapping = new ArrayList<VlanMapping>();

  public static final String SERIALIZED_NAME_MIGRATE_TYPE = "migrate_type";
  @SerializedName(SERIALIZED_NAME_MIGRATE_TYPE)
  private MigrateType migrateType;

  public static final String SERIALIZED_NAME_ELF_STORAGE_POLICY = "elf_storage_policy";
  @SerializedName(SERIALIZED_NAME_ELF_STORAGE_POLICY)
  private VmVolumeElfStoragePolicyType elfStoragePolicy;

  public static final String SERIALIZED_NAME_DELETE_SRC_VM = "delete_src_vm";
  @SerializedName(SERIALIZED_NAME_DELETE_SRC_VM)
  private Boolean deleteSrcVm;

  public MigrateVmConfig() { 
  }

  public MigrateVmConfig removeUnmovableDevices(Boolean removeUnmovableDevices) {
    
    this.removeUnmovableDevices = removeUnmovableDevices;
    return this;
  }

   /**
   * Get removeUnmovableDevices
   * @return removeUnmovableDevices
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getRemoveUnmovableDevices() {
    return removeUnmovableDevices;
  }


  public void setRemoveUnmovableDevices(Boolean removeUnmovableDevices) {
    this.removeUnmovableDevices = removeUnmovableDevices;
  }


  public MigrateVmConfig newName(String newName) {
    
    this.newName = newName;
    return this;
  }

   /**
   * Get newName
   * @return newName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNewName() {
    return newName;
  }


  public void setNewName(String newName) {
    this.newName = newName;
  }


  public MigrateVmConfig networkMapping(List<VlanMapping> networkMapping) {
    
    this.networkMapping = networkMapping;
    return this;
  }

  public MigrateVmConfig addNetworkMappingItem(VlanMapping networkMappingItem) {
    this.networkMapping.add(networkMappingItem);
    return this;
  }

   /**
   * Get networkMapping
   * @return networkMapping
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<VlanMapping> getNetworkMapping() {
    return networkMapping;
  }


  public void setNetworkMapping(List<VlanMapping> networkMapping) {
    this.networkMapping = networkMapping;
  }


  public MigrateVmConfig migrateType(MigrateType migrateType) {
    
    this.migrateType = migrateType;
    return this;
  }

   /**
   * Get migrateType
   * @return migrateType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public MigrateType getMigrateType() {
    return migrateType;
  }


  public void setMigrateType(MigrateType migrateType) {
    this.migrateType = migrateType;
  }


  public MigrateVmConfig elfStoragePolicy(VmVolumeElfStoragePolicyType elfStoragePolicy) {
    
    this.elfStoragePolicy = elfStoragePolicy;
    return this;
  }

   /**
   * Get elfStoragePolicy
   * @return elfStoragePolicy
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public VmVolumeElfStoragePolicyType getElfStoragePolicy() {
    return elfStoragePolicy;
  }


  public void setElfStoragePolicy(VmVolumeElfStoragePolicyType elfStoragePolicy) {
    this.elfStoragePolicy = elfStoragePolicy;
  }


  public MigrateVmConfig deleteSrcVm(Boolean deleteSrcVm) {
    
    this.deleteSrcVm = deleteSrcVm;
    return this;
  }

   /**
   * Get deleteSrcVm
   * @return deleteSrcVm
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getDeleteSrcVm() {
    return deleteSrcVm;
  }


  public void setDeleteSrcVm(Boolean deleteSrcVm) {
    this.deleteSrcVm = deleteSrcVm;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MigrateVmConfig migrateVmConfig = (MigrateVmConfig) o;
    return Objects.equals(this.removeUnmovableDevices, migrateVmConfig.removeUnmovableDevices) &&
        Objects.equals(this.newName, migrateVmConfig.newName) &&
        Objects.equals(this.networkMapping, migrateVmConfig.networkMapping) &&
        Objects.equals(this.migrateType, migrateVmConfig.migrateType) &&
        Objects.equals(this.elfStoragePolicy, migrateVmConfig.elfStoragePolicy) &&
        Objects.equals(this.deleteSrcVm, migrateVmConfig.deleteSrcVm);
  }

  @Override
  public int hashCode() {
    return Objects.hash(removeUnmovableDevices, newName, networkMapping, migrateType, elfStoragePolicy, deleteSrcVm);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MigrateVmConfig {\n");
    sb.append("    removeUnmovableDevices: ").append(toIndentedString(removeUnmovableDevices)).append("\n");
    sb.append("    newName: ").append(toIndentedString(newName)).append("\n");
    sb.append("    networkMapping: ").append(toIndentedString(networkMapping)).append("\n");
    sb.append("    migrateType: ").append(toIndentedString(migrateType)).append("\n");
    sb.append("    elfStoragePolicy: ").append(toIndentedString(elfStoragePolicy)).append("\n");
    sb.append("    deleteSrcVm: ").append(toIndentedString(deleteSrcVm)).append("\n");
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

