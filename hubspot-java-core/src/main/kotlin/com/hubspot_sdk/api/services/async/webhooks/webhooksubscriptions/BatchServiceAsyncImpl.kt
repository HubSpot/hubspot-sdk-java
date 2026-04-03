// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.webhooks.webhooksubscriptions

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.checkRequired
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
import com.hubspot_sdk.api.models.webhooks.webhooksubscriptions.BatchResponseJournalFetchResponse
import com.hubspot_sdk.api.models.webhooks.webhooksubscriptions.BatchResponseSubscriptionResponse
import com.hubspot_sdk.api.models.webhooks.webhooksubscriptions.batch.BatchGetEarliestParams
import com.hubspot_sdk.api.models.webhooks.webhooksubscriptions.batch.BatchGetLatestParams
import com.hubspot_sdk.api.models.webhooks.webhooksubscriptions.batch.BatchGetLocalEarliestParams
import com.hubspot_sdk.api.models.webhooks.webhooksubscriptions.batch.BatchGetLocalLatestParams
import com.hubspot_sdk.api.models.webhooks.webhooksubscriptions.batch.BatchGetLocalNextParams
import com.hubspot_sdk.api.models.webhooks.webhooksubscriptions.batch.BatchGetLocalParams
import com.hubspot_sdk.api.models.webhooks.webhooksubscriptions.batch.BatchGetNextParams
import com.hubspot_sdk.api.models.webhooks.webhooksubscriptions.batch.BatchGetParams
import com.hubspot_sdk.api.models.webhooks.webhooksubscriptions.batch.BatchUpdateSubscriptionsParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class BatchServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    BatchServiceAsync {

    private val withRawResponse: BatchServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): BatchServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): BatchServiceAsync =
        BatchServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun get(
        params: BatchGetParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BatchResponseJournalFetchResponse> =
        // post /webhooks-journal/journal-local/2026-03/batch/read
        withRawResponse().get(params, requestOptions).thenApply { it.parse() }

    override fun getEarliest(
        params: BatchGetEarliestParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BatchResponseJournalFetchResponse> =
        // get /webhooks-journal/journal/2026-03/batch/earliest/{count}
        withRawResponse().getEarliest(params, requestOptions).thenApply { it.parse() }

    override fun getLatest(
        params: BatchGetLatestParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BatchResponseJournalFetchResponse> =
        // get /webhooks-journal/journal/2026-03/batch/latest/{count}
        withRawResponse().getLatest(params, requestOptions).thenApply { it.parse() }

    override fun getLocal(
        params: BatchGetLocalParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BatchResponseJournalFetchResponse> =
        // post /webhooks-journal/journal/2026-03/batch/read
        withRawResponse().getLocal(params, requestOptions).thenApply { it.parse() }

    override fun getLocalEarliest(
        params: BatchGetLocalEarliestParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BatchResponseJournalFetchResponse> =
        // get /webhooks-journal/journal-local/2026-03/batch/earliest/{count}
        withRawResponse().getLocalEarliest(params, requestOptions).thenApply { it.parse() }

    override fun getLocalLatest(
        params: BatchGetLocalLatestParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BatchResponseJournalFetchResponse> =
        // get /webhooks-journal/journal-local/2026-03/batch/latest/{count}
        withRawResponse().getLocalLatest(params, requestOptions).thenApply { it.parse() }

    override fun getLocalNext(
        params: BatchGetLocalNextParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BatchResponseJournalFetchResponse> =
        // get /webhooks-journal/journal-local/2026-03/batch/{offset}/next/{count}
        withRawResponse().getLocalNext(params, requestOptions).thenApply { it.parse() }

    override fun getNext(
        params: BatchGetNextParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BatchResponseJournalFetchResponse> =
        // get /webhooks-journal/journal/2026-03/batch/{offset}/next/{count}
        withRawResponse().getNext(params, requestOptions).thenApply { it.parse() }

    override fun updateSubscriptions(
        params: BatchUpdateSubscriptionsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BatchResponseSubscriptionResponse> =
        // post /webhooks/2026-03/{appId}/subscriptions/batch/update
        withRawResponse().updateSubscriptions(params, requestOptions).thenApply { it.parse() }

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

        private val getHandler: Handler<BatchResponseJournalFetchResponse> =
            jsonHandler<BatchResponseJournalFetchResponse>(clientOptions.jsonMapper)

        override fun get(
            params: BatchGetParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BatchResponseJournalFetchResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "webhooks-journal",
                        "journal-local",
                        "2026-03",
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
                            .use { getHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val getEarliestHandler: Handler<BatchResponseJournalFetchResponse> =
            jsonHandler<BatchResponseJournalFetchResponse>(clientOptions.jsonMapper)

        override fun getEarliest(
            params: BatchGetEarliestParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BatchResponseJournalFetchResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("count", params.count().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "webhooks-journal",
                        "journal",
                        "2026-03",
                        "batch",
                        "earliest",
                        params._pathParam(0),
                    )
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { getEarliestHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val getLatestHandler: Handler<BatchResponseJournalFetchResponse> =
            jsonHandler<BatchResponseJournalFetchResponse>(clientOptions.jsonMapper)

        override fun getLatest(
            params: BatchGetLatestParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BatchResponseJournalFetchResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("count", params.count().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "webhooks-journal",
                        "journal",
                        "2026-03",
                        "batch",
                        "latest",
                        params._pathParam(0),
                    )
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { getLatestHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val getLocalHandler: Handler<BatchResponseJournalFetchResponse> =
            jsonHandler<BatchResponseJournalFetchResponse>(clientOptions.jsonMapper)

        override fun getLocal(
            params: BatchGetLocalParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BatchResponseJournalFetchResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("webhooks-journal", "journal", "2026-03", "batch", "read")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { getLocalHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val getLocalEarliestHandler: Handler<BatchResponseJournalFetchResponse> =
            jsonHandler<BatchResponseJournalFetchResponse>(clientOptions.jsonMapper)

        override fun getLocalEarliest(
            params: BatchGetLocalEarliestParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BatchResponseJournalFetchResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("count", params.count().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "webhooks-journal",
                        "journal-local",
                        "2026-03",
                        "batch",
                        "earliest",
                        params._pathParam(0),
                    )
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { getLocalEarliestHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val getLocalLatestHandler: Handler<BatchResponseJournalFetchResponse> =
            jsonHandler<BatchResponseJournalFetchResponse>(clientOptions.jsonMapper)

        override fun getLocalLatest(
            params: BatchGetLocalLatestParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BatchResponseJournalFetchResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("count", params.count().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "webhooks-journal",
                        "journal-local",
                        "2026-03",
                        "batch",
                        "latest",
                        params._pathParam(0),
                    )
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { getLocalLatestHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val getLocalNextHandler: Handler<BatchResponseJournalFetchResponse> =
            jsonHandler<BatchResponseJournalFetchResponse>(clientOptions.jsonMapper)

        override fun getLocalNext(
            params: BatchGetLocalNextParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BatchResponseJournalFetchResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("count", params.count().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "webhooks-journal",
                        "journal-local",
                        "2026-03",
                        "batch",
                        params._pathParam(0),
                        "next",
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
                            .use { getLocalNextHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val getNextHandler: Handler<BatchResponseJournalFetchResponse> =
            jsonHandler<BatchResponseJournalFetchResponse>(clientOptions.jsonMapper)

        override fun getNext(
            params: BatchGetNextParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BatchResponseJournalFetchResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("count", params.count().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "webhooks-journal",
                        "journal",
                        "2026-03",
                        "batch",
                        params._pathParam(0),
                        "next",
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
                            .use { getNextHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val updateSubscriptionsHandler: Handler<BatchResponseSubscriptionResponse> =
            jsonHandler<BatchResponseSubscriptionResponse>(clientOptions.jsonMapper)

        override fun updateSubscriptions(
            params: BatchUpdateSubscriptionsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BatchResponseSubscriptionResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("appId", params.appId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "webhooks",
                        "2026-03",
                        params._pathParam(0),
                        "subscriptions",
                        "batch",
                        "update",
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
                            .use { updateSubscriptionsHandler.handle(it) }
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
