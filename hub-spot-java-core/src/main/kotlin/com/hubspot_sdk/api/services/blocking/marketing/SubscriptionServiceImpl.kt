// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.marketing

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
import com.hubspot_sdk.api.models.marketing.subscriptions.PublicSubscriptionStatus
import com.hubspot_sdk.api.models.marketing.subscriptions.PublicSubscriptionStatusesResponse
import com.hubspot_sdk.api.models.marketing.subscriptions.SubscriptionDefinitionsResponse
import com.hubspot_sdk.api.models.marketing.subscriptions.SubscriptionGetEmailStatusParams
import com.hubspot_sdk.api.models.marketing.subscriptions.SubscriptionListParams
import com.hubspot_sdk.api.models.marketing.subscriptions.SubscriptionSubscribeParams
import com.hubspot_sdk.api.models.marketing.subscriptions.SubscriptionUnsubscribeParams
import com.hubspot_sdk.api.services.blocking.marketing.subscriptions.V4Service
import com.hubspot_sdk.api.services.blocking.marketing.subscriptions.V4ServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class SubscriptionServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    SubscriptionService {

    private val withRawResponse: SubscriptionService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val v4: V4Service by lazy { V4ServiceImpl(clientOptions) }

    override fun withRawResponse(): SubscriptionService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): SubscriptionService =
        SubscriptionServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun v4(): V4Service = v4

    override fun list(
        params: SubscriptionListParams,
        requestOptions: RequestOptions,
    ): SubscriptionDefinitionsResponse =
        // get /communication-preferences/v3/definitions
        withRawResponse().list(params, requestOptions).parse()

    override fun getEmailStatus(
        params: SubscriptionGetEmailStatusParams,
        requestOptions: RequestOptions,
    ): PublicSubscriptionStatusesResponse =
        // get /communication-preferences/v3/status/email/{emailAddress}
        withRawResponse().getEmailStatus(params, requestOptions).parse()

    override fun subscribe(
        params: SubscriptionSubscribeParams,
        requestOptions: RequestOptions,
    ): PublicSubscriptionStatus =
        // post /communication-preferences/v3/subscribe
        withRawResponse().subscribe(params, requestOptions).parse()

    override fun unsubscribe(
        params: SubscriptionUnsubscribeParams,
        requestOptions: RequestOptions,
    ): PublicSubscriptionStatus =
        // post /communication-preferences/v3/unsubscribe
        withRawResponse().unsubscribe(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        SubscriptionService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val v4: V4Service.WithRawResponse by lazy {
            V4ServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SubscriptionService.WithRawResponse =
            SubscriptionServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun v4(): V4Service.WithRawResponse = v4

        private val listHandler: Handler<SubscriptionDefinitionsResponse> =
            jsonHandler<SubscriptionDefinitionsResponse>(clientOptions.jsonMapper)

        override fun list(
            params: SubscriptionListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SubscriptionDefinitionsResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("communication-preferences", "v3", "definitions")
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

        private val getEmailStatusHandler: Handler<PublicSubscriptionStatusesResponse> =
            jsonHandler<PublicSubscriptionStatusesResponse>(clientOptions.jsonMapper)

        override fun getEmailStatus(
            params: SubscriptionGetEmailStatusParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PublicSubscriptionStatusesResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("emailAddress", params.emailAddress().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "communication-preferences",
                        "v3",
                        "status",
                        "email",
                        params._pathParam(0),
                    )
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getEmailStatusHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val subscribeHandler: Handler<PublicSubscriptionStatus> =
            jsonHandler<PublicSubscriptionStatus>(clientOptions.jsonMapper)

        override fun subscribe(
            params: SubscriptionSubscribeParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PublicSubscriptionStatus> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("communication-preferences", "v3", "subscribe")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { subscribeHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val unsubscribeHandler: Handler<PublicSubscriptionStatus> =
            jsonHandler<PublicSubscriptionStatus>(clientOptions.jsonMapper)

        override fun unsubscribe(
            params: SubscriptionUnsubscribeParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PublicSubscriptionStatus> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("communication-preferences", "v3", "unsubscribe")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { unsubscribeHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
