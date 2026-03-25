// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.files

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
import com.hubspot_sdk.api.models.files.CollectionResponseFile
import com.hubspot_sdk.api.models.files.FileActionResponse
import com.hubspot_sdk.api.models.files.ImportFromUrlTaskLocator
import com.hubspot_sdk.api.models.files.files.FileGetImportTaskStatusParams
import com.hubspot_sdk.api.models.files.files.FileImportFromUrlAsyncParams
import com.hubspot_sdk.api.models.files.files.FileSearchPage
import com.hubspot_sdk.api.models.files.files.FileSearchParams
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class FileServiceImpl internal constructor(private val clientOptions: ClientOptions) : FileService {

    private val withRawResponse: FileService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): FileService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): FileService =
        FileServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun getImportTaskStatus(
        params: FileGetImportTaskStatusParams,
        requestOptions: RequestOptions,
    ): FileActionResponse =
        // get /files/2026-03/files/import-from-url/async/tasks/{taskId}/status
        withRawResponse().getImportTaskStatus(params, requestOptions).parse()

    override fun importFromUrlAsync(
        params: FileImportFromUrlAsyncParams,
        requestOptions: RequestOptions,
    ): ImportFromUrlTaskLocator =
        // post /files/2026-03/files/import-from-url/async
        withRawResponse().importFromUrlAsync(params, requestOptions).parse()

    override fun search(params: FileSearchParams, requestOptions: RequestOptions): FileSearchPage =
        // get /files/2026-03/files/search
        withRawResponse().search(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        FileService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): FileService.WithRawResponse =
            FileServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val getImportTaskStatusHandler: Handler<FileActionResponse> =
            jsonHandler<FileActionResponse>(clientOptions.jsonMapper)

        override fun getImportTaskStatus(
            params: FileGetImportTaskStatusParams,
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

        private val importFromUrlAsyncHandler: Handler<ImportFromUrlTaskLocator> =
            jsonHandler<ImportFromUrlTaskLocator>(clientOptions.jsonMapper)

        override fun importFromUrlAsync(
            params: FileImportFromUrlAsyncParams,
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

        private val searchHandler: Handler<CollectionResponseFile> =
            jsonHandler<CollectionResponseFile>(clientOptions.jsonMapper)

        override fun search(
            params: FileSearchParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FileSearchPage> {
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
                        FileSearchPage.builder()
                            .service(FileServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }
    }
}
