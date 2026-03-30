// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.crm.extensions

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
import com.hubspot_sdk.api.core.prepare
import com.hubspot_sdk.api.models.crm.extensions.calling.CallingCreateInboundCallParams
import com.hubspot_sdk.api.models.crm.extensions.calling.CallingCreateParams
import com.hubspot_sdk.api.models.crm.extensions.calling.CallingDeleteParams
import com.hubspot_sdk.api.models.crm.extensions.calling.CallingGetParams
import com.hubspot_sdk.api.models.crm.extensions.calling.CallingMarkReadyParams
import com.hubspot_sdk.api.models.crm.extensions.calling.CallingUpdateParams
import com.hubspot_sdk.api.models.crm.extensions.calling.CompletedThirdPartyCallResponse
import com.hubspot_sdk.api.models.crm.extensions.calling.RecordingSettingsResponse
import com.hubspot_sdk.api.services.blocking.crm.extensions.calling.TranscriptService
import com.hubspot_sdk.api.services.blocking.crm.extensions.calling.TranscriptServiceImpl
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

    override fun create(
        params: CallingCreateParams,
        requestOptions: RequestOptions,
    ): RecordingSettingsResponse =
        // post /crm/extensions/calling/2026-03/{appId}/settings/recording
        withRawResponse().create(params, requestOptions).parse()

    override fun update(
        params: CallingUpdateParams,
        requestOptions: RequestOptions,
    ): RecordingSettingsResponse =
        // patch /crm/extensions/calling/2026-03/{appId}/settings/recording
        withRawResponse().update(params, requestOptions).parse()

    override fun delete(params: CallingDeleteParams, requestOptions: RequestOptions) {
        // delete /crm/extensions/calling/2026-03/{appId}/settings/channel-connection
        withRawResponse().delete(params, requestOptions)
    }

    override fun createInboundCall(
        params: CallingCreateInboundCallParams,
        requestOptions: RequestOptions,
    ): CompletedThirdPartyCallResponse =
        // post /crm/extensions/calling/2026-03/inbound-call
        withRawResponse().createInboundCall(params, requestOptions).parse()

    override fun get(
        params: CallingGetParams,
        requestOptions: RequestOptions,
    ): RecordingSettingsResponse =
        // get /crm/extensions/calling/2026-03/{appId}/settings/recording
        withRawResponse().get(params, requestOptions).parse()

    override fun markReady(params: CallingMarkReadyParams, requestOptions: RequestOptions) {
        // post /crm/extensions/calling/2026-03/recordings/ready
        withRawResponse().markReady(params, requestOptions)
    }

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

        private val createHandler: Handler<RecordingSettingsResponse> =
            jsonHandler<RecordingSettingsResponse>(clientOptions.jsonMapper)

        override fun create(
            params: CallingCreateParams,
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
                    .use { createHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val updateHandler: Handler<RecordingSettingsResponse> =
            jsonHandler<RecordingSettingsResponse>(clientOptions.jsonMapper)

        override fun update(
            params: CallingUpdateParams,
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
                    .use { updateHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: CallingDeleteParams,
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
                response.use { deleteHandler.handle(it) }
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

        private val getHandler: Handler<RecordingSettingsResponse> =
            jsonHandler<RecordingSettingsResponse>(clientOptions.jsonMapper)

        override fun get(
            params: CallingGetParams,
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
                    .use { getHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val markReadyHandler: Handler<Void?> = emptyHandler()

        override fun markReady(
            params: CallingMarkReadyParams,
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
                response.use { markReadyHandler.handle(it) }
            }
        }
    }
}
