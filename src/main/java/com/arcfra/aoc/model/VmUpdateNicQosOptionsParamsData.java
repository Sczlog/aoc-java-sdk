package com.arcfra.aoc.model;

import java.util.Objects;
import java.util.Arrays;
import com.arcfra.aoc.model.VmNicQosOption;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * VmUpdateNicQosOptionsParamsData
 */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class VmUpdateNicQosOptionsParamsData {
  public static final String SERIALIZED_NAME_QOS = "qos";
  @SerializedName(SERIALIZED_NAME_QOS)
  private VmNicQosOption qos;

  public VmUpdateNicQosOptionsParamsData() { 
  }

  public VmUpdateNicQosOptionsParamsData qos(VmNicQosOption qos) {
    
    this.qos = qos;
    return this;
  }

   /**
   * Get qos
   * @return qos
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VmNicQosOption getQos() {
    return qos;
  }


  public void setQos(VmNicQosOption qos) {
    this.qos = qos;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VmUpdateNicQosOptionsParamsData vmUpdateNicQosOptionsParamsData = (VmUpdateNicQosOptionsParamsData) o;
    return Objects.equals(this.qos, vmUpdateNicQosOptionsParamsData.qos);
  }

  @Override
  public int hashCode() {
    return Objects.hash(qos);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VmUpdateNicQosOptionsParamsData {\n");
    sb.append("    qos: ").append(toIndentedString(qos)).append("\n");
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

