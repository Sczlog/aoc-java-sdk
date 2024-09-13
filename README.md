# AOC Java SDK

Java 1.8+

- [source code](https://github.com/arcfraofficial/aoc-java-sdk)
- [release](https://github.com/arcfraofficial/aoc-java-sdk/releases)

## Installation

- ### from git

  ```shell
  git clone https://github.com/arcfraofficial/aoc-java-sdk.git
  mvn clean install
  ```

- ### from jar

  ```shell
  # download jar and pom from release page
  mvn install:install-file -D"file=<path/to/jar>" -D"pomFile=<path/to/pom>"
  ```

- ### central registry
  > temporarily unavailable

## How to

### Create instance

#### Create an ApiClient instance

```java
ApiClient client = new ApiClient();
client.setBasePath("http://192.168.96.133/v2/api");
```

> if you need to ignore the self-signed SSL certificate, you can set `verifyingSsl` to `false`

```java
ApiClient client = new ApiClient();
client.setBasePath("https://192.168.96.133/v2/api");
client.setVerifyingSsl(false);
```

#### Create an API instance with ApiClient

> create an API instance for different purposes, such as creating a `VmApi` for virtual machine-related operations.

```java
VmApi vmApi = new VmApi(client);
```

### Authentication

```java
// use login from UserApi to get token
UserApi userApi = new UserApi(client);
LoginInput loginInput = new LoginInput()
    .username("root")
    .password("!QAZ2wsx").source(UserSource.LOCAL);
WithTaskLoginResponse token = userApi.login(loginInput);
((ApiKeyAuth) client.getAuthentication("Authorization")).setApiKey(token.getData().getToken());
```

### Send requests

#### List resources

```java
List<Vm> vms = vmApi.getVms(new GetVmsRequestBody().first(1));
```

#### Update resources

> update resources may create async tasks, you can use `WaitTask` to wait for the task to complete

```java
WithTaskVm withTaskVm = vmApi.startVm(
    new VmStartParams()
        .where(new VmWhereInput()
            .id(vm.getId()))).get(0);
if(withTaskVm.getTaskId() != null) {
    TaskUtil.WaitTask(withTaskVm.getTaskId(), client);
}
```

> or use `WaitTasks` to wait for multiple tasks to complete

```java
VmStartParams startParams = new VmStartParams()
    .where(new VmWhereInput()
        .addIdInItem("vm_id_1")
        .addIdInItem("vm_id_2"));
List<WithTaskVm> startedVms = vmApi.startVm(startParams);
List<String> tasks = startedVms.stream().map(startedVm -> startedVm.getTaskId()).collect(Collectors.toList());
TaskUtil.WaitTasks(tasks, client);
```
