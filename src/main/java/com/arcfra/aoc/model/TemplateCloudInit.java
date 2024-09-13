package com.arcfra.aoc.model;

import java.util.Objects;
import java.util.Arrays;
import com.arcfra.aoc.model.CloudInitNetWork;
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
 * TemplateCloudInit
 */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class TemplateCloudInit {
  public static final String SERIALIZED_NAME_USER_DATA = "user_data";
  @SerializedName(SERIALIZED_NAME_USER_DATA)
  private String userData;

  public static final String SERIALIZED_NAME_PUBLIC_KEYS = "public_keys";
  @SerializedName(SERIALIZED_NAME_PUBLIC_KEYS)
  private List<String> publicKeys = null;

  public static final String SERIALIZED_NAME_HOSTNAME = "hostname";
  @SerializedName(SERIALIZED_NAME_HOSTNAME)
  private String hostname;

  public static final String SERIALIZED_NAME_NETWORKS = "networks";
  @SerializedName(SERIALIZED_NAME_NETWORKS)
  private List<CloudInitNetWork> networks = null;

  public static final String SERIALIZED_NAME_NAMESERVERS = "nameservers";
  @SerializedName(SERIALIZED_NAME_NAMESERVERS)
  private List<String> nameservers = null;

  public static final String SERIALIZED_NAME_DEFAULT_USER_PASSWORD = "default_user_password";
  @SerializedName(SERIALIZED_NAME_DEFAULT_USER_PASSWORD)
  private String defaultUserPassword;

  public TemplateCloudInit() { 
  }

  public TemplateCloudInit userData(String userData) {
    
    this.userData = userData;
    return this;
  }

   /**
   * Get userData
   * @return userData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUserData() {
    return userData;
  }


  public void setUserData(String userData) {
    this.userData = userData;
  }


  public TemplateCloudInit publicKeys(List<String> publicKeys) {
    
    this.publicKeys = publicKeys;
    return this;
  }

  public TemplateCloudInit addPublicKeysItem(String publicKeysItem) {
    if (this.publicKeys == null) {
      this.publicKeys = new ArrayList<String>();
    }
    this.publicKeys.add(publicKeysItem);
    return this;
  }

   /**
   * Get publicKeys
   * @return publicKeys
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getPublicKeys() {
    return publicKeys;
  }


  public void setPublicKeys(List<String> publicKeys) {
    this.publicKeys = publicKeys;
  }


  public TemplateCloudInit hostname(String hostname) {
    
    this.hostname = hostname;
    return this;
  }

   /**
   * Get hostname
   * @return hostname
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getHostname() {
    return hostname;
  }


  public void setHostname(String hostname) {
    this.hostname = hostname;
  }


  public TemplateCloudInit networks(List<CloudInitNetWork> networks) {
    
    this.networks = networks;
    return this;
  }

  public TemplateCloudInit addNetworksItem(CloudInitNetWork networksItem) {
    if (this.networks == null) {
      this.networks = new ArrayList<CloudInitNetWork>();
    }
    this.networks.add(networksItem);
    return this;
  }

   /**
   * Get networks
   * @return networks
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<CloudInitNetWork> getNetworks() {
    return networks;
  }


  public void setNetworks(List<CloudInitNetWork> networks) {
    this.networks = networks;
  }


  public TemplateCloudInit nameservers(List<String> nameservers) {
    
    this.nameservers = nameservers;
    return this;
  }

  public TemplateCloudInit addNameserversItem(String nameserversItem) {
    if (this.nameservers == null) {
      this.nameservers = new ArrayList<String>();
    }
    this.nameservers.add(nameserversItem);
    return this;
  }

   /**
   * Get nameservers
   * @return nameservers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getNameservers() {
    return nameservers;
  }


  public void setNameservers(List<String> nameservers) {
    this.nameservers = nameservers;
  }


  public TemplateCloudInit defaultUserPassword(String defaultUserPassword) {
    
    this.defaultUserPassword = defaultUserPassword;
    return this;
  }

   /**
   * Get defaultUserPassword
   * @return defaultUserPassword
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDefaultUserPassword() {
    return defaultUserPassword;
  }


  public void setDefaultUserPassword(String defaultUserPassword) {
    this.defaultUserPassword = defaultUserPassword;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TemplateCloudInit templateCloudInit = (TemplateCloudInit) o;
    return Objects.equals(this.userData, templateCloudInit.userData) &&
        Objects.equals(this.publicKeys, templateCloudInit.publicKeys) &&
        Objects.equals(this.hostname, templateCloudInit.hostname) &&
        Objects.equals(this.networks, templateCloudInit.networks) &&
        Objects.equals(this.nameservers, templateCloudInit.nameservers) &&
        Objects.equals(this.defaultUserPassword, templateCloudInit.defaultUserPassword);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userData, publicKeys, hostname, networks, nameservers, defaultUserPassword);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TemplateCloudInit {\n");
    sb.append("    userData: ").append(toIndentedString(userData)).append("\n");
    sb.append("    publicKeys: ").append(toIndentedString(publicKeys)).append("\n");
    sb.append("    hostname: ").append(toIndentedString(hostname)).append("\n");
    sb.append("    networks: ").append(toIndentedString(networks)).append("\n");
    sb.append("    nameservers: ").append(toIndentedString(nameservers)).append("\n");
    sb.append("    defaultUserPassword: ").append(toIndentedString(defaultUserPassword)).append("\n");
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

