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
 * VlanMapping
 */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class VlanMapping {
  public static final String SERIALIZED_NAME_SRC_VLAN_LOCAL_ID = "src_vlan_local_id";
  @SerializedName(SERIALIZED_NAME_SRC_VLAN_LOCAL_ID)
  private String srcVlanLocalId;

  public static final String SERIALIZED_NAME_DEST_VLAN_LOCAL_ID = "dest_vlan_local_id";
  @SerializedName(SERIALIZED_NAME_DEST_VLAN_LOCAL_ID)
  private String destVlanLocalId;

  public VlanMapping() { 
  }

  public VlanMapping srcVlanLocalId(String srcVlanLocalId) {
    
    this.srcVlanLocalId = srcVlanLocalId;
    return this;
  }

   /**
   * Get srcVlanLocalId
   * @return srcVlanLocalId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getSrcVlanLocalId() {
    return srcVlanLocalId;
  }


  public void setSrcVlanLocalId(String srcVlanLocalId) {
    this.srcVlanLocalId = srcVlanLocalId;
  }


  public VlanMapping destVlanLocalId(String destVlanLocalId) {
    
    this.destVlanLocalId = destVlanLocalId;
    return this;
  }

   /**
   * Get destVlanLocalId
   * @return destVlanLocalId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getDestVlanLocalId() {
    return destVlanLocalId;
  }


  public void setDestVlanLocalId(String destVlanLocalId) {
    this.destVlanLocalId = destVlanLocalId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VlanMapping vlanMapping = (VlanMapping) o;
    return Objects.equals(this.srcVlanLocalId, vlanMapping.srcVlanLocalId) &&
        Objects.equals(this.destVlanLocalId, vlanMapping.destVlanLocalId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(srcVlanLocalId, destVlanLocalId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VlanMapping {\n");
    sb.append("    srcVlanLocalId: ").append(toIndentedString(srcVlanLocalId)).append("\n");
    sb.append("    destVlanLocalId: ").append(toIndentedString(destVlanLocalId)).append("\n");
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

