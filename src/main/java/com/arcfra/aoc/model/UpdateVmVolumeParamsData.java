package com.arcfra.aoc.model;

import java.util.Objects;
import java.util.Arrays;
import com.arcfra.aoc.model.ByteUnit;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * UpdateVmVolumeParamsData
 */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class UpdateVmVolumeParamsData {
  public static final String SERIALIZED_NAME_SIZE_UNIT = "size_unit";
  @SerializedName(SERIALIZED_NAME_SIZE_UNIT)
  private ByteUnit sizeUnit;

  public static final String SERIALIZED_NAME_SIZE = "size";
  @SerializedName(SERIALIZED_NAME_SIZE)
  private Long size;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public UpdateVmVolumeParamsData() { 
  }

  public UpdateVmVolumeParamsData sizeUnit(ByteUnit sizeUnit) {
    
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


  public UpdateVmVolumeParamsData size(Long size) {
    
    this.size = size;
    return this;
  }

   /**
   * Get size
   * @return size
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getSize() {
    return size;
  }


  public void setSize(Long size) {
    this.size = size;
  }


  public UpdateVmVolumeParamsData description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public UpdateVmVolumeParamsData name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

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
    UpdateVmVolumeParamsData updateVmVolumeParamsData = (UpdateVmVolumeParamsData) o;
    return Objects.equals(this.sizeUnit, updateVmVolumeParamsData.sizeUnit) &&
        Objects.equals(this.size, updateVmVolumeParamsData.size) &&
        Objects.equals(this.description, updateVmVolumeParamsData.description) &&
        Objects.equals(this.name, updateVmVolumeParamsData.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sizeUnit, size, description, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateVmVolumeParamsData {\n");
    sb.append("    sizeUnit: ").append(toIndentedString(sizeUnit)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

