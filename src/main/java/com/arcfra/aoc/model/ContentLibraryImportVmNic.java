package com.arcfra.aoc.model;

import java.util.Objects;
import java.util.Arrays;
import com.arcfra.aoc.model.VmNicModel;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ContentLibraryImportVmNic
 */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class ContentLibraryImportVmNic {
  public static final String SERIALIZED_NAME_MIRROR = "mirror";
  @SerializedName(SERIALIZED_NAME_MIRROR)
  private Boolean mirror;

  public static final String SERIALIZED_NAME_MODEL = "model";
  @SerializedName(SERIALIZED_NAME_MODEL)
  private VmNicModel model;

  public static final String SERIALIZED_NAME_ENABLED = "enabled";
  @SerializedName(SERIALIZED_NAME_ENABLED)
  private Boolean enabled;

  public ContentLibraryImportVmNic() { 
  }

  public ContentLibraryImportVmNic mirror(Boolean mirror) {
    
    this.mirror = mirror;
    return this;
  }

   /**
   * Get mirror
   * @return mirror
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getMirror() {
    return mirror;
  }


  public void setMirror(Boolean mirror) {
    this.mirror = mirror;
  }


  public ContentLibraryImportVmNic model(VmNicModel model) {
    
    this.model = model;
    return this;
  }

   /**
   * Get model
   * @return model
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public VmNicModel getModel() {
    return model;
  }


  public void setModel(VmNicModel model) {
    this.model = model;
  }


  public ContentLibraryImportVmNic enabled(Boolean enabled) {
    
    this.enabled = enabled;
    return this;
  }

   /**
   * Get enabled
   * @return enabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getEnabled() {
    return enabled;
  }


  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContentLibraryImportVmNic contentLibraryImportVmNic = (ContentLibraryImportVmNic) o;
    return Objects.equals(this.mirror, contentLibraryImportVmNic.mirror) &&
        Objects.equals(this.model, contentLibraryImportVmNic.model) &&
        Objects.equals(this.enabled, contentLibraryImportVmNic.enabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mirror, model, enabled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContentLibraryImportVmNic {\n");
    sb.append("    mirror: ").append(toIndentedString(mirror)).append("\n");
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
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

