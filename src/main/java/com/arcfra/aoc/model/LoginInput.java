package com.arcfra.aoc.model;

import java.util.Objects;
import java.util.Arrays;
import com.arcfra.aoc.model.MfaType;
import com.arcfra.aoc.model.UserSource;
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
 * LoginInput
 */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class LoginInput {
  public static final String SERIALIZED_NAME_USERNAME = "username";
  @SerializedName(SERIALIZED_NAME_USERNAME)
  private String username;

  public static final String SERIALIZED_NAME_SOURCE = "source";
  @SerializedName(SERIALIZED_NAME_SOURCE)
  private UserSource source;

  public static final String SERIALIZED_NAME_PASSWORD = "password";
  @SerializedName(SERIALIZED_NAME_PASSWORD)
  private String password;

  public static final String SERIALIZED_NAME_MFA_TYPE = "mfa_type";
  @SerializedName(SERIALIZED_NAME_MFA_TYPE)
  private MfaType mfaType;

  public static final String SERIALIZED_NAME_AUTH_CONFIG_ID = "auth_config_id";
  @SerializedName(SERIALIZED_NAME_AUTH_CONFIG_ID)
  private String authConfigId;

  public LoginInput() { 
  }

  public LoginInput username(String username) {
    
    this.username = username;
    return this;
  }

   /**
   * Get username
   * @return username
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getUsername() {
    return username;
  }


  public void setUsername(String username) {
    this.username = username;
  }


  public LoginInput source(UserSource source) {
    
    this.source = source;
    return this;
  }

   /**
   * Get source
   * @return source
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UserSource getSource() {
    return source;
  }


  public void setSource(UserSource source) {
    this.source = source;
  }


  public LoginInput password(String password) {
    
    this.password = password;
    return this;
  }

   /**
   * Get password
   * @return password
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getPassword() {
    return password;
  }


  public void setPassword(String password) {
    this.password = password;
  }


  public LoginInput mfaType(MfaType mfaType) {
    
    this.mfaType = mfaType;
    return this;
  }

   /**
   * Get mfaType
   * @return mfaType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public MfaType getMfaType() {
    return mfaType;
  }


  public void setMfaType(MfaType mfaType) {
    this.mfaType = mfaType;
  }


  public LoginInput authConfigId(String authConfigId) {
    
    this.authConfigId = authConfigId;
    return this;
  }

   /**
   * Get authConfigId
   * @return authConfigId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAuthConfigId() {
    return authConfigId;
  }


  public void setAuthConfigId(String authConfigId) {
    this.authConfigId = authConfigId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoginInput loginInput = (LoginInput) o;
    return Objects.equals(this.username, loginInput.username) &&
        Objects.equals(this.source, loginInput.source) &&
        Objects.equals(this.password, loginInput.password) &&
        Objects.equals(this.mfaType, loginInput.mfaType) &&
        Objects.equals(this.authConfigId, loginInput.authConfigId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(username, source, password, mfaType, authConfigId);
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
    sb.append("class LoginInput {\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    mfaType: ").append(toIndentedString(mfaType)).append("\n");
    sb.append("    authConfigId: ").append(toIndentedString(authConfigId)).append("\n");
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

