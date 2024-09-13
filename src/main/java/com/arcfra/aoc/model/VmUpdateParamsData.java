package com.arcfra.aoc.model;

import java.util.Objects;
import java.util.Arrays;
import com.arcfra.aoc.model.ByteUnit;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * VmUpdateParamsData
 */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class VmUpdateParamsData {
  public static final String SERIALIZED_NAME_VCPU = "vcpu";
  @SerializedName(SERIALIZED_NAME_VCPU)
  private Integer vcpu;

  public static final String SERIALIZED_NAME_HA = "ha";
  @SerializedName(SERIALIZED_NAME_HA)
  private Boolean ha;

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

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public VmUpdateParamsData() { 
  }

  public VmUpdateParamsData vcpu(Integer vcpu) {
    
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


  public VmUpdateParamsData ha(Boolean ha) {
    
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


  public VmUpdateParamsData memoryUnit(ByteUnit memoryUnit) {
    
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


  public VmUpdateParamsData memory(Long memory) {
    
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


  public VmUpdateParamsData cpuCores(Integer cpuCores) {
    
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


  public VmUpdateParamsData cpuSockets(Integer cpuSockets) {
    
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


  public VmUpdateParamsData description(String description) {
    
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


  public VmUpdateParamsData name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VmUpdateParamsData vmUpdateParamsData = (VmUpdateParamsData) o;
    return Objects.equals(this.vcpu, vmUpdateParamsData.vcpu) &&
        Objects.equals(this.ha, vmUpdateParamsData.ha) &&
        Objects.equals(this.memoryUnit, vmUpdateParamsData.memoryUnit) &&
        Objects.equals(this.memory, vmUpdateParamsData.memory) &&
        Objects.equals(this.cpuCores, vmUpdateParamsData.cpuCores) &&
        Objects.equals(this.cpuSockets, vmUpdateParamsData.cpuSockets) &&
        Objects.equals(this.description, vmUpdateParamsData.description) &&
        Objects.equals(this.name, vmUpdateParamsData.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vcpu, ha, memoryUnit, memory, cpuCores, cpuSockets, description, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VmUpdateParamsData {\n");
    sb.append("    vcpu: ").append(toIndentedString(vcpu)).append("\n");
    sb.append("    ha: ").append(toIndentedString(ha)).append("\n");
    sb.append("    memoryUnit: ").append(toIndentedString(memoryUnit)).append("\n");
    sb.append("    memory: ").append(toIndentedString(memory)).append("\n");
    sb.append("    cpuCores: ").append(toIndentedString(cpuCores)).append("\n");
    sb.append("    cpuSockets: ").append(toIndentedString(cpuSockets)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

