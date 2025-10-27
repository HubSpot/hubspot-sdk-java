// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.marketing.subscriptions.v4

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
import com.hubspot_sdk.api.models.marketing.subscriptions.v4.ActionResponseWithResultsPublicStatus
import com.hubspot_sdk.api.models.marketing.subscriptions.v4.ActionResponseWithResultsPublicWideStatus
import com.hubspot_sdk.api.models.marketing.subscriptions.v4.BatchResponsePublicBulkOptOutFromAllResponse
import com.hubspot_sdk.api.models.marketing.subscriptions.v4.BatchResponsePublicStatus
import com.hubspot_sdk.api.models.marketing.subscriptions.v4.BatchResponsePublicStatusBulkResponse
import com.hubspot_sdk.api.models.marketing.subscriptions.v4.BatchResponsePublicWideStatusBulkResponse
import com.hubspot_sdk.api.models.marketing.subscriptions.v4.statuses.StatusBatchGetParams
import com.hubspot_sdk.api.models.marketing.subscriptions.v4.statuses.StatusBatchGetUnsubscribeAllStatusParams
import com.hubspot_sdk.api.models.marketing.subscriptions.v4.statuses.StatusBatchUnsubscribeAllParams
import com.hubspot_sdk.api.models.marketing.subscriptions.v4.statuses.StatusBatchUpdateParams
import com.hubspot_sdk.api.models.marketing.subscriptions.v4.statuses.StatusGetParams
import com.hubspot_sdk.api.models.marketing.subscriptions.v4.statuses.StatusGetUnsubscribeAllStatusParams
import com.hubspot_sdk.api.models.marketing.subscriptions.v4.statuses.StatusUnsubscribeAllParams
import com.hubspot_sdk.api.models.marketing.subscriptions.v4.statuses.StatusUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class StatusServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    StatusServiceAsync {

    private val withRawResponse: StatusServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): StatusServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): StatusServiceAsync =
        StatusServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun update(
        params: StatusUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ActionResponseWithResultsPublicStatus> =
        // post /communication-preferences/v4/statuses/{subscriberIdString}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun batchGet(
        params: StatusBatchGetParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BatchResponsePublicStatusBulkResponse> =
        // post /communication-preferences/v4/statuses/batch/read
        withRawResponse().batchGet(params, requestOptions).thenApply { it.parse() }

    override fun batchGetUnsubscribeAllStatus(
        params: StatusBatchGetUnsubscribeAllStatusParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BatchResponsePublicWideStatusBulkResponse> =
        // post /communication-preferences/v4/statuses/batch/unsubscribe-all/read
        withRawResponse().batchGetUnsubscribeAllStatus(params, requestOptions).thenApply {
            it.parse()
        }

    override fun batchUnsubscribeAll(
        params: StatusBatchUnsubscribeAllParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BatchResponsePublicBulkOptOutFromAllResponse> =
        // post /communication-preferences/v4/statuses/batch/unsubscribe-all
        withRawResponse().batchUnsubscribeAll(params, requestOptions).thenApply { it.parse() }

    override fun batchUpdate(
        params: StatusBatchUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BatchResponsePublicStatus> =
        // post /communication-preferences/v4/statuses/batch/write
        withRawResponse().batchUpdate(params, requestOptions).thenApply { it.parse() }

    override fun get(
        params: StatusGetParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ActionResponseWithResultsPublicStatus> =
        // get /communication-preferences/v4/statuses/{subscriberIdString}
        withRawResponse().get(params, requestOptions).thenApply { it.parse() }

    override fun getUnsubscribeAllStatus(
        params: StatusGetUnsubscribeAllStatusParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ActionResponseWithResultsPublicWideStatus> =
        // get /communication-preferences/v4/statuses/{subscriberIdString}/unsubscribe-all
        withRawResponse().getUnsubscribeAllStatus(params, requestOptions).thenApply { it.parse() }

    override fun unsubscribeAll(
        params: StatusUnsubscribeAllParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ActionResponseWithResultsPublicStatus> =
        // post /communication-preferences/v4/statuses/{subscriberIdString}/unsubscribe-all
        withRawResponse().unsubscribeAll(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        StatusServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): StatusServiceAsync.WithRawResponse =
            StatusServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val updateHandler: Handler<ActionResponseWithResultsPublicStatus> =
            jsonHandler<ActionResponseWithResultsPublicStatus>(clientOptions.jsonMapper)

        override fun update(
            params: StatusUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ActionResponseWithResultsPublicStatus>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("subscriberIdString", params.subscriberIdString().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "communication-preferences",
                        "v4",
                        "statuses",
                        params._pathParam(0),
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

        private val batchGetHandler: Handler<BatchResponsePublicStatusBulkResponse> =
            jsonHandler<BatchResponsePublicStatusBulkResponse>(clientOptions.jsonMapper)

        override fun batchGet(
            params: StatusBatchGetParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BatchResponsePublicStatusBulkResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("communication-preferences", "v4", "statuses", "batch", "read")
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

        private val batchGetUnsubscribeAllStatusHandler:
            Handler<BatchResponsePublicWideStatusBulkResponse> =
            jsonHandler<BatchResponsePublicWideStatusBulkResponse>(clientOptions.jsonMapper)

        override fun batchGetUnsubscribeAllStatus(
            params: StatusBatchGetUnsubscribeAllStatusParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BatchResponsePublicWideStatusBulkResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "communication-preferences",
                        "v4",
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
                            .use { batchGetUnsubscribeAllStatusHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val batchUnsubscribeAllHandler:
            Handler<BatchResponsePublicBulkOptOutFromAllResponse> =
            jsonHandler<BatchResponsePublicBulkOptOutFromAllResponse>(clientOptions.jsonMapper)

        override fun batchUnsubscribeAll(
            params: StatusBatchUnsubscribeAllParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BatchResponsePublicBulkOptOutFromAllResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "communication-preferences",
                        "v4",
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
                            .use { batchUnsubscribeAllHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val batchUpdateHandler: Handler<BatchResponsePublicStatus> =
            jsonHandler<BatchResponsePublicStatus>(clientOptions.jsonMapper)

        override fun batchUpdate(
            params: StatusBatchUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BatchResponsePublicStatus>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "communication-preferences",
                        "v4",
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
                            .use { batchUpdateHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val getHandler: Handler<ActionResponseWithResultsPublicStatus> =
            jsonHandler<ActionResponseWithResultsPublicStatus>(clientOptions.jsonMapper)

        override fun get(
            params: StatusGetParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ActionResponseWithResultsPublicStatus>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("subscriberIdString", params.subscriberIdString().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "communication-preferences",
                        "v4",
                        "statuses",
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
                            .use { getHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val getUnsubscribeAllStatusHandler:
            Handler<ActionResponseWithResultsPublicWideStatus> =
            jsonHandler<ActionResponseWithResultsPublicWideStatus>(clientOptions.jsonMapper)

        override fun getUnsubscribeAllStatus(
            params: StatusGetUnsubscribeAllStatusParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ActionResponseWithResultsPublicWideStatus>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("subscriberIdString", params.subscriberIdString().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "communication-preferences",
                        "v4",
                        "statuses",
                        params._pathParam(0),
                        "unsubscribe-all",
                    )
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { getUnsubscribeAllStatusHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val unsubscribeAllHandler: Handler<ActionResponseWithResultsPublicStatus> =
            jsonHandler<ActionResponseWithResultsPublicStatus>(clientOptions.jsonMapper)

        override fun unsubscribeAll(
            params: StatusUnsubscribeAllParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ActionResponseWithResultsPublicStatus>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("subscriberIdString", params.subscriberIdString().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "communication-preferences",
                        "v4",
                        "statuses",
                        params._pathParam(0),
                        "unsubscribe-all",
                    )
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
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
    }
}
