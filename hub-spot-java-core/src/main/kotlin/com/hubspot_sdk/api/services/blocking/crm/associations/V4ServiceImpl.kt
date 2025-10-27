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
import com.hubspot_sdk.api.models.crm.associations.v4.V4CreateDefaultAssociationParams
import com.hubspot_sdk.api.models.crm.associations.v4.V4DeleteAssociationParams
import com.hubspot_sdk.api.models.crm.associations.v4.V4ListAssociationsByTypeParams
import com.hubspot_sdk.api.models.crm.associations.v4.V4UpdateAssociationLabelsParams
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

    override fun createDefaultAssociation(
        params: V4CreateDefaultAssociationParams,
        requestOptions: RequestOptions,
    ): BatchResponsePublicDefaultAssociation =
        // put
        // /crm/v4/objects/{fromObjectType}/{fromObjectId}/associations/default/{toObjectType}/{toObjectId}
        withRawResponse().createDefaultAssociation(params, requestOptions).parse()

    override fun deleteAssociation(
        params: V4DeleteAssociationParams,
        requestOptions: RequestOptions,
    ) {
        // delete /crm/v4/objects/{objectType}/{objectId}/associations/{toObjectType}/{toObjectId}
        withRawResponse().deleteAssociation(params, requestOptions)
    }

    override fun listAssociationsByType(
        params: V4ListAssociationsByTypeParams,
        requestOptions: RequestOptions,
    ): CollectionResponseMultiAssociatedObjectWithLabel =
        // get /crm/v4/objects/{objectType}/{objectId}/associations/{toObjectType}
        withRawResponse().listAssociationsByType(params, requestOptions).parse()

    override fun updateAssociationLabels(
        params: V4UpdateAssociationLabelsParams,
        requestOptions: RequestOptions,
    ): CreatedResponseLabelsBetweenObjectPair =
        // put /crm/v4/objects/{objectType}/{objectId}/associations/{toObjectType}/{toObjectId}
        withRawResponse().updateAssociationLabels(params, requestOptions).parse()

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

        private val createDefaultAssociationHandler:
            Handler<BatchResponsePublicDefaultAssociation> =
            jsonHandler<BatchResponsePublicDefaultAssociation>(clientOptions.jsonMapper)

        override fun createDefaultAssociation(
            params: V4CreateDefaultAssociationParams,
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
                    .use { createDefaultAssociationHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val deleteAssociationHandler: Handler<Void?> = emptyHandler()

        override fun deleteAssociation(
            params: V4DeleteAssociationParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
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
                response.use { deleteAssociationHandler.handle(it) }
            }
        }

        private val listAssociationsByTypeHandler:
            Handler<CollectionResponseMultiAssociatedObjectWithLabel> =
            jsonHandler<CollectionResponseMultiAssociatedObjectWithLabel>(clientOptions.jsonMapper)

        override fun listAssociationsByType(
            params: V4ListAssociationsByTypeParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CollectionResponseMultiAssociatedObjectWithLabel> {
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
                    .use { listAssociationsByTypeHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val updateAssociationLabelsHandler:
            Handler<CreatedResponseLabelsBetweenObjectPair> =
            jsonHandler<CreatedResponseLabelsBetweenObjectPair>(clientOptions.jsonMapper)

        override fun updateAssociationLabels(
            params: V4UpdateAssociationLabelsParams,
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
                    .use { updateAssociationLabelsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
