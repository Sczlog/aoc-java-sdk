package com.arcfra.aoc.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * VmVolumeRollbackParams
 */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class VmVolumeRollbackParams {
  public static final String SERIALIZED_NAME_VOLUME_SNAPSHOT_ID = "volume_snapshot_id";
  @SerializedName(SERIALIZED_NAME_VOLUME_SNAPSHOT_ID)
  private String volumeSnapshotId;

  public VmVolumeRollbackParams() { 
  }

  public VmVolumeRollbackParams volumeSnapshotId(String volumeSnapshotId) {
    
    this.volumeSnapshotId = volumeSnapshotId;
    return this;
  }

   /**
   * Get volumeSnapshotId
   * @return volumeSnapshotId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getVolumeSnapshotId() {
    return volumeSnapshotId;
  }


  public void setVolumeSnapshotId(String volumeSnapshotId) {
    this.volumeSnapshotId = volumeSnapshotId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VmVolumeRollbackParams vmVolumeRollbackParams = (VmVolumeRollbackParams) o;
    return Objects.equals(this.volumeSnapshotId, vmVolumeRollbackParams.volumeSnapshotId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(volumeSnapshotId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VmVolumeRollbackParams {\n");
    sb.append("    volumeSnapshotId: ").append(toIndentedString(volumeSnapshotId)).append("\n");
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

