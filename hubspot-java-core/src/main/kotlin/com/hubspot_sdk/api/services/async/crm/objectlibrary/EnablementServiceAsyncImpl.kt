// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.crm.objectlibrary

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
import com.hubspot_sdk.api.core.http.parseable
import com.hubspot_sdk.api.core.prepareAsync
import com.hubspot_sdk.api.models.crm.objectlibrary.enablement.EnablementGetParams
import com.hubspot_sdk.api.models.crm.objectlibrary.enablement.EnablementGetResponse
import com.hubspot_sdk.api.models.crm.objectlibrary.enablement.EnablementListParams
import com.hubspot_sdk.api.models.crm.objectlibrary.enablement.EnablementListResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class EnablementServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    EnablementServiceAsync {

    private val withRawResponse: EnablementServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): EnablementServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): EnablementServiceAsync =
        EnablementServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun list(
        params: EnablementListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<EnablementListResponse> =
        // get /crm/v3/object-library/enablement
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun get(
        params: EnablementGetParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<EnablementGetResponse> =
        // get /crm/v3/object-library/enablement/{objectTypeId}
        withRawResponse().get(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        EnablementServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): EnablementServiceAsync.WithRawResponse =
            EnablementServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val listHandler: Handler<EnablementListResponse> =
            jsonHandler<EnablementListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: EnablementListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<EnablementListResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("crm", "v3", "object-library", "enablement")
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

        private val getHandler: Handler<EnablementGetResponse> =
            jsonHandler<EnablementGetResponse>(clientOptions.jsonMapper)

        override fun get(
            params: EnablementGetParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<EnablementGetResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("objectTypeId", params.objectTypeId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "crm",
                        "v3",
                        "object-library",
                        "enablement",
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
    }
}
