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
import com.hubspot_sdk.api.models.cms.pages.BatchResponsePage
import com.hubspot_sdk.api.models.cms.pages.CollectionResponseWithTotalPageForwardPaging
import com.hubspot_sdk.api.models.cms.pages.CollectionResponseWithTotalVersionPage
import com.hubspot_sdk.api.models.cms.pages.Page
import com.hubspot_sdk.api.models.cms.pages.VersionPage
import com.hubspot_sdk.api.models.cms.pages.sitepages.SitePageAttachToLangGroupParams
import com.hubspot_sdk.api.models.cms.pages.sitepages.SitePageCloneParams
import com.hubspot_sdk.api.models.cms.pages.sitepages.SitePageCreateAbTestVariationParams
import com.hubspot_sdk.api.models.cms.pages.sitepages.SitePageCreateBatchParams
import com.hubspot_sdk.api.models.cms.pages.sitepages.SitePageCreateLanguageVariationParams
import com.hubspot_sdk.api.models.cms.pages.sitepages.SitePageCreateParams
import com.hubspot_sdk.api.models.cms.pages.sitepages.SitePageDeleteBatchParams
import com.hubspot_sdk.api.models.cms.pages.sitepages.SitePageDeleteParams
import com.hubspot_sdk.api.models.cms.pages.sitepages.SitePageDetachFromLangGroupParams
import com.hubspot_sdk.api.models.cms.pages.sitepages.SitePageEndAbTestParams
import com.hubspot_sdk.api.models.cms.pages.sitepages.SitePageGetBatchParams
import com.hubspot_sdk.api.models.cms.pages.sitepages.SitePageGetDraftParams
import com.hubspot_sdk.api.models.cms.pages.sitepages.SitePageGetParams
import com.hubspot_sdk.api.models.cms.pages.sitepages.SitePageGetRevisionParams
import com.hubspot_sdk.api.models.cms.pages.sitepages.SitePageListPage
import com.hubspot_sdk.api.models.cms.pages.sitepages.SitePageListParams
import com.hubspot_sdk.api.models.cms.pages.sitepages.SitePageListRevisionsParams
import com.hubspot_sdk.api.models.cms.pages.sitepages.SitePagePublishDraftParams
import com.hubspot_sdk.api.models.cms.pages.sitepages.SitePageRerunAbTestParams
import com.hubspot_sdk.api.models.cms.pages.sitepages.SitePageResetDraftParams
import com.hubspot_sdk.api.models.cms.pages.sitepages.SitePageRestoreRevisionParams
import com.hubspot_sdk.api.models.cms.pages.sitepages.SitePageRestoreRevisionToDraftParams
import com.hubspot_sdk.api.models.cms.pages.sitepages.SitePageScheduleParams
import com.hubspot_sdk.api.models.cms.pages.sitepages.SitePageSetNewLangPrimaryParams
import com.hubspot_sdk.api.models.cms.pages.sitepages.SitePageUpdateBatchParams
import com.hubspot_sdk.api.models.cms.pages.sitepages.SitePageUpdateDraftParams
import com.hubspot_sdk.api.models.cms.pages.sitepages.SitePageUpdateLanguagesParams
import com.hubspot_sdk.api.models.cms.pages.sitepages.SitePageUpdateParams
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class SitePageServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    SitePageService {

    private val withRawResponse: SitePageService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): SitePageService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): SitePageService =
        SitePageServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(params: SitePageCreateParams, requestOptions: RequestOptions) {
        // post /cms/v3/pages/site-pages
        withRawResponse().create(params, requestOptions)
    }

    override fun update(params: SitePageUpdateParams, requestOptions: RequestOptions): Page =
        // patch /cms/v3/pages/site-pages/{objectId}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(
        params: SitePageListParams,
        requestOptions: RequestOptions,
    ): SitePageListPage =
        // get /cms/v3/pages/site-pages
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: SitePageDeleteParams, requestOptions: RequestOptions) {
        // delete /cms/v3/pages/site-pages/{objectId}
        withRawResponse().delete(params, requestOptions)
    }

    override fun attachToLangGroup(
        params: SitePageAttachToLangGroupParams,
        requestOptions: RequestOptions,
    ) {
        // post /cms/v3/pages/site-pages/multi-language/attach-to-lang-group
        withRawResponse().attachToLangGroup(params, requestOptions)
    }

    override fun clone(params: SitePageCloneParams, requestOptions: RequestOptions): Page =
        // post /cms/v3/pages/site-pages/clone
        withRawResponse().clone(params, requestOptions).parse()

    override fun createAbTestVariation(
        params: SitePageCreateAbTestVariationParams,
        requestOptions: RequestOptions,
    ): Page =
        // post /cms/v3/pages/site-pages/ab-test/create-variation
        withRawResponse().createAbTestVariation(params, requestOptions).parse()

    override fun createBatch(
        params: SitePageCreateBatchParams,
        requestOptions: RequestOptions,
    ): BatchResponsePage =
        // post /cms/v3/pages/site-pages/batch/create
        withRawResponse().createBatch(params, requestOptions).parse()

    override fun createLanguageVariation(
        params: SitePageCreateLanguageVariationParams,
        requestOptions: RequestOptions,
    ): Page =
        // post /cms/v3/pages/site-pages/multi-language/create-language-variation
        withRawResponse().createLanguageVariation(params, requestOptions).parse()

    override fun deleteBatch(params: SitePageDeleteBatchParams, requestOptions: RequestOptions) {
        // post /cms/v3/pages/site-pages/batch/archive
        withRawResponse().deleteBatch(params, requestOptions)
    }

    override fun detachFromLangGroup(
        params: SitePageDetachFromLangGroupParams,
        requestOptions: RequestOptions,
    ) {
        // post /cms/v3/pages/site-pages/multi-language/detach-from-lang-group
        withRawResponse().detachFromLangGroup(params, requestOptions)
    }

    override fun endAbTest(params: SitePageEndAbTestParams, requestOptions: RequestOptions) {
        // post /cms/v3/pages/site-pages/ab-test/end
        withRawResponse().endAbTest(params, requestOptions)
    }

    override fun get(params: SitePageGetParams, requestOptions: RequestOptions): Page =
        // get /cms/v3/pages/site-pages/{objectId}
        withRawResponse().get(params, requestOptions).parse()

    override fun getBatch(
        params: SitePageGetBatchParams,
        requestOptions: RequestOptions,
    ): BatchResponsePage =
        // post /cms/v3/pages/site-pages/batch/read
        withRawResponse().getBatch(params, requestOptions).parse()

    override fun getDraft(params: SitePageGetDraftParams, requestOptions: RequestOptions): Page =
        // get /cms/v3/pages/site-pages/{objectId}/draft
        withRawResponse().getDraft(params, requestOptions).parse()

    override fun getRevision(
        params: SitePageGetRevisionParams,
        requestOptions: RequestOptions,
    ): VersionPage =
        // get /cms/v3/pages/site-pages/{objectId}/revisions/{revisionId}
        withRawResponse().getRevision(params, requestOptions).parse()

    override fun listRevisions(
        params: SitePageListRevisionsParams,
        requestOptions: RequestOptions,
    ): CollectionResponseWithTotalVersionPage =
        // get /cms/v3/pages/site-pages/{objectId}/revisions
        withRawResponse().listRevisions(params, requestOptions).parse()

    override fun publishDraft(params: SitePagePublishDraftParams, requestOptions: RequestOptions) {
        // post /cms/v3/pages/site-pages/{objectId}/draft/push-live
        withRawResponse().publishDraft(params, requestOptions)
    }

    override fun rerunAbTest(params: SitePageRerunAbTestParams, requestOptions: RequestOptions) {
        // post /cms/v3/pages/site-pages/ab-test/rerun
        withRawResponse().rerunAbTest(params, requestOptions)
    }

    override fun resetDraft(params: SitePageResetDraftParams, requestOptions: RequestOptions) {
        // post /cms/v3/pages/site-pages/{objectId}/draft/reset
        withRawResponse().resetDraft(params, requestOptions)
    }

    override fun restoreRevision(
        params: SitePageRestoreRevisionParams,
        requestOptions: RequestOptions,
    ): Page =
        // post /cms/v3/pages/site-pages/{objectId}/revisions/{revisionId}/restore
        withRawResponse().restoreRevision(params, requestOptions).parse()

    override fun restoreRevisionToDraft(
        params: SitePageRestoreRevisionToDraftParams,
        requestOptions: RequestOptions,
    ): Page =
        // post /cms/v3/pages/site-pages/{objectId}/revisions/{revisionId}/restore-to-draft
        withRawResponse().restoreRevisionToDraft(params, requestOptions).parse()

    override fun schedule(params: SitePageScheduleParams, requestOptions: RequestOptions) {
        // post /cms/v3/pages/site-pages/schedule
        withRawResponse().schedule(params, requestOptions)
    }

    override fun setNewLangPrimary(
        params: SitePageSetNewLangPrimaryParams,
        requestOptions: RequestOptions,
    ) {
        // put /cms/v3/pages/site-pages/multi-language/set-new-lang-primary
        withRawResponse().setNewLangPrimary(params, requestOptions)
    }

    override fun updateBatch(
        params: SitePageUpdateBatchParams,
        requestOptions: RequestOptions,
    ): BatchResponsePage =
        // post /cms/v3/pages/site-pages/batch/update
        withRawResponse().updateBatch(params, requestOptions).parse()

    override fun updateDraft(
        params: SitePageUpdateDraftParams,
        requestOptions: RequestOptions,
    ): Page =
        // patch /cms/v3/pages/site-pages/{objectId}/draft
        withRawResponse().updateDraft(params, requestOptions).parse()

    override fun updateLanguages(
        params: SitePageUpdateLanguagesParams,
        requestOptions: RequestOptions,
    ) {
        // post /cms/v3/pages/site-pages/multi-language/update-languages
        withRawResponse().updateLanguages(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        SitePageService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SitePageService.WithRawResponse =
            SitePageServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<Void?> = emptyHandler()

        override fun create(
            params: SitePageCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("cms", "v3", "pages", "site-pages")
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
            params: SitePageUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Page> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("objectId", params.objectId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("cms", "v3", "pages", "site-pages", params._pathParam(0))
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
            params: SitePageListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SitePageListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("cms", "v3", "pages", "site-pages")
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
                        SitePageListPage.builder()
                            .service(SitePageServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: SitePageDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("objectId", params.objectId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("cms", "v3", "pages", "site-pages", params._pathParam(0))
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
            params: SitePageAttachToLangGroupParams,
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
                        "site-pages",
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
            params: SitePageCloneParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Page> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("cms", "v3", "pages", "site-pages", "clone")
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
            params: SitePageCreateAbTestVariationParams,
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
                        "site-pages",
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
            params: SitePageCreateBatchParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BatchResponsePage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("cms", "v3", "pages", "site-pages", "batch", "create")
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

        private val createLanguageVariationHandler: Handler<Page> =
            jsonHandler<Page>(clientOptions.jsonMapper)

        override fun createLanguageVariation(
            params: SitePageCreateLanguageVariationParams,
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
                        "site-pages",
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
            params: SitePageDeleteBatchParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("cms", "v3", "pages", "site-pages", "batch", "archive")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { deleteBatchHandler.handle(it) }
            }
        }

        private val detachFromLangGroupHandler: Handler<Void?> = emptyHandler()

        override fun detachFromLangGroup(
            params: SitePageDetachFromLangGroupParams,
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
                        "site-pages",
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
            params: SitePageEndAbTestParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("cms", "v3", "pages", "site-pages", "ab-test", "end")
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
            params: SitePageGetParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Page> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("objectId", params.objectId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("cms", "v3", "pages", "site-pages", params._pathParam(0))
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
            params: SitePageGetBatchParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BatchResponsePage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("cms", "v3", "pages", "site-pages", "batch", "read")
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
            params: SitePageGetDraftParams,
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
                        "site-pages",
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

        private val getRevisionHandler: Handler<VersionPage> =
            jsonHandler<VersionPage>(clientOptions.jsonMapper)

        override fun getRevision(
            params: SitePageGetRevisionParams,
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
                        "site-pages",
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

        private val listRevisionsHandler: Handler<CollectionResponseWithTotalVersionPage> =
            jsonHandler<CollectionResponseWithTotalVersionPage>(clientOptions.jsonMapper)

        override fun listRevisions(
            params: SitePageListRevisionsParams,
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
                        "site-pages",
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
            params: SitePagePublishDraftParams,
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
                        "site-pages",
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
            params: SitePageRerunAbTestParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("cms", "v3", "pages", "site-pages", "ab-test", "rerun")
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
            params: SitePageResetDraftParams,
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
                        "site-pages",
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

        private val restoreRevisionHandler: Handler<Page> =
            jsonHandler<Page>(clientOptions.jsonMapper)

        override fun restoreRevision(
            params: SitePageRestoreRevisionParams,
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
                        "site-pages",
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
            params: SitePageRestoreRevisionToDraftParams,
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
                        "site-pages",
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
            params: SitePageScheduleParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("cms", "v3", "pages", "site-pages", "schedule")
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
            params: SitePageSetNewLangPrimaryParams,
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
                        "site-pages",
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
            params: SitePageUpdateBatchParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BatchResponsePage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("cms", "v3", "pages", "site-pages", "batch", "update")
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
            params: SitePageUpdateDraftParams,
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
                        "site-pages",
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

        private val updateLanguagesHandler: Handler<Void?> = emptyHandler()

        override fun updateLanguages(
            params: SitePageUpdateLanguagesParams,
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
                        "site-pages",
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
