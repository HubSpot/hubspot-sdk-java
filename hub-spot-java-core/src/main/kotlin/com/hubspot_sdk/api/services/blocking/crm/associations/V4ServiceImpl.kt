// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.crm.associations

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
import com.hubspot_sdk.api.models.crm.BatchResponsePublicDefaultAssociation
import com.hubspot_sdk.api.models.crm.CollectionResponseMultiAssociatedObjectWithLabel
import com.hubspot_sdk.api.models.crm.CreatedResponseLabelsBetweenObjectPair
import com.hubspot_sdk.api.models.crm.associations.v4.V4CreateParams
import com.hubspot_sdk.api.models.crm.associations.v4.V4DeleteParams
import com.hubspot_sdk.api.models.crm.associations.v4.V4ListPage
import com.hubspot_sdk.api.models.crm.associations.v4.V4ListParams
import com.hubspot_sdk.api.models.crm.associations.v4.V4UpdateParams
import com.hubspot_sdk.api.services.blocking.crm.associations.v4.BatchService
import com.hubspot_sdk.api.services.blocking.crm.associations.v4.BatchServiceImpl
import com.hubspot_sdk.api.services.blocking.crm.associations.v4.ReportService
import com.hubspot_sdk.api.services.blocking.crm.associations.v4.ReportServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class V4ServiceImpl internal constructor(private val clientOptions: ClientOptions) : V4Service {

    private val withRawResponse: V4Service.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val batch: BatchService by lazy { BatchServiceImpl(clientOptions) }

    private val report: ReportService by lazy { ReportServiceImpl(clientOptions) }

    override fun withRawResponse(): V4Service.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): V4Service =
        V4ServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun batch(): BatchService = batch

    override fun report(): ReportService = report

    override fun create(
        params: V4CreateParams,
        requestOptions: RequestOptions,
    ): BatchResponsePublicDefaultAssociation =
        // put
        // /crm/v4/objects/{fromObjectType}/{fromObjectId}/associations/default/{toObjectType}/{toObjectId}
        withRawResponse().create(params, requestOptions).parse()

    override fun update(
        params: V4UpdateParams,
        requestOptions: RequestOptions,
    ): CreatedResponseLabelsBetweenObjectPair =
        // put /crm/v4/objects/{objectType}/{objectId}/associations/{toObjectType}/{toObjectId}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(params: V4ListParams, requestOptions: RequestOptions): V4ListPage =
        // get /crm/v4/objects/{objectType}/{objectId}/associations/{toObjectType}
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: V4DeleteParams, requestOptions: RequestOptions) {
        // delete /crm/v4/objects/{objectType}/{objectId}/associations/{toObjectType}/{toObjectId}
        withRawResponse().delete(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        V4Service.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val batch: BatchService.WithRawResponse by lazy {
            BatchServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val report: ReportService.WithRawResponse by lazy {
            ReportServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): V4Service.WithRawResponse =
            V4ServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun batch(): BatchService.WithRawResponse = batch

        override fun report(): ReportService.WithRawResponse = report

        private val createHandler: Handler<BatchResponsePublicDefaultAssociation> =
            jsonHandler<BatchResponsePublicDefaultAssociation>(clientOptions.jsonMapper)

        override fun create(
            params: V4CreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BatchResponsePublicDefaultAssociation> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("toObjectId", params.toObjectId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "crm",
                        "v4",
                        "objects",
                        params._pathParam(0),
                        params._pathParam(1),
                        "associations",
                        "default",
                        params._pathParam(2),
                        params._pathParam(3),
                    )
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
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

        private val updateHandler: Handler<CreatedResponseLabelsBetweenObjectPair> =
            jsonHandler<CreatedResponseLabelsBetweenObjectPair>(clientOptions.jsonMapper)

        override fun update(
            params: V4UpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CreatedResponseLabelsBetweenObjectPair> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("toObjectId", params.toObjectId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "crm",
                        "v4",
                        "objects",
                        params._pathParam(0),
                        params._pathParam(1),
                        "associations",
                        params._pathParam(2),
                        params._pathParam(3),
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

        private val listHandler: Handler<CollectionResponseMultiAssociatedObjectWithLabel> =
            jsonHandler<CollectionResponseMultiAssociatedObjectWithLabel>(clientOptions.jsonMapper)

        override fun list(
            params: V4ListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<V4ListPage> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("toObjectType", params.toObjectType().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "crm",
                        "v4",
                        "objects",
                        params._pathParam(0),
                        params._pathParam(1),
                        "associations",
                        params._pathParam(2),
                    )
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
                    .let {
                        V4ListPage.builder()
                            .service(V4ServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(params: V4DeleteParams, requestOptions: RequestOptions): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("toObjectId", params.toObjectId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "crm",
                        "v4",
                        "objects",
                        params._pathParam(0),
                        params._pathParam(1),
                        "associations",
                        params._pathParam(2),
                        params._pathParam(3),
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
    }
}
