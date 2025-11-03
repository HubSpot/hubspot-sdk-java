// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.crm.associations

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
import com.hubspot_sdk.api.core.http.parseable
import com.hubspot_sdk.api.core.prepare
import com.hubspot_sdk.api.models.crm.associations.schema.CollectionResponsePublicAssociationDefinitionNoPaging
import com.hubspot_sdk.api.models.crm.associations.schema.SchemaListParams
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

    override fun list(
        params: SchemaListParams,
        requestOptions: RequestOptions,
    ): CollectionResponsePublicAssociationDefinitionNoPaging =
        // get /crm/v3/associations/{fromObjectType}/{toObjectType}/types
        withRawResponse().list(params, requestOptions).parse()

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

        private val listHandler: Handler<CollectionResponsePublicAssociationDefinitionNoPaging> =
            jsonHandler<CollectionResponsePublicAssociationDefinitionNoPaging>(
                clientOptions.jsonMapper
            )

        override fun list(
            params: SchemaListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CollectionResponsePublicAssociationDefinitionNoPaging> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("toObjectType", params.toObjectType().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "crm",
                        "v3",
                        "associations",
                        params._pathParam(0),
                        params._pathParam(1),
                        "types",
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
            }
        }
    }
}
