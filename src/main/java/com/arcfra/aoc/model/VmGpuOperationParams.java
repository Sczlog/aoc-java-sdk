package com.arcfra.aoc.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * VmGpuOperationParams
 */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class VmGpuOperationParams {
  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private Integer amount;

  public static final String SERIALIZED_NAME_GPU_ID = "gpu_id";
  @SerializedName(SERIALIZED_NAME_GPU_ID)
  private String gpuId;

  public VmGpuOperationParams() { 
  }

  public VmGpuOperationParams amount(Integer amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getAmount() {
    return amount;
  }


  public void setAmount(Integer amount) {
    this.amount = amount;
  }


  public VmGpuOperationParams gpuId(String gpuId) {
    
    this.gpuId = gpuId;
    return this;
  }

   /**
   * Get gpuId
   * @return gpuId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getGpuId() {
    return gpuId;
  }


  public void setGpuId(String gpuId) {
    this.gpuId = gpuId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VmGpuOperationParams vmGpuOperationParams = (VmGpuOperationParams) o;
    return Objects.equals(this.amount, vmGpuOperationParams.amount) &&
        Objects.equals(this.gpuId, vmGpuOperationParams.gpuId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, gpuId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VmGpuOperationParams {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    gpuId: ").append(toIndentedString(gpuId)).append("\n");
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

