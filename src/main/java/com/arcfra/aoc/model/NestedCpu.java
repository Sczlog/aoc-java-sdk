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
 * NestedCpu
 */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class NestedCpu {
  public static final String SERIALIZED_NAME_CORES = "cores";
  @SerializedName(SERIALIZED_NAME_CORES)
  private Integer cores;

  public static final String SERIALIZED_NAME_SOCKETS = "sockets";
  @SerializedName(SERIALIZED_NAME_SOCKETS)
  private Integer sockets;

  public NestedCpu() { 
  }

  public NestedCpu cores(Integer cores) {
    
    this.cores = cores;
    return this;
  }

   /**
   * Get cores
   * @return cores
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getCores() {
    return cores;
  }


  public void setCores(Integer cores) {
    this.cores = cores;
  }


  public NestedCpu sockets(Integer sockets) {
    
    this.sockets = sockets;
    return this;
  }

   /**
   * Get sockets
   * @return sockets
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getSockets() {
    return sockets;
  }


  public void setSockets(Integer sockets) {
    this.sockets = sockets;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NestedCpu nestedCpu = (NestedCpu) o;
    return Objects.equals(this.cores, nestedCpu.cores) &&
        Objects.equals(this.sockets, nestedCpu.sockets);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cores, sockets);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NestedCpu {\n");
    sb.append("    cores: ").append(toIndentedString(cores)).append("\n");
    sb.append("    sockets: ").append(toIndentedString(sockets)).append("\n");
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

