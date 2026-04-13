// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.blocking.crm.associationsschema

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
import com.hubspot.sdk.models.crm.associationsschema.BatchResponsePublicAssociationDefinitionUserConfiguration
import com.hubspot.sdk.models.crm.associationsschema.CollectionResponseAssociationSpecWithLabelNoPaging
import com.hubspot.sdk.models.crm.associationsschema.labels.LabelBatchCreateParams
import com.hubspot.sdk.models.crm.associationsschema.labels.LabelCreateLabelParams
import com.hubspot.sdk.models.crm.associationsschema.labels.LabelDeleteLabelParams
import com.hubspot.sdk.models.crm.associationsschema.labels.LabelListLabelsParams
import com.hubspot.sdk.models.crm.associationsschema.labels.LabelUpdateLabelParams
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class LabelServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    LabelService {

    private val withRawResponse: LabelService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): LabelService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): LabelService =
        LabelServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun batchCreate(
        params: LabelBatchCreateParams,
        requestOptions: RequestOptions,
    ): BatchResponsePublicAssociationDefinitionUserConfiguration =
        // post
        // /crm/associations/2026-03/definitions/configurations/{fromObjectType}/{toObjectType}/batch/create
        withRawResponse().batchCreate(params, requestOptions).parse()

    override fun createLabel(
        params: LabelCreateLabelParams,
        requestOptions: RequestOptions,
    ): CollectionResponseAssociationSpecWithLabelNoPaging =
        // post /crm/associations/2026-03/{fromObjectType}/{toObjectType}/labels
        withRawResponse().createLabel(params, requestOptions).parse()

    override fun deleteLabel(params: LabelDeleteLabelParams, requestOptions: RequestOptions) {
        // delete
        // /crm/associations/2026-03/{fromObjectType}/{toObjectType}/labels/{associationTypeId}
        withRawResponse().deleteLabel(params, requestOptions)
    }

    override fun listLabels(
        params: LabelListLabelsParams,
        requestOptions: RequestOptions,
    ): CollectionResponseAssociationSpecWithLabelNoPaging =
        // get /crm/associations/2026-03/{fromObjectType}/{toObjectType}/labels
        withRawResponse().listLabels(params, requestOptions).parse()

    override fun updateLabel(params: LabelUpdateLabelParams, requestOptions: RequestOptions) {
        // put /crm/associations/2026-03/{fromObjectType}/{toObjectType}/labels
        withRawResponse().updateLabel(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        LabelService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): LabelService.WithRawResponse =
            LabelServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val batchCreateHandler:
            Handler<BatchResponsePublicAssociationDefinitionUserConfiguration> =
            jsonHandler<BatchResponsePublicAssociationDefinitionUserConfiguration>(
                clientOptions.jsonMapper
            )

        override fun batchCreate(
            params: LabelBatchCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BatchResponsePublicAssociationDefinitionUserConfiguration> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("toObjectType", params.toObjectType().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "crm",
                        "associations",
                        "2026-03",
                        "definitions",
                        "configurations",
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

        private val createLabelHandler:
            Handler<CollectionResponseAssociationSpecWithLabelNoPaging> =
            jsonHandler<CollectionResponseAssociationSpecWithLabelNoPaging>(
                clientOptions.jsonMapper
            )

        override fun createLabel(
            params: LabelCreateLabelParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CollectionResponseAssociationSpecWithLabelNoPaging> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("toObjectType", params.toObjectType().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "crm",
                        "associations",
                        "2026-03",
                        params._pathParam(0),
                        params._pathParam(1),
                        "labels",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createLabelHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val deleteLabelHandler: Handler<Void?> = emptyHandler()

        override fun deleteLabel(
            params: LabelDeleteLabelParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("associationTypeId", params.associationTypeId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "crm",
                        "associations",
                        "2026-03",
                        params._pathParam(0),
                        params._pathParam(1),
                        "labels",
                        params._pathParam(2),
                    )
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { deleteLabelHandler.handle(it) }
            }
        }

        private val listLabelsHandler: Handler<CollectionResponseAssociationSpecWithLabelNoPaging> =
            jsonHandler<CollectionResponseAssociationSpecWithLabelNoPaging>(
                clientOptions.jsonMapper
            )

        override fun listLabels(
            params: LabelListLabelsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CollectionResponseAssociationSpecWithLabelNoPaging> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("toObjectType", params.toObjectType().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "crm",
                        "associations",
                        "2026-03",
                        params._pathParam(0),
                        params._pathParam(1),
                        "labels",
                    )
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listLabelsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val updateLabelHandler: Handler<Void?> = emptyHandler()

        override fun updateLabel(
            params: LabelUpdateLabelParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("toObjectType", params.toObjectType().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "crm",
                        "associations",
                        "2026-03",
                        params._pathParam(0),
                        params._pathParam(1),
                        "labels",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { updateLabelHandler.handle(it) }
            }
        }
    }
}
