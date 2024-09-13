package com.arcfra.aoc.model;

import java.util.Objects;
import java.util.Arrays;
import com.arcfra.aoc.model.EntityAsyncStatus;
import com.arcfra.aoc.model.GpuDeviceStatus;
import com.arcfra.aoc.model.GpuDeviceUsage;
import com.arcfra.aoc.model.NestedGpuDriverInfo;
import com.arcfra.aoc.model.NestedHost;
import com.arcfra.aoc.model.NestedLabel;
import com.arcfra.aoc.model.NestedVgpuType;
import com.arcfra.aoc.model.NestedVm;
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
 * GpuDevice
 */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class GpuDevice {
  public static final String SERIALIZED_NAME_ASSIGNED_VGPUS_NUM = "assigned_vgpus_num";
  @SerializedName(SERIALIZED_NAME_ASSIGNED_VGPUS_NUM)
  private Integer assignedVgpusNum;

  public static final String SERIALIZED_NAME_AVAILABLE_VGPUS_NUM = "available_vgpus_num";
  @SerializedName(SERIALIZED_NAME_AVAILABLE_VGPUS_NUM)
  private Integer availableVgpusNum;

  public static final String SERIALIZED_NAME_BRAND = "brand";
  @SerializedName(SERIALIZED_NAME_BRAND)
  private String brand;

  public static final String SERIALIZED_NAME_BUS_LOCATION = "bus_location";
  @SerializedName(SERIALIZED_NAME_BUS_LOCATION)
  private String busLocation;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_DRIVER_INFO = "driver_info";
  @SerializedName(SERIALIZED_NAME_DRIVER_INFO)
  private NestedGpuDriverInfo driverInfo;

  public static final String SERIALIZED_NAME_ENTITY_ASYNC_STATUS = "entityAsyncStatus";
  @SerializedName(SERIALIZED_NAME_ENTITY_ASYNC_STATUS)
  private EntityAsyncStatus entityAsyncStatus;

  public static final String SERIALIZED_NAME_HOST = "host";
  @SerializedName(SERIALIZED_NAME_HOST)
  private NestedHost host;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_IS_NVIDIA_TOOLS_READY = "is_nvidia_tools_ready";
  @SerializedName(SERIALIZED_NAME_IS_NVIDIA_TOOLS_READY)
  private Boolean isNvidiaToolsReady;

  public static final String SERIALIZED_NAME_IS_NVIDIA_VFS_ENABLED = "is_nvidia_vfs_enabled";
  @SerializedName(SERIALIZED_NAME_IS_NVIDIA_VFS_ENABLED)
  private Boolean isNvidiaVfsEnabled;

  public static final String SERIALIZED_NAME_IS_NVIDIA_VFS_SUPPORTED = "is_nvidia_vfs_supported";
  @SerializedName(SERIALIZED_NAME_IS_NVIDIA_VFS_SUPPORTED)
  private Boolean isNvidiaVfsSupported;

  public static final String SERIALIZED_NAME_LABELS = "labels";
  @SerializedName(SERIALIZED_NAME_LABELS)
  private List<NestedLabel> labels = null;

  public static final String SERIALIZED_NAME_LOCAL_CREATED_AT = "local_created_at";
  @SerializedName(SERIALIZED_NAME_LOCAL_CREATED_AT)
  private String localCreatedAt;

  public static final String SERIALIZED_NAME_LOCAL_ID = "local_id";
  @SerializedName(SERIALIZED_NAME_LOCAL_ID)
  private String localId;

  public static final String SERIALIZED_NAME_MDEV_SUPPORTED_TYPES = "mdev_supported_types";
  @SerializedName(SERIALIZED_NAME_MDEV_SUPPORTED_TYPES)
  private List<NestedVgpuType> mdevSupportedTypes = null;

  public static final String SERIALIZED_NAME_MODEL = "model";
  @SerializedName(SERIALIZED_NAME_MODEL)
  private String model;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private GpuDeviceStatus status;

  public static final String SERIALIZED_NAME_USER_USAGE = "user_usage";
  @SerializedName(SERIALIZED_NAME_USER_USAGE)
  private GpuDeviceUsage userUsage;

  public static final String SERIALIZED_NAME_USER_VGPU_TYPE_ID = "user_vgpu_type_id";
  @SerializedName(SERIALIZED_NAME_USER_VGPU_TYPE_ID)
  private String userVgpuTypeId;

  public static final String SERIALIZED_NAME_USER_VGPU_TYPE_NAME = "user_vgpu_type_name";
  @SerializedName(SERIALIZED_NAME_USER_VGPU_TYPE_NAME)
  private String userVgpuTypeName;

  public static final String SERIALIZED_NAME_VGPU_INSTANCE_NUM = "vgpu_instance_num";
  @SerializedName(SERIALIZED_NAME_VGPU_INSTANCE_NUM)
  private Integer vgpuInstanceNum;

  public static final String SERIALIZED_NAME_VMS = "vms";
  @SerializedName(SERIALIZED_NAME_VMS)
  private List<NestedVm> vms = null;

  public GpuDevice() { 
  }

  public GpuDevice assignedVgpusNum(Integer assignedVgpusNum) {
    
    this.assignedVgpusNum = assignedVgpusNum;
    return this;
  }

   /**
   * Get assignedVgpusNum
   * @return assignedVgpusNum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getAssignedVgpusNum() {
    return assignedVgpusNum;
  }


  public void setAssignedVgpusNum(Integer assignedVgpusNum) {
    this.assignedVgpusNum = assignedVgpusNum;
  }


  public GpuDevice availableVgpusNum(Integer availableVgpusNum) {
    
    this.availableVgpusNum = availableVgpusNum;
    return this;
  }

   /**
   * Get availableVgpusNum
   * @return availableVgpusNum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getAvailableVgpusNum() {
    return availableVgpusNum;
  }


  public void setAvailableVgpusNum(Integer availableVgpusNum) {
    this.availableVgpusNum = availableVgpusNum;
  }


  public GpuDevice brand(String brand) {
    
    this.brand = brand;
    return this;
  }

   /**
   * Get brand
   * @return brand
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getBrand() {
    return brand;
  }


  public void setBrand(String brand) {
    this.brand = brand;
  }


  public GpuDevice busLocation(String busLocation) {
    
    this.busLocation = busLocation;
    return this;
  }

   /**
   * Get busLocation
   * @return busLocation
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getBusLocation() {
    return busLocation;
  }


  public void setBusLocation(String busLocation) {
    this.busLocation = busLocation;
  }


  public GpuDevice description(String description) {
    
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


  public GpuDevice driverInfo(NestedGpuDriverInfo driverInfo) {
    
    this.driverInfo = driverInfo;
    return this;
  }

   /**
   * Get driverInfo
   * @return driverInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public NestedGpuDriverInfo getDriverInfo() {
    return driverInfo;
  }


  public void setDriverInfo(NestedGpuDriverInfo driverInfo) {
    this.driverInfo = driverInfo;
  }


  public GpuDevice entityAsyncStatus(EntityAsyncStatus entityAsyncStatus) {
    
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


  public GpuDevice host(NestedHost host) {
    
    this.host = host;
    return this;
  }

   /**
   * Get host
   * @return host
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public NestedHost getHost() {
    return host;
  }


  public void setHost(NestedHost host) {
    this.host = host;
  }


  public GpuDevice id(String id) {
    
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


  public GpuDevice isNvidiaToolsReady(Boolean isNvidiaToolsReady) {
    
    this.isNvidiaToolsReady = isNvidiaToolsReady;
    return this;
  }

   /**
   * Get isNvidiaToolsReady
   * @return isNvidiaToolsReady
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsNvidiaToolsReady() {
    return isNvidiaToolsReady;
  }


  public void setIsNvidiaToolsReady(Boolean isNvidiaToolsReady) {
    this.isNvidiaToolsReady = isNvidiaToolsReady;
  }


  public GpuDevice isNvidiaVfsEnabled(Boolean isNvidiaVfsEnabled) {
    
    this.isNvidiaVfsEnabled = isNvidiaVfsEnabled;
    return this;
  }

   /**
   * Get isNvidiaVfsEnabled
   * @return isNvidiaVfsEnabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsNvidiaVfsEnabled() {
    return isNvidiaVfsEnabled;
  }


  public void setIsNvidiaVfsEnabled(Boolean isNvidiaVfsEnabled) {
    this.isNvidiaVfsEnabled = isNvidiaVfsEnabled;
  }


  public GpuDevice isNvidiaVfsSupported(Boolean isNvidiaVfsSupported) {
    
    this.isNvidiaVfsSupported = isNvidiaVfsSupported;
    return this;
  }

   /**
   * Get isNvidiaVfsSupported
   * @return isNvidiaVfsSupported
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsNvidiaVfsSupported() {
    return isNvidiaVfsSupported;
  }


  public void setIsNvidiaVfsSupported(Boolean isNvidiaVfsSupported) {
    this.isNvidiaVfsSupported = isNvidiaVfsSupported;
  }


  public GpuDevice labels(List<NestedLabel> labels) {
    
    this.labels = labels;
    return this;
  }

  public GpuDevice addLabelsItem(NestedLabel labelsItem) {
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


  public GpuDevice localCreatedAt(String localCreatedAt) {
    
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


  public GpuDevice localId(String localId) {
    
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


  public GpuDevice mdevSupportedTypes(List<NestedVgpuType> mdevSupportedTypes) {
    
    this.mdevSupportedTypes = mdevSupportedTypes;
    return this;
  }

  public GpuDevice addMdevSupportedTypesItem(NestedVgpuType mdevSupportedTypesItem) {
    if (this.mdevSupportedTypes == null) {
      this.mdevSupportedTypes = new ArrayList<NestedVgpuType>();
    }
    this.mdevSupportedTypes.add(mdevSupportedTypesItem);
    return this;
  }

   /**
   * Get mdevSupportedTypes
   * @return mdevSupportedTypes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<NestedVgpuType> getMdevSupportedTypes() {
    return mdevSupportedTypes;
  }


  public void setMdevSupportedTypes(List<NestedVgpuType> mdevSupportedTypes) {
    this.mdevSupportedTypes = mdevSupportedTypes;
  }


  public GpuDevice model(String model) {
    
    this.model = model;
    return this;
  }

   /**
   * Get model
   * @return model
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getModel() {
    return model;
  }


  public void setModel(String model) {
    this.model = model;
  }


  public GpuDevice name(String name) {
    
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


  public GpuDevice status(GpuDeviceStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public GpuDeviceStatus getStatus() {
    return status;
  }


  public void setStatus(GpuDeviceStatus status) {
    this.status = status;
  }


  public GpuDevice userUsage(GpuDeviceUsage userUsage) {
    
    this.userUsage = userUsage;
    return this;
  }

   /**
   * Get userUsage
   * @return userUsage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GpuDeviceUsage getUserUsage() {
    return userUsage;
  }


  public void setUserUsage(GpuDeviceUsage userUsage) {
    this.userUsage = userUsage;
  }


  public GpuDevice userVgpuTypeId(String userVgpuTypeId) {
    
    this.userVgpuTypeId = userVgpuTypeId;
    return this;
  }

   /**
   * Get userVgpuTypeId
   * @return userVgpuTypeId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUserVgpuTypeId() {
    return userVgpuTypeId;
  }


  public void setUserVgpuTypeId(String userVgpuTypeId) {
    this.userVgpuTypeId = userVgpuTypeId;
  }


  public GpuDevice userVgpuTypeName(String userVgpuTypeName) {
    
    this.userVgpuTypeName = userVgpuTypeName;
    return this;
  }

   /**
   * Get userVgpuTypeName
   * @return userVgpuTypeName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUserVgpuTypeName() {
    return userVgpuTypeName;
  }


  public void setUserVgpuTypeName(String userVgpuTypeName) {
    this.userVgpuTypeName = userVgpuTypeName;
  }


  public GpuDevice vgpuInstanceNum(Integer vgpuInstanceNum) {
    
    this.vgpuInstanceNum = vgpuInstanceNum;
    return this;
  }

   /**
   * Get vgpuInstanceNum
   * @return vgpuInstanceNum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getVgpuInstanceNum() {
    return vgpuInstanceNum;
  }


  public void setVgpuInstanceNum(Integer vgpuInstanceNum) {
    this.vgpuInstanceNum = vgpuInstanceNum;
  }


  public GpuDevice vms(List<NestedVm> vms) {
    
    this.vms = vms;
    return this;
  }

  public GpuDevice addVmsItem(NestedVm vmsItem) {
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
    GpuDevice gpuDevice = (GpuDevice) o;
    return Objects.equals(this.assignedVgpusNum, gpuDevice.assignedVgpusNum) &&
        Objects.equals(this.availableVgpusNum, gpuDevice.availableVgpusNum) &&
        Objects.equals(this.brand, gpuDevice.brand) &&
        Objects.equals(this.busLocation, gpuDevice.busLocation) &&
        Objects.equals(this.description, gpuDevice.description) &&
        Objects.equals(this.driverInfo, gpuDevice.driverInfo) &&
        Objects.equals(this.entityAsyncStatus, gpuDevice.entityAsyncStatus) &&
        Objects.equals(this.host, gpuDevice.host) &&
        Objects.equals(this.id, gpuDevice.id) &&
        Objects.equals(this.isNvidiaToolsReady, gpuDevice.isNvidiaToolsReady) &&
        Objects.equals(this.isNvidiaVfsEnabled, gpuDevice.isNvidiaVfsEnabled) &&
        Objects.equals(this.isNvidiaVfsSupported, gpuDevice.isNvidiaVfsSupported) &&
        Objects.equals(this.labels, gpuDevice.labels) &&
        Objects.equals(this.localCreatedAt, gpuDevice.localCreatedAt) &&
        Objects.equals(this.localId, gpuDevice.localId) &&
        Objects.equals(this.mdevSupportedTypes, gpuDevice.mdevSupportedTypes) &&
        Objects.equals(this.model, gpuDevice.model) &&
        Objects.equals(this.name, gpuDevice.name) &&
        Objects.equals(this.status, gpuDevice.status) &&
        Objects.equals(this.userUsage, gpuDevice.userUsage) &&
        Objects.equals(this.userVgpuTypeId, gpuDevice.userVgpuTypeId) &&
        Objects.equals(this.userVgpuTypeName, gpuDevice.userVgpuTypeName) &&
        Objects.equals(this.vgpuInstanceNum, gpuDevice.vgpuInstanceNum) &&
        Objects.equals(this.vms, gpuDevice.vms);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(assignedVgpusNum, availableVgpusNum, brand, busLocation, description, driverInfo, entityAsyncStatus, host, id, isNvidiaToolsReady, isNvidiaVfsEnabled, isNvidiaVfsSupported, labels, localCreatedAt, localId, mdevSupportedTypes, model, name, status, userUsage, userVgpuTypeId, userVgpuTypeName, vgpuInstanceNum, vms);
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
    sb.append("class GpuDevice {\n");
    sb.append("    assignedVgpusNum: ").append(toIndentedString(assignedVgpusNum)).append("\n");
    sb.append("    availableVgpusNum: ").append(toIndentedString(availableVgpusNum)).append("\n");
    sb.append("    brand: ").append(toIndentedString(brand)).append("\n");
    sb.append("    busLocation: ").append(toIndentedString(busLocation)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    driverInfo: ").append(toIndentedString(driverInfo)).append("\n");
    sb.append("    entityAsyncStatus: ").append(toIndentedString(entityAsyncStatus)).append("\n");
    sb.append("    host: ").append(toIndentedString(host)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isNvidiaToolsReady: ").append(toIndentedString(isNvidiaToolsReady)).append("\n");
    sb.append("    isNvidiaVfsEnabled: ").append(toIndentedString(isNvidiaVfsEnabled)).append("\n");
    sb.append("    isNvidiaVfsSupported: ").append(toIndentedString(isNvidiaVfsSupported)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    localCreatedAt: ").append(toIndentedString(localCreatedAt)).append("\n");
    sb.append("    localId: ").append(toIndentedString(localId)).append("\n");
    sb.append("    mdevSupportedTypes: ").append(toIndentedString(mdevSupportedTypes)).append("\n");
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    userUsage: ").append(toIndentedString(userUsage)).append("\n");
    sb.append("    userVgpuTypeId: ").append(toIndentedString(userVgpuTypeId)).append("\n");
    sb.append("    userVgpuTypeName: ").append(toIndentedString(userVgpuTypeName)).append("\n");
    sb.append("    vgpuInstanceNum: ").append(toIndentedString(vgpuInstanceNum)).append("\n");
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

