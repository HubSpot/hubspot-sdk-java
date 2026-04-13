// File generated from our OpenAPI spec by Stainless.

package com.hubspot.services.async.crm.objects

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
import com.hubspot.models.crm.CollectionResponseWithTotalSimplePublicObject
import com.hubspot.models.crm.SimplePublicObject
import com.hubspot.models.crm.objects.CollectionResponseSimplePublicObjectWithAssociationsForwardPaging
import com.hubspot.models.crm.objects.SimplePublicObjectWithAssociations
import com.hubspot.models.crm.objects.services.ServiceCreateParams
import com.hubspot.models.crm.objects.services.ServiceDeleteParams
import com.hubspot.models.crm.objects.services.ServiceGetParams
import com.hubspot.models.crm.objects.services.ServiceListPageAsync
import com.hubspot.models.crm.objects.services.ServiceListParams
import com.hubspot.models.crm.objects.services.ServiceSearchParams
import com.hubspot.models.crm.objects.services.ServiceUpdateParams
import com.hubspot.services.async.crm.objects.services.BatchServiceAsync
import com.hubspot.services.async.crm.objects.services.BatchServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class ServiceServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    ServiceServiceAsync {

    private val withRawResponse: ServiceServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val batch: BatchServiceAsync by lazy { BatchServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): ServiceServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ServiceServiceAsync =
        ServiceServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun batch(): BatchServiceAsync = batch

    override fun create(
        params: ServiceCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<SimplePublicObject> =
        // post /crm/objects/2026-03/0-162
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: ServiceUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<SimplePublicObject> =
        // patch /crm/objects/2026-03/0-162/{serviceId}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: ServiceListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ServiceListPageAsync> =
        // get /crm/objects/2026-03/0-162
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: ServiceDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // delete /crm/objects/2026-03/0-162/{serviceId}
        withRawResponse().delete(params, requestOptions).thenAccept {}

    override fun get(
        params: ServiceGetParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<SimplePublicObjectWithAssociations> =
        // get /crm/objects/2026-03/0-162/{serviceId}
        withRawResponse().get(params, requestOptions).thenApply { it.parse() }

    override fun search(
        params: ServiceSearchParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CollectionResponseWithTotalSimplePublicObject> =
        // post /crm/objects/2026-03/0-162/search
        withRawResponse().search(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ServiceServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val batch: BatchServiceAsync.WithRawResponse by lazy {
            BatchServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ServiceServiceAsync.WithRawResponse =
            ServiceServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun batch(): BatchServiceAsync.WithRawResponse = batch

        private val createHandler: Handler<SimplePublicObject> =
            jsonHandler<SimplePublicObject>(clientOptions.jsonMapper)

        override fun create(
            params: ServiceCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("crm", "objects", "2026-03", "0-162")
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

        private val updateHandler: Handler<SimplePublicObject> =
            jsonHandler<SimplePublicObject>(clientOptions.jsonMapper)

        override fun update(
            params: ServiceUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("serviceId", params.serviceId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("crm", "objects", "2026-03", "0-162", params._pathParam(0))
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
            params: ServiceListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ServiceListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("crm", "objects", "2026-03", "0-162")
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
                                ServiceListPageAsync.builder()
                                    .service(ServiceServiceAsyncImpl(clientOptions))
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
            params: ServiceDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("serviceId", params.serviceId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("crm", "objects", "2026-03", "0-162", params._pathParam(0))
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

        private val getHandler: Handler<SimplePublicObjectWithAssociations> =
            jsonHandler<SimplePublicObjectWithAssociations>(clientOptions.jsonMapper)

        override fun get(
            params: ServiceGetParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SimplePublicObjectWithAssociations>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("serviceId", params.serviceId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("crm", "objects", "2026-03", "0-162", params._pathParam(0))
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
            params: ServiceSearchParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CollectionResponseWithTotalSimplePublicObject>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("crm", "objects", "2026-03", "0-162", "search")
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
    }
}
