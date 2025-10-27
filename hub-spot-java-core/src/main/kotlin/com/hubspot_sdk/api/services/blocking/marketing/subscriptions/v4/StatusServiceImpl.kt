// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.marketing.subscriptions.v4

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.checkRequired
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
import com.hubspot_sdk.api.models.marketing.subscriptions.v4.ActionResponseWithResultsPublicStatus
import com.hubspot_sdk.api.models.marketing.subscriptions.v4.ActionResponseWithResultsPublicWideStatus
import com.hubspot_sdk.api.models.marketing.subscriptions.v4.BatchResponsePublicBulkOptOutFromAllResponse
import com.hubspot_sdk.api.models.marketing.subscriptions.v4.BatchResponsePublicStatus
import com.hubspot_sdk.api.models.marketing.subscriptions.v4.BatchResponsePublicStatusBulkResponse
import com.hubspot_sdk.api.models.marketing.subscriptions.v4.BatchResponsePublicWideStatusBulkResponse
import com.hubspot_sdk.api.models.marketing.subscriptions.v4.statuses.StatusBatchGetParams
import com.hubspot_sdk.api.models.marketing.subscriptions.v4.statuses.StatusBatchGetUnsubscribeAllStatusParams
import com.hubspot_sdk.api.models.marketing.subscriptions.v4.statuses.StatusBatchUnsubscribeAllParams
import com.hubspot_sdk.api.models.marketing.subscriptions.v4.statuses.StatusBatchUpdateParams
import com.hubspot_sdk.api.models.marketing.subscriptions.v4.statuses.StatusGetParams
import com.hubspot_sdk.api.models.marketing.subscriptions.v4.statuses.StatusGetUnsubscribeAllStatusParams
import com.hubspot_sdk.api.models.marketing.subscriptions.v4.statuses.StatusUnsubscribeAllParams
import com.hubspot_sdk.api.models.marketing.subscriptions.v4.statuses.StatusUpdateParams
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class StatusServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    StatusService {

    private val withRawResponse: StatusService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): StatusService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): StatusService =
        StatusServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun update(
        params: StatusUpdateParams,
        requestOptions: RequestOptions,
    ): ActionResponseWithResultsPublicStatus =
        // post /communication-preferences/v4/statuses/{subscriberIdString}
        withRawResponse().update(params, requestOptions).parse()

    override fun batchGet(
        params: StatusBatchGetParams,
        requestOptions: RequestOptions,
    ): BatchResponsePublicStatusBulkResponse =
        // post /communication-preferences/v4/statuses/batch/read
        withRawResponse().batchGet(params, requestOptions).parse()

    override fun batchGetUnsubscribeAllStatus(
        params: StatusBatchGetUnsubscribeAllStatusParams,
        requestOptions: RequestOptions,
    ): BatchResponsePublicWideStatusBulkResponse =
        // post /communication-preferences/v4/statuses/batch/unsubscribe-all/read
        withRawResponse().batchGetUnsubscribeAllStatus(params, requestOptions).parse()

    override fun batchUnsubscribeAll(
        params: StatusBatchUnsubscribeAllParams,
        requestOptions: RequestOptions,
    ): BatchResponsePublicBulkOptOutFromAllResponse =
        // post /communication-preferences/v4/statuses/batch/unsubscribe-all
        withRawResponse().batchUnsubscribeAll(params, requestOptions).parse()

    override fun batchUpdate(
        params: StatusBatchUpdateParams,
        requestOptions: RequestOptions,
    ): BatchResponsePublicStatus =
        // post /communication-preferences/v4/statuses/batch/write
        withRawResponse().batchUpdate(params, requestOptions).parse()

    override fun get(
        params: StatusGetParams,
        requestOptions: RequestOptions,
    ): ActionResponseWithResultsPublicStatus =
        // get /communication-preferences/v4/statuses/{subscriberIdString}
        withRawResponse().get(params, requestOptions).parse()

    override fun getUnsubscribeAllStatus(
        params: StatusGetUnsubscribeAllStatusParams,
        requestOptions: RequestOptions,
    ): ActionResponseWithResultsPublicWideStatus =
        // get /communication-preferences/v4/statuses/{subscriberIdString}/unsubscribe-all
        withRawResponse().getUnsubscribeAllStatus(params, requestOptions).parse()

    override fun unsubscribeAll(
        params: StatusUnsubscribeAllParams,
        requestOptions: RequestOptions,
    ): ActionResponseWithResultsPublicStatus =
        // post /communication-preferences/v4/statuses/{subscriberIdString}/unsubscribe-all
        withRawResponse().unsubscribeAll(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        StatusService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): StatusService.WithRawResponse =
            StatusServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val updateHandler: Handler<ActionResponseWithResultsPublicStatus> =
            jsonHandler<ActionResponseWithResultsPublicStatus>(clientOptions.jsonMapper)

        override fun update(
            params: StatusUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ActionResponseWithResultsPublicStatus> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("subscriberIdString", params.subscriberIdString().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "communication-preferences",
                        "v4",
                        "statuses",
                        params._pathParam(0),
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

        private val batchGetHandler: Handler<BatchResponsePublicStatusBulkResponse> =
            jsonHandler<BatchResponsePublicStatusBulkResponse>(clientOptions.jsonMapper)

        override fun batchGet(
            params: StatusBatchGetParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BatchResponsePublicStatusBulkResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("communication-preferences", "v4", "statuses", "batch", "read")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { batchGetHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val batchGetUnsubscribeAllStatusHandler:
            Handler<BatchResponsePublicWideStatusBulkResponse> =
            jsonHandler<BatchResponsePublicWideStatusBulkResponse>(clientOptions.jsonMapper)

        override fun batchGetUnsubscribeAllStatus(
            params: StatusBatchGetUnsubscribeAllStatusParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BatchResponsePublicWideStatusBulkResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "communication-preferences",
                        "v4",
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
                    .use { batchGetUnsubscribeAllStatusHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val batchUnsubscribeAllHandler:
            Handler<BatchResponsePublicBulkOptOutFromAllResponse> =
            jsonHandler<BatchResponsePublicBulkOptOutFromAllResponse>(clientOptions.jsonMapper)

        override fun batchUnsubscribeAll(
            params: StatusBatchUnsubscribeAllParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BatchResponsePublicBulkOptOutFromAllResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "communication-preferences",
                        "v4",
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
                    .use { batchUnsubscribeAllHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val batchUpdateHandler: Handler<BatchResponsePublicStatus> =
            jsonHandler<BatchResponsePublicStatus>(clientOptions.jsonMapper)

        override fun batchUpdate(
            params: StatusBatchUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BatchResponsePublicStatus> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "communication-preferences",
                        "v4",
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
                    .use { batchUpdateHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val getHandler: Handler<ActionResponseWithResultsPublicStatus> =
            jsonHandler<ActionResponseWithResultsPublicStatus>(clientOptions.jsonMapper)

        override fun get(
            params: StatusGetParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ActionResponseWithResultsPublicStatus> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("subscriberIdString", params.subscriberIdString().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "communication-preferences",
                        "v4",
                        "statuses",
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

        private val getUnsubscribeAllStatusHandler:
            Handler<ActionResponseWithResultsPublicWideStatus> =
            jsonHandler<ActionResponseWithResultsPublicWideStatus>(clientOptions.jsonMapper)

        override fun getUnsubscribeAllStatus(
            params: StatusGetUnsubscribeAllStatusParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ActionResponseWithResultsPublicWideStatus> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("subscriberIdString", params.subscriberIdString().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "communication-preferences",
                        "v4",
                        "statuses",
                        params._pathParam(0),
                        "unsubscribe-all",
                    )
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getUnsubscribeAllStatusHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val unsubscribeAllHandler: Handler<ActionResponseWithResultsPublicStatus> =
            jsonHandler<ActionResponseWithResultsPublicStatus>(clientOptions.jsonMapper)

        override fun unsubscribeAll(
            params: StatusUnsubscribeAllParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ActionResponseWithResultsPublicStatus> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("subscriberIdString", params.subscriberIdString().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "communication-preferences",
                        "v4",
                        "statuses",
                        params._pathParam(0),
                        "unsubscribe-all",
                    )
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
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
    }
}
