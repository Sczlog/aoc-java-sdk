package com.arcfra.aoc.model;

import java.util.Objects;
import java.util.Arrays;
import com.arcfra.aoc.model.NestedPasswordRecoverQa;
import com.arcfra.aoc.model.NestedUserRoleNext;
import com.arcfra.aoc.model.UserRole;
import com.arcfra.aoc.model.UserSource;
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
 * User
 */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class User {
  public static final String SERIALIZED_NAME_AUTH_CONFIG_ID = "auth_config_id";
  @SerializedName(SERIALIZED_NAME_AUTH_CONFIG_ID)
  private String authConfigId;

  public static final String SERIALIZED_NAME_DISPLAY_USERNAME = "display_username";
  @SerializedName(SERIALIZED_NAME_DISPLAY_USERNAME)
  private String displayUsername;

  public static final String SERIALIZED_NAME_EMAIL_ADDRESS = "email_address";
  @SerializedName(SERIALIZED_NAME_EMAIL_ADDRESS)
  private String emailAddress;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_INTERNAL = "internal";
  @SerializedName(SERIALIZED_NAME_INTERNAL)
  private Boolean internal;

  public static final String SERIALIZED_NAME_LDAP_DN = "ldap_dn";
  @SerializedName(SERIALIZED_NAME_LDAP_DN)
  private String ldapDn;

  public static final String SERIALIZED_NAME_MOBILE_PHONE = "mobile_phone";
  @SerializedName(SERIALIZED_NAME_MOBILE_PHONE)
  private String mobilePhone;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PASSWORD_EXPIRED = "password_expired";
  @SerializedName(SERIALIZED_NAME_PASSWORD_EXPIRED)
  private Boolean passwordExpired;

  public static final String SERIALIZED_NAME_PASSWORD_RECOVER_QA = "password_recover_qa";
  @SerializedName(SERIALIZED_NAME_PASSWORD_RECOVER_QA)
  private NestedPasswordRecoverQa passwordRecoverQa;

  public static final String SERIALIZED_NAME_PASSWORD_UPDATED_AT = "password_updated_at";
  @SerializedName(SERIALIZED_NAME_PASSWORD_UPDATED_AT)
  private String passwordUpdatedAt;

  public static final String SERIALIZED_NAME_ROLE = "role";
  @SerializedName(SERIALIZED_NAME_ROLE)
  private UserRole role;

  public static final String SERIALIZED_NAME_ROLES = "roles";
  @SerializedName(SERIALIZED_NAME_ROLES)
  private List<NestedUserRoleNext> roles = null;

  public static final String SERIALIZED_NAME_SOURCE = "source";
  @SerializedName(SERIALIZED_NAME_SOURCE)
  private UserSource source;

  public static final String SERIALIZED_NAME_USERNAME = "username";
  @SerializedName(SERIALIZED_NAME_USERNAME)
  private String username;

  public User() { 
  }

  public User authConfigId(String authConfigId) {
    
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


  public User displayUsername(String displayUsername) {
    
    this.displayUsername = displayUsername;
    return this;
  }

   /**
   * Get displayUsername
   * @return displayUsername
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getDisplayUsername() {
    return displayUsername;
  }


  public void setDisplayUsername(String displayUsername) {
    this.displayUsername = displayUsername;
  }


  public User emailAddress(String emailAddress) {
    
    this.emailAddress = emailAddress;
    return this;
  }

   /**
   * Get emailAddress
   * @return emailAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getEmailAddress() {
    return emailAddress;
  }


  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }


  public User id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public User internal(Boolean internal) {
    
    this.internal = internal;
    return this;
  }

   /**
   * Get internal
   * @return internal
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boolean getInternal() {
    return internal;
  }


  public void setInternal(Boolean internal) {
    this.internal = internal;
  }


  public User ldapDn(String ldapDn) {
    
    this.ldapDn = ldapDn;
    return this;
  }

   /**
   * Get ldapDn
   * @return ldapDn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLdapDn() {
    return ldapDn;
  }


  public void setLdapDn(String ldapDn) {
    this.ldapDn = ldapDn;
  }


  public User mobilePhone(String mobilePhone) {
    
    this.mobilePhone = mobilePhone;
    return this;
  }

   /**
   * Get mobilePhone
   * @return mobilePhone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMobilePhone() {
    return mobilePhone;
  }


  public void setMobilePhone(String mobilePhone) {
    this.mobilePhone = mobilePhone;
  }


  public User name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public User passwordExpired(Boolean passwordExpired) {
    
    this.passwordExpired = passwordExpired;
    return this;
  }

   /**
   * Get passwordExpired
   * @return passwordExpired
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getPasswordExpired() {
    return passwordExpired;
  }


  public void setPasswordExpired(Boolean passwordExpired) {
    this.passwordExpired = passwordExpired;
  }


  public User passwordRecoverQa(NestedPasswordRecoverQa passwordRecoverQa) {
    
    this.passwordRecoverQa = passwordRecoverQa;
    return this;
  }

   /**
   * Get passwordRecoverQa
   * @return passwordRecoverQa
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public NestedPasswordRecoverQa getPasswordRecoverQa() {
    return passwordRecoverQa;
  }


  public void setPasswordRecoverQa(NestedPasswordRecoverQa passwordRecoverQa) {
    this.passwordRecoverQa = passwordRecoverQa;
  }


  public User passwordUpdatedAt(String passwordUpdatedAt) {
    
    this.passwordUpdatedAt = passwordUpdatedAt;
    return this;
  }

   /**
   * Get passwordUpdatedAt
   * @return passwordUpdatedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPasswordUpdatedAt() {
    return passwordUpdatedAt;
  }


  public void setPasswordUpdatedAt(String passwordUpdatedAt) {
    this.passwordUpdatedAt = passwordUpdatedAt;
  }


  public User role(UserRole role) {
    
    this.role = role;
    return this;
  }

   /**
   * Get role
   * @return role
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UserRole getRole() {
    return role;
  }


  public void setRole(UserRole role) {
    this.role = role;
  }


  public User roles(List<NestedUserRoleNext> roles) {
    
    this.roles = roles;
    return this;
  }

  public User addRolesItem(NestedUserRoleNext rolesItem) {
    if (this.roles == null) {
      this.roles = new ArrayList<NestedUserRoleNext>();
    }
    this.roles.add(rolesItem);
    return this;
  }

   /**
   * Get roles
   * @return roles
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<NestedUserRoleNext> getRoles() {
    return roles;
  }


  public void setRoles(List<NestedUserRoleNext> roles) {
    this.roles = roles;
  }


  public User source(UserSource source) {
    
    this.source = source;
    return this;
  }

   /**
   * Get source
   * @return source
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public UserSource getSource() {
    return source;
  }


  public void setSource(UserSource source) {
    this.source = source;
  }


  public User username(String username) {
    
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    User user = (User) o;
    return Objects.equals(this.authConfigId, user.authConfigId) &&
        Objects.equals(this.displayUsername, user.displayUsername) &&
        Objects.equals(this.emailAddress, user.emailAddress) &&
        Objects.equals(this.id, user.id) &&
        Objects.equals(this.internal, user.internal) &&
        Objects.equals(this.ldapDn, user.ldapDn) &&
        Objects.equals(this.mobilePhone, user.mobilePhone) &&
        Objects.equals(this.name, user.name) &&
        Objects.equals(this.passwordExpired, user.passwordExpired) &&
        Objects.equals(this.passwordRecoverQa, user.passwordRecoverQa) &&
        Objects.equals(this.passwordUpdatedAt, user.passwordUpdatedAt) &&
        Objects.equals(this.role, user.role) &&
        Objects.equals(this.roles, user.roles) &&
        Objects.equals(this.source, user.source) &&
        Objects.equals(this.username, user.username);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(authConfigId, displayUsername, emailAddress, id, internal, ldapDn, mobilePhone, name, passwordExpired, passwordRecoverQa, passwordUpdatedAt, role, roles, source, username);
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
    sb.append("class User {\n");
    sb.append("    authConfigId: ").append(toIndentedString(authConfigId)).append("\n");
    sb.append("    displayUsername: ").append(toIndentedString(displayUsername)).append("\n");
    sb.append("    emailAddress: ").append(toIndentedString(emailAddress)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    internal: ").append(toIndentedString(internal)).append("\n");
    sb.append("    ldapDn: ").append(toIndentedString(ldapDn)).append("\n");
    sb.append("    mobilePhone: ").append(toIndentedString(mobilePhone)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    passwordExpired: ").append(toIndentedString(passwordExpired)).append("\n");
    sb.append("    passwordRecoverQa: ").append(toIndentedString(passwordRecoverQa)).append("\n");
    sb.append("    passwordUpdatedAt: ").append(toIndentedString(passwordUpdatedAt)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
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

