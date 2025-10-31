// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.crm

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
import com.hubspot_sdk.api.models.crm.propertyvalidations.PropertyValidationGetParams
import com.hubspot_sdk.api.models.crm.propertyvalidations.PropertyValidationGetResponse
import com.hubspot_sdk.api.models.crm.propertyvalidations.PropertyValidationListParams
import com.hubspot_sdk.api.models.crm.propertyvalidations.PropertyValidationListResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class PropertyValidationServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    PropertyValidationService {

    private val withRawResponse: PropertyValidationService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): PropertyValidationService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): PropertyValidationService =
        PropertyValidationServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun list(
        params: PropertyValidationListParams,
        requestOptions: RequestOptions,
    ): PropertyValidationListResponse =
        // get /crm/v3/property-validations/{objectTypeId}
        withRawResponse().list(params, requestOptions).parse()

    override fun get(
        params: PropertyValidationGetParams,
        requestOptions: RequestOptions,
    ): PropertyValidationGetResponse =
        // get /crm/v3/property-validations/{objectTypeId}/{propertyName}
        withRawResponse().get(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PropertyValidationService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PropertyValidationService.WithRawResponse =
            PropertyValidationServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val listHandler: Handler<PropertyValidationListResponse> =
            jsonHandler<PropertyValidationListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: PropertyValidationListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PropertyValidationListResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("objectTypeId", params.objectTypeId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("crm", "v3", "property-validations", params._pathParam(0))
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

        private val getHandler: Handler<PropertyValidationGetResponse> =
            jsonHandler<PropertyValidationGetResponse>(clientOptions.jsonMapper)

        override fun get(
            params: PropertyValidationGetParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PropertyValidationGetResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("propertyName", params.propertyName().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "crm",
                        "v3",
                        "property-validations",
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
