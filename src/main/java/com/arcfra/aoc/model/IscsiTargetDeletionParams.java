package com.arcfra.aoc.model;

import java.util.Objects;
import java.util.Arrays;
import com.arcfra.aoc.model.IscsiTargetWhereInput;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * IscsiTargetDeletionParams
 */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class IscsiTargetDeletionParams {
  public static final String SERIALIZED_NAME_WHERE = "where";
  @SerializedName(SERIALIZED_NAME_WHERE)
  private IscsiTargetWhereInput where;

  public IscsiTargetDeletionParams() { 
  }

  public IscsiTargetDeletionParams where(IscsiTargetWhereInput where) {
    
    this.where = where;
    return this;
  }

   /**
   * Get where
   * @return where
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public IscsiTargetWhereInput getWhere() {
    return where;
  }


  public void setWhere(IscsiTargetWhereInput where) {
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
    IscsiTargetDeletionParams iscsiTargetDeletionParams = (IscsiTargetDeletionParams) o;
    return Objects.equals(this.where, iscsiTargetDeletionParams.where);
  }

  @Override
  public int hashCode() {
    return Objects.hash(where);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IscsiTargetDeletionParams {\n");
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

