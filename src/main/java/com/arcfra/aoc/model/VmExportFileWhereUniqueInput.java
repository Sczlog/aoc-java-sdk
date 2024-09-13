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
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * VmExportFileWhereUniqueInput
 */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class VmExportFileWhereUniqueInput {
  public static final String SERIALIZED_NAME_DATA_PORT_ID = "data_port_id";
  @SerializedName(SERIALIZED_NAME_DATA_PORT_ID)
  private String dataPortId;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public VmExportFileWhereUniqueInput() { 
  }

  public VmExportFileWhereUniqueInput dataPortId(String dataPortId) {
    
    this.dataPortId = dataPortId;
    return this;
  }

   /**
   * Get dataPortId
   * @return dataPortId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDataPortId() {
    return dataPortId;
  }


  public void setDataPortId(String dataPortId) {
    this.dataPortId = dataPortId;
  }


  public VmExportFileWhereUniqueInput id(String id) {
    
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VmExportFileWhereUniqueInput vmExportFileWhereUniqueInput = (VmExportFileWhereUniqueInput) o;
    return Objects.equals(this.dataPortId, vmExportFileWhereUniqueInput.dataPortId) &&
        Objects.equals(this.id, vmExportFileWhereUniqueInput.id);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataPortId, id);
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
    sb.append("class VmExportFileWhereUniqueInput {\n");
    sb.append("    dataPortId: ").append(toIndentedString(dataPortId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

