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
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * LabelWhereInput
 */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class LabelWhereInput {
  public static final String SERIALIZED_NAME_A_N_D = "AND";
  @SerializedName(SERIALIZED_NAME_A_N_D)
  private List<LabelWhereInput> AND = null;

  public static final String SERIALIZED_NAME_N_O_T = "NOT";
  @SerializedName(SERIALIZED_NAME_N_O_T)
  private List<LabelWhereInput> NOT = null;

  public static final String SERIALIZED_NAME_O_R = "OR";
  @SerializedName(SERIALIZED_NAME_O_R)
  private List<LabelWhereInput> OR = null;

  public static final String SERIALIZED_NAME_CLUSTER_NUM = "cluster_num";
  @SerializedName(SERIALIZED_NAME_CLUSTER_NUM)
  private Integer clusterNum;

  public static final String SERIALIZED_NAME_CLUSTER_NUM_GT = "cluster_num_gt";
  @SerializedName(SERIALIZED_NAME_CLUSTER_NUM_GT)
  private Integer clusterNumGt;

  public static final String SERIALIZED_NAME_CLUSTER_NUM_GTE = "cluster_num_gte";
  @SerializedName(SERIALIZED_NAME_CLUSTER_NUM_GTE)
  private Integer clusterNumGte;

  public static final String SERIALIZED_NAME_CLUSTER_NUM_IN = "cluster_num_in";
  @SerializedName(SERIALIZED_NAME_CLUSTER_NUM_IN)
  private List<Integer> clusterNumIn = null;

  public static final String SERIALIZED_NAME_CLUSTER_NUM_LT = "cluster_num_lt";
  @SerializedName(SERIALIZED_NAME_CLUSTER_NUM_LT)
  private Integer clusterNumLt;

  public static final String SERIALIZED_NAME_CLUSTER_NUM_LTE = "cluster_num_lte";
  @SerializedName(SERIALIZED_NAME_CLUSTER_NUM_LTE)
  private Integer clusterNumLte;

  public static final String SERIALIZED_NAME_CLUSTER_NUM_NOT = "cluster_num_not";
  @SerializedName(SERIALIZED_NAME_CLUSTER_NUM_NOT)
  private Integer clusterNumNot;

  public static final String SERIALIZED_NAME_CLUSTER_NUM_NOT_IN = "cluster_num_not_in";
  @SerializedName(SERIALIZED_NAME_CLUSTER_NUM_NOT_IN)
  private List<Integer> clusterNumNotIn = null;

  public static final String SERIALIZED_NAME_CLUSTERS_EVERY = "clusters_every";
  @SerializedName(SERIALIZED_NAME_CLUSTERS_EVERY)
  private ClusterWhereInput clustersEvery;

  public static final String SERIALIZED_NAME_CLUSTERS_NONE = "clusters_none";
  @SerializedName(SERIALIZED_NAME_CLUSTERS_NONE)
  private ClusterWhereInput clustersNone;

  public static final String SERIALIZED_NAME_CLUSTERS_SOME = "clusters_some";
  @SerializedName(SERIALIZED_NAME_CLUSTERS_SOME)
  private ClusterWhereInput clustersSome;

  public static final String SERIALIZED_NAME_CONTENT_LIBRARY_IMAGE_NUM = "content_library_image_num";
  @SerializedName(SERIALIZED_NAME_CONTENT_LIBRARY_IMAGE_NUM)
  private Integer contentLibraryImageNum;

  public static final String SERIALIZED_NAME_CONTENT_LIBRARY_IMAGE_NUM_GT = "content_library_image_num_gt";
  @SerializedName(SERIALIZED_NAME_CONTENT_LIBRARY_IMAGE_NUM_GT)
  private Integer contentLibraryImageNumGt;

  public static final String SERIALIZED_NAME_CONTENT_LIBRARY_IMAGE_NUM_GTE = "content_library_image_num_gte";
  @SerializedName(SERIALIZED_NAME_CONTENT_LIBRARY_IMAGE_NUM_GTE)
  private Integer contentLibraryImageNumGte;

  public static final String SERIALIZED_NAME_CONTENT_LIBRARY_IMAGE_NUM_IN = "content_library_image_num_in";
  @SerializedName(SERIALIZED_NAME_CONTENT_LIBRARY_IMAGE_NUM_IN)
  private List<Integer> contentLibraryImageNumIn = null;

  public static final String SERIALIZED_NAME_CONTENT_LIBRARY_IMAGE_NUM_LT = "content_library_image_num_lt";
  @SerializedName(SERIALIZED_NAME_CONTENT_LIBRARY_IMAGE_NUM_LT)
  private Integer contentLibraryImageNumLt;

  public static final String SERIALIZED_NAME_CONTENT_LIBRARY_IMAGE_NUM_LTE = "content_library_image_num_lte";
  @SerializedName(SERIALIZED_NAME_CONTENT_LIBRARY_IMAGE_NUM_LTE)
  private Integer contentLibraryImageNumLte;

  public static final String SERIALIZED_NAME_CONTENT_LIBRARY_IMAGE_NUM_NOT = "content_library_image_num_not";
  @SerializedName(SERIALIZED_NAME_CONTENT_LIBRARY_IMAGE_NUM_NOT)
  private Integer contentLibraryImageNumNot;

  public static final String SERIALIZED_NAME_CONTENT_LIBRARY_IMAGE_NUM_NOT_IN = "content_library_image_num_not_in";
  @SerializedName(SERIALIZED_NAME_CONTENT_LIBRARY_IMAGE_NUM_NOT_IN)
  private List<Integer> contentLibraryImageNumNotIn = null;

  public static final String SERIALIZED_NAME_CONTENT_LIBRARY_IMAGES_EVERY = "content_library_images_every";
  @SerializedName(SERIALIZED_NAME_CONTENT_LIBRARY_IMAGES_EVERY)
  private ContentLibraryImageWhereInput contentLibraryImagesEvery;

  public static final String SERIALIZED_NAME_CONTENT_LIBRARY_IMAGES_NONE = "content_library_images_none";
  @SerializedName(SERIALIZED_NAME_CONTENT_LIBRARY_IMAGES_NONE)
  private ContentLibraryImageWhereInput contentLibraryImagesNone;

  public static final String SERIALIZED_NAME_CONTENT_LIBRARY_IMAGES_SOME = "content_library_images_some";
  @SerializedName(SERIALIZED_NAME_CONTENT_LIBRARY_IMAGES_SOME)
  private ContentLibraryImageWhereInput contentLibraryImagesSome;

  public static final String SERIALIZED_NAME_CONTENT_LIBRARY_VM_TEMPLATE_NUM = "content_library_vm_template_num";
  @SerializedName(SERIALIZED_NAME_CONTENT_LIBRARY_VM_TEMPLATE_NUM)
  private Integer contentLibraryVmTemplateNum;

  public static final String SERIALIZED_NAME_CONTENT_LIBRARY_VM_TEMPLATE_NUM_GT = "content_library_vm_template_num_gt";
  @SerializedName(SERIALIZED_NAME_CONTENT_LIBRARY_VM_TEMPLATE_NUM_GT)
  private Integer contentLibraryVmTemplateNumGt;

  public static final String SERIALIZED_NAME_CONTENT_LIBRARY_VM_TEMPLATE_NUM_GTE = "content_library_vm_template_num_gte";
  @SerializedName(SERIALIZED_NAME_CONTENT_LIBRARY_VM_TEMPLATE_NUM_GTE)
  private Integer contentLibraryVmTemplateNumGte;

  public static final String SERIALIZED_NAME_CONTENT_LIBRARY_VM_TEMPLATE_NUM_IN = "content_library_vm_template_num_in";
  @SerializedName(SERIALIZED_NAME_CONTENT_LIBRARY_VM_TEMPLATE_NUM_IN)
  private List<Integer> contentLibraryVmTemplateNumIn = null;

  public static final String SERIALIZED_NAME_CONTENT_LIBRARY_VM_TEMPLATE_NUM_LT = "content_library_vm_template_num_lt";
  @SerializedName(SERIALIZED_NAME_CONTENT_LIBRARY_VM_TEMPLATE_NUM_LT)
  private Integer contentLibraryVmTemplateNumLt;

  public static final String SERIALIZED_NAME_CONTENT_LIBRARY_VM_TEMPLATE_NUM_LTE = "content_library_vm_template_num_lte";
  @SerializedName(SERIALIZED_NAME_CONTENT_LIBRARY_VM_TEMPLATE_NUM_LTE)
  private Integer contentLibraryVmTemplateNumLte;

  public static final String SERIALIZED_NAME_CONTENT_LIBRARY_VM_TEMPLATE_NUM_NOT = "content_library_vm_template_num_not";
  @SerializedName(SERIALIZED_NAME_CONTENT_LIBRARY_VM_TEMPLATE_NUM_NOT)
  private Integer contentLibraryVmTemplateNumNot;

  public static final String SERIALIZED_NAME_CONTENT_LIBRARY_VM_TEMPLATE_NUM_NOT_IN = "content_library_vm_template_num_not_in";
  @SerializedName(SERIALIZED_NAME_CONTENT_LIBRARY_VM_TEMPLATE_NUM_NOT_IN)
  private List<Integer> contentLibraryVmTemplateNumNotIn = null;

  public static final String SERIALIZED_NAME_CONTENT_LIBRARY_VM_TEMPLATES_EVERY = "content_library_vm_templates_every";
  @SerializedName(SERIALIZED_NAME_CONTENT_LIBRARY_VM_TEMPLATES_EVERY)
  private ContentLibraryVmTemplateWhereInput contentLibraryVmTemplatesEvery;

  public static final String SERIALIZED_NAME_CONTENT_LIBRARY_VM_TEMPLATES_NONE = "content_library_vm_templates_none";
  @SerializedName(SERIALIZED_NAME_CONTENT_LIBRARY_VM_TEMPLATES_NONE)
  private ContentLibraryVmTemplateWhereInput contentLibraryVmTemplatesNone;

  public static final String SERIALIZED_NAME_CONTENT_LIBRARY_VM_TEMPLATES_SOME = "content_library_vm_templates_some";
  @SerializedName(SERIALIZED_NAME_CONTENT_LIBRARY_VM_TEMPLATES_SOME)
  private ContentLibraryVmTemplateWhereInput contentLibraryVmTemplatesSome;

  public static final String SERIALIZED_NAME_CREATED_AT = "createdAt";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private String createdAt;

  public static final String SERIALIZED_NAME_CREATED_AT_GT = "createdAt_gt";
  @SerializedName(SERIALIZED_NAME_CREATED_AT_GT)
  private String createdAtGt;

  public static final String SERIALIZED_NAME_CREATED_AT_GTE = "createdAt_gte";
  @SerializedName(SERIALIZED_NAME_CREATED_AT_GTE)
  private String createdAtGte;

  public static final String SERIALIZED_NAME_CREATED_AT_IN = "createdAt_in";
  @SerializedName(SERIALIZED_NAME_CREATED_AT_IN)
  private List<String> createdAtIn = null;

  public static final String SERIALIZED_NAME_CREATED_AT_LT = "createdAt_lt";
  @SerializedName(SERIALIZED_NAME_CREATED_AT_LT)
  private String createdAtLt;

  public static final String SERIALIZED_NAME_CREATED_AT_LTE = "createdAt_lte";
  @SerializedName(SERIALIZED_NAME_CREATED_AT_LTE)
  private String createdAtLte;

  public static final String SERIALIZED_NAME_CREATED_AT_NOT = "createdAt_not";
  @SerializedName(SERIALIZED_NAME_CREATED_AT_NOT)
  private String createdAtNot;

  public static final String SERIALIZED_NAME_CREATED_AT_NOT_IN = "createdAt_not_in";
  @SerializedName(SERIALIZED_NAME_CREATED_AT_NOT_IN)
  private List<String> createdAtNotIn = null;

  public static final String SERIALIZED_NAME_DATACENTER_NUM = "datacenter_num";
  @SerializedName(SERIALIZED_NAME_DATACENTER_NUM)
  private Integer datacenterNum;

  public static final String SERIALIZED_NAME_DATACENTER_NUM_GT = "datacenter_num_gt";
  @SerializedName(SERIALIZED_NAME_DATACENTER_NUM_GT)
  private Integer datacenterNumGt;

  public static final String SERIALIZED_NAME_DATACENTER_NUM_GTE = "datacenter_num_gte";
  @SerializedName(SERIALIZED_NAME_DATACENTER_NUM_GTE)
  private Integer datacenterNumGte;

  public static final String SERIALIZED_NAME_DATACENTER_NUM_IN = "datacenter_num_in";
  @SerializedName(SERIALIZED_NAME_DATACENTER_NUM_IN)
  private List<Integer> datacenterNumIn = null;

  public static final String SERIALIZED_NAME_DATACENTER_NUM_LT = "datacenter_num_lt";
  @SerializedName(SERIALIZED_NAME_DATACENTER_NUM_LT)
  private Integer datacenterNumLt;

  public static final String SERIALIZED_NAME_DATACENTER_NUM_LTE = "datacenter_num_lte";
  @SerializedName(SERIALIZED_NAME_DATACENTER_NUM_LTE)
  private Integer datacenterNumLte;

  public static final String SERIALIZED_NAME_DATACENTER_NUM_NOT = "datacenter_num_not";
  @SerializedName(SERIALIZED_NAME_DATACENTER_NUM_NOT)
  private Integer datacenterNumNot;

  public static final String SERIALIZED_NAME_DATACENTER_NUM_NOT_IN = "datacenter_num_not_in";
  @SerializedName(SERIALIZED_NAME_DATACENTER_NUM_NOT_IN)
  private List<Integer> datacenterNumNotIn = null;

  public static final String SERIALIZED_NAME_DATACENTERS_EVERY = "datacenters_every";
  @SerializedName(SERIALIZED_NAME_DATACENTERS_EVERY)
  private DatacenterWhereInput datacentersEvery;

  public static final String SERIALIZED_NAME_DATACENTERS_NONE = "datacenters_none";
  @SerializedName(SERIALIZED_NAME_DATACENTERS_NONE)
  private DatacenterWhereInput datacentersNone;

  public static final String SERIALIZED_NAME_DATACENTERS_SOME = "datacenters_some";
  @SerializedName(SERIALIZED_NAME_DATACENTERS_SOME)
  private DatacenterWhereInput datacentersSome;

  public static final String SERIALIZED_NAME_DISK_NUM = "disk_num";
  @SerializedName(SERIALIZED_NAME_DISK_NUM)
  private Integer diskNum;

  public static final String SERIALIZED_NAME_DISK_NUM_GT = "disk_num_gt";
  @SerializedName(SERIALIZED_NAME_DISK_NUM_GT)
  private Integer diskNumGt;

  public static final String SERIALIZED_NAME_DISK_NUM_GTE = "disk_num_gte";
  @SerializedName(SERIALIZED_NAME_DISK_NUM_GTE)
  private Integer diskNumGte;

  public static final String SERIALIZED_NAME_DISK_NUM_IN = "disk_num_in";
  @SerializedName(SERIALIZED_NAME_DISK_NUM_IN)
  private List<Integer> diskNumIn = null;

  public static final String SERIALIZED_NAME_DISK_NUM_LT = "disk_num_lt";
  @SerializedName(SERIALIZED_NAME_DISK_NUM_LT)
  private Integer diskNumLt;

  public static final String SERIALIZED_NAME_DISK_NUM_LTE = "disk_num_lte";
  @SerializedName(SERIALIZED_NAME_DISK_NUM_LTE)
  private Integer diskNumLte;

  public static final String SERIALIZED_NAME_DISK_NUM_NOT = "disk_num_not";
  @SerializedName(SERIALIZED_NAME_DISK_NUM_NOT)
  private Integer diskNumNot;

  public static final String SERIALIZED_NAME_DISK_NUM_NOT_IN = "disk_num_not_in";
  @SerializedName(SERIALIZED_NAME_DISK_NUM_NOT_IN)
  private List<Integer> diskNumNotIn = null;

  public static final String SERIALIZED_NAME_ELF_IMAGE_NUM = "elf_image_num";
  @SerializedName(SERIALIZED_NAME_ELF_IMAGE_NUM)
  private Integer elfImageNum;

  public static final String SERIALIZED_NAME_ELF_IMAGE_NUM_GT = "elf_image_num_gt";
  @SerializedName(SERIALIZED_NAME_ELF_IMAGE_NUM_GT)
  private Integer elfImageNumGt;

  public static final String SERIALIZED_NAME_ELF_IMAGE_NUM_GTE = "elf_image_num_gte";
  @SerializedName(SERIALIZED_NAME_ELF_IMAGE_NUM_GTE)
  private Integer elfImageNumGte;

  public static final String SERIALIZED_NAME_ELF_IMAGE_NUM_IN = "elf_image_num_in";
  @SerializedName(SERIALIZED_NAME_ELF_IMAGE_NUM_IN)
  private List<Integer> elfImageNumIn = null;

  public static final String SERIALIZED_NAME_ELF_IMAGE_NUM_LT = "elf_image_num_lt";
  @SerializedName(SERIALIZED_NAME_ELF_IMAGE_NUM_LT)
  private Integer elfImageNumLt;

  public static final String SERIALIZED_NAME_ELF_IMAGE_NUM_LTE = "elf_image_num_lte";
  @SerializedName(SERIALIZED_NAME_ELF_IMAGE_NUM_LTE)
  private Integer elfImageNumLte;

  public static final String SERIALIZED_NAME_ELF_IMAGE_NUM_NOT = "elf_image_num_not";
  @SerializedName(SERIALIZED_NAME_ELF_IMAGE_NUM_NOT)
  private Integer elfImageNumNot;

  public static final String SERIALIZED_NAME_ELF_IMAGE_NUM_NOT_IN = "elf_image_num_not_in";
  @SerializedName(SERIALIZED_NAME_ELF_IMAGE_NUM_NOT_IN)
  private List<Integer> elfImageNumNotIn = null;

  public static final String SERIALIZED_NAME_ELF_IMAGES_EVERY = "elf_images_every";
  @SerializedName(SERIALIZED_NAME_ELF_IMAGES_EVERY)
  private ElfImageWhereInput elfImagesEvery;

  public static final String SERIALIZED_NAME_ELF_IMAGES_NONE = "elf_images_none";
  @SerializedName(SERIALIZED_NAME_ELF_IMAGES_NONE)
  private ElfImageWhereInput elfImagesNone;

  public static final String SERIALIZED_NAME_ELF_IMAGES_SOME = "elf_images_some";
  @SerializedName(SERIALIZED_NAME_ELF_IMAGES_SOME)
  private ElfImageWhereInput elfImagesSome;

  public static final String SERIALIZED_NAME_GPU_DEVICE_NUM = "gpu_device_num";
  @SerializedName(SERIALIZED_NAME_GPU_DEVICE_NUM)
  private Integer gpuDeviceNum;

  public static final String SERIALIZED_NAME_GPU_DEVICE_NUM_GT = "gpu_device_num_gt";
  @SerializedName(SERIALIZED_NAME_GPU_DEVICE_NUM_GT)
  private Integer gpuDeviceNumGt;

  public static final String SERIALIZED_NAME_GPU_DEVICE_NUM_GTE = "gpu_device_num_gte";
  @SerializedName(SERIALIZED_NAME_GPU_DEVICE_NUM_GTE)
  private Integer gpuDeviceNumGte;

  public static final String SERIALIZED_NAME_GPU_DEVICE_NUM_IN = "gpu_device_num_in";
  @SerializedName(SERIALIZED_NAME_GPU_DEVICE_NUM_IN)
  private List<Integer> gpuDeviceNumIn = null;

  public static final String SERIALIZED_NAME_GPU_DEVICE_NUM_LT = "gpu_device_num_lt";
  @SerializedName(SERIALIZED_NAME_GPU_DEVICE_NUM_LT)
  private Integer gpuDeviceNumLt;

  public static final String SERIALIZED_NAME_GPU_DEVICE_NUM_LTE = "gpu_device_num_lte";
  @SerializedName(SERIALIZED_NAME_GPU_DEVICE_NUM_LTE)
  private Integer gpuDeviceNumLte;

  public static final String SERIALIZED_NAME_GPU_DEVICE_NUM_NOT = "gpu_device_num_not";
  @SerializedName(SERIALIZED_NAME_GPU_DEVICE_NUM_NOT)
  private Integer gpuDeviceNumNot;

  public static final String SERIALIZED_NAME_GPU_DEVICE_NUM_NOT_IN = "gpu_device_num_not_in";
  @SerializedName(SERIALIZED_NAME_GPU_DEVICE_NUM_NOT_IN)
  private List<Integer> gpuDeviceNumNotIn = null;

  public static final String SERIALIZED_NAME_GPU_DEVICES_EVERY = "gpu_devices_every";
  @SerializedName(SERIALIZED_NAME_GPU_DEVICES_EVERY)
  private GpuDeviceWhereInput gpuDevicesEvery;

  public static final String SERIALIZED_NAME_GPU_DEVICES_NONE = "gpu_devices_none";
  @SerializedName(SERIALIZED_NAME_GPU_DEVICES_NONE)
  private GpuDeviceWhereInput gpuDevicesNone;

  public static final String SERIALIZED_NAME_GPU_DEVICES_SOME = "gpu_devices_some";
  @SerializedName(SERIALIZED_NAME_GPU_DEVICES_SOME)
  private GpuDeviceWhereInput gpuDevicesSome;

  public static final String SERIALIZED_NAME_HOST_NUM = "host_num";
  @SerializedName(SERIALIZED_NAME_HOST_NUM)
  private Integer hostNum;

  public static final String SERIALIZED_NAME_HOST_NUM_GT = "host_num_gt";
  @SerializedName(SERIALIZED_NAME_HOST_NUM_GT)
  private Integer hostNumGt;

  public static final String SERIALIZED_NAME_HOST_NUM_GTE = "host_num_gte";
  @SerializedName(SERIALIZED_NAME_HOST_NUM_GTE)
  private Integer hostNumGte;

  public static final String SERIALIZED_NAME_HOST_NUM_IN = "host_num_in";
  @SerializedName(SERIALIZED_NAME_HOST_NUM_IN)
  private List<Integer> hostNumIn = null;

  public static final String SERIALIZED_NAME_HOST_NUM_LT = "host_num_lt";
  @SerializedName(SERIALIZED_NAME_HOST_NUM_LT)
  private Integer hostNumLt;

  public static final String SERIALIZED_NAME_HOST_NUM_LTE = "host_num_lte";
  @SerializedName(SERIALIZED_NAME_HOST_NUM_LTE)
  private Integer hostNumLte;

  public static final String SERIALIZED_NAME_HOST_NUM_NOT = "host_num_not";
  @SerializedName(SERIALIZED_NAME_HOST_NUM_NOT)
  private Integer hostNumNot;

  public static final String SERIALIZED_NAME_HOST_NUM_NOT_IN = "host_num_not_in";
  @SerializedName(SERIALIZED_NAME_HOST_NUM_NOT_IN)
  private List<Integer> hostNumNotIn = null;

  public static final String SERIALIZED_NAME_HOSTS_EVERY = "hosts_every";
  @SerializedName(SERIALIZED_NAME_HOSTS_EVERY)
  private HostWhereInput hostsEvery;

  public static final String SERIALIZED_NAME_HOSTS_NONE = "hosts_none";
  @SerializedName(SERIALIZED_NAME_HOSTS_NONE)
  private HostWhereInput hostsNone;

  public static final String SERIALIZED_NAME_HOSTS_SOME = "hosts_some";
  @SerializedName(SERIALIZED_NAME_HOSTS_SOME)
  private HostWhereInput hostsSome;

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

  public static final String SERIALIZED_NAME_ISCSI_LUN_NUM = "iscsi_lun_num";
  @SerializedName(SERIALIZED_NAME_ISCSI_LUN_NUM)
  private Integer iscsiLunNum;

  public static final String SERIALIZED_NAME_ISCSI_LUN_NUM_GT = "iscsi_lun_num_gt";
  @SerializedName(SERIALIZED_NAME_ISCSI_LUN_NUM_GT)
  private Integer iscsiLunNumGt;

  public static final String SERIALIZED_NAME_ISCSI_LUN_NUM_GTE = "iscsi_lun_num_gte";
  @SerializedName(SERIALIZED_NAME_ISCSI_LUN_NUM_GTE)
  private Integer iscsiLunNumGte;

  public static final String SERIALIZED_NAME_ISCSI_LUN_NUM_IN = "iscsi_lun_num_in";
  @SerializedName(SERIALIZED_NAME_ISCSI_LUN_NUM_IN)
  private List<Integer> iscsiLunNumIn = null;

  public static final String SERIALIZED_NAME_ISCSI_LUN_NUM_LT = "iscsi_lun_num_lt";
  @SerializedName(SERIALIZED_NAME_ISCSI_LUN_NUM_LT)
  private Integer iscsiLunNumLt;

  public static final String SERIALIZED_NAME_ISCSI_LUN_NUM_LTE = "iscsi_lun_num_lte";
  @SerializedName(SERIALIZED_NAME_ISCSI_LUN_NUM_LTE)
  private Integer iscsiLunNumLte;

  public static final String SERIALIZED_NAME_ISCSI_LUN_NUM_NOT = "iscsi_lun_num_not";
  @SerializedName(SERIALIZED_NAME_ISCSI_LUN_NUM_NOT)
  private Integer iscsiLunNumNot;

  public static final String SERIALIZED_NAME_ISCSI_LUN_NUM_NOT_IN = "iscsi_lun_num_not_in";
  @SerializedName(SERIALIZED_NAME_ISCSI_LUN_NUM_NOT_IN)
  private List<Integer> iscsiLunNumNotIn = null;

  public static final String SERIALIZED_NAME_ISCSI_LUN_SNAPSHOT_NUM = "iscsi_lun_snapshot_num";
  @SerializedName(SERIALIZED_NAME_ISCSI_LUN_SNAPSHOT_NUM)
  private Integer iscsiLunSnapshotNum;

  public static final String SERIALIZED_NAME_ISCSI_LUN_SNAPSHOT_NUM_GT = "iscsi_lun_snapshot_num_gt";
  @SerializedName(SERIALIZED_NAME_ISCSI_LUN_SNAPSHOT_NUM_GT)
  private Integer iscsiLunSnapshotNumGt;

  public static final String SERIALIZED_NAME_ISCSI_LUN_SNAPSHOT_NUM_GTE = "iscsi_lun_snapshot_num_gte";
  @SerializedName(SERIALIZED_NAME_ISCSI_LUN_SNAPSHOT_NUM_GTE)
  private Integer iscsiLunSnapshotNumGte;

  public static final String SERIALIZED_NAME_ISCSI_LUN_SNAPSHOT_NUM_IN = "iscsi_lun_snapshot_num_in";
  @SerializedName(SERIALIZED_NAME_ISCSI_LUN_SNAPSHOT_NUM_IN)
  private List<Integer> iscsiLunSnapshotNumIn = null;

  public static final String SERIALIZED_NAME_ISCSI_LUN_SNAPSHOT_NUM_LT = "iscsi_lun_snapshot_num_lt";
  @SerializedName(SERIALIZED_NAME_ISCSI_LUN_SNAPSHOT_NUM_LT)
  private Integer iscsiLunSnapshotNumLt;

  public static final String SERIALIZED_NAME_ISCSI_LUN_SNAPSHOT_NUM_LTE = "iscsi_lun_snapshot_num_lte";
  @SerializedName(SERIALIZED_NAME_ISCSI_LUN_SNAPSHOT_NUM_LTE)
  private Integer iscsiLunSnapshotNumLte;

  public static final String SERIALIZED_NAME_ISCSI_LUN_SNAPSHOT_NUM_NOT = "iscsi_lun_snapshot_num_not";
  @SerializedName(SERIALIZED_NAME_ISCSI_LUN_SNAPSHOT_NUM_NOT)
  private Integer iscsiLunSnapshotNumNot;

  public static final String SERIALIZED_NAME_ISCSI_LUN_SNAPSHOT_NUM_NOT_IN = "iscsi_lun_snapshot_num_not_in";
  @SerializedName(SERIALIZED_NAME_ISCSI_LUN_SNAPSHOT_NUM_NOT_IN)
  private List<Integer> iscsiLunSnapshotNumNotIn = null;

  public static final String SERIALIZED_NAME_ISCSI_LUNS_EVERY = "iscsi_luns_every";
  @SerializedName(SERIALIZED_NAME_ISCSI_LUNS_EVERY)
  private IscsiLunWhereInput iscsiLunsEvery;

  public static final String SERIALIZED_NAME_ISCSI_LUNS_NONE = "iscsi_luns_none";
  @SerializedName(SERIALIZED_NAME_ISCSI_LUNS_NONE)
  private IscsiLunWhereInput iscsiLunsNone;

  public static final String SERIALIZED_NAME_ISCSI_LUNS_SOME = "iscsi_luns_some";
  @SerializedName(SERIALIZED_NAME_ISCSI_LUNS_SOME)
  private IscsiLunWhereInput iscsiLunsSome;

  public static final String SERIALIZED_NAME_ISCSI_TARGET_NUM = "iscsi_target_num";
  @SerializedName(SERIALIZED_NAME_ISCSI_TARGET_NUM)
  private Integer iscsiTargetNum;

  public static final String SERIALIZED_NAME_ISCSI_TARGET_NUM_GT = "iscsi_target_num_gt";
  @SerializedName(SERIALIZED_NAME_ISCSI_TARGET_NUM_GT)
  private Integer iscsiTargetNumGt;

  public static final String SERIALIZED_NAME_ISCSI_TARGET_NUM_GTE = "iscsi_target_num_gte";
  @SerializedName(SERIALIZED_NAME_ISCSI_TARGET_NUM_GTE)
  private Integer iscsiTargetNumGte;

  public static final String SERIALIZED_NAME_ISCSI_TARGET_NUM_IN = "iscsi_target_num_in";
  @SerializedName(SERIALIZED_NAME_ISCSI_TARGET_NUM_IN)
  private List<Integer> iscsiTargetNumIn = null;

  public static final String SERIALIZED_NAME_ISCSI_TARGET_NUM_LT = "iscsi_target_num_lt";
  @SerializedName(SERIALIZED_NAME_ISCSI_TARGET_NUM_LT)
  private Integer iscsiTargetNumLt;

  public static final String SERIALIZED_NAME_ISCSI_TARGET_NUM_LTE = "iscsi_target_num_lte";
  @SerializedName(SERIALIZED_NAME_ISCSI_TARGET_NUM_LTE)
  private Integer iscsiTargetNumLte;

  public static final String SERIALIZED_NAME_ISCSI_TARGET_NUM_NOT = "iscsi_target_num_not";
  @SerializedName(SERIALIZED_NAME_ISCSI_TARGET_NUM_NOT)
  private Integer iscsiTargetNumNot;

  public static final String SERIALIZED_NAME_ISCSI_TARGET_NUM_NOT_IN = "iscsi_target_num_not_in";
  @SerializedName(SERIALIZED_NAME_ISCSI_TARGET_NUM_NOT_IN)
  private List<Integer> iscsiTargetNumNotIn = null;

  public static final String SERIALIZED_NAME_ISCSI_TARGETS_EVERY = "iscsi_targets_every";
  @SerializedName(SERIALIZED_NAME_ISCSI_TARGETS_EVERY)
  private IscsiTargetWhereInput iscsiTargetsEvery;

  public static final String SERIALIZED_NAME_ISCSI_TARGETS_NONE = "iscsi_targets_none";
  @SerializedName(SERIALIZED_NAME_ISCSI_TARGETS_NONE)
  private IscsiTargetWhereInput iscsiTargetsNone;

  public static final String SERIALIZED_NAME_ISCSI_TARGETS_SOME = "iscsi_targets_some";
  @SerializedName(SERIALIZED_NAME_ISCSI_TARGETS_SOME)
  private IscsiTargetWhereInput iscsiTargetsSome;

  public static final String SERIALIZED_NAME_KEY = "key";
  @SerializedName(SERIALIZED_NAME_KEY)
  private String key;

  public static final String SERIALIZED_NAME_KEY_CONTAINS = "key_contains";
  @SerializedName(SERIALIZED_NAME_KEY_CONTAINS)
  private String keyContains;

  public static final String SERIALIZED_NAME_KEY_ENDS_WITH = "key_ends_with";
  @SerializedName(SERIALIZED_NAME_KEY_ENDS_WITH)
  private String keyEndsWith;

  public static final String SERIALIZED_NAME_KEY_GT = "key_gt";
  @SerializedName(SERIALIZED_NAME_KEY_GT)
  private String keyGt;

  public static final String SERIALIZED_NAME_KEY_GTE = "key_gte";
  @SerializedName(SERIALIZED_NAME_KEY_GTE)
  private String keyGte;

  public static final String SERIALIZED_NAME_KEY_IN = "key_in";
  @SerializedName(SERIALIZED_NAME_KEY_IN)
  private List<String> keyIn = null;

  public static final String SERIALIZED_NAME_KEY_LT = "key_lt";
  @SerializedName(SERIALIZED_NAME_KEY_LT)
  private String keyLt;

  public static final String SERIALIZED_NAME_KEY_LTE = "key_lte";
  @SerializedName(SERIALIZED_NAME_KEY_LTE)
  private String keyLte;

  public static final String SERIALIZED_NAME_KEY_NOT = "key_not";
  @SerializedName(SERIALIZED_NAME_KEY_NOT)
  private String keyNot;

  public static final String SERIALIZED_NAME_KEY_NOT_CONTAINS = "key_not_contains";
  @SerializedName(SERIALIZED_NAME_KEY_NOT_CONTAINS)
  private String keyNotContains;

  public static final String SERIALIZED_NAME_KEY_NOT_ENDS_WITH = "key_not_ends_with";
  @SerializedName(SERIALIZED_NAME_KEY_NOT_ENDS_WITH)
  private String keyNotEndsWith;

  public static final String SERIALIZED_NAME_KEY_NOT_IN = "key_not_in";
  @SerializedName(SERIALIZED_NAME_KEY_NOT_IN)
  private List<String> keyNotIn = null;

  public static final String SERIALIZED_NAME_KEY_NOT_STARTS_WITH = "key_not_starts_with";
  @SerializedName(SERIALIZED_NAME_KEY_NOT_STARTS_WITH)
  private String keyNotStartsWith;

  public static final String SERIALIZED_NAME_KEY_STARTS_WITH = "key_starts_with";
  @SerializedName(SERIALIZED_NAME_KEY_STARTS_WITH)
  private String keyStartsWith;

  public static final String SERIALIZED_NAME_NIC_NUM = "nic_num";
  @SerializedName(SERIALIZED_NAME_NIC_NUM)
  private Integer nicNum;

  public static final String SERIALIZED_NAME_NIC_NUM_GT = "nic_num_gt";
  @SerializedName(SERIALIZED_NAME_NIC_NUM_GT)
  private Integer nicNumGt;

  public static final String SERIALIZED_NAME_NIC_NUM_GTE = "nic_num_gte";
  @SerializedName(SERIALIZED_NAME_NIC_NUM_GTE)
  private Integer nicNumGte;

  public static final String SERIALIZED_NAME_NIC_NUM_IN = "nic_num_in";
  @SerializedName(SERIALIZED_NAME_NIC_NUM_IN)
  private List<Integer> nicNumIn = null;

  public static final String SERIALIZED_NAME_NIC_NUM_LT = "nic_num_lt";
  @SerializedName(SERIALIZED_NAME_NIC_NUM_LT)
  private Integer nicNumLt;

  public static final String SERIALIZED_NAME_NIC_NUM_LTE = "nic_num_lte";
  @SerializedName(SERIALIZED_NAME_NIC_NUM_LTE)
  private Integer nicNumLte;

  public static final String SERIALIZED_NAME_NIC_NUM_NOT = "nic_num_not";
  @SerializedName(SERIALIZED_NAME_NIC_NUM_NOT)
  private Integer nicNumNot;

  public static final String SERIALIZED_NAME_NIC_NUM_NOT_IN = "nic_num_not_in";
  @SerializedName(SERIALIZED_NAME_NIC_NUM_NOT_IN)
  private List<Integer> nicNumNotIn = null;

  public static final String SERIALIZED_NAME_NICS_EVERY = "nics_every";
  @SerializedName(SERIALIZED_NAME_NICS_EVERY)
  private NicWhereInput nicsEvery;

  public static final String SERIALIZED_NAME_NICS_NONE = "nics_none";
  @SerializedName(SERIALIZED_NAME_NICS_NONE)
  private NicWhereInput nicsNone;

  public static final String SERIALIZED_NAME_NICS_SOME = "nics_some";
  @SerializedName(SERIALIZED_NAME_NICS_SOME)
  private NicWhereInput nicsSome;

  public static final String SERIALIZED_NAME_SYSTEM_VLAN_NUM = "system_vlan_num";
  @SerializedName(SERIALIZED_NAME_SYSTEM_VLAN_NUM)
  private Integer systemVlanNum;

  public static final String SERIALIZED_NAME_SYSTEM_VLAN_NUM_GT = "system_vlan_num_gt";
  @SerializedName(SERIALIZED_NAME_SYSTEM_VLAN_NUM_GT)
  private Integer systemVlanNumGt;

  public static final String SERIALIZED_NAME_SYSTEM_VLAN_NUM_GTE = "system_vlan_num_gte";
  @SerializedName(SERIALIZED_NAME_SYSTEM_VLAN_NUM_GTE)
  private Integer systemVlanNumGte;

  public static final String SERIALIZED_NAME_SYSTEM_VLAN_NUM_IN = "system_vlan_num_in";
  @SerializedName(SERIALIZED_NAME_SYSTEM_VLAN_NUM_IN)
  private List<Integer> systemVlanNumIn = null;

  public static final String SERIALIZED_NAME_SYSTEM_VLAN_NUM_LT = "system_vlan_num_lt";
  @SerializedName(SERIALIZED_NAME_SYSTEM_VLAN_NUM_LT)
  private Integer systemVlanNumLt;

  public static final String SERIALIZED_NAME_SYSTEM_VLAN_NUM_LTE = "system_vlan_num_lte";
  @SerializedName(SERIALIZED_NAME_SYSTEM_VLAN_NUM_LTE)
  private Integer systemVlanNumLte;

  public static final String SERIALIZED_NAME_SYSTEM_VLAN_NUM_NOT = "system_vlan_num_not";
  @SerializedName(SERIALIZED_NAME_SYSTEM_VLAN_NUM_NOT)
  private Integer systemVlanNumNot;

  public static final String SERIALIZED_NAME_SYSTEM_VLAN_NUM_NOT_IN = "system_vlan_num_not_in";
  @SerializedName(SERIALIZED_NAME_SYSTEM_VLAN_NUM_NOT_IN)
  private List<Integer> systemVlanNumNotIn = null;

  public static final String SERIALIZED_NAME_TOTAL_NUM = "total_num";
  @SerializedName(SERIALIZED_NAME_TOTAL_NUM)
  private Integer totalNum;

  public static final String SERIALIZED_NAME_TOTAL_NUM_GT = "total_num_gt";
  @SerializedName(SERIALIZED_NAME_TOTAL_NUM_GT)
  private Integer totalNumGt;

  public static final String SERIALIZED_NAME_TOTAL_NUM_GTE = "total_num_gte";
  @SerializedName(SERIALIZED_NAME_TOTAL_NUM_GTE)
  private Integer totalNumGte;

  public static final String SERIALIZED_NAME_TOTAL_NUM_IN = "total_num_in";
  @SerializedName(SERIALIZED_NAME_TOTAL_NUM_IN)
  private List<Integer> totalNumIn = null;

  public static final String SERIALIZED_NAME_TOTAL_NUM_LT = "total_num_lt";
  @SerializedName(SERIALIZED_NAME_TOTAL_NUM_LT)
  private Integer totalNumLt;

  public static final String SERIALIZED_NAME_TOTAL_NUM_LTE = "total_num_lte";
  @SerializedName(SERIALIZED_NAME_TOTAL_NUM_LTE)
  private Integer totalNumLte;

  public static final String SERIALIZED_NAME_TOTAL_NUM_NOT = "total_num_not";
  @SerializedName(SERIALIZED_NAME_TOTAL_NUM_NOT)
  private Integer totalNumNot;

  public static final String SERIALIZED_NAME_TOTAL_NUM_NOT_IN = "total_num_not_in";
  @SerializedName(SERIALIZED_NAME_TOTAL_NUM_NOT_IN)
  private List<Integer> totalNumNotIn = null;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private String value;

  public static final String SERIALIZED_NAME_VALUE_CONTAINS = "value_contains";
  @SerializedName(SERIALIZED_NAME_VALUE_CONTAINS)
  private String valueContains;

  public static final String SERIALIZED_NAME_VALUE_ENDS_WITH = "value_ends_with";
  @SerializedName(SERIALIZED_NAME_VALUE_ENDS_WITH)
  private String valueEndsWith;

  public static final String SERIALIZED_NAME_VALUE_GT = "value_gt";
  @SerializedName(SERIALIZED_NAME_VALUE_GT)
  private String valueGt;

  public static final String SERIALIZED_NAME_VALUE_GTE = "value_gte";
  @SerializedName(SERIALIZED_NAME_VALUE_GTE)
  private String valueGte;

  public static final String SERIALIZED_NAME_VALUE_IN = "value_in";
  @SerializedName(SERIALIZED_NAME_VALUE_IN)
  private List<String> valueIn = null;

  public static final String SERIALIZED_NAME_VALUE_LT = "value_lt";
  @SerializedName(SERIALIZED_NAME_VALUE_LT)
  private String valueLt;

  public static final String SERIALIZED_NAME_VALUE_LTE = "value_lte";
  @SerializedName(SERIALIZED_NAME_VALUE_LTE)
  private String valueLte;

  public static final String SERIALIZED_NAME_VALUE_NOT = "value_not";
  @SerializedName(SERIALIZED_NAME_VALUE_NOT)
  private String valueNot;

  public static final String SERIALIZED_NAME_VALUE_NOT_CONTAINS = "value_not_contains";
  @SerializedName(SERIALIZED_NAME_VALUE_NOT_CONTAINS)
  private String valueNotContains;

  public static final String SERIALIZED_NAME_VALUE_NOT_ENDS_WITH = "value_not_ends_with";
  @SerializedName(SERIALIZED_NAME_VALUE_NOT_ENDS_WITH)
  private String valueNotEndsWith;

  public static final String SERIALIZED_NAME_VALUE_NOT_IN = "value_not_in";
  @SerializedName(SERIALIZED_NAME_VALUE_NOT_IN)
  private List<String> valueNotIn = null;

  public static final String SERIALIZED_NAME_VALUE_NOT_STARTS_WITH = "value_not_starts_with";
  @SerializedName(SERIALIZED_NAME_VALUE_NOT_STARTS_WITH)
  private String valueNotStartsWith;

  public static final String SERIALIZED_NAME_VALUE_STARTS_WITH = "value_starts_with";
  @SerializedName(SERIALIZED_NAME_VALUE_STARTS_WITH)
  private String valueStartsWith;

  public static final String SERIALIZED_NAME_VDS_NUM = "vds_num";
  @SerializedName(SERIALIZED_NAME_VDS_NUM)
  private Integer vdsNum;

  public static final String SERIALIZED_NAME_VDS_NUM_GT = "vds_num_gt";
  @SerializedName(SERIALIZED_NAME_VDS_NUM_GT)
  private Integer vdsNumGt;

  public static final String SERIALIZED_NAME_VDS_NUM_GTE = "vds_num_gte";
  @SerializedName(SERIALIZED_NAME_VDS_NUM_GTE)
  private Integer vdsNumGte;

  public static final String SERIALIZED_NAME_VDS_NUM_IN = "vds_num_in";
  @SerializedName(SERIALIZED_NAME_VDS_NUM_IN)
  private List<Integer> vdsNumIn = null;

  public static final String SERIALIZED_NAME_VDS_NUM_LT = "vds_num_lt";
  @SerializedName(SERIALIZED_NAME_VDS_NUM_LT)
  private Integer vdsNumLt;

  public static final String SERIALIZED_NAME_VDS_NUM_LTE = "vds_num_lte";
  @SerializedName(SERIALIZED_NAME_VDS_NUM_LTE)
  private Integer vdsNumLte;

  public static final String SERIALIZED_NAME_VDS_NUM_NOT = "vds_num_not";
  @SerializedName(SERIALIZED_NAME_VDS_NUM_NOT)
  private Integer vdsNumNot;

  public static final String SERIALIZED_NAME_VDS_NUM_NOT_IN = "vds_num_not_in";
  @SerializedName(SERIALIZED_NAME_VDS_NUM_NOT_IN)
  private List<Integer> vdsNumNotIn = null;

  public static final String SERIALIZED_NAME_VDSES_EVERY = "vdses_every";
  @SerializedName(SERIALIZED_NAME_VDSES_EVERY)
  private VdsWhereInput vdsesEvery;

  public static final String SERIALIZED_NAME_VDSES_NONE = "vdses_none";
  @SerializedName(SERIALIZED_NAME_VDSES_NONE)
  private VdsWhereInput vdsesNone;

  public static final String SERIALIZED_NAME_VDSES_SOME = "vdses_some";
  @SerializedName(SERIALIZED_NAME_VDSES_SOME)
  private VdsWhereInput vdsesSome;

  public static final String SERIALIZED_NAME_VLANS_EVERY = "vlans_every";
  @SerializedName(SERIALIZED_NAME_VLANS_EVERY)
  private VlanWhereInput vlansEvery;

  public static final String SERIALIZED_NAME_VLANS_NONE = "vlans_none";
  @SerializedName(SERIALIZED_NAME_VLANS_NONE)
  private VlanWhereInput vlansNone;

  public static final String SERIALIZED_NAME_VLANS_SOME = "vlans_some";
  @SerializedName(SERIALIZED_NAME_VLANS_SOME)
  private VlanWhereInput vlansSome;

  public static final String SERIALIZED_NAME_VM_NUM = "vm_num";
  @SerializedName(SERIALIZED_NAME_VM_NUM)
  private Integer vmNum;

  public static final String SERIALIZED_NAME_VM_NUM_GT = "vm_num_gt";
  @SerializedName(SERIALIZED_NAME_VM_NUM_GT)
  private Integer vmNumGt;

  public static final String SERIALIZED_NAME_VM_NUM_GTE = "vm_num_gte";
  @SerializedName(SERIALIZED_NAME_VM_NUM_GTE)
  private Integer vmNumGte;

  public static final String SERIALIZED_NAME_VM_NUM_IN = "vm_num_in";
  @SerializedName(SERIALIZED_NAME_VM_NUM_IN)
  private List<Integer> vmNumIn = null;

  public static final String SERIALIZED_NAME_VM_NUM_LT = "vm_num_lt";
  @SerializedName(SERIALIZED_NAME_VM_NUM_LT)
  private Integer vmNumLt;

  public static final String SERIALIZED_NAME_VM_NUM_LTE = "vm_num_lte";
  @SerializedName(SERIALIZED_NAME_VM_NUM_LTE)
  private Integer vmNumLte;

  public static final String SERIALIZED_NAME_VM_NUM_NOT = "vm_num_not";
  @SerializedName(SERIALIZED_NAME_VM_NUM_NOT)
  private Integer vmNumNot;

  public static final String SERIALIZED_NAME_VM_NUM_NOT_IN = "vm_num_not_in";
  @SerializedName(SERIALIZED_NAME_VM_NUM_NOT_IN)
  private List<Integer> vmNumNotIn = null;

  public static final String SERIALIZED_NAME_VM_SNAPSHOT_NUM = "vm_snapshot_num";
  @SerializedName(SERIALIZED_NAME_VM_SNAPSHOT_NUM)
  private Integer vmSnapshotNum;

  public static final String SERIALIZED_NAME_VM_SNAPSHOT_NUM_GT = "vm_snapshot_num_gt";
  @SerializedName(SERIALIZED_NAME_VM_SNAPSHOT_NUM_GT)
  private Integer vmSnapshotNumGt;

  public static final String SERIALIZED_NAME_VM_SNAPSHOT_NUM_GTE = "vm_snapshot_num_gte";
  @SerializedName(SERIALIZED_NAME_VM_SNAPSHOT_NUM_GTE)
  private Integer vmSnapshotNumGte;

  public static final String SERIALIZED_NAME_VM_SNAPSHOT_NUM_IN = "vm_snapshot_num_in";
  @SerializedName(SERIALIZED_NAME_VM_SNAPSHOT_NUM_IN)
  private List<Integer> vmSnapshotNumIn = null;

  public static final String SERIALIZED_NAME_VM_SNAPSHOT_NUM_LT = "vm_snapshot_num_lt";
  @SerializedName(SERIALIZED_NAME_VM_SNAPSHOT_NUM_LT)
  private Integer vmSnapshotNumLt;

  public static final String SERIALIZED_NAME_VM_SNAPSHOT_NUM_LTE = "vm_snapshot_num_lte";
  @SerializedName(SERIALIZED_NAME_VM_SNAPSHOT_NUM_LTE)
  private Integer vmSnapshotNumLte;

  public static final String SERIALIZED_NAME_VM_SNAPSHOT_NUM_NOT = "vm_snapshot_num_not";
  @SerializedName(SERIALIZED_NAME_VM_SNAPSHOT_NUM_NOT)
  private Integer vmSnapshotNumNot;

  public static final String SERIALIZED_NAME_VM_SNAPSHOT_NUM_NOT_IN = "vm_snapshot_num_not_in";
  @SerializedName(SERIALIZED_NAME_VM_SNAPSHOT_NUM_NOT_IN)
  private List<Integer> vmSnapshotNumNotIn = null;

  public static final String SERIALIZED_NAME_VM_SNAPSHOTS_EVERY = "vm_snapshots_every";
  @SerializedName(SERIALIZED_NAME_VM_SNAPSHOTS_EVERY)
  private VmSnapshotWhereInput vmSnapshotsEvery;

  public static final String SERIALIZED_NAME_VM_SNAPSHOTS_NONE = "vm_snapshots_none";
  @SerializedName(SERIALIZED_NAME_VM_SNAPSHOTS_NONE)
  private VmSnapshotWhereInput vmSnapshotsNone;

  public static final String SERIALIZED_NAME_VM_SNAPSHOTS_SOME = "vm_snapshots_some";
  @SerializedName(SERIALIZED_NAME_VM_SNAPSHOTS_SOME)
  private VmSnapshotWhereInput vmSnapshotsSome;

  public static final String SERIALIZED_NAME_VM_TEMPLATE_NUM = "vm_template_num";
  @SerializedName(SERIALIZED_NAME_VM_TEMPLATE_NUM)
  private Integer vmTemplateNum;

  public static final String SERIALIZED_NAME_VM_TEMPLATE_NUM_GT = "vm_template_num_gt";
  @SerializedName(SERIALIZED_NAME_VM_TEMPLATE_NUM_GT)
  private Integer vmTemplateNumGt;

  public static final String SERIALIZED_NAME_VM_TEMPLATE_NUM_GTE = "vm_template_num_gte";
  @SerializedName(SERIALIZED_NAME_VM_TEMPLATE_NUM_GTE)
  private Integer vmTemplateNumGte;

  public static final String SERIALIZED_NAME_VM_TEMPLATE_NUM_IN = "vm_template_num_in";
  @SerializedName(SERIALIZED_NAME_VM_TEMPLATE_NUM_IN)
  private List<Integer> vmTemplateNumIn = null;

  public static final String SERIALIZED_NAME_VM_TEMPLATE_NUM_LT = "vm_template_num_lt";
  @SerializedName(SERIALIZED_NAME_VM_TEMPLATE_NUM_LT)
  private Integer vmTemplateNumLt;

  public static final String SERIALIZED_NAME_VM_TEMPLATE_NUM_LTE = "vm_template_num_lte";
  @SerializedName(SERIALIZED_NAME_VM_TEMPLATE_NUM_LTE)
  private Integer vmTemplateNumLte;

  public static final String SERIALIZED_NAME_VM_TEMPLATE_NUM_NOT = "vm_template_num_not";
  @SerializedName(SERIALIZED_NAME_VM_TEMPLATE_NUM_NOT)
  private Integer vmTemplateNumNot;

  public static final String SERIALIZED_NAME_VM_TEMPLATE_NUM_NOT_IN = "vm_template_num_not_in";
  @SerializedName(SERIALIZED_NAME_VM_TEMPLATE_NUM_NOT_IN)
  private List<Integer> vmTemplateNumNotIn = null;

  public static final String SERIALIZED_NAME_VM_TEMPLATES_EVERY = "vm_templates_every";
  @SerializedName(SERIALIZED_NAME_VM_TEMPLATES_EVERY)
  private VmTemplateWhereInput vmTemplatesEvery;

  public static final String SERIALIZED_NAME_VM_TEMPLATES_NONE = "vm_templates_none";
  @SerializedName(SERIALIZED_NAME_VM_TEMPLATES_NONE)
  private VmTemplateWhereInput vmTemplatesNone;

  public static final String SERIALIZED_NAME_VM_TEMPLATES_SOME = "vm_templates_some";
  @SerializedName(SERIALIZED_NAME_VM_TEMPLATES_SOME)
  private VmTemplateWhereInput vmTemplatesSome;

  public static final String SERIALIZED_NAME_VM_VLAN_NUM = "vm_vlan_num";
  @SerializedName(SERIALIZED_NAME_VM_VLAN_NUM)
  private Integer vmVlanNum;

  public static final String SERIALIZED_NAME_VM_VLAN_NUM_GT = "vm_vlan_num_gt";
  @SerializedName(SERIALIZED_NAME_VM_VLAN_NUM_GT)
  private Integer vmVlanNumGt;

  public static final String SERIALIZED_NAME_VM_VLAN_NUM_GTE = "vm_vlan_num_gte";
  @SerializedName(SERIALIZED_NAME_VM_VLAN_NUM_GTE)
  private Integer vmVlanNumGte;

  public static final String SERIALIZED_NAME_VM_VLAN_NUM_IN = "vm_vlan_num_in";
  @SerializedName(SERIALIZED_NAME_VM_VLAN_NUM_IN)
  private List<Integer> vmVlanNumIn = null;

  public static final String SERIALIZED_NAME_VM_VLAN_NUM_LT = "vm_vlan_num_lt";
  @SerializedName(SERIALIZED_NAME_VM_VLAN_NUM_LT)
  private Integer vmVlanNumLt;

  public static final String SERIALIZED_NAME_VM_VLAN_NUM_LTE = "vm_vlan_num_lte";
  @SerializedName(SERIALIZED_NAME_VM_VLAN_NUM_LTE)
  private Integer vmVlanNumLte;

  public static final String SERIALIZED_NAME_VM_VLAN_NUM_NOT = "vm_vlan_num_not";
  @SerializedName(SERIALIZED_NAME_VM_VLAN_NUM_NOT)
  private Integer vmVlanNumNot;

  public static final String SERIALIZED_NAME_VM_VLAN_NUM_NOT_IN = "vm_vlan_num_not_in";
  @SerializedName(SERIALIZED_NAME_VM_VLAN_NUM_NOT_IN)
  private List<Integer> vmVlanNumNotIn = null;

  public static final String SERIALIZED_NAME_VM_VOLUME_NUM = "vm_volume_num";
  @SerializedName(SERIALIZED_NAME_VM_VOLUME_NUM)
  private Integer vmVolumeNum;

  public static final String SERIALIZED_NAME_VM_VOLUME_NUM_GT = "vm_volume_num_gt";
  @SerializedName(SERIALIZED_NAME_VM_VOLUME_NUM_GT)
  private Integer vmVolumeNumGt;

  public static final String SERIALIZED_NAME_VM_VOLUME_NUM_GTE = "vm_volume_num_gte";
  @SerializedName(SERIALIZED_NAME_VM_VOLUME_NUM_GTE)
  private Integer vmVolumeNumGte;

  public static final String SERIALIZED_NAME_VM_VOLUME_NUM_IN = "vm_volume_num_in";
  @SerializedName(SERIALIZED_NAME_VM_VOLUME_NUM_IN)
  private List<Integer> vmVolumeNumIn = null;

  public static final String SERIALIZED_NAME_VM_VOLUME_NUM_LT = "vm_volume_num_lt";
  @SerializedName(SERIALIZED_NAME_VM_VOLUME_NUM_LT)
  private Integer vmVolumeNumLt;

  public static final String SERIALIZED_NAME_VM_VOLUME_NUM_LTE = "vm_volume_num_lte";
  @SerializedName(SERIALIZED_NAME_VM_VOLUME_NUM_LTE)
  private Integer vmVolumeNumLte;

  public static final String SERIALIZED_NAME_VM_VOLUME_NUM_NOT = "vm_volume_num_not";
  @SerializedName(SERIALIZED_NAME_VM_VOLUME_NUM_NOT)
  private Integer vmVolumeNumNot;

  public static final String SERIALIZED_NAME_VM_VOLUME_NUM_NOT_IN = "vm_volume_num_not_in";
  @SerializedName(SERIALIZED_NAME_VM_VOLUME_NUM_NOT_IN)
  private List<Integer> vmVolumeNumNotIn = null;

  public static final String SERIALIZED_NAME_VM_VOLUME_SNAPSHOT_NUM = "vm_volume_snapshot_num";
  @SerializedName(SERIALIZED_NAME_VM_VOLUME_SNAPSHOT_NUM)
  private Integer vmVolumeSnapshotNum;

  public static final String SERIALIZED_NAME_VM_VOLUME_SNAPSHOT_NUM_GT = "vm_volume_snapshot_num_gt";
  @SerializedName(SERIALIZED_NAME_VM_VOLUME_SNAPSHOT_NUM_GT)
  private Integer vmVolumeSnapshotNumGt;

  public static final String SERIALIZED_NAME_VM_VOLUME_SNAPSHOT_NUM_GTE = "vm_volume_snapshot_num_gte";
  @SerializedName(SERIALIZED_NAME_VM_VOLUME_SNAPSHOT_NUM_GTE)
  private Integer vmVolumeSnapshotNumGte;

  public static final String SERIALIZED_NAME_VM_VOLUME_SNAPSHOT_NUM_IN = "vm_volume_snapshot_num_in";
  @SerializedName(SERIALIZED_NAME_VM_VOLUME_SNAPSHOT_NUM_IN)
  private List<Integer> vmVolumeSnapshotNumIn = null;

  public static final String SERIALIZED_NAME_VM_VOLUME_SNAPSHOT_NUM_LT = "vm_volume_snapshot_num_lt";
  @SerializedName(SERIALIZED_NAME_VM_VOLUME_SNAPSHOT_NUM_LT)
  private Integer vmVolumeSnapshotNumLt;

  public static final String SERIALIZED_NAME_VM_VOLUME_SNAPSHOT_NUM_LTE = "vm_volume_snapshot_num_lte";
  @SerializedName(SERIALIZED_NAME_VM_VOLUME_SNAPSHOT_NUM_LTE)
  private Integer vmVolumeSnapshotNumLte;

  public static final String SERIALIZED_NAME_VM_VOLUME_SNAPSHOT_NUM_NOT = "vm_volume_snapshot_num_not";
  @SerializedName(SERIALIZED_NAME_VM_VOLUME_SNAPSHOT_NUM_NOT)
  private Integer vmVolumeSnapshotNumNot;

  public static final String SERIALIZED_NAME_VM_VOLUME_SNAPSHOT_NUM_NOT_IN = "vm_volume_snapshot_num_not_in";
  @SerializedName(SERIALIZED_NAME_VM_VOLUME_SNAPSHOT_NUM_NOT_IN)
  private List<Integer> vmVolumeSnapshotNumNotIn = null;

  public static final String SERIALIZED_NAME_VM_VOLUME_SNAPSHOTS_EVERY = "vm_volume_snapshots_every";
  @SerializedName(SERIALIZED_NAME_VM_VOLUME_SNAPSHOTS_EVERY)
  private VmVolumeSnapshotWhereInput vmVolumeSnapshotsEvery;

  public static final String SERIALIZED_NAME_VM_VOLUME_SNAPSHOTS_NONE = "vm_volume_snapshots_none";
  @SerializedName(SERIALIZED_NAME_VM_VOLUME_SNAPSHOTS_NONE)
  private VmVolumeSnapshotWhereInput vmVolumeSnapshotsNone;

  public static final String SERIALIZED_NAME_VM_VOLUME_SNAPSHOTS_SOME = "vm_volume_snapshots_some";
  @SerializedName(SERIALIZED_NAME_VM_VOLUME_SNAPSHOTS_SOME)
  private VmVolumeSnapshotWhereInput vmVolumeSnapshotsSome;

  public static final String SERIALIZED_NAME_VM_VOLUMES_EVERY = "vm_volumes_every";
  @SerializedName(SERIALIZED_NAME_VM_VOLUMES_EVERY)
  private VmVolumeWhereInput vmVolumesEvery;

  public static final String SERIALIZED_NAME_VM_VOLUMES_NONE = "vm_volumes_none";
  @SerializedName(SERIALIZED_NAME_VM_VOLUMES_NONE)
  private VmVolumeWhereInput vmVolumesNone;

  public static final String SERIALIZED_NAME_VM_VOLUMES_SOME = "vm_volumes_some";
  @SerializedName(SERIALIZED_NAME_VM_VOLUMES_SOME)
  private VmVolumeWhereInput vmVolumesSome;

  public static final String SERIALIZED_NAME_VMS_EVERY = "vms_every";
  @SerializedName(SERIALIZED_NAME_VMS_EVERY)
  private VmWhereInput vmsEvery;

  public static final String SERIALIZED_NAME_VMS_NONE = "vms_none";
  @SerializedName(SERIALIZED_NAME_VMS_NONE)
  private VmWhereInput vmsNone;

  public static final String SERIALIZED_NAME_VMS_SOME = "vms_some";
  @SerializedName(SERIALIZED_NAME_VMS_SOME)
  private VmWhereInput vmsSome;

  public LabelWhereInput() { 
  }

  public LabelWhereInput AND(List<LabelWhereInput> AND) {
    
    this.AND = AND;
    return this;
  }

  public LabelWhereInput addANDItem(LabelWhereInput ANDItem) {
    if (this.AND == null) {
      this.AND = new ArrayList<LabelWhereInput>();
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

  public List<LabelWhereInput> getAND() {
    return AND;
  }


  public void setAND(List<LabelWhereInput> AND) {
    this.AND = AND;
  }


  public LabelWhereInput NOT(List<LabelWhereInput> NOT) {
    
    this.NOT = NOT;
    return this;
  }

  public LabelWhereInput addNOTItem(LabelWhereInput NOTItem) {
    if (this.NOT == null) {
      this.NOT = new ArrayList<LabelWhereInput>();
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

  public List<LabelWhereInput> getNOT() {
    return NOT;
  }


  public void setNOT(List<LabelWhereInput> NOT) {
    this.NOT = NOT;
  }


  public LabelWhereInput OR(List<LabelWhereInput> OR) {
    
    this.OR = OR;
    return this;
  }

  public LabelWhereInput addORItem(LabelWhereInput ORItem) {
    if (this.OR == null) {
      this.OR = new ArrayList<LabelWhereInput>();
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

  public List<LabelWhereInput> getOR() {
    return OR;
  }


  public void setOR(List<LabelWhereInput> OR) {
    this.OR = OR;
  }


  public LabelWhereInput clusterNum(Integer clusterNum) {
    
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


  public LabelWhereInput clusterNumGt(Integer clusterNumGt) {
    
    this.clusterNumGt = clusterNumGt;
    return this;
  }

   /**
   * Get clusterNumGt
   * @return clusterNumGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getClusterNumGt() {
    return clusterNumGt;
  }


  public void setClusterNumGt(Integer clusterNumGt) {
    this.clusterNumGt = clusterNumGt;
  }


  public LabelWhereInput clusterNumGte(Integer clusterNumGte) {
    
    this.clusterNumGte = clusterNumGte;
    return this;
  }

   /**
   * Get clusterNumGte
   * @return clusterNumGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getClusterNumGte() {
    return clusterNumGte;
  }


  public void setClusterNumGte(Integer clusterNumGte) {
    this.clusterNumGte = clusterNumGte;
  }


  public LabelWhereInput clusterNumIn(List<Integer> clusterNumIn) {
    
    this.clusterNumIn = clusterNumIn;
    return this;
  }

  public LabelWhereInput addClusterNumInItem(Integer clusterNumInItem) {
    if (this.clusterNumIn == null) {
      this.clusterNumIn = new ArrayList<Integer>();
    }
    this.clusterNumIn.add(clusterNumInItem);
    return this;
  }

   /**
   * Get clusterNumIn
   * @return clusterNumIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Integer> getClusterNumIn() {
    return clusterNumIn;
  }


  public void setClusterNumIn(List<Integer> clusterNumIn) {
    this.clusterNumIn = clusterNumIn;
  }


  public LabelWhereInput clusterNumLt(Integer clusterNumLt) {
    
    this.clusterNumLt = clusterNumLt;
    return this;
  }

   /**
   * Get clusterNumLt
   * @return clusterNumLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getClusterNumLt() {
    return clusterNumLt;
  }


  public void setClusterNumLt(Integer clusterNumLt) {
    this.clusterNumLt = clusterNumLt;
  }


  public LabelWhereInput clusterNumLte(Integer clusterNumLte) {
    
    this.clusterNumLte = clusterNumLte;
    return this;
  }

   /**
   * Get clusterNumLte
   * @return clusterNumLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getClusterNumLte() {
    return clusterNumLte;
  }


  public void setClusterNumLte(Integer clusterNumLte) {
    this.clusterNumLte = clusterNumLte;
  }


  public LabelWhereInput clusterNumNot(Integer clusterNumNot) {
    
    this.clusterNumNot = clusterNumNot;
    return this;
  }

   /**
   * Get clusterNumNot
   * @return clusterNumNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getClusterNumNot() {
    return clusterNumNot;
  }


  public void setClusterNumNot(Integer clusterNumNot) {
    this.clusterNumNot = clusterNumNot;
  }


  public LabelWhereInput clusterNumNotIn(List<Integer> clusterNumNotIn) {
    
    this.clusterNumNotIn = clusterNumNotIn;
    return this;
  }

  public LabelWhereInput addClusterNumNotInItem(Integer clusterNumNotInItem) {
    if (this.clusterNumNotIn == null) {
      this.clusterNumNotIn = new ArrayList<Integer>();
    }
    this.clusterNumNotIn.add(clusterNumNotInItem);
    return this;
  }

   /**
   * Get clusterNumNotIn
   * @return clusterNumNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Integer> getClusterNumNotIn() {
    return clusterNumNotIn;
  }


  public void setClusterNumNotIn(List<Integer> clusterNumNotIn) {
    this.clusterNumNotIn = clusterNumNotIn;
  }


  public LabelWhereInput clustersEvery(ClusterWhereInput clustersEvery) {
    
    this.clustersEvery = clustersEvery;
    return this;
  }

   /**
   * Get clustersEvery
   * @return clustersEvery
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ClusterWhereInput getClustersEvery() {
    return clustersEvery;
  }


  public void setClustersEvery(ClusterWhereInput clustersEvery) {
    this.clustersEvery = clustersEvery;
  }


  public LabelWhereInput clustersNone(ClusterWhereInput clustersNone) {
    
    this.clustersNone = clustersNone;
    return this;
  }

   /**
   * Get clustersNone
   * @return clustersNone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ClusterWhereInput getClustersNone() {
    return clustersNone;
  }


  public void setClustersNone(ClusterWhereInput clustersNone) {
    this.clustersNone = clustersNone;
  }


  public LabelWhereInput clustersSome(ClusterWhereInput clustersSome) {
    
    this.clustersSome = clustersSome;
    return this;
  }

   /**
   * Get clustersSome
   * @return clustersSome
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ClusterWhereInput getClustersSome() {
    return clustersSome;
  }


  public void setClustersSome(ClusterWhereInput clustersSome) {
    this.clustersSome = clustersSome;
  }


  public LabelWhereInput contentLibraryImageNum(Integer contentLibraryImageNum) {
    
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


  public LabelWhereInput contentLibraryImageNumGt(Integer contentLibraryImageNumGt) {
    
    this.contentLibraryImageNumGt = contentLibraryImageNumGt;
    return this;
  }

   /**
   * Get contentLibraryImageNumGt
   * @return contentLibraryImageNumGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getContentLibraryImageNumGt() {
    return contentLibraryImageNumGt;
  }


  public void setContentLibraryImageNumGt(Integer contentLibraryImageNumGt) {
    this.contentLibraryImageNumGt = contentLibraryImageNumGt;
  }


  public LabelWhereInput contentLibraryImageNumGte(Integer contentLibraryImageNumGte) {
    
    this.contentLibraryImageNumGte = contentLibraryImageNumGte;
    return this;
  }

   /**
   * Get contentLibraryImageNumGte
   * @return contentLibraryImageNumGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getContentLibraryImageNumGte() {
    return contentLibraryImageNumGte;
  }


  public void setContentLibraryImageNumGte(Integer contentLibraryImageNumGte) {
    this.contentLibraryImageNumGte = contentLibraryImageNumGte;
  }


  public LabelWhereInput contentLibraryImageNumIn(List<Integer> contentLibraryImageNumIn) {
    
    this.contentLibraryImageNumIn = contentLibraryImageNumIn;
    return this;
  }

  public LabelWhereInput addContentLibraryImageNumInItem(Integer contentLibraryImageNumInItem) {
    if (this.contentLibraryImageNumIn == null) {
      this.contentLibraryImageNumIn = new ArrayList<Integer>();
    }
    this.contentLibraryImageNumIn.add(contentLibraryImageNumInItem);
    return this;
  }

   /**
   * Get contentLibraryImageNumIn
   * @return contentLibraryImageNumIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Integer> getContentLibraryImageNumIn() {
    return contentLibraryImageNumIn;
  }


  public void setContentLibraryImageNumIn(List<Integer> contentLibraryImageNumIn) {
    this.contentLibraryImageNumIn = contentLibraryImageNumIn;
  }


  public LabelWhereInput contentLibraryImageNumLt(Integer contentLibraryImageNumLt) {
    
    this.contentLibraryImageNumLt = contentLibraryImageNumLt;
    return this;
  }

   /**
   * Get contentLibraryImageNumLt
   * @return contentLibraryImageNumLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getContentLibraryImageNumLt() {
    return contentLibraryImageNumLt;
  }


  public void setContentLibraryImageNumLt(Integer contentLibraryImageNumLt) {
    this.contentLibraryImageNumLt = contentLibraryImageNumLt;
  }


  public LabelWhereInput contentLibraryImageNumLte(Integer contentLibraryImageNumLte) {
    
    this.contentLibraryImageNumLte = contentLibraryImageNumLte;
    return this;
  }

   /**
   * Get contentLibraryImageNumLte
   * @return contentLibraryImageNumLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getContentLibraryImageNumLte() {
    return contentLibraryImageNumLte;
  }


  public void setContentLibraryImageNumLte(Integer contentLibraryImageNumLte) {
    this.contentLibraryImageNumLte = contentLibraryImageNumLte;
  }


  public LabelWhereInput contentLibraryImageNumNot(Integer contentLibraryImageNumNot) {
    
    this.contentLibraryImageNumNot = contentLibraryImageNumNot;
    return this;
  }

   /**
   * Get contentLibraryImageNumNot
   * @return contentLibraryImageNumNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getContentLibraryImageNumNot() {
    return contentLibraryImageNumNot;
  }


  public void setContentLibraryImageNumNot(Integer contentLibraryImageNumNot) {
    this.contentLibraryImageNumNot = contentLibraryImageNumNot;
  }


  public LabelWhereInput contentLibraryImageNumNotIn(List<Integer> contentLibraryImageNumNotIn) {
    
    this.contentLibraryImageNumNotIn = contentLibraryImageNumNotIn;
    return this;
  }

  public LabelWhereInput addContentLibraryImageNumNotInItem(Integer contentLibraryImageNumNotInItem) {
    if (this.contentLibraryImageNumNotIn == null) {
      this.contentLibraryImageNumNotIn = new ArrayList<Integer>();
    }
    this.contentLibraryImageNumNotIn.add(contentLibraryImageNumNotInItem);
    return this;
  }

   /**
   * Get contentLibraryImageNumNotIn
   * @return contentLibraryImageNumNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Integer> getContentLibraryImageNumNotIn() {
    return contentLibraryImageNumNotIn;
  }


  public void setContentLibraryImageNumNotIn(List<Integer> contentLibraryImageNumNotIn) {
    this.contentLibraryImageNumNotIn = contentLibraryImageNumNotIn;
  }


  public LabelWhereInput contentLibraryImagesEvery(ContentLibraryImageWhereInput contentLibraryImagesEvery) {
    
    this.contentLibraryImagesEvery = contentLibraryImagesEvery;
    return this;
  }

   /**
   * Get contentLibraryImagesEvery
   * @return contentLibraryImagesEvery
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ContentLibraryImageWhereInput getContentLibraryImagesEvery() {
    return contentLibraryImagesEvery;
  }


  public void setContentLibraryImagesEvery(ContentLibraryImageWhereInput contentLibraryImagesEvery) {
    this.contentLibraryImagesEvery = contentLibraryImagesEvery;
  }


  public LabelWhereInput contentLibraryImagesNone(ContentLibraryImageWhereInput contentLibraryImagesNone) {
    
    this.contentLibraryImagesNone = contentLibraryImagesNone;
    return this;
  }

   /**
   * Get contentLibraryImagesNone
   * @return contentLibraryImagesNone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ContentLibraryImageWhereInput getContentLibraryImagesNone() {
    return contentLibraryImagesNone;
  }


  public void setContentLibraryImagesNone(ContentLibraryImageWhereInput contentLibraryImagesNone) {
    this.contentLibraryImagesNone = contentLibraryImagesNone;
  }


  public LabelWhereInput contentLibraryImagesSome(ContentLibraryImageWhereInput contentLibraryImagesSome) {
    
    this.contentLibraryImagesSome = contentLibraryImagesSome;
    return this;
  }

   /**
   * Get contentLibraryImagesSome
   * @return contentLibraryImagesSome
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ContentLibraryImageWhereInput getContentLibraryImagesSome() {
    return contentLibraryImagesSome;
  }


  public void setContentLibraryImagesSome(ContentLibraryImageWhereInput contentLibraryImagesSome) {
    this.contentLibraryImagesSome = contentLibraryImagesSome;
  }


  public LabelWhereInput contentLibraryVmTemplateNum(Integer contentLibraryVmTemplateNum) {
    
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


  public LabelWhereInput contentLibraryVmTemplateNumGt(Integer contentLibraryVmTemplateNumGt) {
    
    this.contentLibraryVmTemplateNumGt = contentLibraryVmTemplateNumGt;
    return this;
  }

   /**
   * Get contentLibraryVmTemplateNumGt
   * @return contentLibraryVmTemplateNumGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getContentLibraryVmTemplateNumGt() {
    return contentLibraryVmTemplateNumGt;
  }


  public void setContentLibraryVmTemplateNumGt(Integer contentLibraryVmTemplateNumGt) {
    this.contentLibraryVmTemplateNumGt = contentLibraryVmTemplateNumGt;
  }


  public LabelWhereInput contentLibraryVmTemplateNumGte(Integer contentLibraryVmTemplateNumGte) {
    
    this.contentLibraryVmTemplateNumGte = contentLibraryVmTemplateNumGte;
    return this;
  }

   /**
   * Get contentLibraryVmTemplateNumGte
   * @return contentLibraryVmTemplateNumGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getContentLibraryVmTemplateNumGte() {
    return contentLibraryVmTemplateNumGte;
  }


  public void setContentLibraryVmTemplateNumGte(Integer contentLibraryVmTemplateNumGte) {
    this.contentLibraryVmTemplateNumGte = contentLibraryVmTemplateNumGte;
  }


  public LabelWhereInput contentLibraryVmTemplateNumIn(List<Integer> contentLibraryVmTemplateNumIn) {
    
    this.contentLibraryVmTemplateNumIn = contentLibraryVmTemplateNumIn;
    return this;
  }

  public LabelWhereInput addContentLibraryVmTemplateNumInItem(Integer contentLibraryVmTemplateNumInItem) {
    if (this.contentLibraryVmTemplateNumIn == null) {
      this.contentLibraryVmTemplateNumIn = new ArrayList<Integer>();
    }
    this.contentLibraryVmTemplateNumIn.add(contentLibraryVmTemplateNumInItem);
    return this;
  }

   /**
   * Get contentLibraryVmTemplateNumIn
   * @return contentLibraryVmTemplateNumIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Integer> getContentLibraryVmTemplateNumIn() {
    return contentLibraryVmTemplateNumIn;
  }


  public void setContentLibraryVmTemplateNumIn(List<Integer> contentLibraryVmTemplateNumIn) {
    this.contentLibraryVmTemplateNumIn = contentLibraryVmTemplateNumIn;
  }


  public LabelWhereInput contentLibraryVmTemplateNumLt(Integer contentLibraryVmTemplateNumLt) {
    
    this.contentLibraryVmTemplateNumLt = contentLibraryVmTemplateNumLt;
    return this;
  }

   /**
   * Get contentLibraryVmTemplateNumLt
   * @return contentLibraryVmTemplateNumLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getContentLibraryVmTemplateNumLt() {
    return contentLibraryVmTemplateNumLt;
  }


  public void setContentLibraryVmTemplateNumLt(Integer contentLibraryVmTemplateNumLt) {
    this.contentLibraryVmTemplateNumLt = contentLibraryVmTemplateNumLt;
  }


  public LabelWhereInput contentLibraryVmTemplateNumLte(Integer contentLibraryVmTemplateNumLte) {
    
    this.contentLibraryVmTemplateNumLte = contentLibraryVmTemplateNumLte;
    return this;
  }

   /**
   * Get contentLibraryVmTemplateNumLte
   * @return contentLibraryVmTemplateNumLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getContentLibraryVmTemplateNumLte() {
    return contentLibraryVmTemplateNumLte;
  }


  public void setContentLibraryVmTemplateNumLte(Integer contentLibraryVmTemplateNumLte) {
    this.contentLibraryVmTemplateNumLte = contentLibraryVmTemplateNumLte;
  }


  public LabelWhereInput contentLibraryVmTemplateNumNot(Integer contentLibraryVmTemplateNumNot) {
    
    this.contentLibraryVmTemplateNumNot = contentLibraryVmTemplateNumNot;
    return this;
  }

   /**
   * Get contentLibraryVmTemplateNumNot
   * @return contentLibraryVmTemplateNumNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getContentLibraryVmTemplateNumNot() {
    return contentLibraryVmTemplateNumNot;
  }


  public void setContentLibraryVmTemplateNumNot(Integer contentLibraryVmTemplateNumNot) {
    this.contentLibraryVmTemplateNumNot = contentLibraryVmTemplateNumNot;
  }


  public LabelWhereInput contentLibraryVmTemplateNumNotIn(List<Integer> contentLibraryVmTemplateNumNotIn) {
    
    this.contentLibraryVmTemplateNumNotIn = contentLibraryVmTemplateNumNotIn;
    return this;
  }

  public LabelWhereInput addContentLibraryVmTemplateNumNotInItem(Integer contentLibraryVmTemplateNumNotInItem) {
    if (this.contentLibraryVmTemplateNumNotIn == null) {
      this.contentLibraryVmTemplateNumNotIn = new ArrayList<Integer>();
    }
    this.contentLibraryVmTemplateNumNotIn.add(contentLibraryVmTemplateNumNotInItem);
    return this;
  }

   /**
   * Get contentLibraryVmTemplateNumNotIn
   * @return contentLibraryVmTemplateNumNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Integer> getContentLibraryVmTemplateNumNotIn() {
    return contentLibraryVmTemplateNumNotIn;
  }


  public void setContentLibraryVmTemplateNumNotIn(List<Integer> contentLibraryVmTemplateNumNotIn) {
    this.contentLibraryVmTemplateNumNotIn = contentLibraryVmTemplateNumNotIn;
  }


  public LabelWhereInput contentLibraryVmTemplatesEvery(ContentLibraryVmTemplateWhereInput contentLibraryVmTemplatesEvery) {
    
    this.contentLibraryVmTemplatesEvery = contentLibraryVmTemplatesEvery;
    return this;
  }

   /**
   * Get contentLibraryVmTemplatesEvery
   * @return contentLibraryVmTemplatesEvery
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ContentLibraryVmTemplateWhereInput getContentLibraryVmTemplatesEvery() {
    return contentLibraryVmTemplatesEvery;
  }


  public void setContentLibraryVmTemplatesEvery(ContentLibraryVmTemplateWhereInput contentLibraryVmTemplatesEvery) {
    this.contentLibraryVmTemplatesEvery = contentLibraryVmTemplatesEvery;
  }


  public LabelWhereInput contentLibraryVmTemplatesNone(ContentLibraryVmTemplateWhereInput contentLibraryVmTemplatesNone) {
    
    this.contentLibraryVmTemplatesNone = contentLibraryVmTemplatesNone;
    return this;
  }

   /**
   * Get contentLibraryVmTemplatesNone
   * @return contentLibraryVmTemplatesNone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ContentLibraryVmTemplateWhereInput getContentLibraryVmTemplatesNone() {
    return contentLibraryVmTemplatesNone;
  }


  public void setContentLibraryVmTemplatesNone(ContentLibraryVmTemplateWhereInput contentLibraryVmTemplatesNone) {
    this.contentLibraryVmTemplatesNone = contentLibraryVmTemplatesNone;
  }


  public LabelWhereInput contentLibraryVmTemplatesSome(ContentLibraryVmTemplateWhereInput contentLibraryVmTemplatesSome) {
    
    this.contentLibraryVmTemplatesSome = contentLibraryVmTemplatesSome;
    return this;
  }

   /**
   * Get contentLibraryVmTemplatesSome
   * @return contentLibraryVmTemplatesSome
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ContentLibraryVmTemplateWhereInput getContentLibraryVmTemplatesSome() {
    return contentLibraryVmTemplatesSome;
  }


  public void setContentLibraryVmTemplatesSome(ContentLibraryVmTemplateWhereInput contentLibraryVmTemplatesSome) {
    this.contentLibraryVmTemplatesSome = contentLibraryVmTemplatesSome;
  }


  public LabelWhereInput createdAt(String createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }


  public LabelWhereInput createdAtGt(String createdAtGt) {
    
    this.createdAtGt = createdAtGt;
    return this;
  }

   /**
   * Get createdAtGt
   * @return createdAtGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCreatedAtGt() {
    return createdAtGt;
  }


  public void setCreatedAtGt(String createdAtGt) {
    this.createdAtGt = createdAtGt;
  }


  public LabelWhereInput createdAtGte(String createdAtGte) {
    
    this.createdAtGte = createdAtGte;
    return this;
  }

   /**
   * Get createdAtGte
   * @return createdAtGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCreatedAtGte() {
    return createdAtGte;
  }


  public void setCreatedAtGte(String createdAtGte) {
    this.createdAtGte = createdAtGte;
  }


  public LabelWhereInput createdAtIn(List<String> createdAtIn) {
    
    this.createdAtIn = createdAtIn;
    return this;
  }

  public LabelWhereInput addCreatedAtInItem(String createdAtInItem) {
    if (this.createdAtIn == null) {
      this.createdAtIn = new ArrayList<String>();
    }
    this.createdAtIn.add(createdAtInItem);
    return this;
  }

   /**
   * Get createdAtIn
   * @return createdAtIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getCreatedAtIn() {
    return createdAtIn;
  }


  public void setCreatedAtIn(List<String> createdAtIn) {
    this.createdAtIn = createdAtIn;
  }


  public LabelWhereInput createdAtLt(String createdAtLt) {
    
    this.createdAtLt = createdAtLt;
    return this;
  }

   /**
   * Get createdAtLt
   * @return createdAtLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCreatedAtLt() {
    return createdAtLt;
  }


  public void setCreatedAtLt(String createdAtLt) {
    this.createdAtLt = createdAtLt;
  }


  public LabelWhereInput createdAtLte(String createdAtLte) {
    
    this.createdAtLte = createdAtLte;
    return this;
  }

   /**
   * Get createdAtLte
   * @return createdAtLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCreatedAtLte() {
    return createdAtLte;
  }


  public void setCreatedAtLte(String createdAtLte) {
    this.createdAtLte = createdAtLte;
  }


  public LabelWhereInput createdAtNot(String createdAtNot) {
    
    this.createdAtNot = createdAtNot;
    return this;
  }

   /**
   * Get createdAtNot
   * @return createdAtNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCreatedAtNot() {
    return createdAtNot;
  }


  public void setCreatedAtNot(String createdAtNot) {
    this.createdAtNot = createdAtNot;
  }


  public LabelWhereInput createdAtNotIn(List<String> createdAtNotIn) {
    
    this.createdAtNotIn = createdAtNotIn;
    return this;
  }

  public LabelWhereInput addCreatedAtNotInItem(String createdAtNotInItem) {
    if (this.createdAtNotIn == null) {
      this.createdAtNotIn = new ArrayList<String>();
    }
    this.createdAtNotIn.add(createdAtNotInItem);
    return this;
  }

   /**
   * Get createdAtNotIn
   * @return createdAtNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getCreatedAtNotIn() {
    return createdAtNotIn;
  }


  public void setCreatedAtNotIn(List<String> createdAtNotIn) {
    this.createdAtNotIn = createdAtNotIn;
  }


  public LabelWhereInput datacenterNum(Integer datacenterNum) {
    
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


  public LabelWhereInput datacenterNumGt(Integer datacenterNumGt) {
    
    this.datacenterNumGt = datacenterNumGt;
    return this;
  }

   /**
   * Get datacenterNumGt
   * @return datacenterNumGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getDatacenterNumGt() {
    return datacenterNumGt;
  }


  public void setDatacenterNumGt(Integer datacenterNumGt) {
    this.datacenterNumGt = datacenterNumGt;
  }


  public LabelWhereInput datacenterNumGte(Integer datacenterNumGte) {
    
    this.datacenterNumGte = datacenterNumGte;
    return this;
  }

   /**
   * Get datacenterNumGte
   * @return datacenterNumGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getDatacenterNumGte() {
    return datacenterNumGte;
  }


  public void setDatacenterNumGte(Integer datacenterNumGte) {
    this.datacenterNumGte = datacenterNumGte;
  }


  public LabelWhereInput datacenterNumIn(List<Integer> datacenterNumIn) {
    
    this.datacenterNumIn = datacenterNumIn;
    return this;
  }

  public LabelWhereInput addDatacenterNumInItem(Integer datacenterNumInItem) {
    if (this.datacenterNumIn == null) {
      this.datacenterNumIn = new ArrayList<Integer>();
    }
    this.datacenterNumIn.add(datacenterNumInItem);
    return this;
  }

   /**
   * Get datacenterNumIn
   * @return datacenterNumIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Integer> getDatacenterNumIn() {
    return datacenterNumIn;
  }


  public void setDatacenterNumIn(List<Integer> datacenterNumIn) {
    this.datacenterNumIn = datacenterNumIn;
  }


  public LabelWhereInput datacenterNumLt(Integer datacenterNumLt) {
    
    this.datacenterNumLt = datacenterNumLt;
    return this;
  }

   /**
   * Get datacenterNumLt
   * @return datacenterNumLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getDatacenterNumLt() {
    return datacenterNumLt;
  }


  public void setDatacenterNumLt(Integer datacenterNumLt) {
    this.datacenterNumLt = datacenterNumLt;
  }


  public LabelWhereInput datacenterNumLte(Integer datacenterNumLte) {
    
    this.datacenterNumLte = datacenterNumLte;
    return this;
  }

   /**
   * Get datacenterNumLte
   * @return datacenterNumLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getDatacenterNumLte() {
    return datacenterNumLte;
  }


  public void setDatacenterNumLte(Integer datacenterNumLte) {
    this.datacenterNumLte = datacenterNumLte;
  }


  public LabelWhereInput datacenterNumNot(Integer datacenterNumNot) {
    
    this.datacenterNumNot = datacenterNumNot;
    return this;
  }

   /**
   * Get datacenterNumNot
   * @return datacenterNumNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getDatacenterNumNot() {
    return datacenterNumNot;
  }


  public void setDatacenterNumNot(Integer datacenterNumNot) {
    this.datacenterNumNot = datacenterNumNot;
  }


  public LabelWhereInput datacenterNumNotIn(List<Integer> datacenterNumNotIn) {
    
    this.datacenterNumNotIn = datacenterNumNotIn;
    return this;
  }

  public LabelWhereInput addDatacenterNumNotInItem(Integer datacenterNumNotInItem) {
    if (this.datacenterNumNotIn == null) {
      this.datacenterNumNotIn = new ArrayList<Integer>();
    }
    this.datacenterNumNotIn.add(datacenterNumNotInItem);
    return this;
  }

   /**
   * Get datacenterNumNotIn
   * @return datacenterNumNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Integer> getDatacenterNumNotIn() {
    return datacenterNumNotIn;
  }


  public void setDatacenterNumNotIn(List<Integer> datacenterNumNotIn) {
    this.datacenterNumNotIn = datacenterNumNotIn;
  }


  public LabelWhereInput datacentersEvery(DatacenterWhereInput datacentersEvery) {
    
    this.datacentersEvery = datacentersEvery;
    return this;
  }

   /**
   * Get datacentersEvery
   * @return datacentersEvery
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DatacenterWhereInput getDatacentersEvery() {
    return datacentersEvery;
  }


  public void setDatacentersEvery(DatacenterWhereInput datacentersEvery) {
    this.datacentersEvery = datacentersEvery;
  }


  public LabelWhereInput datacentersNone(DatacenterWhereInput datacentersNone) {
    
    this.datacentersNone = datacentersNone;
    return this;
  }

   /**
   * Get datacentersNone
   * @return datacentersNone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DatacenterWhereInput getDatacentersNone() {
    return datacentersNone;
  }


  public void setDatacentersNone(DatacenterWhereInput datacentersNone) {
    this.datacentersNone = datacentersNone;
  }


  public LabelWhereInput datacentersSome(DatacenterWhereInput datacentersSome) {
    
    this.datacentersSome = datacentersSome;
    return this;
  }

   /**
   * Get datacentersSome
   * @return datacentersSome
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DatacenterWhereInput getDatacentersSome() {
    return datacentersSome;
  }


  public void setDatacentersSome(DatacenterWhereInput datacentersSome) {
    this.datacentersSome = datacentersSome;
  }


  public LabelWhereInput diskNum(Integer diskNum) {
    
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


  public LabelWhereInput diskNumGt(Integer diskNumGt) {
    
    this.diskNumGt = diskNumGt;
    return this;
  }

   /**
   * Get diskNumGt
   * @return diskNumGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getDiskNumGt() {
    return diskNumGt;
  }


  public void setDiskNumGt(Integer diskNumGt) {
    this.diskNumGt = diskNumGt;
  }


  public LabelWhereInput diskNumGte(Integer diskNumGte) {
    
    this.diskNumGte = diskNumGte;
    return this;
  }

   /**
   * Get diskNumGte
   * @return diskNumGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getDiskNumGte() {
    return diskNumGte;
  }


  public void setDiskNumGte(Integer diskNumGte) {
    this.diskNumGte = diskNumGte;
  }


  public LabelWhereInput diskNumIn(List<Integer> diskNumIn) {
    
    this.diskNumIn = diskNumIn;
    return this;
  }

  public LabelWhereInput addDiskNumInItem(Integer diskNumInItem) {
    if (this.diskNumIn == null) {
      this.diskNumIn = new ArrayList<Integer>();
    }
    this.diskNumIn.add(diskNumInItem);
    return this;
  }

   /**
   * Get diskNumIn
   * @return diskNumIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Integer> getDiskNumIn() {
    return diskNumIn;
  }


  public void setDiskNumIn(List<Integer> diskNumIn) {
    this.diskNumIn = diskNumIn;
  }


  public LabelWhereInput diskNumLt(Integer diskNumLt) {
    
    this.diskNumLt = diskNumLt;
    return this;
  }

   /**
   * Get diskNumLt
   * @return diskNumLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getDiskNumLt() {
    return diskNumLt;
  }


  public void setDiskNumLt(Integer diskNumLt) {
    this.diskNumLt = diskNumLt;
  }


  public LabelWhereInput diskNumLte(Integer diskNumLte) {
    
    this.diskNumLte = diskNumLte;
    return this;
  }

   /**
   * Get diskNumLte
   * @return diskNumLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getDiskNumLte() {
    return diskNumLte;
  }


  public void setDiskNumLte(Integer diskNumLte) {
    this.diskNumLte = diskNumLte;
  }


  public LabelWhereInput diskNumNot(Integer diskNumNot) {
    
    this.diskNumNot = diskNumNot;
    return this;
  }

   /**
   * Get diskNumNot
   * @return diskNumNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getDiskNumNot() {
    return diskNumNot;
  }


  public void setDiskNumNot(Integer diskNumNot) {
    this.diskNumNot = diskNumNot;
  }


  public LabelWhereInput diskNumNotIn(List<Integer> diskNumNotIn) {
    
    this.diskNumNotIn = diskNumNotIn;
    return this;
  }

  public LabelWhereInput addDiskNumNotInItem(Integer diskNumNotInItem) {
    if (this.diskNumNotIn == null) {
      this.diskNumNotIn = new ArrayList<Integer>();
    }
    this.diskNumNotIn.add(diskNumNotInItem);
    return this;
  }

   /**
   * Get diskNumNotIn
   * @return diskNumNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Integer> getDiskNumNotIn() {
    return diskNumNotIn;
  }


  public void setDiskNumNotIn(List<Integer> diskNumNotIn) {
    this.diskNumNotIn = diskNumNotIn;
  }


  public LabelWhereInput elfImageNum(Integer elfImageNum) {
    
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


  public LabelWhereInput elfImageNumGt(Integer elfImageNumGt) {
    
    this.elfImageNumGt = elfImageNumGt;
    return this;
  }

   /**
   * Get elfImageNumGt
   * @return elfImageNumGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getElfImageNumGt() {
    return elfImageNumGt;
  }


  public void setElfImageNumGt(Integer elfImageNumGt) {
    this.elfImageNumGt = elfImageNumGt;
  }


  public LabelWhereInput elfImageNumGte(Integer elfImageNumGte) {
    
    this.elfImageNumGte = elfImageNumGte;
    return this;
  }

   /**
   * Get elfImageNumGte
   * @return elfImageNumGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getElfImageNumGte() {
    return elfImageNumGte;
  }


  public void setElfImageNumGte(Integer elfImageNumGte) {
    this.elfImageNumGte = elfImageNumGte;
  }


  public LabelWhereInput elfImageNumIn(List<Integer> elfImageNumIn) {
    
    this.elfImageNumIn = elfImageNumIn;
    return this;
  }

  public LabelWhereInput addElfImageNumInItem(Integer elfImageNumInItem) {
    if (this.elfImageNumIn == null) {
      this.elfImageNumIn = new ArrayList<Integer>();
    }
    this.elfImageNumIn.add(elfImageNumInItem);
    return this;
  }

   /**
   * Get elfImageNumIn
   * @return elfImageNumIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Integer> getElfImageNumIn() {
    return elfImageNumIn;
  }


  public void setElfImageNumIn(List<Integer> elfImageNumIn) {
    this.elfImageNumIn = elfImageNumIn;
  }


  public LabelWhereInput elfImageNumLt(Integer elfImageNumLt) {
    
    this.elfImageNumLt = elfImageNumLt;
    return this;
  }

   /**
   * Get elfImageNumLt
   * @return elfImageNumLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getElfImageNumLt() {
    return elfImageNumLt;
  }


  public void setElfImageNumLt(Integer elfImageNumLt) {
    this.elfImageNumLt = elfImageNumLt;
  }


  public LabelWhereInput elfImageNumLte(Integer elfImageNumLte) {
    
    this.elfImageNumLte = elfImageNumLte;
    return this;
  }

   /**
   * Get elfImageNumLte
   * @return elfImageNumLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getElfImageNumLte() {
    return elfImageNumLte;
  }


  public void setElfImageNumLte(Integer elfImageNumLte) {
    this.elfImageNumLte = elfImageNumLte;
  }


  public LabelWhereInput elfImageNumNot(Integer elfImageNumNot) {
    
    this.elfImageNumNot = elfImageNumNot;
    return this;
  }

   /**
   * Get elfImageNumNot
   * @return elfImageNumNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getElfImageNumNot() {
    return elfImageNumNot;
  }


  public void setElfImageNumNot(Integer elfImageNumNot) {
    this.elfImageNumNot = elfImageNumNot;
  }


  public LabelWhereInput elfImageNumNotIn(List<Integer> elfImageNumNotIn) {
    
    this.elfImageNumNotIn = elfImageNumNotIn;
    return this;
  }

  public LabelWhereInput addElfImageNumNotInItem(Integer elfImageNumNotInItem) {
    if (this.elfImageNumNotIn == null) {
      this.elfImageNumNotIn = new ArrayList<Integer>();
    }
    this.elfImageNumNotIn.add(elfImageNumNotInItem);
    return this;
  }

   /**
   * Get elfImageNumNotIn
   * @return elfImageNumNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Integer> getElfImageNumNotIn() {
    return elfImageNumNotIn;
  }


  public void setElfImageNumNotIn(List<Integer> elfImageNumNotIn) {
    this.elfImageNumNotIn = elfImageNumNotIn;
  }


  public LabelWhereInput elfImagesEvery(ElfImageWhereInput elfImagesEvery) {
    
    this.elfImagesEvery = elfImagesEvery;
    return this;
  }

   /**
   * Get elfImagesEvery
   * @return elfImagesEvery
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ElfImageWhereInput getElfImagesEvery() {
    return elfImagesEvery;
  }


  public void setElfImagesEvery(ElfImageWhereInput elfImagesEvery) {
    this.elfImagesEvery = elfImagesEvery;
  }


  public LabelWhereInput elfImagesNone(ElfImageWhereInput elfImagesNone) {
    
    this.elfImagesNone = elfImagesNone;
    return this;
  }

   /**
   * Get elfImagesNone
   * @return elfImagesNone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ElfImageWhereInput getElfImagesNone() {
    return elfImagesNone;
  }


  public void setElfImagesNone(ElfImageWhereInput elfImagesNone) {
    this.elfImagesNone = elfImagesNone;
  }


  public LabelWhereInput elfImagesSome(ElfImageWhereInput elfImagesSome) {
    
    this.elfImagesSome = elfImagesSome;
    return this;
  }

   /**
   * Get elfImagesSome
   * @return elfImagesSome
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ElfImageWhereInput getElfImagesSome() {
    return elfImagesSome;
  }


  public void setElfImagesSome(ElfImageWhereInput elfImagesSome) {
    this.elfImagesSome = elfImagesSome;
  }


  public LabelWhereInput gpuDeviceNum(Integer gpuDeviceNum) {
    
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


  public LabelWhereInput gpuDeviceNumGt(Integer gpuDeviceNumGt) {
    
    this.gpuDeviceNumGt = gpuDeviceNumGt;
    return this;
  }

   /**
   * Get gpuDeviceNumGt
   * @return gpuDeviceNumGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getGpuDeviceNumGt() {
    return gpuDeviceNumGt;
  }


  public void setGpuDeviceNumGt(Integer gpuDeviceNumGt) {
    this.gpuDeviceNumGt = gpuDeviceNumGt;
  }


  public LabelWhereInput gpuDeviceNumGte(Integer gpuDeviceNumGte) {
    
    this.gpuDeviceNumGte = gpuDeviceNumGte;
    return this;
  }

   /**
   * Get gpuDeviceNumGte
   * @return gpuDeviceNumGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getGpuDeviceNumGte() {
    return gpuDeviceNumGte;
  }


  public void setGpuDeviceNumGte(Integer gpuDeviceNumGte) {
    this.gpuDeviceNumGte = gpuDeviceNumGte;
  }


  public LabelWhereInput gpuDeviceNumIn(List<Integer> gpuDeviceNumIn) {
    
    this.gpuDeviceNumIn = gpuDeviceNumIn;
    return this;
  }

  public LabelWhereInput addGpuDeviceNumInItem(Integer gpuDeviceNumInItem) {
    if (this.gpuDeviceNumIn == null) {
      this.gpuDeviceNumIn = new ArrayList<Integer>();
    }
    this.gpuDeviceNumIn.add(gpuDeviceNumInItem);
    return this;
  }

   /**
   * Get gpuDeviceNumIn
   * @return gpuDeviceNumIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Integer> getGpuDeviceNumIn() {
    return gpuDeviceNumIn;
  }


  public void setGpuDeviceNumIn(List<Integer> gpuDeviceNumIn) {
    this.gpuDeviceNumIn = gpuDeviceNumIn;
  }


  public LabelWhereInput gpuDeviceNumLt(Integer gpuDeviceNumLt) {
    
    this.gpuDeviceNumLt = gpuDeviceNumLt;
    return this;
  }

   /**
   * Get gpuDeviceNumLt
   * @return gpuDeviceNumLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getGpuDeviceNumLt() {
    return gpuDeviceNumLt;
  }


  public void setGpuDeviceNumLt(Integer gpuDeviceNumLt) {
    this.gpuDeviceNumLt = gpuDeviceNumLt;
  }


  public LabelWhereInput gpuDeviceNumLte(Integer gpuDeviceNumLte) {
    
    this.gpuDeviceNumLte = gpuDeviceNumLte;
    return this;
  }

   /**
   * Get gpuDeviceNumLte
   * @return gpuDeviceNumLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getGpuDeviceNumLte() {
    return gpuDeviceNumLte;
  }


  public void setGpuDeviceNumLte(Integer gpuDeviceNumLte) {
    this.gpuDeviceNumLte = gpuDeviceNumLte;
  }


  public LabelWhereInput gpuDeviceNumNot(Integer gpuDeviceNumNot) {
    
    this.gpuDeviceNumNot = gpuDeviceNumNot;
    return this;
  }

   /**
   * Get gpuDeviceNumNot
   * @return gpuDeviceNumNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getGpuDeviceNumNot() {
    return gpuDeviceNumNot;
  }


  public void setGpuDeviceNumNot(Integer gpuDeviceNumNot) {
    this.gpuDeviceNumNot = gpuDeviceNumNot;
  }


  public LabelWhereInput gpuDeviceNumNotIn(List<Integer> gpuDeviceNumNotIn) {
    
    this.gpuDeviceNumNotIn = gpuDeviceNumNotIn;
    return this;
  }

  public LabelWhereInput addGpuDeviceNumNotInItem(Integer gpuDeviceNumNotInItem) {
    if (this.gpuDeviceNumNotIn == null) {
      this.gpuDeviceNumNotIn = new ArrayList<Integer>();
    }
    this.gpuDeviceNumNotIn.add(gpuDeviceNumNotInItem);
    return this;
  }

   /**
   * Get gpuDeviceNumNotIn
   * @return gpuDeviceNumNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Integer> getGpuDeviceNumNotIn() {
    return gpuDeviceNumNotIn;
  }


  public void setGpuDeviceNumNotIn(List<Integer> gpuDeviceNumNotIn) {
    this.gpuDeviceNumNotIn = gpuDeviceNumNotIn;
  }


  public LabelWhereInput gpuDevicesEvery(GpuDeviceWhereInput gpuDevicesEvery) {
    
    this.gpuDevicesEvery = gpuDevicesEvery;
    return this;
  }

   /**
   * Get gpuDevicesEvery
   * @return gpuDevicesEvery
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GpuDeviceWhereInput getGpuDevicesEvery() {
    return gpuDevicesEvery;
  }


  public void setGpuDevicesEvery(GpuDeviceWhereInput gpuDevicesEvery) {
    this.gpuDevicesEvery = gpuDevicesEvery;
  }


  public LabelWhereInput gpuDevicesNone(GpuDeviceWhereInput gpuDevicesNone) {
    
    this.gpuDevicesNone = gpuDevicesNone;
    return this;
  }

   /**
   * Get gpuDevicesNone
   * @return gpuDevicesNone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GpuDeviceWhereInput getGpuDevicesNone() {
    return gpuDevicesNone;
  }


  public void setGpuDevicesNone(GpuDeviceWhereInput gpuDevicesNone) {
    this.gpuDevicesNone = gpuDevicesNone;
  }


  public LabelWhereInput gpuDevicesSome(GpuDeviceWhereInput gpuDevicesSome) {
    
    this.gpuDevicesSome = gpuDevicesSome;
    return this;
  }

   /**
   * Get gpuDevicesSome
   * @return gpuDevicesSome
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GpuDeviceWhereInput getGpuDevicesSome() {
    return gpuDevicesSome;
  }


  public void setGpuDevicesSome(GpuDeviceWhereInput gpuDevicesSome) {
    this.gpuDevicesSome = gpuDevicesSome;
  }


  public LabelWhereInput hostNum(Integer hostNum) {
    
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


  public LabelWhereInput hostNumGt(Integer hostNumGt) {
    
    this.hostNumGt = hostNumGt;
    return this;
  }

   /**
   * Get hostNumGt
   * @return hostNumGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getHostNumGt() {
    return hostNumGt;
  }


  public void setHostNumGt(Integer hostNumGt) {
    this.hostNumGt = hostNumGt;
  }


  public LabelWhereInput hostNumGte(Integer hostNumGte) {
    
    this.hostNumGte = hostNumGte;
    return this;
  }

   /**
   * Get hostNumGte
   * @return hostNumGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getHostNumGte() {
    return hostNumGte;
  }


  public void setHostNumGte(Integer hostNumGte) {
    this.hostNumGte = hostNumGte;
  }


  public LabelWhereInput hostNumIn(List<Integer> hostNumIn) {
    
    this.hostNumIn = hostNumIn;
    return this;
  }

  public LabelWhereInput addHostNumInItem(Integer hostNumInItem) {
    if (this.hostNumIn == null) {
      this.hostNumIn = new ArrayList<Integer>();
    }
    this.hostNumIn.add(hostNumInItem);
    return this;
  }

   /**
   * Get hostNumIn
   * @return hostNumIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Integer> getHostNumIn() {
    return hostNumIn;
  }


  public void setHostNumIn(List<Integer> hostNumIn) {
    this.hostNumIn = hostNumIn;
  }


  public LabelWhereInput hostNumLt(Integer hostNumLt) {
    
    this.hostNumLt = hostNumLt;
    return this;
  }

   /**
   * Get hostNumLt
   * @return hostNumLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getHostNumLt() {
    return hostNumLt;
  }


  public void setHostNumLt(Integer hostNumLt) {
    this.hostNumLt = hostNumLt;
  }


  public LabelWhereInput hostNumLte(Integer hostNumLte) {
    
    this.hostNumLte = hostNumLte;
    return this;
  }

   /**
   * Get hostNumLte
   * @return hostNumLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getHostNumLte() {
    return hostNumLte;
  }


  public void setHostNumLte(Integer hostNumLte) {
    this.hostNumLte = hostNumLte;
  }


  public LabelWhereInput hostNumNot(Integer hostNumNot) {
    
    this.hostNumNot = hostNumNot;
    return this;
  }

   /**
   * Get hostNumNot
   * @return hostNumNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getHostNumNot() {
    return hostNumNot;
  }


  public void setHostNumNot(Integer hostNumNot) {
    this.hostNumNot = hostNumNot;
  }


  public LabelWhereInput hostNumNotIn(List<Integer> hostNumNotIn) {
    
    this.hostNumNotIn = hostNumNotIn;
    return this;
  }

  public LabelWhereInput addHostNumNotInItem(Integer hostNumNotInItem) {
    if (this.hostNumNotIn == null) {
      this.hostNumNotIn = new ArrayList<Integer>();
    }
    this.hostNumNotIn.add(hostNumNotInItem);
    return this;
  }

   /**
   * Get hostNumNotIn
   * @return hostNumNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Integer> getHostNumNotIn() {
    return hostNumNotIn;
  }


  public void setHostNumNotIn(List<Integer> hostNumNotIn) {
    this.hostNumNotIn = hostNumNotIn;
  }


  public LabelWhereInput hostsEvery(HostWhereInput hostsEvery) {
    
    this.hostsEvery = hostsEvery;
    return this;
  }

   /**
   * Get hostsEvery
   * @return hostsEvery
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public HostWhereInput getHostsEvery() {
    return hostsEvery;
  }


  public void setHostsEvery(HostWhereInput hostsEvery) {
    this.hostsEvery = hostsEvery;
  }


  public LabelWhereInput hostsNone(HostWhereInput hostsNone) {
    
    this.hostsNone = hostsNone;
    return this;
  }

   /**
   * Get hostsNone
   * @return hostsNone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public HostWhereInput getHostsNone() {
    return hostsNone;
  }


  public void setHostsNone(HostWhereInput hostsNone) {
    this.hostsNone = hostsNone;
  }


  public LabelWhereInput hostsSome(HostWhereInput hostsSome) {
    
    this.hostsSome = hostsSome;
    return this;
  }

   /**
   * Get hostsSome
   * @return hostsSome
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public HostWhereInput getHostsSome() {
    return hostsSome;
  }


  public void setHostsSome(HostWhereInput hostsSome) {
    this.hostsSome = hostsSome;
  }


  public LabelWhereInput id(String id) {
    
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


  public LabelWhereInput idContains(String idContains) {
    
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


  public LabelWhereInput idEndsWith(String idEndsWith) {
    
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


  public LabelWhereInput idGt(String idGt) {
    
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


  public LabelWhereInput idGte(String idGte) {
    
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


  public LabelWhereInput idIn(List<String> idIn) {
    
    this.idIn = idIn;
    return this;
  }

  public LabelWhereInput addIdInItem(String idInItem) {
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


  public LabelWhereInput idLt(String idLt) {
    
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


  public LabelWhereInput idLte(String idLte) {
    
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


  public LabelWhereInput idNot(String idNot) {
    
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


  public LabelWhereInput idNotContains(String idNotContains) {
    
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


  public LabelWhereInput idNotEndsWith(String idNotEndsWith) {
    
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


  public LabelWhereInput idNotIn(List<String> idNotIn) {
    
    this.idNotIn = idNotIn;
    return this;
  }

  public LabelWhereInput addIdNotInItem(String idNotInItem) {
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


  public LabelWhereInput idNotStartsWith(String idNotStartsWith) {
    
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


  public LabelWhereInput idStartsWith(String idStartsWith) {
    
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


  public LabelWhereInput iscsiLunNum(Integer iscsiLunNum) {
    
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


  public LabelWhereInput iscsiLunNumGt(Integer iscsiLunNumGt) {
    
    this.iscsiLunNumGt = iscsiLunNumGt;
    return this;
  }

   /**
   * Get iscsiLunNumGt
   * @return iscsiLunNumGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getIscsiLunNumGt() {
    return iscsiLunNumGt;
  }


  public void setIscsiLunNumGt(Integer iscsiLunNumGt) {
    this.iscsiLunNumGt = iscsiLunNumGt;
  }


  public LabelWhereInput iscsiLunNumGte(Integer iscsiLunNumGte) {
    
    this.iscsiLunNumGte = iscsiLunNumGte;
    return this;
  }

   /**
   * Get iscsiLunNumGte
   * @return iscsiLunNumGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getIscsiLunNumGte() {
    return iscsiLunNumGte;
  }


  public void setIscsiLunNumGte(Integer iscsiLunNumGte) {
    this.iscsiLunNumGte = iscsiLunNumGte;
  }


  public LabelWhereInput iscsiLunNumIn(List<Integer> iscsiLunNumIn) {
    
    this.iscsiLunNumIn = iscsiLunNumIn;
    return this;
  }

  public LabelWhereInput addIscsiLunNumInItem(Integer iscsiLunNumInItem) {
    if (this.iscsiLunNumIn == null) {
      this.iscsiLunNumIn = new ArrayList<Integer>();
    }
    this.iscsiLunNumIn.add(iscsiLunNumInItem);
    return this;
  }

   /**
   * Get iscsiLunNumIn
   * @return iscsiLunNumIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Integer> getIscsiLunNumIn() {
    return iscsiLunNumIn;
  }


  public void setIscsiLunNumIn(List<Integer> iscsiLunNumIn) {
    this.iscsiLunNumIn = iscsiLunNumIn;
  }


  public LabelWhereInput iscsiLunNumLt(Integer iscsiLunNumLt) {
    
    this.iscsiLunNumLt = iscsiLunNumLt;
    return this;
  }

   /**
   * Get iscsiLunNumLt
   * @return iscsiLunNumLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getIscsiLunNumLt() {
    return iscsiLunNumLt;
  }


  public void setIscsiLunNumLt(Integer iscsiLunNumLt) {
    this.iscsiLunNumLt = iscsiLunNumLt;
  }


  public LabelWhereInput iscsiLunNumLte(Integer iscsiLunNumLte) {
    
    this.iscsiLunNumLte = iscsiLunNumLte;
    return this;
  }

   /**
   * Get iscsiLunNumLte
   * @return iscsiLunNumLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getIscsiLunNumLte() {
    return iscsiLunNumLte;
  }


  public void setIscsiLunNumLte(Integer iscsiLunNumLte) {
    this.iscsiLunNumLte = iscsiLunNumLte;
  }


  public LabelWhereInput iscsiLunNumNot(Integer iscsiLunNumNot) {
    
    this.iscsiLunNumNot = iscsiLunNumNot;
    return this;
  }

   /**
   * Get iscsiLunNumNot
   * @return iscsiLunNumNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getIscsiLunNumNot() {
    return iscsiLunNumNot;
  }


  public void setIscsiLunNumNot(Integer iscsiLunNumNot) {
    this.iscsiLunNumNot = iscsiLunNumNot;
  }


  public LabelWhereInput iscsiLunNumNotIn(List<Integer> iscsiLunNumNotIn) {
    
    this.iscsiLunNumNotIn = iscsiLunNumNotIn;
    return this;
  }

  public LabelWhereInput addIscsiLunNumNotInItem(Integer iscsiLunNumNotInItem) {
    if (this.iscsiLunNumNotIn == null) {
      this.iscsiLunNumNotIn = new ArrayList<Integer>();
    }
    this.iscsiLunNumNotIn.add(iscsiLunNumNotInItem);
    return this;
  }

   /**
   * Get iscsiLunNumNotIn
   * @return iscsiLunNumNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Integer> getIscsiLunNumNotIn() {
    return iscsiLunNumNotIn;
  }


  public void setIscsiLunNumNotIn(List<Integer> iscsiLunNumNotIn) {
    this.iscsiLunNumNotIn = iscsiLunNumNotIn;
  }


  public LabelWhereInput iscsiLunSnapshotNum(Integer iscsiLunSnapshotNum) {
    
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


  public LabelWhereInput iscsiLunSnapshotNumGt(Integer iscsiLunSnapshotNumGt) {
    
    this.iscsiLunSnapshotNumGt = iscsiLunSnapshotNumGt;
    return this;
  }

   /**
   * Get iscsiLunSnapshotNumGt
   * @return iscsiLunSnapshotNumGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getIscsiLunSnapshotNumGt() {
    return iscsiLunSnapshotNumGt;
  }


  public void setIscsiLunSnapshotNumGt(Integer iscsiLunSnapshotNumGt) {
    this.iscsiLunSnapshotNumGt = iscsiLunSnapshotNumGt;
  }


  public LabelWhereInput iscsiLunSnapshotNumGte(Integer iscsiLunSnapshotNumGte) {
    
    this.iscsiLunSnapshotNumGte = iscsiLunSnapshotNumGte;
    return this;
  }

   /**
   * Get iscsiLunSnapshotNumGte
   * @return iscsiLunSnapshotNumGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getIscsiLunSnapshotNumGte() {
    return iscsiLunSnapshotNumGte;
  }


  public void setIscsiLunSnapshotNumGte(Integer iscsiLunSnapshotNumGte) {
    this.iscsiLunSnapshotNumGte = iscsiLunSnapshotNumGte;
  }


  public LabelWhereInput iscsiLunSnapshotNumIn(List<Integer> iscsiLunSnapshotNumIn) {
    
    this.iscsiLunSnapshotNumIn = iscsiLunSnapshotNumIn;
    return this;
  }

  public LabelWhereInput addIscsiLunSnapshotNumInItem(Integer iscsiLunSnapshotNumInItem) {
    if (this.iscsiLunSnapshotNumIn == null) {
      this.iscsiLunSnapshotNumIn = new ArrayList<Integer>();
    }
    this.iscsiLunSnapshotNumIn.add(iscsiLunSnapshotNumInItem);
    return this;
  }

   /**
   * Get iscsiLunSnapshotNumIn
   * @return iscsiLunSnapshotNumIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Integer> getIscsiLunSnapshotNumIn() {
    return iscsiLunSnapshotNumIn;
  }


  public void setIscsiLunSnapshotNumIn(List<Integer> iscsiLunSnapshotNumIn) {
    this.iscsiLunSnapshotNumIn = iscsiLunSnapshotNumIn;
  }


  public LabelWhereInput iscsiLunSnapshotNumLt(Integer iscsiLunSnapshotNumLt) {
    
    this.iscsiLunSnapshotNumLt = iscsiLunSnapshotNumLt;
    return this;
  }

   /**
   * Get iscsiLunSnapshotNumLt
   * @return iscsiLunSnapshotNumLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getIscsiLunSnapshotNumLt() {
    return iscsiLunSnapshotNumLt;
  }


  public void setIscsiLunSnapshotNumLt(Integer iscsiLunSnapshotNumLt) {
    this.iscsiLunSnapshotNumLt = iscsiLunSnapshotNumLt;
  }


  public LabelWhereInput iscsiLunSnapshotNumLte(Integer iscsiLunSnapshotNumLte) {
    
    this.iscsiLunSnapshotNumLte = iscsiLunSnapshotNumLte;
    return this;
  }

   /**
   * Get iscsiLunSnapshotNumLte
   * @return iscsiLunSnapshotNumLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getIscsiLunSnapshotNumLte() {
    return iscsiLunSnapshotNumLte;
  }


  public void setIscsiLunSnapshotNumLte(Integer iscsiLunSnapshotNumLte) {
    this.iscsiLunSnapshotNumLte = iscsiLunSnapshotNumLte;
  }


  public LabelWhereInput iscsiLunSnapshotNumNot(Integer iscsiLunSnapshotNumNot) {
    
    this.iscsiLunSnapshotNumNot = iscsiLunSnapshotNumNot;
    return this;
  }

   /**
   * Get iscsiLunSnapshotNumNot
   * @return iscsiLunSnapshotNumNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getIscsiLunSnapshotNumNot() {
    return iscsiLunSnapshotNumNot;
  }


  public void setIscsiLunSnapshotNumNot(Integer iscsiLunSnapshotNumNot) {
    this.iscsiLunSnapshotNumNot = iscsiLunSnapshotNumNot;
  }


  public LabelWhereInput iscsiLunSnapshotNumNotIn(List<Integer> iscsiLunSnapshotNumNotIn) {
    
    this.iscsiLunSnapshotNumNotIn = iscsiLunSnapshotNumNotIn;
    return this;
  }

  public LabelWhereInput addIscsiLunSnapshotNumNotInItem(Integer iscsiLunSnapshotNumNotInItem) {
    if (this.iscsiLunSnapshotNumNotIn == null) {
      this.iscsiLunSnapshotNumNotIn = new ArrayList<Integer>();
    }
    this.iscsiLunSnapshotNumNotIn.add(iscsiLunSnapshotNumNotInItem);
    return this;
  }

   /**
   * Get iscsiLunSnapshotNumNotIn
   * @return iscsiLunSnapshotNumNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Integer> getIscsiLunSnapshotNumNotIn() {
    return iscsiLunSnapshotNumNotIn;
  }


  public void setIscsiLunSnapshotNumNotIn(List<Integer> iscsiLunSnapshotNumNotIn) {
    this.iscsiLunSnapshotNumNotIn = iscsiLunSnapshotNumNotIn;
  }


  public LabelWhereInput iscsiLunsEvery(IscsiLunWhereInput iscsiLunsEvery) {
    
    this.iscsiLunsEvery = iscsiLunsEvery;
    return this;
  }

   /**
   * Get iscsiLunsEvery
   * @return iscsiLunsEvery
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public IscsiLunWhereInput getIscsiLunsEvery() {
    return iscsiLunsEvery;
  }


  public void setIscsiLunsEvery(IscsiLunWhereInput iscsiLunsEvery) {
    this.iscsiLunsEvery = iscsiLunsEvery;
  }


  public LabelWhereInput iscsiLunsNone(IscsiLunWhereInput iscsiLunsNone) {
    
    this.iscsiLunsNone = iscsiLunsNone;
    return this;
  }

   /**
   * Get iscsiLunsNone
   * @return iscsiLunsNone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public IscsiLunWhereInput getIscsiLunsNone() {
    return iscsiLunsNone;
  }


  public void setIscsiLunsNone(IscsiLunWhereInput iscsiLunsNone) {
    this.iscsiLunsNone = iscsiLunsNone;
  }


  public LabelWhereInput iscsiLunsSome(IscsiLunWhereInput iscsiLunsSome) {
    
    this.iscsiLunsSome = iscsiLunsSome;
    return this;
  }

   /**
   * Get iscsiLunsSome
   * @return iscsiLunsSome
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public IscsiLunWhereInput getIscsiLunsSome() {
    return iscsiLunsSome;
  }


  public void setIscsiLunsSome(IscsiLunWhereInput iscsiLunsSome) {
    this.iscsiLunsSome = iscsiLunsSome;
  }


  public LabelWhereInput iscsiTargetNum(Integer iscsiTargetNum) {
    
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


  public LabelWhereInput iscsiTargetNumGt(Integer iscsiTargetNumGt) {
    
    this.iscsiTargetNumGt = iscsiTargetNumGt;
    return this;
  }

   /**
   * Get iscsiTargetNumGt
   * @return iscsiTargetNumGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getIscsiTargetNumGt() {
    return iscsiTargetNumGt;
  }


  public void setIscsiTargetNumGt(Integer iscsiTargetNumGt) {
    this.iscsiTargetNumGt = iscsiTargetNumGt;
  }


  public LabelWhereInput iscsiTargetNumGte(Integer iscsiTargetNumGte) {
    
    this.iscsiTargetNumGte = iscsiTargetNumGte;
    return this;
  }

   /**
   * Get iscsiTargetNumGte
   * @return iscsiTargetNumGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getIscsiTargetNumGte() {
    return iscsiTargetNumGte;
  }


  public void setIscsiTargetNumGte(Integer iscsiTargetNumGte) {
    this.iscsiTargetNumGte = iscsiTargetNumGte;
  }


  public LabelWhereInput iscsiTargetNumIn(List<Integer> iscsiTargetNumIn) {
    
    this.iscsiTargetNumIn = iscsiTargetNumIn;
    return this;
  }

  public LabelWhereInput addIscsiTargetNumInItem(Integer iscsiTargetNumInItem) {
    if (this.iscsiTargetNumIn == null) {
      this.iscsiTargetNumIn = new ArrayList<Integer>();
    }
    this.iscsiTargetNumIn.add(iscsiTargetNumInItem);
    return this;
  }

   /**
   * Get iscsiTargetNumIn
   * @return iscsiTargetNumIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Integer> getIscsiTargetNumIn() {
    return iscsiTargetNumIn;
  }


  public void setIscsiTargetNumIn(List<Integer> iscsiTargetNumIn) {
    this.iscsiTargetNumIn = iscsiTargetNumIn;
  }


  public LabelWhereInput iscsiTargetNumLt(Integer iscsiTargetNumLt) {
    
    this.iscsiTargetNumLt = iscsiTargetNumLt;
    return this;
  }

   /**
   * Get iscsiTargetNumLt
   * @return iscsiTargetNumLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getIscsiTargetNumLt() {
    return iscsiTargetNumLt;
  }


  public void setIscsiTargetNumLt(Integer iscsiTargetNumLt) {
    this.iscsiTargetNumLt = iscsiTargetNumLt;
  }


  public LabelWhereInput iscsiTargetNumLte(Integer iscsiTargetNumLte) {
    
    this.iscsiTargetNumLte = iscsiTargetNumLte;
    return this;
  }

   /**
   * Get iscsiTargetNumLte
   * @return iscsiTargetNumLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getIscsiTargetNumLte() {
    return iscsiTargetNumLte;
  }


  public void setIscsiTargetNumLte(Integer iscsiTargetNumLte) {
    this.iscsiTargetNumLte = iscsiTargetNumLte;
  }


  public LabelWhereInput iscsiTargetNumNot(Integer iscsiTargetNumNot) {
    
    this.iscsiTargetNumNot = iscsiTargetNumNot;
    return this;
  }

   /**
   * Get iscsiTargetNumNot
   * @return iscsiTargetNumNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getIscsiTargetNumNot() {
    return iscsiTargetNumNot;
  }


  public void setIscsiTargetNumNot(Integer iscsiTargetNumNot) {
    this.iscsiTargetNumNot = iscsiTargetNumNot;
  }


  public LabelWhereInput iscsiTargetNumNotIn(List<Integer> iscsiTargetNumNotIn) {
    
    this.iscsiTargetNumNotIn = iscsiTargetNumNotIn;
    return this;
  }

  public LabelWhereInput addIscsiTargetNumNotInItem(Integer iscsiTargetNumNotInItem) {
    if (this.iscsiTargetNumNotIn == null) {
      this.iscsiTargetNumNotIn = new ArrayList<Integer>();
    }
    this.iscsiTargetNumNotIn.add(iscsiTargetNumNotInItem);
    return this;
  }

   /**
   * Get iscsiTargetNumNotIn
   * @return iscsiTargetNumNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Integer> getIscsiTargetNumNotIn() {
    return iscsiTargetNumNotIn;
  }


  public void setIscsiTargetNumNotIn(List<Integer> iscsiTargetNumNotIn) {
    this.iscsiTargetNumNotIn = iscsiTargetNumNotIn;
  }


  public LabelWhereInput iscsiTargetsEvery(IscsiTargetWhereInput iscsiTargetsEvery) {
    
    this.iscsiTargetsEvery = iscsiTargetsEvery;
    return this;
  }

   /**
   * Get iscsiTargetsEvery
   * @return iscsiTargetsEvery
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public IscsiTargetWhereInput getIscsiTargetsEvery() {
    return iscsiTargetsEvery;
  }


  public void setIscsiTargetsEvery(IscsiTargetWhereInput iscsiTargetsEvery) {
    this.iscsiTargetsEvery = iscsiTargetsEvery;
  }


  public LabelWhereInput iscsiTargetsNone(IscsiTargetWhereInput iscsiTargetsNone) {
    
    this.iscsiTargetsNone = iscsiTargetsNone;
    return this;
  }

   /**
   * Get iscsiTargetsNone
   * @return iscsiTargetsNone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public IscsiTargetWhereInput getIscsiTargetsNone() {
    return iscsiTargetsNone;
  }


  public void setIscsiTargetsNone(IscsiTargetWhereInput iscsiTargetsNone) {
    this.iscsiTargetsNone = iscsiTargetsNone;
  }


  public LabelWhereInput iscsiTargetsSome(IscsiTargetWhereInput iscsiTargetsSome) {
    
    this.iscsiTargetsSome = iscsiTargetsSome;
    return this;
  }

   /**
   * Get iscsiTargetsSome
   * @return iscsiTargetsSome
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public IscsiTargetWhereInput getIscsiTargetsSome() {
    return iscsiTargetsSome;
  }


  public void setIscsiTargetsSome(IscsiTargetWhereInput iscsiTargetsSome) {
    this.iscsiTargetsSome = iscsiTargetsSome;
  }


  public LabelWhereInput key(String key) {
    
    this.key = key;
    return this;
  }

   /**
   * Get key
   * @return key
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getKey() {
    return key;
  }


  public void setKey(String key) {
    this.key = key;
  }


  public LabelWhereInput keyContains(String keyContains) {
    
    this.keyContains = keyContains;
    return this;
  }

   /**
   * Get keyContains
   * @return keyContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getKeyContains() {
    return keyContains;
  }


  public void setKeyContains(String keyContains) {
    this.keyContains = keyContains;
  }


  public LabelWhereInput keyEndsWith(String keyEndsWith) {
    
    this.keyEndsWith = keyEndsWith;
    return this;
  }

   /**
   * Get keyEndsWith
   * @return keyEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getKeyEndsWith() {
    return keyEndsWith;
  }


  public void setKeyEndsWith(String keyEndsWith) {
    this.keyEndsWith = keyEndsWith;
  }


  public LabelWhereInput keyGt(String keyGt) {
    
    this.keyGt = keyGt;
    return this;
  }

   /**
   * Get keyGt
   * @return keyGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getKeyGt() {
    return keyGt;
  }


  public void setKeyGt(String keyGt) {
    this.keyGt = keyGt;
  }


  public LabelWhereInput keyGte(String keyGte) {
    
    this.keyGte = keyGte;
    return this;
  }

   /**
   * Get keyGte
   * @return keyGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getKeyGte() {
    return keyGte;
  }


  public void setKeyGte(String keyGte) {
    this.keyGte = keyGte;
  }


  public LabelWhereInput keyIn(List<String> keyIn) {
    
    this.keyIn = keyIn;
    return this;
  }

  public LabelWhereInput addKeyInItem(String keyInItem) {
    if (this.keyIn == null) {
      this.keyIn = new ArrayList<String>();
    }
    this.keyIn.add(keyInItem);
    return this;
  }

   /**
   * Get keyIn
   * @return keyIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getKeyIn() {
    return keyIn;
  }


  public void setKeyIn(List<String> keyIn) {
    this.keyIn = keyIn;
  }


  public LabelWhereInput keyLt(String keyLt) {
    
    this.keyLt = keyLt;
    return this;
  }

   /**
   * Get keyLt
   * @return keyLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getKeyLt() {
    return keyLt;
  }


  public void setKeyLt(String keyLt) {
    this.keyLt = keyLt;
  }


  public LabelWhereInput keyLte(String keyLte) {
    
    this.keyLte = keyLte;
    return this;
  }

   /**
   * Get keyLte
   * @return keyLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getKeyLte() {
    return keyLte;
  }


  public void setKeyLte(String keyLte) {
    this.keyLte = keyLte;
  }


  public LabelWhereInput keyNot(String keyNot) {
    
    this.keyNot = keyNot;
    return this;
  }

   /**
   * Get keyNot
   * @return keyNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getKeyNot() {
    return keyNot;
  }


  public void setKeyNot(String keyNot) {
    this.keyNot = keyNot;
  }


  public LabelWhereInput keyNotContains(String keyNotContains) {
    
    this.keyNotContains = keyNotContains;
    return this;
  }

   /**
   * Get keyNotContains
   * @return keyNotContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getKeyNotContains() {
    return keyNotContains;
  }


  public void setKeyNotContains(String keyNotContains) {
    this.keyNotContains = keyNotContains;
  }


  public LabelWhereInput keyNotEndsWith(String keyNotEndsWith) {
    
    this.keyNotEndsWith = keyNotEndsWith;
    return this;
  }

   /**
   * Get keyNotEndsWith
   * @return keyNotEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getKeyNotEndsWith() {
    return keyNotEndsWith;
  }


  public void setKeyNotEndsWith(String keyNotEndsWith) {
    this.keyNotEndsWith = keyNotEndsWith;
  }


  public LabelWhereInput keyNotIn(List<String> keyNotIn) {
    
    this.keyNotIn = keyNotIn;
    return this;
  }

  public LabelWhereInput addKeyNotInItem(String keyNotInItem) {
    if (this.keyNotIn == null) {
      this.keyNotIn = new ArrayList<String>();
    }
    this.keyNotIn.add(keyNotInItem);
    return this;
  }

   /**
   * Get keyNotIn
   * @return keyNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getKeyNotIn() {
    return keyNotIn;
  }


  public void setKeyNotIn(List<String> keyNotIn) {
    this.keyNotIn = keyNotIn;
  }


  public LabelWhereInput keyNotStartsWith(String keyNotStartsWith) {
    
    this.keyNotStartsWith = keyNotStartsWith;
    return this;
  }

   /**
   * Get keyNotStartsWith
   * @return keyNotStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getKeyNotStartsWith() {
    return keyNotStartsWith;
  }


  public void setKeyNotStartsWith(String keyNotStartsWith) {
    this.keyNotStartsWith = keyNotStartsWith;
  }


  public LabelWhereInput keyStartsWith(String keyStartsWith) {
    
    this.keyStartsWith = keyStartsWith;
    return this;
  }

   /**
   * Get keyStartsWith
   * @return keyStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getKeyStartsWith() {
    return keyStartsWith;
  }


  public void setKeyStartsWith(String keyStartsWith) {
    this.keyStartsWith = keyStartsWith;
  }


  public LabelWhereInput nicNum(Integer nicNum) {
    
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


  public LabelWhereInput nicNumGt(Integer nicNumGt) {
    
    this.nicNumGt = nicNumGt;
    return this;
  }

   /**
   * Get nicNumGt
   * @return nicNumGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getNicNumGt() {
    return nicNumGt;
  }


  public void setNicNumGt(Integer nicNumGt) {
    this.nicNumGt = nicNumGt;
  }


  public LabelWhereInput nicNumGte(Integer nicNumGte) {
    
    this.nicNumGte = nicNumGte;
    return this;
  }

   /**
   * Get nicNumGte
   * @return nicNumGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getNicNumGte() {
    return nicNumGte;
  }


  public void setNicNumGte(Integer nicNumGte) {
    this.nicNumGte = nicNumGte;
  }


  public LabelWhereInput nicNumIn(List<Integer> nicNumIn) {
    
    this.nicNumIn = nicNumIn;
    return this;
  }

  public LabelWhereInput addNicNumInItem(Integer nicNumInItem) {
    if (this.nicNumIn == null) {
      this.nicNumIn = new ArrayList<Integer>();
    }
    this.nicNumIn.add(nicNumInItem);
    return this;
  }

   /**
   * Get nicNumIn
   * @return nicNumIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Integer> getNicNumIn() {
    return nicNumIn;
  }


  public void setNicNumIn(List<Integer> nicNumIn) {
    this.nicNumIn = nicNumIn;
  }


  public LabelWhereInput nicNumLt(Integer nicNumLt) {
    
    this.nicNumLt = nicNumLt;
    return this;
  }

   /**
   * Get nicNumLt
   * @return nicNumLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getNicNumLt() {
    return nicNumLt;
  }


  public void setNicNumLt(Integer nicNumLt) {
    this.nicNumLt = nicNumLt;
  }


  public LabelWhereInput nicNumLte(Integer nicNumLte) {
    
    this.nicNumLte = nicNumLte;
    return this;
  }

   /**
   * Get nicNumLte
   * @return nicNumLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getNicNumLte() {
    return nicNumLte;
  }


  public void setNicNumLte(Integer nicNumLte) {
    this.nicNumLte = nicNumLte;
  }


  public LabelWhereInput nicNumNot(Integer nicNumNot) {
    
    this.nicNumNot = nicNumNot;
    return this;
  }

   /**
   * Get nicNumNot
   * @return nicNumNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getNicNumNot() {
    return nicNumNot;
  }


  public void setNicNumNot(Integer nicNumNot) {
    this.nicNumNot = nicNumNot;
  }


  public LabelWhereInput nicNumNotIn(List<Integer> nicNumNotIn) {
    
    this.nicNumNotIn = nicNumNotIn;
    return this;
  }

  public LabelWhereInput addNicNumNotInItem(Integer nicNumNotInItem) {
    if (this.nicNumNotIn == null) {
      this.nicNumNotIn = new ArrayList<Integer>();
    }
    this.nicNumNotIn.add(nicNumNotInItem);
    return this;
  }

   /**
   * Get nicNumNotIn
   * @return nicNumNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Integer> getNicNumNotIn() {
    return nicNumNotIn;
  }


  public void setNicNumNotIn(List<Integer> nicNumNotIn) {
    this.nicNumNotIn = nicNumNotIn;
  }


  public LabelWhereInput nicsEvery(NicWhereInput nicsEvery) {
    
    this.nicsEvery = nicsEvery;
    return this;
  }

   /**
   * Get nicsEvery
   * @return nicsEvery
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public NicWhereInput getNicsEvery() {
    return nicsEvery;
  }


  public void setNicsEvery(NicWhereInput nicsEvery) {
    this.nicsEvery = nicsEvery;
  }


  public LabelWhereInput nicsNone(NicWhereInput nicsNone) {
    
    this.nicsNone = nicsNone;
    return this;
  }

   /**
   * Get nicsNone
   * @return nicsNone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public NicWhereInput getNicsNone() {
    return nicsNone;
  }


  public void setNicsNone(NicWhereInput nicsNone) {
    this.nicsNone = nicsNone;
  }


  public LabelWhereInput nicsSome(NicWhereInput nicsSome) {
    
    this.nicsSome = nicsSome;
    return this;
  }

   /**
   * Get nicsSome
   * @return nicsSome
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public NicWhereInput getNicsSome() {
    return nicsSome;
  }


  public void setNicsSome(NicWhereInput nicsSome) {
    this.nicsSome = nicsSome;
  }


  public LabelWhereInput systemVlanNum(Integer systemVlanNum) {
    
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


  public LabelWhereInput systemVlanNumGt(Integer systemVlanNumGt) {
    
    this.systemVlanNumGt = systemVlanNumGt;
    return this;
  }

   /**
   * Get systemVlanNumGt
   * @return systemVlanNumGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getSystemVlanNumGt() {
    return systemVlanNumGt;
  }


  public void setSystemVlanNumGt(Integer systemVlanNumGt) {
    this.systemVlanNumGt = systemVlanNumGt;
  }


  public LabelWhereInput systemVlanNumGte(Integer systemVlanNumGte) {
    
    this.systemVlanNumGte = systemVlanNumGte;
    return this;
  }

   /**
   * Get systemVlanNumGte
   * @return systemVlanNumGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getSystemVlanNumGte() {
    return systemVlanNumGte;
  }


  public void setSystemVlanNumGte(Integer systemVlanNumGte) {
    this.systemVlanNumGte = systemVlanNumGte;
  }


  public LabelWhereInput systemVlanNumIn(List<Integer> systemVlanNumIn) {
    
    this.systemVlanNumIn = systemVlanNumIn;
    return this;
  }

  public LabelWhereInput addSystemVlanNumInItem(Integer systemVlanNumInItem) {
    if (this.systemVlanNumIn == null) {
      this.systemVlanNumIn = new ArrayList<Integer>();
    }
    this.systemVlanNumIn.add(systemVlanNumInItem);
    return this;
  }

   /**
   * Get systemVlanNumIn
   * @return systemVlanNumIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Integer> getSystemVlanNumIn() {
    return systemVlanNumIn;
  }


  public void setSystemVlanNumIn(List<Integer> systemVlanNumIn) {
    this.systemVlanNumIn = systemVlanNumIn;
  }


  public LabelWhereInput systemVlanNumLt(Integer systemVlanNumLt) {
    
    this.systemVlanNumLt = systemVlanNumLt;
    return this;
  }

   /**
   * Get systemVlanNumLt
   * @return systemVlanNumLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getSystemVlanNumLt() {
    return systemVlanNumLt;
  }


  public void setSystemVlanNumLt(Integer systemVlanNumLt) {
    this.systemVlanNumLt = systemVlanNumLt;
  }


  public LabelWhereInput systemVlanNumLte(Integer systemVlanNumLte) {
    
    this.systemVlanNumLte = systemVlanNumLte;
    return this;
  }

   /**
   * Get systemVlanNumLte
   * @return systemVlanNumLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getSystemVlanNumLte() {
    return systemVlanNumLte;
  }


  public void setSystemVlanNumLte(Integer systemVlanNumLte) {
    this.systemVlanNumLte = systemVlanNumLte;
  }


  public LabelWhereInput systemVlanNumNot(Integer systemVlanNumNot) {
    
    this.systemVlanNumNot = systemVlanNumNot;
    return this;
  }

   /**
   * Get systemVlanNumNot
   * @return systemVlanNumNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getSystemVlanNumNot() {
    return systemVlanNumNot;
  }


  public void setSystemVlanNumNot(Integer systemVlanNumNot) {
    this.systemVlanNumNot = systemVlanNumNot;
  }


  public LabelWhereInput systemVlanNumNotIn(List<Integer> systemVlanNumNotIn) {
    
    this.systemVlanNumNotIn = systemVlanNumNotIn;
    return this;
  }

  public LabelWhereInput addSystemVlanNumNotInItem(Integer systemVlanNumNotInItem) {
    if (this.systemVlanNumNotIn == null) {
      this.systemVlanNumNotIn = new ArrayList<Integer>();
    }
    this.systemVlanNumNotIn.add(systemVlanNumNotInItem);
    return this;
  }

   /**
   * Get systemVlanNumNotIn
   * @return systemVlanNumNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Integer> getSystemVlanNumNotIn() {
    return systemVlanNumNotIn;
  }


  public void setSystemVlanNumNotIn(List<Integer> systemVlanNumNotIn) {
    this.systemVlanNumNotIn = systemVlanNumNotIn;
  }


  public LabelWhereInput totalNum(Integer totalNum) {
    
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


  public LabelWhereInput totalNumGt(Integer totalNumGt) {
    
    this.totalNumGt = totalNumGt;
    return this;
  }

   /**
   * Get totalNumGt
   * @return totalNumGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getTotalNumGt() {
    return totalNumGt;
  }


  public void setTotalNumGt(Integer totalNumGt) {
    this.totalNumGt = totalNumGt;
  }


  public LabelWhereInput totalNumGte(Integer totalNumGte) {
    
    this.totalNumGte = totalNumGte;
    return this;
  }

   /**
   * Get totalNumGte
   * @return totalNumGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getTotalNumGte() {
    return totalNumGte;
  }


  public void setTotalNumGte(Integer totalNumGte) {
    this.totalNumGte = totalNumGte;
  }


  public LabelWhereInput totalNumIn(List<Integer> totalNumIn) {
    
    this.totalNumIn = totalNumIn;
    return this;
  }

  public LabelWhereInput addTotalNumInItem(Integer totalNumInItem) {
    if (this.totalNumIn == null) {
      this.totalNumIn = new ArrayList<Integer>();
    }
    this.totalNumIn.add(totalNumInItem);
    return this;
  }

   /**
   * Get totalNumIn
   * @return totalNumIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Integer> getTotalNumIn() {
    return totalNumIn;
  }


  public void setTotalNumIn(List<Integer> totalNumIn) {
    this.totalNumIn = totalNumIn;
  }


  public LabelWhereInput totalNumLt(Integer totalNumLt) {
    
    this.totalNumLt = totalNumLt;
    return this;
  }

   /**
   * Get totalNumLt
   * @return totalNumLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getTotalNumLt() {
    return totalNumLt;
  }


  public void setTotalNumLt(Integer totalNumLt) {
    this.totalNumLt = totalNumLt;
  }


  public LabelWhereInput totalNumLte(Integer totalNumLte) {
    
    this.totalNumLte = totalNumLte;
    return this;
  }

   /**
   * Get totalNumLte
   * @return totalNumLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getTotalNumLte() {
    return totalNumLte;
  }


  public void setTotalNumLte(Integer totalNumLte) {
    this.totalNumLte = totalNumLte;
  }


  public LabelWhereInput totalNumNot(Integer totalNumNot) {
    
    this.totalNumNot = totalNumNot;
    return this;
  }

   /**
   * Get totalNumNot
   * @return totalNumNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getTotalNumNot() {
    return totalNumNot;
  }


  public void setTotalNumNot(Integer totalNumNot) {
    this.totalNumNot = totalNumNot;
  }


  public LabelWhereInput totalNumNotIn(List<Integer> totalNumNotIn) {
    
    this.totalNumNotIn = totalNumNotIn;
    return this;
  }

  public LabelWhereInput addTotalNumNotInItem(Integer totalNumNotInItem) {
    if (this.totalNumNotIn == null) {
      this.totalNumNotIn = new ArrayList<Integer>();
    }
    this.totalNumNotIn.add(totalNumNotInItem);
    return this;
  }

   /**
   * Get totalNumNotIn
   * @return totalNumNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Integer> getTotalNumNotIn() {
    return totalNumNotIn;
  }


  public void setTotalNumNotIn(List<Integer> totalNumNotIn) {
    this.totalNumNotIn = totalNumNotIn;
  }


  public LabelWhereInput value(String value) {
    
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


  public LabelWhereInput valueContains(String valueContains) {
    
    this.valueContains = valueContains;
    return this;
  }

   /**
   * Get valueContains
   * @return valueContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getValueContains() {
    return valueContains;
  }


  public void setValueContains(String valueContains) {
    this.valueContains = valueContains;
  }


  public LabelWhereInput valueEndsWith(String valueEndsWith) {
    
    this.valueEndsWith = valueEndsWith;
    return this;
  }

   /**
   * Get valueEndsWith
   * @return valueEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getValueEndsWith() {
    return valueEndsWith;
  }


  public void setValueEndsWith(String valueEndsWith) {
    this.valueEndsWith = valueEndsWith;
  }


  public LabelWhereInput valueGt(String valueGt) {
    
    this.valueGt = valueGt;
    return this;
  }

   /**
   * Get valueGt
   * @return valueGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getValueGt() {
    return valueGt;
  }


  public void setValueGt(String valueGt) {
    this.valueGt = valueGt;
  }


  public LabelWhereInput valueGte(String valueGte) {
    
    this.valueGte = valueGte;
    return this;
  }

   /**
   * Get valueGte
   * @return valueGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getValueGte() {
    return valueGte;
  }


  public void setValueGte(String valueGte) {
    this.valueGte = valueGte;
  }


  public LabelWhereInput valueIn(List<String> valueIn) {
    
    this.valueIn = valueIn;
    return this;
  }

  public LabelWhereInput addValueInItem(String valueInItem) {
    if (this.valueIn == null) {
      this.valueIn = new ArrayList<String>();
    }
    this.valueIn.add(valueInItem);
    return this;
  }

   /**
   * Get valueIn
   * @return valueIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getValueIn() {
    return valueIn;
  }


  public void setValueIn(List<String> valueIn) {
    this.valueIn = valueIn;
  }


  public LabelWhereInput valueLt(String valueLt) {
    
    this.valueLt = valueLt;
    return this;
  }

   /**
   * Get valueLt
   * @return valueLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getValueLt() {
    return valueLt;
  }


  public void setValueLt(String valueLt) {
    this.valueLt = valueLt;
  }


  public LabelWhereInput valueLte(String valueLte) {
    
    this.valueLte = valueLte;
    return this;
  }

   /**
   * Get valueLte
   * @return valueLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getValueLte() {
    return valueLte;
  }


  public void setValueLte(String valueLte) {
    this.valueLte = valueLte;
  }


  public LabelWhereInput valueNot(String valueNot) {
    
    this.valueNot = valueNot;
    return this;
  }

   /**
   * Get valueNot
   * @return valueNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getValueNot() {
    return valueNot;
  }


  public void setValueNot(String valueNot) {
    this.valueNot = valueNot;
  }


  public LabelWhereInput valueNotContains(String valueNotContains) {
    
    this.valueNotContains = valueNotContains;
    return this;
  }

   /**
   * Get valueNotContains
   * @return valueNotContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getValueNotContains() {
    return valueNotContains;
  }


  public void setValueNotContains(String valueNotContains) {
    this.valueNotContains = valueNotContains;
  }


  public LabelWhereInput valueNotEndsWith(String valueNotEndsWith) {
    
    this.valueNotEndsWith = valueNotEndsWith;
    return this;
  }

   /**
   * Get valueNotEndsWith
   * @return valueNotEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getValueNotEndsWith() {
    return valueNotEndsWith;
  }


  public void setValueNotEndsWith(String valueNotEndsWith) {
    this.valueNotEndsWith = valueNotEndsWith;
  }


  public LabelWhereInput valueNotIn(List<String> valueNotIn) {
    
    this.valueNotIn = valueNotIn;
    return this;
  }

  public LabelWhereInput addValueNotInItem(String valueNotInItem) {
    if (this.valueNotIn == null) {
      this.valueNotIn = new ArrayList<String>();
    }
    this.valueNotIn.add(valueNotInItem);
    return this;
  }

   /**
   * Get valueNotIn
   * @return valueNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getValueNotIn() {
    return valueNotIn;
  }


  public void setValueNotIn(List<String> valueNotIn) {
    this.valueNotIn = valueNotIn;
  }


  public LabelWhereInput valueNotStartsWith(String valueNotStartsWith) {
    
    this.valueNotStartsWith = valueNotStartsWith;
    return this;
  }

   /**
   * Get valueNotStartsWith
   * @return valueNotStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getValueNotStartsWith() {
    return valueNotStartsWith;
  }


  public void setValueNotStartsWith(String valueNotStartsWith) {
    this.valueNotStartsWith = valueNotStartsWith;
  }


  public LabelWhereInput valueStartsWith(String valueStartsWith) {
    
    this.valueStartsWith = valueStartsWith;
    return this;
  }

   /**
   * Get valueStartsWith
   * @return valueStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getValueStartsWith() {
    return valueStartsWith;
  }


  public void setValueStartsWith(String valueStartsWith) {
    this.valueStartsWith = valueStartsWith;
  }


  public LabelWhereInput vdsNum(Integer vdsNum) {
    
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


  public LabelWhereInput vdsNumGt(Integer vdsNumGt) {
    
    this.vdsNumGt = vdsNumGt;
    return this;
  }

   /**
   * Get vdsNumGt
   * @return vdsNumGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getVdsNumGt() {
    return vdsNumGt;
  }


  public void setVdsNumGt(Integer vdsNumGt) {
    this.vdsNumGt = vdsNumGt;
  }


  public LabelWhereInput vdsNumGte(Integer vdsNumGte) {
    
    this.vdsNumGte = vdsNumGte;
    return this;
  }

   /**
   * Get vdsNumGte
   * @return vdsNumGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getVdsNumGte() {
    return vdsNumGte;
  }


  public void setVdsNumGte(Integer vdsNumGte) {
    this.vdsNumGte = vdsNumGte;
  }


  public LabelWhereInput vdsNumIn(List<Integer> vdsNumIn) {
    
    this.vdsNumIn = vdsNumIn;
    return this;
  }

  public LabelWhereInput addVdsNumInItem(Integer vdsNumInItem) {
    if (this.vdsNumIn == null) {
      this.vdsNumIn = new ArrayList<Integer>();
    }
    this.vdsNumIn.add(vdsNumInItem);
    return this;
  }

   /**
   * Get vdsNumIn
   * @return vdsNumIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Integer> getVdsNumIn() {
    return vdsNumIn;
  }


  public void setVdsNumIn(List<Integer> vdsNumIn) {
    this.vdsNumIn = vdsNumIn;
  }


  public LabelWhereInput vdsNumLt(Integer vdsNumLt) {
    
    this.vdsNumLt = vdsNumLt;
    return this;
  }

   /**
   * Get vdsNumLt
   * @return vdsNumLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getVdsNumLt() {
    return vdsNumLt;
  }


  public void setVdsNumLt(Integer vdsNumLt) {
    this.vdsNumLt = vdsNumLt;
  }


  public LabelWhereInput vdsNumLte(Integer vdsNumLte) {
    
    this.vdsNumLte = vdsNumLte;
    return this;
  }

   /**
   * Get vdsNumLte
   * @return vdsNumLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getVdsNumLte() {
    return vdsNumLte;
  }


  public void setVdsNumLte(Integer vdsNumLte) {
    this.vdsNumLte = vdsNumLte;
  }


  public LabelWhereInput vdsNumNot(Integer vdsNumNot) {
    
    this.vdsNumNot = vdsNumNot;
    return this;
  }

   /**
   * Get vdsNumNot
   * @return vdsNumNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getVdsNumNot() {
    return vdsNumNot;
  }


  public void setVdsNumNot(Integer vdsNumNot) {
    this.vdsNumNot = vdsNumNot;
  }


  public LabelWhereInput vdsNumNotIn(List<Integer> vdsNumNotIn) {
    
    this.vdsNumNotIn = vdsNumNotIn;
    return this;
  }

  public LabelWhereInput addVdsNumNotInItem(Integer vdsNumNotInItem) {
    if (this.vdsNumNotIn == null) {
      this.vdsNumNotIn = new ArrayList<Integer>();
    }
    this.vdsNumNotIn.add(vdsNumNotInItem);
    return this;
  }

   /**
   * Get vdsNumNotIn
   * @return vdsNumNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Integer> getVdsNumNotIn() {
    return vdsNumNotIn;
  }


  public void setVdsNumNotIn(List<Integer> vdsNumNotIn) {
    this.vdsNumNotIn = vdsNumNotIn;
  }


  public LabelWhereInput vdsesEvery(VdsWhereInput vdsesEvery) {
    
    this.vdsesEvery = vdsesEvery;
    return this;
  }

   /**
   * Get vdsesEvery
   * @return vdsesEvery
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VdsWhereInput getVdsesEvery() {
    return vdsesEvery;
  }


  public void setVdsesEvery(VdsWhereInput vdsesEvery) {
    this.vdsesEvery = vdsesEvery;
  }


  public LabelWhereInput vdsesNone(VdsWhereInput vdsesNone) {
    
    this.vdsesNone = vdsesNone;
    return this;
  }

   /**
   * Get vdsesNone
   * @return vdsesNone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VdsWhereInput getVdsesNone() {
    return vdsesNone;
  }


  public void setVdsesNone(VdsWhereInput vdsesNone) {
    this.vdsesNone = vdsesNone;
  }


  public LabelWhereInput vdsesSome(VdsWhereInput vdsesSome) {
    
    this.vdsesSome = vdsesSome;
    return this;
  }

   /**
   * Get vdsesSome
   * @return vdsesSome
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VdsWhereInput getVdsesSome() {
    return vdsesSome;
  }


  public void setVdsesSome(VdsWhereInput vdsesSome) {
    this.vdsesSome = vdsesSome;
  }


  public LabelWhereInput vlansEvery(VlanWhereInput vlansEvery) {
    
    this.vlansEvery = vlansEvery;
    return this;
  }

   /**
   * Get vlansEvery
   * @return vlansEvery
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VlanWhereInput getVlansEvery() {
    return vlansEvery;
  }


  public void setVlansEvery(VlanWhereInput vlansEvery) {
    this.vlansEvery = vlansEvery;
  }


  public LabelWhereInput vlansNone(VlanWhereInput vlansNone) {
    
    this.vlansNone = vlansNone;
    return this;
  }

   /**
   * Get vlansNone
   * @return vlansNone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VlanWhereInput getVlansNone() {
    return vlansNone;
  }


  public void setVlansNone(VlanWhereInput vlansNone) {
    this.vlansNone = vlansNone;
  }


  public LabelWhereInput vlansSome(VlanWhereInput vlansSome) {
    
    this.vlansSome = vlansSome;
    return this;
  }

   /**
   * Get vlansSome
   * @return vlansSome
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VlanWhereInput getVlansSome() {
    return vlansSome;
  }


  public void setVlansSome(VlanWhereInput vlansSome) {
    this.vlansSome = vlansSome;
  }


  public LabelWhereInput vmNum(Integer vmNum) {
    
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


  public LabelWhereInput vmNumGt(Integer vmNumGt) {
    
    this.vmNumGt = vmNumGt;
    return this;
  }

   /**
   * Get vmNumGt
   * @return vmNumGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getVmNumGt() {
    return vmNumGt;
  }


  public void setVmNumGt(Integer vmNumGt) {
    this.vmNumGt = vmNumGt;
  }


  public LabelWhereInput vmNumGte(Integer vmNumGte) {
    
    this.vmNumGte = vmNumGte;
    return this;
  }

   /**
   * Get vmNumGte
   * @return vmNumGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getVmNumGte() {
    return vmNumGte;
  }


  public void setVmNumGte(Integer vmNumGte) {
    this.vmNumGte = vmNumGte;
  }


  public LabelWhereInput vmNumIn(List<Integer> vmNumIn) {
    
    this.vmNumIn = vmNumIn;
    return this;
  }

  public LabelWhereInput addVmNumInItem(Integer vmNumInItem) {
    if (this.vmNumIn == null) {
      this.vmNumIn = new ArrayList<Integer>();
    }
    this.vmNumIn.add(vmNumInItem);
    return this;
  }

   /**
   * Get vmNumIn
   * @return vmNumIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Integer> getVmNumIn() {
    return vmNumIn;
  }


  public void setVmNumIn(List<Integer> vmNumIn) {
    this.vmNumIn = vmNumIn;
  }


  public LabelWhereInput vmNumLt(Integer vmNumLt) {
    
    this.vmNumLt = vmNumLt;
    return this;
  }

   /**
   * Get vmNumLt
   * @return vmNumLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getVmNumLt() {
    return vmNumLt;
  }


  public void setVmNumLt(Integer vmNumLt) {
    this.vmNumLt = vmNumLt;
  }


  public LabelWhereInput vmNumLte(Integer vmNumLte) {
    
    this.vmNumLte = vmNumLte;
    return this;
  }

   /**
   * Get vmNumLte
   * @return vmNumLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getVmNumLte() {
    return vmNumLte;
  }


  public void setVmNumLte(Integer vmNumLte) {
    this.vmNumLte = vmNumLte;
  }


  public LabelWhereInput vmNumNot(Integer vmNumNot) {
    
    this.vmNumNot = vmNumNot;
    return this;
  }

   /**
   * Get vmNumNot
   * @return vmNumNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getVmNumNot() {
    return vmNumNot;
  }


  public void setVmNumNot(Integer vmNumNot) {
    this.vmNumNot = vmNumNot;
  }


  public LabelWhereInput vmNumNotIn(List<Integer> vmNumNotIn) {
    
    this.vmNumNotIn = vmNumNotIn;
    return this;
  }

  public LabelWhereInput addVmNumNotInItem(Integer vmNumNotInItem) {
    if (this.vmNumNotIn == null) {
      this.vmNumNotIn = new ArrayList<Integer>();
    }
    this.vmNumNotIn.add(vmNumNotInItem);
    return this;
  }

   /**
   * Get vmNumNotIn
   * @return vmNumNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Integer> getVmNumNotIn() {
    return vmNumNotIn;
  }


  public void setVmNumNotIn(List<Integer> vmNumNotIn) {
    this.vmNumNotIn = vmNumNotIn;
  }


  public LabelWhereInput vmSnapshotNum(Integer vmSnapshotNum) {
    
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


  public LabelWhereInput vmSnapshotNumGt(Integer vmSnapshotNumGt) {
    
    this.vmSnapshotNumGt = vmSnapshotNumGt;
    return this;
  }

   /**
   * Get vmSnapshotNumGt
   * @return vmSnapshotNumGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getVmSnapshotNumGt() {
    return vmSnapshotNumGt;
  }


  public void setVmSnapshotNumGt(Integer vmSnapshotNumGt) {
    this.vmSnapshotNumGt = vmSnapshotNumGt;
  }


  public LabelWhereInput vmSnapshotNumGte(Integer vmSnapshotNumGte) {
    
    this.vmSnapshotNumGte = vmSnapshotNumGte;
    return this;
  }

   /**
   * Get vmSnapshotNumGte
   * @return vmSnapshotNumGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getVmSnapshotNumGte() {
    return vmSnapshotNumGte;
  }


  public void setVmSnapshotNumGte(Integer vmSnapshotNumGte) {
    this.vmSnapshotNumGte = vmSnapshotNumGte;
  }


  public LabelWhereInput vmSnapshotNumIn(List<Integer> vmSnapshotNumIn) {
    
    this.vmSnapshotNumIn = vmSnapshotNumIn;
    return this;
  }

  public LabelWhereInput addVmSnapshotNumInItem(Integer vmSnapshotNumInItem) {
    if (this.vmSnapshotNumIn == null) {
      this.vmSnapshotNumIn = new ArrayList<Integer>();
    }
    this.vmSnapshotNumIn.add(vmSnapshotNumInItem);
    return this;
  }

   /**
   * Get vmSnapshotNumIn
   * @return vmSnapshotNumIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Integer> getVmSnapshotNumIn() {
    return vmSnapshotNumIn;
  }


  public void setVmSnapshotNumIn(List<Integer> vmSnapshotNumIn) {
    this.vmSnapshotNumIn = vmSnapshotNumIn;
  }


  public LabelWhereInput vmSnapshotNumLt(Integer vmSnapshotNumLt) {
    
    this.vmSnapshotNumLt = vmSnapshotNumLt;
    return this;
  }

   /**
   * Get vmSnapshotNumLt
   * @return vmSnapshotNumLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getVmSnapshotNumLt() {
    return vmSnapshotNumLt;
  }


  public void setVmSnapshotNumLt(Integer vmSnapshotNumLt) {
    this.vmSnapshotNumLt = vmSnapshotNumLt;
  }


  public LabelWhereInput vmSnapshotNumLte(Integer vmSnapshotNumLte) {
    
    this.vmSnapshotNumLte = vmSnapshotNumLte;
    return this;
  }

   /**
   * Get vmSnapshotNumLte
   * @return vmSnapshotNumLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getVmSnapshotNumLte() {
    return vmSnapshotNumLte;
  }


  public void setVmSnapshotNumLte(Integer vmSnapshotNumLte) {
    this.vmSnapshotNumLte = vmSnapshotNumLte;
  }


  public LabelWhereInput vmSnapshotNumNot(Integer vmSnapshotNumNot) {
    
    this.vmSnapshotNumNot = vmSnapshotNumNot;
    return this;
  }

   /**
   * Get vmSnapshotNumNot
   * @return vmSnapshotNumNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getVmSnapshotNumNot() {
    return vmSnapshotNumNot;
  }


  public void setVmSnapshotNumNot(Integer vmSnapshotNumNot) {
    this.vmSnapshotNumNot = vmSnapshotNumNot;
  }


  public LabelWhereInput vmSnapshotNumNotIn(List<Integer> vmSnapshotNumNotIn) {
    
    this.vmSnapshotNumNotIn = vmSnapshotNumNotIn;
    return this;
  }

  public LabelWhereInput addVmSnapshotNumNotInItem(Integer vmSnapshotNumNotInItem) {
    if (this.vmSnapshotNumNotIn == null) {
      this.vmSnapshotNumNotIn = new ArrayList<Integer>();
    }
    this.vmSnapshotNumNotIn.add(vmSnapshotNumNotInItem);
    return this;
  }

   /**
   * Get vmSnapshotNumNotIn
   * @return vmSnapshotNumNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Integer> getVmSnapshotNumNotIn() {
    return vmSnapshotNumNotIn;
  }


  public void setVmSnapshotNumNotIn(List<Integer> vmSnapshotNumNotIn) {
    this.vmSnapshotNumNotIn = vmSnapshotNumNotIn;
  }


  public LabelWhereInput vmSnapshotsEvery(VmSnapshotWhereInput vmSnapshotsEvery) {
    
    this.vmSnapshotsEvery = vmSnapshotsEvery;
    return this;
  }

   /**
   * Get vmSnapshotsEvery
   * @return vmSnapshotsEvery
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VmSnapshotWhereInput getVmSnapshotsEvery() {
    return vmSnapshotsEvery;
  }


  public void setVmSnapshotsEvery(VmSnapshotWhereInput vmSnapshotsEvery) {
    this.vmSnapshotsEvery = vmSnapshotsEvery;
  }


  public LabelWhereInput vmSnapshotsNone(VmSnapshotWhereInput vmSnapshotsNone) {
    
    this.vmSnapshotsNone = vmSnapshotsNone;
    return this;
  }

   /**
   * Get vmSnapshotsNone
   * @return vmSnapshotsNone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VmSnapshotWhereInput getVmSnapshotsNone() {
    return vmSnapshotsNone;
  }


  public void setVmSnapshotsNone(VmSnapshotWhereInput vmSnapshotsNone) {
    this.vmSnapshotsNone = vmSnapshotsNone;
  }


  public LabelWhereInput vmSnapshotsSome(VmSnapshotWhereInput vmSnapshotsSome) {
    
    this.vmSnapshotsSome = vmSnapshotsSome;
    return this;
  }

   /**
   * Get vmSnapshotsSome
   * @return vmSnapshotsSome
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VmSnapshotWhereInput getVmSnapshotsSome() {
    return vmSnapshotsSome;
  }


  public void setVmSnapshotsSome(VmSnapshotWhereInput vmSnapshotsSome) {
    this.vmSnapshotsSome = vmSnapshotsSome;
  }


  public LabelWhereInput vmTemplateNum(Integer vmTemplateNum) {
    
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


  public LabelWhereInput vmTemplateNumGt(Integer vmTemplateNumGt) {
    
    this.vmTemplateNumGt = vmTemplateNumGt;
    return this;
  }

   /**
   * Get vmTemplateNumGt
   * @return vmTemplateNumGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getVmTemplateNumGt() {
    return vmTemplateNumGt;
  }


  public void setVmTemplateNumGt(Integer vmTemplateNumGt) {
    this.vmTemplateNumGt = vmTemplateNumGt;
  }


  public LabelWhereInput vmTemplateNumGte(Integer vmTemplateNumGte) {
    
    this.vmTemplateNumGte = vmTemplateNumGte;
    return this;
  }

   /**
   * Get vmTemplateNumGte
   * @return vmTemplateNumGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getVmTemplateNumGte() {
    return vmTemplateNumGte;
  }


  public void setVmTemplateNumGte(Integer vmTemplateNumGte) {
    this.vmTemplateNumGte = vmTemplateNumGte;
  }


  public LabelWhereInput vmTemplateNumIn(List<Integer> vmTemplateNumIn) {
    
    this.vmTemplateNumIn = vmTemplateNumIn;
    return this;
  }

  public LabelWhereInput addVmTemplateNumInItem(Integer vmTemplateNumInItem) {
    if (this.vmTemplateNumIn == null) {
      this.vmTemplateNumIn = new ArrayList<Integer>();
    }
    this.vmTemplateNumIn.add(vmTemplateNumInItem);
    return this;
  }

   /**
   * Get vmTemplateNumIn
   * @return vmTemplateNumIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Integer> getVmTemplateNumIn() {
    return vmTemplateNumIn;
  }


  public void setVmTemplateNumIn(List<Integer> vmTemplateNumIn) {
    this.vmTemplateNumIn = vmTemplateNumIn;
  }


  public LabelWhereInput vmTemplateNumLt(Integer vmTemplateNumLt) {
    
    this.vmTemplateNumLt = vmTemplateNumLt;
    return this;
  }

   /**
   * Get vmTemplateNumLt
   * @return vmTemplateNumLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getVmTemplateNumLt() {
    return vmTemplateNumLt;
  }


  public void setVmTemplateNumLt(Integer vmTemplateNumLt) {
    this.vmTemplateNumLt = vmTemplateNumLt;
  }


  public LabelWhereInput vmTemplateNumLte(Integer vmTemplateNumLte) {
    
    this.vmTemplateNumLte = vmTemplateNumLte;
    return this;
  }

   /**
   * Get vmTemplateNumLte
   * @return vmTemplateNumLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getVmTemplateNumLte() {
    return vmTemplateNumLte;
  }


  public void setVmTemplateNumLte(Integer vmTemplateNumLte) {
    this.vmTemplateNumLte = vmTemplateNumLte;
  }


  public LabelWhereInput vmTemplateNumNot(Integer vmTemplateNumNot) {
    
    this.vmTemplateNumNot = vmTemplateNumNot;
    return this;
  }

   /**
   * Get vmTemplateNumNot
   * @return vmTemplateNumNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getVmTemplateNumNot() {
    return vmTemplateNumNot;
  }


  public void setVmTemplateNumNot(Integer vmTemplateNumNot) {
    this.vmTemplateNumNot = vmTemplateNumNot;
  }


  public LabelWhereInput vmTemplateNumNotIn(List<Integer> vmTemplateNumNotIn) {
    
    this.vmTemplateNumNotIn = vmTemplateNumNotIn;
    return this;
  }

  public LabelWhereInput addVmTemplateNumNotInItem(Integer vmTemplateNumNotInItem) {
    if (this.vmTemplateNumNotIn == null) {
      this.vmTemplateNumNotIn = new ArrayList<Integer>();
    }
    this.vmTemplateNumNotIn.add(vmTemplateNumNotInItem);
    return this;
  }

   /**
   * Get vmTemplateNumNotIn
   * @return vmTemplateNumNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Integer> getVmTemplateNumNotIn() {
    return vmTemplateNumNotIn;
  }


  public void setVmTemplateNumNotIn(List<Integer> vmTemplateNumNotIn) {
    this.vmTemplateNumNotIn = vmTemplateNumNotIn;
  }


  public LabelWhereInput vmTemplatesEvery(VmTemplateWhereInput vmTemplatesEvery) {
    
    this.vmTemplatesEvery = vmTemplatesEvery;
    return this;
  }

   /**
   * Get vmTemplatesEvery
   * @return vmTemplatesEvery
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VmTemplateWhereInput getVmTemplatesEvery() {
    return vmTemplatesEvery;
  }


  public void setVmTemplatesEvery(VmTemplateWhereInput vmTemplatesEvery) {
    this.vmTemplatesEvery = vmTemplatesEvery;
  }


  public LabelWhereInput vmTemplatesNone(VmTemplateWhereInput vmTemplatesNone) {
    
    this.vmTemplatesNone = vmTemplatesNone;
    return this;
  }

   /**
   * Get vmTemplatesNone
   * @return vmTemplatesNone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VmTemplateWhereInput getVmTemplatesNone() {
    return vmTemplatesNone;
  }


  public void setVmTemplatesNone(VmTemplateWhereInput vmTemplatesNone) {
    this.vmTemplatesNone = vmTemplatesNone;
  }


  public LabelWhereInput vmTemplatesSome(VmTemplateWhereInput vmTemplatesSome) {
    
    this.vmTemplatesSome = vmTemplatesSome;
    return this;
  }

   /**
   * Get vmTemplatesSome
   * @return vmTemplatesSome
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VmTemplateWhereInput getVmTemplatesSome() {
    return vmTemplatesSome;
  }


  public void setVmTemplatesSome(VmTemplateWhereInput vmTemplatesSome) {
    this.vmTemplatesSome = vmTemplatesSome;
  }


  public LabelWhereInput vmVlanNum(Integer vmVlanNum) {
    
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


  public LabelWhereInput vmVlanNumGt(Integer vmVlanNumGt) {
    
    this.vmVlanNumGt = vmVlanNumGt;
    return this;
  }

   /**
   * Get vmVlanNumGt
   * @return vmVlanNumGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getVmVlanNumGt() {
    return vmVlanNumGt;
  }


  public void setVmVlanNumGt(Integer vmVlanNumGt) {
    this.vmVlanNumGt = vmVlanNumGt;
  }


  public LabelWhereInput vmVlanNumGte(Integer vmVlanNumGte) {
    
    this.vmVlanNumGte = vmVlanNumGte;
    return this;
  }

   /**
   * Get vmVlanNumGte
   * @return vmVlanNumGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getVmVlanNumGte() {
    return vmVlanNumGte;
  }


  public void setVmVlanNumGte(Integer vmVlanNumGte) {
    this.vmVlanNumGte = vmVlanNumGte;
  }


  public LabelWhereInput vmVlanNumIn(List<Integer> vmVlanNumIn) {
    
    this.vmVlanNumIn = vmVlanNumIn;
    return this;
  }

  public LabelWhereInput addVmVlanNumInItem(Integer vmVlanNumInItem) {
    if (this.vmVlanNumIn == null) {
      this.vmVlanNumIn = new ArrayList<Integer>();
    }
    this.vmVlanNumIn.add(vmVlanNumInItem);
    return this;
  }

   /**
   * Get vmVlanNumIn
   * @return vmVlanNumIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Integer> getVmVlanNumIn() {
    return vmVlanNumIn;
  }


  public void setVmVlanNumIn(List<Integer> vmVlanNumIn) {
    this.vmVlanNumIn = vmVlanNumIn;
  }


  public LabelWhereInput vmVlanNumLt(Integer vmVlanNumLt) {
    
    this.vmVlanNumLt = vmVlanNumLt;
    return this;
  }

   /**
   * Get vmVlanNumLt
   * @return vmVlanNumLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getVmVlanNumLt() {
    return vmVlanNumLt;
  }


  public void setVmVlanNumLt(Integer vmVlanNumLt) {
    this.vmVlanNumLt = vmVlanNumLt;
  }


  public LabelWhereInput vmVlanNumLte(Integer vmVlanNumLte) {
    
    this.vmVlanNumLte = vmVlanNumLte;
    return this;
  }

   /**
   * Get vmVlanNumLte
   * @return vmVlanNumLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getVmVlanNumLte() {
    return vmVlanNumLte;
  }


  public void setVmVlanNumLte(Integer vmVlanNumLte) {
    this.vmVlanNumLte = vmVlanNumLte;
  }


  public LabelWhereInput vmVlanNumNot(Integer vmVlanNumNot) {
    
    this.vmVlanNumNot = vmVlanNumNot;
    return this;
  }

   /**
   * Get vmVlanNumNot
   * @return vmVlanNumNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getVmVlanNumNot() {
    return vmVlanNumNot;
  }


  public void setVmVlanNumNot(Integer vmVlanNumNot) {
    this.vmVlanNumNot = vmVlanNumNot;
  }


  public LabelWhereInput vmVlanNumNotIn(List<Integer> vmVlanNumNotIn) {
    
    this.vmVlanNumNotIn = vmVlanNumNotIn;
    return this;
  }

  public LabelWhereInput addVmVlanNumNotInItem(Integer vmVlanNumNotInItem) {
    if (this.vmVlanNumNotIn == null) {
      this.vmVlanNumNotIn = new ArrayList<Integer>();
    }
    this.vmVlanNumNotIn.add(vmVlanNumNotInItem);
    return this;
  }

   /**
   * Get vmVlanNumNotIn
   * @return vmVlanNumNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Integer> getVmVlanNumNotIn() {
    return vmVlanNumNotIn;
  }


  public void setVmVlanNumNotIn(List<Integer> vmVlanNumNotIn) {
    this.vmVlanNumNotIn = vmVlanNumNotIn;
  }


  public LabelWhereInput vmVolumeNum(Integer vmVolumeNum) {
    
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


  public LabelWhereInput vmVolumeNumGt(Integer vmVolumeNumGt) {
    
    this.vmVolumeNumGt = vmVolumeNumGt;
    return this;
  }

   /**
   * Get vmVolumeNumGt
   * @return vmVolumeNumGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getVmVolumeNumGt() {
    return vmVolumeNumGt;
  }


  public void setVmVolumeNumGt(Integer vmVolumeNumGt) {
    this.vmVolumeNumGt = vmVolumeNumGt;
  }


  public LabelWhereInput vmVolumeNumGte(Integer vmVolumeNumGte) {
    
    this.vmVolumeNumGte = vmVolumeNumGte;
    return this;
  }

   /**
   * Get vmVolumeNumGte
   * @return vmVolumeNumGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getVmVolumeNumGte() {
    return vmVolumeNumGte;
  }


  public void setVmVolumeNumGte(Integer vmVolumeNumGte) {
    this.vmVolumeNumGte = vmVolumeNumGte;
  }


  public LabelWhereInput vmVolumeNumIn(List<Integer> vmVolumeNumIn) {
    
    this.vmVolumeNumIn = vmVolumeNumIn;
    return this;
  }

  public LabelWhereInput addVmVolumeNumInItem(Integer vmVolumeNumInItem) {
    if (this.vmVolumeNumIn == null) {
      this.vmVolumeNumIn = new ArrayList<Integer>();
    }
    this.vmVolumeNumIn.add(vmVolumeNumInItem);
    return this;
  }

   /**
   * Get vmVolumeNumIn
   * @return vmVolumeNumIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Integer> getVmVolumeNumIn() {
    return vmVolumeNumIn;
  }


  public void setVmVolumeNumIn(List<Integer> vmVolumeNumIn) {
    this.vmVolumeNumIn = vmVolumeNumIn;
  }


  public LabelWhereInput vmVolumeNumLt(Integer vmVolumeNumLt) {
    
    this.vmVolumeNumLt = vmVolumeNumLt;
    return this;
  }

   /**
   * Get vmVolumeNumLt
   * @return vmVolumeNumLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getVmVolumeNumLt() {
    return vmVolumeNumLt;
  }


  public void setVmVolumeNumLt(Integer vmVolumeNumLt) {
    this.vmVolumeNumLt = vmVolumeNumLt;
  }


  public LabelWhereInput vmVolumeNumLte(Integer vmVolumeNumLte) {
    
    this.vmVolumeNumLte = vmVolumeNumLte;
    return this;
  }

   /**
   * Get vmVolumeNumLte
   * @return vmVolumeNumLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getVmVolumeNumLte() {
    return vmVolumeNumLte;
  }


  public void setVmVolumeNumLte(Integer vmVolumeNumLte) {
    this.vmVolumeNumLte = vmVolumeNumLte;
  }


  public LabelWhereInput vmVolumeNumNot(Integer vmVolumeNumNot) {
    
    this.vmVolumeNumNot = vmVolumeNumNot;
    return this;
  }

   /**
   * Get vmVolumeNumNot
   * @return vmVolumeNumNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getVmVolumeNumNot() {
    return vmVolumeNumNot;
  }


  public void setVmVolumeNumNot(Integer vmVolumeNumNot) {
    this.vmVolumeNumNot = vmVolumeNumNot;
  }


  public LabelWhereInput vmVolumeNumNotIn(List<Integer> vmVolumeNumNotIn) {
    
    this.vmVolumeNumNotIn = vmVolumeNumNotIn;
    return this;
  }

  public LabelWhereInput addVmVolumeNumNotInItem(Integer vmVolumeNumNotInItem) {
    if (this.vmVolumeNumNotIn == null) {
      this.vmVolumeNumNotIn = new ArrayList<Integer>();
    }
    this.vmVolumeNumNotIn.add(vmVolumeNumNotInItem);
    return this;
  }

   /**
   * Get vmVolumeNumNotIn
   * @return vmVolumeNumNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Integer> getVmVolumeNumNotIn() {
    return vmVolumeNumNotIn;
  }


  public void setVmVolumeNumNotIn(List<Integer> vmVolumeNumNotIn) {
    this.vmVolumeNumNotIn = vmVolumeNumNotIn;
  }


  public LabelWhereInput vmVolumeSnapshotNum(Integer vmVolumeSnapshotNum) {
    
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


  public LabelWhereInput vmVolumeSnapshotNumGt(Integer vmVolumeSnapshotNumGt) {
    
    this.vmVolumeSnapshotNumGt = vmVolumeSnapshotNumGt;
    return this;
  }

   /**
   * Get vmVolumeSnapshotNumGt
   * @return vmVolumeSnapshotNumGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getVmVolumeSnapshotNumGt() {
    return vmVolumeSnapshotNumGt;
  }


  public void setVmVolumeSnapshotNumGt(Integer vmVolumeSnapshotNumGt) {
    this.vmVolumeSnapshotNumGt = vmVolumeSnapshotNumGt;
  }


  public LabelWhereInput vmVolumeSnapshotNumGte(Integer vmVolumeSnapshotNumGte) {
    
    this.vmVolumeSnapshotNumGte = vmVolumeSnapshotNumGte;
    return this;
  }

   /**
   * Get vmVolumeSnapshotNumGte
   * @return vmVolumeSnapshotNumGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getVmVolumeSnapshotNumGte() {
    return vmVolumeSnapshotNumGte;
  }


  public void setVmVolumeSnapshotNumGte(Integer vmVolumeSnapshotNumGte) {
    this.vmVolumeSnapshotNumGte = vmVolumeSnapshotNumGte;
  }


  public LabelWhereInput vmVolumeSnapshotNumIn(List<Integer> vmVolumeSnapshotNumIn) {
    
    this.vmVolumeSnapshotNumIn = vmVolumeSnapshotNumIn;
    return this;
  }

  public LabelWhereInput addVmVolumeSnapshotNumInItem(Integer vmVolumeSnapshotNumInItem) {
    if (this.vmVolumeSnapshotNumIn == null) {
      this.vmVolumeSnapshotNumIn = new ArrayList<Integer>();
    }
    this.vmVolumeSnapshotNumIn.add(vmVolumeSnapshotNumInItem);
    return this;
  }

   /**
   * Get vmVolumeSnapshotNumIn
   * @return vmVolumeSnapshotNumIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Integer> getVmVolumeSnapshotNumIn() {
    return vmVolumeSnapshotNumIn;
  }


  public void setVmVolumeSnapshotNumIn(List<Integer> vmVolumeSnapshotNumIn) {
    this.vmVolumeSnapshotNumIn = vmVolumeSnapshotNumIn;
  }


  public LabelWhereInput vmVolumeSnapshotNumLt(Integer vmVolumeSnapshotNumLt) {
    
    this.vmVolumeSnapshotNumLt = vmVolumeSnapshotNumLt;
    return this;
  }

   /**
   * Get vmVolumeSnapshotNumLt
   * @return vmVolumeSnapshotNumLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getVmVolumeSnapshotNumLt() {
    return vmVolumeSnapshotNumLt;
  }


  public void setVmVolumeSnapshotNumLt(Integer vmVolumeSnapshotNumLt) {
    this.vmVolumeSnapshotNumLt = vmVolumeSnapshotNumLt;
  }


  public LabelWhereInput vmVolumeSnapshotNumLte(Integer vmVolumeSnapshotNumLte) {
    
    this.vmVolumeSnapshotNumLte = vmVolumeSnapshotNumLte;
    return this;
  }

   /**
   * Get vmVolumeSnapshotNumLte
   * @return vmVolumeSnapshotNumLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getVmVolumeSnapshotNumLte() {
    return vmVolumeSnapshotNumLte;
  }


  public void setVmVolumeSnapshotNumLte(Integer vmVolumeSnapshotNumLte) {
    this.vmVolumeSnapshotNumLte = vmVolumeSnapshotNumLte;
  }


  public LabelWhereInput vmVolumeSnapshotNumNot(Integer vmVolumeSnapshotNumNot) {
    
    this.vmVolumeSnapshotNumNot = vmVolumeSnapshotNumNot;
    return this;
  }

   /**
   * Get vmVolumeSnapshotNumNot
   * @return vmVolumeSnapshotNumNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getVmVolumeSnapshotNumNot() {
    return vmVolumeSnapshotNumNot;
  }


  public void setVmVolumeSnapshotNumNot(Integer vmVolumeSnapshotNumNot) {
    this.vmVolumeSnapshotNumNot = vmVolumeSnapshotNumNot;
  }


  public LabelWhereInput vmVolumeSnapshotNumNotIn(List<Integer> vmVolumeSnapshotNumNotIn) {
    
    this.vmVolumeSnapshotNumNotIn = vmVolumeSnapshotNumNotIn;
    return this;
  }

  public LabelWhereInput addVmVolumeSnapshotNumNotInItem(Integer vmVolumeSnapshotNumNotInItem) {
    if (this.vmVolumeSnapshotNumNotIn == null) {
      this.vmVolumeSnapshotNumNotIn = new ArrayList<Integer>();
    }
    this.vmVolumeSnapshotNumNotIn.add(vmVolumeSnapshotNumNotInItem);
    return this;
  }

   /**
   * Get vmVolumeSnapshotNumNotIn
   * @return vmVolumeSnapshotNumNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Integer> getVmVolumeSnapshotNumNotIn() {
    return vmVolumeSnapshotNumNotIn;
  }


  public void setVmVolumeSnapshotNumNotIn(List<Integer> vmVolumeSnapshotNumNotIn) {
    this.vmVolumeSnapshotNumNotIn = vmVolumeSnapshotNumNotIn;
  }


  public LabelWhereInput vmVolumeSnapshotsEvery(VmVolumeSnapshotWhereInput vmVolumeSnapshotsEvery) {
    
    this.vmVolumeSnapshotsEvery = vmVolumeSnapshotsEvery;
    return this;
  }

   /**
   * Get vmVolumeSnapshotsEvery
   * @return vmVolumeSnapshotsEvery
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VmVolumeSnapshotWhereInput getVmVolumeSnapshotsEvery() {
    return vmVolumeSnapshotsEvery;
  }


  public void setVmVolumeSnapshotsEvery(VmVolumeSnapshotWhereInput vmVolumeSnapshotsEvery) {
    this.vmVolumeSnapshotsEvery = vmVolumeSnapshotsEvery;
  }


  public LabelWhereInput vmVolumeSnapshotsNone(VmVolumeSnapshotWhereInput vmVolumeSnapshotsNone) {
    
    this.vmVolumeSnapshotsNone = vmVolumeSnapshotsNone;
    return this;
  }

   /**
   * Get vmVolumeSnapshotsNone
   * @return vmVolumeSnapshotsNone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VmVolumeSnapshotWhereInput getVmVolumeSnapshotsNone() {
    return vmVolumeSnapshotsNone;
  }


  public void setVmVolumeSnapshotsNone(VmVolumeSnapshotWhereInput vmVolumeSnapshotsNone) {
    this.vmVolumeSnapshotsNone = vmVolumeSnapshotsNone;
  }


  public LabelWhereInput vmVolumeSnapshotsSome(VmVolumeSnapshotWhereInput vmVolumeSnapshotsSome) {
    
    this.vmVolumeSnapshotsSome = vmVolumeSnapshotsSome;
    return this;
  }

   /**
   * Get vmVolumeSnapshotsSome
   * @return vmVolumeSnapshotsSome
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VmVolumeSnapshotWhereInput getVmVolumeSnapshotsSome() {
    return vmVolumeSnapshotsSome;
  }


  public void setVmVolumeSnapshotsSome(VmVolumeSnapshotWhereInput vmVolumeSnapshotsSome) {
    this.vmVolumeSnapshotsSome = vmVolumeSnapshotsSome;
  }


  public LabelWhereInput vmVolumesEvery(VmVolumeWhereInput vmVolumesEvery) {
    
    this.vmVolumesEvery = vmVolumesEvery;
    return this;
  }

   /**
   * Get vmVolumesEvery
   * @return vmVolumesEvery
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VmVolumeWhereInput getVmVolumesEvery() {
    return vmVolumesEvery;
  }


  public void setVmVolumesEvery(VmVolumeWhereInput vmVolumesEvery) {
    this.vmVolumesEvery = vmVolumesEvery;
  }


  public LabelWhereInput vmVolumesNone(VmVolumeWhereInput vmVolumesNone) {
    
    this.vmVolumesNone = vmVolumesNone;
    return this;
  }

   /**
   * Get vmVolumesNone
   * @return vmVolumesNone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VmVolumeWhereInput getVmVolumesNone() {
    return vmVolumesNone;
  }


  public void setVmVolumesNone(VmVolumeWhereInput vmVolumesNone) {
    this.vmVolumesNone = vmVolumesNone;
  }


  public LabelWhereInput vmVolumesSome(VmVolumeWhereInput vmVolumesSome) {
    
    this.vmVolumesSome = vmVolumesSome;
    return this;
  }

   /**
   * Get vmVolumesSome
   * @return vmVolumesSome
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VmVolumeWhereInput getVmVolumesSome() {
    return vmVolumesSome;
  }


  public void setVmVolumesSome(VmVolumeWhereInput vmVolumesSome) {
    this.vmVolumesSome = vmVolumesSome;
  }


  public LabelWhereInput vmsEvery(VmWhereInput vmsEvery) {
    
    this.vmsEvery = vmsEvery;
    return this;
  }

   /**
   * Get vmsEvery
   * @return vmsEvery
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VmWhereInput getVmsEvery() {
    return vmsEvery;
  }


  public void setVmsEvery(VmWhereInput vmsEvery) {
    this.vmsEvery = vmsEvery;
  }


  public LabelWhereInput vmsNone(VmWhereInput vmsNone) {
    
    this.vmsNone = vmsNone;
    return this;
  }

   /**
   * Get vmsNone
   * @return vmsNone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VmWhereInput getVmsNone() {
    return vmsNone;
  }


  public void setVmsNone(VmWhereInput vmsNone) {
    this.vmsNone = vmsNone;
  }


  public LabelWhereInput vmsSome(VmWhereInput vmsSome) {
    
    this.vmsSome = vmsSome;
    return this;
  }

   /**
   * Get vmsSome
   * @return vmsSome
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VmWhereInput getVmsSome() {
    return vmsSome;
  }


  public void setVmsSome(VmWhereInput vmsSome) {
    this.vmsSome = vmsSome;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LabelWhereInput labelWhereInput = (LabelWhereInput) o;
    return Objects.equals(this.AND, labelWhereInput.AND) &&
        Objects.equals(this.NOT, labelWhereInput.NOT) &&
        Objects.equals(this.OR, labelWhereInput.OR) &&
        Objects.equals(this.clusterNum, labelWhereInput.clusterNum) &&
        Objects.equals(this.clusterNumGt, labelWhereInput.clusterNumGt) &&
        Objects.equals(this.clusterNumGte, labelWhereInput.clusterNumGte) &&
        Objects.equals(this.clusterNumIn, labelWhereInput.clusterNumIn) &&
        Objects.equals(this.clusterNumLt, labelWhereInput.clusterNumLt) &&
        Objects.equals(this.clusterNumLte, labelWhereInput.clusterNumLte) &&
        Objects.equals(this.clusterNumNot, labelWhereInput.clusterNumNot) &&
        Objects.equals(this.clusterNumNotIn, labelWhereInput.clusterNumNotIn) &&
        Objects.equals(this.clustersEvery, labelWhereInput.clustersEvery) &&
        Objects.equals(this.clustersNone, labelWhereInput.clustersNone) &&
        Objects.equals(this.clustersSome, labelWhereInput.clustersSome) &&
        Objects.equals(this.contentLibraryImageNum, labelWhereInput.contentLibraryImageNum) &&
        Objects.equals(this.contentLibraryImageNumGt, labelWhereInput.contentLibraryImageNumGt) &&
        Objects.equals(this.contentLibraryImageNumGte, labelWhereInput.contentLibraryImageNumGte) &&
        Objects.equals(this.contentLibraryImageNumIn, labelWhereInput.contentLibraryImageNumIn) &&
        Objects.equals(this.contentLibraryImageNumLt, labelWhereInput.contentLibraryImageNumLt) &&
        Objects.equals(this.contentLibraryImageNumLte, labelWhereInput.contentLibraryImageNumLte) &&
        Objects.equals(this.contentLibraryImageNumNot, labelWhereInput.contentLibraryImageNumNot) &&
        Objects.equals(this.contentLibraryImageNumNotIn, labelWhereInput.contentLibraryImageNumNotIn) &&
        Objects.equals(this.contentLibraryImagesEvery, labelWhereInput.contentLibraryImagesEvery) &&
        Objects.equals(this.contentLibraryImagesNone, labelWhereInput.contentLibraryImagesNone) &&
        Objects.equals(this.contentLibraryImagesSome, labelWhereInput.contentLibraryImagesSome) &&
        Objects.equals(this.contentLibraryVmTemplateNum, labelWhereInput.contentLibraryVmTemplateNum) &&
        Objects.equals(this.contentLibraryVmTemplateNumGt, labelWhereInput.contentLibraryVmTemplateNumGt) &&
        Objects.equals(this.contentLibraryVmTemplateNumGte, labelWhereInput.contentLibraryVmTemplateNumGte) &&
        Objects.equals(this.contentLibraryVmTemplateNumIn, labelWhereInput.contentLibraryVmTemplateNumIn) &&
        Objects.equals(this.contentLibraryVmTemplateNumLt, labelWhereInput.contentLibraryVmTemplateNumLt) &&
        Objects.equals(this.contentLibraryVmTemplateNumLte, labelWhereInput.contentLibraryVmTemplateNumLte) &&
        Objects.equals(this.contentLibraryVmTemplateNumNot, labelWhereInput.contentLibraryVmTemplateNumNot) &&
        Objects.equals(this.contentLibraryVmTemplateNumNotIn, labelWhereInput.contentLibraryVmTemplateNumNotIn) &&
        Objects.equals(this.contentLibraryVmTemplatesEvery, labelWhereInput.contentLibraryVmTemplatesEvery) &&
        Objects.equals(this.contentLibraryVmTemplatesNone, labelWhereInput.contentLibraryVmTemplatesNone) &&
        Objects.equals(this.contentLibraryVmTemplatesSome, labelWhereInput.contentLibraryVmTemplatesSome) &&
        Objects.equals(this.createdAt, labelWhereInput.createdAt) &&
        Objects.equals(this.createdAtGt, labelWhereInput.createdAtGt) &&
        Objects.equals(this.createdAtGte, labelWhereInput.createdAtGte) &&
        Objects.equals(this.createdAtIn, labelWhereInput.createdAtIn) &&
        Objects.equals(this.createdAtLt, labelWhereInput.createdAtLt) &&
        Objects.equals(this.createdAtLte, labelWhereInput.createdAtLte) &&
        Objects.equals(this.createdAtNot, labelWhereInput.createdAtNot) &&
        Objects.equals(this.createdAtNotIn, labelWhereInput.createdAtNotIn) &&
        Objects.equals(this.datacenterNum, labelWhereInput.datacenterNum) &&
        Objects.equals(this.datacenterNumGt, labelWhereInput.datacenterNumGt) &&
        Objects.equals(this.datacenterNumGte, labelWhereInput.datacenterNumGte) &&
        Objects.equals(this.datacenterNumIn, labelWhereInput.datacenterNumIn) &&
        Objects.equals(this.datacenterNumLt, labelWhereInput.datacenterNumLt) &&
        Objects.equals(this.datacenterNumLte, labelWhereInput.datacenterNumLte) &&
        Objects.equals(this.datacenterNumNot, labelWhereInput.datacenterNumNot) &&
        Objects.equals(this.datacenterNumNotIn, labelWhereInput.datacenterNumNotIn) &&
        Objects.equals(this.datacentersEvery, labelWhereInput.datacentersEvery) &&
        Objects.equals(this.datacentersNone, labelWhereInput.datacentersNone) &&
        Objects.equals(this.datacentersSome, labelWhereInput.datacentersSome) &&
        Objects.equals(this.diskNum, labelWhereInput.diskNum) &&
        Objects.equals(this.diskNumGt, labelWhereInput.diskNumGt) &&
        Objects.equals(this.diskNumGte, labelWhereInput.diskNumGte) &&
        Objects.equals(this.diskNumIn, labelWhereInput.diskNumIn) &&
        Objects.equals(this.diskNumLt, labelWhereInput.diskNumLt) &&
        Objects.equals(this.diskNumLte, labelWhereInput.diskNumLte) &&
        Objects.equals(this.diskNumNot, labelWhereInput.diskNumNot) &&
        Objects.equals(this.diskNumNotIn, labelWhereInput.diskNumNotIn) &&
        Objects.equals(this.elfImageNum, labelWhereInput.elfImageNum) &&
        Objects.equals(this.elfImageNumGt, labelWhereInput.elfImageNumGt) &&
        Objects.equals(this.elfImageNumGte, labelWhereInput.elfImageNumGte) &&
        Objects.equals(this.elfImageNumIn, labelWhereInput.elfImageNumIn) &&
        Objects.equals(this.elfImageNumLt, labelWhereInput.elfImageNumLt) &&
        Objects.equals(this.elfImageNumLte, labelWhereInput.elfImageNumLte) &&
        Objects.equals(this.elfImageNumNot, labelWhereInput.elfImageNumNot) &&
        Objects.equals(this.elfImageNumNotIn, labelWhereInput.elfImageNumNotIn) &&
        Objects.equals(this.elfImagesEvery, labelWhereInput.elfImagesEvery) &&
        Objects.equals(this.elfImagesNone, labelWhereInput.elfImagesNone) &&
        Objects.equals(this.elfImagesSome, labelWhereInput.elfImagesSome) &&
        Objects.equals(this.gpuDeviceNum, labelWhereInput.gpuDeviceNum) &&
        Objects.equals(this.gpuDeviceNumGt, labelWhereInput.gpuDeviceNumGt) &&
        Objects.equals(this.gpuDeviceNumGte, labelWhereInput.gpuDeviceNumGte) &&
        Objects.equals(this.gpuDeviceNumIn, labelWhereInput.gpuDeviceNumIn) &&
        Objects.equals(this.gpuDeviceNumLt, labelWhereInput.gpuDeviceNumLt) &&
        Objects.equals(this.gpuDeviceNumLte, labelWhereInput.gpuDeviceNumLte) &&
        Objects.equals(this.gpuDeviceNumNot, labelWhereInput.gpuDeviceNumNot) &&
        Objects.equals(this.gpuDeviceNumNotIn, labelWhereInput.gpuDeviceNumNotIn) &&
        Objects.equals(this.gpuDevicesEvery, labelWhereInput.gpuDevicesEvery) &&
        Objects.equals(this.gpuDevicesNone, labelWhereInput.gpuDevicesNone) &&
        Objects.equals(this.gpuDevicesSome, labelWhereInput.gpuDevicesSome) &&
        Objects.equals(this.hostNum, labelWhereInput.hostNum) &&
        Objects.equals(this.hostNumGt, labelWhereInput.hostNumGt) &&
        Objects.equals(this.hostNumGte, labelWhereInput.hostNumGte) &&
        Objects.equals(this.hostNumIn, labelWhereInput.hostNumIn) &&
        Objects.equals(this.hostNumLt, labelWhereInput.hostNumLt) &&
        Objects.equals(this.hostNumLte, labelWhereInput.hostNumLte) &&
        Objects.equals(this.hostNumNot, labelWhereInput.hostNumNot) &&
        Objects.equals(this.hostNumNotIn, labelWhereInput.hostNumNotIn) &&
        Objects.equals(this.hostsEvery, labelWhereInput.hostsEvery) &&
        Objects.equals(this.hostsNone, labelWhereInput.hostsNone) &&
        Objects.equals(this.hostsSome, labelWhereInput.hostsSome) &&
        Objects.equals(this.id, labelWhereInput.id) &&
        Objects.equals(this.idContains, labelWhereInput.idContains) &&
        Objects.equals(this.idEndsWith, labelWhereInput.idEndsWith) &&
        Objects.equals(this.idGt, labelWhereInput.idGt) &&
        Objects.equals(this.idGte, labelWhereInput.idGte) &&
        Objects.equals(this.idIn, labelWhereInput.idIn) &&
        Objects.equals(this.idLt, labelWhereInput.idLt) &&
        Objects.equals(this.idLte, labelWhereInput.idLte) &&
        Objects.equals(this.idNot, labelWhereInput.idNot) &&
        Objects.equals(this.idNotContains, labelWhereInput.idNotContains) &&
        Objects.equals(this.idNotEndsWith, labelWhereInput.idNotEndsWith) &&
        Objects.equals(this.idNotIn, labelWhereInput.idNotIn) &&
        Objects.equals(this.idNotStartsWith, labelWhereInput.idNotStartsWith) &&
        Objects.equals(this.idStartsWith, labelWhereInput.idStartsWith) &&
        Objects.equals(this.iscsiLunNum, labelWhereInput.iscsiLunNum) &&
        Objects.equals(this.iscsiLunNumGt, labelWhereInput.iscsiLunNumGt) &&
        Objects.equals(this.iscsiLunNumGte, labelWhereInput.iscsiLunNumGte) &&
        Objects.equals(this.iscsiLunNumIn, labelWhereInput.iscsiLunNumIn) &&
        Objects.equals(this.iscsiLunNumLt, labelWhereInput.iscsiLunNumLt) &&
        Objects.equals(this.iscsiLunNumLte, labelWhereInput.iscsiLunNumLte) &&
        Objects.equals(this.iscsiLunNumNot, labelWhereInput.iscsiLunNumNot) &&
        Objects.equals(this.iscsiLunNumNotIn, labelWhereInput.iscsiLunNumNotIn) &&
        Objects.equals(this.iscsiLunSnapshotNum, labelWhereInput.iscsiLunSnapshotNum) &&
        Objects.equals(this.iscsiLunSnapshotNumGt, labelWhereInput.iscsiLunSnapshotNumGt) &&
        Objects.equals(this.iscsiLunSnapshotNumGte, labelWhereInput.iscsiLunSnapshotNumGte) &&
        Objects.equals(this.iscsiLunSnapshotNumIn, labelWhereInput.iscsiLunSnapshotNumIn) &&
        Objects.equals(this.iscsiLunSnapshotNumLt, labelWhereInput.iscsiLunSnapshotNumLt) &&
        Objects.equals(this.iscsiLunSnapshotNumLte, labelWhereInput.iscsiLunSnapshotNumLte) &&
        Objects.equals(this.iscsiLunSnapshotNumNot, labelWhereInput.iscsiLunSnapshotNumNot) &&
        Objects.equals(this.iscsiLunSnapshotNumNotIn, labelWhereInput.iscsiLunSnapshotNumNotIn) &&
        Objects.equals(this.iscsiLunsEvery, labelWhereInput.iscsiLunsEvery) &&
        Objects.equals(this.iscsiLunsNone, labelWhereInput.iscsiLunsNone) &&
        Objects.equals(this.iscsiLunsSome, labelWhereInput.iscsiLunsSome) &&
        Objects.equals(this.iscsiTargetNum, labelWhereInput.iscsiTargetNum) &&
        Objects.equals(this.iscsiTargetNumGt, labelWhereInput.iscsiTargetNumGt) &&
        Objects.equals(this.iscsiTargetNumGte, labelWhereInput.iscsiTargetNumGte) &&
        Objects.equals(this.iscsiTargetNumIn, labelWhereInput.iscsiTargetNumIn) &&
        Objects.equals(this.iscsiTargetNumLt, labelWhereInput.iscsiTargetNumLt) &&
        Objects.equals(this.iscsiTargetNumLte, labelWhereInput.iscsiTargetNumLte) &&
        Objects.equals(this.iscsiTargetNumNot, labelWhereInput.iscsiTargetNumNot) &&
        Objects.equals(this.iscsiTargetNumNotIn, labelWhereInput.iscsiTargetNumNotIn) &&
        Objects.equals(this.iscsiTargetsEvery, labelWhereInput.iscsiTargetsEvery) &&
        Objects.equals(this.iscsiTargetsNone, labelWhereInput.iscsiTargetsNone) &&
        Objects.equals(this.iscsiTargetsSome, labelWhereInput.iscsiTargetsSome) &&
        Objects.equals(this.key, labelWhereInput.key) &&
        Objects.equals(this.keyContains, labelWhereInput.keyContains) &&
        Objects.equals(this.keyEndsWith, labelWhereInput.keyEndsWith) &&
        Objects.equals(this.keyGt, labelWhereInput.keyGt) &&
        Objects.equals(this.keyGte, labelWhereInput.keyGte) &&
        Objects.equals(this.keyIn, labelWhereInput.keyIn) &&
        Objects.equals(this.keyLt, labelWhereInput.keyLt) &&
        Objects.equals(this.keyLte, labelWhereInput.keyLte) &&
        Objects.equals(this.keyNot, labelWhereInput.keyNot) &&
        Objects.equals(this.keyNotContains, labelWhereInput.keyNotContains) &&
        Objects.equals(this.keyNotEndsWith, labelWhereInput.keyNotEndsWith) &&
        Objects.equals(this.keyNotIn, labelWhereInput.keyNotIn) &&
        Objects.equals(this.keyNotStartsWith, labelWhereInput.keyNotStartsWith) &&
        Objects.equals(this.keyStartsWith, labelWhereInput.keyStartsWith) &&
        Objects.equals(this.nicNum, labelWhereInput.nicNum) &&
        Objects.equals(this.nicNumGt, labelWhereInput.nicNumGt) &&
        Objects.equals(this.nicNumGte, labelWhereInput.nicNumGte) &&
        Objects.equals(this.nicNumIn, labelWhereInput.nicNumIn) &&
        Objects.equals(this.nicNumLt, labelWhereInput.nicNumLt) &&
        Objects.equals(this.nicNumLte, labelWhereInput.nicNumLte) &&
        Objects.equals(this.nicNumNot, labelWhereInput.nicNumNot) &&
        Objects.equals(this.nicNumNotIn, labelWhereInput.nicNumNotIn) &&
        Objects.equals(this.nicsEvery, labelWhereInput.nicsEvery) &&
        Objects.equals(this.nicsNone, labelWhereInput.nicsNone) &&
        Objects.equals(this.nicsSome, labelWhereInput.nicsSome) &&
        Objects.equals(this.systemVlanNum, labelWhereInput.systemVlanNum) &&
        Objects.equals(this.systemVlanNumGt, labelWhereInput.systemVlanNumGt) &&
        Objects.equals(this.systemVlanNumGte, labelWhereInput.systemVlanNumGte) &&
        Objects.equals(this.systemVlanNumIn, labelWhereInput.systemVlanNumIn) &&
        Objects.equals(this.systemVlanNumLt, labelWhereInput.systemVlanNumLt) &&
        Objects.equals(this.systemVlanNumLte, labelWhereInput.systemVlanNumLte) &&
        Objects.equals(this.systemVlanNumNot, labelWhereInput.systemVlanNumNot) &&
        Objects.equals(this.systemVlanNumNotIn, labelWhereInput.systemVlanNumNotIn) &&
        Objects.equals(this.totalNum, labelWhereInput.totalNum) &&
        Objects.equals(this.totalNumGt, labelWhereInput.totalNumGt) &&
        Objects.equals(this.totalNumGte, labelWhereInput.totalNumGte) &&
        Objects.equals(this.totalNumIn, labelWhereInput.totalNumIn) &&
        Objects.equals(this.totalNumLt, labelWhereInput.totalNumLt) &&
        Objects.equals(this.totalNumLte, labelWhereInput.totalNumLte) &&
        Objects.equals(this.totalNumNot, labelWhereInput.totalNumNot) &&
        Objects.equals(this.totalNumNotIn, labelWhereInput.totalNumNotIn) &&
        Objects.equals(this.value, labelWhereInput.value) &&
        Objects.equals(this.valueContains, labelWhereInput.valueContains) &&
        Objects.equals(this.valueEndsWith, labelWhereInput.valueEndsWith) &&
        Objects.equals(this.valueGt, labelWhereInput.valueGt) &&
        Objects.equals(this.valueGte, labelWhereInput.valueGte) &&
        Objects.equals(this.valueIn, labelWhereInput.valueIn) &&
        Objects.equals(this.valueLt, labelWhereInput.valueLt) &&
        Objects.equals(this.valueLte, labelWhereInput.valueLte) &&
        Objects.equals(this.valueNot, labelWhereInput.valueNot) &&
        Objects.equals(this.valueNotContains, labelWhereInput.valueNotContains) &&
        Objects.equals(this.valueNotEndsWith, labelWhereInput.valueNotEndsWith) &&
        Objects.equals(this.valueNotIn, labelWhereInput.valueNotIn) &&
        Objects.equals(this.valueNotStartsWith, labelWhereInput.valueNotStartsWith) &&
        Objects.equals(this.valueStartsWith, labelWhereInput.valueStartsWith) &&
        Objects.equals(this.vdsNum, labelWhereInput.vdsNum) &&
        Objects.equals(this.vdsNumGt, labelWhereInput.vdsNumGt) &&
        Objects.equals(this.vdsNumGte, labelWhereInput.vdsNumGte) &&
        Objects.equals(this.vdsNumIn, labelWhereInput.vdsNumIn) &&
        Objects.equals(this.vdsNumLt, labelWhereInput.vdsNumLt) &&
        Objects.equals(this.vdsNumLte, labelWhereInput.vdsNumLte) &&
        Objects.equals(this.vdsNumNot, labelWhereInput.vdsNumNot) &&
        Objects.equals(this.vdsNumNotIn, labelWhereInput.vdsNumNotIn) &&
        Objects.equals(this.vdsesEvery, labelWhereInput.vdsesEvery) &&
        Objects.equals(this.vdsesNone, labelWhereInput.vdsesNone) &&
        Objects.equals(this.vdsesSome, labelWhereInput.vdsesSome) &&
        Objects.equals(this.vlansEvery, labelWhereInput.vlansEvery) &&
        Objects.equals(this.vlansNone, labelWhereInput.vlansNone) &&
        Objects.equals(this.vlansSome, labelWhereInput.vlansSome) &&
        Objects.equals(this.vmNum, labelWhereInput.vmNum) &&
        Objects.equals(this.vmNumGt, labelWhereInput.vmNumGt) &&
        Objects.equals(this.vmNumGte, labelWhereInput.vmNumGte) &&
        Objects.equals(this.vmNumIn, labelWhereInput.vmNumIn) &&
        Objects.equals(this.vmNumLt, labelWhereInput.vmNumLt) &&
        Objects.equals(this.vmNumLte, labelWhereInput.vmNumLte) &&
        Objects.equals(this.vmNumNot, labelWhereInput.vmNumNot) &&
        Objects.equals(this.vmNumNotIn, labelWhereInput.vmNumNotIn) &&
        Objects.equals(this.vmSnapshotNum, labelWhereInput.vmSnapshotNum) &&
        Objects.equals(this.vmSnapshotNumGt, labelWhereInput.vmSnapshotNumGt) &&
        Objects.equals(this.vmSnapshotNumGte, labelWhereInput.vmSnapshotNumGte) &&
        Objects.equals(this.vmSnapshotNumIn, labelWhereInput.vmSnapshotNumIn) &&
        Objects.equals(this.vmSnapshotNumLt, labelWhereInput.vmSnapshotNumLt) &&
        Objects.equals(this.vmSnapshotNumLte, labelWhereInput.vmSnapshotNumLte) &&
        Objects.equals(this.vmSnapshotNumNot, labelWhereInput.vmSnapshotNumNot) &&
        Objects.equals(this.vmSnapshotNumNotIn, labelWhereInput.vmSnapshotNumNotIn) &&
        Objects.equals(this.vmSnapshotsEvery, labelWhereInput.vmSnapshotsEvery) &&
        Objects.equals(this.vmSnapshotsNone, labelWhereInput.vmSnapshotsNone) &&
        Objects.equals(this.vmSnapshotsSome, labelWhereInput.vmSnapshotsSome) &&
        Objects.equals(this.vmTemplateNum, labelWhereInput.vmTemplateNum) &&
        Objects.equals(this.vmTemplateNumGt, labelWhereInput.vmTemplateNumGt) &&
        Objects.equals(this.vmTemplateNumGte, labelWhereInput.vmTemplateNumGte) &&
        Objects.equals(this.vmTemplateNumIn, labelWhereInput.vmTemplateNumIn) &&
        Objects.equals(this.vmTemplateNumLt, labelWhereInput.vmTemplateNumLt) &&
        Objects.equals(this.vmTemplateNumLte, labelWhereInput.vmTemplateNumLte) &&
        Objects.equals(this.vmTemplateNumNot, labelWhereInput.vmTemplateNumNot) &&
        Objects.equals(this.vmTemplateNumNotIn, labelWhereInput.vmTemplateNumNotIn) &&
        Objects.equals(this.vmTemplatesEvery, labelWhereInput.vmTemplatesEvery) &&
        Objects.equals(this.vmTemplatesNone, labelWhereInput.vmTemplatesNone) &&
        Objects.equals(this.vmTemplatesSome, labelWhereInput.vmTemplatesSome) &&
        Objects.equals(this.vmVlanNum, labelWhereInput.vmVlanNum) &&
        Objects.equals(this.vmVlanNumGt, labelWhereInput.vmVlanNumGt) &&
        Objects.equals(this.vmVlanNumGte, labelWhereInput.vmVlanNumGte) &&
        Objects.equals(this.vmVlanNumIn, labelWhereInput.vmVlanNumIn) &&
        Objects.equals(this.vmVlanNumLt, labelWhereInput.vmVlanNumLt) &&
        Objects.equals(this.vmVlanNumLte, labelWhereInput.vmVlanNumLte) &&
        Objects.equals(this.vmVlanNumNot, labelWhereInput.vmVlanNumNot) &&
        Objects.equals(this.vmVlanNumNotIn, labelWhereInput.vmVlanNumNotIn) &&
        Objects.equals(this.vmVolumeNum, labelWhereInput.vmVolumeNum) &&
        Objects.equals(this.vmVolumeNumGt, labelWhereInput.vmVolumeNumGt) &&
        Objects.equals(this.vmVolumeNumGte, labelWhereInput.vmVolumeNumGte) &&
        Objects.equals(this.vmVolumeNumIn, labelWhereInput.vmVolumeNumIn) &&
        Objects.equals(this.vmVolumeNumLt, labelWhereInput.vmVolumeNumLt) &&
        Objects.equals(this.vmVolumeNumLte, labelWhereInput.vmVolumeNumLte) &&
        Objects.equals(this.vmVolumeNumNot, labelWhereInput.vmVolumeNumNot) &&
        Objects.equals(this.vmVolumeNumNotIn, labelWhereInput.vmVolumeNumNotIn) &&
        Objects.equals(this.vmVolumeSnapshotNum, labelWhereInput.vmVolumeSnapshotNum) &&
        Objects.equals(this.vmVolumeSnapshotNumGt, labelWhereInput.vmVolumeSnapshotNumGt) &&
        Objects.equals(this.vmVolumeSnapshotNumGte, labelWhereInput.vmVolumeSnapshotNumGte) &&
        Objects.equals(this.vmVolumeSnapshotNumIn, labelWhereInput.vmVolumeSnapshotNumIn) &&
        Objects.equals(this.vmVolumeSnapshotNumLt, labelWhereInput.vmVolumeSnapshotNumLt) &&
        Objects.equals(this.vmVolumeSnapshotNumLte, labelWhereInput.vmVolumeSnapshotNumLte) &&
        Objects.equals(this.vmVolumeSnapshotNumNot, labelWhereInput.vmVolumeSnapshotNumNot) &&
        Objects.equals(this.vmVolumeSnapshotNumNotIn, labelWhereInput.vmVolumeSnapshotNumNotIn) &&
        Objects.equals(this.vmVolumeSnapshotsEvery, labelWhereInput.vmVolumeSnapshotsEvery) &&
        Objects.equals(this.vmVolumeSnapshotsNone, labelWhereInput.vmVolumeSnapshotsNone) &&
        Objects.equals(this.vmVolumeSnapshotsSome, labelWhereInput.vmVolumeSnapshotsSome) &&
        Objects.equals(this.vmVolumesEvery, labelWhereInput.vmVolumesEvery) &&
        Objects.equals(this.vmVolumesNone, labelWhereInput.vmVolumesNone) &&
        Objects.equals(this.vmVolumesSome, labelWhereInput.vmVolumesSome) &&
        Objects.equals(this.vmsEvery, labelWhereInput.vmsEvery) &&
        Objects.equals(this.vmsNone, labelWhereInput.vmsNone) &&
        Objects.equals(this.vmsSome, labelWhereInput.vmsSome);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(AND, NOT, OR, clusterNum, clusterNumGt, clusterNumGte, clusterNumIn, clusterNumLt, clusterNumLte, clusterNumNot, clusterNumNotIn, clustersEvery, clustersNone, clustersSome, contentLibraryImageNum, contentLibraryImageNumGt, contentLibraryImageNumGte, contentLibraryImageNumIn, contentLibraryImageNumLt, contentLibraryImageNumLte, contentLibraryImageNumNot, contentLibraryImageNumNotIn, contentLibraryImagesEvery, contentLibraryImagesNone, contentLibraryImagesSome, contentLibraryVmTemplateNum, contentLibraryVmTemplateNumGt, contentLibraryVmTemplateNumGte, contentLibraryVmTemplateNumIn, contentLibraryVmTemplateNumLt, contentLibraryVmTemplateNumLte, contentLibraryVmTemplateNumNot, contentLibraryVmTemplateNumNotIn, contentLibraryVmTemplatesEvery, contentLibraryVmTemplatesNone, contentLibraryVmTemplatesSome, createdAt, createdAtGt, createdAtGte, createdAtIn, createdAtLt, createdAtLte, createdAtNot, createdAtNotIn, datacenterNum, datacenterNumGt, datacenterNumGte, datacenterNumIn, datacenterNumLt, datacenterNumLte, datacenterNumNot, datacenterNumNotIn, datacentersEvery, datacentersNone, datacentersSome, diskNum, diskNumGt, diskNumGte, diskNumIn, diskNumLt, diskNumLte, diskNumNot, diskNumNotIn, elfImageNum, elfImageNumGt, elfImageNumGte, elfImageNumIn, elfImageNumLt, elfImageNumLte, elfImageNumNot, elfImageNumNotIn, elfImagesEvery, elfImagesNone, elfImagesSome, gpuDeviceNum, gpuDeviceNumGt, gpuDeviceNumGte, gpuDeviceNumIn, gpuDeviceNumLt, gpuDeviceNumLte, gpuDeviceNumNot, gpuDeviceNumNotIn, gpuDevicesEvery, gpuDevicesNone, gpuDevicesSome, hostNum, hostNumGt, hostNumGte, hostNumIn, hostNumLt, hostNumLte, hostNumNot, hostNumNotIn, hostsEvery, hostsNone, hostsSome, id, idContains, idEndsWith, idGt, idGte, idIn, idLt, idLte, idNot, idNotContains, idNotEndsWith, idNotIn, idNotStartsWith, idStartsWith, iscsiLunNum, iscsiLunNumGt, iscsiLunNumGte, iscsiLunNumIn, iscsiLunNumLt, iscsiLunNumLte, iscsiLunNumNot, iscsiLunNumNotIn, iscsiLunSnapshotNum, iscsiLunSnapshotNumGt, iscsiLunSnapshotNumGte, iscsiLunSnapshotNumIn, iscsiLunSnapshotNumLt, iscsiLunSnapshotNumLte, iscsiLunSnapshotNumNot, iscsiLunSnapshotNumNotIn, iscsiLunsEvery, iscsiLunsNone, iscsiLunsSome, iscsiTargetNum, iscsiTargetNumGt, iscsiTargetNumGte, iscsiTargetNumIn, iscsiTargetNumLt, iscsiTargetNumLte, iscsiTargetNumNot, iscsiTargetNumNotIn, iscsiTargetsEvery, iscsiTargetsNone, iscsiTargetsSome, key, keyContains, keyEndsWith, keyGt, keyGte, keyIn, keyLt, keyLte, keyNot, keyNotContains, keyNotEndsWith, keyNotIn, keyNotStartsWith, keyStartsWith, nicNum, nicNumGt, nicNumGte, nicNumIn, nicNumLt, nicNumLte, nicNumNot, nicNumNotIn, nicsEvery, nicsNone, nicsSome, systemVlanNum, systemVlanNumGt, systemVlanNumGte, systemVlanNumIn, systemVlanNumLt, systemVlanNumLte, systemVlanNumNot, systemVlanNumNotIn, totalNum, totalNumGt, totalNumGte, totalNumIn, totalNumLt, totalNumLte, totalNumNot, totalNumNotIn, value, valueContains, valueEndsWith, valueGt, valueGte, valueIn, valueLt, valueLte, valueNot, valueNotContains, valueNotEndsWith, valueNotIn, valueNotStartsWith, valueStartsWith, vdsNum, vdsNumGt, vdsNumGte, vdsNumIn, vdsNumLt, vdsNumLte, vdsNumNot, vdsNumNotIn, vdsesEvery, vdsesNone, vdsesSome, vlansEvery, vlansNone, vlansSome, vmNum, vmNumGt, vmNumGte, vmNumIn, vmNumLt, vmNumLte, vmNumNot, vmNumNotIn, vmSnapshotNum, vmSnapshotNumGt, vmSnapshotNumGte, vmSnapshotNumIn, vmSnapshotNumLt, vmSnapshotNumLte, vmSnapshotNumNot, vmSnapshotNumNotIn, vmSnapshotsEvery, vmSnapshotsNone, vmSnapshotsSome, vmTemplateNum, vmTemplateNumGt, vmTemplateNumGte, vmTemplateNumIn, vmTemplateNumLt, vmTemplateNumLte, vmTemplateNumNot, vmTemplateNumNotIn, vmTemplatesEvery, vmTemplatesNone, vmTemplatesSome, vmVlanNum, vmVlanNumGt, vmVlanNumGte, vmVlanNumIn, vmVlanNumLt, vmVlanNumLte, vmVlanNumNot, vmVlanNumNotIn, vmVolumeNum, vmVolumeNumGt, vmVolumeNumGte, vmVolumeNumIn, vmVolumeNumLt, vmVolumeNumLte, vmVolumeNumNot, vmVolumeNumNotIn, vmVolumeSnapshotNum, vmVolumeSnapshotNumGt, vmVolumeSnapshotNumGte, vmVolumeSnapshotNumIn, vmVolumeSnapshotNumLt, vmVolumeSnapshotNumLte, vmVolumeSnapshotNumNot, vmVolumeSnapshotNumNotIn, vmVolumeSnapshotsEvery, vmVolumeSnapshotsNone, vmVolumeSnapshotsSome, vmVolumesEvery, vmVolumesNone, vmVolumesSome, vmsEvery, vmsNone, vmsSome);
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
    sb.append("class LabelWhereInput {\n");
    sb.append("    AND: ").append(toIndentedString(AND)).append("\n");
    sb.append("    NOT: ").append(toIndentedString(NOT)).append("\n");
    sb.append("    OR: ").append(toIndentedString(OR)).append("\n");
    sb.append("    clusterNum: ").append(toIndentedString(clusterNum)).append("\n");
    sb.append("    clusterNumGt: ").append(toIndentedString(clusterNumGt)).append("\n");
    sb.append("    clusterNumGte: ").append(toIndentedString(clusterNumGte)).append("\n");
    sb.append("    clusterNumIn: ").append(toIndentedString(clusterNumIn)).append("\n");
    sb.append("    clusterNumLt: ").append(toIndentedString(clusterNumLt)).append("\n");
    sb.append("    clusterNumLte: ").append(toIndentedString(clusterNumLte)).append("\n");
    sb.append("    clusterNumNot: ").append(toIndentedString(clusterNumNot)).append("\n");
    sb.append("    clusterNumNotIn: ").append(toIndentedString(clusterNumNotIn)).append("\n");
    sb.append("    clustersEvery: ").append(toIndentedString(clustersEvery)).append("\n");
    sb.append("    clustersNone: ").append(toIndentedString(clustersNone)).append("\n");
    sb.append("    clustersSome: ").append(toIndentedString(clustersSome)).append("\n");
    sb.append("    contentLibraryImageNum: ").append(toIndentedString(contentLibraryImageNum)).append("\n");
    sb.append("    contentLibraryImageNumGt: ").append(toIndentedString(contentLibraryImageNumGt)).append("\n");
    sb.append("    contentLibraryImageNumGte: ").append(toIndentedString(contentLibraryImageNumGte)).append("\n");
    sb.append("    contentLibraryImageNumIn: ").append(toIndentedString(contentLibraryImageNumIn)).append("\n");
    sb.append("    contentLibraryImageNumLt: ").append(toIndentedString(contentLibraryImageNumLt)).append("\n");
    sb.append("    contentLibraryImageNumLte: ").append(toIndentedString(contentLibraryImageNumLte)).append("\n");
    sb.append("    contentLibraryImageNumNot: ").append(toIndentedString(contentLibraryImageNumNot)).append("\n");
    sb.append("    contentLibraryImageNumNotIn: ").append(toIndentedString(contentLibraryImageNumNotIn)).append("\n");
    sb.append("    contentLibraryImagesEvery: ").append(toIndentedString(contentLibraryImagesEvery)).append("\n");
    sb.append("    contentLibraryImagesNone: ").append(toIndentedString(contentLibraryImagesNone)).append("\n");
    sb.append("    contentLibraryImagesSome: ").append(toIndentedString(contentLibraryImagesSome)).append("\n");
    sb.append("    contentLibraryVmTemplateNum: ").append(toIndentedString(contentLibraryVmTemplateNum)).append("\n");
    sb.append("    contentLibraryVmTemplateNumGt: ").append(toIndentedString(contentLibraryVmTemplateNumGt)).append("\n");
    sb.append("    contentLibraryVmTemplateNumGte: ").append(toIndentedString(contentLibraryVmTemplateNumGte)).append("\n");
    sb.append("    contentLibraryVmTemplateNumIn: ").append(toIndentedString(contentLibraryVmTemplateNumIn)).append("\n");
    sb.append("    contentLibraryVmTemplateNumLt: ").append(toIndentedString(contentLibraryVmTemplateNumLt)).append("\n");
    sb.append("    contentLibraryVmTemplateNumLte: ").append(toIndentedString(contentLibraryVmTemplateNumLte)).append("\n");
    sb.append("    contentLibraryVmTemplateNumNot: ").append(toIndentedString(contentLibraryVmTemplateNumNot)).append("\n");
    sb.append("    contentLibraryVmTemplateNumNotIn: ").append(toIndentedString(contentLibraryVmTemplateNumNotIn)).append("\n");
    sb.append("    contentLibraryVmTemplatesEvery: ").append(toIndentedString(contentLibraryVmTemplatesEvery)).append("\n");
    sb.append("    contentLibraryVmTemplatesNone: ").append(toIndentedString(contentLibraryVmTemplatesNone)).append("\n");
    sb.append("    contentLibraryVmTemplatesSome: ").append(toIndentedString(contentLibraryVmTemplatesSome)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    createdAtGt: ").append(toIndentedString(createdAtGt)).append("\n");
    sb.append("    createdAtGte: ").append(toIndentedString(createdAtGte)).append("\n");
    sb.append("    createdAtIn: ").append(toIndentedString(createdAtIn)).append("\n");
    sb.append("    createdAtLt: ").append(toIndentedString(createdAtLt)).append("\n");
    sb.append("    createdAtLte: ").append(toIndentedString(createdAtLte)).append("\n");
    sb.append("    createdAtNot: ").append(toIndentedString(createdAtNot)).append("\n");
    sb.append("    createdAtNotIn: ").append(toIndentedString(createdAtNotIn)).append("\n");
    sb.append("    datacenterNum: ").append(toIndentedString(datacenterNum)).append("\n");
    sb.append("    datacenterNumGt: ").append(toIndentedString(datacenterNumGt)).append("\n");
    sb.append("    datacenterNumGte: ").append(toIndentedString(datacenterNumGte)).append("\n");
    sb.append("    datacenterNumIn: ").append(toIndentedString(datacenterNumIn)).append("\n");
    sb.append("    datacenterNumLt: ").append(toIndentedString(datacenterNumLt)).append("\n");
    sb.append("    datacenterNumLte: ").append(toIndentedString(datacenterNumLte)).append("\n");
    sb.append("    datacenterNumNot: ").append(toIndentedString(datacenterNumNot)).append("\n");
    sb.append("    datacenterNumNotIn: ").append(toIndentedString(datacenterNumNotIn)).append("\n");
    sb.append("    datacentersEvery: ").append(toIndentedString(datacentersEvery)).append("\n");
    sb.append("    datacentersNone: ").append(toIndentedString(datacentersNone)).append("\n");
    sb.append("    datacentersSome: ").append(toIndentedString(datacentersSome)).append("\n");
    sb.append("    diskNum: ").append(toIndentedString(diskNum)).append("\n");
    sb.append("    diskNumGt: ").append(toIndentedString(diskNumGt)).append("\n");
    sb.append("    diskNumGte: ").append(toIndentedString(diskNumGte)).append("\n");
    sb.append("    diskNumIn: ").append(toIndentedString(diskNumIn)).append("\n");
    sb.append("    diskNumLt: ").append(toIndentedString(diskNumLt)).append("\n");
    sb.append("    diskNumLte: ").append(toIndentedString(diskNumLte)).append("\n");
    sb.append("    diskNumNot: ").append(toIndentedString(diskNumNot)).append("\n");
    sb.append("    diskNumNotIn: ").append(toIndentedString(diskNumNotIn)).append("\n");
    sb.append("    elfImageNum: ").append(toIndentedString(elfImageNum)).append("\n");
    sb.append("    elfImageNumGt: ").append(toIndentedString(elfImageNumGt)).append("\n");
    sb.append("    elfImageNumGte: ").append(toIndentedString(elfImageNumGte)).append("\n");
    sb.append("    elfImageNumIn: ").append(toIndentedString(elfImageNumIn)).append("\n");
    sb.append("    elfImageNumLt: ").append(toIndentedString(elfImageNumLt)).append("\n");
    sb.append("    elfImageNumLte: ").append(toIndentedString(elfImageNumLte)).append("\n");
    sb.append("    elfImageNumNot: ").append(toIndentedString(elfImageNumNot)).append("\n");
    sb.append("    elfImageNumNotIn: ").append(toIndentedString(elfImageNumNotIn)).append("\n");
    sb.append("    elfImagesEvery: ").append(toIndentedString(elfImagesEvery)).append("\n");
    sb.append("    elfImagesNone: ").append(toIndentedString(elfImagesNone)).append("\n");
    sb.append("    elfImagesSome: ").append(toIndentedString(elfImagesSome)).append("\n");
    sb.append("    gpuDeviceNum: ").append(toIndentedString(gpuDeviceNum)).append("\n");
    sb.append("    gpuDeviceNumGt: ").append(toIndentedString(gpuDeviceNumGt)).append("\n");
    sb.append("    gpuDeviceNumGte: ").append(toIndentedString(gpuDeviceNumGte)).append("\n");
    sb.append("    gpuDeviceNumIn: ").append(toIndentedString(gpuDeviceNumIn)).append("\n");
    sb.append("    gpuDeviceNumLt: ").append(toIndentedString(gpuDeviceNumLt)).append("\n");
    sb.append("    gpuDeviceNumLte: ").append(toIndentedString(gpuDeviceNumLte)).append("\n");
    sb.append("    gpuDeviceNumNot: ").append(toIndentedString(gpuDeviceNumNot)).append("\n");
    sb.append("    gpuDeviceNumNotIn: ").append(toIndentedString(gpuDeviceNumNotIn)).append("\n");
    sb.append("    gpuDevicesEvery: ").append(toIndentedString(gpuDevicesEvery)).append("\n");
    sb.append("    gpuDevicesNone: ").append(toIndentedString(gpuDevicesNone)).append("\n");
    sb.append("    gpuDevicesSome: ").append(toIndentedString(gpuDevicesSome)).append("\n");
    sb.append("    hostNum: ").append(toIndentedString(hostNum)).append("\n");
    sb.append("    hostNumGt: ").append(toIndentedString(hostNumGt)).append("\n");
    sb.append("    hostNumGte: ").append(toIndentedString(hostNumGte)).append("\n");
    sb.append("    hostNumIn: ").append(toIndentedString(hostNumIn)).append("\n");
    sb.append("    hostNumLt: ").append(toIndentedString(hostNumLt)).append("\n");
    sb.append("    hostNumLte: ").append(toIndentedString(hostNumLte)).append("\n");
    sb.append("    hostNumNot: ").append(toIndentedString(hostNumNot)).append("\n");
    sb.append("    hostNumNotIn: ").append(toIndentedString(hostNumNotIn)).append("\n");
    sb.append("    hostsEvery: ").append(toIndentedString(hostsEvery)).append("\n");
    sb.append("    hostsNone: ").append(toIndentedString(hostsNone)).append("\n");
    sb.append("    hostsSome: ").append(toIndentedString(hostsSome)).append("\n");
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
    sb.append("    iscsiLunNum: ").append(toIndentedString(iscsiLunNum)).append("\n");
    sb.append("    iscsiLunNumGt: ").append(toIndentedString(iscsiLunNumGt)).append("\n");
    sb.append("    iscsiLunNumGte: ").append(toIndentedString(iscsiLunNumGte)).append("\n");
    sb.append("    iscsiLunNumIn: ").append(toIndentedString(iscsiLunNumIn)).append("\n");
    sb.append("    iscsiLunNumLt: ").append(toIndentedString(iscsiLunNumLt)).append("\n");
    sb.append("    iscsiLunNumLte: ").append(toIndentedString(iscsiLunNumLte)).append("\n");
    sb.append("    iscsiLunNumNot: ").append(toIndentedString(iscsiLunNumNot)).append("\n");
    sb.append("    iscsiLunNumNotIn: ").append(toIndentedString(iscsiLunNumNotIn)).append("\n");
    sb.append("    iscsiLunSnapshotNum: ").append(toIndentedString(iscsiLunSnapshotNum)).append("\n");
    sb.append("    iscsiLunSnapshotNumGt: ").append(toIndentedString(iscsiLunSnapshotNumGt)).append("\n");
    sb.append("    iscsiLunSnapshotNumGte: ").append(toIndentedString(iscsiLunSnapshotNumGte)).append("\n");
    sb.append("    iscsiLunSnapshotNumIn: ").append(toIndentedString(iscsiLunSnapshotNumIn)).append("\n");
    sb.append("    iscsiLunSnapshotNumLt: ").append(toIndentedString(iscsiLunSnapshotNumLt)).append("\n");
    sb.append("    iscsiLunSnapshotNumLte: ").append(toIndentedString(iscsiLunSnapshotNumLte)).append("\n");
    sb.append("    iscsiLunSnapshotNumNot: ").append(toIndentedString(iscsiLunSnapshotNumNot)).append("\n");
    sb.append("    iscsiLunSnapshotNumNotIn: ").append(toIndentedString(iscsiLunSnapshotNumNotIn)).append("\n");
    sb.append("    iscsiLunsEvery: ").append(toIndentedString(iscsiLunsEvery)).append("\n");
    sb.append("    iscsiLunsNone: ").append(toIndentedString(iscsiLunsNone)).append("\n");
    sb.append("    iscsiLunsSome: ").append(toIndentedString(iscsiLunsSome)).append("\n");
    sb.append("    iscsiTargetNum: ").append(toIndentedString(iscsiTargetNum)).append("\n");
    sb.append("    iscsiTargetNumGt: ").append(toIndentedString(iscsiTargetNumGt)).append("\n");
    sb.append("    iscsiTargetNumGte: ").append(toIndentedString(iscsiTargetNumGte)).append("\n");
    sb.append("    iscsiTargetNumIn: ").append(toIndentedString(iscsiTargetNumIn)).append("\n");
    sb.append("    iscsiTargetNumLt: ").append(toIndentedString(iscsiTargetNumLt)).append("\n");
    sb.append("    iscsiTargetNumLte: ").append(toIndentedString(iscsiTargetNumLte)).append("\n");
    sb.append("    iscsiTargetNumNot: ").append(toIndentedString(iscsiTargetNumNot)).append("\n");
    sb.append("    iscsiTargetNumNotIn: ").append(toIndentedString(iscsiTargetNumNotIn)).append("\n");
    sb.append("    iscsiTargetsEvery: ").append(toIndentedString(iscsiTargetsEvery)).append("\n");
    sb.append("    iscsiTargetsNone: ").append(toIndentedString(iscsiTargetsNone)).append("\n");
    sb.append("    iscsiTargetsSome: ").append(toIndentedString(iscsiTargetsSome)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    keyContains: ").append(toIndentedString(keyContains)).append("\n");
    sb.append("    keyEndsWith: ").append(toIndentedString(keyEndsWith)).append("\n");
    sb.append("    keyGt: ").append(toIndentedString(keyGt)).append("\n");
    sb.append("    keyGte: ").append(toIndentedString(keyGte)).append("\n");
    sb.append("    keyIn: ").append(toIndentedString(keyIn)).append("\n");
    sb.append("    keyLt: ").append(toIndentedString(keyLt)).append("\n");
    sb.append("    keyLte: ").append(toIndentedString(keyLte)).append("\n");
    sb.append("    keyNot: ").append(toIndentedString(keyNot)).append("\n");
    sb.append("    keyNotContains: ").append(toIndentedString(keyNotContains)).append("\n");
    sb.append("    keyNotEndsWith: ").append(toIndentedString(keyNotEndsWith)).append("\n");
    sb.append("    keyNotIn: ").append(toIndentedString(keyNotIn)).append("\n");
    sb.append("    keyNotStartsWith: ").append(toIndentedString(keyNotStartsWith)).append("\n");
    sb.append("    keyStartsWith: ").append(toIndentedString(keyStartsWith)).append("\n");
    sb.append("    nicNum: ").append(toIndentedString(nicNum)).append("\n");
    sb.append("    nicNumGt: ").append(toIndentedString(nicNumGt)).append("\n");
    sb.append("    nicNumGte: ").append(toIndentedString(nicNumGte)).append("\n");
    sb.append("    nicNumIn: ").append(toIndentedString(nicNumIn)).append("\n");
    sb.append("    nicNumLt: ").append(toIndentedString(nicNumLt)).append("\n");
    sb.append("    nicNumLte: ").append(toIndentedString(nicNumLte)).append("\n");
    sb.append("    nicNumNot: ").append(toIndentedString(nicNumNot)).append("\n");
    sb.append("    nicNumNotIn: ").append(toIndentedString(nicNumNotIn)).append("\n");
    sb.append("    nicsEvery: ").append(toIndentedString(nicsEvery)).append("\n");
    sb.append("    nicsNone: ").append(toIndentedString(nicsNone)).append("\n");
    sb.append("    nicsSome: ").append(toIndentedString(nicsSome)).append("\n");
    sb.append("    systemVlanNum: ").append(toIndentedString(systemVlanNum)).append("\n");
    sb.append("    systemVlanNumGt: ").append(toIndentedString(systemVlanNumGt)).append("\n");
    sb.append("    systemVlanNumGte: ").append(toIndentedString(systemVlanNumGte)).append("\n");
    sb.append("    systemVlanNumIn: ").append(toIndentedString(systemVlanNumIn)).append("\n");
    sb.append("    systemVlanNumLt: ").append(toIndentedString(systemVlanNumLt)).append("\n");
    sb.append("    systemVlanNumLte: ").append(toIndentedString(systemVlanNumLte)).append("\n");
    sb.append("    systemVlanNumNot: ").append(toIndentedString(systemVlanNumNot)).append("\n");
    sb.append("    systemVlanNumNotIn: ").append(toIndentedString(systemVlanNumNotIn)).append("\n");
    sb.append("    totalNum: ").append(toIndentedString(totalNum)).append("\n");
    sb.append("    totalNumGt: ").append(toIndentedString(totalNumGt)).append("\n");
    sb.append("    totalNumGte: ").append(toIndentedString(totalNumGte)).append("\n");
    sb.append("    totalNumIn: ").append(toIndentedString(totalNumIn)).append("\n");
    sb.append("    totalNumLt: ").append(toIndentedString(totalNumLt)).append("\n");
    sb.append("    totalNumLte: ").append(toIndentedString(totalNumLte)).append("\n");
    sb.append("    totalNumNot: ").append(toIndentedString(totalNumNot)).append("\n");
    sb.append("    totalNumNotIn: ").append(toIndentedString(totalNumNotIn)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    valueContains: ").append(toIndentedString(valueContains)).append("\n");
    sb.append("    valueEndsWith: ").append(toIndentedString(valueEndsWith)).append("\n");
    sb.append("    valueGt: ").append(toIndentedString(valueGt)).append("\n");
    sb.append("    valueGte: ").append(toIndentedString(valueGte)).append("\n");
    sb.append("    valueIn: ").append(toIndentedString(valueIn)).append("\n");
    sb.append("    valueLt: ").append(toIndentedString(valueLt)).append("\n");
    sb.append("    valueLte: ").append(toIndentedString(valueLte)).append("\n");
    sb.append("    valueNot: ").append(toIndentedString(valueNot)).append("\n");
    sb.append("    valueNotContains: ").append(toIndentedString(valueNotContains)).append("\n");
    sb.append("    valueNotEndsWith: ").append(toIndentedString(valueNotEndsWith)).append("\n");
    sb.append("    valueNotIn: ").append(toIndentedString(valueNotIn)).append("\n");
    sb.append("    valueNotStartsWith: ").append(toIndentedString(valueNotStartsWith)).append("\n");
    sb.append("    valueStartsWith: ").append(toIndentedString(valueStartsWith)).append("\n");
    sb.append("    vdsNum: ").append(toIndentedString(vdsNum)).append("\n");
    sb.append("    vdsNumGt: ").append(toIndentedString(vdsNumGt)).append("\n");
    sb.append("    vdsNumGte: ").append(toIndentedString(vdsNumGte)).append("\n");
    sb.append("    vdsNumIn: ").append(toIndentedString(vdsNumIn)).append("\n");
    sb.append("    vdsNumLt: ").append(toIndentedString(vdsNumLt)).append("\n");
    sb.append("    vdsNumLte: ").append(toIndentedString(vdsNumLte)).append("\n");
    sb.append("    vdsNumNot: ").append(toIndentedString(vdsNumNot)).append("\n");
    sb.append("    vdsNumNotIn: ").append(toIndentedString(vdsNumNotIn)).append("\n");
    sb.append("    vdsesEvery: ").append(toIndentedString(vdsesEvery)).append("\n");
    sb.append("    vdsesNone: ").append(toIndentedString(vdsesNone)).append("\n");
    sb.append("    vdsesSome: ").append(toIndentedString(vdsesSome)).append("\n");
    sb.append("    vlansEvery: ").append(toIndentedString(vlansEvery)).append("\n");
    sb.append("    vlansNone: ").append(toIndentedString(vlansNone)).append("\n");
    sb.append("    vlansSome: ").append(toIndentedString(vlansSome)).append("\n");
    sb.append("    vmNum: ").append(toIndentedString(vmNum)).append("\n");
    sb.append("    vmNumGt: ").append(toIndentedString(vmNumGt)).append("\n");
    sb.append("    vmNumGte: ").append(toIndentedString(vmNumGte)).append("\n");
    sb.append("    vmNumIn: ").append(toIndentedString(vmNumIn)).append("\n");
    sb.append("    vmNumLt: ").append(toIndentedString(vmNumLt)).append("\n");
    sb.append("    vmNumLte: ").append(toIndentedString(vmNumLte)).append("\n");
    sb.append("    vmNumNot: ").append(toIndentedString(vmNumNot)).append("\n");
    sb.append("    vmNumNotIn: ").append(toIndentedString(vmNumNotIn)).append("\n");
    sb.append("    vmSnapshotNum: ").append(toIndentedString(vmSnapshotNum)).append("\n");
    sb.append("    vmSnapshotNumGt: ").append(toIndentedString(vmSnapshotNumGt)).append("\n");
    sb.append("    vmSnapshotNumGte: ").append(toIndentedString(vmSnapshotNumGte)).append("\n");
    sb.append("    vmSnapshotNumIn: ").append(toIndentedString(vmSnapshotNumIn)).append("\n");
    sb.append("    vmSnapshotNumLt: ").append(toIndentedString(vmSnapshotNumLt)).append("\n");
    sb.append("    vmSnapshotNumLte: ").append(toIndentedString(vmSnapshotNumLte)).append("\n");
    sb.append("    vmSnapshotNumNot: ").append(toIndentedString(vmSnapshotNumNot)).append("\n");
    sb.append("    vmSnapshotNumNotIn: ").append(toIndentedString(vmSnapshotNumNotIn)).append("\n");
    sb.append("    vmSnapshotsEvery: ").append(toIndentedString(vmSnapshotsEvery)).append("\n");
    sb.append("    vmSnapshotsNone: ").append(toIndentedString(vmSnapshotsNone)).append("\n");
    sb.append("    vmSnapshotsSome: ").append(toIndentedString(vmSnapshotsSome)).append("\n");
    sb.append("    vmTemplateNum: ").append(toIndentedString(vmTemplateNum)).append("\n");
    sb.append("    vmTemplateNumGt: ").append(toIndentedString(vmTemplateNumGt)).append("\n");
    sb.append("    vmTemplateNumGte: ").append(toIndentedString(vmTemplateNumGte)).append("\n");
    sb.append("    vmTemplateNumIn: ").append(toIndentedString(vmTemplateNumIn)).append("\n");
    sb.append("    vmTemplateNumLt: ").append(toIndentedString(vmTemplateNumLt)).append("\n");
    sb.append("    vmTemplateNumLte: ").append(toIndentedString(vmTemplateNumLte)).append("\n");
    sb.append("    vmTemplateNumNot: ").append(toIndentedString(vmTemplateNumNot)).append("\n");
    sb.append("    vmTemplateNumNotIn: ").append(toIndentedString(vmTemplateNumNotIn)).append("\n");
    sb.append("    vmTemplatesEvery: ").append(toIndentedString(vmTemplatesEvery)).append("\n");
    sb.append("    vmTemplatesNone: ").append(toIndentedString(vmTemplatesNone)).append("\n");
    sb.append("    vmTemplatesSome: ").append(toIndentedString(vmTemplatesSome)).append("\n");
    sb.append("    vmVlanNum: ").append(toIndentedString(vmVlanNum)).append("\n");
    sb.append("    vmVlanNumGt: ").append(toIndentedString(vmVlanNumGt)).append("\n");
    sb.append("    vmVlanNumGte: ").append(toIndentedString(vmVlanNumGte)).append("\n");
    sb.append("    vmVlanNumIn: ").append(toIndentedString(vmVlanNumIn)).append("\n");
    sb.append("    vmVlanNumLt: ").append(toIndentedString(vmVlanNumLt)).append("\n");
    sb.append("    vmVlanNumLte: ").append(toIndentedString(vmVlanNumLte)).append("\n");
    sb.append("    vmVlanNumNot: ").append(toIndentedString(vmVlanNumNot)).append("\n");
    sb.append("    vmVlanNumNotIn: ").append(toIndentedString(vmVlanNumNotIn)).append("\n");
    sb.append("    vmVolumeNum: ").append(toIndentedString(vmVolumeNum)).append("\n");
    sb.append("    vmVolumeNumGt: ").append(toIndentedString(vmVolumeNumGt)).append("\n");
    sb.append("    vmVolumeNumGte: ").append(toIndentedString(vmVolumeNumGte)).append("\n");
    sb.append("    vmVolumeNumIn: ").append(toIndentedString(vmVolumeNumIn)).append("\n");
    sb.append("    vmVolumeNumLt: ").append(toIndentedString(vmVolumeNumLt)).append("\n");
    sb.append("    vmVolumeNumLte: ").append(toIndentedString(vmVolumeNumLte)).append("\n");
    sb.append("    vmVolumeNumNot: ").append(toIndentedString(vmVolumeNumNot)).append("\n");
    sb.append("    vmVolumeNumNotIn: ").append(toIndentedString(vmVolumeNumNotIn)).append("\n");
    sb.append("    vmVolumeSnapshotNum: ").append(toIndentedString(vmVolumeSnapshotNum)).append("\n");
    sb.append("    vmVolumeSnapshotNumGt: ").append(toIndentedString(vmVolumeSnapshotNumGt)).append("\n");
    sb.append("    vmVolumeSnapshotNumGte: ").append(toIndentedString(vmVolumeSnapshotNumGte)).append("\n");
    sb.append("    vmVolumeSnapshotNumIn: ").append(toIndentedString(vmVolumeSnapshotNumIn)).append("\n");
    sb.append("    vmVolumeSnapshotNumLt: ").append(toIndentedString(vmVolumeSnapshotNumLt)).append("\n");
    sb.append("    vmVolumeSnapshotNumLte: ").append(toIndentedString(vmVolumeSnapshotNumLte)).append("\n");
    sb.append("    vmVolumeSnapshotNumNot: ").append(toIndentedString(vmVolumeSnapshotNumNot)).append("\n");
    sb.append("    vmVolumeSnapshotNumNotIn: ").append(toIndentedString(vmVolumeSnapshotNumNotIn)).append("\n");
    sb.append("    vmVolumeSnapshotsEvery: ").append(toIndentedString(vmVolumeSnapshotsEvery)).append("\n");
    sb.append("    vmVolumeSnapshotsNone: ").append(toIndentedString(vmVolumeSnapshotsNone)).append("\n");
    sb.append("    vmVolumeSnapshotsSome: ").append(toIndentedString(vmVolumeSnapshotsSome)).append("\n");
    sb.append("    vmVolumesEvery: ").append(toIndentedString(vmVolumesEvery)).append("\n");
    sb.append("    vmVolumesNone: ").append(toIndentedString(vmVolumesNone)).append("\n");
    sb.append("    vmVolumesSome: ").append(toIndentedString(vmVolumesSome)).append("\n");
    sb.append("    vmsEvery: ").append(toIndentedString(vmsEvery)).append("\n");
    sb.append("    vmsNone: ").append(toIndentedString(vmsNone)).append("\n");
    sb.append("    vmsSome: ").append(toIndentedString(vmsSome)).append("\n");
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

