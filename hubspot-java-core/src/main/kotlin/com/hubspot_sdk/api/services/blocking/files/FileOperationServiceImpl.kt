// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.files

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
import com.hubspot_sdk.api.core.http.multipartFormData
import com.hubspot_sdk.api.core.http.parseable
import com.hubspot_sdk.api.core.prepare
import com.hubspot_sdk.api.models.files.CollectionResponseFile
import com.hubspot_sdk.api.models.files.File
import com.hubspot_sdk.api.models.files.FileActionResponse
import com.hubspot_sdk.api.models.files.FileStat
import com.hubspot_sdk.api.models.files.ImportFromUrlTaskLocator
import com.hubspot_sdk.api.models.files.SignedUrl
import com.hubspot_sdk.api.models.files.fileoperations.FileOperationDeleteParams
import com.hubspot_sdk.api.models.files.fileoperations.FileOperationGdprDeleteParams
import com.hubspot_sdk.api.models.files.fileoperations.FileOperationGetByPathParams
import com.hubspot_sdk.api.models.files.fileoperations.FileOperationGetImportTaskStatusParams
import com.hubspot_sdk.api.models.files.fileoperations.FileOperationGetParams
import com.hubspot_sdk.api.models.files.fileoperations.FileOperationGetSignedUrlParams
import com.hubspot_sdk.api.models.files.fileoperations.FileOperationImportFromUrlAsyncParams
import com.hubspot_sdk.api.models.files.fileoperations.FileOperationReplaceParams
import com.hubspot_sdk.api.models.files.fileoperations.FileOperationSearchPage
import com.hubspot_sdk.api.models.files.fileoperations.FileOperationSearchParams
import com.hubspot_sdk.api.models.files.fileoperations.FileOperationUpdateParams
import com.hubspot_sdk.api.models.files.fileoperations.FileOperationUploadParams
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class FileOperationServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    FileOperationService {

    private val withRawResponse: FileOperationService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): FileOperationService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): FileOperationService =
        FileOperationServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun update(params: FileOperationUpdateParams, requestOptions: RequestOptions): File =
        // patch /files/v3/files/{fileId}
        withRawResponse().update(params, requestOptions).parse()

    override fun delete(params: FileOperationDeleteParams, requestOptions: RequestOptions) {
        // delete /files/v3/files/{fileId}
        withRawResponse().delete(params, requestOptions)
    }

    override fun gdprDelete(params: FileOperationGdprDeleteParams, requestOptions: RequestOptions) {
        // delete /files/v3/files/{fileId}/gdpr-delete
        withRawResponse().gdprDelete(params, requestOptions)
    }

    override fun get(params: FileOperationGetParams, requestOptions: RequestOptions): File =
        // get /files/v3/files/{fileId}
        withRawResponse().get(params, requestOptions).parse()

    override fun getByPath(
        params: FileOperationGetByPathParams,
        requestOptions: RequestOptions,
    ): FileStat =
        // get /files/v3/files/stat/{path}
        withRawResponse().getByPath(params, requestOptions).parse()

    override fun getImportTaskStatus(
        params: FileOperationGetImportTaskStatusParams,
        requestOptions: RequestOptions,
    ): FileActionResponse =
        // get /files/v3/files/import-from-url/async/tasks/{taskId}/status
        withRawResponse().getImportTaskStatus(params, requestOptions).parse()

    override fun getSignedUrl(
        params: FileOperationGetSignedUrlParams,
        requestOptions: RequestOptions,
    ): SignedUrl =
        // get /files/v3/files/{fileId}/signed-url
        withRawResponse().getSignedUrl(params, requestOptions).parse()

    override fun importFromUrlAsync(
        params: FileOperationImportFromUrlAsyncParams,
        requestOptions: RequestOptions,
    ): ImportFromUrlTaskLocator =
        // post /files/v3/files/import-from-url/async
        withRawResponse().importFromUrlAsync(params, requestOptions).parse()

    override fun replace(params: FileOperationReplaceParams, requestOptions: RequestOptions): File =
        // put /files/v3/files/{fileId}
        withRawResponse().replace(params, requestOptions).parse()

    override fun search(
        params: FileOperationSearchParams,
        requestOptions: RequestOptions,
    ): FileOperationSearchPage =
        // get /files/v3/files/search
        withRawResponse().search(params, requestOptions).parse()

    override fun upload(params: FileOperationUploadParams, requestOptions: RequestOptions): File =
        // post /files/v3/files
        withRawResponse().upload(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        FileOperationService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): FileOperationService.WithRawResponse =
            FileOperationServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val updateHandler: Handler<File> = jsonHandler<File>(clientOptions.jsonMapper)

        override fun update(
            params: FileOperationUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<File> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("fileId", params.fileId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("files", "v3", "files", params._pathParam(0))
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
            params: FileOperationDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("fileId", params.fileId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("files", "v3", "files", params._pathParam(0))
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
            params: FileOperationGdprDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("fileId", params.fileId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("files", "v3", "files", params._pathParam(0), "gdpr-delete")
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
            params: FileOperationGetParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<File> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("fileId", params.fileId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("files", "v3", "files", params._pathParam(0))
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
            params: FileOperationGetByPathParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FileStat> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("filePath", params.filePath().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("files", "v3", "files", "stat", params._pathParam(0))
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
            params: FileOperationGetImportTaskStatusParams,
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
                        "v3",
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
            params: FileOperationGetSignedUrlParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SignedUrl> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("fileId", params.fileId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("files", "v3", "files", params._pathParam(0), "signed-url")
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
            params: FileOperationImportFromUrlAsyncParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ImportFromUrlTaskLocator> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("files", "v3", "files", "import-from-url", "async")
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
            params: FileOperationReplaceParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<File> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("fileId", params.fileId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("files", "v3", "files", params._pathParam(0))
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
            params: FileOperationSearchParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FileOperationSearchPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("files", "v3", "files", "search")
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
                        FileOperationSearchPage.builder()
                            .service(FileOperationServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val uploadHandler: Handler<File> = jsonHandler<File>(clientOptions.jsonMapper)

        override fun upload(
            params: FileOperationUploadParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<File> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("files", "v3", "files")
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
