// File generated from our OpenAPI spec by Stainless.

package com.hubspot.services.blocking.marketing.transactional

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
import com.hubspot.models.marketing.transactional.singleemail.SingleEmailSendParams
import java.util.function.Consumer

class SingleEmailServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    SingleEmailService {

    private val withRawResponse: SingleEmailService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): SingleEmailService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): SingleEmailService =
        SingleEmailServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun send(
        params: SingleEmailSendParams,
        requestOptions: RequestOptions,
    ): EmailSendStatusView =
        // post /marketing/transactional/2026-03/single-email/send
        withRawResponse().send(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        SingleEmailService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SingleEmailService.WithRawResponse =
            SingleEmailServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val sendHandler: Handler<EmailSendStatusView> =
            jsonHandler<EmailSendStatusView>(clientOptions.jsonMapper)

        override fun send(
            params: SingleEmailSendParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EmailSendStatusView> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "marketing",
                        "transactional",
                        "2026-03",
                        "single-email",
                        "send",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { sendHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
