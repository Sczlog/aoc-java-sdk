package com.arcfra.aoc.model;

import java.util.Objects;
import java.util.Arrays;
import com.arcfra.aoc.model.NestedCluster;
import com.arcfra.aoc.model.NestedStep;
import com.arcfra.aoc.model.NestedUser;
import com.arcfra.aoc.model.TaskStatus;
import com.arcfra.aoc.model.TaskType;
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
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Task
 */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class Task {
  public static final String SERIALIZED_NAME_ARGS = "args";
  @SerializedName(SERIALIZED_NAME_ARGS)
  private Object args;

  public static final String SERIALIZED_NAME_CLUSTER = "cluster";
  @SerializedName(SERIALIZED_NAME_CLUSTER)
  private NestedCluster cluster;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_ERROR_CODE = "error_code";
  @SerializedName(SERIALIZED_NAME_ERROR_CODE)
  private String errorCode;

  public static final String SERIALIZED_NAME_ERROR_MESSAGE = "error_message";
  @SerializedName(SERIALIZED_NAME_ERROR_MESSAGE)
  private String errorMessage;

  public static final String SERIALIZED_NAME_FINISHED_AT = "finished_at";
  @SerializedName(SERIALIZED_NAME_FINISHED_AT)
  private String finishedAt;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_INTERNAL = "internal";
  @SerializedName(SERIALIZED_NAME_INTERNAL)
  private Boolean internal;

  public static final String SERIALIZED_NAME_KEY = "key";
  @SerializedName(SERIALIZED_NAME_KEY)
  private String key;

  public static final String SERIALIZED_NAME_LOCAL_CREATED_AT = "local_created_at";
  @SerializedName(SERIALIZED_NAME_LOCAL_CREATED_AT)
  private String localCreatedAt;

  public static final String SERIALIZED_NAME_PROGRESS = "progress";
  @SerializedName(SERIALIZED_NAME_PROGRESS)
  private Double progress;

  public static final String SERIALIZED_NAME_RESOURCE_ID = "resource_id";
  @SerializedName(SERIALIZED_NAME_RESOURCE_ID)
  private String resourceId;

  public static final String SERIALIZED_NAME_RESOURCE_MUTATION = "resource_mutation";
  @SerializedName(SERIALIZED_NAME_RESOURCE_MUTATION)
  private String resourceMutation;

  public static final String SERIALIZED_NAME_RESOURCE_ROLLBACK_ERROR = "resource_rollback_error";
  @SerializedName(SERIALIZED_NAME_RESOURCE_ROLLBACK_ERROR)
  private String resourceRollbackError;

  public static final String SERIALIZED_NAME_RESOURCE_ROLLBACK_RETRY_COUNT = "resource_rollback_retry_count";
  @SerializedName(SERIALIZED_NAME_RESOURCE_ROLLBACK_RETRY_COUNT)
  private Integer resourceRollbackRetryCount;

  public static final String SERIALIZED_NAME_RESOURCE_ROLLBACKED = "resource_rollbacked";
  @SerializedName(SERIALIZED_NAME_RESOURCE_ROLLBACKED)
  private Boolean resourceRollbacked;

  public static final String SERIALIZED_NAME_RESOURCE_TYPE = "resource_type";
  @SerializedName(SERIALIZED_NAME_RESOURCE_TYPE)
  private String resourceType;

  public static final String SERIALIZED_NAME_SNAPSHOT = "snapshot";
  @SerializedName(SERIALIZED_NAME_SNAPSHOT)
  private String snapshot;

  public static final String SERIALIZED_NAME_STARTED_AT = "started_at";
  @SerializedName(SERIALIZED_NAME_STARTED_AT)
  private String startedAt;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private TaskStatus status;

  public static final String SERIALIZED_NAME_STEPS = "steps";
  @SerializedName(SERIALIZED_NAME_STEPS)
  private List<NestedStep> steps = new ArrayList<NestedStep>();

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TaskType type;

  public static final String SERIALIZED_NAME_USER = "user";
  @SerializedName(SERIALIZED_NAME_USER)
  private NestedUser user;

  public Task() { 
  }

  public Task args(Object args) {
    
    this.args = args;
    return this;
  }

   /**
   * Get args
   * @return args
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Object getArgs() {
    return args;
  }


  public void setArgs(Object args) {
    this.args = args;
  }


  public Task cluster(NestedCluster cluster) {
    
    this.cluster = cluster;
    return this;
  }

   /**
   * Get cluster
   * @return cluster
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public NestedCluster getCluster() {
    return cluster;
  }


  public void setCluster(NestedCluster cluster) {
    this.cluster = cluster;
  }


  public Task description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public Task errorCode(String errorCode) {
    
    this.errorCode = errorCode;
    return this;
  }

   /**
   * Get errorCode
   * @return errorCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getErrorCode() {
    return errorCode;
  }


  public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
  }


  public Task errorMessage(String errorMessage) {
    
    this.errorMessage = errorMessage;
    return this;
  }

   /**
   * Get errorMessage
   * @return errorMessage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getErrorMessage() {
    return errorMessage;
  }


  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }


  public Task finishedAt(String finishedAt) {
    
    this.finishedAt = finishedAt;
    return this;
  }

   /**
   * Get finishedAt
   * @return finishedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getFinishedAt() {
    return finishedAt;
  }


  public void setFinishedAt(String finishedAt) {
    this.finishedAt = finishedAt;
  }


  public Task id(String id) {
    
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


  public Task internal(Boolean internal) {
    
    this.internal = internal;
    return this;
  }

   /**
   * Get internal
   * @return internal
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boolean getInternal() {
    return internal;
  }


  public void setInternal(Boolean internal) {
    this.internal = internal;
  }


  public Task key(String key) {
    
    this.key = key;
    return this;
  }

   /**
   * Get key
   * @return key
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getKey() {
    return key;
  }


  public void setKey(String key) {
    this.key = key;
  }


  public Task localCreatedAt(String localCreatedAt) {
    
    this.localCreatedAt = localCreatedAt;
    return this;
  }

   /**
   * Get localCreatedAt
   * @return localCreatedAt
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getLocalCreatedAt() {
    return localCreatedAt;
  }


  public void setLocalCreatedAt(String localCreatedAt) {
    this.localCreatedAt = localCreatedAt;
  }


  public Task progress(Double progress) {
    
    this.progress = progress;
    return this;
  }

   /**
   * Get progress
   * @return progress
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Double getProgress() {
    return progress;
  }


  public void setProgress(Double progress) {
    this.progress = progress;
  }


  public Task resourceId(String resourceId) {
    
    this.resourceId = resourceId;
    return this;
  }

   /**
   * Get resourceId
   * @return resourceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getResourceId() {
    return resourceId;
  }


  public void setResourceId(String resourceId) {
    this.resourceId = resourceId;
  }


  public Task resourceMutation(String resourceMutation) {
    
    this.resourceMutation = resourceMutation;
    return this;
  }

   /**
   * Get resourceMutation
   * @return resourceMutation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getResourceMutation() {
    return resourceMutation;
  }


  public void setResourceMutation(String resourceMutation) {
    this.resourceMutation = resourceMutation;
  }


  public Task resourceRollbackError(String resourceRollbackError) {
    
    this.resourceRollbackError = resourceRollbackError;
    return this;
  }

   /**
   * Get resourceRollbackError
   * @return resourceRollbackError
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getResourceRollbackError() {
    return resourceRollbackError;
  }


  public void setResourceRollbackError(String resourceRollbackError) {
    this.resourceRollbackError = resourceRollbackError;
  }


  public Task resourceRollbackRetryCount(Integer resourceRollbackRetryCount) {
    
    this.resourceRollbackRetryCount = resourceRollbackRetryCount;
    return this;
  }

   /**
   * Get resourceRollbackRetryCount
   * @return resourceRollbackRetryCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getResourceRollbackRetryCount() {
    return resourceRollbackRetryCount;
  }


  public void setResourceRollbackRetryCount(Integer resourceRollbackRetryCount) {
    this.resourceRollbackRetryCount = resourceRollbackRetryCount;
  }


  public Task resourceRollbacked(Boolean resourceRollbacked) {
    
    this.resourceRollbacked = resourceRollbacked;
    return this;
  }

   /**
   * Get resourceRollbacked
   * @return resourceRollbacked
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getResourceRollbacked() {
    return resourceRollbacked;
  }


  public void setResourceRollbacked(Boolean resourceRollbacked) {
    this.resourceRollbacked = resourceRollbacked;
  }


  public Task resourceType(String resourceType) {
    
    this.resourceType = resourceType;
    return this;
  }

   /**
   * Get resourceType
   * @return resourceType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getResourceType() {
    return resourceType;
  }


  public void setResourceType(String resourceType) {
    this.resourceType = resourceType;
  }


  public Task snapshot(String snapshot) {
    
    this.snapshot = snapshot;
    return this;
  }

   /**
   * Get snapshot
   * @return snapshot
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getSnapshot() {
    return snapshot;
  }


  public void setSnapshot(String snapshot) {
    this.snapshot = snapshot;
  }


  public Task startedAt(String startedAt) {
    
    this.startedAt = startedAt;
    return this;
  }

   /**
   * Get startedAt
   * @return startedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getStartedAt() {
    return startedAt;
  }


  public void setStartedAt(String startedAt) {
    this.startedAt = startedAt;
  }


  public Task status(TaskStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public TaskStatus getStatus() {
    return status;
  }


  public void setStatus(TaskStatus status) {
    this.status = status;
  }


  public Task steps(List<NestedStep> steps) {
    
    this.steps = steps;
    return this;
  }

  public Task addStepsItem(NestedStep stepsItem) {
    this.steps.add(stepsItem);
    return this;
  }

   /**
   * Get steps
   * @return steps
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<NestedStep> getSteps() {
    return steps;
  }


  public void setSteps(List<NestedStep> steps) {
    this.steps = steps;
  }


  public Task type(TaskType type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TaskType getType() {
    return type;
  }


  public void setType(TaskType type) {
    this.type = type;
  }


  public Task user(NestedUser user) {
    
    this.user = user;
    return this;
  }

   /**
   * Get user
   * @return user
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public NestedUser getUser() {
    return user;
  }


  public void setUser(NestedUser user) {
    this.user = user;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Task task = (Task) o;
    return Objects.equals(this.args, task.args) &&
        Objects.equals(this.cluster, task.cluster) &&
        Objects.equals(this.description, task.description) &&
        Objects.equals(this.errorCode, task.errorCode) &&
        Objects.equals(this.errorMessage, task.errorMessage) &&
        Objects.equals(this.finishedAt, task.finishedAt) &&
        Objects.equals(this.id, task.id) &&
        Objects.equals(this.internal, task.internal) &&
        Objects.equals(this.key, task.key) &&
        Objects.equals(this.localCreatedAt, task.localCreatedAt) &&
        Objects.equals(this.progress, task.progress) &&
        Objects.equals(this.resourceId, task.resourceId) &&
        Objects.equals(this.resourceMutation, task.resourceMutation) &&
        Objects.equals(this.resourceRollbackError, task.resourceRollbackError) &&
        Objects.equals(this.resourceRollbackRetryCount, task.resourceRollbackRetryCount) &&
        Objects.equals(this.resourceRollbacked, task.resourceRollbacked) &&
        Objects.equals(this.resourceType, task.resourceType) &&
        Objects.equals(this.snapshot, task.snapshot) &&
        Objects.equals(this.startedAt, task.startedAt) &&
        Objects.equals(this.status, task.status) &&
        Objects.equals(this.steps, task.steps) &&
        Objects.equals(this.type, task.type) &&
        Objects.equals(this.user, task.user);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(args, cluster, description, errorCode, errorMessage, finishedAt, id, internal, key, localCreatedAt, progress, resourceId, resourceMutation, resourceRollbackError, resourceRollbackRetryCount, resourceRollbacked, resourceType, snapshot, startedAt, status, steps, type, user);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Task {\n");
    sb.append("    args: ").append(toIndentedString(args)).append("\n");
    sb.append("    cluster: ").append(toIndentedString(cluster)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
    sb.append("    finishedAt: ").append(toIndentedString(finishedAt)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    internal: ").append(toIndentedString(internal)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    localCreatedAt: ").append(toIndentedString(localCreatedAt)).append("\n");
    sb.append("    progress: ").append(toIndentedString(progress)).append("\n");
    sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
    sb.append("    resourceMutation: ").append(toIndentedString(resourceMutation)).append("\n");
    sb.append("    resourceRollbackError: ").append(toIndentedString(resourceRollbackError)).append("\n");
    sb.append("    resourceRollbackRetryCount: ").append(toIndentedString(resourceRollbackRetryCount)).append("\n");
    sb.append("    resourceRollbacked: ").append(toIndentedString(resourceRollbacked)).append("\n");
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
    sb.append("    snapshot: ").append(toIndentedString(snapshot)).append("\n");
    sb.append("    startedAt: ").append(toIndentedString(startedAt)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    steps: ").append(toIndentedString(steps)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
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

