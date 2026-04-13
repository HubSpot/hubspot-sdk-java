// File generated from our OpenAPI spec by Stainless.

package com.hubspot.services.blocking.cms

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
import com.hubspot.models.ActionResponse
import com.hubspot.models.TaskLocator
import com.hubspot.models.cms.sourcecode.AssetFileMetadata
import com.hubspot.models.cms.sourcecode.SourceCodeCreateParams
import com.hubspot.models.cms.sourcecode.SourceCodeDeleteParams
import com.hubspot.models.cms.sourcecode.SourceCodeExtractAsyncParams
import com.hubspot.models.cms.sourcecode.SourceCodeGetExtractionStatusParams
import com.hubspot.models.cms.sourcecode.SourceCodeGetMetadataParams
import com.hubspot.models.cms.sourcecode.SourceCodeGetParams
import com.hubspot.models.cms.sourcecode.SourceCodeUpsertParams
import com.hubspot.models.cms.sourcecode.SourceCodeValidateParams
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class SourceCodeServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    SourceCodeService {

    private val withRawResponse: SourceCodeService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): SourceCodeService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): SourceCodeService =
        SourceCodeServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    @Deprecated("deprecated")
    override fun create(
        params: SourceCodeCreateParams,
        requestOptions: RequestOptions,
    ): AssetFileMetadata =
        // post /cms/source-code/2026-03/{environment}/content/{path}
        withRawResponse().create(params, requestOptions).parse()

    override fun delete(params: SourceCodeDeleteParams, requestOptions: RequestOptions) {
        // delete /cms/source-code/2026-03/{environment}/content/{path}
        withRawResponse().delete(params, requestOptions)
    }

    override fun extractAsync(
        params: SourceCodeExtractAsyncParams,
        requestOptions: RequestOptions,
    ): TaskLocator =
        // post /cms/source-code/2026-03/extract/async
        withRawResponse().extractAsync(params, requestOptions).parse()

    override fun get(params: SourceCodeGetParams, requestOptions: RequestOptions): HttpResponse =
        // get /cms/source-code/2026-03/{environment}/content/{path}
        withRawResponse().get(params, requestOptions)

    override fun getExtractionStatus(
        params: SourceCodeGetExtractionStatusParams,
        requestOptions: RequestOptions,
    ): ActionResponse =
        // get /cms/source-code/2026-03/extract/async/tasks/{taskId}/status
        withRawResponse().getExtractionStatus(params, requestOptions).parse()

    override fun getMetadata(
        params: SourceCodeGetMetadataParams,
        requestOptions: RequestOptions,
    ): AssetFileMetadata =
        // get /cms/source-code/2026-03/{environment}/metadata/{path}
        withRawResponse().getMetadata(params, requestOptions).parse()

    override fun upsert(
        params: SourceCodeUpsertParams,
        requestOptions: RequestOptions,
    ): AssetFileMetadata =
        // put /cms/source-code/2026-03/{environment}/content/{path}
        withRawResponse().upsert(params, requestOptions).parse()

    override fun validate(
        params: SourceCodeValidateParams,
        requestOptions: RequestOptions,
    ): HttpResponse =
        // post /cms/source-code/2026-03/{environment}/validate/{path}
        withRawResponse().validate(params, requestOptions)

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        SourceCodeService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SourceCodeService.WithRawResponse =
            SourceCodeServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<AssetFileMetadata> =
            jsonHandler<AssetFileMetadata>(clientOptions.jsonMapper)

        @Deprecated("deprecated")
        override fun create(
            params: SourceCodeCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AssetFileMetadata> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("path", params.path().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "cms",
                        "source-code",
                        "2026-03",
                        params._pathParam(0),
                        "content",
                        params._pathParam(1),
                    )
                    .body(multipartFormData(clientOptions.jsonMapper, params._body()))
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

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: SourceCodeDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("path", params.path().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "cms",
                        "source-code",
                        "2026-03",
                        params._pathParam(0),
                        "content",
                        params._pathParam(1),
                    )
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { deleteHandler.handle(it) }
            }
        }

        private val extractAsyncHandler: Handler<TaskLocator> =
            jsonHandler<TaskLocator>(clientOptions.jsonMapper)

        override fun extractAsync(
            params: SourceCodeExtractAsyncParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TaskLocator> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("cms", "source-code", "2026-03", "extract", "async")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { extractAsyncHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        override fun get(
            params: SourceCodeGetParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("path", params.path().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "cms",
                        "source-code",
                        "2026-03",
                        params._pathParam(0),
                        "content",
                        params._pathParam(1),
                    )
                    .putHeader("Accept", "*/*")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response)
        }

        private val getExtractionStatusHandler: Handler<ActionResponse> =
            jsonHandler<ActionResponse>(clientOptions.jsonMapper)

        override fun getExtractionStatus(
            params: SourceCodeGetExtractionStatusParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ActionResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("taskId", params.taskId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "cms",
                        "source-code",
                        "2026-03",
                        "extract",
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
                    .use { getExtractionStatusHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val getMetadataHandler: Handler<AssetFileMetadata> =
            jsonHandler<AssetFileMetadata>(clientOptions.jsonMapper)

        override fun getMetadata(
            params: SourceCodeGetMetadataParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AssetFileMetadata> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("path", params.path().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "cms",
                        "source-code",
                        "2026-03",
                        params._pathParam(0),
                        "metadata",
                        params._pathParam(1),
                    )
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getMetadataHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val upsertHandler: Handler<AssetFileMetadata> =
            jsonHandler<AssetFileMetadata>(clientOptions.jsonMapper)

        override fun upsert(
            params: SourceCodeUpsertParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AssetFileMetadata> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("path", params.path().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "cms",
                        "source-code",
                        "2026-03",
                        params._pathParam(0),
                        "content",
                        params._pathParam(1),
                    )
                    .body(multipartFormData(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { upsertHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        override fun validate(
            params: SourceCodeValidateParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("path", params.path().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "cms",
                        "source-code",
                        "2026-03",
                        params._pathParam(0),
                        "validate",
                        params._pathParam(1),
                    )
                    .putHeader("Accept", "*/*")
                    .body(multipartFormData(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response)
        }
    }
}
