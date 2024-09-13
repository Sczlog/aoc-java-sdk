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
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * NestedVgpuType
 */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class NestedVgpuType {
  public static final String SERIALIZED_NAME_FRAMEBUFFER = "framebuffer";
  @SerializedName(SERIALIZED_NAME_FRAMEBUFFER)
  private Double framebuffer;

  public static final String SERIALIZED_NAME_MAX_INSTANCE = "max_instance";
  @SerializedName(SERIALIZED_NAME_MAX_INSTANCE)
  private Integer maxInstance;

  public static final String SERIALIZED_NAME_MAX_RESOLUTION = "max_resolution";
  @SerializedName(SERIALIZED_NAME_MAX_RESOLUTION)
  private String maxResolution;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_VGPU_TYPE_ID = "vgpu_type_id";
  @SerializedName(SERIALIZED_NAME_VGPU_TYPE_ID)
  private String vgpuTypeId;

  public NestedVgpuType() { 
  }

  public NestedVgpuType framebuffer(Double framebuffer) {
    
    this.framebuffer = framebuffer;
    return this;
  }

   /**
   * Get framebuffer
   * @return framebuffer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getFramebuffer() {
    return framebuffer;
  }


  public void setFramebuffer(Double framebuffer) {
    this.framebuffer = framebuffer;
  }


  public NestedVgpuType maxInstance(Integer maxInstance) {
    
    this.maxInstance = maxInstance;
    return this;
  }

   /**
   * Get maxInstance
   * @return maxInstance
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getMaxInstance() {
    return maxInstance;
  }


  public void setMaxInstance(Integer maxInstance) {
    this.maxInstance = maxInstance;
  }


  public NestedVgpuType maxResolution(String maxResolution) {
    
    this.maxResolution = maxResolution;
    return this;
  }

   /**
   * Get maxResolution
   * @return maxResolution
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMaxResolution() {
    return maxResolution;
  }


  public void setMaxResolution(String maxResolution) {
    this.maxResolution = maxResolution;
  }


  public NestedVgpuType name(String name) {
    
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


  public NestedVgpuType vgpuTypeId(String vgpuTypeId) {
    
    this.vgpuTypeId = vgpuTypeId;
    return this;
  }

   /**
   * Get vgpuTypeId
   * @return vgpuTypeId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getVgpuTypeId() {
    return vgpuTypeId;
  }


  public void setVgpuTypeId(String vgpuTypeId) {
    this.vgpuTypeId = vgpuTypeId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NestedVgpuType nestedVgpuType = (NestedVgpuType) o;
    return Objects.equals(this.framebuffer, nestedVgpuType.framebuffer) &&
        Objects.equals(this.maxInstance, nestedVgpuType.maxInstance) &&
        Objects.equals(this.maxResolution, nestedVgpuType.maxResolution) &&
        Objects.equals(this.name, nestedVgpuType.name) &&
        Objects.equals(this.vgpuTypeId, nestedVgpuType.vgpuTypeId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(framebuffer, maxInstance, maxResolution, name, vgpuTypeId);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NestedVgpuType {\n");
    sb.append("    framebuffer: ").append(toIndentedString(framebuffer)).append("\n");
    sb.append("    maxInstance: ").append(toIndentedString(maxInstance)).append("\n");
    sb.append("    maxResolution: ").append(toIndentedString(maxResolution)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    vgpuTypeId: ").append(toIndentedString(vgpuTypeId)).append("\n");
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

