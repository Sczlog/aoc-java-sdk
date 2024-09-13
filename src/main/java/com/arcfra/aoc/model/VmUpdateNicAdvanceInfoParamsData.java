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
 * VmUpdateNicAdvanceInfoParamsData
 */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class VmUpdateNicAdvanceInfoParamsData {
  public static final String SERIALIZED_NAME_MIRROR = "mirror";
  @SerializedName(SERIALIZED_NAME_MIRROR)
  private Boolean mirror;

  public static final String SERIALIZED_NAME_ENABLED = "enabled";
  @SerializedName(SERIALIZED_NAME_ENABLED)
  private Boolean enabled;

  public static final String SERIALIZED_NAME_MAC_ADDRESS = "mac_address";
  @SerializedName(SERIALIZED_NAME_MAC_ADDRESS)
  private String macAddress;

  public static final String SERIALIZED_NAME_NIC_ID = "nic_id";
  @SerializedName(SERIALIZED_NAME_NIC_ID)
  private String nicId;

  public static final String SERIALIZED_NAME_CONNECT_VLAN_ID = "connect_vlan_id";
  @SerializedName(SERIALIZED_NAME_CONNECT_VLAN_ID)
  private String connectVlanId;

  public VmUpdateNicAdvanceInfoParamsData() { 
  }

  public VmUpdateNicAdvanceInfoParamsData mirror(Boolean mirror) {
    
    this.mirror = mirror;
    return this;
  }

   /**
   * Get mirror
   * @return mirror
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getMirror() {
    return mirror;
  }


  public void setMirror(Boolean mirror) {
    this.mirror = mirror;
  }


  public VmUpdateNicAdvanceInfoParamsData enabled(Boolean enabled) {
    
    this.enabled = enabled;
    return this;
  }

   /**
   * Get enabled
   * @return enabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getEnabled() {
    return enabled;
  }


  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }


  public VmUpdateNicAdvanceInfoParamsData macAddress(String macAddress) {
    
    this.macAddress = macAddress;
    return this;
  }

   /**
   * Get macAddress
   * @return macAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMacAddress() {
    return macAddress;
  }


  public void setMacAddress(String macAddress) {
    this.macAddress = macAddress;
  }


  public VmUpdateNicAdvanceInfoParamsData nicId(String nicId) {
    
    this.nicId = nicId;
    return this;
  }

   /**
   * Get nicId
   * @return nicId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNicId() {
    return nicId;
  }


  public void setNicId(String nicId) {
    this.nicId = nicId;
  }


  public VmUpdateNicAdvanceInfoParamsData connectVlanId(String connectVlanId) {
    
    this.connectVlanId = connectVlanId;
    return this;
  }

   /**
   * Get connectVlanId
   * @return connectVlanId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getConnectVlanId() {
    return connectVlanId;
  }


  public void setConnectVlanId(String connectVlanId) {
    this.connectVlanId = connectVlanId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VmUpdateNicAdvanceInfoParamsData vmUpdateNicAdvanceInfoParamsData = (VmUpdateNicAdvanceInfoParamsData) o;
    return Objects.equals(this.mirror, vmUpdateNicAdvanceInfoParamsData.mirror) &&
        Objects.equals(this.enabled, vmUpdateNicAdvanceInfoParamsData.enabled) &&
        Objects.equals(this.macAddress, vmUpdateNicAdvanceInfoParamsData.macAddress) &&
        Objects.equals(this.nicId, vmUpdateNicAdvanceInfoParamsData.nicId) &&
        Objects.equals(this.connectVlanId, vmUpdateNicAdvanceInfoParamsData.connectVlanId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mirror, enabled, macAddress, nicId, connectVlanId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VmUpdateNicAdvanceInfoParamsData {\n");
    sb.append("    mirror: ").append(toIndentedString(mirror)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    macAddress: ").append(toIndentedString(macAddress)).append("\n");
    sb.append("    nicId: ").append(toIndentedString(nicId)).append("\n");
    sb.append("    connectVlanId: ").append(toIndentedString(connectVlanId)).append("\n");
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

