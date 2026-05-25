// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.blocking.webhooksjournal

import com.hubspot.sdk.core.ClientOptions
import com.hubspot.sdk.core.RequestOptions
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
import com.hubspot.sdk.models.CrmObjectSnapshotBatchResponse
import com.hubspot.sdk.models.webhooksjournal.snapshots.SnapshotCreateParams
import java.util.function.Consumer

class SnapshotServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    SnapshotService {

    private val withRawResponse: SnapshotService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): SnapshotService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): SnapshotService =
        SnapshotServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: SnapshotCreateParams,
        requestOptions: RequestOptions,
    ): CrmObjectSnapshotBatchResponse =
        // post /webhooks-journal/snapshots/2026-03/crm
        withRawResponse().create(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        SnapshotService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SnapshotService.WithRawResponse =
            SnapshotServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<CrmObjectSnapshotBatchResponse> =
            jsonHandler<CrmObjectSnapshotBatchResponse>(clientOptions.jsonMapper)

        override fun create(
            params: SnapshotCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CrmObjectSnapshotBatchResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("webhooks-journal", "snapshots", "2026-03", "crm")
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
    }
}
