// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.async.crm.extensions

import com.hubspot.sdk.core.ClientOptions
import com.hubspot.sdk.core.RequestOptions
import com.hubspot.sdk.core.checkRequired
import com.hubspot.sdk.core.handlers.emptyHandler
import com.hubspot.sdk.core.handlers.errorBodyHandler
import com.hubspot.sdk.core.handlers.errorHandler
import com.hubspot.sdk.core.handlers.jsonHandler
import com.hubspot.sdk.core.http.HttpMethod
import com.hubspot.sdk.core.http.HttpRequest
import com.hubspot.sdk.core.http.HttpResponse
import com.hubspot.sdk.core.http.HttpResponse.Handler
import com.hubspot.sdk.core.http.HttpResponseFor
import com.hubspot.sdk.core.http.json
import com.hubspot.sdk.core.http.parseable
import com.hubspot.sdk.core.prepareAsync
import com.hubspot.sdk.models.crm.extensions.calling.CallingCreateChannelConnectionSettingsParams
import com.hubspot.sdk.models.crm.extensions.calling.CallingCreateInboundCallParams
import com.hubspot.sdk.models.crm.extensions.calling.CallingCreateRecordingReadyParams
import com.hubspot.sdk.models.crm.extensions.calling.CallingCreateRecordingSettingsParams
import com.hubspot.sdk.models.crm.extensions.calling.CallingCreateSettingsParams
import com.hubspot.sdk.models.crm.extensions.calling.CallingDeleteChannelConnectionSettingsParams
import com.hubspot.sdk.models.crm.extensions.calling.CallingDeleteSettingsParams
import com.hubspot.sdk.models.crm.extensions.calling.CallingGetChannelConnectionSettingsParams
import com.hubspot.sdk.models.crm.extensions.calling.CallingGetRecordingSettingsParams
import com.hubspot.sdk.models.crm.extensions.calling.CallingGetSettingsParams
import com.hubspot.sdk.models.crm.extensions.calling.CallingUpdateChannelConnectionSettingsParams
import com.hubspot.sdk.models.crm.extensions.calling.CallingUpdateRecordingSettingsParams
import com.hubspot.sdk.models.crm.extensions.calling.CallingUpdateSettingsParams
import com.hubspot.sdk.models.crm.extensions.calling.ChannelConnectionSettingsResponse
import com.hubspot.sdk.models.crm.extensions.calling.CompletedThirdPartyCallResponse
import com.hubspot.sdk.models.crm.extensions.calling.RecordingSettingsResponse
import com.hubspot.sdk.models.crm.extensions.calling.SettingsResponse
import com.hubspot.sdk.services.async.crm.extensions.calling.TranscriptServiceAsync
import com.hubspot.sdk.services.async.crm.extensions.calling.TranscriptServiceAsyncImpl
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

    override fun createChannelConnectionSettings(
        params: CallingCreateChannelConnectionSettingsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ChannelConnectionSettingsResponse> =
        // post /crm/extensions/calling/2026-03/{appId}/settings/channel-connection
        withRawResponse().createChannelConnectionSettings(params, requestOptions).thenApply {
            it.parse()
        }

    override fun createInboundCall(
        params: CallingCreateInboundCallParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CompletedThirdPartyCallResponse> =
        // post /crm/extensions/calling/2026-03/inbound-call
        withRawResponse().createInboundCall(params, requestOptions).thenApply { it.parse() }

    override fun createRecordingReady(
        params: CallingCreateRecordingReadyParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // post /crm/extensions/calling/2026-03/recordings/ready
        withRawResponse().createRecordingReady(params, requestOptions).thenAccept {}

    override fun createRecordingSettings(
        params: CallingCreateRecordingSettingsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<RecordingSettingsResponse> =
        // post /crm/extensions/calling/2026-03/{appId}/settings/recording
        withRawResponse().createRecordingSettings(params, requestOptions).thenApply { it.parse() }

    override fun createSettings(
        params: CallingCreateSettingsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<SettingsResponse> =
        // post /crm/extensions/calling/2026-03/{appId}/settings
        withRawResponse().createSettings(params, requestOptions).thenApply { it.parse() }

    override fun deleteChannelConnectionSettings(
        params: CallingDeleteChannelConnectionSettingsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // delete /crm/extensions/calling/2026-03/{appId}/settings/channel-connection
        withRawResponse().deleteChannelConnectionSettings(params, requestOptions).thenAccept {}

    override fun deleteSettings(
        params: CallingDeleteSettingsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // delete /crm/extensions/calling/2026-03/{appId}/settings
        withRawResponse().deleteSettings(params, requestOptions).thenAccept {}

    override fun getChannelConnectionSettings(
        params: CallingGetChannelConnectionSettingsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ChannelConnectionSettingsResponse> =
        // get /crm/extensions/calling/2026-03/{appId}/settings/channel-connection
        withRawResponse().getChannelConnectionSettings(params, requestOptions).thenApply {
            it.parse()
        }

    override fun getRecordingSettings(
        params: CallingGetRecordingSettingsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<RecordingSettingsResponse> =
        // get /crm/extensions/calling/2026-03/{appId}/settings/recording
        withRawResponse().getRecordingSettings(params, requestOptions).thenApply { it.parse() }

    override fun getSettings(
        params: CallingGetSettingsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<SettingsResponse> =
        // get /crm/extensions/calling/2026-03/{appId}/settings
        withRawResponse().getSettings(params, requestOptions).thenApply { it.parse() }

    override fun updateChannelConnectionSettings(
        params: CallingUpdateChannelConnectionSettingsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ChannelConnectionSettingsResponse> =
        // patch /crm/extensions/calling/2026-03/{appId}/settings/channel-connection
        withRawResponse().updateChannelConnectionSettings(params, requestOptions).thenApply {
            it.parse()
        }

    override fun updateRecordingSettings(
        params: CallingUpdateRecordingSettingsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<RecordingSettingsResponse> =
        // patch /crm/extensions/calling/2026-03/{appId}/settings/recording
        withRawResponse().updateRecordingSettings(params, requestOptions).thenApply { it.parse() }

    override fun updateSettings(
        params: CallingUpdateSettingsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<SettingsResponse> =
        // patch /crm/extensions/calling/2026-03/{appId}/settings
        withRawResponse().updateSettings(params, requestOptions).thenApply { it.parse() }

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

        private val createChannelConnectionSettingsHandler:
            Handler<ChannelConnectionSettingsResponse> =
            jsonHandler<ChannelConnectionSettingsResponse>(clientOptions.jsonMapper)

        override fun createChannelConnectionSettings(
            params: CallingCreateChannelConnectionSettingsParams,
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
                        "extensions",
                        "calling",
                        "2026-03",
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
                            .use { createChannelConnectionSettingsHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val createInboundCallHandler: Handler<CompletedThirdPartyCallResponse> =
            jsonHandler<CompletedThirdPartyCallResponse>(clientOptions.jsonMapper)

        override fun createInboundCall(
            params: CallingCreateInboundCallParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CompletedThirdPartyCallResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("crm", "extensions", "calling", "2026-03", "inbound-call")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { createInboundCallHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val createRecordingReadyHandler: Handler<Void?> = emptyHandler()

        override fun createRecordingReady(
            params: CallingCreateRecordingReadyParams,
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
                        response.use { createRecordingReadyHandler.handle(it) }
                    }
                }
        }

        private val createRecordingSettingsHandler: Handler<RecordingSettingsResponse> =
            jsonHandler<RecordingSettingsResponse>(clientOptions.jsonMapper)

        override fun createRecordingSettings(
            params: CallingCreateRecordingSettingsParams,
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
                            .use { createRecordingSettingsHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val createSettingsHandler: Handler<SettingsResponse> =
            jsonHandler<SettingsResponse>(clientOptions.jsonMapper)

        override fun createSettings(
            params: CallingCreateSettingsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SettingsResponse>> {
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
                            .use { createSettingsHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val deleteChannelConnectionSettingsHandler: Handler<Void?> = emptyHandler()

        override fun deleteChannelConnectionSettings(
            params: CallingDeleteChannelConnectionSettingsParams,
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
                        response.use { deleteChannelConnectionSettingsHandler.handle(it) }
                    }
                }
        }

        private val deleteSettingsHandler: Handler<Void?> = emptyHandler()

        override fun deleteSettings(
            params: CallingDeleteSettingsParams,
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
                    )
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { deleteSettingsHandler.handle(it) }
                    }
                }
        }

        private val getChannelConnectionSettingsHandler:
            Handler<ChannelConnectionSettingsResponse> =
            jsonHandler<ChannelConnectionSettingsResponse>(clientOptions.jsonMapper)

        override fun getChannelConnectionSettings(
            params: CallingGetChannelConnectionSettingsParams,
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
                        "extensions",
                        "calling",
                        "2026-03",
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
                            .use { getChannelConnectionSettingsHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val getRecordingSettingsHandler: Handler<RecordingSettingsResponse> =
            jsonHandler<RecordingSettingsResponse>(clientOptions.jsonMapper)

        override fun getRecordingSettings(
            params: CallingGetRecordingSettingsParams,
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
                            .use { getRecordingSettingsHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val getSettingsHandler: Handler<SettingsResponse> =
            jsonHandler<SettingsResponse>(clientOptions.jsonMapper)

        override fun getSettings(
            params: CallingGetSettingsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SettingsResponse>> {
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
                    )
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { getSettingsHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val updateChannelConnectionSettingsHandler:
            Handler<ChannelConnectionSettingsResponse> =
            jsonHandler<ChannelConnectionSettingsResponse>(clientOptions.jsonMapper)

        override fun updateChannelConnectionSettings(
            params: CallingUpdateChannelConnectionSettingsParams,
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
                        "extensions",
                        "calling",
                        "2026-03",
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
                            .use { updateChannelConnectionSettingsHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val updateRecordingSettingsHandler: Handler<RecordingSettingsResponse> =
            jsonHandler<RecordingSettingsResponse>(clientOptions.jsonMapper)

        override fun updateRecordingSettings(
            params: CallingUpdateRecordingSettingsParams,
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
                            .use { updateRecordingSettingsHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val updateSettingsHandler: Handler<SettingsResponse> =
            jsonHandler<SettingsResponse>(clientOptions.jsonMapper)

        override fun updateSettings(
            params: CallingUpdateSettingsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SettingsResponse>> {
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
                            .use { updateSettingsHandler.handle(it) }
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
