// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.crm

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
import com.hubspot_sdk.api.models.crm.owners.CollectionResponsePublicOwnerForwardPaging
import com.hubspot_sdk.api.models.crm.owners.OwnerGetParams
import com.hubspot_sdk.api.models.crm.owners.OwnerListPageAsync
import com.hubspot_sdk.api.models.crm.owners.OwnerListParams
import com.hubspot_sdk.api.models.crm.owners.PublicOwner
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class OwnerServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    OwnerServiceAsync {

    private val withRawResponse: OwnerServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): OwnerServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): OwnerServiceAsync =
        OwnerServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun list(
        params: OwnerListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<OwnerListPageAsync> =
        // get /crm/v3/owners/
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun get(
        params: OwnerGetParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PublicOwner> =
        // get /crm/v3/owners/{ownerId}
        withRawResponse().get(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        OwnerServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): OwnerServiceAsync.WithRawResponse =
            OwnerServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val listHandler: Handler<CollectionResponsePublicOwnerForwardPaging> =
            jsonHandler<CollectionResponsePublicOwnerForwardPaging>(clientOptions.jsonMapper)

        override fun list(
            params: OwnerListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<OwnerListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("crm", "v3", "owners", "")
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
                            .let {
                                OwnerListPageAsync.builder()
                                    .service(OwnerServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }

        private val getHandler: Handler<PublicOwner> =
            jsonHandler<PublicOwner>(clientOptions.jsonMapper)

        override fun get(
            params: OwnerGetParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PublicOwner>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("ownerId", params.ownerId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("crm", "v3", "owners", params._pathParam(0))
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
