package com.arcfra.aoc.model;

import java.util.Objects;
import java.util.Arrays;
import com.arcfra.aoc.model.ObservabilityConnectedSystemServiceType;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * DisassociateSystemServiceFromObsServiceParams
 */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class DisassociateSystemServiceFromObsServiceParams {
  public static final String SERIALIZED_NAME_SYSTEM_SERVICE_TYPE = "system_service_type";
  @SerializedName(SERIALIZED_NAME_SYSTEM_SERVICE_TYPE)
  private ObservabilityConnectedSystemServiceType systemServiceType;

  public static final String SERIALIZED_NAME_SYSTEM_SERVICE_ID = "system_service_id";
  @SerializedName(SERIALIZED_NAME_SYSTEM_SERVICE_ID)
  private String systemServiceId;

  public DisassociateSystemServiceFromObsServiceParams() { 
  }

  public DisassociateSystemServiceFromObsServiceParams systemServiceType(ObservabilityConnectedSystemServiceType systemServiceType) {
    
    this.systemServiceType = systemServiceType;
    return this;
  }

   /**
   * Get systemServiceType
   * @return systemServiceType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ObservabilityConnectedSystemServiceType getSystemServiceType() {
    return systemServiceType;
  }


  public void setSystemServiceType(ObservabilityConnectedSystemServiceType systemServiceType) {
    this.systemServiceType = systemServiceType;
  }


  public DisassociateSystemServiceFromObsServiceParams systemServiceId(String systemServiceId) {
    
    this.systemServiceId = systemServiceId;
    return this;
  }

   /**
   * Get systemServiceId
   * @return systemServiceId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getSystemServiceId() {
    return systemServiceId;
  }


  public void setSystemServiceId(String systemServiceId) {
    this.systemServiceId = systemServiceId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DisassociateSystemServiceFromObsServiceParams disassociateSystemServiceFromObsServiceParams = (DisassociateSystemServiceFromObsServiceParams) o;
    return Objects.equals(this.systemServiceType, disassociateSystemServiceFromObsServiceParams.systemServiceType) &&
        Objects.equals(this.systemServiceId, disassociateSystemServiceFromObsServiceParams.systemServiceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(systemServiceType, systemServiceId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DisassociateSystemServiceFromObsServiceParams {\n");
    sb.append("    systemServiceType: ").append(toIndentedString(systemServiceType)).append("\n");
    sb.append("    systemServiceId: ").append(toIndentedString(systemServiceId)).append("\n");
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

