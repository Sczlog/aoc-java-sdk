package com.arcfra.aoc.api;

import com.arcfra.aoc.ApiCallback;
import com.arcfra.aoc.ApiClient;
import com.arcfra.aoc.ApiException;
import com.arcfra.aoc.ApiResponse;
import com.arcfra.aoc.Configuration;
import com.arcfra.aoc.Pair;
import com.arcfra.aoc.ProgressRequestBody;
import com.arcfra.aoc.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.arcfra.aoc.model.CommonHeader;
import com.arcfra.aoc.model.ErrorBody;
import com.arcfra.aoc.model.GetHostsConnectionRequestBody;
import com.arcfra.aoc.model.GetHostsRequestBody;
import com.arcfra.aoc.model.Host;
import com.arcfra.aoc.model.HostConnection;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HostApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public HostApi() {
        this(Configuration.getDefaultApiClient());
    }

    public HostApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    /**
     * Build call for getHosts
     * @param getHostsRequestBody  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  * CommonHeader -  <br>  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  * CommonHeader -  <br>  </td></tr>
        <tr><td> 404 </td><td> Not found </td><td>  * CommonHeader -  <br>  </td></tr>
        <tr><td> 500 </td><td> Server error </td><td>  * CommonHeader -  <br>  </td></tr>
     </table>
     */
    public okhttp3.Call getHostsCall(GetHostsRequestBody getHostsRequestBody, final ApiCallback _callback) throws ApiException {
        String basePath = null;

        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = getHostsRequestBody;

        // create path and map variables
        String localVarPath = "/get-hosts";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "Authorization" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getHostsValidateBeforeCall(GetHostsRequestBody getHostsRequestBody, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'getHostsRequestBody' is set
        if (getHostsRequestBody == null) {
            throw new ApiException("Missing the required parameter 'getHostsRequestBody' when calling getHosts(Async)");
        }
        

        okhttp3.Call localVarCall = getHostsCall(getHostsRequestBody, _callback);
        return localVarCall;

    }

    /**
     * 
     * 
     * @param getHostsRequestBody  (required)
     * @return List&lt;Host&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  * CommonHeader -  <br>  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  * CommonHeader -  <br>  </td></tr>
        <tr><td> 404 </td><td> Not found </td><td>  * CommonHeader -  <br>  </td></tr>
        <tr><td> 500 </td><td> Server error </td><td>  * CommonHeader -  <br>  </td></tr>
     </table>
     */
    public List<Host> getHosts(GetHostsRequestBody getHostsRequestBody) throws ApiException {
        ApiResponse<List<Host>> localVarResp = getHostsWithHttpInfo(getHostsRequestBody);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param getHostsRequestBody  (required)
     * @return ApiResponse&lt;List&lt;Host&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  * CommonHeader -  <br>  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  * CommonHeader -  <br>  </td></tr>
        <tr><td> 404 </td><td> Not found </td><td>  * CommonHeader -  <br>  </td></tr>
        <tr><td> 500 </td><td> Server error </td><td>  * CommonHeader -  <br>  </td></tr>
     </table>
     */
    public ApiResponse<List<Host>> getHostsWithHttpInfo(GetHostsRequestBody getHostsRequestBody) throws ApiException {
        okhttp3.Call localVarCall = getHostsValidateBeforeCall(getHostsRequestBody, null);
        Type localVarReturnType = new TypeToken<List<Host>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param getHostsRequestBody  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  * CommonHeader -  <br>  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  * CommonHeader -  <br>  </td></tr>
        <tr><td> 404 </td><td> Not found </td><td>  * CommonHeader -  <br>  </td></tr>
        <tr><td> 500 </td><td> Server error </td><td>  * CommonHeader -  <br>  </td></tr>
     </table>
     */
    public okhttp3.Call getHostsAsync(GetHostsRequestBody getHostsRequestBody, final ApiCallback<List<Host>> _callback) throws ApiException {

        okhttp3.Call localVarCall = getHostsValidateBeforeCall(getHostsRequestBody, _callback);
        Type localVarReturnType = new TypeToken<List<Host>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getHostsConnection
     * @param getHostsConnectionRequestBody  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  * CommonHeader -  <br>  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  * CommonHeader -  <br>  </td></tr>
        <tr><td> 404 </td><td> Not found </td><td>  * CommonHeader -  <br>  </td></tr>
        <tr><td> 500 </td><td> Server error </td><td>  * CommonHeader -  <br>  </td></tr>
     </table>
     */
    public okhttp3.Call getHostsConnectionCall(GetHostsConnectionRequestBody getHostsConnectionRequestBody, final ApiCallback _callback) throws ApiException {
        String basePath = null;

        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = getHostsConnectionRequestBody;

        // create path and map variables
        String localVarPath = "/get-hosts-connection";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "Authorization" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getHostsConnectionValidateBeforeCall(GetHostsConnectionRequestBody getHostsConnectionRequestBody, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'getHostsConnectionRequestBody' is set
        if (getHostsConnectionRequestBody == null) {
            throw new ApiException("Missing the required parameter 'getHostsConnectionRequestBody' when calling getHostsConnection(Async)");
        }
        

        okhttp3.Call localVarCall = getHostsConnectionCall(getHostsConnectionRequestBody, _callback);
        return localVarCall;

    }

    /**
     * 
     * 
     * @param getHostsConnectionRequestBody  (required)
     * @return HostConnection
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  * CommonHeader -  <br>  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  * CommonHeader -  <br>  </td></tr>
        <tr><td> 404 </td><td> Not found </td><td>  * CommonHeader -  <br>  </td></tr>
        <tr><td> 500 </td><td> Server error </td><td>  * CommonHeader -  <br>  </td></tr>
     </table>
     */
    public HostConnection getHostsConnection(GetHostsConnectionRequestBody getHostsConnectionRequestBody) throws ApiException {
        ApiResponse<HostConnection> localVarResp = getHostsConnectionWithHttpInfo(getHostsConnectionRequestBody);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param getHostsConnectionRequestBody  (required)
     * @return ApiResponse&lt;HostConnection&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  * CommonHeader -  <br>  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  * CommonHeader -  <br>  </td></tr>
        <tr><td> 404 </td><td> Not found </td><td>  * CommonHeader -  <br>  </td></tr>
        <tr><td> 500 </td><td> Server error </td><td>  * CommonHeader -  <br>  </td></tr>
     </table>
     */
    public ApiResponse<HostConnection> getHostsConnectionWithHttpInfo(GetHostsConnectionRequestBody getHostsConnectionRequestBody) throws ApiException {
        okhttp3.Call localVarCall = getHostsConnectionValidateBeforeCall(getHostsConnectionRequestBody, null);
        Type localVarReturnType = new TypeToken<HostConnection>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param getHostsConnectionRequestBody  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  * CommonHeader -  <br>  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  * CommonHeader -  <br>  </td></tr>
        <tr><td> 404 </td><td> Not found </td><td>  * CommonHeader -  <br>  </td></tr>
        <tr><td> 500 </td><td> Server error </td><td>  * CommonHeader -  <br>  </td></tr>
     </table>
     */
    public okhttp3.Call getHostsConnectionAsync(GetHostsConnectionRequestBody getHostsConnectionRequestBody, final ApiCallback<HostConnection> _callback) throws ApiException {

        okhttp3.Call localVarCall = getHostsConnectionValidateBeforeCall(getHostsConnectionRequestBody, _callback);
        Type localVarReturnType = new TypeToken<HostConnection>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
