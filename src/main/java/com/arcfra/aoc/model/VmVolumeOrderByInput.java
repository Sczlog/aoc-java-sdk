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
 * Gets or Sets VmVolumeOrderByInput
 */
@JsonAdapter(VmVolumeOrderByInput.Adapter.class)
public enum VmVolumeOrderByInput {
  
  DESCRIPTION_ASC("description_ASC"),
  
  DESCRIPTION_DESC("description_DESC"),
  
  ELF_STORAGE_POLICY_ASC("elf_storage_policy_ASC"),
  
  ELF_STORAGE_POLICY_DESC("elf_storage_policy_DESC"),
  
  ENTITYASYNCSTATUS_ASC("entityAsyncStatus_ASC"),
  
  ENTITYASYNCSTATUS_DESC("entityAsyncStatus_DESC"),
  
  GUEST_SIZE_USAGE_ASC("guest_size_usage_ASC"),
  
  GUEST_SIZE_USAGE_DESC("guest_size_usage_DESC"),
  
  GUEST_USED_SIZE_ASC("guest_used_size_ASC"),
  
  GUEST_USED_SIZE_DESC("guest_used_size_DESC"),
  
  ID_ASC("id_ASC"),
  
  ID_DESC("id_DESC"),
  
  LOCAL_CREATED_AT_ASC("local_created_at_ASC"),
  
  LOCAL_CREATED_AT_DESC("local_created_at_DESC"),
  
  LOCAL_ID_ASC("local_id_ASC"),
  
  LOCAL_ID_DESC("local_id_DESC"),
  
  MOUNTING_ASC("mounting_ASC"),
  
  MOUNTING_DESC("mounting_DESC"),
  
  NAME_ASC("name_ASC"),
  
  NAME_DESC("name_DESC"),
  
  PATH_ASC("path_ASC"),
  
  PATH_DESC("path_DESC"),
  
  SHARING_ASC("sharing_ASC"),
  
  SHARING_DESC("sharing_DESC"),
  
  SIZE_ASC("size_ASC"),
  
  SIZE_DESC("size_DESC"),
  
  TYPE_ASC("type_ASC"),
  
  TYPE_DESC("type_DESC"),
  
  UNIQUE_LOGICAL_SIZE_ASC("unique_logical_size_ASC"),
  
  UNIQUE_LOGICAL_SIZE_DESC("unique_logical_size_DESC"),
  
  UNIQUE_SIZE_ASC("unique_size_ASC"),
  
  UNIQUE_SIZE_DESC("unique_size_DESC"),
  
  VMVOLUMEORDERBYINPUT_UNSUPPORTED_ENUM("VMVOLUMEORDERBYINPUT_UNSUPPORTED_ENUM");
  private String value;

  VmVolumeOrderByInput(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static VmVolumeOrderByInput fromValue(String value) {
    for (VmVolumeOrderByInput b : VmVolumeOrderByInput.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return VmVolumeOrderByInput.VMVOLUMEORDERBYINPUT_UNSUPPORTED_ENUM;
  }

  public static class Adapter extends TypeAdapter<VmVolumeOrderByInput> {
    @Override
    public void write(final JsonWriter jsonWriter, final VmVolumeOrderByInput enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public VmVolumeOrderByInput read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return VmVolumeOrderByInput.fromValue(value);
    }
  }
}

