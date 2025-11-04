// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.automation

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.core.handlers.emptyHandler
import com.hubspot_sdk.api.core.handlers.errorBodyHandler
import com.hubspot_sdk.api.core.handlers.errorHandler
import com.hubspot_sdk.api.core.handlers.jsonHandler
import com.hubspot_sdk.api.core.http.HttpMethod
import com.hubspot_sdk.api.core.http.HttpRequest
import com.hubspot_sdk.api.core.http.HttpResponse
import com.hubspot_sdk.api.core.http.HttpResponse.Handler
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.core.http.json
import com.hubspot_sdk.api.core.http.parseable
import com.hubspot_sdk.api.core.prepareAsync
import com.hubspot_sdk.api.models.automation.workflows.ApiFlow
import com.hubspot_sdk.api.models.automation.workflows.BatchResponseApiFlow
import com.hubspot_sdk.api.models.automation.workflows.BatchResponseFlowIdWorkflowIdMappingResponse
import com.hubspot_sdk.api.models.automation.workflows.CollectionResponseApiFlowEmailCampaign
import com.hubspot_sdk.api.models.automation.workflows.CollectionResponseApiFlowListingForwardPaging
import com.hubspot_sdk.api.models.automation.workflows.WorkflowBatchGetIdMappingsParams
import com.hubspot_sdk.api.models.automation.workflows.WorkflowBatchGetParams
import com.hubspot_sdk.api.models.automation.workflows.WorkflowCreateParams
import com.hubspot_sdk.api.models.automation.workflows.WorkflowDeleteParams
import com.hubspot_sdk.api.models.automation.workflows.WorkflowGetParams
import com.hubspot_sdk.api.models.automation.workflows.WorkflowListEmailCampaignsPageAsync
import com.hubspot_sdk.api.models.automation.workflows.WorkflowListEmailCampaignsParams
import com.hubspot_sdk.api.models.automation.workflows.WorkflowListPageAsync
import com.hubspot_sdk.api.models.automation.workflows.WorkflowListParams
import com.hubspot_sdk.api.models.automation.workflows.WorkflowUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class WorkflowServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    WorkflowServiceAsync {

    private val withRawResponse: WorkflowServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): WorkflowServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): WorkflowServiceAsync =
        WorkflowServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: WorkflowCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ApiFlow> =
        // post /automation/v4/flows
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: WorkflowUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ApiFlow> =
        // put /automation/v4/flows/{flowId}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: WorkflowListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<WorkflowListPageAsync> =
        // get /automation/v4/flows
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: WorkflowDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // delete /automation/v4/flows/{flowId}
        withRawResponse().delete(params, requestOptions).thenAccept {}

    override fun batchGet(
        params: WorkflowBatchGetParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BatchResponseApiFlow> =
        // post /automation/v4/flows/batch/read
        withRawResponse().batchGet(params, requestOptions).thenApply { it.parse() }

    override fun batchGetIdMappings(
        params: WorkflowBatchGetIdMappingsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BatchResponseFlowIdWorkflowIdMappingResponse> =
        // post /automation/v4/workflow-id-mappings/batch/read
        withRawResponse().batchGetIdMappings(params, requestOptions).thenApply { it.parse() }

    override fun get(
        params: WorkflowGetParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ApiFlow> =
        // get /automation/v4/flows/{flowId}
        withRawResponse().get(params, requestOptions).thenApply { it.parse() }

    override fun listEmailCampaigns(
        params: WorkflowListEmailCampaignsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<WorkflowListEmailCampaignsPageAsync> =
        // get /automation/v4/flows/email-campaigns
        withRawResponse().listEmailCampaigns(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        WorkflowServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): WorkflowServiceAsync.WithRawResponse =
            WorkflowServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<ApiFlow> = jsonHandler<ApiFlow>(clientOptions.jsonMapper)

        override fun create(
            params: WorkflowCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ApiFlow>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("automation", "v4", "flows")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { createHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val updateHandler: Handler<ApiFlow> = jsonHandler<ApiFlow>(clientOptions.jsonMapper)

        override fun update(
            params: WorkflowUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ApiFlow>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("flowId", params.flowId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("automation", "v4", "flows", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { updateHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val listHandler: Handler<CollectionResponseApiFlowListingForwardPaging> =
            jsonHandler<CollectionResponseApiFlowListingForwardPaging>(clientOptions.jsonMapper)

        override fun list(
            params: WorkflowListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<WorkflowListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("automation", "v4", "flows")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                            .let {
                                WorkflowListPageAsync.builder()
                                    .service(WorkflowServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: WorkflowDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("flowId", params.flowId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("automation", "v4", "flows", params._pathParam(0))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { deleteHandler.handle(it) }
                    }
                }
        }

        private val batchGetHandler: Handler<BatchResponseApiFlow> =
            jsonHandler<BatchResponseApiFlow>(clientOptions.jsonMapper)

        override fun batchGet(
            params: WorkflowBatchGetParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BatchResponseApiFlow>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("automation", "v4", "flows", "batch", "read")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { batchGetHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val batchGetIdMappingsHandler:
            Handler<BatchResponseFlowIdWorkflowIdMappingResponse> =
            jsonHandler<BatchResponseFlowIdWorkflowIdMappingResponse>(clientOptions.jsonMapper)

        override fun batchGetIdMappings(
            params: WorkflowBatchGetIdMappingsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BatchResponseFlowIdWorkflowIdMappingResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("automation", "v4", "workflow-id-mappings", "batch", "read")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { batchGetIdMappingsHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val getHandler: Handler<ApiFlow> = jsonHandler<ApiFlow>(clientOptions.jsonMapper)

        override fun get(
            params: WorkflowGetParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ApiFlow>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("flowId", params.flowId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("automation", "v4", "flows", params._pathParam(0))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { getHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val listEmailCampaignsHandler: Handler<CollectionResponseApiFlowEmailCampaign> =
            jsonHandler<CollectionResponseApiFlowEmailCampaign>(clientOptions.jsonMapper)

        override fun listEmailCampaigns(
            params: WorkflowListEmailCampaignsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<WorkflowListEmailCampaignsPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("automation", "v4", "flows", "email-campaigns")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listEmailCampaignsHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                            .let {
                                WorkflowListEmailCampaignsPageAsync.builder()
                                    .service(WorkflowServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }
    }
}
