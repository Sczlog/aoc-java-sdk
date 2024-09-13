package com.arcfra.aoc.model;

import java.util.Objects;
import java.util.Arrays;
import com.arcfra.aoc.model.HostWhereInput;
import com.arcfra.aoc.model.VmVmPolicy;
import com.arcfra.aoc.model.VmWhereInput;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * VmPlacementGroupCreationParams
 */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class VmPlacementGroupCreationParams {
  public static final String SERIALIZED_NAME_VM_VM_POLICY = "vm_vm_policy";
  @SerializedName(SERIALIZED_NAME_VM_VM_POLICY)
  private VmVmPolicy vmVmPolicy;

  public static final String SERIALIZED_NAME_VM_HOST_PREFER_ENABLED = "vm_host_prefer_enabled";
  @SerializedName(SERIALIZED_NAME_VM_HOST_PREFER_ENABLED)
  private Boolean vmHostPreferEnabled;

  public static final String SERIALIZED_NAME_VM_HOST_MUST_POLICY = "vm_host_must_policy";
  @SerializedName(SERIALIZED_NAME_VM_HOST_MUST_POLICY)
  private Boolean vmHostMustPolicy;

  public static final String SERIALIZED_NAME_VM_HOST_MUST_ENABLED = "vm_host_must_enabled";
  @SerializedName(SERIALIZED_NAME_VM_HOST_MUST_ENABLED)
  private Boolean vmHostMustEnabled;

  public static final String SERIALIZED_NAME_VM_HOST_PREFER_POLICY = "vm_host_prefer_policy";
  @SerializedName(SERIALIZED_NAME_VM_HOST_PREFER_POLICY)
  private Boolean vmHostPreferPolicy;

  public static final String SERIALIZED_NAME_VM_VM_POLICY_ENABLED = "vm_vm_policy_enabled";
  @SerializedName(SERIALIZED_NAME_VM_VM_POLICY_ENABLED)
  private Boolean vmVmPolicyEnabled;

  public static final String SERIALIZED_NAME_VMS = "vms";
  @SerializedName(SERIALIZED_NAME_VMS)
  private VmWhereInput vms;

  public static final String SERIALIZED_NAME_PREFER_HOSTS = "prefer_hosts";
  @SerializedName(SERIALIZED_NAME_PREFER_HOSTS)
  private HostWhereInput preferHosts;

  public static final String SERIALIZED_NAME_MUST_HOSTS = "must_hosts";
  @SerializedName(SERIALIZED_NAME_MUST_HOSTS)
  private HostWhereInput mustHosts;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_ENABLED = "enabled";
  @SerializedName(SERIALIZED_NAME_ENABLED)
  private Boolean enabled;

  public static final String SERIALIZED_NAME_CLUSTER_ID = "cluster_id";
  @SerializedName(SERIALIZED_NAME_CLUSTER_ID)
  private String clusterId;

  public VmPlacementGroupCreationParams() { 
  }

  public VmPlacementGroupCreationParams vmVmPolicy(VmVmPolicy vmVmPolicy) {
    
    this.vmVmPolicy = vmVmPolicy;
    return this;
  }

   /**
   * Get vmVmPolicy
   * @return vmVmPolicy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VmVmPolicy getVmVmPolicy() {
    return vmVmPolicy;
  }


  public void setVmVmPolicy(VmVmPolicy vmVmPolicy) {
    this.vmVmPolicy = vmVmPolicy;
  }


  public VmPlacementGroupCreationParams vmHostPreferEnabled(Boolean vmHostPreferEnabled) {
    
    this.vmHostPreferEnabled = vmHostPreferEnabled;
    return this;
  }

   /**
   * Get vmHostPreferEnabled
   * @return vmHostPreferEnabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getVmHostPreferEnabled() {
    return vmHostPreferEnabled;
  }


  public void setVmHostPreferEnabled(Boolean vmHostPreferEnabled) {
    this.vmHostPreferEnabled = vmHostPreferEnabled;
  }


  public VmPlacementGroupCreationParams vmHostMustPolicy(Boolean vmHostMustPolicy) {
    
    this.vmHostMustPolicy = vmHostMustPolicy;
    return this;
  }

   /**
   * Get vmHostMustPolicy
   * @return vmHostMustPolicy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getVmHostMustPolicy() {
    return vmHostMustPolicy;
  }


  public void setVmHostMustPolicy(Boolean vmHostMustPolicy) {
    this.vmHostMustPolicy = vmHostMustPolicy;
  }


  public VmPlacementGroupCreationParams vmHostMustEnabled(Boolean vmHostMustEnabled) {
    
    this.vmHostMustEnabled = vmHostMustEnabled;
    return this;
  }

   /**
   * Get vmHostMustEnabled
   * @return vmHostMustEnabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getVmHostMustEnabled() {
    return vmHostMustEnabled;
  }


  public void setVmHostMustEnabled(Boolean vmHostMustEnabled) {
    this.vmHostMustEnabled = vmHostMustEnabled;
  }


  public VmPlacementGroupCreationParams vmHostPreferPolicy(Boolean vmHostPreferPolicy) {
    
    this.vmHostPreferPolicy = vmHostPreferPolicy;
    return this;
  }

   /**
   * Get vmHostPreferPolicy
   * @return vmHostPreferPolicy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getVmHostPreferPolicy() {
    return vmHostPreferPolicy;
  }


  public void setVmHostPreferPolicy(Boolean vmHostPreferPolicy) {
    this.vmHostPreferPolicy = vmHostPreferPolicy;
  }


  public VmPlacementGroupCreationParams vmVmPolicyEnabled(Boolean vmVmPolicyEnabled) {
    
    this.vmVmPolicyEnabled = vmVmPolicyEnabled;
    return this;
  }

   /**
   * Get vmVmPolicyEnabled
   * @return vmVmPolicyEnabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getVmVmPolicyEnabled() {
    return vmVmPolicyEnabled;
  }


  public void setVmVmPolicyEnabled(Boolean vmVmPolicyEnabled) {
    this.vmVmPolicyEnabled = vmVmPolicyEnabled;
  }


  public VmPlacementGroupCreationParams vms(VmWhereInput vms) {
    
    this.vms = vms;
    return this;
  }

   /**
   * Get vms
   * @return vms
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VmWhereInput getVms() {
    return vms;
  }


  public void setVms(VmWhereInput vms) {
    this.vms = vms;
  }


  public VmPlacementGroupCreationParams preferHosts(HostWhereInput preferHosts) {
    
    this.preferHosts = preferHosts;
    return this;
  }

   /**
   * Get preferHosts
   * @return preferHosts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public HostWhereInput getPreferHosts() {
    return preferHosts;
  }


  public void setPreferHosts(HostWhereInput preferHosts) {
    this.preferHosts = preferHosts;
  }


  public VmPlacementGroupCreationParams mustHosts(HostWhereInput mustHosts) {
    
    this.mustHosts = mustHosts;
    return this;
  }

   /**
   * Get mustHosts
   * @return mustHosts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public HostWhereInput getMustHosts() {
    return mustHosts;
  }


  public void setMustHosts(HostWhereInput mustHosts) {
    this.mustHosts = mustHosts;
  }


  public VmPlacementGroupCreationParams name(String name) {
    
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


  public VmPlacementGroupCreationParams description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public VmPlacementGroupCreationParams enabled(Boolean enabled) {
    
    this.enabled = enabled;
    return this;
  }

   /**
   * Get enabled
   * @return enabled
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boolean getEnabled() {
    return enabled;
  }


  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }


  public VmPlacementGroupCreationParams clusterId(String clusterId) {
    
    this.clusterId = clusterId;
    return this;
  }

   /**
   * Get clusterId
   * @return clusterId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getClusterId() {
    return clusterId;
  }


  public void setClusterId(String clusterId) {
    this.clusterId = clusterId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VmPlacementGroupCreationParams vmPlacementGroupCreationParams = (VmPlacementGroupCreationParams) o;
    return Objects.equals(this.vmVmPolicy, vmPlacementGroupCreationParams.vmVmPolicy) &&
        Objects.equals(this.vmHostPreferEnabled, vmPlacementGroupCreationParams.vmHostPreferEnabled) &&
        Objects.equals(this.vmHostMustPolicy, vmPlacementGroupCreationParams.vmHostMustPolicy) &&
        Objects.equals(this.vmHostMustEnabled, vmPlacementGroupCreationParams.vmHostMustEnabled) &&
        Objects.equals(this.vmHostPreferPolicy, vmPlacementGroupCreationParams.vmHostPreferPolicy) &&
        Objects.equals(this.vmVmPolicyEnabled, vmPlacementGroupCreationParams.vmVmPolicyEnabled) &&
        Objects.equals(this.vms, vmPlacementGroupCreationParams.vms) &&
        Objects.equals(this.preferHosts, vmPlacementGroupCreationParams.preferHosts) &&
        Objects.equals(this.mustHosts, vmPlacementGroupCreationParams.mustHosts) &&
        Objects.equals(this.name, vmPlacementGroupCreationParams.name) &&
        Objects.equals(this.description, vmPlacementGroupCreationParams.description) &&
        Objects.equals(this.enabled, vmPlacementGroupCreationParams.enabled) &&
        Objects.equals(this.clusterId, vmPlacementGroupCreationParams.clusterId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vmVmPolicy, vmHostPreferEnabled, vmHostMustPolicy, vmHostMustEnabled, vmHostPreferPolicy, vmVmPolicyEnabled, vms, preferHosts, mustHosts, name, description, enabled, clusterId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VmPlacementGroupCreationParams {\n");
    sb.append("    vmVmPolicy: ").append(toIndentedString(vmVmPolicy)).append("\n");
    sb.append("    vmHostPreferEnabled: ").append(toIndentedString(vmHostPreferEnabled)).append("\n");
    sb.append("    vmHostMustPolicy: ").append(toIndentedString(vmHostMustPolicy)).append("\n");
    sb.append("    vmHostMustEnabled: ").append(toIndentedString(vmHostMustEnabled)).append("\n");
    sb.append("    vmHostPreferPolicy: ").append(toIndentedString(vmHostPreferPolicy)).append("\n");
    sb.append("    vmVmPolicyEnabled: ").append(toIndentedString(vmVmPolicyEnabled)).append("\n");
    sb.append("    vms: ").append(toIndentedString(vms)).append("\n");
    sb.append("    preferHosts: ").append(toIndentedString(preferHosts)).append("\n");
    sb.append("    mustHosts: ").append(toIndentedString(mustHosts)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
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

