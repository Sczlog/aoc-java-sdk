package com.arcfra.aoc.model;

import java.util.Objects;
import java.util.Arrays;
import com.arcfra.aoc.model.NestedCluster;
import com.arcfra.aoc.model.NestedContentLibraryImage;
import com.arcfra.aoc.model.NestedContentLibraryVmTemplate;
import com.arcfra.aoc.model.NestedDatacenter;
import com.arcfra.aoc.model.NestedElfImage;
import com.arcfra.aoc.model.NestedGpuDevice;
import com.arcfra.aoc.model.NestedHost;
import com.arcfra.aoc.model.NestedIscsiLun;
import com.arcfra.aoc.model.NestedIscsiTarget;
import com.arcfra.aoc.model.NestedNic;
import com.arcfra.aoc.model.NestedVds;
import com.arcfra.aoc.model.NestedVlan;
import com.arcfra.aoc.model.NestedVm;
import com.arcfra.aoc.model.NestedVmSnapshot;
import com.arcfra.aoc.model.NestedVmTemplate;
import com.arcfra.aoc.model.NestedVmVolume;
import com.arcfra.aoc.model.NestedVmVolumeSnapshot;
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
 * Label
 */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class Label {
  public static final String SERIALIZED_NAME_CLUSTER_NUM = "cluster_num";
  @SerializedName(SERIALIZED_NAME_CLUSTER_NUM)
  private Integer clusterNum;

  public static final String SERIALIZED_NAME_CLUSTERS = "clusters";
  @SerializedName(SERIALIZED_NAME_CLUSTERS)
  private List<NestedCluster> clusters = null;

  public static final String SERIALIZED_NAME_CONTENT_LIBRARY_IMAGE_NUM = "content_library_image_num";
  @SerializedName(SERIALIZED_NAME_CONTENT_LIBRARY_IMAGE_NUM)
  private Integer contentLibraryImageNum;

  public static final String SERIALIZED_NAME_CONTENT_LIBRARY_IMAGES = "content_library_images";
  @SerializedName(SERIALIZED_NAME_CONTENT_LIBRARY_IMAGES)
  private List<NestedContentLibraryImage> contentLibraryImages = null;

  public static final String SERIALIZED_NAME_CONTENT_LIBRARY_VM_TEMPLATE_NUM = "content_library_vm_template_num";
  @SerializedName(SERIALIZED_NAME_CONTENT_LIBRARY_VM_TEMPLATE_NUM)
  private Integer contentLibraryVmTemplateNum;

  public static final String SERIALIZED_NAME_CONTENT_LIBRARY_VM_TEMPLATES = "content_library_vm_templates";
  @SerializedName(SERIALIZED_NAME_CONTENT_LIBRARY_VM_TEMPLATES)
  private List<NestedContentLibraryVmTemplate> contentLibraryVmTemplates = null;

  public static final String SERIALIZED_NAME_CREATED_AT = "createdAt";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private String createdAt;

  public static final String SERIALIZED_NAME_DATACENTER_NUM = "datacenter_num";
  @SerializedName(SERIALIZED_NAME_DATACENTER_NUM)
  private Integer datacenterNum;

  public static final String SERIALIZED_NAME_DATACENTERS = "datacenters";
  @SerializedName(SERIALIZED_NAME_DATACENTERS)
  private List<NestedDatacenter> datacenters = null;

  public static final String SERIALIZED_NAME_DISK_NUM = "disk_num";
  @SerializedName(SERIALIZED_NAME_DISK_NUM)
  private Integer diskNum;

  public static final String SERIALIZED_NAME_ELF_IMAGE_NUM = "elf_image_num";
  @SerializedName(SERIALIZED_NAME_ELF_IMAGE_NUM)
  private Integer elfImageNum;

  public static final String SERIALIZED_NAME_ELF_IMAGES = "elf_images";
  @SerializedName(SERIALIZED_NAME_ELF_IMAGES)
  private List<NestedElfImage> elfImages = null;

  public static final String SERIALIZED_NAME_GPU_DEVICE_NUM = "gpu_device_num";
  @SerializedName(SERIALIZED_NAME_GPU_DEVICE_NUM)
  private Integer gpuDeviceNum;

  public static final String SERIALIZED_NAME_GPU_DEVICES = "gpu_devices";
  @SerializedName(SERIALIZED_NAME_GPU_DEVICES)
  private List<NestedGpuDevice> gpuDevices = null;

  public static final String SERIALIZED_NAME_HOST_NUM = "host_num";
  @SerializedName(SERIALIZED_NAME_HOST_NUM)
  private Integer hostNum;

  public static final String SERIALIZED_NAME_HOSTS = "hosts";
  @SerializedName(SERIALIZED_NAME_HOSTS)
  private List<NestedHost> hosts = null;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_ISCSI_LUN_NUM = "iscsi_lun_num";
  @SerializedName(SERIALIZED_NAME_ISCSI_LUN_NUM)
  private Integer iscsiLunNum;

  public static final String SERIALIZED_NAME_ISCSI_LUN_SNAPSHOT_NUM = "iscsi_lun_snapshot_num";
  @SerializedName(SERIALIZED_NAME_ISCSI_LUN_SNAPSHOT_NUM)
  private Integer iscsiLunSnapshotNum;

  public static final String SERIALIZED_NAME_ISCSI_LUNS = "iscsi_luns";
  @SerializedName(SERIALIZED_NAME_ISCSI_LUNS)
  private List<NestedIscsiLun> iscsiLuns = null;

  public static final String SERIALIZED_NAME_ISCSI_TARGET_NUM = "iscsi_target_num";
  @SerializedName(SERIALIZED_NAME_ISCSI_TARGET_NUM)
  private Integer iscsiTargetNum;

  public static final String SERIALIZED_NAME_ISCSI_TARGETS = "iscsi_targets";
  @SerializedName(SERIALIZED_NAME_ISCSI_TARGETS)
  private List<NestedIscsiTarget> iscsiTargets = null;

  public static final String SERIALIZED_NAME_KEY = "key";
  @SerializedName(SERIALIZED_NAME_KEY)
  private String key;

  public static final String SERIALIZED_NAME_NIC_NUM = "nic_num";
  @SerializedName(SERIALIZED_NAME_NIC_NUM)
  private Integer nicNum;

  public static final String SERIALIZED_NAME_NICS = "nics";
  @SerializedName(SERIALIZED_NAME_NICS)
  private List<NestedNic> nics = null;

  public static final String SERIALIZED_NAME_SYSTEM_VLAN_NUM = "system_vlan_num";
  @SerializedName(SERIALIZED_NAME_SYSTEM_VLAN_NUM)
  private Integer systemVlanNum;

  public static final String SERIALIZED_NAME_TOTAL_NUM = "total_num";
  @SerializedName(SERIALIZED_NAME_TOTAL_NUM)
  private Integer totalNum;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private String value;

  public static final String SERIALIZED_NAME_VDS_NUM = "vds_num";
  @SerializedName(SERIALIZED_NAME_VDS_NUM)
  private Integer vdsNum;

  public static final String SERIALIZED_NAME_VDSES = "vdses";
  @SerializedName(SERIALIZED_NAME_VDSES)
  private List<NestedVds> vdses = null;

  public static final String SERIALIZED_NAME_VLANS = "vlans";
  @SerializedName(SERIALIZED_NAME_VLANS)
  private List<NestedVlan> vlans = null;

  public static final String SERIALIZED_NAME_VM_NUM = "vm_num";
  @SerializedName(SERIALIZED_NAME_VM_NUM)
  private Integer vmNum;

  public static final String SERIALIZED_NAME_VM_SNAPSHOT_NUM = "vm_snapshot_num";
  @SerializedName(SERIALIZED_NAME_VM_SNAPSHOT_NUM)
  private Integer vmSnapshotNum;

  public static final String SERIALIZED_NAME_VM_SNAPSHOTS = "vm_snapshots";
  @SerializedName(SERIALIZED_NAME_VM_SNAPSHOTS)
  private List<NestedVmSnapshot> vmSnapshots = null;

  public static final String SERIALIZED_NAME_VM_TEMPLATE_NUM = "vm_template_num";
  @SerializedName(SERIALIZED_NAME_VM_TEMPLATE_NUM)
  private Integer vmTemplateNum;

  public static final String SERIALIZED_NAME_VM_TEMPLATES = "vm_templates";
  @SerializedName(SERIALIZED_NAME_VM_TEMPLATES)
  private List<NestedVmTemplate> vmTemplates = null;

  public static final String SERIALIZED_NAME_VM_VLAN_NUM = "vm_vlan_num";
  @SerializedName(SERIALIZED_NAME_VM_VLAN_NUM)
  private Integer vmVlanNum;

  public static final String SERIALIZED_NAME_VM_VOLUME_NUM = "vm_volume_num";
  @SerializedName(SERIALIZED_NAME_VM_VOLUME_NUM)
  private Integer vmVolumeNum;

  public static final String SERIALIZED_NAME_VM_VOLUME_SNAPSHOT_NUM = "vm_volume_snapshot_num";
  @SerializedName(SERIALIZED_NAME_VM_VOLUME_SNAPSHOT_NUM)
  private Integer vmVolumeSnapshotNum;

  public static final String SERIALIZED_NAME_VM_VOLUME_SNAPSHOTS = "vm_volume_snapshots";
  @SerializedName(SERIALIZED_NAME_VM_VOLUME_SNAPSHOTS)
  private List<NestedVmVolumeSnapshot> vmVolumeSnapshots = null;

  public static final String SERIALIZED_NAME_VM_VOLUMES = "vm_volumes";
  @SerializedName(SERIALIZED_NAME_VM_VOLUMES)
  private List<NestedVmVolume> vmVolumes = null;

  public static final String SERIALIZED_NAME_VMS = "vms";
  @SerializedName(SERIALIZED_NAME_VMS)
  private List<NestedVm> vms = null;

  public Label() { 
  }

  public Label clusterNum(Integer clusterNum) {
    
    this.clusterNum = clusterNum;
    return this;
  }

   /**
   * Get clusterNum
   * @return clusterNum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getClusterNum() {
    return clusterNum;
  }


  public void setClusterNum(Integer clusterNum) {
    this.clusterNum = clusterNum;
  }


  public Label clusters(List<NestedCluster> clusters) {
    
    this.clusters = clusters;
    return this;
  }

  public Label addClustersItem(NestedCluster clustersItem) {
    if (this.clusters == null) {
      this.clusters = new ArrayList<NestedCluster>();
    }
    this.clusters.add(clustersItem);
    return this;
  }

   /**
   * Get clusters
   * @return clusters
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<NestedCluster> getClusters() {
    return clusters;
  }


  public void setClusters(List<NestedCluster> clusters) {
    this.clusters = clusters;
  }


  public Label contentLibraryImageNum(Integer contentLibraryImageNum) {
    
    this.contentLibraryImageNum = contentLibraryImageNum;
    return this;
  }

   /**
   * Get contentLibraryImageNum
   * @return contentLibraryImageNum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getContentLibraryImageNum() {
    return contentLibraryImageNum;
  }


  public void setContentLibraryImageNum(Integer contentLibraryImageNum) {
    this.contentLibraryImageNum = contentLibraryImageNum;
  }


  public Label contentLibraryImages(List<NestedContentLibraryImage> contentLibraryImages) {
    
    this.contentLibraryImages = contentLibraryImages;
    return this;
  }

  public Label addContentLibraryImagesItem(NestedContentLibraryImage contentLibraryImagesItem) {
    if (this.contentLibraryImages == null) {
      this.contentLibraryImages = new ArrayList<NestedContentLibraryImage>();
    }
    this.contentLibraryImages.add(contentLibraryImagesItem);
    return this;
  }

   /**
   * Get contentLibraryImages
   * @return contentLibraryImages
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<NestedContentLibraryImage> getContentLibraryImages() {
    return contentLibraryImages;
  }


  public void setContentLibraryImages(List<NestedContentLibraryImage> contentLibraryImages) {
    this.contentLibraryImages = contentLibraryImages;
  }


  public Label contentLibraryVmTemplateNum(Integer contentLibraryVmTemplateNum) {
    
    this.contentLibraryVmTemplateNum = contentLibraryVmTemplateNum;
    return this;
  }

   /**
   * Get contentLibraryVmTemplateNum
   * @return contentLibraryVmTemplateNum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getContentLibraryVmTemplateNum() {
    return contentLibraryVmTemplateNum;
  }


  public void setContentLibraryVmTemplateNum(Integer contentLibraryVmTemplateNum) {
    this.contentLibraryVmTemplateNum = contentLibraryVmTemplateNum;
  }


  public Label contentLibraryVmTemplates(List<NestedContentLibraryVmTemplate> contentLibraryVmTemplates) {
    
    this.contentLibraryVmTemplates = contentLibraryVmTemplates;
    return this;
  }

  public Label addContentLibraryVmTemplatesItem(NestedContentLibraryVmTemplate contentLibraryVmTemplatesItem) {
    if (this.contentLibraryVmTemplates == null) {
      this.contentLibraryVmTemplates = new ArrayList<NestedContentLibraryVmTemplate>();
    }
    this.contentLibraryVmTemplates.add(contentLibraryVmTemplatesItem);
    return this;
  }

   /**
   * Get contentLibraryVmTemplates
   * @return contentLibraryVmTemplates
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<NestedContentLibraryVmTemplate> getContentLibraryVmTemplates() {
    return contentLibraryVmTemplates;
  }


  public void setContentLibraryVmTemplates(List<NestedContentLibraryVmTemplate> contentLibraryVmTemplates) {
    this.contentLibraryVmTemplates = contentLibraryVmTemplates;
  }


  public Label createdAt(String createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }


  public Label datacenterNum(Integer datacenterNum) {
    
    this.datacenterNum = datacenterNum;
    return this;
  }

   /**
   * Get datacenterNum
   * @return datacenterNum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getDatacenterNum() {
    return datacenterNum;
  }


  public void setDatacenterNum(Integer datacenterNum) {
    this.datacenterNum = datacenterNum;
  }


  public Label datacenters(List<NestedDatacenter> datacenters) {
    
    this.datacenters = datacenters;
    return this;
  }

  public Label addDatacentersItem(NestedDatacenter datacentersItem) {
    if (this.datacenters == null) {
      this.datacenters = new ArrayList<NestedDatacenter>();
    }
    this.datacenters.add(datacentersItem);
    return this;
  }

   /**
   * Get datacenters
   * @return datacenters
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<NestedDatacenter> getDatacenters() {
    return datacenters;
  }


  public void setDatacenters(List<NestedDatacenter> datacenters) {
    this.datacenters = datacenters;
  }


  public Label diskNum(Integer diskNum) {
    
    this.diskNum = diskNum;
    return this;
  }

   /**
   * Get diskNum
   * @return diskNum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getDiskNum() {
    return diskNum;
  }


  public void setDiskNum(Integer diskNum) {
    this.diskNum = diskNum;
  }


  public Label elfImageNum(Integer elfImageNum) {
    
    this.elfImageNum = elfImageNum;
    return this;
  }

   /**
   * Get elfImageNum
   * @return elfImageNum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getElfImageNum() {
    return elfImageNum;
  }


  public void setElfImageNum(Integer elfImageNum) {
    this.elfImageNum = elfImageNum;
  }


  public Label elfImages(List<NestedElfImage> elfImages) {
    
    this.elfImages = elfImages;
    return this;
  }

  public Label addElfImagesItem(NestedElfImage elfImagesItem) {
    if (this.elfImages == null) {
      this.elfImages = new ArrayList<NestedElfImage>();
    }
    this.elfImages.add(elfImagesItem);
    return this;
  }

   /**
   * Get elfImages
   * @return elfImages
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<NestedElfImage> getElfImages() {
    return elfImages;
  }


  public void setElfImages(List<NestedElfImage> elfImages) {
    this.elfImages = elfImages;
  }


  public Label gpuDeviceNum(Integer gpuDeviceNum) {
    
    this.gpuDeviceNum = gpuDeviceNum;
    return this;
  }

   /**
   * Get gpuDeviceNum
   * @return gpuDeviceNum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getGpuDeviceNum() {
    return gpuDeviceNum;
  }


  public void setGpuDeviceNum(Integer gpuDeviceNum) {
    this.gpuDeviceNum = gpuDeviceNum;
  }


  public Label gpuDevices(List<NestedGpuDevice> gpuDevices) {
    
    this.gpuDevices = gpuDevices;
    return this;
  }

  public Label addGpuDevicesItem(NestedGpuDevice gpuDevicesItem) {
    if (this.gpuDevices == null) {
      this.gpuDevices = new ArrayList<NestedGpuDevice>();
    }
    this.gpuDevices.add(gpuDevicesItem);
    return this;
  }

   /**
   * Get gpuDevices
   * @return gpuDevices
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<NestedGpuDevice> getGpuDevices() {
    return gpuDevices;
  }


  public void setGpuDevices(List<NestedGpuDevice> gpuDevices) {
    this.gpuDevices = gpuDevices;
  }


  public Label hostNum(Integer hostNum) {
    
    this.hostNum = hostNum;
    return this;
  }

   /**
   * Get hostNum
   * @return hostNum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getHostNum() {
    return hostNum;
  }


  public void setHostNum(Integer hostNum) {
    this.hostNum = hostNum;
  }


  public Label hosts(List<NestedHost> hosts) {
    
    this.hosts = hosts;
    return this;
  }

  public Label addHostsItem(NestedHost hostsItem) {
    if (this.hosts == null) {
      this.hosts = new ArrayList<NestedHost>();
    }
    this.hosts.add(hostsItem);
    return this;
  }

   /**
   * Get hosts
   * @return hosts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<NestedHost> getHosts() {
    return hosts;
  }


  public void setHosts(List<NestedHost> hosts) {
    this.hosts = hosts;
  }


  public Label id(String id) {
    
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


  public Label iscsiLunNum(Integer iscsiLunNum) {
    
    this.iscsiLunNum = iscsiLunNum;
    return this;
  }

   /**
   * Get iscsiLunNum
   * @return iscsiLunNum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getIscsiLunNum() {
    return iscsiLunNum;
  }


  public void setIscsiLunNum(Integer iscsiLunNum) {
    this.iscsiLunNum = iscsiLunNum;
  }


  public Label iscsiLunSnapshotNum(Integer iscsiLunSnapshotNum) {
    
    this.iscsiLunSnapshotNum = iscsiLunSnapshotNum;
    return this;
  }

   /**
   * Get iscsiLunSnapshotNum
   * @return iscsiLunSnapshotNum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getIscsiLunSnapshotNum() {
    return iscsiLunSnapshotNum;
  }


  public void setIscsiLunSnapshotNum(Integer iscsiLunSnapshotNum) {
    this.iscsiLunSnapshotNum = iscsiLunSnapshotNum;
  }


  public Label iscsiLuns(List<NestedIscsiLun> iscsiLuns) {
    
    this.iscsiLuns = iscsiLuns;
    return this;
  }

  public Label addIscsiLunsItem(NestedIscsiLun iscsiLunsItem) {
    if (this.iscsiLuns == null) {
      this.iscsiLuns = new ArrayList<NestedIscsiLun>();
    }
    this.iscsiLuns.add(iscsiLunsItem);
    return this;
  }

   /**
   * Get iscsiLuns
   * @return iscsiLuns
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<NestedIscsiLun> getIscsiLuns() {
    return iscsiLuns;
  }


  public void setIscsiLuns(List<NestedIscsiLun> iscsiLuns) {
    this.iscsiLuns = iscsiLuns;
  }


  public Label iscsiTargetNum(Integer iscsiTargetNum) {
    
    this.iscsiTargetNum = iscsiTargetNum;
    return this;
  }

   /**
   * Get iscsiTargetNum
   * @return iscsiTargetNum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getIscsiTargetNum() {
    return iscsiTargetNum;
  }


  public void setIscsiTargetNum(Integer iscsiTargetNum) {
    this.iscsiTargetNum = iscsiTargetNum;
  }


  public Label iscsiTargets(List<NestedIscsiTarget> iscsiTargets) {
    
    this.iscsiTargets = iscsiTargets;
    return this;
  }

  public Label addIscsiTargetsItem(NestedIscsiTarget iscsiTargetsItem) {
    if (this.iscsiTargets == null) {
      this.iscsiTargets = new ArrayList<NestedIscsiTarget>();
    }
    this.iscsiTargets.add(iscsiTargetsItem);
    return this;
  }

   /**
   * Get iscsiTargets
   * @return iscsiTargets
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<NestedIscsiTarget> getIscsiTargets() {
    return iscsiTargets;
  }


  public void setIscsiTargets(List<NestedIscsiTarget> iscsiTargets) {
    this.iscsiTargets = iscsiTargets;
  }


  public Label key(String key) {
    
    this.key = key;
    return this;
  }

   /**
   * Get key
   * @return key
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getKey() {
    return key;
  }


  public void setKey(String key) {
    this.key = key;
  }


  public Label nicNum(Integer nicNum) {
    
    this.nicNum = nicNum;
    return this;
  }

   /**
   * Get nicNum
   * @return nicNum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getNicNum() {
    return nicNum;
  }


  public void setNicNum(Integer nicNum) {
    this.nicNum = nicNum;
  }


  public Label nics(List<NestedNic> nics) {
    
    this.nics = nics;
    return this;
  }

  public Label addNicsItem(NestedNic nicsItem) {
    if (this.nics == null) {
      this.nics = new ArrayList<NestedNic>();
    }
    this.nics.add(nicsItem);
    return this;
  }

   /**
   * Get nics
   * @return nics
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<NestedNic> getNics() {
    return nics;
  }


  public void setNics(List<NestedNic> nics) {
    this.nics = nics;
  }


  public Label systemVlanNum(Integer systemVlanNum) {
    
    this.systemVlanNum = systemVlanNum;
    return this;
  }

   /**
   * Get systemVlanNum
   * @return systemVlanNum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getSystemVlanNum() {
    return systemVlanNum;
  }


  public void setSystemVlanNum(Integer systemVlanNum) {
    this.systemVlanNum = systemVlanNum;
  }


  public Label totalNum(Integer totalNum) {
    
    this.totalNum = totalNum;
    return this;
  }

   /**
   * Get totalNum
   * @return totalNum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getTotalNum() {
    return totalNum;
  }


  public void setTotalNum(Integer totalNum) {
    this.totalNum = totalNum;
  }


  public Label value(String value) {
    
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getValue() {
    return value;
  }


  public void setValue(String value) {
    this.value = value;
  }


  public Label vdsNum(Integer vdsNum) {
    
    this.vdsNum = vdsNum;
    return this;
  }

   /**
   * Get vdsNum
   * @return vdsNum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getVdsNum() {
    return vdsNum;
  }


  public void setVdsNum(Integer vdsNum) {
    this.vdsNum = vdsNum;
  }


  public Label vdses(List<NestedVds> vdses) {
    
    this.vdses = vdses;
    return this;
  }

  public Label addVdsesItem(NestedVds vdsesItem) {
    if (this.vdses == null) {
      this.vdses = new ArrayList<NestedVds>();
    }
    this.vdses.add(vdsesItem);
    return this;
  }

   /**
   * Get vdses
   * @return vdses
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<NestedVds> getVdses() {
    return vdses;
  }


  public void setVdses(List<NestedVds> vdses) {
    this.vdses = vdses;
  }


  public Label vlans(List<NestedVlan> vlans) {
    
    this.vlans = vlans;
    return this;
  }

  public Label addVlansItem(NestedVlan vlansItem) {
    if (this.vlans == null) {
      this.vlans = new ArrayList<NestedVlan>();
    }
    this.vlans.add(vlansItem);
    return this;
  }

   /**
   * Get vlans
   * @return vlans
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<NestedVlan> getVlans() {
    return vlans;
  }


  public void setVlans(List<NestedVlan> vlans) {
    this.vlans = vlans;
  }


  public Label vmNum(Integer vmNum) {
    
    this.vmNum = vmNum;
    return this;
  }

   /**
   * Get vmNum
   * @return vmNum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getVmNum() {
    return vmNum;
  }


  public void setVmNum(Integer vmNum) {
    this.vmNum = vmNum;
  }


  public Label vmSnapshotNum(Integer vmSnapshotNum) {
    
    this.vmSnapshotNum = vmSnapshotNum;
    return this;
  }

   /**
   * Get vmSnapshotNum
   * @return vmSnapshotNum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getVmSnapshotNum() {
    return vmSnapshotNum;
  }


  public void setVmSnapshotNum(Integer vmSnapshotNum) {
    this.vmSnapshotNum = vmSnapshotNum;
  }


  public Label vmSnapshots(List<NestedVmSnapshot> vmSnapshots) {
    
    this.vmSnapshots = vmSnapshots;
    return this;
  }

  public Label addVmSnapshotsItem(NestedVmSnapshot vmSnapshotsItem) {
    if (this.vmSnapshots == null) {
      this.vmSnapshots = new ArrayList<NestedVmSnapshot>();
    }
    this.vmSnapshots.add(vmSnapshotsItem);
    return this;
  }

   /**
   * Get vmSnapshots
   * @return vmSnapshots
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<NestedVmSnapshot> getVmSnapshots() {
    return vmSnapshots;
  }


  public void setVmSnapshots(List<NestedVmSnapshot> vmSnapshots) {
    this.vmSnapshots = vmSnapshots;
  }


  public Label vmTemplateNum(Integer vmTemplateNum) {
    
    this.vmTemplateNum = vmTemplateNum;
    return this;
  }

   /**
   * Get vmTemplateNum
   * @return vmTemplateNum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getVmTemplateNum() {
    return vmTemplateNum;
  }


  public void setVmTemplateNum(Integer vmTemplateNum) {
    this.vmTemplateNum = vmTemplateNum;
  }


  public Label vmTemplates(List<NestedVmTemplate> vmTemplates) {
    
    this.vmTemplates = vmTemplates;
    return this;
  }

  public Label addVmTemplatesItem(NestedVmTemplate vmTemplatesItem) {
    if (this.vmTemplates == null) {
      this.vmTemplates = new ArrayList<NestedVmTemplate>();
    }
    this.vmTemplates.add(vmTemplatesItem);
    return this;
  }

   /**
   * Get vmTemplates
   * @return vmTemplates
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<NestedVmTemplate> getVmTemplates() {
    return vmTemplates;
  }


  public void setVmTemplates(List<NestedVmTemplate> vmTemplates) {
    this.vmTemplates = vmTemplates;
  }


  public Label vmVlanNum(Integer vmVlanNum) {
    
    this.vmVlanNum = vmVlanNum;
    return this;
  }

   /**
   * Get vmVlanNum
   * @return vmVlanNum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getVmVlanNum() {
    return vmVlanNum;
  }


  public void setVmVlanNum(Integer vmVlanNum) {
    this.vmVlanNum = vmVlanNum;
  }


  public Label vmVolumeNum(Integer vmVolumeNum) {
    
    this.vmVolumeNum = vmVolumeNum;
    return this;
  }

   /**
   * Get vmVolumeNum
   * @return vmVolumeNum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getVmVolumeNum() {
    return vmVolumeNum;
  }


  public void setVmVolumeNum(Integer vmVolumeNum) {
    this.vmVolumeNum = vmVolumeNum;
  }


  public Label vmVolumeSnapshotNum(Integer vmVolumeSnapshotNum) {
    
    this.vmVolumeSnapshotNum = vmVolumeSnapshotNum;
    return this;
  }

   /**
   * Get vmVolumeSnapshotNum
   * @return vmVolumeSnapshotNum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getVmVolumeSnapshotNum() {
    return vmVolumeSnapshotNum;
  }


  public void setVmVolumeSnapshotNum(Integer vmVolumeSnapshotNum) {
    this.vmVolumeSnapshotNum = vmVolumeSnapshotNum;
  }


  public Label vmVolumeSnapshots(List<NestedVmVolumeSnapshot> vmVolumeSnapshots) {
    
    this.vmVolumeSnapshots = vmVolumeSnapshots;
    return this;
  }

  public Label addVmVolumeSnapshotsItem(NestedVmVolumeSnapshot vmVolumeSnapshotsItem) {
    if (this.vmVolumeSnapshots == null) {
      this.vmVolumeSnapshots = new ArrayList<NestedVmVolumeSnapshot>();
    }
    this.vmVolumeSnapshots.add(vmVolumeSnapshotsItem);
    return this;
  }

   /**
   * Get vmVolumeSnapshots
   * @return vmVolumeSnapshots
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<NestedVmVolumeSnapshot> getVmVolumeSnapshots() {
    return vmVolumeSnapshots;
  }


  public void setVmVolumeSnapshots(List<NestedVmVolumeSnapshot> vmVolumeSnapshots) {
    this.vmVolumeSnapshots = vmVolumeSnapshots;
  }


  public Label vmVolumes(List<NestedVmVolume> vmVolumes) {
    
    this.vmVolumes = vmVolumes;
    return this;
  }

  public Label addVmVolumesItem(NestedVmVolume vmVolumesItem) {
    if (this.vmVolumes == null) {
      this.vmVolumes = new ArrayList<NestedVmVolume>();
    }
    this.vmVolumes.add(vmVolumesItem);
    return this;
  }

   /**
   * Get vmVolumes
   * @return vmVolumes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<NestedVmVolume> getVmVolumes() {
    return vmVolumes;
  }


  public void setVmVolumes(List<NestedVmVolume> vmVolumes) {
    this.vmVolumes = vmVolumes;
  }


  public Label vms(List<NestedVm> vms) {
    
    this.vms = vms;
    return this;
  }

  public Label addVmsItem(NestedVm vmsItem) {
    if (this.vms == null) {
      this.vms = new ArrayList<NestedVm>();
    }
    this.vms.add(vmsItem);
    return this;
  }

   /**
   * Get vms
   * @return vms
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<NestedVm> getVms() {
    return vms;
  }


  public void setVms(List<NestedVm> vms) {
    this.vms = vms;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Label label = (Label) o;
    return Objects.equals(this.clusterNum, label.clusterNum) &&
        Objects.equals(this.clusters, label.clusters) &&
        Objects.equals(this.contentLibraryImageNum, label.contentLibraryImageNum) &&
        Objects.equals(this.contentLibraryImages, label.contentLibraryImages) &&
        Objects.equals(this.contentLibraryVmTemplateNum, label.contentLibraryVmTemplateNum) &&
        Objects.equals(this.contentLibraryVmTemplates, label.contentLibraryVmTemplates) &&
        Objects.equals(this.createdAt, label.createdAt) &&
        Objects.equals(this.datacenterNum, label.datacenterNum) &&
        Objects.equals(this.datacenters, label.datacenters) &&
        Objects.equals(this.diskNum, label.diskNum) &&
        Objects.equals(this.elfImageNum, label.elfImageNum) &&
        Objects.equals(this.elfImages, label.elfImages) &&
        Objects.equals(this.gpuDeviceNum, label.gpuDeviceNum) &&
        Objects.equals(this.gpuDevices, label.gpuDevices) &&
        Objects.equals(this.hostNum, label.hostNum) &&
        Objects.equals(this.hosts, label.hosts) &&
        Objects.equals(this.id, label.id) &&
        Objects.equals(this.iscsiLunNum, label.iscsiLunNum) &&
        Objects.equals(this.iscsiLunSnapshotNum, label.iscsiLunSnapshotNum) &&
        Objects.equals(this.iscsiLuns, label.iscsiLuns) &&
        Objects.equals(this.iscsiTargetNum, label.iscsiTargetNum) &&
        Objects.equals(this.iscsiTargets, label.iscsiTargets) &&
        Objects.equals(this.key, label.key) &&
        Objects.equals(this.nicNum, label.nicNum) &&
        Objects.equals(this.nics, label.nics) &&
        Objects.equals(this.systemVlanNum, label.systemVlanNum) &&
        Objects.equals(this.totalNum, label.totalNum) &&
        Objects.equals(this.value, label.value) &&
        Objects.equals(this.vdsNum, label.vdsNum) &&
        Objects.equals(this.vdses, label.vdses) &&
        Objects.equals(this.vlans, label.vlans) &&
        Objects.equals(this.vmNum, label.vmNum) &&
        Objects.equals(this.vmSnapshotNum, label.vmSnapshotNum) &&
        Objects.equals(this.vmSnapshots, label.vmSnapshots) &&
        Objects.equals(this.vmTemplateNum, label.vmTemplateNum) &&
        Objects.equals(this.vmTemplates, label.vmTemplates) &&
        Objects.equals(this.vmVlanNum, label.vmVlanNum) &&
        Objects.equals(this.vmVolumeNum, label.vmVolumeNum) &&
        Objects.equals(this.vmVolumeSnapshotNum, label.vmVolumeSnapshotNum) &&
        Objects.equals(this.vmVolumeSnapshots, label.vmVolumeSnapshots) &&
        Objects.equals(this.vmVolumes, label.vmVolumes) &&
        Objects.equals(this.vms, label.vms);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(clusterNum, clusters, contentLibraryImageNum, contentLibraryImages, contentLibraryVmTemplateNum, contentLibraryVmTemplates, createdAt, datacenterNum, datacenters, diskNum, elfImageNum, elfImages, gpuDeviceNum, gpuDevices, hostNum, hosts, id, iscsiLunNum, iscsiLunSnapshotNum, iscsiLuns, iscsiTargetNum, iscsiTargets, key, nicNum, nics, systemVlanNum, totalNum, value, vdsNum, vdses, vlans, vmNum, vmSnapshotNum, vmSnapshots, vmTemplateNum, vmTemplates, vmVlanNum, vmVolumeNum, vmVolumeSnapshotNum, vmVolumeSnapshots, vmVolumes, vms);
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
    sb.append("class Label {\n");
    sb.append("    clusterNum: ").append(toIndentedString(clusterNum)).append("\n");
    sb.append("    clusters: ").append(toIndentedString(clusters)).append("\n");
    sb.append("    contentLibraryImageNum: ").append(toIndentedString(contentLibraryImageNum)).append("\n");
    sb.append("    contentLibraryImages: ").append(toIndentedString(contentLibraryImages)).append("\n");
    sb.append("    contentLibraryVmTemplateNum: ").append(toIndentedString(contentLibraryVmTemplateNum)).append("\n");
    sb.append("    contentLibraryVmTemplates: ").append(toIndentedString(contentLibraryVmTemplates)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    datacenterNum: ").append(toIndentedString(datacenterNum)).append("\n");
    sb.append("    datacenters: ").append(toIndentedString(datacenters)).append("\n");
    sb.append("    diskNum: ").append(toIndentedString(diskNum)).append("\n");
    sb.append("    elfImageNum: ").append(toIndentedString(elfImageNum)).append("\n");
    sb.append("    elfImages: ").append(toIndentedString(elfImages)).append("\n");
    sb.append("    gpuDeviceNum: ").append(toIndentedString(gpuDeviceNum)).append("\n");
    sb.append("    gpuDevices: ").append(toIndentedString(gpuDevices)).append("\n");
    sb.append("    hostNum: ").append(toIndentedString(hostNum)).append("\n");
    sb.append("    hosts: ").append(toIndentedString(hosts)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    iscsiLunNum: ").append(toIndentedString(iscsiLunNum)).append("\n");
    sb.append("    iscsiLunSnapshotNum: ").append(toIndentedString(iscsiLunSnapshotNum)).append("\n");
    sb.append("    iscsiLuns: ").append(toIndentedString(iscsiLuns)).append("\n");
    sb.append("    iscsiTargetNum: ").append(toIndentedString(iscsiTargetNum)).append("\n");
    sb.append("    iscsiTargets: ").append(toIndentedString(iscsiTargets)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    nicNum: ").append(toIndentedString(nicNum)).append("\n");
    sb.append("    nics: ").append(toIndentedString(nics)).append("\n");
    sb.append("    systemVlanNum: ").append(toIndentedString(systemVlanNum)).append("\n");
    sb.append("    totalNum: ").append(toIndentedString(totalNum)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    vdsNum: ").append(toIndentedString(vdsNum)).append("\n");
    sb.append("    vdses: ").append(toIndentedString(vdses)).append("\n");
    sb.append("    vlans: ").append(toIndentedString(vlans)).append("\n");
    sb.append("    vmNum: ").append(toIndentedString(vmNum)).append("\n");
    sb.append("    vmSnapshotNum: ").append(toIndentedString(vmSnapshotNum)).append("\n");
    sb.append("    vmSnapshots: ").append(toIndentedString(vmSnapshots)).append("\n");
    sb.append("    vmTemplateNum: ").append(toIndentedString(vmTemplateNum)).append("\n");
    sb.append("    vmTemplates: ").append(toIndentedString(vmTemplates)).append("\n");
    sb.append("    vmVlanNum: ").append(toIndentedString(vmVlanNum)).append("\n");
    sb.append("    vmVolumeNum: ").append(toIndentedString(vmVolumeNum)).append("\n");
    sb.append("    vmVolumeSnapshotNum: ").append(toIndentedString(vmVolumeSnapshotNum)).append("\n");
    sb.append("    vmVolumeSnapshots: ").append(toIndentedString(vmVolumeSnapshots)).append("\n");
    sb.append("    vmVolumes: ").append(toIndentedString(vmVolumes)).append("\n");
    sb.append("    vms: ").append(toIndentedString(vms)).append("\n");
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

