package com.arcfra.aoc.model;

import java.util.Objects;
import java.util.Arrays;
import com.arcfra.aoc.model.MetroCheckStatusEnum;
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
 * NestedMetroCheckItem
 */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class NestedMetroCheckItem {
  public static final String SERIALIZED_NAME_CRITICAL = "critical";
  @SerializedName(SERIALIZED_NAME_CRITICAL)
  private List<String> critical = new ArrayList<String>();

  public static final String SERIALIZED_NAME_INFO = "info";
  @SerializedName(SERIALIZED_NAME_INFO)
  private List<String> info = new ArrayList<String>();

  public static final String SERIALIZED_NAME_KEY = "key";
  @SerializedName(SERIALIZED_NAME_KEY)
  private String key;

  public static final String SERIALIZED_NAME_LABELS = "labels";
  @SerializedName(SERIALIZED_NAME_LABELS)
  private Object labels;

  public static final String SERIALIZED_NAME_NOTICE = "notice";
  @SerializedName(SERIALIZED_NAME_NOTICE)
  private List<String> notice = new ArrayList<String>();

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private MetroCheckStatusEnum status;

  public NestedMetroCheckItem() { 
  }

  public NestedMetroCheckItem critical(List<String> critical) {
    
    this.critical = critical;
    return this;
  }

  public NestedMetroCheckItem addCriticalItem(String criticalItem) {
    this.critical.add(criticalItem);
    return this;
  }

   /**
   * Get critical
   * @return critical
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<String> getCritical() {
    return critical;
  }


  public void setCritical(List<String> critical) {
    this.critical = critical;
  }


  public NestedMetroCheckItem info(List<String> info) {
    
    this.info = info;
    return this;
  }

  public NestedMetroCheckItem addInfoItem(String infoItem) {
    this.info.add(infoItem);
    return this;
  }

   /**
   * Get info
   * @return info
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<String> getInfo() {
    return info;
  }


  public void setInfo(List<String> info) {
    this.info = info;
  }


  public NestedMetroCheckItem key(String key) {
    
    this.key = key;
    return this;
  }

   /**
   * Get key
   * @return key
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getKey() {
    return key;
  }


  public void setKey(String key) {
    this.key = key;
  }


  public NestedMetroCheckItem labels(Object labels) {
    
    this.labels = labels;
    return this;
  }

   /**
   * Get labels
   * @return labels
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Object getLabels() {
    return labels;
  }


  public void setLabels(Object labels) {
    this.labels = labels;
  }


  public NestedMetroCheckItem notice(List<String> notice) {
    
    this.notice = notice;
    return this;
  }

  public NestedMetroCheckItem addNoticeItem(String noticeItem) {
    this.notice.add(noticeItem);
    return this;
  }

   /**
   * Get notice
   * @return notice
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<String> getNotice() {
    return notice;
  }


  public void setNotice(List<String> notice) {
    this.notice = notice;
  }


  public NestedMetroCheckItem status(MetroCheckStatusEnum status) {
    
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
    NestedMetroCheckItem nestedMetroCheckItem = (NestedMetroCheckItem) o;
    return Objects.equals(this.critical, nestedMetroCheckItem.critical) &&
        Objects.equals(this.info, nestedMetroCheckItem.info) &&
        Objects.equals(this.key, nestedMetroCheckItem.key) &&
        Objects.equals(this.labels, nestedMetroCheckItem.labels) &&
        Objects.equals(this.notice, nestedMetroCheckItem.notice) &&
        Objects.equals(this.status, nestedMetroCheckItem.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(critical, info, key, labels, notice, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NestedMetroCheckItem {\n");
    sb.append("    critical: ").append(toIndentedString(critical)).append("\n");
    sb.append("    info: ").append(toIndentedString(info)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
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

