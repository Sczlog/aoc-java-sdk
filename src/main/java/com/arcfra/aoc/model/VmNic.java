package com.arcfra.aoc.model;

import java.util.Objects;
import java.util.Arrays;
import com.arcfra.aoc.model.NestedNic;
import com.arcfra.aoc.model.NestedVlan;
import com.arcfra.aoc.model.NestedVm;
import com.arcfra.aoc.model.VmNicModel;
import com.arcfra.aoc.model.VmNicType;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * VmNic
 */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class VmNic {
  public static final String SERIALIZED_NAME_EGRESS_RATE_LIMIT_BURST_IN_BIT = "egress_rate_limit_burst_in_bit";
  @SerializedName(SERIALIZED_NAME_EGRESS_RATE_LIMIT_BURST_IN_BIT)
  private Double egressRateLimitBurstInBit;

  public static final String SERIALIZED_NAME_EGRESS_RATE_LIMIT_ENABLED = "egress_rate_limit_enabled";
  @SerializedName(SERIALIZED_NAME_EGRESS_RATE_LIMIT_ENABLED)
  private Boolean egressRateLimitEnabled;

  public static final String SERIALIZED_NAME_EGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS = "egress_rate_limit_max_rate_in_bitps";
  @SerializedName(SERIALIZED_NAME_EGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS)
  private Double egressRateLimitMaxRateInBitps;

  public static final String SERIALIZED_NAME_ENABLED = "enabled";
  @SerializedName(SERIALIZED_NAME_ENABLED)
  private Boolean enabled;

  public static final String SERIALIZED_NAME_GATEWAY = "gateway";
  @SerializedName(SERIALIZED_NAME_GATEWAY)
  private String gateway;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_INGRESS_RATE_LIMIT_BURST_IN_BIT = "ingress_rate_limit_burst_in_bit";
  @SerializedName(SERIALIZED_NAME_INGRESS_RATE_LIMIT_BURST_IN_BIT)
  private Double ingressRateLimitBurstInBit;

  public static final String SERIALIZED_NAME_INGRESS_RATE_LIMIT_ENABLED = "ingress_rate_limit_enabled";
  @SerializedName(SERIALIZED_NAME_INGRESS_RATE_LIMIT_ENABLED)
  private Boolean ingressRateLimitEnabled;

  public static final String SERIALIZED_NAME_INGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS = "ingress_rate_limit_max_rate_in_bitps";
  @SerializedName(SERIALIZED_NAME_INGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS)
  private Double ingressRateLimitMaxRateInBitps;

  public static final String SERIALIZED_NAME_INTERFACE_ID = "interface_id";
  @SerializedName(SERIALIZED_NAME_INTERFACE_ID)
  private String interfaceId;

  public static final String SERIALIZED_NAME_IP_ADDRESS = "ip_address";
  @SerializedName(SERIALIZED_NAME_IP_ADDRESS)
  private String ipAddress;

  public static final String SERIALIZED_NAME_LOCAL_ID = "local_id";
  @SerializedName(SERIALIZED_NAME_LOCAL_ID)
  private String localId;

  public static final String SERIALIZED_NAME_MAC_ADDRESS = "mac_address";
  @SerializedName(SERIALIZED_NAME_MAC_ADDRESS)
  private String macAddress;

  public static final String SERIALIZED_NAME_MIRROR = "mirror";
  @SerializedName(SERIALIZED_NAME_MIRROR)
  private Boolean mirror;

  public static final String SERIALIZED_NAME_MODEL = "model";
  @SerializedName(SERIALIZED_NAME_MODEL)
  private VmNicModel model;

  public static final String SERIALIZED_NAME_NIC = "nic";
  @SerializedName(SERIALIZED_NAME_NIC)
  private NestedNic nic;

  public static final String SERIALIZED_NAME_ORDER = "order";
  @SerializedName(SERIALIZED_NAME_ORDER)
  private Integer order;

  public static final String SERIALIZED_NAME_SUBNET_MASK = "subnet_mask";
  @SerializedName(SERIALIZED_NAME_SUBNET_MASK)
  private String subnetMask;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private VmNicType type;

  public static final String SERIALIZED_NAME_VLAN = "vlan";
  @SerializedName(SERIALIZED_NAME_VLAN)
  private NestedVlan vlan;

  public static final String SERIALIZED_NAME_VM = "vm";
  @SerializedName(SERIALIZED_NAME_VM)
  private NestedVm vm;

  public VmNic() { 
  }

  public VmNic egressRateLimitBurstInBit(Double egressRateLimitBurstInBit) {
    
    this.egressRateLimitBurstInBit = egressRateLimitBurstInBit;
    return this;
  }

   /**
   * Get egressRateLimitBurstInBit
   * @return egressRateLimitBurstInBit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getEgressRateLimitBurstInBit() {
    return egressRateLimitBurstInBit;
  }


  public void setEgressRateLimitBurstInBit(Double egressRateLimitBurstInBit) {
    this.egressRateLimitBurstInBit = egressRateLimitBurstInBit;
  }


  public VmNic egressRateLimitEnabled(Boolean egressRateLimitEnabled) {
    
    this.egressRateLimitEnabled = egressRateLimitEnabled;
    return this;
  }

   /**
   * Get egressRateLimitEnabled
   * @return egressRateLimitEnabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getEgressRateLimitEnabled() {
    return egressRateLimitEnabled;
  }


  public void setEgressRateLimitEnabled(Boolean egressRateLimitEnabled) {
    this.egressRateLimitEnabled = egressRateLimitEnabled;
  }


  public VmNic egressRateLimitMaxRateInBitps(Double egressRateLimitMaxRateInBitps) {
    
    this.egressRateLimitMaxRateInBitps = egressRateLimitMaxRateInBitps;
    return this;
  }

   /**
   * Get egressRateLimitMaxRateInBitps
   * @return egressRateLimitMaxRateInBitps
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getEgressRateLimitMaxRateInBitps() {
    return egressRateLimitMaxRateInBitps;
  }


  public void setEgressRateLimitMaxRateInBitps(Double egressRateLimitMaxRateInBitps) {
    this.egressRateLimitMaxRateInBitps = egressRateLimitMaxRateInBitps;
  }


  public VmNic enabled(Boolean enabled) {
    
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


  public VmNic gateway(String gateway) {
    
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


  public VmNic id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public VmNic ingressRateLimitBurstInBit(Double ingressRateLimitBurstInBit) {
    
    this.ingressRateLimitBurstInBit = ingressRateLimitBurstInBit;
    return this;
  }

   /**
   * Get ingressRateLimitBurstInBit
   * @return ingressRateLimitBurstInBit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getIngressRateLimitBurstInBit() {
    return ingressRateLimitBurstInBit;
  }


  public void setIngressRateLimitBurstInBit(Double ingressRateLimitBurstInBit) {
    this.ingressRateLimitBurstInBit = ingressRateLimitBurstInBit;
  }


  public VmNic ingressRateLimitEnabled(Boolean ingressRateLimitEnabled) {
    
    this.ingressRateLimitEnabled = ingressRateLimitEnabled;
    return this;
  }

   /**
   * Get ingressRateLimitEnabled
   * @return ingressRateLimitEnabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIngressRateLimitEnabled() {
    return ingressRateLimitEnabled;
  }


  public void setIngressRateLimitEnabled(Boolean ingressRateLimitEnabled) {
    this.ingressRateLimitEnabled = ingressRateLimitEnabled;
  }


  public VmNic ingressRateLimitMaxRateInBitps(Double ingressRateLimitMaxRateInBitps) {
    
    this.ingressRateLimitMaxRateInBitps = ingressRateLimitMaxRateInBitps;
    return this;
  }

   /**
   * Get ingressRateLimitMaxRateInBitps
   * @return ingressRateLimitMaxRateInBitps
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getIngressRateLimitMaxRateInBitps() {
    return ingressRateLimitMaxRateInBitps;
  }


  public void setIngressRateLimitMaxRateInBitps(Double ingressRateLimitMaxRateInBitps) {
    this.ingressRateLimitMaxRateInBitps = ingressRateLimitMaxRateInBitps;
  }


  public VmNic interfaceId(String interfaceId) {
    
    this.interfaceId = interfaceId;
    return this;
  }

   /**
   * Get interfaceId
   * @return interfaceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getInterfaceId() {
    return interfaceId;
  }


  public void setInterfaceId(String interfaceId) {
    this.interfaceId = interfaceId;
  }


  public VmNic ipAddress(String ipAddress) {
    
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


  public VmNic localId(String localId) {
    
    this.localId = localId;
    return this;
  }

   /**
   * Get localId
   * @return localId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getLocalId() {
    return localId;
  }


  public void setLocalId(String localId) {
    this.localId = localId;
  }


  public VmNic macAddress(String macAddress) {
    
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


  public VmNic mirror(Boolean mirror) {
    
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


  public VmNic model(VmNicModel model) {
    
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


  public VmNic nic(NestedNic nic) {
    
    this.nic = nic;
    return this;
  }

   /**
   * Get nic
   * @return nic
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public NestedNic getNic() {
    return nic;
  }


  public void setNic(NestedNic nic) {
    this.nic = nic;
  }


  public VmNic order(Integer order) {
    
    this.order = order;
    return this;
  }

   /**
   * Get order
   * @return order
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getOrder() {
    return order;
  }


  public void setOrder(Integer order) {
    this.order = order;
  }


  public VmNic subnetMask(String subnetMask) {
    
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


  public VmNic type(VmNicType type) {
    
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


  public VmNic vlan(NestedVlan vlan) {
    
    this.vlan = vlan;
    return this;
  }

   /**
   * Get vlan
   * @return vlan
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public NestedVlan getVlan() {
    return vlan;
  }


  public void setVlan(NestedVlan vlan) {
    this.vlan = vlan;
  }


  public VmNic vm(NestedVm vm) {
    
    this.vm = vm;
    return this;
  }

   /**
   * Get vm
   * @return vm
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public NestedVm getVm() {
    return vm;
  }


  public void setVm(NestedVm vm) {
    this.vm = vm;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VmNic vmNic = (VmNic) o;
    return Objects.equals(this.egressRateLimitBurstInBit, vmNic.egressRateLimitBurstInBit) &&
        Objects.equals(this.egressRateLimitEnabled, vmNic.egressRateLimitEnabled) &&
        Objects.equals(this.egressRateLimitMaxRateInBitps, vmNic.egressRateLimitMaxRateInBitps) &&
        Objects.equals(this.enabled, vmNic.enabled) &&
        Objects.equals(this.gateway, vmNic.gateway) &&
        Objects.equals(this.id, vmNic.id) &&
        Objects.equals(this.ingressRateLimitBurstInBit, vmNic.ingressRateLimitBurstInBit) &&
        Objects.equals(this.ingressRateLimitEnabled, vmNic.ingressRateLimitEnabled) &&
        Objects.equals(this.ingressRateLimitMaxRateInBitps, vmNic.ingressRateLimitMaxRateInBitps) &&
        Objects.equals(this.interfaceId, vmNic.interfaceId) &&
        Objects.equals(this.ipAddress, vmNic.ipAddress) &&
        Objects.equals(this.localId, vmNic.localId) &&
        Objects.equals(this.macAddress, vmNic.macAddress) &&
        Objects.equals(this.mirror, vmNic.mirror) &&
        Objects.equals(this.model, vmNic.model) &&
        Objects.equals(this.nic, vmNic.nic) &&
        Objects.equals(this.order, vmNic.order) &&
        Objects.equals(this.subnetMask, vmNic.subnetMask) &&
        Objects.equals(this.type, vmNic.type) &&
        Objects.equals(this.vlan, vmNic.vlan) &&
        Objects.equals(this.vm, vmNic.vm);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(egressRateLimitBurstInBit, egressRateLimitEnabled, egressRateLimitMaxRateInBitps, enabled, gateway, id, ingressRateLimitBurstInBit, ingressRateLimitEnabled, ingressRateLimitMaxRateInBitps, interfaceId, ipAddress, localId, macAddress, mirror, model, nic, order, subnetMask, type, vlan, vm);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VmNic {\n");
    sb.append("    egressRateLimitBurstInBit: ").append(toIndentedString(egressRateLimitBurstInBit)).append("\n");
    sb.append("    egressRateLimitEnabled: ").append(toIndentedString(egressRateLimitEnabled)).append("\n");
    sb.append("    egressRateLimitMaxRateInBitps: ").append(toIndentedString(egressRateLimitMaxRateInBitps)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    gateway: ").append(toIndentedString(gateway)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    ingressRateLimitBurstInBit: ").append(toIndentedString(ingressRateLimitBurstInBit)).append("\n");
    sb.append("    ingressRateLimitEnabled: ").append(toIndentedString(ingressRateLimitEnabled)).append("\n");
    sb.append("    ingressRateLimitMaxRateInBitps: ").append(toIndentedString(ingressRateLimitMaxRateInBitps)).append("\n");
    sb.append("    interfaceId: ").append(toIndentedString(interfaceId)).append("\n");
    sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
    sb.append("    localId: ").append(toIndentedString(localId)).append("\n");
    sb.append("    macAddress: ").append(toIndentedString(macAddress)).append("\n");
    sb.append("    mirror: ").append(toIndentedString(mirror)).append("\n");
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
    sb.append("    nic: ").append(toIndentedString(nic)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    subnetMask: ").append(toIndentedString(subnetMask)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    vlan: ").append(toIndentedString(vlan)).append("\n");
    sb.append("    vm: ").append(toIndentedString(vm)).append("\n");
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

