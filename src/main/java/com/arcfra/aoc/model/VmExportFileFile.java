package com.arcfra.aoc.model;

import java.util.Objects;
import java.util.Arrays;
import com.arcfra.aoc.model.VmExportFileType;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * VmExportFileFile
 */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class VmExportFileFile {
  public static final String SERIALIZED_NAME_MD5 = "md5";
  @SerializedName(SERIALIZED_NAME_MD5)
  private String md5;

  public static final String SERIALIZED_NAME_FILE_SIZE = "fileSize";
  @SerializedName(SERIALIZED_NAME_FILE_SIZE)
  private Long fileSize;

  public static final String SERIALIZED_NAME_FILE_SECRET = "fileSecret";
  @SerializedName(SERIALIZED_NAME_FILE_SECRET)
  private String fileSecret;

  public static final String SERIALIZED_NAME_FILE_U_U_I_D = "fileUUID";
  @SerializedName(SERIALIZED_NAME_FILE_U_U_I_D)
  private String fileUUID;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private VmExportFileType type;

  public static final String SERIALIZED_NAME_FILE_NAME = "fileName";
  @SerializedName(SERIALIZED_NAME_FILE_NAME)
  private String fileName;

  public VmExportFileFile() { 
  }

  public VmExportFileFile md5(String md5) {
    
    this.md5 = md5;
    return this;
  }

   /**
   * Get md5
   * @return md5
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getMd5() {
    return md5;
  }


  public void setMd5(String md5) {
    this.md5 = md5;
  }


  public VmExportFileFile fileSize(Long fileSize) {
    
    this.fileSize = fileSize;
    return this;
  }

   /**
   * Get fileSize
   * @return fileSize
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Long getFileSize() {
    return fileSize;
  }


  public void setFileSize(Long fileSize) {
    this.fileSize = fileSize;
  }


  public VmExportFileFile fileSecret(String fileSecret) {
    
    this.fileSecret = fileSecret;
    return this;
  }

   /**
   * Get fileSecret
   * @return fileSecret
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getFileSecret() {
    return fileSecret;
  }


  public void setFileSecret(String fileSecret) {
    this.fileSecret = fileSecret;
  }


  public VmExportFileFile fileUUID(String fileUUID) {
    
    this.fileUUID = fileUUID;
    return this;
  }

   /**
   * Get fileUUID
   * @return fileUUID
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getFileUUID() {
    return fileUUID;
  }


  public void setFileUUID(String fileUUID) {
    this.fileUUID = fileUUID;
  }


  public VmExportFileFile type(VmExportFileType type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public VmExportFileType getType() {
    return type;
  }


  public void setType(VmExportFileType type) {
    this.type = type;
  }


  public VmExportFileFile fileName(String fileName) {
    
    this.fileName = fileName;
    return this;
  }

   /**
   * Get fileName
   * @return fileName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getFileName() {
    return fileName;
  }


  public void setFileName(String fileName) {
    this.fileName = fileName;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VmExportFileFile vmExportFileFile = (VmExportFileFile) o;
    return Objects.equals(this.md5, vmExportFileFile.md5) &&
        Objects.equals(this.fileSize, vmExportFileFile.fileSize) &&
        Objects.equals(this.fileSecret, vmExportFileFile.fileSecret) &&
        Objects.equals(this.fileUUID, vmExportFileFile.fileUUID) &&
        Objects.equals(this.type, vmExportFileFile.type) &&
        Objects.equals(this.fileName, vmExportFileFile.fileName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(md5, fileSize, fileSecret, fileUUID, type, fileName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VmExportFileFile {\n");
    sb.append("    md5: ").append(toIndentedString(md5)).append("\n");
    sb.append("    fileSize: ").append(toIndentedString(fileSize)).append("\n");
    sb.append("    fileSecret: ").append(toIndentedString(fileSecret)).append("\n");
    sb.append("    fileUUID: ").append(toIndentedString(fileUUID)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
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

