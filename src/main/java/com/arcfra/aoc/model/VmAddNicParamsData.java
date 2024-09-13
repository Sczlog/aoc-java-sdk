package com.arcfra.aoc.model;

import java.util.Objects;
import java.util.Arrays;
import com.arcfra.aoc.model.VmNicParams;
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
 * VmAddNicParamsData
 */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class VmAddNicParamsData {
  public static final String SERIALIZED_NAME_VM_NICS = "vm_nics";
  @SerializedName(SERIALIZED_NAME_VM_NICS)
  private List<VmNicParams> vmNics = new ArrayList<VmNicParams>();

  public VmAddNicParamsData() { 
  }

  public VmAddNicParamsData vmNics(List<VmNicParams> vmNics) {
    
    this.vmNics = vmNics;
    return this;
  }

  public VmAddNicParamsData addVmNicsItem(VmNicParams vmNicsItem) {
    this.vmNics.add(vmNicsItem);
    return this;
  }

   /**
   * Get vmNics
   * @return vmNics
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<VmNicParams> getVmNics() {
    return vmNics;
  }


  public void setVmNics(List<VmNicParams> vmNics) {
    this.vmNics = vmNics;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VmAddNicParamsData vmAddNicParamsData = (VmAddNicParamsData) o;
    return Objects.equals(this.vmNics, vmAddNicParamsData.vmNics);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vmNics);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VmAddNicParamsData {\n");
    sb.append("    vmNics: ").append(toIndentedString(vmNics)).append("\n");
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

