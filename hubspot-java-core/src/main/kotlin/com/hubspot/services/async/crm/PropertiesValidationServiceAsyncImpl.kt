// File generated from our OpenAPI spec by Stainless.

package com.hubspot.services.async.crm

import com.hubspot.core.ClientOptions
import com.hubspot.core.RequestOptions
import com.hubspot.core.checkRequired
import com.hubspot.core.handlers.emptyHandler
import com.hubspot.core.handlers.errorBodyHandler
import com.hubspot.core.handlers.errorHandler
import com.hubspot.core.handlers.jsonHandler
import com.hubspot.core.http.HttpMethod
import com.hubspot.core.http.HttpRequest
import com.hubspot.core.http.HttpResponse
import com.hubspot.core.http.HttpResponse.Handler
import com.hubspot.core.http.HttpResponseFor
import com.hubspot.core.http.json
import com.hubspot.core.http.parseable
import com.hubspot.core.prepareAsync
import com.hubspot.models.crm.propertiesvalidations.CollectionResponsePublicPropertyValidationRuleMapNoPaging
import com.hubspot.models.crm.propertiesvalidations.CollectionResponsePublicPropertyValidationRuleNoPaging
import com.hubspot.models.crm.propertiesvalidations.PropertiesValidationGetByObjectTypeIdAndPropertyNameParams
import com.hubspot.models.crm.propertiesvalidations.PropertiesValidationGetByObjectTypeIdParams
import com.hubspot.models.crm.propertiesvalidations.PropertiesValidationGetByObjectTypeIdPropertyNameAndRuleTypeParams
import com.hubspot.models.crm.propertiesvalidations.PropertiesValidationUpdateByObjectTypeIdPropertyNameAndRuleTypeParams
import com.hubspot.models.crm.propertiesvalidations.PublicPropertyValidationRule
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class PropertiesValidationServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : PropertiesValidationServiceAsync {

    private val withRawResponse: PropertiesValidationServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): PropertiesValidationServiceAsync.WithRawResponse =
        withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): PropertiesValidationServiceAsync =
        PropertiesValidationServiceAsyncImpl(
            clientOptions.toBuilder().apply(modifier::accept).build()
        )

    override fun getByObjectTypeId(
        params: PropertiesValidationGetByObjectTypeIdParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CollectionResponsePublicPropertyValidationRuleMapNoPaging> =
        // get /crm/property-validations/2026-03/{objectTypeId}
        withRawResponse().getByObjectTypeId(params, requestOptions).thenApply { it.parse() }

    override fun getByObjectTypeIdAndPropertyName(
        params: PropertiesValidationGetByObjectTypeIdAndPropertyNameParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CollectionResponsePublicPropertyValidationRuleNoPaging> =
        // get /crm/property-validations/2026-03/{objectTypeId}/{propertyName}
        withRawResponse().getByObjectTypeIdAndPropertyName(params, requestOptions).thenApply {
            it.parse()
        }

    override fun getByObjectTypeIdPropertyNameAndRuleType(
        params: PropertiesValidationGetByObjectTypeIdPropertyNameAndRuleTypeParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PublicPropertyValidationRule> =
        // get /crm/property-validations/2026-03/{objectTypeId}/{propertyName}/rule-type/{ruleType}
        withRawResponse()
            .getByObjectTypeIdPropertyNameAndRuleType(params, requestOptions)
            .thenApply { it.parse() }

    override fun updateByObjectTypeIdPropertyNameAndRuleType(
        params: PropertiesValidationUpdateByObjectTypeIdPropertyNameAndRuleTypeParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // put /crm/property-validations/2026-03/{objectTypeId}/{propertyName}/rule-type/{ruleType}
        withRawResponse()
            .updateByObjectTypeIdPropertyNameAndRuleType(params, requestOptions)
            .thenAccept {}

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PropertiesValidationServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PropertiesValidationServiceAsync.WithRawResponse =
            PropertiesValidationServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val getByObjectTypeIdHandler:
            Handler<CollectionResponsePublicPropertyValidationRuleMapNoPaging> =
            jsonHandler<CollectionResponsePublicPropertyValidationRuleMapNoPaging>(
                clientOptions.jsonMapper
            )

        override fun getByObjectTypeId(
            params: PropertiesValidationGetByObjectTypeIdParams,
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
                    .addPathSegments("crm", "property-validations", "2026-03", params._pathParam(0))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { getByObjectTypeIdHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val getByObjectTypeIdAndPropertyNameHandler:
            Handler<CollectionResponsePublicPropertyValidationRuleNoPaging> =
            jsonHandler<CollectionResponsePublicPropertyValidationRuleNoPaging>(
                clientOptions.jsonMapper
            )

        override fun getByObjectTypeIdAndPropertyName(
            params: PropertiesValidationGetByObjectTypeIdAndPropertyNameParams,
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
                        "property-validations",
                        "2026-03",
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
                            .use { getByObjectTypeIdAndPropertyNameHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val getByObjectTypeIdPropertyNameAndRuleTypeHandler:
            Handler<PublicPropertyValidationRule> =
            jsonHandler<PublicPropertyValidationRule>(clientOptions.jsonMapper)

        override fun getByObjectTypeIdPropertyNameAndRuleType(
            params: PropertiesValidationGetByObjectTypeIdPropertyNameAndRuleTypeParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PublicPropertyValidationRule>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("ruleType", params.ruleType().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "crm",
                        "property-validations",
                        "2026-03",
                        params._pathParam(0),
                        params._pathParam(1),
                        "rule-type",
                        params._pathParam(2),
                    )
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { getByObjectTypeIdPropertyNameAndRuleTypeHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val updateByObjectTypeIdPropertyNameAndRuleTypeHandler: Handler<Void?> =
            emptyHandler()

        override fun updateByObjectTypeIdPropertyNameAndRuleType(
            params: PropertiesValidationUpdateByObjectTypeIdPropertyNameAndRuleTypeParams,
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
                        "property-validations",
                        "2026-03",
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
                            updateByObjectTypeIdPropertyNameAndRuleTypeHandler.handle(it)
                        }
                    }
                }
        }
    }
}
