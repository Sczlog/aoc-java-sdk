package com.arcfra.aoc.model;

import java.util.Objects;
import java.util.Arrays;
import com.arcfra.aoc.model.SvtImageOrderByInput;
import com.arcfra.aoc.model.SvtImageWhereInput;
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
 * GetSvtImagesConnectionRequestBody
 */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class GetSvtImagesConnectionRequestBody {
  public static final String SERIALIZED_NAME_AFTER = "after";
  @SerializedName(SERIALIZED_NAME_AFTER)
  private String after;

  public static final String SERIALIZED_NAME_BEFORE = "before";
  @SerializedName(SERIALIZED_NAME_BEFORE)
  private String before;

  public static final String SERIALIZED_NAME_FIRST = "first";
  @SerializedName(SERIALIZED_NAME_FIRST)
  private Integer first;

  public static final String SERIALIZED_NAME_LAST = "last";
  @SerializedName(SERIALIZED_NAME_LAST)
  private Integer last;

  public static final String SERIALIZED_NAME_ORDER_BY = "orderBy";
  @SerializedName(SERIALIZED_NAME_ORDER_BY)
  private SvtImageOrderByInput orderBy;

  public static final String SERIALIZED_NAME_SKIP = "skip";
  @SerializedName(SERIALIZED_NAME_SKIP)
  private Integer skip;

  public static final String SERIALIZED_NAME_WHERE = "where";
  @SerializedName(SERIALIZED_NAME_WHERE)
  private SvtImageWhereInput where;

  public GetSvtImagesConnectionRequestBody() { 
  }

  public GetSvtImagesConnectionRequestBody after(String after) {
    
    this.after = after;
    return this;
  }

   /**
   * Get after
   * @return after
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAfter() {
    return after;
  }


  public void setAfter(String after) {
    this.after = after;
  }


  public GetSvtImagesConnectionRequestBody before(String before) {
    
    this.before = before;
    return this;
  }

   /**
   * Get before
   * @return before
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getBefore() {
    return before;
  }


  public void setBefore(String before) {
    this.before = before;
  }


  public GetSvtImagesConnectionRequestBody first(Integer first) {
    
    this.first = first;
    return this;
  }

   /**
   * Get first
   * @return first
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getFirst() {
    return first;
  }


  public void setFirst(Integer first) {
    this.first = first;
  }


  public GetSvtImagesConnectionRequestBody last(Integer last) {
    
    this.last = last;
    return this;
  }

   /**
   * Get last
   * @return last
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getLast() {
    return last;
  }


  public void setLast(Integer last) {
    this.last = last;
  }


  public GetSvtImagesConnectionRequestBody orderBy(SvtImageOrderByInput orderBy) {
    
    this.orderBy = orderBy;
    return this;
  }

   /**
   * Get orderBy
   * @return orderBy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SvtImageOrderByInput getOrderBy() {
    return orderBy;
  }


  public void setOrderBy(SvtImageOrderByInput orderBy) {
    this.orderBy = orderBy;
  }


  public GetSvtImagesConnectionRequestBody skip(Integer skip) {
    
    this.skip = skip;
    return this;
  }

   /**
   * Get skip
   * @return skip
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getSkip() {
    return skip;
  }


  public void setSkip(Integer skip) {
    this.skip = skip;
  }


  public GetSvtImagesConnectionRequestBody where(SvtImageWhereInput where) {
    
    this.where = where;
    return this;
  }

   /**
   * Get where
   * @return where
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SvtImageWhereInput getWhere() {
    return where;
  }


  public void setWhere(SvtImageWhereInput where) {
    this.where = where;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetSvtImagesConnectionRequestBody getSvtImagesConnectionRequestBody = (GetSvtImagesConnectionRequestBody) o;
    return Objects.equals(this.after, getSvtImagesConnectionRequestBody.after) &&
        Objects.equals(this.before, getSvtImagesConnectionRequestBody.before) &&
        Objects.equals(this.first, getSvtImagesConnectionRequestBody.first) &&
        Objects.equals(this.last, getSvtImagesConnectionRequestBody.last) &&
        Objects.equals(this.orderBy, getSvtImagesConnectionRequestBody.orderBy) &&
        Objects.equals(this.skip, getSvtImagesConnectionRequestBody.skip) &&
        Objects.equals(this.where, getSvtImagesConnectionRequestBody.where);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(after, before, first, last, orderBy, skip, where);
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
    sb.append("class GetSvtImagesConnectionRequestBody {\n");
    sb.append("    after: ").append(toIndentedString(after)).append("\n");
    sb.append("    before: ").append(toIndentedString(before)).append("\n");
    sb.append("    first: ").append(toIndentedString(first)).append("\n");
    sb.append("    last: ").append(toIndentedString(last)).append("\n");
    sb.append("    orderBy: ").append(toIndentedString(orderBy)).append("\n");
    sb.append("    skip: ").append(toIndentedString(skip)).append("\n");
    sb.append("    where: ").append(toIndentedString(where)).append("\n");
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

