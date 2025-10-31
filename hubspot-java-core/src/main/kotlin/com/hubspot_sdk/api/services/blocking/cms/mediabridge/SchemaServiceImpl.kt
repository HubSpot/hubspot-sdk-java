// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.cms.mediabridge

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
import com.hubspot_sdk.api.models.cms.mediabridge.schemas.SchemaCreateAssociationParams
import com.hubspot_sdk.api.models.cms.mediabridge.schemas.SchemaCreateAssociationResponse
import com.hubspot_sdk.api.models.cms.mediabridge.schemas.SchemaDeleteAssociationParams
import com.hubspot_sdk.api.models.cms.mediabridge.schemas.SchemaGetParams
import com.hubspot_sdk.api.models.cms.mediabridge.schemas.SchemaListParams
import com.hubspot_sdk.api.models.cms.mediabridge.schemas.SchemaUpdateParams
import com.hubspot_sdk.api.models.crm.objects.schemas.ObjectSchema
import com.hubspot_sdk.api.models.crm.objects.schemas.ObjectTypeDefinition
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class SchemaServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    SchemaService {

    private val withRawResponse: SchemaService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): SchemaService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): SchemaService =
        SchemaServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun update(
        params: SchemaUpdateParams,
        requestOptions: RequestOptions,
    ): ObjectTypeDefinition =
        // patch /media-bridge/v1/{appId}/schemas/{objectType}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(
        params: SchemaListParams,
        requestOptions: RequestOptions,
    ): CollectionResponseObjectSchemaNoPaging =
        // get /media-bridge/v1/{appId}/schemas
        withRawResponse().list(params, requestOptions).parse()

    override fun createAssociation(
        params: SchemaCreateAssociationParams,
        requestOptions: RequestOptions,
    ): SchemaCreateAssociationResponse =
        // post /media-bridge/v1/{appId}/schemas/{objectType}/associations
        withRawResponse().createAssociation(params, requestOptions).parse()

    override fun deleteAssociation(
        params: SchemaDeleteAssociationParams,
        requestOptions: RequestOptions,
    ) {
        // delete /media-bridge/v1/{appId}/schemas/{objectType}/associations/{associationId}
        withRawResponse().deleteAssociation(params, requestOptions)
    }

    override fun get(params: SchemaGetParams, requestOptions: RequestOptions): ObjectSchema =
        // get /media-bridge/v1/{appId}/schemas/{objectType}
        withRawResponse().get(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        SchemaService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SchemaService.WithRawResponse =
            SchemaServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val updateHandler: Handler<ObjectTypeDefinition> =
            jsonHandler<ObjectTypeDefinition>(clientOptions.jsonMapper)

        override fun update(
            params: SchemaUpdateParams,
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
                        "media-bridge",
                        "v1",
                        params._pathParam(0),
                        "schemas",
                        params._pathParam(1),
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
            params: SchemaListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CollectionResponseObjectSchemaNoPaging> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("appId", params.appId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("media-bridge", "v1", params._pathParam(0), "schemas")
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

        private val createAssociationHandler: Handler<SchemaCreateAssociationResponse> =
            jsonHandler<SchemaCreateAssociationResponse>(clientOptions.jsonMapper)

        override fun createAssociation(
            params: SchemaCreateAssociationParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SchemaCreateAssociationResponse> {
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
                        "schemas",
                        params._pathParam(1),
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
            params: SchemaDeleteAssociationParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("associationId", params.associationId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "media-bridge",
                        "v1",
                        params._pathParam(0),
                        "schemas",
                        params._pathParam(1),
                        "associations",
                        params._pathParam(2),
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
            params: SchemaGetParams,
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
                        "media-bridge",
                        "v1",
                        params._pathParam(0),
                        "schemas",
                        params._pathParam(1),
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
