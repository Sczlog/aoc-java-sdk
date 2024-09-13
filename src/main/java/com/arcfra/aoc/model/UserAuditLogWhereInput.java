package com.arcfra.aoc.model;

import java.util.Objects;
import java.util.Arrays;
import com.arcfra.aoc.model.ClusterWhereInput;
import com.arcfra.aoc.model.UserAuditLogStatus;
import com.arcfra.aoc.model.UserWhereInput;
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
 * UserAuditLogWhereInput
 */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class UserAuditLogWhereInput {
  public static final String SERIALIZED_NAME_A_N_D = "AND";
  @SerializedName(SERIALIZED_NAME_A_N_D)
  private List<UserAuditLogWhereInput> AND = null;

  public static final String SERIALIZED_NAME_N_O_T = "NOT";
  @SerializedName(SERIALIZED_NAME_N_O_T)
  private List<UserAuditLogWhereInput> NOT = null;

  public static final String SERIALIZED_NAME_O_R = "OR";
  @SerializedName(SERIALIZED_NAME_O_R)
  private List<UserAuditLogWhereInput> OR = null;

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

  public static final String SERIALIZED_NAME_AUTH_TYPE = "auth_type";
  @SerializedName(SERIALIZED_NAME_AUTH_TYPE)
  private String authType;

  public static final String SERIALIZED_NAME_AUTH_TYPE_CONTAINS = "auth_type_contains";
  @SerializedName(SERIALIZED_NAME_AUTH_TYPE_CONTAINS)
  private String authTypeContains;

  public static final String SERIALIZED_NAME_AUTH_TYPE_ENDS_WITH = "auth_type_ends_with";
  @SerializedName(SERIALIZED_NAME_AUTH_TYPE_ENDS_WITH)
  private String authTypeEndsWith;

  public static final String SERIALIZED_NAME_AUTH_TYPE_GT = "auth_type_gt";
  @SerializedName(SERIALIZED_NAME_AUTH_TYPE_GT)
  private String authTypeGt;

  public static final String SERIALIZED_NAME_AUTH_TYPE_GTE = "auth_type_gte";
  @SerializedName(SERIALIZED_NAME_AUTH_TYPE_GTE)
  private String authTypeGte;

  public static final String SERIALIZED_NAME_AUTH_TYPE_IN = "auth_type_in";
  @SerializedName(SERIALIZED_NAME_AUTH_TYPE_IN)
  private List<String> authTypeIn = null;

  public static final String SERIALIZED_NAME_AUTH_TYPE_LT = "auth_type_lt";
  @SerializedName(SERIALIZED_NAME_AUTH_TYPE_LT)
  private String authTypeLt;

  public static final String SERIALIZED_NAME_AUTH_TYPE_LTE = "auth_type_lte";
  @SerializedName(SERIALIZED_NAME_AUTH_TYPE_LTE)
  private String authTypeLte;

  public static final String SERIALIZED_NAME_AUTH_TYPE_NOT = "auth_type_not";
  @SerializedName(SERIALIZED_NAME_AUTH_TYPE_NOT)
  private String authTypeNot;

  public static final String SERIALIZED_NAME_AUTH_TYPE_NOT_CONTAINS = "auth_type_not_contains";
  @SerializedName(SERIALIZED_NAME_AUTH_TYPE_NOT_CONTAINS)
  private String authTypeNotContains;

  public static final String SERIALIZED_NAME_AUTH_TYPE_NOT_ENDS_WITH = "auth_type_not_ends_with";
  @SerializedName(SERIALIZED_NAME_AUTH_TYPE_NOT_ENDS_WITH)
  private String authTypeNotEndsWith;

  public static final String SERIALIZED_NAME_AUTH_TYPE_NOT_IN = "auth_type_not_in";
  @SerializedName(SERIALIZED_NAME_AUTH_TYPE_NOT_IN)
  private List<String> authTypeNotIn = null;

  public static final String SERIALIZED_NAME_AUTH_TYPE_NOT_STARTS_WITH = "auth_type_not_starts_with";
  @SerializedName(SERIALIZED_NAME_AUTH_TYPE_NOT_STARTS_WITH)
  private String authTypeNotStartsWith;

  public static final String SERIALIZED_NAME_AUTH_TYPE_STARTS_WITH = "auth_type_starts_with";
  @SerializedName(SERIALIZED_NAME_AUTH_TYPE_STARTS_WITH)
  private String authTypeStartsWith;

  public static final String SERIALIZED_NAME_CLUSTER = "cluster";
  @SerializedName(SERIALIZED_NAME_CLUSTER)
  private ClusterWhereInput cluster;

  public static final String SERIALIZED_NAME_CREATED_AT = "createdAt";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private String createdAt;

  public static final String SERIALIZED_NAME_CREATED_AT_GT = "createdAt_gt";
  @SerializedName(SERIALIZED_NAME_CREATED_AT_GT)
  private String createdAtGt;

  public static final String SERIALIZED_NAME_CREATED_AT_GTE = "createdAt_gte";
  @SerializedName(SERIALIZED_NAME_CREATED_AT_GTE)
  private String createdAtGte;

  public static final String SERIALIZED_NAME_CREATED_AT_IN = "createdAt_in";
  @SerializedName(SERIALIZED_NAME_CREATED_AT_IN)
  private List<String> createdAtIn = null;

  public static final String SERIALIZED_NAME_CREATED_AT_LT = "createdAt_lt";
  @SerializedName(SERIALIZED_NAME_CREATED_AT_LT)
  private String createdAtLt;

  public static final String SERIALIZED_NAME_CREATED_AT_LTE = "createdAt_lte";
  @SerializedName(SERIALIZED_NAME_CREATED_AT_LTE)
  private String createdAtLte;

  public static final String SERIALIZED_NAME_CREATED_AT_NOT = "createdAt_not";
  @SerializedName(SERIALIZED_NAME_CREATED_AT_NOT)
  private String createdAtNot;

  public static final String SERIALIZED_NAME_CREATED_AT_NOT_IN = "createdAt_not_in";
  @SerializedName(SERIALIZED_NAME_CREATED_AT_NOT_IN)
  private List<String> createdAtNotIn = null;

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

  public static final String SERIALIZED_NAME_IP_ADDRESS = "ip_address";
  @SerializedName(SERIALIZED_NAME_IP_ADDRESS)
  private String ipAddress;

  public static final String SERIALIZED_NAME_IP_ADDRESS_CONTAINS = "ip_address_contains";
  @SerializedName(SERIALIZED_NAME_IP_ADDRESS_CONTAINS)
  private String ipAddressContains;

  public static final String SERIALIZED_NAME_IP_ADDRESS_ENDS_WITH = "ip_address_ends_with";
  @SerializedName(SERIALIZED_NAME_IP_ADDRESS_ENDS_WITH)
  private String ipAddressEndsWith;

  public static final String SERIALIZED_NAME_IP_ADDRESS_GT = "ip_address_gt";
  @SerializedName(SERIALIZED_NAME_IP_ADDRESS_GT)
  private String ipAddressGt;

  public static final String SERIALIZED_NAME_IP_ADDRESS_GTE = "ip_address_gte";
  @SerializedName(SERIALIZED_NAME_IP_ADDRESS_GTE)
  private String ipAddressGte;

  public static final String SERIALIZED_NAME_IP_ADDRESS_IN = "ip_address_in";
  @SerializedName(SERIALIZED_NAME_IP_ADDRESS_IN)
  private List<String> ipAddressIn = null;

  public static final String SERIALIZED_NAME_IP_ADDRESS_LT = "ip_address_lt";
  @SerializedName(SERIALIZED_NAME_IP_ADDRESS_LT)
  private String ipAddressLt;

  public static final String SERIALIZED_NAME_IP_ADDRESS_LTE = "ip_address_lte";
  @SerializedName(SERIALIZED_NAME_IP_ADDRESS_LTE)
  private String ipAddressLte;

  public static final String SERIALIZED_NAME_IP_ADDRESS_NOT = "ip_address_not";
  @SerializedName(SERIALIZED_NAME_IP_ADDRESS_NOT)
  private String ipAddressNot;

  public static final String SERIALIZED_NAME_IP_ADDRESS_NOT_CONTAINS = "ip_address_not_contains";
  @SerializedName(SERIALIZED_NAME_IP_ADDRESS_NOT_CONTAINS)
  private String ipAddressNotContains;

  public static final String SERIALIZED_NAME_IP_ADDRESS_NOT_ENDS_WITH = "ip_address_not_ends_with";
  @SerializedName(SERIALIZED_NAME_IP_ADDRESS_NOT_ENDS_WITH)
  private String ipAddressNotEndsWith;

  public static final String SERIALIZED_NAME_IP_ADDRESS_NOT_IN = "ip_address_not_in";
  @SerializedName(SERIALIZED_NAME_IP_ADDRESS_NOT_IN)
  private List<String> ipAddressNotIn = null;

  public static final String SERIALIZED_NAME_IP_ADDRESS_NOT_STARTS_WITH = "ip_address_not_starts_with";
  @SerializedName(SERIALIZED_NAME_IP_ADDRESS_NOT_STARTS_WITH)
  private String ipAddressNotStartsWith;

  public static final String SERIALIZED_NAME_IP_ADDRESS_STARTS_WITH = "ip_address_starts_with";
  @SerializedName(SERIALIZED_NAME_IP_ADDRESS_STARTS_WITH)
  private String ipAddressStartsWith;

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

  public static final String SERIALIZED_NAME_RESOURCE_TYPE = "resource_type";
  @SerializedName(SERIALIZED_NAME_RESOURCE_TYPE)
  private String resourceType;

  public static final String SERIALIZED_NAME_RESOURCE_TYPE_CONTAINS = "resource_type_contains";
  @SerializedName(SERIALIZED_NAME_RESOURCE_TYPE_CONTAINS)
  private String resourceTypeContains;

  public static final String SERIALIZED_NAME_RESOURCE_TYPE_ENDS_WITH = "resource_type_ends_with";
  @SerializedName(SERIALIZED_NAME_RESOURCE_TYPE_ENDS_WITH)
  private String resourceTypeEndsWith;

  public static final String SERIALIZED_NAME_RESOURCE_TYPE_GT = "resource_type_gt";
  @SerializedName(SERIALIZED_NAME_RESOURCE_TYPE_GT)
  private String resourceTypeGt;

  public static final String SERIALIZED_NAME_RESOURCE_TYPE_GTE = "resource_type_gte";
  @SerializedName(SERIALIZED_NAME_RESOURCE_TYPE_GTE)
  private String resourceTypeGte;

  public static final String SERIALIZED_NAME_RESOURCE_TYPE_IN = "resource_type_in";
  @SerializedName(SERIALIZED_NAME_RESOURCE_TYPE_IN)
  private List<String> resourceTypeIn = null;

  public static final String SERIALIZED_NAME_RESOURCE_TYPE_LT = "resource_type_lt";
  @SerializedName(SERIALIZED_NAME_RESOURCE_TYPE_LT)
  private String resourceTypeLt;

  public static final String SERIALIZED_NAME_RESOURCE_TYPE_LTE = "resource_type_lte";
  @SerializedName(SERIALIZED_NAME_RESOURCE_TYPE_LTE)
  private String resourceTypeLte;

  public static final String SERIALIZED_NAME_RESOURCE_TYPE_NOT = "resource_type_not";
  @SerializedName(SERIALIZED_NAME_RESOURCE_TYPE_NOT)
  private String resourceTypeNot;

  public static final String SERIALIZED_NAME_RESOURCE_TYPE_NOT_CONTAINS = "resource_type_not_contains";
  @SerializedName(SERIALIZED_NAME_RESOURCE_TYPE_NOT_CONTAINS)
  private String resourceTypeNotContains;

  public static final String SERIALIZED_NAME_RESOURCE_TYPE_NOT_ENDS_WITH = "resource_type_not_ends_with";
  @SerializedName(SERIALIZED_NAME_RESOURCE_TYPE_NOT_ENDS_WITH)
  private String resourceTypeNotEndsWith;

  public static final String SERIALIZED_NAME_RESOURCE_TYPE_NOT_IN = "resource_type_not_in";
  @SerializedName(SERIALIZED_NAME_RESOURCE_TYPE_NOT_IN)
  private List<String> resourceTypeNotIn = null;

  public static final String SERIALIZED_NAME_RESOURCE_TYPE_NOT_STARTS_WITH = "resource_type_not_starts_with";
  @SerializedName(SERIALIZED_NAME_RESOURCE_TYPE_NOT_STARTS_WITH)
  private String resourceTypeNotStartsWith;

  public static final String SERIALIZED_NAME_RESOURCE_TYPE_STARTS_WITH = "resource_type_starts_with";
  @SerializedName(SERIALIZED_NAME_RESOURCE_TYPE_STARTS_WITH)
  private String resourceTypeStartsWith;

  public static final String SERIALIZED_NAME_STARTED_AT = "started_at";
  @SerializedName(SERIALIZED_NAME_STARTED_AT)
  private String startedAt;

  public static final String SERIALIZED_NAME_STARTED_AT_GT = "started_at_gt";
  @SerializedName(SERIALIZED_NAME_STARTED_AT_GT)
  private String startedAtGt;

  public static final String SERIALIZED_NAME_STARTED_AT_GTE = "started_at_gte";
  @SerializedName(SERIALIZED_NAME_STARTED_AT_GTE)
  private String startedAtGte;

  public static final String SERIALIZED_NAME_STARTED_AT_IN = "started_at_in";
  @SerializedName(SERIALIZED_NAME_STARTED_AT_IN)
  private List<String> startedAtIn = null;

  public static final String SERIALIZED_NAME_STARTED_AT_LT = "started_at_lt";
  @SerializedName(SERIALIZED_NAME_STARTED_AT_LT)
  private String startedAtLt;

  public static final String SERIALIZED_NAME_STARTED_AT_LTE = "started_at_lte";
  @SerializedName(SERIALIZED_NAME_STARTED_AT_LTE)
  private String startedAtLte;

  public static final String SERIALIZED_NAME_STARTED_AT_NOT = "started_at_not";
  @SerializedName(SERIALIZED_NAME_STARTED_AT_NOT)
  private String startedAtNot;

  public static final String SERIALIZED_NAME_STARTED_AT_NOT_IN = "started_at_not_in";
  @SerializedName(SERIALIZED_NAME_STARTED_AT_NOT_IN)
  private List<String> startedAtNotIn = null;

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

  public static final String SERIALIZED_NAME_USER = "user";
  @SerializedName(SERIALIZED_NAME_USER)
  private UserWhereInput user;

  public static final String SERIALIZED_NAME_USERNAME = "username";
  @SerializedName(SERIALIZED_NAME_USERNAME)
  private String username;

  public static final String SERIALIZED_NAME_USERNAME_CONTAINS = "username_contains";
  @SerializedName(SERIALIZED_NAME_USERNAME_CONTAINS)
  private String usernameContains;

  public static final String SERIALIZED_NAME_USERNAME_ENDS_WITH = "username_ends_with";
  @SerializedName(SERIALIZED_NAME_USERNAME_ENDS_WITH)
  private String usernameEndsWith;

  public static final String SERIALIZED_NAME_USERNAME_GT = "username_gt";
  @SerializedName(SERIALIZED_NAME_USERNAME_GT)
  private String usernameGt;

  public static final String SERIALIZED_NAME_USERNAME_GTE = "username_gte";
  @SerializedName(SERIALIZED_NAME_USERNAME_GTE)
  private String usernameGte;

  public static final String SERIALIZED_NAME_USERNAME_IN = "username_in";
  @SerializedName(SERIALIZED_NAME_USERNAME_IN)
  private List<String> usernameIn = null;

  public static final String SERIALIZED_NAME_USERNAME_LT = "username_lt";
  @SerializedName(SERIALIZED_NAME_USERNAME_LT)
  private String usernameLt;

  public static final String SERIALIZED_NAME_USERNAME_LTE = "username_lte";
  @SerializedName(SERIALIZED_NAME_USERNAME_LTE)
  private String usernameLte;

  public static final String SERIALIZED_NAME_USERNAME_NOT = "username_not";
  @SerializedName(SERIALIZED_NAME_USERNAME_NOT)
  private String usernameNot;

  public static final String SERIALIZED_NAME_USERNAME_NOT_CONTAINS = "username_not_contains";
  @SerializedName(SERIALIZED_NAME_USERNAME_NOT_CONTAINS)
  private String usernameNotContains;

  public static final String SERIALIZED_NAME_USERNAME_NOT_ENDS_WITH = "username_not_ends_with";
  @SerializedName(SERIALIZED_NAME_USERNAME_NOT_ENDS_WITH)
  private String usernameNotEndsWith;

  public static final String SERIALIZED_NAME_USERNAME_NOT_IN = "username_not_in";
  @SerializedName(SERIALIZED_NAME_USERNAME_NOT_IN)
  private List<String> usernameNotIn = null;

  public static final String SERIALIZED_NAME_USERNAME_NOT_STARTS_WITH = "username_not_starts_with";
  @SerializedName(SERIALIZED_NAME_USERNAME_NOT_STARTS_WITH)
  private String usernameNotStartsWith;

  public static final String SERIALIZED_NAME_USERNAME_STARTS_WITH = "username_starts_with";
  @SerializedName(SERIALIZED_NAME_USERNAME_STARTS_WITH)
  private String usernameStartsWith;

  public UserAuditLogWhereInput() { 
  }

  public UserAuditLogWhereInput AND(List<UserAuditLogWhereInput> AND) {
    
    this.AND = AND;
    return this;
  }

  public UserAuditLogWhereInput addANDItem(UserAuditLogWhereInput ANDItem) {
    if (this.AND == null) {
      this.AND = new ArrayList<UserAuditLogWhereInput>();
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

  public List<UserAuditLogWhereInput> getAND() {
    return AND;
  }


  public void setAND(List<UserAuditLogWhereInput> AND) {
    this.AND = AND;
  }


  public UserAuditLogWhereInput NOT(List<UserAuditLogWhereInput> NOT) {
    
    this.NOT = NOT;
    return this;
  }

  public UserAuditLogWhereInput addNOTItem(UserAuditLogWhereInput NOTItem) {
    if (this.NOT == null) {
      this.NOT = new ArrayList<UserAuditLogWhereInput>();
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

  public List<UserAuditLogWhereInput> getNOT() {
    return NOT;
  }


  public void setNOT(List<UserAuditLogWhereInput> NOT) {
    this.NOT = NOT;
  }


  public UserAuditLogWhereInput OR(List<UserAuditLogWhereInput> OR) {
    
    this.OR = OR;
    return this;
  }

  public UserAuditLogWhereInput addORItem(UserAuditLogWhereInput ORItem) {
    if (this.OR == null) {
      this.OR = new ArrayList<UserAuditLogWhereInput>();
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

  public List<UserAuditLogWhereInput> getOR() {
    return OR;
  }


  public void setOR(List<UserAuditLogWhereInput> OR) {
    this.OR = OR;
  }


  public UserAuditLogWhereInput action(String action) {
    
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


  public UserAuditLogWhereInput actionContains(String actionContains) {
    
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


  public UserAuditLogWhereInput actionEndsWith(String actionEndsWith) {
    
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


  public UserAuditLogWhereInput actionGt(String actionGt) {
    
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


  public UserAuditLogWhereInput actionGte(String actionGte) {
    
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


  public UserAuditLogWhereInput actionIn(List<String> actionIn) {
    
    this.actionIn = actionIn;
    return this;
  }

  public UserAuditLogWhereInput addActionInItem(String actionInItem) {
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


  public UserAuditLogWhereInput actionLt(String actionLt) {
    
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


  public UserAuditLogWhereInput actionLte(String actionLte) {
    
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


  public UserAuditLogWhereInput actionNot(String actionNot) {
    
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


  public UserAuditLogWhereInput actionNotContains(String actionNotContains) {
    
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


  public UserAuditLogWhereInput actionNotEndsWith(String actionNotEndsWith) {
    
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


  public UserAuditLogWhereInput actionNotIn(List<String> actionNotIn) {
    
    this.actionNotIn = actionNotIn;
    return this;
  }

  public UserAuditLogWhereInput addActionNotInItem(String actionNotInItem) {
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


  public UserAuditLogWhereInput actionNotStartsWith(String actionNotStartsWith) {
    
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


  public UserAuditLogWhereInput actionStartsWith(String actionStartsWith) {
    
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


  public UserAuditLogWhereInput authType(String authType) {
    
    this.authType = authType;
    return this;
  }

   /**
   * Get authType
   * @return authType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAuthType() {
    return authType;
  }


  public void setAuthType(String authType) {
    this.authType = authType;
  }


  public UserAuditLogWhereInput authTypeContains(String authTypeContains) {
    
    this.authTypeContains = authTypeContains;
    return this;
  }

   /**
   * Get authTypeContains
   * @return authTypeContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAuthTypeContains() {
    return authTypeContains;
  }


  public void setAuthTypeContains(String authTypeContains) {
    this.authTypeContains = authTypeContains;
  }


  public UserAuditLogWhereInput authTypeEndsWith(String authTypeEndsWith) {
    
    this.authTypeEndsWith = authTypeEndsWith;
    return this;
  }

   /**
   * Get authTypeEndsWith
   * @return authTypeEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAuthTypeEndsWith() {
    return authTypeEndsWith;
  }


  public void setAuthTypeEndsWith(String authTypeEndsWith) {
    this.authTypeEndsWith = authTypeEndsWith;
  }


  public UserAuditLogWhereInput authTypeGt(String authTypeGt) {
    
    this.authTypeGt = authTypeGt;
    return this;
  }

   /**
   * Get authTypeGt
   * @return authTypeGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAuthTypeGt() {
    return authTypeGt;
  }


  public void setAuthTypeGt(String authTypeGt) {
    this.authTypeGt = authTypeGt;
  }


  public UserAuditLogWhereInput authTypeGte(String authTypeGte) {
    
    this.authTypeGte = authTypeGte;
    return this;
  }

   /**
   * Get authTypeGte
   * @return authTypeGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAuthTypeGte() {
    return authTypeGte;
  }


  public void setAuthTypeGte(String authTypeGte) {
    this.authTypeGte = authTypeGte;
  }


  public UserAuditLogWhereInput authTypeIn(List<String> authTypeIn) {
    
    this.authTypeIn = authTypeIn;
    return this;
  }

  public UserAuditLogWhereInput addAuthTypeInItem(String authTypeInItem) {
    if (this.authTypeIn == null) {
      this.authTypeIn = new ArrayList<String>();
    }
    this.authTypeIn.add(authTypeInItem);
    return this;
  }

   /**
   * Get authTypeIn
   * @return authTypeIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getAuthTypeIn() {
    return authTypeIn;
  }


  public void setAuthTypeIn(List<String> authTypeIn) {
    this.authTypeIn = authTypeIn;
  }


  public UserAuditLogWhereInput authTypeLt(String authTypeLt) {
    
    this.authTypeLt = authTypeLt;
    return this;
  }

   /**
   * Get authTypeLt
   * @return authTypeLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAuthTypeLt() {
    return authTypeLt;
  }


  public void setAuthTypeLt(String authTypeLt) {
    this.authTypeLt = authTypeLt;
  }


  public UserAuditLogWhereInput authTypeLte(String authTypeLte) {
    
    this.authTypeLte = authTypeLte;
    return this;
  }

   /**
   * Get authTypeLte
   * @return authTypeLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAuthTypeLte() {
    return authTypeLte;
  }


  public void setAuthTypeLte(String authTypeLte) {
    this.authTypeLte = authTypeLte;
  }


  public UserAuditLogWhereInput authTypeNot(String authTypeNot) {
    
    this.authTypeNot = authTypeNot;
    return this;
  }

   /**
   * Get authTypeNot
   * @return authTypeNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAuthTypeNot() {
    return authTypeNot;
  }


  public void setAuthTypeNot(String authTypeNot) {
    this.authTypeNot = authTypeNot;
  }


  public UserAuditLogWhereInput authTypeNotContains(String authTypeNotContains) {
    
    this.authTypeNotContains = authTypeNotContains;
    return this;
  }

   /**
   * Get authTypeNotContains
   * @return authTypeNotContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAuthTypeNotContains() {
    return authTypeNotContains;
  }


  public void setAuthTypeNotContains(String authTypeNotContains) {
    this.authTypeNotContains = authTypeNotContains;
  }


  public UserAuditLogWhereInput authTypeNotEndsWith(String authTypeNotEndsWith) {
    
    this.authTypeNotEndsWith = authTypeNotEndsWith;
    return this;
  }

   /**
   * Get authTypeNotEndsWith
   * @return authTypeNotEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAuthTypeNotEndsWith() {
    return authTypeNotEndsWith;
  }


  public void setAuthTypeNotEndsWith(String authTypeNotEndsWith) {
    this.authTypeNotEndsWith = authTypeNotEndsWith;
  }


  public UserAuditLogWhereInput authTypeNotIn(List<String> authTypeNotIn) {
    
    this.authTypeNotIn = authTypeNotIn;
    return this;
  }

  public UserAuditLogWhereInput addAuthTypeNotInItem(String authTypeNotInItem) {
    if (this.authTypeNotIn == null) {
      this.authTypeNotIn = new ArrayList<String>();
    }
    this.authTypeNotIn.add(authTypeNotInItem);
    return this;
  }

   /**
   * Get authTypeNotIn
   * @return authTypeNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getAuthTypeNotIn() {
    return authTypeNotIn;
  }


  public void setAuthTypeNotIn(List<String> authTypeNotIn) {
    this.authTypeNotIn = authTypeNotIn;
  }


  public UserAuditLogWhereInput authTypeNotStartsWith(String authTypeNotStartsWith) {
    
    this.authTypeNotStartsWith = authTypeNotStartsWith;
    return this;
  }

   /**
   * Get authTypeNotStartsWith
   * @return authTypeNotStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAuthTypeNotStartsWith() {
    return authTypeNotStartsWith;
  }


  public void setAuthTypeNotStartsWith(String authTypeNotStartsWith) {
    this.authTypeNotStartsWith = authTypeNotStartsWith;
  }


  public UserAuditLogWhereInput authTypeStartsWith(String authTypeStartsWith) {
    
    this.authTypeStartsWith = authTypeStartsWith;
    return this;
  }

   /**
   * Get authTypeStartsWith
   * @return authTypeStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAuthTypeStartsWith() {
    return authTypeStartsWith;
  }


  public void setAuthTypeStartsWith(String authTypeStartsWith) {
    this.authTypeStartsWith = authTypeStartsWith;
  }


  public UserAuditLogWhereInput cluster(ClusterWhereInput cluster) {
    
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


  public UserAuditLogWhereInput createdAt(String createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }


  public UserAuditLogWhereInput createdAtGt(String createdAtGt) {
    
    this.createdAtGt = createdAtGt;
    return this;
  }

   /**
   * Get createdAtGt
   * @return createdAtGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCreatedAtGt() {
    return createdAtGt;
  }


  public void setCreatedAtGt(String createdAtGt) {
    this.createdAtGt = createdAtGt;
  }


  public UserAuditLogWhereInput createdAtGte(String createdAtGte) {
    
    this.createdAtGte = createdAtGte;
    return this;
  }

   /**
   * Get createdAtGte
   * @return createdAtGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCreatedAtGte() {
    return createdAtGte;
  }


  public void setCreatedAtGte(String createdAtGte) {
    this.createdAtGte = createdAtGte;
  }


  public UserAuditLogWhereInput createdAtIn(List<String> createdAtIn) {
    
    this.createdAtIn = createdAtIn;
    return this;
  }

  public UserAuditLogWhereInput addCreatedAtInItem(String createdAtInItem) {
    if (this.createdAtIn == null) {
      this.createdAtIn = new ArrayList<String>();
    }
    this.createdAtIn.add(createdAtInItem);
    return this;
  }

   /**
   * Get createdAtIn
   * @return createdAtIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getCreatedAtIn() {
    return createdAtIn;
  }


  public void setCreatedAtIn(List<String> createdAtIn) {
    this.createdAtIn = createdAtIn;
  }


  public UserAuditLogWhereInput createdAtLt(String createdAtLt) {
    
    this.createdAtLt = createdAtLt;
    return this;
  }

   /**
   * Get createdAtLt
   * @return createdAtLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCreatedAtLt() {
    return createdAtLt;
  }


  public void setCreatedAtLt(String createdAtLt) {
    this.createdAtLt = createdAtLt;
  }


  public UserAuditLogWhereInput createdAtLte(String createdAtLte) {
    
    this.createdAtLte = createdAtLte;
    return this;
  }

   /**
   * Get createdAtLte
   * @return createdAtLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCreatedAtLte() {
    return createdAtLte;
  }


  public void setCreatedAtLte(String createdAtLte) {
    this.createdAtLte = createdAtLte;
  }


  public UserAuditLogWhereInput createdAtNot(String createdAtNot) {
    
    this.createdAtNot = createdAtNot;
    return this;
  }

   /**
   * Get createdAtNot
   * @return createdAtNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCreatedAtNot() {
    return createdAtNot;
  }


  public void setCreatedAtNot(String createdAtNot) {
    this.createdAtNot = createdAtNot;
  }


  public UserAuditLogWhereInput createdAtNotIn(List<String> createdAtNotIn) {
    
    this.createdAtNotIn = createdAtNotIn;
    return this;
  }

  public UserAuditLogWhereInput addCreatedAtNotInItem(String createdAtNotInItem) {
    if (this.createdAtNotIn == null) {
      this.createdAtNotIn = new ArrayList<String>();
    }
    this.createdAtNotIn.add(createdAtNotInItem);
    return this;
  }

   /**
   * Get createdAtNotIn
   * @return createdAtNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getCreatedAtNotIn() {
    return createdAtNotIn;
  }


  public void setCreatedAtNotIn(List<String> createdAtNotIn) {
    this.createdAtNotIn = createdAtNotIn;
  }


  public UserAuditLogWhereInput finishedAt(String finishedAt) {
    
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


  public UserAuditLogWhereInput finishedAtGt(String finishedAtGt) {
    
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


  public UserAuditLogWhereInput finishedAtGte(String finishedAtGte) {
    
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


  public UserAuditLogWhereInput finishedAtIn(List<String> finishedAtIn) {
    
    this.finishedAtIn = finishedAtIn;
    return this;
  }

  public UserAuditLogWhereInput addFinishedAtInItem(String finishedAtInItem) {
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


  public UserAuditLogWhereInput finishedAtLt(String finishedAtLt) {
    
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


  public UserAuditLogWhereInput finishedAtLte(String finishedAtLte) {
    
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


  public UserAuditLogWhereInput finishedAtNot(String finishedAtNot) {
    
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


  public UserAuditLogWhereInput finishedAtNotIn(List<String> finishedAtNotIn) {
    
    this.finishedAtNotIn = finishedAtNotIn;
    return this;
  }

  public UserAuditLogWhereInput addFinishedAtNotInItem(String finishedAtNotInItem) {
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


  public UserAuditLogWhereInput id(String id) {
    
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


  public UserAuditLogWhereInput idContains(String idContains) {
    
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


  public UserAuditLogWhereInput idEndsWith(String idEndsWith) {
    
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


  public UserAuditLogWhereInput idGt(String idGt) {
    
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


  public UserAuditLogWhereInput idGte(String idGte) {
    
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


  public UserAuditLogWhereInput idIn(List<String> idIn) {
    
    this.idIn = idIn;
    return this;
  }

  public UserAuditLogWhereInput addIdInItem(String idInItem) {
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


  public UserAuditLogWhereInput idLt(String idLt) {
    
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


  public UserAuditLogWhereInput idLte(String idLte) {
    
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


  public UserAuditLogWhereInput idNot(String idNot) {
    
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


  public UserAuditLogWhereInput idNotContains(String idNotContains) {
    
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


  public UserAuditLogWhereInput idNotEndsWith(String idNotEndsWith) {
    
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


  public UserAuditLogWhereInput idNotIn(List<String> idNotIn) {
    
    this.idNotIn = idNotIn;
    return this;
  }

  public UserAuditLogWhereInput addIdNotInItem(String idNotInItem) {
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


  public UserAuditLogWhereInput idNotStartsWith(String idNotStartsWith) {
    
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


  public UserAuditLogWhereInput idStartsWith(String idStartsWith) {
    
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


  public UserAuditLogWhereInput ipAddress(String ipAddress) {
    
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


  public UserAuditLogWhereInput ipAddressContains(String ipAddressContains) {
    
    this.ipAddressContains = ipAddressContains;
    return this;
  }

   /**
   * Get ipAddressContains
   * @return ipAddressContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIpAddressContains() {
    return ipAddressContains;
  }


  public void setIpAddressContains(String ipAddressContains) {
    this.ipAddressContains = ipAddressContains;
  }


  public UserAuditLogWhereInput ipAddressEndsWith(String ipAddressEndsWith) {
    
    this.ipAddressEndsWith = ipAddressEndsWith;
    return this;
  }

   /**
   * Get ipAddressEndsWith
   * @return ipAddressEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIpAddressEndsWith() {
    return ipAddressEndsWith;
  }


  public void setIpAddressEndsWith(String ipAddressEndsWith) {
    this.ipAddressEndsWith = ipAddressEndsWith;
  }


  public UserAuditLogWhereInput ipAddressGt(String ipAddressGt) {
    
    this.ipAddressGt = ipAddressGt;
    return this;
  }

   /**
   * Get ipAddressGt
   * @return ipAddressGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIpAddressGt() {
    return ipAddressGt;
  }


  public void setIpAddressGt(String ipAddressGt) {
    this.ipAddressGt = ipAddressGt;
  }


  public UserAuditLogWhereInput ipAddressGte(String ipAddressGte) {
    
    this.ipAddressGte = ipAddressGte;
    return this;
  }

   /**
   * Get ipAddressGte
   * @return ipAddressGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIpAddressGte() {
    return ipAddressGte;
  }


  public void setIpAddressGte(String ipAddressGte) {
    this.ipAddressGte = ipAddressGte;
  }


  public UserAuditLogWhereInput ipAddressIn(List<String> ipAddressIn) {
    
    this.ipAddressIn = ipAddressIn;
    return this;
  }

  public UserAuditLogWhereInput addIpAddressInItem(String ipAddressInItem) {
    if (this.ipAddressIn == null) {
      this.ipAddressIn = new ArrayList<String>();
    }
    this.ipAddressIn.add(ipAddressInItem);
    return this;
  }

   /**
   * Get ipAddressIn
   * @return ipAddressIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getIpAddressIn() {
    return ipAddressIn;
  }


  public void setIpAddressIn(List<String> ipAddressIn) {
    this.ipAddressIn = ipAddressIn;
  }


  public UserAuditLogWhereInput ipAddressLt(String ipAddressLt) {
    
    this.ipAddressLt = ipAddressLt;
    return this;
  }

   /**
   * Get ipAddressLt
   * @return ipAddressLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIpAddressLt() {
    return ipAddressLt;
  }


  public void setIpAddressLt(String ipAddressLt) {
    this.ipAddressLt = ipAddressLt;
  }


  public UserAuditLogWhereInput ipAddressLte(String ipAddressLte) {
    
    this.ipAddressLte = ipAddressLte;
    return this;
  }

   /**
   * Get ipAddressLte
   * @return ipAddressLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIpAddressLte() {
    return ipAddressLte;
  }


  public void setIpAddressLte(String ipAddressLte) {
    this.ipAddressLte = ipAddressLte;
  }


  public UserAuditLogWhereInput ipAddressNot(String ipAddressNot) {
    
    this.ipAddressNot = ipAddressNot;
    return this;
  }

   /**
   * Get ipAddressNot
   * @return ipAddressNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIpAddressNot() {
    return ipAddressNot;
  }


  public void setIpAddressNot(String ipAddressNot) {
    this.ipAddressNot = ipAddressNot;
  }


  public UserAuditLogWhereInput ipAddressNotContains(String ipAddressNotContains) {
    
    this.ipAddressNotContains = ipAddressNotContains;
    return this;
  }

   /**
   * Get ipAddressNotContains
   * @return ipAddressNotContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIpAddressNotContains() {
    return ipAddressNotContains;
  }


  public void setIpAddressNotContains(String ipAddressNotContains) {
    this.ipAddressNotContains = ipAddressNotContains;
  }


  public UserAuditLogWhereInput ipAddressNotEndsWith(String ipAddressNotEndsWith) {
    
    this.ipAddressNotEndsWith = ipAddressNotEndsWith;
    return this;
  }

   /**
   * Get ipAddressNotEndsWith
   * @return ipAddressNotEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIpAddressNotEndsWith() {
    return ipAddressNotEndsWith;
  }


  public void setIpAddressNotEndsWith(String ipAddressNotEndsWith) {
    this.ipAddressNotEndsWith = ipAddressNotEndsWith;
  }


  public UserAuditLogWhereInput ipAddressNotIn(List<String> ipAddressNotIn) {
    
    this.ipAddressNotIn = ipAddressNotIn;
    return this;
  }

  public UserAuditLogWhereInput addIpAddressNotInItem(String ipAddressNotInItem) {
    if (this.ipAddressNotIn == null) {
      this.ipAddressNotIn = new ArrayList<String>();
    }
    this.ipAddressNotIn.add(ipAddressNotInItem);
    return this;
  }

   /**
   * Get ipAddressNotIn
   * @return ipAddressNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getIpAddressNotIn() {
    return ipAddressNotIn;
  }


  public void setIpAddressNotIn(List<String> ipAddressNotIn) {
    this.ipAddressNotIn = ipAddressNotIn;
  }


  public UserAuditLogWhereInput ipAddressNotStartsWith(String ipAddressNotStartsWith) {
    
    this.ipAddressNotStartsWith = ipAddressNotStartsWith;
    return this;
  }

   /**
   * Get ipAddressNotStartsWith
   * @return ipAddressNotStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIpAddressNotStartsWith() {
    return ipAddressNotStartsWith;
  }


  public void setIpAddressNotStartsWith(String ipAddressNotStartsWith) {
    this.ipAddressNotStartsWith = ipAddressNotStartsWith;
  }


  public UserAuditLogWhereInput ipAddressStartsWith(String ipAddressStartsWith) {
    
    this.ipAddressStartsWith = ipAddressStartsWith;
    return this;
  }

   /**
   * Get ipAddressStartsWith
   * @return ipAddressStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIpAddressStartsWith() {
    return ipAddressStartsWith;
  }


  public void setIpAddressStartsWith(String ipAddressStartsWith) {
    this.ipAddressStartsWith = ipAddressStartsWith;
  }


  public UserAuditLogWhereInput message(String message) {
    
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


  public UserAuditLogWhereInput messageContains(String messageContains) {
    
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


  public UserAuditLogWhereInput messageEndsWith(String messageEndsWith) {
    
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


  public UserAuditLogWhereInput messageGt(String messageGt) {
    
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


  public UserAuditLogWhereInput messageGte(String messageGte) {
    
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


  public UserAuditLogWhereInput messageIn(List<String> messageIn) {
    
    this.messageIn = messageIn;
    return this;
  }

  public UserAuditLogWhereInput addMessageInItem(String messageInItem) {
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


  public UserAuditLogWhereInput messageLt(String messageLt) {
    
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


  public UserAuditLogWhereInput messageLte(String messageLte) {
    
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


  public UserAuditLogWhereInput messageNot(String messageNot) {
    
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


  public UserAuditLogWhereInput messageNotContains(String messageNotContains) {
    
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


  public UserAuditLogWhereInput messageNotEndsWith(String messageNotEndsWith) {
    
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


  public UserAuditLogWhereInput messageNotIn(List<String> messageNotIn) {
    
    this.messageNotIn = messageNotIn;
    return this;
  }

  public UserAuditLogWhereInput addMessageNotInItem(String messageNotInItem) {
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


  public UserAuditLogWhereInput messageNotStartsWith(String messageNotStartsWith) {
    
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


  public UserAuditLogWhereInput messageStartsWith(String messageStartsWith) {
    
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


  public UserAuditLogWhereInput resourceId(String resourceId) {
    
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


  public UserAuditLogWhereInput resourceIdContains(String resourceIdContains) {
    
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


  public UserAuditLogWhereInput resourceIdEndsWith(String resourceIdEndsWith) {
    
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


  public UserAuditLogWhereInput resourceIdGt(String resourceIdGt) {
    
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


  public UserAuditLogWhereInput resourceIdGte(String resourceIdGte) {
    
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


  public UserAuditLogWhereInput resourceIdIn(List<String> resourceIdIn) {
    
    this.resourceIdIn = resourceIdIn;
    return this;
  }

  public UserAuditLogWhereInput addResourceIdInItem(String resourceIdInItem) {
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


  public UserAuditLogWhereInput resourceIdLt(String resourceIdLt) {
    
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


  public UserAuditLogWhereInput resourceIdLte(String resourceIdLte) {
    
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


  public UserAuditLogWhereInput resourceIdNot(String resourceIdNot) {
    
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


  public UserAuditLogWhereInput resourceIdNotContains(String resourceIdNotContains) {
    
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


  public UserAuditLogWhereInput resourceIdNotEndsWith(String resourceIdNotEndsWith) {
    
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


  public UserAuditLogWhereInput resourceIdNotIn(List<String> resourceIdNotIn) {
    
    this.resourceIdNotIn = resourceIdNotIn;
    return this;
  }

  public UserAuditLogWhereInput addResourceIdNotInItem(String resourceIdNotInItem) {
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


  public UserAuditLogWhereInput resourceIdNotStartsWith(String resourceIdNotStartsWith) {
    
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


  public UserAuditLogWhereInput resourceIdStartsWith(String resourceIdStartsWith) {
    
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


  public UserAuditLogWhereInput resourceType(String resourceType) {
    
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


  public UserAuditLogWhereInput resourceTypeContains(String resourceTypeContains) {
    
    this.resourceTypeContains = resourceTypeContains;
    return this;
  }

   /**
   * Get resourceTypeContains
   * @return resourceTypeContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getResourceTypeContains() {
    return resourceTypeContains;
  }


  public void setResourceTypeContains(String resourceTypeContains) {
    this.resourceTypeContains = resourceTypeContains;
  }


  public UserAuditLogWhereInput resourceTypeEndsWith(String resourceTypeEndsWith) {
    
    this.resourceTypeEndsWith = resourceTypeEndsWith;
    return this;
  }

   /**
   * Get resourceTypeEndsWith
   * @return resourceTypeEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getResourceTypeEndsWith() {
    return resourceTypeEndsWith;
  }


  public void setResourceTypeEndsWith(String resourceTypeEndsWith) {
    this.resourceTypeEndsWith = resourceTypeEndsWith;
  }


  public UserAuditLogWhereInput resourceTypeGt(String resourceTypeGt) {
    
    this.resourceTypeGt = resourceTypeGt;
    return this;
  }

   /**
   * Get resourceTypeGt
   * @return resourceTypeGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getResourceTypeGt() {
    return resourceTypeGt;
  }


  public void setResourceTypeGt(String resourceTypeGt) {
    this.resourceTypeGt = resourceTypeGt;
  }


  public UserAuditLogWhereInput resourceTypeGte(String resourceTypeGte) {
    
    this.resourceTypeGte = resourceTypeGte;
    return this;
  }

   /**
   * Get resourceTypeGte
   * @return resourceTypeGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getResourceTypeGte() {
    return resourceTypeGte;
  }


  public void setResourceTypeGte(String resourceTypeGte) {
    this.resourceTypeGte = resourceTypeGte;
  }


  public UserAuditLogWhereInput resourceTypeIn(List<String> resourceTypeIn) {
    
    this.resourceTypeIn = resourceTypeIn;
    return this;
  }

  public UserAuditLogWhereInput addResourceTypeInItem(String resourceTypeInItem) {
    if (this.resourceTypeIn == null) {
      this.resourceTypeIn = new ArrayList<String>();
    }
    this.resourceTypeIn.add(resourceTypeInItem);
    return this;
  }

   /**
   * Get resourceTypeIn
   * @return resourceTypeIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getResourceTypeIn() {
    return resourceTypeIn;
  }


  public void setResourceTypeIn(List<String> resourceTypeIn) {
    this.resourceTypeIn = resourceTypeIn;
  }


  public UserAuditLogWhereInput resourceTypeLt(String resourceTypeLt) {
    
    this.resourceTypeLt = resourceTypeLt;
    return this;
  }

   /**
   * Get resourceTypeLt
   * @return resourceTypeLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getResourceTypeLt() {
    return resourceTypeLt;
  }


  public void setResourceTypeLt(String resourceTypeLt) {
    this.resourceTypeLt = resourceTypeLt;
  }


  public UserAuditLogWhereInput resourceTypeLte(String resourceTypeLte) {
    
    this.resourceTypeLte = resourceTypeLte;
    return this;
  }

   /**
   * Get resourceTypeLte
   * @return resourceTypeLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getResourceTypeLte() {
    return resourceTypeLte;
  }


  public void setResourceTypeLte(String resourceTypeLte) {
    this.resourceTypeLte = resourceTypeLte;
  }


  public UserAuditLogWhereInput resourceTypeNot(String resourceTypeNot) {
    
    this.resourceTypeNot = resourceTypeNot;
    return this;
  }

   /**
   * Get resourceTypeNot
   * @return resourceTypeNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getResourceTypeNot() {
    return resourceTypeNot;
  }


  public void setResourceTypeNot(String resourceTypeNot) {
    this.resourceTypeNot = resourceTypeNot;
  }


  public UserAuditLogWhereInput resourceTypeNotContains(String resourceTypeNotContains) {
    
    this.resourceTypeNotContains = resourceTypeNotContains;
    return this;
  }

   /**
   * Get resourceTypeNotContains
   * @return resourceTypeNotContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getResourceTypeNotContains() {
    return resourceTypeNotContains;
  }


  public void setResourceTypeNotContains(String resourceTypeNotContains) {
    this.resourceTypeNotContains = resourceTypeNotContains;
  }


  public UserAuditLogWhereInput resourceTypeNotEndsWith(String resourceTypeNotEndsWith) {
    
    this.resourceTypeNotEndsWith = resourceTypeNotEndsWith;
    return this;
  }

   /**
   * Get resourceTypeNotEndsWith
   * @return resourceTypeNotEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getResourceTypeNotEndsWith() {
    return resourceTypeNotEndsWith;
  }


  public void setResourceTypeNotEndsWith(String resourceTypeNotEndsWith) {
    this.resourceTypeNotEndsWith = resourceTypeNotEndsWith;
  }


  public UserAuditLogWhereInput resourceTypeNotIn(List<String> resourceTypeNotIn) {
    
    this.resourceTypeNotIn = resourceTypeNotIn;
    return this;
  }

  public UserAuditLogWhereInput addResourceTypeNotInItem(String resourceTypeNotInItem) {
    if (this.resourceTypeNotIn == null) {
      this.resourceTypeNotIn = new ArrayList<String>();
    }
    this.resourceTypeNotIn.add(resourceTypeNotInItem);
    return this;
  }

   /**
   * Get resourceTypeNotIn
   * @return resourceTypeNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getResourceTypeNotIn() {
    return resourceTypeNotIn;
  }


  public void setResourceTypeNotIn(List<String> resourceTypeNotIn) {
    this.resourceTypeNotIn = resourceTypeNotIn;
  }


  public UserAuditLogWhereInput resourceTypeNotStartsWith(String resourceTypeNotStartsWith) {
    
    this.resourceTypeNotStartsWith = resourceTypeNotStartsWith;
    return this;
  }

   /**
   * Get resourceTypeNotStartsWith
   * @return resourceTypeNotStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getResourceTypeNotStartsWith() {
    return resourceTypeNotStartsWith;
  }


  public void setResourceTypeNotStartsWith(String resourceTypeNotStartsWith) {
    this.resourceTypeNotStartsWith = resourceTypeNotStartsWith;
  }


  public UserAuditLogWhereInput resourceTypeStartsWith(String resourceTypeStartsWith) {
    
    this.resourceTypeStartsWith = resourceTypeStartsWith;
    return this;
  }

   /**
   * Get resourceTypeStartsWith
   * @return resourceTypeStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getResourceTypeStartsWith() {
    return resourceTypeStartsWith;
  }


  public void setResourceTypeStartsWith(String resourceTypeStartsWith) {
    this.resourceTypeStartsWith = resourceTypeStartsWith;
  }


  public UserAuditLogWhereInput startedAt(String startedAt) {
    
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


  public UserAuditLogWhereInput startedAtGt(String startedAtGt) {
    
    this.startedAtGt = startedAtGt;
    return this;
  }

   /**
   * Get startedAtGt
   * @return startedAtGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getStartedAtGt() {
    return startedAtGt;
  }


  public void setStartedAtGt(String startedAtGt) {
    this.startedAtGt = startedAtGt;
  }


  public UserAuditLogWhereInput startedAtGte(String startedAtGte) {
    
    this.startedAtGte = startedAtGte;
    return this;
  }

   /**
   * Get startedAtGte
   * @return startedAtGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getStartedAtGte() {
    return startedAtGte;
  }


  public void setStartedAtGte(String startedAtGte) {
    this.startedAtGte = startedAtGte;
  }


  public UserAuditLogWhereInput startedAtIn(List<String> startedAtIn) {
    
    this.startedAtIn = startedAtIn;
    return this;
  }

  public UserAuditLogWhereInput addStartedAtInItem(String startedAtInItem) {
    if (this.startedAtIn == null) {
      this.startedAtIn = new ArrayList<String>();
    }
    this.startedAtIn.add(startedAtInItem);
    return this;
  }

   /**
   * Get startedAtIn
   * @return startedAtIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getStartedAtIn() {
    return startedAtIn;
  }


  public void setStartedAtIn(List<String> startedAtIn) {
    this.startedAtIn = startedAtIn;
  }


  public UserAuditLogWhereInput startedAtLt(String startedAtLt) {
    
    this.startedAtLt = startedAtLt;
    return this;
  }

   /**
   * Get startedAtLt
   * @return startedAtLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getStartedAtLt() {
    return startedAtLt;
  }


  public void setStartedAtLt(String startedAtLt) {
    this.startedAtLt = startedAtLt;
  }


  public UserAuditLogWhereInput startedAtLte(String startedAtLte) {
    
    this.startedAtLte = startedAtLte;
    return this;
  }

   /**
   * Get startedAtLte
   * @return startedAtLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getStartedAtLte() {
    return startedAtLte;
  }


  public void setStartedAtLte(String startedAtLte) {
    this.startedAtLte = startedAtLte;
  }


  public UserAuditLogWhereInput startedAtNot(String startedAtNot) {
    
    this.startedAtNot = startedAtNot;
    return this;
  }

   /**
   * Get startedAtNot
   * @return startedAtNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getStartedAtNot() {
    return startedAtNot;
  }


  public void setStartedAtNot(String startedAtNot) {
    this.startedAtNot = startedAtNot;
  }


  public UserAuditLogWhereInput startedAtNotIn(List<String> startedAtNotIn) {
    
    this.startedAtNotIn = startedAtNotIn;
    return this;
  }

  public UserAuditLogWhereInput addStartedAtNotInItem(String startedAtNotInItem) {
    if (this.startedAtNotIn == null) {
      this.startedAtNotIn = new ArrayList<String>();
    }
    this.startedAtNotIn.add(startedAtNotInItem);
    return this;
  }

   /**
   * Get startedAtNotIn
   * @return startedAtNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getStartedAtNotIn() {
    return startedAtNotIn;
  }


  public void setStartedAtNotIn(List<String> startedAtNotIn) {
    this.startedAtNotIn = startedAtNotIn;
  }


  public UserAuditLogWhereInput status(UserAuditLogStatus status) {
    
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


  public UserAuditLogWhereInput statusIn(List<UserAuditLogStatus> statusIn) {
    
    this.statusIn = statusIn;
    return this;
  }

  public UserAuditLogWhereInput addStatusInItem(UserAuditLogStatus statusInItem) {
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


  public UserAuditLogWhereInput statusNot(UserAuditLogStatus statusNot) {
    
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


  public UserAuditLogWhereInput statusNotIn(List<UserAuditLogStatus> statusNotIn) {
    
    this.statusNotIn = statusNotIn;
    return this;
  }

  public UserAuditLogWhereInput addStatusNotInItem(UserAuditLogStatus statusNotInItem) {
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


  public UserAuditLogWhereInput user(UserWhereInput user) {
    
    this.user = user;
    return this;
  }

   /**
   * Get user
   * @return user
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UserWhereInput getUser() {
    return user;
  }


  public void setUser(UserWhereInput user) {
    this.user = user;
  }


  public UserAuditLogWhereInput username(String username) {
    
    this.username = username;
    return this;
  }

   /**
   * Get username
   * @return username
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUsername() {
    return username;
  }


  public void setUsername(String username) {
    this.username = username;
  }


  public UserAuditLogWhereInput usernameContains(String usernameContains) {
    
    this.usernameContains = usernameContains;
    return this;
  }

   /**
   * Get usernameContains
   * @return usernameContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUsernameContains() {
    return usernameContains;
  }


  public void setUsernameContains(String usernameContains) {
    this.usernameContains = usernameContains;
  }


  public UserAuditLogWhereInput usernameEndsWith(String usernameEndsWith) {
    
    this.usernameEndsWith = usernameEndsWith;
    return this;
  }

   /**
   * Get usernameEndsWith
   * @return usernameEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUsernameEndsWith() {
    return usernameEndsWith;
  }


  public void setUsernameEndsWith(String usernameEndsWith) {
    this.usernameEndsWith = usernameEndsWith;
  }


  public UserAuditLogWhereInput usernameGt(String usernameGt) {
    
    this.usernameGt = usernameGt;
    return this;
  }

   /**
   * Get usernameGt
   * @return usernameGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUsernameGt() {
    return usernameGt;
  }


  public void setUsernameGt(String usernameGt) {
    this.usernameGt = usernameGt;
  }


  public UserAuditLogWhereInput usernameGte(String usernameGte) {
    
    this.usernameGte = usernameGte;
    return this;
  }

   /**
   * Get usernameGte
   * @return usernameGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUsernameGte() {
    return usernameGte;
  }


  public void setUsernameGte(String usernameGte) {
    this.usernameGte = usernameGte;
  }


  public UserAuditLogWhereInput usernameIn(List<String> usernameIn) {
    
    this.usernameIn = usernameIn;
    return this;
  }

  public UserAuditLogWhereInput addUsernameInItem(String usernameInItem) {
    if (this.usernameIn == null) {
      this.usernameIn = new ArrayList<String>();
    }
    this.usernameIn.add(usernameInItem);
    return this;
  }

   /**
   * Get usernameIn
   * @return usernameIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getUsernameIn() {
    return usernameIn;
  }


  public void setUsernameIn(List<String> usernameIn) {
    this.usernameIn = usernameIn;
  }


  public UserAuditLogWhereInput usernameLt(String usernameLt) {
    
    this.usernameLt = usernameLt;
    return this;
  }

   /**
   * Get usernameLt
   * @return usernameLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUsernameLt() {
    return usernameLt;
  }


  public void setUsernameLt(String usernameLt) {
    this.usernameLt = usernameLt;
  }


  public UserAuditLogWhereInput usernameLte(String usernameLte) {
    
    this.usernameLte = usernameLte;
    return this;
  }

   /**
   * Get usernameLte
   * @return usernameLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUsernameLte() {
    return usernameLte;
  }


  public void setUsernameLte(String usernameLte) {
    this.usernameLte = usernameLte;
  }


  public UserAuditLogWhereInput usernameNot(String usernameNot) {
    
    this.usernameNot = usernameNot;
    return this;
  }

   /**
   * Get usernameNot
   * @return usernameNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUsernameNot() {
    return usernameNot;
  }


  public void setUsernameNot(String usernameNot) {
    this.usernameNot = usernameNot;
  }


  public UserAuditLogWhereInput usernameNotContains(String usernameNotContains) {
    
    this.usernameNotContains = usernameNotContains;
    return this;
  }

   /**
   * Get usernameNotContains
   * @return usernameNotContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUsernameNotContains() {
    return usernameNotContains;
  }


  public void setUsernameNotContains(String usernameNotContains) {
    this.usernameNotContains = usernameNotContains;
  }


  public UserAuditLogWhereInput usernameNotEndsWith(String usernameNotEndsWith) {
    
    this.usernameNotEndsWith = usernameNotEndsWith;
    return this;
  }

   /**
   * Get usernameNotEndsWith
   * @return usernameNotEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUsernameNotEndsWith() {
    return usernameNotEndsWith;
  }


  public void setUsernameNotEndsWith(String usernameNotEndsWith) {
    this.usernameNotEndsWith = usernameNotEndsWith;
  }


  public UserAuditLogWhereInput usernameNotIn(List<String> usernameNotIn) {
    
    this.usernameNotIn = usernameNotIn;
    return this;
  }

  public UserAuditLogWhereInput addUsernameNotInItem(String usernameNotInItem) {
    if (this.usernameNotIn == null) {
      this.usernameNotIn = new ArrayList<String>();
    }
    this.usernameNotIn.add(usernameNotInItem);
    return this;
  }

   /**
   * Get usernameNotIn
   * @return usernameNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getUsernameNotIn() {
    return usernameNotIn;
  }


  public void setUsernameNotIn(List<String> usernameNotIn) {
    this.usernameNotIn = usernameNotIn;
  }


  public UserAuditLogWhereInput usernameNotStartsWith(String usernameNotStartsWith) {
    
    this.usernameNotStartsWith = usernameNotStartsWith;
    return this;
  }

   /**
   * Get usernameNotStartsWith
   * @return usernameNotStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUsernameNotStartsWith() {
    return usernameNotStartsWith;
  }


  public void setUsernameNotStartsWith(String usernameNotStartsWith) {
    this.usernameNotStartsWith = usernameNotStartsWith;
  }


  public UserAuditLogWhereInput usernameStartsWith(String usernameStartsWith) {
    
    this.usernameStartsWith = usernameStartsWith;
    return this;
  }

   /**
   * Get usernameStartsWith
   * @return usernameStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUsernameStartsWith() {
    return usernameStartsWith;
  }


  public void setUsernameStartsWith(String usernameStartsWith) {
    this.usernameStartsWith = usernameStartsWith;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserAuditLogWhereInput userAuditLogWhereInput = (UserAuditLogWhereInput) o;
    return Objects.equals(this.AND, userAuditLogWhereInput.AND) &&
        Objects.equals(this.NOT, userAuditLogWhereInput.NOT) &&
        Objects.equals(this.OR, userAuditLogWhereInput.OR) &&
        Objects.equals(this.action, userAuditLogWhereInput.action) &&
        Objects.equals(this.actionContains, userAuditLogWhereInput.actionContains) &&
        Objects.equals(this.actionEndsWith, userAuditLogWhereInput.actionEndsWith) &&
        Objects.equals(this.actionGt, userAuditLogWhereInput.actionGt) &&
        Objects.equals(this.actionGte, userAuditLogWhereInput.actionGte) &&
        Objects.equals(this.actionIn, userAuditLogWhereInput.actionIn) &&
        Objects.equals(this.actionLt, userAuditLogWhereInput.actionLt) &&
        Objects.equals(this.actionLte, userAuditLogWhereInput.actionLte) &&
        Objects.equals(this.actionNot, userAuditLogWhereInput.actionNot) &&
        Objects.equals(this.actionNotContains, userAuditLogWhereInput.actionNotContains) &&
        Objects.equals(this.actionNotEndsWith, userAuditLogWhereInput.actionNotEndsWith) &&
        Objects.equals(this.actionNotIn, userAuditLogWhereInput.actionNotIn) &&
        Objects.equals(this.actionNotStartsWith, userAuditLogWhereInput.actionNotStartsWith) &&
        Objects.equals(this.actionStartsWith, userAuditLogWhereInput.actionStartsWith) &&
        Objects.equals(this.authType, userAuditLogWhereInput.authType) &&
        Objects.equals(this.authTypeContains, userAuditLogWhereInput.authTypeContains) &&
        Objects.equals(this.authTypeEndsWith, userAuditLogWhereInput.authTypeEndsWith) &&
        Objects.equals(this.authTypeGt, userAuditLogWhereInput.authTypeGt) &&
        Objects.equals(this.authTypeGte, userAuditLogWhereInput.authTypeGte) &&
        Objects.equals(this.authTypeIn, userAuditLogWhereInput.authTypeIn) &&
        Objects.equals(this.authTypeLt, userAuditLogWhereInput.authTypeLt) &&
        Objects.equals(this.authTypeLte, userAuditLogWhereInput.authTypeLte) &&
        Objects.equals(this.authTypeNot, userAuditLogWhereInput.authTypeNot) &&
        Objects.equals(this.authTypeNotContains, userAuditLogWhereInput.authTypeNotContains) &&
        Objects.equals(this.authTypeNotEndsWith, userAuditLogWhereInput.authTypeNotEndsWith) &&
        Objects.equals(this.authTypeNotIn, userAuditLogWhereInput.authTypeNotIn) &&
        Objects.equals(this.authTypeNotStartsWith, userAuditLogWhereInput.authTypeNotStartsWith) &&
        Objects.equals(this.authTypeStartsWith, userAuditLogWhereInput.authTypeStartsWith) &&
        Objects.equals(this.cluster, userAuditLogWhereInput.cluster) &&
        Objects.equals(this.createdAt, userAuditLogWhereInput.createdAt) &&
        Objects.equals(this.createdAtGt, userAuditLogWhereInput.createdAtGt) &&
        Objects.equals(this.createdAtGte, userAuditLogWhereInput.createdAtGte) &&
        Objects.equals(this.createdAtIn, userAuditLogWhereInput.createdAtIn) &&
        Objects.equals(this.createdAtLt, userAuditLogWhereInput.createdAtLt) &&
        Objects.equals(this.createdAtLte, userAuditLogWhereInput.createdAtLte) &&
        Objects.equals(this.createdAtNot, userAuditLogWhereInput.createdAtNot) &&
        Objects.equals(this.createdAtNotIn, userAuditLogWhereInput.createdAtNotIn) &&
        Objects.equals(this.finishedAt, userAuditLogWhereInput.finishedAt) &&
        Objects.equals(this.finishedAtGt, userAuditLogWhereInput.finishedAtGt) &&
        Objects.equals(this.finishedAtGte, userAuditLogWhereInput.finishedAtGte) &&
        Objects.equals(this.finishedAtIn, userAuditLogWhereInput.finishedAtIn) &&
        Objects.equals(this.finishedAtLt, userAuditLogWhereInput.finishedAtLt) &&
        Objects.equals(this.finishedAtLte, userAuditLogWhereInput.finishedAtLte) &&
        Objects.equals(this.finishedAtNot, userAuditLogWhereInput.finishedAtNot) &&
        Objects.equals(this.finishedAtNotIn, userAuditLogWhereInput.finishedAtNotIn) &&
        Objects.equals(this.id, userAuditLogWhereInput.id) &&
        Objects.equals(this.idContains, userAuditLogWhereInput.idContains) &&
        Objects.equals(this.idEndsWith, userAuditLogWhereInput.idEndsWith) &&
        Objects.equals(this.idGt, userAuditLogWhereInput.idGt) &&
        Objects.equals(this.idGte, userAuditLogWhereInput.idGte) &&
        Objects.equals(this.idIn, userAuditLogWhereInput.idIn) &&
        Objects.equals(this.idLt, userAuditLogWhereInput.idLt) &&
        Objects.equals(this.idLte, userAuditLogWhereInput.idLte) &&
        Objects.equals(this.idNot, userAuditLogWhereInput.idNot) &&
        Objects.equals(this.idNotContains, userAuditLogWhereInput.idNotContains) &&
        Objects.equals(this.idNotEndsWith, userAuditLogWhereInput.idNotEndsWith) &&
        Objects.equals(this.idNotIn, userAuditLogWhereInput.idNotIn) &&
        Objects.equals(this.idNotStartsWith, userAuditLogWhereInput.idNotStartsWith) &&
        Objects.equals(this.idStartsWith, userAuditLogWhereInput.idStartsWith) &&
        Objects.equals(this.ipAddress, userAuditLogWhereInput.ipAddress) &&
        Objects.equals(this.ipAddressContains, userAuditLogWhereInput.ipAddressContains) &&
        Objects.equals(this.ipAddressEndsWith, userAuditLogWhereInput.ipAddressEndsWith) &&
        Objects.equals(this.ipAddressGt, userAuditLogWhereInput.ipAddressGt) &&
        Objects.equals(this.ipAddressGte, userAuditLogWhereInput.ipAddressGte) &&
        Objects.equals(this.ipAddressIn, userAuditLogWhereInput.ipAddressIn) &&
        Objects.equals(this.ipAddressLt, userAuditLogWhereInput.ipAddressLt) &&
        Objects.equals(this.ipAddressLte, userAuditLogWhereInput.ipAddressLte) &&
        Objects.equals(this.ipAddressNot, userAuditLogWhereInput.ipAddressNot) &&
        Objects.equals(this.ipAddressNotContains, userAuditLogWhereInput.ipAddressNotContains) &&
        Objects.equals(this.ipAddressNotEndsWith, userAuditLogWhereInput.ipAddressNotEndsWith) &&
        Objects.equals(this.ipAddressNotIn, userAuditLogWhereInput.ipAddressNotIn) &&
        Objects.equals(this.ipAddressNotStartsWith, userAuditLogWhereInput.ipAddressNotStartsWith) &&
        Objects.equals(this.ipAddressStartsWith, userAuditLogWhereInput.ipAddressStartsWith) &&
        Objects.equals(this.message, userAuditLogWhereInput.message) &&
        Objects.equals(this.messageContains, userAuditLogWhereInput.messageContains) &&
        Objects.equals(this.messageEndsWith, userAuditLogWhereInput.messageEndsWith) &&
        Objects.equals(this.messageGt, userAuditLogWhereInput.messageGt) &&
        Objects.equals(this.messageGte, userAuditLogWhereInput.messageGte) &&
        Objects.equals(this.messageIn, userAuditLogWhereInput.messageIn) &&
        Objects.equals(this.messageLt, userAuditLogWhereInput.messageLt) &&
        Objects.equals(this.messageLte, userAuditLogWhereInput.messageLte) &&
        Objects.equals(this.messageNot, userAuditLogWhereInput.messageNot) &&
        Objects.equals(this.messageNotContains, userAuditLogWhereInput.messageNotContains) &&
        Objects.equals(this.messageNotEndsWith, userAuditLogWhereInput.messageNotEndsWith) &&
        Objects.equals(this.messageNotIn, userAuditLogWhereInput.messageNotIn) &&
        Objects.equals(this.messageNotStartsWith, userAuditLogWhereInput.messageNotStartsWith) &&
        Objects.equals(this.messageStartsWith, userAuditLogWhereInput.messageStartsWith) &&
        Objects.equals(this.resourceId, userAuditLogWhereInput.resourceId) &&
        Objects.equals(this.resourceIdContains, userAuditLogWhereInput.resourceIdContains) &&
        Objects.equals(this.resourceIdEndsWith, userAuditLogWhereInput.resourceIdEndsWith) &&
        Objects.equals(this.resourceIdGt, userAuditLogWhereInput.resourceIdGt) &&
        Objects.equals(this.resourceIdGte, userAuditLogWhereInput.resourceIdGte) &&
        Objects.equals(this.resourceIdIn, userAuditLogWhereInput.resourceIdIn) &&
        Objects.equals(this.resourceIdLt, userAuditLogWhereInput.resourceIdLt) &&
        Objects.equals(this.resourceIdLte, userAuditLogWhereInput.resourceIdLte) &&
        Objects.equals(this.resourceIdNot, userAuditLogWhereInput.resourceIdNot) &&
        Objects.equals(this.resourceIdNotContains, userAuditLogWhereInput.resourceIdNotContains) &&
        Objects.equals(this.resourceIdNotEndsWith, userAuditLogWhereInput.resourceIdNotEndsWith) &&
        Objects.equals(this.resourceIdNotIn, userAuditLogWhereInput.resourceIdNotIn) &&
        Objects.equals(this.resourceIdNotStartsWith, userAuditLogWhereInput.resourceIdNotStartsWith) &&
        Objects.equals(this.resourceIdStartsWith, userAuditLogWhereInput.resourceIdStartsWith) &&
        Objects.equals(this.resourceType, userAuditLogWhereInput.resourceType) &&
        Objects.equals(this.resourceTypeContains, userAuditLogWhereInput.resourceTypeContains) &&
        Objects.equals(this.resourceTypeEndsWith, userAuditLogWhereInput.resourceTypeEndsWith) &&
        Objects.equals(this.resourceTypeGt, userAuditLogWhereInput.resourceTypeGt) &&
        Objects.equals(this.resourceTypeGte, userAuditLogWhereInput.resourceTypeGte) &&
        Objects.equals(this.resourceTypeIn, userAuditLogWhereInput.resourceTypeIn) &&
        Objects.equals(this.resourceTypeLt, userAuditLogWhereInput.resourceTypeLt) &&
        Objects.equals(this.resourceTypeLte, userAuditLogWhereInput.resourceTypeLte) &&
        Objects.equals(this.resourceTypeNot, userAuditLogWhereInput.resourceTypeNot) &&
        Objects.equals(this.resourceTypeNotContains, userAuditLogWhereInput.resourceTypeNotContains) &&
        Objects.equals(this.resourceTypeNotEndsWith, userAuditLogWhereInput.resourceTypeNotEndsWith) &&
        Objects.equals(this.resourceTypeNotIn, userAuditLogWhereInput.resourceTypeNotIn) &&
        Objects.equals(this.resourceTypeNotStartsWith, userAuditLogWhereInput.resourceTypeNotStartsWith) &&
        Objects.equals(this.resourceTypeStartsWith, userAuditLogWhereInput.resourceTypeStartsWith) &&
        Objects.equals(this.startedAt, userAuditLogWhereInput.startedAt) &&
        Objects.equals(this.startedAtGt, userAuditLogWhereInput.startedAtGt) &&
        Objects.equals(this.startedAtGte, userAuditLogWhereInput.startedAtGte) &&
        Objects.equals(this.startedAtIn, userAuditLogWhereInput.startedAtIn) &&
        Objects.equals(this.startedAtLt, userAuditLogWhereInput.startedAtLt) &&
        Objects.equals(this.startedAtLte, userAuditLogWhereInput.startedAtLte) &&
        Objects.equals(this.startedAtNot, userAuditLogWhereInput.startedAtNot) &&
        Objects.equals(this.startedAtNotIn, userAuditLogWhereInput.startedAtNotIn) &&
        Objects.equals(this.status, userAuditLogWhereInput.status) &&
        Objects.equals(this.statusIn, userAuditLogWhereInput.statusIn) &&
        Objects.equals(this.statusNot, userAuditLogWhereInput.statusNot) &&
        Objects.equals(this.statusNotIn, userAuditLogWhereInput.statusNotIn) &&
        Objects.equals(this.user, userAuditLogWhereInput.user) &&
        Objects.equals(this.username, userAuditLogWhereInput.username) &&
        Objects.equals(this.usernameContains, userAuditLogWhereInput.usernameContains) &&
        Objects.equals(this.usernameEndsWith, userAuditLogWhereInput.usernameEndsWith) &&
        Objects.equals(this.usernameGt, userAuditLogWhereInput.usernameGt) &&
        Objects.equals(this.usernameGte, userAuditLogWhereInput.usernameGte) &&
        Objects.equals(this.usernameIn, userAuditLogWhereInput.usernameIn) &&
        Objects.equals(this.usernameLt, userAuditLogWhereInput.usernameLt) &&
        Objects.equals(this.usernameLte, userAuditLogWhereInput.usernameLte) &&
        Objects.equals(this.usernameNot, userAuditLogWhereInput.usernameNot) &&
        Objects.equals(this.usernameNotContains, userAuditLogWhereInput.usernameNotContains) &&
        Objects.equals(this.usernameNotEndsWith, userAuditLogWhereInput.usernameNotEndsWith) &&
        Objects.equals(this.usernameNotIn, userAuditLogWhereInput.usernameNotIn) &&
        Objects.equals(this.usernameNotStartsWith, userAuditLogWhereInput.usernameNotStartsWith) &&
        Objects.equals(this.usernameStartsWith, userAuditLogWhereInput.usernameStartsWith);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(AND, NOT, OR, action, actionContains, actionEndsWith, actionGt, actionGte, actionIn, actionLt, actionLte, actionNot, actionNotContains, actionNotEndsWith, actionNotIn, actionNotStartsWith, actionStartsWith, authType, authTypeContains, authTypeEndsWith, authTypeGt, authTypeGte, authTypeIn, authTypeLt, authTypeLte, authTypeNot, authTypeNotContains, authTypeNotEndsWith, authTypeNotIn, authTypeNotStartsWith, authTypeStartsWith, cluster, createdAt, createdAtGt, createdAtGte, createdAtIn, createdAtLt, createdAtLte, createdAtNot, createdAtNotIn, finishedAt, finishedAtGt, finishedAtGte, finishedAtIn, finishedAtLt, finishedAtLte, finishedAtNot, finishedAtNotIn, id, idContains, idEndsWith, idGt, idGte, idIn, idLt, idLte, idNot, idNotContains, idNotEndsWith, idNotIn, idNotStartsWith, idStartsWith, ipAddress, ipAddressContains, ipAddressEndsWith, ipAddressGt, ipAddressGte, ipAddressIn, ipAddressLt, ipAddressLte, ipAddressNot, ipAddressNotContains, ipAddressNotEndsWith, ipAddressNotIn, ipAddressNotStartsWith, ipAddressStartsWith, message, messageContains, messageEndsWith, messageGt, messageGte, messageIn, messageLt, messageLte, messageNot, messageNotContains, messageNotEndsWith, messageNotIn, messageNotStartsWith, messageStartsWith, resourceId, resourceIdContains, resourceIdEndsWith, resourceIdGt, resourceIdGte, resourceIdIn, resourceIdLt, resourceIdLte, resourceIdNot, resourceIdNotContains, resourceIdNotEndsWith, resourceIdNotIn, resourceIdNotStartsWith, resourceIdStartsWith, resourceType, resourceTypeContains, resourceTypeEndsWith, resourceTypeGt, resourceTypeGte, resourceTypeIn, resourceTypeLt, resourceTypeLte, resourceTypeNot, resourceTypeNotContains, resourceTypeNotEndsWith, resourceTypeNotIn, resourceTypeNotStartsWith, resourceTypeStartsWith, startedAt, startedAtGt, startedAtGte, startedAtIn, startedAtLt, startedAtLte, startedAtNot, startedAtNotIn, status, statusIn, statusNot, statusNotIn, user, username, usernameContains, usernameEndsWith, usernameGt, usernameGte, usernameIn, usernameLt, usernameLte, usernameNot, usernameNotContains, usernameNotEndsWith, usernameNotIn, usernameNotStartsWith, usernameStartsWith);
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
    sb.append("class UserAuditLogWhereInput {\n");
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
    sb.append("    authType: ").append(toIndentedString(authType)).append("\n");
    sb.append("    authTypeContains: ").append(toIndentedString(authTypeContains)).append("\n");
    sb.append("    authTypeEndsWith: ").append(toIndentedString(authTypeEndsWith)).append("\n");
    sb.append("    authTypeGt: ").append(toIndentedString(authTypeGt)).append("\n");
    sb.append("    authTypeGte: ").append(toIndentedString(authTypeGte)).append("\n");
    sb.append("    authTypeIn: ").append(toIndentedString(authTypeIn)).append("\n");
    sb.append("    authTypeLt: ").append(toIndentedString(authTypeLt)).append("\n");
    sb.append("    authTypeLte: ").append(toIndentedString(authTypeLte)).append("\n");
    sb.append("    authTypeNot: ").append(toIndentedString(authTypeNot)).append("\n");
    sb.append("    authTypeNotContains: ").append(toIndentedString(authTypeNotContains)).append("\n");
    sb.append("    authTypeNotEndsWith: ").append(toIndentedString(authTypeNotEndsWith)).append("\n");
    sb.append("    authTypeNotIn: ").append(toIndentedString(authTypeNotIn)).append("\n");
    sb.append("    authTypeNotStartsWith: ").append(toIndentedString(authTypeNotStartsWith)).append("\n");
    sb.append("    authTypeStartsWith: ").append(toIndentedString(authTypeStartsWith)).append("\n");
    sb.append("    cluster: ").append(toIndentedString(cluster)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    createdAtGt: ").append(toIndentedString(createdAtGt)).append("\n");
    sb.append("    createdAtGte: ").append(toIndentedString(createdAtGte)).append("\n");
    sb.append("    createdAtIn: ").append(toIndentedString(createdAtIn)).append("\n");
    sb.append("    createdAtLt: ").append(toIndentedString(createdAtLt)).append("\n");
    sb.append("    createdAtLte: ").append(toIndentedString(createdAtLte)).append("\n");
    sb.append("    createdAtNot: ").append(toIndentedString(createdAtNot)).append("\n");
    sb.append("    createdAtNotIn: ").append(toIndentedString(createdAtNotIn)).append("\n");
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
    sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
    sb.append("    ipAddressContains: ").append(toIndentedString(ipAddressContains)).append("\n");
    sb.append("    ipAddressEndsWith: ").append(toIndentedString(ipAddressEndsWith)).append("\n");
    sb.append("    ipAddressGt: ").append(toIndentedString(ipAddressGt)).append("\n");
    sb.append("    ipAddressGte: ").append(toIndentedString(ipAddressGte)).append("\n");
    sb.append("    ipAddressIn: ").append(toIndentedString(ipAddressIn)).append("\n");
    sb.append("    ipAddressLt: ").append(toIndentedString(ipAddressLt)).append("\n");
    sb.append("    ipAddressLte: ").append(toIndentedString(ipAddressLte)).append("\n");
    sb.append("    ipAddressNot: ").append(toIndentedString(ipAddressNot)).append("\n");
    sb.append("    ipAddressNotContains: ").append(toIndentedString(ipAddressNotContains)).append("\n");
    sb.append("    ipAddressNotEndsWith: ").append(toIndentedString(ipAddressNotEndsWith)).append("\n");
    sb.append("    ipAddressNotIn: ").append(toIndentedString(ipAddressNotIn)).append("\n");
    sb.append("    ipAddressNotStartsWith: ").append(toIndentedString(ipAddressNotStartsWith)).append("\n");
    sb.append("    ipAddressStartsWith: ").append(toIndentedString(ipAddressStartsWith)).append("\n");
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
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
    sb.append("    resourceTypeContains: ").append(toIndentedString(resourceTypeContains)).append("\n");
    sb.append("    resourceTypeEndsWith: ").append(toIndentedString(resourceTypeEndsWith)).append("\n");
    sb.append("    resourceTypeGt: ").append(toIndentedString(resourceTypeGt)).append("\n");
    sb.append("    resourceTypeGte: ").append(toIndentedString(resourceTypeGte)).append("\n");
    sb.append("    resourceTypeIn: ").append(toIndentedString(resourceTypeIn)).append("\n");
    sb.append("    resourceTypeLt: ").append(toIndentedString(resourceTypeLt)).append("\n");
    sb.append("    resourceTypeLte: ").append(toIndentedString(resourceTypeLte)).append("\n");
    sb.append("    resourceTypeNot: ").append(toIndentedString(resourceTypeNot)).append("\n");
    sb.append("    resourceTypeNotContains: ").append(toIndentedString(resourceTypeNotContains)).append("\n");
    sb.append("    resourceTypeNotEndsWith: ").append(toIndentedString(resourceTypeNotEndsWith)).append("\n");
    sb.append("    resourceTypeNotIn: ").append(toIndentedString(resourceTypeNotIn)).append("\n");
    sb.append("    resourceTypeNotStartsWith: ").append(toIndentedString(resourceTypeNotStartsWith)).append("\n");
    sb.append("    resourceTypeStartsWith: ").append(toIndentedString(resourceTypeStartsWith)).append("\n");
    sb.append("    startedAt: ").append(toIndentedString(startedAt)).append("\n");
    sb.append("    startedAtGt: ").append(toIndentedString(startedAtGt)).append("\n");
    sb.append("    startedAtGte: ").append(toIndentedString(startedAtGte)).append("\n");
    sb.append("    startedAtIn: ").append(toIndentedString(startedAtIn)).append("\n");
    sb.append("    startedAtLt: ").append(toIndentedString(startedAtLt)).append("\n");
    sb.append("    startedAtLte: ").append(toIndentedString(startedAtLte)).append("\n");
    sb.append("    startedAtNot: ").append(toIndentedString(startedAtNot)).append("\n");
    sb.append("    startedAtNotIn: ").append(toIndentedString(startedAtNotIn)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusIn: ").append(toIndentedString(statusIn)).append("\n");
    sb.append("    statusNot: ").append(toIndentedString(statusNot)).append("\n");
    sb.append("    statusNotIn: ").append(toIndentedString(statusNotIn)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    usernameContains: ").append(toIndentedString(usernameContains)).append("\n");
    sb.append("    usernameEndsWith: ").append(toIndentedString(usernameEndsWith)).append("\n");
    sb.append("    usernameGt: ").append(toIndentedString(usernameGt)).append("\n");
    sb.append("    usernameGte: ").append(toIndentedString(usernameGte)).append("\n");
    sb.append("    usernameIn: ").append(toIndentedString(usernameIn)).append("\n");
    sb.append("    usernameLt: ").append(toIndentedString(usernameLt)).append("\n");
    sb.append("    usernameLte: ").append(toIndentedString(usernameLte)).append("\n");
    sb.append("    usernameNot: ").append(toIndentedString(usernameNot)).append("\n");
    sb.append("    usernameNotContains: ").append(toIndentedString(usernameNotContains)).append("\n");
    sb.append("    usernameNotEndsWith: ").append(toIndentedString(usernameNotEndsWith)).append("\n");
    sb.append("    usernameNotIn: ").append(toIndentedString(usernameNotIn)).append("\n");
    sb.append("    usernameNotStartsWith: ").append(toIndentedString(usernameNotStartsWith)).append("\n");
    sb.append("    usernameStartsWith: ").append(toIndentedString(usernameStartsWith)).append("\n");
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

