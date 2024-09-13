package com.arcfra.aoc.model;

import java.util.Objects;
import java.util.Arrays;
import com.arcfra.aoc.model.Architecture;
import com.arcfra.aoc.model.ClusterConnectorErrorCode;
import com.arcfra.aoc.model.ClusterType;
import com.arcfra.aoc.model.ConnectState;
import com.arcfra.aoc.model.EntityAsyncStatus;
import com.arcfra.aoc.model.Hypervisor;
import com.arcfra.aoc.model.LicenseType;
import com.arcfra.aoc.model.NestedDatacenter;
import com.arcfra.aoc.model.NestedHost;
import com.arcfra.aoc.model.NestedLabel;
import com.arcfra.aoc.model.NestedMetroAvailabilityChecklist;
import com.arcfra.aoc.model.NestedVds;
import com.arcfra.aoc.model.NestedVm;
import com.arcfra.aoc.model.NestedVmFolder;
import com.arcfra.aoc.model.NestedVmTemplate;
import com.arcfra.aoc.model.NtpMode;
import com.arcfra.aoc.model.SoftwareEdition;
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
 * Cluster
 */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class Cluster {
  public static final String SERIALIZED_NAME_APPLICATION_HIGHEST_VERSION = "application_highest_version";
  @SerializedName(SERIALIZED_NAME_APPLICATION_HIGHEST_VERSION)
  private String applicationHighestVersion;

  public static final String SERIALIZED_NAME_ARCHITECTURE = "architecture";
  @SerializedName(SERIALIZED_NAME_ARCHITECTURE)
  private Architecture architecture;

  public static final String SERIALIZED_NAME_AUTO_CONVERGE = "auto_converge";
  @SerializedName(SERIALIZED_NAME_AUTO_CONVERGE)
  private Boolean autoConverge;

  public static final String SERIALIZED_NAME_CONNECT_STATE = "connect_state";
  @SerializedName(SERIALIZED_NAME_CONNECT_STATE)
  private ConnectState connectState;

  public static final String SERIALIZED_NAME_CURRENT_CPU_MODEL = "current_cpu_model";
  @SerializedName(SERIALIZED_NAME_CURRENT_CPU_MODEL)
  private String currentCpuModel;

  public static final String SERIALIZED_NAME_DATACENTERS = "datacenters";
  @SerializedName(SERIALIZED_NAME_DATACENTERS)
  private List<NestedDatacenter> datacenters = null;

  public static final String SERIALIZED_NAME_DISCONNECTED_DATE = "disconnected_date";
  @SerializedName(SERIALIZED_NAME_DISCONNECTED_DATE)
  private String disconnectedDate;

  public static final String SERIALIZED_NAME_DISCONNECTED_REASON = "disconnected_reason";
  @SerializedName(SERIALIZED_NAME_DISCONNECTED_REASON)
  private ClusterConnectorErrorCode disconnectedReason;

  public static final String SERIALIZED_NAME_DNS = "dns";
  @SerializedName(SERIALIZED_NAME_DNS)
  private List<String> dns = new ArrayList<String>();

  public static final String SERIALIZED_NAME_ENTITY_ASYNC_STATUS = "entityAsyncStatus";
  @SerializedName(SERIALIZED_NAME_ENTITY_ASYNC_STATUS)
  private EntityAsyncStatus entityAsyncStatus;

  public static final String SERIALIZED_NAME_FAILURE_DATA_SPACE = "failure_data_space";
  @SerializedName(SERIALIZED_NAME_FAILURE_DATA_SPACE)
  private Long failureDataSpace;

  public static final String SERIALIZED_NAME_HAS_METROX = "has_metrox";
  @SerializedName(SERIALIZED_NAME_HAS_METROX)
  private Boolean hasMetrox;

  public static final String SERIALIZED_NAME_HOST_NUM = "host_num";
  @SerializedName(SERIALIZED_NAME_HOST_NUM)
  private Integer hostNum;

  public static final String SERIALIZED_NAME_HOSTS = "hosts";
  @SerializedName(SERIALIZED_NAME_HOSTS)
  private List<NestedHost> hosts = null;

  public static final String SERIALIZED_NAME_HYPERVISOR = "hypervisor";
  @SerializedName(SERIALIZED_NAME_HYPERVISOR)
  private Hypervisor hypervisor;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_IP = "ip";
  @SerializedName(SERIALIZED_NAME_IP)
  private String ip;

  public static final String SERIALIZED_NAME_IS_ALL_FLASH = "is_all_flash";
  @SerializedName(SERIALIZED_NAME_IS_ALL_FLASH)
  private Boolean isAllFlash;

  public static final String SERIALIZED_NAME_ISCSI_VIP = "iscsi_vip";
  @SerializedName(SERIALIZED_NAME_ISCSI_VIP)
  private String iscsiVip;

  public static final String SERIALIZED_NAME_LABELS = "labels";
  @SerializedName(SERIALIZED_NAME_LABELS)
  private List<NestedLabel> labels = null;

  public static final String SERIALIZED_NAME_LICENSE_EXPIRE_DATE = "license_expire_date";
  @SerializedName(SERIALIZED_NAME_LICENSE_EXPIRE_DATE)
  private String licenseExpireDate;

  public static final String SERIALIZED_NAME_LICENSE_SERIAL = "license_serial";
  @SerializedName(SERIALIZED_NAME_LICENSE_SERIAL)
  private String licenseSerial;

  public static final String SERIALIZED_NAME_LICENSE_SIGN_DATE = "license_sign_date";
  @SerializedName(SERIALIZED_NAME_LICENSE_SIGN_DATE)
  private String licenseSignDate;

  public static final String SERIALIZED_NAME_LICENSE_TYPE = "license_type";
  @SerializedName(SERIALIZED_NAME_LICENSE_TYPE)
  private LicenseType licenseType;

  public static final String SERIALIZED_NAME_LOCAL_ID = "local_id";
  @SerializedName(SERIALIZED_NAME_LOCAL_ID)
  private String localId;

  public static final String SERIALIZED_NAME_MAINTENANCE_END_DATE = "maintenance_end_date";
  @SerializedName(SERIALIZED_NAME_MAINTENANCE_END_DATE)
  private String maintenanceEndDate;

  public static final String SERIALIZED_NAME_MAINTENANCE_START_DATE = "maintenance_start_date";
  @SerializedName(SERIALIZED_NAME_MAINTENANCE_START_DATE)
  private String maintenanceStartDate;

  public static final String SERIALIZED_NAME_MANAGEMENT_VIP = "management_vip";
  @SerializedName(SERIALIZED_NAME_MANAGEMENT_VIP)
  private String managementVip;

  public static final String SERIALIZED_NAME_MAX_CHUNK_NUM = "max_chunk_num";
  @SerializedName(SERIALIZED_NAME_MAX_CHUNK_NUM)
  private Integer maxChunkNum;

  public static final String SERIALIZED_NAME_MAX_PHYSICAL_DATA_CAPACITY = "max_physical_data_capacity";
  @SerializedName(SERIALIZED_NAME_MAX_PHYSICAL_DATA_CAPACITY)
  private Long maxPhysicalDataCapacity;

  public static final String SERIALIZED_NAME_MAX_PHYSICAL_DATA_CAPACITY_PER_NODE = "max_physical_data_capacity_per_node";
  @SerializedName(SERIALIZED_NAME_MAX_PHYSICAL_DATA_CAPACITY_PER_NODE)
  private Long maxPhysicalDataCapacityPerNode;

  public static final String SERIALIZED_NAME_METRO_AVAILABILITY_CHECKLIST = "metro_availability_checklist";
  @SerializedName(SERIALIZED_NAME_METRO_AVAILABILITY_CHECKLIST)
  private NestedMetroAvailabilityChecklist metroAvailabilityChecklist;

  public static final String SERIALIZED_NAME_MGT_GATEWAY = "mgt_gateway";
  @SerializedName(SERIALIZED_NAME_MGT_GATEWAY)
  private String mgtGateway;

  public static final String SERIALIZED_NAME_MGT_NETMASK = "mgt_netmask";
  @SerializedName(SERIALIZED_NAME_MGT_NETMASK)
  private String mgtNetmask;

  public static final String SERIALIZED_NAME_MIGRATION_DATA_SIZE = "migration_data_size";
  @SerializedName(SERIALIZED_NAME_MIGRATION_DATA_SIZE)
  private Long migrationDataSize;

  public static final String SERIALIZED_NAME_MIGRATION_SPEED = "migration_speed";
  @SerializedName(SERIALIZED_NAME_MIGRATION_SPEED)
  private Long migrationSpeed;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NTP_MODE = "ntp_mode";
  @SerializedName(SERIALIZED_NAME_NTP_MODE)
  private NtpMode ntpMode;

  public static final String SERIALIZED_NAME_NTP_SERVERS = "ntp_servers";
  @SerializedName(SERIALIZED_NAME_NTP_SERVERS)
  private List<String> ntpServers = new ArrayList<String>();

  public static final String SERIALIZED_NAME_NVME_OVER_RDMA_ENABLED = "nvme_over_rdma_enabled";
  @SerializedName(SERIALIZED_NAME_NVME_OVER_RDMA_ENABLED)
  private Boolean nvmeOverRdmaEnabled;

  public static final String SERIALIZED_NAME_NVME_OVER_TCP_ENABLED = "nvme_over_tcp_enabled";
  @SerializedName(SERIALIZED_NAME_NVME_OVER_TCP_ENABLED)
  private Boolean nvmeOverTcpEnabled;

  public static final String SERIALIZED_NAME_NVMF_ENABLED = "nvmf_enabled";
  @SerializedName(SERIALIZED_NAME_NVMF_ENABLED)
  private Boolean nvmfEnabled;

  public static final String SERIALIZED_NAME_PMEM_ENABLED = "pmem_enabled";
  @SerializedName(SERIALIZED_NAME_PMEM_ENABLED)
  private Boolean pmemEnabled;

  public static final String SERIALIZED_NAME_PROVISIONED_CPU_CORES = "provisioned_cpu_cores";
  @SerializedName(SERIALIZED_NAME_PROVISIONED_CPU_CORES)
  private Integer provisionedCpuCores;

  public static final String SERIALIZED_NAME_PROVISIONED_CPU_CORES_FOR_ACTIVE_VM = "provisioned_cpu_cores_for_active_vm";
  @SerializedName(SERIALIZED_NAME_PROVISIONED_CPU_CORES_FOR_ACTIVE_VM)
  private Integer provisionedCpuCoresForActiveVm;

  public static final String SERIALIZED_NAME_PROVISIONED_FOR_ACTIVE_VM_RATIO = "provisioned_for_active_vm_ratio";
  @SerializedName(SERIALIZED_NAME_PROVISIONED_FOR_ACTIVE_VM_RATIO)
  private Double provisionedForActiveVmRatio;

  public static final String SERIALIZED_NAME_PROVISIONED_MEMORY_BYTES = "provisioned_memory_bytes";
  @SerializedName(SERIALIZED_NAME_PROVISIONED_MEMORY_BYTES)
  private Long provisionedMemoryBytes;

  public static final String SERIALIZED_NAME_PROVISIONED_RATIO = "provisioned_ratio";
  @SerializedName(SERIALIZED_NAME_PROVISIONED_RATIO)
  private Double provisionedRatio;

  public static final String SERIALIZED_NAME_RDMA_ENABLED = "rdma_enabled";
  @SerializedName(SERIALIZED_NAME_RDMA_ENABLED)
  private Boolean rdmaEnabled;

  public static final String SERIALIZED_NAME_RECOMMENDED_CPU_MODELS = "recommended_cpu_models";
  @SerializedName(SERIALIZED_NAME_RECOMMENDED_CPU_MODELS)
  private List<String> recommendedCpuModels = new ArrayList<String>();

  public static final String SERIALIZED_NAME_RECOVER_DATA_SIZE = "recover_data_size";
  @SerializedName(SERIALIZED_NAME_RECOVER_DATA_SIZE)
  private Long recoverDataSize;

  public static final String SERIALIZED_NAME_RECOVER_SPEED = "recover_speed";
  @SerializedName(SERIALIZED_NAME_RECOVER_SPEED)
  private Long recoverSpeed;

  public static final String SERIALIZED_NAME_RESERVED_CPU_CORES_FOR_SYSTEM_SERVICE = "reserved_cpu_cores_for_system_service";
  @SerializedName(SERIALIZED_NAME_RESERVED_CPU_CORES_FOR_SYSTEM_SERVICE)
  private Integer reservedCpuCoresForSystemService;

  public static final String SERIALIZED_NAME_RUNNING_VM_NUM = "running_vm_num";
  @SerializedName(SERIALIZED_NAME_RUNNING_VM_NUM)
  private Integer runningVmNum;

  public static final String SERIALIZED_NAME_SOFTWARE_EDITION = "software_edition";
  @SerializedName(SERIALIZED_NAME_SOFTWARE_EDITION)
  private SoftwareEdition softwareEdition;

  public static final String SERIALIZED_NAME_STOPPED_VM_NUM = "stopped_vm_num";
  @SerializedName(SERIALIZED_NAME_STOPPED_VM_NUM)
  private Integer stoppedVmNum;

  public static final String SERIALIZED_NAME_STRETCH = "stretch";
  @SerializedName(SERIALIZED_NAME_STRETCH)
  private Boolean stretch;

  public static final String SERIALIZED_NAME_SUSPENDED_VM_NUM = "suspended_vm_num";
  @SerializedName(SERIALIZED_NAME_SUSPENDED_VM_NUM)
  private Integer suspendedVmNum;

  public static final String SERIALIZED_NAME_TOTAL_CACHE_CAPACITY = "total_cache_capacity";
  @SerializedName(SERIALIZED_NAME_TOTAL_CACHE_CAPACITY)
  private Long totalCacheCapacity;

  public static final String SERIALIZED_NAME_TOTAL_CPU_CORES = "total_cpu_cores";
  @SerializedName(SERIALIZED_NAME_TOTAL_CPU_CORES)
  private Integer totalCpuCores;

  public static final String SERIALIZED_NAME_TOTAL_CPU_HZ = "total_cpu_hz";
  @SerializedName(SERIALIZED_NAME_TOTAL_CPU_HZ)
  private Long totalCpuHz;

  public static final String SERIALIZED_NAME_TOTAL_CPU_MODELS = "total_cpu_models";
  @SerializedName(SERIALIZED_NAME_TOTAL_CPU_MODELS)
  private List<String> totalCpuModels = new ArrayList<String>();

  public static final String SERIALIZED_NAME_TOTAL_CPU_SOCKETS = "total_cpu_sockets";
  @SerializedName(SERIALIZED_NAME_TOTAL_CPU_SOCKETS)
  private Integer totalCpuSockets;

  public static final String SERIALIZED_NAME_TOTAL_DATA_CAPACITY = "total_data_capacity";
  @SerializedName(SERIALIZED_NAME_TOTAL_DATA_CAPACITY)
  private Long totalDataCapacity;

  public static final String SERIALIZED_NAME_TOTAL_MEMORY_BYTES = "total_memory_bytes";
  @SerializedName(SERIALIZED_NAME_TOTAL_MEMORY_BYTES)
  private Long totalMemoryBytes;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private ClusterType type;

  public static final String SERIALIZED_NAME_UPGRADE_TOOL_VERSION = "upgrade_tool_version";
  @SerializedName(SERIALIZED_NAME_UPGRADE_TOOL_VERSION)
  private String upgradeToolVersion;

  public static final String SERIALIZED_NAME_USED_CPU_HZ = "used_cpu_hz";
  @SerializedName(SERIALIZED_NAME_USED_CPU_HZ)
  private Double usedCpuHz;

  public static final String SERIALIZED_NAME_USED_DATA_SPACE = "used_data_space";
  @SerializedName(SERIALIZED_NAME_USED_DATA_SPACE)
  private Long usedDataSpace;

  public static final String SERIALIZED_NAME_USED_MEMORY_BYTES = "used_memory_bytes";
  @SerializedName(SERIALIZED_NAME_USED_MEMORY_BYTES)
  private Double usedMemoryBytes;

  public static final String SERIALIZED_NAME_VALID_DATA_SPACE = "valid_data_space";
  @SerializedName(SERIALIZED_NAME_VALID_DATA_SPACE)
  private Long validDataSpace;

  public static final String SERIALIZED_NAME_VDSES = "vdses";
  @SerializedName(SERIALIZED_NAME_VDSES)
  private List<NestedVds> vdses = null;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private String version;

  public static final String SERIALIZED_NAME_VHOST_ENABLED = "vhost_enabled";
  @SerializedName(SERIALIZED_NAME_VHOST_ENABLED)
  private Boolean vhostEnabled;

  public static final String SERIALIZED_NAME_VM_FOLDERS = "vm_folders";
  @SerializedName(SERIALIZED_NAME_VM_FOLDERS)
  private List<NestedVmFolder> vmFolders = null;

  public static final String SERIALIZED_NAME_VM_NUM = "vm_num";
  @SerializedName(SERIALIZED_NAME_VM_NUM)
  private Integer vmNum;

  public static final String SERIALIZED_NAME_VM_TEMPLATES = "vm_templates";
  @SerializedName(SERIALIZED_NAME_VM_TEMPLATES)
  private List<NestedVmTemplate> vmTemplates = null;

  public static final String SERIALIZED_NAME_VMS = "vms";
  @SerializedName(SERIALIZED_NAME_VMS)
  private List<NestedVm> vms = null;

  public Cluster() { 
  }

  public Cluster applicationHighestVersion(String applicationHighestVersion) {
    
    this.applicationHighestVersion = applicationHighestVersion;
    return this;
  }

   /**
   * Get applicationHighestVersion
   * @return applicationHighestVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getApplicationHighestVersion() {
    return applicationHighestVersion;
  }


  public void setApplicationHighestVersion(String applicationHighestVersion) {
    this.applicationHighestVersion = applicationHighestVersion;
  }


  public Cluster architecture(Architecture architecture) {
    
    this.architecture = architecture;
    return this;
  }

   /**
   * Get architecture
   * @return architecture
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Architecture getArchitecture() {
    return architecture;
  }


  public void setArchitecture(Architecture architecture) {
    this.architecture = architecture;
  }


  public Cluster autoConverge(Boolean autoConverge) {
    
    this.autoConverge = autoConverge;
    return this;
  }

   /**
   * Get autoConverge
   * @return autoConverge
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getAutoConverge() {
    return autoConverge;
  }


  public void setAutoConverge(Boolean autoConverge) {
    this.autoConverge = autoConverge;
  }


  public Cluster connectState(ConnectState connectState) {
    
    this.connectState = connectState;
    return this;
  }

   /**
   * Get connectState
   * @return connectState
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public ConnectState getConnectState() {
    return connectState;
  }


  public void setConnectState(ConnectState connectState) {
    this.connectState = connectState;
  }


  public Cluster currentCpuModel(String currentCpuModel) {
    
    this.currentCpuModel = currentCpuModel;
    return this;
  }

   /**
   * Get currentCpuModel
   * @return currentCpuModel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCurrentCpuModel() {
    return currentCpuModel;
  }


  public void setCurrentCpuModel(String currentCpuModel) {
    this.currentCpuModel = currentCpuModel;
  }


  public Cluster datacenters(List<NestedDatacenter> datacenters) {
    
    this.datacenters = datacenters;
    return this;
  }

  public Cluster addDatacentersItem(NestedDatacenter datacentersItem) {
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


  public Cluster disconnectedDate(String disconnectedDate) {
    
    this.disconnectedDate = disconnectedDate;
    return this;
  }

   /**
   * Get disconnectedDate
   * @return disconnectedDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDisconnectedDate() {
    return disconnectedDate;
  }


  public void setDisconnectedDate(String disconnectedDate) {
    this.disconnectedDate = disconnectedDate;
  }


  public Cluster disconnectedReason(ClusterConnectorErrorCode disconnectedReason) {
    
    this.disconnectedReason = disconnectedReason;
    return this;
  }

   /**
   * Get disconnectedReason
   * @return disconnectedReason
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ClusterConnectorErrorCode getDisconnectedReason() {
    return disconnectedReason;
  }


  public void setDisconnectedReason(ClusterConnectorErrorCode disconnectedReason) {
    this.disconnectedReason = disconnectedReason;
  }


  public Cluster dns(List<String> dns) {
    
    this.dns = dns;
    return this;
  }

  public Cluster addDnsItem(String dnsItem) {
    this.dns.add(dnsItem);
    return this;
  }

   /**
   * Get dns
   * @return dns
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<String> getDns() {
    return dns;
  }


  public void setDns(List<String> dns) {
    this.dns = dns;
  }


  public Cluster entityAsyncStatus(EntityAsyncStatus entityAsyncStatus) {
    
    this.entityAsyncStatus = entityAsyncStatus;
    return this;
  }

   /**
   * Get entityAsyncStatus
   * @return entityAsyncStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public EntityAsyncStatus getEntityAsyncStatus() {
    return entityAsyncStatus;
  }


  public void setEntityAsyncStatus(EntityAsyncStatus entityAsyncStatus) {
    this.entityAsyncStatus = entityAsyncStatus;
  }


  public Cluster failureDataSpace(Long failureDataSpace) {
    
    this.failureDataSpace = failureDataSpace;
    return this;
  }

   /**
   * Get failureDataSpace
   * @return failureDataSpace
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getFailureDataSpace() {
    return failureDataSpace;
  }


  public void setFailureDataSpace(Long failureDataSpace) {
    this.failureDataSpace = failureDataSpace;
  }


  public Cluster hasMetrox(Boolean hasMetrox) {
    
    this.hasMetrox = hasMetrox;
    return this;
  }

   /**
   * Get hasMetrox
   * @return hasMetrox
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getHasMetrox() {
    return hasMetrox;
  }


  public void setHasMetrox(Boolean hasMetrox) {
    this.hasMetrox = hasMetrox;
  }


  public Cluster hostNum(Integer hostNum) {
    
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


  public Cluster hosts(List<NestedHost> hosts) {
    
    this.hosts = hosts;
    return this;
  }

  public Cluster addHostsItem(NestedHost hostsItem) {
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


  public Cluster hypervisor(Hypervisor hypervisor) {
    
    this.hypervisor = hypervisor;
    return this;
  }

   /**
   * Get hypervisor
   * @return hypervisor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Hypervisor getHypervisor() {
    return hypervisor;
  }


  public void setHypervisor(Hypervisor hypervisor) {
    this.hypervisor = hypervisor;
  }


  public Cluster id(String id) {
    
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


  public Cluster ip(String ip) {
    
    this.ip = ip;
    return this;
  }

   /**
   * Get ip
   * @return ip
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getIp() {
    return ip;
  }


  public void setIp(String ip) {
    this.ip = ip;
  }


  public Cluster isAllFlash(Boolean isAllFlash) {
    
    this.isAllFlash = isAllFlash;
    return this;
  }

   /**
   * Get isAllFlash
   * @return isAllFlash
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsAllFlash() {
    return isAllFlash;
  }


  public void setIsAllFlash(Boolean isAllFlash) {
    this.isAllFlash = isAllFlash;
  }


  public Cluster iscsiVip(String iscsiVip) {
    
    this.iscsiVip = iscsiVip;
    return this;
  }

   /**
   * Get iscsiVip
   * @return iscsiVip
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIscsiVip() {
    return iscsiVip;
  }


  public void setIscsiVip(String iscsiVip) {
    this.iscsiVip = iscsiVip;
  }


  public Cluster labels(List<NestedLabel> labels) {
    
    this.labels = labels;
    return this;
  }

  public Cluster addLabelsItem(NestedLabel labelsItem) {
    if (this.labels == null) {
      this.labels = new ArrayList<NestedLabel>();
    }
    this.labels.add(labelsItem);
    return this;
  }

   /**
   * Get labels
   * @return labels
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<NestedLabel> getLabels() {
    return labels;
  }


  public void setLabels(List<NestedLabel> labels) {
    this.labels = labels;
  }


  public Cluster licenseExpireDate(String licenseExpireDate) {
    
    this.licenseExpireDate = licenseExpireDate;
    return this;
  }

   /**
   * Get licenseExpireDate
   * @return licenseExpireDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLicenseExpireDate() {
    return licenseExpireDate;
  }


  public void setLicenseExpireDate(String licenseExpireDate) {
    this.licenseExpireDate = licenseExpireDate;
  }


  public Cluster licenseSerial(String licenseSerial) {
    
    this.licenseSerial = licenseSerial;
    return this;
  }

   /**
   * Get licenseSerial
   * @return licenseSerial
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLicenseSerial() {
    return licenseSerial;
  }


  public void setLicenseSerial(String licenseSerial) {
    this.licenseSerial = licenseSerial;
  }


  public Cluster licenseSignDate(String licenseSignDate) {
    
    this.licenseSignDate = licenseSignDate;
    return this;
  }

   /**
   * Get licenseSignDate
   * @return licenseSignDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLicenseSignDate() {
    return licenseSignDate;
  }


  public void setLicenseSignDate(String licenseSignDate) {
    this.licenseSignDate = licenseSignDate;
  }


  public Cluster licenseType(LicenseType licenseType) {
    
    this.licenseType = licenseType;
    return this;
  }

   /**
   * Get licenseType
   * @return licenseType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public LicenseType getLicenseType() {
    return licenseType;
  }


  public void setLicenseType(LicenseType licenseType) {
    this.licenseType = licenseType;
  }


  public Cluster localId(String localId) {
    
    this.localId = localId;
    return this;
  }

   /**
   * Get localId
   * @return localId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLocalId() {
    return localId;
  }


  public void setLocalId(String localId) {
    this.localId = localId;
  }


  public Cluster maintenanceEndDate(String maintenanceEndDate) {
    
    this.maintenanceEndDate = maintenanceEndDate;
    return this;
  }

   /**
   * Get maintenanceEndDate
   * @return maintenanceEndDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMaintenanceEndDate() {
    return maintenanceEndDate;
  }


  public void setMaintenanceEndDate(String maintenanceEndDate) {
    this.maintenanceEndDate = maintenanceEndDate;
  }


  public Cluster maintenanceStartDate(String maintenanceStartDate) {
    
    this.maintenanceStartDate = maintenanceStartDate;
    return this;
  }

   /**
   * Get maintenanceStartDate
   * @return maintenanceStartDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMaintenanceStartDate() {
    return maintenanceStartDate;
  }


  public void setMaintenanceStartDate(String maintenanceStartDate) {
    this.maintenanceStartDate = maintenanceStartDate;
  }


  public Cluster managementVip(String managementVip) {
    
    this.managementVip = managementVip;
    return this;
  }

   /**
   * Get managementVip
   * @return managementVip
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getManagementVip() {
    return managementVip;
  }


  public void setManagementVip(String managementVip) {
    this.managementVip = managementVip;
  }


  public Cluster maxChunkNum(Integer maxChunkNum) {
    
    this.maxChunkNum = maxChunkNum;
    return this;
  }

   /**
   * Get maxChunkNum
   * @return maxChunkNum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getMaxChunkNum() {
    return maxChunkNum;
  }


  public void setMaxChunkNum(Integer maxChunkNum) {
    this.maxChunkNum = maxChunkNum;
  }


  public Cluster maxPhysicalDataCapacity(Long maxPhysicalDataCapacity) {
    
    this.maxPhysicalDataCapacity = maxPhysicalDataCapacity;
    return this;
  }

   /**
   * Get maxPhysicalDataCapacity
   * @return maxPhysicalDataCapacity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getMaxPhysicalDataCapacity() {
    return maxPhysicalDataCapacity;
  }


  public void setMaxPhysicalDataCapacity(Long maxPhysicalDataCapacity) {
    this.maxPhysicalDataCapacity = maxPhysicalDataCapacity;
  }


  public Cluster maxPhysicalDataCapacityPerNode(Long maxPhysicalDataCapacityPerNode) {
    
    this.maxPhysicalDataCapacityPerNode = maxPhysicalDataCapacityPerNode;
    return this;
  }

   /**
   * Get maxPhysicalDataCapacityPerNode
   * @return maxPhysicalDataCapacityPerNode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getMaxPhysicalDataCapacityPerNode() {
    return maxPhysicalDataCapacityPerNode;
  }


  public void setMaxPhysicalDataCapacityPerNode(Long maxPhysicalDataCapacityPerNode) {
    this.maxPhysicalDataCapacityPerNode = maxPhysicalDataCapacityPerNode;
  }


  public Cluster metroAvailabilityChecklist(NestedMetroAvailabilityChecklist metroAvailabilityChecklist) {
    
    this.metroAvailabilityChecklist = metroAvailabilityChecklist;
    return this;
  }

   /**
   * Get metroAvailabilityChecklist
   * @return metroAvailabilityChecklist
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public NestedMetroAvailabilityChecklist getMetroAvailabilityChecklist() {
    return metroAvailabilityChecklist;
  }


  public void setMetroAvailabilityChecklist(NestedMetroAvailabilityChecklist metroAvailabilityChecklist) {
    this.metroAvailabilityChecklist = metroAvailabilityChecklist;
  }


  public Cluster mgtGateway(String mgtGateway) {
    
    this.mgtGateway = mgtGateway;
    return this;
  }

   /**
   * Get mgtGateway
   * @return mgtGateway
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMgtGateway() {
    return mgtGateway;
  }


  public void setMgtGateway(String mgtGateway) {
    this.mgtGateway = mgtGateway;
  }


  public Cluster mgtNetmask(String mgtNetmask) {
    
    this.mgtNetmask = mgtNetmask;
    return this;
  }

   /**
   * Get mgtNetmask
   * @return mgtNetmask
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMgtNetmask() {
    return mgtNetmask;
  }


  public void setMgtNetmask(String mgtNetmask) {
    this.mgtNetmask = mgtNetmask;
  }


  public Cluster migrationDataSize(Long migrationDataSize) {
    
    this.migrationDataSize = migrationDataSize;
    return this;
  }

   /**
   * Get migrationDataSize
   * @return migrationDataSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getMigrationDataSize() {
    return migrationDataSize;
  }


  public void setMigrationDataSize(Long migrationDataSize) {
    this.migrationDataSize = migrationDataSize;
  }


  public Cluster migrationSpeed(Long migrationSpeed) {
    
    this.migrationSpeed = migrationSpeed;
    return this;
  }

   /**
   * Get migrationSpeed
   * @return migrationSpeed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getMigrationSpeed() {
    return migrationSpeed;
  }


  public void setMigrationSpeed(Long migrationSpeed) {
    this.migrationSpeed = migrationSpeed;
  }


  public Cluster name(String name) {
    
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


  public Cluster ntpMode(NtpMode ntpMode) {
    
    this.ntpMode = ntpMode;
    return this;
  }

   /**
   * Get ntpMode
   * @return ntpMode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public NtpMode getNtpMode() {
    return ntpMode;
  }


  public void setNtpMode(NtpMode ntpMode) {
    this.ntpMode = ntpMode;
  }


  public Cluster ntpServers(List<String> ntpServers) {
    
    this.ntpServers = ntpServers;
    return this;
  }

  public Cluster addNtpServersItem(String ntpServersItem) {
    this.ntpServers.add(ntpServersItem);
    return this;
  }

   /**
   * Get ntpServers
   * @return ntpServers
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<String> getNtpServers() {
    return ntpServers;
  }


  public void setNtpServers(List<String> ntpServers) {
    this.ntpServers = ntpServers;
  }


  public Cluster nvmeOverRdmaEnabled(Boolean nvmeOverRdmaEnabled) {
    
    this.nvmeOverRdmaEnabled = nvmeOverRdmaEnabled;
    return this;
  }

   /**
   * Get nvmeOverRdmaEnabled
   * @return nvmeOverRdmaEnabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getNvmeOverRdmaEnabled() {
    return nvmeOverRdmaEnabled;
  }


  public void setNvmeOverRdmaEnabled(Boolean nvmeOverRdmaEnabled) {
    this.nvmeOverRdmaEnabled = nvmeOverRdmaEnabled;
  }


  public Cluster nvmeOverTcpEnabled(Boolean nvmeOverTcpEnabled) {
    
    this.nvmeOverTcpEnabled = nvmeOverTcpEnabled;
    return this;
  }

   /**
   * Get nvmeOverTcpEnabled
   * @return nvmeOverTcpEnabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getNvmeOverTcpEnabled() {
    return nvmeOverTcpEnabled;
  }


  public void setNvmeOverTcpEnabled(Boolean nvmeOverTcpEnabled) {
    this.nvmeOverTcpEnabled = nvmeOverTcpEnabled;
  }


  public Cluster nvmfEnabled(Boolean nvmfEnabled) {
    
    this.nvmfEnabled = nvmfEnabled;
    return this;
  }

   /**
   * Get nvmfEnabled
   * @return nvmfEnabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getNvmfEnabled() {
    return nvmfEnabled;
  }


  public void setNvmfEnabled(Boolean nvmfEnabled) {
    this.nvmfEnabled = nvmfEnabled;
  }


  public Cluster pmemEnabled(Boolean pmemEnabled) {
    
    this.pmemEnabled = pmemEnabled;
    return this;
  }

   /**
   * Get pmemEnabled
   * @return pmemEnabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getPmemEnabled() {
    return pmemEnabled;
  }


  public void setPmemEnabled(Boolean pmemEnabled) {
    this.pmemEnabled = pmemEnabled;
  }


  public Cluster provisionedCpuCores(Integer provisionedCpuCores) {
    
    this.provisionedCpuCores = provisionedCpuCores;
    return this;
  }

   /**
   * Get provisionedCpuCores
   * @return provisionedCpuCores
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getProvisionedCpuCores() {
    return provisionedCpuCores;
  }


  public void setProvisionedCpuCores(Integer provisionedCpuCores) {
    this.provisionedCpuCores = provisionedCpuCores;
  }


  public Cluster provisionedCpuCoresForActiveVm(Integer provisionedCpuCoresForActiveVm) {
    
    this.provisionedCpuCoresForActiveVm = provisionedCpuCoresForActiveVm;
    return this;
  }

   /**
   * Get provisionedCpuCoresForActiveVm
   * @return provisionedCpuCoresForActiveVm
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getProvisionedCpuCoresForActiveVm() {
    return provisionedCpuCoresForActiveVm;
  }


  public void setProvisionedCpuCoresForActiveVm(Integer provisionedCpuCoresForActiveVm) {
    this.provisionedCpuCoresForActiveVm = provisionedCpuCoresForActiveVm;
  }


  public Cluster provisionedForActiveVmRatio(Double provisionedForActiveVmRatio) {
    
    this.provisionedForActiveVmRatio = provisionedForActiveVmRatio;
    return this;
  }

   /**
   * Get provisionedForActiveVmRatio
   * @return provisionedForActiveVmRatio
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getProvisionedForActiveVmRatio() {
    return provisionedForActiveVmRatio;
  }


  public void setProvisionedForActiveVmRatio(Double provisionedForActiveVmRatio) {
    this.provisionedForActiveVmRatio = provisionedForActiveVmRatio;
  }


  public Cluster provisionedMemoryBytes(Long provisionedMemoryBytes) {
    
    this.provisionedMemoryBytes = provisionedMemoryBytes;
    return this;
  }

   /**
   * Get provisionedMemoryBytes
   * @return provisionedMemoryBytes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getProvisionedMemoryBytes() {
    return provisionedMemoryBytes;
  }


  public void setProvisionedMemoryBytes(Long provisionedMemoryBytes) {
    this.provisionedMemoryBytes = provisionedMemoryBytes;
  }


  public Cluster provisionedRatio(Double provisionedRatio) {
    
    this.provisionedRatio = provisionedRatio;
    return this;
  }

   /**
   * Get provisionedRatio
   * @return provisionedRatio
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getProvisionedRatio() {
    return provisionedRatio;
  }


  public void setProvisionedRatio(Double provisionedRatio) {
    this.provisionedRatio = provisionedRatio;
  }


  public Cluster rdmaEnabled(Boolean rdmaEnabled) {
    
    this.rdmaEnabled = rdmaEnabled;
    return this;
  }

   /**
   * Get rdmaEnabled
   * @return rdmaEnabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getRdmaEnabled() {
    return rdmaEnabled;
  }


  public void setRdmaEnabled(Boolean rdmaEnabled) {
    this.rdmaEnabled = rdmaEnabled;
  }


  public Cluster recommendedCpuModels(List<String> recommendedCpuModels) {
    
    this.recommendedCpuModels = recommendedCpuModels;
    return this;
  }

  public Cluster addRecommendedCpuModelsItem(String recommendedCpuModelsItem) {
    this.recommendedCpuModels.add(recommendedCpuModelsItem);
    return this;
  }

   /**
   * Get recommendedCpuModels
   * @return recommendedCpuModels
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<String> getRecommendedCpuModels() {
    return recommendedCpuModels;
  }


  public void setRecommendedCpuModels(List<String> recommendedCpuModels) {
    this.recommendedCpuModels = recommendedCpuModels;
  }


  public Cluster recoverDataSize(Long recoverDataSize) {
    
    this.recoverDataSize = recoverDataSize;
    return this;
  }

   /**
   * Get recoverDataSize
   * @return recoverDataSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getRecoverDataSize() {
    return recoverDataSize;
  }


  public void setRecoverDataSize(Long recoverDataSize) {
    this.recoverDataSize = recoverDataSize;
  }


  public Cluster recoverSpeed(Long recoverSpeed) {
    
    this.recoverSpeed = recoverSpeed;
    return this;
  }

   /**
   * Get recoverSpeed
   * @return recoverSpeed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getRecoverSpeed() {
    return recoverSpeed;
  }


  public void setRecoverSpeed(Long recoverSpeed) {
    this.recoverSpeed = recoverSpeed;
  }


  public Cluster reservedCpuCoresForSystemService(Integer reservedCpuCoresForSystemService) {
    
    this.reservedCpuCoresForSystemService = reservedCpuCoresForSystemService;
    return this;
  }

   /**
   * Get reservedCpuCoresForSystemService
   * @return reservedCpuCoresForSystemService
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getReservedCpuCoresForSystemService() {
    return reservedCpuCoresForSystemService;
  }


  public void setReservedCpuCoresForSystemService(Integer reservedCpuCoresForSystemService) {
    this.reservedCpuCoresForSystemService = reservedCpuCoresForSystemService;
  }


  public Cluster runningVmNum(Integer runningVmNum) {
    
    this.runningVmNum = runningVmNum;
    return this;
  }

   /**
   * Get runningVmNum
   * @return runningVmNum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getRunningVmNum() {
    return runningVmNum;
  }


  public void setRunningVmNum(Integer runningVmNum) {
    this.runningVmNum = runningVmNum;
  }


  public Cluster softwareEdition(SoftwareEdition softwareEdition) {
    
    this.softwareEdition = softwareEdition;
    return this;
  }

   /**
   * Get softwareEdition
   * @return softwareEdition
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SoftwareEdition getSoftwareEdition() {
    return softwareEdition;
  }


  public void setSoftwareEdition(SoftwareEdition softwareEdition) {
    this.softwareEdition = softwareEdition;
  }


  public Cluster stoppedVmNum(Integer stoppedVmNum) {
    
    this.stoppedVmNum = stoppedVmNum;
    return this;
  }

   /**
   * Get stoppedVmNum
   * @return stoppedVmNum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getStoppedVmNum() {
    return stoppedVmNum;
  }


  public void setStoppedVmNum(Integer stoppedVmNum) {
    this.stoppedVmNum = stoppedVmNum;
  }


  public Cluster stretch(Boolean stretch) {
    
    this.stretch = stretch;
    return this;
  }

   /**
   * Get stretch
   * @return stretch
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getStretch() {
    return stretch;
  }


  public void setStretch(Boolean stretch) {
    this.stretch = stretch;
  }


  public Cluster suspendedVmNum(Integer suspendedVmNum) {
    
    this.suspendedVmNum = suspendedVmNum;
    return this;
  }

   /**
   * Get suspendedVmNum
   * @return suspendedVmNum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getSuspendedVmNum() {
    return suspendedVmNum;
  }


  public void setSuspendedVmNum(Integer suspendedVmNum) {
    this.suspendedVmNum = suspendedVmNum;
  }


  public Cluster totalCacheCapacity(Long totalCacheCapacity) {
    
    this.totalCacheCapacity = totalCacheCapacity;
    return this;
  }

   /**
   * Get totalCacheCapacity
   * @return totalCacheCapacity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getTotalCacheCapacity() {
    return totalCacheCapacity;
  }


  public void setTotalCacheCapacity(Long totalCacheCapacity) {
    this.totalCacheCapacity = totalCacheCapacity;
  }


  public Cluster totalCpuCores(Integer totalCpuCores) {
    
    this.totalCpuCores = totalCpuCores;
    return this;
  }

   /**
   * Get totalCpuCores
   * @return totalCpuCores
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getTotalCpuCores() {
    return totalCpuCores;
  }


  public void setTotalCpuCores(Integer totalCpuCores) {
    this.totalCpuCores = totalCpuCores;
  }


  public Cluster totalCpuHz(Long totalCpuHz) {
    
    this.totalCpuHz = totalCpuHz;
    return this;
  }

   /**
   * Get totalCpuHz
   * @return totalCpuHz
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getTotalCpuHz() {
    return totalCpuHz;
  }


  public void setTotalCpuHz(Long totalCpuHz) {
    this.totalCpuHz = totalCpuHz;
  }


  public Cluster totalCpuModels(List<String> totalCpuModels) {
    
    this.totalCpuModels = totalCpuModels;
    return this;
  }

  public Cluster addTotalCpuModelsItem(String totalCpuModelsItem) {
    this.totalCpuModels.add(totalCpuModelsItem);
    return this;
  }

   /**
   * Get totalCpuModels
   * @return totalCpuModels
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<String> getTotalCpuModels() {
    return totalCpuModels;
  }


  public void setTotalCpuModels(List<String> totalCpuModels) {
    this.totalCpuModels = totalCpuModels;
  }


  public Cluster totalCpuSockets(Integer totalCpuSockets) {
    
    this.totalCpuSockets = totalCpuSockets;
    return this;
  }

   /**
   * Get totalCpuSockets
   * @return totalCpuSockets
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getTotalCpuSockets() {
    return totalCpuSockets;
  }


  public void setTotalCpuSockets(Integer totalCpuSockets) {
    this.totalCpuSockets = totalCpuSockets;
  }


  public Cluster totalDataCapacity(Long totalDataCapacity) {
    
    this.totalDataCapacity = totalDataCapacity;
    return this;
  }

   /**
   * Get totalDataCapacity
   * @return totalDataCapacity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getTotalDataCapacity() {
    return totalDataCapacity;
  }


  public void setTotalDataCapacity(Long totalDataCapacity) {
    this.totalDataCapacity = totalDataCapacity;
  }


  public Cluster totalMemoryBytes(Long totalMemoryBytes) {
    
    this.totalMemoryBytes = totalMemoryBytes;
    return this;
  }

   /**
   * Get totalMemoryBytes
   * @return totalMemoryBytes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getTotalMemoryBytes() {
    return totalMemoryBytes;
  }


  public void setTotalMemoryBytes(Long totalMemoryBytes) {
    this.totalMemoryBytes = totalMemoryBytes;
  }


  public Cluster type(ClusterType type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public ClusterType getType() {
    return type;
  }


  public void setType(ClusterType type) {
    this.type = type;
  }


  public Cluster upgradeToolVersion(String upgradeToolVersion) {
    
    this.upgradeToolVersion = upgradeToolVersion;
    return this;
  }

   /**
   * Get upgradeToolVersion
   * @return upgradeToolVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUpgradeToolVersion() {
    return upgradeToolVersion;
  }


  public void setUpgradeToolVersion(String upgradeToolVersion) {
    this.upgradeToolVersion = upgradeToolVersion;
  }


  public Cluster usedCpuHz(Double usedCpuHz) {
    
    this.usedCpuHz = usedCpuHz;
    return this;
  }

   /**
   * Get usedCpuHz
   * @return usedCpuHz
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getUsedCpuHz() {
    return usedCpuHz;
  }


  public void setUsedCpuHz(Double usedCpuHz) {
    this.usedCpuHz = usedCpuHz;
  }


  public Cluster usedDataSpace(Long usedDataSpace) {
    
    this.usedDataSpace = usedDataSpace;
    return this;
  }

   /**
   * Get usedDataSpace
   * @return usedDataSpace
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getUsedDataSpace() {
    return usedDataSpace;
  }


  public void setUsedDataSpace(Long usedDataSpace) {
    this.usedDataSpace = usedDataSpace;
  }


  public Cluster usedMemoryBytes(Double usedMemoryBytes) {
    
    this.usedMemoryBytes = usedMemoryBytes;
    return this;
  }

   /**
   * Get usedMemoryBytes
   * @return usedMemoryBytes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getUsedMemoryBytes() {
    return usedMemoryBytes;
  }


  public void setUsedMemoryBytes(Double usedMemoryBytes) {
    this.usedMemoryBytes = usedMemoryBytes;
  }


  public Cluster validDataSpace(Long validDataSpace) {
    
    this.validDataSpace = validDataSpace;
    return this;
  }

   /**
   * Get validDataSpace
   * @return validDataSpace
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getValidDataSpace() {
    return validDataSpace;
  }


  public void setValidDataSpace(Long validDataSpace) {
    this.validDataSpace = validDataSpace;
  }


  public Cluster vdses(List<NestedVds> vdses) {
    
    this.vdses = vdses;
    return this;
  }

  public Cluster addVdsesItem(NestedVds vdsesItem) {
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


  public Cluster version(String version) {
    
    this.version = version;
    return this;
  }

   /**
   * Get version
   * @return version
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getVersion() {
    return version;
  }


  public void setVersion(String version) {
    this.version = version;
  }


  public Cluster vhostEnabled(Boolean vhostEnabled) {
    
    this.vhostEnabled = vhostEnabled;
    return this;
  }

   /**
   * Get vhostEnabled
   * @return vhostEnabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getVhostEnabled() {
    return vhostEnabled;
  }


  public void setVhostEnabled(Boolean vhostEnabled) {
    this.vhostEnabled = vhostEnabled;
  }


  public Cluster vmFolders(List<NestedVmFolder> vmFolders) {
    
    this.vmFolders = vmFolders;
    return this;
  }

  public Cluster addVmFoldersItem(NestedVmFolder vmFoldersItem) {
    if (this.vmFolders == null) {
      this.vmFolders = new ArrayList<NestedVmFolder>();
    }
    this.vmFolders.add(vmFoldersItem);
    return this;
  }

   /**
   * Get vmFolders
   * @return vmFolders
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<NestedVmFolder> getVmFolders() {
    return vmFolders;
  }


  public void setVmFolders(List<NestedVmFolder> vmFolders) {
    this.vmFolders = vmFolders;
  }


  public Cluster vmNum(Integer vmNum) {
    
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


  public Cluster vmTemplates(List<NestedVmTemplate> vmTemplates) {
    
    this.vmTemplates = vmTemplates;
    return this;
  }

  public Cluster addVmTemplatesItem(NestedVmTemplate vmTemplatesItem) {
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


  public Cluster vms(List<NestedVm> vms) {
    
    this.vms = vms;
    return this;
  }

  public Cluster addVmsItem(NestedVm vmsItem) {
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
    Cluster cluster = (Cluster) o;
    return Objects.equals(this.applicationHighestVersion, cluster.applicationHighestVersion) &&
        Objects.equals(this.architecture, cluster.architecture) &&
        Objects.equals(this.autoConverge, cluster.autoConverge) &&
        Objects.equals(this.connectState, cluster.connectState) &&
        Objects.equals(this.currentCpuModel, cluster.currentCpuModel) &&
        Objects.equals(this.datacenters, cluster.datacenters) &&
        Objects.equals(this.disconnectedDate, cluster.disconnectedDate) &&
        Objects.equals(this.disconnectedReason, cluster.disconnectedReason) &&
        Objects.equals(this.dns, cluster.dns) &&
        Objects.equals(this.entityAsyncStatus, cluster.entityAsyncStatus) &&
        Objects.equals(this.failureDataSpace, cluster.failureDataSpace) &&
        Objects.equals(this.hasMetrox, cluster.hasMetrox) &&
        Objects.equals(this.hostNum, cluster.hostNum) &&
        Objects.equals(this.hosts, cluster.hosts) &&
        Objects.equals(this.hypervisor, cluster.hypervisor) &&
        Objects.equals(this.id, cluster.id) &&
        Objects.equals(this.ip, cluster.ip) &&
        Objects.equals(this.isAllFlash, cluster.isAllFlash) &&
        Objects.equals(this.iscsiVip, cluster.iscsiVip) &&
        Objects.equals(this.labels, cluster.labels) &&
        Objects.equals(this.licenseExpireDate, cluster.licenseExpireDate) &&
        Objects.equals(this.licenseSerial, cluster.licenseSerial) &&
        Objects.equals(this.licenseSignDate, cluster.licenseSignDate) &&
        Objects.equals(this.licenseType, cluster.licenseType) &&
        Objects.equals(this.localId, cluster.localId) &&
        Objects.equals(this.maintenanceEndDate, cluster.maintenanceEndDate) &&
        Objects.equals(this.maintenanceStartDate, cluster.maintenanceStartDate) &&
        Objects.equals(this.managementVip, cluster.managementVip) &&
        Objects.equals(this.maxChunkNum, cluster.maxChunkNum) &&
        Objects.equals(this.maxPhysicalDataCapacity, cluster.maxPhysicalDataCapacity) &&
        Objects.equals(this.maxPhysicalDataCapacityPerNode, cluster.maxPhysicalDataCapacityPerNode) &&
        Objects.equals(this.metroAvailabilityChecklist, cluster.metroAvailabilityChecklist) &&
        Objects.equals(this.mgtGateway, cluster.mgtGateway) &&
        Objects.equals(this.mgtNetmask, cluster.mgtNetmask) &&
        Objects.equals(this.migrationDataSize, cluster.migrationDataSize) &&
        Objects.equals(this.migrationSpeed, cluster.migrationSpeed) &&
        Objects.equals(this.name, cluster.name) &&
        Objects.equals(this.ntpMode, cluster.ntpMode) &&
        Objects.equals(this.ntpServers, cluster.ntpServers) &&
        Objects.equals(this.nvmeOverRdmaEnabled, cluster.nvmeOverRdmaEnabled) &&
        Objects.equals(this.nvmeOverTcpEnabled, cluster.nvmeOverTcpEnabled) &&
        Objects.equals(this.nvmfEnabled, cluster.nvmfEnabled) &&
        Objects.equals(this.pmemEnabled, cluster.pmemEnabled) &&
        Objects.equals(this.provisionedCpuCores, cluster.provisionedCpuCores) &&
        Objects.equals(this.provisionedCpuCoresForActiveVm, cluster.provisionedCpuCoresForActiveVm) &&
        Objects.equals(this.provisionedForActiveVmRatio, cluster.provisionedForActiveVmRatio) &&
        Objects.equals(this.provisionedMemoryBytes, cluster.provisionedMemoryBytes) &&
        Objects.equals(this.provisionedRatio, cluster.provisionedRatio) &&
        Objects.equals(this.rdmaEnabled, cluster.rdmaEnabled) &&
        Objects.equals(this.recommendedCpuModels, cluster.recommendedCpuModels) &&
        Objects.equals(this.recoverDataSize, cluster.recoverDataSize) &&
        Objects.equals(this.recoverSpeed, cluster.recoverSpeed) &&
        Objects.equals(this.reservedCpuCoresForSystemService, cluster.reservedCpuCoresForSystemService) &&
        Objects.equals(this.runningVmNum, cluster.runningVmNum) &&
        Objects.equals(this.softwareEdition, cluster.softwareEdition) &&
        Objects.equals(this.stoppedVmNum, cluster.stoppedVmNum) &&
        Objects.equals(this.stretch, cluster.stretch) &&
        Objects.equals(this.suspendedVmNum, cluster.suspendedVmNum) &&
        Objects.equals(this.totalCacheCapacity, cluster.totalCacheCapacity) &&
        Objects.equals(this.totalCpuCores, cluster.totalCpuCores) &&
        Objects.equals(this.totalCpuHz, cluster.totalCpuHz) &&
        Objects.equals(this.totalCpuModels, cluster.totalCpuModels) &&
        Objects.equals(this.totalCpuSockets, cluster.totalCpuSockets) &&
        Objects.equals(this.totalDataCapacity, cluster.totalDataCapacity) &&
        Objects.equals(this.totalMemoryBytes, cluster.totalMemoryBytes) &&
        Objects.equals(this.type, cluster.type) &&
        Objects.equals(this.upgradeToolVersion, cluster.upgradeToolVersion) &&
        Objects.equals(this.usedCpuHz, cluster.usedCpuHz) &&
        Objects.equals(this.usedDataSpace, cluster.usedDataSpace) &&
        Objects.equals(this.usedMemoryBytes, cluster.usedMemoryBytes) &&
        Objects.equals(this.validDataSpace, cluster.validDataSpace) &&
        Objects.equals(this.vdses, cluster.vdses) &&
        Objects.equals(this.version, cluster.version) &&
        Objects.equals(this.vhostEnabled, cluster.vhostEnabled) &&
        Objects.equals(this.vmFolders, cluster.vmFolders) &&
        Objects.equals(this.vmNum, cluster.vmNum) &&
        Objects.equals(this.vmTemplates, cluster.vmTemplates) &&
        Objects.equals(this.vms, cluster.vms);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(applicationHighestVersion, architecture, autoConverge, connectState, currentCpuModel, datacenters, disconnectedDate, disconnectedReason, dns, entityAsyncStatus, failureDataSpace, hasMetrox, hostNum, hosts, hypervisor, id, ip, isAllFlash, iscsiVip, labels, licenseExpireDate, licenseSerial, licenseSignDate, licenseType, localId, maintenanceEndDate, maintenanceStartDate, managementVip, maxChunkNum, maxPhysicalDataCapacity, maxPhysicalDataCapacityPerNode, metroAvailabilityChecklist, mgtGateway, mgtNetmask, migrationDataSize, migrationSpeed, name, ntpMode, ntpServers, nvmeOverRdmaEnabled, nvmeOverTcpEnabled, nvmfEnabled, pmemEnabled, provisionedCpuCores, provisionedCpuCoresForActiveVm, provisionedForActiveVmRatio, provisionedMemoryBytes, provisionedRatio, rdmaEnabled, recommendedCpuModels, recoverDataSize, recoverSpeed, reservedCpuCoresForSystemService, runningVmNum, softwareEdition, stoppedVmNum, stretch, suspendedVmNum, totalCacheCapacity, totalCpuCores, totalCpuHz, totalCpuModels, totalCpuSockets, totalDataCapacity, totalMemoryBytes, type, upgradeToolVersion, usedCpuHz, usedDataSpace, usedMemoryBytes, validDataSpace, vdses, version, vhostEnabled, vmFolders, vmNum, vmTemplates, vms);
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
    sb.append("class Cluster {\n");
    sb.append("    applicationHighestVersion: ").append(toIndentedString(applicationHighestVersion)).append("\n");
    sb.append("    architecture: ").append(toIndentedString(architecture)).append("\n");
    sb.append("    autoConverge: ").append(toIndentedString(autoConverge)).append("\n");
    sb.append("    connectState: ").append(toIndentedString(connectState)).append("\n");
    sb.append("    currentCpuModel: ").append(toIndentedString(currentCpuModel)).append("\n");
    sb.append("    datacenters: ").append(toIndentedString(datacenters)).append("\n");
    sb.append("    disconnectedDate: ").append(toIndentedString(disconnectedDate)).append("\n");
    sb.append("    disconnectedReason: ").append(toIndentedString(disconnectedReason)).append("\n");
    sb.append("    dns: ").append(toIndentedString(dns)).append("\n");
    sb.append("    entityAsyncStatus: ").append(toIndentedString(entityAsyncStatus)).append("\n");
    sb.append("    failureDataSpace: ").append(toIndentedString(failureDataSpace)).append("\n");
    sb.append("    hasMetrox: ").append(toIndentedString(hasMetrox)).append("\n");
    sb.append("    hostNum: ").append(toIndentedString(hostNum)).append("\n");
    sb.append("    hosts: ").append(toIndentedString(hosts)).append("\n");
    sb.append("    hypervisor: ").append(toIndentedString(hypervisor)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
    sb.append("    isAllFlash: ").append(toIndentedString(isAllFlash)).append("\n");
    sb.append("    iscsiVip: ").append(toIndentedString(iscsiVip)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    licenseExpireDate: ").append(toIndentedString(licenseExpireDate)).append("\n");
    sb.append("    licenseSerial: ").append(toIndentedString(licenseSerial)).append("\n");
    sb.append("    licenseSignDate: ").append(toIndentedString(licenseSignDate)).append("\n");
    sb.append("    licenseType: ").append(toIndentedString(licenseType)).append("\n");
    sb.append("    localId: ").append(toIndentedString(localId)).append("\n");
    sb.append("    maintenanceEndDate: ").append(toIndentedString(maintenanceEndDate)).append("\n");
    sb.append("    maintenanceStartDate: ").append(toIndentedString(maintenanceStartDate)).append("\n");
    sb.append("    managementVip: ").append(toIndentedString(managementVip)).append("\n");
    sb.append("    maxChunkNum: ").append(toIndentedString(maxChunkNum)).append("\n");
    sb.append("    maxPhysicalDataCapacity: ").append(toIndentedString(maxPhysicalDataCapacity)).append("\n");
    sb.append("    maxPhysicalDataCapacityPerNode: ").append(toIndentedString(maxPhysicalDataCapacityPerNode)).append("\n");
    sb.append("    metroAvailabilityChecklist: ").append(toIndentedString(metroAvailabilityChecklist)).append("\n");
    sb.append("    mgtGateway: ").append(toIndentedString(mgtGateway)).append("\n");
    sb.append("    mgtNetmask: ").append(toIndentedString(mgtNetmask)).append("\n");
    sb.append("    migrationDataSize: ").append(toIndentedString(migrationDataSize)).append("\n");
    sb.append("    migrationSpeed: ").append(toIndentedString(migrationSpeed)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    ntpMode: ").append(toIndentedString(ntpMode)).append("\n");
    sb.append("    ntpServers: ").append(toIndentedString(ntpServers)).append("\n");
    sb.append("    nvmeOverRdmaEnabled: ").append(toIndentedString(nvmeOverRdmaEnabled)).append("\n");
    sb.append("    nvmeOverTcpEnabled: ").append(toIndentedString(nvmeOverTcpEnabled)).append("\n");
    sb.append("    nvmfEnabled: ").append(toIndentedString(nvmfEnabled)).append("\n");
    sb.append("    pmemEnabled: ").append(toIndentedString(pmemEnabled)).append("\n");
    sb.append("    provisionedCpuCores: ").append(toIndentedString(provisionedCpuCores)).append("\n");
    sb.append("    provisionedCpuCoresForActiveVm: ").append(toIndentedString(provisionedCpuCoresForActiveVm)).append("\n");
    sb.append("    provisionedForActiveVmRatio: ").append(toIndentedString(provisionedForActiveVmRatio)).append("\n");
    sb.append("    provisionedMemoryBytes: ").append(toIndentedString(provisionedMemoryBytes)).append("\n");
    sb.append("    provisionedRatio: ").append(toIndentedString(provisionedRatio)).append("\n");
    sb.append("    rdmaEnabled: ").append(toIndentedString(rdmaEnabled)).append("\n");
    sb.append("    recommendedCpuModels: ").append(toIndentedString(recommendedCpuModels)).append("\n");
    sb.append("    recoverDataSize: ").append(toIndentedString(recoverDataSize)).append("\n");
    sb.append("    recoverSpeed: ").append(toIndentedString(recoverSpeed)).append("\n");
    sb.append("    reservedCpuCoresForSystemService: ").append(toIndentedString(reservedCpuCoresForSystemService)).append("\n");
    sb.append("    runningVmNum: ").append(toIndentedString(runningVmNum)).append("\n");
    sb.append("    softwareEdition: ").append(toIndentedString(softwareEdition)).append("\n");
    sb.append("    stoppedVmNum: ").append(toIndentedString(stoppedVmNum)).append("\n");
    sb.append("    stretch: ").append(toIndentedString(stretch)).append("\n");
    sb.append("    suspendedVmNum: ").append(toIndentedString(suspendedVmNum)).append("\n");
    sb.append("    totalCacheCapacity: ").append(toIndentedString(totalCacheCapacity)).append("\n");
    sb.append("    totalCpuCores: ").append(toIndentedString(totalCpuCores)).append("\n");
    sb.append("    totalCpuHz: ").append(toIndentedString(totalCpuHz)).append("\n");
    sb.append("    totalCpuModels: ").append(toIndentedString(totalCpuModels)).append("\n");
    sb.append("    totalCpuSockets: ").append(toIndentedString(totalCpuSockets)).append("\n");
    sb.append("    totalDataCapacity: ").append(toIndentedString(totalDataCapacity)).append("\n");
    sb.append("    totalMemoryBytes: ").append(toIndentedString(totalMemoryBytes)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    upgradeToolVersion: ").append(toIndentedString(upgradeToolVersion)).append("\n");
    sb.append("    usedCpuHz: ").append(toIndentedString(usedCpuHz)).append("\n");
    sb.append("    usedDataSpace: ").append(toIndentedString(usedDataSpace)).append("\n");
    sb.append("    usedMemoryBytes: ").append(toIndentedString(usedMemoryBytes)).append("\n");
    sb.append("    validDataSpace: ").append(toIndentedString(validDataSpace)).append("\n");
    sb.append("    vdses: ").append(toIndentedString(vdses)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    vhostEnabled: ").append(toIndentedString(vhostEnabled)).append("\n");
    sb.append("    vmFolders: ").append(toIndentedString(vmFolders)).append("\n");
    sb.append("    vmNum: ").append(toIndentedString(vmNum)).append("\n");
    sb.append("    vmTemplates: ").append(toIndentedString(vmTemplates)).append("\n");
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

