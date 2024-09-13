package com.arcfra.aoc.model;

import java.util.Objects;
import java.util.Arrays;
import com.arcfra.aoc.model.NestedMetroCheckResult;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * NestedMetroAvailabilityChecklist
 */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class NestedMetroAvailabilityChecklist {
  public static final String SERIALIZED_NAME_PRIMARY_ZONE = "primaryZone";
  @SerializedName(SERIALIZED_NAME_PRIMARY_ZONE)
  private NestedMetroCheckResult primaryZone;

  public static final String SERIALIZED_NAME_PRIMARY_ZONE_AND_WITNESS = "primaryZoneAndWitness";
  @SerializedName(SERIALIZED_NAME_PRIMARY_ZONE_AND_WITNESS)
  private NestedMetroCheckResult primaryZoneAndWitness;

  public static final String SERIALIZED_NAME_SECONDARY_ZONE = "secondaryZone";
  @SerializedName(SERIALIZED_NAME_SECONDARY_ZONE)
  private NestedMetroCheckResult secondaryZone;

  public static final String SERIALIZED_NAME_SECONDARY_ZONE_AND_WITNESS = "secondaryZoneAndWitness";
  @SerializedName(SERIALIZED_NAME_SECONDARY_ZONE_AND_WITNESS)
  private NestedMetroCheckResult secondaryZoneAndWitness;

  public static final String SERIALIZED_NAME_WITNESS = "witness";
  @SerializedName(SERIALIZED_NAME_WITNESS)
  private NestedMetroCheckResult witness;

  public static final String SERIALIZED_NAME_ZONE_AND_ZONE = "zoneAndZone";
  @SerializedName(SERIALIZED_NAME_ZONE_AND_ZONE)
  private NestedMetroCheckResult zoneAndZone;

  public NestedMetroAvailabilityChecklist() { 
  }

  public NestedMetroAvailabilityChecklist primaryZone(NestedMetroCheckResult primaryZone) {
    
    this.primaryZone = primaryZone;
    return this;
  }

   /**
   * Get primaryZone
   * @return primaryZone
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public NestedMetroCheckResult getPrimaryZone() {
    return primaryZone;
  }


  public void setPrimaryZone(NestedMetroCheckResult primaryZone) {
    this.primaryZone = primaryZone;
  }


  public NestedMetroAvailabilityChecklist primaryZoneAndWitness(NestedMetroCheckResult primaryZoneAndWitness) {
    
    this.primaryZoneAndWitness = primaryZoneAndWitness;
    return this;
  }

   /**
   * Get primaryZoneAndWitness
   * @return primaryZoneAndWitness
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public NestedMetroCheckResult getPrimaryZoneAndWitness() {
    return primaryZoneAndWitness;
  }


  public void setPrimaryZoneAndWitness(NestedMetroCheckResult primaryZoneAndWitness) {
    this.primaryZoneAndWitness = primaryZoneAndWitness;
  }


  public NestedMetroAvailabilityChecklist secondaryZone(NestedMetroCheckResult secondaryZone) {
    
    this.secondaryZone = secondaryZone;
    return this;
  }

   /**
   * Get secondaryZone
   * @return secondaryZone
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public NestedMetroCheckResult getSecondaryZone() {
    return secondaryZone;
  }


  public void setSecondaryZone(NestedMetroCheckResult secondaryZone) {
    this.secondaryZone = secondaryZone;
  }


  public NestedMetroAvailabilityChecklist secondaryZoneAndWitness(NestedMetroCheckResult secondaryZoneAndWitness) {
    
    this.secondaryZoneAndWitness = secondaryZoneAndWitness;
    return this;
  }

   /**
   * Get secondaryZoneAndWitness
   * @return secondaryZoneAndWitness
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public NestedMetroCheckResult getSecondaryZoneAndWitness() {
    return secondaryZoneAndWitness;
  }


  public void setSecondaryZoneAndWitness(NestedMetroCheckResult secondaryZoneAndWitness) {
    this.secondaryZoneAndWitness = secondaryZoneAndWitness;
  }


  public NestedMetroAvailabilityChecklist witness(NestedMetroCheckResult witness) {
    
    this.witness = witness;
    return this;
  }

   /**
   * Get witness
   * @return witness
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public NestedMetroCheckResult getWitness() {
    return witness;
  }


  public void setWitness(NestedMetroCheckResult witness) {
    this.witness = witness;
  }


  public NestedMetroAvailabilityChecklist zoneAndZone(NestedMetroCheckResult zoneAndZone) {
    
    this.zoneAndZone = zoneAndZone;
    return this;
  }

   /**
   * Get zoneAndZone
   * @return zoneAndZone
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public NestedMetroCheckResult getZoneAndZone() {
    return zoneAndZone;
  }


  public void setZoneAndZone(NestedMetroCheckResult zoneAndZone) {
    this.zoneAndZone = zoneAndZone;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NestedMetroAvailabilityChecklist nestedMetroAvailabilityChecklist = (NestedMetroAvailabilityChecklist) o;
    return Objects.equals(this.primaryZone, nestedMetroAvailabilityChecklist.primaryZone) &&
        Objects.equals(this.primaryZoneAndWitness, nestedMetroAvailabilityChecklist.primaryZoneAndWitness) &&
        Objects.equals(this.secondaryZone, nestedMetroAvailabilityChecklist.secondaryZone) &&
        Objects.equals(this.secondaryZoneAndWitness, nestedMetroAvailabilityChecklist.secondaryZoneAndWitness) &&
        Objects.equals(this.witness, nestedMetroAvailabilityChecklist.witness) &&
        Objects.equals(this.zoneAndZone, nestedMetroAvailabilityChecklist.zoneAndZone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(primaryZone, primaryZoneAndWitness, secondaryZone, secondaryZoneAndWitness, witness, zoneAndZone);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NestedMetroAvailabilityChecklist {\n");
    sb.append("    primaryZone: ").append(toIndentedString(primaryZone)).append("\n");
    sb.append("    primaryZoneAndWitness: ").append(toIndentedString(primaryZoneAndWitness)).append("\n");
    sb.append("    secondaryZone: ").append(toIndentedString(secondaryZone)).append("\n");
    sb.append("    secondaryZoneAndWitness: ").append(toIndentedString(secondaryZoneAndWitness)).append("\n");
    sb.append("    witness: ").append(toIndentedString(witness)).append("\n");
    sb.append("    zoneAndZone: ").append(toIndentedString(zoneAndZone)).append("\n");
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

