// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.automation

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
import com.hubspot_sdk.api.models.automation.actions.ActionCompleteBatchParams
import com.hubspot_sdk.api.models.automation.actions.ActionCompleteParams
import com.hubspot_sdk.api.models.automation.actions.ActionCreateOrReplaceByFunctionTypeParams
import com.hubspot_sdk.api.models.automation.actions.ActionCreateOrReplaceParams
import com.hubspot_sdk.api.models.automation.actions.ActionCreateParams
import com.hubspot_sdk.api.models.automation.actions.ActionCreateRequiresObjectParams
import com.hubspot_sdk.api.models.automation.actions.ActionDeleteByFunctionTypeParams
import com.hubspot_sdk.api.models.automation.actions.ActionDeleteParams
import com.hubspot_sdk.api.models.automation.actions.ActionGetByFunctionTypeParams
import com.hubspot_sdk.api.models.automation.actions.ActionGetParams
import com.hubspot_sdk.api.models.automation.actions.ActionGetRequiresObjectParams
import com.hubspot_sdk.api.models.automation.actions.ActionListPageAsync
import com.hubspot_sdk.api.models.automation.actions.ActionListParams
import com.hubspot_sdk.api.models.automation.actions.ActionUpdateParams
import com.hubspot_sdk.api.models.automation.actions.CollectionResponsePublicActionRevisionForwardPaging
import com.hubspot_sdk.api.models.automation.actions.PublicActionDefinition
import com.hubspot_sdk.api.models.automation.actions.PublicActionDefinitionRequiresObjectResponse
import com.hubspot_sdk.api.models.automation.actions.PublicActionFunction
import com.hubspot_sdk.api.models.automation.actions.PublicActionFunctionIdentifier
import com.hubspot_sdk.api.models.automation.actions.PublicActionRevision
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class ActionServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    ActionServiceAsync {

    private val withRawResponse: ActionServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ActionServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ActionServiceAsync =
        ActionServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: ActionCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PublicActionDefinition> =
        // post /automation/actions/2026-03/{appId}
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: ActionUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PublicActionDefinition> =
        // patch /automation/actions/2026-03/{appId}/{definitionId}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: ActionListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ActionListPageAsync> =
        // get /automation/actions/2026-03/{appId}/{definitionId}/revisions
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: ActionDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // delete
        // /automation/actions/2026-03/{appId}/{definitionId}/functions/{functionType}/{functionId}
        withRawResponse().delete(params, requestOptions).thenAccept {}

    override fun complete(
        params: ActionCompleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // post /automation/actions/callbacks/2026-03/{callbackId}/complete
        withRawResponse().complete(params, requestOptions).thenAccept {}

    override fun completeBatch(
        params: ActionCompleteBatchParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // post /automation/actions/callbacks/2026-03/complete
        withRawResponse().completeBatch(params, requestOptions).thenAccept {}

    override fun createOrReplace(
        params: ActionCreateOrReplaceParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PublicActionFunctionIdentifier> =
        // put
        // /automation/actions/2026-03/{appId}/{definitionId}/functions/{functionType}/{functionId}
        withRawResponse().createOrReplace(params, requestOptions).thenApply { it.parse() }

    override fun createOrReplaceByFunctionType(
        params: ActionCreateOrReplaceByFunctionTypeParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PublicActionFunctionIdentifier> =
        // put /automation/actions/2026-03/{appId}/{definitionId}/functions/{functionType}
        withRawResponse().createOrReplaceByFunctionType(params, requestOptions).thenApply {
            it.parse()
        }

    override fun createRequiresObject(
        params: ActionCreateRequiresObjectParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // post /automation/actions/2026-03/{appId}/{definitionId}/requires-object
        withRawResponse().createRequiresObject(params, requestOptions).thenAccept {}

    override fun deleteByFunctionType(
        params: ActionDeleteByFunctionTypeParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // delete /automation/actions/2026-03/{appId}/{definitionId}/functions/{functionType}
        withRawResponse().deleteByFunctionType(params, requestOptions).thenAccept {}

    override fun get(
        params: ActionGetParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PublicActionRevision> =
        // get /automation/actions/2026-03/{appId}/{definitionId}/revisions/{revisionId}
        withRawResponse().get(params, requestOptions).thenApply { it.parse() }

    override fun getByFunctionType(
        params: ActionGetByFunctionTypeParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PublicActionFunction> =
        // get /automation/actions/2026-03/{appId}/{definitionId}/functions/{functionType}
        withRawResponse().getByFunctionType(params, requestOptions).thenApply { it.parse() }

    override fun getRequiresObject(
        params: ActionGetRequiresObjectParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PublicActionDefinitionRequiresObjectResponse> =
        // get /automation/actions/2026-03/{appId}/{definitionId}/requires-object
        withRawResponse().getRequiresObject(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ActionServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ActionServiceAsync.WithRawResponse =
            ActionServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<PublicActionDefinition> =
            jsonHandler<PublicActionDefinition>(clientOptions.jsonMapper)

        override fun create(
            params: ActionCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PublicActionDefinition>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("appId", params.appId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("automation", "actions", "2026-03", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { createHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val updateHandler: Handler<PublicActionDefinition> =
            jsonHandler<PublicActionDefinition>(clientOptions.jsonMapper)

        override fun update(
            params: ActionUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PublicActionDefinition>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("definitionId", params.definitionId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "automation",
                        "actions",
                        "2026-03",
                        params._pathParam(0),
                        params._pathParam(1),
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
                            .use { updateHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val listHandler: Handler<CollectionResponsePublicActionRevisionForwardPaging> =
            jsonHandler<CollectionResponsePublicActionRevisionForwardPaging>(
                clientOptions.jsonMapper
            )

        override fun list(
            params: ActionListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ActionListPageAsync>> {
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
                        "revisions",
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
                            .let {
                                ActionListPageAsync.builder()
                                    .service(ActionServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: ActionDeleteParams,
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

        private val completeHandler: Handler<Void?> = emptyHandler()

        override fun complete(
            params: ActionCompleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("callbackId", params.callbackId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "automation",
                        "actions",
                        "callbacks",
                        "2026-03",
                        params._pathParam(0),
                        "complete",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { completeHandler.handle(it) }
                    }
                }
        }

        private val completeBatchHandler: Handler<Void?> = emptyHandler()

        override fun completeBatch(
            params: ActionCompleteBatchParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("automation", "actions", "callbacks", "2026-03", "complete")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { completeBatchHandler.handle(it) }
                    }
                }
        }

        private val createOrReplaceHandler: Handler<PublicActionFunctionIdentifier> =
            jsonHandler<PublicActionFunctionIdentifier>(clientOptions.jsonMapper)

        override fun createOrReplace(
            params: ActionCreateOrReplaceParams,
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
            params: ActionCreateOrReplaceByFunctionTypeParams,
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

        private val createRequiresObjectHandler: Handler<Void?> = emptyHandler()

        override fun createRequiresObject(
            params: ActionCreateRequiresObjectParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("definitionId", params.definitionId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "automation",
                        "actions",
                        "2026-03",
                        params._pathParam(0),
                        params._pathParam(1),
                        "requires-object",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { createRequiresObjectHandler.handle(it) }
                    }
                }
        }

        private val deleteByFunctionTypeHandler: Handler<Void?> = emptyHandler()

        override fun deleteByFunctionType(
            params: ActionDeleteByFunctionTypeParams,
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

        private val getHandler: Handler<PublicActionRevision> =
            jsonHandler<PublicActionRevision>(clientOptions.jsonMapper)

        override fun get(
            params: ActionGetParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PublicActionRevision>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("revisionId", params.revisionId().getOrNull())
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
                        "revisions",
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
            params: ActionGetByFunctionTypeParams,
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

        private val getRequiresObjectHandler:
            Handler<PublicActionDefinitionRequiresObjectResponse> =
            jsonHandler<PublicActionDefinitionRequiresObjectResponse>(clientOptions.jsonMapper)

        override fun getRequiresObject(
            params: ActionGetRequiresObjectParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PublicActionDefinitionRequiresObjectResponse>> {
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
                        "requires-object",
                    )
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { getRequiresObjectHandler.handle(it) }
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
