// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.blocking.webhooksjournal

import com.hubspot.sdk.core.ClientOptions
import com.hubspot.sdk.core.RequestOptions
import com.hubspot.sdk.core.checkRequired
import com.hubspot.sdk.core.handlers.errorBodyHandler
import com.hubspot.sdk.core.handlers.errorHandler
import com.hubspot.sdk.core.handlers.jsonHandler
import com.hubspot.sdk.core.http.HttpMethod
import com.hubspot.sdk.core.http.HttpRequest
import com.hubspot.sdk.core.http.HttpResponse
import com.hubspot.sdk.core.http.HttpResponse.Handler
import com.hubspot.sdk.core.http.HttpResponseFor
import com.hubspot.sdk.core.http.parseable
import com.hubspot.sdk.core.prepare
import com.hubspot.sdk.models.SnapshotStatusResponse
import com.hubspot.sdk.models.webhooksjournal.journal.JournalGetEarliestParams
import com.hubspot.sdk.models.webhooksjournal.journal.JournalGetNextFromOffsetParams
import com.hubspot.sdk.models.webhooksjournal.journal.JournalGetStatusParams
import com.hubspot.sdk.services.blocking.webhooksjournal.journal.BatchService
import com.hubspot.sdk.services.blocking.webhooksjournal.journal.BatchServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class JournalServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    JournalService {

    private val withRawResponse: JournalService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val batch: BatchService by lazy { BatchServiceImpl(clientOptions) }

    override fun withRawResponse(): JournalService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): JournalService =
        JournalServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun batch(): BatchService = batch

    override fun getEarliest(
        params: JournalGetEarliestParams,
        requestOptions: RequestOptions,
    ): HttpResponse =
        // get /webhooks-journal/journal/2026-03/earliest
        withRawResponse().getEarliest(params, requestOptions)

    override fun getNextFromOffset(
        params: JournalGetNextFromOffsetParams,
        requestOptions: RequestOptions,
    ): HttpResponse =
        // get /webhooks-journal/journal/2026-03/offset/{offset}/next
        withRawResponse().getNextFromOffset(params, requestOptions)

    override fun getStatus(
        params: JournalGetStatusParams,
        requestOptions: RequestOptions,
    ): SnapshotStatusResponse =
        // get /webhooks-journal/journal/2026-03/status/{statusId}
        withRawResponse().getStatus(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        JournalService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val batch: BatchService.WithRawResponse by lazy {
            BatchServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): JournalService.WithRawResponse =
            JournalServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun batch(): BatchService.WithRawResponse = batch

        override fun getEarliest(
            params: JournalGetEarliestParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("webhooks-journal", "journal", "2026-03", "earliest")
                    .putHeader("Accept", "*/*")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response)
        }

        override fun getNextFromOffset(
            params: JournalGetNextFromOffsetParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("offset", params.offset().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "webhooks-journal",
                        "journal",
                        "2026-03",
                        "offset",
                        params._pathParam(0),
                        "next",
                    )
                    .putHeader("Accept", "*/*")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response)
        }

        private val getStatusHandler: Handler<SnapshotStatusResponse> =
            jsonHandler<SnapshotStatusResponse>(clientOptions.jsonMapper)

        override fun getStatus(
            params: JournalGetStatusParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SnapshotStatusResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("statusId", params.statusId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "webhooks-journal",
                        "journal",
                        "2026-03",
                        "status",
                        params._pathParam(0),
                    )
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getStatusHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
