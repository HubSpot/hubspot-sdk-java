// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.marketing.events

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
import com.hubspot_sdk.api.models.marketing.events.CollectionResponseWithTotalPublicListNoPaging
import com.hubspot_sdk.api.models.marketing.events.associations.AssociationAssociateByExternalAccountParams
import com.hubspot_sdk.api.models.marketing.events.associations.AssociationAssociateParams
import com.hubspot_sdk.api.models.marketing.events.associations.AssociationDeleteByExternalAccountParams
import com.hubspot_sdk.api.models.marketing.events.associations.AssociationDeleteParams
import com.hubspot_sdk.api.models.marketing.events.associations.AssociationListByExternalAccountParams
import com.hubspot_sdk.api.models.marketing.events.associations.AssociationListParams
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class AssociationServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    AssociationService {

    private val withRawResponse: AssociationService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): AssociationService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): AssociationService =
        AssociationServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun list(
        params: AssociationListParams,
        requestOptions: RequestOptions,
    ): CollectionResponseWithTotalPublicListNoPaging =
        // get /marketing/v3/marketing-events/associations/{marketingEventId}/lists
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: AssociationDeleteParams, requestOptions: RequestOptions) {
        // delete /marketing/v3/marketing-events/associations/{marketingEventId}/lists/{listId}
        withRawResponse().delete(params, requestOptions)
    }

    override fun associate(params: AssociationAssociateParams, requestOptions: RequestOptions) {
        // put /marketing/v3/marketing-events/associations/{marketingEventId}/lists/{listId}
        withRawResponse().associate(params, requestOptions)
    }

    override fun associateByExternalAccount(
        params: AssociationAssociateByExternalAccountParams,
        requestOptions: RequestOptions,
    ) {
        // put
        // /marketing/v3/marketing-events/associations/{externalAccountId}/{externalEventId}/lists/{listId}
        withRawResponse().associateByExternalAccount(params, requestOptions)
    }

    override fun deleteByExternalAccount(
        params: AssociationDeleteByExternalAccountParams,
        requestOptions: RequestOptions,
    ) {
        // delete
        // /marketing/v3/marketing-events/associations/{externalAccountId}/{externalEventId}/lists/{listId}
        withRawResponse().deleteByExternalAccount(params, requestOptions)
    }

    override fun listByExternalAccount(
        params: AssociationListByExternalAccountParams,
        requestOptions: RequestOptions,
    ): CollectionResponseWithTotalPublicListNoPaging =
        // get
        // /marketing/v3/marketing-events/associations/{externalAccountId}/{externalEventId}/lists
        withRawResponse().listByExternalAccount(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AssociationService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AssociationService.WithRawResponse =
            AssociationServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val listHandler: Handler<CollectionResponseWithTotalPublicListNoPaging> =
            jsonHandler<CollectionResponseWithTotalPublicListNoPaging>(clientOptions.jsonMapper)

        override fun list(
            params: AssociationListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CollectionResponseWithTotalPublicListNoPaging> {
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
            params: AssociationDeleteParams,
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
                        "v3",
                        "marketing-events",
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
            params: AssociationAssociateParams,
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
                        "v3",
                        "marketing-events",
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
            params: AssociationAssociateByExternalAccountParams,
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { associateByExternalAccountHandler.handle(it) }
            }
        }

        private val deleteByExternalAccountHandler: Handler<Void?> = emptyHandler()

        override fun deleteByExternalAccount(
            params: AssociationDeleteByExternalAccountParams,
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { deleteByExternalAccountHandler.handle(it) }
            }
        }

        private val listByExternalAccountHandler:
            Handler<CollectionResponseWithTotalPublicListNoPaging> =
            jsonHandler<CollectionResponseWithTotalPublicListNoPaging>(clientOptions.jsonMapper)

        override fun listByExternalAccount(
            params: AssociationListByExternalAccountParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CollectionResponseWithTotalPublicListNoPaging> {
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
