package com.arcfra.aoc.model;

import java.util.Objects;
import java.util.Arrays;
import com.arcfra.aoc.model.UploadResourceType;
import com.arcfra.aoc.model.UploadTaskStatus;
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
 * UploadTaskWhereInput
 */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class UploadTaskWhereInput {
  public static final String SERIALIZED_NAME_A_N_D = "AND";
  @SerializedName(SERIALIZED_NAME_A_N_D)
  private List<UploadTaskWhereInput> AND = null;

  public static final String SERIALIZED_NAME_N_O_T = "NOT";
  @SerializedName(SERIALIZED_NAME_N_O_T)
  private List<UploadTaskWhereInput> NOT = null;

  public static final String SERIALIZED_NAME_O_R = "OR";
  @SerializedName(SERIALIZED_NAME_O_R)
  private List<UploadTaskWhereInput> OR = null;

  public static final String SERIALIZED_NAME_CHUNK_SIZE = "chunk_size";
  @SerializedName(SERIALIZED_NAME_CHUNK_SIZE)
  private Long chunkSize;

  public static final String SERIALIZED_NAME_CHUNK_SIZE_GT = "chunk_size_gt";
  @SerializedName(SERIALIZED_NAME_CHUNK_SIZE_GT)
  private Long chunkSizeGt;

  public static final String SERIALIZED_NAME_CHUNK_SIZE_GTE = "chunk_size_gte";
  @SerializedName(SERIALIZED_NAME_CHUNK_SIZE_GTE)
  private Long chunkSizeGte;

  public static final String SERIALIZED_NAME_CHUNK_SIZE_IN = "chunk_size_in";
  @SerializedName(SERIALIZED_NAME_CHUNK_SIZE_IN)
  private List<Long> chunkSizeIn = null;

  public static final String SERIALIZED_NAME_CHUNK_SIZE_LT = "chunk_size_lt";
  @SerializedName(SERIALIZED_NAME_CHUNK_SIZE_LT)
  private Long chunkSizeLt;

  public static final String SERIALIZED_NAME_CHUNK_SIZE_LTE = "chunk_size_lte";
  @SerializedName(SERIALIZED_NAME_CHUNK_SIZE_LTE)
  private Long chunkSizeLte;

  public static final String SERIALIZED_NAME_CHUNK_SIZE_NOT = "chunk_size_not";
  @SerializedName(SERIALIZED_NAME_CHUNK_SIZE_NOT)
  private Long chunkSizeNot;

  public static final String SERIALIZED_NAME_CHUNK_SIZE_NOT_IN = "chunk_size_not_in";
  @SerializedName(SERIALIZED_NAME_CHUNK_SIZE_NOT_IN)
  private List<Long> chunkSizeNotIn = null;

  public static final String SERIALIZED_NAME_CURRENT_CHUNK = "current_chunk";
  @SerializedName(SERIALIZED_NAME_CURRENT_CHUNK)
  private Integer currentChunk;

  public static final String SERIALIZED_NAME_CURRENT_CHUNK_GT = "current_chunk_gt";
  @SerializedName(SERIALIZED_NAME_CURRENT_CHUNK_GT)
  private Integer currentChunkGt;

  public static final String SERIALIZED_NAME_CURRENT_CHUNK_GTE = "current_chunk_gte";
  @SerializedName(SERIALIZED_NAME_CURRENT_CHUNK_GTE)
  private Integer currentChunkGte;

  public static final String SERIALIZED_NAME_CURRENT_CHUNK_IN = "current_chunk_in";
  @SerializedName(SERIALIZED_NAME_CURRENT_CHUNK_IN)
  private List<Integer> currentChunkIn = null;

  public static final String SERIALIZED_NAME_CURRENT_CHUNK_LT = "current_chunk_lt";
  @SerializedName(SERIALIZED_NAME_CURRENT_CHUNK_LT)
  private Integer currentChunkLt;

  public static final String SERIALIZED_NAME_CURRENT_CHUNK_LTE = "current_chunk_lte";
  @SerializedName(SERIALIZED_NAME_CURRENT_CHUNK_LTE)
  private Integer currentChunkLte;

  public static final String SERIALIZED_NAME_CURRENT_CHUNK_NOT = "current_chunk_not";
  @SerializedName(SERIALIZED_NAME_CURRENT_CHUNK_NOT)
  private Integer currentChunkNot;

  public static final String SERIALIZED_NAME_CURRENT_CHUNK_NOT_IN = "current_chunk_not_in";
  @SerializedName(SERIALIZED_NAME_CURRENT_CHUNK_NOT_IN)
  private List<Integer> currentChunkNotIn = null;

  public static final String SERIALIZED_NAME_FINISHED_AT = "finished_at";
  @SerializedName(SERIALIZED_NAME_FINISHED_AT)
  private String finishedAt;

  public static final String SERIALIZED_NAME_FINISHED_AT_GT = "finished_at_gt";
  @SerializedName(SERIALIZED_NAME_FINISHED_AT_GT)
  private String finishedAtGt;

  public static final String SERIALIZED_NAME_FINISHED_AT_GTE = "finished_at_gte";
  @SerializedName(SERIALIZED_NAME_FINISHED_AT_GTE)
  private String finishedAtGte;

  public static final String SERIALIZED_NAME_FINISHED_AT_IN = "finished_at_in";
  @SerializedName(SERIALIZED_NAME_FINISHED_AT_IN)
  private List<String> finishedAtIn = null;

  public static final String SERIALIZED_NAME_FINISHED_AT_LT = "finished_at_lt";
  @SerializedName(SERIALIZED_NAME_FINISHED_AT_LT)
  private String finishedAtLt;

  public static final String SERIALIZED_NAME_FINISHED_AT_LTE = "finished_at_lte";
  @SerializedName(SERIALIZED_NAME_FINISHED_AT_LTE)
  private String finishedAtLte;

  public static final String SERIALIZED_NAME_FINISHED_AT_NOT = "finished_at_not";
  @SerializedName(SERIALIZED_NAME_FINISHED_AT_NOT)
  private String finishedAtNot;

  public static final String SERIALIZED_NAME_FINISHED_AT_NOT_IN = "finished_at_not_in";
  @SerializedName(SERIALIZED_NAME_FINISHED_AT_NOT_IN)
  private List<String> finishedAtNotIn = null;

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

  public static final String SERIALIZED_NAME_RESOURCE_TYPE = "resource_type";
  @SerializedName(SERIALIZED_NAME_RESOURCE_TYPE)
  private UploadResourceType resourceType;

  public static final String SERIALIZED_NAME_RESOURCE_TYPE_IN = "resource_type_in";
  @SerializedName(SERIALIZED_NAME_RESOURCE_TYPE_IN)
  private List<UploadResourceType> resourceTypeIn = null;

  public static final String SERIALIZED_NAME_RESOURCE_TYPE_NOT = "resource_type_not";
  @SerializedName(SERIALIZED_NAME_RESOURCE_TYPE_NOT)
  private UploadResourceType resourceTypeNot;

  public static final String SERIALIZED_NAME_RESOURCE_TYPE_NOT_IN = "resource_type_not_in";
  @SerializedName(SERIALIZED_NAME_RESOURCE_TYPE_NOT_IN)
  private List<UploadResourceType> resourceTypeNotIn = null;

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

  public static final String SERIALIZED_NAME_STARTED_AT = "started_at";
  @SerializedName(SERIALIZED_NAME_STARTED_AT)
  private String startedAt;

  public static final String SERIALIZED_NAME_STARTED_AT_GT = "started_at_gt";
  @SerializedName(SERIALIZED_NAME_STARTED_AT_GT)
  private String startedAtGt;

  public static final String SERIALIZED_NAME_STARTED_AT_GTE = "started_at_gte";
  @SerializedName(SERIALIZED_NAME_STARTED_AT_GTE)
  private String startedAtGte;

  public static final String SERIALIZED_NAME_STARTED_AT_IN = "started_at_in";
  @SerializedName(SERIALIZED_NAME_STARTED_AT_IN)
  private List<String> startedAtIn = null;

  public static final String SERIALIZED_NAME_STARTED_AT_LT = "started_at_lt";
  @SerializedName(SERIALIZED_NAME_STARTED_AT_LT)
  private String startedAtLt;

  public static final String SERIALIZED_NAME_STARTED_AT_LTE = "started_at_lte";
  @SerializedName(SERIALIZED_NAME_STARTED_AT_LTE)
  private String startedAtLte;

  public static final String SERIALIZED_NAME_STARTED_AT_NOT = "started_at_not";
  @SerializedName(SERIALIZED_NAME_STARTED_AT_NOT)
  private String startedAtNot;

  public static final String SERIALIZED_NAME_STARTED_AT_NOT_IN = "started_at_not_in";
  @SerializedName(SERIALIZED_NAME_STARTED_AT_NOT_IN)
  private List<String> startedAtNotIn = null;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private UploadTaskStatus status;

  public static final String SERIALIZED_NAME_STATUS_IN = "status_in";
  @SerializedName(SERIALIZED_NAME_STATUS_IN)
  private List<UploadTaskStatus> statusIn = null;

  public static final String SERIALIZED_NAME_STATUS_NOT = "status_not";
  @SerializedName(SERIALIZED_NAME_STATUS_NOT)
  private UploadTaskStatus statusNot;

  public static final String SERIALIZED_NAME_STATUS_NOT_IN = "status_not_in";
  @SerializedName(SERIALIZED_NAME_STATUS_NOT_IN)
  private List<UploadTaskStatus> statusNotIn = null;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updatedAt";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private String updatedAt;

  public static final String SERIALIZED_NAME_UPDATED_AT_GT = "updatedAt_gt";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT_GT)
  private String updatedAtGt;

  public static final String SERIALIZED_NAME_UPDATED_AT_GTE = "updatedAt_gte";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT_GTE)
  private String updatedAtGte;

  public static final String SERIALIZED_NAME_UPDATED_AT_IN = "updatedAt_in";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT_IN)
  private List<String> updatedAtIn = null;

  public static final String SERIALIZED_NAME_UPDATED_AT_LT = "updatedAt_lt";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT_LT)
  private String updatedAtLt;

  public static final String SERIALIZED_NAME_UPDATED_AT_LTE = "updatedAt_lte";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT_LTE)
  private String updatedAtLte;

  public static final String SERIALIZED_NAME_UPDATED_AT_NOT = "updatedAt_not";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT_NOT)
  private String updatedAtNot;

  public static final String SERIALIZED_NAME_UPDATED_AT_NOT_IN = "updatedAt_not_in";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT_NOT_IN)
  private List<String> updatedAtNotIn = null;

  public UploadTaskWhereInput() { 
  }

  public UploadTaskWhereInput AND(List<UploadTaskWhereInput> AND) {
    
    this.AND = AND;
    return this;
  }

  public UploadTaskWhereInput addANDItem(UploadTaskWhereInput ANDItem) {
    if (this.AND == null) {
      this.AND = new ArrayList<UploadTaskWhereInput>();
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

  public List<UploadTaskWhereInput> getAND() {
    return AND;
  }


  public void setAND(List<UploadTaskWhereInput> AND) {
    this.AND = AND;
  }


  public UploadTaskWhereInput NOT(List<UploadTaskWhereInput> NOT) {
    
    this.NOT = NOT;
    return this;
  }

  public UploadTaskWhereInput addNOTItem(UploadTaskWhereInput NOTItem) {
    if (this.NOT == null) {
      this.NOT = new ArrayList<UploadTaskWhereInput>();
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

  public List<UploadTaskWhereInput> getNOT() {
    return NOT;
  }


  public void setNOT(List<UploadTaskWhereInput> NOT) {
    this.NOT = NOT;
  }


  public UploadTaskWhereInput OR(List<UploadTaskWhereInput> OR) {
    
    this.OR = OR;
    return this;
  }

  public UploadTaskWhereInput addORItem(UploadTaskWhereInput ORItem) {
    if (this.OR == null) {
      this.OR = new ArrayList<UploadTaskWhereInput>();
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

  public List<UploadTaskWhereInput> getOR() {
    return OR;
  }


  public void setOR(List<UploadTaskWhereInput> OR) {
    this.OR = OR;
  }


  public UploadTaskWhereInput chunkSize(Long chunkSize) {
    
    this.chunkSize = chunkSize;
    return this;
  }

   /**
   * Get chunkSize
   * @return chunkSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getChunkSize() {
    return chunkSize;
  }


  public void setChunkSize(Long chunkSize) {
    this.chunkSize = chunkSize;
  }


  public UploadTaskWhereInput chunkSizeGt(Long chunkSizeGt) {
    
    this.chunkSizeGt = chunkSizeGt;
    return this;
  }

   /**
   * Get chunkSizeGt
   * @return chunkSizeGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getChunkSizeGt() {
    return chunkSizeGt;
  }


  public void setChunkSizeGt(Long chunkSizeGt) {
    this.chunkSizeGt = chunkSizeGt;
  }


  public UploadTaskWhereInput chunkSizeGte(Long chunkSizeGte) {
    
    this.chunkSizeGte = chunkSizeGte;
    return this;
  }

   /**
   * Get chunkSizeGte
   * @return chunkSizeGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getChunkSizeGte() {
    return chunkSizeGte;
  }


  public void setChunkSizeGte(Long chunkSizeGte) {
    this.chunkSizeGte = chunkSizeGte;
  }


  public UploadTaskWhereInput chunkSizeIn(List<Long> chunkSizeIn) {
    
    this.chunkSizeIn = chunkSizeIn;
    return this;
  }

  public UploadTaskWhereInput addChunkSizeInItem(Long chunkSizeInItem) {
    if (this.chunkSizeIn == null) {
      this.chunkSizeIn = new ArrayList<Long>();
    }
    this.chunkSizeIn.add(chunkSizeInItem);
    return this;
  }

   /**
   * Get chunkSizeIn
   * @return chunkSizeIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Long> getChunkSizeIn() {
    return chunkSizeIn;
  }


  public void setChunkSizeIn(List<Long> chunkSizeIn) {
    this.chunkSizeIn = chunkSizeIn;
  }


  public UploadTaskWhereInput chunkSizeLt(Long chunkSizeLt) {
    
    this.chunkSizeLt = chunkSizeLt;
    return this;
  }

   /**
   * Get chunkSizeLt
   * @return chunkSizeLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getChunkSizeLt() {
    return chunkSizeLt;
  }


  public void setChunkSizeLt(Long chunkSizeLt) {
    this.chunkSizeLt = chunkSizeLt;
  }


  public UploadTaskWhereInput chunkSizeLte(Long chunkSizeLte) {
    
    this.chunkSizeLte = chunkSizeLte;
    return this;
  }

   /**
   * Get chunkSizeLte
   * @return chunkSizeLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getChunkSizeLte() {
    return chunkSizeLte;
  }


  public void setChunkSizeLte(Long chunkSizeLte) {
    this.chunkSizeLte = chunkSizeLte;
  }


  public UploadTaskWhereInput chunkSizeNot(Long chunkSizeNot) {
    
    this.chunkSizeNot = chunkSizeNot;
    return this;
  }

   /**
   * Get chunkSizeNot
   * @return chunkSizeNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getChunkSizeNot() {
    return chunkSizeNot;
  }


  public void setChunkSizeNot(Long chunkSizeNot) {
    this.chunkSizeNot = chunkSizeNot;
  }


  public UploadTaskWhereInput chunkSizeNotIn(List<Long> chunkSizeNotIn) {
    
    this.chunkSizeNotIn = chunkSizeNotIn;
    return this;
  }

  public UploadTaskWhereInput addChunkSizeNotInItem(Long chunkSizeNotInItem) {
    if (this.chunkSizeNotIn == null) {
      this.chunkSizeNotIn = new ArrayList<Long>();
    }
    this.chunkSizeNotIn.add(chunkSizeNotInItem);
    return this;
  }

   /**
   * Get chunkSizeNotIn
   * @return chunkSizeNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Long> getChunkSizeNotIn() {
    return chunkSizeNotIn;
  }


  public void setChunkSizeNotIn(List<Long> chunkSizeNotIn) {
    this.chunkSizeNotIn = chunkSizeNotIn;
  }


  public UploadTaskWhereInput currentChunk(Integer currentChunk) {
    
    this.currentChunk = currentChunk;
    return this;
  }

   /**
   * Get currentChunk
   * @return currentChunk
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getCurrentChunk() {
    return currentChunk;
  }


  public void setCurrentChunk(Integer currentChunk) {
    this.currentChunk = currentChunk;
  }


  public UploadTaskWhereInput currentChunkGt(Integer currentChunkGt) {
    
    this.currentChunkGt = currentChunkGt;
    return this;
  }

   /**
   * Get currentChunkGt
   * @return currentChunkGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getCurrentChunkGt() {
    return currentChunkGt;
  }


  public void setCurrentChunkGt(Integer currentChunkGt) {
    this.currentChunkGt = currentChunkGt;
  }


  public UploadTaskWhereInput currentChunkGte(Integer currentChunkGte) {
    
    this.currentChunkGte = currentChunkGte;
    return this;
  }

   /**
   * Get currentChunkGte
   * @return currentChunkGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getCurrentChunkGte() {
    return currentChunkGte;
  }


  public void setCurrentChunkGte(Integer currentChunkGte) {
    this.currentChunkGte = currentChunkGte;
  }


  public UploadTaskWhereInput currentChunkIn(List<Integer> currentChunkIn) {
    
    this.currentChunkIn = currentChunkIn;
    return this;
  }

  public UploadTaskWhereInput addCurrentChunkInItem(Integer currentChunkInItem) {
    if (this.currentChunkIn == null) {
      this.currentChunkIn = new ArrayList<Integer>();
    }
    this.currentChunkIn.add(currentChunkInItem);
    return this;
  }

   /**
   * Get currentChunkIn
   * @return currentChunkIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Integer> getCurrentChunkIn() {
    return currentChunkIn;
  }


  public void setCurrentChunkIn(List<Integer> currentChunkIn) {
    this.currentChunkIn = currentChunkIn;
  }


  public UploadTaskWhereInput currentChunkLt(Integer currentChunkLt) {
    
    this.currentChunkLt = currentChunkLt;
    return this;
  }

   /**
   * Get currentChunkLt
   * @return currentChunkLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getCurrentChunkLt() {
    return currentChunkLt;
  }


  public void setCurrentChunkLt(Integer currentChunkLt) {
    this.currentChunkLt = currentChunkLt;
  }


  public UploadTaskWhereInput currentChunkLte(Integer currentChunkLte) {
    
    this.currentChunkLte = currentChunkLte;
    return this;
  }

   /**
   * Get currentChunkLte
   * @return currentChunkLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getCurrentChunkLte() {
    return currentChunkLte;
  }


  public void setCurrentChunkLte(Integer currentChunkLte) {
    this.currentChunkLte = currentChunkLte;
  }


  public UploadTaskWhereInput currentChunkNot(Integer currentChunkNot) {
    
    this.currentChunkNot = currentChunkNot;
    return this;
  }

   /**
   * Get currentChunkNot
   * @return currentChunkNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getCurrentChunkNot() {
    return currentChunkNot;
  }


  public void setCurrentChunkNot(Integer currentChunkNot) {
    this.currentChunkNot = currentChunkNot;
  }


  public UploadTaskWhereInput currentChunkNotIn(List<Integer> currentChunkNotIn) {
    
    this.currentChunkNotIn = currentChunkNotIn;
    return this;
  }

  public UploadTaskWhereInput addCurrentChunkNotInItem(Integer currentChunkNotInItem) {
    if (this.currentChunkNotIn == null) {
      this.currentChunkNotIn = new ArrayList<Integer>();
    }
    this.currentChunkNotIn.add(currentChunkNotInItem);
    return this;
  }

   /**
   * Get currentChunkNotIn
   * @return currentChunkNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Integer> getCurrentChunkNotIn() {
    return currentChunkNotIn;
  }


  public void setCurrentChunkNotIn(List<Integer> currentChunkNotIn) {
    this.currentChunkNotIn = currentChunkNotIn;
  }


  public UploadTaskWhereInput finishedAt(String finishedAt) {
    
    this.finishedAt = finishedAt;
    return this;
  }

   /**
   * Get finishedAt
   * @return finishedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getFinishedAt() {
    return finishedAt;
  }


  public void setFinishedAt(String finishedAt) {
    this.finishedAt = finishedAt;
  }


  public UploadTaskWhereInput finishedAtGt(String finishedAtGt) {
    
    this.finishedAtGt = finishedAtGt;
    return this;
  }

   /**
   * Get finishedAtGt
   * @return finishedAtGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getFinishedAtGt() {
    return finishedAtGt;
  }


  public void setFinishedAtGt(String finishedAtGt) {
    this.finishedAtGt = finishedAtGt;
  }


  public UploadTaskWhereInput finishedAtGte(String finishedAtGte) {
    
    this.finishedAtGte = finishedAtGte;
    return this;
  }

   /**
   * Get finishedAtGte
   * @return finishedAtGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getFinishedAtGte() {
    return finishedAtGte;
  }


  public void setFinishedAtGte(String finishedAtGte) {
    this.finishedAtGte = finishedAtGte;
  }


  public UploadTaskWhereInput finishedAtIn(List<String> finishedAtIn) {
    
    this.finishedAtIn = finishedAtIn;
    return this;
  }

  public UploadTaskWhereInput addFinishedAtInItem(String finishedAtInItem) {
    if (this.finishedAtIn == null) {
      this.finishedAtIn = new ArrayList<String>();
    }
    this.finishedAtIn.add(finishedAtInItem);
    return this;
  }

   /**
   * Get finishedAtIn
   * @return finishedAtIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getFinishedAtIn() {
    return finishedAtIn;
  }


  public void setFinishedAtIn(List<String> finishedAtIn) {
    this.finishedAtIn = finishedAtIn;
  }


  public UploadTaskWhereInput finishedAtLt(String finishedAtLt) {
    
    this.finishedAtLt = finishedAtLt;
    return this;
  }

   /**
   * Get finishedAtLt
   * @return finishedAtLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getFinishedAtLt() {
    return finishedAtLt;
  }


  public void setFinishedAtLt(String finishedAtLt) {
    this.finishedAtLt = finishedAtLt;
  }


  public UploadTaskWhereInput finishedAtLte(String finishedAtLte) {
    
    this.finishedAtLte = finishedAtLte;
    return this;
  }

   /**
   * Get finishedAtLte
   * @return finishedAtLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getFinishedAtLte() {
    return finishedAtLte;
  }


  public void setFinishedAtLte(String finishedAtLte) {
    this.finishedAtLte = finishedAtLte;
  }


  public UploadTaskWhereInput finishedAtNot(String finishedAtNot) {
    
    this.finishedAtNot = finishedAtNot;
    return this;
  }

   /**
   * Get finishedAtNot
   * @return finishedAtNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getFinishedAtNot() {
    return finishedAtNot;
  }


  public void setFinishedAtNot(String finishedAtNot) {
    this.finishedAtNot = finishedAtNot;
  }


  public UploadTaskWhereInput finishedAtNotIn(List<String> finishedAtNotIn) {
    
    this.finishedAtNotIn = finishedAtNotIn;
    return this;
  }

  public UploadTaskWhereInput addFinishedAtNotInItem(String finishedAtNotInItem) {
    if (this.finishedAtNotIn == null) {
      this.finishedAtNotIn = new ArrayList<String>();
    }
    this.finishedAtNotIn.add(finishedAtNotInItem);
    return this;
  }

   /**
   * Get finishedAtNotIn
   * @return finishedAtNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getFinishedAtNotIn() {
    return finishedAtNotIn;
  }


  public void setFinishedAtNotIn(List<String> finishedAtNotIn) {
    this.finishedAtNotIn = finishedAtNotIn;
  }


  public UploadTaskWhereInput id(String id) {
    
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


  public UploadTaskWhereInput idContains(String idContains) {
    
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


  public UploadTaskWhereInput idEndsWith(String idEndsWith) {
    
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


  public UploadTaskWhereInput idGt(String idGt) {
    
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


  public UploadTaskWhereInput idGte(String idGte) {
    
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


  public UploadTaskWhereInput idIn(List<String> idIn) {
    
    this.idIn = idIn;
    return this;
  }

  public UploadTaskWhereInput addIdInItem(String idInItem) {
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


  public UploadTaskWhereInput idLt(String idLt) {
    
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


  public UploadTaskWhereInput idLte(String idLte) {
    
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


  public UploadTaskWhereInput idNot(String idNot) {
    
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


  public UploadTaskWhereInput idNotContains(String idNotContains) {
    
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


  public UploadTaskWhereInput idNotEndsWith(String idNotEndsWith) {
    
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


  public UploadTaskWhereInput idNotIn(List<String> idNotIn) {
    
    this.idNotIn = idNotIn;
    return this;
  }

  public UploadTaskWhereInput addIdNotInItem(String idNotInItem) {
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


  public UploadTaskWhereInput idNotStartsWith(String idNotStartsWith) {
    
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


  public UploadTaskWhereInput idStartsWith(String idStartsWith) {
    
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


  public UploadTaskWhereInput resourceType(UploadResourceType resourceType) {
    
    this.resourceType = resourceType;
    return this;
  }

   /**
   * Get resourceType
   * @return resourceType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UploadResourceType getResourceType() {
    return resourceType;
  }


  public void setResourceType(UploadResourceType resourceType) {
    this.resourceType = resourceType;
  }


  public UploadTaskWhereInput resourceTypeIn(List<UploadResourceType> resourceTypeIn) {
    
    this.resourceTypeIn = resourceTypeIn;
    return this;
  }

  public UploadTaskWhereInput addResourceTypeInItem(UploadResourceType resourceTypeInItem) {
    if (this.resourceTypeIn == null) {
      this.resourceTypeIn = new ArrayList<UploadResourceType>();
    }
    this.resourceTypeIn.add(resourceTypeInItem);
    return this;
  }

   /**
   * Get resourceTypeIn
   * @return resourceTypeIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<UploadResourceType> getResourceTypeIn() {
    return resourceTypeIn;
  }


  public void setResourceTypeIn(List<UploadResourceType> resourceTypeIn) {
    this.resourceTypeIn = resourceTypeIn;
  }


  public UploadTaskWhereInput resourceTypeNot(UploadResourceType resourceTypeNot) {
    
    this.resourceTypeNot = resourceTypeNot;
    return this;
  }

   /**
   * Get resourceTypeNot
   * @return resourceTypeNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UploadResourceType getResourceTypeNot() {
    return resourceTypeNot;
  }


  public void setResourceTypeNot(UploadResourceType resourceTypeNot) {
    this.resourceTypeNot = resourceTypeNot;
  }


  public UploadTaskWhereInput resourceTypeNotIn(List<UploadResourceType> resourceTypeNotIn) {
    
    this.resourceTypeNotIn = resourceTypeNotIn;
    return this;
  }

  public UploadTaskWhereInput addResourceTypeNotInItem(UploadResourceType resourceTypeNotInItem) {
    if (this.resourceTypeNotIn == null) {
      this.resourceTypeNotIn = new ArrayList<UploadResourceType>();
    }
    this.resourceTypeNotIn.add(resourceTypeNotInItem);
    return this;
  }

   /**
   * Get resourceTypeNotIn
   * @return resourceTypeNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<UploadResourceType> getResourceTypeNotIn() {
    return resourceTypeNotIn;
  }


  public void setResourceTypeNotIn(List<UploadResourceType> resourceTypeNotIn) {
    this.resourceTypeNotIn = resourceTypeNotIn;
  }


  public UploadTaskWhereInput size(Long size) {
    
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


  public UploadTaskWhereInput sizeGt(Long sizeGt) {
    
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


  public UploadTaskWhereInput sizeGte(Long sizeGte) {
    
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


  public UploadTaskWhereInput sizeIn(List<Long> sizeIn) {
    
    this.sizeIn = sizeIn;
    return this;
  }

  public UploadTaskWhereInput addSizeInItem(Long sizeInItem) {
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


  public UploadTaskWhereInput sizeLt(Long sizeLt) {
    
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


  public UploadTaskWhereInput sizeLte(Long sizeLte) {
    
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


  public UploadTaskWhereInput sizeNot(Long sizeNot) {
    
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


  public UploadTaskWhereInput sizeNotIn(List<Long> sizeNotIn) {
    
    this.sizeNotIn = sizeNotIn;
    return this;
  }

  public UploadTaskWhereInput addSizeNotInItem(Long sizeNotInItem) {
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


  public UploadTaskWhereInput startedAt(String startedAt) {
    
    this.startedAt = startedAt;
    return this;
  }

   /**
   * Get startedAt
   * @return startedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getStartedAt() {
    return startedAt;
  }


  public void setStartedAt(String startedAt) {
    this.startedAt = startedAt;
  }


  public UploadTaskWhereInput startedAtGt(String startedAtGt) {
    
    this.startedAtGt = startedAtGt;
    return this;
  }

   /**
   * Get startedAtGt
   * @return startedAtGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getStartedAtGt() {
    return startedAtGt;
  }


  public void setStartedAtGt(String startedAtGt) {
    this.startedAtGt = startedAtGt;
  }


  public UploadTaskWhereInput startedAtGte(String startedAtGte) {
    
    this.startedAtGte = startedAtGte;
    return this;
  }

   /**
   * Get startedAtGte
   * @return startedAtGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getStartedAtGte() {
    return startedAtGte;
  }


  public void setStartedAtGte(String startedAtGte) {
    this.startedAtGte = startedAtGte;
  }


  public UploadTaskWhereInput startedAtIn(List<String> startedAtIn) {
    
    this.startedAtIn = startedAtIn;
    return this;
  }

  public UploadTaskWhereInput addStartedAtInItem(String startedAtInItem) {
    if (this.startedAtIn == null) {
      this.startedAtIn = new ArrayList<String>();
    }
    this.startedAtIn.add(startedAtInItem);
    return this;
  }

   /**
   * Get startedAtIn
   * @return startedAtIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getStartedAtIn() {
    return startedAtIn;
  }


  public void setStartedAtIn(List<String> startedAtIn) {
    this.startedAtIn = startedAtIn;
  }


  public UploadTaskWhereInput startedAtLt(String startedAtLt) {
    
    this.startedAtLt = startedAtLt;
    return this;
  }

   /**
   * Get startedAtLt
   * @return startedAtLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getStartedAtLt() {
    return startedAtLt;
  }


  public void setStartedAtLt(String startedAtLt) {
    this.startedAtLt = startedAtLt;
  }


  public UploadTaskWhereInput startedAtLte(String startedAtLte) {
    
    this.startedAtLte = startedAtLte;
    return this;
  }

   /**
   * Get startedAtLte
   * @return startedAtLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getStartedAtLte() {
    return startedAtLte;
  }


  public void setStartedAtLte(String startedAtLte) {
    this.startedAtLte = startedAtLte;
  }


  public UploadTaskWhereInput startedAtNot(String startedAtNot) {
    
    this.startedAtNot = startedAtNot;
    return this;
  }

   /**
   * Get startedAtNot
   * @return startedAtNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getStartedAtNot() {
    return startedAtNot;
  }


  public void setStartedAtNot(String startedAtNot) {
    this.startedAtNot = startedAtNot;
  }


  public UploadTaskWhereInput startedAtNotIn(List<String> startedAtNotIn) {
    
    this.startedAtNotIn = startedAtNotIn;
    return this;
  }

  public UploadTaskWhereInput addStartedAtNotInItem(String startedAtNotInItem) {
    if (this.startedAtNotIn == null) {
      this.startedAtNotIn = new ArrayList<String>();
    }
    this.startedAtNotIn.add(startedAtNotInItem);
    return this;
  }

   /**
   * Get startedAtNotIn
   * @return startedAtNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getStartedAtNotIn() {
    return startedAtNotIn;
  }


  public void setStartedAtNotIn(List<String> startedAtNotIn) {
    this.startedAtNotIn = startedAtNotIn;
  }


  public UploadTaskWhereInput status(UploadTaskStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UploadTaskStatus getStatus() {
    return status;
  }


  public void setStatus(UploadTaskStatus status) {
    this.status = status;
  }


  public UploadTaskWhereInput statusIn(List<UploadTaskStatus> statusIn) {
    
    this.statusIn = statusIn;
    return this;
  }

  public UploadTaskWhereInput addStatusInItem(UploadTaskStatus statusInItem) {
    if (this.statusIn == null) {
      this.statusIn = new ArrayList<UploadTaskStatus>();
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

  public List<UploadTaskStatus> getStatusIn() {
    return statusIn;
  }


  public void setStatusIn(List<UploadTaskStatus> statusIn) {
    this.statusIn = statusIn;
  }


  public UploadTaskWhereInput statusNot(UploadTaskStatus statusNot) {
    
    this.statusNot = statusNot;
    return this;
  }

   /**
   * Get statusNot
   * @return statusNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UploadTaskStatus getStatusNot() {
    return statusNot;
  }


  public void setStatusNot(UploadTaskStatus statusNot) {
    this.statusNot = statusNot;
  }


  public UploadTaskWhereInput statusNotIn(List<UploadTaskStatus> statusNotIn) {
    
    this.statusNotIn = statusNotIn;
    return this;
  }

  public UploadTaskWhereInput addStatusNotInItem(UploadTaskStatus statusNotInItem) {
    if (this.statusNotIn == null) {
      this.statusNotIn = new ArrayList<UploadTaskStatus>();
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

  public List<UploadTaskStatus> getStatusNotIn() {
    return statusNotIn;
  }


  public void setStatusNotIn(List<UploadTaskStatus> statusNotIn) {
    this.statusNotIn = statusNotIn;
  }


  public UploadTaskWhereInput updatedAt(String updatedAt) {
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Get updatedAt
   * @return updatedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUpdatedAt() {
    return updatedAt;
  }


  public void setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
  }


  public UploadTaskWhereInput updatedAtGt(String updatedAtGt) {
    
    this.updatedAtGt = updatedAtGt;
    return this;
  }

   /**
   * Get updatedAtGt
   * @return updatedAtGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUpdatedAtGt() {
    return updatedAtGt;
  }


  public void setUpdatedAtGt(String updatedAtGt) {
    this.updatedAtGt = updatedAtGt;
  }


  public UploadTaskWhereInput updatedAtGte(String updatedAtGte) {
    
    this.updatedAtGte = updatedAtGte;
    return this;
  }

   /**
   * Get updatedAtGte
   * @return updatedAtGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUpdatedAtGte() {
    return updatedAtGte;
  }


  public void setUpdatedAtGte(String updatedAtGte) {
    this.updatedAtGte = updatedAtGte;
  }


  public UploadTaskWhereInput updatedAtIn(List<String> updatedAtIn) {
    
    this.updatedAtIn = updatedAtIn;
    return this;
  }

  public UploadTaskWhereInput addUpdatedAtInItem(String updatedAtInItem) {
    if (this.updatedAtIn == null) {
      this.updatedAtIn = new ArrayList<String>();
    }
    this.updatedAtIn.add(updatedAtInItem);
    return this;
  }

   /**
   * Get updatedAtIn
   * @return updatedAtIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getUpdatedAtIn() {
    return updatedAtIn;
  }


  public void setUpdatedAtIn(List<String> updatedAtIn) {
    this.updatedAtIn = updatedAtIn;
  }


  public UploadTaskWhereInput updatedAtLt(String updatedAtLt) {
    
    this.updatedAtLt = updatedAtLt;
    return this;
  }

   /**
   * Get updatedAtLt
   * @return updatedAtLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUpdatedAtLt() {
    return updatedAtLt;
  }


  public void setUpdatedAtLt(String updatedAtLt) {
    this.updatedAtLt = updatedAtLt;
  }


  public UploadTaskWhereInput updatedAtLte(String updatedAtLte) {
    
    this.updatedAtLte = updatedAtLte;
    return this;
  }

   /**
   * Get updatedAtLte
   * @return updatedAtLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUpdatedAtLte() {
    return updatedAtLte;
  }


  public void setUpdatedAtLte(String updatedAtLte) {
    this.updatedAtLte = updatedAtLte;
  }


  public UploadTaskWhereInput updatedAtNot(String updatedAtNot) {
    
    this.updatedAtNot = updatedAtNot;
    return this;
  }

   /**
   * Get updatedAtNot
   * @return updatedAtNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUpdatedAtNot() {
    return updatedAtNot;
  }


  public void setUpdatedAtNot(String updatedAtNot) {
    this.updatedAtNot = updatedAtNot;
  }


  public UploadTaskWhereInput updatedAtNotIn(List<String> updatedAtNotIn) {
    
    this.updatedAtNotIn = updatedAtNotIn;
    return this;
  }

  public UploadTaskWhereInput addUpdatedAtNotInItem(String updatedAtNotInItem) {
    if (this.updatedAtNotIn == null) {
      this.updatedAtNotIn = new ArrayList<String>();
    }
    this.updatedAtNotIn.add(updatedAtNotInItem);
    return this;
  }

   /**
   * Get updatedAtNotIn
   * @return updatedAtNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getUpdatedAtNotIn() {
    return updatedAtNotIn;
  }


  public void setUpdatedAtNotIn(List<String> updatedAtNotIn) {
    this.updatedAtNotIn = updatedAtNotIn;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UploadTaskWhereInput uploadTaskWhereInput = (UploadTaskWhereInput) o;
    return Objects.equals(this.AND, uploadTaskWhereInput.AND) &&
        Objects.equals(this.NOT, uploadTaskWhereInput.NOT) &&
        Objects.equals(this.OR, uploadTaskWhereInput.OR) &&
        Objects.equals(this.chunkSize, uploadTaskWhereInput.chunkSize) &&
        Objects.equals(this.chunkSizeGt, uploadTaskWhereInput.chunkSizeGt) &&
        Objects.equals(this.chunkSizeGte, uploadTaskWhereInput.chunkSizeGte) &&
        Objects.equals(this.chunkSizeIn, uploadTaskWhereInput.chunkSizeIn) &&
        Objects.equals(this.chunkSizeLt, uploadTaskWhereInput.chunkSizeLt) &&
        Objects.equals(this.chunkSizeLte, uploadTaskWhereInput.chunkSizeLte) &&
        Objects.equals(this.chunkSizeNot, uploadTaskWhereInput.chunkSizeNot) &&
        Objects.equals(this.chunkSizeNotIn, uploadTaskWhereInput.chunkSizeNotIn) &&
        Objects.equals(this.currentChunk, uploadTaskWhereInput.currentChunk) &&
        Objects.equals(this.currentChunkGt, uploadTaskWhereInput.currentChunkGt) &&
        Objects.equals(this.currentChunkGte, uploadTaskWhereInput.currentChunkGte) &&
        Objects.equals(this.currentChunkIn, uploadTaskWhereInput.currentChunkIn) &&
        Objects.equals(this.currentChunkLt, uploadTaskWhereInput.currentChunkLt) &&
        Objects.equals(this.currentChunkLte, uploadTaskWhereInput.currentChunkLte) &&
        Objects.equals(this.currentChunkNot, uploadTaskWhereInput.currentChunkNot) &&
        Objects.equals(this.currentChunkNotIn, uploadTaskWhereInput.currentChunkNotIn) &&
        Objects.equals(this.finishedAt, uploadTaskWhereInput.finishedAt) &&
        Objects.equals(this.finishedAtGt, uploadTaskWhereInput.finishedAtGt) &&
        Objects.equals(this.finishedAtGte, uploadTaskWhereInput.finishedAtGte) &&
        Objects.equals(this.finishedAtIn, uploadTaskWhereInput.finishedAtIn) &&
        Objects.equals(this.finishedAtLt, uploadTaskWhereInput.finishedAtLt) &&
        Objects.equals(this.finishedAtLte, uploadTaskWhereInput.finishedAtLte) &&
        Objects.equals(this.finishedAtNot, uploadTaskWhereInput.finishedAtNot) &&
        Objects.equals(this.finishedAtNotIn, uploadTaskWhereInput.finishedAtNotIn) &&
        Objects.equals(this.id, uploadTaskWhereInput.id) &&
        Objects.equals(this.idContains, uploadTaskWhereInput.idContains) &&
        Objects.equals(this.idEndsWith, uploadTaskWhereInput.idEndsWith) &&
        Objects.equals(this.idGt, uploadTaskWhereInput.idGt) &&
        Objects.equals(this.idGte, uploadTaskWhereInput.idGte) &&
        Objects.equals(this.idIn, uploadTaskWhereInput.idIn) &&
        Objects.equals(this.idLt, uploadTaskWhereInput.idLt) &&
        Objects.equals(this.idLte, uploadTaskWhereInput.idLte) &&
        Objects.equals(this.idNot, uploadTaskWhereInput.idNot) &&
        Objects.equals(this.idNotContains, uploadTaskWhereInput.idNotContains) &&
        Objects.equals(this.idNotEndsWith, uploadTaskWhereInput.idNotEndsWith) &&
        Objects.equals(this.idNotIn, uploadTaskWhereInput.idNotIn) &&
        Objects.equals(this.idNotStartsWith, uploadTaskWhereInput.idNotStartsWith) &&
        Objects.equals(this.idStartsWith, uploadTaskWhereInput.idStartsWith) &&
        Objects.equals(this.resourceType, uploadTaskWhereInput.resourceType) &&
        Objects.equals(this.resourceTypeIn, uploadTaskWhereInput.resourceTypeIn) &&
        Objects.equals(this.resourceTypeNot, uploadTaskWhereInput.resourceTypeNot) &&
        Objects.equals(this.resourceTypeNotIn, uploadTaskWhereInput.resourceTypeNotIn) &&
        Objects.equals(this.size, uploadTaskWhereInput.size) &&
        Objects.equals(this.sizeGt, uploadTaskWhereInput.sizeGt) &&
        Objects.equals(this.sizeGte, uploadTaskWhereInput.sizeGte) &&
        Objects.equals(this.sizeIn, uploadTaskWhereInput.sizeIn) &&
        Objects.equals(this.sizeLt, uploadTaskWhereInput.sizeLt) &&
        Objects.equals(this.sizeLte, uploadTaskWhereInput.sizeLte) &&
        Objects.equals(this.sizeNot, uploadTaskWhereInput.sizeNot) &&
        Objects.equals(this.sizeNotIn, uploadTaskWhereInput.sizeNotIn) &&
        Objects.equals(this.startedAt, uploadTaskWhereInput.startedAt) &&
        Objects.equals(this.startedAtGt, uploadTaskWhereInput.startedAtGt) &&
        Objects.equals(this.startedAtGte, uploadTaskWhereInput.startedAtGte) &&
        Objects.equals(this.startedAtIn, uploadTaskWhereInput.startedAtIn) &&
        Objects.equals(this.startedAtLt, uploadTaskWhereInput.startedAtLt) &&
        Objects.equals(this.startedAtLte, uploadTaskWhereInput.startedAtLte) &&
        Objects.equals(this.startedAtNot, uploadTaskWhereInput.startedAtNot) &&
        Objects.equals(this.startedAtNotIn, uploadTaskWhereInput.startedAtNotIn) &&
        Objects.equals(this.status, uploadTaskWhereInput.status) &&
        Objects.equals(this.statusIn, uploadTaskWhereInput.statusIn) &&
        Objects.equals(this.statusNot, uploadTaskWhereInput.statusNot) &&
        Objects.equals(this.statusNotIn, uploadTaskWhereInput.statusNotIn) &&
        Objects.equals(this.updatedAt, uploadTaskWhereInput.updatedAt) &&
        Objects.equals(this.updatedAtGt, uploadTaskWhereInput.updatedAtGt) &&
        Objects.equals(this.updatedAtGte, uploadTaskWhereInput.updatedAtGte) &&
        Objects.equals(this.updatedAtIn, uploadTaskWhereInput.updatedAtIn) &&
        Objects.equals(this.updatedAtLt, uploadTaskWhereInput.updatedAtLt) &&
        Objects.equals(this.updatedAtLte, uploadTaskWhereInput.updatedAtLte) &&
        Objects.equals(this.updatedAtNot, uploadTaskWhereInput.updatedAtNot) &&
        Objects.equals(this.updatedAtNotIn, uploadTaskWhereInput.updatedAtNotIn);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(AND, NOT, OR, chunkSize, chunkSizeGt, chunkSizeGte, chunkSizeIn, chunkSizeLt, chunkSizeLte, chunkSizeNot, chunkSizeNotIn, currentChunk, currentChunkGt, currentChunkGte, currentChunkIn, currentChunkLt, currentChunkLte, currentChunkNot, currentChunkNotIn, finishedAt, finishedAtGt, finishedAtGte, finishedAtIn, finishedAtLt, finishedAtLte, finishedAtNot, finishedAtNotIn, id, idContains, idEndsWith, idGt, idGte, idIn, idLt, idLte, idNot, idNotContains, idNotEndsWith, idNotIn, idNotStartsWith, idStartsWith, resourceType, resourceTypeIn, resourceTypeNot, resourceTypeNotIn, size, sizeGt, sizeGte, sizeIn, sizeLt, sizeLte, sizeNot, sizeNotIn, startedAt, startedAtGt, startedAtGte, startedAtIn, startedAtLt, startedAtLte, startedAtNot, startedAtNotIn, status, statusIn, statusNot, statusNotIn, updatedAt, updatedAtGt, updatedAtGte, updatedAtIn, updatedAtLt, updatedAtLte, updatedAtNot, updatedAtNotIn);
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
    sb.append("class UploadTaskWhereInput {\n");
    sb.append("    AND: ").append(toIndentedString(AND)).append("\n");
    sb.append("    NOT: ").append(toIndentedString(NOT)).append("\n");
    sb.append("    OR: ").append(toIndentedString(OR)).append("\n");
    sb.append("    chunkSize: ").append(toIndentedString(chunkSize)).append("\n");
    sb.append("    chunkSizeGt: ").append(toIndentedString(chunkSizeGt)).append("\n");
    sb.append("    chunkSizeGte: ").append(toIndentedString(chunkSizeGte)).append("\n");
    sb.append("    chunkSizeIn: ").append(toIndentedString(chunkSizeIn)).append("\n");
    sb.append("    chunkSizeLt: ").append(toIndentedString(chunkSizeLt)).append("\n");
    sb.append("    chunkSizeLte: ").append(toIndentedString(chunkSizeLte)).append("\n");
    sb.append("    chunkSizeNot: ").append(toIndentedString(chunkSizeNot)).append("\n");
    sb.append("    chunkSizeNotIn: ").append(toIndentedString(chunkSizeNotIn)).append("\n");
    sb.append("    currentChunk: ").append(toIndentedString(currentChunk)).append("\n");
    sb.append("    currentChunkGt: ").append(toIndentedString(currentChunkGt)).append("\n");
    sb.append("    currentChunkGte: ").append(toIndentedString(currentChunkGte)).append("\n");
    sb.append("    currentChunkIn: ").append(toIndentedString(currentChunkIn)).append("\n");
    sb.append("    currentChunkLt: ").append(toIndentedString(currentChunkLt)).append("\n");
    sb.append("    currentChunkLte: ").append(toIndentedString(currentChunkLte)).append("\n");
    sb.append("    currentChunkNot: ").append(toIndentedString(currentChunkNot)).append("\n");
    sb.append("    currentChunkNotIn: ").append(toIndentedString(currentChunkNotIn)).append("\n");
    sb.append("    finishedAt: ").append(toIndentedString(finishedAt)).append("\n");
    sb.append("    finishedAtGt: ").append(toIndentedString(finishedAtGt)).append("\n");
    sb.append("    finishedAtGte: ").append(toIndentedString(finishedAtGte)).append("\n");
    sb.append("    finishedAtIn: ").append(toIndentedString(finishedAtIn)).append("\n");
    sb.append("    finishedAtLt: ").append(toIndentedString(finishedAtLt)).append("\n");
    sb.append("    finishedAtLte: ").append(toIndentedString(finishedAtLte)).append("\n");
    sb.append("    finishedAtNot: ").append(toIndentedString(finishedAtNot)).append("\n");
    sb.append("    finishedAtNotIn: ").append(toIndentedString(finishedAtNotIn)).append("\n");
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
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
    sb.append("    resourceTypeIn: ").append(toIndentedString(resourceTypeIn)).append("\n");
    sb.append("    resourceTypeNot: ").append(toIndentedString(resourceTypeNot)).append("\n");
    sb.append("    resourceTypeNotIn: ").append(toIndentedString(resourceTypeNotIn)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    sizeGt: ").append(toIndentedString(sizeGt)).append("\n");
    sb.append("    sizeGte: ").append(toIndentedString(sizeGte)).append("\n");
    sb.append("    sizeIn: ").append(toIndentedString(sizeIn)).append("\n");
    sb.append("    sizeLt: ").append(toIndentedString(sizeLt)).append("\n");
    sb.append("    sizeLte: ").append(toIndentedString(sizeLte)).append("\n");
    sb.append("    sizeNot: ").append(toIndentedString(sizeNot)).append("\n");
    sb.append("    sizeNotIn: ").append(toIndentedString(sizeNotIn)).append("\n");
    sb.append("    startedAt: ").append(toIndentedString(startedAt)).append("\n");
    sb.append("    startedAtGt: ").append(toIndentedString(startedAtGt)).append("\n");
    sb.append("    startedAtGte: ").append(toIndentedString(startedAtGte)).append("\n");
    sb.append("    startedAtIn: ").append(toIndentedString(startedAtIn)).append("\n");
    sb.append("    startedAtLt: ").append(toIndentedString(startedAtLt)).append("\n");
    sb.append("    startedAtLte: ").append(toIndentedString(startedAtLte)).append("\n");
    sb.append("    startedAtNot: ").append(toIndentedString(startedAtNot)).append("\n");
    sb.append("    startedAtNotIn: ").append(toIndentedString(startedAtNotIn)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusIn: ").append(toIndentedString(statusIn)).append("\n");
    sb.append("    statusNot: ").append(toIndentedString(statusNot)).append("\n");
    sb.append("    statusNotIn: ").append(toIndentedString(statusNotIn)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    updatedAtGt: ").append(toIndentedString(updatedAtGt)).append("\n");
    sb.append("    updatedAtGte: ").append(toIndentedString(updatedAtGte)).append("\n");
    sb.append("    updatedAtIn: ").append(toIndentedString(updatedAtIn)).append("\n");
    sb.append("    updatedAtLt: ").append(toIndentedString(updatedAtLt)).append("\n");
    sb.append("    updatedAtLte: ").append(toIndentedString(updatedAtLte)).append("\n");
    sb.append("    updatedAtNot: ").append(toIndentedString(updatedAtNot)).append("\n");
    sb.append("    updatedAtNotIn: ").append(toIndentedString(updatedAtNotIn)).append("\n");
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

