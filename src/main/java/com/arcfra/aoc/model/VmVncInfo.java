package com.arcfra.aoc.model;

import java.util.Objects;
import java.util.Arrays;
import com.arcfra.aoc.model.Vm;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * VmVncInfo
 */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class VmVncInfo {
  public static final String SERIALIZED_NAME_VM = "vm";
  @SerializedName(SERIALIZED_NAME_VM)
  private Vm vm;

  public static final String SERIALIZED_NAME_TERMINAL = "terminal";
  @SerializedName(SERIALIZED_NAME_TERMINAL)
  private String terminal;

  public static final String SERIALIZED_NAME_REDIRECT = "redirect";
  @SerializedName(SERIALIZED_NAME_REDIRECT)
  private String redirect;

  public static final String SERIALIZED_NAME_DIRECT = "direct";
  @SerializedName(SERIALIZED_NAME_DIRECT)
  private String direct;

  public static final String SERIALIZED_NAME_CLUSTER_IP = "cluster_ip";
  @SerializedName(SERIALIZED_NAME_CLUSTER_IP)
  private String clusterIp;

  public VmVncInfo() { 
  }

  public VmVncInfo vm(Vm vm) {
    
    this.vm = vm;
    return this;
  }

   /**
   * Get vm
   * @return vm
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Vm getVm() {
    return vm;
  }


  public void setVm(Vm vm) {
    this.vm = vm;
  }


  public VmVncInfo terminal(String terminal) {
    
    this.terminal = terminal;
    return this;
  }

   /**
   * Get terminal
   * @return terminal
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getTerminal() {
    return terminal;
  }


  public void setTerminal(String terminal) {
    this.terminal = terminal;
  }


  public VmVncInfo redirect(String redirect) {
    
    this.redirect = redirect;
    return this;
  }

   /**
   * Get redirect
   * @return redirect
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getRedirect() {
    return redirect;
  }


  public void setRedirect(String redirect) {
    this.redirect = redirect;
  }


  public VmVncInfo direct(String direct) {
    
    this.direct = direct;
    return this;
  }

   /**
   * Get direct
   * @return direct
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDirect() {
    return direct;
  }


  public void setDirect(String direct) {
    this.direct = direct;
  }


  public VmVncInfo clusterIp(String clusterIp) {
    
    this.clusterIp = clusterIp;
    return this;
  }

   /**
   * Get clusterIp
   * @return clusterIp
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getClusterIp() {
    return clusterIp;
  }


  public void setClusterIp(String clusterIp) {
    this.clusterIp = clusterIp;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VmVncInfo vmVncInfo = (VmVncInfo) o;
    return Objects.equals(this.vm, vmVncInfo.vm) &&
        Objects.equals(this.terminal, vmVncInfo.terminal) &&
        Objects.equals(this.redirect, vmVncInfo.redirect) &&
        Objects.equals(this.direct, vmVncInfo.direct) &&
        Objects.equals(this.clusterIp, vmVncInfo.clusterIp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vm, terminal, redirect, direct, clusterIp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VmVncInfo {\n");
    sb.append("    vm: ").append(toIndentedString(vm)).append("\n");
    sb.append("    terminal: ").append(toIndentedString(terminal)).append("\n");
    sb.append("    redirect: ").append(toIndentedString(redirect)).append("\n");
    sb.append("    direct: ").append(toIndentedString(direct)).append("\n");
    sb.append("    clusterIp: ").append(toIndentedString(clusterIp)).append("\n");
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

