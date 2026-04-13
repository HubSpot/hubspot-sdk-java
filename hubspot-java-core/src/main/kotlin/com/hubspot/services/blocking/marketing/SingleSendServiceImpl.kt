// File generated from our OpenAPI spec by Stainless.

package com.hubspot.services.blocking.marketing

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
import com.hubspot.models.marketing.EmailSendStatusView
import com.hubspot.models.marketing.singlesend.SingleSendCreateParams
import java.util.function.Consumer

class SingleSendServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    SingleSendService {

    private val withRawResponse: SingleSendService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): SingleSendService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): SingleSendService =
        SingleSendServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: SingleSendCreateParams,
        requestOptions: RequestOptions,
    ): EmailSendStatusView =
        // post /marketing/email-campaigns/2026-03/single-send
        withRawResponse().create(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        SingleSendService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SingleSendService.WithRawResponse =
            SingleSendServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<EmailSendStatusView> =
            jsonHandler<EmailSendStatusView>(clientOptions.jsonMapper)

        override fun create(
            params: SingleSendCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EmailSendStatusView> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("marketing", "email-campaigns", "2026-03", "single-send")
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
