// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.blocking.crm.extensions.calling

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
import com.hubspot.sdk.core.prepare
import com.hubspot.sdk.models.crm.extensions.calling.CompletedThirdPartyCallResponse
import com.hubspot.sdk.models.crm.extensions.calling.transcripts.TranscriptCreateInboundCallParams
import com.hubspot.sdk.models.crm.extensions.calling.transcripts.TranscriptCreateParams
import com.hubspot.sdk.models.crm.extensions.calling.transcripts.TranscriptCreateResponse
import com.hubspot.sdk.models.crm.extensions.calling.transcripts.TranscriptDeleteParams
import com.hubspot.sdk.models.crm.extensions.calling.transcripts.TranscriptGetParams
import com.hubspot.sdk.models.crm.extensions.calling.transcripts.TranscriptResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class TranscriptServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    TranscriptService {

    private val withRawResponse: TranscriptService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): TranscriptService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): TranscriptService =
        TranscriptServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: TranscriptCreateParams,
        requestOptions: RequestOptions,
    ): TranscriptCreateResponse =
        // post /crm/extensions/calling/2026-03/transcripts
        withRawResponse().create(params, requestOptions).parse()

    override fun delete(params: TranscriptDeleteParams, requestOptions: RequestOptions) {
        // delete /crm/extensions/calling/2026-03/transcripts/{transcriptId}
        withRawResponse().delete(params, requestOptions)
    }

    override fun createInboundCall(
        params: TranscriptCreateInboundCallParams,
        requestOptions: RequestOptions,
    ): CompletedThirdPartyCallResponse =
        // post /crm/extensions/calling/2026-03/inbound-call
        withRawResponse().createInboundCall(params, requestOptions).parse()

    override fun get(
        params: TranscriptGetParams,
        requestOptions: RequestOptions,
    ): TranscriptResponse =
        // get /crm/extensions/calling/2026-03/transcripts/{transcriptId}
        withRawResponse().get(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        TranscriptService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): TranscriptService.WithRawResponse =
            TranscriptServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<TranscriptCreateResponse> =
            jsonHandler<TranscriptCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: TranscriptCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TranscriptCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("crm", "extensions", "calling", "2026-03", "transcripts")
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

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: TranscriptDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("transcriptId", params.transcriptId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "crm",
                        "extensions",
                        "calling",
                        "2026-03",
                        "transcripts",
                        params._pathParam(0),
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
            params: TranscriptCreateInboundCallParams,
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

        private val getHandler: Handler<TranscriptResponse> =
            jsonHandler<TranscriptResponse>(clientOptions.jsonMapper)

        override fun get(
            params: TranscriptGetParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TranscriptResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("transcriptId", params.transcriptId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "crm",
                        "extensions",
                        "calling",
                        "2026-03",
                        "transcripts",
                        params._pathParam(0),
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
    }
}
