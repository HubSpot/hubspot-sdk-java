// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.crm.featureflags

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
import com.hubspot_sdk.api.models.crm.featureflags.portals.PortalBatchDeleteParams
import com.hubspot_sdk.api.models.crm.featureflags.portals.PortalBatchDeleteResponse
import com.hubspot_sdk.api.models.crm.featureflags.portals.PortalBatchUpsertParams
import com.hubspot_sdk.api.models.crm.featureflags.portals.PortalBatchUpsertResponse
import com.hubspot_sdk.api.models.crm.featureflags.portals.PortalDeleteParams
import com.hubspot_sdk.api.models.crm.featureflags.portals.PortalDeleteResponse
import com.hubspot_sdk.api.models.crm.featureflags.portals.PortalGetParams
import com.hubspot_sdk.api.models.crm.featureflags.portals.PortalGetResponse
import com.hubspot_sdk.api.models.crm.featureflags.portals.PortalUpdateParams
import com.hubspot_sdk.api.models.crm.featureflags.portals.PortalUpdateResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class PortalServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    PortalServiceAsync {

    private val withRawResponse: PortalServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): PortalServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): PortalServiceAsync =
        PortalServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun update(
        params: PortalUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PortalUpdateResponse> =
        // put /feature-flags/v3/{appId}/flags/{flagName}/portals/{portalId}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: PortalDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PortalDeleteResponse> =
        // delete /feature-flags/v3/{appId}/flags/{flagName}/portals/{portalId}
        withRawResponse().delete(params, requestOptions).thenApply { it.parse() }

    override fun batchDelete(
        params: PortalBatchDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PortalBatchDeleteResponse> =
        // post /feature-flags/v3/{appId}/flags/{flagName}/portals/batch/delete
        withRawResponse().batchDelete(params, requestOptions).thenApply { it.parse() }

    override fun batchUpsert(
        params: PortalBatchUpsertParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PortalBatchUpsertResponse> =
        // post /feature-flags/v3/{appId}/flags/{flagName}/portals/batch/upsert
        withRawResponse().batchUpsert(params, requestOptions).thenApply { it.parse() }

    override fun get(
        params: PortalGetParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PortalGetResponse> =
        // get /feature-flags/v3/{appId}/flags/{flagName}/portals/{portalId}
        withRawResponse().get(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PortalServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PortalServiceAsync.WithRawResponse =
            PortalServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val updateHandler: Handler<PortalUpdateResponse> =
            jsonHandler<PortalUpdateResponse>(clientOptions.jsonMapper)

        override fun update(
            params: PortalUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PortalUpdateResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("portalId", params.portalId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "feature-flags",
                        "v3",
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

        private val deleteHandler: Handler<PortalDeleteResponse> =
            jsonHandler<PortalDeleteResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: PortalDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PortalDeleteResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("portalId", params.portalId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "feature-flags",
                        "v3",
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

        private val batchDeleteHandler: Handler<PortalBatchDeleteResponse> =
            jsonHandler<PortalBatchDeleteResponse>(clientOptions.jsonMapper)

        override fun batchDelete(
            params: PortalBatchDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PortalBatchDeleteResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("flagName", params.flagName().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "feature-flags",
                        "v3",
                        params._pathParam(0),
                        "flags",
                        params._pathParam(1),
                        "portals",
                        "batch",
                        "delete",
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
                            .use { batchDeleteHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val batchUpsertHandler: Handler<PortalBatchUpsertResponse> =
            jsonHandler<PortalBatchUpsertResponse>(clientOptions.jsonMapper)

        override fun batchUpsert(
            params: PortalBatchUpsertParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PortalBatchUpsertResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("flagName", params.flagName().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "feature-flags",
                        "v3",
                        params._pathParam(0),
                        "flags",
                        params._pathParam(1),
                        "portals",
                        "batch",
                        "upsert",
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
                            .use { batchUpsertHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val getHandler: Handler<PortalGetResponse> =
            jsonHandler<PortalGetResponse>(clientOptions.jsonMapper)

        override fun get(
            params: PortalGetParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PortalGetResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("portalId", params.portalId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "feature-flags",
                        "v3",
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
    }
}
