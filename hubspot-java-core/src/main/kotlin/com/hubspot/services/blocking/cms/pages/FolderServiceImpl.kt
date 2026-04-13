// File generated from our OpenAPI spec by Stainless.

package com.hubspot.services.blocking.cms.pages

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
import com.hubspot.core.http.parseable
import com.hubspot.core.prepare
import com.hubspot.models.cms.pages.BatchResponseContentFolder
import com.hubspot.models.cms.pages.CollectionResponseWithTotalContentFolderForwardPaging
import com.hubspot.models.cms.pages.CollectionResponseWithTotalContentFolderVersion
import com.hubspot.models.cms.pages.ContentFolder
import com.hubspot.models.cms.pages.ContentFolderVersion
import com.hubspot.models.cms.pages.folders.FolderBatchGetParams
import com.hubspot.models.cms.pages.folders.FolderCreateParams
import com.hubspot.models.cms.pages.folders.FolderDeleteParams
import com.hubspot.models.cms.pages.folders.FolderGetParams
import com.hubspot.models.cms.pages.folders.FolderGetRevisionParams
import com.hubspot.models.cms.pages.folders.FolderListPage
import com.hubspot.models.cms.pages.folders.FolderListParams
import com.hubspot.models.cms.pages.folders.FolderListRevisionsPage
import com.hubspot.models.cms.pages.folders.FolderListRevisionsParams
import com.hubspot.models.cms.pages.folders.FolderRestoreRevisionParams
import com.hubspot.models.cms.pages.folders.FolderUpdateParams
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

    override fun create(params: FolderCreateParams, requestOptions: RequestOptions): ContentFolder =
        // post /cms/pages/2026-03/landing-pages/folders
        withRawResponse().create(params, requestOptions).parse()

    override fun update(params: FolderUpdateParams, requestOptions: RequestOptions): ContentFolder =
        // patch /cms/pages/2026-03/landing-pages/folders/{objectId}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(params: FolderListParams, requestOptions: RequestOptions): FolderListPage =
        // get /cms/pages/2026-03/landing-pages/folders
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: FolderDeleteParams, requestOptions: RequestOptions) {
        // delete /cms/pages/2026-03/landing-pages/folders/{objectId}
        withRawResponse().delete(params, requestOptions)
    }

    override fun batchGet(
        params: FolderBatchGetParams,
        requestOptions: RequestOptions,
    ): BatchResponseContentFolder =
        // post /cms/pages/2026-03/landing-pages/folders/batch/read
        withRawResponse().batchGet(params, requestOptions).parse()

    override fun get(params: FolderGetParams, requestOptions: RequestOptions): ContentFolder =
        // get /cms/pages/2026-03/landing-pages/folders/{objectId}
        withRawResponse().get(params, requestOptions).parse()

    override fun getRevision(
        params: FolderGetRevisionParams,
        requestOptions: RequestOptions,
    ): ContentFolderVersion =
        // get /cms/pages/2026-03/landing-pages/folders/{objectId}/revisions/{revisionId}
        withRawResponse().getRevision(params, requestOptions).parse()

    override fun listRevisions(
        params: FolderListRevisionsParams,
        requestOptions: RequestOptions,
    ): FolderListRevisionsPage =
        // get /cms/pages/2026-03/landing-pages/folders/{objectId}/revisions
        withRawResponse().listRevisions(params, requestOptions).parse()

    override fun restoreRevision(
        params: FolderRestoreRevisionParams,
        requestOptions: RequestOptions,
    ): ContentFolder =
        // post /cms/pages/2026-03/landing-pages/folders/{objectId}/revisions/{revisionId}/restore
        withRawResponse().restoreRevision(params, requestOptions).parse()

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

        private val createHandler: Handler<ContentFolder> =
            jsonHandler<ContentFolder>(clientOptions.jsonMapper)

        override fun create(
            params: FolderCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ContentFolder> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("cms", "pages", "2026-03", "landing-pages", "folders")
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

        private val updateHandler: Handler<ContentFolder> =
            jsonHandler<ContentFolder>(clientOptions.jsonMapper)

        override fun update(
            params: FolderUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ContentFolder> {
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

        private val listHandler: Handler<CollectionResponseWithTotalContentFolderForwardPaging> =
            jsonHandler<CollectionResponseWithTotalContentFolderForwardPaging>(
                clientOptions.jsonMapper
            )

        override fun list(
            params: FolderListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FolderListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("cms", "pages", "2026-03", "landing-pages", "folders")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let {
                        FolderListPage.builder()
                            .service(FolderServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: FolderDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { deleteHandler.handle(it) }
            }
        }

        private val batchGetHandler: Handler<BatchResponseContentFolder> =
            jsonHandler<BatchResponseContentFolder>(clientOptions.jsonMapper)

        override fun batchGet(
            params: FolderBatchGetParams,
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
                        "read",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { batchGetHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val getHandler: Handler<ContentFolder> =
            jsonHandler<ContentFolder>(clientOptions.jsonMapper)

        override fun get(
            params: FolderGetParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ContentFolder> {
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

        private val getRevisionHandler: Handler<ContentFolderVersion> =
            jsonHandler<ContentFolderVersion>(clientOptions.jsonMapper)

        override fun getRevision(
            params: FolderGetRevisionParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ContentFolderVersion> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getRevisionHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listRevisionsHandler: Handler<CollectionResponseWithTotalContentFolderVersion> =
            jsonHandler<CollectionResponseWithTotalContentFolderVersion>(clientOptions.jsonMapper)

        override fun listRevisions(
            params: FolderListRevisionsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FolderListRevisionsPage> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listRevisionsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let {
                        FolderListRevisionsPage.builder()
                            .service(FolderServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val restoreRevisionHandler: Handler<ContentFolder> =
            jsonHandler<ContentFolder>(clientOptions.jsonMapper)

        override fun restoreRevision(
            params: FolderRestoreRevisionParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ContentFolder> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { restoreRevisionHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
