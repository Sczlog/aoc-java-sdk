package com.arcfra.aoc.model;

import java.util.Objects;
import java.util.Arrays;
import com.arcfra.aoc.model.EntityAsyncStatus;
import com.arcfra.aoc.model.NestedCluster;
import com.arcfra.aoc.model.NestedLabel;
import com.arcfra.aoc.model.NestedVmVolume;
import com.arcfra.aoc.model.VmVolumeElfStoragePolicyType;
import com.arcfra.aoc.model.VmVolumeSnapshotType;
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
 * VmVolumeSnapshot
 */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class VmVolumeSnapshot {
  public static final String SERIALIZED_NAME_CLUSTER = "cluster";
  @SerializedName(SERIALIZED_NAME_CLUSTER)
  private NestedCluster cluster;

  public static final String SERIALIZED_NAME_CREATE_AT = "createAt";
  @SerializedName(SERIALIZED_NAME_CREATE_AT)
  private String createAt;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_ELF_STORAGE_POLICY = "elf_storage_policy";
  @SerializedName(SERIALIZED_NAME_ELF_STORAGE_POLICY)
  private VmVolumeElfStoragePolicyType elfStoragePolicy;

  public static final String SERIALIZED_NAME_ENTITY_ASYNC_STATUS = "entityAsyncStatus";
  @SerializedName(SERIALIZED_NAME_ENTITY_ASYNC_STATUS)
  private EntityAsyncStatus entityAsyncStatus;

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

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_SHARED_SIZE = "shared_size";
  @SerializedName(SERIALIZED_NAME_SHARED_SIZE)
  private Double sharedSize;

  public static final String SERIALIZED_NAME_SIZE = "size";
  @SerializedName(SERIALIZED_NAME_SIZE)
  private Double size;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private VmVolumeSnapshotType type;

  public static final String SERIALIZED_NAME_UNIQUE_SIZE = "unique_size";
  @SerializedName(SERIALIZED_NAME_UNIQUE_SIZE)
  private Double uniqueSize;

  public static final String SERIALIZED_NAME_VM_VOLUME = "vm_volume";
  @SerializedName(SERIALIZED_NAME_VM_VOLUME)
  private NestedVmVolume vmVolume;

  public static final String SERIALIZED_NAME_VOLUME_SHARING = "volume_sharing";
  @SerializedName(SERIALIZED_NAME_VOLUME_SHARING)
  private Boolean volumeSharing;

  public static final String SERIALIZED_NAME_VOLUME_SIZE = "volume_size";
  @SerializedName(SERIALIZED_NAME_VOLUME_SIZE)
  private Double volumeSize;

  public static final String SERIALIZED_NAME_ZBS_SNAPSHOT_UUID = "zbs_snapshot_uuid";
  @SerializedName(SERIALIZED_NAME_ZBS_SNAPSHOT_UUID)
  private String zbsSnapshotUuid;

  public VmVolumeSnapshot() { 
  }

  public VmVolumeSnapshot cluster(NestedCluster cluster) {
    
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


  public VmVolumeSnapshot createAt(String createAt) {
    
    this.createAt = createAt;
    return this;
  }

   /**
   * Get createAt
   * @return createAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCreateAt() {
    return createAt;
  }


  public void setCreateAt(String createAt) {
    this.createAt = createAt;
  }


  public VmVolumeSnapshot description(String description) {
    
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


  public VmVolumeSnapshot elfStoragePolicy(VmVolumeElfStoragePolicyType elfStoragePolicy) {
    
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


  public VmVolumeSnapshot entityAsyncStatus(EntityAsyncStatus entityAsyncStatus) {
    
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


  public VmVolumeSnapshot id(String id) {
    
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


  public VmVolumeSnapshot labels(List<NestedLabel> labels) {
    
    this.labels = labels;
    return this;
  }

  public VmVolumeSnapshot addLabelsItem(NestedLabel labelsItem) {
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


  public VmVolumeSnapshot localCreatedAt(String localCreatedAt) {
    
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


  public VmVolumeSnapshot localId(String localId) {
    
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


  public VmVolumeSnapshot name(String name) {
    
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


  public VmVolumeSnapshot sharedSize(Double sharedSize) {
    
    this.sharedSize = sharedSize;
    return this;
  }

   /**
   * Get sharedSize
   * @return sharedSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getSharedSize() {
    return sharedSize;
  }


  public void setSharedSize(Double sharedSize) {
    this.sharedSize = sharedSize;
  }


  public VmVolumeSnapshot size(Double size) {
    
    this.size = size;
    return this;
  }

   /**
   * Get size
   * @return size
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getSize() {
    return size;
  }


  public void setSize(Double size) {
    this.size = size;
  }


  public VmVolumeSnapshot type(VmVolumeSnapshotType type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public VmVolumeSnapshotType getType() {
    return type;
  }


  public void setType(VmVolumeSnapshotType type) {
    this.type = type;
  }


  public VmVolumeSnapshot uniqueSize(Double uniqueSize) {
    
    this.uniqueSize = uniqueSize;
    return this;
  }

   /**
   * Get uniqueSize
   * @return uniqueSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getUniqueSize() {
    return uniqueSize;
  }


  public void setUniqueSize(Double uniqueSize) {
    this.uniqueSize = uniqueSize;
  }


  public VmVolumeSnapshot vmVolume(NestedVmVolume vmVolume) {
    
    this.vmVolume = vmVolume;
    return this;
  }

   /**
   * Get vmVolume
   * @return vmVolume
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public NestedVmVolume getVmVolume() {
    return vmVolume;
  }


  public void setVmVolume(NestedVmVolume vmVolume) {
    this.vmVolume = vmVolume;
  }


  public VmVolumeSnapshot volumeSharing(Boolean volumeSharing) {
    
    this.volumeSharing = volumeSharing;
    return this;
  }

   /**
   * Get volumeSharing
   * @return volumeSharing
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getVolumeSharing() {
    return volumeSharing;
  }


  public void setVolumeSharing(Boolean volumeSharing) {
    this.volumeSharing = volumeSharing;
  }


  public VmVolumeSnapshot volumeSize(Double volumeSize) {
    
    this.volumeSize = volumeSize;
    return this;
  }

   /**
   * Get volumeSize
   * @return volumeSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getVolumeSize() {
    return volumeSize;
  }


  public void setVolumeSize(Double volumeSize) {
    this.volumeSize = volumeSize;
  }


  public VmVolumeSnapshot zbsSnapshotUuid(String zbsSnapshotUuid) {
    
    this.zbsSnapshotUuid = zbsSnapshotUuid;
    return this;
  }

   /**
   * Get zbsSnapshotUuid
   * @return zbsSnapshotUuid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getZbsSnapshotUuid() {
    return zbsSnapshotUuid;
  }


  public void setZbsSnapshotUuid(String zbsSnapshotUuid) {
    this.zbsSnapshotUuid = zbsSnapshotUuid;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VmVolumeSnapshot vmVolumeSnapshot = (VmVolumeSnapshot) o;
    return Objects.equals(this.cluster, vmVolumeSnapshot.cluster) &&
        Objects.equals(this.createAt, vmVolumeSnapshot.createAt) &&
        Objects.equals(this.description, vmVolumeSnapshot.description) &&
        Objects.equals(this.elfStoragePolicy, vmVolumeSnapshot.elfStoragePolicy) &&
        Objects.equals(this.entityAsyncStatus, vmVolumeSnapshot.entityAsyncStatus) &&
        Objects.equals(this.id, vmVolumeSnapshot.id) &&
        Objects.equals(this.labels, vmVolumeSnapshot.labels) &&
        Objects.equals(this.localCreatedAt, vmVolumeSnapshot.localCreatedAt) &&
        Objects.equals(this.localId, vmVolumeSnapshot.localId) &&
        Objects.equals(this.name, vmVolumeSnapshot.name) &&
        Objects.equals(this.sharedSize, vmVolumeSnapshot.sharedSize) &&
        Objects.equals(this.size, vmVolumeSnapshot.size) &&
        Objects.equals(this.type, vmVolumeSnapshot.type) &&
        Objects.equals(this.uniqueSize, vmVolumeSnapshot.uniqueSize) &&
        Objects.equals(this.vmVolume, vmVolumeSnapshot.vmVolume) &&
        Objects.equals(this.volumeSharing, vmVolumeSnapshot.volumeSharing) &&
        Objects.equals(this.volumeSize, vmVolumeSnapshot.volumeSize) &&
        Objects.equals(this.zbsSnapshotUuid, vmVolumeSnapshot.zbsSnapshotUuid);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(cluster, createAt, description, elfStoragePolicy, entityAsyncStatus, id, labels, localCreatedAt, localId, name, sharedSize, size, type, uniqueSize, vmVolume, volumeSharing, volumeSize, zbsSnapshotUuid);
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
    sb.append("class VmVolumeSnapshot {\n");
    sb.append("    cluster: ").append(toIndentedString(cluster)).append("\n");
    sb.append("    createAt: ").append(toIndentedString(createAt)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    elfStoragePolicy: ").append(toIndentedString(elfStoragePolicy)).append("\n");
    sb.append("    entityAsyncStatus: ").append(toIndentedString(entityAsyncStatus)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    localCreatedAt: ").append(toIndentedString(localCreatedAt)).append("\n");
    sb.append("    localId: ").append(toIndentedString(localId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    sharedSize: ").append(toIndentedString(sharedSize)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    uniqueSize: ").append(toIndentedString(uniqueSize)).append("\n");
    sb.append("    vmVolume: ").append(toIndentedString(vmVolume)).append("\n");
    sb.append("    volumeSharing: ").append(toIndentedString(volumeSharing)).append("\n");
    sb.append("    volumeSize: ").append(toIndentedString(volumeSize)).append("\n");
    sb.append("    zbsSnapshotUuid: ").append(toIndentedString(zbsSnapshotUuid)).append("\n");
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

