package com.arcfra.aoc.model;

import java.util.Objects;
import java.util.Arrays;
import com.arcfra.aoc.model.EntityAsyncStatus;
import com.arcfra.aoc.model.NestedCluster;
import com.arcfra.aoc.model.NestedCpu;
import com.arcfra.aoc.model.NestedGpuDevice;
import com.arcfra.aoc.model.NestedHost;
import com.arcfra.aoc.model.NestedLabel;
import com.arcfra.aoc.model.NestedNic;
import com.arcfra.aoc.model.NestedUsbDevice;
import com.arcfra.aoc.model.NestedVmDisk;
import com.arcfra.aoc.model.NestedVmFolder;
import com.arcfra.aoc.model.NestedVmNic;
import com.arcfra.aoc.model.NestedVmPlacementGroup;
import com.arcfra.aoc.model.NestedVmSnapshot;
import com.arcfra.aoc.model.VmClockOffset;
import com.arcfra.aoc.model.VmDiskIoPolicy;
import com.arcfra.aoc.model.VmDiskIoRestrictType;
import com.arcfra.aoc.model.VmFirmware;
import com.arcfra.aoc.model.VmGuestsOperationSystem;
import com.arcfra.aoc.model.VmStatus;
import com.arcfra.aoc.model.VmToolsStatus;
import com.arcfra.aoc.model.VmUsage;
import com.arcfra.aoc.model.VmVideoType;
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
 * Vm
 */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class Vm {
  public static final String SERIALIZED_NAME_BIOS_UUID = "bios_uuid";
  @SerializedName(SERIALIZED_NAME_BIOS_UUID)
  private String biosUuid;

  public static final String SERIALIZED_NAME_CLOCK_OFFSET = "clock_offset";
  @SerializedName(SERIALIZED_NAME_CLOCK_OFFSET)
  private VmClockOffset clockOffset;

  public static final String SERIALIZED_NAME_CLOUD_INIT_SUPPORTED = "cloud_init_supported";
  @SerializedName(SERIALIZED_NAME_CLOUD_INIT_SUPPORTED)
  private Boolean cloudInitSupported;

  public static final String SERIALIZED_NAME_CLUSTER = "cluster";
  @SerializedName(SERIALIZED_NAME_CLUSTER)
  private NestedCluster cluster;

  public static final String SERIALIZED_NAME_CPU = "cpu";
  @SerializedName(SERIALIZED_NAME_CPU)
  private NestedCpu cpu;

  public static final String SERIALIZED_NAME_CPU_MODEL = "cpu_model";
  @SerializedName(SERIALIZED_NAME_CPU_MODEL)
  private String cpuModel;

  public static final String SERIALIZED_NAME_CPU_USAGE = "cpu_usage";
  @SerializedName(SERIALIZED_NAME_CPU_USAGE)
  private Double cpuUsage;

  public static final String SERIALIZED_NAME_DELETED_AT = "deleted_at";
  @SerializedName(SERIALIZED_NAME_DELETED_AT)
  private String deletedAt;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_DNS_SERVERS = "dns_servers";
  @SerializedName(SERIALIZED_NAME_DNS_SERVERS)
  private String dnsServers;

  public static final String SERIALIZED_NAME_ENTITY_ASYNC_STATUS = "entityAsyncStatus";
  @SerializedName(SERIALIZED_NAME_ENTITY_ASYNC_STATUS)
  private EntityAsyncStatus entityAsyncStatus;

  public static final String SERIALIZED_NAME_FIRMWARE = "firmware";
  @SerializedName(SERIALIZED_NAME_FIRMWARE)
  private VmFirmware firmware;

  public static final String SERIALIZED_NAME_FOLDER = "folder";
  @SerializedName(SERIALIZED_NAME_FOLDER)
  private NestedVmFolder folder;

  public static final String SERIALIZED_NAME_GPU_DEVICES = "gpu_devices";
  @SerializedName(SERIALIZED_NAME_GPU_DEVICES)
  private List<NestedGpuDevice> gpuDevices = null;

  public static final String SERIALIZED_NAME_GUEST_CPU_MODEL = "guest_cpu_model";
  @SerializedName(SERIALIZED_NAME_GUEST_CPU_MODEL)
  private String guestCpuModel;

  public static final String SERIALIZED_NAME_GUEST_OS_TYPE = "guest_os_type";
  @SerializedName(SERIALIZED_NAME_GUEST_OS_TYPE)
  private VmGuestsOperationSystem guestOsType;

  public static final String SERIALIZED_NAME_GUEST_SIZE_USAGE = "guest_size_usage";
  @SerializedName(SERIALIZED_NAME_GUEST_SIZE_USAGE)
  private Double guestSizeUsage;

  public static final String SERIALIZED_NAME_GUEST_USED_SIZE = "guest_used_size";
  @SerializedName(SERIALIZED_NAME_GUEST_USED_SIZE)
  private Long guestUsedSize;

  public static final String SERIALIZED_NAME_HA = "ha";
  @SerializedName(SERIALIZED_NAME_HA)
  private Boolean ha;

  public static final String SERIALIZED_NAME_HOST = "host";
  @SerializedName(SERIALIZED_NAME_HOST)
  private NestedHost host;

  public static final String SERIALIZED_NAME_HOSTNAME = "hostname";
  @SerializedName(SERIALIZED_NAME_HOSTNAME)
  private String hostname;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_IN_RECYCLE_BIN = "in_recycle_bin";
  @SerializedName(SERIALIZED_NAME_IN_RECYCLE_BIN)
  private Boolean inRecycleBin;

  public static final String SERIALIZED_NAME_INTERNAL = "internal";
  @SerializedName(SERIALIZED_NAME_INTERNAL)
  private Boolean internal;

  public static final String SERIALIZED_NAME_IO_POLICY = "io_policy";
  @SerializedName(SERIALIZED_NAME_IO_POLICY)
  private VmDiskIoPolicy ioPolicy;

  public static final String SERIALIZED_NAME_IPS = "ips";
  @SerializedName(SERIALIZED_NAME_IPS)
  private String ips;

  public static final String SERIALIZED_NAME_KERNEL_INFO = "kernel_info";
  @SerializedName(SERIALIZED_NAME_KERNEL_INFO)
  private String kernelInfo;

  public static final String SERIALIZED_NAME_LABELS = "labels";
  @SerializedName(SERIALIZED_NAME_LABELS)
  private List<NestedLabel> labels = null;

  public static final String SERIALIZED_NAME_LAST_SHUTDOWN_TIME = "last_shutdown_time";
  @SerializedName(SERIALIZED_NAME_LAST_SHUTDOWN_TIME)
  private String lastShutdownTime;

  public static final String SERIALIZED_NAME_LOCAL_CREATED_AT = "local_created_at";
  @SerializedName(SERIALIZED_NAME_LOCAL_CREATED_AT)
  private String localCreatedAt;

  public static final String SERIALIZED_NAME_LOCAL_ID = "local_id";
  @SerializedName(SERIALIZED_NAME_LOCAL_ID)
  private String localId;

  public static final String SERIALIZED_NAME_LOGICAL_SIZE_BYTES = "logical_size_bytes";
  @SerializedName(SERIALIZED_NAME_LOGICAL_SIZE_BYTES)
  private Long logicalSizeBytes;

  public static final String SERIALIZED_NAME_MAX_BANDWIDTH = "max_bandwidth";
  @SerializedName(SERIALIZED_NAME_MAX_BANDWIDTH)
  private Long maxBandwidth;

  public static final String SERIALIZED_NAME_MAX_BANDWIDTH_POLICY = "max_bandwidth_policy";
  @SerializedName(SERIALIZED_NAME_MAX_BANDWIDTH_POLICY)
  private VmDiskIoRestrictType maxBandwidthPolicy;

  public static final String SERIALIZED_NAME_MAX_IOPS = "max_iops";
  @SerializedName(SERIALIZED_NAME_MAX_IOPS)
  private Integer maxIops;

  public static final String SERIALIZED_NAME_MAX_IOPS_POLICY = "max_iops_policy";
  @SerializedName(SERIALIZED_NAME_MAX_IOPS_POLICY)
  private VmDiskIoRestrictType maxIopsPolicy;

  public static final String SERIALIZED_NAME_MEMORY = "memory";
  @SerializedName(SERIALIZED_NAME_MEMORY)
  private Long memory;

  public static final String SERIALIZED_NAME_MEMORY_USAGE = "memory_usage";
  @SerializedName(SERIALIZED_NAME_MEMORY_USAGE)
  private Double memoryUsage;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NESTED_VIRTUALIZATION = "nested_virtualization";
  @SerializedName(SERIALIZED_NAME_NESTED_VIRTUALIZATION)
  private Boolean nestedVirtualization;

  public static final String SERIALIZED_NAME_NODE_IP = "node_ip";
  @SerializedName(SERIALIZED_NAME_NODE_IP)
  private String nodeIp;

  public static final String SERIALIZED_NAME_ORIGINAL_NAME = "original_name";
  @SerializedName(SERIALIZED_NAME_ORIGINAL_NAME)
  private String originalName;

  public static final String SERIALIZED_NAME_OS = "os";
  @SerializedName(SERIALIZED_NAME_OS)
  private String os;

  public static final String SERIALIZED_NAME_OUT_UNINSTALL_USB = "out_uninstall_usb";
  @SerializedName(SERIALIZED_NAME_OUT_UNINSTALL_USB)
  private List<String> outUninstallUsb = new ArrayList<String>();

  public static final String SERIALIZED_NAME_PCI_NICS = "pci_nics";
  @SerializedName(SERIALIZED_NAME_PCI_NICS)
  private List<NestedNic> pciNics = null;

  public static final String SERIALIZED_NAME_PROTECTED = "protected";
  @SerializedName(SERIALIZED_NAME_PROTECTED)
  private Boolean _protected;

  public static final String SERIALIZED_NAME_PROVISIONED_SIZE = "provisioned_size";
  @SerializedName(SERIALIZED_NAME_PROVISIONED_SIZE)
  private Long provisionedSize;

  public static final String SERIALIZED_NAME_SIZE = "size";
  @SerializedName(SERIALIZED_NAME_SIZE)
  private Long size;

  public static final String SERIALIZED_NAME_SNAPSHOTS = "snapshots";
  @SerializedName(SERIALIZED_NAME_SNAPSHOTS)
  private List<NestedVmSnapshot> snapshots = null;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private VmStatus status;

  public static final String SERIALIZED_NAME_UNIQUE_LOGICAL_SIZE = "unique_logical_size";
  @SerializedName(SERIALIZED_NAME_UNIQUE_LOGICAL_SIZE)
  private Double uniqueLogicalSize;

  public static final String SERIALIZED_NAME_UNIQUE_SIZE = "unique_size";
  @SerializedName(SERIALIZED_NAME_UNIQUE_SIZE)
  private Long uniqueSize;

  public static final String SERIALIZED_NAME_USB_DEVICES = "usb_devices";
  @SerializedName(SERIALIZED_NAME_USB_DEVICES)
  private List<NestedUsbDevice> usbDevices = null;

  public static final String SERIALIZED_NAME_VCPU = "vcpu";
  @SerializedName(SERIALIZED_NAME_VCPU)
  private Integer vcpu;

  public static final String SERIALIZED_NAME_VIDEO_TYPE = "video_type";
  @SerializedName(SERIALIZED_NAME_VIDEO_TYPE)
  private VmVideoType videoType;

  public static final String SERIALIZED_NAME_VM_DISKS = "vm_disks";
  @SerializedName(SERIALIZED_NAME_VM_DISKS)
  private List<NestedVmDisk> vmDisks = null;

  public static final String SERIALIZED_NAME_VM_NICS = "vm_nics";
  @SerializedName(SERIALIZED_NAME_VM_NICS)
  private List<NestedVmNic> vmNics = null;

  public static final String SERIALIZED_NAME_VM_PLACEMENT_GROUP = "vm_placement_group";
  @SerializedName(SERIALIZED_NAME_VM_PLACEMENT_GROUP)
  private List<NestedVmPlacementGroup> vmPlacementGroup = null;

  public static final String SERIALIZED_NAME_VM_TOOLS_STATUS = "vm_tools_status";
  @SerializedName(SERIALIZED_NAME_VM_TOOLS_STATUS)
  private VmToolsStatus vmToolsStatus;

  public static final String SERIALIZED_NAME_VM_TOOLS_VERSION = "vm_tools_version";
  @SerializedName(SERIALIZED_NAME_VM_TOOLS_VERSION)
  private String vmToolsVersion;

  public static final String SERIALIZED_NAME_VM_USAGE = "vm_usage";
  @SerializedName(SERIALIZED_NAME_VM_USAGE)
  private VmUsage vmUsage;

  public static final String SERIALIZED_NAME_WIN_OPT = "win_opt";
  @SerializedName(SERIALIZED_NAME_WIN_OPT)
  private Boolean winOpt;

  public Vm() { 
  }

  public Vm biosUuid(String biosUuid) {
    
    this.biosUuid = biosUuid;
    return this;
  }

   /**
   * Get biosUuid
   * @return biosUuid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getBiosUuid() {
    return biosUuid;
  }


  public void setBiosUuid(String biosUuid) {
    this.biosUuid = biosUuid;
  }


  public Vm clockOffset(VmClockOffset clockOffset) {
    
    this.clockOffset = clockOffset;
    return this;
  }

   /**
   * Get clockOffset
   * @return clockOffset
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public VmClockOffset getClockOffset() {
    return clockOffset;
  }


  public void setClockOffset(VmClockOffset clockOffset) {
    this.clockOffset = clockOffset;
  }


  public Vm cloudInitSupported(Boolean cloudInitSupported) {
    
    this.cloudInitSupported = cloudInitSupported;
    return this;
  }

   /**
   * Get cloudInitSupported
   * @return cloudInitSupported
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getCloudInitSupported() {
    return cloudInitSupported;
  }


  public void setCloudInitSupported(Boolean cloudInitSupported) {
    this.cloudInitSupported = cloudInitSupported;
  }


  public Vm cluster(NestedCluster cluster) {
    
    this.cluster = cluster;
    return this;
  }

   /**
   * Get cluster
   * @return cluster
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public NestedCluster getCluster() {
    return cluster;
  }


  public void setCluster(NestedCluster cluster) {
    this.cluster = cluster;
  }


  public Vm cpu(NestedCpu cpu) {
    
    this.cpu = cpu;
    return this;
  }

   /**
   * Get cpu
   * @return cpu
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public NestedCpu getCpu() {
    return cpu;
  }


  public void setCpu(NestedCpu cpu) {
    this.cpu = cpu;
  }


  public Vm cpuModel(String cpuModel) {
    
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


  public Vm cpuUsage(Double cpuUsage) {
    
    this.cpuUsage = cpuUsage;
    return this;
  }

   /**
   * Get cpuUsage
   * @return cpuUsage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getCpuUsage() {
    return cpuUsage;
  }


  public void setCpuUsage(Double cpuUsage) {
    this.cpuUsage = cpuUsage;
  }


  public Vm deletedAt(String deletedAt) {
    
    this.deletedAt = deletedAt;
    return this;
  }

   /**
   * Get deletedAt
   * @return deletedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDeletedAt() {
    return deletedAt;
  }


  public void setDeletedAt(String deletedAt) {
    this.deletedAt = deletedAt;
  }


  public Vm description(String description) {
    
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


  public Vm dnsServers(String dnsServers) {
    
    this.dnsServers = dnsServers;
    return this;
  }

   /**
   * Get dnsServers
   * @return dnsServers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDnsServers() {
    return dnsServers;
  }


  public void setDnsServers(String dnsServers) {
    this.dnsServers = dnsServers;
  }


  public Vm entityAsyncStatus(EntityAsyncStatus entityAsyncStatus) {
    
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


  public Vm firmware(VmFirmware firmware) {
    
    this.firmware = firmware;
    return this;
  }

   /**
   * Get firmware
   * @return firmware
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public VmFirmware getFirmware() {
    return firmware;
  }


  public void setFirmware(VmFirmware firmware) {
    this.firmware = firmware;
  }


  public Vm folder(NestedVmFolder folder) {
    
    this.folder = folder;
    return this;
  }

   /**
   * Get folder
   * @return folder
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public NestedVmFolder getFolder() {
    return folder;
  }


  public void setFolder(NestedVmFolder folder) {
    this.folder = folder;
  }


  public Vm gpuDevices(List<NestedGpuDevice> gpuDevices) {
    
    this.gpuDevices = gpuDevices;
    return this;
  }

  public Vm addGpuDevicesItem(NestedGpuDevice gpuDevicesItem) {
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


  public Vm guestCpuModel(String guestCpuModel) {
    
    this.guestCpuModel = guestCpuModel;
    return this;
  }

   /**
   * Get guestCpuModel
   * @return guestCpuModel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getGuestCpuModel() {
    return guestCpuModel;
  }


  public void setGuestCpuModel(String guestCpuModel) {
    this.guestCpuModel = guestCpuModel;
  }


  public Vm guestOsType(VmGuestsOperationSystem guestOsType) {
    
    this.guestOsType = guestOsType;
    return this;
  }

   /**
   * Get guestOsType
   * @return guestOsType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VmGuestsOperationSystem getGuestOsType() {
    return guestOsType;
  }


  public void setGuestOsType(VmGuestsOperationSystem guestOsType) {
    this.guestOsType = guestOsType;
  }


  public Vm guestSizeUsage(Double guestSizeUsage) {
    
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


  public Vm guestUsedSize(Long guestUsedSize) {
    
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


  public Vm ha(Boolean ha) {
    
    this.ha = ha;
    return this;
  }

   /**
   * Get ha
   * @return ha
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boolean getHa() {
    return ha;
  }


  public void setHa(Boolean ha) {
    this.ha = ha;
  }


  public Vm host(NestedHost host) {
    
    this.host = host;
    return this;
  }

   /**
   * Get host
   * @return host
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public NestedHost getHost() {
    return host;
  }


  public void setHost(NestedHost host) {
    this.host = host;
  }


  public Vm hostname(String hostname) {
    
    this.hostname = hostname;
    return this;
  }

   /**
   * Get hostname
   * @return hostname
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getHostname() {
    return hostname;
  }


  public void setHostname(String hostname) {
    this.hostname = hostname;
  }


  public Vm id(String id) {
    
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


  public Vm inRecycleBin(Boolean inRecycleBin) {
    
    this.inRecycleBin = inRecycleBin;
    return this;
  }

   /**
   * Get inRecycleBin
   * @return inRecycleBin
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boolean getInRecycleBin() {
    return inRecycleBin;
  }


  public void setInRecycleBin(Boolean inRecycleBin) {
    this.inRecycleBin = inRecycleBin;
  }


  public Vm internal(Boolean internal) {
    
    this.internal = internal;
    return this;
  }

   /**
   * Get internal
   * @return internal
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boolean getInternal() {
    return internal;
  }


  public void setInternal(Boolean internal) {
    this.internal = internal;
  }


  public Vm ioPolicy(VmDiskIoPolicy ioPolicy) {
    
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


  public Vm ips(String ips) {
    
    this.ips = ips;
    return this;
  }

   /**
   * Get ips
   * @return ips
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getIps() {
    return ips;
  }


  public void setIps(String ips) {
    this.ips = ips;
  }


  public Vm kernelInfo(String kernelInfo) {
    
    this.kernelInfo = kernelInfo;
    return this;
  }

   /**
   * Get kernelInfo
   * @return kernelInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getKernelInfo() {
    return kernelInfo;
  }


  public void setKernelInfo(String kernelInfo) {
    this.kernelInfo = kernelInfo;
  }


  public Vm labels(List<NestedLabel> labels) {
    
    this.labels = labels;
    return this;
  }

  public Vm addLabelsItem(NestedLabel labelsItem) {
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


  public Vm lastShutdownTime(String lastShutdownTime) {
    
    this.lastShutdownTime = lastShutdownTime;
    return this;
  }

   /**
   * Get lastShutdownTime
   * @return lastShutdownTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLastShutdownTime() {
    return lastShutdownTime;
  }


  public void setLastShutdownTime(String lastShutdownTime) {
    this.lastShutdownTime = lastShutdownTime;
  }


  public Vm localCreatedAt(String localCreatedAt) {
    
    this.localCreatedAt = localCreatedAt;
    return this;
  }

   /**
   * Get localCreatedAt
   * @return localCreatedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLocalCreatedAt() {
    return localCreatedAt;
  }


  public void setLocalCreatedAt(String localCreatedAt) {
    this.localCreatedAt = localCreatedAt;
  }


  public Vm localId(String localId) {
    
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


  public Vm logicalSizeBytes(Long logicalSizeBytes) {
    
    this.logicalSizeBytes = logicalSizeBytes;
    return this;
  }

   /**
   * Get logicalSizeBytes
   * @return logicalSizeBytes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getLogicalSizeBytes() {
    return logicalSizeBytes;
  }


  public void setLogicalSizeBytes(Long logicalSizeBytes) {
    this.logicalSizeBytes = logicalSizeBytes;
  }


  public Vm maxBandwidth(Long maxBandwidth) {
    
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


  public Vm maxBandwidthPolicy(VmDiskIoRestrictType maxBandwidthPolicy) {
    
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


  public Vm maxIops(Integer maxIops) {
    
    this.maxIops = maxIops;
    return this;
  }

   /**
   * Get maxIops
   * @return maxIops
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getMaxIops() {
    return maxIops;
  }


  public void setMaxIops(Integer maxIops) {
    this.maxIops = maxIops;
  }


  public Vm maxIopsPolicy(VmDiskIoRestrictType maxIopsPolicy) {
    
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


  public Vm memory(Long memory) {
    
    this.memory = memory;
    return this;
  }

   /**
   * Get memory
   * @return memory
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Long getMemory() {
    return memory;
  }


  public void setMemory(Long memory) {
    this.memory = memory;
  }


  public Vm memoryUsage(Double memoryUsage) {
    
    this.memoryUsage = memoryUsage;
    return this;
  }

   /**
   * Get memoryUsage
   * @return memoryUsage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getMemoryUsage() {
    return memoryUsage;
  }


  public void setMemoryUsage(Double memoryUsage) {
    this.memoryUsage = memoryUsage;
  }


  public Vm name(String name) {
    
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


  public Vm nestedVirtualization(Boolean nestedVirtualization) {
    
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


  public Vm nodeIp(String nodeIp) {
    
    this.nodeIp = nodeIp;
    return this;
  }

   /**
   * Get nodeIp
   * @return nodeIp
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getNodeIp() {
    return nodeIp;
  }


  public void setNodeIp(String nodeIp) {
    this.nodeIp = nodeIp;
  }


  public Vm originalName(String originalName) {
    
    this.originalName = originalName;
    return this;
  }

   /**
   * Get originalName
   * @return originalName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getOriginalName() {
    return originalName;
  }


  public void setOriginalName(String originalName) {
    this.originalName = originalName;
  }


  public Vm os(String os) {
    
    this.os = os;
    return this;
  }

   /**
   * Get os
   * @return os
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getOs() {
    return os;
  }


  public void setOs(String os) {
    this.os = os;
  }


  public Vm outUninstallUsb(List<String> outUninstallUsb) {
    
    this.outUninstallUsb = outUninstallUsb;
    return this;
  }

  public Vm addOutUninstallUsbItem(String outUninstallUsbItem) {
    this.outUninstallUsb.add(outUninstallUsbItem);
    return this;
  }

   /**
   * Get outUninstallUsb
   * @return outUninstallUsb
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<String> getOutUninstallUsb() {
    return outUninstallUsb;
  }


  public void setOutUninstallUsb(List<String> outUninstallUsb) {
    this.outUninstallUsb = outUninstallUsb;
  }


  public Vm pciNics(List<NestedNic> pciNics) {
    
    this.pciNics = pciNics;
    return this;
  }

  public Vm addPciNicsItem(NestedNic pciNicsItem) {
    if (this.pciNics == null) {
      this.pciNics = new ArrayList<NestedNic>();
    }
    this.pciNics.add(pciNicsItem);
    return this;
  }

   /**
   * Get pciNics
   * @return pciNics
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<NestedNic> getPciNics() {
    return pciNics;
  }


  public void setPciNics(List<NestedNic> pciNics) {
    this.pciNics = pciNics;
  }


  public Vm _protected(Boolean _protected) {
    
    this._protected = _protected;
    return this;
  }

   /**
   * Get _protected
   * @return _protected
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boolean getProtected() {
    return _protected;
  }


  public void setProtected(Boolean _protected) {
    this._protected = _protected;
  }


  public Vm provisionedSize(Long provisionedSize) {
    
    this.provisionedSize = provisionedSize;
    return this;
  }

   /**
   * Get provisionedSize
   * @return provisionedSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getProvisionedSize() {
    return provisionedSize;
  }


  public void setProvisionedSize(Long provisionedSize) {
    this.provisionedSize = provisionedSize;
  }


  public Vm size(Long size) {
    
    this.size = size;
    return this;
  }

   /**
   * Get size
   * @return size
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getSize() {
    return size;
  }


  public void setSize(Long size) {
    this.size = size;
  }


  public Vm snapshots(List<NestedVmSnapshot> snapshots) {
    
    this.snapshots = snapshots;
    return this;
  }

  public Vm addSnapshotsItem(NestedVmSnapshot snapshotsItem) {
    if (this.snapshots == null) {
      this.snapshots = new ArrayList<NestedVmSnapshot>();
    }
    this.snapshots.add(snapshotsItem);
    return this;
  }

   /**
   * Get snapshots
   * @return snapshots
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<NestedVmSnapshot> getSnapshots() {
    return snapshots;
  }


  public void setSnapshots(List<NestedVmSnapshot> snapshots) {
    this.snapshots = snapshots;
  }


  public Vm status(VmStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public VmStatus getStatus() {
    return status;
  }


  public void setStatus(VmStatus status) {
    this.status = status;
  }


  public Vm uniqueLogicalSize(Double uniqueLogicalSize) {
    
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


  public Vm uniqueSize(Long uniqueSize) {
    
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


  public Vm usbDevices(List<NestedUsbDevice> usbDevices) {
    
    this.usbDevices = usbDevices;
    return this;
  }

  public Vm addUsbDevicesItem(NestedUsbDevice usbDevicesItem) {
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


  public Vm vcpu(Integer vcpu) {
    
    this.vcpu = vcpu;
    return this;
  }

   /**
   * Get vcpu
   * @return vcpu
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getVcpu() {
    return vcpu;
  }


  public void setVcpu(Integer vcpu) {
    this.vcpu = vcpu;
  }


  public Vm videoType(VmVideoType videoType) {
    
    this.videoType = videoType;
    return this;
  }

   /**
   * Get videoType
   * @return videoType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VmVideoType getVideoType() {
    return videoType;
  }


  public void setVideoType(VmVideoType videoType) {
    this.videoType = videoType;
  }


  public Vm vmDisks(List<NestedVmDisk> vmDisks) {
    
    this.vmDisks = vmDisks;
    return this;
  }

  public Vm addVmDisksItem(NestedVmDisk vmDisksItem) {
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


  public Vm vmNics(List<NestedVmNic> vmNics) {
    
    this.vmNics = vmNics;
    return this;
  }

  public Vm addVmNicsItem(NestedVmNic vmNicsItem) {
    if (this.vmNics == null) {
      this.vmNics = new ArrayList<NestedVmNic>();
    }
    this.vmNics.add(vmNicsItem);
    return this;
  }

   /**
   * Get vmNics
   * @return vmNics
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<NestedVmNic> getVmNics() {
    return vmNics;
  }


  public void setVmNics(List<NestedVmNic> vmNics) {
    this.vmNics = vmNics;
  }


  public Vm vmPlacementGroup(List<NestedVmPlacementGroup> vmPlacementGroup) {
    
    this.vmPlacementGroup = vmPlacementGroup;
    return this;
  }

  public Vm addVmPlacementGroupItem(NestedVmPlacementGroup vmPlacementGroupItem) {
    if (this.vmPlacementGroup == null) {
      this.vmPlacementGroup = new ArrayList<NestedVmPlacementGroup>();
    }
    this.vmPlacementGroup.add(vmPlacementGroupItem);
    return this;
  }

   /**
   * Get vmPlacementGroup
   * @return vmPlacementGroup
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<NestedVmPlacementGroup> getVmPlacementGroup() {
    return vmPlacementGroup;
  }


  public void setVmPlacementGroup(List<NestedVmPlacementGroup> vmPlacementGroup) {
    this.vmPlacementGroup = vmPlacementGroup;
  }


  public Vm vmToolsStatus(VmToolsStatus vmToolsStatus) {
    
    this.vmToolsStatus = vmToolsStatus;
    return this;
  }

   /**
   * Get vmToolsStatus
   * @return vmToolsStatus
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public VmToolsStatus getVmToolsStatus() {
    return vmToolsStatus;
  }


  public void setVmToolsStatus(VmToolsStatus vmToolsStatus) {
    this.vmToolsStatus = vmToolsStatus;
  }


  public Vm vmToolsVersion(String vmToolsVersion) {
    
    this.vmToolsVersion = vmToolsVersion;
    return this;
  }

   /**
   * Get vmToolsVersion
   * @return vmToolsVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getVmToolsVersion() {
    return vmToolsVersion;
  }


  public void setVmToolsVersion(String vmToolsVersion) {
    this.vmToolsVersion = vmToolsVersion;
  }


  public Vm vmUsage(VmUsage vmUsage) {
    
    this.vmUsage = vmUsage;
    return this;
  }

   /**
   * Get vmUsage
   * @return vmUsage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VmUsage getVmUsage() {
    return vmUsage;
  }


  public void setVmUsage(VmUsage vmUsage) {
    this.vmUsage = vmUsage;
  }


  public Vm winOpt(Boolean winOpt) {
    
    this.winOpt = winOpt;
    return this;
  }

   /**
   * Get winOpt
   * @return winOpt
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boolean getWinOpt() {
    return winOpt;
  }


  public void setWinOpt(Boolean winOpt) {
    this.winOpt = winOpt;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Vm vm = (Vm) o;
    return Objects.equals(this.biosUuid, vm.biosUuid) &&
        Objects.equals(this.clockOffset, vm.clockOffset) &&
        Objects.equals(this.cloudInitSupported, vm.cloudInitSupported) &&
        Objects.equals(this.cluster, vm.cluster) &&
        Objects.equals(this.cpu, vm.cpu) &&
        Objects.equals(this.cpuModel, vm.cpuModel) &&
        Objects.equals(this.cpuUsage, vm.cpuUsage) &&
        Objects.equals(this.deletedAt, vm.deletedAt) &&
        Objects.equals(this.description, vm.description) &&
        Objects.equals(this.dnsServers, vm.dnsServers) &&
        Objects.equals(this.entityAsyncStatus, vm.entityAsyncStatus) &&
        Objects.equals(this.firmware, vm.firmware) &&
        Objects.equals(this.folder, vm.folder) &&
        Objects.equals(this.gpuDevices, vm.gpuDevices) &&
        Objects.equals(this.guestCpuModel, vm.guestCpuModel) &&
        Objects.equals(this.guestOsType, vm.guestOsType) &&
        Objects.equals(this.guestSizeUsage, vm.guestSizeUsage) &&
        Objects.equals(this.guestUsedSize, vm.guestUsedSize) &&
        Objects.equals(this.ha, vm.ha) &&
        Objects.equals(this.host, vm.host) &&
        Objects.equals(this.hostname, vm.hostname) &&
        Objects.equals(this.id, vm.id) &&
        Objects.equals(this.inRecycleBin, vm.inRecycleBin) &&
        Objects.equals(this.internal, vm.internal) &&
        Objects.equals(this.ioPolicy, vm.ioPolicy) &&
        Objects.equals(this.ips, vm.ips) &&
        Objects.equals(this.kernelInfo, vm.kernelInfo) &&
        Objects.equals(this.labels, vm.labels) &&
        Objects.equals(this.lastShutdownTime, vm.lastShutdownTime) &&
        Objects.equals(this.localCreatedAt, vm.localCreatedAt) &&
        Objects.equals(this.localId, vm.localId) &&
        Objects.equals(this.logicalSizeBytes, vm.logicalSizeBytes) &&
        Objects.equals(this.maxBandwidth, vm.maxBandwidth) &&
        Objects.equals(this.maxBandwidthPolicy, vm.maxBandwidthPolicy) &&
        Objects.equals(this.maxIops, vm.maxIops) &&
        Objects.equals(this.maxIopsPolicy, vm.maxIopsPolicy) &&
        Objects.equals(this.memory, vm.memory) &&
        Objects.equals(this.memoryUsage, vm.memoryUsage) &&
        Objects.equals(this.name, vm.name) &&
        Objects.equals(this.nestedVirtualization, vm.nestedVirtualization) &&
        Objects.equals(this.nodeIp, vm.nodeIp) &&
        Objects.equals(this.originalName, vm.originalName) &&
        Objects.equals(this.os, vm.os) &&
        Objects.equals(this.outUninstallUsb, vm.outUninstallUsb) &&
        Objects.equals(this.pciNics, vm.pciNics) &&
        Objects.equals(this._protected, vm._protected) &&
        Objects.equals(this.provisionedSize, vm.provisionedSize) &&
        Objects.equals(this.size, vm.size) &&
        Objects.equals(this.snapshots, vm.snapshots) &&
        Objects.equals(this.status, vm.status) &&
        Objects.equals(this.uniqueLogicalSize, vm.uniqueLogicalSize) &&
        Objects.equals(this.uniqueSize, vm.uniqueSize) &&
        Objects.equals(this.usbDevices, vm.usbDevices) &&
        Objects.equals(this.vcpu, vm.vcpu) &&
        Objects.equals(this.videoType, vm.videoType) &&
        Objects.equals(this.vmDisks, vm.vmDisks) &&
        Objects.equals(this.vmNics, vm.vmNics) &&
        Objects.equals(this.vmPlacementGroup, vm.vmPlacementGroup) &&
        Objects.equals(this.vmToolsStatus, vm.vmToolsStatus) &&
        Objects.equals(this.vmToolsVersion, vm.vmToolsVersion) &&
        Objects.equals(this.vmUsage, vm.vmUsage) &&
        Objects.equals(this.winOpt, vm.winOpt);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(biosUuid, clockOffset, cloudInitSupported, cluster, cpu, cpuModel, cpuUsage, deletedAt, description, dnsServers, entityAsyncStatus, firmware, folder, gpuDevices, guestCpuModel, guestOsType, guestSizeUsage, guestUsedSize, ha, host, hostname, id, inRecycleBin, internal, ioPolicy, ips, kernelInfo, labels, lastShutdownTime, localCreatedAt, localId, logicalSizeBytes, maxBandwidth, maxBandwidthPolicy, maxIops, maxIopsPolicy, memory, memoryUsage, name, nestedVirtualization, nodeIp, originalName, os, outUninstallUsb, pciNics, _protected, provisionedSize, size, snapshots, status, uniqueLogicalSize, uniqueSize, usbDevices, vcpu, videoType, vmDisks, vmNics, vmPlacementGroup, vmToolsStatus, vmToolsVersion, vmUsage, winOpt);
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
    sb.append("class Vm {\n");
    sb.append("    biosUuid: ").append(toIndentedString(biosUuid)).append("\n");
    sb.append("    clockOffset: ").append(toIndentedString(clockOffset)).append("\n");
    sb.append("    cloudInitSupported: ").append(toIndentedString(cloudInitSupported)).append("\n");
    sb.append("    cluster: ").append(toIndentedString(cluster)).append("\n");
    sb.append("    cpu: ").append(toIndentedString(cpu)).append("\n");
    sb.append("    cpuModel: ").append(toIndentedString(cpuModel)).append("\n");
    sb.append("    cpuUsage: ").append(toIndentedString(cpuUsage)).append("\n");
    sb.append("    deletedAt: ").append(toIndentedString(deletedAt)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    dnsServers: ").append(toIndentedString(dnsServers)).append("\n");
    sb.append("    entityAsyncStatus: ").append(toIndentedString(entityAsyncStatus)).append("\n");
    sb.append("    firmware: ").append(toIndentedString(firmware)).append("\n");
    sb.append("    folder: ").append(toIndentedString(folder)).append("\n");
    sb.append("    gpuDevices: ").append(toIndentedString(gpuDevices)).append("\n");
    sb.append("    guestCpuModel: ").append(toIndentedString(guestCpuModel)).append("\n");
    sb.append("    guestOsType: ").append(toIndentedString(guestOsType)).append("\n");
    sb.append("    guestSizeUsage: ").append(toIndentedString(guestSizeUsage)).append("\n");
    sb.append("    guestUsedSize: ").append(toIndentedString(guestUsedSize)).append("\n");
    sb.append("    ha: ").append(toIndentedString(ha)).append("\n");
    sb.append("    host: ").append(toIndentedString(host)).append("\n");
    sb.append("    hostname: ").append(toIndentedString(hostname)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    inRecycleBin: ").append(toIndentedString(inRecycleBin)).append("\n");
    sb.append("    internal: ").append(toIndentedString(internal)).append("\n");
    sb.append("    ioPolicy: ").append(toIndentedString(ioPolicy)).append("\n");
    sb.append("    ips: ").append(toIndentedString(ips)).append("\n");
    sb.append("    kernelInfo: ").append(toIndentedString(kernelInfo)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    lastShutdownTime: ").append(toIndentedString(lastShutdownTime)).append("\n");
    sb.append("    localCreatedAt: ").append(toIndentedString(localCreatedAt)).append("\n");
    sb.append("    localId: ").append(toIndentedString(localId)).append("\n");
    sb.append("    logicalSizeBytes: ").append(toIndentedString(logicalSizeBytes)).append("\n");
    sb.append("    maxBandwidth: ").append(toIndentedString(maxBandwidth)).append("\n");
    sb.append("    maxBandwidthPolicy: ").append(toIndentedString(maxBandwidthPolicy)).append("\n");
    sb.append("    maxIops: ").append(toIndentedString(maxIops)).append("\n");
    sb.append("    maxIopsPolicy: ").append(toIndentedString(maxIopsPolicy)).append("\n");
    sb.append("    memory: ").append(toIndentedString(memory)).append("\n");
    sb.append("    memoryUsage: ").append(toIndentedString(memoryUsage)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    nestedVirtualization: ").append(toIndentedString(nestedVirtualization)).append("\n");
    sb.append("    nodeIp: ").append(toIndentedString(nodeIp)).append("\n");
    sb.append("    originalName: ").append(toIndentedString(originalName)).append("\n");
    sb.append("    os: ").append(toIndentedString(os)).append("\n");
    sb.append("    outUninstallUsb: ").append(toIndentedString(outUninstallUsb)).append("\n");
    sb.append("    pciNics: ").append(toIndentedString(pciNics)).append("\n");
    sb.append("    _protected: ").append(toIndentedString(_protected)).append("\n");
    sb.append("    provisionedSize: ").append(toIndentedString(provisionedSize)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    snapshots: ").append(toIndentedString(snapshots)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    uniqueLogicalSize: ").append(toIndentedString(uniqueLogicalSize)).append("\n");
    sb.append("    uniqueSize: ").append(toIndentedString(uniqueSize)).append("\n");
    sb.append("    usbDevices: ").append(toIndentedString(usbDevices)).append("\n");
    sb.append("    vcpu: ").append(toIndentedString(vcpu)).append("\n");
    sb.append("    videoType: ").append(toIndentedString(videoType)).append("\n");
    sb.append("    vmDisks: ").append(toIndentedString(vmDisks)).append("\n");
    sb.append("    vmNics: ").append(toIndentedString(vmNics)).append("\n");
    sb.append("    vmPlacementGroup: ").append(toIndentedString(vmPlacementGroup)).append("\n");
    sb.append("    vmToolsStatus: ").append(toIndentedString(vmToolsStatus)).append("\n");
    sb.append("    vmToolsVersion: ").append(toIndentedString(vmToolsVersion)).append("\n");
    sb.append("    vmUsage: ").append(toIndentedString(vmUsage)).append("\n");
    sb.append("    winOpt: ").append(toIndentedString(winOpt)).append("\n");
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

