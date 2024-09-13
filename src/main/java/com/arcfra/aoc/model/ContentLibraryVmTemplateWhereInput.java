package com.arcfra.aoc.model;

import java.util.Objects;
import java.util.Arrays;
import com.arcfra.aoc.model.Architecture;
import com.arcfra.aoc.model.ClusterWhereInput;
import com.arcfra.aoc.model.EntityAsyncStatus;
import com.arcfra.aoc.model.LabelWhereInput;
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
 * ContentLibraryVmTemplateWhereInput
 */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class ContentLibraryVmTemplateWhereInput {
  public static final String SERIALIZED_NAME_A_N_D = "AND";
  @SerializedName(SERIALIZED_NAME_A_N_D)
  private List<ContentLibraryVmTemplateWhereInput> AND = null;

  public static final String SERIALIZED_NAME_N_O_T = "NOT";
  @SerializedName(SERIALIZED_NAME_N_O_T)
  private List<ContentLibraryVmTemplateWhereInput> NOT = null;

  public static final String SERIALIZED_NAME_O_R = "OR";
  @SerializedName(SERIALIZED_NAME_O_R)
  private List<ContentLibraryVmTemplateWhereInput> OR = null;

  public static final String SERIALIZED_NAME_ARCHITECTURE = "architecture";
  @SerializedName(SERIALIZED_NAME_ARCHITECTURE)
  private Architecture architecture;

  public static final String SERIALIZED_NAME_ARCHITECTURE_IN = "architecture_in";
  @SerializedName(SERIALIZED_NAME_ARCHITECTURE_IN)
  private List<Architecture> architectureIn = null;

  public static final String SERIALIZED_NAME_ARCHITECTURE_NOT = "architecture_not";
  @SerializedName(SERIALIZED_NAME_ARCHITECTURE_NOT)
  private Architecture architectureNot;

  public static final String SERIALIZED_NAME_ARCHITECTURE_NOT_IN = "architecture_not_in";
  @SerializedName(SERIALIZED_NAME_ARCHITECTURE_NOT_IN)
  private List<Architecture> architectureNotIn = null;

  public static final String SERIALIZED_NAME_CLOUD_INIT_SUPPORTED = "cloud_init_supported";
  @SerializedName(SERIALIZED_NAME_CLOUD_INIT_SUPPORTED)
  private Boolean cloudInitSupported;

  public static final String SERIALIZED_NAME_CLOUD_INIT_SUPPORTED_NOT = "cloud_init_supported_not";
  @SerializedName(SERIALIZED_NAME_CLOUD_INIT_SUPPORTED_NOT)
  private Boolean cloudInitSupportedNot;

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

  public static final String SERIALIZED_NAME_LABELS_EVERY = "labels_every";
  @SerializedName(SERIALIZED_NAME_LABELS_EVERY)
  private LabelWhereInput labelsEvery;

  public static final String SERIALIZED_NAME_LABELS_NONE = "labels_none";
  @SerializedName(SERIALIZED_NAME_LABELS_NONE)
  private LabelWhereInput labelsNone;

  public static final String SERIALIZED_NAME_LABELS_SOME = "labels_some";
  @SerializedName(SERIALIZED_NAME_LABELS_SOME)
  private LabelWhereInput labelsSome;

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

  public static final String SERIALIZED_NAME_VM_TEMPLATES_EVERY = "vm_templates_every";
  @SerializedName(SERIALIZED_NAME_VM_TEMPLATES_EVERY)
  private VmTemplateWhereInput vmTemplatesEvery;

  public static final String SERIALIZED_NAME_VM_TEMPLATES_NONE = "vm_templates_none";
  @SerializedName(SERIALIZED_NAME_VM_TEMPLATES_NONE)
  private VmTemplateWhereInput vmTemplatesNone;

  public static final String SERIALIZED_NAME_VM_TEMPLATES_SOME = "vm_templates_some";
  @SerializedName(SERIALIZED_NAME_VM_TEMPLATES_SOME)
  private VmTemplateWhereInput vmTemplatesSome;

  public ContentLibraryVmTemplateWhereInput() { 
  }

  public ContentLibraryVmTemplateWhereInput AND(List<ContentLibraryVmTemplateWhereInput> AND) {
    
    this.AND = AND;
    return this;
  }

  public ContentLibraryVmTemplateWhereInput addANDItem(ContentLibraryVmTemplateWhereInput ANDItem) {
    if (this.AND == null) {
      this.AND = new ArrayList<ContentLibraryVmTemplateWhereInput>();
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

  public List<ContentLibraryVmTemplateWhereInput> getAND() {
    return AND;
  }


  public void setAND(List<ContentLibraryVmTemplateWhereInput> AND) {
    this.AND = AND;
  }


  public ContentLibraryVmTemplateWhereInput NOT(List<ContentLibraryVmTemplateWhereInput> NOT) {
    
    this.NOT = NOT;
    return this;
  }

  public ContentLibraryVmTemplateWhereInput addNOTItem(ContentLibraryVmTemplateWhereInput NOTItem) {
    if (this.NOT == null) {
      this.NOT = new ArrayList<ContentLibraryVmTemplateWhereInput>();
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

  public List<ContentLibraryVmTemplateWhereInput> getNOT() {
    return NOT;
  }


  public void setNOT(List<ContentLibraryVmTemplateWhereInput> NOT) {
    this.NOT = NOT;
  }


  public ContentLibraryVmTemplateWhereInput OR(List<ContentLibraryVmTemplateWhereInput> OR) {
    
    this.OR = OR;
    return this;
  }

  public ContentLibraryVmTemplateWhereInput addORItem(ContentLibraryVmTemplateWhereInput ORItem) {
    if (this.OR == null) {
      this.OR = new ArrayList<ContentLibraryVmTemplateWhereInput>();
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

  public List<ContentLibraryVmTemplateWhereInput> getOR() {
    return OR;
  }


  public void setOR(List<ContentLibraryVmTemplateWhereInput> OR) {
    this.OR = OR;
  }


  public ContentLibraryVmTemplateWhereInput architecture(Architecture architecture) {
    
    this.architecture = architecture;
    return this;
  }

   /**
   * Get architecture
   * @return architecture
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Architecture getArchitecture() {
    return architecture;
  }


  public void setArchitecture(Architecture architecture) {
    this.architecture = architecture;
  }


  public ContentLibraryVmTemplateWhereInput architectureIn(List<Architecture> architectureIn) {
    
    this.architectureIn = architectureIn;
    return this;
  }

  public ContentLibraryVmTemplateWhereInput addArchitectureInItem(Architecture architectureInItem) {
    if (this.architectureIn == null) {
      this.architectureIn = new ArrayList<Architecture>();
    }
    this.architectureIn.add(architectureInItem);
    return this;
  }

   /**
   * Get architectureIn
   * @return architectureIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Architecture> getArchitectureIn() {
    return architectureIn;
  }


  public void setArchitectureIn(List<Architecture> architectureIn) {
    this.architectureIn = architectureIn;
  }


  public ContentLibraryVmTemplateWhereInput architectureNot(Architecture architectureNot) {
    
    this.architectureNot = architectureNot;
    return this;
  }

   /**
   * Get architectureNot
   * @return architectureNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Architecture getArchitectureNot() {
    return architectureNot;
  }


  public void setArchitectureNot(Architecture architectureNot) {
    this.architectureNot = architectureNot;
  }


  public ContentLibraryVmTemplateWhereInput architectureNotIn(List<Architecture> architectureNotIn) {
    
    this.architectureNotIn = architectureNotIn;
    return this;
  }

  public ContentLibraryVmTemplateWhereInput addArchitectureNotInItem(Architecture architectureNotInItem) {
    if (this.architectureNotIn == null) {
      this.architectureNotIn = new ArrayList<Architecture>();
    }
    this.architectureNotIn.add(architectureNotInItem);
    return this;
  }

   /**
   * Get architectureNotIn
   * @return architectureNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Architecture> getArchitectureNotIn() {
    return architectureNotIn;
  }


  public void setArchitectureNotIn(List<Architecture> architectureNotIn) {
    this.architectureNotIn = architectureNotIn;
  }


  public ContentLibraryVmTemplateWhereInput cloudInitSupported(Boolean cloudInitSupported) {
    
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


  public ContentLibraryVmTemplateWhereInput cloudInitSupportedNot(Boolean cloudInitSupportedNot) {
    
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


  public ContentLibraryVmTemplateWhereInput clustersEvery(ClusterWhereInput clustersEvery) {
    
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


  public ContentLibraryVmTemplateWhereInput clustersNone(ClusterWhereInput clustersNone) {
    
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


  public ContentLibraryVmTemplateWhereInput clustersSome(ClusterWhereInput clustersSome) {
    
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


  public ContentLibraryVmTemplateWhereInput createdAt(String createdAt) {
    
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


  public ContentLibraryVmTemplateWhereInput createdAtGt(String createdAtGt) {
    
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


  public ContentLibraryVmTemplateWhereInput createdAtGte(String createdAtGte) {
    
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


  public ContentLibraryVmTemplateWhereInput createdAtIn(List<String> createdAtIn) {
    
    this.createdAtIn = createdAtIn;
    return this;
  }

  public ContentLibraryVmTemplateWhereInput addCreatedAtInItem(String createdAtInItem) {
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


  public ContentLibraryVmTemplateWhereInput createdAtLt(String createdAtLt) {
    
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


  public ContentLibraryVmTemplateWhereInput createdAtLte(String createdAtLte) {
    
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


  public ContentLibraryVmTemplateWhereInput createdAtNot(String createdAtNot) {
    
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


  public ContentLibraryVmTemplateWhereInput createdAtNotIn(List<String> createdAtNotIn) {
    
    this.createdAtNotIn = createdAtNotIn;
    return this;
  }

  public ContentLibraryVmTemplateWhereInput addCreatedAtNotInItem(String createdAtNotInItem) {
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


  public ContentLibraryVmTemplateWhereInput description(String description) {
    
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


  public ContentLibraryVmTemplateWhereInput descriptionContains(String descriptionContains) {
    
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


  public ContentLibraryVmTemplateWhereInput descriptionEndsWith(String descriptionEndsWith) {
    
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


  public ContentLibraryVmTemplateWhereInput descriptionGt(String descriptionGt) {
    
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


  public ContentLibraryVmTemplateWhereInput descriptionGte(String descriptionGte) {
    
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


  public ContentLibraryVmTemplateWhereInput descriptionIn(List<String> descriptionIn) {
    
    this.descriptionIn = descriptionIn;
    return this;
  }

  public ContentLibraryVmTemplateWhereInput addDescriptionInItem(String descriptionInItem) {
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


  public ContentLibraryVmTemplateWhereInput descriptionLt(String descriptionLt) {
    
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


  public ContentLibraryVmTemplateWhereInput descriptionLte(String descriptionLte) {
    
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


  public ContentLibraryVmTemplateWhereInput descriptionNot(String descriptionNot) {
    
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


  public ContentLibraryVmTemplateWhereInput descriptionNotContains(String descriptionNotContains) {
    
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


  public ContentLibraryVmTemplateWhereInput descriptionNotEndsWith(String descriptionNotEndsWith) {
    
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


  public ContentLibraryVmTemplateWhereInput descriptionNotIn(List<String> descriptionNotIn) {
    
    this.descriptionNotIn = descriptionNotIn;
    return this;
  }

  public ContentLibraryVmTemplateWhereInput addDescriptionNotInItem(String descriptionNotInItem) {
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


  public ContentLibraryVmTemplateWhereInput descriptionNotStartsWith(String descriptionNotStartsWith) {
    
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


  public ContentLibraryVmTemplateWhereInput descriptionStartsWith(String descriptionStartsWith) {
    
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


  public ContentLibraryVmTemplateWhereInput entityAsyncStatus(EntityAsyncStatus entityAsyncStatus) {
    
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


  public ContentLibraryVmTemplateWhereInput entityAsyncStatusIn(List<EntityAsyncStatus> entityAsyncStatusIn) {
    
    this.entityAsyncStatusIn = entityAsyncStatusIn;
    return this;
  }

  public ContentLibraryVmTemplateWhereInput addEntityAsyncStatusInItem(EntityAsyncStatus entityAsyncStatusInItem) {
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


  public ContentLibraryVmTemplateWhereInput entityAsyncStatusNot(EntityAsyncStatus entityAsyncStatusNot) {
    
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


  public ContentLibraryVmTemplateWhereInput entityAsyncStatusNotIn(List<EntityAsyncStatus> entityAsyncStatusNotIn) {
    
    this.entityAsyncStatusNotIn = entityAsyncStatusNotIn;
    return this;
  }

  public ContentLibraryVmTemplateWhereInput addEntityAsyncStatusNotInItem(EntityAsyncStatus entityAsyncStatusNotInItem) {
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


  public ContentLibraryVmTemplateWhereInput id(String id) {
    
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


  public ContentLibraryVmTemplateWhereInput idContains(String idContains) {
    
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


  public ContentLibraryVmTemplateWhereInput idEndsWith(String idEndsWith) {
    
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


  public ContentLibraryVmTemplateWhereInput idGt(String idGt) {
    
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


  public ContentLibraryVmTemplateWhereInput idGte(String idGte) {
    
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


  public ContentLibraryVmTemplateWhereInput idIn(List<String> idIn) {
    
    this.idIn = idIn;
    return this;
  }

  public ContentLibraryVmTemplateWhereInput addIdInItem(String idInItem) {
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


  public ContentLibraryVmTemplateWhereInput idLt(String idLt) {
    
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


  public ContentLibraryVmTemplateWhereInput idLte(String idLte) {
    
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


  public ContentLibraryVmTemplateWhereInput idNot(String idNot) {
    
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


  public ContentLibraryVmTemplateWhereInput idNotContains(String idNotContains) {
    
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


  public ContentLibraryVmTemplateWhereInput idNotEndsWith(String idNotEndsWith) {
    
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


  public ContentLibraryVmTemplateWhereInput idNotIn(List<String> idNotIn) {
    
    this.idNotIn = idNotIn;
    return this;
  }

  public ContentLibraryVmTemplateWhereInput addIdNotInItem(String idNotInItem) {
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


  public ContentLibraryVmTemplateWhereInput idNotStartsWith(String idNotStartsWith) {
    
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


  public ContentLibraryVmTemplateWhereInput idStartsWith(String idStartsWith) {
    
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


  public ContentLibraryVmTemplateWhereInput labelsEvery(LabelWhereInput labelsEvery) {
    
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


  public ContentLibraryVmTemplateWhereInput labelsNone(LabelWhereInput labelsNone) {
    
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


  public ContentLibraryVmTemplateWhereInput labelsSome(LabelWhereInput labelsSome) {
    
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


  public ContentLibraryVmTemplateWhereInput memory(Long memory) {
    
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


  public ContentLibraryVmTemplateWhereInput memoryGt(Long memoryGt) {
    
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


  public ContentLibraryVmTemplateWhereInput memoryGte(Long memoryGte) {
    
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


  public ContentLibraryVmTemplateWhereInput memoryIn(List<Long> memoryIn) {
    
    this.memoryIn = memoryIn;
    return this;
  }

  public ContentLibraryVmTemplateWhereInput addMemoryInItem(Long memoryInItem) {
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


  public ContentLibraryVmTemplateWhereInput memoryLt(Long memoryLt) {
    
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


  public ContentLibraryVmTemplateWhereInput memoryLte(Long memoryLte) {
    
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


  public ContentLibraryVmTemplateWhereInput memoryNot(Long memoryNot) {
    
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


  public ContentLibraryVmTemplateWhereInput memoryNotIn(List<Long> memoryNotIn) {
    
    this.memoryNotIn = memoryNotIn;
    return this;
  }

  public ContentLibraryVmTemplateWhereInput addMemoryNotInItem(Long memoryNotInItem) {
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


  public ContentLibraryVmTemplateWhereInput name(String name) {
    
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


  public ContentLibraryVmTemplateWhereInput nameContains(String nameContains) {
    
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


  public ContentLibraryVmTemplateWhereInput nameEndsWith(String nameEndsWith) {
    
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


  public ContentLibraryVmTemplateWhereInput nameGt(String nameGt) {
    
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


  public ContentLibraryVmTemplateWhereInput nameGte(String nameGte) {
    
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


  public ContentLibraryVmTemplateWhereInput nameIn(List<String> nameIn) {
    
    this.nameIn = nameIn;
    return this;
  }

  public ContentLibraryVmTemplateWhereInput addNameInItem(String nameInItem) {
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


  public ContentLibraryVmTemplateWhereInput nameLt(String nameLt) {
    
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


  public ContentLibraryVmTemplateWhereInput nameLte(String nameLte) {
    
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


  public ContentLibraryVmTemplateWhereInput nameNot(String nameNot) {
    
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


  public ContentLibraryVmTemplateWhereInput nameNotContains(String nameNotContains) {
    
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


  public ContentLibraryVmTemplateWhereInput nameNotEndsWith(String nameNotEndsWith) {
    
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


  public ContentLibraryVmTemplateWhereInput nameNotIn(List<String> nameNotIn) {
    
    this.nameNotIn = nameNotIn;
    return this;
  }

  public ContentLibraryVmTemplateWhereInput addNameNotInItem(String nameNotInItem) {
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


  public ContentLibraryVmTemplateWhereInput nameNotStartsWith(String nameNotStartsWith) {
    
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


  public ContentLibraryVmTemplateWhereInput nameStartsWith(String nameStartsWith) {
    
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


  public ContentLibraryVmTemplateWhereInput os(String os) {
    
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


  public ContentLibraryVmTemplateWhereInput osContains(String osContains) {
    
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


  public ContentLibraryVmTemplateWhereInput osEndsWith(String osEndsWith) {
    
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


  public ContentLibraryVmTemplateWhereInput osGt(String osGt) {
    
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


  public ContentLibraryVmTemplateWhereInput osGte(String osGte) {
    
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


  public ContentLibraryVmTemplateWhereInput osIn(List<String> osIn) {
    
    this.osIn = osIn;
    return this;
  }

  public ContentLibraryVmTemplateWhereInput addOsInItem(String osInItem) {
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


  public ContentLibraryVmTemplateWhereInput osLt(String osLt) {
    
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


  public ContentLibraryVmTemplateWhereInput osLte(String osLte) {
    
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


  public ContentLibraryVmTemplateWhereInput osNot(String osNot) {
    
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


  public ContentLibraryVmTemplateWhereInput osNotContains(String osNotContains) {
    
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


  public ContentLibraryVmTemplateWhereInput osNotEndsWith(String osNotEndsWith) {
    
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


  public ContentLibraryVmTemplateWhereInput osNotIn(List<String> osNotIn) {
    
    this.osNotIn = osNotIn;
    return this;
  }

  public ContentLibraryVmTemplateWhereInput addOsNotInItem(String osNotInItem) {
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


  public ContentLibraryVmTemplateWhereInput osNotStartsWith(String osNotStartsWith) {
    
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


  public ContentLibraryVmTemplateWhereInput osStartsWith(String osStartsWith) {
    
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


  public ContentLibraryVmTemplateWhereInput size(Long size) {
    
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


  public ContentLibraryVmTemplateWhereInput sizeGt(Long sizeGt) {
    
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


  public ContentLibraryVmTemplateWhereInput sizeGte(Long sizeGte) {
    
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


  public ContentLibraryVmTemplateWhereInput sizeIn(List<Long> sizeIn) {
    
    this.sizeIn = sizeIn;
    return this;
  }

  public ContentLibraryVmTemplateWhereInput addSizeInItem(Long sizeInItem) {
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


  public ContentLibraryVmTemplateWhereInput sizeLt(Long sizeLt) {
    
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


  public ContentLibraryVmTemplateWhereInput sizeLte(Long sizeLte) {
    
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


  public ContentLibraryVmTemplateWhereInput sizeNot(Long sizeNot) {
    
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


  public ContentLibraryVmTemplateWhereInput sizeNotIn(List<Long> sizeNotIn) {
    
    this.sizeNotIn = sizeNotIn;
    return this;
  }

  public ContentLibraryVmTemplateWhereInput addSizeNotInItem(Long sizeNotInItem) {
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


  public ContentLibraryVmTemplateWhereInput vcpu(Integer vcpu) {
    
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


  public ContentLibraryVmTemplateWhereInput vcpuGt(Integer vcpuGt) {
    
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


  public ContentLibraryVmTemplateWhereInput vcpuGte(Integer vcpuGte) {
    
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


  public ContentLibraryVmTemplateWhereInput vcpuIn(List<Integer> vcpuIn) {
    
    this.vcpuIn = vcpuIn;
    return this;
  }

  public ContentLibraryVmTemplateWhereInput addVcpuInItem(Integer vcpuInItem) {
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


  public ContentLibraryVmTemplateWhereInput vcpuLt(Integer vcpuLt) {
    
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


  public ContentLibraryVmTemplateWhereInput vcpuLte(Integer vcpuLte) {
    
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


  public ContentLibraryVmTemplateWhereInput vcpuNot(Integer vcpuNot) {
    
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


  public ContentLibraryVmTemplateWhereInput vcpuNotIn(List<Integer> vcpuNotIn) {
    
    this.vcpuNotIn = vcpuNotIn;
    return this;
  }

  public ContentLibraryVmTemplateWhereInput addVcpuNotInItem(Integer vcpuNotInItem) {
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


  public ContentLibraryVmTemplateWhereInput vmTemplatesEvery(VmTemplateWhereInput vmTemplatesEvery) {
    
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


  public ContentLibraryVmTemplateWhereInput vmTemplatesNone(VmTemplateWhereInput vmTemplatesNone) {
    
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


  public ContentLibraryVmTemplateWhereInput vmTemplatesSome(VmTemplateWhereInput vmTemplatesSome) {
    
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
    ContentLibraryVmTemplateWhereInput contentLibraryVmTemplateWhereInput = (ContentLibraryVmTemplateWhereInput) o;
    return Objects.equals(this.AND, contentLibraryVmTemplateWhereInput.AND) &&
        Objects.equals(this.NOT, contentLibraryVmTemplateWhereInput.NOT) &&
        Objects.equals(this.OR, contentLibraryVmTemplateWhereInput.OR) &&
        Objects.equals(this.architecture, contentLibraryVmTemplateWhereInput.architecture) &&
        Objects.equals(this.architectureIn, contentLibraryVmTemplateWhereInput.architectureIn) &&
        Objects.equals(this.architectureNot, contentLibraryVmTemplateWhereInput.architectureNot) &&
        Objects.equals(this.architectureNotIn, contentLibraryVmTemplateWhereInput.architectureNotIn) &&
        Objects.equals(this.cloudInitSupported, contentLibraryVmTemplateWhereInput.cloudInitSupported) &&
        Objects.equals(this.cloudInitSupportedNot, contentLibraryVmTemplateWhereInput.cloudInitSupportedNot) &&
        Objects.equals(this.clustersEvery, contentLibraryVmTemplateWhereInput.clustersEvery) &&
        Objects.equals(this.clustersNone, contentLibraryVmTemplateWhereInput.clustersNone) &&
        Objects.equals(this.clustersSome, contentLibraryVmTemplateWhereInput.clustersSome) &&
        Objects.equals(this.createdAt, contentLibraryVmTemplateWhereInput.createdAt) &&
        Objects.equals(this.createdAtGt, contentLibraryVmTemplateWhereInput.createdAtGt) &&
        Objects.equals(this.createdAtGte, contentLibraryVmTemplateWhereInput.createdAtGte) &&
        Objects.equals(this.createdAtIn, contentLibraryVmTemplateWhereInput.createdAtIn) &&
        Objects.equals(this.createdAtLt, contentLibraryVmTemplateWhereInput.createdAtLt) &&
        Objects.equals(this.createdAtLte, contentLibraryVmTemplateWhereInput.createdAtLte) &&
        Objects.equals(this.createdAtNot, contentLibraryVmTemplateWhereInput.createdAtNot) &&
        Objects.equals(this.createdAtNotIn, contentLibraryVmTemplateWhereInput.createdAtNotIn) &&
        Objects.equals(this.description, contentLibraryVmTemplateWhereInput.description) &&
        Objects.equals(this.descriptionContains, contentLibraryVmTemplateWhereInput.descriptionContains) &&
        Objects.equals(this.descriptionEndsWith, contentLibraryVmTemplateWhereInput.descriptionEndsWith) &&
        Objects.equals(this.descriptionGt, contentLibraryVmTemplateWhereInput.descriptionGt) &&
        Objects.equals(this.descriptionGte, contentLibraryVmTemplateWhereInput.descriptionGte) &&
        Objects.equals(this.descriptionIn, contentLibraryVmTemplateWhereInput.descriptionIn) &&
        Objects.equals(this.descriptionLt, contentLibraryVmTemplateWhereInput.descriptionLt) &&
        Objects.equals(this.descriptionLte, contentLibraryVmTemplateWhereInput.descriptionLte) &&
        Objects.equals(this.descriptionNot, contentLibraryVmTemplateWhereInput.descriptionNot) &&
        Objects.equals(this.descriptionNotContains, contentLibraryVmTemplateWhereInput.descriptionNotContains) &&
        Objects.equals(this.descriptionNotEndsWith, contentLibraryVmTemplateWhereInput.descriptionNotEndsWith) &&
        Objects.equals(this.descriptionNotIn, contentLibraryVmTemplateWhereInput.descriptionNotIn) &&
        Objects.equals(this.descriptionNotStartsWith, contentLibraryVmTemplateWhereInput.descriptionNotStartsWith) &&
        Objects.equals(this.descriptionStartsWith, contentLibraryVmTemplateWhereInput.descriptionStartsWith) &&
        Objects.equals(this.entityAsyncStatus, contentLibraryVmTemplateWhereInput.entityAsyncStatus) &&
        Objects.equals(this.entityAsyncStatusIn, contentLibraryVmTemplateWhereInput.entityAsyncStatusIn) &&
        Objects.equals(this.entityAsyncStatusNot, contentLibraryVmTemplateWhereInput.entityAsyncStatusNot) &&
        Objects.equals(this.entityAsyncStatusNotIn, contentLibraryVmTemplateWhereInput.entityAsyncStatusNotIn) &&
        Objects.equals(this.id, contentLibraryVmTemplateWhereInput.id) &&
        Objects.equals(this.idContains, contentLibraryVmTemplateWhereInput.idContains) &&
        Objects.equals(this.idEndsWith, contentLibraryVmTemplateWhereInput.idEndsWith) &&
        Objects.equals(this.idGt, contentLibraryVmTemplateWhereInput.idGt) &&
        Objects.equals(this.idGte, contentLibraryVmTemplateWhereInput.idGte) &&
        Objects.equals(this.idIn, contentLibraryVmTemplateWhereInput.idIn) &&
        Objects.equals(this.idLt, contentLibraryVmTemplateWhereInput.idLt) &&
        Objects.equals(this.idLte, contentLibraryVmTemplateWhereInput.idLte) &&
        Objects.equals(this.idNot, contentLibraryVmTemplateWhereInput.idNot) &&
        Objects.equals(this.idNotContains, contentLibraryVmTemplateWhereInput.idNotContains) &&
        Objects.equals(this.idNotEndsWith, contentLibraryVmTemplateWhereInput.idNotEndsWith) &&
        Objects.equals(this.idNotIn, contentLibraryVmTemplateWhereInput.idNotIn) &&
        Objects.equals(this.idNotStartsWith, contentLibraryVmTemplateWhereInput.idNotStartsWith) &&
        Objects.equals(this.idStartsWith, contentLibraryVmTemplateWhereInput.idStartsWith) &&
        Objects.equals(this.labelsEvery, contentLibraryVmTemplateWhereInput.labelsEvery) &&
        Objects.equals(this.labelsNone, contentLibraryVmTemplateWhereInput.labelsNone) &&
        Objects.equals(this.labelsSome, contentLibraryVmTemplateWhereInput.labelsSome) &&
        Objects.equals(this.memory, contentLibraryVmTemplateWhereInput.memory) &&
        Objects.equals(this.memoryGt, contentLibraryVmTemplateWhereInput.memoryGt) &&
        Objects.equals(this.memoryGte, contentLibraryVmTemplateWhereInput.memoryGte) &&
        Objects.equals(this.memoryIn, contentLibraryVmTemplateWhereInput.memoryIn) &&
        Objects.equals(this.memoryLt, contentLibraryVmTemplateWhereInput.memoryLt) &&
        Objects.equals(this.memoryLte, contentLibraryVmTemplateWhereInput.memoryLte) &&
        Objects.equals(this.memoryNot, contentLibraryVmTemplateWhereInput.memoryNot) &&
        Objects.equals(this.memoryNotIn, contentLibraryVmTemplateWhereInput.memoryNotIn) &&
        Objects.equals(this.name, contentLibraryVmTemplateWhereInput.name) &&
        Objects.equals(this.nameContains, contentLibraryVmTemplateWhereInput.nameContains) &&
        Objects.equals(this.nameEndsWith, contentLibraryVmTemplateWhereInput.nameEndsWith) &&
        Objects.equals(this.nameGt, contentLibraryVmTemplateWhereInput.nameGt) &&
        Objects.equals(this.nameGte, contentLibraryVmTemplateWhereInput.nameGte) &&
        Objects.equals(this.nameIn, contentLibraryVmTemplateWhereInput.nameIn) &&
        Objects.equals(this.nameLt, contentLibraryVmTemplateWhereInput.nameLt) &&
        Objects.equals(this.nameLte, contentLibraryVmTemplateWhereInput.nameLte) &&
        Objects.equals(this.nameNot, contentLibraryVmTemplateWhereInput.nameNot) &&
        Objects.equals(this.nameNotContains, contentLibraryVmTemplateWhereInput.nameNotContains) &&
        Objects.equals(this.nameNotEndsWith, contentLibraryVmTemplateWhereInput.nameNotEndsWith) &&
        Objects.equals(this.nameNotIn, contentLibraryVmTemplateWhereInput.nameNotIn) &&
        Objects.equals(this.nameNotStartsWith, contentLibraryVmTemplateWhereInput.nameNotStartsWith) &&
        Objects.equals(this.nameStartsWith, contentLibraryVmTemplateWhereInput.nameStartsWith) &&
        Objects.equals(this.os, contentLibraryVmTemplateWhereInput.os) &&
        Objects.equals(this.osContains, contentLibraryVmTemplateWhereInput.osContains) &&
        Objects.equals(this.osEndsWith, contentLibraryVmTemplateWhereInput.osEndsWith) &&
        Objects.equals(this.osGt, contentLibraryVmTemplateWhereInput.osGt) &&
        Objects.equals(this.osGte, contentLibraryVmTemplateWhereInput.osGte) &&
        Objects.equals(this.osIn, contentLibraryVmTemplateWhereInput.osIn) &&
        Objects.equals(this.osLt, contentLibraryVmTemplateWhereInput.osLt) &&
        Objects.equals(this.osLte, contentLibraryVmTemplateWhereInput.osLte) &&
        Objects.equals(this.osNot, contentLibraryVmTemplateWhereInput.osNot) &&
        Objects.equals(this.osNotContains, contentLibraryVmTemplateWhereInput.osNotContains) &&
        Objects.equals(this.osNotEndsWith, contentLibraryVmTemplateWhereInput.osNotEndsWith) &&
        Objects.equals(this.osNotIn, contentLibraryVmTemplateWhereInput.osNotIn) &&
        Objects.equals(this.osNotStartsWith, contentLibraryVmTemplateWhereInput.osNotStartsWith) &&
        Objects.equals(this.osStartsWith, contentLibraryVmTemplateWhereInput.osStartsWith) &&
        Objects.equals(this.size, contentLibraryVmTemplateWhereInput.size) &&
        Objects.equals(this.sizeGt, contentLibraryVmTemplateWhereInput.sizeGt) &&
        Objects.equals(this.sizeGte, contentLibraryVmTemplateWhereInput.sizeGte) &&
        Objects.equals(this.sizeIn, contentLibraryVmTemplateWhereInput.sizeIn) &&
        Objects.equals(this.sizeLt, contentLibraryVmTemplateWhereInput.sizeLt) &&
        Objects.equals(this.sizeLte, contentLibraryVmTemplateWhereInput.sizeLte) &&
        Objects.equals(this.sizeNot, contentLibraryVmTemplateWhereInput.sizeNot) &&
        Objects.equals(this.sizeNotIn, contentLibraryVmTemplateWhereInput.sizeNotIn) &&
        Objects.equals(this.vcpu, contentLibraryVmTemplateWhereInput.vcpu) &&
        Objects.equals(this.vcpuGt, contentLibraryVmTemplateWhereInput.vcpuGt) &&
        Objects.equals(this.vcpuGte, contentLibraryVmTemplateWhereInput.vcpuGte) &&
        Objects.equals(this.vcpuIn, contentLibraryVmTemplateWhereInput.vcpuIn) &&
        Objects.equals(this.vcpuLt, contentLibraryVmTemplateWhereInput.vcpuLt) &&
        Objects.equals(this.vcpuLte, contentLibraryVmTemplateWhereInput.vcpuLte) &&
        Objects.equals(this.vcpuNot, contentLibraryVmTemplateWhereInput.vcpuNot) &&
        Objects.equals(this.vcpuNotIn, contentLibraryVmTemplateWhereInput.vcpuNotIn) &&
        Objects.equals(this.vmTemplatesEvery, contentLibraryVmTemplateWhereInput.vmTemplatesEvery) &&
        Objects.equals(this.vmTemplatesNone, contentLibraryVmTemplateWhereInput.vmTemplatesNone) &&
        Objects.equals(this.vmTemplatesSome, contentLibraryVmTemplateWhereInput.vmTemplatesSome);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(AND, NOT, OR, architecture, architectureIn, architectureNot, architectureNotIn, cloudInitSupported, cloudInitSupportedNot, clustersEvery, clustersNone, clustersSome, createdAt, createdAtGt, createdAtGte, createdAtIn, createdAtLt, createdAtLte, createdAtNot, createdAtNotIn, description, descriptionContains, descriptionEndsWith, descriptionGt, descriptionGte, descriptionIn, descriptionLt, descriptionLte, descriptionNot, descriptionNotContains, descriptionNotEndsWith, descriptionNotIn, descriptionNotStartsWith, descriptionStartsWith, entityAsyncStatus, entityAsyncStatusIn, entityAsyncStatusNot, entityAsyncStatusNotIn, id, idContains, idEndsWith, idGt, idGte, idIn, idLt, idLte, idNot, idNotContains, idNotEndsWith, idNotIn, idNotStartsWith, idStartsWith, labelsEvery, labelsNone, labelsSome, memory, memoryGt, memoryGte, memoryIn, memoryLt, memoryLte, memoryNot, memoryNotIn, name, nameContains, nameEndsWith, nameGt, nameGte, nameIn, nameLt, nameLte, nameNot, nameNotContains, nameNotEndsWith, nameNotIn, nameNotStartsWith, nameStartsWith, os, osContains, osEndsWith, osGt, osGte, osIn, osLt, osLte, osNot, osNotContains, osNotEndsWith, osNotIn, osNotStartsWith, osStartsWith, size, sizeGt, sizeGte, sizeIn, sizeLt, sizeLte, sizeNot, sizeNotIn, vcpu, vcpuGt, vcpuGte, vcpuIn, vcpuLt, vcpuLte, vcpuNot, vcpuNotIn, vmTemplatesEvery, vmTemplatesNone, vmTemplatesSome);
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
    sb.append("class ContentLibraryVmTemplateWhereInput {\n");
    sb.append("    AND: ").append(toIndentedString(AND)).append("\n");
    sb.append("    NOT: ").append(toIndentedString(NOT)).append("\n");
    sb.append("    OR: ").append(toIndentedString(OR)).append("\n");
    sb.append("    architecture: ").append(toIndentedString(architecture)).append("\n");
    sb.append("    architectureIn: ").append(toIndentedString(architectureIn)).append("\n");
    sb.append("    architectureNot: ").append(toIndentedString(architectureNot)).append("\n");
    sb.append("    architectureNotIn: ").append(toIndentedString(architectureNotIn)).append("\n");
    sb.append("    cloudInitSupported: ").append(toIndentedString(cloudInitSupported)).append("\n");
    sb.append("    cloudInitSupportedNot: ").append(toIndentedString(cloudInitSupportedNot)).append("\n");
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
    sb.append("    labelsEvery: ").append(toIndentedString(labelsEvery)).append("\n");
    sb.append("    labelsNone: ").append(toIndentedString(labelsNone)).append("\n");
    sb.append("    labelsSome: ").append(toIndentedString(labelsSome)).append("\n");
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

