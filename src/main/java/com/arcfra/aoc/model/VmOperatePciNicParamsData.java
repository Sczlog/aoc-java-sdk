package com.arcfra.aoc.model;

import java.util.Objects;
import java.util.Arrays;
import com.arcfra.aoc.model.NicWhereInput;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * VmOperatePciNicParamsData
 */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class VmOperatePciNicParamsData {
  public static final String SERIALIZED_NAME_PCI_NICS = "pci_nics";
  @SerializedName(SERIALIZED_NAME_PCI_NICS)
  private NicWhereInput pciNics;

  public VmOperatePciNicParamsData() { 
  }

  public VmOperatePciNicParamsData pciNics(NicWhereInput pciNics) {
    
    this.pciNics = pciNics;
    return this;
  }

   /**
   * Get pciNics
   * @return pciNics
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public NicWhereInput getPciNics() {
    return pciNics;
  }


  public void setPciNics(NicWhereInput pciNics) {
    this.pciNics = pciNics;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VmOperatePciNicParamsData vmOperatePciNicParamsData = (VmOperatePciNicParamsData) o;
    return Objects.equals(this.pciNics, vmOperatePciNicParamsData.pciNics);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pciNics);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VmOperatePciNicParamsData {\n");
    sb.append("    pciNics: ").append(toIndentedString(pciNics)).append("\n");
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

