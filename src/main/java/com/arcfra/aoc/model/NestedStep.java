package com.arcfra.aoc.model;

import java.util.Objects;
import java.util.Arrays;
import com.arcfra.aoc.model.StepUnit;
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
 * NestedStep
 */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class NestedStep {
  public static final String SERIALIZED_NAME_CURRENT = "current";
  @SerializedName(SERIALIZED_NAME_CURRENT)
  private Double current;

  public static final String SERIALIZED_NAME_FINISHED = "finished";
  @SerializedName(SERIALIZED_NAME_FINISHED)
  private Boolean finished;

  public static final String SERIALIZED_NAME_KEY = "key";
  @SerializedName(SERIALIZED_NAME_KEY)
  private String key;

  public static final String SERIALIZED_NAME_PER_SECOND = "per_second";
  @SerializedName(SERIALIZED_NAME_PER_SECOND)
  private Double perSecond;

  public static final String SERIALIZED_NAME_TOTAL = "total";
  @SerializedName(SERIALIZED_NAME_TOTAL)
  private Double total;

  public static final String SERIALIZED_NAME_UNIT = "unit";
  @SerializedName(SERIALIZED_NAME_UNIT)
  private StepUnit unit;

  public NestedStep() { 
  }

  public NestedStep current(Double current) {
    
    this.current = current;
    return this;
  }

   /**
   * Get current
   * @return current
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getCurrent() {
    return current;
  }


  public void setCurrent(Double current) {
    this.current = current;
  }


  public NestedStep finished(Boolean finished) {
    
    this.finished = finished;
    return this;
  }

   /**
   * Get finished
   * @return finished
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getFinished() {
    return finished;
  }


  public void setFinished(Boolean finished) {
    this.finished = finished;
  }


  public NestedStep key(String key) {
    
    this.key = key;
    return this;
  }

   /**
   * Get key
   * @return key
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getKey() {
    return key;
  }


  public void setKey(String key) {
    this.key = key;
  }


  public NestedStep perSecond(Double perSecond) {
    
    this.perSecond = perSecond;
    return this;
  }

   /**
   * Get perSecond
   * @return perSecond
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getPerSecond() {
    return perSecond;
  }


  public void setPerSecond(Double perSecond) {
    this.perSecond = perSecond;
  }


  public NestedStep total(Double total) {
    
    this.total = total;
    return this;
  }

   /**
   * Get total
   * @return total
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getTotal() {
    return total;
  }


  public void setTotal(Double total) {
    this.total = total;
  }


  public NestedStep unit(StepUnit unit) {
    
    this.unit = unit;
    return this;
  }

   /**
   * Get unit
   * @return unit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public StepUnit getUnit() {
    return unit;
  }


  public void setUnit(StepUnit unit) {
    this.unit = unit;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NestedStep nestedStep = (NestedStep) o;
    return Objects.equals(this.current, nestedStep.current) &&
        Objects.equals(this.finished, nestedStep.finished) &&
        Objects.equals(this.key, nestedStep.key) &&
        Objects.equals(this.perSecond, nestedStep.perSecond) &&
        Objects.equals(this.total, nestedStep.total) &&
        Objects.equals(this.unit, nestedStep.unit);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(current, finished, key, perSecond, total, unit);
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
    sb.append("class NestedStep {\n");
    sb.append("    current: ").append(toIndentedString(current)).append("\n");
    sb.append("    finished: ").append(toIndentedString(finished)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    perSecond: ").append(toIndentedString(perSecond)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
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

