// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.crm.associationsschema

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
import com.hubspot_sdk.api.core.prepareAsync
import com.hubspot_sdk.api.models.crm.BatchResponseVoid
import com.hubspot_sdk.api.models.crm.associationsschema.BatchResponsePublicAssociationDefinitionConfigurationUpdateResult
import com.hubspot_sdk.api.models.crm.associationsschema.CollectionResponsePublicAssociationDefinitionUserConfigurationNoPaging
import com.hubspot_sdk.api.models.crm.associationsschema.limits.LimitBatchDeleteParams
import com.hubspot_sdk.api.models.crm.associationsschema.limits.LimitBatchUpdateParams
import com.hubspot_sdk.api.models.crm.associationsschema.limits.LimitGetByObjectTypesParams
import com.hubspot_sdk.api.models.crm.associationsschema.limits.LimitListParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class LimitServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    LimitServiceAsync {

    private val withRawResponse: LimitServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): LimitServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): LimitServiceAsync =
        LimitServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun list(
        params: LimitListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CollectionResponsePublicAssociationDefinitionUserConfigurationNoPaging> =
        // get /crm/associations/2026-03/definitions/configurations/all
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun batchDelete(
        params: LimitBatchDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BatchResponseVoid> =
        // post
        // /crm/associations/2026-03/definitions/configurations/{fromObjectType}/{toObjectType}/batch/purge
        withRawResponse().batchDelete(params, requestOptions).thenApply { it.parse() }

    override fun batchUpdate(
        params: LimitBatchUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BatchResponsePublicAssociationDefinitionConfigurationUpdateResult> =
        // post
        // /crm/associations/2026-03/definitions/configurations/{fromObjectType}/{toObjectType}/batch/update
        withRawResponse().batchUpdate(params, requestOptions).thenApply { it.parse() }

    override fun getByObjectTypes(
        params: LimitGetByObjectTypesParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CollectionResponsePublicAssociationDefinitionUserConfigurationNoPaging> =
        // get /crm/associations/2026-03/definitions/configurations/{fromObjectType}/{toObjectType}
        withRawResponse().getByObjectTypes(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        LimitServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): LimitServiceAsync.WithRawResponse =
            LimitServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val listHandler:
            Handler<CollectionResponsePublicAssociationDefinitionUserConfigurationNoPaging> =
            jsonHandler<CollectionResponsePublicAssociationDefinitionUserConfigurationNoPaging>(
                clientOptions.jsonMapper
            )

        override fun list(
            params: LimitListParams,
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
                        "associations",
                        "2026-03",
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

        private val batchDeleteHandler: Handler<BatchResponseVoid> =
            jsonHandler<BatchResponseVoid>(clientOptions.jsonMapper)

        override fun batchDelete(
            params: LimitBatchDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BatchResponseVoid>> {
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
                        response
                            .use { batchDeleteHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
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
            params: LimitBatchUpdateParams,
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
                        "associations",
                        "2026-03",
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
                            .use { batchUpdateHandler.handle(it) }
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
            params: LimitGetByObjectTypesParams,
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
                        "associations",
                        "2026-03",
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
