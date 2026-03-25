// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.crm

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
    ): CompletableFuture<PipelineStage> =
        // post /crm/pipelines/2026-03/{objectType}/{pipelineId}/stages
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: PipelineUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PipelineStage> =
        // patch /crm/pipelines/2026-03/{objectType}/{pipelineId}/stages/{stageId}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: PipelineListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CollectionResponsePipelineStageNoPaging> =
        // get /crm/pipelines/2026-03/{objectType}/{pipelineId}/stages
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: PipelineDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // delete /crm/pipelines/2026-03/{objectType}/{pipelineId}/stages/{stageId}
        withRawResponse().delete(params, requestOptions).thenAccept {}

    override fun get(
        params: PipelineGetParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PipelineStage> =
        // get /crm/pipelines/2026-03/{objectType}/{pipelineId}/stages/{stageId}
        withRawResponse().get(params, requestOptions).thenApply { it.parse() }

    override fun getAudit(
        params: PipelineGetAuditParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CollectionResponsePublicAuditInfoNoPaging> =
        // get /crm/pipelines/2026-03/{objectType}/{pipelineId}/stages/{stageId}/audit
        withRawResponse().getAudit(params, requestOptions).thenApply { it.parse() }

    override fun replace(
        params: PipelineReplaceParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PipelineStage> =
        // put /crm/pipelines/2026-03/{objectType}/{pipelineId}/stages/{stageId}
        withRawResponse().replace(params, requestOptions).thenApply { it.parse() }

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

        private val createHandler: Handler<PipelineStage> =
            jsonHandler<PipelineStage>(clientOptions.jsonMapper)

        override fun create(
            params: PipelineCreateParams,
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
                            .use { createHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val updateHandler: Handler<PipelineStage> =
            jsonHandler<PipelineStage>(clientOptions.jsonMapper)

        override fun update(
            params: PipelineUpdateParams,
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
                            .use { updateHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val listHandler: Handler<CollectionResponsePipelineStageNoPaging> =
            jsonHandler<CollectionResponsePipelineStageNoPaging>(clientOptions.jsonMapper)

        override fun list(
            params: PipelineListParams,
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
                        response.use { deleteHandler.handle(it) }
                    }
                }
        }

        private val getHandler: Handler<PipelineStage> =
            jsonHandler<PipelineStage>(clientOptions.jsonMapper)

        override fun get(
            params: PipelineGetParams,
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
                            .use { getHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val getAuditHandler: Handler<CollectionResponsePublicAuditInfoNoPaging> =
            jsonHandler<CollectionResponsePublicAuditInfoNoPaging>(clientOptions.jsonMapper)

        override fun getAudit(
            params: PipelineGetAuditParams,
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
                            .use { getAuditHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val replaceHandler: Handler<PipelineStage> =
            jsonHandler<PipelineStage>(clientOptions.jsonMapper)

        override fun replace(
            params: PipelineReplaceParams,
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
}
