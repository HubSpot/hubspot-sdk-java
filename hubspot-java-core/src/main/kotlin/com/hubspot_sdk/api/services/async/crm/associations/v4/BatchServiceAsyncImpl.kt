// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.crm.associations.v4

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.checkRequired
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
import com.hubspot_sdk.api.models.crm.BatchResponsePublicDefaultAssociation
import com.hubspot_sdk.api.models.crm.associations.BatchResponseVoid
import com.hubspot_sdk.api.models.crm.associations.v4.BatchResponseLabelsBetweenObjectPair
import com.hubspot_sdk.api.models.crm.associations.v4.BatchResponsePublicAssociationMultiWithLabel
import com.hubspot_sdk.api.models.crm.associations.v4.batch.BatchCreateDefaultParams
import com.hubspot_sdk.api.models.crm.associations.v4.batch.BatchCreateParams
import com.hubspot_sdk.api.models.crm.associations.v4.batch.BatchDeleteLabelsParams
import com.hubspot_sdk.api.models.crm.associations.v4.batch.BatchDeleteParams
import com.hubspot_sdk.api.models.crm.associations.v4.batch.BatchGetParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class BatchServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    BatchServiceAsync {

    private val withRawResponse: BatchServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): BatchServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): BatchServiceAsync =
        BatchServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: BatchCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BatchResponseLabelsBetweenObjectPair> =
        // post /crm/v4/associations/{fromObjectType}/{toObjectType}/batch/create
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: BatchDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BatchResponseVoid> =
        // post /crm/v4/associations/{fromObjectType}/{toObjectType}/batch/archive
        withRawResponse().delete(params, requestOptions).thenApply { it.parse() }

    override fun createDefault(
        params: BatchCreateDefaultParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BatchResponsePublicDefaultAssociation> =
        // post /crm/v4/associations/{fromObjectType}/{toObjectType}/batch/associate/default
        withRawResponse().createDefault(params, requestOptions).thenApply { it.parse() }

    override fun deleteLabels(
        params: BatchDeleteLabelsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BatchResponseVoid> =
        // post /crm/v4/associations/{fromObjectType}/{toObjectType}/batch/labels/archive
        withRawResponse().deleteLabels(params, requestOptions).thenApply { it.parse() }

    override fun get(
        params: BatchGetParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BatchResponsePublicAssociationMultiWithLabel> =
        // post /crm/v4/associations/{fromObjectType}/{toObjectType}/batch/read
        withRawResponse().get(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        BatchServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): BatchServiceAsync.WithRawResponse =
            BatchServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<BatchResponseLabelsBetweenObjectPair> =
            jsonHandler<BatchResponseLabelsBetweenObjectPair>(clientOptions.jsonMapper)

        override fun create(
            params: BatchCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BatchResponseLabelsBetweenObjectPair>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("toObjectType", params.toObjectType().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "crm",
                        "v4",
                        "associations",
                        params._pathParam(0),
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
                            .use { createHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val deleteHandler: Handler<BatchResponseVoid> =
            jsonHandler<BatchResponseVoid>(clientOptions.jsonMapper)

        override fun delete(
            params: BatchDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BatchResponseVoid>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("toObjectType", params.toObjectType().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "crm",
                        "v4",
                        "associations",
                        params._pathParam(0),
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
                        response
                            .use { deleteHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val createDefaultHandler: Handler<BatchResponsePublicDefaultAssociation> =
            jsonHandler<BatchResponsePublicDefaultAssociation>(clientOptions.jsonMapper)

        override fun createDefault(
            params: BatchCreateDefaultParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BatchResponsePublicDefaultAssociation>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("toObjectType", params.toObjectType().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "crm",
                        "v4",
                        "associations",
                        params._pathParam(0),
                        params._pathParam(1),
                        "batch",
                        "associate",
                        "default",
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
                            .use { createDefaultHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val deleteLabelsHandler: Handler<BatchResponseVoid> =
            jsonHandler<BatchResponseVoid>(clientOptions.jsonMapper)

        override fun deleteLabels(
            params: BatchDeleteLabelsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BatchResponseVoid>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("toObjectType", params.toObjectType().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "crm",
                        "v4",
                        "associations",
                        params._pathParam(0),
                        params._pathParam(1),
                        "batch",
                        "labels",
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
                        response
                            .use { deleteLabelsHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val getHandler: Handler<BatchResponsePublicAssociationMultiWithLabel> =
            jsonHandler<BatchResponsePublicAssociationMultiWithLabel>(clientOptions.jsonMapper)

        override fun get(
            params: BatchGetParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BatchResponsePublicAssociationMultiWithLabel>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("toObjectType", params.toObjectType().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "crm",
                        "v4",
                        "associations",
                        params._pathParam(0),
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
                            .use { getHandler.handle(it) }
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
