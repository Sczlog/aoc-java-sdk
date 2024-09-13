package com.arcfra.aoc.model;

import java.util.Objects;
import java.util.Arrays;
import com.arcfra.aoc.model.BPSUnit;
import com.arcfra.aoc.model.Bus;
import com.arcfra.aoc.model.VmDiskIoRestrictType;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * MountDisksParams
 */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class MountDisksParams {
  public static final String SERIALIZED_NAME_MAX_BANDWIDTH_POLICY = "max_bandwidth_policy";
  @SerializedName(SERIALIZED_NAME_MAX_BANDWIDTH_POLICY)
  private VmDiskIoRestrictType maxBandwidthPolicy;

  public static final String SERIALIZED_NAME_MAX_BANDWIDTH_UNIT = "max_bandwidth_unit";
  @SerializedName(SERIALIZED_NAME_MAX_BANDWIDTH_UNIT)
  private BPSUnit maxBandwidthUnit;

  public static final String SERIALIZED_NAME_MAX_BANDWIDTH = "max_bandwidth";
  @SerializedName(SERIALIZED_NAME_MAX_BANDWIDTH)
  private Long maxBandwidth;

  public static final String SERIALIZED_NAME_MAX_IOPS_POLICY = "max_iops_policy";
  @SerializedName(SERIALIZED_NAME_MAX_IOPS_POLICY)
  private VmDiskIoRestrictType maxIopsPolicy;

  public static final String SERIALIZED_NAME_MAX_IOPS = "max_iops";
  @SerializedName(SERIALIZED_NAME_MAX_IOPS)
  private Long maxIops;

  public static final String SERIALIZED_NAME_VM_VOLUME_ID = "vm_volume_id";
  @SerializedName(SERIALIZED_NAME_VM_VOLUME_ID)
  private String vmVolumeId;

  public static final String SERIALIZED_NAME_INDEX = "index";
  @SerializedName(SERIALIZED_NAME_INDEX)
  private Integer index;

  public static final String SERIALIZED_NAME_KEY = "key";
  @SerializedName(SERIALIZED_NAME_KEY)
  private Integer key;

  public static final String SERIALIZED_NAME_BUS = "bus";
  @SerializedName(SERIALIZED_NAME_BUS)
  private Bus bus;

  public static final String SERIALIZED_NAME_BOOT = "boot";
  @SerializedName(SERIALIZED_NAME_BOOT)
  private Integer boot;

  public MountDisksParams() { 
  }

  public MountDisksParams maxBandwidthPolicy(VmDiskIoRestrictType maxBandwidthPolicy) {
    
    this.maxBandwidthPolicy = maxBandwidthPolicy;
    return this;
  }

   /**
   * Get maxBandwidthPolicy
   * @return maxBandwidthPolicy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VmDiskIoRestrictType getMaxBandwidthPolicy() {
    return maxBandwidthPolicy;
  }


  public void setMaxBandwidthPolicy(VmDiskIoRestrictType maxBandwidthPolicy) {
    this.maxBandwidthPolicy = maxBandwidthPolicy;
  }


  public MountDisksParams maxBandwidthUnit(BPSUnit maxBandwidthUnit) {
    
    this.maxBandwidthUnit = maxBandwidthUnit;
    return this;
  }

   /**
   * Get maxBandwidthUnit
   * @return maxBandwidthUnit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BPSUnit getMaxBandwidthUnit() {
    return maxBandwidthUnit;
  }


  public void setMaxBandwidthUnit(BPSUnit maxBandwidthUnit) {
    this.maxBandwidthUnit = maxBandwidthUnit;
  }


  public MountDisksParams maxBandwidth(Long maxBandwidth) {
    
    this.maxBandwidth = maxBandwidth;
    return this;
  }

   /**
   * Get maxBandwidth
   * @return maxBandwidth
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getMaxBandwidth() {
    return maxBandwidth;
  }


  public void setMaxBandwidth(Long maxBandwidth) {
    this.maxBandwidth = maxBandwidth;
  }


  public MountDisksParams maxIopsPolicy(VmDiskIoRestrictType maxIopsPolicy) {
    
    this.maxIopsPolicy = maxIopsPolicy;
    return this;
  }

   /**
   * Get maxIopsPolicy
   * @return maxIopsPolicy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VmDiskIoRestrictType getMaxIopsPolicy() {
    return maxIopsPolicy;
  }


  public void setMaxIopsPolicy(VmDiskIoRestrictType maxIopsPolicy) {
    this.maxIopsPolicy = maxIopsPolicy;
  }


  public MountDisksParams maxIops(Long maxIops) {
    
    this.maxIops = maxIops;
    return this;
  }

   /**
   * Get maxIops
   * @return maxIops
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getMaxIops() {
    return maxIops;
  }


  public void setMaxIops(Long maxIops) {
    this.maxIops = maxIops;
  }


  public MountDisksParams vmVolumeId(String vmVolumeId) {
    
    this.vmVolumeId = vmVolumeId;
    return this;
  }

   /**
   * Get vmVolumeId
   * @return vmVolumeId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getVmVolumeId() {
    return vmVolumeId;
  }


  public void setVmVolumeId(String vmVolumeId) {
    this.vmVolumeId = vmVolumeId;
  }


  public MountDisksParams index(Integer index) {
    
    this.index = index;
    return this;
  }

   /**
   * Get index
   * @return index
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getIndex() {
    return index;
  }


  public void setIndex(Integer index) {
    this.index = index;
  }


  public MountDisksParams key(Integer key) {
    
    this.key = key;
    return this;
  }

   /**
   * Get key
   * @return key
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getKey() {
    return key;
  }


  public void setKey(Integer key) {
    this.key = key;
  }


  public MountDisksParams bus(Bus bus) {
    
    this.bus = bus;
    return this;
  }

   /**
   * Get bus
   * @return bus
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Bus getBus() {
    return bus;
  }


  public void setBus(Bus bus) {
    this.bus = bus;
  }


  public MountDisksParams boot(Integer boot) {
    
    this.boot = boot;
    return this;
  }

   /**
   * Get boot
   * @return boot
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getBoot() {
    return boot;
  }


  public void setBoot(Integer boot) {
    this.boot = boot;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MountDisksParams mountDisksParams = (MountDisksParams) o;
    return Objects.equals(this.maxBandwidthPolicy, mountDisksParams.maxBandwidthPolicy) &&
        Objects.equals(this.maxBandwidthUnit, mountDisksParams.maxBandwidthUnit) &&
        Objects.equals(this.maxBandwidth, mountDisksParams.maxBandwidth) &&
        Objects.equals(this.maxIopsPolicy, mountDisksParams.maxIopsPolicy) &&
        Objects.equals(this.maxIops, mountDisksParams.maxIops) &&
        Objects.equals(this.vmVolumeId, mountDisksParams.vmVolumeId) &&
        Objects.equals(this.index, mountDisksParams.index) &&
        Objects.equals(this.key, mountDisksParams.key) &&
        Objects.equals(this.bus, mountDisksParams.bus) &&
        Objects.equals(this.boot, mountDisksParams.boot);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxBandwidthPolicy, maxBandwidthUnit, maxBandwidth, maxIopsPolicy, maxIops, vmVolumeId, index, key, bus, boot);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MountDisksParams {\n");
    sb.append("    maxBandwidthPolicy: ").append(toIndentedString(maxBandwidthPolicy)).append("\n");
    sb.append("    maxBandwidthUnit: ").append(toIndentedString(maxBandwidthUnit)).append("\n");
    sb.append("    maxBandwidth: ").append(toIndentedString(maxBandwidth)).append("\n");
    sb.append("    maxIopsPolicy: ").append(toIndentedString(maxIopsPolicy)).append("\n");
    sb.append("    maxIops: ").append(toIndentedString(maxIops)).append("\n");
    sb.append("    vmVolumeId: ").append(toIndentedString(vmVolumeId)).append("\n");
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    bus: ").append(toIndentedString(bus)).append("\n");
    sb.append("    boot: ").append(toIndentedString(boot)).append("\n");
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

