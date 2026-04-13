// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.async.files

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
import com.hubspot.sdk.models.files.CollectionResponseFolder
import com.hubspot.sdk.models.files.Folder
import com.hubspot.sdk.models.files.FolderActionResponse
import com.hubspot.sdk.models.files.FolderUpdateTaskLocator
import com.hubspot.sdk.models.files.folders.FolderDeleteByIdParams
import com.hubspot.sdk.models.files.folders.FolderDeleteByPathParams
import com.hubspot.sdk.models.files.folders.FolderGetByIdParams
import com.hubspot.sdk.models.files.folders.FolderGetByPathParams
import com.hubspot.sdk.models.files.folders.FolderGetUpdateAsyncStatusParams
import com.hubspot.sdk.models.files.folders.FolderSearchPageAsync
import com.hubspot.sdk.models.files.folders.FolderSearchParams
import com.hubspot.sdk.models.files.folders.FolderUpdateAsyncByIdParams
import com.hubspot.sdk.models.files.folders.FolderUpdateByIdParams
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

    override fun deleteById(
        params: FolderDeleteByIdParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // delete /files/2026-03/folders/{folderId}
        withRawResponse().deleteById(params, requestOptions).thenAccept {}

    override fun deleteByPath(
        params: FolderDeleteByPathParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // delete /files/2026-03/folders/{folderPath}
        withRawResponse().deleteByPath(params, requestOptions).thenAccept {}

    override fun getById(
        params: FolderGetByIdParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Folder> =
        // get /files/2026-03/folders/{folderId}
        withRawResponse().getById(params, requestOptions).thenApply { it.parse() }

    override fun getByPath(
        params: FolderGetByPathParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Folder> =
        // get /files/2026-03/folders/{folderPath}
        withRawResponse().getByPath(params, requestOptions).thenApply { it.parse() }

    override fun getUpdateAsyncStatus(
        params: FolderGetUpdateAsyncStatusParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<FolderActionResponse> =
        // get /files/2026-03/folders/update/async/tasks/{taskId}/status
        withRawResponse().getUpdateAsyncStatus(params, requestOptions).thenApply { it.parse() }

    override fun search(
        params: FolderSearchParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<FolderSearchPageAsync> =
        // get /files/2026-03/folders/search
        withRawResponse().search(params, requestOptions).thenApply { it.parse() }

    override fun updateAsyncById(
        params: FolderUpdateAsyncByIdParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<FolderUpdateTaskLocator> =
        // post /files/2026-03/folders/update/async
        withRawResponse().updateAsyncById(params, requestOptions).thenApply { it.parse() }

    override fun updateById(
        params: FolderUpdateByIdParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Folder> =
        // patch /files/2026-03/folders/{folderId}
        withRawResponse().updateById(params, requestOptions).thenApply { it.parse() }

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

        private val deleteByIdHandler: Handler<Void?> = emptyHandler()

        override fun deleteById(
            params: FolderDeleteByIdParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("folderId", params.folderId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("files", "2026-03", "folders", params._pathParam(0))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { deleteByIdHandler.handle(it) }
                    }
                }
        }

        private val deleteByPathHandler: Handler<Void?> = emptyHandler()

        override fun deleteByPath(
            params: FolderDeleteByPathParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("folderPath", params.folderPath().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("files", "2026-03", "folders", params._pathParam(0))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { deleteByPathHandler.handle(it) }
                    }
                }
        }

        private val getByIdHandler: Handler<Folder> = jsonHandler<Folder>(clientOptions.jsonMapper)

        override fun getById(
            params: FolderGetByIdParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Folder>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("folderId", params.folderId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("files", "2026-03", "folders", params._pathParam(0))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { getByIdHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val getByPathHandler: Handler<Folder> =
            jsonHandler<Folder>(clientOptions.jsonMapper)

        override fun getByPath(
            params: FolderGetByPathParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Folder>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("folderPath", params.folderPath().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("files", "2026-03", "folders", params._pathParam(0))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { getByPathHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val getUpdateAsyncStatusHandler: Handler<FolderActionResponse> =
            jsonHandler<FolderActionResponse>(clientOptions.jsonMapper)

        override fun getUpdateAsyncStatus(
            params: FolderGetUpdateAsyncStatusParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<FolderActionResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("taskId", params.taskId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "files",
                        "2026-03",
                        "folders",
                        "update",
                        "async",
                        "tasks",
                        params._pathParam(0),
                        "status",
                    )
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { getUpdateAsyncStatusHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val searchHandler: Handler<CollectionResponseFolder> =
            jsonHandler<CollectionResponseFolder>(clientOptions.jsonMapper)

        override fun search(
            params: FolderSearchParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<FolderSearchPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("files", "2026-03", "folders", "search")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { searchHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                            .let {
                                FolderSearchPageAsync.builder()
                                    .service(FolderServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }

        private val updateAsyncByIdHandler: Handler<FolderUpdateTaskLocator> =
            jsonHandler<FolderUpdateTaskLocator>(clientOptions.jsonMapper)

        override fun updateAsyncById(
            params: FolderUpdateAsyncByIdParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<FolderUpdateTaskLocator>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("files", "2026-03", "folders", "update", "async")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { updateAsyncByIdHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val updateByIdHandler: Handler<Folder> =
            jsonHandler<Folder>(clientOptions.jsonMapper)

        override fun updateById(
            params: FolderUpdateByIdParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Folder>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("folderId", params.folderId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("files", "2026-03", "folders", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { updateByIdHandler.handle(it) }
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
