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
 * NestedHost
 */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class NestedHost {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_MANAGEMENT_IP = "management_ip";
  @SerializedName(SERIALIZED_NAME_MANAGEMENT_IP)
  private String managementIp;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public NestedHost() { 
  }

  public NestedHost id(String id) {
    
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


  public NestedHost managementIp(String managementIp) {
    
    this.managementIp = managementIp;
    return this;
  }

   /**
   * Get managementIp
   * @return managementIp
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getManagementIp() {
    return managementIp;
  }


  public void setManagementIp(String managementIp) {
    this.managementIp = managementIp;
  }


  public NestedHost name(String name) {
    
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NestedHost nestedHost = (NestedHost) o;
    return Objects.equals(this.id, nestedHost.id) &&
        Objects.equals(this.managementIp, nestedHost.managementIp) &&
        Objects.equals(this.name, nestedHost.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, managementIp, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NestedHost {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    managementIp: ").append(toIndentedString(managementIp)).append("\n");
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

