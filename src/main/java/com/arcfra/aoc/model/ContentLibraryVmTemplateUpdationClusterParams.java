package com.arcfra.aoc.model;

import java.util.Objects;
import java.util.Arrays;
import com.arcfra.aoc.model.ContentLibraryVmTemplateUpdationClusterParamsData;
import com.arcfra.aoc.model.ContentLibraryVmTemplateWhereInput;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ContentLibraryVmTemplateUpdationClusterParams
 */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class ContentLibraryVmTemplateUpdationClusterParams {
  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private ContentLibraryVmTemplateUpdationClusterParamsData data;

  public static final String SERIALIZED_NAME_WHERE = "where";
  @SerializedName(SERIALIZED_NAME_WHERE)
  private ContentLibraryVmTemplateWhereInput where;

  public ContentLibraryVmTemplateUpdationClusterParams() { 
  }

  public ContentLibraryVmTemplateUpdationClusterParams data(ContentLibraryVmTemplateUpdationClusterParamsData data) {
    
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public ContentLibraryVmTemplateUpdationClusterParamsData getData() {
    return data;
  }


  public void setData(ContentLibraryVmTemplateUpdationClusterParamsData data) {
    this.data = data;
  }


  public ContentLibraryVmTemplateUpdationClusterParams where(ContentLibraryVmTemplateWhereInput where) {
    
    this.where = where;
    return this;
  }

   /**
   * Get where
   * @return where
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public ContentLibraryVmTemplateWhereInput getWhere() {
    return where;
  }


  public void setWhere(ContentLibraryVmTemplateWhereInput where) {
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
    ContentLibraryVmTemplateUpdationClusterParams contentLibraryVmTemplateUpdationClusterParams = (ContentLibraryVmTemplateUpdationClusterParams) o;
    return Objects.equals(this.data, contentLibraryVmTemplateUpdationClusterParams.data) &&
        Objects.equals(this.where, contentLibraryVmTemplateUpdationClusterParams.where);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, where);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContentLibraryVmTemplateUpdationClusterParams {\n");
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

