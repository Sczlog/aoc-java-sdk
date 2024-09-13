package com.arcfra.aoc.model;

import java.util.Objects;
import java.util.Arrays;
import com.arcfra.aoc.model.ClusterWhereInput;
import com.arcfra.aoc.model.ContentLibraryImageWhereInput;
import com.arcfra.aoc.model.ContentLibraryVmTemplateWhereInput;
import com.arcfra.aoc.model.DatacenterWhereInput;
import com.arcfra.aoc.model.ElfImageWhereInput;
import com.arcfra.aoc.model.GpuDeviceWhereInput;
import com.arcfra.aoc.model.HostWhereInput;
import com.arcfra.aoc.model.IscsiLunWhereInput;
import com.arcfra.aoc.model.IscsiTargetWhereInput;
import com.arcfra.aoc.model.NicWhereInput;
import com.arcfra.aoc.model.VdsWhereInput;
import com.arcfra.aoc.model.VlanWhereInput;
import com.arcfra.aoc.model.VmSnapshotWhereInput;
import com.arcfra.aoc.model.VmTemplateWhereInput;
import com.arcfra.aoc.model.VmVolumeSnapshotWhereInput;
import com.arcfra.aoc.model.VmVolumeWhereInput;
import com.arcfra.aoc.model.VmWhereInput;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * AddLabelsToResourcesParamsData
 */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class AddLabelsToResourcesParamsData {
  public static final String SERIALIZED_NAME_GPU_DEVICES = "gpu_devices";
  @SerializedName(SERIALIZED_NAME_GPU_DEVICES)
  private GpuDeviceWhereInput gpuDevices;

  public static final String SERIALIZED_NAME_CONTENT_LIBRARY_VM_TEMPLATES = "content_library_vm_templates";
  @SerializedName(SERIALIZED_NAME_CONTENT_LIBRARY_VM_TEMPLATES)
  private ContentLibraryVmTemplateWhereInput contentLibraryVmTemplates;

  public static final String SERIALIZED_NAME_CONTENT_LIBRARY_IMAGES = "content_library_images";
  @SerializedName(SERIALIZED_NAME_CONTENT_LIBRARY_IMAGES)
  private ContentLibraryImageWhereInput contentLibraryImages;

  public static final String SERIALIZED_NAME_VMS = "vms";
  @SerializedName(SERIALIZED_NAME_VMS)
  private VmWhereInput vms;

  public static final String SERIALIZED_NAME_VM_VOLUME_SNAPSHOTS = "vm_volume_snapshots";
  @SerializedName(SERIALIZED_NAME_VM_VOLUME_SNAPSHOTS)
  private VmVolumeSnapshotWhereInput vmVolumeSnapshots;

  public static final String SERIALIZED_NAME_VM_VOLUMES = "vm_volumes";
  @SerializedName(SERIALIZED_NAME_VM_VOLUMES)
  private VmVolumeWhereInput vmVolumes;

  public static final String SERIALIZED_NAME_VM_TEMPLATES = "vm_templates";
  @SerializedName(SERIALIZED_NAME_VM_TEMPLATES)
  private VmTemplateWhereInput vmTemplates;

  public static final String SERIALIZED_NAME_VM_SNAPSHOTS = "vm_snapshots";
  @SerializedName(SERIALIZED_NAME_VM_SNAPSHOTS)
  private VmSnapshotWhereInput vmSnapshots;

  public static final String SERIALIZED_NAME_VLANS = "vlans";
  @SerializedName(SERIALIZED_NAME_VLANS)
  private VlanWhereInput vlans;

  public static final String SERIALIZED_NAME_VDSES = "vdses";
  @SerializedName(SERIALIZED_NAME_VDSES)
  private VdsWhereInput vdses;

  public static final String SERIALIZED_NAME_NICS = "nics";
  @SerializedName(SERIALIZED_NAME_NICS)
  private NicWhereInput nics;

  public static final String SERIALIZED_NAME_ISCSI_TARGETS = "iscsi_targets";
  @SerializedName(SERIALIZED_NAME_ISCSI_TARGETS)
  private IscsiTargetWhereInput iscsiTargets;

  public static final String SERIALIZED_NAME_ISCSI_LUNS = "iscsi_luns";
  @SerializedName(SERIALIZED_NAME_ISCSI_LUNS)
  private IscsiLunWhereInput iscsiLuns;

  public static final String SERIALIZED_NAME_HOSTS = "hosts";
  @SerializedName(SERIALIZED_NAME_HOSTS)
  private HostWhereInput hosts;

  public static final String SERIALIZED_NAME_ELF_IMAGES = "elf_images";
  @SerializedName(SERIALIZED_NAME_ELF_IMAGES)
  private ElfImageWhereInput elfImages;

  public static final String SERIALIZED_NAME_DATACENTERS = "datacenters";
  @SerializedName(SERIALIZED_NAME_DATACENTERS)
  private DatacenterWhereInput datacenters;

  public static final String SERIALIZED_NAME_CLUSTERS = "clusters";
  @SerializedName(SERIALIZED_NAME_CLUSTERS)
  private ClusterWhereInput clusters;

  public AddLabelsToResourcesParamsData() { 
  }

  public AddLabelsToResourcesParamsData gpuDevices(GpuDeviceWhereInput gpuDevices) {
    
    this.gpuDevices = gpuDevices;
    return this;
  }

   /**
   * Get gpuDevices
   * @return gpuDevices
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GpuDeviceWhereInput getGpuDevices() {
    return gpuDevices;
  }


  public void setGpuDevices(GpuDeviceWhereInput gpuDevices) {
    this.gpuDevices = gpuDevices;
  }


  public AddLabelsToResourcesParamsData contentLibraryVmTemplates(ContentLibraryVmTemplateWhereInput contentLibraryVmTemplates) {
    
    this.contentLibraryVmTemplates = contentLibraryVmTemplates;
    return this;
  }

   /**
   * Get contentLibraryVmTemplates
   * @return contentLibraryVmTemplates
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ContentLibraryVmTemplateWhereInput getContentLibraryVmTemplates() {
    return contentLibraryVmTemplates;
  }


  public void setContentLibraryVmTemplates(ContentLibraryVmTemplateWhereInput contentLibraryVmTemplates) {
    this.contentLibraryVmTemplates = contentLibraryVmTemplates;
  }


  public AddLabelsToResourcesParamsData contentLibraryImages(ContentLibraryImageWhereInput contentLibraryImages) {
    
    this.contentLibraryImages = contentLibraryImages;
    return this;
  }

   /**
   * Get contentLibraryImages
   * @return contentLibraryImages
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ContentLibraryImageWhereInput getContentLibraryImages() {
    return contentLibraryImages;
  }


  public void setContentLibraryImages(ContentLibraryImageWhereInput contentLibraryImages) {
    this.contentLibraryImages = contentLibraryImages;
  }


  public AddLabelsToResourcesParamsData vms(VmWhereInput vms) {
    
    this.vms = vms;
    return this;
  }

   /**
   * Get vms
   * @return vms
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VmWhereInput getVms() {
    return vms;
  }


  public void setVms(VmWhereInput vms) {
    this.vms = vms;
  }


  public AddLabelsToResourcesParamsData vmVolumeSnapshots(VmVolumeSnapshotWhereInput vmVolumeSnapshots) {
    
    this.vmVolumeSnapshots = vmVolumeSnapshots;
    return this;
  }

   /**
   * Get vmVolumeSnapshots
   * @return vmVolumeSnapshots
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VmVolumeSnapshotWhereInput getVmVolumeSnapshots() {
    return vmVolumeSnapshots;
  }


  public void setVmVolumeSnapshots(VmVolumeSnapshotWhereInput vmVolumeSnapshots) {
    this.vmVolumeSnapshots = vmVolumeSnapshots;
  }


  public AddLabelsToResourcesParamsData vmVolumes(VmVolumeWhereInput vmVolumes) {
    
    this.vmVolumes = vmVolumes;
    return this;
  }

   /**
   * Get vmVolumes
   * @return vmVolumes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VmVolumeWhereInput getVmVolumes() {
    return vmVolumes;
  }


  public void setVmVolumes(VmVolumeWhereInput vmVolumes) {
    this.vmVolumes = vmVolumes;
  }


  public AddLabelsToResourcesParamsData vmTemplates(VmTemplateWhereInput vmTemplates) {
    
    this.vmTemplates = vmTemplates;
    return this;
  }

   /**
   * Get vmTemplates
   * @return vmTemplates
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VmTemplateWhereInput getVmTemplates() {
    return vmTemplates;
  }


  public void setVmTemplates(VmTemplateWhereInput vmTemplates) {
    this.vmTemplates = vmTemplates;
  }


  public AddLabelsToResourcesParamsData vmSnapshots(VmSnapshotWhereInput vmSnapshots) {
    
    this.vmSnapshots = vmSnapshots;
    return this;
  }

   /**
   * Get vmSnapshots
   * @return vmSnapshots
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VmSnapshotWhereInput getVmSnapshots() {
    return vmSnapshots;
  }


  public void setVmSnapshots(VmSnapshotWhereInput vmSnapshots) {
    this.vmSnapshots = vmSnapshots;
  }


  public AddLabelsToResourcesParamsData vlans(VlanWhereInput vlans) {
    
    this.vlans = vlans;
    return this;
  }

   /**
   * Get vlans
   * @return vlans
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VlanWhereInput getVlans() {
    return vlans;
  }


  public void setVlans(VlanWhereInput vlans) {
    this.vlans = vlans;
  }


  public AddLabelsToResourcesParamsData vdses(VdsWhereInput vdses) {
    
    this.vdses = vdses;
    return this;
  }

   /**
   * Get vdses
   * @return vdses
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VdsWhereInput getVdses() {
    return vdses;
  }


  public void setVdses(VdsWhereInput vdses) {
    this.vdses = vdses;
  }


  public AddLabelsToResourcesParamsData nics(NicWhereInput nics) {
    
    this.nics = nics;
    return this;
  }

   /**
   * Get nics
   * @return nics
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public NicWhereInput getNics() {
    return nics;
  }


  public void setNics(NicWhereInput nics) {
    this.nics = nics;
  }


  public AddLabelsToResourcesParamsData iscsiTargets(IscsiTargetWhereInput iscsiTargets) {
    
    this.iscsiTargets = iscsiTargets;
    return this;
  }

   /**
   * Get iscsiTargets
   * @return iscsiTargets
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public IscsiTargetWhereInput getIscsiTargets() {
    return iscsiTargets;
  }


  public void setIscsiTargets(IscsiTargetWhereInput iscsiTargets) {
    this.iscsiTargets = iscsiTargets;
  }


  public AddLabelsToResourcesParamsData iscsiLuns(IscsiLunWhereInput iscsiLuns) {
    
    this.iscsiLuns = iscsiLuns;
    return this;
  }

   /**
   * Get iscsiLuns
   * @return iscsiLuns
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public IscsiLunWhereInput getIscsiLuns() {
    return iscsiLuns;
  }


  public void setIscsiLuns(IscsiLunWhereInput iscsiLuns) {
    this.iscsiLuns = iscsiLuns;
  }


  public AddLabelsToResourcesParamsData hosts(HostWhereInput hosts) {
    
    this.hosts = hosts;
    return this;
  }

   /**
   * Get hosts
   * @return hosts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public HostWhereInput getHosts() {
    return hosts;
  }


  public void setHosts(HostWhereInput hosts) {
    this.hosts = hosts;
  }


  public AddLabelsToResourcesParamsData elfImages(ElfImageWhereInput elfImages) {
    
    this.elfImages = elfImages;
    return this;
  }

   /**
   * Get elfImages
   * @return elfImages
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ElfImageWhereInput getElfImages() {
    return elfImages;
  }


  public void setElfImages(ElfImageWhereInput elfImages) {
    this.elfImages = elfImages;
  }


  public AddLabelsToResourcesParamsData datacenters(DatacenterWhereInput datacenters) {
    
    this.datacenters = datacenters;
    return this;
  }

   /**
   * Get datacenters
   * @return datacenters
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DatacenterWhereInput getDatacenters() {
    return datacenters;
  }


  public void setDatacenters(DatacenterWhereInput datacenters) {
    this.datacenters = datacenters;
  }


  public AddLabelsToResourcesParamsData clusters(ClusterWhereInput clusters) {
    
    this.clusters = clusters;
    return this;
  }

   /**
   * Get clusters
   * @return clusters
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ClusterWhereInput getClusters() {
    return clusters;
  }


  public void setClusters(ClusterWhereInput clusters) {
    this.clusters = clusters;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddLabelsToResourcesParamsData addLabelsToResourcesParamsData = (AddLabelsToResourcesParamsData) o;
    return Objects.equals(this.gpuDevices, addLabelsToResourcesParamsData.gpuDevices) &&
        Objects.equals(this.contentLibraryVmTemplates, addLabelsToResourcesParamsData.contentLibraryVmTemplates) &&
        Objects.equals(this.contentLibraryImages, addLabelsToResourcesParamsData.contentLibraryImages) &&
        Objects.equals(this.vms, addLabelsToResourcesParamsData.vms) &&
        Objects.equals(this.vmVolumeSnapshots, addLabelsToResourcesParamsData.vmVolumeSnapshots) &&
        Objects.equals(this.vmVolumes, addLabelsToResourcesParamsData.vmVolumes) &&
        Objects.equals(this.vmTemplates, addLabelsToResourcesParamsData.vmTemplates) &&
        Objects.equals(this.vmSnapshots, addLabelsToResourcesParamsData.vmSnapshots) &&
        Objects.equals(this.vlans, addLabelsToResourcesParamsData.vlans) &&
        Objects.equals(this.vdses, addLabelsToResourcesParamsData.vdses) &&
        Objects.equals(this.nics, addLabelsToResourcesParamsData.nics) &&
        Objects.equals(this.iscsiTargets, addLabelsToResourcesParamsData.iscsiTargets) &&
        Objects.equals(this.iscsiLuns, addLabelsToResourcesParamsData.iscsiLuns) &&
        Objects.equals(this.hosts, addLabelsToResourcesParamsData.hosts) &&
        Objects.equals(this.elfImages, addLabelsToResourcesParamsData.elfImages) &&
        Objects.equals(this.datacenters, addLabelsToResourcesParamsData.datacenters) &&
        Objects.equals(this.clusters, addLabelsToResourcesParamsData.clusters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gpuDevices, contentLibraryVmTemplates, contentLibraryImages, vms, vmVolumeSnapshots, vmVolumes, vmTemplates, vmSnapshots, vlans, vdses, nics, iscsiTargets, iscsiLuns, hosts, elfImages, datacenters, clusters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddLabelsToResourcesParamsData {\n");
    sb.append("    gpuDevices: ").append(toIndentedString(gpuDevices)).append("\n");
    sb.append("    contentLibraryVmTemplates: ").append(toIndentedString(contentLibraryVmTemplates)).append("\n");
    sb.append("    contentLibraryImages: ").append(toIndentedString(contentLibraryImages)).append("\n");
    sb.append("    vms: ").append(toIndentedString(vms)).append("\n");
    sb.append("    vmVolumeSnapshots: ").append(toIndentedString(vmVolumeSnapshots)).append("\n");
    sb.append("    vmVolumes: ").append(toIndentedString(vmVolumes)).append("\n");
    sb.append("    vmTemplates: ").append(toIndentedString(vmTemplates)).append("\n");
    sb.append("    vmSnapshots: ").append(toIndentedString(vmSnapshots)).append("\n");
    sb.append("    vlans: ").append(toIndentedString(vlans)).append("\n");
    sb.append("    vdses: ").append(toIndentedString(vdses)).append("\n");
    sb.append("    nics: ").append(toIndentedString(nics)).append("\n");
    sb.append("    iscsiTargets: ").append(toIndentedString(iscsiTargets)).append("\n");
    sb.append("    iscsiLuns: ").append(toIndentedString(iscsiLuns)).append("\n");
    sb.append("    hosts: ").append(toIndentedString(hosts)).append("\n");
    sb.append("    elfImages: ").append(toIndentedString(elfImages)).append("\n");
    sb.append("    datacenters: ").append(toIndentedString(datacenters)).append("\n");
    sb.append("    clusters: ").append(toIndentedString(clusters)).append("\n");
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

