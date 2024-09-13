package com.arcfra.aoc.model;

import java.util.Objects;
import java.util.Arrays;
import com.arcfra.aoc.model.CloudInitNetWorkRoute;
import com.arcfra.aoc.model.CloudInitNetworkTypeEnum;
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
 * CloudInitNetWork
 */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class CloudInitNetWork {
  public static final String SERIALIZED_NAME_ROUTES = "routes";
  @SerializedName(SERIALIZED_NAME_ROUTES)
  private List<CloudInitNetWorkRoute> routes = null;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private CloudInitNetworkTypeEnum type;

  public static final String SERIALIZED_NAME_NIC_INDEX = "nic_index";
  @SerializedName(SERIALIZED_NAME_NIC_INDEX)
  private Integer nicIndex;

  public static final String SERIALIZED_NAME_NETMASK = "netmask";
  @SerializedName(SERIALIZED_NAME_NETMASK)
  private String netmask;

  public static final String SERIALIZED_NAME_IP_ADDRESS = "ip_address";
  @SerializedName(SERIALIZED_NAME_IP_ADDRESS)
  private String ipAddress;

  public CloudInitNetWork() { 
  }

  public CloudInitNetWork routes(List<CloudInitNetWorkRoute> routes) {
    
    this.routes = routes;
    return this;
  }

  public CloudInitNetWork addRoutesItem(CloudInitNetWorkRoute routesItem) {
    if (this.routes == null) {
      this.routes = new ArrayList<CloudInitNetWorkRoute>();
    }
    this.routes.add(routesItem);
    return this;
  }

   /**
   * Get routes
   * @return routes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<CloudInitNetWorkRoute> getRoutes() {
    return routes;
  }


  public void setRoutes(List<CloudInitNetWorkRoute> routes) {
    this.routes = routes;
  }


  public CloudInitNetWork type(CloudInitNetworkTypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public CloudInitNetworkTypeEnum getType() {
    return type;
  }


  public void setType(CloudInitNetworkTypeEnum type) {
    this.type = type;
  }


  public CloudInitNetWork nicIndex(Integer nicIndex) {
    
    this.nicIndex = nicIndex;
    return this;
  }

   /**
   * Get nicIndex
   * @return nicIndex
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getNicIndex() {
    return nicIndex;
  }


  public void setNicIndex(Integer nicIndex) {
    this.nicIndex = nicIndex;
  }


  public CloudInitNetWork netmask(String netmask) {
    
    this.netmask = netmask;
    return this;
  }

   /**
   * Get netmask
   * @return netmask
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNetmask() {
    return netmask;
  }


  public void setNetmask(String netmask) {
    this.netmask = netmask;
  }


  public CloudInitNetWork ipAddress(String ipAddress) {
    
    this.ipAddress = ipAddress;
    return this;
  }

   /**
   * Get ipAddress
   * @return ipAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIpAddress() {
    return ipAddress;
  }


  public void setIpAddress(String ipAddress) {
    this.ipAddress = ipAddress;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CloudInitNetWork cloudInitNetWork = (CloudInitNetWork) o;
    return Objects.equals(this.routes, cloudInitNetWork.routes) &&
        Objects.equals(this.type, cloudInitNetWork.type) &&
        Objects.equals(this.nicIndex, cloudInitNetWork.nicIndex) &&
        Objects.equals(this.netmask, cloudInitNetWork.netmask) &&
        Objects.equals(this.ipAddress, cloudInitNetWork.ipAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(routes, type, nicIndex, netmask, ipAddress);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CloudInitNetWork {\n");
    sb.append("    routes: ").append(toIndentedString(routes)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    nicIndex: ").append(toIndentedString(nicIndex)).append("\n");
    sb.append("    netmask: ").append(toIndentedString(netmask)).append("\n");
    sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
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

