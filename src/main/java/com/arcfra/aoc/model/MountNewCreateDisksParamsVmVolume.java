package com.arcfra.aoc.model;

import java.util.Objects;
import java.util.Arrays;
import com.arcfra.aoc.model.ByteUnit;
import com.arcfra.aoc.model.VmVolumeElfStoragePolicyType;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * MountNewCreateDisksParamsVmVolume
 */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class MountNewCreateDisksParamsVmVolume {
  public static final String SERIALIZED_NAME_ELF_STORAGE_POLICY = "elf_storage_policy";
  @SerializedName(SERIALIZED_NAME_ELF_STORAGE_POLICY)
  private VmVolumeElfStoragePolicyType elfStoragePolicy;

  public static final String SERIALIZED_NAME_PATH = "path";
  @SerializedName(SERIALIZED_NAME_PATH)
  private String path;

  public static final String SERIALIZED_NAME_SIZE_UNIT = "size_unit";
  @SerializedName(SERIALIZED_NAME_SIZE_UNIT)
  private ByteUnit sizeUnit;

  public static final String SERIALIZED_NAME_SIZE = "size";
  @SerializedName(SERIALIZED_NAME_SIZE)
  private Long size;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public MountNewCreateDisksParamsVmVolume() { 
  }

  public MountNewCreateDisksParamsVmVolume elfStoragePolicy(VmVolumeElfStoragePolicyType elfStoragePolicy) {
    
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


  public MountNewCreateDisksParamsVmVolume path(String path) {
    
    this.path = path;
    return this;
  }

   /**
   * Get path
   * @return path
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPath() {
    return path;
  }


  public void setPath(String path) {
    this.path = path;
  }


  public MountNewCreateDisksParamsVmVolume sizeUnit(ByteUnit sizeUnit) {
    
    this.sizeUnit = sizeUnit;
    return this;
  }

   /**
   * Get sizeUnit
   * @return sizeUnit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ByteUnit getSizeUnit() {
    return sizeUnit;
  }


  public void setSizeUnit(ByteUnit sizeUnit) {
    this.sizeUnit = sizeUnit;
  }


  public MountNewCreateDisksParamsVmVolume size(Long size) {
    
    this.size = size;
    return this;
  }

   /**
   * Get size
   * @return size
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Long getSize() {
    return size;
  }


  public void setSize(Long size) {
    this.size = size;
  }


  public MountNewCreateDisksParamsVmVolume name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MountNewCreateDisksParamsVmVolume mountNewCreateDisksParamsVmVolume = (MountNewCreateDisksParamsVmVolume) o;
    return Objects.equals(this.elfStoragePolicy, mountNewCreateDisksParamsVmVolume.elfStoragePolicy) &&
        Objects.equals(this.path, mountNewCreateDisksParamsVmVolume.path) &&
        Objects.equals(this.sizeUnit, mountNewCreateDisksParamsVmVolume.sizeUnit) &&
        Objects.equals(this.size, mountNewCreateDisksParamsVmVolume.size) &&
        Objects.equals(this.name, mountNewCreateDisksParamsVmVolume.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(elfStoragePolicy, path, sizeUnit, size, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MountNewCreateDisksParamsVmVolume {\n");
    sb.append("    elfStoragePolicy: ").append(toIndentedString(elfStoragePolicy)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    sizeUnit: ").append(toIndentedString(sizeUnit)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

