package com.arcfra.aoc.model;

import java.util.Objects;
import java.util.Arrays;
import com.arcfra.aoc.model.CpuFanSpeedUnit;
import com.arcfra.aoc.model.EntityAsyncStatus;
import com.arcfra.aoc.model.HostState;
import com.arcfra.aoc.model.HostStatus;
import com.arcfra.aoc.model.IommuStatus;
import com.arcfra.aoc.model.NestedCluster;
import com.arcfra.aoc.model.NestedGpuDevice;
import com.arcfra.aoc.model.NestedLabel;
import com.arcfra.aoc.model.NestedMaintenanceHostState;
import com.arcfra.aoc.model.NestedNic;
import com.arcfra.aoc.model.NestedUsbDevice;
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
 * Host
 */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class Host {
  public static final String SERIALIZED_NAME_ACCESS_IP = "access_ip";
  @SerializedName(SERIALIZED_NAME_ACCESS_IP)
  private String accessIp;

  public static final String SERIALIZED_NAME_ALLOCABLE_CPU_CORES_FOR_VM_EXCLUSIVE = "allocable_cpu_cores_for_vm_exclusive";
  @SerializedName(SERIALIZED_NAME_ALLOCABLE_CPU_CORES_FOR_VM_EXCLUSIVE)
  private Integer allocableCpuCoresForVmExclusive;

  public static final String SERIALIZED_NAME_ALLOCATABLE_MEMORY_BYTES = "allocatable_memory_bytes";
  @SerializedName(SERIALIZED_NAME_ALLOCATABLE_MEMORY_BYTES)
  private Long allocatableMemoryBytes;

  public static final String SERIALIZED_NAME_CHUNK_ID = "chunk_id";
  @SerializedName(SERIALIZED_NAME_CHUNK_ID)
  private String chunkId;

  public static final String SERIALIZED_NAME_CLUSTER = "cluster";
  @SerializedName(SERIALIZED_NAME_CLUSTER)
  private NestedCluster cluster;

  public static final String SERIALIZED_NAME_COMPATIBLE_CPU_MODELS = "compatible_cpu_models";
  @SerializedName(SERIALIZED_NAME_COMPATIBLE_CPU_MODELS)
  private List<String> compatibleCpuModels = new ArrayList<String>();

  public static final String SERIALIZED_NAME_CPU_BRAND = "cpu_brand";
  @SerializedName(SERIALIZED_NAME_CPU_BRAND)
  private String cpuBrand;

  public static final String SERIALIZED_NAME_CPU_FAN_SPEED = "cpu_fan_speed";
  @SerializedName(SERIALIZED_NAME_CPU_FAN_SPEED)
  private List<Double> cpuFanSpeed = new ArrayList<Double>();

  public static final String SERIALIZED_NAME_CPU_FAN_SPEED_UNIT = "cpu_fan_speed_unit";
  @SerializedName(SERIALIZED_NAME_CPU_FAN_SPEED_UNIT)
  private CpuFanSpeedUnit cpuFanSpeedUnit;

  public static final String SERIALIZED_NAME_CPU_HZ_PER_CORE = "cpu_hz_per_core";
  @SerializedName(SERIALIZED_NAME_CPU_HZ_PER_CORE)
  private Long cpuHzPerCore;

  public static final String SERIALIZED_NAME_CPU_MODEL = "cpu_model";
  @SerializedName(SERIALIZED_NAME_CPU_MODEL)
  private String cpuModel;

  public static final String SERIALIZED_NAME_CPU_TEMPERATURE_CELSIUS = "cpu_temperature_celsius";
  @SerializedName(SERIALIZED_NAME_CPU_TEMPERATURE_CELSIUS)
  private List<Integer> cpuTemperatureCelsius = new ArrayList<Integer>();

  public static final String SERIALIZED_NAME_CPU_VENDOR = "cpu_vendor";
  @SerializedName(SERIALIZED_NAME_CPU_VENDOR)
  private String cpuVendor;

  public static final String SERIALIZED_NAME_DATA_IP = "data_ip";
  @SerializedName(SERIALIZED_NAME_DATA_IP)
  private String dataIp;

  public static final String SERIALIZED_NAME_ENTITY_ASYNC_STATUS = "entityAsyncStatus";
  @SerializedName(SERIALIZED_NAME_ENTITY_ASYNC_STATUS)
  private EntityAsyncStatus entityAsyncStatus;

  public static final String SERIALIZED_NAME_FAILURE_DATA_SPACE = "failure_data_space";
  @SerializedName(SERIALIZED_NAME_FAILURE_DATA_SPACE)
  private Long failureDataSpace;

  public static final String SERIALIZED_NAME_GPU_DEVICES = "gpu_devices";
  @SerializedName(SERIALIZED_NAME_GPU_DEVICES)
  private List<NestedGpuDevice> gpuDevices = null;

  public static final String SERIALIZED_NAME_HDD_DATA_CAPACITY = "hdd_data_capacity";
  @SerializedName(SERIALIZED_NAME_HDD_DATA_CAPACITY)
  private Long hddDataCapacity;

  public static final String SERIALIZED_NAME_HDD_DISK_COUNT = "hdd_disk_count";
  @SerializedName(SERIALIZED_NAME_HDD_DISK_COUNT)
  private Integer hddDiskCount;

  public static final String SERIALIZED_NAME_HOST_STATE = "host_state";
  @SerializedName(SERIALIZED_NAME_HOST_STATE)
  private NestedMaintenanceHostState hostState;

  public static final String SERIALIZED_NAME_HYPERVISOR_IP = "hypervisor_ip";
  @SerializedName(SERIALIZED_NAME_HYPERVISOR_IP)
  private String hypervisorIp;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_IOMMU = "iommu";
  @SerializedName(SERIALIZED_NAME_IOMMU)
  private IommuStatus iommu;

  public static final String SERIALIZED_NAME_IS_OS_IN_RAID1 = "is_os_in_raid1";
  @SerializedName(SERIALIZED_NAME_IS_OS_IN_RAID1)
  private Boolean isOsInRaid1;

  public static final String SERIALIZED_NAME_LABELS = "labels";
  @SerializedName(SERIALIZED_NAME_LABELS)
  private List<NestedLabel> labels = null;

  public static final String SERIALIZED_NAME_LOCAL_ID = "local_id";
  @SerializedName(SERIALIZED_NAME_LOCAL_ID)
  private String localId;

  public static final String SERIALIZED_NAME_LSM_CAP_DISK_SAFE_UMOUNT = "lsm_cap_disk_safe_umount";
  @SerializedName(SERIALIZED_NAME_LSM_CAP_DISK_SAFE_UMOUNT)
  private Boolean lsmCapDiskSafeUmount;

  public static final String SERIALIZED_NAME_MANAGEMENT_IP = "management_ip";
  @SerializedName(SERIALIZED_NAME_MANAGEMENT_IP)
  private String managementIp;

  public static final String SERIALIZED_NAME_MODEL = "model";
  @SerializedName(SERIALIZED_NAME_MODEL)
  private String model;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NESTED_VIRTUALIZATION = "nested_virtualization";
  @SerializedName(SERIALIZED_NAME_NESTED_VIRTUALIZATION)
  private Boolean nestedVirtualization;

  public static final String SERIALIZED_NAME_NIC_COUNT = "nic_count";
  @SerializedName(SERIALIZED_NAME_NIC_COUNT)
  private Integer nicCount;

  public static final String SERIALIZED_NAME_NICS = "nics";
  @SerializedName(SERIALIZED_NAME_NICS)
  private List<NestedNic> nics = null;

  public static final String SERIALIZED_NAME_NODE_TOPO_LOCAL_ID = "node_topo_local_id";
  @SerializedName(SERIALIZED_NAME_NODE_TOPO_LOCAL_ID)
  private String nodeTopoLocalId;

  public static final String SERIALIZED_NAME_OS_MEMORY_BYTES = "os_memory_bytes";
  @SerializedName(SERIALIZED_NAME_OS_MEMORY_BYTES)
  private Long osMemoryBytes;

  public static final String SERIALIZED_NAME_OS_VERSION = "os_version";
  @SerializedName(SERIALIZED_NAME_OS_VERSION)
  private String osVersion;

  public static final String SERIALIZED_NAME_PMEM_DIMM_CAPACITY = "pmem_dimm_capacity";
  @SerializedName(SERIALIZED_NAME_PMEM_DIMM_CAPACITY)
  private Long pmemDimmCapacity;

  public static final String SERIALIZED_NAME_PMEM_DIMM_COUNT = "pmem_dimm_count";
  @SerializedName(SERIALIZED_NAME_PMEM_DIMM_COUNT)
  private Integer pmemDimmCount;

  public static final String SERIALIZED_NAME_PMEM_DISK_COUNT = "pmem_disk_count";
  @SerializedName(SERIALIZED_NAME_PMEM_DISK_COUNT)
  private Integer pmemDiskCount;

  public static final String SERIALIZED_NAME_PROVISIONED_CPU_CORES = "provisioned_cpu_cores";
  @SerializedName(SERIALIZED_NAME_PROVISIONED_CPU_CORES)
  private Integer provisionedCpuCores;

  public static final String SERIALIZED_NAME_PROVISIONED_MEMORY_BYTES = "provisioned_memory_bytes";
  @SerializedName(SERIALIZED_NAME_PROVISIONED_MEMORY_BYTES)
  private Long provisionedMemoryBytes;

  public static final String SERIALIZED_NAME_RUNNING_PAUSE_VM_MEMORY_BYTES = "running_pause_vm_memory_bytes";
  @SerializedName(SERIALIZED_NAME_RUNNING_PAUSE_VM_MEMORY_BYTES)
  private Long runningPauseVmMemoryBytes;

  public static final String SERIALIZED_NAME_RUNNING_VM_NUM = "running_vm_num";
  @SerializedName(SERIALIZED_NAME_RUNNING_VM_NUM)
  private Integer runningVmNum;

  public static final String SERIALIZED_NAME_SCVM_CPU = "scvm_cpu";
  @SerializedName(SERIALIZED_NAME_SCVM_CPU)
  private Integer scvmCpu;

  public static final String SERIALIZED_NAME_SCVM_MEMORY = "scvm_memory";
  @SerializedName(SERIALIZED_NAME_SCVM_MEMORY)
  private Long scvmMemory;

  public static final String SERIALIZED_NAME_SCVM_NAME = "scvm_name";
  @SerializedName(SERIALIZED_NAME_SCVM_NAME)
  private String scvmName;

  public static final String SERIALIZED_NAME_SERIAL = "serial";
  @SerializedName(SERIALIZED_NAME_SERIAL)
  private String serial;

  public static final String SERIALIZED_NAME_SSD_DATA_CAPACITY = "ssd_data_capacity";
  @SerializedName(SERIALIZED_NAME_SSD_DATA_CAPACITY)
  private Long ssdDataCapacity;

  public static final String SERIALIZED_NAME_SSD_DISK_COUNT = "ssd_disk_count";
  @SerializedName(SERIALIZED_NAME_SSD_DISK_COUNT)
  private Integer ssdDiskCount;

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private HostState state;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private HostStatus status;

  public static final String SERIALIZED_NAME_STOPPED_VM_NUM = "stopped_vm_num";
  @SerializedName(SERIALIZED_NAME_STOPPED_VM_NUM)
  private Integer stoppedVmNum;

  public static final String SERIALIZED_NAME_SUSPENDED_VM_NUM = "suspended_vm_num";
  @SerializedName(SERIALIZED_NAME_SUSPENDED_VM_NUM)
  private Integer suspendedVmNum;

  public static final String SERIALIZED_NAME_TOTAL_CACHE_CAPACITY = "total_cache_capacity";
  @SerializedName(SERIALIZED_NAME_TOTAL_CACHE_CAPACITY)
  private Long totalCacheCapacity;

  public static final String SERIALIZED_NAME_TOTAL_CPU_CORES = "total_cpu_cores";
  @SerializedName(SERIALIZED_NAME_TOTAL_CPU_CORES)
  private Integer totalCpuCores;

  public static final String SERIALIZED_NAME_TOTAL_CPU_HZ = "total_cpu_hz";
  @SerializedName(SERIALIZED_NAME_TOTAL_CPU_HZ)
  private Long totalCpuHz;

  public static final String SERIALIZED_NAME_TOTAL_CPU_SOCKETS = "total_cpu_sockets";
  @SerializedName(SERIALIZED_NAME_TOTAL_CPU_SOCKETS)
  private Integer totalCpuSockets;

  public static final String SERIALIZED_NAME_TOTAL_DATA_CAPACITY = "total_data_capacity";
  @SerializedName(SERIALIZED_NAME_TOTAL_DATA_CAPACITY)
  private Long totalDataCapacity;

  public static final String SERIALIZED_NAME_TOTAL_MEMORY_BYTES = "total_memory_bytes";
  @SerializedName(SERIALIZED_NAME_TOTAL_MEMORY_BYTES)
  private Long totalMemoryBytes;

  public static final String SERIALIZED_NAME_USB_DEVICES = "usb_devices";
  @SerializedName(SERIALIZED_NAME_USB_DEVICES)
  private List<NestedUsbDevice> usbDevices = null;

  public static final String SERIALIZED_NAME_USED_CPU_HZ = "used_cpu_hz";
  @SerializedName(SERIALIZED_NAME_USED_CPU_HZ)
  private Double usedCpuHz;

  public static final String SERIALIZED_NAME_USED_DATA_SPACE = "used_data_space";
  @SerializedName(SERIALIZED_NAME_USED_DATA_SPACE)
  private Long usedDataSpace;

  public static final String SERIALIZED_NAME_USED_MEMORY_BYTES = "used_memory_bytes";
  @SerializedName(SERIALIZED_NAME_USED_MEMORY_BYTES)
  private Double usedMemoryBytes;

  public static final String SERIALIZED_NAME_VM_NUM = "vm_num";
  @SerializedName(SERIALIZED_NAME_VM_NUM)
  private Integer vmNum;

  public static final String SERIALIZED_NAME_VMOTION_IP = "vmotion_ip";
  @SerializedName(SERIALIZED_NAME_VMOTION_IP)
  private String vmotionIp;

  public static final String SERIALIZED_NAME_VMS = "vms";
  @SerializedName(SERIALIZED_NAME_VMS)
  private List<NestedVm> vms = null;

  public static final String SERIALIZED_NAME_WITH_FASTER_SSD_AS_CACHE = "with_faster_ssd_as_cache";
  @SerializedName(SERIALIZED_NAME_WITH_FASTER_SSD_AS_CACHE)
  private Boolean withFasterSsdAsCache;

  public Host() { 
  }

  public Host accessIp(String accessIp) {
    
    this.accessIp = accessIp;
    return this;
  }

   /**
   * Get accessIp
   * @return accessIp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAccessIp() {
    return accessIp;
  }


  public void setAccessIp(String accessIp) {
    this.accessIp = accessIp;
  }


  public Host allocableCpuCoresForVmExclusive(Integer allocableCpuCoresForVmExclusive) {
    
    this.allocableCpuCoresForVmExclusive = allocableCpuCoresForVmExclusive;
    return this;
  }

   /**
   * Get allocableCpuCoresForVmExclusive
   * @return allocableCpuCoresForVmExclusive
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getAllocableCpuCoresForVmExclusive() {
    return allocableCpuCoresForVmExclusive;
  }


  public void setAllocableCpuCoresForVmExclusive(Integer allocableCpuCoresForVmExclusive) {
    this.allocableCpuCoresForVmExclusive = allocableCpuCoresForVmExclusive;
  }


  public Host allocatableMemoryBytes(Long allocatableMemoryBytes) {
    
    this.allocatableMemoryBytes = allocatableMemoryBytes;
    return this;
  }

   /**
   * Get allocatableMemoryBytes
   * @return allocatableMemoryBytes
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Long getAllocatableMemoryBytes() {
    return allocatableMemoryBytes;
  }


  public void setAllocatableMemoryBytes(Long allocatableMemoryBytes) {
    this.allocatableMemoryBytes = allocatableMemoryBytes;
  }


  public Host chunkId(String chunkId) {
    
    this.chunkId = chunkId;
    return this;
  }

   /**
   * Get chunkId
   * @return chunkId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getChunkId() {
    return chunkId;
  }


  public void setChunkId(String chunkId) {
    this.chunkId = chunkId;
  }


  public Host cluster(NestedCluster cluster) {
    
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


  public Host compatibleCpuModels(List<String> compatibleCpuModels) {
    
    this.compatibleCpuModels = compatibleCpuModels;
    return this;
  }

  public Host addCompatibleCpuModelsItem(String compatibleCpuModelsItem) {
    this.compatibleCpuModels.add(compatibleCpuModelsItem);
    return this;
  }

   /**
   * Get compatibleCpuModels
   * @return compatibleCpuModels
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<String> getCompatibleCpuModels() {
    return compatibleCpuModels;
  }


  public void setCompatibleCpuModels(List<String> compatibleCpuModels) {
    this.compatibleCpuModels = compatibleCpuModels;
  }


  public Host cpuBrand(String cpuBrand) {
    
    this.cpuBrand = cpuBrand;
    return this;
  }

   /**
   * Get cpuBrand
   * @return cpuBrand
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getCpuBrand() {
    return cpuBrand;
  }


  public void setCpuBrand(String cpuBrand) {
    this.cpuBrand = cpuBrand;
  }


  public Host cpuFanSpeed(List<Double> cpuFanSpeed) {
    
    this.cpuFanSpeed = cpuFanSpeed;
    return this;
  }

  public Host addCpuFanSpeedItem(Double cpuFanSpeedItem) {
    this.cpuFanSpeed.add(cpuFanSpeedItem);
    return this;
  }

   /**
   * Get cpuFanSpeed
   * @return cpuFanSpeed
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<Double> getCpuFanSpeed() {
    return cpuFanSpeed;
  }


  public void setCpuFanSpeed(List<Double> cpuFanSpeed) {
    this.cpuFanSpeed = cpuFanSpeed;
  }


  public Host cpuFanSpeedUnit(CpuFanSpeedUnit cpuFanSpeedUnit) {
    
    this.cpuFanSpeedUnit = cpuFanSpeedUnit;
    return this;
  }

   /**
   * Get cpuFanSpeedUnit
   * @return cpuFanSpeedUnit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CpuFanSpeedUnit getCpuFanSpeedUnit() {
    return cpuFanSpeedUnit;
  }


  public void setCpuFanSpeedUnit(CpuFanSpeedUnit cpuFanSpeedUnit) {
    this.cpuFanSpeedUnit = cpuFanSpeedUnit;
  }


  public Host cpuHzPerCore(Long cpuHzPerCore) {
    
    this.cpuHzPerCore = cpuHzPerCore;
    return this;
  }

   /**
   * Get cpuHzPerCore
   * @return cpuHzPerCore
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Long getCpuHzPerCore() {
    return cpuHzPerCore;
  }


  public void setCpuHzPerCore(Long cpuHzPerCore) {
    this.cpuHzPerCore = cpuHzPerCore;
  }


  public Host cpuModel(String cpuModel) {
    
    this.cpuModel = cpuModel;
    return this;
  }

   /**
   * Get cpuModel
   * @return cpuModel
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getCpuModel() {
    return cpuModel;
  }


  public void setCpuModel(String cpuModel) {
    this.cpuModel = cpuModel;
  }


  public Host cpuTemperatureCelsius(List<Integer> cpuTemperatureCelsius) {
    
    this.cpuTemperatureCelsius = cpuTemperatureCelsius;
    return this;
  }

  public Host addCpuTemperatureCelsiusItem(Integer cpuTemperatureCelsiusItem) {
    this.cpuTemperatureCelsius.add(cpuTemperatureCelsiusItem);
    return this;
  }

   /**
   * Get cpuTemperatureCelsius
   * @return cpuTemperatureCelsius
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<Integer> getCpuTemperatureCelsius() {
    return cpuTemperatureCelsius;
  }


  public void setCpuTemperatureCelsius(List<Integer> cpuTemperatureCelsius) {
    this.cpuTemperatureCelsius = cpuTemperatureCelsius;
  }


  public Host cpuVendor(String cpuVendor) {
    
    this.cpuVendor = cpuVendor;
    return this;
  }

   /**
   * Get cpuVendor
   * @return cpuVendor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCpuVendor() {
    return cpuVendor;
  }


  public void setCpuVendor(String cpuVendor) {
    this.cpuVendor = cpuVendor;
  }


  public Host dataIp(String dataIp) {
    
    this.dataIp = dataIp;
    return this;
  }

   /**
   * Get dataIp
   * @return dataIp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDataIp() {
    return dataIp;
  }


  public void setDataIp(String dataIp) {
    this.dataIp = dataIp;
  }


  public Host entityAsyncStatus(EntityAsyncStatus entityAsyncStatus) {
    
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


  public Host failureDataSpace(Long failureDataSpace) {
    
    this.failureDataSpace = failureDataSpace;
    return this;
  }

   /**
   * Get failureDataSpace
   * @return failureDataSpace
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Long getFailureDataSpace() {
    return failureDataSpace;
  }


  public void setFailureDataSpace(Long failureDataSpace) {
    this.failureDataSpace = failureDataSpace;
  }


  public Host gpuDevices(List<NestedGpuDevice> gpuDevices) {
    
    this.gpuDevices = gpuDevices;
    return this;
  }

  public Host addGpuDevicesItem(NestedGpuDevice gpuDevicesItem) {
    if (this.gpuDevices == null) {
      this.gpuDevices = new ArrayList<NestedGpuDevice>();
    }
    this.gpuDevices.add(gpuDevicesItem);
    return this;
  }

   /**
   * Get gpuDevices
   * @return gpuDevices
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<NestedGpuDevice> getGpuDevices() {
    return gpuDevices;
  }


  public void setGpuDevices(List<NestedGpuDevice> gpuDevices) {
    this.gpuDevices = gpuDevices;
  }


  public Host hddDataCapacity(Long hddDataCapacity) {
    
    this.hddDataCapacity = hddDataCapacity;
    return this;
  }

   /**
   * Get hddDataCapacity
   * @return hddDataCapacity
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Long getHddDataCapacity() {
    return hddDataCapacity;
  }


  public void setHddDataCapacity(Long hddDataCapacity) {
    this.hddDataCapacity = hddDataCapacity;
  }


  public Host hddDiskCount(Integer hddDiskCount) {
    
    this.hddDiskCount = hddDiskCount;
    return this;
  }

   /**
   * Get hddDiskCount
   * @return hddDiskCount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getHddDiskCount() {
    return hddDiskCount;
  }


  public void setHddDiskCount(Integer hddDiskCount) {
    this.hddDiskCount = hddDiskCount;
  }


  public Host hostState(NestedMaintenanceHostState hostState) {
    
    this.hostState = hostState;
    return this;
  }

   /**
   * Get hostState
   * @return hostState
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public NestedMaintenanceHostState getHostState() {
    return hostState;
  }


  public void setHostState(NestedMaintenanceHostState hostState) {
    this.hostState = hostState;
  }


  public Host hypervisorIp(String hypervisorIp) {
    
    this.hypervisorIp = hypervisorIp;
    return this;
  }

   /**
   * Get hypervisorIp
   * @return hypervisorIp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getHypervisorIp() {
    return hypervisorIp;
  }


  public void setHypervisorIp(String hypervisorIp) {
    this.hypervisorIp = hypervisorIp;
  }


  public Host id(String id) {
    
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


  public Host iommu(IommuStatus iommu) {
    
    this.iommu = iommu;
    return this;
  }

   /**
   * Get iommu
   * @return iommu
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public IommuStatus getIommu() {
    return iommu;
  }


  public void setIommu(IommuStatus iommu) {
    this.iommu = iommu;
  }


  public Host isOsInRaid1(Boolean isOsInRaid1) {
    
    this.isOsInRaid1 = isOsInRaid1;
    return this;
  }

   /**
   * Get isOsInRaid1
   * @return isOsInRaid1
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsOsInRaid1() {
    return isOsInRaid1;
  }


  public void setIsOsInRaid1(Boolean isOsInRaid1) {
    this.isOsInRaid1 = isOsInRaid1;
  }


  public Host labels(List<NestedLabel> labels) {
    
    this.labels = labels;
    return this;
  }

  public Host addLabelsItem(NestedLabel labelsItem) {
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


  public Host localId(String localId) {
    
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


  public Host lsmCapDiskSafeUmount(Boolean lsmCapDiskSafeUmount) {
    
    this.lsmCapDiskSafeUmount = lsmCapDiskSafeUmount;
    return this;
  }

   /**
   * Get lsmCapDiskSafeUmount
   * @return lsmCapDiskSafeUmount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boolean getLsmCapDiskSafeUmount() {
    return lsmCapDiskSafeUmount;
  }


  public void setLsmCapDiskSafeUmount(Boolean lsmCapDiskSafeUmount) {
    this.lsmCapDiskSafeUmount = lsmCapDiskSafeUmount;
  }


  public Host managementIp(String managementIp) {
    
    this.managementIp = managementIp;
    return this;
  }

   /**
   * Get managementIp
   * @return managementIp
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getManagementIp() {
    return managementIp;
  }


  public void setManagementIp(String managementIp) {
    this.managementIp = managementIp;
  }


  public Host model(String model) {
    
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


  public Host name(String name) {
    
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


  public Host nestedVirtualization(Boolean nestedVirtualization) {
    
    this.nestedVirtualization = nestedVirtualization;
    return this;
  }

   /**
   * Get nestedVirtualization
   * @return nestedVirtualization
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boolean getNestedVirtualization() {
    return nestedVirtualization;
  }


  public void setNestedVirtualization(Boolean nestedVirtualization) {
    this.nestedVirtualization = nestedVirtualization;
  }


  public Host nicCount(Integer nicCount) {
    
    this.nicCount = nicCount;
    return this;
  }

   /**
   * Get nicCount
   * @return nicCount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getNicCount() {
    return nicCount;
  }


  public void setNicCount(Integer nicCount) {
    this.nicCount = nicCount;
  }


  public Host nics(List<NestedNic> nics) {
    
    this.nics = nics;
    return this;
  }

  public Host addNicsItem(NestedNic nicsItem) {
    if (this.nics == null) {
      this.nics = new ArrayList<NestedNic>();
    }
    this.nics.add(nicsItem);
    return this;
  }

   /**
   * Get nics
   * @return nics
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<NestedNic> getNics() {
    return nics;
  }


  public void setNics(List<NestedNic> nics) {
    this.nics = nics;
  }


  public Host nodeTopoLocalId(String nodeTopoLocalId) {
    
    this.nodeTopoLocalId = nodeTopoLocalId;
    return this;
  }

   /**
   * Get nodeTopoLocalId
   * @return nodeTopoLocalId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNodeTopoLocalId() {
    return nodeTopoLocalId;
  }


  public void setNodeTopoLocalId(String nodeTopoLocalId) {
    this.nodeTopoLocalId = nodeTopoLocalId;
  }


  public Host osMemoryBytes(Long osMemoryBytes) {
    
    this.osMemoryBytes = osMemoryBytes;
    return this;
  }

   /**
   * Get osMemoryBytes
   * @return osMemoryBytes
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Long getOsMemoryBytes() {
    return osMemoryBytes;
  }


  public void setOsMemoryBytes(Long osMemoryBytes) {
    this.osMemoryBytes = osMemoryBytes;
  }


  public Host osVersion(String osVersion) {
    
    this.osVersion = osVersion;
    return this;
  }

   /**
   * Get osVersion
   * @return osVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getOsVersion() {
    return osVersion;
  }


  public void setOsVersion(String osVersion) {
    this.osVersion = osVersion;
  }


  public Host pmemDimmCapacity(Long pmemDimmCapacity) {
    
    this.pmemDimmCapacity = pmemDimmCapacity;
    return this;
  }

   /**
   * Get pmemDimmCapacity
   * @return pmemDimmCapacity
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Long getPmemDimmCapacity() {
    return pmemDimmCapacity;
  }


  public void setPmemDimmCapacity(Long pmemDimmCapacity) {
    this.pmemDimmCapacity = pmemDimmCapacity;
  }


  public Host pmemDimmCount(Integer pmemDimmCount) {
    
    this.pmemDimmCount = pmemDimmCount;
    return this;
  }

   /**
   * Get pmemDimmCount
   * @return pmemDimmCount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getPmemDimmCount() {
    return pmemDimmCount;
  }


  public void setPmemDimmCount(Integer pmemDimmCount) {
    this.pmemDimmCount = pmemDimmCount;
  }


  public Host pmemDiskCount(Integer pmemDiskCount) {
    
    this.pmemDiskCount = pmemDiskCount;
    return this;
  }

   /**
   * Get pmemDiskCount
   * @return pmemDiskCount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getPmemDiskCount() {
    return pmemDiskCount;
  }


  public void setPmemDiskCount(Integer pmemDiskCount) {
    this.pmemDiskCount = pmemDiskCount;
  }


  public Host provisionedCpuCores(Integer provisionedCpuCores) {
    
    this.provisionedCpuCores = provisionedCpuCores;
    return this;
  }

   /**
   * Get provisionedCpuCores
   * @return provisionedCpuCores
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getProvisionedCpuCores() {
    return provisionedCpuCores;
  }


  public void setProvisionedCpuCores(Integer provisionedCpuCores) {
    this.provisionedCpuCores = provisionedCpuCores;
  }


  public Host provisionedMemoryBytes(Long provisionedMemoryBytes) {
    
    this.provisionedMemoryBytes = provisionedMemoryBytes;
    return this;
  }

   /**
   * Get provisionedMemoryBytes
   * @return provisionedMemoryBytes
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Long getProvisionedMemoryBytes() {
    return provisionedMemoryBytes;
  }


  public void setProvisionedMemoryBytes(Long provisionedMemoryBytes) {
    this.provisionedMemoryBytes = provisionedMemoryBytes;
  }


  public Host runningPauseVmMemoryBytes(Long runningPauseVmMemoryBytes) {
    
    this.runningPauseVmMemoryBytes = runningPauseVmMemoryBytes;
    return this;
  }

   /**
   * Get runningPauseVmMemoryBytes
   * @return runningPauseVmMemoryBytes
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Long getRunningPauseVmMemoryBytes() {
    return runningPauseVmMemoryBytes;
  }


  public void setRunningPauseVmMemoryBytes(Long runningPauseVmMemoryBytes) {
    this.runningPauseVmMemoryBytes = runningPauseVmMemoryBytes;
  }


  public Host runningVmNum(Integer runningVmNum) {
    
    this.runningVmNum = runningVmNum;
    return this;
  }

   /**
   * Get runningVmNum
   * @return runningVmNum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getRunningVmNum() {
    return runningVmNum;
  }


  public void setRunningVmNum(Integer runningVmNum) {
    this.runningVmNum = runningVmNum;
  }


  public Host scvmCpu(Integer scvmCpu) {
    
    this.scvmCpu = scvmCpu;
    return this;
  }

   /**
   * Get scvmCpu
   * @return scvmCpu
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getScvmCpu() {
    return scvmCpu;
  }


  public void setScvmCpu(Integer scvmCpu) {
    this.scvmCpu = scvmCpu;
  }


  public Host scvmMemory(Long scvmMemory) {
    
    this.scvmMemory = scvmMemory;
    return this;
  }

   /**
   * Get scvmMemory
   * @return scvmMemory
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getScvmMemory() {
    return scvmMemory;
  }


  public void setScvmMemory(Long scvmMemory) {
    this.scvmMemory = scvmMemory;
  }


  public Host scvmName(String scvmName) {
    
    this.scvmName = scvmName;
    return this;
  }

   /**
   * Get scvmName
   * @return scvmName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getScvmName() {
    return scvmName;
  }


  public void setScvmName(String scvmName) {
    this.scvmName = scvmName;
  }


  public Host serial(String serial) {
    
    this.serial = serial;
    return this;
  }

   /**
   * Get serial
   * @return serial
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSerial() {
    return serial;
  }


  public void setSerial(String serial) {
    this.serial = serial;
  }


  public Host ssdDataCapacity(Long ssdDataCapacity) {
    
    this.ssdDataCapacity = ssdDataCapacity;
    return this;
  }

   /**
   * Get ssdDataCapacity
   * @return ssdDataCapacity
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Long getSsdDataCapacity() {
    return ssdDataCapacity;
  }


  public void setSsdDataCapacity(Long ssdDataCapacity) {
    this.ssdDataCapacity = ssdDataCapacity;
  }


  public Host ssdDiskCount(Integer ssdDiskCount) {
    
    this.ssdDiskCount = ssdDiskCount;
    return this;
  }

   /**
   * Get ssdDiskCount
   * @return ssdDiskCount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getSsdDiskCount() {
    return ssdDiskCount;
  }


  public void setSsdDiskCount(Integer ssdDiskCount) {
    this.ssdDiskCount = ssdDiskCount;
  }


  public Host state(HostState state) {
    
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public HostState getState() {
    return state;
  }


  public void setState(HostState state) {
    this.state = state;
  }


  public Host status(HostStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public HostStatus getStatus() {
    return status;
  }


  public void setStatus(HostStatus status) {
    this.status = status;
  }


  public Host stoppedVmNum(Integer stoppedVmNum) {
    
    this.stoppedVmNum = stoppedVmNum;
    return this;
  }

   /**
   * Get stoppedVmNum
   * @return stoppedVmNum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getStoppedVmNum() {
    return stoppedVmNum;
  }


  public void setStoppedVmNum(Integer stoppedVmNum) {
    this.stoppedVmNum = stoppedVmNum;
  }


  public Host suspendedVmNum(Integer suspendedVmNum) {
    
    this.suspendedVmNum = suspendedVmNum;
    return this;
  }

   /**
   * Get suspendedVmNum
   * @return suspendedVmNum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getSuspendedVmNum() {
    return suspendedVmNum;
  }


  public void setSuspendedVmNum(Integer suspendedVmNum) {
    this.suspendedVmNum = suspendedVmNum;
  }


  public Host totalCacheCapacity(Long totalCacheCapacity) {
    
    this.totalCacheCapacity = totalCacheCapacity;
    return this;
  }

   /**
   * Get totalCacheCapacity
   * @return totalCacheCapacity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getTotalCacheCapacity() {
    return totalCacheCapacity;
  }


  public void setTotalCacheCapacity(Long totalCacheCapacity) {
    this.totalCacheCapacity = totalCacheCapacity;
  }


  public Host totalCpuCores(Integer totalCpuCores) {
    
    this.totalCpuCores = totalCpuCores;
    return this;
  }

   /**
   * Get totalCpuCores
   * @return totalCpuCores
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getTotalCpuCores() {
    return totalCpuCores;
  }


  public void setTotalCpuCores(Integer totalCpuCores) {
    this.totalCpuCores = totalCpuCores;
  }


  public Host totalCpuHz(Long totalCpuHz) {
    
    this.totalCpuHz = totalCpuHz;
    return this;
  }

   /**
   * Get totalCpuHz
   * @return totalCpuHz
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Long getTotalCpuHz() {
    return totalCpuHz;
  }


  public void setTotalCpuHz(Long totalCpuHz) {
    this.totalCpuHz = totalCpuHz;
  }


  public Host totalCpuSockets(Integer totalCpuSockets) {
    
    this.totalCpuSockets = totalCpuSockets;
    return this;
  }

   /**
   * Get totalCpuSockets
   * @return totalCpuSockets
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getTotalCpuSockets() {
    return totalCpuSockets;
  }


  public void setTotalCpuSockets(Integer totalCpuSockets) {
    this.totalCpuSockets = totalCpuSockets;
  }


  public Host totalDataCapacity(Long totalDataCapacity) {
    
    this.totalDataCapacity = totalDataCapacity;
    return this;
  }

   /**
   * Get totalDataCapacity
   * @return totalDataCapacity
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Long getTotalDataCapacity() {
    return totalDataCapacity;
  }


  public void setTotalDataCapacity(Long totalDataCapacity) {
    this.totalDataCapacity = totalDataCapacity;
  }


  public Host totalMemoryBytes(Long totalMemoryBytes) {
    
    this.totalMemoryBytes = totalMemoryBytes;
    return this;
  }

   /**
   * Get totalMemoryBytes
   * @return totalMemoryBytes
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Long getTotalMemoryBytes() {
    return totalMemoryBytes;
  }


  public void setTotalMemoryBytes(Long totalMemoryBytes) {
    this.totalMemoryBytes = totalMemoryBytes;
  }


  public Host usbDevices(List<NestedUsbDevice> usbDevices) {
    
    this.usbDevices = usbDevices;
    return this;
  }

  public Host addUsbDevicesItem(NestedUsbDevice usbDevicesItem) {
    if (this.usbDevices == null) {
      this.usbDevices = new ArrayList<NestedUsbDevice>();
    }
    this.usbDevices.add(usbDevicesItem);
    return this;
  }

   /**
   * Get usbDevices
   * @return usbDevices
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<NestedUsbDevice> getUsbDevices() {
    return usbDevices;
  }


  public void setUsbDevices(List<NestedUsbDevice> usbDevices) {
    this.usbDevices = usbDevices;
  }


  public Host usedCpuHz(Double usedCpuHz) {
    
    this.usedCpuHz = usedCpuHz;
    return this;
  }

   /**
   * Get usedCpuHz
   * @return usedCpuHz
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getUsedCpuHz() {
    return usedCpuHz;
  }


  public void setUsedCpuHz(Double usedCpuHz) {
    this.usedCpuHz = usedCpuHz;
  }


  public Host usedDataSpace(Long usedDataSpace) {
    
    this.usedDataSpace = usedDataSpace;
    return this;
  }

   /**
   * Get usedDataSpace
   * @return usedDataSpace
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Long getUsedDataSpace() {
    return usedDataSpace;
  }


  public void setUsedDataSpace(Long usedDataSpace) {
    this.usedDataSpace = usedDataSpace;
  }


  public Host usedMemoryBytes(Double usedMemoryBytes) {
    
    this.usedMemoryBytes = usedMemoryBytes;
    return this;
  }

   /**
   * Get usedMemoryBytes
   * @return usedMemoryBytes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getUsedMemoryBytes() {
    return usedMemoryBytes;
  }


  public void setUsedMemoryBytes(Double usedMemoryBytes) {
    this.usedMemoryBytes = usedMemoryBytes;
  }


  public Host vmNum(Integer vmNum) {
    
    this.vmNum = vmNum;
    return this;
  }

   /**
   * Get vmNum
   * @return vmNum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getVmNum() {
    return vmNum;
  }


  public void setVmNum(Integer vmNum) {
    this.vmNum = vmNum;
  }


  public Host vmotionIp(String vmotionIp) {
    
    this.vmotionIp = vmotionIp;
    return this;
  }

   /**
   * Get vmotionIp
   * @return vmotionIp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getVmotionIp() {
    return vmotionIp;
  }


  public void setVmotionIp(String vmotionIp) {
    this.vmotionIp = vmotionIp;
  }


  public Host vms(List<NestedVm> vms) {
    
    this.vms = vms;
    return this;
  }

  public Host addVmsItem(NestedVm vmsItem) {
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


  public Host withFasterSsdAsCache(Boolean withFasterSsdAsCache) {
    
    this.withFasterSsdAsCache = withFasterSsdAsCache;
    return this;
  }

   /**
   * Get withFasterSsdAsCache
   * @return withFasterSsdAsCache
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getWithFasterSsdAsCache() {
    return withFasterSsdAsCache;
  }


  public void setWithFasterSsdAsCache(Boolean withFasterSsdAsCache) {
    this.withFasterSsdAsCache = withFasterSsdAsCache;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Host host = (Host) o;
    return Objects.equals(this.accessIp, host.accessIp) &&
        Objects.equals(this.allocableCpuCoresForVmExclusive, host.allocableCpuCoresForVmExclusive) &&
        Objects.equals(this.allocatableMemoryBytes, host.allocatableMemoryBytes) &&
        Objects.equals(this.chunkId, host.chunkId) &&
        Objects.equals(this.cluster, host.cluster) &&
        Objects.equals(this.compatibleCpuModels, host.compatibleCpuModels) &&
        Objects.equals(this.cpuBrand, host.cpuBrand) &&
        Objects.equals(this.cpuFanSpeed, host.cpuFanSpeed) &&
        Objects.equals(this.cpuFanSpeedUnit, host.cpuFanSpeedUnit) &&
        Objects.equals(this.cpuHzPerCore, host.cpuHzPerCore) &&
        Objects.equals(this.cpuModel, host.cpuModel) &&
        Objects.equals(this.cpuTemperatureCelsius, host.cpuTemperatureCelsius) &&
        Objects.equals(this.cpuVendor, host.cpuVendor) &&
        Objects.equals(this.dataIp, host.dataIp) &&
        Objects.equals(this.entityAsyncStatus, host.entityAsyncStatus) &&
        Objects.equals(this.failureDataSpace, host.failureDataSpace) &&
        Objects.equals(this.gpuDevices, host.gpuDevices) &&
        Objects.equals(this.hddDataCapacity, host.hddDataCapacity) &&
        Objects.equals(this.hddDiskCount, host.hddDiskCount) &&
        Objects.equals(this.hostState, host.hostState) &&
        Objects.equals(this.hypervisorIp, host.hypervisorIp) &&
        Objects.equals(this.id, host.id) &&
        Objects.equals(this.iommu, host.iommu) &&
        Objects.equals(this.isOsInRaid1, host.isOsInRaid1) &&
        Objects.equals(this.labels, host.labels) &&
        Objects.equals(this.localId, host.localId) &&
        Objects.equals(this.lsmCapDiskSafeUmount, host.lsmCapDiskSafeUmount) &&
        Objects.equals(this.managementIp, host.managementIp) &&
        Objects.equals(this.model, host.model) &&
        Objects.equals(this.name, host.name) &&
        Objects.equals(this.nestedVirtualization, host.nestedVirtualization) &&
        Objects.equals(this.nicCount, host.nicCount) &&
        Objects.equals(this.nics, host.nics) &&
        Objects.equals(this.nodeTopoLocalId, host.nodeTopoLocalId) &&
        Objects.equals(this.osMemoryBytes, host.osMemoryBytes) &&
        Objects.equals(this.osVersion, host.osVersion) &&
        Objects.equals(this.pmemDimmCapacity, host.pmemDimmCapacity) &&
        Objects.equals(this.pmemDimmCount, host.pmemDimmCount) &&
        Objects.equals(this.pmemDiskCount, host.pmemDiskCount) &&
        Objects.equals(this.provisionedCpuCores, host.provisionedCpuCores) &&
        Objects.equals(this.provisionedMemoryBytes, host.provisionedMemoryBytes) &&
        Objects.equals(this.runningPauseVmMemoryBytes, host.runningPauseVmMemoryBytes) &&
        Objects.equals(this.runningVmNum, host.runningVmNum) &&
        Objects.equals(this.scvmCpu, host.scvmCpu) &&
        Objects.equals(this.scvmMemory, host.scvmMemory) &&
        Objects.equals(this.scvmName, host.scvmName) &&
        Objects.equals(this.serial, host.serial) &&
        Objects.equals(this.ssdDataCapacity, host.ssdDataCapacity) &&
        Objects.equals(this.ssdDiskCount, host.ssdDiskCount) &&
        Objects.equals(this.state, host.state) &&
        Objects.equals(this.status, host.status) &&
        Objects.equals(this.stoppedVmNum, host.stoppedVmNum) &&
        Objects.equals(this.suspendedVmNum, host.suspendedVmNum) &&
        Objects.equals(this.totalCacheCapacity, host.totalCacheCapacity) &&
        Objects.equals(this.totalCpuCores, host.totalCpuCores) &&
        Objects.equals(this.totalCpuHz, host.totalCpuHz) &&
        Objects.equals(this.totalCpuSockets, host.totalCpuSockets) &&
        Objects.equals(this.totalDataCapacity, host.totalDataCapacity) &&
        Objects.equals(this.totalMemoryBytes, host.totalMemoryBytes) &&
        Objects.equals(this.usbDevices, host.usbDevices) &&
        Objects.equals(this.usedCpuHz, host.usedCpuHz) &&
        Objects.equals(this.usedDataSpace, host.usedDataSpace) &&
        Objects.equals(this.usedMemoryBytes, host.usedMemoryBytes) &&
        Objects.equals(this.vmNum, host.vmNum) &&
        Objects.equals(this.vmotionIp, host.vmotionIp) &&
        Objects.equals(this.vms, host.vms) &&
        Objects.equals(this.withFasterSsdAsCache, host.withFasterSsdAsCache);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessIp, allocableCpuCoresForVmExclusive, allocatableMemoryBytes, chunkId, cluster, compatibleCpuModels, cpuBrand, cpuFanSpeed, cpuFanSpeedUnit, cpuHzPerCore, cpuModel, cpuTemperatureCelsius, cpuVendor, dataIp, entityAsyncStatus, failureDataSpace, gpuDevices, hddDataCapacity, hddDiskCount, hostState, hypervisorIp, id, iommu, isOsInRaid1, labels, localId, lsmCapDiskSafeUmount, managementIp, model, name, nestedVirtualization, nicCount, nics, nodeTopoLocalId, osMemoryBytes, osVersion, pmemDimmCapacity, pmemDimmCount, pmemDiskCount, provisionedCpuCores, provisionedMemoryBytes, runningPauseVmMemoryBytes, runningVmNum, scvmCpu, scvmMemory, scvmName, serial, ssdDataCapacity, ssdDiskCount, state, status, stoppedVmNum, suspendedVmNum, totalCacheCapacity, totalCpuCores, totalCpuHz, totalCpuSockets, totalDataCapacity, totalMemoryBytes, usbDevices, usedCpuHz, usedDataSpace, usedMemoryBytes, vmNum, vmotionIp, vms, withFasterSsdAsCache);
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
    sb.append("class Host {\n");
    sb.append("    accessIp: ").append(toIndentedString(accessIp)).append("\n");
    sb.append("    allocableCpuCoresForVmExclusive: ").append(toIndentedString(allocableCpuCoresForVmExclusive)).append("\n");
    sb.append("    allocatableMemoryBytes: ").append(toIndentedString(allocatableMemoryBytes)).append("\n");
    sb.append("    chunkId: ").append(toIndentedString(chunkId)).append("\n");
    sb.append("    cluster: ").append(toIndentedString(cluster)).append("\n");
    sb.append("    compatibleCpuModels: ").append(toIndentedString(compatibleCpuModels)).append("\n");
    sb.append("    cpuBrand: ").append(toIndentedString(cpuBrand)).append("\n");
    sb.append("    cpuFanSpeed: ").append(toIndentedString(cpuFanSpeed)).append("\n");
    sb.append("    cpuFanSpeedUnit: ").append(toIndentedString(cpuFanSpeedUnit)).append("\n");
    sb.append("    cpuHzPerCore: ").append(toIndentedString(cpuHzPerCore)).append("\n");
    sb.append("    cpuModel: ").append(toIndentedString(cpuModel)).append("\n");
    sb.append("    cpuTemperatureCelsius: ").append(toIndentedString(cpuTemperatureCelsius)).append("\n");
    sb.append("    cpuVendor: ").append(toIndentedString(cpuVendor)).append("\n");
    sb.append("    dataIp: ").append(toIndentedString(dataIp)).append("\n");
    sb.append("    entityAsyncStatus: ").append(toIndentedString(entityAsyncStatus)).append("\n");
    sb.append("    failureDataSpace: ").append(toIndentedString(failureDataSpace)).append("\n");
    sb.append("    gpuDevices: ").append(toIndentedString(gpuDevices)).append("\n");
    sb.append("    hddDataCapacity: ").append(toIndentedString(hddDataCapacity)).append("\n");
    sb.append("    hddDiskCount: ").append(toIndentedString(hddDiskCount)).append("\n");
    sb.append("    hostState: ").append(toIndentedString(hostState)).append("\n");
    sb.append("    hypervisorIp: ").append(toIndentedString(hypervisorIp)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    iommu: ").append(toIndentedString(iommu)).append("\n");
    sb.append("    isOsInRaid1: ").append(toIndentedString(isOsInRaid1)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    localId: ").append(toIndentedString(localId)).append("\n");
    sb.append("    lsmCapDiskSafeUmount: ").append(toIndentedString(lsmCapDiskSafeUmount)).append("\n");
    sb.append("    managementIp: ").append(toIndentedString(managementIp)).append("\n");
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    nestedVirtualization: ").append(toIndentedString(nestedVirtualization)).append("\n");
    sb.append("    nicCount: ").append(toIndentedString(nicCount)).append("\n");
    sb.append("    nics: ").append(toIndentedString(nics)).append("\n");
    sb.append("    nodeTopoLocalId: ").append(toIndentedString(nodeTopoLocalId)).append("\n");
    sb.append("    osMemoryBytes: ").append(toIndentedString(osMemoryBytes)).append("\n");
    sb.append("    osVersion: ").append(toIndentedString(osVersion)).append("\n");
    sb.append("    pmemDimmCapacity: ").append(toIndentedString(pmemDimmCapacity)).append("\n");
    sb.append("    pmemDimmCount: ").append(toIndentedString(pmemDimmCount)).append("\n");
    sb.append("    pmemDiskCount: ").append(toIndentedString(pmemDiskCount)).append("\n");
    sb.append("    provisionedCpuCores: ").append(toIndentedString(provisionedCpuCores)).append("\n");
    sb.append("    provisionedMemoryBytes: ").append(toIndentedString(provisionedMemoryBytes)).append("\n");
    sb.append("    runningPauseVmMemoryBytes: ").append(toIndentedString(runningPauseVmMemoryBytes)).append("\n");
    sb.append("    runningVmNum: ").append(toIndentedString(runningVmNum)).append("\n");
    sb.append("    scvmCpu: ").append(toIndentedString(scvmCpu)).append("\n");
    sb.append("    scvmMemory: ").append(toIndentedString(scvmMemory)).append("\n");
    sb.append("    scvmName: ").append(toIndentedString(scvmName)).append("\n");
    sb.append("    serial: ").append(toIndentedString(serial)).append("\n");
    sb.append("    ssdDataCapacity: ").append(toIndentedString(ssdDataCapacity)).append("\n");
    sb.append("    ssdDiskCount: ").append(toIndentedString(ssdDiskCount)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    stoppedVmNum: ").append(toIndentedString(stoppedVmNum)).append("\n");
    sb.append("    suspendedVmNum: ").append(toIndentedString(suspendedVmNum)).append("\n");
    sb.append("    totalCacheCapacity: ").append(toIndentedString(totalCacheCapacity)).append("\n");
    sb.append("    totalCpuCores: ").append(toIndentedString(totalCpuCores)).append("\n");
    sb.append("    totalCpuHz: ").append(toIndentedString(totalCpuHz)).append("\n");
    sb.append("    totalCpuSockets: ").append(toIndentedString(totalCpuSockets)).append("\n");
    sb.append("    totalDataCapacity: ").append(toIndentedString(totalDataCapacity)).append("\n");
    sb.append("    totalMemoryBytes: ").append(toIndentedString(totalMemoryBytes)).append("\n");
    sb.append("    usbDevices: ").append(toIndentedString(usbDevices)).append("\n");
    sb.append("    usedCpuHz: ").append(toIndentedString(usedCpuHz)).append("\n");
    sb.append("    usedDataSpace: ").append(toIndentedString(usedDataSpace)).append("\n");
    sb.append("    usedMemoryBytes: ").append(toIndentedString(usedMemoryBytes)).append("\n");
    sb.append("    vmNum: ").append(toIndentedString(vmNum)).append("\n");
    sb.append("    vmotionIp: ").append(toIndentedString(vmotionIp)).append("\n");
    sb.append("    vms: ").append(toIndentedString(vms)).append("\n");
    sb.append("    withFasterSsdAsCache: ").append(toIndentedString(withFasterSsdAsCache)).append("\n");
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

