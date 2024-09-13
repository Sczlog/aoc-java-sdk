package com.arcfra.aoc.model;

import java.util.Objects;
import java.util.Arrays;
import com.arcfra.aoc.model.ByteUnit;
import com.arcfra.aoc.model.ContentLibraryImportVmNic;
import com.arcfra.aoc.model.ContentLibraryVmTemplateOvfDiskOperate;
import com.arcfra.aoc.model.ParsedOVF;
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
 * ContentLibraryVmTemplateImportParams
 */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class ContentLibraryVmTemplateImportParams {
  public static final String SERIALIZED_NAME_VM_NICS = "vm_nics";
  @SerializedName(SERIALIZED_NAME_VM_NICS)
  private List<ContentLibraryImportVmNic> vmNics = null;

  public static final String SERIALIZED_NAME_DISK_OPERATE = "disk_operate";
  @SerializedName(SERIALIZED_NAME_DISK_OPERATE)
  private ContentLibraryVmTemplateOvfDiskOperate diskOperate;

  public static final String SERIALIZED_NAME_HA = "ha";
  @SerializedName(SERIALIZED_NAME_HA)
  private Boolean ha;

  public static final String SERIALIZED_NAME_MEMORY_UNIT = "memory_unit";
  @SerializedName(SERIALIZED_NAME_MEMORY_UNIT)
  private ByteUnit memoryUnit;

  public static final String SERIALIZED_NAME_MEMORY = "memory";
  @SerializedName(SERIALIZED_NAME_MEMORY)
  private Long memory;

  public static final String SERIALIZED_NAME_VCPU = "vcpu";
  @SerializedName(SERIALIZED_NAME_VCPU)
  private Integer vcpu;

  public static final String SERIALIZED_NAME_CPU_CORES = "cpu_cores";
  @SerializedName(SERIALIZED_NAME_CPU_CORES)
  private Integer cpuCores;

  public static final String SERIALIZED_NAME_CPU_SOCKETS = "cpu_sockets";
  @SerializedName(SERIALIZED_NAME_CPU_SOCKETS)
  private Integer cpuSockets;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_UPLOAD_TASKS = "upload_tasks";
  @SerializedName(SERIALIZED_NAME_UPLOAD_TASKS)
  private List<String> uploadTasks = new ArrayList<String>();

  public static final String SERIALIZED_NAME_PARSED_OVF = "parsed_ovf";
  @SerializedName(SERIALIZED_NAME_PARSED_OVF)
  private ParsedOVF parsedOvf;

  public static final String SERIALIZED_NAME_CLUSTER_ID = "cluster_id";
  @SerializedName(SERIALIZED_NAME_CLUSTER_ID)
  private String clusterId;

  public ContentLibraryVmTemplateImportParams() { 
  }

  public ContentLibraryVmTemplateImportParams vmNics(List<ContentLibraryImportVmNic> vmNics) {
    
    this.vmNics = vmNics;
    return this;
  }

  public ContentLibraryVmTemplateImportParams addVmNicsItem(ContentLibraryImportVmNic vmNicsItem) {
    if (this.vmNics == null) {
      this.vmNics = new ArrayList<ContentLibraryImportVmNic>();
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

  public List<ContentLibraryImportVmNic> getVmNics() {
    return vmNics;
  }


  public void setVmNics(List<ContentLibraryImportVmNic> vmNics) {
    this.vmNics = vmNics;
  }


  public ContentLibraryVmTemplateImportParams diskOperate(ContentLibraryVmTemplateOvfDiskOperate diskOperate) {
    
    this.diskOperate = diskOperate;
    return this;
  }

   /**
   * Get diskOperate
   * @return diskOperate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ContentLibraryVmTemplateOvfDiskOperate getDiskOperate() {
    return diskOperate;
  }


  public void setDiskOperate(ContentLibraryVmTemplateOvfDiskOperate diskOperate) {
    this.diskOperate = diskOperate;
  }


  public ContentLibraryVmTemplateImportParams ha(Boolean ha) {
    
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


  public ContentLibraryVmTemplateImportParams memoryUnit(ByteUnit memoryUnit) {
    
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


  public ContentLibraryVmTemplateImportParams memory(Long memory) {
    
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


  public ContentLibraryVmTemplateImportParams vcpu(Integer vcpu) {
    
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


  public ContentLibraryVmTemplateImportParams cpuCores(Integer cpuCores) {
    
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


  public ContentLibraryVmTemplateImportParams cpuSockets(Integer cpuSockets) {
    
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


  public ContentLibraryVmTemplateImportParams description(String description) {
    
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


  public ContentLibraryVmTemplateImportParams name(String name) {
    
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


  public ContentLibraryVmTemplateImportParams uploadTasks(List<String> uploadTasks) {
    
    this.uploadTasks = uploadTasks;
    return this;
  }

  public ContentLibraryVmTemplateImportParams addUploadTasksItem(String uploadTasksItem) {
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


  public ContentLibraryVmTemplateImportParams parsedOvf(ParsedOVF parsedOvf) {
    
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


  public ContentLibraryVmTemplateImportParams clusterId(String clusterId) {
    
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
    ContentLibraryVmTemplateImportParams contentLibraryVmTemplateImportParams = (ContentLibraryVmTemplateImportParams) o;
    return Objects.equals(this.vmNics, contentLibraryVmTemplateImportParams.vmNics) &&
        Objects.equals(this.diskOperate, contentLibraryVmTemplateImportParams.diskOperate) &&
        Objects.equals(this.ha, contentLibraryVmTemplateImportParams.ha) &&
        Objects.equals(this.memoryUnit, contentLibraryVmTemplateImportParams.memoryUnit) &&
        Objects.equals(this.memory, contentLibraryVmTemplateImportParams.memory) &&
        Objects.equals(this.vcpu, contentLibraryVmTemplateImportParams.vcpu) &&
        Objects.equals(this.cpuCores, contentLibraryVmTemplateImportParams.cpuCores) &&
        Objects.equals(this.cpuSockets, contentLibraryVmTemplateImportParams.cpuSockets) &&
        Objects.equals(this.description, contentLibraryVmTemplateImportParams.description) &&
        Objects.equals(this.name, contentLibraryVmTemplateImportParams.name) &&
        Objects.equals(this.uploadTasks, contentLibraryVmTemplateImportParams.uploadTasks) &&
        Objects.equals(this.parsedOvf, contentLibraryVmTemplateImportParams.parsedOvf) &&
        Objects.equals(this.clusterId, contentLibraryVmTemplateImportParams.clusterId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vmNics, diskOperate, ha, memoryUnit, memory, vcpu, cpuCores, cpuSockets, description, name, uploadTasks, parsedOvf, clusterId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContentLibraryVmTemplateImportParams {\n");
    sb.append("    vmNics: ").append(toIndentedString(vmNics)).append("\n");
    sb.append("    diskOperate: ").append(toIndentedString(diskOperate)).append("\n");
    sb.append("    ha: ").append(toIndentedString(ha)).append("\n");
    sb.append("    memoryUnit: ").append(toIndentedString(memoryUnit)).append("\n");
    sb.append("    memory: ").append(toIndentedString(memory)).append("\n");
    sb.append("    vcpu: ").append(toIndentedString(vcpu)).append("\n");
    sb.append("    cpuCores: ").append(toIndentedString(cpuCores)).append("\n");
    sb.append("    cpuSockets: ").append(toIndentedString(cpuSockets)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    uploadTasks: ").append(toIndentedString(uploadTasks)).append("\n");
    sb.append("    parsedOvf: ").append(toIndentedString(parsedOvf)).append("\n");
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

