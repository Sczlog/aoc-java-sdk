package com.arcfra.aoc.model;

import java.util.Objects;
import java.util.Arrays;
import com.arcfra.aoc.model.ClusterWhereInput;
import com.arcfra.aoc.model.ContentLibraryVmTemplateWhereInput;
import com.arcfra.aoc.model.EntityAsyncStatus;
import com.arcfra.aoc.model.LabelWhereInput;
import com.arcfra.aoc.model.VmClockOffset;
import com.arcfra.aoc.model.VmDiskIoPolicy;
import com.arcfra.aoc.model.VmDiskIoRestrictType;
import com.arcfra.aoc.model.VmFirmware;
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
 * VmTemplateWhereInput
 */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class VmTemplateWhereInput {
  public static final String SERIALIZED_NAME_A_N_D = "AND";
  @SerializedName(SERIALIZED_NAME_A_N_D)
  private List<VmTemplateWhereInput> AND = null;

  public static final String SERIALIZED_NAME_N_O_T = "NOT";
  @SerializedName(SERIALIZED_NAME_N_O_T)
  private List<VmTemplateWhereInput> NOT = null;

  public static final String SERIALIZED_NAME_O_R = "OR";
  @SerializedName(SERIALIZED_NAME_O_R)
  private List<VmTemplateWhereInput> OR = null;

  public static final String SERIALIZED_NAME_CLOCK_OFFSET = "clock_offset";
  @SerializedName(SERIALIZED_NAME_CLOCK_OFFSET)
  private VmClockOffset clockOffset;

  public static final String SERIALIZED_NAME_CLOCK_OFFSET_IN = "clock_offset_in";
  @SerializedName(SERIALIZED_NAME_CLOCK_OFFSET_IN)
  private List<VmClockOffset> clockOffsetIn = null;

  public static final String SERIALIZED_NAME_CLOCK_OFFSET_NOT = "clock_offset_not";
  @SerializedName(SERIALIZED_NAME_CLOCK_OFFSET_NOT)
  private VmClockOffset clockOffsetNot;

  public static final String SERIALIZED_NAME_CLOCK_OFFSET_NOT_IN = "clock_offset_not_in";
  @SerializedName(SERIALIZED_NAME_CLOCK_OFFSET_NOT_IN)
  private List<VmClockOffset> clockOffsetNotIn = null;

  public static final String SERIALIZED_NAME_CLOUD_INIT_SUPPORTED = "cloud_init_supported";
  @SerializedName(SERIALIZED_NAME_CLOUD_INIT_SUPPORTED)
  private Boolean cloudInitSupported;

  public static final String SERIALIZED_NAME_CLOUD_INIT_SUPPORTED_NOT = "cloud_init_supported_not";
  @SerializedName(SERIALIZED_NAME_CLOUD_INIT_SUPPORTED_NOT)
  private Boolean cloudInitSupportedNot;

  public static final String SERIALIZED_NAME_CLUSTER = "cluster";
  @SerializedName(SERIALIZED_NAME_CLUSTER)
  private ClusterWhereInput cluster;

  public static final String SERIALIZED_NAME_CONTENT_LIBRARY_VM_TEMPLATE = "content_library_vm_template";
  @SerializedName(SERIALIZED_NAME_CONTENT_LIBRARY_VM_TEMPLATE)
  private ContentLibraryVmTemplateWhereInput contentLibraryVmTemplate;

  public static final String SERIALIZED_NAME_CPU_MODEL = "cpu_model";
  @SerializedName(SERIALIZED_NAME_CPU_MODEL)
  private String cpuModel;

  public static final String SERIALIZED_NAME_CPU_MODEL_CONTAINS = "cpu_model_contains";
  @SerializedName(SERIALIZED_NAME_CPU_MODEL_CONTAINS)
  private String cpuModelContains;

  public static final String SERIALIZED_NAME_CPU_MODEL_ENDS_WITH = "cpu_model_ends_with";
  @SerializedName(SERIALIZED_NAME_CPU_MODEL_ENDS_WITH)
  private String cpuModelEndsWith;

  public static final String SERIALIZED_NAME_CPU_MODEL_GT = "cpu_model_gt";
  @SerializedName(SERIALIZED_NAME_CPU_MODEL_GT)
  private String cpuModelGt;

  public static final String SERIALIZED_NAME_CPU_MODEL_GTE = "cpu_model_gte";
  @SerializedName(SERIALIZED_NAME_CPU_MODEL_GTE)
  private String cpuModelGte;

  public static final String SERIALIZED_NAME_CPU_MODEL_IN = "cpu_model_in";
  @SerializedName(SERIALIZED_NAME_CPU_MODEL_IN)
  private List<String> cpuModelIn = null;

  public static final String SERIALIZED_NAME_CPU_MODEL_LT = "cpu_model_lt";
  @SerializedName(SERIALIZED_NAME_CPU_MODEL_LT)
  private String cpuModelLt;

  public static final String SERIALIZED_NAME_CPU_MODEL_LTE = "cpu_model_lte";
  @SerializedName(SERIALIZED_NAME_CPU_MODEL_LTE)
  private String cpuModelLte;

  public static final String SERIALIZED_NAME_CPU_MODEL_NOT = "cpu_model_not";
  @SerializedName(SERIALIZED_NAME_CPU_MODEL_NOT)
  private String cpuModelNot;

  public static final String SERIALIZED_NAME_CPU_MODEL_NOT_CONTAINS = "cpu_model_not_contains";
  @SerializedName(SERIALIZED_NAME_CPU_MODEL_NOT_CONTAINS)
  private String cpuModelNotContains;

  public static final String SERIALIZED_NAME_CPU_MODEL_NOT_ENDS_WITH = "cpu_model_not_ends_with";
  @SerializedName(SERIALIZED_NAME_CPU_MODEL_NOT_ENDS_WITH)
  private String cpuModelNotEndsWith;

  public static final String SERIALIZED_NAME_CPU_MODEL_NOT_IN = "cpu_model_not_in";
  @SerializedName(SERIALIZED_NAME_CPU_MODEL_NOT_IN)
  private List<String> cpuModelNotIn = null;

  public static final String SERIALIZED_NAME_CPU_MODEL_NOT_STARTS_WITH = "cpu_model_not_starts_with";
  @SerializedName(SERIALIZED_NAME_CPU_MODEL_NOT_STARTS_WITH)
  private String cpuModelNotStartsWith;

  public static final String SERIALIZED_NAME_CPU_MODEL_STARTS_WITH = "cpu_model_starts_with";
  @SerializedName(SERIALIZED_NAME_CPU_MODEL_STARTS_WITH)
  private String cpuModelStartsWith;

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

  public static final String SERIALIZED_NAME_FIRMWARE = "firmware";
  @SerializedName(SERIALIZED_NAME_FIRMWARE)
  private VmFirmware firmware;

  public static final String SERIALIZED_NAME_FIRMWARE_IN = "firmware_in";
  @SerializedName(SERIALIZED_NAME_FIRMWARE_IN)
  private List<VmFirmware> firmwareIn = null;

  public static final String SERIALIZED_NAME_FIRMWARE_NOT = "firmware_not";
  @SerializedName(SERIALIZED_NAME_FIRMWARE_NOT)
  private VmFirmware firmwareNot;

  public static final String SERIALIZED_NAME_FIRMWARE_NOT_IN = "firmware_not_in";
  @SerializedName(SERIALIZED_NAME_FIRMWARE_NOT_IN)
  private List<VmFirmware> firmwareNotIn = null;

  public static final String SERIALIZED_NAME_HA = "ha";
  @SerializedName(SERIALIZED_NAME_HA)
  private Boolean ha;

  public static final String SERIALIZED_NAME_HA_NOT = "ha_not";
  @SerializedName(SERIALIZED_NAME_HA_NOT)
  private Boolean haNot;

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

  public static final String SERIALIZED_NAME_IO_POLICY = "io_policy";
  @SerializedName(SERIALIZED_NAME_IO_POLICY)
  private VmDiskIoPolicy ioPolicy;

  public static final String SERIALIZED_NAME_IO_POLICY_IN = "io_policy_in";
  @SerializedName(SERIALIZED_NAME_IO_POLICY_IN)
  private List<VmDiskIoPolicy> ioPolicyIn = null;

  public static final String SERIALIZED_NAME_IO_POLICY_NOT = "io_policy_not";
  @SerializedName(SERIALIZED_NAME_IO_POLICY_NOT)
  private VmDiskIoPolicy ioPolicyNot;

  public static final String SERIALIZED_NAME_IO_POLICY_NOT_IN = "io_policy_not_in";
  @SerializedName(SERIALIZED_NAME_IO_POLICY_NOT_IN)
  private List<VmDiskIoPolicy> ioPolicyNotIn = null;

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

  public static final String SERIALIZED_NAME_MAX_BANDWIDTH = "max_bandwidth";
  @SerializedName(SERIALIZED_NAME_MAX_BANDWIDTH)
  private Long maxBandwidth;

  public static final String SERIALIZED_NAME_MAX_BANDWIDTH_GT = "max_bandwidth_gt";
  @SerializedName(SERIALIZED_NAME_MAX_BANDWIDTH_GT)
  private Long maxBandwidthGt;

  public static final String SERIALIZED_NAME_MAX_BANDWIDTH_GTE = "max_bandwidth_gte";
  @SerializedName(SERIALIZED_NAME_MAX_BANDWIDTH_GTE)
  private Long maxBandwidthGte;

  public static final String SERIALIZED_NAME_MAX_BANDWIDTH_IN = "max_bandwidth_in";
  @SerializedName(SERIALIZED_NAME_MAX_BANDWIDTH_IN)
  private List<Long> maxBandwidthIn = null;

  public static final String SERIALIZED_NAME_MAX_BANDWIDTH_LT = "max_bandwidth_lt";
  @SerializedName(SERIALIZED_NAME_MAX_BANDWIDTH_LT)
  private Long maxBandwidthLt;

  public static final String SERIALIZED_NAME_MAX_BANDWIDTH_LTE = "max_bandwidth_lte";
  @SerializedName(SERIALIZED_NAME_MAX_BANDWIDTH_LTE)
  private Long maxBandwidthLte;

  public static final String SERIALIZED_NAME_MAX_BANDWIDTH_NOT = "max_bandwidth_not";
  @SerializedName(SERIALIZED_NAME_MAX_BANDWIDTH_NOT)
  private Long maxBandwidthNot;

  public static final String SERIALIZED_NAME_MAX_BANDWIDTH_NOT_IN = "max_bandwidth_not_in";
  @SerializedName(SERIALIZED_NAME_MAX_BANDWIDTH_NOT_IN)
  private List<Long> maxBandwidthNotIn = null;

  public static final String SERIALIZED_NAME_MAX_BANDWIDTH_POLICY = "max_bandwidth_policy";
  @SerializedName(SERIALIZED_NAME_MAX_BANDWIDTH_POLICY)
  private VmDiskIoRestrictType maxBandwidthPolicy;

  public static final String SERIALIZED_NAME_MAX_BANDWIDTH_POLICY_IN = "max_bandwidth_policy_in";
  @SerializedName(SERIALIZED_NAME_MAX_BANDWIDTH_POLICY_IN)
  private List<VmDiskIoRestrictType> maxBandwidthPolicyIn = null;

  public static final String SERIALIZED_NAME_MAX_BANDWIDTH_POLICY_NOT = "max_bandwidth_policy_not";
  @SerializedName(SERIALIZED_NAME_MAX_BANDWIDTH_POLICY_NOT)
  private VmDiskIoRestrictType maxBandwidthPolicyNot;

  public static final String SERIALIZED_NAME_MAX_BANDWIDTH_POLICY_NOT_IN = "max_bandwidth_policy_not_in";
  @SerializedName(SERIALIZED_NAME_MAX_BANDWIDTH_POLICY_NOT_IN)
  private List<VmDiskIoRestrictType> maxBandwidthPolicyNotIn = null;

  public static final String SERIALIZED_NAME_MAX_IOPS = "max_iops";
  @SerializedName(SERIALIZED_NAME_MAX_IOPS)
  private Integer maxIops;

  public static final String SERIALIZED_NAME_MAX_IOPS_GT = "max_iops_gt";
  @SerializedName(SERIALIZED_NAME_MAX_IOPS_GT)
  private Integer maxIopsGt;

  public static final String SERIALIZED_NAME_MAX_IOPS_GTE = "max_iops_gte";
  @SerializedName(SERIALIZED_NAME_MAX_IOPS_GTE)
  private Integer maxIopsGte;

  public static final String SERIALIZED_NAME_MAX_IOPS_IN = "max_iops_in";
  @SerializedName(SERIALIZED_NAME_MAX_IOPS_IN)
  private List<Integer> maxIopsIn = null;

  public static final String SERIALIZED_NAME_MAX_IOPS_LT = "max_iops_lt";
  @SerializedName(SERIALIZED_NAME_MAX_IOPS_LT)
  private Integer maxIopsLt;

  public static final String SERIALIZED_NAME_MAX_IOPS_LTE = "max_iops_lte";
  @SerializedName(SERIALIZED_NAME_MAX_IOPS_LTE)
  private Integer maxIopsLte;

  public static final String SERIALIZED_NAME_MAX_IOPS_NOT = "max_iops_not";
  @SerializedName(SERIALIZED_NAME_MAX_IOPS_NOT)
  private Integer maxIopsNot;

  public static final String SERIALIZED_NAME_MAX_IOPS_NOT_IN = "max_iops_not_in";
  @SerializedName(SERIALIZED_NAME_MAX_IOPS_NOT_IN)
  private List<Integer> maxIopsNotIn = null;

  public static final String SERIALIZED_NAME_MAX_IOPS_POLICY = "max_iops_policy";
  @SerializedName(SERIALIZED_NAME_MAX_IOPS_POLICY)
  private VmDiskIoRestrictType maxIopsPolicy;

  public static final String SERIALIZED_NAME_MAX_IOPS_POLICY_IN = "max_iops_policy_in";
  @SerializedName(SERIALIZED_NAME_MAX_IOPS_POLICY_IN)
  private List<VmDiskIoRestrictType> maxIopsPolicyIn = null;

  public static final String SERIALIZED_NAME_MAX_IOPS_POLICY_NOT = "max_iops_policy_not";
  @SerializedName(SERIALIZED_NAME_MAX_IOPS_POLICY_NOT)
  private VmDiskIoRestrictType maxIopsPolicyNot;

  public static final String SERIALIZED_NAME_MAX_IOPS_POLICY_NOT_IN = "max_iops_policy_not_in";
  @SerializedName(SERIALIZED_NAME_MAX_IOPS_POLICY_NOT_IN)
  private List<VmDiskIoRestrictType> maxIopsPolicyNotIn = null;

  public static final String SERIALIZED_NAME_MEMORY = "memory";
  @SerializedName(SERIALIZED_NAME_MEMORY)
  private Long memory;

  public static final String SERIALIZED_NAME_MEMORY_GT = "memory_gt";
  @SerializedName(SERIALIZED_NAME_MEMORY_GT)
  private Long memoryGt;

  public static final String SERIALIZED_NAME_MEMORY_GTE = "memory_gte";
  @SerializedName(SERIALIZED_NAME_MEMORY_GTE)
  private Long memoryGte;

  public static final String SERIALIZED_NAME_MEMORY_IN = "memory_in";
  @SerializedName(SERIALIZED_NAME_MEMORY_IN)
  private List<Long> memoryIn = null;

  public static final String SERIALIZED_NAME_MEMORY_LT = "memory_lt";
  @SerializedName(SERIALIZED_NAME_MEMORY_LT)
  private Long memoryLt;

  public static final String SERIALIZED_NAME_MEMORY_LTE = "memory_lte";
  @SerializedName(SERIALIZED_NAME_MEMORY_LTE)
  private Long memoryLte;

  public static final String SERIALIZED_NAME_MEMORY_NOT = "memory_not";
  @SerializedName(SERIALIZED_NAME_MEMORY_NOT)
  private Long memoryNot;

  public static final String SERIALIZED_NAME_MEMORY_NOT_IN = "memory_not_in";
  @SerializedName(SERIALIZED_NAME_MEMORY_NOT_IN)
  private List<Long> memoryNotIn = null;

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

  public static final String SERIALIZED_NAME_SIZE = "size";
  @SerializedName(SERIALIZED_NAME_SIZE)
  private Long size;

  public static final String SERIALIZED_NAME_SIZE_GT = "size_gt";
  @SerializedName(SERIALIZED_NAME_SIZE_GT)
  private Long sizeGt;

  public static final String SERIALIZED_NAME_SIZE_GTE = "size_gte";
  @SerializedName(SERIALIZED_NAME_SIZE_GTE)
  private Long sizeGte;

  public static final String SERIALIZED_NAME_SIZE_IN = "size_in";
  @SerializedName(SERIALIZED_NAME_SIZE_IN)
  private List<Long> sizeIn = null;

  public static final String SERIALIZED_NAME_SIZE_LT = "size_lt";
  @SerializedName(SERIALIZED_NAME_SIZE_LT)
  private Long sizeLt;

  public static final String SERIALIZED_NAME_SIZE_LTE = "size_lte";
  @SerializedName(SERIALIZED_NAME_SIZE_LTE)
  private Long sizeLte;

  public static final String SERIALIZED_NAME_SIZE_NOT = "size_not";
  @SerializedName(SERIALIZED_NAME_SIZE_NOT)
  private Long sizeNot;

  public static final String SERIALIZED_NAME_SIZE_NOT_IN = "size_not_in";
  @SerializedName(SERIALIZED_NAME_SIZE_NOT_IN)
  private List<Long> sizeNotIn = null;

  public static final String SERIALIZED_NAME_VCPU = "vcpu";
  @SerializedName(SERIALIZED_NAME_VCPU)
  private Integer vcpu;

  public static final String SERIALIZED_NAME_VCPU_GT = "vcpu_gt";
  @SerializedName(SERIALIZED_NAME_VCPU_GT)
  private Integer vcpuGt;

  public static final String SERIALIZED_NAME_VCPU_GTE = "vcpu_gte";
  @SerializedName(SERIALIZED_NAME_VCPU_GTE)
  private Integer vcpuGte;

  public static final String SERIALIZED_NAME_VCPU_IN = "vcpu_in";
  @SerializedName(SERIALIZED_NAME_VCPU_IN)
  private List<Integer> vcpuIn = null;

  public static final String SERIALIZED_NAME_VCPU_LT = "vcpu_lt";
  @SerializedName(SERIALIZED_NAME_VCPU_LT)
  private Integer vcpuLt;

  public static final String SERIALIZED_NAME_VCPU_LTE = "vcpu_lte";
  @SerializedName(SERIALIZED_NAME_VCPU_LTE)
  private Integer vcpuLte;

  public static final String SERIALIZED_NAME_VCPU_NOT = "vcpu_not";
  @SerializedName(SERIALIZED_NAME_VCPU_NOT)
  private Integer vcpuNot;

  public static final String SERIALIZED_NAME_VCPU_NOT_IN = "vcpu_not_in";
  @SerializedName(SERIALIZED_NAME_VCPU_NOT_IN)
  private List<Integer> vcpuNotIn = null;

  public static final String SERIALIZED_NAME_VIDEO_TYPE = "video_type";
  @SerializedName(SERIALIZED_NAME_VIDEO_TYPE)
  private String videoType;

  public static final String SERIALIZED_NAME_VIDEO_TYPE_CONTAINS = "video_type_contains";
  @SerializedName(SERIALIZED_NAME_VIDEO_TYPE_CONTAINS)
  private String videoTypeContains;

  public static final String SERIALIZED_NAME_VIDEO_TYPE_ENDS_WITH = "video_type_ends_with";
  @SerializedName(SERIALIZED_NAME_VIDEO_TYPE_ENDS_WITH)
  private String videoTypeEndsWith;

  public static final String SERIALIZED_NAME_VIDEO_TYPE_GT = "video_type_gt";
  @SerializedName(SERIALIZED_NAME_VIDEO_TYPE_GT)
  private String videoTypeGt;

  public static final String SERIALIZED_NAME_VIDEO_TYPE_GTE = "video_type_gte";
  @SerializedName(SERIALIZED_NAME_VIDEO_TYPE_GTE)
  private String videoTypeGte;

  public static final String SERIALIZED_NAME_VIDEO_TYPE_IN = "video_type_in";
  @SerializedName(SERIALIZED_NAME_VIDEO_TYPE_IN)
  private List<String> videoTypeIn = null;

  public static final String SERIALIZED_NAME_VIDEO_TYPE_LT = "video_type_lt";
  @SerializedName(SERIALIZED_NAME_VIDEO_TYPE_LT)
  private String videoTypeLt;

  public static final String SERIALIZED_NAME_VIDEO_TYPE_LTE = "video_type_lte";
  @SerializedName(SERIALIZED_NAME_VIDEO_TYPE_LTE)
  private String videoTypeLte;

  public static final String SERIALIZED_NAME_VIDEO_TYPE_NOT = "video_type_not";
  @SerializedName(SERIALIZED_NAME_VIDEO_TYPE_NOT)
  private String videoTypeNot;

  public static final String SERIALIZED_NAME_VIDEO_TYPE_NOT_CONTAINS = "video_type_not_contains";
  @SerializedName(SERIALIZED_NAME_VIDEO_TYPE_NOT_CONTAINS)
  private String videoTypeNotContains;

  public static final String SERIALIZED_NAME_VIDEO_TYPE_NOT_ENDS_WITH = "video_type_not_ends_with";
  @SerializedName(SERIALIZED_NAME_VIDEO_TYPE_NOT_ENDS_WITH)
  private String videoTypeNotEndsWith;

  public static final String SERIALIZED_NAME_VIDEO_TYPE_NOT_IN = "video_type_not_in";
  @SerializedName(SERIALIZED_NAME_VIDEO_TYPE_NOT_IN)
  private List<String> videoTypeNotIn = null;

  public static final String SERIALIZED_NAME_VIDEO_TYPE_NOT_STARTS_WITH = "video_type_not_starts_with";
  @SerializedName(SERIALIZED_NAME_VIDEO_TYPE_NOT_STARTS_WITH)
  private String videoTypeNotStartsWith;

  public static final String SERIALIZED_NAME_VIDEO_TYPE_STARTS_WITH = "video_type_starts_with";
  @SerializedName(SERIALIZED_NAME_VIDEO_TYPE_STARTS_WITH)
  private String videoTypeStartsWith;

  public static final String SERIALIZED_NAME_WIN_OPT = "win_opt";
  @SerializedName(SERIALIZED_NAME_WIN_OPT)
  private Boolean winOpt;

  public static final String SERIALIZED_NAME_WIN_OPT_NOT = "win_opt_not";
  @SerializedName(SERIALIZED_NAME_WIN_OPT_NOT)
  private Boolean winOptNot;

  public VmTemplateWhereInput() { 
  }

  public VmTemplateWhereInput AND(List<VmTemplateWhereInput> AND) {
    
    this.AND = AND;
    return this;
  }

  public VmTemplateWhereInput addANDItem(VmTemplateWhereInput ANDItem) {
    if (this.AND == null) {
      this.AND = new ArrayList<VmTemplateWhereInput>();
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

  public List<VmTemplateWhereInput> getAND() {
    return AND;
  }


  public void setAND(List<VmTemplateWhereInput> AND) {
    this.AND = AND;
  }


  public VmTemplateWhereInput NOT(List<VmTemplateWhereInput> NOT) {
    
    this.NOT = NOT;
    return this;
  }

  public VmTemplateWhereInput addNOTItem(VmTemplateWhereInput NOTItem) {
    if (this.NOT == null) {
      this.NOT = new ArrayList<VmTemplateWhereInput>();
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

  public List<VmTemplateWhereInput> getNOT() {
    return NOT;
  }


  public void setNOT(List<VmTemplateWhereInput> NOT) {
    this.NOT = NOT;
  }


  public VmTemplateWhereInput OR(List<VmTemplateWhereInput> OR) {
    
    this.OR = OR;
    return this;
  }

  public VmTemplateWhereInput addORItem(VmTemplateWhereInput ORItem) {
    if (this.OR == null) {
      this.OR = new ArrayList<VmTemplateWhereInput>();
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

  public List<VmTemplateWhereInput> getOR() {
    return OR;
  }


  public void setOR(List<VmTemplateWhereInput> OR) {
    this.OR = OR;
  }


  public VmTemplateWhereInput clockOffset(VmClockOffset clockOffset) {
    
    this.clockOffset = clockOffset;
    return this;
  }

   /**
   * Get clockOffset
   * @return clockOffset
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VmClockOffset getClockOffset() {
    return clockOffset;
  }


  public void setClockOffset(VmClockOffset clockOffset) {
    this.clockOffset = clockOffset;
  }


  public VmTemplateWhereInput clockOffsetIn(List<VmClockOffset> clockOffsetIn) {
    
    this.clockOffsetIn = clockOffsetIn;
    return this;
  }

  public VmTemplateWhereInput addClockOffsetInItem(VmClockOffset clockOffsetInItem) {
    if (this.clockOffsetIn == null) {
      this.clockOffsetIn = new ArrayList<VmClockOffset>();
    }
    this.clockOffsetIn.add(clockOffsetInItem);
    return this;
  }

   /**
   * Get clockOffsetIn
   * @return clockOffsetIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<VmClockOffset> getClockOffsetIn() {
    return clockOffsetIn;
  }


  public void setClockOffsetIn(List<VmClockOffset> clockOffsetIn) {
    this.clockOffsetIn = clockOffsetIn;
  }


  public VmTemplateWhereInput clockOffsetNot(VmClockOffset clockOffsetNot) {
    
    this.clockOffsetNot = clockOffsetNot;
    return this;
  }

   /**
   * Get clockOffsetNot
   * @return clockOffsetNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VmClockOffset getClockOffsetNot() {
    return clockOffsetNot;
  }


  public void setClockOffsetNot(VmClockOffset clockOffsetNot) {
    this.clockOffsetNot = clockOffsetNot;
  }


  public VmTemplateWhereInput clockOffsetNotIn(List<VmClockOffset> clockOffsetNotIn) {
    
    this.clockOffsetNotIn = clockOffsetNotIn;
    return this;
  }

  public VmTemplateWhereInput addClockOffsetNotInItem(VmClockOffset clockOffsetNotInItem) {
    if (this.clockOffsetNotIn == null) {
      this.clockOffsetNotIn = new ArrayList<VmClockOffset>();
    }
    this.clockOffsetNotIn.add(clockOffsetNotInItem);
    return this;
  }

   /**
   * Get clockOffsetNotIn
   * @return clockOffsetNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<VmClockOffset> getClockOffsetNotIn() {
    return clockOffsetNotIn;
  }


  public void setClockOffsetNotIn(List<VmClockOffset> clockOffsetNotIn) {
    this.clockOffsetNotIn = clockOffsetNotIn;
  }


  public VmTemplateWhereInput cloudInitSupported(Boolean cloudInitSupported) {
    
    this.cloudInitSupported = cloudInitSupported;
    return this;
  }

   /**
   * Get cloudInitSupported
   * @return cloudInitSupported
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getCloudInitSupported() {
    return cloudInitSupported;
  }


  public void setCloudInitSupported(Boolean cloudInitSupported) {
    this.cloudInitSupported = cloudInitSupported;
  }


  public VmTemplateWhereInput cloudInitSupportedNot(Boolean cloudInitSupportedNot) {
    
    this.cloudInitSupportedNot = cloudInitSupportedNot;
    return this;
  }

   /**
   * Get cloudInitSupportedNot
   * @return cloudInitSupportedNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getCloudInitSupportedNot() {
    return cloudInitSupportedNot;
  }


  public void setCloudInitSupportedNot(Boolean cloudInitSupportedNot) {
    this.cloudInitSupportedNot = cloudInitSupportedNot;
  }


  public VmTemplateWhereInput cluster(ClusterWhereInput cluster) {
    
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


  public VmTemplateWhereInput contentLibraryVmTemplate(ContentLibraryVmTemplateWhereInput contentLibraryVmTemplate) {
    
    this.contentLibraryVmTemplate = contentLibraryVmTemplate;
    return this;
  }

   /**
   * Get contentLibraryVmTemplate
   * @return contentLibraryVmTemplate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ContentLibraryVmTemplateWhereInput getContentLibraryVmTemplate() {
    return contentLibraryVmTemplate;
  }


  public void setContentLibraryVmTemplate(ContentLibraryVmTemplateWhereInput contentLibraryVmTemplate) {
    this.contentLibraryVmTemplate = contentLibraryVmTemplate;
  }


  public VmTemplateWhereInput cpuModel(String cpuModel) {
    
    this.cpuModel = cpuModel;
    return this;
  }

   /**
   * Get cpuModel
   * @return cpuModel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCpuModel() {
    return cpuModel;
  }


  public void setCpuModel(String cpuModel) {
    this.cpuModel = cpuModel;
  }


  public VmTemplateWhereInput cpuModelContains(String cpuModelContains) {
    
    this.cpuModelContains = cpuModelContains;
    return this;
  }

   /**
   * Get cpuModelContains
   * @return cpuModelContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCpuModelContains() {
    return cpuModelContains;
  }


  public void setCpuModelContains(String cpuModelContains) {
    this.cpuModelContains = cpuModelContains;
  }


  public VmTemplateWhereInput cpuModelEndsWith(String cpuModelEndsWith) {
    
    this.cpuModelEndsWith = cpuModelEndsWith;
    return this;
  }

   /**
   * Get cpuModelEndsWith
   * @return cpuModelEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCpuModelEndsWith() {
    return cpuModelEndsWith;
  }


  public void setCpuModelEndsWith(String cpuModelEndsWith) {
    this.cpuModelEndsWith = cpuModelEndsWith;
  }


  public VmTemplateWhereInput cpuModelGt(String cpuModelGt) {
    
    this.cpuModelGt = cpuModelGt;
    return this;
  }

   /**
   * Get cpuModelGt
   * @return cpuModelGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCpuModelGt() {
    return cpuModelGt;
  }


  public void setCpuModelGt(String cpuModelGt) {
    this.cpuModelGt = cpuModelGt;
  }


  public VmTemplateWhereInput cpuModelGte(String cpuModelGte) {
    
    this.cpuModelGte = cpuModelGte;
    return this;
  }

   /**
   * Get cpuModelGte
   * @return cpuModelGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCpuModelGte() {
    return cpuModelGte;
  }


  public void setCpuModelGte(String cpuModelGte) {
    this.cpuModelGte = cpuModelGte;
  }


  public VmTemplateWhereInput cpuModelIn(List<String> cpuModelIn) {
    
    this.cpuModelIn = cpuModelIn;
    return this;
  }

  public VmTemplateWhereInput addCpuModelInItem(String cpuModelInItem) {
    if (this.cpuModelIn == null) {
      this.cpuModelIn = new ArrayList<String>();
    }
    this.cpuModelIn.add(cpuModelInItem);
    return this;
  }

   /**
   * Get cpuModelIn
   * @return cpuModelIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getCpuModelIn() {
    return cpuModelIn;
  }


  public void setCpuModelIn(List<String> cpuModelIn) {
    this.cpuModelIn = cpuModelIn;
  }


  public VmTemplateWhereInput cpuModelLt(String cpuModelLt) {
    
    this.cpuModelLt = cpuModelLt;
    return this;
  }

   /**
   * Get cpuModelLt
   * @return cpuModelLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCpuModelLt() {
    return cpuModelLt;
  }


  public void setCpuModelLt(String cpuModelLt) {
    this.cpuModelLt = cpuModelLt;
  }


  public VmTemplateWhereInput cpuModelLte(String cpuModelLte) {
    
    this.cpuModelLte = cpuModelLte;
    return this;
  }

   /**
   * Get cpuModelLte
   * @return cpuModelLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCpuModelLte() {
    return cpuModelLte;
  }


  public void setCpuModelLte(String cpuModelLte) {
    this.cpuModelLte = cpuModelLte;
  }


  public VmTemplateWhereInput cpuModelNot(String cpuModelNot) {
    
    this.cpuModelNot = cpuModelNot;
    return this;
  }

   /**
   * Get cpuModelNot
   * @return cpuModelNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCpuModelNot() {
    return cpuModelNot;
  }


  public void setCpuModelNot(String cpuModelNot) {
    this.cpuModelNot = cpuModelNot;
  }


  public VmTemplateWhereInput cpuModelNotContains(String cpuModelNotContains) {
    
    this.cpuModelNotContains = cpuModelNotContains;
    return this;
  }

   /**
   * Get cpuModelNotContains
   * @return cpuModelNotContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCpuModelNotContains() {
    return cpuModelNotContains;
  }


  public void setCpuModelNotContains(String cpuModelNotContains) {
    this.cpuModelNotContains = cpuModelNotContains;
  }


  public VmTemplateWhereInput cpuModelNotEndsWith(String cpuModelNotEndsWith) {
    
    this.cpuModelNotEndsWith = cpuModelNotEndsWith;
    return this;
  }

   /**
   * Get cpuModelNotEndsWith
   * @return cpuModelNotEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCpuModelNotEndsWith() {
    return cpuModelNotEndsWith;
  }


  public void setCpuModelNotEndsWith(String cpuModelNotEndsWith) {
    this.cpuModelNotEndsWith = cpuModelNotEndsWith;
  }


  public VmTemplateWhereInput cpuModelNotIn(List<String> cpuModelNotIn) {
    
    this.cpuModelNotIn = cpuModelNotIn;
    return this;
  }

  public VmTemplateWhereInput addCpuModelNotInItem(String cpuModelNotInItem) {
    if (this.cpuModelNotIn == null) {
      this.cpuModelNotIn = new ArrayList<String>();
    }
    this.cpuModelNotIn.add(cpuModelNotInItem);
    return this;
  }

   /**
   * Get cpuModelNotIn
   * @return cpuModelNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getCpuModelNotIn() {
    return cpuModelNotIn;
  }


  public void setCpuModelNotIn(List<String> cpuModelNotIn) {
    this.cpuModelNotIn = cpuModelNotIn;
  }


  public VmTemplateWhereInput cpuModelNotStartsWith(String cpuModelNotStartsWith) {
    
    this.cpuModelNotStartsWith = cpuModelNotStartsWith;
    return this;
  }

   /**
   * Get cpuModelNotStartsWith
   * @return cpuModelNotStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCpuModelNotStartsWith() {
    return cpuModelNotStartsWith;
  }


  public void setCpuModelNotStartsWith(String cpuModelNotStartsWith) {
    this.cpuModelNotStartsWith = cpuModelNotStartsWith;
  }


  public VmTemplateWhereInput cpuModelStartsWith(String cpuModelStartsWith) {
    
    this.cpuModelStartsWith = cpuModelStartsWith;
    return this;
  }

   /**
   * Get cpuModelStartsWith
   * @return cpuModelStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCpuModelStartsWith() {
    return cpuModelStartsWith;
  }


  public void setCpuModelStartsWith(String cpuModelStartsWith) {
    this.cpuModelStartsWith = cpuModelStartsWith;
  }


  public VmTemplateWhereInput description(String description) {
    
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


  public VmTemplateWhereInput descriptionContains(String descriptionContains) {
    
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


  public VmTemplateWhereInput descriptionEndsWith(String descriptionEndsWith) {
    
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


  public VmTemplateWhereInput descriptionGt(String descriptionGt) {
    
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


  public VmTemplateWhereInput descriptionGte(String descriptionGte) {
    
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


  public VmTemplateWhereInput descriptionIn(List<String> descriptionIn) {
    
    this.descriptionIn = descriptionIn;
    return this;
  }

  public VmTemplateWhereInput addDescriptionInItem(String descriptionInItem) {
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


  public VmTemplateWhereInput descriptionLt(String descriptionLt) {
    
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


  public VmTemplateWhereInput descriptionLte(String descriptionLte) {
    
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


  public VmTemplateWhereInput descriptionNot(String descriptionNot) {
    
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


  public VmTemplateWhereInput descriptionNotContains(String descriptionNotContains) {
    
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


  public VmTemplateWhereInput descriptionNotEndsWith(String descriptionNotEndsWith) {
    
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


  public VmTemplateWhereInput descriptionNotIn(List<String> descriptionNotIn) {
    
    this.descriptionNotIn = descriptionNotIn;
    return this;
  }

  public VmTemplateWhereInput addDescriptionNotInItem(String descriptionNotInItem) {
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


  public VmTemplateWhereInput descriptionNotStartsWith(String descriptionNotStartsWith) {
    
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


  public VmTemplateWhereInput descriptionStartsWith(String descriptionStartsWith) {
    
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


  public VmTemplateWhereInput entityAsyncStatus(EntityAsyncStatus entityAsyncStatus) {
    
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


  public VmTemplateWhereInput entityAsyncStatusIn(List<EntityAsyncStatus> entityAsyncStatusIn) {
    
    this.entityAsyncStatusIn = entityAsyncStatusIn;
    return this;
  }

  public VmTemplateWhereInput addEntityAsyncStatusInItem(EntityAsyncStatus entityAsyncStatusInItem) {
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


  public VmTemplateWhereInput entityAsyncStatusNot(EntityAsyncStatus entityAsyncStatusNot) {
    
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


  public VmTemplateWhereInput entityAsyncStatusNotIn(List<EntityAsyncStatus> entityAsyncStatusNotIn) {
    
    this.entityAsyncStatusNotIn = entityAsyncStatusNotIn;
    return this;
  }

  public VmTemplateWhereInput addEntityAsyncStatusNotInItem(EntityAsyncStatus entityAsyncStatusNotInItem) {
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


  public VmTemplateWhereInput firmware(VmFirmware firmware) {
    
    this.firmware = firmware;
    return this;
  }

   /**
   * Get firmware
   * @return firmware
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VmFirmware getFirmware() {
    return firmware;
  }


  public void setFirmware(VmFirmware firmware) {
    this.firmware = firmware;
  }


  public VmTemplateWhereInput firmwareIn(List<VmFirmware> firmwareIn) {
    
    this.firmwareIn = firmwareIn;
    return this;
  }

  public VmTemplateWhereInput addFirmwareInItem(VmFirmware firmwareInItem) {
    if (this.firmwareIn == null) {
      this.firmwareIn = new ArrayList<VmFirmware>();
    }
    this.firmwareIn.add(firmwareInItem);
    return this;
  }

   /**
   * Get firmwareIn
   * @return firmwareIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<VmFirmware> getFirmwareIn() {
    return firmwareIn;
  }


  public void setFirmwareIn(List<VmFirmware> firmwareIn) {
    this.firmwareIn = firmwareIn;
  }


  public VmTemplateWhereInput firmwareNot(VmFirmware firmwareNot) {
    
    this.firmwareNot = firmwareNot;
    return this;
  }

   /**
   * Get firmwareNot
   * @return firmwareNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VmFirmware getFirmwareNot() {
    return firmwareNot;
  }


  public void setFirmwareNot(VmFirmware firmwareNot) {
    this.firmwareNot = firmwareNot;
  }


  public VmTemplateWhereInput firmwareNotIn(List<VmFirmware> firmwareNotIn) {
    
    this.firmwareNotIn = firmwareNotIn;
    return this;
  }

  public VmTemplateWhereInput addFirmwareNotInItem(VmFirmware firmwareNotInItem) {
    if (this.firmwareNotIn == null) {
      this.firmwareNotIn = new ArrayList<VmFirmware>();
    }
    this.firmwareNotIn.add(firmwareNotInItem);
    return this;
  }

   /**
   * Get firmwareNotIn
   * @return firmwareNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<VmFirmware> getFirmwareNotIn() {
    return firmwareNotIn;
  }


  public void setFirmwareNotIn(List<VmFirmware> firmwareNotIn) {
    this.firmwareNotIn = firmwareNotIn;
  }


  public VmTemplateWhereInput ha(Boolean ha) {
    
    this.ha = ha;
    return this;
  }

   /**
   * Get ha
   * @return ha
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getHa() {
    return ha;
  }


  public void setHa(Boolean ha) {
    this.ha = ha;
  }


  public VmTemplateWhereInput haNot(Boolean haNot) {
    
    this.haNot = haNot;
    return this;
  }

   /**
   * Get haNot
   * @return haNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getHaNot() {
    return haNot;
  }


  public void setHaNot(Boolean haNot) {
    this.haNot = haNot;
  }


  public VmTemplateWhereInput id(String id) {
    
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


  public VmTemplateWhereInput idContains(String idContains) {
    
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


  public VmTemplateWhereInput idEndsWith(String idEndsWith) {
    
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


  public VmTemplateWhereInput idGt(String idGt) {
    
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


  public VmTemplateWhereInput idGte(String idGte) {
    
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


  public VmTemplateWhereInput idIn(List<String> idIn) {
    
    this.idIn = idIn;
    return this;
  }

  public VmTemplateWhereInput addIdInItem(String idInItem) {
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


  public VmTemplateWhereInput idLt(String idLt) {
    
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


  public VmTemplateWhereInput idLte(String idLte) {
    
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


  public VmTemplateWhereInput idNot(String idNot) {
    
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


  public VmTemplateWhereInput idNotContains(String idNotContains) {
    
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


  public VmTemplateWhereInput idNotEndsWith(String idNotEndsWith) {
    
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


  public VmTemplateWhereInput idNotIn(List<String> idNotIn) {
    
    this.idNotIn = idNotIn;
    return this;
  }

  public VmTemplateWhereInput addIdNotInItem(String idNotInItem) {
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


  public VmTemplateWhereInput idNotStartsWith(String idNotStartsWith) {
    
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


  public VmTemplateWhereInput idStartsWith(String idStartsWith) {
    
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


  public VmTemplateWhereInput ioPolicy(VmDiskIoPolicy ioPolicy) {
    
    this.ioPolicy = ioPolicy;
    return this;
  }

   /**
   * Get ioPolicy
   * @return ioPolicy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VmDiskIoPolicy getIoPolicy() {
    return ioPolicy;
  }


  public void setIoPolicy(VmDiskIoPolicy ioPolicy) {
    this.ioPolicy = ioPolicy;
  }


  public VmTemplateWhereInput ioPolicyIn(List<VmDiskIoPolicy> ioPolicyIn) {
    
    this.ioPolicyIn = ioPolicyIn;
    return this;
  }

  public VmTemplateWhereInput addIoPolicyInItem(VmDiskIoPolicy ioPolicyInItem) {
    if (this.ioPolicyIn == null) {
      this.ioPolicyIn = new ArrayList<VmDiskIoPolicy>();
    }
    this.ioPolicyIn.add(ioPolicyInItem);
    return this;
  }

   /**
   * Get ioPolicyIn
   * @return ioPolicyIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<VmDiskIoPolicy> getIoPolicyIn() {
    return ioPolicyIn;
  }


  public void setIoPolicyIn(List<VmDiskIoPolicy> ioPolicyIn) {
    this.ioPolicyIn = ioPolicyIn;
  }


  public VmTemplateWhereInput ioPolicyNot(VmDiskIoPolicy ioPolicyNot) {
    
    this.ioPolicyNot = ioPolicyNot;
    return this;
  }

   /**
   * Get ioPolicyNot
   * @return ioPolicyNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VmDiskIoPolicy getIoPolicyNot() {
    return ioPolicyNot;
  }


  public void setIoPolicyNot(VmDiskIoPolicy ioPolicyNot) {
    this.ioPolicyNot = ioPolicyNot;
  }


  public VmTemplateWhereInput ioPolicyNotIn(List<VmDiskIoPolicy> ioPolicyNotIn) {
    
    this.ioPolicyNotIn = ioPolicyNotIn;
    return this;
  }

  public VmTemplateWhereInput addIoPolicyNotInItem(VmDiskIoPolicy ioPolicyNotInItem) {
    if (this.ioPolicyNotIn == null) {
      this.ioPolicyNotIn = new ArrayList<VmDiskIoPolicy>();
    }
    this.ioPolicyNotIn.add(ioPolicyNotInItem);
    return this;
  }

   /**
   * Get ioPolicyNotIn
   * @return ioPolicyNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<VmDiskIoPolicy> getIoPolicyNotIn() {
    return ioPolicyNotIn;
  }


  public void setIoPolicyNotIn(List<VmDiskIoPolicy> ioPolicyNotIn) {
    this.ioPolicyNotIn = ioPolicyNotIn;
  }


  public VmTemplateWhereInput labelsEvery(LabelWhereInput labelsEvery) {
    
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


  public VmTemplateWhereInput labelsNone(LabelWhereInput labelsNone) {
    
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


  public VmTemplateWhereInput labelsSome(LabelWhereInput labelsSome) {
    
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


  public VmTemplateWhereInput localCreatedAt(String localCreatedAt) {
    
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


  public VmTemplateWhereInput localCreatedAtGt(String localCreatedAtGt) {
    
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


  public VmTemplateWhereInput localCreatedAtGte(String localCreatedAtGte) {
    
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


  public VmTemplateWhereInput localCreatedAtIn(List<String> localCreatedAtIn) {
    
    this.localCreatedAtIn = localCreatedAtIn;
    return this;
  }

  public VmTemplateWhereInput addLocalCreatedAtInItem(String localCreatedAtInItem) {
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


  public VmTemplateWhereInput localCreatedAtLt(String localCreatedAtLt) {
    
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


  public VmTemplateWhereInput localCreatedAtLte(String localCreatedAtLte) {
    
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


  public VmTemplateWhereInput localCreatedAtNot(String localCreatedAtNot) {
    
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


  public VmTemplateWhereInput localCreatedAtNotIn(List<String> localCreatedAtNotIn) {
    
    this.localCreatedAtNotIn = localCreatedAtNotIn;
    return this;
  }

  public VmTemplateWhereInput addLocalCreatedAtNotInItem(String localCreatedAtNotInItem) {
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


  public VmTemplateWhereInput localId(String localId) {
    
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


  public VmTemplateWhereInput localIdContains(String localIdContains) {
    
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


  public VmTemplateWhereInput localIdEndsWith(String localIdEndsWith) {
    
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


  public VmTemplateWhereInput localIdGt(String localIdGt) {
    
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


  public VmTemplateWhereInput localIdGte(String localIdGte) {
    
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


  public VmTemplateWhereInput localIdIn(List<String> localIdIn) {
    
    this.localIdIn = localIdIn;
    return this;
  }

  public VmTemplateWhereInput addLocalIdInItem(String localIdInItem) {
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


  public VmTemplateWhereInput localIdLt(String localIdLt) {
    
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


  public VmTemplateWhereInput localIdLte(String localIdLte) {
    
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


  public VmTemplateWhereInput localIdNot(String localIdNot) {
    
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


  public VmTemplateWhereInput localIdNotContains(String localIdNotContains) {
    
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


  public VmTemplateWhereInput localIdNotEndsWith(String localIdNotEndsWith) {
    
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


  public VmTemplateWhereInput localIdNotIn(List<String> localIdNotIn) {
    
    this.localIdNotIn = localIdNotIn;
    return this;
  }

  public VmTemplateWhereInput addLocalIdNotInItem(String localIdNotInItem) {
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


  public VmTemplateWhereInput localIdNotStartsWith(String localIdNotStartsWith) {
    
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


  public VmTemplateWhereInput localIdStartsWith(String localIdStartsWith) {
    
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


  public VmTemplateWhereInput maxBandwidth(Long maxBandwidth) {
    
    this.maxBandwidth = maxBandwidth;
    return this;
  }

   /**
   * Get maxBandwidth
   * @return maxBandwidth
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getMaxBandwidth() {
    return maxBandwidth;
  }


  public void setMaxBandwidth(Long maxBandwidth) {
    this.maxBandwidth = maxBandwidth;
  }


  public VmTemplateWhereInput maxBandwidthGt(Long maxBandwidthGt) {
    
    this.maxBandwidthGt = maxBandwidthGt;
    return this;
  }

   /**
   * Get maxBandwidthGt
   * @return maxBandwidthGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getMaxBandwidthGt() {
    return maxBandwidthGt;
  }


  public void setMaxBandwidthGt(Long maxBandwidthGt) {
    this.maxBandwidthGt = maxBandwidthGt;
  }


  public VmTemplateWhereInput maxBandwidthGte(Long maxBandwidthGte) {
    
    this.maxBandwidthGte = maxBandwidthGte;
    return this;
  }

   /**
   * Get maxBandwidthGte
   * @return maxBandwidthGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getMaxBandwidthGte() {
    return maxBandwidthGte;
  }


  public void setMaxBandwidthGte(Long maxBandwidthGte) {
    this.maxBandwidthGte = maxBandwidthGte;
  }


  public VmTemplateWhereInput maxBandwidthIn(List<Long> maxBandwidthIn) {
    
    this.maxBandwidthIn = maxBandwidthIn;
    return this;
  }

  public VmTemplateWhereInput addMaxBandwidthInItem(Long maxBandwidthInItem) {
    if (this.maxBandwidthIn == null) {
      this.maxBandwidthIn = new ArrayList<Long>();
    }
    this.maxBandwidthIn.add(maxBandwidthInItem);
    return this;
  }

   /**
   * Get maxBandwidthIn
   * @return maxBandwidthIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Long> getMaxBandwidthIn() {
    return maxBandwidthIn;
  }


  public void setMaxBandwidthIn(List<Long> maxBandwidthIn) {
    this.maxBandwidthIn = maxBandwidthIn;
  }


  public VmTemplateWhereInput maxBandwidthLt(Long maxBandwidthLt) {
    
    this.maxBandwidthLt = maxBandwidthLt;
    return this;
  }

   /**
   * Get maxBandwidthLt
   * @return maxBandwidthLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getMaxBandwidthLt() {
    return maxBandwidthLt;
  }


  public void setMaxBandwidthLt(Long maxBandwidthLt) {
    this.maxBandwidthLt = maxBandwidthLt;
  }


  public VmTemplateWhereInput maxBandwidthLte(Long maxBandwidthLte) {
    
    this.maxBandwidthLte = maxBandwidthLte;
    return this;
  }

   /**
   * Get maxBandwidthLte
   * @return maxBandwidthLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getMaxBandwidthLte() {
    return maxBandwidthLte;
  }


  public void setMaxBandwidthLte(Long maxBandwidthLte) {
    this.maxBandwidthLte = maxBandwidthLte;
  }


  public VmTemplateWhereInput maxBandwidthNot(Long maxBandwidthNot) {
    
    this.maxBandwidthNot = maxBandwidthNot;
    return this;
  }

   /**
   * Get maxBandwidthNot
   * @return maxBandwidthNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getMaxBandwidthNot() {
    return maxBandwidthNot;
  }


  public void setMaxBandwidthNot(Long maxBandwidthNot) {
    this.maxBandwidthNot = maxBandwidthNot;
  }


  public VmTemplateWhereInput maxBandwidthNotIn(List<Long> maxBandwidthNotIn) {
    
    this.maxBandwidthNotIn = maxBandwidthNotIn;
    return this;
  }

  public VmTemplateWhereInput addMaxBandwidthNotInItem(Long maxBandwidthNotInItem) {
    if (this.maxBandwidthNotIn == null) {
      this.maxBandwidthNotIn = new ArrayList<Long>();
    }
    this.maxBandwidthNotIn.add(maxBandwidthNotInItem);
    return this;
  }

   /**
   * Get maxBandwidthNotIn
   * @return maxBandwidthNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Long> getMaxBandwidthNotIn() {
    return maxBandwidthNotIn;
  }


  public void setMaxBandwidthNotIn(List<Long> maxBandwidthNotIn) {
    this.maxBandwidthNotIn = maxBandwidthNotIn;
  }


  public VmTemplateWhereInput maxBandwidthPolicy(VmDiskIoRestrictType maxBandwidthPolicy) {
    
    this.maxBandwidthPolicy = maxBandwidthPolicy;
    return this;
  }

   /**
   * Get maxBandwidthPolicy
   * @return maxBandwidthPolicy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VmDiskIoRestrictType getMaxBandwidthPolicy() {
    return maxBandwidthPolicy;
  }


  public void setMaxBandwidthPolicy(VmDiskIoRestrictType maxBandwidthPolicy) {
    this.maxBandwidthPolicy = maxBandwidthPolicy;
  }


  public VmTemplateWhereInput maxBandwidthPolicyIn(List<VmDiskIoRestrictType> maxBandwidthPolicyIn) {
    
    this.maxBandwidthPolicyIn = maxBandwidthPolicyIn;
    return this;
  }

  public VmTemplateWhereInput addMaxBandwidthPolicyInItem(VmDiskIoRestrictType maxBandwidthPolicyInItem) {
    if (this.maxBandwidthPolicyIn == null) {
      this.maxBandwidthPolicyIn = new ArrayList<VmDiskIoRestrictType>();
    }
    this.maxBandwidthPolicyIn.add(maxBandwidthPolicyInItem);
    return this;
  }

   /**
   * Get maxBandwidthPolicyIn
   * @return maxBandwidthPolicyIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<VmDiskIoRestrictType> getMaxBandwidthPolicyIn() {
    return maxBandwidthPolicyIn;
  }


  public void setMaxBandwidthPolicyIn(List<VmDiskIoRestrictType> maxBandwidthPolicyIn) {
    this.maxBandwidthPolicyIn = maxBandwidthPolicyIn;
  }


  public VmTemplateWhereInput maxBandwidthPolicyNot(VmDiskIoRestrictType maxBandwidthPolicyNot) {
    
    this.maxBandwidthPolicyNot = maxBandwidthPolicyNot;
    return this;
  }

   /**
   * Get maxBandwidthPolicyNot
   * @return maxBandwidthPolicyNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VmDiskIoRestrictType getMaxBandwidthPolicyNot() {
    return maxBandwidthPolicyNot;
  }


  public void setMaxBandwidthPolicyNot(VmDiskIoRestrictType maxBandwidthPolicyNot) {
    this.maxBandwidthPolicyNot = maxBandwidthPolicyNot;
  }


  public VmTemplateWhereInput maxBandwidthPolicyNotIn(List<VmDiskIoRestrictType> maxBandwidthPolicyNotIn) {
    
    this.maxBandwidthPolicyNotIn = maxBandwidthPolicyNotIn;
    return this;
  }

  public VmTemplateWhereInput addMaxBandwidthPolicyNotInItem(VmDiskIoRestrictType maxBandwidthPolicyNotInItem) {
    if (this.maxBandwidthPolicyNotIn == null) {
      this.maxBandwidthPolicyNotIn = new ArrayList<VmDiskIoRestrictType>();
    }
    this.maxBandwidthPolicyNotIn.add(maxBandwidthPolicyNotInItem);
    return this;
  }

   /**
   * Get maxBandwidthPolicyNotIn
   * @return maxBandwidthPolicyNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<VmDiskIoRestrictType> getMaxBandwidthPolicyNotIn() {
    return maxBandwidthPolicyNotIn;
  }


  public void setMaxBandwidthPolicyNotIn(List<VmDiskIoRestrictType> maxBandwidthPolicyNotIn) {
    this.maxBandwidthPolicyNotIn = maxBandwidthPolicyNotIn;
  }


  public VmTemplateWhereInput maxIops(Integer maxIops) {
    
    this.maxIops = maxIops;
    return this;
  }

   /**
   * Get maxIops
   * @return maxIops
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getMaxIops() {
    return maxIops;
  }


  public void setMaxIops(Integer maxIops) {
    this.maxIops = maxIops;
  }


  public VmTemplateWhereInput maxIopsGt(Integer maxIopsGt) {
    
    this.maxIopsGt = maxIopsGt;
    return this;
  }

   /**
   * Get maxIopsGt
   * @return maxIopsGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getMaxIopsGt() {
    return maxIopsGt;
  }


  public void setMaxIopsGt(Integer maxIopsGt) {
    this.maxIopsGt = maxIopsGt;
  }


  public VmTemplateWhereInput maxIopsGte(Integer maxIopsGte) {
    
    this.maxIopsGte = maxIopsGte;
    return this;
  }

   /**
   * Get maxIopsGte
   * @return maxIopsGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getMaxIopsGte() {
    return maxIopsGte;
  }


  public void setMaxIopsGte(Integer maxIopsGte) {
    this.maxIopsGte = maxIopsGte;
  }


  public VmTemplateWhereInput maxIopsIn(List<Integer> maxIopsIn) {
    
    this.maxIopsIn = maxIopsIn;
    return this;
  }

  public VmTemplateWhereInput addMaxIopsInItem(Integer maxIopsInItem) {
    if (this.maxIopsIn == null) {
      this.maxIopsIn = new ArrayList<Integer>();
    }
    this.maxIopsIn.add(maxIopsInItem);
    return this;
  }

   /**
   * Get maxIopsIn
   * @return maxIopsIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Integer> getMaxIopsIn() {
    return maxIopsIn;
  }


  public void setMaxIopsIn(List<Integer> maxIopsIn) {
    this.maxIopsIn = maxIopsIn;
  }


  public VmTemplateWhereInput maxIopsLt(Integer maxIopsLt) {
    
    this.maxIopsLt = maxIopsLt;
    return this;
  }

   /**
   * Get maxIopsLt
   * @return maxIopsLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getMaxIopsLt() {
    return maxIopsLt;
  }


  public void setMaxIopsLt(Integer maxIopsLt) {
    this.maxIopsLt = maxIopsLt;
  }


  public VmTemplateWhereInput maxIopsLte(Integer maxIopsLte) {
    
    this.maxIopsLte = maxIopsLte;
    return this;
  }

   /**
   * Get maxIopsLte
   * @return maxIopsLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getMaxIopsLte() {
    return maxIopsLte;
  }


  public void setMaxIopsLte(Integer maxIopsLte) {
    this.maxIopsLte = maxIopsLte;
  }


  public VmTemplateWhereInput maxIopsNot(Integer maxIopsNot) {
    
    this.maxIopsNot = maxIopsNot;
    return this;
  }

   /**
   * Get maxIopsNot
   * @return maxIopsNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getMaxIopsNot() {
    return maxIopsNot;
  }


  public void setMaxIopsNot(Integer maxIopsNot) {
    this.maxIopsNot = maxIopsNot;
  }


  public VmTemplateWhereInput maxIopsNotIn(List<Integer> maxIopsNotIn) {
    
    this.maxIopsNotIn = maxIopsNotIn;
    return this;
  }

  public VmTemplateWhereInput addMaxIopsNotInItem(Integer maxIopsNotInItem) {
    if (this.maxIopsNotIn == null) {
      this.maxIopsNotIn = new ArrayList<Integer>();
    }
    this.maxIopsNotIn.add(maxIopsNotInItem);
    return this;
  }

   /**
   * Get maxIopsNotIn
   * @return maxIopsNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Integer> getMaxIopsNotIn() {
    return maxIopsNotIn;
  }


  public void setMaxIopsNotIn(List<Integer> maxIopsNotIn) {
    this.maxIopsNotIn = maxIopsNotIn;
  }


  public VmTemplateWhereInput maxIopsPolicy(VmDiskIoRestrictType maxIopsPolicy) {
    
    this.maxIopsPolicy = maxIopsPolicy;
    return this;
  }

   /**
   * Get maxIopsPolicy
   * @return maxIopsPolicy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VmDiskIoRestrictType getMaxIopsPolicy() {
    return maxIopsPolicy;
  }


  public void setMaxIopsPolicy(VmDiskIoRestrictType maxIopsPolicy) {
    this.maxIopsPolicy = maxIopsPolicy;
  }


  public VmTemplateWhereInput maxIopsPolicyIn(List<VmDiskIoRestrictType> maxIopsPolicyIn) {
    
    this.maxIopsPolicyIn = maxIopsPolicyIn;
    return this;
  }

  public VmTemplateWhereInput addMaxIopsPolicyInItem(VmDiskIoRestrictType maxIopsPolicyInItem) {
    if (this.maxIopsPolicyIn == null) {
      this.maxIopsPolicyIn = new ArrayList<VmDiskIoRestrictType>();
    }
    this.maxIopsPolicyIn.add(maxIopsPolicyInItem);
    return this;
  }

   /**
   * Get maxIopsPolicyIn
   * @return maxIopsPolicyIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<VmDiskIoRestrictType> getMaxIopsPolicyIn() {
    return maxIopsPolicyIn;
  }


  public void setMaxIopsPolicyIn(List<VmDiskIoRestrictType> maxIopsPolicyIn) {
    this.maxIopsPolicyIn = maxIopsPolicyIn;
  }


  public VmTemplateWhereInput maxIopsPolicyNot(VmDiskIoRestrictType maxIopsPolicyNot) {
    
    this.maxIopsPolicyNot = maxIopsPolicyNot;
    return this;
  }

   /**
   * Get maxIopsPolicyNot
   * @return maxIopsPolicyNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VmDiskIoRestrictType getMaxIopsPolicyNot() {
    return maxIopsPolicyNot;
  }


  public void setMaxIopsPolicyNot(VmDiskIoRestrictType maxIopsPolicyNot) {
    this.maxIopsPolicyNot = maxIopsPolicyNot;
  }


  public VmTemplateWhereInput maxIopsPolicyNotIn(List<VmDiskIoRestrictType> maxIopsPolicyNotIn) {
    
    this.maxIopsPolicyNotIn = maxIopsPolicyNotIn;
    return this;
  }

  public VmTemplateWhereInput addMaxIopsPolicyNotInItem(VmDiskIoRestrictType maxIopsPolicyNotInItem) {
    if (this.maxIopsPolicyNotIn == null) {
      this.maxIopsPolicyNotIn = new ArrayList<VmDiskIoRestrictType>();
    }
    this.maxIopsPolicyNotIn.add(maxIopsPolicyNotInItem);
    return this;
  }

   /**
   * Get maxIopsPolicyNotIn
   * @return maxIopsPolicyNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<VmDiskIoRestrictType> getMaxIopsPolicyNotIn() {
    return maxIopsPolicyNotIn;
  }


  public void setMaxIopsPolicyNotIn(List<VmDiskIoRestrictType> maxIopsPolicyNotIn) {
    this.maxIopsPolicyNotIn = maxIopsPolicyNotIn;
  }


  public VmTemplateWhereInput memory(Long memory) {
    
    this.memory = memory;
    return this;
  }

   /**
   * Get memory
   * @return memory
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getMemory() {
    return memory;
  }


  public void setMemory(Long memory) {
    this.memory = memory;
  }


  public VmTemplateWhereInput memoryGt(Long memoryGt) {
    
    this.memoryGt = memoryGt;
    return this;
  }

   /**
   * Get memoryGt
   * @return memoryGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getMemoryGt() {
    return memoryGt;
  }


  public void setMemoryGt(Long memoryGt) {
    this.memoryGt = memoryGt;
  }


  public VmTemplateWhereInput memoryGte(Long memoryGte) {
    
    this.memoryGte = memoryGte;
    return this;
  }

   /**
   * Get memoryGte
   * @return memoryGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getMemoryGte() {
    return memoryGte;
  }


  public void setMemoryGte(Long memoryGte) {
    this.memoryGte = memoryGte;
  }


  public VmTemplateWhereInput memoryIn(List<Long> memoryIn) {
    
    this.memoryIn = memoryIn;
    return this;
  }

  public VmTemplateWhereInput addMemoryInItem(Long memoryInItem) {
    if (this.memoryIn == null) {
      this.memoryIn = new ArrayList<Long>();
    }
    this.memoryIn.add(memoryInItem);
    return this;
  }

   /**
   * Get memoryIn
   * @return memoryIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Long> getMemoryIn() {
    return memoryIn;
  }


  public void setMemoryIn(List<Long> memoryIn) {
    this.memoryIn = memoryIn;
  }


  public VmTemplateWhereInput memoryLt(Long memoryLt) {
    
    this.memoryLt = memoryLt;
    return this;
  }

   /**
   * Get memoryLt
   * @return memoryLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getMemoryLt() {
    return memoryLt;
  }


  public void setMemoryLt(Long memoryLt) {
    this.memoryLt = memoryLt;
  }


  public VmTemplateWhereInput memoryLte(Long memoryLte) {
    
    this.memoryLte = memoryLte;
    return this;
  }

   /**
   * Get memoryLte
   * @return memoryLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getMemoryLte() {
    return memoryLte;
  }


  public void setMemoryLte(Long memoryLte) {
    this.memoryLte = memoryLte;
  }


  public VmTemplateWhereInput memoryNot(Long memoryNot) {
    
    this.memoryNot = memoryNot;
    return this;
  }

   /**
   * Get memoryNot
   * @return memoryNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getMemoryNot() {
    return memoryNot;
  }


  public void setMemoryNot(Long memoryNot) {
    this.memoryNot = memoryNot;
  }


  public VmTemplateWhereInput memoryNotIn(List<Long> memoryNotIn) {
    
    this.memoryNotIn = memoryNotIn;
    return this;
  }

  public VmTemplateWhereInput addMemoryNotInItem(Long memoryNotInItem) {
    if (this.memoryNotIn == null) {
      this.memoryNotIn = new ArrayList<Long>();
    }
    this.memoryNotIn.add(memoryNotInItem);
    return this;
  }

   /**
   * Get memoryNotIn
   * @return memoryNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Long> getMemoryNotIn() {
    return memoryNotIn;
  }


  public void setMemoryNotIn(List<Long> memoryNotIn) {
    this.memoryNotIn = memoryNotIn;
  }


  public VmTemplateWhereInput name(String name) {
    
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


  public VmTemplateWhereInput nameContains(String nameContains) {
    
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


  public VmTemplateWhereInput nameEndsWith(String nameEndsWith) {
    
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


  public VmTemplateWhereInput nameGt(String nameGt) {
    
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


  public VmTemplateWhereInput nameGte(String nameGte) {
    
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


  public VmTemplateWhereInput nameIn(List<String> nameIn) {
    
    this.nameIn = nameIn;
    return this;
  }

  public VmTemplateWhereInput addNameInItem(String nameInItem) {
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


  public VmTemplateWhereInput nameLt(String nameLt) {
    
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


  public VmTemplateWhereInput nameLte(String nameLte) {
    
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


  public VmTemplateWhereInput nameNot(String nameNot) {
    
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


  public VmTemplateWhereInput nameNotContains(String nameNotContains) {
    
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


  public VmTemplateWhereInput nameNotEndsWith(String nameNotEndsWith) {
    
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


  public VmTemplateWhereInput nameNotIn(List<String> nameNotIn) {
    
    this.nameNotIn = nameNotIn;
    return this;
  }

  public VmTemplateWhereInput addNameNotInItem(String nameNotInItem) {
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


  public VmTemplateWhereInput nameNotStartsWith(String nameNotStartsWith) {
    
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


  public VmTemplateWhereInput nameStartsWith(String nameStartsWith) {
    
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


  public VmTemplateWhereInput size(Long size) {
    
    this.size = size;
    return this;
  }

   /**
   * Get size
   * @return size
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getSize() {
    return size;
  }


  public void setSize(Long size) {
    this.size = size;
  }


  public VmTemplateWhereInput sizeGt(Long sizeGt) {
    
    this.sizeGt = sizeGt;
    return this;
  }

   /**
   * Get sizeGt
   * @return sizeGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getSizeGt() {
    return sizeGt;
  }


  public void setSizeGt(Long sizeGt) {
    this.sizeGt = sizeGt;
  }


  public VmTemplateWhereInput sizeGte(Long sizeGte) {
    
    this.sizeGte = sizeGte;
    return this;
  }

   /**
   * Get sizeGte
   * @return sizeGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getSizeGte() {
    return sizeGte;
  }


  public void setSizeGte(Long sizeGte) {
    this.sizeGte = sizeGte;
  }


  public VmTemplateWhereInput sizeIn(List<Long> sizeIn) {
    
    this.sizeIn = sizeIn;
    return this;
  }

  public VmTemplateWhereInput addSizeInItem(Long sizeInItem) {
    if (this.sizeIn == null) {
      this.sizeIn = new ArrayList<Long>();
    }
    this.sizeIn.add(sizeInItem);
    return this;
  }

   /**
   * Get sizeIn
   * @return sizeIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Long> getSizeIn() {
    return sizeIn;
  }


  public void setSizeIn(List<Long> sizeIn) {
    this.sizeIn = sizeIn;
  }


  public VmTemplateWhereInput sizeLt(Long sizeLt) {
    
    this.sizeLt = sizeLt;
    return this;
  }

   /**
   * Get sizeLt
   * @return sizeLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getSizeLt() {
    return sizeLt;
  }


  public void setSizeLt(Long sizeLt) {
    this.sizeLt = sizeLt;
  }


  public VmTemplateWhereInput sizeLte(Long sizeLte) {
    
    this.sizeLte = sizeLte;
    return this;
  }

   /**
   * Get sizeLte
   * @return sizeLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getSizeLte() {
    return sizeLte;
  }


  public void setSizeLte(Long sizeLte) {
    this.sizeLte = sizeLte;
  }


  public VmTemplateWhereInput sizeNot(Long sizeNot) {
    
    this.sizeNot = sizeNot;
    return this;
  }

   /**
   * Get sizeNot
   * @return sizeNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getSizeNot() {
    return sizeNot;
  }


  public void setSizeNot(Long sizeNot) {
    this.sizeNot = sizeNot;
  }


  public VmTemplateWhereInput sizeNotIn(List<Long> sizeNotIn) {
    
    this.sizeNotIn = sizeNotIn;
    return this;
  }

  public VmTemplateWhereInput addSizeNotInItem(Long sizeNotInItem) {
    if (this.sizeNotIn == null) {
      this.sizeNotIn = new ArrayList<Long>();
    }
    this.sizeNotIn.add(sizeNotInItem);
    return this;
  }

   /**
   * Get sizeNotIn
   * @return sizeNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Long> getSizeNotIn() {
    return sizeNotIn;
  }


  public void setSizeNotIn(List<Long> sizeNotIn) {
    this.sizeNotIn = sizeNotIn;
  }


  public VmTemplateWhereInput vcpu(Integer vcpu) {
    
    this.vcpu = vcpu;
    return this;
  }

   /**
   * Get vcpu
   * @return vcpu
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getVcpu() {
    return vcpu;
  }


  public void setVcpu(Integer vcpu) {
    this.vcpu = vcpu;
  }


  public VmTemplateWhereInput vcpuGt(Integer vcpuGt) {
    
    this.vcpuGt = vcpuGt;
    return this;
  }

   /**
   * Get vcpuGt
   * @return vcpuGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getVcpuGt() {
    return vcpuGt;
  }


  public void setVcpuGt(Integer vcpuGt) {
    this.vcpuGt = vcpuGt;
  }


  public VmTemplateWhereInput vcpuGte(Integer vcpuGte) {
    
    this.vcpuGte = vcpuGte;
    return this;
  }

   /**
   * Get vcpuGte
   * @return vcpuGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getVcpuGte() {
    return vcpuGte;
  }


  public void setVcpuGte(Integer vcpuGte) {
    this.vcpuGte = vcpuGte;
  }


  public VmTemplateWhereInput vcpuIn(List<Integer> vcpuIn) {
    
    this.vcpuIn = vcpuIn;
    return this;
  }

  public VmTemplateWhereInput addVcpuInItem(Integer vcpuInItem) {
    if (this.vcpuIn == null) {
      this.vcpuIn = new ArrayList<Integer>();
    }
    this.vcpuIn.add(vcpuInItem);
    return this;
  }

   /**
   * Get vcpuIn
   * @return vcpuIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Integer> getVcpuIn() {
    return vcpuIn;
  }


  public void setVcpuIn(List<Integer> vcpuIn) {
    this.vcpuIn = vcpuIn;
  }


  public VmTemplateWhereInput vcpuLt(Integer vcpuLt) {
    
    this.vcpuLt = vcpuLt;
    return this;
  }

   /**
   * Get vcpuLt
   * @return vcpuLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getVcpuLt() {
    return vcpuLt;
  }


  public void setVcpuLt(Integer vcpuLt) {
    this.vcpuLt = vcpuLt;
  }


  public VmTemplateWhereInput vcpuLte(Integer vcpuLte) {
    
    this.vcpuLte = vcpuLte;
    return this;
  }

   /**
   * Get vcpuLte
   * @return vcpuLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getVcpuLte() {
    return vcpuLte;
  }


  public void setVcpuLte(Integer vcpuLte) {
    this.vcpuLte = vcpuLte;
  }


  public VmTemplateWhereInput vcpuNot(Integer vcpuNot) {
    
    this.vcpuNot = vcpuNot;
    return this;
  }

   /**
   * Get vcpuNot
   * @return vcpuNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getVcpuNot() {
    return vcpuNot;
  }


  public void setVcpuNot(Integer vcpuNot) {
    this.vcpuNot = vcpuNot;
  }


  public VmTemplateWhereInput vcpuNotIn(List<Integer> vcpuNotIn) {
    
    this.vcpuNotIn = vcpuNotIn;
    return this;
  }

  public VmTemplateWhereInput addVcpuNotInItem(Integer vcpuNotInItem) {
    if (this.vcpuNotIn == null) {
      this.vcpuNotIn = new ArrayList<Integer>();
    }
    this.vcpuNotIn.add(vcpuNotInItem);
    return this;
  }

   /**
   * Get vcpuNotIn
   * @return vcpuNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Integer> getVcpuNotIn() {
    return vcpuNotIn;
  }


  public void setVcpuNotIn(List<Integer> vcpuNotIn) {
    this.vcpuNotIn = vcpuNotIn;
  }


  public VmTemplateWhereInput videoType(String videoType) {
    
    this.videoType = videoType;
    return this;
  }

   /**
   * Get videoType
   * @return videoType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getVideoType() {
    return videoType;
  }


  public void setVideoType(String videoType) {
    this.videoType = videoType;
  }


  public VmTemplateWhereInput videoTypeContains(String videoTypeContains) {
    
    this.videoTypeContains = videoTypeContains;
    return this;
  }

   /**
   * Get videoTypeContains
   * @return videoTypeContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getVideoTypeContains() {
    return videoTypeContains;
  }


  public void setVideoTypeContains(String videoTypeContains) {
    this.videoTypeContains = videoTypeContains;
  }


  public VmTemplateWhereInput videoTypeEndsWith(String videoTypeEndsWith) {
    
    this.videoTypeEndsWith = videoTypeEndsWith;
    return this;
  }

   /**
   * Get videoTypeEndsWith
   * @return videoTypeEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getVideoTypeEndsWith() {
    return videoTypeEndsWith;
  }


  public void setVideoTypeEndsWith(String videoTypeEndsWith) {
    this.videoTypeEndsWith = videoTypeEndsWith;
  }


  public VmTemplateWhereInput videoTypeGt(String videoTypeGt) {
    
    this.videoTypeGt = videoTypeGt;
    return this;
  }

   /**
   * Get videoTypeGt
   * @return videoTypeGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getVideoTypeGt() {
    return videoTypeGt;
  }


  public void setVideoTypeGt(String videoTypeGt) {
    this.videoTypeGt = videoTypeGt;
  }


  public VmTemplateWhereInput videoTypeGte(String videoTypeGte) {
    
    this.videoTypeGte = videoTypeGte;
    return this;
  }

   /**
   * Get videoTypeGte
   * @return videoTypeGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getVideoTypeGte() {
    return videoTypeGte;
  }


  public void setVideoTypeGte(String videoTypeGte) {
    this.videoTypeGte = videoTypeGte;
  }


  public VmTemplateWhereInput videoTypeIn(List<String> videoTypeIn) {
    
    this.videoTypeIn = videoTypeIn;
    return this;
  }

  public VmTemplateWhereInput addVideoTypeInItem(String videoTypeInItem) {
    if (this.videoTypeIn == null) {
      this.videoTypeIn = new ArrayList<String>();
    }
    this.videoTypeIn.add(videoTypeInItem);
    return this;
  }

   /**
   * Get videoTypeIn
   * @return videoTypeIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getVideoTypeIn() {
    return videoTypeIn;
  }


  public void setVideoTypeIn(List<String> videoTypeIn) {
    this.videoTypeIn = videoTypeIn;
  }


  public VmTemplateWhereInput videoTypeLt(String videoTypeLt) {
    
    this.videoTypeLt = videoTypeLt;
    return this;
  }

   /**
   * Get videoTypeLt
   * @return videoTypeLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getVideoTypeLt() {
    return videoTypeLt;
  }


  public void setVideoTypeLt(String videoTypeLt) {
    this.videoTypeLt = videoTypeLt;
  }


  public VmTemplateWhereInput videoTypeLte(String videoTypeLte) {
    
    this.videoTypeLte = videoTypeLte;
    return this;
  }

   /**
   * Get videoTypeLte
   * @return videoTypeLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getVideoTypeLte() {
    return videoTypeLte;
  }


  public void setVideoTypeLte(String videoTypeLte) {
    this.videoTypeLte = videoTypeLte;
  }


  public VmTemplateWhereInput videoTypeNot(String videoTypeNot) {
    
    this.videoTypeNot = videoTypeNot;
    return this;
  }

   /**
   * Get videoTypeNot
   * @return videoTypeNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getVideoTypeNot() {
    return videoTypeNot;
  }


  public void setVideoTypeNot(String videoTypeNot) {
    this.videoTypeNot = videoTypeNot;
  }


  public VmTemplateWhereInput videoTypeNotContains(String videoTypeNotContains) {
    
    this.videoTypeNotContains = videoTypeNotContains;
    return this;
  }

   /**
   * Get videoTypeNotContains
   * @return videoTypeNotContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getVideoTypeNotContains() {
    return videoTypeNotContains;
  }


  public void setVideoTypeNotContains(String videoTypeNotContains) {
    this.videoTypeNotContains = videoTypeNotContains;
  }


  public VmTemplateWhereInput videoTypeNotEndsWith(String videoTypeNotEndsWith) {
    
    this.videoTypeNotEndsWith = videoTypeNotEndsWith;
    return this;
  }

   /**
   * Get videoTypeNotEndsWith
   * @return videoTypeNotEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getVideoTypeNotEndsWith() {
    return videoTypeNotEndsWith;
  }


  public void setVideoTypeNotEndsWith(String videoTypeNotEndsWith) {
    this.videoTypeNotEndsWith = videoTypeNotEndsWith;
  }


  public VmTemplateWhereInput videoTypeNotIn(List<String> videoTypeNotIn) {
    
    this.videoTypeNotIn = videoTypeNotIn;
    return this;
  }

  public VmTemplateWhereInput addVideoTypeNotInItem(String videoTypeNotInItem) {
    if (this.videoTypeNotIn == null) {
      this.videoTypeNotIn = new ArrayList<String>();
    }
    this.videoTypeNotIn.add(videoTypeNotInItem);
    return this;
  }

   /**
   * Get videoTypeNotIn
   * @return videoTypeNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getVideoTypeNotIn() {
    return videoTypeNotIn;
  }


  public void setVideoTypeNotIn(List<String> videoTypeNotIn) {
    this.videoTypeNotIn = videoTypeNotIn;
  }


  public VmTemplateWhereInput videoTypeNotStartsWith(String videoTypeNotStartsWith) {
    
    this.videoTypeNotStartsWith = videoTypeNotStartsWith;
    return this;
  }

   /**
   * Get videoTypeNotStartsWith
   * @return videoTypeNotStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getVideoTypeNotStartsWith() {
    return videoTypeNotStartsWith;
  }


  public void setVideoTypeNotStartsWith(String videoTypeNotStartsWith) {
    this.videoTypeNotStartsWith = videoTypeNotStartsWith;
  }


  public VmTemplateWhereInput videoTypeStartsWith(String videoTypeStartsWith) {
    
    this.videoTypeStartsWith = videoTypeStartsWith;
    return this;
  }

   /**
   * Get videoTypeStartsWith
   * @return videoTypeStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getVideoTypeStartsWith() {
    return videoTypeStartsWith;
  }


  public void setVideoTypeStartsWith(String videoTypeStartsWith) {
    this.videoTypeStartsWith = videoTypeStartsWith;
  }


  public VmTemplateWhereInput winOpt(Boolean winOpt) {
    
    this.winOpt = winOpt;
    return this;
  }

   /**
   * Get winOpt
   * @return winOpt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getWinOpt() {
    return winOpt;
  }


  public void setWinOpt(Boolean winOpt) {
    this.winOpt = winOpt;
  }


  public VmTemplateWhereInput winOptNot(Boolean winOptNot) {
    
    this.winOptNot = winOptNot;
    return this;
  }

   /**
   * Get winOptNot
   * @return winOptNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getWinOptNot() {
    return winOptNot;
  }


  public void setWinOptNot(Boolean winOptNot) {
    this.winOptNot = winOptNot;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VmTemplateWhereInput vmTemplateWhereInput = (VmTemplateWhereInput) o;
    return Objects.equals(this.AND, vmTemplateWhereInput.AND) &&
        Objects.equals(this.NOT, vmTemplateWhereInput.NOT) &&
        Objects.equals(this.OR, vmTemplateWhereInput.OR) &&
        Objects.equals(this.clockOffset, vmTemplateWhereInput.clockOffset) &&
        Objects.equals(this.clockOffsetIn, vmTemplateWhereInput.clockOffsetIn) &&
        Objects.equals(this.clockOffsetNot, vmTemplateWhereInput.clockOffsetNot) &&
        Objects.equals(this.clockOffsetNotIn, vmTemplateWhereInput.clockOffsetNotIn) &&
        Objects.equals(this.cloudInitSupported, vmTemplateWhereInput.cloudInitSupported) &&
        Objects.equals(this.cloudInitSupportedNot, vmTemplateWhereInput.cloudInitSupportedNot) &&
        Objects.equals(this.cluster, vmTemplateWhereInput.cluster) &&
        Objects.equals(this.contentLibraryVmTemplate, vmTemplateWhereInput.contentLibraryVmTemplate) &&
        Objects.equals(this.cpuModel, vmTemplateWhereInput.cpuModel) &&
        Objects.equals(this.cpuModelContains, vmTemplateWhereInput.cpuModelContains) &&
        Objects.equals(this.cpuModelEndsWith, vmTemplateWhereInput.cpuModelEndsWith) &&
        Objects.equals(this.cpuModelGt, vmTemplateWhereInput.cpuModelGt) &&
        Objects.equals(this.cpuModelGte, vmTemplateWhereInput.cpuModelGte) &&
        Objects.equals(this.cpuModelIn, vmTemplateWhereInput.cpuModelIn) &&
        Objects.equals(this.cpuModelLt, vmTemplateWhereInput.cpuModelLt) &&
        Objects.equals(this.cpuModelLte, vmTemplateWhereInput.cpuModelLte) &&
        Objects.equals(this.cpuModelNot, vmTemplateWhereInput.cpuModelNot) &&
        Objects.equals(this.cpuModelNotContains, vmTemplateWhereInput.cpuModelNotContains) &&
        Objects.equals(this.cpuModelNotEndsWith, vmTemplateWhereInput.cpuModelNotEndsWith) &&
        Objects.equals(this.cpuModelNotIn, vmTemplateWhereInput.cpuModelNotIn) &&
        Objects.equals(this.cpuModelNotStartsWith, vmTemplateWhereInput.cpuModelNotStartsWith) &&
        Objects.equals(this.cpuModelStartsWith, vmTemplateWhereInput.cpuModelStartsWith) &&
        Objects.equals(this.description, vmTemplateWhereInput.description) &&
        Objects.equals(this.descriptionContains, vmTemplateWhereInput.descriptionContains) &&
        Objects.equals(this.descriptionEndsWith, vmTemplateWhereInput.descriptionEndsWith) &&
        Objects.equals(this.descriptionGt, vmTemplateWhereInput.descriptionGt) &&
        Objects.equals(this.descriptionGte, vmTemplateWhereInput.descriptionGte) &&
        Objects.equals(this.descriptionIn, vmTemplateWhereInput.descriptionIn) &&
        Objects.equals(this.descriptionLt, vmTemplateWhereInput.descriptionLt) &&
        Objects.equals(this.descriptionLte, vmTemplateWhereInput.descriptionLte) &&
        Objects.equals(this.descriptionNot, vmTemplateWhereInput.descriptionNot) &&
        Objects.equals(this.descriptionNotContains, vmTemplateWhereInput.descriptionNotContains) &&
        Objects.equals(this.descriptionNotEndsWith, vmTemplateWhereInput.descriptionNotEndsWith) &&
        Objects.equals(this.descriptionNotIn, vmTemplateWhereInput.descriptionNotIn) &&
        Objects.equals(this.descriptionNotStartsWith, vmTemplateWhereInput.descriptionNotStartsWith) &&
        Objects.equals(this.descriptionStartsWith, vmTemplateWhereInput.descriptionStartsWith) &&
        Objects.equals(this.entityAsyncStatus, vmTemplateWhereInput.entityAsyncStatus) &&
        Objects.equals(this.entityAsyncStatusIn, vmTemplateWhereInput.entityAsyncStatusIn) &&
        Objects.equals(this.entityAsyncStatusNot, vmTemplateWhereInput.entityAsyncStatusNot) &&
        Objects.equals(this.entityAsyncStatusNotIn, vmTemplateWhereInput.entityAsyncStatusNotIn) &&
        Objects.equals(this.firmware, vmTemplateWhereInput.firmware) &&
        Objects.equals(this.firmwareIn, vmTemplateWhereInput.firmwareIn) &&
        Objects.equals(this.firmwareNot, vmTemplateWhereInput.firmwareNot) &&
        Objects.equals(this.firmwareNotIn, vmTemplateWhereInput.firmwareNotIn) &&
        Objects.equals(this.ha, vmTemplateWhereInput.ha) &&
        Objects.equals(this.haNot, vmTemplateWhereInput.haNot) &&
        Objects.equals(this.id, vmTemplateWhereInput.id) &&
        Objects.equals(this.idContains, vmTemplateWhereInput.idContains) &&
        Objects.equals(this.idEndsWith, vmTemplateWhereInput.idEndsWith) &&
        Objects.equals(this.idGt, vmTemplateWhereInput.idGt) &&
        Objects.equals(this.idGte, vmTemplateWhereInput.idGte) &&
        Objects.equals(this.idIn, vmTemplateWhereInput.idIn) &&
        Objects.equals(this.idLt, vmTemplateWhereInput.idLt) &&
        Objects.equals(this.idLte, vmTemplateWhereInput.idLte) &&
        Objects.equals(this.idNot, vmTemplateWhereInput.idNot) &&
        Objects.equals(this.idNotContains, vmTemplateWhereInput.idNotContains) &&
        Objects.equals(this.idNotEndsWith, vmTemplateWhereInput.idNotEndsWith) &&
        Objects.equals(this.idNotIn, vmTemplateWhereInput.idNotIn) &&
        Objects.equals(this.idNotStartsWith, vmTemplateWhereInput.idNotStartsWith) &&
        Objects.equals(this.idStartsWith, vmTemplateWhereInput.idStartsWith) &&
        Objects.equals(this.ioPolicy, vmTemplateWhereInput.ioPolicy) &&
        Objects.equals(this.ioPolicyIn, vmTemplateWhereInput.ioPolicyIn) &&
        Objects.equals(this.ioPolicyNot, vmTemplateWhereInput.ioPolicyNot) &&
        Objects.equals(this.ioPolicyNotIn, vmTemplateWhereInput.ioPolicyNotIn) &&
        Objects.equals(this.labelsEvery, vmTemplateWhereInput.labelsEvery) &&
        Objects.equals(this.labelsNone, vmTemplateWhereInput.labelsNone) &&
        Objects.equals(this.labelsSome, vmTemplateWhereInput.labelsSome) &&
        Objects.equals(this.localCreatedAt, vmTemplateWhereInput.localCreatedAt) &&
        Objects.equals(this.localCreatedAtGt, vmTemplateWhereInput.localCreatedAtGt) &&
        Objects.equals(this.localCreatedAtGte, vmTemplateWhereInput.localCreatedAtGte) &&
        Objects.equals(this.localCreatedAtIn, vmTemplateWhereInput.localCreatedAtIn) &&
        Objects.equals(this.localCreatedAtLt, vmTemplateWhereInput.localCreatedAtLt) &&
        Objects.equals(this.localCreatedAtLte, vmTemplateWhereInput.localCreatedAtLte) &&
        Objects.equals(this.localCreatedAtNot, vmTemplateWhereInput.localCreatedAtNot) &&
        Objects.equals(this.localCreatedAtNotIn, vmTemplateWhereInput.localCreatedAtNotIn) &&
        Objects.equals(this.localId, vmTemplateWhereInput.localId) &&
        Objects.equals(this.localIdContains, vmTemplateWhereInput.localIdContains) &&
        Objects.equals(this.localIdEndsWith, vmTemplateWhereInput.localIdEndsWith) &&
        Objects.equals(this.localIdGt, vmTemplateWhereInput.localIdGt) &&
        Objects.equals(this.localIdGte, vmTemplateWhereInput.localIdGte) &&
        Objects.equals(this.localIdIn, vmTemplateWhereInput.localIdIn) &&
        Objects.equals(this.localIdLt, vmTemplateWhereInput.localIdLt) &&
        Objects.equals(this.localIdLte, vmTemplateWhereInput.localIdLte) &&
        Objects.equals(this.localIdNot, vmTemplateWhereInput.localIdNot) &&
        Objects.equals(this.localIdNotContains, vmTemplateWhereInput.localIdNotContains) &&
        Objects.equals(this.localIdNotEndsWith, vmTemplateWhereInput.localIdNotEndsWith) &&
        Objects.equals(this.localIdNotIn, vmTemplateWhereInput.localIdNotIn) &&
        Objects.equals(this.localIdNotStartsWith, vmTemplateWhereInput.localIdNotStartsWith) &&
        Objects.equals(this.localIdStartsWith, vmTemplateWhereInput.localIdStartsWith) &&
        Objects.equals(this.maxBandwidth, vmTemplateWhereInput.maxBandwidth) &&
        Objects.equals(this.maxBandwidthGt, vmTemplateWhereInput.maxBandwidthGt) &&
        Objects.equals(this.maxBandwidthGte, vmTemplateWhereInput.maxBandwidthGte) &&
        Objects.equals(this.maxBandwidthIn, vmTemplateWhereInput.maxBandwidthIn) &&
        Objects.equals(this.maxBandwidthLt, vmTemplateWhereInput.maxBandwidthLt) &&
        Objects.equals(this.maxBandwidthLte, vmTemplateWhereInput.maxBandwidthLte) &&
        Objects.equals(this.maxBandwidthNot, vmTemplateWhereInput.maxBandwidthNot) &&
        Objects.equals(this.maxBandwidthNotIn, vmTemplateWhereInput.maxBandwidthNotIn) &&
        Objects.equals(this.maxBandwidthPolicy, vmTemplateWhereInput.maxBandwidthPolicy) &&
        Objects.equals(this.maxBandwidthPolicyIn, vmTemplateWhereInput.maxBandwidthPolicyIn) &&
        Objects.equals(this.maxBandwidthPolicyNot, vmTemplateWhereInput.maxBandwidthPolicyNot) &&
        Objects.equals(this.maxBandwidthPolicyNotIn, vmTemplateWhereInput.maxBandwidthPolicyNotIn) &&
        Objects.equals(this.maxIops, vmTemplateWhereInput.maxIops) &&
        Objects.equals(this.maxIopsGt, vmTemplateWhereInput.maxIopsGt) &&
        Objects.equals(this.maxIopsGte, vmTemplateWhereInput.maxIopsGte) &&
        Objects.equals(this.maxIopsIn, vmTemplateWhereInput.maxIopsIn) &&
        Objects.equals(this.maxIopsLt, vmTemplateWhereInput.maxIopsLt) &&
        Objects.equals(this.maxIopsLte, vmTemplateWhereInput.maxIopsLte) &&
        Objects.equals(this.maxIopsNot, vmTemplateWhereInput.maxIopsNot) &&
        Objects.equals(this.maxIopsNotIn, vmTemplateWhereInput.maxIopsNotIn) &&
        Objects.equals(this.maxIopsPolicy, vmTemplateWhereInput.maxIopsPolicy) &&
        Objects.equals(this.maxIopsPolicyIn, vmTemplateWhereInput.maxIopsPolicyIn) &&
        Objects.equals(this.maxIopsPolicyNot, vmTemplateWhereInput.maxIopsPolicyNot) &&
        Objects.equals(this.maxIopsPolicyNotIn, vmTemplateWhereInput.maxIopsPolicyNotIn) &&
        Objects.equals(this.memory, vmTemplateWhereInput.memory) &&
        Objects.equals(this.memoryGt, vmTemplateWhereInput.memoryGt) &&
        Objects.equals(this.memoryGte, vmTemplateWhereInput.memoryGte) &&
        Objects.equals(this.memoryIn, vmTemplateWhereInput.memoryIn) &&
        Objects.equals(this.memoryLt, vmTemplateWhereInput.memoryLt) &&
        Objects.equals(this.memoryLte, vmTemplateWhereInput.memoryLte) &&
        Objects.equals(this.memoryNot, vmTemplateWhereInput.memoryNot) &&
        Objects.equals(this.memoryNotIn, vmTemplateWhereInput.memoryNotIn) &&
        Objects.equals(this.name, vmTemplateWhereInput.name) &&
        Objects.equals(this.nameContains, vmTemplateWhereInput.nameContains) &&
        Objects.equals(this.nameEndsWith, vmTemplateWhereInput.nameEndsWith) &&
        Objects.equals(this.nameGt, vmTemplateWhereInput.nameGt) &&
        Objects.equals(this.nameGte, vmTemplateWhereInput.nameGte) &&
        Objects.equals(this.nameIn, vmTemplateWhereInput.nameIn) &&
        Objects.equals(this.nameLt, vmTemplateWhereInput.nameLt) &&
        Objects.equals(this.nameLte, vmTemplateWhereInput.nameLte) &&
        Objects.equals(this.nameNot, vmTemplateWhereInput.nameNot) &&
        Objects.equals(this.nameNotContains, vmTemplateWhereInput.nameNotContains) &&
        Objects.equals(this.nameNotEndsWith, vmTemplateWhereInput.nameNotEndsWith) &&
        Objects.equals(this.nameNotIn, vmTemplateWhereInput.nameNotIn) &&
        Objects.equals(this.nameNotStartsWith, vmTemplateWhereInput.nameNotStartsWith) &&
        Objects.equals(this.nameStartsWith, vmTemplateWhereInput.nameStartsWith) &&
        Objects.equals(this.size, vmTemplateWhereInput.size) &&
        Objects.equals(this.sizeGt, vmTemplateWhereInput.sizeGt) &&
        Objects.equals(this.sizeGte, vmTemplateWhereInput.sizeGte) &&
        Objects.equals(this.sizeIn, vmTemplateWhereInput.sizeIn) &&
        Objects.equals(this.sizeLt, vmTemplateWhereInput.sizeLt) &&
        Objects.equals(this.sizeLte, vmTemplateWhereInput.sizeLte) &&
        Objects.equals(this.sizeNot, vmTemplateWhereInput.sizeNot) &&
        Objects.equals(this.sizeNotIn, vmTemplateWhereInput.sizeNotIn) &&
        Objects.equals(this.vcpu, vmTemplateWhereInput.vcpu) &&
        Objects.equals(this.vcpuGt, vmTemplateWhereInput.vcpuGt) &&
        Objects.equals(this.vcpuGte, vmTemplateWhereInput.vcpuGte) &&
        Objects.equals(this.vcpuIn, vmTemplateWhereInput.vcpuIn) &&
        Objects.equals(this.vcpuLt, vmTemplateWhereInput.vcpuLt) &&
        Objects.equals(this.vcpuLte, vmTemplateWhereInput.vcpuLte) &&
        Objects.equals(this.vcpuNot, vmTemplateWhereInput.vcpuNot) &&
        Objects.equals(this.vcpuNotIn, vmTemplateWhereInput.vcpuNotIn) &&
        Objects.equals(this.videoType, vmTemplateWhereInput.videoType) &&
        Objects.equals(this.videoTypeContains, vmTemplateWhereInput.videoTypeContains) &&
        Objects.equals(this.videoTypeEndsWith, vmTemplateWhereInput.videoTypeEndsWith) &&
        Objects.equals(this.videoTypeGt, vmTemplateWhereInput.videoTypeGt) &&
        Objects.equals(this.videoTypeGte, vmTemplateWhereInput.videoTypeGte) &&
        Objects.equals(this.videoTypeIn, vmTemplateWhereInput.videoTypeIn) &&
        Objects.equals(this.videoTypeLt, vmTemplateWhereInput.videoTypeLt) &&
        Objects.equals(this.videoTypeLte, vmTemplateWhereInput.videoTypeLte) &&
        Objects.equals(this.videoTypeNot, vmTemplateWhereInput.videoTypeNot) &&
        Objects.equals(this.videoTypeNotContains, vmTemplateWhereInput.videoTypeNotContains) &&
        Objects.equals(this.videoTypeNotEndsWith, vmTemplateWhereInput.videoTypeNotEndsWith) &&
        Objects.equals(this.videoTypeNotIn, vmTemplateWhereInput.videoTypeNotIn) &&
        Objects.equals(this.videoTypeNotStartsWith, vmTemplateWhereInput.videoTypeNotStartsWith) &&
        Objects.equals(this.videoTypeStartsWith, vmTemplateWhereInput.videoTypeStartsWith) &&
        Objects.equals(this.winOpt, vmTemplateWhereInput.winOpt) &&
        Objects.equals(this.winOptNot, vmTemplateWhereInput.winOptNot);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(AND, NOT, OR, clockOffset, clockOffsetIn, clockOffsetNot, clockOffsetNotIn, cloudInitSupported, cloudInitSupportedNot, cluster, contentLibraryVmTemplate, cpuModel, cpuModelContains, cpuModelEndsWith, cpuModelGt, cpuModelGte, cpuModelIn, cpuModelLt, cpuModelLte, cpuModelNot, cpuModelNotContains, cpuModelNotEndsWith, cpuModelNotIn, cpuModelNotStartsWith, cpuModelStartsWith, description, descriptionContains, descriptionEndsWith, descriptionGt, descriptionGte, descriptionIn, descriptionLt, descriptionLte, descriptionNot, descriptionNotContains, descriptionNotEndsWith, descriptionNotIn, descriptionNotStartsWith, descriptionStartsWith, entityAsyncStatus, entityAsyncStatusIn, entityAsyncStatusNot, entityAsyncStatusNotIn, firmware, firmwareIn, firmwareNot, firmwareNotIn, ha, haNot, id, idContains, idEndsWith, idGt, idGte, idIn, idLt, idLte, idNot, idNotContains, idNotEndsWith, idNotIn, idNotStartsWith, idStartsWith, ioPolicy, ioPolicyIn, ioPolicyNot, ioPolicyNotIn, labelsEvery, labelsNone, labelsSome, localCreatedAt, localCreatedAtGt, localCreatedAtGte, localCreatedAtIn, localCreatedAtLt, localCreatedAtLte, localCreatedAtNot, localCreatedAtNotIn, localId, localIdContains, localIdEndsWith, localIdGt, localIdGte, localIdIn, localIdLt, localIdLte, localIdNot, localIdNotContains, localIdNotEndsWith, localIdNotIn, localIdNotStartsWith, localIdStartsWith, maxBandwidth, maxBandwidthGt, maxBandwidthGte, maxBandwidthIn, maxBandwidthLt, maxBandwidthLte, maxBandwidthNot, maxBandwidthNotIn, maxBandwidthPolicy, maxBandwidthPolicyIn, maxBandwidthPolicyNot, maxBandwidthPolicyNotIn, maxIops, maxIopsGt, maxIopsGte, maxIopsIn, maxIopsLt, maxIopsLte, maxIopsNot, maxIopsNotIn, maxIopsPolicy, maxIopsPolicyIn, maxIopsPolicyNot, maxIopsPolicyNotIn, memory, memoryGt, memoryGte, memoryIn, memoryLt, memoryLte, memoryNot, memoryNotIn, name, nameContains, nameEndsWith, nameGt, nameGte, nameIn, nameLt, nameLte, nameNot, nameNotContains, nameNotEndsWith, nameNotIn, nameNotStartsWith, nameStartsWith, size, sizeGt, sizeGte, sizeIn, sizeLt, sizeLte, sizeNot, sizeNotIn, vcpu, vcpuGt, vcpuGte, vcpuIn, vcpuLt, vcpuLte, vcpuNot, vcpuNotIn, videoType, videoTypeContains, videoTypeEndsWith, videoTypeGt, videoTypeGte, videoTypeIn, videoTypeLt, videoTypeLte, videoTypeNot, videoTypeNotContains, videoTypeNotEndsWith, videoTypeNotIn, videoTypeNotStartsWith, videoTypeStartsWith, winOpt, winOptNot);
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
    sb.append("class VmTemplateWhereInput {\n");
    sb.append("    AND: ").append(toIndentedString(AND)).append("\n");
    sb.append("    NOT: ").append(toIndentedString(NOT)).append("\n");
    sb.append("    OR: ").append(toIndentedString(OR)).append("\n");
    sb.append("    clockOffset: ").append(toIndentedString(clockOffset)).append("\n");
    sb.append("    clockOffsetIn: ").append(toIndentedString(clockOffsetIn)).append("\n");
    sb.append("    clockOffsetNot: ").append(toIndentedString(clockOffsetNot)).append("\n");
    sb.append("    clockOffsetNotIn: ").append(toIndentedString(clockOffsetNotIn)).append("\n");
    sb.append("    cloudInitSupported: ").append(toIndentedString(cloudInitSupported)).append("\n");
    sb.append("    cloudInitSupportedNot: ").append(toIndentedString(cloudInitSupportedNot)).append("\n");
    sb.append("    cluster: ").append(toIndentedString(cluster)).append("\n");
    sb.append("    contentLibraryVmTemplate: ").append(toIndentedString(contentLibraryVmTemplate)).append("\n");
    sb.append("    cpuModel: ").append(toIndentedString(cpuModel)).append("\n");
    sb.append("    cpuModelContains: ").append(toIndentedString(cpuModelContains)).append("\n");
    sb.append("    cpuModelEndsWith: ").append(toIndentedString(cpuModelEndsWith)).append("\n");
    sb.append("    cpuModelGt: ").append(toIndentedString(cpuModelGt)).append("\n");
    sb.append("    cpuModelGte: ").append(toIndentedString(cpuModelGte)).append("\n");
    sb.append("    cpuModelIn: ").append(toIndentedString(cpuModelIn)).append("\n");
    sb.append("    cpuModelLt: ").append(toIndentedString(cpuModelLt)).append("\n");
    sb.append("    cpuModelLte: ").append(toIndentedString(cpuModelLte)).append("\n");
    sb.append("    cpuModelNot: ").append(toIndentedString(cpuModelNot)).append("\n");
    sb.append("    cpuModelNotContains: ").append(toIndentedString(cpuModelNotContains)).append("\n");
    sb.append("    cpuModelNotEndsWith: ").append(toIndentedString(cpuModelNotEndsWith)).append("\n");
    sb.append("    cpuModelNotIn: ").append(toIndentedString(cpuModelNotIn)).append("\n");
    sb.append("    cpuModelNotStartsWith: ").append(toIndentedString(cpuModelNotStartsWith)).append("\n");
    sb.append("    cpuModelStartsWith: ").append(toIndentedString(cpuModelStartsWith)).append("\n");
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
    sb.append("    firmware: ").append(toIndentedString(firmware)).append("\n");
    sb.append("    firmwareIn: ").append(toIndentedString(firmwareIn)).append("\n");
    sb.append("    firmwareNot: ").append(toIndentedString(firmwareNot)).append("\n");
    sb.append("    firmwareNotIn: ").append(toIndentedString(firmwareNotIn)).append("\n");
    sb.append("    ha: ").append(toIndentedString(ha)).append("\n");
    sb.append("    haNot: ").append(toIndentedString(haNot)).append("\n");
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
    sb.append("    ioPolicy: ").append(toIndentedString(ioPolicy)).append("\n");
    sb.append("    ioPolicyIn: ").append(toIndentedString(ioPolicyIn)).append("\n");
    sb.append("    ioPolicyNot: ").append(toIndentedString(ioPolicyNot)).append("\n");
    sb.append("    ioPolicyNotIn: ").append(toIndentedString(ioPolicyNotIn)).append("\n");
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
    sb.append("    maxBandwidth: ").append(toIndentedString(maxBandwidth)).append("\n");
    sb.append("    maxBandwidthGt: ").append(toIndentedString(maxBandwidthGt)).append("\n");
    sb.append("    maxBandwidthGte: ").append(toIndentedString(maxBandwidthGte)).append("\n");
    sb.append("    maxBandwidthIn: ").append(toIndentedString(maxBandwidthIn)).append("\n");
    sb.append("    maxBandwidthLt: ").append(toIndentedString(maxBandwidthLt)).append("\n");
    sb.append("    maxBandwidthLte: ").append(toIndentedString(maxBandwidthLte)).append("\n");
    sb.append("    maxBandwidthNot: ").append(toIndentedString(maxBandwidthNot)).append("\n");
    sb.append("    maxBandwidthNotIn: ").append(toIndentedString(maxBandwidthNotIn)).append("\n");
    sb.append("    maxBandwidthPolicy: ").append(toIndentedString(maxBandwidthPolicy)).append("\n");
    sb.append("    maxBandwidthPolicyIn: ").append(toIndentedString(maxBandwidthPolicyIn)).append("\n");
    sb.append("    maxBandwidthPolicyNot: ").append(toIndentedString(maxBandwidthPolicyNot)).append("\n");
    sb.append("    maxBandwidthPolicyNotIn: ").append(toIndentedString(maxBandwidthPolicyNotIn)).append("\n");
    sb.append("    maxIops: ").append(toIndentedString(maxIops)).append("\n");
    sb.append("    maxIopsGt: ").append(toIndentedString(maxIopsGt)).append("\n");
    sb.append("    maxIopsGte: ").append(toIndentedString(maxIopsGte)).append("\n");
    sb.append("    maxIopsIn: ").append(toIndentedString(maxIopsIn)).append("\n");
    sb.append("    maxIopsLt: ").append(toIndentedString(maxIopsLt)).append("\n");
    sb.append("    maxIopsLte: ").append(toIndentedString(maxIopsLte)).append("\n");
    sb.append("    maxIopsNot: ").append(toIndentedString(maxIopsNot)).append("\n");
    sb.append("    maxIopsNotIn: ").append(toIndentedString(maxIopsNotIn)).append("\n");
    sb.append("    maxIopsPolicy: ").append(toIndentedString(maxIopsPolicy)).append("\n");
    sb.append("    maxIopsPolicyIn: ").append(toIndentedString(maxIopsPolicyIn)).append("\n");
    sb.append("    maxIopsPolicyNot: ").append(toIndentedString(maxIopsPolicyNot)).append("\n");
    sb.append("    maxIopsPolicyNotIn: ").append(toIndentedString(maxIopsPolicyNotIn)).append("\n");
    sb.append("    memory: ").append(toIndentedString(memory)).append("\n");
    sb.append("    memoryGt: ").append(toIndentedString(memoryGt)).append("\n");
    sb.append("    memoryGte: ").append(toIndentedString(memoryGte)).append("\n");
    sb.append("    memoryIn: ").append(toIndentedString(memoryIn)).append("\n");
    sb.append("    memoryLt: ").append(toIndentedString(memoryLt)).append("\n");
    sb.append("    memoryLte: ").append(toIndentedString(memoryLte)).append("\n");
    sb.append("    memoryNot: ").append(toIndentedString(memoryNot)).append("\n");
    sb.append("    memoryNotIn: ").append(toIndentedString(memoryNotIn)).append("\n");
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
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    sizeGt: ").append(toIndentedString(sizeGt)).append("\n");
    sb.append("    sizeGte: ").append(toIndentedString(sizeGte)).append("\n");
    sb.append("    sizeIn: ").append(toIndentedString(sizeIn)).append("\n");
    sb.append("    sizeLt: ").append(toIndentedString(sizeLt)).append("\n");
    sb.append("    sizeLte: ").append(toIndentedString(sizeLte)).append("\n");
    sb.append("    sizeNot: ").append(toIndentedString(sizeNot)).append("\n");
    sb.append("    sizeNotIn: ").append(toIndentedString(sizeNotIn)).append("\n");
    sb.append("    vcpu: ").append(toIndentedString(vcpu)).append("\n");
    sb.append("    vcpuGt: ").append(toIndentedString(vcpuGt)).append("\n");
    sb.append("    vcpuGte: ").append(toIndentedString(vcpuGte)).append("\n");
    sb.append("    vcpuIn: ").append(toIndentedString(vcpuIn)).append("\n");
    sb.append("    vcpuLt: ").append(toIndentedString(vcpuLt)).append("\n");
    sb.append("    vcpuLte: ").append(toIndentedString(vcpuLte)).append("\n");
    sb.append("    vcpuNot: ").append(toIndentedString(vcpuNot)).append("\n");
    sb.append("    vcpuNotIn: ").append(toIndentedString(vcpuNotIn)).append("\n");
    sb.append("    videoType: ").append(toIndentedString(videoType)).append("\n");
    sb.append("    videoTypeContains: ").append(toIndentedString(videoTypeContains)).append("\n");
    sb.append("    videoTypeEndsWith: ").append(toIndentedString(videoTypeEndsWith)).append("\n");
    sb.append("    videoTypeGt: ").append(toIndentedString(videoTypeGt)).append("\n");
    sb.append("    videoTypeGte: ").append(toIndentedString(videoTypeGte)).append("\n");
    sb.append("    videoTypeIn: ").append(toIndentedString(videoTypeIn)).append("\n");
    sb.append("    videoTypeLt: ").append(toIndentedString(videoTypeLt)).append("\n");
    sb.append("    videoTypeLte: ").append(toIndentedString(videoTypeLte)).append("\n");
    sb.append("    videoTypeNot: ").append(toIndentedString(videoTypeNot)).append("\n");
    sb.append("    videoTypeNotContains: ").append(toIndentedString(videoTypeNotContains)).append("\n");
    sb.append("    videoTypeNotEndsWith: ").append(toIndentedString(videoTypeNotEndsWith)).append("\n");
    sb.append("    videoTypeNotIn: ").append(toIndentedString(videoTypeNotIn)).append("\n");
    sb.append("    videoTypeNotStartsWith: ").append(toIndentedString(videoTypeNotStartsWith)).append("\n");
    sb.append("    videoTypeStartsWith: ").append(toIndentedString(videoTypeStartsWith)).append("\n");
    sb.append("    winOpt: ").append(toIndentedString(winOpt)).append("\n");
    sb.append("    winOptNot: ").append(toIndentedString(winOptNot)).append("\n");
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

