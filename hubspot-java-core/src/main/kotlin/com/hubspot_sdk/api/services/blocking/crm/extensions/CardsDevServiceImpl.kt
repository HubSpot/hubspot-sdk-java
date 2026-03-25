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
import com.hubspot_sdk.api.models.crm.extensions.cardsdev.CardMigrateViewsResponse
import com.hubspot_sdk.api.models.crm.extensions.cardsdev.CardsDevCreateParams
import com.hubspot_sdk.api.models.crm.extensions.cardsdev.CardsDevDeleteParams
import com.hubspot_sdk.api.models.crm.extensions.cardsdev.CardsDevGetByIdParams
import com.hubspot_sdk.api.models.crm.extensions.cardsdev.CardsDevGetParams
import com.hubspot_sdk.api.models.crm.extensions.cardsdev.CardsDevGetSampleResponseParams
import com.hubspot_sdk.api.models.crm.extensions.cardsdev.CardsDevMigrateViewsParams
import com.hubspot_sdk.api.models.crm.extensions.cardsdev.CardsDevUpdateParams
import com.hubspot_sdk.api.models.crm.extensions.cardsdev.IntegratorCardPayloadResponse
import com.hubspot_sdk.api.models.crm.extensions.cardsdev.PublicCardListResponse
import com.hubspot_sdk.api.models.crm.extensions.cardsdev.PublicCardResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class CardsDevServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    CardsDevService {

    private val withRawResponse: CardsDevService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): CardsDevService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): CardsDevService =
        CardsDevServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: CardsDevCreateParams,
        requestOptions: RequestOptions,
    ): PublicCardResponse =
        // post /crm/extensions/cards-dev/2026-03/{appId}
        withRawResponse().create(params, requestOptions).parse()

    override fun update(
        params: CardsDevUpdateParams,
        requestOptions: RequestOptions,
    ): PublicCardResponse =
        // patch /crm/extensions/cards-dev/2026-03/{appId}/{cardId}
        withRawResponse().update(params, requestOptions).parse()

    override fun delete(params: CardsDevDeleteParams, requestOptions: RequestOptions) {
        // delete /crm/extensions/cards-dev/2026-03/{appId}/{cardId}
        withRawResponse().delete(params, requestOptions)
    }

    override fun get(
        params: CardsDevGetParams,
        requestOptions: RequestOptions,
    ): PublicCardListResponse =
        // get /crm/extensions/cards-dev/2026-03/{appId}
        withRawResponse().get(params, requestOptions).parse()

    override fun getById(
        params: CardsDevGetByIdParams,
        requestOptions: RequestOptions,
    ): PublicCardResponse =
        // get /crm/extensions/cards-dev/2026-03/{appId}/{cardId}
        withRawResponse().getById(params, requestOptions).parse()

    override fun getSampleResponse(
        params: CardsDevGetSampleResponseParams,
        requestOptions: RequestOptions,
    ): IntegratorCardPayloadResponse =
        // get /crm/extensions/cards-dev/2026-03/sample-response
        withRawResponse().getSampleResponse(params, requestOptions).parse()

    override fun migrateViews(
        params: CardsDevMigrateViewsParams,
        requestOptions: RequestOptions,
    ): CardMigrateViewsResponse =
        // post /crm/extensions/cards-dev/2026-03/{appId}/views/migrate
        withRawResponse().migrateViews(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CardsDevService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CardsDevService.WithRawResponse =
            CardsDevServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<PublicCardResponse> =
            jsonHandler<PublicCardResponse>(clientOptions.jsonMapper)

        override fun create(
            params: CardsDevCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PublicCardResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("appId", params.appId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "crm",
                        "extensions",
                        "cards-dev",
                        "2026-03",
                        params._pathParam(0),
                    )
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
            params: CardsDevUpdateParams,
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
                        "extensions",
                        "cards-dev",
                        "2026-03",
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

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: CardsDevDeleteParams,
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
                        "extensions",
                        "cards-dev",
                        "2026-03",
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

        private val getHandler: Handler<PublicCardListResponse> =
            jsonHandler<PublicCardListResponse>(clientOptions.jsonMapper)

        override fun get(
            params: CardsDevGetParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PublicCardListResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("appId", params.appId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "crm",
                        "extensions",
                        "cards-dev",
                        "2026-03",
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

        private val getByIdHandler: Handler<PublicCardResponse> =
            jsonHandler<PublicCardResponse>(clientOptions.jsonMapper)

        override fun getById(
            params: CardsDevGetByIdParams,
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
                        "extensions",
                        "cards-dev",
                        "2026-03",
                        params._pathParam(0),
                        params._pathParam(1),
                    )
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getByIdHandler.handle(it) }
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
            params: CardsDevGetSampleResponseParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<IntegratorCardPayloadResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("crm", "extensions", "cards-dev", "2026-03", "sample-response")
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

        private val migrateViewsHandler: Handler<CardMigrateViewsResponse> =
            jsonHandler<CardMigrateViewsResponse>(clientOptions.jsonMapper)

        override fun migrateViews(
            params: CardsDevMigrateViewsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CardMigrateViewsResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("appId", params.appId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "crm",
                        "extensions",
                        "cards-dev",
                        "2026-03",
                        params._pathParam(0),
                        "views",
                        "migrate",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { migrateViewsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
