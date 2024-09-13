package com.arcfra.aoc.model;

import java.util.Objects;
import java.util.Arrays;
import com.arcfra.aoc.model.ClusterWhereInput;
import com.arcfra.aoc.model.LabelWhereInput;
import com.arcfra.aoc.model.OrganizationWhereInput;
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
 * DatacenterWhereInput
 */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class DatacenterWhereInput {
  public static final String SERIALIZED_NAME_A_N_D = "AND";
  @SerializedName(SERIALIZED_NAME_A_N_D)
  private List<DatacenterWhereInput> AND = null;

  public static final String SERIALIZED_NAME_N_O_T = "NOT";
  @SerializedName(SERIALIZED_NAME_N_O_T)
  private List<DatacenterWhereInput> NOT = null;

  public static final String SERIALIZED_NAME_O_R = "OR";
  @SerializedName(SERIALIZED_NAME_O_R)
  private List<DatacenterWhereInput> OR = null;

  public static final String SERIALIZED_NAME_CLUSTER_NUM = "cluster_num";
  @SerializedName(SERIALIZED_NAME_CLUSTER_NUM)
  private Integer clusterNum;

  public static final String SERIALIZED_NAME_CLUSTER_NUM_GT = "cluster_num_gt";
  @SerializedName(SERIALIZED_NAME_CLUSTER_NUM_GT)
  private Integer clusterNumGt;

  public static final String SERIALIZED_NAME_CLUSTER_NUM_GTE = "cluster_num_gte";
  @SerializedName(SERIALIZED_NAME_CLUSTER_NUM_GTE)
  private Integer clusterNumGte;

  public static final String SERIALIZED_NAME_CLUSTER_NUM_IN = "cluster_num_in";
  @SerializedName(SERIALIZED_NAME_CLUSTER_NUM_IN)
  private List<Integer> clusterNumIn = null;

  public static final String SERIALIZED_NAME_CLUSTER_NUM_LT = "cluster_num_lt";
  @SerializedName(SERIALIZED_NAME_CLUSTER_NUM_LT)
  private Integer clusterNumLt;

  public static final String SERIALIZED_NAME_CLUSTER_NUM_LTE = "cluster_num_lte";
  @SerializedName(SERIALIZED_NAME_CLUSTER_NUM_LTE)
  private Integer clusterNumLte;

  public static final String SERIALIZED_NAME_CLUSTER_NUM_NOT = "cluster_num_not";
  @SerializedName(SERIALIZED_NAME_CLUSTER_NUM_NOT)
  private Integer clusterNumNot;

  public static final String SERIALIZED_NAME_CLUSTER_NUM_NOT_IN = "cluster_num_not_in";
  @SerializedName(SERIALIZED_NAME_CLUSTER_NUM_NOT_IN)
  private List<Integer> clusterNumNotIn = null;

  public static final String SERIALIZED_NAME_CLUSTERS_EVERY = "clusters_every";
  @SerializedName(SERIALIZED_NAME_CLUSTERS_EVERY)
  private ClusterWhereInput clustersEvery;

  public static final String SERIALIZED_NAME_CLUSTERS_NONE = "clusters_none";
  @SerializedName(SERIALIZED_NAME_CLUSTERS_NONE)
  private ClusterWhereInput clustersNone;

  public static final String SERIALIZED_NAME_CLUSTERS_SOME = "clusters_some";
  @SerializedName(SERIALIZED_NAME_CLUSTERS_SOME)
  private ClusterWhereInput clustersSome;

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

  public static final String SERIALIZED_NAME_HOST_NUM = "host_num";
  @SerializedName(SERIALIZED_NAME_HOST_NUM)
  private Integer hostNum;

  public static final String SERIALIZED_NAME_HOST_NUM_GT = "host_num_gt";
  @SerializedName(SERIALIZED_NAME_HOST_NUM_GT)
  private Integer hostNumGt;

  public static final String SERIALIZED_NAME_HOST_NUM_GTE = "host_num_gte";
  @SerializedName(SERIALIZED_NAME_HOST_NUM_GTE)
  private Integer hostNumGte;

  public static final String SERIALIZED_NAME_HOST_NUM_IN = "host_num_in";
  @SerializedName(SERIALIZED_NAME_HOST_NUM_IN)
  private List<Integer> hostNumIn = null;

  public static final String SERIALIZED_NAME_HOST_NUM_LT = "host_num_lt";
  @SerializedName(SERIALIZED_NAME_HOST_NUM_LT)
  private Integer hostNumLt;

  public static final String SERIALIZED_NAME_HOST_NUM_LTE = "host_num_lte";
  @SerializedName(SERIALIZED_NAME_HOST_NUM_LTE)
  private Integer hostNumLte;

  public static final String SERIALIZED_NAME_HOST_NUM_NOT = "host_num_not";
  @SerializedName(SERIALIZED_NAME_HOST_NUM_NOT)
  private Integer hostNumNot;

  public static final String SERIALIZED_NAME_HOST_NUM_NOT_IN = "host_num_not_in";
  @SerializedName(SERIALIZED_NAME_HOST_NUM_NOT_IN)
  private List<Integer> hostNumNotIn = null;

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

  public static final String SERIALIZED_NAME_LABELS_EVERY = "labels_every";
  @SerializedName(SERIALIZED_NAME_LABELS_EVERY)
  private LabelWhereInput labelsEvery;

  public static final String SERIALIZED_NAME_LABELS_NONE = "labels_none";
  @SerializedName(SERIALIZED_NAME_LABELS_NONE)
  private LabelWhereInput labelsNone;

  public static final String SERIALIZED_NAME_LABELS_SOME = "labels_some";
  @SerializedName(SERIALIZED_NAME_LABELS_SOME)
  private LabelWhereInput labelsSome;

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

  public static final String SERIALIZED_NAME_ORGANIZATION = "organization";
  @SerializedName(SERIALIZED_NAME_ORGANIZATION)
  private OrganizationWhereInput organization;

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

  public DatacenterWhereInput() { 
  }

  public DatacenterWhereInput AND(List<DatacenterWhereInput> AND) {
    
    this.AND = AND;
    return this;
  }

  public DatacenterWhereInput addANDItem(DatacenterWhereInput ANDItem) {
    if (this.AND == null) {
      this.AND = new ArrayList<DatacenterWhereInput>();
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

  public List<DatacenterWhereInput> getAND() {
    return AND;
  }


  public void setAND(List<DatacenterWhereInput> AND) {
    this.AND = AND;
  }


  public DatacenterWhereInput NOT(List<DatacenterWhereInput> NOT) {
    
    this.NOT = NOT;
    return this;
  }

  public DatacenterWhereInput addNOTItem(DatacenterWhereInput NOTItem) {
    if (this.NOT == null) {
      this.NOT = new ArrayList<DatacenterWhereInput>();
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

  public List<DatacenterWhereInput> getNOT() {
    return NOT;
  }


  public void setNOT(List<DatacenterWhereInput> NOT) {
    this.NOT = NOT;
  }


  public DatacenterWhereInput OR(List<DatacenterWhereInput> OR) {
    
    this.OR = OR;
    return this;
  }

  public DatacenterWhereInput addORItem(DatacenterWhereInput ORItem) {
    if (this.OR == null) {
      this.OR = new ArrayList<DatacenterWhereInput>();
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

  public List<DatacenterWhereInput> getOR() {
    return OR;
  }


  public void setOR(List<DatacenterWhereInput> OR) {
    this.OR = OR;
  }


  public DatacenterWhereInput clusterNum(Integer clusterNum) {
    
    this.clusterNum = clusterNum;
    return this;
  }

   /**
   * Get clusterNum
   * @return clusterNum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getClusterNum() {
    return clusterNum;
  }


  public void setClusterNum(Integer clusterNum) {
    this.clusterNum = clusterNum;
  }


  public DatacenterWhereInput clusterNumGt(Integer clusterNumGt) {
    
    this.clusterNumGt = clusterNumGt;
    return this;
  }

   /**
   * Get clusterNumGt
   * @return clusterNumGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getClusterNumGt() {
    return clusterNumGt;
  }


  public void setClusterNumGt(Integer clusterNumGt) {
    this.clusterNumGt = clusterNumGt;
  }


  public DatacenterWhereInput clusterNumGte(Integer clusterNumGte) {
    
    this.clusterNumGte = clusterNumGte;
    return this;
  }

   /**
   * Get clusterNumGte
   * @return clusterNumGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getClusterNumGte() {
    return clusterNumGte;
  }


  public void setClusterNumGte(Integer clusterNumGte) {
    this.clusterNumGte = clusterNumGte;
  }


  public DatacenterWhereInput clusterNumIn(List<Integer> clusterNumIn) {
    
    this.clusterNumIn = clusterNumIn;
    return this;
  }

  public DatacenterWhereInput addClusterNumInItem(Integer clusterNumInItem) {
    if (this.clusterNumIn == null) {
      this.clusterNumIn = new ArrayList<Integer>();
    }
    this.clusterNumIn.add(clusterNumInItem);
    return this;
  }

   /**
   * Get clusterNumIn
   * @return clusterNumIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Integer> getClusterNumIn() {
    return clusterNumIn;
  }


  public void setClusterNumIn(List<Integer> clusterNumIn) {
    this.clusterNumIn = clusterNumIn;
  }


  public DatacenterWhereInput clusterNumLt(Integer clusterNumLt) {
    
    this.clusterNumLt = clusterNumLt;
    return this;
  }

   /**
   * Get clusterNumLt
   * @return clusterNumLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getClusterNumLt() {
    return clusterNumLt;
  }


  public void setClusterNumLt(Integer clusterNumLt) {
    this.clusterNumLt = clusterNumLt;
  }


  public DatacenterWhereInput clusterNumLte(Integer clusterNumLte) {
    
    this.clusterNumLte = clusterNumLte;
    return this;
  }

   /**
   * Get clusterNumLte
   * @return clusterNumLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getClusterNumLte() {
    return clusterNumLte;
  }


  public void setClusterNumLte(Integer clusterNumLte) {
    this.clusterNumLte = clusterNumLte;
  }


  public DatacenterWhereInput clusterNumNot(Integer clusterNumNot) {
    
    this.clusterNumNot = clusterNumNot;
    return this;
  }

   /**
   * Get clusterNumNot
   * @return clusterNumNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getClusterNumNot() {
    return clusterNumNot;
  }


  public void setClusterNumNot(Integer clusterNumNot) {
    this.clusterNumNot = clusterNumNot;
  }


  public DatacenterWhereInput clusterNumNotIn(List<Integer> clusterNumNotIn) {
    
    this.clusterNumNotIn = clusterNumNotIn;
    return this;
  }

  public DatacenterWhereInput addClusterNumNotInItem(Integer clusterNumNotInItem) {
    if (this.clusterNumNotIn == null) {
      this.clusterNumNotIn = new ArrayList<Integer>();
    }
    this.clusterNumNotIn.add(clusterNumNotInItem);
    return this;
  }

   /**
   * Get clusterNumNotIn
   * @return clusterNumNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Integer> getClusterNumNotIn() {
    return clusterNumNotIn;
  }


  public void setClusterNumNotIn(List<Integer> clusterNumNotIn) {
    this.clusterNumNotIn = clusterNumNotIn;
  }


  public DatacenterWhereInput clustersEvery(ClusterWhereInput clustersEvery) {
    
    this.clustersEvery = clustersEvery;
    return this;
  }

   /**
   * Get clustersEvery
   * @return clustersEvery
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ClusterWhereInput getClustersEvery() {
    return clustersEvery;
  }


  public void setClustersEvery(ClusterWhereInput clustersEvery) {
    this.clustersEvery = clustersEvery;
  }


  public DatacenterWhereInput clustersNone(ClusterWhereInput clustersNone) {
    
    this.clustersNone = clustersNone;
    return this;
  }

   /**
   * Get clustersNone
   * @return clustersNone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ClusterWhereInput getClustersNone() {
    return clustersNone;
  }


  public void setClustersNone(ClusterWhereInput clustersNone) {
    this.clustersNone = clustersNone;
  }


  public DatacenterWhereInput clustersSome(ClusterWhereInput clustersSome) {
    
    this.clustersSome = clustersSome;
    return this;
  }

   /**
   * Get clustersSome
   * @return clustersSome
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ClusterWhereInput getClustersSome() {
    return clustersSome;
  }


  public void setClustersSome(ClusterWhereInput clustersSome) {
    this.clustersSome = clustersSome;
  }


  public DatacenterWhereInput failureDataSpace(Long failureDataSpace) {
    
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


  public DatacenterWhereInput failureDataSpaceGt(Long failureDataSpaceGt) {
    
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


  public DatacenterWhereInput failureDataSpaceGte(Long failureDataSpaceGte) {
    
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


  public DatacenterWhereInput failureDataSpaceIn(List<Long> failureDataSpaceIn) {
    
    this.failureDataSpaceIn = failureDataSpaceIn;
    return this;
  }

  public DatacenterWhereInput addFailureDataSpaceInItem(Long failureDataSpaceInItem) {
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


  public DatacenterWhereInput failureDataSpaceLt(Long failureDataSpaceLt) {
    
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


  public DatacenterWhereInput failureDataSpaceLte(Long failureDataSpaceLte) {
    
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


  public DatacenterWhereInput failureDataSpaceNot(Long failureDataSpaceNot) {
    
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


  public DatacenterWhereInput failureDataSpaceNotIn(List<Long> failureDataSpaceNotIn) {
    
    this.failureDataSpaceNotIn = failureDataSpaceNotIn;
    return this;
  }

  public DatacenterWhereInput addFailureDataSpaceNotInItem(Long failureDataSpaceNotInItem) {
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


  public DatacenterWhereInput hostNum(Integer hostNum) {
    
    this.hostNum = hostNum;
    return this;
  }

   /**
   * Get hostNum
   * @return hostNum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getHostNum() {
    return hostNum;
  }


  public void setHostNum(Integer hostNum) {
    this.hostNum = hostNum;
  }


  public DatacenterWhereInput hostNumGt(Integer hostNumGt) {
    
    this.hostNumGt = hostNumGt;
    return this;
  }

   /**
   * Get hostNumGt
   * @return hostNumGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getHostNumGt() {
    return hostNumGt;
  }


  public void setHostNumGt(Integer hostNumGt) {
    this.hostNumGt = hostNumGt;
  }


  public DatacenterWhereInput hostNumGte(Integer hostNumGte) {
    
    this.hostNumGte = hostNumGte;
    return this;
  }

   /**
   * Get hostNumGte
   * @return hostNumGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getHostNumGte() {
    return hostNumGte;
  }


  public void setHostNumGte(Integer hostNumGte) {
    this.hostNumGte = hostNumGte;
  }


  public DatacenterWhereInput hostNumIn(List<Integer> hostNumIn) {
    
    this.hostNumIn = hostNumIn;
    return this;
  }

  public DatacenterWhereInput addHostNumInItem(Integer hostNumInItem) {
    if (this.hostNumIn == null) {
      this.hostNumIn = new ArrayList<Integer>();
    }
    this.hostNumIn.add(hostNumInItem);
    return this;
  }

   /**
   * Get hostNumIn
   * @return hostNumIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Integer> getHostNumIn() {
    return hostNumIn;
  }


  public void setHostNumIn(List<Integer> hostNumIn) {
    this.hostNumIn = hostNumIn;
  }


  public DatacenterWhereInput hostNumLt(Integer hostNumLt) {
    
    this.hostNumLt = hostNumLt;
    return this;
  }

   /**
   * Get hostNumLt
   * @return hostNumLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getHostNumLt() {
    return hostNumLt;
  }


  public void setHostNumLt(Integer hostNumLt) {
    this.hostNumLt = hostNumLt;
  }


  public DatacenterWhereInput hostNumLte(Integer hostNumLte) {
    
    this.hostNumLte = hostNumLte;
    return this;
  }

   /**
   * Get hostNumLte
   * @return hostNumLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getHostNumLte() {
    return hostNumLte;
  }


  public void setHostNumLte(Integer hostNumLte) {
    this.hostNumLte = hostNumLte;
  }


  public DatacenterWhereInput hostNumNot(Integer hostNumNot) {
    
    this.hostNumNot = hostNumNot;
    return this;
  }

   /**
   * Get hostNumNot
   * @return hostNumNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getHostNumNot() {
    return hostNumNot;
  }


  public void setHostNumNot(Integer hostNumNot) {
    this.hostNumNot = hostNumNot;
  }


  public DatacenterWhereInput hostNumNotIn(List<Integer> hostNumNotIn) {
    
    this.hostNumNotIn = hostNumNotIn;
    return this;
  }

  public DatacenterWhereInput addHostNumNotInItem(Integer hostNumNotInItem) {
    if (this.hostNumNotIn == null) {
      this.hostNumNotIn = new ArrayList<Integer>();
    }
    this.hostNumNotIn.add(hostNumNotInItem);
    return this;
  }

   /**
   * Get hostNumNotIn
   * @return hostNumNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Integer> getHostNumNotIn() {
    return hostNumNotIn;
  }


  public void setHostNumNotIn(List<Integer> hostNumNotIn) {
    this.hostNumNotIn = hostNumNotIn;
  }


  public DatacenterWhereInput id(String id) {
    
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


  public DatacenterWhereInput idContains(String idContains) {
    
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


  public DatacenterWhereInput idEndsWith(String idEndsWith) {
    
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


  public DatacenterWhereInput idGt(String idGt) {
    
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


  public DatacenterWhereInput idGte(String idGte) {
    
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


  public DatacenterWhereInput idIn(List<String> idIn) {
    
    this.idIn = idIn;
    return this;
  }

  public DatacenterWhereInput addIdInItem(String idInItem) {
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


  public DatacenterWhereInput idLt(String idLt) {
    
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


  public DatacenterWhereInput idLte(String idLte) {
    
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


  public DatacenterWhereInput idNot(String idNot) {
    
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


  public DatacenterWhereInput idNotContains(String idNotContains) {
    
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


  public DatacenterWhereInput idNotEndsWith(String idNotEndsWith) {
    
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


  public DatacenterWhereInput idNotIn(List<String> idNotIn) {
    
    this.idNotIn = idNotIn;
    return this;
  }

  public DatacenterWhereInput addIdNotInItem(String idNotInItem) {
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


  public DatacenterWhereInput idNotStartsWith(String idNotStartsWith) {
    
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


  public DatacenterWhereInput idStartsWith(String idStartsWith) {
    
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


  public DatacenterWhereInput labelsEvery(LabelWhereInput labelsEvery) {
    
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


  public DatacenterWhereInput labelsNone(LabelWhereInput labelsNone) {
    
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


  public DatacenterWhereInput labelsSome(LabelWhereInput labelsSome) {
    
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


  public DatacenterWhereInput name(String name) {
    
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


  public DatacenterWhereInput nameContains(String nameContains) {
    
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


  public DatacenterWhereInput nameEndsWith(String nameEndsWith) {
    
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


  public DatacenterWhereInput nameGt(String nameGt) {
    
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


  public DatacenterWhereInput nameGte(String nameGte) {
    
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


  public DatacenterWhereInput nameIn(List<String> nameIn) {
    
    this.nameIn = nameIn;
    return this;
  }

  public DatacenterWhereInput addNameInItem(String nameInItem) {
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


  public DatacenterWhereInput nameLt(String nameLt) {
    
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


  public DatacenterWhereInput nameLte(String nameLte) {
    
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


  public DatacenterWhereInput nameNot(String nameNot) {
    
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


  public DatacenterWhereInput nameNotContains(String nameNotContains) {
    
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


  public DatacenterWhereInput nameNotEndsWith(String nameNotEndsWith) {
    
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


  public DatacenterWhereInput nameNotIn(List<String> nameNotIn) {
    
    this.nameNotIn = nameNotIn;
    return this;
  }

  public DatacenterWhereInput addNameNotInItem(String nameNotInItem) {
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


  public DatacenterWhereInput nameNotStartsWith(String nameNotStartsWith) {
    
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


  public DatacenterWhereInput nameStartsWith(String nameStartsWith) {
    
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


  public DatacenterWhereInput organization(OrganizationWhereInput organization) {
    
    this.organization = organization;
    return this;
  }

   /**
   * Get organization
   * @return organization
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OrganizationWhereInput getOrganization() {
    return organization;
  }


  public void setOrganization(OrganizationWhereInput organization) {
    this.organization = organization;
  }


  public DatacenterWhereInput totalCpuHz(Long totalCpuHz) {
    
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


  public DatacenterWhereInput totalCpuHzGt(Long totalCpuHzGt) {
    
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


  public DatacenterWhereInput totalCpuHzGte(Long totalCpuHzGte) {
    
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


  public DatacenterWhereInput totalCpuHzIn(List<Long> totalCpuHzIn) {
    
    this.totalCpuHzIn = totalCpuHzIn;
    return this;
  }

  public DatacenterWhereInput addTotalCpuHzInItem(Long totalCpuHzInItem) {
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


  public DatacenterWhereInput totalCpuHzLt(Long totalCpuHzLt) {
    
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


  public DatacenterWhereInput totalCpuHzLte(Long totalCpuHzLte) {
    
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


  public DatacenterWhereInput totalCpuHzNot(Long totalCpuHzNot) {
    
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


  public DatacenterWhereInput totalCpuHzNotIn(List<Long> totalCpuHzNotIn) {
    
    this.totalCpuHzNotIn = totalCpuHzNotIn;
    return this;
  }

  public DatacenterWhereInput addTotalCpuHzNotInItem(Long totalCpuHzNotInItem) {
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


  public DatacenterWhereInput totalDataCapacity(Long totalDataCapacity) {
    
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


  public DatacenterWhereInput totalDataCapacityGt(Long totalDataCapacityGt) {
    
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


  public DatacenterWhereInput totalDataCapacityGte(Long totalDataCapacityGte) {
    
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


  public DatacenterWhereInput totalDataCapacityIn(List<Long> totalDataCapacityIn) {
    
    this.totalDataCapacityIn = totalDataCapacityIn;
    return this;
  }

  public DatacenterWhereInput addTotalDataCapacityInItem(Long totalDataCapacityInItem) {
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


  public DatacenterWhereInput totalDataCapacityLt(Long totalDataCapacityLt) {
    
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


  public DatacenterWhereInput totalDataCapacityLte(Long totalDataCapacityLte) {
    
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


  public DatacenterWhereInput totalDataCapacityNot(Long totalDataCapacityNot) {
    
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


  public DatacenterWhereInput totalDataCapacityNotIn(List<Long> totalDataCapacityNotIn) {
    
    this.totalDataCapacityNotIn = totalDataCapacityNotIn;
    return this;
  }

  public DatacenterWhereInput addTotalDataCapacityNotInItem(Long totalDataCapacityNotInItem) {
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


  public DatacenterWhereInput totalMemoryBytes(Long totalMemoryBytes) {
    
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


  public DatacenterWhereInput totalMemoryBytesGt(Long totalMemoryBytesGt) {
    
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


  public DatacenterWhereInput totalMemoryBytesGte(Long totalMemoryBytesGte) {
    
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


  public DatacenterWhereInput totalMemoryBytesIn(List<Long> totalMemoryBytesIn) {
    
    this.totalMemoryBytesIn = totalMemoryBytesIn;
    return this;
  }

  public DatacenterWhereInput addTotalMemoryBytesInItem(Long totalMemoryBytesInItem) {
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


  public DatacenterWhereInput totalMemoryBytesLt(Long totalMemoryBytesLt) {
    
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


  public DatacenterWhereInput totalMemoryBytesLte(Long totalMemoryBytesLte) {
    
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


  public DatacenterWhereInput totalMemoryBytesNot(Long totalMemoryBytesNot) {
    
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


  public DatacenterWhereInput totalMemoryBytesNotIn(List<Long> totalMemoryBytesNotIn) {
    
    this.totalMemoryBytesNotIn = totalMemoryBytesNotIn;
    return this;
  }

  public DatacenterWhereInput addTotalMemoryBytesNotInItem(Long totalMemoryBytesNotInItem) {
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


  public DatacenterWhereInput usedCpuHz(Double usedCpuHz) {
    
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


  public DatacenterWhereInput usedCpuHzGt(Double usedCpuHzGt) {
    
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


  public DatacenterWhereInput usedCpuHzGte(Double usedCpuHzGte) {
    
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


  public DatacenterWhereInput usedCpuHzIn(List<Double> usedCpuHzIn) {
    
    this.usedCpuHzIn = usedCpuHzIn;
    return this;
  }

  public DatacenterWhereInput addUsedCpuHzInItem(Double usedCpuHzInItem) {
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


  public DatacenterWhereInput usedCpuHzLt(Double usedCpuHzLt) {
    
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


  public DatacenterWhereInput usedCpuHzLte(Double usedCpuHzLte) {
    
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


  public DatacenterWhereInput usedCpuHzNot(Double usedCpuHzNot) {
    
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


  public DatacenterWhereInput usedCpuHzNotIn(List<Double> usedCpuHzNotIn) {
    
    this.usedCpuHzNotIn = usedCpuHzNotIn;
    return this;
  }

  public DatacenterWhereInput addUsedCpuHzNotInItem(Double usedCpuHzNotInItem) {
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


  public DatacenterWhereInput usedDataSpace(Long usedDataSpace) {
    
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


  public DatacenterWhereInput usedDataSpaceGt(Long usedDataSpaceGt) {
    
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


  public DatacenterWhereInput usedDataSpaceGte(Long usedDataSpaceGte) {
    
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


  public DatacenterWhereInput usedDataSpaceIn(List<Long> usedDataSpaceIn) {
    
    this.usedDataSpaceIn = usedDataSpaceIn;
    return this;
  }

  public DatacenterWhereInput addUsedDataSpaceInItem(Long usedDataSpaceInItem) {
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


  public DatacenterWhereInput usedDataSpaceLt(Long usedDataSpaceLt) {
    
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


  public DatacenterWhereInput usedDataSpaceLte(Long usedDataSpaceLte) {
    
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


  public DatacenterWhereInput usedDataSpaceNot(Long usedDataSpaceNot) {
    
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


  public DatacenterWhereInput usedDataSpaceNotIn(List<Long> usedDataSpaceNotIn) {
    
    this.usedDataSpaceNotIn = usedDataSpaceNotIn;
    return this;
  }

  public DatacenterWhereInput addUsedDataSpaceNotInItem(Long usedDataSpaceNotInItem) {
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


  public DatacenterWhereInput usedMemoryBytes(Double usedMemoryBytes) {
    
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


  public DatacenterWhereInput usedMemoryBytesGt(Double usedMemoryBytesGt) {
    
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


  public DatacenterWhereInput usedMemoryBytesGte(Double usedMemoryBytesGte) {
    
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


  public DatacenterWhereInput usedMemoryBytesIn(List<Double> usedMemoryBytesIn) {
    
    this.usedMemoryBytesIn = usedMemoryBytesIn;
    return this;
  }

  public DatacenterWhereInput addUsedMemoryBytesInItem(Double usedMemoryBytesInItem) {
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


  public DatacenterWhereInput usedMemoryBytesLt(Double usedMemoryBytesLt) {
    
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


  public DatacenterWhereInput usedMemoryBytesLte(Double usedMemoryBytesLte) {
    
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


  public DatacenterWhereInput usedMemoryBytesNot(Double usedMemoryBytesNot) {
    
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


  public DatacenterWhereInput usedMemoryBytesNotIn(List<Double> usedMemoryBytesNotIn) {
    
    this.usedMemoryBytesNotIn = usedMemoryBytesNotIn;
    return this;
  }

  public DatacenterWhereInput addUsedMemoryBytesNotInItem(Double usedMemoryBytesNotInItem) {
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


  public DatacenterWhereInput vmNum(Integer vmNum) {
    
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


  public DatacenterWhereInput vmNumGt(Integer vmNumGt) {
    
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


  public DatacenterWhereInput vmNumGte(Integer vmNumGte) {
    
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


  public DatacenterWhereInput vmNumIn(List<Integer> vmNumIn) {
    
    this.vmNumIn = vmNumIn;
    return this;
  }

  public DatacenterWhereInput addVmNumInItem(Integer vmNumInItem) {
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


  public DatacenterWhereInput vmNumLt(Integer vmNumLt) {
    
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


  public DatacenterWhereInput vmNumLte(Integer vmNumLte) {
    
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


  public DatacenterWhereInput vmNumNot(Integer vmNumNot) {
    
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


  public DatacenterWhereInput vmNumNotIn(List<Integer> vmNumNotIn) {
    
    this.vmNumNotIn = vmNumNotIn;
    return this;
  }

  public DatacenterWhereInput addVmNumNotInItem(Integer vmNumNotInItem) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DatacenterWhereInput datacenterWhereInput = (DatacenterWhereInput) o;
    return Objects.equals(this.AND, datacenterWhereInput.AND) &&
        Objects.equals(this.NOT, datacenterWhereInput.NOT) &&
        Objects.equals(this.OR, datacenterWhereInput.OR) &&
        Objects.equals(this.clusterNum, datacenterWhereInput.clusterNum) &&
        Objects.equals(this.clusterNumGt, datacenterWhereInput.clusterNumGt) &&
        Objects.equals(this.clusterNumGte, datacenterWhereInput.clusterNumGte) &&
        Objects.equals(this.clusterNumIn, datacenterWhereInput.clusterNumIn) &&
        Objects.equals(this.clusterNumLt, datacenterWhereInput.clusterNumLt) &&
        Objects.equals(this.clusterNumLte, datacenterWhereInput.clusterNumLte) &&
        Objects.equals(this.clusterNumNot, datacenterWhereInput.clusterNumNot) &&
        Objects.equals(this.clusterNumNotIn, datacenterWhereInput.clusterNumNotIn) &&
        Objects.equals(this.clustersEvery, datacenterWhereInput.clustersEvery) &&
        Objects.equals(this.clustersNone, datacenterWhereInput.clustersNone) &&
        Objects.equals(this.clustersSome, datacenterWhereInput.clustersSome) &&
        Objects.equals(this.failureDataSpace, datacenterWhereInput.failureDataSpace) &&
        Objects.equals(this.failureDataSpaceGt, datacenterWhereInput.failureDataSpaceGt) &&
        Objects.equals(this.failureDataSpaceGte, datacenterWhereInput.failureDataSpaceGte) &&
        Objects.equals(this.failureDataSpaceIn, datacenterWhereInput.failureDataSpaceIn) &&
        Objects.equals(this.failureDataSpaceLt, datacenterWhereInput.failureDataSpaceLt) &&
        Objects.equals(this.failureDataSpaceLte, datacenterWhereInput.failureDataSpaceLte) &&
        Objects.equals(this.failureDataSpaceNot, datacenterWhereInput.failureDataSpaceNot) &&
        Objects.equals(this.failureDataSpaceNotIn, datacenterWhereInput.failureDataSpaceNotIn) &&
        Objects.equals(this.hostNum, datacenterWhereInput.hostNum) &&
        Objects.equals(this.hostNumGt, datacenterWhereInput.hostNumGt) &&
        Objects.equals(this.hostNumGte, datacenterWhereInput.hostNumGte) &&
        Objects.equals(this.hostNumIn, datacenterWhereInput.hostNumIn) &&
        Objects.equals(this.hostNumLt, datacenterWhereInput.hostNumLt) &&
        Objects.equals(this.hostNumLte, datacenterWhereInput.hostNumLte) &&
        Objects.equals(this.hostNumNot, datacenterWhereInput.hostNumNot) &&
        Objects.equals(this.hostNumNotIn, datacenterWhereInput.hostNumNotIn) &&
        Objects.equals(this.id, datacenterWhereInput.id) &&
        Objects.equals(this.idContains, datacenterWhereInput.idContains) &&
        Objects.equals(this.idEndsWith, datacenterWhereInput.idEndsWith) &&
        Objects.equals(this.idGt, datacenterWhereInput.idGt) &&
        Objects.equals(this.idGte, datacenterWhereInput.idGte) &&
        Objects.equals(this.idIn, datacenterWhereInput.idIn) &&
        Objects.equals(this.idLt, datacenterWhereInput.idLt) &&
        Objects.equals(this.idLte, datacenterWhereInput.idLte) &&
        Objects.equals(this.idNot, datacenterWhereInput.idNot) &&
        Objects.equals(this.idNotContains, datacenterWhereInput.idNotContains) &&
        Objects.equals(this.idNotEndsWith, datacenterWhereInput.idNotEndsWith) &&
        Objects.equals(this.idNotIn, datacenterWhereInput.idNotIn) &&
        Objects.equals(this.idNotStartsWith, datacenterWhereInput.idNotStartsWith) &&
        Objects.equals(this.idStartsWith, datacenterWhereInput.idStartsWith) &&
        Objects.equals(this.labelsEvery, datacenterWhereInput.labelsEvery) &&
        Objects.equals(this.labelsNone, datacenterWhereInput.labelsNone) &&
        Objects.equals(this.labelsSome, datacenterWhereInput.labelsSome) &&
        Objects.equals(this.name, datacenterWhereInput.name) &&
        Objects.equals(this.nameContains, datacenterWhereInput.nameContains) &&
        Objects.equals(this.nameEndsWith, datacenterWhereInput.nameEndsWith) &&
        Objects.equals(this.nameGt, datacenterWhereInput.nameGt) &&
        Objects.equals(this.nameGte, datacenterWhereInput.nameGte) &&
        Objects.equals(this.nameIn, datacenterWhereInput.nameIn) &&
        Objects.equals(this.nameLt, datacenterWhereInput.nameLt) &&
        Objects.equals(this.nameLte, datacenterWhereInput.nameLte) &&
        Objects.equals(this.nameNot, datacenterWhereInput.nameNot) &&
        Objects.equals(this.nameNotContains, datacenterWhereInput.nameNotContains) &&
        Objects.equals(this.nameNotEndsWith, datacenterWhereInput.nameNotEndsWith) &&
        Objects.equals(this.nameNotIn, datacenterWhereInput.nameNotIn) &&
        Objects.equals(this.nameNotStartsWith, datacenterWhereInput.nameNotStartsWith) &&
        Objects.equals(this.nameStartsWith, datacenterWhereInput.nameStartsWith) &&
        Objects.equals(this.organization, datacenterWhereInput.organization) &&
        Objects.equals(this.totalCpuHz, datacenterWhereInput.totalCpuHz) &&
        Objects.equals(this.totalCpuHzGt, datacenterWhereInput.totalCpuHzGt) &&
        Objects.equals(this.totalCpuHzGte, datacenterWhereInput.totalCpuHzGte) &&
        Objects.equals(this.totalCpuHzIn, datacenterWhereInput.totalCpuHzIn) &&
        Objects.equals(this.totalCpuHzLt, datacenterWhereInput.totalCpuHzLt) &&
        Objects.equals(this.totalCpuHzLte, datacenterWhereInput.totalCpuHzLte) &&
        Objects.equals(this.totalCpuHzNot, datacenterWhereInput.totalCpuHzNot) &&
        Objects.equals(this.totalCpuHzNotIn, datacenterWhereInput.totalCpuHzNotIn) &&
        Objects.equals(this.totalDataCapacity, datacenterWhereInput.totalDataCapacity) &&
        Objects.equals(this.totalDataCapacityGt, datacenterWhereInput.totalDataCapacityGt) &&
        Objects.equals(this.totalDataCapacityGte, datacenterWhereInput.totalDataCapacityGte) &&
        Objects.equals(this.totalDataCapacityIn, datacenterWhereInput.totalDataCapacityIn) &&
        Objects.equals(this.totalDataCapacityLt, datacenterWhereInput.totalDataCapacityLt) &&
        Objects.equals(this.totalDataCapacityLte, datacenterWhereInput.totalDataCapacityLte) &&
        Objects.equals(this.totalDataCapacityNot, datacenterWhereInput.totalDataCapacityNot) &&
        Objects.equals(this.totalDataCapacityNotIn, datacenterWhereInput.totalDataCapacityNotIn) &&
        Objects.equals(this.totalMemoryBytes, datacenterWhereInput.totalMemoryBytes) &&
        Objects.equals(this.totalMemoryBytesGt, datacenterWhereInput.totalMemoryBytesGt) &&
        Objects.equals(this.totalMemoryBytesGte, datacenterWhereInput.totalMemoryBytesGte) &&
        Objects.equals(this.totalMemoryBytesIn, datacenterWhereInput.totalMemoryBytesIn) &&
        Objects.equals(this.totalMemoryBytesLt, datacenterWhereInput.totalMemoryBytesLt) &&
        Objects.equals(this.totalMemoryBytesLte, datacenterWhereInput.totalMemoryBytesLte) &&
        Objects.equals(this.totalMemoryBytesNot, datacenterWhereInput.totalMemoryBytesNot) &&
        Objects.equals(this.totalMemoryBytesNotIn, datacenterWhereInput.totalMemoryBytesNotIn) &&
        Objects.equals(this.usedCpuHz, datacenterWhereInput.usedCpuHz) &&
        Objects.equals(this.usedCpuHzGt, datacenterWhereInput.usedCpuHzGt) &&
        Objects.equals(this.usedCpuHzGte, datacenterWhereInput.usedCpuHzGte) &&
        Objects.equals(this.usedCpuHzIn, datacenterWhereInput.usedCpuHzIn) &&
        Objects.equals(this.usedCpuHzLt, datacenterWhereInput.usedCpuHzLt) &&
        Objects.equals(this.usedCpuHzLte, datacenterWhereInput.usedCpuHzLte) &&
        Objects.equals(this.usedCpuHzNot, datacenterWhereInput.usedCpuHzNot) &&
        Objects.equals(this.usedCpuHzNotIn, datacenterWhereInput.usedCpuHzNotIn) &&
        Objects.equals(this.usedDataSpace, datacenterWhereInput.usedDataSpace) &&
        Objects.equals(this.usedDataSpaceGt, datacenterWhereInput.usedDataSpaceGt) &&
        Objects.equals(this.usedDataSpaceGte, datacenterWhereInput.usedDataSpaceGte) &&
        Objects.equals(this.usedDataSpaceIn, datacenterWhereInput.usedDataSpaceIn) &&
        Objects.equals(this.usedDataSpaceLt, datacenterWhereInput.usedDataSpaceLt) &&
        Objects.equals(this.usedDataSpaceLte, datacenterWhereInput.usedDataSpaceLte) &&
        Objects.equals(this.usedDataSpaceNot, datacenterWhereInput.usedDataSpaceNot) &&
        Objects.equals(this.usedDataSpaceNotIn, datacenterWhereInput.usedDataSpaceNotIn) &&
        Objects.equals(this.usedMemoryBytes, datacenterWhereInput.usedMemoryBytes) &&
        Objects.equals(this.usedMemoryBytesGt, datacenterWhereInput.usedMemoryBytesGt) &&
        Objects.equals(this.usedMemoryBytesGte, datacenterWhereInput.usedMemoryBytesGte) &&
        Objects.equals(this.usedMemoryBytesIn, datacenterWhereInput.usedMemoryBytesIn) &&
        Objects.equals(this.usedMemoryBytesLt, datacenterWhereInput.usedMemoryBytesLt) &&
        Objects.equals(this.usedMemoryBytesLte, datacenterWhereInput.usedMemoryBytesLte) &&
        Objects.equals(this.usedMemoryBytesNot, datacenterWhereInput.usedMemoryBytesNot) &&
        Objects.equals(this.usedMemoryBytesNotIn, datacenterWhereInput.usedMemoryBytesNotIn) &&
        Objects.equals(this.vmNum, datacenterWhereInput.vmNum) &&
        Objects.equals(this.vmNumGt, datacenterWhereInput.vmNumGt) &&
        Objects.equals(this.vmNumGte, datacenterWhereInput.vmNumGte) &&
        Objects.equals(this.vmNumIn, datacenterWhereInput.vmNumIn) &&
        Objects.equals(this.vmNumLt, datacenterWhereInput.vmNumLt) &&
        Objects.equals(this.vmNumLte, datacenterWhereInput.vmNumLte) &&
        Objects.equals(this.vmNumNot, datacenterWhereInput.vmNumNot) &&
        Objects.equals(this.vmNumNotIn, datacenterWhereInput.vmNumNotIn);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(AND, NOT, OR, clusterNum, clusterNumGt, clusterNumGte, clusterNumIn, clusterNumLt, clusterNumLte, clusterNumNot, clusterNumNotIn, clustersEvery, clustersNone, clustersSome, failureDataSpace, failureDataSpaceGt, failureDataSpaceGte, failureDataSpaceIn, failureDataSpaceLt, failureDataSpaceLte, failureDataSpaceNot, failureDataSpaceNotIn, hostNum, hostNumGt, hostNumGte, hostNumIn, hostNumLt, hostNumLte, hostNumNot, hostNumNotIn, id, idContains, idEndsWith, idGt, idGte, idIn, idLt, idLte, idNot, idNotContains, idNotEndsWith, idNotIn, idNotStartsWith, idStartsWith, labelsEvery, labelsNone, labelsSome, name, nameContains, nameEndsWith, nameGt, nameGte, nameIn, nameLt, nameLte, nameNot, nameNotContains, nameNotEndsWith, nameNotIn, nameNotStartsWith, nameStartsWith, organization, totalCpuHz, totalCpuHzGt, totalCpuHzGte, totalCpuHzIn, totalCpuHzLt, totalCpuHzLte, totalCpuHzNot, totalCpuHzNotIn, totalDataCapacity, totalDataCapacityGt, totalDataCapacityGte, totalDataCapacityIn, totalDataCapacityLt, totalDataCapacityLte, totalDataCapacityNot, totalDataCapacityNotIn, totalMemoryBytes, totalMemoryBytesGt, totalMemoryBytesGte, totalMemoryBytesIn, totalMemoryBytesLt, totalMemoryBytesLte, totalMemoryBytesNot, totalMemoryBytesNotIn, usedCpuHz, usedCpuHzGt, usedCpuHzGte, usedCpuHzIn, usedCpuHzLt, usedCpuHzLte, usedCpuHzNot, usedCpuHzNotIn, usedDataSpace, usedDataSpaceGt, usedDataSpaceGte, usedDataSpaceIn, usedDataSpaceLt, usedDataSpaceLte, usedDataSpaceNot, usedDataSpaceNotIn, usedMemoryBytes, usedMemoryBytesGt, usedMemoryBytesGte, usedMemoryBytesIn, usedMemoryBytesLt, usedMemoryBytesLte, usedMemoryBytesNot, usedMemoryBytesNotIn, vmNum, vmNumGt, vmNumGte, vmNumIn, vmNumLt, vmNumLte, vmNumNot, vmNumNotIn);
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
    sb.append("class DatacenterWhereInput {\n");
    sb.append("    AND: ").append(toIndentedString(AND)).append("\n");
    sb.append("    NOT: ").append(toIndentedString(NOT)).append("\n");
    sb.append("    OR: ").append(toIndentedString(OR)).append("\n");
    sb.append("    clusterNum: ").append(toIndentedString(clusterNum)).append("\n");
    sb.append("    clusterNumGt: ").append(toIndentedString(clusterNumGt)).append("\n");
    sb.append("    clusterNumGte: ").append(toIndentedString(clusterNumGte)).append("\n");
    sb.append("    clusterNumIn: ").append(toIndentedString(clusterNumIn)).append("\n");
    sb.append("    clusterNumLt: ").append(toIndentedString(clusterNumLt)).append("\n");
    sb.append("    clusterNumLte: ").append(toIndentedString(clusterNumLte)).append("\n");
    sb.append("    clusterNumNot: ").append(toIndentedString(clusterNumNot)).append("\n");
    sb.append("    clusterNumNotIn: ").append(toIndentedString(clusterNumNotIn)).append("\n");
    sb.append("    clustersEvery: ").append(toIndentedString(clustersEvery)).append("\n");
    sb.append("    clustersNone: ").append(toIndentedString(clustersNone)).append("\n");
    sb.append("    clustersSome: ").append(toIndentedString(clustersSome)).append("\n");
    sb.append("    failureDataSpace: ").append(toIndentedString(failureDataSpace)).append("\n");
    sb.append("    failureDataSpaceGt: ").append(toIndentedString(failureDataSpaceGt)).append("\n");
    sb.append("    failureDataSpaceGte: ").append(toIndentedString(failureDataSpaceGte)).append("\n");
    sb.append("    failureDataSpaceIn: ").append(toIndentedString(failureDataSpaceIn)).append("\n");
    sb.append("    failureDataSpaceLt: ").append(toIndentedString(failureDataSpaceLt)).append("\n");
    sb.append("    failureDataSpaceLte: ").append(toIndentedString(failureDataSpaceLte)).append("\n");
    sb.append("    failureDataSpaceNot: ").append(toIndentedString(failureDataSpaceNot)).append("\n");
    sb.append("    failureDataSpaceNotIn: ").append(toIndentedString(failureDataSpaceNotIn)).append("\n");
    sb.append("    hostNum: ").append(toIndentedString(hostNum)).append("\n");
    sb.append("    hostNumGt: ").append(toIndentedString(hostNumGt)).append("\n");
    sb.append("    hostNumGte: ").append(toIndentedString(hostNumGte)).append("\n");
    sb.append("    hostNumIn: ").append(toIndentedString(hostNumIn)).append("\n");
    sb.append("    hostNumLt: ").append(toIndentedString(hostNumLt)).append("\n");
    sb.append("    hostNumLte: ").append(toIndentedString(hostNumLte)).append("\n");
    sb.append("    hostNumNot: ").append(toIndentedString(hostNumNot)).append("\n");
    sb.append("    hostNumNotIn: ").append(toIndentedString(hostNumNotIn)).append("\n");
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
    sb.append("    labelsEvery: ").append(toIndentedString(labelsEvery)).append("\n");
    sb.append("    labelsNone: ").append(toIndentedString(labelsNone)).append("\n");
    sb.append("    labelsSome: ").append(toIndentedString(labelsSome)).append("\n");
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
    sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
    sb.append("    totalCpuHz: ").append(toIndentedString(totalCpuHz)).append("\n");
    sb.append("    totalCpuHzGt: ").append(toIndentedString(totalCpuHzGt)).append("\n");
    sb.append("    totalCpuHzGte: ").append(toIndentedString(totalCpuHzGte)).append("\n");
    sb.append("    totalCpuHzIn: ").append(toIndentedString(totalCpuHzIn)).append("\n");
    sb.append("    totalCpuHzLt: ").append(toIndentedString(totalCpuHzLt)).append("\n");
    sb.append("    totalCpuHzLte: ").append(toIndentedString(totalCpuHzLte)).append("\n");
    sb.append("    totalCpuHzNot: ").append(toIndentedString(totalCpuHzNot)).append("\n");
    sb.append("    totalCpuHzNotIn: ").append(toIndentedString(totalCpuHzNotIn)).append("\n");
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

