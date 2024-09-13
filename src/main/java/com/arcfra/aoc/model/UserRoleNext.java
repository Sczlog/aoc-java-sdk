package com.arcfra.aoc.model;

import java.util.Objects;
import java.util.Arrays;
import com.arcfra.aoc.model.NestedUser;
import com.arcfra.aoc.model.UserRolePlatform;
import com.arcfra.aoc.model.UserRolePreset;
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
 * UserRoleNext
 */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class UserRoleNext {
  public static final String SERIALIZED_NAME_ACTIONS = "actions";
  @SerializedName(SERIALIZED_NAME_ACTIONS)
  private List<String> actions = new ArrayList<String>();

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PLATFORM = "platform";
  @SerializedName(SERIALIZED_NAME_PLATFORM)
  private UserRolePlatform platform;

  public static final String SERIALIZED_NAME_PRESET = "preset";
  @SerializedName(SERIALIZED_NAME_PRESET)
  private UserRolePreset preset;

  public static final String SERIALIZED_NAME_USERS = "users";
  @SerializedName(SERIALIZED_NAME_USERS)
  private List<NestedUser> users = null;

  public UserRoleNext() { 
  }

  public UserRoleNext actions(List<String> actions) {
    
    this.actions = actions;
    return this;
  }

  public UserRoleNext addActionsItem(String actionsItem) {
    this.actions.add(actionsItem);
    return this;
  }

   /**
   * Get actions
   * @return actions
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<String> getActions() {
    return actions;
  }


  public void setActions(List<String> actions) {
    this.actions = actions;
  }


  public UserRoleNext id(String id) {
    
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


  public UserRoleNext name(String name) {
    
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


  public UserRoleNext platform(UserRolePlatform platform) {
    
    this.platform = platform;
    return this;
  }

   /**
   * Get platform
   * @return platform
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public UserRolePlatform getPlatform() {
    return platform;
  }


  public void setPlatform(UserRolePlatform platform) {
    this.platform = platform;
  }


  public UserRoleNext preset(UserRolePreset preset) {
    
    this.preset = preset;
    return this;
  }

   /**
   * Get preset
   * @return preset
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UserRolePreset getPreset() {
    return preset;
  }


  public void setPreset(UserRolePreset preset) {
    this.preset = preset;
  }


  public UserRoleNext users(List<NestedUser> users) {
    
    this.users = users;
    return this;
  }

  public UserRoleNext addUsersItem(NestedUser usersItem) {
    if (this.users == null) {
      this.users = new ArrayList<NestedUser>();
    }
    this.users.add(usersItem);
    return this;
  }

   /**
   * Get users
   * @return users
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<NestedUser> getUsers() {
    return users;
  }


  public void setUsers(List<NestedUser> users) {
    this.users = users;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserRoleNext userRoleNext = (UserRoleNext) o;
    return Objects.equals(this.actions, userRoleNext.actions) &&
        Objects.equals(this.id, userRoleNext.id) &&
        Objects.equals(this.name, userRoleNext.name) &&
        Objects.equals(this.platform, userRoleNext.platform) &&
        Objects.equals(this.preset, userRoleNext.preset) &&
        Objects.equals(this.users, userRoleNext.users);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(actions, id, name, platform, preset, users);
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
    sb.append("class UserRoleNext {\n");
    sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
    sb.append("    preset: ").append(toIndentedString(preset)).append("\n");
    sb.append("    users: ").append(toIndentedString(users)).append("\n");
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

