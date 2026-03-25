// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.meta.origins

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.handlers.errorBodyHandler
import com.hubspot_sdk.api.core.handlers.errorHandler
import com.hubspot_sdk.api.core.handlers.jsonHandler
import com.hubspot_sdk.api.core.handlers.stringHandler
import com.hubspot_sdk.api.core.http.HttpMethod
import com.hubspot_sdk.api.core.http.HttpRequest
import com.hubspot_sdk.api.core.http.HttpResponse
import com.hubspot_sdk.api.core.http.HttpResponse.Handler
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.core.http.parseable
import com.hubspot_sdk.api.core.prepareAsync
import com.hubspot_sdk.api.models.meta.origins.CollectionResponseIpRangeNoPaging
import com.hubspot_sdk.api.models.meta.origins.ipranges.IpRangeListParams
import com.hubspot_sdk.api.models.meta.origins.ipranges.IpRangeListSimpleParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class IpRangeServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    IpRangeServiceAsync {

    private val withRawResponse: IpRangeServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): IpRangeServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): IpRangeServiceAsync =
        IpRangeServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun list(
        params: IpRangeListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CollectionResponseIpRangeNoPaging> =
        // get /meta/network-origins/2026-03/ip-ranges
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun listSimple(
        params: IpRangeListSimpleParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<String> =
        // get /meta/network-origins/2026-03/ip-ranges/simple
        withRawResponse().listSimple(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        IpRangeServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): IpRangeServiceAsync.WithRawResponse =
            IpRangeServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val listHandler: Handler<CollectionResponseIpRangeNoPaging> =
            jsonHandler<CollectionResponseIpRangeNoPaging>(clientOptions.jsonMapper)

        override fun list(
            params: IpRangeListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CollectionResponseIpRangeNoPaging>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("meta", "network-origins", "2026-03", "ip-ranges")
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

        private val listSimpleHandler: Handler<String> = stringHandler()

        override fun listSimple(
            params: IpRangeListSimpleParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<String>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("meta", "network-origins", "2026-03", "ip-ranges", "simple")
                    .putHeader("Accept", "text/plain")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { listSimpleHandler.handle(it) }
                    }
                }
        }
    }
}
