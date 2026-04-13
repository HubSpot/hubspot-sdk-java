// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.async.automation.actions

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
import com.hubspot.sdk.core.prepareAsync
import com.hubspot.sdk.models.automation.actions.CollectionResponsePublicActionFunctionIdentifierNoPaging
import com.hubspot.sdk.models.automation.actions.PublicActionFunction
import com.hubspot.sdk.models.automation.actions.PublicActionFunctionIdentifier
import com.hubspot.sdk.models.automation.actions.functions.FunctionCreateOrReplaceByFunctionTypeParams
import com.hubspot.sdk.models.automation.actions.functions.FunctionCreateOrReplaceParams
import com.hubspot.sdk.models.automation.actions.functions.FunctionDeleteByFunctionTypeParams
import com.hubspot.sdk.models.automation.actions.functions.FunctionDeleteParams
import com.hubspot.sdk.models.automation.actions.functions.FunctionGetByFunctionTypeParams
import com.hubspot.sdk.models.automation.actions.functions.FunctionGetParams
import com.hubspot.sdk.models.automation.actions.functions.FunctionListParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class FunctionServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    FunctionServiceAsync {

    private val withRawResponse: FunctionServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): FunctionServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): FunctionServiceAsync =
        FunctionServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun list(
        params: FunctionListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CollectionResponsePublicActionFunctionIdentifierNoPaging> =
        // get /automation/actions/2026-03/{appId}/{definitionId}/functions
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: FunctionDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // delete
        // /automation/actions/2026-03/{appId}/{definitionId}/functions/{functionType}/{functionId}
        withRawResponse().delete(params, requestOptions).thenAccept {}

    override fun createOrReplace(
        params: FunctionCreateOrReplaceParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PublicActionFunctionIdentifier> =
        // put
        // /automation/actions/2026-03/{appId}/{definitionId}/functions/{functionType}/{functionId}
        withRawResponse().createOrReplace(params, requestOptions).thenApply { it.parse() }

    override fun createOrReplaceByFunctionType(
        params: FunctionCreateOrReplaceByFunctionTypeParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PublicActionFunctionIdentifier> =
        // put /automation/actions/2026-03/{appId}/{definitionId}/functions/{functionType}
        withRawResponse().createOrReplaceByFunctionType(params, requestOptions).thenApply {
            it.parse()
        }

    override fun deleteByFunctionType(
        params: FunctionDeleteByFunctionTypeParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // delete /automation/actions/2026-03/{appId}/{definitionId}/functions/{functionType}
        withRawResponse().deleteByFunctionType(params, requestOptions).thenAccept {}

    override fun get(
        params: FunctionGetParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PublicActionFunction> =
        // get
        // /automation/actions/2026-03/{appId}/{definitionId}/functions/{functionType}/{functionId}
        withRawResponse().get(params, requestOptions).thenApply { it.parse() }

    override fun getByFunctionType(
        params: FunctionGetByFunctionTypeParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PublicActionFunction> =
        // get /automation/actions/2026-03/{appId}/{definitionId}/functions/{functionType}
        withRawResponse().getByFunctionType(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        FunctionServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): FunctionServiceAsync.WithRawResponse =
            FunctionServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val listHandler: Handler<CollectionResponsePublicActionFunctionIdentifierNoPaging> =
            jsonHandler<CollectionResponsePublicActionFunctionIdentifierNoPaging>(
                clientOptions.jsonMapper
            )

        override fun list(
            params: FunctionListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<
            HttpResponseFor<CollectionResponsePublicActionFunctionIdentifierNoPaging>
        > {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("definitionId", params.definitionId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "automation",
                        "actions",
                        "2026-03",
                        params._pathParam(0),
                        params._pathParam(1),
                        "functions",
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

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: FunctionDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("functionId", params.functionId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "automation",
                        "actions",
                        "2026-03",
                        params._pathParam(0),
                        params._pathParam(1),
                        "functions",
                        params._pathParam(2),
                        params._pathParam(3),
                    )
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { deleteHandler.handle(it) }
                    }
                }
        }

        private val createOrReplaceHandler: Handler<PublicActionFunctionIdentifier> =
            jsonHandler<PublicActionFunctionIdentifier>(clientOptions.jsonMapper)

        override fun createOrReplace(
            params: FunctionCreateOrReplaceParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PublicActionFunctionIdentifier>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("functionId", params.functionId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "automation",
                        "actions",
                        "2026-03",
                        params._pathParam(0),
                        params._pathParam(1),
                        "functions",
                        params._pathParam(2),
                        params._pathParam(3),
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
                            .use { createOrReplaceHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val createOrReplaceByFunctionTypeHandler: Handler<PublicActionFunctionIdentifier> =
            jsonHandler<PublicActionFunctionIdentifier>(clientOptions.jsonMapper)

        override fun createOrReplaceByFunctionType(
            params: FunctionCreateOrReplaceByFunctionTypeParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PublicActionFunctionIdentifier>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("functionType", params.functionType().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "automation",
                        "actions",
                        "2026-03",
                        params._pathParam(0),
                        params._pathParam(1),
                        "functions",
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
                        response
                            .use { createOrReplaceByFunctionTypeHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val deleteByFunctionTypeHandler: Handler<Void?> = emptyHandler()

        override fun deleteByFunctionType(
            params: FunctionDeleteByFunctionTypeParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("functionType", params.functionType().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "automation",
                        "actions",
                        "2026-03",
                        params._pathParam(0),
                        params._pathParam(1),
                        "functions",
                        params._pathParam(2),
                    )
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { deleteByFunctionTypeHandler.handle(it) }
                    }
                }
        }

        private val getHandler: Handler<PublicActionFunction> =
            jsonHandler<PublicActionFunction>(clientOptions.jsonMapper)

        override fun get(
            params: FunctionGetParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PublicActionFunction>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("functionId", params.functionId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "automation",
                        "actions",
                        "2026-03",
                        params._pathParam(0),
                        params._pathParam(1),
                        "functions",
                        params._pathParam(2),
                        params._pathParam(3),
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

        private val getByFunctionTypeHandler: Handler<PublicActionFunction> =
            jsonHandler<PublicActionFunction>(clientOptions.jsonMapper)

        override fun getByFunctionType(
            params: FunctionGetByFunctionTypeParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PublicActionFunction>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("functionType", params.functionType().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "automation",
                        "actions",
                        "2026-03",
                        params._pathParam(0),
                        params._pathParam(1),
                        "functions",
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
                            .use { getByFunctionTypeHandler.handle(it) }
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
