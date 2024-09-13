package com.arcfra.aoc.model;

import java.util.Objects;
import java.util.Arrays;
import com.arcfra.aoc.model.VmNicQosTraffic;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * VmNicQosOption
 */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class VmNicQosOption {
  public static final String SERIALIZED_NAME_EGRESS = "egress";
  @SerializedName(SERIALIZED_NAME_EGRESS)
  private VmNicQosTraffic egress;

  public static final String SERIALIZED_NAME_INGRESS = "ingress";
  @SerializedName(SERIALIZED_NAME_INGRESS)
  private VmNicQosTraffic ingress;

  public VmNicQosOption() { 
  }

  public VmNicQosOption egress(VmNicQosTraffic egress) {
    
    this.egress = egress;
    return this;
  }

   /**
   * Get egress
   * @return egress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VmNicQosTraffic getEgress() {
    return egress;
  }


  public void setEgress(VmNicQosTraffic egress) {
    this.egress = egress;
  }


  public VmNicQosOption ingress(VmNicQosTraffic ingress) {
    
    this.ingress = ingress;
    return this;
  }

   /**
   * Get ingress
   * @return ingress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VmNicQosTraffic getIngress() {
    return ingress;
  }


  public void setIngress(VmNicQosTraffic ingress) {
    this.ingress = ingress;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VmNicQosOption vmNicQosOption = (VmNicQosOption) o;
    return Objects.equals(this.egress, vmNicQosOption.egress) &&
        Objects.equals(this.ingress, vmNicQosOption.ingress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(egress, ingress);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VmNicQosOption {\n");
    sb.append("    egress: ").append(toIndentedString(egress)).append("\n");
    sb.append("    ingress: ").append(toIndentedString(ingress)).append("\n");
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

