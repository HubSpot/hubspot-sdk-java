// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.crm.associations.schema.v4

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
import com.hubspot_sdk.api.models.crm.associations.schema.v4.BatchResponsePublicAssociationDefinitionConfigurationUpdateResult
import com.hubspot_sdk.api.models.crm.associations.schema.v4.BatchResponsePublicAssociationDefinitionUserConfiguration
import com.hubspot_sdk.api.models.crm.associations.schema.v4.CollectionResponsePublicAssociationDefinitionUserConfigurationNoPaging
import com.hubspot_sdk.api.models.crm.associations.schema.v4.configurations.ConfigurationBatchCreateByObjectTypesParams
import com.hubspot_sdk.api.models.crm.associations.schema.v4.configurations.ConfigurationBatchDeleteByObjectTypesParams
import com.hubspot_sdk.api.models.crm.associations.schema.v4.configurations.ConfigurationBatchUpdateByObjectTypesParams
import com.hubspot_sdk.api.models.crm.associations.schema.v4.configurations.ConfigurationGetByObjectTypesParams
import com.hubspot_sdk.api.models.crm.associations.schema.v4.configurations.ConfigurationListParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class ConfigurationServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    ConfigurationServiceAsync {

    private val withRawResponse: ConfigurationServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ConfigurationServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ConfigurationServiceAsync =
        ConfigurationServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun list(
        params: ConfigurationListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CollectionResponsePublicAssociationDefinitionUserConfigurationNoPaging> =
        // get /crm/v4/associations/definitions/configurations/all
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun batchCreateByObjectTypes(
        params: ConfigurationBatchCreateByObjectTypesParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BatchResponsePublicAssociationDefinitionUserConfiguration> =
        // post
        // /crm/v4/associations/definitions/configurations/{fromObjectType}/{toObjectType}/batch/create
        withRawResponse().batchCreateByObjectTypes(params, requestOptions).thenApply { it.parse() }

    override fun batchDeleteByObjectTypes(
        params: ConfigurationBatchDeleteByObjectTypesParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // post
        // /crm/v4/associations/definitions/configurations/{fromObjectType}/{toObjectType}/batch/purge
        withRawResponse().batchDeleteByObjectTypes(params, requestOptions).thenAccept {}

    override fun batchUpdateByObjectTypes(
        params: ConfigurationBatchUpdateByObjectTypesParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BatchResponsePublicAssociationDefinitionConfigurationUpdateResult> =
        // post
        // /crm/v4/associations/definitions/configurations/{fromObjectType}/{toObjectType}/batch/update
        withRawResponse().batchUpdateByObjectTypes(params, requestOptions).thenApply { it.parse() }

    override fun getByObjectTypes(
        params: ConfigurationGetByObjectTypesParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CollectionResponsePublicAssociationDefinitionUserConfigurationNoPaging> =
        // get /crm/v4/associations/definitions/configurations/{fromObjectType}/{toObjectType}
        withRawResponse().getByObjectTypes(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ConfigurationServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ConfigurationServiceAsync.WithRawResponse =
            ConfigurationServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val listHandler:
            Handler<CollectionResponsePublicAssociationDefinitionUserConfigurationNoPaging> =
            jsonHandler<CollectionResponsePublicAssociationDefinitionUserConfigurationNoPaging>(
                clientOptions.jsonMapper
            )

        override fun list(
            params: ConfigurationListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<
            HttpResponseFor<CollectionResponsePublicAssociationDefinitionUserConfigurationNoPaging>
        > {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "crm",
                        "v4",
                        "associations",
                        "definitions",
                        "configurations",
                        "all",
                    )
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

        private val batchCreateByObjectTypesHandler:
            Handler<BatchResponsePublicAssociationDefinitionUserConfiguration> =
            jsonHandler<BatchResponsePublicAssociationDefinitionUserConfiguration>(
                clientOptions.jsonMapper
            )

        override fun batchCreateByObjectTypes(
            params: ConfigurationBatchCreateByObjectTypesParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<
            HttpResponseFor<BatchResponsePublicAssociationDefinitionUserConfiguration>
        > {
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
                        "definitions",
                        "configurations",
                        params._pathParam(0),
                        params._pathParam(1),
                        "batch",
                        "create",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { batchCreateByObjectTypesHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val batchDeleteByObjectTypesHandler: Handler<Void?> = emptyHandler()

        override fun batchDeleteByObjectTypes(
            params: ConfigurationBatchDeleteByObjectTypesParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
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
                        "definitions",
                        "configurations",
                        params._pathParam(0),
                        params._pathParam(1),
                        "batch",
                        "purge",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { batchDeleteByObjectTypesHandler.handle(it) }
                    }
                }
        }

        private val batchUpdateByObjectTypesHandler:
            Handler<BatchResponsePublicAssociationDefinitionConfigurationUpdateResult> =
            jsonHandler<BatchResponsePublicAssociationDefinitionConfigurationUpdateResult>(
                clientOptions.jsonMapper
            )

        override fun batchUpdateByObjectTypes(
            params: ConfigurationBatchUpdateByObjectTypesParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<
            HttpResponseFor<BatchResponsePublicAssociationDefinitionConfigurationUpdateResult>
        > {
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
                        "definitions",
                        "configurations",
                        params._pathParam(0),
                        params._pathParam(1),
                        "batch",
                        "update",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { batchUpdateByObjectTypesHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val getByObjectTypesHandler:
            Handler<CollectionResponsePublicAssociationDefinitionUserConfigurationNoPaging> =
            jsonHandler<CollectionResponsePublicAssociationDefinitionUserConfigurationNoPaging>(
                clientOptions.jsonMapper
            )

        override fun getByObjectTypes(
            params: ConfigurationGetByObjectTypesParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<
            HttpResponseFor<CollectionResponsePublicAssociationDefinitionUserConfigurationNoPaging>
        > {
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
                        "associations",
                        "definitions",
                        "configurations",
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
}
