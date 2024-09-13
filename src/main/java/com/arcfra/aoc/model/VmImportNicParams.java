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
 * VmImportNicParams
 */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class VmImportNicParams {
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

  public static final String SERIALIZED_NAME_LOCAL_ID = "local_id";
  @SerializedName(SERIALIZED_NAME_LOCAL_ID)
  private String localId;

  public VmImportNicParams() { 
  }

  public VmImportNicParams subnetMask(String subnetMask) {
    
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


  public VmImportNicParams gateway(String gateway) {
    
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


  public VmImportNicParams ipAddress(String ipAddress) {
    
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


  public VmImportNicParams nicId(String nicId) {
    
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


  public VmImportNicParams connectVlanId(String connectVlanId) {
    
    this.connectVlanId = connectVlanId;
    return this;
  }

   /**
   * Get connectVlanId
   * @return connectVlanId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getConnectVlanId() {
    return connectVlanId;
  }


  public void setConnectVlanId(String connectVlanId) {
    this.connectVlanId = connectVlanId;
  }


  public VmImportNicParams mirror(Boolean mirror) {
    
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


  public VmImportNicParams model(VmNicModel model) {
    
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


  public VmImportNicParams enabled(Boolean enabled) {
    
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


  public VmImportNicParams macAddress(String macAddress) {
    
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


  public VmImportNicParams localId(String localId) {
    
    this.localId = localId;
    return this;
  }

   /**
   * Get localId
   * @return localId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLocalId() {
    return localId;
  }


  public void setLocalId(String localId) {
    this.localId = localId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VmImportNicParams vmImportNicParams = (VmImportNicParams) o;
    return Objects.equals(this.subnetMask, vmImportNicParams.subnetMask) &&
        Objects.equals(this.gateway, vmImportNicParams.gateway) &&
        Objects.equals(this.ipAddress, vmImportNicParams.ipAddress) &&
        Objects.equals(this.nicId, vmImportNicParams.nicId) &&
        Objects.equals(this.connectVlanId, vmImportNicParams.connectVlanId) &&
        Objects.equals(this.mirror, vmImportNicParams.mirror) &&
        Objects.equals(this.model, vmImportNicParams.model) &&
        Objects.equals(this.enabled, vmImportNicParams.enabled) &&
        Objects.equals(this.macAddress, vmImportNicParams.macAddress) &&
        Objects.equals(this.localId, vmImportNicParams.localId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subnetMask, gateway, ipAddress, nicId, connectVlanId, mirror, model, enabled, macAddress, localId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VmImportNicParams {\n");
    sb.append("    subnetMask: ").append(toIndentedString(subnetMask)).append("\n");
    sb.append("    gateway: ").append(toIndentedString(gateway)).append("\n");
    sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
    sb.append("    nicId: ").append(toIndentedString(nicId)).append("\n");
    sb.append("    connectVlanId: ").append(toIndentedString(connectVlanId)).append("\n");
    sb.append("    mirror: ").append(toIndentedString(mirror)).append("\n");
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    macAddress: ").append(toIndentedString(macAddress)).append("\n");
    sb.append("    localId: ").append(toIndentedString(localId)).append("\n");
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

