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
import com.hubspot_sdk.api.models.crm.extensions.calling.CompletedThirdPartyCallResponse
import com.hubspot_sdk.api.models.crm.extensions.calling.transcripts.TranscriptCreateInboundCallParams
import com.hubspot_sdk.api.models.crm.extensions.calling.transcripts.TranscriptCreateParams
import com.hubspot_sdk.api.models.crm.extensions.calling.transcripts.TranscriptCreateResponse
import com.hubspot_sdk.api.models.crm.extensions.calling.transcripts.TranscriptDeleteParams
import com.hubspot_sdk.api.models.crm.extensions.calling.transcripts.TranscriptGetParams
import com.hubspot_sdk.api.models.crm.extensions.calling.transcripts.TranscriptResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class TranscriptServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    TranscriptServiceAsync {

    private val withRawResponse: TranscriptServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): TranscriptServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): TranscriptServiceAsync =
        TranscriptServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: TranscriptCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<TranscriptCreateResponse> =
        // post /crm/extensions/calling/2026-03/transcripts
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: TranscriptDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // delete /crm/extensions/calling/2026-03/transcripts/{transcriptId}
        withRawResponse().delete(params, requestOptions).thenAccept {}

    override fun createInboundCall(
        params: TranscriptCreateInboundCallParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CompletedThirdPartyCallResponse> =
        // post /crm/extensions/calling/2026-03/inbound-call
        withRawResponse().createInboundCall(params, requestOptions).thenApply { it.parse() }

    override fun get(
        params: TranscriptGetParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<TranscriptResponse> =
        // get /crm/extensions/calling/2026-03/transcripts/{transcriptId}
        withRawResponse().get(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        TranscriptServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): TranscriptServiceAsync.WithRawResponse =
            TranscriptServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<TranscriptCreateResponse> =
            jsonHandler<TranscriptCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: TranscriptCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TranscriptCreateResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("crm", "extensions", "calling", "2026-03", "transcripts")
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

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: TranscriptDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
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

        private val createInboundCallHandler: Handler<CompletedThirdPartyCallResponse> =
            jsonHandler<CompletedThirdPartyCallResponse>(clientOptions.jsonMapper)

        override fun createInboundCall(
            params: TranscriptCreateInboundCallParams,
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

        private val getHandler: Handler<TranscriptResponse> =
            jsonHandler<TranscriptResponse>(clientOptions.jsonMapper)

        override fun get(
            params: TranscriptGetParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TranscriptResponse>> {
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
