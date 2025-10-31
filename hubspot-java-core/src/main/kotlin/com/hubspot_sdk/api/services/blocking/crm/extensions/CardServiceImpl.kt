// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.crm.extensions

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.core.handlers.emptyHandler
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
import com.hubspot_sdk.api.models.crm.extensions.cards.CardCreateParams
import com.hubspot_sdk.api.models.crm.extensions.cards.CardDeleteParams
import com.hubspot_sdk.api.models.crm.extensions.cards.CardGetParams
import com.hubspot_sdk.api.models.crm.extensions.cards.CardGetSampleResponseParams
import com.hubspot_sdk.api.models.crm.extensions.cards.CardListParams
import com.hubspot_sdk.api.models.crm.extensions.cards.CardUpdateParams
import com.hubspot_sdk.api.models.crm.extensions.cards.IntegratorCardPayloadResponse
import com.hubspot_sdk.api.models.crm.extensions.cards.PublicCardListResponse
import com.hubspot_sdk.api.models.crm.extensions.cards.PublicCardResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class CardServiceImpl internal constructor(private val clientOptions: ClientOptions) : CardService {

    private val withRawResponse: CardService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): CardService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): CardService =
        CardServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: CardCreateParams,
        requestOptions: RequestOptions,
    ): PublicCardResponse =
        // post /crm/v3/extensions/cards-dev/{appId}
        withRawResponse().create(params, requestOptions).parse()

    override fun update(
        params: CardUpdateParams,
        requestOptions: RequestOptions,
    ): PublicCardResponse =
        // patch /crm/v3/extensions/cards-dev/{appId}/{cardId}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(
        params: CardListParams,
        requestOptions: RequestOptions,
    ): PublicCardListResponse =
        // get /crm/v3/extensions/cards-dev/{appId}
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: CardDeleteParams, requestOptions: RequestOptions) {
        // delete /crm/v3/extensions/cards-dev/{appId}/{cardId}
        withRawResponse().delete(params, requestOptions)
    }

    override fun get(params: CardGetParams, requestOptions: RequestOptions): PublicCardResponse =
        // get /crm/v3/extensions/cards-dev/{appId}/{cardId}
        withRawResponse().get(params, requestOptions).parse()

    override fun getSampleResponse(
        params: CardGetSampleResponseParams,
        requestOptions: RequestOptions,
    ): IntegratorCardPayloadResponse =
        // get /crm/v3/extensions/cards-dev/sample-response
        withRawResponse().getSampleResponse(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CardService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CardService.WithRawResponse =
            CardServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<PublicCardResponse> =
            jsonHandler<PublicCardResponse>(clientOptions.jsonMapper)

        override fun create(
            params: CardCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PublicCardResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("appId", params.appId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("crm", "v3", "extensions", "cards-dev", params._pathParam(0))
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

        private val updateHandler: Handler<PublicCardResponse> =
            jsonHandler<PublicCardResponse>(clientOptions.jsonMapper)

        override fun update(
            params: CardUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PublicCardResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("cardId", params.cardId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "crm",
                        "v3",
                        "extensions",
                        "cards-dev",
                        params._pathParam(0),
                        params._pathParam(1),
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

        private val listHandler: Handler<PublicCardListResponse> =
            jsonHandler<PublicCardListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: CardListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PublicCardListResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("appId", params.appId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("crm", "v3", "extensions", "cards-dev", params._pathParam(0))
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

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: CardDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("cardId", params.cardId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "crm",
                        "v3",
                        "extensions",
                        "cards-dev",
                        params._pathParam(0),
                        params._pathParam(1),
                    )
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { deleteHandler.handle(it) }
            }
        }

        private val getHandler: Handler<PublicCardResponse> =
            jsonHandler<PublicCardResponse>(clientOptions.jsonMapper)

        override fun get(
            params: CardGetParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PublicCardResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("cardId", params.cardId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "crm",
                        "v3",
                        "extensions",
                        "cards-dev",
                        params._pathParam(0),
                        params._pathParam(1),
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

        private val getSampleResponseHandler: Handler<IntegratorCardPayloadResponse> =
            jsonHandler<IntegratorCardPayloadResponse>(clientOptions.jsonMapper)

        override fun getSampleResponse(
            params: CardGetSampleResponseParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<IntegratorCardPayloadResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("crm", "v3", "extensions", "cards-dev", "sample-response")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getSampleResponseHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
