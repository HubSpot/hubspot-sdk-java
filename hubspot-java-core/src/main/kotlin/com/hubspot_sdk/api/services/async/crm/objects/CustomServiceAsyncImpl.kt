// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.crm.objects

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
import com.hubspot_sdk.api.models.crm.objects.BatchResponseSimplePublicObject
import com.hubspot_sdk.api.models.crm.objects.BatchResponseSimplePublicUpsertObject
import com.hubspot_sdk.api.models.crm.objects.CollectionResponseSimplePublicObjectWithAssociationsForwardPaging
import com.hubspot_sdk.api.models.crm.objects.CollectionResponseWithTotalSimplePublicObject
import com.hubspot_sdk.api.models.crm.objects.SimplePublicObject
import com.hubspot_sdk.api.models.crm.objects.custom.CustomCreateParams
import com.hubspot_sdk.api.models.crm.objects.custom.CustomDeleteParams
import com.hubspot_sdk.api.models.crm.objects.custom.CustomGetParams
import com.hubspot_sdk.api.models.crm.objects.custom.CustomListPageAsync
import com.hubspot_sdk.api.models.crm.objects.custom.CustomListParams
import com.hubspot_sdk.api.models.crm.objects.custom.CustomMergeParams
import com.hubspot_sdk.api.models.crm.objects.custom.CustomSearchParams
import com.hubspot_sdk.api.models.crm.objects.custom.CustomUpdateParams
import com.hubspot_sdk.api.models.crm.objects.custom.CustomUpsertParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class CustomServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    CustomServiceAsync {

    private val withRawResponse: CustomServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): CustomServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): CustomServiceAsync =
        CustomServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: CustomCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BatchResponseSimplePublicObject> =
        // post /crm/objects/2026-03/{objectType}/batch/create
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: CustomUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BatchResponseSimplePublicObject> =
        // post /crm/objects/2026-03/{objectType}/batch/update
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: CustomListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CustomListPageAsync> =
        // get /crm/objects/2026-03/{objectType}
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: CustomDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // post /crm/objects/2026-03/{objectType}/batch/archive
        withRawResponse().delete(params, requestOptions).thenAccept {}

    override fun get(
        params: CustomGetParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BatchResponseSimplePublicObject> =
        // post /crm/objects/2026-03/{objectType}/batch/read
        withRawResponse().get(params, requestOptions).thenApply { it.parse() }

    override fun merge(
        params: CustomMergeParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<SimplePublicObject> =
        // post /crm/objects/2026-03/{objectType}/merge
        withRawResponse().merge(params, requestOptions).thenApply { it.parse() }

    override fun search(
        params: CustomSearchParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CollectionResponseWithTotalSimplePublicObject> =
        // post /crm/objects/2026-03/{objectType}/search
        withRawResponse().search(params, requestOptions).thenApply { it.parse() }

    override fun upsert(
        params: CustomUpsertParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BatchResponseSimplePublicUpsertObject> =
        // post /crm/objects/2026-03/{objectType}/batch/upsert
        withRawResponse().upsert(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CustomServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CustomServiceAsync.WithRawResponse =
            CustomServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<BatchResponseSimplePublicObject> =
            jsonHandler<BatchResponseSimplePublicObject>(clientOptions.jsonMapper)

        override fun create(
            params: CustomCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BatchResponseSimplePublicObject>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("objectType", params.objectType().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "crm",
                        "objects",
                        "2026-03",
                        params._pathParam(0),
                        "batch",
                        "create",
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

        private val updateHandler: Handler<BatchResponseSimplePublicObject> =
            jsonHandler<BatchResponseSimplePublicObject>(clientOptions.jsonMapper)

        override fun update(
            params: CustomUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BatchResponseSimplePublicObject>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("objectType", params.objectType().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "crm",
                        "objects",
                        "2026-03",
                        params._pathParam(0),
                        "batch",
                        "update",
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

        private val listHandler:
            Handler<CollectionResponseSimplePublicObjectWithAssociationsForwardPaging> =
            jsonHandler<CollectionResponseSimplePublicObjectWithAssociationsForwardPaging>(
                clientOptions.jsonMapper
            )

        override fun list(
            params: CustomListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CustomListPageAsync>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("objectType", params.objectType().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("crm", "objects", "2026-03", params._pathParam(0))
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
                                CustomListPageAsync.builder()
                                    .service(CustomServiceAsyncImpl(clientOptions))
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
            params: CustomDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("objectType", params.objectType().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "crm",
                        "objects",
                        "2026-03",
                        params._pathParam(0),
                        "batch",
                        "archive",
                    )
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
            params: CustomGetParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BatchResponseSimplePublicObject>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("objectType", params.objectType().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "crm",
                        "objects",
                        "2026-03",
                        params._pathParam(0),
                        "batch",
                        "read",
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
                            .use { getHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val mergeHandler: Handler<SimplePublicObject> =
            jsonHandler<SimplePublicObject>(clientOptions.jsonMapper)

        override fun merge(
            params: CustomMergeParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("objectType", params.objectType().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("crm", "objects", "2026-03", params._pathParam(0), "merge")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { mergeHandler.handle(it) }
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
            params: CustomSearchParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CollectionResponseWithTotalSimplePublicObject>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("objectType", params.objectType().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("crm", "objects", "2026-03", params._pathParam(0), "search")
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
            params: CustomUpsertParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BatchResponseSimplePublicUpsertObject>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("objectType", params.objectType().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "crm",
                        "objects",
                        "2026-03",
                        params._pathParam(0),
                        "batch",
                        "upsert",
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
