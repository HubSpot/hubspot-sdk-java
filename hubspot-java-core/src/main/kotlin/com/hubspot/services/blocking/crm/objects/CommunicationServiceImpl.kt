// File generated from our OpenAPI spec by Stainless.

package com.hubspot.services.blocking.crm.objects

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
import com.hubspot.core.prepare
import com.hubspot.models.crm.CollectionResponseWithTotalSimplePublicObject
import com.hubspot.models.crm.SimplePublicObject
import com.hubspot.models.crm.objects.CollectionResponseSimplePublicObjectWithAssociationsForwardPaging
import com.hubspot.models.crm.objects.SimplePublicObjectWithAssociations
import com.hubspot.models.crm.objects.communications.CommunicationCreateParams
import com.hubspot.models.crm.objects.communications.CommunicationDeleteParams
import com.hubspot.models.crm.objects.communications.CommunicationGetParams
import com.hubspot.models.crm.objects.communications.CommunicationListPage
import com.hubspot.models.crm.objects.communications.CommunicationListParams
import com.hubspot.models.crm.objects.communications.CommunicationSearchParams
import com.hubspot.models.crm.objects.communications.CommunicationUpdateParams
import com.hubspot.services.blocking.crm.objects.communications.BatchService
import com.hubspot.services.blocking.crm.objects.communications.BatchServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class CommunicationServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    CommunicationService {

    private val withRawResponse: CommunicationService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val batch: BatchService by lazy { BatchServiceImpl(clientOptions) }

    override fun withRawResponse(): CommunicationService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): CommunicationService =
        CommunicationServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun batch(): BatchService = batch

    override fun create(
        params: CommunicationCreateParams,
        requestOptions: RequestOptions,
    ): SimplePublicObject =
        // post /crm/objects/2026-03/communications
        withRawResponse().create(params, requestOptions).parse()

    override fun update(
        params: CommunicationUpdateParams,
        requestOptions: RequestOptions,
    ): SimplePublicObject =
        // patch /crm/objects/2026-03/communications/{communicationId}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(
        params: CommunicationListParams,
        requestOptions: RequestOptions,
    ): CommunicationListPage =
        // get /crm/objects/2026-03/communications
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: CommunicationDeleteParams, requestOptions: RequestOptions) {
        // delete /crm/objects/2026-03/communications/{communicationId}
        withRawResponse().delete(params, requestOptions)
    }

    override fun get(
        params: CommunicationGetParams,
        requestOptions: RequestOptions,
    ): SimplePublicObjectWithAssociations =
        // get /crm/objects/2026-03/communications/{communicationId}
        withRawResponse().get(params, requestOptions).parse()

    override fun search(
        params: CommunicationSearchParams,
        requestOptions: RequestOptions,
    ): CollectionResponseWithTotalSimplePublicObject =
        // post /crm/objects/2026-03/communications/search
        withRawResponse().search(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CommunicationService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val batch: BatchService.WithRawResponse by lazy {
            BatchServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CommunicationService.WithRawResponse =
            CommunicationServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun batch(): BatchService.WithRawResponse = batch

        private val createHandler: Handler<SimplePublicObject> =
            jsonHandler<SimplePublicObject>(clientOptions.jsonMapper)

        override fun create(
            params: CommunicationCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SimplePublicObject> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("crm", "objects", "2026-03", "communications")
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

        private val updateHandler: Handler<SimplePublicObject> =
            jsonHandler<SimplePublicObject>(clientOptions.jsonMapper)

        override fun update(
            params: CommunicationUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SimplePublicObject> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("communicationId", params.communicationId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "crm",
                        "objects",
                        "2026-03",
                        "communications",
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
            params: CommunicationListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CommunicationListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("crm", "objects", "2026-03", "communications")
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
                        CommunicationListPage.builder()
                            .service(CommunicationServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: CommunicationDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("communicationId", params.communicationId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "crm",
                        "objects",
                        "2026-03",
                        "communications",
                        params._pathParam(0),
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

        private val getHandler: Handler<SimplePublicObjectWithAssociations> =
            jsonHandler<SimplePublicObjectWithAssociations>(clientOptions.jsonMapper)

        override fun get(
            params: CommunicationGetParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SimplePublicObjectWithAssociations> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("communicationId", params.communicationId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "crm",
                        "objects",
                        "2026-03",
                        "communications",
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
            params: CommunicationSearchParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CollectionResponseWithTotalSimplePublicObject> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("crm", "objects", "2026-03", "communications", "search")
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
