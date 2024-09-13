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
 * ConvertVmTemplateToVmParams
 */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class ConvertVmTemplateToVmParams {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_CONVERTED_FROM_TEMPLATE_ID = "converted_from_template_id";
  @SerializedName(SERIALIZED_NAME_CONVERTED_FROM_TEMPLATE_ID)
  private String convertedFromTemplateId;

  public ConvertVmTemplateToVmParams() { 
  }

  public ConvertVmTemplateToVmParams name(String name) {
    
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


  public ConvertVmTemplateToVmParams convertedFromTemplateId(String convertedFromTemplateId) {
    
    this.convertedFromTemplateId = convertedFromTemplateId;
    return this;
  }

   /**
   * Get convertedFromTemplateId
   * @return convertedFromTemplateId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getConvertedFromTemplateId() {
    return convertedFromTemplateId;
  }


  public void setConvertedFromTemplateId(String convertedFromTemplateId) {
    this.convertedFromTemplateId = convertedFromTemplateId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConvertVmTemplateToVmParams convertVmTemplateToVmParams = (ConvertVmTemplateToVmParams) o;
    return Objects.equals(this.name, convertVmTemplateToVmParams.name) &&
        Objects.equals(this.convertedFromTemplateId, convertVmTemplateToVmParams.convertedFromTemplateId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, convertedFromTemplateId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConvertVmTemplateToVmParams {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    convertedFromTemplateId: ").append(toIndentedString(convertedFromTemplateId)).append("\n");
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

