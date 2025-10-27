// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.crm.lists

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
import com.hubspot_sdk.api.models.crm.lists.ListFolderCreateResponse
import com.hubspot_sdk.api.models.crm.lists.ListFolderFetchResponse
import com.hubspot_sdk.api.models.crm.lists.folders.FolderCreateParams
import com.hubspot_sdk.api.models.crm.lists.folders.FolderDeleteParams
import com.hubspot_sdk.api.models.crm.lists.folders.FolderGetParams
import com.hubspot_sdk.api.models.crm.lists.folders.FolderMoveListParams
import com.hubspot_sdk.api.models.crm.lists.folders.FolderMoveParams
import com.hubspot_sdk.api.models.crm.lists.folders.FolderRenameParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class FolderServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    FolderServiceAsync {

    private val withRawResponse: FolderServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): FolderServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): FolderServiceAsync =
        FolderServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: FolderCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ListFolderCreateResponse> =
        // post /crm/v3/lists/folders
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: FolderDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // delete /crm/v3/lists/folders/{folderId}
        withRawResponse().delete(params, requestOptions).thenAccept {}

    override fun get(
        params: FolderGetParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ListFolderFetchResponse> =
        // get /crm/v3/lists/folders
        withRawResponse().get(params, requestOptions).thenApply { it.parse() }

    override fun move(
        params: FolderMoveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ListFolderFetchResponse> =
        // put /crm/v3/lists/folders/{folderId}/move/{newParentFolderId}
        withRawResponse().move(params, requestOptions).thenApply { it.parse() }

    override fun moveList(
        params: FolderMoveListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // put /crm/v3/lists/folders/move-list
        withRawResponse().moveList(params, requestOptions).thenAccept {}

    override fun rename(
        params: FolderRenameParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ListFolderFetchResponse> =
        // put /crm/v3/lists/folders/{folderId}/rename
        withRawResponse().rename(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        FolderServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): FolderServiceAsync.WithRawResponse =
            FolderServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<ListFolderCreateResponse> =
            jsonHandler<ListFolderCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: FolderCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ListFolderCreateResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("crm", "v3", "lists", "folders")
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

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: FolderDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("folderId", params.folderId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("crm", "v3", "lists", "folders", params._pathParam(0))
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

        private val getHandler: Handler<ListFolderFetchResponse> =
            jsonHandler<ListFolderFetchResponse>(clientOptions.jsonMapper)

        override fun get(
            params: FolderGetParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ListFolderFetchResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("crm", "v3", "lists", "folders")
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

        private val moveHandler: Handler<ListFolderFetchResponse> =
            jsonHandler<ListFolderFetchResponse>(clientOptions.jsonMapper)

        override fun move(
            params: FolderMoveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ListFolderFetchResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("newParentFolderId", params.newParentFolderId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "crm",
                        "v3",
                        "lists",
                        "folders",
                        params._pathParam(0),
                        "move",
                        params._pathParam(1),
                    )
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { moveHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val moveListHandler: Handler<Void?> = emptyHandler()

        override fun moveList(
            params: FolderMoveListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("crm", "v3", "lists", "folders", "move-list")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { moveListHandler.handle(it) }
                    }
                }
        }

        private val renameHandler: Handler<ListFolderFetchResponse> =
            jsonHandler<ListFolderFetchResponse>(clientOptions.jsonMapper)

        override fun rename(
            params: FolderRenameParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ListFolderFetchResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("folderId", params.folderId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "crm",
                        "v3",
                        "lists",
                        "folders",
                        params._pathParam(0),
                        "rename",
                    )
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { renameHandler.handle(it) }
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
