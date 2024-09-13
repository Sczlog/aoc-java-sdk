package com.arcfra.aoc.model;

import java.util.Objects;
import java.util.Arrays;
import com.arcfra.aoc.model.VmNicModel;
import com.arcfra.aoc.model.VmNicQosOption;
import com.arcfra.aoc.model.VmNicType;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * VmNicParams
 */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class VmNicParams {
  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private VmNicType type;

  public static final String SERIALIZED_NAME_QOS = "qos";
  @SerializedName(SERIALIZED_NAME_QOS)
  private VmNicQosOption qos;

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

  public VmNicParams() { 
  }

  public VmNicParams type(VmNicType type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VmNicType getType() {
    return type;
  }


  public void setType(VmNicType type) {
    this.type = type;
  }


  public VmNicParams qos(VmNicQosOption qos) {
    
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


  public VmNicParams subnetMask(String subnetMask) {
    
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


  public VmNicParams gateway(String gateway) {
    
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


  public VmNicParams ipAddress(String ipAddress) {
    
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


  public VmNicParams nicId(String nicId) {
    
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


  public VmNicParams connectVlanId(String connectVlanId) {
    
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


  public VmNicParams mirror(Boolean mirror) {
    
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


  public VmNicParams model(VmNicModel model) {
    
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


  public VmNicParams enabled(Boolean enabled) {
    
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


  public VmNicParams macAddress(String macAddress) {
    
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


  public VmNicParams localId(String localId) {
    
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
    VmNicParams vmNicParams = (VmNicParams) o;
    return Objects.equals(this.type, vmNicParams.type) &&
        Objects.equals(this.qos, vmNicParams.qos) &&
        Objects.equals(this.subnetMask, vmNicParams.subnetMask) &&
        Objects.equals(this.gateway, vmNicParams.gateway) &&
        Objects.equals(this.ipAddress, vmNicParams.ipAddress) &&
        Objects.equals(this.nicId, vmNicParams.nicId) &&
        Objects.equals(this.connectVlanId, vmNicParams.connectVlanId) &&
        Objects.equals(this.mirror, vmNicParams.mirror) &&
        Objects.equals(this.model, vmNicParams.model) &&
        Objects.equals(this.enabled, vmNicParams.enabled) &&
        Objects.equals(this.macAddress, vmNicParams.macAddress) &&
        Objects.equals(this.localId, vmNicParams.localId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, qos, subnetMask, gateway, ipAddress, nicId, connectVlanId, mirror, model, enabled, macAddress, localId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VmNicParams {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    qos: ").append(toIndentedString(qos)).append("\n");
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

