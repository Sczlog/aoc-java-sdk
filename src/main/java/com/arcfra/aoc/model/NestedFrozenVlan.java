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
 * NestedFrozenVlan
 */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class NestedFrozenVlan {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_VDS_OVS = "vds_ovs";
  @SerializedName(SERIALIZED_NAME_VDS_OVS)
  private String vdsOvs;

  public static final String SERIALIZED_NAME_VLAN_ID = "vlan_id";
  @SerializedName(SERIALIZED_NAME_VLAN_ID)
  private Integer vlanId;

  public static final String SERIALIZED_NAME_VLAN_LOCAL_ID = "vlan_local_id";
  @SerializedName(SERIALIZED_NAME_VLAN_LOCAL_ID)
  private String vlanLocalId;

  public NestedFrozenVlan() { 
  }

  public NestedFrozenVlan name(String name) {
    
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


  public NestedFrozenVlan vdsOvs(String vdsOvs) {
    
    this.vdsOvs = vdsOvs;
    return this;
  }

   /**
   * Get vdsOvs
   * @return vdsOvs
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getVdsOvs() {
    return vdsOvs;
  }


  public void setVdsOvs(String vdsOvs) {
    this.vdsOvs = vdsOvs;
  }


  public NestedFrozenVlan vlanId(Integer vlanId) {
    
    this.vlanId = vlanId;
    return this;
  }

   /**
   * Get vlanId
   * @return vlanId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getVlanId() {
    return vlanId;
  }


  public void setVlanId(Integer vlanId) {
    this.vlanId = vlanId;
  }


  public NestedFrozenVlan vlanLocalId(String vlanLocalId) {
    
    this.vlanLocalId = vlanLocalId;
    return this;
  }

   /**
   * Get vlanLocalId
   * @return vlanLocalId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getVlanLocalId() {
    return vlanLocalId;
  }


  public void setVlanLocalId(String vlanLocalId) {
    this.vlanLocalId = vlanLocalId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NestedFrozenVlan nestedFrozenVlan = (NestedFrozenVlan) o;
    return Objects.equals(this.name, nestedFrozenVlan.name) &&
        Objects.equals(this.vdsOvs, nestedFrozenVlan.vdsOvs) &&
        Objects.equals(this.vlanId, nestedFrozenVlan.vlanId) &&
        Objects.equals(this.vlanLocalId, nestedFrozenVlan.vlanLocalId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, vdsOvs, vlanId, vlanLocalId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NestedFrozenVlan {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    vdsOvs: ").append(toIndentedString(vdsOvs)).append("\n");
    sb.append("    vlanId: ").append(toIndentedString(vlanId)).append("\n");
    sb.append("    vlanLocalId: ").append(toIndentedString(vlanLocalId)).append("\n");
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

