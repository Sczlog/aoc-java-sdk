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
import java.util.ArrayList;
import java.util.List;

/**
 * VmRemoveCdRomParamsData
 */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class VmRemoveCdRomParamsData {
  public static final String SERIALIZED_NAME_CD_ROM_IDS = "cd_rom_ids";
  @SerializedName(SERIALIZED_NAME_CD_ROM_IDS)
  private List<String> cdRomIds = new ArrayList<String>();

  public VmRemoveCdRomParamsData() { 
  }

  public VmRemoveCdRomParamsData cdRomIds(List<String> cdRomIds) {
    
    this.cdRomIds = cdRomIds;
    return this;
  }

  public VmRemoveCdRomParamsData addCdRomIdsItem(String cdRomIdsItem) {
    this.cdRomIds.add(cdRomIdsItem);
    return this;
  }

   /**
   * Get cdRomIds
   * @return cdRomIds
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<String> getCdRomIds() {
    return cdRomIds;
  }


  public void setCdRomIds(List<String> cdRomIds) {
    this.cdRomIds = cdRomIds;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VmRemoveCdRomParamsData vmRemoveCdRomParamsData = (VmRemoveCdRomParamsData) o;
    return Objects.equals(this.cdRomIds, vmRemoveCdRomParamsData.cdRomIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cdRomIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VmRemoveCdRomParamsData {\n");
    sb.append("    cdRomIds: ").append(toIndentedString(cdRomIds)).append("\n");
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

