// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.crm.extensions.calling

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
import com.hubspot_sdk.api.models.crm.extensions.calling.transcripts.TranscriptCreateParams
import com.hubspot_sdk.api.models.crm.extensions.calling.transcripts.TranscriptCreateResponse
import com.hubspot_sdk.api.models.crm.extensions.calling.transcripts.TranscriptDeleteParams
import com.hubspot_sdk.api.models.crm.extensions.calling.transcripts.TranscriptGetParams
import com.hubspot_sdk.api.models.crm.extensions.calling.transcripts.TranscriptResponse
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
        // post /crm/v3/extensions/calling/transcripts
        withRawResponse().create(params, requestOptions).parse()

    override fun delete(params: TranscriptDeleteParams, requestOptions: RequestOptions) {
        // delete /crm/v3/extensions/calling/transcripts/{transcriptId}
        withRawResponse().delete(params, requestOptions)
    }

    override fun get(
        params: TranscriptGetParams,
        requestOptions: RequestOptions,
    ): TranscriptResponse =
        // get /crm/v3/extensions/calling/transcripts/{transcriptId}
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
                    .addPathSegments("crm", "v3", "extensions", "calling", "transcripts")
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
                        "v3",
                        "extensions",
                        "calling",
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
                        "v3",
                        "extensions",
                        "calling",
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
