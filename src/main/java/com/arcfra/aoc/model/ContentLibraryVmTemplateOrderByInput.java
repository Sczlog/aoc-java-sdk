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
 * Gets or Sets ContentLibraryVmTemplateOrderByInput
 */
@JsonAdapter(ContentLibraryVmTemplateOrderByInput.Adapter.class)
public enum ContentLibraryVmTemplateOrderByInput {
  
  ARCHITECTURE_ASC("architecture_ASC"),
  
  ARCHITECTURE_DESC("architecture_DESC"),
  
  CLOUD_INIT_SUPPORTED_ASC("cloud_init_supported_ASC"),
  
  CLOUD_INIT_SUPPORTED_DESC("cloud_init_supported_DESC"),
  
  CREATEDAT_ASC("createdAt_ASC"),
  
  CREATEDAT_DESC("createdAt_DESC"),
  
  DESCRIPTION_ASC("description_ASC"),
  
  DESCRIPTION_DESC("description_DESC"),
  
  ENTITYASYNCSTATUS_ASC("entityAsyncStatus_ASC"),
  
  ENTITYASYNCSTATUS_DESC("entityAsyncStatus_DESC"),
  
  ID_ASC("id_ASC"),
  
  ID_DESC("id_DESC"),
  
  MEMORY_ASC("memory_ASC"),
  
  MEMORY_DESC("memory_DESC"),
  
  NAME_ASC("name_ASC"),
  
  NAME_DESC("name_DESC"),
  
  OS_ASC("os_ASC"),
  
  OS_DESC("os_DESC"),
  
  SIZE_ASC("size_ASC"),
  
  SIZE_DESC("size_DESC"),
  
  VCPU_ASC("vcpu_ASC"),
  
  VCPU_DESC("vcpu_DESC"),
  
  CONTENTLIBRARYVMTEMPLATEORDERBYINPUT_UNSUPPORTED_ENUM("CONTENTLIBRARYVMTEMPLATEORDERBYINPUT_UNSUPPORTED_ENUM");
  private String value;

  ContentLibraryVmTemplateOrderByInput(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ContentLibraryVmTemplateOrderByInput fromValue(String value) {
    for (ContentLibraryVmTemplateOrderByInput b : ContentLibraryVmTemplateOrderByInput.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return ContentLibraryVmTemplateOrderByInput.CONTENTLIBRARYVMTEMPLATEORDERBYINPUT_UNSUPPORTED_ENUM;
  }

  public static class Adapter extends TypeAdapter<ContentLibraryVmTemplateOrderByInput> {
    @Override
    public void write(final JsonWriter jsonWriter, final ContentLibraryVmTemplateOrderByInput enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ContentLibraryVmTemplateOrderByInput read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ContentLibraryVmTemplateOrderByInput.fromValue(value);
    }
  }
}

