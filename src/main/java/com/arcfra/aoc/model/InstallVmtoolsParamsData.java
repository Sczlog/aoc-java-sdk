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
 * InstallVmtoolsParamsData
 * @deprecated
 */
@Deprecated
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class InstallVmtoolsParamsData {
  public static final String SERIALIZED_NAME_SVT_IMAGE_ID = "svt_image_id";
  @SerializedName(SERIALIZED_NAME_SVT_IMAGE_ID)
  private String svtImageId;

  public static final String SERIALIZED_NAME_CD_ROM_ID = "cd_rom_id";
  @SerializedName(SERIALIZED_NAME_CD_ROM_ID)
  private String cdRomId;

  public InstallVmtoolsParamsData() { 
  }

  public InstallVmtoolsParamsData svtImageId(String svtImageId) {
    
    this.svtImageId = svtImageId;
    return this;
  }

   /**
   * Get svtImageId
   * @return svtImageId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getSvtImageId() {
    return svtImageId;
  }


  public void setSvtImageId(String svtImageId) {
    this.svtImageId = svtImageId;
  }


  public InstallVmtoolsParamsData cdRomId(String cdRomId) {
    
    this.cdRomId = cdRomId;
    return this;
  }

   /**
   * Get cdRomId
   * @return cdRomId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getCdRomId() {
    return cdRomId;
  }


  public void setCdRomId(String cdRomId) {
    this.cdRomId = cdRomId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InstallVmtoolsParamsData installVmtoolsParamsData = (InstallVmtoolsParamsData) o;
    return Objects.equals(this.svtImageId, installVmtoolsParamsData.svtImageId) &&
        Objects.equals(this.cdRomId, installVmtoolsParamsData.cdRomId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(svtImageId, cdRomId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InstallVmtoolsParamsData {\n");
    sb.append("    svtImageId: ").append(toIndentedString(svtImageId)).append("\n");
    sb.append("    cdRomId: ").append(toIndentedString(cdRomId)).append("\n");
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

