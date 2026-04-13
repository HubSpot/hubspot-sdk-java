// File generated from our OpenAPI spec by Stainless.

package com.hubspot.services.async.marketing.marketingevents

import com.hubspot.core.ClientOptions
import com.hubspot.core.RequestOptions
import com.hubspot.core.checkRequired
import com.hubspot.core.handlers.emptyHandler
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
import com.hubspot.core.prepareAsync
import com.hubspot.models.marketing.marketingevents.CollectionResponseWithTotalPublicList
import com.hubspot.models.marketing.marketingevents.listassociations.ListAssociationAssociateByExternalAccountParams
import com.hubspot.models.marketing.marketingevents.listassociations.ListAssociationAssociateParams
import com.hubspot.models.marketing.marketingevents.listassociations.ListAssociationDeleteByExternalAccountParams
import com.hubspot.models.marketing.marketingevents.listassociations.ListAssociationDeleteParams
import com.hubspot.models.marketing.marketingevents.listassociations.ListAssociationListByExternalAccountParams
import com.hubspot.models.marketing.marketingevents.listassociations.ListAssociationListParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class ListAssociationServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : ListAssociationServiceAsync {

    private val withRawResponse: ListAssociationServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ListAssociationServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): ListAssociationServiceAsync =
        ListAssociationServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun list(
        params: ListAssociationListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CollectionResponseWithTotalPublicList> =
        // get /marketing/marketing-events/2026-03/associations/{marketingEventId}/lists
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: ListAssociationDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // delete /marketing/marketing-events/2026-03/associations/{marketingEventId}/lists/{listId}
        withRawResponse().delete(params, requestOptions).thenAccept {}

    override fun associate(
        params: ListAssociationAssociateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // put /marketing/marketing-events/2026-03/associations/{marketingEventId}/lists/{listId}
        withRawResponse().associate(params, requestOptions).thenAccept {}

    override fun associateByExternalAccount(
        params: ListAssociationAssociateByExternalAccountParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // put
        // /marketing/marketing-events/2026-03/associations/{externalAccountId}/{externalEventId}/lists/{listId}
        withRawResponse().associateByExternalAccount(params, requestOptions).thenAccept {}

    override fun deleteByExternalAccount(
        params: ListAssociationDeleteByExternalAccountParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // delete
        // /marketing/marketing-events/2026-03/associations/{externalAccountId}/{externalEventId}/lists/{listId}
        withRawResponse().deleteByExternalAccount(params, requestOptions).thenAccept {}

    override fun listByExternalAccount(
        params: ListAssociationListByExternalAccountParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CollectionResponseWithTotalPublicList> =
        // get
        // /marketing/marketing-events/2026-03/associations/{externalAccountId}/{externalEventId}/lists
        withRawResponse().listByExternalAccount(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ListAssociationServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ListAssociationServiceAsync.WithRawResponse =
            ListAssociationServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val listHandler: Handler<CollectionResponseWithTotalPublicList> =
            jsonHandler<CollectionResponseWithTotalPublicList>(clientOptions.jsonMapper)

        override fun list(
            params: ListAssociationListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CollectionResponseWithTotalPublicList>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("marketingEventId", params.marketingEventId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "marketing",
                        "marketing-events",
                        "2026-03",
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
            params: ListAssociationDeleteParams,
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
                        "marketing-events",
                        "2026-03",
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
            params: ListAssociationAssociateParams,
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
                        "marketing-events",
                        "2026-03",
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
            params: ListAssociationAssociateByExternalAccountParams,
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
                        "marketing-events",
                        "2026-03",
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
            params: ListAssociationDeleteByExternalAccountParams,
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
                        "marketing-events",
                        "2026-03",
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

        private val listByExternalAccountHandler: Handler<CollectionResponseWithTotalPublicList> =
            jsonHandler<CollectionResponseWithTotalPublicList>(clientOptions.jsonMapper)

        override fun listByExternalAccount(
            params: ListAssociationListByExternalAccountParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CollectionResponseWithTotalPublicList>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("externalEventId", params.externalEventId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "marketing",
                        "marketing-events",
                        "2026-03",
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
