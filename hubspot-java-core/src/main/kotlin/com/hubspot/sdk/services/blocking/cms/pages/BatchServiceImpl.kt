// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.blocking.cms.pages

import com.hubspot.sdk.core.ClientOptions
import com.hubspot.sdk.core.RequestOptions
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
import com.hubspot.sdk.models.cms.pages.BatchResponseContentFolder
import com.hubspot.sdk.models.cms.pages.BatchResponsePage
import com.hubspot.sdk.models.cms.pages.batch.BatchCreateFoldersParams
import com.hubspot.sdk.models.cms.pages.batch.BatchCreateLandingPagesParams
import com.hubspot.sdk.models.cms.pages.batch.BatchCreateSitePagesParams
import com.hubspot.sdk.models.cms.pages.batch.BatchDeleteFoldersParams
import com.hubspot.sdk.models.cms.pages.batch.BatchDeleteLandingPagesParams
import com.hubspot.sdk.models.cms.pages.batch.BatchDeleteSitePagesParams
import com.hubspot.sdk.models.cms.pages.batch.BatchGetLandingPagesParams
import com.hubspot.sdk.models.cms.pages.batch.BatchGetSitePagesParams
import com.hubspot.sdk.models.cms.pages.batch.BatchUpdateFoldersParams
import com.hubspot.sdk.models.cms.pages.batch.BatchUpdateLandingPagesParams
import com.hubspot.sdk.models.cms.pages.batch.BatchUpdateSitePagesParams
import java.util.function.Consumer

class BatchServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    BatchService {

    private val withRawResponse: BatchService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): BatchService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): BatchService =
        BatchServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun createFolders(
        params: BatchCreateFoldersParams,
        requestOptions: RequestOptions,
    ): BatchResponseContentFolder =
        // post /cms/pages/2026-03/landing-pages/folders/batch/create
        withRawResponse().createFolders(params, requestOptions).parse()

    override fun createLandingPages(
        params: BatchCreateLandingPagesParams,
        requestOptions: RequestOptions,
    ): BatchResponsePage =
        // post /cms/pages/2026-03/landing-pages/batch/create
        withRawResponse().createLandingPages(params, requestOptions).parse()

    override fun createSitePages(
        params: BatchCreateSitePagesParams,
        requestOptions: RequestOptions,
    ): BatchResponsePage =
        // post /cms/pages/2026-03/site-pages/batch/create
        withRawResponse().createSitePages(params, requestOptions).parse()

    override fun deleteFolders(params: BatchDeleteFoldersParams, requestOptions: RequestOptions) {
        // post /cms/pages/2026-03/landing-pages/folders/batch/archive
        withRawResponse().deleteFolders(params, requestOptions)
    }

    override fun deleteLandingPages(
        params: BatchDeleteLandingPagesParams,
        requestOptions: RequestOptions,
    ) {
        // post /cms/pages/2026-03/landing-pages/batch/archive
        withRawResponse().deleteLandingPages(params, requestOptions)
    }

    override fun deleteSitePages(
        params: BatchDeleteSitePagesParams,
        requestOptions: RequestOptions,
    ) {
        // post /cms/pages/2026-03/site-pages/batch/archive
        withRawResponse().deleteSitePages(params, requestOptions)
    }

    override fun getLandingPages(
        params: BatchGetLandingPagesParams,
        requestOptions: RequestOptions,
    ): BatchResponsePage =
        // post /cms/pages/2026-03/landing-pages/batch/read
        withRawResponse().getLandingPages(params, requestOptions).parse()

    override fun getSitePages(
        params: BatchGetSitePagesParams,
        requestOptions: RequestOptions,
    ): BatchResponsePage =
        // post /cms/pages/2026-03/site-pages/batch/read
        withRawResponse().getSitePages(params, requestOptions).parse()

    override fun updateFolders(
        params: BatchUpdateFoldersParams,
        requestOptions: RequestOptions,
    ): BatchResponseContentFolder =
        // post /cms/pages/2026-03/landing-pages/folders/batch/update
        withRawResponse().updateFolders(params, requestOptions).parse()

    override fun updateLandingPages(
        params: BatchUpdateLandingPagesParams,
        requestOptions: RequestOptions,
    ): BatchResponsePage =
        // post /cms/pages/2026-03/landing-pages/batch/update
        withRawResponse().updateLandingPages(params, requestOptions).parse()

    override fun updateSitePages(
        params: BatchUpdateSitePagesParams,
        requestOptions: RequestOptions,
    ): BatchResponsePage =
        // post /cms/pages/2026-03/site-pages/batch/update
        withRawResponse().updateSitePages(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        BatchService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): BatchService.WithRawResponse =
            BatchServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createFoldersHandler: Handler<BatchResponseContentFolder> =
            jsonHandler<BatchResponseContentFolder>(clientOptions.jsonMapper)

        override fun createFolders(
            params: BatchCreateFoldersParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BatchResponseContentFolder> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createFoldersHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val createLandingPagesHandler: Handler<BatchResponsePage> =
            jsonHandler<BatchResponsePage>(clientOptions.jsonMapper)

        override fun createLandingPages(
            params: BatchCreateLandingPagesParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BatchResponsePage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("cms", "pages", "2026-03", "landing-pages", "batch", "create")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createLandingPagesHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val createSitePagesHandler: Handler<BatchResponsePage> =
            jsonHandler<BatchResponsePage>(clientOptions.jsonMapper)

        override fun createSitePages(
            params: BatchCreateSitePagesParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BatchResponsePage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("cms", "pages", "2026-03", "site-pages", "batch", "create")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createSitePagesHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val deleteFoldersHandler: Handler<Void?> = emptyHandler()

        override fun deleteFolders(
            params: BatchDeleteFoldersParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { deleteFoldersHandler.handle(it) }
            }
        }

        private val deleteLandingPagesHandler: Handler<Void?> = emptyHandler()

        override fun deleteLandingPages(
            params: BatchDeleteLandingPagesParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("cms", "pages", "2026-03", "landing-pages", "batch", "archive")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { deleteLandingPagesHandler.handle(it) }
            }
        }

        private val deleteSitePagesHandler: Handler<Void?> = emptyHandler()

        override fun deleteSitePages(
            params: BatchDeleteSitePagesParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("cms", "pages", "2026-03", "site-pages", "batch", "archive")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { deleteSitePagesHandler.handle(it) }
            }
        }

        private val getLandingPagesHandler: Handler<BatchResponsePage> =
            jsonHandler<BatchResponsePage>(clientOptions.jsonMapper)

        override fun getLandingPages(
            params: BatchGetLandingPagesParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BatchResponsePage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("cms", "pages", "2026-03", "landing-pages", "batch", "read")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getLandingPagesHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val getSitePagesHandler: Handler<BatchResponsePage> =
            jsonHandler<BatchResponsePage>(clientOptions.jsonMapper)

        override fun getSitePages(
            params: BatchGetSitePagesParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BatchResponsePage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("cms", "pages", "2026-03", "site-pages", "batch", "read")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getSitePagesHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val updateFoldersHandler: Handler<BatchResponseContentFolder> =
            jsonHandler<BatchResponseContentFolder>(clientOptions.jsonMapper)

        override fun updateFolders(
            params: BatchUpdateFoldersParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BatchResponseContentFolder> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { updateFoldersHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val updateLandingPagesHandler: Handler<BatchResponsePage> =
            jsonHandler<BatchResponsePage>(clientOptions.jsonMapper)

        override fun updateLandingPages(
            params: BatchUpdateLandingPagesParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BatchResponsePage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("cms", "pages", "2026-03", "landing-pages", "batch", "update")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { updateLandingPagesHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val updateSitePagesHandler: Handler<BatchResponsePage> =
            jsonHandler<BatchResponsePage>(clientOptions.jsonMapper)

        override fun updateSitePages(
            params: BatchUpdateSitePagesParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BatchResponsePage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("cms", "pages", "2026-03", "site-pages", "batch", "update")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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
