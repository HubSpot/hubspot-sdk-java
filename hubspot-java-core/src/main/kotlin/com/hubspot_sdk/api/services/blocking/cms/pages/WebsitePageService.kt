// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.cms.pages

import com.google.errorprone.annotations.MustBeClosed
import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponse
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.cms.ContentCloneRequestVNext
import com.hubspot_sdk.api.models.cms.ContentScheduleRequestVNext
import com.hubspot_sdk.api.models.cms.SetNewLanguagePrimaryRequestVNext
import com.hubspot_sdk.api.models.cms.pages.Page
import com.hubspot_sdk.api.models.cms.pages.websitepages.WebsitePageCloneParams
import com.hubspot_sdk.api.models.cms.pages.websitepages.WebsitePageCreateParams
import com.hubspot_sdk.api.models.cms.pages.websitepages.WebsitePageDeleteParams
import com.hubspot_sdk.api.models.cms.pages.websitepages.WebsitePageGetDraftParams
import com.hubspot_sdk.api.models.cms.pages.websitepages.WebsitePageGetParams
import com.hubspot_sdk.api.models.cms.pages.websitepages.WebsitePageListPage
import com.hubspot_sdk.api.models.cms.pages.websitepages.WebsitePageListParams
import com.hubspot_sdk.api.models.cms.pages.websitepages.WebsitePagePublishDraftParams
import com.hubspot_sdk.api.models.cms.pages.websitepages.WebsitePageScheduleParams
import com.hubspot_sdk.api.models.cms.pages.websitepages.WebsitePageSetNewLangPrimaryParams
import com.hubspot_sdk.api.models.cms.pages.websitepages.WebsitePageUpdateDraftParams
import com.hubspot_sdk.api.models.cms.pages.websitepages.WebsitePageUpdateParams
import java.util.function.Consumer

interface WebsitePageService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): WebsitePageService

    /** Create a new website page. */
    fun create(params: WebsitePageCreateParams): Page = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: WebsitePageCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Page

    /** @see create */
    fun create(page: Page, requestOptions: RequestOptions = RequestOptions.none()): Page =
        create(WebsitePageCreateParams.builder().page(page).build(), requestOptions)

    /** @see create */
    fun create(page: Page): Page = create(page, RequestOptions.none())

    /**
     * Partially updates a single website page, specified by its ID. You only need to specify the
     * column values that you are modifying.
     */
    fun update(objectId: String, params: WebsitePageUpdateParams): Page =
        update(objectId, params, RequestOptions.none())

    /** @see update */
    fun update(
        objectId: String,
        params: WebsitePageUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Page = update(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see update */
    fun update(params: WebsitePageUpdateParams): Page = update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: WebsitePageUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Page

    /**
     * Retrieve all website pages. Supports paging and filtering. This method would be useful for an
     * integration that examined these models and used an external service to suggest edits.
     */
    fun list(): WebsitePageListPage = list(WebsitePageListParams.none())

    /** @see list */
    fun list(
        params: WebsitePageListParams = WebsitePageListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WebsitePageListPage

    /** @see list */
    fun list(params: WebsitePageListParams = WebsitePageListParams.none()): WebsitePageListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): WebsitePageListPage =
        list(WebsitePageListParams.none(), requestOptions)

    /** Delete a website page, specified by its ID. */
    fun delete(objectId: String) = delete(objectId, WebsitePageDeleteParams.none())

    /** @see delete */
    fun delete(
        objectId: String,
        params: WebsitePageDeleteParams = WebsitePageDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see delete */
    fun delete(objectId: String, params: WebsitePageDeleteParams = WebsitePageDeleteParams.none()) =
        delete(objectId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: WebsitePageDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see delete */
    fun delete(params: WebsitePageDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(objectId: String, requestOptions: RequestOptions) =
        delete(objectId, WebsitePageDeleteParams.none(), requestOptions)

    /** Create a copy of an existing website page. */
    fun clone(params: WebsitePageCloneParams): Page = clone(params, RequestOptions.none())

    /** @see clone */
    fun clone(
        params: WebsitePageCloneParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Page

    /** @see clone */
    fun clone(
        contentCloneRequestVNext: ContentCloneRequestVNext,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Page =
        clone(
            WebsitePageCloneParams.builder()
                .contentCloneRequestVNext(contentCloneRequestVNext)
                .build(),
            requestOptions,
        )

    /** @see clone */
    fun clone(contentCloneRequestVNext: ContentCloneRequestVNext): Page =
        clone(contentCloneRequestVNext, RequestOptions.none())

    /** Retrieve a website page by its ID. */
    fun get(objectId: String): Page = get(objectId, WebsitePageGetParams.none())

    /** @see get */
    fun get(
        objectId: String,
        params: WebsitePageGetParams = WebsitePageGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Page = get(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see get */
    fun get(objectId: String, params: WebsitePageGetParams = WebsitePageGetParams.none()): Page =
        get(objectId, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: WebsitePageGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Page

    /** @see get */
    fun get(params: WebsitePageGetParams): Page = get(params, RequestOptions.none())

    /** @see get */
    fun get(objectId: String, requestOptions: RequestOptions): Page =
        get(objectId, WebsitePageGetParams.none(), requestOptions)

    /** Retrieve the full draft version of a website page, specified by its ID. */
    fun getDraft(objectId: String): Page = getDraft(objectId, WebsitePageGetDraftParams.none())

    /** @see getDraft */
    fun getDraft(
        objectId: String,
        params: WebsitePageGetDraftParams = WebsitePageGetDraftParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Page = getDraft(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see getDraft */
    fun getDraft(
        objectId: String,
        params: WebsitePageGetDraftParams = WebsitePageGetDraftParams.none(),
    ): Page = getDraft(objectId, params, RequestOptions.none())

    /** @see getDraft */
    fun getDraft(
        params: WebsitePageGetDraftParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Page

    /** @see getDraft */
    fun getDraft(params: WebsitePageGetDraftParams): Page = getDraft(params, RequestOptions.none())

    /** @see getDraft */
    fun getDraft(objectId: String, requestOptions: RequestOptions): Page =
        getDraft(objectId, WebsitePageGetDraftParams.none(), requestOptions)

    /**
     * Take any changes from the draft version of the website page and apply them to the live
     * version.
     */
    fun publishDraft(objectId: String) =
        publishDraft(objectId, WebsitePagePublishDraftParams.none())

    /** @see publishDraft */
    fun publishDraft(
        objectId: String,
        params: WebsitePagePublishDraftParams = WebsitePagePublishDraftParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = publishDraft(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see publishDraft */
    fun publishDraft(
        objectId: String,
        params: WebsitePagePublishDraftParams = WebsitePagePublishDraftParams.none(),
    ) = publishDraft(objectId, params, RequestOptions.none())

    /** @see publishDraft */
    fun publishDraft(
        params: WebsitePagePublishDraftParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see publishDraft */
    fun publishDraft(params: WebsitePagePublishDraftParams) =
        publishDraft(params, RequestOptions.none())

    /** @see publishDraft */
    fun publishDraft(objectId: String, requestOptions: RequestOptions) =
        publishDraft(objectId, WebsitePagePublishDraftParams.none(), requestOptions)

    /** Schedule a website page to published at a future time. */
    fun schedule(params: WebsitePageScheduleParams) = schedule(params, RequestOptions.none())

    /** @see schedule */
    fun schedule(
        params: WebsitePageScheduleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see schedule */
    fun schedule(
        contentScheduleRequestVNext: ContentScheduleRequestVNext,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) =
        schedule(
            WebsitePageScheduleParams.builder()
                .contentScheduleRequestVNext(contentScheduleRequestVNext)
                .build(),
            requestOptions,
        )

    /** @see schedule */
    fun schedule(contentScheduleRequestVNext: ContentScheduleRequestVNext) =
        schedule(contentScheduleRequestVNext, RequestOptions.none())

    /** Set a landing page as the primary language of a multi-language group. */
    fun setNewLangPrimary(params: WebsitePageSetNewLangPrimaryParams) =
        setNewLangPrimary(params, RequestOptions.none())

    /** @see setNewLangPrimary */
    fun setNewLangPrimary(
        params: WebsitePageSetNewLangPrimaryParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see setNewLangPrimary */
    fun setNewLangPrimary(
        setNewLanguagePrimaryRequestVNext: SetNewLanguagePrimaryRequestVNext,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) =
        setNewLangPrimary(
            WebsitePageSetNewLangPrimaryParams.builder()
                .setNewLanguagePrimaryRequestVNext(setNewLanguagePrimaryRequestVNext)
                .build(),
            requestOptions,
        )

    /** @see setNewLangPrimary */
    fun setNewLangPrimary(setNewLanguagePrimaryRequestVNext: SetNewLanguagePrimaryRequestVNext) =
        setNewLangPrimary(setNewLanguagePrimaryRequestVNext, RequestOptions.none())

    /**
     * Partially update the draft version of a website page, specified by page ID. You only need to
     * specify the values for the details that you're modifying.
     */
    fun updateDraft(objectId: String, params: WebsitePageUpdateDraftParams): Page =
        updateDraft(objectId, params, RequestOptions.none())

    /** @see updateDraft */
    fun updateDraft(
        objectId: String,
        params: WebsitePageUpdateDraftParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Page = updateDraft(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see updateDraft */
    fun updateDraft(params: WebsitePageUpdateDraftParams): Page =
        updateDraft(params, RequestOptions.none())

    /** @see updateDraft */
    fun updateDraft(
        params: WebsitePageUpdateDraftParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Page

    /**
     * A view of [WebsitePageService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): WebsitePageService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /cms/pages/2026-03/site-pages`, but is otherwise
         * the same as [WebsitePageService.create].
         */
        @MustBeClosed
        fun create(params: WebsitePageCreateParams): HttpResponseFor<Page> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: WebsitePageCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Page>

        /** @see create */
        @MustBeClosed
        fun create(
            page: Page,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Page> =
            create(WebsitePageCreateParams.builder().page(page).build(), requestOptions)

        /** @see create */
        @MustBeClosed
        fun create(page: Page): HttpResponseFor<Page> = create(page, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `patch /cms/pages/2026-03/site-pages/{objectId}`, but is
         * otherwise the same as [WebsitePageService.update].
         */
        @MustBeClosed
        fun update(objectId: String, params: WebsitePageUpdateParams): HttpResponseFor<Page> =
            update(objectId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            objectId: String,
            params: WebsitePageUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Page> =
            update(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: WebsitePageUpdateParams): HttpResponseFor<Page> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: WebsitePageUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Page>

        /**
         * Returns a raw HTTP response for `get /cms/pages/2026-03/site-pages`, but is otherwise the
         * same as [WebsitePageService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<WebsitePageListPage> = list(WebsitePageListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: WebsitePageListParams = WebsitePageListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<WebsitePageListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: WebsitePageListParams = WebsitePageListParams.none()
        ): HttpResponseFor<WebsitePageListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<WebsitePageListPage> =
            list(WebsitePageListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /cms/pages/2026-03/site-pages/{objectId}`, but is
         * otherwise the same as [WebsitePageService.delete].
         */
        @MustBeClosed
        fun delete(objectId: String): HttpResponse =
            delete(objectId, WebsitePageDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            objectId: String,
            params: WebsitePageDeleteParams = WebsitePageDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            objectId: String,
            params: WebsitePageDeleteParams = WebsitePageDeleteParams.none(),
        ): HttpResponse = delete(objectId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: WebsitePageDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: WebsitePageDeleteParams): HttpResponse =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(objectId: String, requestOptions: RequestOptions): HttpResponse =
            delete(objectId, WebsitePageDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /cms/pages/2026-03/site-pages/clone`, but is
         * otherwise the same as [WebsitePageService.clone].
         */
        @MustBeClosed
        fun clone(params: WebsitePageCloneParams): HttpResponseFor<Page> =
            clone(params, RequestOptions.none())

        /** @see clone */
        @MustBeClosed
        fun clone(
            params: WebsitePageCloneParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Page>

        /** @see clone */
        @MustBeClosed
        fun clone(
            contentCloneRequestVNext: ContentCloneRequestVNext,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Page> =
            clone(
                WebsitePageCloneParams.builder()
                    .contentCloneRequestVNext(contentCloneRequestVNext)
                    .build(),
                requestOptions,
            )

        /** @see clone */
        @MustBeClosed
        fun clone(contentCloneRequestVNext: ContentCloneRequestVNext): HttpResponseFor<Page> =
            clone(contentCloneRequestVNext, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `get /cms/pages/2026-03/site-pages/{objectId}`, but is
         * otherwise the same as [WebsitePageService.get].
         */
        @MustBeClosed
        fun get(objectId: String): HttpResponseFor<Page> =
            get(objectId, WebsitePageGetParams.none())

        /** @see get */
        @MustBeClosed
        fun get(
            objectId: String,
            params: WebsitePageGetParams = WebsitePageGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Page> =
            get(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see get */
        @MustBeClosed
        fun get(
            objectId: String,
            params: WebsitePageGetParams = WebsitePageGetParams.none(),
        ): HttpResponseFor<Page> = get(objectId, params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: WebsitePageGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Page>

        /** @see get */
        @MustBeClosed
        fun get(params: WebsitePageGetParams): HttpResponseFor<Page> =
            get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(objectId: String, requestOptions: RequestOptions): HttpResponseFor<Page> =
            get(objectId, WebsitePageGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /cms/pages/2026-03/site-pages/{objectId}/draft`, but
         * is otherwise the same as [WebsitePageService.getDraft].
         */
        @MustBeClosed
        fun getDraft(objectId: String): HttpResponseFor<Page> =
            getDraft(objectId, WebsitePageGetDraftParams.none())

        /** @see getDraft */
        @MustBeClosed
        fun getDraft(
            objectId: String,
            params: WebsitePageGetDraftParams = WebsitePageGetDraftParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Page> =
            getDraft(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see getDraft */
        @MustBeClosed
        fun getDraft(
            objectId: String,
            params: WebsitePageGetDraftParams = WebsitePageGetDraftParams.none(),
        ): HttpResponseFor<Page> = getDraft(objectId, params, RequestOptions.none())

        /** @see getDraft */
        @MustBeClosed
        fun getDraft(
            params: WebsitePageGetDraftParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Page>

        /** @see getDraft */
        @MustBeClosed
        fun getDraft(params: WebsitePageGetDraftParams): HttpResponseFor<Page> =
            getDraft(params, RequestOptions.none())

        /** @see getDraft */
        @MustBeClosed
        fun getDraft(objectId: String, requestOptions: RequestOptions): HttpResponseFor<Page> =
            getDraft(objectId, WebsitePageGetDraftParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /cms/pages/2026-03/site-pages/{objectId}/draft/push-live`, but is otherwise the same as
         * [WebsitePageService.publishDraft].
         */
        @MustBeClosed
        fun publishDraft(objectId: String): HttpResponse =
            publishDraft(objectId, WebsitePagePublishDraftParams.none())

        /** @see publishDraft */
        @MustBeClosed
        fun publishDraft(
            objectId: String,
            params: WebsitePagePublishDraftParams = WebsitePagePublishDraftParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            publishDraft(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see publishDraft */
        @MustBeClosed
        fun publishDraft(
            objectId: String,
            params: WebsitePagePublishDraftParams = WebsitePagePublishDraftParams.none(),
        ): HttpResponse = publishDraft(objectId, params, RequestOptions.none())

        /** @see publishDraft */
        @MustBeClosed
        fun publishDraft(
            params: WebsitePagePublishDraftParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see publishDraft */
        @MustBeClosed
        fun publishDraft(params: WebsitePagePublishDraftParams): HttpResponse =
            publishDraft(params, RequestOptions.none())

        /** @see publishDraft */
        @MustBeClosed
        fun publishDraft(objectId: String, requestOptions: RequestOptions): HttpResponse =
            publishDraft(objectId, WebsitePagePublishDraftParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /cms/pages/2026-03/site-pages/schedule`, but is
         * otherwise the same as [WebsitePageService.schedule].
         */
        @MustBeClosed
        fun schedule(params: WebsitePageScheduleParams): HttpResponse =
            schedule(params, RequestOptions.none())

        /** @see schedule */
        @MustBeClosed
        fun schedule(
            params: WebsitePageScheduleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see schedule */
        @MustBeClosed
        fun schedule(
            contentScheduleRequestVNext: ContentScheduleRequestVNext,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            schedule(
                WebsitePageScheduleParams.builder()
                    .contentScheduleRequestVNext(contentScheduleRequestVNext)
                    .build(),
                requestOptions,
            )

        /** @see schedule */
        @MustBeClosed
        fun schedule(contentScheduleRequestVNext: ContentScheduleRequestVNext): HttpResponse =
            schedule(contentScheduleRequestVNext, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `put
         * /cms/pages/2026-03/landing-pages/multi-language/set-new-lang-primary`, but is otherwise
         * the same as [WebsitePageService.setNewLangPrimary].
         */
        @MustBeClosed
        fun setNewLangPrimary(params: WebsitePageSetNewLangPrimaryParams): HttpResponse =
            setNewLangPrimary(params, RequestOptions.none())

        /** @see setNewLangPrimary */
        @MustBeClosed
        fun setNewLangPrimary(
            params: WebsitePageSetNewLangPrimaryParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see setNewLangPrimary */
        @MustBeClosed
        fun setNewLangPrimary(
            setNewLanguagePrimaryRequestVNext: SetNewLanguagePrimaryRequestVNext,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            setNewLangPrimary(
                WebsitePageSetNewLangPrimaryParams.builder()
                    .setNewLanguagePrimaryRequestVNext(setNewLanguagePrimaryRequestVNext)
                    .build(),
                requestOptions,
            )

        /** @see setNewLangPrimary */
        @MustBeClosed
        fun setNewLangPrimary(
            setNewLanguagePrimaryRequestVNext: SetNewLanguagePrimaryRequestVNext
        ): HttpResponse =
            setNewLangPrimary(setNewLanguagePrimaryRequestVNext, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `patch /cms/pages/2026-03/site-pages/{objectId}/draft`,
         * but is otherwise the same as [WebsitePageService.updateDraft].
         */
        @MustBeClosed
        fun updateDraft(
            objectId: String,
            params: WebsitePageUpdateDraftParams,
        ): HttpResponseFor<Page> = updateDraft(objectId, params, RequestOptions.none())

        /** @see updateDraft */
        @MustBeClosed
        fun updateDraft(
            objectId: String,
            params: WebsitePageUpdateDraftParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Page> =
            updateDraft(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see updateDraft */
        @MustBeClosed
        fun updateDraft(params: WebsitePageUpdateDraftParams): HttpResponseFor<Page> =
            updateDraft(params, RequestOptions.none())

        /** @see updateDraft */
        @MustBeClosed
        fun updateDraft(
            params: WebsitePageUpdateDraftParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Page>
    }
}
