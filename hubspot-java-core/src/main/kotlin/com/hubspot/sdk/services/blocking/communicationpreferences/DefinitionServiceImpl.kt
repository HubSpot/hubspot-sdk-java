// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.blocking.communicationpreferences

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
import com.hubspot.sdk.core.http.parseable
import com.hubspot.sdk.core.prepare
import com.hubspot.sdk.models.communicationpreferences.ActionResponseWithResultsSubscriptionDefinition
import com.hubspot.sdk.models.communicationpreferences.definitions.DefinitionListParams
import java.util.function.Consumer

class DefinitionServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    DefinitionService {

    private val withRawResponse: DefinitionService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): DefinitionService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): DefinitionService =
        DefinitionServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun list(
        params: DefinitionListParams,
        requestOptions: RequestOptions,
    ): ActionResponseWithResultsSubscriptionDefinition =
        // get /communication-preferences/2026-03/definitions
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        DefinitionService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): DefinitionService.WithRawResponse =
            DefinitionServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val listHandler: Handler<ActionResponseWithResultsSubscriptionDefinition> =
            jsonHandler<ActionResponseWithResultsSubscriptionDefinition>(clientOptions.jsonMapper)

        override fun list(
            params: DefinitionListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ActionResponseWithResultsSubscriptionDefinition> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("communication-preferences", "2026-03", "definitions")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
