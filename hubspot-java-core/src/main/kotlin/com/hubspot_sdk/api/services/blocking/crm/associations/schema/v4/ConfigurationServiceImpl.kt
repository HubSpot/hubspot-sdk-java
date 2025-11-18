// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.crm.associations.schema.v4

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
import com.hubspot_sdk.api.models.crm.associations.BatchResponseVoid
import com.hubspot_sdk.api.models.crm.associations.schema.v4.BatchResponsePublicAssociationDefinitionConfigurationUpdateResult
import com.hubspot_sdk.api.models.crm.associations.schema.v4.BatchResponsePublicAssociationDefinitionUserConfiguration
import com.hubspot_sdk.api.models.crm.associations.schema.v4.CollectionResponsePublicAssociationDefinitionUserConfiguration
import com.hubspot_sdk.api.models.crm.associations.schema.v4.configurations.ConfigurationBatchCreateParams
import com.hubspot_sdk.api.models.crm.associations.schema.v4.configurations.ConfigurationBatchDeleteParams
import com.hubspot_sdk.api.models.crm.associations.schema.v4.configurations.ConfigurationBatchUpdateParams
import com.hubspot_sdk.api.models.crm.associations.schema.v4.configurations.ConfigurationGetByObjectTypesParams
import com.hubspot_sdk.api.models.crm.associations.schema.v4.configurations.ConfigurationListParams
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class ConfigurationServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    ConfigurationService {

    private val withRawResponse: ConfigurationService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ConfigurationService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ConfigurationService =
        ConfigurationServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun list(
        params: ConfigurationListParams,
        requestOptions: RequestOptions,
    ): CollectionResponsePublicAssociationDefinitionUserConfiguration =
        // get /crm/associations/v4/definitions/configurations/all
        withRawResponse().list(params, requestOptions).parse()

    override fun batchCreate(
        params: ConfigurationBatchCreateParams,
        requestOptions: RequestOptions,
    ): BatchResponsePublicAssociationDefinitionUserConfiguration =
        // post
        // /crm/associations/v4/definitions/configurations/{fromObjectType}/{toObjectType}/batch/create
        withRawResponse().batchCreate(params, requestOptions).parse()

    override fun batchDelete(
        params: ConfigurationBatchDeleteParams,
        requestOptions: RequestOptions,
    ): BatchResponseVoid =
        // post
        // /crm/associations/v4/definitions/configurations/{fromObjectType}/{toObjectType}/batch/purge
        withRawResponse().batchDelete(params, requestOptions).parse()

    override fun batchUpdate(
        params: ConfigurationBatchUpdateParams,
        requestOptions: RequestOptions,
    ): BatchResponsePublicAssociationDefinitionConfigurationUpdateResult =
        // post
        // /crm/associations/v4/definitions/configurations/{fromObjectType}/{toObjectType}/batch/update
        withRawResponse().batchUpdate(params, requestOptions).parse()

    override fun getByObjectTypes(
        params: ConfigurationGetByObjectTypesParams,
        requestOptions: RequestOptions,
    ): CollectionResponsePublicAssociationDefinitionUserConfiguration =
        // get /crm/associations/v4/definitions/configurations/{fromObjectType}/{toObjectType}
        withRawResponse().getByObjectTypes(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ConfigurationService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ConfigurationService.WithRawResponse =
            ConfigurationServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val listHandler:
            Handler<CollectionResponsePublicAssociationDefinitionUserConfiguration> =
            jsonHandler<CollectionResponsePublicAssociationDefinitionUserConfiguration>(
                clientOptions.jsonMapper
            )

        override fun list(
            params: ConfigurationListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CollectionResponsePublicAssociationDefinitionUserConfiguration> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "crm",
                        "associations",
                        "v4",
                        "definitions",
                        "configurations",
                        "all",
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

        private val batchCreateHandler:
            Handler<BatchResponsePublicAssociationDefinitionUserConfiguration> =
            jsonHandler<BatchResponsePublicAssociationDefinitionUserConfiguration>(
                clientOptions.jsonMapper
            )

        override fun batchCreate(
            params: ConfigurationBatchCreateParams,
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
                        "v4",
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

        private val batchDeleteHandler: Handler<BatchResponseVoid> =
            jsonHandler<BatchResponseVoid>(clientOptions.jsonMapper)

        override fun batchDelete(
            params: ConfigurationBatchDeleteParams,
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
                        "associations",
                        "v4",
                        "definitions",
                        "configurations",
                        params._pathParam(0),
                        params._pathParam(1),
                        "batch",
                        "purge",
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

        private val batchUpdateHandler:
            Handler<BatchResponsePublicAssociationDefinitionConfigurationUpdateResult> =
            jsonHandler<BatchResponsePublicAssociationDefinitionConfigurationUpdateResult>(
                clientOptions.jsonMapper
            )

        override fun batchUpdate(
            params: ConfigurationBatchUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BatchResponsePublicAssociationDefinitionConfigurationUpdateResult> {
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
                        "definitions",
                        "configurations",
                        params._pathParam(0),
                        params._pathParam(1),
                        "batch",
                        "update",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { batchUpdateHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val getByObjectTypesHandler:
            Handler<CollectionResponsePublicAssociationDefinitionUserConfiguration> =
            jsonHandler<CollectionResponsePublicAssociationDefinitionUserConfiguration>(
                clientOptions.jsonMapper
            )

        override fun getByObjectTypes(
            params: ConfigurationGetByObjectTypesParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CollectionResponsePublicAssociationDefinitionUserConfiguration> {
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
                        "definitions",
                        "configurations",
                        params._pathParam(0),
                        params._pathParam(1),
                    )
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getByObjectTypesHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
