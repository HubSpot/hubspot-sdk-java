// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.crm.associations.v4

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
import com.hubspot_sdk.api.core.prepare
import com.hubspot_sdk.api.models.crm.BatchResponsePublicDefaultAssociation
import com.hubspot_sdk.api.models.crm.associations.v4.BatchResponseLabelsBetweenObjectPair
import com.hubspot_sdk.api.models.crm.associations.v4.BatchResponsePublicAssociationMultiWithLabel
import com.hubspot_sdk.api.models.crm.associations.v4.BatchResponseVoid
import com.hubspot_sdk.api.models.crm.associations.v4.batch.BatchBatchAssociateDefaultParams
import com.hubspot_sdk.api.models.crm.associations.v4.batch.BatchBatchCreateParams
import com.hubspot_sdk.api.models.crm.associations.v4.batch.BatchBatchDeleteLabelsParams
import com.hubspot_sdk.api.models.crm.associations.v4.batch.BatchBatchDeleteParams
import com.hubspot_sdk.api.models.crm.associations.v4.batch.BatchBatchReadParams
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class BatchServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    BatchService {

    private val withRawResponse: BatchService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): BatchService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): BatchService =
        BatchServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun batchAssociateDefault(
        params: BatchBatchAssociateDefaultParams,
        requestOptions: RequestOptions,
    ): BatchResponsePublicDefaultAssociation =
        // post /crm/v4/associations/{fromObjectType}/{toObjectType}/batch/associate/default
        withRawResponse().batchAssociateDefault(params, requestOptions).parse()

    override fun batchCreate(
        params: BatchBatchCreateParams,
        requestOptions: RequestOptions,
    ): BatchResponseLabelsBetweenObjectPair =
        // post /crm/v4/associations/{fromObjectType}/{toObjectType}/batch/create
        withRawResponse().batchCreate(params, requestOptions).parse()

    override fun batchDelete(
        params: BatchBatchDeleteParams,
        requestOptions: RequestOptions,
    ): BatchResponseVoid =
        // post /crm/v4/associations/{fromObjectType}/{toObjectType}/batch/archive
        withRawResponse().batchDelete(params, requestOptions).parse()

    override fun batchDeleteLabels(
        params: BatchBatchDeleteLabelsParams,
        requestOptions: RequestOptions,
    ): BatchResponseVoid =
        // post /crm/v4/associations/{fromObjectType}/{toObjectType}/batch/labels/archive
        withRawResponse().batchDeleteLabels(params, requestOptions).parse()

    override fun batchRead(
        params: BatchBatchReadParams,
        requestOptions: RequestOptions,
    ): BatchResponsePublicAssociationMultiWithLabel =
        // post /crm/v4/associations/{fromObjectType}/{toObjectType}/batch/read
        withRawResponse().batchRead(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        BatchService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): BatchService.WithRawResponse =
            BatchServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val batchAssociateDefaultHandler: Handler<BatchResponsePublicDefaultAssociation> =
            jsonHandler<BatchResponsePublicDefaultAssociation>(clientOptions.jsonMapper)

        override fun batchAssociateDefault(
            params: BatchBatchAssociateDefaultParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BatchResponsePublicDefaultAssociation> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { batchAssociateDefaultHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val batchCreateHandler: Handler<BatchResponseLabelsBetweenObjectPair> =
            jsonHandler<BatchResponseLabelsBetweenObjectPair>(clientOptions.jsonMapper)

        override fun batchCreate(
            params: BatchBatchCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BatchResponseLabelsBetweenObjectPair> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { batchCreateHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val batchDeleteHandler: Handler<BatchResponseVoid> =
            jsonHandler<BatchResponseVoid>(clientOptions.jsonMapper)

        override fun batchDelete(
            params: BatchBatchDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BatchResponseVoid> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { batchDeleteHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val batchDeleteLabelsHandler: Handler<BatchResponseVoid> =
            jsonHandler<BatchResponseVoid>(clientOptions.jsonMapper)

        override fun batchDeleteLabels(
            params: BatchBatchDeleteLabelsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BatchResponseVoid> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { batchDeleteLabelsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val batchReadHandler: Handler<BatchResponsePublicAssociationMultiWithLabel> =
            jsonHandler<BatchResponsePublicAssociationMultiWithLabel>(clientOptions.jsonMapper)

        override fun batchRead(
            params: BatchBatchReadParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BatchResponsePublicAssociationMultiWithLabel> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { batchReadHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
