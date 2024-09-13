package com.arcfra.aoc.model;

import java.util.Objects;
import java.util.Arrays;
import com.arcfra.aoc.model.ClusterWhereInput;
import com.arcfra.aoc.model.UserAuditLogStatus;
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
 * SystemAuditLogWhereInput
 */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class SystemAuditLogWhereInput {
  public static final String SERIALIZED_NAME_A_N_D = "AND";
  @SerializedName(SERIALIZED_NAME_A_N_D)
  private List<SystemAuditLogWhereInput> AND = null;

  public static final String SERIALIZED_NAME_N_O_T = "NOT";
  @SerializedName(SERIALIZED_NAME_N_O_T)
  private List<SystemAuditLogWhereInput> NOT = null;

  public static final String SERIALIZED_NAME_O_R = "OR";
  @SerializedName(SERIALIZED_NAME_O_R)
  private List<SystemAuditLogWhereInput> OR = null;

  public static final String SERIALIZED_NAME_ACTION = "action";
  @SerializedName(SERIALIZED_NAME_ACTION)
  private String action;

  public static final String SERIALIZED_NAME_ACTION_CONTAINS = "action_contains";
  @SerializedName(SERIALIZED_NAME_ACTION_CONTAINS)
  private String actionContains;

  public static final String SERIALIZED_NAME_ACTION_ENDS_WITH = "action_ends_with";
  @SerializedName(SERIALIZED_NAME_ACTION_ENDS_WITH)
  private String actionEndsWith;

  public static final String SERIALIZED_NAME_ACTION_GT = "action_gt";
  @SerializedName(SERIALIZED_NAME_ACTION_GT)
  private String actionGt;

  public static final String SERIALIZED_NAME_ACTION_GTE = "action_gte";
  @SerializedName(SERIALIZED_NAME_ACTION_GTE)
  private String actionGte;

  public static final String SERIALIZED_NAME_ACTION_IN = "action_in";
  @SerializedName(SERIALIZED_NAME_ACTION_IN)
  private List<String> actionIn = null;

  public static final String SERIALIZED_NAME_ACTION_LT = "action_lt";
  @SerializedName(SERIALIZED_NAME_ACTION_LT)
  private String actionLt;

  public static final String SERIALIZED_NAME_ACTION_LTE = "action_lte";
  @SerializedName(SERIALIZED_NAME_ACTION_LTE)
  private String actionLte;

  public static final String SERIALIZED_NAME_ACTION_NOT = "action_not";
  @SerializedName(SERIALIZED_NAME_ACTION_NOT)
  private String actionNot;

  public static final String SERIALIZED_NAME_ACTION_NOT_CONTAINS = "action_not_contains";
  @SerializedName(SERIALIZED_NAME_ACTION_NOT_CONTAINS)
  private String actionNotContains;

  public static final String SERIALIZED_NAME_ACTION_NOT_ENDS_WITH = "action_not_ends_with";
  @SerializedName(SERIALIZED_NAME_ACTION_NOT_ENDS_WITH)
  private String actionNotEndsWith;

  public static final String SERIALIZED_NAME_ACTION_NOT_IN = "action_not_in";
  @SerializedName(SERIALIZED_NAME_ACTION_NOT_IN)
  private List<String> actionNotIn = null;

  public static final String SERIALIZED_NAME_ACTION_NOT_STARTS_WITH = "action_not_starts_with";
  @SerializedName(SERIALIZED_NAME_ACTION_NOT_STARTS_WITH)
  private String actionNotStartsWith;

  public static final String SERIALIZED_NAME_ACTION_STARTS_WITH = "action_starts_with";
  @SerializedName(SERIALIZED_NAME_ACTION_STARTS_WITH)
  private String actionStartsWith;

  public static final String SERIALIZED_NAME_CLUSTER = "cluster";
  @SerializedName(SERIALIZED_NAME_CLUSTER)
  private ClusterWhereInput cluster;

  public static final String SERIALIZED_NAME_FINISHED_AT = "finished_at";
  @SerializedName(SERIALIZED_NAME_FINISHED_AT)
  private String finishedAt;

  public static final String SERIALIZED_NAME_FINISHED_AT_GT = "finished_at_gt";
  @SerializedName(SERIALIZED_NAME_FINISHED_AT_GT)
  private String finishedAtGt;

  public static final String SERIALIZED_NAME_FINISHED_AT_GTE = "finished_at_gte";
  @SerializedName(SERIALIZED_NAME_FINISHED_AT_GTE)
  private String finishedAtGte;

  public static final String SERIALIZED_NAME_FINISHED_AT_IN = "finished_at_in";
  @SerializedName(SERIALIZED_NAME_FINISHED_AT_IN)
  private List<String> finishedAtIn = null;

  public static final String SERIALIZED_NAME_FINISHED_AT_LT = "finished_at_lt";
  @SerializedName(SERIALIZED_NAME_FINISHED_AT_LT)
  private String finishedAtLt;

  public static final String SERIALIZED_NAME_FINISHED_AT_LTE = "finished_at_lte";
  @SerializedName(SERIALIZED_NAME_FINISHED_AT_LTE)
  private String finishedAtLte;

  public static final String SERIALIZED_NAME_FINISHED_AT_NOT = "finished_at_not";
  @SerializedName(SERIALIZED_NAME_FINISHED_AT_NOT)
  private String finishedAtNot;

  public static final String SERIALIZED_NAME_FINISHED_AT_NOT_IN = "finished_at_not_in";
  @SerializedName(SERIALIZED_NAME_FINISHED_AT_NOT_IN)
  private List<String> finishedAtNotIn = null;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_ID_CONTAINS = "id_contains";
  @SerializedName(SERIALIZED_NAME_ID_CONTAINS)
  private String idContains;

  public static final String SERIALIZED_NAME_ID_ENDS_WITH = "id_ends_with";
  @SerializedName(SERIALIZED_NAME_ID_ENDS_WITH)
  private String idEndsWith;

  public static final String SERIALIZED_NAME_ID_GT = "id_gt";
  @SerializedName(SERIALIZED_NAME_ID_GT)
  private String idGt;

  public static final String SERIALIZED_NAME_ID_GTE = "id_gte";
  @SerializedName(SERIALIZED_NAME_ID_GTE)
  private String idGte;

  public static final String SERIALIZED_NAME_ID_IN = "id_in";
  @SerializedName(SERIALIZED_NAME_ID_IN)
  private List<String> idIn = null;

  public static final String SERIALIZED_NAME_ID_LT = "id_lt";
  @SerializedName(SERIALIZED_NAME_ID_LT)
  private String idLt;

  public static final String SERIALIZED_NAME_ID_LTE = "id_lte";
  @SerializedName(SERIALIZED_NAME_ID_LTE)
  private String idLte;

  public static final String SERIALIZED_NAME_ID_NOT = "id_not";
  @SerializedName(SERIALIZED_NAME_ID_NOT)
  private String idNot;

  public static final String SERIALIZED_NAME_ID_NOT_CONTAINS = "id_not_contains";
  @SerializedName(SERIALIZED_NAME_ID_NOT_CONTAINS)
  private String idNotContains;

  public static final String SERIALIZED_NAME_ID_NOT_ENDS_WITH = "id_not_ends_with";
  @SerializedName(SERIALIZED_NAME_ID_NOT_ENDS_WITH)
  private String idNotEndsWith;

  public static final String SERIALIZED_NAME_ID_NOT_IN = "id_not_in";
  @SerializedName(SERIALIZED_NAME_ID_NOT_IN)
  private List<String> idNotIn = null;

  public static final String SERIALIZED_NAME_ID_NOT_STARTS_WITH = "id_not_starts_with";
  @SerializedName(SERIALIZED_NAME_ID_NOT_STARTS_WITH)
  private String idNotStartsWith;

  public static final String SERIALIZED_NAME_ID_STARTS_WITH = "id_starts_with";
  @SerializedName(SERIALIZED_NAME_ID_STARTS_WITH)
  private String idStartsWith;

  public static final String SERIALIZED_NAME_LOCAL_CREATED_AT = "local_created_at";
  @SerializedName(SERIALIZED_NAME_LOCAL_CREATED_AT)
  private String localCreatedAt;

  public static final String SERIALIZED_NAME_LOCAL_CREATED_AT_GT = "local_created_at_gt";
  @SerializedName(SERIALIZED_NAME_LOCAL_CREATED_AT_GT)
  private String localCreatedAtGt;

  public static final String SERIALIZED_NAME_LOCAL_CREATED_AT_GTE = "local_created_at_gte";
  @SerializedName(SERIALIZED_NAME_LOCAL_CREATED_AT_GTE)
  private String localCreatedAtGte;

  public static final String SERIALIZED_NAME_LOCAL_CREATED_AT_IN = "local_created_at_in";
  @SerializedName(SERIALIZED_NAME_LOCAL_CREATED_AT_IN)
  private List<String> localCreatedAtIn = null;

  public static final String SERIALIZED_NAME_LOCAL_CREATED_AT_LT = "local_created_at_lt";
  @SerializedName(SERIALIZED_NAME_LOCAL_CREATED_AT_LT)
  private String localCreatedAtLt;

  public static final String SERIALIZED_NAME_LOCAL_CREATED_AT_LTE = "local_created_at_lte";
  @SerializedName(SERIALIZED_NAME_LOCAL_CREATED_AT_LTE)
  private String localCreatedAtLte;

  public static final String SERIALIZED_NAME_LOCAL_CREATED_AT_NOT = "local_created_at_not";
  @SerializedName(SERIALIZED_NAME_LOCAL_CREATED_AT_NOT)
  private String localCreatedAtNot;

  public static final String SERIALIZED_NAME_LOCAL_CREATED_AT_NOT_IN = "local_created_at_not_in";
  @SerializedName(SERIALIZED_NAME_LOCAL_CREATED_AT_NOT_IN)
  private List<String> localCreatedAtNotIn = null;

  public static final String SERIALIZED_NAME_LOCAL_ID = "local_id";
  @SerializedName(SERIALIZED_NAME_LOCAL_ID)
  private String localId;

  public static final String SERIALIZED_NAME_LOCAL_ID_CONTAINS = "local_id_contains";
  @SerializedName(SERIALIZED_NAME_LOCAL_ID_CONTAINS)
  private String localIdContains;

  public static final String SERIALIZED_NAME_LOCAL_ID_ENDS_WITH = "local_id_ends_with";
  @SerializedName(SERIALIZED_NAME_LOCAL_ID_ENDS_WITH)
  private String localIdEndsWith;

  public static final String SERIALIZED_NAME_LOCAL_ID_GT = "local_id_gt";
  @SerializedName(SERIALIZED_NAME_LOCAL_ID_GT)
  private String localIdGt;

  public static final String SERIALIZED_NAME_LOCAL_ID_GTE = "local_id_gte";
  @SerializedName(SERIALIZED_NAME_LOCAL_ID_GTE)
  private String localIdGte;

  public static final String SERIALIZED_NAME_LOCAL_ID_IN = "local_id_in";
  @SerializedName(SERIALIZED_NAME_LOCAL_ID_IN)
  private List<String> localIdIn = null;

  public static final String SERIALIZED_NAME_LOCAL_ID_LT = "local_id_lt";
  @SerializedName(SERIALIZED_NAME_LOCAL_ID_LT)
  private String localIdLt;

  public static final String SERIALIZED_NAME_LOCAL_ID_LTE = "local_id_lte";
  @SerializedName(SERIALIZED_NAME_LOCAL_ID_LTE)
  private String localIdLte;

  public static final String SERIALIZED_NAME_LOCAL_ID_NOT = "local_id_not";
  @SerializedName(SERIALIZED_NAME_LOCAL_ID_NOT)
  private String localIdNot;

  public static final String SERIALIZED_NAME_LOCAL_ID_NOT_CONTAINS = "local_id_not_contains";
  @SerializedName(SERIALIZED_NAME_LOCAL_ID_NOT_CONTAINS)
  private String localIdNotContains;

  public static final String SERIALIZED_NAME_LOCAL_ID_NOT_ENDS_WITH = "local_id_not_ends_with";
  @SerializedName(SERIALIZED_NAME_LOCAL_ID_NOT_ENDS_WITH)
  private String localIdNotEndsWith;

  public static final String SERIALIZED_NAME_LOCAL_ID_NOT_IN = "local_id_not_in";
  @SerializedName(SERIALIZED_NAME_LOCAL_ID_NOT_IN)
  private List<String> localIdNotIn = null;

  public static final String SERIALIZED_NAME_LOCAL_ID_NOT_STARTS_WITH = "local_id_not_starts_with";
  @SerializedName(SERIALIZED_NAME_LOCAL_ID_NOT_STARTS_WITH)
  private String localIdNotStartsWith;

  public static final String SERIALIZED_NAME_LOCAL_ID_STARTS_WITH = "local_id_starts_with";
  @SerializedName(SERIALIZED_NAME_LOCAL_ID_STARTS_WITH)
  private String localIdStartsWith;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public static final String SERIALIZED_NAME_MESSAGE_CONTAINS = "message_contains";
  @SerializedName(SERIALIZED_NAME_MESSAGE_CONTAINS)
  private String messageContains;

  public static final String SERIALIZED_NAME_MESSAGE_ENDS_WITH = "message_ends_with";
  @SerializedName(SERIALIZED_NAME_MESSAGE_ENDS_WITH)
  private String messageEndsWith;

  public static final String SERIALIZED_NAME_MESSAGE_GT = "message_gt";
  @SerializedName(SERIALIZED_NAME_MESSAGE_GT)
  private String messageGt;

  public static final String SERIALIZED_NAME_MESSAGE_GTE = "message_gte";
  @SerializedName(SERIALIZED_NAME_MESSAGE_GTE)
  private String messageGte;

  public static final String SERIALIZED_NAME_MESSAGE_IN = "message_in";
  @SerializedName(SERIALIZED_NAME_MESSAGE_IN)
  private List<String> messageIn = null;

  public static final String SERIALIZED_NAME_MESSAGE_LT = "message_lt";
  @SerializedName(SERIALIZED_NAME_MESSAGE_LT)
  private String messageLt;

  public static final String SERIALIZED_NAME_MESSAGE_LTE = "message_lte";
  @SerializedName(SERIALIZED_NAME_MESSAGE_LTE)
  private String messageLte;

  public static final String SERIALIZED_NAME_MESSAGE_NOT = "message_not";
  @SerializedName(SERIALIZED_NAME_MESSAGE_NOT)
  private String messageNot;

  public static final String SERIALIZED_NAME_MESSAGE_NOT_CONTAINS = "message_not_contains";
  @SerializedName(SERIALIZED_NAME_MESSAGE_NOT_CONTAINS)
  private String messageNotContains;

  public static final String SERIALIZED_NAME_MESSAGE_NOT_ENDS_WITH = "message_not_ends_with";
  @SerializedName(SERIALIZED_NAME_MESSAGE_NOT_ENDS_WITH)
  private String messageNotEndsWith;

  public static final String SERIALIZED_NAME_MESSAGE_NOT_IN = "message_not_in";
  @SerializedName(SERIALIZED_NAME_MESSAGE_NOT_IN)
  private List<String> messageNotIn = null;

  public static final String SERIALIZED_NAME_MESSAGE_NOT_STARTS_WITH = "message_not_starts_with";
  @SerializedName(SERIALIZED_NAME_MESSAGE_NOT_STARTS_WITH)
  private String messageNotStartsWith;

  public static final String SERIALIZED_NAME_MESSAGE_STARTS_WITH = "message_starts_with";
  @SerializedName(SERIALIZED_NAME_MESSAGE_STARTS_WITH)
  private String messageStartsWith;

  public static final String SERIALIZED_NAME_RESOURCE_ID = "resource_id";
  @SerializedName(SERIALIZED_NAME_RESOURCE_ID)
  private String resourceId;

  public static final String SERIALIZED_NAME_RESOURCE_ID_CONTAINS = "resource_id_contains";
  @SerializedName(SERIALIZED_NAME_RESOURCE_ID_CONTAINS)
  private String resourceIdContains;

  public static final String SERIALIZED_NAME_RESOURCE_ID_ENDS_WITH = "resource_id_ends_with";
  @SerializedName(SERIALIZED_NAME_RESOURCE_ID_ENDS_WITH)
  private String resourceIdEndsWith;

  public static final String SERIALIZED_NAME_RESOURCE_ID_GT = "resource_id_gt";
  @SerializedName(SERIALIZED_NAME_RESOURCE_ID_GT)
  private String resourceIdGt;

  public static final String SERIALIZED_NAME_RESOURCE_ID_GTE = "resource_id_gte";
  @SerializedName(SERIALIZED_NAME_RESOURCE_ID_GTE)
  private String resourceIdGte;

  public static final String SERIALIZED_NAME_RESOURCE_ID_IN = "resource_id_in";
  @SerializedName(SERIALIZED_NAME_RESOURCE_ID_IN)
  private List<String> resourceIdIn = null;

  public static final String SERIALIZED_NAME_RESOURCE_ID_LT = "resource_id_lt";
  @SerializedName(SERIALIZED_NAME_RESOURCE_ID_LT)
  private String resourceIdLt;

  public static final String SERIALIZED_NAME_RESOURCE_ID_LTE = "resource_id_lte";
  @SerializedName(SERIALIZED_NAME_RESOURCE_ID_LTE)
  private String resourceIdLte;

  public static final String SERIALIZED_NAME_RESOURCE_ID_NOT = "resource_id_not";
  @SerializedName(SERIALIZED_NAME_RESOURCE_ID_NOT)
  private String resourceIdNot;

  public static final String SERIALIZED_NAME_RESOURCE_ID_NOT_CONTAINS = "resource_id_not_contains";
  @SerializedName(SERIALIZED_NAME_RESOURCE_ID_NOT_CONTAINS)
  private String resourceIdNotContains;

  public static final String SERIALIZED_NAME_RESOURCE_ID_NOT_ENDS_WITH = "resource_id_not_ends_with";
  @SerializedName(SERIALIZED_NAME_RESOURCE_ID_NOT_ENDS_WITH)
  private String resourceIdNotEndsWith;

  public static final String SERIALIZED_NAME_RESOURCE_ID_NOT_IN = "resource_id_not_in";
  @SerializedName(SERIALIZED_NAME_RESOURCE_ID_NOT_IN)
  private List<String> resourceIdNotIn = null;

  public static final String SERIALIZED_NAME_RESOURCE_ID_NOT_STARTS_WITH = "resource_id_not_starts_with";
  @SerializedName(SERIALIZED_NAME_RESOURCE_ID_NOT_STARTS_WITH)
  private String resourceIdNotStartsWith;

  public static final String SERIALIZED_NAME_RESOURCE_ID_STARTS_WITH = "resource_id_starts_with";
  @SerializedName(SERIALIZED_NAME_RESOURCE_ID_STARTS_WITH)
  private String resourceIdStartsWith;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private UserAuditLogStatus status;

  public static final String SERIALIZED_NAME_STATUS_IN = "status_in";
  @SerializedName(SERIALIZED_NAME_STATUS_IN)
  private List<UserAuditLogStatus> statusIn = null;

  public static final String SERIALIZED_NAME_STATUS_NOT = "status_not";
  @SerializedName(SERIALIZED_NAME_STATUS_NOT)
  private UserAuditLogStatus statusNot;

  public static final String SERIALIZED_NAME_STATUS_NOT_IN = "status_not_in";
  @SerializedName(SERIALIZED_NAME_STATUS_NOT_IN)
  private List<UserAuditLogStatus> statusNotIn = null;

  public SystemAuditLogWhereInput() { 
  }

  public SystemAuditLogWhereInput AND(List<SystemAuditLogWhereInput> AND) {
    
    this.AND = AND;
    return this;
  }

  public SystemAuditLogWhereInput addANDItem(SystemAuditLogWhereInput ANDItem) {
    if (this.AND == null) {
      this.AND = new ArrayList<SystemAuditLogWhereInput>();
    }
    this.AND.add(ANDItem);
    return this;
  }

   /**
   * Get AND
   * @return AND
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<SystemAuditLogWhereInput> getAND() {
    return AND;
  }


  public void setAND(List<SystemAuditLogWhereInput> AND) {
    this.AND = AND;
  }


  public SystemAuditLogWhereInput NOT(List<SystemAuditLogWhereInput> NOT) {
    
    this.NOT = NOT;
    return this;
  }

  public SystemAuditLogWhereInput addNOTItem(SystemAuditLogWhereInput NOTItem) {
    if (this.NOT == null) {
      this.NOT = new ArrayList<SystemAuditLogWhereInput>();
    }
    this.NOT.add(NOTItem);
    return this;
  }

   /**
   * Get NOT
   * @return NOT
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<SystemAuditLogWhereInput> getNOT() {
    return NOT;
  }


  public void setNOT(List<SystemAuditLogWhereInput> NOT) {
    this.NOT = NOT;
  }


  public SystemAuditLogWhereInput OR(List<SystemAuditLogWhereInput> OR) {
    
    this.OR = OR;
    return this;
  }

  public SystemAuditLogWhereInput addORItem(SystemAuditLogWhereInput ORItem) {
    if (this.OR == null) {
      this.OR = new ArrayList<SystemAuditLogWhereInput>();
    }
    this.OR.add(ORItem);
    return this;
  }

   /**
   * Get OR
   * @return OR
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<SystemAuditLogWhereInput> getOR() {
    return OR;
  }


  public void setOR(List<SystemAuditLogWhereInput> OR) {
    this.OR = OR;
  }


  public SystemAuditLogWhereInput action(String action) {
    
    this.action = action;
    return this;
  }

   /**
   * Get action
   * @return action
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAction() {
    return action;
  }


  public void setAction(String action) {
    this.action = action;
  }


  public SystemAuditLogWhereInput actionContains(String actionContains) {
    
    this.actionContains = actionContains;
    return this;
  }

   /**
   * Get actionContains
   * @return actionContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getActionContains() {
    return actionContains;
  }


  public void setActionContains(String actionContains) {
    this.actionContains = actionContains;
  }


  public SystemAuditLogWhereInput actionEndsWith(String actionEndsWith) {
    
    this.actionEndsWith = actionEndsWith;
    return this;
  }

   /**
   * Get actionEndsWith
   * @return actionEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getActionEndsWith() {
    return actionEndsWith;
  }


  public void setActionEndsWith(String actionEndsWith) {
    this.actionEndsWith = actionEndsWith;
  }


  public SystemAuditLogWhereInput actionGt(String actionGt) {
    
    this.actionGt = actionGt;
    return this;
  }

   /**
   * Get actionGt
   * @return actionGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getActionGt() {
    return actionGt;
  }


  public void setActionGt(String actionGt) {
    this.actionGt = actionGt;
  }


  public SystemAuditLogWhereInput actionGte(String actionGte) {
    
    this.actionGte = actionGte;
    return this;
  }

   /**
   * Get actionGte
   * @return actionGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getActionGte() {
    return actionGte;
  }


  public void setActionGte(String actionGte) {
    this.actionGte = actionGte;
  }


  public SystemAuditLogWhereInput actionIn(List<String> actionIn) {
    
    this.actionIn = actionIn;
    return this;
  }

  public SystemAuditLogWhereInput addActionInItem(String actionInItem) {
    if (this.actionIn == null) {
      this.actionIn = new ArrayList<String>();
    }
    this.actionIn.add(actionInItem);
    return this;
  }

   /**
   * Get actionIn
   * @return actionIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getActionIn() {
    return actionIn;
  }


  public void setActionIn(List<String> actionIn) {
    this.actionIn = actionIn;
  }


  public SystemAuditLogWhereInput actionLt(String actionLt) {
    
    this.actionLt = actionLt;
    return this;
  }

   /**
   * Get actionLt
   * @return actionLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getActionLt() {
    return actionLt;
  }


  public void setActionLt(String actionLt) {
    this.actionLt = actionLt;
  }


  public SystemAuditLogWhereInput actionLte(String actionLte) {
    
    this.actionLte = actionLte;
    return this;
  }

   /**
   * Get actionLte
   * @return actionLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getActionLte() {
    return actionLte;
  }


  public void setActionLte(String actionLte) {
    this.actionLte = actionLte;
  }


  public SystemAuditLogWhereInput actionNot(String actionNot) {
    
    this.actionNot = actionNot;
    return this;
  }

   /**
   * Get actionNot
   * @return actionNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getActionNot() {
    return actionNot;
  }


  public void setActionNot(String actionNot) {
    this.actionNot = actionNot;
  }


  public SystemAuditLogWhereInput actionNotContains(String actionNotContains) {
    
    this.actionNotContains = actionNotContains;
    return this;
  }

   /**
   * Get actionNotContains
   * @return actionNotContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getActionNotContains() {
    return actionNotContains;
  }


  public void setActionNotContains(String actionNotContains) {
    this.actionNotContains = actionNotContains;
  }


  public SystemAuditLogWhereInput actionNotEndsWith(String actionNotEndsWith) {
    
    this.actionNotEndsWith = actionNotEndsWith;
    return this;
  }

   /**
   * Get actionNotEndsWith
   * @return actionNotEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getActionNotEndsWith() {
    return actionNotEndsWith;
  }


  public void setActionNotEndsWith(String actionNotEndsWith) {
    this.actionNotEndsWith = actionNotEndsWith;
  }


  public SystemAuditLogWhereInput actionNotIn(List<String> actionNotIn) {
    
    this.actionNotIn = actionNotIn;
    return this;
  }

  public SystemAuditLogWhereInput addActionNotInItem(String actionNotInItem) {
    if (this.actionNotIn == null) {
      this.actionNotIn = new ArrayList<String>();
    }
    this.actionNotIn.add(actionNotInItem);
    return this;
  }

   /**
   * Get actionNotIn
   * @return actionNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getActionNotIn() {
    return actionNotIn;
  }


  public void setActionNotIn(List<String> actionNotIn) {
    this.actionNotIn = actionNotIn;
  }


  public SystemAuditLogWhereInput actionNotStartsWith(String actionNotStartsWith) {
    
    this.actionNotStartsWith = actionNotStartsWith;
    return this;
  }

   /**
   * Get actionNotStartsWith
   * @return actionNotStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getActionNotStartsWith() {
    return actionNotStartsWith;
  }


  public void setActionNotStartsWith(String actionNotStartsWith) {
    this.actionNotStartsWith = actionNotStartsWith;
  }


  public SystemAuditLogWhereInput actionStartsWith(String actionStartsWith) {
    
    this.actionStartsWith = actionStartsWith;
    return this;
  }

   /**
   * Get actionStartsWith
   * @return actionStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getActionStartsWith() {
    return actionStartsWith;
  }


  public void setActionStartsWith(String actionStartsWith) {
    this.actionStartsWith = actionStartsWith;
  }


  public SystemAuditLogWhereInput cluster(ClusterWhereInput cluster) {
    
    this.cluster = cluster;
    return this;
  }

   /**
   * Get cluster
   * @return cluster
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ClusterWhereInput getCluster() {
    return cluster;
  }


  public void setCluster(ClusterWhereInput cluster) {
    this.cluster = cluster;
  }


  public SystemAuditLogWhereInput finishedAt(String finishedAt) {
    
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


  public SystemAuditLogWhereInput finishedAtGt(String finishedAtGt) {
    
    this.finishedAtGt = finishedAtGt;
    return this;
  }

   /**
   * Get finishedAtGt
   * @return finishedAtGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getFinishedAtGt() {
    return finishedAtGt;
  }


  public void setFinishedAtGt(String finishedAtGt) {
    this.finishedAtGt = finishedAtGt;
  }


  public SystemAuditLogWhereInput finishedAtGte(String finishedAtGte) {
    
    this.finishedAtGte = finishedAtGte;
    return this;
  }

   /**
   * Get finishedAtGte
   * @return finishedAtGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getFinishedAtGte() {
    return finishedAtGte;
  }


  public void setFinishedAtGte(String finishedAtGte) {
    this.finishedAtGte = finishedAtGte;
  }


  public SystemAuditLogWhereInput finishedAtIn(List<String> finishedAtIn) {
    
    this.finishedAtIn = finishedAtIn;
    return this;
  }

  public SystemAuditLogWhereInput addFinishedAtInItem(String finishedAtInItem) {
    if (this.finishedAtIn == null) {
      this.finishedAtIn = new ArrayList<String>();
    }
    this.finishedAtIn.add(finishedAtInItem);
    return this;
  }

   /**
   * Get finishedAtIn
   * @return finishedAtIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getFinishedAtIn() {
    return finishedAtIn;
  }


  public void setFinishedAtIn(List<String> finishedAtIn) {
    this.finishedAtIn = finishedAtIn;
  }


  public SystemAuditLogWhereInput finishedAtLt(String finishedAtLt) {
    
    this.finishedAtLt = finishedAtLt;
    return this;
  }

   /**
   * Get finishedAtLt
   * @return finishedAtLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getFinishedAtLt() {
    return finishedAtLt;
  }


  public void setFinishedAtLt(String finishedAtLt) {
    this.finishedAtLt = finishedAtLt;
  }


  public SystemAuditLogWhereInput finishedAtLte(String finishedAtLte) {
    
    this.finishedAtLte = finishedAtLte;
    return this;
  }

   /**
   * Get finishedAtLte
   * @return finishedAtLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getFinishedAtLte() {
    return finishedAtLte;
  }


  public void setFinishedAtLte(String finishedAtLte) {
    this.finishedAtLte = finishedAtLte;
  }


  public SystemAuditLogWhereInput finishedAtNot(String finishedAtNot) {
    
    this.finishedAtNot = finishedAtNot;
    return this;
  }

   /**
   * Get finishedAtNot
   * @return finishedAtNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getFinishedAtNot() {
    return finishedAtNot;
  }


  public void setFinishedAtNot(String finishedAtNot) {
    this.finishedAtNot = finishedAtNot;
  }


  public SystemAuditLogWhereInput finishedAtNotIn(List<String> finishedAtNotIn) {
    
    this.finishedAtNotIn = finishedAtNotIn;
    return this;
  }

  public SystemAuditLogWhereInput addFinishedAtNotInItem(String finishedAtNotInItem) {
    if (this.finishedAtNotIn == null) {
      this.finishedAtNotIn = new ArrayList<String>();
    }
    this.finishedAtNotIn.add(finishedAtNotInItem);
    return this;
  }

   /**
   * Get finishedAtNotIn
   * @return finishedAtNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getFinishedAtNotIn() {
    return finishedAtNotIn;
  }


  public void setFinishedAtNotIn(List<String> finishedAtNotIn) {
    this.finishedAtNotIn = finishedAtNotIn;
  }


  public SystemAuditLogWhereInput id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public SystemAuditLogWhereInput idContains(String idContains) {
    
    this.idContains = idContains;
    return this;
  }

   /**
   * Get idContains
   * @return idContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIdContains() {
    return idContains;
  }


  public void setIdContains(String idContains) {
    this.idContains = idContains;
  }


  public SystemAuditLogWhereInput idEndsWith(String idEndsWith) {
    
    this.idEndsWith = idEndsWith;
    return this;
  }

   /**
   * Get idEndsWith
   * @return idEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIdEndsWith() {
    return idEndsWith;
  }


  public void setIdEndsWith(String idEndsWith) {
    this.idEndsWith = idEndsWith;
  }


  public SystemAuditLogWhereInput idGt(String idGt) {
    
    this.idGt = idGt;
    return this;
  }

   /**
   * Get idGt
   * @return idGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIdGt() {
    return idGt;
  }


  public void setIdGt(String idGt) {
    this.idGt = idGt;
  }


  public SystemAuditLogWhereInput idGte(String idGte) {
    
    this.idGte = idGte;
    return this;
  }

   /**
   * Get idGte
   * @return idGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIdGte() {
    return idGte;
  }


  public void setIdGte(String idGte) {
    this.idGte = idGte;
  }


  public SystemAuditLogWhereInput idIn(List<String> idIn) {
    
    this.idIn = idIn;
    return this;
  }

  public SystemAuditLogWhereInput addIdInItem(String idInItem) {
    if (this.idIn == null) {
      this.idIn = new ArrayList<String>();
    }
    this.idIn.add(idInItem);
    return this;
  }

   /**
   * Get idIn
   * @return idIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getIdIn() {
    return idIn;
  }


  public void setIdIn(List<String> idIn) {
    this.idIn = idIn;
  }


  public SystemAuditLogWhereInput idLt(String idLt) {
    
    this.idLt = idLt;
    return this;
  }

   /**
   * Get idLt
   * @return idLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIdLt() {
    return idLt;
  }


  public void setIdLt(String idLt) {
    this.idLt = idLt;
  }


  public SystemAuditLogWhereInput idLte(String idLte) {
    
    this.idLte = idLte;
    return this;
  }

   /**
   * Get idLte
   * @return idLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIdLte() {
    return idLte;
  }


  public void setIdLte(String idLte) {
    this.idLte = idLte;
  }


  public SystemAuditLogWhereInput idNot(String idNot) {
    
    this.idNot = idNot;
    return this;
  }

   /**
   * Get idNot
   * @return idNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIdNot() {
    return idNot;
  }


  public void setIdNot(String idNot) {
    this.idNot = idNot;
  }


  public SystemAuditLogWhereInput idNotContains(String idNotContains) {
    
    this.idNotContains = idNotContains;
    return this;
  }

   /**
   * Get idNotContains
   * @return idNotContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIdNotContains() {
    return idNotContains;
  }


  public void setIdNotContains(String idNotContains) {
    this.idNotContains = idNotContains;
  }


  public SystemAuditLogWhereInput idNotEndsWith(String idNotEndsWith) {
    
    this.idNotEndsWith = idNotEndsWith;
    return this;
  }

   /**
   * Get idNotEndsWith
   * @return idNotEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIdNotEndsWith() {
    return idNotEndsWith;
  }


  public void setIdNotEndsWith(String idNotEndsWith) {
    this.idNotEndsWith = idNotEndsWith;
  }


  public SystemAuditLogWhereInput idNotIn(List<String> idNotIn) {
    
    this.idNotIn = idNotIn;
    return this;
  }

  public SystemAuditLogWhereInput addIdNotInItem(String idNotInItem) {
    if (this.idNotIn == null) {
      this.idNotIn = new ArrayList<String>();
    }
    this.idNotIn.add(idNotInItem);
    return this;
  }

   /**
   * Get idNotIn
   * @return idNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getIdNotIn() {
    return idNotIn;
  }


  public void setIdNotIn(List<String> idNotIn) {
    this.idNotIn = idNotIn;
  }


  public SystemAuditLogWhereInput idNotStartsWith(String idNotStartsWith) {
    
    this.idNotStartsWith = idNotStartsWith;
    return this;
  }

   /**
   * Get idNotStartsWith
   * @return idNotStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIdNotStartsWith() {
    return idNotStartsWith;
  }


  public void setIdNotStartsWith(String idNotStartsWith) {
    this.idNotStartsWith = idNotStartsWith;
  }


  public SystemAuditLogWhereInput idStartsWith(String idStartsWith) {
    
    this.idStartsWith = idStartsWith;
    return this;
  }

   /**
   * Get idStartsWith
   * @return idStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIdStartsWith() {
    return idStartsWith;
  }


  public void setIdStartsWith(String idStartsWith) {
    this.idStartsWith = idStartsWith;
  }


  public SystemAuditLogWhereInput localCreatedAt(String localCreatedAt) {
    
    this.localCreatedAt = localCreatedAt;
    return this;
  }

   /**
   * Get localCreatedAt
   * @return localCreatedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLocalCreatedAt() {
    return localCreatedAt;
  }


  public void setLocalCreatedAt(String localCreatedAt) {
    this.localCreatedAt = localCreatedAt;
  }


  public SystemAuditLogWhereInput localCreatedAtGt(String localCreatedAtGt) {
    
    this.localCreatedAtGt = localCreatedAtGt;
    return this;
  }

   /**
   * Get localCreatedAtGt
   * @return localCreatedAtGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLocalCreatedAtGt() {
    return localCreatedAtGt;
  }


  public void setLocalCreatedAtGt(String localCreatedAtGt) {
    this.localCreatedAtGt = localCreatedAtGt;
  }


  public SystemAuditLogWhereInput localCreatedAtGte(String localCreatedAtGte) {
    
    this.localCreatedAtGte = localCreatedAtGte;
    return this;
  }

   /**
   * Get localCreatedAtGte
   * @return localCreatedAtGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLocalCreatedAtGte() {
    return localCreatedAtGte;
  }


  public void setLocalCreatedAtGte(String localCreatedAtGte) {
    this.localCreatedAtGte = localCreatedAtGte;
  }


  public SystemAuditLogWhereInput localCreatedAtIn(List<String> localCreatedAtIn) {
    
    this.localCreatedAtIn = localCreatedAtIn;
    return this;
  }

  public SystemAuditLogWhereInput addLocalCreatedAtInItem(String localCreatedAtInItem) {
    if (this.localCreatedAtIn == null) {
      this.localCreatedAtIn = new ArrayList<String>();
    }
    this.localCreatedAtIn.add(localCreatedAtInItem);
    return this;
  }

   /**
   * Get localCreatedAtIn
   * @return localCreatedAtIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getLocalCreatedAtIn() {
    return localCreatedAtIn;
  }


  public void setLocalCreatedAtIn(List<String> localCreatedAtIn) {
    this.localCreatedAtIn = localCreatedAtIn;
  }


  public SystemAuditLogWhereInput localCreatedAtLt(String localCreatedAtLt) {
    
    this.localCreatedAtLt = localCreatedAtLt;
    return this;
  }

   /**
   * Get localCreatedAtLt
   * @return localCreatedAtLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLocalCreatedAtLt() {
    return localCreatedAtLt;
  }


  public void setLocalCreatedAtLt(String localCreatedAtLt) {
    this.localCreatedAtLt = localCreatedAtLt;
  }


  public SystemAuditLogWhereInput localCreatedAtLte(String localCreatedAtLte) {
    
    this.localCreatedAtLte = localCreatedAtLte;
    return this;
  }

   /**
   * Get localCreatedAtLte
   * @return localCreatedAtLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLocalCreatedAtLte() {
    return localCreatedAtLte;
  }


  public void setLocalCreatedAtLte(String localCreatedAtLte) {
    this.localCreatedAtLte = localCreatedAtLte;
  }


  public SystemAuditLogWhereInput localCreatedAtNot(String localCreatedAtNot) {
    
    this.localCreatedAtNot = localCreatedAtNot;
    return this;
  }

   /**
   * Get localCreatedAtNot
   * @return localCreatedAtNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLocalCreatedAtNot() {
    return localCreatedAtNot;
  }


  public void setLocalCreatedAtNot(String localCreatedAtNot) {
    this.localCreatedAtNot = localCreatedAtNot;
  }


  public SystemAuditLogWhereInput localCreatedAtNotIn(List<String> localCreatedAtNotIn) {
    
    this.localCreatedAtNotIn = localCreatedAtNotIn;
    return this;
  }

  public SystemAuditLogWhereInput addLocalCreatedAtNotInItem(String localCreatedAtNotInItem) {
    if (this.localCreatedAtNotIn == null) {
      this.localCreatedAtNotIn = new ArrayList<String>();
    }
    this.localCreatedAtNotIn.add(localCreatedAtNotInItem);
    return this;
  }

   /**
   * Get localCreatedAtNotIn
   * @return localCreatedAtNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getLocalCreatedAtNotIn() {
    return localCreatedAtNotIn;
  }


  public void setLocalCreatedAtNotIn(List<String> localCreatedAtNotIn) {
    this.localCreatedAtNotIn = localCreatedAtNotIn;
  }


  public SystemAuditLogWhereInput localId(String localId) {
    
    this.localId = localId;
    return this;
  }

   /**
   * Get localId
   * @return localId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLocalId() {
    return localId;
  }


  public void setLocalId(String localId) {
    this.localId = localId;
  }


  public SystemAuditLogWhereInput localIdContains(String localIdContains) {
    
    this.localIdContains = localIdContains;
    return this;
  }

   /**
   * Get localIdContains
   * @return localIdContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLocalIdContains() {
    return localIdContains;
  }


  public void setLocalIdContains(String localIdContains) {
    this.localIdContains = localIdContains;
  }


  public SystemAuditLogWhereInput localIdEndsWith(String localIdEndsWith) {
    
    this.localIdEndsWith = localIdEndsWith;
    return this;
  }

   /**
   * Get localIdEndsWith
   * @return localIdEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLocalIdEndsWith() {
    return localIdEndsWith;
  }


  public void setLocalIdEndsWith(String localIdEndsWith) {
    this.localIdEndsWith = localIdEndsWith;
  }


  public SystemAuditLogWhereInput localIdGt(String localIdGt) {
    
    this.localIdGt = localIdGt;
    return this;
  }

   /**
   * Get localIdGt
   * @return localIdGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLocalIdGt() {
    return localIdGt;
  }


  public void setLocalIdGt(String localIdGt) {
    this.localIdGt = localIdGt;
  }


  public SystemAuditLogWhereInput localIdGte(String localIdGte) {
    
    this.localIdGte = localIdGte;
    return this;
  }

   /**
   * Get localIdGte
   * @return localIdGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLocalIdGte() {
    return localIdGte;
  }


  public void setLocalIdGte(String localIdGte) {
    this.localIdGte = localIdGte;
  }


  public SystemAuditLogWhereInput localIdIn(List<String> localIdIn) {
    
    this.localIdIn = localIdIn;
    return this;
  }

  public SystemAuditLogWhereInput addLocalIdInItem(String localIdInItem) {
    if (this.localIdIn == null) {
      this.localIdIn = new ArrayList<String>();
    }
    this.localIdIn.add(localIdInItem);
    return this;
  }

   /**
   * Get localIdIn
   * @return localIdIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getLocalIdIn() {
    return localIdIn;
  }


  public void setLocalIdIn(List<String> localIdIn) {
    this.localIdIn = localIdIn;
  }


  public SystemAuditLogWhereInput localIdLt(String localIdLt) {
    
    this.localIdLt = localIdLt;
    return this;
  }

   /**
   * Get localIdLt
   * @return localIdLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLocalIdLt() {
    return localIdLt;
  }


  public void setLocalIdLt(String localIdLt) {
    this.localIdLt = localIdLt;
  }


  public SystemAuditLogWhereInput localIdLte(String localIdLte) {
    
    this.localIdLte = localIdLte;
    return this;
  }

   /**
   * Get localIdLte
   * @return localIdLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLocalIdLte() {
    return localIdLte;
  }


  public void setLocalIdLte(String localIdLte) {
    this.localIdLte = localIdLte;
  }


  public SystemAuditLogWhereInput localIdNot(String localIdNot) {
    
    this.localIdNot = localIdNot;
    return this;
  }

   /**
   * Get localIdNot
   * @return localIdNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLocalIdNot() {
    return localIdNot;
  }


  public void setLocalIdNot(String localIdNot) {
    this.localIdNot = localIdNot;
  }


  public SystemAuditLogWhereInput localIdNotContains(String localIdNotContains) {
    
    this.localIdNotContains = localIdNotContains;
    return this;
  }

   /**
   * Get localIdNotContains
   * @return localIdNotContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLocalIdNotContains() {
    return localIdNotContains;
  }


  public void setLocalIdNotContains(String localIdNotContains) {
    this.localIdNotContains = localIdNotContains;
  }


  public SystemAuditLogWhereInput localIdNotEndsWith(String localIdNotEndsWith) {
    
    this.localIdNotEndsWith = localIdNotEndsWith;
    return this;
  }

   /**
   * Get localIdNotEndsWith
   * @return localIdNotEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLocalIdNotEndsWith() {
    return localIdNotEndsWith;
  }


  public void setLocalIdNotEndsWith(String localIdNotEndsWith) {
    this.localIdNotEndsWith = localIdNotEndsWith;
  }


  public SystemAuditLogWhereInput localIdNotIn(List<String> localIdNotIn) {
    
    this.localIdNotIn = localIdNotIn;
    return this;
  }

  public SystemAuditLogWhereInput addLocalIdNotInItem(String localIdNotInItem) {
    if (this.localIdNotIn == null) {
      this.localIdNotIn = new ArrayList<String>();
    }
    this.localIdNotIn.add(localIdNotInItem);
    return this;
  }

   /**
   * Get localIdNotIn
   * @return localIdNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getLocalIdNotIn() {
    return localIdNotIn;
  }


  public void setLocalIdNotIn(List<String> localIdNotIn) {
    this.localIdNotIn = localIdNotIn;
  }


  public SystemAuditLogWhereInput localIdNotStartsWith(String localIdNotStartsWith) {
    
    this.localIdNotStartsWith = localIdNotStartsWith;
    return this;
  }

   /**
   * Get localIdNotStartsWith
   * @return localIdNotStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLocalIdNotStartsWith() {
    return localIdNotStartsWith;
  }


  public void setLocalIdNotStartsWith(String localIdNotStartsWith) {
    this.localIdNotStartsWith = localIdNotStartsWith;
  }


  public SystemAuditLogWhereInput localIdStartsWith(String localIdStartsWith) {
    
    this.localIdStartsWith = localIdStartsWith;
    return this;
  }

   /**
   * Get localIdStartsWith
   * @return localIdStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLocalIdStartsWith() {
    return localIdStartsWith;
  }


  public void setLocalIdStartsWith(String localIdStartsWith) {
    this.localIdStartsWith = localIdStartsWith;
  }


  public SystemAuditLogWhereInput message(String message) {
    
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMessage() {
    return message;
  }


  public void setMessage(String message) {
    this.message = message;
  }


  public SystemAuditLogWhereInput messageContains(String messageContains) {
    
    this.messageContains = messageContains;
    return this;
  }

   /**
   * Get messageContains
   * @return messageContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMessageContains() {
    return messageContains;
  }


  public void setMessageContains(String messageContains) {
    this.messageContains = messageContains;
  }


  public SystemAuditLogWhereInput messageEndsWith(String messageEndsWith) {
    
    this.messageEndsWith = messageEndsWith;
    return this;
  }

   /**
   * Get messageEndsWith
   * @return messageEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMessageEndsWith() {
    return messageEndsWith;
  }


  public void setMessageEndsWith(String messageEndsWith) {
    this.messageEndsWith = messageEndsWith;
  }


  public SystemAuditLogWhereInput messageGt(String messageGt) {
    
    this.messageGt = messageGt;
    return this;
  }

   /**
   * Get messageGt
   * @return messageGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMessageGt() {
    return messageGt;
  }


  public void setMessageGt(String messageGt) {
    this.messageGt = messageGt;
  }


  public SystemAuditLogWhereInput messageGte(String messageGte) {
    
    this.messageGte = messageGte;
    return this;
  }

   /**
   * Get messageGte
   * @return messageGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMessageGte() {
    return messageGte;
  }


  public void setMessageGte(String messageGte) {
    this.messageGte = messageGte;
  }


  public SystemAuditLogWhereInput messageIn(List<String> messageIn) {
    
    this.messageIn = messageIn;
    return this;
  }

  public SystemAuditLogWhereInput addMessageInItem(String messageInItem) {
    if (this.messageIn == null) {
      this.messageIn = new ArrayList<String>();
    }
    this.messageIn.add(messageInItem);
    return this;
  }

   /**
   * Get messageIn
   * @return messageIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getMessageIn() {
    return messageIn;
  }


  public void setMessageIn(List<String> messageIn) {
    this.messageIn = messageIn;
  }


  public SystemAuditLogWhereInput messageLt(String messageLt) {
    
    this.messageLt = messageLt;
    return this;
  }

   /**
   * Get messageLt
   * @return messageLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMessageLt() {
    return messageLt;
  }


  public void setMessageLt(String messageLt) {
    this.messageLt = messageLt;
  }


  public SystemAuditLogWhereInput messageLte(String messageLte) {
    
    this.messageLte = messageLte;
    return this;
  }

   /**
   * Get messageLte
   * @return messageLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMessageLte() {
    return messageLte;
  }


  public void setMessageLte(String messageLte) {
    this.messageLte = messageLte;
  }


  public SystemAuditLogWhereInput messageNot(String messageNot) {
    
    this.messageNot = messageNot;
    return this;
  }

   /**
   * Get messageNot
   * @return messageNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMessageNot() {
    return messageNot;
  }


  public void setMessageNot(String messageNot) {
    this.messageNot = messageNot;
  }


  public SystemAuditLogWhereInput messageNotContains(String messageNotContains) {
    
    this.messageNotContains = messageNotContains;
    return this;
  }

   /**
   * Get messageNotContains
   * @return messageNotContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMessageNotContains() {
    return messageNotContains;
  }


  public void setMessageNotContains(String messageNotContains) {
    this.messageNotContains = messageNotContains;
  }


  public SystemAuditLogWhereInput messageNotEndsWith(String messageNotEndsWith) {
    
    this.messageNotEndsWith = messageNotEndsWith;
    return this;
  }

   /**
   * Get messageNotEndsWith
   * @return messageNotEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMessageNotEndsWith() {
    return messageNotEndsWith;
  }


  public void setMessageNotEndsWith(String messageNotEndsWith) {
    this.messageNotEndsWith = messageNotEndsWith;
  }


  public SystemAuditLogWhereInput messageNotIn(List<String> messageNotIn) {
    
    this.messageNotIn = messageNotIn;
    return this;
  }

  public SystemAuditLogWhereInput addMessageNotInItem(String messageNotInItem) {
    if (this.messageNotIn == null) {
      this.messageNotIn = new ArrayList<String>();
    }
    this.messageNotIn.add(messageNotInItem);
    return this;
  }

   /**
   * Get messageNotIn
   * @return messageNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getMessageNotIn() {
    return messageNotIn;
  }


  public void setMessageNotIn(List<String> messageNotIn) {
    this.messageNotIn = messageNotIn;
  }


  public SystemAuditLogWhereInput messageNotStartsWith(String messageNotStartsWith) {
    
    this.messageNotStartsWith = messageNotStartsWith;
    return this;
  }

   /**
   * Get messageNotStartsWith
   * @return messageNotStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMessageNotStartsWith() {
    return messageNotStartsWith;
  }


  public void setMessageNotStartsWith(String messageNotStartsWith) {
    this.messageNotStartsWith = messageNotStartsWith;
  }


  public SystemAuditLogWhereInput messageStartsWith(String messageStartsWith) {
    
    this.messageStartsWith = messageStartsWith;
    return this;
  }

   /**
   * Get messageStartsWith
   * @return messageStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMessageStartsWith() {
    return messageStartsWith;
  }


  public void setMessageStartsWith(String messageStartsWith) {
    this.messageStartsWith = messageStartsWith;
  }


  public SystemAuditLogWhereInput resourceId(String resourceId) {
    
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


  public SystemAuditLogWhereInput resourceIdContains(String resourceIdContains) {
    
    this.resourceIdContains = resourceIdContains;
    return this;
  }

   /**
   * Get resourceIdContains
   * @return resourceIdContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getResourceIdContains() {
    return resourceIdContains;
  }


  public void setResourceIdContains(String resourceIdContains) {
    this.resourceIdContains = resourceIdContains;
  }


  public SystemAuditLogWhereInput resourceIdEndsWith(String resourceIdEndsWith) {
    
    this.resourceIdEndsWith = resourceIdEndsWith;
    return this;
  }

   /**
   * Get resourceIdEndsWith
   * @return resourceIdEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getResourceIdEndsWith() {
    return resourceIdEndsWith;
  }


  public void setResourceIdEndsWith(String resourceIdEndsWith) {
    this.resourceIdEndsWith = resourceIdEndsWith;
  }


  public SystemAuditLogWhereInput resourceIdGt(String resourceIdGt) {
    
    this.resourceIdGt = resourceIdGt;
    return this;
  }

   /**
   * Get resourceIdGt
   * @return resourceIdGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getResourceIdGt() {
    return resourceIdGt;
  }


  public void setResourceIdGt(String resourceIdGt) {
    this.resourceIdGt = resourceIdGt;
  }


  public SystemAuditLogWhereInput resourceIdGte(String resourceIdGte) {
    
    this.resourceIdGte = resourceIdGte;
    return this;
  }

   /**
   * Get resourceIdGte
   * @return resourceIdGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getResourceIdGte() {
    return resourceIdGte;
  }


  public void setResourceIdGte(String resourceIdGte) {
    this.resourceIdGte = resourceIdGte;
  }


  public SystemAuditLogWhereInput resourceIdIn(List<String> resourceIdIn) {
    
    this.resourceIdIn = resourceIdIn;
    return this;
  }

  public SystemAuditLogWhereInput addResourceIdInItem(String resourceIdInItem) {
    if (this.resourceIdIn == null) {
      this.resourceIdIn = new ArrayList<String>();
    }
    this.resourceIdIn.add(resourceIdInItem);
    return this;
  }

   /**
   * Get resourceIdIn
   * @return resourceIdIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getResourceIdIn() {
    return resourceIdIn;
  }


  public void setResourceIdIn(List<String> resourceIdIn) {
    this.resourceIdIn = resourceIdIn;
  }


  public SystemAuditLogWhereInput resourceIdLt(String resourceIdLt) {
    
    this.resourceIdLt = resourceIdLt;
    return this;
  }

   /**
   * Get resourceIdLt
   * @return resourceIdLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getResourceIdLt() {
    return resourceIdLt;
  }


  public void setResourceIdLt(String resourceIdLt) {
    this.resourceIdLt = resourceIdLt;
  }


  public SystemAuditLogWhereInput resourceIdLte(String resourceIdLte) {
    
    this.resourceIdLte = resourceIdLte;
    return this;
  }

   /**
   * Get resourceIdLte
   * @return resourceIdLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getResourceIdLte() {
    return resourceIdLte;
  }


  public void setResourceIdLte(String resourceIdLte) {
    this.resourceIdLte = resourceIdLte;
  }


  public SystemAuditLogWhereInput resourceIdNot(String resourceIdNot) {
    
    this.resourceIdNot = resourceIdNot;
    return this;
  }

   /**
   * Get resourceIdNot
   * @return resourceIdNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getResourceIdNot() {
    return resourceIdNot;
  }


  public void setResourceIdNot(String resourceIdNot) {
    this.resourceIdNot = resourceIdNot;
  }


  public SystemAuditLogWhereInput resourceIdNotContains(String resourceIdNotContains) {
    
    this.resourceIdNotContains = resourceIdNotContains;
    return this;
  }

   /**
   * Get resourceIdNotContains
   * @return resourceIdNotContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getResourceIdNotContains() {
    return resourceIdNotContains;
  }


  public void setResourceIdNotContains(String resourceIdNotContains) {
    this.resourceIdNotContains = resourceIdNotContains;
  }


  public SystemAuditLogWhereInput resourceIdNotEndsWith(String resourceIdNotEndsWith) {
    
    this.resourceIdNotEndsWith = resourceIdNotEndsWith;
    return this;
  }

   /**
   * Get resourceIdNotEndsWith
   * @return resourceIdNotEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getResourceIdNotEndsWith() {
    return resourceIdNotEndsWith;
  }


  public void setResourceIdNotEndsWith(String resourceIdNotEndsWith) {
    this.resourceIdNotEndsWith = resourceIdNotEndsWith;
  }


  public SystemAuditLogWhereInput resourceIdNotIn(List<String> resourceIdNotIn) {
    
    this.resourceIdNotIn = resourceIdNotIn;
    return this;
  }

  public SystemAuditLogWhereInput addResourceIdNotInItem(String resourceIdNotInItem) {
    if (this.resourceIdNotIn == null) {
      this.resourceIdNotIn = new ArrayList<String>();
    }
    this.resourceIdNotIn.add(resourceIdNotInItem);
    return this;
  }

   /**
   * Get resourceIdNotIn
   * @return resourceIdNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getResourceIdNotIn() {
    return resourceIdNotIn;
  }


  public void setResourceIdNotIn(List<String> resourceIdNotIn) {
    this.resourceIdNotIn = resourceIdNotIn;
  }


  public SystemAuditLogWhereInput resourceIdNotStartsWith(String resourceIdNotStartsWith) {
    
    this.resourceIdNotStartsWith = resourceIdNotStartsWith;
    return this;
  }

   /**
   * Get resourceIdNotStartsWith
   * @return resourceIdNotStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getResourceIdNotStartsWith() {
    return resourceIdNotStartsWith;
  }


  public void setResourceIdNotStartsWith(String resourceIdNotStartsWith) {
    this.resourceIdNotStartsWith = resourceIdNotStartsWith;
  }


  public SystemAuditLogWhereInput resourceIdStartsWith(String resourceIdStartsWith) {
    
    this.resourceIdStartsWith = resourceIdStartsWith;
    return this;
  }

   /**
   * Get resourceIdStartsWith
   * @return resourceIdStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getResourceIdStartsWith() {
    return resourceIdStartsWith;
  }


  public void setResourceIdStartsWith(String resourceIdStartsWith) {
    this.resourceIdStartsWith = resourceIdStartsWith;
  }


  public SystemAuditLogWhereInput status(UserAuditLogStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UserAuditLogStatus getStatus() {
    return status;
  }


  public void setStatus(UserAuditLogStatus status) {
    this.status = status;
  }


  public SystemAuditLogWhereInput statusIn(List<UserAuditLogStatus> statusIn) {
    
    this.statusIn = statusIn;
    return this;
  }

  public SystemAuditLogWhereInput addStatusInItem(UserAuditLogStatus statusInItem) {
    if (this.statusIn == null) {
      this.statusIn = new ArrayList<UserAuditLogStatus>();
    }
    this.statusIn.add(statusInItem);
    return this;
  }

   /**
   * Get statusIn
   * @return statusIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<UserAuditLogStatus> getStatusIn() {
    return statusIn;
  }


  public void setStatusIn(List<UserAuditLogStatus> statusIn) {
    this.statusIn = statusIn;
  }


  public SystemAuditLogWhereInput statusNot(UserAuditLogStatus statusNot) {
    
    this.statusNot = statusNot;
    return this;
  }

   /**
   * Get statusNot
   * @return statusNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UserAuditLogStatus getStatusNot() {
    return statusNot;
  }


  public void setStatusNot(UserAuditLogStatus statusNot) {
    this.statusNot = statusNot;
  }


  public SystemAuditLogWhereInput statusNotIn(List<UserAuditLogStatus> statusNotIn) {
    
    this.statusNotIn = statusNotIn;
    return this;
  }

  public SystemAuditLogWhereInput addStatusNotInItem(UserAuditLogStatus statusNotInItem) {
    if (this.statusNotIn == null) {
      this.statusNotIn = new ArrayList<UserAuditLogStatus>();
    }
    this.statusNotIn.add(statusNotInItem);
    return this;
  }

   /**
   * Get statusNotIn
   * @return statusNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<UserAuditLogStatus> getStatusNotIn() {
    return statusNotIn;
  }


  public void setStatusNotIn(List<UserAuditLogStatus> statusNotIn) {
    this.statusNotIn = statusNotIn;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SystemAuditLogWhereInput systemAuditLogWhereInput = (SystemAuditLogWhereInput) o;
    return Objects.equals(this.AND, systemAuditLogWhereInput.AND) &&
        Objects.equals(this.NOT, systemAuditLogWhereInput.NOT) &&
        Objects.equals(this.OR, systemAuditLogWhereInput.OR) &&
        Objects.equals(this.action, systemAuditLogWhereInput.action) &&
        Objects.equals(this.actionContains, systemAuditLogWhereInput.actionContains) &&
        Objects.equals(this.actionEndsWith, systemAuditLogWhereInput.actionEndsWith) &&
        Objects.equals(this.actionGt, systemAuditLogWhereInput.actionGt) &&
        Objects.equals(this.actionGte, systemAuditLogWhereInput.actionGte) &&
        Objects.equals(this.actionIn, systemAuditLogWhereInput.actionIn) &&
        Objects.equals(this.actionLt, systemAuditLogWhereInput.actionLt) &&
        Objects.equals(this.actionLte, systemAuditLogWhereInput.actionLte) &&
        Objects.equals(this.actionNot, systemAuditLogWhereInput.actionNot) &&
        Objects.equals(this.actionNotContains, systemAuditLogWhereInput.actionNotContains) &&
        Objects.equals(this.actionNotEndsWith, systemAuditLogWhereInput.actionNotEndsWith) &&
        Objects.equals(this.actionNotIn, systemAuditLogWhereInput.actionNotIn) &&
        Objects.equals(this.actionNotStartsWith, systemAuditLogWhereInput.actionNotStartsWith) &&
        Objects.equals(this.actionStartsWith, systemAuditLogWhereInput.actionStartsWith) &&
        Objects.equals(this.cluster, systemAuditLogWhereInput.cluster) &&
        Objects.equals(this.finishedAt, systemAuditLogWhereInput.finishedAt) &&
        Objects.equals(this.finishedAtGt, systemAuditLogWhereInput.finishedAtGt) &&
        Objects.equals(this.finishedAtGte, systemAuditLogWhereInput.finishedAtGte) &&
        Objects.equals(this.finishedAtIn, systemAuditLogWhereInput.finishedAtIn) &&
        Objects.equals(this.finishedAtLt, systemAuditLogWhereInput.finishedAtLt) &&
        Objects.equals(this.finishedAtLte, systemAuditLogWhereInput.finishedAtLte) &&
        Objects.equals(this.finishedAtNot, systemAuditLogWhereInput.finishedAtNot) &&
        Objects.equals(this.finishedAtNotIn, systemAuditLogWhereInput.finishedAtNotIn) &&
        Objects.equals(this.id, systemAuditLogWhereInput.id) &&
        Objects.equals(this.idContains, systemAuditLogWhereInput.idContains) &&
        Objects.equals(this.idEndsWith, systemAuditLogWhereInput.idEndsWith) &&
        Objects.equals(this.idGt, systemAuditLogWhereInput.idGt) &&
        Objects.equals(this.idGte, systemAuditLogWhereInput.idGte) &&
        Objects.equals(this.idIn, systemAuditLogWhereInput.idIn) &&
        Objects.equals(this.idLt, systemAuditLogWhereInput.idLt) &&
        Objects.equals(this.idLte, systemAuditLogWhereInput.idLte) &&
        Objects.equals(this.idNot, systemAuditLogWhereInput.idNot) &&
        Objects.equals(this.idNotContains, systemAuditLogWhereInput.idNotContains) &&
        Objects.equals(this.idNotEndsWith, systemAuditLogWhereInput.idNotEndsWith) &&
        Objects.equals(this.idNotIn, systemAuditLogWhereInput.idNotIn) &&
        Objects.equals(this.idNotStartsWith, systemAuditLogWhereInput.idNotStartsWith) &&
        Objects.equals(this.idStartsWith, systemAuditLogWhereInput.idStartsWith) &&
        Objects.equals(this.localCreatedAt, systemAuditLogWhereInput.localCreatedAt) &&
        Objects.equals(this.localCreatedAtGt, systemAuditLogWhereInput.localCreatedAtGt) &&
        Objects.equals(this.localCreatedAtGte, systemAuditLogWhereInput.localCreatedAtGte) &&
        Objects.equals(this.localCreatedAtIn, systemAuditLogWhereInput.localCreatedAtIn) &&
        Objects.equals(this.localCreatedAtLt, systemAuditLogWhereInput.localCreatedAtLt) &&
        Objects.equals(this.localCreatedAtLte, systemAuditLogWhereInput.localCreatedAtLte) &&
        Objects.equals(this.localCreatedAtNot, systemAuditLogWhereInput.localCreatedAtNot) &&
        Objects.equals(this.localCreatedAtNotIn, systemAuditLogWhereInput.localCreatedAtNotIn) &&
        Objects.equals(this.localId, systemAuditLogWhereInput.localId) &&
        Objects.equals(this.localIdContains, systemAuditLogWhereInput.localIdContains) &&
        Objects.equals(this.localIdEndsWith, systemAuditLogWhereInput.localIdEndsWith) &&
        Objects.equals(this.localIdGt, systemAuditLogWhereInput.localIdGt) &&
        Objects.equals(this.localIdGte, systemAuditLogWhereInput.localIdGte) &&
        Objects.equals(this.localIdIn, systemAuditLogWhereInput.localIdIn) &&
        Objects.equals(this.localIdLt, systemAuditLogWhereInput.localIdLt) &&
        Objects.equals(this.localIdLte, systemAuditLogWhereInput.localIdLte) &&
        Objects.equals(this.localIdNot, systemAuditLogWhereInput.localIdNot) &&
        Objects.equals(this.localIdNotContains, systemAuditLogWhereInput.localIdNotContains) &&
        Objects.equals(this.localIdNotEndsWith, systemAuditLogWhereInput.localIdNotEndsWith) &&
        Objects.equals(this.localIdNotIn, systemAuditLogWhereInput.localIdNotIn) &&
        Objects.equals(this.localIdNotStartsWith, systemAuditLogWhereInput.localIdNotStartsWith) &&
        Objects.equals(this.localIdStartsWith, systemAuditLogWhereInput.localIdStartsWith) &&
        Objects.equals(this.message, systemAuditLogWhereInput.message) &&
        Objects.equals(this.messageContains, systemAuditLogWhereInput.messageContains) &&
        Objects.equals(this.messageEndsWith, systemAuditLogWhereInput.messageEndsWith) &&
        Objects.equals(this.messageGt, systemAuditLogWhereInput.messageGt) &&
        Objects.equals(this.messageGte, systemAuditLogWhereInput.messageGte) &&
        Objects.equals(this.messageIn, systemAuditLogWhereInput.messageIn) &&
        Objects.equals(this.messageLt, systemAuditLogWhereInput.messageLt) &&
        Objects.equals(this.messageLte, systemAuditLogWhereInput.messageLte) &&
        Objects.equals(this.messageNot, systemAuditLogWhereInput.messageNot) &&
        Objects.equals(this.messageNotContains, systemAuditLogWhereInput.messageNotContains) &&
        Objects.equals(this.messageNotEndsWith, systemAuditLogWhereInput.messageNotEndsWith) &&
        Objects.equals(this.messageNotIn, systemAuditLogWhereInput.messageNotIn) &&
        Objects.equals(this.messageNotStartsWith, systemAuditLogWhereInput.messageNotStartsWith) &&
        Objects.equals(this.messageStartsWith, systemAuditLogWhereInput.messageStartsWith) &&
        Objects.equals(this.resourceId, systemAuditLogWhereInput.resourceId) &&
        Objects.equals(this.resourceIdContains, systemAuditLogWhereInput.resourceIdContains) &&
        Objects.equals(this.resourceIdEndsWith, systemAuditLogWhereInput.resourceIdEndsWith) &&
        Objects.equals(this.resourceIdGt, systemAuditLogWhereInput.resourceIdGt) &&
        Objects.equals(this.resourceIdGte, systemAuditLogWhereInput.resourceIdGte) &&
        Objects.equals(this.resourceIdIn, systemAuditLogWhereInput.resourceIdIn) &&
        Objects.equals(this.resourceIdLt, systemAuditLogWhereInput.resourceIdLt) &&
        Objects.equals(this.resourceIdLte, systemAuditLogWhereInput.resourceIdLte) &&
        Objects.equals(this.resourceIdNot, systemAuditLogWhereInput.resourceIdNot) &&
        Objects.equals(this.resourceIdNotContains, systemAuditLogWhereInput.resourceIdNotContains) &&
        Objects.equals(this.resourceIdNotEndsWith, systemAuditLogWhereInput.resourceIdNotEndsWith) &&
        Objects.equals(this.resourceIdNotIn, systemAuditLogWhereInput.resourceIdNotIn) &&
        Objects.equals(this.resourceIdNotStartsWith, systemAuditLogWhereInput.resourceIdNotStartsWith) &&
        Objects.equals(this.resourceIdStartsWith, systemAuditLogWhereInput.resourceIdStartsWith) &&
        Objects.equals(this.status, systemAuditLogWhereInput.status) &&
        Objects.equals(this.statusIn, systemAuditLogWhereInput.statusIn) &&
        Objects.equals(this.statusNot, systemAuditLogWhereInput.statusNot) &&
        Objects.equals(this.statusNotIn, systemAuditLogWhereInput.statusNotIn);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(AND, NOT, OR, action, actionContains, actionEndsWith, actionGt, actionGte, actionIn, actionLt, actionLte, actionNot, actionNotContains, actionNotEndsWith, actionNotIn, actionNotStartsWith, actionStartsWith, cluster, finishedAt, finishedAtGt, finishedAtGte, finishedAtIn, finishedAtLt, finishedAtLte, finishedAtNot, finishedAtNotIn, id, idContains, idEndsWith, idGt, idGte, idIn, idLt, idLte, idNot, idNotContains, idNotEndsWith, idNotIn, idNotStartsWith, idStartsWith, localCreatedAt, localCreatedAtGt, localCreatedAtGte, localCreatedAtIn, localCreatedAtLt, localCreatedAtLte, localCreatedAtNot, localCreatedAtNotIn, localId, localIdContains, localIdEndsWith, localIdGt, localIdGte, localIdIn, localIdLt, localIdLte, localIdNot, localIdNotContains, localIdNotEndsWith, localIdNotIn, localIdNotStartsWith, localIdStartsWith, message, messageContains, messageEndsWith, messageGt, messageGte, messageIn, messageLt, messageLte, messageNot, messageNotContains, messageNotEndsWith, messageNotIn, messageNotStartsWith, messageStartsWith, resourceId, resourceIdContains, resourceIdEndsWith, resourceIdGt, resourceIdGte, resourceIdIn, resourceIdLt, resourceIdLte, resourceIdNot, resourceIdNotContains, resourceIdNotEndsWith, resourceIdNotIn, resourceIdNotStartsWith, resourceIdStartsWith, status, statusIn, statusNot, statusNotIn);
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
    sb.append("class SystemAuditLogWhereInput {\n");
    sb.append("    AND: ").append(toIndentedString(AND)).append("\n");
    sb.append("    NOT: ").append(toIndentedString(NOT)).append("\n");
    sb.append("    OR: ").append(toIndentedString(OR)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    actionContains: ").append(toIndentedString(actionContains)).append("\n");
    sb.append("    actionEndsWith: ").append(toIndentedString(actionEndsWith)).append("\n");
    sb.append("    actionGt: ").append(toIndentedString(actionGt)).append("\n");
    sb.append("    actionGte: ").append(toIndentedString(actionGte)).append("\n");
    sb.append("    actionIn: ").append(toIndentedString(actionIn)).append("\n");
    sb.append("    actionLt: ").append(toIndentedString(actionLt)).append("\n");
    sb.append("    actionLte: ").append(toIndentedString(actionLte)).append("\n");
    sb.append("    actionNot: ").append(toIndentedString(actionNot)).append("\n");
    sb.append("    actionNotContains: ").append(toIndentedString(actionNotContains)).append("\n");
    sb.append("    actionNotEndsWith: ").append(toIndentedString(actionNotEndsWith)).append("\n");
    sb.append("    actionNotIn: ").append(toIndentedString(actionNotIn)).append("\n");
    sb.append("    actionNotStartsWith: ").append(toIndentedString(actionNotStartsWith)).append("\n");
    sb.append("    actionStartsWith: ").append(toIndentedString(actionStartsWith)).append("\n");
    sb.append("    cluster: ").append(toIndentedString(cluster)).append("\n");
    sb.append("    finishedAt: ").append(toIndentedString(finishedAt)).append("\n");
    sb.append("    finishedAtGt: ").append(toIndentedString(finishedAtGt)).append("\n");
    sb.append("    finishedAtGte: ").append(toIndentedString(finishedAtGte)).append("\n");
    sb.append("    finishedAtIn: ").append(toIndentedString(finishedAtIn)).append("\n");
    sb.append("    finishedAtLt: ").append(toIndentedString(finishedAtLt)).append("\n");
    sb.append("    finishedAtLte: ").append(toIndentedString(finishedAtLte)).append("\n");
    sb.append("    finishedAtNot: ").append(toIndentedString(finishedAtNot)).append("\n");
    sb.append("    finishedAtNotIn: ").append(toIndentedString(finishedAtNotIn)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    idContains: ").append(toIndentedString(idContains)).append("\n");
    sb.append("    idEndsWith: ").append(toIndentedString(idEndsWith)).append("\n");
    sb.append("    idGt: ").append(toIndentedString(idGt)).append("\n");
    sb.append("    idGte: ").append(toIndentedString(idGte)).append("\n");
    sb.append("    idIn: ").append(toIndentedString(idIn)).append("\n");
    sb.append("    idLt: ").append(toIndentedString(idLt)).append("\n");
    sb.append("    idLte: ").append(toIndentedString(idLte)).append("\n");
    sb.append("    idNot: ").append(toIndentedString(idNot)).append("\n");
    sb.append("    idNotContains: ").append(toIndentedString(idNotContains)).append("\n");
    sb.append("    idNotEndsWith: ").append(toIndentedString(idNotEndsWith)).append("\n");
    sb.append("    idNotIn: ").append(toIndentedString(idNotIn)).append("\n");
    sb.append("    idNotStartsWith: ").append(toIndentedString(idNotStartsWith)).append("\n");
    sb.append("    idStartsWith: ").append(toIndentedString(idStartsWith)).append("\n");
    sb.append("    localCreatedAt: ").append(toIndentedString(localCreatedAt)).append("\n");
    sb.append("    localCreatedAtGt: ").append(toIndentedString(localCreatedAtGt)).append("\n");
    sb.append("    localCreatedAtGte: ").append(toIndentedString(localCreatedAtGte)).append("\n");
    sb.append("    localCreatedAtIn: ").append(toIndentedString(localCreatedAtIn)).append("\n");
    sb.append("    localCreatedAtLt: ").append(toIndentedString(localCreatedAtLt)).append("\n");
    sb.append("    localCreatedAtLte: ").append(toIndentedString(localCreatedAtLte)).append("\n");
    sb.append("    localCreatedAtNot: ").append(toIndentedString(localCreatedAtNot)).append("\n");
    sb.append("    localCreatedAtNotIn: ").append(toIndentedString(localCreatedAtNotIn)).append("\n");
    sb.append("    localId: ").append(toIndentedString(localId)).append("\n");
    sb.append("    localIdContains: ").append(toIndentedString(localIdContains)).append("\n");
    sb.append("    localIdEndsWith: ").append(toIndentedString(localIdEndsWith)).append("\n");
    sb.append("    localIdGt: ").append(toIndentedString(localIdGt)).append("\n");
    sb.append("    localIdGte: ").append(toIndentedString(localIdGte)).append("\n");
    sb.append("    localIdIn: ").append(toIndentedString(localIdIn)).append("\n");
    sb.append("    localIdLt: ").append(toIndentedString(localIdLt)).append("\n");
    sb.append("    localIdLte: ").append(toIndentedString(localIdLte)).append("\n");
    sb.append("    localIdNot: ").append(toIndentedString(localIdNot)).append("\n");
    sb.append("    localIdNotContains: ").append(toIndentedString(localIdNotContains)).append("\n");
    sb.append("    localIdNotEndsWith: ").append(toIndentedString(localIdNotEndsWith)).append("\n");
    sb.append("    localIdNotIn: ").append(toIndentedString(localIdNotIn)).append("\n");
    sb.append("    localIdNotStartsWith: ").append(toIndentedString(localIdNotStartsWith)).append("\n");
    sb.append("    localIdStartsWith: ").append(toIndentedString(localIdStartsWith)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    messageContains: ").append(toIndentedString(messageContains)).append("\n");
    sb.append("    messageEndsWith: ").append(toIndentedString(messageEndsWith)).append("\n");
    sb.append("    messageGt: ").append(toIndentedString(messageGt)).append("\n");
    sb.append("    messageGte: ").append(toIndentedString(messageGte)).append("\n");
    sb.append("    messageIn: ").append(toIndentedString(messageIn)).append("\n");
    sb.append("    messageLt: ").append(toIndentedString(messageLt)).append("\n");
    sb.append("    messageLte: ").append(toIndentedString(messageLte)).append("\n");
    sb.append("    messageNot: ").append(toIndentedString(messageNot)).append("\n");
    sb.append("    messageNotContains: ").append(toIndentedString(messageNotContains)).append("\n");
    sb.append("    messageNotEndsWith: ").append(toIndentedString(messageNotEndsWith)).append("\n");
    sb.append("    messageNotIn: ").append(toIndentedString(messageNotIn)).append("\n");
    sb.append("    messageNotStartsWith: ").append(toIndentedString(messageNotStartsWith)).append("\n");
    sb.append("    messageStartsWith: ").append(toIndentedString(messageStartsWith)).append("\n");
    sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
    sb.append("    resourceIdContains: ").append(toIndentedString(resourceIdContains)).append("\n");
    sb.append("    resourceIdEndsWith: ").append(toIndentedString(resourceIdEndsWith)).append("\n");
    sb.append("    resourceIdGt: ").append(toIndentedString(resourceIdGt)).append("\n");
    sb.append("    resourceIdGte: ").append(toIndentedString(resourceIdGte)).append("\n");
    sb.append("    resourceIdIn: ").append(toIndentedString(resourceIdIn)).append("\n");
    sb.append("    resourceIdLt: ").append(toIndentedString(resourceIdLt)).append("\n");
    sb.append("    resourceIdLte: ").append(toIndentedString(resourceIdLte)).append("\n");
    sb.append("    resourceIdNot: ").append(toIndentedString(resourceIdNot)).append("\n");
    sb.append("    resourceIdNotContains: ").append(toIndentedString(resourceIdNotContains)).append("\n");
    sb.append("    resourceIdNotEndsWith: ").append(toIndentedString(resourceIdNotEndsWith)).append("\n");
    sb.append("    resourceIdNotIn: ").append(toIndentedString(resourceIdNotIn)).append("\n");
    sb.append("    resourceIdNotStartsWith: ").append(toIndentedString(resourceIdNotStartsWith)).append("\n");
    sb.append("    resourceIdStartsWith: ").append(toIndentedString(resourceIdStartsWith)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusIn: ").append(toIndentedString(statusIn)).append("\n");
    sb.append("    statusNot: ").append(toIndentedString(statusNot)).append("\n");
    sb.append("    statusNotIn: ").append(toIndentedString(statusNotIn)).append("\n");
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

