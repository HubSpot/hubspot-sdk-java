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
import com.hubspot_sdk.api.models.crm.objects.schemas.ObjectSchema
import com.hubspot_sdk.api.models.crm.objects.schemas.ObjectsSchemasObjectTypeDefinition
import com.hubspot_sdk.api.models.crm.objects.schemas.SchemaCreateAssociationParams
import com.hubspot_sdk.api.models.crm.objects.schemas.SchemaCreateParams
import com.hubspot_sdk.api.models.crm.objects.schemas.SchemaDeleteAssociationParams
import com.hubspot_sdk.api.models.crm.objects.schemas.SchemaDeleteParams
import com.hubspot_sdk.api.models.crm.objects.schemas.SchemaGetParams
import com.hubspot_sdk.api.models.crm.objects.schemas.SchemaListParams
import com.hubspot_sdk.api.models.crm.objects.schemas.SchemaListResponse
import com.hubspot_sdk.api.models.crm.objects.schemas.SchemaUpdateParams
import com.hubspot_sdk.api.models.events.eventdefinitions.AssociationDefinition
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class SchemaServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    SchemaServiceAsync {

    private val withRawResponse: SchemaServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): SchemaServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): SchemaServiceAsync =
        SchemaServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: SchemaCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ObjectSchema> =
        // post /crm-object-schemas/v3/schemas
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: SchemaUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ObjectsSchemasObjectTypeDefinition> =
        // patch /crm-object-schemas/v3/schemas/{objectType}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: SchemaListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<SchemaListResponse> =
        // get /crm-object-schemas/v3/schemas
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: SchemaDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // delete /crm-object-schemas/v3/schemas/{objectType}
        withRawResponse().delete(params, requestOptions).thenAccept {}

    override fun createAssociation(
        params: SchemaCreateAssociationParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AssociationDefinition> =
        // post /crm-object-schemas/v3/schemas/{objectType}/associations
        withRawResponse().createAssociation(params, requestOptions).thenApply { it.parse() }

    override fun deleteAssociation(
        params: SchemaDeleteAssociationParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // delete /crm-object-schemas/v3/schemas/{objectType}/associations/{associationIdentifier}
        withRawResponse().deleteAssociation(params, requestOptions).thenAccept {}

    override fun get(
        params: SchemaGetParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ObjectSchema> =
        // get /crm-object-schemas/v3/schemas/{objectType}
        withRawResponse().get(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        SchemaServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SchemaServiceAsync.WithRawResponse =
            SchemaServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<ObjectSchema> =
            jsonHandler<ObjectSchema>(clientOptions.jsonMapper)

        override fun create(
            params: SchemaCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ObjectSchema>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("crm-object-schemas", "v3", "schemas")
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

        private val updateHandler: Handler<ObjectsSchemasObjectTypeDefinition> =
            jsonHandler<ObjectsSchemasObjectTypeDefinition>(clientOptions.jsonMapper)

        override fun update(
            params: SchemaUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ObjectsSchemasObjectTypeDefinition>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("objectType", params.objectType().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("crm-object-schemas", "v3", "schemas", params._pathParam(0))
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

        private val listHandler: Handler<SchemaListResponse> =
            jsonHandler<SchemaListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: SchemaListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SchemaListResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("crm-object-schemas", "v3", "schemas")
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
            params: SchemaDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("objectType", params.objectType().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("crm-object-schemas", "v3", "schemas", params._pathParam(0))
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
            params: SchemaCreateAssociationParams,
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
                        "v3",
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
            params: SchemaDeleteAssociationParams,
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
                        "v3",
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
            params: SchemaGetParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ObjectSchema>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("objectType", params.objectType().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("crm-object-schemas", "v3", "schemas", params._pathParam(0))
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
