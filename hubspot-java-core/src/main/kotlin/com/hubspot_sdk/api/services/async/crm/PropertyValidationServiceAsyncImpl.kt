// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.crm

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
import com.hubspot_sdk.api.core.prepareAsync
import com.hubspot_sdk.api.models.crm.propertyvalidations.CollectionResponsePublicPropertyValidationRuleMapNoPaging
import com.hubspot_sdk.api.models.crm.propertyvalidations.CollectionResponsePublicPropertyValidationRuleNoPaging
import com.hubspot_sdk.api.models.crm.propertyvalidations.PropertyValidationCrmV3PropertyValidationsObjectTypeIdPropertyNameRuleTypeRuleTypeParams
import com.hubspot_sdk.api.models.crm.propertyvalidations.PropertyValidationGetParams
import com.hubspot_sdk.api.models.crm.propertyvalidations.PropertyValidationListParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class PropertyValidationServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : PropertyValidationServiceAsync {

    private val withRawResponse: PropertyValidationServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): PropertyValidationServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): PropertyValidationServiceAsync =
        PropertyValidationServiceAsyncImpl(
            clientOptions.toBuilder().apply(modifier::accept).build()
        )

    override fun list(
        params: PropertyValidationListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CollectionResponsePublicPropertyValidationRuleMapNoPaging> =
        // get /crm/v3/property-validations/{objectTypeId}
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun crmV3PropertyValidationsObjectTypeIdPropertyNameRuleTypeRuleType(
        params:
            PropertyValidationCrmV3PropertyValidationsObjectTypeIdPropertyNameRuleTypeRuleTypeParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // put /crm/v3/property-validations/{objectTypeId}/{propertyName}/rule-type/{ruleType}
        withRawResponse()
            .crmV3PropertyValidationsObjectTypeIdPropertyNameRuleTypeRuleType(
                params,
                requestOptions,
            )
            .thenAccept {}

    override fun get(
        params: PropertyValidationGetParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CollectionResponsePublicPropertyValidationRuleNoPaging> =
        // get /crm/v3/property-validations/{objectTypeId}/{propertyName}
        withRawResponse().get(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PropertyValidationServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PropertyValidationServiceAsync.WithRawResponse =
            PropertyValidationServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val listHandler:
            Handler<CollectionResponsePublicPropertyValidationRuleMapNoPaging> =
            jsonHandler<CollectionResponsePublicPropertyValidationRuleMapNoPaging>(
                clientOptions.jsonMapper
            )

        override fun list(
            params: PropertyValidationListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<
            HttpResponseFor<CollectionResponsePublicPropertyValidationRuleMapNoPaging>
        > {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("objectTypeId", params.objectTypeId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("crm", "v3", "property-validations", params._pathParam(0))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
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

        private val crmV3PropertyValidationsObjectTypeIdPropertyNameRuleTypeRuleTypeHandler:
            Handler<Void?> =
            emptyHandler()

        override fun crmV3PropertyValidationsObjectTypeIdPropertyNameRuleTypeRuleType(
            params:
                PropertyValidationCrmV3PropertyValidationsObjectTypeIdPropertyNameRuleTypeRuleTypeParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("ruleType", params.ruleType().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "crm",
                        "v3",
                        "property-validations",
                        params._pathParam(0),
                        params._pathParam(1),
                        "rule-type",
                        params._pathParam(2),
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use {
                            crmV3PropertyValidationsObjectTypeIdPropertyNameRuleTypeRuleTypeHandler
                                .handle(it)
                        }
                    }
                }
        }

        private val getHandler: Handler<CollectionResponsePublicPropertyValidationRuleNoPaging> =
            jsonHandler<CollectionResponsePublicPropertyValidationRuleNoPaging>(
                clientOptions.jsonMapper
            )

        override fun get(
            params: PropertyValidationGetParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<
            HttpResponseFor<CollectionResponsePublicPropertyValidationRuleNoPaging>
        > {
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
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
}
