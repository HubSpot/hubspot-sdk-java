// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.blocking.crm

import com.hubspot.sdk.core.ClientOptions
import com.hubspot.sdk.core.RequestOptions
import com.hubspot.sdk.core.checkRequired
import com.hubspot.sdk.core.handlers.emptyHandler
import com.hubspot.sdk.core.handlers.errorBodyHandler
import com.hubspot.sdk.core.handlers.errorHandler
import com.hubspot.sdk.core.handlers.jsonHandler
import com.hubspot.sdk.core.http.HttpMethod
import com.hubspot.sdk.core.http.HttpRequest
import com.hubspot.sdk.core.http.HttpResponse
import com.hubspot.sdk.core.http.HttpResponse.Handler
import com.hubspot.sdk.core.http.HttpResponseFor
import com.hubspot.sdk.core.http.json
import com.hubspot.sdk.core.http.parseable
import com.hubspot.sdk.core.prepare
import com.hubspot.sdk.models.crm.pipelines.CollectionResponsePipelineNoPaging
import com.hubspot.sdk.models.crm.pipelines.CollectionResponsePipelineStageNoPaging
import com.hubspot.sdk.models.crm.pipelines.CollectionResponsePublicAuditInfoNoPaging
import com.hubspot.sdk.models.crm.pipelines.Pipeline
import com.hubspot.sdk.models.crm.pipelines.PipelineCreateParams
import com.hubspot.sdk.models.crm.pipelines.PipelineCreateStageParams
import com.hubspot.sdk.models.crm.pipelines.PipelineDeleteParams
import com.hubspot.sdk.models.crm.pipelines.PipelineDeleteStageParams
import com.hubspot.sdk.models.crm.pipelines.PipelineGetParams
import com.hubspot.sdk.models.crm.pipelines.PipelineGetStageParams
import com.hubspot.sdk.models.crm.pipelines.PipelineListAuditParams
import com.hubspot.sdk.models.crm.pipelines.PipelineListParams
import com.hubspot.sdk.models.crm.pipelines.PipelineListStageAuditParams
import com.hubspot.sdk.models.crm.pipelines.PipelineListStagesParams
import com.hubspot.sdk.models.crm.pipelines.PipelineStage
import com.hubspot.sdk.models.crm.pipelines.PipelineUpdateAllPropertiesParams
import com.hubspot.sdk.models.crm.pipelines.PipelineUpdateParams
import com.hubspot.sdk.models.crm.pipelines.PipelineUpdateStageAllPropertiesParams
import com.hubspot.sdk.models.crm.pipelines.PipelineUpdateStageParams
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

    override fun create(params: PipelineCreateParams, requestOptions: RequestOptions): Pipeline =
        // post /crm/pipelines/2026-03/{objectType}
        withRawResponse().create(params, requestOptions).parse()

    override fun update(params: PipelineUpdateParams, requestOptions: RequestOptions): Pipeline =
        // patch /crm/pipelines/2026-03/{objectType}/{pipelineId}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(
        params: PipelineListParams,
        requestOptions: RequestOptions,
    ): CollectionResponsePipelineNoPaging =
        // get /crm/pipelines/2026-03/{objectType}
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: PipelineDeleteParams, requestOptions: RequestOptions) {
        // delete /crm/pipelines/2026-03/{objectType}/{pipelineId}
        withRawResponse().delete(params, requestOptions)
    }

    override fun createStage(
        params: PipelineCreateStageParams,
        requestOptions: RequestOptions,
    ): PipelineStage =
        // post /crm/pipelines/2026-03/{objectType}/{pipelineId}/stages
        withRawResponse().createStage(params, requestOptions).parse()

    override fun deleteStage(params: PipelineDeleteStageParams, requestOptions: RequestOptions) {
        // delete /crm/pipelines/2026-03/{objectType}/{pipelineId}/stages/{stageId}
        withRawResponse().deleteStage(params, requestOptions)
    }

    override fun get(params: PipelineGetParams, requestOptions: RequestOptions): Pipeline =
        // get /crm/pipelines/2026-03/{objectType}/{pipelineId}
        withRawResponse().get(params, requestOptions).parse()

    override fun getStage(
        params: PipelineGetStageParams,
        requestOptions: RequestOptions,
    ): PipelineStage =
        // get /crm/pipelines/2026-03/{objectType}/{pipelineId}/stages/{stageId}
        withRawResponse().getStage(params, requestOptions).parse()

    override fun listAudit(
        params: PipelineListAuditParams,
        requestOptions: RequestOptions,
    ): CollectionResponsePublicAuditInfoNoPaging =
        // get /crm/pipelines/2026-03/{objectType}/{pipelineId}/audit
        withRawResponse().listAudit(params, requestOptions).parse()

    override fun listStageAudit(
        params: PipelineListStageAuditParams,
        requestOptions: RequestOptions,
    ): CollectionResponsePublicAuditInfoNoPaging =
        // get /crm/pipelines/2026-03/{objectType}/{pipelineId}/stages/{stageId}/audit
        withRawResponse().listStageAudit(params, requestOptions).parse()

    override fun listStages(
        params: PipelineListStagesParams,
        requestOptions: RequestOptions,
    ): CollectionResponsePipelineStageNoPaging =
        // get /crm/pipelines/2026-03/{objectType}/{pipelineId}/stages
        withRawResponse().listStages(params, requestOptions).parse()

    override fun updateAllProperties(
        params: PipelineUpdateAllPropertiesParams,
        requestOptions: RequestOptions,
    ): Pipeline =
        // put /crm/pipelines/2026-03/{objectType}/{pipelineId}
        withRawResponse().updateAllProperties(params, requestOptions).parse()

    override fun updateStage(
        params: PipelineUpdateStageParams,
        requestOptions: RequestOptions,
    ): PipelineStage =
        // patch /crm/pipelines/2026-03/{objectType}/{pipelineId}/stages/{stageId}
        withRawResponse().updateStage(params, requestOptions).parse()

    override fun updateStageAllProperties(
        params: PipelineUpdateStageAllPropertiesParams,
        requestOptions: RequestOptions,
    ): PipelineStage =
        // put /crm/pipelines/2026-03/{objectType}/{pipelineId}/stages/{stageId}
        withRawResponse().updateStageAllProperties(params, requestOptions).parse()

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
                    .addPathSegments("crm", "pipelines", "2026-03", params._pathParam(0))
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
                        "pipelines",
                        "2026-03",
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
                    .addPathSegments("crm", "pipelines", "2026-03", params._pathParam(0))
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
                        "pipelines",
                        "2026-03",
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

        private val createStageHandler: Handler<PipelineStage> =
            jsonHandler<PipelineStage>(clientOptions.jsonMapper)

        override fun createStage(
            params: PipelineCreateStageParams,
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
                    .use { createStageHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val deleteStageHandler: Handler<Void?> = emptyHandler()

        override fun deleteStage(
            params: PipelineDeleteStageParams,
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
                response.use { deleteStageHandler.handle(it) }
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
                        "pipelines",
                        "2026-03",
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

        private val getStageHandler: Handler<PipelineStage> =
            jsonHandler<PipelineStage>(clientOptions.jsonMapper)

        override fun getStage(
            params: PipelineGetStageParams,
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
                    .use { getStageHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listAuditHandler: Handler<CollectionResponsePublicAuditInfoNoPaging> =
            jsonHandler<CollectionResponsePublicAuditInfoNoPaging>(clientOptions.jsonMapper)

        override fun listAudit(
            params: PipelineListAuditParams,
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
                        "pipelines",
                        "2026-03",
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
                    .use { listAuditHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listStageAuditHandler: Handler<CollectionResponsePublicAuditInfoNoPaging> =
            jsonHandler<CollectionResponsePublicAuditInfoNoPaging>(clientOptions.jsonMapper)

        override fun listStageAudit(
            params: PipelineListStageAuditParams,
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
                    .use { listStageAuditHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listStagesHandler: Handler<CollectionResponsePipelineStageNoPaging> =
            jsonHandler<CollectionResponsePipelineStageNoPaging>(clientOptions.jsonMapper)

        override fun listStages(
            params: PipelineListStagesParams,
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
                    .use { listStagesHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val updateAllPropertiesHandler: Handler<Pipeline> =
            jsonHandler<Pipeline>(clientOptions.jsonMapper)

        override fun updateAllProperties(
            params: PipelineUpdateAllPropertiesParams,
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
                        "pipelines",
                        "2026-03",
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
                    .use { updateAllPropertiesHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val updateStageHandler: Handler<PipelineStage> =
            jsonHandler<PipelineStage>(clientOptions.jsonMapper)

        override fun updateStage(
            params: PipelineUpdateStageParams,
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
                    .use { updateStageHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val updateStageAllPropertiesHandler: Handler<PipelineStage> =
            jsonHandler<PipelineStage>(clientOptions.jsonMapper)

        override fun updateStageAllProperties(
            params: PipelineUpdateStageAllPropertiesParams,
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
                    .use { updateStageAllPropertiesHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
