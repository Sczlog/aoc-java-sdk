package com.arcfra.aoc.model;

import java.util.Objects;
import java.util.Arrays;
import com.arcfra.aoc.model.MetroCheckStatusEnum;
import com.arcfra.aoc.model.NestedMetroCheckItem;
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
 * NestedMetroCheckResult
 */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class NestedMetroCheckResult {
  public static final String SERIALIZED_NAME_CRITICAL = "critical";
  @SerializedName(SERIALIZED_NAME_CRITICAL)
  private Integer critical;

  public static final String SERIALIZED_NAME_INFO = "info";
  @SerializedName(SERIALIZED_NAME_INFO)
  private Integer info;

  public static final String SERIALIZED_NAME_ITEMS = "items";
  @SerializedName(SERIALIZED_NAME_ITEMS)
  private List<NestedMetroCheckItem> items = new ArrayList<NestedMetroCheckItem>();

  public static final String SERIALIZED_NAME_NOTICE = "notice";
  @SerializedName(SERIALIZED_NAME_NOTICE)
  private Integer notice;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private MetroCheckStatusEnum status;

  public NestedMetroCheckResult() { 
  }

  public NestedMetroCheckResult critical(Integer critical) {
    
    this.critical = critical;
    return this;
  }

   /**
   * Get critical
   * @return critical
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getCritical() {
    return critical;
  }


  public void setCritical(Integer critical) {
    this.critical = critical;
  }


  public NestedMetroCheckResult info(Integer info) {
    
    this.info = info;
    return this;
  }

   /**
   * Get info
   * @return info
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getInfo() {
    return info;
  }


  public void setInfo(Integer info) {
    this.info = info;
  }


  public NestedMetroCheckResult items(List<NestedMetroCheckItem> items) {
    
    this.items = items;
    return this;
  }

  public NestedMetroCheckResult addItemsItem(NestedMetroCheckItem itemsItem) {
    this.items.add(itemsItem);
    return this;
  }

   /**
   * Get items
   * @return items
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<NestedMetroCheckItem> getItems() {
    return items;
  }


  public void setItems(List<NestedMetroCheckItem> items) {
    this.items = items;
  }


  public NestedMetroCheckResult notice(Integer notice) {
    
    this.notice = notice;
    return this;
  }

   /**
   * Get notice
   * @return notice
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getNotice() {
    return notice;
  }


  public void setNotice(Integer notice) {
    this.notice = notice;
  }


  public NestedMetroCheckResult status(MetroCheckStatusEnum status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public MetroCheckStatusEnum getStatus() {
    return status;
  }


  public void setStatus(MetroCheckStatusEnum status) {
    this.status = status;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NestedMetroCheckResult nestedMetroCheckResult = (NestedMetroCheckResult) o;
    return Objects.equals(this.critical, nestedMetroCheckResult.critical) &&
        Objects.equals(this.info, nestedMetroCheckResult.info) &&
        Objects.equals(this.items, nestedMetroCheckResult.items) &&
        Objects.equals(this.notice, nestedMetroCheckResult.notice) &&
        Objects.equals(this.status, nestedMetroCheckResult.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(critical, info, items, notice, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NestedMetroCheckResult {\n");
    sb.append("    critical: ").append(toIndentedString(critical)).append("\n");
    sb.append("    info: ").append(toIndentedString(info)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    notice: ").append(toIndentedString(notice)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

