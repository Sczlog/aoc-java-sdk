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
 * IscsiLunDeletionParamsData
 */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class IscsiLunDeletionParamsData {
  public static final String SERIALIZED_NAME_REMOVE_SNAPSHOT = "remove_snapshot";
  @SerializedName(SERIALIZED_NAME_REMOVE_SNAPSHOT)
  private Boolean removeSnapshot;

  public IscsiLunDeletionParamsData() { 
  }

  public IscsiLunDeletionParamsData removeSnapshot(Boolean removeSnapshot) {
    
    this.removeSnapshot = removeSnapshot;
    return this;
  }

   /**
   * Get removeSnapshot
   * @return removeSnapshot
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boolean getRemoveSnapshot() {
    return removeSnapshot;
  }


  public void setRemoveSnapshot(Boolean removeSnapshot) {
    this.removeSnapshot = removeSnapshot;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IscsiLunDeletionParamsData iscsiLunDeletionParamsData = (IscsiLunDeletionParamsData) o;
    return Objects.equals(this.removeSnapshot, iscsiLunDeletionParamsData.removeSnapshot);
  }

  @Override
  public int hashCode() {
    return Objects.hash(removeSnapshot);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IscsiLunDeletionParamsData {\n");
    sb.append("    removeSnapshot: ").append(toIndentedString(removeSnapshot)).append("\n");
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

