// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.crm.lists

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
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
import com.hubspot_sdk.api.models.crm.lists.PublicBatchMigrationMapping
import com.hubspot_sdk.api.models.crm.lists.PublicMigrationMapping
import com.hubspot_sdk.api.models.crm.lists.mapping.MappingBatchCreateIdMappingParams
import com.hubspot_sdk.api.models.crm.lists.mapping.MappingGetIdMappingParams
import java.util.function.Consumer

class MappingServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    MappingService {

    private val withRawResponse: MappingService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): MappingService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): MappingService =
        MappingServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun batchCreateIdMapping(
        params: MappingBatchCreateIdMappingParams,
        requestOptions: RequestOptions,
    ): PublicBatchMigrationMapping =
        // post /crm/v3/lists/idmapping
        withRawResponse().batchCreateIdMapping(params, requestOptions).parse()

    override fun getIdMapping(
        params: MappingGetIdMappingParams,
        requestOptions: RequestOptions,
    ): PublicMigrationMapping =
        // get /crm/v3/lists/idmapping
        withRawResponse().getIdMapping(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        MappingService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): MappingService.WithRawResponse =
            MappingServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val batchCreateIdMappingHandler: Handler<PublicBatchMigrationMapping> =
            jsonHandler<PublicBatchMigrationMapping>(clientOptions.jsonMapper)

        override fun batchCreateIdMapping(
            params: MappingBatchCreateIdMappingParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PublicBatchMigrationMapping> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("crm", "v3", "lists", "idmapping")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { batchCreateIdMappingHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val getIdMappingHandler: Handler<PublicMigrationMapping> =
            jsonHandler<PublicMigrationMapping>(clientOptions.jsonMapper)

        override fun getIdMapping(
            params: MappingGetIdMappingParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PublicMigrationMapping> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("crm", "v3", "lists", "idmapping")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getIdMappingHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
