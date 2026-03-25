// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.crm.objects

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
import com.hubspot_sdk.api.core.prepareAsync
import com.hubspot_sdk.api.models.crm.objects.BatchResponseSimplePublicObject
import com.hubspot_sdk.api.models.crm.objects.BatchResponseSimplePublicUpsertObject
import com.hubspot_sdk.api.models.crm.objects.CollectionResponseSimplePublicObjectWithAssociationsForwardPaging
import com.hubspot_sdk.api.models.crm.objects.CollectionResponseWithTotalSimplePublicObject
import com.hubspot_sdk.api.models.crm.objects.listings.ListingCreateParams
import com.hubspot_sdk.api.models.crm.objects.listings.ListingDeleteParams
import com.hubspot_sdk.api.models.crm.objects.listings.ListingGetParams
import com.hubspot_sdk.api.models.crm.objects.listings.ListingListPageAsync
import com.hubspot_sdk.api.models.crm.objects.listings.ListingListParams
import com.hubspot_sdk.api.models.crm.objects.listings.ListingSearchParams
import com.hubspot_sdk.api.models.crm.objects.listings.ListingUpdateParams
import com.hubspot_sdk.api.models.crm.objects.listings.ListingUpsertParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class ListingServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    ListingServiceAsync {

    private val withRawResponse: ListingServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ListingServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ListingServiceAsync =
        ListingServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: ListingCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BatchResponseSimplePublicObject> =
        // post /crm/objects/2026-03/0-420/batch/create
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: ListingUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BatchResponseSimplePublicObject> =
        // post /crm/objects/2026-03/0-420/batch/update
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: ListingListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ListingListPageAsync> =
        // get /crm/objects/2026-03/0-420
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: ListingDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // post /crm/objects/2026-03/0-420/batch/archive
        withRawResponse().delete(params, requestOptions).thenAccept {}

    override fun get(
        params: ListingGetParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BatchResponseSimplePublicObject> =
        // post /crm/objects/2026-03/0-420/batch/read
        withRawResponse().get(params, requestOptions).thenApply { it.parse() }

    override fun search(
        params: ListingSearchParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CollectionResponseWithTotalSimplePublicObject> =
        // post /crm/objects/2026-03/0-420/search
        withRawResponse().search(params, requestOptions).thenApply { it.parse() }

    override fun upsert(
        params: ListingUpsertParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BatchResponseSimplePublicUpsertObject> =
        // post /crm/objects/2026-03/0-420/batch/upsert
        withRawResponse().upsert(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ListingServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ListingServiceAsync.WithRawResponse =
            ListingServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<BatchResponseSimplePublicObject> =
            jsonHandler<BatchResponseSimplePublicObject>(clientOptions.jsonMapper)

        override fun create(
            params: ListingCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BatchResponseSimplePublicObject>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("crm", "objects", "2026-03", "0-420", "batch", "create")
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

        private val updateHandler: Handler<BatchResponseSimplePublicObject> =
            jsonHandler<BatchResponseSimplePublicObject>(clientOptions.jsonMapper)

        override fun update(
            params: ListingUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BatchResponseSimplePublicObject>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("crm", "objects", "2026-03", "0-420", "batch", "update")
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

        private val listHandler:
            Handler<CollectionResponseSimplePublicObjectWithAssociationsForwardPaging> =
            jsonHandler<CollectionResponseSimplePublicObjectWithAssociationsForwardPaging>(
                clientOptions.jsonMapper
            )

        override fun list(
            params: ListingListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ListingListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("crm", "objects", "2026-03", "0-420")
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
                            .let {
                                ListingListPageAsync.builder()
                                    .service(ListingServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: ListingDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("crm", "objects", "2026-03", "0-420", "batch", "archive")
                    .body(json(clientOptions.jsonMapper, params._body()))
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

        private val getHandler: Handler<BatchResponseSimplePublicObject> =
            jsonHandler<BatchResponseSimplePublicObject>(clientOptions.jsonMapper)

        override fun get(
            params: ListingGetParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BatchResponseSimplePublicObject>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("crm", "objects", "2026-03", "0-420", "batch", "read")
                    .body(json(clientOptions.jsonMapper, params._body()))
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

        private val searchHandler: Handler<CollectionResponseWithTotalSimplePublicObject> =
            jsonHandler<CollectionResponseWithTotalSimplePublicObject>(clientOptions.jsonMapper)

        override fun search(
            params: ListingSearchParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CollectionResponseWithTotalSimplePublicObject>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("crm", "objects", "2026-03", "0-420", "search")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
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

        private val upsertHandler: Handler<BatchResponseSimplePublicUpsertObject> =
            jsonHandler<BatchResponseSimplePublicUpsertObject>(clientOptions.jsonMapper)

        override fun upsert(
            params: ListingUpsertParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BatchResponseSimplePublicUpsertObject>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("crm", "objects", "2026-03", "0-420", "batch", "upsert")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
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
}
