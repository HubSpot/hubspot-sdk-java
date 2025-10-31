// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.cms.mediabridge

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
import com.hubspot_sdk.api.models.BatchResponseProperty
import com.hubspot_sdk.api.models.Property
import com.hubspot_sdk.api.models.cms.mediabridge.properties.PropertyArchiveBatchParams
import com.hubspot_sdk.api.models.cms.mediabridge.properties.PropertyCreateBatchParams
import com.hubspot_sdk.api.models.cms.mediabridge.properties.PropertyCreateParams
import com.hubspot_sdk.api.models.cms.mediabridge.properties.PropertyDeleteParams
import com.hubspot_sdk.api.models.cms.mediabridge.properties.PropertyGetBatchParams
import com.hubspot_sdk.api.models.cms.mediabridge.properties.PropertyGetParams
import com.hubspot_sdk.api.models.cms.mediabridge.properties.PropertyListParams
import com.hubspot_sdk.api.models.cms.mediabridge.properties.PropertyListResponse
import com.hubspot_sdk.api.models.cms.mediabridge.properties.PropertyUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class PropertyServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    PropertyServiceAsync {

    private val withRawResponse: PropertyServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): PropertyServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): PropertyServiceAsync =
        PropertyServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: PropertyCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Property> =
        // post /media-bridge/v1/{appId}/properties/{objectType}
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: PropertyUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Property> =
        // patch /media-bridge/v1/{appId}/properties/{objectType}/{propertyName}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: PropertyListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PropertyListResponse> =
        // get /media-bridge/v1/{appId}/properties/{objectType}
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: PropertyDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // delete /media-bridge/v1/{appId}/properties/{objectType}/{propertyName}
        withRawResponse().delete(params, requestOptions).thenAccept {}

    override fun archiveBatch(
        params: PropertyArchiveBatchParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // post /media-bridge/v1/{appId}/properties/{objectType}/batch/archive
        withRawResponse().archiveBatch(params, requestOptions).thenAccept {}

    override fun createBatch(
        params: PropertyCreateBatchParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BatchResponseProperty> =
        // post /media-bridge/v1/{appId}/properties/{objectType}/batch/create
        withRawResponse().createBatch(params, requestOptions).thenApply { it.parse() }

    override fun get(
        params: PropertyGetParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Property> =
        // get /media-bridge/v1/{appId}/properties/{objectType}/{propertyName}
        withRawResponse().get(params, requestOptions).thenApply { it.parse() }

    override fun getBatch(
        params: PropertyGetBatchParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BatchResponseProperty> =
        // post /media-bridge/v1/{appId}/properties/{objectType}/batch/read
        withRawResponse().getBatch(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PropertyServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PropertyServiceAsync.WithRawResponse =
            PropertyServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<Property> =
            jsonHandler<Property>(clientOptions.jsonMapper)

        override fun create(
            params: PropertyCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Property>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("objectType", params.objectType().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "media-bridge",
                        "v1",
                        params._pathParam(0),
                        "properties",
                        params._pathParam(1),
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

        private val updateHandler: Handler<Property> =
            jsonHandler<Property>(clientOptions.jsonMapper)

        override fun update(
            params: PropertyUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Property>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("propertyName", params.propertyName().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "media-bridge",
                        "v1",
                        params._pathParam(0),
                        "properties",
                        params._pathParam(1),
                        params._pathParam(2),
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

        private val listHandler: Handler<PropertyListResponse> =
            jsonHandler<PropertyListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: PropertyListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PropertyListResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("objectType", params.objectType().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "media-bridge",
                        "v1",
                        params._pathParam(0),
                        "properties",
                        params._pathParam(1),
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
            params: PropertyDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("propertyName", params.propertyName().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "media-bridge",
                        "v1",
                        params._pathParam(0),
                        "properties",
                        params._pathParam(1),
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
                        response.use { deleteHandler.handle(it) }
                    }
                }
        }

        private val archiveBatchHandler: Handler<Void?> = emptyHandler()

        override fun archiveBatch(
            params: PropertyArchiveBatchParams,
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
                        "media-bridge",
                        "v1",
                        params._pathParam(0),
                        "properties",
                        params._pathParam(1),
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
                        response.use { archiveBatchHandler.handle(it) }
                    }
                }
        }

        private val createBatchHandler: Handler<BatchResponseProperty> =
            jsonHandler<BatchResponseProperty>(clientOptions.jsonMapper)

        override fun createBatch(
            params: PropertyCreateBatchParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BatchResponseProperty>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("objectType", params.objectType().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "media-bridge",
                        "v1",
                        params._pathParam(0),
                        "properties",
                        params._pathParam(1),
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
                            .use { createBatchHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val getHandler: Handler<Property> = jsonHandler<Property>(clientOptions.jsonMapper)

        override fun get(
            params: PropertyGetParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Property>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("propertyName", params.propertyName().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "media-bridge",
                        "v1",
                        params._pathParam(0),
                        "properties",
                        params._pathParam(1),
                        params._pathParam(2),
                    )
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

        private val getBatchHandler: Handler<BatchResponseProperty> =
            jsonHandler<BatchResponseProperty>(clientOptions.jsonMapper)

        override fun getBatch(
            params: PropertyGetBatchParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BatchResponseProperty>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("objectType", params.objectType().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "media-bridge",
                        "v1",
                        params._pathParam(0),
                        "properties",
                        params._pathParam(1),
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
                            .use { getBatchHandler.handle(it) }
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
