// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.blocking.files

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
import com.hubspot.sdk.core.prepare
import com.hubspot.sdk.models.files.CollectionResponseFolder
import com.hubspot.sdk.models.files.Folder
import com.hubspot.sdk.models.files.FolderActionResponse
import com.hubspot.sdk.models.files.FolderUpdateTaskLocator
import com.hubspot.sdk.models.files.folders.FolderDeleteByIdParams
import com.hubspot.sdk.models.files.folders.FolderDeleteByPathParams
import com.hubspot.sdk.models.files.folders.FolderGetByIdParams
import com.hubspot.sdk.models.files.folders.FolderGetByPathParams
import com.hubspot.sdk.models.files.folders.FolderGetUpdateAsyncStatusParams
import com.hubspot.sdk.models.files.folders.FolderSearchPage
import com.hubspot.sdk.models.files.folders.FolderSearchParams
import com.hubspot.sdk.models.files.folders.FolderUpdateAsyncByIdParams
import com.hubspot.sdk.models.files.folders.FolderUpdateByIdParams
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class FolderServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    FolderService {

    private val withRawResponse: FolderService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): FolderService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): FolderService =
        FolderServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun deleteById(params: FolderDeleteByIdParams, requestOptions: RequestOptions) {
        // delete /files/2026-03/folders/{folderId}
        withRawResponse().deleteById(params, requestOptions)
    }

    override fun deleteByPath(params: FolderDeleteByPathParams, requestOptions: RequestOptions) {
        // delete /files/2026-03/folders/{folderPath}
        withRawResponse().deleteByPath(params, requestOptions)
    }

    override fun getById(params: FolderGetByIdParams, requestOptions: RequestOptions): Folder =
        // get /files/2026-03/folders/{folderId}
        withRawResponse().getById(params, requestOptions).parse()

    override fun getByPath(params: FolderGetByPathParams, requestOptions: RequestOptions): Folder =
        // get /files/2026-03/folders/{folderPath}
        withRawResponse().getByPath(params, requestOptions).parse()

    override fun getUpdateAsyncStatus(
        params: FolderGetUpdateAsyncStatusParams,
        requestOptions: RequestOptions,
    ): FolderActionResponse =
        // get /files/2026-03/folders/update/async/tasks/{taskId}/status
        withRawResponse().getUpdateAsyncStatus(params, requestOptions).parse()

    override fun search(
        params: FolderSearchParams,
        requestOptions: RequestOptions,
    ): FolderSearchPage =
        // get /files/2026-03/folders/search
        withRawResponse().search(params, requestOptions).parse()

    override fun updateAsyncById(
        params: FolderUpdateAsyncByIdParams,
        requestOptions: RequestOptions,
    ): FolderUpdateTaskLocator =
        // post /files/2026-03/folders/update/async
        withRawResponse().updateAsyncById(params, requestOptions).parse()

    override fun updateById(
        params: FolderUpdateByIdParams,
        requestOptions: RequestOptions,
    ): Folder =
        // patch /files/2026-03/folders/{folderId}
        withRawResponse().updateById(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        FolderService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): FolderService.WithRawResponse =
            FolderServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val deleteByIdHandler: Handler<Void?> = emptyHandler()

        override fun deleteById(
            params: FolderDeleteByIdParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { deleteByIdHandler.handle(it) }
            }
        }

        private val deleteByPathHandler: Handler<Void?> = emptyHandler()

        override fun deleteByPath(
            params: FolderDeleteByPathParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { deleteByPathHandler.handle(it) }
            }
        }

        private val getByIdHandler: Handler<Folder> = jsonHandler<Folder>(clientOptions.jsonMapper)

        override fun getById(
            params: FolderGetByIdParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Folder> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("folderId", params.folderId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("files", "2026-03", "folders", params._pathParam(0))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getByIdHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val getByPathHandler: Handler<Folder> =
            jsonHandler<Folder>(clientOptions.jsonMapper)

        override fun getByPath(
            params: FolderGetByPathParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Folder> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("folderPath", params.folderPath().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("files", "2026-03", "folders", params._pathParam(0))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getByPathHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val getUpdateAsyncStatusHandler: Handler<FolderActionResponse> =
            jsonHandler<FolderActionResponse>(clientOptions.jsonMapper)

        override fun getUpdateAsyncStatus(
            params: FolderGetUpdateAsyncStatusParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FolderActionResponse> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getUpdateAsyncStatusHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val searchHandler: Handler<CollectionResponseFolder> =
            jsonHandler<CollectionResponseFolder>(clientOptions.jsonMapper)

        override fun search(
            params: FolderSearchParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FolderSearchPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("files", "2026-03", "folders", "search")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { searchHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let {
                        FolderSearchPage.builder()
                            .service(FolderServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val updateAsyncByIdHandler: Handler<FolderUpdateTaskLocator> =
            jsonHandler<FolderUpdateTaskLocator>(clientOptions.jsonMapper)

        override fun updateAsyncById(
            params: FolderUpdateAsyncByIdParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FolderUpdateTaskLocator> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("files", "2026-03", "folders", "update", "async")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { updateAsyncByIdHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val updateByIdHandler: Handler<Folder> =
            jsonHandler<Folder>(clientOptions.jsonMapper)

        override fun updateById(
            params: FolderUpdateByIdParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Folder> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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
