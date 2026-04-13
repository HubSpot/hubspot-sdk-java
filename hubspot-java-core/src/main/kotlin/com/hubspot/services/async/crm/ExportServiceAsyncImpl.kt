// File generated from our OpenAPI spec by Stainless.

package com.hubspot.services.async.crm

import com.hubspot.core.ClientOptions
import com.hubspot.core.RequestOptions
import com.hubspot.core.checkRequired
import com.hubspot.core.handlers.errorBodyHandler
import com.hubspot.core.handlers.errorHandler
import com.hubspot.core.handlers.jsonHandler
import com.hubspot.core.http.HttpMethod
import com.hubspot.core.http.HttpRequest
import com.hubspot.core.http.HttpResponse
import com.hubspot.core.http.HttpResponse.Handler
import com.hubspot.core.http.HttpResponseFor
import com.hubspot.core.http.json
import com.hubspot.core.http.parseable
import com.hubspot.core.prepareAsync
import com.hubspot.models.TaskLocator
import com.hubspot.models.crm.exports.ActionResponseWithSingleResultUri
import com.hubspot.models.crm.exports.ExportCreateAsyncParams
import com.hubspot.models.crm.exports.ExportGetParams
import com.hubspot.models.crm.exports.ExportGetStatusParams
import com.hubspot.models.crm.exports.PublicExportResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class ExportServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    ExportServiceAsync {

    private val withRawResponse: ExportServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ExportServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ExportServiceAsync =
        ExportServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun createAsync(
        params: ExportCreateAsyncParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<TaskLocator> =
        // post /crm/exports/2026-03/export/async
        withRawResponse().createAsync(params, requestOptions).thenApply { it.parse() }

    override fun get(
        params: ExportGetParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PublicExportResponse> =
        // get /crm/exports/2026-03/export/{exportId}
        withRawResponse().get(params, requestOptions).thenApply { it.parse() }

    override fun getStatus(
        params: ExportGetStatusParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ActionResponseWithSingleResultUri> =
        // get /crm/exports/2026-03/export/async/tasks/{taskId}/status
        withRawResponse().getStatus(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ExportServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ExportServiceAsync.WithRawResponse =
            ExportServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createAsyncHandler: Handler<TaskLocator> =
            jsonHandler<TaskLocator>(clientOptions.jsonMapper)

        override fun createAsync(
            params: ExportCreateAsyncParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TaskLocator>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("crm", "exports", "2026-03", "export", "async")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { createAsyncHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val getHandler: Handler<PublicExportResponse> =
            jsonHandler<PublicExportResponse>(clientOptions.jsonMapper)

        override fun get(
            params: ExportGetParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PublicExportResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("exportId", params.exportId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("crm", "exports", "2026-03", "export", params._pathParam(0))
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

        private val getStatusHandler: Handler<ActionResponseWithSingleResultUri> =
            jsonHandler<ActionResponseWithSingleResultUri>(clientOptions.jsonMapper)

        override fun getStatus(
            params: ExportGetStatusParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ActionResponseWithSingleResultUri>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("taskId", params.taskId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "crm",
                        "exports",
                        "2026-03",
                        "export",
                        "async",
                        "tasks",
                        params._pathParam(0),
                        "status",
                    )
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { getStatusHandler.handle(it) }
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
