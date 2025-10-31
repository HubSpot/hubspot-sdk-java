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
import com.hubspot_sdk.api.models.crm.featureflags.apps.AppDeleteParams
import com.hubspot_sdk.api.models.crm.featureflags.apps.AppDeleteResponse
import com.hubspot_sdk.api.models.crm.featureflags.apps.AppGetParams
import com.hubspot_sdk.api.models.crm.featureflags.apps.AppGetResponse
import com.hubspot_sdk.api.models.crm.featureflags.apps.AppListPortalsParams
import com.hubspot_sdk.api.models.crm.featureflags.apps.AppListPortalsResponse
import com.hubspot_sdk.api.models.crm.featureflags.apps.AppUpdateParams
import com.hubspot_sdk.api.models.crm.featureflags.apps.AppUpdateResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class AppServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    AppServiceAsync {

    private val withRawResponse: AppServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): AppServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): AppServiceAsync =
        AppServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun update(
        params: AppUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AppUpdateResponse> =
        // put /feature-flags/v3/{appId}/flags/{flagName}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: AppDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AppDeleteResponse> =
        // delete /feature-flags/v3/{appId}/flags/{flagName}
        withRawResponse().delete(params, requestOptions).thenApply { it.parse() }

    override fun get(
        params: AppGetParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AppGetResponse> =
        // get /feature-flags/v3/{appId}/flags/{flagName}
        withRawResponse().get(params, requestOptions).thenApply { it.parse() }

    override fun listPortals(
        params: AppListPortalsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AppListPortalsResponse> =
        // get /feature-flags/v3/{appId}/flags/{flagName}/portals
        withRawResponse().listPortals(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AppServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AppServiceAsync.WithRawResponse =
            AppServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val updateHandler: Handler<AppUpdateResponse> =
            jsonHandler<AppUpdateResponse>(clientOptions.jsonMapper)

        override fun update(
            params: AppUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AppUpdateResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("flagName", params.flagName().getOrNull())
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

        private val deleteHandler: Handler<AppDeleteResponse> =
            jsonHandler<AppDeleteResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: AppDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AppDeleteResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("flagName", params.flagName().getOrNull())
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

        private val getHandler: Handler<AppGetResponse> =
            jsonHandler<AppGetResponse>(clientOptions.jsonMapper)

        override fun get(
            params: AppGetParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AppGetResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("flagName", params.flagName().getOrNull())
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

        private val listPortalsHandler: Handler<AppListPortalsResponse> =
            jsonHandler<AppListPortalsResponse>(clientOptions.jsonMapper)

        override fun listPortals(
            params: AppListPortalsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AppListPortalsResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("flagName", params.flagName().getOrNull())
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
