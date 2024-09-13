package com.arcfra.aoc.model;

import java.util.Objects;
import java.util.Arrays;
import com.arcfra.aoc.model.UserRole;
import com.arcfra.aoc.model.UserRoleNextWhereInput;
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
 * UserWhereInput
 */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class UserWhereInput {
  public static final String SERIALIZED_NAME_A_N_D = "AND";
  @SerializedName(SERIALIZED_NAME_A_N_D)
  private List<UserWhereInput> AND = null;

  public static final String SERIALIZED_NAME_N_O_T = "NOT";
  @SerializedName(SERIALIZED_NAME_N_O_T)
  private List<UserWhereInput> NOT = null;

  public static final String SERIALIZED_NAME_O_R = "OR";
  @SerializedName(SERIALIZED_NAME_O_R)
  private List<UserWhereInput> OR = null;

  public static final String SERIALIZED_NAME_AUTH_CONFIG_ID = "auth_config_id";
  @SerializedName(SERIALIZED_NAME_AUTH_CONFIG_ID)
  private String authConfigId;

  public static final String SERIALIZED_NAME_AUTH_CONFIG_ID_CONTAINS = "auth_config_id_contains";
  @SerializedName(SERIALIZED_NAME_AUTH_CONFIG_ID_CONTAINS)
  private String authConfigIdContains;

  public static final String SERIALIZED_NAME_AUTH_CONFIG_ID_ENDS_WITH = "auth_config_id_ends_with";
  @SerializedName(SERIALIZED_NAME_AUTH_CONFIG_ID_ENDS_WITH)
  private String authConfigIdEndsWith;

  public static final String SERIALIZED_NAME_AUTH_CONFIG_ID_GT = "auth_config_id_gt";
  @SerializedName(SERIALIZED_NAME_AUTH_CONFIG_ID_GT)
  private String authConfigIdGt;

  public static final String SERIALIZED_NAME_AUTH_CONFIG_ID_GTE = "auth_config_id_gte";
  @SerializedName(SERIALIZED_NAME_AUTH_CONFIG_ID_GTE)
  private String authConfigIdGte;

  public static final String SERIALIZED_NAME_AUTH_CONFIG_ID_IN = "auth_config_id_in";
  @SerializedName(SERIALIZED_NAME_AUTH_CONFIG_ID_IN)
  private List<String> authConfigIdIn = null;

  public static final String SERIALIZED_NAME_AUTH_CONFIG_ID_LT = "auth_config_id_lt";
  @SerializedName(SERIALIZED_NAME_AUTH_CONFIG_ID_LT)
  private String authConfigIdLt;

  public static final String SERIALIZED_NAME_AUTH_CONFIG_ID_LTE = "auth_config_id_lte";
  @SerializedName(SERIALIZED_NAME_AUTH_CONFIG_ID_LTE)
  private String authConfigIdLte;

  public static final String SERIALIZED_NAME_AUTH_CONFIG_ID_NOT = "auth_config_id_not";
  @SerializedName(SERIALIZED_NAME_AUTH_CONFIG_ID_NOT)
  private String authConfigIdNot;

  public static final String SERIALIZED_NAME_AUTH_CONFIG_ID_NOT_CONTAINS = "auth_config_id_not_contains";
  @SerializedName(SERIALIZED_NAME_AUTH_CONFIG_ID_NOT_CONTAINS)
  private String authConfigIdNotContains;

  public static final String SERIALIZED_NAME_AUTH_CONFIG_ID_NOT_ENDS_WITH = "auth_config_id_not_ends_with";
  @SerializedName(SERIALIZED_NAME_AUTH_CONFIG_ID_NOT_ENDS_WITH)
  private String authConfigIdNotEndsWith;

  public static final String SERIALIZED_NAME_AUTH_CONFIG_ID_NOT_IN = "auth_config_id_not_in";
  @SerializedName(SERIALIZED_NAME_AUTH_CONFIG_ID_NOT_IN)
  private List<String> authConfigIdNotIn = null;

  public static final String SERIALIZED_NAME_AUTH_CONFIG_ID_NOT_STARTS_WITH = "auth_config_id_not_starts_with";
  @SerializedName(SERIALIZED_NAME_AUTH_CONFIG_ID_NOT_STARTS_WITH)
  private String authConfigIdNotStartsWith;

  public static final String SERIALIZED_NAME_AUTH_CONFIG_ID_STARTS_WITH = "auth_config_id_starts_with";
  @SerializedName(SERIALIZED_NAME_AUTH_CONFIG_ID_STARTS_WITH)
  private String authConfigIdStartsWith;

  public static final String SERIALIZED_NAME_DISPLAY_USERNAME = "display_username";
  @SerializedName(SERIALIZED_NAME_DISPLAY_USERNAME)
  private String displayUsername;

  public static final String SERIALIZED_NAME_DISPLAY_USERNAME_CONTAINS = "display_username_contains";
  @SerializedName(SERIALIZED_NAME_DISPLAY_USERNAME_CONTAINS)
  private String displayUsernameContains;

  public static final String SERIALIZED_NAME_DISPLAY_USERNAME_ENDS_WITH = "display_username_ends_with";
  @SerializedName(SERIALIZED_NAME_DISPLAY_USERNAME_ENDS_WITH)
  private String displayUsernameEndsWith;

  public static final String SERIALIZED_NAME_DISPLAY_USERNAME_GT = "display_username_gt";
  @SerializedName(SERIALIZED_NAME_DISPLAY_USERNAME_GT)
  private String displayUsernameGt;

  public static final String SERIALIZED_NAME_DISPLAY_USERNAME_GTE = "display_username_gte";
  @SerializedName(SERIALIZED_NAME_DISPLAY_USERNAME_GTE)
  private String displayUsernameGte;

  public static final String SERIALIZED_NAME_DISPLAY_USERNAME_IN = "display_username_in";
  @SerializedName(SERIALIZED_NAME_DISPLAY_USERNAME_IN)
  private List<String> displayUsernameIn = null;

  public static final String SERIALIZED_NAME_DISPLAY_USERNAME_LT = "display_username_lt";
  @SerializedName(SERIALIZED_NAME_DISPLAY_USERNAME_LT)
  private String displayUsernameLt;

  public static final String SERIALIZED_NAME_DISPLAY_USERNAME_LTE = "display_username_lte";
  @SerializedName(SERIALIZED_NAME_DISPLAY_USERNAME_LTE)
  private String displayUsernameLte;

  public static final String SERIALIZED_NAME_DISPLAY_USERNAME_NOT = "display_username_not";
  @SerializedName(SERIALIZED_NAME_DISPLAY_USERNAME_NOT)
  private String displayUsernameNot;

  public static final String SERIALIZED_NAME_DISPLAY_USERNAME_NOT_CONTAINS = "display_username_not_contains";
  @SerializedName(SERIALIZED_NAME_DISPLAY_USERNAME_NOT_CONTAINS)
  private String displayUsernameNotContains;

  public static final String SERIALIZED_NAME_DISPLAY_USERNAME_NOT_ENDS_WITH = "display_username_not_ends_with";
  @SerializedName(SERIALIZED_NAME_DISPLAY_USERNAME_NOT_ENDS_WITH)
  private String displayUsernameNotEndsWith;

  public static final String SERIALIZED_NAME_DISPLAY_USERNAME_NOT_IN = "display_username_not_in";
  @SerializedName(SERIALIZED_NAME_DISPLAY_USERNAME_NOT_IN)
  private List<String> displayUsernameNotIn = null;

  public static final String SERIALIZED_NAME_DISPLAY_USERNAME_NOT_STARTS_WITH = "display_username_not_starts_with";
  @SerializedName(SERIALIZED_NAME_DISPLAY_USERNAME_NOT_STARTS_WITH)
  private String displayUsernameNotStartsWith;

  public static final String SERIALIZED_NAME_DISPLAY_USERNAME_STARTS_WITH = "display_username_starts_with";
  @SerializedName(SERIALIZED_NAME_DISPLAY_USERNAME_STARTS_WITH)
  private String displayUsernameStartsWith;

  public static final String SERIALIZED_NAME_EMAIL_ADDRESS = "email_address";
  @SerializedName(SERIALIZED_NAME_EMAIL_ADDRESS)
  private String emailAddress;

  public static final String SERIALIZED_NAME_EMAIL_ADDRESS_CONTAINS = "email_address_contains";
  @SerializedName(SERIALIZED_NAME_EMAIL_ADDRESS_CONTAINS)
  private String emailAddressContains;

  public static final String SERIALIZED_NAME_EMAIL_ADDRESS_ENDS_WITH = "email_address_ends_with";
  @SerializedName(SERIALIZED_NAME_EMAIL_ADDRESS_ENDS_WITH)
  private String emailAddressEndsWith;

  public static final String SERIALIZED_NAME_EMAIL_ADDRESS_GT = "email_address_gt";
  @SerializedName(SERIALIZED_NAME_EMAIL_ADDRESS_GT)
  private String emailAddressGt;

  public static final String SERIALIZED_NAME_EMAIL_ADDRESS_GTE = "email_address_gte";
  @SerializedName(SERIALIZED_NAME_EMAIL_ADDRESS_GTE)
  private String emailAddressGte;

  public static final String SERIALIZED_NAME_EMAIL_ADDRESS_IN = "email_address_in";
  @SerializedName(SERIALIZED_NAME_EMAIL_ADDRESS_IN)
  private List<String> emailAddressIn = null;

  public static final String SERIALIZED_NAME_EMAIL_ADDRESS_LT = "email_address_lt";
  @SerializedName(SERIALIZED_NAME_EMAIL_ADDRESS_LT)
  private String emailAddressLt;

  public static final String SERIALIZED_NAME_EMAIL_ADDRESS_LTE = "email_address_lte";
  @SerializedName(SERIALIZED_NAME_EMAIL_ADDRESS_LTE)
  private String emailAddressLte;

  public static final String SERIALIZED_NAME_EMAIL_ADDRESS_NOT = "email_address_not";
  @SerializedName(SERIALIZED_NAME_EMAIL_ADDRESS_NOT)
  private String emailAddressNot;

  public static final String SERIALIZED_NAME_EMAIL_ADDRESS_NOT_CONTAINS = "email_address_not_contains";
  @SerializedName(SERIALIZED_NAME_EMAIL_ADDRESS_NOT_CONTAINS)
  private String emailAddressNotContains;

  public static final String SERIALIZED_NAME_EMAIL_ADDRESS_NOT_ENDS_WITH = "email_address_not_ends_with";
  @SerializedName(SERIALIZED_NAME_EMAIL_ADDRESS_NOT_ENDS_WITH)
  private String emailAddressNotEndsWith;

  public static final String SERIALIZED_NAME_EMAIL_ADDRESS_NOT_IN = "email_address_not_in";
  @SerializedName(SERIALIZED_NAME_EMAIL_ADDRESS_NOT_IN)
  private List<String> emailAddressNotIn = null;

  public static final String SERIALIZED_NAME_EMAIL_ADDRESS_NOT_STARTS_WITH = "email_address_not_starts_with";
  @SerializedName(SERIALIZED_NAME_EMAIL_ADDRESS_NOT_STARTS_WITH)
  private String emailAddressNotStartsWith;

  public static final String SERIALIZED_NAME_EMAIL_ADDRESS_STARTS_WITH = "email_address_starts_with";
  @SerializedName(SERIALIZED_NAME_EMAIL_ADDRESS_STARTS_WITH)
  private String emailAddressStartsWith;

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

  public static final String SERIALIZED_NAME_INTERNAL = "internal";
  @SerializedName(SERIALIZED_NAME_INTERNAL)
  private Boolean internal;

  public static final String SERIALIZED_NAME_INTERNAL_NOT = "internal_not";
  @SerializedName(SERIALIZED_NAME_INTERNAL_NOT)
  private Boolean internalNot;

  public static final String SERIALIZED_NAME_LDAP_DN = "ldap_dn";
  @SerializedName(SERIALIZED_NAME_LDAP_DN)
  private String ldapDn;

  public static final String SERIALIZED_NAME_LDAP_DN_CONTAINS = "ldap_dn_contains";
  @SerializedName(SERIALIZED_NAME_LDAP_DN_CONTAINS)
  private String ldapDnContains;

  public static final String SERIALIZED_NAME_LDAP_DN_ENDS_WITH = "ldap_dn_ends_with";
  @SerializedName(SERIALIZED_NAME_LDAP_DN_ENDS_WITH)
  private String ldapDnEndsWith;

  public static final String SERIALIZED_NAME_LDAP_DN_GT = "ldap_dn_gt";
  @SerializedName(SERIALIZED_NAME_LDAP_DN_GT)
  private String ldapDnGt;

  public static final String SERIALIZED_NAME_LDAP_DN_GTE = "ldap_dn_gte";
  @SerializedName(SERIALIZED_NAME_LDAP_DN_GTE)
  private String ldapDnGte;

  public static final String SERIALIZED_NAME_LDAP_DN_IN = "ldap_dn_in";
  @SerializedName(SERIALIZED_NAME_LDAP_DN_IN)
  private List<String> ldapDnIn = null;

  public static final String SERIALIZED_NAME_LDAP_DN_LT = "ldap_dn_lt";
  @SerializedName(SERIALIZED_NAME_LDAP_DN_LT)
  private String ldapDnLt;

  public static final String SERIALIZED_NAME_LDAP_DN_LTE = "ldap_dn_lte";
  @SerializedName(SERIALIZED_NAME_LDAP_DN_LTE)
  private String ldapDnLte;

  public static final String SERIALIZED_NAME_LDAP_DN_NOT = "ldap_dn_not";
  @SerializedName(SERIALIZED_NAME_LDAP_DN_NOT)
  private String ldapDnNot;

  public static final String SERIALIZED_NAME_LDAP_DN_NOT_CONTAINS = "ldap_dn_not_contains";
  @SerializedName(SERIALIZED_NAME_LDAP_DN_NOT_CONTAINS)
  private String ldapDnNotContains;

  public static final String SERIALIZED_NAME_LDAP_DN_NOT_ENDS_WITH = "ldap_dn_not_ends_with";
  @SerializedName(SERIALIZED_NAME_LDAP_DN_NOT_ENDS_WITH)
  private String ldapDnNotEndsWith;

  public static final String SERIALIZED_NAME_LDAP_DN_NOT_IN = "ldap_dn_not_in";
  @SerializedName(SERIALIZED_NAME_LDAP_DN_NOT_IN)
  private List<String> ldapDnNotIn = null;

  public static final String SERIALIZED_NAME_LDAP_DN_NOT_STARTS_WITH = "ldap_dn_not_starts_with";
  @SerializedName(SERIALIZED_NAME_LDAP_DN_NOT_STARTS_WITH)
  private String ldapDnNotStartsWith;

  public static final String SERIALIZED_NAME_LDAP_DN_STARTS_WITH = "ldap_dn_starts_with";
  @SerializedName(SERIALIZED_NAME_LDAP_DN_STARTS_WITH)
  private String ldapDnStartsWith;

  public static final String SERIALIZED_NAME_MOBILE_PHONE = "mobile_phone";
  @SerializedName(SERIALIZED_NAME_MOBILE_PHONE)
  private String mobilePhone;

  public static final String SERIALIZED_NAME_MOBILE_PHONE_CONTAINS = "mobile_phone_contains";
  @SerializedName(SERIALIZED_NAME_MOBILE_PHONE_CONTAINS)
  private String mobilePhoneContains;

  public static final String SERIALIZED_NAME_MOBILE_PHONE_ENDS_WITH = "mobile_phone_ends_with";
  @SerializedName(SERIALIZED_NAME_MOBILE_PHONE_ENDS_WITH)
  private String mobilePhoneEndsWith;

  public static final String SERIALIZED_NAME_MOBILE_PHONE_GT = "mobile_phone_gt";
  @SerializedName(SERIALIZED_NAME_MOBILE_PHONE_GT)
  private String mobilePhoneGt;

  public static final String SERIALIZED_NAME_MOBILE_PHONE_GTE = "mobile_phone_gte";
  @SerializedName(SERIALIZED_NAME_MOBILE_PHONE_GTE)
  private String mobilePhoneGte;

  public static final String SERIALIZED_NAME_MOBILE_PHONE_IN = "mobile_phone_in";
  @SerializedName(SERIALIZED_NAME_MOBILE_PHONE_IN)
  private List<String> mobilePhoneIn = null;

  public static final String SERIALIZED_NAME_MOBILE_PHONE_LT = "mobile_phone_lt";
  @SerializedName(SERIALIZED_NAME_MOBILE_PHONE_LT)
  private String mobilePhoneLt;

  public static final String SERIALIZED_NAME_MOBILE_PHONE_LTE = "mobile_phone_lte";
  @SerializedName(SERIALIZED_NAME_MOBILE_PHONE_LTE)
  private String mobilePhoneLte;

  public static final String SERIALIZED_NAME_MOBILE_PHONE_NOT = "mobile_phone_not";
  @SerializedName(SERIALIZED_NAME_MOBILE_PHONE_NOT)
  private String mobilePhoneNot;

  public static final String SERIALIZED_NAME_MOBILE_PHONE_NOT_CONTAINS = "mobile_phone_not_contains";
  @SerializedName(SERIALIZED_NAME_MOBILE_PHONE_NOT_CONTAINS)
  private String mobilePhoneNotContains;

  public static final String SERIALIZED_NAME_MOBILE_PHONE_NOT_ENDS_WITH = "mobile_phone_not_ends_with";
  @SerializedName(SERIALIZED_NAME_MOBILE_PHONE_NOT_ENDS_WITH)
  private String mobilePhoneNotEndsWith;

  public static final String SERIALIZED_NAME_MOBILE_PHONE_NOT_IN = "mobile_phone_not_in";
  @SerializedName(SERIALIZED_NAME_MOBILE_PHONE_NOT_IN)
  private List<String> mobilePhoneNotIn = null;

  public static final String SERIALIZED_NAME_MOBILE_PHONE_NOT_STARTS_WITH = "mobile_phone_not_starts_with";
  @SerializedName(SERIALIZED_NAME_MOBILE_PHONE_NOT_STARTS_WITH)
  private String mobilePhoneNotStartsWith;

  public static final String SERIALIZED_NAME_MOBILE_PHONE_STARTS_WITH = "mobile_phone_starts_with";
  @SerializedName(SERIALIZED_NAME_MOBILE_PHONE_STARTS_WITH)
  private String mobilePhoneStartsWith;

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

  public static final String SERIALIZED_NAME_PASSWORD_EXPIRED = "password_expired";
  @SerializedName(SERIALIZED_NAME_PASSWORD_EXPIRED)
  private Boolean passwordExpired;

  public static final String SERIALIZED_NAME_PASSWORD_EXPIRED_NOT = "password_expired_not";
  @SerializedName(SERIALIZED_NAME_PASSWORD_EXPIRED_NOT)
  private Boolean passwordExpiredNot;

  public static final String SERIALIZED_NAME_PASSWORD_UPDATED_AT = "password_updated_at";
  @SerializedName(SERIALIZED_NAME_PASSWORD_UPDATED_AT)
  private String passwordUpdatedAt;

  public static final String SERIALIZED_NAME_PASSWORD_UPDATED_AT_GT = "password_updated_at_gt";
  @SerializedName(SERIALIZED_NAME_PASSWORD_UPDATED_AT_GT)
  private String passwordUpdatedAtGt;

  public static final String SERIALIZED_NAME_PASSWORD_UPDATED_AT_GTE = "password_updated_at_gte";
  @SerializedName(SERIALIZED_NAME_PASSWORD_UPDATED_AT_GTE)
  private String passwordUpdatedAtGte;

  public static final String SERIALIZED_NAME_PASSWORD_UPDATED_AT_IN = "password_updated_at_in";
  @SerializedName(SERIALIZED_NAME_PASSWORD_UPDATED_AT_IN)
  private List<String> passwordUpdatedAtIn = null;

  public static final String SERIALIZED_NAME_PASSWORD_UPDATED_AT_LT = "password_updated_at_lt";
  @SerializedName(SERIALIZED_NAME_PASSWORD_UPDATED_AT_LT)
  private String passwordUpdatedAtLt;

  public static final String SERIALIZED_NAME_PASSWORD_UPDATED_AT_LTE = "password_updated_at_lte";
  @SerializedName(SERIALIZED_NAME_PASSWORD_UPDATED_AT_LTE)
  private String passwordUpdatedAtLte;

  public static final String SERIALIZED_NAME_PASSWORD_UPDATED_AT_NOT = "password_updated_at_not";
  @SerializedName(SERIALIZED_NAME_PASSWORD_UPDATED_AT_NOT)
  private String passwordUpdatedAtNot;

  public static final String SERIALIZED_NAME_PASSWORD_UPDATED_AT_NOT_IN = "password_updated_at_not_in";
  @SerializedName(SERIALIZED_NAME_PASSWORD_UPDATED_AT_NOT_IN)
  private List<String> passwordUpdatedAtNotIn = null;

  public static final String SERIALIZED_NAME_ROLE = "role";
  @SerializedName(SERIALIZED_NAME_ROLE)
  private UserRole role;

  public static final String SERIALIZED_NAME_ROLE_IN = "role_in";
  @SerializedName(SERIALIZED_NAME_ROLE_IN)
  private List<UserRole> roleIn = null;

  public static final String SERIALIZED_NAME_ROLE_NOT = "role_not";
  @SerializedName(SERIALIZED_NAME_ROLE_NOT)
  private UserRole roleNot;

  public static final String SERIALIZED_NAME_ROLE_NOT_IN = "role_not_in";
  @SerializedName(SERIALIZED_NAME_ROLE_NOT_IN)
  private List<UserRole> roleNotIn = null;

  public static final String SERIALIZED_NAME_ROLES_EVERY = "roles_every";
  @SerializedName(SERIALIZED_NAME_ROLES_EVERY)
  private UserRoleNextWhereInput rolesEvery;

  public static final String SERIALIZED_NAME_ROLES_NONE = "roles_none";
  @SerializedName(SERIALIZED_NAME_ROLES_NONE)
  private UserRoleNextWhereInput rolesNone;

  public static final String SERIALIZED_NAME_ROLES_SOME = "roles_some";
  @SerializedName(SERIALIZED_NAME_ROLES_SOME)
  private UserRoleNextWhereInput rolesSome;

  public static final String SERIALIZED_NAME_SOURCE = "source";
  @SerializedName(SERIALIZED_NAME_SOURCE)
  private UserSource source;

  public static final String SERIALIZED_NAME_SOURCE_IN = "source_in";
  @SerializedName(SERIALIZED_NAME_SOURCE_IN)
  private List<UserSource> sourceIn = null;

  public static final String SERIALIZED_NAME_SOURCE_NOT = "source_not";
  @SerializedName(SERIALIZED_NAME_SOURCE_NOT)
  private UserSource sourceNot;

  public static final String SERIALIZED_NAME_SOURCE_NOT_IN = "source_not_in";
  @SerializedName(SERIALIZED_NAME_SOURCE_NOT_IN)
  private List<UserSource> sourceNotIn = null;

  public static final String SERIALIZED_NAME_USERNAME = "username";
  @SerializedName(SERIALIZED_NAME_USERNAME)
  private String username;

  public static final String SERIALIZED_NAME_USERNAME_CONTAINS = "username_contains";
  @SerializedName(SERIALIZED_NAME_USERNAME_CONTAINS)
  private String usernameContains;

  public static final String SERIALIZED_NAME_USERNAME_ENDS_WITH = "username_ends_with";
  @SerializedName(SERIALIZED_NAME_USERNAME_ENDS_WITH)
  private String usernameEndsWith;

  public static final String SERIALIZED_NAME_USERNAME_GT = "username_gt";
  @SerializedName(SERIALIZED_NAME_USERNAME_GT)
  private String usernameGt;

  public static final String SERIALIZED_NAME_USERNAME_GTE = "username_gte";
  @SerializedName(SERIALIZED_NAME_USERNAME_GTE)
  private String usernameGte;

  public static final String SERIALIZED_NAME_USERNAME_IN = "username_in";
  @SerializedName(SERIALIZED_NAME_USERNAME_IN)
  private List<String> usernameIn = null;

  public static final String SERIALIZED_NAME_USERNAME_LT = "username_lt";
  @SerializedName(SERIALIZED_NAME_USERNAME_LT)
  private String usernameLt;

  public static final String SERIALIZED_NAME_USERNAME_LTE = "username_lte";
  @SerializedName(SERIALIZED_NAME_USERNAME_LTE)
  private String usernameLte;

  public static final String SERIALIZED_NAME_USERNAME_NOT = "username_not";
  @SerializedName(SERIALIZED_NAME_USERNAME_NOT)
  private String usernameNot;

  public static final String SERIALIZED_NAME_USERNAME_NOT_CONTAINS = "username_not_contains";
  @SerializedName(SERIALIZED_NAME_USERNAME_NOT_CONTAINS)
  private String usernameNotContains;

  public static final String SERIALIZED_NAME_USERNAME_NOT_ENDS_WITH = "username_not_ends_with";
  @SerializedName(SERIALIZED_NAME_USERNAME_NOT_ENDS_WITH)
  private String usernameNotEndsWith;

  public static final String SERIALIZED_NAME_USERNAME_NOT_IN = "username_not_in";
  @SerializedName(SERIALIZED_NAME_USERNAME_NOT_IN)
  private List<String> usernameNotIn = null;

  public static final String SERIALIZED_NAME_USERNAME_NOT_STARTS_WITH = "username_not_starts_with";
  @SerializedName(SERIALIZED_NAME_USERNAME_NOT_STARTS_WITH)
  private String usernameNotStartsWith;

  public static final String SERIALIZED_NAME_USERNAME_STARTS_WITH = "username_starts_with";
  @SerializedName(SERIALIZED_NAME_USERNAME_STARTS_WITH)
  private String usernameStartsWith;

  public UserWhereInput() { 
  }

  public UserWhereInput AND(List<UserWhereInput> AND) {
    
    this.AND = AND;
    return this;
  }

  public UserWhereInput addANDItem(UserWhereInput ANDItem) {
    if (this.AND == null) {
      this.AND = new ArrayList<UserWhereInput>();
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

  public List<UserWhereInput> getAND() {
    return AND;
  }


  public void setAND(List<UserWhereInput> AND) {
    this.AND = AND;
  }


  public UserWhereInput NOT(List<UserWhereInput> NOT) {
    
    this.NOT = NOT;
    return this;
  }

  public UserWhereInput addNOTItem(UserWhereInput NOTItem) {
    if (this.NOT == null) {
      this.NOT = new ArrayList<UserWhereInput>();
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

  public List<UserWhereInput> getNOT() {
    return NOT;
  }


  public void setNOT(List<UserWhereInput> NOT) {
    this.NOT = NOT;
  }


  public UserWhereInput OR(List<UserWhereInput> OR) {
    
    this.OR = OR;
    return this;
  }

  public UserWhereInput addORItem(UserWhereInput ORItem) {
    if (this.OR == null) {
      this.OR = new ArrayList<UserWhereInput>();
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

  public List<UserWhereInput> getOR() {
    return OR;
  }


  public void setOR(List<UserWhereInput> OR) {
    this.OR = OR;
  }


  public UserWhereInput authConfigId(String authConfigId) {
    
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


  public UserWhereInput authConfigIdContains(String authConfigIdContains) {
    
    this.authConfigIdContains = authConfigIdContains;
    return this;
  }

   /**
   * Get authConfigIdContains
   * @return authConfigIdContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAuthConfigIdContains() {
    return authConfigIdContains;
  }


  public void setAuthConfigIdContains(String authConfigIdContains) {
    this.authConfigIdContains = authConfigIdContains;
  }


  public UserWhereInput authConfigIdEndsWith(String authConfigIdEndsWith) {
    
    this.authConfigIdEndsWith = authConfigIdEndsWith;
    return this;
  }

   /**
   * Get authConfigIdEndsWith
   * @return authConfigIdEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAuthConfigIdEndsWith() {
    return authConfigIdEndsWith;
  }


  public void setAuthConfigIdEndsWith(String authConfigIdEndsWith) {
    this.authConfigIdEndsWith = authConfigIdEndsWith;
  }


  public UserWhereInput authConfigIdGt(String authConfigIdGt) {
    
    this.authConfigIdGt = authConfigIdGt;
    return this;
  }

   /**
   * Get authConfigIdGt
   * @return authConfigIdGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAuthConfigIdGt() {
    return authConfigIdGt;
  }


  public void setAuthConfigIdGt(String authConfigIdGt) {
    this.authConfigIdGt = authConfigIdGt;
  }


  public UserWhereInput authConfigIdGte(String authConfigIdGte) {
    
    this.authConfigIdGte = authConfigIdGte;
    return this;
  }

   /**
   * Get authConfigIdGte
   * @return authConfigIdGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAuthConfigIdGte() {
    return authConfigIdGte;
  }


  public void setAuthConfigIdGte(String authConfigIdGte) {
    this.authConfigIdGte = authConfigIdGte;
  }


  public UserWhereInput authConfigIdIn(List<String> authConfigIdIn) {
    
    this.authConfigIdIn = authConfigIdIn;
    return this;
  }

  public UserWhereInput addAuthConfigIdInItem(String authConfigIdInItem) {
    if (this.authConfigIdIn == null) {
      this.authConfigIdIn = new ArrayList<String>();
    }
    this.authConfigIdIn.add(authConfigIdInItem);
    return this;
  }

   /**
   * Get authConfigIdIn
   * @return authConfigIdIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getAuthConfigIdIn() {
    return authConfigIdIn;
  }


  public void setAuthConfigIdIn(List<String> authConfigIdIn) {
    this.authConfigIdIn = authConfigIdIn;
  }


  public UserWhereInput authConfigIdLt(String authConfigIdLt) {
    
    this.authConfigIdLt = authConfigIdLt;
    return this;
  }

   /**
   * Get authConfigIdLt
   * @return authConfigIdLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAuthConfigIdLt() {
    return authConfigIdLt;
  }


  public void setAuthConfigIdLt(String authConfigIdLt) {
    this.authConfigIdLt = authConfigIdLt;
  }


  public UserWhereInput authConfigIdLte(String authConfigIdLte) {
    
    this.authConfigIdLte = authConfigIdLte;
    return this;
  }

   /**
   * Get authConfigIdLte
   * @return authConfigIdLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAuthConfigIdLte() {
    return authConfigIdLte;
  }


  public void setAuthConfigIdLte(String authConfigIdLte) {
    this.authConfigIdLte = authConfigIdLte;
  }


  public UserWhereInput authConfigIdNot(String authConfigIdNot) {
    
    this.authConfigIdNot = authConfigIdNot;
    return this;
  }

   /**
   * Get authConfigIdNot
   * @return authConfigIdNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAuthConfigIdNot() {
    return authConfigIdNot;
  }


  public void setAuthConfigIdNot(String authConfigIdNot) {
    this.authConfigIdNot = authConfigIdNot;
  }


  public UserWhereInput authConfigIdNotContains(String authConfigIdNotContains) {
    
    this.authConfigIdNotContains = authConfigIdNotContains;
    return this;
  }

   /**
   * Get authConfigIdNotContains
   * @return authConfigIdNotContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAuthConfigIdNotContains() {
    return authConfigIdNotContains;
  }


  public void setAuthConfigIdNotContains(String authConfigIdNotContains) {
    this.authConfigIdNotContains = authConfigIdNotContains;
  }


  public UserWhereInput authConfigIdNotEndsWith(String authConfigIdNotEndsWith) {
    
    this.authConfigIdNotEndsWith = authConfigIdNotEndsWith;
    return this;
  }

   /**
   * Get authConfigIdNotEndsWith
   * @return authConfigIdNotEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAuthConfigIdNotEndsWith() {
    return authConfigIdNotEndsWith;
  }


  public void setAuthConfigIdNotEndsWith(String authConfigIdNotEndsWith) {
    this.authConfigIdNotEndsWith = authConfigIdNotEndsWith;
  }


  public UserWhereInput authConfigIdNotIn(List<String> authConfigIdNotIn) {
    
    this.authConfigIdNotIn = authConfigIdNotIn;
    return this;
  }

  public UserWhereInput addAuthConfigIdNotInItem(String authConfigIdNotInItem) {
    if (this.authConfigIdNotIn == null) {
      this.authConfigIdNotIn = new ArrayList<String>();
    }
    this.authConfigIdNotIn.add(authConfigIdNotInItem);
    return this;
  }

   /**
   * Get authConfigIdNotIn
   * @return authConfigIdNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getAuthConfigIdNotIn() {
    return authConfigIdNotIn;
  }


  public void setAuthConfigIdNotIn(List<String> authConfigIdNotIn) {
    this.authConfigIdNotIn = authConfigIdNotIn;
  }


  public UserWhereInput authConfigIdNotStartsWith(String authConfigIdNotStartsWith) {
    
    this.authConfigIdNotStartsWith = authConfigIdNotStartsWith;
    return this;
  }

   /**
   * Get authConfigIdNotStartsWith
   * @return authConfigIdNotStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAuthConfigIdNotStartsWith() {
    return authConfigIdNotStartsWith;
  }


  public void setAuthConfigIdNotStartsWith(String authConfigIdNotStartsWith) {
    this.authConfigIdNotStartsWith = authConfigIdNotStartsWith;
  }


  public UserWhereInput authConfigIdStartsWith(String authConfigIdStartsWith) {
    
    this.authConfigIdStartsWith = authConfigIdStartsWith;
    return this;
  }

   /**
   * Get authConfigIdStartsWith
   * @return authConfigIdStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAuthConfigIdStartsWith() {
    return authConfigIdStartsWith;
  }


  public void setAuthConfigIdStartsWith(String authConfigIdStartsWith) {
    this.authConfigIdStartsWith = authConfigIdStartsWith;
  }


  public UserWhereInput displayUsername(String displayUsername) {
    
    this.displayUsername = displayUsername;
    return this;
  }

   /**
   * Get displayUsername
   * @return displayUsername
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDisplayUsername() {
    return displayUsername;
  }


  public void setDisplayUsername(String displayUsername) {
    this.displayUsername = displayUsername;
  }


  public UserWhereInput displayUsernameContains(String displayUsernameContains) {
    
    this.displayUsernameContains = displayUsernameContains;
    return this;
  }

   /**
   * Get displayUsernameContains
   * @return displayUsernameContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDisplayUsernameContains() {
    return displayUsernameContains;
  }


  public void setDisplayUsernameContains(String displayUsernameContains) {
    this.displayUsernameContains = displayUsernameContains;
  }


  public UserWhereInput displayUsernameEndsWith(String displayUsernameEndsWith) {
    
    this.displayUsernameEndsWith = displayUsernameEndsWith;
    return this;
  }

   /**
   * Get displayUsernameEndsWith
   * @return displayUsernameEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDisplayUsernameEndsWith() {
    return displayUsernameEndsWith;
  }


  public void setDisplayUsernameEndsWith(String displayUsernameEndsWith) {
    this.displayUsernameEndsWith = displayUsernameEndsWith;
  }


  public UserWhereInput displayUsernameGt(String displayUsernameGt) {
    
    this.displayUsernameGt = displayUsernameGt;
    return this;
  }

   /**
   * Get displayUsernameGt
   * @return displayUsernameGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDisplayUsernameGt() {
    return displayUsernameGt;
  }


  public void setDisplayUsernameGt(String displayUsernameGt) {
    this.displayUsernameGt = displayUsernameGt;
  }


  public UserWhereInput displayUsernameGte(String displayUsernameGte) {
    
    this.displayUsernameGte = displayUsernameGte;
    return this;
  }

   /**
   * Get displayUsernameGte
   * @return displayUsernameGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDisplayUsernameGte() {
    return displayUsernameGte;
  }


  public void setDisplayUsernameGte(String displayUsernameGte) {
    this.displayUsernameGte = displayUsernameGte;
  }


  public UserWhereInput displayUsernameIn(List<String> displayUsernameIn) {
    
    this.displayUsernameIn = displayUsernameIn;
    return this;
  }

  public UserWhereInput addDisplayUsernameInItem(String displayUsernameInItem) {
    if (this.displayUsernameIn == null) {
      this.displayUsernameIn = new ArrayList<String>();
    }
    this.displayUsernameIn.add(displayUsernameInItem);
    return this;
  }

   /**
   * Get displayUsernameIn
   * @return displayUsernameIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getDisplayUsernameIn() {
    return displayUsernameIn;
  }


  public void setDisplayUsernameIn(List<String> displayUsernameIn) {
    this.displayUsernameIn = displayUsernameIn;
  }


  public UserWhereInput displayUsernameLt(String displayUsernameLt) {
    
    this.displayUsernameLt = displayUsernameLt;
    return this;
  }

   /**
   * Get displayUsernameLt
   * @return displayUsernameLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDisplayUsernameLt() {
    return displayUsernameLt;
  }


  public void setDisplayUsernameLt(String displayUsernameLt) {
    this.displayUsernameLt = displayUsernameLt;
  }


  public UserWhereInput displayUsernameLte(String displayUsernameLte) {
    
    this.displayUsernameLte = displayUsernameLte;
    return this;
  }

   /**
   * Get displayUsernameLte
   * @return displayUsernameLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDisplayUsernameLte() {
    return displayUsernameLte;
  }


  public void setDisplayUsernameLte(String displayUsernameLte) {
    this.displayUsernameLte = displayUsernameLte;
  }


  public UserWhereInput displayUsernameNot(String displayUsernameNot) {
    
    this.displayUsernameNot = displayUsernameNot;
    return this;
  }

   /**
   * Get displayUsernameNot
   * @return displayUsernameNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDisplayUsernameNot() {
    return displayUsernameNot;
  }


  public void setDisplayUsernameNot(String displayUsernameNot) {
    this.displayUsernameNot = displayUsernameNot;
  }


  public UserWhereInput displayUsernameNotContains(String displayUsernameNotContains) {
    
    this.displayUsernameNotContains = displayUsernameNotContains;
    return this;
  }

   /**
   * Get displayUsernameNotContains
   * @return displayUsernameNotContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDisplayUsernameNotContains() {
    return displayUsernameNotContains;
  }


  public void setDisplayUsernameNotContains(String displayUsernameNotContains) {
    this.displayUsernameNotContains = displayUsernameNotContains;
  }


  public UserWhereInput displayUsernameNotEndsWith(String displayUsernameNotEndsWith) {
    
    this.displayUsernameNotEndsWith = displayUsernameNotEndsWith;
    return this;
  }

   /**
   * Get displayUsernameNotEndsWith
   * @return displayUsernameNotEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDisplayUsernameNotEndsWith() {
    return displayUsernameNotEndsWith;
  }


  public void setDisplayUsernameNotEndsWith(String displayUsernameNotEndsWith) {
    this.displayUsernameNotEndsWith = displayUsernameNotEndsWith;
  }


  public UserWhereInput displayUsernameNotIn(List<String> displayUsernameNotIn) {
    
    this.displayUsernameNotIn = displayUsernameNotIn;
    return this;
  }

  public UserWhereInput addDisplayUsernameNotInItem(String displayUsernameNotInItem) {
    if (this.displayUsernameNotIn == null) {
      this.displayUsernameNotIn = new ArrayList<String>();
    }
    this.displayUsernameNotIn.add(displayUsernameNotInItem);
    return this;
  }

   /**
   * Get displayUsernameNotIn
   * @return displayUsernameNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getDisplayUsernameNotIn() {
    return displayUsernameNotIn;
  }


  public void setDisplayUsernameNotIn(List<String> displayUsernameNotIn) {
    this.displayUsernameNotIn = displayUsernameNotIn;
  }


  public UserWhereInput displayUsernameNotStartsWith(String displayUsernameNotStartsWith) {
    
    this.displayUsernameNotStartsWith = displayUsernameNotStartsWith;
    return this;
  }

   /**
   * Get displayUsernameNotStartsWith
   * @return displayUsernameNotStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDisplayUsernameNotStartsWith() {
    return displayUsernameNotStartsWith;
  }


  public void setDisplayUsernameNotStartsWith(String displayUsernameNotStartsWith) {
    this.displayUsernameNotStartsWith = displayUsernameNotStartsWith;
  }


  public UserWhereInput displayUsernameStartsWith(String displayUsernameStartsWith) {
    
    this.displayUsernameStartsWith = displayUsernameStartsWith;
    return this;
  }

   /**
   * Get displayUsernameStartsWith
   * @return displayUsernameStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDisplayUsernameStartsWith() {
    return displayUsernameStartsWith;
  }


  public void setDisplayUsernameStartsWith(String displayUsernameStartsWith) {
    this.displayUsernameStartsWith = displayUsernameStartsWith;
  }


  public UserWhereInput emailAddress(String emailAddress) {
    
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


  public UserWhereInput emailAddressContains(String emailAddressContains) {
    
    this.emailAddressContains = emailAddressContains;
    return this;
  }

   /**
   * Get emailAddressContains
   * @return emailAddressContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getEmailAddressContains() {
    return emailAddressContains;
  }


  public void setEmailAddressContains(String emailAddressContains) {
    this.emailAddressContains = emailAddressContains;
  }


  public UserWhereInput emailAddressEndsWith(String emailAddressEndsWith) {
    
    this.emailAddressEndsWith = emailAddressEndsWith;
    return this;
  }

   /**
   * Get emailAddressEndsWith
   * @return emailAddressEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getEmailAddressEndsWith() {
    return emailAddressEndsWith;
  }


  public void setEmailAddressEndsWith(String emailAddressEndsWith) {
    this.emailAddressEndsWith = emailAddressEndsWith;
  }


  public UserWhereInput emailAddressGt(String emailAddressGt) {
    
    this.emailAddressGt = emailAddressGt;
    return this;
  }

   /**
   * Get emailAddressGt
   * @return emailAddressGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getEmailAddressGt() {
    return emailAddressGt;
  }


  public void setEmailAddressGt(String emailAddressGt) {
    this.emailAddressGt = emailAddressGt;
  }


  public UserWhereInput emailAddressGte(String emailAddressGte) {
    
    this.emailAddressGte = emailAddressGte;
    return this;
  }

   /**
   * Get emailAddressGte
   * @return emailAddressGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getEmailAddressGte() {
    return emailAddressGte;
  }


  public void setEmailAddressGte(String emailAddressGte) {
    this.emailAddressGte = emailAddressGte;
  }


  public UserWhereInput emailAddressIn(List<String> emailAddressIn) {
    
    this.emailAddressIn = emailAddressIn;
    return this;
  }

  public UserWhereInput addEmailAddressInItem(String emailAddressInItem) {
    if (this.emailAddressIn == null) {
      this.emailAddressIn = new ArrayList<String>();
    }
    this.emailAddressIn.add(emailAddressInItem);
    return this;
  }

   /**
   * Get emailAddressIn
   * @return emailAddressIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getEmailAddressIn() {
    return emailAddressIn;
  }


  public void setEmailAddressIn(List<String> emailAddressIn) {
    this.emailAddressIn = emailAddressIn;
  }


  public UserWhereInput emailAddressLt(String emailAddressLt) {
    
    this.emailAddressLt = emailAddressLt;
    return this;
  }

   /**
   * Get emailAddressLt
   * @return emailAddressLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getEmailAddressLt() {
    return emailAddressLt;
  }


  public void setEmailAddressLt(String emailAddressLt) {
    this.emailAddressLt = emailAddressLt;
  }


  public UserWhereInput emailAddressLte(String emailAddressLte) {
    
    this.emailAddressLte = emailAddressLte;
    return this;
  }

   /**
   * Get emailAddressLte
   * @return emailAddressLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getEmailAddressLte() {
    return emailAddressLte;
  }


  public void setEmailAddressLte(String emailAddressLte) {
    this.emailAddressLte = emailAddressLte;
  }


  public UserWhereInput emailAddressNot(String emailAddressNot) {
    
    this.emailAddressNot = emailAddressNot;
    return this;
  }

   /**
   * Get emailAddressNot
   * @return emailAddressNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getEmailAddressNot() {
    return emailAddressNot;
  }


  public void setEmailAddressNot(String emailAddressNot) {
    this.emailAddressNot = emailAddressNot;
  }


  public UserWhereInput emailAddressNotContains(String emailAddressNotContains) {
    
    this.emailAddressNotContains = emailAddressNotContains;
    return this;
  }

   /**
   * Get emailAddressNotContains
   * @return emailAddressNotContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getEmailAddressNotContains() {
    return emailAddressNotContains;
  }


  public void setEmailAddressNotContains(String emailAddressNotContains) {
    this.emailAddressNotContains = emailAddressNotContains;
  }


  public UserWhereInput emailAddressNotEndsWith(String emailAddressNotEndsWith) {
    
    this.emailAddressNotEndsWith = emailAddressNotEndsWith;
    return this;
  }

   /**
   * Get emailAddressNotEndsWith
   * @return emailAddressNotEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getEmailAddressNotEndsWith() {
    return emailAddressNotEndsWith;
  }


  public void setEmailAddressNotEndsWith(String emailAddressNotEndsWith) {
    this.emailAddressNotEndsWith = emailAddressNotEndsWith;
  }


  public UserWhereInput emailAddressNotIn(List<String> emailAddressNotIn) {
    
    this.emailAddressNotIn = emailAddressNotIn;
    return this;
  }

  public UserWhereInput addEmailAddressNotInItem(String emailAddressNotInItem) {
    if (this.emailAddressNotIn == null) {
      this.emailAddressNotIn = new ArrayList<String>();
    }
    this.emailAddressNotIn.add(emailAddressNotInItem);
    return this;
  }

   /**
   * Get emailAddressNotIn
   * @return emailAddressNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getEmailAddressNotIn() {
    return emailAddressNotIn;
  }


  public void setEmailAddressNotIn(List<String> emailAddressNotIn) {
    this.emailAddressNotIn = emailAddressNotIn;
  }


  public UserWhereInput emailAddressNotStartsWith(String emailAddressNotStartsWith) {
    
    this.emailAddressNotStartsWith = emailAddressNotStartsWith;
    return this;
  }

   /**
   * Get emailAddressNotStartsWith
   * @return emailAddressNotStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getEmailAddressNotStartsWith() {
    return emailAddressNotStartsWith;
  }


  public void setEmailAddressNotStartsWith(String emailAddressNotStartsWith) {
    this.emailAddressNotStartsWith = emailAddressNotStartsWith;
  }


  public UserWhereInput emailAddressStartsWith(String emailAddressStartsWith) {
    
    this.emailAddressStartsWith = emailAddressStartsWith;
    return this;
  }

   /**
   * Get emailAddressStartsWith
   * @return emailAddressStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getEmailAddressStartsWith() {
    return emailAddressStartsWith;
  }


  public void setEmailAddressStartsWith(String emailAddressStartsWith) {
    this.emailAddressStartsWith = emailAddressStartsWith;
  }


  public UserWhereInput id(String id) {
    
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


  public UserWhereInput idContains(String idContains) {
    
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


  public UserWhereInput idEndsWith(String idEndsWith) {
    
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


  public UserWhereInput idGt(String idGt) {
    
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


  public UserWhereInput idGte(String idGte) {
    
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


  public UserWhereInput idIn(List<String> idIn) {
    
    this.idIn = idIn;
    return this;
  }

  public UserWhereInput addIdInItem(String idInItem) {
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


  public UserWhereInput idLt(String idLt) {
    
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


  public UserWhereInput idLte(String idLte) {
    
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


  public UserWhereInput idNot(String idNot) {
    
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


  public UserWhereInput idNotContains(String idNotContains) {
    
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


  public UserWhereInput idNotEndsWith(String idNotEndsWith) {
    
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


  public UserWhereInput idNotIn(List<String> idNotIn) {
    
    this.idNotIn = idNotIn;
    return this;
  }

  public UserWhereInput addIdNotInItem(String idNotInItem) {
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


  public UserWhereInput idNotStartsWith(String idNotStartsWith) {
    
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


  public UserWhereInput idStartsWith(String idStartsWith) {
    
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


  public UserWhereInput internal(Boolean internal) {
    
    this.internal = internal;
    return this;
  }

   /**
   * Get internal
   * @return internal
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getInternal() {
    return internal;
  }


  public void setInternal(Boolean internal) {
    this.internal = internal;
  }


  public UserWhereInput internalNot(Boolean internalNot) {
    
    this.internalNot = internalNot;
    return this;
  }

   /**
   * Get internalNot
   * @return internalNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getInternalNot() {
    return internalNot;
  }


  public void setInternalNot(Boolean internalNot) {
    this.internalNot = internalNot;
  }


  public UserWhereInput ldapDn(String ldapDn) {
    
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


  public UserWhereInput ldapDnContains(String ldapDnContains) {
    
    this.ldapDnContains = ldapDnContains;
    return this;
  }

   /**
   * Get ldapDnContains
   * @return ldapDnContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLdapDnContains() {
    return ldapDnContains;
  }


  public void setLdapDnContains(String ldapDnContains) {
    this.ldapDnContains = ldapDnContains;
  }


  public UserWhereInput ldapDnEndsWith(String ldapDnEndsWith) {
    
    this.ldapDnEndsWith = ldapDnEndsWith;
    return this;
  }

   /**
   * Get ldapDnEndsWith
   * @return ldapDnEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLdapDnEndsWith() {
    return ldapDnEndsWith;
  }


  public void setLdapDnEndsWith(String ldapDnEndsWith) {
    this.ldapDnEndsWith = ldapDnEndsWith;
  }


  public UserWhereInput ldapDnGt(String ldapDnGt) {
    
    this.ldapDnGt = ldapDnGt;
    return this;
  }

   /**
   * Get ldapDnGt
   * @return ldapDnGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLdapDnGt() {
    return ldapDnGt;
  }


  public void setLdapDnGt(String ldapDnGt) {
    this.ldapDnGt = ldapDnGt;
  }


  public UserWhereInput ldapDnGte(String ldapDnGte) {
    
    this.ldapDnGte = ldapDnGte;
    return this;
  }

   /**
   * Get ldapDnGte
   * @return ldapDnGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLdapDnGte() {
    return ldapDnGte;
  }


  public void setLdapDnGte(String ldapDnGte) {
    this.ldapDnGte = ldapDnGte;
  }


  public UserWhereInput ldapDnIn(List<String> ldapDnIn) {
    
    this.ldapDnIn = ldapDnIn;
    return this;
  }

  public UserWhereInput addLdapDnInItem(String ldapDnInItem) {
    if (this.ldapDnIn == null) {
      this.ldapDnIn = new ArrayList<String>();
    }
    this.ldapDnIn.add(ldapDnInItem);
    return this;
  }

   /**
   * Get ldapDnIn
   * @return ldapDnIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getLdapDnIn() {
    return ldapDnIn;
  }


  public void setLdapDnIn(List<String> ldapDnIn) {
    this.ldapDnIn = ldapDnIn;
  }


  public UserWhereInput ldapDnLt(String ldapDnLt) {
    
    this.ldapDnLt = ldapDnLt;
    return this;
  }

   /**
   * Get ldapDnLt
   * @return ldapDnLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLdapDnLt() {
    return ldapDnLt;
  }


  public void setLdapDnLt(String ldapDnLt) {
    this.ldapDnLt = ldapDnLt;
  }


  public UserWhereInput ldapDnLte(String ldapDnLte) {
    
    this.ldapDnLte = ldapDnLte;
    return this;
  }

   /**
   * Get ldapDnLte
   * @return ldapDnLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLdapDnLte() {
    return ldapDnLte;
  }


  public void setLdapDnLte(String ldapDnLte) {
    this.ldapDnLte = ldapDnLte;
  }


  public UserWhereInput ldapDnNot(String ldapDnNot) {
    
    this.ldapDnNot = ldapDnNot;
    return this;
  }

   /**
   * Get ldapDnNot
   * @return ldapDnNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLdapDnNot() {
    return ldapDnNot;
  }


  public void setLdapDnNot(String ldapDnNot) {
    this.ldapDnNot = ldapDnNot;
  }


  public UserWhereInput ldapDnNotContains(String ldapDnNotContains) {
    
    this.ldapDnNotContains = ldapDnNotContains;
    return this;
  }

   /**
   * Get ldapDnNotContains
   * @return ldapDnNotContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLdapDnNotContains() {
    return ldapDnNotContains;
  }


  public void setLdapDnNotContains(String ldapDnNotContains) {
    this.ldapDnNotContains = ldapDnNotContains;
  }


  public UserWhereInput ldapDnNotEndsWith(String ldapDnNotEndsWith) {
    
    this.ldapDnNotEndsWith = ldapDnNotEndsWith;
    return this;
  }

   /**
   * Get ldapDnNotEndsWith
   * @return ldapDnNotEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLdapDnNotEndsWith() {
    return ldapDnNotEndsWith;
  }


  public void setLdapDnNotEndsWith(String ldapDnNotEndsWith) {
    this.ldapDnNotEndsWith = ldapDnNotEndsWith;
  }


  public UserWhereInput ldapDnNotIn(List<String> ldapDnNotIn) {
    
    this.ldapDnNotIn = ldapDnNotIn;
    return this;
  }

  public UserWhereInput addLdapDnNotInItem(String ldapDnNotInItem) {
    if (this.ldapDnNotIn == null) {
      this.ldapDnNotIn = new ArrayList<String>();
    }
    this.ldapDnNotIn.add(ldapDnNotInItem);
    return this;
  }

   /**
   * Get ldapDnNotIn
   * @return ldapDnNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getLdapDnNotIn() {
    return ldapDnNotIn;
  }


  public void setLdapDnNotIn(List<String> ldapDnNotIn) {
    this.ldapDnNotIn = ldapDnNotIn;
  }


  public UserWhereInput ldapDnNotStartsWith(String ldapDnNotStartsWith) {
    
    this.ldapDnNotStartsWith = ldapDnNotStartsWith;
    return this;
  }

   /**
   * Get ldapDnNotStartsWith
   * @return ldapDnNotStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLdapDnNotStartsWith() {
    return ldapDnNotStartsWith;
  }


  public void setLdapDnNotStartsWith(String ldapDnNotStartsWith) {
    this.ldapDnNotStartsWith = ldapDnNotStartsWith;
  }


  public UserWhereInput ldapDnStartsWith(String ldapDnStartsWith) {
    
    this.ldapDnStartsWith = ldapDnStartsWith;
    return this;
  }

   /**
   * Get ldapDnStartsWith
   * @return ldapDnStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLdapDnStartsWith() {
    return ldapDnStartsWith;
  }


  public void setLdapDnStartsWith(String ldapDnStartsWith) {
    this.ldapDnStartsWith = ldapDnStartsWith;
  }


  public UserWhereInput mobilePhone(String mobilePhone) {
    
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


  public UserWhereInput mobilePhoneContains(String mobilePhoneContains) {
    
    this.mobilePhoneContains = mobilePhoneContains;
    return this;
  }

   /**
   * Get mobilePhoneContains
   * @return mobilePhoneContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMobilePhoneContains() {
    return mobilePhoneContains;
  }


  public void setMobilePhoneContains(String mobilePhoneContains) {
    this.mobilePhoneContains = mobilePhoneContains;
  }


  public UserWhereInput mobilePhoneEndsWith(String mobilePhoneEndsWith) {
    
    this.mobilePhoneEndsWith = mobilePhoneEndsWith;
    return this;
  }

   /**
   * Get mobilePhoneEndsWith
   * @return mobilePhoneEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMobilePhoneEndsWith() {
    return mobilePhoneEndsWith;
  }


  public void setMobilePhoneEndsWith(String mobilePhoneEndsWith) {
    this.mobilePhoneEndsWith = mobilePhoneEndsWith;
  }


  public UserWhereInput mobilePhoneGt(String mobilePhoneGt) {
    
    this.mobilePhoneGt = mobilePhoneGt;
    return this;
  }

   /**
   * Get mobilePhoneGt
   * @return mobilePhoneGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMobilePhoneGt() {
    return mobilePhoneGt;
  }


  public void setMobilePhoneGt(String mobilePhoneGt) {
    this.mobilePhoneGt = mobilePhoneGt;
  }


  public UserWhereInput mobilePhoneGte(String mobilePhoneGte) {
    
    this.mobilePhoneGte = mobilePhoneGte;
    return this;
  }

   /**
   * Get mobilePhoneGte
   * @return mobilePhoneGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMobilePhoneGte() {
    return mobilePhoneGte;
  }


  public void setMobilePhoneGte(String mobilePhoneGte) {
    this.mobilePhoneGte = mobilePhoneGte;
  }


  public UserWhereInput mobilePhoneIn(List<String> mobilePhoneIn) {
    
    this.mobilePhoneIn = mobilePhoneIn;
    return this;
  }

  public UserWhereInput addMobilePhoneInItem(String mobilePhoneInItem) {
    if (this.mobilePhoneIn == null) {
      this.mobilePhoneIn = new ArrayList<String>();
    }
    this.mobilePhoneIn.add(mobilePhoneInItem);
    return this;
  }

   /**
   * Get mobilePhoneIn
   * @return mobilePhoneIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getMobilePhoneIn() {
    return mobilePhoneIn;
  }


  public void setMobilePhoneIn(List<String> mobilePhoneIn) {
    this.mobilePhoneIn = mobilePhoneIn;
  }


  public UserWhereInput mobilePhoneLt(String mobilePhoneLt) {
    
    this.mobilePhoneLt = mobilePhoneLt;
    return this;
  }

   /**
   * Get mobilePhoneLt
   * @return mobilePhoneLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMobilePhoneLt() {
    return mobilePhoneLt;
  }


  public void setMobilePhoneLt(String mobilePhoneLt) {
    this.mobilePhoneLt = mobilePhoneLt;
  }


  public UserWhereInput mobilePhoneLte(String mobilePhoneLte) {
    
    this.mobilePhoneLte = mobilePhoneLte;
    return this;
  }

   /**
   * Get mobilePhoneLte
   * @return mobilePhoneLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMobilePhoneLte() {
    return mobilePhoneLte;
  }


  public void setMobilePhoneLte(String mobilePhoneLte) {
    this.mobilePhoneLte = mobilePhoneLte;
  }


  public UserWhereInput mobilePhoneNot(String mobilePhoneNot) {
    
    this.mobilePhoneNot = mobilePhoneNot;
    return this;
  }

   /**
   * Get mobilePhoneNot
   * @return mobilePhoneNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMobilePhoneNot() {
    return mobilePhoneNot;
  }


  public void setMobilePhoneNot(String mobilePhoneNot) {
    this.mobilePhoneNot = mobilePhoneNot;
  }


  public UserWhereInput mobilePhoneNotContains(String mobilePhoneNotContains) {
    
    this.mobilePhoneNotContains = mobilePhoneNotContains;
    return this;
  }

   /**
   * Get mobilePhoneNotContains
   * @return mobilePhoneNotContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMobilePhoneNotContains() {
    return mobilePhoneNotContains;
  }


  public void setMobilePhoneNotContains(String mobilePhoneNotContains) {
    this.mobilePhoneNotContains = mobilePhoneNotContains;
  }


  public UserWhereInput mobilePhoneNotEndsWith(String mobilePhoneNotEndsWith) {
    
    this.mobilePhoneNotEndsWith = mobilePhoneNotEndsWith;
    return this;
  }

   /**
   * Get mobilePhoneNotEndsWith
   * @return mobilePhoneNotEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMobilePhoneNotEndsWith() {
    return mobilePhoneNotEndsWith;
  }


  public void setMobilePhoneNotEndsWith(String mobilePhoneNotEndsWith) {
    this.mobilePhoneNotEndsWith = mobilePhoneNotEndsWith;
  }


  public UserWhereInput mobilePhoneNotIn(List<String> mobilePhoneNotIn) {
    
    this.mobilePhoneNotIn = mobilePhoneNotIn;
    return this;
  }

  public UserWhereInput addMobilePhoneNotInItem(String mobilePhoneNotInItem) {
    if (this.mobilePhoneNotIn == null) {
      this.mobilePhoneNotIn = new ArrayList<String>();
    }
    this.mobilePhoneNotIn.add(mobilePhoneNotInItem);
    return this;
  }

   /**
   * Get mobilePhoneNotIn
   * @return mobilePhoneNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getMobilePhoneNotIn() {
    return mobilePhoneNotIn;
  }


  public void setMobilePhoneNotIn(List<String> mobilePhoneNotIn) {
    this.mobilePhoneNotIn = mobilePhoneNotIn;
  }


  public UserWhereInput mobilePhoneNotStartsWith(String mobilePhoneNotStartsWith) {
    
    this.mobilePhoneNotStartsWith = mobilePhoneNotStartsWith;
    return this;
  }

   /**
   * Get mobilePhoneNotStartsWith
   * @return mobilePhoneNotStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMobilePhoneNotStartsWith() {
    return mobilePhoneNotStartsWith;
  }


  public void setMobilePhoneNotStartsWith(String mobilePhoneNotStartsWith) {
    this.mobilePhoneNotStartsWith = mobilePhoneNotStartsWith;
  }


  public UserWhereInput mobilePhoneStartsWith(String mobilePhoneStartsWith) {
    
    this.mobilePhoneStartsWith = mobilePhoneStartsWith;
    return this;
  }

   /**
   * Get mobilePhoneStartsWith
   * @return mobilePhoneStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMobilePhoneStartsWith() {
    return mobilePhoneStartsWith;
  }


  public void setMobilePhoneStartsWith(String mobilePhoneStartsWith) {
    this.mobilePhoneStartsWith = mobilePhoneStartsWith;
  }


  public UserWhereInput name(String name) {
    
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


  public UserWhereInput nameContains(String nameContains) {
    
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


  public UserWhereInput nameEndsWith(String nameEndsWith) {
    
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


  public UserWhereInput nameGt(String nameGt) {
    
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


  public UserWhereInput nameGte(String nameGte) {
    
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


  public UserWhereInput nameIn(List<String> nameIn) {
    
    this.nameIn = nameIn;
    return this;
  }

  public UserWhereInput addNameInItem(String nameInItem) {
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


  public UserWhereInput nameLt(String nameLt) {
    
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


  public UserWhereInput nameLte(String nameLte) {
    
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


  public UserWhereInput nameNot(String nameNot) {
    
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


  public UserWhereInput nameNotContains(String nameNotContains) {
    
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


  public UserWhereInput nameNotEndsWith(String nameNotEndsWith) {
    
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


  public UserWhereInput nameNotIn(List<String> nameNotIn) {
    
    this.nameNotIn = nameNotIn;
    return this;
  }

  public UserWhereInput addNameNotInItem(String nameNotInItem) {
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


  public UserWhereInput nameNotStartsWith(String nameNotStartsWith) {
    
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


  public UserWhereInput nameStartsWith(String nameStartsWith) {
    
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


  public UserWhereInput passwordExpired(Boolean passwordExpired) {
    
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


  public UserWhereInput passwordExpiredNot(Boolean passwordExpiredNot) {
    
    this.passwordExpiredNot = passwordExpiredNot;
    return this;
  }

   /**
   * Get passwordExpiredNot
   * @return passwordExpiredNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getPasswordExpiredNot() {
    return passwordExpiredNot;
  }


  public void setPasswordExpiredNot(Boolean passwordExpiredNot) {
    this.passwordExpiredNot = passwordExpiredNot;
  }


  public UserWhereInput passwordUpdatedAt(String passwordUpdatedAt) {
    
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


  public UserWhereInput passwordUpdatedAtGt(String passwordUpdatedAtGt) {
    
    this.passwordUpdatedAtGt = passwordUpdatedAtGt;
    return this;
  }

   /**
   * Get passwordUpdatedAtGt
   * @return passwordUpdatedAtGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPasswordUpdatedAtGt() {
    return passwordUpdatedAtGt;
  }


  public void setPasswordUpdatedAtGt(String passwordUpdatedAtGt) {
    this.passwordUpdatedAtGt = passwordUpdatedAtGt;
  }


  public UserWhereInput passwordUpdatedAtGte(String passwordUpdatedAtGte) {
    
    this.passwordUpdatedAtGte = passwordUpdatedAtGte;
    return this;
  }

   /**
   * Get passwordUpdatedAtGte
   * @return passwordUpdatedAtGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPasswordUpdatedAtGte() {
    return passwordUpdatedAtGte;
  }


  public void setPasswordUpdatedAtGte(String passwordUpdatedAtGte) {
    this.passwordUpdatedAtGte = passwordUpdatedAtGte;
  }


  public UserWhereInput passwordUpdatedAtIn(List<String> passwordUpdatedAtIn) {
    
    this.passwordUpdatedAtIn = passwordUpdatedAtIn;
    return this;
  }

  public UserWhereInput addPasswordUpdatedAtInItem(String passwordUpdatedAtInItem) {
    if (this.passwordUpdatedAtIn == null) {
      this.passwordUpdatedAtIn = new ArrayList<String>();
    }
    this.passwordUpdatedAtIn.add(passwordUpdatedAtInItem);
    return this;
  }

   /**
   * Get passwordUpdatedAtIn
   * @return passwordUpdatedAtIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getPasswordUpdatedAtIn() {
    return passwordUpdatedAtIn;
  }


  public void setPasswordUpdatedAtIn(List<String> passwordUpdatedAtIn) {
    this.passwordUpdatedAtIn = passwordUpdatedAtIn;
  }


  public UserWhereInput passwordUpdatedAtLt(String passwordUpdatedAtLt) {
    
    this.passwordUpdatedAtLt = passwordUpdatedAtLt;
    return this;
  }

   /**
   * Get passwordUpdatedAtLt
   * @return passwordUpdatedAtLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPasswordUpdatedAtLt() {
    return passwordUpdatedAtLt;
  }


  public void setPasswordUpdatedAtLt(String passwordUpdatedAtLt) {
    this.passwordUpdatedAtLt = passwordUpdatedAtLt;
  }


  public UserWhereInput passwordUpdatedAtLte(String passwordUpdatedAtLte) {
    
    this.passwordUpdatedAtLte = passwordUpdatedAtLte;
    return this;
  }

   /**
   * Get passwordUpdatedAtLte
   * @return passwordUpdatedAtLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPasswordUpdatedAtLte() {
    return passwordUpdatedAtLte;
  }


  public void setPasswordUpdatedAtLte(String passwordUpdatedAtLte) {
    this.passwordUpdatedAtLte = passwordUpdatedAtLte;
  }


  public UserWhereInput passwordUpdatedAtNot(String passwordUpdatedAtNot) {
    
    this.passwordUpdatedAtNot = passwordUpdatedAtNot;
    return this;
  }

   /**
   * Get passwordUpdatedAtNot
   * @return passwordUpdatedAtNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPasswordUpdatedAtNot() {
    return passwordUpdatedAtNot;
  }


  public void setPasswordUpdatedAtNot(String passwordUpdatedAtNot) {
    this.passwordUpdatedAtNot = passwordUpdatedAtNot;
  }


  public UserWhereInput passwordUpdatedAtNotIn(List<String> passwordUpdatedAtNotIn) {
    
    this.passwordUpdatedAtNotIn = passwordUpdatedAtNotIn;
    return this;
  }

  public UserWhereInput addPasswordUpdatedAtNotInItem(String passwordUpdatedAtNotInItem) {
    if (this.passwordUpdatedAtNotIn == null) {
      this.passwordUpdatedAtNotIn = new ArrayList<String>();
    }
    this.passwordUpdatedAtNotIn.add(passwordUpdatedAtNotInItem);
    return this;
  }

   /**
   * Get passwordUpdatedAtNotIn
   * @return passwordUpdatedAtNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getPasswordUpdatedAtNotIn() {
    return passwordUpdatedAtNotIn;
  }


  public void setPasswordUpdatedAtNotIn(List<String> passwordUpdatedAtNotIn) {
    this.passwordUpdatedAtNotIn = passwordUpdatedAtNotIn;
  }


  public UserWhereInput role(UserRole role) {
    
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


  public UserWhereInput roleIn(List<UserRole> roleIn) {
    
    this.roleIn = roleIn;
    return this;
  }

  public UserWhereInput addRoleInItem(UserRole roleInItem) {
    if (this.roleIn == null) {
      this.roleIn = new ArrayList<UserRole>();
    }
    this.roleIn.add(roleInItem);
    return this;
  }

   /**
   * Get roleIn
   * @return roleIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<UserRole> getRoleIn() {
    return roleIn;
  }


  public void setRoleIn(List<UserRole> roleIn) {
    this.roleIn = roleIn;
  }


  public UserWhereInput roleNot(UserRole roleNot) {
    
    this.roleNot = roleNot;
    return this;
  }

   /**
   * Get roleNot
   * @return roleNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UserRole getRoleNot() {
    return roleNot;
  }


  public void setRoleNot(UserRole roleNot) {
    this.roleNot = roleNot;
  }


  public UserWhereInput roleNotIn(List<UserRole> roleNotIn) {
    
    this.roleNotIn = roleNotIn;
    return this;
  }

  public UserWhereInput addRoleNotInItem(UserRole roleNotInItem) {
    if (this.roleNotIn == null) {
      this.roleNotIn = new ArrayList<UserRole>();
    }
    this.roleNotIn.add(roleNotInItem);
    return this;
  }

   /**
   * Get roleNotIn
   * @return roleNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<UserRole> getRoleNotIn() {
    return roleNotIn;
  }


  public void setRoleNotIn(List<UserRole> roleNotIn) {
    this.roleNotIn = roleNotIn;
  }


  public UserWhereInput rolesEvery(UserRoleNextWhereInput rolesEvery) {
    
    this.rolesEvery = rolesEvery;
    return this;
  }

   /**
   * Get rolesEvery
   * @return rolesEvery
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UserRoleNextWhereInput getRolesEvery() {
    return rolesEvery;
  }


  public void setRolesEvery(UserRoleNextWhereInput rolesEvery) {
    this.rolesEvery = rolesEvery;
  }


  public UserWhereInput rolesNone(UserRoleNextWhereInput rolesNone) {
    
    this.rolesNone = rolesNone;
    return this;
  }

   /**
   * Get rolesNone
   * @return rolesNone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UserRoleNextWhereInput getRolesNone() {
    return rolesNone;
  }


  public void setRolesNone(UserRoleNextWhereInput rolesNone) {
    this.rolesNone = rolesNone;
  }


  public UserWhereInput rolesSome(UserRoleNextWhereInput rolesSome) {
    
    this.rolesSome = rolesSome;
    return this;
  }

   /**
   * Get rolesSome
   * @return rolesSome
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UserRoleNextWhereInput getRolesSome() {
    return rolesSome;
  }


  public void setRolesSome(UserRoleNextWhereInput rolesSome) {
    this.rolesSome = rolesSome;
  }


  public UserWhereInput source(UserSource source) {
    
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


  public UserWhereInput sourceIn(List<UserSource> sourceIn) {
    
    this.sourceIn = sourceIn;
    return this;
  }

  public UserWhereInput addSourceInItem(UserSource sourceInItem) {
    if (this.sourceIn == null) {
      this.sourceIn = new ArrayList<UserSource>();
    }
    this.sourceIn.add(sourceInItem);
    return this;
  }

   /**
   * Get sourceIn
   * @return sourceIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<UserSource> getSourceIn() {
    return sourceIn;
  }


  public void setSourceIn(List<UserSource> sourceIn) {
    this.sourceIn = sourceIn;
  }


  public UserWhereInput sourceNot(UserSource sourceNot) {
    
    this.sourceNot = sourceNot;
    return this;
  }

   /**
   * Get sourceNot
   * @return sourceNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UserSource getSourceNot() {
    return sourceNot;
  }


  public void setSourceNot(UserSource sourceNot) {
    this.sourceNot = sourceNot;
  }


  public UserWhereInput sourceNotIn(List<UserSource> sourceNotIn) {
    
    this.sourceNotIn = sourceNotIn;
    return this;
  }

  public UserWhereInput addSourceNotInItem(UserSource sourceNotInItem) {
    if (this.sourceNotIn == null) {
      this.sourceNotIn = new ArrayList<UserSource>();
    }
    this.sourceNotIn.add(sourceNotInItem);
    return this;
  }

   /**
   * Get sourceNotIn
   * @return sourceNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<UserSource> getSourceNotIn() {
    return sourceNotIn;
  }


  public void setSourceNotIn(List<UserSource> sourceNotIn) {
    this.sourceNotIn = sourceNotIn;
  }


  public UserWhereInput username(String username) {
    
    this.username = username;
    return this;
  }

   /**
   * Get username
   * @return username
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUsername() {
    return username;
  }


  public void setUsername(String username) {
    this.username = username;
  }


  public UserWhereInput usernameContains(String usernameContains) {
    
    this.usernameContains = usernameContains;
    return this;
  }

   /**
   * Get usernameContains
   * @return usernameContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUsernameContains() {
    return usernameContains;
  }


  public void setUsernameContains(String usernameContains) {
    this.usernameContains = usernameContains;
  }


  public UserWhereInput usernameEndsWith(String usernameEndsWith) {
    
    this.usernameEndsWith = usernameEndsWith;
    return this;
  }

   /**
   * Get usernameEndsWith
   * @return usernameEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUsernameEndsWith() {
    return usernameEndsWith;
  }


  public void setUsernameEndsWith(String usernameEndsWith) {
    this.usernameEndsWith = usernameEndsWith;
  }


  public UserWhereInput usernameGt(String usernameGt) {
    
    this.usernameGt = usernameGt;
    return this;
  }

   /**
   * Get usernameGt
   * @return usernameGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUsernameGt() {
    return usernameGt;
  }


  public void setUsernameGt(String usernameGt) {
    this.usernameGt = usernameGt;
  }


  public UserWhereInput usernameGte(String usernameGte) {
    
    this.usernameGte = usernameGte;
    return this;
  }

   /**
   * Get usernameGte
   * @return usernameGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUsernameGte() {
    return usernameGte;
  }


  public void setUsernameGte(String usernameGte) {
    this.usernameGte = usernameGte;
  }


  public UserWhereInput usernameIn(List<String> usernameIn) {
    
    this.usernameIn = usernameIn;
    return this;
  }

  public UserWhereInput addUsernameInItem(String usernameInItem) {
    if (this.usernameIn == null) {
      this.usernameIn = new ArrayList<String>();
    }
    this.usernameIn.add(usernameInItem);
    return this;
  }

   /**
   * Get usernameIn
   * @return usernameIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getUsernameIn() {
    return usernameIn;
  }


  public void setUsernameIn(List<String> usernameIn) {
    this.usernameIn = usernameIn;
  }


  public UserWhereInput usernameLt(String usernameLt) {
    
    this.usernameLt = usernameLt;
    return this;
  }

   /**
   * Get usernameLt
   * @return usernameLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUsernameLt() {
    return usernameLt;
  }


  public void setUsernameLt(String usernameLt) {
    this.usernameLt = usernameLt;
  }


  public UserWhereInput usernameLte(String usernameLte) {
    
    this.usernameLte = usernameLte;
    return this;
  }

   /**
   * Get usernameLte
   * @return usernameLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUsernameLte() {
    return usernameLte;
  }


  public void setUsernameLte(String usernameLte) {
    this.usernameLte = usernameLte;
  }


  public UserWhereInput usernameNot(String usernameNot) {
    
    this.usernameNot = usernameNot;
    return this;
  }

   /**
   * Get usernameNot
   * @return usernameNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUsernameNot() {
    return usernameNot;
  }


  public void setUsernameNot(String usernameNot) {
    this.usernameNot = usernameNot;
  }


  public UserWhereInput usernameNotContains(String usernameNotContains) {
    
    this.usernameNotContains = usernameNotContains;
    return this;
  }

   /**
   * Get usernameNotContains
   * @return usernameNotContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUsernameNotContains() {
    return usernameNotContains;
  }


  public void setUsernameNotContains(String usernameNotContains) {
    this.usernameNotContains = usernameNotContains;
  }


  public UserWhereInput usernameNotEndsWith(String usernameNotEndsWith) {
    
    this.usernameNotEndsWith = usernameNotEndsWith;
    return this;
  }

   /**
   * Get usernameNotEndsWith
   * @return usernameNotEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUsernameNotEndsWith() {
    return usernameNotEndsWith;
  }


  public void setUsernameNotEndsWith(String usernameNotEndsWith) {
    this.usernameNotEndsWith = usernameNotEndsWith;
  }


  public UserWhereInput usernameNotIn(List<String> usernameNotIn) {
    
    this.usernameNotIn = usernameNotIn;
    return this;
  }

  public UserWhereInput addUsernameNotInItem(String usernameNotInItem) {
    if (this.usernameNotIn == null) {
      this.usernameNotIn = new ArrayList<String>();
    }
    this.usernameNotIn.add(usernameNotInItem);
    return this;
  }

   /**
   * Get usernameNotIn
   * @return usernameNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getUsernameNotIn() {
    return usernameNotIn;
  }


  public void setUsernameNotIn(List<String> usernameNotIn) {
    this.usernameNotIn = usernameNotIn;
  }


  public UserWhereInput usernameNotStartsWith(String usernameNotStartsWith) {
    
    this.usernameNotStartsWith = usernameNotStartsWith;
    return this;
  }

   /**
   * Get usernameNotStartsWith
   * @return usernameNotStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUsernameNotStartsWith() {
    return usernameNotStartsWith;
  }


  public void setUsernameNotStartsWith(String usernameNotStartsWith) {
    this.usernameNotStartsWith = usernameNotStartsWith;
  }


  public UserWhereInput usernameStartsWith(String usernameStartsWith) {
    
    this.usernameStartsWith = usernameStartsWith;
    return this;
  }

   /**
   * Get usernameStartsWith
   * @return usernameStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUsernameStartsWith() {
    return usernameStartsWith;
  }


  public void setUsernameStartsWith(String usernameStartsWith) {
    this.usernameStartsWith = usernameStartsWith;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserWhereInput userWhereInput = (UserWhereInput) o;
    return Objects.equals(this.AND, userWhereInput.AND) &&
        Objects.equals(this.NOT, userWhereInput.NOT) &&
        Objects.equals(this.OR, userWhereInput.OR) &&
        Objects.equals(this.authConfigId, userWhereInput.authConfigId) &&
        Objects.equals(this.authConfigIdContains, userWhereInput.authConfigIdContains) &&
        Objects.equals(this.authConfigIdEndsWith, userWhereInput.authConfigIdEndsWith) &&
        Objects.equals(this.authConfigIdGt, userWhereInput.authConfigIdGt) &&
        Objects.equals(this.authConfigIdGte, userWhereInput.authConfigIdGte) &&
        Objects.equals(this.authConfigIdIn, userWhereInput.authConfigIdIn) &&
        Objects.equals(this.authConfigIdLt, userWhereInput.authConfigIdLt) &&
        Objects.equals(this.authConfigIdLte, userWhereInput.authConfigIdLte) &&
        Objects.equals(this.authConfigIdNot, userWhereInput.authConfigIdNot) &&
        Objects.equals(this.authConfigIdNotContains, userWhereInput.authConfigIdNotContains) &&
        Objects.equals(this.authConfigIdNotEndsWith, userWhereInput.authConfigIdNotEndsWith) &&
        Objects.equals(this.authConfigIdNotIn, userWhereInput.authConfigIdNotIn) &&
        Objects.equals(this.authConfigIdNotStartsWith, userWhereInput.authConfigIdNotStartsWith) &&
        Objects.equals(this.authConfigIdStartsWith, userWhereInput.authConfigIdStartsWith) &&
        Objects.equals(this.displayUsername, userWhereInput.displayUsername) &&
        Objects.equals(this.displayUsernameContains, userWhereInput.displayUsernameContains) &&
        Objects.equals(this.displayUsernameEndsWith, userWhereInput.displayUsernameEndsWith) &&
        Objects.equals(this.displayUsernameGt, userWhereInput.displayUsernameGt) &&
        Objects.equals(this.displayUsernameGte, userWhereInput.displayUsernameGte) &&
        Objects.equals(this.displayUsernameIn, userWhereInput.displayUsernameIn) &&
        Objects.equals(this.displayUsernameLt, userWhereInput.displayUsernameLt) &&
        Objects.equals(this.displayUsernameLte, userWhereInput.displayUsernameLte) &&
        Objects.equals(this.displayUsernameNot, userWhereInput.displayUsernameNot) &&
        Objects.equals(this.displayUsernameNotContains, userWhereInput.displayUsernameNotContains) &&
        Objects.equals(this.displayUsernameNotEndsWith, userWhereInput.displayUsernameNotEndsWith) &&
        Objects.equals(this.displayUsernameNotIn, userWhereInput.displayUsernameNotIn) &&
        Objects.equals(this.displayUsernameNotStartsWith, userWhereInput.displayUsernameNotStartsWith) &&
        Objects.equals(this.displayUsernameStartsWith, userWhereInput.displayUsernameStartsWith) &&
        Objects.equals(this.emailAddress, userWhereInput.emailAddress) &&
        Objects.equals(this.emailAddressContains, userWhereInput.emailAddressContains) &&
        Objects.equals(this.emailAddressEndsWith, userWhereInput.emailAddressEndsWith) &&
        Objects.equals(this.emailAddressGt, userWhereInput.emailAddressGt) &&
        Objects.equals(this.emailAddressGte, userWhereInput.emailAddressGte) &&
        Objects.equals(this.emailAddressIn, userWhereInput.emailAddressIn) &&
        Objects.equals(this.emailAddressLt, userWhereInput.emailAddressLt) &&
        Objects.equals(this.emailAddressLte, userWhereInput.emailAddressLte) &&
        Objects.equals(this.emailAddressNot, userWhereInput.emailAddressNot) &&
        Objects.equals(this.emailAddressNotContains, userWhereInput.emailAddressNotContains) &&
        Objects.equals(this.emailAddressNotEndsWith, userWhereInput.emailAddressNotEndsWith) &&
        Objects.equals(this.emailAddressNotIn, userWhereInput.emailAddressNotIn) &&
        Objects.equals(this.emailAddressNotStartsWith, userWhereInput.emailAddressNotStartsWith) &&
        Objects.equals(this.emailAddressStartsWith, userWhereInput.emailAddressStartsWith) &&
        Objects.equals(this.id, userWhereInput.id) &&
        Objects.equals(this.idContains, userWhereInput.idContains) &&
        Objects.equals(this.idEndsWith, userWhereInput.idEndsWith) &&
        Objects.equals(this.idGt, userWhereInput.idGt) &&
        Objects.equals(this.idGte, userWhereInput.idGte) &&
        Objects.equals(this.idIn, userWhereInput.idIn) &&
        Objects.equals(this.idLt, userWhereInput.idLt) &&
        Objects.equals(this.idLte, userWhereInput.idLte) &&
        Objects.equals(this.idNot, userWhereInput.idNot) &&
        Objects.equals(this.idNotContains, userWhereInput.idNotContains) &&
        Objects.equals(this.idNotEndsWith, userWhereInput.idNotEndsWith) &&
        Objects.equals(this.idNotIn, userWhereInput.idNotIn) &&
        Objects.equals(this.idNotStartsWith, userWhereInput.idNotStartsWith) &&
        Objects.equals(this.idStartsWith, userWhereInput.idStartsWith) &&
        Objects.equals(this.internal, userWhereInput.internal) &&
        Objects.equals(this.internalNot, userWhereInput.internalNot) &&
        Objects.equals(this.ldapDn, userWhereInput.ldapDn) &&
        Objects.equals(this.ldapDnContains, userWhereInput.ldapDnContains) &&
        Objects.equals(this.ldapDnEndsWith, userWhereInput.ldapDnEndsWith) &&
        Objects.equals(this.ldapDnGt, userWhereInput.ldapDnGt) &&
        Objects.equals(this.ldapDnGte, userWhereInput.ldapDnGte) &&
        Objects.equals(this.ldapDnIn, userWhereInput.ldapDnIn) &&
        Objects.equals(this.ldapDnLt, userWhereInput.ldapDnLt) &&
        Objects.equals(this.ldapDnLte, userWhereInput.ldapDnLte) &&
        Objects.equals(this.ldapDnNot, userWhereInput.ldapDnNot) &&
        Objects.equals(this.ldapDnNotContains, userWhereInput.ldapDnNotContains) &&
        Objects.equals(this.ldapDnNotEndsWith, userWhereInput.ldapDnNotEndsWith) &&
        Objects.equals(this.ldapDnNotIn, userWhereInput.ldapDnNotIn) &&
        Objects.equals(this.ldapDnNotStartsWith, userWhereInput.ldapDnNotStartsWith) &&
        Objects.equals(this.ldapDnStartsWith, userWhereInput.ldapDnStartsWith) &&
        Objects.equals(this.mobilePhone, userWhereInput.mobilePhone) &&
        Objects.equals(this.mobilePhoneContains, userWhereInput.mobilePhoneContains) &&
        Objects.equals(this.mobilePhoneEndsWith, userWhereInput.mobilePhoneEndsWith) &&
        Objects.equals(this.mobilePhoneGt, userWhereInput.mobilePhoneGt) &&
        Objects.equals(this.mobilePhoneGte, userWhereInput.mobilePhoneGte) &&
        Objects.equals(this.mobilePhoneIn, userWhereInput.mobilePhoneIn) &&
        Objects.equals(this.mobilePhoneLt, userWhereInput.mobilePhoneLt) &&
        Objects.equals(this.mobilePhoneLte, userWhereInput.mobilePhoneLte) &&
        Objects.equals(this.mobilePhoneNot, userWhereInput.mobilePhoneNot) &&
        Objects.equals(this.mobilePhoneNotContains, userWhereInput.mobilePhoneNotContains) &&
        Objects.equals(this.mobilePhoneNotEndsWith, userWhereInput.mobilePhoneNotEndsWith) &&
        Objects.equals(this.mobilePhoneNotIn, userWhereInput.mobilePhoneNotIn) &&
        Objects.equals(this.mobilePhoneNotStartsWith, userWhereInput.mobilePhoneNotStartsWith) &&
        Objects.equals(this.mobilePhoneStartsWith, userWhereInput.mobilePhoneStartsWith) &&
        Objects.equals(this.name, userWhereInput.name) &&
        Objects.equals(this.nameContains, userWhereInput.nameContains) &&
        Objects.equals(this.nameEndsWith, userWhereInput.nameEndsWith) &&
        Objects.equals(this.nameGt, userWhereInput.nameGt) &&
        Objects.equals(this.nameGte, userWhereInput.nameGte) &&
        Objects.equals(this.nameIn, userWhereInput.nameIn) &&
        Objects.equals(this.nameLt, userWhereInput.nameLt) &&
        Objects.equals(this.nameLte, userWhereInput.nameLte) &&
        Objects.equals(this.nameNot, userWhereInput.nameNot) &&
        Objects.equals(this.nameNotContains, userWhereInput.nameNotContains) &&
        Objects.equals(this.nameNotEndsWith, userWhereInput.nameNotEndsWith) &&
        Objects.equals(this.nameNotIn, userWhereInput.nameNotIn) &&
        Objects.equals(this.nameNotStartsWith, userWhereInput.nameNotStartsWith) &&
        Objects.equals(this.nameStartsWith, userWhereInput.nameStartsWith) &&
        Objects.equals(this.passwordExpired, userWhereInput.passwordExpired) &&
        Objects.equals(this.passwordExpiredNot, userWhereInput.passwordExpiredNot) &&
        Objects.equals(this.passwordUpdatedAt, userWhereInput.passwordUpdatedAt) &&
        Objects.equals(this.passwordUpdatedAtGt, userWhereInput.passwordUpdatedAtGt) &&
        Objects.equals(this.passwordUpdatedAtGte, userWhereInput.passwordUpdatedAtGte) &&
        Objects.equals(this.passwordUpdatedAtIn, userWhereInput.passwordUpdatedAtIn) &&
        Objects.equals(this.passwordUpdatedAtLt, userWhereInput.passwordUpdatedAtLt) &&
        Objects.equals(this.passwordUpdatedAtLte, userWhereInput.passwordUpdatedAtLte) &&
        Objects.equals(this.passwordUpdatedAtNot, userWhereInput.passwordUpdatedAtNot) &&
        Objects.equals(this.passwordUpdatedAtNotIn, userWhereInput.passwordUpdatedAtNotIn) &&
        Objects.equals(this.role, userWhereInput.role) &&
        Objects.equals(this.roleIn, userWhereInput.roleIn) &&
        Objects.equals(this.roleNot, userWhereInput.roleNot) &&
        Objects.equals(this.roleNotIn, userWhereInput.roleNotIn) &&
        Objects.equals(this.rolesEvery, userWhereInput.rolesEvery) &&
        Objects.equals(this.rolesNone, userWhereInput.rolesNone) &&
        Objects.equals(this.rolesSome, userWhereInput.rolesSome) &&
        Objects.equals(this.source, userWhereInput.source) &&
        Objects.equals(this.sourceIn, userWhereInput.sourceIn) &&
        Objects.equals(this.sourceNot, userWhereInput.sourceNot) &&
        Objects.equals(this.sourceNotIn, userWhereInput.sourceNotIn) &&
        Objects.equals(this.username, userWhereInput.username) &&
        Objects.equals(this.usernameContains, userWhereInput.usernameContains) &&
        Objects.equals(this.usernameEndsWith, userWhereInput.usernameEndsWith) &&
        Objects.equals(this.usernameGt, userWhereInput.usernameGt) &&
        Objects.equals(this.usernameGte, userWhereInput.usernameGte) &&
        Objects.equals(this.usernameIn, userWhereInput.usernameIn) &&
        Objects.equals(this.usernameLt, userWhereInput.usernameLt) &&
        Objects.equals(this.usernameLte, userWhereInput.usernameLte) &&
        Objects.equals(this.usernameNot, userWhereInput.usernameNot) &&
        Objects.equals(this.usernameNotContains, userWhereInput.usernameNotContains) &&
        Objects.equals(this.usernameNotEndsWith, userWhereInput.usernameNotEndsWith) &&
        Objects.equals(this.usernameNotIn, userWhereInput.usernameNotIn) &&
        Objects.equals(this.usernameNotStartsWith, userWhereInput.usernameNotStartsWith) &&
        Objects.equals(this.usernameStartsWith, userWhereInput.usernameStartsWith);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(AND, NOT, OR, authConfigId, authConfigIdContains, authConfigIdEndsWith, authConfigIdGt, authConfigIdGte, authConfigIdIn, authConfigIdLt, authConfigIdLte, authConfigIdNot, authConfigIdNotContains, authConfigIdNotEndsWith, authConfigIdNotIn, authConfigIdNotStartsWith, authConfigIdStartsWith, displayUsername, displayUsernameContains, displayUsernameEndsWith, displayUsernameGt, displayUsernameGte, displayUsernameIn, displayUsernameLt, displayUsernameLte, displayUsernameNot, displayUsernameNotContains, displayUsernameNotEndsWith, displayUsernameNotIn, displayUsernameNotStartsWith, displayUsernameStartsWith, emailAddress, emailAddressContains, emailAddressEndsWith, emailAddressGt, emailAddressGte, emailAddressIn, emailAddressLt, emailAddressLte, emailAddressNot, emailAddressNotContains, emailAddressNotEndsWith, emailAddressNotIn, emailAddressNotStartsWith, emailAddressStartsWith, id, idContains, idEndsWith, idGt, idGte, idIn, idLt, idLte, idNot, idNotContains, idNotEndsWith, idNotIn, idNotStartsWith, idStartsWith, internal, internalNot, ldapDn, ldapDnContains, ldapDnEndsWith, ldapDnGt, ldapDnGte, ldapDnIn, ldapDnLt, ldapDnLte, ldapDnNot, ldapDnNotContains, ldapDnNotEndsWith, ldapDnNotIn, ldapDnNotStartsWith, ldapDnStartsWith, mobilePhone, mobilePhoneContains, mobilePhoneEndsWith, mobilePhoneGt, mobilePhoneGte, mobilePhoneIn, mobilePhoneLt, mobilePhoneLte, mobilePhoneNot, mobilePhoneNotContains, mobilePhoneNotEndsWith, mobilePhoneNotIn, mobilePhoneNotStartsWith, mobilePhoneStartsWith, name, nameContains, nameEndsWith, nameGt, nameGte, nameIn, nameLt, nameLte, nameNot, nameNotContains, nameNotEndsWith, nameNotIn, nameNotStartsWith, nameStartsWith, passwordExpired, passwordExpiredNot, passwordUpdatedAt, passwordUpdatedAtGt, passwordUpdatedAtGte, passwordUpdatedAtIn, passwordUpdatedAtLt, passwordUpdatedAtLte, passwordUpdatedAtNot, passwordUpdatedAtNotIn, role, roleIn, roleNot, roleNotIn, rolesEvery, rolesNone, rolesSome, source, sourceIn, sourceNot, sourceNotIn, username, usernameContains, usernameEndsWith, usernameGt, usernameGte, usernameIn, usernameLt, usernameLte, usernameNot, usernameNotContains, usernameNotEndsWith, usernameNotIn, usernameNotStartsWith, usernameStartsWith);
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
    sb.append("class UserWhereInput {\n");
    sb.append("    AND: ").append(toIndentedString(AND)).append("\n");
    sb.append("    NOT: ").append(toIndentedString(NOT)).append("\n");
    sb.append("    OR: ").append(toIndentedString(OR)).append("\n");
    sb.append("    authConfigId: ").append(toIndentedString(authConfigId)).append("\n");
    sb.append("    authConfigIdContains: ").append(toIndentedString(authConfigIdContains)).append("\n");
    sb.append("    authConfigIdEndsWith: ").append(toIndentedString(authConfigIdEndsWith)).append("\n");
    sb.append("    authConfigIdGt: ").append(toIndentedString(authConfigIdGt)).append("\n");
    sb.append("    authConfigIdGte: ").append(toIndentedString(authConfigIdGte)).append("\n");
    sb.append("    authConfigIdIn: ").append(toIndentedString(authConfigIdIn)).append("\n");
    sb.append("    authConfigIdLt: ").append(toIndentedString(authConfigIdLt)).append("\n");
    sb.append("    authConfigIdLte: ").append(toIndentedString(authConfigIdLte)).append("\n");
    sb.append("    authConfigIdNot: ").append(toIndentedString(authConfigIdNot)).append("\n");
    sb.append("    authConfigIdNotContains: ").append(toIndentedString(authConfigIdNotContains)).append("\n");
    sb.append("    authConfigIdNotEndsWith: ").append(toIndentedString(authConfigIdNotEndsWith)).append("\n");
    sb.append("    authConfigIdNotIn: ").append(toIndentedString(authConfigIdNotIn)).append("\n");
    sb.append("    authConfigIdNotStartsWith: ").append(toIndentedString(authConfigIdNotStartsWith)).append("\n");
    sb.append("    authConfigIdStartsWith: ").append(toIndentedString(authConfigIdStartsWith)).append("\n");
    sb.append("    displayUsername: ").append(toIndentedString(displayUsername)).append("\n");
    sb.append("    displayUsernameContains: ").append(toIndentedString(displayUsernameContains)).append("\n");
    sb.append("    displayUsernameEndsWith: ").append(toIndentedString(displayUsernameEndsWith)).append("\n");
    sb.append("    displayUsernameGt: ").append(toIndentedString(displayUsernameGt)).append("\n");
    sb.append("    displayUsernameGte: ").append(toIndentedString(displayUsernameGte)).append("\n");
    sb.append("    displayUsernameIn: ").append(toIndentedString(displayUsernameIn)).append("\n");
    sb.append("    displayUsernameLt: ").append(toIndentedString(displayUsernameLt)).append("\n");
    sb.append("    displayUsernameLte: ").append(toIndentedString(displayUsernameLte)).append("\n");
    sb.append("    displayUsernameNot: ").append(toIndentedString(displayUsernameNot)).append("\n");
    sb.append("    displayUsernameNotContains: ").append(toIndentedString(displayUsernameNotContains)).append("\n");
    sb.append("    displayUsernameNotEndsWith: ").append(toIndentedString(displayUsernameNotEndsWith)).append("\n");
    sb.append("    displayUsernameNotIn: ").append(toIndentedString(displayUsernameNotIn)).append("\n");
    sb.append("    displayUsernameNotStartsWith: ").append(toIndentedString(displayUsernameNotStartsWith)).append("\n");
    sb.append("    displayUsernameStartsWith: ").append(toIndentedString(displayUsernameStartsWith)).append("\n");
    sb.append("    emailAddress: ").append(toIndentedString(emailAddress)).append("\n");
    sb.append("    emailAddressContains: ").append(toIndentedString(emailAddressContains)).append("\n");
    sb.append("    emailAddressEndsWith: ").append(toIndentedString(emailAddressEndsWith)).append("\n");
    sb.append("    emailAddressGt: ").append(toIndentedString(emailAddressGt)).append("\n");
    sb.append("    emailAddressGte: ").append(toIndentedString(emailAddressGte)).append("\n");
    sb.append("    emailAddressIn: ").append(toIndentedString(emailAddressIn)).append("\n");
    sb.append("    emailAddressLt: ").append(toIndentedString(emailAddressLt)).append("\n");
    sb.append("    emailAddressLte: ").append(toIndentedString(emailAddressLte)).append("\n");
    sb.append("    emailAddressNot: ").append(toIndentedString(emailAddressNot)).append("\n");
    sb.append("    emailAddressNotContains: ").append(toIndentedString(emailAddressNotContains)).append("\n");
    sb.append("    emailAddressNotEndsWith: ").append(toIndentedString(emailAddressNotEndsWith)).append("\n");
    sb.append("    emailAddressNotIn: ").append(toIndentedString(emailAddressNotIn)).append("\n");
    sb.append("    emailAddressNotStartsWith: ").append(toIndentedString(emailAddressNotStartsWith)).append("\n");
    sb.append("    emailAddressStartsWith: ").append(toIndentedString(emailAddressStartsWith)).append("\n");
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
    sb.append("    internal: ").append(toIndentedString(internal)).append("\n");
    sb.append("    internalNot: ").append(toIndentedString(internalNot)).append("\n");
    sb.append("    ldapDn: ").append(toIndentedString(ldapDn)).append("\n");
    sb.append("    ldapDnContains: ").append(toIndentedString(ldapDnContains)).append("\n");
    sb.append("    ldapDnEndsWith: ").append(toIndentedString(ldapDnEndsWith)).append("\n");
    sb.append("    ldapDnGt: ").append(toIndentedString(ldapDnGt)).append("\n");
    sb.append("    ldapDnGte: ").append(toIndentedString(ldapDnGte)).append("\n");
    sb.append("    ldapDnIn: ").append(toIndentedString(ldapDnIn)).append("\n");
    sb.append("    ldapDnLt: ").append(toIndentedString(ldapDnLt)).append("\n");
    sb.append("    ldapDnLte: ").append(toIndentedString(ldapDnLte)).append("\n");
    sb.append("    ldapDnNot: ").append(toIndentedString(ldapDnNot)).append("\n");
    sb.append("    ldapDnNotContains: ").append(toIndentedString(ldapDnNotContains)).append("\n");
    sb.append("    ldapDnNotEndsWith: ").append(toIndentedString(ldapDnNotEndsWith)).append("\n");
    sb.append("    ldapDnNotIn: ").append(toIndentedString(ldapDnNotIn)).append("\n");
    sb.append("    ldapDnNotStartsWith: ").append(toIndentedString(ldapDnNotStartsWith)).append("\n");
    sb.append("    ldapDnStartsWith: ").append(toIndentedString(ldapDnStartsWith)).append("\n");
    sb.append("    mobilePhone: ").append(toIndentedString(mobilePhone)).append("\n");
    sb.append("    mobilePhoneContains: ").append(toIndentedString(mobilePhoneContains)).append("\n");
    sb.append("    mobilePhoneEndsWith: ").append(toIndentedString(mobilePhoneEndsWith)).append("\n");
    sb.append("    mobilePhoneGt: ").append(toIndentedString(mobilePhoneGt)).append("\n");
    sb.append("    mobilePhoneGte: ").append(toIndentedString(mobilePhoneGte)).append("\n");
    sb.append("    mobilePhoneIn: ").append(toIndentedString(mobilePhoneIn)).append("\n");
    sb.append("    mobilePhoneLt: ").append(toIndentedString(mobilePhoneLt)).append("\n");
    sb.append("    mobilePhoneLte: ").append(toIndentedString(mobilePhoneLte)).append("\n");
    sb.append("    mobilePhoneNot: ").append(toIndentedString(mobilePhoneNot)).append("\n");
    sb.append("    mobilePhoneNotContains: ").append(toIndentedString(mobilePhoneNotContains)).append("\n");
    sb.append("    mobilePhoneNotEndsWith: ").append(toIndentedString(mobilePhoneNotEndsWith)).append("\n");
    sb.append("    mobilePhoneNotIn: ").append(toIndentedString(mobilePhoneNotIn)).append("\n");
    sb.append("    mobilePhoneNotStartsWith: ").append(toIndentedString(mobilePhoneNotStartsWith)).append("\n");
    sb.append("    mobilePhoneStartsWith: ").append(toIndentedString(mobilePhoneStartsWith)).append("\n");
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
    sb.append("    passwordExpired: ").append(toIndentedString(passwordExpired)).append("\n");
    sb.append("    passwordExpiredNot: ").append(toIndentedString(passwordExpiredNot)).append("\n");
    sb.append("    passwordUpdatedAt: ").append(toIndentedString(passwordUpdatedAt)).append("\n");
    sb.append("    passwordUpdatedAtGt: ").append(toIndentedString(passwordUpdatedAtGt)).append("\n");
    sb.append("    passwordUpdatedAtGte: ").append(toIndentedString(passwordUpdatedAtGte)).append("\n");
    sb.append("    passwordUpdatedAtIn: ").append(toIndentedString(passwordUpdatedAtIn)).append("\n");
    sb.append("    passwordUpdatedAtLt: ").append(toIndentedString(passwordUpdatedAtLt)).append("\n");
    sb.append("    passwordUpdatedAtLte: ").append(toIndentedString(passwordUpdatedAtLte)).append("\n");
    sb.append("    passwordUpdatedAtNot: ").append(toIndentedString(passwordUpdatedAtNot)).append("\n");
    sb.append("    passwordUpdatedAtNotIn: ").append(toIndentedString(passwordUpdatedAtNotIn)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    roleIn: ").append(toIndentedString(roleIn)).append("\n");
    sb.append("    roleNot: ").append(toIndentedString(roleNot)).append("\n");
    sb.append("    roleNotIn: ").append(toIndentedString(roleNotIn)).append("\n");
    sb.append("    rolesEvery: ").append(toIndentedString(rolesEvery)).append("\n");
    sb.append("    rolesNone: ").append(toIndentedString(rolesNone)).append("\n");
    sb.append("    rolesSome: ").append(toIndentedString(rolesSome)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    sourceIn: ").append(toIndentedString(sourceIn)).append("\n");
    sb.append("    sourceNot: ").append(toIndentedString(sourceNot)).append("\n");
    sb.append("    sourceNotIn: ").append(toIndentedString(sourceNotIn)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    usernameContains: ").append(toIndentedString(usernameContains)).append("\n");
    sb.append("    usernameEndsWith: ").append(toIndentedString(usernameEndsWith)).append("\n");
    sb.append("    usernameGt: ").append(toIndentedString(usernameGt)).append("\n");
    sb.append("    usernameGte: ").append(toIndentedString(usernameGte)).append("\n");
    sb.append("    usernameIn: ").append(toIndentedString(usernameIn)).append("\n");
    sb.append("    usernameLt: ").append(toIndentedString(usernameLt)).append("\n");
    sb.append("    usernameLte: ").append(toIndentedString(usernameLte)).append("\n");
    sb.append("    usernameNot: ").append(toIndentedString(usernameNot)).append("\n");
    sb.append("    usernameNotContains: ").append(toIndentedString(usernameNotContains)).append("\n");
    sb.append("    usernameNotEndsWith: ").append(toIndentedString(usernameNotEndsWith)).append("\n");
    sb.append("    usernameNotIn: ").append(toIndentedString(usernameNotIn)).append("\n");
    sb.append("    usernameNotStartsWith: ").append(toIndentedString(usernameNotStartsWith)).append("\n");
    sb.append("    usernameStartsWith: ").append(toIndentedString(usernameStartsWith)).append("\n");
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

