package com.arcfra.aoc.model;

import java.util.Objects;
import java.util.Arrays;
import com.arcfra.aoc.model.EntityAsyncStatus;
import com.arcfra.aoc.model.NestedCluster;
import com.arcfra.aoc.model.NestedIscsiLun;
import com.arcfra.aoc.model.NestedLabel;
import com.arcfra.aoc.model.NestedVmDisk;
import com.arcfra.aoc.model.VmVolumeElfStoragePolicyType;
import com.arcfra.aoc.model.VmVolumeType;
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
 * VmVolume
 */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class VmVolume {
  public static final String SERIALIZED_NAME_CLUSTER = "cluster";
  @SerializedName(SERIALIZED_NAME_CLUSTER)
  private NestedCluster cluster;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_ELF_STORAGE_POLICY = "elf_storage_policy";
  @SerializedName(SERIALIZED_NAME_ELF_STORAGE_POLICY)
  private VmVolumeElfStoragePolicyType elfStoragePolicy;

  public static final String SERIALIZED_NAME_ENTITY_ASYNC_STATUS = "entityAsyncStatus";
  @SerializedName(SERIALIZED_NAME_ENTITY_ASYNC_STATUS)
  private EntityAsyncStatus entityAsyncStatus;

  public static final String SERIALIZED_NAME_GUEST_SIZE_USAGE = "guest_size_usage";
  @SerializedName(SERIALIZED_NAME_GUEST_SIZE_USAGE)
  private Double guestSizeUsage;

  public static final String SERIALIZED_NAME_GUEST_USED_SIZE = "guest_used_size";
  @SerializedName(SERIALIZED_NAME_GUEST_USED_SIZE)
  private Long guestUsedSize;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_LABELS = "labels";
  @SerializedName(SERIALIZED_NAME_LABELS)
  private List<NestedLabel> labels = null;

  public static final String SERIALIZED_NAME_LOCAL_CREATED_AT = "local_created_at";
  @SerializedName(SERIALIZED_NAME_LOCAL_CREATED_AT)
  private String localCreatedAt;

  public static final String SERIALIZED_NAME_LOCAL_ID = "local_id";
  @SerializedName(SERIALIZED_NAME_LOCAL_ID)
  private String localId;

  public static final String SERIALIZED_NAME_LUN = "lun";
  @SerializedName(SERIALIZED_NAME_LUN)
  private NestedIscsiLun lun;

  public static final String SERIALIZED_NAME_MOUNTING = "mounting";
  @SerializedName(SERIALIZED_NAME_MOUNTING)
  private Boolean mounting;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PATH = "path";
  @SerializedName(SERIALIZED_NAME_PATH)
  private String path;

  public static final String SERIALIZED_NAME_SHARING = "sharing";
  @SerializedName(SERIALIZED_NAME_SHARING)
  private Boolean sharing;

  public static final String SERIALIZED_NAME_SIZE = "size";
  @SerializedName(SERIALIZED_NAME_SIZE)
  private Long size;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private VmVolumeType type;

  public static final String SERIALIZED_NAME_UNIQUE_LOGICAL_SIZE = "unique_logical_size";
  @SerializedName(SERIALIZED_NAME_UNIQUE_LOGICAL_SIZE)
  private Double uniqueLogicalSize;

  public static final String SERIALIZED_NAME_UNIQUE_SIZE = "unique_size";
  @SerializedName(SERIALIZED_NAME_UNIQUE_SIZE)
  private Long uniqueSize;

  public static final String SERIALIZED_NAME_VM_DISKS = "vm_disks";
  @SerializedName(SERIALIZED_NAME_VM_DISKS)
  private List<NestedVmDisk> vmDisks = null;

  public VmVolume() { 
  }

  public VmVolume cluster(NestedCluster cluster) {
    
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


  public VmVolume description(String description) {
    
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


  public VmVolume elfStoragePolicy(VmVolumeElfStoragePolicyType elfStoragePolicy) {
    
    this.elfStoragePolicy = elfStoragePolicy;
    return this;
  }

   /**
   * Get elfStoragePolicy
   * @return elfStoragePolicy
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public VmVolumeElfStoragePolicyType getElfStoragePolicy() {
    return elfStoragePolicy;
  }


  public void setElfStoragePolicy(VmVolumeElfStoragePolicyType elfStoragePolicy) {
    this.elfStoragePolicy = elfStoragePolicy;
  }


  public VmVolume entityAsyncStatus(EntityAsyncStatus entityAsyncStatus) {
    
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


  public VmVolume guestSizeUsage(Double guestSizeUsage) {
    
    this.guestSizeUsage = guestSizeUsage;
    return this;
  }

   /**
   * Get guestSizeUsage
   * @return guestSizeUsage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getGuestSizeUsage() {
    return guestSizeUsage;
  }


  public void setGuestSizeUsage(Double guestSizeUsage) {
    this.guestSizeUsage = guestSizeUsage;
  }


  public VmVolume guestUsedSize(Long guestUsedSize) {
    
    this.guestUsedSize = guestUsedSize;
    return this;
  }

   /**
   * Get guestUsedSize
   * @return guestUsedSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getGuestUsedSize() {
    return guestUsedSize;
  }


  public void setGuestUsedSize(Long guestUsedSize) {
    this.guestUsedSize = guestUsedSize;
  }


  public VmVolume id(String id) {
    
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


  public VmVolume labels(List<NestedLabel> labels) {
    
    this.labels = labels;
    return this;
  }

  public VmVolume addLabelsItem(NestedLabel labelsItem) {
    if (this.labels == null) {
      this.labels = new ArrayList<NestedLabel>();
    }
    this.labels.add(labelsItem);
    return this;
  }

   /**
   * Get labels
   * @return labels
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<NestedLabel> getLabels() {
    return labels;
  }


  public void setLabels(List<NestedLabel> labels) {
    this.labels = labels;
  }


  public VmVolume localCreatedAt(String localCreatedAt) {
    
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


  public VmVolume localId(String localId) {
    
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


  public VmVolume lun(NestedIscsiLun lun) {
    
    this.lun = lun;
    return this;
  }

   /**
   * Get lun
   * @return lun
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public NestedIscsiLun getLun() {
    return lun;
  }


  public void setLun(NestedIscsiLun lun) {
    this.lun = lun;
  }


  public VmVolume mounting(Boolean mounting) {
    
    this.mounting = mounting;
    return this;
  }

   /**
   * Get mounting
   * @return mounting
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boolean getMounting() {
    return mounting;
  }


  public void setMounting(Boolean mounting) {
    this.mounting = mounting;
  }


  public VmVolume name(String name) {
    
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


  public VmVolume path(String path) {
    
    this.path = path;
    return this;
  }

   /**
   * Get path
   * @return path
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getPath() {
    return path;
  }


  public void setPath(String path) {
    this.path = path;
  }


  public VmVolume sharing(Boolean sharing) {
    
    this.sharing = sharing;
    return this;
  }

   /**
   * Get sharing
   * @return sharing
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boolean getSharing() {
    return sharing;
  }


  public void setSharing(Boolean sharing) {
    this.sharing = sharing;
  }


  public VmVolume size(Long size) {
    
    this.size = size;
    return this;
  }

   /**
   * Get size
   * @return size
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Long getSize() {
    return size;
  }


  public void setSize(Long size) {
    this.size = size;
  }


  public VmVolume type(VmVolumeType type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VmVolumeType getType() {
    return type;
  }


  public void setType(VmVolumeType type) {
    this.type = type;
  }


  public VmVolume uniqueLogicalSize(Double uniqueLogicalSize) {
    
    this.uniqueLogicalSize = uniqueLogicalSize;
    return this;
  }

   /**
   * Get uniqueLogicalSize
   * @return uniqueLogicalSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getUniqueLogicalSize() {
    return uniqueLogicalSize;
  }


  public void setUniqueLogicalSize(Double uniqueLogicalSize) {
    this.uniqueLogicalSize = uniqueLogicalSize;
  }


  public VmVolume uniqueSize(Long uniqueSize) {
    
    this.uniqueSize = uniqueSize;
    return this;
  }

   /**
   * Get uniqueSize
   * @return uniqueSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getUniqueSize() {
    return uniqueSize;
  }


  public void setUniqueSize(Long uniqueSize) {
    this.uniqueSize = uniqueSize;
  }


  public VmVolume vmDisks(List<NestedVmDisk> vmDisks) {
    
    this.vmDisks = vmDisks;
    return this;
  }

  public VmVolume addVmDisksItem(NestedVmDisk vmDisksItem) {
    if (this.vmDisks == null) {
      this.vmDisks = new ArrayList<NestedVmDisk>();
    }
    this.vmDisks.add(vmDisksItem);
    return this;
  }

   /**
   * Get vmDisks
   * @return vmDisks
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<NestedVmDisk> getVmDisks() {
    return vmDisks;
  }


  public void setVmDisks(List<NestedVmDisk> vmDisks) {
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
    VmVolume vmVolume = (VmVolume) o;
    return Objects.equals(this.cluster, vmVolume.cluster) &&
        Objects.equals(this.description, vmVolume.description) &&
        Objects.equals(this.elfStoragePolicy, vmVolume.elfStoragePolicy) &&
        Objects.equals(this.entityAsyncStatus, vmVolume.entityAsyncStatus) &&
        Objects.equals(this.guestSizeUsage, vmVolume.guestSizeUsage) &&
        Objects.equals(this.guestUsedSize, vmVolume.guestUsedSize) &&
        Objects.equals(this.id, vmVolume.id) &&
        Objects.equals(this.labels, vmVolume.labels) &&
        Objects.equals(this.localCreatedAt, vmVolume.localCreatedAt) &&
        Objects.equals(this.localId, vmVolume.localId) &&
        Objects.equals(this.lun, vmVolume.lun) &&
        Objects.equals(this.mounting, vmVolume.mounting) &&
        Objects.equals(this.name, vmVolume.name) &&
        Objects.equals(this.path, vmVolume.path) &&
        Objects.equals(this.sharing, vmVolume.sharing) &&
        Objects.equals(this.size, vmVolume.size) &&
        Objects.equals(this.type, vmVolume.type) &&
        Objects.equals(this.uniqueLogicalSize, vmVolume.uniqueLogicalSize) &&
        Objects.equals(this.uniqueSize, vmVolume.uniqueSize) &&
        Objects.equals(this.vmDisks, vmVolume.vmDisks);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(cluster, description, elfStoragePolicy, entityAsyncStatus, guestSizeUsage, guestUsedSize, id, labels, localCreatedAt, localId, lun, mounting, name, path, sharing, size, type, uniqueLogicalSize, uniqueSize, vmDisks);
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
    sb.append("class VmVolume {\n");
    sb.append("    cluster: ").append(toIndentedString(cluster)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    elfStoragePolicy: ").append(toIndentedString(elfStoragePolicy)).append("\n");
    sb.append("    entityAsyncStatus: ").append(toIndentedString(entityAsyncStatus)).append("\n");
    sb.append("    guestSizeUsage: ").append(toIndentedString(guestSizeUsage)).append("\n");
    sb.append("    guestUsedSize: ").append(toIndentedString(guestUsedSize)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    localCreatedAt: ").append(toIndentedString(localCreatedAt)).append("\n");
    sb.append("    localId: ").append(toIndentedString(localId)).append("\n");
    sb.append("    lun: ").append(toIndentedString(lun)).append("\n");
    sb.append("    mounting: ").append(toIndentedString(mounting)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    sharing: ").append(toIndentedString(sharing)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    uniqueLogicalSize: ").append(toIndentedString(uniqueLogicalSize)).append("\n");
    sb.append("    uniqueSize: ").append(toIndentedString(uniqueSize)).append("\n");
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

