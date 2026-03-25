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
import com.hubspot_sdk.api.models.crm.pipelines.CollectionResponsePipelineStageNoPaging
import com.hubspot_sdk.api.models.crm.pipelines.CollectionResponsePublicAuditInfoNoPaging
import com.hubspot_sdk.api.models.crm.pipelines.PipelineCreateParams
import com.hubspot_sdk.api.models.crm.pipelines.PipelineDeleteParams
import com.hubspot_sdk.api.models.crm.pipelines.PipelineGetAuditParams
import com.hubspot_sdk.api.models.crm.pipelines.PipelineGetParams
import com.hubspot_sdk.api.models.crm.pipelines.PipelineListParams
import com.hubspot_sdk.api.models.crm.pipelines.PipelineReplaceParams
import com.hubspot_sdk.api.models.crm.pipelines.PipelineStage
import com.hubspot_sdk.api.models.crm.pipelines.PipelineUpdateParams
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class PipelineServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    PipelineService {

    private val withRawResponse: PipelineService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): PipelineService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): PipelineService =
        PipelineServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: PipelineCreateParams,
        requestOptions: RequestOptions,
    ): PipelineStage =
        // post /crm/pipelines/2026-03/{objectType}/{pipelineId}/stages
        withRawResponse().create(params, requestOptions).parse()

    override fun update(
        params: PipelineUpdateParams,
        requestOptions: RequestOptions,
    ): PipelineStage =
        // patch /crm/pipelines/2026-03/{objectType}/{pipelineId}/stages/{stageId}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(
        params: PipelineListParams,
        requestOptions: RequestOptions,
    ): CollectionResponsePipelineStageNoPaging =
        // get /crm/pipelines/2026-03/{objectType}/{pipelineId}/stages
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: PipelineDeleteParams, requestOptions: RequestOptions) {
        // delete /crm/pipelines/2026-03/{objectType}/{pipelineId}/stages/{stageId}
        withRawResponse().delete(params, requestOptions)
    }

    override fun get(params: PipelineGetParams, requestOptions: RequestOptions): PipelineStage =
        // get /crm/pipelines/2026-03/{objectType}/{pipelineId}/stages/{stageId}
        withRawResponse().get(params, requestOptions).parse()

    override fun getAudit(
        params: PipelineGetAuditParams,
        requestOptions: RequestOptions,
    ): CollectionResponsePublicAuditInfoNoPaging =
        // get /crm/pipelines/2026-03/{objectType}/{pipelineId}/stages/{stageId}/audit
        withRawResponse().getAudit(params, requestOptions).parse()

    override fun replace(
        params: PipelineReplaceParams,
        requestOptions: RequestOptions,
    ): PipelineStage =
        // put /crm/pipelines/2026-03/{objectType}/{pipelineId}/stages/{stageId}
        withRawResponse().replace(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PipelineService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PipelineService.WithRawResponse =
            PipelineServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<PipelineStage> =
            jsonHandler<PipelineStage>(clientOptions.jsonMapper)

        override fun create(
            params: PipelineCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PipelineStage> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("pipelineId", params.pipelineId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "crm",
                        "pipelines",
                        "2026-03",
                        params._pathParam(0),
                        params._pathParam(1),
                        "stages",
                    )
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

        private val updateHandler: Handler<PipelineStage> =
            jsonHandler<PipelineStage>(clientOptions.jsonMapper)

        override fun update(
            params: PipelineUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PipelineStage> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("stageId", params.stageId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "crm",
                        "pipelines",
                        "2026-03",
                        params._pathParam(0),
                        params._pathParam(1),
                        "stages",
                        params._pathParam(2),
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

        private val listHandler: Handler<CollectionResponsePipelineStageNoPaging> =
            jsonHandler<CollectionResponsePipelineStageNoPaging>(clientOptions.jsonMapper)

        override fun list(
            params: PipelineListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CollectionResponsePipelineStageNoPaging> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("pipelineId", params.pipelineId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "crm",
                        "pipelines",
                        "2026-03",
                        params._pathParam(0),
                        params._pathParam(1),
                        "stages",
                    )
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
            checkRequired("stageId", params.stageId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "crm",
                        "pipelines",
                        "2026-03",
                        params._pathParam(0),
                        params._pathParam(1),
                        "stages",
                        params._pathParam(2),
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

        private val getHandler: Handler<PipelineStage> =
            jsonHandler<PipelineStage>(clientOptions.jsonMapper)

        override fun get(
            params: PipelineGetParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PipelineStage> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("stageId", params.stageId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "crm",
                        "pipelines",
                        "2026-03",
                        params._pathParam(0),
                        params._pathParam(1),
                        "stages",
                        params._pathParam(2),
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
            checkRequired("stageId", params.stageId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "crm",
                        "pipelines",
                        "2026-03",
                        params._pathParam(0),
                        params._pathParam(1),
                        "stages",
                        params._pathParam(2),
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

        private val replaceHandler: Handler<PipelineStage> =
            jsonHandler<PipelineStage>(clientOptions.jsonMapper)

        override fun replace(
            params: PipelineReplaceParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PipelineStage> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("stageId", params.stageId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "crm",
                        "pipelines",
                        "2026-03",
                        params._pathParam(0),
                        params._pathParam(1),
                        "stages",
                        params._pathParam(2),
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
