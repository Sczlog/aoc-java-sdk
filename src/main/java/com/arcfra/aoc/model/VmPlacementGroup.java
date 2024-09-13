package com.arcfra.aoc.model;

import java.util.Objects;
import java.util.Arrays;
import com.arcfra.aoc.model.EntityAsyncStatus;
import com.arcfra.aoc.model.NestedCluster;
import com.arcfra.aoc.model.NestedHost;
import com.arcfra.aoc.model.NestedVm;
import com.arcfra.aoc.model.VmVmPolicy;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * VmPlacementGroup
 */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class VmPlacementGroup {
  public static final String SERIALIZED_NAME_CLUSTER = "cluster";
  @SerializedName(SERIALIZED_NAME_CLUSTER)
  private NestedCluster cluster;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_ENABLED = "enabled";
  @SerializedName(SERIALIZED_NAME_ENABLED)
  private Boolean enabled;

  public static final String SERIALIZED_NAME_ENTITY_ASYNC_STATUS = "entityAsyncStatus";
  @SerializedName(SERIALIZED_NAME_ENTITY_ASYNC_STATUS)
  private EntityAsyncStatus entityAsyncStatus;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_LOCAL_CREATED_AT = "local_created_at";
  @SerializedName(SERIALIZED_NAME_LOCAL_CREATED_AT)
  private String localCreatedAt;

  public static final String SERIALIZED_NAME_LOCAL_ID = "local_id";
  @SerializedName(SERIALIZED_NAME_LOCAL_ID)
  private String localId;

  public static final String SERIALIZED_NAME_LOCAL_UPDATED_AT = "local_updated_at";
  @SerializedName(SERIALIZED_NAME_LOCAL_UPDATED_AT)
  private String localUpdatedAt;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_VM_HOST_MUST_ENABLED = "vm_host_must_enabled";
  @SerializedName(SERIALIZED_NAME_VM_HOST_MUST_ENABLED)
  private Boolean vmHostMustEnabled;

  public static final String SERIALIZED_NAME_VM_HOST_MUST_HOST_UUIDS = "vm_host_must_host_uuids";
  @SerializedName(SERIALIZED_NAME_VM_HOST_MUST_HOST_UUIDS)
  private List<NestedHost> vmHostMustHostUuids = null;

  public static final String SERIALIZED_NAME_VM_HOST_MUST_POLICY = "vm_host_must_policy";
  @SerializedName(SERIALIZED_NAME_VM_HOST_MUST_POLICY)
  private Boolean vmHostMustPolicy;

  public static final String SERIALIZED_NAME_VM_HOST_PREFER_ENABLED = "vm_host_prefer_enabled";
  @SerializedName(SERIALIZED_NAME_VM_HOST_PREFER_ENABLED)
  private Boolean vmHostPreferEnabled;

  public static final String SERIALIZED_NAME_VM_HOST_PREFER_HOST_UUIDS = "vm_host_prefer_host_uuids";
  @SerializedName(SERIALIZED_NAME_VM_HOST_PREFER_HOST_UUIDS)
  private List<NestedHost> vmHostPreferHostUuids = null;

  public static final String SERIALIZED_NAME_VM_HOST_PREFER_POLICY = "vm_host_prefer_policy";
  @SerializedName(SERIALIZED_NAME_VM_HOST_PREFER_POLICY)
  private Boolean vmHostPreferPolicy;

  public static final String SERIALIZED_NAME_VM_VM_POLICY = "vm_vm_policy";
  @SerializedName(SERIALIZED_NAME_VM_VM_POLICY)
  private VmVmPolicy vmVmPolicy;

  public static final String SERIALIZED_NAME_VM_VM_POLICY_ENABLED = "vm_vm_policy_enabled";
  @SerializedName(SERIALIZED_NAME_VM_VM_POLICY_ENABLED)
  private Boolean vmVmPolicyEnabled;

  public static final String SERIALIZED_NAME_VMS = "vms";
  @SerializedName(SERIALIZED_NAME_VMS)
  private List<NestedVm> vms = null;

  public VmPlacementGroup() { 
  }

  public VmPlacementGroup cluster(NestedCluster cluster) {
    
    this.cluster = cluster;
    return this;
  }

   /**
   * Get cluster
   * @return cluster
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public NestedCluster getCluster() {
    return cluster;
  }


  public void setCluster(NestedCluster cluster) {
    this.cluster = cluster;
  }


  public VmPlacementGroup description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public VmPlacementGroup enabled(Boolean enabled) {
    
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


  public VmPlacementGroup entityAsyncStatus(EntityAsyncStatus entityAsyncStatus) {
    
    this.entityAsyncStatus = entityAsyncStatus;
    return this;
  }

   /**
   * Get entityAsyncStatus
   * @return entityAsyncStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public EntityAsyncStatus getEntityAsyncStatus() {
    return entityAsyncStatus;
  }


  public void setEntityAsyncStatus(EntityAsyncStatus entityAsyncStatus) {
    this.entityAsyncStatus = entityAsyncStatus;
  }


  public VmPlacementGroup id(String id) {
    
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


  public VmPlacementGroup localCreatedAt(String localCreatedAt) {
    
    this.localCreatedAt = localCreatedAt;
    return this;
  }

   /**
   * Get localCreatedAt
   * @return localCreatedAt
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getLocalCreatedAt() {
    return localCreatedAt;
  }


  public void setLocalCreatedAt(String localCreatedAt) {
    this.localCreatedAt = localCreatedAt;
  }


  public VmPlacementGroup localId(String localId) {
    
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


  public VmPlacementGroup localUpdatedAt(String localUpdatedAt) {
    
    this.localUpdatedAt = localUpdatedAt;
    return this;
  }

   /**
   * Get localUpdatedAt
   * @return localUpdatedAt
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getLocalUpdatedAt() {
    return localUpdatedAt;
  }


  public void setLocalUpdatedAt(String localUpdatedAt) {
    this.localUpdatedAt = localUpdatedAt;
  }


  public VmPlacementGroup name(String name) {
    
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


  public VmPlacementGroup vmHostMustEnabled(Boolean vmHostMustEnabled) {
    
    this.vmHostMustEnabled = vmHostMustEnabled;
    return this;
  }

   /**
   * Get vmHostMustEnabled
   * @return vmHostMustEnabled
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boolean getVmHostMustEnabled() {
    return vmHostMustEnabled;
  }


  public void setVmHostMustEnabled(Boolean vmHostMustEnabled) {
    this.vmHostMustEnabled = vmHostMustEnabled;
  }


  public VmPlacementGroup vmHostMustHostUuids(List<NestedHost> vmHostMustHostUuids) {
    
    this.vmHostMustHostUuids = vmHostMustHostUuids;
    return this;
  }

  public VmPlacementGroup addVmHostMustHostUuidsItem(NestedHost vmHostMustHostUuidsItem) {
    if (this.vmHostMustHostUuids == null) {
      this.vmHostMustHostUuids = new ArrayList<NestedHost>();
    }
    this.vmHostMustHostUuids.add(vmHostMustHostUuidsItem);
    return this;
  }

   /**
   * Get vmHostMustHostUuids
   * @return vmHostMustHostUuids
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<NestedHost> getVmHostMustHostUuids() {
    return vmHostMustHostUuids;
  }


  public void setVmHostMustHostUuids(List<NestedHost> vmHostMustHostUuids) {
    this.vmHostMustHostUuids = vmHostMustHostUuids;
  }


  public VmPlacementGroup vmHostMustPolicy(Boolean vmHostMustPolicy) {
    
    this.vmHostMustPolicy = vmHostMustPolicy;
    return this;
  }

   /**
   * Get vmHostMustPolicy
   * @return vmHostMustPolicy
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boolean getVmHostMustPolicy() {
    return vmHostMustPolicy;
  }


  public void setVmHostMustPolicy(Boolean vmHostMustPolicy) {
    this.vmHostMustPolicy = vmHostMustPolicy;
  }


  public VmPlacementGroup vmHostPreferEnabled(Boolean vmHostPreferEnabled) {
    
    this.vmHostPreferEnabled = vmHostPreferEnabled;
    return this;
  }

   /**
   * Get vmHostPreferEnabled
   * @return vmHostPreferEnabled
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boolean getVmHostPreferEnabled() {
    return vmHostPreferEnabled;
  }


  public void setVmHostPreferEnabled(Boolean vmHostPreferEnabled) {
    this.vmHostPreferEnabled = vmHostPreferEnabled;
  }


  public VmPlacementGroup vmHostPreferHostUuids(List<NestedHost> vmHostPreferHostUuids) {
    
    this.vmHostPreferHostUuids = vmHostPreferHostUuids;
    return this;
  }

  public VmPlacementGroup addVmHostPreferHostUuidsItem(NestedHost vmHostPreferHostUuidsItem) {
    if (this.vmHostPreferHostUuids == null) {
      this.vmHostPreferHostUuids = new ArrayList<NestedHost>();
    }
    this.vmHostPreferHostUuids.add(vmHostPreferHostUuidsItem);
    return this;
  }

   /**
   * Get vmHostPreferHostUuids
   * @return vmHostPreferHostUuids
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<NestedHost> getVmHostPreferHostUuids() {
    return vmHostPreferHostUuids;
  }


  public void setVmHostPreferHostUuids(List<NestedHost> vmHostPreferHostUuids) {
    this.vmHostPreferHostUuids = vmHostPreferHostUuids;
  }


  public VmPlacementGroup vmHostPreferPolicy(Boolean vmHostPreferPolicy) {
    
    this.vmHostPreferPolicy = vmHostPreferPolicy;
    return this;
  }

   /**
   * Get vmHostPreferPolicy
   * @return vmHostPreferPolicy
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boolean getVmHostPreferPolicy() {
    return vmHostPreferPolicy;
  }


  public void setVmHostPreferPolicy(Boolean vmHostPreferPolicy) {
    this.vmHostPreferPolicy = vmHostPreferPolicy;
  }


  public VmPlacementGroup vmVmPolicy(VmVmPolicy vmVmPolicy) {
    
    this.vmVmPolicy = vmVmPolicy;
    return this;
  }

   /**
   * Get vmVmPolicy
   * @return vmVmPolicy
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public VmVmPolicy getVmVmPolicy() {
    return vmVmPolicy;
  }


  public void setVmVmPolicy(VmVmPolicy vmVmPolicy) {
    this.vmVmPolicy = vmVmPolicy;
  }


  public VmPlacementGroup vmVmPolicyEnabled(Boolean vmVmPolicyEnabled) {
    
    this.vmVmPolicyEnabled = vmVmPolicyEnabled;
    return this;
  }

   /**
   * Get vmVmPolicyEnabled
   * @return vmVmPolicyEnabled
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boolean getVmVmPolicyEnabled() {
    return vmVmPolicyEnabled;
  }


  public void setVmVmPolicyEnabled(Boolean vmVmPolicyEnabled) {
    this.vmVmPolicyEnabled = vmVmPolicyEnabled;
  }


  public VmPlacementGroup vms(List<NestedVm> vms) {
    
    this.vms = vms;
    return this;
  }

  public VmPlacementGroup addVmsItem(NestedVm vmsItem) {
    if (this.vms == null) {
      this.vms = new ArrayList<NestedVm>();
    }
    this.vms.add(vmsItem);
    return this;
  }

   /**
   * Get vms
   * @return vms
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<NestedVm> getVms() {
    return vms;
  }


  public void setVms(List<NestedVm> vms) {
    this.vms = vms;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VmPlacementGroup vmPlacementGroup = (VmPlacementGroup) o;
    return Objects.equals(this.cluster, vmPlacementGroup.cluster) &&
        Objects.equals(this.description, vmPlacementGroup.description) &&
        Objects.equals(this.enabled, vmPlacementGroup.enabled) &&
        Objects.equals(this.entityAsyncStatus, vmPlacementGroup.entityAsyncStatus) &&
        Objects.equals(this.id, vmPlacementGroup.id) &&
        Objects.equals(this.localCreatedAt, vmPlacementGroup.localCreatedAt) &&
        Objects.equals(this.localId, vmPlacementGroup.localId) &&
        Objects.equals(this.localUpdatedAt, vmPlacementGroup.localUpdatedAt) &&
        Objects.equals(this.name, vmPlacementGroup.name) &&
        Objects.equals(this.vmHostMustEnabled, vmPlacementGroup.vmHostMustEnabled) &&
        Objects.equals(this.vmHostMustHostUuids, vmPlacementGroup.vmHostMustHostUuids) &&
        Objects.equals(this.vmHostMustPolicy, vmPlacementGroup.vmHostMustPolicy) &&
        Objects.equals(this.vmHostPreferEnabled, vmPlacementGroup.vmHostPreferEnabled) &&
        Objects.equals(this.vmHostPreferHostUuids, vmPlacementGroup.vmHostPreferHostUuids) &&
        Objects.equals(this.vmHostPreferPolicy, vmPlacementGroup.vmHostPreferPolicy) &&
        Objects.equals(this.vmVmPolicy, vmPlacementGroup.vmVmPolicy) &&
        Objects.equals(this.vmVmPolicyEnabled, vmPlacementGroup.vmVmPolicyEnabled) &&
        Objects.equals(this.vms, vmPlacementGroup.vms);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(cluster, description, enabled, entityAsyncStatus, id, localCreatedAt, localId, localUpdatedAt, name, vmHostMustEnabled, vmHostMustHostUuids, vmHostMustPolicy, vmHostPreferEnabled, vmHostPreferHostUuids, vmHostPreferPolicy, vmVmPolicy, vmVmPolicyEnabled, vms);
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
    sb.append("class VmPlacementGroup {\n");
    sb.append("    cluster: ").append(toIndentedString(cluster)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    entityAsyncStatus: ").append(toIndentedString(entityAsyncStatus)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    localCreatedAt: ").append(toIndentedString(localCreatedAt)).append("\n");
    sb.append("    localId: ").append(toIndentedString(localId)).append("\n");
    sb.append("    localUpdatedAt: ").append(toIndentedString(localUpdatedAt)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    vmHostMustEnabled: ").append(toIndentedString(vmHostMustEnabled)).append("\n");
    sb.append("    vmHostMustHostUuids: ").append(toIndentedString(vmHostMustHostUuids)).append("\n");
    sb.append("    vmHostMustPolicy: ").append(toIndentedString(vmHostMustPolicy)).append("\n");
    sb.append("    vmHostPreferEnabled: ").append(toIndentedString(vmHostPreferEnabled)).append("\n");
    sb.append("    vmHostPreferHostUuids: ").append(toIndentedString(vmHostPreferHostUuids)).append("\n");
    sb.append("    vmHostPreferPolicy: ").append(toIndentedString(vmHostPreferPolicy)).append("\n");
    sb.append("    vmVmPolicy: ").append(toIndentedString(vmVmPolicy)).append("\n");
    sb.append("    vmVmPolicyEnabled: ").append(toIndentedString(vmVmPolicyEnabled)).append("\n");
    sb.append("    vms: ").append(toIndentedString(vms)).append("\n");
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

