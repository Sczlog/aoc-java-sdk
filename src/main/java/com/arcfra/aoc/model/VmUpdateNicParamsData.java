package com.arcfra.aoc.model;

import java.util.Objects;
import java.util.Arrays;
import com.arcfra.aoc.model.VmNicModel;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * VmUpdateNicParamsData
 */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class VmUpdateNicParamsData {
  public static final String SERIALIZED_NAME_SUBNET_MASK = "subnet_mask";
  @SerializedName(SERIALIZED_NAME_SUBNET_MASK)
  private String subnetMask;

  public static final String SERIALIZED_NAME_GATEWAY = "gateway";
  @SerializedName(SERIALIZED_NAME_GATEWAY)
  private String gateway;

  public static final String SERIALIZED_NAME_IP_ADDRESS = "ip_address";
  @SerializedName(SERIALIZED_NAME_IP_ADDRESS)
  private String ipAddress;

  public static final String SERIALIZED_NAME_NIC_ID = "nic_id";
  @SerializedName(SERIALIZED_NAME_NIC_ID)
  private String nicId;

  public static final String SERIALIZED_NAME_CONNECT_VLAN_ID = "connect_vlan_id";
  @SerializedName(SERIALIZED_NAME_CONNECT_VLAN_ID)
  private String connectVlanId;

  public static final String SERIALIZED_NAME_MIRROR = "mirror";
  @SerializedName(SERIALIZED_NAME_MIRROR)
  private Boolean mirror;

  public static final String SERIALIZED_NAME_MODEL = "model";
  @SerializedName(SERIALIZED_NAME_MODEL)
  private VmNicModel model;

  public static final String SERIALIZED_NAME_ENABLED = "enabled";
  @SerializedName(SERIALIZED_NAME_ENABLED)
  private Boolean enabled;

  public static final String SERIALIZED_NAME_MAC_ADDRESS = "mac_address";
  @SerializedName(SERIALIZED_NAME_MAC_ADDRESS)
  private String macAddress;

  public static final String SERIALIZED_NAME_NIC_INDEX = "nic_index";
  @SerializedName(SERIALIZED_NAME_NIC_INDEX)
  private Integer nicIndex;

  public VmUpdateNicParamsData() { 
  }

  public VmUpdateNicParamsData subnetMask(String subnetMask) {
    
    this.subnetMask = subnetMask;
    return this;
  }

   /**
   * Get subnetMask
   * @return subnetMask
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSubnetMask() {
    return subnetMask;
  }


  public void setSubnetMask(String subnetMask) {
    this.subnetMask = subnetMask;
  }


  public VmUpdateNicParamsData gateway(String gateway) {
    
    this.gateway = gateway;
    return this;
  }

   /**
   * Get gateway
   * @return gateway
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getGateway() {
    return gateway;
  }


  public void setGateway(String gateway) {
    this.gateway = gateway;
  }


  public VmUpdateNicParamsData ipAddress(String ipAddress) {
    
    this.ipAddress = ipAddress;
    return this;
  }

   /**
   * Get ipAddress
   * @return ipAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIpAddress() {
    return ipAddress;
  }


  public void setIpAddress(String ipAddress) {
    this.ipAddress = ipAddress;
  }


  public VmUpdateNicParamsData nicId(String nicId) {
    
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


  public VmUpdateNicParamsData connectVlanId(String connectVlanId) {
    
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


  public VmUpdateNicParamsData mirror(Boolean mirror) {
    
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


  public VmUpdateNicParamsData model(VmNicModel model) {
    
    this.model = model;
    return this;
  }

   /**
   * Get model
   * @return model
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VmNicModel getModel() {
    return model;
  }


  public void setModel(VmNicModel model) {
    this.model = model;
  }


  public VmUpdateNicParamsData enabled(Boolean enabled) {
    
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


  public VmUpdateNicParamsData macAddress(String macAddress) {
    
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


  public VmUpdateNicParamsData nicIndex(Integer nicIndex) {
    
    this.nicIndex = nicIndex;
    return this;
  }

   /**
   * Get nicIndex
   * @return nicIndex
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getNicIndex() {
    return nicIndex;
  }


  public void setNicIndex(Integer nicIndex) {
    this.nicIndex = nicIndex;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VmUpdateNicParamsData vmUpdateNicParamsData = (VmUpdateNicParamsData) o;
    return Objects.equals(this.subnetMask, vmUpdateNicParamsData.subnetMask) &&
        Objects.equals(this.gateway, vmUpdateNicParamsData.gateway) &&
        Objects.equals(this.ipAddress, vmUpdateNicParamsData.ipAddress) &&
        Objects.equals(this.nicId, vmUpdateNicParamsData.nicId) &&
        Objects.equals(this.connectVlanId, vmUpdateNicParamsData.connectVlanId) &&
        Objects.equals(this.mirror, vmUpdateNicParamsData.mirror) &&
        Objects.equals(this.model, vmUpdateNicParamsData.model) &&
        Objects.equals(this.enabled, vmUpdateNicParamsData.enabled) &&
        Objects.equals(this.macAddress, vmUpdateNicParamsData.macAddress) &&
        Objects.equals(this.nicIndex, vmUpdateNicParamsData.nicIndex);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subnetMask, gateway, ipAddress, nicId, connectVlanId, mirror, model, enabled, macAddress, nicIndex);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VmUpdateNicParamsData {\n");
    sb.append("    subnetMask: ").append(toIndentedString(subnetMask)).append("\n");
    sb.append("    gateway: ").append(toIndentedString(gateway)).append("\n");
    sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
    sb.append("    nicId: ").append(toIndentedString(nicId)).append("\n");
    sb.append("    connectVlanId: ").append(toIndentedString(connectVlanId)).append("\n");
    sb.append("    mirror: ").append(toIndentedString(mirror)).append("\n");
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    macAddress: ").append(toIndentedString(macAddress)).append("\n");
    sb.append("    nicIndex: ").append(toIndentedString(nicIndex)).append("\n");
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

