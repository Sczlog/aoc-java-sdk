package com.arcfra.aoc.model;

import java.util.Objects;
import java.util.Arrays;
import com.arcfra.aoc.model.BPSUnit;
import com.arcfra.aoc.model.ByteUnit;
import com.arcfra.aoc.model.OvfDiskOperate;
import com.arcfra.aoc.model.ParsedOVF;
import com.arcfra.aoc.model.VmDiskIoPolicy;
import com.arcfra.aoc.model.VmDiskIoRestrictType;
import com.arcfra.aoc.model.VmGuestsOperationSystem;
import com.arcfra.aoc.model.VmImportNicParams;
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
 * VmImportParams
 */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class VmImportParams {
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

  public static final String SERIALIZED_NAME_HA = "ha";
  @SerializedName(SERIALIZED_NAME_HA)
  private Boolean ha;

  public static final String SERIALIZED_NAME_VM_NICS = "vm_nics";
  @SerializedName(SERIALIZED_NAME_VM_NICS)
  private List<VmImportNicParams> vmNics = null;

  public static final String SERIALIZED_NAME_DISK_OPERATE = "disk_operate";
  @SerializedName(SERIALIZED_NAME_DISK_OPERATE)
  private OvfDiskOperate diskOperate;

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

  public static final String SERIALIZED_NAME_UPLOAD_TASKS = "upload_tasks";
  @SerializedName(SERIALIZED_NAME_UPLOAD_TASKS)
  private List<String> uploadTasks = new ArrayList<String>();

  public static final String SERIALIZED_NAME_OWNER_ID = "owner_id";
  @SerializedName(SERIALIZED_NAME_OWNER_ID)
  private String ownerId;

  public static final String SERIALIZED_NAME_PARSED_OVF = "parsed_ovf";
  @SerializedName(SERIALIZED_NAME_PARSED_OVF)
  private ParsedOVF parsedOvf;

  public VmImportParams() { 
  }

  public VmImportParams maxBandwidthPolicy(VmDiskIoRestrictType maxBandwidthPolicy) {
    
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


  public VmImportParams maxBandwidthUnit(BPSUnit maxBandwidthUnit) {
    
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


  public VmImportParams maxBandwidth(Long maxBandwidth) {
    
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


  public VmImportParams maxIopsPolicy(VmDiskIoRestrictType maxIopsPolicy) {
    
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


  public VmImportParams maxIops(Long maxIops) {
    
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


  public VmImportParams ioPolicy(VmDiskIoPolicy ioPolicy) {
    
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


  public VmImportParams vcpu(Integer vcpu) {
    
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


  public VmImportParams status(VmStatus status) {
    
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


  public VmImportParams ha(Boolean ha) {
    
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


  public VmImportParams vmNics(List<VmImportNicParams> vmNics) {
    
    this.vmNics = vmNics;
    return this;
  }

  public VmImportParams addVmNicsItem(VmImportNicParams vmNicsItem) {
    if (this.vmNics == null) {
      this.vmNics = new ArrayList<VmImportNicParams>();
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

  public List<VmImportNicParams> getVmNics() {
    return vmNics;
  }


  public void setVmNics(List<VmImportNicParams> vmNics) {
    this.vmNics = vmNics;
  }


  public VmImportParams diskOperate(OvfDiskOperate diskOperate) {
    
    this.diskOperate = diskOperate;
    return this;
  }

   /**
   * Get diskOperate
   * @return diskOperate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OvfDiskOperate getDiskOperate() {
    return diskOperate;
  }


  public void setDiskOperate(OvfDiskOperate diskOperate) {
    this.diskOperate = diskOperate;
  }


  public VmImportParams memoryUnit(ByteUnit memoryUnit) {
    
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


  public VmImportParams memory(Long memory) {
    
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


  public VmImportParams cpuCores(Integer cpuCores) {
    
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


  public VmImportParams cpuSockets(Integer cpuSockets) {
    
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


  public VmImportParams guestOsType(VmGuestsOperationSystem guestOsType) {
    
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


  public VmImportParams folderId(String folderId) {
    
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


  public VmImportParams description(String description) {
    
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


  public VmImportParams name(String name) {
    
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


  public VmImportParams hostId(String hostId) {
    
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


  public VmImportParams clusterId(String clusterId) {
    
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


  public VmImportParams uploadTasks(List<String> uploadTasks) {
    
    this.uploadTasks = uploadTasks;
    return this;
  }

  public VmImportParams addUploadTasksItem(String uploadTasksItem) {
    this.uploadTasks.add(uploadTasksItem);
    return this;
  }

   /**
   * Get uploadTasks
   * @return uploadTasks
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<String> getUploadTasks() {
    return uploadTasks;
  }


  public void setUploadTasks(List<String> uploadTasks) {
    this.uploadTasks = uploadTasks;
  }


  public VmImportParams ownerId(String ownerId) {
    
    this.ownerId = ownerId;
    return this;
  }

   /**
   * Get ownerId
   * @return ownerId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getOwnerId() {
    return ownerId;
  }


  public void setOwnerId(String ownerId) {
    this.ownerId = ownerId;
  }


  public VmImportParams parsedOvf(ParsedOVF parsedOvf) {
    
    this.parsedOvf = parsedOvf;
    return this;
  }

   /**
   * Get parsedOvf
   * @return parsedOvf
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public ParsedOVF getParsedOvf() {
    return parsedOvf;
  }


  public void setParsedOvf(ParsedOVF parsedOvf) {
    this.parsedOvf = parsedOvf;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VmImportParams vmImportParams = (VmImportParams) o;
    return Objects.equals(this.maxBandwidthPolicy, vmImportParams.maxBandwidthPolicy) &&
        Objects.equals(this.maxBandwidthUnit, vmImportParams.maxBandwidthUnit) &&
        Objects.equals(this.maxBandwidth, vmImportParams.maxBandwidth) &&
        Objects.equals(this.maxIopsPolicy, vmImportParams.maxIopsPolicy) &&
        Objects.equals(this.maxIops, vmImportParams.maxIops) &&
        Objects.equals(this.ioPolicy, vmImportParams.ioPolicy) &&
        Objects.equals(this.vcpu, vmImportParams.vcpu) &&
        Objects.equals(this.status, vmImportParams.status) &&
        Objects.equals(this.ha, vmImportParams.ha) &&
        Objects.equals(this.vmNics, vmImportParams.vmNics) &&
        Objects.equals(this.diskOperate, vmImportParams.diskOperate) &&
        Objects.equals(this.memoryUnit, vmImportParams.memoryUnit) &&
        Objects.equals(this.memory, vmImportParams.memory) &&
        Objects.equals(this.cpuCores, vmImportParams.cpuCores) &&
        Objects.equals(this.cpuSockets, vmImportParams.cpuSockets) &&
        Objects.equals(this.guestOsType, vmImportParams.guestOsType) &&
        Objects.equals(this.folderId, vmImportParams.folderId) &&
        Objects.equals(this.description, vmImportParams.description) &&
        Objects.equals(this.name, vmImportParams.name) &&
        Objects.equals(this.hostId, vmImportParams.hostId) &&
        Objects.equals(this.clusterId, vmImportParams.clusterId) &&
        Objects.equals(this.uploadTasks, vmImportParams.uploadTasks) &&
        Objects.equals(this.ownerId, vmImportParams.ownerId) &&
        Objects.equals(this.parsedOvf, vmImportParams.parsedOvf);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxBandwidthPolicy, maxBandwidthUnit, maxBandwidth, maxIopsPolicy, maxIops, ioPolicy, vcpu, status, ha, vmNics, diskOperate, memoryUnit, memory, cpuCores, cpuSockets, guestOsType, folderId, description, name, hostId, clusterId, uploadTasks, ownerId, parsedOvf);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VmImportParams {\n");
    sb.append("    maxBandwidthPolicy: ").append(toIndentedString(maxBandwidthPolicy)).append("\n");
    sb.append("    maxBandwidthUnit: ").append(toIndentedString(maxBandwidthUnit)).append("\n");
    sb.append("    maxBandwidth: ").append(toIndentedString(maxBandwidth)).append("\n");
    sb.append("    maxIopsPolicy: ").append(toIndentedString(maxIopsPolicy)).append("\n");
    sb.append("    maxIops: ").append(toIndentedString(maxIops)).append("\n");
    sb.append("    ioPolicy: ").append(toIndentedString(ioPolicy)).append("\n");
    sb.append("    vcpu: ").append(toIndentedString(vcpu)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    ha: ").append(toIndentedString(ha)).append("\n");
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
    sb.append("    uploadTasks: ").append(toIndentedString(uploadTasks)).append("\n");
    sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
    sb.append("    parsedOvf: ").append(toIndentedString(parsedOvf)).append("\n");
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

