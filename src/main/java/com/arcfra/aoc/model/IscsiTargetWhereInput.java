package com.arcfra.aoc.model;

import java.util.Objects;
import java.util.Arrays;
import com.arcfra.aoc.model.ClusterWhereInput;
import com.arcfra.aoc.model.EntityAsyncStatus;
import com.arcfra.aoc.model.IscsiLunWhereInput;
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
 * IscsiTargetWhereInput
 */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class IscsiTargetWhereInput {
  public static final String SERIALIZED_NAME_A_N_D = "AND";
  @SerializedName(SERIALIZED_NAME_A_N_D)
  private List<IscsiTargetWhereInput> AND = null;

  public static final String SERIALIZED_NAME_N_O_T = "NOT";
  @SerializedName(SERIALIZED_NAME_N_O_T)
  private List<IscsiTargetWhereInput> NOT = null;

  public static final String SERIALIZED_NAME_O_R = "OR";
  @SerializedName(SERIALIZED_NAME_O_R)
  private List<IscsiTargetWhereInput> OR = null;

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

  public static final String SERIALIZED_NAME_CHAP_ENABLED = "chap_enabled";
  @SerializedName(SERIALIZED_NAME_CHAP_ENABLED)
  private Boolean chapEnabled;

  public static final String SERIALIZED_NAME_CHAP_ENABLED_NOT = "chap_enabled_not";
  @SerializedName(SERIALIZED_NAME_CHAP_ENABLED_NOT)
  private Boolean chapEnabledNot;

  public static final String SERIALIZED_NAME_CHAP_NAME = "chap_name";
  @SerializedName(SERIALIZED_NAME_CHAP_NAME)
  private String chapName;

  public static final String SERIALIZED_NAME_CHAP_NAME_CONTAINS = "chap_name_contains";
  @SerializedName(SERIALIZED_NAME_CHAP_NAME_CONTAINS)
  private String chapNameContains;

  public static final String SERIALIZED_NAME_CHAP_NAME_ENDS_WITH = "chap_name_ends_with";
  @SerializedName(SERIALIZED_NAME_CHAP_NAME_ENDS_WITH)
  private String chapNameEndsWith;

  public static final String SERIALIZED_NAME_CHAP_NAME_GT = "chap_name_gt";
  @SerializedName(SERIALIZED_NAME_CHAP_NAME_GT)
  private String chapNameGt;

  public static final String SERIALIZED_NAME_CHAP_NAME_GTE = "chap_name_gte";
  @SerializedName(SERIALIZED_NAME_CHAP_NAME_GTE)
  private String chapNameGte;

  public static final String SERIALIZED_NAME_CHAP_NAME_IN = "chap_name_in";
  @SerializedName(SERIALIZED_NAME_CHAP_NAME_IN)
  private List<String> chapNameIn = null;

  public static final String SERIALIZED_NAME_CHAP_NAME_LT = "chap_name_lt";
  @SerializedName(SERIALIZED_NAME_CHAP_NAME_LT)
  private String chapNameLt;

  public static final String SERIALIZED_NAME_CHAP_NAME_LTE = "chap_name_lte";
  @SerializedName(SERIALIZED_NAME_CHAP_NAME_LTE)
  private String chapNameLte;

  public static final String SERIALIZED_NAME_CHAP_NAME_NOT = "chap_name_not";
  @SerializedName(SERIALIZED_NAME_CHAP_NAME_NOT)
  private String chapNameNot;

  public static final String SERIALIZED_NAME_CHAP_NAME_NOT_CONTAINS = "chap_name_not_contains";
  @SerializedName(SERIALIZED_NAME_CHAP_NAME_NOT_CONTAINS)
  private String chapNameNotContains;

  public static final String SERIALIZED_NAME_CHAP_NAME_NOT_ENDS_WITH = "chap_name_not_ends_with";
  @SerializedName(SERIALIZED_NAME_CHAP_NAME_NOT_ENDS_WITH)
  private String chapNameNotEndsWith;

  public static final String SERIALIZED_NAME_CHAP_NAME_NOT_IN = "chap_name_not_in";
  @SerializedName(SERIALIZED_NAME_CHAP_NAME_NOT_IN)
  private List<String> chapNameNotIn = null;

  public static final String SERIALIZED_NAME_CHAP_NAME_NOT_STARTS_WITH = "chap_name_not_starts_with";
  @SerializedName(SERIALIZED_NAME_CHAP_NAME_NOT_STARTS_WITH)
  private String chapNameNotStartsWith;

  public static final String SERIALIZED_NAME_CHAP_NAME_STARTS_WITH = "chap_name_starts_with";
  @SerializedName(SERIALIZED_NAME_CHAP_NAME_STARTS_WITH)
  private String chapNameStartsWith;

  public static final String SERIALIZED_NAME_CHAP_SECRET = "chap_secret";
  @SerializedName(SERIALIZED_NAME_CHAP_SECRET)
  private String chapSecret;

  public static final String SERIALIZED_NAME_CHAP_SECRET_CONTAINS = "chap_secret_contains";
  @SerializedName(SERIALIZED_NAME_CHAP_SECRET_CONTAINS)
  private String chapSecretContains;

  public static final String SERIALIZED_NAME_CHAP_SECRET_ENDS_WITH = "chap_secret_ends_with";
  @SerializedName(SERIALIZED_NAME_CHAP_SECRET_ENDS_WITH)
  private String chapSecretEndsWith;

  public static final String SERIALIZED_NAME_CHAP_SECRET_GT = "chap_secret_gt";
  @SerializedName(SERIALIZED_NAME_CHAP_SECRET_GT)
  private String chapSecretGt;

  public static final String SERIALIZED_NAME_CHAP_SECRET_GTE = "chap_secret_gte";
  @SerializedName(SERIALIZED_NAME_CHAP_SECRET_GTE)
  private String chapSecretGte;

  public static final String SERIALIZED_NAME_CHAP_SECRET_IN = "chap_secret_in";
  @SerializedName(SERIALIZED_NAME_CHAP_SECRET_IN)
  private List<String> chapSecretIn = null;

  public static final String SERIALIZED_NAME_CHAP_SECRET_LT = "chap_secret_lt";
  @SerializedName(SERIALIZED_NAME_CHAP_SECRET_LT)
  private String chapSecretLt;

  public static final String SERIALIZED_NAME_CHAP_SECRET_LTE = "chap_secret_lte";
  @SerializedName(SERIALIZED_NAME_CHAP_SECRET_LTE)
  private String chapSecretLte;

  public static final String SERIALIZED_NAME_CHAP_SECRET_NOT = "chap_secret_not";
  @SerializedName(SERIALIZED_NAME_CHAP_SECRET_NOT)
  private String chapSecretNot;

  public static final String SERIALIZED_NAME_CHAP_SECRET_NOT_CONTAINS = "chap_secret_not_contains";
  @SerializedName(SERIALIZED_NAME_CHAP_SECRET_NOT_CONTAINS)
  private String chapSecretNotContains;

  public static final String SERIALIZED_NAME_CHAP_SECRET_NOT_ENDS_WITH = "chap_secret_not_ends_with";
  @SerializedName(SERIALIZED_NAME_CHAP_SECRET_NOT_ENDS_WITH)
  private String chapSecretNotEndsWith;

  public static final String SERIALIZED_NAME_CHAP_SECRET_NOT_IN = "chap_secret_not_in";
  @SerializedName(SERIALIZED_NAME_CHAP_SECRET_NOT_IN)
  private List<String> chapSecretNotIn = null;

  public static final String SERIALIZED_NAME_CHAP_SECRET_NOT_STARTS_WITH = "chap_secret_not_starts_with";
  @SerializedName(SERIALIZED_NAME_CHAP_SECRET_NOT_STARTS_WITH)
  private String chapSecretNotStartsWith;

  public static final String SERIALIZED_NAME_CHAP_SECRET_STARTS_WITH = "chap_secret_starts_with";
  @SerializedName(SERIALIZED_NAME_CHAP_SECRET_STARTS_WITH)
  private String chapSecretStartsWith;

  public static final String SERIALIZED_NAME_CLUSTER = "cluster";
  @SerializedName(SERIALIZED_NAME_CLUSTER)
  private ClusterWhereInput cluster;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_DESCRIPTION_CONTAINS = "description_contains";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION_CONTAINS)
  private String descriptionContains;

  public static final String SERIALIZED_NAME_DESCRIPTION_ENDS_WITH = "description_ends_with";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION_ENDS_WITH)
  private String descriptionEndsWith;

  public static final String SERIALIZED_NAME_DESCRIPTION_GT = "description_gt";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION_GT)
  private String descriptionGt;

  public static final String SERIALIZED_NAME_DESCRIPTION_GTE = "description_gte";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION_GTE)
  private String descriptionGte;

  public static final String SERIALIZED_NAME_DESCRIPTION_IN = "description_in";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION_IN)
  private List<String> descriptionIn = null;

  public static final String SERIALIZED_NAME_DESCRIPTION_LT = "description_lt";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION_LT)
  private String descriptionLt;

  public static final String SERIALIZED_NAME_DESCRIPTION_LTE = "description_lte";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION_LTE)
  private String descriptionLte;

  public static final String SERIALIZED_NAME_DESCRIPTION_NOT = "description_not";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION_NOT)
  private String descriptionNot;

  public static final String SERIALIZED_NAME_DESCRIPTION_NOT_CONTAINS = "description_not_contains";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION_NOT_CONTAINS)
  private String descriptionNotContains;

  public static final String SERIALIZED_NAME_DESCRIPTION_NOT_ENDS_WITH = "description_not_ends_with";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION_NOT_ENDS_WITH)
  private String descriptionNotEndsWith;

  public static final String SERIALIZED_NAME_DESCRIPTION_NOT_IN = "description_not_in";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION_NOT_IN)
  private List<String> descriptionNotIn = null;

  public static final String SERIALIZED_NAME_DESCRIPTION_NOT_STARTS_WITH = "description_not_starts_with";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION_NOT_STARTS_WITH)
  private String descriptionNotStartsWith;

  public static final String SERIALIZED_NAME_DESCRIPTION_STARTS_WITH = "description_starts_with";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION_STARTS_WITH)
  private String descriptionStartsWith;

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

  public static final String SERIALIZED_NAME_EXTERNAL_USE = "external_use";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_USE)
  private Boolean externalUse;

  public static final String SERIALIZED_NAME_EXTERNAL_USE_NOT = "external_use_not";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_USE_NOT)
  private Boolean externalUseNot;

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

  public static final String SERIALIZED_NAME_INTERNAL = "internal";
  @SerializedName(SERIALIZED_NAME_INTERNAL)
  private Boolean internal;

  public static final String SERIALIZED_NAME_INTERNAL_NOT = "internal_not";
  @SerializedName(SERIALIZED_NAME_INTERNAL_NOT)
  private Boolean internalNot;

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

  public static final String SERIALIZED_NAME_IP_WHITELIST = "ip_whitelist";
  @SerializedName(SERIALIZED_NAME_IP_WHITELIST)
  private String ipWhitelist;

  public static final String SERIALIZED_NAME_IP_WHITELIST_CONTAINS = "ip_whitelist_contains";
  @SerializedName(SERIALIZED_NAME_IP_WHITELIST_CONTAINS)
  private String ipWhitelistContains;

  public static final String SERIALIZED_NAME_IP_WHITELIST_ENDS_WITH = "ip_whitelist_ends_with";
  @SerializedName(SERIALIZED_NAME_IP_WHITELIST_ENDS_WITH)
  private String ipWhitelistEndsWith;

  public static final String SERIALIZED_NAME_IP_WHITELIST_GT = "ip_whitelist_gt";
  @SerializedName(SERIALIZED_NAME_IP_WHITELIST_GT)
  private String ipWhitelistGt;

  public static final String SERIALIZED_NAME_IP_WHITELIST_GTE = "ip_whitelist_gte";
  @SerializedName(SERIALIZED_NAME_IP_WHITELIST_GTE)
  private String ipWhitelistGte;

  public static final String SERIALIZED_NAME_IP_WHITELIST_IN = "ip_whitelist_in";
  @SerializedName(SERIALIZED_NAME_IP_WHITELIST_IN)
  private List<String> ipWhitelistIn = null;

  public static final String SERIALIZED_NAME_IP_WHITELIST_LT = "ip_whitelist_lt";
  @SerializedName(SERIALIZED_NAME_IP_WHITELIST_LT)
  private String ipWhitelistLt;

  public static final String SERIALIZED_NAME_IP_WHITELIST_LTE = "ip_whitelist_lte";
  @SerializedName(SERIALIZED_NAME_IP_WHITELIST_LTE)
  private String ipWhitelistLte;

  public static final String SERIALIZED_NAME_IP_WHITELIST_NOT = "ip_whitelist_not";
  @SerializedName(SERIALIZED_NAME_IP_WHITELIST_NOT)
  private String ipWhitelistNot;

  public static final String SERIALIZED_NAME_IP_WHITELIST_NOT_CONTAINS = "ip_whitelist_not_contains";
  @SerializedName(SERIALIZED_NAME_IP_WHITELIST_NOT_CONTAINS)
  private String ipWhitelistNotContains;

  public static final String SERIALIZED_NAME_IP_WHITELIST_NOT_ENDS_WITH = "ip_whitelist_not_ends_with";
  @SerializedName(SERIALIZED_NAME_IP_WHITELIST_NOT_ENDS_WITH)
  private String ipWhitelistNotEndsWith;

  public static final String SERIALIZED_NAME_IP_WHITELIST_NOT_IN = "ip_whitelist_not_in";
  @SerializedName(SERIALIZED_NAME_IP_WHITELIST_NOT_IN)
  private List<String> ipWhitelistNotIn = null;

  public static final String SERIALIZED_NAME_IP_WHITELIST_NOT_STARTS_WITH = "ip_whitelist_not_starts_with";
  @SerializedName(SERIALIZED_NAME_IP_WHITELIST_NOT_STARTS_WITH)
  private String ipWhitelistNotStartsWith;

  public static final String SERIALIZED_NAME_IP_WHITELIST_STARTS_WITH = "ip_whitelist_starts_with";
  @SerializedName(SERIALIZED_NAME_IP_WHITELIST_STARTS_WITH)
  private String ipWhitelistStartsWith;

  public static final String SERIALIZED_NAME_IQN_NAME = "iqn_name";
  @SerializedName(SERIALIZED_NAME_IQN_NAME)
  private String iqnName;

  public static final String SERIALIZED_NAME_IQN_NAME_CONTAINS = "iqn_name_contains";
  @SerializedName(SERIALIZED_NAME_IQN_NAME_CONTAINS)
  private String iqnNameContains;

  public static final String SERIALIZED_NAME_IQN_NAME_ENDS_WITH = "iqn_name_ends_with";
  @SerializedName(SERIALIZED_NAME_IQN_NAME_ENDS_WITH)
  private String iqnNameEndsWith;

  public static final String SERIALIZED_NAME_IQN_NAME_GT = "iqn_name_gt";
  @SerializedName(SERIALIZED_NAME_IQN_NAME_GT)
  private String iqnNameGt;

  public static final String SERIALIZED_NAME_IQN_NAME_GTE = "iqn_name_gte";
  @SerializedName(SERIALIZED_NAME_IQN_NAME_GTE)
  private String iqnNameGte;

  public static final String SERIALIZED_NAME_IQN_NAME_IN = "iqn_name_in";
  @SerializedName(SERIALIZED_NAME_IQN_NAME_IN)
  private List<String> iqnNameIn = null;

  public static final String SERIALIZED_NAME_IQN_NAME_LT = "iqn_name_lt";
  @SerializedName(SERIALIZED_NAME_IQN_NAME_LT)
  private String iqnNameLt;

  public static final String SERIALIZED_NAME_IQN_NAME_LTE = "iqn_name_lte";
  @SerializedName(SERIALIZED_NAME_IQN_NAME_LTE)
  private String iqnNameLte;

  public static final String SERIALIZED_NAME_IQN_NAME_NOT = "iqn_name_not";
  @SerializedName(SERIALIZED_NAME_IQN_NAME_NOT)
  private String iqnNameNot;

  public static final String SERIALIZED_NAME_IQN_NAME_NOT_CONTAINS = "iqn_name_not_contains";
  @SerializedName(SERIALIZED_NAME_IQN_NAME_NOT_CONTAINS)
  private String iqnNameNotContains;

  public static final String SERIALIZED_NAME_IQN_NAME_NOT_ENDS_WITH = "iqn_name_not_ends_with";
  @SerializedName(SERIALIZED_NAME_IQN_NAME_NOT_ENDS_WITH)
  private String iqnNameNotEndsWith;

  public static final String SERIALIZED_NAME_IQN_NAME_NOT_IN = "iqn_name_not_in";
  @SerializedName(SERIALIZED_NAME_IQN_NAME_NOT_IN)
  private List<String> iqnNameNotIn = null;

  public static final String SERIALIZED_NAME_IQN_NAME_NOT_STARTS_WITH = "iqn_name_not_starts_with";
  @SerializedName(SERIALIZED_NAME_IQN_NAME_NOT_STARTS_WITH)
  private String iqnNameNotStartsWith;

  public static final String SERIALIZED_NAME_IQN_NAME_STARTS_WITH = "iqn_name_starts_with";
  @SerializedName(SERIALIZED_NAME_IQN_NAME_STARTS_WITH)
  private String iqnNameStartsWith;

  public static final String SERIALIZED_NAME_IQN_WHITELIST = "iqn_whitelist";
  @SerializedName(SERIALIZED_NAME_IQN_WHITELIST)
  private String iqnWhitelist;

  public static final String SERIALIZED_NAME_IQN_WHITELIST_CONTAINS = "iqn_whitelist_contains";
  @SerializedName(SERIALIZED_NAME_IQN_WHITELIST_CONTAINS)
  private String iqnWhitelistContains;

  public static final String SERIALIZED_NAME_IQN_WHITELIST_ENDS_WITH = "iqn_whitelist_ends_with";
  @SerializedName(SERIALIZED_NAME_IQN_WHITELIST_ENDS_WITH)
  private String iqnWhitelistEndsWith;

  public static final String SERIALIZED_NAME_IQN_WHITELIST_GT = "iqn_whitelist_gt";
  @SerializedName(SERIALIZED_NAME_IQN_WHITELIST_GT)
  private String iqnWhitelistGt;

  public static final String SERIALIZED_NAME_IQN_WHITELIST_GTE = "iqn_whitelist_gte";
  @SerializedName(SERIALIZED_NAME_IQN_WHITELIST_GTE)
  private String iqnWhitelistGte;

  public static final String SERIALIZED_NAME_IQN_WHITELIST_IN = "iqn_whitelist_in";
  @SerializedName(SERIALIZED_NAME_IQN_WHITELIST_IN)
  private List<String> iqnWhitelistIn = null;

  public static final String SERIALIZED_NAME_IQN_WHITELIST_LT = "iqn_whitelist_lt";
  @SerializedName(SERIALIZED_NAME_IQN_WHITELIST_LT)
  private String iqnWhitelistLt;

  public static final String SERIALIZED_NAME_IQN_WHITELIST_LTE = "iqn_whitelist_lte";
  @SerializedName(SERIALIZED_NAME_IQN_WHITELIST_LTE)
  private String iqnWhitelistLte;

  public static final String SERIALIZED_NAME_IQN_WHITELIST_NOT = "iqn_whitelist_not";
  @SerializedName(SERIALIZED_NAME_IQN_WHITELIST_NOT)
  private String iqnWhitelistNot;

  public static final String SERIALIZED_NAME_IQN_WHITELIST_NOT_CONTAINS = "iqn_whitelist_not_contains";
  @SerializedName(SERIALIZED_NAME_IQN_WHITELIST_NOT_CONTAINS)
  private String iqnWhitelistNotContains;

  public static final String SERIALIZED_NAME_IQN_WHITELIST_NOT_ENDS_WITH = "iqn_whitelist_not_ends_with";
  @SerializedName(SERIALIZED_NAME_IQN_WHITELIST_NOT_ENDS_WITH)
  private String iqnWhitelistNotEndsWith;

  public static final String SERIALIZED_NAME_IQN_WHITELIST_NOT_IN = "iqn_whitelist_not_in";
  @SerializedName(SERIALIZED_NAME_IQN_WHITELIST_NOT_IN)
  private List<String> iqnWhitelistNotIn = null;

  public static final String SERIALIZED_NAME_IQN_WHITELIST_NOT_STARTS_WITH = "iqn_whitelist_not_starts_with";
  @SerializedName(SERIALIZED_NAME_IQN_WHITELIST_NOT_STARTS_WITH)
  private String iqnWhitelistNotStartsWith;

  public static final String SERIALIZED_NAME_IQN_WHITELIST_STARTS_WITH = "iqn_whitelist_starts_with";
  @SerializedName(SERIALIZED_NAME_IQN_WHITELIST_STARTS_WITH)
  private String iqnWhitelistStartsWith;

  public static final String SERIALIZED_NAME_LABELS_EVERY = "labels_every";
  @SerializedName(SERIALIZED_NAME_LABELS_EVERY)
  private LabelWhereInput labelsEvery;

  public static final String SERIALIZED_NAME_LABELS_NONE = "labels_none";
  @SerializedName(SERIALIZED_NAME_LABELS_NONE)
  private LabelWhereInput labelsNone;

  public static final String SERIALIZED_NAME_LABELS_SOME = "labels_some";
  @SerializedName(SERIALIZED_NAME_LABELS_SOME)
  private LabelWhereInput labelsSome;

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

  public static final String SERIALIZED_NAME_LUNS_EVERY = "luns_every";
  @SerializedName(SERIALIZED_NAME_LUNS_EVERY)
  private IscsiLunWhereInput lunsEvery;

  public static final String SERIALIZED_NAME_LUNS_NONE = "luns_none";
  @SerializedName(SERIALIZED_NAME_LUNS_NONE)
  private IscsiLunWhereInput lunsNone;

  public static final String SERIALIZED_NAME_LUNS_SOME = "luns_some";
  @SerializedName(SERIALIZED_NAME_LUNS_SOME)
  private IscsiLunWhereInput lunsSome;

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

  public IscsiTargetWhereInput() { 
  }

  public IscsiTargetWhereInput AND(List<IscsiTargetWhereInput> AND) {
    
    this.AND = AND;
    return this;
  }

  public IscsiTargetWhereInput addANDItem(IscsiTargetWhereInput ANDItem) {
    if (this.AND == null) {
      this.AND = new ArrayList<IscsiTargetWhereInput>();
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

  public List<IscsiTargetWhereInput> getAND() {
    return AND;
  }


  public void setAND(List<IscsiTargetWhereInput> AND) {
    this.AND = AND;
  }


  public IscsiTargetWhereInput NOT(List<IscsiTargetWhereInput> NOT) {
    
    this.NOT = NOT;
    return this;
  }

  public IscsiTargetWhereInput addNOTItem(IscsiTargetWhereInput NOTItem) {
    if (this.NOT == null) {
      this.NOT = new ArrayList<IscsiTargetWhereInput>();
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

  public List<IscsiTargetWhereInput> getNOT() {
    return NOT;
  }


  public void setNOT(List<IscsiTargetWhereInput> NOT) {
    this.NOT = NOT;
  }


  public IscsiTargetWhereInput OR(List<IscsiTargetWhereInput> OR) {
    
    this.OR = OR;
    return this;
  }

  public IscsiTargetWhereInput addORItem(IscsiTargetWhereInput ORItem) {
    if (this.OR == null) {
      this.OR = new ArrayList<IscsiTargetWhereInput>();
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

  public List<IscsiTargetWhereInput> getOR() {
    return OR;
  }


  public void setOR(List<IscsiTargetWhereInput> OR) {
    this.OR = OR;
  }


  public IscsiTargetWhereInput bps(Long bps) {
    
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


  public IscsiTargetWhereInput bpsGt(Long bpsGt) {
    
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


  public IscsiTargetWhereInput bpsGte(Long bpsGte) {
    
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


  public IscsiTargetWhereInput bpsIn(List<Long> bpsIn) {
    
    this.bpsIn = bpsIn;
    return this;
  }

  public IscsiTargetWhereInput addBpsInItem(Long bpsInItem) {
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


  public IscsiTargetWhereInput bpsLt(Long bpsLt) {
    
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


  public IscsiTargetWhereInput bpsLte(Long bpsLte) {
    
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


  public IscsiTargetWhereInput bpsMax(Long bpsMax) {
    
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


  public IscsiTargetWhereInput bpsMaxGt(Long bpsMaxGt) {
    
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


  public IscsiTargetWhereInput bpsMaxGte(Long bpsMaxGte) {
    
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


  public IscsiTargetWhereInput bpsMaxIn(List<Long> bpsMaxIn) {
    
    this.bpsMaxIn = bpsMaxIn;
    return this;
  }

  public IscsiTargetWhereInput addBpsMaxInItem(Long bpsMaxInItem) {
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


  public IscsiTargetWhereInput bpsMaxLength(Long bpsMaxLength) {
    
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


  public IscsiTargetWhereInput bpsMaxLengthGt(Long bpsMaxLengthGt) {
    
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


  public IscsiTargetWhereInput bpsMaxLengthGte(Long bpsMaxLengthGte) {
    
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


  public IscsiTargetWhereInput bpsMaxLengthIn(List<Long> bpsMaxLengthIn) {
    
    this.bpsMaxLengthIn = bpsMaxLengthIn;
    return this;
  }

  public IscsiTargetWhereInput addBpsMaxLengthInItem(Long bpsMaxLengthInItem) {
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


  public IscsiTargetWhereInput bpsMaxLengthLt(Long bpsMaxLengthLt) {
    
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


  public IscsiTargetWhereInput bpsMaxLengthLte(Long bpsMaxLengthLte) {
    
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


  public IscsiTargetWhereInput bpsMaxLengthNot(Long bpsMaxLengthNot) {
    
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


  public IscsiTargetWhereInput bpsMaxLengthNotIn(List<Long> bpsMaxLengthNotIn) {
    
    this.bpsMaxLengthNotIn = bpsMaxLengthNotIn;
    return this;
  }

  public IscsiTargetWhereInput addBpsMaxLengthNotInItem(Long bpsMaxLengthNotInItem) {
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


  public IscsiTargetWhereInput bpsMaxLt(Long bpsMaxLt) {
    
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


  public IscsiTargetWhereInput bpsMaxLte(Long bpsMaxLte) {
    
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


  public IscsiTargetWhereInput bpsMaxNot(Long bpsMaxNot) {
    
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


  public IscsiTargetWhereInput bpsMaxNotIn(List<Long> bpsMaxNotIn) {
    
    this.bpsMaxNotIn = bpsMaxNotIn;
    return this;
  }

  public IscsiTargetWhereInput addBpsMaxNotInItem(Long bpsMaxNotInItem) {
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


  public IscsiTargetWhereInput bpsNot(Long bpsNot) {
    
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


  public IscsiTargetWhereInput bpsNotIn(List<Long> bpsNotIn) {
    
    this.bpsNotIn = bpsNotIn;
    return this;
  }

  public IscsiTargetWhereInput addBpsNotInItem(Long bpsNotInItem) {
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


  public IscsiTargetWhereInput bpsRd(Long bpsRd) {
    
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


  public IscsiTargetWhereInput bpsRdGt(Long bpsRdGt) {
    
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


  public IscsiTargetWhereInput bpsRdGte(Long bpsRdGte) {
    
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


  public IscsiTargetWhereInput bpsRdIn(List<Long> bpsRdIn) {
    
    this.bpsRdIn = bpsRdIn;
    return this;
  }

  public IscsiTargetWhereInput addBpsRdInItem(Long bpsRdInItem) {
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


  public IscsiTargetWhereInput bpsRdLt(Long bpsRdLt) {
    
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


  public IscsiTargetWhereInput bpsRdLte(Long bpsRdLte) {
    
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


  public IscsiTargetWhereInput bpsRdMax(Long bpsRdMax) {
    
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


  public IscsiTargetWhereInput bpsRdMaxGt(Long bpsRdMaxGt) {
    
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


  public IscsiTargetWhereInput bpsRdMaxGte(Long bpsRdMaxGte) {
    
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


  public IscsiTargetWhereInput bpsRdMaxIn(List<Long> bpsRdMaxIn) {
    
    this.bpsRdMaxIn = bpsRdMaxIn;
    return this;
  }

  public IscsiTargetWhereInput addBpsRdMaxInItem(Long bpsRdMaxInItem) {
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


  public IscsiTargetWhereInput bpsRdMaxLength(Long bpsRdMaxLength) {
    
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


  public IscsiTargetWhereInput bpsRdMaxLengthGt(Long bpsRdMaxLengthGt) {
    
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


  public IscsiTargetWhereInput bpsRdMaxLengthGte(Long bpsRdMaxLengthGte) {
    
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


  public IscsiTargetWhereInput bpsRdMaxLengthIn(List<Long> bpsRdMaxLengthIn) {
    
    this.bpsRdMaxLengthIn = bpsRdMaxLengthIn;
    return this;
  }

  public IscsiTargetWhereInput addBpsRdMaxLengthInItem(Long bpsRdMaxLengthInItem) {
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


  public IscsiTargetWhereInput bpsRdMaxLengthLt(Long bpsRdMaxLengthLt) {
    
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


  public IscsiTargetWhereInput bpsRdMaxLengthLte(Long bpsRdMaxLengthLte) {
    
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


  public IscsiTargetWhereInput bpsRdMaxLengthNot(Long bpsRdMaxLengthNot) {
    
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


  public IscsiTargetWhereInput bpsRdMaxLengthNotIn(List<Long> bpsRdMaxLengthNotIn) {
    
    this.bpsRdMaxLengthNotIn = bpsRdMaxLengthNotIn;
    return this;
  }

  public IscsiTargetWhereInput addBpsRdMaxLengthNotInItem(Long bpsRdMaxLengthNotInItem) {
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


  public IscsiTargetWhereInput bpsRdMaxLt(Long bpsRdMaxLt) {
    
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


  public IscsiTargetWhereInput bpsRdMaxLte(Long bpsRdMaxLte) {
    
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


  public IscsiTargetWhereInput bpsRdMaxNot(Long bpsRdMaxNot) {
    
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


  public IscsiTargetWhereInput bpsRdMaxNotIn(List<Long> bpsRdMaxNotIn) {
    
    this.bpsRdMaxNotIn = bpsRdMaxNotIn;
    return this;
  }

  public IscsiTargetWhereInput addBpsRdMaxNotInItem(Long bpsRdMaxNotInItem) {
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


  public IscsiTargetWhereInput bpsRdNot(Long bpsRdNot) {
    
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


  public IscsiTargetWhereInput bpsRdNotIn(List<Long> bpsRdNotIn) {
    
    this.bpsRdNotIn = bpsRdNotIn;
    return this;
  }

  public IscsiTargetWhereInput addBpsRdNotInItem(Long bpsRdNotInItem) {
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


  public IscsiTargetWhereInput bpsWr(Long bpsWr) {
    
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


  public IscsiTargetWhereInput bpsWrGt(Long bpsWrGt) {
    
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


  public IscsiTargetWhereInput bpsWrGte(Long bpsWrGte) {
    
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


  public IscsiTargetWhereInput bpsWrIn(List<Long> bpsWrIn) {
    
    this.bpsWrIn = bpsWrIn;
    return this;
  }

  public IscsiTargetWhereInput addBpsWrInItem(Long bpsWrInItem) {
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


  public IscsiTargetWhereInput bpsWrLt(Long bpsWrLt) {
    
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


  public IscsiTargetWhereInput bpsWrLte(Long bpsWrLte) {
    
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


  public IscsiTargetWhereInput bpsWrMax(Long bpsWrMax) {
    
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


  public IscsiTargetWhereInput bpsWrMaxGt(Long bpsWrMaxGt) {
    
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


  public IscsiTargetWhereInput bpsWrMaxGte(Long bpsWrMaxGte) {
    
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


  public IscsiTargetWhereInput bpsWrMaxIn(List<Long> bpsWrMaxIn) {
    
    this.bpsWrMaxIn = bpsWrMaxIn;
    return this;
  }

  public IscsiTargetWhereInput addBpsWrMaxInItem(Long bpsWrMaxInItem) {
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


  public IscsiTargetWhereInput bpsWrMaxLength(Long bpsWrMaxLength) {
    
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


  public IscsiTargetWhereInput bpsWrMaxLengthGt(Long bpsWrMaxLengthGt) {
    
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


  public IscsiTargetWhereInput bpsWrMaxLengthGte(Long bpsWrMaxLengthGte) {
    
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


  public IscsiTargetWhereInput bpsWrMaxLengthIn(List<Long> bpsWrMaxLengthIn) {
    
    this.bpsWrMaxLengthIn = bpsWrMaxLengthIn;
    return this;
  }

  public IscsiTargetWhereInput addBpsWrMaxLengthInItem(Long bpsWrMaxLengthInItem) {
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


  public IscsiTargetWhereInput bpsWrMaxLengthLt(Long bpsWrMaxLengthLt) {
    
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


  public IscsiTargetWhereInput bpsWrMaxLengthLte(Long bpsWrMaxLengthLte) {
    
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


  public IscsiTargetWhereInput bpsWrMaxLengthNot(Long bpsWrMaxLengthNot) {
    
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


  public IscsiTargetWhereInput bpsWrMaxLengthNotIn(List<Long> bpsWrMaxLengthNotIn) {
    
    this.bpsWrMaxLengthNotIn = bpsWrMaxLengthNotIn;
    return this;
  }

  public IscsiTargetWhereInput addBpsWrMaxLengthNotInItem(Long bpsWrMaxLengthNotInItem) {
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


  public IscsiTargetWhereInput bpsWrMaxLt(Long bpsWrMaxLt) {
    
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


  public IscsiTargetWhereInput bpsWrMaxLte(Long bpsWrMaxLte) {
    
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


  public IscsiTargetWhereInput bpsWrMaxNot(Long bpsWrMaxNot) {
    
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


  public IscsiTargetWhereInput bpsWrMaxNotIn(List<Long> bpsWrMaxNotIn) {
    
    this.bpsWrMaxNotIn = bpsWrMaxNotIn;
    return this;
  }

  public IscsiTargetWhereInput addBpsWrMaxNotInItem(Long bpsWrMaxNotInItem) {
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


  public IscsiTargetWhereInput bpsWrNot(Long bpsWrNot) {
    
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


  public IscsiTargetWhereInput bpsWrNotIn(List<Long> bpsWrNotIn) {
    
    this.bpsWrNotIn = bpsWrNotIn;
    return this;
  }

  public IscsiTargetWhereInput addBpsWrNotInItem(Long bpsWrNotInItem) {
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


  public IscsiTargetWhereInput chapEnabled(Boolean chapEnabled) {
    
    this.chapEnabled = chapEnabled;
    return this;
  }

   /**
   * Get chapEnabled
   * @return chapEnabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getChapEnabled() {
    return chapEnabled;
  }


  public void setChapEnabled(Boolean chapEnabled) {
    this.chapEnabled = chapEnabled;
  }


  public IscsiTargetWhereInput chapEnabledNot(Boolean chapEnabledNot) {
    
    this.chapEnabledNot = chapEnabledNot;
    return this;
  }

   /**
   * Get chapEnabledNot
   * @return chapEnabledNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getChapEnabledNot() {
    return chapEnabledNot;
  }


  public void setChapEnabledNot(Boolean chapEnabledNot) {
    this.chapEnabledNot = chapEnabledNot;
  }


  public IscsiTargetWhereInput chapName(String chapName) {
    
    this.chapName = chapName;
    return this;
  }

   /**
   * Get chapName
   * @return chapName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getChapName() {
    return chapName;
  }


  public void setChapName(String chapName) {
    this.chapName = chapName;
  }


  public IscsiTargetWhereInput chapNameContains(String chapNameContains) {
    
    this.chapNameContains = chapNameContains;
    return this;
  }

   /**
   * Get chapNameContains
   * @return chapNameContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getChapNameContains() {
    return chapNameContains;
  }


  public void setChapNameContains(String chapNameContains) {
    this.chapNameContains = chapNameContains;
  }


  public IscsiTargetWhereInput chapNameEndsWith(String chapNameEndsWith) {
    
    this.chapNameEndsWith = chapNameEndsWith;
    return this;
  }

   /**
   * Get chapNameEndsWith
   * @return chapNameEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getChapNameEndsWith() {
    return chapNameEndsWith;
  }


  public void setChapNameEndsWith(String chapNameEndsWith) {
    this.chapNameEndsWith = chapNameEndsWith;
  }


  public IscsiTargetWhereInput chapNameGt(String chapNameGt) {
    
    this.chapNameGt = chapNameGt;
    return this;
  }

   /**
   * Get chapNameGt
   * @return chapNameGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getChapNameGt() {
    return chapNameGt;
  }


  public void setChapNameGt(String chapNameGt) {
    this.chapNameGt = chapNameGt;
  }


  public IscsiTargetWhereInput chapNameGte(String chapNameGte) {
    
    this.chapNameGte = chapNameGte;
    return this;
  }

   /**
   * Get chapNameGte
   * @return chapNameGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getChapNameGte() {
    return chapNameGte;
  }


  public void setChapNameGte(String chapNameGte) {
    this.chapNameGte = chapNameGte;
  }


  public IscsiTargetWhereInput chapNameIn(List<String> chapNameIn) {
    
    this.chapNameIn = chapNameIn;
    return this;
  }

  public IscsiTargetWhereInput addChapNameInItem(String chapNameInItem) {
    if (this.chapNameIn == null) {
      this.chapNameIn = new ArrayList<String>();
    }
    this.chapNameIn.add(chapNameInItem);
    return this;
  }

   /**
   * Get chapNameIn
   * @return chapNameIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getChapNameIn() {
    return chapNameIn;
  }


  public void setChapNameIn(List<String> chapNameIn) {
    this.chapNameIn = chapNameIn;
  }


  public IscsiTargetWhereInput chapNameLt(String chapNameLt) {
    
    this.chapNameLt = chapNameLt;
    return this;
  }

   /**
   * Get chapNameLt
   * @return chapNameLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getChapNameLt() {
    return chapNameLt;
  }


  public void setChapNameLt(String chapNameLt) {
    this.chapNameLt = chapNameLt;
  }


  public IscsiTargetWhereInput chapNameLte(String chapNameLte) {
    
    this.chapNameLte = chapNameLte;
    return this;
  }

   /**
   * Get chapNameLte
   * @return chapNameLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getChapNameLte() {
    return chapNameLte;
  }


  public void setChapNameLte(String chapNameLte) {
    this.chapNameLte = chapNameLte;
  }


  public IscsiTargetWhereInput chapNameNot(String chapNameNot) {
    
    this.chapNameNot = chapNameNot;
    return this;
  }

   /**
   * Get chapNameNot
   * @return chapNameNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getChapNameNot() {
    return chapNameNot;
  }


  public void setChapNameNot(String chapNameNot) {
    this.chapNameNot = chapNameNot;
  }


  public IscsiTargetWhereInput chapNameNotContains(String chapNameNotContains) {
    
    this.chapNameNotContains = chapNameNotContains;
    return this;
  }

   /**
   * Get chapNameNotContains
   * @return chapNameNotContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getChapNameNotContains() {
    return chapNameNotContains;
  }


  public void setChapNameNotContains(String chapNameNotContains) {
    this.chapNameNotContains = chapNameNotContains;
  }


  public IscsiTargetWhereInput chapNameNotEndsWith(String chapNameNotEndsWith) {
    
    this.chapNameNotEndsWith = chapNameNotEndsWith;
    return this;
  }

   /**
   * Get chapNameNotEndsWith
   * @return chapNameNotEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getChapNameNotEndsWith() {
    return chapNameNotEndsWith;
  }


  public void setChapNameNotEndsWith(String chapNameNotEndsWith) {
    this.chapNameNotEndsWith = chapNameNotEndsWith;
  }


  public IscsiTargetWhereInput chapNameNotIn(List<String> chapNameNotIn) {
    
    this.chapNameNotIn = chapNameNotIn;
    return this;
  }

  public IscsiTargetWhereInput addChapNameNotInItem(String chapNameNotInItem) {
    if (this.chapNameNotIn == null) {
      this.chapNameNotIn = new ArrayList<String>();
    }
    this.chapNameNotIn.add(chapNameNotInItem);
    return this;
  }

   /**
   * Get chapNameNotIn
   * @return chapNameNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getChapNameNotIn() {
    return chapNameNotIn;
  }


  public void setChapNameNotIn(List<String> chapNameNotIn) {
    this.chapNameNotIn = chapNameNotIn;
  }


  public IscsiTargetWhereInput chapNameNotStartsWith(String chapNameNotStartsWith) {
    
    this.chapNameNotStartsWith = chapNameNotStartsWith;
    return this;
  }

   /**
   * Get chapNameNotStartsWith
   * @return chapNameNotStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getChapNameNotStartsWith() {
    return chapNameNotStartsWith;
  }


  public void setChapNameNotStartsWith(String chapNameNotStartsWith) {
    this.chapNameNotStartsWith = chapNameNotStartsWith;
  }


  public IscsiTargetWhereInput chapNameStartsWith(String chapNameStartsWith) {
    
    this.chapNameStartsWith = chapNameStartsWith;
    return this;
  }

   /**
   * Get chapNameStartsWith
   * @return chapNameStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getChapNameStartsWith() {
    return chapNameStartsWith;
  }


  public void setChapNameStartsWith(String chapNameStartsWith) {
    this.chapNameStartsWith = chapNameStartsWith;
  }


  public IscsiTargetWhereInput chapSecret(String chapSecret) {
    
    this.chapSecret = chapSecret;
    return this;
  }

   /**
   * Get chapSecret
   * @return chapSecret
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getChapSecret() {
    return chapSecret;
  }


  public void setChapSecret(String chapSecret) {
    this.chapSecret = chapSecret;
  }


  public IscsiTargetWhereInput chapSecretContains(String chapSecretContains) {
    
    this.chapSecretContains = chapSecretContains;
    return this;
  }

   /**
   * Get chapSecretContains
   * @return chapSecretContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getChapSecretContains() {
    return chapSecretContains;
  }


  public void setChapSecretContains(String chapSecretContains) {
    this.chapSecretContains = chapSecretContains;
  }


  public IscsiTargetWhereInput chapSecretEndsWith(String chapSecretEndsWith) {
    
    this.chapSecretEndsWith = chapSecretEndsWith;
    return this;
  }

   /**
   * Get chapSecretEndsWith
   * @return chapSecretEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getChapSecretEndsWith() {
    return chapSecretEndsWith;
  }


  public void setChapSecretEndsWith(String chapSecretEndsWith) {
    this.chapSecretEndsWith = chapSecretEndsWith;
  }


  public IscsiTargetWhereInput chapSecretGt(String chapSecretGt) {
    
    this.chapSecretGt = chapSecretGt;
    return this;
  }

   /**
   * Get chapSecretGt
   * @return chapSecretGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getChapSecretGt() {
    return chapSecretGt;
  }


  public void setChapSecretGt(String chapSecretGt) {
    this.chapSecretGt = chapSecretGt;
  }


  public IscsiTargetWhereInput chapSecretGte(String chapSecretGte) {
    
    this.chapSecretGte = chapSecretGte;
    return this;
  }

   /**
   * Get chapSecretGte
   * @return chapSecretGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getChapSecretGte() {
    return chapSecretGte;
  }


  public void setChapSecretGte(String chapSecretGte) {
    this.chapSecretGte = chapSecretGte;
  }


  public IscsiTargetWhereInput chapSecretIn(List<String> chapSecretIn) {
    
    this.chapSecretIn = chapSecretIn;
    return this;
  }

  public IscsiTargetWhereInput addChapSecretInItem(String chapSecretInItem) {
    if (this.chapSecretIn == null) {
      this.chapSecretIn = new ArrayList<String>();
    }
    this.chapSecretIn.add(chapSecretInItem);
    return this;
  }

   /**
   * Get chapSecretIn
   * @return chapSecretIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getChapSecretIn() {
    return chapSecretIn;
  }


  public void setChapSecretIn(List<String> chapSecretIn) {
    this.chapSecretIn = chapSecretIn;
  }


  public IscsiTargetWhereInput chapSecretLt(String chapSecretLt) {
    
    this.chapSecretLt = chapSecretLt;
    return this;
  }

   /**
   * Get chapSecretLt
   * @return chapSecretLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getChapSecretLt() {
    return chapSecretLt;
  }


  public void setChapSecretLt(String chapSecretLt) {
    this.chapSecretLt = chapSecretLt;
  }


  public IscsiTargetWhereInput chapSecretLte(String chapSecretLte) {
    
    this.chapSecretLte = chapSecretLte;
    return this;
  }

   /**
   * Get chapSecretLte
   * @return chapSecretLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getChapSecretLte() {
    return chapSecretLte;
  }


  public void setChapSecretLte(String chapSecretLte) {
    this.chapSecretLte = chapSecretLte;
  }


  public IscsiTargetWhereInput chapSecretNot(String chapSecretNot) {
    
    this.chapSecretNot = chapSecretNot;
    return this;
  }

   /**
   * Get chapSecretNot
   * @return chapSecretNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getChapSecretNot() {
    return chapSecretNot;
  }


  public void setChapSecretNot(String chapSecretNot) {
    this.chapSecretNot = chapSecretNot;
  }


  public IscsiTargetWhereInput chapSecretNotContains(String chapSecretNotContains) {
    
    this.chapSecretNotContains = chapSecretNotContains;
    return this;
  }

   /**
   * Get chapSecretNotContains
   * @return chapSecretNotContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getChapSecretNotContains() {
    return chapSecretNotContains;
  }


  public void setChapSecretNotContains(String chapSecretNotContains) {
    this.chapSecretNotContains = chapSecretNotContains;
  }


  public IscsiTargetWhereInput chapSecretNotEndsWith(String chapSecretNotEndsWith) {
    
    this.chapSecretNotEndsWith = chapSecretNotEndsWith;
    return this;
  }

   /**
   * Get chapSecretNotEndsWith
   * @return chapSecretNotEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getChapSecretNotEndsWith() {
    return chapSecretNotEndsWith;
  }


  public void setChapSecretNotEndsWith(String chapSecretNotEndsWith) {
    this.chapSecretNotEndsWith = chapSecretNotEndsWith;
  }


  public IscsiTargetWhereInput chapSecretNotIn(List<String> chapSecretNotIn) {
    
    this.chapSecretNotIn = chapSecretNotIn;
    return this;
  }

  public IscsiTargetWhereInput addChapSecretNotInItem(String chapSecretNotInItem) {
    if (this.chapSecretNotIn == null) {
      this.chapSecretNotIn = new ArrayList<String>();
    }
    this.chapSecretNotIn.add(chapSecretNotInItem);
    return this;
  }

   /**
   * Get chapSecretNotIn
   * @return chapSecretNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getChapSecretNotIn() {
    return chapSecretNotIn;
  }


  public void setChapSecretNotIn(List<String> chapSecretNotIn) {
    this.chapSecretNotIn = chapSecretNotIn;
  }


  public IscsiTargetWhereInput chapSecretNotStartsWith(String chapSecretNotStartsWith) {
    
    this.chapSecretNotStartsWith = chapSecretNotStartsWith;
    return this;
  }

   /**
   * Get chapSecretNotStartsWith
   * @return chapSecretNotStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getChapSecretNotStartsWith() {
    return chapSecretNotStartsWith;
  }


  public void setChapSecretNotStartsWith(String chapSecretNotStartsWith) {
    this.chapSecretNotStartsWith = chapSecretNotStartsWith;
  }


  public IscsiTargetWhereInput chapSecretStartsWith(String chapSecretStartsWith) {
    
    this.chapSecretStartsWith = chapSecretStartsWith;
    return this;
  }

   /**
   * Get chapSecretStartsWith
   * @return chapSecretStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getChapSecretStartsWith() {
    return chapSecretStartsWith;
  }


  public void setChapSecretStartsWith(String chapSecretStartsWith) {
    this.chapSecretStartsWith = chapSecretStartsWith;
  }


  public IscsiTargetWhereInput cluster(ClusterWhereInput cluster) {
    
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


  public IscsiTargetWhereInput description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public IscsiTargetWhereInput descriptionContains(String descriptionContains) {
    
    this.descriptionContains = descriptionContains;
    return this;
  }

   /**
   * Get descriptionContains
   * @return descriptionContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDescriptionContains() {
    return descriptionContains;
  }


  public void setDescriptionContains(String descriptionContains) {
    this.descriptionContains = descriptionContains;
  }


  public IscsiTargetWhereInput descriptionEndsWith(String descriptionEndsWith) {
    
    this.descriptionEndsWith = descriptionEndsWith;
    return this;
  }

   /**
   * Get descriptionEndsWith
   * @return descriptionEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDescriptionEndsWith() {
    return descriptionEndsWith;
  }


  public void setDescriptionEndsWith(String descriptionEndsWith) {
    this.descriptionEndsWith = descriptionEndsWith;
  }


  public IscsiTargetWhereInput descriptionGt(String descriptionGt) {
    
    this.descriptionGt = descriptionGt;
    return this;
  }

   /**
   * Get descriptionGt
   * @return descriptionGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDescriptionGt() {
    return descriptionGt;
  }


  public void setDescriptionGt(String descriptionGt) {
    this.descriptionGt = descriptionGt;
  }


  public IscsiTargetWhereInput descriptionGte(String descriptionGte) {
    
    this.descriptionGte = descriptionGte;
    return this;
  }

   /**
   * Get descriptionGte
   * @return descriptionGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDescriptionGte() {
    return descriptionGte;
  }


  public void setDescriptionGte(String descriptionGte) {
    this.descriptionGte = descriptionGte;
  }


  public IscsiTargetWhereInput descriptionIn(List<String> descriptionIn) {
    
    this.descriptionIn = descriptionIn;
    return this;
  }

  public IscsiTargetWhereInput addDescriptionInItem(String descriptionInItem) {
    if (this.descriptionIn == null) {
      this.descriptionIn = new ArrayList<String>();
    }
    this.descriptionIn.add(descriptionInItem);
    return this;
  }

   /**
   * Get descriptionIn
   * @return descriptionIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getDescriptionIn() {
    return descriptionIn;
  }


  public void setDescriptionIn(List<String> descriptionIn) {
    this.descriptionIn = descriptionIn;
  }


  public IscsiTargetWhereInput descriptionLt(String descriptionLt) {
    
    this.descriptionLt = descriptionLt;
    return this;
  }

   /**
   * Get descriptionLt
   * @return descriptionLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDescriptionLt() {
    return descriptionLt;
  }


  public void setDescriptionLt(String descriptionLt) {
    this.descriptionLt = descriptionLt;
  }


  public IscsiTargetWhereInput descriptionLte(String descriptionLte) {
    
    this.descriptionLte = descriptionLte;
    return this;
  }

   /**
   * Get descriptionLte
   * @return descriptionLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDescriptionLte() {
    return descriptionLte;
  }


  public void setDescriptionLte(String descriptionLte) {
    this.descriptionLte = descriptionLte;
  }


  public IscsiTargetWhereInput descriptionNot(String descriptionNot) {
    
    this.descriptionNot = descriptionNot;
    return this;
  }

   /**
   * Get descriptionNot
   * @return descriptionNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDescriptionNot() {
    return descriptionNot;
  }


  public void setDescriptionNot(String descriptionNot) {
    this.descriptionNot = descriptionNot;
  }


  public IscsiTargetWhereInput descriptionNotContains(String descriptionNotContains) {
    
    this.descriptionNotContains = descriptionNotContains;
    return this;
  }

   /**
   * Get descriptionNotContains
   * @return descriptionNotContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDescriptionNotContains() {
    return descriptionNotContains;
  }


  public void setDescriptionNotContains(String descriptionNotContains) {
    this.descriptionNotContains = descriptionNotContains;
  }


  public IscsiTargetWhereInput descriptionNotEndsWith(String descriptionNotEndsWith) {
    
    this.descriptionNotEndsWith = descriptionNotEndsWith;
    return this;
  }

   /**
   * Get descriptionNotEndsWith
   * @return descriptionNotEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDescriptionNotEndsWith() {
    return descriptionNotEndsWith;
  }


  public void setDescriptionNotEndsWith(String descriptionNotEndsWith) {
    this.descriptionNotEndsWith = descriptionNotEndsWith;
  }


  public IscsiTargetWhereInput descriptionNotIn(List<String> descriptionNotIn) {
    
    this.descriptionNotIn = descriptionNotIn;
    return this;
  }

  public IscsiTargetWhereInput addDescriptionNotInItem(String descriptionNotInItem) {
    if (this.descriptionNotIn == null) {
      this.descriptionNotIn = new ArrayList<String>();
    }
    this.descriptionNotIn.add(descriptionNotInItem);
    return this;
  }

   /**
   * Get descriptionNotIn
   * @return descriptionNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getDescriptionNotIn() {
    return descriptionNotIn;
  }


  public void setDescriptionNotIn(List<String> descriptionNotIn) {
    this.descriptionNotIn = descriptionNotIn;
  }


  public IscsiTargetWhereInput descriptionNotStartsWith(String descriptionNotStartsWith) {
    
    this.descriptionNotStartsWith = descriptionNotStartsWith;
    return this;
  }

   /**
   * Get descriptionNotStartsWith
   * @return descriptionNotStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDescriptionNotStartsWith() {
    return descriptionNotStartsWith;
  }


  public void setDescriptionNotStartsWith(String descriptionNotStartsWith) {
    this.descriptionNotStartsWith = descriptionNotStartsWith;
  }


  public IscsiTargetWhereInput descriptionStartsWith(String descriptionStartsWith) {
    
    this.descriptionStartsWith = descriptionStartsWith;
    return this;
  }

   /**
   * Get descriptionStartsWith
   * @return descriptionStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDescriptionStartsWith() {
    return descriptionStartsWith;
  }


  public void setDescriptionStartsWith(String descriptionStartsWith) {
    this.descriptionStartsWith = descriptionStartsWith;
  }


  public IscsiTargetWhereInput entityAsyncStatus(EntityAsyncStatus entityAsyncStatus) {
    
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


  public IscsiTargetWhereInput entityAsyncStatusIn(List<EntityAsyncStatus> entityAsyncStatusIn) {
    
    this.entityAsyncStatusIn = entityAsyncStatusIn;
    return this;
  }

  public IscsiTargetWhereInput addEntityAsyncStatusInItem(EntityAsyncStatus entityAsyncStatusInItem) {
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


  public IscsiTargetWhereInput entityAsyncStatusNot(EntityAsyncStatus entityAsyncStatusNot) {
    
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


  public IscsiTargetWhereInput entityAsyncStatusNotIn(List<EntityAsyncStatus> entityAsyncStatusNotIn) {
    
    this.entityAsyncStatusNotIn = entityAsyncStatusNotIn;
    return this;
  }

  public IscsiTargetWhereInput addEntityAsyncStatusNotInItem(EntityAsyncStatus entityAsyncStatusNotInItem) {
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


  public IscsiTargetWhereInput externalUse(Boolean externalUse) {
    
    this.externalUse = externalUse;
    return this;
  }

   /**
   * Get externalUse
   * @return externalUse
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getExternalUse() {
    return externalUse;
  }


  public void setExternalUse(Boolean externalUse) {
    this.externalUse = externalUse;
  }


  public IscsiTargetWhereInput externalUseNot(Boolean externalUseNot) {
    
    this.externalUseNot = externalUseNot;
    return this;
  }

   /**
   * Get externalUseNot
   * @return externalUseNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getExternalUseNot() {
    return externalUseNot;
  }


  public void setExternalUseNot(Boolean externalUseNot) {
    this.externalUseNot = externalUseNot;
  }


  public IscsiTargetWhereInput id(String id) {
    
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


  public IscsiTargetWhereInput idContains(String idContains) {
    
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


  public IscsiTargetWhereInput idEndsWith(String idEndsWith) {
    
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


  public IscsiTargetWhereInput idGt(String idGt) {
    
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


  public IscsiTargetWhereInput idGte(String idGte) {
    
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


  public IscsiTargetWhereInput idIn(List<String> idIn) {
    
    this.idIn = idIn;
    return this;
  }

  public IscsiTargetWhereInput addIdInItem(String idInItem) {
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


  public IscsiTargetWhereInput idLt(String idLt) {
    
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


  public IscsiTargetWhereInput idLte(String idLte) {
    
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


  public IscsiTargetWhereInput idNot(String idNot) {
    
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


  public IscsiTargetWhereInput idNotContains(String idNotContains) {
    
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


  public IscsiTargetWhereInput idNotEndsWith(String idNotEndsWith) {
    
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


  public IscsiTargetWhereInput idNotIn(List<String> idNotIn) {
    
    this.idNotIn = idNotIn;
    return this;
  }

  public IscsiTargetWhereInput addIdNotInItem(String idNotInItem) {
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


  public IscsiTargetWhereInput idNotStartsWith(String idNotStartsWith) {
    
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


  public IscsiTargetWhereInput idStartsWith(String idStartsWith) {
    
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


  public IscsiTargetWhereInput internal(Boolean internal) {
    
    this.internal = internal;
    return this;
  }

   /**
   * Get internal
   * @return internal
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getInternal() {
    return internal;
  }


  public void setInternal(Boolean internal) {
    this.internal = internal;
  }


  public IscsiTargetWhereInput internalNot(Boolean internalNot) {
    
    this.internalNot = internalNot;
    return this;
  }

   /**
   * Get internalNot
   * @return internalNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getInternalNot() {
    return internalNot;
  }


  public void setInternalNot(Boolean internalNot) {
    this.internalNot = internalNot;
  }


  public IscsiTargetWhereInput ioSize(Long ioSize) {
    
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


  public IscsiTargetWhereInput ioSizeGt(Long ioSizeGt) {
    
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


  public IscsiTargetWhereInput ioSizeGte(Long ioSizeGte) {
    
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


  public IscsiTargetWhereInput ioSizeIn(List<Long> ioSizeIn) {
    
    this.ioSizeIn = ioSizeIn;
    return this;
  }

  public IscsiTargetWhereInput addIoSizeInItem(Long ioSizeInItem) {
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


  public IscsiTargetWhereInput ioSizeLt(Long ioSizeLt) {
    
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


  public IscsiTargetWhereInput ioSizeLte(Long ioSizeLte) {
    
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


  public IscsiTargetWhereInput ioSizeNot(Long ioSizeNot) {
    
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


  public IscsiTargetWhereInput ioSizeNotIn(List<Long> ioSizeNotIn) {
    
    this.ioSizeNotIn = ioSizeNotIn;
    return this;
  }

  public IscsiTargetWhereInput addIoSizeNotInItem(Long ioSizeNotInItem) {
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


  public IscsiTargetWhereInput iops(Long iops) {
    
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


  public IscsiTargetWhereInput iopsGt(Long iopsGt) {
    
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


  public IscsiTargetWhereInput iopsGte(Long iopsGte) {
    
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


  public IscsiTargetWhereInput iopsIn(List<Long> iopsIn) {
    
    this.iopsIn = iopsIn;
    return this;
  }

  public IscsiTargetWhereInput addIopsInItem(Long iopsInItem) {
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


  public IscsiTargetWhereInput iopsLt(Long iopsLt) {
    
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


  public IscsiTargetWhereInput iopsLte(Long iopsLte) {
    
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


  public IscsiTargetWhereInput iopsMax(Long iopsMax) {
    
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


  public IscsiTargetWhereInput iopsMaxGt(Long iopsMaxGt) {
    
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


  public IscsiTargetWhereInput iopsMaxGte(Long iopsMaxGte) {
    
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


  public IscsiTargetWhereInput iopsMaxIn(List<Long> iopsMaxIn) {
    
    this.iopsMaxIn = iopsMaxIn;
    return this;
  }

  public IscsiTargetWhereInput addIopsMaxInItem(Long iopsMaxInItem) {
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


  public IscsiTargetWhereInput iopsMaxLength(Long iopsMaxLength) {
    
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


  public IscsiTargetWhereInput iopsMaxLengthGt(Long iopsMaxLengthGt) {
    
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


  public IscsiTargetWhereInput iopsMaxLengthGte(Long iopsMaxLengthGte) {
    
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


  public IscsiTargetWhereInput iopsMaxLengthIn(List<Long> iopsMaxLengthIn) {
    
    this.iopsMaxLengthIn = iopsMaxLengthIn;
    return this;
  }

  public IscsiTargetWhereInput addIopsMaxLengthInItem(Long iopsMaxLengthInItem) {
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


  public IscsiTargetWhereInput iopsMaxLengthLt(Long iopsMaxLengthLt) {
    
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


  public IscsiTargetWhereInput iopsMaxLengthLte(Long iopsMaxLengthLte) {
    
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


  public IscsiTargetWhereInput iopsMaxLengthNot(Long iopsMaxLengthNot) {
    
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


  public IscsiTargetWhereInput iopsMaxLengthNotIn(List<Long> iopsMaxLengthNotIn) {
    
    this.iopsMaxLengthNotIn = iopsMaxLengthNotIn;
    return this;
  }

  public IscsiTargetWhereInput addIopsMaxLengthNotInItem(Long iopsMaxLengthNotInItem) {
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


  public IscsiTargetWhereInput iopsMaxLt(Long iopsMaxLt) {
    
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


  public IscsiTargetWhereInput iopsMaxLte(Long iopsMaxLte) {
    
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


  public IscsiTargetWhereInput iopsMaxNot(Long iopsMaxNot) {
    
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


  public IscsiTargetWhereInput iopsMaxNotIn(List<Long> iopsMaxNotIn) {
    
    this.iopsMaxNotIn = iopsMaxNotIn;
    return this;
  }

  public IscsiTargetWhereInput addIopsMaxNotInItem(Long iopsMaxNotInItem) {
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


  public IscsiTargetWhereInput iopsNot(Long iopsNot) {
    
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


  public IscsiTargetWhereInput iopsNotIn(List<Long> iopsNotIn) {
    
    this.iopsNotIn = iopsNotIn;
    return this;
  }

  public IscsiTargetWhereInput addIopsNotInItem(Long iopsNotInItem) {
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


  public IscsiTargetWhereInput iopsRd(Long iopsRd) {
    
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


  public IscsiTargetWhereInput iopsRdGt(Long iopsRdGt) {
    
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


  public IscsiTargetWhereInput iopsRdGte(Long iopsRdGte) {
    
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


  public IscsiTargetWhereInput iopsRdIn(List<Long> iopsRdIn) {
    
    this.iopsRdIn = iopsRdIn;
    return this;
  }

  public IscsiTargetWhereInput addIopsRdInItem(Long iopsRdInItem) {
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


  public IscsiTargetWhereInput iopsRdLt(Long iopsRdLt) {
    
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


  public IscsiTargetWhereInput iopsRdLte(Long iopsRdLte) {
    
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


  public IscsiTargetWhereInput iopsRdMax(Long iopsRdMax) {
    
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


  public IscsiTargetWhereInput iopsRdMaxGt(Long iopsRdMaxGt) {
    
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


  public IscsiTargetWhereInput iopsRdMaxGte(Long iopsRdMaxGte) {
    
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


  public IscsiTargetWhereInput iopsRdMaxIn(List<Long> iopsRdMaxIn) {
    
    this.iopsRdMaxIn = iopsRdMaxIn;
    return this;
  }

  public IscsiTargetWhereInput addIopsRdMaxInItem(Long iopsRdMaxInItem) {
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


  public IscsiTargetWhereInput iopsRdMaxLength(Long iopsRdMaxLength) {
    
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


  public IscsiTargetWhereInput iopsRdMaxLengthGt(Long iopsRdMaxLengthGt) {
    
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


  public IscsiTargetWhereInput iopsRdMaxLengthGte(Long iopsRdMaxLengthGte) {
    
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


  public IscsiTargetWhereInput iopsRdMaxLengthIn(List<Long> iopsRdMaxLengthIn) {
    
    this.iopsRdMaxLengthIn = iopsRdMaxLengthIn;
    return this;
  }

  public IscsiTargetWhereInput addIopsRdMaxLengthInItem(Long iopsRdMaxLengthInItem) {
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


  public IscsiTargetWhereInput iopsRdMaxLengthLt(Long iopsRdMaxLengthLt) {
    
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


  public IscsiTargetWhereInput iopsRdMaxLengthLte(Long iopsRdMaxLengthLte) {
    
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


  public IscsiTargetWhereInput iopsRdMaxLengthNot(Long iopsRdMaxLengthNot) {
    
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


  public IscsiTargetWhereInput iopsRdMaxLengthNotIn(List<Long> iopsRdMaxLengthNotIn) {
    
    this.iopsRdMaxLengthNotIn = iopsRdMaxLengthNotIn;
    return this;
  }

  public IscsiTargetWhereInput addIopsRdMaxLengthNotInItem(Long iopsRdMaxLengthNotInItem) {
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


  public IscsiTargetWhereInput iopsRdMaxLt(Long iopsRdMaxLt) {
    
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


  public IscsiTargetWhereInput iopsRdMaxLte(Long iopsRdMaxLte) {
    
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


  public IscsiTargetWhereInput iopsRdMaxNot(Long iopsRdMaxNot) {
    
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


  public IscsiTargetWhereInput iopsRdMaxNotIn(List<Long> iopsRdMaxNotIn) {
    
    this.iopsRdMaxNotIn = iopsRdMaxNotIn;
    return this;
  }

  public IscsiTargetWhereInput addIopsRdMaxNotInItem(Long iopsRdMaxNotInItem) {
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


  public IscsiTargetWhereInput iopsRdNot(Long iopsRdNot) {
    
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


  public IscsiTargetWhereInput iopsRdNotIn(List<Long> iopsRdNotIn) {
    
    this.iopsRdNotIn = iopsRdNotIn;
    return this;
  }

  public IscsiTargetWhereInput addIopsRdNotInItem(Long iopsRdNotInItem) {
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


  public IscsiTargetWhereInput iopsWr(Long iopsWr) {
    
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


  public IscsiTargetWhereInput iopsWrGt(Long iopsWrGt) {
    
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


  public IscsiTargetWhereInput iopsWrGte(Long iopsWrGte) {
    
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


  public IscsiTargetWhereInput iopsWrIn(List<Long> iopsWrIn) {
    
    this.iopsWrIn = iopsWrIn;
    return this;
  }

  public IscsiTargetWhereInput addIopsWrInItem(Long iopsWrInItem) {
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


  public IscsiTargetWhereInput iopsWrLt(Long iopsWrLt) {
    
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


  public IscsiTargetWhereInput iopsWrLte(Long iopsWrLte) {
    
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


  public IscsiTargetWhereInput iopsWrMax(Long iopsWrMax) {
    
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


  public IscsiTargetWhereInput iopsWrMaxGt(Long iopsWrMaxGt) {
    
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


  public IscsiTargetWhereInput iopsWrMaxGte(Long iopsWrMaxGte) {
    
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


  public IscsiTargetWhereInput iopsWrMaxIn(List<Long> iopsWrMaxIn) {
    
    this.iopsWrMaxIn = iopsWrMaxIn;
    return this;
  }

  public IscsiTargetWhereInput addIopsWrMaxInItem(Long iopsWrMaxInItem) {
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


  public IscsiTargetWhereInput iopsWrMaxLength(Long iopsWrMaxLength) {
    
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


  public IscsiTargetWhereInput iopsWrMaxLengthGt(Long iopsWrMaxLengthGt) {
    
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


  public IscsiTargetWhereInput iopsWrMaxLengthGte(Long iopsWrMaxLengthGte) {
    
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


  public IscsiTargetWhereInput iopsWrMaxLengthIn(List<Long> iopsWrMaxLengthIn) {
    
    this.iopsWrMaxLengthIn = iopsWrMaxLengthIn;
    return this;
  }

  public IscsiTargetWhereInput addIopsWrMaxLengthInItem(Long iopsWrMaxLengthInItem) {
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


  public IscsiTargetWhereInput iopsWrMaxLengthLt(Long iopsWrMaxLengthLt) {
    
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


  public IscsiTargetWhereInput iopsWrMaxLengthLte(Long iopsWrMaxLengthLte) {
    
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


  public IscsiTargetWhereInput iopsWrMaxLengthNot(Long iopsWrMaxLengthNot) {
    
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


  public IscsiTargetWhereInput iopsWrMaxLengthNotIn(List<Long> iopsWrMaxLengthNotIn) {
    
    this.iopsWrMaxLengthNotIn = iopsWrMaxLengthNotIn;
    return this;
  }

  public IscsiTargetWhereInput addIopsWrMaxLengthNotInItem(Long iopsWrMaxLengthNotInItem) {
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


  public IscsiTargetWhereInput iopsWrMaxLt(Long iopsWrMaxLt) {
    
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


  public IscsiTargetWhereInput iopsWrMaxLte(Long iopsWrMaxLte) {
    
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


  public IscsiTargetWhereInput iopsWrMaxNot(Long iopsWrMaxNot) {
    
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


  public IscsiTargetWhereInput iopsWrMaxNotIn(List<Long> iopsWrMaxNotIn) {
    
    this.iopsWrMaxNotIn = iopsWrMaxNotIn;
    return this;
  }

  public IscsiTargetWhereInput addIopsWrMaxNotInItem(Long iopsWrMaxNotInItem) {
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


  public IscsiTargetWhereInput iopsWrNot(Long iopsWrNot) {
    
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


  public IscsiTargetWhereInput iopsWrNotIn(List<Long> iopsWrNotIn) {
    
    this.iopsWrNotIn = iopsWrNotIn;
    return this;
  }

  public IscsiTargetWhereInput addIopsWrNotInItem(Long iopsWrNotInItem) {
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


  public IscsiTargetWhereInput ipWhitelist(String ipWhitelist) {
    
    this.ipWhitelist = ipWhitelist;
    return this;
  }

   /**
   * Get ipWhitelist
   * @return ipWhitelist
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIpWhitelist() {
    return ipWhitelist;
  }


  public void setIpWhitelist(String ipWhitelist) {
    this.ipWhitelist = ipWhitelist;
  }


  public IscsiTargetWhereInput ipWhitelistContains(String ipWhitelistContains) {
    
    this.ipWhitelistContains = ipWhitelistContains;
    return this;
  }

   /**
   * Get ipWhitelistContains
   * @return ipWhitelistContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIpWhitelistContains() {
    return ipWhitelistContains;
  }


  public void setIpWhitelistContains(String ipWhitelistContains) {
    this.ipWhitelistContains = ipWhitelistContains;
  }


  public IscsiTargetWhereInput ipWhitelistEndsWith(String ipWhitelistEndsWith) {
    
    this.ipWhitelistEndsWith = ipWhitelistEndsWith;
    return this;
  }

   /**
   * Get ipWhitelistEndsWith
   * @return ipWhitelistEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIpWhitelistEndsWith() {
    return ipWhitelistEndsWith;
  }


  public void setIpWhitelistEndsWith(String ipWhitelistEndsWith) {
    this.ipWhitelistEndsWith = ipWhitelistEndsWith;
  }


  public IscsiTargetWhereInput ipWhitelistGt(String ipWhitelistGt) {
    
    this.ipWhitelistGt = ipWhitelistGt;
    return this;
  }

   /**
   * Get ipWhitelistGt
   * @return ipWhitelistGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIpWhitelistGt() {
    return ipWhitelistGt;
  }


  public void setIpWhitelistGt(String ipWhitelistGt) {
    this.ipWhitelistGt = ipWhitelistGt;
  }


  public IscsiTargetWhereInput ipWhitelistGte(String ipWhitelistGte) {
    
    this.ipWhitelistGte = ipWhitelistGte;
    return this;
  }

   /**
   * Get ipWhitelistGte
   * @return ipWhitelistGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIpWhitelistGte() {
    return ipWhitelistGte;
  }


  public void setIpWhitelistGte(String ipWhitelistGte) {
    this.ipWhitelistGte = ipWhitelistGte;
  }


  public IscsiTargetWhereInput ipWhitelistIn(List<String> ipWhitelistIn) {
    
    this.ipWhitelistIn = ipWhitelistIn;
    return this;
  }

  public IscsiTargetWhereInput addIpWhitelistInItem(String ipWhitelistInItem) {
    if (this.ipWhitelistIn == null) {
      this.ipWhitelistIn = new ArrayList<String>();
    }
    this.ipWhitelistIn.add(ipWhitelistInItem);
    return this;
  }

   /**
   * Get ipWhitelistIn
   * @return ipWhitelistIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getIpWhitelistIn() {
    return ipWhitelistIn;
  }


  public void setIpWhitelistIn(List<String> ipWhitelistIn) {
    this.ipWhitelistIn = ipWhitelistIn;
  }


  public IscsiTargetWhereInput ipWhitelistLt(String ipWhitelistLt) {
    
    this.ipWhitelistLt = ipWhitelistLt;
    return this;
  }

   /**
   * Get ipWhitelistLt
   * @return ipWhitelistLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIpWhitelistLt() {
    return ipWhitelistLt;
  }


  public void setIpWhitelistLt(String ipWhitelistLt) {
    this.ipWhitelistLt = ipWhitelistLt;
  }


  public IscsiTargetWhereInput ipWhitelistLte(String ipWhitelistLte) {
    
    this.ipWhitelistLte = ipWhitelistLte;
    return this;
  }

   /**
   * Get ipWhitelistLte
   * @return ipWhitelistLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIpWhitelistLte() {
    return ipWhitelistLte;
  }


  public void setIpWhitelistLte(String ipWhitelistLte) {
    this.ipWhitelistLte = ipWhitelistLte;
  }


  public IscsiTargetWhereInput ipWhitelistNot(String ipWhitelistNot) {
    
    this.ipWhitelistNot = ipWhitelistNot;
    return this;
  }

   /**
   * Get ipWhitelistNot
   * @return ipWhitelistNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIpWhitelistNot() {
    return ipWhitelistNot;
  }


  public void setIpWhitelistNot(String ipWhitelistNot) {
    this.ipWhitelistNot = ipWhitelistNot;
  }


  public IscsiTargetWhereInput ipWhitelistNotContains(String ipWhitelistNotContains) {
    
    this.ipWhitelistNotContains = ipWhitelistNotContains;
    return this;
  }

   /**
   * Get ipWhitelistNotContains
   * @return ipWhitelistNotContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIpWhitelistNotContains() {
    return ipWhitelistNotContains;
  }


  public void setIpWhitelistNotContains(String ipWhitelistNotContains) {
    this.ipWhitelistNotContains = ipWhitelistNotContains;
  }


  public IscsiTargetWhereInput ipWhitelistNotEndsWith(String ipWhitelistNotEndsWith) {
    
    this.ipWhitelistNotEndsWith = ipWhitelistNotEndsWith;
    return this;
  }

   /**
   * Get ipWhitelistNotEndsWith
   * @return ipWhitelistNotEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIpWhitelistNotEndsWith() {
    return ipWhitelistNotEndsWith;
  }


  public void setIpWhitelistNotEndsWith(String ipWhitelistNotEndsWith) {
    this.ipWhitelistNotEndsWith = ipWhitelistNotEndsWith;
  }


  public IscsiTargetWhereInput ipWhitelistNotIn(List<String> ipWhitelistNotIn) {
    
    this.ipWhitelistNotIn = ipWhitelistNotIn;
    return this;
  }

  public IscsiTargetWhereInput addIpWhitelistNotInItem(String ipWhitelistNotInItem) {
    if (this.ipWhitelistNotIn == null) {
      this.ipWhitelistNotIn = new ArrayList<String>();
    }
    this.ipWhitelistNotIn.add(ipWhitelistNotInItem);
    return this;
  }

   /**
   * Get ipWhitelistNotIn
   * @return ipWhitelistNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getIpWhitelistNotIn() {
    return ipWhitelistNotIn;
  }


  public void setIpWhitelistNotIn(List<String> ipWhitelistNotIn) {
    this.ipWhitelistNotIn = ipWhitelistNotIn;
  }


  public IscsiTargetWhereInput ipWhitelistNotStartsWith(String ipWhitelistNotStartsWith) {
    
    this.ipWhitelistNotStartsWith = ipWhitelistNotStartsWith;
    return this;
  }

   /**
   * Get ipWhitelistNotStartsWith
   * @return ipWhitelistNotStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIpWhitelistNotStartsWith() {
    return ipWhitelistNotStartsWith;
  }


  public void setIpWhitelistNotStartsWith(String ipWhitelistNotStartsWith) {
    this.ipWhitelistNotStartsWith = ipWhitelistNotStartsWith;
  }


  public IscsiTargetWhereInput ipWhitelistStartsWith(String ipWhitelistStartsWith) {
    
    this.ipWhitelistStartsWith = ipWhitelistStartsWith;
    return this;
  }

   /**
   * Get ipWhitelistStartsWith
   * @return ipWhitelistStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIpWhitelistStartsWith() {
    return ipWhitelistStartsWith;
  }


  public void setIpWhitelistStartsWith(String ipWhitelistStartsWith) {
    this.ipWhitelistStartsWith = ipWhitelistStartsWith;
  }


  public IscsiTargetWhereInput iqnName(String iqnName) {
    
    this.iqnName = iqnName;
    return this;
  }

   /**
   * Get iqnName
   * @return iqnName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIqnName() {
    return iqnName;
  }


  public void setIqnName(String iqnName) {
    this.iqnName = iqnName;
  }


  public IscsiTargetWhereInput iqnNameContains(String iqnNameContains) {
    
    this.iqnNameContains = iqnNameContains;
    return this;
  }

   /**
   * Get iqnNameContains
   * @return iqnNameContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIqnNameContains() {
    return iqnNameContains;
  }


  public void setIqnNameContains(String iqnNameContains) {
    this.iqnNameContains = iqnNameContains;
  }


  public IscsiTargetWhereInput iqnNameEndsWith(String iqnNameEndsWith) {
    
    this.iqnNameEndsWith = iqnNameEndsWith;
    return this;
  }

   /**
   * Get iqnNameEndsWith
   * @return iqnNameEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIqnNameEndsWith() {
    return iqnNameEndsWith;
  }


  public void setIqnNameEndsWith(String iqnNameEndsWith) {
    this.iqnNameEndsWith = iqnNameEndsWith;
  }


  public IscsiTargetWhereInput iqnNameGt(String iqnNameGt) {
    
    this.iqnNameGt = iqnNameGt;
    return this;
  }

   /**
   * Get iqnNameGt
   * @return iqnNameGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIqnNameGt() {
    return iqnNameGt;
  }


  public void setIqnNameGt(String iqnNameGt) {
    this.iqnNameGt = iqnNameGt;
  }


  public IscsiTargetWhereInput iqnNameGte(String iqnNameGte) {
    
    this.iqnNameGte = iqnNameGte;
    return this;
  }

   /**
   * Get iqnNameGte
   * @return iqnNameGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIqnNameGte() {
    return iqnNameGte;
  }


  public void setIqnNameGte(String iqnNameGte) {
    this.iqnNameGte = iqnNameGte;
  }


  public IscsiTargetWhereInput iqnNameIn(List<String> iqnNameIn) {
    
    this.iqnNameIn = iqnNameIn;
    return this;
  }

  public IscsiTargetWhereInput addIqnNameInItem(String iqnNameInItem) {
    if (this.iqnNameIn == null) {
      this.iqnNameIn = new ArrayList<String>();
    }
    this.iqnNameIn.add(iqnNameInItem);
    return this;
  }

   /**
   * Get iqnNameIn
   * @return iqnNameIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getIqnNameIn() {
    return iqnNameIn;
  }


  public void setIqnNameIn(List<String> iqnNameIn) {
    this.iqnNameIn = iqnNameIn;
  }


  public IscsiTargetWhereInput iqnNameLt(String iqnNameLt) {
    
    this.iqnNameLt = iqnNameLt;
    return this;
  }

   /**
   * Get iqnNameLt
   * @return iqnNameLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIqnNameLt() {
    return iqnNameLt;
  }


  public void setIqnNameLt(String iqnNameLt) {
    this.iqnNameLt = iqnNameLt;
  }


  public IscsiTargetWhereInput iqnNameLte(String iqnNameLte) {
    
    this.iqnNameLte = iqnNameLte;
    return this;
  }

   /**
   * Get iqnNameLte
   * @return iqnNameLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIqnNameLte() {
    return iqnNameLte;
  }


  public void setIqnNameLte(String iqnNameLte) {
    this.iqnNameLte = iqnNameLte;
  }


  public IscsiTargetWhereInput iqnNameNot(String iqnNameNot) {
    
    this.iqnNameNot = iqnNameNot;
    return this;
  }

   /**
   * Get iqnNameNot
   * @return iqnNameNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIqnNameNot() {
    return iqnNameNot;
  }


  public void setIqnNameNot(String iqnNameNot) {
    this.iqnNameNot = iqnNameNot;
  }


  public IscsiTargetWhereInput iqnNameNotContains(String iqnNameNotContains) {
    
    this.iqnNameNotContains = iqnNameNotContains;
    return this;
  }

   /**
   * Get iqnNameNotContains
   * @return iqnNameNotContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIqnNameNotContains() {
    return iqnNameNotContains;
  }


  public void setIqnNameNotContains(String iqnNameNotContains) {
    this.iqnNameNotContains = iqnNameNotContains;
  }


  public IscsiTargetWhereInput iqnNameNotEndsWith(String iqnNameNotEndsWith) {
    
    this.iqnNameNotEndsWith = iqnNameNotEndsWith;
    return this;
  }

   /**
   * Get iqnNameNotEndsWith
   * @return iqnNameNotEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIqnNameNotEndsWith() {
    return iqnNameNotEndsWith;
  }


  public void setIqnNameNotEndsWith(String iqnNameNotEndsWith) {
    this.iqnNameNotEndsWith = iqnNameNotEndsWith;
  }


  public IscsiTargetWhereInput iqnNameNotIn(List<String> iqnNameNotIn) {
    
    this.iqnNameNotIn = iqnNameNotIn;
    return this;
  }

  public IscsiTargetWhereInput addIqnNameNotInItem(String iqnNameNotInItem) {
    if (this.iqnNameNotIn == null) {
      this.iqnNameNotIn = new ArrayList<String>();
    }
    this.iqnNameNotIn.add(iqnNameNotInItem);
    return this;
  }

   /**
   * Get iqnNameNotIn
   * @return iqnNameNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getIqnNameNotIn() {
    return iqnNameNotIn;
  }


  public void setIqnNameNotIn(List<String> iqnNameNotIn) {
    this.iqnNameNotIn = iqnNameNotIn;
  }


  public IscsiTargetWhereInput iqnNameNotStartsWith(String iqnNameNotStartsWith) {
    
    this.iqnNameNotStartsWith = iqnNameNotStartsWith;
    return this;
  }

   /**
   * Get iqnNameNotStartsWith
   * @return iqnNameNotStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIqnNameNotStartsWith() {
    return iqnNameNotStartsWith;
  }


  public void setIqnNameNotStartsWith(String iqnNameNotStartsWith) {
    this.iqnNameNotStartsWith = iqnNameNotStartsWith;
  }


  public IscsiTargetWhereInput iqnNameStartsWith(String iqnNameStartsWith) {
    
    this.iqnNameStartsWith = iqnNameStartsWith;
    return this;
  }

   /**
   * Get iqnNameStartsWith
   * @return iqnNameStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIqnNameStartsWith() {
    return iqnNameStartsWith;
  }


  public void setIqnNameStartsWith(String iqnNameStartsWith) {
    this.iqnNameStartsWith = iqnNameStartsWith;
  }


  public IscsiTargetWhereInput iqnWhitelist(String iqnWhitelist) {
    
    this.iqnWhitelist = iqnWhitelist;
    return this;
  }

   /**
   * Get iqnWhitelist
   * @return iqnWhitelist
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIqnWhitelist() {
    return iqnWhitelist;
  }


  public void setIqnWhitelist(String iqnWhitelist) {
    this.iqnWhitelist = iqnWhitelist;
  }


  public IscsiTargetWhereInput iqnWhitelistContains(String iqnWhitelistContains) {
    
    this.iqnWhitelistContains = iqnWhitelistContains;
    return this;
  }

   /**
   * Get iqnWhitelistContains
   * @return iqnWhitelistContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIqnWhitelistContains() {
    return iqnWhitelistContains;
  }


  public void setIqnWhitelistContains(String iqnWhitelistContains) {
    this.iqnWhitelistContains = iqnWhitelistContains;
  }


  public IscsiTargetWhereInput iqnWhitelistEndsWith(String iqnWhitelistEndsWith) {
    
    this.iqnWhitelistEndsWith = iqnWhitelistEndsWith;
    return this;
  }

   /**
   * Get iqnWhitelistEndsWith
   * @return iqnWhitelistEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIqnWhitelistEndsWith() {
    return iqnWhitelistEndsWith;
  }


  public void setIqnWhitelistEndsWith(String iqnWhitelistEndsWith) {
    this.iqnWhitelistEndsWith = iqnWhitelistEndsWith;
  }


  public IscsiTargetWhereInput iqnWhitelistGt(String iqnWhitelistGt) {
    
    this.iqnWhitelistGt = iqnWhitelistGt;
    return this;
  }

   /**
   * Get iqnWhitelistGt
   * @return iqnWhitelistGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIqnWhitelistGt() {
    return iqnWhitelistGt;
  }


  public void setIqnWhitelistGt(String iqnWhitelistGt) {
    this.iqnWhitelistGt = iqnWhitelistGt;
  }


  public IscsiTargetWhereInput iqnWhitelistGte(String iqnWhitelistGte) {
    
    this.iqnWhitelistGte = iqnWhitelistGte;
    return this;
  }

   /**
   * Get iqnWhitelistGte
   * @return iqnWhitelistGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIqnWhitelistGte() {
    return iqnWhitelistGte;
  }


  public void setIqnWhitelistGte(String iqnWhitelistGte) {
    this.iqnWhitelistGte = iqnWhitelistGte;
  }


  public IscsiTargetWhereInput iqnWhitelistIn(List<String> iqnWhitelistIn) {
    
    this.iqnWhitelistIn = iqnWhitelistIn;
    return this;
  }

  public IscsiTargetWhereInput addIqnWhitelistInItem(String iqnWhitelistInItem) {
    if (this.iqnWhitelistIn == null) {
      this.iqnWhitelistIn = new ArrayList<String>();
    }
    this.iqnWhitelistIn.add(iqnWhitelistInItem);
    return this;
  }

   /**
   * Get iqnWhitelistIn
   * @return iqnWhitelistIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getIqnWhitelistIn() {
    return iqnWhitelistIn;
  }


  public void setIqnWhitelistIn(List<String> iqnWhitelistIn) {
    this.iqnWhitelistIn = iqnWhitelistIn;
  }


  public IscsiTargetWhereInput iqnWhitelistLt(String iqnWhitelistLt) {
    
    this.iqnWhitelistLt = iqnWhitelistLt;
    return this;
  }

   /**
   * Get iqnWhitelistLt
   * @return iqnWhitelistLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIqnWhitelistLt() {
    return iqnWhitelistLt;
  }


  public void setIqnWhitelistLt(String iqnWhitelistLt) {
    this.iqnWhitelistLt = iqnWhitelistLt;
  }


  public IscsiTargetWhereInput iqnWhitelistLte(String iqnWhitelistLte) {
    
    this.iqnWhitelistLte = iqnWhitelistLte;
    return this;
  }

   /**
   * Get iqnWhitelistLte
   * @return iqnWhitelistLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIqnWhitelistLte() {
    return iqnWhitelistLte;
  }


  public void setIqnWhitelistLte(String iqnWhitelistLte) {
    this.iqnWhitelistLte = iqnWhitelistLte;
  }


  public IscsiTargetWhereInput iqnWhitelistNot(String iqnWhitelistNot) {
    
    this.iqnWhitelistNot = iqnWhitelistNot;
    return this;
  }

   /**
   * Get iqnWhitelistNot
   * @return iqnWhitelistNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIqnWhitelistNot() {
    return iqnWhitelistNot;
  }


  public void setIqnWhitelistNot(String iqnWhitelistNot) {
    this.iqnWhitelistNot = iqnWhitelistNot;
  }


  public IscsiTargetWhereInput iqnWhitelistNotContains(String iqnWhitelistNotContains) {
    
    this.iqnWhitelistNotContains = iqnWhitelistNotContains;
    return this;
  }

   /**
   * Get iqnWhitelistNotContains
   * @return iqnWhitelistNotContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIqnWhitelistNotContains() {
    return iqnWhitelistNotContains;
  }


  public void setIqnWhitelistNotContains(String iqnWhitelistNotContains) {
    this.iqnWhitelistNotContains = iqnWhitelistNotContains;
  }


  public IscsiTargetWhereInput iqnWhitelistNotEndsWith(String iqnWhitelistNotEndsWith) {
    
    this.iqnWhitelistNotEndsWith = iqnWhitelistNotEndsWith;
    return this;
  }

   /**
   * Get iqnWhitelistNotEndsWith
   * @return iqnWhitelistNotEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIqnWhitelistNotEndsWith() {
    return iqnWhitelistNotEndsWith;
  }


  public void setIqnWhitelistNotEndsWith(String iqnWhitelistNotEndsWith) {
    this.iqnWhitelistNotEndsWith = iqnWhitelistNotEndsWith;
  }


  public IscsiTargetWhereInput iqnWhitelistNotIn(List<String> iqnWhitelistNotIn) {
    
    this.iqnWhitelistNotIn = iqnWhitelistNotIn;
    return this;
  }

  public IscsiTargetWhereInput addIqnWhitelistNotInItem(String iqnWhitelistNotInItem) {
    if (this.iqnWhitelistNotIn == null) {
      this.iqnWhitelistNotIn = new ArrayList<String>();
    }
    this.iqnWhitelistNotIn.add(iqnWhitelistNotInItem);
    return this;
  }

   /**
   * Get iqnWhitelistNotIn
   * @return iqnWhitelistNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getIqnWhitelistNotIn() {
    return iqnWhitelistNotIn;
  }


  public void setIqnWhitelistNotIn(List<String> iqnWhitelistNotIn) {
    this.iqnWhitelistNotIn = iqnWhitelistNotIn;
  }


  public IscsiTargetWhereInput iqnWhitelistNotStartsWith(String iqnWhitelistNotStartsWith) {
    
    this.iqnWhitelistNotStartsWith = iqnWhitelistNotStartsWith;
    return this;
  }

   /**
   * Get iqnWhitelistNotStartsWith
   * @return iqnWhitelistNotStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIqnWhitelistNotStartsWith() {
    return iqnWhitelistNotStartsWith;
  }


  public void setIqnWhitelistNotStartsWith(String iqnWhitelistNotStartsWith) {
    this.iqnWhitelistNotStartsWith = iqnWhitelistNotStartsWith;
  }


  public IscsiTargetWhereInput iqnWhitelistStartsWith(String iqnWhitelistStartsWith) {
    
    this.iqnWhitelistStartsWith = iqnWhitelistStartsWith;
    return this;
  }

   /**
   * Get iqnWhitelistStartsWith
   * @return iqnWhitelistStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIqnWhitelistStartsWith() {
    return iqnWhitelistStartsWith;
  }


  public void setIqnWhitelistStartsWith(String iqnWhitelistStartsWith) {
    this.iqnWhitelistStartsWith = iqnWhitelistStartsWith;
  }


  public IscsiTargetWhereInput labelsEvery(LabelWhereInput labelsEvery) {
    
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


  public IscsiTargetWhereInput labelsNone(LabelWhereInput labelsNone) {
    
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


  public IscsiTargetWhereInput labelsSome(LabelWhereInput labelsSome) {
    
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


  public IscsiTargetWhereInput localId(String localId) {
    
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


  public IscsiTargetWhereInput localIdContains(String localIdContains) {
    
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


  public IscsiTargetWhereInput localIdEndsWith(String localIdEndsWith) {
    
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


  public IscsiTargetWhereInput localIdGt(String localIdGt) {
    
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


  public IscsiTargetWhereInput localIdGte(String localIdGte) {
    
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


  public IscsiTargetWhereInput localIdIn(List<String> localIdIn) {
    
    this.localIdIn = localIdIn;
    return this;
  }

  public IscsiTargetWhereInput addLocalIdInItem(String localIdInItem) {
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


  public IscsiTargetWhereInput localIdLt(String localIdLt) {
    
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


  public IscsiTargetWhereInput localIdLte(String localIdLte) {
    
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


  public IscsiTargetWhereInput localIdNot(String localIdNot) {
    
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


  public IscsiTargetWhereInput localIdNotContains(String localIdNotContains) {
    
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


  public IscsiTargetWhereInput localIdNotEndsWith(String localIdNotEndsWith) {
    
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


  public IscsiTargetWhereInput localIdNotIn(List<String> localIdNotIn) {
    
    this.localIdNotIn = localIdNotIn;
    return this;
  }

  public IscsiTargetWhereInput addLocalIdNotInItem(String localIdNotInItem) {
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


  public IscsiTargetWhereInput localIdNotStartsWith(String localIdNotStartsWith) {
    
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


  public IscsiTargetWhereInput localIdStartsWith(String localIdStartsWith) {
    
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


  public IscsiTargetWhereInput lunsEvery(IscsiLunWhereInput lunsEvery) {
    
    this.lunsEvery = lunsEvery;
    return this;
  }

   /**
   * Get lunsEvery
   * @return lunsEvery
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public IscsiLunWhereInput getLunsEvery() {
    return lunsEvery;
  }


  public void setLunsEvery(IscsiLunWhereInput lunsEvery) {
    this.lunsEvery = lunsEvery;
  }


  public IscsiTargetWhereInput lunsNone(IscsiLunWhereInput lunsNone) {
    
    this.lunsNone = lunsNone;
    return this;
  }

   /**
   * Get lunsNone
   * @return lunsNone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public IscsiLunWhereInput getLunsNone() {
    return lunsNone;
  }


  public void setLunsNone(IscsiLunWhereInput lunsNone) {
    this.lunsNone = lunsNone;
  }


  public IscsiTargetWhereInput lunsSome(IscsiLunWhereInput lunsSome) {
    
    this.lunsSome = lunsSome;
    return this;
  }

   /**
   * Get lunsSome
   * @return lunsSome
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public IscsiLunWhereInput getLunsSome() {
    return lunsSome;
  }


  public void setLunsSome(IscsiLunWhereInput lunsSome) {
    this.lunsSome = lunsSome;
  }


  public IscsiTargetWhereInput name(String name) {
    
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


  public IscsiTargetWhereInput nameContains(String nameContains) {
    
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


  public IscsiTargetWhereInput nameEndsWith(String nameEndsWith) {
    
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


  public IscsiTargetWhereInput nameGt(String nameGt) {
    
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


  public IscsiTargetWhereInput nameGte(String nameGte) {
    
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


  public IscsiTargetWhereInput nameIn(List<String> nameIn) {
    
    this.nameIn = nameIn;
    return this;
  }

  public IscsiTargetWhereInput addNameInItem(String nameInItem) {
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


  public IscsiTargetWhereInput nameLt(String nameLt) {
    
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


  public IscsiTargetWhereInput nameLte(String nameLte) {
    
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


  public IscsiTargetWhereInput nameNot(String nameNot) {
    
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


  public IscsiTargetWhereInput nameNotContains(String nameNotContains) {
    
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


  public IscsiTargetWhereInput nameNotEndsWith(String nameNotEndsWith) {
    
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


  public IscsiTargetWhereInput nameNotIn(List<String> nameNotIn) {
    
    this.nameNotIn = nameNotIn;
    return this;
  }

  public IscsiTargetWhereInput addNameNotInItem(String nameNotInItem) {
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


  public IscsiTargetWhereInput nameNotStartsWith(String nameNotStartsWith) {
    
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


  public IscsiTargetWhereInput nameStartsWith(String nameStartsWith) {
    
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


  public IscsiTargetWhereInput replicaNum(Integer replicaNum) {
    
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


  public IscsiTargetWhereInput replicaNumGt(Integer replicaNumGt) {
    
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


  public IscsiTargetWhereInput replicaNumGte(Integer replicaNumGte) {
    
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


  public IscsiTargetWhereInput replicaNumIn(List<Integer> replicaNumIn) {
    
    this.replicaNumIn = replicaNumIn;
    return this;
  }

  public IscsiTargetWhereInput addReplicaNumInItem(Integer replicaNumInItem) {
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


  public IscsiTargetWhereInput replicaNumLt(Integer replicaNumLt) {
    
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


  public IscsiTargetWhereInput replicaNumLte(Integer replicaNumLte) {
    
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


  public IscsiTargetWhereInput replicaNumNot(Integer replicaNumNot) {
    
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


  public IscsiTargetWhereInput replicaNumNotIn(List<Integer> replicaNumNotIn) {
    
    this.replicaNumNotIn = replicaNumNotIn;
    return this;
  }

  public IscsiTargetWhereInput addReplicaNumNotInItem(Integer replicaNumNotInItem) {
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


  public IscsiTargetWhereInput stripeNum(Integer stripeNum) {
    
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


  public IscsiTargetWhereInput stripeNumGt(Integer stripeNumGt) {
    
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


  public IscsiTargetWhereInput stripeNumGte(Integer stripeNumGte) {
    
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


  public IscsiTargetWhereInput stripeNumIn(List<Integer> stripeNumIn) {
    
    this.stripeNumIn = stripeNumIn;
    return this;
  }

  public IscsiTargetWhereInput addStripeNumInItem(Integer stripeNumInItem) {
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


  public IscsiTargetWhereInput stripeNumLt(Integer stripeNumLt) {
    
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


  public IscsiTargetWhereInput stripeNumLte(Integer stripeNumLte) {
    
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


  public IscsiTargetWhereInput stripeNumNot(Integer stripeNumNot) {
    
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


  public IscsiTargetWhereInput stripeNumNotIn(List<Integer> stripeNumNotIn) {
    
    this.stripeNumNotIn = stripeNumNotIn;
    return this;
  }

  public IscsiTargetWhereInput addStripeNumNotInItem(Integer stripeNumNotInItem) {
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


  public IscsiTargetWhereInput stripeSize(Long stripeSize) {
    
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


  public IscsiTargetWhereInput stripeSizeGt(Long stripeSizeGt) {
    
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


  public IscsiTargetWhereInput stripeSizeGte(Long stripeSizeGte) {
    
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


  public IscsiTargetWhereInput stripeSizeIn(List<Long> stripeSizeIn) {
    
    this.stripeSizeIn = stripeSizeIn;
    return this;
  }

  public IscsiTargetWhereInput addStripeSizeInItem(Long stripeSizeInItem) {
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


  public IscsiTargetWhereInput stripeSizeLt(Long stripeSizeLt) {
    
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


  public IscsiTargetWhereInput stripeSizeLte(Long stripeSizeLte) {
    
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


  public IscsiTargetWhereInput stripeSizeNot(Long stripeSizeNot) {
    
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


  public IscsiTargetWhereInput stripeSizeNotIn(List<Long> stripeSizeNotIn) {
    
    this.stripeSizeNotIn = stripeSizeNotIn;
    return this;
  }

  public IscsiTargetWhereInput addStripeSizeNotInItem(Long stripeSizeNotInItem) {
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


  public IscsiTargetWhereInput thinProvision(Boolean thinProvision) {
    
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


  public IscsiTargetWhereInput thinProvisionNot(Boolean thinProvisionNot) {
    
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IscsiTargetWhereInput iscsiTargetWhereInput = (IscsiTargetWhereInput) o;
    return Objects.equals(this.AND, iscsiTargetWhereInput.AND) &&
        Objects.equals(this.NOT, iscsiTargetWhereInput.NOT) &&
        Objects.equals(this.OR, iscsiTargetWhereInput.OR) &&
        Objects.equals(this.bps, iscsiTargetWhereInput.bps) &&
        Objects.equals(this.bpsGt, iscsiTargetWhereInput.bpsGt) &&
        Objects.equals(this.bpsGte, iscsiTargetWhereInput.bpsGte) &&
        Objects.equals(this.bpsIn, iscsiTargetWhereInput.bpsIn) &&
        Objects.equals(this.bpsLt, iscsiTargetWhereInput.bpsLt) &&
        Objects.equals(this.bpsLte, iscsiTargetWhereInput.bpsLte) &&
        Objects.equals(this.bpsMax, iscsiTargetWhereInput.bpsMax) &&
        Objects.equals(this.bpsMaxGt, iscsiTargetWhereInput.bpsMaxGt) &&
        Objects.equals(this.bpsMaxGte, iscsiTargetWhereInput.bpsMaxGte) &&
        Objects.equals(this.bpsMaxIn, iscsiTargetWhereInput.bpsMaxIn) &&
        Objects.equals(this.bpsMaxLength, iscsiTargetWhereInput.bpsMaxLength) &&
        Objects.equals(this.bpsMaxLengthGt, iscsiTargetWhereInput.bpsMaxLengthGt) &&
        Objects.equals(this.bpsMaxLengthGte, iscsiTargetWhereInput.bpsMaxLengthGte) &&
        Objects.equals(this.bpsMaxLengthIn, iscsiTargetWhereInput.bpsMaxLengthIn) &&
        Objects.equals(this.bpsMaxLengthLt, iscsiTargetWhereInput.bpsMaxLengthLt) &&
        Objects.equals(this.bpsMaxLengthLte, iscsiTargetWhereInput.bpsMaxLengthLte) &&
        Objects.equals(this.bpsMaxLengthNot, iscsiTargetWhereInput.bpsMaxLengthNot) &&
        Objects.equals(this.bpsMaxLengthNotIn, iscsiTargetWhereInput.bpsMaxLengthNotIn) &&
        Objects.equals(this.bpsMaxLt, iscsiTargetWhereInput.bpsMaxLt) &&
        Objects.equals(this.bpsMaxLte, iscsiTargetWhereInput.bpsMaxLte) &&
        Objects.equals(this.bpsMaxNot, iscsiTargetWhereInput.bpsMaxNot) &&
        Objects.equals(this.bpsMaxNotIn, iscsiTargetWhereInput.bpsMaxNotIn) &&
        Objects.equals(this.bpsNot, iscsiTargetWhereInput.bpsNot) &&
        Objects.equals(this.bpsNotIn, iscsiTargetWhereInput.bpsNotIn) &&
        Objects.equals(this.bpsRd, iscsiTargetWhereInput.bpsRd) &&
        Objects.equals(this.bpsRdGt, iscsiTargetWhereInput.bpsRdGt) &&
        Objects.equals(this.bpsRdGte, iscsiTargetWhereInput.bpsRdGte) &&
        Objects.equals(this.bpsRdIn, iscsiTargetWhereInput.bpsRdIn) &&
        Objects.equals(this.bpsRdLt, iscsiTargetWhereInput.bpsRdLt) &&
        Objects.equals(this.bpsRdLte, iscsiTargetWhereInput.bpsRdLte) &&
        Objects.equals(this.bpsRdMax, iscsiTargetWhereInput.bpsRdMax) &&
        Objects.equals(this.bpsRdMaxGt, iscsiTargetWhereInput.bpsRdMaxGt) &&
        Objects.equals(this.bpsRdMaxGte, iscsiTargetWhereInput.bpsRdMaxGte) &&
        Objects.equals(this.bpsRdMaxIn, iscsiTargetWhereInput.bpsRdMaxIn) &&
        Objects.equals(this.bpsRdMaxLength, iscsiTargetWhereInput.bpsRdMaxLength) &&
        Objects.equals(this.bpsRdMaxLengthGt, iscsiTargetWhereInput.bpsRdMaxLengthGt) &&
        Objects.equals(this.bpsRdMaxLengthGte, iscsiTargetWhereInput.bpsRdMaxLengthGte) &&
        Objects.equals(this.bpsRdMaxLengthIn, iscsiTargetWhereInput.bpsRdMaxLengthIn) &&
        Objects.equals(this.bpsRdMaxLengthLt, iscsiTargetWhereInput.bpsRdMaxLengthLt) &&
        Objects.equals(this.bpsRdMaxLengthLte, iscsiTargetWhereInput.bpsRdMaxLengthLte) &&
        Objects.equals(this.bpsRdMaxLengthNot, iscsiTargetWhereInput.bpsRdMaxLengthNot) &&
        Objects.equals(this.bpsRdMaxLengthNotIn, iscsiTargetWhereInput.bpsRdMaxLengthNotIn) &&
        Objects.equals(this.bpsRdMaxLt, iscsiTargetWhereInput.bpsRdMaxLt) &&
        Objects.equals(this.bpsRdMaxLte, iscsiTargetWhereInput.bpsRdMaxLte) &&
        Objects.equals(this.bpsRdMaxNot, iscsiTargetWhereInput.bpsRdMaxNot) &&
        Objects.equals(this.bpsRdMaxNotIn, iscsiTargetWhereInput.bpsRdMaxNotIn) &&
        Objects.equals(this.bpsRdNot, iscsiTargetWhereInput.bpsRdNot) &&
        Objects.equals(this.bpsRdNotIn, iscsiTargetWhereInput.bpsRdNotIn) &&
        Objects.equals(this.bpsWr, iscsiTargetWhereInput.bpsWr) &&
        Objects.equals(this.bpsWrGt, iscsiTargetWhereInput.bpsWrGt) &&
        Objects.equals(this.bpsWrGte, iscsiTargetWhereInput.bpsWrGte) &&
        Objects.equals(this.bpsWrIn, iscsiTargetWhereInput.bpsWrIn) &&
        Objects.equals(this.bpsWrLt, iscsiTargetWhereInput.bpsWrLt) &&
        Objects.equals(this.bpsWrLte, iscsiTargetWhereInput.bpsWrLte) &&
        Objects.equals(this.bpsWrMax, iscsiTargetWhereInput.bpsWrMax) &&
        Objects.equals(this.bpsWrMaxGt, iscsiTargetWhereInput.bpsWrMaxGt) &&
        Objects.equals(this.bpsWrMaxGte, iscsiTargetWhereInput.bpsWrMaxGte) &&
        Objects.equals(this.bpsWrMaxIn, iscsiTargetWhereInput.bpsWrMaxIn) &&
        Objects.equals(this.bpsWrMaxLength, iscsiTargetWhereInput.bpsWrMaxLength) &&
        Objects.equals(this.bpsWrMaxLengthGt, iscsiTargetWhereInput.bpsWrMaxLengthGt) &&
        Objects.equals(this.bpsWrMaxLengthGte, iscsiTargetWhereInput.bpsWrMaxLengthGte) &&
        Objects.equals(this.bpsWrMaxLengthIn, iscsiTargetWhereInput.bpsWrMaxLengthIn) &&
        Objects.equals(this.bpsWrMaxLengthLt, iscsiTargetWhereInput.bpsWrMaxLengthLt) &&
        Objects.equals(this.bpsWrMaxLengthLte, iscsiTargetWhereInput.bpsWrMaxLengthLte) &&
        Objects.equals(this.bpsWrMaxLengthNot, iscsiTargetWhereInput.bpsWrMaxLengthNot) &&
        Objects.equals(this.bpsWrMaxLengthNotIn, iscsiTargetWhereInput.bpsWrMaxLengthNotIn) &&
        Objects.equals(this.bpsWrMaxLt, iscsiTargetWhereInput.bpsWrMaxLt) &&
        Objects.equals(this.bpsWrMaxLte, iscsiTargetWhereInput.bpsWrMaxLte) &&
        Objects.equals(this.bpsWrMaxNot, iscsiTargetWhereInput.bpsWrMaxNot) &&
        Objects.equals(this.bpsWrMaxNotIn, iscsiTargetWhereInput.bpsWrMaxNotIn) &&
        Objects.equals(this.bpsWrNot, iscsiTargetWhereInput.bpsWrNot) &&
        Objects.equals(this.bpsWrNotIn, iscsiTargetWhereInput.bpsWrNotIn) &&
        Objects.equals(this.chapEnabled, iscsiTargetWhereInput.chapEnabled) &&
        Objects.equals(this.chapEnabledNot, iscsiTargetWhereInput.chapEnabledNot) &&
        Objects.equals(this.chapName, iscsiTargetWhereInput.chapName) &&
        Objects.equals(this.chapNameContains, iscsiTargetWhereInput.chapNameContains) &&
        Objects.equals(this.chapNameEndsWith, iscsiTargetWhereInput.chapNameEndsWith) &&
        Objects.equals(this.chapNameGt, iscsiTargetWhereInput.chapNameGt) &&
        Objects.equals(this.chapNameGte, iscsiTargetWhereInput.chapNameGte) &&
        Objects.equals(this.chapNameIn, iscsiTargetWhereInput.chapNameIn) &&
        Objects.equals(this.chapNameLt, iscsiTargetWhereInput.chapNameLt) &&
        Objects.equals(this.chapNameLte, iscsiTargetWhereInput.chapNameLte) &&
        Objects.equals(this.chapNameNot, iscsiTargetWhereInput.chapNameNot) &&
        Objects.equals(this.chapNameNotContains, iscsiTargetWhereInput.chapNameNotContains) &&
        Objects.equals(this.chapNameNotEndsWith, iscsiTargetWhereInput.chapNameNotEndsWith) &&
        Objects.equals(this.chapNameNotIn, iscsiTargetWhereInput.chapNameNotIn) &&
        Objects.equals(this.chapNameNotStartsWith, iscsiTargetWhereInput.chapNameNotStartsWith) &&
        Objects.equals(this.chapNameStartsWith, iscsiTargetWhereInput.chapNameStartsWith) &&
        Objects.equals(this.chapSecret, iscsiTargetWhereInput.chapSecret) &&
        Objects.equals(this.chapSecretContains, iscsiTargetWhereInput.chapSecretContains) &&
        Objects.equals(this.chapSecretEndsWith, iscsiTargetWhereInput.chapSecretEndsWith) &&
        Objects.equals(this.chapSecretGt, iscsiTargetWhereInput.chapSecretGt) &&
        Objects.equals(this.chapSecretGte, iscsiTargetWhereInput.chapSecretGte) &&
        Objects.equals(this.chapSecretIn, iscsiTargetWhereInput.chapSecretIn) &&
        Objects.equals(this.chapSecretLt, iscsiTargetWhereInput.chapSecretLt) &&
        Objects.equals(this.chapSecretLte, iscsiTargetWhereInput.chapSecretLte) &&
        Objects.equals(this.chapSecretNot, iscsiTargetWhereInput.chapSecretNot) &&
        Objects.equals(this.chapSecretNotContains, iscsiTargetWhereInput.chapSecretNotContains) &&
        Objects.equals(this.chapSecretNotEndsWith, iscsiTargetWhereInput.chapSecretNotEndsWith) &&
        Objects.equals(this.chapSecretNotIn, iscsiTargetWhereInput.chapSecretNotIn) &&
        Objects.equals(this.chapSecretNotStartsWith, iscsiTargetWhereInput.chapSecretNotStartsWith) &&
        Objects.equals(this.chapSecretStartsWith, iscsiTargetWhereInput.chapSecretStartsWith) &&
        Objects.equals(this.cluster, iscsiTargetWhereInput.cluster) &&
        Objects.equals(this.description, iscsiTargetWhereInput.description) &&
        Objects.equals(this.descriptionContains, iscsiTargetWhereInput.descriptionContains) &&
        Objects.equals(this.descriptionEndsWith, iscsiTargetWhereInput.descriptionEndsWith) &&
        Objects.equals(this.descriptionGt, iscsiTargetWhereInput.descriptionGt) &&
        Objects.equals(this.descriptionGte, iscsiTargetWhereInput.descriptionGte) &&
        Objects.equals(this.descriptionIn, iscsiTargetWhereInput.descriptionIn) &&
        Objects.equals(this.descriptionLt, iscsiTargetWhereInput.descriptionLt) &&
        Objects.equals(this.descriptionLte, iscsiTargetWhereInput.descriptionLte) &&
        Objects.equals(this.descriptionNot, iscsiTargetWhereInput.descriptionNot) &&
        Objects.equals(this.descriptionNotContains, iscsiTargetWhereInput.descriptionNotContains) &&
        Objects.equals(this.descriptionNotEndsWith, iscsiTargetWhereInput.descriptionNotEndsWith) &&
        Objects.equals(this.descriptionNotIn, iscsiTargetWhereInput.descriptionNotIn) &&
        Objects.equals(this.descriptionNotStartsWith, iscsiTargetWhereInput.descriptionNotStartsWith) &&
        Objects.equals(this.descriptionStartsWith, iscsiTargetWhereInput.descriptionStartsWith) &&
        Objects.equals(this.entityAsyncStatus, iscsiTargetWhereInput.entityAsyncStatus) &&
        Objects.equals(this.entityAsyncStatusIn, iscsiTargetWhereInput.entityAsyncStatusIn) &&
        Objects.equals(this.entityAsyncStatusNot, iscsiTargetWhereInput.entityAsyncStatusNot) &&
        Objects.equals(this.entityAsyncStatusNotIn, iscsiTargetWhereInput.entityAsyncStatusNotIn) &&
        Objects.equals(this.externalUse, iscsiTargetWhereInput.externalUse) &&
        Objects.equals(this.externalUseNot, iscsiTargetWhereInput.externalUseNot) &&
        Objects.equals(this.id, iscsiTargetWhereInput.id) &&
        Objects.equals(this.idContains, iscsiTargetWhereInput.idContains) &&
        Objects.equals(this.idEndsWith, iscsiTargetWhereInput.idEndsWith) &&
        Objects.equals(this.idGt, iscsiTargetWhereInput.idGt) &&
        Objects.equals(this.idGte, iscsiTargetWhereInput.idGte) &&
        Objects.equals(this.idIn, iscsiTargetWhereInput.idIn) &&
        Objects.equals(this.idLt, iscsiTargetWhereInput.idLt) &&
        Objects.equals(this.idLte, iscsiTargetWhereInput.idLte) &&
        Objects.equals(this.idNot, iscsiTargetWhereInput.idNot) &&
        Objects.equals(this.idNotContains, iscsiTargetWhereInput.idNotContains) &&
        Objects.equals(this.idNotEndsWith, iscsiTargetWhereInput.idNotEndsWith) &&
        Objects.equals(this.idNotIn, iscsiTargetWhereInput.idNotIn) &&
        Objects.equals(this.idNotStartsWith, iscsiTargetWhereInput.idNotStartsWith) &&
        Objects.equals(this.idStartsWith, iscsiTargetWhereInput.idStartsWith) &&
        Objects.equals(this.internal, iscsiTargetWhereInput.internal) &&
        Objects.equals(this.internalNot, iscsiTargetWhereInput.internalNot) &&
        Objects.equals(this.ioSize, iscsiTargetWhereInput.ioSize) &&
        Objects.equals(this.ioSizeGt, iscsiTargetWhereInput.ioSizeGt) &&
        Objects.equals(this.ioSizeGte, iscsiTargetWhereInput.ioSizeGte) &&
        Objects.equals(this.ioSizeIn, iscsiTargetWhereInput.ioSizeIn) &&
        Objects.equals(this.ioSizeLt, iscsiTargetWhereInput.ioSizeLt) &&
        Objects.equals(this.ioSizeLte, iscsiTargetWhereInput.ioSizeLte) &&
        Objects.equals(this.ioSizeNot, iscsiTargetWhereInput.ioSizeNot) &&
        Objects.equals(this.ioSizeNotIn, iscsiTargetWhereInput.ioSizeNotIn) &&
        Objects.equals(this.iops, iscsiTargetWhereInput.iops) &&
        Objects.equals(this.iopsGt, iscsiTargetWhereInput.iopsGt) &&
        Objects.equals(this.iopsGte, iscsiTargetWhereInput.iopsGte) &&
        Objects.equals(this.iopsIn, iscsiTargetWhereInput.iopsIn) &&
        Objects.equals(this.iopsLt, iscsiTargetWhereInput.iopsLt) &&
        Objects.equals(this.iopsLte, iscsiTargetWhereInput.iopsLte) &&
        Objects.equals(this.iopsMax, iscsiTargetWhereInput.iopsMax) &&
        Objects.equals(this.iopsMaxGt, iscsiTargetWhereInput.iopsMaxGt) &&
        Objects.equals(this.iopsMaxGte, iscsiTargetWhereInput.iopsMaxGte) &&
        Objects.equals(this.iopsMaxIn, iscsiTargetWhereInput.iopsMaxIn) &&
        Objects.equals(this.iopsMaxLength, iscsiTargetWhereInput.iopsMaxLength) &&
        Objects.equals(this.iopsMaxLengthGt, iscsiTargetWhereInput.iopsMaxLengthGt) &&
        Objects.equals(this.iopsMaxLengthGte, iscsiTargetWhereInput.iopsMaxLengthGte) &&
        Objects.equals(this.iopsMaxLengthIn, iscsiTargetWhereInput.iopsMaxLengthIn) &&
        Objects.equals(this.iopsMaxLengthLt, iscsiTargetWhereInput.iopsMaxLengthLt) &&
        Objects.equals(this.iopsMaxLengthLte, iscsiTargetWhereInput.iopsMaxLengthLte) &&
        Objects.equals(this.iopsMaxLengthNot, iscsiTargetWhereInput.iopsMaxLengthNot) &&
        Objects.equals(this.iopsMaxLengthNotIn, iscsiTargetWhereInput.iopsMaxLengthNotIn) &&
        Objects.equals(this.iopsMaxLt, iscsiTargetWhereInput.iopsMaxLt) &&
        Objects.equals(this.iopsMaxLte, iscsiTargetWhereInput.iopsMaxLte) &&
        Objects.equals(this.iopsMaxNot, iscsiTargetWhereInput.iopsMaxNot) &&
        Objects.equals(this.iopsMaxNotIn, iscsiTargetWhereInput.iopsMaxNotIn) &&
        Objects.equals(this.iopsNot, iscsiTargetWhereInput.iopsNot) &&
        Objects.equals(this.iopsNotIn, iscsiTargetWhereInput.iopsNotIn) &&
        Objects.equals(this.iopsRd, iscsiTargetWhereInput.iopsRd) &&
        Objects.equals(this.iopsRdGt, iscsiTargetWhereInput.iopsRdGt) &&
        Objects.equals(this.iopsRdGte, iscsiTargetWhereInput.iopsRdGte) &&
        Objects.equals(this.iopsRdIn, iscsiTargetWhereInput.iopsRdIn) &&
        Objects.equals(this.iopsRdLt, iscsiTargetWhereInput.iopsRdLt) &&
        Objects.equals(this.iopsRdLte, iscsiTargetWhereInput.iopsRdLte) &&
        Objects.equals(this.iopsRdMax, iscsiTargetWhereInput.iopsRdMax) &&
        Objects.equals(this.iopsRdMaxGt, iscsiTargetWhereInput.iopsRdMaxGt) &&
        Objects.equals(this.iopsRdMaxGte, iscsiTargetWhereInput.iopsRdMaxGte) &&
        Objects.equals(this.iopsRdMaxIn, iscsiTargetWhereInput.iopsRdMaxIn) &&
        Objects.equals(this.iopsRdMaxLength, iscsiTargetWhereInput.iopsRdMaxLength) &&
        Objects.equals(this.iopsRdMaxLengthGt, iscsiTargetWhereInput.iopsRdMaxLengthGt) &&
        Objects.equals(this.iopsRdMaxLengthGte, iscsiTargetWhereInput.iopsRdMaxLengthGte) &&
        Objects.equals(this.iopsRdMaxLengthIn, iscsiTargetWhereInput.iopsRdMaxLengthIn) &&
        Objects.equals(this.iopsRdMaxLengthLt, iscsiTargetWhereInput.iopsRdMaxLengthLt) &&
        Objects.equals(this.iopsRdMaxLengthLte, iscsiTargetWhereInput.iopsRdMaxLengthLte) &&
        Objects.equals(this.iopsRdMaxLengthNot, iscsiTargetWhereInput.iopsRdMaxLengthNot) &&
        Objects.equals(this.iopsRdMaxLengthNotIn, iscsiTargetWhereInput.iopsRdMaxLengthNotIn) &&
        Objects.equals(this.iopsRdMaxLt, iscsiTargetWhereInput.iopsRdMaxLt) &&
        Objects.equals(this.iopsRdMaxLte, iscsiTargetWhereInput.iopsRdMaxLte) &&
        Objects.equals(this.iopsRdMaxNot, iscsiTargetWhereInput.iopsRdMaxNot) &&
        Objects.equals(this.iopsRdMaxNotIn, iscsiTargetWhereInput.iopsRdMaxNotIn) &&
        Objects.equals(this.iopsRdNot, iscsiTargetWhereInput.iopsRdNot) &&
        Objects.equals(this.iopsRdNotIn, iscsiTargetWhereInput.iopsRdNotIn) &&
        Objects.equals(this.iopsWr, iscsiTargetWhereInput.iopsWr) &&
        Objects.equals(this.iopsWrGt, iscsiTargetWhereInput.iopsWrGt) &&
        Objects.equals(this.iopsWrGte, iscsiTargetWhereInput.iopsWrGte) &&
        Objects.equals(this.iopsWrIn, iscsiTargetWhereInput.iopsWrIn) &&
        Objects.equals(this.iopsWrLt, iscsiTargetWhereInput.iopsWrLt) &&
        Objects.equals(this.iopsWrLte, iscsiTargetWhereInput.iopsWrLte) &&
        Objects.equals(this.iopsWrMax, iscsiTargetWhereInput.iopsWrMax) &&
        Objects.equals(this.iopsWrMaxGt, iscsiTargetWhereInput.iopsWrMaxGt) &&
        Objects.equals(this.iopsWrMaxGte, iscsiTargetWhereInput.iopsWrMaxGte) &&
        Objects.equals(this.iopsWrMaxIn, iscsiTargetWhereInput.iopsWrMaxIn) &&
        Objects.equals(this.iopsWrMaxLength, iscsiTargetWhereInput.iopsWrMaxLength) &&
        Objects.equals(this.iopsWrMaxLengthGt, iscsiTargetWhereInput.iopsWrMaxLengthGt) &&
        Objects.equals(this.iopsWrMaxLengthGte, iscsiTargetWhereInput.iopsWrMaxLengthGte) &&
        Objects.equals(this.iopsWrMaxLengthIn, iscsiTargetWhereInput.iopsWrMaxLengthIn) &&
        Objects.equals(this.iopsWrMaxLengthLt, iscsiTargetWhereInput.iopsWrMaxLengthLt) &&
        Objects.equals(this.iopsWrMaxLengthLte, iscsiTargetWhereInput.iopsWrMaxLengthLte) &&
        Objects.equals(this.iopsWrMaxLengthNot, iscsiTargetWhereInput.iopsWrMaxLengthNot) &&
        Objects.equals(this.iopsWrMaxLengthNotIn, iscsiTargetWhereInput.iopsWrMaxLengthNotIn) &&
        Objects.equals(this.iopsWrMaxLt, iscsiTargetWhereInput.iopsWrMaxLt) &&
        Objects.equals(this.iopsWrMaxLte, iscsiTargetWhereInput.iopsWrMaxLte) &&
        Objects.equals(this.iopsWrMaxNot, iscsiTargetWhereInput.iopsWrMaxNot) &&
        Objects.equals(this.iopsWrMaxNotIn, iscsiTargetWhereInput.iopsWrMaxNotIn) &&
        Objects.equals(this.iopsWrNot, iscsiTargetWhereInput.iopsWrNot) &&
        Objects.equals(this.iopsWrNotIn, iscsiTargetWhereInput.iopsWrNotIn) &&
        Objects.equals(this.ipWhitelist, iscsiTargetWhereInput.ipWhitelist) &&
        Objects.equals(this.ipWhitelistContains, iscsiTargetWhereInput.ipWhitelistContains) &&
        Objects.equals(this.ipWhitelistEndsWith, iscsiTargetWhereInput.ipWhitelistEndsWith) &&
        Objects.equals(this.ipWhitelistGt, iscsiTargetWhereInput.ipWhitelistGt) &&
        Objects.equals(this.ipWhitelistGte, iscsiTargetWhereInput.ipWhitelistGte) &&
        Objects.equals(this.ipWhitelistIn, iscsiTargetWhereInput.ipWhitelistIn) &&
        Objects.equals(this.ipWhitelistLt, iscsiTargetWhereInput.ipWhitelistLt) &&
        Objects.equals(this.ipWhitelistLte, iscsiTargetWhereInput.ipWhitelistLte) &&
        Objects.equals(this.ipWhitelistNot, iscsiTargetWhereInput.ipWhitelistNot) &&
        Objects.equals(this.ipWhitelistNotContains, iscsiTargetWhereInput.ipWhitelistNotContains) &&
        Objects.equals(this.ipWhitelistNotEndsWith, iscsiTargetWhereInput.ipWhitelistNotEndsWith) &&
        Objects.equals(this.ipWhitelistNotIn, iscsiTargetWhereInput.ipWhitelistNotIn) &&
        Objects.equals(this.ipWhitelistNotStartsWith, iscsiTargetWhereInput.ipWhitelistNotStartsWith) &&
        Objects.equals(this.ipWhitelistStartsWith, iscsiTargetWhereInput.ipWhitelistStartsWith) &&
        Objects.equals(this.iqnName, iscsiTargetWhereInput.iqnName) &&
        Objects.equals(this.iqnNameContains, iscsiTargetWhereInput.iqnNameContains) &&
        Objects.equals(this.iqnNameEndsWith, iscsiTargetWhereInput.iqnNameEndsWith) &&
        Objects.equals(this.iqnNameGt, iscsiTargetWhereInput.iqnNameGt) &&
        Objects.equals(this.iqnNameGte, iscsiTargetWhereInput.iqnNameGte) &&
        Objects.equals(this.iqnNameIn, iscsiTargetWhereInput.iqnNameIn) &&
        Objects.equals(this.iqnNameLt, iscsiTargetWhereInput.iqnNameLt) &&
        Objects.equals(this.iqnNameLte, iscsiTargetWhereInput.iqnNameLte) &&
        Objects.equals(this.iqnNameNot, iscsiTargetWhereInput.iqnNameNot) &&
        Objects.equals(this.iqnNameNotContains, iscsiTargetWhereInput.iqnNameNotContains) &&
        Objects.equals(this.iqnNameNotEndsWith, iscsiTargetWhereInput.iqnNameNotEndsWith) &&
        Objects.equals(this.iqnNameNotIn, iscsiTargetWhereInput.iqnNameNotIn) &&
        Objects.equals(this.iqnNameNotStartsWith, iscsiTargetWhereInput.iqnNameNotStartsWith) &&
        Objects.equals(this.iqnNameStartsWith, iscsiTargetWhereInput.iqnNameStartsWith) &&
        Objects.equals(this.iqnWhitelist, iscsiTargetWhereInput.iqnWhitelist) &&
        Objects.equals(this.iqnWhitelistContains, iscsiTargetWhereInput.iqnWhitelistContains) &&
        Objects.equals(this.iqnWhitelistEndsWith, iscsiTargetWhereInput.iqnWhitelistEndsWith) &&
        Objects.equals(this.iqnWhitelistGt, iscsiTargetWhereInput.iqnWhitelistGt) &&
        Objects.equals(this.iqnWhitelistGte, iscsiTargetWhereInput.iqnWhitelistGte) &&
        Objects.equals(this.iqnWhitelistIn, iscsiTargetWhereInput.iqnWhitelistIn) &&
        Objects.equals(this.iqnWhitelistLt, iscsiTargetWhereInput.iqnWhitelistLt) &&
        Objects.equals(this.iqnWhitelistLte, iscsiTargetWhereInput.iqnWhitelistLte) &&
        Objects.equals(this.iqnWhitelistNot, iscsiTargetWhereInput.iqnWhitelistNot) &&
        Objects.equals(this.iqnWhitelistNotContains, iscsiTargetWhereInput.iqnWhitelistNotContains) &&
        Objects.equals(this.iqnWhitelistNotEndsWith, iscsiTargetWhereInput.iqnWhitelistNotEndsWith) &&
        Objects.equals(this.iqnWhitelistNotIn, iscsiTargetWhereInput.iqnWhitelistNotIn) &&
        Objects.equals(this.iqnWhitelistNotStartsWith, iscsiTargetWhereInput.iqnWhitelistNotStartsWith) &&
        Objects.equals(this.iqnWhitelistStartsWith, iscsiTargetWhereInput.iqnWhitelistStartsWith) &&
        Objects.equals(this.labelsEvery, iscsiTargetWhereInput.labelsEvery) &&
        Objects.equals(this.labelsNone, iscsiTargetWhereInput.labelsNone) &&
        Objects.equals(this.labelsSome, iscsiTargetWhereInput.labelsSome) &&
        Objects.equals(this.localId, iscsiTargetWhereInput.localId) &&
        Objects.equals(this.localIdContains, iscsiTargetWhereInput.localIdContains) &&
        Objects.equals(this.localIdEndsWith, iscsiTargetWhereInput.localIdEndsWith) &&
        Objects.equals(this.localIdGt, iscsiTargetWhereInput.localIdGt) &&
        Objects.equals(this.localIdGte, iscsiTargetWhereInput.localIdGte) &&
        Objects.equals(this.localIdIn, iscsiTargetWhereInput.localIdIn) &&
        Objects.equals(this.localIdLt, iscsiTargetWhereInput.localIdLt) &&
        Objects.equals(this.localIdLte, iscsiTargetWhereInput.localIdLte) &&
        Objects.equals(this.localIdNot, iscsiTargetWhereInput.localIdNot) &&
        Objects.equals(this.localIdNotContains, iscsiTargetWhereInput.localIdNotContains) &&
        Objects.equals(this.localIdNotEndsWith, iscsiTargetWhereInput.localIdNotEndsWith) &&
        Objects.equals(this.localIdNotIn, iscsiTargetWhereInput.localIdNotIn) &&
        Objects.equals(this.localIdNotStartsWith, iscsiTargetWhereInput.localIdNotStartsWith) &&
        Objects.equals(this.localIdStartsWith, iscsiTargetWhereInput.localIdStartsWith) &&
        Objects.equals(this.lunsEvery, iscsiTargetWhereInput.lunsEvery) &&
        Objects.equals(this.lunsNone, iscsiTargetWhereInput.lunsNone) &&
        Objects.equals(this.lunsSome, iscsiTargetWhereInput.lunsSome) &&
        Objects.equals(this.name, iscsiTargetWhereInput.name) &&
        Objects.equals(this.nameContains, iscsiTargetWhereInput.nameContains) &&
        Objects.equals(this.nameEndsWith, iscsiTargetWhereInput.nameEndsWith) &&
        Objects.equals(this.nameGt, iscsiTargetWhereInput.nameGt) &&
        Objects.equals(this.nameGte, iscsiTargetWhereInput.nameGte) &&
        Objects.equals(this.nameIn, iscsiTargetWhereInput.nameIn) &&
        Objects.equals(this.nameLt, iscsiTargetWhereInput.nameLt) &&
        Objects.equals(this.nameLte, iscsiTargetWhereInput.nameLte) &&
        Objects.equals(this.nameNot, iscsiTargetWhereInput.nameNot) &&
        Objects.equals(this.nameNotContains, iscsiTargetWhereInput.nameNotContains) &&
        Objects.equals(this.nameNotEndsWith, iscsiTargetWhereInput.nameNotEndsWith) &&
        Objects.equals(this.nameNotIn, iscsiTargetWhereInput.nameNotIn) &&
        Objects.equals(this.nameNotStartsWith, iscsiTargetWhereInput.nameNotStartsWith) &&
        Objects.equals(this.nameStartsWith, iscsiTargetWhereInput.nameStartsWith) &&
        Objects.equals(this.replicaNum, iscsiTargetWhereInput.replicaNum) &&
        Objects.equals(this.replicaNumGt, iscsiTargetWhereInput.replicaNumGt) &&
        Objects.equals(this.replicaNumGte, iscsiTargetWhereInput.replicaNumGte) &&
        Objects.equals(this.replicaNumIn, iscsiTargetWhereInput.replicaNumIn) &&
        Objects.equals(this.replicaNumLt, iscsiTargetWhereInput.replicaNumLt) &&
        Objects.equals(this.replicaNumLte, iscsiTargetWhereInput.replicaNumLte) &&
        Objects.equals(this.replicaNumNot, iscsiTargetWhereInput.replicaNumNot) &&
        Objects.equals(this.replicaNumNotIn, iscsiTargetWhereInput.replicaNumNotIn) &&
        Objects.equals(this.stripeNum, iscsiTargetWhereInput.stripeNum) &&
        Objects.equals(this.stripeNumGt, iscsiTargetWhereInput.stripeNumGt) &&
        Objects.equals(this.stripeNumGte, iscsiTargetWhereInput.stripeNumGte) &&
        Objects.equals(this.stripeNumIn, iscsiTargetWhereInput.stripeNumIn) &&
        Objects.equals(this.stripeNumLt, iscsiTargetWhereInput.stripeNumLt) &&
        Objects.equals(this.stripeNumLte, iscsiTargetWhereInput.stripeNumLte) &&
        Objects.equals(this.stripeNumNot, iscsiTargetWhereInput.stripeNumNot) &&
        Objects.equals(this.stripeNumNotIn, iscsiTargetWhereInput.stripeNumNotIn) &&
        Objects.equals(this.stripeSize, iscsiTargetWhereInput.stripeSize) &&
        Objects.equals(this.stripeSizeGt, iscsiTargetWhereInput.stripeSizeGt) &&
        Objects.equals(this.stripeSizeGte, iscsiTargetWhereInput.stripeSizeGte) &&
        Objects.equals(this.stripeSizeIn, iscsiTargetWhereInput.stripeSizeIn) &&
        Objects.equals(this.stripeSizeLt, iscsiTargetWhereInput.stripeSizeLt) &&
        Objects.equals(this.stripeSizeLte, iscsiTargetWhereInput.stripeSizeLte) &&
        Objects.equals(this.stripeSizeNot, iscsiTargetWhereInput.stripeSizeNot) &&
        Objects.equals(this.stripeSizeNotIn, iscsiTargetWhereInput.stripeSizeNotIn) &&
        Objects.equals(this.thinProvision, iscsiTargetWhereInput.thinProvision) &&
        Objects.equals(this.thinProvisionNot, iscsiTargetWhereInput.thinProvisionNot);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(AND, NOT, OR, bps, bpsGt, bpsGte, bpsIn, bpsLt, bpsLte, bpsMax, bpsMaxGt, bpsMaxGte, bpsMaxIn, bpsMaxLength, bpsMaxLengthGt, bpsMaxLengthGte, bpsMaxLengthIn, bpsMaxLengthLt, bpsMaxLengthLte, bpsMaxLengthNot, bpsMaxLengthNotIn, bpsMaxLt, bpsMaxLte, bpsMaxNot, bpsMaxNotIn, bpsNot, bpsNotIn, bpsRd, bpsRdGt, bpsRdGte, bpsRdIn, bpsRdLt, bpsRdLte, bpsRdMax, bpsRdMaxGt, bpsRdMaxGte, bpsRdMaxIn, bpsRdMaxLength, bpsRdMaxLengthGt, bpsRdMaxLengthGte, bpsRdMaxLengthIn, bpsRdMaxLengthLt, bpsRdMaxLengthLte, bpsRdMaxLengthNot, bpsRdMaxLengthNotIn, bpsRdMaxLt, bpsRdMaxLte, bpsRdMaxNot, bpsRdMaxNotIn, bpsRdNot, bpsRdNotIn, bpsWr, bpsWrGt, bpsWrGte, bpsWrIn, bpsWrLt, bpsWrLte, bpsWrMax, bpsWrMaxGt, bpsWrMaxGte, bpsWrMaxIn, bpsWrMaxLength, bpsWrMaxLengthGt, bpsWrMaxLengthGte, bpsWrMaxLengthIn, bpsWrMaxLengthLt, bpsWrMaxLengthLte, bpsWrMaxLengthNot, bpsWrMaxLengthNotIn, bpsWrMaxLt, bpsWrMaxLte, bpsWrMaxNot, bpsWrMaxNotIn, bpsWrNot, bpsWrNotIn, chapEnabled, chapEnabledNot, chapName, chapNameContains, chapNameEndsWith, chapNameGt, chapNameGte, chapNameIn, chapNameLt, chapNameLte, chapNameNot, chapNameNotContains, chapNameNotEndsWith, chapNameNotIn, chapNameNotStartsWith, chapNameStartsWith, chapSecret, chapSecretContains, chapSecretEndsWith, chapSecretGt, chapSecretGte, chapSecretIn, chapSecretLt, chapSecretLte, chapSecretNot, chapSecretNotContains, chapSecretNotEndsWith, chapSecretNotIn, chapSecretNotStartsWith, chapSecretStartsWith, cluster, description, descriptionContains, descriptionEndsWith, descriptionGt, descriptionGte, descriptionIn, descriptionLt, descriptionLte, descriptionNot, descriptionNotContains, descriptionNotEndsWith, descriptionNotIn, descriptionNotStartsWith, descriptionStartsWith, entityAsyncStatus, entityAsyncStatusIn, entityAsyncStatusNot, entityAsyncStatusNotIn, externalUse, externalUseNot, id, idContains, idEndsWith, idGt, idGte, idIn, idLt, idLte, idNot, idNotContains, idNotEndsWith, idNotIn, idNotStartsWith, idStartsWith, internal, internalNot, ioSize, ioSizeGt, ioSizeGte, ioSizeIn, ioSizeLt, ioSizeLte, ioSizeNot, ioSizeNotIn, iops, iopsGt, iopsGte, iopsIn, iopsLt, iopsLte, iopsMax, iopsMaxGt, iopsMaxGte, iopsMaxIn, iopsMaxLength, iopsMaxLengthGt, iopsMaxLengthGte, iopsMaxLengthIn, iopsMaxLengthLt, iopsMaxLengthLte, iopsMaxLengthNot, iopsMaxLengthNotIn, iopsMaxLt, iopsMaxLte, iopsMaxNot, iopsMaxNotIn, iopsNot, iopsNotIn, iopsRd, iopsRdGt, iopsRdGte, iopsRdIn, iopsRdLt, iopsRdLte, iopsRdMax, iopsRdMaxGt, iopsRdMaxGte, iopsRdMaxIn, iopsRdMaxLength, iopsRdMaxLengthGt, iopsRdMaxLengthGte, iopsRdMaxLengthIn, iopsRdMaxLengthLt, iopsRdMaxLengthLte, iopsRdMaxLengthNot, iopsRdMaxLengthNotIn, iopsRdMaxLt, iopsRdMaxLte, iopsRdMaxNot, iopsRdMaxNotIn, iopsRdNot, iopsRdNotIn, iopsWr, iopsWrGt, iopsWrGte, iopsWrIn, iopsWrLt, iopsWrLte, iopsWrMax, iopsWrMaxGt, iopsWrMaxGte, iopsWrMaxIn, iopsWrMaxLength, iopsWrMaxLengthGt, iopsWrMaxLengthGte, iopsWrMaxLengthIn, iopsWrMaxLengthLt, iopsWrMaxLengthLte, iopsWrMaxLengthNot, iopsWrMaxLengthNotIn, iopsWrMaxLt, iopsWrMaxLte, iopsWrMaxNot, iopsWrMaxNotIn, iopsWrNot, iopsWrNotIn, ipWhitelist, ipWhitelistContains, ipWhitelistEndsWith, ipWhitelistGt, ipWhitelistGte, ipWhitelistIn, ipWhitelistLt, ipWhitelistLte, ipWhitelistNot, ipWhitelistNotContains, ipWhitelistNotEndsWith, ipWhitelistNotIn, ipWhitelistNotStartsWith, ipWhitelistStartsWith, iqnName, iqnNameContains, iqnNameEndsWith, iqnNameGt, iqnNameGte, iqnNameIn, iqnNameLt, iqnNameLte, iqnNameNot, iqnNameNotContains, iqnNameNotEndsWith, iqnNameNotIn, iqnNameNotStartsWith, iqnNameStartsWith, iqnWhitelist, iqnWhitelistContains, iqnWhitelistEndsWith, iqnWhitelistGt, iqnWhitelistGte, iqnWhitelistIn, iqnWhitelistLt, iqnWhitelistLte, iqnWhitelistNot, iqnWhitelistNotContains, iqnWhitelistNotEndsWith, iqnWhitelistNotIn, iqnWhitelistNotStartsWith, iqnWhitelistStartsWith, labelsEvery, labelsNone, labelsSome, localId, localIdContains, localIdEndsWith, localIdGt, localIdGte, localIdIn, localIdLt, localIdLte, localIdNot, localIdNotContains, localIdNotEndsWith, localIdNotIn, localIdNotStartsWith, localIdStartsWith, lunsEvery, lunsNone, lunsSome, name, nameContains, nameEndsWith, nameGt, nameGte, nameIn, nameLt, nameLte, nameNot, nameNotContains, nameNotEndsWith, nameNotIn, nameNotStartsWith, nameStartsWith, replicaNum, replicaNumGt, replicaNumGte, replicaNumIn, replicaNumLt, replicaNumLte, replicaNumNot, replicaNumNotIn, stripeNum, stripeNumGt, stripeNumGte, stripeNumIn, stripeNumLt, stripeNumLte, stripeNumNot, stripeNumNotIn, stripeSize, stripeSizeGt, stripeSizeGte, stripeSizeIn, stripeSizeLt, stripeSizeLte, stripeSizeNot, stripeSizeNotIn, thinProvision, thinProvisionNot);
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
    sb.append("class IscsiTargetWhereInput {\n");
    sb.append("    AND: ").append(toIndentedString(AND)).append("\n");
    sb.append("    NOT: ").append(toIndentedString(NOT)).append("\n");
    sb.append("    OR: ").append(toIndentedString(OR)).append("\n");
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
    sb.append("    chapEnabled: ").append(toIndentedString(chapEnabled)).append("\n");
    sb.append("    chapEnabledNot: ").append(toIndentedString(chapEnabledNot)).append("\n");
    sb.append("    chapName: ").append(toIndentedString(chapName)).append("\n");
    sb.append("    chapNameContains: ").append(toIndentedString(chapNameContains)).append("\n");
    sb.append("    chapNameEndsWith: ").append(toIndentedString(chapNameEndsWith)).append("\n");
    sb.append("    chapNameGt: ").append(toIndentedString(chapNameGt)).append("\n");
    sb.append("    chapNameGte: ").append(toIndentedString(chapNameGte)).append("\n");
    sb.append("    chapNameIn: ").append(toIndentedString(chapNameIn)).append("\n");
    sb.append("    chapNameLt: ").append(toIndentedString(chapNameLt)).append("\n");
    sb.append("    chapNameLte: ").append(toIndentedString(chapNameLte)).append("\n");
    sb.append("    chapNameNot: ").append(toIndentedString(chapNameNot)).append("\n");
    sb.append("    chapNameNotContains: ").append(toIndentedString(chapNameNotContains)).append("\n");
    sb.append("    chapNameNotEndsWith: ").append(toIndentedString(chapNameNotEndsWith)).append("\n");
    sb.append("    chapNameNotIn: ").append(toIndentedString(chapNameNotIn)).append("\n");
    sb.append("    chapNameNotStartsWith: ").append(toIndentedString(chapNameNotStartsWith)).append("\n");
    sb.append("    chapNameStartsWith: ").append(toIndentedString(chapNameStartsWith)).append("\n");
    sb.append("    chapSecret: ").append(toIndentedString(chapSecret)).append("\n");
    sb.append("    chapSecretContains: ").append(toIndentedString(chapSecretContains)).append("\n");
    sb.append("    chapSecretEndsWith: ").append(toIndentedString(chapSecretEndsWith)).append("\n");
    sb.append("    chapSecretGt: ").append(toIndentedString(chapSecretGt)).append("\n");
    sb.append("    chapSecretGte: ").append(toIndentedString(chapSecretGte)).append("\n");
    sb.append("    chapSecretIn: ").append(toIndentedString(chapSecretIn)).append("\n");
    sb.append("    chapSecretLt: ").append(toIndentedString(chapSecretLt)).append("\n");
    sb.append("    chapSecretLte: ").append(toIndentedString(chapSecretLte)).append("\n");
    sb.append("    chapSecretNot: ").append(toIndentedString(chapSecretNot)).append("\n");
    sb.append("    chapSecretNotContains: ").append(toIndentedString(chapSecretNotContains)).append("\n");
    sb.append("    chapSecretNotEndsWith: ").append(toIndentedString(chapSecretNotEndsWith)).append("\n");
    sb.append("    chapSecretNotIn: ").append(toIndentedString(chapSecretNotIn)).append("\n");
    sb.append("    chapSecretNotStartsWith: ").append(toIndentedString(chapSecretNotStartsWith)).append("\n");
    sb.append("    chapSecretStartsWith: ").append(toIndentedString(chapSecretStartsWith)).append("\n");
    sb.append("    cluster: ").append(toIndentedString(cluster)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    descriptionContains: ").append(toIndentedString(descriptionContains)).append("\n");
    sb.append("    descriptionEndsWith: ").append(toIndentedString(descriptionEndsWith)).append("\n");
    sb.append("    descriptionGt: ").append(toIndentedString(descriptionGt)).append("\n");
    sb.append("    descriptionGte: ").append(toIndentedString(descriptionGte)).append("\n");
    sb.append("    descriptionIn: ").append(toIndentedString(descriptionIn)).append("\n");
    sb.append("    descriptionLt: ").append(toIndentedString(descriptionLt)).append("\n");
    sb.append("    descriptionLte: ").append(toIndentedString(descriptionLte)).append("\n");
    sb.append("    descriptionNot: ").append(toIndentedString(descriptionNot)).append("\n");
    sb.append("    descriptionNotContains: ").append(toIndentedString(descriptionNotContains)).append("\n");
    sb.append("    descriptionNotEndsWith: ").append(toIndentedString(descriptionNotEndsWith)).append("\n");
    sb.append("    descriptionNotIn: ").append(toIndentedString(descriptionNotIn)).append("\n");
    sb.append("    descriptionNotStartsWith: ").append(toIndentedString(descriptionNotStartsWith)).append("\n");
    sb.append("    descriptionStartsWith: ").append(toIndentedString(descriptionStartsWith)).append("\n");
    sb.append("    entityAsyncStatus: ").append(toIndentedString(entityAsyncStatus)).append("\n");
    sb.append("    entityAsyncStatusIn: ").append(toIndentedString(entityAsyncStatusIn)).append("\n");
    sb.append("    entityAsyncStatusNot: ").append(toIndentedString(entityAsyncStatusNot)).append("\n");
    sb.append("    entityAsyncStatusNotIn: ").append(toIndentedString(entityAsyncStatusNotIn)).append("\n");
    sb.append("    externalUse: ").append(toIndentedString(externalUse)).append("\n");
    sb.append("    externalUseNot: ").append(toIndentedString(externalUseNot)).append("\n");
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
    sb.append("    internal: ").append(toIndentedString(internal)).append("\n");
    sb.append("    internalNot: ").append(toIndentedString(internalNot)).append("\n");
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
    sb.append("    ipWhitelist: ").append(toIndentedString(ipWhitelist)).append("\n");
    sb.append("    ipWhitelistContains: ").append(toIndentedString(ipWhitelistContains)).append("\n");
    sb.append("    ipWhitelistEndsWith: ").append(toIndentedString(ipWhitelistEndsWith)).append("\n");
    sb.append("    ipWhitelistGt: ").append(toIndentedString(ipWhitelistGt)).append("\n");
    sb.append("    ipWhitelistGte: ").append(toIndentedString(ipWhitelistGte)).append("\n");
    sb.append("    ipWhitelistIn: ").append(toIndentedString(ipWhitelistIn)).append("\n");
    sb.append("    ipWhitelistLt: ").append(toIndentedString(ipWhitelistLt)).append("\n");
    sb.append("    ipWhitelistLte: ").append(toIndentedString(ipWhitelistLte)).append("\n");
    sb.append("    ipWhitelistNot: ").append(toIndentedString(ipWhitelistNot)).append("\n");
    sb.append("    ipWhitelistNotContains: ").append(toIndentedString(ipWhitelistNotContains)).append("\n");
    sb.append("    ipWhitelistNotEndsWith: ").append(toIndentedString(ipWhitelistNotEndsWith)).append("\n");
    sb.append("    ipWhitelistNotIn: ").append(toIndentedString(ipWhitelistNotIn)).append("\n");
    sb.append("    ipWhitelistNotStartsWith: ").append(toIndentedString(ipWhitelistNotStartsWith)).append("\n");
    sb.append("    ipWhitelistStartsWith: ").append(toIndentedString(ipWhitelistStartsWith)).append("\n");
    sb.append("    iqnName: ").append(toIndentedString(iqnName)).append("\n");
    sb.append("    iqnNameContains: ").append(toIndentedString(iqnNameContains)).append("\n");
    sb.append("    iqnNameEndsWith: ").append(toIndentedString(iqnNameEndsWith)).append("\n");
    sb.append("    iqnNameGt: ").append(toIndentedString(iqnNameGt)).append("\n");
    sb.append("    iqnNameGte: ").append(toIndentedString(iqnNameGte)).append("\n");
    sb.append("    iqnNameIn: ").append(toIndentedString(iqnNameIn)).append("\n");
    sb.append("    iqnNameLt: ").append(toIndentedString(iqnNameLt)).append("\n");
    sb.append("    iqnNameLte: ").append(toIndentedString(iqnNameLte)).append("\n");
    sb.append("    iqnNameNot: ").append(toIndentedString(iqnNameNot)).append("\n");
    sb.append("    iqnNameNotContains: ").append(toIndentedString(iqnNameNotContains)).append("\n");
    sb.append("    iqnNameNotEndsWith: ").append(toIndentedString(iqnNameNotEndsWith)).append("\n");
    sb.append("    iqnNameNotIn: ").append(toIndentedString(iqnNameNotIn)).append("\n");
    sb.append("    iqnNameNotStartsWith: ").append(toIndentedString(iqnNameNotStartsWith)).append("\n");
    sb.append("    iqnNameStartsWith: ").append(toIndentedString(iqnNameStartsWith)).append("\n");
    sb.append("    iqnWhitelist: ").append(toIndentedString(iqnWhitelist)).append("\n");
    sb.append("    iqnWhitelistContains: ").append(toIndentedString(iqnWhitelistContains)).append("\n");
    sb.append("    iqnWhitelistEndsWith: ").append(toIndentedString(iqnWhitelistEndsWith)).append("\n");
    sb.append("    iqnWhitelistGt: ").append(toIndentedString(iqnWhitelistGt)).append("\n");
    sb.append("    iqnWhitelistGte: ").append(toIndentedString(iqnWhitelistGte)).append("\n");
    sb.append("    iqnWhitelistIn: ").append(toIndentedString(iqnWhitelistIn)).append("\n");
    sb.append("    iqnWhitelistLt: ").append(toIndentedString(iqnWhitelistLt)).append("\n");
    sb.append("    iqnWhitelistLte: ").append(toIndentedString(iqnWhitelistLte)).append("\n");
    sb.append("    iqnWhitelistNot: ").append(toIndentedString(iqnWhitelistNot)).append("\n");
    sb.append("    iqnWhitelistNotContains: ").append(toIndentedString(iqnWhitelistNotContains)).append("\n");
    sb.append("    iqnWhitelistNotEndsWith: ").append(toIndentedString(iqnWhitelistNotEndsWith)).append("\n");
    sb.append("    iqnWhitelistNotIn: ").append(toIndentedString(iqnWhitelistNotIn)).append("\n");
    sb.append("    iqnWhitelistNotStartsWith: ").append(toIndentedString(iqnWhitelistNotStartsWith)).append("\n");
    sb.append("    iqnWhitelistStartsWith: ").append(toIndentedString(iqnWhitelistStartsWith)).append("\n");
    sb.append("    labelsEvery: ").append(toIndentedString(labelsEvery)).append("\n");
    sb.append("    labelsNone: ").append(toIndentedString(labelsNone)).append("\n");
    sb.append("    labelsSome: ").append(toIndentedString(labelsSome)).append("\n");
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
    sb.append("    lunsEvery: ").append(toIndentedString(lunsEvery)).append("\n");
    sb.append("    lunsNone: ").append(toIndentedString(lunsNone)).append("\n");
    sb.append("    lunsSome: ").append(toIndentedString(lunsSome)).append("\n");
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

