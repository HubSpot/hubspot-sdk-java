// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.automation

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
import com.hubspot_sdk.api.core.prepare
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
import com.hubspot_sdk.api.models.automation.workflows.WorkflowListEmailCampaignsParams
import com.hubspot_sdk.api.models.automation.workflows.WorkflowListPage
import com.hubspot_sdk.api.models.automation.workflows.WorkflowListParams
import com.hubspot_sdk.api.models.automation.workflows.WorkflowUpdateParams
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class WorkflowServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    WorkflowService {

    private val withRawResponse: WorkflowService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): WorkflowService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): WorkflowService =
        WorkflowServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(params: WorkflowCreateParams, requestOptions: RequestOptions): ApiFlow =
        // post /automation/v4/flows
        withRawResponse().create(params, requestOptions).parse()

    override fun update(params: WorkflowUpdateParams, requestOptions: RequestOptions): ApiFlow =
        // put /automation/v4/flows/{flowId}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(
        params: WorkflowListParams,
        requestOptions: RequestOptions,
    ): WorkflowListPage =
        // get /automation/v4/flows
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: WorkflowDeleteParams, requestOptions: RequestOptions) {
        // delete /automation/v4/flows/{flowId}
        withRawResponse().delete(params, requestOptions)
    }

    override fun batchGet(
        params: WorkflowBatchGetParams,
        requestOptions: RequestOptions,
    ): BatchResponseApiFlow =
        // post /automation/v4/flows/batch/read
        withRawResponse().batchGet(params, requestOptions).parse()

    override fun batchGetIdMappings(
        params: WorkflowBatchGetIdMappingsParams,
        requestOptions: RequestOptions,
    ): BatchResponseFlowIdWorkflowIdMappingResponse =
        // post /automation/v4/workflow-id-mappings/batch/read
        withRawResponse().batchGetIdMappings(params, requestOptions).parse()

    override fun get(params: WorkflowGetParams, requestOptions: RequestOptions): ApiFlow =
        // get /automation/v4/flows/{flowId}
        withRawResponse().get(params, requestOptions).parse()

    override fun listEmailCampaigns(
        params: WorkflowListEmailCampaignsParams,
        requestOptions: RequestOptions,
    ): CollectionResponseApiFlowEmailCampaign =
        // get /automation/v4/flows/email-campaigns
        withRawResponse().listEmailCampaigns(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        WorkflowService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): WorkflowService.WithRawResponse =
            WorkflowServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<ApiFlow> = jsonHandler<ApiFlow>(clientOptions.jsonMapper)

        override fun create(
            params: WorkflowCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ApiFlow> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("automation", "v4", "flows")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val updateHandler: Handler<ApiFlow> = jsonHandler<ApiFlow>(clientOptions.jsonMapper)

        override fun update(
            params: WorkflowUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ApiFlow> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { updateHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listHandler: Handler<CollectionResponseApiFlowListingForwardPaging> =
            jsonHandler<CollectionResponseApiFlowListingForwardPaging>(clientOptions.jsonMapper)

        override fun list(
            params: WorkflowListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<WorkflowListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("automation", "v4", "flows")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let {
                        WorkflowListPage.builder()
                            .service(WorkflowServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: WorkflowDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { deleteHandler.handle(it) }
            }
        }

        private val batchGetHandler: Handler<BatchResponseApiFlow> =
            jsonHandler<BatchResponseApiFlow>(clientOptions.jsonMapper)

        override fun batchGet(
            params: WorkflowBatchGetParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BatchResponseApiFlow> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("automation", "v4", "flows", "batch", "read")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { batchGetHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
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
        ): HttpResponseFor<BatchResponseFlowIdWorkflowIdMappingResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("automation", "v4", "workflow-id-mappings", "batch", "read")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { batchGetIdMappingsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val getHandler: Handler<ApiFlow> = jsonHandler<ApiFlow>(clientOptions.jsonMapper)

        override fun get(
            params: WorkflowGetParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ApiFlow> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("flowId", params.flowId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("automation", "v4", "flows", params._pathParam(0))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listEmailCampaignsHandler: Handler<CollectionResponseApiFlowEmailCampaign> =
            jsonHandler<CollectionResponseApiFlowEmailCampaign>(clientOptions.jsonMapper)

        override fun listEmailCampaigns(
            params: WorkflowListEmailCampaignsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CollectionResponseApiFlowEmailCampaign> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("automation", "v4", "flows", "email-campaigns")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listEmailCampaignsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
