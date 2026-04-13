// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.async.communicationpreferences.statuses

import com.hubspot.sdk.core.ClientOptions
import com.hubspot.sdk.core.RequestOptions
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
import com.hubspot.sdk.models.communicationpreferences.BatchResponsePublicBulkOptOutFromAllResponse
import com.hubspot.sdk.models.communicationpreferences.BatchResponsePublicStatus
import com.hubspot.sdk.models.communicationpreferences.BatchResponsePublicStatusBulkResponse
import com.hubspot.sdk.models.communicationpreferences.BatchResponsePublicWideStatusBulkResponse
import com.hubspot.sdk.models.communicationpreferences.statuses.batch.BatchGetUnsubscribeAllStatusesParams
import com.hubspot.sdk.models.communicationpreferences.statuses.batch.BatchReadParams
import com.hubspot.sdk.models.communicationpreferences.statuses.batch.BatchUnsubscribeAllParams
import com.hubspot.sdk.models.communicationpreferences.statuses.batch.BatchUpdateStatusesParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class BatchServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    BatchServiceAsync {

    private val withRawResponse: BatchServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): BatchServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): BatchServiceAsync =
        BatchServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun getUnsubscribeAllStatuses(
        params: BatchGetUnsubscribeAllStatusesParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BatchResponsePublicWideStatusBulkResponse> =
        // post /communication-preferences/2026-03/statuses/batch/unsubscribe-all/read
        withRawResponse().getUnsubscribeAllStatuses(params, requestOptions).thenApply { it.parse() }

    override fun read(
        params: BatchReadParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BatchResponsePublicStatusBulkResponse> =
        // post /communication-preferences/2026-03/statuses/batch/read
        withRawResponse().read(params, requestOptions).thenApply { it.parse() }

    override fun unsubscribeAll(
        params: BatchUnsubscribeAllParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BatchResponsePublicBulkOptOutFromAllResponse> =
        // post /communication-preferences/2026-03/statuses/batch/unsubscribe-all
        withRawResponse().unsubscribeAll(params, requestOptions).thenApply { it.parse() }

    override fun updateStatuses(
        params: BatchUpdateStatusesParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BatchResponsePublicStatus> =
        // post /communication-preferences/2026-03/statuses/batch/write
        withRawResponse().updateStatuses(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        BatchServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): BatchServiceAsync.WithRawResponse =
            BatchServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val getUnsubscribeAllStatusesHandler:
            Handler<BatchResponsePublicWideStatusBulkResponse> =
            jsonHandler<BatchResponsePublicWideStatusBulkResponse>(clientOptions.jsonMapper)

        override fun getUnsubscribeAllStatuses(
            params: BatchGetUnsubscribeAllStatusesParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BatchResponsePublicWideStatusBulkResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "communication-preferences",
                        "2026-03",
                        "statuses",
                        "batch",
                        "unsubscribe-all",
                        "read",
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
                            .use { getUnsubscribeAllStatusesHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val readHandler: Handler<BatchResponsePublicStatusBulkResponse> =
            jsonHandler<BatchResponsePublicStatusBulkResponse>(clientOptions.jsonMapper)

        override fun read(
            params: BatchReadParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BatchResponsePublicStatusBulkResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "communication-preferences",
                        "2026-03",
                        "statuses",
                        "batch",
                        "read",
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
                            .use { readHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val unsubscribeAllHandler: Handler<BatchResponsePublicBulkOptOutFromAllResponse> =
            jsonHandler<BatchResponsePublicBulkOptOutFromAllResponse>(clientOptions.jsonMapper)

        override fun unsubscribeAll(
            params: BatchUnsubscribeAllParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BatchResponsePublicBulkOptOutFromAllResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "communication-preferences",
                        "2026-03",
                        "statuses",
                        "batch",
                        "unsubscribe-all",
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
                            .use { unsubscribeAllHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val updateStatusesHandler: Handler<BatchResponsePublicStatus> =
            jsonHandler<BatchResponsePublicStatus>(clientOptions.jsonMapper)

        override fun updateStatuses(
            params: BatchUpdateStatusesParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BatchResponsePublicStatus>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "communication-preferences",
                        "2026-03",
                        "statuses",
                        "batch",
                        "write",
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
                            .use { updateStatusesHandler.handle(it) }
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
