// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.blocking.marketing.marketingevents

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
import com.hubspot.sdk.core.prepare
import com.hubspot.sdk.models.marketing.marketingevents.CollectionResponseWithTotalPublicList
import com.hubspot.sdk.models.marketing.marketingevents.listassociations.ListAssociationAssociateByExternalAccountParams
import com.hubspot.sdk.models.marketing.marketingevents.listassociations.ListAssociationAssociateParams
import com.hubspot.sdk.models.marketing.marketingevents.listassociations.ListAssociationDeleteByExternalAccountParams
import com.hubspot.sdk.models.marketing.marketingevents.listassociations.ListAssociationDeleteParams
import com.hubspot.sdk.models.marketing.marketingevents.listassociations.ListAssociationListByExternalAccountParams
import com.hubspot.sdk.models.marketing.marketingevents.listassociations.ListAssociationListParams
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class ListAssociationServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    ListAssociationService {

    private val withRawResponse: ListAssociationService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ListAssociationService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ListAssociationService =
        ListAssociationServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun list(
        params: ListAssociationListParams,
        requestOptions: RequestOptions,
    ): CollectionResponseWithTotalPublicList =
        // get /marketing/marketing-events/2026-03/associations/{marketingEventId}/lists
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: ListAssociationDeleteParams, requestOptions: RequestOptions) {
        // delete /marketing/marketing-events/2026-03/associations/{marketingEventId}/lists/{listId}
        withRawResponse().delete(params, requestOptions)
    }

    override fun associate(params: ListAssociationAssociateParams, requestOptions: RequestOptions) {
        // put /marketing/marketing-events/2026-03/associations/{marketingEventId}/lists/{listId}
        withRawResponse().associate(params, requestOptions)
    }

    override fun associateByExternalAccount(
        params: ListAssociationAssociateByExternalAccountParams,
        requestOptions: RequestOptions,
    ) {
        // put
        // /marketing/marketing-events/2026-03/associations/{externalAccountId}/{externalEventId}/lists/{listId}
        withRawResponse().associateByExternalAccount(params, requestOptions)
    }

    override fun deleteByExternalAccount(
        params: ListAssociationDeleteByExternalAccountParams,
        requestOptions: RequestOptions,
    ) {
        // delete
        // /marketing/marketing-events/2026-03/associations/{externalAccountId}/{externalEventId}/lists/{listId}
        withRawResponse().deleteByExternalAccount(params, requestOptions)
    }

    override fun listByExternalAccount(
        params: ListAssociationListByExternalAccountParams,
        requestOptions: RequestOptions,
    ): CollectionResponseWithTotalPublicList =
        // get
        // /marketing/marketing-events/2026-03/associations/{externalAccountId}/{externalEventId}/lists
        withRawResponse().listByExternalAccount(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ListAssociationService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ListAssociationService.WithRawResponse =
            ListAssociationServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val listHandler: Handler<CollectionResponseWithTotalPublicList> =
            jsonHandler<CollectionResponseWithTotalPublicList>(clientOptions.jsonMapper)

        override fun list(
            params: ListAssociationListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CollectionResponseWithTotalPublicList> {
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
            params: ListAssociationDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { deleteHandler.handle(it) }
            }
        }

        private val associateHandler: Handler<Void?> = emptyHandler()

        override fun associate(
            params: ListAssociationAssociateParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { associateHandler.handle(it) }
            }
        }

        private val associateByExternalAccountHandler: Handler<Void?> = emptyHandler()

        override fun associateByExternalAccount(
            params: ListAssociationAssociateByExternalAccountParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { associateByExternalAccountHandler.handle(it) }
            }
        }

        private val deleteByExternalAccountHandler: Handler<Void?> = emptyHandler()

        override fun deleteByExternalAccount(
            params: ListAssociationDeleteByExternalAccountParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { deleteByExternalAccountHandler.handle(it) }
            }
        }

        private val listByExternalAccountHandler: Handler<CollectionResponseWithTotalPublicList> =
            jsonHandler<CollectionResponseWithTotalPublicList>(clientOptions.jsonMapper)

        override fun listByExternalAccount(
            params: ListAssociationListByExternalAccountParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CollectionResponseWithTotalPublicList> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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
