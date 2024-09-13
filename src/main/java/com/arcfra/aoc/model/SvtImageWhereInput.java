package com.arcfra.aoc.model;

import java.util.Objects;
import java.util.Arrays;
import com.arcfra.aoc.model.ClusterWhereInput;
import com.arcfra.aoc.model.EntityAsyncStatus;
import com.arcfra.aoc.model.VmDiskWhereInput;
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
 * SvtImageWhereInput
 */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class SvtImageWhereInput {
  public static final String SERIALIZED_NAME_A_N_D = "AND";
  @SerializedName(SERIALIZED_NAME_A_N_D)
  private List<SvtImageWhereInput> AND = null;

  public static final String SERIALIZED_NAME_N_O_T = "NOT";
  @SerializedName(SERIALIZED_NAME_N_O_T)
  private List<SvtImageWhereInput> NOT = null;

  public static final String SERIALIZED_NAME_O_R = "OR";
  @SerializedName(SERIALIZED_NAME_O_R)
  private List<SvtImageWhereInput> OR = null;

  public static final String SERIALIZED_NAME_CLUSTER = "cluster";
  @SerializedName(SERIALIZED_NAME_CLUSTER)
  private ClusterWhereInput cluster;

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

  public static final String SERIALIZED_NAME_PATH = "path";
  @SerializedName(SERIALIZED_NAME_PATH)
  private String path;

  public static final String SERIALIZED_NAME_PATH_CONTAINS = "path_contains";
  @SerializedName(SERIALIZED_NAME_PATH_CONTAINS)
  private String pathContains;

  public static final String SERIALIZED_NAME_PATH_ENDS_WITH = "path_ends_with";
  @SerializedName(SERIALIZED_NAME_PATH_ENDS_WITH)
  private String pathEndsWith;

  public static final String SERIALIZED_NAME_PATH_GT = "path_gt";
  @SerializedName(SERIALIZED_NAME_PATH_GT)
  private String pathGt;

  public static final String SERIALIZED_NAME_PATH_GTE = "path_gte";
  @SerializedName(SERIALIZED_NAME_PATH_GTE)
  private String pathGte;

  public static final String SERIALIZED_NAME_PATH_IN = "path_in";
  @SerializedName(SERIALIZED_NAME_PATH_IN)
  private List<String> pathIn = null;

  public static final String SERIALIZED_NAME_PATH_LT = "path_lt";
  @SerializedName(SERIALIZED_NAME_PATH_LT)
  private String pathLt;

  public static final String SERIALIZED_NAME_PATH_LTE = "path_lte";
  @SerializedName(SERIALIZED_NAME_PATH_LTE)
  private String pathLte;

  public static final String SERIALIZED_NAME_PATH_NOT = "path_not";
  @SerializedName(SERIALIZED_NAME_PATH_NOT)
  private String pathNot;

  public static final String SERIALIZED_NAME_PATH_NOT_CONTAINS = "path_not_contains";
  @SerializedName(SERIALIZED_NAME_PATH_NOT_CONTAINS)
  private String pathNotContains;

  public static final String SERIALIZED_NAME_PATH_NOT_ENDS_WITH = "path_not_ends_with";
  @SerializedName(SERIALIZED_NAME_PATH_NOT_ENDS_WITH)
  private String pathNotEndsWith;

  public static final String SERIALIZED_NAME_PATH_NOT_IN = "path_not_in";
  @SerializedName(SERIALIZED_NAME_PATH_NOT_IN)
  private List<String> pathNotIn = null;

  public static final String SERIALIZED_NAME_PATH_NOT_STARTS_WITH = "path_not_starts_with";
  @SerializedName(SERIALIZED_NAME_PATH_NOT_STARTS_WITH)
  private String pathNotStartsWith;

  public static final String SERIALIZED_NAME_PATH_STARTS_WITH = "path_starts_with";
  @SerializedName(SERIALIZED_NAME_PATH_STARTS_WITH)
  private String pathStartsWith;

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

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private Integer version;

  public static final String SERIALIZED_NAME_VERSION_GT = "version_gt";
  @SerializedName(SERIALIZED_NAME_VERSION_GT)
  private Integer versionGt;

  public static final String SERIALIZED_NAME_VERSION_GTE = "version_gte";
  @SerializedName(SERIALIZED_NAME_VERSION_GTE)
  private Integer versionGte;

  public static final String SERIALIZED_NAME_VERSION_IN = "version_in";
  @SerializedName(SERIALIZED_NAME_VERSION_IN)
  private List<Integer> versionIn = null;

  public static final String SERIALIZED_NAME_VERSION_LT = "version_lt";
  @SerializedName(SERIALIZED_NAME_VERSION_LT)
  private Integer versionLt;

  public static final String SERIALIZED_NAME_VERSION_LTE = "version_lte";
  @SerializedName(SERIALIZED_NAME_VERSION_LTE)
  private Integer versionLte;

  public static final String SERIALIZED_NAME_VERSION_NOT = "version_not";
  @SerializedName(SERIALIZED_NAME_VERSION_NOT)
  private Integer versionNot;

  public static final String SERIALIZED_NAME_VERSION_NOT_IN = "version_not_in";
  @SerializedName(SERIALIZED_NAME_VERSION_NOT_IN)
  private List<Integer> versionNotIn = null;

  public static final String SERIALIZED_NAME_VM_DISKS_EVERY = "vm_disks_every";
  @SerializedName(SERIALIZED_NAME_VM_DISKS_EVERY)
  private VmDiskWhereInput vmDisksEvery;

  public static final String SERIALIZED_NAME_VM_DISKS_NONE = "vm_disks_none";
  @SerializedName(SERIALIZED_NAME_VM_DISKS_NONE)
  private VmDiskWhereInput vmDisksNone;

  public static final String SERIALIZED_NAME_VM_DISKS_SOME = "vm_disks_some";
  @SerializedName(SERIALIZED_NAME_VM_DISKS_SOME)
  private VmDiskWhereInput vmDisksSome;

  public SvtImageWhereInput() { 
  }

  public SvtImageWhereInput AND(List<SvtImageWhereInput> AND) {
    
    this.AND = AND;
    return this;
  }

  public SvtImageWhereInput addANDItem(SvtImageWhereInput ANDItem) {
    if (this.AND == null) {
      this.AND = new ArrayList<SvtImageWhereInput>();
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

  public List<SvtImageWhereInput> getAND() {
    return AND;
  }


  public void setAND(List<SvtImageWhereInput> AND) {
    this.AND = AND;
  }


  public SvtImageWhereInput NOT(List<SvtImageWhereInput> NOT) {
    
    this.NOT = NOT;
    return this;
  }

  public SvtImageWhereInput addNOTItem(SvtImageWhereInput NOTItem) {
    if (this.NOT == null) {
      this.NOT = new ArrayList<SvtImageWhereInput>();
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

  public List<SvtImageWhereInput> getNOT() {
    return NOT;
  }


  public void setNOT(List<SvtImageWhereInput> NOT) {
    this.NOT = NOT;
  }


  public SvtImageWhereInput OR(List<SvtImageWhereInput> OR) {
    
    this.OR = OR;
    return this;
  }

  public SvtImageWhereInput addORItem(SvtImageWhereInput ORItem) {
    if (this.OR == null) {
      this.OR = new ArrayList<SvtImageWhereInput>();
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

  public List<SvtImageWhereInput> getOR() {
    return OR;
  }


  public void setOR(List<SvtImageWhereInput> OR) {
    this.OR = OR;
  }


  public SvtImageWhereInput cluster(ClusterWhereInput cluster) {
    
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


  public SvtImageWhereInput entityAsyncStatus(EntityAsyncStatus entityAsyncStatus) {
    
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


  public SvtImageWhereInput entityAsyncStatusIn(List<EntityAsyncStatus> entityAsyncStatusIn) {
    
    this.entityAsyncStatusIn = entityAsyncStatusIn;
    return this;
  }

  public SvtImageWhereInput addEntityAsyncStatusInItem(EntityAsyncStatus entityAsyncStatusInItem) {
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


  public SvtImageWhereInput entityAsyncStatusNot(EntityAsyncStatus entityAsyncStatusNot) {
    
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


  public SvtImageWhereInput entityAsyncStatusNotIn(List<EntityAsyncStatus> entityAsyncStatusNotIn) {
    
    this.entityAsyncStatusNotIn = entityAsyncStatusNotIn;
    return this;
  }

  public SvtImageWhereInput addEntityAsyncStatusNotInItem(EntityAsyncStatus entityAsyncStatusNotInItem) {
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


  public SvtImageWhereInput id(String id) {
    
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


  public SvtImageWhereInput idContains(String idContains) {
    
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


  public SvtImageWhereInput idEndsWith(String idEndsWith) {
    
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


  public SvtImageWhereInput idGt(String idGt) {
    
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


  public SvtImageWhereInput idGte(String idGte) {
    
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


  public SvtImageWhereInput idIn(List<String> idIn) {
    
    this.idIn = idIn;
    return this;
  }

  public SvtImageWhereInput addIdInItem(String idInItem) {
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


  public SvtImageWhereInput idLt(String idLt) {
    
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


  public SvtImageWhereInput idLte(String idLte) {
    
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


  public SvtImageWhereInput idNot(String idNot) {
    
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


  public SvtImageWhereInput idNotContains(String idNotContains) {
    
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


  public SvtImageWhereInput idNotEndsWith(String idNotEndsWith) {
    
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


  public SvtImageWhereInput idNotIn(List<String> idNotIn) {
    
    this.idNotIn = idNotIn;
    return this;
  }

  public SvtImageWhereInput addIdNotInItem(String idNotInItem) {
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


  public SvtImageWhereInput idNotStartsWith(String idNotStartsWith) {
    
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


  public SvtImageWhereInput idStartsWith(String idStartsWith) {
    
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


  public SvtImageWhereInput localCreatedAt(String localCreatedAt) {
    
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


  public SvtImageWhereInput localCreatedAtGt(String localCreatedAtGt) {
    
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


  public SvtImageWhereInput localCreatedAtGte(String localCreatedAtGte) {
    
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


  public SvtImageWhereInput localCreatedAtIn(List<String> localCreatedAtIn) {
    
    this.localCreatedAtIn = localCreatedAtIn;
    return this;
  }

  public SvtImageWhereInput addLocalCreatedAtInItem(String localCreatedAtInItem) {
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


  public SvtImageWhereInput localCreatedAtLt(String localCreatedAtLt) {
    
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


  public SvtImageWhereInput localCreatedAtLte(String localCreatedAtLte) {
    
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


  public SvtImageWhereInput localCreatedAtNot(String localCreatedAtNot) {
    
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


  public SvtImageWhereInput localCreatedAtNotIn(List<String> localCreatedAtNotIn) {
    
    this.localCreatedAtNotIn = localCreatedAtNotIn;
    return this;
  }

  public SvtImageWhereInput addLocalCreatedAtNotInItem(String localCreatedAtNotInItem) {
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


  public SvtImageWhereInput localId(String localId) {
    
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


  public SvtImageWhereInput localIdContains(String localIdContains) {
    
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


  public SvtImageWhereInput localIdEndsWith(String localIdEndsWith) {
    
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


  public SvtImageWhereInput localIdGt(String localIdGt) {
    
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


  public SvtImageWhereInput localIdGte(String localIdGte) {
    
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


  public SvtImageWhereInput localIdIn(List<String> localIdIn) {
    
    this.localIdIn = localIdIn;
    return this;
  }

  public SvtImageWhereInput addLocalIdInItem(String localIdInItem) {
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


  public SvtImageWhereInput localIdLt(String localIdLt) {
    
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


  public SvtImageWhereInput localIdLte(String localIdLte) {
    
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


  public SvtImageWhereInput localIdNot(String localIdNot) {
    
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


  public SvtImageWhereInput localIdNotContains(String localIdNotContains) {
    
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


  public SvtImageWhereInput localIdNotEndsWith(String localIdNotEndsWith) {
    
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


  public SvtImageWhereInput localIdNotIn(List<String> localIdNotIn) {
    
    this.localIdNotIn = localIdNotIn;
    return this;
  }

  public SvtImageWhereInput addLocalIdNotInItem(String localIdNotInItem) {
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


  public SvtImageWhereInput localIdNotStartsWith(String localIdNotStartsWith) {
    
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


  public SvtImageWhereInput localIdStartsWith(String localIdStartsWith) {
    
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


  public SvtImageWhereInput name(String name) {
    
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


  public SvtImageWhereInput nameContains(String nameContains) {
    
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


  public SvtImageWhereInput nameEndsWith(String nameEndsWith) {
    
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


  public SvtImageWhereInput nameGt(String nameGt) {
    
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


  public SvtImageWhereInput nameGte(String nameGte) {
    
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


  public SvtImageWhereInput nameIn(List<String> nameIn) {
    
    this.nameIn = nameIn;
    return this;
  }

  public SvtImageWhereInput addNameInItem(String nameInItem) {
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


  public SvtImageWhereInput nameLt(String nameLt) {
    
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


  public SvtImageWhereInput nameLte(String nameLte) {
    
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


  public SvtImageWhereInput nameNot(String nameNot) {
    
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


  public SvtImageWhereInput nameNotContains(String nameNotContains) {
    
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


  public SvtImageWhereInput nameNotEndsWith(String nameNotEndsWith) {
    
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


  public SvtImageWhereInput nameNotIn(List<String> nameNotIn) {
    
    this.nameNotIn = nameNotIn;
    return this;
  }

  public SvtImageWhereInput addNameNotInItem(String nameNotInItem) {
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


  public SvtImageWhereInput nameNotStartsWith(String nameNotStartsWith) {
    
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


  public SvtImageWhereInput nameStartsWith(String nameStartsWith) {
    
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


  public SvtImageWhereInput path(String path) {
    
    this.path = path;
    return this;
  }

   /**
   * Get path
   * @return path
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPath() {
    return path;
  }


  public void setPath(String path) {
    this.path = path;
  }


  public SvtImageWhereInput pathContains(String pathContains) {
    
    this.pathContains = pathContains;
    return this;
  }

   /**
   * Get pathContains
   * @return pathContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPathContains() {
    return pathContains;
  }


  public void setPathContains(String pathContains) {
    this.pathContains = pathContains;
  }


  public SvtImageWhereInput pathEndsWith(String pathEndsWith) {
    
    this.pathEndsWith = pathEndsWith;
    return this;
  }

   /**
   * Get pathEndsWith
   * @return pathEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPathEndsWith() {
    return pathEndsWith;
  }


  public void setPathEndsWith(String pathEndsWith) {
    this.pathEndsWith = pathEndsWith;
  }


  public SvtImageWhereInput pathGt(String pathGt) {
    
    this.pathGt = pathGt;
    return this;
  }

   /**
   * Get pathGt
   * @return pathGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPathGt() {
    return pathGt;
  }


  public void setPathGt(String pathGt) {
    this.pathGt = pathGt;
  }


  public SvtImageWhereInput pathGte(String pathGte) {
    
    this.pathGte = pathGte;
    return this;
  }

   /**
   * Get pathGte
   * @return pathGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPathGte() {
    return pathGte;
  }


  public void setPathGte(String pathGte) {
    this.pathGte = pathGte;
  }


  public SvtImageWhereInput pathIn(List<String> pathIn) {
    
    this.pathIn = pathIn;
    return this;
  }

  public SvtImageWhereInput addPathInItem(String pathInItem) {
    if (this.pathIn == null) {
      this.pathIn = new ArrayList<String>();
    }
    this.pathIn.add(pathInItem);
    return this;
  }

   /**
   * Get pathIn
   * @return pathIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getPathIn() {
    return pathIn;
  }


  public void setPathIn(List<String> pathIn) {
    this.pathIn = pathIn;
  }


  public SvtImageWhereInput pathLt(String pathLt) {
    
    this.pathLt = pathLt;
    return this;
  }

   /**
   * Get pathLt
   * @return pathLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPathLt() {
    return pathLt;
  }


  public void setPathLt(String pathLt) {
    this.pathLt = pathLt;
  }


  public SvtImageWhereInput pathLte(String pathLte) {
    
    this.pathLte = pathLte;
    return this;
  }

   /**
   * Get pathLte
   * @return pathLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPathLte() {
    return pathLte;
  }


  public void setPathLte(String pathLte) {
    this.pathLte = pathLte;
  }


  public SvtImageWhereInput pathNot(String pathNot) {
    
    this.pathNot = pathNot;
    return this;
  }

   /**
   * Get pathNot
   * @return pathNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPathNot() {
    return pathNot;
  }


  public void setPathNot(String pathNot) {
    this.pathNot = pathNot;
  }


  public SvtImageWhereInput pathNotContains(String pathNotContains) {
    
    this.pathNotContains = pathNotContains;
    return this;
  }

   /**
   * Get pathNotContains
   * @return pathNotContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPathNotContains() {
    return pathNotContains;
  }


  public void setPathNotContains(String pathNotContains) {
    this.pathNotContains = pathNotContains;
  }


  public SvtImageWhereInput pathNotEndsWith(String pathNotEndsWith) {
    
    this.pathNotEndsWith = pathNotEndsWith;
    return this;
  }

   /**
   * Get pathNotEndsWith
   * @return pathNotEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPathNotEndsWith() {
    return pathNotEndsWith;
  }


  public void setPathNotEndsWith(String pathNotEndsWith) {
    this.pathNotEndsWith = pathNotEndsWith;
  }


  public SvtImageWhereInput pathNotIn(List<String> pathNotIn) {
    
    this.pathNotIn = pathNotIn;
    return this;
  }

  public SvtImageWhereInput addPathNotInItem(String pathNotInItem) {
    if (this.pathNotIn == null) {
      this.pathNotIn = new ArrayList<String>();
    }
    this.pathNotIn.add(pathNotInItem);
    return this;
  }

   /**
   * Get pathNotIn
   * @return pathNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getPathNotIn() {
    return pathNotIn;
  }


  public void setPathNotIn(List<String> pathNotIn) {
    this.pathNotIn = pathNotIn;
  }


  public SvtImageWhereInput pathNotStartsWith(String pathNotStartsWith) {
    
    this.pathNotStartsWith = pathNotStartsWith;
    return this;
  }

   /**
   * Get pathNotStartsWith
   * @return pathNotStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPathNotStartsWith() {
    return pathNotStartsWith;
  }


  public void setPathNotStartsWith(String pathNotStartsWith) {
    this.pathNotStartsWith = pathNotStartsWith;
  }


  public SvtImageWhereInput pathStartsWith(String pathStartsWith) {
    
    this.pathStartsWith = pathStartsWith;
    return this;
  }

   /**
   * Get pathStartsWith
   * @return pathStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPathStartsWith() {
    return pathStartsWith;
  }


  public void setPathStartsWith(String pathStartsWith) {
    this.pathStartsWith = pathStartsWith;
  }


  public SvtImageWhereInput size(Long size) {
    
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


  public SvtImageWhereInput sizeGt(Long sizeGt) {
    
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


  public SvtImageWhereInput sizeGte(Long sizeGte) {
    
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


  public SvtImageWhereInput sizeIn(List<Long> sizeIn) {
    
    this.sizeIn = sizeIn;
    return this;
  }

  public SvtImageWhereInput addSizeInItem(Long sizeInItem) {
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


  public SvtImageWhereInput sizeLt(Long sizeLt) {
    
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


  public SvtImageWhereInput sizeLte(Long sizeLte) {
    
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


  public SvtImageWhereInput sizeNot(Long sizeNot) {
    
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


  public SvtImageWhereInput sizeNotIn(List<Long> sizeNotIn) {
    
    this.sizeNotIn = sizeNotIn;
    return this;
  }

  public SvtImageWhereInput addSizeNotInItem(Long sizeNotInItem) {
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


  public SvtImageWhereInput version(Integer version) {
    
    this.version = version;
    return this;
  }

   /**
   * Get version
   * @return version
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getVersion() {
    return version;
  }


  public void setVersion(Integer version) {
    this.version = version;
  }


  public SvtImageWhereInput versionGt(Integer versionGt) {
    
    this.versionGt = versionGt;
    return this;
  }

   /**
   * Get versionGt
   * @return versionGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getVersionGt() {
    return versionGt;
  }


  public void setVersionGt(Integer versionGt) {
    this.versionGt = versionGt;
  }


  public SvtImageWhereInput versionGte(Integer versionGte) {
    
    this.versionGte = versionGte;
    return this;
  }

   /**
   * Get versionGte
   * @return versionGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getVersionGte() {
    return versionGte;
  }


  public void setVersionGte(Integer versionGte) {
    this.versionGte = versionGte;
  }


  public SvtImageWhereInput versionIn(List<Integer> versionIn) {
    
    this.versionIn = versionIn;
    return this;
  }

  public SvtImageWhereInput addVersionInItem(Integer versionInItem) {
    if (this.versionIn == null) {
      this.versionIn = new ArrayList<Integer>();
    }
    this.versionIn.add(versionInItem);
    return this;
  }

   /**
   * Get versionIn
   * @return versionIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Integer> getVersionIn() {
    return versionIn;
  }


  public void setVersionIn(List<Integer> versionIn) {
    this.versionIn = versionIn;
  }


  public SvtImageWhereInput versionLt(Integer versionLt) {
    
    this.versionLt = versionLt;
    return this;
  }

   /**
   * Get versionLt
   * @return versionLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getVersionLt() {
    return versionLt;
  }


  public void setVersionLt(Integer versionLt) {
    this.versionLt = versionLt;
  }


  public SvtImageWhereInput versionLte(Integer versionLte) {
    
    this.versionLte = versionLte;
    return this;
  }

   /**
   * Get versionLte
   * @return versionLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getVersionLte() {
    return versionLte;
  }


  public void setVersionLte(Integer versionLte) {
    this.versionLte = versionLte;
  }


  public SvtImageWhereInput versionNot(Integer versionNot) {
    
    this.versionNot = versionNot;
    return this;
  }

   /**
   * Get versionNot
   * @return versionNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getVersionNot() {
    return versionNot;
  }


  public void setVersionNot(Integer versionNot) {
    this.versionNot = versionNot;
  }


  public SvtImageWhereInput versionNotIn(List<Integer> versionNotIn) {
    
    this.versionNotIn = versionNotIn;
    return this;
  }

  public SvtImageWhereInput addVersionNotInItem(Integer versionNotInItem) {
    if (this.versionNotIn == null) {
      this.versionNotIn = new ArrayList<Integer>();
    }
    this.versionNotIn.add(versionNotInItem);
    return this;
  }

   /**
   * Get versionNotIn
   * @return versionNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Integer> getVersionNotIn() {
    return versionNotIn;
  }


  public void setVersionNotIn(List<Integer> versionNotIn) {
    this.versionNotIn = versionNotIn;
  }


  public SvtImageWhereInput vmDisksEvery(VmDiskWhereInput vmDisksEvery) {
    
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


  public SvtImageWhereInput vmDisksNone(VmDiskWhereInput vmDisksNone) {
    
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


  public SvtImageWhereInput vmDisksSome(VmDiskWhereInput vmDisksSome) {
    
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SvtImageWhereInput svtImageWhereInput = (SvtImageWhereInput) o;
    return Objects.equals(this.AND, svtImageWhereInput.AND) &&
        Objects.equals(this.NOT, svtImageWhereInput.NOT) &&
        Objects.equals(this.OR, svtImageWhereInput.OR) &&
        Objects.equals(this.cluster, svtImageWhereInput.cluster) &&
        Objects.equals(this.entityAsyncStatus, svtImageWhereInput.entityAsyncStatus) &&
        Objects.equals(this.entityAsyncStatusIn, svtImageWhereInput.entityAsyncStatusIn) &&
        Objects.equals(this.entityAsyncStatusNot, svtImageWhereInput.entityAsyncStatusNot) &&
        Objects.equals(this.entityAsyncStatusNotIn, svtImageWhereInput.entityAsyncStatusNotIn) &&
        Objects.equals(this.id, svtImageWhereInput.id) &&
        Objects.equals(this.idContains, svtImageWhereInput.idContains) &&
        Objects.equals(this.idEndsWith, svtImageWhereInput.idEndsWith) &&
        Objects.equals(this.idGt, svtImageWhereInput.idGt) &&
        Objects.equals(this.idGte, svtImageWhereInput.idGte) &&
        Objects.equals(this.idIn, svtImageWhereInput.idIn) &&
        Objects.equals(this.idLt, svtImageWhereInput.idLt) &&
        Objects.equals(this.idLte, svtImageWhereInput.idLte) &&
        Objects.equals(this.idNot, svtImageWhereInput.idNot) &&
        Objects.equals(this.idNotContains, svtImageWhereInput.idNotContains) &&
        Objects.equals(this.idNotEndsWith, svtImageWhereInput.idNotEndsWith) &&
        Objects.equals(this.idNotIn, svtImageWhereInput.idNotIn) &&
        Objects.equals(this.idNotStartsWith, svtImageWhereInput.idNotStartsWith) &&
        Objects.equals(this.idStartsWith, svtImageWhereInput.idStartsWith) &&
        Objects.equals(this.localCreatedAt, svtImageWhereInput.localCreatedAt) &&
        Objects.equals(this.localCreatedAtGt, svtImageWhereInput.localCreatedAtGt) &&
        Objects.equals(this.localCreatedAtGte, svtImageWhereInput.localCreatedAtGte) &&
        Objects.equals(this.localCreatedAtIn, svtImageWhereInput.localCreatedAtIn) &&
        Objects.equals(this.localCreatedAtLt, svtImageWhereInput.localCreatedAtLt) &&
        Objects.equals(this.localCreatedAtLte, svtImageWhereInput.localCreatedAtLte) &&
        Objects.equals(this.localCreatedAtNot, svtImageWhereInput.localCreatedAtNot) &&
        Objects.equals(this.localCreatedAtNotIn, svtImageWhereInput.localCreatedAtNotIn) &&
        Objects.equals(this.localId, svtImageWhereInput.localId) &&
        Objects.equals(this.localIdContains, svtImageWhereInput.localIdContains) &&
        Objects.equals(this.localIdEndsWith, svtImageWhereInput.localIdEndsWith) &&
        Objects.equals(this.localIdGt, svtImageWhereInput.localIdGt) &&
        Objects.equals(this.localIdGte, svtImageWhereInput.localIdGte) &&
        Objects.equals(this.localIdIn, svtImageWhereInput.localIdIn) &&
        Objects.equals(this.localIdLt, svtImageWhereInput.localIdLt) &&
        Objects.equals(this.localIdLte, svtImageWhereInput.localIdLte) &&
        Objects.equals(this.localIdNot, svtImageWhereInput.localIdNot) &&
        Objects.equals(this.localIdNotContains, svtImageWhereInput.localIdNotContains) &&
        Objects.equals(this.localIdNotEndsWith, svtImageWhereInput.localIdNotEndsWith) &&
        Objects.equals(this.localIdNotIn, svtImageWhereInput.localIdNotIn) &&
        Objects.equals(this.localIdNotStartsWith, svtImageWhereInput.localIdNotStartsWith) &&
        Objects.equals(this.localIdStartsWith, svtImageWhereInput.localIdStartsWith) &&
        Objects.equals(this.name, svtImageWhereInput.name) &&
        Objects.equals(this.nameContains, svtImageWhereInput.nameContains) &&
        Objects.equals(this.nameEndsWith, svtImageWhereInput.nameEndsWith) &&
        Objects.equals(this.nameGt, svtImageWhereInput.nameGt) &&
        Objects.equals(this.nameGte, svtImageWhereInput.nameGte) &&
        Objects.equals(this.nameIn, svtImageWhereInput.nameIn) &&
        Objects.equals(this.nameLt, svtImageWhereInput.nameLt) &&
        Objects.equals(this.nameLte, svtImageWhereInput.nameLte) &&
        Objects.equals(this.nameNot, svtImageWhereInput.nameNot) &&
        Objects.equals(this.nameNotContains, svtImageWhereInput.nameNotContains) &&
        Objects.equals(this.nameNotEndsWith, svtImageWhereInput.nameNotEndsWith) &&
        Objects.equals(this.nameNotIn, svtImageWhereInput.nameNotIn) &&
        Objects.equals(this.nameNotStartsWith, svtImageWhereInput.nameNotStartsWith) &&
        Objects.equals(this.nameStartsWith, svtImageWhereInput.nameStartsWith) &&
        Objects.equals(this.path, svtImageWhereInput.path) &&
        Objects.equals(this.pathContains, svtImageWhereInput.pathContains) &&
        Objects.equals(this.pathEndsWith, svtImageWhereInput.pathEndsWith) &&
        Objects.equals(this.pathGt, svtImageWhereInput.pathGt) &&
        Objects.equals(this.pathGte, svtImageWhereInput.pathGte) &&
        Objects.equals(this.pathIn, svtImageWhereInput.pathIn) &&
        Objects.equals(this.pathLt, svtImageWhereInput.pathLt) &&
        Objects.equals(this.pathLte, svtImageWhereInput.pathLte) &&
        Objects.equals(this.pathNot, svtImageWhereInput.pathNot) &&
        Objects.equals(this.pathNotContains, svtImageWhereInput.pathNotContains) &&
        Objects.equals(this.pathNotEndsWith, svtImageWhereInput.pathNotEndsWith) &&
        Objects.equals(this.pathNotIn, svtImageWhereInput.pathNotIn) &&
        Objects.equals(this.pathNotStartsWith, svtImageWhereInput.pathNotStartsWith) &&
        Objects.equals(this.pathStartsWith, svtImageWhereInput.pathStartsWith) &&
        Objects.equals(this.size, svtImageWhereInput.size) &&
        Objects.equals(this.sizeGt, svtImageWhereInput.sizeGt) &&
        Objects.equals(this.sizeGte, svtImageWhereInput.sizeGte) &&
        Objects.equals(this.sizeIn, svtImageWhereInput.sizeIn) &&
        Objects.equals(this.sizeLt, svtImageWhereInput.sizeLt) &&
        Objects.equals(this.sizeLte, svtImageWhereInput.sizeLte) &&
        Objects.equals(this.sizeNot, svtImageWhereInput.sizeNot) &&
        Objects.equals(this.sizeNotIn, svtImageWhereInput.sizeNotIn) &&
        Objects.equals(this.version, svtImageWhereInput.version) &&
        Objects.equals(this.versionGt, svtImageWhereInput.versionGt) &&
        Objects.equals(this.versionGte, svtImageWhereInput.versionGte) &&
        Objects.equals(this.versionIn, svtImageWhereInput.versionIn) &&
        Objects.equals(this.versionLt, svtImageWhereInput.versionLt) &&
        Objects.equals(this.versionLte, svtImageWhereInput.versionLte) &&
        Objects.equals(this.versionNot, svtImageWhereInput.versionNot) &&
        Objects.equals(this.versionNotIn, svtImageWhereInput.versionNotIn) &&
        Objects.equals(this.vmDisksEvery, svtImageWhereInput.vmDisksEvery) &&
        Objects.equals(this.vmDisksNone, svtImageWhereInput.vmDisksNone) &&
        Objects.equals(this.vmDisksSome, svtImageWhereInput.vmDisksSome);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(AND, NOT, OR, cluster, entityAsyncStatus, entityAsyncStatusIn, entityAsyncStatusNot, entityAsyncStatusNotIn, id, idContains, idEndsWith, idGt, idGte, idIn, idLt, idLte, idNot, idNotContains, idNotEndsWith, idNotIn, idNotStartsWith, idStartsWith, localCreatedAt, localCreatedAtGt, localCreatedAtGte, localCreatedAtIn, localCreatedAtLt, localCreatedAtLte, localCreatedAtNot, localCreatedAtNotIn, localId, localIdContains, localIdEndsWith, localIdGt, localIdGte, localIdIn, localIdLt, localIdLte, localIdNot, localIdNotContains, localIdNotEndsWith, localIdNotIn, localIdNotStartsWith, localIdStartsWith, name, nameContains, nameEndsWith, nameGt, nameGte, nameIn, nameLt, nameLte, nameNot, nameNotContains, nameNotEndsWith, nameNotIn, nameNotStartsWith, nameStartsWith, path, pathContains, pathEndsWith, pathGt, pathGte, pathIn, pathLt, pathLte, pathNot, pathNotContains, pathNotEndsWith, pathNotIn, pathNotStartsWith, pathStartsWith, size, sizeGt, sizeGte, sizeIn, sizeLt, sizeLte, sizeNot, sizeNotIn, version, versionGt, versionGte, versionIn, versionLt, versionLte, versionNot, versionNotIn, vmDisksEvery, vmDisksNone, vmDisksSome);
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
    sb.append("class SvtImageWhereInput {\n");
    sb.append("    AND: ").append(toIndentedString(AND)).append("\n");
    sb.append("    NOT: ").append(toIndentedString(NOT)).append("\n");
    sb.append("    OR: ").append(toIndentedString(OR)).append("\n");
    sb.append("    cluster: ").append(toIndentedString(cluster)).append("\n");
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
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    pathContains: ").append(toIndentedString(pathContains)).append("\n");
    sb.append("    pathEndsWith: ").append(toIndentedString(pathEndsWith)).append("\n");
    sb.append("    pathGt: ").append(toIndentedString(pathGt)).append("\n");
    sb.append("    pathGte: ").append(toIndentedString(pathGte)).append("\n");
    sb.append("    pathIn: ").append(toIndentedString(pathIn)).append("\n");
    sb.append("    pathLt: ").append(toIndentedString(pathLt)).append("\n");
    sb.append("    pathLte: ").append(toIndentedString(pathLte)).append("\n");
    sb.append("    pathNot: ").append(toIndentedString(pathNot)).append("\n");
    sb.append("    pathNotContains: ").append(toIndentedString(pathNotContains)).append("\n");
    sb.append("    pathNotEndsWith: ").append(toIndentedString(pathNotEndsWith)).append("\n");
    sb.append("    pathNotIn: ").append(toIndentedString(pathNotIn)).append("\n");
    sb.append("    pathNotStartsWith: ").append(toIndentedString(pathNotStartsWith)).append("\n");
    sb.append("    pathStartsWith: ").append(toIndentedString(pathStartsWith)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    sizeGt: ").append(toIndentedString(sizeGt)).append("\n");
    sb.append("    sizeGte: ").append(toIndentedString(sizeGte)).append("\n");
    sb.append("    sizeIn: ").append(toIndentedString(sizeIn)).append("\n");
    sb.append("    sizeLt: ").append(toIndentedString(sizeLt)).append("\n");
    sb.append("    sizeLte: ").append(toIndentedString(sizeLte)).append("\n");
    sb.append("    sizeNot: ").append(toIndentedString(sizeNot)).append("\n");
    sb.append("    sizeNotIn: ").append(toIndentedString(sizeNotIn)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    versionGt: ").append(toIndentedString(versionGt)).append("\n");
    sb.append("    versionGte: ").append(toIndentedString(versionGte)).append("\n");
    sb.append("    versionIn: ").append(toIndentedString(versionIn)).append("\n");
    sb.append("    versionLt: ").append(toIndentedString(versionLt)).append("\n");
    sb.append("    versionLte: ").append(toIndentedString(versionLte)).append("\n");
    sb.append("    versionNot: ").append(toIndentedString(versionNot)).append("\n");
    sb.append("    versionNotIn: ").append(toIndentedString(versionNotIn)).append("\n");
    sb.append("    vmDisksEvery: ").append(toIndentedString(vmDisksEvery)).append("\n");
    sb.append("    vmDisksNone: ").append(toIndentedString(vmDisksNone)).append("\n");
    sb.append("    vmDisksSome: ").append(toIndentedString(vmDisksSome)).append("\n");
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

