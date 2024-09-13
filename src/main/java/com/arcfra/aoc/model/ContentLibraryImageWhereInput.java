package com.arcfra.aoc.model;

import java.util.Objects;
import java.util.Arrays;
import com.arcfra.aoc.model.ClusterWhereInput;
import com.arcfra.aoc.model.ElfImageWhereInput;
import com.arcfra.aoc.model.EntityAsyncStatus;
import com.arcfra.aoc.model.IscsiLunWhereInput;
import com.arcfra.aoc.model.LabelWhereInput;
import com.arcfra.aoc.model.VmDiskWhereInput;
import com.arcfra.aoc.model.VmSnapshotWhereInput;
import com.arcfra.aoc.model.VmTemplateWhereInput;
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
 * ContentLibraryImageWhereInput
 */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class ContentLibraryImageWhereInput {
  public static final String SERIALIZED_NAME_A_N_D = "AND";
  @SerializedName(SERIALIZED_NAME_A_N_D)
  private List<ContentLibraryImageWhereInput> AND = null;

  public static final String SERIALIZED_NAME_N_O_T = "NOT";
  @SerializedName(SERIALIZED_NAME_N_O_T)
  private List<ContentLibraryImageWhereInput> NOT = null;

  public static final String SERIALIZED_NAME_O_R = "OR";
  @SerializedName(SERIALIZED_NAME_O_R)
  private List<ContentLibraryImageWhereInput> OR = null;

  public static final String SERIALIZED_NAME_CLUSTERS_EVERY = "clusters_every";
  @SerializedName(SERIALIZED_NAME_CLUSTERS_EVERY)
  private ClusterWhereInput clustersEvery;

  public static final String SERIALIZED_NAME_CLUSTERS_NONE = "clusters_none";
  @SerializedName(SERIALIZED_NAME_CLUSTERS_NONE)
  private ClusterWhereInput clustersNone;

  public static final String SERIALIZED_NAME_CLUSTERS_SOME = "clusters_some";
  @SerializedName(SERIALIZED_NAME_CLUSTERS_SOME)
  private ClusterWhereInput clustersSome;

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

  public static final String SERIALIZED_NAME_ELF_IMAGES_EVERY = "elf_images_every";
  @SerializedName(SERIALIZED_NAME_ELF_IMAGES_EVERY)
  private ElfImageWhereInput elfImagesEvery;

  public static final String SERIALIZED_NAME_ELF_IMAGES_NONE = "elf_images_none";
  @SerializedName(SERIALIZED_NAME_ELF_IMAGES_NONE)
  private ElfImageWhereInput elfImagesNone;

  public static final String SERIALIZED_NAME_ELF_IMAGES_SOME = "elf_images_some";
  @SerializedName(SERIALIZED_NAME_ELF_IMAGES_SOME)
  private ElfImageWhereInput elfImagesSome;

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

  public static final String SERIALIZED_NAME_ISCSI_LUNS_EVERY = "iscsi_luns_every";
  @SerializedName(SERIALIZED_NAME_ISCSI_LUNS_EVERY)
  private IscsiLunWhereInput iscsiLunsEvery;

  public static final String SERIALIZED_NAME_ISCSI_LUNS_NONE = "iscsi_luns_none";
  @SerializedName(SERIALIZED_NAME_ISCSI_LUNS_NONE)
  private IscsiLunWhereInput iscsiLunsNone;

  public static final String SERIALIZED_NAME_ISCSI_LUNS_SOME = "iscsi_luns_some";
  @SerializedName(SERIALIZED_NAME_ISCSI_LUNS_SOME)
  private IscsiLunWhereInput iscsiLunsSome;

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

  public static final String SERIALIZED_NAME_VM_DISKS_EVERY = "vm_disks_every";
  @SerializedName(SERIALIZED_NAME_VM_DISKS_EVERY)
  private VmDiskWhereInput vmDisksEvery;

  public static final String SERIALIZED_NAME_VM_DISKS_NONE = "vm_disks_none";
  @SerializedName(SERIALIZED_NAME_VM_DISKS_NONE)
  private VmDiskWhereInput vmDisksNone;

  public static final String SERIALIZED_NAME_VM_DISKS_SOME = "vm_disks_some";
  @SerializedName(SERIALIZED_NAME_VM_DISKS_SOME)
  private VmDiskWhereInput vmDisksSome;

  public static final String SERIALIZED_NAME_VM_SNAPSHOTS_EVERY = "vm_snapshots_every";
  @SerializedName(SERIALIZED_NAME_VM_SNAPSHOTS_EVERY)
  private VmSnapshotWhereInput vmSnapshotsEvery;

  public static final String SERIALIZED_NAME_VM_SNAPSHOTS_NONE = "vm_snapshots_none";
  @SerializedName(SERIALIZED_NAME_VM_SNAPSHOTS_NONE)
  private VmSnapshotWhereInput vmSnapshotsNone;

  public static final String SERIALIZED_NAME_VM_SNAPSHOTS_SOME = "vm_snapshots_some";
  @SerializedName(SERIALIZED_NAME_VM_SNAPSHOTS_SOME)
  private VmSnapshotWhereInput vmSnapshotsSome;

  public static final String SERIALIZED_NAME_VM_TEMPLATES_EVERY = "vm_templates_every";
  @SerializedName(SERIALIZED_NAME_VM_TEMPLATES_EVERY)
  private VmTemplateWhereInput vmTemplatesEvery;

  public static final String SERIALIZED_NAME_VM_TEMPLATES_NONE = "vm_templates_none";
  @SerializedName(SERIALIZED_NAME_VM_TEMPLATES_NONE)
  private VmTemplateWhereInput vmTemplatesNone;

  public static final String SERIALIZED_NAME_VM_TEMPLATES_SOME = "vm_templates_some";
  @SerializedName(SERIALIZED_NAME_VM_TEMPLATES_SOME)
  private VmTemplateWhereInput vmTemplatesSome;

  public ContentLibraryImageWhereInput() { 
  }

  public ContentLibraryImageWhereInput AND(List<ContentLibraryImageWhereInput> AND) {
    
    this.AND = AND;
    return this;
  }

  public ContentLibraryImageWhereInput addANDItem(ContentLibraryImageWhereInput ANDItem) {
    if (this.AND == null) {
      this.AND = new ArrayList<ContentLibraryImageWhereInput>();
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

  public List<ContentLibraryImageWhereInput> getAND() {
    return AND;
  }


  public void setAND(List<ContentLibraryImageWhereInput> AND) {
    this.AND = AND;
  }


  public ContentLibraryImageWhereInput NOT(List<ContentLibraryImageWhereInput> NOT) {
    
    this.NOT = NOT;
    return this;
  }

  public ContentLibraryImageWhereInput addNOTItem(ContentLibraryImageWhereInput NOTItem) {
    if (this.NOT == null) {
      this.NOT = new ArrayList<ContentLibraryImageWhereInput>();
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

  public List<ContentLibraryImageWhereInput> getNOT() {
    return NOT;
  }


  public void setNOT(List<ContentLibraryImageWhereInput> NOT) {
    this.NOT = NOT;
  }


  public ContentLibraryImageWhereInput OR(List<ContentLibraryImageWhereInput> OR) {
    
    this.OR = OR;
    return this;
  }

  public ContentLibraryImageWhereInput addORItem(ContentLibraryImageWhereInput ORItem) {
    if (this.OR == null) {
      this.OR = new ArrayList<ContentLibraryImageWhereInput>();
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

  public List<ContentLibraryImageWhereInput> getOR() {
    return OR;
  }


  public void setOR(List<ContentLibraryImageWhereInput> OR) {
    this.OR = OR;
  }


  public ContentLibraryImageWhereInput clustersEvery(ClusterWhereInput clustersEvery) {
    
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


  public ContentLibraryImageWhereInput clustersNone(ClusterWhereInput clustersNone) {
    
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


  public ContentLibraryImageWhereInput clustersSome(ClusterWhereInput clustersSome) {
    
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


  public ContentLibraryImageWhereInput createdAt(String createdAt) {
    
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


  public ContentLibraryImageWhereInput createdAtGt(String createdAtGt) {
    
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


  public ContentLibraryImageWhereInput createdAtGte(String createdAtGte) {
    
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


  public ContentLibraryImageWhereInput createdAtIn(List<String> createdAtIn) {
    
    this.createdAtIn = createdAtIn;
    return this;
  }

  public ContentLibraryImageWhereInput addCreatedAtInItem(String createdAtInItem) {
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


  public ContentLibraryImageWhereInput createdAtLt(String createdAtLt) {
    
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


  public ContentLibraryImageWhereInput createdAtLte(String createdAtLte) {
    
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


  public ContentLibraryImageWhereInput createdAtNot(String createdAtNot) {
    
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


  public ContentLibraryImageWhereInput createdAtNotIn(List<String> createdAtNotIn) {
    
    this.createdAtNotIn = createdAtNotIn;
    return this;
  }

  public ContentLibraryImageWhereInput addCreatedAtNotInItem(String createdAtNotInItem) {
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


  public ContentLibraryImageWhereInput description(String description) {
    
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


  public ContentLibraryImageWhereInput descriptionContains(String descriptionContains) {
    
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


  public ContentLibraryImageWhereInput descriptionEndsWith(String descriptionEndsWith) {
    
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


  public ContentLibraryImageWhereInput descriptionGt(String descriptionGt) {
    
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


  public ContentLibraryImageWhereInput descriptionGte(String descriptionGte) {
    
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


  public ContentLibraryImageWhereInput descriptionIn(List<String> descriptionIn) {
    
    this.descriptionIn = descriptionIn;
    return this;
  }

  public ContentLibraryImageWhereInput addDescriptionInItem(String descriptionInItem) {
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


  public ContentLibraryImageWhereInput descriptionLt(String descriptionLt) {
    
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


  public ContentLibraryImageWhereInput descriptionLte(String descriptionLte) {
    
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


  public ContentLibraryImageWhereInput descriptionNot(String descriptionNot) {
    
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


  public ContentLibraryImageWhereInput descriptionNotContains(String descriptionNotContains) {
    
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


  public ContentLibraryImageWhereInput descriptionNotEndsWith(String descriptionNotEndsWith) {
    
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


  public ContentLibraryImageWhereInput descriptionNotIn(List<String> descriptionNotIn) {
    
    this.descriptionNotIn = descriptionNotIn;
    return this;
  }

  public ContentLibraryImageWhereInput addDescriptionNotInItem(String descriptionNotInItem) {
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


  public ContentLibraryImageWhereInput descriptionNotStartsWith(String descriptionNotStartsWith) {
    
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


  public ContentLibraryImageWhereInput descriptionStartsWith(String descriptionStartsWith) {
    
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


  public ContentLibraryImageWhereInput elfImagesEvery(ElfImageWhereInput elfImagesEvery) {
    
    this.elfImagesEvery = elfImagesEvery;
    return this;
  }

   /**
   * Get elfImagesEvery
   * @return elfImagesEvery
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ElfImageWhereInput getElfImagesEvery() {
    return elfImagesEvery;
  }


  public void setElfImagesEvery(ElfImageWhereInput elfImagesEvery) {
    this.elfImagesEvery = elfImagesEvery;
  }


  public ContentLibraryImageWhereInput elfImagesNone(ElfImageWhereInput elfImagesNone) {
    
    this.elfImagesNone = elfImagesNone;
    return this;
  }

   /**
   * Get elfImagesNone
   * @return elfImagesNone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ElfImageWhereInput getElfImagesNone() {
    return elfImagesNone;
  }


  public void setElfImagesNone(ElfImageWhereInput elfImagesNone) {
    this.elfImagesNone = elfImagesNone;
  }


  public ContentLibraryImageWhereInput elfImagesSome(ElfImageWhereInput elfImagesSome) {
    
    this.elfImagesSome = elfImagesSome;
    return this;
  }

   /**
   * Get elfImagesSome
   * @return elfImagesSome
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ElfImageWhereInput getElfImagesSome() {
    return elfImagesSome;
  }


  public void setElfImagesSome(ElfImageWhereInput elfImagesSome) {
    this.elfImagesSome = elfImagesSome;
  }


  public ContentLibraryImageWhereInput entityAsyncStatus(EntityAsyncStatus entityAsyncStatus) {
    
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


  public ContentLibraryImageWhereInput entityAsyncStatusIn(List<EntityAsyncStatus> entityAsyncStatusIn) {
    
    this.entityAsyncStatusIn = entityAsyncStatusIn;
    return this;
  }

  public ContentLibraryImageWhereInput addEntityAsyncStatusInItem(EntityAsyncStatus entityAsyncStatusInItem) {
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


  public ContentLibraryImageWhereInput entityAsyncStatusNot(EntityAsyncStatus entityAsyncStatusNot) {
    
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


  public ContentLibraryImageWhereInput entityAsyncStatusNotIn(List<EntityAsyncStatus> entityAsyncStatusNotIn) {
    
    this.entityAsyncStatusNotIn = entityAsyncStatusNotIn;
    return this;
  }

  public ContentLibraryImageWhereInput addEntityAsyncStatusNotInItem(EntityAsyncStatus entityAsyncStatusNotInItem) {
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


  public ContentLibraryImageWhereInput id(String id) {
    
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


  public ContentLibraryImageWhereInput idContains(String idContains) {
    
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


  public ContentLibraryImageWhereInput idEndsWith(String idEndsWith) {
    
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


  public ContentLibraryImageWhereInput idGt(String idGt) {
    
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


  public ContentLibraryImageWhereInput idGte(String idGte) {
    
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


  public ContentLibraryImageWhereInput idIn(List<String> idIn) {
    
    this.idIn = idIn;
    return this;
  }

  public ContentLibraryImageWhereInput addIdInItem(String idInItem) {
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


  public ContentLibraryImageWhereInput idLt(String idLt) {
    
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


  public ContentLibraryImageWhereInput idLte(String idLte) {
    
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


  public ContentLibraryImageWhereInput idNot(String idNot) {
    
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


  public ContentLibraryImageWhereInput idNotContains(String idNotContains) {
    
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


  public ContentLibraryImageWhereInput idNotEndsWith(String idNotEndsWith) {
    
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


  public ContentLibraryImageWhereInput idNotIn(List<String> idNotIn) {
    
    this.idNotIn = idNotIn;
    return this;
  }

  public ContentLibraryImageWhereInput addIdNotInItem(String idNotInItem) {
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


  public ContentLibraryImageWhereInput idNotStartsWith(String idNotStartsWith) {
    
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


  public ContentLibraryImageWhereInput idStartsWith(String idStartsWith) {
    
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


  public ContentLibraryImageWhereInput iscsiLunsEvery(IscsiLunWhereInput iscsiLunsEvery) {
    
    this.iscsiLunsEvery = iscsiLunsEvery;
    return this;
  }

   /**
   * Get iscsiLunsEvery
   * @return iscsiLunsEvery
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public IscsiLunWhereInput getIscsiLunsEvery() {
    return iscsiLunsEvery;
  }


  public void setIscsiLunsEvery(IscsiLunWhereInput iscsiLunsEvery) {
    this.iscsiLunsEvery = iscsiLunsEvery;
  }


  public ContentLibraryImageWhereInput iscsiLunsNone(IscsiLunWhereInput iscsiLunsNone) {
    
    this.iscsiLunsNone = iscsiLunsNone;
    return this;
  }

   /**
   * Get iscsiLunsNone
   * @return iscsiLunsNone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public IscsiLunWhereInput getIscsiLunsNone() {
    return iscsiLunsNone;
  }


  public void setIscsiLunsNone(IscsiLunWhereInput iscsiLunsNone) {
    this.iscsiLunsNone = iscsiLunsNone;
  }


  public ContentLibraryImageWhereInput iscsiLunsSome(IscsiLunWhereInput iscsiLunsSome) {
    
    this.iscsiLunsSome = iscsiLunsSome;
    return this;
  }

   /**
   * Get iscsiLunsSome
   * @return iscsiLunsSome
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public IscsiLunWhereInput getIscsiLunsSome() {
    return iscsiLunsSome;
  }


  public void setIscsiLunsSome(IscsiLunWhereInput iscsiLunsSome) {
    this.iscsiLunsSome = iscsiLunsSome;
  }


  public ContentLibraryImageWhereInput labelsEvery(LabelWhereInput labelsEvery) {
    
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


  public ContentLibraryImageWhereInput labelsNone(LabelWhereInput labelsNone) {
    
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


  public ContentLibraryImageWhereInput labelsSome(LabelWhereInput labelsSome) {
    
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


  public ContentLibraryImageWhereInput name(String name) {
    
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


  public ContentLibraryImageWhereInput nameContains(String nameContains) {
    
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


  public ContentLibraryImageWhereInput nameEndsWith(String nameEndsWith) {
    
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


  public ContentLibraryImageWhereInput nameGt(String nameGt) {
    
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


  public ContentLibraryImageWhereInput nameGte(String nameGte) {
    
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


  public ContentLibraryImageWhereInput nameIn(List<String> nameIn) {
    
    this.nameIn = nameIn;
    return this;
  }

  public ContentLibraryImageWhereInput addNameInItem(String nameInItem) {
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


  public ContentLibraryImageWhereInput nameLt(String nameLt) {
    
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


  public ContentLibraryImageWhereInput nameLte(String nameLte) {
    
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


  public ContentLibraryImageWhereInput nameNot(String nameNot) {
    
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


  public ContentLibraryImageWhereInput nameNotContains(String nameNotContains) {
    
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


  public ContentLibraryImageWhereInput nameNotEndsWith(String nameNotEndsWith) {
    
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


  public ContentLibraryImageWhereInput nameNotIn(List<String> nameNotIn) {
    
    this.nameNotIn = nameNotIn;
    return this;
  }

  public ContentLibraryImageWhereInput addNameNotInItem(String nameNotInItem) {
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


  public ContentLibraryImageWhereInput nameNotStartsWith(String nameNotStartsWith) {
    
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


  public ContentLibraryImageWhereInput nameStartsWith(String nameStartsWith) {
    
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


  public ContentLibraryImageWhereInput path(String path) {
    
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


  public ContentLibraryImageWhereInput pathContains(String pathContains) {
    
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


  public ContentLibraryImageWhereInput pathEndsWith(String pathEndsWith) {
    
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


  public ContentLibraryImageWhereInput pathGt(String pathGt) {
    
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


  public ContentLibraryImageWhereInput pathGte(String pathGte) {
    
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


  public ContentLibraryImageWhereInput pathIn(List<String> pathIn) {
    
    this.pathIn = pathIn;
    return this;
  }

  public ContentLibraryImageWhereInput addPathInItem(String pathInItem) {
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


  public ContentLibraryImageWhereInput pathLt(String pathLt) {
    
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


  public ContentLibraryImageWhereInput pathLte(String pathLte) {
    
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


  public ContentLibraryImageWhereInput pathNot(String pathNot) {
    
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


  public ContentLibraryImageWhereInput pathNotContains(String pathNotContains) {
    
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


  public ContentLibraryImageWhereInput pathNotEndsWith(String pathNotEndsWith) {
    
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


  public ContentLibraryImageWhereInput pathNotIn(List<String> pathNotIn) {
    
    this.pathNotIn = pathNotIn;
    return this;
  }

  public ContentLibraryImageWhereInput addPathNotInItem(String pathNotInItem) {
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


  public ContentLibraryImageWhereInput pathNotStartsWith(String pathNotStartsWith) {
    
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


  public ContentLibraryImageWhereInput pathStartsWith(String pathStartsWith) {
    
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


  public ContentLibraryImageWhereInput size(Long size) {
    
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


  public ContentLibraryImageWhereInput sizeGt(Long sizeGt) {
    
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


  public ContentLibraryImageWhereInput sizeGte(Long sizeGte) {
    
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


  public ContentLibraryImageWhereInput sizeIn(List<Long> sizeIn) {
    
    this.sizeIn = sizeIn;
    return this;
  }

  public ContentLibraryImageWhereInput addSizeInItem(Long sizeInItem) {
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


  public ContentLibraryImageWhereInput sizeLt(Long sizeLt) {
    
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


  public ContentLibraryImageWhereInput sizeLte(Long sizeLte) {
    
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


  public ContentLibraryImageWhereInput sizeNot(Long sizeNot) {
    
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


  public ContentLibraryImageWhereInput sizeNotIn(List<Long> sizeNotIn) {
    
    this.sizeNotIn = sizeNotIn;
    return this;
  }

  public ContentLibraryImageWhereInput addSizeNotInItem(Long sizeNotInItem) {
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


  public ContentLibraryImageWhereInput vmDisksEvery(VmDiskWhereInput vmDisksEvery) {
    
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


  public ContentLibraryImageWhereInput vmDisksNone(VmDiskWhereInput vmDisksNone) {
    
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


  public ContentLibraryImageWhereInput vmDisksSome(VmDiskWhereInput vmDisksSome) {
    
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


  public ContentLibraryImageWhereInput vmSnapshotsEvery(VmSnapshotWhereInput vmSnapshotsEvery) {
    
    this.vmSnapshotsEvery = vmSnapshotsEvery;
    return this;
  }

   /**
   * Get vmSnapshotsEvery
   * @return vmSnapshotsEvery
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VmSnapshotWhereInput getVmSnapshotsEvery() {
    return vmSnapshotsEvery;
  }


  public void setVmSnapshotsEvery(VmSnapshotWhereInput vmSnapshotsEvery) {
    this.vmSnapshotsEvery = vmSnapshotsEvery;
  }


  public ContentLibraryImageWhereInput vmSnapshotsNone(VmSnapshotWhereInput vmSnapshotsNone) {
    
    this.vmSnapshotsNone = vmSnapshotsNone;
    return this;
  }

   /**
   * Get vmSnapshotsNone
   * @return vmSnapshotsNone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VmSnapshotWhereInput getVmSnapshotsNone() {
    return vmSnapshotsNone;
  }


  public void setVmSnapshotsNone(VmSnapshotWhereInput vmSnapshotsNone) {
    this.vmSnapshotsNone = vmSnapshotsNone;
  }


  public ContentLibraryImageWhereInput vmSnapshotsSome(VmSnapshotWhereInput vmSnapshotsSome) {
    
    this.vmSnapshotsSome = vmSnapshotsSome;
    return this;
  }

   /**
   * Get vmSnapshotsSome
   * @return vmSnapshotsSome
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VmSnapshotWhereInput getVmSnapshotsSome() {
    return vmSnapshotsSome;
  }


  public void setVmSnapshotsSome(VmSnapshotWhereInput vmSnapshotsSome) {
    this.vmSnapshotsSome = vmSnapshotsSome;
  }


  public ContentLibraryImageWhereInput vmTemplatesEvery(VmTemplateWhereInput vmTemplatesEvery) {
    
    this.vmTemplatesEvery = vmTemplatesEvery;
    return this;
  }

   /**
   * Get vmTemplatesEvery
   * @return vmTemplatesEvery
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VmTemplateWhereInput getVmTemplatesEvery() {
    return vmTemplatesEvery;
  }


  public void setVmTemplatesEvery(VmTemplateWhereInput vmTemplatesEvery) {
    this.vmTemplatesEvery = vmTemplatesEvery;
  }


  public ContentLibraryImageWhereInput vmTemplatesNone(VmTemplateWhereInput vmTemplatesNone) {
    
    this.vmTemplatesNone = vmTemplatesNone;
    return this;
  }

   /**
   * Get vmTemplatesNone
   * @return vmTemplatesNone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VmTemplateWhereInput getVmTemplatesNone() {
    return vmTemplatesNone;
  }


  public void setVmTemplatesNone(VmTemplateWhereInput vmTemplatesNone) {
    this.vmTemplatesNone = vmTemplatesNone;
  }


  public ContentLibraryImageWhereInput vmTemplatesSome(VmTemplateWhereInput vmTemplatesSome) {
    
    this.vmTemplatesSome = vmTemplatesSome;
    return this;
  }

   /**
   * Get vmTemplatesSome
   * @return vmTemplatesSome
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VmTemplateWhereInput getVmTemplatesSome() {
    return vmTemplatesSome;
  }


  public void setVmTemplatesSome(VmTemplateWhereInput vmTemplatesSome) {
    this.vmTemplatesSome = vmTemplatesSome;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContentLibraryImageWhereInput contentLibraryImageWhereInput = (ContentLibraryImageWhereInput) o;
    return Objects.equals(this.AND, contentLibraryImageWhereInput.AND) &&
        Objects.equals(this.NOT, contentLibraryImageWhereInput.NOT) &&
        Objects.equals(this.OR, contentLibraryImageWhereInput.OR) &&
        Objects.equals(this.clustersEvery, contentLibraryImageWhereInput.clustersEvery) &&
        Objects.equals(this.clustersNone, contentLibraryImageWhereInput.clustersNone) &&
        Objects.equals(this.clustersSome, contentLibraryImageWhereInput.clustersSome) &&
        Objects.equals(this.createdAt, contentLibraryImageWhereInput.createdAt) &&
        Objects.equals(this.createdAtGt, contentLibraryImageWhereInput.createdAtGt) &&
        Objects.equals(this.createdAtGte, contentLibraryImageWhereInput.createdAtGte) &&
        Objects.equals(this.createdAtIn, contentLibraryImageWhereInput.createdAtIn) &&
        Objects.equals(this.createdAtLt, contentLibraryImageWhereInput.createdAtLt) &&
        Objects.equals(this.createdAtLte, contentLibraryImageWhereInput.createdAtLte) &&
        Objects.equals(this.createdAtNot, contentLibraryImageWhereInput.createdAtNot) &&
        Objects.equals(this.createdAtNotIn, contentLibraryImageWhereInput.createdAtNotIn) &&
        Objects.equals(this.description, contentLibraryImageWhereInput.description) &&
        Objects.equals(this.descriptionContains, contentLibraryImageWhereInput.descriptionContains) &&
        Objects.equals(this.descriptionEndsWith, contentLibraryImageWhereInput.descriptionEndsWith) &&
        Objects.equals(this.descriptionGt, contentLibraryImageWhereInput.descriptionGt) &&
        Objects.equals(this.descriptionGte, contentLibraryImageWhereInput.descriptionGte) &&
        Objects.equals(this.descriptionIn, contentLibraryImageWhereInput.descriptionIn) &&
        Objects.equals(this.descriptionLt, contentLibraryImageWhereInput.descriptionLt) &&
        Objects.equals(this.descriptionLte, contentLibraryImageWhereInput.descriptionLte) &&
        Objects.equals(this.descriptionNot, contentLibraryImageWhereInput.descriptionNot) &&
        Objects.equals(this.descriptionNotContains, contentLibraryImageWhereInput.descriptionNotContains) &&
        Objects.equals(this.descriptionNotEndsWith, contentLibraryImageWhereInput.descriptionNotEndsWith) &&
        Objects.equals(this.descriptionNotIn, contentLibraryImageWhereInput.descriptionNotIn) &&
        Objects.equals(this.descriptionNotStartsWith, contentLibraryImageWhereInput.descriptionNotStartsWith) &&
        Objects.equals(this.descriptionStartsWith, contentLibraryImageWhereInput.descriptionStartsWith) &&
        Objects.equals(this.elfImagesEvery, contentLibraryImageWhereInput.elfImagesEvery) &&
        Objects.equals(this.elfImagesNone, contentLibraryImageWhereInput.elfImagesNone) &&
        Objects.equals(this.elfImagesSome, contentLibraryImageWhereInput.elfImagesSome) &&
        Objects.equals(this.entityAsyncStatus, contentLibraryImageWhereInput.entityAsyncStatus) &&
        Objects.equals(this.entityAsyncStatusIn, contentLibraryImageWhereInput.entityAsyncStatusIn) &&
        Objects.equals(this.entityAsyncStatusNot, contentLibraryImageWhereInput.entityAsyncStatusNot) &&
        Objects.equals(this.entityAsyncStatusNotIn, contentLibraryImageWhereInput.entityAsyncStatusNotIn) &&
        Objects.equals(this.id, contentLibraryImageWhereInput.id) &&
        Objects.equals(this.idContains, contentLibraryImageWhereInput.idContains) &&
        Objects.equals(this.idEndsWith, contentLibraryImageWhereInput.idEndsWith) &&
        Objects.equals(this.idGt, contentLibraryImageWhereInput.idGt) &&
        Objects.equals(this.idGte, contentLibraryImageWhereInput.idGte) &&
        Objects.equals(this.idIn, contentLibraryImageWhereInput.idIn) &&
        Objects.equals(this.idLt, contentLibraryImageWhereInput.idLt) &&
        Objects.equals(this.idLte, contentLibraryImageWhereInput.idLte) &&
        Objects.equals(this.idNot, contentLibraryImageWhereInput.idNot) &&
        Objects.equals(this.idNotContains, contentLibraryImageWhereInput.idNotContains) &&
        Objects.equals(this.idNotEndsWith, contentLibraryImageWhereInput.idNotEndsWith) &&
        Objects.equals(this.idNotIn, contentLibraryImageWhereInput.idNotIn) &&
        Objects.equals(this.idNotStartsWith, contentLibraryImageWhereInput.idNotStartsWith) &&
        Objects.equals(this.idStartsWith, contentLibraryImageWhereInput.idStartsWith) &&
        Objects.equals(this.iscsiLunsEvery, contentLibraryImageWhereInput.iscsiLunsEvery) &&
        Objects.equals(this.iscsiLunsNone, contentLibraryImageWhereInput.iscsiLunsNone) &&
        Objects.equals(this.iscsiLunsSome, contentLibraryImageWhereInput.iscsiLunsSome) &&
        Objects.equals(this.labelsEvery, contentLibraryImageWhereInput.labelsEvery) &&
        Objects.equals(this.labelsNone, contentLibraryImageWhereInput.labelsNone) &&
        Objects.equals(this.labelsSome, contentLibraryImageWhereInput.labelsSome) &&
        Objects.equals(this.name, contentLibraryImageWhereInput.name) &&
        Objects.equals(this.nameContains, contentLibraryImageWhereInput.nameContains) &&
        Objects.equals(this.nameEndsWith, contentLibraryImageWhereInput.nameEndsWith) &&
        Objects.equals(this.nameGt, contentLibraryImageWhereInput.nameGt) &&
        Objects.equals(this.nameGte, contentLibraryImageWhereInput.nameGte) &&
        Objects.equals(this.nameIn, contentLibraryImageWhereInput.nameIn) &&
        Objects.equals(this.nameLt, contentLibraryImageWhereInput.nameLt) &&
        Objects.equals(this.nameLte, contentLibraryImageWhereInput.nameLte) &&
        Objects.equals(this.nameNot, contentLibraryImageWhereInput.nameNot) &&
        Objects.equals(this.nameNotContains, contentLibraryImageWhereInput.nameNotContains) &&
        Objects.equals(this.nameNotEndsWith, contentLibraryImageWhereInput.nameNotEndsWith) &&
        Objects.equals(this.nameNotIn, contentLibraryImageWhereInput.nameNotIn) &&
        Objects.equals(this.nameNotStartsWith, contentLibraryImageWhereInput.nameNotStartsWith) &&
        Objects.equals(this.nameStartsWith, contentLibraryImageWhereInput.nameStartsWith) &&
        Objects.equals(this.path, contentLibraryImageWhereInput.path) &&
        Objects.equals(this.pathContains, contentLibraryImageWhereInput.pathContains) &&
        Objects.equals(this.pathEndsWith, contentLibraryImageWhereInput.pathEndsWith) &&
        Objects.equals(this.pathGt, contentLibraryImageWhereInput.pathGt) &&
        Objects.equals(this.pathGte, contentLibraryImageWhereInput.pathGte) &&
        Objects.equals(this.pathIn, contentLibraryImageWhereInput.pathIn) &&
        Objects.equals(this.pathLt, contentLibraryImageWhereInput.pathLt) &&
        Objects.equals(this.pathLte, contentLibraryImageWhereInput.pathLte) &&
        Objects.equals(this.pathNot, contentLibraryImageWhereInput.pathNot) &&
        Objects.equals(this.pathNotContains, contentLibraryImageWhereInput.pathNotContains) &&
        Objects.equals(this.pathNotEndsWith, contentLibraryImageWhereInput.pathNotEndsWith) &&
        Objects.equals(this.pathNotIn, contentLibraryImageWhereInput.pathNotIn) &&
        Objects.equals(this.pathNotStartsWith, contentLibraryImageWhereInput.pathNotStartsWith) &&
        Objects.equals(this.pathStartsWith, contentLibraryImageWhereInput.pathStartsWith) &&
        Objects.equals(this.size, contentLibraryImageWhereInput.size) &&
        Objects.equals(this.sizeGt, contentLibraryImageWhereInput.sizeGt) &&
        Objects.equals(this.sizeGte, contentLibraryImageWhereInput.sizeGte) &&
        Objects.equals(this.sizeIn, contentLibraryImageWhereInput.sizeIn) &&
        Objects.equals(this.sizeLt, contentLibraryImageWhereInput.sizeLt) &&
        Objects.equals(this.sizeLte, contentLibraryImageWhereInput.sizeLte) &&
        Objects.equals(this.sizeNot, contentLibraryImageWhereInput.sizeNot) &&
        Objects.equals(this.sizeNotIn, contentLibraryImageWhereInput.sizeNotIn) &&
        Objects.equals(this.vmDisksEvery, contentLibraryImageWhereInput.vmDisksEvery) &&
        Objects.equals(this.vmDisksNone, contentLibraryImageWhereInput.vmDisksNone) &&
        Objects.equals(this.vmDisksSome, contentLibraryImageWhereInput.vmDisksSome) &&
        Objects.equals(this.vmSnapshotsEvery, contentLibraryImageWhereInput.vmSnapshotsEvery) &&
        Objects.equals(this.vmSnapshotsNone, contentLibraryImageWhereInput.vmSnapshotsNone) &&
        Objects.equals(this.vmSnapshotsSome, contentLibraryImageWhereInput.vmSnapshotsSome) &&
        Objects.equals(this.vmTemplatesEvery, contentLibraryImageWhereInput.vmTemplatesEvery) &&
        Objects.equals(this.vmTemplatesNone, contentLibraryImageWhereInput.vmTemplatesNone) &&
        Objects.equals(this.vmTemplatesSome, contentLibraryImageWhereInput.vmTemplatesSome);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(AND, NOT, OR, clustersEvery, clustersNone, clustersSome, createdAt, createdAtGt, createdAtGte, createdAtIn, createdAtLt, createdAtLte, createdAtNot, createdAtNotIn, description, descriptionContains, descriptionEndsWith, descriptionGt, descriptionGte, descriptionIn, descriptionLt, descriptionLte, descriptionNot, descriptionNotContains, descriptionNotEndsWith, descriptionNotIn, descriptionNotStartsWith, descriptionStartsWith, elfImagesEvery, elfImagesNone, elfImagesSome, entityAsyncStatus, entityAsyncStatusIn, entityAsyncStatusNot, entityAsyncStatusNotIn, id, idContains, idEndsWith, idGt, idGte, idIn, idLt, idLte, idNot, idNotContains, idNotEndsWith, idNotIn, idNotStartsWith, idStartsWith, iscsiLunsEvery, iscsiLunsNone, iscsiLunsSome, labelsEvery, labelsNone, labelsSome, name, nameContains, nameEndsWith, nameGt, nameGte, nameIn, nameLt, nameLte, nameNot, nameNotContains, nameNotEndsWith, nameNotIn, nameNotStartsWith, nameStartsWith, path, pathContains, pathEndsWith, pathGt, pathGte, pathIn, pathLt, pathLte, pathNot, pathNotContains, pathNotEndsWith, pathNotIn, pathNotStartsWith, pathStartsWith, size, sizeGt, sizeGte, sizeIn, sizeLt, sizeLte, sizeNot, sizeNotIn, vmDisksEvery, vmDisksNone, vmDisksSome, vmSnapshotsEvery, vmSnapshotsNone, vmSnapshotsSome, vmTemplatesEvery, vmTemplatesNone, vmTemplatesSome);
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
    sb.append("class ContentLibraryImageWhereInput {\n");
    sb.append("    AND: ").append(toIndentedString(AND)).append("\n");
    sb.append("    NOT: ").append(toIndentedString(NOT)).append("\n");
    sb.append("    OR: ").append(toIndentedString(OR)).append("\n");
    sb.append("    clustersEvery: ").append(toIndentedString(clustersEvery)).append("\n");
    sb.append("    clustersNone: ").append(toIndentedString(clustersNone)).append("\n");
    sb.append("    clustersSome: ").append(toIndentedString(clustersSome)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    createdAtGt: ").append(toIndentedString(createdAtGt)).append("\n");
    sb.append("    createdAtGte: ").append(toIndentedString(createdAtGte)).append("\n");
    sb.append("    createdAtIn: ").append(toIndentedString(createdAtIn)).append("\n");
    sb.append("    createdAtLt: ").append(toIndentedString(createdAtLt)).append("\n");
    sb.append("    createdAtLte: ").append(toIndentedString(createdAtLte)).append("\n");
    sb.append("    createdAtNot: ").append(toIndentedString(createdAtNot)).append("\n");
    sb.append("    createdAtNotIn: ").append(toIndentedString(createdAtNotIn)).append("\n");
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
    sb.append("    elfImagesEvery: ").append(toIndentedString(elfImagesEvery)).append("\n");
    sb.append("    elfImagesNone: ").append(toIndentedString(elfImagesNone)).append("\n");
    sb.append("    elfImagesSome: ").append(toIndentedString(elfImagesSome)).append("\n");
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
    sb.append("    iscsiLunsEvery: ").append(toIndentedString(iscsiLunsEvery)).append("\n");
    sb.append("    iscsiLunsNone: ").append(toIndentedString(iscsiLunsNone)).append("\n");
    sb.append("    iscsiLunsSome: ").append(toIndentedString(iscsiLunsSome)).append("\n");
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
    sb.append("    vmDisksEvery: ").append(toIndentedString(vmDisksEvery)).append("\n");
    sb.append("    vmDisksNone: ").append(toIndentedString(vmDisksNone)).append("\n");
    sb.append("    vmDisksSome: ").append(toIndentedString(vmDisksSome)).append("\n");
    sb.append("    vmSnapshotsEvery: ").append(toIndentedString(vmSnapshotsEvery)).append("\n");
    sb.append("    vmSnapshotsNone: ").append(toIndentedString(vmSnapshotsNone)).append("\n");
    sb.append("    vmSnapshotsSome: ").append(toIndentedString(vmSnapshotsSome)).append("\n");
    sb.append("    vmTemplatesEvery: ").append(toIndentedString(vmTemplatesEvery)).append("\n");
    sb.append("    vmTemplatesNone: ").append(toIndentedString(vmTemplatesNone)).append("\n");
    sb.append("    vmTemplatesSome: ").append(toIndentedString(vmTemplatesSome)).append("\n");
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

