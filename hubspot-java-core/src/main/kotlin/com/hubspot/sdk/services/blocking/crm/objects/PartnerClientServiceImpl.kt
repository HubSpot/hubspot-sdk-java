// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.blocking.crm.objects

import com.hubspot.sdk.core.ClientOptions
import com.hubspot.sdk.core.RequestOptions
import com.hubspot.sdk.core.checkRequired
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
import com.hubspot.sdk.models.crm.CollectionResponseMultiAssociatedObjectWithLabelForwardPaging
import com.hubspot.sdk.models.crm.CollectionResponseWithTotalSimplePublicObject
import com.hubspot.sdk.models.crm.SimplePublicObject
import com.hubspot.sdk.models.crm.objects.CollectionResponseSimplePublicObjectWithAssociationsForwardPaging
import com.hubspot.sdk.models.crm.objects.SimplePublicObjectWithAssociations
import com.hubspot.sdk.models.crm.objects.partnerclients.PartnerClientGetParams
import com.hubspot.sdk.models.crm.objects.partnerclients.PartnerClientListAssociationsPage
import com.hubspot.sdk.models.crm.objects.partnerclients.PartnerClientListAssociationsParams
import com.hubspot.sdk.models.crm.objects.partnerclients.PartnerClientListPage
import com.hubspot.sdk.models.crm.objects.partnerclients.PartnerClientListParams
import com.hubspot.sdk.models.crm.objects.partnerclients.PartnerClientSearchParams
import com.hubspot.sdk.models.crm.objects.partnerclients.PartnerClientUpdateParams
import com.hubspot.sdk.services.blocking.crm.objects.partnerclients.BatchService
import com.hubspot.sdk.services.blocking.crm.objects.partnerclients.BatchServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class PartnerClientServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    PartnerClientService {

    private val withRawResponse: PartnerClientService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val batch: BatchService by lazy { BatchServiceImpl(clientOptions) }

    override fun withRawResponse(): PartnerClientService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): PartnerClientService =
        PartnerClientServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun batch(): BatchService = batch

    override fun update(
        params: PartnerClientUpdateParams,
        requestOptions: RequestOptions,
    ): SimplePublicObject =
        // patch /crm/objects/2026-03/partner_clients/{partnerClientId}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(
        params: PartnerClientListParams,
        requestOptions: RequestOptions,
    ): PartnerClientListPage =
        // get /crm/objects/2026-03/partner_clients
        withRawResponse().list(params, requestOptions).parse()

    override fun get(
        params: PartnerClientGetParams,
        requestOptions: RequestOptions,
    ): SimplePublicObjectWithAssociations =
        // get /crm/objects/2026-03/partner_clients/{partnerClientId}
        withRawResponse().get(params, requestOptions).parse()

    override fun listAssociations(
        params: PartnerClientListAssociationsParams,
        requestOptions: RequestOptions,
    ): PartnerClientListAssociationsPage =
        // get /crm/objects/2026-03/partner_clients/{partnerClientId}/associations/{toObjectType}
        withRawResponse().listAssociations(params, requestOptions).parse()

    override fun search(
        params: PartnerClientSearchParams,
        requestOptions: RequestOptions,
    ): CollectionResponseWithTotalSimplePublicObject =
        // post /crm/objects/2026-03/partner_clients/search
        withRawResponse().search(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PartnerClientService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val batch: BatchService.WithRawResponse by lazy {
            BatchServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PartnerClientService.WithRawResponse =
            PartnerClientServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun batch(): BatchService.WithRawResponse = batch

        private val updateHandler: Handler<SimplePublicObject> =
            jsonHandler<SimplePublicObject>(clientOptions.jsonMapper)

        override fun update(
            params: PartnerClientUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SimplePublicObject> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("partnerClientId", params.partnerClientId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "crm",
                        "objects",
                        "2026-03",
                        "partner_clients",
                        params._pathParam(0),
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

        private val listHandler:
            Handler<CollectionResponseSimplePublicObjectWithAssociationsForwardPaging> =
            jsonHandler<CollectionResponseSimplePublicObjectWithAssociationsForwardPaging>(
                clientOptions.jsonMapper
            )

        override fun list(
            params: PartnerClientListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PartnerClientListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("crm", "objects", "2026-03", "partner_clients")
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
                    .let {
                        PartnerClientListPage.builder()
                            .service(PartnerClientServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val getHandler: Handler<SimplePublicObjectWithAssociations> =
            jsonHandler<SimplePublicObjectWithAssociations>(clientOptions.jsonMapper)

        override fun get(
            params: PartnerClientGetParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SimplePublicObjectWithAssociations> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("partnerClientId", params.partnerClientId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "crm",
                        "objects",
                        "2026-03",
                        "partner_clients",
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

        private val listAssociationsHandler:
            Handler<CollectionResponseMultiAssociatedObjectWithLabelForwardPaging> =
            jsonHandler<CollectionResponseMultiAssociatedObjectWithLabelForwardPaging>(
                clientOptions.jsonMapper
            )

        override fun listAssociations(
            params: PartnerClientListAssociationsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PartnerClientListAssociationsPage> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("toObjectType", params.toObjectType().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "crm",
                        "objects",
                        "2026-03",
                        "partner_clients",
                        params._pathParam(0),
                        "associations",
                        params._pathParam(1),
                    )
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listAssociationsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let {
                        PartnerClientListAssociationsPage.builder()
                            .service(PartnerClientServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val searchHandler: Handler<CollectionResponseWithTotalSimplePublicObject> =
            jsonHandler<CollectionResponseWithTotalSimplePublicObject>(clientOptions.jsonMapper)

        override fun search(
            params: PartnerClientSearchParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CollectionResponseWithTotalSimplePublicObject> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("crm", "objects", "2026-03", "partner_clients", "search")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { searchHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
