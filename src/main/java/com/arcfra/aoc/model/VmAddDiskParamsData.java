package com.arcfra.aoc.model;

import java.util.Objects;
import java.util.Arrays;
import com.arcfra.aoc.model.BPSUnit;
import com.arcfra.aoc.model.VmAddDiskParamsDataVmDisks;
import com.arcfra.aoc.model.VmDiskIoPolicy;
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
 * VmAddDiskParamsData
 */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class VmAddDiskParamsData {
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

  public static final String SERIALIZED_NAME_IO_POLICY = "io_policy";
  @SerializedName(SERIALIZED_NAME_IO_POLICY)
  private VmDiskIoPolicy ioPolicy;

  public static final String SERIALIZED_NAME_VM_DISKS = "vm_disks";
  @SerializedName(SERIALIZED_NAME_VM_DISKS)
  private VmAddDiskParamsDataVmDisks vmDisks;

  public VmAddDiskParamsData() { 
  }

  public VmAddDiskParamsData maxBandwidthPolicy(VmDiskIoRestrictType maxBandwidthPolicy) {
    
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


  public VmAddDiskParamsData maxBandwidthUnit(BPSUnit maxBandwidthUnit) {
    
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


  public VmAddDiskParamsData maxBandwidth(Long maxBandwidth) {
    
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


  public VmAddDiskParamsData maxIopsPolicy(VmDiskIoRestrictType maxIopsPolicy) {
    
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


  public VmAddDiskParamsData maxIops(Long maxIops) {
    
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


  public VmAddDiskParamsData ioPolicy(VmDiskIoPolicy ioPolicy) {
    
    this.ioPolicy = ioPolicy;
    return this;
  }

   /**
   * Get ioPolicy
   * @return ioPolicy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VmDiskIoPolicy getIoPolicy() {
    return ioPolicy;
  }


  public void setIoPolicy(VmDiskIoPolicy ioPolicy) {
    this.ioPolicy = ioPolicy;
  }


  public VmAddDiskParamsData vmDisks(VmAddDiskParamsDataVmDisks vmDisks) {
    
    this.vmDisks = vmDisks;
    return this;
  }

   /**
   * Get vmDisks
   * @return vmDisks
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public VmAddDiskParamsDataVmDisks getVmDisks() {
    return vmDisks;
  }


  public void setVmDisks(VmAddDiskParamsDataVmDisks vmDisks) {
    this.vmDisks = vmDisks;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VmAddDiskParamsData vmAddDiskParamsData = (VmAddDiskParamsData) o;
    return Objects.equals(this.maxBandwidthPolicy, vmAddDiskParamsData.maxBandwidthPolicy) &&
        Objects.equals(this.maxBandwidthUnit, vmAddDiskParamsData.maxBandwidthUnit) &&
        Objects.equals(this.maxBandwidth, vmAddDiskParamsData.maxBandwidth) &&
        Objects.equals(this.maxIopsPolicy, vmAddDiskParamsData.maxIopsPolicy) &&
        Objects.equals(this.maxIops, vmAddDiskParamsData.maxIops) &&
        Objects.equals(this.ioPolicy, vmAddDiskParamsData.ioPolicy) &&
        Objects.equals(this.vmDisks, vmAddDiskParamsData.vmDisks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxBandwidthPolicy, maxBandwidthUnit, maxBandwidth, maxIopsPolicy, maxIops, ioPolicy, vmDisks);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VmAddDiskParamsData {\n");
    sb.append("    maxBandwidthPolicy: ").append(toIndentedString(maxBandwidthPolicy)).append("\n");
    sb.append("    maxBandwidthUnit: ").append(toIndentedString(maxBandwidthUnit)).append("\n");
    sb.append("    maxBandwidth: ").append(toIndentedString(maxBandwidth)).append("\n");
    sb.append("    maxIopsPolicy: ").append(toIndentedString(maxIopsPolicy)).append("\n");
    sb.append("    maxIops: ").append(toIndentedString(maxIops)).append("\n");
    sb.append("    ioPolicy: ").append(toIndentedString(ioPolicy)).append("\n");
    sb.append("    vmDisks: ").append(toIndentedString(vmDisks)).append("\n");
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

