// File generated from our OpenAPI spec by Stainless.

package com.hubspot.services.blocking.files

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
import com.hubspot.core.http.multipartFormData
import com.hubspot.core.http.parseable
import com.hubspot.core.prepare
import com.hubspot.models.files.CollectionResponseFile
import com.hubspot.models.files.File
import com.hubspot.models.files.FileActionResponse
import com.hubspot.models.files.FileStat
import com.hubspot.models.files.Folder
import com.hubspot.models.files.ImportFromUrlTaskLocator
import com.hubspot.models.files.SignedUrl
import com.hubspot.models.files.fileassets.FileAssetCreateParams
import com.hubspot.models.files.fileassets.FileAssetDeleteParams
import com.hubspot.models.files.fileassets.FileAssetGdprDeleteParams
import com.hubspot.models.files.fileassets.FileAssetGetByPathParams
import com.hubspot.models.files.fileassets.FileAssetGetImportTaskStatusParams
import com.hubspot.models.files.fileassets.FileAssetGetParams
import com.hubspot.models.files.fileassets.FileAssetGetSignedUrlParams
import com.hubspot.models.files.fileassets.FileAssetImportFromUrlAsyncParams
import com.hubspot.models.files.fileassets.FileAssetReplaceParams
import com.hubspot.models.files.fileassets.FileAssetSearchPage
import com.hubspot.models.files.fileassets.FileAssetSearchParams
import com.hubspot.models.files.fileassets.FileAssetUpdateParams
import com.hubspot.models.files.fileassets.FileAssetUploadParams
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class FileAssetServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    FileAssetService {

    private val withRawResponse: FileAssetService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): FileAssetService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): FileAssetService =
        FileAssetServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(params: FileAssetCreateParams, requestOptions: RequestOptions): Folder =
        // post /files/2026-03/folders
        withRawResponse().create(params, requestOptions).parse()

    override fun update(params: FileAssetUpdateParams, requestOptions: RequestOptions): File =
        // patch /files/2026-03/files/{fileId}
        withRawResponse().update(params, requestOptions).parse()

    override fun delete(params: FileAssetDeleteParams, requestOptions: RequestOptions) {
        // delete /files/2026-03/files/{fileId}
        withRawResponse().delete(params, requestOptions)
    }

    override fun gdprDelete(params: FileAssetGdprDeleteParams, requestOptions: RequestOptions) {
        // delete /files/2026-03/files/{fileId}/gdpr-delete
        withRawResponse().gdprDelete(params, requestOptions)
    }

    override fun get(params: FileAssetGetParams, requestOptions: RequestOptions): File =
        // get /files/2026-03/files/{fileId}
        withRawResponse().get(params, requestOptions).parse()

    override fun getByPath(
        params: FileAssetGetByPathParams,
        requestOptions: RequestOptions,
    ): FileStat =
        // get /files/2026-03/files/stat/{path}
        withRawResponse().getByPath(params, requestOptions).parse()

    override fun getImportTaskStatus(
        params: FileAssetGetImportTaskStatusParams,
        requestOptions: RequestOptions,
    ): FileActionResponse =
        // get /files/2026-03/files/import-from-url/async/tasks/{taskId}/status
        withRawResponse().getImportTaskStatus(params, requestOptions).parse()

    override fun getSignedUrl(
        params: FileAssetGetSignedUrlParams,
        requestOptions: RequestOptions,
    ): SignedUrl =
        // get /files/2026-03/files/{fileId}/signed-url
        withRawResponse().getSignedUrl(params, requestOptions).parse()

    override fun importFromUrlAsync(
        params: FileAssetImportFromUrlAsyncParams,
        requestOptions: RequestOptions,
    ): ImportFromUrlTaskLocator =
        // post /files/2026-03/files/import-from-url/async
        withRawResponse().importFromUrlAsync(params, requestOptions).parse()

    override fun replace(params: FileAssetReplaceParams, requestOptions: RequestOptions): File =
        // put /files/2026-03/files/{fileId}
        withRawResponse().replace(params, requestOptions).parse()

    override fun search(
        params: FileAssetSearchParams,
        requestOptions: RequestOptions,
    ): FileAssetSearchPage =
        // get /files/2026-03/files/search
        withRawResponse().search(params, requestOptions).parse()

    override fun upload(params: FileAssetUploadParams, requestOptions: RequestOptions): File =
        // post /files/2026-03/files
        withRawResponse().upload(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        FileAssetService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): FileAssetService.WithRawResponse =
            FileAssetServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<Folder> = jsonHandler<Folder>(clientOptions.jsonMapper)

        override fun create(
            params: FileAssetCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Folder> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("files", "2026-03", "folders")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val updateHandler: Handler<File> = jsonHandler<File>(clientOptions.jsonMapper)

        override fun update(
            params: FileAssetUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<File> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("fileId", params.fileId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("files", "2026-03", "files", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { updateHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: FileAssetDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("fileId", params.fileId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("files", "2026-03", "files", params._pathParam(0))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { deleteHandler.handle(it) }
            }
        }

        private val gdprDeleteHandler: Handler<Void?> = emptyHandler()

        override fun gdprDelete(
            params: FileAssetGdprDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("fileId", params.fileId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "files",
                        "2026-03",
                        "files",
                        params._pathParam(0),
                        "gdpr-delete",
                    )
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { gdprDeleteHandler.handle(it) }
            }
        }

        private val getHandler: Handler<File> = jsonHandler<File>(clientOptions.jsonMapper)

        override fun get(
            params: FileAssetGetParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<File> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("fileId", params.fileId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("files", "2026-03", "files", params._pathParam(0))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val getByPathHandler: Handler<FileStat> =
            jsonHandler<FileStat>(clientOptions.jsonMapper)

        override fun getByPath(
            params: FileAssetGetByPathParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FileStat> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("path", params.path().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("files", "2026-03", "files", "stat", params._pathParam(0))
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

        private val getImportTaskStatusHandler: Handler<FileActionResponse> =
            jsonHandler<FileActionResponse>(clientOptions.jsonMapper)

        override fun getImportTaskStatus(
            params: FileAssetGetImportTaskStatusParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FileActionResponse> {
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
                        "files",
                        "import-from-url",
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
                    .use { getImportTaskStatusHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val getSignedUrlHandler: Handler<SignedUrl> =
            jsonHandler<SignedUrl>(clientOptions.jsonMapper)

        override fun getSignedUrl(
            params: FileAssetGetSignedUrlParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SignedUrl> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("fileId", params.fileId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "files",
                        "2026-03",
                        "files",
                        params._pathParam(0),
                        "signed-url",
                    )
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getSignedUrlHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val importFromUrlAsyncHandler: Handler<ImportFromUrlTaskLocator> =
            jsonHandler<ImportFromUrlTaskLocator>(clientOptions.jsonMapper)

        override fun importFromUrlAsync(
            params: FileAssetImportFromUrlAsyncParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ImportFromUrlTaskLocator> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("files", "2026-03", "files", "import-from-url", "async")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { importFromUrlAsyncHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val replaceHandler: Handler<File> = jsonHandler<File>(clientOptions.jsonMapper)

        override fun replace(
            params: FileAssetReplaceParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<File> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("fileId", params.fileId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("files", "2026-03", "files", params._pathParam(0))
                    .body(multipartFormData(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { replaceHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val searchHandler: Handler<CollectionResponseFile> =
            jsonHandler<CollectionResponseFile>(clientOptions.jsonMapper)

        override fun search(
            params: FileAssetSearchParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FileAssetSearchPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("files", "2026-03", "files", "search")
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
                        FileAssetSearchPage.builder()
                            .service(FileAssetServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val uploadHandler: Handler<File> = jsonHandler<File>(clientOptions.jsonMapper)

        override fun upload(
            params: FileAssetUploadParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<File> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("files", "2026-03", "files")
                    .body(multipartFormData(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { uploadHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
