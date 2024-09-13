package com.arcfra.aoc.model;

import java.util.Objects;
import java.util.Arrays;
import com.arcfra.aoc.model.ClusterWhereInput;
import com.arcfra.aoc.model.EntityAsyncStatus;
import com.arcfra.aoc.model.GpuDeviceWhereInput;
import com.arcfra.aoc.model.HostWhereInput;
import com.arcfra.aoc.model.LabelWhereInput;
import com.arcfra.aoc.model.NicWhereInput;
import com.arcfra.aoc.model.UsbDeviceWhereInput;
import com.arcfra.aoc.model.VmClockOffset;
import com.arcfra.aoc.model.VmDiskIoPolicy;
import com.arcfra.aoc.model.VmDiskIoRestrictType;
import com.arcfra.aoc.model.VmDiskWhereInput;
import com.arcfra.aoc.model.VmFirmware;
import com.arcfra.aoc.model.VmFolderWhereInput;
import com.arcfra.aoc.model.VmGuestsOperationSystem;
import com.arcfra.aoc.model.VmNicWhereInput;
import com.arcfra.aoc.model.VmPlacementGroupWhereInput;
import com.arcfra.aoc.model.VmSnapshotWhereInput;
import com.arcfra.aoc.model.VmStatus;
import com.arcfra.aoc.model.VmToolsStatus;
import com.arcfra.aoc.model.VmUsage;
import com.arcfra.aoc.model.VmVideoType;
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
 * VmWhereInput
 */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class VmWhereInput {
  public static final String SERIALIZED_NAME_A_N_D = "AND";
  @SerializedName(SERIALIZED_NAME_A_N_D)
  private List<VmWhereInput> AND = null;

  public static final String SERIALIZED_NAME_N_O_T = "NOT";
  @SerializedName(SERIALIZED_NAME_N_O_T)
  private List<VmWhereInput> NOT = null;

  public static final String SERIALIZED_NAME_O_R = "OR";
  @SerializedName(SERIALIZED_NAME_O_R)
  private List<VmWhereInput> OR = null;

  public static final String SERIALIZED_NAME_BIOS_UUID = "bios_uuid";
  @SerializedName(SERIALIZED_NAME_BIOS_UUID)
  private String biosUuid;

  public static final String SERIALIZED_NAME_BIOS_UUID_CONTAINS = "bios_uuid_contains";
  @SerializedName(SERIALIZED_NAME_BIOS_UUID_CONTAINS)
  private String biosUuidContains;

  public static final String SERIALIZED_NAME_BIOS_UUID_ENDS_WITH = "bios_uuid_ends_with";
  @SerializedName(SERIALIZED_NAME_BIOS_UUID_ENDS_WITH)
  private String biosUuidEndsWith;

  public static final String SERIALIZED_NAME_BIOS_UUID_GT = "bios_uuid_gt";
  @SerializedName(SERIALIZED_NAME_BIOS_UUID_GT)
  private String biosUuidGt;

  public static final String SERIALIZED_NAME_BIOS_UUID_GTE = "bios_uuid_gte";
  @SerializedName(SERIALIZED_NAME_BIOS_UUID_GTE)
  private String biosUuidGte;

  public static final String SERIALIZED_NAME_BIOS_UUID_IN = "bios_uuid_in";
  @SerializedName(SERIALIZED_NAME_BIOS_UUID_IN)
  private List<String> biosUuidIn = null;

  public static final String SERIALIZED_NAME_BIOS_UUID_LT = "bios_uuid_lt";
  @SerializedName(SERIALIZED_NAME_BIOS_UUID_LT)
  private String biosUuidLt;

  public static final String SERIALIZED_NAME_BIOS_UUID_LTE = "bios_uuid_lte";
  @SerializedName(SERIALIZED_NAME_BIOS_UUID_LTE)
  private String biosUuidLte;

  public static final String SERIALIZED_NAME_BIOS_UUID_NOT = "bios_uuid_not";
  @SerializedName(SERIALIZED_NAME_BIOS_UUID_NOT)
  private String biosUuidNot;

  public static final String SERIALIZED_NAME_BIOS_UUID_NOT_CONTAINS = "bios_uuid_not_contains";
  @SerializedName(SERIALIZED_NAME_BIOS_UUID_NOT_CONTAINS)
  private String biosUuidNotContains;

  public static final String SERIALIZED_NAME_BIOS_UUID_NOT_ENDS_WITH = "bios_uuid_not_ends_with";
  @SerializedName(SERIALIZED_NAME_BIOS_UUID_NOT_ENDS_WITH)
  private String biosUuidNotEndsWith;

  public static final String SERIALIZED_NAME_BIOS_UUID_NOT_IN = "bios_uuid_not_in";
  @SerializedName(SERIALIZED_NAME_BIOS_UUID_NOT_IN)
  private List<String> biosUuidNotIn = null;

  public static final String SERIALIZED_NAME_BIOS_UUID_NOT_STARTS_WITH = "bios_uuid_not_starts_with";
  @SerializedName(SERIALIZED_NAME_BIOS_UUID_NOT_STARTS_WITH)
  private String biosUuidNotStartsWith;

  public static final String SERIALIZED_NAME_BIOS_UUID_STARTS_WITH = "bios_uuid_starts_with";
  @SerializedName(SERIALIZED_NAME_BIOS_UUID_STARTS_WITH)
  private String biosUuidStartsWith;

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

  public static final String SERIALIZED_NAME_CPU_USAGE = "cpu_usage";
  @SerializedName(SERIALIZED_NAME_CPU_USAGE)
  private Double cpuUsage;

  public static final String SERIALIZED_NAME_CPU_USAGE_GT = "cpu_usage_gt";
  @SerializedName(SERIALIZED_NAME_CPU_USAGE_GT)
  private Double cpuUsageGt;

  public static final String SERIALIZED_NAME_CPU_USAGE_GTE = "cpu_usage_gte";
  @SerializedName(SERIALIZED_NAME_CPU_USAGE_GTE)
  private Double cpuUsageGte;

  public static final String SERIALIZED_NAME_CPU_USAGE_IN = "cpu_usage_in";
  @SerializedName(SERIALIZED_NAME_CPU_USAGE_IN)
  private List<Double> cpuUsageIn = null;

  public static final String SERIALIZED_NAME_CPU_USAGE_LT = "cpu_usage_lt";
  @SerializedName(SERIALIZED_NAME_CPU_USAGE_LT)
  private Double cpuUsageLt;

  public static final String SERIALIZED_NAME_CPU_USAGE_LTE = "cpu_usage_lte";
  @SerializedName(SERIALIZED_NAME_CPU_USAGE_LTE)
  private Double cpuUsageLte;

  public static final String SERIALIZED_NAME_CPU_USAGE_NOT = "cpu_usage_not";
  @SerializedName(SERIALIZED_NAME_CPU_USAGE_NOT)
  private Double cpuUsageNot;

  public static final String SERIALIZED_NAME_CPU_USAGE_NOT_IN = "cpu_usage_not_in";
  @SerializedName(SERIALIZED_NAME_CPU_USAGE_NOT_IN)
  private List<Double> cpuUsageNotIn = null;

  public static final String SERIALIZED_NAME_DELETED_AT = "deleted_at";
  @SerializedName(SERIALIZED_NAME_DELETED_AT)
  private String deletedAt;

  public static final String SERIALIZED_NAME_DELETED_AT_GT = "deleted_at_gt";
  @SerializedName(SERIALIZED_NAME_DELETED_AT_GT)
  private String deletedAtGt;

  public static final String SERIALIZED_NAME_DELETED_AT_GTE = "deleted_at_gte";
  @SerializedName(SERIALIZED_NAME_DELETED_AT_GTE)
  private String deletedAtGte;

  public static final String SERIALIZED_NAME_DELETED_AT_IN = "deleted_at_in";
  @SerializedName(SERIALIZED_NAME_DELETED_AT_IN)
  private List<String> deletedAtIn = null;

  public static final String SERIALIZED_NAME_DELETED_AT_LT = "deleted_at_lt";
  @SerializedName(SERIALIZED_NAME_DELETED_AT_LT)
  private String deletedAtLt;

  public static final String SERIALIZED_NAME_DELETED_AT_LTE = "deleted_at_lte";
  @SerializedName(SERIALIZED_NAME_DELETED_AT_LTE)
  private String deletedAtLte;

  public static final String SERIALIZED_NAME_DELETED_AT_NOT = "deleted_at_not";
  @SerializedName(SERIALIZED_NAME_DELETED_AT_NOT)
  private String deletedAtNot;

  public static final String SERIALIZED_NAME_DELETED_AT_NOT_IN = "deleted_at_not_in";
  @SerializedName(SERIALIZED_NAME_DELETED_AT_NOT_IN)
  private List<String> deletedAtNotIn = null;

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

  public static final String SERIALIZED_NAME_DNS_SERVERS = "dns_servers";
  @SerializedName(SERIALIZED_NAME_DNS_SERVERS)
  private String dnsServers;

  public static final String SERIALIZED_NAME_DNS_SERVERS_CONTAINS = "dns_servers_contains";
  @SerializedName(SERIALIZED_NAME_DNS_SERVERS_CONTAINS)
  private String dnsServersContains;

  public static final String SERIALIZED_NAME_DNS_SERVERS_ENDS_WITH = "dns_servers_ends_with";
  @SerializedName(SERIALIZED_NAME_DNS_SERVERS_ENDS_WITH)
  private String dnsServersEndsWith;

  public static final String SERIALIZED_NAME_DNS_SERVERS_GT = "dns_servers_gt";
  @SerializedName(SERIALIZED_NAME_DNS_SERVERS_GT)
  private String dnsServersGt;

  public static final String SERIALIZED_NAME_DNS_SERVERS_GTE = "dns_servers_gte";
  @SerializedName(SERIALIZED_NAME_DNS_SERVERS_GTE)
  private String dnsServersGte;

  public static final String SERIALIZED_NAME_DNS_SERVERS_IN = "dns_servers_in";
  @SerializedName(SERIALIZED_NAME_DNS_SERVERS_IN)
  private List<String> dnsServersIn = null;

  public static final String SERIALIZED_NAME_DNS_SERVERS_LT = "dns_servers_lt";
  @SerializedName(SERIALIZED_NAME_DNS_SERVERS_LT)
  private String dnsServersLt;

  public static final String SERIALIZED_NAME_DNS_SERVERS_LTE = "dns_servers_lte";
  @SerializedName(SERIALIZED_NAME_DNS_SERVERS_LTE)
  private String dnsServersLte;

  public static final String SERIALIZED_NAME_DNS_SERVERS_NOT = "dns_servers_not";
  @SerializedName(SERIALIZED_NAME_DNS_SERVERS_NOT)
  private String dnsServersNot;

  public static final String SERIALIZED_NAME_DNS_SERVERS_NOT_CONTAINS = "dns_servers_not_contains";
  @SerializedName(SERIALIZED_NAME_DNS_SERVERS_NOT_CONTAINS)
  private String dnsServersNotContains;

  public static final String SERIALIZED_NAME_DNS_SERVERS_NOT_ENDS_WITH = "dns_servers_not_ends_with";
  @SerializedName(SERIALIZED_NAME_DNS_SERVERS_NOT_ENDS_WITH)
  private String dnsServersNotEndsWith;

  public static final String SERIALIZED_NAME_DNS_SERVERS_NOT_IN = "dns_servers_not_in";
  @SerializedName(SERIALIZED_NAME_DNS_SERVERS_NOT_IN)
  private List<String> dnsServersNotIn = null;

  public static final String SERIALIZED_NAME_DNS_SERVERS_NOT_STARTS_WITH = "dns_servers_not_starts_with";
  @SerializedName(SERIALIZED_NAME_DNS_SERVERS_NOT_STARTS_WITH)
  private String dnsServersNotStartsWith;

  public static final String SERIALIZED_NAME_DNS_SERVERS_STARTS_WITH = "dns_servers_starts_with";
  @SerializedName(SERIALIZED_NAME_DNS_SERVERS_STARTS_WITH)
  private String dnsServersStartsWith;

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

  public static final String SERIALIZED_NAME_FOLDER = "folder";
  @SerializedName(SERIALIZED_NAME_FOLDER)
  private VmFolderWhereInput folder;

  public static final String SERIALIZED_NAME_GPU_DEVICES_EVERY = "gpu_devices_every";
  @SerializedName(SERIALIZED_NAME_GPU_DEVICES_EVERY)
  private GpuDeviceWhereInput gpuDevicesEvery;

  public static final String SERIALIZED_NAME_GPU_DEVICES_NONE = "gpu_devices_none";
  @SerializedName(SERIALIZED_NAME_GPU_DEVICES_NONE)
  private GpuDeviceWhereInput gpuDevicesNone;

  public static final String SERIALIZED_NAME_GPU_DEVICES_SOME = "gpu_devices_some";
  @SerializedName(SERIALIZED_NAME_GPU_DEVICES_SOME)
  private GpuDeviceWhereInput gpuDevicesSome;

  public static final String SERIALIZED_NAME_GUEST_CPU_MODEL = "guest_cpu_model";
  @SerializedName(SERIALIZED_NAME_GUEST_CPU_MODEL)
  private String guestCpuModel;

  public static final String SERIALIZED_NAME_GUEST_CPU_MODEL_CONTAINS = "guest_cpu_model_contains";
  @SerializedName(SERIALIZED_NAME_GUEST_CPU_MODEL_CONTAINS)
  private String guestCpuModelContains;

  public static final String SERIALIZED_NAME_GUEST_CPU_MODEL_ENDS_WITH = "guest_cpu_model_ends_with";
  @SerializedName(SERIALIZED_NAME_GUEST_CPU_MODEL_ENDS_WITH)
  private String guestCpuModelEndsWith;

  public static final String SERIALIZED_NAME_GUEST_CPU_MODEL_GT = "guest_cpu_model_gt";
  @SerializedName(SERIALIZED_NAME_GUEST_CPU_MODEL_GT)
  private String guestCpuModelGt;

  public static final String SERIALIZED_NAME_GUEST_CPU_MODEL_GTE = "guest_cpu_model_gte";
  @SerializedName(SERIALIZED_NAME_GUEST_CPU_MODEL_GTE)
  private String guestCpuModelGte;

  public static final String SERIALIZED_NAME_GUEST_CPU_MODEL_IN = "guest_cpu_model_in";
  @SerializedName(SERIALIZED_NAME_GUEST_CPU_MODEL_IN)
  private List<String> guestCpuModelIn = null;

  public static final String SERIALIZED_NAME_GUEST_CPU_MODEL_LT = "guest_cpu_model_lt";
  @SerializedName(SERIALIZED_NAME_GUEST_CPU_MODEL_LT)
  private String guestCpuModelLt;

  public static final String SERIALIZED_NAME_GUEST_CPU_MODEL_LTE = "guest_cpu_model_lte";
  @SerializedName(SERIALIZED_NAME_GUEST_CPU_MODEL_LTE)
  private String guestCpuModelLte;

  public static final String SERIALIZED_NAME_GUEST_CPU_MODEL_NOT = "guest_cpu_model_not";
  @SerializedName(SERIALIZED_NAME_GUEST_CPU_MODEL_NOT)
  private String guestCpuModelNot;

  public static final String SERIALIZED_NAME_GUEST_CPU_MODEL_NOT_CONTAINS = "guest_cpu_model_not_contains";
  @SerializedName(SERIALIZED_NAME_GUEST_CPU_MODEL_NOT_CONTAINS)
  private String guestCpuModelNotContains;

  public static final String SERIALIZED_NAME_GUEST_CPU_MODEL_NOT_ENDS_WITH = "guest_cpu_model_not_ends_with";
  @SerializedName(SERIALIZED_NAME_GUEST_CPU_MODEL_NOT_ENDS_WITH)
  private String guestCpuModelNotEndsWith;

  public static final String SERIALIZED_NAME_GUEST_CPU_MODEL_NOT_IN = "guest_cpu_model_not_in";
  @SerializedName(SERIALIZED_NAME_GUEST_CPU_MODEL_NOT_IN)
  private List<String> guestCpuModelNotIn = null;

  public static final String SERIALIZED_NAME_GUEST_CPU_MODEL_NOT_STARTS_WITH = "guest_cpu_model_not_starts_with";
  @SerializedName(SERIALIZED_NAME_GUEST_CPU_MODEL_NOT_STARTS_WITH)
  private String guestCpuModelNotStartsWith;

  public static final String SERIALIZED_NAME_GUEST_CPU_MODEL_STARTS_WITH = "guest_cpu_model_starts_with";
  @SerializedName(SERIALIZED_NAME_GUEST_CPU_MODEL_STARTS_WITH)
  private String guestCpuModelStartsWith;

  public static final String SERIALIZED_NAME_GUEST_OS_TYPE = "guest_os_type";
  @SerializedName(SERIALIZED_NAME_GUEST_OS_TYPE)
  private VmGuestsOperationSystem guestOsType;

  public static final String SERIALIZED_NAME_GUEST_OS_TYPE_IN = "guest_os_type_in";
  @SerializedName(SERIALIZED_NAME_GUEST_OS_TYPE_IN)
  private List<VmGuestsOperationSystem> guestOsTypeIn = null;

  public static final String SERIALIZED_NAME_GUEST_OS_TYPE_NOT = "guest_os_type_not";
  @SerializedName(SERIALIZED_NAME_GUEST_OS_TYPE_NOT)
  private VmGuestsOperationSystem guestOsTypeNot;

  public static final String SERIALIZED_NAME_GUEST_OS_TYPE_NOT_IN = "guest_os_type_not_in";
  @SerializedName(SERIALIZED_NAME_GUEST_OS_TYPE_NOT_IN)
  private List<VmGuestsOperationSystem> guestOsTypeNotIn = null;

  public static final String SERIALIZED_NAME_GUEST_SIZE_USAGE = "guest_size_usage";
  @SerializedName(SERIALIZED_NAME_GUEST_SIZE_USAGE)
  private Double guestSizeUsage;

  public static final String SERIALIZED_NAME_GUEST_SIZE_USAGE_GT = "guest_size_usage_gt";
  @SerializedName(SERIALIZED_NAME_GUEST_SIZE_USAGE_GT)
  private Double guestSizeUsageGt;

  public static final String SERIALIZED_NAME_GUEST_SIZE_USAGE_GTE = "guest_size_usage_gte";
  @SerializedName(SERIALIZED_NAME_GUEST_SIZE_USAGE_GTE)
  private Double guestSizeUsageGte;

  public static final String SERIALIZED_NAME_GUEST_SIZE_USAGE_IN = "guest_size_usage_in";
  @SerializedName(SERIALIZED_NAME_GUEST_SIZE_USAGE_IN)
  private List<Double> guestSizeUsageIn = null;

  public static final String SERIALIZED_NAME_GUEST_SIZE_USAGE_LT = "guest_size_usage_lt";
  @SerializedName(SERIALIZED_NAME_GUEST_SIZE_USAGE_LT)
  private Double guestSizeUsageLt;

  public static final String SERIALIZED_NAME_GUEST_SIZE_USAGE_LTE = "guest_size_usage_lte";
  @SerializedName(SERIALIZED_NAME_GUEST_SIZE_USAGE_LTE)
  private Double guestSizeUsageLte;

  public static final String SERIALIZED_NAME_GUEST_SIZE_USAGE_NOT = "guest_size_usage_not";
  @SerializedName(SERIALIZED_NAME_GUEST_SIZE_USAGE_NOT)
  private Double guestSizeUsageNot;

  public static final String SERIALIZED_NAME_GUEST_SIZE_USAGE_NOT_IN = "guest_size_usage_not_in";
  @SerializedName(SERIALIZED_NAME_GUEST_SIZE_USAGE_NOT_IN)
  private List<Double> guestSizeUsageNotIn = null;

  public static final String SERIALIZED_NAME_GUEST_USED_SIZE = "guest_used_size";
  @SerializedName(SERIALIZED_NAME_GUEST_USED_SIZE)
  private Long guestUsedSize;

  public static final String SERIALIZED_NAME_GUEST_USED_SIZE_GT = "guest_used_size_gt";
  @SerializedName(SERIALIZED_NAME_GUEST_USED_SIZE_GT)
  private Long guestUsedSizeGt;

  public static final String SERIALIZED_NAME_GUEST_USED_SIZE_GTE = "guest_used_size_gte";
  @SerializedName(SERIALIZED_NAME_GUEST_USED_SIZE_GTE)
  private Long guestUsedSizeGte;

  public static final String SERIALIZED_NAME_GUEST_USED_SIZE_IN = "guest_used_size_in";
  @SerializedName(SERIALIZED_NAME_GUEST_USED_SIZE_IN)
  private List<Long> guestUsedSizeIn = null;

  public static final String SERIALIZED_NAME_GUEST_USED_SIZE_LT = "guest_used_size_lt";
  @SerializedName(SERIALIZED_NAME_GUEST_USED_SIZE_LT)
  private Long guestUsedSizeLt;

  public static final String SERIALIZED_NAME_GUEST_USED_SIZE_LTE = "guest_used_size_lte";
  @SerializedName(SERIALIZED_NAME_GUEST_USED_SIZE_LTE)
  private Long guestUsedSizeLte;

  public static final String SERIALIZED_NAME_GUEST_USED_SIZE_NOT = "guest_used_size_not";
  @SerializedName(SERIALIZED_NAME_GUEST_USED_SIZE_NOT)
  private Long guestUsedSizeNot;

  public static final String SERIALIZED_NAME_GUEST_USED_SIZE_NOT_IN = "guest_used_size_not_in";
  @SerializedName(SERIALIZED_NAME_GUEST_USED_SIZE_NOT_IN)
  private List<Long> guestUsedSizeNotIn = null;

  public static final String SERIALIZED_NAME_HA = "ha";
  @SerializedName(SERIALIZED_NAME_HA)
  private Boolean ha;

  public static final String SERIALIZED_NAME_HA_NOT = "ha_not";
  @SerializedName(SERIALIZED_NAME_HA_NOT)
  private Boolean haNot;

  public static final String SERIALIZED_NAME_HOST = "host";
  @SerializedName(SERIALIZED_NAME_HOST)
  private HostWhereInput host;

  public static final String SERIALIZED_NAME_HOSTNAME = "hostname";
  @SerializedName(SERIALIZED_NAME_HOSTNAME)
  private String hostname;

  public static final String SERIALIZED_NAME_HOSTNAME_CONTAINS = "hostname_contains";
  @SerializedName(SERIALIZED_NAME_HOSTNAME_CONTAINS)
  private String hostnameContains;

  public static final String SERIALIZED_NAME_HOSTNAME_ENDS_WITH = "hostname_ends_with";
  @SerializedName(SERIALIZED_NAME_HOSTNAME_ENDS_WITH)
  private String hostnameEndsWith;

  public static final String SERIALIZED_NAME_HOSTNAME_GT = "hostname_gt";
  @SerializedName(SERIALIZED_NAME_HOSTNAME_GT)
  private String hostnameGt;

  public static final String SERIALIZED_NAME_HOSTNAME_GTE = "hostname_gte";
  @SerializedName(SERIALIZED_NAME_HOSTNAME_GTE)
  private String hostnameGte;

  public static final String SERIALIZED_NAME_HOSTNAME_IN = "hostname_in";
  @SerializedName(SERIALIZED_NAME_HOSTNAME_IN)
  private List<String> hostnameIn = null;

  public static final String SERIALIZED_NAME_HOSTNAME_LT = "hostname_lt";
  @SerializedName(SERIALIZED_NAME_HOSTNAME_LT)
  private String hostnameLt;

  public static final String SERIALIZED_NAME_HOSTNAME_LTE = "hostname_lte";
  @SerializedName(SERIALIZED_NAME_HOSTNAME_LTE)
  private String hostnameLte;

  public static final String SERIALIZED_NAME_HOSTNAME_NOT = "hostname_not";
  @SerializedName(SERIALIZED_NAME_HOSTNAME_NOT)
  private String hostnameNot;

  public static final String SERIALIZED_NAME_HOSTNAME_NOT_CONTAINS = "hostname_not_contains";
  @SerializedName(SERIALIZED_NAME_HOSTNAME_NOT_CONTAINS)
  private String hostnameNotContains;

  public static final String SERIALIZED_NAME_HOSTNAME_NOT_ENDS_WITH = "hostname_not_ends_with";
  @SerializedName(SERIALIZED_NAME_HOSTNAME_NOT_ENDS_WITH)
  private String hostnameNotEndsWith;

  public static final String SERIALIZED_NAME_HOSTNAME_NOT_IN = "hostname_not_in";
  @SerializedName(SERIALIZED_NAME_HOSTNAME_NOT_IN)
  private List<String> hostnameNotIn = null;

  public static final String SERIALIZED_NAME_HOSTNAME_NOT_STARTS_WITH = "hostname_not_starts_with";
  @SerializedName(SERIALIZED_NAME_HOSTNAME_NOT_STARTS_WITH)
  private String hostnameNotStartsWith;

  public static final String SERIALIZED_NAME_HOSTNAME_STARTS_WITH = "hostname_starts_with";
  @SerializedName(SERIALIZED_NAME_HOSTNAME_STARTS_WITH)
  private String hostnameStartsWith;

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

  public static final String SERIALIZED_NAME_IN_RECYCLE_BIN = "in_recycle_bin";
  @SerializedName(SERIALIZED_NAME_IN_RECYCLE_BIN)
  private Boolean inRecycleBin;

  public static final String SERIALIZED_NAME_IN_RECYCLE_BIN_NOT = "in_recycle_bin_not";
  @SerializedName(SERIALIZED_NAME_IN_RECYCLE_BIN_NOT)
  private Boolean inRecycleBinNot;

  public static final String SERIALIZED_NAME_INTERNAL = "internal";
  @SerializedName(SERIALIZED_NAME_INTERNAL)
  private Boolean internal;

  public static final String SERIALIZED_NAME_INTERNAL_NOT = "internal_not";
  @SerializedName(SERIALIZED_NAME_INTERNAL_NOT)
  private Boolean internalNot;

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

  public static final String SERIALIZED_NAME_IPS = "ips";
  @SerializedName(SERIALIZED_NAME_IPS)
  private String ips;

  public static final String SERIALIZED_NAME_IPS_CONTAINS = "ips_contains";
  @SerializedName(SERIALIZED_NAME_IPS_CONTAINS)
  private String ipsContains;

  public static final String SERIALIZED_NAME_IPS_ENDS_WITH = "ips_ends_with";
  @SerializedName(SERIALIZED_NAME_IPS_ENDS_WITH)
  private String ipsEndsWith;

  public static final String SERIALIZED_NAME_IPS_GT = "ips_gt";
  @SerializedName(SERIALIZED_NAME_IPS_GT)
  private String ipsGt;

  public static final String SERIALIZED_NAME_IPS_GTE = "ips_gte";
  @SerializedName(SERIALIZED_NAME_IPS_GTE)
  private String ipsGte;

  public static final String SERIALIZED_NAME_IPS_IN = "ips_in";
  @SerializedName(SERIALIZED_NAME_IPS_IN)
  private List<String> ipsIn = null;

  public static final String SERIALIZED_NAME_IPS_LT = "ips_lt";
  @SerializedName(SERIALIZED_NAME_IPS_LT)
  private String ipsLt;

  public static final String SERIALIZED_NAME_IPS_LTE = "ips_lte";
  @SerializedName(SERIALIZED_NAME_IPS_LTE)
  private String ipsLte;

  public static final String SERIALIZED_NAME_IPS_NOT = "ips_not";
  @SerializedName(SERIALIZED_NAME_IPS_NOT)
  private String ipsNot;

  public static final String SERIALIZED_NAME_IPS_NOT_CONTAINS = "ips_not_contains";
  @SerializedName(SERIALIZED_NAME_IPS_NOT_CONTAINS)
  private String ipsNotContains;

  public static final String SERIALIZED_NAME_IPS_NOT_ENDS_WITH = "ips_not_ends_with";
  @SerializedName(SERIALIZED_NAME_IPS_NOT_ENDS_WITH)
  private String ipsNotEndsWith;

  public static final String SERIALIZED_NAME_IPS_NOT_IN = "ips_not_in";
  @SerializedName(SERIALIZED_NAME_IPS_NOT_IN)
  private List<String> ipsNotIn = null;

  public static final String SERIALIZED_NAME_IPS_NOT_STARTS_WITH = "ips_not_starts_with";
  @SerializedName(SERIALIZED_NAME_IPS_NOT_STARTS_WITH)
  private String ipsNotStartsWith;

  public static final String SERIALIZED_NAME_IPS_STARTS_WITH = "ips_starts_with";
  @SerializedName(SERIALIZED_NAME_IPS_STARTS_WITH)
  private String ipsStartsWith;

  public static final String SERIALIZED_NAME_KERNEL_INFO = "kernel_info";
  @SerializedName(SERIALIZED_NAME_KERNEL_INFO)
  private String kernelInfo;

  public static final String SERIALIZED_NAME_KERNEL_INFO_CONTAINS = "kernel_info_contains";
  @SerializedName(SERIALIZED_NAME_KERNEL_INFO_CONTAINS)
  private String kernelInfoContains;

  public static final String SERIALIZED_NAME_KERNEL_INFO_ENDS_WITH = "kernel_info_ends_with";
  @SerializedName(SERIALIZED_NAME_KERNEL_INFO_ENDS_WITH)
  private String kernelInfoEndsWith;

  public static final String SERIALIZED_NAME_KERNEL_INFO_GT = "kernel_info_gt";
  @SerializedName(SERIALIZED_NAME_KERNEL_INFO_GT)
  private String kernelInfoGt;

  public static final String SERIALIZED_NAME_KERNEL_INFO_GTE = "kernel_info_gte";
  @SerializedName(SERIALIZED_NAME_KERNEL_INFO_GTE)
  private String kernelInfoGte;

  public static final String SERIALIZED_NAME_KERNEL_INFO_IN = "kernel_info_in";
  @SerializedName(SERIALIZED_NAME_KERNEL_INFO_IN)
  private List<String> kernelInfoIn = null;

  public static final String SERIALIZED_NAME_KERNEL_INFO_LT = "kernel_info_lt";
  @SerializedName(SERIALIZED_NAME_KERNEL_INFO_LT)
  private String kernelInfoLt;

  public static final String SERIALIZED_NAME_KERNEL_INFO_LTE = "kernel_info_lte";
  @SerializedName(SERIALIZED_NAME_KERNEL_INFO_LTE)
  private String kernelInfoLte;

  public static final String SERIALIZED_NAME_KERNEL_INFO_NOT = "kernel_info_not";
  @SerializedName(SERIALIZED_NAME_KERNEL_INFO_NOT)
  private String kernelInfoNot;

  public static final String SERIALIZED_NAME_KERNEL_INFO_NOT_CONTAINS = "kernel_info_not_contains";
  @SerializedName(SERIALIZED_NAME_KERNEL_INFO_NOT_CONTAINS)
  private String kernelInfoNotContains;

  public static final String SERIALIZED_NAME_KERNEL_INFO_NOT_ENDS_WITH = "kernel_info_not_ends_with";
  @SerializedName(SERIALIZED_NAME_KERNEL_INFO_NOT_ENDS_WITH)
  private String kernelInfoNotEndsWith;

  public static final String SERIALIZED_NAME_KERNEL_INFO_NOT_IN = "kernel_info_not_in";
  @SerializedName(SERIALIZED_NAME_KERNEL_INFO_NOT_IN)
  private List<String> kernelInfoNotIn = null;

  public static final String SERIALIZED_NAME_KERNEL_INFO_NOT_STARTS_WITH = "kernel_info_not_starts_with";
  @SerializedName(SERIALIZED_NAME_KERNEL_INFO_NOT_STARTS_WITH)
  private String kernelInfoNotStartsWith;

  public static final String SERIALIZED_NAME_KERNEL_INFO_STARTS_WITH = "kernel_info_starts_with";
  @SerializedName(SERIALIZED_NAME_KERNEL_INFO_STARTS_WITH)
  private String kernelInfoStartsWith;

  public static final String SERIALIZED_NAME_LABELS_EVERY = "labels_every";
  @SerializedName(SERIALIZED_NAME_LABELS_EVERY)
  private LabelWhereInput labelsEvery;

  public static final String SERIALIZED_NAME_LABELS_NONE = "labels_none";
  @SerializedName(SERIALIZED_NAME_LABELS_NONE)
  private LabelWhereInput labelsNone;

  public static final String SERIALIZED_NAME_LABELS_SOME = "labels_some";
  @SerializedName(SERIALIZED_NAME_LABELS_SOME)
  private LabelWhereInput labelsSome;

  public static final String SERIALIZED_NAME_LAST_SHUTDOWN_TIME = "last_shutdown_time";
  @SerializedName(SERIALIZED_NAME_LAST_SHUTDOWN_TIME)
  private String lastShutdownTime;

  public static final String SERIALIZED_NAME_LAST_SHUTDOWN_TIME_GT = "last_shutdown_time_gt";
  @SerializedName(SERIALIZED_NAME_LAST_SHUTDOWN_TIME_GT)
  private String lastShutdownTimeGt;

  public static final String SERIALIZED_NAME_LAST_SHUTDOWN_TIME_GTE = "last_shutdown_time_gte";
  @SerializedName(SERIALIZED_NAME_LAST_SHUTDOWN_TIME_GTE)
  private String lastShutdownTimeGte;

  public static final String SERIALIZED_NAME_LAST_SHUTDOWN_TIME_IN = "last_shutdown_time_in";
  @SerializedName(SERIALIZED_NAME_LAST_SHUTDOWN_TIME_IN)
  private List<String> lastShutdownTimeIn = null;

  public static final String SERIALIZED_NAME_LAST_SHUTDOWN_TIME_LT = "last_shutdown_time_lt";
  @SerializedName(SERIALIZED_NAME_LAST_SHUTDOWN_TIME_LT)
  private String lastShutdownTimeLt;

  public static final String SERIALIZED_NAME_LAST_SHUTDOWN_TIME_LTE = "last_shutdown_time_lte";
  @SerializedName(SERIALIZED_NAME_LAST_SHUTDOWN_TIME_LTE)
  private String lastShutdownTimeLte;

  public static final String SERIALIZED_NAME_LAST_SHUTDOWN_TIME_NOT = "last_shutdown_time_not";
  @SerializedName(SERIALIZED_NAME_LAST_SHUTDOWN_TIME_NOT)
  private String lastShutdownTimeNot;

  public static final String SERIALIZED_NAME_LAST_SHUTDOWN_TIME_NOT_IN = "last_shutdown_time_not_in";
  @SerializedName(SERIALIZED_NAME_LAST_SHUTDOWN_TIME_NOT_IN)
  private List<String> lastShutdownTimeNotIn = null;

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

  public static final String SERIALIZED_NAME_LOGICAL_SIZE_BYTES = "logical_size_bytes";
  @SerializedName(SERIALIZED_NAME_LOGICAL_SIZE_BYTES)
  private Long logicalSizeBytes;

  public static final String SERIALIZED_NAME_LOGICAL_SIZE_BYTES_GT = "logical_size_bytes_gt";
  @SerializedName(SERIALIZED_NAME_LOGICAL_SIZE_BYTES_GT)
  private Long logicalSizeBytesGt;

  public static final String SERIALIZED_NAME_LOGICAL_SIZE_BYTES_GTE = "logical_size_bytes_gte";
  @SerializedName(SERIALIZED_NAME_LOGICAL_SIZE_BYTES_GTE)
  private Long logicalSizeBytesGte;

  public static final String SERIALIZED_NAME_LOGICAL_SIZE_BYTES_IN = "logical_size_bytes_in";
  @SerializedName(SERIALIZED_NAME_LOGICAL_SIZE_BYTES_IN)
  private List<Long> logicalSizeBytesIn = null;

  public static final String SERIALIZED_NAME_LOGICAL_SIZE_BYTES_LT = "logical_size_bytes_lt";
  @SerializedName(SERIALIZED_NAME_LOGICAL_SIZE_BYTES_LT)
  private Long logicalSizeBytesLt;

  public static final String SERIALIZED_NAME_LOGICAL_SIZE_BYTES_LTE = "logical_size_bytes_lte";
  @SerializedName(SERIALIZED_NAME_LOGICAL_SIZE_BYTES_LTE)
  private Long logicalSizeBytesLte;

  public static final String SERIALIZED_NAME_LOGICAL_SIZE_BYTES_NOT = "logical_size_bytes_not";
  @SerializedName(SERIALIZED_NAME_LOGICAL_SIZE_BYTES_NOT)
  private Long logicalSizeBytesNot;

  public static final String SERIALIZED_NAME_LOGICAL_SIZE_BYTES_NOT_IN = "logical_size_bytes_not_in";
  @SerializedName(SERIALIZED_NAME_LOGICAL_SIZE_BYTES_NOT_IN)
  private List<Long> logicalSizeBytesNotIn = null;

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

  public static final String SERIALIZED_NAME_MEMORY_USAGE = "memory_usage";
  @SerializedName(SERIALIZED_NAME_MEMORY_USAGE)
  private Double memoryUsage;

  public static final String SERIALIZED_NAME_MEMORY_USAGE_GT = "memory_usage_gt";
  @SerializedName(SERIALIZED_NAME_MEMORY_USAGE_GT)
  private Double memoryUsageGt;

  public static final String SERIALIZED_NAME_MEMORY_USAGE_GTE = "memory_usage_gte";
  @SerializedName(SERIALIZED_NAME_MEMORY_USAGE_GTE)
  private Double memoryUsageGte;

  public static final String SERIALIZED_NAME_MEMORY_USAGE_IN = "memory_usage_in";
  @SerializedName(SERIALIZED_NAME_MEMORY_USAGE_IN)
  private List<Double> memoryUsageIn = null;

  public static final String SERIALIZED_NAME_MEMORY_USAGE_LT = "memory_usage_lt";
  @SerializedName(SERIALIZED_NAME_MEMORY_USAGE_LT)
  private Double memoryUsageLt;

  public static final String SERIALIZED_NAME_MEMORY_USAGE_LTE = "memory_usage_lte";
  @SerializedName(SERIALIZED_NAME_MEMORY_USAGE_LTE)
  private Double memoryUsageLte;

  public static final String SERIALIZED_NAME_MEMORY_USAGE_NOT = "memory_usage_not";
  @SerializedName(SERIALIZED_NAME_MEMORY_USAGE_NOT)
  private Double memoryUsageNot;

  public static final String SERIALIZED_NAME_MEMORY_USAGE_NOT_IN = "memory_usage_not_in";
  @SerializedName(SERIALIZED_NAME_MEMORY_USAGE_NOT_IN)
  private List<Double> memoryUsageNotIn = null;

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

  public static final String SERIALIZED_NAME_NESTED_VIRTUALIZATION = "nested_virtualization";
  @SerializedName(SERIALIZED_NAME_NESTED_VIRTUALIZATION)
  private Boolean nestedVirtualization;

  public static final String SERIALIZED_NAME_NESTED_VIRTUALIZATION_NOT = "nested_virtualization_not";
  @SerializedName(SERIALIZED_NAME_NESTED_VIRTUALIZATION_NOT)
  private Boolean nestedVirtualizationNot;

  public static final String SERIALIZED_NAME_NODE_IP = "node_ip";
  @SerializedName(SERIALIZED_NAME_NODE_IP)
  private String nodeIp;

  public static final String SERIALIZED_NAME_NODE_IP_CONTAINS = "node_ip_contains";
  @SerializedName(SERIALIZED_NAME_NODE_IP_CONTAINS)
  private String nodeIpContains;

  public static final String SERIALIZED_NAME_NODE_IP_ENDS_WITH = "node_ip_ends_with";
  @SerializedName(SERIALIZED_NAME_NODE_IP_ENDS_WITH)
  private String nodeIpEndsWith;

  public static final String SERIALIZED_NAME_NODE_IP_GT = "node_ip_gt";
  @SerializedName(SERIALIZED_NAME_NODE_IP_GT)
  private String nodeIpGt;

  public static final String SERIALIZED_NAME_NODE_IP_GTE = "node_ip_gte";
  @SerializedName(SERIALIZED_NAME_NODE_IP_GTE)
  private String nodeIpGte;

  public static final String SERIALIZED_NAME_NODE_IP_IN = "node_ip_in";
  @SerializedName(SERIALIZED_NAME_NODE_IP_IN)
  private List<String> nodeIpIn = null;

  public static final String SERIALIZED_NAME_NODE_IP_LT = "node_ip_lt";
  @SerializedName(SERIALIZED_NAME_NODE_IP_LT)
  private String nodeIpLt;

  public static final String SERIALIZED_NAME_NODE_IP_LTE = "node_ip_lte";
  @SerializedName(SERIALIZED_NAME_NODE_IP_LTE)
  private String nodeIpLte;

  public static final String SERIALIZED_NAME_NODE_IP_NOT = "node_ip_not";
  @SerializedName(SERIALIZED_NAME_NODE_IP_NOT)
  private String nodeIpNot;

  public static final String SERIALIZED_NAME_NODE_IP_NOT_CONTAINS = "node_ip_not_contains";
  @SerializedName(SERIALIZED_NAME_NODE_IP_NOT_CONTAINS)
  private String nodeIpNotContains;

  public static final String SERIALIZED_NAME_NODE_IP_NOT_ENDS_WITH = "node_ip_not_ends_with";
  @SerializedName(SERIALIZED_NAME_NODE_IP_NOT_ENDS_WITH)
  private String nodeIpNotEndsWith;

  public static final String SERIALIZED_NAME_NODE_IP_NOT_IN = "node_ip_not_in";
  @SerializedName(SERIALIZED_NAME_NODE_IP_NOT_IN)
  private List<String> nodeIpNotIn = null;

  public static final String SERIALIZED_NAME_NODE_IP_NOT_STARTS_WITH = "node_ip_not_starts_with";
  @SerializedName(SERIALIZED_NAME_NODE_IP_NOT_STARTS_WITH)
  private String nodeIpNotStartsWith;

  public static final String SERIALIZED_NAME_NODE_IP_STARTS_WITH = "node_ip_starts_with";
  @SerializedName(SERIALIZED_NAME_NODE_IP_STARTS_WITH)
  private String nodeIpStartsWith;

  public static final String SERIALIZED_NAME_ORIGINAL_NAME = "original_name";
  @SerializedName(SERIALIZED_NAME_ORIGINAL_NAME)
  private String originalName;

  public static final String SERIALIZED_NAME_ORIGINAL_NAME_CONTAINS = "original_name_contains";
  @SerializedName(SERIALIZED_NAME_ORIGINAL_NAME_CONTAINS)
  private String originalNameContains;

  public static final String SERIALIZED_NAME_ORIGINAL_NAME_ENDS_WITH = "original_name_ends_with";
  @SerializedName(SERIALIZED_NAME_ORIGINAL_NAME_ENDS_WITH)
  private String originalNameEndsWith;

  public static final String SERIALIZED_NAME_ORIGINAL_NAME_GT = "original_name_gt";
  @SerializedName(SERIALIZED_NAME_ORIGINAL_NAME_GT)
  private String originalNameGt;

  public static final String SERIALIZED_NAME_ORIGINAL_NAME_GTE = "original_name_gte";
  @SerializedName(SERIALIZED_NAME_ORIGINAL_NAME_GTE)
  private String originalNameGte;

  public static final String SERIALIZED_NAME_ORIGINAL_NAME_IN = "original_name_in";
  @SerializedName(SERIALIZED_NAME_ORIGINAL_NAME_IN)
  private List<String> originalNameIn = null;

  public static final String SERIALIZED_NAME_ORIGINAL_NAME_LT = "original_name_lt";
  @SerializedName(SERIALIZED_NAME_ORIGINAL_NAME_LT)
  private String originalNameLt;

  public static final String SERIALIZED_NAME_ORIGINAL_NAME_LTE = "original_name_lte";
  @SerializedName(SERIALIZED_NAME_ORIGINAL_NAME_LTE)
  private String originalNameLte;

  public static final String SERIALIZED_NAME_ORIGINAL_NAME_NOT = "original_name_not";
  @SerializedName(SERIALIZED_NAME_ORIGINAL_NAME_NOT)
  private String originalNameNot;

  public static final String SERIALIZED_NAME_ORIGINAL_NAME_NOT_CONTAINS = "original_name_not_contains";
  @SerializedName(SERIALIZED_NAME_ORIGINAL_NAME_NOT_CONTAINS)
  private String originalNameNotContains;

  public static final String SERIALIZED_NAME_ORIGINAL_NAME_NOT_ENDS_WITH = "original_name_not_ends_with";
  @SerializedName(SERIALIZED_NAME_ORIGINAL_NAME_NOT_ENDS_WITH)
  private String originalNameNotEndsWith;

  public static final String SERIALIZED_NAME_ORIGINAL_NAME_NOT_IN = "original_name_not_in";
  @SerializedName(SERIALIZED_NAME_ORIGINAL_NAME_NOT_IN)
  private List<String> originalNameNotIn = null;

  public static final String SERIALIZED_NAME_ORIGINAL_NAME_NOT_STARTS_WITH = "original_name_not_starts_with";
  @SerializedName(SERIALIZED_NAME_ORIGINAL_NAME_NOT_STARTS_WITH)
  private String originalNameNotStartsWith;

  public static final String SERIALIZED_NAME_ORIGINAL_NAME_STARTS_WITH = "original_name_starts_with";
  @SerializedName(SERIALIZED_NAME_ORIGINAL_NAME_STARTS_WITH)
  private String originalNameStartsWith;

  public static final String SERIALIZED_NAME_OS = "os";
  @SerializedName(SERIALIZED_NAME_OS)
  private String os;

  public static final String SERIALIZED_NAME_OS_CONTAINS = "os_contains";
  @SerializedName(SERIALIZED_NAME_OS_CONTAINS)
  private String osContains;

  public static final String SERIALIZED_NAME_OS_ENDS_WITH = "os_ends_with";
  @SerializedName(SERIALIZED_NAME_OS_ENDS_WITH)
  private String osEndsWith;

  public static final String SERIALIZED_NAME_OS_GT = "os_gt";
  @SerializedName(SERIALIZED_NAME_OS_GT)
  private String osGt;

  public static final String SERIALIZED_NAME_OS_GTE = "os_gte";
  @SerializedName(SERIALIZED_NAME_OS_GTE)
  private String osGte;

  public static final String SERIALIZED_NAME_OS_IN = "os_in";
  @SerializedName(SERIALIZED_NAME_OS_IN)
  private List<String> osIn = null;

  public static final String SERIALIZED_NAME_OS_LT = "os_lt";
  @SerializedName(SERIALIZED_NAME_OS_LT)
  private String osLt;

  public static final String SERIALIZED_NAME_OS_LTE = "os_lte";
  @SerializedName(SERIALIZED_NAME_OS_LTE)
  private String osLte;

  public static final String SERIALIZED_NAME_OS_NOT = "os_not";
  @SerializedName(SERIALIZED_NAME_OS_NOT)
  private String osNot;

  public static final String SERIALIZED_NAME_OS_NOT_CONTAINS = "os_not_contains";
  @SerializedName(SERIALIZED_NAME_OS_NOT_CONTAINS)
  private String osNotContains;

  public static final String SERIALIZED_NAME_OS_NOT_ENDS_WITH = "os_not_ends_with";
  @SerializedName(SERIALIZED_NAME_OS_NOT_ENDS_WITH)
  private String osNotEndsWith;

  public static final String SERIALIZED_NAME_OS_NOT_IN = "os_not_in";
  @SerializedName(SERIALIZED_NAME_OS_NOT_IN)
  private List<String> osNotIn = null;

  public static final String SERIALIZED_NAME_OS_NOT_STARTS_WITH = "os_not_starts_with";
  @SerializedName(SERIALIZED_NAME_OS_NOT_STARTS_WITH)
  private String osNotStartsWith;

  public static final String SERIALIZED_NAME_OS_STARTS_WITH = "os_starts_with";
  @SerializedName(SERIALIZED_NAME_OS_STARTS_WITH)
  private String osStartsWith;

  public static final String SERIALIZED_NAME_PCI_NICS_EVERY = "pci_nics_every";
  @SerializedName(SERIALIZED_NAME_PCI_NICS_EVERY)
  private NicWhereInput pciNicsEvery;

  public static final String SERIALIZED_NAME_PCI_NICS_NONE = "pci_nics_none";
  @SerializedName(SERIALIZED_NAME_PCI_NICS_NONE)
  private NicWhereInput pciNicsNone;

  public static final String SERIALIZED_NAME_PCI_NICS_SOME = "pci_nics_some";
  @SerializedName(SERIALIZED_NAME_PCI_NICS_SOME)
  private NicWhereInput pciNicsSome;

  public static final String SERIALIZED_NAME_PROTECTED = "protected";
  @SerializedName(SERIALIZED_NAME_PROTECTED)
  private Boolean _protected;

  public static final String SERIALIZED_NAME_PROTECTED_NOT = "protected_not";
  @SerializedName(SERIALIZED_NAME_PROTECTED_NOT)
  private Boolean protectedNot;

  public static final String SERIALIZED_NAME_PROVISIONED_SIZE = "provisioned_size";
  @SerializedName(SERIALIZED_NAME_PROVISIONED_SIZE)
  private Long provisionedSize;

  public static final String SERIALIZED_NAME_PROVISIONED_SIZE_GT = "provisioned_size_gt";
  @SerializedName(SERIALIZED_NAME_PROVISIONED_SIZE_GT)
  private Long provisionedSizeGt;

  public static final String SERIALIZED_NAME_PROVISIONED_SIZE_GTE = "provisioned_size_gte";
  @SerializedName(SERIALIZED_NAME_PROVISIONED_SIZE_GTE)
  private Long provisionedSizeGte;

  public static final String SERIALIZED_NAME_PROVISIONED_SIZE_IN = "provisioned_size_in";
  @SerializedName(SERIALIZED_NAME_PROVISIONED_SIZE_IN)
  private List<Long> provisionedSizeIn = null;

  public static final String SERIALIZED_NAME_PROVISIONED_SIZE_LT = "provisioned_size_lt";
  @SerializedName(SERIALIZED_NAME_PROVISIONED_SIZE_LT)
  private Long provisionedSizeLt;

  public static final String SERIALIZED_NAME_PROVISIONED_SIZE_LTE = "provisioned_size_lte";
  @SerializedName(SERIALIZED_NAME_PROVISIONED_SIZE_LTE)
  private Long provisionedSizeLte;

  public static final String SERIALIZED_NAME_PROVISIONED_SIZE_NOT = "provisioned_size_not";
  @SerializedName(SERIALIZED_NAME_PROVISIONED_SIZE_NOT)
  private Long provisionedSizeNot;

  public static final String SERIALIZED_NAME_PROVISIONED_SIZE_NOT_IN = "provisioned_size_not_in";
  @SerializedName(SERIALIZED_NAME_PROVISIONED_SIZE_NOT_IN)
  private List<Long> provisionedSizeNotIn = null;

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

  public static final String SERIALIZED_NAME_SNAPSHOTS_EVERY = "snapshots_every";
  @SerializedName(SERIALIZED_NAME_SNAPSHOTS_EVERY)
  private VmSnapshotWhereInput snapshotsEvery;

  public static final String SERIALIZED_NAME_SNAPSHOTS_NONE = "snapshots_none";
  @SerializedName(SERIALIZED_NAME_SNAPSHOTS_NONE)
  private VmSnapshotWhereInput snapshotsNone;

  public static final String SERIALIZED_NAME_SNAPSHOTS_SOME = "snapshots_some";
  @SerializedName(SERIALIZED_NAME_SNAPSHOTS_SOME)
  private VmSnapshotWhereInput snapshotsSome;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private VmStatus status;

  public static final String SERIALIZED_NAME_STATUS_IN = "status_in";
  @SerializedName(SERIALIZED_NAME_STATUS_IN)
  private List<VmStatus> statusIn = null;

  public static final String SERIALIZED_NAME_STATUS_NOT = "status_not";
  @SerializedName(SERIALIZED_NAME_STATUS_NOT)
  private VmStatus statusNot;

  public static final String SERIALIZED_NAME_STATUS_NOT_IN = "status_not_in";
  @SerializedName(SERIALIZED_NAME_STATUS_NOT_IN)
  private List<VmStatus> statusNotIn = null;

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

  public static final String SERIALIZED_NAME_USB_DEVICES_EVERY = "usb_devices_every";
  @SerializedName(SERIALIZED_NAME_USB_DEVICES_EVERY)
  private UsbDeviceWhereInput usbDevicesEvery;

  public static final String SERIALIZED_NAME_USB_DEVICES_NONE = "usb_devices_none";
  @SerializedName(SERIALIZED_NAME_USB_DEVICES_NONE)
  private UsbDeviceWhereInput usbDevicesNone;

  public static final String SERIALIZED_NAME_USB_DEVICES_SOME = "usb_devices_some";
  @SerializedName(SERIALIZED_NAME_USB_DEVICES_SOME)
  private UsbDeviceWhereInput usbDevicesSome;

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
  private VmVideoType videoType;

  public static final String SERIALIZED_NAME_VIDEO_TYPE_IN = "video_type_in";
  @SerializedName(SERIALIZED_NAME_VIDEO_TYPE_IN)
  private List<VmVideoType> videoTypeIn = null;

  public static final String SERIALIZED_NAME_VIDEO_TYPE_NOT = "video_type_not";
  @SerializedName(SERIALIZED_NAME_VIDEO_TYPE_NOT)
  private VmVideoType videoTypeNot;

  public static final String SERIALIZED_NAME_VIDEO_TYPE_NOT_IN = "video_type_not_in";
  @SerializedName(SERIALIZED_NAME_VIDEO_TYPE_NOT_IN)
  private List<VmVideoType> videoTypeNotIn = null;

  public static final String SERIALIZED_NAME_VM_DISKS_EVERY = "vm_disks_every";
  @SerializedName(SERIALIZED_NAME_VM_DISKS_EVERY)
  private VmDiskWhereInput vmDisksEvery;

  public static final String SERIALIZED_NAME_VM_DISKS_NONE = "vm_disks_none";
  @SerializedName(SERIALIZED_NAME_VM_DISKS_NONE)
  private VmDiskWhereInput vmDisksNone;

  public static final String SERIALIZED_NAME_VM_DISKS_SOME = "vm_disks_some";
  @SerializedName(SERIALIZED_NAME_VM_DISKS_SOME)
  private VmDiskWhereInput vmDisksSome;

  public static final String SERIALIZED_NAME_VM_NICS_EVERY = "vm_nics_every";
  @SerializedName(SERIALIZED_NAME_VM_NICS_EVERY)
  private VmNicWhereInput vmNicsEvery;

  public static final String SERIALIZED_NAME_VM_NICS_NONE = "vm_nics_none";
  @SerializedName(SERIALIZED_NAME_VM_NICS_NONE)
  private VmNicWhereInput vmNicsNone;

  public static final String SERIALIZED_NAME_VM_NICS_SOME = "vm_nics_some";
  @SerializedName(SERIALIZED_NAME_VM_NICS_SOME)
  private VmNicWhereInput vmNicsSome;

  public static final String SERIALIZED_NAME_VM_PLACEMENT_GROUP_EVERY = "vm_placement_group_every";
  @SerializedName(SERIALIZED_NAME_VM_PLACEMENT_GROUP_EVERY)
  private VmPlacementGroupWhereInput vmPlacementGroupEvery;

  public static final String SERIALIZED_NAME_VM_PLACEMENT_GROUP_NONE = "vm_placement_group_none";
  @SerializedName(SERIALIZED_NAME_VM_PLACEMENT_GROUP_NONE)
  private VmPlacementGroupWhereInput vmPlacementGroupNone;

  public static final String SERIALIZED_NAME_VM_PLACEMENT_GROUP_SOME = "vm_placement_group_some";
  @SerializedName(SERIALIZED_NAME_VM_PLACEMENT_GROUP_SOME)
  private VmPlacementGroupWhereInput vmPlacementGroupSome;

  public static final String SERIALIZED_NAME_VM_TOOLS_STATUS = "vm_tools_status";
  @SerializedName(SERIALIZED_NAME_VM_TOOLS_STATUS)
  private VmToolsStatus vmToolsStatus;

  public static final String SERIALIZED_NAME_VM_TOOLS_STATUS_IN = "vm_tools_status_in";
  @SerializedName(SERIALIZED_NAME_VM_TOOLS_STATUS_IN)
  private List<VmToolsStatus> vmToolsStatusIn = null;

  public static final String SERIALIZED_NAME_VM_TOOLS_STATUS_NOT = "vm_tools_status_not";
  @SerializedName(SERIALIZED_NAME_VM_TOOLS_STATUS_NOT)
  private VmToolsStatus vmToolsStatusNot;

  public static final String SERIALIZED_NAME_VM_TOOLS_STATUS_NOT_IN = "vm_tools_status_not_in";
  @SerializedName(SERIALIZED_NAME_VM_TOOLS_STATUS_NOT_IN)
  private List<VmToolsStatus> vmToolsStatusNotIn = null;

  public static final String SERIALIZED_NAME_VM_TOOLS_VERSION = "vm_tools_version";
  @SerializedName(SERIALIZED_NAME_VM_TOOLS_VERSION)
  private String vmToolsVersion;

  public static final String SERIALIZED_NAME_VM_TOOLS_VERSION_CONTAINS = "vm_tools_version_contains";
  @SerializedName(SERIALIZED_NAME_VM_TOOLS_VERSION_CONTAINS)
  private String vmToolsVersionContains;

  public static final String SERIALIZED_NAME_VM_TOOLS_VERSION_ENDS_WITH = "vm_tools_version_ends_with";
  @SerializedName(SERIALIZED_NAME_VM_TOOLS_VERSION_ENDS_WITH)
  private String vmToolsVersionEndsWith;

  public static final String SERIALIZED_NAME_VM_TOOLS_VERSION_GT = "vm_tools_version_gt";
  @SerializedName(SERIALIZED_NAME_VM_TOOLS_VERSION_GT)
  private String vmToolsVersionGt;

  public static final String SERIALIZED_NAME_VM_TOOLS_VERSION_GTE = "vm_tools_version_gte";
  @SerializedName(SERIALIZED_NAME_VM_TOOLS_VERSION_GTE)
  private String vmToolsVersionGte;

  public static final String SERIALIZED_NAME_VM_TOOLS_VERSION_IN = "vm_tools_version_in";
  @SerializedName(SERIALIZED_NAME_VM_TOOLS_VERSION_IN)
  private List<String> vmToolsVersionIn = null;

  public static final String SERIALIZED_NAME_VM_TOOLS_VERSION_LT = "vm_tools_version_lt";
  @SerializedName(SERIALIZED_NAME_VM_TOOLS_VERSION_LT)
  private String vmToolsVersionLt;

  public static final String SERIALIZED_NAME_VM_TOOLS_VERSION_LTE = "vm_tools_version_lte";
  @SerializedName(SERIALIZED_NAME_VM_TOOLS_VERSION_LTE)
  private String vmToolsVersionLte;

  public static final String SERIALIZED_NAME_VM_TOOLS_VERSION_NOT = "vm_tools_version_not";
  @SerializedName(SERIALIZED_NAME_VM_TOOLS_VERSION_NOT)
  private String vmToolsVersionNot;

  public static final String SERIALIZED_NAME_VM_TOOLS_VERSION_NOT_CONTAINS = "vm_tools_version_not_contains";
  @SerializedName(SERIALIZED_NAME_VM_TOOLS_VERSION_NOT_CONTAINS)
  private String vmToolsVersionNotContains;

  public static final String SERIALIZED_NAME_VM_TOOLS_VERSION_NOT_ENDS_WITH = "vm_tools_version_not_ends_with";
  @SerializedName(SERIALIZED_NAME_VM_TOOLS_VERSION_NOT_ENDS_WITH)
  private String vmToolsVersionNotEndsWith;

  public static final String SERIALIZED_NAME_VM_TOOLS_VERSION_NOT_IN = "vm_tools_version_not_in";
  @SerializedName(SERIALIZED_NAME_VM_TOOLS_VERSION_NOT_IN)
  private List<String> vmToolsVersionNotIn = null;

  public static final String SERIALIZED_NAME_VM_TOOLS_VERSION_NOT_STARTS_WITH = "vm_tools_version_not_starts_with";
  @SerializedName(SERIALIZED_NAME_VM_TOOLS_VERSION_NOT_STARTS_WITH)
  private String vmToolsVersionNotStartsWith;

  public static final String SERIALIZED_NAME_VM_TOOLS_VERSION_STARTS_WITH = "vm_tools_version_starts_with";
  @SerializedName(SERIALIZED_NAME_VM_TOOLS_VERSION_STARTS_WITH)
  private String vmToolsVersionStartsWith;

  public static final String SERIALIZED_NAME_VM_USAGE = "vm_usage";
  @SerializedName(SERIALIZED_NAME_VM_USAGE)
  private VmUsage vmUsage;

  public static final String SERIALIZED_NAME_VM_USAGE_IN = "vm_usage_in";
  @SerializedName(SERIALIZED_NAME_VM_USAGE_IN)
  private List<VmUsage> vmUsageIn = null;

  public static final String SERIALIZED_NAME_VM_USAGE_NOT = "vm_usage_not";
  @SerializedName(SERIALIZED_NAME_VM_USAGE_NOT)
  private VmUsage vmUsageNot;

  public static final String SERIALIZED_NAME_VM_USAGE_NOT_IN = "vm_usage_not_in";
  @SerializedName(SERIALIZED_NAME_VM_USAGE_NOT_IN)
  private List<VmUsage> vmUsageNotIn = null;

  public static final String SERIALIZED_NAME_WIN_OPT = "win_opt";
  @SerializedName(SERIALIZED_NAME_WIN_OPT)
  private Boolean winOpt;

  public static final String SERIALIZED_NAME_WIN_OPT_NOT = "win_opt_not";
  @SerializedName(SERIALIZED_NAME_WIN_OPT_NOT)
  private Boolean winOptNot;

  public VmWhereInput() { 
  }

  public VmWhereInput AND(List<VmWhereInput> AND) {
    
    this.AND = AND;
    return this;
  }

  public VmWhereInput addANDItem(VmWhereInput ANDItem) {
    if (this.AND == null) {
      this.AND = new ArrayList<VmWhereInput>();
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

  public List<VmWhereInput> getAND() {
    return AND;
  }


  public void setAND(List<VmWhereInput> AND) {
    this.AND = AND;
  }


  public VmWhereInput NOT(List<VmWhereInput> NOT) {
    
    this.NOT = NOT;
    return this;
  }

  public VmWhereInput addNOTItem(VmWhereInput NOTItem) {
    if (this.NOT == null) {
      this.NOT = new ArrayList<VmWhereInput>();
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

  public List<VmWhereInput> getNOT() {
    return NOT;
  }


  public void setNOT(List<VmWhereInput> NOT) {
    this.NOT = NOT;
  }


  public VmWhereInput OR(List<VmWhereInput> OR) {
    
    this.OR = OR;
    return this;
  }

  public VmWhereInput addORItem(VmWhereInput ORItem) {
    if (this.OR == null) {
      this.OR = new ArrayList<VmWhereInput>();
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

  public List<VmWhereInput> getOR() {
    return OR;
  }


  public void setOR(List<VmWhereInput> OR) {
    this.OR = OR;
  }


  public VmWhereInput biosUuid(String biosUuid) {
    
    this.biosUuid = biosUuid;
    return this;
  }

   /**
   * Get biosUuid
   * @return biosUuid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getBiosUuid() {
    return biosUuid;
  }


  public void setBiosUuid(String biosUuid) {
    this.biosUuid = biosUuid;
  }


  public VmWhereInput biosUuidContains(String biosUuidContains) {
    
    this.biosUuidContains = biosUuidContains;
    return this;
  }

   /**
   * Get biosUuidContains
   * @return biosUuidContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getBiosUuidContains() {
    return biosUuidContains;
  }


  public void setBiosUuidContains(String biosUuidContains) {
    this.biosUuidContains = biosUuidContains;
  }


  public VmWhereInput biosUuidEndsWith(String biosUuidEndsWith) {
    
    this.biosUuidEndsWith = biosUuidEndsWith;
    return this;
  }

   /**
   * Get biosUuidEndsWith
   * @return biosUuidEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getBiosUuidEndsWith() {
    return biosUuidEndsWith;
  }


  public void setBiosUuidEndsWith(String biosUuidEndsWith) {
    this.biosUuidEndsWith = biosUuidEndsWith;
  }


  public VmWhereInput biosUuidGt(String biosUuidGt) {
    
    this.biosUuidGt = biosUuidGt;
    return this;
  }

   /**
   * Get biosUuidGt
   * @return biosUuidGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getBiosUuidGt() {
    return biosUuidGt;
  }


  public void setBiosUuidGt(String biosUuidGt) {
    this.biosUuidGt = biosUuidGt;
  }


  public VmWhereInput biosUuidGte(String biosUuidGte) {
    
    this.biosUuidGte = biosUuidGte;
    return this;
  }

   /**
   * Get biosUuidGte
   * @return biosUuidGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getBiosUuidGte() {
    return biosUuidGte;
  }


  public void setBiosUuidGte(String biosUuidGte) {
    this.biosUuidGte = biosUuidGte;
  }


  public VmWhereInput biosUuidIn(List<String> biosUuidIn) {
    
    this.biosUuidIn = biosUuidIn;
    return this;
  }

  public VmWhereInput addBiosUuidInItem(String biosUuidInItem) {
    if (this.biosUuidIn == null) {
      this.biosUuidIn = new ArrayList<String>();
    }
    this.biosUuidIn.add(biosUuidInItem);
    return this;
  }

   /**
   * Get biosUuidIn
   * @return biosUuidIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getBiosUuidIn() {
    return biosUuidIn;
  }


  public void setBiosUuidIn(List<String> biosUuidIn) {
    this.biosUuidIn = biosUuidIn;
  }


  public VmWhereInput biosUuidLt(String biosUuidLt) {
    
    this.biosUuidLt = biosUuidLt;
    return this;
  }

   /**
   * Get biosUuidLt
   * @return biosUuidLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getBiosUuidLt() {
    return biosUuidLt;
  }


  public void setBiosUuidLt(String biosUuidLt) {
    this.biosUuidLt = biosUuidLt;
  }


  public VmWhereInput biosUuidLte(String biosUuidLte) {
    
    this.biosUuidLte = biosUuidLte;
    return this;
  }

   /**
   * Get biosUuidLte
   * @return biosUuidLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getBiosUuidLte() {
    return biosUuidLte;
  }


  public void setBiosUuidLte(String biosUuidLte) {
    this.biosUuidLte = biosUuidLte;
  }


  public VmWhereInput biosUuidNot(String biosUuidNot) {
    
    this.biosUuidNot = biosUuidNot;
    return this;
  }

   /**
   * Get biosUuidNot
   * @return biosUuidNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getBiosUuidNot() {
    return biosUuidNot;
  }


  public void setBiosUuidNot(String biosUuidNot) {
    this.biosUuidNot = biosUuidNot;
  }


  public VmWhereInput biosUuidNotContains(String biosUuidNotContains) {
    
    this.biosUuidNotContains = biosUuidNotContains;
    return this;
  }

   /**
   * Get biosUuidNotContains
   * @return biosUuidNotContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getBiosUuidNotContains() {
    return biosUuidNotContains;
  }


  public void setBiosUuidNotContains(String biosUuidNotContains) {
    this.biosUuidNotContains = biosUuidNotContains;
  }


  public VmWhereInput biosUuidNotEndsWith(String biosUuidNotEndsWith) {
    
    this.biosUuidNotEndsWith = biosUuidNotEndsWith;
    return this;
  }

   /**
   * Get biosUuidNotEndsWith
   * @return biosUuidNotEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getBiosUuidNotEndsWith() {
    return biosUuidNotEndsWith;
  }


  public void setBiosUuidNotEndsWith(String biosUuidNotEndsWith) {
    this.biosUuidNotEndsWith = biosUuidNotEndsWith;
  }


  public VmWhereInput biosUuidNotIn(List<String> biosUuidNotIn) {
    
    this.biosUuidNotIn = biosUuidNotIn;
    return this;
  }

  public VmWhereInput addBiosUuidNotInItem(String biosUuidNotInItem) {
    if (this.biosUuidNotIn == null) {
      this.biosUuidNotIn = new ArrayList<String>();
    }
    this.biosUuidNotIn.add(biosUuidNotInItem);
    return this;
  }

   /**
   * Get biosUuidNotIn
   * @return biosUuidNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getBiosUuidNotIn() {
    return biosUuidNotIn;
  }


  public void setBiosUuidNotIn(List<String> biosUuidNotIn) {
    this.biosUuidNotIn = biosUuidNotIn;
  }


  public VmWhereInput biosUuidNotStartsWith(String biosUuidNotStartsWith) {
    
    this.biosUuidNotStartsWith = biosUuidNotStartsWith;
    return this;
  }

   /**
   * Get biosUuidNotStartsWith
   * @return biosUuidNotStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getBiosUuidNotStartsWith() {
    return biosUuidNotStartsWith;
  }


  public void setBiosUuidNotStartsWith(String biosUuidNotStartsWith) {
    this.biosUuidNotStartsWith = biosUuidNotStartsWith;
  }


  public VmWhereInput biosUuidStartsWith(String biosUuidStartsWith) {
    
    this.biosUuidStartsWith = biosUuidStartsWith;
    return this;
  }

   /**
   * Get biosUuidStartsWith
   * @return biosUuidStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getBiosUuidStartsWith() {
    return biosUuidStartsWith;
  }


  public void setBiosUuidStartsWith(String biosUuidStartsWith) {
    this.biosUuidStartsWith = biosUuidStartsWith;
  }


  public VmWhereInput clockOffset(VmClockOffset clockOffset) {
    
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


  public VmWhereInput clockOffsetIn(List<VmClockOffset> clockOffsetIn) {
    
    this.clockOffsetIn = clockOffsetIn;
    return this;
  }

  public VmWhereInput addClockOffsetInItem(VmClockOffset clockOffsetInItem) {
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


  public VmWhereInput clockOffsetNot(VmClockOffset clockOffsetNot) {
    
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


  public VmWhereInput clockOffsetNotIn(List<VmClockOffset> clockOffsetNotIn) {
    
    this.clockOffsetNotIn = clockOffsetNotIn;
    return this;
  }

  public VmWhereInput addClockOffsetNotInItem(VmClockOffset clockOffsetNotInItem) {
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


  public VmWhereInput cloudInitSupported(Boolean cloudInitSupported) {
    
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


  public VmWhereInput cloudInitSupportedNot(Boolean cloudInitSupportedNot) {
    
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


  public VmWhereInput cluster(ClusterWhereInput cluster) {
    
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


  public VmWhereInput cpuModel(String cpuModel) {
    
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


  public VmWhereInput cpuModelContains(String cpuModelContains) {
    
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


  public VmWhereInput cpuModelEndsWith(String cpuModelEndsWith) {
    
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


  public VmWhereInput cpuModelGt(String cpuModelGt) {
    
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


  public VmWhereInput cpuModelGte(String cpuModelGte) {
    
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


  public VmWhereInput cpuModelIn(List<String> cpuModelIn) {
    
    this.cpuModelIn = cpuModelIn;
    return this;
  }

  public VmWhereInput addCpuModelInItem(String cpuModelInItem) {
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


  public VmWhereInput cpuModelLt(String cpuModelLt) {
    
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


  public VmWhereInput cpuModelLte(String cpuModelLte) {
    
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


  public VmWhereInput cpuModelNot(String cpuModelNot) {
    
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


  public VmWhereInput cpuModelNotContains(String cpuModelNotContains) {
    
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


  public VmWhereInput cpuModelNotEndsWith(String cpuModelNotEndsWith) {
    
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


  public VmWhereInput cpuModelNotIn(List<String> cpuModelNotIn) {
    
    this.cpuModelNotIn = cpuModelNotIn;
    return this;
  }

  public VmWhereInput addCpuModelNotInItem(String cpuModelNotInItem) {
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


  public VmWhereInput cpuModelNotStartsWith(String cpuModelNotStartsWith) {
    
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


  public VmWhereInput cpuModelStartsWith(String cpuModelStartsWith) {
    
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


  public VmWhereInput cpuUsage(Double cpuUsage) {
    
    this.cpuUsage = cpuUsage;
    return this;
  }

   /**
   * Get cpuUsage
   * @return cpuUsage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getCpuUsage() {
    return cpuUsage;
  }


  public void setCpuUsage(Double cpuUsage) {
    this.cpuUsage = cpuUsage;
  }


  public VmWhereInput cpuUsageGt(Double cpuUsageGt) {
    
    this.cpuUsageGt = cpuUsageGt;
    return this;
  }

   /**
   * Get cpuUsageGt
   * @return cpuUsageGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getCpuUsageGt() {
    return cpuUsageGt;
  }


  public void setCpuUsageGt(Double cpuUsageGt) {
    this.cpuUsageGt = cpuUsageGt;
  }


  public VmWhereInput cpuUsageGte(Double cpuUsageGte) {
    
    this.cpuUsageGte = cpuUsageGte;
    return this;
  }

   /**
   * Get cpuUsageGte
   * @return cpuUsageGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getCpuUsageGte() {
    return cpuUsageGte;
  }


  public void setCpuUsageGte(Double cpuUsageGte) {
    this.cpuUsageGte = cpuUsageGte;
  }


  public VmWhereInput cpuUsageIn(List<Double> cpuUsageIn) {
    
    this.cpuUsageIn = cpuUsageIn;
    return this;
  }

  public VmWhereInput addCpuUsageInItem(Double cpuUsageInItem) {
    if (this.cpuUsageIn == null) {
      this.cpuUsageIn = new ArrayList<Double>();
    }
    this.cpuUsageIn.add(cpuUsageInItem);
    return this;
  }

   /**
   * Get cpuUsageIn
   * @return cpuUsageIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Double> getCpuUsageIn() {
    return cpuUsageIn;
  }


  public void setCpuUsageIn(List<Double> cpuUsageIn) {
    this.cpuUsageIn = cpuUsageIn;
  }


  public VmWhereInput cpuUsageLt(Double cpuUsageLt) {
    
    this.cpuUsageLt = cpuUsageLt;
    return this;
  }

   /**
   * Get cpuUsageLt
   * @return cpuUsageLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getCpuUsageLt() {
    return cpuUsageLt;
  }


  public void setCpuUsageLt(Double cpuUsageLt) {
    this.cpuUsageLt = cpuUsageLt;
  }


  public VmWhereInput cpuUsageLte(Double cpuUsageLte) {
    
    this.cpuUsageLte = cpuUsageLte;
    return this;
  }

   /**
   * Get cpuUsageLte
   * @return cpuUsageLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getCpuUsageLte() {
    return cpuUsageLte;
  }


  public void setCpuUsageLte(Double cpuUsageLte) {
    this.cpuUsageLte = cpuUsageLte;
  }


  public VmWhereInput cpuUsageNot(Double cpuUsageNot) {
    
    this.cpuUsageNot = cpuUsageNot;
    return this;
  }

   /**
   * Get cpuUsageNot
   * @return cpuUsageNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getCpuUsageNot() {
    return cpuUsageNot;
  }


  public void setCpuUsageNot(Double cpuUsageNot) {
    this.cpuUsageNot = cpuUsageNot;
  }


  public VmWhereInput cpuUsageNotIn(List<Double> cpuUsageNotIn) {
    
    this.cpuUsageNotIn = cpuUsageNotIn;
    return this;
  }

  public VmWhereInput addCpuUsageNotInItem(Double cpuUsageNotInItem) {
    if (this.cpuUsageNotIn == null) {
      this.cpuUsageNotIn = new ArrayList<Double>();
    }
    this.cpuUsageNotIn.add(cpuUsageNotInItem);
    return this;
  }

   /**
   * Get cpuUsageNotIn
   * @return cpuUsageNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Double> getCpuUsageNotIn() {
    return cpuUsageNotIn;
  }


  public void setCpuUsageNotIn(List<Double> cpuUsageNotIn) {
    this.cpuUsageNotIn = cpuUsageNotIn;
  }


  public VmWhereInput deletedAt(String deletedAt) {
    
    this.deletedAt = deletedAt;
    return this;
  }

   /**
   * Get deletedAt
   * @return deletedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDeletedAt() {
    return deletedAt;
  }


  public void setDeletedAt(String deletedAt) {
    this.deletedAt = deletedAt;
  }


  public VmWhereInput deletedAtGt(String deletedAtGt) {
    
    this.deletedAtGt = deletedAtGt;
    return this;
  }

   /**
   * Get deletedAtGt
   * @return deletedAtGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDeletedAtGt() {
    return deletedAtGt;
  }


  public void setDeletedAtGt(String deletedAtGt) {
    this.deletedAtGt = deletedAtGt;
  }


  public VmWhereInput deletedAtGte(String deletedAtGte) {
    
    this.deletedAtGte = deletedAtGte;
    return this;
  }

   /**
   * Get deletedAtGte
   * @return deletedAtGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDeletedAtGte() {
    return deletedAtGte;
  }


  public void setDeletedAtGte(String deletedAtGte) {
    this.deletedAtGte = deletedAtGte;
  }


  public VmWhereInput deletedAtIn(List<String> deletedAtIn) {
    
    this.deletedAtIn = deletedAtIn;
    return this;
  }

  public VmWhereInput addDeletedAtInItem(String deletedAtInItem) {
    if (this.deletedAtIn == null) {
      this.deletedAtIn = new ArrayList<String>();
    }
    this.deletedAtIn.add(deletedAtInItem);
    return this;
  }

   /**
   * Get deletedAtIn
   * @return deletedAtIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getDeletedAtIn() {
    return deletedAtIn;
  }


  public void setDeletedAtIn(List<String> deletedAtIn) {
    this.deletedAtIn = deletedAtIn;
  }


  public VmWhereInput deletedAtLt(String deletedAtLt) {
    
    this.deletedAtLt = deletedAtLt;
    return this;
  }

   /**
   * Get deletedAtLt
   * @return deletedAtLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDeletedAtLt() {
    return deletedAtLt;
  }


  public void setDeletedAtLt(String deletedAtLt) {
    this.deletedAtLt = deletedAtLt;
  }


  public VmWhereInput deletedAtLte(String deletedAtLte) {
    
    this.deletedAtLte = deletedAtLte;
    return this;
  }

   /**
   * Get deletedAtLte
   * @return deletedAtLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDeletedAtLte() {
    return deletedAtLte;
  }


  public void setDeletedAtLte(String deletedAtLte) {
    this.deletedAtLte = deletedAtLte;
  }


  public VmWhereInput deletedAtNot(String deletedAtNot) {
    
    this.deletedAtNot = deletedAtNot;
    return this;
  }

   /**
   * Get deletedAtNot
   * @return deletedAtNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDeletedAtNot() {
    return deletedAtNot;
  }


  public void setDeletedAtNot(String deletedAtNot) {
    this.deletedAtNot = deletedAtNot;
  }


  public VmWhereInput deletedAtNotIn(List<String> deletedAtNotIn) {
    
    this.deletedAtNotIn = deletedAtNotIn;
    return this;
  }

  public VmWhereInput addDeletedAtNotInItem(String deletedAtNotInItem) {
    if (this.deletedAtNotIn == null) {
      this.deletedAtNotIn = new ArrayList<String>();
    }
    this.deletedAtNotIn.add(deletedAtNotInItem);
    return this;
  }

   /**
   * Get deletedAtNotIn
   * @return deletedAtNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getDeletedAtNotIn() {
    return deletedAtNotIn;
  }


  public void setDeletedAtNotIn(List<String> deletedAtNotIn) {
    this.deletedAtNotIn = deletedAtNotIn;
  }


  public VmWhereInput description(String description) {
    
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


  public VmWhereInput descriptionContains(String descriptionContains) {
    
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


  public VmWhereInput descriptionEndsWith(String descriptionEndsWith) {
    
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


  public VmWhereInput descriptionGt(String descriptionGt) {
    
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


  public VmWhereInput descriptionGte(String descriptionGte) {
    
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


  public VmWhereInput descriptionIn(List<String> descriptionIn) {
    
    this.descriptionIn = descriptionIn;
    return this;
  }

  public VmWhereInput addDescriptionInItem(String descriptionInItem) {
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


  public VmWhereInput descriptionLt(String descriptionLt) {
    
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


  public VmWhereInput descriptionLte(String descriptionLte) {
    
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


  public VmWhereInput descriptionNot(String descriptionNot) {
    
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


  public VmWhereInput descriptionNotContains(String descriptionNotContains) {
    
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


  public VmWhereInput descriptionNotEndsWith(String descriptionNotEndsWith) {
    
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


  public VmWhereInput descriptionNotIn(List<String> descriptionNotIn) {
    
    this.descriptionNotIn = descriptionNotIn;
    return this;
  }

  public VmWhereInput addDescriptionNotInItem(String descriptionNotInItem) {
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


  public VmWhereInput descriptionNotStartsWith(String descriptionNotStartsWith) {
    
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


  public VmWhereInput descriptionStartsWith(String descriptionStartsWith) {
    
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


  public VmWhereInput dnsServers(String dnsServers) {
    
    this.dnsServers = dnsServers;
    return this;
  }

   /**
   * Get dnsServers
   * @return dnsServers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDnsServers() {
    return dnsServers;
  }


  public void setDnsServers(String dnsServers) {
    this.dnsServers = dnsServers;
  }


  public VmWhereInput dnsServersContains(String dnsServersContains) {
    
    this.dnsServersContains = dnsServersContains;
    return this;
  }

   /**
   * Get dnsServersContains
   * @return dnsServersContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDnsServersContains() {
    return dnsServersContains;
  }


  public void setDnsServersContains(String dnsServersContains) {
    this.dnsServersContains = dnsServersContains;
  }


  public VmWhereInput dnsServersEndsWith(String dnsServersEndsWith) {
    
    this.dnsServersEndsWith = dnsServersEndsWith;
    return this;
  }

   /**
   * Get dnsServersEndsWith
   * @return dnsServersEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDnsServersEndsWith() {
    return dnsServersEndsWith;
  }


  public void setDnsServersEndsWith(String dnsServersEndsWith) {
    this.dnsServersEndsWith = dnsServersEndsWith;
  }


  public VmWhereInput dnsServersGt(String dnsServersGt) {
    
    this.dnsServersGt = dnsServersGt;
    return this;
  }

   /**
   * Get dnsServersGt
   * @return dnsServersGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDnsServersGt() {
    return dnsServersGt;
  }


  public void setDnsServersGt(String dnsServersGt) {
    this.dnsServersGt = dnsServersGt;
  }


  public VmWhereInput dnsServersGte(String dnsServersGte) {
    
    this.dnsServersGte = dnsServersGte;
    return this;
  }

   /**
   * Get dnsServersGte
   * @return dnsServersGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDnsServersGte() {
    return dnsServersGte;
  }


  public void setDnsServersGte(String dnsServersGte) {
    this.dnsServersGte = dnsServersGte;
  }


  public VmWhereInput dnsServersIn(List<String> dnsServersIn) {
    
    this.dnsServersIn = dnsServersIn;
    return this;
  }

  public VmWhereInput addDnsServersInItem(String dnsServersInItem) {
    if (this.dnsServersIn == null) {
      this.dnsServersIn = new ArrayList<String>();
    }
    this.dnsServersIn.add(dnsServersInItem);
    return this;
  }

   /**
   * Get dnsServersIn
   * @return dnsServersIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getDnsServersIn() {
    return dnsServersIn;
  }


  public void setDnsServersIn(List<String> dnsServersIn) {
    this.dnsServersIn = dnsServersIn;
  }


  public VmWhereInput dnsServersLt(String dnsServersLt) {
    
    this.dnsServersLt = dnsServersLt;
    return this;
  }

   /**
   * Get dnsServersLt
   * @return dnsServersLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDnsServersLt() {
    return dnsServersLt;
  }


  public void setDnsServersLt(String dnsServersLt) {
    this.dnsServersLt = dnsServersLt;
  }


  public VmWhereInput dnsServersLte(String dnsServersLte) {
    
    this.dnsServersLte = dnsServersLte;
    return this;
  }

   /**
   * Get dnsServersLte
   * @return dnsServersLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDnsServersLte() {
    return dnsServersLte;
  }


  public void setDnsServersLte(String dnsServersLte) {
    this.dnsServersLte = dnsServersLte;
  }


  public VmWhereInput dnsServersNot(String dnsServersNot) {
    
    this.dnsServersNot = dnsServersNot;
    return this;
  }

   /**
   * Get dnsServersNot
   * @return dnsServersNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDnsServersNot() {
    return dnsServersNot;
  }


  public void setDnsServersNot(String dnsServersNot) {
    this.dnsServersNot = dnsServersNot;
  }


  public VmWhereInput dnsServersNotContains(String dnsServersNotContains) {
    
    this.dnsServersNotContains = dnsServersNotContains;
    return this;
  }

   /**
   * Get dnsServersNotContains
   * @return dnsServersNotContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDnsServersNotContains() {
    return dnsServersNotContains;
  }


  public void setDnsServersNotContains(String dnsServersNotContains) {
    this.dnsServersNotContains = dnsServersNotContains;
  }


  public VmWhereInput dnsServersNotEndsWith(String dnsServersNotEndsWith) {
    
    this.dnsServersNotEndsWith = dnsServersNotEndsWith;
    return this;
  }

   /**
   * Get dnsServersNotEndsWith
   * @return dnsServersNotEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDnsServersNotEndsWith() {
    return dnsServersNotEndsWith;
  }


  public void setDnsServersNotEndsWith(String dnsServersNotEndsWith) {
    this.dnsServersNotEndsWith = dnsServersNotEndsWith;
  }


  public VmWhereInput dnsServersNotIn(List<String> dnsServersNotIn) {
    
    this.dnsServersNotIn = dnsServersNotIn;
    return this;
  }

  public VmWhereInput addDnsServersNotInItem(String dnsServersNotInItem) {
    if (this.dnsServersNotIn == null) {
      this.dnsServersNotIn = new ArrayList<String>();
    }
    this.dnsServersNotIn.add(dnsServersNotInItem);
    return this;
  }

   /**
   * Get dnsServersNotIn
   * @return dnsServersNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getDnsServersNotIn() {
    return dnsServersNotIn;
  }


  public void setDnsServersNotIn(List<String> dnsServersNotIn) {
    this.dnsServersNotIn = dnsServersNotIn;
  }


  public VmWhereInput dnsServersNotStartsWith(String dnsServersNotStartsWith) {
    
    this.dnsServersNotStartsWith = dnsServersNotStartsWith;
    return this;
  }

   /**
   * Get dnsServersNotStartsWith
   * @return dnsServersNotStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDnsServersNotStartsWith() {
    return dnsServersNotStartsWith;
  }


  public void setDnsServersNotStartsWith(String dnsServersNotStartsWith) {
    this.dnsServersNotStartsWith = dnsServersNotStartsWith;
  }


  public VmWhereInput dnsServersStartsWith(String dnsServersStartsWith) {
    
    this.dnsServersStartsWith = dnsServersStartsWith;
    return this;
  }

   /**
   * Get dnsServersStartsWith
   * @return dnsServersStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDnsServersStartsWith() {
    return dnsServersStartsWith;
  }


  public void setDnsServersStartsWith(String dnsServersStartsWith) {
    this.dnsServersStartsWith = dnsServersStartsWith;
  }


  public VmWhereInput entityAsyncStatus(EntityAsyncStatus entityAsyncStatus) {
    
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


  public VmWhereInput entityAsyncStatusIn(List<EntityAsyncStatus> entityAsyncStatusIn) {
    
    this.entityAsyncStatusIn = entityAsyncStatusIn;
    return this;
  }

  public VmWhereInput addEntityAsyncStatusInItem(EntityAsyncStatus entityAsyncStatusInItem) {
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


  public VmWhereInput entityAsyncStatusNot(EntityAsyncStatus entityAsyncStatusNot) {
    
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


  public VmWhereInput entityAsyncStatusNotIn(List<EntityAsyncStatus> entityAsyncStatusNotIn) {
    
    this.entityAsyncStatusNotIn = entityAsyncStatusNotIn;
    return this;
  }

  public VmWhereInput addEntityAsyncStatusNotInItem(EntityAsyncStatus entityAsyncStatusNotInItem) {
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


  public VmWhereInput firmware(VmFirmware firmware) {
    
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


  public VmWhereInput firmwareIn(List<VmFirmware> firmwareIn) {
    
    this.firmwareIn = firmwareIn;
    return this;
  }

  public VmWhereInput addFirmwareInItem(VmFirmware firmwareInItem) {
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


  public VmWhereInput firmwareNot(VmFirmware firmwareNot) {
    
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


  public VmWhereInput firmwareNotIn(List<VmFirmware> firmwareNotIn) {
    
    this.firmwareNotIn = firmwareNotIn;
    return this;
  }

  public VmWhereInput addFirmwareNotInItem(VmFirmware firmwareNotInItem) {
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


  public VmWhereInput folder(VmFolderWhereInput folder) {
    
    this.folder = folder;
    return this;
  }

   /**
   * Get folder
   * @return folder
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VmFolderWhereInput getFolder() {
    return folder;
  }


  public void setFolder(VmFolderWhereInput folder) {
    this.folder = folder;
  }


  public VmWhereInput gpuDevicesEvery(GpuDeviceWhereInput gpuDevicesEvery) {
    
    this.gpuDevicesEvery = gpuDevicesEvery;
    return this;
  }

   /**
   * Get gpuDevicesEvery
   * @return gpuDevicesEvery
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GpuDeviceWhereInput getGpuDevicesEvery() {
    return gpuDevicesEvery;
  }


  public void setGpuDevicesEvery(GpuDeviceWhereInput gpuDevicesEvery) {
    this.gpuDevicesEvery = gpuDevicesEvery;
  }


  public VmWhereInput gpuDevicesNone(GpuDeviceWhereInput gpuDevicesNone) {
    
    this.gpuDevicesNone = gpuDevicesNone;
    return this;
  }

   /**
   * Get gpuDevicesNone
   * @return gpuDevicesNone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GpuDeviceWhereInput getGpuDevicesNone() {
    return gpuDevicesNone;
  }


  public void setGpuDevicesNone(GpuDeviceWhereInput gpuDevicesNone) {
    this.gpuDevicesNone = gpuDevicesNone;
  }


  public VmWhereInput gpuDevicesSome(GpuDeviceWhereInput gpuDevicesSome) {
    
    this.gpuDevicesSome = gpuDevicesSome;
    return this;
  }

   /**
   * Get gpuDevicesSome
   * @return gpuDevicesSome
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GpuDeviceWhereInput getGpuDevicesSome() {
    return gpuDevicesSome;
  }


  public void setGpuDevicesSome(GpuDeviceWhereInput gpuDevicesSome) {
    this.gpuDevicesSome = gpuDevicesSome;
  }


  public VmWhereInput guestCpuModel(String guestCpuModel) {
    
    this.guestCpuModel = guestCpuModel;
    return this;
  }

   /**
   * Get guestCpuModel
   * @return guestCpuModel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getGuestCpuModel() {
    return guestCpuModel;
  }


  public void setGuestCpuModel(String guestCpuModel) {
    this.guestCpuModel = guestCpuModel;
  }


  public VmWhereInput guestCpuModelContains(String guestCpuModelContains) {
    
    this.guestCpuModelContains = guestCpuModelContains;
    return this;
  }

   /**
   * Get guestCpuModelContains
   * @return guestCpuModelContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getGuestCpuModelContains() {
    return guestCpuModelContains;
  }


  public void setGuestCpuModelContains(String guestCpuModelContains) {
    this.guestCpuModelContains = guestCpuModelContains;
  }


  public VmWhereInput guestCpuModelEndsWith(String guestCpuModelEndsWith) {
    
    this.guestCpuModelEndsWith = guestCpuModelEndsWith;
    return this;
  }

   /**
   * Get guestCpuModelEndsWith
   * @return guestCpuModelEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getGuestCpuModelEndsWith() {
    return guestCpuModelEndsWith;
  }


  public void setGuestCpuModelEndsWith(String guestCpuModelEndsWith) {
    this.guestCpuModelEndsWith = guestCpuModelEndsWith;
  }


  public VmWhereInput guestCpuModelGt(String guestCpuModelGt) {
    
    this.guestCpuModelGt = guestCpuModelGt;
    return this;
  }

   /**
   * Get guestCpuModelGt
   * @return guestCpuModelGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getGuestCpuModelGt() {
    return guestCpuModelGt;
  }


  public void setGuestCpuModelGt(String guestCpuModelGt) {
    this.guestCpuModelGt = guestCpuModelGt;
  }


  public VmWhereInput guestCpuModelGte(String guestCpuModelGte) {
    
    this.guestCpuModelGte = guestCpuModelGte;
    return this;
  }

   /**
   * Get guestCpuModelGte
   * @return guestCpuModelGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getGuestCpuModelGte() {
    return guestCpuModelGte;
  }


  public void setGuestCpuModelGte(String guestCpuModelGte) {
    this.guestCpuModelGte = guestCpuModelGte;
  }


  public VmWhereInput guestCpuModelIn(List<String> guestCpuModelIn) {
    
    this.guestCpuModelIn = guestCpuModelIn;
    return this;
  }

  public VmWhereInput addGuestCpuModelInItem(String guestCpuModelInItem) {
    if (this.guestCpuModelIn == null) {
      this.guestCpuModelIn = new ArrayList<String>();
    }
    this.guestCpuModelIn.add(guestCpuModelInItem);
    return this;
  }

   /**
   * Get guestCpuModelIn
   * @return guestCpuModelIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getGuestCpuModelIn() {
    return guestCpuModelIn;
  }


  public void setGuestCpuModelIn(List<String> guestCpuModelIn) {
    this.guestCpuModelIn = guestCpuModelIn;
  }


  public VmWhereInput guestCpuModelLt(String guestCpuModelLt) {
    
    this.guestCpuModelLt = guestCpuModelLt;
    return this;
  }

   /**
   * Get guestCpuModelLt
   * @return guestCpuModelLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getGuestCpuModelLt() {
    return guestCpuModelLt;
  }


  public void setGuestCpuModelLt(String guestCpuModelLt) {
    this.guestCpuModelLt = guestCpuModelLt;
  }


  public VmWhereInput guestCpuModelLte(String guestCpuModelLte) {
    
    this.guestCpuModelLte = guestCpuModelLte;
    return this;
  }

   /**
   * Get guestCpuModelLte
   * @return guestCpuModelLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getGuestCpuModelLte() {
    return guestCpuModelLte;
  }


  public void setGuestCpuModelLte(String guestCpuModelLte) {
    this.guestCpuModelLte = guestCpuModelLte;
  }


  public VmWhereInput guestCpuModelNot(String guestCpuModelNot) {
    
    this.guestCpuModelNot = guestCpuModelNot;
    return this;
  }

   /**
   * Get guestCpuModelNot
   * @return guestCpuModelNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getGuestCpuModelNot() {
    return guestCpuModelNot;
  }


  public void setGuestCpuModelNot(String guestCpuModelNot) {
    this.guestCpuModelNot = guestCpuModelNot;
  }


  public VmWhereInput guestCpuModelNotContains(String guestCpuModelNotContains) {
    
    this.guestCpuModelNotContains = guestCpuModelNotContains;
    return this;
  }

   /**
   * Get guestCpuModelNotContains
   * @return guestCpuModelNotContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getGuestCpuModelNotContains() {
    return guestCpuModelNotContains;
  }


  public void setGuestCpuModelNotContains(String guestCpuModelNotContains) {
    this.guestCpuModelNotContains = guestCpuModelNotContains;
  }


  public VmWhereInput guestCpuModelNotEndsWith(String guestCpuModelNotEndsWith) {
    
    this.guestCpuModelNotEndsWith = guestCpuModelNotEndsWith;
    return this;
  }

   /**
   * Get guestCpuModelNotEndsWith
   * @return guestCpuModelNotEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getGuestCpuModelNotEndsWith() {
    return guestCpuModelNotEndsWith;
  }


  public void setGuestCpuModelNotEndsWith(String guestCpuModelNotEndsWith) {
    this.guestCpuModelNotEndsWith = guestCpuModelNotEndsWith;
  }


  public VmWhereInput guestCpuModelNotIn(List<String> guestCpuModelNotIn) {
    
    this.guestCpuModelNotIn = guestCpuModelNotIn;
    return this;
  }

  public VmWhereInput addGuestCpuModelNotInItem(String guestCpuModelNotInItem) {
    if (this.guestCpuModelNotIn == null) {
      this.guestCpuModelNotIn = new ArrayList<String>();
    }
    this.guestCpuModelNotIn.add(guestCpuModelNotInItem);
    return this;
  }

   /**
   * Get guestCpuModelNotIn
   * @return guestCpuModelNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getGuestCpuModelNotIn() {
    return guestCpuModelNotIn;
  }


  public void setGuestCpuModelNotIn(List<String> guestCpuModelNotIn) {
    this.guestCpuModelNotIn = guestCpuModelNotIn;
  }


  public VmWhereInput guestCpuModelNotStartsWith(String guestCpuModelNotStartsWith) {
    
    this.guestCpuModelNotStartsWith = guestCpuModelNotStartsWith;
    return this;
  }

   /**
   * Get guestCpuModelNotStartsWith
   * @return guestCpuModelNotStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getGuestCpuModelNotStartsWith() {
    return guestCpuModelNotStartsWith;
  }


  public void setGuestCpuModelNotStartsWith(String guestCpuModelNotStartsWith) {
    this.guestCpuModelNotStartsWith = guestCpuModelNotStartsWith;
  }


  public VmWhereInput guestCpuModelStartsWith(String guestCpuModelStartsWith) {
    
    this.guestCpuModelStartsWith = guestCpuModelStartsWith;
    return this;
  }

   /**
   * Get guestCpuModelStartsWith
   * @return guestCpuModelStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getGuestCpuModelStartsWith() {
    return guestCpuModelStartsWith;
  }


  public void setGuestCpuModelStartsWith(String guestCpuModelStartsWith) {
    this.guestCpuModelStartsWith = guestCpuModelStartsWith;
  }


  public VmWhereInput guestOsType(VmGuestsOperationSystem guestOsType) {
    
    this.guestOsType = guestOsType;
    return this;
  }

   /**
   * Get guestOsType
   * @return guestOsType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VmGuestsOperationSystem getGuestOsType() {
    return guestOsType;
  }


  public void setGuestOsType(VmGuestsOperationSystem guestOsType) {
    this.guestOsType = guestOsType;
  }


  public VmWhereInput guestOsTypeIn(List<VmGuestsOperationSystem> guestOsTypeIn) {
    
    this.guestOsTypeIn = guestOsTypeIn;
    return this;
  }

  public VmWhereInput addGuestOsTypeInItem(VmGuestsOperationSystem guestOsTypeInItem) {
    if (this.guestOsTypeIn == null) {
      this.guestOsTypeIn = new ArrayList<VmGuestsOperationSystem>();
    }
    this.guestOsTypeIn.add(guestOsTypeInItem);
    return this;
  }

   /**
   * Get guestOsTypeIn
   * @return guestOsTypeIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<VmGuestsOperationSystem> getGuestOsTypeIn() {
    return guestOsTypeIn;
  }


  public void setGuestOsTypeIn(List<VmGuestsOperationSystem> guestOsTypeIn) {
    this.guestOsTypeIn = guestOsTypeIn;
  }


  public VmWhereInput guestOsTypeNot(VmGuestsOperationSystem guestOsTypeNot) {
    
    this.guestOsTypeNot = guestOsTypeNot;
    return this;
  }

   /**
   * Get guestOsTypeNot
   * @return guestOsTypeNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VmGuestsOperationSystem getGuestOsTypeNot() {
    return guestOsTypeNot;
  }


  public void setGuestOsTypeNot(VmGuestsOperationSystem guestOsTypeNot) {
    this.guestOsTypeNot = guestOsTypeNot;
  }


  public VmWhereInput guestOsTypeNotIn(List<VmGuestsOperationSystem> guestOsTypeNotIn) {
    
    this.guestOsTypeNotIn = guestOsTypeNotIn;
    return this;
  }

  public VmWhereInput addGuestOsTypeNotInItem(VmGuestsOperationSystem guestOsTypeNotInItem) {
    if (this.guestOsTypeNotIn == null) {
      this.guestOsTypeNotIn = new ArrayList<VmGuestsOperationSystem>();
    }
    this.guestOsTypeNotIn.add(guestOsTypeNotInItem);
    return this;
  }

   /**
   * Get guestOsTypeNotIn
   * @return guestOsTypeNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<VmGuestsOperationSystem> getGuestOsTypeNotIn() {
    return guestOsTypeNotIn;
  }


  public void setGuestOsTypeNotIn(List<VmGuestsOperationSystem> guestOsTypeNotIn) {
    this.guestOsTypeNotIn = guestOsTypeNotIn;
  }


  public VmWhereInput guestSizeUsage(Double guestSizeUsage) {
    
    this.guestSizeUsage = guestSizeUsage;
    return this;
  }

   /**
   * Get guestSizeUsage
   * @return guestSizeUsage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getGuestSizeUsage() {
    return guestSizeUsage;
  }


  public void setGuestSizeUsage(Double guestSizeUsage) {
    this.guestSizeUsage = guestSizeUsage;
  }


  public VmWhereInput guestSizeUsageGt(Double guestSizeUsageGt) {
    
    this.guestSizeUsageGt = guestSizeUsageGt;
    return this;
  }

   /**
   * Get guestSizeUsageGt
   * @return guestSizeUsageGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getGuestSizeUsageGt() {
    return guestSizeUsageGt;
  }


  public void setGuestSizeUsageGt(Double guestSizeUsageGt) {
    this.guestSizeUsageGt = guestSizeUsageGt;
  }


  public VmWhereInput guestSizeUsageGte(Double guestSizeUsageGte) {
    
    this.guestSizeUsageGte = guestSizeUsageGte;
    return this;
  }

   /**
   * Get guestSizeUsageGte
   * @return guestSizeUsageGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getGuestSizeUsageGte() {
    return guestSizeUsageGte;
  }


  public void setGuestSizeUsageGte(Double guestSizeUsageGte) {
    this.guestSizeUsageGte = guestSizeUsageGte;
  }


  public VmWhereInput guestSizeUsageIn(List<Double> guestSizeUsageIn) {
    
    this.guestSizeUsageIn = guestSizeUsageIn;
    return this;
  }

  public VmWhereInput addGuestSizeUsageInItem(Double guestSizeUsageInItem) {
    if (this.guestSizeUsageIn == null) {
      this.guestSizeUsageIn = new ArrayList<Double>();
    }
    this.guestSizeUsageIn.add(guestSizeUsageInItem);
    return this;
  }

   /**
   * Get guestSizeUsageIn
   * @return guestSizeUsageIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Double> getGuestSizeUsageIn() {
    return guestSizeUsageIn;
  }


  public void setGuestSizeUsageIn(List<Double> guestSizeUsageIn) {
    this.guestSizeUsageIn = guestSizeUsageIn;
  }


  public VmWhereInput guestSizeUsageLt(Double guestSizeUsageLt) {
    
    this.guestSizeUsageLt = guestSizeUsageLt;
    return this;
  }

   /**
   * Get guestSizeUsageLt
   * @return guestSizeUsageLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getGuestSizeUsageLt() {
    return guestSizeUsageLt;
  }


  public void setGuestSizeUsageLt(Double guestSizeUsageLt) {
    this.guestSizeUsageLt = guestSizeUsageLt;
  }


  public VmWhereInput guestSizeUsageLte(Double guestSizeUsageLte) {
    
    this.guestSizeUsageLte = guestSizeUsageLte;
    return this;
  }

   /**
   * Get guestSizeUsageLte
   * @return guestSizeUsageLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getGuestSizeUsageLte() {
    return guestSizeUsageLte;
  }


  public void setGuestSizeUsageLte(Double guestSizeUsageLte) {
    this.guestSizeUsageLte = guestSizeUsageLte;
  }


  public VmWhereInput guestSizeUsageNot(Double guestSizeUsageNot) {
    
    this.guestSizeUsageNot = guestSizeUsageNot;
    return this;
  }

   /**
   * Get guestSizeUsageNot
   * @return guestSizeUsageNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getGuestSizeUsageNot() {
    return guestSizeUsageNot;
  }


  public void setGuestSizeUsageNot(Double guestSizeUsageNot) {
    this.guestSizeUsageNot = guestSizeUsageNot;
  }


  public VmWhereInput guestSizeUsageNotIn(List<Double> guestSizeUsageNotIn) {
    
    this.guestSizeUsageNotIn = guestSizeUsageNotIn;
    return this;
  }

  public VmWhereInput addGuestSizeUsageNotInItem(Double guestSizeUsageNotInItem) {
    if (this.guestSizeUsageNotIn == null) {
      this.guestSizeUsageNotIn = new ArrayList<Double>();
    }
    this.guestSizeUsageNotIn.add(guestSizeUsageNotInItem);
    return this;
  }

   /**
   * Get guestSizeUsageNotIn
   * @return guestSizeUsageNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Double> getGuestSizeUsageNotIn() {
    return guestSizeUsageNotIn;
  }


  public void setGuestSizeUsageNotIn(List<Double> guestSizeUsageNotIn) {
    this.guestSizeUsageNotIn = guestSizeUsageNotIn;
  }


  public VmWhereInput guestUsedSize(Long guestUsedSize) {
    
    this.guestUsedSize = guestUsedSize;
    return this;
  }

   /**
   * Get guestUsedSize
   * @return guestUsedSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getGuestUsedSize() {
    return guestUsedSize;
  }


  public void setGuestUsedSize(Long guestUsedSize) {
    this.guestUsedSize = guestUsedSize;
  }


  public VmWhereInput guestUsedSizeGt(Long guestUsedSizeGt) {
    
    this.guestUsedSizeGt = guestUsedSizeGt;
    return this;
  }

   /**
   * Get guestUsedSizeGt
   * @return guestUsedSizeGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getGuestUsedSizeGt() {
    return guestUsedSizeGt;
  }


  public void setGuestUsedSizeGt(Long guestUsedSizeGt) {
    this.guestUsedSizeGt = guestUsedSizeGt;
  }


  public VmWhereInput guestUsedSizeGte(Long guestUsedSizeGte) {
    
    this.guestUsedSizeGte = guestUsedSizeGte;
    return this;
  }

   /**
   * Get guestUsedSizeGte
   * @return guestUsedSizeGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getGuestUsedSizeGte() {
    return guestUsedSizeGte;
  }


  public void setGuestUsedSizeGte(Long guestUsedSizeGte) {
    this.guestUsedSizeGte = guestUsedSizeGte;
  }


  public VmWhereInput guestUsedSizeIn(List<Long> guestUsedSizeIn) {
    
    this.guestUsedSizeIn = guestUsedSizeIn;
    return this;
  }

  public VmWhereInput addGuestUsedSizeInItem(Long guestUsedSizeInItem) {
    if (this.guestUsedSizeIn == null) {
      this.guestUsedSizeIn = new ArrayList<Long>();
    }
    this.guestUsedSizeIn.add(guestUsedSizeInItem);
    return this;
  }

   /**
   * Get guestUsedSizeIn
   * @return guestUsedSizeIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Long> getGuestUsedSizeIn() {
    return guestUsedSizeIn;
  }


  public void setGuestUsedSizeIn(List<Long> guestUsedSizeIn) {
    this.guestUsedSizeIn = guestUsedSizeIn;
  }


  public VmWhereInput guestUsedSizeLt(Long guestUsedSizeLt) {
    
    this.guestUsedSizeLt = guestUsedSizeLt;
    return this;
  }

   /**
   * Get guestUsedSizeLt
   * @return guestUsedSizeLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getGuestUsedSizeLt() {
    return guestUsedSizeLt;
  }


  public void setGuestUsedSizeLt(Long guestUsedSizeLt) {
    this.guestUsedSizeLt = guestUsedSizeLt;
  }


  public VmWhereInput guestUsedSizeLte(Long guestUsedSizeLte) {
    
    this.guestUsedSizeLte = guestUsedSizeLte;
    return this;
  }

   /**
   * Get guestUsedSizeLte
   * @return guestUsedSizeLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getGuestUsedSizeLte() {
    return guestUsedSizeLte;
  }


  public void setGuestUsedSizeLte(Long guestUsedSizeLte) {
    this.guestUsedSizeLte = guestUsedSizeLte;
  }


  public VmWhereInput guestUsedSizeNot(Long guestUsedSizeNot) {
    
    this.guestUsedSizeNot = guestUsedSizeNot;
    return this;
  }

   /**
   * Get guestUsedSizeNot
   * @return guestUsedSizeNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getGuestUsedSizeNot() {
    return guestUsedSizeNot;
  }


  public void setGuestUsedSizeNot(Long guestUsedSizeNot) {
    this.guestUsedSizeNot = guestUsedSizeNot;
  }


  public VmWhereInput guestUsedSizeNotIn(List<Long> guestUsedSizeNotIn) {
    
    this.guestUsedSizeNotIn = guestUsedSizeNotIn;
    return this;
  }

  public VmWhereInput addGuestUsedSizeNotInItem(Long guestUsedSizeNotInItem) {
    if (this.guestUsedSizeNotIn == null) {
      this.guestUsedSizeNotIn = new ArrayList<Long>();
    }
    this.guestUsedSizeNotIn.add(guestUsedSizeNotInItem);
    return this;
  }

   /**
   * Get guestUsedSizeNotIn
   * @return guestUsedSizeNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Long> getGuestUsedSizeNotIn() {
    return guestUsedSizeNotIn;
  }


  public void setGuestUsedSizeNotIn(List<Long> guestUsedSizeNotIn) {
    this.guestUsedSizeNotIn = guestUsedSizeNotIn;
  }


  public VmWhereInput ha(Boolean ha) {
    
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


  public VmWhereInput haNot(Boolean haNot) {
    
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


  public VmWhereInput host(HostWhereInput host) {
    
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


  public VmWhereInput hostname(String hostname) {
    
    this.hostname = hostname;
    return this;
  }

   /**
   * Get hostname
   * @return hostname
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getHostname() {
    return hostname;
  }


  public void setHostname(String hostname) {
    this.hostname = hostname;
  }


  public VmWhereInput hostnameContains(String hostnameContains) {
    
    this.hostnameContains = hostnameContains;
    return this;
  }

   /**
   * Get hostnameContains
   * @return hostnameContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getHostnameContains() {
    return hostnameContains;
  }


  public void setHostnameContains(String hostnameContains) {
    this.hostnameContains = hostnameContains;
  }


  public VmWhereInput hostnameEndsWith(String hostnameEndsWith) {
    
    this.hostnameEndsWith = hostnameEndsWith;
    return this;
  }

   /**
   * Get hostnameEndsWith
   * @return hostnameEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getHostnameEndsWith() {
    return hostnameEndsWith;
  }


  public void setHostnameEndsWith(String hostnameEndsWith) {
    this.hostnameEndsWith = hostnameEndsWith;
  }


  public VmWhereInput hostnameGt(String hostnameGt) {
    
    this.hostnameGt = hostnameGt;
    return this;
  }

   /**
   * Get hostnameGt
   * @return hostnameGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getHostnameGt() {
    return hostnameGt;
  }


  public void setHostnameGt(String hostnameGt) {
    this.hostnameGt = hostnameGt;
  }


  public VmWhereInput hostnameGte(String hostnameGte) {
    
    this.hostnameGte = hostnameGte;
    return this;
  }

   /**
   * Get hostnameGte
   * @return hostnameGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getHostnameGte() {
    return hostnameGte;
  }


  public void setHostnameGte(String hostnameGte) {
    this.hostnameGte = hostnameGte;
  }


  public VmWhereInput hostnameIn(List<String> hostnameIn) {
    
    this.hostnameIn = hostnameIn;
    return this;
  }

  public VmWhereInput addHostnameInItem(String hostnameInItem) {
    if (this.hostnameIn == null) {
      this.hostnameIn = new ArrayList<String>();
    }
    this.hostnameIn.add(hostnameInItem);
    return this;
  }

   /**
   * Get hostnameIn
   * @return hostnameIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getHostnameIn() {
    return hostnameIn;
  }


  public void setHostnameIn(List<String> hostnameIn) {
    this.hostnameIn = hostnameIn;
  }


  public VmWhereInput hostnameLt(String hostnameLt) {
    
    this.hostnameLt = hostnameLt;
    return this;
  }

   /**
   * Get hostnameLt
   * @return hostnameLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getHostnameLt() {
    return hostnameLt;
  }


  public void setHostnameLt(String hostnameLt) {
    this.hostnameLt = hostnameLt;
  }


  public VmWhereInput hostnameLte(String hostnameLte) {
    
    this.hostnameLte = hostnameLte;
    return this;
  }

   /**
   * Get hostnameLte
   * @return hostnameLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getHostnameLte() {
    return hostnameLte;
  }


  public void setHostnameLte(String hostnameLte) {
    this.hostnameLte = hostnameLte;
  }


  public VmWhereInput hostnameNot(String hostnameNot) {
    
    this.hostnameNot = hostnameNot;
    return this;
  }

   /**
   * Get hostnameNot
   * @return hostnameNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getHostnameNot() {
    return hostnameNot;
  }


  public void setHostnameNot(String hostnameNot) {
    this.hostnameNot = hostnameNot;
  }


  public VmWhereInput hostnameNotContains(String hostnameNotContains) {
    
    this.hostnameNotContains = hostnameNotContains;
    return this;
  }

   /**
   * Get hostnameNotContains
   * @return hostnameNotContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getHostnameNotContains() {
    return hostnameNotContains;
  }


  public void setHostnameNotContains(String hostnameNotContains) {
    this.hostnameNotContains = hostnameNotContains;
  }


  public VmWhereInput hostnameNotEndsWith(String hostnameNotEndsWith) {
    
    this.hostnameNotEndsWith = hostnameNotEndsWith;
    return this;
  }

   /**
   * Get hostnameNotEndsWith
   * @return hostnameNotEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getHostnameNotEndsWith() {
    return hostnameNotEndsWith;
  }


  public void setHostnameNotEndsWith(String hostnameNotEndsWith) {
    this.hostnameNotEndsWith = hostnameNotEndsWith;
  }


  public VmWhereInput hostnameNotIn(List<String> hostnameNotIn) {
    
    this.hostnameNotIn = hostnameNotIn;
    return this;
  }

  public VmWhereInput addHostnameNotInItem(String hostnameNotInItem) {
    if (this.hostnameNotIn == null) {
      this.hostnameNotIn = new ArrayList<String>();
    }
    this.hostnameNotIn.add(hostnameNotInItem);
    return this;
  }

   /**
   * Get hostnameNotIn
   * @return hostnameNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getHostnameNotIn() {
    return hostnameNotIn;
  }


  public void setHostnameNotIn(List<String> hostnameNotIn) {
    this.hostnameNotIn = hostnameNotIn;
  }


  public VmWhereInput hostnameNotStartsWith(String hostnameNotStartsWith) {
    
    this.hostnameNotStartsWith = hostnameNotStartsWith;
    return this;
  }

   /**
   * Get hostnameNotStartsWith
   * @return hostnameNotStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getHostnameNotStartsWith() {
    return hostnameNotStartsWith;
  }


  public void setHostnameNotStartsWith(String hostnameNotStartsWith) {
    this.hostnameNotStartsWith = hostnameNotStartsWith;
  }


  public VmWhereInput hostnameStartsWith(String hostnameStartsWith) {
    
    this.hostnameStartsWith = hostnameStartsWith;
    return this;
  }

   /**
   * Get hostnameStartsWith
   * @return hostnameStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getHostnameStartsWith() {
    return hostnameStartsWith;
  }


  public void setHostnameStartsWith(String hostnameStartsWith) {
    this.hostnameStartsWith = hostnameStartsWith;
  }


  public VmWhereInput id(String id) {
    
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


  public VmWhereInput idContains(String idContains) {
    
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


  public VmWhereInput idEndsWith(String idEndsWith) {
    
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


  public VmWhereInput idGt(String idGt) {
    
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


  public VmWhereInput idGte(String idGte) {
    
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


  public VmWhereInput idIn(List<String> idIn) {
    
    this.idIn = idIn;
    return this;
  }

  public VmWhereInput addIdInItem(String idInItem) {
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


  public VmWhereInput idLt(String idLt) {
    
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


  public VmWhereInput idLte(String idLte) {
    
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


  public VmWhereInput idNot(String idNot) {
    
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


  public VmWhereInput idNotContains(String idNotContains) {
    
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


  public VmWhereInput idNotEndsWith(String idNotEndsWith) {
    
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


  public VmWhereInput idNotIn(List<String> idNotIn) {
    
    this.idNotIn = idNotIn;
    return this;
  }

  public VmWhereInput addIdNotInItem(String idNotInItem) {
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


  public VmWhereInput idNotStartsWith(String idNotStartsWith) {
    
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


  public VmWhereInput idStartsWith(String idStartsWith) {
    
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


  public VmWhereInput inRecycleBin(Boolean inRecycleBin) {
    
    this.inRecycleBin = inRecycleBin;
    return this;
  }

   /**
   * Get inRecycleBin
   * @return inRecycleBin
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getInRecycleBin() {
    return inRecycleBin;
  }


  public void setInRecycleBin(Boolean inRecycleBin) {
    this.inRecycleBin = inRecycleBin;
  }


  public VmWhereInput inRecycleBinNot(Boolean inRecycleBinNot) {
    
    this.inRecycleBinNot = inRecycleBinNot;
    return this;
  }

   /**
   * Get inRecycleBinNot
   * @return inRecycleBinNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getInRecycleBinNot() {
    return inRecycleBinNot;
  }


  public void setInRecycleBinNot(Boolean inRecycleBinNot) {
    this.inRecycleBinNot = inRecycleBinNot;
  }


  public VmWhereInput internal(Boolean internal) {
    
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


  public VmWhereInput internalNot(Boolean internalNot) {
    
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


  public VmWhereInput ioPolicy(VmDiskIoPolicy ioPolicy) {
    
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


  public VmWhereInput ioPolicyIn(List<VmDiskIoPolicy> ioPolicyIn) {
    
    this.ioPolicyIn = ioPolicyIn;
    return this;
  }

  public VmWhereInput addIoPolicyInItem(VmDiskIoPolicy ioPolicyInItem) {
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


  public VmWhereInput ioPolicyNot(VmDiskIoPolicy ioPolicyNot) {
    
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


  public VmWhereInput ioPolicyNotIn(List<VmDiskIoPolicy> ioPolicyNotIn) {
    
    this.ioPolicyNotIn = ioPolicyNotIn;
    return this;
  }

  public VmWhereInput addIoPolicyNotInItem(VmDiskIoPolicy ioPolicyNotInItem) {
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


  public VmWhereInput ips(String ips) {
    
    this.ips = ips;
    return this;
  }

   /**
   * Get ips
   * @return ips
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIps() {
    return ips;
  }


  public void setIps(String ips) {
    this.ips = ips;
  }


  public VmWhereInput ipsContains(String ipsContains) {
    
    this.ipsContains = ipsContains;
    return this;
  }

   /**
   * Get ipsContains
   * @return ipsContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIpsContains() {
    return ipsContains;
  }


  public void setIpsContains(String ipsContains) {
    this.ipsContains = ipsContains;
  }


  public VmWhereInput ipsEndsWith(String ipsEndsWith) {
    
    this.ipsEndsWith = ipsEndsWith;
    return this;
  }

   /**
   * Get ipsEndsWith
   * @return ipsEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIpsEndsWith() {
    return ipsEndsWith;
  }


  public void setIpsEndsWith(String ipsEndsWith) {
    this.ipsEndsWith = ipsEndsWith;
  }


  public VmWhereInput ipsGt(String ipsGt) {
    
    this.ipsGt = ipsGt;
    return this;
  }

   /**
   * Get ipsGt
   * @return ipsGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIpsGt() {
    return ipsGt;
  }


  public void setIpsGt(String ipsGt) {
    this.ipsGt = ipsGt;
  }


  public VmWhereInput ipsGte(String ipsGte) {
    
    this.ipsGte = ipsGte;
    return this;
  }

   /**
   * Get ipsGte
   * @return ipsGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIpsGte() {
    return ipsGte;
  }


  public void setIpsGte(String ipsGte) {
    this.ipsGte = ipsGte;
  }


  public VmWhereInput ipsIn(List<String> ipsIn) {
    
    this.ipsIn = ipsIn;
    return this;
  }

  public VmWhereInput addIpsInItem(String ipsInItem) {
    if (this.ipsIn == null) {
      this.ipsIn = new ArrayList<String>();
    }
    this.ipsIn.add(ipsInItem);
    return this;
  }

   /**
   * Get ipsIn
   * @return ipsIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getIpsIn() {
    return ipsIn;
  }


  public void setIpsIn(List<String> ipsIn) {
    this.ipsIn = ipsIn;
  }


  public VmWhereInput ipsLt(String ipsLt) {
    
    this.ipsLt = ipsLt;
    return this;
  }

   /**
   * Get ipsLt
   * @return ipsLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIpsLt() {
    return ipsLt;
  }


  public void setIpsLt(String ipsLt) {
    this.ipsLt = ipsLt;
  }


  public VmWhereInput ipsLte(String ipsLte) {
    
    this.ipsLte = ipsLte;
    return this;
  }

   /**
   * Get ipsLte
   * @return ipsLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIpsLte() {
    return ipsLte;
  }


  public void setIpsLte(String ipsLte) {
    this.ipsLte = ipsLte;
  }


  public VmWhereInput ipsNot(String ipsNot) {
    
    this.ipsNot = ipsNot;
    return this;
  }

   /**
   * Get ipsNot
   * @return ipsNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIpsNot() {
    return ipsNot;
  }


  public void setIpsNot(String ipsNot) {
    this.ipsNot = ipsNot;
  }


  public VmWhereInput ipsNotContains(String ipsNotContains) {
    
    this.ipsNotContains = ipsNotContains;
    return this;
  }

   /**
   * Get ipsNotContains
   * @return ipsNotContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIpsNotContains() {
    return ipsNotContains;
  }


  public void setIpsNotContains(String ipsNotContains) {
    this.ipsNotContains = ipsNotContains;
  }


  public VmWhereInput ipsNotEndsWith(String ipsNotEndsWith) {
    
    this.ipsNotEndsWith = ipsNotEndsWith;
    return this;
  }

   /**
   * Get ipsNotEndsWith
   * @return ipsNotEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIpsNotEndsWith() {
    return ipsNotEndsWith;
  }


  public void setIpsNotEndsWith(String ipsNotEndsWith) {
    this.ipsNotEndsWith = ipsNotEndsWith;
  }


  public VmWhereInput ipsNotIn(List<String> ipsNotIn) {
    
    this.ipsNotIn = ipsNotIn;
    return this;
  }

  public VmWhereInput addIpsNotInItem(String ipsNotInItem) {
    if (this.ipsNotIn == null) {
      this.ipsNotIn = new ArrayList<String>();
    }
    this.ipsNotIn.add(ipsNotInItem);
    return this;
  }

   /**
   * Get ipsNotIn
   * @return ipsNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getIpsNotIn() {
    return ipsNotIn;
  }


  public void setIpsNotIn(List<String> ipsNotIn) {
    this.ipsNotIn = ipsNotIn;
  }


  public VmWhereInput ipsNotStartsWith(String ipsNotStartsWith) {
    
    this.ipsNotStartsWith = ipsNotStartsWith;
    return this;
  }

   /**
   * Get ipsNotStartsWith
   * @return ipsNotStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIpsNotStartsWith() {
    return ipsNotStartsWith;
  }


  public void setIpsNotStartsWith(String ipsNotStartsWith) {
    this.ipsNotStartsWith = ipsNotStartsWith;
  }


  public VmWhereInput ipsStartsWith(String ipsStartsWith) {
    
    this.ipsStartsWith = ipsStartsWith;
    return this;
  }

   /**
   * Get ipsStartsWith
   * @return ipsStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIpsStartsWith() {
    return ipsStartsWith;
  }


  public void setIpsStartsWith(String ipsStartsWith) {
    this.ipsStartsWith = ipsStartsWith;
  }


  public VmWhereInput kernelInfo(String kernelInfo) {
    
    this.kernelInfo = kernelInfo;
    return this;
  }

   /**
   * Get kernelInfo
   * @return kernelInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getKernelInfo() {
    return kernelInfo;
  }


  public void setKernelInfo(String kernelInfo) {
    this.kernelInfo = kernelInfo;
  }


  public VmWhereInput kernelInfoContains(String kernelInfoContains) {
    
    this.kernelInfoContains = kernelInfoContains;
    return this;
  }

   /**
   * Get kernelInfoContains
   * @return kernelInfoContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getKernelInfoContains() {
    return kernelInfoContains;
  }


  public void setKernelInfoContains(String kernelInfoContains) {
    this.kernelInfoContains = kernelInfoContains;
  }


  public VmWhereInput kernelInfoEndsWith(String kernelInfoEndsWith) {
    
    this.kernelInfoEndsWith = kernelInfoEndsWith;
    return this;
  }

   /**
   * Get kernelInfoEndsWith
   * @return kernelInfoEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getKernelInfoEndsWith() {
    return kernelInfoEndsWith;
  }


  public void setKernelInfoEndsWith(String kernelInfoEndsWith) {
    this.kernelInfoEndsWith = kernelInfoEndsWith;
  }


  public VmWhereInput kernelInfoGt(String kernelInfoGt) {
    
    this.kernelInfoGt = kernelInfoGt;
    return this;
  }

   /**
   * Get kernelInfoGt
   * @return kernelInfoGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getKernelInfoGt() {
    return kernelInfoGt;
  }


  public void setKernelInfoGt(String kernelInfoGt) {
    this.kernelInfoGt = kernelInfoGt;
  }


  public VmWhereInput kernelInfoGte(String kernelInfoGte) {
    
    this.kernelInfoGte = kernelInfoGte;
    return this;
  }

   /**
   * Get kernelInfoGte
   * @return kernelInfoGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getKernelInfoGte() {
    return kernelInfoGte;
  }


  public void setKernelInfoGte(String kernelInfoGte) {
    this.kernelInfoGte = kernelInfoGte;
  }


  public VmWhereInput kernelInfoIn(List<String> kernelInfoIn) {
    
    this.kernelInfoIn = kernelInfoIn;
    return this;
  }

  public VmWhereInput addKernelInfoInItem(String kernelInfoInItem) {
    if (this.kernelInfoIn == null) {
      this.kernelInfoIn = new ArrayList<String>();
    }
    this.kernelInfoIn.add(kernelInfoInItem);
    return this;
  }

   /**
   * Get kernelInfoIn
   * @return kernelInfoIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getKernelInfoIn() {
    return kernelInfoIn;
  }


  public void setKernelInfoIn(List<String> kernelInfoIn) {
    this.kernelInfoIn = kernelInfoIn;
  }


  public VmWhereInput kernelInfoLt(String kernelInfoLt) {
    
    this.kernelInfoLt = kernelInfoLt;
    return this;
  }

   /**
   * Get kernelInfoLt
   * @return kernelInfoLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getKernelInfoLt() {
    return kernelInfoLt;
  }


  public void setKernelInfoLt(String kernelInfoLt) {
    this.kernelInfoLt = kernelInfoLt;
  }


  public VmWhereInput kernelInfoLte(String kernelInfoLte) {
    
    this.kernelInfoLte = kernelInfoLte;
    return this;
  }

   /**
   * Get kernelInfoLte
   * @return kernelInfoLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getKernelInfoLte() {
    return kernelInfoLte;
  }


  public void setKernelInfoLte(String kernelInfoLte) {
    this.kernelInfoLte = kernelInfoLte;
  }


  public VmWhereInput kernelInfoNot(String kernelInfoNot) {
    
    this.kernelInfoNot = kernelInfoNot;
    return this;
  }

   /**
   * Get kernelInfoNot
   * @return kernelInfoNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getKernelInfoNot() {
    return kernelInfoNot;
  }


  public void setKernelInfoNot(String kernelInfoNot) {
    this.kernelInfoNot = kernelInfoNot;
  }


  public VmWhereInput kernelInfoNotContains(String kernelInfoNotContains) {
    
    this.kernelInfoNotContains = kernelInfoNotContains;
    return this;
  }

   /**
   * Get kernelInfoNotContains
   * @return kernelInfoNotContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getKernelInfoNotContains() {
    return kernelInfoNotContains;
  }


  public void setKernelInfoNotContains(String kernelInfoNotContains) {
    this.kernelInfoNotContains = kernelInfoNotContains;
  }


  public VmWhereInput kernelInfoNotEndsWith(String kernelInfoNotEndsWith) {
    
    this.kernelInfoNotEndsWith = kernelInfoNotEndsWith;
    return this;
  }

   /**
   * Get kernelInfoNotEndsWith
   * @return kernelInfoNotEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getKernelInfoNotEndsWith() {
    return kernelInfoNotEndsWith;
  }


  public void setKernelInfoNotEndsWith(String kernelInfoNotEndsWith) {
    this.kernelInfoNotEndsWith = kernelInfoNotEndsWith;
  }


  public VmWhereInput kernelInfoNotIn(List<String> kernelInfoNotIn) {
    
    this.kernelInfoNotIn = kernelInfoNotIn;
    return this;
  }

  public VmWhereInput addKernelInfoNotInItem(String kernelInfoNotInItem) {
    if (this.kernelInfoNotIn == null) {
      this.kernelInfoNotIn = new ArrayList<String>();
    }
    this.kernelInfoNotIn.add(kernelInfoNotInItem);
    return this;
  }

   /**
   * Get kernelInfoNotIn
   * @return kernelInfoNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getKernelInfoNotIn() {
    return kernelInfoNotIn;
  }


  public void setKernelInfoNotIn(List<String> kernelInfoNotIn) {
    this.kernelInfoNotIn = kernelInfoNotIn;
  }


  public VmWhereInput kernelInfoNotStartsWith(String kernelInfoNotStartsWith) {
    
    this.kernelInfoNotStartsWith = kernelInfoNotStartsWith;
    return this;
  }

   /**
   * Get kernelInfoNotStartsWith
   * @return kernelInfoNotStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getKernelInfoNotStartsWith() {
    return kernelInfoNotStartsWith;
  }


  public void setKernelInfoNotStartsWith(String kernelInfoNotStartsWith) {
    this.kernelInfoNotStartsWith = kernelInfoNotStartsWith;
  }


  public VmWhereInput kernelInfoStartsWith(String kernelInfoStartsWith) {
    
    this.kernelInfoStartsWith = kernelInfoStartsWith;
    return this;
  }

   /**
   * Get kernelInfoStartsWith
   * @return kernelInfoStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getKernelInfoStartsWith() {
    return kernelInfoStartsWith;
  }


  public void setKernelInfoStartsWith(String kernelInfoStartsWith) {
    this.kernelInfoStartsWith = kernelInfoStartsWith;
  }


  public VmWhereInput labelsEvery(LabelWhereInput labelsEvery) {
    
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


  public VmWhereInput labelsNone(LabelWhereInput labelsNone) {
    
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


  public VmWhereInput labelsSome(LabelWhereInput labelsSome) {
    
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


  public VmWhereInput lastShutdownTime(String lastShutdownTime) {
    
    this.lastShutdownTime = lastShutdownTime;
    return this;
  }

   /**
   * Get lastShutdownTime
   * @return lastShutdownTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLastShutdownTime() {
    return lastShutdownTime;
  }


  public void setLastShutdownTime(String lastShutdownTime) {
    this.lastShutdownTime = lastShutdownTime;
  }


  public VmWhereInput lastShutdownTimeGt(String lastShutdownTimeGt) {
    
    this.lastShutdownTimeGt = lastShutdownTimeGt;
    return this;
  }

   /**
   * Get lastShutdownTimeGt
   * @return lastShutdownTimeGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLastShutdownTimeGt() {
    return lastShutdownTimeGt;
  }


  public void setLastShutdownTimeGt(String lastShutdownTimeGt) {
    this.lastShutdownTimeGt = lastShutdownTimeGt;
  }


  public VmWhereInput lastShutdownTimeGte(String lastShutdownTimeGte) {
    
    this.lastShutdownTimeGte = lastShutdownTimeGte;
    return this;
  }

   /**
   * Get lastShutdownTimeGte
   * @return lastShutdownTimeGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLastShutdownTimeGte() {
    return lastShutdownTimeGte;
  }


  public void setLastShutdownTimeGte(String lastShutdownTimeGte) {
    this.lastShutdownTimeGte = lastShutdownTimeGte;
  }


  public VmWhereInput lastShutdownTimeIn(List<String> lastShutdownTimeIn) {
    
    this.lastShutdownTimeIn = lastShutdownTimeIn;
    return this;
  }

  public VmWhereInput addLastShutdownTimeInItem(String lastShutdownTimeInItem) {
    if (this.lastShutdownTimeIn == null) {
      this.lastShutdownTimeIn = new ArrayList<String>();
    }
    this.lastShutdownTimeIn.add(lastShutdownTimeInItem);
    return this;
  }

   /**
   * Get lastShutdownTimeIn
   * @return lastShutdownTimeIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getLastShutdownTimeIn() {
    return lastShutdownTimeIn;
  }


  public void setLastShutdownTimeIn(List<String> lastShutdownTimeIn) {
    this.lastShutdownTimeIn = lastShutdownTimeIn;
  }


  public VmWhereInput lastShutdownTimeLt(String lastShutdownTimeLt) {
    
    this.lastShutdownTimeLt = lastShutdownTimeLt;
    return this;
  }

   /**
   * Get lastShutdownTimeLt
   * @return lastShutdownTimeLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLastShutdownTimeLt() {
    return lastShutdownTimeLt;
  }


  public void setLastShutdownTimeLt(String lastShutdownTimeLt) {
    this.lastShutdownTimeLt = lastShutdownTimeLt;
  }


  public VmWhereInput lastShutdownTimeLte(String lastShutdownTimeLte) {
    
    this.lastShutdownTimeLte = lastShutdownTimeLte;
    return this;
  }

   /**
   * Get lastShutdownTimeLte
   * @return lastShutdownTimeLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLastShutdownTimeLte() {
    return lastShutdownTimeLte;
  }


  public void setLastShutdownTimeLte(String lastShutdownTimeLte) {
    this.lastShutdownTimeLte = lastShutdownTimeLte;
  }


  public VmWhereInput lastShutdownTimeNot(String lastShutdownTimeNot) {
    
    this.lastShutdownTimeNot = lastShutdownTimeNot;
    return this;
  }

   /**
   * Get lastShutdownTimeNot
   * @return lastShutdownTimeNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLastShutdownTimeNot() {
    return lastShutdownTimeNot;
  }


  public void setLastShutdownTimeNot(String lastShutdownTimeNot) {
    this.lastShutdownTimeNot = lastShutdownTimeNot;
  }


  public VmWhereInput lastShutdownTimeNotIn(List<String> lastShutdownTimeNotIn) {
    
    this.lastShutdownTimeNotIn = lastShutdownTimeNotIn;
    return this;
  }

  public VmWhereInput addLastShutdownTimeNotInItem(String lastShutdownTimeNotInItem) {
    if (this.lastShutdownTimeNotIn == null) {
      this.lastShutdownTimeNotIn = new ArrayList<String>();
    }
    this.lastShutdownTimeNotIn.add(lastShutdownTimeNotInItem);
    return this;
  }

   /**
   * Get lastShutdownTimeNotIn
   * @return lastShutdownTimeNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getLastShutdownTimeNotIn() {
    return lastShutdownTimeNotIn;
  }


  public void setLastShutdownTimeNotIn(List<String> lastShutdownTimeNotIn) {
    this.lastShutdownTimeNotIn = lastShutdownTimeNotIn;
  }


  public VmWhereInput localCreatedAt(String localCreatedAt) {
    
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


  public VmWhereInput localCreatedAtGt(String localCreatedAtGt) {
    
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


  public VmWhereInput localCreatedAtGte(String localCreatedAtGte) {
    
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


  public VmWhereInput localCreatedAtIn(List<String> localCreatedAtIn) {
    
    this.localCreatedAtIn = localCreatedAtIn;
    return this;
  }

  public VmWhereInput addLocalCreatedAtInItem(String localCreatedAtInItem) {
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


  public VmWhereInput localCreatedAtLt(String localCreatedAtLt) {
    
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


  public VmWhereInput localCreatedAtLte(String localCreatedAtLte) {
    
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


  public VmWhereInput localCreatedAtNot(String localCreatedAtNot) {
    
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


  public VmWhereInput localCreatedAtNotIn(List<String> localCreatedAtNotIn) {
    
    this.localCreatedAtNotIn = localCreatedAtNotIn;
    return this;
  }

  public VmWhereInput addLocalCreatedAtNotInItem(String localCreatedAtNotInItem) {
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


  public VmWhereInput localId(String localId) {
    
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


  public VmWhereInput localIdContains(String localIdContains) {
    
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


  public VmWhereInput localIdEndsWith(String localIdEndsWith) {
    
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


  public VmWhereInput localIdGt(String localIdGt) {
    
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


  public VmWhereInput localIdGte(String localIdGte) {
    
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


  public VmWhereInput localIdIn(List<String> localIdIn) {
    
    this.localIdIn = localIdIn;
    return this;
  }

  public VmWhereInput addLocalIdInItem(String localIdInItem) {
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


  public VmWhereInput localIdLt(String localIdLt) {
    
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


  public VmWhereInput localIdLte(String localIdLte) {
    
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


  public VmWhereInput localIdNot(String localIdNot) {
    
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


  public VmWhereInput localIdNotContains(String localIdNotContains) {
    
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


  public VmWhereInput localIdNotEndsWith(String localIdNotEndsWith) {
    
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


  public VmWhereInput localIdNotIn(List<String> localIdNotIn) {
    
    this.localIdNotIn = localIdNotIn;
    return this;
  }

  public VmWhereInput addLocalIdNotInItem(String localIdNotInItem) {
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


  public VmWhereInput localIdNotStartsWith(String localIdNotStartsWith) {
    
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


  public VmWhereInput localIdStartsWith(String localIdStartsWith) {
    
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


  public VmWhereInput logicalSizeBytes(Long logicalSizeBytes) {
    
    this.logicalSizeBytes = logicalSizeBytes;
    return this;
  }

   /**
   * Get logicalSizeBytes
   * @return logicalSizeBytes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getLogicalSizeBytes() {
    return logicalSizeBytes;
  }


  public void setLogicalSizeBytes(Long logicalSizeBytes) {
    this.logicalSizeBytes = logicalSizeBytes;
  }


  public VmWhereInput logicalSizeBytesGt(Long logicalSizeBytesGt) {
    
    this.logicalSizeBytesGt = logicalSizeBytesGt;
    return this;
  }

   /**
   * Get logicalSizeBytesGt
   * @return logicalSizeBytesGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getLogicalSizeBytesGt() {
    return logicalSizeBytesGt;
  }


  public void setLogicalSizeBytesGt(Long logicalSizeBytesGt) {
    this.logicalSizeBytesGt = logicalSizeBytesGt;
  }


  public VmWhereInput logicalSizeBytesGte(Long logicalSizeBytesGte) {
    
    this.logicalSizeBytesGte = logicalSizeBytesGte;
    return this;
  }

   /**
   * Get logicalSizeBytesGte
   * @return logicalSizeBytesGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getLogicalSizeBytesGte() {
    return logicalSizeBytesGte;
  }


  public void setLogicalSizeBytesGte(Long logicalSizeBytesGte) {
    this.logicalSizeBytesGte = logicalSizeBytesGte;
  }


  public VmWhereInput logicalSizeBytesIn(List<Long> logicalSizeBytesIn) {
    
    this.logicalSizeBytesIn = logicalSizeBytesIn;
    return this;
  }

  public VmWhereInput addLogicalSizeBytesInItem(Long logicalSizeBytesInItem) {
    if (this.logicalSizeBytesIn == null) {
      this.logicalSizeBytesIn = new ArrayList<Long>();
    }
    this.logicalSizeBytesIn.add(logicalSizeBytesInItem);
    return this;
  }

   /**
   * Get logicalSizeBytesIn
   * @return logicalSizeBytesIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Long> getLogicalSizeBytesIn() {
    return logicalSizeBytesIn;
  }


  public void setLogicalSizeBytesIn(List<Long> logicalSizeBytesIn) {
    this.logicalSizeBytesIn = logicalSizeBytesIn;
  }


  public VmWhereInput logicalSizeBytesLt(Long logicalSizeBytesLt) {
    
    this.logicalSizeBytesLt = logicalSizeBytesLt;
    return this;
  }

   /**
   * Get logicalSizeBytesLt
   * @return logicalSizeBytesLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getLogicalSizeBytesLt() {
    return logicalSizeBytesLt;
  }


  public void setLogicalSizeBytesLt(Long logicalSizeBytesLt) {
    this.logicalSizeBytesLt = logicalSizeBytesLt;
  }


  public VmWhereInput logicalSizeBytesLte(Long logicalSizeBytesLte) {
    
    this.logicalSizeBytesLte = logicalSizeBytesLte;
    return this;
  }

   /**
   * Get logicalSizeBytesLte
   * @return logicalSizeBytesLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getLogicalSizeBytesLte() {
    return logicalSizeBytesLte;
  }


  public void setLogicalSizeBytesLte(Long logicalSizeBytesLte) {
    this.logicalSizeBytesLte = logicalSizeBytesLte;
  }


  public VmWhereInput logicalSizeBytesNot(Long logicalSizeBytesNot) {
    
    this.logicalSizeBytesNot = logicalSizeBytesNot;
    return this;
  }

   /**
   * Get logicalSizeBytesNot
   * @return logicalSizeBytesNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getLogicalSizeBytesNot() {
    return logicalSizeBytesNot;
  }


  public void setLogicalSizeBytesNot(Long logicalSizeBytesNot) {
    this.logicalSizeBytesNot = logicalSizeBytesNot;
  }


  public VmWhereInput logicalSizeBytesNotIn(List<Long> logicalSizeBytesNotIn) {
    
    this.logicalSizeBytesNotIn = logicalSizeBytesNotIn;
    return this;
  }

  public VmWhereInput addLogicalSizeBytesNotInItem(Long logicalSizeBytesNotInItem) {
    if (this.logicalSizeBytesNotIn == null) {
      this.logicalSizeBytesNotIn = new ArrayList<Long>();
    }
    this.logicalSizeBytesNotIn.add(logicalSizeBytesNotInItem);
    return this;
  }

   /**
   * Get logicalSizeBytesNotIn
   * @return logicalSizeBytesNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Long> getLogicalSizeBytesNotIn() {
    return logicalSizeBytesNotIn;
  }


  public void setLogicalSizeBytesNotIn(List<Long> logicalSizeBytesNotIn) {
    this.logicalSizeBytesNotIn = logicalSizeBytesNotIn;
  }


  public VmWhereInput maxBandwidth(Long maxBandwidth) {
    
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


  public VmWhereInput maxBandwidthGt(Long maxBandwidthGt) {
    
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


  public VmWhereInput maxBandwidthGte(Long maxBandwidthGte) {
    
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


  public VmWhereInput maxBandwidthIn(List<Long> maxBandwidthIn) {
    
    this.maxBandwidthIn = maxBandwidthIn;
    return this;
  }

  public VmWhereInput addMaxBandwidthInItem(Long maxBandwidthInItem) {
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


  public VmWhereInput maxBandwidthLt(Long maxBandwidthLt) {
    
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


  public VmWhereInput maxBandwidthLte(Long maxBandwidthLte) {
    
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


  public VmWhereInput maxBandwidthNot(Long maxBandwidthNot) {
    
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


  public VmWhereInput maxBandwidthNotIn(List<Long> maxBandwidthNotIn) {
    
    this.maxBandwidthNotIn = maxBandwidthNotIn;
    return this;
  }

  public VmWhereInput addMaxBandwidthNotInItem(Long maxBandwidthNotInItem) {
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


  public VmWhereInput maxBandwidthPolicy(VmDiskIoRestrictType maxBandwidthPolicy) {
    
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


  public VmWhereInput maxBandwidthPolicyIn(List<VmDiskIoRestrictType> maxBandwidthPolicyIn) {
    
    this.maxBandwidthPolicyIn = maxBandwidthPolicyIn;
    return this;
  }

  public VmWhereInput addMaxBandwidthPolicyInItem(VmDiskIoRestrictType maxBandwidthPolicyInItem) {
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


  public VmWhereInput maxBandwidthPolicyNot(VmDiskIoRestrictType maxBandwidthPolicyNot) {
    
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


  public VmWhereInput maxBandwidthPolicyNotIn(List<VmDiskIoRestrictType> maxBandwidthPolicyNotIn) {
    
    this.maxBandwidthPolicyNotIn = maxBandwidthPolicyNotIn;
    return this;
  }

  public VmWhereInput addMaxBandwidthPolicyNotInItem(VmDiskIoRestrictType maxBandwidthPolicyNotInItem) {
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


  public VmWhereInput maxIops(Integer maxIops) {
    
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


  public VmWhereInput maxIopsGt(Integer maxIopsGt) {
    
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


  public VmWhereInput maxIopsGte(Integer maxIopsGte) {
    
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


  public VmWhereInput maxIopsIn(List<Integer> maxIopsIn) {
    
    this.maxIopsIn = maxIopsIn;
    return this;
  }

  public VmWhereInput addMaxIopsInItem(Integer maxIopsInItem) {
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


  public VmWhereInput maxIopsLt(Integer maxIopsLt) {
    
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


  public VmWhereInput maxIopsLte(Integer maxIopsLte) {
    
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


  public VmWhereInput maxIopsNot(Integer maxIopsNot) {
    
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


  public VmWhereInput maxIopsNotIn(List<Integer> maxIopsNotIn) {
    
    this.maxIopsNotIn = maxIopsNotIn;
    return this;
  }

  public VmWhereInput addMaxIopsNotInItem(Integer maxIopsNotInItem) {
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


  public VmWhereInput maxIopsPolicy(VmDiskIoRestrictType maxIopsPolicy) {
    
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


  public VmWhereInput maxIopsPolicyIn(List<VmDiskIoRestrictType> maxIopsPolicyIn) {
    
    this.maxIopsPolicyIn = maxIopsPolicyIn;
    return this;
  }

  public VmWhereInput addMaxIopsPolicyInItem(VmDiskIoRestrictType maxIopsPolicyInItem) {
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


  public VmWhereInput maxIopsPolicyNot(VmDiskIoRestrictType maxIopsPolicyNot) {
    
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


  public VmWhereInput maxIopsPolicyNotIn(List<VmDiskIoRestrictType> maxIopsPolicyNotIn) {
    
    this.maxIopsPolicyNotIn = maxIopsPolicyNotIn;
    return this;
  }

  public VmWhereInput addMaxIopsPolicyNotInItem(VmDiskIoRestrictType maxIopsPolicyNotInItem) {
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


  public VmWhereInput memory(Long memory) {
    
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


  public VmWhereInput memoryGt(Long memoryGt) {
    
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


  public VmWhereInput memoryGte(Long memoryGte) {
    
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


  public VmWhereInput memoryIn(List<Long> memoryIn) {
    
    this.memoryIn = memoryIn;
    return this;
  }

  public VmWhereInput addMemoryInItem(Long memoryInItem) {
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


  public VmWhereInput memoryLt(Long memoryLt) {
    
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


  public VmWhereInput memoryLte(Long memoryLte) {
    
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


  public VmWhereInput memoryNot(Long memoryNot) {
    
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


  public VmWhereInput memoryNotIn(List<Long> memoryNotIn) {
    
    this.memoryNotIn = memoryNotIn;
    return this;
  }

  public VmWhereInput addMemoryNotInItem(Long memoryNotInItem) {
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


  public VmWhereInput memoryUsage(Double memoryUsage) {
    
    this.memoryUsage = memoryUsage;
    return this;
  }

   /**
   * Get memoryUsage
   * @return memoryUsage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getMemoryUsage() {
    return memoryUsage;
  }


  public void setMemoryUsage(Double memoryUsage) {
    this.memoryUsage = memoryUsage;
  }


  public VmWhereInput memoryUsageGt(Double memoryUsageGt) {
    
    this.memoryUsageGt = memoryUsageGt;
    return this;
  }

   /**
   * Get memoryUsageGt
   * @return memoryUsageGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getMemoryUsageGt() {
    return memoryUsageGt;
  }


  public void setMemoryUsageGt(Double memoryUsageGt) {
    this.memoryUsageGt = memoryUsageGt;
  }


  public VmWhereInput memoryUsageGte(Double memoryUsageGte) {
    
    this.memoryUsageGte = memoryUsageGte;
    return this;
  }

   /**
   * Get memoryUsageGte
   * @return memoryUsageGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getMemoryUsageGte() {
    return memoryUsageGte;
  }


  public void setMemoryUsageGte(Double memoryUsageGte) {
    this.memoryUsageGte = memoryUsageGte;
  }


  public VmWhereInput memoryUsageIn(List<Double> memoryUsageIn) {
    
    this.memoryUsageIn = memoryUsageIn;
    return this;
  }

  public VmWhereInput addMemoryUsageInItem(Double memoryUsageInItem) {
    if (this.memoryUsageIn == null) {
      this.memoryUsageIn = new ArrayList<Double>();
    }
    this.memoryUsageIn.add(memoryUsageInItem);
    return this;
  }

   /**
   * Get memoryUsageIn
   * @return memoryUsageIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Double> getMemoryUsageIn() {
    return memoryUsageIn;
  }


  public void setMemoryUsageIn(List<Double> memoryUsageIn) {
    this.memoryUsageIn = memoryUsageIn;
  }


  public VmWhereInput memoryUsageLt(Double memoryUsageLt) {
    
    this.memoryUsageLt = memoryUsageLt;
    return this;
  }

   /**
   * Get memoryUsageLt
   * @return memoryUsageLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getMemoryUsageLt() {
    return memoryUsageLt;
  }


  public void setMemoryUsageLt(Double memoryUsageLt) {
    this.memoryUsageLt = memoryUsageLt;
  }


  public VmWhereInput memoryUsageLte(Double memoryUsageLte) {
    
    this.memoryUsageLte = memoryUsageLte;
    return this;
  }

   /**
   * Get memoryUsageLte
   * @return memoryUsageLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getMemoryUsageLte() {
    return memoryUsageLte;
  }


  public void setMemoryUsageLte(Double memoryUsageLte) {
    this.memoryUsageLte = memoryUsageLte;
  }


  public VmWhereInput memoryUsageNot(Double memoryUsageNot) {
    
    this.memoryUsageNot = memoryUsageNot;
    return this;
  }

   /**
   * Get memoryUsageNot
   * @return memoryUsageNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getMemoryUsageNot() {
    return memoryUsageNot;
  }


  public void setMemoryUsageNot(Double memoryUsageNot) {
    this.memoryUsageNot = memoryUsageNot;
  }


  public VmWhereInput memoryUsageNotIn(List<Double> memoryUsageNotIn) {
    
    this.memoryUsageNotIn = memoryUsageNotIn;
    return this;
  }

  public VmWhereInput addMemoryUsageNotInItem(Double memoryUsageNotInItem) {
    if (this.memoryUsageNotIn == null) {
      this.memoryUsageNotIn = new ArrayList<Double>();
    }
    this.memoryUsageNotIn.add(memoryUsageNotInItem);
    return this;
  }

   /**
   * Get memoryUsageNotIn
   * @return memoryUsageNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Double> getMemoryUsageNotIn() {
    return memoryUsageNotIn;
  }


  public void setMemoryUsageNotIn(List<Double> memoryUsageNotIn) {
    this.memoryUsageNotIn = memoryUsageNotIn;
  }


  public VmWhereInput name(String name) {
    
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


  public VmWhereInput nameContains(String nameContains) {
    
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


  public VmWhereInput nameEndsWith(String nameEndsWith) {
    
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


  public VmWhereInput nameGt(String nameGt) {
    
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


  public VmWhereInput nameGte(String nameGte) {
    
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


  public VmWhereInput nameIn(List<String> nameIn) {
    
    this.nameIn = nameIn;
    return this;
  }

  public VmWhereInput addNameInItem(String nameInItem) {
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


  public VmWhereInput nameLt(String nameLt) {
    
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


  public VmWhereInput nameLte(String nameLte) {
    
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


  public VmWhereInput nameNot(String nameNot) {
    
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


  public VmWhereInput nameNotContains(String nameNotContains) {
    
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


  public VmWhereInput nameNotEndsWith(String nameNotEndsWith) {
    
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


  public VmWhereInput nameNotIn(List<String> nameNotIn) {
    
    this.nameNotIn = nameNotIn;
    return this;
  }

  public VmWhereInput addNameNotInItem(String nameNotInItem) {
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


  public VmWhereInput nameNotStartsWith(String nameNotStartsWith) {
    
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


  public VmWhereInput nameStartsWith(String nameStartsWith) {
    
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


  public VmWhereInput nestedVirtualization(Boolean nestedVirtualization) {
    
    this.nestedVirtualization = nestedVirtualization;
    return this;
  }

   /**
   * Get nestedVirtualization
   * @return nestedVirtualization
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getNestedVirtualization() {
    return nestedVirtualization;
  }


  public void setNestedVirtualization(Boolean nestedVirtualization) {
    this.nestedVirtualization = nestedVirtualization;
  }


  public VmWhereInput nestedVirtualizationNot(Boolean nestedVirtualizationNot) {
    
    this.nestedVirtualizationNot = nestedVirtualizationNot;
    return this;
  }

   /**
   * Get nestedVirtualizationNot
   * @return nestedVirtualizationNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getNestedVirtualizationNot() {
    return nestedVirtualizationNot;
  }


  public void setNestedVirtualizationNot(Boolean nestedVirtualizationNot) {
    this.nestedVirtualizationNot = nestedVirtualizationNot;
  }


  public VmWhereInput nodeIp(String nodeIp) {
    
    this.nodeIp = nodeIp;
    return this;
  }

   /**
   * Get nodeIp
   * @return nodeIp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNodeIp() {
    return nodeIp;
  }


  public void setNodeIp(String nodeIp) {
    this.nodeIp = nodeIp;
  }


  public VmWhereInput nodeIpContains(String nodeIpContains) {
    
    this.nodeIpContains = nodeIpContains;
    return this;
  }

   /**
   * Get nodeIpContains
   * @return nodeIpContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNodeIpContains() {
    return nodeIpContains;
  }


  public void setNodeIpContains(String nodeIpContains) {
    this.nodeIpContains = nodeIpContains;
  }


  public VmWhereInput nodeIpEndsWith(String nodeIpEndsWith) {
    
    this.nodeIpEndsWith = nodeIpEndsWith;
    return this;
  }

   /**
   * Get nodeIpEndsWith
   * @return nodeIpEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNodeIpEndsWith() {
    return nodeIpEndsWith;
  }


  public void setNodeIpEndsWith(String nodeIpEndsWith) {
    this.nodeIpEndsWith = nodeIpEndsWith;
  }


  public VmWhereInput nodeIpGt(String nodeIpGt) {
    
    this.nodeIpGt = nodeIpGt;
    return this;
  }

   /**
   * Get nodeIpGt
   * @return nodeIpGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNodeIpGt() {
    return nodeIpGt;
  }


  public void setNodeIpGt(String nodeIpGt) {
    this.nodeIpGt = nodeIpGt;
  }


  public VmWhereInput nodeIpGte(String nodeIpGte) {
    
    this.nodeIpGte = nodeIpGte;
    return this;
  }

   /**
   * Get nodeIpGte
   * @return nodeIpGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNodeIpGte() {
    return nodeIpGte;
  }


  public void setNodeIpGte(String nodeIpGte) {
    this.nodeIpGte = nodeIpGte;
  }


  public VmWhereInput nodeIpIn(List<String> nodeIpIn) {
    
    this.nodeIpIn = nodeIpIn;
    return this;
  }

  public VmWhereInput addNodeIpInItem(String nodeIpInItem) {
    if (this.nodeIpIn == null) {
      this.nodeIpIn = new ArrayList<String>();
    }
    this.nodeIpIn.add(nodeIpInItem);
    return this;
  }

   /**
   * Get nodeIpIn
   * @return nodeIpIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getNodeIpIn() {
    return nodeIpIn;
  }


  public void setNodeIpIn(List<String> nodeIpIn) {
    this.nodeIpIn = nodeIpIn;
  }


  public VmWhereInput nodeIpLt(String nodeIpLt) {
    
    this.nodeIpLt = nodeIpLt;
    return this;
  }

   /**
   * Get nodeIpLt
   * @return nodeIpLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNodeIpLt() {
    return nodeIpLt;
  }


  public void setNodeIpLt(String nodeIpLt) {
    this.nodeIpLt = nodeIpLt;
  }


  public VmWhereInput nodeIpLte(String nodeIpLte) {
    
    this.nodeIpLte = nodeIpLte;
    return this;
  }

   /**
   * Get nodeIpLte
   * @return nodeIpLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNodeIpLte() {
    return nodeIpLte;
  }


  public void setNodeIpLte(String nodeIpLte) {
    this.nodeIpLte = nodeIpLte;
  }


  public VmWhereInput nodeIpNot(String nodeIpNot) {
    
    this.nodeIpNot = nodeIpNot;
    return this;
  }

   /**
   * Get nodeIpNot
   * @return nodeIpNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNodeIpNot() {
    return nodeIpNot;
  }


  public void setNodeIpNot(String nodeIpNot) {
    this.nodeIpNot = nodeIpNot;
  }


  public VmWhereInput nodeIpNotContains(String nodeIpNotContains) {
    
    this.nodeIpNotContains = nodeIpNotContains;
    return this;
  }

   /**
   * Get nodeIpNotContains
   * @return nodeIpNotContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNodeIpNotContains() {
    return nodeIpNotContains;
  }


  public void setNodeIpNotContains(String nodeIpNotContains) {
    this.nodeIpNotContains = nodeIpNotContains;
  }


  public VmWhereInput nodeIpNotEndsWith(String nodeIpNotEndsWith) {
    
    this.nodeIpNotEndsWith = nodeIpNotEndsWith;
    return this;
  }

   /**
   * Get nodeIpNotEndsWith
   * @return nodeIpNotEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNodeIpNotEndsWith() {
    return nodeIpNotEndsWith;
  }


  public void setNodeIpNotEndsWith(String nodeIpNotEndsWith) {
    this.nodeIpNotEndsWith = nodeIpNotEndsWith;
  }


  public VmWhereInput nodeIpNotIn(List<String> nodeIpNotIn) {
    
    this.nodeIpNotIn = nodeIpNotIn;
    return this;
  }

  public VmWhereInput addNodeIpNotInItem(String nodeIpNotInItem) {
    if (this.nodeIpNotIn == null) {
      this.nodeIpNotIn = new ArrayList<String>();
    }
    this.nodeIpNotIn.add(nodeIpNotInItem);
    return this;
  }

   /**
   * Get nodeIpNotIn
   * @return nodeIpNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getNodeIpNotIn() {
    return nodeIpNotIn;
  }


  public void setNodeIpNotIn(List<String> nodeIpNotIn) {
    this.nodeIpNotIn = nodeIpNotIn;
  }


  public VmWhereInput nodeIpNotStartsWith(String nodeIpNotStartsWith) {
    
    this.nodeIpNotStartsWith = nodeIpNotStartsWith;
    return this;
  }

   /**
   * Get nodeIpNotStartsWith
   * @return nodeIpNotStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNodeIpNotStartsWith() {
    return nodeIpNotStartsWith;
  }


  public void setNodeIpNotStartsWith(String nodeIpNotStartsWith) {
    this.nodeIpNotStartsWith = nodeIpNotStartsWith;
  }


  public VmWhereInput nodeIpStartsWith(String nodeIpStartsWith) {
    
    this.nodeIpStartsWith = nodeIpStartsWith;
    return this;
  }

   /**
   * Get nodeIpStartsWith
   * @return nodeIpStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNodeIpStartsWith() {
    return nodeIpStartsWith;
  }


  public void setNodeIpStartsWith(String nodeIpStartsWith) {
    this.nodeIpStartsWith = nodeIpStartsWith;
  }


  public VmWhereInput originalName(String originalName) {
    
    this.originalName = originalName;
    return this;
  }

   /**
   * Get originalName
   * @return originalName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getOriginalName() {
    return originalName;
  }


  public void setOriginalName(String originalName) {
    this.originalName = originalName;
  }


  public VmWhereInput originalNameContains(String originalNameContains) {
    
    this.originalNameContains = originalNameContains;
    return this;
  }

   /**
   * Get originalNameContains
   * @return originalNameContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getOriginalNameContains() {
    return originalNameContains;
  }


  public void setOriginalNameContains(String originalNameContains) {
    this.originalNameContains = originalNameContains;
  }


  public VmWhereInput originalNameEndsWith(String originalNameEndsWith) {
    
    this.originalNameEndsWith = originalNameEndsWith;
    return this;
  }

   /**
   * Get originalNameEndsWith
   * @return originalNameEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getOriginalNameEndsWith() {
    return originalNameEndsWith;
  }


  public void setOriginalNameEndsWith(String originalNameEndsWith) {
    this.originalNameEndsWith = originalNameEndsWith;
  }


  public VmWhereInput originalNameGt(String originalNameGt) {
    
    this.originalNameGt = originalNameGt;
    return this;
  }

   /**
   * Get originalNameGt
   * @return originalNameGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getOriginalNameGt() {
    return originalNameGt;
  }


  public void setOriginalNameGt(String originalNameGt) {
    this.originalNameGt = originalNameGt;
  }


  public VmWhereInput originalNameGte(String originalNameGte) {
    
    this.originalNameGte = originalNameGte;
    return this;
  }

   /**
   * Get originalNameGte
   * @return originalNameGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getOriginalNameGte() {
    return originalNameGte;
  }


  public void setOriginalNameGte(String originalNameGte) {
    this.originalNameGte = originalNameGte;
  }


  public VmWhereInput originalNameIn(List<String> originalNameIn) {
    
    this.originalNameIn = originalNameIn;
    return this;
  }

  public VmWhereInput addOriginalNameInItem(String originalNameInItem) {
    if (this.originalNameIn == null) {
      this.originalNameIn = new ArrayList<String>();
    }
    this.originalNameIn.add(originalNameInItem);
    return this;
  }

   /**
   * Get originalNameIn
   * @return originalNameIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getOriginalNameIn() {
    return originalNameIn;
  }


  public void setOriginalNameIn(List<String> originalNameIn) {
    this.originalNameIn = originalNameIn;
  }


  public VmWhereInput originalNameLt(String originalNameLt) {
    
    this.originalNameLt = originalNameLt;
    return this;
  }

   /**
   * Get originalNameLt
   * @return originalNameLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getOriginalNameLt() {
    return originalNameLt;
  }


  public void setOriginalNameLt(String originalNameLt) {
    this.originalNameLt = originalNameLt;
  }


  public VmWhereInput originalNameLte(String originalNameLte) {
    
    this.originalNameLte = originalNameLte;
    return this;
  }

   /**
   * Get originalNameLte
   * @return originalNameLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getOriginalNameLte() {
    return originalNameLte;
  }


  public void setOriginalNameLte(String originalNameLte) {
    this.originalNameLte = originalNameLte;
  }


  public VmWhereInput originalNameNot(String originalNameNot) {
    
    this.originalNameNot = originalNameNot;
    return this;
  }

   /**
   * Get originalNameNot
   * @return originalNameNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getOriginalNameNot() {
    return originalNameNot;
  }


  public void setOriginalNameNot(String originalNameNot) {
    this.originalNameNot = originalNameNot;
  }


  public VmWhereInput originalNameNotContains(String originalNameNotContains) {
    
    this.originalNameNotContains = originalNameNotContains;
    return this;
  }

   /**
   * Get originalNameNotContains
   * @return originalNameNotContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getOriginalNameNotContains() {
    return originalNameNotContains;
  }


  public void setOriginalNameNotContains(String originalNameNotContains) {
    this.originalNameNotContains = originalNameNotContains;
  }


  public VmWhereInput originalNameNotEndsWith(String originalNameNotEndsWith) {
    
    this.originalNameNotEndsWith = originalNameNotEndsWith;
    return this;
  }

   /**
   * Get originalNameNotEndsWith
   * @return originalNameNotEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getOriginalNameNotEndsWith() {
    return originalNameNotEndsWith;
  }


  public void setOriginalNameNotEndsWith(String originalNameNotEndsWith) {
    this.originalNameNotEndsWith = originalNameNotEndsWith;
  }


  public VmWhereInput originalNameNotIn(List<String> originalNameNotIn) {
    
    this.originalNameNotIn = originalNameNotIn;
    return this;
  }

  public VmWhereInput addOriginalNameNotInItem(String originalNameNotInItem) {
    if (this.originalNameNotIn == null) {
      this.originalNameNotIn = new ArrayList<String>();
    }
    this.originalNameNotIn.add(originalNameNotInItem);
    return this;
  }

   /**
   * Get originalNameNotIn
   * @return originalNameNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getOriginalNameNotIn() {
    return originalNameNotIn;
  }


  public void setOriginalNameNotIn(List<String> originalNameNotIn) {
    this.originalNameNotIn = originalNameNotIn;
  }


  public VmWhereInput originalNameNotStartsWith(String originalNameNotStartsWith) {
    
    this.originalNameNotStartsWith = originalNameNotStartsWith;
    return this;
  }

   /**
   * Get originalNameNotStartsWith
   * @return originalNameNotStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getOriginalNameNotStartsWith() {
    return originalNameNotStartsWith;
  }


  public void setOriginalNameNotStartsWith(String originalNameNotStartsWith) {
    this.originalNameNotStartsWith = originalNameNotStartsWith;
  }


  public VmWhereInput originalNameStartsWith(String originalNameStartsWith) {
    
    this.originalNameStartsWith = originalNameStartsWith;
    return this;
  }

   /**
   * Get originalNameStartsWith
   * @return originalNameStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getOriginalNameStartsWith() {
    return originalNameStartsWith;
  }


  public void setOriginalNameStartsWith(String originalNameStartsWith) {
    this.originalNameStartsWith = originalNameStartsWith;
  }


  public VmWhereInput os(String os) {
    
    this.os = os;
    return this;
  }

   /**
   * Get os
   * @return os
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getOs() {
    return os;
  }


  public void setOs(String os) {
    this.os = os;
  }


  public VmWhereInput osContains(String osContains) {
    
    this.osContains = osContains;
    return this;
  }

   /**
   * Get osContains
   * @return osContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getOsContains() {
    return osContains;
  }


  public void setOsContains(String osContains) {
    this.osContains = osContains;
  }


  public VmWhereInput osEndsWith(String osEndsWith) {
    
    this.osEndsWith = osEndsWith;
    return this;
  }

   /**
   * Get osEndsWith
   * @return osEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getOsEndsWith() {
    return osEndsWith;
  }


  public void setOsEndsWith(String osEndsWith) {
    this.osEndsWith = osEndsWith;
  }


  public VmWhereInput osGt(String osGt) {
    
    this.osGt = osGt;
    return this;
  }

   /**
   * Get osGt
   * @return osGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getOsGt() {
    return osGt;
  }


  public void setOsGt(String osGt) {
    this.osGt = osGt;
  }


  public VmWhereInput osGte(String osGte) {
    
    this.osGte = osGte;
    return this;
  }

   /**
   * Get osGte
   * @return osGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getOsGte() {
    return osGte;
  }


  public void setOsGte(String osGte) {
    this.osGte = osGte;
  }


  public VmWhereInput osIn(List<String> osIn) {
    
    this.osIn = osIn;
    return this;
  }

  public VmWhereInput addOsInItem(String osInItem) {
    if (this.osIn == null) {
      this.osIn = new ArrayList<String>();
    }
    this.osIn.add(osInItem);
    return this;
  }

   /**
   * Get osIn
   * @return osIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getOsIn() {
    return osIn;
  }


  public void setOsIn(List<String> osIn) {
    this.osIn = osIn;
  }


  public VmWhereInput osLt(String osLt) {
    
    this.osLt = osLt;
    return this;
  }

   /**
   * Get osLt
   * @return osLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getOsLt() {
    return osLt;
  }


  public void setOsLt(String osLt) {
    this.osLt = osLt;
  }


  public VmWhereInput osLte(String osLte) {
    
    this.osLte = osLte;
    return this;
  }

   /**
   * Get osLte
   * @return osLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getOsLte() {
    return osLte;
  }


  public void setOsLte(String osLte) {
    this.osLte = osLte;
  }


  public VmWhereInput osNot(String osNot) {
    
    this.osNot = osNot;
    return this;
  }

   /**
   * Get osNot
   * @return osNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getOsNot() {
    return osNot;
  }


  public void setOsNot(String osNot) {
    this.osNot = osNot;
  }


  public VmWhereInput osNotContains(String osNotContains) {
    
    this.osNotContains = osNotContains;
    return this;
  }

   /**
   * Get osNotContains
   * @return osNotContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getOsNotContains() {
    return osNotContains;
  }


  public void setOsNotContains(String osNotContains) {
    this.osNotContains = osNotContains;
  }


  public VmWhereInput osNotEndsWith(String osNotEndsWith) {
    
    this.osNotEndsWith = osNotEndsWith;
    return this;
  }

   /**
   * Get osNotEndsWith
   * @return osNotEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getOsNotEndsWith() {
    return osNotEndsWith;
  }


  public void setOsNotEndsWith(String osNotEndsWith) {
    this.osNotEndsWith = osNotEndsWith;
  }


  public VmWhereInput osNotIn(List<String> osNotIn) {
    
    this.osNotIn = osNotIn;
    return this;
  }

  public VmWhereInput addOsNotInItem(String osNotInItem) {
    if (this.osNotIn == null) {
      this.osNotIn = new ArrayList<String>();
    }
    this.osNotIn.add(osNotInItem);
    return this;
  }

   /**
   * Get osNotIn
   * @return osNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getOsNotIn() {
    return osNotIn;
  }


  public void setOsNotIn(List<String> osNotIn) {
    this.osNotIn = osNotIn;
  }


  public VmWhereInput osNotStartsWith(String osNotStartsWith) {
    
    this.osNotStartsWith = osNotStartsWith;
    return this;
  }

   /**
   * Get osNotStartsWith
   * @return osNotStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getOsNotStartsWith() {
    return osNotStartsWith;
  }


  public void setOsNotStartsWith(String osNotStartsWith) {
    this.osNotStartsWith = osNotStartsWith;
  }


  public VmWhereInput osStartsWith(String osStartsWith) {
    
    this.osStartsWith = osStartsWith;
    return this;
  }

   /**
   * Get osStartsWith
   * @return osStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getOsStartsWith() {
    return osStartsWith;
  }


  public void setOsStartsWith(String osStartsWith) {
    this.osStartsWith = osStartsWith;
  }


  public VmWhereInput pciNicsEvery(NicWhereInput pciNicsEvery) {
    
    this.pciNicsEvery = pciNicsEvery;
    return this;
  }

   /**
   * Get pciNicsEvery
   * @return pciNicsEvery
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public NicWhereInput getPciNicsEvery() {
    return pciNicsEvery;
  }


  public void setPciNicsEvery(NicWhereInput pciNicsEvery) {
    this.pciNicsEvery = pciNicsEvery;
  }


  public VmWhereInput pciNicsNone(NicWhereInput pciNicsNone) {
    
    this.pciNicsNone = pciNicsNone;
    return this;
  }

   /**
   * Get pciNicsNone
   * @return pciNicsNone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public NicWhereInput getPciNicsNone() {
    return pciNicsNone;
  }


  public void setPciNicsNone(NicWhereInput pciNicsNone) {
    this.pciNicsNone = pciNicsNone;
  }


  public VmWhereInput pciNicsSome(NicWhereInput pciNicsSome) {
    
    this.pciNicsSome = pciNicsSome;
    return this;
  }

   /**
   * Get pciNicsSome
   * @return pciNicsSome
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public NicWhereInput getPciNicsSome() {
    return pciNicsSome;
  }


  public void setPciNicsSome(NicWhereInput pciNicsSome) {
    this.pciNicsSome = pciNicsSome;
  }


  public VmWhereInput _protected(Boolean _protected) {
    
    this._protected = _protected;
    return this;
  }

   /**
   * Get _protected
   * @return _protected
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getProtected() {
    return _protected;
  }


  public void setProtected(Boolean _protected) {
    this._protected = _protected;
  }


  public VmWhereInput protectedNot(Boolean protectedNot) {
    
    this.protectedNot = protectedNot;
    return this;
  }

   /**
   * Get protectedNot
   * @return protectedNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getProtectedNot() {
    return protectedNot;
  }


  public void setProtectedNot(Boolean protectedNot) {
    this.protectedNot = protectedNot;
  }


  public VmWhereInput provisionedSize(Long provisionedSize) {
    
    this.provisionedSize = provisionedSize;
    return this;
  }

   /**
   * Get provisionedSize
   * @return provisionedSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getProvisionedSize() {
    return provisionedSize;
  }


  public void setProvisionedSize(Long provisionedSize) {
    this.provisionedSize = provisionedSize;
  }


  public VmWhereInput provisionedSizeGt(Long provisionedSizeGt) {
    
    this.provisionedSizeGt = provisionedSizeGt;
    return this;
  }

   /**
   * Get provisionedSizeGt
   * @return provisionedSizeGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getProvisionedSizeGt() {
    return provisionedSizeGt;
  }


  public void setProvisionedSizeGt(Long provisionedSizeGt) {
    this.provisionedSizeGt = provisionedSizeGt;
  }


  public VmWhereInput provisionedSizeGte(Long provisionedSizeGte) {
    
    this.provisionedSizeGte = provisionedSizeGte;
    return this;
  }

   /**
   * Get provisionedSizeGte
   * @return provisionedSizeGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getProvisionedSizeGte() {
    return provisionedSizeGte;
  }


  public void setProvisionedSizeGte(Long provisionedSizeGte) {
    this.provisionedSizeGte = provisionedSizeGte;
  }


  public VmWhereInput provisionedSizeIn(List<Long> provisionedSizeIn) {
    
    this.provisionedSizeIn = provisionedSizeIn;
    return this;
  }

  public VmWhereInput addProvisionedSizeInItem(Long provisionedSizeInItem) {
    if (this.provisionedSizeIn == null) {
      this.provisionedSizeIn = new ArrayList<Long>();
    }
    this.provisionedSizeIn.add(provisionedSizeInItem);
    return this;
  }

   /**
   * Get provisionedSizeIn
   * @return provisionedSizeIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Long> getProvisionedSizeIn() {
    return provisionedSizeIn;
  }


  public void setProvisionedSizeIn(List<Long> provisionedSizeIn) {
    this.provisionedSizeIn = provisionedSizeIn;
  }


  public VmWhereInput provisionedSizeLt(Long provisionedSizeLt) {
    
    this.provisionedSizeLt = provisionedSizeLt;
    return this;
  }

   /**
   * Get provisionedSizeLt
   * @return provisionedSizeLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getProvisionedSizeLt() {
    return provisionedSizeLt;
  }


  public void setProvisionedSizeLt(Long provisionedSizeLt) {
    this.provisionedSizeLt = provisionedSizeLt;
  }


  public VmWhereInput provisionedSizeLte(Long provisionedSizeLte) {
    
    this.provisionedSizeLte = provisionedSizeLte;
    return this;
  }

   /**
   * Get provisionedSizeLte
   * @return provisionedSizeLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getProvisionedSizeLte() {
    return provisionedSizeLte;
  }


  public void setProvisionedSizeLte(Long provisionedSizeLte) {
    this.provisionedSizeLte = provisionedSizeLte;
  }


  public VmWhereInput provisionedSizeNot(Long provisionedSizeNot) {
    
    this.provisionedSizeNot = provisionedSizeNot;
    return this;
  }

   /**
   * Get provisionedSizeNot
   * @return provisionedSizeNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getProvisionedSizeNot() {
    return provisionedSizeNot;
  }


  public void setProvisionedSizeNot(Long provisionedSizeNot) {
    this.provisionedSizeNot = provisionedSizeNot;
  }


  public VmWhereInput provisionedSizeNotIn(List<Long> provisionedSizeNotIn) {
    
    this.provisionedSizeNotIn = provisionedSizeNotIn;
    return this;
  }

  public VmWhereInput addProvisionedSizeNotInItem(Long provisionedSizeNotInItem) {
    if (this.provisionedSizeNotIn == null) {
      this.provisionedSizeNotIn = new ArrayList<Long>();
    }
    this.provisionedSizeNotIn.add(provisionedSizeNotInItem);
    return this;
  }

   /**
   * Get provisionedSizeNotIn
   * @return provisionedSizeNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Long> getProvisionedSizeNotIn() {
    return provisionedSizeNotIn;
  }


  public void setProvisionedSizeNotIn(List<Long> provisionedSizeNotIn) {
    this.provisionedSizeNotIn = provisionedSizeNotIn;
  }


  public VmWhereInput size(Long size) {
    
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


  public VmWhereInput sizeGt(Long sizeGt) {
    
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


  public VmWhereInput sizeGte(Long sizeGte) {
    
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


  public VmWhereInput sizeIn(List<Long> sizeIn) {
    
    this.sizeIn = sizeIn;
    return this;
  }

  public VmWhereInput addSizeInItem(Long sizeInItem) {
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


  public VmWhereInput sizeLt(Long sizeLt) {
    
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


  public VmWhereInput sizeLte(Long sizeLte) {
    
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


  public VmWhereInput sizeNot(Long sizeNot) {
    
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


  public VmWhereInput sizeNotIn(List<Long> sizeNotIn) {
    
    this.sizeNotIn = sizeNotIn;
    return this;
  }

  public VmWhereInput addSizeNotInItem(Long sizeNotInItem) {
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


  public VmWhereInput snapshotsEvery(VmSnapshotWhereInput snapshotsEvery) {
    
    this.snapshotsEvery = snapshotsEvery;
    return this;
  }

   /**
   * Get snapshotsEvery
   * @return snapshotsEvery
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VmSnapshotWhereInput getSnapshotsEvery() {
    return snapshotsEvery;
  }


  public void setSnapshotsEvery(VmSnapshotWhereInput snapshotsEvery) {
    this.snapshotsEvery = snapshotsEvery;
  }


  public VmWhereInput snapshotsNone(VmSnapshotWhereInput snapshotsNone) {
    
    this.snapshotsNone = snapshotsNone;
    return this;
  }

   /**
   * Get snapshotsNone
   * @return snapshotsNone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VmSnapshotWhereInput getSnapshotsNone() {
    return snapshotsNone;
  }


  public void setSnapshotsNone(VmSnapshotWhereInput snapshotsNone) {
    this.snapshotsNone = snapshotsNone;
  }


  public VmWhereInput snapshotsSome(VmSnapshotWhereInput snapshotsSome) {
    
    this.snapshotsSome = snapshotsSome;
    return this;
  }

   /**
   * Get snapshotsSome
   * @return snapshotsSome
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VmSnapshotWhereInput getSnapshotsSome() {
    return snapshotsSome;
  }


  public void setSnapshotsSome(VmSnapshotWhereInput snapshotsSome) {
    this.snapshotsSome = snapshotsSome;
  }


  public VmWhereInput status(VmStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VmStatus getStatus() {
    return status;
  }


  public void setStatus(VmStatus status) {
    this.status = status;
  }


  public VmWhereInput statusIn(List<VmStatus> statusIn) {
    
    this.statusIn = statusIn;
    return this;
  }

  public VmWhereInput addStatusInItem(VmStatus statusInItem) {
    if (this.statusIn == null) {
      this.statusIn = new ArrayList<VmStatus>();
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

  public List<VmStatus> getStatusIn() {
    return statusIn;
  }


  public void setStatusIn(List<VmStatus> statusIn) {
    this.statusIn = statusIn;
  }


  public VmWhereInput statusNot(VmStatus statusNot) {
    
    this.statusNot = statusNot;
    return this;
  }

   /**
   * Get statusNot
   * @return statusNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VmStatus getStatusNot() {
    return statusNot;
  }


  public void setStatusNot(VmStatus statusNot) {
    this.statusNot = statusNot;
  }


  public VmWhereInput statusNotIn(List<VmStatus> statusNotIn) {
    
    this.statusNotIn = statusNotIn;
    return this;
  }

  public VmWhereInput addStatusNotInItem(VmStatus statusNotInItem) {
    if (this.statusNotIn == null) {
      this.statusNotIn = new ArrayList<VmStatus>();
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

  public List<VmStatus> getStatusNotIn() {
    return statusNotIn;
  }


  public void setStatusNotIn(List<VmStatus> statusNotIn) {
    this.statusNotIn = statusNotIn;
  }


  public VmWhereInput uniqueLogicalSize(Double uniqueLogicalSize) {
    
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


  public VmWhereInput uniqueLogicalSizeGt(Double uniqueLogicalSizeGt) {
    
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


  public VmWhereInput uniqueLogicalSizeGte(Double uniqueLogicalSizeGte) {
    
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


  public VmWhereInput uniqueLogicalSizeIn(List<Double> uniqueLogicalSizeIn) {
    
    this.uniqueLogicalSizeIn = uniqueLogicalSizeIn;
    return this;
  }

  public VmWhereInput addUniqueLogicalSizeInItem(Double uniqueLogicalSizeInItem) {
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


  public VmWhereInput uniqueLogicalSizeLt(Double uniqueLogicalSizeLt) {
    
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


  public VmWhereInput uniqueLogicalSizeLte(Double uniqueLogicalSizeLte) {
    
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


  public VmWhereInput uniqueLogicalSizeNot(Double uniqueLogicalSizeNot) {
    
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


  public VmWhereInput uniqueLogicalSizeNotIn(List<Double> uniqueLogicalSizeNotIn) {
    
    this.uniqueLogicalSizeNotIn = uniqueLogicalSizeNotIn;
    return this;
  }

  public VmWhereInput addUniqueLogicalSizeNotInItem(Double uniqueLogicalSizeNotInItem) {
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


  public VmWhereInput uniqueSize(Long uniqueSize) {
    
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


  public VmWhereInput uniqueSizeGt(Long uniqueSizeGt) {
    
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


  public VmWhereInput uniqueSizeGte(Long uniqueSizeGte) {
    
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


  public VmWhereInput uniqueSizeIn(List<Long> uniqueSizeIn) {
    
    this.uniqueSizeIn = uniqueSizeIn;
    return this;
  }

  public VmWhereInput addUniqueSizeInItem(Long uniqueSizeInItem) {
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


  public VmWhereInput uniqueSizeLt(Long uniqueSizeLt) {
    
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


  public VmWhereInput uniqueSizeLte(Long uniqueSizeLte) {
    
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


  public VmWhereInput uniqueSizeNot(Long uniqueSizeNot) {
    
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


  public VmWhereInput uniqueSizeNotIn(List<Long> uniqueSizeNotIn) {
    
    this.uniqueSizeNotIn = uniqueSizeNotIn;
    return this;
  }

  public VmWhereInput addUniqueSizeNotInItem(Long uniqueSizeNotInItem) {
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


  public VmWhereInput usbDevicesEvery(UsbDeviceWhereInput usbDevicesEvery) {
    
    this.usbDevicesEvery = usbDevicesEvery;
    return this;
  }

   /**
   * Get usbDevicesEvery
   * @return usbDevicesEvery
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UsbDeviceWhereInput getUsbDevicesEvery() {
    return usbDevicesEvery;
  }


  public void setUsbDevicesEvery(UsbDeviceWhereInput usbDevicesEvery) {
    this.usbDevicesEvery = usbDevicesEvery;
  }


  public VmWhereInput usbDevicesNone(UsbDeviceWhereInput usbDevicesNone) {
    
    this.usbDevicesNone = usbDevicesNone;
    return this;
  }

   /**
   * Get usbDevicesNone
   * @return usbDevicesNone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UsbDeviceWhereInput getUsbDevicesNone() {
    return usbDevicesNone;
  }


  public void setUsbDevicesNone(UsbDeviceWhereInput usbDevicesNone) {
    this.usbDevicesNone = usbDevicesNone;
  }


  public VmWhereInput usbDevicesSome(UsbDeviceWhereInput usbDevicesSome) {
    
    this.usbDevicesSome = usbDevicesSome;
    return this;
  }

   /**
   * Get usbDevicesSome
   * @return usbDevicesSome
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UsbDeviceWhereInput getUsbDevicesSome() {
    return usbDevicesSome;
  }


  public void setUsbDevicesSome(UsbDeviceWhereInput usbDevicesSome) {
    this.usbDevicesSome = usbDevicesSome;
  }


  public VmWhereInput vcpu(Integer vcpu) {
    
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


  public VmWhereInput vcpuGt(Integer vcpuGt) {
    
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


  public VmWhereInput vcpuGte(Integer vcpuGte) {
    
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


  public VmWhereInput vcpuIn(List<Integer> vcpuIn) {
    
    this.vcpuIn = vcpuIn;
    return this;
  }

  public VmWhereInput addVcpuInItem(Integer vcpuInItem) {
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


  public VmWhereInput vcpuLt(Integer vcpuLt) {
    
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


  public VmWhereInput vcpuLte(Integer vcpuLte) {
    
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


  public VmWhereInput vcpuNot(Integer vcpuNot) {
    
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


  public VmWhereInput vcpuNotIn(List<Integer> vcpuNotIn) {
    
    this.vcpuNotIn = vcpuNotIn;
    return this;
  }

  public VmWhereInput addVcpuNotInItem(Integer vcpuNotInItem) {
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


  public VmWhereInput videoType(VmVideoType videoType) {
    
    this.videoType = videoType;
    return this;
  }

   /**
   * Get videoType
   * @return videoType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VmVideoType getVideoType() {
    return videoType;
  }


  public void setVideoType(VmVideoType videoType) {
    this.videoType = videoType;
  }


  public VmWhereInput videoTypeIn(List<VmVideoType> videoTypeIn) {
    
    this.videoTypeIn = videoTypeIn;
    return this;
  }

  public VmWhereInput addVideoTypeInItem(VmVideoType videoTypeInItem) {
    if (this.videoTypeIn == null) {
      this.videoTypeIn = new ArrayList<VmVideoType>();
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

  public List<VmVideoType> getVideoTypeIn() {
    return videoTypeIn;
  }


  public void setVideoTypeIn(List<VmVideoType> videoTypeIn) {
    this.videoTypeIn = videoTypeIn;
  }


  public VmWhereInput videoTypeNot(VmVideoType videoTypeNot) {
    
    this.videoTypeNot = videoTypeNot;
    return this;
  }

   /**
   * Get videoTypeNot
   * @return videoTypeNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VmVideoType getVideoTypeNot() {
    return videoTypeNot;
  }


  public void setVideoTypeNot(VmVideoType videoTypeNot) {
    this.videoTypeNot = videoTypeNot;
  }


  public VmWhereInput videoTypeNotIn(List<VmVideoType> videoTypeNotIn) {
    
    this.videoTypeNotIn = videoTypeNotIn;
    return this;
  }

  public VmWhereInput addVideoTypeNotInItem(VmVideoType videoTypeNotInItem) {
    if (this.videoTypeNotIn == null) {
      this.videoTypeNotIn = new ArrayList<VmVideoType>();
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

  public List<VmVideoType> getVideoTypeNotIn() {
    return videoTypeNotIn;
  }


  public void setVideoTypeNotIn(List<VmVideoType> videoTypeNotIn) {
    this.videoTypeNotIn = videoTypeNotIn;
  }


  public VmWhereInput vmDisksEvery(VmDiskWhereInput vmDisksEvery) {
    
    this.vmDisksEvery = vmDisksEvery;
    return this;
  }

   /**
   * Get vmDisksEvery
   * @return vmDisksEvery
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VmDiskWhereInput getVmDisksEvery() {
    return vmDisksEvery;
  }


  public void setVmDisksEvery(VmDiskWhereInput vmDisksEvery) {
    this.vmDisksEvery = vmDisksEvery;
  }


  public VmWhereInput vmDisksNone(VmDiskWhereInput vmDisksNone) {
    
    this.vmDisksNone = vmDisksNone;
    return this;
  }

   /**
   * Get vmDisksNone
   * @return vmDisksNone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VmDiskWhereInput getVmDisksNone() {
    return vmDisksNone;
  }


  public void setVmDisksNone(VmDiskWhereInput vmDisksNone) {
    this.vmDisksNone = vmDisksNone;
  }


  public VmWhereInput vmDisksSome(VmDiskWhereInput vmDisksSome) {
    
    this.vmDisksSome = vmDisksSome;
    return this;
  }

   /**
   * Get vmDisksSome
   * @return vmDisksSome
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VmDiskWhereInput getVmDisksSome() {
    return vmDisksSome;
  }


  public void setVmDisksSome(VmDiskWhereInput vmDisksSome) {
    this.vmDisksSome = vmDisksSome;
  }


  public VmWhereInput vmNicsEvery(VmNicWhereInput vmNicsEvery) {
    
    this.vmNicsEvery = vmNicsEvery;
    return this;
  }

   /**
   * Get vmNicsEvery
   * @return vmNicsEvery
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VmNicWhereInput getVmNicsEvery() {
    return vmNicsEvery;
  }


  public void setVmNicsEvery(VmNicWhereInput vmNicsEvery) {
    this.vmNicsEvery = vmNicsEvery;
  }


  public VmWhereInput vmNicsNone(VmNicWhereInput vmNicsNone) {
    
    this.vmNicsNone = vmNicsNone;
    return this;
  }

   /**
   * Get vmNicsNone
   * @return vmNicsNone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VmNicWhereInput getVmNicsNone() {
    return vmNicsNone;
  }


  public void setVmNicsNone(VmNicWhereInput vmNicsNone) {
    this.vmNicsNone = vmNicsNone;
  }


  public VmWhereInput vmNicsSome(VmNicWhereInput vmNicsSome) {
    
    this.vmNicsSome = vmNicsSome;
    return this;
  }

   /**
   * Get vmNicsSome
   * @return vmNicsSome
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VmNicWhereInput getVmNicsSome() {
    return vmNicsSome;
  }


  public void setVmNicsSome(VmNicWhereInput vmNicsSome) {
    this.vmNicsSome = vmNicsSome;
  }


  public VmWhereInput vmPlacementGroupEvery(VmPlacementGroupWhereInput vmPlacementGroupEvery) {
    
    this.vmPlacementGroupEvery = vmPlacementGroupEvery;
    return this;
  }

   /**
   * Get vmPlacementGroupEvery
   * @return vmPlacementGroupEvery
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VmPlacementGroupWhereInput getVmPlacementGroupEvery() {
    return vmPlacementGroupEvery;
  }


  public void setVmPlacementGroupEvery(VmPlacementGroupWhereInput vmPlacementGroupEvery) {
    this.vmPlacementGroupEvery = vmPlacementGroupEvery;
  }


  public VmWhereInput vmPlacementGroupNone(VmPlacementGroupWhereInput vmPlacementGroupNone) {
    
    this.vmPlacementGroupNone = vmPlacementGroupNone;
    return this;
  }

   /**
   * Get vmPlacementGroupNone
   * @return vmPlacementGroupNone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VmPlacementGroupWhereInput getVmPlacementGroupNone() {
    return vmPlacementGroupNone;
  }


  public void setVmPlacementGroupNone(VmPlacementGroupWhereInput vmPlacementGroupNone) {
    this.vmPlacementGroupNone = vmPlacementGroupNone;
  }


  public VmWhereInput vmPlacementGroupSome(VmPlacementGroupWhereInput vmPlacementGroupSome) {
    
    this.vmPlacementGroupSome = vmPlacementGroupSome;
    return this;
  }

   /**
   * Get vmPlacementGroupSome
   * @return vmPlacementGroupSome
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VmPlacementGroupWhereInput getVmPlacementGroupSome() {
    return vmPlacementGroupSome;
  }


  public void setVmPlacementGroupSome(VmPlacementGroupWhereInput vmPlacementGroupSome) {
    this.vmPlacementGroupSome = vmPlacementGroupSome;
  }


  public VmWhereInput vmToolsStatus(VmToolsStatus vmToolsStatus) {
    
    this.vmToolsStatus = vmToolsStatus;
    return this;
  }

   /**
   * Get vmToolsStatus
   * @return vmToolsStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VmToolsStatus getVmToolsStatus() {
    return vmToolsStatus;
  }


  public void setVmToolsStatus(VmToolsStatus vmToolsStatus) {
    this.vmToolsStatus = vmToolsStatus;
  }


  public VmWhereInput vmToolsStatusIn(List<VmToolsStatus> vmToolsStatusIn) {
    
    this.vmToolsStatusIn = vmToolsStatusIn;
    return this;
  }

  public VmWhereInput addVmToolsStatusInItem(VmToolsStatus vmToolsStatusInItem) {
    if (this.vmToolsStatusIn == null) {
      this.vmToolsStatusIn = new ArrayList<VmToolsStatus>();
    }
    this.vmToolsStatusIn.add(vmToolsStatusInItem);
    return this;
  }

   /**
   * Get vmToolsStatusIn
   * @return vmToolsStatusIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<VmToolsStatus> getVmToolsStatusIn() {
    return vmToolsStatusIn;
  }


  public void setVmToolsStatusIn(List<VmToolsStatus> vmToolsStatusIn) {
    this.vmToolsStatusIn = vmToolsStatusIn;
  }


  public VmWhereInput vmToolsStatusNot(VmToolsStatus vmToolsStatusNot) {
    
    this.vmToolsStatusNot = vmToolsStatusNot;
    return this;
  }

   /**
   * Get vmToolsStatusNot
   * @return vmToolsStatusNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VmToolsStatus getVmToolsStatusNot() {
    return vmToolsStatusNot;
  }


  public void setVmToolsStatusNot(VmToolsStatus vmToolsStatusNot) {
    this.vmToolsStatusNot = vmToolsStatusNot;
  }


  public VmWhereInput vmToolsStatusNotIn(List<VmToolsStatus> vmToolsStatusNotIn) {
    
    this.vmToolsStatusNotIn = vmToolsStatusNotIn;
    return this;
  }

  public VmWhereInput addVmToolsStatusNotInItem(VmToolsStatus vmToolsStatusNotInItem) {
    if (this.vmToolsStatusNotIn == null) {
      this.vmToolsStatusNotIn = new ArrayList<VmToolsStatus>();
    }
    this.vmToolsStatusNotIn.add(vmToolsStatusNotInItem);
    return this;
  }

   /**
   * Get vmToolsStatusNotIn
   * @return vmToolsStatusNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<VmToolsStatus> getVmToolsStatusNotIn() {
    return vmToolsStatusNotIn;
  }


  public void setVmToolsStatusNotIn(List<VmToolsStatus> vmToolsStatusNotIn) {
    this.vmToolsStatusNotIn = vmToolsStatusNotIn;
  }


  public VmWhereInput vmToolsVersion(String vmToolsVersion) {
    
    this.vmToolsVersion = vmToolsVersion;
    return this;
  }

   /**
   * Get vmToolsVersion
   * @return vmToolsVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getVmToolsVersion() {
    return vmToolsVersion;
  }


  public void setVmToolsVersion(String vmToolsVersion) {
    this.vmToolsVersion = vmToolsVersion;
  }


  public VmWhereInput vmToolsVersionContains(String vmToolsVersionContains) {
    
    this.vmToolsVersionContains = vmToolsVersionContains;
    return this;
  }

   /**
   * Get vmToolsVersionContains
   * @return vmToolsVersionContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getVmToolsVersionContains() {
    return vmToolsVersionContains;
  }


  public void setVmToolsVersionContains(String vmToolsVersionContains) {
    this.vmToolsVersionContains = vmToolsVersionContains;
  }


  public VmWhereInput vmToolsVersionEndsWith(String vmToolsVersionEndsWith) {
    
    this.vmToolsVersionEndsWith = vmToolsVersionEndsWith;
    return this;
  }

   /**
   * Get vmToolsVersionEndsWith
   * @return vmToolsVersionEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getVmToolsVersionEndsWith() {
    return vmToolsVersionEndsWith;
  }


  public void setVmToolsVersionEndsWith(String vmToolsVersionEndsWith) {
    this.vmToolsVersionEndsWith = vmToolsVersionEndsWith;
  }


  public VmWhereInput vmToolsVersionGt(String vmToolsVersionGt) {
    
    this.vmToolsVersionGt = vmToolsVersionGt;
    return this;
  }

   /**
   * Get vmToolsVersionGt
   * @return vmToolsVersionGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getVmToolsVersionGt() {
    return vmToolsVersionGt;
  }


  public void setVmToolsVersionGt(String vmToolsVersionGt) {
    this.vmToolsVersionGt = vmToolsVersionGt;
  }


  public VmWhereInput vmToolsVersionGte(String vmToolsVersionGte) {
    
    this.vmToolsVersionGte = vmToolsVersionGte;
    return this;
  }

   /**
   * Get vmToolsVersionGte
   * @return vmToolsVersionGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getVmToolsVersionGte() {
    return vmToolsVersionGte;
  }


  public void setVmToolsVersionGte(String vmToolsVersionGte) {
    this.vmToolsVersionGte = vmToolsVersionGte;
  }


  public VmWhereInput vmToolsVersionIn(List<String> vmToolsVersionIn) {
    
    this.vmToolsVersionIn = vmToolsVersionIn;
    return this;
  }

  public VmWhereInput addVmToolsVersionInItem(String vmToolsVersionInItem) {
    if (this.vmToolsVersionIn == null) {
      this.vmToolsVersionIn = new ArrayList<String>();
    }
    this.vmToolsVersionIn.add(vmToolsVersionInItem);
    return this;
  }

   /**
   * Get vmToolsVersionIn
   * @return vmToolsVersionIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getVmToolsVersionIn() {
    return vmToolsVersionIn;
  }


  public void setVmToolsVersionIn(List<String> vmToolsVersionIn) {
    this.vmToolsVersionIn = vmToolsVersionIn;
  }


  public VmWhereInput vmToolsVersionLt(String vmToolsVersionLt) {
    
    this.vmToolsVersionLt = vmToolsVersionLt;
    return this;
  }

   /**
   * Get vmToolsVersionLt
   * @return vmToolsVersionLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getVmToolsVersionLt() {
    return vmToolsVersionLt;
  }


  public void setVmToolsVersionLt(String vmToolsVersionLt) {
    this.vmToolsVersionLt = vmToolsVersionLt;
  }


  public VmWhereInput vmToolsVersionLte(String vmToolsVersionLte) {
    
    this.vmToolsVersionLte = vmToolsVersionLte;
    return this;
  }

   /**
   * Get vmToolsVersionLte
   * @return vmToolsVersionLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getVmToolsVersionLte() {
    return vmToolsVersionLte;
  }


  public void setVmToolsVersionLte(String vmToolsVersionLte) {
    this.vmToolsVersionLte = vmToolsVersionLte;
  }


  public VmWhereInput vmToolsVersionNot(String vmToolsVersionNot) {
    
    this.vmToolsVersionNot = vmToolsVersionNot;
    return this;
  }

   /**
   * Get vmToolsVersionNot
   * @return vmToolsVersionNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getVmToolsVersionNot() {
    return vmToolsVersionNot;
  }


  public void setVmToolsVersionNot(String vmToolsVersionNot) {
    this.vmToolsVersionNot = vmToolsVersionNot;
  }


  public VmWhereInput vmToolsVersionNotContains(String vmToolsVersionNotContains) {
    
    this.vmToolsVersionNotContains = vmToolsVersionNotContains;
    return this;
  }

   /**
   * Get vmToolsVersionNotContains
   * @return vmToolsVersionNotContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getVmToolsVersionNotContains() {
    return vmToolsVersionNotContains;
  }


  public void setVmToolsVersionNotContains(String vmToolsVersionNotContains) {
    this.vmToolsVersionNotContains = vmToolsVersionNotContains;
  }


  public VmWhereInput vmToolsVersionNotEndsWith(String vmToolsVersionNotEndsWith) {
    
    this.vmToolsVersionNotEndsWith = vmToolsVersionNotEndsWith;
    return this;
  }

   /**
   * Get vmToolsVersionNotEndsWith
   * @return vmToolsVersionNotEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getVmToolsVersionNotEndsWith() {
    return vmToolsVersionNotEndsWith;
  }


  public void setVmToolsVersionNotEndsWith(String vmToolsVersionNotEndsWith) {
    this.vmToolsVersionNotEndsWith = vmToolsVersionNotEndsWith;
  }


  public VmWhereInput vmToolsVersionNotIn(List<String> vmToolsVersionNotIn) {
    
    this.vmToolsVersionNotIn = vmToolsVersionNotIn;
    return this;
  }

  public VmWhereInput addVmToolsVersionNotInItem(String vmToolsVersionNotInItem) {
    if (this.vmToolsVersionNotIn == null) {
      this.vmToolsVersionNotIn = new ArrayList<String>();
    }
    this.vmToolsVersionNotIn.add(vmToolsVersionNotInItem);
    return this;
  }

   /**
   * Get vmToolsVersionNotIn
   * @return vmToolsVersionNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getVmToolsVersionNotIn() {
    return vmToolsVersionNotIn;
  }


  public void setVmToolsVersionNotIn(List<String> vmToolsVersionNotIn) {
    this.vmToolsVersionNotIn = vmToolsVersionNotIn;
  }


  public VmWhereInput vmToolsVersionNotStartsWith(String vmToolsVersionNotStartsWith) {
    
    this.vmToolsVersionNotStartsWith = vmToolsVersionNotStartsWith;
    return this;
  }

   /**
   * Get vmToolsVersionNotStartsWith
   * @return vmToolsVersionNotStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getVmToolsVersionNotStartsWith() {
    return vmToolsVersionNotStartsWith;
  }


  public void setVmToolsVersionNotStartsWith(String vmToolsVersionNotStartsWith) {
    this.vmToolsVersionNotStartsWith = vmToolsVersionNotStartsWith;
  }


  public VmWhereInput vmToolsVersionStartsWith(String vmToolsVersionStartsWith) {
    
    this.vmToolsVersionStartsWith = vmToolsVersionStartsWith;
    return this;
  }

   /**
   * Get vmToolsVersionStartsWith
   * @return vmToolsVersionStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getVmToolsVersionStartsWith() {
    return vmToolsVersionStartsWith;
  }


  public void setVmToolsVersionStartsWith(String vmToolsVersionStartsWith) {
    this.vmToolsVersionStartsWith = vmToolsVersionStartsWith;
  }


  public VmWhereInput vmUsage(VmUsage vmUsage) {
    
    this.vmUsage = vmUsage;
    return this;
  }

   /**
   * Get vmUsage
   * @return vmUsage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VmUsage getVmUsage() {
    return vmUsage;
  }


  public void setVmUsage(VmUsage vmUsage) {
    this.vmUsage = vmUsage;
  }


  public VmWhereInput vmUsageIn(List<VmUsage> vmUsageIn) {
    
    this.vmUsageIn = vmUsageIn;
    return this;
  }

  public VmWhereInput addVmUsageInItem(VmUsage vmUsageInItem) {
    if (this.vmUsageIn == null) {
      this.vmUsageIn = new ArrayList<VmUsage>();
    }
    this.vmUsageIn.add(vmUsageInItem);
    return this;
  }

   /**
   * Get vmUsageIn
   * @return vmUsageIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<VmUsage> getVmUsageIn() {
    return vmUsageIn;
  }


  public void setVmUsageIn(List<VmUsage> vmUsageIn) {
    this.vmUsageIn = vmUsageIn;
  }


  public VmWhereInput vmUsageNot(VmUsage vmUsageNot) {
    
    this.vmUsageNot = vmUsageNot;
    return this;
  }

   /**
   * Get vmUsageNot
   * @return vmUsageNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VmUsage getVmUsageNot() {
    return vmUsageNot;
  }


  public void setVmUsageNot(VmUsage vmUsageNot) {
    this.vmUsageNot = vmUsageNot;
  }


  public VmWhereInput vmUsageNotIn(List<VmUsage> vmUsageNotIn) {
    
    this.vmUsageNotIn = vmUsageNotIn;
    return this;
  }

  public VmWhereInput addVmUsageNotInItem(VmUsage vmUsageNotInItem) {
    if (this.vmUsageNotIn == null) {
      this.vmUsageNotIn = new ArrayList<VmUsage>();
    }
    this.vmUsageNotIn.add(vmUsageNotInItem);
    return this;
  }

   /**
   * Get vmUsageNotIn
   * @return vmUsageNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<VmUsage> getVmUsageNotIn() {
    return vmUsageNotIn;
  }


  public void setVmUsageNotIn(List<VmUsage> vmUsageNotIn) {
    this.vmUsageNotIn = vmUsageNotIn;
  }


  public VmWhereInput winOpt(Boolean winOpt) {
    
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


  public VmWhereInput winOptNot(Boolean winOptNot) {
    
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
    VmWhereInput vmWhereInput = (VmWhereInput) o;
    return Objects.equals(this.AND, vmWhereInput.AND) &&
        Objects.equals(this.NOT, vmWhereInput.NOT) &&
        Objects.equals(this.OR, vmWhereInput.OR) &&
        Objects.equals(this.biosUuid, vmWhereInput.biosUuid) &&
        Objects.equals(this.biosUuidContains, vmWhereInput.biosUuidContains) &&
        Objects.equals(this.biosUuidEndsWith, vmWhereInput.biosUuidEndsWith) &&
        Objects.equals(this.biosUuidGt, vmWhereInput.biosUuidGt) &&
        Objects.equals(this.biosUuidGte, vmWhereInput.biosUuidGte) &&
        Objects.equals(this.biosUuidIn, vmWhereInput.biosUuidIn) &&
        Objects.equals(this.biosUuidLt, vmWhereInput.biosUuidLt) &&
        Objects.equals(this.biosUuidLte, vmWhereInput.biosUuidLte) &&
        Objects.equals(this.biosUuidNot, vmWhereInput.biosUuidNot) &&
        Objects.equals(this.biosUuidNotContains, vmWhereInput.biosUuidNotContains) &&
        Objects.equals(this.biosUuidNotEndsWith, vmWhereInput.biosUuidNotEndsWith) &&
        Objects.equals(this.biosUuidNotIn, vmWhereInput.biosUuidNotIn) &&
        Objects.equals(this.biosUuidNotStartsWith, vmWhereInput.biosUuidNotStartsWith) &&
        Objects.equals(this.biosUuidStartsWith, vmWhereInput.biosUuidStartsWith) &&
        Objects.equals(this.clockOffset, vmWhereInput.clockOffset) &&
        Objects.equals(this.clockOffsetIn, vmWhereInput.clockOffsetIn) &&
        Objects.equals(this.clockOffsetNot, vmWhereInput.clockOffsetNot) &&
        Objects.equals(this.clockOffsetNotIn, vmWhereInput.clockOffsetNotIn) &&
        Objects.equals(this.cloudInitSupported, vmWhereInput.cloudInitSupported) &&
        Objects.equals(this.cloudInitSupportedNot, vmWhereInput.cloudInitSupportedNot) &&
        Objects.equals(this.cluster, vmWhereInput.cluster) &&
        Objects.equals(this.cpuModel, vmWhereInput.cpuModel) &&
        Objects.equals(this.cpuModelContains, vmWhereInput.cpuModelContains) &&
        Objects.equals(this.cpuModelEndsWith, vmWhereInput.cpuModelEndsWith) &&
        Objects.equals(this.cpuModelGt, vmWhereInput.cpuModelGt) &&
        Objects.equals(this.cpuModelGte, vmWhereInput.cpuModelGte) &&
        Objects.equals(this.cpuModelIn, vmWhereInput.cpuModelIn) &&
        Objects.equals(this.cpuModelLt, vmWhereInput.cpuModelLt) &&
        Objects.equals(this.cpuModelLte, vmWhereInput.cpuModelLte) &&
        Objects.equals(this.cpuModelNot, vmWhereInput.cpuModelNot) &&
        Objects.equals(this.cpuModelNotContains, vmWhereInput.cpuModelNotContains) &&
        Objects.equals(this.cpuModelNotEndsWith, vmWhereInput.cpuModelNotEndsWith) &&
        Objects.equals(this.cpuModelNotIn, vmWhereInput.cpuModelNotIn) &&
        Objects.equals(this.cpuModelNotStartsWith, vmWhereInput.cpuModelNotStartsWith) &&
        Objects.equals(this.cpuModelStartsWith, vmWhereInput.cpuModelStartsWith) &&
        Objects.equals(this.cpuUsage, vmWhereInput.cpuUsage) &&
        Objects.equals(this.cpuUsageGt, vmWhereInput.cpuUsageGt) &&
        Objects.equals(this.cpuUsageGte, vmWhereInput.cpuUsageGte) &&
        Objects.equals(this.cpuUsageIn, vmWhereInput.cpuUsageIn) &&
        Objects.equals(this.cpuUsageLt, vmWhereInput.cpuUsageLt) &&
        Objects.equals(this.cpuUsageLte, vmWhereInput.cpuUsageLte) &&
        Objects.equals(this.cpuUsageNot, vmWhereInput.cpuUsageNot) &&
        Objects.equals(this.cpuUsageNotIn, vmWhereInput.cpuUsageNotIn) &&
        Objects.equals(this.deletedAt, vmWhereInput.deletedAt) &&
        Objects.equals(this.deletedAtGt, vmWhereInput.deletedAtGt) &&
        Objects.equals(this.deletedAtGte, vmWhereInput.deletedAtGte) &&
        Objects.equals(this.deletedAtIn, vmWhereInput.deletedAtIn) &&
        Objects.equals(this.deletedAtLt, vmWhereInput.deletedAtLt) &&
        Objects.equals(this.deletedAtLte, vmWhereInput.deletedAtLte) &&
        Objects.equals(this.deletedAtNot, vmWhereInput.deletedAtNot) &&
        Objects.equals(this.deletedAtNotIn, vmWhereInput.deletedAtNotIn) &&
        Objects.equals(this.description, vmWhereInput.description) &&
        Objects.equals(this.descriptionContains, vmWhereInput.descriptionContains) &&
        Objects.equals(this.descriptionEndsWith, vmWhereInput.descriptionEndsWith) &&
        Objects.equals(this.descriptionGt, vmWhereInput.descriptionGt) &&
        Objects.equals(this.descriptionGte, vmWhereInput.descriptionGte) &&
        Objects.equals(this.descriptionIn, vmWhereInput.descriptionIn) &&
        Objects.equals(this.descriptionLt, vmWhereInput.descriptionLt) &&
        Objects.equals(this.descriptionLte, vmWhereInput.descriptionLte) &&
        Objects.equals(this.descriptionNot, vmWhereInput.descriptionNot) &&
        Objects.equals(this.descriptionNotContains, vmWhereInput.descriptionNotContains) &&
        Objects.equals(this.descriptionNotEndsWith, vmWhereInput.descriptionNotEndsWith) &&
        Objects.equals(this.descriptionNotIn, vmWhereInput.descriptionNotIn) &&
        Objects.equals(this.descriptionNotStartsWith, vmWhereInput.descriptionNotStartsWith) &&
        Objects.equals(this.descriptionStartsWith, vmWhereInput.descriptionStartsWith) &&
        Objects.equals(this.dnsServers, vmWhereInput.dnsServers) &&
        Objects.equals(this.dnsServersContains, vmWhereInput.dnsServersContains) &&
        Objects.equals(this.dnsServersEndsWith, vmWhereInput.dnsServersEndsWith) &&
        Objects.equals(this.dnsServersGt, vmWhereInput.dnsServersGt) &&
        Objects.equals(this.dnsServersGte, vmWhereInput.dnsServersGte) &&
        Objects.equals(this.dnsServersIn, vmWhereInput.dnsServersIn) &&
        Objects.equals(this.dnsServersLt, vmWhereInput.dnsServersLt) &&
        Objects.equals(this.dnsServersLte, vmWhereInput.dnsServersLte) &&
        Objects.equals(this.dnsServersNot, vmWhereInput.dnsServersNot) &&
        Objects.equals(this.dnsServersNotContains, vmWhereInput.dnsServersNotContains) &&
        Objects.equals(this.dnsServersNotEndsWith, vmWhereInput.dnsServersNotEndsWith) &&
        Objects.equals(this.dnsServersNotIn, vmWhereInput.dnsServersNotIn) &&
        Objects.equals(this.dnsServersNotStartsWith, vmWhereInput.dnsServersNotStartsWith) &&
        Objects.equals(this.dnsServersStartsWith, vmWhereInput.dnsServersStartsWith) &&
        Objects.equals(this.entityAsyncStatus, vmWhereInput.entityAsyncStatus) &&
        Objects.equals(this.entityAsyncStatusIn, vmWhereInput.entityAsyncStatusIn) &&
        Objects.equals(this.entityAsyncStatusNot, vmWhereInput.entityAsyncStatusNot) &&
        Objects.equals(this.entityAsyncStatusNotIn, vmWhereInput.entityAsyncStatusNotIn) &&
        Objects.equals(this.firmware, vmWhereInput.firmware) &&
        Objects.equals(this.firmwareIn, vmWhereInput.firmwareIn) &&
        Objects.equals(this.firmwareNot, vmWhereInput.firmwareNot) &&
        Objects.equals(this.firmwareNotIn, vmWhereInput.firmwareNotIn) &&
        Objects.equals(this.folder, vmWhereInput.folder) &&
        Objects.equals(this.gpuDevicesEvery, vmWhereInput.gpuDevicesEvery) &&
        Objects.equals(this.gpuDevicesNone, vmWhereInput.gpuDevicesNone) &&
        Objects.equals(this.gpuDevicesSome, vmWhereInput.gpuDevicesSome) &&
        Objects.equals(this.guestCpuModel, vmWhereInput.guestCpuModel) &&
        Objects.equals(this.guestCpuModelContains, vmWhereInput.guestCpuModelContains) &&
        Objects.equals(this.guestCpuModelEndsWith, vmWhereInput.guestCpuModelEndsWith) &&
        Objects.equals(this.guestCpuModelGt, vmWhereInput.guestCpuModelGt) &&
        Objects.equals(this.guestCpuModelGte, vmWhereInput.guestCpuModelGte) &&
        Objects.equals(this.guestCpuModelIn, vmWhereInput.guestCpuModelIn) &&
        Objects.equals(this.guestCpuModelLt, vmWhereInput.guestCpuModelLt) &&
        Objects.equals(this.guestCpuModelLte, vmWhereInput.guestCpuModelLte) &&
        Objects.equals(this.guestCpuModelNot, vmWhereInput.guestCpuModelNot) &&
        Objects.equals(this.guestCpuModelNotContains, vmWhereInput.guestCpuModelNotContains) &&
        Objects.equals(this.guestCpuModelNotEndsWith, vmWhereInput.guestCpuModelNotEndsWith) &&
        Objects.equals(this.guestCpuModelNotIn, vmWhereInput.guestCpuModelNotIn) &&
        Objects.equals(this.guestCpuModelNotStartsWith, vmWhereInput.guestCpuModelNotStartsWith) &&
        Objects.equals(this.guestCpuModelStartsWith, vmWhereInput.guestCpuModelStartsWith) &&
        Objects.equals(this.guestOsType, vmWhereInput.guestOsType) &&
        Objects.equals(this.guestOsTypeIn, vmWhereInput.guestOsTypeIn) &&
        Objects.equals(this.guestOsTypeNot, vmWhereInput.guestOsTypeNot) &&
        Objects.equals(this.guestOsTypeNotIn, vmWhereInput.guestOsTypeNotIn) &&
        Objects.equals(this.guestSizeUsage, vmWhereInput.guestSizeUsage) &&
        Objects.equals(this.guestSizeUsageGt, vmWhereInput.guestSizeUsageGt) &&
        Objects.equals(this.guestSizeUsageGte, vmWhereInput.guestSizeUsageGte) &&
        Objects.equals(this.guestSizeUsageIn, vmWhereInput.guestSizeUsageIn) &&
        Objects.equals(this.guestSizeUsageLt, vmWhereInput.guestSizeUsageLt) &&
        Objects.equals(this.guestSizeUsageLte, vmWhereInput.guestSizeUsageLte) &&
        Objects.equals(this.guestSizeUsageNot, vmWhereInput.guestSizeUsageNot) &&
        Objects.equals(this.guestSizeUsageNotIn, vmWhereInput.guestSizeUsageNotIn) &&
        Objects.equals(this.guestUsedSize, vmWhereInput.guestUsedSize) &&
        Objects.equals(this.guestUsedSizeGt, vmWhereInput.guestUsedSizeGt) &&
        Objects.equals(this.guestUsedSizeGte, vmWhereInput.guestUsedSizeGte) &&
        Objects.equals(this.guestUsedSizeIn, vmWhereInput.guestUsedSizeIn) &&
        Objects.equals(this.guestUsedSizeLt, vmWhereInput.guestUsedSizeLt) &&
        Objects.equals(this.guestUsedSizeLte, vmWhereInput.guestUsedSizeLte) &&
        Objects.equals(this.guestUsedSizeNot, vmWhereInput.guestUsedSizeNot) &&
        Objects.equals(this.guestUsedSizeNotIn, vmWhereInput.guestUsedSizeNotIn) &&
        Objects.equals(this.ha, vmWhereInput.ha) &&
        Objects.equals(this.haNot, vmWhereInput.haNot) &&
        Objects.equals(this.host, vmWhereInput.host) &&
        Objects.equals(this.hostname, vmWhereInput.hostname) &&
        Objects.equals(this.hostnameContains, vmWhereInput.hostnameContains) &&
        Objects.equals(this.hostnameEndsWith, vmWhereInput.hostnameEndsWith) &&
        Objects.equals(this.hostnameGt, vmWhereInput.hostnameGt) &&
        Objects.equals(this.hostnameGte, vmWhereInput.hostnameGte) &&
        Objects.equals(this.hostnameIn, vmWhereInput.hostnameIn) &&
        Objects.equals(this.hostnameLt, vmWhereInput.hostnameLt) &&
        Objects.equals(this.hostnameLte, vmWhereInput.hostnameLte) &&
        Objects.equals(this.hostnameNot, vmWhereInput.hostnameNot) &&
        Objects.equals(this.hostnameNotContains, vmWhereInput.hostnameNotContains) &&
        Objects.equals(this.hostnameNotEndsWith, vmWhereInput.hostnameNotEndsWith) &&
        Objects.equals(this.hostnameNotIn, vmWhereInput.hostnameNotIn) &&
        Objects.equals(this.hostnameNotStartsWith, vmWhereInput.hostnameNotStartsWith) &&
        Objects.equals(this.hostnameStartsWith, vmWhereInput.hostnameStartsWith) &&
        Objects.equals(this.id, vmWhereInput.id) &&
        Objects.equals(this.idContains, vmWhereInput.idContains) &&
        Objects.equals(this.idEndsWith, vmWhereInput.idEndsWith) &&
        Objects.equals(this.idGt, vmWhereInput.idGt) &&
        Objects.equals(this.idGte, vmWhereInput.idGte) &&
        Objects.equals(this.idIn, vmWhereInput.idIn) &&
        Objects.equals(this.idLt, vmWhereInput.idLt) &&
        Objects.equals(this.idLte, vmWhereInput.idLte) &&
        Objects.equals(this.idNot, vmWhereInput.idNot) &&
        Objects.equals(this.idNotContains, vmWhereInput.idNotContains) &&
        Objects.equals(this.idNotEndsWith, vmWhereInput.idNotEndsWith) &&
        Objects.equals(this.idNotIn, vmWhereInput.idNotIn) &&
        Objects.equals(this.idNotStartsWith, vmWhereInput.idNotStartsWith) &&
        Objects.equals(this.idStartsWith, vmWhereInput.idStartsWith) &&
        Objects.equals(this.inRecycleBin, vmWhereInput.inRecycleBin) &&
        Objects.equals(this.inRecycleBinNot, vmWhereInput.inRecycleBinNot) &&
        Objects.equals(this.internal, vmWhereInput.internal) &&
        Objects.equals(this.internalNot, vmWhereInput.internalNot) &&
        Objects.equals(this.ioPolicy, vmWhereInput.ioPolicy) &&
        Objects.equals(this.ioPolicyIn, vmWhereInput.ioPolicyIn) &&
        Objects.equals(this.ioPolicyNot, vmWhereInput.ioPolicyNot) &&
        Objects.equals(this.ioPolicyNotIn, vmWhereInput.ioPolicyNotIn) &&
        Objects.equals(this.ips, vmWhereInput.ips) &&
        Objects.equals(this.ipsContains, vmWhereInput.ipsContains) &&
        Objects.equals(this.ipsEndsWith, vmWhereInput.ipsEndsWith) &&
        Objects.equals(this.ipsGt, vmWhereInput.ipsGt) &&
        Objects.equals(this.ipsGte, vmWhereInput.ipsGte) &&
        Objects.equals(this.ipsIn, vmWhereInput.ipsIn) &&
        Objects.equals(this.ipsLt, vmWhereInput.ipsLt) &&
        Objects.equals(this.ipsLte, vmWhereInput.ipsLte) &&
        Objects.equals(this.ipsNot, vmWhereInput.ipsNot) &&
        Objects.equals(this.ipsNotContains, vmWhereInput.ipsNotContains) &&
        Objects.equals(this.ipsNotEndsWith, vmWhereInput.ipsNotEndsWith) &&
        Objects.equals(this.ipsNotIn, vmWhereInput.ipsNotIn) &&
        Objects.equals(this.ipsNotStartsWith, vmWhereInput.ipsNotStartsWith) &&
        Objects.equals(this.ipsStartsWith, vmWhereInput.ipsStartsWith) &&
        Objects.equals(this.kernelInfo, vmWhereInput.kernelInfo) &&
        Objects.equals(this.kernelInfoContains, vmWhereInput.kernelInfoContains) &&
        Objects.equals(this.kernelInfoEndsWith, vmWhereInput.kernelInfoEndsWith) &&
        Objects.equals(this.kernelInfoGt, vmWhereInput.kernelInfoGt) &&
        Objects.equals(this.kernelInfoGte, vmWhereInput.kernelInfoGte) &&
        Objects.equals(this.kernelInfoIn, vmWhereInput.kernelInfoIn) &&
        Objects.equals(this.kernelInfoLt, vmWhereInput.kernelInfoLt) &&
        Objects.equals(this.kernelInfoLte, vmWhereInput.kernelInfoLte) &&
        Objects.equals(this.kernelInfoNot, vmWhereInput.kernelInfoNot) &&
        Objects.equals(this.kernelInfoNotContains, vmWhereInput.kernelInfoNotContains) &&
        Objects.equals(this.kernelInfoNotEndsWith, vmWhereInput.kernelInfoNotEndsWith) &&
        Objects.equals(this.kernelInfoNotIn, vmWhereInput.kernelInfoNotIn) &&
        Objects.equals(this.kernelInfoNotStartsWith, vmWhereInput.kernelInfoNotStartsWith) &&
        Objects.equals(this.kernelInfoStartsWith, vmWhereInput.kernelInfoStartsWith) &&
        Objects.equals(this.labelsEvery, vmWhereInput.labelsEvery) &&
        Objects.equals(this.labelsNone, vmWhereInput.labelsNone) &&
        Objects.equals(this.labelsSome, vmWhereInput.labelsSome) &&
        Objects.equals(this.lastShutdownTime, vmWhereInput.lastShutdownTime) &&
        Objects.equals(this.lastShutdownTimeGt, vmWhereInput.lastShutdownTimeGt) &&
        Objects.equals(this.lastShutdownTimeGte, vmWhereInput.lastShutdownTimeGte) &&
        Objects.equals(this.lastShutdownTimeIn, vmWhereInput.lastShutdownTimeIn) &&
        Objects.equals(this.lastShutdownTimeLt, vmWhereInput.lastShutdownTimeLt) &&
        Objects.equals(this.lastShutdownTimeLte, vmWhereInput.lastShutdownTimeLte) &&
        Objects.equals(this.lastShutdownTimeNot, vmWhereInput.lastShutdownTimeNot) &&
        Objects.equals(this.lastShutdownTimeNotIn, vmWhereInput.lastShutdownTimeNotIn) &&
        Objects.equals(this.localCreatedAt, vmWhereInput.localCreatedAt) &&
        Objects.equals(this.localCreatedAtGt, vmWhereInput.localCreatedAtGt) &&
        Objects.equals(this.localCreatedAtGte, vmWhereInput.localCreatedAtGte) &&
        Objects.equals(this.localCreatedAtIn, vmWhereInput.localCreatedAtIn) &&
        Objects.equals(this.localCreatedAtLt, vmWhereInput.localCreatedAtLt) &&
        Objects.equals(this.localCreatedAtLte, vmWhereInput.localCreatedAtLte) &&
        Objects.equals(this.localCreatedAtNot, vmWhereInput.localCreatedAtNot) &&
        Objects.equals(this.localCreatedAtNotIn, vmWhereInput.localCreatedAtNotIn) &&
        Objects.equals(this.localId, vmWhereInput.localId) &&
        Objects.equals(this.localIdContains, vmWhereInput.localIdContains) &&
        Objects.equals(this.localIdEndsWith, vmWhereInput.localIdEndsWith) &&
        Objects.equals(this.localIdGt, vmWhereInput.localIdGt) &&
        Objects.equals(this.localIdGte, vmWhereInput.localIdGte) &&
        Objects.equals(this.localIdIn, vmWhereInput.localIdIn) &&
        Objects.equals(this.localIdLt, vmWhereInput.localIdLt) &&
        Objects.equals(this.localIdLte, vmWhereInput.localIdLte) &&
        Objects.equals(this.localIdNot, vmWhereInput.localIdNot) &&
        Objects.equals(this.localIdNotContains, vmWhereInput.localIdNotContains) &&
        Objects.equals(this.localIdNotEndsWith, vmWhereInput.localIdNotEndsWith) &&
        Objects.equals(this.localIdNotIn, vmWhereInput.localIdNotIn) &&
        Objects.equals(this.localIdNotStartsWith, vmWhereInput.localIdNotStartsWith) &&
        Objects.equals(this.localIdStartsWith, vmWhereInput.localIdStartsWith) &&
        Objects.equals(this.logicalSizeBytes, vmWhereInput.logicalSizeBytes) &&
        Objects.equals(this.logicalSizeBytesGt, vmWhereInput.logicalSizeBytesGt) &&
        Objects.equals(this.logicalSizeBytesGte, vmWhereInput.logicalSizeBytesGte) &&
        Objects.equals(this.logicalSizeBytesIn, vmWhereInput.logicalSizeBytesIn) &&
        Objects.equals(this.logicalSizeBytesLt, vmWhereInput.logicalSizeBytesLt) &&
        Objects.equals(this.logicalSizeBytesLte, vmWhereInput.logicalSizeBytesLte) &&
        Objects.equals(this.logicalSizeBytesNot, vmWhereInput.logicalSizeBytesNot) &&
        Objects.equals(this.logicalSizeBytesNotIn, vmWhereInput.logicalSizeBytesNotIn) &&
        Objects.equals(this.maxBandwidth, vmWhereInput.maxBandwidth) &&
        Objects.equals(this.maxBandwidthGt, vmWhereInput.maxBandwidthGt) &&
        Objects.equals(this.maxBandwidthGte, vmWhereInput.maxBandwidthGte) &&
        Objects.equals(this.maxBandwidthIn, vmWhereInput.maxBandwidthIn) &&
        Objects.equals(this.maxBandwidthLt, vmWhereInput.maxBandwidthLt) &&
        Objects.equals(this.maxBandwidthLte, vmWhereInput.maxBandwidthLte) &&
        Objects.equals(this.maxBandwidthNot, vmWhereInput.maxBandwidthNot) &&
        Objects.equals(this.maxBandwidthNotIn, vmWhereInput.maxBandwidthNotIn) &&
        Objects.equals(this.maxBandwidthPolicy, vmWhereInput.maxBandwidthPolicy) &&
        Objects.equals(this.maxBandwidthPolicyIn, vmWhereInput.maxBandwidthPolicyIn) &&
        Objects.equals(this.maxBandwidthPolicyNot, vmWhereInput.maxBandwidthPolicyNot) &&
        Objects.equals(this.maxBandwidthPolicyNotIn, vmWhereInput.maxBandwidthPolicyNotIn) &&
        Objects.equals(this.maxIops, vmWhereInput.maxIops) &&
        Objects.equals(this.maxIopsGt, vmWhereInput.maxIopsGt) &&
        Objects.equals(this.maxIopsGte, vmWhereInput.maxIopsGte) &&
        Objects.equals(this.maxIopsIn, vmWhereInput.maxIopsIn) &&
        Objects.equals(this.maxIopsLt, vmWhereInput.maxIopsLt) &&
        Objects.equals(this.maxIopsLte, vmWhereInput.maxIopsLte) &&
        Objects.equals(this.maxIopsNot, vmWhereInput.maxIopsNot) &&
        Objects.equals(this.maxIopsNotIn, vmWhereInput.maxIopsNotIn) &&
        Objects.equals(this.maxIopsPolicy, vmWhereInput.maxIopsPolicy) &&
        Objects.equals(this.maxIopsPolicyIn, vmWhereInput.maxIopsPolicyIn) &&
        Objects.equals(this.maxIopsPolicyNot, vmWhereInput.maxIopsPolicyNot) &&
        Objects.equals(this.maxIopsPolicyNotIn, vmWhereInput.maxIopsPolicyNotIn) &&
        Objects.equals(this.memory, vmWhereInput.memory) &&
        Objects.equals(this.memoryGt, vmWhereInput.memoryGt) &&
        Objects.equals(this.memoryGte, vmWhereInput.memoryGte) &&
        Objects.equals(this.memoryIn, vmWhereInput.memoryIn) &&
        Objects.equals(this.memoryLt, vmWhereInput.memoryLt) &&
        Objects.equals(this.memoryLte, vmWhereInput.memoryLte) &&
        Objects.equals(this.memoryNot, vmWhereInput.memoryNot) &&
        Objects.equals(this.memoryNotIn, vmWhereInput.memoryNotIn) &&
        Objects.equals(this.memoryUsage, vmWhereInput.memoryUsage) &&
        Objects.equals(this.memoryUsageGt, vmWhereInput.memoryUsageGt) &&
        Objects.equals(this.memoryUsageGte, vmWhereInput.memoryUsageGte) &&
        Objects.equals(this.memoryUsageIn, vmWhereInput.memoryUsageIn) &&
        Objects.equals(this.memoryUsageLt, vmWhereInput.memoryUsageLt) &&
        Objects.equals(this.memoryUsageLte, vmWhereInput.memoryUsageLte) &&
        Objects.equals(this.memoryUsageNot, vmWhereInput.memoryUsageNot) &&
        Objects.equals(this.memoryUsageNotIn, vmWhereInput.memoryUsageNotIn) &&
        Objects.equals(this.name, vmWhereInput.name) &&
        Objects.equals(this.nameContains, vmWhereInput.nameContains) &&
        Objects.equals(this.nameEndsWith, vmWhereInput.nameEndsWith) &&
        Objects.equals(this.nameGt, vmWhereInput.nameGt) &&
        Objects.equals(this.nameGte, vmWhereInput.nameGte) &&
        Objects.equals(this.nameIn, vmWhereInput.nameIn) &&
        Objects.equals(this.nameLt, vmWhereInput.nameLt) &&
        Objects.equals(this.nameLte, vmWhereInput.nameLte) &&
        Objects.equals(this.nameNot, vmWhereInput.nameNot) &&
        Objects.equals(this.nameNotContains, vmWhereInput.nameNotContains) &&
        Objects.equals(this.nameNotEndsWith, vmWhereInput.nameNotEndsWith) &&
        Objects.equals(this.nameNotIn, vmWhereInput.nameNotIn) &&
        Objects.equals(this.nameNotStartsWith, vmWhereInput.nameNotStartsWith) &&
        Objects.equals(this.nameStartsWith, vmWhereInput.nameStartsWith) &&
        Objects.equals(this.nestedVirtualization, vmWhereInput.nestedVirtualization) &&
        Objects.equals(this.nestedVirtualizationNot, vmWhereInput.nestedVirtualizationNot) &&
        Objects.equals(this.nodeIp, vmWhereInput.nodeIp) &&
        Objects.equals(this.nodeIpContains, vmWhereInput.nodeIpContains) &&
        Objects.equals(this.nodeIpEndsWith, vmWhereInput.nodeIpEndsWith) &&
        Objects.equals(this.nodeIpGt, vmWhereInput.nodeIpGt) &&
        Objects.equals(this.nodeIpGte, vmWhereInput.nodeIpGte) &&
        Objects.equals(this.nodeIpIn, vmWhereInput.nodeIpIn) &&
        Objects.equals(this.nodeIpLt, vmWhereInput.nodeIpLt) &&
        Objects.equals(this.nodeIpLte, vmWhereInput.nodeIpLte) &&
        Objects.equals(this.nodeIpNot, vmWhereInput.nodeIpNot) &&
        Objects.equals(this.nodeIpNotContains, vmWhereInput.nodeIpNotContains) &&
        Objects.equals(this.nodeIpNotEndsWith, vmWhereInput.nodeIpNotEndsWith) &&
        Objects.equals(this.nodeIpNotIn, vmWhereInput.nodeIpNotIn) &&
        Objects.equals(this.nodeIpNotStartsWith, vmWhereInput.nodeIpNotStartsWith) &&
        Objects.equals(this.nodeIpStartsWith, vmWhereInput.nodeIpStartsWith) &&
        Objects.equals(this.originalName, vmWhereInput.originalName) &&
        Objects.equals(this.originalNameContains, vmWhereInput.originalNameContains) &&
        Objects.equals(this.originalNameEndsWith, vmWhereInput.originalNameEndsWith) &&
        Objects.equals(this.originalNameGt, vmWhereInput.originalNameGt) &&
        Objects.equals(this.originalNameGte, vmWhereInput.originalNameGte) &&
        Objects.equals(this.originalNameIn, vmWhereInput.originalNameIn) &&
        Objects.equals(this.originalNameLt, vmWhereInput.originalNameLt) &&
        Objects.equals(this.originalNameLte, vmWhereInput.originalNameLte) &&
        Objects.equals(this.originalNameNot, vmWhereInput.originalNameNot) &&
        Objects.equals(this.originalNameNotContains, vmWhereInput.originalNameNotContains) &&
        Objects.equals(this.originalNameNotEndsWith, vmWhereInput.originalNameNotEndsWith) &&
        Objects.equals(this.originalNameNotIn, vmWhereInput.originalNameNotIn) &&
        Objects.equals(this.originalNameNotStartsWith, vmWhereInput.originalNameNotStartsWith) &&
        Objects.equals(this.originalNameStartsWith, vmWhereInput.originalNameStartsWith) &&
        Objects.equals(this.os, vmWhereInput.os) &&
        Objects.equals(this.osContains, vmWhereInput.osContains) &&
        Objects.equals(this.osEndsWith, vmWhereInput.osEndsWith) &&
        Objects.equals(this.osGt, vmWhereInput.osGt) &&
        Objects.equals(this.osGte, vmWhereInput.osGte) &&
        Objects.equals(this.osIn, vmWhereInput.osIn) &&
        Objects.equals(this.osLt, vmWhereInput.osLt) &&
        Objects.equals(this.osLte, vmWhereInput.osLte) &&
        Objects.equals(this.osNot, vmWhereInput.osNot) &&
        Objects.equals(this.osNotContains, vmWhereInput.osNotContains) &&
        Objects.equals(this.osNotEndsWith, vmWhereInput.osNotEndsWith) &&
        Objects.equals(this.osNotIn, vmWhereInput.osNotIn) &&
        Objects.equals(this.osNotStartsWith, vmWhereInput.osNotStartsWith) &&
        Objects.equals(this.osStartsWith, vmWhereInput.osStartsWith) &&
        Objects.equals(this.pciNicsEvery, vmWhereInput.pciNicsEvery) &&
        Objects.equals(this.pciNicsNone, vmWhereInput.pciNicsNone) &&
        Objects.equals(this.pciNicsSome, vmWhereInput.pciNicsSome) &&
        Objects.equals(this._protected, vmWhereInput._protected) &&
        Objects.equals(this.protectedNot, vmWhereInput.protectedNot) &&
        Objects.equals(this.provisionedSize, vmWhereInput.provisionedSize) &&
        Objects.equals(this.provisionedSizeGt, vmWhereInput.provisionedSizeGt) &&
        Objects.equals(this.provisionedSizeGte, vmWhereInput.provisionedSizeGte) &&
        Objects.equals(this.provisionedSizeIn, vmWhereInput.provisionedSizeIn) &&
        Objects.equals(this.provisionedSizeLt, vmWhereInput.provisionedSizeLt) &&
        Objects.equals(this.provisionedSizeLte, vmWhereInput.provisionedSizeLte) &&
        Objects.equals(this.provisionedSizeNot, vmWhereInput.provisionedSizeNot) &&
        Objects.equals(this.provisionedSizeNotIn, vmWhereInput.provisionedSizeNotIn) &&
        Objects.equals(this.size, vmWhereInput.size) &&
        Objects.equals(this.sizeGt, vmWhereInput.sizeGt) &&
        Objects.equals(this.sizeGte, vmWhereInput.sizeGte) &&
        Objects.equals(this.sizeIn, vmWhereInput.sizeIn) &&
        Objects.equals(this.sizeLt, vmWhereInput.sizeLt) &&
        Objects.equals(this.sizeLte, vmWhereInput.sizeLte) &&
        Objects.equals(this.sizeNot, vmWhereInput.sizeNot) &&
        Objects.equals(this.sizeNotIn, vmWhereInput.sizeNotIn) &&
        Objects.equals(this.snapshotsEvery, vmWhereInput.snapshotsEvery) &&
        Objects.equals(this.snapshotsNone, vmWhereInput.snapshotsNone) &&
        Objects.equals(this.snapshotsSome, vmWhereInput.snapshotsSome) &&
        Objects.equals(this.status, vmWhereInput.status) &&
        Objects.equals(this.statusIn, vmWhereInput.statusIn) &&
        Objects.equals(this.statusNot, vmWhereInput.statusNot) &&
        Objects.equals(this.statusNotIn, vmWhereInput.statusNotIn) &&
        Objects.equals(this.uniqueLogicalSize, vmWhereInput.uniqueLogicalSize) &&
        Objects.equals(this.uniqueLogicalSizeGt, vmWhereInput.uniqueLogicalSizeGt) &&
        Objects.equals(this.uniqueLogicalSizeGte, vmWhereInput.uniqueLogicalSizeGte) &&
        Objects.equals(this.uniqueLogicalSizeIn, vmWhereInput.uniqueLogicalSizeIn) &&
        Objects.equals(this.uniqueLogicalSizeLt, vmWhereInput.uniqueLogicalSizeLt) &&
        Objects.equals(this.uniqueLogicalSizeLte, vmWhereInput.uniqueLogicalSizeLte) &&
        Objects.equals(this.uniqueLogicalSizeNot, vmWhereInput.uniqueLogicalSizeNot) &&
        Objects.equals(this.uniqueLogicalSizeNotIn, vmWhereInput.uniqueLogicalSizeNotIn) &&
        Objects.equals(this.uniqueSize, vmWhereInput.uniqueSize) &&
        Objects.equals(this.uniqueSizeGt, vmWhereInput.uniqueSizeGt) &&
        Objects.equals(this.uniqueSizeGte, vmWhereInput.uniqueSizeGte) &&
        Objects.equals(this.uniqueSizeIn, vmWhereInput.uniqueSizeIn) &&
        Objects.equals(this.uniqueSizeLt, vmWhereInput.uniqueSizeLt) &&
        Objects.equals(this.uniqueSizeLte, vmWhereInput.uniqueSizeLte) &&
        Objects.equals(this.uniqueSizeNot, vmWhereInput.uniqueSizeNot) &&
        Objects.equals(this.uniqueSizeNotIn, vmWhereInput.uniqueSizeNotIn) &&
        Objects.equals(this.usbDevicesEvery, vmWhereInput.usbDevicesEvery) &&
        Objects.equals(this.usbDevicesNone, vmWhereInput.usbDevicesNone) &&
        Objects.equals(this.usbDevicesSome, vmWhereInput.usbDevicesSome) &&
        Objects.equals(this.vcpu, vmWhereInput.vcpu) &&
        Objects.equals(this.vcpuGt, vmWhereInput.vcpuGt) &&
        Objects.equals(this.vcpuGte, vmWhereInput.vcpuGte) &&
        Objects.equals(this.vcpuIn, vmWhereInput.vcpuIn) &&
        Objects.equals(this.vcpuLt, vmWhereInput.vcpuLt) &&
        Objects.equals(this.vcpuLte, vmWhereInput.vcpuLte) &&
        Objects.equals(this.vcpuNot, vmWhereInput.vcpuNot) &&
        Objects.equals(this.vcpuNotIn, vmWhereInput.vcpuNotIn) &&
        Objects.equals(this.videoType, vmWhereInput.videoType) &&
        Objects.equals(this.videoTypeIn, vmWhereInput.videoTypeIn) &&
        Objects.equals(this.videoTypeNot, vmWhereInput.videoTypeNot) &&
        Objects.equals(this.videoTypeNotIn, vmWhereInput.videoTypeNotIn) &&
        Objects.equals(this.vmDisksEvery, vmWhereInput.vmDisksEvery) &&
        Objects.equals(this.vmDisksNone, vmWhereInput.vmDisksNone) &&
        Objects.equals(this.vmDisksSome, vmWhereInput.vmDisksSome) &&
        Objects.equals(this.vmNicsEvery, vmWhereInput.vmNicsEvery) &&
        Objects.equals(this.vmNicsNone, vmWhereInput.vmNicsNone) &&
        Objects.equals(this.vmNicsSome, vmWhereInput.vmNicsSome) &&
        Objects.equals(this.vmPlacementGroupEvery, vmWhereInput.vmPlacementGroupEvery) &&
        Objects.equals(this.vmPlacementGroupNone, vmWhereInput.vmPlacementGroupNone) &&
        Objects.equals(this.vmPlacementGroupSome, vmWhereInput.vmPlacementGroupSome) &&
        Objects.equals(this.vmToolsStatus, vmWhereInput.vmToolsStatus) &&
        Objects.equals(this.vmToolsStatusIn, vmWhereInput.vmToolsStatusIn) &&
        Objects.equals(this.vmToolsStatusNot, vmWhereInput.vmToolsStatusNot) &&
        Objects.equals(this.vmToolsStatusNotIn, vmWhereInput.vmToolsStatusNotIn) &&
        Objects.equals(this.vmToolsVersion, vmWhereInput.vmToolsVersion) &&
        Objects.equals(this.vmToolsVersionContains, vmWhereInput.vmToolsVersionContains) &&
        Objects.equals(this.vmToolsVersionEndsWith, vmWhereInput.vmToolsVersionEndsWith) &&
        Objects.equals(this.vmToolsVersionGt, vmWhereInput.vmToolsVersionGt) &&
        Objects.equals(this.vmToolsVersionGte, vmWhereInput.vmToolsVersionGte) &&
        Objects.equals(this.vmToolsVersionIn, vmWhereInput.vmToolsVersionIn) &&
        Objects.equals(this.vmToolsVersionLt, vmWhereInput.vmToolsVersionLt) &&
        Objects.equals(this.vmToolsVersionLte, vmWhereInput.vmToolsVersionLte) &&
        Objects.equals(this.vmToolsVersionNot, vmWhereInput.vmToolsVersionNot) &&
        Objects.equals(this.vmToolsVersionNotContains, vmWhereInput.vmToolsVersionNotContains) &&
        Objects.equals(this.vmToolsVersionNotEndsWith, vmWhereInput.vmToolsVersionNotEndsWith) &&
        Objects.equals(this.vmToolsVersionNotIn, vmWhereInput.vmToolsVersionNotIn) &&
        Objects.equals(this.vmToolsVersionNotStartsWith, vmWhereInput.vmToolsVersionNotStartsWith) &&
        Objects.equals(this.vmToolsVersionStartsWith, vmWhereInput.vmToolsVersionStartsWith) &&
        Objects.equals(this.vmUsage, vmWhereInput.vmUsage) &&
        Objects.equals(this.vmUsageIn, vmWhereInput.vmUsageIn) &&
        Objects.equals(this.vmUsageNot, vmWhereInput.vmUsageNot) &&
        Objects.equals(this.vmUsageNotIn, vmWhereInput.vmUsageNotIn) &&
        Objects.equals(this.winOpt, vmWhereInput.winOpt) &&
        Objects.equals(this.winOptNot, vmWhereInput.winOptNot);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(AND, NOT, OR, biosUuid, biosUuidContains, biosUuidEndsWith, biosUuidGt, biosUuidGte, biosUuidIn, biosUuidLt, biosUuidLte, biosUuidNot, biosUuidNotContains, biosUuidNotEndsWith, biosUuidNotIn, biosUuidNotStartsWith, biosUuidStartsWith, clockOffset, clockOffsetIn, clockOffsetNot, clockOffsetNotIn, cloudInitSupported, cloudInitSupportedNot, cluster, cpuModel, cpuModelContains, cpuModelEndsWith, cpuModelGt, cpuModelGte, cpuModelIn, cpuModelLt, cpuModelLte, cpuModelNot, cpuModelNotContains, cpuModelNotEndsWith, cpuModelNotIn, cpuModelNotStartsWith, cpuModelStartsWith, cpuUsage, cpuUsageGt, cpuUsageGte, cpuUsageIn, cpuUsageLt, cpuUsageLte, cpuUsageNot, cpuUsageNotIn, deletedAt, deletedAtGt, deletedAtGte, deletedAtIn, deletedAtLt, deletedAtLte, deletedAtNot, deletedAtNotIn, description, descriptionContains, descriptionEndsWith, descriptionGt, descriptionGte, descriptionIn, descriptionLt, descriptionLte, descriptionNot, descriptionNotContains, descriptionNotEndsWith, descriptionNotIn, descriptionNotStartsWith, descriptionStartsWith, dnsServers, dnsServersContains, dnsServersEndsWith, dnsServersGt, dnsServersGte, dnsServersIn, dnsServersLt, dnsServersLte, dnsServersNot, dnsServersNotContains, dnsServersNotEndsWith, dnsServersNotIn, dnsServersNotStartsWith, dnsServersStartsWith, entityAsyncStatus, entityAsyncStatusIn, entityAsyncStatusNot, entityAsyncStatusNotIn, firmware, firmwareIn, firmwareNot, firmwareNotIn, folder, gpuDevicesEvery, gpuDevicesNone, gpuDevicesSome, guestCpuModel, guestCpuModelContains, guestCpuModelEndsWith, guestCpuModelGt, guestCpuModelGte, guestCpuModelIn, guestCpuModelLt, guestCpuModelLte, guestCpuModelNot, guestCpuModelNotContains, guestCpuModelNotEndsWith, guestCpuModelNotIn, guestCpuModelNotStartsWith, guestCpuModelStartsWith, guestOsType, guestOsTypeIn, guestOsTypeNot, guestOsTypeNotIn, guestSizeUsage, guestSizeUsageGt, guestSizeUsageGte, guestSizeUsageIn, guestSizeUsageLt, guestSizeUsageLte, guestSizeUsageNot, guestSizeUsageNotIn, guestUsedSize, guestUsedSizeGt, guestUsedSizeGte, guestUsedSizeIn, guestUsedSizeLt, guestUsedSizeLte, guestUsedSizeNot, guestUsedSizeNotIn, ha, haNot, host, hostname, hostnameContains, hostnameEndsWith, hostnameGt, hostnameGte, hostnameIn, hostnameLt, hostnameLte, hostnameNot, hostnameNotContains, hostnameNotEndsWith, hostnameNotIn, hostnameNotStartsWith, hostnameStartsWith, id, idContains, idEndsWith, idGt, idGte, idIn, idLt, idLte, idNot, idNotContains, idNotEndsWith, idNotIn, idNotStartsWith, idStartsWith, inRecycleBin, inRecycleBinNot, internal, internalNot, ioPolicy, ioPolicyIn, ioPolicyNot, ioPolicyNotIn, ips, ipsContains, ipsEndsWith, ipsGt, ipsGte, ipsIn, ipsLt, ipsLte, ipsNot, ipsNotContains, ipsNotEndsWith, ipsNotIn, ipsNotStartsWith, ipsStartsWith, kernelInfo, kernelInfoContains, kernelInfoEndsWith, kernelInfoGt, kernelInfoGte, kernelInfoIn, kernelInfoLt, kernelInfoLte, kernelInfoNot, kernelInfoNotContains, kernelInfoNotEndsWith, kernelInfoNotIn, kernelInfoNotStartsWith, kernelInfoStartsWith, labelsEvery, labelsNone, labelsSome, lastShutdownTime, lastShutdownTimeGt, lastShutdownTimeGte, lastShutdownTimeIn, lastShutdownTimeLt, lastShutdownTimeLte, lastShutdownTimeNot, lastShutdownTimeNotIn, localCreatedAt, localCreatedAtGt, localCreatedAtGte, localCreatedAtIn, localCreatedAtLt, localCreatedAtLte, localCreatedAtNot, localCreatedAtNotIn, localId, localIdContains, localIdEndsWith, localIdGt, localIdGte, localIdIn, localIdLt, localIdLte, localIdNot, localIdNotContains, localIdNotEndsWith, localIdNotIn, localIdNotStartsWith, localIdStartsWith, logicalSizeBytes, logicalSizeBytesGt, logicalSizeBytesGte, logicalSizeBytesIn, logicalSizeBytesLt, logicalSizeBytesLte, logicalSizeBytesNot, logicalSizeBytesNotIn, maxBandwidth, maxBandwidthGt, maxBandwidthGte, maxBandwidthIn, maxBandwidthLt, maxBandwidthLte, maxBandwidthNot, maxBandwidthNotIn, maxBandwidthPolicy, maxBandwidthPolicyIn, maxBandwidthPolicyNot, maxBandwidthPolicyNotIn, maxIops, maxIopsGt, maxIopsGte, maxIopsIn, maxIopsLt, maxIopsLte, maxIopsNot, maxIopsNotIn, maxIopsPolicy, maxIopsPolicyIn, maxIopsPolicyNot, maxIopsPolicyNotIn, memory, memoryGt, memoryGte, memoryIn, memoryLt, memoryLte, memoryNot, memoryNotIn, memoryUsage, memoryUsageGt, memoryUsageGte, memoryUsageIn, memoryUsageLt, memoryUsageLte, memoryUsageNot, memoryUsageNotIn, name, nameContains, nameEndsWith, nameGt, nameGte, nameIn, nameLt, nameLte, nameNot, nameNotContains, nameNotEndsWith, nameNotIn, nameNotStartsWith, nameStartsWith, nestedVirtualization, nestedVirtualizationNot, nodeIp, nodeIpContains, nodeIpEndsWith, nodeIpGt, nodeIpGte, nodeIpIn, nodeIpLt, nodeIpLte, nodeIpNot, nodeIpNotContains, nodeIpNotEndsWith, nodeIpNotIn, nodeIpNotStartsWith, nodeIpStartsWith, originalName, originalNameContains, originalNameEndsWith, originalNameGt, originalNameGte, originalNameIn, originalNameLt, originalNameLte, originalNameNot, originalNameNotContains, originalNameNotEndsWith, originalNameNotIn, originalNameNotStartsWith, originalNameStartsWith, os, osContains, osEndsWith, osGt, osGte, osIn, osLt, osLte, osNot, osNotContains, osNotEndsWith, osNotIn, osNotStartsWith, osStartsWith, pciNicsEvery, pciNicsNone, pciNicsSome, _protected, protectedNot, provisionedSize, provisionedSizeGt, provisionedSizeGte, provisionedSizeIn, provisionedSizeLt, provisionedSizeLte, provisionedSizeNot, provisionedSizeNotIn, size, sizeGt, sizeGte, sizeIn, sizeLt, sizeLte, sizeNot, sizeNotIn, snapshotsEvery, snapshotsNone, snapshotsSome, status, statusIn, statusNot, statusNotIn, uniqueLogicalSize, uniqueLogicalSizeGt, uniqueLogicalSizeGte, uniqueLogicalSizeIn, uniqueLogicalSizeLt, uniqueLogicalSizeLte, uniqueLogicalSizeNot, uniqueLogicalSizeNotIn, uniqueSize, uniqueSizeGt, uniqueSizeGte, uniqueSizeIn, uniqueSizeLt, uniqueSizeLte, uniqueSizeNot, uniqueSizeNotIn, usbDevicesEvery, usbDevicesNone, usbDevicesSome, vcpu, vcpuGt, vcpuGte, vcpuIn, vcpuLt, vcpuLte, vcpuNot, vcpuNotIn, videoType, videoTypeIn, videoTypeNot, videoTypeNotIn, vmDisksEvery, vmDisksNone, vmDisksSome, vmNicsEvery, vmNicsNone, vmNicsSome, vmPlacementGroupEvery, vmPlacementGroupNone, vmPlacementGroupSome, vmToolsStatus, vmToolsStatusIn, vmToolsStatusNot, vmToolsStatusNotIn, vmToolsVersion, vmToolsVersionContains, vmToolsVersionEndsWith, vmToolsVersionGt, vmToolsVersionGte, vmToolsVersionIn, vmToolsVersionLt, vmToolsVersionLte, vmToolsVersionNot, vmToolsVersionNotContains, vmToolsVersionNotEndsWith, vmToolsVersionNotIn, vmToolsVersionNotStartsWith, vmToolsVersionStartsWith, vmUsage, vmUsageIn, vmUsageNot, vmUsageNotIn, winOpt, winOptNot);
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
    sb.append("class VmWhereInput {\n");
    sb.append("    AND: ").append(toIndentedString(AND)).append("\n");
    sb.append("    NOT: ").append(toIndentedString(NOT)).append("\n");
    sb.append("    OR: ").append(toIndentedString(OR)).append("\n");
    sb.append("    biosUuid: ").append(toIndentedString(biosUuid)).append("\n");
    sb.append("    biosUuidContains: ").append(toIndentedString(biosUuidContains)).append("\n");
    sb.append("    biosUuidEndsWith: ").append(toIndentedString(biosUuidEndsWith)).append("\n");
    sb.append("    biosUuidGt: ").append(toIndentedString(biosUuidGt)).append("\n");
    sb.append("    biosUuidGte: ").append(toIndentedString(biosUuidGte)).append("\n");
    sb.append("    biosUuidIn: ").append(toIndentedString(biosUuidIn)).append("\n");
    sb.append("    biosUuidLt: ").append(toIndentedString(biosUuidLt)).append("\n");
    sb.append("    biosUuidLte: ").append(toIndentedString(biosUuidLte)).append("\n");
    sb.append("    biosUuidNot: ").append(toIndentedString(biosUuidNot)).append("\n");
    sb.append("    biosUuidNotContains: ").append(toIndentedString(biosUuidNotContains)).append("\n");
    sb.append("    biosUuidNotEndsWith: ").append(toIndentedString(biosUuidNotEndsWith)).append("\n");
    sb.append("    biosUuidNotIn: ").append(toIndentedString(biosUuidNotIn)).append("\n");
    sb.append("    biosUuidNotStartsWith: ").append(toIndentedString(biosUuidNotStartsWith)).append("\n");
    sb.append("    biosUuidStartsWith: ").append(toIndentedString(biosUuidStartsWith)).append("\n");
    sb.append("    clockOffset: ").append(toIndentedString(clockOffset)).append("\n");
    sb.append("    clockOffsetIn: ").append(toIndentedString(clockOffsetIn)).append("\n");
    sb.append("    clockOffsetNot: ").append(toIndentedString(clockOffsetNot)).append("\n");
    sb.append("    clockOffsetNotIn: ").append(toIndentedString(clockOffsetNotIn)).append("\n");
    sb.append("    cloudInitSupported: ").append(toIndentedString(cloudInitSupported)).append("\n");
    sb.append("    cloudInitSupportedNot: ").append(toIndentedString(cloudInitSupportedNot)).append("\n");
    sb.append("    cluster: ").append(toIndentedString(cluster)).append("\n");
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
    sb.append("    cpuUsage: ").append(toIndentedString(cpuUsage)).append("\n");
    sb.append("    cpuUsageGt: ").append(toIndentedString(cpuUsageGt)).append("\n");
    sb.append("    cpuUsageGte: ").append(toIndentedString(cpuUsageGte)).append("\n");
    sb.append("    cpuUsageIn: ").append(toIndentedString(cpuUsageIn)).append("\n");
    sb.append("    cpuUsageLt: ").append(toIndentedString(cpuUsageLt)).append("\n");
    sb.append("    cpuUsageLte: ").append(toIndentedString(cpuUsageLte)).append("\n");
    sb.append("    cpuUsageNot: ").append(toIndentedString(cpuUsageNot)).append("\n");
    sb.append("    cpuUsageNotIn: ").append(toIndentedString(cpuUsageNotIn)).append("\n");
    sb.append("    deletedAt: ").append(toIndentedString(deletedAt)).append("\n");
    sb.append("    deletedAtGt: ").append(toIndentedString(deletedAtGt)).append("\n");
    sb.append("    deletedAtGte: ").append(toIndentedString(deletedAtGte)).append("\n");
    sb.append("    deletedAtIn: ").append(toIndentedString(deletedAtIn)).append("\n");
    sb.append("    deletedAtLt: ").append(toIndentedString(deletedAtLt)).append("\n");
    sb.append("    deletedAtLte: ").append(toIndentedString(deletedAtLte)).append("\n");
    sb.append("    deletedAtNot: ").append(toIndentedString(deletedAtNot)).append("\n");
    sb.append("    deletedAtNotIn: ").append(toIndentedString(deletedAtNotIn)).append("\n");
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
    sb.append("    dnsServers: ").append(toIndentedString(dnsServers)).append("\n");
    sb.append("    dnsServersContains: ").append(toIndentedString(dnsServersContains)).append("\n");
    sb.append("    dnsServersEndsWith: ").append(toIndentedString(dnsServersEndsWith)).append("\n");
    sb.append("    dnsServersGt: ").append(toIndentedString(dnsServersGt)).append("\n");
    sb.append("    dnsServersGte: ").append(toIndentedString(dnsServersGte)).append("\n");
    sb.append("    dnsServersIn: ").append(toIndentedString(dnsServersIn)).append("\n");
    sb.append("    dnsServersLt: ").append(toIndentedString(dnsServersLt)).append("\n");
    sb.append("    dnsServersLte: ").append(toIndentedString(dnsServersLte)).append("\n");
    sb.append("    dnsServersNot: ").append(toIndentedString(dnsServersNot)).append("\n");
    sb.append("    dnsServersNotContains: ").append(toIndentedString(dnsServersNotContains)).append("\n");
    sb.append("    dnsServersNotEndsWith: ").append(toIndentedString(dnsServersNotEndsWith)).append("\n");
    sb.append("    dnsServersNotIn: ").append(toIndentedString(dnsServersNotIn)).append("\n");
    sb.append("    dnsServersNotStartsWith: ").append(toIndentedString(dnsServersNotStartsWith)).append("\n");
    sb.append("    dnsServersStartsWith: ").append(toIndentedString(dnsServersStartsWith)).append("\n");
    sb.append("    entityAsyncStatus: ").append(toIndentedString(entityAsyncStatus)).append("\n");
    sb.append("    entityAsyncStatusIn: ").append(toIndentedString(entityAsyncStatusIn)).append("\n");
    sb.append("    entityAsyncStatusNot: ").append(toIndentedString(entityAsyncStatusNot)).append("\n");
    sb.append("    entityAsyncStatusNotIn: ").append(toIndentedString(entityAsyncStatusNotIn)).append("\n");
    sb.append("    firmware: ").append(toIndentedString(firmware)).append("\n");
    sb.append("    firmwareIn: ").append(toIndentedString(firmwareIn)).append("\n");
    sb.append("    firmwareNot: ").append(toIndentedString(firmwareNot)).append("\n");
    sb.append("    firmwareNotIn: ").append(toIndentedString(firmwareNotIn)).append("\n");
    sb.append("    folder: ").append(toIndentedString(folder)).append("\n");
    sb.append("    gpuDevicesEvery: ").append(toIndentedString(gpuDevicesEvery)).append("\n");
    sb.append("    gpuDevicesNone: ").append(toIndentedString(gpuDevicesNone)).append("\n");
    sb.append("    gpuDevicesSome: ").append(toIndentedString(gpuDevicesSome)).append("\n");
    sb.append("    guestCpuModel: ").append(toIndentedString(guestCpuModel)).append("\n");
    sb.append("    guestCpuModelContains: ").append(toIndentedString(guestCpuModelContains)).append("\n");
    sb.append("    guestCpuModelEndsWith: ").append(toIndentedString(guestCpuModelEndsWith)).append("\n");
    sb.append("    guestCpuModelGt: ").append(toIndentedString(guestCpuModelGt)).append("\n");
    sb.append("    guestCpuModelGte: ").append(toIndentedString(guestCpuModelGte)).append("\n");
    sb.append("    guestCpuModelIn: ").append(toIndentedString(guestCpuModelIn)).append("\n");
    sb.append("    guestCpuModelLt: ").append(toIndentedString(guestCpuModelLt)).append("\n");
    sb.append("    guestCpuModelLte: ").append(toIndentedString(guestCpuModelLte)).append("\n");
    sb.append("    guestCpuModelNot: ").append(toIndentedString(guestCpuModelNot)).append("\n");
    sb.append("    guestCpuModelNotContains: ").append(toIndentedString(guestCpuModelNotContains)).append("\n");
    sb.append("    guestCpuModelNotEndsWith: ").append(toIndentedString(guestCpuModelNotEndsWith)).append("\n");
    sb.append("    guestCpuModelNotIn: ").append(toIndentedString(guestCpuModelNotIn)).append("\n");
    sb.append("    guestCpuModelNotStartsWith: ").append(toIndentedString(guestCpuModelNotStartsWith)).append("\n");
    sb.append("    guestCpuModelStartsWith: ").append(toIndentedString(guestCpuModelStartsWith)).append("\n");
    sb.append("    guestOsType: ").append(toIndentedString(guestOsType)).append("\n");
    sb.append("    guestOsTypeIn: ").append(toIndentedString(guestOsTypeIn)).append("\n");
    sb.append("    guestOsTypeNot: ").append(toIndentedString(guestOsTypeNot)).append("\n");
    sb.append("    guestOsTypeNotIn: ").append(toIndentedString(guestOsTypeNotIn)).append("\n");
    sb.append("    guestSizeUsage: ").append(toIndentedString(guestSizeUsage)).append("\n");
    sb.append("    guestSizeUsageGt: ").append(toIndentedString(guestSizeUsageGt)).append("\n");
    sb.append("    guestSizeUsageGte: ").append(toIndentedString(guestSizeUsageGte)).append("\n");
    sb.append("    guestSizeUsageIn: ").append(toIndentedString(guestSizeUsageIn)).append("\n");
    sb.append("    guestSizeUsageLt: ").append(toIndentedString(guestSizeUsageLt)).append("\n");
    sb.append("    guestSizeUsageLte: ").append(toIndentedString(guestSizeUsageLte)).append("\n");
    sb.append("    guestSizeUsageNot: ").append(toIndentedString(guestSizeUsageNot)).append("\n");
    sb.append("    guestSizeUsageNotIn: ").append(toIndentedString(guestSizeUsageNotIn)).append("\n");
    sb.append("    guestUsedSize: ").append(toIndentedString(guestUsedSize)).append("\n");
    sb.append("    guestUsedSizeGt: ").append(toIndentedString(guestUsedSizeGt)).append("\n");
    sb.append("    guestUsedSizeGte: ").append(toIndentedString(guestUsedSizeGte)).append("\n");
    sb.append("    guestUsedSizeIn: ").append(toIndentedString(guestUsedSizeIn)).append("\n");
    sb.append("    guestUsedSizeLt: ").append(toIndentedString(guestUsedSizeLt)).append("\n");
    sb.append("    guestUsedSizeLte: ").append(toIndentedString(guestUsedSizeLte)).append("\n");
    sb.append("    guestUsedSizeNot: ").append(toIndentedString(guestUsedSizeNot)).append("\n");
    sb.append("    guestUsedSizeNotIn: ").append(toIndentedString(guestUsedSizeNotIn)).append("\n");
    sb.append("    ha: ").append(toIndentedString(ha)).append("\n");
    sb.append("    haNot: ").append(toIndentedString(haNot)).append("\n");
    sb.append("    host: ").append(toIndentedString(host)).append("\n");
    sb.append("    hostname: ").append(toIndentedString(hostname)).append("\n");
    sb.append("    hostnameContains: ").append(toIndentedString(hostnameContains)).append("\n");
    sb.append("    hostnameEndsWith: ").append(toIndentedString(hostnameEndsWith)).append("\n");
    sb.append("    hostnameGt: ").append(toIndentedString(hostnameGt)).append("\n");
    sb.append("    hostnameGte: ").append(toIndentedString(hostnameGte)).append("\n");
    sb.append("    hostnameIn: ").append(toIndentedString(hostnameIn)).append("\n");
    sb.append("    hostnameLt: ").append(toIndentedString(hostnameLt)).append("\n");
    sb.append("    hostnameLte: ").append(toIndentedString(hostnameLte)).append("\n");
    sb.append("    hostnameNot: ").append(toIndentedString(hostnameNot)).append("\n");
    sb.append("    hostnameNotContains: ").append(toIndentedString(hostnameNotContains)).append("\n");
    sb.append("    hostnameNotEndsWith: ").append(toIndentedString(hostnameNotEndsWith)).append("\n");
    sb.append("    hostnameNotIn: ").append(toIndentedString(hostnameNotIn)).append("\n");
    sb.append("    hostnameNotStartsWith: ").append(toIndentedString(hostnameNotStartsWith)).append("\n");
    sb.append("    hostnameStartsWith: ").append(toIndentedString(hostnameStartsWith)).append("\n");
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
    sb.append("    inRecycleBin: ").append(toIndentedString(inRecycleBin)).append("\n");
    sb.append("    inRecycleBinNot: ").append(toIndentedString(inRecycleBinNot)).append("\n");
    sb.append("    internal: ").append(toIndentedString(internal)).append("\n");
    sb.append("    internalNot: ").append(toIndentedString(internalNot)).append("\n");
    sb.append("    ioPolicy: ").append(toIndentedString(ioPolicy)).append("\n");
    sb.append("    ioPolicyIn: ").append(toIndentedString(ioPolicyIn)).append("\n");
    sb.append("    ioPolicyNot: ").append(toIndentedString(ioPolicyNot)).append("\n");
    sb.append("    ioPolicyNotIn: ").append(toIndentedString(ioPolicyNotIn)).append("\n");
    sb.append("    ips: ").append(toIndentedString(ips)).append("\n");
    sb.append("    ipsContains: ").append(toIndentedString(ipsContains)).append("\n");
    sb.append("    ipsEndsWith: ").append(toIndentedString(ipsEndsWith)).append("\n");
    sb.append("    ipsGt: ").append(toIndentedString(ipsGt)).append("\n");
    sb.append("    ipsGte: ").append(toIndentedString(ipsGte)).append("\n");
    sb.append("    ipsIn: ").append(toIndentedString(ipsIn)).append("\n");
    sb.append("    ipsLt: ").append(toIndentedString(ipsLt)).append("\n");
    sb.append("    ipsLte: ").append(toIndentedString(ipsLte)).append("\n");
    sb.append("    ipsNot: ").append(toIndentedString(ipsNot)).append("\n");
    sb.append("    ipsNotContains: ").append(toIndentedString(ipsNotContains)).append("\n");
    sb.append("    ipsNotEndsWith: ").append(toIndentedString(ipsNotEndsWith)).append("\n");
    sb.append("    ipsNotIn: ").append(toIndentedString(ipsNotIn)).append("\n");
    sb.append("    ipsNotStartsWith: ").append(toIndentedString(ipsNotStartsWith)).append("\n");
    sb.append("    ipsStartsWith: ").append(toIndentedString(ipsStartsWith)).append("\n");
    sb.append("    kernelInfo: ").append(toIndentedString(kernelInfo)).append("\n");
    sb.append("    kernelInfoContains: ").append(toIndentedString(kernelInfoContains)).append("\n");
    sb.append("    kernelInfoEndsWith: ").append(toIndentedString(kernelInfoEndsWith)).append("\n");
    sb.append("    kernelInfoGt: ").append(toIndentedString(kernelInfoGt)).append("\n");
    sb.append("    kernelInfoGte: ").append(toIndentedString(kernelInfoGte)).append("\n");
    sb.append("    kernelInfoIn: ").append(toIndentedString(kernelInfoIn)).append("\n");
    sb.append("    kernelInfoLt: ").append(toIndentedString(kernelInfoLt)).append("\n");
    sb.append("    kernelInfoLte: ").append(toIndentedString(kernelInfoLte)).append("\n");
    sb.append("    kernelInfoNot: ").append(toIndentedString(kernelInfoNot)).append("\n");
    sb.append("    kernelInfoNotContains: ").append(toIndentedString(kernelInfoNotContains)).append("\n");
    sb.append("    kernelInfoNotEndsWith: ").append(toIndentedString(kernelInfoNotEndsWith)).append("\n");
    sb.append("    kernelInfoNotIn: ").append(toIndentedString(kernelInfoNotIn)).append("\n");
    sb.append("    kernelInfoNotStartsWith: ").append(toIndentedString(kernelInfoNotStartsWith)).append("\n");
    sb.append("    kernelInfoStartsWith: ").append(toIndentedString(kernelInfoStartsWith)).append("\n");
    sb.append("    labelsEvery: ").append(toIndentedString(labelsEvery)).append("\n");
    sb.append("    labelsNone: ").append(toIndentedString(labelsNone)).append("\n");
    sb.append("    labelsSome: ").append(toIndentedString(labelsSome)).append("\n");
    sb.append("    lastShutdownTime: ").append(toIndentedString(lastShutdownTime)).append("\n");
    sb.append("    lastShutdownTimeGt: ").append(toIndentedString(lastShutdownTimeGt)).append("\n");
    sb.append("    lastShutdownTimeGte: ").append(toIndentedString(lastShutdownTimeGte)).append("\n");
    sb.append("    lastShutdownTimeIn: ").append(toIndentedString(lastShutdownTimeIn)).append("\n");
    sb.append("    lastShutdownTimeLt: ").append(toIndentedString(lastShutdownTimeLt)).append("\n");
    sb.append("    lastShutdownTimeLte: ").append(toIndentedString(lastShutdownTimeLte)).append("\n");
    sb.append("    lastShutdownTimeNot: ").append(toIndentedString(lastShutdownTimeNot)).append("\n");
    sb.append("    lastShutdownTimeNotIn: ").append(toIndentedString(lastShutdownTimeNotIn)).append("\n");
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
    sb.append("    logicalSizeBytes: ").append(toIndentedString(logicalSizeBytes)).append("\n");
    sb.append("    logicalSizeBytesGt: ").append(toIndentedString(logicalSizeBytesGt)).append("\n");
    sb.append("    logicalSizeBytesGte: ").append(toIndentedString(logicalSizeBytesGte)).append("\n");
    sb.append("    logicalSizeBytesIn: ").append(toIndentedString(logicalSizeBytesIn)).append("\n");
    sb.append("    logicalSizeBytesLt: ").append(toIndentedString(logicalSizeBytesLt)).append("\n");
    sb.append("    logicalSizeBytesLte: ").append(toIndentedString(logicalSizeBytesLte)).append("\n");
    sb.append("    logicalSizeBytesNot: ").append(toIndentedString(logicalSizeBytesNot)).append("\n");
    sb.append("    logicalSizeBytesNotIn: ").append(toIndentedString(logicalSizeBytesNotIn)).append("\n");
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
    sb.append("    memoryUsage: ").append(toIndentedString(memoryUsage)).append("\n");
    sb.append("    memoryUsageGt: ").append(toIndentedString(memoryUsageGt)).append("\n");
    sb.append("    memoryUsageGte: ").append(toIndentedString(memoryUsageGte)).append("\n");
    sb.append("    memoryUsageIn: ").append(toIndentedString(memoryUsageIn)).append("\n");
    sb.append("    memoryUsageLt: ").append(toIndentedString(memoryUsageLt)).append("\n");
    sb.append("    memoryUsageLte: ").append(toIndentedString(memoryUsageLte)).append("\n");
    sb.append("    memoryUsageNot: ").append(toIndentedString(memoryUsageNot)).append("\n");
    sb.append("    memoryUsageNotIn: ").append(toIndentedString(memoryUsageNotIn)).append("\n");
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
    sb.append("    nestedVirtualization: ").append(toIndentedString(nestedVirtualization)).append("\n");
    sb.append("    nestedVirtualizationNot: ").append(toIndentedString(nestedVirtualizationNot)).append("\n");
    sb.append("    nodeIp: ").append(toIndentedString(nodeIp)).append("\n");
    sb.append("    nodeIpContains: ").append(toIndentedString(nodeIpContains)).append("\n");
    sb.append("    nodeIpEndsWith: ").append(toIndentedString(nodeIpEndsWith)).append("\n");
    sb.append("    nodeIpGt: ").append(toIndentedString(nodeIpGt)).append("\n");
    sb.append("    nodeIpGte: ").append(toIndentedString(nodeIpGte)).append("\n");
    sb.append("    nodeIpIn: ").append(toIndentedString(nodeIpIn)).append("\n");
    sb.append("    nodeIpLt: ").append(toIndentedString(nodeIpLt)).append("\n");
    sb.append("    nodeIpLte: ").append(toIndentedString(nodeIpLte)).append("\n");
    sb.append("    nodeIpNot: ").append(toIndentedString(nodeIpNot)).append("\n");
    sb.append("    nodeIpNotContains: ").append(toIndentedString(nodeIpNotContains)).append("\n");
    sb.append("    nodeIpNotEndsWith: ").append(toIndentedString(nodeIpNotEndsWith)).append("\n");
    sb.append("    nodeIpNotIn: ").append(toIndentedString(nodeIpNotIn)).append("\n");
    sb.append("    nodeIpNotStartsWith: ").append(toIndentedString(nodeIpNotStartsWith)).append("\n");
    sb.append("    nodeIpStartsWith: ").append(toIndentedString(nodeIpStartsWith)).append("\n");
    sb.append("    originalName: ").append(toIndentedString(originalName)).append("\n");
    sb.append("    originalNameContains: ").append(toIndentedString(originalNameContains)).append("\n");
    sb.append("    originalNameEndsWith: ").append(toIndentedString(originalNameEndsWith)).append("\n");
    sb.append("    originalNameGt: ").append(toIndentedString(originalNameGt)).append("\n");
    sb.append("    originalNameGte: ").append(toIndentedString(originalNameGte)).append("\n");
    sb.append("    originalNameIn: ").append(toIndentedString(originalNameIn)).append("\n");
    sb.append("    originalNameLt: ").append(toIndentedString(originalNameLt)).append("\n");
    sb.append("    originalNameLte: ").append(toIndentedString(originalNameLte)).append("\n");
    sb.append("    originalNameNot: ").append(toIndentedString(originalNameNot)).append("\n");
    sb.append("    originalNameNotContains: ").append(toIndentedString(originalNameNotContains)).append("\n");
    sb.append("    originalNameNotEndsWith: ").append(toIndentedString(originalNameNotEndsWith)).append("\n");
    sb.append("    originalNameNotIn: ").append(toIndentedString(originalNameNotIn)).append("\n");
    sb.append("    originalNameNotStartsWith: ").append(toIndentedString(originalNameNotStartsWith)).append("\n");
    sb.append("    originalNameStartsWith: ").append(toIndentedString(originalNameStartsWith)).append("\n");
    sb.append("    os: ").append(toIndentedString(os)).append("\n");
    sb.append("    osContains: ").append(toIndentedString(osContains)).append("\n");
    sb.append("    osEndsWith: ").append(toIndentedString(osEndsWith)).append("\n");
    sb.append("    osGt: ").append(toIndentedString(osGt)).append("\n");
    sb.append("    osGte: ").append(toIndentedString(osGte)).append("\n");
    sb.append("    osIn: ").append(toIndentedString(osIn)).append("\n");
    sb.append("    osLt: ").append(toIndentedString(osLt)).append("\n");
    sb.append("    osLte: ").append(toIndentedString(osLte)).append("\n");
    sb.append("    osNot: ").append(toIndentedString(osNot)).append("\n");
    sb.append("    osNotContains: ").append(toIndentedString(osNotContains)).append("\n");
    sb.append("    osNotEndsWith: ").append(toIndentedString(osNotEndsWith)).append("\n");
    sb.append("    osNotIn: ").append(toIndentedString(osNotIn)).append("\n");
    sb.append("    osNotStartsWith: ").append(toIndentedString(osNotStartsWith)).append("\n");
    sb.append("    osStartsWith: ").append(toIndentedString(osStartsWith)).append("\n");
    sb.append("    pciNicsEvery: ").append(toIndentedString(pciNicsEvery)).append("\n");
    sb.append("    pciNicsNone: ").append(toIndentedString(pciNicsNone)).append("\n");
    sb.append("    pciNicsSome: ").append(toIndentedString(pciNicsSome)).append("\n");
    sb.append("    _protected: ").append(toIndentedString(_protected)).append("\n");
    sb.append("    protectedNot: ").append(toIndentedString(protectedNot)).append("\n");
    sb.append("    provisionedSize: ").append(toIndentedString(provisionedSize)).append("\n");
    sb.append("    provisionedSizeGt: ").append(toIndentedString(provisionedSizeGt)).append("\n");
    sb.append("    provisionedSizeGte: ").append(toIndentedString(provisionedSizeGte)).append("\n");
    sb.append("    provisionedSizeIn: ").append(toIndentedString(provisionedSizeIn)).append("\n");
    sb.append("    provisionedSizeLt: ").append(toIndentedString(provisionedSizeLt)).append("\n");
    sb.append("    provisionedSizeLte: ").append(toIndentedString(provisionedSizeLte)).append("\n");
    sb.append("    provisionedSizeNot: ").append(toIndentedString(provisionedSizeNot)).append("\n");
    sb.append("    provisionedSizeNotIn: ").append(toIndentedString(provisionedSizeNotIn)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    sizeGt: ").append(toIndentedString(sizeGt)).append("\n");
    sb.append("    sizeGte: ").append(toIndentedString(sizeGte)).append("\n");
    sb.append("    sizeIn: ").append(toIndentedString(sizeIn)).append("\n");
    sb.append("    sizeLt: ").append(toIndentedString(sizeLt)).append("\n");
    sb.append("    sizeLte: ").append(toIndentedString(sizeLte)).append("\n");
    sb.append("    sizeNot: ").append(toIndentedString(sizeNot)).append("\n");
    sb.append("    sizeNotIn: ").append(toIndentedString(sizeNotIn)).append("\n");
    sb.append("    snapshotsEvery: ").append(toIndentedString(snapshotsEvery)).append("\n");
    sb.append("    snapshotsNone: ").append(toIndentedString(snapshotsNone)).append("\n");
    sb.append("    snapshotsSome: ").append(toIndentedString(snapshotsSome)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusIn: ").append(toIndentedString(statusIn)).append("\n");
    sb.append("    statusNot: ").append(toIndentedString(statusNot)).append("\n");
    sb.append("    statusNotIn: ").append(toIndentedString(statusNotIn)).append("\n");
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
    sb.append("    usbDevicesEvery: ").append(toIndentedString(usbDevicesEvery)).append("\n");
    sb.append("    usbDevicesNone: ").append(toIndentedString(usbDevicesNone)).append("\n");
    sb.append("    usbDevicesSome: ").append(toIndentedString(usbDevicesSome)).append("\n");
    sb.append("    vcpu: ").append(toIndentedString(vcpu)).append("\n");
    sb.append("    vcpuGt: ").append(toIndentedString(vcpuGt)).append("\n");
    sb.append("    vcpuGte: ").append(toIndentedString(vcpuGte)).append("\n");
    sb.append("    vcpuIn: ").append(toIndentedString(vcpuIn)).append("\n");
    sb.append("    vcpuLt: ").append(toIndentedString(vcpuLt)).append("\n");
    sb.append("    vcpuLte: ").append(toIndentedString(vcpuLte)).append("\n");
    sb.append("    vcpuNot: ").append(toIndentedString(vcpuNot)).append("\n");
    sb.append("    vcpuNotIn: ").append(toIndentedString(vcpuNotIn)).append("\n");
    sb.append("    videoType: ").append(toIndentedString(videoType)).append("\n");
    sb.append("    videoTypeIn: ").append(toIndentedString(videoTypeIn)).append("\n");
    sb.append("    videoTypeNot: ").append(toIndentedString(videoTypeNot)).append("\n");
    sb.append("    videoTypeNotIn: ").append(toIndentedString(videoTypeNotIn)).append("\n");
    sb.append("    vmDisksEvery: ").append(toIndentedString(vmDisksEvery)).append("\n");
    sb.append("    vmDisksNone: ").append(toIndentedString(vmDisksNone)).append("\n");
    sb.append("    vmDisksSome: ").append(toIndentedString(vmDisksSome)).append("\n");
    sb.append("    vmNicsEvery: ").append(toIndentedString(vmNicsEvery)).append("\n");
    sb.append("    vmNicsNone: ").append(toIndentedString(vmNicsNone)).append("\n");
    sb.append("    vmNicsSome: ").append(toIndentedString(vmNicsSome)).append("\n");
    sb.append("    vmPlacementGroupEvery: ").append(toIndentedString(vmPlacementGroupEvery)).append("\n");
    sb.append("    vmPlacementGroupNone: ").append(toIndentedString(vmPlacementGroupNone)).append("\n");
    sb.append("    vmPlacementGroupSome: ").append(toIndentedString(vmPlacementGroupSome)).append("\n");
    sb.append("    vmToolsStatus: ").append(toIndentedString(vmToolsStatus)).append("\n");
    sb.append("    vmToolsStatusIn: ").append(toIndentedString(vmToolsStatusIn)).append("\n");
    sb.append("    vmToolsStatusNot: ").append(toIndentedString(vmToolsStatusNot)).append("\n");
    sb.append("    vmToolsStatusNotIn: ").append(toIndentedString(vmToolsStatusNotIn)).append("\n");
    sb.append("    vmToolsVersion: ").append(toIndentedString(vmToolsVersion)).append("\n");
    sb.append("    vmToolsVersionContains: ").append(toIndentedString(vmToolsVersionContains)).append("\n");
    sb.append("    vmToolsVersionEndsWith: ").append(toIndentedString(vmToolsVersionEndsWith)).append("\n");
    sb.append("    vmToolsVersionGt: ").append(toIndentedString(vmToolsVersionGt)).append("\n");
    sb.append("    vmToolsVersionGte: ").append(toIndentedString(vmToolsVersionGte)).append("\n");
    sb.append("    vmToolsVersionIn: ").append(toIndentedString(vmToolsVersionIn)).append("\n");
    sb.append("    vmToolsVersionLt: ").append(toIndentedString(vmToolsVersionLt)).append("\n");
    sb.append("    vmToolsVersionLte: ").append(toIndentedString(vmToolsVersionLte)).append("\n");
    sb.append("    vmToolsVersionNot: ").append(toIndentedString(vmToolsVersionNot)).append("\n");
    sb.append("    vmToolsVersionNotContains: ").append(toIndentedString(vmToolsVersionNotContains)).append("\n");
    sb.append("    vmToolsVersionNotEndsWith: ").append(toIndentedString(vmToolsVersionNotEndsWith)).append("\n");
    sb.append("    vmToolsVersionNotIn: ").append(toIndentedString(vmToolsVersionNotIn)).append("\n");
    sb.append("    vmToolsVersionNotStartsWith: ").append(toIndentedString(vmToolsVersionNotStartsWith)).append("\n");
    sb.append("    vmToolsVersionStartsWith: ").append(toIndentedString(vmToolsVersionStartsWith)).append("\n");
    sb.append("    vmUsage: ").append(toIndentedString(vmUsage)).append("\n");
    sb.append("    vmUsageIn: ").append(toIndentedString(vmUsageIn)).append("\n");
    sb.append("    vmUsageNot: ").append(toIndentedString(vmUsageNot)).append("\n");
    sb.append("    vmUsageNotIn: ").append(toIndentedString(vmUsageNotIn)).append("\n");
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

