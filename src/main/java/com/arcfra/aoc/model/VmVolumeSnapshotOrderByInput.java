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
 * Gets or Sets VmVolumeSnapshotOrderByInput
 */
@JsonAdapter(VmVolumeSnapshotOrderByInput.Adapter.class)
public enum VmVolumeSnapshotOrderByInput {
  
  CREATEAT_ASC("createAt_ASC"),
  
  CREATEAT_DESC("createAt_DESC"),
  
  DESCRIPTION_ASC("description_ASC"),
  
  DESCRIPTION_DESC("description_DESC"),
  
  ELF_STORAGE_POLICY_ASC("elf_storage_policy_ASC"),
  
  ELF_STORAGE_POLICY_DESC("elf_storage_policy_DESC"),
  
  ENTITYASYNCSTATUS_ASC("entityAsyncStatus_ASC"),
  
  ENTITYASYNCSTATUS_DESC("entityAsyncStatus_DESC"),
  
  ID_ASC("id_ASC"),
  
  ID_DESC("id_DESC"),
  
  LOCAL_CREATED_AT_ASC("local_created_at_ASC"),
  
  LOCAL_CREATED_AT_DESC("local_created_at_DESC"),
  
  LOCAL_ID_ASC("local_id_ASC"),
  
  LOCAL_ID_DESC("local_id_DESC"),
  
  NAME_ASC("name_ASC"),
  
  NAME_DESC("name_DESC"),
  
  SHARED_SIZE_ASC("shared_size_ASC"),
  
  SHARED_SIZE_DESC("shared_size_DESC"),
  
  SIZE_ASC("size_ASC"),
  
  SIZE_DESC("size_DESC"),
  
  TYPE_ASC("type_ASC"),
  
  TYPE_DESC("type_DESC"),
  
  UNIQUE_SIZE_ASC("unique_size_ASC"),
  
  UNIQUE_SIZE_DESC("unique_size_DESC"),
  
  VOLUME_SHARING_ASC("volume_sharing_ASC"),
  
  VOLUME_SHARING_DESC("volume_sharing_DESC"),
  
  VOLUME_SIZE_ASC("volume_size_ASC"),
  
  VOLUME_SIZE_DESC("volume_size_DESC"),
  
  ZBS_SNAPSHOT_UUID_ASC("zbs_snapshot_uuid_ASC"),
  
  ZBS_SNAPSHOT_UUID_DESC("zbs_snapshot_uuid_DESC"),
  
  VMVOLUMESNAPSHOTORDERBYINPUT_UNSUPPORTED_ENUM("VMVOLUMESNAPSHOTORDERBYINPUT_UNSUPPORTED_ENUM");
  private String value;

  VmVolumeSnapshotOrderByInput(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static VmVolumeSnapshotOrderByInput fromValue(String value) {
    for (VmVolumeSnapshotOrderByInput b : VmVolumeSnapshotOrderByInput.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return VmVolumeSnapshotOrderByInput.VMVOLUMESNAPSHOTORDERBYINPUT_UNSUPPORTED_ENUM;
  }

  public static class Adapter extends TypeAdapter<VmVolumeSnapshotOrderByInput> {
    @Override
    public void write(final JsonWriter jsonWriter, final VmVolumeSnapshotOrderByInput enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public VmVolumeSnapshotOrderByInput read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return VmVolumeSnapshotOrderByInput.fromValue(value);
    }
  }
}

