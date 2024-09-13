package com.arcfra.aoc.model;

import java.util.Objects;
import java.util.Arrays;
import com.arcfra.aoc.model.VmClockOffset;
import com.arcfra.aoc.model.VmVideoType;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * VmUpdateAdvancedOptionsParamsData
 */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class VmUpdateAdvancedOptionsParamsData {
  public static final String SERIALIZED_NAME_VIDEO_TYPE = "video_type";
  @SerializedName(SERIALIZED_NAME_VIDEO_TYPE)
  private VmVideoType videoType;

  public static final String SERIALIZED_NAME_WINDOWS_OPTIMIZE = "windows_optimize";
  @SerializedName(SERIALIZED_NAME_WINDOWS_OPTIMIZE)
  private Boolean windowsOptimize;

  public static final String SERIALIZED_NAME_CPU_MODEL = "cpu_model";
  @SerializedName(SERIALIZED_NAME_CPU_MODEL)
  private String cpuModel;

  public static final String SERIALIZED_NAME_CLOCK_OFFSET = "clock_offset";
  @SerializedName(SERIALIZED_NAME_CLOCK_OFFSET)
  private VmClockOffset clockOffset;

  public VmUpdateAdvancedOptionsParamsData() { 
  }

  public VmUpdateAdvancedOptionsParamsData videoType(VmVideoType videoType) {
    
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


  public VmUpdateAdvancedOptionsParamsData windowsOptimize(Boolean windowsOptimize) {
    
    this.windowsOptimize = windowsOptimize;
    return this;
  }

   /**
   * Get windowsOptimize
   * @return windowsOptimize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getWindowsOptimize() {
    return windowsOptimize;
  }


  public void setWindowsOptimize(Boolean windowsOptimize) {
    this.windowsOptimize = windowsOptimize;
  }


  public VmUpdateAdvancedOptionsParamsData cpuModel(String cpuModel) {
    
    this.cpuModel = cpuModel;
    return this;
  }

   /**
   * Get cpuModel
   * @return cpuModel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCpuModel() {
    return cpuModel;
  }


  public void setCpuModel(String cpuModel) {
    this.cpuModel = cpuModel;
  }


  public VmUpdateAdvancedOptionsParamsData clockOffset(VmClockOffset clockOffset) {
    
    this.clockOffset = clockOffset;
    return this;
  }

   /**
   * Get clockOffset
   * @return clockOffset
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VmClockOffset getClockOffset() {
    return clockOffset;
  }


  public void setClockOffset(VmClockOffset clockOffset) {
    this.clockOffset = clockOffset;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VmUpdateAdvancedOptionsParamsData vmUpdateAdvancedOptionsParamsData = (VmUpdateAdvancedOptionsParamsData) o;
    return Objects.equals(this.videoType, vmUpdateAdvancedOptionsParamsData.videoType) &&
        Objects.equals(this.windowsOptimize, vmUpdateAdvancedOptionsParamsData.windowsOptimize) &&
        Objects.equals(this.cpuModel, vmUpdateAdvancedOptionsParamsData.cpuModel) &&
        Objects.equals(this.clockOffset, vmUpdateAdvancedOptionsParamsData.clockOffset);
  }

  @Override
  public int hashCode() {
    return Objects.hash(videoType, windowsOptimize, cpuModel, clockOffset);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VmUpdateAdvancedOptionsParamsData {\n");
    sb.append("    videoType: ").append(toIndentedString(videoType)).append("\n");
    sb.append("    windowsOptimize: ").append(toIndentedString(windowsOptimize)).append("\n");
    sb.append("    cpuModel: ").append(toIndentedString(cpuModel)).append("\n");
    sb.append("    clockOffset: ").append(toIndentedString(clockOffset)).append("\n");
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

