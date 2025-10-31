// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.crm

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
import com.hubspot_sdk.api.models.crm.pipelines.CollectionResponsePipelineNoPaging
import com.hubspot_sdk.api.models.crm.pipelines.CollectionResponsePublicAuditInfoNoPaging
import com.hubspot_sdk.api.models.crm.pipelines.Pipeline
import com.hubspot_sdk.api.models.crm.pipelines.PipelineCreateParams
import com.hubspot_sdk.api.models.crm.pipelines.PipelineDeleteParams
import com.hubspot_sdk.api.models.crm.pipelines.PipelineGetAuditParams
import com.hubspot_sdk.api.models.crm.pipelines.PipelineGetParams
import com.hubspot_sdk.api.models.crm.pipelines.PipelineListParams
import com.hubspot_sdk.api.models.crm.pipelines.PipelineReplaceParams
import com.hubspot_sdk.api.models.crm.pipelines.PipelineUpdateParams
import com.hubspot_sdk.api.services.blocking.crm.pipelines.StageService
import com.hubspot_sdk.api.services.blocking.crm.pipelines.StageServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class PipelineServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    PipelineService {

    private val withRawResponse: PipelineService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val stages: StageService by lazy { StageServiceImpl(clientOptions) }

    override fun withRawResponse(): PipelineService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): PipelineService =
        PipelineServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun stages(): StageService = stages

    override fun create(params: PipelineCreateParams, requestOptions: RequestOptions): Pipeline =
        // post /crm/v3/pipelines/{objectType}
        withRawResponse().create(params, requestOptions).parse()

    override fun update(params: PipelineUpdateParams, requestOptions: RequestOptions): Pipeline =
        // patch /crm/v3/pipelines/{objectType}/{pipelineId}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(
        params: PipelineListParams,
        requestOptions: RequestOptions,
    ): CollectionResponsePipelineNoPaging =
        // get /crm/v3/pipelines/{objectType}
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: PipelineDeleteParams, requestOptions: RequestOptions) {
        // delete /crm/v3/pipelines/{objectType}/{pipelineId}
        withRawResponse().delete(params, requestOptions)
    }

    override fun get(params: PipelineGetParams, requestOptions: RequestOptions): Pipeline =
        // get /crm/v3/pipelines/{objectType}/{pipelineId}
        withRawResponse().get(params, requestOptions).parse()

    override fun getAudit(
        params: PipelineGetAuditParams,
        requestOptions: RequestOptions,
    ): CollectionResponsePublicAuditInfoNoPaging =
        // get /crm/v3/pipelines/{objectType}/{pipelineId}/audit
        withRawResponse().getAudit(params, requestOptions).parse()

    override fun replace(params: PipelineReplaceParams, requestOptions: RequestOptions): Pipeline =
        // put /crm/v3/pipelines/{objectType}/{pipelineId}
        withRawResponse().replace(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PipelineService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val stages: StageService.WithRawResponse by lazy {
            StageServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PipelineService.WithRawResponse =
            PipelineServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun stages(): StageService.WithRawResponse = stages

        private val createHandler: Handler<Pipeline> =
            jsonHandler<Pipeline>(clientOptions.jsonMapper)

        override fun create(
            params: PipelineCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Pipeline> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("objectType", params.objectType().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("crm", "v3", "pipelines", params._pathParam(0))
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

        private val updateHandler: Handler<Pipeline> =
            jsonHandler<Pipeline>(clientOptions.jsonMapper)

        override fun update(
            params: PipelineUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Pipeline> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("pipelineId", params.pipelineId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "crm",
                        "v3",
                        "pipelines",
                        params._pathParam(0),
                        params._pathParam(1),
                    )
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

        private val listHandler: Handler<CollectionResponsePipelineNoPaging> =
            jsonHandler<CollectionResponsePipelineNoPaging>(clientOptions.jsonMapper)

        override fun list(
            params: PipelineListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CollectionResponsePipelineNoPaging> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("objectType", params.objectType().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("crm", "v3", "pipelines", params._pathParam(0))
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
            }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: PipelineDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("pipelineId", params.pipelineId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "crm",
                        "v3",
                        "pipelines",
                        params._pathParam(0),
                        params._pathParam(1),
                    )
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { deleteHandler.handle(it) }
            }
        }

        private val getHandler: Handler<Pipeline> = jsonHandler<Pipeline>(clientOptions.jsonMapper)

        override fun get(
            params: PipelineGetParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Pipeline> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("pipelineId", params.pipelineId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "crm",
                        "v3",
                        "pipelines",
                        params._pathParam(0),
                        params._pathParam(1),
                    )
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

        private val getAuditHandler: Handler<CollectionResponsePublicAuditInfoNoPaging> =
            jsonHandler<CollectionResponsePublicAuditInfoNoPaging>(clientOptions.jsonMapper)

        override fun getAudit(
            params: PipelineGetAuditParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CollectionResponsePublicAuditInfoNoPaging> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("pipelineId", params.pipelineId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "crm",
                        "v3",
                        "pipelines",
                        params._pathParam(0),
                        params._pathParam(1),
                        "audit",
                    )
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getAuditHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val replaceHandler: Handler<Pipeline> =
            jsonHandler<Pipeline>(clientOptions.jsonMapper)

        override fun replace(
            params: PipelineReplaceParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Pipeline> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("pipelineId", params.pipelineId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "crm",
                        "v3",
                        "pipelines",
                        params._pathParam(0),
                        params._pathParam(1),
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { replaceHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
