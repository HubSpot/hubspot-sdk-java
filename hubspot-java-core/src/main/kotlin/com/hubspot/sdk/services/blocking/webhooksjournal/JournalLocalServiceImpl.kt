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
import com.hubspot.sdk.models.webhooksjournal.journallocal.JournalLocalGetEarliestParams
import com.hubspot.sdk.models.webhooksjournal.journallocal.JournalLocalGetLatestParams
import com.hubspot.sdk.models.webhooksjournal.journallocal.JournalLocalGetNextFromOffsetParams
import com.hubspot.sdk.models.webhooksjournal.journallocal.JournalLocalGetStatusParams
import com.hubspot.sdk.services.blocking.webhooksjournal.journallocal.BatchService
import com.hubspot.sdk.services.blocking.webhooksjournal.journallocal.BatchServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class JournalLocalServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    JournalLocalService {

    private val withRawResponse: JournalLocalService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val batch: BatchService by lazy { BatchServiceImpl(clientOptions) }

    override fun withRawResponse(): JournalLocalService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): JournalLocalService =
        JournalLocalServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun batch(): BatchService = batch

    override fun getEarliest(
        params: JournalLocalGetEarliestParams,
        requestOptions: RequestOptions,
    ): HttpResponse =
        // get /webhooks-journal/journal-local/2026-03/earliest
        withRawResponse().getEarliest(params, requestOptions)

    override fun getLatest(
        params: JournalLocalGetLatestParams,
        requestOptions: RequestOptions,
    ): HttpResponse =
        // get /webhooks-journal/journal/2026-03/latest
        withRawResponse().getLatest(params, requestOptions)

    override fun getNextFromOffset(
        params: JournalLocalGetNextFromOffsetParams,
        requestOptions: RequestOptions,
    ): HttpResponse =
        // get /webhooks-journal/journal-local/2026-03/offset/{offset}/next
        withRawResponse().getNextFromOffset(params, requestOptions)

    override fun getStatus(
        params: JournalLocalGetStatusParams,
        requestOptions: RequestOptions,
    ): SnapshotStatusResponse =
        // get /webhooks-journal/journal-local/2026-03/status/{statusId}
        withRawResponse().getStatus(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        JournalLocalService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val batch: BatchService.WithRawResponse by lazy {
            BatchServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): JournalLocalService.WithRawResponse =
            JournalLocalServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun batch(): BatchService.WithRawResponse = batch

        override fun getEarliest(
            params: JournalLocalGetEarliestParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("webhooks-journal", "journal-local", "2026-03", "earliest")
                    .putHeader("Accept", "*/*")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response)
        }

        override fun getLatest(
            params: JournalLocalGetLatestParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("webhooks-journal", "journal", "2026-03", "latest")
                    .putHeader("Accept", "*/*")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response)
        }

        override fun getNextFromOffset(
            params: JournalLocalGetNextFromOffsetParams,
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
                        "journal-local",
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
            params: JournalLocalGetStatusParams,
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
                        "journal-local",
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
