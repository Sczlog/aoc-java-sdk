package com.arcfra.aoc.model;

import java.util.Objects;
import java.util.Arrays;
import com.arcfra.aoc.model.EntityAsyncStatus;
import com.arcfra.aoc.model.NestedCluster;
import com.arcfra.aoc.model.NestedLabel;
import com.arcfra.aoc.model.NestedNic;
import com.arcfra.aoc.model.NestedVlan;
import com.arcfra.aoc.model.NetworkType;
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
 * Vds
 */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class Vds {
  public static final String SERIALIZED_NAME_BOND_MODE = "bond_mode";
  @SerializedName(SERIALIZED_NAME_BOND_MODE)
  private String bondMode;

  public static final String SERIALIZED_NAME_CLUSTER = "cluster";
  @SerializedName(SERIALIZED_NAME_CLUSTER)
  private NestedCluster cluster;

  public static final String SERIALIZED_NAME_ENTITY_ASYNC_STATUS = "entityAsyncStatus";
  @SerializedName(SERIALIZED_NAME_ENTITY_ASYNC_STATUS)
  private EntityAsyncStatus entityAsyncStatus;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_INTERNAL = "internal";
  @SerializedName(SERIALIZED_NAME_INTERNAL)
  private Boolean internal;

  public static final String SERIALIZED_NAME_LABELS = "labels";
  @SerializedName(SERIALIZED_NAME_LABELS)
  private List<NestedLabel> labels = null;

  public static final String SERIALIZED_NAME_LOCAL_ID = "local_id";
  @SerializedName(SERIALIZED_NAME_LOCAL_ID)
  private String localId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NICS = "nics";
  @SerializedName(SERIALIZED_NAME_NICS)
  private List<NestedNic> nics = null;

  public static final String SERIALIZED_NAME_OVSBR_NAME = "ovsbr_name";
  @SerializedName(SERIALIZED_NAME_OVSBR_NAME)
  private String ovsbrName;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private NetworkType type;

  public static final String SERIALIZED_NAME_VLANS = "vlans";
  @SerializedName(SERIALIZED_NAME_VLANS)
  private List<NestedVlan> vlans = null;

  public static final String SERIALIZED_NAME_VLANS_NUM = "vlans_num";
  @SerializedName(SERIALIZED_NAME_VLANS_NUM)
  private Integer vlansNum;

  public static final String SERIALIZED_NAME_WORK_MODE = "work_mode";
  @SerializedName(SERIALIZED_NAME_WORK_MODE)
  private String workMode;

  public Vds() { 
  }

  public Vds bondMode(String bondMode) {
    
    this.bondMode = bondMode;
    return this;
  }

   /**
   * Get bondMode
   * @return bondMode
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getBondMode() {
    return bondMode;
  }


  public void setBondMode(String bondMode) {
    this.bondMode = bondMode;
  }


  public Vds cluster(NestedCluster cluster) {
    
    this.cluster = cluster;
    return this;
  }

   /**
   * Get cluster
   * @return cluster
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public NestedCluster getCluster() {
    return cluster;
  }


  public void setCluster(NestedCluster cluster) {
    this.cluster = cluster;
  }


  public Vds entityAsyncStatus(EntityAsyncStatus entityAsyncStatus) {
    
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


  public Vds id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public Vds internal(Boolean internal) {
    
    this.internal = internal;
    return this;
  }

   /**
   * Get internal
   * @return internal
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boolean getInternal() {
    return internal;
  }


  public void setInternal(Boolean internal) {
    this.internal = internal;
  }


  public Vds labels(List<NestedLabel> labels) {
    
    this.labels = labels;
    return this;
  }

  public Vds addLabelsItem(NestedLabel labelsItem) {
    if (this.labels == null) {
      this.labels = new ArrayList<NestedLabel>();
    }
    this.labels.add(labelsItem);
    return this;
  }

   /**
   * Get labels
   * @return labels
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<NestedLabel> getLabels() {
    return labels;
  }


  public void setLabels(List<NestedLabel> labels) {
    this.labels = labels;
  }


  public Vds localId(String localId) {
    
    this.localId = localId;
    return this;
  }

   /**
   * Get localId
   * @return localId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getLocalId() {
    return localId;
  }


  public void setLocalId(String localId) {
    this.localId = localId;
  }


  public Vds name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public Vds nics(List<NestedNic> nics) {
    
    this.nics = nics;
    return this;
  }

  public Vds addNicsItem(NestedNic nicsItem) {
    if (this.nics == null) {
      this.nics = new ArrayList<NestedNic>();
    }
    this.nics.add(nicsItem);
    return this;
  }

   /**
   * Get nics
   * @return nics
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<NestedNic> getNics() {
    return nics;
  }


  public void setNics(List<NestedNic> nics) {
    this.nics = nics;
  }


  public Vds ovsbrName(String ovsbrName) {
    
    this.ovsbrName = ovsbrName;
    return this;
  }

   /**
   * Get ovsbrName
   * @return ovsbrName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getOvsbrName() {
    return ovsbrName;
  }


  public void setOvsbrName(String ovsbrName) {
    this.ovsbrName = ovsbrName;
  }


  public Vds type(NetworkType type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public NetworkType getType() {
    return type;
  }


  public void setType(NetworkType type) {
    this.type = type;
  }


  public Vds vlans(List<NestedVlan> vlans) {
    
    this.vlans = vlans;
    return this;
  }

  public Vds addVlansItem(NestedVlan vlansItem) {
    if (this.vlans == null) {
      this.vlans = new ArrayList<NestedVlan>();
    }
    this.vlans.add(vlansItem);
    return this;
  }

   /**
   * Get vlans
   * @return vlans
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<NestedVlan> getVlans() {
    return vlans;
  }


  public void setVlans(List<NestedVlan> vlans) {
    this.vlans = vlans;
  }


  public Vds vlansNum(Integer vlansNum) {
    
    this.vlansNum = vlansNum;
    return this;
  }

   /**
   * Get vlansNum
   * @return vlansNum
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getVlansNum() {
    return vlansNum;
  }


  public void setVlansNum(Integer vlansNum) {
    this.vlansNum = vlansNum;
  }


  public Vds workMode(String workMode) {
    
    this.workMode = workMode;
    return this;
  }

   /**
   * Get workMode
   * @return workMode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getWorkMode() {
    return workMode;
  }


  public void setWorkMode(String workMode) {
    this.workMode = workMode;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Vds vds = (Vds) o;
    return Objects.equals(this.bondMode, vds.bondMode) &&
        Objects.equals(this.cluster, vds.cluster) &&
        Objects.equals(this.entityAsyncStatus, vds.entityAsyncStatus) &&
        Objects.equals(this.id, vds.id) &&
        Objects.equals(this.internal, vds.internal) &&
        Objects.equals(this.labels, vds.labels) &&
        Objects.equals(this.localId, vds.localId) &&
        Objects.equals(this.name, vds.name) &&
        Objects.equals(this.nics, vds.nics) &&
        Objects.equals(this.ovsbrName, vds.ovsbrName) &&
        Objects.equals(this.type, vds.type) &&
        Objects.equals(this.vlans, vds.vlans) &&
        Objects.equals(this.vlansNum, vds.vlansNum) &&
        Objects.equals(this.workMode, vds.workMode);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(bondMode, cluster, entityAsyncStatus, id, internal, labels, localId, name, nics, ovsbrName, type, vlans, vlansNum, workMode);
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
    sb.append("class Vds {\n");
    sb.append("    bondMode: ").append(toIndentedString(bondMode)).append("\n");
    sb.append("    cluster: ").append(toIndentedString(cluster)).append("\n");
    sb.append("    entityAsyncStatus: ").append(toIndentedString(entityAsyncStatus)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    internal: ").append(toIndentedString(internal)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    localId: ").append(toIndentedString(localId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    nics: ").append(toIndentedString(nics)).append("\n");
    sb.append("    ovsbrName: ").append(toIndentedString(ovsbrName)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    vlans: ").append(toIndentedString(vlans)).append("\n");
    sb.append("    vlansNum: ").append(toIndentedString(vlansNum)).append("\n");
    sb.append("    workMode: ").append(toIndentedString(workMode)).append("\n");
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

