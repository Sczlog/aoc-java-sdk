package com.arcfra.aoc.model;

import java.util.Objects;
import java.util.Arrays;
import com.arcfra.aoc.model.MaintenanceModeEnum;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * NestedMaintenanceHostState
 */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class NestedMaintenanceHostState {
  public static final String SERIALIZED_NAME_ENTER_MAINTENANCE_TIME = "enter_maintenance_time";
  @SerializedName(SERIALIZED_NAME_ENTER_MAINTENANCE_TIME)
  private String enterMaintenanceTime;

  public static final String SERIALIZED_NAME_MAINTENANCE_JOB_ID = "maintenance_job_id";
  @SerializedName(SERIALIZED_NAME_MAINTENANCE_JOB_ID)
  private String maintenanceJobId;

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private MaintenanceModeEnum state;

  public NestedMaintenanceHostState() { 
  }

  public NestedMaintenanceHostState enterMaintenanceTime(String enterMaintenanceTime) {
    
    this.enterMaintenanceTime = enterMaintenanceTime;
    return this;
  }

   /**
   * Get enterMaintenanceTime
   * @return enterMaintenanceTime
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getEnterMaintenanceTime() {
    return enterMaintenanceTime;
  }


  public void setEnterMaintenanceTime(String enterMaintenanceTime) {
    this.enterMaintenanceTime = enterMaintenanceTime;
  }


  public NestedMaintenanceHostState maintenanceJobId(String maintenanceJobId) {
    
    this.maintenanceJobId = maintenanceJobId;
    return this;
  }

   /**
   * Get maintenanceJobId
   * @return maintenanceJobId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getMaintenanceJobId() {
    return maintenanceJobId;
  }


  public void setMaintenanceJobId(String maintenanceJobId) {
    this.maintenanceJobId = maintenanceJobId;
  }


  public NestedMaintenanceHostState state(MaintenanceModeEnum state) {
    
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public MaintenanceModeEnum getState() {
    return state;
  }


  public void setState(MaintenanceModeEnum state) {
    this.state = state;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NestedMaintenanceHostState nestedMaintenanceHostState = (NestedMaintenanceHostState) o;
    return Objects.equals(this.enterMaintenanceTime, nestedMaintenanceHostState.enterMaintenanceTime) &&
        Objects.equals(this.maintenanceJobId, nestedMaintenanceHostState.maintenanceJobId) &&
        Objects.equals(this.state, nestedMaintenanceHostState.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enterMaintenanceTime, maintenanceJobId, state);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NestedMaintenanceHostState {\n");
    sb.append("    enterMaintenanceTime: ").append(toIndentedString(enterMaintenanceTime)).append("\n");
    sb.append("    maintenanceJobId: ").append(toIndentedString(maintenanceJobId)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
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

