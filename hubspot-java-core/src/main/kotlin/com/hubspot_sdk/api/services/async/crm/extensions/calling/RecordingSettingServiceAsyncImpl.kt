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
import com.hubspot_sdk.api.models.crm.extensions.calling.RecordingSettingsResponse
import com.hubspot_sdk.api.models.crm.extensions.calling.recordingsettings.RecordingSettingCreateParams
import com.hubspot_sdk.api.models.crm.extensions.calling.recordingsettings.RecordingSettingGetParams
import com.hubspot_sdk.api.models.crm.extensions.calling.recordingsettings.RecordingSettingMarkReadyParams
import com.hubspot_sdk.api.models.crm.extensions.calling.recordingsettings.RecordingSettingUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class RecordingSettingServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : RecordingSettingServiceAsync {

    private val withRawResponse: RecordingSettingServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): RecordingSettingServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): RecordingSettingServiceAsync =
        RecordingSettingServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: RecordingSettingCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<RecordingSettingsResponse> =
        // post /crm/v3/extensions/calling/{appId}/settings/recording
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: RecordingSettingUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<RecordingSettingsResponse> =
        // patch /crm/v3/extensions/calling/{appId}/settings/recording
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun get(
        params: RecordingSettingGetParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<RecordingSettingsResponse> =
        // get /crm/v3/extensions/calling/{appId}/settings/recording
        withRawResponse().get(params, requestOptions).thenApply { it.parse() }

    override fun markReady(
        params: RecordingSettingMarkReadyParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // post /crm/v3/extensions/calling/recordings/ready
        withRawResponse().markReady(params, requestOptions).thenAccept {}

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        RecordingSettingServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): RecordingSettingServiceAsync.WithRawResponse =
            RecordingSettingServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<RecordingSettingsResponse> =
            jsonHandler<RecordingSettingsResponse>(clientOptions.jsonMapper)

        override fun create(
            params: RecordingSettingCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<RecordingSettingsResponse>> {
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
                        "recording",
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

        private val updateHandler: Handler<RecordingSettingsResponse> =
            jsonHandler<RecordingSettingsResponse>(clientOptions.jsonMapper)

        override fun update(
            params: RecordingSettingUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<RecordingSettingsResponse>> {
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
                        "recording",
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

        private val getHandler: Handler<RecordingSettingsResponse> =
            jsonHandler<RecordingSettingsResponse>(clientOptions.jsonMapper)

        override fun get(
            params: RecordingSettingGetParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<RecordingSettingsResponse>> {
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
                        "recording",
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

        private val markReadyHandler: Handler<Void?> = emptyHandler()

        override fun markReady(
            params: RecordingSettingMarkReadyParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("crm", "v3", "extensions", "calling", "recordings", "ready")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { markReadyHandler.handle(it) }
                    }
                }
        }
    }
}
