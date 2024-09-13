package com.arcfra.aoc.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Gets or Sets IscsiLunOrderByInput
 */
@JsonAdapter(IscsiLunOrderByInput.Adapter.class)
public enum IscsiLunOrderByInput {
  
  ALLOWED_INITIATORS_ASC("allowed_initiators_ASC"),
  
  ALLOWED_INITIATORS_DESC("allowed_initiators_DESC"),
  
  ASSIGNED_SIZE_ASC("assigned_size_ASC"),
  
  ASSIGNED_SIZE_DESC("assigned_size_DESC"),
  
  BPS_ASC("bps_ASC"),
  
  BPS_DESC("bps_DESC"),
  
  BPS_MAX_ASC("bps_max_ASC"),
  
  BPS_MAX_DESC("bps_max_DESC"),
  
  BPS_MAX_LENGTH_ASC("bps_max_length_ASC"),
  
  BPS_MAX_LENGTH_DESC("bps_max_length_DESC"),
  
  BPS_RD_ASC("bps_rd_ASC"),
  
  BPS_RD_DESC("bps_rd_DESC"),
  
  BPS_RD_MAX_ASC("bps_rd_max_ASC"),
  
  BPS_RD_MAX_DESC("bps_rd_max_DESC"),
  
  BPS_RD_MAX_LENGTH_ASC("bps_rd_max_length_ASC"),
  
  BPS_RD_MAX_LENGTH_DESC("bps_rd_max_length_DESC"),
  
  BPS_WR_ASC("bps_wr_ASC"),
  
  BPS_WR_DESC("bps_wr_DESC"),
  
  BPS_WR_MAX_ASC("bps_wr_max_ASC"),
  
  BPS_WR_MAX_DESC("bps_wr_max_DESC"),
  
  BPS_WR_MAX_LENGTH_ASC("bps_wr_max_length_ASC"),
  
  BPS_WR_MAX_LENGTH_DESC("bps_wr_max_length_DESC"),
  
  ENTITYASYNCSTATUS_ASC("entityAsyncStatus_ASC"),
  
  ENTITYASYNCSTATUS_DESC("entityAsyncStatus_DESC"),
  
  ID_ASC("id_ASC"),
  
  ID_DESC("id_DESC"),
  
  IO_SIZE_ASC("io_size_ASC"),
  
  IO_SIZE_DESC("io_size_DESC"),
  
  IOPS_ASC("iops_ASC"),
  
  IOPS_DESC("iops_DESC"),
  
  IOPS_MAX_ASC("iops_max_ASC"),
  
  IOPS_MAX_DESC("iops_max_DESC"),
  
  IOPS_MAX_LENGTH_ASC("iops_max_length_ASC"),
  
  IOPS_MAX_LENGTH_DESC("iops_max_length_DESC"),
  
  IOPS_RD_ASC("iops_rd_ASC"),
  
  IOPS_RD_DESC("iops_rd_DESC"),
  
  IOPS_RD_MAX_ASC("iops_rd_max_ASC"),
  
  IOPS_RD_MAX_DESC("iops_rd_max_DESC"),
  
  IOPS_RD_MAX_LENGTH_ASC("iops_rd_max_length_ASC"),
  
  IOPS_RD_MAX_LENGTH_DESC("iops_rd_max_length_DESC"),
  
  IOPS_WR_ASC("iops_wr_ASC"),
  
  IOPS_WR_DESC("iops_wr_DESC"),
  
  IOPS_WR_MAX_ASC("iops_wr_max_ASC"),
  
  IOPS_WR_MAX_DESC("iops_wr_max_DESC"),
  
  IOPS_WR_MAX_LENGTH_ASC("iops_wr_max_length_ASC"),
  
  IOPS_WR_MAX_LENGTH_DESC("iops_wr_max_length_DESC"),
  
  LOCAL_CREATED_AT_ASC("local_created_at_ASC"),
  
  LOCAL_CREATED_AT_DESC("local_created_at_DESC"),
  
  LOCAL_ID_ASC("local_id_ASC"),
  
  LOCAL_ID_DESC("local_id_DESC"),
  
  LUN_ID_ASC("lun_id_ASC"),
  
  LUN_ID_DESC("lun_id_DESC"),
  
  NAME_ASC("name_ASC"),
  
  NAME_DESC("name_DESC"),
  
  REPLICA_NUM_ASC("replica_num_ASC"),
  
  REPLICA_NUM_DESC("replica_num_DESC"),
  
  SHARED_SIZE_ASC("shared_size_ASC"),
  
  SHARED_SIZE_DESC("shared_size_DESC"),
  
  SNAPSHOT_NUM_ASC("snapshot_num_ASC"),
  
  SNAPSHOT_NUM_DESC("snapshot_num_DESC"),
  
  STRIPE_NUM_ASC("stripe_num_ASC"),
  
  STRIPE_NUM_DESC("stripe_num_DESC"),
  
  STRIPE_SIZE_ASC("stripe_size_ASC"),
  
  STRIPE_SIZE_DESC("stripe_size_DESC"),
  
  THIN_PROVISION_ASC("thin_provision_ASC"),
  
  THIN_PROVISION_DESC("thin_provision_DESC"),
  
  UNIQUE_LOGICAL_SIZE_ASC("unique_logical_size_ASC"),
  
  UNIQUE_LOGICAL_SIZE_DESC("unique_logical_size_DESC"),
  
  UNIQUE_SIZE_ASC("unique_size_ASC"),
  
  UNIQUE_SIZE_DESC("unique_size_DESC"),
  
  ZBS_VOLUME_ID_ASC("zbs_volume_id_ASC"),
  
  ZBS_VOLUME_ID_DESC("zbs_volume_id_DESC"),
  
  ISCSILUNORDERBYINPUT_UNSUPPORTED_ENUM("ISCSILUNORDERBYINPUT_UNSUPPORTED_ENUM");
  private String value;

  IscsiLunOrderByInput(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static IscsiLunOrderByInput fromValue(String value) {
    for (IscsiLunOrderByInput b : IscsiLunOrderByInput.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return IscsiLunOrderByInput.ISCSILUNORDERBYINPUT_UNSUPPORTED_ENUM;
  }

  public static class Adapter extends TypeAdapter<IscsiLunOrderByInput> {
    @Override
    public void write(final JsonWriter jsonWriter, final IscsiLunOrderByInput enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public IscsiLunOrderByInput read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return IscsiLunOrderByInput.fromValue(value);
    }
  }
}

