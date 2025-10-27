// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.marketing.events

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
import com.hubspot_sdk.api.core.prepareAsync
import com.hubspot_sdk.api.models.marketing.events.CollectionResponseWithTotalPublicListNoPaging
import com.hubspot_sdk.api.models.marketing.events.associations.AssociationAssociateByExternalAccountParams
import com.hubspot_sdk.api.models.marketing.events.associations.AssociationAssociateParams
import com.hubspot_sdk.api.models.marketing.events.associations.AssociationDeleteByExternalAccountParams
import com.hubspot_sdk.api.models.marketing.events.associations.AssociationDeleteParams
import com.hubspot_sdk.api.models.marketing.events.associations.AssociationListByExternalAccountParams
import com.hubspot_sdk.api.models.marketing.events.associations.AssociationListParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class AssociationServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    AssociationServiceAsync {

    private val withRawResponse: AssociationServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): AssociationServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): AssociationServiceAsync =
        AssociationServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun list(
        params: AssociationListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CollectionResponseWithTotalPublicListNoPaging> =
        // get /marketing/v3/marketing-events/associations/{marketingEventId}/lists
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: AssociationDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // delete /marketing/v3/marketing-events/associations/{marketingEventId}/lists/{listId}
        withRawResponse().delete(params, requestOptions).thenAccept {}

    override fun associate(
        params: AssociationAssociateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // put /marketing/v3/marketing-events/associations/{marketingEventId}/lists/{listId}
        withRawResponse().associate(params, requestOptions).thenAccept {}

    override fun associateByExternalAccount(
        params: AssociationAssociateByExternalAccountParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // put
        // /marketing/v3/marketing-events/associations/{externalAccountId}/{externalEventId}/lists/{listId}
        withRawResponse().associateByExternalAccount(params, requestOptions).thenAccept {}

    override fun deleteByExternalAccount(
        params: AssociationDeleteByExternalAccountParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // delete
        // /marketing/v3/marketing-events/associations/{externalAccountId}/{externalEventId}/lists/{listId}
        withRawResponse().deleteByExternalAccount(params, requestOptions).thenAccept {}

    override fun listByExternalAccount(
        params: AssociationListByExternalAccountParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CollectionResponseWithTotalPublicListNoPaging> =
        // get
        // /marketing/v3/marketing-events/associations/{externalAccountId}/{externalEventId}/lists
        withRawResponse().listByExternalAccount(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AssociationServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AssociationServiceAsync.WithRawResponse =
            AssociationServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val listHandler: Handler<CollectionResponseWithTotalPublicListNoPaging> =
            jsonHandler<CollectionResponseWithTotalPublicListNoPaging>(clientOptions.jsonMapper)

        override fun list(
            params: AssociationListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CollectionResponseWithTotalPublicListNoPaging>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("marketingEventId", params.marketingEventId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "marketing",
                        "v3",
                        "marketing-events",
                        "associations",
                        params._pathParam(0),
                        "lists",
                    )
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
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

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: AssociationDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("listId", params.listId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "marketing",
                        "v3",
                        "marketing-events",
                        "associations",
                        params._pathParam(0),
                        "lists",
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

        private val associateHandler: Handler<Void?> = emptyHandler()

        override fun associate(
            params: AssociationAssociateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("listId", params.listId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "marketing",
                        "v3",
                        "marketing-events",
                        "associations",
                        params._pathParam(0),
                        "lists",
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
                        response.use { associateHandler.handle(it) }
                    }
                }
        }

        private val associateByExternalAccountHandler: Handler<Void?> = emptyHandler()

        override fun associateByExternalAccount(
            params: AssociationAssociateByExternalAccountParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("listId", params.listId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "marketing",
                        "v3",
                        "marketing-events",
                        "associations",
                        params._pathParam(0),
                        params._pathParam(1),
                        "lists",
                        params._pathParam(2),
                    )
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { associateByExternalAccountHandler.handle(it) }
                    }
                }
        }

        private val deleteByExternalAccountHandler: Handler<Void?> = emptyHandler()

        override fun deleteByExternalAccount(
            params: AssociationDeleteByExternalAccountParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("listId", params.listId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "marketing",
                        "v3",
                        "marketing-events",
                        "associations",
                        params._pathParam(0),
                        params._pathParam(1),
                        "lists",
                        params._pathParam(2),
                    )
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { deleteByExternalAccountHandler.handle(it) }
                    }
                }
        }

        private val listByExternalAccountHandler:
            Handler<CollectionResponseWithTotalPublicListNoPaging> =
            jsonHandler<CollectionResponseWithTotalPublicListNoPaging>(clientOptions.jsonMapper)

        override fun listByExternalAccount(
            params: AssociationListByExternalAccountParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CollectionResponseWithTotalPublicListNoPaging>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("externalEventId", params.externalEventId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "marketing",
                        "v3",
                        "marketing-events",
                        "associations",
                        params._pathParam(0),
                        params._pathParam(1),
                        "lists",
                    )
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listByExternalAccountHandler.handle(it) }
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
