// File generated from our OpenAPI spec by Stainless.

package com.hubspot.services.blocking.crm.extensions

import com.hubspot.core.ClientOptions
import com.hubspot.core.RequestOptions
import com.hubspot.core.checkRequired
import com.hubspot.core.handlers.emptyHandler
import com.hubspot.core.handlers.errorBodyHandler
import com.hubspot.core.handlers.errorHandler
import com.hubspot.core.handlers.jsonHandler
import com.hubspot.core.http.HttpMethod
import com.hubspot.core.http.HttpRequest
import com.hubspot.core.http.HttpResponse
import com.hubspot.core.http.HttpResponse.Handler
import com.hubspot.core.http.HttpResponseFor
import com.hubspot.core.http.json
import com.hubspot.core.http.parseable
import com.hubspot.core.prepare
import com.hubspot.models.crm.extensions.calling.CallingCreateChannelConnectionSettingsParams
import com.hubspot.models.crm.extensions.calling.CallingCreateInboundCallParams
import com.hubspot.models.crm.extensions.calling.CallingCreateRecordingReadyParams
import com.hubspot.models.crm.extensions.calling.CallingCreateRecordingSettingsParams
import com.hubspot.models.crm.extensions.calling.CallingCreateSettingsParams
import com.hubspot.models.crm.extensions.calling.CallingDeleteChannelConnectionSettingsParams
import com.hubspot.models.crm.extensions.calling.CallingDeleteSettingsParams
import com.hubspot.models.crm.extensions.calling.CallingGetChannelConnectionSettingsParams
import com.hubspot.models.crm.extensions.calling.CallingGetRecordingSettingsParams
import com.hubspot.models.crm.extensions.calling.CallingGetSettingsParams
import com.hubspot.models.crm.extensions.calling.CallingUpdateChannelConnectionSettingsParams
import com.hubspot.models.crm.extensions.calling.CallingUpdateRecordingSettingsParams
import com.hubspot.models.crm.extensions.calling.CallingUpdateSettingsParams
import com.hubspot.models.crm.extensions.calling.ChannelConnectionSettingsResponse
import com.hubspot.models.crm.extensions.calling.CompletedThirdPartyCallResponse
import com.hubspot.models.crm.extensions.calling.RecordingSettingsResponse
import com.hubspot.models.crm.extensions.calling.SettingsResponse
import com.hubspot.services.blocking.crm.extensions.calling.TranscriptService
import com.hubspot.services.blocking.crm.extensions.calling.TranscriptServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class CallingServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    CallingService {

    private val withRawResponse: CallingService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val transcripts: TranscriptService by lazy { TranscriptServiceImpl(clientOptions) }

    override fun withRawResponse(): CallingService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): CallingService =
        CallingServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun transcripts(): TranscriptService = transcripts

    override fun createChannelConnectionSettings(
        params: CallingCreateChannelConnectionSettingsParams,
        requestOptions: RequestOptions,
    ): ChannelConnectionSettingsResponse =
        // post /crm/extensions/calling/2026-03/{appId}/settings/channel-connection
        withRawResponse().createChannelConnectionSettings(params, requestOptions).parse()

    override fun createInboundCall(
        params: CallingCreateInboundCallParams,
        requestOptions: RequestOptions,
    ): CompletedThirdPartyCallResponse =
        // post /crm/extensions/calling/2026-03/inbound-call
        withRawResponse().createInboundCall(params, requestOptions).parse()

    override fun createRecordingReady(
        params: CallingCreateRecordingReadyParams,
        requestOptions: RequestOptions,
    ) {
        // post /crm/extensions/calling/2026-03/recordings/ready
        withRawResponse().createRecordingReady(params, requestOptions)
    }

    override fun createRecordingSettings(
        params: CallingCreateRecordingSettingsParams,
        requestOptions: RequestOptions,
    ): RecordingSettingsResponse =
        // post /crm/extensions/calling/2026-03/{appId}/settings/recording
        withRawResponse().createRecordingSettings(params, requestOptions).parse()

    override fun createSettings(
        params: CallingCreateSettingsParams,
        requestOptions: RequestOptions,
    ): SettingsResponse =
        // post /crm/extensions/calling/2026-03/{appId}/settings
        withRawResponse().createSettings(params, requestOptions).parse()

    override fun deleteChannelConnectionSettings(
        params: CallingDeleteChannelConnectionSettingsParams,
        requestOptions: RequestOptions,
    ) {
        // delete /crm/extensions/calling/2026-03/{appId}/settings/channel-connection
        withRawResponse().deleteChannelConnectionSettings(params, requestOptions)
    }

    override fun deleteSettings(
        params: CallingDeleteSettingsParams,
        requestOptions: RequestOptions,
    ) {
        // delete /crm/extensions/calling/2026-03/{appId}/settings
        withRawResponse().deleteSettings(params, requestOptions)
    }

    override fun getChannelConnectionSettings(
        params: CallingGetChannelConnectionSettingsParams,
        requestOptions: RequestOptions,
    ): ChannelConnectionSettingsResponse =
        // get /crm/extensions/calling/2026-03/{appId}/settings/channel-connection
        withRawResponse().getChannelConnectionSettings(params, requestOptions).parse()

    override fun getRecordingSettings(
        params: CallingGetRecordingSettingsParams,
        requestOptions: RequestOptions,
    ): RecordingSettingsResponse =
        // get /crm/extensions/calling/2026-03/{appId}/settings/recording
        withRawResponse().getRecordingSettings(params, requestOptions).parse()

    override fun getSettings(
        params: CallingGetSettingsParams,
        requestOptions: RequestOptions,
    ): SettingsResponse =
        // get /crm/extensions/calling/2026-03/{appId}/settings
        withRawResponse().getSettings(params, requestOptions).parse()

    override fun updateChannelConnectionSettings(
        params: CallingUpdateChannelConnectionSettingsParams,
        requestOptions: RequestOptions,
    ): ChannelConnectionSettingsResponse =
        // patch /crm/extensions/calling/2026-03/{appId}/settings/channel-connection
        withRawResponse().updateChannelConnectionSettings(params, requestOptions).parse()

    override fun updateRecordingSettings(
        params: CallingUpdateRecordingSettingsParams,
        requestOptions: RequestOptions,
    ): RecordingSettingsResponse =
        // patch /crm/extensions/calling/2026-03/{appId}/settings/recording
        withRawResponse().updateRecordingSettings(params, requestOptions).parse()

    override fun updateSettings(
        params: CallingUpdateSettingsParams,
        requestOptions: RequestOptions,
    ): SettingsResponse =
        // patch /crm/extensions/calling/2026-03/{appId}/settings
        withRawResponse().updateSettings(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CallingService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val transcripts: TranscriptService.WithRawResponse by lazy {
            TranscriptServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CallingService.WithRawResponse =
            CallingServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun transcripts(): TranscriptService.WithRawResponse = transcripts

        private val createChannelConnectionSettingsHandler:
            Handler<ChannelConnectionSettingsResponse> =
            jsonHandler<ChannelConnectionSettingsResponse>(clientOptions.jsonMapper)

        override fun createChannelConnectionSettings(
            params: CallingCreateChannelConnectionSettingsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ChannelConnectionSettingsResponse> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createChannelConnectionSettingsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val createInboundCallHandler: Handler<CompletedThirdPartyCallResponse> =
            jsonHandler<CompletedThirdPartyCallResponse>(clientOptions.jsonMapper)

        override fun createInboundCall(
            params: CallingCreateInboundCallParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CompletedThirdPartyCallResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("crm", "extensions", "calling", "2026-03", "inbound-call")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createInboundCallHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val createRecordingReadyHandler: Handler<Void?> = emptyHandler()

        override fun createRecordingReady(
            params: CallingCreateRecordingReadyParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { createRecordingReadyHandler.handle(it) }
            }
        }

        private val createRecordingSettingsHandler: Handler<RecordingSettingsResponse> =
            jsonHandler<RecordingSettingsResponse>(clientOptions.jsonMapper)

        override fun createRecordingSettings(
            params: CallingCreateRecordingSettingsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RecordingSettingsResponse> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createRecordingSettingsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val createSettingsHandler: Handler<SettingsResponse> =
            jsonHandler<SettingsResponse>(clientOptions.jsonMapper)

        override fun createSettings(
            params: CallingCreateSettingsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SettingsResponse> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createSettingsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val deleteChannelConnectionSettingsHandler: Handler<Void?> = emptyHandler()

        override fun deleteChannelConnectionSettings(
            params: CallingDeleteChannelConnectionSettingsParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { deleteChannelConnectionSettingsHandler.handle(it) }
            }
        }

        private val deleteSettingsHandler: Handler<Void?> = emptyHandler()

        override fun deleteSettings(
            params: CallingDeleteSettingsParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { deleteSettingsHandler.handle(it) }
            }
        }

        private val getChannelConnectionSettingsHandler:
            Handler<ChannelConnectionSettingsResponse> =
            jsonHandler<ChannelConnectionSettingsResponse>(clientOptions.jsonMapper)

        override fun getChannelConnectionSettings(
            params: CallingGetChannelConnectionSettingsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ChannelConnectionSettingsResponse> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getChannelConnectionSettingsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val getRecordingSettingsHandler: Handler<RecordingSettingsResponse> =
            jsonHandler<RecordingSettingsResponse>(clientOptions.jsonMapper)

        override fun getRecordingSettings(
            params: CallingGetRecordingSettingsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RecordingSettingsResponse> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getRecordingSettingsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val getSettingsHandler: Handler<SettingsResponse> =
            jsonHandler<SettingsResponse>(clientOptions.jsonMapper)

        override fun getSettings(
            params: CallingGetSettingsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SettingsResponse> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getSettingsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
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
        ): HttpResponseFor<ChannelConnectionSettingsResponse> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { updateChannelConnectionSettingsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val updateRecordingSettingsHandler: Handler<RecordingSettingsResponse> =
            jsonHandler<RecordingSettingsResponse>(clientOptions.jsonMapper)

        override fun updateRecordingSettings(
            params: CallingUpdateRecordingSettingsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RecordingSettingsResponse> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { updateRecordingSettingsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val updateSettingsHandler: Handler<SettingsResponse> =
            jsonHandler<SettingsResponse>(clientOptions.jsonMapper)

        override fun updateSettings(
            params: CallingUpdateSettingsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SettingsResponse> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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
