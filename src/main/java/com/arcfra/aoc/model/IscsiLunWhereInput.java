package com.arcfra.aoc.model;

import java.util.Objects;
import java.util.Arrays;
import com.arcfra.aoc.model.EntityAsyncStatus;
import com.arcfra.aoc.model.IscsiTargetWhereInput;
import com.arcfra.aoc.model.LabelWhereInput;
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
 * IscsiLunWhereInput
 */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class IscsiLunWhereInput {
  public static final String SERIALIZED_NAME_A_N_D = "AND";
  @SerializedName(SERIALIZED_NAME_A_N_D)
  private List<IscsiLunWhereInput> AND = null;

  public static final String SERIALIZED_NAME_N_O_T = "NOT";
  @SerializedName(SERIALIZED_NAME_N_O_T)
  private List<IscsiLunWhereInput> NOT = null;

  public static final String SERIALIZED_NAME_O_R = "OR";
  @SerializedName(SERIALIZED_NAME_O_R)
  private List<IscsiLunWhereInput> OR = null;

  public static final String SERIALIZED_NAME_ALLOWED_INITIATORS = "allowed_initiators";
  @SerializedName(SERIALIZED_NAME_ALLOWED_INITIATORS)
  private String allowedInitiators;

  public static final String SERIALIZED_NAME_ALLOWED_INITIATORS_CONTAINS = "allowed_initiators_contains";
  @SerializedName(SERIALIZED_NAME_ALLOWED_INITIATORS_CONTAINS)
  private String allowedInitiatorsContains;

  public static final String SERIALIZED_NAME_ALLOWED_INITIATORS_ENDS_WITH = "allowed_initiators_ends_with";
  @SerializedName(SERIALIZED_NAME_ALLOWED_INITIATORS_ENDS_WITH)
  private String allowedInitiatorsEndsWith;

  public static final String SERIALIZED_NAME_ALLOWED_INITIATORS_GT = "allowed_initiators_gt";
  @SerializedName(SERIALIZED_NAME_ALLOWED_INITIATORS_GT)
  private String allowedInitiatorsGt;

  public static final String SERIALIZED_NAME_ALLOWED_INITIATORS_GTE = "allowed_initiators_gte";
  @SerializedName(SERIALIZED_NAME_ALLOWED_INITIATORS_GTE)
  private String allowedInitiatorsGte;

  public static final String SERIALIZED_NAME_ALLOWED_INITIATORS_IN = "allowed_initiators_in";
  @SerializedName(SERIALIZED_NAME_ALLOWED_INITIATORS_IN)
  private List<String> allowedInitiatorsIn = null;

  public static final String SERIALIZED_NAME_ALLOWED_INITIATORS_LT = "allowed_initiators_lt";
  @SerializedName(SERIALIZED_NAME_ALLOWED_INITIATORS_LT)
  private String allowedInitiatorsLt;

  public static final String SERIALIZED_NAME_ALLOWED_INITIATORS_LTE = "allowed_initiators_lte";
  @SerializedName(SERIALIZED_NAME_ALLOWED_INITIATORS_LTE)
  private String allowedInitiatorsLte;

  public static final String SERIALIZED_NAME_ALLOWED_INITIATORS_NOT = "allowed_initiators_not";
  @SerializedName(SERIALIZED_NAME_ALLOWED_INITIATORS_NOT)
  private String allowedInitiatorsNot;

  public static final String SERIALIZED_NAME_ALLOWED_INITIATORS_NOT_CONTAINS = "allowed_initiators_not_contains";
  @SerializedName(SERIALIZED_NAME_ALLOWED_INITIATORS_NOT_CONTAINS)
  private String allowedInitiatorsNotContains;

  public static final String SERIALIZED_NAME_ALLOWED_INITIATORS_NOT_ENDS_WITH = "allowed_initiators_not_ends_with";
  @SerializedName(SERIALIZED_NAME_ALLOWED_INITIATORS_NOT_ENDS_WITH)
  private String allowedInitiatorsNotEndsWith;

  public static final String SERIALIZED_NAME_ALLOWED_INITIATORS_NOT_IN = "allowed_initiators_not_in";
  @SerializedName(SERIALIZED_NAME_ALLOWED_INITIATORS_NOT_IN)
  private List<String> allowedInitiatorsNotIn = null;

  public static final String SERIALIZED_NAME_ALLOWED_INITIATORS_NOT_STARTS_WITH = "allowed_initiators_not_starts_with";
  @SerializedName(SERIALIZED_NAME_ALLOWED_INITIATORS_NOT_STARTS_WITH)
  private String allowedInitiatorsNotStartsWith;

  public static final String SERIALIZED_NAME_ALLOWED_INITIATORS_STARTS_WITH = "allowed_initiators_starts_with";
  @SerializedName(SERIALIZED_NAME_ALLOWED_INITIATORS_STARTS_WITH)
  private String allowedInitiatorsStartsWith;

  public static final String SERIALIZED_NAME_ASSIGNED_SIZE = "assigned_size";
  @SerializedName(SERIALIZED_NAME_ASSIGNED_SIZE)
  private Long assignedSize;

  public static final String SERIALIZED_NAME_ASSIGNED_SIZE_GT = "assigned_size_gt";
  @SerializedName(SERIALIZED_NAME_ASSIGNED_SIZE_GT)
  private Long assignedSizeGt;

  public static final String SERIALIZED_NAME_ASSIGNED_SIZE_GTE = "assigned_size_gte";
  @SerializedName(SERIALIZED_NAME_ASSIGNED_SIZE_GTE)
  private Long assignedSizeGte;

  public static final String SERIALIZED_NAME_ASSIGNED_SIZE_IN = "assigned_size_in";
  @SerializedName(SERIALIZED_NAME_ASSIGNED_SIZE_IN)
  private List<Long> assignedSizeIn = null;

  public static final String SERIALIZED_NAME_ASSIGNED_SIZE_LT = "assigned_size_lt";
  @SerializedName(SERIALIZED_NAME_ASSIGNED_SIZE_LT)
  private Long assignedSizeLt;

  public static final String SERIALIZED_NAME_ASSIGNED_SIZE_LTE = "assigned_size_lte";
  @SerializedName(SERIALIZED_NAME_ASSIGNED_SIZE_LTE)
  private Long assignedSizeLte;

  public static final String SERIALIZED_NAME_ASSIGNED_SIZE_NOT = "assigned_size_not";
  @SerializedName(SERIALIZED_NAME_ASSIGNED_SIZE_NOT)
  private Long assignedSizeNot;

  public static final String SERIALIZED_NAME_ASSIGNED_SIZE_NOT_IN = "assigned_size_not_in";
  @SerializedName(SERIALIZED_NAME_ASSIGNED_SIZE_NOT_IN)
  private List<Long> assignedSizeNotIn = null;

  public static final String SERIALIZED_NAME_BPS = "bps";
  @SerializedName(SERIALIZED_NAME_BPS)
  private Long bps;

  public static final String SERIALIZED_NAME_BPS_GT = "bps_gt";
  @SerializedName(SERIALIZED_NAME_BPS_GT)
  private Long bpsGt;

  public static final String SERIALIZED_NAME_BPS_GTE = "bps_gte";
  @SerializedName(SERIALIZED_NAME_BPS_GTE)
  private Long bpsGte;

  public static final String SERIALIZED_NAME_BPS_IN = "bps_in";
  @SerializedName(SERIALIZED_NAME_BPS_IN)
  private List<Long> bpsIn = null;

  public static final String SERIALIZED_NAME_BPS_LT = "bps_lt";
  @SerializedName(SERIALIZED_NAME_BPS_LT)
  private Long bpsLt;

  public static final String SERIALIZED_NAME_BPS_LTE = "bps_lte";
  @SerializedName(SERIALIZED_NAME_BPS_LTE)
  private Long bpsLte;

  public static final String SERIALIZED_NAME_BPS_MAX = "bps_max";
  @SerializedName(SERIALIZED_NAME_BPS_MAX)
  private Long bpsMax;

  public static final String SERIALIZED_NAME_BPS_MAX_GT = "bps_max_gt";
  @SerializedName(SERIALIZED_NAME_BPS_MAX_GT)
  private Long bpsMaxGt;

  public static final String SERIALIZED_NAME_BPS_MAX_GTE = "bps_max_gte";
  @SerializedName(SERIALIZED_NAME_BPS_MAX_GTE)
  private Long bpsMaxGte;

  public static final String SERIALIZED_NAME_BPS_MAX_IN = "bps_max_in";
  @SerializedName(SERIALIZED_NAME_BPS_MAX_IN)
  private List<Long> bpsMaxIn = null;

  public static final String SERIALIZED_NAME_BPS_MAX_LENGTH = "bps_max_length";
  @SerializedName(SERIALIZED_NAME_BPS_MAX_LENGTH)
  private Long bpsMaxLength;

  public static final String SERIALIZED_NAME_BPS_MAX_LENGTH_GT = "bps_max_length_gt";
  @SerializedName(SERIALIZED_NAME_BPS_MAX_LENGTH_GT)
  private Long bpsMaxLengthGt;

  public static final String SERIALIZED_NAME_BPS_MAX_LENGTH_GTE = "bps_max_length_gte";
  @SerializedName(SERIALIZED_NAME_BPS_MAX_LENGTH_GTE)
  private Long bpsMaxLengthGte;

  public static final String SERIALIZED_NAME_BPS_MAX_LENGTH_IN = "bps_max_length_in";
  @SerializedName(SERIALIZED_NAME_BPS_MAX_LENGTH_IN)
  private List<Long> bpsMaxLengthIn = null;

  public static final String SERIALIZED_NAME_BPS_MAX_LENGTH_LT = "bps_max_length_lt";
  @SerializedName(SERIALIZED_NAME_BPS_MAX_LENGTH_LT)
  private Long bpsMaxLengthLt;

  public static final String SERIALIZED_NAME_BPS_MAX_LENGTH_LTE = "bps_max_length_lte";
  @SerializedName(SERIALIZED_NAME_BPS_MAX_LENGTH_LTE)
  private Long bpsMaxLengthLte;

  public static final String SERIALIZED_NAME_BPS_MAX_LENGTH_NOT = "bps_max_length_not";
  @SerializedName(SERIALIZED_NAME_BPS_MAX_LENGTH_NOT)
  private Long bpsMaxLengthNot;

  public static final String SERIALIZED_NAME_BPS_MAX_LENGTH_NOT_IN = "bps_max_length_not_in";
  @SerializedName(SERIALIZED_NAME_BPS_MAX_LENGTH_NOT_IN)
  private List<Long> bpsMaxLengthNotIn = null;

  public static final String SERIALIZED_NAME_BPS_MAX_LT = "bps_max_lt";
  @SerializedName(SERIALIZED_NAME_BPS_MAX_LT)
  private Long bpsMaxLt;

  public static final String SERIALIZED_NAME_BPS_MAX_LTE = "bps_max_lte";
  @SerializedName(SERIALIZED_NAME_BPS_MAX_LTE)
  private Long bpsMaxLte;

  public static final String SERIALIZED_NAME_BPS_MAX_NOT = "bps_max_not";
  @SerializedName(SERIALIZED_NAME_BPS_MAX_NOT)
  private Long bpsMaxNot;

  public static final String SERIALIZED_NAME_BPS_MAX_NOT_IN = "bps_max_not_in";
  @SerializedName(SERIALIZED_NAME_BPS_MAX_NOT_IN)
  private List<Long> bpsMaxNotIn = null;

  public static final String SERIALIZED_NAME_BPS_NOT = "bps_not";
  @SerializedName(SERIALIZED_NAME_BPS_NOT)
  private Long bpsNot;

  public static final String SERIALIZED_NAME_BPS_NOT_IN = "bps_not_in";
  @SerializedName(SERIALIZED_NAME_BPS_NOT_IN)
  private List<Long> bpsNotIn = null;

  public static final String SERIALIZED_NAME_BPS_RD = "bps_rd";
  @SerializedName(SERIALIZED_NAME_BPS_RD)
  private Long bpsRd;

  public static final String SERIALIZED_NAME_BPS_RD_GT = "bps_rd_gt";
  @SerializedName(SERIALIZED_NAME_BPS_RD_GT)
  private Long bpsRdGt;

  public static final String SERIALIZED_NAME_BPS_RD_GTE = "bps_rd_gte";
  @SerializedName(SERIALIZED_NAME_BPS_RD_GTE)
  private Long bpsRdGte;

  public static final String SERIALIZED_NAME_BPS_RD_IN = "bps_rd_in";
  @SerializedName(SERIALIZED_NAME_BPS_RD_IN)
  private List<Long> bpsRdIn = null;

  public static final String SERIALIZED_NAME_BPS_RD_LT = "bps_rd_lt";
  @SerializedName(SERIALIZED_NAME_BPS_RD_LT)
  private Long bpsRdLt;

  public static final String SERIALIZED_NAME_BPS_RD_LTE = "bps_rd_lte";
  @SerializedName(SERIALIZED_NAME_BPS_RD_LTE)
  private Long bpsRdLte;

  public static final String SERIALIZED_NAME_BPS_RD_MAX = "bps_rd_max";
  @SerializedName(SERIALIZED_NAME_BPS_RD_MAX)
  private Long bpsRdMax;

  public static final String SERIALIZED_NAME_BPS_RD_MAX_GT = "bps_rd_max_gt";
  @SerializedName(SERIALIZED_NAME_BPS_RD_MAX_GT)
  private Long bpsRdMaxGt;

  public static final String SERIALIZED_NAME_BPS_RD_MAX_GTE = "bps_rd_max_gte";
  @SerializedName(SERIALIZED_NAME_BPS_RD_MAX_GTE)
  private Long bpsRdMaxGte;

  public static final String SERIALIZED_NAME_BPS_RD_MAX_IN = "bps_rd_max_in";
  @SerializedName(SERIALIZED_NAME_BPS_RD_MAX_IN)
  private List<Long> bpsRdMaxIn = null;

  public static final String SERIALIZED_NAME_BPS_RD_MAX_LENGTH = "bps_rd_max_length";
  @SerializedName(SERIALIZED_NAME_BPS_RD_MAX_LENGTH)
  private Long bpsRdMaxLength;

  public static final String SERIALIZED_NAME_BPS_RD_MAX_LENGTH_GT = "bps_rd_max_length_gt";
  @SerializedName(SERIALIZED_NAME_BPS_RD_MAX_LENGTH_GT)
  private Long bpsRdMaxLengthGt;

  public static final String SERIALIZED_NAME_BPS_RD_MAX_LENGTH_GTE = "bps_rd_max_length_gte";
  @SerializedName(SERIALIZED_NAME_BPS_RD_MAX_LENGTH_GTE)
  private Long bpsRdMaxLengthGte;

  public static final String SERIALIZED_NAME_BPS_RD_MAX_LENGTH_IN = "bps_rd_max_length_in";
  @SerializedName(SERIALIZED_NAME_BPS_RD_MAX_LENGTH_IN)
  private List<Long> bpsRdMaxLengthIn = null;

  public static final String SERIALIZED_NAME_BPS_RD_MAX_LENGTH_LT = "bps_rd_max_length_lt";
  @SerializedName(SERIALIZED_NAME_BPS_RD_MAX_LENGTH_LT)
  private Long bpsRdMaxLengthLt;

  public static final String SERIALIZED_NAME_BPS_RD_MAX_LENGTH_LTE = "bps_rd_max_length_lte";
  @SerializedName(SERIALIZED_NAME_BPS_RD_MAX_LENGTH_LTE)
  private Long bpsRdMaxLengthLte;

  public static final String SERIALIZED_NAME_BPS_RD_MAX_LENGTH_NOT = "bps_rd_max_length_not";
  @SerializedName(SERIALIZED_NAME_BPS_RD_MAX_LENGTH_NOT)
  private Long bpsRdMaxLengthNot;

  public static final String SERIALIZED_NAME_BPS_RD_MAX_LENGTH_NOT_IN = "bps_rd_max_length_not_in";
  @SerializedName(SERIALIZED_NAME_BPS_RD_MAX_LENGTH_NOT_IN)
  private List<Long> bpsRdMaxLengthNotIn = null;

  public static final String SERIALIZED_NAME_BPS_RD_MAX_LT = "bps_rd_max_lt";
  @SerializedName(SERIALIZED_NAME_BPS_RD_MAX_LT)
  private Long bpsRdMaxLt;

  public static final String SERIALIZED_NAME_BPS_RD_MAX_LTE = "bps_rd_max_lte";
  @SerializedName(SERIALIZED_NAME_BPS_RD_MAX_LTE)
  private Long bpsRdMaxLte;

  public static final String SERIALIZED_NAME_BPS_RD_MAX_NOT = "bps_rd_max_not";
  @SerializedName(SERIALIZED_NAME_BPS_RD_MAX_NOT)
  private Long bpsRdMaxNot;

  public static final String SERIALIZED_NAME_BPS_RD_MAX_NOT_IN = "bps_rd_max_not_in";
  @SerializedName(SERIALIZED_NAME_BPS_RD_MAX_NOT_IN)
  private List<Long> bpsRdMaxNotIn = null;

  public static final String SERIALIZED_NAME_BPS_RD_NOT = "bps_rd_not";
  @SerializedName(SERIALIZED_NAME_BPS_RD_NOT)
  private Long bpsRdNot;

  public static final String SERIALIZED_NAME_BPS_RD_NOT_IN = "bps_rd_not_in";
  @SerializedName(SERIALIZED_NAME_BPS_RD_NOT_IN)
  private List<Long> bpsRdNotIn = null;

  public static final String SERIALIZED_NAME_BPS_WR = "bps_wr";
  @SerializedName(SERIALIZED_NAME_BPS_WR)
  private Long bpsWr;

  public static final String SERIALIZED_NAME_BPS_WR_GT = "bps_wr_gt";
  @SerializedName(SERIALIZED_NAME_BPS_WR_GT)
  private Long bpsWrGt;

  public static final String SERIALIZED_NAME_BPS_WR_GTE = "bps_wr_gte";
  @SerializedName(SERIALIZED_NAME_BPS_WR_GTE)
  private Long bpsWrGte;

  public static final String SERIALIZED_NAME_BPS_WR_IN = "bps_wr_in";
  @SerializedName(SERIALIZED_NAME_BPS_WR_IN)
  private List<Long> bpsWrIn = null;

  public static final String SERIALIZED_NAME_BPS_WR_LT = "bps_wr_lt";
  @SerializedName(SERIALIZED_NAME_BPS_WR_LT)
  private Long bpsWrLt;

  public static final String SERIALIZED_NAME_BPS_WR_LTE = "bps_wr_lte";
  @SerializedName(SERIALIZED_NAME_BPS_WR_LTE)
  private Long bpsWrLte;

  public static final String SERIALIZED_NAME_BPS_WR_MAX = "bps_wr_max";
  @SerializedName(SERIALIZED_NAME_BPS_WR_MAX)
  private Long bpsWrMax;

  public static final String SERIALIZED_NAME_BPS_WR_MAX_GT = "bps_wr_max_gt";
  @SerializedName(SERIALIZED_NAME_BPS_WR_MAX_GT)
  private Long bpsWrMaxGt;

  public static final String SERIALIZED_NAME_BPS_WR_MAX_GTE = "bps_wr_max_gte";
  @SerializedName(SERIALIZED_NAME_BPS_WR_MAX_GTE)
  private Long bpsWrMaxGte;

  public static final String SERIALIZED_NAME_BPS_WR_MAX_IN = "bps_wr_max_in";
  @SerializedName(SERIALIZED_NAME_BPS_WR_MAX_IN)
  private List<Long> bpsWrMaxIn = null;

  public static final String SERIALIZED_NAME_BPS_WR_MAX_LENGTH = "bps_wr_max_length";
  @SerializedName(SERIALIZED_NAME_BPS_WR_MAX_LENGTH)
  private Long bpsWrMaxLength;

  public static final String SERIALIZED_NAME_BPS_WR_MAX_LENGTH_GT = "bps_wr_max_length_gt";
  @SerializedName(SERIALIZED_NAME_BPS_WR_MAX_LENGTH_GT)
  private Long bpsWrMaxLengthGt;

  public static final String SERIALIZED_NAME_BPS_WR_MAX_LENGTH_GTE = "bps_wr_max_length_gte";
  @SerializedName(SERIALIZED_NAME_BPS_WR_MAX_LENGTH_GTE)
  private Long bpsWrMaxLengthGte;

  public static final String SERIALIZED_NAME_BPS_WR_MAX_LENGTH_IN = "bps_wr_max_length_in";
  @SerializedName(SERIALIZED_NAME_BPS_WR_MAX_LENGTH_IN)
  private List<Long> bpsWrMaxLengthIn = null;

  public static final String SERIALIZED_NAME_BPS_WR_MAX_LENGTH_LT = "bps_wr_max_length_lt";
  @SerializedName(SERIALIZED_NAME_BPS_WR_MAX_LENGTH_LT)
  private Long bpsWrMaxLengthLt;

  public static final String SERIALIZED_NAME_BPS_WR_MAX_LENGTH_LTE = "bps_wr_max_length_lte";
  @SerializedName(SERIALIZED_NAME_BPS_WR_MAX_LENGTH_LTE)
  private Long bpsWrMaxLengthLte;

  public static final String SERIALIZED_NAME_BPS_WR_MAX_LENGTH_NOT = "bps_wr_max_length_not";
  @SerializedName(SERIALIZED_NAME_BPS_WR_MAX_LENGTH_NOT)
  private Long bpsWrMaxLengthNot;

  public static final String SERIALIZED_NAME_BPS_WR_MAX_LENGTH_NOT_IN = "bps_wr_max_length_not_in";
  @SerializedName(SERIALIZED_NAME_BPS_WR_MAX_LENGTH_NOT_IN)
  private List<Long> bpsWrMaxLengthNotIn = null;

  public static final String SERIALIZED_NAME_BPS_WR_MAX_LT = "bps_wr_max_lt";
  @SerializedName(SERIALIZED_NAME_BPS_WR_MAX_LT)
  private Long bpsWrMaxLt;

  public static final String SERIALIZED_NAME_BPS_WR_MAX_LTE = "bps_wr_max_lte";
  @SerializedName(SERIALIZED_NAME_BPS_WR_MAX_LTE)
  private Long bpsWrMaxLte;

  public static final String SERIALIZED_NAME_BPS_WR_MAX_NOT = "bps_wr_max_not";
  @SerializedName(SERIALIZED_NAME_BPS_WR_MAX_NOT)
  private Long bpsWrMaxNot;

  public static final String SERIALIZED_NAME_BPS_WR_MAX_NOT_IN = "bps_wr_max_not_in";
  @SerializedName(SERIALIZED_NAME_BPS_WR_MAX_NOT_IN)
  private List<Long> bpsWrMaxNotIn = null;

  public static final String SERIALIZED_NAME_BPS_WR_NOT = "bps_wr_not";
  @SerializedName(SERIALIZED_NAME_BPS_WR_NOT)
  private Long bpsWrNot;

  public static final String SERIALIZED_NAME_BPS_WR_NOT_IN = "bps_wr_not_in";
  @SerializedName(SERIALIZED_NAME_BPS_WR_NOT_IN)
  private List<Long> bpsWrNotIn = null;

  public static final String SERIALIZED_NAME_ENTITY_ASYNC_STATUS = "entityAsyncStatus";
  @SerializedName(SERIALIZED_NAME_ENTITY_ASYNC_STATUS)
  private EntityAsyncStatus entityAsyncStatus;

  public static final String SERIALIZED_NAME_ENTITY_ASYNC_STATUS_IN = "entityAsyncStatus_in";
  @SerializedName(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_IN)
  private List<EntityAsyncStatus> entityAsyncStatusIn = null;

  public static final String SERIALIZED_NAME_ENTITY_ASYNC_STATUS_NOT = "entityAsyncStatus_not";
  @SerializedName(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_NOT)
  private EntityAsyncStatus entityAsyncStatusNot;

  public static final String SERIALIZED_NAME_ENTITY_ASYNC_STATUS_NOT_IN = "entityAsyncStatus_not_in";
  @SerializedName(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_NOT_IN)
  private List<EntityAsyncStatus> entityAsyncStatusNotIn = null;

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

  public static final String SERIALIZED_NAME_IO_SIZE = "io_size";
  @SerializedName(SERIALIZED_NAME_IO_SIZE)
  private Long ioSize;

  public static final String SERIALIZED_NAME_IO_SIZE_GT = "io_size_gt";
  @SerializedName(SERIALIZED_NAME_IO_SIZE_GT)
  private Long ioSizeGt;

  public static final String SERIALIZED_NAME_IO_SIZE_GTE = "io_size_gte";
  @SerializedName(SERIALIZED_NAME_IO_SIZE_GTE)
  private Long ioSizeGte;

  public static final String SERIALIZED_NAME_IO_SIZE_IN = "io_size_in";
  @SerializedName(SERIALIZED_NAME_IO_SIZE_IN)
  private List<Long> ioSizeIn = null;

  public static final String SERIALIZED_NAME_IO_SIZE_LT = "io_size_lt";
  @SerializedName(SERIALIZED_NAME_IO_SIZE_LT)
  private Long ioSizeLt;

  public static final String SERIALIZED_NAME_IO_SIZE_LTE = "io_size_lte";
  @SerializedName(SERIALIZED_NAME_IO_SIZE_LTE)
  private Long ioSizeLte;

  public static final String SERIALIZED_NAME_IO_SIZE_NOT = "io_size_not";
  @SerializedName(SERIALIZED_NAME_IO_SIZE_NOT)
  private Long ioSizeNot;

  public static final String SERIALIZED_NAME_IO_SIZE_NOT_IN = "io_size_not_in";
  @SerializedName(SERIALIZED_NAME_IO_SIZE_NOT_IN)
  private List<Long> ioSizeNotIn = null;

  public static final String SERIALIZED_NAME_IOPS = "iops";
  @SerializedName(SERIALIZED_NAME_IOPS)
  private Long iops;

  public static final String SERIALIZED_NAME_IOPS_GT = "iops_gt";
  @SerializedName(SERIALIZED_NAME_IOPS_GT)
  private Long iopsGt;

  public static final String SERIALIZED_NAME_IOPS_GTE = "iops_gte";
  @SerializedName(SERIALIZED_NAME_IOPS_GTE)
  private Long iopsGte;

  public static final String SERIALIZED_NAME_IOPS_IN = "iops_in";
  @SerializedName(SERIALIZED_NAME_IOPS_IN)
  private List<Long> iopsIn = null;

  public static final String SERIALIZED_NAME_IOPS_LT = "iops_lt";
  @SerializedName(SERIALIZED_NAME_IOPS_LT)
  private Long iopsLt;

  public static final String SERIALIZED_NAME_IOPS_LTE = "iops_lte";
  @SerializedName(SERIALIZED_NAME_IOPS_LTE)
  private Long iopsLte;

  public static final String SERIALIZED_NAME_IOPS_MAX = "iops_max";
  @SerializedName(SERIALIZED_NAME_IOPS_MAX)
  private Long iopsMax;

  public static final String SERIALIZED_NAME_IOPS_MAX_GT = "iops_max_gt";
  @SerializedName(SERIALIZED_NAME_IOPS_MAX_GT)
  private Long iopsMaxGt;

  public static final String SERIALIZED_NAME_IOPS_MAX_GTE = "iops_max_gte";
  @SerializedName(SERIALIZED_NAME_IOPS_MAX_GTE)
  private Long iopsMaxGte;

  public static final String SERIALIZED_NAME_IOPS_MAX_IN = "iops_max_in";
  @SerializedName(SERIALIZED_NAME_IOPS_MAX_IN)
  private List<Long> iopsMaxIn = null;

  public static final String SERIALIZED_NAME_IOPS_MAX_LENGTH = "iops_max_length";
  @SerializedName(SERIALIZED_NAME_IOPS_MAX_LENGTH)
  private Long iopsMaxLength;

  public static final String SERIALIZED_NAME_IOPS_MAX_LENGTH_GT = "iops_max_length_gt";
  @SerializedName(SERIALIZED_NAME_IOPS_MAX_LENGTH_GT)
  private Long iopsMaxLengthGt;

  public static final String SERIALIZED_NAME_IOPS_MAX_LENGTH_GTE = "iops_max_length_gte";
  @SerializedName(SERIALIZED_NAME_IOPS_MAX_LENGTH_GTE)
  private Long iopsMaxLengthGte;

  public static final String SERIALIZED_NAME_IOPS_MAX_LENGTH_IN = "iops_max_length_in";
  @SerializedName(SERIALIZED_NAME_IOPS_MAX_LENGTH_IN)
  private List<Long> iopsMaxLengthIn = null;

  public static final String SERIALIZED_NAME_IOPS_MAX_LENGTH_LT = "iops_max_length_lt";
  @SerializedName(SERIALIZED_NAME_IOPS_MAX_LENGTH_LT)
  private Long iopsMaxLengthLt;

  public static final String SERIALIZED_NAME_IOPS_MAX_LENGTH_LTE = "iops_max_length_lte";
  @SerializedName(SERIALIZED_NAME_IOPS_MAX_LENGTH_LTE)
  private Long iopsMaxLengthLte;

  public static final String SERIALIZED_NAME_IOPS_MAX_LENGTH_NOT = "iops_max_length_not";
  @SerializedName(SERIALIZED_NAME_IOPS_MAX_LENGTH_NOT)
  private Long iopsMaxLengthNot;

  public static final String SERIALIZED_NAME_IOPS_MAX_LENGTH_NOT_IN = "iops_max_length_not_in";
  @SerializedName(SERIALIZED_NAME_IOPS_MAX_LENGTH_NOT_IN)
  private List<Long> iopsMaxLengthNotIn = null;

  public static final String SERIALIZED_NAME_IOPS_MAX_LT = "iops_max_lt";
  @SerializedName(SERIALIZED_NAME_IOPS_MAX_LT)
  private Long iopsMaxLt;

  public static final String SERIALIZED_NAME_IOPS_MAX_LTE = "iops_max_lte";
  @SerializedName(SERIALIZED_NAME_IOPS_MAX_LTE)
  private Long iopsMaxLte;

  public static final String SERIALIZED_NAME_IOPS_MAX_NOT = "iops_max_not";
  @SerializedName(SERIALIZED_NAME_IOPS_MAX_NOT)
  private Long iopsMaxNot;

  public static final String SERIALIZED_NAME_IOPS_MAX_NOT_IN = "iops_max_not_in";
  @SerializedName(SERIALIZED_NAME_IOPS_MAX_NOT_IN)
  private List<Long> iopsMaxNotIn = null;

  public static final String SERIALIZED_NAME_IOPS_NOT = "iops_not";
  @SerializedName(SERIALIZED_NAME_IOPS_NOT)
  private Long iopsNot;

  public static final String SERIALIZED_NAME_IOPS_NOT_IN = "iops_not_in";
  @SerializedName(SERIALIZED_NAME_IOPS_NOT_IN)
  private List<Long> iopsNotIn = null;

  public static final String SERIALIZED_NAME_IOPS_RD = "iops_rd";
  @SerializedName(SERIALIZED_NAME_IOPS_RD)
  private Long iopsRd;

  public static final String SERIALIZED_NAME_IOPS_RD_GT = "iops_rd_gt";
  @SerializedName(SERIALIZED_NAME_IOPS_RD_GT)
  private Long iopsRdGt;

  public static final String SERIALIZED_NAME_IOPS_RD_GTE = "iops_rd_gte";
  @SerializedName(SERIALIZED_NAME_IOPS_RD_GTE)
  private Long iopsRdGte;

  public static final String SERIALIZED_NAME_IOPS_RD_IN = "iops_rd_in";
  @SerializedName(SERIALIZED_NAME_IOPS_RD_IN)
  private List<Long> iopsRdIn = null;

  public static final String SERIALIZED_NAME_IOPS_RD_LT = "iops_rd_lt";
  @SerializedName(SERIALIZED_NAME_IOPS_RD_LT)
  private Long iopsRdLt;

  public static final String SERIALIZED_NAME_IOPS_RD_LTE = "iops_rd_lte";
  @SerializedName(SERIALIZED_NAME_IOPS_RD_LTE)
  private Long iopsRdLte;

  public static final String SERIALIZED_NAME_IOPS_RD_MAX = "iops_rd_max";
  @SerializedName(SERIALIZED_NAME_IOPS_RD_MAX)
  private Long iopsRdMax;

  public static final String SERIALIZED_NAME_IOPS_RD_MAX_GT = "iops_rd_max_gt";
  @SerializedName(SERIALIZED_NAME_IOPS_RD_MAX_GT)
  private Long iopsRdMaxGt;

  public static final String SERIALIZED_NAME_IOPS_RD_MAX_GTE = "iops_rd_max_gte";
  @SerializedName(SERIALIZED_NAME_IOPS_RD_MAX_GTE)
  private Long iopsRdMaxGte;

  public static final String SERIALIZED_NAME_IOPS_RD_MAX_IN = "iops_rd_max_in";
  @SerializedName(SERIALIZED_NAME_IOPS_RD_MAX_IN)
  private List<Long> iopsRdMaxIn = null;

  public static final String SERIALIZED_NAME_IOPS_RD_MAX_LENGTH = "iops_rd_max_length";
  @SerializedName(SERIALIZED_NAME_IOPS_RD_MAX_LENGTH)
  private Long iopsRdMaxLength;

  public static final String SERIALIZED_NAME_IOPS_RD_MAX_LENGTH_GT = "iops_rd_max_length_gt";
  @SerializedName(SERIALIZED_NAME_IOPS_RD_MAX_LENGTH_GT)
  private Long iopsRdMaxLengthGt;

  public static final String SERIALIZED_NAME_IOPS_RD_MAX_LENGTH_GTE = "iops_rd_max_length_gte";
  @SerializedName(SERIALIZED_NAME_IOPS_RD_MAX_LENGTH_GTE)
  private Long iopsRdMaxLengthGte;

  public static final String SERIALIZED_NAME_IOPS_RD_MAX_LENGTH_IN = "iops_rd_max_length_in";
  @SerializedName(SERIALIZED_NAME_IOPS_RD_MAX_LENGTH_IN)
  private List<Long> iopsRdMaxLengthIn = null;

  public static final String SERIALIZED_NAME_IOPS_RD_MAX_LENGTH_LT = "iops_rd_max_length_lt";
  @SerializedName(SERIALIZED_NAME_IOPS_RD_MAX_LENGTH_LT)
  private Long iopsRdMaxLengthLt;

  public static final String SERIALIZED_NAME_IOPS_RD_MAX_LENGTH_LTE = "iops_rd_max_length_lte";
  @SerializedName(SERIALIZED_NAME_IOPS_RD_MAX_LENGTH_LTE)
  private Long iopsRdMaxLengthLte;

  public static final String SERIALIZED_NAME_IOPS_RD_MAX_LENGTH_NOT = "iops_rd_max_length_not";
  @SerializedName(SERIALIZED_NAME_IOPS_RD_MAX_LENGTH_NOT)
  private Long iopsRdMaxLengthNot;

  public static final String SERIALIZED_NAME_IOPS_RD_MAX_LENGTH_NOT_IN = "iops_rd_max_length_not_in";
  @SerializedName(SERIALIZED_NAME_IOPS_RD_MAX_LENGTH_NOT_IN)
  private List<Long> iopsRdMaxLengthNotIn = null;

  public static final String SERIALIZED_NAME_IOPS_RD_MAX_LT = "iops_rd_max_lt";
  @SerializedName(SERIALIZED_NAME_IOPS_RD_MAX_LT)
  private Long iopsRdMaxLt;

  public static final String SERIALIZED_NAME_IOPS_RD_MAX_LTE = "iops_rd_max_lte";
  @SerializedName(SERIALIZED_NAME_IOPS_RD_MAX_LTE)
  private Long iopsRdMaxLte;

  public static final String SERIALIZED_NAME_IOPS_RD_MAX_NOT = "iops_rd_max_not";
  @SerializedName(SERIALIZED_NAME_IOPS_RD_MAX_NOT)
  private Long iopsRdMaxNot;

  public static final String SERIALIZED_NAME_IOPS_RD_MAX_NOT_IN = "iops_rd_max_not_in";
  @SerializedName(SERIALIZED_NAME_IOPS_RD_MAX_NOT_IN)
  private List<Long> iopsRdMaxNotIn = null;

  public static final String SERIALIZED_NAME_IOPS_RD_NOT = "iops_rd_not";
  @SerializedName(SERIALIZED_NAME_IOPS_RD_NOT)
  private Long iopsRdNot;

  public static final String SERIALIZED_NAME_IOPS_RD_NOT_IN = "iops_rd_not_in";
  @SerializedName(SERIALIZED_NAME_IOPS_RD_NOT_IN)
  private List<Long> iopsRdNotIn = null;

  public static final String SERIALIZED_NAME_IOPS_WR = "iops_wr";
  @SerializedName(SERIALIZED_NAME_IOPS_WR)
  private Long iopsWr;

  public static final String SERIALIZED_NAME_IOPS_WR_GT = "iops_wr_gt";
  @SerializedName(SERIALIZED_NAME_IOPS_WR_GT)
  private Long iopsWrGt;

  public static final String SERIALIZED_NAME_IOPS_WR_GTE = "iops_wr_gte";
  @SerializedName(SERIALIZED_NAME_IOPS_WR_GTE)
  private Long iopsWrGte;

  public static final String SERIALIZED_NAME_IOPS_WR_IN = "iops_wr_in";
  @SerializedName(SERIALIZED_NAME_IOPS_WR_IN)
  private List<Long> iopsWrIn = null;

  public static final String SERIALIZED_NAME_IOPS_WR_LT = "iops_wr_lt";
  @SerializedName(SERIALIZED_NAME_IOPS_WR_LT)
  private Long iopsWrLt;

  public static final String SERIALIZED_NAME_IOPS_WR_LTE = "iops_wr_lte";
  @SerializedName(SERIALIZED_NAME_IOPS_WR_LTE)
  private Long iopsWrLte;

  public static final String SERIALIZED_NAME_IOPS_WR_MAX = "iops_wr_max";
  @SerializedName(SERIALIZED_NAME_IOPS_WR_MAX)
  private Long iopsWrMax;

  public static final String SERIALIZED_NAME_IOPS_WR_MAX_GT = "iops_wr_max_gt";
  @SerializedName(SERIALIZED_NAME_IOPS_WR_MAX_GT)
  private Long iopsWrMaxGt;

  public static final String SERIALIZED_NAME_IOPS_WR_MAX_GTE = "iops_wr_max_gte";
  @SerializedName(SERIALIZED_NAME_IOPS_WR_MAX_GTE)
  private Long iopsWrMaxGte;

  public static final String SERIALIZED_NAME_IOPS_WR_MAX_IN = "iops_wr_max_in";
  @SerializedName(SERIALIZED_NAME_IOPS_WR_MAX_IN)
  private List<Long> iopsWrMaxIn = null;

  public static final String SERIALIZED_NAME_IOPS_WR_MAX_LENGTH = "iops_wr_max_length";
  @SerializedName(SERIALIZED_NAME_IOPS_WR_MAX_LENGTH)
  private Long iopsWrMaxLength;

  public static final String SERIALIZED_NAME_IOPS_WR_MAX_LENGTH_GT = "iops_wr_max_length_gt";
  @SerializedName(SERIALIZED_NAME_IOPS_WR_MAX_LENGTH_GT)
  private Long iopsWrMaxLengthGt;

  public static final String SERIALIZED_NAME_IOPS_WR_MAX_LENGTH_GTE = "iops_wr_max_length_gte";
  @SerializedName(SERIALIZED_NAME_IOPS_WR_MAX_LENGTH_GTE)
  private Long iopsWrMaxLengthGte;

  public static final String SERIALIZED_NAME_IOPS_WR_MAX_LENGTH_IN = "iops_wr_max_length_in";
  @SerializedName(SERIALIZED_NAME_IOPS_WR_MAX_LENGTH_IN)
  private List<Long> iopsWrMaxLengthIn = null;

  public static final String SERIALIZED_NAME_IOPS_WR_MAX_LENGTH_LT = "iops_wr_max_length_lt";
  @SerializedName(SERIALIZED_NAME_IOPS_WR_MAX_LENGTH_LT)
  private Long iopsWrMaxLengthLt;

  public static final String SERIALIZED_NAME_IOPS_WR_MAX_LENGTH_LTE = "iops_wr_max_length_lte";
  @SerializedName(SERIALIZED_NAME_IOPS_WR_MAX_LENGTH_LTE)
  private Long iopsWrMaxLengthLte;

  public static final String SERIALIZED_NAME_IOPS_WR_MAX_LENGTH_NOT = "iops_wr_max_length_not";
  @SerializedName(SERIALIZED_NAME_IOPS_WR_MAX_LENGTH_NOT)
  private Long iopsWrMaxLengthNot;

  public static final String SERIALIZED_NAME_IOPS_WR_MAX_LENGTH_NOT_IN = "iops_wr_max_length_not_in";
  @SerializedName(SERIALIZED_NAME_IOPS_WR_MAX_LENGTH_NOT_IN)
  private List<Long> iopsWrMaxLengthNotIn = null;

  public static final String SERIALIZED_NAME_IOPS_WR_MAX_LT = "iops_wr_max_lt";
  @SerializedName(SERIALIZED_NAME_IOPS_WR_MAX_LT)
  private Long iopsWrMaxLt;

  public static final String SERIALIZED_NAME_IOPS_WR_MAX_LTE = "iops_wr_max_lte";
  @SerializedName(SERIALIZED_NAME_IOPS_WR_MAX_LTE)
  private Long iopsWrMaxLte;

  public static final String SERIALIZED_NAME_IOPS_WR_MAX_NOT = "iops_wr_max_not";
  @SerializedName(SERIALIZED_NAME_IOPS_WR_MAX_NOT)
  private Long iopsWrMaxNot;

  public static final String SERIALIZED_NAME_IOPS_WR_MAX_NOT_IN = "iops_wr_max_not_in";
  @SerializedName(SERIALIZED_NAME_IOPS_WR_MAX_NOT_IN)
  private List<Long> iopsWrMaxNotIn = null;

  public static final String SERIALIZED_NAME_IOPS_WR_NOT = "iops_wr_not";
  @SerializedName(SERIALIZED_NAME_IOPS_WR_NOT)
  private Long iopsWrNot;

  public static final String SERIALIZED_NAME_IOPS_WR_NOT_IN = "iops_wr_not_in";
  @SerializedName(SERIALIZED_NAME_IOPS_WR_NOT_IN)
  private List<Long> iopsWrNotIn = null;

  public static final String SERIALIZED_NAME_ISCSI_TARGET = "iscsi_target";
  @SerializedName(SERIALIZED_NAME_ISCSI_TARGET)
  private IscsiTargetWhereInput iscsiTarget;

  public static final String SERIALIZED_NAME_LABELS_EVERY = "labels_every";
  @SerializedName(SERIALIZED_NAME_LABELS_EVERY)
  private LabelWhereInput labelsEvery;

  public static final String SERIALIZED_NAME_LABELS_NONE = "labels_none";
  @SerializedName(SERIALIZED_NAME_LABELS_NONE)
  private LabelWhereInput labelsNone;

  public static final String SERIALIZED_NAME_LABELS_SOME = "labels_some";
  @SerializedName(SERIALIZED_NAME_LABELS_SOME)
  private LabelWhereInput labelsSome;

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

  public static final String SERIALIZED_NAME_LUN_ID = "lun_id";
  @SerializedName(SERIALIZED_NAME_LUN_ID)
  private Integer lunId;

  public static final String SERIALIZED_NAME_LUN_ID_GT = "lun_id_gt";
  @SerializedName(SERIALIZED_NAME_LUN_ID_GT)
  private Integer lunIdGt;

  public static final String SERIALIZED_NAME_LUN_ID_GTE = "lun_id_gte";
  @SerializedName(SERIALIZED_NAME_LUN_ID_GTE)
  private Integer lunIdGte;

  public static final String SERIALIZED_NAME_LUN_ID_IN = "lun_id_in";
  @SerializedName(SERIALIZED_NAME_LUN_ID_IN)
  private List<Integer> lunIdIn = null;

  public static final String SERIALIZED_NAME_LUN_ID_LT = "lun_id_lt";
  @SerializedName(SERIALIZED_NAME_LUN_ID_LT)
  private Integer lunIdLt;

  public static final String SERIALIZED_NAME_LUN_ID_LTE = "lun_id_lte";
  @SerializedName(SERIALIZED_NAME_LUN_ID_LTE)
  private Integer lunIdLte;

  public static final String SERIALIZED_NAME_LUN_ID_NOT = "lun_id_not";
  @SerializedName(SERIALIZED_NAME_LUN_ID_NOT)
  private Integer lunIdNot;

  public static final String SERIALIZED_NAME_LUN_ID_NOT_IN = "lun_id_not_in";
  @SerializedName(SERIALIZED_NAME_LUN_ID_NOT_IN)
  private List<Integer> lunIdNotIn = null;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NAME_CONTAINS = "name_contains";
  @SerializedName(SERIALIZED_NAME_NAME_CONTAINS)
  private String nameContains;

  public static final String SERIALIZED_NAME_NAME_ENDS_WITH = "name_ends_with";
  @SerializedName(SERIALIZED_NAME_NAME_ENDS_WITH)
  private String nameEndsWith;

  public static final String SERIALIZED_NAME_NAME_GT = "name_gt";
  @SerializedName(SERIALIZED_NAME_NAME_GT)
  private String nameGt;

  public static final String SERIALIZED_NAME_NAME_GTE = "name_gte";
  @SerializedName(SERIALIZED_NAME_NAME_GTE)
  private String nameGte;

  public static final String SERIALIZED_NAME_NAME_IN = "name_in";
  @SerializedName(SERIALIZED_NAME_NAME_IN)
  private List<String> nameIn = null;

  public static final String SERIALIZED_NAME_NAME_LT = "name_lt";
  @SerializedName(SERIALIZED_NAME_NAME_LT)
  private String nameLt;

  public static final String SERIALIZED_NAME_NAME_LTE = "name_lte";
  @SerializedName(SERIALIZED_NAME_NAME_LTE)
  private String nameLte;

  public static final String SERIALIZED_NAME_NAME_NOT = "name_not";
  @SerializedName(SERIALIZED_NAME_NAME_NOT)
  private String nameNot;

  public static final String SERIALIZED_NAME_NAME_NOT_CONTAINS = "name_not_contains";
  @SerializedName(SERIALIZED_NAME_NAME_NOT_CONTAINS)
  private String nameNotContains;

  public static final String SERIALIZED_NAME_NAME_NOT_ENDS_WITH = "name_not_ends_with";
  @SerializedName(SERIALIZED_NAME_NAME_NOT_ENDS_WITH)
  private String nameNotEndsWith;

  public static final String SERIALIZED_NAME_NAME_NOT_IN = "name_not_in";
  @SerializedName(SERIALIZED_NAME_NAME_NOT_IN)
  private List<String> nameNotIn = null;

  public static final String SERIALIZED_NAME_NAME_NOT_STARTS_WITH = "name_not_starts_with";
  @SerializedName(SERIALIZED_NAME_NAME_NOT_STARTS_WITH)
  private String nameNotStartsWith;

  public static final String SERIALIZED_NAME_NAME_STARTS_WITH = "name_starts_with";
  @SerializedName(SERIALIZED_NAME_NAME_STARTS_WITH)
  private String nameStartsWith;

  public static final String SERIALIZED_NAME_REPLICA_NUM = "replica_num";
  @SerializedName(SERIALIZED_NAME_REPLICA_NUM)
  private Integer replicaNum;

  public static final String SERIALIZED_NAME_REPLICA_NUM_GT = "replica_num_gt";
  @SerializedName(SERIALIZED_NAME_REPLICA_NUM_GT)
  private Integer replicaNumGt;

  public static final String SERIALIZED_NAME_REPLICA_NUM_GTE = "replica_num_gte";
  @SerializedName(SERIALIZED_NAME_REPLICA_NUM_GTE)
  private Integer replicaNumGte;

  public static final String SERIALIZED_NAME_REPLICA_NUM_IN = "replica_num_in";
  @SerializedName(SERIALIZED_NAME_REPLICA_NUM_IN)
  private List<Integer> replicaNumIn = null;

  public static final String SERIALIZED_NAME_REPLICA_NUM_LT = "replica_num_lt";
  @SerializedName(SERIALIZED_NAME_REPLICA_NUM_LT)
  private Integer replicaNumLt;

  public static final String SERIALIZED_NAME_REPLICA_NUM_LTE = "replica_num_lte";
  @SerializedName(SERIALIZED_NAME_REPLICA_NUM_LTE)
  private Integer replicaNumLte;

  public static final String SERIALIZED_NAME_REPLICA_NUM_NOT = "replica_num_not";
  @SerializedName(SERIALIZED_NAME_REPLICA_NUM_NOT)
  private Integer replicaNumNot;

  public static final String SERIALIZED_NAME_REPLICA_NUM_NOT_IN = "replica_num_not_in";
  @SerializedName(SERIALIZED_NAME_REPLICA_NUM_NOT_IN)
  private List<Integer> replicaNumNotIn = null;

  public static final String SERIALIZED_NAME_SHARED_SIZE = "shared_size";
  @SerializedName(SERIALIZED_NAME_SHARED_SIZE)
  private Long sharedSize;

  public static final String SERIALIZED_NAME_SHARED_SIZE_GT = "shared_size_gt";
  @SerializedName(SERIALIZED_NAME_SHARED_SIZE_GT)
  private Long sharedSizeGt;

  public static final String SERIALIZED_NAME_SHARED_SIZE_GTE = "shared_size_gte";
  @SerializedName(SERIALIZED_NAME_SHARED_SIZE_GTE)
  private Long sharedSizeGte;

  public static final String SERIALIZED_NAME_SHARED_SIZE_IN = "shared_size_in";
  @SerializedName(SERIALIZED_NAME_SHARED_SIZE_IN)
  private List<Long> sharedSizeIn = null;

  public static final String SERIALIZED_NAME_SHARED_SIZE_LT = "shared_size_lt";
  @SerializedName(SERIALIZED_NAME_SHARED_SIZE_LT)
  private Long sharedSizeLt;

  public static final String SERIALIZED_NAME_SHARED_SIZE_LTE = "shared_size_lte";
  @SerializedName(SERIALIZED_NAME_SHARED_SIZE_LTE)
  private Long sharedSizeLte;

  public static final String SERIALIZED_NAME_SHARED_SIZE_NOT = "shared_size_not";
  @SerializedName(SERIALIZED_NAME_SHARED_SIZE_NOT)
  private Long sharedSizeNot;

  public static final String SERIALIZED_NAME_SHARED_SIZE_NOT_IN = "shared_size_not_in";
  @SerializedName(SERIALIZED_NAME_SHARED_SIZE_NOT_IN)
  private List<Long> sharedSizeNotIn = null;

  public static final String SERIALIZED_NAME_SNAPSHOT_NUM = "snapshot_num";
  @SerializedName(SERIALIZED_NAME_SNAPSHOT_NUM)
  private Integer snapshotNum;

  public static final String SERIALIZED_NAME_SNAPSHOT_NUM_GT = "snapshot_num_gt";
  @SerializedName(SERIALIZED_NAME_SNAPSHOT_NUM_GT)
  private Integer snapshotNumGt;

  public static final String SERIALIZED_NAME_SNAPSHOT_NUM_GTE = "snapshot_num_gte";
  @SerializedName(SERIALIZED_NAME_SNAPSHOT_NUM_GTE)
  private Integer snapshotNumGte;

  public static final String SERIALIZED_NAME_SNAPSHOT_NUM_IN = "snapshot_num_in";
  @SerializedName(SERIALIZED_NAME_SNAPSHOT_NUM_IN)
  private List<Integer> snapshotNumIn = null;

  public static final String SERIALIZED_NAME_SNAPSHOT_NUM_LT = "snapshot_num_lt";
  @SerializedName(SERIALIZED_NAME_SNAPSHOT_NUM_LT)
  private Integer snapshotNumLt;

  public static final String SERIALIZED_NAME_SNAPSHOT_NUM_LTE = "snapshot_num_lte";
  @SerializedName(SERIALIZED_NAME_SNAPSHOT_NUM_LTE)
  private Integer snapshotNumLte;

  public static final String SERIALIZED_NAME_SNAPSHOT_NUM_NOT = "snapshot_num_not";
  @SerializedName(SERIALIZED_NAME_SNAPSHOT_NUM_NOT)
  private Integer snapshotNumNot;

  public static final String SERIALIZED_NAME_SNAPSHOT_NUM_NOT_IN = "snapshot_num_not_in";
  @SerializedName(SERIALIZED_NAME_SNAPSHOT_NUM_NOT_IN)
  private List<Integer> snapshotNumNotIn = null;

  public static final String SERIALIZED_NAME_STRIPE_NUM = "stripe_num";
  @SerializedName(SERIALIZED_NAME_STRIPE_NUM)
  private Integer stripeNum;

  public static final String SERIALIZED_NAME_STRIPE_NUM_GT = "stripe_num_gt";
  @SerializedName(SERIALIZED_NAME_STRIPE_NUM_GT)
  private Integer stripeNumGt;

  public static final String SERIALIZED_NAME_STRIPE_NUM_GTE = "stripe_num_gte";
  @SerializedName(SERIALIZED_NAME_STRIPE_NUM_GTE)
  private Integer stripeNumGte;

  public static final String SERIALIZED_NAME_STRIPE_NUM_IN = "stripe_num_in";
  @SerializedName(SERIALIZED_NAME_STRIPE_NUM_IN)
  private List<Integer> stripeNumIn = null;

  public static final String SERIALIZED_NAME_STRIPE_NUM_LT = "stripe_num_lt";
  @SerializedName(SERIALIZED_NAME_STRIPE_NUM_LT)
  private Integer stripeNumLt;

  public static final String SERIALIZED_NAME_STRIPE_NUM_LTE = "stripe_num_lte";
  @SerializedName(SERIALIZED_NAME_STRIPE_NUM_LTE)
  private Integer stripeNumLte;

  public static final String SERIALIZED_NAME_STRIPE_NUM_NOT = "stripe_num_not";
  @SerializedName(SERIALIZED_NAME_STRIPE_NUM_NOT)
  private Integer stripeNumNot;

  public static final String SERIALIZED_NAME_STRIPE_NUM_NOT_IN = "stripe_num_not_in";
  @SerializedName(SERIALIZED_NAME_STRIPE_NUM_NOT_IN)
  private List<Integer> stripeNumNotIn = null;

  public static final String SERIALIZED_NAME_STRIPE_SIZE = "stripe_size";
  @SerializedName(SERIALIZED_NAME_STRIPE_SIZE)
  private Long stripeSize;

  public static final String SERIALIZED_NAME_STRIPE_SIZE_GT = "stripe_size_gt";
  @SerializedName(SERIALIZED_NAME_STRIPE_SIZE_GT)
  private Long stripeSizeGt;

  public static final String SERIALIZED_NAME_STRIPE_SIZE_GTE = "stripe_size_gte";
  @SerializedName(SERIALIZED_NAME_STRIPE_SIZE_GTE)
  private Long stripeSizeGte;

  public static final String SERIALIZED_NAME_STRIPE_SIZE_IN = "stripe_size_in";
  @SerializedName(SERIALIZED_NAME_STRIPE_SIZE_IN)
  private List<Long> stripeSizeIn = null;

  public static final String SERIALIZED_NAME_STRIPE_SIZE_LT = "stripe_size_lt";
  @SerializedName(SERIALIZED_NAME_STRIPE_SIZE_LT)
  private Long stripeSizeLt;

  public static final String SERIALIZED_NAME_STRIPE_SIZE_LTE = "stripe_size_lte";
  @SerializedName(SERIALIZED_NAME_STRIPE_SIZE_LTE)
  private Long stripeSizeLte;

  public static final String SERIALIZED_NAME_STRIPE_SIZE_NOT = "stripe_size_not";
  @SerializedName(SERIALIZED_NAME_STRIPE_SIZE_NOT)
  private Long stripeSizeNot;

  public static final String SERIALIZED_NAME_STRIPE_SIZE_NOT_IN = "stripe_size_not_in";
  @SerializedName(SERIALIZED_NAME_STRIPE_SIZE_NOT_IN)
  private List<Long> stripeSizeNotIn = null;

  public static final String SERIALIZED_NAME_THIN_PROVISION = "thin_provision";
  @SerializedName(SERIALIZED_NAME_THIN_PROVISION)
  private Boolean thinProvision;

  public static final String SERIALIZED_NAME_THIN_PROVISION_NOT = "thin_provision_not";
  @SerializedName(SERIALIZED_NAME_THIN_PROVISION_NOT)
  private Boolean thinProvisionNot;

  public static final String SERIALIZED_NAME_UNIQUE_LOGICAL_SIZE = "unique_logical_size";
  @SerializedName(SERIALIZED_NAME_UNIQUE_LOGICAL_SIZE)
  private Double uniqueLogicalSize;

  public static final String SERIALIZED_NAME_UNIQUE_LOGICAL_SIZE_GT = "unique_logical_size_gt";
  @SerializedName(SERIALIZED_NAME_UNIQUE_LOGICAL_SIZE_GT)
  private Double uniqueLogicalSizeGt;

  public static final String SERIALIZED_NAME_UNIQUE_LOGICAL_SIZE_GTE = "unique_logical_size_gte";
  @SerializedName(SERIALIZED_NAME_UNIQUE_LOGICAL_SIZE_GTE)
  private Double uniqueLogicalSizeGte;

  public static final String SERIALIZED_NAME_UNIQUE_LOGICAL_SIZE_IN = "unique_logical_size_in";
  @SerializedName(SERIALIZED_NAME_UNIQUE_LOGICAL_SIZE_IN)
  private List<Double> uniqueLogicalSizeIn = null;

  public static final String SERIALIZED_NAME_UNIQUE_LOGICAL_SIZE_LT = "unique_logical_size_lt";
  @SerializedName(SERIALIZED_NAME_UNIQUE_LOGICAL_SIZE_LT)
  private Double uniqueLogicalSizeLt;

  public static final String SERIALIZED_NAME_UNIQUE_LOGICAL_SIZE_LTE = "unique_logical_size_lte";
  @SerializedName(SERIALIZED_NAME_UNIQUE_LOGICAL_SIZE_LTE)
  private Double uniqueLogicalSizeLte;

  public static final String SERIALIZED_NAME_UNIQUE_LOGICAL_SIZE_NOT = "unique_logical_size_not";
  @SerializedName(SERIALIZED_NAME_UNIQUE_LOGICAL_SIZE_NOT)
  private Double uniqueLogicalSizeNot;

  public static final String SERIALIZED_NAME_UNIQUE_LOGICAL_SIZE_NOT_IN = "unique_logical_size_not_in";
  @SerializedName(SERIALIZED_NAME_UNIQUE_LOGICAL_SIZE_NOT_IN)
  private List<Double> uniqueLogicalSizeNotIn = null;

  public static final String SERIALIZED_NAME_UNIQUE_SIZE = "unique_size";
  @SerializedName(SERIALIZED_NAME_UNIQUE_SIZE)
  private Long uniqueSize;

  public static final String SERIALIZED_NAME_UNIQUE_SIZE_GT = "unique_size_gt";
  @SerializedName(SERIALIZED_NAME_UNIQUE_SIZE_GT)
  private Long uniqueSizeGt;

  public static final String SERIALIZED_NAME_UNIQUE_SIZE_GTE = "unique_size_gte";
  @SerializedName(SERIALIZED_NAME_UNIQUE_SIZE_GTE)
  private Long uniqueSizeGte;

  public static final String SERIALIZED_NAME_UNIQUE_SIZE_IN = "unique_size_in";
  @SerializedName(SERIALIZED_NAME_UNIQUE_SIZE_IN)
  private List<Long> uniqueSizeIn = null;

  public static final String SERIALIZED_NAME_UNIQUE_SIZE_LT = "unique_size_lt";
  @SerializedName(SERIALIZED_NAME_UNIQUE_SIZE_LT)
  private Long uniqueSizeLt;

  public static final String SERIALIZED_NAME_UNIQUE_SIZE_LTE = "unique_size_lte";
  @SerializedName(SERIALIZED_NAME_UNIQUE_SIZE_LTE)
  private Long uniqueSizeLte;

  public static final String SERIALIZED_NAME_UNIQUE_SIZE_NOT = "unique_size_not";
  @SerializedName(SERIALIZED_NAME_UNIQUE_SIZE_NOT)
  private Long uniqueSizeNot;

  public static final String SERIALIZED_NAME_UNIQUE_SIZE_NOT_IN = "unique_size_not_in";
  @SerializedName(SERIALIZED_NAME_UNIQUE_SIZE_NOT_IN)
  private List<Long> uniqueSizeNotIn = null;

  public static final String SERIALIZED_NAME_ZBS_VOLUME_ID = "zbs_volume_id";
  @SerializedName(SERIALIZED_NAME_ZBS_VOLUME_ID)
  private String zbsVolumeId;

  public static final String SERIALIZED_NAME_ZBS_VOLUME_ID_CONTAINS = "zbs_volume_id_contains";
  @SerializedName(SERIALIZED_NAME_ZBS_VOLUME_ID_CONTAINS)
  private String zbsVolumeIdContains;

  public static final String SERIALIZED_NAME_ZBS_VOLUME_ID_ENDS_WITH = "zbs_volume_id_ends_with";
  @SerializedName(SERIALIZED_NAME_ZBS_VOLUME_ID_ENDS_WITH)
  private String zbsVolumeIdEndsWith;

  public static final String SERIALIZED_NAME_ZBS_VOLUME_ID_GT = "zbs_volume_id_gt";
  @SerializedName(SERIALIZED_NAME_ZBS_VOLUME_ID_GT)
  private String zbsVolumeIdGt;

  public static final String SERIALIZED_NAME_ZBS_VOLUME_ID_GTE = "zbs_volume_id_gte";
  @SerializedName(SERIALIZED_NAME_ZBS_VOLUME_ID_GTE)
  private String zbsVolumeIdGte;

  public static final String SERIALIZED_NAME_ZBS_VOLUME_ID_IN = "zbs_volume_id_in";
  @SerializedName(SERIALIZED_NAME_ZBS_VOLUME_ID_IN)
  private List<String> zbsVolumeIdIn = null;

  public static final String SERIALIZED_NAME_ZBS_VOLUME_ID_LT = "zbs_volume_id_lt";
  @SerializedName(SERIALIZED_NAME_ZBS_VOLUME_ID_LT)
  private String zbsVolumeIdLt;

  public static final String SERIALIZED_NAME_ZBS_VOLUME_ID_LTE = "zbs_volume_id_lte";
  @SerializedName(SERIALIZED_NAME_ZBS_VOLUME_ID_LTE)
  private String zbsVolumeIdLte;

  public static final String SERIALIZED_NAME_ZBS_VOLUME_ID_NOT = "zbs_volume_id_not";
  @SerializedName(SERIALIZED_NAME_ZBS_VOLUME_ID_NOT)
  private String zbsVolumeIdNot;

  public static final String SERIALIZED_NAME_ZBS_VOLUME_ID_NOT_CONTAINS = "zbs_volume_id_not_contains";
  @SerializedName(SERIALIZED_NAME_ZBS_VOLUME_ID_NOT_CONTAINS)
  private String zbsVolumeIdNotContains;

  public static final String SERIALIZED_NAME_ZBS_VOLUME_ID_NOT_ENDS_WITH = "zbs_volume_id_not_ends_with";
  @SerializedName(SERIALIZED_NAME_ZBS_VOLUME_ID_NOT_ENDS_WITH)
  private String zbsVolumeIdNotEndsWith;

  public static final String SERIALIZED_NAME_ZBS_VOLUME_ID_NOT_IN = "zbs_volume_id_not_in";
  @SerializedName(SERIALIZED_NAME_ZBS_VOLUME_ID_NOT_IN)
  private List<String> zbsVolumeIdNotIn = null;

  public static final String SERIALIZED_NAME_ZBS_VOLUME_ID_NOT_STARTS_WITH = "zbs_volume_id_not_starts_with";
  @SerializedName(SERIALIZED_NAME_ZBS_VOLUME_ID_NOT_STARTS_WITH)
  private String zbsVolumeIdNotStartsWith;

  public static final String SERIALIZED_NAME_ZBS_VOLUME_ID_STARTS_WITH = "zbs_volume_id_starts_with";
  @SerializedName(SERIALIZED_NAME_ZBS_VOLUME_ID_STARTS_WITH)
  private String zbsVolumeIdStartsWith;

  public IscsiLunWhereInput() { 
  }

  public IscsiLunWhereInput AND(List<IscsiLunWhereInput> AND) {
    
    this.AND = AND;
    return this;
  }

  public IscsiLunWhereInput addANDItem(IscsiLunWhereInput ANDItem) {
    if (this.AND == null) {
      this.AND = new ArrayList<IscsiLunWhereInput>();
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

  public List<IscsiLunWhereInput> getAND() {
    return AND;
  }


  public void setAND(List<IscsiLunWhereInput> AND) {
    this.AND = AND;
  }


  public IscsiLunWhereInput NOT(List<IscsiLunWhereInput> NOT) {
    
    this.NOT = NOT;
    return this;
  }

  public IscsiLunWhereInput addNOTItem(IscsiLunWhereInput NOTItem) {
    if (this.NOT == null) {
      this.NOT = new ArrayList<IscsiLunWhereInput>();
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

  public List<IscsiLunWhereInput> getNOT() {
    return NOT;
  }


  public void setNOT(List<IscsiLunWhereInput> NOT) {
    this.NOT = NOT;
  }


  public IscsiLunWhereInput OR(List<IscsiLunWhereInput> OR) {
    
    this.OR = OR;
    return this;
  }

  public IscsiLunWhereInput addORItem(IscsiLunWhereInput ORItem) {
    if (this.OR == null) {
      this.OR = new ArrayList<IscsiLunWhereInput>();
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

  public List<IscsiLunWhereInput> getOR() {
    return OR;
  }


  public void setOR(List<IscsiLunWhereInput> OR) {
    this.OR = OR;
  }


  public IscsiLunWhereInput allowedInitiators(String allowedInitiators) {
    
    this.allowedInitiators = allowedInitiators;
    return this;
  }

   /**
   * Get allowedInitiators
   * @return allowedInitiators
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAllowedInitiators() {
    return allowedInitiators;
  }


  public void setAllowedInitiators(String allowedInitiators) {
    this.allowedInitiators = allowedInitiators;
  }


  public IscsiLunWhereInput allowedInitiatorsContains(String allowedInitiatorsContains) {
    
    this.allowedInitiatorsContains = allowedInitiatorsContains;
    return this;
  }

   /**
   * Get allowedInitiatorsContains
   * @return allowedInitiatorsContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAllowedInitiatorsContains() {
    return allowedInitiatorsContains;
  }


  public void setAllowedInitiatorsContains(String allowedInitiatorsContains) {
    this.allowedInitiatorsContains = allowedInitiatorsContains;
  }


  public IscsiLunWhereInput allowedInitiatorsEndsWith(String allowedInitiatorsEndsWith) {
    
    this.allowedInitiatorsEndsWith = allowedInitiatorsEndsWith;
    return this;
  }

   /**
   * Get allowedInitiatorsEndsWith
   * @return allowedInitiatorsEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAllowedInitiatorsEndsWith() {
    return allowedInitiatorsEndsWith;
  }


  public void setAllowedInitiatorsEndsWith(String allowedInitiatorsEndsWith) {
    this.allowedInitiatorsEndsWith = allowedInitiatorsEndsWith;
  }


  public IscsiLunWhereInput allowedInitiatorsGt(String allowedInitiatorsGt) {
    
    this.allowedInitiatorsGt = allowedInitiatorsGt;
    return this;
  }

   /**
   * Get allowedInitiatorsGt
   * @return allowedInitiatorsGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAllowedInitiatorsGt() {
    return allowedInitiatorsGt;
  }


  public void setAllowedInitiatorsGt(String allowedInitiatorsGt) {
    this.allowedInitiatorsGt = allowedInitiatorsGt;
  }


  public IscsiLunWhereInput allowedInitiatorsGte(String allowedInitiatorsGte) {
    
    this.allowedInitiatorsGte = allowedInitiatorsGte;
    return this;
  }

   /**
   * Get allowedInitiatorsGte
   * @return allowedInitiatorsGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAllowedInitiatorsGte() {
    return allowedInitiatorsGte;
  }


  public void setAllowedInitiatorsGte(String allowedInitiatorsGte) {
    this.allowedInitiatorsGte = allowedInitiatorsGte;
  }


  public IscsiLunWhereInput allowedInitiatorsIn(List<String> allowedInitiatorsIn) {
    
    this.allowedInitiatorsIn = allowedInitiatorsIn;
    return this;
  }

  public IscsiLunWhereInput addAllowedInitiatorsInItem(String allowedInitiatorsInItem) {
    if (this.allowedInitiatorsIn == null) {
      this.allowedInitiatorsIn = new ArrayList<String>();
    }
    this.allowedInitiatorsIn.add(allowedInitiatorsInItem);
    return this;
  }

   /**
   * Get allowedInitiatorsIn
   * @return allowedInitiatorsIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getAllowedInitiatorsIn() {
    return allowedInitiatorsIn;
  }


  public void setAllowedInitiatorsIn(List<String> allowedInitiatorsIn) {
    this.allowedInitiatorsIn = allowedInitiatorsIn;
  }


  public IscsiLunWhereInput allowedInitiatorsLt(String allowedInitiatorsLt) {
    
    this.allowedInitiatorsLt = allowedInitiatorsLt;
    return this;
  }

   /**
   * Get allowedInitiatorsLt
   * @return allowedInitiatorsLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAllowedInitiatorsLt() {
    return allowedInitiatorsLt;
  }


  public void setAllowedInitiatorsLt(String allowedInitiatorsLt) {
    this.allowedInitiatorsLt = allowedInitiatorsLt;
  }


  public IscsiLunWhereInput allowedInitiatorsLte(String allowedInitiatorsLte) {
    
    this.allowedInitiatorsLte = allowedInitiatorsLte;
    return this;
  }

   /**
   * Get allowedInitiatorsLte
   * @return allowedInitiatorsLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAllowedInitiatorsLte() {
    return allowedInitiatorsLte;
  }


  public void setAllowedInitiatorsLte(String allowedInitiatorsLte) {
    this.allowedInitiatorsLte = allowedInitiatorsLte;
  }


  public IscsiLunWhereInput allowedInitiatorsNot(String allowedInitiatorsNot) {
    
    this.allowedInitiatorsNot = allowedInitiatorsNot;
    return this;
  }

   /**
   * Get allowedInitiatorsNot
   * @return allowedInitiatorsNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAllowedInitiatorsNot() {
    return allowedInitiatorsNot;
  }


  public void setAllowedInitiatorsNot(String allowedInitiatorsNot) {
    this.allowedInitiatorsNot = allowedInitiatorsNot;
  }


  public IscsiLunWhereInput allowedInitiatorsNotContains(String allowedInitiatorsNotContains) {
    
    this.allowedInitiatorsNotContains = allowedInitiatorsNotContains;
    return this;
  }

   /**
   * Get allowedInitiatorsNotContains
   * @return allowedInitiatorsNotContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAllowedInitiatorsNotContains() {
    return allowedInitiatorsNotContains;
  }


  public void setAllowedInitiatorsNotContains(String allowedInitiatorsNotContains) {
    this.allowedInitiatorsNotContains = allowedInitiatorsNotContains;
  }


  public IscsiLunWhereInput allowedInitiatorsNotEndsWith(String allowedInitiatorsNotEndsWith) {
    
    this.allowedInitiatorsNotEndsWith = allowedInitiatorsNotEndsWith;
    return this;
  }

   /**
   * Get allowedInitiatorsNotEndsWith
   * @return allowedInitiatorsNotEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAllowedInitiatorsNotEndsWith() {
    return allowedInitiatorsNotEndsWith;
  }


  public void setAllowedInitiatorsNotEndsWith(String allowedInitiatorsNotEndsWith) {
    this.allowedInitiatorsNotEndsWith = allowedInitiatorsNotEndsWith;
  }


  public IscsiLunWhereInput allowedInitiatorsNotIn(List<String> allowedInitiatorsNotIn) {
    
    this.allowedInitiatorsNotIn = allowedInitiatorsNotIn;
    return this;
  }

  public IscsiLunWhereInput addAllowedInitiatorsNotInItem(String allowedInitiatorsNotInItem) {
    if (this.allowedInitiatorsNotIn == null) {
      this.allowedInitiatorsNotIn = new ArrayList<String>();
    }
    this.allowedInitiatorsNotIn.add(allowedInitiatorsNotInItem);
    return this;
  }

   /**
   * Get allowedInitiatorsNotIn
   * @return allowedInitiatorsNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getAllowedInitiatorsNotIn() {
    return allowedInitiatorsNotIn;
  }


  public void setAllowedInitiatorsNotIn(List<String> allowedInitiatorsNotIn) {
    this.allowedInitiatorsNotIn = allowedInitiatorsNotIn;
  }


  public IscsiLunWhereInput allowedInitiatorsNotStartsWith(String allowedInitiatorsNotStartsWith) {
    
    this.allowedInitiatorsNotStartsWith = allowedInitiatorsNotStartsWith;
    return this;
  }

   /**
   * Get allowedInitiatorsNotStartsWith
   * @return allowedInitiatorsNotStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAllowedInitiatorsNotStartsWith() {
    return allowedInitiatorsNotStartsWith;
  }


  public void setAllowedInitiatorsNotStartsWith(String allowedInitiatorsNotStartsWith) {
    this.allowedInitiatorsNotStartsWith = allowedInitiatorsNotStartsWith;
  }


  public IscsiLunWhereInput allowedInitiatorsStartsWith(String allowedInitiatorsStartsWith) {
    
    this.allowedInitiatorsStartsWith = allowedInitiatorsStartsWith;
    return this;
  }

   /**
   * Get allowedInitiatorsStartsWith
   * @return allowedInitiatorsStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAllowedInitiatorsStartsWith() {
    return allowedInitiatorsStartsWith;
  }


  public void setAllowedInitiatorsStartsWith(String allowedInitiatorsStartsWith) {
    this.allowedInitiatorsStartsWith = allowedInitiatorsStartsWith;
  }


  public IscsiLunWhereInput assignedSize(Long assignedSize) {
    
    this.assignedSize = assignedSize;
    return this;
  }

   /**
   * Get assignedSize
   * @return assignedSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getAssignedSize() {
    return assignedSize;
  }


  public void setAssignedSize(Long assignedSize) {
    this.assignedSize = assignedSize;
  }


  public IscsiLunWhereInput assignedSizeGt(Long assignedSizeGt) {
    
    this.assignedSizeGt = assignedSizeGt;
    return this;
  }

   /**
   * Get assignedSizeGt
   * @return assignedSizeGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getAssignedSizeGt() {
    return assignedSizeGt;
  }


  public void setAssignedSizeGt(Long assignedSizeGt) {
    this.assignedSizeGt = assignedSizeGt;
  }


  public IscsiLunWhereInput assignedSizeGte(Long assignedSizeGte) {
    
    this.assignedSizeGte = assignedSizeGte;
    return this;
  }

   /**
   * Get assignedSizeGte
   * @return assignedSizeGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getAssignedSizeGte() {
    return assignedSizeGte;
  }


  public void setAssignedSizeGte(Long assignedSizeGte) {
    this.assignedSizeGte = assignedSizeGte;
  }


  public IscsiLunWhereInput assignedSizeIn(List<Long> assignedSizeIn) {
    
    this.assignedSizeIn = assignedSizeIn;
    return this;
  }

  public IscsiLunWhereInput addAssignedSizeInItem(Long assignedSizeInItem) {
    if (this.assignedSizeIn == null) {
      this.assignedSizeIn = new ArrayList<Long>();
    }
    this.assignedSizeIn.add(assignedSizeInItem);
    return this;
  }

   /**
   * Get assignedSizeIn
   * @return assignedSizeIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Long> getAssignedSizeIn() {
    return assignedSizeIn;
  }


  public void setAssignedSizeIn(List<Long> assignedSizeIn) {
    this.assignedSizeIn = assignedSizeIn;
  }


  public IscsiLunWhereInput assignedSizeLt(Long assignedSizeLt) {
    
    this.assignedSizeLt = assignedSizeLt;
    return this;
  }

   /**
   * Get assignedSizeLt
   * @return assignedSizeLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getAssignedSizeLt() {
    return assignedSizeLt;
  }


  public void setAssignedSizeLt(Long assignedSizeLt) {
    this.assignedSizeLt = assignedSizeLt;
  }


  public IscsiLunWhereInput assignedSizeLte(Long assignedSizeLte) {
    
    this.assignedSizeLte = assignedSizeLte;
    return this;
  }

   /**
   * Get assignedSizeLte
   * @return assignedSizeLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getAssignedSizeLte() {
    return assignedSizeLte;
  }


  public void setAssignedSizeLte(Long assignedSizeLte) {
    this.assignedSizeLte = assignedSizeLte;
  }


  public IscsiLunWhereInput assignedSizeNot(Long assignedSizeNot) {
    
    this.assignedSizeNot = assignedSizeNot;
    return this;
  }

   /**
   * Get assignedSizeNot
   * @return assignedSizeNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getAssignedSizeNot() {
    return assignedSizeNot;
  }


  public void setAssignedSizeNot(Long assignedSizeNot) {
    this.assignedSizeNot = assignedSizeNot;
  }


  public IscsiLunWhereInput assignedSizeNotIn(List<Long> assignedSizeNotIn) {
    
    this.assignedSizeNotIn = assignedSizeNotIn;
    return this;
  }

  public IscsiLunWhereInput addAssignedSizeNotInItem(Long assignedSizeNotInItem) {
    if (this.assignedSizeNotIn == null) {
      this.assignedSizeNotIn = new ArrayList<Long>();
    }
    this.assignedSizeNotIn.add(assignedSizeNotInItem);
    return this;
  }

   /**
   * Get assignedSizeNotIn
   * @return assignedSizeNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Long> getAssignedSizeNotIn() {
    return assignedSizeNotIn;
  }


  public void setAssignedSizeNotIn(List<Long> assignedSizeNotIn) {
    this.assignedSizeNotIn = assignedSizeNotIn;
  }


  public IscsiLunWhereInput bps(Long bps) {
    
    this.bps = bps;
    return this;
  }

   /**
   * Get bps
   * @return bps
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getBps() {
    return bps;
  }


  public void setBps(Long bps) {
    this.bps = bps;
  }


  public IscsiLunWhereInput bpsGt(Long bpsGt) {
    
    this.bpsGt = bpsGt;
    return this;
  }

   /**
   * Get bpsGt
   * @return bpsGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getBpsGt() {
    return bpsGt;
  }


  public void setBpsGt(Long bpsGt) {
    this.bpsGt = bpsGt;
  }


  public IscsiLunWhereInput bpsGte(Long bpsGte) {
    
    this.bpsGte = bpsGte;
    return this;
  }

   /**
   * Get bpsGte
   * @return bpsGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getBpsGte() {
    return bpsGte;
  }


  public void setBpsGte(Long bpsGte) {
    this.bpsGte = bpsGte;
  }


  public IscsiLunWhereInput bpsIn(List<Long> bpsIn) {
    
    this.bpsIn = bpsIn;
    return this;
  }

  public IscsiLunWhereInput addBpsInItem(Long bpsInItem) {
    if (this.bpsIn == null) {
      this.bpsIn = new ArrayList<Long>();
    }
    this.bpsIn.add(bpsInItem);
    return this;
  }

   /**
   * Get bpsIn
   * @return bpsIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Long> getBpsIn() {
    return bpsIn;
  }


  public void setBpsIn(List<Long> bpsIn) {
    this.bpsIn = bpsIn;
  }


  public IscsiLunWhereInput bpsLt(Long bpsLt) {
    
    this.bpsLt = bpsLt;
    return this;
  }

   /**
   * Get bpsLt
   * @return bpsLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getBpsLt() {
    return bpsLt;
  }


  public void setBpsLt(Long bpsLt) {
    this.bpsLt = bpsLt;
  }


  public IscsiLunWhereInput bpsLte(Long bpsLte) {
    
    this.bpsLte = bpsLte;
    return this;
  }

   /**
   * Get bpsLte
   * @return bpsLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getBpsLte() {
    return bpsLte;
  }


  public void setBpsLte(Long bpsLte) {
    this.bpsLte = bpsLte;
  }


  public IscsiLunWhereInput bpsMax(Long bpsMax) {
    
    this.bpsMax = bpsMax;
    return this;
  }

   /**
   * Get bpsMax
   * @return bpsMax
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getBpsMax() {
    return bpsMax;
  }


  public void setBpsMax(Long bpsMax) {
    this.bpsMax = bpsMax;
  }


  public IscsiLunWhereInput bpsMaxGt(Long bpsMaxGt) {
    
    this.bpsMaxGt = bpsMaxGt;
    return this;
  }

   /**
   * Get bpsMaxGt
   * @return bpsMaxGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getBpsMaxGt() {
    return bpsMaxGt;
  }


  public void setBpsMaxGt(Long bpsMaxGt) {
    this.bpsMaxGt = bpsMaxGt;
  }


  public IscsiLunWhereInput bpsMaxGte(Long bpsMaxGte) {
    
    this.bpsMaxGte = bpsMaxGte;
    return this;
  }

   /**
   * Get bpsMaxGte
   * @return bpsMaxGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getBpsMaxGte() {
    return bpsMaxGte;
  }


  public void setBpsMaxGte(Long bpsMaxGte) {
    this.bpsMaxGte = bpsMaxGte;
  }


  public IscsiLunWhereInput bpsMaxIn(List<Long> bpsMaxIn) {
    
    this.bpsMaxIn = bpsMaxIn;
    return this;
  }

  public IscsiLunWhereInput addBpsMaxInItem(Long bpsMaxInItem) {
    if (this.bpsMaxIn == null) {
      this.bpsMaxIn = new ArrayList<Long>();
    }
    this.bpsMaxIn.add(bpsMaxInItem);
    return this;
  }

   /**
   * Get bpsMaxIn
   * @return bpsMaxIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Long> getBpsMaxIn() {
    return bpsMaxIn;
  }


  public void setBpsMaxIn(List<Long> bpsMaxIn) {
    this.bpsMaxIn = bpsMaxIn;
  }


  public IscsiLunWhereInput bpsMaxLength(Long bpsMaxLength) {
    
    this.bpsMaxLength = bpsMaxLength;
    return this;
  }

   /**
   * Get bpsMaxLength
   * @return bpsMaxLength
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getBpsMaxLength() {
    return bpsMaxLength;
  }


  public void setBpsMaxLength(Long bpsMaxLength) {
    this.bpsMaxLength = bpsMaxLength;
  }


  public IscsiLunWhereInput bpsMaxLengthGt(Long bpsMaxLengthGt) {
    
    this.bpsMaxLengthGt = bpsMaxLengthGt;
    return this;
  }

   /**
   * Get bpsMaxLengthGt
   * @return bpsMaxLengthGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getBpsMaxLengthGt() {
    return bpsMaxLengthGt;
  }


  public void setBpsMaxLengthGt(Long bpsMaxLengthGt) {
    this.bpsMaxLengthGt = bpsMaxLengthGt;
  }


  public IscsiLunWhereInput bpsMaxLengthGte(Long bpsMaxLengthGte) {
    
    this.bpsMaxLengthGte = bpsMaxLengthGte;
    return this;
  }

   /**
   * Get bpsMaxLengthGte
   * @return bpsMaxLengthGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getBpsMaxLengthGte() {
    return bpsMaxLengthGte;
  }


  public void setBpsMaxLengthGte(Long bpsMaxLengthGte) {
    this.bpsMaxLengthGte = bpsMaxLengthGte;
  }


  public IscsiLunWhereInput bpsMaxLengthIn(List<Long> bpsMaxLengthIn) {
    
    this.bpsMaxLengthIn = bpsMaxLengthIn;
    return this;
  }

  public IscsiLunWhereInput addBpsMaxLengthInItem(Long bpsMaxLengthInItem) {
    if (this.bpsMaxLengthIn == null) {
      this.bpsMaxLengthIn = new ArrayList<Long>();
    }
    this.bpsMaxLengthIn.add(bpsMaxLengthInItem);
    return this;
  }

   /**
   * Get bpsMaxLengthIn
   * @return bpsMaxLengthIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Long> getBpsMaxLengthIn() {
    return bpsMaxLengthIn;
  }


  public void setBpsMaxLengthIn(List<Long> bpsMaxLengthIn) {
    this.bpsMaxLengthIn = bpsMaxLengthIn;
  }


  public IscsiLunWhereInput bpsMaxLengthLt(Long bpsMaxLengthLt) {
    
    this.bpsMaxLengthLt = bpsMaxLengthLt;
    return this;
  }

   /**
   * Get bpsMaxLengthLt
   * @return bpsMaxLengthLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getBpsMaxLengthLt() {
    return bpsMaxLengthLt;
  }


  public void setBpsMaxLengthLt(Long bpsMaxLengthLt) {
    this.bpsMaxLengthLt = bpsMaxLengthLt;
  }


  public IscsiLunWhereInput bpsMaxLengthLte(Long bpsMaxLengthLte) {
    
    this.bpsMaxLengthLte = bpsMaxLengthLte;
    return this;
  }

   /**
   * Get bpsMaxLengthLte
   * @return bpsMaxLengthLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getBpsMaxLengthLte() {
    return bpsMaxLengthLte;
  }


  public void setBpsMaxLengthLte(Long bpsMaxLengthLte) {
    this.bpsMaxLengthLte = bpsMaxLengthLte;
  }


  public IscsiLunWhereInput bpsMaxLengthNot(Long bpsMaxLengthNot) {
    
    this.bpsMaxLengthNot = bpsMaxLengthNot;
    return this;
  }

   /**
   * Get bpsMaxLengthNot
   * @return bpsMaxLengthNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getBpsMaxLengthNot() {
    return bpsMaxLengthNot;
  }


  public void setBpsMaxLengthNot(Long bpsMaxLengthNot) {
    this.bpsMaxLengthNot = bpsMaxLengthNot;
  }


  public IscsiLunWhereInput bpsMaxLengthNotIn(List<Long> bpsMaxLengthNotIn) {
    
    this.bpsMaxLengthNotIn = bpsMaxLengthNotIn;
    return this;
  }

  public IscsiLunWhereInput addBpsMaxLengthNotInItem(Long bpsMaxLengthNotInItem) {
    if (this.bpsMaxLengthNotIn == null) {
      this.bpsMaxLengthNotIn = new ArrayList<Long>();
    }
    this.bpsMaxLengthNotIn.add(bpsMaxLengthNotInItem);
    return this;
  }

   /**
   * Get bpsMaxLengthNotIn
   * @return bpsMaxLengthNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Long> getBpsMaxLengthNotIn() {
    return bpsMaxLengthNotIn;
  }


  public void setBpsMaxLengthNotIn(List<Long> bpsMaxLengthNotIn) {
    this.bpsMaxLengthNotIn = bpsMaxLengthNotIn;
  }


  public IscsiLunWhereInput bpsMaxLt(Long bpsMaxLt) {
    
    this.bpsMaxLt = bpsMaxLt;
    return this;
  }

   /**
   * Get bpsMaxLt
   * @return bpsMaxLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getBpsMaxLt() {
    return bpsMaxLt;
  }


  public void setBpsMaxLt(Long bpsMaxLt) {
    this.bpsMaxLt = bpsMaxLt;
  }


  public IscsiLunWhereInput bpsMaxLte(Long bpsMaxLte) {
    
    this.bpsMaxLte = bpsMaxLte;
    return this;
  }

   /**
   * Get bpsMaxLte
   * @return bpsMaxLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getBpsMaxLte() {
    return bpsMaxLte;
  }


  public void setBpsMaxLte(Long bpsMaxLte) {
    this.bpsMaxLte = bpsMaxLte;
  }


  public IscsiLunWhereInput bpsMaxNot(Long bpsMaxNot) {
    
    this.bpsMaxNot = bpsMaxNot;
    return this;
  }

   /**
   * Get bpsMaxNot
   * @return bpsMaxNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getBpsMaxNot() {
    return bpsMaxNot;
  }


  public void setBpsMaxNot(Long bpsMaxNot) {
    this.bpsMaxNot = bpsMaxNot;
  }


  public IscsiLunWhereInput bpsMaxNotIn(List<Long> bpsMaxNotIn) {
    
    this.bpsMaxNotIn = bpsMaxNotIn;
    return this;
  }

  public IscsiLunWhereInput addBpsMaxNotInItem(Long bpsMaxNotInItem) {
    if (this.bpsMaxNotIn == null) {
      this.bpsMaxNotIn = new ArrayList<Long>();
    }
    this.bpsMaxNotIn.add(bpsMaxNotInItem);
    return this;
  }

   /**
   * Get bpsMaxNotIn
   * @return bpsMaxNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Long> getBpsMaxNotIn() {
    return bpsMaxNotIn;
  }


  public void setBpsMaxNotIn(List<Long> bpsMaxNotIn) {
    this.bpsMaxNotIn = bpsMaxNotIn;
  }


  public IscsiLunWhereInput bpsNot(Long bpsNot) {
    
    this.bpsNot = bpsNot;
    return this;
  }

   /**
   * Get bpsNot
   * @return bpsNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getBpsNot() {
    return bpsNot;
  }


  public void setBpsNot(Long bpsNot) {
    this.bpsNot = bpsNot;
  }


  public IscsiLunWhereInput bpsNotIn(List<Long> bpsNotIn) {
    
    this.bpsNotIn = bpsNotIn;
    return this;
  }

  public IscsiLunWhereInput addBpsNotInItem(Long bpsNotInItem) {
    if (this.bpsNotIn == null) {
      this.bpsNotIn = new ArrayList<Long>();
    }
    this.bpsNotIn.add(bpsNotInItem);
    return this;
  }

   /**
   * Get bpsNotIn
   * @return bpsNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Long> getBpsNotIn() {
    return bpsNotIn;
  }


  public void setBpsNotIn(List<Long> bpsNotIn) {
    this.bpsNotIn = bpsNotIn;
  }


  public IscsiLunWhereInput bpsRd(Long bpsRd) {
    
    this.bpsRd = bpsRd;
    return this;
  }

   /**
   * Get bpsRd
   * @return bpsRd
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getBpsRd() {
    return bpsRd;
  }


  public void setBpsRd(Long bpsRd) {
    this.bpsRd = bpsRd;
  }


  public IscsiLunWhereInput bpsRdGt(Long bpsRdGt) {
    
    this.bpsRdGt = bpsRdGt;
    return this;
  }

   /**
   * Get bpsRdGt
   * @return bpsRdGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getBpsRdGt() {
    return bpsRdGt;
  }


  public void setBpsRdGt(Long bpsRdGt) {
    this.bpsRdGt = bpsRdGt;
  }


  public IscsiLunWhereInput bpsRdGte(Long bpsRdGte) {
    
    this.bpsRdGte = bpsRdGte;
    return this;
  }

   /**
   * Get bpsRdGte
   * @return bpsRdGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getBpsRdGte() {
    return bpsRdGte;
  }


  public void setBpsRdGte(Long bpsRdGte) {
    this.bpsRdGte = bpsRdGte;
  }


  public IscsiLunWhereInput bpsRdIn(List<Long> bpsRdIn) {
    
    this.bpsRdIn = bpsRdIn;
    return this;
  }

  public IscsiLunWhereInput addBpsRdInItem(Long bpsRdInItem) {
    if (this.bpsRdIn == null) {
      this.bpsRdIn = new ArrayList<Long>();
    }
    this.bpsRdIn.add(bpsRdInItem);
    return this;
  }

   /**
   * Get bpsRdIn
   * @return bpsRdIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Long> getBpsRdIn() {
    return bpsRdIn;
  }


  public void setBpsRdIn(List<Long> bpsRdIn) {
    this.bpsRdIn = bpsRdIn;
  }


  public IscsiLunWhereInput bpsRdLt(Long bpsRdLt) {
    
    this.bpsRdLt = bpsRdLt;
    return this;
  }

   /**
   * Get bpsRdLt
   * @return bpsRdLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getBpsRdLt() {
    return bpsRdLt;
  }


  public void setBpsRdLt(Long bpsRdLt) {
    this.bpsRdLt = bpsRdLt;
  }


  public IscsiLunWhereInput bpsRdLte(Long bpsRdLte) {
    
    this.bpsRdLte = bpsRdLte;
    return this;
  }

   /**
   * Get bpsRdLte
   * @return bpsRdLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getBpsRdLte() {
    return bpsRdLte;
  }


  public void setBpsRdLte(Long bpsRdLte) {
    this.bpsRdLte = bpsRdLte;
  }


  public IscsiLunWhereInput bpsRdMax(Long bpsRdMax) {
    
    this.bpsRdMax = bpsRdMax;
    return this;
  }

   /**
   * Get bpsRdMax
   * @return bpsRdMax
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getBpsRdMax() {
    return bpsRdMax;
  }


  public void setBpsRdMax(Long bpsRdMax) {
    this.bpsRdMax = bpsRdMax;
  }


  public IscsiLunWhereInput bpsRdMaxGt(Long bpsRdMaxGt) {
    
    this.bpsRdMaxGt = bpsRdMaxGt;
    return this;
  }

   /**
   * Get bpsRdMaxGt
   * @return bpsRdMaxGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getBpsRdMaxGt() {
    return bpsRdMaxGt;
  }


  public void setBpsRdMaxGt(Long bpsRdMaxGt) {
    this.bpsRdMaxGt = bpsRdMaxGt;
  }


  public IscsiLunWhereInput bpsRdMaxGte(Long bpsRdMaxGte) {
    
    this.bpsRdMaxGte = bpsRdMaxGte;
    return this;
  }

   /**
   * Get bpsRdMaxGte
   * @return bpsRdMaxGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getBpsRdMaxGte() {
    return bpsRdMaxGte;
  }


  public void setBpsRdMaxGte(Long bpsRdMaxGte) {
    this.bpsRdMaxGte = bpsRdMaxGte;
  }


  public IscsiLunWhereInput bpsRdMaxIn(List<Long> bpsRdMaxIn) {
    
    this.bpsRdMaxIn = bpsRdMaxIn;
    return this;
  }

  public IscsiLunWhereInput addBpsRdMaxInItem(Long bpsRdMaxInItem) {
    if (this.bpsRdMaxIn == null) {
      this.bpsRdMaxIn = new ArrayList<Long>();
    }
    this.bpsRdMaxIn.add(bpsRdMaxInItem);
    return this;
  }

   /**
   * Get bpsRdMaxIn
   * @return bpsRdMaxIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Long> getBpsRdMaxIn() {
    return bpsRdMaxIn;
  }


  public void setBpsRdMaxIn(List<Long> bpsRdMaxIn) {
    this.bpsRdMaxIn = bpsRdMaxIn;
  }


  public IscsiLunWhereInput bpsRdMaxLength(Long bpsRdMaxLength) {
    
    this.bpsRdMaxLength = bpsRdMaxLength;
    return this;
  }

   /**
   * Get bpsRdMaxLength
   * @return bpsRdMaxLength
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getBpsRdMaxLength() {
    return bpsRdMaxLength;
  }


  public void setBpsRdMaxLength(Long bpsRdMaxLength) {
    this.bpsRdMaxLength = bpsRdMaxLength;
  }


  public IscsiLunWhereInput bpsRdMaxLengthGt(Long bpsRdMaxLengthGt) {
    
    this.bpsRdMaxLengthGt = bpsRdMaxLengthGt;
    return this;
  }

   /**
   * Get bpsRdMaxLengthGt
   * @return bpsRdMaxLengthGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getBpsRdMaxLengthGt() {
    return bpsRdMaxLengthGt;
  }


  public void setBpsRdMaxLengthGt(Long bpsRdMaxLengthGt) {
    this.bpsRdMaxLengthGt = bpsRdMaxLengthGt;
  }


  public IscsiLunWhereInput bpsRdMaxLengthGte(Long bpsRdMaxLengthGte) {
    
    this.bpsRdMaxLengthGte = bpsRdMaxLengthGte;
    return this;
  }

   /**
   * Get bpsRdMaxLengthGte
   * @return bpsRdMaxLengthGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getBpsRdMaxLengthGte() {
    return bpsRdMaxLengthGte;
  }


  public void setBpsRdMaxLengthGte(Long bpsRdMaxLengthGte) {
    this.bpsRdMaxLengthGte = bpsRdMaxLengthGte;
  }


  public IscsiLunWhereInput bpsRdMaxLengthIn(List<Long> bpsRdMaxLengthIn) {
    
    this.bpsRdMaxLengthIn = bpsRdMaxLengthIn;
    return this;
  }

  public IscsiLunWhereInput addBpsRdMaxLengthInItem(Long bpsRdMaxLengthInItem) {
    if (this.bpsRdMaxLengthIn == null) {
      this.bpsRdMaxLengthIn = new ArrayList<Long>();
    }
    this.bpsRdMaxLengthIn.add(bpsRdMaxLengthInItem);
    return this;
  }

   /**
   * Get bpsRdMaxLengthIn
   * @return bpsRdMaxLengthIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Long> getBpsRdMaxLengthIn() {
    return bpsRdMaxLengthIn;
  }


  public void setBpsRdMaxLengthIn(List<Long> bpsRdMaxLengthIn) {
    this.bpsRdMaxLengthIn = bpsRdMaxLengthIn;
  }


  public IscsiLunWhereInput bpsRdMaxLengthLt(Long bpsRdMaxLengthLt) {
    
    this.bpsRdMaxLengthLt = bpsRdMaxLengthLt;
    return this;
  }

   /**
   * Get bpsRdMaxLengthLt
   * @return bpsRdMaxLengthLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getBpsRdMaxLengthLt() {
    return bpsRdMaxLengthLt;
  }


  public void setBpsRdMaxLengthLt(Long bpsRdMaxLengthLt) {
    this.bpsRdMaxLengthLt = bpsRdMaxLengthLt;
  }


  public IscsiLunWhereInput bpsRdMaxLengthLte(Long bpsRdMaxLengthLte) {
    
    this.bpsRdMaxLengthLte = bpsRdMaxLengthLte;
    return this;
  }

   /**
   * Get bpsRdMaxLengthLte
   * @return bpsRdMaxLengthLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getBpsRdMaxLengthLte() {
    return bpsRdMaxLengthLte;
  }


  public void setBpsRdMaxLengthLte(Long bpsRdMaxLengthLte) {
    this.bpsRdMaxLengthLte = bpsRdMaxLengthLte;
  }


  public IscsiLunWhereInput bpsRdMaxLengthNot(Long bpsRdMaxLengthNot) {
    
    this.bpsRdMaxLengthNot = bpsRdMaxLengthNot;
    return this;
  }

   /**
   * Get bpsRdMaxLengthNot
   * @return bpsRdMaxLengthNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getBpsRdMaxLengthNot() {
    return bpsRdMaxLengthNot;
  }


  public void setBpsRdMaxLengthNot(Long bpsRdMaxLengthNot) {
    this.bpsRdMaxLengthNot = bpsRdMaxLengthNot;
  }


  public IscsiLunWhereInput bpsRdMaxLengthNotIn(List<Long> bpsRdMaxLengthNotIn) {
    
    this.bpsRdMaxLengthNotIn = bpsRdMaxLengthNotIn;
    return this;
  }

  public IscsiLunWhereInput addBpsRdMaxLengthNotInItem(Long bpsRdMaxLengthNotInItem) {
    if (this.bpsRdMaxLengthNotIn == null) {
      this.bpsRdMaxLengthNotIn = new ArrayList<Long>();
    }
    this.bpsRdMaxLengthNotIn.add(bpsRdMaxLengthNotInItem);
    return this;
  }

   /**
   * Get bpsRdMaxLengthNotIn
   * @return bpsRdMaxLengthNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Long> getBpsRdMaxLengthNotIn() {
    return bpsRdMaxLengthNotIn;
  }


  public void setBpsRdMaxLengthNotIn(List<Long> bpsRdMaxLengthNotIn) {
    this.bpsRdMaxLengthNotIn = bpsRdMaxLengthNotIn;
  }


  public IscsiLunWhereInput bpsRdMaxLt(Long bpsRdMaxLt) {
    
    this.bpsRdMaxLt = bpsRdMaxLt;
    return this;
  }

   /**
   * Get bpsRdMaxLt
   * @return bpsRdMaxLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getBpsRdMaxLt() {
    return bpsRdMaxLt;
  }


  public void setBpsRdMaxLt(Long bpsRdMaxLt) {
    this.bpsRdMaxLt = bpsRdMaxLt;
  }


  public IscsiLunWhereInput bpsRdMaxLte(Long bpsRdMaxLte) {
    
    this.bpsRdMaxLte = bpsRdMaxLte;
    return this;
  }

   /**
   * Get bpsRdMaxLte
   * @return bpsRdMaxLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getBpsRdMaxLte() {
    return bpsRdMaxLte;
  }


  public void setBpsRdMaxLte(Long bpsRdMaxLte) {
    this.bpsRdMaxLte = bpsRdMaxLte;
  }


  public IscsiLunWhereInput bpsRdMaxNot(Long bpsRdMaxNot) {
    
    this.bpsRdMaxNot = bpsRdMaxNot;
    return this;
  }

   /**
   * Get bpsRdMaxNot
   * @return bpsRdMaxNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getBpsRdMaxNot() {
    return bpsRdMaxNot;
  }


  public void setBpsRdMaxNot(Long bpsRdMaxNot) {
    this.bpsRdMaxNot = bpsRdMaxNot;
  }


  public IscsiLunWhereInput bpsRdMaxNotIn(List<Long> bpsRdMaxNotIn) {
    
    this.bpsRdMaxNotIn = bpsRdMaxNotIn;
    return this;
  }

  public IscsiLunWhereInput addBpsRdMaxNotInItem(Long bpsRdMaxNotInItem) {
    if (this.bpsRdMaxNotIn == null) {
      this.bpsRdMaxNotIn = new ArrayList<Long>();
    }
    this.bpsRdMaxNotIn.add(bpsRdMaxNotInItem);
    return this;
  }

   /**
   * Get bpsRdMaxNotIn
   * @return bpsRdMaxNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Long> getBpsRdMaxNotIn() {
    return bpsRdMaxNotIn;
  }


  public void setBpsRdMaxNotIn(List<Long> bpsRdMaxNotIn) {
    this.bpsRdMaxNotIn = bpsRdMaxNotIn;
  }


  public IscsiLunWhereInput bpsRdNot(Long bpsRdNot) {
    
    this.bpsRdNot = bpsRdNot;
    return this;
  }

   /**
   * Get bpsRdNot
   * @return bpsRdNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getBpsRdNot() {
    return bpsRdNot;
  }


  public void setBpsRdNot(Long bpsRdNot) {
    this.bpsRdNot = bpsRdNot;
  }


  public IscsiLunWhereInput bpsRdNotIn(List<Long> bpsRdNotIn) {
    
    this.bpsRdNotIn = bpsRdNotIn;
    return this;
  }

  public IscsiLunWhereInput addBpsRdNotInItem(Long bpsRdNotInItem) {
    if (this.bpsRdNotIn == null) {
      this.bpsRdNotIn = new ArrayList<Long>();
    }
    this.bpsRdNotIn.add(bpsRdNotInItem);
    return this;
  }

   /**
   * Get bpsRdNotIn
   * @return bpsRdNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Long> getBpsRdNotIn() {
    return bpsRdNotIn;
  }


  public void setBpsRdNotIn(List<Long> bpsRdNotIn) {
    this.bpsRdNotIn = bpsRdNotIn;
  }


  public IscsiLunWhereInput bpsWr(Long bpsWr) {
    
    this.bpsWr = bpsWr;
    return this;
  }

   /**
   * Get bpsWr
   * @return bpsWr
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getBpsWr() {
    return bpsWr;
  }


  public void setBpsWr(Long bpsWr) {
    this.bpsWr = bpsWr;
  }


  public IscsiLunWhereInput bpsWrGt(Long bpsWrGt) {
    
    this.bpsWrGt = bpsWrGt;
    return this;
  }

   /**
   * Get bpsWrGt
   * @return bpsWrGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getBpsWrGt() {
    return bpsWrGt;
  }


  public void setBpsWrGt(Long bpsWrGt) {
    this.bpsWrGt = bpsWrGt;
  }


  public IscsiLunWhereInput bpsWrGte(Long bpsWrGte) {
    
    this.bpsWrGte = bpsWrGte;
    return this;
  }

   /**
   * Get bpsWrGte
   * @return bpsWrGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getBpsWrGte() {
    return bpsWrGte;
  }


  public void setBpsWrGte(Long bpsWrGte) {
    this.bpsWrGte = bpsWrGte;
  }


  public IscsiLunWhereInput bpsWrIn(List<Long> bpsWrIn) {
    
    this.bpsWrIn = bpsWrIn;
    return this;
  }

  public IscsiLunWhereInput addBpsWrInItem(Long bpsWrInItem) {
    if (this.bpsWrIn == null) {
      this.bpsWrIn = new ArrayList<Long>();
    }
    this.bpsWrIn.add(bpsWrInItem);
    return this;
  }

   /**
   * Get bpsWrIn
   * @return bpsWrIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Long> getBpsWrIn() {
    return bpsWrIn;
  }


  public void setBpsWrIn(List<Long> bpsWrIn) {
    this.bpsWrIn = bpsWrIn;
  }


  public IscsiLunWhereInput bpsWrLt(Long bpsWrLt) {
    
    this.bpsWrLt = bpsWrLt;
    return this;
  }

   /**
   * Get bpsWrLt
   * @return bpsWrLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getBpsWrLt() {
    return bpsWrLt;
  }


  public void setBpsWrLt(Long bpsWrLt) {
    this.bpsWrLt = bpsWrLt;
  }


  public IscsiLunWhereInput bpsWrLte(Long bpsWrLte) {
    
    this.bpsWrLte = bpsWrLte;
    return this;
  }

   /**
   * Get bpsWrLte
   * @return bpsWrLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getBpsWrLte() {
    return bpsWrLte;
  }


  public void setBpsWrLte(Long bpsWrLte) {
    this.bpsWrLte = bpsWrLte;
  }


  public IscsiLunWhereInput bpsWrMax(Long bpsWrMax) {
    
    this.bpsWrMax = bpsWrMax;
    return this;
  }

   /**
   * Get bpsWrMax
   * @return bpsWrMax
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getBpsWrMax() {
    return bpsWrMax;
  }


  public void setBpsWrMax(Long bpsWrMax) {
    this.bpsWrMax = bpsWrMax;
  }


  public IscsiLunWhereInput bpsWrMaxGt(Long bpsWrMaxGt) {
    
    this.bpsWrMaxGt = bpsWrMaxGt;
    return this;
  }

   /**
   * Get bpsWrMaxGt
   * @return bpsWrMaxGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getBpsWrMaxGt() {
    return bpsWrMaxGt;
  }


  public void setBpsWrMaxGt(Long bpsWrMaxGt) {
    this.bpsWrMaxGt = bpsWrMaxGt;
  }


  public IscsiLunWhereInput bpsWrMaxGte(Long bpsWrMaxGte) {
    
    this.bpsWrMaxGte = bpsWrMaxGte;
    return this;
  }

   /**
   * Get bpsWrMaxGte
   * @return bpsWrMaxGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getBpsWrMaxGte() {
    return bpsWrMaxGte;
  }


  public void setBpsWrMaxGte(Long bpsWrMaxGte) {
    this.bpsWrMaxGte = bpsWrMaxGte;
  }


  public IscsiLunWhereInput bpsWrMaxIn(List<Long> bpsWrMaxIn) {
    
    this.bpsWrMaxIn = bpsWrMaxIn;
    return this;
  }

  public IscsiLunWhereInput addBpsWrMaxInItem(Long bpsWrMaxInItem) {
    if (this.bpsWrMaxIn == null) {
      this.bpsWrMaxIn = new ArrayList<Long>();
    }
    this.bpsWrMaxIn.add(bpsWrMaxInItem);
    return this;
  }

   /**
   * Get bpsWrMaxIn
   * @return bpsWrMaxIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Long> getBpsWrMaxIn() {
    return bpsWrMaxIn;
  }


  public void setBpsWrMaxIn(List<Long> bpsWrMaxIn) {
    this.bpsWrMaxIn = bpsWrMaxIn;
  }


  public IscsiLunWhereInput bpsWrMaxLength(Long bpsWrMaxLength) {
    
    this.bpsWrMaxLength = bpsWrMaxLength;
    return this;
  }

   /**
   * Get bpsWrMaxLength
   * @return bpsWrMaxLength
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getBpsWrMaxLength() {
    return bpsWrMaxLength;
  }


  public void setBpsWrMaxLength(Long bpsWrMaxLength) {
    this.bpsWrMaxLength = bpsWrMaxLength;
  }


  public IscsiLunWhereInput bpsWrMaxLengthGt(Long bpsWrMaxLengthGt) {
    
    this.bpsWrMaxLengthGt = bpsWrMaxLengthGt;
    return this;
  }

   /**
   * Get bpsWrMaxLengthGt
   * @return bpsWrMaxLengthGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getBpsWrMaxLengthGt() {
    return bpsWrMaxLengthGt;
  }


  public void setBpsWrMaxLengthGt(Long bpsWrMaxLengthGt) {
    this.bpsWrMaxLengthGt = bpsWrMaxLengthGt;
  }


  public IscsiLunWhereInput bpsWrMaxLengthGte(Long bpsWrMaxLengthGte) {
    
    this.bpsWrMaxLengthGte = bpsWrMaxLengthGte;
    return this;
  }

   /**
   * Get bpsWrMaxLengthGte
   * @return bpsWrMaxLengthGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getBpsWrMaxLengthGte() {
    return bpsWrMaxLengthGte;
  }


  public void setBpsWrMaxLengthGte(Long bpsWrMaxLengthGte) {
    this.bpsWrMaxLengthGte = bpsWrMaxLengthGte;
  }


  public IscsiLunWhereInput bpsWrMaxLengthIn(List<Long> bpsWrMaxLengthIn) {
    
    this.bpsWrMaxLengthIn = bpsWrMaxLengthIn;
    return this;
  }

  public IscsiLunWhereInput addBpsWrMaxLengthInItem(Long bpsWrMaxLengthInItem) {
    if (this.bpsWrMaxLengthIn == null) {
      this.bpsWrMaxLengthIn = new ArrayList<Long>();
    }
    this.bpsWrMaxLengthIn.add(bpsWrMaxLengthInItem);
    return this;
  }

   /**
   * Get bpsWrMaxLengthIn
   * @return bpsWrMaxLengthIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Long> getBpsWrMaxLengthIn() {
    return bpsWrMaxLengthIn;
  }


  public void setBpsWrMaxLengthIn(List<Long> bpsWrMaxLengthIn) {
    this.bpsWrMaxLengthIn = bpsWrMaxLengthIn;
  }


  public IscsiLunWhereInput bpsWrMaxLengthLt(Long bpsWrMaxLengthLt) {
    
    this.bpsWrMaxLengthLt = bpsWrMaxLengthLt;
    return this;
  }

   /**
   * Get bpsWrMaxLengthLt
   * @return bpsWrMaxLengthLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getBpsWrMaxLengthLt() {
    return bpsWrMaxLengthLt;
  }


  public void setBpsWrMaxLengthLt(Long bpsWrMaxLengthLt) {
    this.bpsWrMaxLengthLt = bpsWrMaxLengthLt;
  }


  public IscsiLunWhereInput bpsWrMaxLengthLte(Long bpsWrMaxLengthLte) {
    
    this.bpsWrMaxLengthLte = bpsWrMaxLengthLte;
    return this;
  }

   /**
   * Get bpsWrMaxLengthLte
   * @return bpsWrMaxLengthLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getBpsWrMaxLengthLte() {
    return bpsWrMaxLengthLte;
  }


  public void setBpsWrMaxLengthLte(Long bpsWrMaxLengthLte) {
    this.bpsWrMaxLengthLte = bpsWrMaxLengthLte;
  }


  public IscsiLunWhereInput bpsWrMaxLengthNot(Long bpsWrMaxLengthNot) {
    
    this.bpsWrMaxLengthNot = bpsWrMaxLengthNot;
    return this;
  }

   /**
   * Get bpsWrMaxLengthNot
   * @return bpsWrMaxLengthNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getBpsWrMaxLengthNot() {
    return bpsWrMaxLengthNot;
  }


  public void setBpsWrMaxLengthNot(Long bpsWrMaxLengthNot) {
    this.bpsWrMaxLengthNot = bpsWrMaxLengthNot;
  }


  public IscsiLunWhereInput bpsWrMaxLengthNotIn(List<Long> bpsWrMaxLengthNotIn) {
    
    this.bpsWrMaxLengthNotIn = bpsWrMaxLengthNotIn;
    return this;
  }

  public IscsiLunWhereInput addBpsWrMaxLengthNotInItem(Long bpsWrMaxLengthNotInItem) {
    if (this.bpsWrMaxLengthNotIn == null) {
      this.bpsWrMaxLengthNotIn = new ArrayList<Long>();
    }
    this.bpsWrMaxLengthNotIn.add(bpsWrMaxLengthNotInItem);
    return this;
  }

   /**
   * Get bpsWrMaxLengthNotIn
   * @return bpsWrMaxLengthNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Long> getBpsWrMaxLengthNotIn() {
    return bpsWrMaxLengthNotIn;
  }


  public void setBpsWrMaxLengthNotIn(List<Long> bpsWrMaxLengthNotIn) {
    this.bpsWrMaxLengthNotIn = bpsWrMaxLengthNotIn;
  }


  public IscsiLunWhereInput bpsWrMaxLt(Long bpsWrMaxLt) {
    
    this.bpsWrMaxLt = bpsWrMaxLt;
    return this;
  }

   /**
   * Get bpsWrMaxLt
   * @return bpsWrMaxLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getBpsWrMaxLt() {
    return bpsWrMaxLt;
  }


  public void setBpsWrMaxLt(Long bpsWrMaxLt) {
    this.bpsWrMaxLt = bpsWrMaxLt;
  }


  public IscsiLunWhereInput bpsWrMaxLte(Long bpsWrMaxLte) {
    
    this.bpsWrMaxLte = bpsWrMaxLte;
    return this;
  }

   /**
   * Get bpsWrMaxLte
   * @return bpsWrMaxLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getBpsWrMaxLte() {
    return bpsWrMaxLte;
  }


  public void setBpsWrMaxLte(Long bpsWrMaxLte) {
    this.bpsWrMaxLte = bpsWrMaxLte;
  }


  public IscsiLunWhereInput bpsWrMaxNot(Long bpsWrMaxNot) {
    
    this.bpsWrMaxNot = bpsWrMaxNot;
    return this;
  }

   /**
   * Get bpsWrMaxNot
   * @return bpsWrMaxNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getBpsWrMaxNot() {
    return bpsWrMaxNot;
  }


  public void setBpsWrMaxNot(Long bpsWrMaxNot) {
    this.bpsWrMaxNot = bpsWrMaxNot;
  }


  public IscsiLunWhereInput bpsWrMaxNotIn(List<Long> bpsWrMaxNotIn) {
    
    this.bpsWrMaxNotIn = bpsWrMaxNotIn;
    return this;
  }

  public IscsiLunWhereInput addBpsWrMaxNotInItem(Long bpsWrMaxNotInItem) {
    if (this.bpsWrMaxNotIn == null) {
      this.bpsWrMaxNotIn = new ArrayList<Long>();
    }
    this.bpsWrMaxNotIn.add(bpsWrMaxNotInItem);
    return this;
  }

   /**
   * Get bpsWrMaxNotIn
   * @return bpsWrMaxNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Long> getBpsWrMaxNotIn() {
    return bpsWrMaxNotIn;
  }


  public void setBpsWrMaxNotIn(List<Long> bpsWrMaxNotIn) {
    this.bpsWrMaxNotIn = bpsWrMaxNotIn;
  }


  public IscsiLunWhereInput bpsWrNot(Long bpsWrNot) {
    
    this.bpsWrNot = bpsWrNot;
    return this;
  }

   /**
   * Get bpsWrNot
   * @return bpsWrNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getBpsWrNot() {
    return bpsWrNot;
  }


  public void setBpsWrNot(Long bpsWrNot) {
    this.bpsWrNot = bpsWrNot;
  }


  public IscsiLunWhereInput bpsWrNotIn(List<Long> bpsWrNotIn) {
    
    this.bpsWrNotIn = bpsWrNotIn;
    return this;
  }

  public IscsiLunWhereInput addBpsWrNotInItem(Long bpsWrNotInItem) {
    if (this.bpsWrNotIn == null) {
      this.bpsWrNotIn = new ArrayList<Long>();
    }
    this.bpsWrNotIn.add(bpsWrNotInItem);
    return this;
  }

   /**
   * Get bpsWrNotIn
   * @return bpsWrNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Long> getBpsWrNotIn() {
    return bpsWrNotIn;
  }


  public void setBpsWrNotIn(List<Long> bpsWrNotIn) {
    this.bpsWrNotIn = bpsWrNotIn;
  }


  public IscsiLunWhereInput entityAsyncStatus(EntityAsyncStatus entityAsyncStatus) {
    
    this.entityAsyncStatus = entityAsyncStatus;
    return this;
  }

   /**
   * Get entityAsyncStatus
   * @return entityAsyncStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public EntityAsyncStatus getEntityAsyncStatus() {
    return entityAsyncStatus;
  }


  public void setEntityAsyncStatus(EntityAsyncStatus entityAsyncStatus) {
    this.entityAsyncStatus = entityAsyncStatus;
  }


  public IscsiLunWhereInput entityAsyncStatusIn(List<EntityAsyncStatus> entityAsyncStatusIn) {
    
    this.entityAsyncStatusIn = entityAsyncStatusIn;
    return this;
  }

  public IscsiLunWhereInput addEntityAsyncStatusInItem(EntityAsyncStatus entityAsyncStatusInItem) {
    if (this.entityAsyncStatusIn == null) {
      this.entityAsyncStatusIn = new ArrayList<EntityAsyncStatus>();
    }
    this.entityAsyncStatusIn.add(entityAsyncStatusInItem);
    return this;
  }

   /**
   * Get entityAsyncStatusIn
   * @return entityAsyncStatusIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<EntityAsyncStatus> getEntityAsyncStatusIn() {
    return entityAsyncStatusIn;
  }


  public void setEntityAsyncStatusIn(List<EntityAsyncStatus> entityAsyncStatusIn) {
    this.entityAsyncStatusIn = entityAsyncStatusIn;
  }


  public IscsiLunWhereInput entityAsyncStatusNot(EntityAsyncStatus entityAsyncStatusNot) {
    
    this.entityAsyncStatusNot = entityAsyncStatusNot;
    return this;
  }

   /**
   * Get entityAsyncStatusNot
   * @return entityAsyncStatusNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public EntityAsyncStatus getEntityAsyncStatusNot() {
    return entityAsyncStatusNot;
  }


  public void setEntityAsyncStatusNot(EntityAsyncStatus entityAsyncStatusNot) {
    this.entityAsyncStatusNot = entityAsyncStatusNot;
  }


  public IscsiLunWhereInput entityAsyncStatusNotIn(List<EntityAsyncStatus> entityAsyncStatusNotIn) {
    
    this.entityAsyncStatusNotIn = entityAsyncStatusNotIn;
    return this;
  }

  public IscsiLunWhereInput addEntityAsyncStatusNotInItem(EntityAsyncStatus entityAsyncStatusNotInItem) {
    if (this.entityAsyncStatusNotIn == null) {
      this.entityAsyncStatusNotIn = new ArrayList<EntityAsyncStatus>();
    }
    this.entityAsyncStatusNotIn.add(entityAsyncStatusNotInItem);
    return this;
  }

   /**
   * Get entityAsyncStatusNotIn
   * @return entityAsyncStatusNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<EntityAsyncStatus> getEntityAsyncStatusNotIn() {
    return entityAsyncStatusNotIn;
  }


  public void setEntityAsyncStatusNotIn(List<EntityAsyncStatus> entityAsyncStatusNotIn) {
    this.entityAsyncStatusNotIn = entityAsyncStatusNotIn;
  }


  public IscsiLunWhereInput id(String id) {
    
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


  public IscsiLunWhereInput idContains(String idContains) {
    
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


  public IscsiLunWhereInput idEndsWith(String idEndsWith) {
    
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


  public IscsiLunWhereInput idGt(String idGt) {
    
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


  public IscsiLunWhereInput idGte(String idGte) {
    
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


  public IscsiLunWhereInput idIn(List<String> idIn) {
    
    this.idIn = idIn;
    return this;
  }

  public IscsiLunWhereInput addIdInItem(String idInItem) {
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


  public IscsiLunWhereInput idLt(String idLt) {
    
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


  public IscsiLunWhereInput idLte(String idLte) {
    
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


  public IscsiLunWhereInput idNot(String idNot) {
    
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


  public IscsiLunWhereInput idNotContains(String idNotContains) {
    
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


  public IscsiLunWhereInput idNotEndsWith(String idNotEndsWith) {
    
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


  public IscsiLunWhereInput idNotIn(List<String> idNotIn) {
    
    this.idNotIn = idNotIn;
    return this;
  }

  public IscsiLunWhereInput addIdNotInItem(String idNotInItem) {
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


  public IscsiLunWhereInput idNotStartsWith(String idNotStartsWith) {
    
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


  public IscsiLunWhereInput idStartsWith(String idStartsWith) {
    
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


  public IscsiLunWhereInput ioSize(Long ioSize) {
    
    this.ioSize = ioSize;
    return this;
  }

   /**
   * Get ioSize
   * @return ioSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getIoSize() {
    return ioSize;
  }


  public void setIoSize(Long ioSize) {
    this.ioSize = ioSize;
  }


  public IscsiLunWhereInput ioSizeGt(Long ioSizeGt) {
    
    this.ioSizeGt = ioSizeGt;
    return this;
  }

   /**
   * Get ioSizeGt
   * @return ioSizeGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getIoSizeGt() {
    return ioSizeGt;
  }


  public void setIoSizeGt(Long ioSizeGt) {
    this.ioSizeGt = ioSizeGt;
  }


  public IscsiLunWhereInput ioSizeGte(Long ioSizeGte) {
    
    this.ioSizeGte = ioSizeGte;
    return this;
  }

   /**
   * Get ioSizeGte
   * @return ioSizeGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getIoSizeGte() {
    return ioSizeGte;
  }


  public void setIoSizeGte(Long ioSizeGte) {
    this.ioSizeGte = ioSizeGte;
  }


  public IscsiLunWhereInput ioSizeIn(List<Long> ioSizeIn) {
    
    this.ioSizeIn = ioSizeIn;
    return this;
  }

  public IscsiLunWhereInput addIoSizeInItem(Long ioSizeInItem) {
    if (this.ioSizeIn == null) {
      this.ioSizeIn = new ArrayList<Long>();
    }
    this.ioSizeIn.add(ioSizeInItem);
    return this;
  }

   /**
   * Get ioSizeIn
   * @return ioSizeIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Long> getIoSizeIn() {
    return ioSizeIn;
  }


  public void setIoSizeIn(List<Long> ioSizeIn) {
    this.ioSizeIn = ioSizeIn;
  }


  public IscsiLunWhereInput ioSizeLt(Long ioSizeLt) {
    
    this.ioSizeLt = ioSizeLt;
    return this;
  }

   /**
   * Get ioSizeLt
   * @return ioSizeLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getIoSizeLt() {
    return ioSizeLt;
  }


  public void setIoSizeLt(Long ioSizeLt) {
    this.ioSizeLt = ioSizeLt;
  }


  public IscsiLunWhereInput ioSizeLte(Long ioSizeLte) {
    
    this.ioSizeLte = ioSizeLte;
    return this;
  }

   /**
   * Get ioSizeLte
   * @return ioSizeLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getIoSizeLte() {
    return ioSizeLte;
  }


  public void setIoSizeLte(Long ioSizeLte) {
    this.ioSizeLte = ioSizeLte;
  }


  public IscsiLunWhereInput ioSizeNot(Long ioSizeNot) {
    
    this.ioSizeNot = ioSizeNot;
    return this;
  }

   /**
   * Get ioSizeNot
   * @return ioSizeNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getIoSizeNot() {
    return ioSizeNot;
  }


  public void setIoSizeNot(Long ioSizeNot) {
    this.ioSizeNot = ioSizeNot;
  }


  public IscsiLunWhereInput ioSizeNotIn(List<Long> ioSizeNotIn) {
    
    this.ioSizeNotIn = ioSizeNotIn;
    return this;
  }

  public IscsiLunWhereInput addIoSizeNotInItem(Long ioSizeNotInItem) {
    if (this.ioSizeNotIn == null) {
      this.ioSizeNotIn = new ArrayList<Long>();
    }
    this.ioSizeNotIn.add(ioSizeNotInItem);
    return this;
  }

   /**
   * Get ioSizeNotIn
   * @return ioSizeNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Long> getIoSizeNotIn() {
    return ioSizeNotIn;
  }


  public void setIoSizeNotIn(List<Long> ioSizeNotIn) {
    this.ioSizeNotIn = ioSizeNotIn;
  }


  public IscsiLunWhereInput iops(Long iops) {
    
    this.iops = iops;
    return this;
  }

   /**
   * Get iops
   * @return iops
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getIops() {
    return iops;
  }


  public void setIops(Long iops) {
    this.iops = iops;
  }


  public IscsiLunWhereInput iopsGt(Long iopsGt) {
    
    this.iopsGt = iopsGt;
    return this;
  }

   /**
   * Get iopsGt
   * @return iopsGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getIopsGt() {
    return iopsGt;
  }


  public void setIopsGt(Long iopsGt) {
    this.iopsGt = iopsGt;
  }


  public IscsiLunWhereInput iopsGte(Long iopsGte) {
    
    this.iopsGte = iopsGte;
    return this;
  }

   /**
   * Get iopsGte
   * @return iopsGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getIopsGte() {
    return iopsGte;
  }


  public void setIopsGte(Long iopsGte) {
    this.iopsGte = iopsGte;
  }


  public IscsiLunWhereInput iopsIn(List<Long> iopsIn) {
    
    this.iopsIn = iopsIn;
    return this;
  }

  public IscsiLunWhereInput addIopsInItem(Long iopsInItem) {
    if (this.iopsIn == null) {
      this.iopsIn = new ArrayList<Long>();
    }
    this.iopsIn.add(iopsInItem);
    return this;
  }

   /**
   * Get iopsIn
   * @return iopsIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Long> getIopsIn() {
    return iopsIn;
  }


  public void setIopsIn(List<Long> iopsIn) {
    this.iopsIn = iopsIn;
  }


  public IscsiLunWhereInput iopsLt(Long iopsLt) {
    
    this.iopsLt = iopsLt;
    return this;
  }

   /**
   * Get iopsLt
   * @return iopsLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getIopsLt() {
    return iopsLt;
  }


  public void setIopsLt(Long iopsLt) {
    this.iopsLt = iopsLt;
  }


  public IscsiLunWhereInput iopsLte(Long iopsLte) {
    
    this.iopsLte = iopsLte;
    return this;
  }

   /**
   * Get iopsLte
   * @return iopsLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getIopsLte() {
    return iopsLte;
  }


  public void setIopsLte(Long iopsLte) {
    this.iopsLte = iopsLte;
  }


  public IscsiLunWhereInput iopsMax(Long iopsMax) {
    
    this.iopsMax = iopsMax;
    return this;
  }

   /**
   * Get iopsMax
   * @return iopsMax
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getIopsMax() {
    return iopsMax;
  }


  public void setIopsMax(Long iopsMax) {
    this.iopsMax = iopsMax;
  }


  public IscsiLunWhereInput iopsMaxGt(Long iopsMaxGt) {
    
    this.iopsMaxGt = iopsMaxGt;
    return this;
  }

   /**
   * Get iopsMaxGt
   * @return iopsMaxGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getIopsMaxGt() {
    return iopsMaxGt;
  }


  public void setIopsMaxGt(Long iopsMaxGt) {
    this.iopsMaxGt = iopsMaxGt;
  }


  public IscsiLunWhereInput iopsMaxGte(Long iopsMaxGte) {
    
    this.iopsMaxGte = iopsMaxGte;
    return this;
  }

   /**
   * Get iopsMaxGte
   * @return iopsMaxGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getIopsMaxGte() {
    return iopsMaxGte;
  }


  public void setIopsMaxGte(Long iopsMaxGte) {
    this.iopsMaxGte = iopsMaxGte;
  }


  public IscsiLunWhereInput iopsMaxIn(List<Long> iopsMaxIn) {
    
    this.iopsMaxIn = iopsMaxIn;
    return this;
  }

  public IscsiLunWhereInput addIopsMaxInItem(Long iopsMaxInItem) {
    if (this.iopsMaxIn == null) {
      this.iopsMaxIn = new ArrayList<Long>();
    }
    this.iopsMaxIn.add(iopsMaxInItem);
    return this;
  }

   /**
   * Get iopsMaxIn
   * @return iopsMaxIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Long> getIopsMaxIn() {
    return iopsMaxIn;
  }


  public void setIopsMaxIn(List<Long> iopsMaxIn) {
    this.iopsMaxIn = iopsMaxIn;
  }


  public IscsiLunWhereInput iopsMaxLength(Long iopsMaxLength) {
    
    this.iopsMaxLength = iopsMaxLength;
    return this;
  }

   /**
   * Get iopsMaxLength
   * @return iopsMaxLength
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getIopsMaxLength() {
    return iopsMaxLength;
  }


  public void setIopsMaxLength(Long iopsMaxLength) {
    this.iopsMaxLength = iopsMaxLength;
  }


  public IscsiLunWhereInput iopsMaxLengthGt(Long iopsMaxLengthGt) {
    
    this.iopsMaxLengthGt = iopsMaxLengthGt;
    return this;
  }

   /**
   * Get iopsMaxLengthGt
   * @return iopsMaxLengthGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getIopsMaxLengthGt() {
    return iopsMaxLengthGt;
  }


  public void setIopsMaxLengthGt(Long iopsMaxLengthGt) {
    this.iopsMaxLengthGt = iopsMaxLengthGt;
  }


  public IscsiLunWhereInput iopsMaxLengthGte(Long iopsMaxLengthGte) {
    
    this.iopsMaxLengthGte = iopsMaxLengthGte;
    return this;
  }

   /**
   * Get iopsMaxLengthGte
   * @return iopsMaxLengthGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getIopsMaxLengthGte() {
    return iopsMaxLengthGte;
  }


  public void setIopsMaxLengthGte(Long iopsMaxLengthGte) {
    this.iopsMaxLengthGte = iopsMaxLengthGte;
  }


  public IscsiLunWhereInput iopsMaxLengthIn(List<Long> iopsMaxLengthIn) {
    
    this.iopsMaxLengthIn = iopsMaxLengthIn;
    return this;
  }

  public IscsiLunWhereInput addIopsMaxLengthInItem(Long iopsMaxLengthInItem) {
    if (this.iopsMaxLengthIn == null) {
      this.iopsMaxLengthIn = new ArrayList<Long>();
    }
    this.iopsMaxLengthIn.add(iopsMaxLengthInItem);
    return this;
  }

   /**
   * Get iopsMaxLengthIn
   * @return iopsMaxLengthIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Long> getIopsMaxLengthIn() {
    return iopsMaxLengthIn;
  }


  public void setIopsMaxLengthIn(List<Long> iopsMaxLengthIn) {
    this.iopsMaxLengthIn = iopsMaxLengthIn;
  }


  public IscsiLunWhereInput iopsMaxLengthLt(Long iopsMaxLengthLt) {
    
    this.iopsMaxLengthLt = iopsMaxLengthLt;
    return this;
  }

   /**
   * Get iopsMaxLengthLt
   * @return iopsMaxLengthLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getIopsMaxLengthLt() {
    return iopsMaxLengthLt;
  }


  public void setIopsMaxLengthLt(Long iopsMaxLengthLt) {
    this.iopsMaxLengthLt = iopsMaxLengthLt;
  }


  public IscsiLunWhereInput iopsMaxLengthLte(Long iopsMaxLengthLte) {
    
    this.iopsMaxLengthLte = iopsMaxLengthLte;
    return this;
  }

   /**
   * Get iopsMaxLengthLte
   * @return iopsMaxLengthLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getIopsMaxLengthLte() {
    return iopsMaxLengthLte;
  }


  public void setIopsMaxLengthLte(Long iopsMaxLengthLte) {
    this.iopsMaxLengthLte = iopsMaxLengthLte;
  }


  public IscsiLunWhereInput iopsMaxLengthNot(Long iopsMaxLengthNot) {
    
    this.iopsMaxLengthNot = iopsMaxLengthNot;
    return this;
  }

   /**
   * Get iopsMaxLengthNot
   * @return iopsMaxLengthNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getIopsMaxLengthNot() {
    return iopsMaxLengthNot;
  }


  public void setIopsMaxLengthNot(Long iopsMaxLengthNot) {
    this.iopsMaxLengthNot = iopsMaxLengthNot;
  }


  public IscsiLunWhereInput iopsMaxLengthNotIn(List<Long> iopsMaxLengthNotIn) {
    
    this.iopsMaxLengthNotIn = iopsMaxLengthNotIn;
    return this;
  }

  public IscsiLunWhereInput addIopsMaxLengthNotInItem(Long iopsMaxLengthNotInItem) {
    if (this.iopsMaxLengthNotIn == null) {
      this.iopsMaxLengthNotIn = new ArrayList<Long>();
    }
    this.iopsMaxLengthNotIn.add(iopsMaxLengthNotInItem);
    return this;
  }

   /**
   * Get iopsMaxLengthNotIn
   * @return iopsMaxLengthNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Long> getIopsMaxLengthNotIn() {
    return iopsMaxLengthNotIn;
  }


  public void setIopsMaxLengthNotIn(List<Long> iopsMaxLengthNotIn) {
    this.iopsMaxLengthNotIn = iopsMaxLengthNotIn;
  }


  public IscsiLunWhereInput iopsMaxLt(Long iopsMaxLt) {
    
    this.iopsMaxLt = iopsMaxLt;
    return this;
  }

   /**
   * Get iopsMaxLt
   * @return iopsMaxLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getIopsMaxLt() {
    return iopsMaxLt;
  }


  public void setIopsMaxLt(Long iopsMaxLt) {
    this.iopsMaxLt = iopsMaxLt;
  }


  public IscsiLunWhereInput iopsMaxLte(Long iopsMaxLte) {
    
    this.iopsMaxLte = iopsMaxLte;
    return this;
  }

   /**
   * Get iopsMaxLte
   * @return iopsMaxLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getIopsMaxLte() {
    return iopsMaxLte;
  }


  public void setIopsMaxLte(Long iopsMaxLte) {
    this.iopsMaxLte = iopsMaxLte;
  }


  public IscsiLunWhereInput iopsMaxNot(Long iopsMaxNot) {
    
    this.iopsMaxNot = iopsMaxNot;
    return this;
  }

   /**
   * Get iopsMaxNot
   * @return iopsMaxNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getIopsMaxNot() {
    return iopsMaxNot;
  }


  public void setIopsMaxNot(Long iopsMaxNot) {
    this.iopsMaxNot = iopsMaxNot;
  }


  public IscsiLunWhereInput iopsMaxNotIn(List<Long> iopsMaxNotIn) {
    
    this.iopsMaxNotIn = iopsMaxNotIn;
    return this;
  }

  public IscsiLunWhereInput addIopsMaxNotInItem(Long iopsMaxNotInItem) {
    if (this.iopsMaxNotIn == null) {
      this.iopsMaxNotIn = new ArrayList<Long>();
    }
    this.iopsMaxNotIn.add(iopsMaxNotInItem);
    return this;
  }

   /**
   * Get iopsMaxNotIn
   * @return iopsMaxNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Long> getIopsMaxNotIn() {
    return iopsMaxNotIn;
  }


  public void setIopsMaxNotIn(List<Long> iopsMaxNotIn) {
    this.iopsMaxNotIn = iopsMaxNotIn;
  }


  public IscsiLunWhereInput iopsNot(Long iopsNot) {
    
    this.iopsNot = iopsNot;
    return this;
  }

   /**
   * Get iopsNot
   * @return iopsNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getIopsNot() {
    return iopsNot;
  }


  public void setIopsNot(Long iopsNot) {
    this.iopsNot = iopsNot;
  }


  public IscsiLunWhereInput iopsNotIn(List<Long> iopsNotIn) {
    
    this.iopsNotIn = iopsNotIn;
    return this;
  }

  public IscsiLunWhereInput addIopsNotInItem(Long iopsNotInItem) {
    if (this.iopsNotIn == null) {
      this.iopsNotIn = new ArrayList<Long>();
    }
    this.iopsNotIn.add(iopsNotInItem);
    return this;
  }

   /**
   * Get iopsNotIn
   * @return iopsNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Long> getIopsNotIn() {
    return iopsNotIn;
  }


  public void setIopsNotIn(List<Long> iopsNotIn) {
    this.iopsNotIn = iopsNotIn;
  }


  public IscsiLunWhereInput iopsRd(Long iopsRd) {
    
    this.iopsRd = iopsRd;
    return this;
  }

   /**
   * Get iopsRd
   * @return iopsRd
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getIopsRd() {
    return iopsRd;
  }


  public void setIopsRd(Long iopsRd) {
    this.iopsRd = iopsRd;
  }


  public IscsiLunWhereInput iopsRdGt(Long iopsRdGt) {
    
    this.iopsRdGt = iopsRdGt;
    return this;
  }

   /**
   * Get iopsRdGt
   * @return iopsRdGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getIopsRdGt() {
    return iopsRdGt;
  }


  public void setIopsRdGt(Long iopsRdGt) {
    this.iopsRdGt = iopsRdGt;
  }


  public IscsiLunWhereInput iopsRdGte(Long iopsRdGte) {
    
    this.iopsRdGte = iopsRdGte;
    return this;
  }

   /**
   * Get iopsRdGte
   * @return iopsRdGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getIopsRdGte() {
    return iopsRdGte;
  }


  public void setIopsRdGte(Long iopsRdGte) {
    this.iopsRdGte = iopsRdGte;
  }


  public IscsiLunWhereInput iopsRdIn(List<Long> iopsRdIn) {
    
    this.iopsRdIn = iopsRdIn;
    return this;
  }

  public IscsiLunWhereInput addIopsRdInItem(Long iopsRdInItem) {
    if (this.iopsRdIn == null) {
      this.iopsRdIn = new ArrayList<Long>();
    }
    this.iopsRdIn.add(iopsRdInItem);
    return this;
  }

   /**
   * Get iopsRdIn
   * @return iopsRdIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Long> getIopsRdIn() {
    return iopsRdIn;
  }


  public void setIopsRdIn(List<Long> iopsRdIn) {
    this.iopsRdIn = iopsRdIn;
  }


  public IscsiLunWhereInput iopsRdLt(Long iopsRdLt) {
    
    this.iopsRdLt = iopsRdLt;
    return this;
  }

   /**
   * Get iopsRdLt
   * @return iopsRdLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getIopsRdLt() {
    return iopsRdLt;
  }


  public void setIopsRdLt(Long iopsRdLt) {
    this.iopsRdLt = iopsRdLt;
  }


  public IscsiLunWhereInput iopsRdLte(Long iopsRdLte) {
    
    this.iopsRdLte = iopsRdLte;
    return this;
  }

   /**
   * Get iopsRdLte
   * @return iopsRdLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getIopsRdLte() {
    return iopsRdLte;
  }


  public void setIopsRdLte(Long iopsRdLte) {
    this.iopsRdLte = iopsRdLte;
  }


  public IscsiLunWhereInput iopsRdMax(Long iopsRdMax) {
    
    this.iopsRdMax = iopsRdMax;
    return this;
  }

   /**
   * Get iopsRdMax
   * @return iopsRdMax
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getIopsRdMax() {
    return iopsRdMax;
  }


  public void setIopsRdMax(Long iopsRdMax) {
    this.iopsRdMax = iopsRdMax;
  }


  public IscsiLunWhereInput iopsRdMaxGt(Long iopsRdMaxGt) {
    
    this.iopsRdMaxGt = iopsRdMaxGt;
    return this;
  }

   /**
   * Get iopsRdMaxGt
   * @return iopsRdMaxGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getIopsRdMaxGt() {
    return iopsRdMaxGt;
  }


  public void setIopsRdMaxGt(Long iopsRdMaxGt) {
    this.iopsRdMaxGt = iopsRdMaxGt;
  }


  public IscsiLunWhereInput iopsRdMaxGte(Long iopsRdMaxGte) {
    
    this.iopsRdMaxGte = iopsRdMaxGte;
    return this;
  }

   /**
   * Get iopsRdMaxGte
   * @return iopsRdMaxGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getIopsRdMaxGte() {
    return iopsRdMaxGte;
  }


  public void setIopsRdMaxGte(Long iopsRdMaxGte) {
    this.iopsRdMaxGte = iopsRdMaxGte;
  }


  public IscsiLunWhereInput iopsRdMaxIn(List<Long> iopsRdMaxIn) {
    
    this.iopsRdMaxIn = iopsRdMaxIn;
    return this;
  }

  public IscsiLunWhereInput addIopsRdMaxInItem(Long iopsRdMaxInItem) {
    if (this.iopsRdMaxIn == null) {
      this.iopsRdMaxIn = new ArrayList<Long>();
    }
    this.iopsRdMaxIn.add(iopsRdMaxInItem);
    return this;
  }

   /**
   * Get iopsRdMaxIn
   * @return iopsRdMaxIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Long> getIopsRdMaxIn() {
    return iopsRdMaxIn;
  }


  public void setIopsRdMaxIn(List<Long> iopsRdMaxIn) {
    this.iopsRdMaxIn = iopsRdMaxIn;
  }


  public IscsiLunWhereInput iopsRdMaxLength(Long iopsRdMaxLength) {
    
    this.iopsRdMaxLength = iopsRdMaxLength;
    return this;
  }

   /**
   * Get iopsRdMaxLength
   * @return iopsRdMaxLength
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getIopsRdMaxLength() {
    return iopsRdMaxLength;
  }


  public void setIopsRdMaxLength(Long iopsRdMaxLength) {
    this.iopsRdMaxLength = iopsRdMaxLength;
  }


  public IscsiLunWhereInput iopsRdMaxLengthGt(Long iopsRdMaxLengthGt) {
    
    this.iopsRdMaxLengthGt = iopsRdMaxLengthGt;
    return this;
  }

   /**
   * Get iopsRdMaxLengthGt
   * @return iopsRdMaxLengthGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getIopsRdMaxLengthGt() {
    return iopsRdMaxLengthGt;
  }


  public void setIopsRdMaxLengthGt(Long iopsRdMaxLengthGt) {
    this.iopsRdMaxLengthGt = iopsRdMaxLengthGt;
  }


  public IscsiLunWhereInput iopsRdMaxLengthGte(Long iopsRdMaxLengthGte) {
    
    this.iopsRdMaxLengthGte = iopsRdMaxLengthGte;
    return this;
  }

   /**
   * Get iopsRdMaxLengthGte
   * @return iopsRdMaxLengthGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getIopsRdMaxLengthGte() {
    return iopsRdMaxLengthGte;
  }


  public void setIopsRdMaxLengthGte(Long iopsRdMaxLengthGte) {
    this.iopsRdMaxLengthGte = iopsRdMaxLengthGte;
  }


  public IscsiLunWhereInput iopsRdMaxLengthIn(List<Long> iopsRdMaxLengthIn) {
    
    this.iopsRdMaxLengthIn = iopsRdMaxLengthIn;
    return this;
  }

  public IscsiLunWhereInput addIopsRdMaxLengthInItem(Long iopsRdMaxLengthInItem) {
    if (this.iopsRdMaxLengthIn == null) {
      this.iopsRdMaxLengthIn = new ArrayList<Long>();
    }
    this.iopsRdMaxLengthIn.add(iopsRdMaxLengthInItem);
    return this;
  }

   /**
   * Get iopsRdMaxLengthIn
   * @return iopsRdMaxLengthIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Long> getIopsRdMaxLengthIn() {
    return iopsRdMaxLengthIn;
  }


  public void setIopsRdMaxLengthIn(List<Long> iopsRdMaxLengthIn) {
    this.iopsRdMaxLengthIn = iopsRdMaxLengthIn;
  }


  public IscsiLunWhereInput iopsRdMaxLengthLt(Long iopsRdMaxLengthLt) {
    
    this.iopsRdMaxLengthLt = iopsRdMaxLengthLt;
    return this;
  }

   /**
   * Get iopsRdMaxLengthLt
   * @return iopsRdMaxLengthLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getIopsRdMaxLengthLt() {
    return iopsRdMaxLengthLt;
  }


  public void setIopsRdMaxLengthLt(Long iopsRdMaxLengthLt) {
    this.iopsRdMaxLengthLt = iopsRdMaxLengthLt;
  }


  public IscsiLunWhereInput iopsRdMaxLengthLte(Long iopsRdMaxLengthLte) {
    
    this.iopsRdMaxLengthLte = iopsRdMaxLengthLte;
    return this;
  }

   /**
   * Get iopsRdMaxLengthLte
   * @return iopsRdMaxLengthLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getIopsRdMaxLengthLte() {
    return iopsRdMaxLengthLte;
  }


  public void setIopsRdMaxLengthLte(Long iopsRdMaxLengthLte) {
    this.iopsRdMaxLengthLte = iopsRdMaxLengthLte;
  }


  public IscsiLunWhereInput iopsRdMaxLengthNot(Long iopsRdMaxLengthNot) {
    
    this.iopsRdMaxLengthNot = iopsRdMaxLengthNot;
    return this;
  }

   /**
   * Get iopsRdMaxLengthNot
   * @return iopsRdMaxLengthNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getIopsRdMaxLengthNot() {
    return iopsRdMaxLengthNot;
  }


  public void setIopsRdMaxLengthNot(Long iopsRdMaxLengthNot) {
    this.iopsRdMaxLengthNot = iopsRdMaxLengthNot;
  }


  public IscsiLunWhereInput iopsRdMaxLengthNotIn(List<Long> iopsRdMaxLengthNotIn) {
    
    this.iopsRdMaxLengthNotIn = iopsRdMaxLengthNotIn;
    return this;
  }

  public IscsiLunWhereInput addIopsRdMaxLengthNotInItem(Long iopsRdMaxLengthNotInItem) {
    if (this.iopsRdMaxLengthNotIn == null) {
      this.iopsRdMaxLengthNotIn = new ArrayList<Long>();
    }
    this.iopsRdMaxLengthNotIn.add(iopsRdMaxLengthNotInItem);
    return this;
  }

   /**
   * Get iopsRdMaxLengthNotIn
   * @return iopsRdMaxLengthNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Long> getIopsRdMaxLengthNotIn() {
    return iopsRdMaxLengthNotIn;
  }


  public void setIopsRdMaxLengthNotIn(List<Long> iopsRdMaxLengthNotIn) {
    this.iopsRdMaxLengthNotIn = iopsRdMaxLengthNotIn;
  }


  public IscsiLunWhereInput iopsRdMaxLt(Long iopsRdMaxLt) {
    
    this.iopsRdMaxLt = iopsRdMaxLt;
    return this;
  }

   /**
   * Get iopsRdMaxLt
   * @return iopsRdMaxLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getIopsRdMaxLt() {
    return iopsRdMaxLt;
  }


  public void setIopsRdMaxLt(Long iopsRdMaxLt) {
    this.iopsRdMaxLt = iopsRdMaxLt;
  }


  public IscsiLunWhereInput iopsRdMaxLte(Long iopsRdMaxLte) {
    
    this.iopsRdMaxLte = iopsRdMaxLte;
    return this;
  }

   /**
   * Get iopsRdMaxLte
   * @return iopsRdMaxLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getIopsRdMaxLte() {
    return iopsRdMaxLte;
  }


  public void setIopsRdMaxLte(Long iopsRdMaxLte) {
    this.iopsRdMaxLte = iopsRdMaxLte;
  }


  public IscsiLunWhereInput iopsRdMaxNot(Long iopsRdMaxNot) {
    
    this.iopsRdMaxNot = iopsRdMaxNot;
    return this;
  }

   /**
   * Get iopsRdMaxNot
   * @return iopsRdMaxNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getIopsRdMaxNot() {
    return iopsRdMaxNot;
  }


  public void setIopsRdMaxNot(Long iopsRdMaxNot) {
    this.iopsRdMaxNot = iopsRdMaxNot;
  }


  public IscsiLunWhereInput iopsRdMaxNotIn(List<Long> iopsRdMaxNotIn) {
    
    this.iopsRdMaxNotIn = iopsRdMaxNotIn;
    return this;
  }

  public IscsiLunWhereInput addIopsRdMaxNotInItem(Long iopsRdMaxNotInItem) {
    if (this.iopsRdMaxNotIn == null) {
      this.iopsRdMaxNotIn = new ArrayList<Long>();
    }
    this.iopsRdMaxNotIn.add(iopsRdMaxNotInItem);
    return this;
  }

   /**
   * Get iopsRdMaxNotIn
   * @return iopsRdMaxNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Long> getIopsRdMaxNotIn() {
    return iopsRdMaxNotIn;
  }


  public void setIopsRdMaxNotIn(List<Long> iopsRdMaxNotIn) {
    this.iopsRdMaxNotIn = iopsRdMaxNotIn;
  }


  public IscsiLunWhereInput iopsRdNot(Long iopsRdNot) {
    
    this.iopsRdNot = iopsRdNot;
    return this;
  }

   /**
   * Get iopsRdNot
   * @return iopsRdNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getIopsRdNot() {
    return iopsRdNot;
  }


  public void setIopsRdNot(Long iopsRdNot) {
    this.iopsRdNot = iopsRdNot;
  }


  public IscsiLunWhereInput iopsRdNotIn(List<Long> iopsRdNotIn) {
    
    this.iopsRdNotIn = iopsRdNotIn;
    return this;
  }

  public IscsiLunWhereInput addIopsRdNotInItem(Long iopsRdNotInItem) {
    if (this.iopsRdNotIn == null) {
      this.iopsRdNotIn = new ArrayList<Long>();
    }
    this.iopsRdNotIn.add(iopsRdNotInItem);
    return this;
  }

   /**
   * Get iopsRdNotIn
   * @return iopsRdNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Long> getIopsRdNotIn() {
    return iopsRdNotIn;
  }


  public void setIopsRdNotIn(List<Long> iopsRdNotIn) {
    this.iopsRdNotIn = iopsRdNotIn;
  }


  public IscsiLunWhereInput iopsWr(Long iopsWr) {
    
    this.iopsWr = iopsWr;
    return this;
  }

   /**
   * Get iopsWr
   * @return iopsWr
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getIopsWr() {
    return iopsWr;
  }


  public void setIopsWr(Long iopsWr) {
    this.iopsWr = iopsWr;
  }


  public IscsiLunWhereInput iopsWrGt(Long iopsWrGt) {
    
    this.iopsWrGt = iopsWrGt;
    return this;
  }

   /**
   * Get iopsWrGt
   * @return iopsWrGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getIopsWrGt() {
    return iopsWrGt;
  }


  public void setIopsWrGt(Long iopsWrGt) {
    this.iopsWrGt = iopsWrGt;
  }


  public IscsiLunWhereInput iopsWrGte(Long iopsWrGte) {
    
    this.iopsWrGte = iopsWrGte;
    return this;
  }

   /**
   * Get iopsWrGte
   * @return iopsWrGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getIopsWrGte() {
    return iopsWrGte;
  }


  public void setIopsWrGte(Long iopsWrGte) {
    this.iopsWrGte = iopsWrGte;
  }


  public IscsiLunWhereInput iopsWrIn(List<Long> iopsWrIn) {
    
    this.iopsWrIn = iopsWrIn;
    return this;
  }

  public IscsiLunWhereInput addIopsWrInItem(Long iopsWrInItem) {
    if (this.iopsWrIn == null) {
      this.iopsWrIn = new ArrayList<Long>();
    }
    this.iopsWrIn.add(iopsWrInItem);
    return this;
  }

   /**
   * Get iopsWrIn
   * @return iopsWrIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Long> getIopsWrIn() {
    return iopsWrIn;
  }


  public void setIopsWrIn(List<Long> iopsWrIn) {
    this.iopsWrIn = iopsWrIn;
  }


  public IscsiLunWhereInput iopsWrLt(Long iopsWrLt) {
    
    this.iopsWrLt = iopsWrLt;
    return this;
  }

   /**
   * Get iopsWrLt
   * @return iopsWrLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getIopsWrLt() {
    return iopsWrLt;
  }


  public void setIopsWrLt(Long iopsWrLt) {
    this.iopsWrLt = iopsWrLt;
  }


  public IscsiLunWhereInput iopsWrLte(Long iopsWrLte) {
    
    this.iopsWrLte = iopsWrLte;
    return this;
  }

   /**
   * Get iopsWrLte
   * @return iopsWrLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getIopsWrLte() {
    return iopsWrLte;
  }


  public void setIopsWrLte(Long iopsWrLte) {
    this.iopsWrLte = iopsWrLte;
  }


  public IscsiLunWhereInput iopsWrMax(Long iopsWrMax) {
    
    this.iopsWrMax = iopsWrMax;
    return this;
  }

   /**
   * Get iopsWrMax
   * @return iopsWrMax
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getIopsWrMax() {
    return iopsWrMax;
  }


  public void setIopsWrMax(Long iopsWrMax) {
    this.iopsWrMax = iopsWrMax;
  }


  public IscsiLunWhereInput iopsWrMaxGt(Long iopsWrMaxGt) {
    
    this.iopsWrMaxGt = iopsWrMaxGt;
    return this;
  }

   /**
   * Get iopsWrMaxGt
   * @return iopsWrMaxGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getIopsWrMaxGt() {
    return iopsWrMaxGt;
  }


  public void setIopsWrMaxGt(Long iopsWrMaxGt) {
    this.iopsWrMaxGt = iopsWrMaxGt;
  }


  public IscsiLunWhereInput iopsWrMaxGte(Long iopsWrMaxGte) {
    
    this.iopsWrMaxGte = iopsWrMaxGte;
    return this;
  }

   /**
   * Get iopsWrMaxGte
   * @return iopsWrMaxGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getIopsWrMaxGte() {
    return iopsWrMaxGte;
  }


  public void setIopsWrMaxGte(Long iopsWrMaxGte) {
    this.iopsWrMaxGte = iopsWrMaxGte;
  }


  public IscsiLunWhereInput iopsWrMaxIn(List<Long> iopsWrMaxIn) {
    
    this.iopsWrMaxIn = iopsWrMaxIn;
    return this;
  }

  public IscsiLunWhereInput addIopsWrMaxInItem(Long iopsWrMaxInItem) {
    if (this.iopsWrMaxIn == null) {
      this.iopsWrMaxIn = new ArrayList<Long>();
    }
    this.iopsWrMaxIn.add(iopsWrMaxInItem);
    return this;
  }

   /**
   * Get iopsWrMaxIn
   * @return iopsWrMaxIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Long> getIopsWrMaxIn() {
    return iopsWrMaxIn;
  }


  public void setIopsWrMaxIn(List<Long> iopsWrMaxIn) {
    this.iopsWrMaxIn = iopsWrMaxIn;
  }


  public IscsiLunWhereInput iopsWrMaxLength(Long iopsWrMaxLength) {
    
    this.iopsWrMaxLength = iopsWrMaxLength;
    return this;
  }

   /**
   * Get iopsWrMaxLength
   * @return iopsWrMaxLength
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getIopsWrMaxLength() {
    return iopsWrMaxLength;
  }


  public void setIopsWrMaxLength(Long iopsWrMaxLength) {
    this.iopsWrMaxLength = iopsWrMaxLength;
  }


  public IscsiLunWhereInput iopsWrMaxLengthGt(Long iopsWrMaxLengthGt) {
    
    this.iopsWrMaxLengthGt = iopsWrMaxLengthGt;
    return this;
  }

   /**
   * Get iopsWrMaxLengthGt
   * @return iopsWrMaxLengthGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getIopsWrMaxLengthGt() {
    return iopsWrMaxLengthGt;
  }


  public void setIopsWrMaxLengthGt(Long iopsWrMaxLengthGt) {
    this.iopsWrMaxLengthGt = iopsWrMaxLengthGt;
  }


  public IscsiLunWhereInput iopsWrMaxLengthGte(Long iopsWrMaxLengthGte) {
    
    this.iopsWrMaxLengthGte = iopsWrMaxLengthGte;
    return this;
  }

   /**
   * Get iopsWrMaxLengthGte
   * @return iopsWrMaxLengthGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getIopsWrMaxLengthGte() {
    return iopsWrMaxLengthGte;
  }


  public void setIopsWrMaxLengthGte(Long iopsWrMaxLengthGte) {
    this.iopsWrMaxLengthGte = iopsWrMaxLengthGte;
  }


  public IscsiLunWhereInput iopsWrMaxLengthIn(List<Long> iopsWrMaxLengthIn) {
    
    this.iopsWrMaxLengthIn = iopsWrMaxLengthIn;
    return this;
  }

  public IscsiLunWhereInput addIopsWrMaxLengthInItem(Long iopsWrMaxLengthInItem) {
    if (this.iopsWrMaxLengthIn == null) {
      this.iopsWrMaxLengthIn = new ArrayList<Long>();
    }
    this.iopsWrMaxLengthIn.add(iopsWrMaxLengthInItem);
    return this;
  }

   /**
   * Get iopsWrMaxLengthIn
   * @return iopsWrMaxLengthIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Long> getIopsWrMaxLengthIn() {
    return iopsWrMaxLengthIn;
  }


  public void setIopsWrMaxLengthIn(List<Long> iopsWrMaxLengthIn) {
    this.iopsWrMaxLengthIn = iopsWrMaxLengthIn;
  }


  public IscsiLunWhereInput iopsWrMaxLengthLt(Long iopsWrMaxLengthLt) {
    
    this.iopsWrMaxLengthLt = iopsWrMaxLengthLt;
    return this;
  }

   /**
   * Get iopsWrMaxLengthLt
   * @return iopsWrMaxLengthLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getIopsWrMaxLengthLt() {
    return iopsWrMaxLengthLt;
  }


  public void setIopsWrMaxLengthLt(Long iopsWrMaxLengthLt) {
    this.iopsWrMaxLengthLt = iopsWrMaxLengthLt;
  }


  public IscsiLunWhereInput iopsWrMaxLengthLte(Long iopsWrMaxLengthLte) {
    
    this.iopsWrMaxLengthLte = iopsWrMaxLengthLte;
    return this;
  }

   /**
   * Get iopsWrMaxLengthLte
   * @return iopsWrMaxLengthLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getIopsWrMaxLengthLte() {
    return iopsWrMaxLengthLte;
  }


  public void setIopsWrMaxLengthLte(Long iopsWrMaxLengthLte) {
    this.iopsWrMaxLengthLte = iopsWrMaxLengthLte;
  }


  public IscsiLunWhereInput iopsWrMaxLengthNot(Long iopsWrMaxLengthNot) {
    
    this.iopsWrMaxLengthNot = iopsWrMaxLengthNot;
    return this;
  }

   /**
   * Get iopsWrMaxLengthNot
   * @return iopsWrMaxLengthNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getIopsWrMaxLengthNot() {
    return iopsWrMaxLengthNot;
  }


  public void setIopsWrMaxLengthNot(Long iopsWrMaxLengthNot) {
    this.iopsWrMaxLengthNot = iopsWrMaxLengthNot;
  }


  public IscsiLunWhereInput iopsWrMaxLengthNotIn(List<Long> iopsWrMaxLengthNotIn) {
    
    this.iopsWrMaxLengthNotIn = iopsWrMaxLengthNotIn;
    return this;
  }

  public IscsiLunWhereInput addIopsWrMaxLengthNotInItem(Long iopsWrMaxLengthNotInItem) {
    if (this.iopsWrMaxLengthNotIn == null) {
      this.iopsWrMaxLengthNotIn = new ArrayList<Long>();
    }
    this.iopsWrMaxLengthNotIn.add(iopsWrMaxLengthNotInItem);
    return this;
  }

   /**
   * Get iopsWrMaxLengthNotIn
   * @return iopsWrMaxLengthNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Long> getIopsWrMaxLengthNotIn() {
    return iopsWrMaxLengthNotIn;
  }


  public void setIopsWrMaxLengthNotIn(List<Long> iopsWrMaxLengthNotIn) {
    this.iopsWrMaxLengthNotIn = iopsWrMaxLengthNotIn;
  }


  public IscsiLunWhereInput iopsWrMaxLt(Long iopsWrMaxLt) {
    
    this.iopsWrMaxLt = iopsWrMaxLt;
    return this;
  }

   /**
   * Get iopsWrMaxLt
   * @return iopsWrMaxLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getIopsWrMaxLt() {
    return iopsWrMaxLt;
  }


  public void setIopsWrMaxLt(Long iopsWrMaxLt) {
    this.iopsWrMaxLt = iopsWrMaxLt;
  }


  public IscsiLunWhereInput iopsWrMaxLte(Long iopsWrMaxLte) {
    
    this.iopsWrMaxLte = iopsWrMaxLte;
    return this;
  }

   /**
   * Get iopsWrMaxLte
   * @return iopsWrMaxLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getIopsWrMaxLte() {
    return iopsWrMaxLte;
  }


  public void setIopsWrMaxLte(Long iopsWrMaxLte) {
    this.iopsWrMaxLte = iopsWrMaxLte;
  }


  public IscsiLunWhereInput iopsWrMaxNot(Long iopsWrMaxNot) {
    
    this.iopsWrMaxNot = iopsWrMaxNot;
    return this;
  }

   /**
   * Get iopsWrMaxNot
   * @return iopsWrMaxNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getIopsWrMaxNot() {
    return iopsWrMaxNot;
  }


  public void setIopsWrMaxNot(Long iopsWrMaxNot) {
    this.iopsWrMaxNot = iopsWrMaxNot;
  }


  public IscsiLunWhereInput iopsWrMaxNotIn(List<Long> iopsWrMaxNotIn) {
    
    this.iopsWrMaxNotIn = iopsWrMaxNotIn;
    return this;
  }

  public IscsiLunWhereInput addIopsWrMaxNotInItem(Long iopsWrMaxNotInItem) {
    if (this.iopsWrMaxNotIn == null) {
      this.iopsWrMaxNotIn = new ArrayList<Long>();
    }
    this.iopsWrMaxNotIn.add(iopsWrMaxNotInItem);
    return this;
  }

   /**
   * Get iopsWrMaxNotIn
   * @return iopsWrMaxNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Long> getIopsWrMaxNotIn() {
    return iopsWrMaxNotIn;
  }


  public void setIopsWrMaxNotIn(List<Long> iopsWrMaxNotIn) {
    this.iopsWrMaxNotIn = iopsWrMaxNotIn;
  }


  public IscsiLunWhereInput iopsWrNot(Long iopsWrNot) {
    
    this.iopsWrNot = iopsWrNot;
    return this;
  }

   /**
   * Get iopsWrNot
   * @return iopsWrNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getIopsWrNot() {
    return iopsWrNot;
  }


  public void setIopsWrNot(Long iopsWrNot) {
    this.iopsWrNot = iopsWrNot;
  }


  public IscsiLunWhereInput iopsWrNotIn(List<Long> iopsWrNotIn) {
    
    this.iopsWrNotIn = iopsWrNotIn;
    return this;
  }

  public IscsiLunWhereInput addIopsWrNotInItem(Long iopsWrNotInItem) {
    if (this.iopsWrNotIn == null) {
      this.iopsWrNotIn = new ArrayList<Long>();
    }
    this.iopsWrNotIn.add(iopsWrNotInItem);
    return this;
  }

   /**
   * Get iopsWrNotIn
   * @return iopsWrNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Long> getIopsWrNotIn() {
    return iopsWrNotIn;
  }


  public void setIopsWrNotIn(List<Long> iopsWrNotIn) {
    this.iopsWrNotIn = iopsWrNotIn;
  }


  public IscsiLunWhereInput iscsiTarget(IscsiTargetWhereInput iscsiTarget) {
    
    this.iscsiTarget = iscsiTarget;
    return this;
  }

   /**
   * Get iscsiTarget
   * @return iscsiTarget
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public IscsiTargetWhereInput getIscsiTarget() {
    return iscsiTarget;
  }


  public void setIscsiTarget(IscsiTargetWhereInput iscsiTarget) {
    this.iscsiTarget = iscsiTarget;
  }


  public IscsiLunWhereInput labelsEvery(LabelWhereInput labelsEvery) {
    
    this.labelsEvery = labelsEvery;
    return this;
  }

   /**
   * Get labelsEvery
   * @return labelsEvery
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public LabelWhereInput getLabelsEvery() {
    return labelsEvery;
  }


  public void setLabelsEvery(LabelWhereInput labelsEvery) {
    this.labelsEvery = labelsEvery;
  }


  public IscsiLunWhereInput labelsNone(LabelWhereInput labelsNone) {
    
    this.labelsNone = labelsNone;
    return this;
  }

   /**
   * Get labelsNone
   * @return labelsNone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public LabelWhereInput getLabelsNone() {
    return labelsNone;
  }


  public void setLabelsNone(LabelWhereInput labelsNone) {
    this.labelsNone = labelsNone;
  }


  public IscsiLunWhereInput labelsSome(LabelWhereInput labelsSome) {
    
    this.labelsSome = labelsSome;
    return this;
  }

   /**
   * Get labelsSome
   * @return labelsSome
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public LabelWhereInput getLabelsSome() {
    return labelsSome;
  }


  public void setLabelsSome(LabelWhereInput labelsSome) {
    this.labelsSome = labelsSome;
  }


  public IscsiLunWhereInput localCreatedAt(String localCreatedAt) {
    
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


  public IscsiLunWhereInput localCreatedAtGt(String localCreatedAtGt) {
    
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


  public IscsiLunWhereInput localCreatedAtGte(String localCreatedAtGte) {
    
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


  public IscsiLunWhereInput localCreatedAtIn(List<String> localCreatedAtIn) {
    
    this.localCreatedAtIn = localCreatedAtIn;
    return this;
  }

  public IscsiLunWhereInput addLocalCreatedAtInItem(String localCreatedAtInItem) {
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


  public IscsiLunWhereInput localCreatedAtLt(String localCreatedAtLt) {
    
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


  public IscsiLunWhereInput localCreatedAtLte(String localCreatedAtLte) {
    
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


  public IscsiLunWhereInput localCreatedAtNot(String localCreatedAtNot) {
    
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


  public IscsiLunWhereInput localCreatedAtNotIn(List<String> localCreatedAtNotIn) {
    
    this.localCreatedAtNotIn = localCreatedAtNotIn;
    return this;
  }

  public IscsiLunWhereInput addLocalCreatedAtNotInItem(String localCreatedAtNotInItem) {
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


  public IscsiLunWhereInput localId(String localId) {
    
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


  public IscsiLunWhereInput localIdContains(String localIdContains) {
    
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


  public IscsiLunWhereInput localIdEndsWith(String localIdEndsWith) {
    
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


  public IscsiLunWhereInput localIdGt(String localIdGt) {
    
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


  public IscsiLunWhereInput localIdGte(String localIdGte) {
    
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


  public IscsiLunWhereInput localIdIn(List<String> localIdIn) {
    
    this.localIdIn = localIdIn;
    return this;
  }

  public IscsiLunWhereInput addLocalIdInItem(String localIdInItem) {
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


  public IscsiLunWhereInput localIdLt(String localIdLt) {
    
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


  public IscsiLunWhereInput localIdLte(String localIdLte) {
    
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


  public IscsiLunWhereInput localIdNot(String localIdNot) {
    
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


  public IscsiLunWhereInput localIdNotContains(String localIdNotContains) {
    
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


  public IscsiLunWhereInput localIdNotEndsWith(String localIdNotEndsWith) {
    
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


  public IscsiLunWhereInput localIdNotIn(List<String> localIdNotIn) {
    
    this.localIdNotIn = localIdNotIn;
    return this;
  }

  public IscsiLunWhereInput addLocalIdNotInItem(String localIdNotInItem) {
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


  public IscsiLunWhereInput localIdNotStartsWith(String localIdNotStartsWith) {
    
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


  public IscsiLunWhereInput localIdStartsWith(String localIdStartsWith) {
    
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


  public IscsiLunWhereInput lunId(Integer lunId) {
    
    this.lunId = lunId;
    return this;
  }

   /**
   * Get lunId
   * @return lunId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getLunId() {
    return lunId;
  }


  public void setLunId(Integer lunId) {
    this.lunId = lunId;
  }


  public IscsiLunWhereInput lunIdGt(Integer lunIdGt) {
    
    this.lunIdGt = lunIdGt;
    return this;
  }

   /**
   * Get lunIdGt
   * @return lunIdGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getLunIdGt() {
    return lunIdGt;
  }


  public void setLunIdGt(Integer lunIdGt) {
    this.lunIdGt = lunIdGt;
  }


  public IscsiLunWhereInput lunIdGte(Integer lunIdGte) {
    
    this.lunIdGte = lunIdGte;
    return this;
  }

   /**
   * Get lunIdGte
   * @return lunIdGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getLunIdGte() {
    return lunIdGte;
  }


  public void setLunIdGte(Integer lunIdGte) {
    this.lunIdGte = lunIdGte;
  }


  public IscsiLunWhereInput lunIdIn(List<Integer> lunIdIn) {
    
    this.lunIdIn = lunIdIn;
    return this;
  }

  public IscsiLunWhereInput addLunIdInItem(Integer lunIdInItem) {
    if (this.lunIdIn == null) {
      this.lunIdIn = new ArrayList<Integer>();
    }
    this.lunIdIn.add(lunIdInItem);
    return this;
  }

   /**
   * Get lunIdIn
   * @return lunIdIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Integer> getLunIdIn() {
    return lunIdIn;
  }


  public void setLunIdIn(List<Integer> lunIdIn) {
    this.lunIdIn = lunIdIn;
  }


  public IscsiLunWhereInput lunIdLt(Integer lunIdLt) {
    
    this.lunIdLt = lunIdLt;
    return this;
  }

   /**
   * Get lunIdLt
   * @return lunIdLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getLunIdLt() {
    return lunIdLt;
  }


  public void setLunIdLt(Integer lunIdLt) {
    this.lunIdLt = lunIdLt;
  }


  public IscsiLunWhereInput lunIdLte(Integer lunIdLte) {
    
    this.lunIdLte = lunIdLte;
    return this;
  }

   /**
   * Get lunIdLte
   * @return lunIdLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getLunIdLte() {
    return lunIdLte;
  }


  public void setLunIdLte(Integer lunIdLte) {
    this.lunIdLte = lunIdLte;
  }


  public IscsiLunWhereInput lunIdNot(Integer lunIdNot) {
    
    this.lunIdNot = lunIdNot;
    return this;
  }

   /**
   * Get lunIdNot
   * @return lunIdNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getLunIdNot() {
    return lunIdNot;
  }


  public void setLunIdNot(Integer lunIdNot) {
    this.lunIdNot = lunIdNot;
  }


  public IscsiLunWhereInput lunIdNotIn(List<Integer> lunIdNotIn) {
    
    this.lunIdNotIn = lunIdNotIn;
    return this;
  }

  public IscsiLunWhereInput addLunIdNotInItem(Integer lunIdNotInItem) {
    if (this.lunIdNotIn == null) {
      this.lunIdNotIn = new ArrayList<Integer>();
    }
    this.lunIdNotIn.add(lunIdNotInItem);
    return this;
  }

   /**
   * Get lunIdNotIn
   * @return lunIdNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Integer> getLunIdNotIn() {
    return lunIdNotIn;
  }


  public void setLunIdNotIn(List<Integer> lunIdNotIn) {
    this.lunIdNotIn = lunIdNotIn;
  }


  public IscsiLunWhereInput name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public IscsiLunWhereInput nameContains(String nameContains) {
    
    this.nameContains = nameContains;
    return this;
  }

   /**
   * Get nameContains
   * @return nameContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNameContains() {
    return nameContains;
  }


  public void setNameContains(String nameContains) {
    this.nameContains = nameContains;
  }


  public IscsiLunWhereInput nameEndsWith(String nameEndsWith) {
    
    this.nameEndsWith = nameEndsWith;
    return this;
  }

   /**
   * Get nameEndsWith
   * @return nameEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNameEndsWith() {
    return nameEndsWith;
  }


  public void setNameEndsWith(String nameEndsWith) {
    this.nameEndsWith = nameEndsWith;
  }


  public IscsiLunWhereInput nameGt(String nameGt) {
    
    this.nameGt = nameGt;
    return this;
  }

   /**
   * Get nameGt
   * @return nameGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNameGt() {
    return nameGt;
  }


  public void setNameGt(String nameGt) {
    this.nameGt = nameGt;
  }


  public IscsiLunWhereInput nameGte(String nameGte) {
    
    this.nameGte = nameGte;
    return this;
  }

   /**
   * Get nameGte
   * @return nameGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNameGte() {
    return nameGte;
  }


  public void setNameGte(String nameGte) {
    this.nameGte = nameGte;
  }


  public IscsiLunWhereInput nameIn(List<String> nameIn) {
    
    this.nameIn = nameIn;
    return this;
  }

  public IscsiLunWhereInput addNameInItem(String nameInItem) {
    if (this.nameIn == null) {
      this.nameIn = new ArrayList<String>();
    }
    this.nameIn.add(nameInItem);
    return this;
  }

   /**
   * Get nameIn
   * @return nameIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getNameIn() {
    return nameIn;
  }


  public void setNameIn(List<String> nameIn) {
    this.nameIn = nameIn;
  }


  public IscsiLunWhereInput nameLt(String nameLt) {
    
    this.nameLt = nameLt;
    return this;
  }

   /**
   * Get nameLt
   * @return nameLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNameLt() {
    return nameLt;
  }


  public void setNameLt(String nameLt) {
    this.nameLt = nameLt;
  }


  public IscsiLunWhereInput nameLte(String nameLte) {
    
    this.nameLte = nameLte;
    return this;
  }

   /**
   * Get nameLte
   * @return nameLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNameLte() {
    return nameLte;
  }


  public void setNameLte(String nameLte) {
    this.nameLte = nameLte;
  }


  public IscsiLunWhereInput nameNot(String nameNot) {
    
    this.nameNot = nameNot;
    return this;
  }

   /**
   * Get nameNot
   * @return nameNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNameNot() {
    return nameNot;
  }


  public void setNameNot(String nameNot) {
    this.nameNot = nameNot;
  }


  public IscsiLunWhereInput nameNotContains(String nameNotContains) {
    
    this.nameNotContains = nameNotContains;
    return this;
  }

   /**
   * Get nameNotContains
   * @return nameNotContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNameNotContains() {
    return nameNotContains;
  }


  public void setNameNotContains(String nameNotContains) {
    this.nameNotContains = nameNotContains;
  }


  public IscsiLunWhereInput nameNotEndsWith(String nameNotEndsWith) {
    
    this.nameNotEndsWith = nameNotEndsWith;
    return this;
  }

   /**
   * Get nameNotEndsWith
   * @return nameNotEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNameNotEndsWith() {
    return nameNotEndsWith;
  }


  public void setNameNotEndsWith(String nameNotEndsWith) {
    this.nameNotEndsWith = nameNotEndsWith;
  }


  public IscsiLunWhereInput nameNotIn(List<String> nameNotIn) {
    
    this.nameNotIn = nameNotIn;
    return this;
  }

  public IscsiLunWhereInput addNameNotInItem(String nameNotInItem) {
    if (this.nameNotIn == null) {
      this.nameNotIn = new ArrayList<String>();
    }
    this.nameNotIn.add(nameNotInItem);
    return this;
  }

   /**
   * Get nameNotIn
   * @return nameNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getNameNotIn() {
    return nameNotIn;
  }


  public void setNameNotIn(List<String> nameNotIn) {
    this.nameNotIn = nameNotIn;
  }


  public IscsiLunWhereInput nameNotStartsWith(String nameNotStartsWith) {
    
    this.nameNotStartsWith = nameNotStartsWith;
    return this;
  }

   /**
   * Get nameNotStartsWith
   * @return nameNotStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNameNotStartsWith() {
    return nameNotStartsWith;
  }


  public void setNameNotStartsWith(String nameNotStartsWith) {
    this.nameNotStartsWith = nameNotStartsWith;
  }


  public IscsiLunWhereInput nameStartsWith(String nameStartsWith) {
    
    this.nameStartsWith = nameStartsWith;
    return this;
  }

   /**
   * Get nameStartsWith
   * @return nameStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNameStartsWith() {
    return nameStartsWith;
  }


  public void setNameStartsWith(String nameStartsWith) {
    this.nameStartsWith = nameStartsWith;
  }


  public IscsiLunWhereInput replicaNum(Integer replicaNum) {
    
    this.replicaNum = replicaNum;
    return this;
  }

   /**
   * Get replicaNum
   * @return replicaNum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getReplicaNum() {
    return replicaNum;
  }


  public void setReplicaNum(Integer replicaNum) {
    this.replicaNum = replicaNum;
  }


  public IscsiLunWhereInput replicaNumGt(Integer replicaNumGt) {
    
    this.replicaNumGt = replicaNumGt;
    return this;
  }

   /**
   * Get replicaNumGt
   * @return replicaNumGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getReplicaNumGt() {
    return replicaNumGt;
  }


  public void setReplicaNumGt(Integer replicaNumGt) {
    this.replicaNumGt = replicaNumGt;
  }


  public IscsiLunWhereInput replicaNumGte(Integer replicaNumGte) {
    
    this.replicaNumGte = replicaNumGte;
    return this;
  }

   /**
   * Get replicaNumGte
   * @return replicaNumGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getReplicaNumGte() {
    return replicaNumGte;
  }


  public void setReplicaNumGte(Integer replicaNumGte) {
    this.replicaNumGte = replicaNumGte;
  }


  public IscsiLunWhereInput replicaNumIn(List<Integer> replicaNumIn) {
    
    this.replicaNumIn = replicaNumIn;
    return this;
  }

  public IscsiLunWhereInput addReplicaNumInItem(Integer replicaNumInItem) {
    if (this.replicaNumIn == null) {
      this.replicaNumIn = new ArrayList<Integer>();
    }
    this.replicaNumIn.add(replicaNumInItem);
    return this;
  }

   /**
   * Get replicaNumIn
   * @return replicaNumIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Integer> getReplicaNumIn() {
    return replicaNumIn;
  }


  public void setReplicaNumIn(List<Integer> replicaNumIn) {
    this.replicaNumIn = replicaNumIn;
  }


  public IscsiLunWhereInput replicaNumLt(Integer replicaNumLt) {
    
    this.replicaNumLt = replicaNumLt;
    return this;
  }

   /**
   * Get replicaNumLt
   * @return replicaNumLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getReplicaNumLt() {
    return replicaNumLt;
  }


  public void setReplicaNumLt(Integer replicaNumLt) {
    this.replicaNumLt = replicaNumLt;
  }


  public IscsiLunWhereInput replicaNumLte(Integer replicaNumLte) {
    
    this.replicaNumLte = replicaNumLte;
    return this;
  }

   /**
   * Get replicaNumLte
   * @return replicaNumLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getReplicaNumLte() {
    return replicaNumLte;
  }


  public void setReplicaNumLte(Integer replicaNumLte) {
    this.replicaNumLte = replicaNumLte;
  }


  public IscsiLunWhereInput replicaNumNot(Integer replicaNumNot) {
    
    this.replicaNumNot = replicaNumNot;
    return this;
  }

   /**
   * Get replicaNumNot
   * @return replicaNumNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getReplicaNumNot() {
    return replicaNumNot;
  }


  public void setReplicaNumNot(Integer replicaNumNot) {
    this.replicaNumNot = replicaNumNot;
  }


  public IscsiLunWhereInput replicaNumNotIn(List<Integer> replicaNumNotIn) {
    
    this.replicaNumNotIn = replicaNumNotIn;
    return this;
  }

  public IscsiLunWhereInput addReplicaNumNotInItem(Integer replicaNumNotInItem) {
    if (this.replicaNumNotIn == null) {
      this.replicaNumNotIn = new ArrayList<Integer>();
    }
    this.replicaNumNotIn.add(replicaNumNotInItem);
    return this;
  }

   /**
   * Get replicaNumNotIn
   * @return replicaNumNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Integer> getReplicaNumNotIn() {
    return replicaNumNotIn;
  }


  public void setReplicaNumNotIn(List<Integer> replicaNumNotIn) {
    this.replicaNumNotIn = replicaNumNotIn;
  }


  public IscsiLunWhereInput sharedSize(Long sharedSize) {
    
    this.sharedSize = sharedSize;
    return this;
  }

   /**
   * Get sharedSize
   * @return sharedSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getSharedSize() {
    return sharedSize;
  }


  public void setSharedSize(Long sharedSize) {
    this.sharedSize = sharedSize;
  }


  public IscsiLunWhereInput sharedSizeGt(Long sharedSizeGt) {
    
    this.sharedSizeGt = sharedSizeGt;
    return this;
  }

   /**
   * Get sharedSizeGt
   * @return sharedSizeGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getSharedSizeGt() {
    return sharedSizeGt;
  }


  public void setSharedSizeGt(Long sharedSizeGt) {
    this.sharedSizeGt = sharedSizeGt;
  }


  public IscsiLunWhereInput sharedSizeGte(Long sharedSizeGte) {
    
    this.sharedSizeGte = sharedSizeGte;
    return this;
  }

   /**
   * Get sharedSizeGte
   * @return sharedSizeGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getSharedSizeGte() {
    return sharedSizeGte;
  }


  public void setSharedSizeGte(Long sharedSizeGte) {
    this.sharedSizeGte = sharedSizeGte;
  }


  public IscsiLunWhereInput sharedSizeIn(List<Long> sharedSizeIn) {
    
    this.sharedSizeIn = sharedSizeIn;
    return this;
  }

  public IscsiLunWhereInput addSharedSizeInItem(Long sharedSizeInItem) {
    if (this.sharedSizeIn == null) {
      this.sharedSizeIn = new ArrayList<Long>();
    }
    this.sharedSizeIn.add(sharedSizeInItem);
    return this;
  }

   /**
   * Get sharedSizeIn
   * @return sharedSizeIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Long> getSharedSizeIn() {
    return sharedSizeIn;
  }


  public void setSharedSizeIn(List<Long> sharedSizeIn) {
    this.sharedSizeIn = sharedSizeIn;
  }


  public IscsiLunWhereInput sharedSizeLt(Long sharedSizeLt) {
    
    this.sharedSizeLt = sharedSizeLt;
    return this;
  }

   /**
   * Get sharedSizeLt
   * @return sharedSizeLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getSharedSizeLt() {
    return sharedSizeLt;
  }


  public void setSharedSizeLt(Long sharedSizeLt) {
    this.sharedSizeLt = sharedSizeLt;
  }


  public IscsiLunWhereInput sharedSizeLte(Long sharedSizeLte) {
    
    this.sharedSizeLte = sharedSizeLte;
    return this;
  }

   /**
   * Get sharedSizeLte
   * @return sharedSizeLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getSharedSizeLte() {
    return sharedSizeLte;
  }


  public void setSharedSizeLte(Long sharedSizeLte) {
    this.sharedSizeLte = sharedSizeLte;
  }


  public IscsiLunWhereInput sharedSizeNot(Long sharedSizeNot) {
    
    this.sharedSizeNot = sharedSizeNot;
    return this;
  }

   /**
   * Get sharedSizeNot
   * @return sharedSizeNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getSharedSizeNot() {
    return sharedSizeNot;
  }


  public void setSharedSizeNot(Long sharedSizeNot) {
    this.sharedSizeNot = sharedSizeNot;
  }


  public IscsiLunWhereInput sharedSizeNotIn(List<Long> sharedSizeNotIn) {
    
    this.sharedSizeNotIn = sharedSizeNotIn;
    return this;
  }

  public IscsiLunWhereInput addSharedSizeNotInItem(Long sharedSizeNotInItem) {
    if (this.sharedSizeNotIn == null) {
      this.sharedSizeNotIn = new ArrayList<Long>();
    }
    this.sharedSizeNotIn.add(sharedSizeNotInItem);
    return this;
  }

   /**
   * Get sharedSizeNotIn
   * @return sharedSizeNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Long> getSharedSizeNotIn() {
    return sharedSizeNotIn;
  }


  public void setSharedSizeNotIn(List<Long> sharedSizeNotIn) {
    this.sharedSizeNotIn = sharedSizeNotIn;
  }


  public IscsiLunWhereInput snapshotNum(Integer snapshotNum) {
    
    this.snapshotNum = snapshotNum;
    return this;
  }

   /**
   * Get snapshotNum
   * @return snapshotNum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getSnapshotNum() {
    return snapshotNum;
  }


  public void setSnapshotNum(Integer snapshotNum) {
    this.snapshotNum = snapshotNum;
  }


  public IscsiLunWhereInput snapshotNumGt(Integer snapshotNumGt) {
    
    this.snapshotNumGt = snapshotNumGt;
    return this;
  }

   /**
   * Get snapshotNumGt
   * @return snapshotNumGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getSnapshotNumGt() {
    return snapshotNumGt;
  }


  public void setSnapshotNumGt(Integer snapshotNumGt) {
    this.snapshotNumGt = snapshotNumGt;
  }


  public IscsiLunWhereInput snapshotNumGte(Integer snapshotNumGte) {
    
    this.snapshotNumGte = snapshotNumGte;
    return this;
  }

   /**
   * Get snapshotNumGte
   * @return snapshotNumGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getSnapshotNumGte() {
    return snapshotNumGte;
  }


  public void setSnapshotNumGte(Integer snapshotNumGte) {
    this.snapshotNumGte = snapshotNumGte;
  }


  public IscsiLunWhereInput snapshotNumIn(List<Integer> snapshotNumIn) {
    
    this.snapshotNumIn = snapshotNumIn;
    return this;
  }

  public IscsiLunWhereInput addSnapshotNumInItem(Integer snapshotNumInItem) {
    if (this.snapshotNumIn == null) {
      this.snapshotNumIn = new ArrayList<Integer>();
    }
    this.snapshotNumIn.add(snapshotNumInItem);
    return this;
  }

   /**
   * Get snapshotNumIn
   * @return snapshotNumIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Integer> getSnapshotNumIn() {
    return snapshotNumIn;
  }


  public void setSnapshotNumIn(List<Integer> snapshotNumIn) {
    this.snapshotNumIn = snapshotNumIn;
  }


  public IscsiLunWhereInput snapshotNumLt(Integer snapshotNumLt) {
    
    this.snapshotNumLt = snapshotNumLt;
    return this;
  }

   /**
   * Get snapshotNumLt
   * @return snapshotNumLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getSnapshotNumLt() {
    return snapshotNumLt;
  }


  public void setSnapshotNumLt(Integer snapshotNumLt) {
    this.snapshotNumLt = snapshotNumLt;
  }


  public IscsiLunWhereInput snapshotNumLte(Integer snapshotNumLte) {
    
    this.snapshotNumLte = snapshotNumLte;
    return this;
  }

   /**
   * Get snapshotNumLte
   * @return snapshotNumLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getSnapshotNumLte() {
    return snapshotNumLte;
  }


  public void setSnapshotNumLte(Integer snapshotNumLte) {
    this.snapshotNumLte = snapshotNumLte;
  }


  public IscsiLunWhereInput snapshotNumNot(Integer snapshotNumNot) {
    
    this.snapshotNumNot = snapshotNumNot;
    return this;
  }

   /**
   * Get snapshotNumNot
   * @return snapshotNumNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getSnapshotNumNot() {
    return snapshotNumNot;
  }


  public void setSnapshotNumNot(Integer snapshotNumNot) {
    this.snapshotNumNot = snapshotNumNot;
  }


  public IscsiLunWhereInput snapshotNumNotIn(List<Integer> snapshotNumNotIn) {
    
    this.snapshotNumNotIn = snapshotNumNotIn;
    return this;
  }

  public IscsiLunWhereInput addSnapshotNumNotInItem(Integer snapshotNumNotInItem) {
    if (this.snapshotNumNotIn == null) {
      this.snapshotNumNotIn = new ArrayList<Integer>();
    }
    this.snapshotNumNotIn.add(snapshotNumNotInItem);
    return this;
  }

   /**
   * Get snapshotNumNotIn
   * @return snapshotNumNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Integer> getSnapshotNumNotIn() {
    return snapshotNumNotIn;
  }


  public void setSnapshotNumNotIn(List<Integer> snapshotNumNotIn) {
    this.snapshotNumNotIn = snapshotNumNotIn;
  }


  public IscsiLunWhereInput stripeNum(Integer stripeNum) {
    
    this.stripeNum = stripeNum;
    return this;
  }

   /**
   * Get stripeNum
   * @return stripeNum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getStripeNum() {
    return stripeNum;
  }


  public void setStripeNum(Integer stripeNum) {
    this.stripeNum = stripeNum;
  }


  public IscsiLunWhereInput stripeNumGt(Integer stripeNumGt) {
    
    this.stripeNumGt = stripeNumGt;
    return this;
  }

   /**
   * Get stripeNumGt
   * @return stripeNumGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getStripeNumGt() {
    return stripeNumGt;
  }


  public void setStripeNumGt(Integer stripeNumGt) {
    this.stripeNumGt = stripeNumGt;
  }


  public IscsiLunWhereInput stripeNumGte(Integer stripeNumGte) {
    
    this.stripeNumGte = stripeNumGte;
    return this;
  }

   /**
   * Get stripeNumGte
   * @return stripeNumGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getStripeNumGte() {
    return stripeNumGte;
  }


  public void setStripeNumGte(Integer stripeNumGte) {
    this.stripeNumGte = stripeNumGte;
  }


  public IscsiLunWhereInput stripeNumIn(List<Integer> stripeNumIn) {
    
    this.stripeNumIn = stripeNumIn;
    return this;
  }

  public IscsiLunWhereInput addStripeNumInItem(Integer stripeNumInItem) {
    if (this.stripeNumIn == null) {
      this.stripeNumIn = new ArrayList<Integer>();
    }
    this.stripeNumIn.add(stripeNumInItem);
    return this;
  }

   /**
   * Get stripeNumIn
   * @return stripeNumIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Integer> getStripeNumIn() {
    return stripeNumIn;
  }


  public void setStripeNumIn(List<Integer> stripeNumIn) {
    this.stripeNumIn = stripeNumIn;
  }


  public IscsiLunWhereInput stripeNumLt(Integer stripeNumLt) {
    
    this.stripeNumLt = stripeNumLt;
    return this;
  }

   /**
   * Get stripeNumLt
   * @return stripeNumLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getStripeNumLt() {
    return stripeNumLt;
  }


  public void setStripeNumLt(Integer stripeNumLt) {
    this.stripeNumLt = stripeNumLt;
  }


  public IscsiLunWhereInput stripeNumLte(Integer stripeNumLte) {
    
    this.stripeNumLte = stripeNumLte;
    return this;
  }

   /**
   * Get stripeNumLte
   * @return stripeNumLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getStripeNumLte() {
    return stripeNumLte;
  }


  public void setStripeNumLte(Integer stripeNumLte) {
    this.stripeNumLte = stripeNumLte;
  }


  public IscsiLunWhereInput stripeNumNot(Integer stripeNumNot) {
    
    this.stripeNumNot = stripeNumNot;
    return this;
  }

   /**
   * Get stripeNumNot
   * @return stripeNumNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getStripeNumNot() {
    return stripeNumNot;
  }


  public void setStripeNumNot(Integer stripeNumNot) {
    this.stripeNumNot = stripeNumNot;
  }


  public IscsiLunWhereInput stripeNumNotIn(List<Integer> stripeNumNotIn) {
    
    this.stripeNumNotIn = stripeNumNotIn;
    return this;
  }

  public IscsiLunWhereInput addStripeNumNotInItem(Integer stripeNumNotInItem) {
    if (this.stripeNumNotIn == null) {
      this.stripeNumNotIn = new ArrayList<Integer>();
    }
    this.stripeNumNotIn.add(stripeNumNotInItem);
    return this;
  }

   /**
   * Get stripeNumNotIn
   * @return stripeNumNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Integer> getStripeNumNotIn() {
    return stripeNumNotIn;
  }


  public void setStripeNumNotIn(List<Integer> stripeNumNotIn) {
    this.stripeNumNotIn = stripeNumNotIn;
  }


  public IscsiLunWhereInput stripeSize(Long stripeSize) {
    
    this.stripeSize = stripeSize;
    return this;
  }

   /**
   * Get stripeSize
   * @return stripeSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getStripeSize() {
    return stripeSize;
  }


  public void setStripeSize(Long stripeSize) {
    this.stripeSize = stripeSize;
  }


  public IscsiLunWhereInput stripeSizeGt(Long stripeSizeGt) {
    
    this.stripeSizeGt = stripeSizeGt;
    return this;
  }

   /**
   * Get stripeSizeGt
   * @return stripeSizeGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getStripeSizeGt() {
    return stripeSizeGt;
  }


  public void setStripeSizeGt(Long stripeSizeGt) {
    this.stripeSizeGt = stripeSizeGt;
  }


  public IscsiLunWhereInput stripeSizeGte(Long stripeSizeGte) {
    
    this.stripeSizeGte = stripeSizeGte;
    return this;
  }

   /**
   * Get stripeSizeGte
   * @return stripeSizeGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getStripeSizeGte() {
    return stripeSizeGte;
  }


  public void setStripeSizeGte(Long stripeSizeGte) {
    this.stripeSizeGte = stripeSizeGte;
  }


  public IscsiLunWhereInput stripeSizeIn(List<Long> stripeSizeIn) {
    
    this.stripeSizeIn = stripeSizeIn;
    return this;
  }

  public IscsiLunWhereInput addStripeSizeInItem(Long stripeSizeInItem) {
    if (this.stripeSizeIn == null) {
      this.stripeSizeIn = new ArrayList<Long>();
    }
    this.stripeSizeIn.add(stripeSizeInItem);
    return this;
  }

   /**
   * Get stripeSizeIn
   * @return stripeSizeIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Long> getStripeSizeIn() {
    return stripeSizeIn;
  }


  public void setStripeSizeIn(List<Long> stripeSizeIn) {
    this.stripeSizeIn = stripeSizeIn;
  }


  public IscsiLunWhereInput stripeSizeLt(Long stripeSizeLt) {
    
    this.stripeSizeLt = stripeSizeLt;
    return this;
  }

   /**
   * Get stripeSizeLt
   * @return stripeSizeLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getStripeSizeLt() {
    return stripeSizeLt;
  }


  public void setStripeSizeLt(Long stripeSizeLt) {
    this.stripeSizeLt = stripeSizeLt;
  }


  public IscsiLunWhereInput stripeSizeLte(Long stripeSizeLte) {
    
    this.stripeSizeLte = stripeSizeLte;
    return this;
  }

   /**
   * Get stripeSizeLte
   * @return stripeSizeLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getStripeSizeLte() {
    return stripeSizeLte;
  }


  public void setStripeSizeLte(Long stripeSizeLte) {
    this.stripeSizeLte = stripeSizeLte;
  }


  public IscsiLunWhereInput stripeSizeNot(Long stripeSizeNot) {
    
    this.stripeSizeNot = stripeSizeNot;
    return this;
  }

   /**
   * Get stripeSizeNot
   * @return stripeSizeNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getStripeSizeNot() {
    return stripeSizeNot;
  }


  public void setStripeSizeNot(Long stripeSizeNot) {
    this.stripeSizeNot = stripeSizeNot;
  }


  public IscsiLunWhereInput stripeSizeNotIn(List<Long> stripeSizeNotIn) {
    
    this.stripeSizeNotIn = stripeSizeNotIn;
    return this;
  }

  public IscsiLunWhereInput addStripeSizeNotInItem(Long stripeSizeNotInItem) {
    if (this.stripeSizeNotIn == null) {
      this.stripeSizeNotIn = new ArrayList<Long>();
    }
    this.stripeSizeNotIn.add(stripeSizeNotInItem);
    return this;
  }

   /**
   * Get stripeSizeNotIn
   * @return stripeSizeNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Long> getStripeSizeNotIn() {
    return stripeSizeNotIn;
  }


  public void setStripeSizeNotIn(List<Long> stripeSizeNotIn) {
    this.stripeSizeNotIn = stripeSizeNotIn;
  }


  public IscsiLunWhereInput thinProvision(Boolean thinProvision) {
    
    this.thinProvision = thinProvision;
    return this;
  }

   /**
   * Get thinProvision
   * @return thinProvision
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getThinProvision() {
    return thinProvision;
  }


  public void setThinProvision(Boolean thinProvision) {
    this.thinProvision = thinProvision;
  }


  public IscsiLunWhereInput thinProvisionNot(Boolean thinProvisionNot) {
    
    this.thinProvisionNot = thinProvisionNot;
    return this;
  }

   /**
   * Get thinProvisionNot
   * @return thinProvisionNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getThinProvisionNot() {
    return thinProvisionNot;
  }


  public void setThinProvisionNot(Boolean thinProvisionNot) {
    this.thinProvisionNot = thinProvisionNot;
  }


  public IscsiLunWhereInput uniqueLogicalSize(Double uniqueLogicalSize) {
    
    this.uniqueLogicalSize = uniqueLogicalSize;
    return this;
  }

   /**
   * Get uniqueLogicalSize
   * @return uniqueLogicalSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getUniqueLogicalSize() {
    return uniqueLogicalSize;
  }


  public void setUniqueLogicalSize(Double uniqueLogicalSize) {
    this.uniqueLogicalSize = uniqueLogicalSize;
  }


  public IscsiLunWhereInput uniqueLogicalSizeGt(Double uniqueLogicalSizeGt) {
    
    this.uniqueLogicalSizeGt = uniqueLogicalSizeGt;
    return this;
  }

   /**
   * Get uniqueLogicalSizeGt
   * @return uniqueLogicalSizeGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getUniqueLogicalSizeGt() {
    return uniqueLogicalSizeGt;
  }


  public void setUniqueLogicalSizeGt(Double uniqueLogicalSizeGt) {
    this.uniqueLogicalSizeGt = uniqueLogicalSizeGt;
  }


  public IscsiLunWhereInput uniqueLogicalSizeGte(Double uniqueLogicalSizeGte) {
    
    this.uniqueLogicalSizeGte = uniqueLogicalSizeGte;
    return this;
  }

   /**
   * Get uniqueLogicalSizeGte
   * @return uniqueLogicalSizeGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getUniqueLogicalSizeGte() {
    return uniqueLogicalSizeGte;
  }


  public void setUniqueLogicalSizeGte(Double uniqueLogicalSizeGte) {
    this.uniqueLogicalSizeGte = uniqueLogicalSizeGte;
  }


  public IscsiLunWhereInput uniqueLogicalSizeIn(List<Double> uniqueLogicalSizeIn) {
    
    this.uniqueLogicalSizeIn = uniqueLogicalSizeIn;
    return this;
  }

  public IscsiLunWhereInput addUniqueLogicalSizeInItem(Double uniqueLogicalSizeInItem) {
    if (this.uniqueLogicalSizeIn == null) {
      this.uniqueLogicalSizeIn = new ArrayList<Double>();
    }
    this.uniqueLogicalSizeIn.add(uniqueLogicalSizeInItem);
    return this;
  }

   /**
   * Get uniqueLogicalSizeIn
   * @return uniqueLogicalSizeIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Double> getUniqueLogicalSizeIn() {
    return uniqueLogicalSizeIn;
  }


  public void setUniqueLogicalSizeIn(List<Double> uniqueLogicalSizeIn) {
    this.uniqueLogicalSizeIn = uniqueLogicalSizeIn;
  }


  public IscsiLunWhereInput uniqueLogicalSizeLt(Double uniqueLogicalSizeLt) {
    
    this.uniqueLogicalSizeLt = uniqueLogicalSizeLt;
    return this;
  }

   /**
   * Get uniqueLogicalSizeLt
   * @return uniqueLogicalSizeLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getUniqueLogicalSizeLt() {
    return uniqueLogicalSizeLt;
  }


  public void setUniqueLogicalSizeLt(Double uniqueLogicalSizeLt) {
    this.uniqueLogicalSizeLt = uniqueLogicalSizeLt;
  }


  public IscsiLunWhereInput uniqueLogicalSizeLte(Double uniqueLogicalSizeLte) {
    
    this.uniqueLogicalSizeLte = uniqueLogicalSizeLte;
    return this;
  }

   /**
   * Get uniqueLogicalSizeLte
   * @return uniqueLogicalSizeLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getUniqueLogicalSizeLte() {
    return uniqueLogicalSizeLte;
  }


  public void setUniqueLogicalSizeLte(Double uniqueLogicalSizeLte) {
    this.uniqueLogicalSizeLte = uniqueLogicalSizeLte;
  }


  public IscsiLunWhereInput uniqueLogicalSizeNot(Double uniqueLogicalSizeNot) {
    
    this.uniqueLogicalSizeNot = uniqueLogicalSizeNot;
    return this;
  }

   /**
   * Get uniqueLogicalSizeNot
   * @return uniqueLogicalSizeNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getUniqueLogicalSizeNot() {
    return uniqueLogicalSizeNot;
  }


  public void setUniqueLogicalSizeNot(Double uniqueLogicalSizeNot) {
    this.uniqueLogicalSizeNot = uniqueLogicalSizeNot;
  }


  public IscsiLunWhereInput uniqueLogicalSizeNotIn(List<Double> uniqueLogicalSizeNotIn) {
    
    this.uniqueLogicalSizeNotIn = uniqueLogicalSizeNotIn;
    return this;
  }

  public IscsiLunWhereInput addUniqueLogicalSizeNotInItem(Double uniqueLogicalSizeNotInItem) {
    if (this.uniqueLogicalSizeNotIn == null) {
      this.uniqueLogicalSizeNotIn = new ArrayList<Double>();
    }
    this.uniqueLogicalSizeNotIn.add(uniqueLogicalSizeNotInItem);
    return this;
  }

   /**
   * Get uniqueLogicalSizeNotIn
   * @return uniqueLogicalSizeNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Double> getUniqueLogicalSizeNotIn() {
    return uniqueLogicalSizeNotIn;
  }


  public void setUniqueLogicalSizeNotIn(List<Double> uniqueLogicalSizeNotIn) {
    this.uniqueLogicalSizeNotIn = uniqueLogicalSizeNotIn;
  }


  public IscsiLunWhereInput uniqueSize(Long uniqueSize) {
    
    this.uniqueSize = uniqueSize;
    return this;
  }

   /**
   * Get uniqueSize
   * @return uniqueSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getUniqueSize() {
    return uniqueSize;
  }


  public void setUniqueSize(Long uniqueSize) {
    this.uniqueSize = uniqueSize;
  }


  public IscsiLunWhereInput uniqueSizeGt(Long uniqueSizeGt) {
    
    this.uniqueSizeGt = uniqueSizeGt;
    return this;
  }

   /**
   * Get uniqueSizeGt
   * @return uniqueSizeGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getUniqueSizeGt() {
    return uniqueSizeGt;
  }


  public void setUniqueSizeGt(Long uniqueSizeGt) {
    this.uniqueSizeGt = uniqueSizeGt;
  }


  public IscsiLunWhereInput uniqueSizeGte(Long uniqueSizeGte) {
    
    this.uniqueSizeGte = uniqueSizeGte;
    return this;
  }

   /**
   * Get uniqueSizeGte
   * @return uniqueSizeGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getUniqueSizeGte() {
    return uniqueSizeGte;
  }


  public void setUniqueSizeGte(Long uniqueSizeGte) {
    this.uniqueSizeGte = uniqueSizeGte;
  }


  public IscsiLunWhereInput uniqueSizeIn(List<Long> uniqueSizeIn) {
    
    this.uniqueSizeIn = uniqueSizeIn;
    return this;
  }

  public IscsiLunWhereInput addUniqueSizeInItem(Long uniqueSizeInItem) {
    if (this.uniqueSizeIn == null) {
      this.uniqueSizeIn = new ArrayList<Long>();
    }
    this.uniqueSizeIn.add(uniqueSizeInItem);
    return this;
  }

   /**
   * Get uniqueSizeIn
   * @return uniqueSizeIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Long> getUniqueSizeIn() {
    return uniqueSizeIn;
  }


  public void setUniqueSizeIn(List<Long> uniqueSizeIn) {
    this.uniqueSizeIn = uniqueSizeIn;
  }


  public IscsiLunWhereInput uniqueSizeLt(Long uniqueSizeLt) {
    
    this.uniqueSizeLt = uniqueSizeLt;
    return this;
  }

   /**
   * Get uniqueSizeLt
   * @return uniqueSizeLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getUniqueSizeLt() {
    return uniqueSizeLt;
  }


  public void setUniqueSizeLt(Long uniqueSizeLt) {
    this.uniqueSizeLt = uniqueSizeLt;
  }


  public IscsiLunWhereInput uniqueSizeLte(Long uniqueSizeLte) {
    
    this.uniqueSizeLte = uniqueSizeLte;
    return this;
  }

   /**
   * Get uniqueSizeLte
   * @return uniqueSizeLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getUniqueSizeLte() {
    return uniqueSizeLte;
  }


  public void setUniqueSizeLte(Long uniqueSizeLte) {
    this.uniqueSizeLte = uniqueSizeLte;
  }


  public IscsiLunWhereInput uniqueSizeNot(Long uniqueSizeNot) {
    
    this.uniqueSizeNot = uniqueSizeNot;
    return this;
  }

   /**
   * Get uniqueSizeNot
   * @return uniqueSizeNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getUniqueSizeNot() {
    return uniqueSizeNot;
  }


  public void setUniqueSizeNot(Long uniqueSizeNot) {
    this.uniqueSizeNot = uniqueSizeNot;
  }


  public IscsiLunWhereInput uniqueSizeNotIn(List<Long> uniqueSizeNotIn) {
    
    this.uniqueSizeNotIn = uniqueSizeNotIn;
    return this;
  }

  public IscsiLunWhereInput addUniqueSizeNotInItem(Long uniqueSizeNotInItem) {
    if (this.uniqueSizeNotIn == null) {
      this.uniqueSizeNotIn = new ArrayList<Long>();
    }
    this.uniqueSizeNotIn.add(uniqueSizeNotInItem);
    return this;
  }

   /**
   * Get uniqueSizeNotIn
   * @return uniqueSizeNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Long> getUniqueSizeNotIn() {
    return uniqueSizeNotIn;
  }


  public void setUniqueSizeNotIn(List<Long> uniqueSizeNotIn) {
    this.uniqueSizeNotIn = uniqueSizeNotIn;
  }


  public IscsiLunWhereInput zbsVolumeId(String zbsVolumeId) {
    
    this.zbsVolumeId = zbsVolumeId;
    return this;
  }

   /**
   * Get zbsVolumeId
   * @return zbsVolumeId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getZbsVolumeId() {
    return zbsVolumeId;
  }


  public void setZbsVolumeId(String zbsVolumeId) {
    this.zbsVolumeId = zbsVolumeId;
  }


  public IscsiLunWhereInput zbsVolumeIdContains(String zbsVolumeIdContains) {
    
    this.zbsVolumeIdContains = zbsVolumeIdContains;
    return this;
  }

   /**
   * Get zbsVolumeIdContains
   * @return zbsVolumeIdContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getZbsVolumeIdContains() {
    return zbsVolumeIdContains;
  }


  public void setZbsVolumeIdContains(String zbsVolumeIdContains) {
    this.zbsVolumeIdContains = zbsVolumeIdContains;
  }


  public IscsiLunWhereInput zbsVolumeIdEndsWith(String zbsVolumeIdEndsWith) {
    
    this.zbsVolumeIdEndsWith = zbsVolumeIdEndsWith;
    return this;
  }

   /**
   * Get zbsVolumeIdEndsWith
   * @return zbsVolumeIdEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getZbsVolumeIdEndsWith() {
    return zbsVolumeIdEndsWith;
  }


  public void setZbsVolumeIdEndsWith(String zbsVolumeIdEndsWith) {
    this.zbsVolumeIdEndsWith = zbsVolumeIdEndsWith;
  }


  public IscsiLunWhereInput zbsVolumeIdGt(String zbsVolumeIdGt) {
    
    this.zbsVolumeIdGt = zbsVolumeIdGt;
    return this;
  }

   /**
   * Get zbsVolumeIdGt
   * @return zbsVolumeIdGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getZbsVolumeIdGt() {
    return zbsVolumeIdGt;
  }


  public void setZbsVolumeIdGt(String zbsVolumeIdGt) {
    this.zbsVolumeIdGt = zbsVolumeIdGt;
  }


  public IscsiLunWhereInput zbsVolumeIdGte(String zbsVolumeIdGte) {
    
    this.zbsVolumeIdGte = zbsVolumeIdGte;
    return this;
  }

   /**
   * Get zbsVolumeIdGte
   * @return zbsVolumeIdGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getZbsVolumeIdGte() {
    return zbsVolumeIdGte;
  }


  public void setZbsVolumeIdGte(String zbsVolumeIdGte) {
    this.zbsVolumeIdGte = zbsVolumeIdGte;
  }


  public IscsiLunWhereInput zbsVolumeIdIn(List<String> zbsVolumeIdIn) {
    
    this.zbsVolumeIdIn = zbsVolumeIdIn;
    return this;
  }

  public IscsiLunWhereInput addZbsVolumeIdInItem(String zbsVolumeIdInItem) {
    if (this.zbsVolumeIdIn == null) {
      this.zbsVolumeIdIn = new ArrayList<String>();
    }
    this.zbsVolumeIdIn.add(zbsVolumeIdInItem);
    return this;
  }

   /**
   * Get zbsVolumeIdIn
   * @return zbsVolumeIdIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getZbsVolumeIdIn() {
    return zbsVolumeIdIn;
  }


  public void setZbsVolumeIdIn(List<String> zbsVolumeIdIn) {
    this.zbsVolumeIdIn = zbsVolumeIdIn;
  }


  public IscsiLunWhereInput zbsVolumeIdLt(String zbsVolumeIdLt) {
    
    this.zbsVolumeIdLt = zbsVolumeIdLt;
    return this;
  }

   /**
   * Get zbsVolumeIdLt
   * @return zbsVolumeIdLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getZbsVolumeIdLt() {
    return zbsVolumeIdLt;
  }


  public void setZbsVolumeIdLt(String zbsVolumeIdLt) {
    this.zbsVolumeIdLt = zbsVolumeIdLt;
  }


  public IscsiLunWhereInput zbsVolumeIdLte(String zbsVolumeIdLte) {
    
    this.zbsVolumeIdLte = zbsVolumeIdLte;
    return this;
  }

   /**
   * Get zbsVolumeIdLte
   * @return zbsVolumeIdLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getZbsVolumeIdLte() {
    return zbsVolumeIdLte;
  }


  public void setZbsVolumeIdLte(String zbsVolumeIdLte) {
    this.zbsVolumeIdLte = zbsVolumeIdLte;
  }


  public IscsiLunWhereInput zbsVolumeIdNot(String zbsVolumeIdNot) {
    
    this.zbsVolumeIdNot = zbsVolumeIdNot;
    return this;
  }

   /**
   * Get zbsVolumeIdNot
   * @return zbsVolumeIdNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getZbsVolumeIdNot() {
    return zbsVolumeIdNot;
  }


  public void setZbsVolumeIdNot(String zbsVolumeIdNot) {
    this.zbsVolumeIdNot = zbsVolumeIdNot;
  }


  public IscsiLunWhereInput zbsVolumeIdNotContains(String zbsVolumeIdNotContains) {
    
    this.zbsVolumeIdNotContains = zbsVolumeIdNotContains;
    return this;
  }

   /**
   * Get zbsVolumeIdNotContains
   * @return zbsVolumeIdNotContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getZbsVolumeIdNotContains() {
    return zbsVolumeIdNotContains;
  }


  public void setZbsVolumeIdNotContains(String zbsVolumeIdNotContains) {
    this.zbsVolumeIdNotContains = zbsVolumeIdNotContains;
  }


  public IscsiLunWhereInput zbsVolumeIdNotEndsWith(String zbsVolumeIdNotEndsWith) {
    
    this.zbsVolumeIdNotEndsWith = zbsVolumeIdNotEndsWith;
    return this;
  }

   /**
   * Get zbsVolumeIdNotEndsWith
   * @return zbsVolumeIdNotEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getZbsVolumeIdNotEndsWith() {
    return zbsVolumeIdNotEndsWith;
  }


  public void setZbsVolumeIdNotEndsWith(String zbsVolumeIdNotEndsWith) {
    this.zbsVolumeIdNotEndsWith = zbsVolumeIdNotEndsWith;
  }


  public IscsiLunWhereInput zbsVolumeIdNotIn(List<String> zbsVolumeIdNotIn) {
    
    this.zbsVolumeIdNotIn = zbsVolumeIdNotIn;
    return this;
  }

  public IscsiLunWhereInput addZbsVolumeIdNotInItem(String zbsVolumeIdNotInItem) {
    if (this.zbsVolumeIdNotIn == null) {
      this.zbsVolumeIdNotIn = new ArrayList<String>();
    }
    this.zbsVolumeIdNotIn.add(zbsVolumeIdNotInItem);
    return this;
  }

   /**
   * Get zbsVolumeIdNotIn
   * @return zbsVolumeIdNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getZbsVolumeIdNotIn() {
    return zbsVolumeIdNotIn;
  }


  public void setZbsVolumeIdNotIn(List<String> zbsVolumeIdNotIn) {
    this.zbsVolumeIdNotIn = zbsVolumeIdNotIn;
  }


  public IscsiLunWhereInput zbsVolumeIdNotStartsWith(String zbsVolumeIdNotStartsWith) {
    
    this.zbsVolumeIdNotStartsWith = zbsVolumeIdNotStartsWith;
    return this;
  }

   /**
   * Get zbsVolumeIdNotStartsWith
   * @return zbsVolumeIdNotStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getZbsVolumeIdNotStartsWith() {
    return zbsVolumeIdNotStartsWith;
  }


  public void setZbsVolumeIdNotStartsWith(String zbsVolumeIdNotStartsWith) {
    this.zbsVolumeIdNotStartsWith = zbsVolumeIdNotStartsWith;
  }


  public IscsiLunWhereInput zbsVolumeIdStartsWith(String zbsVolumeIdStartsWith) {
    
    this.zbsVolumeIdStartsWith = zbsVolumeIdStartsWith;
    return this;
  }

   /**
   * Get zbsVolumeIdStartsWith
   * @return zbsVolumeIdStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getZbsVolumeIdStartsWith() {
    return zbsVolumeIdStartsWith;
  }


  public void setZbsVolumeIdStartsWith(String zbsVolumeIdStartsWith) {
    this.zbsVolumeIdStartsWith = zbsVolumeIdStartsWith;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IscsiLunWhereInput iscsiLunWhereInput = (IscsiLunWhereInput) o;
    return Objects.equals(this.AND, iscsiLunWhereInput.AND) &&
        Objects.equals(this.NOT, iscsiLunWhereInput.NOT) &&
        Objects.equals(this.OR, iscsiLunWhereInput.OR) &&
        Objects.equals(this.allowedInitiators, iscsiLunWhereInput.allowedInitiators) &&
        Objects.equals(this.allowedInitiatorsContains, iscsiLunWhereInput.allowedInitiatorsContains) &&
        Objects.equals(this.allowedInitiatorsEndsWith, iscsiLunWhereInput.allowedInitiatorsEndsWith) &&
        Objects.equals(this.allowedInitiatorsGt, iscsiLunWhereInput.allowedInitiatorsGt) &&
        Objects.equals(this.allowedInitiatorsGte, iscsiLunWhereInput.allowedInitiatorsGte) &&
        Objects.equals(this.allowedInitiatorsIn, iscsiLunWhereInput.allowedInitiatorsIn) &&
        Objects.equals(this.allowedInitiatorsLt, iscsiLunWhereInput.allowedInitiatorsLt) &&
        Objects.equals(this.allowedInitiatorsLte, iscsiLunWhereInput.allowedInitiatorsLte) &&
        Objects.equals(this.allowedInitiatorsNot, iscsiLunWhereInput.allowedInitiatorsNot) &&
        Objects.equals(this.allowedInitiatorsNotContains, iscsiLunWhereInput.allowedInitiatorsNotContains) &&
        Objects.equals(this.allowedInitiatorsNotEndsWith, iscsiLunWhereInput.allowedInitiatorsNotEndsWith) &&
        Objects.equals(this.allowedInitiatorsNotIn, iscsiLunWhereInput.allowedInitiatorsNotIn) &&
        Objects.equals(this.allowedInitiatorsNotStartsWith, iscsiLunWhereInput.allowedInitiatorsNotStartsWith) &&
        Objects.equals(this.allowedInitiatorsStartsWith, iscsiLunWhereInput.allowedInitiatorsStartsWith) &&
        Objects.equals(this.assignedSize, iscsiLunWhereInput.assignedSize) &&
        Objects.equals(this.assignedSizeGt, iscsiLunWhereInput.assignedSizeGt) &&
        Objects.equals(this.assignedSizeGte, iscsiLunWhereInput.assignedSizeGte) &&
        Objects.equals(this.assignedSizeIn, iscsiLunWhereInput.assignedSizeIn) &&
        Objects.equals(this.assignedSizeLt, iscsiLunWhereInput.assignedSizeLt) &&
        Objects.equals(this.assignedSizeLte, iscsiLunWhereInput.assignedSizeLte) &&
        Objects.equals(this.assignedSizeNot, iscsiLunWhereInput.assignedSizeNot) &&
        Objects.equals(this.assignedSizeNotIn, iscsiLunWhereInput.assignedSizeNotIn) &&
        Objects.equals(this.bps, iscsiLunWhereInput.bps) &&
        Objects.equals(this.bpsGt, iscsiLunWhereInput.bpsGt) &&
        Objects.equals(this.bpsGte, iscsiLunWhereInput.bpsGte) &&
        Objects.equals(this.bpsIn, iscsiLunWhereInput.bpsIn) &&
        Objects.equals(this.bpsLt, iscsiLunWhereInput.bpsLt) &&
        Objects.equals(this.bpsLte, iscsiLunWhereInput.bpsLte) &&
        Objects.equals(this.bpsMax, iscsiLunWhereInput.bpsMax) &&
        Objects.equals(this.bpsMaxGt, iscsiLunWhereInput.bpsMaxGt) &&
        Objects.equals(this.bpsMaxGte, iscsiLunWhereInput.bpsMaxGte) &&
        Objects.equals(this.bpsMaxIn, iscsiLunWhereInput.bpsMaxIn) &&
        Objects.equals(this.bpsMaxLength, iscsiLunWhereInput.bpsMaxLength) &&
        Objects.equals(this.bpsMaxLengthGt, iscsiLunWhereInput.bpsMaxLengthGt) &&
        Objects.equals(this.bpsMaxLengthGte, iscsiLunWhereInput.bpsMaxLengthGte) &&
        Objects.equals(this.bpsMaxLengthIn, iscsiLunWhereInput.bpsMaxLengthIn) &&
        Objects.equals(this.bpsMaxLengthLt, iscsiLunWhereInput.bpsMaxLengthLt) &&
        Objects.equals(this.bpsMaxLengthLte, iscsiLunWhereInput.bpsMaxLengthLte) &&
        Objects.equals(this.bpsMaxLengthNot, iscsiLunWhereInput.bpsMaxLengthNot) &&
        Objects.equals(this.bpsMaxLengthNotIn, iscsiLunWhereInput.bpsMaxLengthNotIn) &&
        Objects.equals(this.bpsMaxLt, iscsiLunWhereInput.bpsMaxLt) &&
        Objects.equals(this.bpsMaxLte, iscsiLunWhereInput.bpsMaxLte) &&
        Objects.equals(this.bpsMaxNot, iscsiLunWhereInput.bpsMaxNot) &&
        Objects.equals(this.bpsMaxNotIn, iscsiLunWhereInput.bpsMaxNotIn) &&
        Objects.equals(this.bpsNot, iscsiLunWhereInput.bpsNot) &&
        Objects.equals(this.bpsNotIn, iscsiLunWhereInput.bpsNotIn) &&
        Objects.equals(this.bpsRd, iscsiLunWhereInput.bpsRd) &&
        Objects.equals(this.bpsRdGt, iscsiLunWhereInput.bpsRdGt) &&
        Objects.equals(this.bpsRdGte, iscsiLunWhereInput.bpsRdGte) &&
        Objects.equals(this.bpsRdIn, iscsiLunWhereInput.bpsRdIn) &&
        Objects.equals(this.bpsRdLt, iscsiLunWhereInput.bpsRdLt) &&
        Objects.equals(this.bpsRdLte, iscsiLunWhereInput.bpsRdLte) &&
        Objects.equals(this.bpsRdMax, iscsiLunWhereInput.bpsRdMax) &&
        Objects.equals(this.bpsRdMaxGt, iscsiLunWhereInput.bpsRdMaxGt) &&
        Objects.equals(this.bpsRdMaxGte, iscsiLunWhereInput.bpsRdMaxGte) &&
        Objects.equals(this.bpsRdMaxIn, iscsiLunWhereInput.bpsRdMaxIn) &&
        Objects.equals(this.bpsRdMaxLength, iscsiLunWhereInput.bpsRdMaxLength) &&
        Objects.equals(this.bpsRdMaxLengthGt, iscsiLunWhereInput.bpsRdMaxLengthGt) &&
        Objects.equals(this.bpsRdMaxLengthGte, iscsiLunWhereInput.bpsRdMaxLengthGte) &&
        Objects.equals(this.bpsRdMaxLengthIn, iscsiLunWhereInput.bpsRdMaxLengthIn) &&
        Objects.equals(this.bpsRdMaxLengthLt, iscsiLunWhereInput.bpsRdMaxLengthLt) &&
        Objects.equals(this.bpsRdMaxLengthLte, iscsiLunWhereInput.bpsRdMaxLengthLte) &&
        Objects.equals(this.bpsRdMaxLengthNot, iscsiLunWhereInput.bpsRdMaxLengthNot) &&
        Objects.equals(this.bpsRdMaxLengthNotIn, iscsiLunWhereInput.bpsRdMaxLengthNotIn) &&
        Objects.equals(this.bpsRdMaxLt, iscsiLunWhereInput.bpsRdMaxLt) &&
        Objects.equals(this.bpsRdMaxLte, iscsiLunWhereInput.bpsRdMaxLte) &&
        Objects.equals(this.bpsRdMaxNot, iscsiLunWhereInput.bpsRdMaxNot) &&
        Objects.equals(this.bpsRdMaxNotIn, iscsiLunWhereInput.bpsRdMaxNotIn) &&
        Objects.equals(this.bpsRdNot, iscsiLunWhereInput.bpsRdNot) &&
        Objects.equals(this.bpsRdNotIn, iscsiLunWhereInput.bpsRdNotIn) &&
        Objects.equals(this.bpsWr, iscsiLunWhereInput.bpsWr) &&
        Objects.equals(this.bpsWrGt, iscsiLunWhereInput.bpsWrGt) &&
        Objects.equals(this.bpsWrGte, iscsiLunWhereInput.bpsWrGte) &&
        Objects.equals(this.bpsWrIn, iscsiLunWhereInput.bpsWrIn) &&
        Objects.equals(this.bpsWrLt, iscsiLunWhereInput.bpsWrLt) &&
        Objects.equals(this.bpsWrLte, iscsiLunWhereInput.bpsWrLte) &&
        Objects.equals(this.bpsWrMax, iscsiLunWhereInput.bpsWrMax) &&
        Objects.equals(this.bpsWrMaxGt, iscsiLunWhereInput.bpsWrMaxGt) &&
        Objects.equals(this.bpsWrMaxGte, iscsiLunWhereInput.bpsWrMaxGte) &&
        Objects.equals(this.bpsWrMaxIn, iscsiLunWhereInput.bpsWrMaxIn) &&
        Objects.equals(this.bpsWrMaxLength, iscsiLunWhereInput.bpsWrMaxLength) &&
        Objects.equals(this.bpsWrMaxLengthGt, iscsiLunWhereInput.bpsWrMaxLengthGt) &&
        Objects.equals(this.bpsWrMaxLengthGte, iscsiLunWhereInput.bpsWrMaxLengthGte) &&
        Objects.equals(this.bpsWrMaxLengthIn, iscsiLunWhereInput.bpsWrMaxLengthIn) &&
        Objects.equals(this.bpsWrMaxLengthLt, iscsiLunWhereInput.bpsWrMaxLengthLt) &&
        Objects.equals(this.bpsWrMaxLengthLte, iscsiLunWhereInput.bpsWrMaxLengthLte) &&
        Objects.equals(this.bpsWrMaxLengthNot, iscsiLunWhereInput.bpsWrMaxLengthNot) &&
        Objects.equals(this.bpsWrMaxLengthNotIn, iscsiLunWhereInput.bpsWrMaxLengthNotIn) &&
        Objects.equals(this.bpsWrMaxLt, iscsiLunWhereInput.bpsWrMaxLt) &&
        Objects.equals(this.bpsWrMaxLte, iscsiLunWhereInput.bpsWrMaxLte) &&
        Objects.equals(this.bpsWrMaxNot, iscsiLunWhereInput.bpsWrMaxNot) &&
        Objects.equals(this.bpsWrMaxNotIn, iscsiLunWhereInput.bpsWrMaxNotIn) &&
        Objects.equals(this.bpsWrNot, iscsiLunWhereInput.bpsWrNot) &&
        Objects.equals(this.bpsWrNotIn, iscsiLunWhereInput.bpsWrNotIn) &&
        Objects.equals(this.entityAsyncStatus, iscsiLunWhereInput.entityAsyncStatus) &&
        Objects.equals(this.entityAsyncStatusIn, iscsiLunWhereInput.entityAsyncStatusIn) &&
        Objects.equals(this.entityAsyncStatusNot, iscsiLunWhereInput.entityAsyncStatusNot) &&
        Objects.equals(this.entityAsyncStatusNotIn, iscsiLunWhereInput.entityAsyncStatusNotIn) &&
        Objects.equals(this.id, iscsiLunWhereInput.id) &&
        Objects.equals(this.idContains, iscsiLunWhereInput.idContains) &&
        Objects.equals(this.idEndsWith, iscsiLunWhereInput.idEndsWith) &&
        Objects.equals(this.idGt, iscsiLunWhereInput.idGt) &&
        Objects.equals(this.idGte, iscsiLunWhereInput.idGte) &&
        Objects.equals(this.idIn, iscsiLunWhereInput.idIn) &&
        Objects.equals(this.idLt, iscsiLunWhereInput.idLt) &&
        Objects.equals(this.idLte, iscsiLunWhereInput.idLte) &&
        Objects.equals(this.idNot, iscsiLunWhereInput.idNot) &&
        Objects.equals(this.idNotContains, iscsiLunWhereInput.idNotContains) &&
        Objects.equals(this.idNotEndsWith, iscsiLunWhereInput.idNotEndsWith) &&
        Objects.equals(this.idNotIn, iscsiLunWhereInput.idNotIn) &&
        Objects.equals(this.idNotStartsWith, iscsiLunWhereInput.idNotStartsWith) &&
        Objects.equals(this.idStartsWith, iscsiLunWhereInput.idStartsWith) &&
        Objects.equals(this.ioSize, iscsiLunWhereInput.ioSize) &&
        Objects.equals(this.ioSizeGt, iscsiLunWhereInput.ioSizeGt) &&
        Objects.equals(this.ioSizeGte, iscsiLunWhereInput.ioSizeGte) &&
        Objects.equals(this.ioSizeIn, iscsiLunWhereInput.ioSizeIn) &&
        Objects.equals(this.ioSizeLt, iscsiLunWhereInput.ioSizeLt) &&
        Objects.equals(this.ioSizeLte, iscsiLunWhereInput.ioSizeLte) &&
        Objects.equals(this.ioSizeNot, iscsiLunWhereInput.ioSizeNot) &&
        Objects.equals(this.ioSizeNotIn, iscsiLunWhereInput.ioSizeNotIn) &&
        Objects.equals(this.iops, iscsiLunWhereInput.iops) &&
        Objects.equals(this.iopsGt, iscsiLunWhereInput.iopsGt) &&
        Objects.equals(this.iopsGte, iscsiLunWhereInput.iopsGte) &&
        Objects.equals(this.iopsIn, iscsiLunWhereInput.iopsIn) &&
        Objects.equals(this.iopsLt, iscsiLunWhereInput.iopsLt) &&
        Objects.equals(this.iopsLte, iscsiLunWhereInput.iopsLte) &&
        Objects.equals(this.iopsMax, iscsiLunWhereInput.iopsMax) &&
        Objects.equals(this.iopsMaxGt, iscsiLunWhereInput.iopsMaxGt) &&
        Objects.equals(this.iopsMaxGte, iscsiLunWhereInput.iopsMaxGte) &&
        Objects.equals(this.iopsMaxIn, iscsiLunWhereInput.iopsMaxIn) &&
        Objects.equals(this.iopsMaxLength, iscsiLunWhereInput.iopsMaxLength) &&
        Objects.equals(this.iopsMaxLengthGt, iscsiLunWhereInput.iopsMaxLengthGt) &&
        Objects.equals(this.iopsMaxLengthGte, iscsiLunWhereInput.iopsMaxLengthGte) &&
        Objects.equals(this.iopsMaxLengthIn, iscsiLunWhereInput.iopsMaxLengthIn) &&
        Objects.equals(this.iopsMaxLengthLt, iscsiLunWhereInput.iopsMaxLengthLt) &&
        Objects.equals(this.iopsMaxLengthLte, iscsiLunWhereInput.iopsMaxLengthLte) &&
        Objects.equals(this.iopsMaxLengthNot, iscsiLunWhereInput.iopsMaxLengthNot) &&
        Objects.equals(this.iopsMaxLengthNotIn, iscsiLunWhereInput.iopsMaxLengthNotIn) &&
        Objects.equals(this.iopsMaxLt, iscsiLunWhereInput.iopsMaxLt) &&
        Objects.equals(this.iopsMaxLte, iscsiLunWhereInput.iopsMaxLte) &&
        Objects.equals(this.iopsMaxNot, iscsiLunWhereInput.iopsMaxNot) &&
        Objects.equals(this.iopsMaxNotIn, iscsiLunWhereInput.iopsMaxNotIn) &&
        Objects.equals(this.iopsNot, iscsiLunWhereInput.iopsNot) &&
        Objects.equals(this.iopsNotIn, iscsiLunWhereInput.iopsNotIn) &&
        Objects.equals(this.iopsRd, iscsiLunWhereInput.iopsRd) &&
        Objects.equals(this.iopsRdGt, iscsiLunWhereInput.iopsRdGt) &&
        Objects.equals(this.iopsRdGte, iscsiLunWhereInput.iopsRdGte) &&
        Objects.equals(this.iopsRdIn, iscsiLunWhereInput.iopsRdIn) &&
        Objects.equals(this.iopsRdLt, iscsiLunWhereInput.iopsRdLt) &&
        Objects.equals(this.iopsRdLte, iscsiLunWhereInput.iopsRdLte) &&
        Objects.equals(this.iopsRdMax, iscsiLunWhereInput.iopsRdMax) &&
        Objects.equals(this.iopsRdMaxGt, iscsiLunWhereInput.iopsRdMaxGt) &&
        Objects.equals(this.iopsRdMaxGte, iscsiLunWhereInput.iopsRdMaxGte) &&
        Objects.equals(this.iopsRdMaxIn, iscsiLunWhereInput.iopsRdMaxIn) &&
        Objects.equals(this.iopsRdMaxLength, iscsiLunWhereInput.iopsRdMaxLength) &&
        Objects.equals(this.iopsRdMaxLengthGt, iscsiLunWhereInput.iopsRdMaxLengthGt) &&
        Objects.equals(this.iopsRdMaxLengthGte, iscsiLunWhereInput.iopsRdMaxLengthGte) &&
        Objects.equals(this.iopsRdMaxLengthIn, iscsiLunWhereInput.iopsRdMaxLengthIn) &&
        Objects.equals(this.iopsRdMaxLengthLt, iscsiLunWhereInput.iopsRdMaxLengthLt) &&
        Objects.equals(this.iopsRdMaxLengthLte, iscsiLunWhereInput.iopsRdMaxLengthLte) &&
        Objects.equals(this.iopsRdMaxLengthNot, iscsiLunWhereInput.iopsRdMaxLengthNot) &&
        Objects.equals(this.iopsRdMaxLengthNotIn, iscsiLunWhereInput.iopsRdMaxLengthNotIn) &&
        Objects.equals(this.iopsRdMaxLt, iscsiLunWhereInput.iopsRdMaxLt) &&
        Objects.equals(this.iopsRdMaxLte, iscsiLunWhereInput.iopsRdMaxLte) &&
        Objects.equals(this.iopsRdMaxNot, iscsiLunWhereInput.iopsRdMaxNot) &&
        Objects.equals(this.iopsRdMaxNotIn, iscsiLunWhereInput.iopsRdMaxNotIn) &&
        Objects.equals(this.iopsRdNot, iscsiLunWhereInput.iopsRdNot) &&
        Objects.equals(this.iopsRdNotIn, iscsiLunWhereInput.iopsRdNotIn) &&
        Objects.equals(this.iopsWr, iscsiLunWhereInput.iopsWr) &&
        Objects.equals(this.iopsWrGt, iscsiLunWhereInput.iopsWrGt) &&
        Objects.equals(this.iopsWrGte, iscsiLunWhereInput.iopsWrGte) &&
        Objects.equals(this.iopsWrIn, iscsiLunWhereInput.iopsWrIn) &&
        Objects.equals(this.iopsWrLt, iscsiLunWhereInput.iopsWrLt) &&
        Objects.equals(this.iopsWrLte, iscsiLunWhereInput.iopsWrLte) &&
        Objects.equals(this.iopsWrMax, iscsiLunWhereInput.iopsWrMax) &&
        Objects.equals(this.iopsWrMaxGt, iscsiLunWhereInput.iopsWrMaxGt) &&
        Objects.equals(this.iopsWrMaxGte, iscsiLunWhereInput.iopsWrMaxGte) &&
        Objects.equals(this.iopsWrMaxIn, iscsiLunWhereInput.iopsWrMaxIn) &&
        Objects.equals(this.iopsWrMaxLength, iscsiLunWhereInput.iopsWrMaxLength) &&
        Objects.equals(this.iopsWrMaxLengthGt, iscsiLunWhereInput.iopsWrMaxLengthGt) &&
        Objects.equals(this.iopsWrMaxLengthGte, iscsiLunWhereInput.iopsWrMaxLengthGte) &&
        Objects.equals(this.iopsWrMaxLengthIn, iscsiLunWhereInput.iopsWrMaxLengthIn) &&
        Objects.equals(this.iopsWrMaxLengthLt, iscsiLunWhereInput.iopsWrMaxLengthLt) &&
        Objects.equals(this.iopsWrMaxLengthLte, iscsiLunWhereInput.iopsWrMaxLengthLte) &&
        Objects.equals(this.iopsWrMaxLengthNot, iscsiLunWhereInput.iopsWrMaxLengthNot) &&
        Objects.equals(this.iopsWrMaxLengthNotIn, iscsiLunWhereInput.iopsWrMaxLengthNotIn) &&
        Objects.equals(this.iopsWrMaxLt, iscsiLunWhereInput.iopsWrMaxLt) &&
        Objects.equals(this.iopsWrMaxLte, iscsiLunWhereInput.iopsWrMaxLte) &&
        Objects.equals(this.iopsWrMaxNot, iscsiLunWhereInput.iopsWrMaxNot) &&
        Objects.equals(this.iopsWrMaxNotIn, iscsiLunWhereInput.iopsWrMaxNotIn) &&
        Objects.equals(this.iopsWrNot, iscsiLunWhereInput.iopsWrNot) &&
        Objects.equals(this.iopsWrNotIn, iscsiLunWhereInput.iopsWrNotIn) &&
        Objects.equals(this.iscsiTarget, iscsiLunWhereInput.iscsiTarget) &&
        Objects.equals(this.labelsEvery, iscsiLunWhereInput.labelsEvery) &&
        Objects.equals(this.labelsNone, iscsiLunWhereInput.labelsNone) &&
        Objects.equals(this.labelsSome, iscsiLunWhereInput.labelsSome) &&
        Objects.equals(this.localCreatedAt, iscsiLunWhereInput.localCreatedAt) &&
        Objects.equals(this.localCreatedAtGt, iscsiLunWhereInput.localCreatedAtGt) &&
        Objects.equals(this.localCreatedAtGte, iscsiLunWhereInput.localCreatedAtGte) &&
        Objects.equals(this.localCreatedAtIn, iscsiLunWhereInput.localCreatedAtIn) &&
        Objects.equals(this.localCreatedAtLt, iscsiLunWhereInput.localCreatedAtLt) &&
        Objects.equals(this.localCreatedAtLte, iscsiLunWhereInput.localCreatedAtLte) &&
        Objects.equals(this.localCreatedAtNot, iscsiLunWhereInput.localCreatedAtNot) &&
        Objects.equals(this.localCreatedAtNotIn, iscsiLunWhereInput.localCreatedAtNotIn) &&
        Objects.equals(this.localId, iscsiLunWhereInput.localId) &&
        Objects.equals(this.localIdContains, iscsiLunWhereInput.localIdContains) &&
        Objects.equals(this.localIdEndsWith, iscsiLunWhereInput.localIdEndsWith) &&
        Objects.equals(this.localIdGt, iscsiLunWhereInput.localIdGt) &&
        Objects.equals(this.localIdGte, iscsiLunWhereInput.localIdGte) &&
        Objects.equals(this.localIdIn, iscsiLunWhereInput.localIdIn) &&
        Objects.equals(this.localIdLt, iscsiLunWhereInput.localIdLt) &&
        Objects.equals(this.localIdLte, iscsiLunWhereInput.localIdLte) &&
        Objects.equals(this.localIdNot, iscsiLunWhereInput.localIdNot) &&
        Objects.equals(this.localIdNotContains, iscsiLunWhereInput.localIdNotContains) &&
        Objects.equals(this.localIdNotEndsWith, iscsiLunWhereInput.localIdNotEndsWith) &&
        Objects.equals(this.localIdNotIn, iscsiLunWhereInput.localIdNotIn) &&
        Objects.equals(this.localIdNotStartsWith, iscsiLunWhereInput.localIdNotStartsWith) &&
        Objects.equals(this.localIdStartsWith, iscsiLunWhereInput.localIdStartsWith) &&
        Objects.equals(this.lunId, iscsiLunWhereInput.lunId) &&
        Objects.equals(this.lunIdGt, iscsiLunWhereInput.lunIdGt) &&
        Objects.equals(this.lunIdGte, iscsiLunWhereInput.lunIdGte) &&
        Objects.equals(this.lunIdIn, iscsiLunWhereInput.lunIdIn) &&
        Objects.equals(this.lunIdLt, iscsiLunWhereInput.lunIdLt) &&
        Objects.equals(this.lunIdLte, iscsiLunWhereInput.lunIdLte) &&
        Objects.equals(this.lunIdNot, iscsiLunWhereInput.lunIdNot) &&
        Objects.equals(this.lunIdNotIn, iscsiLunWhereInput.lunIdNotIn) &&
        Objects.equals(this.name, iscsiLunWhereInput.name) &&
        Objects.equals(this.nameContains, iscsiLunWhereInput.nameContains) &&
        Objects.equals(this.nameEndsWith, iscsiLunWhereInput.nameEndsWith) &&
        Objects.equals(this.nameGt, iscsiLunWhereInput.nameGt) &&
        Objects.equals(this.nameGte, iscsiLunWhereInput.nameGte) &&
        Objects.equals(this.nameIn, iscsiLunWhereInput.nameIn) &&
        Objects.equals(this.nameLt, iscsiLunWhereInput.nameLt) &&
        Objects.equals(this.nameLte, iscsiLunWhereInput.nameLte) &&
        Objects.equals(this.nameNot, iscsiLunWhereInput.nameNot) &&
        Objects.equals(this.nameNotContains, iscsiLunWhereInput.nameNotContains) &&
        Objects.equals(this.nameNotEndsWith, iscsiLunWhereInput.nameNotEndsWith) &&
        Objects.equals(this.nameNotIn, iscsiLunWhereInput.nameNotIn) &&
        Objects.equals(this.nameNotStartsWith, iscsiLunWhereInput.nameNotStartsWith) &&
        Objects.equals(this.nameStartsWith, iscsiLunWhereInput.nameStartsWith) &&
        Objects.equals(this.replicaNum, iscsiLunWhereInput.replicaNum) &&
        Objects.equals(this.replicaNumGt, iscsiLunWhereInput.replicaNumGt) &&
        Objects.equals(this.replicaNumGte, iscsiLunWhereInput.replicaNumGte) &&
        Objects.equals(this.replicaNumIn, iscsiLunWhereInput.replicaNumIn) &&
        Objects.equals(this.replicaNumLt, iscsiLunWhereInput.replicaNumLt) &&
        Objects.equals(this.replicaNumLte, iscsiLunWhereInput.replicaNumLte) &&
        Objects.equals(this.replicaNumNot, iscsiLunWhereInput.replicaNumNot) &&
        Objects.equals(this.replicaNumNotIn, iscsiLunWhereInput.replicaNumNotIn) &&
        Objects.equals(this.sharedSize, iscsiLunWhereInput.sharedSize) &&
        Objects.equals(this.sharedSizeGt, iscsiLunWhereInput.sharedSizeGt) &&
        Objects.equals(this.sharedSizeGte, iscsiLunWhereInput.sharedSizeGte) &&
        Objects.equals(this.sharedSizeIn, iscsiLunWhereInput.sharedSizeIn) &&
        Objects.equals(this.sharedSizeLt, iscsiLunWhereInput.sharedSizeLt) &&
        Objects.equals(this.sharedSizeLte, iscsiLunWhereInput.sharedSizeLte) &&
        Objects.equals(this.sharedSizeNot, iscsiLunWhereInput.sharedSizeNot) &&
        Objects.equals(this.sharedSizeNotIn, iscsiLunWhereInput.sharedSizeNotIn) &&
        Objects.equals(this.snapshotNum, iscsiLunWhereInput.snapshotNum) &&
        Objects.equals(this.snapshotNumGt, iscsiLunWhereInput.snapshotNumGt) &&
        Objects.equals(this.snapshotNumGte, iscsiLunWhereInput.snapshotNumGte) &&
        Objects.equals(this.snapshotNumIn, iscsiLunWhereInput.snapshotNumIn) &&
        Objects.equals(this.snapshotNumLt, iscsiLunWhereInput.snapshotNumLt) &&
        Objects.equals(this.snapshotNumLte, iscsiLunWhereInput.snapshotNumLte) &&
        Objects.equals(this.snapshotNumNot, iscsiLunWhereInput.snapshotNumNot) &&
        Objects.equals(this.snapshotNumNotIn, iscsiLunWhereInput.snapshotNumNotIn) &&
        Objects.equals(this.stripeNum, iscsiLunWhereInput.stripeNum) &&
        Objects.equals(this.stripeNumGt, iscsiLunWhereInput.stripeNumGt) &&
        Objects.equals(this.stripeNumGte, iscsiLunWhereInput.stripeNumGte) &&
        Objects.equals(this.stripeNumIn, iscsiLunWhereInput.stripeNumIn) &&
        Objects.equals(this.stripeNumLt, iscsiLunWhereInput.stripeNumLt) &&
        Objects.equals(this.stripeNumLte, iscsiLunWhereInput.stripeNumLte) &&
        Objects.equals(this.stripeNumNot, iscsiLunWhereInput.stripeNumNot) &&
        Objects.equals(this.stripeNumNotIn, iscsiLunWhereInput.stripeNumNotIn) &&
        Objects.equals(this.stripeSize, iscsiLunWhereInput.stripeSize) &&
        Objects.equals(this.stripeSizeGt, iscsiLunWhereInput.stripeSizeGt) &&
        Objects.equals(this.stripeSizeGte, iscsiLunWhereInput.stripeSizeGte) &&
        Objects.equals(this.stripeSizeIn, iscsiLunWhereInput.stripeSizeIn) &&
        Objects.equals(this.stripeSizeLt, iscsiLunWhereInput.stripeSizeLt) &&
        Objects.equals(this.stripeSizeLte, iscsiLunWhereInput.stripeSizeLte) &&
        Objects.equals(this.stripeSizeNot, iscsiLunWhereInput.stripeSizeNot) &&
        Objects.equals(this.stripeSizeNotIn, iscsiLunWhereInput.stripeSizeNotIn) &&
        Objects.equals(this.thinProvision, iscsiLunWhereInput.thinProvision) &&
        Objects.equals(this.thinProvisionNot, iscsiLunWhereInput.thinProvisionNot) &&
        Objects.equals(this.uniqueLogicalSize, iscsiLunWhereInput.uniqueLogicalSize) &&
        Objects.equals(this.uniqueLogicalSizeGt, iscsiLunWhereInput.uniqueLogicalSizeGt) &&
        Objects.equals(this.uniqueLogicalSizeGte, iscsiLunWhereInput.uniqueLogicalSizeGte) &&
        Objects.equals(this.uniqueLogicalSizeIn, iscsiLunWhereInput.uniqueLogicalSizeIn) &&
        Objects.equals(this.uniqueLogicalSizeLt, iscsiLunWhereInput.uniqueLogicalSizeLt) &&
        Objects.equals(this.uniqueLogicalSizeLte, iscsiLunWhereInput.uniqueLogicalSizeLte) &&
        Objects.equals(this.uniqueLogicalSizeNot, iscsiLunWhereInput.uniqueLogicalSizeNot) &&
        Objects.equals(this.uniqueLogicalSizeNotIn, iscsiLunWhereInput.uniqueLogicalSizeNotIn) &&
        Objects.equals(this.uniqueSize, iscsiLunWhereInput.uniqueSize) &&
        Objects.equals(this.uniqueSizeGt, iscsiLunWhereInput.uniqueSizeGt) &&
        Objects.equals(this.uniqueSizeGte, iscsiLunWhereInput.uniqueSizeGte) &&
        Objects.equals(this.uniqueSizeIn, iscsiLunWhereInput.uniqueSizeIn) &&
        Objects.equals(this.uniqueSizeLt, iscsiLunWhereInput.uniqueSizeLt) &&
        Objects.equals(this.uniqueSizeLte, iscsiLunWhereInput.uniqueSizeLte) &&
        Objects.equals(this.uniqueSizeNot, iscsiLunWhereInput.uniqueSizeNot) &&
        Objects.equals(this.uniqueSizeNotIn, iscsiLunWhereInput.uniqueSizeNotIn) &&
        Objects.equals(this.zbsVolumeId, iscsiLunWhereInput.zbsVolumeId) &&
        Objects.equals(this.zbsVolumeIdContains, iscsiLunWhereInput.zbsVolumeIdContains) &&
        Objects.equals(this.zbsVolumeIdEndsWith, iscsiLunWhereInput.zbsVolumeIdEndsWith) &&
        Objects.equals(this.zbsVolumeIdGt, iscsiLunWhereInput.zbsVolumeIdGt) &&
        Objects.equals(this.zbsVolumeIdGte, iscsiLunWhereInput.zbsVolumeIdGte) &&
        Objects.equals(this.zbsVolumeIdIn, iscsiLunWhereInput.zbsVolumeIdIn) &&
        Objects.equals(this.zbsVolumeIdLt, iscsiLunWhereInput.zbsVolumeIdLt) &&
        Objects.equals(this.zbsVolumeIdLte, iscsiLunWhereInput.zbsVolumeIdLte) &&
        Objects.equals(this.zbsVolumeIdNot, iscsiLunWhereInput.zbsVolumeIdNot) &&
        Objects.equals(this.zbsVolumeIdNotContains, iscsiLunWhereInput.zbsVolumeIdNotContains) &&
        Objects.equals(this.zbsVolumeIdNotEndsWith, iscsiLunWhereInput.zbsVolumeIdNotEndsWith) &&
        Objects.equals(this.zbsVolumeIdNotIn, iscsiLunWhereInput.zbsVolumeIdNotIn) &&
        Objects.equals(this.zbsVolumeIdNotStartsWith, iscsiLunWhereInput.zbsVolumeIdNotStartsWith) &&
        Objects.equals(this.zbsVolumeIdStartsWith, iscsiLunWhereInput.zbsVolumeIdStartsWith);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(AND, NOT, OR, allowedInitiators, allowedInitiatorsContains, allowedInitiatorsEndsWith, allowedInitiatorsGt, allowedInitiatorsGte, allowedInitiatorsIn, allowedInitiatorsLt, allowedInitiatorsLte, allowedInitiatorsNot, allowedInitiatorsNotContains, allowedInitiatorsNotEndsWith, allowedInitiatorsNotIn, allowedInitiatorsNotStartsWith, allowedInitiatorsStartsWith, assignedSize, assignedSizeGt, assignedSizeGte, assignedSizeIn, assignedSizeLt, assignedSizeLte, assignedSizeNot, assignedSizeNotIn, bps, bpsGt, bpsGte, bpsIn, bpsLt, bpsLte, bpsMax, bpsMaxGt, bpsMaxGte, bpsMaxIn, bpsMaxLength, bpsMaxLengthGt, bpsMaxLengthGte, bpsMaxLengthIn, bpsMaxLengthLt, bpsMaxLengthLte, bpsMaxLengthNot, bpsMaxLengthNotIn, bpsMaxLt, bpsMaxLte, bpsMaxNot, bpsMaxNotIn, bpsNot, bpsNotIn, bpsRd, bpsRdGt, bpsRdGte, bpsRdIn, bpsRdLt, bpsRdLte, bpsRdMax, bpsRdMaxGt, bpsRdMaxGte, bpsRdMaxIn, bpsRdMaxLength, bpsRdMaxLengthGt, bpsRdMaxLengthGte, bpsRdMaxLengthIn, bpsRdMaxLengthLt, bpsRdMaxLengthLte, bpsRdMaxLengthNot, bpsRdMaxLengthNotIn, bpsRdMaxLt, bpsRdMaxLte, bpsRdMaxNot, bpsRdMaxNotIn, bpsRdNot, bpsRdNotIn, bpsWr, bpsWrGt, bpsWrGte, bpsWrIn, bpsWrLt, bpsWrLte, bpsWrMax, bpsWrMaxGt, bpsWrMaxGte, bpsWrMaxIn, bpsWrMaxLength, bpsWrMaxLengthGt, bpsWrMaxLengthGte, bpsWrMaxLengthIn, bpsWrMaxLengthLt, bpsWrMaxLengthLte, bpsWrMaxLengthNot, bpsWrMaxLengthNotIn, bpsWrMaxLt, bpsWrMaxLte, bpsWrMaxNot, bpsWrMaxNotIn, bpsWrNot, bpsWrNotIn, entityAsyncStatus, entityAsyncStatusIn, entityAsyncStatusNot, entityAsyncStatusNotIn, id, idContains, idEndsWith, idGt, idGte, idIn, idLt, idLte, idNot, idNotContains, idNotEndsWith, idNotIn, idNotStartsWith, idStartsWith, ioSize, ioSizeGt, ioSizeGte, ioSizeIn, ioSizeLt, ioSizeLte, ioSizeNot, ioSizeNotIn, iops, iopsGt, iopsGte, iopsIn, iopsLt, iopsLte, iopsMax, iopsMaxGt, iopsMaxGte, iopsMaxIn, iopsMaxLength, iopsMaxLengthGt, iopsMaxLengthGte, iopsMaxLengthIn, iopsMaxLengthLt, iopsMaxLengthLte, iopsMaxLengthNot, iopsMaxLengthNotIn, iopsMaxLt, iopsMaxLte, iopsMaxNot, iopsMaxNotIn, iopsNot, iopsNotIn, iopsRd, iopsRdGt, iopsRdGte, iopsRdIn, iopsRdLt, iopsRdLte, iopsRdMax, iopsRdMaxGt, iopsRdMaxGte, iopsRdMaxIn, iopsRdMaxLength, iopsRdMaxLengthGt, iopsRdMaxLengthGte, iopsRdMaxLengthIn, iopsRdMaxLengthLt, iopsRdMaxLengthLte, iopsRdMaxLengthNot, iopsRdMaxLengthNotIn, iopsRdMaxLt, iopsRdMaxLte, iopsRdMaxNot, iopsRdMaxNotIn, iopsRdNot, iopsRdNotIn, iopsWr, iopsWrGt, iopsWrGte, iopsWrIn, iopsWrLt, iopsWrLte, iopsWrMax, iopsWrMaxGt, iopsWrMaxGte, iopsWrMaxIn, iopsWrMaxLength, iopsWrMaxLengthGt, iopsWrMaxLengthGte, iopsWrMaxLengthIn, iopsWrMaxLengthLt, iopsWrMaxLengthLte, iopsWrMaxLengthNot, iopsWrMaxLengthNotIn, iopsWrMaxLt, iopsWrMaxLte, iopsWrMaxNot, iopsWrMaxNotIn, iopsWrNot, iopsWrNotIn, iscsiTarget, labelsEvery, labelsNone, labelsSome, localCreatedAt, localCreatedAtGt, localCreatedAtGte, localCreatedAtIn, localCreatedAtLt, localCreatedAtLte, localCreatedAtNot, localCreatedAtNotIn, localId, localIdContains, localIdEndsWith, localIdGt, localIdGte, localIdIn, localIdLt, localIdLte, localIdNot, localIdNotContains, localIdNotEndsWith, localIdNotIn, localIdNotStartsWith, localIdStartsWith, lunId, lunIdGt, lunIdGte, lunIdIn, lunIdLt, lunIdLte, lunIdNot, lunIdNotIn, name, nameContains, nameEndsWith, nameGt, nameGte, nameIn, nameLt, nameLte, nameNot, nameNotContains, nameNotEndsWith, nameNotIn, nameNotStartsWith, nameStartsWith, replicaNum, replicaNumGt, replicaNumGte, replicaNumIn, replicaNumLt, replicaNumLte, replicaNumNot, replicaNumNotIn, sharedSize, sharedSizeGt, sharedSizeGte, sharedSizeIn, sharedSizeLt, sharedSizeLte, sharedSizeNot, sharedSizeNotIn, snapshotNum, snapshotNumGt, snapshotNumGte, snapshotNumIn, snapshotNumLt, snapshotNumLte, snapshotNumNot, snapshotNumNotIn, stripeNum, stripeNumGt, stripeNumGte, stripeNumIn, stripeNumLt, stripeNumLte, stripeNumNot, stripeNumNotIn, stripeSize, stripeSizeGt, stripeSizeGte, stripeSizeIn, stripeSizeLt, stripeSizeLte, stripeSizeNot, stripeSizeNotIn, thinProvision, thinProvisionNot, uniqueLogicalSize, uniqueLogicalSizeGt, uniqueLogicalSizeGte, uniqueLogicalSizeIn, uniqueLogicalSizeLt, uniqueLogicalSizeLte, uniqueLogicalSizeNot, uniqueLogicalSizeNotIn, uniqueSize, uniqueSizeGt, uniqueSizeGte, uniqueSizeIn, uniqueSizeLt, uniqueSizeLte, uniqueSizeNot, uniqueSizeNotIn, zbsVolumeId, zbsVolumeIdContains, zbsVolumeIdEndsWith, zbsVolumeIdGt, zbsVolumeIdGte, zbsVolumeIdIn, zbsVolumeIdLt, zbsVolumeIdLte, zbsVolumeIdNot, zbsVolumeIdNotContains, zbsVolumeIdNotEndsWith, zbsVolumeIdNotIn, zbsVolumeIdNotStartsWith, zbsVolumeIdStartsWith);
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
    sb.append("class IscsiLunWhereInput {\n");
    sb.append("    AND: ").append(toIndentedString(AND)).append("\n");
    sb.append("    NOT: ").append(toIndentedString(NOT)).append("\n");
    sb.append("    OR: ").append(toIndentedString(OR)).append("\n");
    sb.append("    allowedInitiators: ").append(toIndentedString(allowedInitiators)).append("\n");
    sb.append("    allowedInitiatorsContains: ").append(toIndentedString(allowedInitiatorsContains)).append("\n");
    sb.append("    allowedInitiatorsEndsWith: ").append(toIndentedString(allowedInitiatorsEndsWith)).append("\n");
    sb.append("    allowedInitiatorsGt: ").append(toIndentedString(allowedInitiatorsGt)).append("\n");
    sb.append("    allowedInitiatorsGte: ").append(toIndentedString(allowedInitiatorsGte)).append("\n");
    sb.append("    allowedInitiatorsIn: ").append(toIndentedString(allowedInitiatorsIn)).append("\n");
    sb.append("    allowedInitiatorsLt: ").append(toIndentedString(allowedInitiatorsLt)).append("\n");
    sb.append("    allowedInitiatorsLte: ").append(toIndentedString(allowedInitiatorsLte)).append("\n");
    sb.append("    allowedInitiatorsNot: ").append(toIndentedString(allowedInitiatorsNot)).append("\n");
    sb.append("    allowedInitiatorsNotContains: ").append(toIndentedString(allowedInitiatorsNotContains)).append("\n");
    sb.append("    allowedInitiatorsNotEndsWith: ").append(toIndentedString(allowedInitiatorsNotEndsWith)).append("\n");
    sb.append("    allowedInitiatorsNotIn: ").append(toIndentedString(allowedInitiatorsNotIn)).append("\n");
    sb.append("    allowedInitiatorsNotStartsWith: ").append(toIndentedString(allowedInitiatorsNotStartsWith)).append("\n");
    sb.append("    allowedInitiatorsStartsWith: ").append(toIndentedString(allowedInitiatorsStartsWith)).append("\n");
    sb.append("    assignedSize: ").append(toIndentedString(assignedSize)).append("\n");
    sb.append("    assignedSizeGt: ").append(toIndentedString(assignedSizeGt)).append("\n");
    sb.append("    assignedSizeGte: ").append(toIndentedString(assignedSizeGte)).append("\n");
    sb.append("    assignedSizeIn: ").append(toIndentedString(assignedSizeIn)).append("\n");
    sb.append("    assignedSizeLt: ").append(toIndentedString(assignedSizeLt)).append("\n");
    sb.append("    assignedSizeLte: ").append(toIndentedString(assignedSizeLte)).append("\n");
    sb.append("    assignedSizeNot: ").append(toIndentedString(assignedSizeNot)).append("\n");
    sb.append("    assignedSizeNotIn: ").append(toIndentedString(assignedSizeNotIn)).append("\n");
    sb.append("    bps: ").append(toIndentedString(bps)).append("\n");
    sb.append("    bpsGt: ").append(toIndentedString(bpsGt)).append("\n");
    sb.append("    bpsGte: ").append(toIndentedString(bpsGte)).append("\n");
    sb.append("    bpsIn: ").append(toIndentedString(bpsIn)).append("\n");
    sb.append("    bpsLt: ").append(toIndentedString(bpsLt)).append("\n");
    sb.append("    bpsLte: ").append(toIndentedString(bpsLte)).append("\n");
    sb.append("    bpsMax: ").append(toIndentedString(bpsMax)).append("\n");
    sb.append("    bpsMaxGt: ").append(toIndentedString(bpsMaxGt)).append("\n");
    sb.append("    bpsMaxGte: ").append(toIndentedString(bpsMaxGte)).append("\n");
    sb.append("    bpsMaxIn: ").append(toIndentedString(bpsMaxIn)).append("\n");
    sb.append("    bpsMaxLength: ").append(toIndentedString(bpsMaxLength)).append("\n");
    sb.append("    bpsMaxLengthGt: ").append(toIndentedString(bpsMaxLengthGt)).append("\n");
    sb.append("    bpsMaxLengthGte: ").append(toIndentedString(bpsMaxLengthGte)).append("\n");
    sb.append("    bpsMaxLengthIn: ").append(toIndentedString(bpsMaxLengthIn)).append("\n");
    sb.append("    bpsMaxLengthLt: ").append(toIndentedString(bpsMaxLengthLt)).append("\n");
    sb.append("    bpsMaxLengthLte: ").append(toIndentedString(bpsMaxLengthLte)).append("\n");
    sb.append("    bpsMaxLengthNot: ").append(toIndentedString(bpsMaxLengthNot)).append("\n");
    sb.append("    bpsMaxLengthNotIn: ").append(toIndentedString(bpsMaxLengthNotIn)).append("\n");
    sb.append("    bpsMaxLt: ").append(toIndentedString(bpsMaxLt)).append("\n");
    sb.append("    bpsMaxLte: ").append(toIndentedString(bpsMaxLte)).append("\n");
    sb.append("    bpsMaxNot: ").append(toIndentedString(bpsMaxNot)).append("\n");
    sb.append("    bpsMaxNotIn: ").append(toIndentedString(bpsMaxNotIn)).append("\n");
    sb.append("    bpsNot: ").append(toIndentedString(bpsNot)).append("\n");
    sb.append("    bpsNotIn: ").append(toIndentedString(bpsNotIn)).append("\n");
    sb.append("    bpsRd: ").append(toIndentedString(bpsRd)).append("\n");
    sb.append("    bpsRdGt: ").append(toIndentedString(bpsRdGt)).append("\n");
    sb.append("    bpsRdGte: ").append(toIndentedString(bpsRdGte)).append("\n");
    sb.append("    bpsRdIn: ").append(toIndentedString(bpsRdIn)).append("\n");
    sb.append("    bpsRdLt: ").append(toIndentedString(bpsRdLt)).append("\n");
    sb.append("    bpsRdLte: ").append(toIndentedString(bpsRdLte)).append("\n");
    sb.append("    bpsRdMax: ").append(toIndentedString(bpsRdMax)).append("\n");
    sb.append("    bpsRdMaxGt: ").append(toIndentedString(bpsRdMaxGt)).append("\n");
    sb.append("    bpsRdMaxGte: ").append(toIndentedString(bpsRdMaxGte)).append("\n");
    sb.append("    bpsRdMaxIn: ").append(toIndentedString(bpsRdMaxIn)).append("\n");
    sb.append("    bpsRdMaxLength: ").append(toIndentedString(bpsRdMaxLength)).append("\n");
    sb.append("    bpsRdMaxLengthGt: ").append(toIndentedString(bpsRdMaxLengthGt)).append("\n");
    sb.append("    bpsRdMaxLengthGte: ").append(toIndentedString(bpsRdMaxLengthGte)).append("\n");
    sb.append("    bpsRdMaxLengthIn: ").append(toIndentedString(bpsRdMaxLengthIn)).append("\n");
    sb.append("    bpsRdMaxLengthLt: ").append(toIndentedString(bpsRdMaxLengthLt)).append("\n");
    sb.append("    bpsRdMaxLengthLte: ").append(toIndentedString(bpsRdMaxLengthLte)).append("\n");
    sb.append("    bpsRdMaxLengthNot: ").append(toIndentedString(bpsRdMaxLengthNot)).append("\n");
    sb.append("    bpsRdMaxLengthNotIn: ").append(toIndentedString(bpsRdMaxLengthNotIn)).append("\n");
    sb.append("    bpsRdMaxLt: ").append(toIndentedString(bpsRdMaxLt)).append("\n");
    sb.append("    bpsRdMaxLte: ").append(toIndentedString(bpsRdMaxLte)).append("\n");
    sb.append("    bpsRdMaxNot: ").append(toIndentedString(bpsRdMaxNot)).append("\n");
    sb.append("    bpsRdMaxNotIn: ").append(toIndentedString(bpsRdMaxNotIn)).append("\n");
    sb.append("    bpsRdNot: ").append(toIndentedString(bpsRdNot)).append("\n");
    sb.append("    bpsRdNotIn: ").append(toIndentedString(bpsRdNotIn)).append("\n");
    sb.append("    bpsWr: ").append(toIndentedString(bpsWr)).append("\n");
    sb.append("    bpsWrGt: ").append(toIndentedString(bpsWrGt)).append("\n");
    sb.append("    bpsWrGte: ").append(toIndentedString(bpsWrGte)).append("\n");
    sb.append("    bpsWrIn: ").append(toIndentedString(bpsWrIn)).append("\n");
    sb.append("    bpsWrLt: ").append(toIndentedString(bpsWrLt)).append("\n");
    sb.append("    bpsWrLte: ").append(toIndentedString(bpsWrLte)).append("\n");
    sb.append("    bpsWrMax: ").append(toIndentedString(bpsWrMax)).append("\n");
    sb.append("    bpsWrMaxGt: ").append(toIndentedString(bpsWrMaxGt)).append("\n");
    sb.append("    bpsWrMaxGte: ").append(toIndentedString(bpsWrMaxGte)).append("\n");
    sb.append("    bpsWrMaxIn: ").append(toIndentedString(bpsWrMaxIn)).append("\n");
    sb.append("    bpsWrMaxLength: ").append(toIndentedString(bpsWrMaxLength)).append("\n");
    sb.append("    bpsWrMaxLengthGt: ").append(toIndentedString(bpsWrMaxLengthGt)).append("\n");
    sb.append("    bpsWrMaxLengthGte: ").append(toIndentedString(bpsWrMaxLengthGte)).append("\n");
    sb.append("    bpsWrMaxLengthIn: ").append(toIndentedString(bpsWrMaxLengthIn)).append("\n");
    sb.append("    bpsWrMaxLengthLt: ").append(toIndentedString(bpsWrMaxLengthLt)).append("\n");
    sb.append("    bpsWrMaxLengthLte: ").append(toIndentedString(bpsWrMaxLengthLte)).append("\n");
    sb.append("    bpsWrMaxLengthNot: ").append(toIndentedString(bpsWrMaxLengthNot)).append("\n");
    sb.append("    bpsWrMaxLengthNotIn: ").append(toIndentedString(bpsWrMaxLengthNotIn)).append("\n");
    sb.append("    bpsWrMaxLt: ").append(toIndentedString(bpsWrMaxLt)).append("\n");
    sb.append("    bpsWrMaxLte: ").append(toIndentedString(bpsWrMaxLte)).append("\n");
    sb.append("    bpsWrMaxNot: ").append(toIndentedString(bpsWrMaxNot)).append("\n");
    sb.append("    bpsWrMaxNotIn: ").append(toIndentedString(bpsWrMaxNotIn)).append("\n");
    sb.append("    bpsWrNot: ").append(toIndentedString(bpsWrNot)).append("\n");
    sb.append("    bpsWrNotIn: ").append(toIndentedString(bpsWrNotIn)).append("\n");
    sb.append("    entityAsyncStatus: ").append(toIndentedString(entityAsyncStatus)).append("\n");
    sb.append("    entityAsyncStatusIn: ").append(toIndentedString(entityAsyncStatusIn)).append("\n");
    sb.append("    entityAsyncStatusNot: ").append(toIndentedString(entityAsyncStatusNot)).append("\n");
    sb.append("    entityAsyncStatusNotIn: ").append(toIndentedString(entityAsyncStatusNotIn)).append("\n");
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
    sb.append("    ioSize: ").append(toIndentedString(ioSize)).append("\n");
    sb.append("    ioSizeGt: ").append(toIndentedString(ioSizeGt)).append("\n");
    sb.append("    ioSizeGte: ").append(toIndentedString(ioSizeGte)).append("\n");
    sb.append("    ioSizeIn: ").append(toIndentedString(ioSizeIn)).append("\n");
    sb.append("    ioSizeLt: ").append(toIndentedString(ioSizeLt)).append("\n");
    sb.append("    ioSizeLte: ").append(toIndentedString(ioSizeLte)).append("\n");
    sb.append("    ioSizeNot: ").append(toIndentedString(ioSizeNot)).append("\n");
    sb.append("    ioSizeNotIn: ").append(toIndentedString(ioSizeNotIn)).append("\n");
    sb.append("    iops: ").append(toIndentedString(iops)).append("\n");
    sb.append("    iopsGt: ").append(toIndentedString(iopsGt)).append("\n");
    sb.append("    iopsGte: ").append(toIndentedString(iopsGte)).append("\n");
    sb.append("    iopsIn: ").append(toIndentedString(iopsIn)).append("\n");
    sb.append("    iopsLt: ").append(toIndentedString(iopsLt)).append("\n");
    sb.append("    iopsLte: ").append(toIndentedString(iopsLte)).append("\n");
    sb.append("    iopsMax: ").append(toIndentedString(iopsMax)).append("\n");
    sb.append("    iopsMaxGt: ").append(toIndentedString(iopsMaxGt)).append("\n");
    sb.append("    iopsMaxGte: ").append(toIndentedString(iopsMaxGte)).append("\n");
    sb.append("    iopsMaxIn: ").append(toIndentedString(iopsMaxIn)).append("\n");
    sb.append("    iopsMaxLength: ").append(toIndentedString(iopsMaxLength)).append("\n");
    sb.append("    iopsMaxLengthGt: ").append(toIndentedString(iopsMaxLengthGt)).append("\n");
    sb.append("    iopsMaxLengthGte: ").append(toIndentedString(iopsMaxLengthGte)).append("\n");
    sb.append("    iopsMaxLengthIn: ").append(toIndentedString(iopsMaxLengthIn)).append("\n");
    sb.append("    iopsMaxLengthLt: ").append(toIndentedString(iopsMaxLengthLt)).append("\n");
    sb.append("    iopsMaxLengthLte: ").append(toIndentedString(iopsMaxLengthLte)).append("\n");
    sb.append("    iopsMaxLengthNot: ").append(toIndentedString(iopsMaxLengthNot)).append("\n");
    sb.append("    iopsMaxLengthNotIn: ").append(toIndentedString(iopsMaxLengthNotIn)).append("\n");
    sb.append("    iopsMaxLt: ").append(toIndentedString(iopsMaxLt)).append("\n");
    sb.append("    iopsMaxLte: ").append(toIndentedString(iopsMaxLte)).append("\n");
    sb.append("    iopsMaxNot: ").append(toIndentedString(iopsMaxNot)).append("\n");
    sb.append("    iopsMaxNotIn: ").append(toIndentedString(iopsMaxNotIn)).append("\n");
    sb.append("    iopsNot: ").append(toIndentedString(iopsNot)).append("\n");
    sb.append("    iopsNotIn: ").append(toIndentedString(iopsNotIn)).append("\n");
    sb.append("    iopsRd: ").append(toIndentedString(iopsRd)).append("\n");
    sb.append("    iopsRdGt: ").append(toIndentedString(iopsRdGt)).append("\n");
    sb.append("    iopsRdGte: ").append(toIndentedString(iopsRdGte)).append("\n");
    sb.append("    iopsRdIn: ").append(toIndentedString(iopsRdIn)).append("\n");
    sb.append("    iopsRdLt: ").append(toIndentedString(iopsRdLt)).append("\n");
    sb.append("    iopsRdLte: ").append(toIndentedString(iopsRdLte)).append("\n");
    sb.append("    iopsRdMax: ").append(toIndentedString(iopsRdMax)).append("\n");
    sb.append("    iopsRdMaxGt: ").append(toIndentedString(iopsRdMaxGt)).append("\n");
    sb.append("    iopsRdMaxGte: ").append(toIndentedString(iopsRdMaxGte)).append("\n");
    sb.append("    iopsRdMaxIn: ").append(toIndentedString(iopsRdMaxIn)).append("\n");
    sb.append("    iopsRdMaxLength: ").append(toIndentedString(iopsRdMaxLength)).append("\n");
    sb.append("    iopsRdMaxLengthGt: ").append(toIndentedString(iopsRdMaxLengthGt)).append("\n");
    sb.append("    iopsRdMaxLengthGte: ").append(toIndentedString(iopsRdMaxLengthGte)).append("\n");
    sb.append("    iopsRdMaxLengthIn: ").append(toIndentedString(iopsRdMaxLengthIn)).append("\n");
    sb.append("    iopsRdMaxLengthLt: ").append(toIndentedString(iopsRdMaxLengthLt)).append("\n");
    sb.append("    iopsRdMaxLengthLte: ").append(toIndentedString(iopsRdMaxLengthLte)).append("\n");
    sb.append("    iopsRdMaxLengthNot: ").append(toIndentedString(iopsRdMaxLengthNot)).append("\n");
    sb.append("    iopsRdMaxLengthNotIn: ").append(toIndentedString(iopsRdMaxLengthNotIn)).append("\n");
    sb.append("    iopsRdMaxLt: ").append(toIndentedString(iopsRdMaxLt)).append("\n");
    sb.append("    iopsRdMaxLte: ").append(toIndentedString(iopsRdMaxLte)).append("\n");
    sb.append("    iopsRdMaxNot: ").append(toIndentedString(iopsRdMaxNot)).append("\n");
    sb.append("    iopsRdMaxNotIn: ").append(toIndentedString(iopsRdMaxNotIn)).append("\n");
    sb.append("    iopsRdNot: ").append(toIndentedString(iopsRdNot)).append("\n");
    sb.append("    iopsRdNotIn: ").append(toIndentedString(iopsRdNotIn)).append("\n");
    sb.append("    iopsWr: ").append(toIndentedString(iopsWr)).append("\n");
    sb.append("    iopsWrGt: ").append(toIndentedString(iopsWrGt)).append("\n");
    sb.append("    iopsWrGte: ").append(toIndentedString(iopsWrGte)).append("\n");
    sb.append("    iopsWrIn: ").append(toIndentedString(iopsWrIn)).append("\n");
    sb.append("    iopsWrLt: ").append(toIndentedString(iopsWrLt)).append("\n");
    sb.append("    iopsWrLte: ").append(toIndentedString(iopsWrLte)).append("\n");
    sb.append("    iopsWrMax: ").append(toIndentedString(iopsWrMax)).append("\n");
    sb.append("    iopsWrMaxGt: ").append(toIndentedString(iopsWrMaxGt)).append("\n");
    sb.append("    iopsWrMaxGte: ").append(toIndentedString(iopsWrMaxGte)).append("\n");
    sb.append("    iopsWrMaxIn: ").append(toIndentedString(iopsWrMaxIn)).append("\n");
    sb.append("    iopsWrMaxLength: ").append(toIndentedString(iopsWrMaxLength)).append("\n");
    sb.append("    iopsWrMaxLengthGt: ").append(toIndentedString(iopsWrMaxLengthGt)).append("\n");
    sb.append("    iopsWrMaxLengthGte: ").append(toIndentedString(iopsWrMaxLengthGte)).append("\n");
    sb.append("    iopsWrMaxLengthIn: ").append(toIndentedString(iopsWrMaxLengthIn)).append("\n");
    sb.append("    iopsWrMaxLengthLt: ").append(toIndentedString(iopsWrMaxLengthLt)).append("\n");
    sb.append("    iopsWrMaxLengthLte: ").append(toIndentedString(iopsWrMaxLengthLte)).append("\n");
    sb.append("    iopsWrMaxLengthNot: ").append(toIndentedString(iopsWrMaxLengthNot)).append("\n");
    sb.append("    iopsWrMaxLengthNotIn: ").append(toIndentedString(iopsWrMaxLengthNotIn)).append("\n");
    sb.append("    iopsWrMaxLt: ").append(toIndentedString(iopsWrMaxLt)).append("\n");
    sb.append("    iopsWrMaxLte: ").append(toIndentedString(iopsWrMaxLte)).append("\n");
    sb.append("    iopsWrMaxNot: ").append(toIndentedString(iopsWrMaxNot)).append("\n");
    sb.append("    iopsWrMaxNotIn: ").append(toIndentedString(iopsWrMaxNotIn)).append("\n");
    sb.append("    iopsWrNot: ").append(toIndentedString(iopsWrNot)).append("\n");
    sb.append("    iopsWrNotIn: ").append(toIndentedString(iopsWrNotIn)).append("\n");
    sb.append("    iscsiTarget: ").append(toIndentedString(iscsiTarget)).append("\n");
    sb.append("    labelsEvery: ").append(toIndentedString(labelsEvery)).append("\n");
    sb.append("    labelsNone: ").append(toIndentedString(labelsNone)).append("\n");
    sb.append("    labelsSome: ").append(toIndentedString(labelsSome)).append("\n");
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
    sb.append("    lunId: ").append(toIndentedString(lunId)).append("\n");
    sb.append("    lunIdGt: ").append(toIndentedString(lunIdGt)).append("\n");
    sb.append("    lunIdGte: ").append(toIndentedString(lunIdGte)).append("\n");
    sb.append("    lunIdIn: ").append(toIndentedString(lunIdIn)).append("\n");
    sb.append("    lunIdLt: ").append(toIndentedString(lunIdLt)).append("\n");
    sb.append("    lunIdLte: ").append(toIndentedString(lunIdLte)).append("\n");
    sb.append("    lunIdNot: ").append(toIndentedString(lunIdNot)).append("\n");
    sb.append("    lunIdNotIn: ").append(toIndentedString(lunIdNotIn)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    nameContains: ").append(toIndentedString(nameContains)).append("\n");
    sb.append("    nameEndsWith: ").append(toIndentedString(nameEndsWith)).append("\n");
    sb.append("    nameGt: ").append(toIndentedString(nameGt)).append("\n");
    sb.append("    nameGte: ").append(toIndentedString(nameGte)).append("\n");
    sb.append("    nameIn: ").append(toIndentedString(nameIn)).append("\n");
    sb.append("    nameLt: ").append(toIndentedString(nameLt)).append("\n");
    sb.append("    nameLte: ").append(toIndentedString(nameLte)).append("\n");
    sb.append("    nameNot: ").append(toIndentedString(nameNot)).append("\n");
    sb.append("    nameNotContains: ").append(toIndentedString(nameNotContains)).append("\n");
    sb.append("    nameNotEndsWith: ").append(toIndentedString(nameNotEndsWith)).append("\n");
    sb.append("    nameNotIn: ").append(toIndentedString(nameNotIn)).append("\n");
    sb.append("    nameNotStartsWith: ").append(toIndentedString(nameNotStartsWith)).append("\n");
    sb.append("    nameStartsWith: ").append(toIndentedString(nameStartsWith)).append("\n");
    sb.append("    replicaNum: ").append(toIndentedString(replicaNum)).append("\n");
    sb.append("    replicaNumGt: ").append(toIndentedString(replicaNumGt)).append("\n");
    sb.append("    replicaNumGte: ").append(toIndentedString(replicaNumGte)).append("\n");
    sb.append("    replicaNumIn: ").append(toIndentedString(replicaNumIn)).append("\n");
    sb.append("    replicaNumLt: ").append(toIndentedString(replicaNumLt)).append("\n");
    sb.append("    replicaNumLte: ").append(toIndentedString(replicaNumLte)).append("\n");
    sb.append("    replicaNumNot: ").append(toIndentedString(replicaNumNot)).append("\n");
    sb.append("    replicaNumNotIn: ").append(toIndentedString(replicaNumNotIn)).append("\n");
    sb.append("    sharedSize: ").append(toIndentedString(sharedSize)).append("\n");
    sb.append("    sharedSizeGt: ").append(toIndentedString(sharedSizeGt)).append("\n");
    sb.append("    sharedSizeGte: ").append(toIndentedString(sharedSizeGte)).append("\n");
    sb.append("    sharedSizeIn: ").append(toIndentedString(sharedSizeIn)).append("\n");
    sb.append("    sharedSizeLt: ").append(toIndentedString(sharedSizeLt)).append("\n");
    sb.append("    sharedSizeLte: ").append(toIndentedString(sharedSizeLte)).append("\n");
    sb.append("    sharedSizeNot: ").append(toIndentedString(sharedSizeNot)).append("\n");
    sb.append("    sharedSizeNotIn: ").append(toIndentedString(sharedSizeNotIn)).append("\n");
    sb.append("    snapshotNum: ").append(toIndentedString(snapshotNum)).append("\n");
    sb.append("    snapshotNumGt: ").append(toIndentedString(snapshotNumGt)).append("\n");
    sb.append("    snapshotNumGte: ").append(toIndentedString(snapshotNumGte)).append("\n");
    sb.append("    snapshotNumIn: ").append(toIndentedString(snapshotNumIn)).append("\n");
    sb.append("    snapshotNumLt: ").append(toIndentedString(snapshotNumLt)).append("\n");
    sb.append("    snapshotNumLte: ").append(toIndentedString(snapshotNumLte)).append("\n");
    sb.append("    snapshotNumNot: ").append(toIndentedString(snapshotNumNot)).append("\n");
    sb.append("    snapshotNumNotIn: ").append(toIndentedString(snapshotNumNotIn)).append("\n");
    sb.append("    stripeNum: ").append(toIndentedString(stripeNum)).append("\n");
    sb.append("    stripeNumGt: ").append(toIndentedString(stripeNumGt)).append("\n");
    sb.append("    stripeNumGte: ").append(toIndentedString(stripeNumGte)).append("\n");
    sb.append("    stripeNumIn: ").append(toIndentedString(stripeNumIn)).append("\n");
    sb.append("    stripeNumLt: ").append(toIndentedString(stripeNumLt)).append("\n");
    sb.append("    stripeNumLte: ").append(toIndentedString(stripeNumLte)).append("\n");
    sb.append("    stripeNumNot: ").append(toIndentedString(stripeNumNot)).append("\n");
    sb.append("    stripeNumNotIn: ").append(toIndentedString(stripeNumNotIn)).append("\n");
    sb.append("    stripeSize: ").append(toIndentedString(stripeSize)).append("\n");
    sb.append("    stripeSizeGt: ").append(toIndentedString(stripeSizeGt)).append("\n");
    sb.append("    stripeSizeGte: ").append(toIndentedString(stripeSizeGte)).append("\n");
    sb.append("    stripeSizeIn: ").append(toIndentedString(stripeSizeIn)).append("\n");
    sb.append("    stripeSizeLt: ").append(toIndentedString(stripeSizeLt)).append("\n");
    sb.append("    stripeSizeLte: ").append(toIndentedString(stripeSizeLte)).append("\n");
    sb.append("    stripeSizeNot: ").append(toIndentedString(stripeSizeNot)).append("\n");
    sb.append("    stripeSizeNotIn: ").append(toIndentedString(stripeSizeNotIn)).append("\n");
    sb.append("    thinProvision: ").append(toIndentedString(thinProvision)).append("\n");
    sb.append("    thinProvisionNot: ").append(toIndentedString(thinProvisionNot)).append("\n");
    sb.append("    uniqueLogicalSize: ").append(toIndentedString(uniqueLogicalSize)).append("\n");
    sb.append("    uniqueLogicalSizeGt: ").append(toIndentedString(uniqueLogicalSizeGt)).append("\n");
    sb.append("    uniqueLogicalSizeGte: ").append(toIndentedString(uniqueLogicalSizeGte)).append("\n");
    sb.append("    uniqueLogicalSizeIn: ").append(toIndentedString(uniqueLogicalSizeIn)).append("\n");
    sb.append("    uniqueLogicalSizeLt: ").append(toIndentedString(uniqueLogicalSizeLt)).append("\n");
    sb.append("    uniqueLogicalSizeLte: ").append(toIndentedString(uniqueLogicalSizeLte)).append("\n");
    sb.append("    uniqueLogicalSizeNot: ").append(toIndentedString(uniqueLogicalSizeNot)).append("\n");
    sb.append("    uniqueLogicalSizeNotIn: ").append(toIndentedString(uniqueLogicalSizeNotIn)).append("\n");
    sb.append("    uniqueSize: ").append(toIndentedString(uniqueSize)).append("\n");
    sb.append("    uniqueSizeGt: ").append(toIndentedString(uniqueSizeGt)).append("\n");
    sb.append("    uniqueSizeGte: ").append(toIndentedString(uniqueSizeGte)).append("\n");
    sb.append("    uniqueSizeIn: ").append(toIndentedString(uniqueSizeIn)).append("\n");
    sb.append("    uniqueSizeLt: ").append(toIndentedString(uniqueSizeLt)).append("\n");
    sb.append("    uniqueSizeLte: ").append(toIndentedString(uniqueSizeLte)).append("\n");
    sb.append("    uniqueSizeNot: ").append(toIndentedString(uniqueSizeNot)).append("\n");
    sb.append("    uniqueSizeNotIn: ").append(toIndentedString(uniqueSizeNotIn)).append("\n");
    sb.append("    zbsVolumeId: ").append(toIndentedString(zbsVolumeId)).append("\n");
    sb.append("    zbsVolumeIdContains: ").append(toIndentedString(zbsVolumeIdContains)).append("\n");
    sb.append("    zbsVolumeIdEndsWith: ").append(toIndentedString(zbsVolumeIdEndsWith)).append("\n");
    sb.append("    zbsVolumeIdGt: ").append(toIndentedString(zbsVolumeIdGt)).append("\n");
    sb.append("    zbsVolumeIdGte: ").append(toIndentedString(zbsVolumeIdGte)).append("\n");
    sb.append("    zbsVolumeIdIn: ").append(toIndentedString(zbsVolumeIdIn)).append("\n");
    sb.append("    zbsVolumeIdLt: ").append(toIndentedString(zbsVolumeIdLt)).append("\n");
    sb.append("    zbsVolumeIdLte: ").append(toIndentedString(zbsVolumeIdLte)).append("\n");
    sb.append("    zbsVolumeIdNot: ").append(toIndentedString(zbsVolumeIdNot)).append("\n");
    sb.append("    zbsVolumeIdNotContains: ").append(toIndentedString(zbsVolumeIdNotContains)).append("\n");
    sb.append("    zbsVolumeIdNotEndsWith: ").append(toIndentedString(zbsVolumeIdNotEndsWith)).append("\n");
    sb.append("    zbsVolumeIdNotIn: ").append(toIndentedString(zbsVolumeIdNotIn)).append("\n");
    sb.append("    zbsVolumeIdNotStartsWith: ").append(toIndentedString(zbsVolumeIdNotStartsWith)).append("\n");
    sb.append("    zbsVolumeIdStartsWith: ").append(toIndentedString(zbsVolumeIdStartsWith)).append("\n");
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

