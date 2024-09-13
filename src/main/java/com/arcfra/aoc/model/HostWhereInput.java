package com.arcfra.aoc.model;

import java.util.Objects;
import java.util.Arrays;
import com.arcfra.aoc.model.ClusterWhereInput;
import com.arcfra.aoc.model.CpuFanSpeedUnit;
import com.arcfra.aoc.model.EntityAsyncStatus;
import com.arcfra.aoc.model.GpuDeviceWhereInput;
import com.arcfra.aoc.model.HostState;
import com.arcfra.aoc.model.HostStatus;
import com.arcfra.aoc.model.IommuStatus;
import com.arcfra.aoc.model.LabelWhereInput;
import com.arcfra.aoc.model.NicWhereInput;
import com.arcfra.aoc.model.UsbDeviceWhereInput;
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
 * HostWhereInput
 */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class HostWhereInput {
  public static final String SERIALIZED_NAME_A_N_D = "AND";
  @SerializedName(SERIALIZED_NAME_A_N_D)
  private List<HostWhereInput> AND = null;

  public static final String SERIALIZED_NAME_N_O_T = "NOT";
  @SerializedName(SERIALIZED_NAME_N_O_T)
  private List<HostWhereInput> NOT = null;

  public static final String SERIALIZED_NAME_O_R = "OR";
  @SerializedName(SERIALIZED_NAME_O_R)
  private List<HostWhereInput> OR = null;

  public static final String SERIALIZED_NAME_ACCESS_IP = "access_ip";
  @SerializedName(SERIALIZED_NAME_ACCESS_IP)
  private String accessIp;

  public static final String SERIALIZED_NAME_ACCESS_IP_CONTAINS = "access_ip_contains";
  @SerializedName(SERIALIZED_NAME_ACCESS_IP_CONTAINS)
  private String accessIpContains;

  public static final String SERIALIZED_NAME_ACCESS_IP_ENDS_WITH = "access_ip_ends_with";
  @SerializedName(SERIALIZED_NAME_ACCESS_IP_ENDS_WITH)
  private String accessIpEndsWith;

  public static final String SERIALIZED_NAME_ACCESS_IP_GT = "access_ip_gt";
  @SerializedName(SERIALIZED_NAME_ACCESS_IP_GT)
  private String accessIpGt;

  public static final String SERIALIZED_NAME_ACCESS_IP_GTE = "access_ip_gte";
  @SerializedName(SERIALIZED_NAME_ACCESS_IP_GTE)
  private String accessIpGte;

  public static final String SERIALIZED_NAME_ACCESS_IP_IN = "access_ip_in";
  @SerializedName(SERIALIZED_NAME_ACCESS_IP_IN)
  private List<String> accessIpIn = null;

  public static final String SERIALIZED_NAME_ACCESS_IP_LT = "access_ip_lt";
  @SerializedName(SERIALIZED_NAME_ACCESS_IP_LT)
  private String accessIpLt;

  public static final String SERIALIZED_NAME_ACCESS_IP_LTE = "access_ip_lte";
  @SerializedName(SERIALIZED_NAME_ACCESS_IP_LTE)
  private String accessIpLte;

  public static final String SERIALIZED_NAME_ACCESS_IP_NOT = "access_ip_not";
  @SerializedName(SERIALIZED_NAME_ACCESS_IP_NOT)
  private String accessIpNot;

  public static final String SERIALIZED_NAME_ACCESS_IP_NOT_CONTAINS = "access_ip_not_contains";
  @SerializedName(SERIALIZED_NAME_ACCESS_IP_NOT_CONTAINS)
  private String accessIpNotContains;

  public static final String SERIALIZED_NAME_ACCESS_IP_NOT_ENDS_WITH = "access_ip_not_ends_with";
  @SerializedName(SERIALIZED_NAME_ACCESS_IP_NOT_ENDS_WITH)
  private String accessIpNotEndsWith;

  public static final String SERIALIZED_NAME_ACCESS_IP_NOT_IN = "access_ip_not_in";
  @SerializedName(SERIALIZED_NAME_ACCESS_IP_NOT_IN)
  private List<String> accessIpNotIn = null;

  public static final String SERIALIZED_NAME_ACCESS_IP_NOT_STARTS_WITH = "access_ip_not_starts_with";
  @SerializedName(SERIALIZED_NAME_ACCESS_IP_NOT_STARTS_WITH)
  private String accessIpNotStartsWith;

  public static final String SERIALIZED_NAME_ACCESS_IP_STARTS_WITH = "access_ip_starts_with";
  @SerializedName(SERIALIZED_NAME_ACCESS_IP_STARTS_WITH)
  private String accessIpStartsWith;

  public static final String SERIALIZED_NAME_ALLOCABLE_CPU_CORES_FOR_VM_EXCLUSIVE = "allocable_cpu_cores_for_vm_exclusive";
  @SerializedName(SERIALIZED_NAME_ALLOCABLE_CPU_CORES_FOR_VM_EXCLUSIVE)
  private Integer allocableCpuCoresForVmExclusive;

  public static final String SERIALIZED_NAME_ALLOCABLE_CPU_CORES_FOR_VM_EXCLUSIVE_GT = "allocable_cpu_cores_for_vm_exclusive_gt";
  @SerializedName(SERIALIZED_NAME_ALLOCABLE_CPU_CORES_FOR_VM_EXCLUSIVE_GT)
  private Integer allocableCpuCoresForVmExclusiveGt;

  public static final String SERIALIZED_NAME_ALLOCABLE_CPU_CORES_FOR_VM_EXCLUSIVE_GTE = "allocable_cpu_cores_for_vm_exclusive_gte";
  @SerializedName(SERIALIZED_NAME_ALLOCABLE_CPU_CORES_FOR_VM_EXCLUSIVE_GTE)
  private Integer allocableCpuCoresForVmExclusiveGte;

  public static final String SERIALIZED_NAME_ALLOCABLE_CPU_CORES_FOR_VM_EXCLUSIVE_IN = "allocable_cpu_cores_for_vm_exclusive_in";
  @SerializedName(SERIALIZED_NAME_ALLOCABLE_CPU_CORES_FOR_VM_EXCLUSIVE_IN)
  private List<Integer> allocableCpuCoresForVmExclusiveIn = null;

  public static final String SERIALIZED_NAME_ALLOCABLE_CPU_CORES_FOR_VM_EXCLUSIVE_LT = "allocable_cpu_cores_for_vm_exclusive_lt";
  @SerializedName(SERIALIZED_NAME_ALLOCABLE_CPU_CORES_FOR_VM_EXCLUSIVE_LT)
  private Integer allocableCpuCoresForVmExclusiveLt;

  public static final String SERIALIZED_NAME_ALLOCABLE_CPU_CORES_FOR_VM_EXCLUSIVE_LTE = "allocable_cpu_cores_for_vm_exclusive_lte";
  @SerializedName(SERIALIZED_NAME_ALLOCABLE_CPU_CORES_FOR_VM_EXCLUSIVE_LTE)
  private Integer allocableCpuCoresForVmExclusiveLte;

  public static final String SERIALIZED_NAME_ALLOCABLE_CPU_CORES_FOR_VM_EXCLUSIVE_NOT = "allocable_cpu_cores_for_vm_exclusive_not";
  @SerializedName(SERIALIZED_NAME_ALLOCABLE_CPU_CORES_FOR_VM_EXCLUSIVE_NOT)
  private Integer allocableCpuCoresForVmExclusiveNot;

  public static final String SERIALIZED_NAME_ALLOCABLE_CPU_CORES_FOR_VM_EXCLUSIVE_NOT_IN = "allocable_cpu_cores_for_vm_exclusive_not_in";
  @SerializedName(SERIALIZED_NAME_ALLOCABLE_CPU_CORES_FOR_VM_EXCLUSIVE_NOT_IN)
  private List<Integer> allocableCpuCoresForVmExclusiveNotIn = null;

  public static final String SERIALIZED_NAME_ALLOCATABLE_MEMORY_BYTES = "allocatable_memory_bytes";
  @SerializedName(SERIALIZED_NAME_ALLOCATABLE_MEMORY_BYTES)
  private Long allocatableMemoryBytes;

  public static final String SERIALIZED_NAME_ALLOCATABLE_MEMORY_BYTES_GT = "allocatable_memory_bytes_gt";
  @SerializedName(SERIALIZED_NAME_ALLOCATABLE_MEMORY_BYTES_GT)
  private Long allocatableMemoryBytesGt;

  public static final String SERIALIZED_NAME_ALLOCATABLE_MEMORY_BYTES_GTE = "allocatable_memory_bytes_gte";
  @SerializedName(SERIALIZED_NAME_ALLOCATABLE_MEMORY_BYTES_GTE)
  private Long allocatableMemoryBytesGte;

  public static final String SERIALIZED_NAME_ALLOCATABLE_MEMORY_BYTES_IN = "allocatable_memory_bytes_in";
  @SerializedName(SERIALIZED_NAME_ALLOCATABLE_MEMORY_BYTES_IN)
  private List<Long> allocatableMemoryBytesIn = null;

  public static final String SERIALIZED_NAME_ALLOCATABLE_MEMORY_BYTES_LT = "allocatable_memory_bytes_lt";
  @SerializedName(SERIALIZED_NAME_ALLOCATABLE_MEMORY_BYTES_LT)
  private Long allocatableMemoryBytesLt;

  public static final String SERIALIZED_NAME_ALLOCATABLE_MEMORY_BYTES_LTE = "allocatable_memory_bytes_lte";
  @SerializedName(SERIALIZED_NAME_ALLOCATABLE_MEMORY_BYTES_LTE)
  private Long allocatableMemoryBytesLte;

  public static final String SERIALIZED_NAME_ALLOCATABLE_MEMORY_BYTES_NOT = "allocatable_memory_bytes_not";
  @SerializedName(SERIALIZED_NAME_ALLOCATABLE_MEMORY_BYTES_NOT)
  private Long allocatableMemoryBytesNot;

  public static final String SERIALIZED_NAME_ALLOCATABLE_MEMORY_BYTES_NOT_IN = "allocatable_memory_bytes_not_in";
  @SerializedName(SERIALIZED_NAME_ALLOCATABLE_MEMORY_BYTES_NOT_IN)
  private List<Long> allocatableMemoryBytesNotIn = null;

  public static final String SERIALIZED_NAME_CHUNK_ID = "chunk_id";
  @SerializedName(SERIALIZED_NAME_CHUNK_ID)
  private String chunkId;

  public static final String SERIALIZED_NAME_CHUNK_ID_CONTAINS = "chunk_id_contains";
  @SerializedName(SERIALIZED_NAME_CHUNK_ID_CONTAINS)
  private String chunkIdContains;

  public static final String SERIALIZED_NAME_CHUNK_ID_ENDS_WITH = "chunk_id_ends_with";
  @SerializedName(SERIALIZED_NAME_CHUNK_ID_ENDS_WITH)
  private String chunkIdEndsWith;

  public static final String SERIALIZED_NAME_CHUNK_ID_GT = "chunk_id_gt";
  @SerializedName(SERIALIZED_NAME_CHUNK_ID_GT)
  private String chunkIdGt;

  public static final String SERIALIZED_NAME_CHUNK_ID_GTE = "chunk_id_gte";
  @SerializedName(SERIALIZED_NAME_CHUNK_ID_GTE)
  private String chunkIdGte;

  public static final String SERIALIZED_NAME_CHUNK_ID_IN = "chunk_id_in";
  @SerializedName(SERIALIZED_NAME_CHUNK_ID_IN)
  private List<String> chunkIdIn = null;

  public static final String SERIALIZED_NAME_CHUNK_ID_LT = "chunk_id_lt";
  @SerializedName(SERIALIZED_NAME_CHUNK_ID_LT)
  private String chunkIdLt;

  public static final String SERIALIZED_NAME_CHUNK_ID_LTE = "chunk_id_lte";
  @SerializedName(SERIALIZED_NAME_CHUNK_ID_LTE)
  private String chunkIdLte;

  public static final String SERIALIZED_NAME_CHUNK_ID_NOT = "chunk_id_not";
  @SerializedName(SERIALIZED_NAME_CHUNK_ID_NOT)
  private String chunkIdNot;

  public static final String SERIALIZED_NAME_CHUNK_ID_NOT_CONTAINS = "chunk_id_not_contains";
  @SerializedName(SERIALIZED_NAME_CHUNK_ID_NOT_CONTAINS)
  private String chunkIdNotContains;

  public static final String SERIALIZED_NAME_CHUNK_ID_NOT_ENDS_WITH = "chunk_id_not_ends_with";
  @SerializedName(SERIALIZED_NAME_CHUNK_ID_NOT_ENDS_WITH)
  private String chunkIdNotEndsWith;

  public static final String SERIALIZED_NAME_CHUNK_ID_NOT_IN = "chunk_id_not_in";
  @SerializedName(SERIALIZED_NAME_CHUNK_ID_NOT_IN)
  private List<String> chunkIdNotIn = null;

  public static final String SERIALIZED_NAME_CHUNK_ID_NOT_STARTS_WITH = "chunk_id_not_starts_with";
  @SerializedName(SERIALIZED_NAME_CHUNK_ID_NOT_STARTS_WITH)
  private String chunkIdNotStartsWith;

  public static final String SERIALIZED_NAME_CHUNK_ID_STARTS_WITH = "chunk_id_starts_with";
  @SerializedName(SERIALIZED_NAME_CHUNK_ID_STARTS_WITH)
  private String chunkIdStartsWith;

  public static final String SERIALIZED_NAME_CLUSTER = "cluster";
  @SerializedName(SERIALIZED_NAME_CLUSTER)
  private ClusterWhereInput cluster;

  public static final String SERIALIZED_NAME_CPU_BRAND = "cpu_brand";
  @SerializedName(SERIALIZED_NAME_CPU_BRAND)
  private String cpuBrand;

  public static final String SERIALIZED_NAME_CPU_BRAND_CONTAINS = "cpu_brand_contains";
  @SerializedName(SERIALIZED_NAME_CPU_BRAND_CONTAINS)
  private String cpuBrandContains;

  public static final String SERIALIZED_NAME_CPU_BRAND_ENDS_WITH = "cpu_brand_ends_with";
  @SerializedName(SERIALIZED_NAME_CPU_BRAND_ENDS_WITH)
  private String cpuBrandEndsWith;

  public static final String SERIALIZED_NAME_CPU_BRAND_GT = "cpu_brand_gt";
  @SerializedName(SERIALIZED_NAME_CPU_BRAND_GT)
  private String cpuBrandGt;

  public static final String SERIALIZED_NAME_CPU_BRAND_GTE = "cpu_brand_gte";
  @SerializedName(SERIALIZED_NAME_CPU_BRAND_GTE)
  private String cpuBrandGte;

  public static final String SERIALIZED_NAME_CPU_BRAND_IN = "cpu_brand_in";
  @SerializedName(SERIALIZED_NAME_CPU_BRAND_IN)
  private List<String> cpuBrandIn = null;

  public static final String SERIALIZED_NAME_CPU_BRAND_LT = "cpu_brand_lt";
  @SerializedName(SERIALIZED_NAME_CPU_BRAND_LT)
  private String cpuBrandLt;

  public static final String SERIALIZED_NAME_CPU_BRAND_LTE = "cpu_brand_lte";
  @SerializedName(SERIALIZED_NAME_CPU_BRAND_LTE)
  private String cpuBrandLte;

  public static final String SERIALIZED_NAME_CPU_BRAND_NOT = "cpu_brand_not";
  @SerializedName(SERIALIZED_NAME_CPU_BRAND_NOT)
  private String cpuBrandNot;

  public static final String SERIALIZED_NAME_CPU_BRAND_NOT_CONTAINS = "cpu_brand_not_contains";
  @SerializedName(SERIALIZED_NAME_CPU_BRAND_NOT_CONTAINS)
  private String cpuBrandNotContains;

  public static final String SERIALIZED_NAME_CPU_BRAND_NOT_ENDS_WITH = "cpu_brand_not_ends_with";
  @SerializedName(SERIALIZED_NAME_CPU_BRAND_NOT_ENDS_WITH)
  private String cpuBrandNotEndsWith;

  public static final String SERIALIZED_NAME_CPU_BRAND_NOT_IN = "cpu_brand_not_in";
  @SerializedName(SERIALIZED_NAME_CPU_BRAND_NOT_IN)
  private List<String> cpuBrandNotIn = null;

  public static final String SERIALIZED_NAME_CPU_BRAND_NOT_STARTS_WITH = "cpu_brand_not_starts_with";
  @SerializedName(SERIALIZED_NAME_CPU_BRAND_NOT_STARTS_WITH)
  private String cpuBrandNotStartsWith;

  public static final String SERIALIZED_NAME_CPU_BRAND_STARTS_WITH = "cpu_brand_starts_with";
  @SerializedName(SERIALIZED_NAME_CPU_BRAND_STARTS_WITH)
  private String cpuBrandStartsWith;

  public static final String SERIALIZED_NAME_CPU_FAN_SPEED_UNIT = "cpu_fan_speed_unit";
  @SerializedName(SERIALIZED_NAME_CPU_FAN_SPEED_UNIT)
  private CpuFanSpeedUnit cpuFanSpeedUnit;

  public static final String SERIALIZED_NAME_CPU_FAN_SPEED_UNIT_IN = "cpu_fan_speed_unit_in";
  @SerializedName(SERIALIZED_NAME_CPU_FAN_SPEED_UNIT_IN)
  private List<CpuFanSpeedUnit> cpuFanSpeedUnitIn = null;

  public static final String SERIALIZED_NAME_CPU_FAN_SPEED_UNIT_NOT = "cpu_fan_speed_unit_not";
  @SerializedName(SERIALIZED_NAME_CPU_FAN_SPEED_UNIT_NOT)
  private CpuFanSpeedUnit cpuFanSpeedUnitNot;

  public static final String SERIALIZED_NAME_CPU_FAN_SPEED_UNIT_NOT_IN = "cpu_fan_speed_unit_not_in";
  @SerializedName(SERIALIZED_NAME_CPU_FAN_SPEED_UNIT_NOT_IN)
  private List<CpuFanSpeedUnit> cpuFanSpeedUnitNotIn = null;

  public static final String SERIALIZED_NAME_CPU_HZ_PER_CORE = "cpu_hz_per_core";
  @SerializedName(SERIALIZED_NAME_CPU_HZ_PER_CORE)
  private Long cpuHzPerCore;

  public static final String SERIALIZED_NAME_CPU_HZ_PER_CORE_GT = "cpu_hz_per_core_gt";
  @SerializedName(SERIALIZED_NAME_CPU_HZ_PER_CORE_GT)
  private Long cpuHzPerCoreGt;

  public static final String SERIALIZED_NAME_CPU_HZ_PER_CORE_GTE = "cpu_hz_per_core_gte";
  @SerializedName(SERIALIZED_NAME_CPU_HZ_PER_CORE_GTE)
  private Long cpuHzPerCoreGte;

  public static final String SERIALIZED_NAME_CPU_HZ_PER_CORE_IN = "cpu_hz_per_core_in";
  @SerializedName(SERIALIZED_NAME_CPU_HZ_PER_CORE_IN)
  private List<Long> cpuHzPerCoreIn = null;

  public static final String SERIALIZED_NAME_CPU_HZ_PER_CORE_LT = "cpu_hz_per_core_lt";
  @SerializedName(SERIALIZED_NAME_CPU_HZ_PER_CORE_LT)
  private Long cpuHzPerCoreLt;

  public static final String SERIALIZED_NAME_CPU_HZ_PER_CORE_LTE = "cpu_hz_per_core_lte";
  @SerializedName(SERIALIZED_NAME_CPU_HZ_PER_CORE_LTE)
  private Long cpuHzPerCoreLte;

  public static final String SERIALIZED_NAME_CPU_HZ_PER_CORE_NOT = "cpu_hz_per_core_not";
  @SerializedName(SERIALIZED_NAME_CPU_HZ_PER_CORE_NOT)
  private Long cpuHzPerCoreNot;

  public static final String SERIALIZED_NAME_CPU_HZ_PER_CORE_NOT_IN = "cpu_hz_per_core_not_in";
  @SerializedName(SERIALIZED_NAME_CPU_HZ_PER_CORE_NOT_IN)
  private List<Long> cpuHzPerCoreNotIn = null;

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

  public static final String SERIALIZED_NAME_CPU_VENDOR = "cpu_vendor";
  @SerializedName(SERIALIZED_NAME_CPU_VENDOR)
  private String cpuVendor;

  public static final String SERIALIZED_NAME_CPU_VENDOR_CONTAINS = "cpu_vendor_contains";
  @SerializedName(SERIALIZED_NAME_CPU_VENDOR_CONTAINS)
  private String cpuVendorContains;

  public static final String SERIALIZED_NAME_CPU_VENDOR_ENDS_WITH = "cpu_vendor_ends_with";
  @SerializedName(SERIALIZED_NAME_CPU_VENDOR_ENDS_WITH)
  private String cpuVendorEndsWith;

  public static final String SERIALIZED_NAME_CPU_VENDOR_GT = "cpu_vendor_gt";
  @SerializedName(SERIALIZED_NAME_CPU_VENDOR_GT)
  private String cpuVendorGt;

  public static final String SERIALIZED_NAME_CPU_VENDOR_GTE = "cpu_vendor_gte";
  @SerializedName(SERIALIZED_NAME_CPU_VENDOR_GTE)
  private String cpuVendorGte;

  public static final String SERIALIZED_NAME_CPU_VENDOR_IN = "cpu_vendor_in";
  @SerializedName(SERIALIZED_NAME_CPU_VENDOR_IN)
  private List<String> cpuVendorIn = null;

  public static final String SERIALIZED_NAME_CPU_VENDOR_LT = "cpu_vendor_lt";
  @SerializedName(SERIALIZED_NAME_CPU_VENDOR_LT)
  private String cpuVendorLt;

  public static final String SERIALIZED_NAME_CPU_VENDOR_LTE = "cpu_vendor_lte";
  @SerializedName(SERIALIZED_NAME_CPU_VENDOR_LTE)
  private String cpuVendorLte;

  public static final String SERIALIZED_NAME_CPU_VENDOR_NOT = "cpu_vendor_not";
  @SerializedName(SERIALIZED_NAME_CPU_VENDOR_NOT)
  private String cpuVendorNot;

  public static final String SERIALIZED_NAME_CPU_VENDOR_NOT_CONTAINS = "cpu_vendor_not_contains";
  @SerializedName(SERIALIZED_NAME_CPU_VENDOR_NOT_CONTAINS)
  private String cpuVendorNotContains;

  public static final String SERIALIZED_NAME_CPU_VENDOR_NOT_ENDS_WITH = "cpu_vendor_not_ends_with";
  @SerializedName(SERIALIZED_NAME_CPU_VENDOR_NOT_ENDS_WITH)
  private String cpuVendorNotEndsWith;

  public static final String SERIALIZED_NAME_CPU_VENDOR_NOT_IN = "cpu_vendor_not_in";
  @SerializedName(SERIALIZED_NAME_CPU_VENDOR_NOT_IN)
  private List<String> cpuVendorNotIn = null;

  public static final String SERIALIZED_NAME_CPU_VENDOR_NOT_STARTS_WITH = "cpu_vendor_not_starts_with";
  @SerializedName(SERIALIZED_NAME_CPU_VENDOR_NOT_STARTS_WITH)
  private String cpuVendorNotStartsWith;

  public static final String SERIALIZED_NAME_CPU_VENDOR_STARTS_WITH = "cpu_vendor_starts_with";
  @SerializedName(SERIALIZED_NAME_CPU_VENDOR_STARTS_WITH)
  private String cpuVendorStartsWith;

  public static final String SERIALIZED_NAME_DATA_IP = "data_ip";
  @SerializedName(SERIALIZED_NAME_DATA_IP)
  private String dataIp;

  public static final String SERIALIZED_NAME_DATA_IP_CONTAINS = "data_ip_contains";
  @SerializedName(SERIALIZED_NAME_DATA_IP_CONTAINS)
  private String dataIpContains;

  public static final String SERIALIZED_NAME_DATA_IP_ENDS_WITH = "data_ip_ends_with";
  @SerializedName(SERIALIZED_NAME_DATA_IP_ENDS_WITH)
  private String dataIpEndsWith;

  public static final String SERIALIZED_NAME_DATA_IP_GT = "data_ip_gt";
  @SerializedName(SERIALIZED_NAME_DATA_IP_GT)
  private String dataIpGt;

  public static final String SERIALIZED_NAME_DATA_IP_GTE = "data_ip_gte";
  @SerializedName(SERIALIZED_NAME_DATA_IP_GTE)
  private String dataIpGte;

  public static final String SERIALIZED_NAME_DATA_IP_IN = "data_ip_in";
  @SerializedName(SERIALIZED_NAME_DATA_IP_IN)
  private List<String> dataIpIn = null;

  public static final String SERIALIZED_NAME_DATA_IP_LT = "data_ip_lt";
  @SerializedName(SERIALIZED_NAME_DATA_IP_LT)
  private String dataIpLt;

  public static final String SERIALIZED_NAME_DATA_IP_LTE = "data_ip_lte";
  @SerializedName(SERIALIZED_NAME_DATA_IP_LTE)
  private String dataIpLte;

  public static final String SERIALIZED_NAME_DATA_IP_NOT = "data_ip_not";
  @SerializedName(SERIALIZED_NAME_DATA_IP_NOT)
  private String dataIpNot;

  public static final String SERIALIZED_NAME_DATA_IP_NOT_CONTAINS = "data_ip_not_contains";
  @SerializedName(SERIALIZED_NAME_DATA_IP_NOT_CONTAINS)
  private String dataIpNotContains;

  public static final String SERIALIZED_NAME_DATA_IP_NOT_ENDS_WITH = "data_ip_not_ends_with";
  @SerializedName(SERIALIZED_NAME_DATA_IP_NOT_ENDS_WITH)
  private String dataIpNotEndsWith;

  public static final String SERIALIZED_NAME_DATA_IP_NOT_IN = "data_ip_not_in";
  @SerializedName(SERIALIZED_NAME_DATA_IP_NOT_IN)
  private List<String> dataIpNotIn = null;

  public static final String SERIALIZED_NAME_DATA_IP_NOT_STARTS_WITH = "data_ip_not_starts_with";
  @SerializedName(SERIALIZED_NAME_DATA_IP_NOT_STARTS_WITH)
  private String dataIpNotStartsWith;

  public static final String SERIALIZED_NAME_DATA_IP_STARTS_WITH = "data_ip_starts_with";
  @SerializedName(SERIALIZED_NAME_DATA_IP_STARTS_WITH)
  private String dataIpStartsWith;

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

  public static final String SERIALIZED_NAME_FAILURE_DATA_SPACE = "failure_data_space";
  @SerializedName(SERIALIZED_NAME_FAILURE_DATA_SPACE)
  private Long failureDataSpace;

  public static final String SERIALIZED_NAME_FAILURE_DATA_SPACE_GT = "failure_data_space_gt";
  @SerializedName(SERIALIZED_NAME_FAILURE_DATA_SPACE_GT)
  private Long failureDataSpaceGt;

  public static final String SERIALIZED_NAME_FAILURE_DATA_SPACE_GTE = "failure_data_space_gte";
  @SerializedName(SERIALIZED_NAME_FAILURE_DATA_SPACE_GTE)
  private Long failureDataSpaceGte;

  public static final String SERIALIZED_NAME_FAILURE_DATA_SPACE_IN = "failure_data_space_in";
  @SerializedName(SERIALIZED_NAME_FAILURE_DATA_SPACE_IN)
  private List<Long> failureDataSpaceIn = null;

  public static final String SERIALIZED_NAME_FAILURE_DATA_SPACE_LT = "failure_data_space_lt";
  @SerializedName(SERIALIZED_NAME_FAILURE_DATA_SPACE_LT)
  private Long failureDataSpaceLt;

  public static final String SERIALIZED_NAME_FAILURE_DATA_SPACE_LTE = "failure_data_space_lte";
  @SerializedName(SERIALIZED_NAME_FAILURE_DATA_SPACE_LTE)
  private Long failureDataSpaceLte;

  public static final String SERIALIZED_NAME_FAILURE_DATA_SPACE_NOT = "failure_data_space_not";
  @SerializedName(SERIALIZED_NAME_FAILURE_DATA_SPACE_NOT)
  private Long failureDataSpaceNot;

  public static final String SERIALIZED_NAME_FAILURE_DATA_SPACE_NOT_IN = "failure_data_space_not_in";
  @SerializedName(SERIALIZED_NAME_FAILURE_DATA_SPACE_NOT_IN)
  private List<Long> failureDataSpaceNotIn = null;

  public static final String SERIALIZED_NAME_GPU_DEVICES_EVERY = "gpu_devices_every";
  @SerializedName(SERIALIZED_NAME_GPU_DEVICES_EVERY)
  private GpuDeviceWhereInput gpuDevicesEvery;

  public static final String SERIALIZED_NAME_GPU_DEVICES_NONE = "gpu_devices_none";
  @SerializedName(SERIALIZED_NAME_GPU_DEVICES_NONE)
  private GpuDeviceWhereInput gpuDevicesNone;

  public static final String SERIALIZED_NAME_GPU_DEVICES_SOME = "gpu_devices_some";
  @SerializedName(SERIALIZED_NAME_GPU_DEVICES_SOME)
  private GpuDeviceWhereInput gpuDevicesSome;

  public static final String SERIALIZED_NAME_HDD_DATA_CAPACITY = "hdd_data_capacity";
  @SerializedName(SERIALIZED_NAME_HDD_DATA_CAPACITY)
  private Long hddDataCapacity;

  public static final String SERIALIZED_NAME_HDD_DATA_CAPACITY_GT = "hdd_data_capacity_gt";
  @SerializedName(SERIALIZED_NAME_HDD_DATA_CAPACITY_GT)
  private Long hddDataCapacityGt;

  public static final String SERIALIZED_NAME_HDD_DATA_CAPACITY_GTE = "hdd_data_capacity_gte";
  @SerializedName(SERIALIZED_NAME_HDD_DATA_CAPACITY_GTE)
  private Long hddDataCapacityGte;

  public static final String SERIALIZED_NAME_HDD_DATA_CAPACITY_IN = "hdd_data_capacity_in";
  @SerializedName(SERIALIZED_NAME_HDD_DATA_CAPACITY_IN)
  private List<Long> hddDataCapacityIn = null;

  public static final String SERIALIZED_NAME_HDD_DATA_CAPACITY_LT = "hdd_data_capacity_lt";
  @SerializedName(SERIALIZED_NAME_HDD_DATA_CAPACITY_LT)
  private Long hddDataCapacityLt;

  public static final String SERIALIZED_NAME_HDD_DATA_CAPACITY_LTE = "hdd_data_capacity_lte";
  @SerializedName(SERIALIZED_NAME_HDD_DATA_CAPACITY_LTE)
  private Long hddDataCapacityLte;

  public static final String SERIALIZED_NAME_HDD_DATA_CAPACITY_NOT = "hdd_data_capacity_not";
  @SerializedName(SERIALIZED_NAME_HDD_DATA_CAPACITY_NOT)
  private Long hddDataCapacityNot;

  public static final String SERIALIZED_NAME_HDD_DATA_CAPACITY_NOT_IN = "hdd_data_capacity_not_in";
  @SerializedName(SERIALIZED_NAME_HDD_DATA_CAPACITY_NOT_IN)
  private List<Long> hddDataCapacityNotIn = null;

  public static final String SERIALIZED_NAME_HDD_DISK_COUNT = "hdd_disk_count";
  @SerializedName(SERIALIZED_NAME_HDD_DISK_COUNT)
  private Integer hddDiskCount;

  public static final String SERIALIZED_NAME_HDD_DISK_COUNT_GT = "hdd_disk_count_gt";
  @SerializedName(SERIALIZED_NAME_HDD_DISK_COUNT_GT)
  private Integer hddDiskCountGt;

  public static final String SERIALIZED_NAME_HDD_DISK_COUNT_GTE = "hdd_disk_count_gte";
  @SerializedName(SERIALIZED_NAME_HDD_DISK_COUNT_GTE)
  private Integer hddDiskCountGte;

  public static final String SERIALIZED_NAME_HDD_DISK_COUNT_IN = "hdd_disk_count_in";
  @SerializedName(SERIALIZED_NAME_HDD_DISK_COUNT_IN)
  private List<Integer> hddDiskCountIn = null;

  public static final String SERIALIZED_NAME_HDD_DISK_COUNT_LT = "hdd_disk_count_lt";
  @SerializedName(SERIALIZED_NAME_HDD_DISK_COUNT_LT)
  private Integer hddDiskCountLt;

  public static final String SERIALIZED_NAME_HDD_DISK_COUNT_LTE = "hdd_disk_count_lte";
  @SerializedName(SERIALIZED_NAME_HDD_DISK_COUNT_LTE)
  private Integer hddDiskCountLte;

  public static final String SERIALIZED_NAME_HDD_DISK_COUNT_NOT = "hdd_disk_count_not";
  @SerializedName(SERIALIZED_NAME_HDD_DISK_COUNT_NOT)
  private Integer hddDiskCountNot;

  public static final String SERIALIZED_NAME_HDD_DISK_COUNT_NOT_IN = "hdd_disk_count_not_in";
  @SerializedName(SERIALIZED_NAME_HDD_DISK_COUNT_NOT_IN)
  private List<Integer> hddDiskCountNotIn = null;

  public static final String SERIALIZED_NAME_HYPERVISOR_IP = "hypervisor_ip";
  @SerializedName(SERIALIZED_NAME_HYPERVISOR_IP)
  private String hypervisorIp;

  public static final String SERIALIZED_NAME_HYPERVISOR_IP_CONTAINS = "hypervisor_ip_contains";
  @SerializedName(SERIALIZED_NAME_HYPERVISOR_IP_CONTAINS)
  private String hypervisorIpContains;

  public static final String SERIALIZED_NAME_HYPERVISOR_IP_ENDS_WITH = "hypervisor_ip_ends_with";
  @SerializedName(SERIALIZED_NAME_HYPERVISOR_IP_ENDS_WITH)
  private String hypervisorIpEndsWith;

  public static final String SERIALIZED_NAME_HYPERVISOR_IP_GT = "hypervisor_ip_gt";
  @SerializedName(SERIALIZED_NAME_HYPERVISOR_IP_GT)
  private String hypervisorIpGt;

  public static final String SERIALIZED_NAME_HYPERVISOR_IP_GTE = "hypervisor_ip_gte";
  @SerializedName(SERIALIZED_NAME_HYPERVISOR_IP_GTE)
  private String hypervisorIpGte;

  public static final String SERIALIZED_NAME_HYPERVISOR_IP_IN = "hypervisor_ip_in";
  @SerializedName(SERIALIZED_NAME_HYPERVISOR_IP_IN)
  private List<String> hypervisorIpIn = null;

  public static final String SERIALIZED_NAME_HYPERVISOR_IP_LT = "hypervisor_ip_lt";
  @SerializedName(SERIALIZED_NAME_HYPERVISOR_IP_LT)
  private String hypervisorIpLt;

  public static final String SERIALIZED_NAME_HYPERVISOR_IP_LTE = "hypervisor_ip_lte";
  @SerializedName(SERIALIZED_NAME_HYPERVISOR_IP_LTE)
  private String hypervisorIpLte;

  public static final String SERIALIZED_NAME_HYPERVISOR_IP_NOT = "hypervisor_ip_not";
  @SerializedName(SERIALIZED_NAME_HYPERVISOR_IP_NOT)
  private String hypervisorIpNot;

  public static final String SERIALIZED_NAME_HYPERVISOR_IP_NOT_CONTAINS = "hypervisor_ip_not_contains";
  @SerializedName(SERIALIZED_NAME_HYPERVISOR_IP_NOT_CONTAINS)
  private String hypervisorIpNotContains;

  public static final String SERIALIZED_NAME_HYPERVISOR_IP_NOT_ENDS_WITH = "hypervisor_ip_not_ends_with";
  @SerializedName(SERIALIZED_NAME_HYPERVISOR_IP_NOT_ENDS_WITH)
  private String hypervisorIpNotEndsWith;

  public static final String SERIALIZED_NAME_HYPERVISOR_IP_NOT_IN = "hypervisor_ip_not_in";
  @SerializedName(SERIALIZED_NAME_HYPERVISOR_IP_NOT_IN)
  private List<String> hypervisorIpNotIn = null;

  public static final String SERIALIZED_NAME_HYPERVISOR_IP_NOT_STARTS_WITH = "hypervisor_ip_not_starts_with";
  @SerializedName(SERIALIZED_NAME_HYPERVISOR_IP_NOT_STARTS_WITH)
  private String hypervisorIpNotStartsWith;

  public static final String SERIALIZED_NAME_HYPERVISOR_IP_STARTS_WITH = "hypervisor_ip_starts_with";
  @SerializedName(SERIALIZED_NAME_HYPERVISOR_IP_STARTS_WITH)
  private String hypervisorIpStartsWith;

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

  public static final String SERIALIZED_NAME_IOMMU = "iommu";
  @SerializedName(SERIALIZED_NAME_IOMMU)
  private IommuStatus iommu;

  public static final String SERIALIZED_NAME_IOMMU_IN = "iommu_in";
  @SerializedName(SERIALIZED_NAME_IOMMU_IN)
  private List<IommuStatus> iommuIn = null;

  public static final String SERIALIZED_NAME_IOMMU_NOT = "iommu_not";
  @SerializedName(SERIALIZED_NAME_IOMMU_NOT)
  private IommuStatus iommuNot;

  public static final String SERIALIZED_NAME_IOMMU_NOT_IN = "iommu_not_in";
  @SerializedName(SERIALIZED_NAME_IOMMU_NOT_IN)
  private List<IommuStatus> iommuNotIn = null;

  public static final String SERIALIZED_NAME_IS_OS_IN_RAID1 = "is_os_in_raid1";
  @SerializedName(SERIALIZED_NAME_IS_OS_IN_RAID1)
  private Boolean isOsInRaid1;

  public static final String SERIALIZED_NAME_IS_OS_IN_RAID1_NOT = "is_os_in_raid1_not";
  @SerializedName(SERIALIZED_NAME_IS_OS_IN_RAID1_NOT)
  private Boolean isOsInRaid1Not;

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

  public static final String SERIALIZED_NAME_LSM_CAP_DISK_SAFE_UMOUNT = "lsm_cap_disk_safe_umount";
  @SerializedName(SERIALIZED_NAME_LSM_CAP_DISK_SAFE_UMOUNT)
  private Boolean lsmCapDiskSafeUmount;

  public static final String SERIALIZED_NAME_LSM_CAP_DISK_SAFE_UMOUNT_NOT = "lsm_cap_disk_safe_umount_not";
  @SerializedName(SERIALIZED_NAME_LSM_CAP_DISK_SAFE_UMOUNT_NOT)
  private Boolean lsmCapDiskSafeUmountNot;

  public static final String SERIALIZED_NAME_MANAGEMENT_IP = "management_ip";
  @SerializedName(SERIALIZED_NAME_MANAGEMENT_IP)
  private String managementIp;

  public static final String SERIALIZED_NAME_MANAGEMENT_IP_CONTAINS = "management_ip_contains";
  @SerializedName(SERIALIZED_NAME_MANAGEMENT_IP_CONTAINS)
  private String managementIpContains;

  public static final String SERIALIZED_NAME_MANAGEMENT_IP_ENDS_WITH = "management_ip_ends_with";
  @SerializedName(SERIALIZED_NAME_MANAGEMENT_IP_ENDS_WITH)
  private String managementIpEndsWith;

  public static final String SERIALIZED_NAME_MANAGEMENT_IP_GT = "management_ip_gt";
  @SerializedName(SERIALIZED_NAME_MANAGEMENT_IP_GT)
  private String managementIpGt;

  public static final String SERIALIZED_NAME_MANAGEMENT_IP_GTE = "management_ip_gte";
  @SerializedName(SERIALIZED_NAME_MANAGEMENT_IP_GTE)
  private String managementIpGte;

  public static final String SERIALIZED_NAME_MANAGEMENT_IP_IN = "management_ip_in";
  @SerializedName(SERIALIZED_NAME_MANAGEMENT_IP_IN)
  private List<String> managementIpIn = null;

  public static final String SERIALIZED_NAME_MANAGEMENT_IP_LT = "management_ip_lt";
  @SerializedName(SERIALIZED_NAME_MANAGEMENT_IP_LT)
  private String managementIpLt;

  public static final String SERIALIZED_NAME_MANAGEMENT_IP_LTE = "management_ip_lte";
  @SerializedName(SERIALIZED_NAME_MANAGEMENT_IP_LTE)
  private String managementIpLte;

  public static final String SERIALIZED_NAME_MANAGEMENT_IP_NOT = "management_ip_not";
  @SerializedName(SERIALIZED_NAME_MANAGEMENT_IP_NOT)
  private String managementIpNot;

  public static final String SERIALIZED_NAME_MANAGEMENT_IP_NOT_CONTAINS = "management_ip_not_contains";
  @SerializedName(SERIALIZED_NAME_MANAGEMENT_IP_NOT_CONTAINS)
  private String managementIpNotContains;

  public static final String SERIALIZED_NAME_MANAGEMENT_IP_NOT_ENDS_WITH = "management_ip_not_ends_with";
  @SerializedName(SERIALIZED_NAME_MANAGEMENT_IP_NOT_ENDS_WITH)
  private String managementIpNotEndsWith;

  public static final String SERIALIZED_NAME_MANAGEMENT_IP_NOT_IN = "management_ip_not_in";
  @SerializedName(SERIALIZED_NAME_MANAGEMENT_IP_NOT_IN)
  private List<String> managementIpNotIn = null;

  public static final String SERIALIZED_NAME_MANAGEMENT_IP_NOT_STARTS_WITH = "management_ip_not_starts_with";
  @SerializedName(SERIALIZED_NAME_MANAGEMENT_IP_NOT_STARTS_WITH)
  private String managementIpNotStartsWith;

  public static final String SERIALIZED_NAME_MANAGEMENT_IP_STARTS_WITH = "management_ip_starts_with";
  @SerializedName(SERIALIZED_NAME_MANAGEMENT_IP_STARTS_WITH)
  private String managementIpStartsWith;

  public static final String SERIALIZED_NAME_MODEL = "model";
  @SerializedName(SERIALIZED_NAME_MODEL)
  private String model;

  public static final String SERIALIZED_NAME_MODEL_CONTAINS = "model_contains";
  @SerializedName(SERIALIZED_NAME_MODEL_CONTAINS)
  private String modelContains;

  public static final String SERIALIZED_NAME_MODEL_ENDS_WITH = "model_ends_with";
  @SerializedName(SERIALIZED_NAME_MODEL_ENDS_WITH)
  private String modelEndsWith;

  public static final String SERIALIZED_NAME_MODEL_GT = "model_gt";
  @SerializedName(SERIALIZED_NAME_MODEL_GT)
  private String modelGt;

  public static final String SERIALIZED_NAME_MODEL_GTE = "model_gte";
  @SerializedName(SERIALIZED_NAME_MODEL_GTE)
  private String modelGte;

  public static final String SERIALIZED_NAME_MODEL_IN = "model_in";
  @SerializedName(SERIALIZED_NAME_MODEL_IN)
  private List<String> modelIn = null;

  public static final String SERIALIZED_NAME_MODEL_LT = "model_lt";
  @SerializedName(SERIALIZED_NAME_MODEL_LT)
  private String modelLt;

  public static final String SERIALIZED_NAME_MODEL_LTE = "model_lte";
  @SerializedName(SERIALIZED_NAME_MODEL_LTE)
  private String modelLte;

  public static final String SERIALIZED_NAME_MODEL_NOT = "model_not";
  @SerializedName(SERIALIZED_NAME_MODEL_NOT)
  private String modelNot;

  public static final String SERIALIZED_NAME_MODEL_NOT_CONTAINS = "model_not_contains";
  @SerializedName(SERIALIZED_NAME_MODEL_NOT_CONTAINS)
  private String modelNotContains;

  public static final String SERIALIZED_NAME_MODEL_NOT_ENDS_WITH = "model_not_ends_with";
  @SerializedName(SERIALIZED_NAME_MODEL_NOT_ENDS_WITH)
  private String modelNotEndsWith;

  public static final String SERIALIZED_NAME_MODEL_NOT_IN = "model_not_in";
  @SerializedName(SERIALIZED_NAME_MODEL_NOT_IN)
  private List<String> modelNotIn = null;

  public static final String SERIALIZED_NAME_MODEL_NOT_STARTS_WITH = "model_not_starts_with";
  @SerializedName(SERIALIZED_NAME_MODEL_NOT_STARTS_WITH)
  private String modelNotStartsWith;

  public static final String SERIALIZED_NAME_MODEL_STARTS_WITH = "model_starts_with";
  @SerializedName(SERIALIZED_NAME_MODEL_STARTS_WITH)
  private String modelStartsWith;

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

  public static final String SERIALIZED_NAME_NIC_COUNT = "nic_count";
  @SerializedName(SERIALIZED_NAME_NIC_COUNT)
  private Integer nicCount;

  public static final String SERIALIZED_NAME_NIC_COUNT_GT = "nic_count_gt";
  @SerializedName(SERIALIZED_NAME_NIC_COUNT_GT)
  private Integer nicCountGt;

  public static final String SERIALIZED_NAME_NIC_COUNT_GTE = "nic_count_gte";
  @SerializedName(SERIALIZED_NAME_NIC_COUNT_GTE)
  private Integer nicCountGte;

  public static final String SERIALIZED_NAME_NIC_COUNT_IN = "nic_count_in";
  @SerializedName(SERIALIZED_NAME_NIC_COUNT_IN)
  private List<Integer> nicCountIn = null;

  public static final String SERIALIZED_NAME_NIC_COUNT_LT = "nic_count_lt";
  @SerializedName(SERIALIZED_NAME_NIC_COUNT_LT)
  private Integer nicCountLt;

  public static final String SERIALIZED_NAME_NIC_COUNT_LTE = "nic_count_lte";
  @SerializedName(SERIALIZED_NAME_NIC_COUNT_LTE)
  private Integer nicCountLte;

  public static final String SERIALIZED_NAME_NIC_COUNT_NOT = "nic_count_not";
  @SerializedName(SERIALIZED_NAME_NIC_COUNT_NOT)
  private Integer nicCountNot;

  public static final String SERIALIZED_NAME_NIC_COUNT_NOT_IN = "nic_count_not_in";
  @SerializedName(SERIALIZED_NAME_NIC_COUNT_NOT_IN)
  private List<Integer> nicCountNotIn = null;

  public static final String SERIALIZED_NAME_NICS_EVERY = "nics_every";
  @SerializedName(SERIALIZED_NAME_NICS_EVERY)
  private NicWhereInput nicsEvery;

  public static final String SERIALIZED_NAME_NICS_NONE = "nics_none";
  @SerializedName(SERIALIZED_NAME_NICS_NONE)
  private NicWhereInput nicsNone;

  public static final String SERIALIZED_NAME_NICS_SOME = "nics_some";
  @SerializedName(SERIALIZED_NAME_NICS_SOME)
  private NicWhereInput nicsSome;

  public static final String SERIALIZED_NAME_NODE_TOPO_LOCAL_ID = "node_topo_local_id";
  @SerializedName(SERIALIZED_NAME_NODE_TOPO_LOCAL_ID)
  private String nodeTopoLocalId;

  public static final String SERIALIZED_NAME_NODE_TOPO_LOCAL_ID_CONTAINS = "node_topo_local_id_contains";
  @SerializedName(SERIALIZED_NAME_NODE_TOPO_LOCAL_ID_CONTAINS)
  private String nodeTopoLocalIdContains;

  public static final String SERIALIZED_NAME_NODE_TOPO_LOCAL_ID_ENDS_WITH = "node_topo_local_id_ends_with";
  @SerializedName(SERIALIZED_NAME_NODE_TOPO_LOCAL_ID_ENDS_WITH)
  private String nodeTopoLocalIdEndsWith;

  public static final String SERIALIZED_NAME_NODE_TOPO_LOCAL_ID_GT = "node_topo_local_id_gt";
  @SerializedName(SERIALIZED_NAME_NODE_TOPO_LOCAL_ID_GT)
  private String nodeTopoLocalIdGt;

  public static final String SERIALIZED_NAME_NODE_TOPO_LOCAL_ID_GTE = "node_topo_local_id_gte";
  @SerializedName(SERIALIZED_NAME_NODE_TOPO_LOCAL_ID_GTE)
  private String nodeTopoLocalIdGte;

  public static final String SERIALIZED_NAME_NODE_TOPO_LOCAL_ID_IN = "node_topo_local_id_in";
  @SerializedName(SERIALIZED_NAME_NODE_TOPO_LOCAL_ID_IN)
  private List<String> nodeTopoLocalIdIn = null;

  public static final String SERIALIZED_NAME_NODE_TOPO_LOCAL_ID_LT = "node_topo_local_id_lt";
  @SerializedName(SERIALIZED_NAME_NODE_TOPO_LOCAL_ID_LT)
  private String nodeTopoLocalIdLt;

  public static final String SERIALIZED_NAME_NODE_TOPO_LOCAL_ID_LTE = "node_topo_local_id_lte";
  @SerializedName(SERIALIZED_NAME_NODE_TOPO_LOCAL_ID_LTE)
  private String nodeTopoLocalIdLte;

  public static final String SERIALIZED_NAME_NODE_TOPO_LOCAL_ID_NOT = "node_topo_local_id_not";
  @SerializedName(SERIALIZED_NAME_NODE_TOPO_LOCAL_ID_NOT)
  private String nodeTopoLocalIdNot;

  public static final String SERIALIZED_NAME_NODE_TOPO_LOCAL_ID_NOT_CONTAINS = "node_topo_local_id_not_contains";
  @SerializedName(SERIALIZED_NAME_NODE_TOPO_LOCAL_ID_NOT_CONTAINS)
  private String nodeTopoLocalIdNotContains;

  public static final String SERIALIZED_NAME_NODE_TOPO_LOCAL_ID_NOT_ENDS_WITH = "node_topo_local_id_not_ends_with";
  @SerializedName(SERIALIZED_NAME_NODE_TOPO_LOCAL_ID_NOT_ENDS_WITH)
  private String nodeTopoLocalIdNotEndsWith;

  public static final String SERIALIZED_NAME_NODE_TOPO_LOCAL_ID_NOT_IN = "node_topo_local_id_not_in";
  @SerializedName(SERIALIZED_NAME_NODE_TOPO_LOCAL_ID_NOT_IN)
  private List<String> nodeTopoLocalIdNotIn = null;

  public static final String SERIALIZED_NAME_NODE_TOPO_LOCAL_ID_NOT_STARTS_WITH = "node_topo_local_id_not_starts_with";
  @SerializedName(SERIALIZED_NAME_NODE_TOPO_LOCAL_ID_NOT_STARTS_WITH)
  private String nodeTopoLocalIdNotStartsWith;

  public static final String SERIALIZED_NAME_NODE_TOPO_LOCAL_ID_STARTS_WITH = "node_topo_local_id_starts_with";
  @SerializedName(SERIALIZED_NAME_NODE_TOPO_LOCAL_ID_STARTS_WITH)
  private String nodeTopoLocalIdStartsWith;

  public static final String SERIALIZED_NAME_OS_MEMORY_BYTES = "os_memory_bytes";
  @SerializedName(SERIALIZED_NAME_OS_MEMORY_BYTES)
  private Long osMemoryBytes;

  public static final String SERIALIZED_NAME_OS_MEMORY_BYTES_GT = "os_memory_bytes_gt";
  @SerializedName(SERIALIZED_NAME_OS_MEMORY_BYTES_GT)
  private Long osMemoryBytesGt;

  public static final String SERIALIZED_NAME_OS_MEMORY_BYTES_GTE = "os_memory_bytes_gte";
  @SerializedName(SERIALIZED_NAME_OS_MEMORY_BYTES_GTE)
  private Long osMemoryBytesGte;

  public static final String SERIALIZED_NAME_OS_MEMORY_BYTES_IN = "os_memory_bytes_in";
  @SerializedName(SERIALIZED_NAME_OS_MEMORY_BYTES_IN)
  private List<Long> osMemoryBytesIn = null;

  public static final String SERIALIZED_NAME_OS_MEMORY_BYTES_LT = "os_memory_bytes_lt";
  @SerializedName(SERIALIZED_NAME_OS_MEMORY_BYTES_LT)
  private Long osMemoryBytesLt;

  public static final String SERIALIZED_NAME_OS_MEMORY_BYTES_LTE = "os_memory_bytes_lte";
  @SerializedName(SERIALIZED_NAME_OS_MEMORY_BYTES_LTE)
  private Long osMemoryBytesLte;

  public static final String SERIALIZED_NAME_OS_MEMORY_BYTES_NOT = "os_memory_bytes_not";
  @SerializedName(SERIALIZED_NAME_OS_MEMORY_BYTES_NOT)
  private Long osMemoryBytesNot;

  public static final String SERIALIZED_NAME_OS_MEMORY_BYTES_NOT_IN = "os_memory_bytes_not_in";
  @SerializedName(SERIALIZED_NAME_OS_MEMORY_BYTES_NOT_IN)
  private List<Long> osMemoryBytesNotIn = null;

  public static final String SERIALIZED_NAME_OS_VERSION = "os_version";
  @SerializedName(SERIALIZED_NAME_OS_VERSION)
  private String osVersion;

  public static final String SERIALIZED_NAME_OS_VERSION_CONTAINS = "os_version_contains";
  @SerializedName(SERIALIZED_NAME_OS_VERSION_CONTAINS)
  private String osVersionContains;

  public static final String SERIALIZED_NAME_OS_VERSION_ENDS_WITH = "os_version_ends_with";
  @SerializedName(SERIALIZED_NAME_OS_VERSION_ENDS_WITH)
  private String osVersionEndsWith;

  public static final String SERIALIZED_NAME_OS_VERSION_GT = "os_version_gt";
  @SerializedName(SERIALIZED_NAME_OS_VERSION_GT)
  private String osVersionGt;

  public static final String SERIALIZED_NAME_OS_VERSION_GTE = "os_version_gte";
  @SerializedName(SERIALIZED_NAME_OS_VERSION_GTE)
  private String osVersionGte;

  public static final String SERIALIZED_NAME_OS_VERSION_IN = "os_version_in";
  @SerializedName(SERIALIZED_NAME_OS_VERSION_IN)
  private List<String> osVersionIn = null;

  public static final String SERIALIZED_NAME_OS_VERSION_LT = "os_version_lt";
  @SerializedName(SERIALIZED_NAME_OS_VERSION_LT)
  private String osVersionLt;

  public static final String SERIALIZED_NAME_OS_VERSION_LTE = "os_version_lte";
  @SerializedName(SERIALIZED_NAME_OS_VERSION_LTE)
  private String osVersionLte;

  public static final String SERIALIZED_NAME_OS_VERSION_NOT = "os_version_not";
  @SerializedName(SERIALIZED_NAME_OS_VERSION_NOT)
  private String osVersionNot;

  public static final String SERIALIZED_NAME_OS_VERSION_NOT_CONTAINS = "os_version_not_contains";
  @SerializedName(SERIALIZED_NAME_OS_VERSION_NOT_CONTAINS)
  private String osVersionNotContains;

  public static final String SERIALIZED_NAME_OS_VERSION_NOT_ENDS_WITH = "os_version_not_ends_with";
  @SerializedName(SERIALIZED_NAME_OS_VERSION_NOT_ENDS_WITH)
  private String osVersionNotEndsWith;

  public static final String SERIALIZED_NAME_OS_VERSION_NOT_IN = "os_version_not_in";
  @SerializedName(SERIALIZED_NAME_OS_VERSION_NOT_IN)
  private List<String> osVersionNotIn = null;

  public static final String SERIALIZED_NAME_OS_VERSION_NOT_STARTS_WITH = "os_version_not_starts_with";
  @SerializedName(SERIALIZED_NAME_OS_VERSION_NOT_STARTS_WITH)
  private String osVersionNotStartsWith;

  public static final String SERIALIZED_NAME_OS_VERSION_STARTS_WITH = "os_version_starts_with";
  @SerializedName(SERIALIZED_NAME_OS_VERSION_STARTS_WITH)
  private String osVersionStartsWith;

  public static final String SERIALIZED_NAME_PMEM_DIMM_CAPACITY = "pmem_dimm_capacity";
  @SerializedName(SERIALIZED_NAME_PMEM_DIMM_CAPACITY)
  private Long pmemDimmCapacity;

  public static final String SERIALIZED_NAME_PMEM_DIMM_CAPACITY_GT = "pmem_dimm_capacity_gt";
  @SerializedName(SERIALIZED_NAME_PMEM_DIMM_CAPACITY_GT)
  private Long pmemDimmCapacityGt;

  public static final String SERIALIZED_NAME_PMEM_DIMM_CAPACITY_GTE = "pmem_dimm_capacity_gte";
  @SerializedName(SERIALIZED_NAME_PMEM_DIMM_CAPACITY_GTE)
  private Long pmemDimmCapacityGte;

  public static final String SERIALIZED_NAME_PMEM_DIMM_CAPACITY_IN = "pmem_dimm_capacity_in";
  @SerializedName(SERIALIZED_NAME_PMEM_DIMM_CAPACITY_IN)
  private List<Long> pmemDimmCapacityIn = null;

  public static final String SERIALIZED_NAME_PMEM_DIMM_CAPACITY_LT = "pmem_dimm_capacity_lt";
  @SerializedName(SERIALIZED_NAME_PMEM_DIMM_CAPACITY_LT)
  private Long pmemDimmCapacityLt;

  public static final String SERIALIZED_NAME_PMEM_DIMM_CAPACITY_LTE = "pmem_dimm_capacity_lte";
  @SerializedName(SERIALIZED_NAME_PMEM_DIMM_CAPACITY_LTE)
  private Long pmemDimmCapacityLte;

  public static final String SERIALIZED_NAME_PMEM_DIMM_CAPACITY_NOT = "pmem_dimm_capacity_not";
  @SerializedName(SERIALIZED_NAME_PMEM_DIMM_CAPACITY_NOT)
  private Long pmemDimmCapacityNot;

  public static final String SERIALIZED_NAME_PMEM_DIMM_CAPACITY_NOT_IN = "pmem_dimm_capacity_not_in";
  @SerializedName(SERIALIZED_NAME_PMEM_DIMM_CAPACITY_NOT_IN)
  private List<Long> pmemDimmCapacityNotIn = null;

  public static final String SERIALIZED_NAME_PMEM_DIMM_COUNT = "pmem_dimm_count";
  @SerializedName(SERIALIZED_NAME_PMEM_DIMM_COUNT)
  private Integer pmemDimmCount;

  public static final String SERIALIZED_NAME_PMEM_DIMM_COUNT_GT = "pmem_dimm_count_gt";
  @SerializedName(SERIALIZED_NAME_PMEM_DIMM_COUNT_GT)
  private Integer pmemDimmCountGt;

  public static final String SERIALIZED_NAME_PMEM_DIMM_COUNT_GTE = "pmem_dimm_count_gte";
  @SerializedName(SERIALIZED_NAME_PMEM_DIMM_COUNT_GTE)
  private Integer pmemDimmCountGte;

  public static final String SERIALIZED_NAME_PMEM_DIMM_COUNT_IN = "pmem_dimm_count_in";
  @SerializedName(SERIALIZED_NAME_PMEM_DIMM_COUNT_IN)
  private List<Integer> pmemDimmCountIn = null;

  public static final String SERIALIZED_NAME_PMEM_DIMM_COUNT_LT = "pmem_dimm_count_lt";
  @SerializedName(SERIALIZED_NAME_PMEM_DIMM_COUNT_LT)
  private Integer pmemDimmCountLt;

  public static final String SERIALIZED_NAME_PMEM_DIMM_COUNT_LTE = "pmem_dimm_count_lte";
  @SerializedName(SERIALIZED_NAME_PMEM_DIMM_COUNT_LTE)
  private Integer pmemDimmCountLte;

  public static final String SERIALIZED_NAME_PMEM_DIMM_COUNT_NOT = "pmem_dimm_count_not";
  @SerializedName(SERIALIZED_NAME_PMEM_DIMM_COUNT_NOT)
  private Integer pmemDimmCountNot;

  public static final String SERIALIZED_NAME_PMEM_DIMM_COUNT_NOT_IN = "pmem_dimm_count_not_in";
  @SerializedName(SERIALIZED_NAME_PMEM_DIMM_COUNT_NOT_IN)
  private List<Integer> pmemDimmCountNotIn = null;

  public static final String SERIALIZED_NAME_PMEM_DISK_COUNT = "pmem_disk_count";
  @SerializedName(SERIALIZED_NAME_PMEM_DISK_COUNT)
  private Integer pmemDiskCount;

  public static final String SERIALIZED_NAME_PMEM_DISK_COUNT_GT = "pmem_disk_count_gt";
  @SerializedName(SERIALIZED_NAME_PMEM_DISK_COUNT_GT)
  private Integer pmemDiskCountGt;

  public static final String SERIALIZED_NAME_PMEM_DISK_COUNT_GTE = "pmem_disk_count_gte";
  @SerializedName(SERIALIZED_NAME_PMEM_DISK_COUNT_GTE)
  private Integer pmemDiskCountGte;

  public static final String SERIALIZED_NAME_PMEM_DISK_COUNT_IN = "pmem_disk_count_in";
  @SerializedName(SERIALIZED_NAME_PMEM_DISK_COUNT_IN)
  private List<Integer> pmemDiskCountIn = null;

  public static final String SERIALIZED_NAME_PMEM_DISK_COUNT_LT = "pmem_disk_count_lt";
  @SerializedName(SERIALIZED_NAME_PMEM_DISK_COUNT_LT)
  private Integer pmemDiskCountLt;

  public static final String SERIALIZED_NAME_PMEM_DISK_COUNT_LTE = "pmem_disk_count_lte";
  @SerializedName(SERIALIZED_NAME_PMEM_DISK_COUNT_LTE)
  private Integer pmemDiskCountLte;

  public static final String SERIALIZED_NAME_PMEM_DISK_COUNT_NOT = "pmem_disk_count_not";
  @SerializedName(SERIALIZED_NAME_PMEM_DISK_COUNT_NOT)
  private Integer pmemDiskCountNot;

  public static final String SERIALIZED_NAME_PMEM_DISK_COUNT_NOT_IN = "pmem_disk_count_not_in";
  @SerializedName(SERIALIZED_NAME_PMEM_DISK_COUNT_NOT_IN)
  private List<Integer> pmemDiskCountNotIn = null;

  public static final String SERIALIZED_NAME_PROVISIONED_CPU_CORES = "provisioned_cpu_cores";
  @SerializedName(SERIALIZED_NAME_PROVISIONED_CPU_CORES)
  private Integer provisionedCpuCores;

  public static final String SERIALIZED_NAME_PROVISIONED_CPU_CORES_GT = "provisioned_cpu_cores_gt";
  @SerializedName(SERIALIZED_NAME_PROVISIONED_CPU_CORES_GT)
  private Integer provisionedCpuCoresGt;

  public static final String SERIALIZED_NAME_PROVISIONED_CPU_CORES_GTE = "provisioned_cpu_cores_gte";
  @SerializedName(SERIALIZED_NAME_PROVISIONED_CPU_CORES_GTE)
  private Integer provisionedCpuCoresGte;

  public static final String SERIALIZED_NAME_PROVISIONED_CPU_CORES_IN = "provisioned_cpu_cores_in";
  @SerializedName(SERIALIZED_NAME_PROVISIONED_CPU_CORES_IN)
  private List<Integer> provisionedCpuCoresIn = null;

  public static final String SERIALIZED_NAME_PROVISIONED_CPU_CORES_LT = "provisioned_cpu_cores_lt";
  @SerializedName(SERIALIZED_NAME_PROVISIONED_CPU_CORES_LT)
  private Integer provisionedCpuCoresLt;

  public static final String SERIALIZED_NAME_PROVISIONED_CPU_CORES_LTE = "provisioned_cpu_cores_lte";
  @SerializedName(SERIALIZED_NAME_PROVISIONED_CPU_CORES_LTE)
  private Integer provisionedCpuCoresLte;

  public static final String SERIALIZED_NAME_PROVISIONED_CPU_CORES_NOT = "provisioned_cpu_cores_not";
  @SerializedName(SERIALIZED_NAME_PROVISIONED_CPU_CORES_NOT)
  private Integer provisionedCpuCoresNot;

  public static final String SERIALIZED_NAME_PROVISIONED_CPU_CORES_NOT_IN = "provisioned_cpu_cores_not_in";
  @SerializedName(SERIALIZED_NAME_PROVISIONED_CPU_CORES_NOT_IN)
  private List<Integer> provisionedCpuCoresNotIn = null;

  public static final String SERIALIZED_NAME_PROVISIONED_MEMORY_BYTES = "provisioned_memory_bytes";
  @SerializedName(SERIALIZED_NAME_PROVISIONED_MEMORY_BYTES)
  private Long provisionedMemoryBytes;

  public static final String SERIALIZED_NAME_PROVISIONED_MEMORY_BYTES_GT = "provisioned_memory_bytes_gt";
  @SerializedName(SERIALIZED_NAME_PROVISIONED_MEMORY_BYTES_GT)
  private Long provisionedMemoryBytesGt;

  public static final String SERIALIZED_NAME_PROVISIONED_MEMORY_BYTES_GTE = "provisioned_memory_bytes_gte";
  @SerializedName(SERIALIZED_NAME_PROVISIONED_MEMORY_BYTES_GTE)
  private Long provisionedMemoryBytesGte;

  public static final String SERIALIZED_NAME_PROVISIONED_MEMORY_BYTES_IN = "provisioned_memory_bytes_in";
  @SerializedName(SERIALIZED_NAME_PROVISIONED_MEMORY_BYTES_IN)
  private List<Long> provisionedMemoryBytesIn = null;

  public static final String SERIALIZED_NAME_PROVISIONED_MEMORY_BYTES_LT = "provisioned_memory_bytes_lt";
  @SerializedName(SERIALIZED_NAME_PROVISIONED_MEMORY_BYTES_LT)
  private Long provisionedMemoryBytesLt;

  public static final String SERIALIZED_NAME_PROVISIONED_MEMORY_BYTES_LTE = "provisioned_memory_bytes_lte";
  @SerializedName(SERIALIZED_NAME_PROVISIONED_MEMORY_BYTES_LTE)
  private Long provisionedMemoryBytesLte;

  public static final String SERIALIZED_NAME_PROVISIONED_MEMORY_BYTES_NOT = "provisioned_memory_bytes_not";
  @SerializedName(SERIALIZED_NAME_PROVISIONED_MEMORY_BYTES_NOT)
  private Long provisionedMemoryBytesNot;

  public static final String SERIALIZED_NAME_PROVISIONED_MEMORY_BYTES_NOT_IN = "provisioned_memory_bytes_not_in";
  @SerializedName(SERIALIZED_NAME_PROVISIONED_MEMORY_BYTES_NOT_IN)
  private List<Long> provisionedMemoryBytesNotIn = null;

  public static final String SERIALIZED_NAME_RUNNING_PAUSE_VM_MEMORY_BYTES = "running_pause_vm_memory_bytes";
  @SerializedName(SERIALIZED_NAME_RUNNING_PAUSE_VM_MEMORY_BYTES)
  private Long runningPauseVmMemoryBytes;

  public static final String SERIALIZED_NAME_RUNNING_PAUSE_VM_MEMORY_BYTES_GT = "running_pause_vm_memory_bytes_gt";
  @SerializedName(SERIALIZED_NAME_RUNNING_PAUSE_VM_MEMORY_BYTES_GT)
  private Long runningPauseVmMemoryBytesGt;

  public static final String SERIALIZED_NAME_RUNNING_PAUSE_VM_MEMORY_BYTES_GTE = "running_pause_vm_memory_bytes_gte";
  @SerializedName(SERIALIZED_NAME_RUNNING_PAUSE_VM_MEMORY_BYTES_GTE)
  private Long runningPauseVmMemoryBytesGte;

  public static final String SERIALIZED_NAME_RUNNING_PAUSE_VM_MEMORY_BYTES_IN = "running_pause_vm_memory_bytes_in";
  @SerializedName(SERIALIZED_NAME_RUNNING_PAUSE_VM_MEMORY_BYTES_IN)
  private List<Long> runningPauseVmMemoryBytesIn = null;

  public static final String SERIALIZED_NAME_RUNNING_PAUSE_VM_MEMORY_BYTES_LT = "running_pause_vm_memory_bytes_lt";
  @SerializedName(SERIALIZED_NAME_RUNNING_PAUSE_VM_MEMORY_BYTES_LT)
  private Long runningPauseVmMemoryBytesLt;

  public static final String SERIALIZED_NAME_RUNNING_PAUSE_VM_MEMORY_BYTES_LTE = "running_pause_vm_memory_bytes_lte";
  @SerializedName(SERIALIZED_NAME_RUNNING_PAUSE_VM_MEMORY_BYTES_LTE)
  private Long runningPauseVmMemoryBytesLte;

  public static final String SERIALIZED_NAME_RUNNING_PAUSE_VM_MEMORY_BYTES_NOT = "running_pause_vm_memory_bytes_not";
  @SerializedName(SERIALIZED_NAME_RUNNING_PAUSE_VM_MEMORY_BYTES_NOT)
  private Long runningPauseVmMemoryBytesNot;

  public static final String SERIALIZED_NAME_RUNNING_PAUSE_VM_MEMORY_BYTES_NOT_IN = "running_pause_vm_memory_bytes_not_in";
  @SerializedName(SERIALIZED_NAME_RUNNING_PAUSE_VM_MEMORY_BYTES_NOT_IN)
  private List<Long> runningPauseVmMemoryBytesNotIn = null;

  public static final String SERIALIZED_NAME_RUNNING_VM_NUM = "running_vm_num";
  @SerializedName(SERIALIZED_NAME_RUNNING_VM_NUM)
  private Integer runningVmNum;

  public static final String SERIALIZED_NAME_RUNNING_VM_NUM_GT = "running_vm_num_gt";
  @SerializedName(SERIALIZED_NAME_RUNNING_VM_NUM_GT)
  private Integer runningVmNumGt;

  public static final String SERIALIZED_NAME_RUNNING_VM_NUM_GTE = "running_vm_num_gte";
  @SerializedName(SERIALIZED_NAME_RUNNING_VM_NUM_GTE)
  private Integer runningVmNumGte;

  public static final String SERIALIZED_NAME_RUNNING_VM_NUM_IN = "running_vm_num_in";
  @SerializedName(SERIALIZED_NAME_RUNNING_VM_NUM_IN)
  private List<Integer> runningVmNumIn = null;

  public static final String SERIALIZED_NAME_RUNNING_VM_NUM_LT = "running_vm_num_lt";
  @SerializedName(SERIALIZED_NAME_RUNNING_VM_NUM_LT)
  private Integer runningVmNumLt;

  public static final String SERIALIZED_NAME_RUNNING_VM_NUM_LTE = "running_vm_num_lte";
  @SerializedName(SERIALIZED_NAME_RUNNING_VM_NUM_LTE)
  private Integer runningVmNumLte;

  public static final String SERIALIZED_NAME_RUNNING_VM_NUM_NOT = "running_vm_num_not";
  @SerializedName(SERIALIZED_NAME_RUNNING_VM_NUM_NOT)
  private Integer runningVmNumNot;

  public static final String SERIALIZED_NAME_RUNNING_VM_NUM_NOT_IN = "running_vm_num_not_in";
  @SerializedName(SERIALIZED_NAME_RUNNING_VM_NUM_NOT_IN)
  private List<Integer> runningVmNumNotIn = null;

  public static final String SERIALIZED_NAME_SCVM_CPU = "scvm_cpu";
  @SerializedName(SERIALIZED_NAME_SCVM_CPU)
  private Integer scvmCpu;

  public static final String SERIALIZED_NAME_SCVM_CPU_GT = "scvm_cpu_gt";
  @SerializedName(SERIALIZED_NAME_SCVM_CPU_GT)
  private Integer scvmCpuGt;

  public static final String SERIALIZED_NAME_SCVM_CPU_GTE = "scvm_cpu_gte";
  @SerializedName(SERIALIZED_NAME_SCVM_CPU_GTE)
  private Integer scvmCpuGte;

  public static final String SERIALIZED_NAME_SCVM_CPU_IN = "scvm_cpu_in";
  @SerializedName(SERIALIZED_NAME_SCVM_CPU_IN)
  private List<Integer> scvmCpuIn = null;

  public static final String SERIALIZED_NAME_SCVM_CPU_LT = "scvm_cpu_lt";
  @SerializedName(SERIALIZED_NAME_SCVM_CPU_LT)
  private Integer scvmCpuLt;

  public static final String SERIALIZED_NAME_SCVM_CPU_LTE = "scvm_cpu_lte";
  @SerializedName(SERIALIZED_NAME_SCVM_CPU_LTE)
  private Integer scvmCpuLte;

  public static final String SERIALIZED_NAME_SCVM_CPU_NOT = "scvm_cpu_not";
  @SerializedName(SERIALIZED_NAME_SCVM_CPU_NOT)
  private Integer scvmCpuNot;

  public static final String SERIALIZED_NAME_SCVM_CPU_NOT_IN = "scvm_cpu_not_in";
  @SerializedName(SERIALIZED_NAME_SCVM_CPU_NOT_IN)
  private List<Integer> scvmCpuNotIn = null;

  public static final String SERIALIZED_NAME_SCVM_MEMORY = "scvm_memory";
  @SerializedName(SERIALIZED_NAME_SCVM_MEMORY)
  private Long scvmMemory;

  public static final String SERIALIZED_NAME_SCVM_MEMORY_GT = "scvm_memory_gt";
  @SerializedName(SERIALIZED_NAME_SCVM_MEMORY_GT)
  private Long scvmMemoryGt;

  public static final String SERIALIZED_NAME_SCVM_MEMORY_GTE = "scvm_memory_gte";
  @SerializedName(SERIALIZED_NAME_SCVM_MEMORY_GTE)
  private Long scvmMemoryGte;

  public static final String SERIALIZED_NAME_SCVM_MEMORY_IN = "scvm_memory_in";
  @SerializedName(SERIALIZED_NAME_SCVM_MEMORY_IN)
  private List<Long> scvmMemoryIn = null;

  public static final String SERIALIZED_NAME_SCVM_MEMORY_LT = "scvm_memory_lt";
  @SerializedName(SERIALIZED_NAME_SCVM_MEMORY_LT)
  private Long scvmMemoryLt;

  public static final String SERIALIZED_NAME_SCVM_MEMORY_LTE = "scvm_memory_lte";
  @SerializedName(SERIALIZED_NAME_SCVM_MEMORY_LTE)
  private Long scvmMemoryLte;

  public static final String SERIALIZED_NAME_SCVM_MEMORY_NOT = "scvm_memory_not";
  @SerializedName(SERIALIZED_NAME_SCVM_MEMORY_NOT)
  private Long scvmMemoryNot;

  public static final String SERIALIZED_NAME_SCVM_MEMORY_NOT_IN = "scvm_memory_not_in";
  @SerializedName(SERIALIZED_NAME_SCVM_MEMORY_NOT_IN)
  private List<Long> scvmMemoryNotIn = null;

  public static final String SERIALIZED_NAME_SCVM_NAME = "scvm_name";
  @SerializedName(SERIALIZED_NAME_SCVM_NAME)
  private String scvmName;

  public static final String SERIALIZED_NAME_SCVM_NAME_CONTAINS = "scvm_name_contains";
  @SerializedName(SERIALIZED_NAME_SCVM_NAME_CONTAINS)
  private String scvmNameContains;

  public static final String SERIALIZED_NAME_SCVM_NAME_ENDS_WITH = "scvm_name_ends_with";
  @SerializedName(SERIALIZED_NAME_SCVM_NAME_ENDS_WITH)
  private String scvmNameEndsWith;

  public static final String SERIALIZED_NAME_SCVM_NAME_GT = "scvm_name_gt";
  @SerializedName(SERIALIZED_NAME_SCVM_NAME_GT)
  private String scvmNameGt;

  public static final String SERIALIZED_NAME_SCVM_NAME_GTE = "scvm_name_gte";
  @SerializedName(SERIALIZED_NAME_SCVM_NAME_GTE)
  private String scvmNameGte;

  public static final String SERIALIZED_NAME_SCVM_NAME_IN = "scvm_name_in";
  @SerializedName(SERIALIZED_NAME_SCVM_NAME_IN)
  private List<String> scvmNameIn = null;

  public static final String SERIALIZED_NAME_SCVM_NAME_LT = "scvm_name_lt";
  @SerializedName(SERIALIZED_NAME_SCVM_NAME_LT)
  private String scvmNameLt;

  public static final String SERIALIZED_NAME_SCVM_NAME_LTE = "scvm_name_lte";
  @SerializedName(SERIALIZED_NAME_SCVM_NAME_LTE)
  private String scvmNameLte;

  public static final String SERIALIZED_NAME_SCVM_NAME_NOT = "scvm_name_not";
  @SerializedName(SERIALIZED_NAME_SCVM_NAME_NOT)
  private String scvmNameNot;

  public static final String SERIALIZED_NAME_SCVM_NAME_NOT_CONTAINS = "scvm_name_not_contains";
  @SerializedName(SERIALIZED_NAME_SCVM_NAME_NOT_CONTAINS)
  private String scvmNameNotContains;

  public static final String SERIALIZED_NAME_SCVM_NAME_NOT_ENDS_WITH = "scvm_name_not_ends_with";
  @SerializedName(SERIALIZED_NAME_SCVM_NAME_NOT_ENDS_WITH)
  private String scvmNameNotEndsWith;

  public static final String SERIALIZED_NAME_SCVM_NAME_NOT_IN = "scvm_name_not_in";
  @SerializedName(SERIALIZED_NAME_SCVM_NAME_NOT_IN)
  private List<String> scvmNameNotIn = null;

  public static final String SERIALIZED_NAME_SCVM_NAME_NOT_STARTS_WITH = "scvm_name_not_starts_with";
  @SerializedName(SERIALIZED_NAME_SCVM_NAME_NOT_STARTS_WITH)
  private String scvmNameNotStartsWith;

  public static final String SERIALIZED_NAME_SCVM_NAME_STARTS_WITH = "scvm_name_starts_with";
  @SerializedName(SERIALIZED_NAME_SCVM_NAME_STARTS_WITH)
  private String scvmNameStartsWith;

  public static final String SERIALIZED_NAME_SERIAL = "serial";
  @SerializedName(SERIALIZED_NAME_SERIAL)
  private String serial;

  public static final String SERIALIZED_NAME_SERIAL_CONTAINS = "serial_contains";
  @SerializedName(SERIALIZED_NAME_SERIAL_CONTAINS)
  private String serialContains;

  public static final String SERIALIZED_NAME_SERIAL_ENDS_WITH = "serial_ends_with";
  @SerializedName(SERIALIZED_NAME_SERIAL_ENDS_WITH)
  private String serialEndsWith;

  public static final String SERIALIZED_NAME_SERIAL_GT = "serial_gt";
  @SerializedName(SERIALIZED_NAME_SERIAL_GT)
  private String serialGt;

  public static final String SERIALIZED_NAME_SERIAL_GTE = "serial_gte";
  @SerializedName(SERIALIZED_NAME_SERIAL_GTE)
  private String serialGte;

  public static final String SERIALIZED_NAME_SERIAL_IN = "serial_in";
  @SerializedName(SERIALIZED_NAME_SERIAL_IN)
  private List<String> serialIn = null;

  public static final String SERIALIZED_NAME_SERIAL_LT = "serial_lt";
  @SerializedName(SERIALIZED_NAME_SERIAL_LT)
  private String serialLt;

  public static final String SERIALIZED_NAME_SERIAL_LTE = "serial_lte";
  @SerializedName(SERIALIZED_NAME_SERIAL_LTE)
  private String serialLte;

  public static final String SERIALIZED_NAME_SERIAL_NOT = "serial_not";
  @SerializedName(SERIALIZED_NAME_SERIAL_NOT)
  private String serialNot;

  public static final String SERIALIZED_NAME_SERIAL_NOT_CONTAINS = "serial_not_contains";
  @SerializedName(SERIALIZED_NAME_SERIAL_NOT_CONTAINS)
  private String serialNotContains;

  public static final String SERIALIZED_NAME_SERIAL_NOT_ENDS_WITH = "serial_not_ends_with";
  @SerializedName(SERIALIZED_NAME_SERIAL_NOT_ENDS_WITH)
  private String serialNotEndsWith;

  public static final String SERIALIZED_NAME_SERIAL_NOT_IN = "serial_not_in";
  @SerializedName(SERIALIZED_NAME_SERIAL_NOT_IN)
  private List<String> serialNotIn = null;

  public static final String SERIALIZED_NAME_SERIAL_NOT_STARTS_WITH = "serial_not_starts_with";
  @SerializedName(SERIALIZED_NAME_SERIAL_NOT_STARTS_WITH)
  private String serialNotStartsWith;

  public static final String SERIALIZED_NAME_SERIAL_STARTS_WITH = "serial_starts_with";
  @SerializedName(SERIALIZED_NAME_SERIAL_STARTS_WITH)
  private String serialStartsWith;

  public static final String SERIALIZED_NAME_SSD_DATA_CAPACITY = "ssd_data_capacity";
  @SerializedName(SERIALIZED_NAME_SSD_DATA_CAPACITY)
  private Long ssdDataCapacity;

  public static final String SERIALIZED_NAME_SSD_DATA_CAPACITY_GT = "ssd_data_capacity_gt";
  @SerializedName(SERIALIZED_NAME_SSD_DATA_CAPACITY_GT)
  private Long ssdDataCapacityGt;

  public static final String SERIALIZED_NAME_SSD_DATA_CAPACITY_GTE = "ssd_data_capacity_gte";
  @SerializedName(SERIALIZED_NAME_SSD_DATA_CAPACITY_GTE)
  private Long ssdDataCapacityGte;

  public static final String SERIALIZED_NAME_SSD_DATA_CAPACITY_IN = "ssd_data_capacity_in";
  @SerializedName(SERIALIZED_NAME_SSD_DATA_CAPACITY_IN)
  private List<Long> ssdDataCapacityIn = null;

  public static final String SERIALIZED_NAME_SSD_DATA_CAPACITY_LT = "ssd_data_capacity_lt";
  @SerializedName(SERIALIZED_NAME_SSD_DATA_CAPACITY_LT)
  private Long ssdDataCapacityLt;

  public static final String SERIALIZED_NAME_SSD_DATA_CAPACITY_LTE = "ssd_data_capacity_lte";
  @SerializedName(SERIALIZED_NAME_SSD_DATA_CAPACITY_LTE)
  private Long ssdDataCapacityLte;

  public static final String SERIALIZED_NAME_SSD_DATA_CAPACITY_NOT = "ssd_data_capacity_not";
  @SerializedName(SERIALIZED_NAME_SSD_DATA_CAPACITY_NOT)
  private Long ssdDataCapacityNot;

  public static final String SERIALIZED_NAME_SSD_DATA_CAPACITY_NOT_IN = "ssd_data_capacity_not_in";
  @SerializedName(SERIALIZED_NAME_SSD_DATA_CAPACITY_NOT_IN)
  private List<Long> ssdDataCapacityNotIn = null;

  public static final String SERIALIZED_NAME_SSD_DISK_COUNT = "ssd_disk_count";
  @SerializedName(SERIALIZED_NAME_SSD_DISK_COUNT)
  private Integer ssdDiskCount;

  public static final String SERIALIZED_NAME_SSD_DISK_COUNT_GT = "ssd_disk_count_gt";
  @SerializedName(SERIALIZED_NAME_SSD_DISK_COUNT_GT)
  private Integer ssdDiskCountGt;

  public static final String SERIALIZED_NAME_SSD_DISK_COUNT_GTE = "ssd_disk_count_gte";
  @SerializedName(SERIALIZED_NAME_SSD_DISK_COUNT_GTE)
  private Integer ssdDiskCountGte;

  public static final String SERIALIZED_NAME_SSD_DISK_COUNT_IN = "ssd_disk_count_in";
  @SerializedName(SERIALIZED_NAME_SSD_DISK_COUNT_IN)
  private List<Integer> ssdDiskCountIn = null;

  public static final String SERIALIZED_NAME_SSD_DISK_COUNT_LT = "ssd_disk_count_lt";
  @SerializedName(SERIALIZED_NAME_SSD_DISK_COUNT_LT)
  private Integer ssdDiskCountLt;

  public static final String SERIALIZED_NAME_SSD_DISK_COUNT_LTE = "ssd_disk_count_lte";
  @SerializedName(SERIALIZED_NAME_SSD_DISK_COUNT_LTE)
  private Integer ssdDiskCountLte;

  public static final String SERIALIZED_NAME_SSD_DISK_COUNT_NOT = "ssd_disk_count_not";
  @SerializedName(SERIALIZED_NAME_SSD_DISK_COUNT_NOT)
  private Integer ssdDiskCountNot;

  public static final String SERIALIZED_NAME_SSD_DISK_COUNT_NOT_IN = "ssd_disk_count_not_in";
  @SerializedName(SERIALIZED_NAME_SSD_DISK_COUNT_NOT_IN)
  private List<Integer> ssdDiskCountNotIn = null;

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private HostState state;

  public static final String SERIALIZED_NAME_STATE_IN = "state_in";
  @SerializedName(SERIALIZED_NAME_STATE_IN)
  private List<HostState> stateIn = null;

  public static final String SERIALIZED_NAME_STATE_NOT = "state_not";
  @SerializedName(SERIALIZED_NAME_STATE_NOT)
  private HostState stateNot;

  public static final String SERIALIZED_NAME_STATE_NOT_IN = "state_not_in";
  @SerializedName(SERIALIZED_NAME_STATE_NOT_IN)
  private List<HostState> stateNotIn = null;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private HostStatus status;

  public static final String SERIALIZED_NAME_STATUS_IN = "status_in";
  @SerializedName(SERIALIZED_NAME_STATUS_IN)
  private List<HostStatus> statusIn = null;

  public static final String SERIALIZED_NAME_STATUS_NOT = "status_not";
  @SerializedName(SERIALIZED_NAME_STATUS_NOT)
  private HostStatus statusNot;

  public static final String SERIALIZED_NAME_STATUS_NOT_IN = "status_not_in";
  @SerializedName(SERIALIZED_NAME_STATUS_NOT_IN)
  private List<HostStatus> statusNotIn = null;

  public static final String SERIALIZED_NAME_STOPPED_VM_NUM = "stopped_vm_num";
  @SerializedName(SERIALIZED_NAME_STOPPED_VM_NUM)
  private Integer stoppedVmNum;

  public static final String SERIALIZED_NAME_STOPPED_VM_NUM_GT = "stopped_vm_num_gt";
  @SerializedName(SERIALIZED_NAME_STOPPED_VM_NUM_GT)
  private Integer stoppedVmNumGt;

  public static final String SERIALIZED_NAME_STOPPED_VM_NUM_GTE = "stopped_vm_num_gte";
  @SerializedName(SERIALIZED_NAME_STOPPED_VM_NUM_GTE)
  private Integer stoppedVmNumGte;

  public static final String SERIALIZED_NAME_STOPPED_VM_NUM_IN = "stopped_vm_num_in";
  @SerializedName(SERIALIZED_NAME_STOPPED_VM_NUM_IN)
  private List<Integer> stoppedVmNumIn = null;

  public static final String SERIALIZED_NAME_STOPPED_VM_NUM_LT = "stopped_vm_num_lt";
  @SerializedName(SERIALIZED_NAME_STOPPED_VM_NUM_LT)
  private Integer stoppedVmNumLt;

  public static final String SERIALIZED_NAME_STOPPED_VM_NUM_LTE = "stopped_vm_num_lte";
  @SerializedName(SERIALIZED_NAME_STOPPED_VM_NUM_LTE)
  private Integer stoppedVmNumLte;

  public static final String SERIALIZED_NAME_STOPPED_VM_NUM_NOT = "stopped_vm_num_not";
  @SerializedName(SERIALIZED_NAME_STOPPED_VM_NUM_NOT)
  private Integer stoppedVmNumNot;

  public static final String SERIALIZED_NAME_STOPPED_VM_NUM_NOT_IN = "stopped_vm_num_not_in";
  @SerializedName(SERIALIZED_NAME_STOPPED_VM_NUM_NOT_IN)
  private List<Integer> stoppedVmNumNotIn = null;

  public static final String SERIALIZED_NAME_SUSPENDED_VM_NUM = "suspended_vm_num";
  @SerializedName(SERIALIZED_NAME_SUSPENDED_VM_NUM)
  private Integer suspendedVmNum;

  public static final String SERIALIZED_NAME_SUSPENDED_VM_NUM_GT = "suspended_vm_num_gt";
  @SerializedName(SERIALIZED_NAME_SUSPENDED_VM_NUM_GT)
  private Integer suspendedVmNumGt;

  public static final String SERIALIZED_NAME_SUSPENDED_VM_NUM_GTE = "suspended_vm_num_gte";
  @SerializedName(SERIALIZED_NAME_SUSPENDED_VM_NUM_GTE)
  private Integer suspendedVmNumGte;

  public static final String SERIALIZED_NAME_SUSPENDED_VM_NUM_IN = "suspended_vm_num_in";
  @SerializedName(SERIALIZED_NAME_SUSPENDED_VM_NUM_IN)
  private List<Integer> suspendedVmNumIn = null;

  public static final String SERIALIZED_NAME_SUSPENDED_VM_NUM_LT = "suspended_vm_num_lt";
  @SerializedName(SERIALIZED_NAME_SUSPENDED_VM_NUM_LT)
  private Integer suspendedVmNumLt;

  public static final String SERIALIZED_NAME_SUSPENDED_VM_NUM_LTE = "suspended_vm_num_lte";
  @SerializedName(SERIALIZED_NAME_SUSPENDED_VM_NUM_LTE)
  private Integer suspendedVmNumLte;

  public static final String SERIALIZED_NAME_SUSPENDED_VM_NUM_NOT = "suspended_vm_num_not";
  @SerializedName(SERIALIZED_NAME_SUSPENDED_VM_NUM_NOT)
  private Integer suspendedVmNumNot;

  public static final String SERIALIZED_NAME_SUSPENDED_VM_NUM_NOT_IN = "suspended_vm_num_not_in";
  @SerializedName(SERIALIZED_NAME_SUSPENDED_VM_NUM_NOT_IN)
  private List<Integer> suspendedVmNumNotIn = null;

  public static final String SERIALIZED_NAME_TOTAL_CACHE_CAPACITY = "total_cache_capacity";
  @SerializedName(SERIALIZED_NAME_TOTAL_CACHE_CAPACITY)
  private Long totalCacheCapacity;

  public static final String SERIALIZED_NAME_TOTAL_CACHE_CAPACITY_GT = "total_cache_capacity_gt";
  @SerializedName(SERIALIZED_NAME_TOTAL_CACHE_CAPACITY_GT)
  private Long totalCacheCapacityGt;

  public static final String SERIALIZED_NAME_TOTAL_CACHE_CAPACITY_GTE = "total_cache_capacity_gte";
  @SerializedName(SERIALIZED_NAME_TOTAL_CACHE_CAPACITY_GTE)
  private Long totalCacheCapacityGte;

  public static final String SERIALIZED_NAME_TOTAL_CACHE_CAPACITY_IN = "total_cache_capacity_in";
  @SerializedName(SERIALIZED_NAME_TOTAL_CACHE_CAPACITY_IN)
  private List<Long> totalCacheCapacityIn = null;

  public static final String SERIALIZED_NAME_TOTAL_CACHE_CAPACITY_LT = "total_cache_capacity_lt";
  @SerializedName(SERIALIZED_NAME_TOTAL_CACHE_CAPACITY_LT)
  private Long totalCacheCapacityLt;

  public static final String SERIALIZED_NAME_TOTAL_CACHE_CAPACITY_LTE = "total_cache_capacity_lte";
  @SerializedName(SERIALIZED_NAME_TOTAL_CACHE_CAPACITY_LTE)
  private Long totalCacheCapacityLte;

  public static final String SERIALIZED_NAME_TOTAL_CACHE_CAPACITY_NOT = "total_cache_capacity_not";
  @SerializedName(SERIALIZED_NAME_TOTAL_CACHE_CAPACITY_NOT)
  private Long totalCacheCapacityNot;

  public static final String SERIALIZED_NAME_TOTAL_CACHE_CAPACITY_NOT_IN = "total_cache_capacity_not_in";
  @SerializedName(SERIALIZED_NAME_TOTAL_CACHE_CAPACITY_NOT_IN)
  private List<Long> totalCacheCapacityNotIn = null;

  public static final String SERIALIZED_NAME_TOTAL_CPU_CORES = "total_cpu_cores";
  @SerializedName(SERIALIZED_NAME_TOTAL_CPU_CORES)
  private Integer totalCpuCores;

  public static final String SERIALIZED_NAME_TOTAL_CPU_CORES_GT = "total_cpu_cores_gt";
  @SerializedName(SERIALIZED_NAME_TOTAL_CPU_CORES_GT)
  private Integer totalCpuCoresGt;

  public static final String SERIALIZED_NAME_TOTAL_CPU_CORES_GTE = "total_cpu_cores_gte";
  @SerializedName(SERIALIZED_NAME_TOTAL_CPU_CORES_GTE)
  private Integer totalCpuCoresGte;

  public static final String SERIALIZED_NAME_TOTAL_CPU_CORES_IN = "total_cpu_cores_in";
  @SerializedName(SERIALIZED_NAME_TOTAL_CPU_CORES_IN)
  private List<Integer> totalCpuCoresIn = null;

  public static final String SERIALIZED_NAME_TOTAL_CPU_CORES_LT = "total_cpu_cores_lt";
  @SerializedName(SERIALIZED_NAME_TOTAL_CPU_CORES_LT)
  private Integer totalCpuCoresLt;

  public static final String SERIALIZED_NAME_TOTAL_CPU_CORES_LTE = "total_cpu_cores_lte";
  @SerializedName(SERIALIZED_NAME_TOTAL_CPU_CORES_LTE)
  private Integer totalCpuCoresLte;

  public static final String SERIALIZED_NAME_TOTAL_CPU_CORES_NOT = "total_cpu_cores_not";
  @SerializedName(SERIALIZED_NAME_TOTAL_CPU_CORES_NOT)
  private Integer totalCpuCoresNot;

  public static final String SERIALIZED_NAME_TOTAL_CPU_CORES_NOT_IN = "total_cpu_cores_not_in";
  @SerializedName(SERIALIZED_NAME_TOTAL_CPU_CORES_NOT_IN)
  private List<Integer> totalCpuCoresNotIn = null;

  public static final String SERIALIZED_NAME_TOTAL_CPU_HZ = "total_cpu_hz";
  @SerializedName(SERIALIZED_NAME_TOTAL_CPU_HZ)
  private Long totalCpuHz;

  public static final String SERIALIZED_NAME_TOTAL_CPU_HZ_GT = "total_cpu_hz_gt";
  @SerializedName(SERIALIZED_NAME_TOTAL_CPU_HZ_GT)
  private Long totalCpuHzGt;

  public static final String SERIALIZED_NAME_TOTAL_CPU_HZ_GTE = "total_cpu_hz_gte";
  @SerializedName(SERIALIZED_NAME_TOTAL_CPU_HZ_GTE)
  private Long totalCpuHzGte;

  public static final String SERIALIZED_NAME_TOTAL_CPU_HZ_IN = "total_cpu_hz_in";
  @SerializedName(SERIALIZED_NAME_TOTAL_CPU_HZ_IN)
  private List<Long> totalCpuHzIn = null;

  public static final String SERIALIZED_NAME_TOTAL_CPU_HZ_LT = "total_cpu_hz_lt";
  @SerializedName(SERIALIZED_NAME_TOTAL_CPU_HZ_LT)
  private Long totalCpuHzLt;

  public static final String SERIALIZED_NAME_TOTAL_CPU_HZ_LTE = "total_cpu_hz_lte";
  @SerializedName(SERIALIZED_NAME_TOTAL_CPU_HZ_LTE)
  private Long totalCpuHzLte;

  public static final String SERIALIZED_NAME_TOTAL_CPU_HZ_NOT = "total_cpu_hz_not";
  @SerializedName(SERIALIZED_NAME_TOTAL_CPU_HZ_NOT)
  private Long totalCpuHzNot;

  public static final String SERIALIZED_NAME_TOTAL_CPU_HZ_NOT_IN = "total_cpu_hz_not_in";
  @SerializedName(SERIALIZED_NAME_TOTAL_CPU_HZ_NOT_IN)
  private List<Long> totalCpuHzNotIn = null;

  public static final String SERIALIZED_NAME_TOTAL_CPU_SOCKETS = "total_cpu_sockets";
  @SerializedName(SERIALIZED_NAME_TOTAL_CPU_SOCKETS)
  private Integer totalCpuSockets;

  public static final String SERIALIZED_NAME_TOTAL_CPU_SOCKETS_GT = "total_cpu_sockets_gt";
  @SerializedName(SERIALIZED_NAME_TOTAL_CPU_SOCKETS_GT)
  private Integer totalCpuSocketsGt;

  public static final String SERIALIZED_NAME_TOTAL_CPU_SOCKETS_GTE = "total_cpu_sockets_gte";
  @SerializedName(SERIALIZED_NAME_TOTAL_CPU_SOCKETS_GTE)
  private Integer totalCpuSocketsGte;

  public static final String SERIALIZED_NAME_TOTAL_CPU_SOCKETS_IN = "total_cpu_sockets_in";
  @SerializedName(SERIALIZED_NAME_TOTAL_CPU_SOCKETS_IN)
  private List<Integer> totalCpuSocketsIn = null;

  public static final String SERIALIZED_NAME_TOTAL_CPU_SOCKETS_LT = "total_cpu_sockets_lt";
  @SerializedName(SERIALIZED_NAME_TOTAL_CPU_SOCKETS_LT)
  private Integer totalCpuSocketsLt;

  public static final String SERIALIZED_NAME_TOTAL_CPU_SOCKETS_LTE = "total_cpu_sockets_lte";
  @SerializedName(SERIALIZED_NAME_TOTAL_CPU_SOCKETS_LTE)
  private Integer totalCpuSocketsLte;

  public static final String SERIALIZED_NAME_TOTAL_CPU_SOCKETS_NOT = "total_cpu_sockets_not";
  @SerializedName(SERIALIZED_NAME_TOTAL_CPU_SOCKETS_NOT)
  private Integer totalCpuSocketsNot;

  public static final String SERIALIZED_NAME_TOTAL_CPU_SOCKETS_NOT_IN = "total_cpu_sockets_not_in";
  @SerializedName(SERIALIZED_NAME_TOTAL_CPU_SOCKETS_NOT_IN)
  private List<Integer> totalCpuSocketsNotIn = null;

  public static final String SERIALIZED_NAME_TOTAL_DATA_CAPACITY = "total_data_capacity";
  @SerializedName(SERIALIZED_NAME_TOTAL_DATA_CAPACITY)
  private Long totalDataCapacity;

  public static final String SERIALIZED_NAME_TOTAL_DATA_CAPACITY_GT = "total_data_capacity_gt";
  @SerializedName(SERIALIZED_NAME_TOTAL_DATA_CAPACITY_GT)
  private Long totalDataCapacityGt;

  public static final String SERIALIZED_NAME_TOTAL_DATA_CAPACITY_GTE = "total_data_capacity_gte";
  @SerializedName(SERIALIZED_NAME_TOTAL_DATA_CAPACITY_GTE)
  private Long totalDataCapacityGte;

  public static final String SERIALIZED_NAME_TOTAL_DATA_CAPACITY_IN = "total_data_capacity_in";
  @SerializedName(SERIALIZED_NAME_TOTAL_DATA_CAPACITY_IN)
  private List<Long> totalDataCapacityIn = null;

  public static final String SERIALIZED_NAME_TOTAL_DATA_CAPACITY_LT = "total_data_capacity_lt";
  @SerializedName(SERIALIZED_NAME_TOTAL_DATA_CAPACITY_LT)
  private Long totalDataCapacityLt;

  public static final String SERIALIZED_NAME_TOTAL_DATA_CAPACITY_LTE = "total_data_capacity_lte";
  @SerializedName(SERIALIZED_NAME_TOTAL_DATA_CAPACITY_LTE)
  private Long totalDataCapacityLte;

  public static final String SERIALIZED_NAME_TOTAL_DATA_CAPACITY_NOT = "total_data_capacity_not";
  @SerializedName(SERIALIZED_NAME_TOTAL_DATA_CAPACITY_NOT)
  private Long totalDataCapacityNot;

  public static final String SERIALIZED_NAME_TOTAL_DATA_CAPACITY_NOT_IN = "total_data_capacity_not_in";
  @SerializedName(SERIALIZED_NAME_TOTAL_DATA_CAPACITY_NOT_IN)
  private List<Long> totalDataCapacityNotIn = null;

  public static final String SERIALIZED_NAME_TOTAL_MEMORY_BYTES = "total_memory_bytes";
  @SerializedName(SERIALIZED_NAME_TOTAL_MEMORY_BYTES)
  private Long totalMemoryBytes;

  public static final String SERIALIZED_NAME_TOTAL_MEMORY_BYTES_GT = "total_memory_bytes_gt";
  @SerializedName(SERIALIZED_NAME_TOTAL_MEMORY_BYTES_GT)
  private Long totalMemoryBytesGt;

  public static final String SERIALIZED_NAME_TOTAL_MEMORY_BYTES_GTE = "total_memory_bytes_gte";
  @SerializedName(SERIALIZED_NAME_TOTAL_MEMORY_BYTES_GTE)
  private Long totalMemoryBytesGte;

  public static final String SERIALIZED_NAME_TOTAL_MEMORY_BYTES_IN = "total_memory_bytes_in";
  @SerializedName(SERIALIZED_NAME_TOTAL_MEMORY_BYTES_IN)
  private List<Long> totalMemoryBytesIn = null;

  public static final String SERIALIZED_NAME_TOTAL_MEMORY_BYTES_LT = "total_memory_bytes_lt";
  @SerializedName(SERIALIZED_NAME_TOTAL_MEMORY_BYTES_LT)
  private Long totalMemoryBytesLt;

  public static final String SERIALIZED_NAME_TOTAL_MEMORY_BYTES_LTE = "total_memory_bytes_lte";
  @SerializedName(SERIALIZED_NAME_TOTAL_MEMORY_BYTES_LTE)
  private Long totalMemoryBytesLte;

  public static final String SERIALIZED_NAME_TOTAL_MEMORY_BYTES_NOT = "total_memory_bytes_not";
  @SerializedName(SERIALIZED_NAME_TOTAL_MEMORY_BYTES_NOT)
  private Long totalMemoryBytesNot;

  public static final String SERIALIZED_NAME_TOTAL_MEMORY_BYTES_NOT_IN = "total_memory_bytes_not_in";
  @SerializedName(SERIALIZED_NAME_TOTAL_MEMORY_BYTES_NOT_IN)
  private List<Long> totalMemoryBytesNotIn = null;

  public static final String SERIALIZED_NAME_USB_DEVICES_EVERY = "usb_devices_every";
  @SerializedName(SERIALIZED_NAME_USB_DEVICES_EVERY)
  private UsbDeviceWhereInput usbDevicesEvery;

  public static final String SERIALIZED_NAME_USB_DEVICES_NONE = "usb_devices_none";
  @SerializedName(SERIALIZED_NAME_USB_DEVICES_NONE)
  private UsbDeviceWhereInput usbDevicesNone;

  public static final String SERIALIZED_NAME_USB_DEVICES_SOME = "usb_devices_some";
  @SerializedName(SERIALIZED_NAME_USB_DEVICES_SOME)
  private UsbDeviceWhereInput usbDevicesSome;

  public static final String SERIALIZED_NAME_USED_CPU_HZ = "used_cpu_hz";
  @SerializedName(SERIALIZED_NAME_USED_CPU_HZ)
  private Double usedCpuHz;

  public static final String SERIALIZED_NAME_USED_CPU_HZ_GT = "used_cpu_hz_gt";
  @SerializedName(SERIALIZED_NAME_USED_CPU_HZ_GT)
  private Double usedCpuHzGt;

  public static final String SERIALIZED_NAME_USED_CPU_HZ_GTE = "used_cpu_hz_gte";
  @SerializedName(SERIALIZED_NAME_USED_CPU_HZ_GTE)
  private Double usedCpuHzGte;

  public static final String SERIALIZED_NAME_USED_CPU_HZ_IN = "used_cpu_hz_in";
  @SerializedName(SERIALIZED_NAME_USED_CPU_HZ_IN)
  private List<Double> usedCpuHzIn = null;

  public static final String SERIALIZED_NAME_USED_CPU_HZ_LT = "used_cpu_hz_lt";
  @SerializedName(SERIALIZED_NAME_USED_CPU_HZ_LT)
  private Double usedCpuHzLt;

  public static final String SERIALIZED_NAME_USED_CPU_HZ_LTE = "used_cpu_hz_lte";
  @SerializedName(SERIALIZED_NAME_USED_CPU_HZ_LTE)
  private Double usedCpuHzLte;

  public static final String SERIALIZED_NAME_USED_CPU_HZ_NOT = "used_cpu_hz_not";
  @SerializedName(SERIALIZED_NAME_USED_CPU_HZ_NOT)
  private Double usedCpuHzNot;

  public static final String SERIALIZED_NAME_USED_CPU_HZ_NOT_IN = "used_cpu_hz_not_in";
  @SerializedName(SERIALIZED_NAME_USED_CPU_HZ_NOT_IN)
  private List<Double> usedCpuHzNotIn = null;

  public static final String SERIALIZED_NAME_USED_DATA_SPACE = "used_data_space";
  @SerializedName(SERIALIZED_NAME_USED_DATA_SPACE)
  private Long usedDataSpace;

  public static final String SERIALIZED_NAME_USED_DATA_SPACE_GT = "used_data_space_gt";
  @SerializedName(SERIALIZED_NAME_USED_DATA_SPACE_GT)
  private Long usedDataSpaceGt;

  public static final String SERIALIZED_NAME_USED_DATA_SPACE_GTE = "used_data_space_gte";
  @SerializedName(SERIALIZED_NAME_USED_DATA_SPACE_GTE)
  private Long usedDataSpaceGte;

  public static final String SERIALIZED_NAME_USED_DATA_SPACE_IN = "used_data_space_in";
  @SerializedName(SERIALIZED_NAME_USED_DATA_SPACE_IN)
  private List<Long> usedDataSpaceIn = null;

  public static final String SERIALIZED_NAME_USED_DATA_SPACE_LT = "used_data_space_lt";
  @SerializedName(SERIALIZED_NAME_USED_DATA_SPACE_LT)
  private Long usedDataSpaceLt;

  public static final String SERIALIZED_NAME_USED_DATA_SPACE_LTE = "used_data_space_lte";
  @SerializedName(SERIALIZED_NAME_USED_DATA_SPACE_LTE)
  private Long usedDataSpaceLte;

  public static final String SERIALIZED_NAME_USED_DATA_SPACE_NOT = "used_data_space_not";
  @SerializedName(SERIALIZED_NAME_USED_DATA_SPACE_NOT)
  private Long usedDataSpaceNot;

  public static final String SERIALIZED_NAME_USED_DATA_SPACE_NOT_IN = "used_data_space_not_in";
  @SerializedName(SERIALIZED_NAME_USED_DATA_SPACE_NOT_IN)
  private List<Long> usedDataSpaceNotIn = null;

  public static final String SERIALIZED_NAME_USED_MEMORY_BYTES = "used_memory_bytes";
  @SerializedName(SERIALIZED_NAME_USED_MEMORY_BYTES)
  private Double usedMemoryBytes;

  public static final String SERIALIZED_NAME_USED_MEMORY_BYTES_GT = "used_memory_bytes_gt";
  @SerializedName(SERIALIZED_NAME_USED_MEMORY_BYTES_GT)
  private Double usedMemoryBytesGt;

  public static final String SERIALIZED_NAME_USED_MEMORY_BYTES_GTE = "used_memory_bytes_gte";
  @SerializedName(SERIALIZED_NAME_USED_MEMORY_BYTES_GTE)
  private Double usedMemoryBytesGte;

  public static final String SERIALIZED_NAME_USED_MEMORY_BYTES_IN = "used_memory_bytes_in";
  @SerializedName(SERIALIZED_NAME_USED_MEMORY_BYTES_IN)
  private List<Double> usedMemoryBytesIn = null;

  public static final String SERIALIZED_NAME_USED_MEMORY_BYTES_LT = "used_memory_bytes_lt";
  @SerializedName(SERIALIZED_NAME_USED_MEMORY_BYTES_LT)
  private Double usedMemoryBytesLt;

  public static final String SERIALIZED_NAME_USED_MEMORY_BYTES_LTE = "used_memory_bytes_lte";
  @SerializedName(SERIALIZED_NAME_USED_MEMORY_BYTES_LTE)
  private Double usedMemoryBytesLte;

  public static final String SERIALIZED_NAME_USED_MEMORY_BYTES_NOT = "used_memory_bytes_not";
  @SerializedName(SERIALIZED_NAME_USED_MEMORY_BYTES_NOT)
  private Double usedMemoryBytesNot;

  public static final String SERIALIZED_NAME_USED_MEMORY_BYTES_NOT_IN = "used_memory_bytes_not_in";
  @SerializedName(SERIALIZED_NAME_USED_MEMORY_BYTES_NOT_IN)
  private List<Double> usedMemoryBytesNotIn = null;

  public static final String SERIALIZED_NAME_VM_NUM = "vm_num";
  @SerializedName(SERIALIZED_NAME_VM_NUM)
  private Integer vmNum;

  public static final String SERIALIZED_NAME_VM_NUM_GT = "vm_num_gt";
  @SerializedName(SERIALIZED_NAME_VM_NUM_GT)
  private Integer vmNumGt;

  public static final String SERIALIZED_NAME_VM_NUM_GTE = "vm_num_gte";
  @SerializedName(SERIALIZED_NAME_VM_NUM_GTE)
  private Integer vmNumGte;

  public static final String SERIALIZED_NAME_VM_NUM_IN = "vm_num_in";
  @SerializedName(SERIALIZED_NAME_VM_NUM_IN)
  private List<Integer> vmNumIn = null;

  public static final String SERIALIZED_NAME_VM_NUM_LT = "vm_num_lt";
  @SerializedName(SERIALIZED_NAME_VM_NUM_LT)
  private Integer vmNumLt;

  public static final String SERIALIZED_NAME_VM_NUM_LTE = "vm_num_lte";
  @SerializedName(SERIALIZED_NAME_VM_NUM_LTE)
  private Integer vmNumLte;

  public static final String SERIALIZED_NAME_VM_NUM_NOT = "vm_num_not";
  @SerializedName(SERIALIZED_NAME_VM_NUM_NOT)
  private Integer vmNumNot;

  public static final String SERIALIZED_NAME_VM_NUM_NOT_IN = "vm_num_not_in";
  @SerializedName(SERIALIZED_NAME_VM_NUM_NOT_IN)
  private List<Integer> vmNumNotIn = null;

  public static final String SERIALIZED_NAME_VMOTION_IP = "vmotion_ip";
  @SerializedName(SERIALIZED_NAME_VMOTION_IP)
  private String vmotionIp;

  public static final String SERIALIZED_NAME_VMOTION_IP_CONTAINS = "vmotion_ip_contains";
  @SerializedName(SERIALIZED_NAME_VMOTION_IP_CONTAINS)
  private String vmotionIpContains;

  public static final String SERIALIZED_NAME_VMOTION_IP_ENDS_WITH = "vmotion_ip_ends_with";
  @SerializedName(SERIALIZED_NAME_VMOTION_IP_ENDS_WITH)
  private String vmotionIpEndsWith;

  public static final String SERIALIZED_NAME_VMOTION_IP_GT = "vmotion_ip_gt";
  @SerializedName(SERIALIZED_NAME_VMOTION_IP_GT)
  private String vmotionIpGt;

  public static final String SERIALIZED_NAME_VMOTION_IP_GTE = "vmotion_ip_gte";
  @SerializedName(SERIALIZED_NAME_VMOTION_IP_GTE)
  private String vmotionIpGte;

  public static final String SERIALIZED_NAME_VMOTION_IP_IN = "vmotion_ip_in";
  @SerializedName(SERIALIZED_NAME_VMOTION_IP_IN)
  private List<String> vmotionIpIn = null;

  public static final String SERIALIZED_NAME_VMOTION_IP_LT = "vmotion_ip_lt";
  @SerializedName(SERIALIZED_NAME_VMOTION_IP_LT)
  private String vmotionIpLt;

  public static final String SERIALIZED_NAME_VMOTION_IP_LTE = "vmotion_ip_lte";
  @SerializedName(SERIALIZED_NAME_VMOTION_IP_LTE)
  private String vmotionIpLte;

  public static final String SERIALIZED_NAME_VMOTION_IP_NOT = "vmotion_ip_not";
  @SerializedName(SERIALIZED_NAME_VMOTION_IP_NOT)
  private String vmotionIpNot;

  public static final String SERIALIZED_NAME_VMOTION_IP_NOT_CONTAINS = "vmotion_ip_not_contains";
  @SerializedName(SERIALIZED_NAME_VMOTION_IP_NOT_CONTAINS)
  private String vmotionIpNotContains;

  public static final String SERIALIZED_NAME_VMOTION_IP_NOT_ENDS_WITH = "vmotion_ip_not_ends_with";
  @SerializedName(SERIALIZED_NAME_VMOTION_IP_NOT_ENDS_WITH)
  private String vmotionIpNotEndsWith;

  public static final String SERIALIZED_NAME_VMOTION_IP_NOT_IN = "vmotion_ip_not_in";
  @SerializedName(SERIALIZED_NAME_VMOTION_IP_NOT_IN)
  private List<String> vmotionIpNotIn = null;

  public static final String SERIALIZED_NAME_VMOTION_IP_NOT_STARTS_WITH = "vmotion_ip_not_starts_with";
  @SerializedName(SERIALIZED_NAME_VMOTION_IP_NOT_STARTS_WITH)
  private String vmotionIpNotStartsWith;

  public static final String SERIALIZED_NAME_VMOTION_IP_STARTS_WITH = "vmotion_ip_starts_with";
  @SerializedName(SERIALIZED_NAME_VMOTION_IP_STARTS_WITH)
  private String vmotionIpStartsWith;

  public static final String SERIALIZED_NAME_VMS_EVERY = "vms_every";
  @SerializedName(SERIALIZED_NAME_VMS_EVERY)
  private VmWhereInput vmsEvery;

  public static final String SERIALIZED_NAME_VMS_NONE = "vms_none";
  @SerializedName(SERIALIZED_NAME_VMS_NONE)
  private VmWhereInput vmsNone;

  public static final String SERIALIZED_NAME_VMS_SOME = "vms_some";
  @SerializedName(SERIALIZED_NAME_VMS_SOME)
  private VmWhereInput vmsSome;

  public static final String SERIALIZED_NAME_WITH_FASTER_SSD_AS_CACHE = "with_faster_ssd_as_cache";
  @SerializedName(SERIALIZED_NAME_WITH_FASTER_SSD_AS_CACHE)
  private Boolean withFasterSsdAsCache;

  public static final String SERIALIZED_NAME_WITH_FASTER_SSD_AS_CACHE_NOT = "with_faster_ssd_as_cache_not";
  @SerializedName(SERIALIZED_NAME_WITH_FASTER_SSD_AS_CACHE_NOT)
  private Boolean withFasterSsdAsCacheNot;

  public HostWhereInput() { 
  }

  public HostWhereInput AND(List<HostWhereInput> AND) {
    
    this.AND = AND;
    return this;
  }

  public HostWhereInput addANDItem(HostWhereInput ANDItem) {
    if (this.AND == null) {
      this.AND = new ArrayList<HostWhereInput>();
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

  public List<HostWhereInput> getAND() {
    return AND;
  }


  public void setAND(List<HostWhereInput> AND) {
    this.AND = AND;
  }


  public HostWhereInput NOT(List<HostWhereInput> NOT) {
    
    this.NOT = NOT;
    return this;
  }

  public HostWhereInput addNOTItem(HostWhereInput NOTItem) {
    if (this.NOT == null) {
      this.NOT = new ArrayList<HostWhereInput>();
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

  public List<HostWhereInput> getNOT() {
    return NOT;
  }


  public void setNOT(List<HostWhereInput> NOT) {
    this.NOT = NOT;
  }


  public HostWhereInput OR(List<HostWhereInput> OR) {
    
    this.OR = OR;
    return this;
  }

  public HostWhereInput addORItem(HostWhereInput ORItem) {
    if (this.OR == null) {
      this.OR = new ArrayList<HostWhereInput>();
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

  public List<HostWhereInput> getOR() {
    return OR;
  }


  public void setOR(List<HostWhereInput> OR) {
    this.OR = OR;
  }


  public HostWhereInput accessIp(String accessIp) {
    
    this.accessIp = accessIp;
    return this;
  }

   /**
   * Get accessIp
   * @return accessIp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAccessIp() {
    return accessIp;
  }


  public void setAccessIp(String accessIp) {
    this.accessIp = accessIp;
  }


  public HostWhereInput accessIpContains(String accessIpContains) {
    
    this.accessIpContains = accessIpContains;
    return this;
  }

   /**
   * Get accessIpContains
   * @return accessIpContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAccessIpContains() {
    return accessIpContains;
  }


  public void setAccessIpContains(String accessIpContains) {
    this.accessIpContains = accessIpContains;
  }


  public HostWhereInput accessIpEndsWith(String accessIpEndsWith) {
    
    this.accessIpEndsWith = accessIpEndsWith;
    return this;
  }

   /**
   * Get accessIpEndsWith
   * @return accessIpEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAccessIpEndsWith() {
    return accessIpEndsWith;
  }


  public void setAccessIpEndsWith(String accessIpEndsWith) {
    this.accessIpEndsWith = accessIpEndsWith;
  }


  public HostWhereInput accessIpGt(String accessIpGt) {
    
    this.accessIpGt = accessIpGt;
    return this;
  }

   /**
   * Get accessIpGt
   * @return accessIpGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAccessIpGt() {
    return accessIpGt;
  }


  public void setAccessIpGt(String accessIpGt) {
    this.accessIpGt = accessIpGt;
  }


  public HostWhereInput accessIpGte(String accessIpGte) {
    
    this.accessIpGte = accessIpGte;
    return this;
  }

   /**
   * Get accessIpGte
   * @return accessIpGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAccessIpGte() {
    return accessIpGte;
  }


  public void setAccessIpGte(String accessIpGte) {
    this.accessIpGte = accessIpGte;
  }


  public HostWhereInput accessIpIn(List<String> accessIpIn) {
    
    this.accessIpIn = accessIpIn;
    return this;
  }

  public HostWhereInput addAccessIpInItem(String accessIpInItem) {
    if (this.accessIpIn == null) {
      this.accessIpIn = new ArrayList<String>();
    }
    this.accessIpIn.add(accessIpInItem);
    return this;
  }

   /**
   * Get accessIpIn
   * @return accessIpIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getAccessIpIn() {
    return accessIpIn;
  }


  public void setAccessIpIn(List<String> accessIpIn) {
    this.accessIpIn = accessIpIn;
  }


  public HostWhereInput accessIpLt(String accessIpLt) {
    
    this.accessIpLt = accessIpLt;
    return this;
  }

   /**
   * Get accessIpLt
   * @return accessIpLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAccessIpLt() {
    return accessIpLt;
  }


  public void setAccessIpLt(String accessIpLt) {
    this.accessIpLt = accessIpLt;
  }


  public HostWhereInput accessIpLte(String accessIpLte) {
    
    this.accessIpLte = accessIpLte;
    return this;
  }

   /**
   * Get accessIpLte
   * @return accessIpLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAccessIpLte() {
    return accessIpLte;
  }


  public void setAccessIpLte(String accessIpLte) {
    this.accessIpLte = accessIpLte;
  }


  public HostWhereInput accessIpNot(String accessIpNot) {
    
    this.accessIpNot = accessIpNot;
    return this;
  }

   /**
   * Get accessIpNot
   * @return accessIpNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAccessIpNot() {
    return accessIpNot;
  }


  public void setAccessIpNot(String accessIpNot) {
    this.accessIpNot = accessIpNot;
  }


  public HostWhereInput accessIpNotContains(String accessIpNotContains) {
    
    this.accessIpNotContains = accessIpNotContains;
    return this;
  }

   /**
   * Get accessIpNotContains
   * @return accessIpNotContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAccessIpNotContains() {
    return accessIpNotContains;
  }


  public void setAccessIpNotContains(String accessIpNotContains) {
    this.accessIpNotContains = accessIpNotContains;
  }


  public HostWhereInput accessIpNotEndsWith(String accessIpNotEndsWith) {
    
    this.accessIpNotEndsWith = accessIpNotEndsWith;
    return this;
  }

   /**
   * Get accessIpNotEndsWith
   * @return accessIpNotEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAccessIpNotEndsWith() {
    return accessIpNotEndsWith;
  }


  public void setAccessIpNotEndsWith(String accessIpNotEndsWith) {
    this.accessIpNotEndsWith = accessIpNotEndsWith;
  }


  public HostWhereInput accessIpNotIn(List<String> accessIpNotIn) {
    
    this.accessIpNotIn = accessIpNotIn;
    return this;
  }

  public HostWhereInput addAccessIpNotInItem(String accessIpNotInItem) {
    if (this.accessIpNotIn == null) {
      this.accessIpNotIn = new ArrayList<String>();
    }
    this.accessIpNotIn.add(accessIpNotInItem);
    return this;
  }

   /**
   * Get accessIpNotIn
   * @return accessIpNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getAccessIpNotIn() {
    return accessIpNotIn;
  }


  public void setAccessIpNotIn(List<String> accessIpNotIn) {
    this.accessIpNotIn = accessIpNotIn;
  }


  public HostWhereInput accessIpNotStartsWith(String accessIpNotStartsWith) {
    
    this.accessIpNotStartsWith = accessIpNotStartsWith;
    return this;
  }

   /**
   * Get accessIpNotStartsWith
   * @return accessIpNotStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAccessIpNotStartsWith() {
    return accessIpNotStartsWith;
  }


  public void setAccessIpNotStartsWith(String accessIpNotStartsWith) {
    this.accessIpNotStartsWith = accessIpNotStartsWith;
  }


  public HostWhereInput accessIpStartsWith(String accessIpStartsWith) {
    
    this.accessIpStartsWith = accessIpStartsWith;
    return this;
  }

   /**
   * Get accessIpStartsWith
   * @return accessIpStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAccessIpStartsWith() {
    return accessIpStartsWith;
  }


  public void setAccessIpStartsWith(String accessIpStartsWith) {
    this.accessIpStartsWith = accessIpStartsWith;
  }


  public HostWhereInput allocableCpuCoresForVmExclusive(Integer allocableCpuCoresForVmExclusive) {
    
    this.allocableCpuCoresForVmExclusive = allocableCpuCoresForVmExclusive;
    return this;
  }

   /**
   * Get allocableCpuCoresForVmExclusive
   * @return allocableCpuCoresForVmExclusive
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getAllocableCpuCoresForVmExclusive() {
    return allocableCpuCoresForVmExclusive;
  }


  public void setAllocableCpuCoresForVmExclusive(Integer allocableCpuCoresForVmExclusive) {
    this.allocableCpuCoresForVmExclusive = allocableCpuCoresForVmExclusive;
  }


  public HostWhereInput allocableCpuCoresForVmExclusiveGt(Integer allocableCpuCoresForVmExclusiveGt) {
    
    this.allocableCpuCoresForVmExclusiveGt = allocableCpuCoresForVmExclusiveGt;
    return this;
  }

   /**
   * Get allocableCpuCoresForVmExclusiveGt
   * @return allocableCpuCoresForVmExclusiveGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getAllocableCpuCoresForVmExclusiveGt() {
    return allocableCpuCoresForVmExclusiveGt;
  }


  public void setAllocableCpuCoresForVmExclusiveGt(Integer allocableCpuCoresForVmExclusiveGt) {
    this.allocableCpuCoresForVmExclusiveGt = allocableCpuCoresForVmExclusiveGt;
  }


  public HostWhereInput allocableCpuCoresForVmExclusiveGte(Integer allocableCpuCoresForVmExclusiveGte) {
    
    this.allocableCpuCoresForVmExclusiveGte = allocableCpuCoresForVmExclusiveGte;
    return this;
  }

   /**
   * Get allocableCpuCoresForVmExclusiveGte
   * @return allocableCpuCoresForVmExclusiveGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getAllocableCpuCoresForVmExclusiveGte() {
    return allocableCpuCoresForVmExclusiveGte;
  }


  public void setAllocableCpuCoresForVmExclusiveGte(Integer allocableCpuCoresForVmExclusiveGte) {
    this.allocableCpuCoresForVmExclusiveGte = allocableCpuCoresForVmExclusiveGte;
  }


  public HostWhereInput allocableCpuCoresForVmExclusiveIn(List<Integer> allocableCpuCoresForVmExclusiveIn) {
    
    this.allocableCpuCoresForVmExclusiveIn = allocableCpuCoresForVmExclusiveIn;
    return this;
  }

  public HostWhereInput addAllocableCpuCoresForVmExclusiveInItem(Integer allocableCpuCoresForVmExclusiveInItem) {
    if (this.allocableCpuCoresForVmExclusiveIn == null) {
      this.allocableCpuCoresForVmExclusiveIn = new ArrayList<Integer>();
    }
    this.allocableCpuCoresForVmExclusiveIn.add(allocableCpuCoresForVmExclusiveInItem);
    return this;
  }

   /**
   * Get allocableCpuCoresForVmExclusiveIn
   * @return allocableCpuCoresForVmExclusiveIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Integer> getAllocableCpuCoresForVmExclusiveIn() {
    return allocableCpuCoresForVmExclusiveIn;
  }


  public void setAllocableCpuCoresForVmExclusiveIn(List<Integer> allocableCpuCoresForVmExclusiveIn) {
    this.allocableCpuCoresForVmExclusiveIn = allocableCpuCoresForVmExclusiveIn;
  }


  public HostWhereInput allocableCpuCoresForVmExclusiveLt(Integer allocableCpuCoresForVmExclusiveLt) {
    
    this.allocableCpuCoresForVmExclusiveLt = allocableCpuCoresForVmExclusiveLt;
    return this;
  }

   /**
   * Get allocableCpuCoresForVmExclusiveLt
   * @return allocableCpuCoresForVmExclusiveLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getAllocableCpuCoresForVmExclusiveLt() {
    return allocableCpuCoresForVmExclusiveLt;
  }


  public void setAllocableCpuCoresForVmExclusiveLt(Integer allocableCpuCoresForVmExclusiveLt) {
    this.allocableCpuCoresForVmExclusiveLt = allocableCpuCoresForVmExclusiveLt;
  }


  public HostWhereInput allocableCpuCoresForVmExclusiveLte(Integer allocableCpuCoresForVmExclusiveLte) {
    
    this.allocableCpuCoresForVmExclusiveLte = allocableCpuCoresForVmExclusiveLte;
    return this;
  }

   /**
   * Get allocableCpuCoresForVmExclusiveLte
   * @return allocableCpuCoresForVmExclusiveLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getAllocableCpuCoresForVmExclusiveLte() {
    return allocableCpuCoresForVmExclusiveLte;
  }


  public void setAllocableCpuCoresForVmExclusiveLte(Integer allocableCpuCoresForVmExclusiveLte) {
    this.allocableCpuCoresForVmExclusiveLte = allocableCpuCoresForVmExclusiveLte;
  }


  public HostWhereInput allocableCpuCoresForVmExclusiveNot(Integer allocableCpuCoresForVmExclusiveNot) {
    
    this.allocableCpuCoresForVmExclusiveNot = allocableCpuCoresForVmExclusiveNot;
    return this;
  }

   /**
   * Get allocableCpuCoresForVmExclusiveNot
   * @return allocableCpuCoresForVmExclusiveNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getAllocableCpuCoresForVmExclusiveNot() {
    return allocableCpuCoresForVmExclusiveNot;
  }


  public void setAllocableCpuCoresForVmExclusiveNot(Integer allocableCpuCoresForVmExclusiveNot) {
    this.allocableCpuCoresForVmExclusiveNot = allocableCpuCoresForVmExclusiveNot;
  }


  public HostWhereInput allocableCpuCoresForVmExclusiveNotIn(List<Integer> allocableCpuCoresForVmExclusiveNotIn) {
    
    this.allocableCpuCoresForVmExclusiveNotIn = allocableCpuCoresForVmExclusiveNotIn;
    return this;
  }

  public HostWhereInput addAllocableCpuCoresForVmExclusiveNotInItem(Integer allocableCpuCoresForVmExclusiveNotInItem) {
    if (this.allocableCpuCoresForVmExclusiveNotIn == null) {
      this.allocableCpuCoresForVmExclusiveNotIn = new ArrayList<Integer>();
    }
    this.allocableCpuCoresForVmExclusiveNotIn.add(allocableCpuCoresForVmExclusiveNotInItem);
    return this;
  }

   /**
   * Get allocableCpuCoresForVmExclusiveNotIn
   * @return allocableCpuCoresForVmExclusiveNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Integer> getAllocableCpuCoresForVmExclusiveNotIn() {
    return allocableCpuCoresForVmExclusiveNotIn;
  }


  public void setAllocableCpuCoresForVmExclusiveNotIn(List<Integer> allocableCpuCoresForVmExclusiveNotIn) {
    this.allocableCpuCoresForVmExclusiveNotIn = allocableCpuCoresForVmExclusiveNotIn;
  }


  public HostWhereInput allocatableMemoryBytes(Long allocatableMemoryBytes) {
    
    this.allocatableMemoryBytes = allocatableMemoryBytes;
    return this;
  }

   /**
   * Get allocatableMemoryBytes
   * @return allocatableMemoryBytes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getAllocatableMemoryBytes() {
    return allocatableMemoryBytes;
  }


  public void setAllocatableMemoryBytes(Long allocatableMemoryBytes) {
    this.allocatableMemoryBytes = allocatableMemoryBytes;
  }


  public HostWhereInput allocatableMemoryBytesGt(Long allocatableMemoryBytesGt) {
    
    this.allocatableMemoryBytesGt = allocatableMemoryBytesGt;
    return this;
  }

   /**
   * Get allocatableMemoryBytesGt
   * @return allocatableMemoryBytesGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getAllocatableMemoryBytesGt() {
    return allocatableMemoryBytesGt;
  }


  public void setAllocatableMemoryBytesGt(Long allocatableMemoryBytesGt) {
    this.allocatableMemoryBytesGt = allocatableMemoryBytesGt;
  }


  public HostWhereInput allocatableMemoryBytesGte(Long allocatableMemoryBytesGte) {
    
    this.allocatableMemoryBytesGte = allocatableMemoryBytesGte;
    return this;
  }

   /**
   * Get allocatableMemoryBytesGte
   * @return allocatableMemoryBytesGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getAllocatableMemoryBytesGte() {
    return allocatableMemoryBytesGte;
  }


  public void setAllocatableMemoryBytesGte(Long allocatableMemoryBytesGte) {
    this.allocatableMemoryBytesGte = allocatableMemoryBytesGte;
  }


  public HostWhereInput allocatableMemoryBytesIn(List<Long> allocatableMemoryBytesIn) {
    
    this.allocatableMemoryBytesIn = allocatableMemoryBytesIn;
    return this;
  }

  public HostWhereInput addAllocatableMemoryBytesInItem(Long allocatableMemoryBytesInItem) {
    if (this.allocatableMemoryBytesIn == null) {
      this.allocatableMemoryBytesIn = new ArrayList<Long>();
    }
    this.allocatableMemoryBytesIn.add(allocatableMemoryBytesInItem);
    return this;
  }

   /**
   * Get allocatableMemoryBytesIn
   * @return allocatableMemoryBytesIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Long> getAllocatableMemoryBytesIn() {
    return allocatableMemoryBytesIn;
  }


  public void setAllocatableMemoryBytesIn(List<Long> allocatableMemoryBytesIn) {
    this.allocatableMemoryBytesIn = allocatableMemoryBytesIn;
  }


  public HostWhereInput allocatableMemoryBytesLt(Long allocatableMemoryBytesLt) {
    
    this.allocatableMemoryBytesLt = allocatableMemoryBytesLt;
    return this;
  }

   /**
   * Get allocatableMemoryBytesLt
   * @return allocatableMemoryBytesLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getAllocatableMemoryBytesLt() {
    return allocatableMemoryBytesLt;
  }


  public void setAllocatableMemoryBytesLt(Long allocatableMemoryBytesLt) {
    this.allocatableMemoryBytesLt = allocatableMemoryBytesLt;
  }


  public HostWhereInput allocatableMemoryBytesLte(Long allocatableMemoryBytesLte) {
    
    this.allocatableMemoryBytesLte = allocatableMemoryBytesLte;
    return this;
  }

   /**
   * Get allocatableMemoryBytesLte
   * @return allocatableMemoryBytesLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getAllocatableMemoryBytesLte() {
    return allocatableMemoryBytesLte;
  }


  public void setAllocatableMemoryBytesLte(Long allocatableMemoryBytesLte) {
    this.allocatableMemoryBytesLte = allocatableMemoryBytesLte;
  }


  public HostWhereInput allocatableMemoryBytesNot(Long allocatableMemoryBytesNot) {
    
    this.allocatableMemoryBytesNot = allocatableMemoryBytesNot;
    return this;
  }

   /**
   * Get allocatableMemoryBytesNot
   * @return allocatableMemoryBytesNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getAllocatableMemoryBytesNot() {
    return allocatableMemoryBytesNot;
  }


  public void setAllocatableMemoryBytesNot(Long allocatableMemoryBytesNot) {
    this.allocatableMemoryBytesNot = allocatableMemoryBytesNot;
  }


  public HostWhereInput allocatableMemoryBytesNotIn(List<Long> allocatableMemoryBytesNotIn) {
    
    this.allocatableMemoryBytesNotIn = allocatableMemoryBytesNotIn;
    return this;
  }

  public HostWhereInput addAllocatableMemoryBytesNotInItem(Long allocatableMemoryBytesNotInItem) {
    if (this.allocatableMemoryBytesNotIn == null) {
      this.allocatableMemoryBytesNotIn = new ArrayList<Long>();
    }
    this.allocatableMemoryBytesNotIn.add(allocatableMemoryBytesNotInItem);
    return this;
  }

   /**
   * Get allocatableMemoryBytesNotIn
   * @return allocatableMemoryBytesNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Long> getAllocatableMemoryBytesNotIn() {
    return allocatableMemoryBytesNotIn;
  }


  public void setAllocatableMemoryBytesNotIn(List<Long> allocatableMemoryBytesNotIn) {
    this.allocatableMemoryBytesNotIn = allocatableMemoryBytesNotIn;
  }


  public HostWhereInput chunkId(String chunkId) {
    
    this.chunkId = chunkId;
    return this;
  }

   /**
   * Get chunkId
   * @return chunkId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getChunkId() {
    return chunkId;
  }


  public void setChunkId(String chunkId) {
    this.chunkId = chunkId;
  }


  public HostWhereInput chunkIdContains(String chunkIdContains) {
    
    this.chunkIdContains = chunkIdContains;
    return this;
  }

   /**
   * Get chunkIdContains
   * @return chunkIdContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getChunkIdContains() {
    return chunkIdContains;
  }


  public void setChunkIdContains(String chunkIdContains) {
    this.chunkIdContains = chunkIdContains;
  }


  public HostWhereInput chunkIdEndsWith(String chunkIdEndsWith) {
    
    this.chunkIdEndsWith = chunkIdEndsWith;
    return this;
  }

   /**
   * Get chunkIdEndsWith
   * @return chunkIdEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getChunkIdEndsWith() {
    return chunkIdEndsWith;
  }


  public void setChunkIdEndsWith(String chunkIdEndsWith) {
    this.chunkIdEndsWith = chunkIdEndsWith;
  }


  public HostWhereInput chunkIdGt(String chunkIdGt) {
    
    this.chunkIdGt = chunkIdGt;
    return this;
  }

   /**
   * Get chunkIdGt
   * @return chunkIdGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getChunkIdGt() {
    return chunkIdGt;
  }


  public void setChunkIdGt(String chunkIdGt) {
    this.chunkIdGt = chunkIdGt;
  }


  public HostWhereInput chunkIdGte(String chunkIdGte) {
    
    this.chunkIdGte = chunkIdGte;
    return this;
  }

   /**
   * Get chunkIdGte
   * @return chunkIdGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getChunkIdGte() {
    return chunkIdGte;
  }


  public void setChunkIdGte(String chunkIdGte) {
    this.chunkIdGte = chunkIdGte;
  }


  public HostWhereInput chunkIdIn(List<String> chunkIdIn) {
    
    this.chunkIdIn = chunkIdIn;
    return this;
  }

  public HostWhereInput addChunkIdInItem(String chunkIdInItem) {
    if (this.chunkIdIn == null) {
      this.chunkIdIn = new ArrayList<String>();
    }
    this.chunkIdIn.add(chunkIdInItem);
    return this;
  }

   /**
   * Get chunkIdIn
   * @return chunkIdIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getChunkIdIn() {
    return chunkIdIn;
  }


  public void setChunkIdIn(List<String> chunkIdIn) {
    this.chunkIdIn = chunkIdIn;
  }


  public HostWhereInput chunkIdLt(String chunkIdLt) {
    
    this.chunkIdLt = chunkIdLt;
    return this;
  }

   /**
   * Get chunkIdLt
   * @return chunkIdLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getChunkIdLt() {
    return chunkIdLt;
  }


  public void setChunkIdLt(String chunkIdLt) {
    this.chunkIdLt = chunkIdLt;
  }


  public HostWhereInput chunkIdLte(String chunkIdLte) {
    
    this.chunkIdLte = chunkIdLte;
    return this;
  }

   /**
   * Get chunkIdLte
   * @return chunkIdLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getChunkIdLte() {
    return chunkIdLte;
  }


  public void setChunkIdLte(String chunkIdLte) {
    this.chunkIdLte = chunkIdLte;
  }


  public HostWhereInput chunkIdNot(String chunkIdNot) {
    
    this.chunkIdNot = chunkIdNot;
    return this;
  }

   /**
   * Get chunkIdNot
   * @return chunkIdNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getChunkIdNot() {
    return chunkIdNot;
  }


  public void setChunkIdNot(String chunkIdNot) {
    this.chunkIdNot = chunkIdNot;
  }


  public HostWhereInput chunkIdNotContains(String chunkIdNotContains) {
    
    this.chunkIdNotContains = chunkIdNotContains;
    return this;
  }

   /**
   * Get chunkIdNotContains
   * @return chunkIdNotContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getChunkIdNotContains() {
    return chunkIdNotContains;
  }


  public void setChunkIdNotContains(String chunkIdNotContains) {
    this.chunkIdNotContains = chunkIdNotContains;
  }


  public HostWhereInput chunkIdNotEndsWith(String chunkIdNotEndsWith) {
    
    this.chunkIdNotEndsWith = chunkIdNotEndsWith;
    return this;
  }

   /**
   * Get chunkIdNotEndsWith
   * @return chunkIdNotEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getChunkIdNotEndsWith() {
    return chunkIdNotEndsWith;
  }


  public void setChunkIdNotEndsWith(String chunkIdNotEndsWith) {
    this.chunkIdNotEndsWith = chunkIdNotEndsWith;
  }


  public HostWhereInput chunkIdNotIn(List<String> chunkIdNotIn) {
    
    this.chunkIdNotIn = chunkIdNotIn;
    return this;
  }

  public HostWhereInput addChunkIdNotInItem(String chunkIdNotInItem) {
    if (this.chunkIdNotIn == null) {
      this.chunkIdNotIn = new ArrayList<String>();
    }
    this.chunkIdNotIn.add(chunkIdNotInItem);
    return this;
  }

   /**
   * Get chunkIdNotIn
   * @return chunkIdNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getChunkIdNotIn() {
    return chunkIdNotIn;
  }


  public void setChunkIdNotIn(List<String> chunkIdNotIn) {
    this.chunkIdNotIn = chunkIdNotIn;
  }


  public HostWhereInput chunkIdNotStartsWith(String chunkIdNotStartsWith) {
    
    this.chunkIdNotStartsWith = chunkIdNotStartsWith;
    return this;
  }

   /**
   * Get chunkIdNotStartsWith
   * @return chunkIdNotStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getChunkIdNotStartsWith() {
    return chunkIdNotStartsWith;
  }


  public void setChunkIdNotStartsWith(String chunkIdNotStartsWith) {
    this.chunkIdNotStartsWith = chunkIdNotStartsWith;
  }


  public HostWhereInput chunkIdStartsWith(String chunkIdStartsWith) {
    
    this.chunkIdStartsWith = chunkIdStartsWith;
    return this;
  }

   /**
   * Get chunkIdStartsWith
   * @return chunkIdStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getChunkIdStartsWith() {
    return chunkIdStartsWith;
  }


  public void setChunkIdStartsWith(String chunkIdStartsWith) {
    this.chunkIdStartsWith = chunkIdStartsWith;
  }


  public HostWhereInput cluster(ClusterWhereInput cluster) {
    
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


  public HostWhereInput cpuBrand(String cpuBrand) {
    
    this.cpuBrand = cpuBrand;
    return this;
  }

   /**
   * Get cpuBrand
   * @return cpuBrand
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCpuBrand() {
    return cpuBrand;
  }


  public void setCpuBrand(String cpuBrand) {
    this.cpuBrand = cpuBrand;
  }


  public HostWhereInput cpuBrandContains(String cpuBrandContains) {
    
    this.cpuBrandContains = cpuBrandContains;
    return this;
  }

   /**
   * Get cpuBrandContains
   * @return cpuBrandContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCpuBrandContains() {
    return cpuBrandContains;
  }


  public void setCpuBrandContains(String cpuBrandContains) {
    this.cpuBrandContains = cpuBrandContains;
  }


  public HostWhereInput cpuBrandEndsWith(String cpuBrandEndsWith) {
    
    this.cpuBrandEndsWith = cpuBrandEndsWith;
    return this;
  }

   /**
   * Get cpuBrandEndsWith
   * @return cpuBrandEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCpuBrandEndsWith() {
    return cpuBrandEndsWith;
  }


  public void setCpuBrandEndsWith(String cpuBrandEndsWith) {
    this.cpuBrandEndsWith = cpuBrandEndsWith;
  }


  public HostWhereInput cpuBrandGt(String cpuBrandGt) {
    
    this.cpuBrandGt = cpuBrandGt;
    return this;
  }

   /**
   * Get cpuBrandGt
   * @return cpuBrandGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCpuBrandGt() {
    return cpuBrandGt;
  }


  public void setCpuBrandGt(String cpuBrandGt) {
    this.cpuBrandGt = cpuBrandGt;
  }


  public HostWhereInput cpuBrandGte(String cpuBrandGte) {
    
    this.cpuBrandGte = cpuBrandGte;
    return this;
  }

   /**
   * Get cpuBrandGte
   * @return cpuBrandGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCpuBrandGte() {
    return cpuBrandGte;
  }


  public void setCpuBrandGte(String cpuBrandGte) {
    this.cpuBrandGte = cpuBrandGte;
  }


  public HostWhereInput cpuBrandIn(List<String> cpuBrandIn) {
    
    this.cpuBrandIn = cpuBrandIn;
    return this;
  }

  public HostWhereInput addCpuBrandInItem(String cpuBrandInItem) {
    if (this.cpuBrandIn == null) {
      this.cpuBrandIn = new ArrayList<String>();
    }
    this.cpuBrandIn.add(cpuBrandInItem);
    return this;
  }

   /**
   * Get cpuBrandIn
   * @return cpuBrandIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getCpuBrandIn() {
    return cpuBrandIn;
  }


  public void setCpuBrandIn(List<String> cpuBrandIn) {
    this.cpuBrandIn = cpuBrandIn;
  }


  public HostWhereInput cpuBrandLt(String cpuBrandLt) {
    
    this.cpuBrandLt = cpuBrandLt;
    return this;
  }

   /**
   * Get cpuBrandLt
   * @return cpuBrandLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCpuBrandLt() {
    return cpuBrandLt;
  }


  public void setCpuBrandLt(String cpuBrandLt) {
    this.cpuBrandLt = cpuBrandLt;
  }


  public HostWhereInput cpuBrandLte(String cpuBrandLte) {
    
    this.cpuBrandLte = cpuBrandLte;
    return this;
  }

   /**
   * Get cpuBrandLte
   * @return cpuBrandLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCpuBrandLte() {
    return cpuBrandLte;
  }


  public void setCpuBrandLte(String cpuBrandLte) {
    this.cpuBrandLte = cpuBrandLte;
  }


  public HostWhereInput cpuBrandNot(String cpuBrandNot) {
    
    this.cpuBrandNot = cpuBrandNot;
    return this;
  }

   /**
   * Get cpuBrandNot
   * @return cpuBrandNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCpuBrandNot() {
    return cpuBrandNot;
  }


  public void setCpuBrandNot(String cpuBrandNot) {
    this.cpuBrandNot = cpuBrandNot;
  }


  public HostWhereInput cpuBrandNotContains(String cpuBrandNotContains) {
    
    this.cpuBrandNotContains = cpuBrandNotContains;
    return this;
  }

   /**
   * Get cpuBrandNotContains
   * @return cpuBrandNotContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCpuBrandNotContains() {
    return cpuBrandNotContains;
  }


  public void setCpuBrandNotContains(String cpuBrandNotContains) {
    this.cpuBrandNotContains = cpuBrandNotContains;
  }


  public HostWhereInput cpuBrandNotEndsWith(String cpuBrandNotEndsWith) {
    
    this.cpuBrandNotEndsWith = cpuBrandNotEndsWith;
    return this;
  }

   /**
   * Get cpuBrandNotEndsWith
   * @return cpuBrandNotEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCpuBrandNotEndsWith() {
    return cpuBrandNotEndsWith;
  }


  public void setCpuBrandNotEndsWith(String cpuBrandNotEndsWith) {
    this.cpuBrandNotEndsWith = cpuBrandNotEndsWith;
  }


  public HostWhereInput cpuBrandNotIn(List<String> cpuBrandNotIn) {
    
    this.cpuBrandNotIn = cpuBrandNotIn;
    return this;
  }

  public HostWhereInput addCpuBrandNotInItem(String cpuBrandNotInItem) {
    if (this.cpuBrandNotIn == null) {
      this.cpuBrandNotIn = new ArrayList<String>();
    }
    this.cpuBrandNotIn.add(cpuBrandNotInItem);
    return this;
  }

   /**
   * Get cpuBrandNotIn
   * @return cpuBrandNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getCpuBrandNotIn() {
    return cpuBrandNotIn;
  }


  public void setCpuBrandNotIn(List<String> cpuBrandNotIn) {
    this.cpuBrandNotIn = cpuBrandNotIn;
  }


  public HostWhereInput cpuBrandNotStartsWith(String cpuBrandNotStartsWith) {
    
    this.cpuBrandNotStartsWith = cpuBrandNotStartsWith;
    return this;
  }

   /**
   * Get cpuBrandNotStartsWith
   * @return cpuBrandNotStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCpuBrandNotStartsWith() {
    return cpuBrandNotStartsWith;
  }


  public void setCpuBrandNotStartsWith(String cpuBrandNotStartsWith) {
    this.cpuBrandNotStartsWith = cpuBrandNotStartsWith;
  }


  public HostWhereInput cpuBrandStartsWith(String cpuBrandStartsWith) {
    
    this.cpuBrandStartsWith = cpuBrandStartsWith;
    return this;
  }

   /**
   * Get cpuBrandStartsWith
   * @return cpuBrandStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCpuBrandStartsWith() {
    return cpuBrandStartsWith;
  }


  public void setCpuBrandStartsWith(String cpuBrandStartsWith) {
    this.cpuBrandStartsWith = cpuBrandStartsWith;
  }


  public HostWhereInput cpuFanSpeedUnit(CpuFanSpeedUnit cpuFanSpeedUnit) {
    
    this.cpuFanSpeedUnit = cpuFanSpeedUnit;
    return this;
  }

   /**
   * Get cpuFanSpeedUnit
   * @return cpuFanSpeedUnit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CpuFanSpeedUnit getCpuFanSpeedUnit() {
    return cpuFanSpeedUnit;
  }


  public void setCpuFanSpeedUnit(CpuFanSpeedUnit cpuFanSpeedUnit) {
    this.cpuFanSpeedUnit = cpuFanSpeedUnit;
  }


  public HostWhereInput cpuFanSpeedUnitIn(List<CpuFanSpeedUnit> cpuFanSpeedUnitIn) {
    
    this.cpuFanSpeedUnitIn = cpuFanSpeedUnitIn;
    return this;
  }

  public HostWhereInput addCpuFanSpeedUnitInItem(CpuFanSpeedUnit cpuFanSpeedUnitInItem) {
    if (this.cpuFanSpeedUnitIn == null) {
      this.cpuFanSpeedUnitIn = new ArrayList<CpuFanSpeedUnit>();
    }
    this.cpuFanSpeedUnitIn.add(cpuFanSpeedUnitInItem);
    return this;
  }

   /**
   * Get cpuFanSpeedUnitIn
   * @return cpuFanSpeedUnitIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<CpuFanSpeedUnit> getCpuFanSpeedUnitIn() {
    return cpuFanSpeedUnitIn;
  }


  public void setCpuFanSpeedUnitIn(List<CpuFanSpeedUnit> cpuFanSpeedUnitIn) {
    this.cpuFanSpeedUnitIn = cpuFanSpeedUnitIn;
  }


  public HostWhereInput cpuFanSpeedUnitNot(CpuFanSpeedUnit cpuFanSpeedUnitNot) {
    
    this.cpuFanSpeedUnitNot = cpuFanSpeedUnitNot;
    return this;
  }

   /**
   * Get cpuFanSpeedUnitNot
   * @return cpuFanSpeedUnitNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CpuFanSpeedUnit getCpuFanSpeedUnitNot() {
    return cpuFanSpeedUnitNot;
  }


  public void setCpuFanSpeedUnitNot(CpuFanSpeedUnit cpuFanSpeedUnitNot) {
    this.cpuFanSpeedUnitNot = cpuFanSpeedUnitNot;
  }


  public HostWhereInput cpuFanSpeedUnitNotIn(List<CpuFanSpeedUnit> cpuFanSpeedUnitNotIn) {
    
    this.cpuFanSpeedUnitNotIn = cpuFanSpeedUnitNotIn;
    return this;
  }

  public HostWhereInput addCpuFanSpeedUnitNotInItem(CpuFanSpeedUnit cpuFanSpeedUnitNotInItem) {
    if (this.cpuFanSpeedUnitNotIn == null) {
      this.cpuFanSpeedUnitNotIn = new ArrayList<CpuFanSpeedUnit>();
    }
    this.cpuFanSpeedUnitNotIn.add(cpuFanSpeedUnitNotInItem);
    return this;
  }

   /**
   * Get cpuFanSpeedUnitNotIn
   * @return cpuFanSpeedUnitNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<CpuFanSpeedUnit> getCpuFanSpeedUnitNotIn() {
    return cpuFanSpeedUnitNotIn;
  }


  public void setCpuFanSpeedUnitNotIn(List<CpuFanSpeedUnit> cpuFanSpeedUnitNotIn) {
    this.cpuFanSpeedUnitNotIn = cpuFanSpeedUnitNotIn;
  }


  public HostWhereInput cpuHzPerCore(Long cpuHzPerCore) {
    
    this.cpuHzPerCore = cpuHzPerCore;
    return this;
  }

   /**
   * Get cpuHzPerCore
   * @return cpuHzPerCore
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getCpuHzPerCore() {
    return cpuHzPerCore;
  }


  public void setCpuHzPerCore(Long cpuHzPerCore) {
    this.cpuHzPerCore = cpuHzPerCore;
  }


  public HostWhereInput cpuHzPerCoreGt(Long cpuHzPerCoreGt) {
    
    this.cpuHzPerCoreGt = cpuHzPerCoreGt;
    return this;
  }

   /**
   * Get cpuHzPerCoreGt
   * @return cpuHzPerCoreGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getCpuHzPerCoreGt() {
    return cpuHzPerCoreGt;
  }


  public void setCpuHzPerCoreGt(Long cpuHzPerCoreGt) {
    this.cpuHzPerCoreGt = cpuHzPerCoreGt;
  }


  public HostWhereInput cpuHzPerCoreGte(Long cpuHzPerCoreGte) {
    
    this.cpuHzPerCoreGte = cpuHzPerCoreGte;
    return this;
  }

   /**
   * Get cpuHzPerCoreGte
   * @return cpuHzPerCoreGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getCpuHzPerCoreGte() {
    return cpuHzPerCoreGte;
  }


  public void setCpuHzPerCoreGte(Long cpuHzPerCoreGte) {
    this.cpuHzPerCoreGte = cpuHzPerCoreGte;
  }


  public HostWhereInput cpuHzPerCoreIn(List<Long> cpuHzPerCoreIn) {
    
    this.cpuHzPerCoreIn = cpuHzPerCoreIn;
    return this;
  }

  public HostWhereInput addCpuHzPerCoreInItem(Long cpuHzPerCoreInItem) {
    if (this.cpuHzPerCoreIn == null) {
      this.cpuHzPerCoreIn = new ArrayList<Long>();
    }
    this.cpuHzPerCoreIn.add(cpuHzPerCoreInItem);
    return this;
  }

   /**
   * Get cpuHzPerCoreIn
   * @return cpuHzPerCoreIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Long> getCpuHzPerCoreIn() {
    return cpuHzPerCoreIn;
  }


  public void setCpuHzPerCoreIn(List<Long> cpuHzPerCoreIn) {
    this.cpuHzPerCoreIn = cpuHzPerCoreIn;
  }


  public HostWhereInput cpuHzPerCoreLt(Long cpuHzPerCoreLt) {
    
    this.cpuHzPerCoreLt = cpuHzPerCoreLt;
    return this;
  }

   /**
   * Get cpuHzPerCoreLt
   * @return cpuHzPerCoreLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getCpuHzPerCoreLt() {
    return cpuHzPerCoreLt;
  }


  public void setCpuHzPerCoreLt(Long cpuHzPerCoreLt) {
    this.cpuHzPerCoreLt = cpuHzPerCoreLt;
  }


  public HostWhereInput cpuHzPerCoreLte(Long cpuHzPerCoreLte) {
    
    this.cpuHzPerCoreLte = cpuHzPerCoreLte;
    return this;
  }

   /**
   * Get cpuHzPerCoreLte
   * @return cpuHzPerCoreLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getCpuHzPerCoreLte() {
    return cpuHzPerCoreLte;
  }


  public void setCpuHzPerCoreLte(Long cpuHzPerCoreLte) {
    this.cpuHzPerCoreLte = cpuHzPerCoreLte;
  }


  public HostWhereInput cpuHzPerCoreNot(Long cpuHzPerCoreNot) {
    
    this.cpuHzPerCoreNot = cpuHzPerCoreNot;
    return this;
  }

   /**
   * Get cpuHzPerCoreNot
   * @return cpuHzPerCoreNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getCpuHzPerCoreNot() {
    return cpuHzPerCoreNot;
  }


  public void setCpuHzPerCoreNot(Long cpuHzPerCoreNot) {
    this.cpuHzPerCoreNot = cpuHzPerCoreNot;
  }


  public HostWhereInput cpuHzPerCoreNotIn(List<Long> cpuHzPerCoreNotIn) {
    
    this.cpuHzPerCoreNotIn = cpuHzPerCoreNotIn;
    return this;
  }

  public HostWhereInput addCpuHzPerCoreNotInItem(Long cpuHzPerCoreNotInItem) {
    if (this.cpuHzPerCoreNotIn == null) {
      this.cpuHzPerCoreNotIn = new ArrayList<Long>();
    }
    this.cpuHzPerCoreNotIn.add(cpuHzPerCoreNotInItem);
    return this;
  }

   /**
   * Get cpuHzPerCoreNotIn
   * @return cpuHzPerCoreNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Long> getCpuHzPerCoreNotIn() {
    return cpuHzPerCoreNotIn;
  }


  public void setCpuHzPerCoreNotIn(List<Long> cpuHzPerCoreNotIn) {
    this.cpuHzPerCoreNotIn = cpuHzPerCoreNotIn;
  }


  public HostWhereInput cpuModel(String cpuModel) {
    
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


  public HostWhereInput cpuModelContains(String cpuModelContains) {
    
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


  public HostWhereInput cpuModelEndsWith(String cpuModelEndsWith) {
    
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


  public HostWhereInput cpuModelGt(String cpuModelGt) {
    
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


  public HostWhereInput cpuModelGte(String cpuModelGte) {
    
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


  public HostWhereInput cpuModelIn(List<String> cpuModelIn) {
    
    this.cpuModelIn = cpuModelIn;
    return this;
  }

  public HostWhereInput addCpuModelInItem(String cpuModelInItem) {
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


  public HostWhereInput cpuModelLt(String cpuModelLt) {
    
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


  public HostWhereInput cpuModelLte(String cpuModelLte) {
    
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


  public HostWhereInput cpuModelNot(String cpuModelNot) {
    
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


  public HostWhereInput cpuModelNotContains(String cpuModelNotContains) {
    
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


  public HostWhereInput cpuModelNotEndsWith(String cpuModelNotEndsWith) {
    
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


  public HostWhereInput cpuModelNotIn(List<String> cpuModelNotIn) {
    
    this.cpuModelNotIn = cpuModelNotIn;
    return this;
  }

  public HostWhereInput addCpuModelNotInItem(String cpuModelNotInItem) {
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


  public HostWhereInput cpuModelNotStartsWith(String cpuModelNotStartsWith) {
    
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


  public HostWhereInput cpuModelStartsWith(String cpuModelStartsWith) {
    
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


  public HostWhereInput cpuVendor(String cpuVendor) {
    
    this.cpuVendor = cpuVendor;
    return this;
  }

   /**
   * Get cpuVendor
   * @return cpuVendor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCpuVendor() {
    return cpuVendor;
  }


  public void setCpuVendor(String cpuVendor) {
    this.cpuVendor = cpuVendor;
  }


  public HostWhereInput cpuVendorContains(String cpuVendorContains) {
    
    this.cpuVendorContains = cpuVendorContains;
    return this;
  }

   /**
   * Get cpuVendorContains
   * @return cpuVendorContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCpuVendorContains() {
    return cpuVendorContains;
  }


  public void setCpuVendorContains(String cpuVendorContains) {
    this.cpuVendorContains = cpuVendorContains;
  }


  public HostWhereInput cpuVendorEndsWith(String cpuVendorEndsWith) {
    
    this.cpuVendorEndsWith = cpuVendorEndsWith;
    return this;
  }

   /**
   * Get cpuVendorEndsWith
   * @return cpuVendorEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCpuVendorEndsWith() {
    return cpuVendorEndsWith;
  }


  public void setCpuVendorEndsWith(String cpuVendorEndsWith) {
    this.cpuVendorEndsWith = cpuVendorEndsWith;
  }


  public HostWhereInput cpuVendorGt(String cpuVendorGt) {
    
    this.cpuVendorGt = cpuVendorGt;
    return this;
  }

   /**
   * Get cpuVendorGt
   * @return cpuVendorGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCpuVendorGt() {
    return cpuVendorGt;
  }


  public void setCpuVendorGt(String cpuVendorGt) {
    this.cpuVendorGt = cpuVendorGt;
  }


  public HostWhereInput cpuVendorGte(String cpuVendorGte) {
    
    this.cpuVendorGte = cpuVendorGte;
    return this;
  }

   /**
   * Get cpuVendorGte
   * @return cpuVendorGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCpuVendorGte() {
    return cpuVendorGte;
  }


  public void setCpuVendorGte(String cpuVendorGte) {
    this.cpuVendorGte = cpuVendorGte;
  }


  public HostWhereInput cpuVendorIn(List<String> cpuVendorIn) {
    
    this.cpuVendorIn = cpuVendorIn;
    return this;
  }

  public HostWhereInput addCpuVendorInItem(String cpuVendorInItem) {
    if (this.cpuVendorIn == null) {
      this.cpuVendorIn = new ArrayList<String>();
    }
    this.cpuVendorIn.add(cpuVendorInItem);
    return this;
  }

   /**
   * Get cpuVendorIn
   * @return cpuVendorIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getCpuVendorIn() {
    return cpuVendorIn;
  }


  public void setCpuVendorIn(List<String> cpuVendorIn) {
    this.cpuVendorIn = cpuVendorIn;
  }


  public HostWhereInput cpuVendorLt(String cpuVendorLt) {
    
    this.cpuVendorLt = cpuVendorLt;
    return this;
  }

   /**
   * Get cpuVendorLt
   * @return cpuVendorLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCpuVendorLt() {
    return cpuVendorLt;
  }


  public void setCpuVendorLt(String cpuVendorLt) {
    this.cpuVendorLt = cpuVendorLt;
  }


  public HostWhereInput cpuVendorLte(String cpuVendorLte) {
    
    this.cpuVendorLte = cpuVendorLte;
    return this;
  }

   /**
   * Get cpuVendorLte
   * @return cpuVendorLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCpuVendorLte() {
    return cpuVendorLte;
  }


  public void setCpuVendorLte(String cpuVendorLte) {
    this.cpuVendorLte = cpuVendorLte;
  }


  public HostWhereInput cpuVendorNot(String cpuVendorNot) {
    
    this.cpuVendorNot = cpuVendorNot;
    return this;
  }

   /**
   * Get cpuVendorNot
   * @return cpuVendorNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCpuVendorNot() {
    return cpuVendorNot;
  }


  public void setCpuVendorNot(String cpuVendorNot) {
    this.cpuVendorNot = cpuVendorNot;
  }


  public HostWhereInput cpuVendorNotContains(String cpuVendorNotContains) {
    
    this.cpuVendorNotContains = cpuVendorNotContains;
    return this;
  }

   /**
   * Get cpuVendorNotContains
   * @return cpuVendorNotContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCpuVendorNotContains() {
    return cpuVendorNotContains;
  }


  public void setCpuVendorNotContains(String cpuVendorNotContains) {
    this.cpuVendorNotContains = cpuVendorNotContains;
  }


  public HostWhereInput cpuVendorNotEndsWith(String cpuVendorNotEndsWith) {
    
    this.cpuVendorNotEndsWith = cpuVendorNotEndsWith;
    return this;
  }

   /**
   * Get cpuVendorNotEndsWith
   * @return cpuVendorNotEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCpuVendorNotEndsWith() {
    return cpuVendorNotEndsWith;
  }


  public void setCpuVendorNotEndsWith(String cpuVendorNotEndsWith) {
    this.cpuVendorNotEndsWith = cpuVendorNotEndsWith;
  }


  public HostWhereInput cpuVendorNotIn(List<String> cpuVendorNotIn) {
    
    this.cpuVendorNotIn = cpuVendorNotIn;
    return this;
  }

  public HostWhereInput addCpuVendorNotInItem(String cpuVendorNotInItem) {
    if (this.cpuVendorNotIn == null) {
      this.cpuVendorNotIn = new ArrayList<String>();
    }
    this.cpuVendorNotIn.add(cpuVendorNotInItem);
    return this;
  }

   /**
   * Get cpuVendorNotIn
   * @return cpuVendorNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getCpuVendorNotIn() {
    return cpuVendorNotIn;
  }


  public void setCpuVendorNotIn(List<String> cpuVendorNotIn) {
    this.cpuVendorNotIn = cpuVendorNotIn;
  }


  public HostWhereInput cpuVendorNotStartsWith(String cpuVendorNotStartsWith) {
    
    this.cpuVendorNotStartsWith = cpuVendorNotStartsWith;
    return this;
  }

   /**
   * Get cpuVendorNotStartsWith
   * @return cpuVendorNotStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCpuVendorNotStartsWith() {
    return cpuVendorNotStartsWith;
  }


  public void setCpuVendorNotStartsWith(String cpuVendorNotStartsWith) {
    this.cpuVendorNotStartsWith = cpuVendorNotStartsWith;
  }


  public HostWhereInput cpuVendorStartsWith(String cpuVendorStartsWith) {
    
    this.cpuVendorStartsWith = cpuVendorStartsWith;
    return this;
  }

   /**
   * Get cpuVendorStartsWith
   * @return cpuVendorStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCpuVendorStartsWith() {
    return cpuVendorStartsWith;
  }


  public void setCpuVendorStartsWith(String cpuVendorStartsWith) {
    this.cpuVendorStartsWith = cpuVendorStartsWith;
  }


  public HostWhereInput dataIp(String dataIp) {
    
    this.dataIp = dataIp;
    return this;
  }

   /**
   * Get dataIp
   * @return dataIp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDataIp() {
    return dataIp;
  }


  public void setDataIp(String dataIp) {
    this.dataIp = dataIp;
  }


  public HostWhereInput dataIpContains(String dataIpContains) {
    
    this.dataIpContains = dataIpContains;
    return this;
  }

   /**
   * Get dataIpContains
   * @return dataIpContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDataIpContains() {
    return dataIpContains;
  }


  public void setDataIpContains(String dataIpContains) {
    this.dataIpContains = dataIpContains;
  }


  public HostWhereInput dataIpEndsWith(String dataIpEndsWith) {
    
    this.dataIpEndsWith = dataIpEndsWith;
    return this;
  }

   /**
   * Get dataIpEndsWith
   * @return dataIpEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDataIpEndsWith() {
    return dataIpEndsWith;
  }


  public void setDataIpEndsWith(String dataIpEndsWith) {
    this.dataIpEndsWith = dataIpEndsWith;
  }


  public HostWhereInput dataIpGt(String dataIpGt) {
    
    this.dataIpGt = dataIpGt;
    return this;
  }

   /**
   * Get dataIpGt
   * @return dataIpGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDataIpGt() {
    return dataIpGt;
  }


  public void setDataIpGt(String dataIpGt) {
    this.dataIpGt = dataIpGt;
  }


  public HostWhereInput dataIpGte(String dataIpGte) {
    
    this.dataIpGte = dataIpGte;
    return this;
  }

   /**
   * Get dataIpGte
   * @return dataIpGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDataIpGte() {
    return dataIpGte;
  }


  public void setDataIpGte(String dataIpGte) {
    this.dataIpGte = dataIpGte;
  }


  public HostWhereInput dataIpIn(List<String> dataIpIn) {
    
    this.dataIpIn = dataIpIn;
    return this;
  }

  public HostWhereInput addDataIpInItem(String dataIpInItem) {
    if (this.dataIpIn == null) {
      this.dataIpIn = new ArrayList<String>();
    }
    this.dataIpIn.add(dataIpInItem);
    return this;
  }

   /**
   * Get dataIpIn
   * @return dataIpIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getDataIpIn() {
    return dataIpIn;
  }


  public void setDataIpIn(List<String> dataIpIn) {
    this.dataIpIn = dataIpIn;
  }


  public HostWhereInput dataIpLt(String dataIpLt) {
    
    this.dataIpLt = dataIpLt;
    return this;
  }

   /**
   * Get dataIpLt
   * @return dataIpLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDataIpLt() {
    return dataIpLt;
  }


  public void setDataIpLt(String dataIpLt) {
    this.dataIpLt = dataIpLt;
  }


  public HostWhereInput dataIpLte(String dataIpLte) {
    
    this.dataIpLte = dataIpLte;
    return this;
  }

   /**
   * Get dataIpLte
   * @return dataIpLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDataIpLte() {
    return dataIpLte;
  }


  public void setDataIpLte(String dataIpLte) {
    this.dataIpLte = dataIpLte;
  }


  public HostWhereInput dataIpNot(String dataIpNot) {
    
    this.dataIpNot = dataIpNot;
    return this;
  }

   /**
   * Get dataIpNot
   * @return dataIpNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDataIpNot() {
    return dataIpNot;
  }


  public void setDataIpNot(String dataIpNot) {
    this.dataIpNot = dataIpNot;
  }


  public HostWhereInput dataIpNotContains(String dataIpNotContains) {
    
    this.dataIpNotContains = dataIpNotContains;
    return this;
  }

   /**
   * Get dataIpNotContains
   * @return dataIpNotContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDataIpNotContains() {
    return dataIpNotContains;
  }


  public void setDataIpNotContains(String dataIpNotContains) {
    this.dataIpNotContains = dataIpNotContains;
  }


  public HostWhereInput dataIpNotEndsWith(String dataIpNotEndsWith) {
    
    this.dataIpNotEndsWith = dataIpNotEndsWith;
    return this;
  }

   /**
   * Get dataIpNotEndsWith
   * @return dataIpNotEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDataIpNotEndsWith() {
    return dataIpNotEndsWith;
  }


  public void setDataIpNotEndsWith(String dataIpNotEndsWith) {
    this.dataIpNotEndsWith = dataIpNotEndsWith;
  }


  public HostWhereInput dataIpNotIn(List<String> dataIpNotIn) {
    
    this.dataIpNotIn = dataIpNotIn;
    return this;
  }

  public HostWhereInput addDataIpNotInItem(String dataIpNotInItem) {
    if (this.dataIpNotIn == null) {
      this.dataIpNotIn = new ArrayList<String>();
    }
    this.dataIpNotIn.add(dataIpNotInItem);
    return this;
  }

   /**
   * Get dataIpNotIn
   * @return dataIpNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getDataIpNotIn() {
    return dataIpNotIn;
  }


  public void setDataIpNotIn(List<String> dataIpNotIn) {
    this.dataIpNotIn = dataIpNotIn;
  }


  public HostWhereInput dataIpNotStartsWith(String dataIpNotStartsWith) {
    
    this.dataIpNotStartsWith = dataIpNotStartsWith;
    return this;
  }

   /**
   * Get dataIpNotStartsWith
   * @return dataIpNotStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDataIpNotStartsWith() {
    return dataIpNotStartsWith;
  }


  public void setDataIpNotStartsWith(String dataIpNotStartsWith) {
    this.dataIpNotStartsWith = dataIpNotStartsWith;
  }


  public HostWhereInput dataIpStartsWith(String dataIpStartsWith) {
    
    this.dataIpStartsWith = dataIpStartsWith;
    return this;
  }

   /**
   * Get dataIpStartsWith
   * @return dataIpStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDataIpStartsWith() {
    return dataIpStartsWith;
  }


  public void setDataIpStartsWith(String dataIpStartsWith) {
    this.dataIpStartsWith = dataIpStartsWith;
  }


  public HostWhereInput entityAsyncStatus(EntityAsyncStatus entityAsyncStatus) {
    
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


  public HostWhereInput entityAsyncStatusIn(List<EntityAsyncStatus> entityAsyncStatusIn) {
    
    this.entityAsyncStatusIn = entityAsyncStatusIn;
    return this;
  }

  public HostWhereInput addEntityAsyncStatusInItem(EntityAsyncStatus entityAsyncStatusInItem) {
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


  public HostWhereInput entityAsyncStatusNot(EntityAsyncStatus entityAsyncStatusNot) {
    
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


  public HostWhereInput entityAsyncStatusNotIn(List<EntityAsyncStatus> entityAsyncStatusNotIn) {
    
    this.entityAsyncStatusNotIn = entityAsyncStatusNotIn;
    return this;
  }

  public HostWhereInput addEntityAsyncStatusNotInItem(EntityAsyncStatus entityAsyncStatusNotInItem) {
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


  public HostWhereInput failureDataSpace(Long failureDataSpace) {
    
    this.failureDataSpace = failureDataSpace;
    return this;
  }

   /**
   * Get failureDataSpace
   * @return failureDataSpace
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getFailureDataSpace() {
    return failureDataSpace;
  }


  public void setFailureDataSpace(Long failureDataSpace) {
    this.failureDataSpace = failureDataSpace;
  }


  public HostWhereInput failureDataSpaceGt(Long failureDataSpaceGt) {
    
    this.failureDataSpaceGt = failureDataSpaceGt;
    return this;
  }

   /**
   * Get failureDataSpaceGt
   * @return failureDataSpaceGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getFailureDataSpaceGt() {
    return failureDataSpaceGt;
  }


  public void setFailureDataSpaceGt(Long failureDataSpaceGt) {
    this.failureDataSpaceGt = failureDataSpaceGt;
  }


  public HostWhereInput failureDataSpaceGte(Long failureDataSpaceGte) {
    
    this.failureDataSpaceGte = failureDataSpaceGte;
    return this;
  }

   /**
   * Get failureDataSpaceGte
   * @return failureDataSpaceGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getFailureDataSpaceGte() {
    return failureDataSpaceGte;
  }


  public void setFailureDataSpaceGte(Long failureDataSpaceGte) {
    this.failureDataSpaceGte = failureDataSpaceGte;
  }


  public HostWhereInput failureDataSpaceIn(List<Long> failureDataSpaceIn) {
    
    this.failureDataSpaceIn = failureDataSpaceIn;
    return this;
  }

  public HostWhereInput addFailureDataSpaceInItem(Long failureDataSpaceInItem) {
    if (this.failureDataSpaceIn == null) {
      this.failureDataSpaceIn = new ArrayList<Long>();
    }
    this.failureDataSpaceIn.add(failureDataSpaceInItem);
    return this;
  }

   /**
   * Get failureDataSpaceIn
   * @return failureDataSpaceIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Long> getFailureDataSpaceIn() {
    return failureDataSpaceIn;
  }


  public void setFailureDataSpaceIn(List<Long> failureDataSpaceIn) {
    this.failureDataSpaceIn = failureDataSpaceIn;
  }


  public HostWhereInput failureDataSpaceLt(Long failureDataSpaceLt) {
    
    this.failureDataSpaceLt = failureDataSpaceLt;
    return this;
  }

   /**
   * Get failureDataSpaceLt
   * @return failureDataSpaceLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getFailureDataSpaceLt() {
    return failureDataSpaceLt;
  }


  public void setFailureDataSpaceLt(Long failureDataSpaceLt) {
    this.failureDataSpaceLt = failureDataSpaceLt;
  }


  public HostWhereInput failureDataSpaceLte(Long failureDataSpaceLte) {
    
    this.failureDataSpaceLte = failureDataSpaceLte;
    return this;
  }

   /**
   * Get failureDataSpaceLte
   * @return failureDataSpaceLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getFailureDataSpaceLte() {
    return failureDataSpaceLte;
  }


  public void setFailureDataSpaceLte(Long failureDataSpaceLte) {
    this.failureDataSpaceLte = failureDataSpaceLte;
  }


  public HostWhereInput failureDataSpaceNot(Long failureDataSpaceNot) {
    
    this.failureDataSpaceNot = failureDataSpaceNot;
    return this;
  }

   /**
   * Get failureDataSpaceNot
   * @return failureDataSpaceNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getFailureDataSpaceNot() {
    return failureDataSpaceNot;
  }


  public void setFailureDataSpaceNot(Long failureDataSpaceNot) {
    this.failureDataSpaceNot = failureDataSpaceNot;
  }


  public HostWhereInput failureDataSpaceNotIn(List<Long> failureDataSpaceNotIn) {
    
    this.failureDataSpaceNotIn = failureDataSpaceNotIn;
    return this;
  }

  public HostWhereInput addFailureDataSpaceNotInItem(Long failureDataSpaceNotInItem) {
    if (this.failureDataSpaceNotIn == null) {
      this.failureDataSpaceNotIn = new ArrayList<Long>();
    }
    this.failureDataSpaceNotIn.add(failureDataSpaceNotInItem);
    return this;
  }

   /**
   * Get failureDataSpaceNotIn
   * @return failureDataSpaceNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Long> getFailureDataSpaceNotIn() {
    return failureDataSpaceNotIn;
  }


  public void setFailureDataSpaceNotIn(List<Long> failureDataSpaceNotIn) {
    this.failureDataSpaceNotIn = failureDataSpaceNotIn;
  }


  public HostWhereInput gpuDevicesEvery(GpuDeviceWhereInput gpuDevicesEvery) {
    
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


  public HostWhereInput gpuDevicesNone(GpuDeviceWhereInput gpuDevicesNone) {
    
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


  public HostWhereInput gpuDevicesSome(GpuDeviceWhereInput gpuDevicesSome) {
    
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


  public HostWhereInput hddDataCapacity(Long hddDataCapacity) {
    
    this.hddDataCapacity = hddDataCapacity;
    return this;
  }

   /**
   * Get hddDataCapacity
   * @return hddDataCapacity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getHddDataCapacity() {
    return hddDataCapacity;
  }


  public void setHddDataCapacity(Long hddDataCapacity) {
    this.hddDataCapacity = hddDataCapacity;
  }


  public HostWhereInput hddDataCapacityGt(Long hddDataCapacityGt) {
    
    this.hddDataCapacityGt = hddDataCapacityGt;
    return this;
  }

   /**
   * Get hddDataCapacityGt
   * @return hddDataCapacityGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getHddDataCapacityGt() {
    return hddDataCapacityGt;
  }


  public void setHddDataCapacityGt(Long hddDataCapacityGt) {
    this.hddDataCapacityGt = hddDataCapacityGt;
  }


  public HostWhereInput hddDataCapacityGte(Long hddDataCapacityGte) {
    
    this.hddDataCapacityGte = hddDataCapacityGte;
    return this;
  }

   /**
   * Get hddDataCapacityGte
   * @return hddDataCapacityGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getHddDataCapacityGte() {
    return hddDataCapacityGte;
  }


  public void setHddDataCapacityGte(Long hddDataCapacityGte) {
    this.hddDataCapacityGte = hddDataCapacityGte;
  }


  public HostWhereInput hddDataCapacityIn(List<Long> hddDataCapacityIn) {
    
    this.hddDataCapacityIn = hddDataCapacityIn;
    return this;
  }

  public HostWhereInput addHddDataCapacityInItem(Long hddDataCapacityInItem) {
    if (this.hddDataCapacityIn == null) {
      this.hddDataCapacityIn = new ArrayList<Long>();
    }
    this.hddDataCapacityIn.add(hddDataCapacityInItem);
    return this;
  }

   /**
   * Get hddDataCapacityIn
   * @return hddDataCapacityIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Long> getHddDataCapacityIn() {
    return hddDataCapacityIn;
  }


  public void setHddDataCapacityIn(List<Long> hddDataCapacityIn) {
    this.hddDataCapacityIn = hddDataCapacityIn;
  }


  public HostWhereInput hddDataCapacityLt(Long hddDataCapacityLt) {
    
    this.hddDataCapacityLt = hddDataCapacityLt;
    return this;
  }

   /**
   * Get hddDataCapacityLt
   * @return hddDataCapacityLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getHddDataCapacityLt() {
    return hddDataCapacityLt;
  }


  public void setHddDataCapacityLt(Long hddDataCapacityLt) {
    this.hddDataCapacityLt = hddDataCapacityLt;
  }


  public HostWhereInput hddDataCapacityLte(Long hddDataCapacityLte) {
    
    this.hddDataCapacityLte = hddDataCapacityLte;
    return this;
  }

   /**
   * Get hddDataCapacityLte
   * @return hddDataCapacityLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getHddDataCapacityLte() {
    return hddDataCapacityLte;
  }


  public void setHddDataCapacityLte(Long hddDataCapacityLte) {
    this.hddDataCapacityLte = hddDataCapacityLte;
  }


  public HostWhereInput hddDataCapacityNot(Long hddDataCapacityNot) {
    
    this.hddDataCapacityNot = hddDataCapacityNot;
    return this;
  }

   /**
   * Get hddDataCapacityNot
   * @return hddDataCapacityNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getHddDataCapacityNot() {
    return hddDataCapacityNot;
  }


  public void setHddDataCapacityNot(Long hddDataCapacityNot) {
    this.hddDataCapacityNot = hddDataCapacityNot;
  }


  public HostWhereInput hddDataCapacityNotIn(List<Long> hddDataCapacityNotIn) {
    
    this.hddDataCapacityNotIn = hddDataCapacityNotIn;
    return this;
  }

  public HostWhereInput addHddDataCapacityNotInItem(Long hddDataCapacityNotInItem) {
    if (this.hddDataCapacityNotIn == null) {
      this.hddDataCapacityNotIn = new ArrayList<Long>();
    }
    this.hddDataCapacityNotIn.add(hddDataCapacityNotInItem);
    return this;
  }

   /**
   * Get hddDataCapacityNotIn
   * @return hddDataCapacityNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Long> getHddDataCapacityNotIn() {
    return hddDataCapacityNotIn;
  }


  public void setHddDataCapacityNotIn(List<Long> hddDataCapacityNotIn) {
    this.hddDataCapacityNotIn = hddDataCapacityNotIn;
  }


  public HostWhereInput hddDiskCount(Integer hddDiskCount) {
    
    this.hddDiskCount = hddDiskCount;
    return this;
  }

   /**
   * Get hddDiskCount
   * @return hddDiskCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getHddDiskCount() {
    return hddDiskCount;
  }


  public void setHddDiskCount(Integer hddDiskCount) {
    this.hddDiskCount = hddDiskCount;
  }


  public HostWhereInput hddDiskCountGt(Integer hddDiskCountGt) {
    
    this.hddDiskCountGt = hddDiskCountGt;
    return this;
  }

   /**
   * Get hddDiskCountGt
   * @return hddDiskCountGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getHddDiskCountGt() {
    return hddDiskCountGt;
  }


  public void setHddDiskCountGt(Integer hddDiskCountGt) {
    this.hddDiskCountGt = hddDiskCountGt;
  }


  public HostWhereInput hddDiskCountGte(Integer hddDiskCountGte) {
    
    this.hddDiskCountGte = hddDiskCountGte;
    return this;
  }

   /**
   * Get hddDiskCountGte
   * @return hddDiskCountGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getHddDiskCountGte() {
    return hddDiskCountGte;
  }


  public void setHddDiskCountGte(Integer hddDiskCountGte) {
    this.hddDiskCountGte = hddDiskCountGte;
  }


  public HostWhereInput hddDiskCountIn(List<Integer> hddDiskCountIn) {
    
    this.hddDiskCountIn = hddDiskCountIn;
    return this;
  }

  public HostWhereInput addHddDiskCountInItem(Integer hddDiskCountInItem) {
    if (this.hddDiskCountIn == null) {
      this.hddDiskCountIn = new ArrayList<Integer>();
    }
    this.hddDiskCountIn.add(hddDiskCountInItem);
    return this;
  }

   /**
   * Get hddDiskCountIn
   * @return hddDiskCountIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Integer> getHddDiskCountIn() {
    return hddDiskCountIn;
  }


  public void setHddDiskCountIn(List<Integer> hddDiskCountIn) {
    this.hddDiskCountIn = hddDiskCountIn;
  }


  public HostWhereInput hddDiskCountLt(Integer hddDiskCountLt) {
    
    this.hddDiskCountLt = hddDiskCountLt;
    return this;
  }

   /**
   * Get hddDiskCountLt
   * @return hddDiskCountLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getHddDiskCountLt() {
    return hddDiskCountLt;
  }


  public void setHddDiskCountLt(Integer hddDiskCountLt) {
    this.hddDiskCountLt = hddDiskCountLt;
  }


  public HostWhereInput hddDiskCountLte(Integer hddDiskCountLte) {
    
    this.hddDiskCountLte = hddDiskCountLte;
    return this;
  }

   /**
   * Get hddDiskCountLte
   * @return hddDiskCountLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getHddDiskCountLte() {
    return hddDiskCountLte;
  }


  public void setHddDiskCountLte(Integer hddDiskCountLte) {
    this.hddDiskCountLte = hddDiskCountLte;
  }


  public HostWhereInput hddDiskCountNot(Integer hddDiskCountNot) {
    
    this.hddDiskCountNot = hddDiskCountNot;
    return this;
  }

   /**
   * Get hddDiskCountNot
   * @return hddDiskCountNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getHddDiskCountNot() {
    return hddDiskCountNot;
  }


  public void setHddDiskCountNot(Integer hddDiskCountNot) {
    this.hddDiskCountNot = hddDiskCountNot;
  }


  public HostWhereInput hddDiskCountNotIn(List<Integer> hddDiskCountNotIn) {
    
    this.hddDiskCountNotIn = hddDiskCountNotIn;
    return this;
  }

  public HostWhereInput addHddDiskCountNotInItem(Integer hddDiskCountNotInItem) {
    if (this.hddDiskCountNotIn == null) {
      this.hddDiskCountNotIn = new ArrayList<Integer>();
    }
    this.hddDiskCountNotIn.add(hddDiskCountNotInItem);
    return this;
  }

   /**
   * Get hddDiskCountNotIn
   * @return hddDiskCountNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Integer> getHddDiskCountNotIn() {
    return hddDiskCountNotIn;
  }


  public void setHddDiskCountNotIn(List<Integer> hddDiskCountNotIn) {
    this.hddDiskCountNotIn = hddDiskCountNotIn;
  }


  public HostWhereInput hypervisorIp(String hypervisorIp) {
    
    this.hypervisorIp = hypervisorIp;
    return this;
  }

   /**
   * Get hypervisorIp
   * @return hypervisorIp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getHypervisorIp() {
    return hypervisorIp;
  }


  public void setHypervisorIp(String hypervisorIp) {
    this.hypervisorIp = hypervisorIp;
  }


  public HostWhereInput hypervisorIpContains(String hypervisorIpContains) {
    
    this.hypervisorIpContains = hypervisorIpContains;
    return this;
  }

   /**
   * Get hypervisorIpContains
   * @return hypervisorIpContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getHypervisorIpContains() {
    return hypervisorIpContains;
  }


  public void setHypervisorIpContains(String hypervisorIpContains) {
    this.hypervisorIpContains = hypervisorIpContains;
  }


  public HostWhereInput hypervisorIpEndsWith(String hypervisorIpEndsWith) {
    
    this.hypervisorIpEndsWith = hypervisorIpEndsWith;
    return this;
  }

   /**
   * Get hypervisorIpEndsWith
   * @return hypervisorIpEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getHypervisorIpEndsWith() {
    return hypervisorIpEndsWith;
  }


  public void setHypervisorIpEndsWith(String hypervisorIpEndsWith) {
    this.hypervisorIpEndsWith = hypervisorIpEndsWith;
  }


  public HostWhereInput hypervisorIpGt(String hypervisorIpGt) {
    
    this.hypervisorIpGt = hypervisorIpGt;
    return this;
  }

   /**
   * Get hypervisorIpGt
   * @return hypervisorIpGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getHypervisorIpGt() {
    return hypervisorIpGt;
  }


  public void setHypervisorIpGt(String hypervisorIpGt) {
    this.hypervisorIpGt = hypervisorIpGt;
  }


  public HostWhereInput hypervisorIpGte(String hypervisorIpGte) {
    
    this.hypervisorIpGte = hypervisorIpGte;
    return this;
  }

   /**
   * Get hypervisorIpGte
   * @return hypervisorIpGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getHypervisorIpGte() {
    return hypervisorIpGte;
  }


  public void setHypervisorIpGte(String hypervisorIpGte) {
    this.hypervisorIpGte = hypervisorIpGte;
  }


  public HostWhereInput hypervisorIpIn(List<String> hypervisorIpIn) {
    
    this.hypervisorIpIn = hypervisorIpIn;
    return this;
  }

  public HostWhereInput addHypervisorIpInItem(String hypervisorIpInItem) {
    if (this.hypervisorIpIn == null) {
      this.hypervisorIpIn = new ArrayList<String>();
    }
    this.hypervisorIpIn.add(hypervisorIpInItem);
    return this;
  }

   /**
   * Get hypervisorIpIn
   * @return hypervisorIpIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getHypervisorIpIn() {
    return hypervisorIpIn;
  }


  public void setHypervisorIpIn(List<String> hypervisorIpIn) {
    this.hypervisorIpIn = hypervisorIpIn;
  }


  public HostWhereInput hypervisorIpLt(String hypervisorIpLt) {
    
    this.hypervisorIpLt = hypervisorIpLt;
    return this;
  }

   /**
   * Get hypervisorIpLt
   * @return hypervisorIpLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getHypervisorIpLt() {
    return hypervisorIpLt;
  }


  public void setHypervisorIpLt(String hypervisorIpLt) {
    this.hypervisorIpLt = hypervisorIpLt;
  }


  public HostWhereInput hypervisorIpLte(String hypervisorIpLte) {
    
    this.hypervisorIpLte = hypervisorIpLte;
    return this;
  }

   /**
   * Get hypervisorIpLte
   * @return hypervisorIpLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getHypervisorIpLte() {
    return hypervisorIpLte;
  }


  public void setHypervisorIpLte(String hypervisorIpLte) {
    this.hypervisorIpLte = hypervisorIpLte;
  }


  public HostWhereInput hypervisorIpNot(String hypervisorIpNot) {
    
    this.hypervisorIpNot = hypervisorIpNot;
    return this;
  }

   /**
   * Get hypervisorIpNot
   * @return hypervisorIpNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getHypervisorIpNot() {
    return hypervisorIpNot;
  }


  public void setHypervisorIpNot(String hypervisorIpNot) {
    this.hypervisorIpNot = hypervisorIpNot;
  }


  public HostWhereInput hypervisorIpNotContains(String hypervisorIpNotContains) {
    
    this.hypervisorIpNotContains = hypervisorIpNotContains;
    return this;
  }

   /**
   * Get hypervisorIpNotContains
   * @return hypervisorIpNotContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getHypervisorIpNotContains() {
    return hypervisorIpNotContains;
  }


  public void setHypervisorIpNotContains(String hypervisorIpNotContains) {
    this.hypervisorIpNotContains = hypervisorIpNotContains;
  }


  public HostWhereInput hypervisorIpNotEndsWith(String hypervisorIpNotEndsWith) {
    
    this.hypervisorIpNotEndsWith = hypervisorIpNotEndsWith;
    return this;
  }

   /**
   * Get hypervisorIpNotEndsWith
   * @return hypervisorIpNotEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getHypervisorIpNotEndsWith() {
    return hypervisorIpNotEndsWith;
  }


  public void setHypervisorIpNotEndsWith(String hypervisorIpNotEndsWith) {
    this.hypervisorIpNotEndsWith = hypervisorIpNotEndsWith;
  }


  public HostWhereInput hypervisorIpNotIn(List<String> hypervisorIpNotIn) {
    
    this.hypervisorIpNotIn = hypervisorIpNotIn;
    return this;
  }

  public HostWhereInput addHypervisorIpNotInItem(String hypervisorIpNotInItem) {
    if (this.hypervisorIpNotIn == null) {
      this.hypervisorIpNotIn = new ArrayList<String>();
    }
    this.hypervisorIpNotIn.add(hypervisorIpNotInItem);
    return this;
  }

   /**
   * Get hypervisorIpNotIn
   * @return hypervisorIpNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getHypervisorIpNotIn() {
    return hypervisorIpNotIn;
  }


  public void setHypervisorIpNotIn(List<String> hypervisorIpNotIn) {
    this.hypervisorIpNotIn = hypervisorIpNotIn;
  }


  public HostWhereInput hypervisorIpNotStartsWith(String hypervisorIpNotStartsWith) {
    
    this.hypervisorIpNotStartsWith = hypervisorIpNotStartsWith;
    return this;
  }

   /**
   * Get hypervisorIpNotStartsWith
   * @return hypervisorIpNotStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getHypervisorIpNotStartsWith() {
    return hypervisorIpNotStartsWith;
  }


  public void setHypervisorIpNotStartsWith(String hypervisorIpNotStartsWith) {
    this.hypervisorIpNotStartsWith = hypervisorIpNotStartsWith;
  }


  public HostWhereInput hypervisorIpStartsWith(String hypervisorIpStartsWith) {
    
    this.hypervisorIpStartsWith = hypervisorIpStartsWith;
    return this;
  }

   /**
   * Get hypervisorIpStartsWith
   * @return hypervisorIpStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getHypervisorIpStartsWith() {
    return hypervisorIpStartsWith;
  }


  public void setHypervisorIpStartsWith(String hypervisorIpStartsWith) {
    this.hypervisorIpStartsWith = hypervisorIpStartsWith;
  }


  public HostWhereInput id(String id) {
    
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


  public HostWhereInput idContains(String idContains) {
    
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


  public HostWhereInput idEndsWith(String idEndsWith) {
    
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


  public HostWhereInput idGt(String idGt) {
    
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


  public HostWhereInput idGte(String idGte) {
    
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


  public HostWhereInput idIn(List<String> idIn) {
    
    this.idIn = idIn;
    return this;
  }

  public HostWhereInput addIdInItem(String idInItem) {
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


  public HostWhereInput idLt(String idLt) {
    
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


  public HostWhereInput idLte(String idLte) {
    
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


  public HostWhereInput idNot(String idNot) {
    
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


  public HostWhereInput idNotContains(String idNotContains) {
    
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


  public HostWhereInput idNotEndsWith(String idNotEndsWith) {
    
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


  public HostWhereInput idNotIn(List<String> idNotIn) {
    
    this.idNotIn = idNotIn;
    return this;
  }

  public HostWhereInput addIdNotInItem(String idNotInItem) {
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


  public HostWhereInput idNotStartsWith(String idNotStartsWith) {
    
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


  public HostWhereInput idStartsWith(String idStartsWith) {
    
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


  public HostWhereInput iommu(IommuStatus iommu) {
    
    this.iommu = iommu;
    return this;
  }

   /**
   * Get iommu
   * @return iommu
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public IommuStatus getIommu() {
    return iommu;
  }


  public void setIommu(IommuStatus iommu) {
    this.iommu = iommu;
  }


  public HostWhereInput iommuIn(List<IommuStatus> iommuIn) {
    
    this.iommuIn = iommuIn;
    return this;
  }

  public HostWhereInput addIommuInItem(IommuStatus iommuInItem) {
    if (this.iommuIn == null) {
      this.iommuIn = new ArrayList<IommuStatus>();
    }
    this.iommuIn.add(iommuInItem);
    return this;
  }

   /**
   * Get iommuIn
   * @return iommuIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<IommuStatus> getIommuIn() {
    return iommuIn;
  }


  public void setIommuIn(List<IommuStatus> iommuIn) {
    this.iommuIn = iommuIn;
  }


  public HostWhereInput iommuNot(IommuStatus iommuNot) {
    
    this.iommuNot = iommuNot;
    return this;
  }

   /**
   * Get iommuNot
   * @return iommuNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public IommuStatus getIommuNot() {
    return iommuNot;
  }


  public void setIommuNot(IommuStatus iommuNot) {
    this.iommuNot = iommuNot;
  }


  public HostWhereInput iommuNotIn(List<IommuStatus> iommuNotIn) {
    
    this.iommuNotIn = iommuNotIn;
    return this;
  }

  public HostWhereInput addIommuNotInItem(IommuStatus iommuNotInItem) {
    if (this.iommuNotIn == null) {
      this.iommuNotIn = new ArrayList<IommuStatus>();
    }
    this.iommuNotIn.add(iommuNotInItem);
    return this;
  }

   /**
   * Get iommuNotIn
   * @return iommuNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<IommuStatus> getIommuNotIn() {
    return iommuNotIn;
  }


  public void setIommuNotIn(List<IommuStatus> iommuNotIn) {
    this.iommuNotIn = iommuNotIn;
  }


  public HostWhereInput isOsInRaid1(Boolean isOsInRaid1) {
    
    this.isOsInRaid1 = isOsInRaid1;
    return this;
  }

   /**
   * Get isOsInRaid1
   * @return isOsInRaid1
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsOsInRaid1() {
    return isOsInRaid1;
  }


  public void setIsOsInRaid1(Boolean isOsInRaid1) {
    this.isOsInRaid1 = isOsInRaid1;
  }


  public HostWhereInput isOsInRaid1Not(Boolean isOsInRaid1Not) {
    
    this.isOsInRaid1Not = isOsInRaid1Not;
    return this;
  }

   /**
   * Get isOsInRaid1Not
   * @return isOsInRaid1Not
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsOsInRaid1Not() {
    return isOsInRaid1Not;
  }


  public void setIsOsInRaid1Not(Boolean isOsInRaid1Not) {
    this.isOsInRaid1Not = isOsInRaid1Not;
  }


  public HostWhereInput labelsEvery(LabelWhereInput labelsEvery) {
    
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


  public HostWhereInput labelsNone(LabelWhereInput labelsNone) {
    
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


  public HostWhereInput labelsSome(LabelWhereInput labelsSome) {
    
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


  public HostWhereInput localId(String localId) {
    
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


  public HostWhereInput localIdContains(String localIdContains) {
    
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


  public HostWhereInput localIdEndsWith(String localIdEndsWith) {
    
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


  public HostWhereInput localIdGt(String localIdGt) {
    
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


  public HostWhereInput localIdGte(String localIdGte) {
    
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


  public HostWhereInput localIdIn(List<String> localIdIn) {
    
    this.localIdIn = localIdIn;
    return this;
  }

  public HostWhereInput addLocalIdInItem(String localIdInItem) {
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


  public HostWhereInput localIdLt(String localIdLt) {
    
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


  public HostWhereInput localIdLte(String localIdLte) {
    
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


  public HostWhereInput localIdNot(String localIdNot) {
    
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


  public HostWhereInput localIdNotContains(String localIdNotContains) {
    
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


  public HostWhereInput localIdNotEndsWith(String localIdNotEndsWith) {
    
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


  public HostWhereInput localIdNotIn(List<String> localIdNotIn) {
    
    this.localIdNotIn = localIdNotIn;
    return this;
  }

  public HostWhereInput addLocalIdNotInItem(String localIdNotInItem) {
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


  public HostWhereInput localIdNotStartsWith(String localIdNotStartsWith) {
    
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


  public HostWhereInput localIdStartsWith(String localIdStartsWith) {
    
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


  public HostWhereInput lsmCapDiskSafeUmount(Boolean lsmCapDiskSafeUmount) {
    
    this.lsmCapDiskSafeUmount = lsmCapDiskSafeUmount;
    return this;
  }

   /**
   * Get lsmCapDiskSafeUmount
   * @return lsmCapDiskSafeUmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getLsmCapDiskSafeUmount() {
    return lsmCapDiskSafeUmount;
  }


  public void setLsmCapDiskSafeUmount(Boolean lsmCapDiskSafeUmount) {
    this.lsmCapDiskSafeUmount = lsmCapDiskSafeUmount;
  }


  public HostWhereInput lsmCapDiskSafeUmountNot(Boolean lsmCapDiskSafeUmountNot) {
    
    this.lsmCapDiskSafeUmountNot = lsmCapDiskSafeUmountNot;
    return this;
  }

   /**
   * Get lsmCapDiskSafeUmountNot
   * @return lsmCapDiskSafeUmountNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getLsmCapDiskSafeUmountNot() {
    return lsmCapDiskSafeUmountNot;
  }


  public void setLsmCapDiskSafeUmountNot(Boolean lsmCapDiskSafeUmountNot) {
    this.lsmCapDiskSafeUmountNot = lsmCapDiskSafeUmountNot;
  }


  public HostWhereInput managementIp(String managementIp) {
    
    this.managementIp = managementIp;
    return this;
  }

   /**
   * Get managementIp
   * @return managementIp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getManagementIp() {
    return managementIp;
  }


  public void setManagementIp(String managementIp) {
    this.managementIp = managementIp;
  }


  public HostWhereInput managementIpContains(String managementIpContains) {
    
    this.managementIpContains = managementIpContains;
    return this;
  }

   /**
   * Get managementIpContains
   * @return managementIpContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getManagementIpContains() {
    return managementIpContains;
  }


  public void setManagementIpContains(String managementIpContains) {
    this.managementIpContains = managementIpContains;
  }


  public HostWhereInput managementIpEndsWith(String managementIpEndsWith) {
    
    this.managementIpEndsWith = managementIpEndsWith;
    return this;
  }

   /**
   * Get managementIpEndsWith
   * @return managementIpEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getManagementIpEndsWith() {
    return managementIpEndsWith;
  }


  public void setManagementIpEndsWith(String managementIpEndsWith) {
    this.managementIpEndsWith = managementIpEndsWith;
  }


  public HostWhereInput managementIpGt(String managementIpGt) {
    
    this.managementIpGt = managementIpGt;
    return this;
  }

   /**
   * Get managementIpGt
   * @return managementIpGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getManagementIpGt() {
    return managementIpGt;
  }


  public void setManagementIpGt(String managementIpGt) {
    this.managementIpGt = managementIpGt;
  }


  public HostWhereInput managementIpGte(String managementIpGte) {
    
    this.managementIpGte = managementIpGte;
    return this;
  }

   /**
   * Get managementIpGte
   * @return managementIpGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getManagementIpGte() {
    return managementIpGte;
  }


  public void setManagementIpGte(String managementIpGte) {
    this.managementIpGte = managementIpGte;
  }


  public HostWhereInput managementIpIn(List<String> managementIpIn) {
    
    this.managementIpIn = managementIpIn;
    return this;
  }

  public HostWhereInput addManagementIpInItem(String managementIpInItem) {
    if (this.managementIpIn == null) {
      this.managementIpIn = new ArrayList<String>();
    }
    this.managementIpIn.add(managementIpInItem);
    return this;
  }

   /**
   * Get managementIpIn
   * @return managementIpIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getManagementIpIn() {
    return managementIpIn;
  }


  public void setManagementIpIn(List<String> managementIpIn) {
    this.managementIpIn = managementIpIn;
  }


  public HostWhereInput managementIpLt(String managementIpLt) {
    
    this.managementIpLt = managementIpLt;
    return this;
  }

   /**
   * Get managementIpLt
   * @return managementIpLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getManagementIpLt() {
    return managementIpLt;
  }


  public void setManagementIpLt(String managementIpLt) {
    this.managementIpLt = managementIpLt;
  }


  public HostWhereInput managementIpLte(String managementIpLte) {
    
    this.managementIpLte = managementIpLte;
    return this;
  }

   /**
   * Get managementIpLte
   * @return managementIpLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getManagementIpLte() {
    return managementIpLte;
  }


  public void setManagementIpLte(String managementIpLte) {
    this.managementIpLte = managementIpLte;
  }


  public HostWhereInput managementIpNot(String managementIpNot) {
    
    this.managementIpNot = managementIpNot;
    return this;
  }

   /**
   * Get managementIpNot
   * @return managementIpNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getManagementIpNot() {
    return managementIpNot;
  }


  public void setManagementIpNot(String managementIpNot) {
    this.managementIpNot = managementIpNot;
  }


  public HostWhereInput managementIpNotContains(String managementIpNotContains) {
    
    this.managementIpNotContains = managementIpNotContains;
    return this;
  }

   /**
   * Get managementIpNotContains
   * @return managementIpNotContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getManagementIpNotContains() {
    return managementIpNotContains;
  }


  public void setManagementIpNotContains(String managementIpNotContains) {
    this.managementIpNotContains = managementIpNotContains;
  }


  public HostWhereInput managementIpNotEndsWith(String managementIpNotEndsWith) {
    
    this.managementIpNotEndsWith = managementIpNotEndsWith;
    return this;
  }

   /**
   * Get managementIpNotEndsWith
   * @return managementIpNotEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getManagementIpNotEndsWith() {
    return managementIpNotEndsWith;
  }


  public void setManagementIpNotEndsWith(String managementIpNotEndsWith) {
    this.managementIpNotEndsWith = managementIpNotEndsWith;
  }


  public HostWhereInput managementIpNotIn(List<String> managementIpNotIn) {
    
    this.managementIpNotIn = managementIpNotIn;
    return this;
  }

  public HostWhereInput addManagementIpNotInItem(String managementIpNotInItem) {
    if (this.managementIpNotIn == null) {
      this.managementIpNotIn = new ArrayList<String>();
    }
    this.managementIpNotIn.add(managementIpNotInItem);
    return this;
  }

   /**
   * Get managementIpNotIn
   * @return managementIpNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getManagementIpNotIn() {
    return managementIpNotIn;
  }


  public void setManagementIpNotIn(List<String> managementIpNotIn) {
    this.managementIpNotIn = managementIpNotIn;
  }


  public HostWhereInput managementIpNotStartsWith(String managementIpNotStartsWith) {
    
    this.managementIpNotStartsWith = managementIpNotStartsWith;
    return this;
  }

   /**
   * Get managementIpNotStartsWith
   * @return managementIpNotStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getManagementIpNotStartsWith() {
    return managementIpNotStartsWith;
  }


  public void setManagementIpNotStartsWith(String managementIpNotStartsWith) {
    this.managementIpNotStartsWith = managementIpNotStartsWith;
  }


  public HostWhereInput managementIpStartsWith(String managementIpStartsWith) {
    
    this.managementIpStartsWith = managementIpStartsWith;
    return this;
  }

   /**
   * Get managementIpStartsWith
   * @return managementIpStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getManagementIpStartsWith() {
    return managementIpStartsWith;
  }


  public void setManagementIpStartsWith(String managementIpStartsWith) {
    this.managementIpStartsWith = managementIpStartsWith;
  }


  public HostWhereInput model(String model) {
    
    this.model = model;
    return this;
  }

   /**
   * Get model
   * @return model
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getModel() {
    return model;
  }


  public void setModel(String model) {
    this.model = model;
  }


  public HostWhereInput modelContains(String modelContains) {
    
    this.modelContains = modelContains;
    return this;
  }

   /**
   * Get modelContains
   * @return modelContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getModelContains() {
    return modelContains;
  }


  public void setModelContains(String modelContains) {
    this.modelContains = modelContains;
  }


  public HostWhereInput modelEndsWith(String modelEndsWith) {
    
    this.modelEndsWith = modelEndsWith;
    return this;
  }

   /**
   * Get modelEndsWith
   * @return modelEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getModelEndsWith() {
    return modelEndsWith;
  }


  public void setModelEndsWith(String modelEndsWith) {
    this.modelEndsWith = modelEndsWith;
  }


  public HostWhereInput modelGt(String modelGt) {
    
    this.modelGt = modelGt;
    return this;
  }

   /**
   * Get modelGt
   * @return modelGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getModelGt() {
    return modelGt;
  }


  public void setModelGt(String modelGt) {
    this.modelGt = modelGt;
  }


  public HostWhereInput modelGte(String modelGte) {
    
    this.modelGte = modelGte;
    return this;
  }

   /**
   * Get modelGte
   * @return modelGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getModelGte() {
    return modelGte;
  }


  public void setModelGte(String modelGte) {
    this.modelGte = modelGte;
  }


  public HostWhereInput modelIn(List<String> modelIn) {
    
    this.modelIn = modelIn;
    return this;
  }

  public HostWhereInput addModelInItem(String modelInItem) {
    if (this.modelIn == null) {
      this.modelIn = new ArrayList<String>();
    }
    this.modelIn.add(modelInItem);
    return this;
  }

   /**
   * Get modelIn
   * @return modelIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getModelIn() {
    return modelIn;
  }


  public void setModelIn(List<String> modelIn) {
    this.modelIn = modelIn;
  }


  public HostWhereInput modelLt(String modelLt) {
    
    this.modelLt = modelLt;
    return this;
  }

   /**
   * Get modelLt
   * @return modelLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getModelLt() {
    return modelLt;
  }


  public void setModelLt(String modelLt) {
    this.modelLt = modelLt;
  }


  public HostWhereInput modelLte(String modelLte) {
    
    this.modelLte = modelLte;
    return this;
  }

   /**
   * Get modelLte
   * @return modelLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getModelLte() {
    return modelLte;
  }


  public void setModelLte(String modelLte) {
    this.modelLte = modelLte;
  }


  public HostWhereInput modelNot(String modelNot) {
    
    this.modelNot = modelNot;
    return this;
  }

   /**
   * Get modelNot
   * @return modelNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getModelNot() {
    return modelNot;
  }


  public void setModelNot(String modelNot) {
    this.modelNot = modelNot;
  }


  public HostWhereInput modelNotContains(String modelNotContains) {
    
    this.modelNotContains = modelNotContains;
    return this;
  }

   /**
   * Get modelNotContains
   * @return modelNotContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getModelNotContains() {
    return modelNotContains;
  }


  public void setModelNotContains(String modelNotContains) {
    this.modelNotContains = modelNotContains;
  }


  public HostWhereInput modelNotEndsWith(String modelNotEndsWith) {
    
    this.modelNotEndsWith = modelNotEndsWith;
    return this;
  }

   /**
   * Get modelNotEndsWith
   * @return modelNotEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getModelNotEndsWith() {
    return modelNotEndsWith;
  }


  public void setModelNotEndsWith(String modelNotEndsWith) {
    this.modelNotEndsWith = modelNotEndsWith;
  }


  public HostWhereInput modelNotIn(List<String> modelNotIn) {
    
    this.modelNotIn = modelNotIn;
    return this;
  }

  public HostWhereInput addModelNotInItem(String modelNotInItem) {
    if (this.modelNotIn == null) {
      this.modelNotIn = new ArrayList<String>();
    }
    this.modelNotIn.add(modelNotInItem);
    return this;
  }

   /**
   * Get modelNotIn
   * @return modelNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getModelNotIn() {
    return modelNotIn;
  }


  public void setModelNotIn(List<String> modelNotIn) {
    this.modelNotIn = modelNotIn;
  }


  public HostWhereInput modelNotStartsWith(String modelNotStartsWith) {
    
    this.modelNotStartsWith = modelNotStartsWith;
    return this;
  }

   /**
   * Get modelNotStartsWith
   * @return modelNotStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getModelNotStartsWith() {
    return modelNotStartsWith;
  }


  public void setModelNotStartsWith(String modelNotStartsWith) {
    this.modelNotStartsWith = modelNotStartsWith;
  }


  public HostWhereInput modelStartsWith(String modelStartsWith) {
    
    this.modelStartsWith = modelStartsWith;
    return this;
  }

   /**
   * Get modelStartsWith
   * @return modelStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getModelStartsWith() {
    return modelStartsWith;
  }


  public void setModelStartsWith(String modelStartsWith) {
    this.modelStartsWith = modelStartsWith;
  }


  public HostWhereInput name(String name) {
    
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


  public HostWhereInput nameContains(String nameContains) {
    
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


  public HostWhereInput nameEndsWith(String nameEndsWith) {
    
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


  public HostWhereInput nameGt(String nameGt) {
    
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


  public HostWhereInput nameGte(String nameGte) {
    
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


  public HostWhereInput nameIn(List<String> nameIn) {
    
    this.nameIn = nameIn;
    return this;
  }

  public HostWhereInput addNameInItem(String nameInItem) {
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


  public HostWhereInput nameLt(String nameLt) {
    
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


  public HostWhereInput nameLte(String nameLte) {
    
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


  public HostWhereInput nameNot(String nameNot) {
    
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


  public HostWhereInput nameNotContains(String nameNotContains) {
    
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


  public HostWhereInput nameNotEndsWith(String nameNotEndsWith) {
    
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


  public HostWhereInput nameNotIn(List<String> nameNotIn) {
    
    this.nameNotIn = nameNotIn;
    return this;
  }

  public HostWhereInput addNameNotInItem(String nameNotInItem) {
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


  public HostWhereInput nameNotStartsWith(String nameNotStartsWith) {
    
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


  public HostWhereInput nameStartsWith(String nameStartsWith) {
    
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


  public HostWhereInput nestedVirtualization(Boolean nestedVirtualization) {
    
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


  public HostWhereInput nestedVirtualizationNot(Boolean nestedVirtualizationNot) {
    
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


  public HostWhereInput nicCount(Integer nicCount) {
    
    this.nicCount = nicCount;
    return this;
  }

   /**
   * Get nicCount
   * @return nicCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getNicCount() {
    return nicCount;
  }


  public void setNicCount(Integer nicCount) {
    this.nicCount = nicCount;
  }


  public HostWhereInput nicCountGt(Integer nicCountGt) {
    
    this.nicCountGt = nicCountGt;
    return this;
  }

   /**
   * Get nicCountGt
   * @return nicCountGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getNicCountGt() {
    return nicCountGt;
  }


  public void setNicCountGt(Integer nicCountGt) {
    this.nicCountGt = nicCountGt;
  }


  public HostWhereInput nicCountGte(Integer nicCountGte) {
    
    this.nicCountGte = nicCountGte;
    return this;
  }

   /**
   * Get nicCountGte
   * @return nicCountGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getNicCountGte() {
    return nicCountGte;
  }


  public void setNicCountGte(Integer nicCountGte) {
    this.nicCountGte = nicCountGte;
  }


  public HostWhereInput nicCountIn(List<Integer> nicCountIn) {
    
    this.nicCountIn = nicCountIn;
    return this;
  }

  public HostWhereInput addNicCountInItem(Integer nicCountInItem) {
    if (this.nicCountIn == null) {
      this.nicCountIn = new ArrayList<Integer>();
    }
    this.nicCountIn.add(nicCountInItem);
    return this;
  }

   /**
   * Get nicCountIn
   * @return nicCountIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Integer> getNicCountIn() {
    return nicCountIn;
  }


  public void setNicCountIn(List<Integer> nicCountIn) {
    this.nicCountIn = nicCountIn;
  }


  public HostWhereInput nicCountLt(Integer nicCountLt) {
    
    this.nicCountLt = nicCountLt;
    return this;
  }

   /**
   * Get nicCountLt
   * @return nicCountLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getNicCountLt() {
    return nicCountLt;
  }


  public void setNicCountLt(Integer nicCountLt) {
    this.nicCountLt = nicCountLt;
  }


  public HostWhereInput nicCountLte(Integer nicCountLte) {
    
    this.nicCountLte = nicCountLte;
    return this;
  }

   /**
   * Get nicCountLte
   * @return nicCountLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getNicCountLte() {
    return nicCountLte;
  }


  public void setNicCountLte(Integer nicCountLte) {
    this.nicCountLte = nicCountLte;
  }


  public HostWhereInput nicCountNot(Integer nicCountNot) {
    
    this.nicCountNot = nicCountNot;
    return this;
  }

   /**
   * Get nicCountNot
   * @return nicCountNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getNicCountNot() {
    return nicCountNot;
  }


  public void setNicCountNot(Integer nicCountNot) {
    this.nicCountNot = nicCountNot;
  }


  public HostWhereInput nicCountNotIn(List<Integer> nicCountNotIn) {
    
    this.nicCountNotIn = nicCountNotIn;
    return this;
  }

  public HostWhereInput addNicCountNotInItem(Integer nicCountNotInItem) {
    if (this.nicCountNotIn == null) {
      this.nicCountNotIn = new ArrayList<Integer>();
    }
    this.nicCountNotIn.add(nicCountNotInItem);
    return this;
  }

   /**
   * Get nicCountNotIn
   * @return nicCountNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Integer> getNicCountNotIn() {
    return nicCountNotIn;
  }


  public void setNicCountNotIn(List<Integer> nicCountNotIn) {
    this.nicCountNotIn = nicCountNotIn;
  }


  public HostWhereInput nicsEvery(NicWhereInput nicsEvery) {
    
    this.nicsEvery = nicsEvery;
    return this;
  }

   /**
   * Get nicsEvery
   * @return nicsEvery
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public NicWhereInput getNicsEvery() {
    return nicsEvery;
  }


  public void setNicsEvery(NicWhereInput nicsEvery) {
    this.nicsEvery = nicsEvery;
  }


  public HostWhereInput nicsNone(NicWhereInput nicsNone) {
    
    this.nicsNone = nicsNone;
    return this;
  }

   /**
   * Get nicsNone
   * @return nicsNone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public NicWhereInput getNicsNone() {
    return nicsNone;
  }


  public void setNicsNone(NicWhereInput nicsNone) {
    this.nicsNone = nicsNone;
  }


  public HostWhereInput nicsSome(NicWhereInput nicsSome) {
    
    this.nicsSome = nicsSome;
    return this;
  }

   /**
   * Get nicsSome
   * @return nicsSome
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public NicWhereInput getNicsSome() {
    return nicsSome;
  }


  public void setNicsSome(NicWhereInput nicsSome) {
    this.nicsSome = nicsSome;
  }


  public HostWhereInput nodeTopoLocalId(String nodeTopoLocalId) {
    
    this.nodeTopoLocalId = nodeTopoLocalId;
    return this;
  }

   /**
   * Get nodeTopoLocalId
   * @return nodeTopoLocalId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNodeTopoLocalId() {
    return nodeTopoLocalId;
  }


  public void setNodeTopoLocalId(String nodeTopoLocalId) {
    this.nodeTopoLocalId = nodeTopoLocalId;
  }


  public HostWhereInput nodeTopoLocalIdContains(String nodeTopoLocalIdContains) {
    
    this.nodeTopoLocalIdContains = nodeTopoLocalIdContains;
    return this;
  }

   /**
   * Get nodeTopoLocalIdContains
   * @return nodeTopoLocalIdContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNodeTopoLocalIdContains() {
    return nodeTopoLocalIdContains;
  }


  public void setNodeTopoLocalIdContains(String nodeTopoLocalIdContains) {
    this.nodeTopoLocalIdContains = nodeTopoLocalIdContains;
  }


  public HostWhereInput nodeTopoLocalIdEndsWith(String nodeTopoLocalIdEndsWith) {
    
    this.nodeTopoLocalIdEndsWith = nodeTopoLocalIdEndsWith;
    return this;
  }

   /**
   * Get nodeTopoLocalIdEndsWith
   * @return nodeTopoLocalIdEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNodeTopoLocalIdEndsWith() {
    return nodeTopoLocalIdEndsWith;
  }


  public void setNodeTopoLocalIdEndsWith(String nodeTopoLocalIdEndsWith) {
    this.nodeTopoLocalIdEndsWith = nodeTopoLocalIdEndsWith;
  }


  public HostWhereInput nodeTopoLocalIdGt(String nodeTopoLocalIdGt) {
    
    this.nodeTopoLocalIdGt = nodeTopoLocalIdGt;
    return this;
  }

   /**
   * Get nodeTopoLocalIdGt
   * @return nodeTopoLocalIdGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNodeTopoLocalIdGt() {
    return nodeTopoLocalIdGt;
  }


  public void setNodeTopoLocalIdGt(String nodeTopoLocalIdGt) {
    this.nodeTopoLocalIdGt = nodeTopoLocalIdGt;
  }


  public HostWhereInput nodeTopoLocalIdGte(String nodeTopoLocalIdGte) {
    
    this.nodeTopoLocalIdGte = nodeTopoLocalIdGte;
    return this;
  }

   /**
   * Get nodeTopoLocalIdGte
   * @return nodeTopoLocalIdGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNodeTopoLocalIdGte() {
    return nodeTopoLocalIdGte;
  }


  public void setNodeTopoLocalIdGte(String nodeTopoLocalIdGte) {
    this.nodeTopoLocalIdGte = nodeTopoLocalIdGte;
  }


  public HostWhereInput nodeTopoLocalIdIn(List<String> nodeTopoLocalIdIn) {
    
    this.nodeTopoLocalIdIn = nodeTopoLocalIdIn;
    return this;
  }

  public HostWhereInput addNodeTopoLocalIdInItem(String nodeTopoLocalIdInItem) {
    if (this.nodeTopoLocalIdIn == null) {
      this.nodeTopoLocalIdIn = new ArrayList<String>();
    }
    this.nodeTopoLocalIdIn.add(nodeTopoLocalIdInItem);
    return this;
  }

   /**
   * Get nodeTopoLocalIdIn
   * @return nodeTopoLocalIdIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getNodeTopoLocalIdIn() {
    return nodeTopoLocalIdIn;
  }


  public void setNodeTopoLocalIdIn(List<String> nodeTopoLocalIdIn) {
    this.nodeTopoLocalIdIn = nodeTopoLocalIdIn;
  }


  public HostWhereInput nodeTopoLocalIdLt(String nodeTopoLocalIdLt) {
    
    this.nodeTopoLocalIdLt = nodeTopoLocalIdLt;
    return this;
  }

   /**
   * Get nodeTopoLocalIdLt
   * @return nodeTopoLocalIdLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNodeTopoLocalIdLt() {
    return nodeTopoLocalIdLt;
  }


  public void setNodeTopoLocalIdLt(String nodeTopoLocalIdLt) {
    this.nodeTopoLocalIdLt = nodeTopoLocalIdLt;
  }


  public HostWhereInput nodeTopoLocalIdLte(String nodeTopoLocalIdLte) {
    
    this.nodeTopoLocalIdLte = nodeTopoLocalIdLte;
    return this;
  }

   /**
   * Get nodeTopoLocalIdLte
   * @return nodeTopoLocalIdLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNodeTopoLocalIdLte() {
    return nodeTopoLocalIdLte;
  }


  public void setNodeTopoLocalIdLte(String nodeTopoLocalIdLte) {
    this.nodeTopoLocalIdLte = nodeTopoLocalIdLte;
  }


  public HostWhereInput nodeTopoLocalIdNot(String nodeTopoLocalIdNot) {
    
    this.nodeTopoLocalIdNot = nodeTopoLocalIdNot;
    return this;
  }

   /**
   * Get nodeTopoLocalIdNot
   * @return nodeTopoLocalIdNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNodeTopoLocalIdNot() {
    return nodeTopoLocalIdNot;
  }


  public void setNodeTopoLocalIdNot(String nodeTopoLocalIdNot) {
    this.nodeTopoLocalIdNot = nodeTopoLocalIdNot;
  }


  public HostWhereInput nodeTopoLocalIdNotContains(String nodeTopoLocalIdNotContains) {
    
    this.nodeTopoLocalIdNotContains = nodeTopoLocalIdNotContains;
    return this;
  }

   /**
   * Get nodeTopoLocalIdNotContains
   * @return nodeTopoLocalIdNotContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNodeTopoLocalIdNotContains() {
    return nodeTopoLocalIdNotContains;
  }


  public void setNodeTopoLocalIdNotContains(String nodeTopoLocalIdNotContains) {
    this.nodeTopoLocalIdNotContains = nodeTopoLocalIdNotContains;
  }


  public HostWhereInput nodeTopoLocalIdNotEndsWith(String nodeTopoLocalIdNotEndsWith) {
    
    this.nodeTopoLocalIdNotEndsWith = nodeTopoLocalIdNotEndsWith;
    return this;
  }

   /**
   * Get nodeTopoLocalIdNotEndsWith
   * @return nodeTopoLocalIdNotEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNodeTopoLocalIdNotEndsWith() {
    return nodeTopoLocalIdNotEndsWith;
  }


  public void setNodeTopoLocalIdNotEndsWith(String nodeTopoLocalIdNotEndsWith) {
    this.nodeTopoLocalIdNotEndsWith = nodeTopoLocalIdNotEndsWith;
  }


  public HostWhereInput nodeTopoLocalIdNotIn(List<String> nodeTopoLocalIdNotIn) {
    
    this.nodeTopoLocalIdNotIn = nodeTopoLocalIdNotIn;
    return this;
  }

  public HostWhereInput addNodeTopoLocalIdNotInItem(String nodeTopoLocalIdNotInItem) {
    if (this.nodeTopoLocalIdNotIn == null) {
      this.nodeTopoLocalIdNotIn = new ArrayList<String>();
    }
    this.nodeTopoLocalIdNotIn.add(nodeTopoLocalIdNotInItem);
    return this;
  }

   /**
   * Get nodeTopoLocalIdNotIn
   * @return nodeTopoLocalIdNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getNodeTopoLocalIdNotIn() {
    return nodeTopoLocalIdNotIn;
  }


  public void setNodeTopoLocalIdNotIn(List<String> nodeTopoLocalIdNotIn) {
    this.nodeTopoLocalIdNotIn = nodeTopoLocalIdNotIn;
  }


  public HostWhereInput nodeTopoLocalIdNotStartsWith(String nodeTopoLocalIdNotStartsWith) {
    
    this.nodeTopoLocalIdNotStartsWith = nodeTopoLocalIdNotStartsWith;
    return this;
  }

   /**
   * Get nodeTopoLocalIdNotStartsWith
   * @return nodeTopoLocalIdNotStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNodeTopoLocalIdNotStartsWith() {
    return nodeTopoLocalIdNotStartsWith;
  }


  public void setNodeTopoLocalIdNotStartsWith(String nodeTopoLocalIdNotStartsWith) {
    this.nodeTopoLocalIdNotStartsWith = nodeTopoLocalIdNotStartsWith;
  }


  public HostWhereInput nodeTopoLocalIdStartsWith(String nodeTopoLocalIdStartsWith) {
    
    this.nodeTopoLocalIdStartsWith = nodeTopoLocalIdStartsWith;
    return this;
  }

   /**
   * Get nodeTopoLocalIdStartsWith
   * @return nodeTopoLocalIdStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNodeTopoLocalIdStartsWith() {
    return nodeTopoLocalIdStartsWith;
  }


  public void setNodeTopoLocalIdStartsWith(String nodeTopoLocalIdStartsWith) {
    this.nodeTopoLocalIdStartsWith = nodeTopoLocalIdStartsWith;
  }


  public HostWhereInput osMemoryBytes(Long osMemoryBytes) {
    
    this.osMemoryBytes = osMemoryBytes;
    return this;
  }

   /**
   * Get osMemoryBytes
   * @return osMemoryBytes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getOsMemoryBytes() {
    return osMemoryBytes;
  }


  public void setOsMemoryBytes(Long osMemoryBytes) {
    this.osMemoryBytes = osMemoryBytes;
  }


  public HostWhereInput osMemoryBytesGt(Long osMemoryBytesGt) {
    
    this.osMemoryBytesGt = osMemoryBytesGt;
    return this;
  }

   /**
   * Get osMemoryBytesGt
   * @return osMemoryBytesGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getOsMemoryBytesGt() {
    return osMemoryBytesGt;
  }


  public void setOsMemoryBytesGt(Long osMemoryBytesGt) {
    this.osMemoryBytesGt = osMemoryBytesGt;
  }


  public HostWhereInput osMemoryBytesGte(Long osMemoryBytesGte) {
    
    this.osMemoryBytesGte = osMemoryBytesGte;
    return this;
  }

   /**
   * Get osMemoryBytesGte
   * @return osMemoryBytesGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getOsMemoryBytesGte() {
    return osMemoryBytesGte;
  }


  public void setOsMemoryBytesGte(Long osMemoryBytesGte) {
    this.osMemoryBytesGte = osMemoryBytesGte;
  }


  public HostWhereInput osMemoryBytesIn(List<Long> osMemoryBytesIn) {
    
    this.osMemoryBytesIn = osMemoryBytesIn;
    return this;
  }

  public HostWhereInput addOsMemoryBytesInItem(Long osMemoryBytesInItem) {
    if (this.osMemoryBytesIn == null) {
      this.osMemoryBytesIn = new ArrayList<Long>();
    }
    this.osMemoryBytesIn.add(osMemoryBytesInItem);
    return this;
  }

   /**
   * Get osMemoryBytesIn
   * @return osMemoryBytesIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Long> getOsMemoryBytesIn() {
    return osMemoryBytesIn;
  }


  public void setOsMemoryBytesIn(List<Long> osMemoryBytesIn) {
    this.osMemoryBytesIn = osMemoryBytesIn;
  }


  public HostWhereInput osMemoryBytesLt(Long osMemoryBytesLt) {
    
    this.osMemoryBytesLt = osMemoryBytesLt;
    return this;
  }

   /**
   * Get osMemoryBytesLt
   * @return osMemoryBytesLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getOsMemoryBytesLt() {
    return osMemoryBytesLt;
  }


  public void setOsMemoryBytesLt(Long osMemoryBytesLt) {
    this.osMemoryBytesLt = osMemoryBytesLt;
  }


  public HostWhereInput osMemoryBytesLte(Long osMemoryBytesLte) {
    
    this.osMemoryBytesLte = osMemoryBytesLte;
    return this;
  }

   /**
   * Get osMemoryBytesLte
   * @return osMemoryBytesLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getOsMemoryBytesLte() {
    return osMemoryBytesLte;
  }


  public void setOsMemoryBytesLte(Long osMemoryBytesLte) {
    this.osMemoryBytesLte = osMemoryBytesLte;
  }


  public HostWhereInput osMemoryBytesNot(Long osMemoryBytesNot) {
    
    this.osMemoryBytesNot = osMemoryBytesNot;
    return this;
  }

   /**
   * Get osMemoryBytesNot
   * @return osMemoryBytesNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getOsMemoryBytesNot() {
    return osMemoryBytesNot;
  }


  public void setOsMemoryBytesNot(Long osMemoryBytesNot) {
    this.osMemoryBytesNot = osMemoryBytesNot;
  }


  public HostWhereInput osMemoryBytesNotIn(List<Long> osMemoryBytesNotIn) {
    
    this.osMemoryBytesNotIn = osMemoryBytesNotIn;
    return this;
  }

  public HostWhereInput addOsMemoryBytesNotInItem(Long osMemoryBytesNotInItem) {
    if (this.osMemoryBytesNotIn == null) {
      this.osMemoryBytesNotIn = new ArrayList<Long>();
    }
    this.osMemoryBytesNotIn.add(osMemoryBytesNotInItem);
    return this;
  }

   /**
   * Get osMemoryBytesNotIn
   * @return osMemoryBytesNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Long> getOsMemoryBytesNotIn() {
    return osMemoryBytesNotIn;
  }


  public void setOsMemoryBytesNotIn(List<Long> osMemoryBytesNotIn) {
    this.osMemoryBytesNotIn = osMemoryBytesNotIn;
  }


  public HostWhereInput osVersion(String osVersion) {
    
    this.osVersion = osVersion;
    return this;
  }

   /**
   * Get osVersion
   * @return osVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getOsVersion() {
    return osVersion;
  }


  public void setOsVersion(String osVersion) {
    this.osVersion = osVersion;
  }


  public HostWhereInput osVersionContains(String osVersionContains) {
    
    this.osVersionContains = osVersionContains;
    return this;
  }

   /**
   * Get osVersionContains
   * @return osVersionContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getOsVersionContains() {
    return osVersionContains;
  }


  public void setOsVersionContains(String osVersionContains) {
    this.osVersionContains = osVersionContains;
  }


  public HostWhereInput osVersionEndsWith(String osVersionEndsWith) {
    
    this.osVersionEndsWith = osVersionEndsWith;
    return this;
  }

   /**
   * Get osVersionEndsWith
   * @return osVersionEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getOsVersionEndsWith() {
    return osVersionEndsWith;
  }


  public void setOsVersionEndsWith(String osVersionEndsWith) {
    this.osVersionEndsWith = osVersionEndsWith;
  }


  public HostWhereInput osVersionGt(String osVersionGt) {
    
    this.osVersionGt = osVersionGt;
    return this;
  }

   /**
   * Get osVersionGt
   * @return osVersionGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getOsVersionGt() {
    return osVersionGt;
  }


  public void setOsVersionGt(String osVersionGt) {
    this.osVersionGt = osVersionGt;
  }


  public HostWhereInput osVersionGte(String osVersionGte) {
    
    this.osVersionGte = osVersionGte;
    return this;
  }

   /**
   * Get osVersionGte
   * @return osVersionGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getOsVersionGte() {
    return osVersionGte;
  }


  public void setOsVersionGte(String osVersionGte) {
    this.osVersionGte = osVersionGte;
  }


  public HostWhereInput osVersionIn(List<String> osVersionIn) {
    
    this.osVersionIn = osVersionIn;
    return this;
  }

  public HostWhereInput addOsVersionInItem(String osVersionInItem) {
    if (this.osVersionIn == null) {
      this.osVersionIn = new ArrayList<String>();
    }
    this.osVersionIn.add(osVersionInItem);
    return this;
  }

   /**
   * Get osVersionIn
   * @return osVersionIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getOsVersionIn() {
    return osVersionIn;
  }


  public void setOsVersionIn(List<String> osVersionIn) {
    this.osVersionIn = osVersionIn;
  }


  public HostWhereInput osVersionLt(String osVersionLt) {
    
    this.osVersionLt = osVersionLt;
    return this;
  }

   /**
   * Get osVersionLt
   * @return osVersionLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getOsVersionLt() {
    return osVersionLt;
  }


  public void setOsVersionLt(String osVersionLt) {
    this.osVersionLt = osVersionLt;
  }


  public HostWhereInput osVersionLte(String osVersionLte) {
    
    this.osVersionLte = osVersionLte;
    return this;
  }

   /**
   * Get osVersionLte
   * @return osVersionLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getOsVersionLte() {
    return osVersionLte;
  }


  public void setOsVersionLte(String osVersionLte) {
    this.osVersionLte = osVersionLte;
  }


  public HostWhereInput osVersionNot(String osVersionNot) {
    
    this.osVersionNot = osVersionNot;
    return this;
  }

   /**
   * Get osVersionNot
   * @return osVersionNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getOsVersionNot() {
    return osVersionNot;
  }


  public void setOsVersionNot(String osVersionNot) {
    this.osVersionNot = osVersionNot;
  }


  public HostWhereInput osVersionNotContains(String osVersionNotContains) {
    
    this.osVersionNotContains = osVersionNotContains;
    return this;
  }

   /**
   * Get osVersionNotContains
   * @return osVersionNotContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getOsVersionNotContains() {
    return osVersionNotContains;
  }


  public void setOsVersionNotContains(String osVersionNotContains) {
    this.osVersionNotContains = osVersionNotContains;
  }


  public HostWhereInput osVersionNotEndsWith(String osVersionNotEndsWith) {
    
    this.osVersionNotEndsWith = osVersionNotEndsWith;
    return this;
  }

   /**
   * Get osVersionNotEndsWith
   * @return osVersionNotEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getOsVersionNotEndsWith() {
    return osVersionNotEndsWith;
  }


  public void setOsVersionNotEndsWith(String osVersionNotEndsWith) {
    this.osVersionNotEndsWith = osVersionNotEndsWith;
  }


  public HostWhereInput osVersionNotIn(List<String> osVersionNotIn) {
    
    this.osVersionNotIn = osVersionNotIn;
    return this;
  }

  public HostWhereInput addOsVersionNotInItem(String osVersionNotInItem) {
    if (this.osVersionNotIn == null) {
      this.osVersionNotIn = new ArrayList<String>();
    }
    this.osVersionNotIn.add(osVersionNotInItem);
    return this;
  }

   /**
   * Get osVersionNotIn
   * @return osVersionNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getOsVersionNotIn() {
    return osVersionNotIn;
  }


  public void setOsVersionNotIn(List<String> osVersionNotIn) {
    this.osVersionNotIn = osVersionNotIn;
  }


  public HostWhereInput osVersionNotStartsWith(String osVersionNotStartsWith) {
    
    this.osVersionNotStartsWith = osVersionNotStartsWith;
    return this;
  }

   /**
   * Get osVersionNotStartsWith
   * @return osVersionNotStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getOsVersionNotStartsWith() {
    return osVersionNotStartsWith;
  }


  public void setOsVersionNotStartsWith(String osVersionNotStartsWith) {
    this.osVersionNotStartsWith = osVersionNotStartsWith;
  }


  public HostWhereInput osVersionStartsWith(String osVersionStartsWith) {
    
    this.osVersionStartsWith = osVersionStartsWith;
    return this;
  }

   /**
   * Get osVersionStartsWith
   * @return osVersionStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getOsVersionStartsWith() {
    return osVersionStartsWith;
  }


  public void setOsVersionStartsWith(String osVersionStartsWith) {
    this.osVersionStartsWith = osVersionStartsWith;
  }


  public HostWhereInput pmemDimmCapacity(Long pmemDimmCapacity) {
    
    this.pmemDimmCapacity = pmemDimmCapacity;
    return this;
  }

   /**
   * Get pmemDimmCapacity
   * @return pmemDimmCapacity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getPmemDimmCapacity() {
    return pmemDimmCapacity;
  }


  public void setPmemDimmCapacity(Long pmemDimmCapacity) {
    this.pmemDimmCapacity = pmemDimmCapacity;
  }


  public HostWhereInput pmemDimmCapacityGt(Long pmemDimmCapacityGt) {
    
    this.pmemDimmCapacityGt = pmemDimmCapacityGt;
    return this;
  }

   /**
   * Get pmemDimmCapacityGt
   * @return pmemDimmCapacityGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getPmemDimmCapacityGt() {
    return pmemDimmCapacityGt;
  }


  public void setPmemDimmCapacityGt(Long pmemDimmCapacityGt) {
    this.pmemDimmCapacityGt = pmemDimmCapacityGt;
  }


  public HostWhereInput pmemDimmCapacityGte(Long pmemDimmCapacityGte) {
    
    this.pmemDimmCapacityGte = pmemDimmCapacityGte;
    return this;
  }

   /**
   * Get pmemDimmCapacityGte
   * @return pmemDimmCapacityGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getPmemDimmCapacityGte() {
    return pmemDimmCapacityGte;
  }


  public void setPmemDimmCapacityGte(Long pmemDimmCapacityGte) {
    this.pmemDimmCapacityGte = pmemDimmCapacityGte;
  }


  public HostWhereInput pmemDimmCapacityIn(List<Long> pmemDimmCapacityIn) {
    
    this.pmemDimmCapacityIn = pmemDimmCapacityIn;
    return this;
  }

  public HostWhereInput addPmemDimmCapacityInItem(Long pmemDimmCapacityInItem) {
    if (this.pmemDimmCapacityIn == null) {
      this.pmemDimmCapacityIn = new ArrayList<Long>();
    }
    this.pmemDimmCapacityIn.add(pmemDimmCapacityInItem);
    return this;
  }

   /**
   * Get pmemDimmCapacityIn
   * @return pmemDimmCapacityIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Long> getPmemDimmCapacityIn() {
    return pmemDimmCapacityIn;
  }


  public void setPmemDimmCapacityIn(List<Long> pmemDimmCapacityIn) {
    this.pmemDimmCapacityIn = pmemDimmCapacityIn;
  }


  public HostWhereInput pmemDimmCapacityLt(Long pmemDimmCapacityLt) {
    
    this.pmemDimmCapacityLt = pmemDimmCapacityLt;
    return this;
  }

   /**
   * Get pmemDimmCapacityLt
   * @return pmemDimmCapacityLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getPmemDimmCapacityLt() {
    return pmemDimmCapacityLt;
  }


  public void setPmemDimmCapacityLt(Long pmemDimmCapacityLt) {
    this.pmemDimmCapacityLt = pmemDimmCapacityLt;
  }


  public HostWhereInput pmemDimmCapacityLte(Long pmemDimmCapacityLte) {
    
    this.pmemDimmCapacityLte = pmemDimmCapacityLte;
    return this;
  }

   /**
   * Get pmemDimmCapacityLte
   * @return pmemDimmCapacityLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getPmemDimmCapacityLte() {
    return pmemDimmCapacityLte;
  }


  public void setPmemDimmCapacityLte(Long pmemDimmCapacityLte) {
    this.pmemDimmCapacityLte = pmemDimmCapacityLte;
  }


  public HostWhereInput pmemDimmCapacityNot(Long pmemDimmCapacityNot) {
    
    this.pmemDimmCapacityNot = pmemDimmCapacityNot;
    return this;
  }

   /**
   * Get pmemDimmCapacityNot
   * @return pmemDimmCapacityNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getPmemDimmCapacityNot() {
    return pmemDimmCapacityNot;
  }


  public void setPmemDimmCapacityNot(Long pmemDimmCapacityNot) {
    this.pmemDimmCapacityNot = pmemDimmCapacityNot;
  }


  public HostWhereInput pmemDimmCapacityNotIn(List<Long> pmemDimmCapacityNotIn) {
    
    this.pmemDimmCapacityNotIn = pmemDimmCapacityNotIn;
    return this;
  }

  public HostWhereInput addPmemDimmCapacityNotInItem(Long pmemDimmCapacityNotInItem) {
    if (this.pmemDimmCapacityNotIn == null) {
      this.pmemDimmCapacityNotIn = new ArrayList<Long>();
    }
    this.pmemDimmCapacityNotIn.add(pmemDimmCapacityNotInItem);
    return this;
  }

   /**
   * Get pmemDimmCapacityNotIn
   * @return pmemDimmCapacityNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Long> getPmemDimmCapacityNotIn() {
    return pmemDimmCapacityNotIn;
  }


  public void setPmemDimmCapacityNotIn(List<Long> pmemDimmCapacityNotIn) {
    this.pmemDimmCapacityNotIn = pmemDimmCapacityNotIn;
  }


  public HostWhereInput pmemDimmCount(Integer pmemDimmCount) {
    
    this.pmemDimmCount = pmemDimmCount;
    return this;
  }

   /**
   * Get pmemDimmCount
   * @return pmemDimmCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getPmemDimmCount() {
    return pmemDimmCount;
  }


  public void setPmemDimmCount(Integer pmemDimmCount) {
    this.pmemDimmCount = pmemDimmCount;
  }


  public HostWhereInput pmemDimmCountGt(Integer pmemDimmCountGt) {
    
    this.pmemDimmCountGt = pmemDimmCountGt;
    return this;
  }

   /**
   * Get pmemDimmCountGt
   * @return pmemDimmCountGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getPmemDimmCountGt() {
    return pmemDimmCountGt;
  }


  public void setPmemDimmCountGt(Integer pmemDimmCountGt) {
    this.pmemDimmCountGt = pmemDimmCountGt;
  }


  public HostWhereInput pmemDimmCountGte(Integer pmemDimmCountGte) {
    
    this.pmemDimmCountGte = pmemDimmCountGte;
    return this;
  }

   /**
   * Get pmemDimmCountGte
   * @return pmemDimmCountGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getPmemDimmCountGte() {
    return pmemDimmCountGte;
  }


  public void setPmemDimmCountGte(Integer pmemDimmCountGte) {
    this.pmemDimmCountGte = pmemDimmCountGte;
  }


  public HostWhereInput pmemDimmCountIn(List<Integer> pmemDimmCountIn) {
    
    this.pmemDimmCountIn = pmemDimmCountIn;
    return this;
  }

  public HostWhereInput addPmemDimmCountInItem(Integer pmemDimmCountInItem) {
    if (this.pmemDimmCountIn == null) {
      this.pmemDimmCountIn = new ArrayList<Integer>();
    }
    this.pmemDimmCountIn.add(pmemDimmCountInItem);
    return this;
  }

   /**
   * Get pmemDimmCountIn
   * @return pmemDimmCountIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Integer> getPmemDimmCountIn() {
    return pmemDimmCountIn;
  }


  public void setPmemDimmCountIn(List<Integer> pmemDimmCountIn) {
    this.pmemDimmCountIn = pmemDimmCountIn;
  }


  public HostWhereInput pmemDimmCountLt(Integer pmemDimmCountLt) {
    
    this.pmemDimmCountLt = pmemDimmCountLt;
    return this;
  }

   /**
   * Get pmemDimmCountLt
   * @return pmemDimmCountLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getPmemDimmCountLt() {
    return pmemDimmCountLt;
  }


  public void setPmemDimmCountLt(Integer pmemDimmCountLt) {
    this.pmemDimmCountLt = pmemDimmCountLt;
  }


  public HostWhereInput pmemDimmCountLte(Integer pmemDimmCountLte) {
    
    this.pmemDimmCountLte = pmemDimmCountLte;
    return this;
  }

   /**
   * Get pmemDimmCountLte
   * @return pmemDimmCountLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getPmemDimmCountLte() {
    return pmemDimmCountLte;
  }


  public void setPmemDimmCountLte(Integer pmemDimmCountLte) {
    this.pmemDimmCountLte = pmemDimmCountLte;
  }


  public HostWhereInput pmemDimmCountNot(Integer pmemDimmCountNot) {
    
    this.pmemDimmCountNot = pmemDimmCountNot;
    return this;
  }

   /**
   * Get pmemDimmCountNot
   * @return pmemDimmCountNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getPmemDimmCountNot() {
    return pmemDimmCountNot;
  }


  public void setPmemDimmCountNot(Integer pmemDimmCountNot) {
    this.pmemDimmCountNot = pmemDimmCountNot;
  }


  public HostWhereInput pmemDimmCountNotIn(List<Integer> pmemDimmCountNotIn) {
    
    this.pmemDimmCountNotIn = pmemDimmCountNotIn;
    return this;
  }

  public HostWhereInput addPmemDimmCountNotInItem(Integer pmemDimmCountNotInItem) {
    if (this.pmemDimmCountNotIn == null) {
      this.pmemDimmCountNotIn = new ArrayList<Integer>();
    }
    this.pmemDimmCountNotIn.add(pmemDimmCountNotInItem);
    return this;
  }

   /**
   * Get pmemDimmCountNotIn
   * @return pmemDimmCountNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Integer> getPmemDimmCountNotIn() {
    return pmemDimmCountNotIn;
  }


  public void setPmemDimmCountNotIn(List<Integer> pmemDimmCountNotIn) {
    this.pmemDimmCountNotIn = pmemDimmCountNotIn;
  }


  public HostWhereInput pmemDiskCount(Integer pmemDiskCount) {
    
    this.pmemDiskCount = pmemDiskCount;
    return this;
  }

   /**
   * Get pmemDiskCount
   * @return pmemDiskCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getPmemDiskCount() {
    return pmemDiskCount;
  }


  public void setPmemDiskCount(Integer pmemDiskCount) {
    this.pmemDiskCount = pmemDiskCount;
  }


  public HostWhereInput pmemDiskCountGt(Integer pmemDiskCountGt) {
    
    this.pmemDiskCountGt = pmemDiskCountGt;
    return this;
  }

   /**
   * Get pmemDiskCountGt
   * @return pmemDiskCountGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getPmemDiskCountGt() {
    return pmemDiskCountGt;
  }


  public void setPmemDiskCountGt(Integer pmemDiskCountGt) {
    this.pmemDiskCountGt = pmemDiskCountGt;
  }


  public HostWhereInput pmemDiskCountGte(Integer pmemDiskCountGte) {
    
    this.pmemDiskCountGte = pmemDiskCountGte;
    return this;
  }

   /**
   * Get pmemDiskCountGte
   * @return pmemDiskCountGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getPmemDiskCountGte() {
    return pmemDiskCountGte;
  }


  public void setPmemDiskCountGte(Integer pmemDiskCountGte) {
    this.pmemDiskCountGte = pmemDiskCountGte;
  }


  public HostWhereInput pmemDiskCountIn(List<Integer> pmemDiskCountIn) {
    
    this.pmemDiskCountIn = pmemDiskCountIn;
    return this;
  }

  public HostWhereInput addPmemDiskCountInItem(Integer pmemDiskCountInItem) {
    if (this.pmemDiskCountIn == null) {
      this.pmemDiskCountIn = new ArrayList<Integer>();
    }
    this.pmemDiskCountIn.add(pmemDiskCountInItem);
    return this;
  }

   /**
   * Get pmemDiskCountIn
   * @return pmemDiskCountIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Integer> getPmemDiskCountIn() {
    return pmemDiskCountIn;
  }


  public void setPmemDiskCountIn(List<Integer> pmemDiskCountIn) {
    this.pmemDiskCountIn = pmemDiskCountIn;
  }


  public HostWhereInput pmemDiskCountLt(Integer pmemDiskCountLt) {
    
    this.pmemDiskCountLt = pmemDiskCountLt;
    return this;
  }

   /**
   * Get pmemDiskCountLt
   * @return pmemDiskCountLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getPmemDiskCountLt() {
    return pmemDiskCountLt;
  }


  public void setPmemDiskCountLt(Integer pmemDiskCountLt) {
    this.pmemDiskCountLt = pmemDiskCountLt;
  }


  public HostWhereInput pmemDiskCountLte(Integer pmemDiskCountLte) {
    
    this.pmemDiskCountLte = pmemDiskCountLte;
    return this;
  }

   /**
   * Get pmemDiskCountLte
   * @return pmemDiskCountLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getPmemDiskCountLte() {
    return pmemDiskCountLte;
  }


  public void setPmemDiskCountLte(Integer pmemDiskCountLte) {
    this.pmemDiskCountLte = pmemDiskCountLte;
  }


  public HostWhereInput pmemDiskCountNot(Integer pmemDiskCountNot) {
    
    this.pmemDiskCountNot = pmemDiskCountNot;
    return this;
  }

   /**
   * Get pmemDiskCountNot
   * @return pmemDiskCountNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getPmemDiskCountNot() {
    return pmemDiskCountNot;
  }


  public void setPmemDiskCountNot(Integer pmemDiskCountNot) {
    this.pmemDiskCountNot = pmemDiskCountNot;
  }


  public HostWhereInput pmemDiskCountNotIn(List<Integer> pmemDiskCountNotIn) {
    
    this.pmemDiskCountNotIn = pmemDiskCountNotIn;
    return this;
  }

  public HostWhereInput addPmemDiskCountNotInItem(Integer pmemDiskCountNotInItem) {
    if (this.pmemDiskCountNotIn == null) {
      this.pmemDiskCountNotIn = new ArrayList<Integer>();
    }
    this.pmemDiskCountNotIn.add(pmemDiskCountNotInItem);
    return this;
  }

   /**
   * Get pmemDiskCountNotIn
   * @return pmemDiskCountNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Integer> getPmemDiskCountNotIn() {
    return pmemDiskCountNotIn;
  }


  public void setPmemDiskCountNotIn(List<Integer> pmemDiskCountNotIn) {
    this.pmemDiskCountNotIn = pmemDiskCountNotIn;
  }


  public HostWhereInput provisionedCpuCores(Integer provisionedCpuCores) {
    
    this.provisionedCpuCores = provisionedCpuCores;
    return this;
  }

   /**
   * Get provisionedCpuCores
   * @return provisionedCpuCores
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getProvisionedCpuCores() {
    return provisionedCpuCores;
  }


  public void setProvisionedCpuCores(Integer provisionedCpuCores) {
    this.provisionedCpuCores = provisionedCpuCores;
  }


  public HostWhereInput provisionedCpuCoresGt(Integer provisionedCpuCoresGt) {
    
    this.provisionedCpuCoresGt = provisionedCpuCoresGt;
    return this;
  }

   /**
   * Get provisionedCpuCoresGt
   * @return provisionedCpuCoresGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getProvisionedCpuCoresGt() {
    return provisionedCpuCoresGt;
  }


  public void setProvisionedCpuCoresGt(Integer provisionedCpuCoresGt) {
    this.provisionedCpuCoresGt = provisionedCpuCoresGt;
  }


  public HostWhereInput provisionedCpuCoresGte(Integer provisionedCpuCoresGte) {
    
    this.provisionedCpuCoresGte = provisionedCpuCoresGte;
    return this;
  }

   /**
   * Get provisionedCpuCoresGte
   * @return provisionedCpuCoresGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getProvisionedCpuCoresGte() {
    return provisionedCpuCoresGte;
  }


  public void setProvisionedCpuCoresGte(Integer provisionedCpuCoresGte) {
    this.provisionedCpuCoresGte = provisionedCpuCoresGte;
  }


  public HostWhereInput provisionedCpuCoresIn(List<Integer> provisionedCpuCoresIn) {
    
    this.provisionedCpuCoresIn = provisionedCpuCoresIn;
    return this;
  }

  public HostWhereInput addProvisionedCpuCoresInItem(Integer provisionedCpuCoresInItem) {
    if (this.provisionedCpuCoresIn == null) {
      this.provisionedCpuCoresIn = new ArrayList<Integer>();
    }
    this.provisionedCpuCoresIn.add(provisionedCpuCoresInItem);
    return this;
  }

   /**
   * Get provisionedCpuCoresIn
   * @return provisionedCpuCoresIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Integer> getProvisionedCpuCoresIn() {
    return provisionedCpuCoresIn;
  }


  public void setProvisionedCpuCoresIn(List<Integer> provisionedCpuCoresIn) {
    this.provisionedCpuCoresIn = provisionedCpuCoresIn;
  }


  public HostWhereInput provisionedCpuCoresLt(Integer provisionedCpuCoresLt) {
    
    this.provisionedCpuCoresLt = provisionedCpuCoresLt;
    return this;
  }

   /**
   * Get provisionedCpuCoresLt
   * @return provisionedCpuCoresLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getProvisionedCpuCoresLt() {
    return provisionedCpuCoresLt;
  }


  public void setProvisionedCpuCoresLt(Integer provisionedCpuCoresLt) {
    this.provisionedCpuCoresLt = provisionedCpuCoresLt;
  }


  public HostWhereInput provisionedCpuCoresLte(Integer provisionedCpuCoresLte) {
    
    this.provisionedCpuCoresLte = provisionedCpuCoresLte;
    return this;
  }

   /**
   * Get provisionedCpuCoresLte
   * @return provisionedCpuCoresLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getProvisionedCpuCoresLte() {
    return provisionedCpuCoresLte;
  }


  public void setProvisionedCpuCoresLte(Integer provisionedCpuCoresLte) {
    this.provisionedCpuCoresLte = provisionedCpuCoresLte;
  }


  public HostWhereInput provisionedCpuCoresNot(Integer provisionedCpuCoresNot) {
    
    this.provisionedCpuCoresNot = provisionedCpuCoresNot;
    return this;
  }

   /**
   * Get provisionedCpuCoresNot
   * @return provisionedCpuCoresNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getProvisionedCpuCoresNot() {
    return provisionedCpuCoresNot;
  }


  public void setProvisionedCpuCoresNot(Integer provisionedCpuCoresNot) {
    this.provisionedCpuCoresNot = provisionedCpuCoresNot;
  }


  public HostWhereInput provisionedCpuCoresNotIn(List<Integer> provisionedCpuCoresNotIn) {
    
    this.provisionedCpuCoresNotIn = provisionedCpuCoresNotIn;
    return this;
  }

  public HostWhereInput addProvisionedCpuCoresNotInItem(Integer provisionedCpuCoresNotInItem) {
    if (this.provisionedCpuCoresNotIn == null) {
      this.provisionedCpuCoresNotIn = new ArrayList<Integer>();
    }
    this.provisionedCpuCoresNotIn.add(provisionedCpuCoresNotInItem);
    return this;
  }

   /**
   * Get provisionedCpuCoresNotIn
   * @return provisionedCpuCoresNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Integer> getProvisionedCpuCoresNotIn() {
    return provisionedCpuCoresNotIn;
  }


  public void setProvisionedCpuCoresNotIn(List<Integer> provisionedCpuCoresNotIn) {
    this.provisionedCpuCoresNotIn = provisionedCpuCoresNotIn;
  }


  public HostWhereInput provisionedMemoryBytes(Long provisionedMemoryBytes) {
    
    this.provisionedMemoryBytes = provisionedMemoryBytes;
    return this;
  }

   /**
   * Get provisionedMemoryBytes
   * @return provisionedMemoryBytes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getProvisionedMemoryBytes() {
    return provisionedMemoryBytes;
  }


  public void setProvisionedMemoryBytes(Long provisionedMemoryBytes) {
    this.provisionedMemoryBytes = provisionedMemoryBytes;
  }


  public HostWhereInput provisionedMemoryBytesGt(Long provisionedMemoryBytesGt) {
    
    this.provisionedMemoryBytesGt = provisionedMemoryBytesGt;
    return this;
  }

   /**
   * Get provisionedMemoryBytesGt
   * @return provisionedMemoryBytesGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getProvisionedMemoryBytesGt() {
    return provisionedMemoryBytesGt;
  }


  public void setProvisionedMemoryBytesGt(Long provisionedMemoryBytesGt) {
    this.provisionedMemoryBytesGt = provisionedMemoryBytesGt;
  }


  public HostWhereInput provisionedMemoryBytesGte(Long provisionedMemoryBytesGte) {
    
    this.provisionedMemoryBytesGte = provisionedMemoryBytesGte;
    return this;
  }

   /**
   * Get provisionedMemoryBytesGte
   * @return provisionedMemoryBytesGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getProvisionedMemoryBytesGte() {
    return provisionedMemoryBytesGte;
  }


  public void setProvisionedMemoryBytesGte(Long provisionedMemoryBytesGte) {
    this.provisionedMemoryBytesGte = provisionedMemoryBytesGte;
  }


  public HostWhereInput provisionedMemoryBytesIn(List<Long> provisionedMemoryBytesIn) {
    
    this.provisionedMemoryBytesIn = provisionedMemoryBytesIn;
    return this;
  }

  public HostWhereInput addProvisionedMemoryBytesInItem(Long provisionedMemoryBytesInItem) {
    if (this.provisionedMemoryBytesIn == null) {
      this.provisionedMemoryBytesIn = new ArrayList<Long>();
    }
    this.provisionedMemoryBytesIn.add(provisionedMemoryBytesInItem);
    return this;
  }

   /**
   * Get provisionedMemoryBytesIn
   * @return provisionedMemoryBytesIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Long> getProvisionedMemoryBytesIn() {
    return provisionedMemoryBytesIn;
  }


  public void setProvisionedMemoryBytesIn(List<Long> provisionedMemoryBytesIn) {
    this.provisionedMemoryBytesIn = provisionedMemoryBytesIn;
  }


  public HostWhereInput provisionedMemoryBytesLt(Long provisionedMemoryBytesLt) {
    
    this.provisionedMemoryBytesLt = provisionedMemoryBytesLt;
    return this;
  }

   /**
   * Get provisionedMemoryBytesLt
   * @return provisionedMemoryBytesLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getProvisionedMemoryBytesLt() {
    return provisionedMemoryBytesLt;
  }


  public void setProvisionedMemoryBytesLt(Long provisionedMemoryBytesLt) {
    this.provisionedMemoryBytesLt = provisionedMemoryBytesLt;
  }


  public HostWhereInput provisionedMemoryBytesLte(Long provisionedMemoryBytesLte) {
    
    this.provisionedMemoryBytesLte = provisionedMemoryBytesLte;
    return this;
  }

   /**
   * Get provisionedMemoryBytesLte
   * @return provisionedMemoryBytesLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getProvisionedMemoryBytesLte() {
    return provisionedMemoryBytesLte;
  }


  public void setProvisionedMemoryBytesLte(Long provisionedMemoryBytesLte) {
    this.provisionedMemoryBytesLte = provisionedMemoryBytesLte;
  }


  public HostWhereInput provisionedMemoryBytesNot(Long provisionedMemoryBytesNot) {
    
    this.provisionedMemoryBytesNot = provisionedMemoryBytesNot;
    return this;
  }

   /**
   * Get provisionedMemoryBytesNot
   * @return provisionedMemoryBytesNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getProvisionedMemoryBytesNot() {
    return provisionedMemoryBytesNot;
  }


  public void setProvisionedMemoryBytesNot(Long provisionedMemoryBytesNot) {
    this.provisionedMemoryBytesNot = provisionedMemoryBytesNot;
  }


  public HostWhereInput provisionedMemoryBytesNotIn(List<Long> provisionedMemoryBytesNotIn) {
    
    this.provisionedMemoryBytesNotIn = provisionedMemoryBytesNotIn;
    return this;
  }

  public HostWhereInput addProvisionedMemoryBytesNotInItem(Long provisionedMemoryBytesNotInItem) {
    if (this.provisionedMemoryBytesNotIn == null) {
      this.provisionedMemoryBytesNotIn = new ArrayList<Long>();
    }
    this.provisionedMemoryBytesNotIn.add(provisionedMemoryBytesNotInItem);
    return this;
  }

   /**
   * Get provisionedMemoryBytesNotIn
   * @return provisionedMemoryBytesNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Long> getProvisionedMemoryBytesNotIn() {
    return provisionedMemoryBytesNotIn;
  }


  public void setProvisionedMemoryBytesNotIn(List<Long> provisionedMemoryBytesNotIn) {
    this.provisionedMemoryBytesNotIn = provisionedMemoryBytesNotIn;
  }


  public HostWhereInput runningPauseVmMemoryBytes(Long runningPauseVmMemoryBytes) {
    
    this.runningPauseVmMemoryBytes = runningPauseVmMemoryBytes;
    return this;
  }

   /**
   * Get runningPauseVmMemoryBytes
   * @return runningPauseVmMemoryBytes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getRunningPauseVmMemoryBytes() {
    return runningPauseVmMemoryBytes;
  }


  public void setRunningPauseVmMemoryBytes(Long runningPauseVmMemoryBytes) {
    this.runningPauseVmMemoryBytes = runningPauseVmMemoryBytes;
  }


  public HostWhereInput runningPauseVmMemoryBytesGt(Long runningPauseVmMemoryBytesGt) {
    
    this.runningPauseVmMemoryBytesGt = runningPauseVmMemoryBytesGt;
    return this;
  }

   /**
   * Get runningPauseVmMemoryBytesGt
   * @return runningPauseVmMemoryBytesGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getRunningPauseVmMemoryBytesGt() {
    return runningPauseVmMemoryBytesGt;
  }


  public void setRunningPauseVmMemoryBytesGt(Long runningPauseVmMemoryBytesGt) {
    this.runningPauseVmMemoryBytesGt = runningPauseVmMemoryBytesGt;
  }


  public HostWhereInput runningPauseVmMemoryBytesGte(Long runningPauseVmMemoryBytesGte) {
    
    this.runningPauseVmMemoryBytesGte = runningPauseVmMemoryBytesGte;
    return this;
  }

   /**
   * Get runningPauseVmMemoryBytesGte
   * @return runningPauseVmMemoryBytesGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getRunningPauseVmMemoryBytesGte() {
    return runningPauseVmMemoryBytesGte;
  }


  public void setRunningPauseVmMemoryBytesGte(Long runningPauseVmMemoryBytesGte) {
    this.runningPauseVmMemoryBytesGte = runningPauseVmMemoryBytesGte;
  }


  public HostWhereInput runningPauseVmMemoryBytesIn(List<Long> runningPauseVmMemoryBytesIn) {
    
    this.runningPauseVmMemoryBytesIn = runningPauseVmMemoryBytesIn;
    return this;
  }

  public HostWhereInput addRunningPauseVmMemoryBytesInItem(Long runningPauseVmMemoryBytesInItem) {
    if (this.runningPauseVmMemoryBytesIn == null) {
      this.runningPauseVmMemoryBytesIn = new ArrayList<Long>();
    }
    this.runningPauseVmMemoryBytesIn.add(runningPauseVmMemoryBytesInItem);
    return this;
  }

   /**
   * Get runningPauseVmMemoryBytesIn
   * @return runningPauseVmMemoryBytesIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Long> getRunningPauseVmMemoryBytesIn() {
    return runningPauseVmMemoryBytesIn;
  }


  public void setRunningPauseVmMemoryBytesIn(List<Long> runningPauseVmMemoryBytesIn) {
    this.runningPauseVmMemoryBytesIn = runningPauseVmMemoryBytesIn;
  }


  public HostWhereInput runningPauseVmMemoryBytesLt(Long runningPauseVmMemoryBytesLt) {
    
    this.runningPauseVmMemoryBytesLt = runningPauseVmMemoryBytesLt;
    return this;
  }

   /**
   * Get runningPauseVmMemoryBytesLt
   * @return runningPauseVmMemoryBytesLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getRunningPauseVmMemoryBytesLt() {
    return runningPauseVmMemoryBytesLt;
  }


  public void setRunningPauseVmMemoryBytesLt(Long runningPauseVmMemoryBytesLt) {
    this.runningPauseVmMemoryBytesLt = runningPauseVmMemoryBytesLt;
  }


  public HostWhereInput runningPauseVmMemoryBytesLte(Long runningPauseVmMemoryBytesLte) {
    
    this.runningPauseVmMemoryBytesLte = runningPauseVmMemoryBytesLte;
    return this;
  }

   /**
   * Get runningPauseVmMemoryBytesLte
   * @return runningPauseVmMemoryBytesLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getRunningPauseVmMemoryBytesLte() {
    return runningPauseVmMemoryBytesLte;
  }


  public void setRunningPauseVmMemoryBytesLte(Long runningPauseVmMemoryBytesLte) {
    this.runningPauseVmMemoryBytesLte = runningPauseVmMemoryBytesLte;
  }


  public HostWhereInput runningPauseVmMemoryBytesNot(Long runningPauseVmMemoryBytesNot) {
    
    this.runningPauseVmMemoryBytesNot = runningPauseVmMemoryBytesNot;
    return this;
  }

   /**
   * Get runningPauseVmMemoryBytesNot
   * @return runningPauseVmMemoryBytesNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getRunningPauseVmMemoryBytesNot() {
    return runningPauseVmMemoryBytesNot;
  }


  public void setRunningPauseVmMemoryBytesNot(Long runningPauseVmMemoryBytesNot) {
    this.runningPauseVmMemoryBytesNot = runningPauseVmMemoryBytesNot;
  }


  public HostWhereInput runningPauseVmMemoryBytesNotIn(List<Long> runningPauseVmMemoryBytesNotIn) {
    
    this.runningPauseVmMemoryBytesNotIn = runningPauseVmMemoryBytesNotIn;
    return this;
  }

  public HostWhereInput addRunningPauseVmMemoryBytesNotInItem(Long runningPauseVmMemoryBytesNotInItem) {
    if (this.runningPauseVmMemoryBytesNotIn == null) {
      this.runningPauseVmMemoryBytesNotIn = new ArrayList<Long>();
    }
    this.runningPauseVmMemoryBytesNotIn.add(runningPauseVmMemoryBytesNotInItem);
    return this;
  }

   /**
   * Get runningPauseVmMemoryBytesNotIn
   * @return runningPauseVmMemoryBytesNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Long> getRunningPauseVmMemoryBytesNotIn() {
    return runningPauseVmMemoryBytesNotIn;
  }


  public void setRunningPauseVmMemoryBytesNotIn(List<Long> runningPauseVmMemoryBytesNotIn) {
    this.runningPauseVmMemoryBytesNotIn = runningPauseVmMemoryBytesNotIn;
  }


  public HostWhereInput runningVmNum(Integer runningVmNum) {
    
    this.runningVmNum = runningVmNum;
    return this;
  }

   /**
   * Get runningVmNum
   * @return runningVmNum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getRunningVmNum() {
    return runningVmNum;
  }


  public void setRunningVmNum(Integer runningVmNum) {
    this.runningVmNum = runningVmNum;
  }


  public HostWhereInput runningVmNumGt(Integer runningVmNumGt) {
    
    this.runningVmNumGt = runningVmNumGt;
    return this;
  }

   /**
   * Get runningVmNumGt
   * @return runningVmNumGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getRunningVmNumGt() {
    return runningVmNumGt;
  }


  public void setRunningVmNumGt(Integer runningVmNumGt) {
    this.runningVmNumGt = runningVmNumGt;
  }


  public HostWhereInput runningVmNumGte(Integer runningVmNumGte) {
    
    this.runningVmNumGte = runningVmNumGte;
    return this;
  }

   /**
   * Get runningVmNumGte
   * @return runningVmNumGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getRunningVmNumGte() {
    return runningVmNumGte;
  }


  public void setRunningVmNumGte(Integer runningVmNumGte) {
    this.runningVmNumGte = runningVmNumGte;
  }


  public HostWhereInput runningVmNumIn(List<Integer> runningVmNumIn) {
    
    this.runningVmNumIn = runningVmNumIn;
    return this;
  }

  public HostWhereInput addRunningVmNumInItem(Integer runningVmNumInItem) {
    if (this.runningVmNumIn == null) {
      this.runningVmNumIn = new ArrayList<Integer>();
    }
    this.runningVmNumIn.add(runningVmNumInItem);
    return this;
  }

   /**
   * Get runningVmNumIn
   * @return runningVmNumIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Integer> getRunningVmNumIn() {
    return runningVmNumIn;
  }


  public void setRunningVmNumIn(List<Integer> runningVmNumIn) {
    this.runningVmNumIn = runningVmNumIn;
  }


  public HostWhereInput runningVmNumLt(Integer runningVmNumLt) {
    
    this.runningVmNumLt = runningVmNumLt;
    return this;
  }

   /**
   * Get runningVmNumLt
   * @return runningVmNumLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getRunningVmNumLt() {
    return runningVmNumLt;
  }


  public void setRunningVmNumLt(Integer runningVmNumLt) {
    this.runningVmNumLt = runningVmNumLt;
  }


  public HostWhereInput runningVmNumLte(Integer runningVmNumLte) {
    
    this.runningVmNumLte = runningVmNumLte;
    return this;
  }

   /**
   * Get runningVmNumLte
   * @return runningVmNumLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getRunningVmNumLte() {
    return runningVmNumLte;
  }


  public void setRunningVmNumLte(Integer runningVmNumLte) {
    this.runningVmNumLte = runningVmNumLte;
  }


  public HostWhereInput runningVmNumNot(Integer runningVmNumNot) {
    
    this.runningVmNumNot = runningVmNumNot;
    return this;
  }

   /**
   * Get runningVmNumNot
   * @return runningVmNumNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getRunningVmNumNot() {
    return runningVmNumNot;
  }


  public void setRunningVmNumNot(Integer runningVmNumNot) {
    this.runningVmNumNot = runningVmNumNot;
  }


  public HostWhereInput runningVmNumNotIn(List<Integer> runningVmNumNotIn) {
    
    this.runningVmNumNotIn = runningVmNumNotIn;
    return this;
  }

  public HostWhereInput addRunningVmNumNotInItem(Integer runningVmNumNotInItem) {
    if (this.runningVmNumNotIn == null) {
      this.runningVmNumNotIn = new ArrayList<Integer>();
    }
    this.runningVmNumNotIn.add(runningVmNumNotInItem);
    return this;
  }

   /**
   * Get runningVmNumNotIn
   * @return runningVmNumNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Integer> getRunningVmNumNotIn() {
    return runningVmNumNotIn;
  }


  public void setRunningVmNumNotIn(List<Integer> runningVmNumNotIn) {
    this.runningVmNumNotIn = runningVmNumNotIn;
  }


  public HostWhereInput scvmCpu(Integer scvmCpu) {
    
    this.scvmCpu = scvmCpu;
    return this;
  }

   /**
   * Get scvmCpu
   * @return scvmCpu
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getScvmCpu() {
    return scvmCpu;
  }


  public void setScvmCpu(Integer scvmCpu) {
    this.scvmCpu = scvmCpu;
  }


  public HostWhereInput scvmCpuGt(Integer scvmCpuGt) {
    
    this.scvmCpuGt = scvmCpuGt;
    return this;
  }

   /**
   * Get scvmCpuGt
   * @return scvmCpuGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getScvmCpuGt() {
    return scvmCpuGt;
  }


  public void setScvmCpuGt(Integer scvmCpuGt) {
    this.scvmCpuGt = scvmCpuGt;
  }


  public HostWhereInput scvmCpuGte(Integer scvmCpuGte) {
    
    this.scvmCpuGte = scvmCpuGte;
    return this;
  }

   /**
   * Get scvmCpuGte
   * @return scvmCpuGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getScvmCpuGte() {
    return scvmCpuGte;
  }


  public void setScvmCpuGte(Integer scvmCpuGte) {
    this.scvmCpuGte = scvmCpuGte;
  }


  public HostWhereInput scvmCpuIn(List<Integer> scvmCpuIn) {
    
    this.scvmCpuIn = scvmCpuIn;
    return this;
  }

  public HostWhereInput addScvmCpuInItem(Integer scvmCpuInItem) {
    if (this.scvmCpuIn == null) {
      this.scvmCpuIn = new ArrayList<Integer>();
    }
    this.scvmCpuIn.add(scvmCpuInItem);
    return this;
  }

   /**
   * Get scvmCpuIn
   * @return scvmCpuIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Integer> getScvmCpuIn() {
    return scvmCpuIn;
  }


  public void setScvmCpuIn(List<Integer> scvmCpuIn) {
    this.scvmCpuIn = scvmCpuIn;
  }


  public HostWhereInput scvmCpuLt(Integer scvmCpuLt) {
    
    this.scvmCpuLt = scvmCpuLt;
    return this;
  }

   /**
   * Get scvmCpuLt
   * @return scvmCpuLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getScvmCpuLt() {
    return scvmCpuLt;
  }


  public void setScvmCpuLt(Integer scvmCpuLt) {
    this.scvmCpuLt = scvmCpuLt;
  }


  public HostWhereInput scvmCpuLte(Integer scvmCpuLte) {
    
    this.scvmCpuLte = scvmCpuLte;
    return this;
  }

   /**
   * Get scvmCpuLte
   * @return scvmCpuLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getScvmCpuLte() {
    return scvmCpuLte;
  }


  public void setScvmCpuLte(Integer scvmCpuLte) {
    this.scvmCpuLte = scvmCpuLte;
  }


  public HostWhereInput scvmCpuNot(Integer scvmCpuNot) {
    
    this.scvmCpuNot = scvmCpuNot;
    return this;
  }

   /**
   * Get scvmCpuNot
   * @return scvmCpuNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getScvmCpuNot() {
    return scvmCpuNot;
  }


  public void setScvmCpuNot(Integer scvmCpuNot) {
    this.scvmCpuNot = scvmCpuNot;
  }


  public HostWhereInput scvmCpuNotIn(List<Integer> scvmCpuNotIn) {
    
    this.scvmCpuNotIn = scvmCpuNotIn;
    return this;
  }

  public HostWhereInput addScvmCpuNotInItem(Integer scvmCpuNotInItem) {
    if (this.scvmCpuNotIn == null) {
      this.scvmCpuNotIn = new ArrayList<Integer>();
    }
    this.scvmCpuNotIn.add(scvmCpuNotInItem);
    return this;
  }

   /**
   * Get scvmCpuNotIn
   * @return scvmCpuNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Integer> getScvmCpuNotIn() {
    return scvmCpuNotIn;
  }


  public void setScvmCpuNotIn(List<Integer> scvmCpuNotIn) {
    this.scvmCpuNotIn = scvmCpuNotIn;
  }


  public HostWhereInput scvmMemory(Long scvmMemory) {
    
    this.scvmMemory = scvmMemory;
    return this;
  }

   /**
   * Get scvmMemory
   * @return scvmMemory
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getScvmMemory() {
    return scvmMemory;
  }


  public void setScvmMemory(Long scvmMemory) {
    this.scvmMemory = scvmMemory;
  }


  public HostWhereInput scvmMemoryGt(Long scvmMemoryGt) {
    
    this.scvmMemoryGt = scvmMemoryGt;
    return this;
  }

   /**
   * Get scvmMemoryGt
   * @return scvmMemoryGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getScvmMemoryGt() {
    return scvmMemoryGt;
  }


  public void setScvmMemoryGt(Long scvmMemoryGt) {
    this.scvmMemoryGt = scvmMemoryGt;
  }


  public HostWhereInput scvmMemoryGte(Long scvmMemoryGte) {
    
    this.scvmMemoryGte = scvmMemoryGte;
    return this;
  }

   /**
   * Get scvmMemoryGte
   * @return scvmMemoryGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getScvmMemoryGte() {
    return scvmMemoryGte;
  }


  public void setScvmMemoryGte(Long scvmMemoryGte) {
    this.scvmMemoryGte = scvmMemoryGte;
  }


  public HostWhereInput scvmMemoryIn(List<Long> scvmMemoryIn) {
    
    this.scvmMemoryIn = scvmMemoryIn;
    return this;
  }

  public HostWhereInput addScvmMemoryInItem(Long scvmMemoryInItem) {
    if (this.scvmMemoryIn == null) {
      this.scvmMemoryIn = new ArrayList<Long>();
    }
    this.scvmMemoryIn.add(scvmMemoryInItem);
    return this;
  }

   /**
   * Get scvmMemoryIn
   * @return scvmMemoryIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Long> getScvmMemoryIn() {
    return scvmMemoryIn;
  }


  public void setScvmMemoryIn(List<Long> scvmMemoryIn) {
    this.scvmMemoryIn = scvmMemoryIn;
  }


  public HostWhereInput scvmMemoryLt(Long scvmMemoryLt) {
    
    this.scvmMemoryLt = scvmMemoryLt;
    return this;
  }

   /**
   * Get scvmMemoryLt
   * @return scvmMemoryLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getScvmMemoryLt() {
    return scvmMemoryLt;
  }


  public void setScvmMemoryLt(Long scvmMemoryLt) {
    this.scvmMemoryLt = scvmMemoryLt;
  }


  public HostWhereInput scvmMemoryLte(Long scvmMemoryLte) {
    
    this.scvmMemoryLte = scvmMemoryLte;
    return this;
  }

   /**
   * Get scvmMemoryLte
   * @return scvmMemoryLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getScvmMemoryLte() {
    return scvmMemoryLte;
  }


  public void setScvmMemoryLte(Long scvmMemoryLte) {
    this.scvmMemoryLte = scvmMemoryLte;
  }


  public HostWhereInput scvmMemoryNot(Long scvmMemoryNot) {
    
    this.scvmMemoryNot = scvmMemoryNot;
    return this;
  }

   /**
   * Get scvmMemoryNot
   * @return scvmMemoryNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getScvmMemoryNot() {
    return scvmMemoryNot;
  }


  public void setScvmMemoryNot(Long scvmMemoryNot) {
    this.scvmMemoryNot = scvmMemoryNot;
  }


  public HostWhereInput scvmMemoryNotIn(List<Long> scvmMemoryNotIn) {
    
    this.scvmMemoryNotIn = scvmMemoryNotIn;
    return this;
  }

  public HostWhereInput addScvmMemoryNotInItem(Long scvmMemoryNotInItem) {
    if (this.scvmMemoryNotIn == null) {
      this.scvmMemoryNotIn = new ArrayList<Long>();
    }
    this.scvmMemoryNotIn.add(scvmMemoryNotInItem);
    return this;
  }

   /**
   * Get scvmMemoryNotIn
   * @return scvmMemoryNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Long> getScvmMemoryNotIn() {
    return scvmMemoryNotIn;
  }


  public void setScvmMemoryNotIn(List<Long> scvmMemoryNotIn) {
    this.scvmMemoryNotIn = scvmMemoryNotIn;
  }


  public HostWhereInput scvmName(String scvmName) {
    
    this.scvmName = scvmName;
    return this;
  }

   /**
   * Get scvmName
   * @return scvmName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getScvmName() {
    return scvmName;
  }


  public void setScvmName(String scvmName) {
    this.scvmName = scvmName;
  }


  public HostWhereInput scvmNameContains(String scvmNameContains) {
    
    this.scvmNameContains = scvmNameContains;
    return this;
  }

   /**
   * Get scvmNameContains
   * @return scvmNameContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getScvmNameContains() {
    return scvmNameContains;
  }


  public void setScvmNameContains(String scvmNameContains) {
    this.scvmNameContains = scvmNameContains;
  }


  public HostWhereInput scvmNameEndsWith(String scvmNameEndsWith) {
    
    this.scvmNameEndsWith = scvmNameEndsWith;
    return this;
  }

   /**
   * Get scvmNameEndsWith
   * @return scvmNameEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getScvmNameEndsWith() {
    return scvmNameEndsWith;
  }


  public void setScvmNameEndsWith(String scvmNameEndsWith) {
    this.scvmNameEndsWith = scvmNameEndsWith;
  }


  public HostWhereInput scvmNameGt(String scvmNameGt) {
    
    this.scvmNameGt = scvmNameGt;
    return this;
  }

   /**
   * Get scvmNameGt
   * @return scvmNameGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getScvmNameGt() {
    return scvmNameGt;
  }


  public void setScvmNameGt(String scvmNameGt) {
    this.scvmNameGt = scvmNameGt;
  }


  public HostWhereInput scvmNameGte(String scvmNameGte) {
    
    this.scvmNameGte = scvmNameGte;
    return this;
  }

   /**
   * Get scvmNameGte
   * @return scvmNameGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getScvmNameGte() {
    return scvmNameGte;
  }


  public void setScvmNameGte(String scvmNameGte) {
    this.scvmNameGte = scvmNameGte;
  }


  public HostWhereInput scvmNameIn(List<String> scvmNameIn) {
    
    this.scvmNameIn = scvmNameIn;
    return this;
  }

  public HostWhereInput addScvmNameInItem(String scvmNameInItem) {
    if (this.scvmNameIn == null) {
      this.scvmNameIn = new ArrayList<String>();
    }
    this.scvmNameIn.add(scvmNameInItem);
    return this;
  }

   /**
   * Get scvmNameIn
   * @return scvmNameIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getScvmNameIn() {
    return scvmNameIn;
  }


  public void setScvmNameIn(List<String> scvmNameIn) {
    this.scvmNameIn = scvmNameIn;
  }


  public HostWhereInput scvmNameLt(String scvmNameLt) {
    
    this.scvmNameLt = scvmNameLt;
    return this;
  }

   /**
   * Get scvmNameLt
   * @return scvmNameLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getScvmNameLt() {
    return scvmNameLt;
  }


  public void setScvmNameLt(String scvmNameLt) {
    this.scvmNameLt = scvmNameLt;
  }


  public HostWhereInput scvmNameLte(String scvmNameLte) {
    
    this.scvmNameLte = scvmNameLte;
    return this;
  }

   /**
   * Get scvmNameLte
   * @return scvmNameLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getScvmNameLte() {
    return scvmNameLte;
  }


  public void setScvmNameLte(String scvmNameLte) {
    this.scvmNameLte = scvmNameLte;
  }


  public HostWhereInput scvmNameNot(String scvmNameNot) {
    
    this.scvmNameNot = scvmNameNot;
    return this;
  }

   /**
   * Get scvmNameNot
   * @return scvmNameNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getScvmNameNot() {
    return scvmNameNot;
  }


  public void setScvmNameNot(String scvmNameNot) {
    this.scvmNameNot = scvmNameNot;
  }


  public HostWhereInput scvmNameNotContains(String scvmNameNotContains) {
    
    this.scvmNameNotContains = scvmNameNotContains;
    return this;
  }

   /**
   * Get scvmNameNotContains
   * @return scvmNameNotContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getScvmNameNotContains() {
    return scvmNameNotContains;
  }


  public void setScvmNameNotContains(String scvmNameNotContains) {
    this.scvmNameNotContains = scvmNameNotContains;
  }


  public HostWhereInput scvmNameNotEndsWith(String scvmNameNotEndsWith) {
    
    this.scvmNameNotEndsWith = scvmNameNotEndsWith;
    return this;
  }

   /**
   * Get scvmNameNotEndsWith
   * @return scvmNameNotEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getScvmNameNotEndsWith() {
    return scvmNameNotEndsWith;
  }


  public void setScvmNameNotEndsWith(String scvmNameNotEndsWith) {
    this.scvmNameNotEndsWith = scvmNameNotEndsWith;
  }


  public HostWhereInput scvmNameNotIn(List<String> scvmNameNotIn) {
    
    this.scvmNameNotIn = scvmNameNotIn;
    return this;
  }

  public HostWhereInput addScvmNameNotInItem(String scvmNameNotInItem) {
    if (this.scvmNameNotIn == null) {
      this.scvmNameNotIn = new ArrayList<String>();
    }
    this.scvmNameNotIn.add(scvmNameNotInItem);
    return this;
  }

   /**
   * Get scvmNameNotIn
   * @return scvmNameNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getScvmNameNotIn() {
    return scvmNameNotIn;
  }


  public void setScvmNameNotIn(List<String> scvmNameNotIn) {
    this.scvmNameNotIn = scvmNameNotIn;
  }


  public HostWhereInput scvmNameNotStartsWith(String scvmNameNotStartsWith) {
    
    this.scvmNameNotStartsWith = scvmNameNotStartsWith;
    return this;
  }

   /**
   * Get scvmNameNotStartsWith
   * @return scvmNameNotStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getScvmNameNotStartsWith() {
    return scvmNameNotStartsWith;
  }


  public void setScvmNameNotStartsWith(String scvmNameNotStartsWith) {
    this.scvmNameNotStartsWith = scvmNameNotStartsWith;
  }


  public HostWhereInput scvmNameStartsWith(String scvmNameStartsWith) {
    
    this.scvmNameStartsWith = scvmNameStartsWith;
    return this;
  }

   /**
   * Get scvmNameStartsWith
   * @return scvmNameStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getScvmNameStartsWith() {
    return scvmNameStartsWith;
  }


  public void setScvmNameStartsWith(String scvmNameStartsWith) {
    this.scvmNameStartsWith = scvmNameStartsWith;
  }


  public HostWhereInput serial(String serial) {
    
    this.serial = serial;
    return this;
  }

   /**
   * Get serial
   * @return serial
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSerial() {
    return serial;
  }


  public void setSerial(String serial) {
    this.serial = serial;
  }


  public HostWhereInput serialContains(String serialContains) {
    
    this.serialContains = serialContains;
    return this;
  }

   /**
   * Get serialContains
   * @return serialContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSerialContains() {
    return serialContains;
  }


  public void setSerialContains(String serialContains) {
    this.serialContains = serialContains;
  }


  public HostWhereInput serialEndsWith(String serialEndsWith) {
    
    this.serialEndsWith = serialEndsWith;
    return this;
  }

   /**
   * Get serialEndsWith
   * @return serialEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSerialEndsWith() {
    return serialEndsWith;
  }


  public void setSerialEndsWith(String serialEndsWith) {
    this.serialEndsWith = serialEndsWith;
  }


  public HostWhereInput serialGt(String serialGt) {
    
    this.serialGt = serialGt;
    return this;
  }

   /**
   * Get serialGt
   * @return serialGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSerialGt() {
    return serialGt;
  }


  public void setSerialGt(String serialGt) {
    this.serialGt = serialGt;
  }


  public HostWhereInput serialGte(String serialGte) {
    
    this.serialGte = serialGte;
    return this;
  }

   /**
   * Get serialGte
   * @return serialGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSerialGte() {
    return serialGte;
  }


  public void setSerialGte(String serialGte) {
    this.serialGte = serialGte;
  }


  public HostWhereInput serialIn(List<String> serialIn) {
    
    this.serialIn = serialIn;
    return this;
  }

  public HostWhereInput addSerialInItem(String serialInItem) {
    if (this.serialIn == null) {
      this.serialIn = new ArrayList<String>();
    }
    this.serialIn.add(serialInItem);
    return this;
  }

   /**
   * Get serialIn
   * @return serialIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getSerialIn() {
    return serialIn;
  }


  public void setSerialIn(List<String> serialIn) {
    this.serialIn = serialIn;
  }


  public HostWhereInput serialLt(String serialLt) {
    
    this.serialLt = serialLt;
    return this;
  }

   /**
   * Get serialLt
   * @return serialLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSerialLt() {
    return serialLt;
  }


  public void setSerialLt(String serialLt) {
    this.serialLt = serialLt;
  }


  public HostWhereInput serialLte(String serialLte) {
    
    this.serialLte = serialLte;
    return this;
  }

   /**
   * Get serialLte
   * @return serialLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSerialLte() {
    return serialLte;
  }


  public void setSerialLte(String serialLte) {
    this.serialLte = serialLte;
  }


  public HostWhereInput serialNot(String serialNot) {
    
    this.serialNot = serialNot;
    return this;
  }

   /**
   * Get serialNot
   * @return serialNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSerialNot() {
    return serialNot;
  }


  public void setSerialNot(String serialNot) {
    this.serialNot = serialNot;
  }


  public HostWhereInput serialNotContains(String serialNotContains) {
    
    this.serialNotContains = serialNotContains;
    return this;
  }

   /**
   * Get serialNotContains
   * @return serialNotContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSerialNotContains() {
    return serialNotContains;
  }


  public void setSerialNotContains(String serialNotContains) {
    this.serialNotContains = serialNotContains;
  }


  public HostWhereInput serialNotEndsWith(String serialNotEndsWith) {
    
    this.serialNotEndsWith = serialNotEndsWith;
    return this;
  }

   /**
   * Get serialNotEndsWith
   * @return serialNotEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSerialNotEndsWith() {
    return serialNotEndsWith;
  }


  public void setSerialNotEndsWith(String serialNotEndsWith) {
    this.serialNotEndsWith = serialNotEndsWith;
  }


  public HostWhereInput serialNotIn(List<String> serialNotIn) {
    
    this.serialNotIn = serialNotIn;
    return this;
  }

  public HostWhereInput addSerialNotInItem(String serialNotInItem) {
    if (this.serialNotIn == null) {
      this.serialNotIn = new ArrayList<String>();
    }
    this.serialNotIn.add(serialNotInItem);
    return this;
  }

   /**
   * Get serialNotIn
   * @return serialNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getSerialNotIn() {
    return serialNotIn;
  }


  public void setSerialNotIn(List<String> serialNotIn) {
    this.serialNotIn = serialNotIn;
  }


  public HostWhereInput serialNotStartsWith(String serialNotStartsWith) {
    
    this.serialNotStartsWith = serialNotStartsWith;
    return this;
  }

   /**
   * Get serialNotStartsWith
   * @return serialNotStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSerialNotStartsWith() {
    return serialNotStartsWith;
  }


  public void setSerialNotStartsWith(String serialNotStartsWith) {
    this.serialNotStartsWith = serialNotStartsWith;
  }


  public HostWhereInput serialStartsWith(String serialStartsWith) {
    
    this.serialStartsWith = serialStartsWith;
    return this;
  }

   /**
   * Get serialStartsWith
   * @return serialStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSerialStartsWith() {
    return serialStartsWith;
  }


  public void setSerialStartsWith(String serialStartsWith) {
    this.serialStartsWith = serialStartsWith;
  }


  public HostWhereInput ssdDataCapacity(Long ssdDataCapacity) {
    
    this.ssdDataCapacity = ssdDataCapacity;
    return this;
  }

   /**
   * Get ssdDataCapacity
   * @return ssdDataCapacity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getSsdDataCapacity() {
    return ssdDataCapacity;
  }


  public void setSsdDataCapacity(Long ssdDataCapacity) {
    this.ssdDataCapacity = ssdDataCapacity;
  }


  public HostWhereInput ssdDataCapacityGt(Long ssdDataCapacityGt) {
    
    this.ssdDataCapacityGt = ssdDataCapacityGt;
    return this;
  }

   /**
   * Get ssdDataCapacityGt
   * @return ssdDataCapacityGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getSsdDataCapacityGt() {
    return ssdDataCapacityGt;
  }


  public void setSsdDataCapacityGt(Long ssdDataCapacityGt) {
    this.ssdDataCapacityGt = ssdDataCapacityGt;
  }


  public HostWhereInput ssdDataCapacityGte(Long ssdDataCapacityGte) {
    
    this.ssdDataCapacityGte = ssdDataCapacityGte;
    return this;
  }

   /**
   * Get ssdDataCapacityGte
   * @return ssdDataCapacityGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getSsdDataCapacityGte() {
    return ssdDataCapacityGte;
  }


  public void setSsdDataCapacityGte(Long ssdDataCapacityGte) {
    this.ssdDataCapacityGte = ssdDataCapacityGte;
  }


  public HostWhereInput ssdDataCapacityIn(List<Long> ssdDataCapacityIn) {
    
    this.ssdDataCapacityIn = ssdDataCapacityIn;
    return this;
  }

  public HostWhereInput addSsdDataCapacityInItem(Long ssdDataCapacityInItem) {
    if (this.ssdDataCapacityIn == null) {
      this.ssdDataCapacityIn = new ArrayList<Long>();
    }
    this.ssdDataCapacityIn.add(ssdDataCapacityInItem);
    return this;
  }

   /**
   * Get ssdDataCapacityIn
   * @return ssdDataCapacityIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Long> getSsdDataCapacityIn() {
    return ssdDataCapacityIn;
  }


  public void setSsdDataCapacityIn(List<Long> ssdDataCapacityIn) {
    this.ssdDataCapacityIn = ssdDataCapacityIn;
  }


  public HostWhereInput ssdDataCapacityLt(Long ssdDataCapacityLt) {
    
    this.ssdDataCapacityLt = ssdDataCapacityLt;
    return this;
  }

   /**
   * Get ssdDataCapacityLt
   * @return ssdDataCapacityLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getSsdDataCapacityLt() {
    return ssdDataCapacityLt;
  }


  public void setSsdDataCapacityLt(Long ssdDataCapacityLt) {
    this.ssdDataCapacityLt = ssdDataCapacityLt;
  }


  public HostWhereInput ssdDataCapacityLte(Long ssdDataCapacityLte) {
    
    this.ssdDataCapacityLte = ssdDataCapacityLte;
    return this;
  }

   /**
   * Get ssdDataCapacityLte
   * @return ssdDataCapacityLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getSsdDataCapacityLte() {
    return ssdDataCapacityLte;
  }


  public void setSsdDataCapacityLte(Long ssdDataCapacityLte) {
    this.ssdDataCapacityLte = ssdDataCapacityLte;
  }


  public HostWhereInput ssdDataCapacityNot(Long ssdDataCapacityNot) {
    
    this.ssdDataCapacityNot = ssdDataCapacityNot;
    return this;
  }

   /**
   * Get ssdDataCapacityNot
   * @return ssdDataCapacityNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getSsdDataCapacityNot() {
    return ssdDataCapacityNot;
  }


  public void setSsdDataCapacityNot(Long ssdDataCapacityNot) {
    this.ssdDataCapacityNot = ssdDataCapacityNot;
  }


  public HostWhereInput ssdDataCapacityNotIn(List<Long> ssdDataCapacityNotIn) {
    
    this.ssdDataCapacityNotIn = ssdDataCapacityNotIn;
    return this;
  }

  public HostWhereInput addSsdDataCapacityNotInItem(Long ssdDataCapacityNotInItem) {
    if (this.ssdDataCapacityNotIn == null) {
      this.ssdDataCapacityNotIn = new ArrayList<Long>();
    }
    this.ssdDataCapacityNotIn.add(ssdDataCapacityNotInItem);
    return this;
  }

   /**
   * Get ssdDataCapacityNotIn
   * @return ssdDataCapacityNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Long> getSsdDataCapacityNotIn() {
    return ssdDataCapacityNotIn;
  }


  public void setSsdDataCapacityNotIn(List<Long> ssdDataCapacityNotIn) {
    this.ssdDataCapacityNotIn = ssdDataCapacityNotIn;
  }


  public HostWhereInput ssdDiskCount(Integer ssdDiskCount) {
    
    this.ssdDiskCount = ssdDiskCount;
    return this;
  }

   /**
   * Get ssdDiskCount
   * @return ssdDiskCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getSsdDiskCount() {
    return ssdDiskCount;
  }


  public void setSsdDiskCount(Integer ssdDiskCount) {
    this.ssdDiskCount = ssdDiskCount;
  }


  public HostWhereInput ssdDiskCountGt(Integer ssdDiskCountGt) {
    
    this.ssdDiskCountGt = ssdDiskCountGt;
    return this;
  }

   /**
   * Get ssdDiskCountGt
   * @return ssdDiskCountGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getSsdDiskCountGt() {
    return ssdDiskCountGt;
  }


  public void setSsdDiskCountGt(Integer ssdDiskCountGt) {
    this.ssdDiskCountGt = ssdDiskCountGt;
  }


  public HostWhereInput ssdDiskCountGte(Integer ssdDiskCountGte) {
    
    this.ssdDiskCountGte = ssdDiskCountGte;
    return this;
  }

   /**
   * Get ssdDiskCountGte
   * @return ssdDiskCountGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getSsdDiskCountGte() {
    return ssdDiskCountGte;
  }


  public void setSsdDiskCountGte(Integer ssdDiskCountGte) {
    this.ssdDiskCountGte = ssdDiskCountGte;
  }


  public HostWhereInput ssdDiskCountIn(List<Integer> ssdDiskCountIn) {
    
    this.ssdDiskCountIn = ssdDiskCountIn;
    return this;
  }

  public HostWhereInput addSsdDiskCountInItem(Integer ssdDiskCountInItem) {
    if (this.ssdDiskCountIn == null) {
      this.ssdDiskCountIn = new ArrayList<Integer>();
    }
    this.ssdDiskCountIn.add(ssdDiskCountInItem);
    return this;
  }

   /**
   * Get ssdDiskCountIn
   * @return ssdDiskCountIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Integer> getSsdDiskCountIn() {
    return ssdDiskCountIn;
  }


  public void setSsdDiskCountIn(List<Integer> ssdDiskCountIn) {
    this.ssdDiskCountIn = ssdDiskCountIn;
  }


  public HostWhereInput ssdDiskCountLt(Integer ssdDiskCountLt) {
    
    this.ssdDiskCountLt = ssdDiskCountLt;
    return this;
  }

   /**
   * Get ssdDiskCountLt
   * @return ssdDiskCountLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getSsdDiskCountLt() {
    return ssdDiskCountLt;
  }


  public void setSsdDiskCountLt(Integer ssdDiskCountLt) {
    this.ssdDiskCountLt = ssdDiskCountLt;
  }


  public HostWhereInput ssdDiskCountLte(Integer ssdDiskCountLte) {
    
    this.ssdDiskCountLte = ssdDiskCountLte;
    return this;
  }

   /**
   * Get ssdDiskCountLte
   * @return ssdDiskCountLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getSsdDiskCountLte() {
    return ssdDiskCountLte;
  }


  public void setSsdDiskCountLte(Integer ssdDiskCountLte) {
    this.ssdDiskCountLte = ssdDiskCountLte;
  }


  public HostWhereInput ssdDiskCountNot(Integer ssdDiskCountNot) {
    
    this.ssdDiskCountNot = ssdDiskCountNot;
    return this;
  }

   /**
   * Get ssdDiskCountNot
   * @return ssdDiskCountNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getSsdDiskCountNot() {
    return ssdDiskCountNot;
  }


  public void setSsdDiskCountNot(Integer ssdDiskCountNot) {
    this.ssdDiskCountNot = ssdDiskCountNot;
  }


  public HostWhereInput ssdDiskCountNotIn(List<Integer> ssdDiskCountNotIn) {
    
    this.ssdDiskCountNotIn = ssdDiskCountNotIn;
    return this;
  }

  public HostWhereInput addSsdDiskCountNotInItem(Integer ssdDiskCountNotInItem) {
    if (this.ssdDiskCountNotIn == null) {
      this.ssdDiskCountNotIn = new ArrayList<Integer>();
    }
    this.ssdDiskCountNotIn.add(ssdDiskCountNotInItem);
    return this;
  }

   /**
   * Get ssdDiskCountNotIn
   * @return ssdDiskCountNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Integer> getSsdDiskCountNotIn() {
    return ssdDiskCountNotIn;
  }


  public void setSsdDiskCountNotIn(List<Integer> ssdDiskCountNotIn) {
    this.ssdDiskCountNotIn = ssdDiskCountNotIn;
  }


  public HostWhereInput state(HostState state) {
    
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public HostState getState() {
    return state;
  }


  public void setState(HostState state) {
    this.state = state;
  }


  public HostWhereInput stateIn(List<HostState> stateIn) {
    
    this.stateIn = stateIn;
    return this;
  }

  public HostWhereInput addStateInItem(HostState stateInItem) {
    if (this.stateIn == null) {
      this.stateIn = new ArrayList<HostState>();
    }
    this.stateIn.add(stateInItem);
    return this;
  }

   /**
   * Get stateIn
   * @return stateIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<HostState> getStateIn() {
    return stateIn;
  }


  public void setStateIn(List<HostState> stateIn) {
    this.stateIn = stateIn;
  }


  public HostWhereInput stateNot(HostState stateNot) {
    
    this.stateNot = stateNot;
    return this;
  }

   /**
   * Get stateNot
   * @return stateNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public HostState getStateNot() {
    return stateNot;
  }


  public void setStateNot(HostState stateNot) {
    this.stateNot = stateNot;
  }


  public HostWhereInput stateNotIn(List<HostState> stateNotIn) {
    
    this.stateNotIn = stateNotIn;
    return this;
  }

  public HostWhereInput addStateNotInItem(HostState stateNotInItem) {
    if (this.stateNotIn == null) {
      this.stateNotIn = new ArrayList<HostState>();
    }
    this.stateNotIn.add(stateNotInItem);
    return this;
  }

   /**
   * Get stateNotIn
   * @return stateNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<HostState> getStateNotIn() {
    return stateNotIn;
  }


  public void setStateNotIn(List<HostState> stateNotIn) {
    this.stateNotIn = stateNotIn;
  }


  public HostWhereInput status(HostStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public HostStatus getStatus() {
    return status;
  }


  public void setStatus(HostStatus status) {
    this.status = status;
  }


  public HostWhereInput statusIn(List<HostStatus> statusIn) {
    
    this.statusIn = statusIn;
    return this;
  }

  public HostWhereInput addStatusInItem(HostStatus statusInItem) {
    if (this.statusIn == null) {
      this.statusIn = new ArrayList<HostStatus>();
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

  public List<HostStatus> getStatusIn() {
    return statusIn;
  }


  public void setStatusIn(List<HostStatus> statusIn) {
    this.statusIn = statusIn;
  }


  public HostWhereInput statusNot(HostStatus statusNot) {
    
    this.statusNot = statusNot;
    return this;
  }

   /**
   * Get statusNot
   * @return statusNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public HostStatus getStatusNot() {
    return statusNot;
  }


  public void setStatusNot(HostStatus statusNot) {
    this.statusNot = statusNot;
  }


  public HostWhereInput statusNotIn(List<HostStatus> statusNotIn) {
    
    this.statusNotIn = statusNotIn;
    return this;
  }

  public HostWhereInput addStatusNotInItem(HostStatus statusNotInItem) {
    if (this.statusNotIn == null) {
      this.statusNotIn = new ArrayList<HostStatus>();
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

  public List<HostStatus> getStatusNotIn() {
    return statusNotIn;
  }


  public void setStatusNotIn(List<HostStatus> statusNotIn) {
    this.statusNotIn = statusNotIn;
  }


  public HostWhereInput stoppedVmNum(Integer stoppedVmNum) {
    
    this.stoppedVmNum = stoppedVmNum;
    return this;
  }

   /**
   * Get stoppedVmNum
   * @return stoppedVmNum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getStoppedVmNum() {
    return stoppedVmNum;
  }


  public void setStoppedVmNum(Integer stoppedVmNum) {
    this.stoppedVmNum = stoppedVmNum;
  }


  public HostWhereInput stoppedVmNumGt(Integer stoppedVmNumGt) {
    
    this.stoppedVmNumGt = stoppedVmNumGt;
    return this;
  }

   /**
   * Get stoppedVmNumGt
   * @return stoppedVmNumGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getStoppedVmNumGt() {
    return stoppedVmNumGt;
  }


  public void setStoppedVmNumGt(Integer stoppedVmNumGt) {
    this.stoppedVmNumGt = stoppedVmNumGt;
  }


  public HostWhereInput stoppedVmNumGte(Integer stoppedVmNumGte) {
    
    this.stoppedVmNumGte = stoppedVmNumGte;
    return this;
  }

   /**
   * Get stoppedVmNumGte
   * @return stoppedVmNumGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getStoppedVmNumGte() {
    return stoppedVmNumGte;
  }


  public void setStoppedVmNumGte(Integer stoppedVmNumGte) {
    this.stoppedVmNumGte = stoppedVmNumGte;
  }


  public HostWhereInput stoppedVmNumIn(List<Integer> stoppedVmNumIn) {
    
    this.stoppedVmNumIn = stoppedVmNumIn;
    return this;
  }

  public HostWhereInput addStoppedVmNumInItem(Integer stoppedVmNumInItem) {
    if (this.stoppedVmNumIn == null) {
      this.stoppedVmNumIn = new ArrayList<Integer>();
    }
    this.stoppedVmNumIn.add(stoppedVmNumInItem);
    return this;
  }

   /**
   * Get stoppedVmNumIn
   * @return stoppedVmNumIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Integer> getStoppedVmNumIn() {
    return stoppedVmNumIn;
  }


  public void setStoppedVmNumIn(List<Integer> stoppedVmNumIn) {
    this.stoppedVmNumIn = stoppedVmNumIn;
  }


  public HostWhereInput stoppedVmNumLt(Integer stoppedVmNumLt) {
    
    this.stoppedVmNumLt = stoppedVmNumLt;
    return this;
  }

   /**
   * Get stoppedVmNumLt
   * @return stoppedVmNumLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getStoppedVmNumLt() {
    return stoppedVmNumLt;
  }


  public void setStoppedVmNumLt(Integer stoppedVmNumLt) {
    this.stoppedVmNumLt = stoppedVmNumLt;
  }


  public HostWhereInput stoppedVmNumLte(Integer stoppedVmNumLte) {
    
    this.stoppedVmNumLte = stoppedVmNumLte;
    return this;
  }

   /**
   * Get stoppedVmNumLte
   * @return stoppedVmNumLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getStoppedVmNumLte() {
    return stoppedVmNumLte;
  }


  public void setStoppedVmNumLte(Integer stoppedVmNumLte) {
    this.stoppedVmNumLte = stoppedVmNumLte;
  }


  public HostWhereInput stoppedVmNumNot(Integer stoppedVmNumNot) {
    
    this.stoppedVmNumNot = stoppedVmNumNot;
    return this;
  }

   /**
   * Get stoppedVmNumNot
   * @return stoppedVmNumNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getStoppedVmNumNot() {
    return stoppedVmNumNot;
  }


  public void setStoppedVmNumNot(Integer stoppedVmNumNot) {
    this.stoppedVmNumNot = stoppedVmNumNot;
  }


  public HostWhereInput stoppedVmNumNotIn(List<Integer> stoppedVmNumNotIn) {
    
    this.stoppedVmNumNotIn = stoppedVmNumNotIn;
    return this;
  }

  public HostWhereInput addStoppedVmNumNotInItem(Integer stoppedVmNumNotInItem) {
    if (this.stoppedVmNumNotIn == null) {
      this.stoppedVmNumNotIn = new ArrayList<Integer>();
    }
    this.stoppedVmNumNotIn.add(stoppedVmNumNotInItem);
    return this;
  }

   /**
   * Get stoppedVmNumNotIn
   * @return stoppedVmNumNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Integer> getStoppedVmNumNotIn() {
    return stoppedVmNumNotIn;
  }


  public void setStoppedVmNumNotIn(List<Integer> stoppedVmNumNotIn) {
    this.stoppedVmNumNotIn = stoppedVmNumNotIn;
  }


  public HostWhereInput suspendedVmNum(Integer suspendedVmNum) {
    
    this.suspendedVmNum = suspendedVmNum;
    return this;
  }

   /**
   * Get suspendedVmNum
   * @return suspendedVmNum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getSuspendedVmNum() {
    return suspendedVmNum;
  }


  public void setSuspendedVmNum(Integer suspendedVmNum) {
    this.suspendedVmNum = suspendedVmNum;
  }


  public HostWhereInput suspendedVmNumGt(Integer suspendedVmNumGt) {
    
    this.suspendedVmNumGt = suspendedVmNumGt;
    return this;
  }

   /**
   * Get suspendedVmNumGt
   * @return suspendedVmNumGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getSuspendedVmNumGt() {
    return suspendedVmNumGt;
  }


  public void setSuspendedVmNumGt(Integer suspendedVmNumGt) {
    this.suspendedVmNumGt = suspendedVmNumGt;
  }


  public HostWhereInput suspendedVmNumGte(Integer suspendedVmNumGte) {
    
    this.suspendedVmNumGte = suspendedVmNumGte;
    return this;
  }

   /**
   * Get suspendedVmNumGte
   * @return suspendedVmNumGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getSuspendedVmNumGte() {
    return suspendedVmNumGte;
  }


  public void setSuspendedVmNumGte(Integer suspendedVmNumGte) {
    this.suspendedVmNumGte = suspendedVmNumGte;
  }


  public HostWhereInput suspendedVmNumIn(List<Integer> suspendedVmNumIn) {
    
    this.suspendedVmNumIn = suspendedVmNumIn;
    return this;
  }

  public HostWhereInput addSuspendedVmNumInItem(Integer suspendedVmNumInItem) {
    if (this.suspendedVmNumIn == null) {
      this.suspendedVmNumIn = new ArrayList<Integer>();
    }
    this.suspendedVmNumIn.add(suspendedVmNumInItem);
    return this;
  }

   /**
   * Get suspendedVmNumIn
   * @return suspendedVmNumIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Integer> getSuspendedVmNumIn() {
    return suspendedVmNumIn;
  }


  public void setSuspendedVmNumIn(List<Integer> suspendedVmNumIn) {
    this.suspendedVmNumIn = suspendedVmNumIn;
  }


  public HostWhereInput suspendedVmNumLt(Integer suspendedVmNumLt) {
    
    this.suspendedVmNumLt = suspendedVmNumLt;
    return this;
  }

   /**
   * Get suspendedVmNumLt
   * @return suspendedVmNumLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getSuspendedVmNumLt() {
    return suspendedVmNumLt;
  }


  public void setSuspendedVmNumLt(Integer suspendedVmNumLt) {
    this.suspendedVmNumLt = suspendedVmNumLt;
  }


  public HostWhereInput suspendedVmNumLte(Integer suspendedVmNumLte) {
    
    this.suspendedVmNumLte = suspendedVmNumLte;
    return this;
  }

   /**
   * Get suspendedVmNumLte
   * @return suspendedVmNumLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getSuspendedVmNumLte() {
    return suspendedVmNumLte;
  }


  public void setSuspendedVmNumLte(Integer suspendedVmNumLte) {
    this.suspendedVmNumLte = suspendedVmNumLte;
  }


  public HostWhereInput suspendedVmNumNot(Integer suspendedVmNumNot) {
    
    this.suspendedVmNumNot = suspendedVmNumNot;
    return this;
  }

   /**
   * Get suspendedVmNumNot
   * @return suspendedVmNumNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getSuspendedVmNumNot() {
    return suspendedVmNumNot;
  }


  public void setSuspendedVmNumNot(Integer suspendedVmNumNot) {
    this.suspendedVmNumNot = suspendedVmNumNot;
  }


  public HostWhereInput suspendedVmNumNotIn(List<Integer> suspendedVmNumNotIn) {
    
    this.suspendedVmNumNotIn = suspendedVmNumNotIn;
    return this;
  }

  public HostWhereInput addSuspendedVmNumNotInItem(Integer suspendedVmNumNotInItem) {
    if (this.suspendedVmNumNotIn == null) {
      this.suspendedVmNumNotIn = new ArrayList<Integer>();
    }
    this.suspendedVmNumNotIn.add(suspendedVmNumNotInItem);
    return this;
  }

   /**
   * Get suspendedVmNumNotIn
   * @return suspendedVmNumNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Integer> getSuspendedVmNumNotIn() {
    return suspendedVmNumNotIn;
  }


  public void setSuspendedVmNumNotIn(List<Integer> suspendedVmNumNotIn) {
    this.suspendedVmNumNotIn = suspendedVmNumNotIn;
  }


  public HostWhereInput totalCacheCapacity(Long totalCacheCapacity) {
    
    this.totalCacheCapacity = totalCacheCapacity;
    return this;
  }

   /**
   * Get totalCacheCapacity
   * @return totalCacheCapacity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getTotalCacheCapacity() {
    return totalCacheCapacity;
  }


  public void setTotalCacheCapacity(Long totalCacheCapacity) {
    this.totalCacheCapacity = totalCacheCapacity;
  }


  public HostWhereInput totalCacheCapacityGt(Long totalCacheCapacityGt) {
    
    this.totalCacheCapacityGt = totalCacheCapacityGt;
    return this;
  }

   /**
   * Get totalCacheCapacityGt
   * @return totalCacheCapacityGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getTotalCacheCapacityGt() {
    return totalCacheCapacityGt;
  }


  public void setTotalCacheCapacityGt(Long totalCacheCapacityGt) {
    this.totalCacheCapacityGt = totalCacheCapacityGt;
  }


  public HostWhereInput totalCacheCapacityGte(Long totalCacheCapacityGte) {
    
    this.totalCacheCapacityGte = totalCacheCapacityGte;
    return this;
  }

   /**
   * Get totalCacheCapacityGte
   * @return totalCacheCapacityGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getTotalCacheCapacityGte() {
    return totalCacheCapacityGte;
  }


  public void setTotalCacheCapacityGte(Long totalCacheCapacityGte) {
    this.totalCacheCapacityGte = totalCacheCapacityGte;
  }


  public HostWhereInput totalCacheCapacityIn(List<Long> totalCacheCapacityIn) {
    
    this.totalCacheCapacityIn = totalCacheCapacityIn;
    return this;
  }

  public HostWhereInput addTotalCacheCapacityInItem(Long totalCacheCapacityInItem) {
    if (this.totalCacheCapacityIn == null) {
      this.totalCacheCapacityIn = new ArrayList<Long>();
    }
    this.totalCacheCapacityIn.add(totalCacheCapacityInItem);
    return this;
  }

   /**
   * Get totalCacheCapacityIn
   * @return totalCacheCapacityIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Long> getTotalCacheCapacityIn() {
    return totalCacheCapacityIn;
  }


  public void setTotalCacheCapacityIn(List<Long> totalCacheCapacityIn) {
    this.totalCacheCapacityIn = totalCacheCapacityIn;
  }


  public HostWhereInput totalCacheCapacityLt(Long totalCacheCapacityLt) {
    
    this.totalCacheCapacityLt = totalCacheCapacityLt;
    return this;
  }

   /**
   * Get totalCacheCapacityLt
   * @return totalCacheCapacityLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getTotalCacheCapacityLt() {
    return totalCacheCapacityLt;
  }


  public void setTotalCacheCapacityLt(Long totalCacheCapacityLt) {
    this.totalCacheCapacityLt = totalCacheCapacityLt;
  }


  public HostWhereInput totalCacheCapacityLte(Long totalCacheCapacityLte) {
    
    this.totalCacheCapacityLte = totalCacheCapacityLte;
    return this;
  }

   /**
   * Get totalCacheCapacityLte
   * @return totalCacheCapacityLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getTotalCacheCapacityLte() {
    return totalCacheCapacityLte;
  }


  public void setTotalCacheCapacityLte(Long totalCacheCapacityLte) {
    this.totalCacheCapacityLte = totalCacheCapacityLte;
  }


  public HostWhereInput totalCacheCapacityNot(Long totalCacheCapacityNot) {
    
    this.totalCacheCapacityNot = totalCacheCapacityNot;
    return this;
  }

   /**
   * Get totalCacheCapacityNot
   * @return totalCacheCapacityNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getTotalCacheCapacityNot() {
    return totalCacheCapacityNot;
  }


  public void setTotalCacheCapacityNot(Long totalCacheCapacityNot) {
    this.totalCacheCapacityNot = totalCacheCapacityNot;
  }


  public HostWhereInput totalCacheCapacityNotIn(List<Long> totalCacheCapacityNotIn) {
    
    this.totalCacheCapacityNotIn = totalCacheCapacityNotIn;
    return this;
  }

  public HostWhereInput addTotalCacheCapacityNotInItem(Long totalCacheCapacityNotInItem) {
    if (this.totalCacheCapacityNotIn == null) {
      this.totalCacheCapacityNotIn = new ArrayList<Long>();
    }
    this.totalCacheCapacityNotIn.add(totalCacheCapacityNotInItem);
    return this;
  }

   /**
   * Get totalCacheCapacityNotIn
   * @return totalCacheCapacityNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Long> getTotalCacheCapacityNotIn() {
    return totalCacheCapacityNotIn;
  }


  public void setTotalCacheCapacityNotIn(List<Long> totalCacheCapacityNotIn) {
    this.totalCacheCapacityNotIn = totalCacheCapacityNotIn;
  }


  public HostWhereInput totalCpuCores(Integer totalCpuCores) {
    
    this.totalCpuCores = totalCpuCores;
    return this;
  }

   /**
   * Get totalCpuCores
   * @return totalCpuCores
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getTotalCpuCores() {
    return totalCpuCores;
  }


  public void setTotalCpuCores(Integer totalCpuCores) {
    this.totalCpuCores = totalCpuCores;
  }


  public HostWhereInput totalCpuCoresGt(Integer totalCpuCoresGt) {
    
    this.totalCpuCoresGt = totalCpuCoresGt;
    return this;
  }

   /**
   * Get totalCpuCoresGt
   * @return totalCpuCoresGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getTotalCpuCoresGt() {
    return totalCpuCoresGt;
  }


  public void setTotalCpuCoresGt(Integer totalCpuCoresGt) {
    this.totalCpuCoresGt = totalCpuCoresGt;
  }


  public HostWhereInput totalCpuCoresGte(Integer totalCpuCoresGte) {
    
    this.totalCpuCoresGte = totalCpuCoresGte;
    return this;
  }

   /**
   * Get totalCpuCoresGte
   * @return totalCpuCoresGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getTotalCpuCoresGte() {
    return totalCpuCoresGte;
  }


  public void setTotalCpuCoresGte(Integer totalCpuCoresGte) {
    this.totalCpuCoresGte = totalCpuCoresGte;
  }


  public HostWhereInput totalCpuCoresIn(List<Integer> totalCpuCoresIn) {
    
    this.totalCpuCoresIn = totalCpuCoresIn;
    return this;
  }

  public HostWhereInput addTotalCpuCoresInItem(Integer totalCpuCoresInItem) {
    if (this.totalCpuCoresIn == null) {
      this.totalCpuCoresIn = new ArrayList<Integer>();
    }
    this.totalCpuCoresIn.add(totalCpuCoresInItem);
    return this;
  }

   /**
   * Get totalCpuCoresIn
   * @return totalCpuCoresIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Integer> getTotalCpuCoresIn() {
    return totalCpuCoresIn;
  }


  public void setTotalCpuCoresIn(List<Integer> totalCpuCoresIn) {
    this.totalCpuCoresIn = totalCpuCoresIn;
  }


  public HostWhereInput totalCpuCoresLt(Integer totalCpuCoresLt) {
    
    this.totalCpuCoresLt = totalCpuCoresLt;
    return this;
  }

   /**
   * Get totalCpuCoresLt
   * @return totalCpuCoresLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getTotalCpuCoresLt() {
    return totalCpuCoresLt;
  }


  public void setTotalCpuCoresLt(Integer totalCpuCoresLt) {
    this.totalCpuCoresLt = totalCpuCoresLt;
  }


  public HostWhereInput totalCpuCoresLte(Integer totalCpuCoresLte) {
    
    this.totalCpuCoresLte = totalCpuCoresLte;
    return this;
  }

   /**
   * Get totalCpuCoresLte
   * @return totalCpuCoresLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getTotalCpuCoresLte() {
    return totalCpuCoresLte;
  }


  public void setTotalCpuCoresLte(Integer totalCpuCoresLte) {
    this.totalCpuCoresLte = totalCpuCoresLte;
  }


  public HostWhereInput totalCpuCoresNot(Integer totalCpuCoresNot) {
    
    this.totalCpuCoresNot = totalCpuCoresNot;
    return this;
  }

   /**
   * Get totalCpuCoresNot
   * @return totalCpuCoresNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getTotalCpuCoresNot() {
    return totalCpuCoresNot;
  }


  public void setTotalCpuCoresNot(Integer totalCpuCoresNot) {
    this.totalCpuCoresNot = totalCpuCoresNot;
  }


  public HostWhereInput totalCpuCoresNotIn(List<Integer> totalCpuCoresNotIn) {
    
    this.totalCpuCoresNotIn = totalCpuCoresNotIn;
    return this;
  }

  public HostWhereInput addTotalCpuCoresNotInItem(Integer totalCpuCoresNotInItem) {
    if (this.totalCpuCoresNotIn == null) {
      this.totalCpuCoresNotIn = new ArrayList<Integer>();
    }
    this.totalCpuCoresNotIn.add(totalCpuCoresNotInItem);
    return this;
  }

   /**
   * Get totalCpuCoresNotIn
   * @return totalCpuCoresNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Integer> getTotalCpuCoresNotIn() {
    return totalCpuCoresNotIn;
  }


  public void setTotalCpuCoresNotIn(List<Integer> totalCpuCoresNotIn) {
    this.totalCpuCoresNotIn = totalCpuCoresNotIn;
  }


  public HostWhereInput totalCpuHz(Long totalCpuHz) {
    
    this.totalCpuHz = totalCpuHz;
    return this;
  }

   /**
   * Get totalCpuHz
   * @return totalCpuHz
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getTotalCpuHz() {
    return totalCpuHz;
  }


  public void setTotalCpuHz(Long totalCpuHz) {
    this.totalCpuHz = totalCpuHz;
  }


  public HostWhereInput totalCpuHzGt(Long totalCpuHzGt) {
    
    this.totalCpuHzGt = totalCpuHzGt;
    return this;
  }

   /**
   * Get totalCpuHzGt
   * @return totalCpuHzGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getTotalCpuHzGt() {
    return totalCpuHzGt;
  }


  public void setTotalCpuHzGt(Long totalCpuHzGt) {
    this.totalCpuHzGt = totalCpuHzGt;
  }


  public HostWhereInput totalCpuHzGte(Long totalCpuHzGte) {
    
    this.totalCpuHzGte = totalCpuHzGte;
    return this;
  }

   /**
   * Get totalCpuHzGte
   * @return totalCpuHzGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getTotalCpuHzGte() {
    return totalCpuHzGte;
  }


  public void setTotalCpuHzGte(Long totalCpuHzGte) {
    this.totalCpuHzGte = totalCpuHzGte;
  }


  public HostWhereInput totalCpuHzIn(List<Long> totalCpuHzIn) {
    
    this.totalCpuHzIn = totalCpuHzIn;
    return this;
  }

  public HostWhereInput addTotalCpuHzInItem(Long totalCpuHzInItem) {
    if (this.totalCpuHzIn == null) {
      this.totalCpuHzIn = new ArrayList<Long>();
    }
    this.totalCpuHzIn.add(totalCpuHzInItem);
    return this;
  }

   /**
   * Get totalCpuHzIn
   * @return totalCpuHzIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Long> getTotalCpuHzIn() {
    return totalCpuHzIn;
  }


  public void setTotalCpuHzIn(List<Long> totalCpuHzIn) {
    this.totalCpuHzIn = totalCpuHzIn;
  }


  public HostWhereInput totalCpuHzLt(Long totalCpuHzLt) {
    
    this.totalCpuHzLt = totalCpuHzLt;
    return this;
  }

   /**
   * Get totalCpuHzLt
   * @return totalCpuHzLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getTotalCpuHzLt() {
    return totalCpuHzLt;
  }


  public void setTotalCpuHzLt(Long totalCpuHzLt) {
    this.totalCpuHzLt = totalCpuHzLt;
  }


  public HostWhereInput totalCpuHzLte(Long totalCpuHzLte) {
    
    this.totalCpuHzLte = totalCpuHzLte;
    return this;
  }

   /**
   * Get totalCpuHzLte
   * @return totalCpuHzLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getTotalCpuHzLte() {
    return totalCpuHzLte;
  }


  public void setTotalCpuHzLte(Long totalCpuHzLte) {
    this.totalCpuHzLte = totalCpuHzLte;
  }


  public HostWhereInput totalCpuHzNot(Long totalCpuHzNot) {
    
    this.totalCpuHzNot = totalCpuHzNot;
    return this;
  }

   /**
   * Get totalCpuHzNot
   * @return totalCpuHzNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getTotalCpuHzNot() {
    return totalCpuHzNot;
  }


  public void setTotalCpuHzNot(Long totalCpuHzNot) {
    this.totalCpuHzNot = totalCpuHzNot;
  }


  public HostWhereInput totalCpuHzNotIn(List<Long> totalCpuHzNotIn) {
    
    this.totalCpuHzNotIn = totalCpuHzNotIn;
    return this;
  }

  public HostWhereInput addTotalCpuHzNotInItem(Long totalCpuHzNotInItem) {
    if (this.totalCpuHzNotIn == null) {
      this.totalCpuHzNotIn = new ArrayList<Long>();
    }
    this.totalCpuHzNotIn.add(totalCpuHzNotInItem);
    return this;
  }

   /**
   * Get totalCpuHzNotIn
   * @return totalCpuHzNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Long> getTotalCpuHzNotIn() {
    return totalCpuHzNotIn;
  }


  public void setTotalCpuHzNotIn(List<Long> totalCpuHzNotIn) {
    this.totalCpuHzNotIn = totalCpuHzNotIn;
  }


  public HostWhereInput totalCpuSockets(Integer totalCpuSockets) {
    
    this.totalCpuSockets = totalCpuSockets;
    return this;
  }

   /**
   * Get totalCpuSockets
   * @return totalCpuSockets
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getTotalCpuSockets() {
    return totalCpuSockets;
  }


  public void setTotalCpuSockets(Integer totalCpuSockets) {
    this.totalCpuSockets = totalCpuSockets;
  }


  public HostWhereInput totalCpuSocketsGt(Integer totalCpuSocketsGt) {
    
    this.totalCpuSocketsGt = totalCpuSocketsGt;
    return this;
  }

   /**
   * Get totalCpuSocketsGt
   * @return totalCpuSocketsGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getTotalCpuSocketsGt() {
    return totalCpuSocketsGt;
  }


  public void setTotalCpuSocketsGt(Integer totalCpuSocketsGt) {
    this.totalCpuSocketsGt = totalCpuSocketsGt;
  }


  public HostWhereInput totalCpuSocketsGte(Integer totalCpuSocketsGte) {
    
    this.totalCpuSocketsGte = totalCpuSocketsGte;
    return this;
  }

   /**
   * Get totalCpuSocketsGte
   * @return totalCpuSocketsGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getTotalCpuSocketsGte() {
    return totalCpuSocketsGte;
  }


  public void setTotalCpuSocketsGte(Integer totalCpuSocketsGte) {
    this.totalCpuSocketsGte = totalCpuSocketsGte;
  }


  public HostWhereInput totalCpuSocketsIn(List<Integer> totalCpuSocketsIn) {
    
    this.totalCpuSocketsIn = totalCpuSocketsIn;
    return this;
  }

  public HostWhereInput addTotalCpuSocketsInItem(Integer totalCpuSocketsInItem) {
    if (this.totalCpuSocketsIn == null) {
      this.totalCpuSocketsIn = new ArrayList<Integer>();
    }
    this.totalCpuSocketsIn.add(totalCpuSocketsInItem);
    return this;
  }

   /**
   * Get totalCpuSocketsIn
   * @return totalCpuSocketsIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Integer> getTotalCpuSocketsIn() {
    return totalCpuSocketsIn;
  }


  public void setTotalCpuSocketsIn(List<Integer> totalCpuSocketsIn) {
    this.totalCpuSocketsIn = totalCpuSocketsIn;
  }


  public HostWhereInput totalCpuSocketsLt(Integer totalCpuSocketsLt) {
    
    this.totalCpuSocketsLt = totalCpuSocketsLt;
    return this;
  }

   /**
   * Get totalCpuSocketsLt
   * @return totalCpuSocketsLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getTotalCpuSocketsLt() {
    return totalCpuSocketsLt;
  }


  public void setTotalCpuSocketsLt(Integer totalCpuSocketsLt) {
    this.totalCpuSocketsLt = totalCpuSocketsLt;
  }


  public HostWhereInput totalCpuSocketsLte(Integer totalCpuSocketsLte) {
    
    this.totalCpuSocketsLte = totalCpuSocketsLte;
    return this;
  }

   /**
   * Get totalCpuSocketsLte
   * @return totalCpuSocketsLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getTotalCpuSocketsLte() {
    return totalCpuSocketsLte;
  }


  public void setTotalCpuSocketsLte(Integer totalCpuSocketsLte) {
    this.totalCpuSocketsLte = totalCpuSocketsLte;
  }


  public HostWhereInput totalCpuSocketsNot(Integer totalCpuSocketsNot) {
    
    this.totalCpuSocketsNot = totalCpuSocketsNot;
    return this;
  }

   /**
   * Get totalCpuSocketsNot
   * @return totalCpuSocketsNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getTotalCpuSocketsNot() {
    return totalCpuSocketsNot;
  }


  public void setTotalCpuSocketsNot(Integer totalCpuSocketsNot) {
    this.totalCpuSocketsNot = totalCpuSocketsNot;
  }


  public HostWhereInput totalCpuSocketsNotIn(List<Integer> totalCpuSocketsNotIn) {
    
    this.totalCpuSocketsNotIn = totalCpuSocketsNotIn;
    return this;
  }

  public HostWhereInput addTotalCpuSocketsNotInItem(Integer totalCpuSocketsNotInItem) {
    if (this.totalCpuSocketsNotIn == null) {
      this.totalCpuSocketsNotIn = new ArrayList<Integer>();
    }
    this.totalCpuSocketsNotIn.add(totalCpuSocketsNotInItem);
    return this;
  }

   /**
   * Get totalCpuSocketsNotIn
   * @return totalCpuSocketsNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Integer> getTotalCpuSocketsNotIn() {
    return totalCpuSocketsNotIn;
  }


  public void setTotalCpuSocketsNotIn(List<Integer> totalCpuSocketsNotIn) {
    this.totalCpuSocketsNotIn = totalCpuSocketsNotIn;
  }


  public HostWhereInput totalDataCapacity(Long totalDataCapacity) {
    
    this.totalDataCapacity = totalDataCapacity;
    return this;
  }

   /**
   * Get totalDataCapacity
   * @return totalDataCapacity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getTotalDataCapacity() {
    return totalDataCapacity;
  }


  public void setTotalDataCapacity(Long totalDataCapacity) {
    this.totalDataCapacity = totalDataCapacity;
  }


  public HostWhereInput totalDataCapacityGt(Long totalDataCapacityGt) {
    
    this.totalDataCapacityGt = totalDataCapacityGt;
    return this;
  }

   /**
   * Get totalDataCapacityGt
   * @return totalDataCapacityGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getTotalDataCapacityGt() {
    return totalDataCapacityGt;
  }


  public void setTotalDataCapacityGt(Long totalDataCapacityGt) {
    this.totalDataCapacityGt = totalDataCapacityGt;
  }


  public HostWhereInput totalDataCapacityGte(Long totalDataCapacityGte) {
    
    this.totalDataCapacityGte = totalDataCapacityGte;
    return this;
  }

   /**
   * Get totalDataCapacityGte
   * @return totalDataCapacityGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getTotalDataCapacityGte() {
    return totalDataCapacityGte;
  }


  public void setTotalDataCapacityGte(Long totalDataCapacityGte) {
    this.totalDataCapacityGte = totalDataCapacityGte;
  }


  public HostWhereInput totalDataCapacityIn(List<Long> totalDataCapacityIn) {
    
    this.totalDataCapacityIn = totalDataCapacityIn;
    return this;
  }

  public HostWhereInput addTotalDataCapacityInItem(Long totalDataCapacityInItem) {
    if (this.totalDataCapacityIn == null) {
      this.totalDataCapacityIn = new ArrayList<Long>();
    }
    this.totalDataCapacityIn.add(totalDataCapacityInItem);
    return this;
  }

   /**
   * Get totalDataCapacityIn
   * @return totalDataCapacityIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Long> getTotalDataCapacityIn() {
    return totalDataCapacityIn;
  }


  public void setTotalDataCapacityIn(List<Long> totalDataCapacityIn) {
    this.totalDataCapacityIn = totalDataCapacityIn;
  }


  public HostWhereInput totalDataCapacityLt(Long totalDataCapacityLt) {
    
    this.totalDataCapacityLt = totalDataCapacityLt;
    return this;
  }

   /**
   * Get totalDataCapacityLt
   * @return totalDataCapacityLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getTotalDataCapacityLt() {
    return totalDataCapacityLt;
  }


  public void setTotalDataCapacityLt(Long totalDataCapacityLt) {
    this.totalDataCapacityLt = totalDataCapacityLt;
  }


  public HostWhereInput totalDataCapacityLte(Long totalDataCapacityLte) {
    
    this.totalDataCapacityLte = totalDataCapacityLte;
    return this;
  }

   /**
   * Get totalDataCapacityLte
   * @return totalDataCapacityLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getTotalDataCapacityLte() {
    return totalDataCapacityLte;
  }


  public void setTotalDataCapacityLte(Long totalDataCapacityLte) {
    this.totalDataCapacityLte = totalDataCapacityLte;
  }


  public HostWhereInput totalDataCapacityNot(Long totalDataCapacityNot) {
    
    this.totalDataCapacityNot = totalDataCapacityNot;
    return this;
  }

   /**
   * Get totalDataCapacityNot
   * @return totalDataCapacityNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getTotalDataCapacityNot() {
    return totalDataCapacityNot;
  }


  public void setTotalDataCapacityNot(Long totalDataCapacityNot) {
    this.totalDataCapacityNot = totalDataCapacityNot;
  }


  public HostWhereInput totalDataCapacityNotIn(List<Long> totalDataCapacityNotIn) {
    
    this.totalDataCapacityNotIn = totalDataCapacityNotIn;
    return this;
  }

  public HostWhereInput addTotalDataCapacityNotInItem(Long totalDataCapacityNotInItem) {
    if (this.totalDataCapacityNotIn == null) {
      this.totalDataCapacityNotIn = new ArrayList<Long>();
    }
    this.totalDataCapacityNotIn.add(totalDataCapacityNotInItem);
    return this;
  }

   /**
   * Get totalDataCapacityNotIn
   * @return totalDataCapacityNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Long> getTotalDataCapacityNotIn() {
    return totalDataCapacityNotIn;
  }


  public void setTotalDataCapacityNotIn(List<Long> totalDataCapacityNotIn) {
    this.totalDataCapacityNotIn = totalDataCapacityNotIn;
  }


  public HostWhereInput totalMemoryBytes(Long totalMemoryBytes) {
    
    this.totalMemoryBytes = totalMemoryBytes;
    return this;
  }

   /**
   * Get totalMemoryBytes
   * @return totalMemoryBytes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getTotalMemoryBytes() {
    return totalMemoryBytes;
  }


  public void setTotalMemoryBytes(Long totalMemoryBytes) {
    this.totalMemoryBytes = totalMemoryBytes;
  }


  public HostWhereInput totalMemoryBytesGt(Long totalMemoryBytesGt) {
    
    this.totalMemoryBytesGt = totalMemoryBytesGt;
    return this;
  }

   /**
   * Get totalMemoryBytesGt
   * @return totalMemoryBytesGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getTotalMemoryBytesGt() {
    return totalMemoryBytesGt;
  }


  public void setTotalMemoryBytesGt(Long totalMemoryBytesGt) {
    this.totalMemoryBytesGt = totalMemoryBytesGt;
  }


  public HostWhereInput totalMemoryBytesGte(Long totalMemoryBytesGte) {
    
    this.totalMemoryBytesGte = totalMemoryBytesGte;
    return this;
  }

   /**
   * Get totalMemoryBytesGte
   * @return totalMemoryBytesGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getTotalMemoryBytesGte() {
    return totalMemoryBytesGte;
  }


  public void setTotalMemoryBytesGte(Long totalMemoryBytesGte) {
    this.totalMemoryBytesGte = totalMemoryBytesGte;
  }


  public HostWhereInput totalMemoryBytesIn(List<Long> totalMemoryBytesIn) {
    
    this.totalMemoryBytesIn = totalMemoryBytesIn;
    return this;
  }

  public HostWhereInput addTotalMemoryBytesInItem(Long totalMemoryBytesInItem) {
    if (this.totalMemoryBytesIn == null) {
      this.totalMemoryBytesIn = new ArrayList<Long>();
    }
    this.totalMemoryBytesIn.add(totalMemoryBytesInItem);
    return this;
  }

   /**
   * Get totalMemoryBytesIn
   * @return totalMemoryBytesIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Long> getTotalMemoryBytesIn() {
    return totalMemoryBytesIn;
  }


  public void setTotalMemoryBytesIn(List<Long> totalMemoryBytesIn) {
    this.totalMemoryBytesIn = totalMemoryBytesIn;
  }


  public HostWhereInput totalMemoryBytesLt(Long totalMemoryBytesLt) {
    
    this.totalMemoryBytesLt = totalMemoryBytesLt;
    return this;
  }

   /**
   * Get totalMemoryBytesLt
   * @return totalMemoryBytesLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getTotalMemoryBytesLt() {
    return totalMemoryBytesLt;
  }


  public void setTotalMemoryBytesLt(Long totalMemoryBytesLt) {
    this.totalMemoryBytesLt = totalMemoryBytesLt;
  }


  public HostWhereInput totalMemoryBytesLte(Long totalMemoryBytesLte) {
    
    this.totalMemoryBytesLte = totalMemoryBytesLte;
    return this;
  }

   /**
   * Get totalMemoryBytesLte
   * @return totalMemoryBytesLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getTotalMemoryBytesLte() {
    return totalMemoryBytesLte;
  }


  public void setTotalMemoryBytesLte(Long totalMemoryBytesLte) {
    this.totalMemoryBytesLte = totalMemoryBytesLte;
  }


  public HostWhereInput totalMemoryBytesNot(Long totalMemoryBytesNot) {
    
    this.totalMemoryBytesNot = totalMemoryBytesNot;
    return this;
  }

   /**
   * Get totalMemoryBytesNot
   * @return totalMemoryBytesNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getTotalMemoryBytesNot() {
    return totalMemoryBytesNot;
  }


  public void setTotalMemoryBytesNot(Long totalMemoryBytesNot) {
    this.totalMemoryBytesNot = totalMemoryBytesNot;
  }


  public HostWhereInput totalMemoryBytesNotIn(List<Long> totalMemoryBytesNotIn) {
    
    this.totalMemoryBytesNotIn = totalMemoryBytesNotIn;
    return this;
  }

  public HostWhereInput addTotalMemoryBytesNotInItem(Long totalMemoryBytesNotInItem) {
    if (this.totalMemoryBytesNotIn == null) {
      this.totalMemoryBytesNotIn = new ArrayList<Long>();
    }
    this.totalMemoryBytesNotIn.add(totalMemoryBytesNotInItem);
    return this;
  }

   /**
   * Get totalMemoryBytesNotIn
   * @return totalMemoryBytesNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Long> getTotalMemoryBytesNotIn() {
    return totalMemoryBytesNotIn;
  }


  public void setTotalMemoryBytesNotIn(List<Long> totalMemoryBytesNotIn) {
    this.totalMemoryBytesNotIn = totalMemoryBytesNotIn;
  }


  public HostWhereInput usbDevicesEvery(UsbDeviceWhereInput usbDevicesEvery) {
    
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


  public HostWhereInput usbDevicesNone(UsbDeviceWhereInput usbDevicesNone) {
    
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


  public HostWhereInput usbDevicesSome(UsbDeviceWhereInput usbDevicesSome) {
    
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


  public HostWhereInput usedCpuHz(Double usedCpuHz) {
    
    this.usedCpuHz = usedCpuHz;
    return this;
  }

   /**
   * Get usedCpuHz
   * @return usedCpuHz
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getUsedCpuHz() {
    return usedCpuHz;
  }


  public void setUsedCpuHz(Double usedCpuHz) {
    this.usedCpuHz = usedCpuHz;
  }


  public HostWhereInput usedCpuHzGt(Double usedCpuHzGt) {
    
    this.usedCpuHzGt = usedCpuHzGt;
    return this;
  }

   /**
   * Get usedCpuHzGt
   * @return usedCpuHzGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getUsedCpuHzGt() {
    return usedCpuHzGt;
  }


  public void setUsedCpuHzGt(Double usedCpuHzGt) {
    this.usedCpuHzGt = usedCpuHzGt;
  }


  public HostWhereInput usedCpuHzGte(Double usedCpuHzGte) {
    
    this.usedCpuHzGte = usedCpuHzGte;
    return this;
  }

   /**
   * Get usedCpuHzGte
   * @return usedCpuHzGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getUsedCpuHzGte() {
    return usedCpuHzGte;
  }


  public void setUsedCpuHzGte(Double usedCpuHzGte) {
    this.usedCpuHzGte = usedCpuHzGte;
  }


  public HostWhereInput usedCpuHzIn(List<Double> usedCpuHzIn) {
    
    this.usedCpuHzIn = usedCpuHzIn;
    return this;
  }

  public HostWhereInput addUsedCpuHzInItem(Double usedCpuHzInItem) {
    if (this.usedCpuHzIn == null) {
      this.usedCpuHzIn = new ArrayList<Double>();
    }
    this.usedCpuHzIn.add(usedCpuHzInItem);
    return this;
  }

   /**
   * Get usedCpuHzIn
   * @return usedCpuHzIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Double> getUsedCpuHzIn() {
    return usedCpuHzIn;
  }


  public void setUsedCpuHzIn(List<Double> usedCpuHzIn) {
    this.usedCpuHzIn = usedCpuHzIn;
  }


  public HostWhereInput usedCpuHzLt(Double usedCpuHzLt) {
    
    this.usedCpuHzLt = usedCpuHzLt;
    return this;
  }

   /**
   * Get usedCpuHzLt
   * @return usedCpuHzLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getUsedCpuHzLt() {
    return usedCpuHzLt;
  }


  public void setUsedCpuHzLt(Double usedCpuHzLt) {
    this.usedCpuHzLt = usedCpuHzLt;
  }


  public HostWhereInput usedCpuHzLte(Double usedCpuHzLte) {
    
    this.usedCpuHzLte = usedCpuHzLte;
    return this;
  }

   /**
   * Get usedCpuHzLte
   * @return usedCpuHzLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getUsedCpuHzLte() {
    return usedCpuHzLte;
  }


  public void setUsedCpuHzLte(Double usedCpuHzLte) {
    this.usedCpuHzLte = usedCpuHzLte;
  }


  public HostWhereInput usedCpuHzNot(Double usedCpuHzNot) {
    
    this.usedCpuHzNot = usedCpuHzNot;
    return this;
  }

   /**
   * Get usedCpuHzNot
   * @return usedCpuHzNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getUsedCpuHzNot() {
    return usedCpuHzNot;
  }


  public void setUsedCpuHzNot(Double usedCpuHzNot) {
    this.usedCpuHzNot = usedCpuHzNot;
  }


  public HostWhereInput usedCpuHzNotIn(List<Double> usedCpuHzNotIn) {
    
    this.usedCpuHzNotIn = usedCpuHzNotIn;
    return this;
  }

  public HostWhereInput addUsedCpuHzNotInItem(Double usedCpuHzNotInItem) {
    if (this.usedCpuHzNotIn == null) {
      this.usedCpuHzNotIn = new ArrayList<Double>();
    }
    this.usedCpuHzNotIn.add(usedCpuHzNotInItem);
    return this;
  }

   /**
   * Get usedCpuHzNotIn
   * @return usedCpuHzNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Double> getUsedCpuHzNotIn() {
    return usedCpuHzNotIn;
  }


  public void setUsedCpuHzNotIn(List<Double> usedCpuHzNotIn) {
    this.usedCpuHzNotIn = usedCpuHzNotIn;
  }


  public HostWhereInput usedDataSpace(Long usedDataSpace) {
    
    this.usedDataSpace = usedDataSpace;
    return this;
  }

   /**
   * Get usedDataSpace
   * @return usedDataSpace
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getUsedDataSpace() {
    return usedDataSpace;
  }


  public void setUsedDataSpace(Long usedDataSpace) {
    this.usedDataSpace = usedDataSpace;
  }


  public HostWhereInput usedDataSpaceGt(Long usedDataSpaceGt) {
    
    this.usedDataSpaceGt = usedDataSpaceGt;
    return this;
  }

   /**
   * Get usedDataSpaceGt
   * @return usedDataSpaceGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getUsedDataSpaceGt() {
    return usedDataSpaceGt;
  }


  public void setUsedDataSpaceGt(Long usedDataSpaceGt) {
    this.usedDataSpaceGt = usedDataSpaceGt;
  }


  public HostWhereInput usedDataSpaceGte(Long usedDataSpaceGte) {
    
    this.usedDataSpaceGte = usedDataSpaceGte;
    return this;
  }

   /**
   * Get usedDataSpaceGte
   * @return usedDataSpaceGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getUsedDataSpaceGte() {
    return usedDataSpaceGte;
  }


  public void setUsedDataSpaceGte(Long usedDataSpaceGte) {
    this.usedDataSpaceGte = usedDataSpaceGte;
  }


  public HostWhereInput usedDataSpaceIn(List<Long> usedDataSpaceIn) {
    
    this.usedDataSpaceIn = usedDataSpaceIn;
    return this;
  }

  public HostWhereInput addUsedDataSpaceInItem(Long usedDataSpaceInItem) {
    if (this.usedDataSpaceIn == null) {
      this.usedDataSpaceIn = new ArrayList<Long>();
    }
    this.usedDataSpaceIn.add(usedDataSpaceInItem);
    return this;
  }

   /**
   * Get usedDataSpaceIn
   * @return usedDataSpaceIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Long> getUsedDataSpaceIn() {
    return usedDataSpaceIn;
  }


  public void setUsedDataSpaceIn(List<Long> usedDataSpaceIn) {
    this.usedDataSpaceIn = usedDataSpaceIn;
  }


  public HostWhereInput usedDataSpaceLt(Long usedDataSpaceLt) {
    
    this.usedDataSpaceLt = usedDataSpaceLt;
    return this;
  }

   /**
   * Get usedDataSpaceLt
   * @return usedDataSpaceLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getUsedDataSpaceLt() {
    return usedDataSpaceLt;
  }


  public void setUsedDataSpaceLt(Long usedDataSpaceLt) {
    this.usedDataSpaceLt = usedDataSpaceLt;
  }


  public HostWhereInput usedDataSpaceLte(Long usedDataSpaceLte) {
    
    this.usedDataSpaceLte = usedDataSpaceLte;
    return this;
  }

   /**
   * Get usedDataSpaceLte
   * @return usedDataSpaceLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getUsedDataSpaceLte() {
    return usedDataSpaceLte;
  }


  public void setUsedDataSpaceLte(Long usedDataSpaceLte) {
    this.usedDataSpaceLte = usedDataSpaceLte;
  }


  public HostWhereInput usedDataSpaceNot(Long usedDataSpaceNot) {
    
    this.usedDataSpaceNot = usedDataSpaceNot;
    return this;
  }

   /**
   * Get usedDataSpaceNot
   * @return usedDataSpaceNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getUsedDataSpaceNot() {
    return usedDataSpaceNot;
  }


  public void setUsedDataSpaceNot(Long usedDataSpaceNot) {
    this.usedDataSpaceNot = usedDataSpaceNot;
  }


  public HostWhereInput usedDataSpaceNotIn(List<Long> usedDataSpaceNotIn) {
    
    this.usedDataSpaceNotIn = usedDataSpaceNotIn;
    return this;
  }

  public HostWhereInput addUsedDataSpaceNotInItem(Long usedDataSpaceNotInItem) {
    if (this.usedDataSpaceNotIn == null) {
      this.usedDataSpaceNotIn = new ArrayList<Long>();
    }
    this.usedDataSpaceNotIn.add(usedDataSpaceNotInItem);
    return this;
  }

   /**
   * Get usedDataSpaceNotIn
   * @return usedDataSpaceNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Long> getUsedDataSpaceNotIn() {
    return usedDataSpaceNotIn;
  }


  public void setUsedDataSpaceNotIn(List<Long> usedDataSpaceNotIn) {
    this.usedDataSpaceNotIn = usedDataSpaceNotIn;
  }


  public HostWhereInput usedMemoryBytes(Double usedMemoryBytes) {
    
    this.usedMemoryBytes = usedMemoryBytes;
    return this;
  }

   /**
   * Get usedMemoryBytes
   * @return usedMemoryBytes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getUsedMemoryBytes() {
    return usedMemoryBytes;
  }


  public void setUsedMemoryBytes(Double usedMemoryBytes) {
    this.usedMemoryBytes = usedMemoryBytes;
  }


  public HostWhereInput usedMemoryBytesGt(Double usedMemoryBytesGt) {
    
    this.usedMemoryBytesGt = usedMemoryBytesGt;
    return this;
  }

   /**
   * Get usedMemoryBytesGt
   * @return usedMemoryBytesGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getUsedMemoryBytesGt() {
    return usedMemoryBytesGt;
  }


  public void setUsedMemoryBytesGt(Double usedMemoryBytesGt) {
    this.usedMemoryBytesGt = usedMemoryBytesGt;
  }


  public HostWhereInput usedMemoryBytesGte(Double usedMemoryBytesGte) {
    
    this.usedMemoryBytesGte = usedMemoryBytesGte;
    return this;
  }

   /**
   * Get usedMemoryBytesGte
   * @return usedMemoryBytesGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getUsedMemoryBytesGte() {
    return usedMemoryBytesGte;
  }


  public void setUsedMemoryBytesGte(Double usedMemoryBytesGte) {
    this.usedMemoryBytesGte = usedMemoryBytesGte;
  }


  public HostWhereInput usedMemoryBytesIn(List<Double> usedMemoryBytesIn) {
    
    this.usedMemoryBytesIn = usedMemoryBytesIn;
    return this;
  }

  public HostWhereInput addUsedMemoryBytesInItem(Double usedMemoryBytesInItem) {
    if (this.usedMemoryBytesIn == null) {
      this.usedMemoryBytesIn = new ArrayList<Double>();
    }
    this.usedMemoryBytesIn.add(usedMemoryBytesInItem);
    return this;
  }

   /**
   * Get usedMemoryBytesIn
   * @return usedMemoryBytesIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Double> getUsedMemoryBytesIn() {
    return usedMemoryBytesIn;
  }


  public void setUsedMemoryBytesIn(List<Double> usedMemoryBytesIn) {
    this.usedMemoryBytesIn = usedMemoryBytesIn;
  }


  public HostWhereInput usedMemoryBytesLt(Double usedMemoryBytesLt) {
    
    this.usedMemoryBytesLt = usedMemoryBytesLt;
    return this;
  }

   /**
   * Get usedMemoryBytesLt
   * @return usedMemoryBytesLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getUsedMemoryBytesLt() {
    return usedMemoryBytesLt;
  }


  public void setUsedMemoryBytesLt(Double usedMemoryBytesLt) {
    this.usedMemoryBytesLt = usedMemoryBytesLt;
  }


  public HostWhereInput usedMemoryBytesLte(Double usedMemoryBytesLte) {
    
    this.usedMemoryBytesLte = usedMemoryBytesLte;
    return this;
  }

   /**
   * Get usedMemoryBytesLte
   * @return usedMemoryBytesLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getUsedMemoryBytesLte() {
    return usedMemoryBytesLte;
  }


  public void setUsedMemoryBytesLte(Double usedMemoryBytesLte) {
    this.usedMemoryBytesLte = usedMemoryBytesLte;
  }


  public HostWhereInput usedMemoryBytesNot(Double usedMemoryBytesNot) {
    
    this.usedMemoryBytesNot = usedMemoryBytesNot;
    return this;
  }

   /**
   * Get usedMemoryBytesNot
   * @return usedMemoryBytesNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getUsedMemoryBytesNot() {
    return usedMemoryBytesNot;
  }


  public void setUsedMemoryBytesNot(Double usedMemoryBytesNot) {
    this.usedMemoryBytesNot = usedMemoryBytesNot;
  }


  public HostWhereInput usedMemoryBytesNotIn(List<Double> usedMemoryBytesNotIn) {
    
    this.usedMemoryBytesNotIn = usedMemoryBytesNotIn;
    return this;
  }

  public HostWhereInput addUsedMemoryBytesNotInItem(Double usedMemoryBytesNotInItem) {
    if (this.usedMemoryBytesNotIn == null) {
      this.usedMemoryBytesNotIn = new ArrayList<Double>();
    }
    this.usedMemoryBytesNotIn.add(usedMemoryBytesNotInItem);
    return this;
  }

   /**
   * Get usedMemoryBytesNotIn
   * @return usedMemoryBytesNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Double> getUsedMemoryBytesNotIn() {
    return usedMemoryBytesNotIn;
  }


  public void setUsedMemoryBytesNotIn(List<Double> usedMemoryBytesNotIn) {
    this.usedMemoryBytesNotIn = usedMemoryBytesNotIn;
  }


  public HostWhereInput vmNum(Integer vmNum) {
    
    this.vmNum = vmNum;
    return this;
  }

   /**
   * Get vmNum
   * @return vmNum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getVmNum() {
    return vmNum;
  }


  public void setVmNum(Integer vmNum) {
    this.vmNum = vmNum;
  }


  public HostWhereInput vmNumGt(Integer vmNumGt) {
    
    this.vmNumGt = vmNumGt;
    return this;
  }

   /**
   * Get vmNumGt
   * @return vmNumGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getVmNumGt() {
    return vmNumGt;
  }


  public void setVmNumGt(Integer vmNumGt) {
    this.vmNumGt = vmNumGt;
  }


  public HostWhereInput vmNumGte(Integer vmNumGte) {
    
    this.vmNumGte = vmNumGte;
    return this;
  }

   /**
   * Get vmNumGte
   * @return vmNumGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getVmNumGte() {
    return vmNumGte;
  }


  public void setVmNumGte(Integer vmNumGte) {
    this.vmNumGte = vmNumGte;
  }


  public HostWhereInput vmNumIn(List<Integer> vmNumIn) {
    
    this.vmNumIn = vmNumIn;
    return this;
  }

  public HostWhereInput addVmNumInItem(Integer vmNumInItem) {
    if (this.vmNumIn == null) {
      this.vmNumIn = new ArrayList<Integer>();
    }
    this.vmNumIn.add(vmNumInItem);
    return this;
  }

   /**
   * Get vmNumIn
   * @return vmNumIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Integer> getVmNumIn() {
    return vmNumIn;
  }


  public void setVmNumIn(List<Integer> vmNumIn) {
    this.vmNumIn = vmNumIn;
  }


  public HostWhereInput vmNumLt(Integer vmNumLt) {
    
    this.vmNumLt = vmNumLt;
    return this;
  }

   /**
   * Get vmNumLt
   * @return vmNumLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getVmNumLt() {
    return vmNumLt;
  }


  public void setVmNumLt(Integer vmNumLt) {
    this.vmNumLt = vmNumLt;
  }


  public HostWhereInput vmNumLte(Integer vmNumLte) {
    
    this.vmNumLte = vmNumLte;
    return this;
  }

   /**
   * Get vmNumLte
   * @return vmNumLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getVmNumLte() {
    return vmNumLte;
  }


  public void setVmNumLte(Integer vmNumLte) {
    this.vmNumLte = vmNumLte;
  }


  public HostWhereInput vmNumNot(Integer vmNumNot) {
    
    this.vmNumNot = vmNumNot;
    return this;
  }

   /**
   * Get vmNumNot
   * @return vmNumNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getVmNumNot() {
    return vmNumNot;
  }


  public void setVmNumNot(Integer vmNumNot) {
    this.vmNumNot = vmNumNot;
  }


  public HostWhereInput vmNumNotIn(List<Integer> vmNumNotIn) {
    
    this.vmNumNotIn = vmNumNotIn;
    return this;
  }

  public HostWhereInput addVmNumNotInItem(Integer vmNumNotInItem) {
    if (this.vmNumNotIn == null) {
      this.vmNumNotIn = new ArrayList<Integer>();
    }
    this.vmNumNotIn.add(vmNumNotInItem);
    return this;
  }

   /**
   * Get vmNumNotIn
   * @return vmNumNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Integer> getVmNumNotIn() {
    return vmNumNotIn;
  }


  public void setVmNumNotIn(List<Integer> vmNumNotIn) {
    this.vmNumNotIn = vmNumNotIn;
  }


  public HostWhereInput vmotionIp(String vmotionIp) {
    
    this.vmotionIp = vmotionIp;
    return this;
  }

   /**
   * Get vmotionIp
   * @return vmotionIp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getVmotionIp() {
    return vmotionIp;
  }


  public void setVmotionIp(String vmotionIp) {
    this.vmotionIp = vmotionIp;
  }


  public HostWhereInput vmotionIpContains(String vmotionIpContains) {
    
    this.vmotionIpContains = vmotionIpContains;
    return this;
  }

   /**
   * Get vmotionIpContains
   * @return vmotionIpContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getVmotionIpContains() {
    return vmotionIpContains;
  }


  public void setVmotionIpContains(String vmotionIpContains) {
    this.vmotionIpContains = vmotionIpContains;
  }


  public HostWhereInput vmotionIpEndsWith(String vmotionIpEndsWith) {
    
    this.vmotionIpEndsWith = vmotionIpEndsWith;
    return this;
  }

   /**
   * Get vmotionIpEndsWith
   * @return vmotionIpEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getVmotionIpEndsWith() {
    return vmotionIpEndsWith;
  }


  public void setVmotionIpEndsWith(String vmotionIpEndsWith) {
    this.vmotionIpEndsWith = vmotionIpEndsWith;
  }


  public HostWhereInput vmotionIpGt(String vmotionIpGt) {
    
    this.vmotionIpGt = vmotionIpGt;
    return this;
  }

   /**
   * Get vmotionIpGt
   * @return vmotionIpGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getVmotionIpGt() {
    return vmotionIpGt;
  }


  public void setVmotionIpGt(String vmotionIpGt) {
    this.vmotionIpGt = vmotionIpGt;
  }


  public HostWhereInput vmotionIpGte(String vmotionIpGte) {
    
    this.vmotionIpGte = vmotionIpGte;
    return this;
  }

   /**
   * Get vmotionIpGte
   * @return vmotionIpGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getVmotionIpGte() {
    return vmotionIpGte;
  }


  public void setVmotionIpGte(String vmotionIpGte) {
    this.vmotionIpGte = vmotionIpGte;
  }


  public HostWhereInput vmotionIpIn(List<String> vmotionIpIn) {
    
    this.vmotionIpIn = vmotionIpIn;
    return this;
  }

  public HostWhereInput addVmotionIpInItem(String vmotionIpInItem) {
    if (this.vmotionIpIn == null) {
      this.vmotionIpIn = new ArrayList<String>();
    }
    this.vmotionIpIn.add(vmotionIpInItem);
    return this;
  }

   /**
   * Get vmotionIpIn
   * @return vmotionIpIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getVmotionIpIn() {
    return vmotionIpIn;
  }


  public void setVmotionIpIn(List<String> vmotionIpIn) {
    this.vmotionIpIn = vmotionIpIn;
  }


  public HostWhereInput vmotionIpLt(String vmotionIpLt) {
    
    this.vmotionIpLt = vmotionIpLt;
    return this;
  }

   /**
   * Get vmotionIpLt
   * @return vmotionIpLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getVmotionIpLt() {
    return vmotionIpLt;
  }


  public void setVmotionIpLt(String vmotionIpLt) {
    this.vmotionIpLt = vmotionIpLt;
  }


  public HostWhereInput vmotionIpLte(String vmotionIpLte) {
    
    this.vmotionIpLte = vmotionIpLte;
    return this;
  }

   /**
   * Get vmotionIpLte
   * @return vmotionIpLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getVmotionIpLte() {
    return vmotionIpLte;
  }


  public void setVmotionIpLte(String vmotionIpLte) {
    this.vmotionIpLte = vmotionIpLte;
  }


  public HostWhereInput vmotionIpNot(String vmotionIpNot) {
    
    this.vmotionIpNot = vmotionIpNot;
    return this;
  }

   /**
   * Get vmotionIpNot
   * @return vmotionIpNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getVmotionIpNot() {
    return vmotionIpNot;
  }


  public void setVmotionIpNot(String vmotionIpNot) {
    this.vmotionIpNot = vmotionIpNot;
  }


  public HostWhereInput vmotionIpNotContains(String vmotionIpNotContains) {
    
    this.vmotionIpNotContains = vmotionIpNotContains;
    return this;
  }

   /**
   * Get vmotionIpNotContains
   * @return vmotionIpNotContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getVmotionIpNotContains() {
    return vmotionIpNotContains;
  }


  public void setVmotionIpNotContains(String vmotionIpNotContains) {
    this.vmotionIpNotContains = vmotionIpNotContains;
  }


  public HostWhereInput vmotionIpNotEndsWith(String vmotionIpNotEndsWith) {
    
    this.vmotionIpNotEndsWith = vmotionIpNotEndsWith;
    return this;
  }

   /**
   * Get vmotionIpNotEndsWith
   * @return vmotionIpNotEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getVmotionIpNotEndsWith() {
    return vmotionIpNotEndsWith;
  }


  public void setVmotionIpNotEndsWith(String vmotionIpNotEndsWith) {
    this.vmotionIpNotEndsWith = vmotionIpNotEndsWith;
  }


  public HostWhereInput vmotionIpNotIn(List<String> vmotionIpNotIn) {
    
    this.vmotionIpNotIn = vmotionIpNotIn;
    return this;
  }

  public HostWhereInput addVmotionIpNotInItem(String vmotionIpNotInItem) {
    if (this.vmotionIpNotIn == null) {
      this.vmotionIpNotIn = new ArrayList<String>();
    }
    this.vmotionIpNotIn.add(vmotionIpNotInItem);
    return this;
  }

   /**
   * Get vmotionIpNotIn
   * @return vmotionIpNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getVmotionIpNotIn() {
    return vmotionIpNotIn;
  }


  public void setVmotionIpNotIn(List<String> vmotionIpNotIn) {
    this.vmotionIpNotIn = vmotionIpNotIn;
  }


  public HostWhereInput vmotionIpNotStartsWith(String vmotionIpNotStartsWith) {
    
    this.vmotionIpNotStartsWith = vmotionIpNotStartsWith;
    return this;
  }

   /**
   * Get vmotionIpNotStartsWith
   * @return vmotionIpNotStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getVmotionIpNotStartsWith() {
    return vmotionIpNotStartsWith;
  }


  public void setVmotionIpNotStartsWith(String vmotionIpNotStartsWith) {
    this.vmotionIpNotStartsWith = vmotionIpNotStartsWith;
  }


  public HostWhereInput vmotionIpStartsWith(String vmotionIpStartsWith) {
    
    this.vmotionIpStartsWith = vmotionIpStartsWith;
    return this;
  }

   /**
   * Get vmotionIpStartsWith
   * @return vmotionIpStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getVmotionIpStartsWith() {
    return vmotionIpStartsWith;
  }


  public void setVmotionIpStartsWith(String vmotionIpStartsWith) {
    this.vmotionIpStartsWith = vmotionIpStartsWith;
  }


  public HostWhereInput vmsEvery(VmWhereInput vmsEvery) {
    
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


  public HostWhereInput vmsNone(VmWhereInput vmsNone) {
    
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


  public HostWhereInput vmsSome(VmWhereInput vmsSome) {
    
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


  public HostWhereInput withFasterSsdAsCache(Boolean withFasterSsdAsCache) {
    
    this.withFasterSsdAsCache = withFasterSsdAsCache;
    return this;
  }

   /**
   * Get withFasterSsdAsCache
   * @return withFasterSsdAsCache
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getWithFasterSsdAsCache() {
    return withFasterSsdAsCache;
  }


  public void setWithFasterSsdAsCache(Boolean withFasterSsdAsCache) {
    this.withFasterSsdAsCache = withFasterSsdAsCache;
  }


  public HostWhereInput withFasterSsdAsCacheNot(Boolean withFasterSsdAsCacheNot) {
    
    this.withFasterSsdAsCacheNot = withFasterSsdAsCacheNot;
    return this;
  }

   /**
   * Get withFasterSsdAsCacheNot
   * @return withFasterSsdAsCacheNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getWithFasterSsdAsCacheNot() {
    return withFasterSsdAsCacheNot;
  }


  public void setWithFasterSsdAsCacheNot(Boolean withFasterSsdAsCacheNot) {
    this.withFasterSsdAsCacheNot = withFasterSsdAsCacheNot;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HostWhereInput hostWhereInput = (HostWhereInput) o;
    return Objects.equals(this.AND, hostWhereInput.AND) &&
        Objects.equals(this.NOT, hostWhereInput.NOT) &&
        Objects.equals(this.OR, hostWhereInput.OR) &&
        Objects.equals(this.accessIp, hostWhereInput.accessIp) &&
        Objects.equals(this.accessIpContains, hostWhereInput.accessIpContains) &&
        Objects.equals(this.accessIpEndsWith, hostWhereInput.accessIpEndsWith) &&
        Objects.equals(this.accessIpGt, hostWhereInput.accessIpGt) &&
        Objects.equals(this.accessIpGte, hostWhereInput.accessIpGte) &&
        Objects.equals(this.accessIpIn, hostWhereInput.accessIpIn) &&
        Objects.equals(this.accessIpLt, hostWhereInput.accessIpLt) &&
        Objects.equals(this.accessIpLte, hostWhereInput.accessIpLte) &&
        Objects.equals(this.accessIpNot, hostWhereInput.accessIpNot) &&
        Objects.equals(this.accessIpNotContains, hostWhereInput.accessIpNotContains) &&
        Objects.equals(this.accessIpNotEndsWith, hostWhereInput.accessIpNotEndsWith) &&
        Objects.equals(this.accessIpNotIn, hostWhereInput.accessIpNotIn) &&
        Objects.equals(this.accessIpNotStartsWith, hostWhereInput.accessIpNotStartsWith) &&
        Objects.equals(this.accessIpStartsWith, hostWhereInput.accessIpStartsWith) &&
        Objects.equals(this.allocableCpuCoresForVmExclusive, hostWhereInput.allocableCpuCoresForVmExclusive) &&
        Objects.equals(this.allocableCpuCoresForVmExclusiveGt, hostWhereInput.allocableCpuCoresForVmExclusiveGt) &&
        Objects.equals(this.allocableCpuCoresForVmExclusiveGte, hostWhereInput.allocableCpuCoresForVmExclusiveGte) &&
        Objects.equals(this.allocableCpuCoresForVmExclusiveIn, hostWhereInput.allocableCpuCoresForVmExclusiveIn) &&
        Objects.equals(this.allocableCpuCoresForVmExclusiveLt, hostWhereInput.allocableCpuCoresForVmExclusiveLt) &&
        Objects.equals(this.allocableCpuCoresForVmExclusiveLte, hostWhereInput.allocableCpuCoresForVmExclusiveLte) &&
        Objects.equals(this.allocableCpuCoresForVmExclusiveNot, hostWhereInput.allocableCpuCoresForVmExclusiveNot) &&
        Objects.equals(this.allocableCpuCoresForVmExclusiveNotIn, hostWhereInput.allocableCpuCoresForVmExclusiveNotIn) &&
        Objects.equals(this.allocatableMemoryBytes, hostWhereInput.allocatableMemoryBytes) &&
        Objects.equals(this.allocatableMemoryBytesGt, hostWhereInput.allocatableMemoryBytesGt) &&
        Objects.equals(this.allocatableMemoryBytesGte, hostWhereInput.allocatableMemoryBytesGte) &&
        Objects.equals(this.allocatableMemoryBytesIn, hostWhereInput.allocatableMemoryBytesIn) &&
        Objects.equals(this.allocatableMemoryBytesLt, hostWhereInput.allocatableMemoryBytesLt) &&
        Objects.equals(this.allocatableMemoryBytesLte, hostWhereInput.allocatableMemoryBytesLte) &&
        Objects.equals(this.allocatableMemoryBytesNot, hostWhereInput.allocatableMemoryBytesNot) &&
        Objects.equals(this.allocatableMemoryBytesNotIn, hostWhereInput.allocatableMemoryBytesNotIn) &&
        Objects.equals(this.chunkId, hostWhereInput.chunkId) &&
        Objects.equals(this.chunkIdContains, hostWhereInput.chunkIdContains) &&
        Objects.equals(this.chunkIdEndsWith, hostWhereInput.chunkIdEndsWith) &&
        Objects.equals(this.chunkIdGt, hostWhereInput.chunkIdGt) &&
        Objects.equals(this.chunkIdGte, hostWhereInput.chunkIdGte) &&
        Objects.equals(this.chunkIdIn, hostWhereInput.chunkIdIn) &&
        Objects.equals(this.chunkIdLt, hostWhereInput.chunkIdLt) &&
        Objects.equals(this.chunkIdLte, hostWhereInput.chunkIdLte) &&
        Objects.equals(this.chunkIdNot, hostWhereInput.chunkIdNot) &&
        Objects.equals(this.chunkIdNotContains, hostWhereInput.chunkIdNotContains) &&
        Objects.equals(this.chunkIdNotEndsWith, hostWhereInput.chunkIdNotEndsWith) &&
        Objects.equals(this.chunkIdNotIn, hostWhereInput.chunkIdNotIn) &&
        Objects.equals(this.chunkIdNotStartsWith, hostWhereInput.chunkIdNotStartsWith) &&
        Objects.equals(this.chunkIdStartsWith, hostWhereInput.chunkIdStartsWith) &&
        Objects.equals(this.cluster, hostWhereInput.cluster) &&
        Objects.equals(this.cpuBrand, hostWhereInput.cpuBrand) &&
        Objects.equals(this.cpuBrandContains, hostWhereInput.cpuBrandContains) &&
        Objects.equals(this.cpuBrandEndsWith, hostWhereInput.cpuBrandEndsWith) &&
        Objects.equals(this.cpuBrandGt, hostWhereInput.cpuBrandGt) &&
        Objects.equals(this.cpuBrandGte, hostWhereInput.cpuBrandGte) &&
        Objects.equals(this.cpuBrandIn, hostWhereInput.cpuBrandIn) &&
        Objects.equals(this.cpuBrandLt, hostWhereInput.cpuBrandLt) &&
        Objects.equals(this.cpuBrandLte, hostWhereInput.cpuBrandLte) &&
        Objects.equals(this.cpuBrandNot, hostWhereInput.cpuBrandNot) &&
        Objects.equals(this.cpuBrandNotContains, hostWhereInput.cpuBrandNotContains) &&
        Objects.equals(this.cpuBrandNotEndsWith, hostWhereInput.cpuBrandNotEndsWith) &&
        Objects.equals(this.cpuBrandNotIn, hostWhereInput.cpuBrandNotIn) &&
        Objects.equals(this.cpuBrandNotStartsWith, hostWhereInput.cpuBrandNotStartsWith) &&
        Objects.equals(this.cpuBrandStartsWith, hostWhereInput.cpuBrandStartsWith) &&
        Objects.equals(this.cpuFanSpeedUnit, hostWhereInput.cpuFanSpeedUnit) &&
        Objects.equals(this.cpuFanSpeedUnitIn, hostWhereInput.cpuFanSpeedUnitIn) &&
        Objects.equals(this.cpuFanSpeedUnitNot, hostWhereInput.cpuFanSpeedUnitNot) &&
        Objects.equals(this.cpuFanSpeedUnitNotIn, hostWhereInput.cpuFanSpeedUnitNotIn) &&
        Objects.equals(this.cpuHzPerCore, hostWhereInput.cpuHzPerCore) &&
        Objects.equals(this.cpuHzPerCoreGt, hostWhereInput.cpuHzPerCoreGt) &&
        Objects.equals(this.cpuHzPerCoreGte, hostWhereInput.cpuHzPerCoreGte) &&
        Objects.equals(this.cpuHzPerCoreIn, hostWhereInput.cpuHzPerCoreIn) &&
        Objects.equals(this.cpuHzPerCoreLt, hostWhereInput.cpuHzPerCoreLt) &&
        Objects.equals(this.cpuHzPerCoreLte, hostWhereInput.cpuHzPerCoreLte) &&
        Objects.equals(this.cpuHzPerCoreNot, hostWhereInput.cpuHzPerCoreNot) &&
        Objects.equals(this.cpuHzPerCoreNotIn, hostWhereInput.cpuHzPerCoreNotIn) &&
        Objects.equals(this.cpuModel, hostWhereInput.cpuModel) &&
        Objects.equals(this.cpuModelContains, hostWhereInput.cpuModelContains) &&
        Objects.equals(this.cpuModelEndsWith, hostWhereInput.cpuModelEndsWith) &&
        Objects.equals(this.cpuModelGt, hostWhereInput.cpuModelGt) &&
        Objects.equals(this.cpuModelGte, hostWhereInput.cpuModelGte) &&
        Objects.equals(this.cpuModelIn, hostWhereInput.cpuModelIn) &&
        Objects.equals(this.cpuModelLt, hostWhereInput.cpuModelLt) &&
        Objects.equals(this.cpuModelLte, hostWhereInput.cpuModelLte) &&
        Objects.equals(this.cpuModelNot, hostWhereInput.cpuModelNot) &&
        Objects.equals(this.cpuModelNotContains, hostWhereInput.cpuModelNotContains) &&
        Objects.equals(this.cpuModelNotEndsWith, hostWhereInput.cpuModelNotEndsWith) &&
        Objects.equals(this.cpuModelNotIn, hostWhereInput.cpuModelNotIn) &&
        Objects.equals(this.cpuModelNotStartsWith, hostWhereInput.cpuModelNotStartsWith) &&
        Objects.equals(this.cpuModelStartsWith, hostWhereInput.cpuModelStartsWith) &&
        Objects.equals(this.cpuVendor, hostWhereInput.cpuVendor) &&
        Objects.equals(this.cpuVendorContains, hostWhereInput.cpuVendorContains) &&
        Objects.equals(this.cpuVendorEndsWith, hostWhereInput.cpuVendorEndsWith) &&
        Objects.equals(this.cpuVendorGt, hostWhereInput.cpuVendorGt) &&
        Objects.equals(this.cpuVendorGte, hostWhereInput.cpuVendorGte) &&
        Objects.equals(this.cpuVendorIn, hostWhereInput.cpuVendorIn) &&
        Objects.equals(this.cpuVendorLt, hostWhereInput.cpuVendorLt) &&
        Objects.equals(this.cpuVendorLte, hostWhereInput.cpuVendorLte) &&
        Objects.equals(this.cpuVendorNot, hostWhereInput.cpuVendorNot) &&
        Objects.equals(this.cpuVendorNotContains, hostWhereInput.cpuVendorNotContains) &&
        Objects.equals(this.cpuVendorNotEndsWith, hostWhereInput.cpuVendorNotEndsWith) &&
        Objects.equals(this.cpuVendorNotIn, hostWhereInput.cpuVendorNotIn) &&
        Objects.equals(this.cpuVendorNotStartsWith, hostWhereInput.cpuVendorNotStartsWith) &&
        Objects.equals(this.cpuVendorStartsWith, hostWhereInput.cpuVendorStartsWith) &&
        Objects.equals(this.dataIp, hostWhereInput.dataIp) &&
        Objects.equals(this.dataIpContains, hostWhereInput.dataIpContains) &&
        Objects.equals(this.dataIpEndsWith, hostWhereInput.dataIpEndsWith) &&
        Objects.equals(this.dataIpGt, hostWhereInput.dataIpGt) &&
        Objects.equals(this.dataIpGte, hostWhereInput.dataIpGte) &&
        Objects.equals(this.dataIpIn, hostWhereInput.dataIpIn) &&
        Objects.equals(this.dataIpLt, hostWhereInput.dataIpLt) &&
        Objects.equals(this.dataIpLte, hostWhereInput.dataIpLte) &&
        Objects.equals(this.dataIpNot, hostWhereInput.dataIpNot) &&
        Objects.equals(this.dataIpNotContains, hostWhereInput.dataIpNotContains) &&
        Objects.equals(this.dataIpNotEndsWith, hostWhereInput.dataIpNotEndsWith) &&
        Objects.equals(this.dataIpNotIn, hostWhereInput.dataIpNotIn) &&
        Objects.equals(this.dataIpNotStartsWith, hostWhereInput.dataIpNotStartsWith) &&
        Objects.equals(this.dataIpStartsWith, hostWhereInput.dataIpStartsWith) &&
        Objects.equals(this.entityAsyncStatus, hostWhereInput.entityAsyncStatus) &&
        Objects.equals(this.entityAsyncStatusIn, hostWhereInput.entityAsyncStatusIn) &&
        Objects.equals(this.entityAsyncStatusNot, hostWhereInput.entityAsyncStatusNot) &&
        Objects.equals(this.entityAsyncStatusNotIn, hostWhereInput.entityAsyncStatusNotIn) &&
        Objects.equals(this.failureDataSpace, hostWhereInput.failureDataSpace) &&
        Objects.equals(this.failureDataSpaceGt, hostWhereInput.failureDataSpaceGt) &&
        Objects.equals(this.failureDataSpaceGte, hostWhereInput.failureDataSpaceGte) &&
        Objects.equals(this.failureDataSpaceIn, hostWhereInput.failureDataSpaceIn) &&
        Objects.equals(this.failureDataSpaceLt, hostWhereInput.failureDataSpaceLt) &&
        Objects.equals(this.failureDataSpaceLte, hostWhereInput.failureDataSpaceLte) &&
        Objects.equals(this.failureDataSpaceNot, hostWhereInput.failureDataSpaceNot) &&
        Objects.equals(this.failureDataSpaceNotIn, hostWhereInput.failureDataSpaceNotIn) &&
        Objects.equals(this.gpuDevicesEvery, hostWhereInput.gpuDevicesEvery) &&
        Objects.equals(this.gpuDevicesNone, hostWhereInput.gpuDevicesNone) &&
        Objects.equals(this.gpuDevicesSome, hostWhereInput.gpuDevicesSome) &&
        Objects.equals(this.hddDataCapacity, hostWhereInput.hddDataCapacity) &&
        Objects.equals(this.hddDataCapacityGt, hostWhereInput.hddDataCapacityGt) &&
        Objects.equals(this.hddDataCapacityGte, hostWhereInput.hddDataCapacityGte) &&
        Objects.equals(this.hddDataCapacityIn, hostWhereInput.hddDataCapacityIn) &&
        Objects.equals(this.hddDataCapacityLt, hostWhereInput.hddDataCapacityLt) &&
        Objects.equals(this.hddDataCapacityLte, hostWhereInput.hddDataCapacityLte) &&
        Objects.equals(this.hddDataCapacityNot, hostWhereInput.hddDataCapacityNot) &&
        Objects.equals(this.hddDataCapacityNotIn, hostWhereInput.hddDataCapacityNotIn) &&
        Objects.equals(this.hddDiskCount, hostWhereInput.hddDiskCount) &&
        Objects.equals(this.hddDiskCountGt, hostWhereInput.hddDiskCountGt) &&
        Objects.equals(this.hddDiskCountGte, hostWhereInput.hddDiskCountGte) &&
        Objects.equals(this.hddDiskCountIn, hostWhereInput.hddDiskCountIn) &&
        Objects.equals(this.hddDiskCountLt, hostWhereInput.hddDiskCountLt) &&
        Objects.equals(this.hddDiskCountLte, hostWhereInput.hddDiskCountLte) &&
        Objects.equals(this.hddDiskCountNot, hostWhereInput.hddDiskCountNot) &&
        Objects.equals(this.hddDiskCountNotIn, hostWhereInput.hddDiskCountNotIn) &&
        Objects.equals(this.hypervisorIp, hostWhereInput.hypervisorIp) &&
        Objects.equals(this.hypervisorIpContains, hostWhereInput.hypervisorIpContains) &&
        Objects.equals(this.hypervisorIpEndsWith, hostWhereInput.hypervisorIpEndsWith) &&
        Objects.equals(this.hypervisorIpGt, hostWhereInput.hypervisorIpGt) &&
        Objects.equals(this.hypervisorIpGte, hostWhereInput.hypervisorIpGte) &&
        Objects.equals(this.hypervisorIpIn, hostWhereInput.hypervisorIpIn) &&
        Objects.equals(this.hypervisorIpLt, hostWhereInput.hypervisorIpLt) &&
        Objects.equals(this.hypervisorIpLte, hostWhereInput.hypervisorIpLte) &&
        Objects.equals(this.hypervisorIpNot, hostWhereInput.hypervisorIpNot) &&
        Objects.equals(this.hypervisorIpNotContains, hostWhereInput.hypervisorIpNotContains) &&
        Objects.equals(this.hypervisorIpNotEndsWith, hostWhereInput.hypervisorIpNotEndsWith) &&
        Objects.equals(this.hypervisorIpNotIn, hostWhereInput.hypervisorIpNotIn) &&
        Objects.equals(this.hypervisorIpNotStartsWith, hostWhereInput.hypervisorIpNotStartsWith) &&
        Objects.equals(this.hypervisorIpStartsWith, hostWhereInput.hypervisorIpStartsWith) &&
        Objects.equals(this.id, hostWhereInput.id) &&
        Objects.equals(this.idContains, hostWhereInput.idContains) &&
        Objects.equals(this.idEndsWith, hostWhereInput.idEndsWith) &&
        Objects.equals(this.idGt, hostWhereInput.idGt) &&
        Objects.equals(this.idGte, hostWhereInput.idGte) &&
        Objects.equals(this.idIn, hostWhereInput.idIn) &&
        Objects.equals(this.idLt, hostWhereInput.idLt) &&
        Objects.equals(this.idLte, hostWhereInput.idLte) &&
        Objects.equals(this.idNot, hostWhereInput.idNot) &&
        Objects.equals(this.idNotContains, hostWhereInput.idNotContains) &&
        Objects.equals(this.idNotEndsWith, hostWhereInput.idNotEndsWith) &&
        Objects.equals(this.idNotIn, hostWhereInput.idNotIn) &&
        Objects.equals(this.idNotStartsWith, hostWhereInput.idNotStartsWith) &&
        Objects.equals(this.idStartsWith, hostWhereInput.idStartsWith) &&
        Objects.equals(this.iommu, hostWhereInput.iommu) &&
        Objects.equals(this.iommuIn, hostWhereInput.iommuIn) &&
        Objects.equals(this.iommuNot, hostWhereInput.iommuNot) &&
        Objects.equals(this.iommuNotIn, hostWhereInput.iommuNotIn) &&
        Objects.equals(this.isOsInRaid1, hostWhereInput.isOsInRaid1) &&
        Objects.equals(this.isOsInRaid1Not, hostWhereInput.isOsInRaid1Not) &&
        Objects.equals(this.labelsEvery, hostWhereInput.labelsEvery) &&
        Objects.equals(this.labelsNone, hostWhereInput.labelsNone) &&
        Objects.equals(this.labelsSome, hostWhereInput.labelsSome) &&
        Objects.equals(this.localId, hostWhereInput.localId) &&
        Objects.equals(this.localIdContains, hostWhereInput.localIdContains) &&
        Objects.equals(this.localIdEndsWith, hostWhereInput.localIdEndsWith) &&
        Objects.equals(this.localIdGt, hostWhereInput.localIdGt) &&
        Objects.equals(this.localIdGte, hostWhereInput.localIdGte) &&
        Objects.equals(this.localIdIn, hostWhereInput.localIdIn) &&
        Objects.equals(this.localIdLt, hostWhereInput.localIdLt) &&
        Objects.equals(this.localIdLte, hostWhereInput.localIdLte) &&
        Objects.equals(this.localIdNot, hostWhereInput.localIdNot) &&
        Objects.equals(this.localIdNotContains, hostWhereInput.localIdNotContains) &&
        Objects.equals(this.localIdNotEndsWith, hostWhereInput.localIdNotEndsWith) &&
        Objects.equals(this.localIdNotIn, hostWhereInput.localIdNotIn) &&
        Objects.equals(this.localIdNotStartsWith, hostWhereInput.localIdNotStartsWith) &&
        Objects.equals(this.localIdStartsWith, hostWhereInput.localIdStartsWith) &&
        Objects.equals(this.lsmCapDiskSafeUmount, hostWhereInput.lsmCapDiskSafeUmount) &&
        Objects.equals(this.lsmCapDiskSafeUmountNot, hostWhereInput.lsmCapDiskSafeUmountNot) &&
        Objects.equals(this.managementIp, hostWhereInput.managementIp) &&
        Objects.equals(this.managementIpContains, hostWhereInput.managementIpContains) &&
        Objects.equals(this.managementIpEndsWith, hostWhereInput.managementIpEndsWith) &&
        Objects.equals(this.managementIpGt, hostWhereInput.managementIpGt) &&
        Objects.equals(this.managementIpGte, hostWhereInput.managementIpGte) &&
        Objects.equals(this.managementIpIn, hostWhereInput.managementIpIn) &&
        Objects.equals(this.managementIpLt, hostWhereInput.managementIpLt) &&
        Objects.equals(this.managementIpLte, hostWhereInput.managementIpLte) &&
        Objects.equals(this.managementIpNot, hostWhereInput.managementIpNot) &&
        Objects.equals(this.managementIpNotContains, hostWhereInput.managementIpNotContains) &&
        Objects.equals(this.managementIpNotEndsWith, hostWhereInput.managementIpNotEndsWith) &&
        Objects.equals(this.managementIpNotIn, hostWhereInput.managementIpNotIn) &&
        Objects.equals(this.managementIpNotStartsWith, hostWhereInput.managementIpNotStartsWith) &&
        Objects.equals(this.managementIpStartsWith, hostWhereInput.managementIpStartsWith) &&
        Objects.equals(this.model, hostWhereInput.model) &&
        Objects.equals(this.modelContains, hostWhereInput.modelContains) &&
        Objects.equals(this.modelEndsWith, hostWhereInput.modelEndsWith) &&
        Objects.equals(this.modelGt, hostWhereInput.modelGt) &&
        Objects.equals(this.modelGte, hostWhereInput.modelGte) &&
        Objects.equals(this.modelIn, hostWhereInput.modelIn) &&
        Objects.equals(this.modelLt, hostWhereInput.modelLt) &&
        Objects.equals(this.modelLte, hostWhereInput.modelLte) &&
        Objects.equals(this.modelNot, hostWhereInput.modelNot) &&
        Objects.equals(this.modelNotContains, hostWhereInput.modelNotContains) &&
        Objects.equals(this.modelNotEndsWith, hostWhereInput.modelNotEndsWith) &&
        Objects.equals(this.modelNotIn, hostWhereInput.modelNotIn) &&
        Objects.equals(this.modelNotStartsWith, hostWhereInput.modelNotStartsWith) &&
        Objects.equals(this.modelStartsWith, hostWhereInput.modelStartsWith) &&
        Objects.equals(this.name, hostWhereInput.name) &&
        Objects.equals(this.nameContains, hostWhereInput.nameContains) &&
        Objects.equals(this.nameEndsWith, hostWhereInput.nameEndsWith) &&
        Objects.equals(this.nameGt, hostWhereInput.nameGt) &&
        Objects.equals(this.nameGte, hostWhereInput.nameGte) &&
        Objects.equals(this.nameIn, hostWhereInput.nameIn) &&
        Objects.equals(this.nameLt, hostWhereInput.nameLt) &&
        Objects.equals(this.nameLte, hostWhereInput.nameLte) &&
        Objects.equals(this.nameNot, hostWhereInput.nameNot) &&
        Objects.equals(this.nameNotContains, hostWhereInput.nameNotContains) &&
        Objects.equals(this.nameNotEndsWith, hostWhereInput.nameNotEndsWith) &&
        Objects.equals(this.nameNotIn, hostWhereInput.nameNotIn) &&
        Objects.equals(this.nameNotStartsWith, hostWhereInput.nameNotStartsWith) &&
        Objects.equals(this.nameStartsWith, hostWhereInput.nameStartsWith) &&
        Objects.equals(this.nestedVirtualization, hostWhereInput.nestedVirtualization) &&
        Objects.equals(this.nestedVirtualizationNot, hostWhereInput.nestedVirtualizationNot) &&
        Objects.equals(this.nicCount, hostWhereInput.nicCount) &&
        Objects.equals(this.nicCountGt, hostWhereInput.nicCountGt) &&
        Objects.equals(this.nicCountGte, hostWhereInput.nicCountGte) &&
        Objects.equals(this.nicCountIn, hostWhereInput.nicCountIn) &&
        Objects.equals(this.nicCountLt, hostWhereInput.nicCountLt) &&
        Objects.equals(this.nicCountLte, hostWhereInput.nicCountLte) &&
        Objects.equals(this.nicCountNot, hostWhereInput.nicCountNot) &&
        Objects.equals(this.nicCountNotIn, hostWhereInput.nicCountNotIn) &&
        Objects.equals(this.nicsEvery, hostWhereInput.nicsEvery) &&
        Objects.equals(this.nicsNone, hostWhereInput.nicsNone) &&
        Objects.equals(this.nicsSome, hostWhereInput.nicsSome) &&
        Objects.equals(this.nodeTopoLocalId, hostWhereInput.nodeTopoLocalId) &&
        Objects.equals(this.nodeTopoLocalIdContains, hostWhereInput.nodeTopoLocalIdContains) &&
        Objects.equals(this.nodeTopoLocalIdEndsWith, hostWhereInput.nodeTopoLocalIdEndsWith) &&
        Objects.equals(this.nodeTopoLocalIdGt, hostWhereInput.nodeTopoLocalIdGt) &&
        Objects.equals(this.nodeTopoLocalIdGte, hostWhereInput.nodeTopoLocalIdGte) &&
        Objects.equals(this.nodeTopoLocalIdIn, hostWhereInput.nodeTopoLocalIdIn) &&
        Objects.equals(this.nodeTopoLocalIdLt, hostWhereInput.nodeTopoLocalIdLt) &&
        Objects.equals(this.nodeTopoLocalIdLte, hostWhereInput.nodeTopoLocalIdLte) &&
        Objects.equals(this.nodeTopoLocalIdNot, hostWhereInput.nodeTopoLocalIdNot) &&
        Objects.equals(this.nodeTopoLocalIdNotContains, hostWhereInput.nodeTopoLocalIdNotContains) &&
        Objects.equals(this.nodeTopoLocalIdNotEndsWith, hostWhereInput.nodeTopoLocalIdNotEndsWith) &&
        Objects.equals(this.nodeTopoLocalIdNotIn, hostWhereInput.nodeTopoLocalIdNotIn) &&
        Objects.equals(this.nodeTopoLocalIdNotStartsWith, hostWhereInput.nodeTopoLocalIdNotStartsWith) &&
        Objects.equals(this.nodeTopoLocalIdStartsWith, hostWhereInput.nodeTopoLocalIdStartsWith) &&
        Objects.equals(this.osMemoryBytes, hostWhereInput.osMemoryBytes) &&
        Objects.equals(this.osMemoryBytesGt, hostWhereInput.osMemoryBytesGt) &&
        Objects.equals(this.osMemoryBytesGte, hostWhereInput.osMemoryBytesGte) &&
        Objects.equals(this.osMemoryBytesIn, hostWhereInput.osMemoryBytesIn) &&
        Objects.equals(this.osMemoryBytesLt, hostWhereInput.osMemoryBytesLt) &&
        Objects.equals(this.osMemoryBytesLte, hostWhereInput.osMemoryBytesLte) &&
        Objects.equals(this.osMemoryBytesNot, hostWhereInput.osMemoryBytesNot) &&
        Objects.equals(this.osMemoryBytesNotIn, hostWhereInput.osMemoryBytesNotIn) &&
        Objects.equals(this.osVersion, hostWhereInput.osVersion) &&
        Objects.equals(this.osVersionContains, hostWhereInput.osVersionContains) &&
        Objects.equals(this.osVersionEndsWith, hostWhereInput.osVersionEndsWith) &&
        Objects.equals(this.osVersionGt, hostWhereInput.osVersionGt) &&
        Objects.equals(this.osVersionGte, hostWhereInput.osVersionGte) &&
        Objects.equals(this.osVersionIn, hostWhereInput.osVersionIn) &&
        Objects.equals(this.osVersionLt, hostWhereInput.osVersionLt) &&
        Objects.equals(this.osVersionLte, hostWhereInput.osVersionLte) &&
        Objects.equals(this.osVersionNot, hostWhereInput.osVersionNot) &&
        Objects.equals(this.osVersionNotContains, hostWhereInput.osVersionNotContains) &&
        Objects.equals(this.osVersionNotEndsWith, hostWhereInput.osVersionNotEndsWith) &&
        Objects.equals(this.osVersionNotIn, hostWhereInput.osVersionNotIn) &&
        Objects.equals(this.osVersionNotStartsWith, hostWhereInput.osVersionNotStartsWith) &&
        Objects.equals(this.osVersionStartsWith, hostWhereInput.osVersionStartsWith) &&
        Objects.equals(this.pmemDimmCapacity, hostWhereInput.pmemDimmCapacity) &&
        Objects.equals(this.pmemDimmCapacityGt, hostWhereInput.pmemDimmCapacityGt) &&
        Objects.equals(this.pmemDimmCapacityGte, hostWhereInput.pmemDimmCapacityGte) &&
        Objects.equals(this.pmemDimmCapacityIn, hostWhereInput.pmemDimmCapacityIn) &&
        Objects.equals(this.pmemDimmCapacityLt, hostWhereInput.pmemDimmCapacityLt) &&
        Objects.equals(this.pmemDimmCapacityLte, hostWhereInput.pmemDimmCapacityLte) &&
        Objects.equals(this.pmemDimmCapacityNot, hostWhereInput.pmemDimmCapacityNot) &&
        Objects.equals(this.pmemDimmCapacityNotIn, hostWhereInput.pmemDimmCapacityNotIn) &&
        Objects.equals(this.pmemDimmCount, hostWhereInput.pmemDimmCount) &&
        Objects.equals(this.pmemDimmCountGt, hostWhereInput.pmemDimmCountGt) &&
        Objects.equals(this.pmemDimmCountGte, hostWhereInput.pmemDimmCountGte) &&
        Objects.equals(this.pmemDimmCountIn, hostWhereInput.pmemDimmCountIn) &&
        Objects.equals(this.pmemDimmCountLt, hostWhereInput.pmemDimmCountLt) &&
        Objects.equals(this.pmemDimmCountLte, hostWhereInput.pmemDimmCountLte) &&
        Objects.equals(this.pmemDimmCountNot, hostWhereInput.pmemDimmCountNot) &&
        Objects.equals(this.pmemDimmCountNotIn, hostWhereInput.pmemDimmCountNotIn) &&
        Objects.equals(this.pmemDiskCount, hostWhereInput.pmemDiskCount) &&
        Objects.equals(this.pmemDiskCountGt, hostWhereInput.pmemDiskCountGt) &&
        Objects.equals(this.pmemDiskCountGte, hostWhereInput.pmemDiskCountGte) &&
        Objects.equals(this.pmemDiskCountIn, hostWhereInput.pmemDiskCountIn) &&
        Objects.equals(this.pmemDiskCountLt, hostWhereInput.pmemDiskCountLt) &&
        Objects.equals(this.pmemDiskCountLte, hostWhereInput.pmemDiskCountLte) &&
        Objects.equals(this.pmemDiskCountNot, hostWhereInput.pmemDiskCountNot) &&
        Objects.equals(this.pmemDiskCountNotIn, hostWhereInput.pmemDiskCountNotIn) &&
        Objects.equals(this.provisionedCpuCores, hostWhereInput.provisionedCpuCores) &&
        Objects.equals(this.provisionedCpuCoresGt, hostWhereInput.provisionedCpuCoresGt) &&
        Objects.equals(this.provisionedCpuCoresGte, hostWhereInput.provisionedCpuCoresGte) &&
        Objects.equals(this.provisionedCpuCoresIn, hostWhereInput.provisionedCpuCoresIn) &&
        Objects.equals(this.provisionedCpuCoresLt, hostWhereInput.provisionedCpuCoresLt) &&
        Objects.equals(this.provisionedCpuCoresLte, hostWhereInput.provisionedCpuCoresLte) &&
        Objects.equals(this.provisionedCpuCoresNot, hostWhereInput.provisionedCpuCoresNot) &&
        Objects.equals(this.provisionedCpuCoresNotIn, hostWhereInput.provisionedCpuCoresNotIn) &&
        Objects.equals(this.provisionedMemoryBytes, hostWhereInput.provisionedMemoryBytes) &&
        Objects.equals(this.provisionedMemoryBytesGt, hostWhereInput.provisionedMemoryBytesGt) &&
        Objects.equals(this.provisionedMemoryBytesGte, hostWhereInput.provisionedMemoryBytesGte) &&
        Objects.equals(this.provisionedMemoryBytesIn, hostWhereInput.provisionedMemoryBytesIn) &&
        Objects.equals(this.provisionedMemoryBytesLt, hostWhereInput.provisionedMemoryBytesLt) &&
        Objects.equals(this.provisionedMemoryBytesLte, hostWhereInput.provisionedMemoryBytesLte) &&
        Objects.equals(this.provisionedMemoryBytesNot, hostWhereInput.provisionedMemoryBytesNot) &&
        Objects.equals(this.provisionedMemoryBytesNotIn, hostWhereInput.provisionedMemoryBytesNotIn) &&
        Objects.equals(this.runningPauseVmMemoryBytes, hostWhereInput.runningPauseVmMemoryBytes) &&
        Objects.equals(this.runningPauseVmMemoryBytesGt, hostWhereInput.runningPauseVmMemoryBytesGt) &&
        Objects.equals(this.runningPauseVmMemoryBytesGte, hostWhereInput.runningPauseVmMemoryBytesGte) &&
        Objects.equals(this.runningPauseVmMemoryBytesIn, hostWhereInput.runningPauseVmMemoryBytesIn) &&
        Objects.equals(this.runningPauseVmMemoryBytesLt, hostWhereInput.runningPauseVmMemoryBytesLt) &&
        Objects.equals(this.runningPauseVmMemoryBytesLte, hostWhereInput.runningPauseVmMemoryBytesLte) &&
        Objects.equals(this.runningPauseVmMemoryBytesNot, hostWhereInput.runningPauseVmMemoryBytesNot) &&
        Objects.equals(this.runningPauseVmMemoryBytesNotIn, hostWhereInput.runningPauseVmMemoryBytesNotIn) &&
        Objects.equals(this.runningVmNum, hostWhereInput.runningVmNum) &&
        Objects.equals(this.runningVmNumGt, hostWhereInput.runningVmNumGt) &&
        Objects.equals(this.runningVmNumGte, hostWhereInput.runningVmNumGte) &&
        Objects.equals(this.runningVmNumIn, hostWhereInput.runningVmNumIn) &&
        Objects.equals(this.runningVmNumLt, hostWhereInput.runningVmNumLt) &&
        Objects.equals(this.runningVmNumLte, hostWhereInput.runningVmNumLte) &&
        Objects.equals(this.runningVmNumNot, hostWhereInput.runningVmNumNot) &&
        Objects.equals(this.runningVmNumNotIn, hostWhereInput.runningVmNumNotIn) &&
        Objects.equals(this.scvmCpu, hostWhereInput.scvmCpu) &&
        Objects.equals(this.scvmCpuGt, hostWhereInput.scvmCpuGt) &&
        Objects.equals(this.scvmCpuGte, hostWhereInput.scvmCpuGte) &&
        Objects.equals(this.scvmCpuIn, hostWhereInput.scvmCpuIn) &&
        Objects.equals(this.scvmCpuLt, hostWhereInput.scvmCpuLt) &&
        Objects.equals(this.scvmCpuLte, hostWhereInput.scvmCpuLte) &&
        Objects.equals(this.scvmCpuNot, hostWhereInput.scvmCpuNot) &&
        Objects.equals(this.scvmCpuNotIn, hostWhereInput.scvmCpuNotIn) &&
        Objects.equals(this.scvmMemory, hostWhereInput.scvmMemory) &&
        Objects.equals(this.scvmMemoryGt, hostWhereInput.scvmMemoryGt) &&
        Objects.equals(this.scvmMemoryGte, hostWhereInput.scvmMemoryGte) &&
        Objects.equals(this.scvmMemoryIn, hostWhereInput.scvmMemoryIn) &&
        Objects.equals(this.scvmMemoryLt, hostWhereInput.scvmMemoryLt) &&
        Objects.equals(this.scvmMemoryLte, hostWhereInput.scvmMemoryLte) &&
        Objects.equals(this.scvmMemoryNot, hostWhereInput.scvmMemoryNot) &&
        Objects.equals(this.scvmMemoryNotIn, hostWhereInput.scvmMemoryNotIn) &&
        Objects.equals(this.scvmName, hostWhereInput.scvmName) &&
        Objects.equals(this.scvmNameContains, hostWhereInput.scvmNameContains) &&
        Objects.equals(this.scvmNameEndsWith, hostWhereInput.scvmNameEndsWith) &&
        Objects.equals(this.scvmNameGt, hostWhereInput.scvmNameGt) &&
        Objects.equals(this.scvmNameGte, hostWhereInput.scvmNameGte) &&
        Objects.equals(this.scvmNameIn, hostWhereInput.scvmNameIn) &&
        Objects.equals(this.scvmNameLt, hostWhereInput.scvmNameLt) &&
        Objects.equals(this.scvmNameLte, hostWhereInput.scvmNameLte) &&
        Objects.equals(this.scvmNameNot, hostWhereInput.scvmNameNot) &&
        Objects.equals(this.scvmNameNotContains, hostWhereInput.scvmNameNotContains) &&
        Objects.equals(this.scvmNameNotEndsWith, hostWhereInput.scvmNameNotEndsWith) &&
        Objects.equals(this.scvmNameNotIn, hostWhereInput.scvmNameNotIn) &&
        Objects.equals(this.scvmNameNotStartsWith, hostWhereInput.scvmNameNotStartsWith) &&
        Objects.equals(this.scvmNameStartsWith, hostWhereInput.scvmNameStartsWith) &&
        Objects.equals(this.serial, hostWhereInput.serial) &&
        Objects.equals(this.serialContains, hostWhereInput.serialContains) &&
        Objects.equals(this.serialEndsWith, hostWhereInput.serialEndsWith) &&
        Objects.equals(this.serialGt, hostWhereInput.serialGt) &&
        Objects.equals(this.serialGte, hostWhereInput.serialGte) &&
        Objects.equals(this.serialIn, hostWhereInput.serialIn) &&
        Objects.equals(this.serialLt, hostWhereInput.serialLt) &&
        Objects.equals(this.serialLte, hostWhereInput.serialLte) &&
        Objects.equals(this.serialNot, hostWhereInput.serialNot) &&
        Objects.equals(this.serialNotContains, hostWhereInput.serialNotContains) &&
        Objects.equals(this.serialNotEndsWith, hostWhereInput.serialNotEndsWith) &&
        Objects.equals(this.serialNotIn, hostWhereInput.serialNotIn) &&
        Objects.equals(this.serialNotStartsWith, hostWhereInput.serialNotStartsWith) &&
        Objects.equals(this.serialStartsWith, hostWhereInput.serialStartsWith) &&
        Objects.equals(this.ssdDataCapacity, hostWhereInput.ssdDataCapacity) &&
        Objects.equals(this.ssdDataCapacityGt, hostWhereInput.ssdDataCapacityGt) &&
        Objects.equals(this.ssdDataCapacityGte, hostWhereInput.ssdDataCapacityGte) &&
        Objects.equals(this.ssdDataCapacityIn, hostWhereInput.ssdDataCapacityIn) &&
        Objects.equals(this.ssdDataCapacityLt, hostWhereInput.ssdDataCapacityLt) &&
        Objects.equals(this.ssdDataCapacityLte, hostWhereInput.ssdDataCapacityLte) &&
        Objects.equals(this.ssdDataCapacityNot, hostWhereInput.ssdDataCapacityNot) &&
        Objects.equals(this.ssdDataCapacityNotIn, hostWhereInput.ssdDataCapacityNotIn) &&
        Objects.equals(this.ssdDiskCount, hostWhereInput.ssdDiskCount) &&
        Objects.equals(this.ssdDiskCountGt, hostWhereInput.ssdDiskCountGt) &&
        Objects.equals(this.ssdDiskCountGte, hostWhereInput.ssdDiskCountGte) &&
        Objects.equals(this.ssdDiskCountIn, hostWhereInput.ssdDiskCountIn) &&
        Objects.equals(this.ssdDiskCountLt, hostWhereInput.ssdDiskCountLt) &&
        Objects.equals(this.ssdDiskCountLte, hostWhereInput.ssdDiskCountLte) &&
        Objects.equals(this.ssdDiskCountNot, hostWhereInput.ssdDiskCountNot) &&
        Objects.equals(this.ssdDiskCountNotIn, hostWhereInput.ssdDiskCountNotIn) &&
        Objects.equals(this.state, hostWhereInput.state) &&
        Objects.equals(this.stateIn, hostWhereInput.stateIn) &&
        Objects.equals(this.stateNot, hostWhereInput.stateNot) &&
        Objects.equals(this.stateNotIn, hostWhereInput.stateNotIn) &&
        Objects.equals(this.status, hostWhereInput.status) &&
        Objects.equals(this.statusIn, hostWhereInput.statusIn) &&
        Objects.equals(this.statusNot, hostWhereInput.statusNot) &&
        Objects.equals(this.statusNotIn, hostWhereInput.statusNotIn) &&
        Objects.equals(this.stoppedVmNum, hostWhereInput.stoppedVmNum) &&
        Objects.equals(this.stoppedVmNumGt, hostWhereInput.stoppedVmNumGt) &&
        Objects.equals(this.stoppedVmNumGte, hostWhereInput.stoppedVmNumGte) &&
        Objects.equals(this.stoppedVmNumIn, hostWhereInput.stoppedVmNumIn) &&
        Objects.equals(this.stoppedVmNumLt, hostWhereInput.stoppedVmNumLt) &&
        Objects.equals(this.stoppedVmNumLte, hostWhereInput.stoppedVmNumLte) &&
        Objects.equals(this.stoppedVmNumNot, hostWhereInput.stoppedVmNumNot) &&
        Objects.equals(this.stoppedVmNumNotIn, hostWhereInput.stoppedVmNumNotIn) &&
        Objects.equals(this.suspendedVmNum, hostWhereInput.suspendedVmNum) &&
        Objects.equals(this.suspendedVmNumGt, hostWhereInput.suspendedVmNumGt) &&
        Objects.equals(this.suspendedVmNumGte, hostWhereInput.suspendedVmNumGte) &&
        Objects.equals(this.suspendedVmNumIn, hostWhereInput.suspendedVmNumIn) &&
        Objects.equals(this.suspendedVmNumLt, hostWhereInput.suspendedVmNumLt) &&
        Objects.equals(this.suspendedVmNumLte, hostWhereInput.suspendedVmNumLte) &&
        Objects.equals(this.suspendedVmNumNot, hostWhereInput.suspendedVmNumNot) &&
        Objects.equals(this.suspendedVmNumNotIn, hostWhereInput.suspendedVmNumNotIn) &&
        Objects.equals(this.totalCacheCapacity, hostWhereInput.totalCacheCapacity) &&
        Objects.equals(this.totalCacheCapacityGt, hostWhereInput.totalCacheCapacityGt) &&
        Objects.equals(this.totalCacheCapacityGte, hostWhereInput.totalCacheCapacityGte) &&
        Objects.equals(this.totalCacheCapacityIn, hostWhereInput.totalCacheCapacityIn) &&
        Objects.equals(this.totalCacheCapacityLt, hostWhereInput.totalCacheCapacityLt) &&
        Objects.equals(this.totalCacheCapacityLte, hostWhereInput.totalCacheCapacityLte) &&
        Objects.equals(this.totalCacheCapacityNot, hostWhereInput.totalCacheCapacityNot) &&
        Objects.equals(this.totalCacheCapacityNotIn, hostWhereInput.totalCacheCapacityNotIn) &&
        Objects.equals(this.totalCpuCores, hostWhereInput.totalCpuCores) &&
        Objects.equals(this.totalCpuCoresGt, hostWhereInput.totalCpuCoresGt) &&
        Objects.equals(this.totalCpuCoresGte, hostWhereInput.totalCpuCoresGte) &&
        Objects.equals(this.totalCpuCoresIn, hostWhereInput.totalCpuCoresIn) &&
        Objects.equals(this.totalCpuCoresLt, hostWhereInput.totalCpuCoresLt) &&
        Objects.equals(this.totalCpuCoresLte, hostWhereInput.totalCpuCoresLte) &&
        Objects.equals(this.totalCpuCoresNot, hostWhereInput.totalCpuCoresNot) &&
        Objects.equals(this.totalCpuCoresNotIn, hostWhereInput.totalCpuCoresNotIn) &&
        Objects.equals(this.totalCpuHz, hostWhereInput.totalCpuHz) &&
        Objects.equals(this.totalCpuHzGt, hostWhereInput.totalCpuHzGt) &&
        Objects.equals(this.totalCpuHzGte, hostWhereInput.totalCpuHzGte) &&
        Objects.equals(this.totalCpuHzIn, hostWhereInput.totalCpuHzIn) &&
        Objects.equals(this.totalCpuHzLt, hostWhereInput.totalCpuHzLt) &&
        Objects.equals(this.totalCpuHzLte, hostWhereInput.totalCpuHzLte) &&
        Objects.equals(this.totalCpuHzNot, hostWhereInput.totalCpuHzNot) &&
        Objects.equals(this.totalCpuHzNotIn, hostWhereInput.totalCpuHzNotIn) &&
        Objects.equals(this.totalCpuSockets, hostWhereInput.totalCpuSockets) &&
        Objects.equals(this.totalCpuSocketsGt, hostWhereInput.totalCpuSocketsGt) &&
        Objects.equals(this.totalCpuSocketsGte, hostWhereInput.totalCpuSocketsGte) &&
        Objects.equals(this.totalCpuSocketsIn, hostWhereInput.totalCpuSocketsIn) &&
        Objects.equals(this.totalCpuSocketsLt, hostWhereInput.totalCpuSocketsLt) &&
        Objects.equals(this.totalCpuSocketsLte, hostWhereInput.totalCpuSocketsLte) &&
        Objects.equals(this.totalCpuSocketsNot, hostWhereInput.totalCpuSocketsNot) &&
        Objects.equals(this.totalCpuSocketsNotIn, hostWhereInput.totalCpuSocketsNotIn) &&
        Objects.equals(this.totalDataCapacity, hostWhereInput.totalDataCapacity) &&
        Objects.equals(this.totalDataCapacityGt, hostWhereInput.totalDataCapacityGt) &&
        Objects.equals(this.totalDataCapacityGte, hostWhereInput.totalDataCapacityGte) &&
        Objects.equals(this.totalDataCapacityIn, hostWhereInput.totalDataCapacityIn) &&
        Objects.equals(this.totalDataCapacityLt, hostWhereInput.totalDataCapacityLt) &&
        Objects.equals(this.totalDataCapacityLte, hostWhereInput.totalDataCapacityLte) &&
        Objects.equals(this.totalDataCapacityNot, hostWhereInput.totalDataCapacityNot) &&
        Objects.equals(this.totalDataCapacityNotIn, hostWhereInput.totalDataCapacityNotIn) &&
        Objects.equals(this.totalMemoryBytes, hostWhereInput.totalMemoryBytes) &&
        Objects.equals(this.totalMemoryBytesGt, hostWhereInput.totalMemoryBytesGt) &&
        Objects.equals(this.totalMemoryBytesGte, hostWhereInput.totalMemoryBytesGte) &&
        Objects.equals(this.totalMemoryBytesIn, hostWhereInput.totalMemoryBytesIn) &&
        Objects.equals(this.totalMemoryBytesLt, hostWhereInput.totalMemoryBytesLt) &&
        Objects.equals(this.totalMemoryBytesLte, hostWhereInput.totalMemoryBytesLte) &&
        Objects.equals(this.totalMemoryBytesNot, hostWhereInput.totalMemoryBytesNot) &&
        Objects.equals(this.totalMemoryBytesNotIn, hostWhereInput.totalMemoryBytesNotIn) &&
        Objects.equals(this.usbDevicesEvery, hostWhereInput.usbDevicesEvery) &&
        Objects.equals(this.usbDevicesNone, hostWhereInput.usbDevicesNone) &&
        Objects.equals(this.usbDevicesSome, hostWhereInput.usbDevicesSome) &&
        Objects.equals(this.usedCpuHz, hostWhereInput.usedCpuHz) &&
        Objects.equals(this.usedCpuHzGt, hostWhereInput.usedCpuHzGt) &&
        Objects.equals(this.usedCpuHzGte, hostWhereInput.usedCpuHzGte) &&
        Objects.equals(this.usedCpuHzIn, hostWhereInput.usedCpuHzIn) &&
        Objects.equals(this.usedCpuHzLt, hostWhereInput.usedCpuHzLt) &&
        Objects.equals(this.usedCpuHzLte, hostWhereInput.usedCpuHzLte) &&
        Objects.equals(this.usedCpuHzNot, hostWhereInput.usedCpuHzNot) &&
        Objects.equals(this.usedCpuHzNotIn, hostWhereInput.usedCpuHzNotIn) &&
        Objects.equals(this.usedDataSpace, hostWhereInput.usedDataSpace) &&
        Objects.equals(this.usedDataSpaceGt, hostWhereInput.usedDataSpaceGt) &&
        Objects.equals(this.usedDataSpaceGte, hostWhereInput.usedDataSpaceGte) &&
        Objects.equals(this.usedDataSpaceIn, hostWhereInput.usedDataSpaceIn) &&
        Objects.equals(this.usedDataSpaceLt, hostWhereInput.usedDataSpaceLt) &&
        Objects.equals(this.usedDataSpaceLte, hostWhereInput.usedDataSpaceLte) &&
        Objects.equals(this.usedDataSpaceNot, hostWhereInput.usedDataSpaceNot) &&
        Objects.equals(this.usedDataSpaceNotIn, hostWhereInput.usedDataSpaceNotIn) &&
        Objects.equals(this.usedMemoryBytes, hostWhereInput.usedMemoryBytes) &&
        Objects.equals(this.usedMemoryBytesGt, hostWhereInput.usedMemoryBytesGt) &&
        Objects.equals(this.usedMemoryBytesGte, hostWhereInput.usedMemoryBytesGte) &&
        Objects.equals(this.usedMemoryBytesIn, hostWhereInput.usedMemoryBytesIn) &&
        Objects.equals(this.usedMemoryBytesLt, hostWhereInput.usedMemoryBytesLt) &&
        Objects.equals(this.usedMemoryBytesLte, hostWhereInput.usedMemoryBytesLte) &&
        Objects.equals(this.usedMemoryBytesNot, hostWhereInput.usedMemoryBytesNot) &&
        Objects.equals(this.usedMemoryBytesNotIn, hostWhereInput.usedMemoryBytesNotIn) &&
        Objects.equals(this.vmNum, hostWhereInput.vmNum) &&
        Objects.equals(this.vmNumGt, hostWhereInput.vmNumGt) &&
        Objects.equals(this.vmNumGte, hostWhereInput.vmNumGte) &&
        Objects.equals(this.vmNumIn, hostWhereInput.vmNumIn) &&
        Objects.equals(this.vmNumLt, hostWhereInput.vmNumLt) &&
        Objects.equals(this.vmNumLte, hostWhereInput.vmNumLte) &&
        Objects.equals(this.vmNumNot, hostWhereInput.vmNumNot) &&
        Objects.equals(this.vmNumNotIn, hostWhereInput.vmNumNotIn) &&
        Objects.equals(this.vmotionIp, hostWhereInput.vmotionIp) &&
        Objects.equals(this.vmotionIpContains, hostWhereInput.vmotionIpContains) &&
        Objects.equals(this.vmotionIpEndsWith, hostWhereInput.vmotionIpEndsWith) &&
        Objects.equals(this.vmotionIpGt, hostWhereInput.vmotionIpGt) &&
        Objects.equals(this.vmotionIpGte, hostWhereInput.vmotionIpGte) &&
        Objects.equals(this.vmotionIpIn, hostWhereInput.vmotionIpIn) &&
        Objects.equals(this.vmotionIpLt, hostWhereInput.vmotionIpLt) &&
        Objects.equals(this.vmotionIpLte, hostWhereInput.vmotionIpLte) &&
        Objects.equals(this.vmotionIpNot, hostWhereInput.vmotionIpNot) &&
        Objects.equals(this.vmotionIpNotContains, hostWhereInput.vmotionIpNotContains) &&
        Objects.equals(this.vmotionIpNotEndsWith, hostWhereInput.vmotionIpNotEndsWith) &&
        Objects.equals(this.vmotionIpNotIn, hostWhereInput.vmotionIpNotIn) &&
        Objects.equals(this.vmotionIpNotStartsWith, hostWhereInput.vmotionIpNotStartsWith) &&
        Objects.equals(this.vmotionIpStartsWith, hostWhereInput.vmotionIpStartsWith) &&
        Objects.equals(this.vmsEvery, hostWhereInput.vmsEvery) &&
        Objects.equals(this.vmsNone, hostWhereInput.vmsNone) &&
        Objects.equals(this.vmsSome, hostWhereInput.vmsSome) &&
        Objects.equals(this.withFasterSsdAsCache, hostWhereInput.withFasterSsdAsCache) &&
        Objects.equals(this.withFasterSsdAsCacheNot, hostWhereInput.withFasterSsdAsCacheNot);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(AND, NOT, OR, accessIp, accessIpContains, accessIpEndsWith, accessIpGt, accessIpGte, accessIpIn, accessIpLt, accessIpLte, accessIpNot, accessIpNotContains, accessIpNotEndsWith, accessIpNotIn, accessIpNotStartsWith, accessIpStartsWith, allocableCpuCoresForVmExclusive, allocableCpuCoresForVmExclusiveGt, allocableCpuCoresForVmExclusiveGte, allocableCpuCoresForVmExclusiveIn, allocableCpuCoresForVmExclusiveLt, allocableCpuCoresForVmExclusiveLte, allocableCpuCoresForVmExclusiveNot, allocableCpuCoresForVmExclusiveNotIn, allocatableMemoryBytes, allocatableMemoryBytesGt, allocatableMemoryBytesGte, allocatableMemoryBytesIn, allocatableMemoryBytesLt, allocatableMemoryBytesLte, allocatableMemoryBytesNot, allocatableMemoryBytesNotIn, chunkId, chunkIdContains, chunkIdEndsWith, chunkIdGt, chunkIdGte, chunkIdIn, chunkIdLt, chunkIdLte, chunkIdNot, chunkIdNotContains, chunkIdNotEndsWith, chunkIdNotIn, chunkIdNotStartsWith, chunkIdStartsWith, cluster, cpuBrand, cpuBrandContains, cpuBrandEndsWith, cpuBrandGt, cpuBrandGte, cpuBrandIn, cpuBrandLt, cpuBrandLte, cpuBrandNot, cpuBrandNotContains, cpuBrandNotEndsWith, cpuBrandNotIn, cpuBrandNotStartsWith, cpuBrandStartsWith, cpuFanSpeedUnit, cpuFanSpeedUnitIn, cpuFanSpeedUnitNot, cpuFanSpeedUnitNotIn, cpuHzPerCore, cpuHzPerCoreGt, cpuHzPerCoreGte, cpuHzPerCoreIn, cpuHzPerCoreLt, cpuHzPerCoreLte, cpuHzPerCoreNot, cpuHzPerCoreNotIn, cpuModel, cpuModelContains, cpuModelEndsWith, cpuModelGt, cpuModelGte, cpuModelIn, cpuModelLt, cpuModelLte, cpuModelNot, cpuModelNotContains, cpuModelNotEndsWith, cpuModelNotIn, cpuModelNotStartsWith, cpuModelStartsWith, cpuVendor, cpuVendorContains, cpuVendorEndsWith, cpuVendorGt, cpuVendorGte, cpuVendorIn, cpuVendorLt, cpuVendorLte, cpuVendorNot, cpuVendorNotContains, cpuVendorNotEndsWith, cpuVendorNotIn, cpuVendorNotStartsWith, cpuVendorStartsWith, dataIp, dataIpContains, dataIpEndsWith, dataIpGt, dataIpGte, dataIpIn, dataIpLt, dataIpLte, dataIpNot, dataIpNotContains, dataIpNotEndsWith, dataIpNotIn, dataIpNotStartsWith, dataIpStartsWith, entityAsyncStatus, entityAsyncStatusIn, entityAsyncStatusNot, entityAsyncStatusNotIn, failureDataSpace, failureDataSpaceGt, failureDataSpaceGte, failureDataSpaceIn, failureDataSpaceLt, failureDataSpaceLte, failureDataSpaceNot, failureDataSpaceNotIn, gpuDevicesEvery, gpuDevicesNone, gpuDevicesSome, hddDataCapacity, hddDataCapacityGt, hddDataCapacityGte, hddDataCapacityIn, hddDataCapacityLt, hddDataCapacityLte, hddDataCapacityNot, hddDataCapacityNotIn, hddDiskCount, hddDiskCountGt, hddDiskCountGte, hddDiskCountIn, hddDiskCountLt, hddDiskCountLte, hddDiskCountNot, hddDiskCountNotIn, hypervisorIp, hypervisorIpContains, hypervisorIpEndsWith, hypervisorIpGt, hypervisorIpGte, hypervisorIpIn, hypervisorIpLt, hypervisorIpLte, hypervisorIpNot, hypervisorIpNotContains, hypervisorIpNotEndsWith, hypervisorIpNotIn, hypervisorIpNotStartsWith, hypervisorIpStartsWith, id, idContains, idEndsWith, idGt, idGte, idIn, idLt, idLte, idNot, idNotContains, idNotEndsWith, idNotIn, idNotStartsWith, idStartsWith, iommu, iommuIn, iommuNot, iommuNotIn, isOsInRaid1, isOsInRaid1Not, labelsEvery, labelsNone, labelsSome, localId, localIdContains, localIdEndsWith, localIdGt, localIdGte, localIdIn, localIdLt, localIdLte, localIdNot, localIdNotContains, localIdNotEndsWith, localIdNotIn, localIdNotStartsWith, localIdStartsWith, lsmCapDiskSafeUmount, lsmCapDiskSafeUmountNot, managementIp, managementIpContains, managementIpEndsWith, managementIpGt, managementIpGte, managementIpIn, managementIpLt, managementIpLte, managementIpNot, managementIpNotContains, managementIpNotEndsWith, managementIpNotIn, managementIpNotStartsWith, managementIpStartsWith, model, modelContains, modelEndsWith, modelGt, modelGte, modelIn, modelLt, modelLte, modelNot, modelNotContains, modelNotEndsWith, modelNotIn, modelNotStartsWith, modelStartsWith, name, nameContains, nameEndsWith, nameGt, nameGte, nameIn, nameLt, nameLte, nameNot, nameNotContains, nameNotEndsWith, nameNotIn, nameNotStartsWith, nameStartsWith, nestedVirtualization, nestedVirtualizationNot, nicCount, nicCountGt, nicCountGte, nicCountIn, nicCountLt, nicCountLte, nicCountNot, nicCountNotIn, nicsEvery, nicsNone, nicsSome, nodeTopoLocalId, nodeTopoLocalIdContains, nodeTopoLocalIdEndsWith, nodeTopoLocalIdGt, nodeTopoLocalIdGte, nodeTopoLocalIdIn, nodeTopoLocalIdLt, nodeTopoLocalIdLte, nodeTopoLocalIdNot, nodeTopoLocalIdNotContains, nodeTopoLocalIdNotEndsWith, nodeTopoLocalIdNotIn, nodeTopoLocalIdNotStartsWith, nodeTopoLocalIdStartsWith, osMemoryBytes, osMemoryBytesGt, osMemoryBytesGte, osMemoryBytesIn, osMemoryBytesLt, osMemoryBytesLte, osMemoryBytesNot, osMemoryBytesNotIn, osVersion, osVersionContains, osVersionEndsWith, osVersionGt, osVersionGte, osVersionIn, osVersionLt, osVersionLte, osVersionNot, osVersionNotContains, osVersionNotEndsWith, osVersionNotIn, osVersionNotStartsWith, osVersionStartsWith, pmemDimmCapacity, pmemDimmCapacityGt, pmemDimmCapacityGte, pmemDimmCapacityIn, pmemDimmCapacityLt, pmemDimmCapacityLte, pmemDimmCapacityNot, pmemDimmCapacityNotIn, pmemDimmCount, pmemDimmCountGt, pmemDimmCountGte, pmemDimmCountIn, pmemDimmCountLt, pmemDimmCountLte, pmemDimmCountNot, pmemDimmCountNotIn, pmemDiskCount, pmemDiskCountGt, pmemDiskCountGte, pmemDiskCountIn, pmemDiskCountLt, pmemDiskCountLte, pmemDiskCountNot, pmemDiskCountNotIn, provisionedCpuCores, provisionedCpuCoresGt, provisionedCpuCoresGte, provisionedCpuCoresIn, provisionedCpuCoresLt, provisionedCpuCoresLte, provisionedCpuCoresNot, provisionedCpuCoresNotIn, provisionedMemoryBytes, provisionedMemoryBytesGt, provisionedMemoryBytesGte, provisionedMemoryBytesIn, provisionedMemoryBytesLt, provisionedMemoryBytesLte, provisionedMemoryBytesNot, provisionedMemoryBytesNotIn, runningPauseVmMemoryBytes, runningPauseVmMemoryBytesGt, runningPauseVmMemoryBytesGte, runningPauseVmMemoryBytesIn, runningPauseVmMemoryBytesLt, runningPauseVmMemoryBytesLte, runningPauseVmMemoryBytesNot, runningPauseVmMemoryBytesNotIn, runningVmNum, runningVmNumGt, runningVmNumGte, runningVmNumIn, runningVmNumLt, runningVmNumLte, runningVmNumNot, runningVmNumNotIn, scvmCpu, scvmCpuGt, scvmCpuGte, scvmCpuIn, scvmCpuLt, scvmCpuLte, scvmCpuNot, scvmCpuNotIn, scvmMemory, scvmMemoryGt, scvmMemoryGte, scvmMemoryIn, scvmMemoryLt, scvmMemoryLte, scvmMemoryNot, scvmMemoryNotIn, scvmName, scvmNameContains, scvmNameEndsWith, scvmNameGt, scvmNameGte, scvmNameIn, scvmNameLt, scvmNameLte, scvmNameNot, scvmNameNotContains, scvmNameNotEndsWith, scvmNameNotIn, scvmNameNotStartsWith, scvmNameStartsWith, serial, serialContains, serialEndsWith, serialGt, serialGte, serialIn, serialLt, serialLte, serialNot, serialNotContains, serialNotEndsWith, serialNotIn, serialNotStartsWith, serialStartsWith, ssdDataCapacity, ssdDataCapacityGt, ssdDataCapacityGte, ssdDataCapacityIn, ssdDataCapacityLt, ssdDataCapacityLte, ssdDataCapacityNot, ssdDataCapacityNotIn, ssdDiskCount, ssdDiskCountGt, ssdDiskCountGte, ssdDiskCountIn, ssdDiskCountLt, ssdDiskCountLte, ssdDiskCountNot, ssdDiskCountNotIn, state, stateIn, stateNot, stateNotIn, status, statusIn, statusNot, statusNotIn, stoppedVmNum, stoppedVmNumGt, stoppedVmNumGte, stoppedVmNumIn, stoppedVmNumLt, stoppedVmNumLte, stoppedVmNumNot, stoppedVmNumNotIn, suspendedVmNum, suspendedVmNumGt, suspendedVmNumGte, suspendedVmNumIn, suspendedVmNumLt, suspendedVmNumLte, suspendedVmNumNot, suspendedVmNumNotIn, totalCacheCapacity, totalCacheCapacityGt, totalCacheCapacityGte, totalCacheCapacityIn, totalCacheCapacityLt, totalCacheCapacityLte, totalCacheCapacityNot, totalCacheCapacityNotIn, totalCpuCores, totalCpuCoresGt, totalCpuCoresGte, totalCpuCoresIn, totalCpuCoresLt, totalCpuCoresLte, totalCpuCoresNot, totalCpuCoresNotIn, totalCpuHz, totalCpuHzGt, totalCpuHzGte, totalCpuHzIn, totalCpuHzLt, totalCpuHzLte, totalCpuHzNot, totalCpuHzNotIn, totalCpuSockets, totalCpuSocketsGt, totalCpuSocketsGte, totalCpuSocketsIn, totalCpuSocketsLt, totalCpuSocketsLte, totalCpuSocketsNot, totalCpuSocketsNotIn, totalDataCapacity, totalDataCapacityGt, totalDataCapacityGte, totalDataCapacityIn, totalDataCapacityLt, totalDataCapacityLte, totalDataCapacityNot, totalDataCapacityNotIn, totalMemoryBytes, totalMemoryBytesGt, totalMemoryBytesGte, totalMemoryBytesIn, totalMemoryBytesLt, totalMemoryBytesLte, totalMemoryBytesNot, totalMemoryBytesNotIn, usbDevicesEvery, usbDevicesNone, usbDevicesSome, usedCpuHz, usedCpuHzGt, usedCpuHzGte, usedCpuHzIn, usedCpuHzLt, usedCpuHzLte, usedCpuHzNot, usedCpuHzNotIn, usedDataSpace, usedDataSpaceGt, usedDataSpaceGte, usedDataSpaceIn, usedDataSpaceLt, usedDataSpaceLte, usedDataSpaceNot, usedDataSpaceNotIn, usedMemoryBytes, usedMemoryBytesGt, usedMemoryBytesGte, usedMemoryBytesIn, usedMemoryBytesLt, usedMemoryBytesLte, usedMemoryBytesNot, usedMemoryBytesNotIn, vmNum, vmNumGt, vmNumGte, vmNumIn, vmNumLt, vmNumLte, vmNumNot, vmNumNotIn, vmotionIp, vmotionIpContains, vmotionIpEndsWith, vmotionIpGt, vmotionIpGte, vmotionIpIn, vmotionIpLt, vmotionIpLte, vmotionIpNot, vmotionIpNotContains, vmotionIpNotEndsWith, vmotionIpNotIn, vmotionIpNotStartsWith, vmotionIpStartsWith, vmsEvery, vmsNone, vmsSome, withFasterSsdAsCache, withFasterSsdAsCacheNot);
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
    sb.append("class HostWhereInput {\n");
    sb.append("    AND: ").append(toIndentedString(AND)).append("\n");
    sb.append("    NOT: ").append(toIndentedString(NOT)).append("\n");
    sb.append("    OR: ").append(toIndentedString(OR)).append("\n");
    sb.append("    accessIp: ").append(toIndentedString(accessIp)).append("\n");
    sb.append("    accessIpContains: ").append(toIndentedString(accessIpContains)).append("\n");
    sb.append("    accessIpEndsWith: ").append(toIndentedString(accessIpEndsWith)).append("\n");
    sb.append("    accessIpGt: ").append(toIndentedString(accessIpGt)).append("\n");
    sb.append("    accessIpGte: ").append(toIndentedString(accessIpGte)).append("\n");
    sb.append("    accessIpIn: ").append(toIndentedString(accessIpIn)).append("\n");
    sb.append("    accessIpLt: ").append(toIndentedString(accessIpLt)).append("\n");
    sb.append("    accessIpLte: ").append(toIndentedString(accessIpLte)).append("\n");
    sb.append("    accessIpNot: ").append(toIndentedString(accessIpNot)).append("\n");
    sb.append("    accessIpNotContains: ").append(toIndentedString(accessIpNotContains)).append("\n");
    sb.append("    accessIpNotEndsWith: ").append(toIndentedString(accessIpNotEndsWith)).append("\n");
    sb.append("    accessIpNotIn: ").append(toIndentedString(accessIpNotIn)).append("\n");
    sb.append("    accessIpNotStartsWith: ").append(toIndentedString(accessIpNotStartsWith)).append("\n");
    sb.append("    accessIpStartsWith: ").append(toIndentedString(accessIpStartsWith)).append("\n");
    sb.append("    allocableCpuCoresForVmExclusive: ").append(toIndentedString(allocableCpuCoresForVmExclusive)).append("\n");
    sb.append("    allocableCpuCoresForVmExclusiveGt: ").append(toIndentedString(allocableCpuCoresForVmExclusiveGt)).append("\n");
    sb.append("    allocableCpuCoresForVmExclusiveGte: ").append(toIndentedString(allocableCpuCoresForVmExclusiveGte)).append("\n");
    sb.append("    allocableCpuCoresForVmExclusiveIn: ").append(toIndentedString(allocableCpuCoresForVmExclusiveIn)).append("\n");
    sb.append("    allocableCpuCoresForVmExclusiveLt: ").append(toIndentedString(allocableCpuCoresForVmExclusiveLt)).append("\n");
    sb.append("    allocableCpuCoresForVmExclusiveLte: ").append(toIndentedString(allocableCpuCoresForVmExclusiveLte)).append("\n");
    sb.append("    allocableCpuCoresForVmExclusiveNot: ").append(toIndentedString(allocableCpuCoresForVmExclusiveNot)).append("\n");
    sb.append("    allocableCpuCoresForVmExclusiveNotIn: ").append(toIndentedString(allocableCpuCoresForVmExclusiveNotIn)).append("\n");
    sb.append("    allocatableMemoryBytes: ").append(toIndentedString(allocatableMemoryBytes)).append("\n");
    sb.append("    allocatableMemoryBytesGt: ").append(toIndentedString(allocatableMemoryBytesGt)).append("\n");
    sb.append("    allocatableMemoryBytesGte: ").append(toIndentedString(allocatableMemoryBytesGte)).append("\n");
    sb.append("    allocatableMemoryBytesIn: ").append(toIndentedString(allocatableMemoryBytesIn)).append("\n");
    sb.append("    allocatableMemoryBytesLt: ").append(toIndentedString(allocatableMemoryBytesLt)).append("\n");
    sb.append("    allocatableMemoryBytesLte: ").append(toIndentedString(allocatableMemoryBytesLte)).append("\n");
    sb.append("    allocatableMemoryBytesNot: ").append(toIndentedString(allocatableMemoryBytesNot)).append("\n");
    sb.append("    allocatableMemoryBytesNotIn: ").append(toIndentedString(allocatableMemoryBytesNotIn)).append("\n");
    sb.append("    chunkId: ").append(toIndentedString(chunkId)).append("\n");
    sb.append("    chunkIdContains: ").append(toIndentedString(chunkIdContains)).append("\n");
    sb.append("    chunkIdEndsWith: ").append(toIndentedString(chunkIdEndsWith)).append("\n");
    sb.append("    chunkIdGt: ").append(toIndentedString(chunkIdGt)).append("\n");
    sb.append("    chunkIdGte: ").append(toIndentedString(chunkIdGte)).append("\n");
    sb.append("    chunkIdIn: ").append(toIndentedString(chunkIdIn)).append("\n");
    sb.append("    chunkIdLt: ").append(toIndentedString(chunkIdLt)).append("\n");
    sb.append("    chunkIdLte: ").append(toIndentedString(chunkIdLte)).append("\n");
    sb.append("    chunkIdNot: ").append(toIndentedString(chunkIdNot)).append("\n");
    sb.append("    chunkIdNotContains: ").append(toIndentedString(chunkIdNotContains)).append("\n");
    sb.append("    chunkIdNotEndsWith: ").append(toIndentedString(chunkIdNotEndsWith)).append("\n");
    sb.append("    chunkIdNotIn: ").append(toIndentedString(chunkIdNotIn)).append("\n");
    sb.append("    chunkIdNotStartsWith: ").append(toIndentedString(chunkIdNotStartsWith)).append("\n");
    sb.append("    chunkIdStartsWith: ").append(toIndentedString(chunkIdStartsWith)).append("\n");
    sb.append("    cluster: ").append(toIndentedString(cluster)).append("\n");
    sb.append("    cpuBrand: ").append(toIndentedString(cpuBrand)).append("\n");
    sb.append("    cpuBrandContains: ").append(toIndentedString(cpuBrandContains)).append("\n");
    sb.append("    cpuBrandEndsWith: ").append(toIndentedString(cpuBrandEndsWith)).append("\n");
    sb.append("    cpuBrandGt: ").append(toIndentedString(cpuBrandGt)).append("\n");
    sb.append("    cpuBrandGte: ").append(toIndentedString(cpuBrandGte)).append("\n");
    sb.append("    cpuBrandIn: ").append(toIndentedString(cpuBrandIn)).append("\n");
    sb.append("    cpuBrandLt: ").append(toIndentedString(cpuBrandLt)).append("\n");
    sb.append("    cpuBrandLte: ").append(toIndentedString(cpuBrandLte)).append("\n");
    sb.append("    cpuBrandNot: ").append(toIndentedString(cpuBrandNot)).append("\n");
    sb.append("    cpuBrandNotContains: ").append(toIndentedString(cpuBrandNotContains)).append("\n");
    sb.append("    cpuBrandNotEndsWith: ").append(toIndentedString(cpuBrandNotEndsWith)).append("\n");
    sb.append("    cpuBrandNotIn: ").append(toIndentedString(cpuBrandNotIn)).append("\n");
    sb.append("    cpuBrandNotStartsWith: ").append(toIndentedString(cpuBrandNotStartsWith)).append("\n");
    sb.append("    cpuBrandStartsWith: ").append(toIndentedString(cpuBrandStartsWith)).append("\n");
    sb.append("    cpuFanSpeedUnit: ").append(toIndentedString(cpuFanSpeedUnit)).append("\n");
    sb.append("    cpuFanSpeedUnitIn: ").append(toIndentedString(cpuFanSpeedUnitIn)).append("\n");
    sb.append("    cpuFanSpeedUnitNot: ").append(toIndentedString(cpuFanSpeedUnitNot)).append("\n");
    sb.append("    cpuFanSpeedUnitNotIn: ").append(toIndentedString(cpuFanSpeedUnitNotIn)).append("\n");
    sb.append("    cpuHzPerCore: ").append(toIndentedString(cpuHzPerCore)).append("\n");
    sb.append("    cpuHzPerCoreGt: ").append(toIndentedString(cpuHzPerCoreGt)).append("\n");
    sb.append("    cpuHzPerCoreGte: ").append(toIndentedString(cpuHzPerCoreGte)).append("\n");
    sb.append("    cpuHzPerCoreIn: ").append(toIndentedString(cpuHzPerCoreIn)).append("\n");
    sb.append("    cpuHzPerCoreLt: ").append(toIndentedString(cpuHzPerCoreLt)).append("\n");
    sb.append("    cpuHzPerCoreLte: ").append(toIndentedString(cpuHzPerCoreLte)).append("\n");
    sb.append("    cpuHzPerCoreNot: ").append(toIndentedString(cpuHzPerCoreNot)).append("\n");
    sb.append("    cpuHzPerCoreNotIn: ").append(toIndentedString(cpuHzPerCoreNotIn)).append("\n");
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
    sb.append("    cpuVendor: ").append(toIndentedString(cpuVendor)).append("\n");
    sb.append("    cpuVendorContains: ").append(toIndentedString(cpuVendorContains)).append("\n");
    sb.append("    cpuVendorEndsWith: ").append(toIndentedString(cpuVendorEndsWith)).append("\n");
    sb.append("    cpuVendorGt: ").append(toIndentedString(cpuVendorGt)).append("\n");
    sb.append("    cpuVendorGte: ").append(toIndentedString(cpuVendorGte)).append("\n");
    sb.append("    cpuVendorIn: ").append(toIndentedString(cpuVendorIn)).append("\n");
    sb.append("    cpuVendorLt: ").append(toIndentedString(cpuVendorLt)).append("\n");
    sb.append("    cpuVendorLte: ").append(toIndentedString(cpuVendorLte)).append("\n");
    sb.append("    cpuVendorNot: ").append(toIndentedString(cpuVendorNot)).append("\n");
    sb.append("    cpuVendorNotContains: ").append(toIndentedString(cpuVendorNotContains)).append("\n");
    sb.append("    cpuVendorNotEndsWith: ").append(toIndentedString(cpuVendorNotEndsWith)).append("\n");
    sb.append("    cpuVendorNotIn: ").append(toIndentedString(cpuVendorNotIn)).append("\n");
    sb.append("    cpuVendorNotStartsWith: ").append(toIndentedString(cpuVendorNotStartsWith)).append("\n");
    sb.append("    cpuVendorStartsWith: ").append(toIndentedString(cpuVendorStartsWith)).append("\n");
    sb.append("    dataIp: ").append(toIndentedString(dataIp)).append("\n");
    sb.append("    dataIpContains: ").append(toIndentedString(dataIpContains)).append("\n");
    sb.append("    dataIpEndsWith: ").append(toIndentedString(dataIpEndsWith)).append("\n");
    sb.append("    dataIpGt: ").append(toIndentedString(dataIpGt)).append("\n");
    sb.append("    dataIpGte: ").append(toIndentedString(dataIpGte)).append("\n");
    sb.append("    dataIpIn: ").append(toIndentedString(dataIpIn)).append("\n");
    sb.append("    dataIpLt: ").append(toIndentedString(dataIpLt)).append("\n");
    sb.append("    dataIpLte: ").append(toIndentedString(dataIpLte)).append("\n");
    sb.append("    dataIpNot: ").append(toIndentedString(dataIpNot)).append("\n");
    sb.append("    dataIpNotContains: ").append(toIndentedString(dataIpNotContains)).append("\n");
    sb.append("    dataIpNotEndsWith: ").append(toIndentedString(dataIpNotEndsWith)).append("\n");
    sb.append("    dataIpNotIn: ").append(toIndentedString(dataIpNotIn)).append("\n");
    sb.append("    dataIpNotStartsWith: ").append(toIndentedString(dataIpNotStartsWith)).append("\n");
    sb.append("    dataIpStartsWith: ").append(toIndentedString(dataIpStartsWith)).append("\n");
    sb.append("    entityAsyncStatus: ").append(toIndentedString(entityAsyncStatus)).append("\n");
    sb.append("    entityAsyncStatusIn: ").append(toIndentedString(entityAsyncStatusIn)).append("\n");
    sb.append("    entityAsyncStatusNot: ").append(toIndentedString(entityAsyncStatusNot)).append("\n");
    sb.append("    entityAsyncStatusNotIn: ").append(toIndentedString(entityAsyncStatusNotIn)).append("\n");
    sb.append("    failureDataSpace: ").append(toIndentedString(failureDataSpace)).append("\n");
    sb.append("    failureDataSpaceGt: ").append(toIndentedString(failureDataSpaceGt)).append("\n");
    sb.append("    failureDataSpaceGte: ").append(toIndentedString(failureDataSpaceGte)).append("\n");
    sb.append("    failureDataSpaceIn: ").append(toIndentedString(failureDataSpaceIn)).append("\n");
    sb.append("    failureDataSpaceLt: ").append(toIndentedString(failureDataSpaceLt)).append("\n");
    sb.append("    failureDataSpaceLte: ").append(toIndentedString(failureDataSpaceLte)).append("\n");
    sb.append("    failureDataSpaceNot: ").append(toIndentedString(failureDataSpaceNot)).append("\n");
    sb.append("    failureDataSpaceNotIn: ").append(toIndentedString(failureDataSpaceNotIn)).append("\n");
    sb.append("    gpuDevicesEvery: ").append(toIndentedString(gpuDevicesEvery)).append("\n");
    sb.append("    gpuDevicesNone: ").append(toIndentedString(gpuDevicesNone)).append("\n");
    sb.append("    gpuDevicesSome: ").append(toIndentedString(gpuDevicesSome)).append("\n");
    sb.append("    hddDataCapacity: ").append(toIndentedString(hddDataCapacity)).append("\n");
    sb.append("    hddDataCapacityGt: ").append(toIndentedString(hddDataCapacityGt)).append("\n");
    sb.append("    hddDataCapacityGte: ").append(toIndentedString(hddDataCapacityGte)).append("\n");
    sb.append("    hddDataCapacityIn: ").append(toIndentedString(hddDataCapacityIn)).append("\n");
    sb.append("    hddDataCapacityLt: ").append(toIndentedString(hddDataCapacityLt)).append("\n");
    sb.append("    hddDataCapacityLte: ").append(toIndentedString(hddDataCapacityLte)).append("\n");
    sb.append("    hddDataCapacityNot: ").append(toIndentedString(hddDataCapacityNot)).append("\n");
    sb.append("    hddDataCapacityNotIn: ").append(toIndentedString(hddDataCapacityNotIn)).append("\n");
    sb.append("    hddDiskCount: ").append(toIndentedString(hddDiskCount)).append("\n");
    sb.append("    hddDiskCountGt: ").append(toIndentedString(hddDiskCountGt)).append("\n");
    sb.append("    hddDiskCountGte: ").append(toIndentedString(hddDiskCountGte)).append("\n");
    sb.append("    hddDiskCountIn: ").append(toIndentedString(hddDiskCountIn)).append("\n");
    sb.append("    hddDiskCountLt: ").append(toIndentedString(hddDiskCountLt)).append("\n");
    sb.append("    hddDiskCountLte: ").append(toIndentedString(hddDiskCountLte)).append("\n");
    sb.append("    hddDiskCountNot: ").append(toIndentedString(hddDiskCountNot)).append("\n");
    sb.append("    hddDiskCountNotIn: ").append(toIndentedString(hddDiskCountNotIn)).append("\n");
    sb.append("    hypervisorIp: ").append(toIndentedString(hypervisorIp)).append("\n");
    sb.append("    hypervisorIpContains: ").append(toIndentedString(hypervisorIpContains)).append("\n");
    sb.append("    hypervisorIpEndsWith: ").append(toIndentedString(hypervisorIpEndsWith)).append("\n");
    sb.append("    hypervisorIpGt: ").append(toIndentedString(hypervisorIpGt)).append("\n");
    sb.append("    hypervisorIpGte: ").append(toIndentedString(hypervisorIpGte)).append("\n");
    sb.append("    hypervisorIpIn: ").append(toIndentedString(hypervisorIpIn)).append("\n");
    sb.append("    hypervisorIpLt: ").append(toIndentedString(hypervisorIpLt)).append("\n");
    sb.append("    hypervisorIpLte: ").append(toIndentedString(hypervisorIpLte)).append("\n");
    sb.append("    hypervisorIpNot: ").append(toIndentedString(hypervisorIpNot)).append("\n");
    sb.append("    hypervisorIpNotContains: ").append(toIndentedString(hypervisorIpNotContains)).append("\n");
    sb.append("    hypervisorIpNotEndsWith: ").append(toIndentedString(hypervisorIpNotEndsWith)).append("\n");
    sb.append("    hypervisorIpNotIn: ").append(toIndentedString(hypervisorIpNotIn)).append("\n");
    sb.append("    hypervisorIpNotStartsWith: ").append(toIndentedString(hypervisorIpNotStartsWith)).append("\n");
    sb.append("    hypervisorIpStartsWith: ").append(toIndentedString(hypervisorIpStartsWith)).append("\n");
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
    sb.append("    iommu: ").append(toIndentedString(iommu)).append("\n");
    sb.append("    iommuIn: ").append(toIndentedString(iommuIn)).append("\n");
    sb.append("    iommuNot: ").append(toIndentedString(iommuNot)).append("\n");
    sb.append("    iommuNotIn: ").append(toIndentedString(iommuNotIn)).append("\n");
    sb.append("    isOsInRaid1: ").append(toIndentedString(isOsInRaid1)).append("\n");
    sb.append("    isOsInRaid1Not: ").append(toIndentedString(isOsInRaid1Not)).append("\n");
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
    sb.append("    lsmCapDiskSafeUmount: ").append(toIndentedString(lsmCapDiskSafeUmount)).append("\n");
    sb.append("    lsmCapDiskSafeUmountNot: ").append(toIndentedString(lsmCapDiskSafeUmountNot)).append("\n");
    sb.append("    managementIp: ").append(toIndentedString(managementIp)).append("\n");
    sb.append("    managementIpContains: ").append(toIndentedString(managementIpContains)).append("\n");
    sb.append("    managementIpEndsWith: ").append(toIndentedString(managementIpEndsWith)).append("\n");
    sb.append("    managementIpGt: ").append(toIndentedString(managementIpGt)).append("\n");
    sb.append("    managementIpGte: ").append(toIndentedString(managementIpGte)).append("\n");
    sb.append("    managementIpIn: ").append(toIndentedString(managementIpIn)).append("\n");
    sb.append("    managementIpLt: ").append(toIndentedString(managementIpLt)).append("\n");
    sb.append("    managementIpLte: ").append(toIndentedString(managementIpLte)).append("\n");
    sb.append("    managementIpNot: ").append(toIndentedString(managementIpNot)).append("\n");
    sb.append("    managementIpNotContains: ").append(toIndentedString(managementIpNotContains)).append("\n");
    sb.append("    managementIpNotEndsWith: ").append(toIndentedString(managementIpNotEndsWith)).append("\n");
    sb.append("    managementIpNotIn: ").append(toIndentedString(managementIpNotIn)).append("\n");
    sb.append("    managementIpNotStartsWith: ").append(toIndentedString(managementIpNotStartsWith)).append("\n");
    sb.append("    managementIpStartsWith: ").append(toIndentedString(managementIpStartsWith)).append("\n");
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
    sb.append("    modelContains: ").append(toIndentedString(modelContains)).append("\n");
    sb.append("    modelEndsWith: ").append(toIndentedString(modelEndsWith)).append("\n");
    sb.append("    modelGt: ").append(toIndentedString(modelGt)).append("\n");
    sb.append("    modelGte: ").append(toIndentedString(modelGte)).append("\n");
    sb.append("    modelIn: ").append(toIndentedString(modelIn)).append("\n");
    sb.append("    modelLt: ").append(toIndentedString(modelLt)).append("\n");
    sb.append("    modelLte: ").append(toIndentedString(modelLte)).append("\n");
    sb.append("    modelNot: ").append(toIndentedString(modelNot)).append("\n");
    sb.append("    modelNotContains: ").append(toIndentedString(modelNotContains)).append("\n");
    sb.append("    modelNotEndsWith: ").append(toIndentedString(modelNotEndsWith)).append("\n");
    sb.append("    modelNotIn: ").append(toIndentedString(modelNotIn)).append("\n");
    sb.append("    modelNotStartsWith: ").append(toIndentedString(modelNotStartsWith)).append("\n");
    sb.append("    modelStartsWith: ").append(toIndentedString(modelStartsWith)).append("\n");
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
    sb.append("    nicCount: ").append(toIndentedString(nicCount)).append("\n");
    sb.append("    nicCountGt: ").append(toIndentedString(nicCountGt)).append("\n");
    sb.append("    nicCountGte: ").append(toIndentedString(nicCountGte)).append("\n");
    sb.append("    nicCountIn: ").append(toIndentedString(nicCountIn)).append("\n");
    sb.append("    nicCountLt: ").append(toIndentedString(nicCountLt)).append("\n");
    sb.append("    nicCountLte: ").append(toIndentedString(nicCountLte)).append("\n");
    sb.append("    nicCountNot: ").append(toIndentedString(nicCountNot)).append("\n");
    sb.append("    nicCountNotIn: ").append(toIndentedString(nicCountNotIn)).append("\n");
    sb.append("    nicsEvery: ").append(toIndentedString(nicsEvery)).append("\n");
    sb.append("    nicsNone: ").append(toIndentedString(nicsNone)).append("\n");
    sb.append("    nicsSome: ").append(toIndentedString(nicsSome)).append("\n");
    sb.append("    nodeTopoLocalId: ").append(toIndentedString(nodeTopoLocalId)).append("\n");
    sb.append("    nodeTopoLocalIdContains: ").append(toIndentedString(nodeTopoLocalIdContains)).append("\n");
    sb.append("    nodeTopoLocalIdEndsWith: ").append(toIndentedString(nodeTopoLocalIdEndsWith)).append("\n");
    sb.append("    nodeTopoLocalIdGt: ").append(toIndentedString(nodeTopoLocalIdGt)).append("\n");
    sb.append("    nodeTopoLocalIdGte: ").append(toIndentedString(nodeTopoLocalIdGte)).append("\n");
    sb.append("    nodeTopoLocalIdIn: ").append(toIndentedString(nodeTopoLocalIdIn)).append("\n");
    sb.append("    nodeTopoLocalIdLt: ").append(toIndentedString(nodeTopoLocalIdLt)).append("\n");
    sb.append("    nodeTopoLocalIdLte: ").append(toIndentedString(nodeTopoLocalIdLte)).append("\n");
    sb.append("    nodeTopoLocalIdNot: ").append(toIndentedString(nodeTopoLocalIdNot)).append("\n");
    sb.append("    nodeTopoLocalIdNotContains: ").append(toIndentedString(nodeTopoLocalIdNotContains)).append("\n");
    sb.append("    nodeTopoLocalIdNotEndsWith: ").append(toIndentedString(nodeTopoLocalIdNotEndsWith)).append("\n");
    sb.append("    nodeTopoLocalIdNotIn: ").append(toIndentedString(nodeTopoLocalIdNotIn)).append("\n");
    sb.append("    nodeTopoLocalIdNotStartsWith: ").append(toIndentedString(nodeTopoLocalIdNotStartsWith)).append("\n");
    sb.append("    nodeTopoLocalIdStartsWith: ").append(toIndentedString(nodeTopoLocalIdStartsWith)).append("\n");
    sb.append("    osMemoryBytes: ").append(toIndentedString(osMemoryBytes)).append("\n");
    sb.append("    osMemoryBytesGt: ").append(toIndentedString(osMemoryBytesGt)).append("\n");
    sb.append("    osMemoryBytesGte: ").append(toIndentedString(osMemoryBytesGte)).append("\n");
    sb.append("    osMemoryBytesIn: ").append(toIndentedString(osMemoryBytesIn)).append("\n");
    sb.append("    osMemoryBytesLt: ").append(toIndentedString(osMemoryBytesLt)).append("\n");
    sb.append("    osMemoryBytesLte: ").append(toIndentedString(osMemoryBytesLte)).append("\n");
    sb.append("    osMemoryBytesNot: ").append(toIndentedString(osMemoryBytesNot)).append("\n");
    sb.append("    osMemoryBytesNotIn: ").append(toIndentedString(osMemoryBytesNotIn)).append("\n");
    sb.append("    osVersion: ").append(toIndentedString(osVersion)).append("\n");
    sb.append("    osVersionContains: ").append(toIndentedString(osVersionContains)).append("\n");
    sb.append("    osVersionEndsWith: ").append(toIndentedString(osVersionEndsWith)).append("\n");
    sb.append("    osVersionGt: ").append(toIndentedString(osVersionGt)).append("\n");
    sb.append("    osVersionGte: ").append(toIndentedString(osVersionGte)).append("\n");
    sb.append("    osVersionIn: ").append(toIndentedString(osVersionIn)).append("\n");
    sb.append("    osVersionLt: ").append(toIndentedString(osVersionLt)).append("\n");
    sb.append("    osVersionLte: ").append(toIndentedString(osVersionLte)).append("\n");
    sb.append("    osVersionNot: ").append(toIndentedString(osVersionNot)).append("\n");
    sb.append("    osVersionNotContains: ").append(toIndentedString(osVersionNotContains)).append("\n");
    sb.append("    osVersionNotEndsWith: ").append(toIndentedString(osVersionNotEndsWith)).append("\n");
    sb.append("    osVersionNotIn: ").append(toIndentedString(osVersionNotIn)).append("\n");
    sb.append("    osVersionNotStartsWith: ").append(toIndentedString(osVersionNotStartsWith)).append("\n");
    sb.append("    osVersionStartsWith: ").append(toIndentedString(osVersionStartsWith)).append("\n");
    sb.append("    pmemDimmCapacity: ").append(toIndentedString(pmemDimmCapacity)).append("\n");
    sb.append("    pmemDimmCapacityGt: ").append(toIndentedString(pmemDimmCapacityGt)).append("\n");
    sb.append("    pmemDimmCapacityGte: ").append(toIndentedString(pmemDimmCapacityGte)).append("\n");
    sb.append("    pmemDimmCapacityIn: ").append(toIndentedString(pmemDimmCapacityIn)).append("\n");
    sb.append("    pmemDimmCapacityLt: ").append(toIndentedString(pmemDimmCapacityLt)).append("\n");
    sb.append("    pmemDimmCapacityLte: ").append(toIndentedString(pmemDimmCapacityLte)).append("\n");
    sb.append("    pmemDimmCapacityNot: ").append(toIndentedString(pmemDimmCapacityNot)).append("\n");
    sb.append("    pmemDimmCapacityNotIn: ").append(toIndentedString(pmemDimmCapacityNotIn)).append("\n");
    sb.append("    pmemDimmCount: ").append(toIndentedString(pmemDimmCount)).append("\n");
    sb.append("    pmemDimmCountGt: ").append(toIndentedString(pmemDimmCountGt)).append("\n");
    sb.append("    pmemDimmCountGte: ").append(toIndentedString(pmemDimmCountGte)).append("\n");
    sb.append("    pmemDimmCountIn: ").append(toIndentedString(pmemDimmCountIn)).append("\n");
    sb.append("    pmemDimmCountLt: ").append(toIndentedString(pmemDimmCountLt)).append("\n");
    sb.append("    pmemDimmCountLte: ").append(toIndentedString(pmemDimmCountLte)).append("\n");
    sb.append("    pmemDimmCountNot: ").append(toIndentedString(pmemDimmCountNot)).append("\n");
    sb.append("    pmemDimmCountNotIn: ").append(toIndentedString(pmemDimmCountNotIn)).append("\n");
    sb.append("    pmemDiskCount: ").append(toIndentedString(pmemDiskCount)).append("\n");
    sb.append("    pmemDiskCountGt: ").append(toIndentedString(pmemDiskCountGt)).append("\n");
    sb.append("    pmemDiskCountGte: ").append(toIndentedString(pmemDiskCountGte)).append("\n");
    sb.append("    pmemDiskCountIn: ").append(toIndentedString(pmemDiskCountIn)).append("\n");
    sb.append("    pmemDiskCountLt: ").append(toIndentedString(pmemDiskCountLt)).append("\n");
    sb.append("    pmemDiskCountLte: ").append(toIndentedString(pmemDiskCountLte)).append("\n");
    sb.append("    pmemDiskCountNot: ").append(toIndentedString(pmemDiskCountNot)).append("\n");
    sb.append("    pmemDiskCountNotIn: ").append(toIndentedString(pmemDiskCountNotIn)).append("\n");
    sb.append("    provisionedCpuCores: ").append(toIndentedString(provisionedCpuCores)).append("\n");
    sb.append("    provisionedCpuCoresGt: ").append(toIndentedString(provisionedCpuCoresGt)).append("\n");
    sb.append("    provisionedCpuCoresGte: ").append(toIndentedString(provisionedCpuCoresGte)).append("\n");
    sb.append("    provisionedCpuCoresIn: ").append(toIndentedString(provisionedCpuCoresIn)).append("\n");
    sb.append("    provisionedCpuCoresLt: ").append(toIndentedString(provisionedCpuCoresLt)).append("\n");
    sb.append("    provisionedCpuCoresLte: ").append(toIndentedString(provisionedCpuCoresLte)).append("\n");
    sb.append("    provisionedCpuCoresNot: ").append(toIndentedString(provisionedCpuCoresNot)).append("\n");
    sb.append("    provisionedCpuCoresNotIn: ").append(toIndentedString(provisionedCpuCoresNotIn)).append("\n");
    sb.append("    provisionedMemoryBytes: ").append(toIndentedString(provisionedMemoryBytes)).append("\n");
    sb.append("    provisionedMemoryBytesGt: ").append(toIndentedString(provisionedMemoryBytesGt)).append("\n");
    sb.append("    provisionedMemoryBytesGte: ").append(toIndentedString(provisionedMemoryBytesGte)).append("\n");
    sb.append("    provisionedMemoryBytesIn: ").append(toIndentedString(provisionedMemoryBytesIn)).append("\n");
    sb.append("    provisionedMemoryBytesLt: ").append(toIndentedString(provisionedMemoryBytesLt)).append("\n");
    sb.append("    provisionedMemoryBytesLte: ").append(toIndentedString(provisionedMemoryBytesLte)).append("\n");
    sb.append("    provisionedMemoryBytesNot: ").append(toIndentedString(provisionedMemoryBytesNot)).append("\n");
    sb.append("    provisionedMemoryBytesNotIn: ").append(toIndentedString(provisionedMemoryBytesNotIn)).append("\n");
    sb.append("    runningPauseVmMemoryBytes: ").append(toIndentedString(runningPauseVmMemoryBytes)).append("\n");
    sb.append("    runningPauseVmMemoryBytesGt: ").append(toIndentedString(runningPauseVmMemoryBytesGt)).append("\n");
    sb.append("    runningPauseVmMemoryBytesGte: ").append(toIndentedString(runningPauseVmMemoryBytesGte)).append("\n");
    sb.append("    runningPauseVmMemoryBytesIn: ").append(toIndentedString(runningPauseVmMemoryBytesIn)).append("\n");
    sb.append("    runningPauseVmMemoryBytesLt: ").append(toIndentedString(runningPauseVmMemoryBytesLt)).append("\n");
    sb.append("    runningPauseVmMemoryBytesLte: ").append(toIndentedString(runningPauseVmMemoryBytesLte)).append("\n");
    sb.append("    runningPauseVmMemoryBytesNot: ").append(toIndentedString(runningPauseVmMemoryBytesNot)).append("\n");
    sb.append("    runningPauseVmMemoryBytesNotIn: ").append(toIndentedString(runningPauseVmMemoryBytesNotIn)).append("\n");
    sb.append("    runningVmNum: ").append(toIndentedString(runningVmNum)).append("\n");
    sb.append("    runningVmNumGt: ").append(toIndentedString(runningVmNumGt)).append("\n");
    sb.append("    runningVmNumGte: ").append(toIndentedString(runningVmNumGte)).append("\n");
    sb.append("    runningVmNumIn: ").append(toIndentedString(runningVmNumIn)).append("\n");
    sb.append("    runningVmNumLt: ").append(toIndentedString(runningVmNumLt)).append("\n");
    sb.append("    runningVmNumLte: ").append(toIndentedString(runningVmNumLte)).append("\n");
    sb.append("    runningVmNumNot: ").append(toIndentedString(runningVmNumNot)).append("\n");
    sb.append("    runningVmNumNotIn: ").append(toIndentedString(runningVmNumNotIn)).append("\n");
    sb.append("    scvmCpu: ").append(toIndentedString(scvmCpu)).append("\n");
    sb.append("    scvmCpuGt: ").append(toIndentedString(scvmCpuGt)).append("\n");
    sb.append("    scvmCpuGte: ").append(toIndentedString(scvmCpuGte)).append("\n");
    sb.append("    scvmCpuIn: ").append(toIndentedString(scvmCpuIn)).append("\n");
    sb.append("    scvmCpuLt: ").append(toIndentedString(scvmCpuLt)).append("\n");
    sb.append("    scvmCpuLte: ").append(toIndentedString(scvmCpuLte)).append("\n");
    sb.append("    scvmCpuNot: ").append(toIndentedString(scvmCpuNot)).append("\n");
    sb.append("    scvmCpuNotIn: ").append(toIndentedString(scvmCpuNotIn)).append("\n");
    sb.append("    scvmMemory: ").append(toIndentedString(scvmMemory)).append("\n");
    sb.append("    scvmMemoryGt: ").append(toIndentedString(scvmMemoryGt)).append("\n");
    sb.append("    scvmMemoryGte: ").append(toIndentedString(scvmMemoryGte)).append("\n");
    sb.append("    scvmMemoryIn: ").append(toIndentedString(scvmMemoryIn)).append("\n");
    sb.append("    scvmMemoryLt: ").append(toIndentedString(scvmMemoryLt)).append("\n");
    sb.append("    scvmMemoryLte: ").append(toIndentedString(scvmMemoryLte)).append("\n");
    sb.append("    scvmMemoryNot: ").append(toIndentedString(scvmMemoryNot)).append("\n");
    sb.append("    scvmMemoryNotIn: ").append(toIndentedString(scvmMemoryNotIn)).append("\n");
    sb.append("    scvmName: ").append(toIndentedString(scvmName)).append("\n");
    sb.append("    scvmNameContains: ").append(toIndentedString(scvmNameContains)).append("\n");
    sb.append("    scvmNameEndsWith: ").append(toIndentedString(scvmNameEndsWith)).append("\n");
    sb.append("    scvmNameGt: ").append(toIndentedString(scvmNameGt)).append("\n");
    sb.append("    scvmNameGte: ").append(toIndentedString(scvmNameGte)).append("\n");
    sb.append("    scvmNameIn: ").append(toIndentedString(scvmNameIn)).append("\n");
    sb.append("    scvmNameLt: ").append(toIndentedString(scvmNameLt)).append("\n");
    sb.append("    scvmNameLte: ").append(toIndentedString(scvmNameLte)).append("\n");
    sb.append("    scvmNameNot: ").append(toIndentedString(scvmNameNot)).append("\n");
    sb.append("    scvmNameNotContains: ").append(toIndentedString(scvmNameNotContains)).append("\n");
    sb.append("    scvmNameNotEndsWith: ").append(toIndentedString(scvmNameNotEndsWith)).append("\n");
    sb.append("    scvmNameNotIn: ").append(toIndentedString(scvmNameNotIn)).append("\n");
    sb.append("    scvmNameNotStartsWith: ").append(toIndentedString(scvmNameNotStartsWith)).append("\n");
    sb.append("    scvmNameStartsWith: ").append(toIndentedString(scvmNameStartsWith)).append("\n");
    sb.append("    serial: ").append(toIndentedString(serial)).append("\n");
    sb.append("    serialContains: ").append(toIndentedString(serialContains)).append("\n");
    sb.append("    serialEndsWith: ").append(toIndentedString(serialEndsWith)).append("\n");
    sb.append("    serialGt: ").append(toIndentedString(serialGt)).append("\n");
    sb.append("    serialGte: ").append(toIndentedString(serialGte)).append("\n");
    sb.append("    serialIn: ").append(toIndentedString(serialIn)).append("\n");
    sb.append("    serialLt: ").append(toIndentedString(serialLt)).append("\n");
    sb.append("    serialLte: ").append(toIndentedString(serialLte)).append("\n");
    sb.append("    serialNot: ").append(toIndentedString(serialNot)).append("\n");
    sb.append("    serialNotContains: ").append(toIndentedString(serialNotContains)).append("\n");
    sb.append("    serialNotEndsWith: ").append(toIndentedString(serialNotEndsWith)).append("\n");
    sb.append("    serialNotIn: ").append(toIndentedString(serialNotIn)).append("\n");
    sb.append("    serialNotStartsWith: ").append(toIndentedString(serialNotStartsWith)).append("\n");
    sb.append("    serialStartsWith: ").append(toIndentedString(serialStartsWith)).append("\n");
    sb.append("    ssdDataCapacity: ").append(toIndentedString(ssdDataCapacity)).append("\n");
    sb.append("    ssdDataCapacityGt: ").append(toIndentedString(ssdDataCapacityGt)).append("\n");
    sb.append("    ssdDataCapacityGte: ").append(toIndentedString(ssdDataCapacityGte)).append("\n");
    sb.append("    ssdDataCapacityIn: ").append(toIndentedString(ssdDataCapacityIn)).append("\n");
    sb.append("    ssdDataCapacityLt: ").append(toIndentedString(ssdDataCapacityLt)).append("\n");
    sb.append("    ssdDataCapacityLte: ").append(toIndentedString(ssdDataCapacityLte)).append("\n");
    sb.append("    ssdDataCapacityNot: ").append(toIndentedString(ssdDataCapacityNot)).append("\n");
    sb.append("    ssdDataCapacityNotIn: ").append(toIndentedString(ssdDataCapacityNotIn)).append("\n");
    sb.append("    ssdDiskCount: ").append(toIndentedString(ssdDiskCount)).append("\n");
    sb.append("    ssdDiskCountGt: ").append(toIndentedString(ssdDiskCountGt)).append("\n");
    sb.append("    ssdDiskCountGte: ").append(toIndentedString(ssdDiskCountGte)).append("\n");
    sb.append("    ssdDiskCountIn: ").append(toIndentedString(ssdDiskCountIn)).append("\n");
    sb.append("    ssdDiskCountLt: ").append(toIndentedString(ssdDiskCountLt)).append("\n");
    sb.append("    ssdDiskCountLte: ").append(toIndentedString(ssdDiskCountLte)).append("\n");
    sb.append("    ssdDiskCountNot: ").append(toIndentedString(ssdDiskCountNot)).append("\n");
    sb.append("    ssdDiskCountNotIn: ").append(toIndentedString(ssdDiskCountNotIn)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    stateIn: ").append(toIndentedString(stateIn)).append("\n");
    sb.append("    stateNot: ").append(toIndentedString(stateNot)).append("\n");
    sb.append("    stateNotIn: ").append(toIndentedString(stateNotIn)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusIn: ").append(toIndentedString(statusIn)).append("\n");
    sb.append("    statusNot: ").append(toIndentedString(statusNot)).append("\n");
    sb.append("    statusNotIn: ").append(toIndentedString(statusNotIn)).append("\n");
    sb.append("    stoppedVmNum: ").append(toIndentedString(stoppedVmNum)).append("\n");
    sb.append("    stoppedVmNumGt: ").append(toIndentedString(stoppedVmNumGt)).append("\n");
    sb.append("    stoppedVmNumGte: ").append(toIndentedString(stoppedVmNumGte)).append("\n");
    sb.append("    stoppedVmNumIn: ").append(toIndentedString(stoppedVmNumIn)).append("\n");
    sb.append("    stoppedVmNumLt: ").append(toIndentedString(stoppedVmNumLt)).append("\n");
    sb.append("    stoppedVmNumLte: ").append(toIndentedString(stoppedVmNumLte)).append("\n");
    sb.append("    stoppedVmNumNot: ").append(toIndentedString(stoppedVmNumNot)).append("\n");
    sb.append("    stoppedVmNumNotIn: ").append(toIndentedString(stoppedVmNumNotIn)).append("\n");
    sb.append("    suspendedVmNum: ").append(toIndentedString(suspendedVmNum)).append("\n");
    sb.append("    suspendedVmNumGt: ").append(toIndentedString(suspendedVmNumGt)).append("\n");
    sb.append("    suspendedVmNumGte: ").append(toIndentedString(suspendedVmNumGte)).append("\n");
    sb.append("    suspendedVmNumIn: ").append(toIndentedString(suspendedVmNumIn)).append("\n");
    sb.append("    suspendedVmNumLt: ").append(toIndentedString(suspendedVmNumLt)).append("\n");
    sb.append("    suspendedVmNumLte: ").append(toIndentedString(suspendedVmNumLte)).append("\n");
    sb.append("    suspendedVmNumNot: ").append(toIndentedString(suspendedVmNumNot)).append("\n");
    sb.append("    suspendedVmNumNotIn: ").append(toIndentedString(suspendedVmNumNotIn)).append("\n");
    sb.append("    totalCacheCapacity: ").append(toIndentedString(totalCacheCapacity)).append("\n");
    sb.append("    totalCacheCapacityGt: ").append(toIndentedString(totalCacheCapacityGt)).append("\n");
    sb.append("    totalCacheCapacityGte: ").append(toIndentedString(totalCacheCapacityGte)).append("\n");
    sb.append("    totalCacheCapacityIn: ").append(toIndentedString(totalCacheCapacityIn)).append("\n");
    sb.append("    totalCacheCapacityLt: ").append(toIndentedString(totalCacheCapacityLt)).append("\n");
    sb.append("    totalCacheCapacityLte: ").append(toIndentedString(totalCacheCapacityLte)).append("\n");
    sb.append("    totalCacheCapacityNot: ").append(toIndentedString(totalCacheCapacityNot)).append("\n");
    sb.append("    totalCacheCapacityNotIn: ").append(toIndentedString(totalCacheCapacityNotIn)).append("\n");
    sb.append("    totalCpuCores: ").append(toIndentedString(totalCpuCores)).append("\n");
    sb.append("    totalCpuCoresGt: ").append(toIndentedString(totalCpuCoresGt)).append("\n");
    sb.append("    totalCpuCoresGte: ").append(toIndentedString(totalCpuCoresGte)).append("\n");
    sb.append("    totalCpuCoresIn: ").append(toIndentedString(totalCpuCoresIn)).append("\n");
    sb.append("    totalCpuCoresLt: ").append(toIndentedString(totalCpuCoresLt)).append("\n");
    sb.append("    totalCpuCoresLte: ").append(toIndentedString(totalCpuCoresLte)).append("\n");
    sb.append("    totalCpuCoresNot: ").append(toIndentedString(totalCpuCoresNot)).append("\n");
    sb.append("    totalCpuCoresNotIn: ").append(toIndentedString(totalCpuCoresNotIn)).append("\n");
    sb.append("    totalCpuHz: ").append(toIndentedString(totalCpuHz)).append("\n");
    sb.append("    totalCpuHzGt: ").append(toIndentedString(totalCpuHzGt)).append("\n");
    sb.append("    totalCpuHzGte: ").append(toIndentedString(totalCpuHzGte)).append("\n");
    sb.append("    totalCpuHzIn: ").append(toIndentedString(totalCpuHzIn)).append("\n");
    sb.append("    totalCpuHzLt: ").append(toIndentedString(totalCpuHzLt)).append("\n");
    sb.append("    totalCpuHzLte: ").append(toIndentedString(totalCpuHzLte)).append("\n");
    sb.append("    totalCpuHzNot: ").append(toIndentedString(totalCpuHzNot)).append("\n");
    sb.append("    totalCpuHzNotIn: ").append(toIndentedString(totalCpuHzNotIn)).append("\n");
    sb.append("    totalCpuSockets: ").append(toIndentedString(totalCpuSockets)).append("\n");
    sb.append("    totalCpuSocketsGt: ").append(toIndentedString(totalCpuSocketsGt)).append("\n");
    sb.append("    totalCpuSocketsGte: ").append(toIndentedString(totalCpuSocketsGte)).append("\n");
    sb.append("    totalCpuSocketsIn: ").append(toIndentedString(totalCpuSocketsIn)).append("\n");
    sb.append("    totalCpuSocketsLt: ").append(toIndentedString(totalCpuSocketsLt)).append("\n");
    sb.append("    totalCpuSocketsLte: ").append(toIndentedString(totalCpuSocketsLte)).append("\n");
    sb.append("    totalCpuSocketsNot: ").append(toIndentedString(totalCpuSocketsNot)).append("\n");
    sb.append("    totalCpuSocketsNotIn: ").append(toIndentedString(totalCpuSocketsNotIn)).append("\n");
    sb.append("    totalDataCapacity: ").append(toIndentedString(totalDataCapacity)).append("\n");
    sb.append("    totalDataCapacityGt: ").append(toIndentedString(totalDataCapacityGt)).append("\n");
    sb.append("    totalDataCapacityGte: ").append(toIndentedString(totalDataCapacityGte)).append("\n");
    sb.append("    totalDataCapacityIn: ").append(toIndentedString(totalDataCapacityIn)).append("\n");
    sb.append("    totalDataCapacityLt: ").append(toIndentedString(totalDataCapacityLt)).append("\n");
    sb.append("    totalDataCapacityLte: ").append(toIndentedString(totalDataCapacityLte)).append("\n");
    sb.append("    totalDataCapacityNot: ").append(toIndentedString(totalDataCapacityNot)).append("\n");
    sb.append("    totalDataCapacityNotIn: ").append(toIndentedString(totalDataCapacityNotIn)).append("\n");
    sb.append("    totalMemoryBytes: ").append(toIndentedString(totalMemoryBytes)).append("\n");
    sb.append("    totalMemoryBytesGt: ").append(toIndentedString(totalMemoryBytesGt)).append("\n");
    sb.append("    totalMemoryBytesGte: ").append(toIndentedString(totalMemoryBytesGte)).append("\n");
    sb.append("    totalMemoryBytesIn: ").append(toIndentedString(totalMemoryBytesIn)).append("\n");
    sb.append("    totalMemoryBytesLt: ").append(toIndentedString(totalMemoryBytesLt)).append("\n");
    sb.append("    totalMemoryBytesLte: ").append(toIndentedString(totalMemoryBytesLte)).append("\n");
    sb.append("    totalMemoryBytesNot: ").append(toIndentedString(totalMemoryBytesNot)).append("\n");
    sb.append("    totalMemoryBytesNotIn: ").append(toIndentedString(totalMemoryBytesNotIn)).append("\n");
    sb.append("    usbDevicesEvery: ").append(toIndentedString(usbDevicesEvery)).append("\n");
    sb.append("    usbDevicesNone: ").append(toIndentedString(usbDevicesNone)).append("\n");
    sb.append("    usbDevicesSome: ").append(toIndentedString(usbDevicesSome)).append("\n");
    sb.append("    usedCpuHz: ").append(toIndentedString(usedCpuHz)).append("\n");
    sb.append("    usedCpuHzGt: ").append(toIndentedString(usedCpuHzGt)).append("\n");
    sb.append("    usedCpuHzGte: ").append(toIndentedString(usedCpuHzGte)).append("\n");
    sb.append("    usedCpuHzIn: ").append(toIndentedString(usedCpuHzIn)).append("\n");
    sb.append("    usedCpuHzLt: ").append(toIndentedString(usedCpuHzLt)).append("\n");
    sb.append("    usedCpuHzLte: ").append(toIndentedString(usedCpuHzLte)).append("\n");
    sb.append("    usedCpuHzNot: ").append(toIndentedString(usedCpuHzNot)).append("\n");
    sb.append("    usedCpuHzNotIn: ").append(toIndentedString(usedCpuHzNotIn)).append("\n");
    sb.append("    usedDataSpace: ").append(toIndentedString(usedDataSpace)).append("\n");
    sb.append("    usedDataSpaceGt: ").append(toIndentedString(usedDataSpaceGt)).append("\n");
    sb.append("    usedDataSpaceGte: ").append(toIndentedString(usedDataSpaceGte)).append("\n");
    sb.append("    usedDataSpaceIn: ").append(toIndentedString(usedDataSpaceIn)).append("\n");
    sb.append("    usedDataSpaceLt: ").append(toIndentedString(usedDataSpaceLt)).append("\n");
    sb.append("    usedDataSpaceLte: ").append(toIndentedString(usedDataSpaceLte)).append("\n");
    sb.append("    usedDataSpaceNot: ").append(toIndentedString(usedDataSpaceNot)).append("\n");
    sb.append("    usedDataSpaceNotIn: ").append(toIndentedString(usedDataSpaceNotIn)).append("\n");
    sb.append("    usedMemoryBytes: ").append(toIndentedString(usedMemoryBytes)).append("\n");
    sb.append("    usedMemoryBytesGt: ").append(toIndentedString(usedMemoryBytesGt)).append("\n");
    sb.append("    usedMemoryBytesGte: ").append(toIndentedString(usedMemoryBytesGte)).append("\n");
    sb.append("    usedMemoryBytesIn: ").append(toIndentedString(usedMemoryBytesIn)).append("\n");
    sb.append("    usedMemoryBytesLt: ").append(toIndentedString(usedMemoryBytesLt)).append("\n");
    sb.append("    usedMemoryBytesLte: ").append(toIndentedString(usedMemoryBytesLte)).append("\n");
    sb.append("    usedMemoryBytesNot: ").append(toIndentedString(usedMemoryBytesNot)).append("\n");
    sb.append("    usedMemoryBytesNotIn: ").append(toIndentedString(usedMemoryBytesNotIn)).append("\n");
    sb.append("    vmNum: ").append(toIndentedString(vmNum)).append("\n");
    sb.append("    vmNumGt: ").append(toIndentedString(vmNumGt)).append("\n");
    sb.append("    vmNumGte: ").append(toIndentedString(vmNumGte)).append("\n");
    sb.append("    vmNumIn: ").append(toIndentedString(vmNumIn)).append("\n");
    sb.append("    vmNumLt: ").append(toIndentedString(vmNumLt)).append("\n");
    sb.append("    vmNumLte: ").append(toIndentedString(vmNumLte)).append("\n");
    sb.append("    vmNumNot: ").append(toIndentedString(vmNumNot)).append("\n");
    sb.append("    vmNumNotIn: ").append(toIndentedString(vmNumNotIn)).append("\n");
    sb.append("    vmotionIp: ").append(toIndentedString(vmotionIp)).append("\n");
    sb.append("    vmotionIpContains: ").append(toIndentedString(vmotionIpContains)).append("\n");
    sb.append("    vmotionIpEndsWith: ").append(toIndentedString(vmotionIpEndsWith)).append("\n");
    sb.append("    vmotionIpGt: ").append(toIndentedString(vmotionIpGt)).append("\n");
    sb.append("    vmotionIpGte: ").append(toIndentedString(vmotionIpGte)).append("\n");
    sb.append("    vmotionIpIn: ").append(toIndentedString(vmotionIpIn)).append("\n");
    sb.append("    vmotionIpLt: ").append(toIndentedString(vmotionIpLt)).append("\n");
    sb.append("    vmotionIpLte: ").append(toIndentedString(vmotionIpLte)).append("\n");
    sb.append("    vmotionIpNot: ").append(toIndentedString(vmotionIpNot)).append("\n");
    sb.append("    vmotionIpNotContains: ").append(toIndentedString(vmotionIpNotContains)).append("\n");
    sb.append("    vmotionIpNotEndsWith: ").append(toIndentedString(vmotionIpNotEndsWith)).append("\n");
    sb.append("    vmotionIpNotIn: ").append(toIndentedString(vmotionIpNotIn)).append("\n");
    sb.append("    vmotionIpNotStartsWith: ").append(toIndentedString(vmotionIpNotStartsWith)).append("\n");
    sb.append("    vmotionIpStartsWith: ").append(toIndentedString(vmotionIpStartsWith)).append("\n");
    sb.append("    vmsEvery: ").append(toIndentedString(vmsEvery)).append("\n");
    sb.append("    vmsNone: ").append(toIndentedString(vmsNone)).append("\n");
    sb.append("    vmsSome: ").append(toIndentedString(vmsSome)).append("\n");
    sb.append("    withFasterSsdAsCache: ").append(toIndentedString(withFasterSsdAsCache)).append("\n");
    sb.append("    withFasterSsdAsCacheNot: ").append(toIndentedString(withFasterSsdAsCacheNot)).append("\n");
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

