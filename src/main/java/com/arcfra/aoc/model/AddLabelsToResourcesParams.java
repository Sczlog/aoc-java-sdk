package com.arcfra.aoc.model;

import java.util.Objects;
import java.util.Arrays;
import com.arcfra.aoc.model.AddLabelsToResourcesParamsData;
import com.arcfra.aoc.model.LabelWhereInput;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * AddLabelsToResourcesParams
 */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class AddLabelsToResourcesParams {
  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private AddLabelsToResourcesParamsData data;

  public static final String SERIALIZED_NAME_WHERE = "where";
  @SerializedName(SERIALIZED_NAME_WHERE)
  private LabelWhereInput where;

  public AddLabelsToResourcesParams() { 
  }

  public AddLabelsToResourcesParams data(AddLabelsToResourcesParamsData data) {
    
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public AddLabelsToResourcesParamsData getData() {
    return data;
  }


  public void setData(AddLabelsToResourcesParamsData data) {
    this.data = data;
  }


  public AddLabelsToResourcesParams where(LabelWhereInput where) {
    
    this.where = where;
    return this;
  }

   /**
   * Get where
   * @return where
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public LabelWhereInput getWhere() {
    return where;
  }


  public void setWhere(LabelWhereInput where) {
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
    AddLabelsToResourcesParams addLabelsToResourcesParams = (AddLabelsToResourcesParams) o;
    return Objects.equals(this.data, addLabelsToResourcesParams.data) &&
        Objects.equals(this.where, addLabelsToResourcesParams.where);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, where);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddLabelsToResourcesParams {\n");
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

