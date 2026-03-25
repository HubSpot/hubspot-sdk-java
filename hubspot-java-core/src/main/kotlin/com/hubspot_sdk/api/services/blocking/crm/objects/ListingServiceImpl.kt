// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.crm.objects

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
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
import com.hubspot_sdk.api.models.crm.objects.BatchResponseSimplePublicObject
import com.hubspot_sdk.api.models.crm.objects.BatchResponseSimplePublicUpsertObject
import com.hubspot_sdk.api.models.crm.objects.CollectionResponseSimplePublicObjectWithAssociationsForwardPaging
import com.hubspot_sdk.api.models.crm.objects.CollectionResponseWithTotalSimplePublicObject
import com.hubspot_sdk.api.models.crm.objects.listings.ListingCreateParams
import com.hubspot_sdk.api.models.crm.objects.listings.ListingDeleteParams
import com.hubspot_sdk.api.models.crm.objects.listings.ListingGetParams
import com.hubspot_sdk.api.models.crm.objects.listings.ListingListPage
import com.hubspot_sdk.api.models.crm.objects.listings.ListingListParams
import com.hubspot_sdk.api.models.crm.objects.listings.ListingSearchParams
import com.hubspot_sdk.api.models.crm.objects.listings.ListingUpdateParams
import com.hubspot_sdk.api.models.crm.objects.listings.ListingUpsertParams
import java.util.function.Consumer

class ListingServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    ListingService {

    private val withRawResponse: ListingService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ListingService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ListingService =
        ListingServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: ListingCreateParams,
        requestOptions: RequestOptions,
    ): BatchResponseSimplePublicObject =
        // post /crm/objects/2026-03/0-420/batch/create
        withRawResponse().create(params, requestOptions).parse()

    override fun update(
        params: ListingUpdateParams,
        requestOptions: RequestOptions,
    ): BatchResponseSimplePublicObject =
        // post /crm/objects/2026-03/0-420/batch/update
        withRawResponse().update(params, requestOptions).parse()

    override fun list(params: ListingListParams, requestOptions: RequestOptions): ListingListPage =
        // get /crm/objects/2026-03/0-420
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: ListingDeleteParams, requestOptions: RequestOptions) {
        // post /crm/objects/2026-03/0-420/batch/archive
        withRawResponse().delete(params, requestOptions)
    }

    override fun get(
        params: ListingGetParams,
        requestOptions: RequestOptions,
    ): BatchResponseSimplePublicObject =
        // post /crm/objects/2026-03/0-420/batch/read
        withRawResponse().get(params, requestOptions).parse()

    override fun search(
        params: ListingSearchParams,
        requestOptions: RequestOptions,
    ): CollectionResponseWithTotalSimplePublicObject =
        // post /crm/objects/2026-03/0-420/search
        withRawResponse().search(params, requestOptions).parse()

    override fun upsert(
        params: ListingUpsertParams,
        requestOptions: RequestOptions,
    ): BatchResponseSimplePublicUpsertObject =
        // post /crm/objects/2026-03/0-420/batch/upsert
        withRawResponse().upsert(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ListingService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ListingService.WithRawResponse =
            ListingServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<BatchResponseSimplePublicObject> =
            jsonHandler<BatchResponseSimplePublicObject>(clientOptions.jsonMapper)

        override fun create(
            params: ListingCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BatchResponseSimplePublicObject> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("crm", "objects", "2026-03", "0-420", "batch", "create")
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

        private val updateHandler: Handler<BatchResponseSimplePublicObject> =
            jsonHandler<BatchResponseSimplePublicObject>(clientOptions.jsonMapper)

        override fun update(
            params: ListingUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BatchResponseSimplePublicObject> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("crm", "objects", "2026-03", "0-420", "batch", "update")
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
            params: ListingListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ListingListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("crm", "objects", "2026-03", "0-420")
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
                        ListingListPage.builder()
                            .service(ListingServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: ListingDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("crm", "objects", "2026-03", "0-420", "batch", "archive")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { deleteHandler.handle(it) }
            }
        }

        private val getHandler: Handler<BatchResponseSimplePublicObject> =
            jsonHandler<BatchResponseSimplePublicObject>(clientOptions.jsonMapper)

        override fun get(
            params: ListingGetParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BatchResponseSimplePublicObject> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("crm", "objects", "2026-03", "0-420", "batch", "read")
                    .body(json(clientOptions.jsonMapper, params._body()))
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
            params: ListingSearchParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CollectionResponseWithTotalSimplePublicObject> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("crm", "objects", "2026-03", "0-420", "search")
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

        private val upsertHandler: Handler<BatchResponseSimplePublicUpsertObject> =
            jsonHandler<BatchResponseSimplePublicUpsertObject>(clientOptions.jsonMapper)

        override fun upsert(
            params: ListingUpsertParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BatchResponseSimplePublicUpsertObject> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("crm", "objects", "2026-03", "0-420", "batch", "upsert")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { upsertHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
