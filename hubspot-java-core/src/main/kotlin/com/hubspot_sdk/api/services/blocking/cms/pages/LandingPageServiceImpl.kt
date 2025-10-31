// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.cms.pages

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
import com.hubspot_sdk.api.core.prepare
import com.hubspot_sdk.api.models.cms.pages.BatchResponseContentFolder
import com.hubspot_sdk.api.models.cms.pages.BatchResponsePage
import com.hubspot_sdk.api.models.cms.pages.CollectionResponseWithTotalContentFolderForwardPaging
import com.hubspot_sdk.api.models.cms.pages.CollectionResponseWithTotalPageForwardPaging
import com.hubspot_sdk.api.models.cms.pages.CollectionResponseWithTotalVersionContentFolder
import com.hubspot_sdk.api.models.cms.pages.CollectionResponseWithTotalVersionPage
import com.hubspot_sdk.api.models.cms.pages.ContentFolder
import com.hubspot_sdk.api.models.cms.pages.Page
import com.hubspot_sdk.api.models.cms.pages.VersionContentFolder
import com.hubspot_sdk.api.models.cms.pages.VersionPage
import com.hubspot_sdk.api.models.cms.pages.landingpages.LandingPageAttachToLangGroupParams
import com.hubspot_sdk.api.models.cms.pages.landingpages.LandingPageCloneParams
import com.hubspot_sdk.api.models.cms.pages.landingpages.LandingPageCreateAbTestVariationParams
import com.hubspot_sdk.api.models.cms.pages.landingpages.LandingPageCreateBatchParams
import com.hubspot_sdk.api.models.cms.pages.landingpages.LandingPageCreateFolderParams
import com.hubspot_sdk.api.models.cms.pages.landingpages.LandingPageCreateFoldersBatchParams
import com.hubspot_sdk.api.models.cms.pages.landingpages.LandingPageCreateLanguageVariationParams
import com.hubspot_sdk.api.models.cms.pages.landingpages.LandingPageCreateParams
import com.hubspot_sdk.api.models.cms.pages.landingpages.LandingPageDeleteBatchParams
import com.hubspot_sdk.api.models.cms.pages.landingpages.LandingPageDeleteFolderParams
import com.hubspot_sdk.api.models.cms.pages.landingpages.LandingPageDeleteFoldersBatchParams
import com.hubspot_sdk.api.models.cms.pages.landingpages.LandingPageDeleteParams
import com.hubspot_sdk.api.models.cms.pages.landingpages.LandingPageDetachFromLangGroupParams
import com.hubspot_sdk.api.models.cms.pages.landingpages.LandingPageEndAbTestParams
import com.hubspot_sdk.api.models.cms.pages.landingpages.LandingPageGetBatchParams
import com.hubspot_sdk.api.models.cms.pages.landingpages.LandingPageGetDraftParams
import com.hubspot_sdk.api.models.cms.pages.landingpages.LandingPageGetFolderParams
import com.hubspot_sdk.api.models.cms.pages.landingpages.LandingPageGetFolderRevisionParams
import com.hubspot_sdk.api.models.cms.pages.landingpages.LandingPageGetFoldersBatchParams
import com.hubspot_sdk.api.models.cms.pages.landingpages.LandingPageGetParams
import com.hubspot_sdk.api.models.cms.pages.landingpages.LandingPageGetRevisionParams
import com.hubspot_sdk.api.models.cms.pages.landingpages.LandingPageListFolderRevisionsParams
import com.hubspot_sdk.api.models.cms.pages.landingpages.LandingPageListFoldersParams
import com.hubspot_sdk.api.models.cms.pages.landingpages.LandingPageListPage
import com.hubspot_sdk.api.models.cms.pages.landingpages.LandingPageListParams
import com.hubspot_sdk.api.models.cms.pages.landingpages.LandingPageListRevisionsParams
import com.hubspot_sdk.api.models.cms.pages.landingpages.LandingPagePublishDraftParams
import com.hubspot_sdk.api.models.cms.pages.landingpages.LandingPageRerunAbTestParams
import com.hubspot_sdk.api.models.cms.pages.landingpages.LandingPageResetDraftParams
import com.hubspot_sdk.api.models.cms.pages.landingpages.LandingPageRestoreFolderRevisionParams
import com.hubspot_sdk.api.models.cms.pages.landingpages.LandingPageRestoreRevisionParams
import com.hubspot_sdk.api.models.cms.pages.landingpages.LandingPageRestoreRevisionToDraftParams
import com.hubspot_sdk.api.models.cms.pages.landingpages.LandingPageScheduleParams
import com.hubspot_sdk.api.models.cms.pages.landingpages.LandingPageSetNewLangPrimaryParams
import com.hubspot_sdk.api.models.cms.pages.landingpages.LandingPageUpdateBatchParams
import com.hubspot_sdk.api.models.cms.pages.landingpages.LandingPageUpdateDraftParams
import com.hubspot_sdk.api.models.cms.pages.landingpages.LandingPageUpdateFolderParams
import com.hubspot_sdk.api.models.cms.pages.landingpages.LandingPageUpdateFoldersBatchParams
import com.hubspot_sdk.api.models.cms.pages.landingpages.LandingPageUpdateLanguagesParams
import com.hubspot_sdk.api.models.cms.pages.landingpages.LandingPageUpdateParams
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class LandingPageServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    LandingPageService {

    private val withRawResponse: LandingPageService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): LandingPageService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): LandingPageService =
        LandingPageServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(params: LandingPageCreateParams, requestOptions: RequestOptions) {
        // post /cms/v3/pages/landing-pages
        withRawResponse().create(params, requestOptions)
    }

    override fun update(params: LandingPageUpdateParams, requestOptions: RequestOptions): Page =
        // patch /cms/v3/pages/landing-pages/{objectId}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(
        params: LandingPageListParams,
        requestOptions: RequestOptions,
    ): LandingPageListPage =
        // get /cms/v3/pages/landing-pages
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: LandingPageDeleteParams, requestOptions: RequestOptions) {
        // delete /cms/v3/pages/landing-pages/{objectId}
        withRawResponse().delete(params, requestOptions)
    }

    override fun attachToLangGroup(
        params: LandingPageAttachToLangGroupParams,
        requestOptions: RequestOptions,
    ) {
        // post /cms/v3/pages/landing-pages/multi-language/attach-to-lang-group
        withRawResponse().attachToLangGroup(params, requestOptions)
    }

    override fun clone(params: LandingPageCloneParams, requestOptions: RequestOptions): Page =
        // post /cms/v3/pages/landing-pages/clone
        withRawResponse().clone(params, requestOptions).parse()

    override fun createAbTestVariation(
        params: LandingPageCreateAbTestVariationParams,
        requestOptions: RequestOptions,
    ): Page =
        // post /cms/v3/pages/landing-pages/ab-test/create-variation
        withRawResponse().createAbTestVariation(params, requestOptions).parse()

    override fun createBatch(
        params: LandingPageCreateBatchParams,
        requestOptions: RequestOptions,
    ): BatchResponsePage =
        // post /cms/v3/pages/landing-pages/batch/create
        withRawResponse().createBatch(params, requestOptions).parse()

    override fun createFolder(
        params: LandingPageCreateFolderParams,
        requestOptions: RequestOptions,
    ): ContentFolder =
        // post /cms/v3/pages/landing-pages/folders
        withRawResponse().createFolder(params, requestOptions).parse()

    override fun createFoldersBatch(
        params: LandingPageCreateFoldersBatchParams,
        requestOptions: RequestOptions,
    ): BatchResponseContentFolder =
        // post /cms/v3/pages/landing-pages/folders/batch/create
        withRawResponse().createFoldersBatch(params, requestOptions).parse()

    override fun createLanguageVariation(
        params: LandingPageCreateLanguageVariationParams,
        requestOptions: RequestOptions,
    ): Page =
        // post /cms/v3/pages/landing-pages/multi-language/create-language-variation
        withRawResponse().createLanguageVariation(params, requestOptions).parse()

    override fun deleteBatch(params: LandingPageDeleteBatchParams, requestOptions: RequestOptions) {
        // post /cms/v3/pages/landing-pages/batch/archive
        withRawResponse().deleteBatch(params, requestOptions)
    }

    override fun deleteFolder(
        params: LandingPageDeleteFolderParams,
        requestOptions: RequestOptions,
    ) {
        // delete /cms/v3/pages/landing-pages/folders/{objectId}
        withRawResponse().deleteFolder(params, requestOptions)
    }

    override fun deleteFoldersBatch(
        params: LandingPageDeleteFoldersBatchParams,
        requestOptions: RequestOptions,
    ) {
        // post /cms/v3/pages/landing-pages/folders/batch/archive
        withRawResponse().deleteFoldersBatch(params, requestOptions)
    }

    override fun detachFromLangGroup(
        params: LandingPageDetachFromLangGroupParams,
        requestOptions: RequestOptions,
    ) {
        // post /cms/v3/pages/landing-pages/multi-language/detach-from-lang-group
        withRawResponse().detachFromLangGroup(params, requestOptions)
    }

    override fun endAbTest(params: LandingPageEndAbTestParams, requestOptions: RequestOptions) {
        // post /cms/v3/pages/landing-pages/ab-test/end
        withRawResponse().endAbTest(params, requestOptions)
    }

    override fun get(params: LandingPageGetParams, requestOptions: RequestOptions): Page =
        // get /cms/v3/pages/landing-pages/{objectId}
        withRawResponse().get(params, requestOptions).parse()

    override fun getBatch(
        params: LandingPageGetBatchParams,
        requestOptions: RequestOptions,
    ): BatchResponsePage =
        // post /cms/v3/pages/landing-pages/batch/read
        withRawResponse().getBatch(params, requestOptions).parse()

    override fun getDraft(params: LandingPageGetDraftParams, requestOptions: RequestOptions): Page =
        // get /cms/v3/pages/landing-pages/{objectId}/draft
        withRawResponse().getDraft(params, requestOptions).parse()

    override fun getFolder(
        params: LandingPageGetFolderParams,
        requestOptions: RequestOptions,
    ): ContentFolder =
        // get /cms/v3/pages/landing-pages/folders/{objectId}
        withRawResponse().getFolder(params, requestOptions).parse()

    override fun getFolderRevision(
        params: LandingPageGetFolderRevisionParams,
        requestOptions: RequestOptions,
    ): VersionContentFolder =
        // get /cms/v3/pages/landing-pages/folders/{objectId}/revisions/{revisionId}
        withRawResponse().getFolderRevision(params, requestOptions).parse()

    override fun getFoldersBatch(
        params: LandingPageGetFoldersBatchParams,
        requestOptions: RequestOptions,
    ): BatchResponseContentFolder =
        // post /cms/v3/pages/landing-pages/folders/batch/read
        withRawResponse().getFoldersBatch(params, requestOptions).parse()

    override fun getRevision(
        params: LandingPageGetRevisionParams,
        requestOptions: RequestOptions,
    ): VersionPage =
        // get /cms/v3/pages/landing-pages/{objectId}/revisions/{revisionId}
        withRawResponse().getRevision(params, requestOptions).parse()

    override fun listFolderRevisions(
        params: LandingPageListFolderRevisionsParams,
        requestOptions: RequestOptions,
    ): CollectionResponseWithTotalVersionContentFolder =
        // get /cms/v3/pages/landing-pages/folders/{objectId}/revisions
        withRawResponse().listFolderRevisions(params, requestOptions).parse()

    override fun listFolders(
        params: LandingPageListFoldersParams,
        requestOptions: RequestOptions,
    ): CollectionResponseWithTotalContentFolderForwardPaging =
        // get /cms/v3/pages/landing-pages/folders
        withRawResponse().listFolders(params, requestOptions).parse()

    override fun listRevisions(
        params: LandingPageListRevisionsParams,
        requestOptions: RequestOptions,
    ): CollectionResponseWithTotalVersionPage =
        // get /cms/v3/pages/landing-pages/{objectId}/revisions
        withRawResponse().listRevisions(params, requestOptions).parse()

    override fun publishDraft(
        params: LandingPagePublishDraftParams,
        requestOptions: RequestOptions,
    ) {
        // post /cms/v3/pages/landing-pages/{objectId}/draft/push-live
        withRawResponse().publishDraft(params, requestOptions)
    }

    override fun rerunAbTest(params: LandingPageRerunAbTestParams, requestOptions: RequestOptions) {
        // post /cms/v3/pages/landing-pages/ab-test/rerun
        withRawResponse().rerunAbTest(params, requestOptions)
    }

    override fun resetDraft(params: LandingPageResetDraftParams, requestOptions: RequestOptions) {
        // post /cms/v3/pages/landing-pages/{objectId}/draft/reset
        withRawResponse().resetDraft(params, requestOptions)
    }

    override fun restoreFolderRevision(
        params: LandingPageRestoreFolderRevisionParams,
        requestOptions: RequestOptions,
    ): ContentFolder =
        // post /cms/v3/pages/landing-pages/folders/{objectId}/revisions/{revisionId}/restore
        withRawResponse().restoreFolderRevision(params, requestOptions).parse()

    override fun restoreRevision(
        params: LandingPageRestoreRevisionParams,
        requestOptions: RequestOptions,
    ): Page =
        // post /cms/v3/pages/landing-pages/{objectId}/revisions/{revisionId}/restore
        withRawResponse().restoreRevision(params, requestOptions).parse()

    override fun restoreRevisionToDraft(
        params: LandingPageRestoreRevisionToDraftParams,
        requestOptions: RequestOptions,
    ): Page =
        // post /cms/v3/pages/landing-pages/{objectId}/revisions/{revisionId}/restore-to-draft
        withRawResponse().restoreRevisionToDraft(params, requestOptions).parse()

    override fun schedule(params: LandingPageScheduleParams, requestOptions: RequestOptions) {
        // post /cms/v3/pages/landing-pages/schedule
        withRawResponse().schedule(params, requestOptions)
    }

    override fun setNewLangPrimary(
        params: LandingPageSetNewLangPrimaryParams,
        requestOptions: RequestOptions,
    ) {
        // put /cms/v3/pages/landing-pages/multi-language/set-new-lang-primary
        withRawResponse().setNewLangPrimary(params, requestOptions)
    }

    override fun updateBatch(
        params: LandingPageUpdateBatchParams,
        requestOptions: RequestOptions,
    ): BatchResponsePage =
        // post /cms/v3/pages/landing-pages/batch/update
        withRawResponse().updateBatch(params, requestOptions).parse()

    override fun updateDraft(
        params: LandingPageUpdateDraftParams,
        requestOptions: RequestOptions,
    ): Page =
        // patch /cms/v3/pages/landing-pages/{objectId}/draft
        withRawResponse().updateDraft(params, requestOptions).parse()

    override fun updateFolder(
        params: LandingPageUpdateFolderParams,
        requestOptions: RequestOptions,
    ): ContentFolder =
        // patch /cms/v3/pages/landing-pages/folders/{objectId}
        withRawResponse().updateFolder(params, requestOptions).parse()

    override fun updateFoldersBatch(
        params: LandingPageUpdateFoldersBatchParams,
        requestOptions: RequestOptions,
    ): BatchResponseContentFolder =
        // post /cms/v3/pages/landing-pages/folders/batch/update
        withRawResponse().updateFoldersBatch(params, requestOptions).parse()

    override fun updateLanguages(
        params: LandingPageUpdateLanguagesParams,
        requestOptions: RequestOptions,
    ) {
        // post /cms/v3/pages/landing-pages/multi-language/update-languages
        withRawResponse().updateLanguages(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        LandingPageService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): LandingPageService.WithRawResponse =
            LandingPageServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<Void?> = emptyHandler()

        override fun create(
            params: LandingPageCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("cms", "v3", "pages", "landing-pages")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { createHandler.handle(it) }
            }
        }

        private val updateHandler: Handler<Page> = jsonHandler<Page>(clientOptions.jsonMapper)

        override fun update(
            params: LandingPageUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Page> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("objectId", params.objectId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("cms", "v3", "pages", "landing-pages", params._pathParam(0))
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

        private val listHandler: Handler<CollectionResponseWithTotalPageForwardPaging> =
            jsonHandler<CollectionResponseWithTotalPageForwardPaging>(clientOptions.jsonMapper)

        override fun list(
            params: LandingPageListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LandingPageListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("cms", "v3", "pages", "landing-pages")
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
                        LandingPageListPage.builder()
                            .service(LandingPageServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: LandingPageDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("objectId", params.objectId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("cms", "v3", "pages", "landing-pages", params._pathParam(0))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { deleteHandler.handle(it) }
            }
        }

        private val attachToLangGroupHandler: Handler<Void?> = emptyHandler()

        override fun attachToLangGroup(
            params: LandingPageAttachToLangGroupParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "cms",
                        "v3",
                        "pages",
                        "landing-pages",
                        "multi-language",
                        "attach-to-lang-group",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { attachToLangGroupHandler.handle(it) }
            }
        }

        private val cloneHandler: Handler<Page> = jsonHandler<Page>(clientOptions.jsonMapper)

        override fun clone(
            params: LandingPageCloneParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Page> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("cms", "v3", "pages", "landing-pages", "clone")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { cloneHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val createAbTestVariationHandler: Handler<Page> =
            jsonHandler<Page>(clientOptions.jsonMapper)

        override fun createAbTestVariation(
            params: LandingPageCreateAbTestVariationParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Page> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "cms",
                        "v3",
                        "pages",
                        "landing-pages",
                        "ab-test",
                        "create-variation",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createAbTestVariationHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val createBatchHandler: Handler<BatchResponsePage> =
            jsonHandler<BatchResponsePage>(clientOptions.jsonMapper)

        override fun createBatch(
            params: LandingPageCreateBatchParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BatchResponsePage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("cms", "v3", "pages", "landing-pages", "batch", "create")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createBatchHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val createFolderHandler: Handler<ContentFolder> =
            jsonHandler<ContentFolder>(clientOptions.jsonMapper)

        override fun createFolder(
            params: LandingPageCreateFolderParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ContentFolder> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("cms", "v3", "pages", "landing-pages", "folders")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createFolderHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val createFoldersBatchHandler: Handler<BatchResponseContentFolder> =
            jsonHandler<BatchResponseContentFolder>(clientOptions.jsonMapper)

        override fun createFoldersBatch(
            params: LandingPageCreateFoldersBatchParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BatchResponseContentFolder> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "cms",
                        "v3",
                        "pages",
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
                    .use { createFoldersBatchHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val createLanguageVariationHandler: Handler<Page> =
            jsonHandler<Page>(clientOptions.jsonMapper)

        override fun createLanguageVariation(
            params: LandingPageCreateLanguageVariationParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Page> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "cms",
                        "v3",
                        "pages",
                        "landing-pages",
                        "multi-language",
                        "create-language-variation",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createLanguageVariationHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val deleteBatchHandler: Handler<Void?> = emptyHandler()

        override fun deleteBatch(
            params: LandingPageDeleteBatchParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("cms", "v3", "pages", "landing-pages", "batch", "archive")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { deleteBatchHandler.handle(it) }
            }
        }

        private val deleteFolderHandler: Handler<Void?> = emptyHandler()

        override fun deleteFolder(
            params: LandingPageDeleteFolderParams,
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
                        "v3",
                        "pages",
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
                response.use { deleteFolderHandler.handle(it) }
            }
        }

        private val deleteFoldersBatchHandler: Handler<Void?> = emptyHandler()

        override fun deleteFoldersBatch(
            params: LandingPageDeleteFoldersBatchParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "cms",
                        "v3",
                        "pages",
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
                response.use { deleteFoldersBatchHandler.handle(it) }
            }
        }

        private val detachFromLangGroupHandler: Handler<Void?> = emptyHandler()

        override fun detachFromLangGroup(
            params: LandingPageDetachFromLangGroupParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "cms",
                        "v3",
                        "pages",
                        "landing-pages",
                        "multi-language",
                        "detach-from-lang-group",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { detachFromLangGroupHandler.handle(it) }
            }
        }

        private val endAbTestHandler: Handler<Void?> = emptyHandler()

        override fun endAbTest(
            params: LandingPageEndAbTestParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("cms", "v3", "pages", "landing-pages", "ab-test", "end")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { endAbTestHandler.handle(it) }
            }
        }

        private val getHandler: Handler<Page> = jsonHandler<Page>(clientOptions.jsonMapper)

        override fun get(
            params: LandingPageGetParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Page> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("objectId", params.objectId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("cms", "v3", "pages", "landing-pages", params._pathParam(0))
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

        private val getBatchHandler: Handler<BatchResponsePage> =
            jsonHandler<BatchResponsePage>(clientOptions.jsonMapper)

        override fun getBatch(
            params: LandingPageGetBatchParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BatchResponsePage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("cms", "v3", "pages", "landing-pages", "batch", "read")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getBatchHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val getDraftHandler: Handler<Page> = jsonHandler<Page>(clientOptions.jsonMapper)

        override fun getDraft(
            params: LandingPageGetDraftParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Page> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("objectId", params.objectId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "cms",
                        "v3",
                        "pages",
                        "landing-pages",
                        params._pathParam(0),
                        "draft",
                    )
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getDraftHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val getFolderHandler: Handler<ContentFolder> =
            jsonHandler<ContentFolder>(clientOptions.jsonMapper)

        override fun getFolder(
            params: LandingPageGetFolderParams,
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
                        "v3",
                        "pages",
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
                    .use { getFolderHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val getFolderRevisionHandler: Handler<VersionContentFolder> =
            jsonHandler<VersionContentFolder>(clientOptions.jsonMapper)

        override fun getFolderRevision(
            params: LandingPageGetFolderRevisionParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<VersionContentFolder> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("revisionId", params.revisionId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "cms",
                        "v3",
                        "pages",
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
                    .use { getFolderRevisionHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val getFoldersBatchHandler: Handler<BatchResponseContentFolder> =
            jsonHandler<BatchResponseContentFolder>(clientOptions.jsonMapper)

        override fun getFoldersBatch(
            params: LandingPageGetFoldersBatchParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BatchResponseContentFolder> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "cms",
                        "v3",
                        "pages",
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
                    .use { getFoldersBatchHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val getRevisionHandler: Handler<VersionPage> =
            jsonHandler<VersionPage>(clientOptions.jsonMapper)

        override fun getRevision(
            params: LandingPageGetRevisionParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<VersionPage> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("revisionId", params.revisionId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "cms",
                        "v3",
                        "pages",
                        "landing-pages",
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

        private val listFolderRevisionsHandler:
            Handler<CollectionResponseWithTotalVersionContentFolder> =
            jsonHandler<CollectionResponseWithTotalVersionContentFolder>(clientOptions.jsonMapper)

        override fun listFolderRevisions(
            params: LandingPageListFolderRevisionsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CollectionResponseWithTotalVersionContentFolder> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("objectId", params.objectId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "cms",
                        "v3",
                        "pages",
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
                    .use { listFolderRevisionsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
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
            params: LandingPageListFoldersParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CollectionResponseWithTotalContentFolderForwardPaging> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("cms", "v3", "pages", "landing-pages", "folders")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listFoldersHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listRevisionsHandler: Handler<CollectionResponseWithTotalVersionPage> =
            jsonHandler<CollectionResponseWithTotalVersionPage>(clientOptions.jsonMapper)

        override fun listRevisions(
            params: LandingPageListRevisionsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CollectionResponseWithTotalVersionPage> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("objectId", params.objectId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "cms",
                        "v3",
                        "pages",
                        "landing-pages",
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
            }
        }

        private val publishDraftHandler: Handler<Void?> = emptyHandler()

        override fun publishDraft(
            params: LandingPagePublishDraftParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("objectId", params.objectId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "cms",
                        "v3",
                        "pages",
                        "landing-pages",
                        params._pathParam(0),
                        "draft",
                        "push-live",
                    )
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { publishDraftHandler.handle(it) }
            }
        }

        private val rerunAbTestHandler: Handler<Void?> = emptyHandler()

        override fun rerunAbTest(
            params: LandingPageRerunAbTestParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("cms", "v3", "pages", "landing-pages", "ab-test", "rerun")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { rerunAbTestHandler.handle(it) }
            }
        }

        private val resetDraftHandler: Handler<Void?> = emptyHandler()

        override fun resetDraft(
            params: LandingPageResetDraftParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("objectId", params.objectId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "cms",
                        "v3",
                        "pages",
                        "landing-pages",
                        params._pathParam(0),
                        "draft",
                        "reset",
                    )
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { resetDraftHandler.handle(it) }
            }
        }

        private val restoreFolderRevisionHandler: Handler<ContentFolder> =
            jsonHandler<ContentFolder>(clientOptions.jsonMapper)

        override fun restoreFolderRevision(
            params: LandingPageRestoreFolderRevisionParams,
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
                        "v3",
                        "pages",
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
                    .use { restoreFolderRevisionHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val restoreRevisionHandler: Handler<Page> =
            jsonHandler<Page>(clientOptions.jsonMapper)

        override fun restoreRevision(
            params: LandingPageRestoreRevisionParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Page> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("revisionId", params.revisionId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "cms",
                        "v3",
                        "pages",
                        "landing-pages",
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

        private val restoreRevisionToDraftHandler: Handler<Page> =
            jsonHandler<Page>(clientOptions.jsonMapper)

        override fun restoreRevisionToDraft(
            params: LandingPageRestoreRevisionToDraftParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Page> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("revisionId", params.revisionId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "cms",
                        "v3",
                        "pages",
                        "landing-pages",
                        params._pathParam(0),
                        "revisions",
                        params._pathParam(1),
                        "restore-to-draft",
                    )
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { restoreRevisionToDraftHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val scheduleHandler: Handler<Void?> = emptyHandler()

        override fun schedule(
            params: LandingPageScheduleParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("cms", "v3", "pages", "landing-pages", "schedule")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { scheduleHandler.handle(it) }
            }
        }

        private val setNewLangPrimaryHandler: Handler<Void?> = emptyHandler()

        override fun setNewLangPrimary(
            params: LandingPageSetNewLangPrimaryParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "cms",
                        "v3",
                        "pages",
                        "landing-pages",
                        "multi-language",
                        "set-new-lang-primary",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { setNewLangPrimaryHandler.handle(it) }
            }
        }

        private val updateBatchHandler: Handler<BatchResponsePage> =
            jsonHandler<BatchResponsePage>(clientOptions.jsonMapper)

        override fun updateBatch(
            params: LandingPageUpdateBatchParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BatchResponsePage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("cms", "v3", "pages", "landing-pages", "batch", "update")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { updateBatchHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val updateDraftHandler: Handler<Page> = jsonHandler<Page>(clientOptions.jsonMapper)

        override fun updateDraft(
            params: LandingPageUpdateDraftParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Page> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("objectId", params.objectId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "cms",
                        "v3",
                        "pages",
                        "landing-pages",
                        params._pathParam(0),
                        "draft",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { updateDraftHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val updateFolderHandler: Handler<ContentFolder> =
            jsonHandler<ContentFolder>(clientOptions.jsonMapper)

        override fun updateFolder(
            params: LandingPageUpdateFolderParams,
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
                        "v3",
                        "pages",
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
                    .use { updateFolderHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val updateFoldersBatchHandler: Handler<BatchResponseContentFolder> =
            jsonHandler<BatchResponseContentFolder>(clientOptions.jsonMapper)

        override fun updateFoldersBatch(
            params: LandingPageUpdateFoldersBatchParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BatchResponseContentFolder> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "cms",
                        "v3",
                        "pages",
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
                    .use { updateFoldersBatchHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val updateLanguagesHandler: Handler<Void?> = emptyHandler()

        override fun updateLanguages(
            params: LandingPageUpdateLanguagesParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "cms",
                        "v3",
                        "pages",
                        "landing-pages",
                        "multi-language",
                        "update-languages",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { updateLanguagesHandler.handle(it) }
            }
        }
    }
}
