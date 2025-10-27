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
import com.hubspot_sdk.api.models.crm.associations.AssociationCreateParams
import com.hubspot_sdk.api.models.crm.associations.AssociationDeleteParams
import com.hubspot_sdk.api.models.crm.associations.AssociationReadParams
import com.hubspot_sdk.api.models.crm.associations.BatchResponsePublicAssociation
import com.hubspot_sdk.api.models.crm.associations.BatchResponsePublicAssociationMulti
import com.hubspot_sdk.api.services.blocking.crm.associations.SchemaService
import com.hubspot_sdk.api.services.blocking.crm.associations.SchemaServiceImpl
import com.hubspot_sdk.api.services.blocking.crm.associations.V4Service
import com.hubspot_sdk.api.services.blocking.crm.associations.V4ServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class AssociationServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    AssociationService {

    private val withRawResponse: AssociationService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val schema: SchemaService by lazy { SchemaServiceImpl(clientOptions) }

    private val v4: V4Service by lazy { V4ServiceImpl(clientOptions) }

    override fun withRawResponse(): AssociationService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): AssociationService =
        AssociationServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun schema(): SchemaService = schema

    override fun v4(): V4Service = v4

    override fun create(
        params: AssociationCreateParams,
        requestOptions: RequestOptions,
    ): BatchResponsePublicAssociation =
        // post /crm/v3/associations/{fromObjectType}/{toObjectType}/batch/create
        withRawResponse().create(params, requestOptions).parse()

    override fun delete(params: AssociationDeleteParams, requestOptions: RequestOptions) {
        // post /crm/v3/associations/{fromObjectType}/{toObjectType}/batch/archive
        withRawResponse().delete(params, requestOptions)
    }

    override fun read(
        params: AssociationReadParams,
        requestOptions: RequestOptions,
    ): BatchResponsePublicAssociationMulti =
        // post /crm/v3/associations/{fromObjectType}/{toObjectType}/batch/read
        withRawResponse().read(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AssociationService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val schema: SchemaService.WithRawResponse by lazy {
            SchemaServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val v4: V4Service.WithRawResponse by lazy {
            V4ServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AssociationService.WithRawResponse =
            AssociationServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun schema(): SchemaService.WithRawResponse = schema

        override fun v4(): V4Service.WithRawResponse = v4

        private val createHandler: Handler<BatchResponsePublicAssociation> =
            jsonHandler<BatchResponsePublicAssociation>(clientOptions.jsonMapper)

        override fun create(
            params: AssociationCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BatchResponsePublicAssociation> {
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

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: AssociationDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { deleteHandler.handle(it) }
            }
        }

        private val readHandler: Handler<BatchResponsePublicAssociationMulti> =
            jsonHandler<BatchResponsePublicAssociationMulti>(clientOptions.jsonMapper)

        override fun read(
            params: AssociationReadParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BatchResponsePublicAssociationMulti> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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
