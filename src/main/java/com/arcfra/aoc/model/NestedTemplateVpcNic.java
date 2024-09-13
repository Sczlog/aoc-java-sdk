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
 * NestedTemplateVpcNic
 */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class NestedTemplateVpcNic {
  public static final String SERIALIZED_NAME_VPC_LOCAL_ID = "vpc_local_id";
  @SerializedName(SERIALIZED_NAME_VPC_LOCAL_ID)
  private String vpcLocalId;

  public static final String SERIALIZED_NAME_VPC_SUBNET_LOCAL_ID = "vpc_subnet_local_id";
  @SerializedName(SERIALIZED_NAME_VPC_SUBNET_LOCAL_ID)
  private String vpcSubnetLocalId;

  public NestedTemplateVpcNic() { 
  }

  public NestedTemplateVpcNic vpcLocalId(String vpcLocalId) {
    
    this.vpcLocalId = vpcLocalId;
    return this;
  }

   /**
   * Get vpcLocalId
   * @return vpcLocalId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getVpcLocalId() {
    return vpcLocalId;
  }


  public void setVpcLocalId(String vpcLocalId) {
    this.vpcLocalId = vpcLocalId;
  }


  public NestedTemplateVpcNic vpcSubnetLocalId(String vpcSubnetLocalId) {
    
    this.vpcSubnetLocalId = vpcSubnetLocalId;
    return this;
  }

   /**
   * Get vpcSubnetLocalId
   * @return vpcSubnetLocalId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getVpcSubnetLocalId() {
    return vpcSubnetLocalId;
  }


  public void setVpcSubnetLocalId(String vpcSubnetLocalId) {
    this.vpcSubnetLocalId = vpcSubnetLocalId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NestedTemplateVpcNic nestedTemplateVpcNic = (NestedTemplateVpcNic) o;
    return Objects.equals(this.vpcLocalId, nestedTemplateVpcNic.vpcLocalId) &&
        Objects.equals(this.vpcSubnetLocalId, nestedTemplateVpcNic.vpcSubnetLocalId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vpcLocalId, vpcSubnetLocalId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NestedTemplateVpcNic {\n");
    sb.append("    vpcLocalId: ").append(toIndentedString(vpcLocalId)).append("\n");
    sb.append("    vpcSubnetLocalId: ").append(toIndentedString(vpcSubnetLocalId)).append("\n");
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

