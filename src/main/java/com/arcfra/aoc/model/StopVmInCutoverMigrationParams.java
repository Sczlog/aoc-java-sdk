package com.arcfra.aoc.model;

import java.util.Objects;
import java.util.Arrays;
import com.arcfra.aoc.model.TaskWhereInput;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * StopVmInCutoverMigrationParams
 */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class StopVmInCutoverMigrationParams {
  public static final String SERIALIZED_NAME_FORCE = "force";
  @SerializedName(SERIALIZED_NAME_FORCE)
  private Boolean force;

  public static final String SERIALIZED_NAME_TASKS = "tasks";
  @SerializedName(SERIALIZED_NAME_TASKS)
  private TaskWhereInput tasks;

  public StopVmInCutoverMigrationParams() { 
  }

  public StopVmInCutoverMigrationParams force(Boolean force) {
    
    this.force = force;
    return this;
  }

   /**
   * Get force
   * @return force
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getForce() {
    return force;
  }


  public void setForce(Boolean force) {
    this.force = force;
  }


  public StopVmInCutoverMigrationParams tasks(TaskWhereInput tasks) {
    
    this.tasks = tasks;
    return this;
  }

   /**
   * Get tasks
   * @return tasks
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public TaskWhereInput getTasks() {
    return tasks;
  }


  public void setTasks(TaskWhereInput tasks) {
    this.tasks = tasks;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StopVmInCutoverMigrationParams stopVmInCutoverMigrationParams = (StopVmInCutoverMigrationParams) o;
    return Objects.equals(this.force, stopVmInCutoverMigrationParams.force) &&
        Objects.equals(this.tasks, stopVmInCutoverMigrationParams.tasks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(force, tasks);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StopVmInCutoverMigrationParams {\n");
    sb.append("    force: ").append(toIndentedString(force)).append("\n");
    sb.append("    tasks: ").append(toIndentedString(tasks)).append("\n");
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

