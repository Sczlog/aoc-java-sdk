package com.arcfra.aoc.model;

import java.util.Objects;
import java.util.Arrays;
import com.arcfra.aoc.model.ClusterWhereInput;
import com.arcfra.aoc.model.HostWhereInput;
import com.arcfra.aoc.model.VmWhereInput;
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
 * AlertWhereInput
 */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class AlertWhereInput {
  public static final String SERIALIZED_NAME_A_N_D = "AND";
  @SerializedName(SERIALIZED_NAME_A_N_D)
  private List<AlertWhereInput> AND = null;

  public static final String SERIALIZED_NAME_N_O_T = "NOT";
  @SerializedName(SERIALIZED_NAME_N_O_T)
  private List<AlertWhereInput> NOT = null;

  public static final String SERIALIZED_NAME_O_R = "OR";
  @SerializedName(SERIALIZED_NAME_O_R)
  private List<AlertWhereInput> OR = null;

  public static final String SERIALIZED_NAME_CAUSE = "cause";
  @SerializedName(SERIALIZED_NAME_CAUSE)
  private String cause;

  public static final String SERIALIZED_NAME_CAUSE_CONTAINS = "cause_contains";
  @SerializedName(SERIALIZED_NAME_CAUSE_CONTAINS)
  private String causeContains;

  public static final String SERIALIZED_NAME_CAUSE_ENDS_WITH = "cause_ends_with";
  @SerializedName(SERIALIZED_NAME_CAUSE_ENDS_WITH)
  private String causeEndsWith;

  public static final String SERIALIZED_NAME_CAUSE_GT = "cause_gt";
  @SerializedName(SERIALIZED_NAME_CAUSE_GT)
  private String causeGt;

  public static final String SERIALIZED_NAME_CAUSE_GTE = "cause_gte";
  @SerializedName(SERIALIZED_NAME_CAUSE_GTE)
  private String causeGte;

  public static final String SERIALIZED_NAME_CAUSE_IN = "cause_in";
  @SerializedName(SERIALIZED_NAME_CAUSE_IN)
  private List<String> causeIn = null;

  public static final String SERIALIZED_NAME_CAUSE_LT = "cause_lt";
  @SerializedName(SERIALIZED_NAME_CAUSE_LT)
  private String causeLt;

  public static final String SERIALIZED_NAME_CAUSE_LTE = "cause_lte";
  @SerializedName(SERIALIZED_NAME_CAUSE_LTE)
  private String causeLte;

  public static final String SERIALIZED_NAME_CAUSE_NOT = "cause_not";
  @SerializedName(SERIALIZED_NAME_CAUSE_NOT)
  private String causeNot;

  public static final String SERIALIZED_NAME_CAUSE_NOT_CONTAINS = "cause_not_contains";
  @SerializedName(SERIALIZED_NAME_CAUSE_NOT_CONTAINS)
  private String causeNotContains;

  public static final String SERIALIZED_NAME_CAUSE_NOT_ENDS_WITH = "cause_not_ends_with";
  @SerializedName(SERIALIZED_NAME_CAUSE_NOT_ENDS_WITH)
  private String causeNotEndsWith;

  public static final String SERIALIZED_NAME_CAUSE_NOT_IN = "cause_not_in";
  @SerializedName(SERIALIZED_NAME_CAUSE_NOT_IN)
  private List<String> causeNotIn = null;

  public static final String SERIALIZED_NAME_CAUSE_NOT_STARTS_WITH = "cause_not_starts_with";
  @SerializedName(SERIALIZED_NAME_CAUSE_NOT_STARTS_WITH)
  private String causeNotStartsWith;

  public static final String SERIALIZED_NAME_CAUSE_STARTS_WITH = "cause_starts_with";
  @SerializedName(SERIALIZED_NAME_CAUSE_STARTS_WITH)
  private String causeStartsWith;

  public static final String SERIALIZED_NAME_CLUSTER = "cluster";
  @SerializedName(SERIALIZED_NAME_CLUSTER)
  private ClusterWhereInput cluster;

  public static final String SERIALIZED_NAME_CREATE_TIME = "create_time";
  @SerializedName(SERIALIZED_NAME_CREATE_TIME)
  private String createTime;

  public static final String SERIALIZED_NAME_CREATE_TIME_GT = "create_time_gt";
  @SerializedName(SERIALIZED_NAME_CREATE_TIME_GT)
  private String createTimeGt;

  public static final String SERIALIZED_NAME_CREATE_TIME_GTE = "create_time_gte";
  @SerializedName(SERIALIZED_NAME_CREATE_TIME_GTE)
  private String createTimeGte;

  public static final String SERIALIZED_NAME_CREATE_TIME_IN = "create_time_in";
  @SerializedName(SERIALIZED_NAME_CREATE_TIME_IN)
  private List<String> createTimeIn = null;

  public static final String SERIALIZED_NAME_CREATE_TIME_LT = "create_time_lt";
  @SerializedName(SERIALIZED_NAME_CREATE_TIME_LT)
  private String createTimeLt;

  public static final String SERIALIZED_NAME_CREATE_TIME_LTE = "create_time_lte";
  @SerializedName(SERIALIZED_NAME_CREATE_TIME_LTE)
  private String createTimeLte;

  public static final String SERIALIZED_NAME_CREATE_TIME_NOT = "create_time_not";
  @SerializedName(SERIALIZED_NAME_CREATE_TIME_NOT)
  private String createTimeNot;

  public static final String SERIALIZED_NAME_CREATE_TIME_NOT_IN = "create_time_not_in";
  @SerializedName(SERIALIZED_NAME_CREATE_TIME_NOT_IN)
  private List<String> createTimeNotIn = null;

  public static final String SERIALIZED_NAME_ENDED = "ended";
  @SerializedName(SERIALIZED_NAME_ENDED)
  private Boolean ended;

  public static final String SERIALIZED_NAME_ENDED_NOT = "ended_not";
  @SerializedName(SERIALIZED_NAME_ENDED_NOT)
  private Boolean endedNot;

  public static final String SERIALIZED_NAME_HOST = "host";
  @SerializedName(SERIALIZED_NAME_HOST)
  private HostWhereInput host;

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

  public static final String SERIALIZED_NAME_IMPACT = "impact";
  @SerializedName(SERIALIZED_NAME_IMPACT)
  private String impact;

  public static final String SERIALIZED_NAME_IMPACT_CONTAINS = "impact_contains";
  @SerializedName(SERIALIZED_NAME_IMPACT_CONTAINS)
  private String impactContains;

  public static final String SERIALIZED_NAME_IMPACT_ENDS_WITH = "impact_ends_with";
  @SerializedName(SERIALIZED_NAME_IMPACT_ENDS_WITH)
  private String impactEndsWith;

  public static final String SERIALIZED_NAME_IMPACT_GT = "impact_gt";
  @SerializedName(SERIALIZED_NAME_IMPACT_GT)
  private String impactGt;

  public static final String SERIALIZED_NAME_IMPACT_GTE = "impact_gte";
  @SerializedName(SERIALIZED_NAME_IMPACT_GTE)
  private String impactGte;

  public static final String SERIALIZED_NAME_IMPACT_IN = "impact_in";
  @SerializedName(SERIALIZED_NAME_IMPACT_IN)
  private List<String> impactIn = null;

  public static final String SERIALIZED_NAME_IMPACT_LT = "impact_lt";
  @SerializedName(SERIALIZED_NAME_IMPACT_LT)
  private String impactLt;

  public static final String SERIALIZED_NAME_IMPACT_LTE = "impact_lte";
  @SerializedName(SERIALIZED_NAME_IMPACT_LTE)
  private String impactLte;

  public static final String SERIALIZED_NAME_IMPACT_NOT = "impact_not";
  @SerializedName(SERIALIZED_NAME_IMPACT_NOT)
  private String impactNot;

  public static final String SERIALIZED_NAME_IMPACT_NOT_CONTAINS = "impact_not_contains";
  @SerializedName(SERIALIZED_NAME_IMPACT_NOT_CONTAINS)
  private String impactNotContains;

  public static final String SERIALIZED_NAME_IMPACT_NOT_ENDS_WITH = "impact_not_ends_with";
  @SerializedName(SERIALIZED_NAME_IMPACT_NOT_ENDS_WITH)
  private String impactNotEndsWith;

  public static final String SERIALIZED_NAME_IMPACT_NOT_IN = "impact_not_in";
  @SerializedName(SERIALIZED_NAME_IMPACT_NOT_IN)
  private List<String> impactNotIn = null;

  public static final String SERIALIZED_NAME_IMPACT_NOT_STARTS_WITH = "impact_not_starts_with";
  @SerializedName(SERIALIZED_NAME_IMPACT_NOT_STARTS_WITH)
  private String impactNotStartsWith;

  public static final String SERIALIZED_NAME_IMPACT_STARTS_WITH = "impact_starts_with";
  @SerializedName(SERIALIZED_NAME_IMPACT_STARTS_WITH)
  private String impactStartsWith;

  public static final String SERIALIZED_NAME_LOCAL_CREATE_TIME = "local_create_time";
  @SerializedName(SERIALIZED_NAME_LOCAL_CREATE_TIME)
  private String localCreateTime;

  public static final String SERIALIZED_NAME_LOCAL_CREATE_TIME_GT = "local_create_time_gt";
  @SerializedName(SERIALIZED_NAME_LOCAL_CREATE_TIME_GT)
  private String localCreateTimeGt;

  public static final String SERIALIZED_NAME_LOCAL_CREATE_TIME_GTE = "local_create_time_gte";
  @SerializedName(SERIALIZED_NAME_LOCAL_CREATE_TIME_GTE)
  private String localCreateTimeGte;

  public static final String SERIALIZED_NAME_LOCAL_CREATE_TIME_IN = "local_create_time_in";
  @SerializedName(SERIALIZED_NAME_LOCAL_CREATE_TIME_IN)
  private List<String> localCreateTimeIn = null;

  public static final String SERIALIZED_NAME_LOCAL_CREATE_TIME_LT = "local_create_time_lt";
  @SerializedName(SERIALIZED_NAME_LOCAL_CREATE_TIME_LT)
  private String localCreateTimeLt;

  public static final String SERIALIZED_NAME_LOCAL_CREATE_TIME_LTE = "local_create_time_lte";
  @SerializedName(SERIALIZED_NAME_LOCAL_CREATE_TIME_LTE)
  private String localCreateTimeLte;

  public static final String SERIALIZED_NAME_LOCAL_CREATE_TIME_NOT = "local_create_time_not";
  @SerializedName(SERIALIZED_NAME_LOCAL_CREATE_TIME_NOT)
  private String localCreateTimeNot;

  public static final String SERIALIZED_NAME_LOCAL_CREATE_TIME_NOT_IN = "local_create_time_not_in";
  @SerializedName(SERIALIZED_NAME_LOCAL_CREATE_TIME_NOT_IN)
  private List<String> localCreateTimeNotIn = null;

  public static final String SERIALIZED_NAME_LOCAL_END_TIME = "local_end_time";
  @SerializedName(SERIALIZED_NAME_LOCAL_END_TIME)
  private String localEndTime;

  public static final String SERIALIZED_NAME_LOCAL_END_TIME_CONTAINS = "local_end_time_contains";
  @SerializedName(SERIALIZED_NAME_LOCAL_END_TIME_CONTAINS)
  private String localEndTimeContains;

  public static final String SERIALIZED_NAME_LOCAL_END_TIME_ENDS_WITH = "local_end_time_ends_with";
  @SerializedName(SERIALIZED_NAME_LOCAL_END_TIME_ENDS_WITH)
  private String localEndTimeEndsWith;

  public static final String SERIALIZED_NAME_LOCAL_END_TIME_GT = "local_end_time_gt";
  @SerializedName(SERIALIZED_NAME_LOCAL_END_TIME_GT)
  private String localEndTimeGt;

  public static final String SERIALIZED_NAME_LOCAL_END_TIME_GTE = "local_end_time_gte";
  @SerializedName(SERIALIZED_NAME_LOCAL_END_TIME_GTE)
  private String localEndTimeGte;

  public static final String SERIALIZED_NAME_LOCAL_END_TIME_IN = "local_end_time_in";
  @SerializedName(SERIALIZED_NAME_LOCAL_END_TIME_IN)
  private List<String> localEndTimeIn = null;

  public static final String SERIALIZED_NAME_LOCAL_END_TIME_LT = "local_end_time_lt";
  @SerializedName(SERIALIZED_NAME_LOCAL_END_TIME_LT)
  private String localEndTimeLt;

  public static final String SERIALIZED_NAME_LOCAL_END_TIME_LTE = "local_end_time_lte";
  @SerializedName(SERIALIZED_NAME_LOCAL_END_TIME_LTE)
  private String localEndTimeLte;

  public static final String SERIALIZED_NAME_LOCAL_END_TIME_NOT = "local_end_time_not";
  @SerializedName(SERIALIZED_NAME_LOCAL_END_TIME_NOT)
  private String localEndTimeNot;

  public static final String SERIALIZED_NAME_LOCAL_END_TIME_NOT_CONTAINS = "local_end_time_not_contains";
  @SerializedName(SERIALIZED_NAME_LOCAL_END_TIME_NOT_CONTAINS)
  private String localEndTimeNotContains;

  public static final String SERIALIZED_NAME_LOCAL_END_TIME_NOT_ENDS_WITH = "local_end_time_not_ends_with";
  @SerializedName(SERIALIZED_NAME_LOCAL_END_TIME_NOT_ENDS_WITH)
  private String localEndTimeNotEndsWith;

  public static final String SERIALIZED_NAME_LOCAL_END_TIME_NOT_IN = "local_end_time_not_in";
  @SerializedName(SERIALIZED_NAME_LOCAL_END_TIME_NOT_IN)
  private List<String> localEndTimeNotIn = null;

  public static final String SERIALIZED_NAME_LOCAL_END_TIME_NOT_STARTS_WITH = "local_end_time_not_starts_with";
  @SerializedName(SERIALIZED_NAME_LOCAL_END_TIME_NOT_STARTS_WITH)
  private String localEndTimeNotStartsWith;

  public static final String SERIALIZED_NAME_LOCAL_END_TIME_STARTS_WITH = "local_end_time_starts_with";
  @SerializedName(SERIALIZED_NAME_LOCAL_END_TIME_STARTS_WITH)
  private String localEndTimeStartsWith;

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

  public static final String SERIALIZED_NAME_LOCAL_START_TIME = "local_start_time";
  @SerializedName(SERIALIZED_NAME_LOCAL_START_TIME)
  private String localStartTime;

  public static final String SERIALIZED_NAME_LOCAL_START_TIME_CONTAINS = "local_start_time_contains";
  @SerializedName(SERIALIZED_NAME_LOCAL_START_TIME_CONTAINS)
  private String localStartTimeContains;

  public static final String SERIALIZED_NAME_LOCAL_START_TIME_ENDS_WITH = "local_start_time_ends_with";
  @SerializedName(SERIALIZED_NAME_LOCAL_START_TIME_ENDS_WITH)
  private String localStartTimeEndsWith;

  public static final String SERIALIZED_NAME_LOCAL_START_TIME_GT = "local_start_time_gt";
  @SerializedName(SERIALIZED_NAME_LOCAL_START_TIME_GT)
  private String localStartTimeGt;

  public static final String SERIALIZED_NAME_LOCAL_START_TIME_GTE = "local_start_time_gte";
  @SerializedName(SERIALIZED_NAME_LOCAL_START_TIME_GTE)
  private String localStartTimeGte;

  public static final String SERIALIZED_NAME_LOCAL_START_TIME_IN = "local_start_time_in";
  @SerializedName(SERIALIZED_NAME_LOCAL_START_TIME_IN)
  private List<String> localStartTimeIn = null;

  public static final String SERIALIZED_NAME_LOCAL_START_TIME_LT = "local_start_time_lt";
  @SerializedName(SERIALIZED_NAME_LOCAL_START_TIME_LT)
  private String localStartTimeLt;

  public static final String SERIALIZED_NAME_LOCAL_START_TIME_LTE = "local_start_time_lte";
  @SerializedName(SERIALIZED_NAME_LOCAL_START_TIME_LTE)
  private String localStartTimeLte;

  public static final String SERIALIZED_NAME_LOCAL_START_TIME_NOT = "local_start_time_not";
  @SerializedName(SERIALIZED_NAME_LOCAL_START_TIME_NOT)
  private String localStartTimeNot;

  public static final String SERIALIZED_NAME_LOCAL_START_TIME_NOT_CONTAINS = "local_start_time_not_contains";
  @SerializedName(SERIALIZED_NAME_LOCAL_START_TIME_NOT_CONTAINS)
  private String localStartTimeNotContains;

  public static final String SERIALIZED_NAME_LOCAL_START_TIME_NOT_ENDS_WITH = "local_start_time_not_ends_with";
  @SerializedName(SERIALIZED_NAME_LOCAL_START_TIME_NOT_ENDS_WITH)
  private String localStartTimeNotEndsWith;

  public static final String SERIALIZED_NAME_LOCAL_START_TIME_NOT_IN = "local_start_time_not_in";
  @SerializedName(SERIALIZED_NAME_LOCAL_START_TIME_NOT_IN)
  private List<String> localStartTimeNotIn = null;

  public static final String SERIALIZED_NAME_LOCAL_START_TIME_NOT_STARTS_WITH = "local_start_time_not_starts_with";
  @SerializedName(SERIALIZED_NAME_LOCAL_START_TIME_NOT_STARTS_WITH)
  private String localStartTimeNotStartsWith;

  public static final String SERIALIZED_NAME_LOCAL_START_TIME_STARTS_WITH = "local_start_time_starts_with";
  @SerializedName(SERIALIZED_NAME_LOCAL_START_TIME_STARTS_WITH)
  private String localStartTimeStartsWith;

  public static final String SERIALIZED_NAME_LOCAL_UPDATE_TIME = "local_update_time";
  @SerializedName(SERIALIZED_NAME_LOCAL_UPDATE_TIME)
  private String localUpdateTime;

  public static final String SERIALIZED_NAME_LOCAL_UPDATE_TIME_CONTAINS = "local_update_time_contains";
  @SerializedName(SERIALIZED_NAME_LOCAL_UPDATE_TIME_CONTAINS)
  private String localUpdateTimeContains;

  public static final String SERIALIZED_NAME_LOCAL_UPDATE_TIME_ENDS_WITH = "local_update_time_ends_with";
  @SerializedName(SERIALIZED_NAME_LOCAL_UPDATE_TIME_ENDS_WITH)
  private String localUpdateTimeEndsWith;

  public static final String SERIALIZED_NAME_LOCAL_UPDATE_TIME_GT = "local_update_time_gt";
  @SerializedName(SERIALIZED_NAME_LOCAL_UPDATE_TIME_GT)
  private String localUpdateTimeGt;

  public static final String SERIALIZED_NAME_LOCAL_UPDATE_TIME_GTE = "local_update_time_gte";
  @SerializedName(SERIALIZED_NAME_LOCAL_UPDATE_TIME_GTE)
  private String localUpdateTimeGte;

  public static final String SERIALIZED_NAME_LOCAL_UPDATE_TIME_IN = "local_update_time_in";
  @SerializedName(SERIALIZED_NAME_LOCAL_UPDATE_TIME_IN)
  private List<String> localUpdateTimeIn = null;

  public static final String SERIALIZED_NAME_LOCAL_UPDATE_TIME_LT = "local_update_time_lt";
  @SerializedName(SERIALIZED_NAME_LOCAL_UPDATE_TIME_LT)
  private String localUpdateTimeLt;

  public static final String SERIALIZED_NAME_LOCAL_UPDATE_TIME_LTE = "local_update_time_lte";
  @SerializedName(SERIALIZED_NAME_LOCAL_UPDATE_TIME_LTE)
  private String localUpdateTimeLte;

  public static final String SERIALIZED_NAME_LOCAL_UPDATE_TIME_NOT = "local_update_time_not";
  @SerializedName(SERIALIZED_NAME_LOCAL_UPDATE_TIME_NOT)
  private String localUpdateTimeNot;

  public static final String SERIALIZED_NAME_LOCAL_UPDATE_TIME_NOT_CONTAINS = "local_update_time_not_contains";
  @SerializedName(SERIALIZED_NAME_LOCAL_UPDATE_TIME_NOT_CONTAINS)
  private String localUpdateTimeNotContains;

  public static final String SERIALIZED_NAME_LOCAL_UPDATE_TIME_NOT_ENDS_WITH = "local_update_time_not_ends_with";
  @SerializedName(SERIALIZED_NAME_LOCAL_UPDATE_TIME_NOT_ENDS_WITH)
  private String localUpdateTimeNotEndsWith;

  public static final String SERIALIZED_NAME_LOCAL_UPDATE_TIME_NOT_IN = "local_update_time_not_in";
  @SerializedName(SERIALIZED_NAME_LOCAL_UPDATE_TIME_NOT_IN)
  private List<String> localUpdateTimeNotIn = null;

  public static final String SERIALIZED_NAME_LOCAL_UPDATE_TIME_NOT_STARTS_WITH = "local_update_time_not_starts_with";
  @SerializedName(SERIALIZED_NAME_LOCAL_UPDATE_TIME_NOT_STARTS_WITH)
  private String localUpdateTimeNotStartsWith;

  public static final String SERIALIZED_NAME_LOCAL_UPDATE_TIME_STARTS_WITH = "local_update_time_starts_with";
  @SerializedName(SERIALIZED_NAME_LOCAL_UPDATE_TIME_STARTS_WITH)
  private String localUpdateTimeStartsWith;

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

  public static final String SERIALIZED_NAME_SEVERITY = "severity";
  @SerializedName(SERIALIZED_NAME_SEVERITY)
  private String severity;

  public static final String SERIALIZED_NAME_SEVERITY_CONTAINS = "severity_contains";
  @SerializedName(SERIALIZED_NAME_SEVERITY_CONTAINS)
  private String severityContains;

  public static final String SERIALIZED_NAME_SEVERITY_ENDS_WITH = "severity_ends_with";
  @SerializedName(SERIALIZED_NAME_SEVERITY_ENDS_WITH)
  private String severityEndsWith;

  public static final String SERIALIZED_NAME_SEVERITY_GT = "severity_gt";
  @SerializedName(SERIALIZED_NAME_SEVERITY_GT)
  private String severityGt;

  public static final String SERIALIZED_NAME_SEVERITY_GTE = "severity_gte";
  @SerializedName(SERIALIZED_NAME_SEVERITY_GTE)
  private String severityGte;

  public static final String SERIALIZED_NAME_SEVERITY_IN = "severity_in";
  @SerializedName(SERIALIZED_NAME_SEVERITY_IN)
  private List<String> severityIn = null;

  public static final String SERIALIZED_NAME_SEVERITY_LT = "severity_lt";
  @SerializedName(SERIALIZED_NAME_SEVERITY_LT)
  private String severityLt;

  public static final String SERIALIZED_NAME_SEVERITY_LTE = "severity_lte";
  @SerializedName(SERIALIZED_NAME_SEVERITY_LTE)
  private String severityLte;

  public static final String SERIALIZED_NAME_SEVERITY_NOT = "severity_not";
  @SerializedName(SERIALIZED_NAME_SEVERITY_NOT)
  private String severityNot;

  public static final String SERIALIZED_NAME_SEVERITY_NOT_CONTAINS = "severity_not_contains";
  @SerializedName(SERIALIZED_NAME_SEVERITY_NOT_CONTAINS)
  private String severityNotContains;

  public static final String SERIALIZED_NAME_SEVERITY_NOT_ENDS_WITH = "severity_not_ends_with";
  @SerializedName(SERIALIZED_NAME_SEVERITY_NOT_ENDS_WITH)
  private String severityNotEndsWith;

  public static final String SERIALIZED_NAME_SEVERITY_NOT_IN = "severity_not_in";
  @SerializedName(SERIALIZED_NAME_SEVERITY_NOT_IN)
  private List<String> severityNotIn = null;

  public static final String SERIALIZED_NAME_SEVERITY_NOT_STARTS_WITH = "severity_not_starts_with";
  @SerializedName(SERIALIZED_NAME_SEVERITY_NOT_STARTS_WITH)
  private String severityNotStartsWith;

  public static final String SERIALIZED_NAME_SEVERITY_STARTS_WITH = "severity_starts_with";
  @SerializedName(SERIALIZED_NAME_SEVERITY_STARTS_WITH)
  private String severityStartsWith;

  public static final String SERIALIZED_NAME_SOLUTION = "solution";
  @SerializedName(SERIALIZED_NAME_SOLUTION)
  private String solution;

  public static final String SERIALIZED_NAME_SOLUTION_CONTAINS = "solution_contains";
  @SerializedName(SERIALIZED_NAME_SOLUTION_CONTAINS)
  private String solutionContains;

  public static final String SERIALIZED_NAME_SOLUTION_ENDS_WITH = "solution_ends_with";
  @SerializedName(SERIALIZED_NAME_SOLUTION_ENDS_WITH)
  private String solutionEndsWith;

  public static final String SERIALIZED_NAME_SOLUTION_GT = "solution_gt";
  @SerializedName(SERIALIZED_NAME_SOLUTION_GT)
  private String solutionGt;

  public static final String SERIALIZED_NAME_SOLUTION_GTE = "solution_gte";
  @SerializedName(SERIALIZED_NAME_SOLUTION_GTE)
  private String solutionGte;

  public static final String SERIALIZED_NAME_SOLUTION_IN = "solution_in";
  @SerializedName(SERIALIZED_NAME_SOLUTION_IN)
  private List<String> solutionIn = null;

  public static final String SERIALIZED_NAME_SOLUTION_LT = "solution_lt";
  @SerializedName(SERIALIZED_NAME_SOLUTION_LT)
  private String solutionLt;

  public static final String SERIALIZED_NAME_SOLUTION_LTE = "solution_lte";
  @SerializedName(SERIALIZED_NAME_SOLUTION_LTE)
  private String solutionLte;

  public static final String SERIALIZED_NAME_SOLUTION_NOT = "solution_not";
  @SerializedName(SERIALIZED_NAME_SOLUTION_NOT)
  private String solutionNot;

  public static final String SERIALIZED_NAME_SOLUTION_NOT_CONTAINS = "solution_not_contains";
  @SerializedName(SERIALIZED_NAME_SOLUTION_NOT_CONTAINS)
  private String solutionNotContains;

  public static final String SERIALIZED_NAME_SOLUTION_NOT_ENDS_WITH = "solution_not_ends_with";
  @SerializedName(SERIALIZED_NAME_SOLUTION_NOT_ENDS_WITH)
  private String solutionNotEndsWith;

  public static final String SERIALIZED_NAME_SOLUTION_NOT_IN = "solution_not_in";
  @SerializedName(SERIALIZED_NAME_SOLUTION_NOT_IN)
  private List<String> solutionNotIn = null;

  public static final String SERIALIZED_NAME_SOLUTION_NOT_STARTS_WITH = "solution_not_starts_with";
  @SerializedName(SERIALIZED_NAME_SOLUTION_NOT_STARTS_WITH)
  private String solutionNotStartsWith;

  public static final String SERIALIZED_NAME_SOLUTION_STARTS_WITH = "solution_starts_with";
  @SerializedName(SERIALIZED_NAME_SOLUTION_STARTS_WITH)
  private String solutionStartsWith;

  public static final String SERIALIZED_NAME_THRESHOLD = "threshold";
  @SerializedName(SERIALIZED_NAME_THRESHOLD)
  private Double threshold;

  public static final String SERIALIZED_NAME_THRESHOLD_GT = "threshold_gt";
  @SerializedName(SERIALIZED_NAME_THRESHOLD_GT)
  private Double thresholdGt;

  public static final String SERIALIZED_NAME_THRESHOLD_GTE = "threshold_gte";
  @SerializedName(SERIALIZED_NAME_THRESHOLD_GTE)
  private Double thresholdGte;

  public static final String SERIALIZED_NAME_THRESHOLD_IN = "threshold_in";
  @SerializedName(SERIALIZED_NAME_THRESHOLD_IN)
  private List<Double> thresholdIn = null;

  public static final String SERIALIZED_NAME_THRESHOLD_LT = "threshold_lt";
  @SerializedName(SERIALIZED_NAME_THRESHOLD_LT)
  private Double thresholdLt;

  public static final String SERIALIZED_NAME_THRESHOLD_LTE = "threshold_lte";
  @SerializedName(SERIALIZED_NAME_THRESHOLD_LTE)
  private Double thresholdLte;

  public static final String SERIALIZED_NAME_THRESHOLD_NOT = "threshold_not";
  @SerializedName(SERIALIZED_NAME_THRESHOLD_NOT)
  private Double thresholdNot;

  public static final String SERIALIZED_NAME_THRESHOLD_NOT_IN = "threshold_not_in";
  @SerializedName(SERIALIZED_NAME_THRESHOLD_NOT_IN)
  private List<Double> thresholdNotIn = null;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private Double value;

  public static final String SERIALIZED_NAME_VALUE_GT = "value_gt";
  @SerializedName(SERIALIZED_NAME_VALUE_GT)
  private Double valueGt;

  public static final String SERIALIZED_NAME_VALUE_GTE = "value_gte";
  @SerializedName(SERIALIZED_NAME_VALUE_GTE)
  private Double valueGte;

  public static final String SERIALIZED_NAME_VALUE_IN = "value_in";
  @SerializedName(SERIALIZED_NAME_VALUE_IN)
  private List<Double> valueIn = null;

  public static final String SERIALIZED_NAME_VALUE_LT = "value_lt";
  @SerializedName(SERIALIZED_NAME_VALUE_LT)
  private Double valueLt;

  public static final String SERIALIZED_NAME_VALUE_LTE = "value_lte";
  @SerializedName(SERIALIZED_NAME_VALUE_LTE)
  private Double valueLte;

  public static final String SERIALIZED_NAME_VALUE_NOT = "value_not";
  @SerializedName(SERIALIZED_NAME_VALUE_NOT)
  private Double valueNot;

  public static final String SERIALIZED_NAME_VALUE_NOT_IN = "value_not_in";
  @SerializedName(SERIALIZED_NAME_VALUE_NOT_IN)
  private List<Double> valueNotIn = null;

  public static final String SERIALIZED_NAME_VMS_EVERY = "vms_every";
  @SerializedName(SERIALIZED_NAME_VMS_EVERY)
  private VmWhereInput vmsEvery;

  public static final String SERIALIZED_NAME_VMS_NONE = "vms_none";
  @SerializedName(SERIALIZED_NAME_VMS_NONE)
  private VmWhereInput vmsNone;

  public static final String SERIALIZED_NAME_VMS_SOME = "vms_some";
  @SerializedName(SERIALIZED_NAME_VMS_SOME)
  private VmWhereInput vmsSome;

  public AlertWhereInput() { 
  }

  public AlertWhereInput AND(List<AlertWhereInput> AND) {
    
    this.AND = AND;
    return this;
  }

  public AlertWhereInput addANDItem(AlertWhereInput ANDItem) {
    if (this.AND == null) {
      this.AND = new ArrayList<AlertWhereInput>();
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

  public List<AlertWhereInput> getAND() {
    return AND;
  }


  public void setAND(List<AlertWhereInput> AND) {
    this.AND = AND;
  }


  public AlertWhereInput NOT(List<AlertWhereInput> NOT) {
    
    this.NOT = NOT;
    return this;
  }

  public AlertWhereInput addNOTItem(AlertWhereInput NOTItem) {
    if (this.NOT == null) {
      this.NOT = new ArrayList<AlertWhereInput>();
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

  public List<AlertWhereInput> getNOT() {
    return NOT;
  }


  public void setNOT(List<AlertWhereInput> NOT) {
    this.NOT = NOT;
  }


  public AlertWhereInput OR(List<AlertWhereInput> OR) {
    
    this.OR = OR;
    return this;
  }

  public AlertWhereInput addORItem(AlertWhereInput ORItem) {
    if (this.OR == null) {
      this.OR = new ArrayList<AlertWhereInput>();
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

  public List<AlertWhereInput> getOR() {
    return OR;
  }


  public void setOR(List<AlertWhereInput> OR) {
    this.OR = OR;
  }


  public AlertWhereInput cause(String cause) {
    
    this.cause = cause;
    return this;
  }

   /**
   * Get cause
   * @return cause
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCause() {
    return cause;
  }


  public void setCause(String cause) {
    this.cause = cause;
  }


  public AlertWhereInput causeContains(String causeContains) {
    
    this.causeContains = causeContains;
    return this;
  }

   /**
   * Get causeContains
   * @return causeContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCauseContains() {
    return causeContains;
  }


  public void setCauseContains(String causeContains) {
    this.causeContains = causeContains;
  }


  public AlertWhereInput causeEndsWith(String causeEndsWith) {
    
    this.causeEndsWith = causeEndsWith;
    return this;
  }

   /**
   * Get causeEndsWith
   * @return causeEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCauseEndsWith() {
    return causeEndsWith;
  }


  public void setCauseEndsWith(String causeEndsWith) {
    this.causeEndsWith = causeEndsWith;
  }


  public AlertWhereInput causeGt(String causeGt) {
    
    this.causeGt = causeGt;
    return this;
  }

   /**
   * Get causeGt
   * @return causeGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCauseGt() {
    return causeGt;
  }


  public void setCauseGt(String causeGt) {
    this.causeGt = causeGt;
  }


  public AlertWhereInput causeGte(String causeGte) {
    
    this.causeGte = causeGte;
    return this;
  }

   /**
   * Get causeGte
   * @return causeGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCauseGte() {
    return causeGte;
  }


  public void setCauseGte(String causeGte) {
    this.causeGte = causeGte;
  }


  public AlertWhereInput causeIn(List<String> causeIn) {
    
    this.causeIn = causeIn;
    return this;
  }

  public AlertWhereInput addCauseInItem(String causeInItem) {
    if (this.causeIn == null) {
      this.causeIn = new ArrayList<String>();
    }
    this.causeIn.add(causeInItem);
    return this;
  }

   /**
   * Get causeIn
   * @return causeIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getCauseIn() {
    return causeIn;
  }


  public void setCauseIn(List<String> causeIn) {
    this.causeIn = causeIn;
  }


  public AlertWhereInput causeLt(String causeLt) {
    
    this.causeLt = causeLt;
    return this;
  }

   /**
   * Get causeLt
   * @return causeLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCauseLt() {
    return causeLt;
  }


  public void setCauseLt(String causeLt) {
    this.causeLt = causeLt;
  }


  public AlertWhereInput causeLte(String causeLte) {
    
    this.causeLte = causeLte;
    return this;
  }

   /**
   * Get causeLte
   * @return causeLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCauseLte() {
    return causeLte;
  }


  public void setCauseLte(String causeLte) {
    this.causeLte = causeLte;
  }


  public AlertWhereInput causeNot(String causeNot) {
    
    this.causeNot = causeNot;
    return this;
  }

   /**
   * Get causeNot
   * @return causeNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCauseNot() {
    return causeNot;
  }


  public void setCauseNot(String causeNot) {
    this.causeNot = causeNot;
  }


  public AlertWhereInput causeNotContains(String causeNotContains) {
    
    this.causeNotContains = causeNotContains;
    return this;
  }

   /**
   * Get causeNotContains
   * @return causeNotContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCauseNotContains() {
    return causeNotContains;
  }


  public void setCauseNotContains(String causeNotContains) {
    this.causeNotContains = causeNotContains;
  }


  public AlertWhereInput causeNotEndsWith(String causeNotEndsWith) {
    
    this.causeNotEndsWith = causeNotEndsWith;
    return this;
  }

   /**
   * Get causeNotEndsWith
   * @return causeNotEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCauseNotEndsWith() {
    return causeNotEndsWith;
  }


  public void setCauseNotEndsWith(String causeNotEndsWith) {
    this.causeNotEndsWith = causeNotEndsWith;
  }


  public AlertWhereInput causeNotIn(List<String> causeNotIn) {
    
    this.causeNotIn = causeNotIn;
    return this;
  }

  public AlertWhereInput addCauseNotInItem(String causeNotInItem) {
    if (this.causeNotIn == null) {
      this.causeNotIn = new ArrayList<String>();
    }
    this.causeNotIn.add(causeNotInItem);
    return this;
  }

   /**
   * Get causeNotIn
   * @return causeNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getCauseNotIn() {
    return causeNotIn;
  }


  public void setCauseNotIn(List<String> causeNotIn) {
    this.causeNotIn = causeNotIn;
  }


  public AlertWhereInput causeNotStartsWith(String causeNotStartsWith) {
    
    this.causeNotStartsWith = causeNotStartsWith;
    return this;
  }

   /**
   * Get causeNotStartsWith
   * @return causeNotStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCauseNotStartsWith() {
    return causeNotStartsWith;
  }


  public void setCauseNotStartsWith(String causeNotStartsWith) {
    this.causeNotStartsWith = causeNotStartsWith;
  }


  public AlertWhereInput causeStartsWith(String causeStartsWith) {
    
    this.causeStartsWith = causeStartsWith;
    return this;
  }

   /**
   * Get causeStartsWith
   * @return causeStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCauseStartsWith() {
    return causeStartsWith;
  }


  public void setCauseStartsWith(String causeStartsWith) {
    this.causeStartsWith = causeStartsWith;
  }


  public AlertWhereInput cluster(ClusterWhereInput cluster) {
    
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


  public AlertWhereInput createTime(String createTime) {
    
    this.createTime = createTime;
    return this;
  }

   /**
   * Get createTime
   * @return createTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCreateTime() {
    return createTime;
  }


  public void setCreateTime(String createTime) {
    this.createTime = createTime;
  }


  public AlertWhereInput createTimeGt(String createTimeGt) {
    
    this.createTimeGt = createTimeGt;
    return this;
  }

   /**
   * Get createTimeGt
   * @return createTimeGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCreateTimeGt() {
    return createTimeGt;
  }


  public void setCreateTimeGt(String createTimeGt) {
    this.createTimeGt = createTimeGt;
  }


  public AlertWhereInput createTimeGte(String createTimeGte) {
    
    this.createTimeGte = createTimeGte;
    return this;
  }

   /**
   * Get createTimeGte
   * @return createTimeGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCreateTimeGte() {
    return createTimeGte;
  }


  public void setCreateTimeGte(String createTimeGte) {
    this.createTimeGte = createTimeGte;
  }


  public AlertWhereInput createTimeIn(List<String> createTimeIn) {
    
    this.createTimeIn = createTimeIn;
    return this;
  }

  public AlertWhereInput addCreateTimeInItem(String createTimeInItem) {
    if (this.createTimeIn == null) {
      this.createTimeIn = new ArrayList<String>();
    }
    this.createTimeIn.add(createTimeInItem);
    return this;
  }

   /**
   * Get createTimeIn
   * @return createTimeIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getCreateTimeIn() {
    return createTimeIn;
  }


  public void setCreateTimeIn(List<String> createTimeIn) {
    this.createTimeIn = createTimeIn;
  }


  public AlertWhereInput createTimeLt(String createTimeLt) {
    
    this.createTimeLt = createTimeLt;
    return this;
  }

   /**
   * Get createTimeLt
   * @return createTimeLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCreateTimeLt() {
    return createTimeLt;
  }


  public void setCreateTimeLt(String createTimeLt) {
    this.createTimeLt = createTimeLt;
  }


  public AlertWhereInput createTimeLte(String createTimeLte) {
    
    this.createTimeLte = createTimeLte;
    return this;
  }

   /**
   * Get createTimeLte
   * @return createTimeLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCreateTimeLte() {
    return createTimeLte;
  }


  public void setCreateTimeLte(String createTimeLte) {
    this.createTimeLte = createTimeLte;
  }


  public AlertWhereInput createTimeNot(String createTimeNot) {
    
    this.createTimeNot = createTimeNot;
    return this;
  }

   /**
   * Get createTimeNot
   * @return createTimeNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCreateTimeNot() {
    return createTimeNot;
  }


  public void setCreateTimeNot(String createTimeNot) {
    this.createTimeNot = createTimeNot;
  }


  public AlertWhereInput createTimeNotIn(List<String> createTimeNotIn) {
    
    this.createTimeNotIn = createTimeNotIn;
    return this;
  }

  public AlertWhereInput addCreateTimeNotInItem(String createTimeNotInItem) {
    if (this.createTimeNotIn == null) {
      this.createTimeNotIn = new ArrayList<String>();
    }
    this.createTimeNotIn.add(createTimeNotInItem);
    return this;
  }

   /**
   * Get createTimeNotIn
   * @return createTimeNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getCreateTimeNotIn() {
    return createTimeNotIn;
  }


  public void setCreateTimeNotIn(List<String> createTimeNotIn) {
    this.createTimeNotIn = createTimeNotIn;
  }


  public AlertWhereInput ended(Boolean ended) {
    
    this.ended = ended;
    return this;
  }

   /**
   * Get ended
   * @return ended
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getEnded() {
    return ended;
  }


  public void setEnded(Boolean ended) {
    this.ended = ended;
  }


  public AlertWhereInput endedNot(Boolean endedNot) {
    
    this.endedNot = endedNot;
    return this;
  }

   /**
   * Get endedNot
   * @return endedNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getEndedNot() {
    return endedNot;
  }


  public void setEndedNot(Boolean endedNot) {
    this.endedNot = endedNot;
  }


  public AlertWhereInput host(HostWhereInput host) {
    
    this.host = host;
    return this;
  }

   /**
   * Get host
   * @return host
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public HostWhereInput getHost() {
    return host;
  }


  public void setHost(HostWhereInput host) {
    this.host = host;
  }


  public AlertWhereInput id(String id) {
    
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


  public AlertWhereInput idContains(String idContains) {
    
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


  public AlertWhereInput idEndsWith(String idEndsWith) {
    
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


  public AlertWhereInput idGt(String idGt) {
    
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


  public AlertWhereInput idGte(String idGte) {
    
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


  public AlertWhereInput idIn(List<String> idIn) {
    
    this.idIn = idIn;
    return this;
  }

  public AlertWhereInput addIdInItem(String idInItem) {
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


  public AlertWhereInput idLt(String idLt) {
    
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


  public AlertWhereInput idLte(String idLte) {
    
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


  public AlertWhereInput idNot(String idNot) {
    
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


  public AlertWhereInput idNotContains(String idNotContains) {
    
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


  public AlertWhereInput idNotEndsWith(String idNotEndsWith) {
    
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


  public AlertWhereInput idNotIn(List<String> idNotIn) {
    
    this.idNotIn = idNotIn;
    return this;
  }

  public AlertWhereInput addIdNotInItem(String idNotInItem) {
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


  public AlertWhereInput idNotStartsWith(String idNotStartsWith) {
    
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


  public AlertWhereInput idStartsWith(String idStartsWith) {
    
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


  public AlertWhereInput impact(String impact) {
    
    this.impact = impact;
    return this;
  }

   /**
   * Get impact
   * @return impact
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getImpact() {
    return impact;
  }


  public void setImpact(String impact) {
    this.impact = impact;
  }


  public AlertWhereInput impactContains(String impactContains) {
    
    this.impactContains = impactContains;
    return this;
  }

   /**
   * Get impactContains
   * @return impactContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getImpactContains() {
    return impactContains;
  }


  public void setImpactContains(String impactContains) {
    this.impactContains = impactContains;
  }


  public AlertWhereInput impactEndsWith(String impactEndsWith) {
    
    this.impactEndsWith = impactEndsWith;
    return this;
  }

   /**
   * Get impactEndsWith
   * @return impactEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getImpactEndsWith() {
    return impactEndsWith;
  }


  public void setImpactEndsWith(String impactEndsWith) {
    this.impactEndsWith = impactEndsWith;
  }


  public AlertWhereInput impactGt(String impactGt) {
    
    this.impactGt = impactGt;
    return this;
  }

   /**
   * Get impactGt
   * @return impactGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getImpactGt() {
    return impactGt;
  }


  public void setImpactGt(String impactGt) {
    this.impactGt = impactGt;
  }


  public AlertWhereInput impactGte(String impactGte) {
    
    this.impactGte = impactGte;
    return this;
  }

   /**
   * Get impactGte
   * @return impactGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getImpactGte() {
    return impactGte;
  }


  public void setImpactGte(String impactGte) {
    this.impactGte = impactGte;
  }


  public AlertWhereInput impactIn(List<String> impactIn) {
    
    this.impactIn = impactIn;
    return this;
  }

  public AlertWhereInput addImpactInItem(String impactInItem) {
    if (this.impactIn == null) {
      this.impactIn = new ArrayList<String>();
    }
    this.impactIn.add(impactInItem);
    return this;
  }

   /**
   * Get impactIn
   * @return impactIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getImpactIn() {
    return impactIn;
  }


  public void setImpactIn(List<String> impactIn) {
    this.impactIn = impactIn;
  }


  public AlertWhereInput impactLt(String impactLt) {
    
    this.impactLt = impactLt;
    return this;
  }

   /**
   * Get impactLt
   * @return impactLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getImpactLt() {
    return impactLt;
  }


  public void setImpactLt(String impactLt) {
    this.impactLt = impactLt;
  }


  public AlertWhereInput impactLte(String impactLte) {
    
    this.impactLte = impactLte;
    return this;
  }

   /**
   * Get impactLte
   * @return impactLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getImpactLte() {
    return impactLte;
  }


  public void setImpactLte(String impactLte) {
    this.impactLte = impactLte;
  }


  public AlertWhereInput impactNot(String impactNot) {
    
    this.impactNot = impactNot;
    return this;
  }

   /**
   * Get impactNot
   * @return impactNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getImpactNot() {
    return impactNot;
  }


  public void setImpactNot(String impactNot) {
    this.impactNot = impactNot;
  }


  public AlertWhereInput impactNotContains(String impactNotContains) {
    
    this.impactNotContains = impactNotContains;
    return this;
  }

   /**
   * Get impactNotContains
   * @return impactNotContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getImpactNotContains() {
    return impactNotContains;
  }


  public void setImpactNotContains(String impactNotContains) {
    this.impactNotContains = impactNotContains;
  }


  public AlertWhereInput impactNotEndsWith(String impactNotEndsWith) {
    
    this.impactNotEndsWith = impactNotEndsWith;
    return this;
  }

   /**
   * Get impactNotEndsWith
   * @return impactNotEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getImpactNotEndsWith() {
    return impactNotEndsWith;
  }


  public void setImpactNotEndsWith(String impactNotEndsWith) {
    this.impactNotEndsWith = impactNotEndsWith;
  }


  public AlertWhereInput impactNotIn(List<String> impactNotIn) {
    
    this.impactNotIn = impactNotIn;
    return this;
  }

  public AlertWhereInput addImpactNotInItem(String impactNotInItem) {
    if (this.impactNotIn == null) {
      this.impactNotIn = new ArrayList<String>();
    }
    this.impactNotIn.add(impactNotInItem);
    return this;
  }

   /**
   * Get impactNotIn
   * @return impactNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getImpactNotIn() {
    return impactNotIn;
  }


  public void setImpactNotIn(List<String> impactNotIn) {
    this.impactNotIn = impactNotIn;
  }


  public AlertWhereInput impactNotStartsWith(String impactNotStartsWith) {
    
    this.impactNotStartsWith = impactNotStartsWith;
    return this;
  }

   /**
   * Get impactNotStartsWith
   * @return impactNotStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getImpactNotStartsWith() {
    return impactNotStartsWith;
  }


  public void setImpactNotStartsWith(String impactNotStartsWith) {
    this.impactNotStartsWith = impactNotStartsWith;
  }


  public AlertWhereInput impactStartsWith(String impactStartsWith) {
    
    this.impactStartsWith = impactStartsWith;
    return this;
  }

   /**
   * Get impactStartsWith
   * @return impactStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getImpactStartsWith() {
    return impactStartsWith;
  }


  public void setImpactStartsWith(String impactStartsWith) {
    this.impactStartsWith = impactStartsWith;
  }


  public AlertWhereInput localCreateTime(String localCreateTime) {
    
    this.localCreateTime = localCreateTime;
    return this;
  }

   /**
   * Get localCreateTime
   * @return localCreateTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLocalCreateTime() {
    return localCreateTime;
  }


  public void setLocalCreateTime(String localCreateTime) {
    this.localCreateTime = localCreateTime;
  }


  public AlertWhereInput localCreateTimeGt(String localCreateTimeGt) {
    
    this.localCreateTimeGt = localCreateTimeGt;
    return this;
  }

   /**
   * Get localCreateTimeGt
   * @return localCreateTimeGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLocalCreateTimeGt() {
    return localCreateTimeGt;
  }


  public void setLocalCreateTimeGt(String localCreateTimeGt) {
    this.localCreateTimeGt = localCreateTimeGt;
  }


  public AlertWhereInput localCreateTimeGte(String localCreateTimeGte) {
    
    this.localCreateTimeGte = localCreateTimeGte;
    return this;
  }

   /**
   * Get localCreateTimeGte
   * @return localCreateTimeGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLocalCreateTimeGte() {
    return localCreateTimeGte;
  }


  public void setLocalCreateTimeGte(String localCreateTimeGte) {
    this.localCreateTimeGte = localCreateTimeGte;
  }


  public AlertWhereInput localCreateTimeIn(List<String> localCreateTimeIn) {
    
    this.localCreateTimeIn = localCreateTimeIn;
    return this;
  }

  public AlertWhereInput addLocalCreateTimeInItem(String localCreateTimeInItem) {
    if (this.localCreateTimeIn == null) {
      this.localCreateTimeIn = new ArrayList<String>();
    }
    this.localCreateTimeIn.add(localCreateTimeInItem);
    return this;
  }

   /**
   * Get localCreateTimeIn
   * @return localCreateTimeIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getLocalCreateTimeIn() {
    return localCreateTimeIn;
  }


  public void setLocalCreateTimeIn(List<String> localCreateTimeIn) {
    this.localCreateTimeIn = localCreateTimeIn;
  }


  public AlertWhereInput localCreateTimeLt(String localCreateTimeLt) {
    
    this.localCreateTimeLt = localCreateTimeLt;
    return this;
  }

   /**
   * Get localCreateTimeLt
   * @return localCreateTimeLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLocalCreateTimeLt() {
    return localCreateTimeLt;
  }


  public void setLocalCreateTimeLt(String localCreateTimeLt) {
    this.localCreateTimeLt = localCreateTimeLt;
  }


  public AlertWhereInput localCreateTimeLte(String localCreateTimeLte) {
    
    this.localCreateTimeLte = localCreateTimeLte;
    return this;
  }

   /**
   * Get localCreateTimeLte
   * @return localCreateTimeLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLocalCreateTimeLte() {
    return localCreateTimeLte;
  }


  public void setLocalCreateTimeLte(String localCreateTimeLte) {
    this.localCreateTimeLte = localCreateTimeLte;
  }


  public AlertWhereInput localCreateTimeNot(String localCreateTimeNot) {
    
    this.localCreateTimeNot = localCreateTimeNot;
    return this;
  }

   /**
   * Get localCreateTimeNot
   * @return localCreateTimeNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLocalCreateTimeNot() {
    return localCreateTimeNot;
  }


  public void setLocalCreateTimeNot(String localCreateTimeNot) {
    this.localCreateTimeNot = localCreateTimeNot;
  }


  public AlertWhereInput localCreateTimeNotIn(List<String> localCreateTimeNotIn) {
    
    this.localCreateTimeNotIn = localCreateTimeNotIn;
    return this;
  }

  public AlertWhereInput addLocalCreateTimeNotInItem(String localCreateTimeNotInItem) {
    if (this.localCreateTimeNotIn == null) {
      this.localCreateTimeNotIn = new ArrayList<String>();
    }
    this.localCreateTimeNotIn.add(localCreateTimeNotInItem);
    return this;
  }

   /**
   * Get localCreateTimeNotIn
   * @return localCreateTimeNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getLocalCreateTimeNotIn() {
    return localCreateTimeNotIn;
  }


  public void setLocalCreateTimeNotIn(List<String> localCreateTimeNotIn) {
    this.localCreateTimeNotIn = localCreateTimeNotIn;
  }


  public AlertWhereInput localEndTime(String localEndTime) {
    
    this.localEndTime = localEndTime;
    return this;
  }

   /**
   * Get localEndTime
   * @return localEndTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLocalEndTime() {
    return localEndTime;
  }


  public void setLocalEndTime(String localEndTime) {
    this.localEndTime = localEndTime;
  }


  public AlertWhereInput localEndTimeContains(String localEndTimeContains) {
    
    this.localEndTimeContains = localEndTimeContains;
    return this;
  }

   /**
   * Get localEndTimeContains
   * @return localEndTimeContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLocalEndTimeContains() {
    return localEndTimeContains;
  }


  public void setLocalEndTimeContains(String localEndTimeContains) {
    this.localEndTimeContains = localEndTimeContains;
  }


  public AlertWhereInput localEndTimeEndsWith(String localEndTimeEndsWith) {
    
    this.localEndTimeEndsWith = localEndTimeEndsWith;
    return this;
  }

   /**
   * Get localEndTimeEndsWith
   * @return localEndTimeEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLocalEndTimeEndsWith() {
    return localEndTimeEndsWith;
  }


  public void setLocalEndTimeEndsWith(String localEndTimeEndsWith) {
    this.localEndTimeEndsWith = localEndTimeEndsWith;
  }


  public AlertWhereInput localEndTimeGt(String localEndTimeGt) {
    
    this.localEndTimeGt = localEndTimeGt;
    return this;
  }

   /**
   * Get localEndTimeGt
   * @return localEndTimeGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLocalEndTimeGt() {
    return localEndTimeGt;
  }


  public void setLocalEndTimeGt(String localEndTimeGt) {
    this.localEndTimeGt = localEndTimeGt;
  }


  public AlertWhereInput localEndTimeGte(String localEndTimeGte) {
    
    this.localEndTimeGte = localEndTimeGte;
    return this;
  }

   /**
   * Get localEndTimeGte
   * @return localEndTimeGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLocalEndTimeGte() {
    return localEndTimeGte;
  }


  public void setLocalEndTimeGte(String localEndTimeGte) {
    this.localEndTimeGte = localEndTimeGte;
  }


  public AlertWhereInput localEndTimeIn(List<String> localEndTimeIn) {
    
    this.localEndTimeIn = localEndTimeIn;
    return this;
  }

  public AlertWhereInput addLocalEndTimeInItem(String localEndTimeInItem) {
    if (this.localEndTimeIn == null) {
      this.localEndTimeIn = new ArrayList<String>();
    }
    this.localEndTimeIn.add(localEndTimeInItem);
    return this;
  }

   /**
   * Get localEndTimeIn
   * @return localEndTimeIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getLocalEndTimeIn() {
    return localEndTimeIn;
  }


  public void setLocalEndTimeIn(List<String> localEndTimeIn) {
    this.localEndTimeIn = localEndTimeIn;
  }


  public AlertWhereInput localEndTimeLt(String localEndTimeLt) {
    
    this.localEndTimeLt = localEndTimeLt;
    return this;
  }

   /**
   * Get localEndTimeLt
   * @return localEndTimeLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLocalEndTimeLt() {
    return localEndTimeLt;
  }


  public void setLocalEndTimeLt(String localEndTimeLt) {
    this.localEndTimeLt = localEndTimeLt;
  }


  public AlertWhereInput localEndTimeLte(String localEndTimeLte) {
    
    this.localEndTimeLte = localEndTimeLte;
    return this;
  }

   /**
   * Get localEndTimeLte
   * @return localEndTimeLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLocalEndTimeLte() {
    return localEndTimeLte;
  }


  public void setLocalEndTimeLte(String localEndTimeLte) {
    this.localEndTimeLte = localEndTimeLte;
  }


  public AlertWhereInput localEndTimeNot(String localEndTimeNot) {
    
    this.localEndTimeNot = localEndTimeNot;
    return this;
  }

   /**
   * Get localEndTimeNot
   * @return localEndTimeNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLocalEndTimeNot() {
    return localEndTimeNot;
  }


  public void setLocalEndTimeNot(String localEndTimeNot) {
    this.localEndTimeNot = localEndTimeNot;
  }


  public AlertWhereInput localEndTimeNotContains(String localEndTimeNotContains) {
    
    this.localEndTimeNotContains = localEndTimeNotContains;
    return this;
  }

   /**
   * Get localEndTimeNotContains
   * @return localEndTimeNotContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLocalEndTimeNotContains() {
    return localEndTimeNotContains;
  }


  public void setLocalEndTimeNotContains(String localEndTimeNotContains) {
    this.localEndTimeNotContains = localEndTimeNotContains;
  }


  public AlertWhereInput localEndTimeNotEndsWith(String localEndTimeNotEndsWith) {
    
    this.localEndTimeNotEndsWith = localEndTimeNotEndsWith;
    return this;
  }

   /**
   * Get localEndTimeNotEndsWith
   * @return localEndTimeNotEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLocalEndTimeNotEndsWith() {
    return localEndTimeNotEndsWith;
  }


  public void setLocalEndTimeNotEndsWith(String localEndTimeNotEndsWith) {
    this.localEndTimeNotEndsWith = localEndTimeNotEndsWith;
  }


  public AlertWhereInput localEndTimeNotIn(List<String> localEndTimeNotIn) {
    
    this.localEndTimeNotIn = localEndTimeNotIn;
    return this;
  }

  public AlertWhereInput addLocalEndTimeNotInItem(String localEndTimeNotInItem) {
    if (this.localEndTimeNotIn == null) {
      this.localEndTimeNotIn = new ArrayList<String>();
    }
    this.localEndTimeNotIn.add(localEndTimeNotInItem);
    return this;
  }

   /**
   * Get localEndTimeNotIn
   * @return localEndTimeNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getLocalEndTimeNotIn() {
    return localEndTimeNotIn;
  }


  public void setLocalEndTimeNotIn(List<String> localEndTimeNotIn) {
    this.localEndTimeNotIn = localEndTimeNotIn;
  }


  public AlertWhereInput localEndTimeNotStartsWith(String localEndTimeNotStartsWith) {
    
    this.localEndTimeNotStartsWith = localEndTimeNotStartsWith;
    return this;
  }

   /**
   * Get localEndTimeNotStartsWith
   * @return localEndTimeNotStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLocalEndTimeNotStartsWith() {
    return localEndTimeNotStartsWith;
  }


  public void setLocalEndTimeNotStartsWith(String localEndTimeNotStartsWith) {
    this.localEndTimeNotStartsWith = localEndTimeNotStartsWith;
  }


  public AlertWhereInput localEndTimeStartsWith(String localEndTimeStartsWith) {
    
    this.localEndTimeStartsWith = localEndTimeStartsWith;
    return this;
  }

   /**
   * Get localEndTimeStartsWith
   * @return localEndTimeStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLocalEndTimeStartsWith() {
    return localEndTimeStartsWith;
  }


  public void setLocalEndTimeStartsWith(String localEndTimeStartsWith) {
    this.localEndTimeStartsWith = localEndTimeStartsWith;
  }


  public AlertWhereInput localId(String localId) {
    
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


  public AlertWhereInput localIdContains(String localIdContains) {
    
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


  public AlertWhereInput localIdEndsWith(String localIdEndsWith) {
    
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


  public AlertWhereInput localIdGt(String localIdGt) {
    
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


  public AlertWhereInput localIdGte(String localIdGte) {
    
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


  public AlertWhereInput localIdIn(List<String> localIdIn) {
    
    this.localIdIn = localIdIn;
    return this;
  }

  public AlertWhereInput addLocalIdInItem(String localIdInItem) {
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


  public AlertWhereInput localIdLt(String localIdLt) {
    
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


  public AlertWhereInput localIdLte(String localIdLte) {
    
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


  public AlertWhereInput localIdNot(String localIdNot) {
    
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


  public AlertWhereInput localIdNotContains(String localIdNotContains) {
    
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


  public AlertWhereInput localIdNotEndsWith(String localIdNotEndsWith) {
    
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


  public AlertWhereInput localIdNotIn(List<String> localIdNotIn) {
    
    this.localIdNotIn = localIdNotIn;
    return this;
  }

  public AlertWhereInput addLocalIdNotInItem(String localIdNotInItem) {
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


  public AlertWhereInput localIdNotStartsWith(String localIdNotStartsWith) {
    
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


  public AlertWhereInput localIdStartsWith(String localIdStartsWith) {
    
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


  public AlertWhereInput localStartTime(String localStartTime) {
    
    this.localStartTime = localStartTime;
    return this;
  }

   /**
   * Get localStartTime
   * @return localStartTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLocalStartTime() {
    return localStartTime;
  }


  public void setLocalStartTime(String localStartTime) {
    this.localStartTime = localStartTime;
  }


  public AlertWhereInput localStartTimeContains(String localStartTimeContains) {
    
    this.localStartTimeContains = localStartTimeContains;
    return this;
  }

   /**
   * Get localStartTimeContains
   * @return localStartTimeContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLocalStartTimeContains() {
    return localStartTimeContains;
  }


  public void setLocalStartTimeContains(String localStartTimeContains) {
    this.localStartTimeContains = localStartTimeContains;
  }


  public AlertWhereInput localStartTimeEndsWith(String localStartTimeEndsWith) {
    
    this.localStartTimeEndsWith = localStartTimeEndsWith;
    return this;
  }

   /**
   * Get localStartTimeEndsWith
   * @return localStartTimeEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLocalStartTimeEndsWith() {
    return localStartTimeEndsWith;
  }


  public void setLocalStartTimeEndsWith(String localStartTimeEndsWith) {
    this.localStartTimeEndsWith = localStartTimeEndsWith;
  }


  public AlertWhereInput localStartTimeGt(String localStartTimeGt) {
    
    this.localStartTimeGt = localStartTimeGt;
    return this;
  }

   /**
   * Get localStartTimeGt
   * @return localStartTimeGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLocalStartTimeGt() {
    return localStartTimeGt;
  }


  public void setLocalStartTimeGt(String localStartTimeGt) {
    this.localStartTimeGt = localStartTimeGt;
  }


  public AlertWhereInput localStartTimeGte(String localStartTimeGte) {
    
    this.localStartTimeGte = localStartTimeGte;
    return this;
  }

   /**
   * Get localStartTimeGte
   * @return localStartTimeGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLocalStartTimeGte() {
    return localStartTimeGte;
  }


  public void setLocalStartTimeGte(String localStartTimeGte) {
    this.localStartTimeGte = localStartTimeGte;
  }


  public AlertWhereInput localStartTimeIn(List<String> localStartTimeIn) {
    
    this.localStartTimeIn = localStartTimeIn;
    return this;
  }

  public AlertWhereInput addLocalStartTimeInItem(String localStartTimeInItem) {
    if (this.localStartTimeIn == null) {
      this.localStartTimeIn = new ArrayList<String>();
    }
    this.localStartTimeIn.add(localStartTimeInItem);
    return this;
  }

   /**
   * Get localStartTimeIn
   * @return localStartTimeIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getLocalStartTimeIn() {
    return localStartTimeIn;
  }


  public void setLocalStartTimeIn(List<String> localStartTimeIn) {
    this.localStartTimeIn = localStartTimeIn;
  }


  public AlertWhereInput localStartTimeLt(String localStartTimeLt) {
    
    this.localStartTimeLt = localStartTimeLt;
    return this;
  }

   /**
   * Get localStartTimeLt
   * @return localStartTimeLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLocalStartTimeLt() {
    return localStartTimeLt;
  }


  public void setLocalStartTimeLt(String localStartTimeLt) {
    this.localStartTimeLt = localStartTimeLt;
  }


  public AlertWhereInput localStartTimeLte(String localStartTimeLte) {
    
    this.localStartTimeLte = localStartTimeLte;
    return this;
  }

   /**
   * Get localStartTimeLte
   * @return localStartTimeLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLocalStartTimeLte() {
    return localStartTimeLte;
  }


  public void setLocalStartTimeLte(String localStartTimeLte) {
    this.localStartTimeLte = localStartTimeLte;
  }


  public AlertWhereInput localStartTimeNot(String localStartTimeNot) {
    
    this.localStartTimeNot = localStartTimeNot;
    return this;
  }

   /**
   * Get localStartTimeNot
   * @return localStartTimeNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLocalStartTimeNot() {
    return localStartTimeNot;
  }


  public void setLocalStartTimeNot(String localStartTimeNot) {
    this.localStartTimeNot = localStartTimeNot;
  }


  public AlertWhereInput localStartTimeNotContains(String localStartTimeNotContains) {
    
    this.localStartTimeNotContains = localStartTimeNotContains;
    return this;
  }

   /**
   * Get localStartTimeNotContains
   * @return localStartTimeNotContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLocalStartTimeNotContains() {
    return localStartTimeNotContains;
  }


  public void setLocalStartTimeNotContains(String localStartTimeNotContains) {
    this.localStartTimeNotContains = localStartTimeNotContains;
  }


  public AlertWhereInput localStartTimeNotEndsWith(String localStartTimeNotEndsWith) {
    
    this.localStartTimeNotEndsWith = localStartTimeNotEndsWith;
    return this;
  }

   /**
   * Get localStartTimeNotEndsWith
   * @return localStartTimeNotEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLocalStartTimeNotEndsWith() {
    return localStartTimeNotEndsWith;
  }


  public void setLocalStartTimeNotEndsWith(String localStartTimeNotEndsWith) {
    this.localStartTimeNotEndsWith = localStartTimeNotEndsWith;
  }


  public AlertWhereInput localStartTimeNotIn(List<String> localStartTimeNotIn) {
    
    this.localStartTimeNotIn = localStartTimeNotIn;
    return this;
  }

  public AlertWhereInput addLocalStartTimeNotInItem(String localStartTimeNotInItem) {
    if (this.localStartTimeNotIn == null) {
      this.localStartTimeNotIn = new ArrayList<String>();
    }
    this.localStartTimeNotIn.add(localStartTimeNotInItem);
    return this;
  }

   /**
   * Get localStartTimeNotIn
   * @return localStartTimeNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getLocalStartTimeNotIn() {
    return localStartTimeNotIn;
  }


  public void setLocalStartTimeNotIn(List<String> localStartTimeNotIn) {
    this.localStartTimeNotIn = localStartTimeNotIn;
  }


  public AlertWhereInput localStartTimeNotStartsWith(String localStartTimeNotStartsWith) {
    
    this.localStartTimeNotStartsWith = localStartTimeNotStartsWith;
    return this;
  }

   /**
   * Get localStartTimeNotStartsWith
   * @return localStartTimeNotStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLocalStartTimeNotStartsWith() {
    return localStartTimeNotStartsWith;
  }


  public void setLocalStartTimeNotStartsWith(String localStartTimeNotStartsWith) {
    this.localStartTimeNotStartsWith = localStartTimeNotStartsWith;
  }


  public AlertWhereInput localStartTimeStartsWith(String localStartTimeStartsWith) {
    
    this.localStartTimeStartsWith = localStartTimeStartsWith;
    return this;
  }

   /**
   * Get localStartTimeStartsWith
   * @return localStartTimeStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLocalStartTimeStartsWith() {
    return localStartTimeStartsWith;
  }


  public void setLocalStartTimeStartsWith(String localStartTimeStartsWith) {
    this.localStartTimeStartsWith = localStartTimeStartsWith;
  }


  public AlertWhereInput localUpdateTime(String localUpdateTime) {
    
    this.localUpdateTime = localUpdateTime;
    return this;
  }

   /**
   * Get localUpdateTime
   * @return localUpdateTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLocalUpdateTime() {
    return localUpdateTime;
  }


  public void setLocalUpdateTime(String localUpdateTime) {
    this.localUpdateTime = localUpdateTime;
  }


  public AlertWhereInput localUpdateTimeContains(String localUpdateTimeContains) {
    
    this.localUpdateTimeContains = localUpdateTimeContains;
    return this;
  }

   /**
   * Get localUpdateTimeContains
   * @return localUpdateTimeContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLocalUpdateTimeContains() {
    return localUpdateTimeContains;
  }


  public void setLocalUpdateTimeContains(String localUpdateTimeContains) {
    this.localUpdateTimeContains = localUpdateTimeContains;
  }


  public AlertWhereInput localUpdateTimeEndsWith(String localUpdateTimeEndsWith) {
    
    this.localUpdateTimeEndsWith = localUpdateTimeEndsWith;
    return this;
  }

   /**
   * Get localUpdateTimeEndsWith
   * @return localUpdateTimeEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLocalUpdateTimeEndsWith() {
    return localUpdateTimeEndsWith;
  }


  public void setLocalUpdateTimeEndsWith(String localUpdateTimeEndsWith) {
    this.localUpdateTimeEndsWith = localUpdateTimeEndsWith;
  }


  public AlertWhereInput localUpdateTimeGt(String localUpdateTimeGt) {
    
    this.localUpdateTimeGt = localUpdateTimeGt;
    return this;
  }

   /**
   * Get localUpdateTimeGt
   * @return localUpdateTimeGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLocalUpdateTimeGt() {
    return localUpdateTimeGt;
  }


  public void setLocalUpdateTimeGt(String localUpdateTimeGt) {
    this.localUpdateTimeGt = localUpdateTimeGt;
  }


  public AlertWhereInput localUpdateTimeGte(String localUpdateTimeGte) {
    
    this.localUpdateTimeGte = localUpdateTimeGte;
    return this;
  }

   /**
   * Get localUpdateTimeGte
   * @return localUpdateTimeGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLocalUpdateTimeGte() {
    return localUpdateTimeGte;
  }


  public void setLocalUpdateTimeGte(String localUpdateTimeGte) {
    this.localUpdateTimeGte = localUpdateTimeGte;
  }


  public AlertWhereInput localUpdateTimeIn(List<String> localUpdateTimeIn) {
    
    this.localUpdateTimeIn = localUpdateTimeIn;
    return this;
  }

  public AlertWhereInput addLocalUpdateTimeInItem(String localUpdateTimeInItem) {
    if (this.localUpdateTimeIn == null) {
      this.localUpdateTimeIn = new ArrayList<String>();
    }
    this.localUpdateTimeIn.add(localUpdateTimeInItem);
    return this;
  }

   /**
   * Get localUpdateTimeIn
   * @return localUpdateTimeIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getLocalUpdateTimeIn() {
    return localUpdateTimeIn;
  }


  public void setLocalUpdateTimeIn(List<String> localUpdateTimeIn) {
    this.localUpdateTimeIn = localUpdateTimeIn;
  }


  public AlertWhereInput localUpdateTimeLt(String localUpdateTimeLt) {
    
    this.localUpdateTimeLt = localUpdateTimeLt;
    return this;
  }

   /**
   * Get localUpdateTimeLt
   * @return localUpdateTimeLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLocalUpdateTimeLt() {
    return localUpdateTimeLt;
  }


  public void setLocalUpdateTimeLt(String localUpdateTimeLt) {
    this.localUpdateTimeLt = localUpdateTimeLt;
  }


  public AlertWhereInput localUpdateTimeLte(String localUpdateTimeLte) {
    
    this.localUpdateTimeLte = localUpdateTimeLte;
    return this;
  }

   /**
   * Get localUpdateTimeLte
   * @return localUpdateTimeLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLocalUpdateTimeLte() {
    return localUpdateTimeLte;
  }


  public void setLocalUpdateTimeLte(String localUpdateTimeLte) {
    this.localUpdateTimeLte = localUpdateTimeLte;
  }


  public AlertWhereInput localUpdateTimeNot(String localUpdateTimeNot) {
    
    this.localUpdateTimeNot = localUpdateTimeNot;
    return this;
  }

   /**
   * Get localUpdateTimeNot
   * @return localUpdateTimeNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLocalUpdateTimeNot() {
    return localUpdateTimeNot;
  }


  public void setLocalUpdateTimeNot(String localUpdateTimeNot) {
    this.localUpdateTimeNot = localUpdateTimeNot;
  }


  public AlertWhereInput localUpdateTimeNotContains(String localUpdateTimeNotContains) {
    
    this.localUpdateTimeNotContains = localUpdateTimeNotContains;
    return this;
  }

   /**
   * Get localUpdateTimeNotContains
   * @return localUpdateTimeNotContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLocalUpdateTimeNotContains() {
    return localUpdateTimeNotContains;
  }


  public void setLocalUpdateTimeNotContains(String localUpdateTimeNotContains) {
    this.localUpdateTimeNotContains = localUpdateTimeNotContains;
  }


  public AlertWhereInput localUpdateTimeNotEndsWith(String localUpdateTimeNotEndsWith) {
    
    this.localUpdateTimeNotEndsWith = localUpdateTimeNotEndsWith;
    return this;
  }

   /**
   * Get localUpdateTimeNotEndsWith
   * @return localUpdateTimeNotEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLocalUpdateTimeNotEndsWith() {
    return localUpdateTimeNotEndsWith;
  }


  public void setLocalUpdateTimeNotEndsWith(String localUpdateTimeNotEndsWith) {
    this.localUpdateTimeNotEndsWith = localUpdateTimeNotEndsWith;
  }


  public AlertWhereInput localUpdateTimeNotIn(List<String> localUpdateTimeNotIn) {
    
    this.localUpdateTimeNotIn = localUpdateTimeNotIn;
    return this;
  }

  public AlertWhereInput addLocalUpdateTimeNotInItem(String localUpdateTimeNotInItem) {
    if (this.localUpdateTimeNotIn == null) {
      this.localUpdateTimeNotIn = new ArrayList<String>();
    }
    this.localUpdateTimeNotIn.add(localUpdateTimeNotInItem);
    return this;
  }

   /**
   * Get localUpdateTimeNotIn
   * @return localUpdateTimeNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getLocalUpdateTimeNotIn() {
    return localUpdateTimeNotIn;
  }


  public void setLocalUpdateTimeNotIn(List<String> localUpdateTimeNotIn) {
    this.localUpdateTimeNotIn = localUpdateTimeNotIn;
  }


  public AlertWhereInput localUpdateTimeNotStartsWith(String localUpdateTimeNotStartsWith) {
    
    this.localUpdateTimeNotStartsWith = localUpdateTimeNotStartsWith;
    return this;
  }

   /**
   * Get localUpdateTimeNotStartsWith
   * @return localUpdateTimeNotStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLocalUpdateTimeNotStartsWith() {
    return localUpdateTimeNotStartsWith;
  }


  public void setLocalUpdateTimeNotStartsWith(String localUpdateTimeNotStartsWith) {
    this.localUpdateTimeNotStartsWith = localUpdateTimeNotStartsWith;
  }


  public AlertWhereInput localUpdateTimeStartsWith(String localUpdateTimeStartsWith) {
    
    this.localUpdateTimeStartsWith = localUpdateTimeStartsWith;
    return this;
  }

   /**
   * Get localUpdateTimeStartsWith
   * @return localUpdateTimeStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLocalUpdateTimeStartsWith() {
    return localUpdateTimeStartsWith;
  }


  public void setLocalUpdateTimeStartsWith(String localUpdateTimeStartsWith) {
    this.localUpdateTimeStartsWith = localUpdateTimeStartsWith;
  }


  public AlertWhereInput message(String message) {
    
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


  public AlertWhereInput messageContains(String messageContains) {
    
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


  public AlertWhereInput messageEndsWith(String messageEndsWith) {
    
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


  public AlertWhereInput messageGt(String messageGt) {
    
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


  public AlertWhereInput messageGte(String messageGte) {
    
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


  public AlertWhereInput messageIn(List<String> messageIn) {
    
    this.messageIn = messageIn;
    return this;
  }

  public AlertWhereInput addMessageInItem(String messageInItem) {
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


  public AlertWhereInput messageLt(String messageLt) {
    
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


  public AlertWhereInput messageLte(String messageLte) {
    
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


  public AlertWhereInput messageNot(String messageNot) {
    
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


  public AlertWhereInput messageNotContains(String messageNotContains) {
    
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


  public AlertWhereInput messageNotEndsWith(String messageNotEndsWith) {
    
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


  public AlertWhereInput messageNotIn(List<String> messageNotIn) {
    
    this.messageNotIn = messageNotIn;
    return this;
  }

  public AlertWhereInput addMessageNotInItem(String messageNotInItem) {
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


  public AlertWhereInput messageNotStartsWith(String messageNotStartsWith) {
    
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


  public AlertWhereInput messageStartsWith(String messageStartsWith) {
    
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


  public AlertWhereInput severity(String severity) {
    
    this.severity = severity;
    return this;
  }

   /**
   * Get severity
   * @return severity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSeverity() {
    return severity;
  }


  public void setSeverity(String severity) {
    this.severity = severity;
  }


  public AlertWhereInput severityContains(String severityContains) {
    
    this.severityContains = severityContains;
    return this;
  }

   /**
   * Get severityContains
   * @return severityContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSeverityContains() {
    return severityContains;
  }


  public void setSeverityContains(String severityContains) {
    this.severityContains = severityContains;
  }


  public AlertWhereInput severityEndsWith(String severityEndsWith) {
    
    this.severityEndsWith = severityEndsWith;
    return this;
  }

   /**
   * Get severityEndsWith
   * @return severityEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSeverityEndsWith() {
    return severityEndsWith;
  }


  public void setSeverityEndsWith(String severityEndsWith) {
    this.severityEndsWith = severityEndsWith;
  }


  public AlertWhereInput severityGt(String severityGt) {
    
    this.severityGt = severityGt;
    return this;
  }

   /**
   * Get severityGt
   * @return severityGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSeverityGt() {
    return severityGt;
  }


  public void setSeverityGt(String severityGt) {
    this.severityGt = severityGt;
  }


  public AlertWhereInput severityGte(String severityGte) {
    
    this.severityGte = severityGte;
    return this;
  }

   /**
   * Get severityGte
   * @return severityGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSeverityGte() {
    return severityGte;
  }


  public void setSeverityGte(String severityGte) {
    this.severityGte = severityGte;
  }


  public AlertWhereInput severityIn(List<String> severityIn) {
    
    this.severityIn = severityIn;
    return this;
  }

  public AlertWhereInput addSeverityInItem(String severityInItem) {
    if (this.severityIn == null) {
      this.severityIn = new ArrayList<String>();
    }
    this.severityIn.add(severityInItem);
    return this;
  }

   /**
   * Get severityIn
   * @return severityIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getSeverityIn() {
    return severityIn;
  }


  public void setSeverityIn(List<String> severityIn) {
    this.severityIn = severityIn;
  }


  public AlertWhereInput severityLt(String severityLt) {
    
    this.severityLt = severityLt;
    return this;
  }

   /**
   * Get severityLt
   * @return severityLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSeverityLt() {
    return severityLt;
  }


  public void setSeverityLt(String severityLt) {
    this.severityLt = severityLt;
  }


  public AlertWhereInput severityLte(String severityLte) {
    
    this.severityLte = severityLte;
    return this;
  }

   /**
   * Get severityLte
   * @return severityLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSeverityLte() {
    return severityLte;
  }


  public void setSeverityLte(String severityLte) {
    this.severityLte = severityLte;
  }


  public AlertWhereInput severityNot(String severityNot) {
    
    this.severityNot = severityNot;
    return this;
  }

   /**
   * Get severityNot
   * @return severityNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSeverityNot() {
    return severityNot;
  }


  public void setSeverityNot(String severityNot) {
    this.severityNot = severityNot;
  }


  public AlertWhereInput severityNotContains(String severityNotContains) {
    
    this.severityNotContains = severityNotContains;
    return this;
  }

   /**
   * Get severityNotContains
   * @return severityNotContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSeverityNotContains() {
    return severityNotContains;
  }


  public void setSeverityNotContains(String severityNotContains) {
    this.severityNotContains = severityNotContains;
  }


  public AlertWhereInput severityNotEndsWith(String severityNotEndsWith) {
    
    this.severityNotEndsWith = severityNotEndsWith;
    return this;
  }

   /**
   * Get severityNotEndsWith
   * @return severityNotEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSeverityNotEndsWith() {
    return severityNotEndsWith;
  }


  public void setSeverityNotEndsWith(String severityNotEndsWith) {
    this.severityNotEndsWith = severityNotEndsWith;
  }


  public AlertWhereInput severityNotIn(List<String> severityNotIn) {
    
    this.severityNotIn = severityNotIn;
    return this;
  }

  public AlertWhereInput addSeverityNotInItem(String severityNotInItem) {
    if (this.severityNotIn == null) {
      this.severityNotIn = new ArrayList<String>();
    }
    this.severityNotIn.add(severityNotInItem);
    return this;
  }

   /**
   * Get severityNotIn
   * @return severityNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getSeverityNotIn() {
    return severityNotIn;
  }


  public void setSeverityNotIn(List<String> severityNotIn) {
    this.severityNotIn = severityNotIn;
  }


  public AlertWhereInput severityNotStartsWith(String severityNotStartsWith) {
    
    this.severityNotStartsWith = severityNotStartsWith;
    return this;
  }

   /**
   * Get severityNotStartsWith
   * @return severityNotStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSeverityNotStartsWith() {
    return severityNotStartsWith;
  }


  public void setSeverityNotStartsWith(String severityNotStartsWith) {
    this.severityNotStartsWith = severityNotStartsWith;
  }


  public AlertWhereInput severityStartsWith(String severityStartsWith) {
    
    this.severityStartsWith = severityStartsWith;
    return this;
  }

   /**
   * Get severityStartsWith
   * @return severityStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSeverityStartsWith() {
    return severityStartsWith;
  }


  public void setSeverityStartsWith(String severityStartsWith) {
    this.severityStartsWith = severityStartsWith;
  }


  public AlertWhereInput solution(String solution) {
    
    this.solution = solution;
    return this;
  }

   /**
   * Get solution
   * @return solution
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSolution() {
    return solution;
  }


  public void setSolution(String solution) {
    this.solution = solution;
  }


  public AlertWhereInput solutionContains(String solutionContains) {
    
    this.solutionContains = solutionContains;
    return this;
  }

   /**
   * Get solutionContains
   * @return solutionContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSolutionContains() {
    return solutionContains;
  }


  public void setSolutionContains(String solutionContains) {
    this.solutionContains = solutionContains;
  }


  public AlertWhereInput solutionEndsWith(String solutionEndsWith) {
    
    this.solutionEndsWith = solutionEndsWith;
    return this;
  }

   /**
   * Get solutionEndsWith
   * @return solutionEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSolutionEndsWith() {
    return solutionEndsWith;
  }


  public void setSolutionEndsWith(String solutionEndsWith) {
    this.solutionEndsWith = solutionEndsWith;
  }


  public AlertWhereInput solutionGt(String solutionGt) {
    
    this.solutionGt = solutionGt;
    return this;
  }

   /**
   * Get solutionGt
   * @return solutionGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSolutionGt() {
    return solutionGt;
  }


  public void setSolutionGt(String solutionGt) {
    this.solutionGt = solutionGt;
  }


  public AlertWhereInput solutionGte(String solutionGte) {
    
    this.solutionGte = solutionGte;
    return this;
  }

   /**
   * Get solutionGte
   * @return solutionGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSolutionGte() {
    return solutionGte;
  }


  public void setSolutionGte(String solutionGte) {
    this.solutionGte = solutionGte;
  }


  public AlertWhereInput solutionIn(List<String> solutionIn) {
    
    this.solutionIn = solutionIn;
    return this;
  }

  public AlertWhereInput addSolutionInItem(String solutionInItem) {
    if (this.solutionIn == null) {
      this.solutionIn = new ArrayList<String>();
    }
    this.solutionIn.add(solutionInItem);
    return this;
  }

   /**
   * Get solutionIn
   * @return solutionIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getSolutionIn() {
    return solutionIn;
  }


  public void setSolutionIn(List<String> solutionIn) {
    this.solutionIn = solutionIn;
  }


  public AlertWhereInput solutionLt(String solutionLt) {
    
    this.solutionLt = solutionLt;
    return this;
  }

   /**
   * Get solutionLt
   * @return solutionLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSolutionLt() {
    return solutionLt;
  }


  public void setSolutionLt(String solutionLt) {
    this.solutionLt = solutionLt;
  }


  public AlertWhereInput solutionLte(String solutionLte) {
    
    this.solutionLte = solutionLte;
    return this;
  }

   /**
   * Get solutionLte
   * @return solutionLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSolutionLte() {
    return solutionLte;
  }


  public void setSolutionLte(String solutionLte) {
    this.solutionLte = solutionLte;
  }


  public AlertWhereInput solutionNot(String solutionNot) {
    
    this.solutionNot = solutionNot;
    return this;
  }

   /**
   * Get solutionNot
   * @return solutionNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSolutionNot() {
    return solutionNot;
  }


  public void setSolutionNot(String solutionNot) {
    this.solutionNot = solutionNot;
  }


  public AlertWhereInput solutionNotContains(String solutionNotContains) {
    
    this.solutionNotContains = solutionNotContains;
    return this;
  }

   /**
   * Get solutionNotContains
   * @return solutionNotContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSolutionNotContains() {
    return solutionNotContains;
  }


  public void setSolutionNotContains(String solutionNotContains) {
    this.solutionNotContains = solutionNotContains;
  }


  public AlertWhereInput solutionNotEndsWith(String solutionNotEndsWith) {
    
    this.solutionNotEndsWith = solutionNotEndsWith;
    return this;
  }

   /**
   * Get solutionNotEndsWith
   * @return solutionNotEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSolutionNotEndsWith() {
    return solutionNotEndsWith;
  }


  public void setSolutionNotEndsWith(String solutionNotEndsWith) {
    this.solutionNotEndsWith = solutionNotEndsWith;
  }


  public AlertWhereInput solutionNotIn(List<String> solutionNotIn) {
    
    this.solutionNotIn = solutionNotIn;
    return this;
  }

  public AlertWhereInput addSolutionNotInItem(String solutionNotInItem) {
    if (this.solutionNotIn == null) {
      this.solutionNotIn = new ArrayList<String>();
    }
    this.solutionNotIn.add(solutionNotInItem);
    return this;
  }

   /**
   * Get solutionNotIn
   * @return solutionNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getSolutionNotIn() {
    return solutionNotIn;
  }


  public void setSolutionNotIn(List<String> solutionNotIn) {
    this.solutionNotIn = solutionNotIn;
  }


  public AlertWhereInput solutionNotStartsWith(String solutionNotStartsWith) {
    
    this.solutionNotStartsWith = solutionNotStartsWith;
    return this;
  }

   /**
   * Get solutionNotStartsWith
   * @return solutionNotStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSolutionNotStartsWith() {
    return solutionNotStartsWith;
  }


  public void setSolutionNotStartsWith(String solutionNotStartsWith) {
    this.solutionNotStartsWith = solutionNotStartsWith;
  }


  public AlertWhereInput solutionStartsWith(String solutionStartsWith) {
    
    this.solutionStartsWith = solutionStartsWith;
    return this;
  }

   /**
   * Get solutionStartsWith
   * @return solutionStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSolutionStartsWith() {
    return solutionStartsWith;
  }


  public void setSolutionStartsWith(String solutionStartsWith) {
    this.solutionStartsWith = solutionStartsWith;
  }


  public AlertWhereInput threshold(Double threshold) {
    
    this.threshold = threshold;
    return this;
  }

   /**
   * Get threshold
   * @return threshold
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getThreshold() {
    return threshold;
  }


  public void setThreshold(Double threshold) {
    this.threshold = threshold;
  }


  public AlertWhereInput thresholdGt(Double thresholdGt) {
    
    this.thresholdGt = thresholdGt;
    return this;
  }

   /**
   * Get thresholdGt
   * @return thresholdGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getThresholdGt() {
    return thresholdGt;
  }


  public void setThresholdGt(Double thresholdGt) {
    this.thresholdGt = thresholdGt;
  }


  public AlertWhereInput thresholdGte(Double thresholdGte) {
    
    this.thresholdGte = thresholdGte;
    return this;
  }

   /**
   * Get thresholdGte
   * @return thresholdGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getThresholdGte() {
    return thresholdGte;
  }


  public void setThresholdGte(Double thresholdGte) {
    this.thresholdGte = thresholdGte;
  }


  public AlertWhereInput thresholdIn(List<Double> thresholdIn) {
    
    this.thresholdIn = thresholdIn;
    return this;
  }

  public AlertWhereInput addThresholdInItem(Double thresholdInItem) {
    if (this.thresholdIn == null) {
      this.thresholdIn = new ArrayList<Double>();
    }
    this.thresholdIn.add(thresholdInItem);
    return this;
  }

   /**
   * Get thresholdIn
   * @return thresholdIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Double> getThresholdIn() {
    return thresholdIn;
  }


  public void setThresholdIn(List<Double> thresholdIn) {
    this.thresholdIn = thresholdIn;
  }


  public AlertWhereInput thresholdLt(Double thresholdLt) {
    
    this.thresholdLt = thresholdLt;
    return this;
  }

   /**
   * Get thresholdLt
   * @return thresholdLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getThresholdLt() {
    return thresholdLt;
  }


  public void setThresholdLt(Double thresholdLt) {
    this.thresholdLt = thresholdLt;
  }


  public AlertWhereInput thresholdLte(Double thresholdLte) {
    
    this.thresholdLte = thresholdLte;
    return this;
  }

   /**
   * Get thresholdLte
   * @return thresholdLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getThresholdLte() {
    return thresholdLte;
  }


  public void setThresholdLte(Double thresholdLte) {
    this.thresholdLte = thresholdLte;
  }


  public AlertWhereInput thresholdNot(Double thresholdNot) {
    
    this.thresholdNot = thresholdNot;
    return this;
  }

   /**
   * Get thresholdNot
   * @return thresholdNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getThresholdNot() {
    return thresholdNot;
  }


  public void setThresholdNot(Double thresholdNot) {
    this.thresholdNot = thresholdNot;
  }


  public AlertWhereInput thresholdNotIn(List<Double> thresholdNotIn) {
    
    this.thresholdNotIn = thresholdNotIn;
    return this;
  }

  public AlertWhereInput addThresholdNotInItem(Double thresholdNotInItem) {
    if (this.thresholdNotIn == null) {
      this.thresholdNotIn = new ArrayList<Double>();
    }
    this.thresholdNotIn.add(thresholdNotInItem);
    return this;
  }

   /**
   * Get thresholdNotIn
   * @return thresholdNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Double> getThresholdNotIn() {
    return thresholdNotIn;
  }


  public void setThresholdNotIn(List<Double> thresholdNotIn) {
    this.thresholdNotIn = thresholdNotIn;
  }


  public AlertWhereInput value(Double value) {
    
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getValue() {
    return value;
  }


  public void setValue(Double value) {
    this.value = value;
  }


  public AlertWhereInput valueGt(Double valueGt) {
    
    this.valueGt = valueGt;
    return this;
  }

   /**
   * Get valueGt
   * @return valueGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getValueGt() {
    return valueGt;
  }


  public void setValueGt(Double valueGt) {
    this.valueGt = valueGt;
  }


  public AlertWhereInput valueGte(Double valueGte) {
    
    this.valueGte = valueGte;
    return this;
  }

   /**
   * Get valueGte
   * @return valueGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getValueGte() {
    return valueGte;
  }


  public void setValueGte(Double valueGte) {
    this.valueGte = valueGte;
  }


  public AlertWhereInput valueIn(List<Double> valueIn) {
    
    this.valueIn = valueIn;
    return this;
  }

  public AlertWhereInput addValueInItem(Double valueInItem) {
    if (this.valueIn == null) {
      this.valueIn = new ArrayList<Double>();
    }
    this.valueIn.add(valueInItem);
    return this;
  }

   /**
   * Get valueIn
   * @return valueIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Double> getValueIn() {
    return valueIn;
  }


  public void setValueIn(List<Double> valueIn) {
    this.valueIn = valueIn;
  }


  public AlertWhereInput valueLt(Double valueLt) {
    
    this.valueLt = valueLt;
    return this;
  }

   /**
   * Get valueLt
   * @return valueLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getValueLt() {
    return valueLt;
  }


  public void setValueLt(Double valueLt) {
    this.valueLt = valueLt;
  }


  public AlertWhereInput valueLte(Double valueLte) {
    
    this.valueLte = valueLte;
    return this;
  }

   /**
   * Get valueLte
   * @return valueLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getValueLte() {
    return valueLte;
  }


  public void setValueLte(Double valueLte) {
    this.valueLte = valueLte;
  }


  public AlertWhereInput valueNot(Double valueNot) {
    
    this.valueNot = valueNot;
    return this;
  }

   /**
   * Get valueNot
   * @return valueNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getValueNot() {
    return valueNot;
  }


  public void setValueNot(Double valueNot) {
    this.valueNot = valueNot;
  }


  public AlertWhereInput valueNotIn(List<Double> valueNotIn) {
    
    this.valueNotIn = valueNotIn;
    return this;
  }

  public AlertWhereInput addValueNotInItem(Double valueNotInItem) {
    if (this.valueNotIn == null) {
      this.valueNotIn = new ArrayList<Double>();
    }
    this.valueNotIn.add(valueNotInItem);
    return this;
  }

   /**
   * Get valueNotIn
   * @return valueNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Double> getValueNotIn() {
    return valueNotIn;
  }


  public void setValueNotIn(List<Double> valueNotIn) {
    this.valueNotIn = valueNotIn;
  }


  public AlertWhereInput vmsEvery(VmWhereInput vmsEvery) {
    
    this.vmsEvery = vmsEvery;
    return this;
  }

   /**
   * Get vmsEvery
   * @return vmsEvery
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VmWhereInput getVmsEvery() {
    return vmsEvery;
  }


  public void setVmsEvery(VmWhereInput vmsEvery) {
    this.vmsEvery = vmsEvery;
  }


  public AlertWhereInput vmsNone(VmWhereInput vmsNone) {
    
    this.vmsNone = vmsNone;
    return this;
  }

   /**
   * Get vmsNone
   * @return vmsNone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VmWhereInput getVmsNone() {
    return vmsNone;
  }


  public void setVmsNone(VmWhereInput vmsNone) {
    this.vmsNone = vmsNone;
  }


  public AlertWhereInput vmsSome(VmWhereInput vmsSome) {
    
    this.vmsSome = vmsSome;
    return this;
  }

   /**
   * Get vmsSome
   * @return vmsSome
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VmWhereInput getVmsSome() {
    return vmsSome;
  }


  public void setVmsSome(VmWhereInput vmsSome) {
    this.vmsSome = vmsSome;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlertWhereInput alertWhereInput = (AlertWhereInput) o;
    return Objects.equals(this.AND, alertWhereInput.AND) &&
        Objects.equals(this.NOT, alertWhereInput.NOT) &&
        Objects.equals(this.OR, alertWhereInput.OR) &&
        Objects.equals(this.cause, alertWhereInput.cause) &&
        Objects.equals(this.causeContains, alertWhereInput.causeContains) &&
        Objects.equals(this.causeEndsWith, alertWhereInput.causeEndsWith) &&
        Objects.equals(this.causeGt, alertWhereInput.causeGt) &&
        Objects.equals(this.causeGte, alertWhereInput.causeGte) &&
        Objects.equals(this.causeIn, alertWhereInput.causeIn) &&
        Objects.equals(this.causeLt, alertWhereInput.causeLt) &&
        Objects.equals(this.causeLte, alertWhereInput.causeLte) &&
        Objects.equals(this.causeNot, alertWhereInput.causeNot) &&
        Objects.equals(this.causeNotContains, alertWhereInput.causeNotContains) &&
        Objects.equals(this.causeNotEndsWith, alertWhereInput.causeNotEndsWith) &&
        Objects.equals(this.causeNotIn, alertWhereInput.causeNotIn) &&
        Objects.equals(this.causeNotStartsWith, alertWhereInput.causeNotStartsWith) &&
        Objects.equals(this.causeStartsWith, alertWhereInput.causeStartsWith) &&
        Objects.equals(this.cluster, alertWhereInput.cluster) &&
        Objects.equals(this.createTime, alertWhereInput.createTime) &&
        Objects.equals(this.createTimeGt, alertWhereInput.createTimeGt) &&
        Objects.equals(this.createTimeGte, alertWhereInput.createTimeGte) &&
        Objects.equals(this.createTimeIn, alertWhereInput.createTimeIn) &&
        Objects.equals(this.createTimeLt, alertWhereInput.createTimeLt) &&
        Objects.equals(this.createTimeLte, alertWhereInput.createTimeLte) &&
        Objects.equals(this.createTimeNot, alertWhereInput.createTimeNot) &&
        Objects.equals(this.createTimeNotIn, alertWhereInput.createTimeNotIn) &&
        Objects.equals(this.ended, alertWhereInput.ended) &&
        Objects.equals(this.endedNot, alertWhereInput.endedNot) &&
        Objects.equals(this.host, alertWhereInput.host) &&
        Objects.equals(this.id, alertWhereInput.id) &&
        Objects.equals(this.idContains, alertWhereInput.idContains) &&
        Objects.equals(this.idEndsWith, alertWhereInput.idEndsWith) &&
        Objects.equals(this.idGt, alertWhereInput.idGt) &&
        Objects.equals(this.idGte, alertWhereInput.idGte) &&
        Objects.equals(this.idIn, alertWhereInput.idIn) &&
        Objects.equals(this.idLt, alertWhereInput.idLt) &&
        Objects.equals(this.idLte, alertWhereInput.idLte) &&
        Objects.equals(this.idNot, alertWhereInput.idNot) &&
        Objects.equals(this.idNotContains, alertWhereInput.idNotContains) &&
        Objects.equals(this.idNotEndsWith, alertWhereInput.idNotEndsWith) &&
        Objects.equals(this.idNotIn, alertWhereInput.idNotIn) &&
        Objects.equals(this.idNotStartsWith, alertWhereInput.idNotStartsWith) &&
        Objects.equals(this.idStartsWith, alertWhereInput.idStartsWith) &&
        Objects.equals(this.impact, alertWhereInput.impact) &&
        Objects.equals(this.impactContains, alertWhereInput.impactContains) &&
        Objects.equals(this.impactEndsWith, alertWhereInput.impactEndsWith) &&
        Objects.equals(this.impactGt, alertWhereInput.impactGt) &&
        Objects.equals(this.impactGte, alertWhereInput.impactGte) &&
        Objects.equals(this.impactIn, alertWhereInput.impactIn) &&
        Objects.equals(this.impactLt, alertWhereInput.impactLt) &&
        Objects.equals(this.impactLte, alertWhereInput.impactLte) &&
        Objects.equals(this.impactNot, alertWhereInput.impactNot) &&
        Objects.equals(this.impactNotContains, alertWhereInput.impactNotContains) &&
        Objects.equals(this.impactNotEndsWith, alertWhereInput.impactNotEndsWith) &&
        Objects.equals(this.impactNotIn, alertWhereInput.impactNotIn) &&
        Objects.equals(this.impactNotStartsWith, alertWhereInput.impactNotStartsWith) &&
        Objects.equals(this.impactStartsWith, alertWhereInput.impactStartsWith) &&
        Objects.equals(this.localCreateTime, alertWhereInput.localCreateTime) &&
        Objects.equals(this.localCreateTimeGt, alertWhereInput.localCreateTimeGt) &&
        Objects.equals(this.localCreateTimeGte, alertWhereInput.localCreateTimeGte) &&
        Objects.equals(this.localCreateTimeIn, alertWhereInput.localCreateTimeIn) &&
        Objects.equals(this.localCreateTimeLt, alertWhereInput.localCreateTimeLt) &&
        Objects.equals(this.localCreateTimeLte, alertWhereInput.localCreateTimeLte) &&
        Objects.equals(this.localCreateTimeNot, alertWhereInput.localCreateTimeNot) &&
        Objects.equals(this.localCreateTimeNotIn, alertWhereInput.localCreateTimeNotIn) &&
        Objects.equals(this.localEndTime, alertWhereInput.localEndTime) &&
        Objects.equals(this.localEndTimeContains, alertWhereInput.localEndTimeContains) &&
        Objects.equals(this.localEndTimeEndsWith, alertWhereInput.localEndTimeEndsWith) &&
        Objects.equals(this.localEndTimeGt, alertWhereInput.localEndTimeGt) &&
        Objects.equals(this.localEndTimeGte, alertWhereInput.localEndTimeGte) &&
        Objects.equals(this.localEndTimeIn, alertWhereInput.localEndTimeIn) &&
        Objects.equals(this.localEndTimeLt, alertWhereInput.localEndTimeLt) &&
        Objects.equals(this.localEndTimeLte, alertWhereInput.localEndTimeLte) &&
        Objects.equals(this.localEndTimeNot, alertWhereInput.localEndTimeNot) &&
        Objects.equals(this.localEndTimeNotContains, alertWhereInput.localEndTimeNotContains) &&
        Objects.equals(this.localEndTimeNotEndsWith, alertWhereInput.localEndTimeNotEndsWith) &&
        Objects.equals(this.localEndTimeNotIn, alertWhereInput.localEndTimeNotIn) &&
        Objects.equals(this.localEndTimeNotStartsWith, alertWhereInput.localEndTimeNotStartsWith) &&
        Objects.equals(this.localEndTimeStartsWith, alertWhereInput.localEndTimeStartsWith) &&
        Objects.equals(this.localId, alertWhereInput.localId) &&
        Objects.equals(this.localIdContains, alertWhereInput.localIdContains) &&
        Objects.equals(this.localIdEndsWith, alertWhereInput.localIdEndsWith) &&
        Objects.equals(this.localIdGt, alertWhereInput.localIdGt) &&
        Objects.equals(this.localIdGte, alertWhereInput.localIdGte) &&
        Objects.equals(this.localIdIn, alertWhereInput.localIdIn) &&
        Objects.equals(this.localIdLt, alertWhereInput.localIdLt) &&
        Objects.equals(this.localIdLte, alertWhereInput.localIdLte) &&
        Objects.equals(this.localIdNot, alertWhereInput.localIdNot) &&
        Objects.equals(this.localIdNotContains, alertWhereInput.localIdNotContains) &&
        Objects.equals(this.localIdNotEndsWith, alertWhereInput.localIdNotEndsWith) &&
        Objects.equals(this.localIdNotIn, alertWhereInput.localIdNotIn) &&
        Objects.equals(this.localIdNotStartsWith, alertWhereInput.localIdNotStartsWith) &&
        Objects.equals(this.localIdStartsWith, alertWhereInput.localIdStartsWith) &&
        Objects.equals(this.localStartTime, alertWhereInput.localStartTime) &&
        Objects.equals(this.localStartTimeContains, alertWhereInput.localStartTimeContains) &&
        Objects.equals(this.localStartTimeEndsWith, alertWhereInput.localStartTimeEndsWith) &&
        Objects.equals(this.localStartTimeGt, alertWhereInput.localStartTimeGt) &&
        Objects.equals(this.localStartTimeGte, alertWhereInput.localStartTimeGte) &&
        Objects.equals(this.localStartTimeIn, alertWhereInput.localStartTimeIn) &&
        Objects.equals(this.localStartTimeLt, alertWhereInput.localStartTimeLt) &&
        Objects.equals(this.localStartTimeLte, alertWhereInput.localStartTimeLte) &&
        Objects.equals(this.localStartTimeNot, alertWhereInput.localStartTimeNot) &&
        Objects.equals(this.localStartTimeNotContains, alertWhereInput.localStartTimeNotContains) &&
        Objects.equals(this.localStartTimeNotEndsWith, alertWhereInput.localStartTimeNotEndsWith) &&
        Objects.equals(this.localStartTimeNotIn, alertWhereInput.localStartTimeNotIn) &&
        Objects.equals(this.localStartTimeNotStartsWith, alertWhereInput.localStartTimeNotStartsWith) &&
        Objects.equals(this.localStartTimeStartsWith, alertWhereInput.localStartTimeStartsWith) &&
        Objects.equals(this.localUpdateTime, alertWhereInput.localUpdateTime) &&
        Objects.equals(this.localUpdateTimeContains, alertWhereInput.localUpdateTimeContains) &&
        Objects.equals(this.localUpdateTimeEndsWith, alertWhereInput.localUpdateTimeEndsWith) &&
        Objects.equals(this.localUpdateTimeGt, alertWhereInput.localUpdateTimeGt) &&
        Objects.equals(this.localUpdateTimeGte, alertWhereInput.localUpdateTimeGte) &&
        Objects.equals(this.localUpdateTimeIn, alertWhereInput.localUpdateTimeIn) &&
        Objects.equals(this.localUpdateTimeLt, alertWhereInput.localUpdateTimeLt) &&
        Objects.equals(this.localUpdateTimeLte, alertWhereInput.localUpdateTimeLte) &&
        Objects.equals(this.localUpdateTimeNot, alertWhereInput.localUpdateTimeNot) &&
        Objects.equals(this.localUpdateTimeNotContains, alertWhereInput.localUpdateTimeNotContains) &&
        Objects.equals(this.localUpdateTimeNotEndsWith, alertWhereInput.localUpdateTimeNotEndsWith) &&
        Objects.equals(this.localUpdateTimeNotIn, alertWhereInput.localUpdateTimeNotIn) &&
        Objects.equals(this.localUpdateTimeNotStartsWith, alertWhereInput.localUpdateTimeNotStartsWith) &&
        Objects.equals(this.localUpdateTimeStartsWith, alertWhereInput.localUpdateTimeStartsWith) &&
        Objects.equals(this.message, alertWhereInput.message) &&
        Objects.equals(this.messageContains, alertWhereInput.messageContains) &&
        Objects.equals(this.messageEndsWith, alertWhereInput.messageEndsWith) &&
        Objects.equals(this.messageGt, alertWhereInput.messageGt) &&
        Objects.equals(this.messageGte, alertWhereInput.messageGte) &&
        Objects.equals(this.messageIn, alertWhereInput.messageIn) &&
        Objects.equals(this.messageLt, alertWhereInput.messageLt) &&
        Objects.equals(this.messageLte, alertWhereInput.messageLte) &&
        Objects.equals(this.messageNot, alertWhereInput.messageNot) &&
        Objects.equals(this.messageNotContains, alertWhereInput.messageNotContains) &&
        Objects.equals(this.messageNotEndsWith, alertWhereInput.messageNotEndsWith) &&
        Objects.equals(this.messageNotIn, alertWhereInput.messageNotIn) &&
        Objects.equals(this.messageNotStartsWith, alertWhereInput.messageNotStartsWith) &&
        Objects.equals(this.messageStartsWith, alertWhereInput.messageStartsWith) &&
        Objects.equals(this.severity, alertWhereInput.severity) &&
        Objects.equals(this.severityContains, alertWhereInput.severityContains) &&
        Objects.equals(this.severityEndsWith, alertWhereInput.severityEndsWith) &&
        Objects.equals(this.severityGt, alertWhereInput.severityGt) &&
        Objects.equals(this.severityGte, alertWhereInput.severityGte) &&
        Objects.equals(this.severityIn, alertWhereInput.severityIn) &&
        Objects.equals(this.severityLt, alertWhereInput.severityLt) &&
        Objects.equals(this.severityLte, alertWhereInput.severityLte) &&
        Objects.equals(this.severityNot, alertWhereInput.severityNot) &&
        Objects.equals(this.severityNotContains, alertWhereInput.severityNotContains) &&
        Objects.equals(this.severityNotEndsWith, alertWhereInput.severityNotEndsWith) &&
        Objects.equals(this.severityNotIn, alertWhereInput.severityNotIn) &&
        Objects.equals(this.severityNotStartsWith, alertWhereInput.severityNotStartsWith) &&
        Objects.equals(this.severityStartsWith, alertWhereInput.severityStartsWith) &&
        Objects.equals(this.solution, alertWhereInput.solution) &&
        Objects.equals(this.solutionContains, alertWhereInput.solutionContains) &&
        Objects.equals(this.solutionEndsWith, alertWhereInput.solutionEndsWith) &&
        Objects.equals(this.solutionGt, alertWhereInput.solutionGt) &&
        Objects.equals(this.solutionGte, alertWhereInput.solutionGte) &&
        Objects.equals(this.solutionIn, alertWhereInput.solutionIn) &&
        Objects.equals(this.solutionLt, alertWhereInput.solutionLt) &&
        Objects.equals(this.solutionLte, alertWhereInput.solutionLte) &&
        Objects.equals(this.solutionNot, alertWhereInput.solutionNot) &&
        Objects.equals(this.solutionNotContains, alertWhereInput.solutionNotContains) &&
        Objects.equals(this.solutionNotEndsWith, alertWhereInput.solutionNotEndsWith) &&
        Objects.equals(this.solutionNotIn, alertWhereInput.solutionNotIn) &&
        Objects.equals(this.solutionNotStartsWith, alertWhereInput.solutionNotStartsWith) &&
        Objects.equals(this.solutionStartsWith, alertWhereInput.solutionStartsWith) &&
        Objects.equals(this.threshold, alertWhereInput.threshold) &&
        Objects.equals(this.thresholdGt, alertWhereInput.thresholdGt) &&
        Objects.equals(this.thresholdGte, alertWhereInput.thresholdGte) &&
        Objects.equals(this.thresholdIn, alertWhereInput.thresholdIn) &&
        Objects.equals(this.thresholdLt, alertWhereInput.thresholdLt) &&
        Objects.equals(this.thresholdLte, alertWhereInput.thresholdLte) &&
        Objects.equals(this.thresholdNot, alertWhereInput.thresholdNot) &&
        Objects.equals(this.thresholdNotIn, alertWhereInput.thresholdNotIn) &&
        Objects.equals(this.value, alertWhereInput.value) &&
        Objects.equals(this.valueGt, alertWhereInput.valueGt) &&
        Objects.equals(this.valueGte, alertWhereInput.valueGte) &&
        Objects.equals(this.valueIn, alertWhereInput.valueIn) &&
        Objects.equals(this.valueLt, alertWhereInput.valueLt) &&
        Objects.equals(this.valueLte, alertWhereInput.valueLte) &&
        Objects.equals(this.valueNot, alertWhereInput.valueNot) &&
        Objects.equals(this.valueNotIn, alertWhereInput.valueNotIn) &&
        Objects.equals(this.vmsEvery, alertWhereInput.vmsEvery) &&
        Objects.equals(this.vmsNone, alertWhereInput.vmsNone) &&
        Objects.equals(this.vmsSome, alertWhereInput.vmsSome);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(AND, NOT, OR, cause, causeContains, causeEndsWith, causeGt, causeGte, causeIn, causeLt, causeLte, causeNot, causeNotContains, causeNotEndsWith, causeNotIn, causeNotStartsWith, causeStartsWith, cluster, createTime, createTimeGt, createTimeGte, createTimeIn, createTimeLt, createTimeLte, createTimeNot, createTimeNotIn, ended, endedNot, host, id, idContains, idEndsWith, idGt, idGte, idIn, idLt, idLte, idNot, idNotContains, idNotEndsWith, idNotIn, idNotStartsWith, idStartsWith, impact, impactContains, impactEndsWith, impactGt, impactGte, impactIn, impactLt, impactLte, impactNot, impactNotContains, impactNotEndsWith, impactNotIn, impactNotStartsWith, impactStartsWith, localCreateTime, localCreateTimeGt, localCreateTimeGte, localCreateTimeIn, localCreateTimeLt, localCreateTimeLte, localCreateTimeNot, localCreateTimeNotIn, localEndTime, localEndTimeContains, localEndTimeEndsWith, localEndTimeGt, localEndTimeGte, localEndTimeIn, localEndTimeLt, localEndTimeLte, localEndTimeNot, localEndTimeNotContains, localEndTimeNotEndsWith, localEndTimeNotIn, localEndTimeNotStartsWith, localEndTimeStartsWith, localId, localIdContains, localIdEndsWith, localIdGt, localIdGte, localIdIn, localIdLt, localIdLte, localIdNot, localIdNotContains, localIdNotEndsWith, localIdNotIn, localIdNotStartsWith, localIdStartsWith, localStartTime, localStartTimeContains, localStartTimeEndsWith, localStartTimeGt, localStartTimeGte, localStartTimeIn, localStartTimeLt, localStartTimeLte, localStartTimeNot, localStartTimeNotContains, localStartTimeNotEndsWith, localStartTimeNotIn, localStartTimeNotStartsWith, localStartTimeStartsWith, localUpdateTime, localUpdateTimeContains, localUpdateTimeEndsWith, localUpdateTimeGt, localUpdateTimeGte, localUpdateTimeIn, localUpdateTimeLt, localUpdateTimeLte, localUpdateTimeNot, localUpdateTimeNotContains, localUpdateTimeNotEndsWith, localUpdateTimeNotIn, localUpdateTimeNotStartsWith, localUpdateTimeStartsWith, message, messageContains, messageEndsWith, messageGt, messageGte, messageIn, messageLt, messageLte, messageNot, messageNotContains, messageNotEndsWith, messageNotIn, messageNotStartsWith, messageStartsWith, severity, severityContains, severityEndsWith, severityGt, severityGte, severityIn, severityLt, severityLte, severityNot, severityNotContains, severityNotEndsWith, severityNotIn, severityNotStartsWith, severityStartsWith, solution, solutionContains, solutionEndsWith, solutionGt, solutionGte, solutionIn, solutionLt, solutionLte, solutionNot, solutionNotContains, solutionNotEndsWith, solutionNotIn, solutionNotStartsWith, solutionStartsWith, threshold, thresholdGt, thresholdGte, thresholdIn, thresholdLt, thresholdLte, thresholdNot, thresholdNotIn, value, valueGt, valueGte, valueIn, valueLt, valueLte, valueNot, valueNotIn, vmsEvery, vmsNone, vmsSome);
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
    sb.append("class AlertWhereInput {\n");
    sb.append("    AND: ").append(toIndentedString(AND)).append("\n");
    sb.append("    NOT: ").append(toIndentedString(NOT)).append("\n");
    sb.append("    OR: ").append(toIndentedString(OR)).append("\n");
    sb.append("    cause: ").append(toIndentedString(cause)).append("\n");
    sb.append("    causeContains: ").append(toIndentedString(causeContains)).append("\n");
    sb.append("    causeEndsWith: ").append(toIndentedString(causeEndsWith)).append("\n");
    sb.append("    causeGt: ").append(toIndentedString(causeGt)).append("\n");
    sb.append("    causeGte: ").append(toIndentedString(causeGte)).append("\n");
    sb.append("    causeIn: ").append(toIndentedString(causeIn)).append("\n");
    sb.append("    causeLt: ").append(toIndentedString(causeLt)).append("\n");
    sb.append("    causeLte: ").append(toIndentedString(causeLte)).append("\n");
    sb.append("    causeNot: ").append(toIndentedString(causeNot)).append("\n");
    sb.append("    causeNotContains: ").append(toIndentedString(causeNotContains)).append("\n");
    sb.append("    causeNotEndsWith: ").append(toIndentedString(causeNotEndsWith)).append("\n");
    sb.append("    causeNotIn: ").append(toIndentedString(causeNotIn)).append("\n");
    sb.append("    causeNotStartsWith: ").append(toIndentedString(causeNotStartsWith)).append("\n");
    sb.append("    causeStartsWith: ").append(toIndentedString(causeStartsWith)).append("\n");
    sb.append("    cluster: ").append(toIndentedString(cluster)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    createTimeGt: ").append(toIndentedString(createTimeGt)).append("\n");
    sb.append("    createTimeGte: ").append(toIndentedString(createTimeGte)).append("\n");
    sb.append("    createTimeIn: ").append(toIndentedString(createTimeIn)).append("\n");
    sb.append("    createTimeLt: ").append(toIndentedString(createTimeLt)).append("\n");
    sb.append("    createTimeLte: ").append(toIndentedString(createTimeLte)).append("\n");
    sb.append("    createTimeNot: ").append(toIndentedString(createTimeNot)).append("\n");
    sb.append("    createTimeNotIn: ").append(toIndentedString(createTimeNotIn)).append("\n");
    sb.append("    ended: ").append(toIndentedString(ended)).append("\n");
    sb.append("    endedNot: ").append(toIndentedString(endedNot)).append("\n");
    sb.append("    host: ").append(toIndentedString(host)).append("\n");
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
    sb.append("    impact: ").append(toIndentedString(impact)).append("\n");
    sb.append("    impactContains: ").append(toIndentedString(impactContains)).append("\n");
    sb.append("    impactEndsWith: ").append(toIndentedString(impactEndsWith)).append("\n");
    sb.append("    impactGt: ").append(toIndentedString(impactGt)).append("\n");
    sb.append("    impactGte: ").append(toIndentedString(impactGte)).append("\n");
    sb.append("    impactIn: ").append(toIndentedString(impactIn)).append("\n");
    sb.append("    impactLt: ").append(toIndentedString(impactLt)).append("\n");
    sb.append("    impactLte: ").append(toIndentedString(impactLte)).append("\n");
    sb.append("    impactNot: ").append(toIndentedString(impactNot)).append("\n");
    sb.append("    impactNotContains: ").append(toIndentedString(impactNotContains)).append("\n");
    sb.append("    impactNotEndsWith: ").append(toIndentedString(impactNotEndsWith)).append("\n");
    sb.append("    impactNotIn: ").append(toIndentedString(impactNotIn)).append("\n");
    sb.append("    impactNotStartsWith: ").append(toIndentedString(impactNotStartsWith)).append("\n");
    sb.append("    impactStartsWith: ").append(toIndentedString(impactStartsWith)).append("\n");
    sb.append("    localCreateTime: ").append(toIndentedString(localCreateTime)).append("\n");
    sb.append("    localCreateTimeGt: ").append(toIndentedString(localCreateTimeGt)).append("\n");
    sb.append("    localCreateTimeGte: ").append(toIndentedString(localCreateTimeGte)).append("\n");
    sb.append("    localCreateTimeIn: ").append(toIndentedString(localCreateTimeIn)).append("\n");
    sb.append("    localCreateTimeLt: ").append(toIndentedString(localCreateTimeLt)).append("\n");
    sb.append("    localCreateTimeLte: ").append(toIndentedString(localCreateTimeLte)).append("\n");
    sb.append("    localCreateTimeNot: ").append(toIndentedString(localCreateTimeNot)).append("\n");
    sb.append("    localCreateTimeNotIn: ").append(toIndentedString(localCreateTimeNotIn)).append("\n");
    sb.append("    localEndTime: ").append(toIndentedString(localEndTime)).append("\n");
    sb.append("    localEndTimeContains: ").append(toIndentedString(localEndTimeContains)).append("\n");
    sb.append("    localEndTimeEndsWith: ").append(toIndentedString(localEndTimeEndsWith)).append("\n");
    sb.append("    localEndTimeGt: ").append(toIndentedString(localEndTimeGt)).append("\n");
    sb.append("    localEndTimeGte: ").append(toIndentedString(localEndTimeGte)).append("\n");
    sb.append("    localEndTimeIn: ").append(toIndentedString(localEndTimeIn)).append("\n");
    sb.append("    localEndTimeLt: ").append(toIndentedString(localEndTimeLt)).append("\n");
    sb.append("    localEndTimeLte: ").append(toIndentedString(localEndTimeLte)).append("\n");
    sb.append("    localEndTimeNot: ").append(toIndentedString(localEndTimeNot)).append("\n");
    sb.append("    localEndTimeNotContains: ").append(toIndentedString(localEndTimeNotContains)).append("\n");
    sb.append("    localEndTimeNotEndsWith: ").append(toIndentedString(localEndTimeNotEndsWith)).append("\n");
    sb.append("    localEndTimeNotIn: ").append(toIndentedString(localEndTimeNotIn)).append("\n");
    sb.append("    localEndTimeNotStartsWith: ").append(toIndentedString(localEndTimeNotStartsWith)).append("\n");
    sb.append("    localEndTimeStartsWith: ").append(toIndentedString(localEndTimeStartsWith)).append("\n");
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
    sb.append("    localStartTime: ").append(toIndentedString(localStartTime)).append("\n");
    sb.append("    localStartTimeContains: ").append(toIndentedString(localStartTimeContains)).append("\n");
    sb.append("    localStartTimeEndsWith: ").append(toIndentedString(localStartTimeEndsWith)).append("\n");
    sb.append("    localStartTimeGt: ").append(toIndentedString(localStartTimeGt)).append("\n");
    sb.append("    localStartTimeGte: ").append(toIndentedString(localStartTimeGte)).append("\n");
    sb.append("    localStartTimeIn: ").append(toIndentedString(localStartTimeIn)).append("\n");
    sb.append("    localStartTimeLt: ").append(toIndentedString(localStartTimeLt)).append("\n");
    sb.append("    localStartTimeLte: ").append(toIndentedString(localStartTimeLte)).append("\n");
    sb.append("    localStartTimeNot: ").append(toIndentedString(localStartTimeNot)).append("\n");
    sb.append("    localStartTimeNotContains: ").append(toIndentedString(localStartTimeNotContains)).append("\n");
    sb.append("    localStartTimeNotEndsWith: ").append(toIndentedString(localStartTimeNotEndsWith)).append("\n");
    sb.append("    localStartTimeNotIn: ").append(toIndentedString(localStartTimeNotIn)).append("\n");
    sb.append("    localStartTimeNotStartsWith: ").append(toIndentedString(localStartTimeNotStartsWith)).append("\n");
    sb.append("    localStartTimeStartsWith: ").append(toIndentedString(localStartTimeStartsWith)).append("\n");
    sb.append("    localUpdateTime: ").append(toIndentedString(localUpdateTime)).append("\n");
    sb.append("    localUpdateTimeContains: ").append(toIndentedString(localUpdateTimeContains)).append("\n");
    sb.append("    localUpdateTimeEndsWith: ").append(toIndentedString(localUpdateTimeEndsWith)).append("\n");
    sb.append("    localUpdateTimeGt: ").append(toIndentedString(localUpdateTimeGt)).append("\n");
    sb.append("    localUpdateTimeGte: ").append(toIndentedString(localUpdateTimeGte)).append("\n");
    sb.append("    localUpdateTimeIn: ").append(toIndentedString(localUpdateTimeIn)).append("\n");
    sb.append("    localUpdateTimeLt: ").append(toIndentedString(localUpdateTimeLt)).append("\n");
    sb.append("    localUpdateTimeLte: ").append(toIndentedString(localUpdateTimeLte)).append("\n");
    sb.append("    localUpdateTimeNot: ").append(toIndentedString(localUpdateTimeNot)).append("\n");
    sb.append("    localUpdateTimeNotContains: ").append(toIndentedString(localUpdateTimeNotContains)).append("\n");
    sb.append("    localUpdateTimeNotEndsWith: ").append(toIndentedString(localUpdateTimeNotEndsWith)).append("\n");
    sb.append("    localUpdateTimeNotIn: ").append(toIndentedString(localUpdateTimeNotIn)).append("\n");
    sb.append("    localUpdateTimeNotStartsWith: ").append(toIndentedString(localUpdateTimeNotStartsWith)).append("\n");
    sb.append("    localUpdateTimeStartsWith: ").append(toIndentedString(localUpdateTimeStartsWith)).append("\n");
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
    sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
    sb.append("    severityContains: ").append(toIndentedString(severityContains)).append("\n");
    sb.append("    severityEndsWith: ").append(toIndentedString(severityEndsWith)).append("\n");
    sb.append("    severityGt: ").append(toIndentedString(severityGt)).append("\n");
    sb.append("    severityGte: ").append(toIndentedString(severityGte)).append("\n");
    sb.append("    severityIn: ").append(toIndentedString(severityIn)).append("\n");
    sb.append("    severityLt: ").append(toIndentedString(severityLt)).append("\n");
    sb.append("    severityLte: ").append(toIndentedString(severityLte)).append("\n");
    sb.append("    severityNot: ").append(toIndentedString(severityNot)).append("\n");
    sb.append("    severityNotContains: ").append(toIndentedString(severityNotContains)).append("\n");
    sb.append("    severityNotEndsWith: ").append(toIndentedString(severityNotEndsWith)).append("\n");
    sb.append("    severityNotIn: ").append(toIndentedString(severityNotIn)).append("\n");
    sb.append("    severityNotStartsWith: ").append(toIndentedString(severityNotStartsWith)).append("\n");
    sb.append("    severityStartsWith: ").append(toIndentedString(severityStartsWith)).append("\n");
    sb.append("    solution: ").append(toIndentedString(solution)).append("\n");
    sb.append("    solutionContains: ").append(toIndentedString(solutionContains)).append("\n");
    sb.append("    solutionEndsWith: ").append(toIndentedString(solutionEndsWith)).append("\n");
    sb.append("    solutionGt: ").append(toIndentedString(solutionGt)).append("\n");
    sb.append("    solutionGte: ").append(toIndentedString(solutionGte)).append("\n");
    sb.append("    solutionIn: ").append(toIndentedString(solutionIn)).append("\n");
    sb.append("    solutionLt: ").append(toIndentedString(solutionLt)).append("\n");
    sb.append("    solutionLte: ").append(toIndentedString(solutionLte)).append("\n");
    sb.append("    solutionNot: ").append(toIndentedString(solutionNot)).append("\n");
    sb.append("    solutionNotContains: ").append(toIndentedString(solutionNotContains)).append("\n");
    sb.append("    solutionNotEndsWith: ").append(toIndentedString(solutionNotEndsWith)).append("\n");
    sb.append("    solutionNotIn: ").append(toIndentedString(solutionNotIn)).append("\n");
    sb.append("    solutionNotStartsWith: ").append(toIndentedString(solutionNotStartsWith)).append("\n");
    sb.append("    solutionStartsWith: ").append(toIndentedString(solutionStartsWith)).append("\n");
    sb.append("    threshold: ").append(toIndentedString(threshold)).append("\n");
    sb.append("    thresholdGt: ").append(toIndentedString(thresholdGt)).append("\n");
    sb.append("    thresholdGte: ").append(toIndentedString(thresholdGte)).append("\n");
    sb.append("    thresholdIn: ").append(toIndentedString(thresholdIn)).append("\n");
    sb.append("    thresholdLt: ").append(toIndentedString(thresholdLt)).append("\n");
    sb.append("    thresholdLte: ").append(toIndentedString(thresholdLte)).append("\n");
    sb.append("    thresholdNot: ").append(toIndentedString(thresholdNot)).append("\n");
    sb.append("    thresholdNotIn: ").append(toIndentedString(thresholdNotIn)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    valueGt: ").append(toIndentedString(valueGt)).append("\n");
    sb.append("    valueGte: ").append(toIndentedString(valueGte)).append("\n");
    sb.append("    valueIn: ").append(toIndentedString(valueIn)).append("\n");
    sb.append("    valueLt: ").append(toIndentedString(valueLt)).append("\n");
    sb.append("    valueLte: ").append(toIndentedString(valueLte)).append("\n");
    sb.append("    valueNot: ").append(toIndentedString(valueNot)).append("\n");
    sb.append("    valueNotIn: ").append(toIndentedString(valueNotIn)).append("\n");
    sb.append("    vmsEvery: ").append(toIndentedString(vmsEvery)).append("\n");
    sb.append("    vmsNone: ").append(toIndentedString(vmsNone)).append("\n");
    sb.append("    vmsSome: ").append(toIndentedString(vmsSome)).append("\n");
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

