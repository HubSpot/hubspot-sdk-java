// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.async.crm.objectlibrary

import com.hubspot.sdk.core.ClientOptions
import com.hubspot.sdk.core.RequestOptions
import com.hubspot.sdk.core.checkRequired
import com.hubspot.sdk.core.handlers.errorBodyHandler
import com.hubspot.sdk.core.handlers.errorHandler
import com.hubspot.sdk.core.handlers.jsonHandler
import com.hubspot.sdk.core.http.HttpMethod
import com.hubspot.sdk.core.http.HttpRequest
import com.hubspot.sdk.core.http.HttpResponse
import com.hubspot.sdk.core.http.HttpResponse.Handler
import com.hubspot.sdk.core.http.HttpResponseFor
import com.hubspot.sdk.core.http.parseable
import com.hubspot.sdk.core.prepareAsync
import com.hubspot.sdk.models.crm.objectlibrary.enablement.EnablementGetAllParams
import com.hubspot.sdk.models.crm.objectlibrary.enablement.EnablementGetByObjectTypeIdParams
import com.hubspot.sdk.models.crm.objectlibrary.enablement.ObjectTypeEnablementPublicResponse
import com.hubspot.sdk.models.crm.objectlibrary.enablement.PortalObjectTypeEnablementPublicResponse
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

    override fun getAll(
        params: EnablementGetAllParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PortalObjectTypeEnablementPublicResponse> =
        // get /crm/object-library/2026-03/enablement
        withRawResponse().getAll(params, requestOptions).thenApply { it.parse() }

    override fun getByObjectTypeId(
        params: EnablementGetByObjectTypeIdParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ObjectTypeEnablementPublicResponse> =
        // get /crm/object-library/2026-03/enablement/{objectTypeId}
        withRawResponse().getByObjectTypeId(params, requestOptions).thenApply { it.parse() }

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

        private val getAllHandler: Handler<PortalObjectTypeEnablementPublicResponse> =
            jsonHandler<PortalObjectTypeEnablementPublicResponse>(clientOptions.jsonMapper)

        override fun getAll(
            params: EnablementGetAllParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PortalObjectTypeEnablementPublicResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("crm", "object-library", "2026-03", "enablement")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { getAllHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val getByObjectTypeIdHandler: Handler<ObjectTypeEnablementPublicResponse> =
            jsonHandler<ObjectTypeEnablementPublicResponse>(clientOptions.jsonMapper)

        override fun getByObjectTypeId(
            params: EnablementGetByObjectTypeIdParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ObjectTypeEnablementPublicResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("objectTypeId", params.objectTypeId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "crm",
                        "object-library",
                        "2026-03",
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
                            .use { getByObjectTypeIdHandler.handle(it) }
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
