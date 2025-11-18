// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.crm.associations.schema.v4

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
import com.hubspot_sdk.api.models.crm.associations.schema.v4.CollectionResponseAssociationSpecWithLabel
import com.hubspot_sdk.api.models.crm.associations.schema.v4.definitions.DefinitionCreateLabelParams
import com.hubspot_sdk.api.models.crm.associations.schema.v4.definitions.DefinitionDeleteLabelParams
import com.hubspot_sdk.api.models.crm.associations.schema.v4.definitions.DefinitionListLabelsParams
import com.hubspot_sdk.api.models.crm.associations.schema.v4.definitions.DefinitionUpdateLabelParams
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class DefinitionServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    DefinitionService {

    private val withRawResponse: DefinitionService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): DefinitionService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): DefinitionService =
        DefinitionServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun createLabel(
        params: DefinitionCreateLabelParams,
        requestOptions: RequestOptions,
    ): CollectionResponseAssociationSpecWithLabel =
        // post /crm/associations/v4/{fromObjectType}/{toObjectType}/labels
        withRawResponse().createLabel(params, requestOptions).parse()

    override fun deleteLabel(params: DefinitionDeleteLabelParams, requestOptions: RequestOptions) {
        // delete /crm/associations/v4/{fromObjectType}/{toObjectType}/labels/{associationTypeId}
        withRawResponse().deleteLabel(params, requestOptions)
    }

    override fun listLabels(
        params: DefinitionListLabelsParams,
        requestOptions: RequestOptions,
    ): CollectionResponseAssociationSpecWithLabel =
        // get /crm/associations/v4/{fromObjectType}/{toObjectType}/labels
        withRawResponse().listLabels(params, requestOptions).parse()

    override fun updateLabel(params: DefinitionUpdateLabelParams, requestOptions: RequestOptions) {
        // put /crm/associations/v4/{fromObjectType}/{toObjectType}/labels
        withRawResponse().updateLabel(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        DefinitionService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): DefinitionService.WithRawResponse =
            DefinitionServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createLabelHandler: Handler<CollectionResponseAssociationSpecWithLabel> =
            jsonHandler<CollectionResponseAssociationSpecWithLabel>(clientOptions.jsonMapper)

        override fun createLabel(
            params: DefinitionCreateLabelParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CollectionResponseAssociationSpecWithLabel> {
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
                        "v4",
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
            params: DefinitionDeleteLabelParams,
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
                        "v4",
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

        private val listLabelsHandler: Handler<CollectionResponseAssociationSpecWithLabel> =
            jsonHandler<CollectionResponseAssociationSpecWithLabel>(clientOptions.jsonMapper)

        override fun listLabels(
            params: DefinitionListLabelsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CollectionResponseAssociationSpecWithLabel> {
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
                        "v4",
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
            params: DefinitionUpdateLabelParams,
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
                        "v4",
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
