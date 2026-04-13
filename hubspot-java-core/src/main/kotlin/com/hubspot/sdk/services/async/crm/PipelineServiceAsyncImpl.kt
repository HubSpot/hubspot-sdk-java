// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.async.crm

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
import com.hubspot.sdk.core.prepareAsync
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
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class PipelineServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    PipelineServiceAsync {

    private val withRawResponse: PipelineServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): PipelineServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): PipelineServiceAsync =
        PipelineServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: PipelineCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Pipeline> =
        // post /crm/pipelines/2026-03/{objectType}
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: PipelineUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Pipeline> =
        // patch /crm/pipelines/2026-03/{objectType}/{pipelineId}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: PipelineListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CollectionResponsePipelineNoPaging> =
        // get /crm/pipelines/2026-03/{objectType}
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: PipelineDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // delete /crm/pipelines/2026-03/{objectType}/{pipelineId}
        withRawResponse().delete(params, requestOptions).thenAccept {}

    override fun createStage(
        params: PipelineCreateStageParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PipelineStage> =
        // post /crm/pipelines/2026-03/{objectType}/{pipelineId}/stages
        withRawResponse().createStage(params, requestOptions).thenApply { it.parse() }

    override fun deleteStage(
        params: PipelineDeleteStageParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // delete /crm/pipelines/2026-03/{objectType}/{pipelineId}/stages/{stageId}
        withRawResponse().deleteStage(params, requestOptions).thenAccept {}

    override fun get(
        params: PipelineGetParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Pipeline> =
        // get /crm/pipelines/2026-03/{objectType}/{pipelineId}
        withRawResponse().get(params, requestOptions).thenApply { it.parse() }

    override fun getStage(
        params: PipelineGetStageParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PipelineStage> =
        // get /crm/pipelines/2026-03/{objectType}/{pipelineId}/stages/{stageId}
        withRawResponse().getStage(params, requestOptions).thenApply { it.parse() }

    override fun listAudit(
        params: PipelineListAuditParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CollectionResponsePublicAuditInfoNoPaging> =
        // get /crm/pipelines/2026-03/{objectType}/{pipelineId}/audit
        withRawResponse().listAudit(params, requestOptions).thenApply { it.parse() }

    override fun listStageAudit(
        params: PipelineListStageAuditParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CollectionResponsePublicAuditInfoNoPaging> =
        // get /crm/pipelines/2026-03/{objectType}/{pipelineId}/stages/{stageId}/audit
        withRawResponse().listStageAudit(params, requestOptions).thenApply { it.parse() }

    override fun listStages(
        params: PipelineListStagesParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CollectionResponsePipelineStageNoPaging> =
        // get /crm/pipelines/2026-03/{objectType}/{pipelineId}/stages
        withRawResponse().listStages(params, requestOptions).thenApply { it.parse() }

    override fun updateAllProperties(
        params: PipelineUpdateAllPropertiesParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Pipeline> =
        // put /crm/pipelines/2026-03/{objectType}/{pipelineId}
        withRawResponse().updateAllProperties(params, requestOptions).thenApply { it.parse() }

    override fun updateStage(
        params: PipelineUpdateStageParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PipelineStage> =
        // patch /crm/pipelines/2026-03/{objectType}/{pipelineId}/stages/{stageId}
        withRawResponse().updateStage(params, requestOptions).thenApply { it.parse() }

    override fun updateStageAllProperties(
        params: PipelineUpdateStageAllPropertiesParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PipelineStage> =
        // put /crm/pipelines/2026-03/{objectType}/{pipelineId}/stages/{stageId}
        withRawResponse().updateStageAllProperties(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PipelineServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PipelineServiceAsync.WithRawResponse =
            PipelineServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<Pipeline> =
            jsonHandler<Pipeline>(clientOptions.jsonMapper)

        override fun create(
            params: PipelineCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Pipeline>> {
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

        private val updateHandler: Handler<Pipeline> =
            jsonHandler<Pipeline>(clientOptions.jsonMapper)

        override fun update(
            params: PipelineUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Pipeline>> {
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

        private val listHandler: Handler<CollectionResponsePipelineNoPaging> =
            jsonHandler<CollectionResponsePipelineNoPaging>(clientOptions.jsonMapper)

        override fun list(
            params: PipelineListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CollectionResponsePipelineNoPaging>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("objectType", params.objectType().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("crm", "pipelines", "2026-03", params._pathParam(0))
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
                    }
                }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: PipelineDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
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

        private val createStageHandler: Handler<PipelineStage> =
            jsonHandler<PipelineStage>(clientOptions.jsonMapper)

        override fun createStage(
            params: PipelineCreateStageParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PipelineStage>> {
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { createStageHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val deleteStageHandler: Handler<Void?> = emptyHandler()

        override fun deleteStage(
            params: PipelineDeleteStageParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { deleteStageHandler.handle(it) }
                    }
                }
        }

        private val getHandler: Handler<Pipeline> = jsonHandler<Pipeline>(clientOptions.jsonMapper)

        override fun get(
            params: PipelineGetParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Pipeline>> {
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

        private val getStageHandler: Handler<PipelineStage> =
            jsonHandler<PipelineStage>(clientOptions.jsonMapper)

        override fun getStage(
            params: PipelineGetStageParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PipelineStage>> {
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { getStageHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val listAuditHandler: Handler<CollectionResponsePublicAuditInfoNoPaging> =
            jsonHandler<CollectionResponsePublicAuditInfoNoPaging>(clientOptions.jsonMapper)

        override fun listAudit(
            params: PipelineListAuditParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CollectionResponsePublicAuditInfoNoPaging>> {
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listAuditHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val listStageAuditHandler: Handler<CollectionResponsePublicAuditInfoNoPaging> =
            jsonHandler<CollectionResponsePublicAuditInfoNoPaging>(clientOptions.jsonMapper)

        override fun listStageAudit(
            params: PipelineListStageAuditParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CollectionResponsePublicAuditInfoNoPaging>> {
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listStageAuditHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val listStagesHandler: Handler<CollectionResponsePipelineStageNoPaging> =
            jsonHandler<CollectionResponsePipelineStageNoPaging>(clientOptions.jsonMapper)

        override fun listStages(
            params: PipelineListStagesParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CollectionResponsePipelineStageNoPaging>> {
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listStagesHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val updateAllPropertiesHandler: Handler<Pipeline> =
            jsonHandler<Pipeline>(clientOptions.jsonMapper)

        override fun updateAllProperties(
            params: PipelineUpdateAllPropertiesParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Pipeline>> {
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { updateAllPropertiesHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val updateStageHandler: Handler<PipelineStage> =
            jsonHandler<PipelineStage>(clientOptions.jsonMapper)

        override fun updateStage(
            params: PipelineUpdateStageParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PipelineStage>> {
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { updateStageHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val updateStageAllPropertiesHandler: Handler<PipelineStage> =
            jsonHandler<PipelineStage>(clientOptions.jsonMapper)

        override fun updateStageAllProperties(
            params: PipelineUpdateStageAllPropertiesParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PipelineStage>> {
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
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
}
