// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.crm.objects

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
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
import com.hubspot_sdk.api.models.crm.objects.dealsplits.BatchResponseDealToDealSplits
import com.hubspot_sdk.api.models.crm.objects.dealsplits.DealSplitBatchReadParams
import com.hubspot_sdk.api.models.crm.objects.dealsplits.DealSplitBatchUpsertParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class DealSplitServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    DealSplitServiceAsync {

    private val withRawResponse: DealSplitServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): DealSplitServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): DealSplitServiceAsync =
        DealSplitServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun batchRead(
        params: DealSplitBatchReadParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BatchResponseDealToDealSplits> =
        // post /crm/v3/objects/deals/splits/batch/read
        withRawResponse().batchRead(params, requestOptions).thenApply { it.parse() }

    override fun batchUpsert(
        params: DealSplitBatchUpsertParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BatchResponseDealToDealSplits> =
        // post /crm/v3/objects/deals/splits/batch/upsert
        withRawResponse().batchUpsert(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        DealSplitServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): DealSplitServiceAsync.WithRawResponse =
            DealSplitServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val batchReadHandler: Handler<BatchResponseDealToDealSplits> =
            jsonHandler<BatchResponseDealToDealSplits>(clientOptions.jsonMapper)

        override fun batchRead(
            params: DealSplitBatchReadParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BatchResponseDealToDealSplits>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("crm", "v3", "objects", "deals", "splits", "batch", "read")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { batchReadHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val batchUpsertHandler: Handler<BatchResponseDealToDealSplits> =
            jsonHandler<BatchResponseDealToDealSplits>(clientOptions.jsonMapper)

        override fun batchUpsert(
            params: DealSplitBatchUpsertParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BatchResponseDealToDealSplits>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("crm", "v3", "objects", "deals", "splits", "batch", "upsert")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { batchUpsertHandler.handle(it) }
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
