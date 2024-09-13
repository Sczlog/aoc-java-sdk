package com.arcfra.aoc.model;

import java.util.Objects;
import java.util.Arrays;
import com.arcfra.aoc.model.BPSUnit;
import com.arcfra.aoc.model.ByteUnit;
import com.arcfra.aoc.model.NicWhereInput;
import com.arcfra.aoc.model.TemplateCloudInit;
import com.arcfra.aoc.model.VmDiskIoPolicy;
import com.arcfra.aoc.model.VmDiskIoRestrictType;
import com.arcfra.aoc.model.VmDiskOperate;
import com.arcfra.aoc.model.VmFirmware;
import com.arcfra.aoc.model.VmGpuOperationParams;
import com.arcfra.aoc.model.VmGuestsOperationSystem;
import com.arcfra.aoc.model.VmNicParams;
import com.arcfra.aoc.model.VmOwnerParams;
import com.arcfra.aoc.model.VmPlacementGroupWhereInput;
import com.arcfra.aoc.model.VmStatus;
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

/**
 * VmCreateVmFromContentLibraryTemplateParams
 */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class VmCreateVmFromContentLibraryTemplateParams {
  public static final String SERIALIZED_NAME_OWNER = "owner";
  @SerializedName(SERIALIZED_NAME_OWNER)
  private VmOwnerParams owner;

  public static final String SERIALIZED_NAME_GPU_DEVICES = "gpu_devices";
  @SerializedName(SERIALIZED_NAME_GPU_DEVICES)
  private List<VmGpuOperationParams> gpuDevices = null;

  public static final String SERIALIZED_NAME_CLOUD_INIT = "cloud_init";
  @SerializedName(SERIALIZED_NAME_CLOUD_INIT)
  private TemplateCloudInit cloudInit;

  public static final String SERIALIZED_NAME_IS_FULL_COPY = "is_full_copy";
  @SerializedName(SERIALIZED_NAME_IS_FULL_COPY)
  private Boolean isFullCopy;

  public static final String SERIALIZED_NAME_TEMPLATE_ID = "template_id";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_ID)
  private String templateId;

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

  public static final String SERIALIZED_NAME_VCPU = "vcpu";
  @SerializedName(SERIALIZED_NAME_VCPU)
  private Integer vcpu;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private VmStatus status;

  public static final String SERIALIZED_NAME_FIRMWARE = "firmware";
  @SerializedName(SERIALIZED_NAME_FIRMWARE)
  private VmFirmware firmware;

  public static final String SERIALIZED_NAME_HA = "ha";
  @SerializedName(SERIALIZED_NAME_HA)
  private Boolean ha;

  public static final String SERIALIZED_NAME_PCI_NICS = "pci_nics";
  @SerializedName(SERIALIZED_NAME_PCI_NICS)
  private NicWhereInput pciNics;

  public static final String SERIALIZED_NAME_VM_PLACEMENT_GROUP = "vm_placement_group";
  @SerializedName(SERIALIZED_NAME_VM_PLACEMENT_GROUP)
  private VmPlacementGroupWhereInput vmPlacementGroup;

  public static final String SERIALIZED_NAME_VM_NICS = "vm_nics";
  @SerializedName(SERIALIZED_NAME_VM_NICS)
  private List<VmNicParams> vmNics = null;

  public static final String SERIALIZED_NAME_DISK_OPERATE = "disk_operate";
  @SerializedName(SERIALIZED_NAME_DISK_OPERATE)
  private VmDiskOperate diskOperate;

  public static final String SERIALIZED_NAME_MEMORY_UNIT = "memory_unit";
  @SerializedName(SERIALIZED_NAME_MEMORY_UNIT)
  private ByteUnit memoryUnit;

  public static final String SERIALIZED_NAME_MEMORY = "memory";
  @SerializedName(SERIALIZED_NAME_MEMORY)
  private Long memory;

  public static final String SERIALIZED_NAME_CPU_CORES = "cpu_cores";
  @SerializedName(SERIALIZED_NAME_CPU_CORES)
  private Integer cpuCores;

  public static final String SERIALIZED_NAME_CPU_SOCKETS = "cpu_sockets";
  @SerializedName(SERIALIZED_NAME_CPU_SOCKETS)
  private Integer cpuSockets;

  public static final String SERIALIZED_NAME_GUEST_OS_TYPE = "guest_os_type";
  @SerializedName(SERIALIZED_NAME_GUEST_OS_TYPE)
  private VmGuestsOperationSystem guestOsType;

  public static final String SERIALIZED_NAME_FOLDER_ID = "folder_id";
  @SerializedName(SERIALIZED_NAME_FOLDER_ID)
  private String folderId;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_HOST_ID = "host_id";
  @SerializedName(SERIALIZED_NAME_HOST_ID)
  private String hostId;

  public static final String SERIALIZED_NAME_CLUSTER_ID = "cluster_id";
  @SerializedName(SERIALIZED_NAME_CLUSTER_ID)
  private String clusterId;

  public VmCreateVmFromContentLibraryTemplateParams() { 
  }

  public VmCreateVmFromContentLibraryTemplateParams owner(VmOwnerParams owner) {
    
    this.owner = owner;
    return this;
  }

   /**
   * Get owner
   * @return owner
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VmOwnerParams getOwner() {
    return owner;
  }


  public void setOwner(VmOwnerParams owner) {
    this.owner = owner;
  }


  public VmCreateVmFromContentLibraryTemplateParams gpuDevices(List<VmGpuOperationParams> gpuDevices) {
    
    this.gpuDevices = gpuDevices;
    return this;
  }

  public VmCreateVmFromContentLibraryTemplateParams addGpuDevicesItem(VmGpuOperationParams gpuDevicesItem) {
    if (this.gpuDevices == null) {
      this.gpuDevices = new ArrayList<VmGpuOperationParams>();
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

  public List<VmGpuOperationParams> getGpuDevices() {
    return gpuDevices;
  }


  public void setGpuDevices(List<VmGpuOperationParams> gpuDevices) {
    this.gpuDevices = gpuDevices;
  }


  public VmCreateVmFromContentLibraryTemplateParams cloudInit(TemplateCloudInit cloudInit) {
    
    this.cloudInit = cloudInit;
    return this;
  }

   /**
   * Get cloudInit
   * @return cloudInit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TemplateCloudInit getCloudInit() {
    return cloudInit;
  }


  public void setCloudInit(TemplateCloudInit cloudInit) {
    this.cloudInit = cloudInit;
  }


  public VmCreateVmFromContentLibraryTemplateParams isFullCopy(Boolean isFullCopy) {
    
    this.isFullCopy = isFullCopy;
    return this;
  }

   /**
   * Get isFullCopy
   * @return isFullCopy
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boolean getIsFullCopy() {
    return isFullCopy;
  }


  public void setIsFullCopy(Boolean isFullCopy) {
    this.isFullCopy = isFullCopy;
  }


  public VmCreateVmFromContentLibraryTemplateParams templateId(String templateId) {
    
    this.templateId = templateId;
    return this;
  }

   /**
   * Get templateId
   * @return templateId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getTemplateId() {
    return templateId;
  }


  public void setTemplateId(String templateId) {
    this.templateId = templateId;
  }


  public VmCreateVmFromContentLibraryTemplateParams maxBandwidthPolicy(VmDiskIoRestrictType maxBandwidthPolicy) {
    
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


  public VmCreateVmFromContentLibraryTemplateParams maxBandwidthUnit(BPSUnit maxBandwidthUnit) {
    
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


  public VmCreateVmFromContentLibraryTemplateParams maxBandwidth(Long maxBandwidth) {
    
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


  public VmCreateVmFromContentLibraryTemplateParams maxIopsPolicy(VmDiskIoRestrictType maxIopsPolicy) {
    
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


  public VmCreateVmFromContentLibraryTemplateParams maxIops(Long maxIops) {
    
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


  public VmCreateVmFromContentLibraryTemplateParams ioPolicy(VmDiskIoPolicy ioPolicy) {
    
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


  public VmCreateVmFromContentLibraryTemplateParams vcpu(Integer vcpu) {
    
    this.vcpu = vcpu;
    return this;
  }

   /**
   * Get vcpu
   * @return vcpu
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getVcpu() {
    return vcpu;
  }


  public void setVcpu(Integer vcpu) {
    this.vcpu = vcpu;
  }


  public VmCreateVmFromContentLibraryTemplateParams status(VmStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VmStatus getStatus() {
    return status;
  }


  public void setStatus(VmStatus status) {
    this.status = status;
  }


  public VmCreateVmFromContentLibraryTemplateParams firmware(VmFirmware firmware) {
    
    this.firmware = firmware;
    return this;
  }

   /**
   * Get firmware
   * @return firmware
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VmFirmware getFirmware() {
    return firmware;
  }


  public void setFirmware(VmFirmware firmware) {
    this.firmware = firmware;
  }


  public VmCreateVmFromContentLibraryTemplateParams ha(Boolean ha) {
    
    this.ha = ha;
    return this;
  }

   /**
   * Get ha
   * @return ha
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getHa() {
    return ha;
  }


  public void setHa(Boolean ha) {
    this.ha = ha;
  }


  public VmCreateVmFromContentLibraryTemplateParams pciNics(NicWhereInput pciNics) {
    
    this.pciNics = pciNics;
    return this;
  }

   /**
   * Get pciNics
   * @return pciNics
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public NicWhereInput getPciNics() {
    return pciNics;
  }


  public void setPciNics(NicWhereInput pciNics) {
    this.pciNics = pciNics;
  }


  public VmCreateVmFromContentLibraryTemplateParams vmPlacementGroup(VmPlacementGroupWhereInput vmPlacementGroup) {
    
    this.vmPlacementGroup = vmPlacementGroup;
    return this;
  }

   /**
   * Get vmPlacementGroup
   * @return vmPlacementGroup
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VmPlacementGroupWhereInput getVmPlacementGroup() {
    return vmPlacementGroup;
  }


  public void setVmPlacementGroup(VmPlacementGroupWhereInput vmPlacementGroup) {
    this.vmPlacementGroup = vmPlacementGroup;
  }


  public VmCreateVmFromContentLibraryTemplateParams vmNics(List<VmNicParams> vmNics) {
    
    this.vmNics = vmNics;
    return this;
  }

  public VmCreateVmFromContentLibraryTemplateParams addVmNicsItem(VmNicParams vmNicsItem) {
    if (this.vmNics == null) {
      this.vmNics = new ArrayList<VmNicParams>();
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

  public List<VmNicParams> getVmNics() {
    return vmNics;
  }


  public void setVmNics(List<VmNicParams> vmNics) {
    this.vmNics = vmNics;
  }


  public VmCreateVmFromContentLibraryTemplateParams diskOperate(VmDiskOperate diskOperate) {
    
    this.diskOperate = diskOperate;
    return this;
  }

   /**
   * Get diskOperate
   * @return diskOperate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VmDiskOperate getDiskOperate() {
    return diskOperate;
  }


  public void setDiskOperate(VmDiskOperate diskOperate) {
    this.diskOperate = diskOperate;
  }


  public VmCreateVmFromContentLibraryTemplateParams memoryUnit(ByteUnit memoryUnit) {
    
    this.memoryUnit = memoryUnit;
    return this;
  }

   /**
   * Get memoryUnit
   * @return memoryUnit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ByteUnit getMemoryUnit() {
    return memoryUnit;
  }


  public void setMemoryUnit(ByteUnit memoryUnit) {
    this.memoryUnit = memoryUnit;
  }


  public VmCreateVmFromContentLibraryTemplateParams memory(Long memory) {
    
    this.memory = memory;
    return this;
  }

   /**
   * Get memory
   * @return memory
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getMemory() {
    return memory;
  }


  public void setMemory(Long memory) {
    this.memory = memory;
  }


  public VmCreateVmFromContentLibraryTemplateParams cpuCores(Integer cpuCores) {
    
    this.cpuCores = cpuCores;
    return this;
  }

   /**
   * Get cpuCores
   * @return cpuCores
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getCpuCores() {
    return cpuCores;
  }


  public void setCpuCores(Integer cpuCores) {
    this.cpuCores = cpuCores;
  }


  public VmCreateVmFromContentLibraryTemplateParams cpuSockets(Integer cpuSockets) {
    
    this.cpuSockets = cpuSockets;
    return this;
  }

   /**
   * Get cpuSockets
   * @return cpuSockets
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getCpuSockets() {
    return cpuSockets;
  }


  public void setCpuSockets(Integer cpuSockets) {
    this.cpuSockets = cpuSockets;
  }


  public VmCreateVmFromContentLibraryTemplateParams guestOsType(VmGuestsOperationSystem guestOsType) {
    
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


  public VmCreateVmFromContentLibraryTemplateParams folderId(String folderId) {
    
    this.folderId = folderId;
    return this;
  }

   /**
   * Get folderId
   * @return folderId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getFolderId() {
    return folderId;
  }


  public void setFolderId(String folderId) {
    this.folderId = folderId;
  }


  public VmCreateVmFromContentLibraryTemplateParams description(String description) {
    
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


  public VmCreateVmFromContentLibraryTemplateParams name(String name) {
    
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


  public VmCreateVmFromContentLibraryTemplateParams hostId(String hostId) {
    
    this.hostId = hostId;
    return this;
  }

   /**
   * Get hostId
   * @return hostId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getHostId() {
    return hostId;
  }


  public void setHostId(String hostId) {
    this.hostId = hostId;
  }


  public VmCreateVmFromContentLibraryTemplateParams clusterId(String clusterId) {
    
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
    VmCreateVmFromContentLibraryTemplateParams vmCreateVmFromContentLibraryTemplateParams = (VmCreateVmFromContentLibraryTemplateParams) o;
    return Objects.equals(this.owner, vmCreateVmFromContentLibraryTemplateParams.owner) &&
        Objects.equals(this.gpuDevices, vmCreateVmFromContentLibraryTemplateParams.gpuDevices) &&
        Objects.equals(this.cloudInit, vmCreateVmFromContentLibraryTemplateParams.cloudInit) &&
        Objects.equals(this.isFullCopy, vmCreateVmFromContentLibraryTemplateParams.isFullCopy) &&
        Objects.equals(this.templateId, vmCreateVmFromContentLibraryTemplateParams.templateId) &&
        Objects.equals(this.maxBandwidthPolicy, vmCreateVmFromContentLibraryTemplateParams.maxBandwidthPolicy) &&
        Objects.equals(this.maxBandwidthUnit, vmCreateVmFromContentLibraryTemplateParams.maxBandwidthUnit) &&
        Objects.equals(this.maxBandwidth, vmCreateVmFromContentLibraryTemplateParams.maxBandwidth) &&
        Objects.equals(this.maxIopsPolicy, vmCreateVmFromContentLibraryTemplateParams.maxIopsPolicy) &&
        Objects.equals(this.maxIops, vmCreateVmFromContentLibraryTemplateParams.maxIops) &&
        Objects.equals(this.ioPolicy, vmCreateVmFromContentLibraryTemplateParams.ioPolicy) &&
        Objects.equals(this.vcpu, vmCreateVmFromContentLibraryTemplateParams.vcpu) &&
        Objects.equals(this.status, vmCreateVmFromContentLibraryTemplateParams.status) &&
        Objects.equals(this.firmware, vmCreateVmFromContentLibraryTemplateParams.firmware) &&
        Objects.equals(this.ha, vmCreateVmFromContentLibraryTemplateParams.ha) &&
        Objects.equals(this.pciNics, vmCreateVmFromContentLibraryTemplateParams.pciNics) &&
        Objects.equals(this.vmPlacementGroup, vmCreateVmFromContentLibraryTemplateParams.vmPlacementGroup) &&
        Objects.equals(this.vmNics, vmCreateVmFromContentLibraryTemplateParams.vmNics) &&
        Objects.equals(this.diskOperate, vmCreateVmFromContentLibraryTemplateParams.diskOperate) &&
        Objects.equals(this.memoryUnit, vmCreateVmFromContentLibraryTemplateParams.memoryUnit) &&
        Objects.equals(this.memory, vmCreateVmFromContentLibraryTemplateParams.memory) &&
        Objects.equals(this.cpuCores, vmCreateVmFromContentLibraryTemplateParams.cpuCores) &&
        Objects.equals(this.cpuSockets, vmCreateVmFromContentLibraryTemplateParams.cpuSockets) &&
        Objects.equals(this.guestOsType, vmCreateVmFromContentLibraryTemplateParams.guestOsType) &&
        Objects.equals(this.folderId, vmCreateVmFromContentLibraryTemplateParams.folderId) &&
        Objects.equals(this.description, vmCreateVmFromContentLibraryTemplateParams.description) &&
        Objects.equals(this.name, vmCreateVmFromContentLibraryTemplateParams.name) &&
        Objects.equals(this.hostId, vmCreateVmFromContentLibraryTemplateParams.hostId) &&
        Objects.equals(this.clusterId, vmCreateVmFromContentLibraryTemplateParams.clusterId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(owner, gpuDevices, cloudInit, isFullCopy, templateId, maxBandwidthPolicy, maxBandwidthUnit, maxBandwidth, maxIopsPolicy, maxIops, ioPolicy, vcpu, status, firmware, ha, pciNics, vmPlacementGroup, vmNics, diskOperate, memoryUnit, memory, cpuCores, cpuSockets, guestOsType, folderId, description, name, hostId, clusterId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VmCreateVmFromContentLibraryTemplateParams {\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    gpuDevices: ").append(toIndentedString(gpuDevices)).append("\n");
    sb.append("    cloudInit: ").append(toIndentedString(cloudInit)).append("\n");
    sb.append("    isFullCopy: ").append(toIndentedString(isFullCopy)).append("\n");
    sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
    sb.append("    maxBandwidthPolicy: ").append(toIndentedString(maxBandwidthPolicy)).append("\n");
    sb.append("    maxBandwidthUnit: ").append(toIndentedString(maxBandwidthUnit)).append("\n");
    sb.append("    maxBandwidth: ").append(toIndentedString(maxBandwidth)).append("\n");
    sb.append("    maxIopsPolicy: ").append(toIndentedString(maxIopsPolicy)).append("\n");
    sb.append("    maxIops: ").append(toIndentedString(maxIops)).append("\n");
    sb.append("    ioPolicy: ").append(toIndentedString(ioPolicy)).append("\n");
    sb.append("    vcpu: ").append(toIndentedString(vcpu)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    firmware: ").append(toIndentedString(firmware)).append("\n");
    sb.append("    ha: ").append(toIndentedString(ha)).append("\n");
    sb.append("    pciNics: ").append(toIndentedString(pciNics)).append("\n");
    sb.append("    vmPlacementGroup: ").append(toIndentedString(vmPlacementGroup)).append("\n");
    sb.append("    vmNics: ").append(toIndentedString(vmNics)).append("\n");
    sb.append("    diskOperate: ").append(toIndentedString(diskOperate)).append("\n");
    sb.append("    memoryUnit: ").append(toIndentedString(memoryUnit)).append("\n");
    sb.append("    memory: ").append(toIndentedString(memory)).append("\n");
    sb.append("    cpuCores: ").append(toIndentedString(cpuCores)).append("\n");
    sb.append("    cpuSockets: ").append(toIndentedString(cpuSockets)).append("\n");
    sb.append("    guestOsType: ").append(toIndentedString(guestOsType)).append("\n");
    sb.append("    folderId: ").append(toIndentedString(folderId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    hostId: ").append(toIndentedString(hostId)).append("\n");
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

