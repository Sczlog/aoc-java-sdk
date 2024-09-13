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
 * CommonHeader
 */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class CommonHeader {
  public static final String SERIALIZED_NAME_X_AOC_REQUEST_ID = "x-aoc-request-id";
  @SerializedName(SERIALIZED_NAME_X_AOC_REQUEST_ID)
  private String xAocRequestId;

  public CommonHeader() { 
  }

  public CommonHeader xAocRequestId(String xAocRequestId) {
    
    this.xAocRequestId = xAocRequestId;
    return this;
  }

   /**
   * Get xAocRequestId
   * @return xAocRequestId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getxAocRequestId() {
    return xAocRequestId;
  }


  public void setxAocRequestId(String xAocRequestId) {
    this.xAocRequestId = xAocRequestId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommonHeader commonHeader = (CommonHeader) o;
    return Objects.equals(this.xAocRequestId, commonHeader.xAocRequestId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(xAocRequestId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommonHeader {\n");
    sb.append("    xAocRequestId: ").append(toIndentedString(xAocRequestId)).append("\n");
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

