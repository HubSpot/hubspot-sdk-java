// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.async.crm

import com.hubspot.sdk.core.ClientOptions
import com.hubspot.sdk.core.RequestOptions
import com.hubspot.sdk.core.checkRequired
import com.hubspot.sdk.core.handlers.emptyHandler
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
import com.hubspot.sdk.core.prepareAsync
import com.hubspot.sdk.models.AssociationDefinition
import com.hubspot.sdk.models.ObjectTypeDefinition
import com.hubspot.sdk.models.crm.objectschemas.CollectionResponseObjectSchemaNoPaging
import com.hubspot.sdk.models.crm.objectschemas.ObjectSchema
import com.hubspot.sdk.models.crm.objectschemas.ObjectSchemaCreateAssociationParams
import com.hubspot.sdk.models.crm.objectschemas.ObjectSchemaCreateParams
import com.hubspot.sdk.models.crm.objectschemas.ObjectSchemaDeleteAssociationParams
import com.hubspot.sdk.models.crm.objectschemas.ObjectSchemaDeleteParams
import com.hubspot.sdk.models.crm.objectschemas.ObjectSchemaGetParams
import com.hubspot.sdk.models.crm.objectschemas.ObjectSchemaListParams
import com.hubspot.sdk.models.crm.objectschemas.ObjectSchemaUpdateParams
import com.hubspot.sdk.services.async.crm.objectschemas.BatchServiceAsync
import com.hubspot.sdk.services.async.crm.objectschemas.BatchServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class ObjectSchemaServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    ObjectSchemaServiceAsync {

    private val withRawResponse: ObjectSchemaServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val batch: BatchServiceAsync by lazy { BatchServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): ObjectSchemaServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ObjectSchemaServiceAsync =
        ObjectSchemaServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun batch(): BatchServiceAsync = batch

    override fun create(
        params: ObjectSchemaCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ObjectSchema> =
        // post /crm-object-schemas/2026-03/schemas
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: ObjectSchemaUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ObjectTypeDefinition> =
        // patch /crm-object-schemas/2026-03/schemas/{objectType}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: ObjectSchemaListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CollectionResponseObjectSchemaNoPaging> =
        // get /crm-object-schemas/2026-03/schemas
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: ObjectSchemaDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // delete /crm-object-schemas/2026-03/schemas/{objectType}
        withRawResponse().delete(params, requestOptions).thenAccept {}

    override fun createAssociation(
        params: ObjectSchemaCreateAssociationParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AssociationDefinition> =
        // post /crm-object-schemas/2026-03/schemas/{objectType}/associations
        withRawResponse().createAssociation(params, requestOptions).thenApply { it.parse() }

    override fun deleteAssociation(
        params: ObjectSchemaDeleteAssociationParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // delete
        // /crm-object-schemas/2026-03/schemas/{objectType}/associations/{associationIdentifier}
        withRawResponse().deleteAssociation(params, requestOptions).thenAccept {}

    override fun get(
        params: ObjectSchemaGetParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ObjectSchema> =
        // get /crm-object-schemas/2026-03/schemas/{objectType}
        withRawResponse().get(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ObjectSchemaServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val batch: BatchServiceAsync.WithRawResponse by lazy {
            BatchServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ObjectSchemaServiceAsync.WithRawResponse =
            ObjectSchemaServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun batch(): BatchServiceAsync.WithRawResponse = batch

        private val createHandler: Handler<ObjectSchema> =
            jsonHandler<ObjectSchema>(clientOptions.jsonMapper)

        override fun create(
            params: ObjectSchemaCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ObjectSchema>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("crm-object-schemas", "2026-03", "schemas")
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

        private val updateHandler: Handler<ObjectTypeDefinition> =
            jsonHandler<ObjectTypeDefinition>(clientOptions.jsonMapper)

        override fun update(
            params: ObjectSchemaUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ObjectTypeDefinition>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("objectType", params.objectType().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "crm-object-schemas",
                        "2026-03",
                        "schemas",
                        params._pathParam(0),
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

        private val listHandler: Handler<CollectionResponseObjectSchemaNoPaging> =
            jsonHandler<CollectionResponseObjectSchemaNoPaging>(clientOptions.jsonMapper)

        override fun list(
            params: ObjectSchemaListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CollectionResponseObjectSchemaNoPaging>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("crm-object-schemas", "2026-03", "schemas")
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
            params: ObjectSchemaDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("objectType", params.objectType().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "crm-object-schemas",
                        "2026-03",
                        "schemas",
                        params._pathParam(0),
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

        private val createAssociationHandler: Handler<AssociationDefinition> =
            jsonHandler<AssociationDefinition>(clientOptions.jsonMapper)

        override fun createAssociation(
            params: ObjectSchemaCreateAssociationParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AssociationDefinition>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("objectType", params.objectType().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "crm-object-schemas",
                        "2026-03",
                        "schemas",
                        params._pathParam(0),
                        "associations",
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
                            .use { createAssociationHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val deleteAssociationHandler: Handler<Void?> = emptyHandler()

        override fun deleteAssociation(
            params: ObjectSchemaDeleteAssociationParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("associationIdentifier", params.associationIdentifier().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "crm-object-schemas",
                        "2026-03",
                        "schemas",
                        params._pathParam(0),
                        "associations",
                        params._pathParam(1),
                    )
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { deleteAssociationHandler.handle(it) }
                    }
                }
        }

        private val getHandler: Handler<ObjectSchema> =
            jsonHandler<ObjectSchema>(clientOptions.jsonMapper)

        override fun get(
            params: ObjectSchemaGetParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ObjectSchema>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("objectType", params.objectType().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "crm-object-schemas",
                        "2026-03",
                        "schemas",
                        params._pathParam(0),
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
    }
}
