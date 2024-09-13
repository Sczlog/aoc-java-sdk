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

/**
 * VmCdRomParams
 */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class VmCdRomParams {
  public static final String SERIALIZED_NAME_CONTENT_LIBRARY_IMAGE_ID = "content_library_image_id";
  @SerializedName(SERIALIZED_NAME_CONTENT_LIBRARY_IMAGE_ID)
  private String contentLibraryImageId;

  public static final String SERIALIZED_NAME_ELF_IMAGE_ID = "elf_image_id";
  @SerializedName(SERIALIZED_NAME_ELF_IMAGE_ID)
  private String elfImageId;

  public static final String SERIALIZED_NAME_INDEX = "index";
  @SerializedName(SERIALIZED_NAME_INDEX)
  private Integer index;

  public static final String SERIALIZED_NAME_KEY = "key";
  @SerializedName(SERIALIZED_NAME_KEY)
  private Integer key;

  public static final String SERIALIZED_NAME_BOOT = "boot";
  @SerializedName(SERIALIZED_NAME_BOOT)
  private Integer boot;

  public VmCdRomParams() { 
  }

  public VmCdRomParams contentLibraryImageId(String contentLibraryImageId) {
    
    this.contentLibraryImageId = contentLibraryImageId;
    return this;
  }

   /**
   * Get contentLibraryImageId
   * @return contentLibraryImageId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getContentLibraryImageId() {
    return contentLibraryImageId;
  }


  public void setContentLibraryImageId(String contentLibraryImageId) {
    this.contentLibraryImageId = contentLibraryImageId;
  }


  public VmCdRomParams elfImageId(String elfImageId) {
    
    this.elfImageId = elfImageId;
    return this;
  }

   /**
   * Get elfImageId
   * @return elfImageId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getElfImageId() {
    return elfImageId;
  }


  public void setElfImageId(String elfImageId) {
    this.elfImageId = elfImageId;
  }


  public VmCdRomParams index(Integer index) {
    
    this.index = index;
    return this;
  }

   /**
   * Get index
   * @return index
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getIndex() {
    return index;
  }


  public void setIndex(Integer index) {
    this.index = index;
  }


  public VmCdRomParams key(Integer key) {
    
    this.key = key;
    return this;
  }

   /**
   * Get key
   * @return key
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getKey() {
    return key;
  }


  public void setKey(Integer key) {
    this.key = key;
  }


  public VmCdRomParams boot(Integer boot) {
    
    this.boot = boot;
    return this;
  }

   /**
   * Get boot
   * @return boot
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getBoot() {
    return boot;
  }


  public void setBoot(Integer boot) {
    this.boot = boot;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VmCdRomParams vmCdRomParams = (VmCdRomParams) o;
    return Objects.equals(this.contentLibraryImageId, vmCdRomParams.contentLibraryImageId) &&
        Objects.equals(this.elfImageId, vmCdRomParams.elfImageId) &&
        Objects.equals(this.index, vmCdRomParams.index) &&
        Objects.equals(this.key, vmCdRomParams.key) &&
        Objects.equals(this.boot, vmCdRomParams.boot);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contentLibraryImageId, elfImageId, index, key, boot);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VmCdRomParams {\n");
    sb.append("    contentLibraryImageId: ").append(toIndentedString(contentLibraryImageId)).append("\n");
    sb.append("    elfImageId: ").append(toIndentedString(elfImageId)).append("\n");
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    boot: ").append(toIndentedString(boot)).append("\n");
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

