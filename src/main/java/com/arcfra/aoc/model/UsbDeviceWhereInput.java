package com.arcfra.aoc.model;

import java.util.Objects;
import java.util.Arrays;
import com.arcfra.aoc.model.EntityAsyncStatus;
import com.arcfra.aoc.model.HostWhereInput;
import com.arcfra.aoc.model.UsbDeviceStatus;
import com.arcfra.aoc.model.VmWhereInput;
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
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * UsbDeviceWhereInput
 */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class UsbDeviceWhereInput {
  public static final String SERIALIZED_NAME_A_N_D = "AND";
  @SerializedName(SERIALIZED_NAME_A_N_D)
  private List<UsbDeviceWhereInput> AND = null;

  public static final String SERIALIZED_NAME_N_O_T = "NOT";
  @SerializedName(SERIALIZED_NAME_N_O_T)
  private List<UsbDeviceWhereInput> NOT = null;

  public static final String SERIALIZED_NAME_O_R = "OR";
  @SerializedName(SERIALIZED_NAME_O_R)
  private List<UsbDeviceWhereInput> OR = null;

  public static final String SERIALIZED_NAME_BINDED = "binded";
  @SerializedName(SERIALIZED_NAME_BINDED)
  private Boolean binded;

  public static final String SERIALIZED_NAME_BINDED_NOT = "binded_not";
  @SerializedName(SERIALIZED_NAME_BINDED_NOT)
  private Boolean bindedNot;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_DESCRIPTION_CONTAINS = "description_contains";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION_CONTAINS)
  private String descriptionContains;

  public static final String SERIALIZED_NAME_DESCRIPTION_ENDS_WITH = "description_ends_with";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION_ENDS_WITH)
  private String descriptionEndsWith;

  public static final String SERIALIZED_NAME_DESCRIPTION_GT = "description_gt";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION_GT)
  private String descriptionGt;

  public static final String SERIALIZED_NAME_DESCRIPTION_GTE = "description_gte";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION_GTE)
  private String descriptionGte;

  public static final String SERIALIZED_NAME_DESCRIPTION_IN = "description_in";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION_IN)
  private List<String> descriptionIn = null;

  public static final String SERIALIZED_NAME_DESCRIPTION_LT = "description_lt";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION_LT)
  private String descriptionLt;

  public static final String SERIALIZED_NAME_DESCRIPTION_LTE = "description_lte";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION_LTE)
  private String descriptionLte;

  public static final String SERIALIZED_NAME_DESCRIPTION_NOT = "description_not";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION_NOT)
  private String descriptionNot;

  public static final String SERIALIZED_NAME_DESCRIPTION_NOT_CONTAINS = "description_not_contains";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION_NOT_CONTAINS)
  private String descriptionNotContains;

  public static final String SERIALIZED_NAME_DESCRIPTION_NOT_ENDS_WITH = "description_not_ends_with";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION_NOT_ENDS_WITH)
  private String descriptionNotEndsWith;

  public static final String SERIALIZED_NAME_DESCRIPTION_NOT_IN = "description_not_in";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION_NOT_IN)
  private List<String> descriptionNotIn = null;

  public static final String SERIALIZED_NAME_DESCRIPTION_NOT_STARTS_WITH = "description_not_starts_with";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION_NOT_STARTS_WITH)
  private String descriptionNotStartsWith;

  public static final String SERIALIZED_NAME_DESCRIPTION_STARTS_WITH = "description_starts_with";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION_STARTS_WITH)
  private String descriptionStartsWith;

  public static final String SERIALIZED_NAME_ENTITY_ASYNC_STATUS = "entityAsyncStatus";
  @SerializedName(SERIALIZED_NAME_ENTITY_ASYNC_STATUS)
  private EntityAsyncStatus entityAsyncStatus;

  public static final String SERIALIZED_NAME_ENTITY_ASYNC_STATUS_IN = "entityAsyncStatus_in";
  @SerializedName(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_IN)
  private List<EntityAsyncStatus> entityAsyncStatusIn = null;

  public static final String SERIALIZED_NAME_ENTITY_ASYNC_STATUS_NOT = "entityAsyncStatus_not";
  @SerializedName(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_NOT)
  private EntityAsyncStatus entityAsyncStatusNot;

  public static final String SERIALIZED_NAME_ENTITY_ASYNC_STATUS_NOT_IN = "entityAsyncStatus_not_in";
  @SerializedName(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_NOT_IN)
  private List<EntityAsyncStatus> entityAsyncStatusNotIn = null;

  public static final String SERIALIZED_NAME_HOST = "host";
  @SerializedName(SERIALIZED_NAME_HOST)
  private HostWhereInput host;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_ID_CONTAINS = "id_contains";
  @SerializedName(SERIALIZED_NAME_ID_CONTAINS)
  private String idContains;

  public static final String SERIALIZED_NAME_ID_ENDS_WITH = "id_ends_with";
  @SerializedName(SERIALIZED_NAME_ID_ENDS_WITH)
  private String idEndsWith;

  public static final String SERIALIZED_NAME_ID_GT = "id_gt";
  @SerializedName(SERIALIZED_NAME_ID_GT)
  private String idGt;

  public static final String SERIALIZED_NAME_ID_GTE = "id_gte";
  @SerializedName(SERIALIZED_NAME_ID_GTE)
  private String idGte;

  public static final String SERIALIZED_NAME_ID_IN = "id_in";
  @SerializedName(SERIALIZED_NAME_ID_IN)
  private List<String> idIn = null;

  public static final String SERIALIZED_NAME_ID_LT = "id_lt";
  @SerializedName(SERIALIZED_NAME_ID_LT)
  private String idLt;

  public static final String SERIALIZED_NAME_ID_LTE = "id_lte";
  @SerializedName(SERIALIZED_NAME_ID_LTE)
  private String idLte;

  public static final String SERIALIZED_NAME_ID_NOT = "id_not";
  @SerializedName(SERIALIZED_NAME_ID_NOT)
  private String idNot;

  public static final String SERIALIZED_NAME_ID_NOT_CONTAINS = "id_not_contains";
  @SerializedName(SERIALIZED_NAME_ID_NOT_CONTAINS)
  private String idNotContains;

  public static final String SERIALIZED_NAME_ID_NOT_ENDS_WITH = "id_not_ends_with";
  @SerializedName(SERIALIZED_NAME_ID_NOT_ENDS_WITH)
  private String idNotEndsWith;

  public static final String SERIALIZED_NAME_ID_NOT_IN = "id_not_in";
  @SerializedName(SERIALIZED_NAME_ID_NOT_IN)
  private List<String> idNotIn = null;

  public static final String SERIALIZED_NAME_ID_NOT_STARTS_WITH = "id_not_starts_with";
  @SerializedName(SERIALIZED_NAME_ID_NOT_STARTS_WITH)
  private String idNotStartsWith;

  public static final String SERIALIZED_NAME_ID_STARTS_WITH = "id_starts_with";
  @SerializedName(SERIALIZED_NAME_ID_STARTS_WITH)
  private String idStartsWith;

  public static final String SERIALIZED_NAME_LOCAL_CREATED_AT = "local_created_at";
  @SerializedName(SERIALIZED_NAME_LOCAL_CREATED_AT)
  private String localCreatedAt;

  public static final String SERIALIZED_NAME_LOCAL_CREATED_AT_GT = "local_created_at_gt";
  @SerializedName(SERIALIZED_NAME_LOCAL_CREATED_AT_GT)
  private String localCreatedAtGt;

  public static final String SERIALIZED_NAME_LOCAL_CREATED_AT_GTE = "local_created_at_gte";
  @SerializedName(SERIALIZED_NAME_LOCAL_CREATED_AT_GTE)
  private String localCreatedAtGte;

  public static final String SERIALIZED_NAME_LOCAL_CREATED_AT_IN = "local_created_at_in";
  @SerializedName(SERIALIZED_NAME_LOCAL_CREATED_AT_IN)
  private List<String> localCreatedAtIn = null;

  public static final String SERIALIZED_NAME_LOCAL_CREATED_AT_LT = "local_created_at_lt";
  @SerializedName(SERIALIZED_NAME_LOCAL_CREATED_AT_LT)
  private String localCreatedAtLt;

  public static final String SERIALIZED_NAME_LOCAL_CREATED_AT_LTE = "local_created_at_lte";
  @SerializedName(SERIALIZED_NAME_LOCAL_CREATED_AT_LTE)
  private String localCreatedAtLte;

  public static final String SERIALIZED_NAME_LOCAL_CREATED_AT_NOT = "local_created_at_not";
  @SerializedName(SERIALIZED_NAME_LOCAL_CREATED_AT_NOT)
  private String localCreatedAtNot;

  public static final String SERIALIZED_NAME_LOCAL_CREATED_AT_NOT_IN = "local_created_at_not_in";
  @SerializedName(SERIALIZED_NAME_LOCAL_CREATED_AT_NOT_IN)
  private List<String> localCreatedAtNotIn = null;

  public static final String SERIALIZED_NAME_LOCAL_ID = "local_id";
  @SerializedName(SERIALIZED_NAME_LOCAL_ID)
  private String localId;

  public static final String SERIALIZED_NAME_LOCAL_ID_CONTAINS = "local_id_contains";
  @SerializedName(SERIALIZED_NAME_LOCAL_ID_CONTAINS)
  private String localIdContains;

  public static final String SERIALIZED_NAME_LOCAL_ID_ENDS_WITH = "local_id_ends_with";
  @SerializedName(SERIALIZED_NAME_LOCAL_ID_ENDS_WITH)
  private String localIdEndsWith;

  public static final String SERIALIZED_NAME_LOCAL_ID_GT = "local_id_gt";
  @SerializedName(SERIALIZED_NAME_LOCAL_ID_GT)
  private String localIdGt;

  public static final String SERIALIZED_NAME_LOCAL_ID_GTE = "local_id_gte";
  @SerializedName(SERIALIZED_NAME_LOCAL_ID_GTE)
  private String localIdGte;

  public static final String SERIALIZED_NAME_LOCAL_ID_IN = "local_id_in";
  @SerializedName(SERIALIZED_NAME_LOCAL_ID_IN)
  private List<String> localIdIn = null;

  public static final String SERIALIZED_NAME_LOCAL_ID_LT = "local_id_lt";
  @SerializedName(SERIALIZED_NAME_LOCAL_ID_LT)
  private String localIdLt;

  public static final String SERIALIZED_NAME_LOCAL_ID_LTE = "local_id_lte";
  @SerializedName(SERIALIZED_NAME_LOCAL_ID_LTE)
  private String localIdLte;

  public static final String SERIALIZED_NAME_LOCAL_ID_NOT = "local_id_not";
  @SerializedName(SERIALIZED_NAME_LOCAL_ID_NOT)
  private String localIdNot;

  public static final String SERIALIZED_NAME_LOCAL_ID_NOT_CONTAINS = "local_id_not_contains";
  @SerializedName(SERIALIZED_NAME_LOCAL_ID_NOT_CONTAINS)
  private String localIdNotContains;

  public static final String SERIALIZED_NAME_LOCAL_ID_NOT_ENDS_WITH = "local_id_not_ends_with";
  @SerializedName(SERIALIZED_NAME_LOCAL_ID_NOT_ENDS_WITH)
  private String localIdNotEndsWith;

  public static final String SERIALIZED_NAME_LOCAL_ID_NOT_IN = "local_id_not_in";
  @SerializedName(SERIALIZED_NAME_LOCAL_ID_NOT_IN)
  private List<String> localIdNotIn = null;

  public static final String SERIALIZED_NAME_LOCAL_ID_NOT_STARTS_WITH = "local_id_not_starts_with";
  @SerializedName(SERIALIZED_NAME_LOCAL_ID_NOT_STARTS_WITH)
  private String localIdNotStartsWith;

  public static final String SERIALIZED_NAME_LOCAL_ID_STARTS_WITH = "local_id_starts_with";
  @SerializedName(SERIALIZED_NAME_LOCAL_ID_STARTS_WITH)
  private String localIdStartsWith;

  public static final String SERIALIZED_NAME_MANUFACTURER = "manufacturer";
  @SerializedName(SERIALIZED_NAME_MANUFACTURER)
  private String manufacturer;

  public static final String SERIALIZED_NAME_MANUFACTURER_CONTAINS = "manufacturer_contains";
  @SerializedName(SERIALIZED_NAME_MANUFACTURER_CONTAINS)
  private String manufacturerContains;

  public static final String SERIALIZED_NAME_MANUFACTURER_ENDS_WITH = "manufacturer_ends_with";
  @SerializedName(SERIALIZED_NAME_MANUFACTURER_ENDS_WITH)
  private String manufacturerEndsWith;

  public static final String SERIALIZED_NAME_MANUFACTURER_GT = "manufacturer_gt";
  @SerializedName(SERIALIZED_NAME_MANUFACTURER_GT)
  private String manufacturerGt;

  public static final String SERIALIZED_NAME_MANUFACTURER_GTE = "manufacturer_gte";
  @SerializedName(SERIALIZED_NAME_MANUFACTURER_GTE)
  private String manufacturerGte;

  public static final String SERIALIZED_NAME_MANUFACTURER_IN = "manufacturer_in";
  @SerializedName(SERIALIZED_NAME_MANUFACTURER_IN)
  private List<String> manufacturerIn = null;

  public static final String SERIALIZED_NAME_MANUFACTURER_LT = "manufacturer_lt";
  @SerializedName(SERIALIZED_NAME_MANUFACTURER_LT)
  private String manufacturerLt;

  public static final String SERIALIZED_NAME_MANUFACTURER_LTE = "manufacturer_lte";
  @SerializedName(SERIALIZED_NAME_MANUFACTURER_LTE)
  private String manufacturerLte;

  public static final String SERIALIZED_NAME_MANUFACTURER_NOT = "manufacturer_not";
  @SerializedName(SERIALIZED_NAME_MANUFACTURER_NOT)
  private String manufacturerNot;

  public static final String SERIALIZED_NAME_MANUFACTURER_NOT_CONTAINS = "manufacturer_not_contains";
  @SerializedName(SERIALIZED_NAME_MANUFACTURER_NOT_CONTAINS)
  private String manufacturerNotContains;

  public static final String SERIALIZED_NAME_MANUFACTURER_NOT_ENDS_WITH = "manufacturer_not_ends_with";
  @SerializedName(SERIALIZED_NAME_MANUFACTURER_NOT_ENDS_WITH)
  private String manufacturerNotEndsWith;

  public static final String SERIALIZED_NAME_MANUFACTURER_NOT_IN = "manufacturer_not_in";
  @SerializedName(SERIALIZED_NAME_MANUFACTURER_NOT_IN)
  private List<String> manufacturerNotIn = null;

  public static final String SERIALIZED_NAME_MANUFACTURER_NOT_STARTS_WITH = "manufacturer_not_starts_with";
  @SerializedName(SERIALIZED_NAME_MANUFACTURER_NOT_STARTS_WITH)
  private String manufacturerNotStartsWith;

  public static final String SERIALIZED_NAME_MANUFACTURER_STARTS_WITH = "manufacturer_starts_with";
  @SerializedName(SERIALIZED_NAME_MANUFACTURER_STARTS_WITH)
  private String manufacturerStartsWith;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NAME_CONTAINS = "name_contains";
  @SerializedName(SERIALIZED_NAME_NAME_CONTAINS)
  private String nameContains;

  public static final String SERIALIZED_NAME_NAME_ENDS_WITH = "name_ends_with";
  @SerializedName(SERIALIZED_NAME_NAME_ENDS_WITH)
  private String nameEndsWith;

  public static final String SERIALIZED_NAME_NAME_GT = "name_gt";
  @SerializedName(SERIALIZED_NAME_NAME_GT)
  private String nameGt;

  public static final String SERIALIZED_NAME_NAME_GTE = "name_gte";
  @SerializedName(SERIALIZED_NAME_NAME_GTE)
  private String nameGte;

  public static final String SERIALIZED_NAME_NAME_IN = "name_in";
  @SerializedName(SERIALIZED_NAME_NAME_IN)
  private List<String> nameIn = null;

  public static final String SERIALIZED_NAME_NAME_LT = "name_lt";
  @SerializedName(SERIALIZED_NAME_NAME_LT)
  private String nameLt;

  public static final String SERIALIZED_NAME_NAME_LTE = "name_lte";
  @SerializedName(SERIALIZED_NAME_NAME_LTE)
  private String nameLte;

  public static final String SERIALIZED_NAME_NAME_NOT = "name_not";
  @SerializedName(SERIALIZED_NAME_NAME_NOT)
  private String nameNot;

  public static final String SERIALIZED_NAME_NAME_NOT_CONTAINS = "name_not_contains";
  @SerializedName(SERIALIZED_NAME_NAME_NOT_CONTAINS)
  private String nameNotContains;

  public static final String SERIALIZED_NAME_NAME_NOT_ENDS_WITH = "name_not_ends_with";
  @SerializedName(SERIALIZED_NAME_NAME_NOT_ENDS_WITH)
  private String nameNotEndsWith;

  public static final String SERIALIZED_NAME_NAME_NOT_IN = "name_not_in";
  @SerializedName(SERIALIZED_NAME_NAME_NOT_IN)
  private List<String> nameNotIn = null;

  public static final String SERIALIZED_NAME_NAME_NOT_STARTS_WITH = "name_not_starts_with";
  @SerializedName(SERIALIZED_NAME_NAME_NOT_STARTS_WITH)
  private String nameNotStartsWith;

  public static final String SERIALIZED_NAME_NAME_STARTS_WITH = "name_starts_with";
  @SerializedName(SERIALIZED_NAME_NAME_STARTS_WITH)
  private String nameStartsWith;

  public static final String SERIALIZED_NAME_SIZE = "size";
  @SerializedName(SERIALIZED_NAME_SIZE)
  private Long size;

  public static final String SERIALIZED_NAME_SIZE_GT = "size_gt";
  @SerializedName(SERIALIZED_NAME_SIZE_GT)
  private Long sizeGt;

  public static final String SERIALIZED_NAME_SIZE_GTE = "size_gte";
  @SerializedName(SERIALIZED_NAME_SIZE_GTE)
  private Long sizeGte;

  public static final String SERIALIZED_NAME_SIZE_IN = "size_in";
  @SerializedName(SERIALIZED_NAME_SIZE_IN)
  private List<Long> sizeIn = null;

  public static final String SERIALIZED_NAME_SIZE_LT = "size_lt";
  @SerializedName(SERIALIZED_NAME_SIZE_LT)
  private Long sizeLt;

  public static final String SERIALIZED_NAME_SIZE_LTE = "size_lte";
  @SerializedName(SERIALIZED_NAME_SIZE_LTE)
  private Long sizeLte;

  public static final String SERIALIZED_NAME_SIZE_NOT = "size_not";
  @SerializedName(SERIALIZED_NAME_SIZE_NOT)
  private Long sizeNot;

  public static final String SERIALIZED_NAME_SIZE_NOT_IN = "size_not_in";
  @SerializedName(SERIALIZED_NAME_SIZE_NOT_IN)
  private List<Long> sizeNotIn = null;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private UsbDeviceStatus status;

  public static final String SERIALIZED_NAME_STATUS_IN = "status_in";
  @SerializedName(SERIALIZED_NAME_STATUS_IN)
  private List<UsbDeviceStatus> statusIn = null;

  public static final String SERIALIZED_NAME_STATUS_NOT = "status_not";
  @SerializedName(SERIALIZED_NAME_STATUS_NOT)
  private UsbDeviceStatus statusNot;

  public static final String SERIALIZED_NAME_STATUS_NOT_IN = "status_not_in";
  @SerializedName(SERIALIZED_NAME_STATUS_NOT_IN)
  private List<UsbDeviceStatus> statusNotIn = null;

  public static final String SERIALIZED_NAME_USB_TYPE = "usb_type";
  @SerializedName(SERIALIZED_NAME_USB_TYPE)
  private String usbType;

  public static final String SERIALIZED_NAME_USB_TYPE_CONTAINS = "usb_type_contains";
  @SerializedName(SERIALIZED_NAME_USB_TYPE_CONTAINS)
  private String usbTypeContains;

  public static final String SERIALIZED_NAME_USB_TYPE_ENDS_WITH = "usb_type_ends_with";
  @SerializedName(SERIALIZED_NAME_USB_TYPE_ENDS_WITH)
  private String usbTypeEndsWith;

  public static final String SERIALIZED_NAME_USB_TYPE_GT = "usb_type_gt";
  @SerializedName(SERIALIZED_NAME_USB_TYPE_GT)
  private String usbTypeGt;

  public static final String SERIALIZED_NAME_USB_TYPE_GTE = "usb_type_gte";
  @SerializedName(SERIALIZED_NAME_USB_TYPE_GTE)
  private String usbTypeGte;

  public static final String SERIALIZED_NAME_USB_TYPE_IN = "usb_type_in";
  @SerializedName(SERIALIZED_NAME_USB_TYPE_IN)
  private List<String> usbTypeIn = null;

  public static final String SERIALIZED_NAME_USB_TYPE_LT = "usb_type_lt";
  @SerializedName(SERIALIZED_NAME_USB_TYPE_LT)
  private String usbTypeLt;

  public static final String SERIALIZED_NAME_USB_TYPE_LTE = "usb_type_lte";
  @SerializedName(SERIALIZED_NAME_USB_TYPE_LTE)
  private String usbTypeLte;

  public static final String SERIALIZED_NAME_USB_TYPE_NOT = "usb_type_not";
  @SerializedName(SERIALIZED_NAME_USB_TYPE_NOT)
  private String usbTypeNot;

  public static final String SERIALIZED_NAME_USB_TYPE_NOT_CONTAINS = "usb_type_not_contains";
  @SerializedName(SERIALIZED_NAME_USB_TYPE_NOT_CONTAINS)
  private String usbTypeNotContains;

  public static final String SERIALIZED_NAME_USB_TYPE_NOT_ENDS_WITH = "usb_type_not_ends_with";
  @SerializedName(SERIALIZED_NAME_USB_TYPE_NOT_ENDS_WITH)
  private String usbTypeNotEndsWith;

  public static final String SERIALIZED_NAME_USB_TYPE_NOT_IN = "usb_type_not_in";
  @SerializedName(SERIALIZED_NAME_USB_TYPE_NOT_IN)
  private List<String> usbTypeNotIn = null;

  public static final String SERIALIZED_NAME_USB_TYPE_NOT_STARTS_WITH = "usb_type_not_starts_with";
  @SerializedName(SERIALIZED_NAME_USB_TYPE_NOT_STARTS_WITH)
  private String usbTypeNotStartsWith;

  public static final String SERIALIZED_NAME_USB_TYPE_STARTS_WITH = "usb_type_starts_with";
  @SerializedName(SERIALIZED_NAME_USB_TYPE_STARTS_WITH)
  private String usbTypeStartsWith;

  public static final String SERIALIZED_NAME_VMS_EVERY = "vms_every";
  @SerializedName(SERIALIZED_NAME_VMS_EVERY)
  private VmWhereInput vmsEvery;

  public static final String SERIALIZED_NAME_VMS_NONE = "vms_none";
  @SerializedName(SERIALIZED_NAME_VMS_NONE)
  private VmWhereInput vmsNone;

  public static final String SERIALIZED_NAME_VMS_SOME = "vms_some";
  @SerializedName(SERIALIZED_NAME_VMS_SOME)
  private VmWhereInput vmsSome;

  public UsbDeviceWhereInput() { 
  }

  public UsbDeviceWhereInput AND(List<UsbDeviceWhereInput> AND) {
    
    this.AND = AND;
    return this;
  }

  public UsbDeviceWhereInput addANDItem(UsbDeviceWhereInput ANDItem) {
    if (this.AND == null) {
      this.AND = new ArrayList<UsbDeviceWhereInput>();
    }
    this.AND.add(ANDItem);
    return this;
  }

   /**
   * Get AND
   * @return AND
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<UsbDeviceWhereInput> getAND() {
    return AND;
  }


  public void setAND(List<UsbDeviceWhereInput> AND) {
    this.AND = AND;
  }


  public UsbDeviceWhereInput NOT(List<UsbDeviceWhereInput> NOT) {
    
    this.NOT = NOT;
    return this;
  }

  public UsbDeviceWhereInput addNOTItem(UsbDeviceWhereInput NOTItem) {
    if (this.NOT == null) {
      this.NOT = new ArrayList<UsbDeviceWhereInput>();
    }
    this.NOT.add(NOTItem);
    return this;
  }

   /**
   * Get NOT
   * @return NOT
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<UsbDeviceWhereInput> getNOT() {
    return NOT;
  }


  public void setNOT(List<UsbDeviceWhereInput> NOT) {
    this.NOT = NOT;
  }


  public UsbDeviceWhereInput OR(List<UsbDeviceWhereInput> OR) {
    
    this.OR = OR;
    return this;
  }

  public UsbDeviceWhereInput addORItem(UsbDeviceWhereInput ORItem) {
    if (this.OR == null) {
      this.OR = new ArrayList<UsbDeviceWhereInput>();
    }
    this.OR.add(ORItem);
    return this;
  }

   /**
   * Get OR
   * @return OR
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<UsbDeviceWhereInput> getOR() {
    return OR;
  }


  public void setOR(List<UsbDeviceWhereInput> OR) {
    this.OR = OR;
  }


  public UsbDeviceWhereInput binded(Boolean binded) {
    
    this.binded = binded;
    return this;
  }

   /**
   * Get binded
   * @return binded
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getBinded() {
    return binded;
  }


  public void setBinded(Boolean binded) {
    this.binded = binded;
  }


  public UsbDeviceWhereInput bindedNot(Boolean bindedNot) {
    
    this.bindedNot = bindedNot;
    return this;
  }

   /**
   * Get bindedNot
   * @return bindedNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getBindedNot() {
    return bindedNot;
  }


  public void setBindedNot(Boolean bindedNot) {
    this.bindedNot = bindedNot;
  }


  public UsbDeviceWhereInput description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public UsbDeviceWhereInput descriptionContains(String descriptionContains) {
    
    this.descriptionContains = descriptionContains;
    return this;
  }

   /**
   * Get descriptionContains
   * @return descriptionContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDescriptionContains() {
    return descriptionContains;
  }


  public void setDescriptionContains(String descriptionContains) {
    this.descriptionContains = descriptionContains;
  }


  public UsbDeviceWhereInput descriptionEndsWith(String descriptionEndsWith) {
    
    this.descriptionEndsWith = descriptionEndsWith;
    return this;
  }

   /**
   * Get descriptionEndsWith
   * @return descriptionEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDescriptionEndsWith() {
    return descriptionEndsWith;
  }


  public void setDescriptionEndsWith(String descriptionEndsWith) {
    this.descriptionEndsWith = descriptionEndsWith;
  }


  public UsbDeviceWhereInput descriptionGt(String descriptionGt) {
    
    this.descriptionGt = descriptionGt;
    return this;
  }

   /**
   * Get descriptionGt
   * @return descriptionGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDescriptionGt() {
    return descriptionGt;
  }


  public void setDescriptionGt(String descriptionGt) {
    this.descriptionGt = descriptionGt;
  }


  public UsbDeviceWhereInput descriptionGte(String descriptionGte) {
    
    this.descriptionGte = descriptionGte;
    return this;
  }

   /**
   * Get descriptionGte
   * @return descriptionGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDescriptionGte() {
    return descriptionGte;
  }


  public void setDescriptionGte(String descriptionGte) {
    this.descriptionGte = descriptionGte;
  }


  public UsbDeviceWhereInput descriptionIn(List<String> descriptionIn) {
    
    this.descriptionIn = descriptionIn;
    return this;
  }

  public UsbDeviceWhereInput addDescriptionInItem(String descriptionInItem) {
    if (this.descriptionIn == null) {
      this.descriptionIn = new ArrayList<String>();
    }
    this.descriptionIn.add(descriptionInItem);
    return this;
  }

   /**
   * Get descriptionIn
   * @return descriptionIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getDescriptionIn() {
    return descriptionIn;
  }


  public void setDescriptionIn(List<String> descriptionIn) {
    this.descriptionIn = descriptionIn;
  }


  public UsbDeviceWhereInput descriptionLt(String descriptionLt) {
    
    this.descriptionLt = descriptionLt;
    return this;
  }

   /**
   * Get descriptionLt
   * @return descriptionLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDescriptionLt() {
    return descriptionLt;
  }


  public void setDescriptionLt(String descriptionLt) {
    this.descriptionLt = descriptionLt;
  }


  public UsbDeviceWhereInput descriptionLte(String descriptionLte) {
    
    this.descriptionLte = descriptionLte;
    return this;
  }

   /**
   * Get descriptionLte
   * @return descriptionLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDescriptionLte() {
    return descriptionLte;
  }


  public void setDescriptionLte(String descriptionLte) {
    this.descriptionLte = descriptionLte;
  }


  public UsbDeviceWhereInput descriptionNot(String descriptionNot) {
    
    this.descriptionNot = descriptionNot;
    return this;
  }

   /**
   * Get descriptionNot
   * @return descriptionNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDescriptionNot() {
    return descriptionNot;
  }


  public void setDescriptionNot(String descriptionNot) {
    this.descriptionNot = descriptionNot;
  }


  public UsbDeviceWhereInput descriptionNotContains(String descriptionNotContains) {
    
    this.descriptionNotContains = descriptionNotContains;
    return this;
  }

   /**
   * Get descriptionNotContains
   * @return descriptionNotContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDescriptionNotContains() {
    return descriptionNotContains;
  }


  public void setDescriptionNotContains(String descriptionNotContains) {
    this.descriptionNotContains = descriptionNotContains;
  }


  public UsbDeviceWhereInput descriptionNotEndsWith(String descriptionNotEndsWith) {
    
    this.descriptionNotEndsWith = descriptionNotEndsWith;
    return this;
  }

   /**
   * Get descriptionNotEndsWith
   * @return descriptionNotEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDescriptionNotEndsWith() {
    return descriptionNotEndsWith;
  }


  public void setDescriptionNotEndsWith(String descriptionNotEndsWith) {
    this.descriptionNotEndsWith = descriptionNotEndsWith;
  }


  public UsbDeviceWhereInput descriptionNotIn(List<String> descriptionNotIn) {
    
    this.descriptionNotIn = descriptionNotIn;
    return this;
  }

  public UsbDeviceWhereInput addDescriptionNotInItem(String descriptionNotInItem) {
    if (this.descriptionNotIn == null) {
      this.descriptionNotIn = new ArrayList<String>();
    }
    this.descriptionNotIn.add(descriptionNotInItem);
    return this;
  }

   /**
   * Get descriptionNotIn
   * @return descriptionNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getDescriptionNotIn() {
    return descriptionNotIn;
  }


  public void setDescriptionNotIn(List<String> descriptionNotIn) {
    this.descriptionNotIn = descriptionNotIn;
  }


  public UsbDeviceWhereInput descriptionNotStartsWith(String descriptionNotStartsWith) {
    
    this.descriptionNotStartsWith = descriptionNotStartsWith;
    return this;
  }

   /**
   * Get descriptionNotStartsWith
   * @return descriptionNotStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDescriptionNotStartsWith() {
    return descriptionNotStartsWith;
  }


  public void setDescriptionNotStartsWith(String descriptionNotStartsWith) {
    this.descriptionNotStartsWith = descriptionNotStartsWith;
  }


  public UsbDeviceWhereInput descriptionStartsWith(String descriptionStartsWith) {
    
    this.descriptionStartsWith = descriptionStartsWith;
    return this;
  }

   /**
   * Get descriptionStartsWith
   * @return descriptionStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDescriptionStartsWith() {
    return descriptionStartsWith;
  }


  public void setDescriptionStartsWith(String descriptionStartsWith) {
    this.descriptionStartsWith = descriptionStartsWith;
  }


  public UsbDeviceWhereInput entityAsyncStatus(EntityAsyncStatus entityAsyncStatus) {
    
    this.entityAsyncStatus = entityAsyncStatus;
    return this;
  }

   /**
   * Get entityAsyncStatus
   * @return entityAsyncStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public EntityAsyncStatus getEntityAsyncStatus() {
    return entityAsyncStatus;
  }


  public void setEntityAsyncStatus(EntityAsyncStatus entityAsyncStatus) {
    this.entityAsyncStatus = entityAsyncStatus;
  }


  public UsbDeviceWhereInput entityAsyncStatusIn(List<EntityAsyncStatus> entityAsyncStatusIn) {
    
    this.entityAsyncStatusIn = entityAsyncStatusIn;
    return this;
  }

  public UsbDeviceWhereInput addEntityAsyncStatusInItem(EntityAsyncStatus entityAsyncStatusInItem) {
    if (this.entityAsyncStatusIn == null) {
      this.entityAsyncStatusIn = new ArrayList<EntityAsyncStatus>();
    }
    this.entityAsyncStatusIn.add(entityAsyncStatusInItem);
    return this;
  }

   /**
   * Get entityAsyncStatusIn
   * @return entityAsyncStatusIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<EntityAsyncStatus> getEntityAsyncStatusIn() {
    return entityAsyncStatusIn;
  }


  public void setEntityAsyncStatusIn(List<EntityAsyncStatus> entityAsyncStatusIn) {
    this.entityAsyncStatusIn = entityAsyncStatusIn;
  }


  public UsbDeviceWhereInput entityAsyncStatusNot(EntityAsyncStatus entityAsyncStatusNot) {
    
    this.entityAsyncStatusNot = entityAsyncStatusNot;
    return this;
  }

   /**
   * Get entityAsyncStatusNot
   * @return entityAsyncStatusNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public EntityAsyncStatus getEntityAsyncStatusNot() {
    return entityAsyncStatusNot;
  }


  public void setEntityAsyncStatusNot(EntityAsyncStatus entityAsyncStatusNot) {
    this.entityAsyncStatusNot = entityAsyncStatusNot;
  }


  public UsbDeviceWhereInput entityAsyncStatusNotIn(List<EntityAsyncStatus> entityAsyncStatusNotIn) {
    
    this.entityAsyncStatusNotIn = entityAsyncStatusNotIn;
    return this;
  }

  public UsbDeviceWhereInput addEntityAsyncStatusNotInItem(EntityAsyncStatus entityAsyncStatusNotInItem) {
    if (this.entityAsyncStatusNotIn == null) {
      this.entityAsyncStatusNotIn = new ArrayList<EntityAsyncStatus>();
    }
    this.entityAsyncStatusNotIn.add(entityAsyncStatusNotInItem);
    return this;
  }

   /**
   * Get entityAsyncStatusNotIn
   * @return entityAsyncStatusNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<EntityAsyncStatus> getEntityAsyncStatusNotIn() {
    return entityAsyncStatusNotIn;
  }


  public void setEntityAsyncStatusNotIn(List<EntityAsyncStatus> entityAsyncStatusNotIn) {
    this.entityAsyncStatusNotIn = entityAsyncStatusNotIn;
  }


  public UsbDeviceWhereInput host(HostWhereInput host) {
    
    this.host = host;
    return this;
  }

   /**
   * Get host
   * @return host
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public HostWhereInput getHost() {
    return host;
  }


  public void setHost(HostWhereInput host) {
    this.host = host;
  }


  public UsbDeviceWhereInput id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public UsbDeviceWhereInput idContains(String idContains) {
    
    this.idContains = idContains;
    return this;
  }

   /**
   * Get idContains
   * @return idContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIdContains() {
    return idContains;
  }


  public void setIdContains(String idContains) {
    this.idContains = idContains;
  }


  public UsbDeviceWhereInput idEndsWith(String idEndsWith) {
    
    this.idEndsWith = idEndsWith;
    return this;
  }

   /**
   * Get idEndsWith
   * @return idEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIdEndsWith() {
    return idEndsWith;
  }


  public void setIdEndsWith(String idEndsWith) {
    this.idEndsWith = idEndsWith;
  }


  public UsbDeviceWhereInput idGt(String idGt) {
    
    this.idGt = idGt;
    return this;
  }

   /**
   * Get idGt
   * @return idGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIdGt() {
    return idGt;
  }


  public void setIdGt(String idGt) {
    this.idGt = idGt;
  }


  public UsbDeviceWhereInput idGte(String idGte) {
    
    this.idGte = idGte;
    return this;
  }

   /**
   * Get idGte
   * @return idGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIdGte() {
    return idGte;
  }


  public void setIdGte(String idGte) {
    this.idGte = idGte;
  }


  public UsbDeviceWhereInput idIn(List<String> idIn) {
    
    this.idIn = idIn;
    return this;
  }

  public UsbDeviceWhereInput addIdInItem(String idInItem) {
    if (this.idIn == null) {
      this.idIn = new ArrayList<String>();
    }
    this.idIn.add(idInItem);
    return this;
  }

   /**
   * Get idIn
   * @return idIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getIdIn() {
    return idIn;
  }


  public void setIdIn(List<String> idIn) {
    this.idIn = idIn;
  }


  public UsbDeviceWhereInput idLt(String idLt) {
    
    this.idLt = idLt;
    return this;
  }

   /**
   * Get idLt
   * @return idLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIdLt() {
    return idLt;
  }


  public void setIdLt(String idLt) {
    this.idLt = idLt;
  }


  public UsbDeviceWhereInput idLte(String idLte) {
    
    this.idLte = idLte;
    return this;
  }

   /**
   * Get idLte
   * @return idLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIdLte() {
    return idLte;
  }


  public void setIdLte(String idLte) {
    this.idLte = idLte;
  }


  public UsbDeviceWhereInput idNot(String idNot) {
    
    this.idNot = idNot;
    return this;
  }

   /**
   * Get idNot
   * @return idNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIdNot() {
    return idNot;
  }


  public void setIdNot(String idNot) {
    this.idNot = idNot;
  }


  public UsbDeviceWhereInput idNotContains(String idNotContains) {
    
    this.idNotContains = idNotContains;
    return this;
  }

   /**
   * Get idNotContains
   * @return idNotContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIdNotContains() {
    return idNotContains;
  }


  public void setIdNotContains(String idNotContains) {
    this.idNotContains = idNotContains;
  }


  public UsbDeviceWhereInput idNotEndsWith(String idNotEndsWith) {
    
    this.idNotEndsWith = idNotEndsWith;
    return this;
  }

   /**
   * Get idNotEndsWith
   * @return idNotEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIdNotEndsWith() {
    return idNotEndsWith;
  }


  public void setIdNotEndsWith(String idNotEndsWith) {
    this.idNotEndsWith = idNotEndsWith;
  }


  public UsbDeviceWhereInput idNotIn(List<String> idNotIn) {
    
    this.idNotIn = idNotIn;
    return this;
  }

  public UsbDeviceWhereInput addIdNotInItem(String idNotInItem) {
    if (this.idNotIn == null) {
      this.idNotIn = new ArrayList<String>();
    }
    this.idNotIn.add(idNotInItem);
    return this;
  }

   /**
   * Get idNotIn
   * @return idNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getIdNotIn() {
    return idNotIn;
  }


  public void setIdNotIn(List<String> idNotIn) {
    this.idNotIn = idNotIn;
  }


  public UsbDeviceWhereInput idNotStartsWith(String idNotStartsWith) {
    
    this.idNotStartsWith = idNotStartsWith;
    return this;
  }

   /**
   * Get idNotStartsWith
   * @return idNotStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIdNotStartsWith() {
    return idNotStartsWith;
  }


  public void setIdNotStartsWith(String idNotStartsWith) {
    this.idNotStartsWith = idNotStartsWith;
  }


  public UsbDeviceWhereInput idStartsWith(String idStartsWith) {
    
    this.idStartsWith = idStartsWith;
    return this;
  }

   /**
   * Get idStartsWith
   * @return idStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIdStartsWith() {
    return idStartsWith;
  }


  public void setIdStartsWith(String idStartsWith) {
    this.idStartsWith = idStartsWith;
  }


  public UsbDeviceWhereInput localCreatedAt(String localCreatedAt) {
    
    this.localCreatedAt = localCreatedAt;
    return this;
  }

   /**
   * Get localCreatedAt
   * @return localCreatedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLocalCreatedAt() {
    return localCreatedAt;
  }


  public void setLocalCreatedAt(String localCreatedAt) {
    this.localCreatedAt = localCreatedAt;
  }


  public UsbDeviceWhereInput localCreatedAtGt(String localCreatedAtGt) {
    
    this.localCreatedAtGt = localCreatedAtGt;
    return this;
  }

   /**
   * Get localCreatedAtGt
   * @return localCreatedAtGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLocalCreatedAtGt() {
    return localCreatedAtGt;
  }


  public void setLocalCreatedAtGt(String localCreatedAtGt) {
    this.localCreatedAtGt = localCreatedAtGt;
  }


  public UsbDeviceWhereInput localCreatedAtGte(String localCreatedAtGte) {
    
    this.localCreatedAtGte = localCreatedAtGte;
    return this;
  }

   /**
   * Get localCreatedAtGte
   * @return localCreatedAtGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLocalCreatedAtGte() {
    return localCreatedAtGte;
  }


  public void setLocalCreatedAtGte(String localCreatedAtGte) {
    this.localCreatedAtGte = localCreatedAtGte;
  }


  public UsbDeviceWhereInput localCreatedAtIn(List<String> localCreatedAtIn) {
    
    this.localCreatedAtIn = localCreatedAtIn;
    return this;
  }

  public UsbDeviceWhereInput addLocalCreatedAtInItem(String localCreatedAtInItem) {
    if (this.localCreatedAtIn == null) {
      this.localCreatedAtIn = new ArrayList<String>();
    }
    this.localCreatedAtIn.add(localCreatedAtInItem);
    return this;
  }

   /**
   * Get localCreatedAtIn
   * @return localCreatedAtIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getLocalCreatedAtIn() {
    return localCreatedAtIn;
  }


  public void setLocalCreatedAtIn(List<String> localCreatedAtIn) {
    this.localCreatedAtIn = localCreatedAtIn;
  }


  public UsbDeviceWhereInput localCreatedAtLt(String localCreatedAtLt) {
    
    this.localCreatedAtLt = localCreatedAtLt;
    return this;
  }

   /**
   * Get localCreatedAtLt
   * @return localCreatedAtLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLocalCreatedAtLt() {
    return localCreatedAtLt;
  }


  public void setLocalCreatedAtLt(String localCreatedAtLt) {
    this.localCreatedAtLt = localCreatedAtLt;
  }


  public UsbDeviceWhereInput localCreatedAtLte(String localCreatedAtLte) {
    
    this.localCreatedAtLte = localCreatedAtLte;
    return this;
  }

   /**
   * Get localCreatedAtLte
   * @return localCreatedAtLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLocalCreatedAtLte() {
    return localCreatedAtLte;
  }


  public void setLocalCreatedAtLte(String localCreatedAtLte) {
    this.localCreatedAtLte = localCreatedAtLte;
  }


  public UsbDeviceWhereInput localCreatedAtNot(String localCreatedAtNot) {
    
    this.localCreatedAtNot = localCreatedAtNot;
    return this;
  }

   /**
   * Get localCreatedAtNot
   * @return localCreatedAtNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLocalCreatedAtNot() {
    return localCreatedAtNot;
  }


  public void setLocalCreatedAtNot(String localCreatedAtNot) {
    this.localCreatedAtNot = localCreatedAtNot;
  }


  public UsbDeviceWhereInput localCreatedAtNotIn(List<String> localCreatedAtNotIn) {
    
    this.localCreatedAtNotIn = localCreatedAtNotIn;
    return this;
  }

  public UsbDeviceWhereInput addLocalCreatedAtNotInItem(String localCreatedAtNotInItem) {
    if (this.localCreatedAtNotIn == null) {
      this.localCreatedAtNotIn = new ArrayList<String>();
    }
    this.localCreatedAtNotIn.add(localCreatedAtNotInItem);
    return this;
  }

   /**
   * Get localCreatedAtNotIn
   * @return localCreatedAtNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getLocalCreatedAtNotIn() {
    return localCreatedAtNotIn;
  }


  public void setLocalCreatedAtNotIn(List<String> localCreatedAtNotIn) {
    this.localCreatedAtNotIn = localCreatedAtNotIn;
  }


  public UsbDeviceWhereInput localId(String localId) {
    
    this.localId = localId;
    return this;
  }

   /**
   * Get localId
   * @return localId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLocalId() {
    return localId;
  }


  public void setLocalId(String localId) {
    this.localId = localId;
  }


  public UsbDeviceWhereInput localIdContains(String localIdContains) {
    
    this.localIdContains = localIdContains;
    return this;
  }

   /**
   * Get localIdContains
   * @return localIdContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLocalIdContains() {
    return localIdContains;
  }


  public void setLocalIdContains(String localIdContains) {
    this.localIdContains = localIdContains;
  }


  public UsbDeviceWhereInput localIdEndsWith(String localIdEndsWith) {
    
    this.localIdEndsWith = localIdEndsWith;
    return this;
  }

   /**
   * Get localIdEndsWith
   * @return localIdEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLocalIdEndsWith() {
    return localIdEndsWith;
  }


  public void setLocalIdEndsWith(String localIdEndsWith) {
    this.localIdEndsWith = localIdEndsWith;
  }


  public UsbDeviceWhereInput localIdGt(String localIdGt) {
    
    this.localIdGt = localIdGt;
    return this;
  }

   /**
   * Get localIdGt
   * @return localIdGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLocalIdGt() {
    return localIdGt;
  }


  public void setLocalIdGt(String localIdGt) {
    this.localIdGt = localIdGt;
  }


  public UsbDeviceWhereInput localIdGte(String localIdGte) {
    
    this.localIdGte = localIdGte;
    return this;
  }

   /**
   * Get localIdGte
   * @return localIdGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLocalIdGte() {
    return localIdGte;
  }


  public void setLocalIdGte(String localIdGte) {
    this.localIdGte = localIdGte;
  }


  public UsbDeviceWhereInput localIdIn(List<String> localIdIn) {
    
    this.localIdIn = localIdIn;
    return this;
  }

  public UsbDeviceWhereInput addLocalIdInItem(String localIdInItem) {
    if (this.localIdIn == null) {
      this.localIdIn = new ArrayList<String>();
    }
    this.localIdIn.add(localIdInItem);
    return this;
  }

   /**
   * Get localIdIn
   * @return localIdIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getLocalIdIn() {
    return localIdIn;
  }


  public void setLocalIdIn(List<String> localIdIn) {
    this.localIdIn = localIdIn;
  }


  public UsbDeviceWhereInput localIdLt(String localIdLt) {
    
    this.localIdLt = localIdLt;
    return this;
  }

   /**
   * Get localIdLt
   * @return localIdLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLocalIdLt() {
    return localIdLt;
  }


  public void setLocalIdLt(String localIdLt) {
    this.localIdLt = localIdLt;
  }


  public UsbDeviceWhereInput localIdLte(String localIdLte) {
    
    this.localIdLte = localIdLte;
    return this;
  }

   /**
   * Get localIdLte
   * @return localIdLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLocalIdLte() {
    return localIdLte;
  }


  public void setLocalIdLte(String localIdLte) {
    this.localIdLte = localIdLte;
  }


  public UsbDeviceWhereInput localIdNot(String localIdNot) {
    
    this.localIdNot = localIdNot;
    return this;
  }

   /**
   * Get localIdNot
   * @return localIdNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLocalIdNot() {
    return localIdNot;
  }


  public void setLocalIdNot(String localIdNot) {
    this.localIdNot = localIdNot;
  }


  public UsbDeviceWhereInput localIdNotContains(String localIdNotContains) {
    
    this.localIdNotContains = localIdNotContains;
    return this;
  }

   /**
   * Get localIdNotContains
   * @return localIdNotContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLocalIdNotContains() {
    return localIdNotContains;
  }


  public void setLocalIdNotContains(String localIdNotContains) {
    this.localIdNotContains = localIdNotContains;
  }


  public UsbDeviceWhereInput localIdNotEndsWith(String localIdNotEndsWith) {
    
    this.localIdNotEndsWith = localIdNotEndsWith;
    return this;
  }

   /**
   * Get localIdNotEndsWith
   * @return localIdNotEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLocalIdNotEndsWith() {
    return localIdNotEndsWith;
  }


  public void setLocalIdNotEndsWith(String localIdNotEndsWith) {
    this.localIdNotEndsWith = localIdNotEndsWith;
  }


  public UsbDeviceWhereInput localIdNotIn(List<String> localIdNotIn) {
    
    this.localIdNotIn = localIdNotIn;
    return this;
  }

  public UsbDeviceWhereInput addLocalIdNotInItem(String localIdNotInItem) {
    if (this.localIdNotIn == null) {
      this.localIdNotIn = new ArrayList<String>();
    }
    this.localIdNotIn.add(localIdNotInItem);
    return this;
  }

   /**
   * Get localIdNotIn
   * @return localIdNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getLocalIdNotIn() {
    return localIdNotIn;
  }


  public void setLocalIdNotIn(List<String> localIdNotIn) {
    this.localIdNotIn = localIdNotIn;
  }


  public UsbDeviceWhereInput localIdNotStartsWith(String localIdNotStartsWith) {
    
    this.localIdNotStartsWith = localIdNotStartsWith;
    return this;
  }

   /**
   * Get localIdNotStartsWith
   * @return localIdNotStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLocalIdNotStartsWith() {
    return localIdNotStartsWith;
  }


  public void setLocalIdNotStartsWith(String localIdNotStartsWith) {
    this.localIdNotStartsWith = localIdNotStartsWith;
  }


  public UsbDeviceWhereInput localIdStartsWith(String localIdStartsWith) {
    
    this.localIdStartsWith = localIdStartsWith;
    return this;
  }

   /**
   * Get localIdStartsWith
   * @return localIdStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLocalIdStartsWith() {
    return localIdStartsWith;
  }


  public void setLocalIdStartsWith(String localIdStartsWith) {
    this.localIdStartsWith = localIdStartsWith;
  }


  public UsbDeviceWhereInput manufacturer(String manufacturer) {
    
    this.manufacturer = manufacturer;
    return this;
  }

   /**
   * Get manufacturer
   * @return manufacturer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getManufacturer() {
    return manufacturer;
  }


  public void setManufacturer(String manufacturer) {
    this.manufacturer = manufacturer;
  }


  public UsbDeviceWhereInput manufacturerContains(String manufacturerContains) {
    
    this.manufacturerContains = manufacturerContains;
    return this;
  }

   /**
   * Get manufacturerContains
   * @return manufacturerContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getManufacturerContains() {
    return manufacturerContains;
  }


  public void setManufacturerContains(String manufacturerContains) {
    this.manufacturerContains = manufacturerContains;
  }


  public UsbDeviceWhereInput manufacturerEndsWith(String manufacturerEndsWith) {
    
    this.manufacturerEndsWith = manufacturerEndsWith;
    return this;
  }

   /**
   * Get manufacturerEndsWith
   * @return manufacturerEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getManufacturerEndsWith() {
    return manufacturerEndsWith;
  }


  public void setManufacturerEndsWith(String manufacturerEndsWith) {
    this.manufacturerEndsWith = manufacturerEndsWith;
  }


  public UsbDeviceWhereInput manufacturerGt(String manufacturerGt) {
    
    this.manufacturerGt = manufacturerGt;
    return this;
  }

   /**
   * Get manufacturerGt
   * @return manufacturerGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getManufacturerGt() {
    return manufacturerGt;
  }


  public void setManufacturerGt(String manufacturerGt) {
    this.manufacturerGt = manufacturerGt;
  }


  public UsbDeviceWhereInput manufacturerGte(String manufacturerGte) {
    
    this.manufacturerGte = manufacturerGte;
    return this;
  }

   /**
   * Get manufacturerGte
   * @return manufacturerGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getManufacturerGte() {
    return manufacturerGte;
  }


  public void setManufacturerGte(String manufacturerGte) {
    this.manufacturerGte = manufacturerGte;
  }


  public UsbDeviceWhereInput manufacturerIn(List<String> manufacturerIn) {
    
    this.manufacturerIn = manufacturerIn;
    return this;
  }

  public UsbDeviceWhereInput addManufacturerInItem(String manufacturerInItem) {
    if (this.manufacturerIn == null) {
      this.manufacturerIn = new ArrayList<String>();
    }
    this.manufacturerIn.add(manufacturerInItem);
    return this;
  }

   /**
   * Get manufacturerIn
   * @return manufacturerIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getManufacturerIn() {
    return manufacturerIn;
  }


  public void setManufacturerIn(List<String> manufacturerIn) {
    this.manufacturerIn = manufacturerIn;
  }


  public UsbDeviceWhereInput manufacturerLt(String manufacturerLt) {
    
    this.manufacturerLt = manufacturerLt;
    return this;
  }

   /**
   * Get manufacturerLt
   * @return manufacturerLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getManufacturerLt() {
    return manufacturerLt;
  }


  public void setManufacturerLt(String manufacturerLt) {
    this.manufacturerLt = manufacturerLt;
  }


  public UsbDeviceWhereInput manufacturerLte(String manufacturerLte) {
    
    this.manufacturerLte = manufacturerLte;
    return this;
  }

   /**
   * Get manufacturerLte
   * @return manufacturerLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getManufacturerLte() {
    return manufacturerLte;
  }


  public void setManufacturerLte(String manufacturerLte) {
    this.manufacturerLte = manufacturerLte;
  }


  public UsbDeviceWhereInput manufacturerNot(String manufacturerNot) {
    
    this.manufacturerNot = manufacturerNot;
    return this;
  }

   /**
   * Get manufacturerNot
   * @return manufacturerNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getManufacturerNot() {
    return manufacturerNot;
  }


  public void setManufacturerNot(String manufacturerNot) {
    this.manufacturerNot = manufacturerNot;
  }


  public UsbDeviceWhereInput manufacturerNotContains(String manufacturerNotContains) {
    
    this.manufacturerNotContains = manufacturerNotContains;
    return this;
  }

   /**
   * Get manufacturerNotContains
   * @return manufacturerNotContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getManufacturerNotContains() {
    return manufacturerNotContains;
  }


  public void setManufacturerNotContains(String manufacturerNotContains) {
    this.manufacturerNotContains = manufacturerNotContains;
  }


  public UsbDeviceWhereInput manufacturerNotEndsWith(String manufacturerNotEndsWith) {
    
    this.manufacturerNotEndsWith = manufacturerNotEndsWith;
    return this;
  }

   /**
   * Get manufacturerNotEndsWith
   * @return manufacturerNotEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getManufacturerNotEndsWith() {
    return manufacturerNotEndsWith;
  }


  public void setManufacturerNotEndsWith(String manufacturerNotEndsWith) {
    this.manufacturerNotEndsWith = manufacturerNotEndsWith;
  }


  public UsbDeviceWhereInput manufacturerNotIn(List<String> manufacturerNotIn) {
    
    this.manufacturerNotIn = manufacturerNotIn;
    return this;
  }

  public UsbDeviceWhereInput addManufacturerNotInItem(String manufacturerNotInItem) {
    if (this.manufacturerNotIn == null) {
      this.manufacturerNotIn = new ArrayList<String>();
    }
    this.manufacturerNotIn.add(manufacturerNotInItem);
    return this;
  }

   /**
   * Get manufacturerNotIn
   * @return manufacturerNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getManufacturerNotIn() {
    return manufacturerNotIn;
  }


  public void setManufacturerNotIn(List<String> manufacturerNotIn) {
    this.manufacturerNotIn = manufacturerNotIn;
  }


  public UsbDeviceWhereInput manufacturerNotStartsWith(String manufacturerNotStartsWith) {
    
    this.manufacturerNotStartsWith = manufacturerNotStartsWith;
    return this;
  }

   /**
   * Get manufacturerNotStartsWith
   * @return manufacturerNotStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getManufacturerNotStartsWith() {
    return manufacturerNotStartsWith;
  }


  public void setManufacturerNotStartsWith(String manufacturerNotStartsWith) {
    this.manufacturerNotStartsWith = manufacturerNotStartsWith;
  }


  public UsbDeviceWhereInput manufacturerStartsWith(String manufacturerStartsWith) {
    
    this.manufacturerStartsWith = manufacturerStartsWith;
    return this;
  }

   /**
   * Get manufacturerStartsWith
   * @return manufacturerStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getManufacturerStartsWith() {
    return manufacturerStartsWith;
  }


  public void setManufacturerStartsWith(String manufacturerStartsWith) {
    this.manufacturerStartsWith = manufacturerStartsWith;
  }


  public UsbDeviceWhereInput name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public UsbDeviceWhereInput nameContains(String nameContains) {
    
    this.nameContains = nameContains;
    return this;
  }

   /**
   * Get nameContains
   * @return nameContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNameContains() {
    return nameContains;
  }


  public void setNameContains(String nameContains) {
    this.nameContains = nameContains;
  }


  public UsbDeviceWhereInput nameEndsWith(String nameEndsWith) {
    
    this.nameEndsWith = nameEndsWith;
    return this;
  }

   /**
   * Get nameEndsWith
   * @return nameEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNameEndsWith() {
    return nameEndsWith;
  }


  public void setNameEndsWith(String nameEndsWith) {
    this.nameEndsWith = nameEndsWith;
  }


  public UsbDeviceWhereInput nameGt(String nameGt) {
    
    this.nameGt = nameGt;
    return this;
  }

   /**
   * Get nameGt
   * @return nameGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNameGt() {
    return nameGt;
  }


  public void setNameGt(String nameGt) {
    this.nameGt = nameGt;
  }


  public UsbDeviceWhereInput nameGte(String nameGte) {
    
    this.nameGte = nameGte;
    return this;
  }

   /**
   * Get nameGte
   * @return nameGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNameGte() {
    return nameGte;
  }


  public void setNameGte(String nameGte) {
    this.nameGte = nameGte;
  }


  public UsbDeviceWhereInput nameIn(List<String> nameIn) {
    
    this.nameIn = nameIn;
    return this;
  }

  public UsbDeviceWhereInput addNameInItem(String nameInItem) {
    if (this.nameIn == null) {
      this.nameIn = new ArrayList<String>();
    }
    this.nameIn.add(nameInItem);
    return this;
  }

   /**
   * Get nameIn
   * @return nameIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getNameIn() {
    return nameIn;
  }


  public void setNameIn(List<String> nameIn) {
    this.nameIn = nameIn;
  }


  public UsbDeviceWhereInput nameLt(String nameLt) {
    
    this.nameLt = nameLt;
    return this;
  }

   /**
   * Get nameLt
   * @return nameLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNameLt() {
    return nameLt;
  }


  public void setNameLt(String nameLt) {
    this.nameLt = nameLt;
  }


  public UsbDeviceWhereInput nameLte(String nameLte) {
    
    this.nameLte = nameLte;
    return this;
  }

   /**
   * Get nameLte
   * @return nameLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNameLte() {
    return nameLte;
  }


  public void setNameLte(String nameLte) {
    this.nameLte = nameLte;
  }


  public UsbDeviceWhereInput nameNot(String nameNot) {
    
    this.nameNot = nameNot;
    return this;
  }

   /**
   * Get nameNot
   * @return nameNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNameNot() {
    return nameNot;
  }


  public void setNameNot(String nameNot) {
    this.nameNot = nameNot;
  }


  public UsbDeviceWhereInput nameNotContains(String nameNotContains) {
    
    this.nameNotContains = nameNotContains;
    return this;
  }

   /**
   * Get nameNotContains
   * @return nameNotContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNameNotContains() {
    return nameNotContains;
  }


  public void setNameNotContains(String nameNotContains) {
    this.nameNotContains = nameNotContains;
  }


  public UsbDeviceWhereInput nameNotEndsWith(String nameNotEndsWith) {
    
    this.nameNotEndsWith = nameNotEndsWith;
    return this;
  }

   /**
   * Get nameNotEndsWith
   * @return nameNotEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNameNotEndsWith() {
    return nameNotEndsWith;
  }


  public void setNameNotEndsWith(String nameNotEndsWith) {
    this.nameNotEndsWith = nameNotEndsWith;
  }


  public UsbDeviceWhereInput nameNotIn(List<String> nameNotIn) {
    
    this.nameNotIn = nameNotIn;
    return this;
  }

  public UsbDeviceWhereInput addNameNotInItem(String nameNotInItem) {
    if (this.nameNotIn == null) {
      this.nameNotIn = new ArrayList<String>();
    }
    this.nameNotIn.add(nameNotInItem);
    return this;
  }

   /**
   * Get nameNotIn
   * @return nameNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getNameNotIn() {
    return nameNotIn;
  }


  public void setNameNotIn(List<String> nameNotIn) {
    this.nameNotIn = nameNotIn;
  }


  public UsbDeviceWhereInput nameNotStartsWith(String nameNotStartsWith) {
    
    this.nameNotStartsWith = nameNotStartsWith;
    return this;
  }

   /**
   * Get nameNotStartsWith
   * @return nameNotStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNameNotStartsWith() {
    return nameNotStartsWith;
  }


  public void setNameNotStartsWith(String nameNotStartsWith) {
    this.nameNotStartsWith = nameNotStartsWith;
  }


  public UsbDeviceWhereInput nameStartsWith(String nameStartsWith) {
    
    this.nameStartsWith = nameStartsWith;
    return this;
  }

   /**
   * Get nameStartsWith
   * @return nameStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNameStartsWith() {
    return nameStartsWith;
  }


  public void setNameStartsWith(String nameStartsWith) {
    this.nameStartsWith = nameStartsWith;
  }


  public UsbDeviceWhereInput size(Long size) {
    
    this.size = size;
    return this;
  }

   /**
   * Get size
   * @return size
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getSize() {
    return size;
  }


  public void setSize(Long size) {
    this.size = size;
  }


  public UsbDeviceWhereInput sizeGt(Long sizeGt) {
    
    this.sizeGt = sizeGt;
    return this;
  }

   /**
   * Get sizeGt
   * @return sizeGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getSizeGt() {
    return sizeGt;
  }


  public void setSizeGt(Long sizeGt) {
    this.sizeGt = sizeGt;
  }


  public UsbDeviceWhereInput sizeGte(Long sizeGte) {
    
    this.sizeGte = sizeGte;
    return this;
  }

   /**
   * Get sizeGte
   * @return sizeGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getSizeGte() {
    return sizeGte;
  }


  public void setSizeGte(Long sizeGte) {
    this.sizeGte = sizeGte;
  }


  public UsbDeviceWhereInput sizeIn(List<Long> sizeIn) {
    
    this.sizeIn = sizeIn;
    return this;
  }

  public UsbDeviceWhereInput addSizeInItem(Long sizeInItem) {
    if (this.sizeIn == null) {
      this.sizeIn = new ArrayList<Long>();
    }
    this.sizeIn.add(sizeInItem);
    return this;
  }

   /**
   * Get sizeIn
   * @return sizeIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Long> getSizeIn() {
    return sizeIn;
  }


  public void setSizeIn(List<Long> sizeIn) {
    this.sizeIn = sizeIn;
  }


  public UsbDeviceWhereInput sizeLt(Long sizeLt) {
    
    this.sizeLt = sizeLt;
    return this;
  }

   /**
   * Get sizeLt
   * @return sizeLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getSizeLt() {
    return sizeLt;
  }


  public void setSizeLt(Long sizeLt) {
    this.sizeLt = sizeLt;
  }


  public UsbDeviceWhereInput sizeLte(Long sizeLte) {
    
    this.sizeLte = sizeLte;
    return this;
  }

   /**
   * Get sizeLte
   * @return sizeLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getSizeLte() {
    return sizeLte;
  }


  public void setSizeLte(Long sizeLte) {
    this.sizeLte = sizeLte;
  }


  public UsbDeviceWhereInput sizeNot(Long sizeNot) {
    
    this.sizeNot = sizeNot;
    return this;
  }

   /**
   * Get sizeNot
   * @return sizeNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getSizeNot() {
    return sizeNot;
  }


  public void setSizeNot(Long sizeNot) {
    this.sizeNot = sizeNot;
  }


  public UsbDeviceWhereInput sizeNotIn(List<Long> sizeNotIn) {
    
    this.sizeNotIn = sizeNotIn;
    return this;
  }

  public UsbDeviceWhereInput addSizeNotInItem(Long sizeNotInItem) {
    if (this.sizeNotIn == null) {
      this.sizeNotIn = new ArrayList<Long>();
    }
    this.sizeNotIn.add(sizeNotInItem);
    return this;
  }

   /**
   * Get sizeNotIn
   * @return sizeNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Long> getSizeNotIn() {
    return sizeNotIn;
  }


  public void setSizeNotIn(List<Long> sizeNotIn) {
    this.sizeNotIn = sizeNotIn;
  }


  public UsbDeviceWhereInput status(UsbDeviceStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UsbDeviceStatus getStatus() {
    return status;
  }


  public void setStatus(UsbDeviceStatus status) {
    this.status = status;
  }


  public UsbDeviceWhereInput statusIn(List<UsbDeviceStatus> statusIn) {
    
    this.statusIn = statusIn;
    return this;
  }

  public UsbDeviceWhereInput addStatusInItem(UsbDeviceStatus statusInItem) {
    if (this.statusIn == null) {
      this.statusIn = new ArrayList<UsbDeviceStatus>();
    }
    this.statusIn.add(statusInItem);
    return this;
  }

   /**
   * Get statusIn
   * @return statusIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<UsbDeviceStatus> getStatusIn() {
    return statusIn;
  }


  public void setStatusIn(List<UsbDeviceStatus> statusIn) {
    this.statusIn = statusIn;
  }


  public UsbDeviceWhereInput statusNot(UsbDeviceStatus statusNot) {
    
    this.statusNot = statusNot;
    return this;
  }

   /**
   * Get statusNot
   * @return statusNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UsbDeviceStatus getStatusNot() {
    return statusNot;
  }


  public void setStatusNot(UsbDeviceStatus statusNot) {
    this.statusNot = statusNot;
  }


  public UsbDeviceWhereInput statusNotIn(List<UsbDeviceStatus> statusNotIn) {
    
    this.statusNotIn = statusNotIn;
    return this;
  }

  public UsbDeviceWhereInput addStatusNotInItem(UsbDeviceStatus statusNotInItem) {
    if (this.statusNotIn == null) {
      this.statusNotIn = new ArrayList<UsbDeviceStatus>();
    }
    this.statusNotIn.add(statusNotInItem);
    return this;
  }

   /**
   * Get statusNotIn
   * @return statusNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<UsbDeviceStatus> getStatusNotIn() {
    return statusNotIn;
  }


  public void setStatusNotIn(List<UsbDeviceStatus> statusNotIn) {
    this.statusNotIn = statusNotIn;
  }


  public UsbDeviceWhereInput usbType(String usbType) {
    
    this.usbType = usbType;
    return this;
  }

   /**
   * Get usbType
   * @return usbType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUsbType() {
    return usbType;
  }


  public void setUsbType(String usbType) {
    this.usbType = usbType;
  }


  public UsbDeviceWhereInput usbTypeContains(String usbTypeContains) {
    
    this.usbTypeContains = usbTypeContains;
    return this;
  }

   /**
   * Get usbTypeContains
   * @return usbTypeContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUsbTypeContains() {
    return usbTypeContains;
  }


  public void setUsbTypeContains(String usbTypeContains) {
    this.usbTypeContains = usbTypeContains;
  }


  public UsbDeviceWhereInput usbTypeEndsWith(String usbTypeEndsWith) {
    
    this.usbTypeEndsWith = usbTypeEndsWith;
    return this;
  }

   /**
   * Get usbTypeEndsWith
   * @return usbTypeEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUsbTypeEndsWith() {
    return usbTypeEndsWith;
  }


  public void setUsbTypeEndsWith(String usbTypeEndsWith) {
    this.usbTypeEndsWith = usbTypeEndsWith;
  }


  public UsbDeviceWhereInput usbTypeGt(String usbTypeGt) {
    
    this.usbTypeGt = usbTypeGt;
    return this;
  }

   /**
   * Get usbTypeGt
   * @return usbTypeGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUsbTypeGt() {
    return usbTypeGt;
  }


  public void setUsbTypeGt(String usbTypeGt) {
    this.usbTypeGt = usbTypeGt;
  }


  public UsbDeviceWhereInput usbTypeGte(String usbTypeGte) {
    
    this.usbTypeGte = usbTypeGte;
    return this;
  }

   /**
   * Get usbTypeGte
   * @return usbTypeGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUsbTypeGte() {
    return usbTypeGte;
  }


  public void setUsbTypeGte(String usbTypeGte) {
    this.usbTypeGte = usbTypeGte;
  }


  public UsbDeviceWhereInput usbTypeIn(List<String> usbTypeIn) {
    
    this.usbTypeIn = usbTypeIn;
    return this;
  }

  public UsbDeviceWhereInput addUsbTypeInItem(String usbTypeInItem) {
    if (this.usbTypeIn == null) {
      this.usbTypeIn = new ArrayList<String>();
    }
    this.usbTypeIn.add(usbTypeInItem);
    return this;
  }

   /**
   * Get usbTypeIn
   * @return usbTypeIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getUsbTypeIn() {
    return usbTypeIn;
  }


  public void setUsbTypeIn(List<String> usbTypeIn) {
    this.usbTypeIn = usbTypeIn;
  }


  public UsbDeviceWhereInput usbTypeLt(String usbTypeLt) {
    
    this.usbTypeLt = usbTypeLt;
    return this;
  }

   /**
   * Get usbTypeLt
   * @return usbTypeLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUsbTypeLt() {
    return usbTypeLt;
  }


  public void setUsbTypeLt(String usbTypeLt) {
    this.usbTypeLt = usbTypeLt;
  }


  public UsbDeviceWhereInput usbTypeLte(String usbTypeLte) {
    
    this.usbTypeLte = usbTypeLte;
    return this;
  }

   /**
   * Get usbTypeLte
   * @return usbTypeLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUsbTypeLte() {
    return usbTypeLte;
  }


  public void setUsbTypeLte(String usbTypeLte) {
    this.usbTypeLte = usbTypeLte;
  }


  public UsbDeviceWhereInput usbTypeNot(String usbTypeNot) {
    
    this.usbTypeNot = usbTypeNot;
    return this;
  }

   /**
   * Get usbTypeNot
   * @return usbTypeNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUsbTypeNot() {
    return usbTypeNot;
  }


  public void setUsbTypeNot(String usbTypeNot) {
    this.usbTypeNot = usbTypeNot;
  }


  public UsbDeviceWhereInput usbTypeNotContains(String usbTypeNotContains) {
    
    this.usbTypeNotContains = usbTypeNotContains;
    return this;
  }

   /**
   * Get usbTypeNotContains
   * @return usbTypeNotContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUsbTypeNotContains() {
    return usbTypeNotContains;
  }


  public void setUsbTypeNotContains(String usbTypeNotContains) {
    this.usbTypeNotContains = usbTypeNotContains;
  }


  public UsbDeviceWhereInput usbTypeNotEndsWith(String usbTypeNotEndsWith) {
    
    this.usbTypeNotEndsWith = usbTypeNotEndsWith;
    return this;
  }

   /**
   * Get usbTypeNotEndsWith
   * @return usbTypeNotEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUsbTypeNotEndsWith() {
    return usbTypeNotEndsWith;
  }


  public void setUsbTypeNotEndsWith(String usbTypeNotEndsWith) {
    this.usbTypeNotEndsWith = usbTypeNotEndsWith;
  }


  public UsbDeviceWhereInput usbTypeNotIn(List<String> usbTypeNotIn) {
    
    this.usbTypeNotIn = usbTypeNotIn;
    return this;
  }

  public UsbDeviceWhereInput addUsbTypeNotInItem(String usbTypeNotInItem) {
    if (this.usbTypeNotIn == null) {
      this.usbTypeNotIn = new ArrayList<String>();
    }
    this.usbTypeNotIn.add(usbTypeNotInItem);
    return this;
  }

   /**
   * Get usbTypeNotIn
   * @return usbTypeNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getUsbTypeNotIn() {
    return usbTypeNotIn;
  }


  public void setUsbTypeNotIn(List<String> usbTypeNotIn) {
    this.usbTypeNotIn = usbTypeNotIn;
  }


  public UsbDeviceWhereInput usbTypeNotStartsWith(String usbTypeNotStartsWith) {
    
    this.usbTypeNotStartsWith = usbTypeNotStartsWith;
    return this;
  }

   /**
   * Get usbTypeNotStartsWith
   * @return usbTypeNotStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUsbTypeNotStartsWith() {
    return usbTypeNotStartsWith;
  }


  public void setUsbTypeNotStartsWith(String usbTypeNotStartsWith) {
    this.usbTypeNotStartsWith = usbTypeNotStartsWith;
  }


  public UsbDeviceWhereInput usbTypeStartsWith(String usbTypeStartsWith) {
    
    this.usbTypeStartsWith = usbTypeStartsWith;
    return this;
  }

   /**
   * Get usbTypeStartsWith
   * @return usbTypeStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUsbTypeStartsWith() {
    return usbTypeStartsWith;
  }


  public void setUsbTypeStartsWith(String usbTypeStartsWith) {
    this.usbTypeStartsWith = usbTypeStartsWith;
  }


  public UsbDeviceWhereInput vmsEvery(VmWhereInput vmsEvery) {
    
    this.vmsEvery = vmsEvery;
    return this;
  }

   /**
   * Get vmsEvery
   * @return vmsEvery
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VmWhereInput getVmsEvery() {
    return vmsEvery;
  }


  public void setVmsEvery(VmWhereInput vmsEvery) {
    this.vmsEvery = vmsEvery;
  }


  public UsbDeviceWhereInput vmsNone(VmWhereInput vmsNone) {
    
    this.vmsNone = vmsNone;
    return this;
  }

   /**
   * Get vmsNone
   * @return vmsNone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VmWhereInput getVmsNone() {
    return vmsNone;
  }


  public void setVmsNone(VmWhereInput vmsNone) {
    this.vmsNone = vmsNone;
  }


  public UsbDeviceWhereInput vmsSome(VmWhereInput vmsSome) {
    
    this.vmsSome = vmsSome;
    return this;
  }

   /**
   * Get vmsSome
   * @return vmsSome
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VmWhereInput getVmsSome() {
    return vmsSome;
  }


  public void setVmsSome(VmWhereInput vmsSome) {
    this.vmsSome = vmsSome;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsbDeviceWhereInput usbDeviceWhereInput = (UsbDeviceWhereInput) o;
    return Objects.equals(this.AND, usbDeviceWhereInput.AND) &&
        Objects.equals(this.NOT, usbDeviceWhereInput.NOT) &&
        Objects.equals(this.OR, usbDeviceWhereInput.OR) &&
        Objects.equals(this.binded, usbDeviceWhereInput.binded) &&
        Objects.equals(this.bindedNot, usbDeviceWhereInput.bindedNot) &&
        Objects.equals(this.description, usbDeviceWhereInput.description) &&
        Objects.equals(this.descriptionContains, usbDeviceWhereInput.descriptionContains) &&
        Objects.equals(this.descriptionEndsWith, usbDeviceWhereInput.descriptionEndsWith) &&
        Objects.equals(this.descriptionGt, usbDeviceWhereInput.descriptionGt) &&
        Objects.equals(this.descriptionGte, usbDeviceWhereInput.descriptionGte) &&
        Objects.equals(this.descriptionIn, usbDeviceWhereInput.descriptionIn) &&
        Objects.equals(this.descriptionLt, usbDeviceWhereInput.descriptionLt) &&
        Objects.equals(this.descriptionLte, usbDeviceWhereInput.descriptionLte) &&
        Objects.equals(this.descriptionNot, usbDeviceWhereInput.descriptionNot) &&
        Objects.equals(this.descriptionNotContains, usbDeviceWhereInput.descriptionNotContains) &&
        Objects.equals(this.descriptionNotEndsWith, usbDeviceWhereInput.descriptionNotEndsWith) &&
        Objects.equals(this.descriptionNotIn, usbDeviceWhereInput.descriptionNotIn) &&
        Objects.equals(this.descriptionNotStartsWith, usbDeviceWhereInput.descriptionNotStartsWith) &&
        Objects.equals(this.descriptionStartsWith, usbDeviceWhereInput.descriptionStartsWith) &&
        Objects.equals(this.entityAsyncStatus, usbDeviceWhereInput.entityAsyncStatus) &&
        Objects.equals(this.entityAsyncStatusIn, usbDeviceWhereInput.entityAsyncStatusIn) &&
        Objects.equals(this.entityAsyncStatusNot, usbDeviceWhereInput.entityAsyncStatusNot) &&
        Objects.equals(this.entityAsyncStatusNotIn, usbDeviceWhereInput.entityAsyncStatusNotIn) &&
        Objects.equals(this.host, usbDeviceWhereInput.host) &&
        Objects.equals(this.id, usbDeviceWhereInput.id) &&
        Objects.equals(this.idContains, usbDeviceWhereInput.idContains) &&
        Objects.equals(this.idEndsWith, usbDeviceWhereInput.idEndsWith) &&
        Objects.equals(this.idGt, usbDeviceWhereInput.idGt) &&
        Objects.equals(this.idGte, usbDeviceWhereInput.idGte) &&
        Objects.equals(this.idIn, usbDeviceWhereInput.idIn) &&
        Objects.equals(this.idLt, usbDeviceWhereInput.idLt) &&
        Objects.equals(this.idLte, usbDeviceWhereInput.idLte) &&
        Objects.equals(this.idNot, usbDeviceWhereInput.idNot) &&
        Objects.equals(this.idNotContains, usbDeviceWhereInput.idNotContains) &&
        Objects.equals(this.idNotEndsWith, usbDeviceWhereInput.idNotEndsWith) &&
        Objects.equals(this.idNotIn, usbDeviceWhereInput.idNotIn) &&
        Objects.equals(this.idNotStartsWith, usbDeviceWhereInput.idNotStartsWith) &&
        Objects.equals(this.idStartsWith, usbDeviceWhereInput.idStartsWith) &&
        Objects.equals(this.localCreatedAt, usbDeviceWhereInput.localCreatedAt) &&
        Objects.equals(this.localCreatedAtGt, usbDeviceWhereInput.localCreatedAtGt) &&
        Objects.equals(this.localCreatedAtGte, usbDeviceWhereInput.localCreatedAtGte) &&
        Objects.equals(this.localCreatedAtIn, usbDeviceWhereInput.localCreatedAtIn) &&
        Objects.equals(this.localCreatedAtLt, usbDeviceWhereInput.localCreatedAtLt) &&
        Objects.equals(this.localCreatedAtLte, usbDeviceWhereInput.localCreatedAtLte) &&
        Objects.equals(this.localCreatedAtNot, usbDeviceWhereInput.localCreatedAtNot) &&
        Objects.equals(this.localCreatedAtNotIn, usbDeviceWhereInput.localCreatedAtNotIn) &&
        Objects.equals(this.localId, usbDeviceWhereInput.localId) &&
        Objects.equals(this.localIdContains, usbDeviceWhereInput.localIdContains) &&
        Objects.equals(this.localIdEndsWith, usbDeviceWhereInput.localIdEndsWith) &&
        Objects.equals(this.localIdGt, usbDeviceWhereInput.localIdGt) &&
        Objects.equals(this.localIdGte, usbDeviceWhereInput.localIdGte) &&
        Objects.equals(this.localIdIn, usbDeviceWhereInput.localIdIn) &&
        Objects.equals(this.localIdLt, usbDeviceWhereInput.localIdLt) &&
        Objects.equals(this.localIdLte, usbDeviceWhereInput.localIdLte) &&
        Objects.equals(this.localIdNot, usbDeviceWhereInput.localIdNot) &&
        Objects.equals(this.localIdNotContains, usbDeviceWhereInput.localIdNotContains) &&
        Objects.equals(this.localIdNotEndsWith, usbDeviceWhereInput.localIdNotEndsWith) &&
        Objects.equals(this.localIdNotIn, usbDeviceWhereInput.localIdNotIn) &&
        Objects.equals(this.localIdNotStartsWith, usbDeviceWhereInput.localIdNotStartsWith) &&
        Objects.equals(this.localIdStartsWith, usbDeviceWhereInput.localIdStartsWith) &&
        Objects.equals(this.manufacturer, usbDeviceWhereInput.manufacturer) &&
        Objects.equals(this.manufacturerContains, usbDeviceWhereInput.manufacturerContains) &&
        Objects.equals(this.manufacturerEndsWith, usbDeviceWhereInput.manufacturerEndsWith) &&
        Objects.equals(this.manufacturerGt, usbDeviceWhereInput.manufacturerGt) &&
        Objects.equals(this.manufacturerGte, usbDeviceWhereInput.manufacturerGte) &&
        Objects.equals(this.manufacturerIn, usbDeviceWhereInput.manufacturerIn) &&
        Objects.equals(this.manufacturerLt, usbDeviceWhereInput.manufacturerLt) &&
        Objects.equals(this.manufacturerLte, usbDeviceWhereInput.manufacturerLte) &&
        Objects.equals(this.manufacturerNot, usbDeviceWhereInput.manufacturerNot) &&
        Objects.equals(this.manufacturerNotContains, usbDeviceWhereInput.manufacturerNotContains) &&
        Objects.equals(this.manufacturerNotEndsWith, usbDeviceWhereInput.manufacturerNotEndsWith) &&
        Objects.equals(this.manufacturerNotIn, usbDeviceWhereInput.manufacturerNotIn) &&
        Objects.equals(this.manufacturerNotStartsWith, usbDeviceWhereInput.manufacturerNotStartsWith) &&
        Objects.equals(this.manufacturerStartsWith, usbDeviceWhereInput.manufacturerStartsWith) &&
        Objects.equals(this.name, usbDeviceWhereInput.name) &&
        Objects.equals(this.nameContains, usbDeviceWhereInput.nameContains) &&
        Objects.equals(this.nameEndsWith, usbDeviceWhereInput.nameEndsWith) &&
        Objects.equals(this.nameGt, usbDeviceWhereInput.nameGt) &&
        Objects.equals(this.nameGte, usbDeviceWhereInput.nameGte) &&
        Objects.equals(this.nameIn, usbDeviceWhereInput.nameIn) &&
        Objects.equals(this.nameLt, usbDeviceWhereInput.nameLt) &&
        Objects.equals(this.nameLte, usbDeviceWhereInput.nameLte) &&
        Objects.equals(this.nameNot, usbDeviceWhereInput.nameNot) &&
        Objects.equals(this.nameNotContains, usbDeviceWhereInput.nameNotContains) &&
        Objects.equals(this.nameNotEndsWith, usbDeviceWhereInput.nameNotEndsWith) &&
        Objects.equals(this.nameNotIn, usbDeviceWhereInput.nameNotIn) &&
        Objects.equals(this.nameNotStartsWith, usbDeviceWhereInput.nameNotStartsWith) &&
        Objects.equals(this.nameStartsWith, usbDeviceWhereInput.nameStartsWith) &&
        Objects.equals(this.size, usbDeviceWhereInput.size) &&
        Objects.equals(this.sizeGt, usbDeviceWhereInput.sizeGt) &&
        Objects.equals(this.sizeGte, usbDeviceWhereInput.sizeGte) &&
        Objects.equals(this.sizeIn, usbDeviceWhereInput.sizeIn) &&
        Objects.equals(this.sizeLt, usbDeviceWhereInput.sizeLt) &&
        Objects.equals(this.sizeLte, usbDeviceWhereInput.sizeLte) &&
        Objects.equals(this.sizeNot, usbDeviceWhereInput.sizeNot) &&
        Objects.equals(this.sizeNotIn, usbDeviceWhereInput.sizeNotIn) &&
        Objects.equals(this.status, usbDeviceWhereInput.status) &&
        Objects.equals(this.statusIn, usbDeviceWhereInput.statusIn) &&
        Objects.equals(this.statusNot, usbDeviceWhereInput.statusNot) &&
        Objects.equals(this.statusNotIn, usbDeviceWhereInput.statusNotIn) &&
        Objects.equals(this.usbType, usbDeviceWhereInput.usbType) &&
        Objects.equals(this.usbTypeContains, usbDeviceWhereInput.usbTypeContains) &&
        Objects.equals(this.usbTypeEndsWith, usbDeviceWhereInput.usbTypeEndsWith) &&
        Objects.equals(this.usbTypeGt, usbDeviceWhereInput.usbTypeGt) &&
        Objects.equals(this.usbTypeGte, usbDeviceWhereInput.usbTypeGte) &&
        Objects.equals(this.usbTypeIn, usbDeviceWhereInput.usbTypeIn) &&
        Objects.equals(this.usbTypeLt, usbDeviceWhereInput.usbTypeLt) &&
        Objects.equals(this.usbTypeLte, usbDeviceWhereInput.usbTypeLte) &&
        Objects.equals(this.usbTypeNot, usbDeviceWhereInput.usbTypeNot) &&
        Objects.equals(this.usbTypeNotContains, usbDeviceWhereInput.usbTypeNotContains) &&
        Objects.equals(this.usbTypeNotEndsWith, usbDeviceWhereInput.usbTypeNotEndsWith) &&
        Objects.equals(this.usbTypeNotIn, usbDeviceWhereInput.usbTypeNotIn) &&
        Objects.equals(this.usbTypeNotStartsWith, usbDeviceWhereInput.usbTypeNotStartsWith) &&
        Objects.equals(this.usbTypeStartsWith, usbDeviceWhereInput.usbTypeStartsWith) &&
        Objects.equals(this.vmsEvery, usbDeviceWhereInput.vmsEvery) &&
        Objects.equals(this.vmsNone, usbDeviceWhereInput.vmsNone) &&
        Objects.equals(this.vmsSome, usbDeviceWhereInput.vmsSome);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(AND, NOT, OR, binded, bindedNot, description, descriptionContains, descriptionEndsWith, descriptionGt, descriptionGte, descriptionIn, descriptionLt, descriptionLte, descriptionNot, descriptionNotContains, descriptionNotEndsWith, descriptionNotIn, descriptionNotStartsWith, descriptionStartsWith, entityAsyncStatus, entityAsyncStatusIn, entityAsyncStatusNot, entityAsyncStatusNotIn, host, id, idContains, idEndsWith, idGt, idGte, idIn, idLt, idLte, idNot, idNotContains, idNotEndsWith, idNotIn, idNotStartsWith, idStartsWith, localCreatedAt, localCreatedAtGt, localCreatedAtGte, localCreatedAtIn, localCreatedAtLt, localCreatedAtLte, localCreatedAtNot, localCreatedAtNotIn, localId, localIdContains, localIdEndsWith, localIdGt, localIdGte, localIdIn, localIdLt, localIdLte, localIdNot, localIdNotContains, localIdNotEndsWith, localIdNotIn, localIdNotStartsWith, localIdStartsWith, manufacturer, manufacturerContains, manufacturerEndsWith, manufacturerGt, manufacturerGte, manufacturerIn, manufacturerLt, manufacturerLte, manufacturerNot, manufacturerNotContains, manufacturerNotEndsWith, manufacturerNotIn, manufacturerNotStartsWith, manufacturerStartsWith, name, nameContains, nameEndsWith, nameGt, nameGte, nameIn, nameLt, nameLte, nameNot, nameNotContains, nameNotEndsWith, nameNotIn, nameNotStartsWith, nameStartsWith, size, sizeGt, sizeGte, sizeIn, sizeLt, sizeLte, sizeNot, sizeNotIn, status, statusIn, statusNot, statusNotIn, usbType, usbTypeContains, usbTypeEndsWith, usbTypeGt, usbTypeGte, usbTypeIn, usbTypeLt, usbTypeLte, usbTypeNot, usbTypeNotContains, usbTypeNotEndsWith, usbTypeNotIn, usbTypeNotStartsWith, usbTypeStartsWith, vmsEvery, vmsNone, vmsSome);
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
    sb.append("class UsbDeviceWhereInput {\n");
    sb.append("    AND: ").append(toIndentedString(AND)).append("\n");
    sb.append("    NOT: ").append(toIndentedString(NOT)).append("\n");
    sb.append("    OR: ").append(toIndentedString(OR)).append("\n");
    sb.append("    binded: ").append(toIndentedString(binded)).append("\n");
    sb.append("    bindedNot: ").append(toIndentedString(bindedNot)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    descriptionContains: ").append(toIndentedString(descriptionContains)).append("\n");
    sb.append("    descriptionEndsWith: ").append(toIndentedString(descriptionEndsWith)).append("\n");
    sb.append("    descriptionGt: ").append(toIndentedString(descriptionGt)).append("\n");
    sb.append("    descriptionGte: ").append(toIndentedString(descriptionGte)).append("\n");
    sb.append("    descriptionIn: ").append(toIndentedString(descriptionIn)).append("\n");
    sb.append("    descriptionLt: ").append(toIndentedString(descriptionLt)).append("\n");
    sb.append("    descriptionLte: ").append(toIndentedString(descriptionLte)).append("\n");
    sb.append("    descriptionNot: ").append(toIndentedString(descriptionNot)).append("\n");
    sb.append("    descriptionNotContains: ").append(toIndentedString(descriptionNotContains)).append("\n");
    sb.append("    descriptionNotEndsWith: ").append(toIndentedString(descriptionNotEndsWith)).append("\n");
    sb.append("    descriptionNotIn: ").append(toIndentedString(descriptionNotIn)).append("\n");
    sb.append("    descriptionNotStartsWith: ").append(toIndentedString(descriptionNotStartsWith)).append("\n");
    sb.append("    descriptionStartsWith: ").append(toIndentedString(descriptionStartsWith)).append("\n");
    sb.append("    entityAsyncStatus: ").append(toIndentedString(entityAsyncStatus)).append("\n");
    sb.append("    entityAsyncStatusIn: ").append(toIndentedString(entityAsyncStatusIn)).append("\n");
    sb.append("    entityAsyncStatusNot: ").append(toIndentedString(entityAsyncStatusNot)).append("\n");
    sb.append("    entityAsyncStatusNotIn: ").append(toIndentedString(entityAsyncStatusNotIn)).append("\n");
    sb.append("    host: ").append(toIndentedString(host)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    idContains: ").append(toIndentedString(idContains)).append("\n");
    sb.append("    idEndsWith: ").append(toIndentedString(idEndsWith)).append("\n");
    sb.append("    idGt: ").append(toIndentedString(idGt)).append("\n");
    sb.append("    idGte: ").append(toIndentedString(idGte)).append("\n");
    sb.append("    idIn: ").append(toIndentedString(idIn)).append("\n");
    sb.append("    idLt: ").append(toIndentedString(idLt)).append("\n");
    sb.append("    idLte: ").append(toIndentedString(idLte)).append("\n");
    sb.append("    idNot: ").append(toIndentedString(idNot)).append("\n");
    sb.append("    idNotContains: ").append(toIndentedString(idNotContains)).append("\n");
    sb.append("    idNotEndsWith: ").append(toIndentedString(idNotEndsWith)).append("\n");
    sb.append("    idNotIn: ").append(toIndentedString(idNotIn)).append("\n");
    sb.append("    idNotStartsWith: ").append(toIndentedString(idNotStartsWith)).append("\n");
    sb.append("    idStartsWith: ").append(toIndentedString(idStartsWith)).append("\n");
    sb.append("    localCreatedAt: ").append(toIndentedString(localCreatedAt)).append("\n");
    sb.append("    localCreatedAtGt: ").append(toIndentedString(localCreatedAtGt)).append("\n");
    sb.append("    localCreatedAtGte: ").append(toIndentedString(localCreatedAtGte)).append("\n");
    sb.append("    localCreatedAtIn: ").append(toIndentedString(localCreatedAtIn)).append("\n");
    sb.append("    localCreatedAtLt: ").append(toIndentedString(localCreatedAtLt)).append("\n");
    sb.append("    localCreatedAtLte: ").append(toIndentedString(localCreatedAtLte)).append("\n");
    sb.append("    localCreatedAtNot: ").append(toIndentedString(localCreatedAtNot)).append("\n");
    sb.append("    localCreatedAtNotIn: ").append(toIndentedString(localCreatedAtNotIn)).append("\n");
    sb.append("    localId: ").append(toIndentedString(localId)).append("\n");
    sb.append("    localIdContains: ").append(toIndentedString(localIdContains)).append("\n");
    sb.append("    localIdEndsWith: ").append(toIndentedString(localIdEndsWith)).append("\n");
    sb.append("    localIdGt: ").append(toIndentedString(localIdGt)).append("\n");
    sb.append("    localIdGte: ").append(toIndentedString(localIdGte)).append("\n");
    sb.append("    localIdIn: ").append(toIndentedString(localIdIn)).append("\n");
    sb.append("    localIdLt: ").append(toIndentedString(localIdLt)).append("\n");
    sb.append("    localIdLte: ").append(toIndentedString(localIdLte)).append("\n");
    sb.append("    localIdNot: ").append(toIndentedString(localIdNot)).append("\n");
    sb.append("    localIdNotContains: ").append(toIndentedString(localIdNotContains)).append("\n");
    sb.append("    localIdNotEndsWith: ").append(toIndentedString(localIdNotEndsWith)).append("\n");
    sb.append("    localIdNotIn: ").append(toIndentedString(localIdNotIn)).append("\n");
    sb.append("    localIdNotStartsWith: ").append(toIndentedString(localIdNotStartsWith)).append("\n");
    sb.append("    localIdStartsWith: ").append(toIndentedString(localIdStartsWith)).append("\n");
    sb.append("    manufacturer: ").append(toIndentedString(manufacturer)).append("\n");
    sb.append("    manufacturerContains: ").append(toIndentedString(manufacturerContains)).append("\n");
    sb.append("    manufacturerEndsWith: ").append(toIndentedString(manufacturerEndsWith)).append("\n");
    sb.append("    manufacturerGt: ").append(toIndentedString(manufacturerGt)).append("\n");
    sb.append("    manufacturerGte: ").append(toIndentedString(manufacturerGte)).append("\n");
    sb.append("    manufacturerIn: ").append(toIndentedString(manufacturerIn)).append("\n");
    sb.append("    manufacturerLt: ").append(toIndentedString(manufacturerLt)).append("\n");
    sb.append("    manufacturerLte: ").append(toIndentedString(manufacturerLte)).append("\n");
    sb.append("    manufacturerNot: ").append(toIndentedString(manufacturerNot)).append("\n");
    sb.append("    manufacturerNotContains: ").append(toIndentedString(manufacturerNotContains)).append("\n");
    sb.append("    manufacturerNotEndsWith: ").append(toIndentedString(manufacturerNotEndsWith)).append("\n");
    sb.append("    manufacturerNotIn: ").append(toIndentedString(manufacturerNotIn)).append("\n");
    sb.append("    manufacturerNotStartsWith: ").append(toIndentedString(manufacturerNotStartsWith)).append("\n");
    sb.append("    manufacturerStartsWith: ").append(toIndentedString(manufacturerStartsWith)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    nameContains: ").append(toIndentedString(nameContains)).append("\n");
    sb.append("    nameEndsWith: ").append(toIndentedString(nameEndsWith)).append("\n");
    sb.append("    nameGt: ").append(toIndentedString(nameGt)).append("\n");
    sb.append("    nameGte: ").append(toIndentedString(nameGte)).append("\n");
    sb.append("    nameIn: ").append(toIndentedString(nameIn)).append("\n");
    sb.append("    nameLt: ").append(toIndentedString(nameLt)).append("\n");
    sb.append("    nameLte: ").append(toIndentedString(nameLte)).append("\n");
    sb.append("    nameNot: ").append(toIndentedString(nameNot)).append("\n");
    sb.append("    nameNotContains: ").append(toIndentedString(nameNotContains)).append("\n");
    sb.append("    nameNotEndsWith: ").append(toIndentedString(nameNotEndsWith)).append("\n");
    sb.append("    nameNotIn: ").append(toIndentedString(nameNotIn)).append("\n");
    sb.append("    nameNotStartsWith: ").append(toIndentedString(nameNotStartsWith)).append("\n");
    sb.append("    nameStartsWith: ").append(toIndentedString(nameStartsWith)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    sizeGt: ").append(toIndentedString(sizeGt)).append("\n");
    sb.append("    sizeGte: ").append(toIndentedString(sizeGte)).append("\n");
    sb.append("    sizeIn: ").append(toIndentedString(sizeIn)).append("\n");
    sb.append("    sizeLt: ").append(toIndentedString(sizeLt)).append("\n");
    sb.append("    sizeLte: ").append(toIndentedString(sizeLte)).append("\n");
    sb.append("    sizeNot: ").append(toIndentedString(sizeNot)).append("\n");
    sb.append("    sizeNotIn: ").append(toIndentedString(sizeNotIn)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusIn: ").append(toIndentedString(statusIn)).append("\n");
    sb.append("    statusNot: ").append(toIndentedString(statusNot)).append("\n");
    sb.append("    statusNotIn: ").append(toIndentedString(statusNotIn)).append("\n");
    sb.append("    usbType: ").append(toIndentedString(usbType)).append("\n");
    sb.append("    usbTypeContains: ").append(toIndentedString(usbTypeContains)).append("\n");
    sb.append("    usbTypeEndsWith: ").append(toIndentedString(usbTypeEndsWith)).append("\n");
    sb.append("    usbTypeGt: ").append(toIndentedString(usbTypeGt)).append("\n");
    sb.append("    usbTypeGte: ").append(toIndentedString(usbTypeGte)).append("\n");
    sb.append("    usbTypeIn: ").append(toIndentedString(usbTypeIn)).append("\n");
    sb.append("    usbTypeLt: ").append(toIndentedString(usbTypeLt)).append("\n");
    sb.append("    usbTypeLte: ").append(toIndentedString(usbTypeLte)).append("\n");
    sb.append("    usbTypeNot: ").append(toIndentedString(usbTypeNot)).append("\n");
    sb.append("    usbTypeNotContains: ").append(toIndentedString(usbTypeNotContains)).append("\n");
    sb.append("    usbTypeNotEndsWith: ").append(toIndentedString(usbTypeNotEndsWith)).append("\n");
    sb.append("    usbTypeNotIn: ").append(toIndentedString(usbTypeNotIn)).append("\n");
    sb.append("    usbTypeNotStartsWith: ").append(toIndentedString(usbTypeNotStartsWith)).append("\n");
    sb.append("    usbTypeStartsWith: ").append(toIndentedString(usbTypeStartsWith)).append("\n");
    sb.append("    vmsEvery: ").append(toIndentedString(vmsEvery)).append("\n");
    sb.append("    vmsNone: ").append(toIndentedString(vmsNone)).append("\n");
    sb.append("    vmsSome: ").append(toIndentedString(vmsSome)).append("\n");
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

