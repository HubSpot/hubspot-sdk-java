// File generated from our OpenAPI spec by Stainless.

package com.hubspot.services.async.crm

import com.hubspot.core.ClientOptions
import com.hubspot.core.RequestOptions
import com.hubspot.core.checkRequired
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
import com.hubspot.core.prepareAsync
import com.hubspot.models.ActionResponse
import com.hubspot.models.crm.imports.CollectionResponsePublicImportErrorForwardPaging
import com.hubspot.models.crm.imports.CollectionResponsePublicImportResponseForwardPaging
import com.hubspot.models.crm.imports.ImportCancelParams
import com.hubspot.models.crm.imports.ImportCreateParams
import com.hubspot.models.crm.imports.ImportGetParams
import com.hubspot.models.crm.imports.ImportListErrorsPageAsync
import com.hubspot.models.crm.imports.ImportListErrorsParams
import com.hubspot.models.crm.imports.ImportListPageAsync
import com.hubspot.models.crm.imports.ImportListParams
import com.hubspot.models.crm.imports.PublicImportResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class ImportServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    ImportServiceAsync {

    private val withRawResponse: ImportServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ImportServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ImportServiceAsync =
        ImportServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: ImportCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PublicImportResponse> =
        // post /crm/imports/2026-03
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: ImportListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ImportListPageAsync> =
        // get /crm/imports/2026-03
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun cancel(
        params: ImportCancelParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ActionResponse> =
        // post /crm/imports/2026-03/{importId}/cancel
        withRawResponse().cancel(params, requestOptions).thenApply { it.parse() }

    override fun get(
        params: ImportGetParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PublicImportResponse> =
        // get /crm/imports/2026-03/{importId}
        withRawResponse().get(params, requestOptions).thenApply { it.parse() }

    override fun listErrors(
        params: ImportListErrorsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ImportListErrorsPageAsync> =
        // get /crm/imports/2026-03/{importId}/errors
        withRawResponse().listErrors(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ImportServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ImportServiceAsync.WithRawResponse =
            ImportServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<PublicImportResponse> =
            jsonHandler<PublicImportResponse>(clientOptions.jsonMapper)

        override fun create(
            params: ImportCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PublicImportResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("crm", "imports", "2026-03")
                    .body(multipartFormData(clientOptions.jsonMapper, params._body()))
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

        private val listHandler: Handler<CollectionResponsePublicImportResponseForwardPaging> =
            jsonHandler<CollectionResponsePublicImportResponseForwardPaging>(
                clientOptions.jsonMapper
            )

        override fun list(
            params: ImportListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ImportListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("crm", "imports", "2026-03")
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
                                ImportListPageAsync.builder()
                                    .service(ImportServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }

        private val cancelHandler: Handler<ActionResponse> =
            jsonHandler<ActionResponse>(clientOptions.jsonMapper)

        override fun cancel(
            params: ImportCancelParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ActionResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("importId", params.importId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("crm", "imports", "2026-03", params._pathParam(0), "cancel")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { cancelHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val getHandler: Handler<PublicImportResponse> =
            jsonHandler<PublicImportResponse>(clientOptions.jsonMapper)

        override fun get(
            params: ImportGetParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PublicImportResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("importId", params.importId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("crm", "imports", "2026-03", params._pathParam(0))
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

        private val listErrorsHandler: Handler<CollectionResponsePublicImportErrorForwardPaging> =
            jsonHandler<CollectionResponsePublicImportErrorForwardPaging>(clientOptions.jsonMapper)

        override fun listErrors(
            params: ImportListErrorsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ImportListErrorsPageAsync>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("importId", params.importId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("crm", "imports", "2026-03", params._pathParam(0), "errors")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listErrorsHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                            .let {
                                ImportListErrorsPageAsync.builder()
                                    .service(ImportServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }
    }
}
