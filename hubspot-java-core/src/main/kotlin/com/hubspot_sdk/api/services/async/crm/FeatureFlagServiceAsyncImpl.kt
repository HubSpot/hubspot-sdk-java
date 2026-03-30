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
import com.hubspot_sdk.api.core.http.json
import com.hubspot_sdk.api.core.http.parseable
import com.hubspot_sdk.api.core.prepareAsync
import com.hubspot_sdk.api.models.crm.featureflags.FeatureFlagDeleteParams
import com.hubspot_sdk.api.models.crm.featureflags.FeatureFlagGetParams
import com.hubspot_sdk.api.models.crm.featureflags.FeatureFlagListAllParams
import com.hubspot_sdk.api.models.crm.featureflags.FeatureFlagListPortalsParams
import com.hubspot_sdk.api.models.crm.featureflags.FeatureFlagUpdateParams
import com.hubspot_sdk.api.models.crm.featureflags.FlagsForAppResponse
import com.hubspot_sdk.api.models.crm.featureflags.PortalFlagStateBatchResponse
import com.hubspot_sdk.api.models.crm.featureflags.PortalFlagStateResponse
import com.hubspot_sdk.api.services.async.crm.featureflags.BatchServiceAsync
import com.hubspot_sdk.api.services.async.crm.featureflags.BatchServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class FeatureFlagServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    FeatureFlagServiceAsync {

    private val withRawResponse: FeatureFlagServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val batch: BatchServiceAsync by lazy { BatchServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): FeatureFlagServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): FeatureFlagServiceAsync =
        FeatureFlagServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun batch(): BatchServiceAsync = batch

    override fun update(
        params: FeatureFlagUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PortalFlagStateResponse> =
        // put /feature-flags/2026-03/{appId}/flags/{flagName}/portals/{portalId}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: FeatureFlagDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PortalFlagStateResponse> =
        // delete /feature-flags/2026-03/{appId}/flags/{flagName}/portals/{portalId}
        withRawResponse().delete(params, requestOptions).thenApply { it.parse() }

    override fun get(
        params: FeatureFlagGetParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PortalFlagStateResponse> =
        // get /feature-flags/2026-03/{appId}/flags/{flagName}/portals/{portalId}
        withRawResponse().get(params, requestOptions).thenApply { it.parse() }

    override fun listAll(
        params: FeatureFlagListAllParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<FlagsForAppResponse> =
        // get /feature-flags/2026-03/{appId}/flags/all
        withRawResponse().listAll(params, requestOptions).thenApply { it.parse() }

    override fun listPortals(
        params: FeatureFlagListPortalsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PortalFlagStateBatchResponse> =
        // get /feature-flags/2026-03/{appId}/flags/{flagName}/portals
        withRawResponse().listPortals(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        FeatureFlagServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val batch: BatchServiceAsync.WithRawResponse by lazy {
            BatchServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): FeatureFlagServiceAsync.WithRawResponse =
            FeatureFlagServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun batch(): BatchServiceAsync.WithRawResponse = batch

        private val updateHandler: Handler<PortalFlagStateResponse> =
            jsonHandler<PortalFlagStateResponse>(clientOptions.jsonMapper)

        override fun update(
            params: FeatureFlagUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PortalFlagStateResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("portalId", params.portalId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "feature-flags",
                        "2026-03",
                        params._pathParam(0),
                        "flags",
                        params._pathParam(1),
                        "portals",
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

        private val deleteHandler: Handler<PortalFlagStateResponse> =
            jsonHandler<PortalFlagStateResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: FeatureFlagDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PortalFlagStateResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("portalId", params.portalId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "feature-flags",
                        "2026-03",
                        params._pathParam(0),
                        "flags",
                        params._pathParam(1),
                        "portals",
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
                        response
                            .use { deleteHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val getHandler: Handler<PortalFlagStateResponse> =
            jsonHandler<PortalFlagStateResponse>(clientOptions.jsonMapper)

        override fun get(
            params: FeatureFlagGetParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PortalFlagStateResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("portalId", params.portalId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "feature-flags",
                        "2026-03",
                        params._pathParam(0),
                        "flags",
                        params._pathParam(1),
                        "portals",
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

        private val listAllHandler: Handler<FlagsForAppResponse> =
            jsonHandler<FlagsForAppResponse>(clientOptions.jsonMapper)

        override fun listAll(
            params: FeatureFlagListAllParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<FlagsForAppResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("appId", params.appId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "feature-flags",
                        "2026-03",
                        params._pathParam(0),
                        "flags",
                        "all",
                    )
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listAllHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val listPortalsHandler: Handler<PortalFlagStateBatchResponse> =
            jsonHandler<PortalFlagStateBatchResponse>(clientOptions.jsonMapper)

        override fun listPortals(
            params: FeatureFlagListPortalsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PortalFlagStateBatchResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("flagName", params.flagName().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "feature-flags",
                        "2026-03",
                        params._pathParam(0),
                        "flags",
                        params._pathParam(1),
                        "portals",
                    )
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listPortalsHandler.handle(it) }
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
