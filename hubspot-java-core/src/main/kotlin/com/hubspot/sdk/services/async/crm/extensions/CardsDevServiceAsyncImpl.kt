// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.async.crm.extensions

import com.hubspot.sdk.core.ClientOptions
import com.hubspot.sdk.core.RequestOptions
import com.hubspot.sdk.core.checkRequired
import com.hubspot.sdk.core.handlers.emptyHandler
import com.hubspot.sdk.core.handlers.errorBodyHandler
import com.hubspot.sdk.core.handlers.errorHandler
import com.hubspot.sdk.core.handlers.jsonHandler
import com.hubspot.sdk.core.http.HttpMethod
import com.hubspot.sdk.core.http.HttpRequest
import com.hubspot.sdk.core.http.HttpResponse
import com.hubspot.sdk.core.http.HttpResponse.Handler
import com.hubspot.sdk.core.http.HttpResponseFor
import com.hubspot.sdk.core.http.json
import com.hubspot.sdk.core.http.parseable
import com.hubspot.sdk.core.prepareAsync
import com.hubspot.sdk.models.crm.extensions.cardsdev.CardMigrateViewsResponse
import com.hubspot.sdk.models.crm.extensions.cardsdev.CardsDevCreateParams
import com.hubspot.sdk.models.crm.extensions.cardsdev.CardsDevDeleteParams
import com.hubspot.sdk.models.crm.extensions.cardsdev.CardsDevGetByIdParams
import com.hubspot.sdk.models.crm.extensions.cardsdev.CardsDevGetParams
import com.hubspot.sdk.models.crm.extensions.cardsdev.CardsDevGetSampleResponseParams
import com.hubspot.sdk.models.crm.extensions.cardsdev.CardsDevMigrateViewsParams
import com.hubspot.sdk.models.crm.extensions.cardsdev.CardsDevUpdateParams
import com.hubspot.sdk.models.crm.extensions.cardsdev.IntegratorCardPayloadResponse
import com.hubspot.sdk.models.crm.extensions.cardsdev.PublicCardListResponse
import com.hubspot.sdk.models.crm.extensions.cardsdev.PublicCardResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class CardsDevServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    CardsDevServiceAsync {

    private val withRawResponse: CardsDevServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): CardsDevServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): CardsDevServiceAsync =
        CardsDevServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: CardsDevCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PublicCardResponse> =
        // post /crm/extensions/cards-dev/2026-03/{appId}
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: CardsDevUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PublicCardResponse> =
        // patch /crm/extensions/cards-dev/2026-03/{appId}/{cardId}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: CardsDevDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // delete /crm/extensions/cards-dev/2026-03/{appId}/{cardId}
        withRawResponse().delete(params, requestOptions).thenAccept {}

    override fun get(
        params: CardsDevGetParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PublicCardListResponse> =
        // get /crm/extensions/cards-dev/2026-03/{appId}
        withRawResponse().get(params, requestOptions).thenApply { it.parse() }

    override fun getById(
        params: CardsDevGetByIdParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PublicCardResponse> =
        // get /crm/extensions/cards-dev/2026-03/{appId}/{cardId}
        withRawResponse().getById(params, requestOptions).thenApply { it.parse() }

    override fun getSampleResponse(
        params: CardsDevGetSampleResponseParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<IntegratorCardPayloadResponse> =
        // get /crm/extensions/cards-dev/2026-03/sample-response
        withRawResponse().getSampleResponse(params, requestOptions).thenApply { it.parse() }

    override fun migrateViews(
        params: CardsDevMigrateViewsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CardMigrateViewsResponse> =
        // post /crm/extensions/cards-dev/2026-03/{appId}/views/migrate
        withRawResponse().migrateViews(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CardsDevServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CardsDevServiceAsync.WithRawResponse =
            CardsDevServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<PublicCardResponse> =
            jsonHandler<PublicCardResponse>(clientOptions.jsonMapper)

        override fun create(
            params: CardsDevCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PublicCardResponse>> {
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
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

        private val updateHandler: Handler<PublicCardResponse> =
            jsonHandler<PublicCardResponse>(clientOptions.jsonMapper)

        override fun update(
            params: CardsDevUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PublicCardResponse>> {
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { updateHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: CardsDevDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { deleteHandler.handle(it) }
                    }
                }
        }

        private val getHandler: Handler<PublicCardListResponse> =
            jsonHandler<PublicCardListResponse>(clientOptions.jsonMapper)

        override fun get(
            params: CardsDevGetParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PublicCardListResponse>> {
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { getHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val getByIdHandler: Handler<PublicCardResponse> =
            jsonHandler<PublicCardResponse>(clientOptions.jsonMapper)

        override fun getById(
            params: CardsDevGetByIdParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PublicCardResponse>> {
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { getByIdHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val getSampleResponseHandler: Handler<IntegratorCardPayloadResponse> =
            jsonHandler<IntegratorCardPayloadResponse>(clientOptions.jsonMapper)

        override fun getSampleResponse(
            params: CardsDevGetSampleResponseParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<IntegratorCardPayloadResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("crm", "extensions", "cards-dev", "2026-03", "sample-response")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
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

        private val migrateViewsHandler: Handler<CardMigrateViewsResponse> =
            jsonHandler<CardMigrateViewsResponse>(clientOptions.jsonMapper)

        override fun migrateViews(
            params: CardsDevMigrateViewsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CardMigrateViewsResponse>> {
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
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
}
