// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.crm.extensions.calling

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.core.handlers.emptyHandler
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
import com.hubspot_sdk.api.models.crm.extensions.calling.ChannelConnectionSettingsResponse
import com.hubspot_sdk.api.models.crm.extensions.calling.channelconnectionsettings.ChannelConnectionSettingCreateParams
import com.hubspot_sdk.api.models.crm.extensions.calling.channelconnectionsettings.ChannelConnectionSettingDeleteParams
import com.hubspot_sdk.api.models.crm.extensions.calling.channelconnectionsettings.ChannelConnectionSettingGetParams
import com.hubspot_sdk.api.models.crm.extensions.calling.channelconnectionsettings.ChannelConnectionSettingUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class ChannelConnectionSettingServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) :
    ChannelConnectionSettingServiceAsync {

    private val withRawResponse: ChannelConnectionSettingServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ChannelConnectionSettingServiceAsync.WithRawResponse =
        withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): ChannelConnectionSettingServiceAsync =
        ChannelConnectionSettingServiceAsyncImpl(
            clientOptions.toBuilder().apply(modifier::accept).build()
        )

    override fun create(
        params: ChannelConnectionSettingCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ChannelConnectionSettingsResponse> =
        // post /crm/v3/extensions/calling/{appId}/settings/channel-connection
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: ChannelConnectionSettingUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ChannelConnectionSettingsResponse> =
        // patch /crm/v3/extensions/calling/{appId}/settings/channel-connection
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: ChannelConnectionSettingDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // delete /crm/v3/extensions/calling/{appId}/settings/channel-connection
        withRawResponse().delete(params, requestOptions).thenAccept {}

    override fun get(
        params: ChannelConnectionSettingGetParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ChannelConnectionSettingsResponse> =
        // get /crm/v3/extensions/calling/{appId}/settings/channel-connection
        withRawResponse().get(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ChannelConnectionSettingServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ChannelConnectionSettingServiceAsync.WithRawResponse =
            ChannelConnectionSettingServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<ChannelConnectionSettingsResponse> =
            jsonHandler<ChannelConnectionSettingsResponse>(clientOptions.jsonMapper)

        override fun create(
            params: ChannelConnectionSettingCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ChannelConnectionSettingsResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("appId", params.appId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "crm",
                        "v3",
                        "extensions",
                        "calling",
                        params._pathParam(0),
                        "settings",
                        "channel-connection",
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
                            .use { createHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val updateHandler: Handler<ChannelConnectionSettingsResponse> =
            jsonHandler<ChannelConnectionSettingsResponse>(clientOptions.jsonMapper)

        override fun update(
            params: ChannelConnectionSettingUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ChannelConnectionSettingsResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("appId", params.appId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "crm",
                        "v3",
                        "extensions",
                        "calling",
                        params._pathParam(0),
                        "settings",
                        "channel-connection",
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

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: ChannelConnectionSettingDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("appId", params.appId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "crm",
                        "v3",
                        "extensions",
                        "calling",
                        params._pathParam(0),
                        "settings",
                        "channel-connection",
                    )
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { deleteHandler.handle(it) }
                    }
                }
        }

        private val getHandler: Handler<ChannelConnectionSettingsResponse> =
            jsonHandler<ChannelConnectionSettingsResponse>(clientOptions.jsonMapper)

        override fun get(
            params: ChannelConnectionSettingGetParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ChannelConnectionSettingsResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("appId", params.appId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "crm",
                        "v3",
                        "extensions",
                        "calling",
                        params._pathParam(0),
                        "settings",
                        "channel-connection",
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
