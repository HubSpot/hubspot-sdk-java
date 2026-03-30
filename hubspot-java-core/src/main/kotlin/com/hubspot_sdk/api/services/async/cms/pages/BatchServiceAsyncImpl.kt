// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.cms.pages

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
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
import com.hubspot_sdk.api.models.cms.pages.BatchResponseContentFolder
import com.hubspot_sdk.api.models.cms.pages.BatchResponsePage
import com.hubspot_sdk.api.models.cms.pages.batch.BatchCreateFoldersParams
import com.hubspot_sdk.api.models.cms.pages.batch.BatchCreateLandingPagesParams
import com.hubspot_sdk.api.models.cms.pages.batch.BatchCreateSitePagesParams
import com.hubspot_sdk.api.models.cms.pages.batch.BatchDeleteFoldersParams
import com.hubspot_sdk.api.models.cms.pages.batch.BatchDeleteLandingPagesParams
import com.hubspot_sdk.api.models.cms.pages.batch.BatchDeleteSitePagesParams
import com.hubspot_sdk.api.models.cms.pages.batch.BatchGetLandingPagesParams
import com.hubspot_sdk.api.models.cms.pages.batch.BatchGetSitePagesParams
import com.hubspot_sdk.api.models.cms.pages.batch.BatchUpdateFoldersParams
import com.hubspot_sdk.api.models.cms.pages.batch.BatchUpdateLandingPagesParams
import com.hubspot_sdk.api.models.cms.pages.batch.BatchUpdateSitePagesParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class BatchServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    BatchServiceAsync {

    private val withRawResponse: BatchServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): BatchServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): BatchServiceAsync =
        BatchServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun createFolders(
        params: BatchCreateFoldersParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BatchResponseContentFolder> =
        // post /cms/pages/2026-03/landing-pages/folders/batch/create
        withRawResponse().createFolders(params, requestOptions).thenApply { it.parse() }

    override fun createLandingPages(
        params: BatchCreateLandingPagesParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BatchResponsePage> =
        // post /cms/pages/2026-03/landing-pages/batch/create
        withRawResponse().createLandingPages(params, requestOptions).thenApply { it.parse() }

    override fun createSitePages(
        params: BatchCreateSitePagesParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BatchResponsePage> =
        // post /cms/pages/2026-03/site-pages/batch/create
        withRawResponse().createSitePages(params, requestOptions).thenApply { it.parse() }

    override fun deleteFolders(
        params: BatchDeleteFoldersParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // post /cms/pages/2026-03/landing-pages/folders/batch/archive
        withRawResponse().deleteFolders(params, requestOptions).thenAccept {}

    override fun deleteLandingPages(
        params: BatchDeleteLandingPagesParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // post /cms/pages/2026-03/landing-pages/batch/archive
        withRawResponse().deleteLandingPages(params, requestOptions).thenAccept {}

    override fun deleteSitePages(
        params: BatchDeleteSitePagesParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // post /cms/pages/2026-03/site-pages/batch/archive
        withRawResponse().deleteSitePages(params, requestOptions).thenAccept {}

    override fun getLandingPages(
        params: BatchGetLandingPagesParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BatchResponsePage> =
        // post /cms/pages/2026-03/landing-pages/batch/read
        withRawResponse().getLandingPages(params, requestOptions).thenApply { it.parse() }

    override fun getSitePages(
        params: BatchGetSitePagesParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BatchResponsePage> =
        // post /cms/pages/2026-03/site-pages/batch/read
        withRawResponse().getSitePages(params, requestOptions).thenApply { it.parse() }

    override fun updateFolders(
        params: BatchUpdateFoldersParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BatchResponseContentFolder> =
        // post /cms/pages/2026-03/landing-pages/folders/batch/update
        withRawResponse().updateFolders(params, requestOptions).thenApply { it.parse() }

    override fun updateLandingPages(
        params: BatchUpdateLandingPagesParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BatchResponsePage> =
        // post /cms/pages/2026-03/landing-pages/batch/update
        withRawResponse().updateLandingPages(params, requestOptions).thenApply { it.parse() }

    override fun updateSitePages(
        params: BatchUpdateSitePagesParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BatchResponsePage> =
        // post /cms/pages/2026-03/site-pages/batch/update
        withRawResponse().updateSitePages(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        BatchServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): BatchServiceAsync.WithRawResponse =
            BatchServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createFoldersHandler: Handler<BatchResponseContentFolder> =
            jsonHandler<BatchResponseContentFolder>(clientOptions.jsonMapper)

        override fun createFolders(
            params: BatchCreateFoldersParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BatchResponseContentFolder>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "cms",
                        "pages",
                        "2026-03",
                        "landing-pages",
                        "folders",
                        "batch",
                        "create",
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
                            .use { createFoldersHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val createLandingPagesHandler: Handler<BatchResponsePage> =
            jsonHandler<BatchResponsePage>(clientOptions.jsonMapper)

        override fun createLandingPages(
            params: BatchCreateLandingPagesParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BatchResponsePage>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("cms", "pages", "2026-03", "landing-pages", "batch", "create")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { createLandingPagesHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val createSitePagesHandler: Handler<BatchResponsePage> =
            jsonHandler<BatchResponsePage>(clientOptions.jsonMapper)

        override fun createSitePages(
            params: BatchCreateSitePagesParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BatchResponsePage>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("cms", "pages", "2026-03", "site-pages", "batch", "create")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { createSitePagesHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val deleteFoldersHandler: Handler<Void?> = emptyHandler()

        override fun deleteFolders(
            params: BatchDeleteFoldersParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "cms",
                        "pages",
                        "2026-03",
                        "landing-pages",
                        "folders",
                        "batch",
                        "archive",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { deleteFoldersHandler.handle(it) }
                    }
                }
        }

        private val deleteLandingPagesHandler: Handler<Void?> = emptyHandler()

        override fun deleteLandingPages(
            params: BatchDeleteLandingPagesParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("cms", "pages", "2026-03", "landing-pages", "batch", "archive")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { deleteLandingPagesHandler.handle(it) }
                    }
                }
        }

        private val deleteSitePagesHandler: Handler<Void?> = emptyHandler()

        override fun deleteSitePages(
            params: BatchDeleteSitePagesParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("cms", "pages", "2026-03", "site-pages", "batch", "archive")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { deleteSitePagesHandler.handle(it) }
                    }
                }
        }

        private val getLandingPagesHandler: Handler<BatchResponsePage> =
            jsonHandler<BatchResponsePage>(clientOptions.jsonMapper)

        override fun getLandingPages(
            params: BatchGetLandingPagesParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BatchResponsePage>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("cms", "pages", "2026-03", "landing-pages", "batch", "read")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { getLandingPagesHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val getSitePagesHandler: Handler<BatchResponsePage> =
            jsonHandler<BatchResponsePage>(clientOptions.jsonMapper)

        override fun getSitePages(
            params: BatchGetSitePagesParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BatchResponsePage>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("cms", "pages", "2026-03", "site-pages", "batch", "read")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { getSitePagesHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val updateFoldersHandler: Handler<BatchResponseContentFolder> =
            jsonHandler<BatchResponseContentFolder>(clientOptions.jsonMapper)

        override fun updateFolders(
            params: BatchUpdateFoldersParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BatchResponseContentFolder>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "cms",
                        "pages",
                        "2026-03",
                        "landing-pages",
                        "folders",
                        "batch",
                        "update",
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
                            .use { updateFoldersHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val updateLandingPagesHandler: Handler<BatchResponsePage> =
            jsonHandler<BatchResponsePage>(clientOptions.jsonMapper)

        override fun updateLandingPages(
            params: BatchUpdateLandingPagesParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BatchResponsePage>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("cms", "pages", "2026-03", "landing-pages", "batch", "update")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { updateLandingPagesHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val updateSitePagesHandler: Handler<BatchResponsePage> =
            jsonHandler<BatchResponsePage>(clientOptions.jsonMapper)

        override fun updateSitePages(
            params: BatchUpdateSitePagesParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BatchResponsePage>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("cms", "pages", "2026-03", "site-pages", "batch", "update")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { updateSitePagesHandler.handle(it) }
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
