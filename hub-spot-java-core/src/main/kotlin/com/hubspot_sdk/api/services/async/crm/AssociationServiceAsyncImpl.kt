// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.crm

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
import com.hubspot_sdk.api.models.crm.associations.AssociationCreateParams
import com.hubspot_sdk.api.models.crm.associations.AssociationDeleteParams
import com.hubspot_sdk.api.models.crm.associations.AssociationReadParams
import com.hubspot_sdk.api.models.crm.associations.BatchResponsePublicAssociation
import com.hubspot_sdk.api.models.crm.associations.BatchResponsePublicAssociationMulti
import com.hubspot_sdk.api.services.async.crm.associations.SchemaServiceAsync
import com.hubspot_sdk.api.services.async.crm.associations.SchemaServiceAsyncImpl
import com.hubspot_sdk.api.services.async.crm.associations.V4ServiceAsync
import com.hubspot_sdk.api.services.async.crm.associations.V4ServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class AssociationServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    AssociationServiceAsync {

    private val withRawResponse: AssociationServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val schema: SchemaServiceAsync by lazy { SchemaServiceAsyncImpl(clientOptions) }

    private val v4: V4ServiceAsync by lazy { V4ServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): AssociationServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): AssociationServiceAsync =
        AssociationServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun schema(): SchemaServiceAsync = schema

    override fun v4(): V4ServiceAsync = v4

    override fun create(
        params: AssociationCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BatchResponsePublicAssociation> =
        // post /crm/v3/associations/{fromObjectType}/{toObjectType}/batch/create
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: AssociationDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // post /crm/v3/associations/{fromObjectType}/{toObjectType}/batch/archive
        withRawResponse().delete(params, requestOptions).thenAccept {}

    override fun read(
        params: AssociationReadParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BatchResponsePublicAssociationMulti> =
        // post /crm/v3/associations/{fromObjectType}/{toObjectType}/batch/read
        withRawResponse().read(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AssociationServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val schema: SchemaServiceAsync.WithRawResponse by lazy {
            SchemaServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val v4: V4ServiceAsync.WithRawResponse by lazy {
            V4ServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AssociationServiceAsync.WithRawResponse =
            AssociationServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun schema(): SchemaServiceAsync.WithRawResponse = schema

        override fun v4(): V4ServiceAsync.WithRawResponse = v4

        private val createHandler: Handler<BatchResponsePublicAssociation> =
            jsonHandler<BatchResponsePublicAssociation>(clientOptions.jsonMapper)

        override fun create(
            params: AssociationCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BatchResponsePublicAssociation>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("toObjectType", params.toObjectType().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "crm",
                        "v3",
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

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: AssociationDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("toObjectType", params.toObjectType().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "crm",
                        "v3",
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
                        response.use { deleteHandler.handle(it) }
                    }
                }
        }

        private val readHandler: Handler<BatchResponsePublicAssociationMulti> =
            jsonHandler<BatchResponsePublicAssociationMulti>(clientOptions.jsonMapper)

        override fun read(
            params: AssociationReadParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BatchResponsePublicAssociationMulti>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("toObjectType", params.toObjectType().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "crm",
                        "v3",
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
                            .use { readHandler.handle(it) }
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
