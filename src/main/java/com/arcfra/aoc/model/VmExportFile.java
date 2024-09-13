package com.arcfra.aoc.model;

import java.util.Objects;
import java.util.Arrays;
import com.arcfra.aoc.model.EntityAsyncStatus;
import com.arcfra.aoc.model.NestedContentLibraryVmTemplate;
import com.arcfra.aoc.model.NestedVm;
import com.arcfra.aoc.model.NestedVmVolume;
import com.arcfra.aoc.model.VmExportFileFile;
import com.arcfra.aoc.model.VmExportFileType;
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
 * VmExportFile
 */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class VmExportFile {
  public static final String SERIALIZED_NAME_CONTENT_LIBRARY_VM_TEMPLATE = "content_library_vm_template";
  @SerializedName(SERIALIZED_NAME_CONTENT_LIBRARY_VM_TEMPLATE)
  private NestedContentLibraryVmTemplate contentLibraryVmTemplate;

  public static final String SERIALIZED_NAME_CREATED_AT = "createdAt";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private String createdAt;

  public static final String SERIALIZED_NAME_DAMAGED = "damaged";
  @SerializedName(SERIALIZED_NAME_DAMAGED)
  private Boolean damaged;

  public static final String SERIALIZED_NAME_DATA_PORT_ID = "data_port_id";
  @SerializedName(SERIALIZED_NAME_DATA_PORT_ID)
  private String dataPortId;

  public static final String SERIALIZED_NAME_ENTITY_ASYNC_STATUS = "entityAsyncStatus";
  @SerializedName(SERIALIZED_NAME_ENTITY_ASYNC_STATUS)
  private EntityAsyncStatus entityAsyncStatus;

  public static final String SERIALIZED_NAME_FILES = "files";
  @SerializedName(SERIALIZED_NAME_FILES)
  private List<VmExportFileFile> files = new ArrayList<VmExportFileFile>();

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_STORAGE_CLUSTER_ID = "storage_cluster_id";
  @SerializedName(SERIALIZED_NAME_STORAGE_CLUSTER_ID)
  private String storageClusterId;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private VmExportFileType type;

  public static final String SERIALIZED_NAME_VM = "vm";
  @SerializedName(SERIALIZED_NAME_VM)
  private NestedVm vm;

  public static final String SERIALIZED_NAME_VM_VOLUME = "vm_volume";
  @SerializedName(SERIALIZED_NAME_VM_VOLUME)
  private NestedVmVolume vmVolume;

  public VmExportFile() { 
  }

  public VmExportFile contentLibraryVmTemplate(NestedContentLibraryVmTemplate contentLibraryVmTemplate) {
    
    this.contentLibraryVmTemplate = contentLibraryVmTemplate;
    return this;
  }

   /**
   * Get contentLibraryVmTemplate
   * @return contentLibraryVmTemplate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public NestedContentLibraryVmTemplate getContentLibraryVmTemplate() {
    return contentLibraryVmTemplate;
  }


  public void setContentLibraryVmTemplate(NestedContentLibraryVmTemplate contentLibraryVmTemplate) {
    this.contentLibraryVmTemplate = contentLibraryVmTemplate;
  }


  public VmExportFile createdAt(String createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }


  public VmExportFile damaged(Boolean damaged) {
    
    this.damaged = damaged;
    return this;
  }

   /**
   * Get damaged
   * @return damaged
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boolean getDamaged() {
    return damaged;
  }


  public void setDamaged(Boolean damaged) {
    this.damaged = damaged;
  }


  public VmExportFile dataPortId(String dataPortId) {
    
    this.dataPortId = dataPortId;
    return this;
  }

   /**
   * Get dataPortId
   * @return dataPortId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getDataPortId() {
    return dataPortId;
  }


  public void setDataPortId(String dataPortId) {
    this.dataPortId = dataPortId;
  }


  public VmExportFile entityAsyncStatus(EntityAsyncStatus entityAsyncStatus) {
    
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


  public VmExportFile files(List<VmExportFileFile> files) {
    
    this.files = files;
    return this;
  }

  public VmExportFile addFilesItem(VmExportFileFile filesItem) {
    this.files.add(filesItem);
    return this;
  }

   /**
   * Get files
   * @return files
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<VmExportFileFile> getFiles() {
    return files;
  }


  public void setFiles(List<VmExportFileFile> files) {
    this.files = files;
  }


  public VmExportFile id(String id) {
    
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


  public VmExportFile storageClusterId(String storageClusterId) {
    
    this.storageClusterId = storageClusterId;
    return this;
  }

   /**
   * Get storageClusterId
   * @return storageClusterId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getStorageClusterId() {
    return storageClusterId;
  }


  public void setStorageClusterId(String storageClusterId) {
    this.storageClusterId = storageClusterId;
  }


  public VmExportFile type(VmExportFileType type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public VmExportFileType getType() {
    return type;
  }


  public void setType(VmExportFileType type) {
    this.type = type;
  }


  public VmExportFile vm(NestedVm vm) {
    
    this.vm = vm;
    return this;
  }

   /**
   * Get vm
   * @return vm
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public NestedVm getVm() {
    return vm;
  }


  public void setVm(NestedVm vm) {
    this.vm = vm;
  }


  public VmExportFile vmVolume(NestedVmVolume vmVolume) {
    
    this.vmVolume = vmVolume;
    return this;
  }

   /**
   * Get vmVolume
   * @return vmVolume
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public NestedVmVolume getVmVolume() {
    return vmVolume;
  }


  public void setVmVolume(NestedVmVolume vmVolume) {
    this.vmVolume = vmVolume;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VmExportFile vmExportFile = (VmExportFile) o;
    return Objects.equals(this.contentLibraryVmTemplate, vmExportFile.contentLibraryVmTemplate) &&
        Objects.equals(this.createdAt, vmExportFile.createdAt) &&
        Objects.equals(this.damaged, vmExportFile.damaged) &&
        Objects.equals(this.dataPortId, vmExportFile.dataPortId) &&
        Objects.equals(this.entityAsyncStatus, vmExportFile.entityAsyncStatus) &&
        Objects.equals(this.files, vmExportFile.files) &&
        Objects.equals(this.id, vmExportFile.id) &&
        Objects.equals(this.storageClusterId, vmExportFile.storageClusterId) &&
        Objects.equals(this.type, vmExportFile.type) &&
        Objects.equals(this.vm, vmExportFile.vm) &&
        Objects.equals(this.vmVolume, vmExportFile.vmVolume);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(contentLibraryVmTemplate, createdAt, damaged, dataPortId, entityAsyncStatus, files, id, storageClusterId, type, vm, vmVolume);
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
    sb.append("class VmExportFile {\n");
    sb.append("    contentLibraryVmTemplate: ").append(toIndentedString(contentLibraryVmTemplate)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    damaged: ").append(toIndentedString(damaged)).append("\n");
    sb.append("    dataPortId: ").append(toIndentedString(dataPortId)).append("\n");
    sb.append("    entityAsyncStatus: ").append(toIndentedString(entityAsyncStatus)).append("\n");
    sb.append("    files: ").append(toIndentedString(files)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    storageClusterId: ").append(toIndentedString(storageClusterId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    vm: ").append(toIndentedString(vm)).append("\n");
    sb.append("    vmVolume: ").append(toIndentedString(vmVolume)).append("\n");
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

