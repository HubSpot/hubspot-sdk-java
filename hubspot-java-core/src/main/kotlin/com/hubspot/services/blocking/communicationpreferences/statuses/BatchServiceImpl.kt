// File generated from our OpenAPI spec by Stainless.

package com.hubspot.services.blocking.communicationpreferences.statuses

import com.hubspot.core.ClientOptions
import com.hubspot.core.RequestOptions
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
import com.hubspot.models.communicationpreferences.BatchResponsePublicBulkOptOutFromAllResponse
import com.hubspot.models.communicationpreferences.BatchResponsePublicStatus
import com.hubspot.models.communicationpreferences.BatchResponsePublicStatusBulkResponse
import com.hubspot.models.communicationpreferences.BatchResponsePublicWideStatusBulkResponse
import com.hubspot.models.communicationpreferences.statuses.batch.BatchGetUnsubscribeAllStatusesParams
import com.hubspot.models.communicationpreferences.statuses.batch.BatchReadParams
import com.hubspot.models.communicationpreferences.statuses.batch.BatchUnsubscribeAllParams
import com.hubspot.models.communicationpreferences.statuses.batch.BatchUpdateStatusesParams
import java.util.function.Consumer

class BatchServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    BatchService {

    private val withRawResponse: BatchService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): BatchService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): BatchService =
        BatchServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun getUnsubscribeAllStatuses(
        params: BatchGetUnsubscribeAllStatusesParams,
        requestOptions: RequestOptions,
    ): BatchResponsePublicWideStatusBulkResponse =
        // post /communication-preferences/2026-03/statuses/batch/unsubscribe-all/read
        withRawResponse().getUnsubscribeAllStatuses(params, requestOptions).parse()

    override fun read(
        params: BatchReadParams,
        requestOptions: RequestOptions,
    ): BatchResponsePublicStatusBulkResponse =
        // post /communication-preferences/2026-03/statuses/batch/read
        withRawResponse().read(params, requestOptions).parse()

    override fun unsubscribeAll(
        params: BatchUnsubscribeAllParams,
        requestOptions: RequestOptions,
    ): BatchResponsePublicBulkOptOutFromAllResponse =
        // post /communication-preferences/2026-03/statuses/batch/unsubscribe-all
        withRawResponse().unsubscribeAll(params, requestOptions).parse()

    override fun updateStatuses(
        params: BatchUpdateStatusesParams,
        requestOptions: RequestOptions,
    ): BatchResponsePublicStatus =
        // post /communication-preferences/2026-03/statuses/batch/write
        withRawResponse().updateStatuses(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        BatchService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): BatchService.WithRawResponse =
            BatchServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val getUnsubscribeAllStatusesHandler:
            Handler<BatchResponsePublicWideStatusBulkResponse> =
            jsonHandler<BatchResponsePublicWideStatusBulkResponse>(clientOptions.jsonMapper)

        override fun getUnsubscribeAllStatuses(
            params: BatchGetUnsubscribeAllStatusesParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BatchResponsePublicWideStatusBulkResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "communication-preferences",
                        "2026-03",
                        "statuses",
                        "batch",
                        "unsubscribe-all",
                        "read",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getUnsubscribeAllStatusesHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val readHandler: Handler<BatchResponsePublicStatusBulkResponse> =
            jsonHandler<BatchResponsePublicStatusBulkResponse>(clientOptions.jsonMapper)

        override fun read(
            params: BatchReadParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BatchResponsePublicStatusBulkResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "communication-preferences",
                        "2026-03",
                        "statuses",
                        "batch",
                        "read",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { readHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val unsubscribeAllHandler: Handler<BatchResponsePublicBulkOptOutFromAllResponse> =
            jsonHandler<BatchResponsePublicBulkOptOutFromAllResponse>(clientOptions.jsonMapper)

        override fun unsubscribeAll(
            params: BatchUnsubscribeAllParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BatchResponsePublicBulkOptOutFromAllResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "communication-preferences",
                        "2026-03",
                        "statuses",
                        "batch",
                        "unsubscribe-all",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { unsubscribeAllHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val updateStatusesHandler: Handler<BatchResponsePublicStatus> =
            jsonHandler<BatchResponsePublicStatus>(clientOptions.jsonMapper)

        override fun updateStatuses(
            params: BatchUpdateStatusesParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BatchResponsePublicStatus> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "communication-preferences",
                        "2026-03",
                        "statuses",
                        "batch",
                        "write",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { updateStatusesHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
