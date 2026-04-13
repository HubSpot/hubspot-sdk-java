// File generated from our OpenAPI spec by Stainless.

package com.hubspot.services.blocking.crm.objects

import com.hubspot.core.ClientOptions
import com.hubspot.core.RequestOptions
import com.hubspot.core.checkRequired
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
import com.hubspot.core.prepare
import com.hubspot.models.crm.CollectionResponseMultiAssociatedObjectWithLabelForwardPaging
import com.hubspot.models.crm.CollectionResponseWithTotalSimplePublicObject
import com.hubspot.models.crm.SimplePublicObject
import com.hubspot.models.crm.objects.SimplePublicObjectWithAssociations
import com.hubspot.models.crm.objects.partnerservices.PartnerServiceGetParams
import com.hubspot.models.crm.objects.partnerservices.PartnerServiceListPage
import com.hubspot.models.crm.objects.partnerservices.PartnerServiceListParams
import com.hubspot.models.crm.objects.partnerservices.PartnerServiceSearchParams
import com.hubspot.models.crm.objects.partnerservices.PartnerServiceUpdateParams
import com.hubspot.services.blocking.crm.objects.partnerservices.BatchService
import com.hubspot.services.blocking.crm.objects.partnerservices.BatchServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class PartnerServiceServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    PartnerServiceService {

    private val withRawResponse: PartnerServiceService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val batch: BatchService by lazy { BatchServiceImpl(clientOptions) }

    override fun withRawResponse(): PartnerServiceService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): PartnerServiceService =
        PartnerServiceServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun batch(): BatchService = batch

    override fun update(
        params: PartnerServiceUpdateParams,
        requestOptions: RequestOptions,
    ): SimplePublicObject =
        // patch /crm/objects/2026-03/partner_services/{partnerServiceId}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(
        params: PartnerServiceListParams,
        requestOptions: RequestOptions,
    ): PartnerServiceListPage =
        // get /crm/objects/2026-03/partner_services/{partnerServiceId}/associations/{toObjectType}
        withRawResponse().list(params, requestOptions).parse()

    override fun get(
        params: PartnerServiceGetParams,
        requestOptions: RequestOptions,
    ): SimplePublicObjectWithAssociations =
        // get /crm/objects/2026-03/partner_services/{partnerServiceId}
        withRawResponse().get(params, requestOptions).parse()

    override fun search(
        params: PartnerServiceSearchParams,
        requestOptions: RequestOptions,
    ): CollectionResponseWithTotalSimplePublicObject =
        // post /crm/objects/2026-03/partner_services/search
        withRawResponse().search(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PartnerServiceService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val batch: BatchService.WithRawResponse by lazy {
            BatchServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PartnerServiceService.WithRawResponse =
            PartnerServiceServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun batch(): BatchService.WithRawResponse = batch

        private val updateHandler: Handler<SimplePublicObject> =
            jsonHandler<SimplePublicObject>(clientOptions.jsonMapper)

        override fun update(
            params: PartnerServiceUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SimplePublicObject> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("partnerServiceId", params.partnerServiceId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "crm",
                        "objects",
                        "2026-03",
                        "partner_services",
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
            Handler<CollectionResponseMultiAssociatedObjectWithLabelForwardPaging> =
            jsonHandler<CollectionResponseMultiAssociatedObjectWithLabelForwardPaging>(
                clientOptions.jsonMapper
            )

        override fun list(
            params: PartnerServiceListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PartnerServiceListPage> {
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
                        "partner_services",
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
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let {
                        PartnerServiceListPage.builder()
                            .service(PartnerServiceServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val getHandler: Handler<SimplePublicObjectWithAssociations> =
            jsonHandler<SimplePublicObjectWithAssociations>(clientOptions.jsonMapper)

        override fun get(
            params: PartnerServiceGetParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SimplePublicObjectWithAssociations> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("partnerServiceId", params.partnerServiceId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "crm",
                        "objects",
                        "2026-03",
                        "partner_services",
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

        private val searchHandler: Handler<CollectionResponseWithTotalSimplePublicObject> =
            jsonHandler<CollectionResponseWithTotalSimplePublicObject>(clientOptions.jsonMapper)

        override fun search(
            params: PartnerServiceSearchParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CollectionResponseWithTotalSimplePublicObject> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("crm", "objects", "2026-03", "partner_services", "search")
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
