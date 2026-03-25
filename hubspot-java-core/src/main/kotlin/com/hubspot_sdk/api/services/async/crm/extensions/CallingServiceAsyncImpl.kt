// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.crm.extensions

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
import com.hubspot_sdk.api.models.crm.extensions.calling.CallingCreateParams
import com.hubspot_sdk.api.models.crm.extensions.calling.CallingDeleteParams
import com.hubspot_sdk.api.models.crm.extensions.calling.CallingGetParams
import com.hubspot_sdk.api.models.crm.extensions.calling.CallingMarkReadyParams
import com.hubspot_sdk.api.models.crm.extensions.calling.CallingUpdateParams
import com.hubspot_sdk.api.models.crm.extensions.calling.RecordingSettingsResponse
import com.hubspot_sdk.api.services.async.crm.extensions.calling.TranscriptServiceAsync
import com.hubspot_sdk.api.services.async.crm.extensions.calling.TranscriptServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class CallingServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    CallingServiceAsync {

    private val withRawResponse: CallingServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val transcripts: TranscriptServiceAsync by lazy {
        TranscriptServiceAsyncImpl(clientOptions)
    }

    override fun withRawResponse(): CallingServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): CallingServiceAsync =
        CallingServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun transcripts(): TranscriptServiceAsync = transcripts

    override fun create(
        params: CallingCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<RecordingSettingsResponse> =
        // post /crm/extensions/calling/2026-03/{appId}/settings/recording
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: CallingUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<RecordingSettingsResponse> =
        // patch /crm/extensions/calling/2026-03/{appId}/settings/recording
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: CallingDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // delete /crm/extensions/calling/2026-03/{appId}/settings/channel-connection
        withRawResponse().delete(params, requestOptions).thenAccept {}

    override fun get(
        params: CallingGetParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<RecordingSettingsResponse> =
        // get /crm/extensions/calling/2026-03/{appId}/settings/recording
        withRawResponse().get(params, requestOptions).thenApply { it.parse() }

    override fun markReady(
        params: CallingMarkReadyParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // post /crm/extensions/calling/2026-03/recordings/ready
        withRawResponse().markReady(params, requestOptions).thenAccept {}

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CallingServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val transcripts: TranscriptServiceAsync.WithRawResponse by lazy {
            TranscriptServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CallingServiceAsync.WithRawResponse =
            CallingServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun transcripts(): TranscriptServiceAsync.WithRawResponse = transcripts

        private val createHandler: Handler<RecordingSettingsResponse> =
            jsonHandler<RecordingSettingsResponse>(clientOptions.jsonMapper)

        override fun create(
            params: CallingCreateParams,
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
                        "extensions",
                        "calling",
                        "2026-03",
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
            params: CallingUpdateParams,
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
                        "extensions",
                        "calling",
                        "2026-03",
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

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: CallingDeleteParams,
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
                        "extensions",
                        "calling",
                        "2026-03",
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

        private val getHandler: Handler<RecordingSettingsResponse> =
            jsonHandler<RecordingSettingsResponse>(clientOptions.jsonMapper)

        override fun get(
            params: CallingGetParams,
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
                        "extensions",
                        "calling",
                        "2026-03",
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
            params: CallingMarkReadyParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "crm",
                        "extensions",
                        "calling",
                        "2026-03",
                        "recordings",
                        "ready",
                    )
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
