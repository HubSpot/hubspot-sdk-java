// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.cms.pages

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
import com.hubspot_sdk.api.models.cms.pages.BatchResponseContentFolder
import com.hubspot_sdk.api.models.cms.pages.CollectionResponseWithTotalContentFolderForwardPaging
import com.hubspot_sdk.api.models.cms.pages.CollectionResponseWithTotalContentFolderVersion
import com.hubspot_sdk.api.models.cms.pages.ContentFolder
import com.hubspot_sdk.api.models.cms.pages.ContentFolderVersion
import com.hubspot_sdk.api.models.cms.pages.folders.FolderCreateFolderParams
import com.hubspot_sdk.api.models.cms.pages.folders.FolderDeleteFolderParams
import com.hubspot_sdk.api.models.cms.pages.folders.FolderGetFolderParams
import com.hubspot_sdk.api.models.cms.pages.folders.FolderGetFolderRevisionParams
import com.hubspot_sdk.api.models.cms.pages.folders.FolderGetFoldersBatchParams
import com.hubspot_sdk.api.models.cms.pages.folders.FolderListFolderRevisionsPageAsync
import com.hubspot_sdk.api.models.cms.pages.folders.FolderListFolderRevisionsParams
import com.hubspot_sdk.api.models.cms.pages.folders.FolderListFoldersPageAsync
import com.hubspot_sdk.api.models.cms.pages.folders.FolderListFoldersParams
import com.hubspot_sdk.api.models.cms.pages.folders.FolderRestoreFolderRevisionParams
import com.hubspot_sdk.api.models.cms.pages.folders.FolderUpdateFolderParams
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

    override fun createFolder(
        params: FolderCreateFolderParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ContentFolder> =
        // post /cms/pages/2026-03/landing-pages/folders
        withRawResponse().createFolder(params, requestOptions).thenApply { it.parse() }

    override fun deleteFolder(
        params: FolderDeleteFolderParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // delete /cms/pages/2026-03/landing-pages/folders/{objectId}
        withRawResponse().deleteFolder(params, requestOptions).thenAccept {}

    override fun getFolder(
        params: FolderGetFolderParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ContentFolder> =
        // get /cms/pages/2026-03/landing-pages/folders/{objectId}
        withRawResponse().getFolder(params, requestOptions).thenApply { it.parse() }

    override fun getFolderRevision(
        params: FolderGetFolderRevisionParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ContentFolderVersion> =
        // get /cms/pages/2026-03/landing-pages/folders/{objectId}/revisions/{revisionId}
        withRawResponse().getFolderRevision(params, requestOptions).thenApply { it.parse() }

    override fun getFoldersBatch(
        params: FolderGetFoldersBatchParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BatchResponseContentFolder> =
        // post /cms/pages/2026-03/landing-pages/folders/batch/read
        withRawResponse().getFoldersBatch(params, requestOptions).thenApply { it.parse() }

    override fun listFolderRevisions(
        params: FolderListFolderRevisionsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<FolderListFolderRevisionsPageAsync> =
        // get /cms/pages/2026-03/landing-pages/folders/{objectId}/revisions
        withRawResponse().listFolderRevisions(params, requestOptions).thenApply { it.parse() }

    override fun listFolders(
        params: FolderListFoldersParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<FolderListFoldersPageAsync> =
        // get /cms/pages/2026-03/landing-pages/folders
        withRawResponse().listFolders(params, requestOptions).thenApply { it.parse() }

    override fun restoreFolderRevision(
        params: FolderRestoreFolderRevisionParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ContentFolder> =
        // post /cms/pages/2026-03/landing-pages/folders/{objectId}/revisions/{revisionId}/restore
        withRawResponse().restoreFolderRevision(params, requestOptions).thenApply { it.parse() }

    override fun updateFolder(
        params: FolderUpdateFolderParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ContentFolder> =
        // patch /cms/pages/2026-03/landing-pages/folders/{objectId}
        withRawResponse().updateFolder(params, requestOptions).thenApply { it.parse() }

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

        private val createFolderHandler: Handler<ContentFolder> =
            jsonHandler<ContentFolder>(clientOptions.jsonMapper)

        override fun createFolder(
            params: FolderCreateFolderParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ContentFolder>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("cms", "pages", "2026-03", "landing-pages", "folders")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { createFolderHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val deleteFolderHandler: Handler<Void?> = emptyHandler()

        override fun deleteFolder(
            params: FolderDeleteFolderParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("objectId", params.objectId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "cms",
                        "pages",
                        "2026-03",
                        "landing-pages",
                        "folders",
                        params._pathParam(0),
                    )
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { deleteFolderHandler.handle(it) }
                    }
                }
        }

        private val getFolderHandler: Handler<ContentFolder> =
            jsonHandler<ContentFolder>(clientOptions.jsonMapper)

        override fun getFolder(
            params: FolderGetFolderParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ContentFolder>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("objectId", params.objectId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "cms",
                        "pages",
                        "2026-03",
                        "landing-pages",
                        "folders",
                        params._pathParam(0),
                    )
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { getFolderHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val getFolderRevisionHandler: Handler<ContentFolderVersion> =
            jsonHandler<ContentFolderVersion>(clientOptions.jsonMapper)

        override fun getFolderRevision(
            params: FolderGetFolderRevisionParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ContentFolderVersion>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("revisionId", params.revisionId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "cms",
                        "pages",
                        "2026-03",
                        "landing-pages",
                        "folders",
                        params._pathParam(0),
                        "revisions",
                        params._pathParam(1),
                    )
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { getFolderRevisionHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val getFoldersBatchHandler: Handler<BatchResponseContentFolder> =
            jsonHandler<BatchResponseContentFolder>(clientOptions.jsonMapper)

        override fun getFoldersBatch(
            params: FolderGetFoldersBatchParams,
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
                        "read",
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
                            .use { getFoldersBatchHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val listFolderRevisionsHandler:
            Handler<CollectionResponseWithTotalContentFolderVersion> =
            jsonHandler<CollectionResponseWithTotalContentFolderVersion>(clientOptions.jsonMapper)

        override fun listFolderRevisions(
            params: FolderListFolderRevisionsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<FolderListFolderRevisionsPageAsync>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("objectId", params.objectId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "cms",
                        "pages",
                        "2026-03",
                        "landing-pages",
                        "folders",
                        params._pathParam(0),
                        "revisions",
                    )
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listFolderRevisionsHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                            .let {
                                FolderListFolderRevisionsPageAsync.builder()
                                    .service(FolderServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }

        private val listFoldersHandler:
            Handler<CollectionResponseWithTotalContentFolderForwardPaging> =
            jsonHandler<CollectionResponseWithTotalContentFolderForwardPaging>(
                clientOptions.jsonMapper
            )

        override fun listFolders(
            params: FolderListFoldersParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<FolderListFoldersPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("cms", "pages", "2026-03", "landing-pages", "folders")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listFoldersHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                            .let {
                                FolderListFoldersPageAsync.builder()
                                    .service(FolderServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }

        private val restoreFolderRevisionHandler: Handler<ContentFolder> =
            jsonHandler<ContentFolder>(clientOptions.jsonMapper)

        override fun restoreFolderRevision(
            params: FolderRestoreFolderRevisionParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ContentFolder>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("revisionId", params.revisionId().getOrNull())
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
                        params._pathParam(0),
                        "revisions",
                        params._pathParam(1),
                        "restore",
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
                            .use { restoreFolderRevisionHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val updateFolderHandler: Handler<ContentFolder> =
            jsonHandler<ContentFolder>(clientOptions.jsonMapper)

        override fun updateFolder(
            params: FolderUpdateFolderParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ContentFolder>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("objectId", params.objectId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "cms",
                        "pages",
                        "2026-03",
                        "landing-pages",
                        "folders",
                        params._pathParam(0),
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
                            .use { updateFolderHandler.handle(it) }
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
