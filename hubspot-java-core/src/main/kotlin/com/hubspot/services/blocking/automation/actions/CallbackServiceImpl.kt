// File generated from our OpenAPI spec by Stainless.

package com.hubspot.services.blocking.automation.actions

import com.hubspot.core.ClientOptions
import com.hubspot.core.RequestOptions
import com.hubspot.core.checkRequired
import com.hubspot.core.handlers.emptyHandler
import com.hubspot.core.handlers.errorBodyHandler
import com.hubspot.core.handlers.errorHandler
import com.hubspot.core.http.HttpMethod
import com.hubspot.core.http.HttpRequest
import com.hubspot.core.http.HttpResponse
import com.hubspot.core.http.HttpResponse.Handler
import com.hubspot.core.http.json
import com.hubspot.core.http.parseable
import com.hubspot.core.prepare
import com.hubspot.models.automation.actions.callbacks.CallbackCompleteBatchParams
import com.hubspot.models.automation.actions.callbacks.CallbackCompleteParams
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class CallbackServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    CallbackService {

    private val withRawResponse: CallbackService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): CallbackService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): CallbackService =
        CallbackServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun complete(params: CallbackCompleteParams, requestOptions: RequestOptions) {
        // post /automation/actions/callbacks/2026-03/{callbackId}/complete
        withRawResponse().complete(params, requestOptions)
    }

    override fun completeBatch(
        params: CallbackCompleteBatchParams,
        requestOptions: RequestOptions,
    ) {
        // post /automation/actions/callbacks/2026-03/complete
        withRawResponse().completeBatch(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CallbackService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CallbackService.WithRawResponse =
            CallbackServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val completeHandler: Handler<Void?> = emptyHandler()

        override fun complete(
            params: CallbackCompleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("callbackId", params.callbackId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "automation",
                        "actions",
                        "callbacks",
                        "2026-03",
                        params._pathParam(0),
                        "complete",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { completeHandler.handle(it) }
            }
        }

        private val completeBatchHandler: Handler<Void?> = emptyHandler()

        override fun completeBatch(
            params: CallbackCompleteBatchParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("automation", "actions", "callbacks", "2026-03", "complete")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { completeBatchHandler.handle(it) }
            }
        }
    }
}
