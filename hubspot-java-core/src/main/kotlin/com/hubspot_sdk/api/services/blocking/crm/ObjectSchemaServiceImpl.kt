// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.crm

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
import com.hubspot_sdk.api.core.prepare
import com.hubspot_sdk.api.models.CollectionResponseObjectSchemaNoPaging
import com.hubspot_sdk.api.models.ObjectSchema
import com.hubspot_sdk.api.models.ObjectTypeDefinition
import com.hubspot_sdk.api.models.crm.objectschemas.ObjectSchemaCreateAssociationParams
import com.hubspot_sdk.api.models.crm.objectschemas.ObjectSchemaCreateParams
import com.hubspot_sdk.api.models.crm.objectschemas.ObjectSchemaDeleteAssociationParams
import com.hubspot_sdk.api.models.crm.objectschemas.ObjectSchemaDeleteParams
import com.hubspot_sdk.api.models.crm.objectschemas.ObjectSchemaGetParams
import com.hubspot_sdk.api.models.crm.objectschemas.ObjectSchemaListParams
import com.hubspot_sdk.api.models.crm.objectschemas.ObjectSchemaUpdateParams
import com.hubspot_sdk.api.models.events.AssociationDefinition
import com.hubspot_sdk.api.services.blocking.crm.objectschemas.BatchService
import com.hubspot_sdk.api.services.blocking.crm.objectschemas.BatchServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class ObjectSchemaServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    ObjectSchemaService {

    private val withRawResponse: ObjectSchemaService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val batch: BatchService by lazy { BatchServiceImpl(clientOptions) }

    override fun withRawResponse(): ObjectSchemaService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ObjectSchemaService =
        ObjectSchemaServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun batch(): BatchService = batch

    override fun create(
        params: ObjectSchemaCreateParams,
        requestOptions: RequestOptions,
    ): ObjectSchema =
        // post /crm-object-schemas/2026-03/schemas
        withRawResponse().create(params, requestOptions).parse()

    override fun update(
        params: ObjectSchemaUpdateParams,
        requestOptions: RequestOptions,
    ): ObjectTypeDefinition =
        // patch /crm-object-schemas/2026-03/schemas/{objectType}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(
        params: ObjectSchemaListParams,
        requestOptions: RequestOptions,
    ): CollectionResponseObjectSchemaNoPaging =
        // get /crm-object-schemas/2026-03/schemas
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: ObjectSchemaDeleteParams, requestOptions: RequestOptions) {
        // delete /crm-object-schemas/2026-03/schemas/{objectType}
        withRawResponse().delete(params, requestOptions)
    }

    override fun createAssociation(
        params: ObjectSchemaCreateAssociationParams,
        requestOptions: RequestOptions,
    ): AssociationDefinition =
        // post /crm-object-schemas/2026-03/schemas/{objectType}/associations
        withRawResponse().createAssociation(params, requestOptions).parse()

    override fun deleteAssociation(
        params: ObjectSchemaDeleteAssociationParams,
        requestOptions: RequestOptions,
    ) {
        // delete
        // /crm-object-schemas/2026-03/schemas/{objectType}/associations/{associationIdentifier}
        withRawResponse().deleteAssociation(params, requestOptions)
    }

    override fun get(params: ObjectSchemaGetParams, requestOptions: RequestOptions): ObjectSchema =
        // get /crm-object-schemas/2026-03/schemas/{objectType}
        withRawResponse().get(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ObjectSchemaService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val batch: BatchService.WithRawResponse by lazy {
            BatchServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ObjectSchemaService.WithRawResponse =
            ObjectSchemaServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun batch(): BatchService.WithRawResponse = batch

        private val createHandler: Handler<ObjectSchema> =
            jsonHandler<ObjectSchema>(clientOptions.jsonMapper)

        override fun create(
            params: ObjectSchemaCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ObjectSchema> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("crm-object-schemas", "2026-03", "schemas")
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

        private val updateHandler: Handler<ObjectTypeDefinition> =
            jsonHandler<ObjectTypeDefinition>(clientOptions.jsonMapper)

        override fun update(
            params: ObjectSchemaUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ObjectTypeDefinition> {
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

        private val listHandler: Handler<CollectionResponseObjectSchemaNoPaging> =
            jsonHandler<CollectionResponseObjectSchemaNoPaging>(clientOptions.jsonMapper)

        override fun list(
            params: ObjectSchemaListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CollectionResponseObjectSchemaNoPaging> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("crm-object-schemas", "2026-03", "schemas")
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
            }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: ObjectSchemaDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { deleteHandler.handle(it) }
            }
        }

        private val createAssociationHandler: Handler<AssociationDefinition> =
            jsonHandler<AssociationDefinition>(clientOptions.jsonMapper)

        override fun createAssociation(
            params: ObjectSchemaCreateAssociationParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AssociationDefinition> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createAssociationHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val deleteAssociationHandler: Handler<Void?> = emptyHandler()

        override fun deleteAssociation(
            params: ObjectSchemaDeleteAssociationParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { deleteAssociationHandler.handle(it) }
            }
        }

        private val getHandler: Handler<ObjectSchema> =
            jsonHandler<ObjectSchema>(clientOptions.jsonMapper)

        override fun get(
            params: ObjectSchemaGetParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ObjectSchema> {
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
    }
}
