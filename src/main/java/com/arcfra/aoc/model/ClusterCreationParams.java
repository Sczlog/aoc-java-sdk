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
 * ClusterCreationParams
 */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class ClusterCreationParams {
  public static final String SERIALIZED_NAME_DATACENTER_ID = "datacenter_id";
  @SerializedName(SERIALIZED_NAME_DATACENTER_ID)
  private String datacenterId;

  public static final String SERIALIZED_NAME_SECONDARY_ZONE_DATACENTER_ID = "secondary_zone_datacenter_id";
  @SerializedName(SERIALIZED_NAME_SECONDARY_ZONE_DATACENTER_ID)
  private String secondaryZoneDatacenterId;

  public static final String SERIALIZED_NAME_PRIMARY_ZONE_DATACENTER_ID = "primary_zone_datacenter_id";
  @SerializedName(SERIALIZED_NAME_PRIMARY_ZONE_DATACENTER_ID)
  private String primaryZoneDatacenterId;

  public static final String SERIALIZED_NAME_PASSWORD = "password";
  @SerializedName(SERIALIZED_NAME_PASSWORD)
  private String password;

  public static final String SERIALIZED_NAME_USERNAME = "username";
  @SerializedName(SERIALIZED_NAME_USERNAME)
  private String username;

  public static final String SERIALIZED_NAME_IP = "ip";
  @SerializedName(SERIALIZED_NAME_IP)
  private String ip;

  public ClusterCreationParams() { 
  }

  public ClusterCreationParams datacenterId(String datacenterId) {
    
    this.datacenterId = datacenterId;
    return this;
  }

   /**
   * Get datacenterId
   * @return datacenterId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDatacenterId() {
    return datacenterId;
  }


  public void setDatacenterId(String datacenterId) {
    this.datacenterId = datacenterId;
  }


  public ClusterCreationParams secondaryZoneDatacenterId(String secondaryZoneDatacenterId) {
    
    this.secondaryZoneDatacenterId = secondaryZoneDatacenterId;
    return this;
  }

   /**
   * Get secondaryZoneDatacenterId
   * @return secondaryZoneDatacenterId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSecondaryZoneDatacenterId() {
    return secondaryZoneDatacenterId;
  }


  public void setSecondaryZoneDatacenterId(String secondaryZoneDatacenterId) {
    this.secondaryZoneDatacenterId = secondaryZoneDatacenterId;
  }


  public ClusterCreationParams primaryZoneDatacenterId(String primaryZoneDatacenterId) {
    
    this.primaryZoneDatacenterId = primaryZoneDatacenterId;
    return this;
  }

   /**
   * Get primaryZoneDatacenterId
   * @return primaryZoneDatacenterId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPrimaryZoneDatacenterId() {
    return primaryZoneDatacenterId;
  }


  public void setPrimaryZoneDatacenterId(String primaryZoneDatacenterId) {
    this.primaryZoneDatacenterId = primaryZoneDatacenterId;
  }


  public ClusterCreationParams password(String password) {
    
    this.password = password;
    return this;
  }

   /**
   * Get password
   * @return password
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getPassword() {
    return password;
  }


  public void setPassword(String password) {
    this.password = password;
  }


  public ClusterCreationParams username(String username) {
    
    this.username = username;
    return this;
  }

   /**
   * Get username
   * @return username
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getUsername() {
    return username;
  }


  public void setUsername(String username) {
    this.username = username;
  }


  public ClusterCreationParams ip(String ip) {
    
    this.ip = ip;
    return this;
  }

   /**
   * Get ip
   * @return ip
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getIp() {
    return ip;
  }


  public void setIp(String ip) {
    this.ip = ip;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClusterCreationParams clusterCreationParams = (ClusterCreationParams) o;
    return Objects.equals(this.datacenterId, clusterCreationParams.datacenterId) &&
        Objects.equals(this.secondaryZoneDatacenterId, clusterCreationParams.secondaryZoneDatacenterId) &&
        Objects.equals(this.primaryZoneDatacenterId, clusterCreationParams.primaryZoneDatacenterId) &&
        Objects.equals(this.password, clusterCreationParams.password) &&
        Objects.equals(this.username, clusterCreationParams.username) &&
        Objects.equals(this.ip, clusterCreationParams.ip);
  }

  @Override
  public int hashCode() {
    return Objects.hash(datacenterId, secondaryZoneDatacenterId, primaryZoneDatacenterId, password, username, ip);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClusterCreationParams {\n");
    sb.append("    datacenterId: ").append(toIndentedString(datacenterId)).append("\n");
    sb.append("    secondaryZoneDatacenterId: ").append(toIndentedString(secondaryZoneDatacenterId)).append("\n");
    sb.append("    primaryZoneDatacenterId: ").append(toIndentedString(primaryZoneDatacenterId)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
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

