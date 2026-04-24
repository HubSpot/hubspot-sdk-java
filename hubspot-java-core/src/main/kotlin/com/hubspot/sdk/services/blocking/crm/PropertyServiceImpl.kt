// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.blocking.crm

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
import com.hubspot.sdk.core.prepare
import com.hubspot.sdk.models.BaseProperty
import com.hubspot.sdk.models.crm.properties.CollectionResponsePropertyNoPaging
import com.hubspot.sdk.models.crm.properties.PropertyCreateParams
import com.hubspot.sdk.models.crm.properties.PropertyDeleteParams
import com.hubspot.sdk.models.crm.properties.PropertyGetParams
import com.hubspot.sdk.models.crm.properties.PropertyListParams
import com.hubspot.sdk.models.crm.properties.PropertyUpdateParams
import com.hubspot.sdk.services.blocking.crm.properties.BatchService
import com.hubspot.sdk.services.blocking.crm.properties.BatchServiceImpl
import com.hubspot.sdk.services.blocking.crm.properties.GroupService
import com.hubspot.sdk.services.blocking.crm.properties.GroupServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class PropertyServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    PropertyService {

    private val withRawResponse: PropertyService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val batch: BatchService by lazy { BatchServiceImpl(clientOptions) }

    private val groups: GroupService by lazy { GroupServiceImpl(clientOptions) }

    override fun withRawResponse(): PropertyService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): PropertyService =
        PropertyServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun batch(): BatchService = batch

    override fun groups(): GroupService = groups

    override fun create(
        params: PropertyCreateParams,
        requestOptions: RequestOptions,
    ): BaseProperty =
        // post /crm/properties/2026-03/{objectType}
        withRawResponse().create(params, requestOptions).parse()

    override fun update(
        params: PropertyUpdateParams,
        requestOptions: RequestOptions,
    ): BaseProperty =
        // patch /crm/properties/2026-03/{objectType}/{propertyName}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(
        params: PropertyListParams,
        requestOptions: RequestOptions,
    ): CollectionResponsePropertyNoPaging =
        // get /crm/properties/2026-03/{objectType}
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: PropertyDeleteParams, requestOptions: RequestOptions) {
        // delete /crm/properties/2026-03/{objectType}/{propertyName}
        withRawResponse().delete(params, requestOptions)
    }

    override fun get(params: PropertyGetParams, requestOptions: RequestOptions): BaseProperty =
        // get /crm/properties/2026-03/{objectType}/{propertyName}
        withRawResponse().get(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PropertyService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val batch: BatchService.WithRawResponse by lazy {
            BatchServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val groups: GroupService.WithRawResponse by lazy {
            GroupServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PropertyService.WithRawResponse =
            PropertyServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun batch(): BatchService.WithRawResponse = batch

        override fun groups(): GroupService.WithRawResponse = groups

        private val createHandler: Handler<BaseProperty> =
            jsonHandler<BaseProperty>(clientOptions.jsonMapper)

        override fun create(
            params: PropertyCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BaseProperty> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("objectType", params.objectType().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("crm", "properties", "2026-03", params._pathParam(0))
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

        private val updateHandler: Handler<BaseProperty> =
            jsonHandler<BaseProperty>(clientOptions.jsonMapper)

        override fun update(
            params: PropertyUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BaseProperty> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("propertyName", params.propertyName().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "crm",
                        "properties",
                        "2026-03",
                        params._pathParam(0),
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

        private val listHandler: Handler<CollectionResponsePropertyNoPaging> =
            jsonHandler<CollectionResponsePropertyNoPaging>(clientOptions.jsonMapper)

        override fun list(
            params: PropertyListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CollectionResponsePropertyNoPaging> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("objectType", params.objectType().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("crm", "properties", "2026-03", params._pathParam(0))
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
            params: PropertyDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("propertyName", params.propertyName().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "crm",
                        "properties",
                        "2026-03",
                        params._pathParam(0),
                        params._pathParam(1),
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

        private val getHandler: Handler<BaseProperty> =
            jsonHandler<BaseProperty>(clientOptions.jsonMapper)

        override fun get(
            params: PropertyGetParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BaseProperty> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("propertyName", params.propertyName().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "crm",
                        "properties",
                        "2026-03",
                        params._pathParam(0),
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
