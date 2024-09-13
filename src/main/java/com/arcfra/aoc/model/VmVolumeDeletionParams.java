package com.arcfra.aoc.model;

import java.util.Objects;
import java.util.Arrays;
import com.arcfra.aoc.model.VmVolumeDeletionParamsEffect;
import com.arcfra.aoc.model.VmVolumeWhereInput;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * VmVolumeDeletionParams
 */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class VmVolumeDeletionParams {
  public static final String SERIALIZED_NAME_EFFECT = "effect";
  @SerializedName(SERIALIZED_NAME_EFFECT)
  private VmVolumeDeletionParamsEffect effect;

  public static final String SERIALIZED_NAME_WHERE = "where";
  @SerializedName(SERIALIZED_NAME_WHERE)
  private VmVolumeWhereInput where;

  public VmVolumeDeletionParams() { 
  }

  public VmVolumeDeletionParams effect(VmVolumeDeletionParamsEffect effect) {
    
    this.effect = effect;
    return this;
  }

   /**
   * Get effect
   * @return effect
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VmVolumeDeletionParamsEffect getEffect() {
    return effect;
  }


  public void setEffect(VmVolumeDeletionParamsEffect effect) {
    this.effect = effect;
  }


  public VmVolumeDeletionParams where(VmVolumeWhereInput where) {
    
    this.where = where;
    return this;
  }

   /**
   * Get where
   * @return where
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public VmVolumeWhereInput getWhere() {
    return where;
  }


  public void setWhere(VmVolumeWhereInput where) {
    this.where = where;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VmVolumeDeletionParams vmVolumeDeletionParams = (VmVolumeDeletionParams) o;
    return Objects.equals(this.effect, vmVolumeDeletionParams.effect) &&
        Objects.equals(this.where, vmVolumeDeletionParams.where);
  }

  @Override
  public int hashCode() {
    return Objects.hash(effect, where);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VmVolumeDeletionParams {\n");
    sb.append("    effect: ").append(toIndentedString(effect)).append("\n");
    sb.append("    where: ").append(toIndentedString(where)).append("\n");
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

