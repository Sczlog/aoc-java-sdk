package com.arcfra.aoc.model;

import java.util.Objects;
import java.util.Arrays;
import com.arcfra.aoc.model.ContentLibraryImageUpdationClusterParamsData;
import com.arcfra.aoc.model.ContentLibraryImageWhereInput;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ContentLibraryImageUpdationClusterParams
 */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class ContentLibraryImageUpdationClusterParams {
  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private ContentLibraryImageUpdationClusterParamsData data;

  public static final String SERIALIZED_NAME_WHERE = "where";
  @SerializedName(SERIALIZED_NAME_WHERE)
  private ContentLibraryImageWhereInput where;

  public ContentLibraryImageUpdationClusterParams() { 
  }

  public ContentLibraryImageUpdationClusterParams data(ContentLibraryImageUpdationClusterParamsData data) {
    
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public ContentLibraryImageUpdationClusterParamsData getData() {
    return data;
  }


  public void setData(ContentLibraryImageUpdationClusterParamsData data) {
    this.data = data;
  }


  public ContentLibraryImageUpdationClusterParams where(ContentLibraryImageWhereInput where) {
    
    this.where = where;
    return this;
  }

   /**
   * Get where
   * @return where
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public ContentLibraryImageWhereInput getWhere() {
    return where;
  }


  public void setWhere(ContentLibraryImageWhereInput where) {
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
    ContentLibraryImageUpdationClusterParams contentLibraryImageUpdationClusterParams = (ContentLibraryImageUpdationClusterParams) o;
    return Objects.equals(this.data, contentLibraryImageUpdationClusterParams.data) &&
        Objects.equals(this.where, contentLibraryImageUpdationClusterParams.where);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, where);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContentLibraryImageUpdationClusterParams {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

