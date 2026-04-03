// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.cms.pages

import com.google.errorprone.annotations.MustBeClosed
import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponse
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.cms.ContentCloneRequestVNext
import com.hubspot_sdk.api.models.cms.ContentScheduleRequestVNext
import com.hubspot_sdk.api.models.cms.pages.CmsPage
import com.hubspot_sdk.api.models.cms.pages.landingpages.LandingPageCloneParams
import com.hubspot_sdk.api.models.cms.pages.landingpages.LandingPageCreateParams
import com.hubspot_sdk.api.models.cms.pages.landingpages.LandingPageDeleteParams
import com.hubspot_sdk.api.models.cms.pages.landingpages.LandingPageGetDraftParams
import com.hubspot_sdk.api.models.cms.pages.landingpages.LandingPageGetParams
import com.hubspot_sdk.api.models.cms.pages.landingpages.LandingPageListPage
import com.hubspot_sdk.api.models.cms.pages.landingpages.LandingPageListParams
import com.hubspot_sdk.api.models.cms.pages.landingpages.LandingPagePushDraftLiveParams
import com.hubspot_sdk.api.models.cms.pages.landingpages.LandingPageResetDraftParams
import com.hubspot_sdk.api.models.cms.pages.landingpages.LandingPageScheduleParams
import com.hubspot_sdk.api.models.cms.pages.landingpages.LandingPageUpdateDraftParams
import com.hubspot_sdk.api.models.cms.pages.landingpages.LandingPageUpdateParams
import java.util.function.Consumer

interface LandingPageService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): LandingPageService

    /** Create a new landing page. */
    fun create(params: LandingPageCreateParams): CmsPage = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: LandingPageCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CmsPage

    /** @see create */
    fun create(cmsPage: CmsPage, requestOptions: RequestOptions = RequestOptions.none()): CmsPage =
        create(LandingPageCreateParams.builder().cmsPage(cmsPage).build(), requestOptions)

    /** @see create */
    fun create(cmsPage: CmsPage): CmsPage = create(cmsPage, RequestOptions.none())

    /**
     * Sparse updates a single Landing Page object identified by the id in the path. You only need
     * to specify the column values that you are modifying.
     */
    fun update(objectId: String, params: LandingPageUpdateParams): CmsPage =
        update(objectId, params, RequestOptions.none())

    /** @see update */
    fun update(
        objectId: String,
        params: LandingPageUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CmsPage = update(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see update */
    fun update(params: LandingPageUpdateParams): CmsPage = update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: LandingPageUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CmsPage

    /**
     * Get the list of landing pages. Supports paging and filtering. This method would be useful for
     * an integration that examined these models and used an external service to suggest edits.
     */
    fun list(): LandingPageListPage = list(LandingPageListParams.none())

    /** @see list */
    fun list(
        params: LandingPageListParams = LandingPageListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LandingPageListPage

    /** @see list */
    fun list(params: LandingPageListParams = LandingPageListParams.none()): LandingPageListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): LandingPageListPage =
        list(LandingPageListParams.none(), requestOptions)

    /** Delete a landing page, specified by its ID. */
    fun delete(objectId: String) = delete(objectId, LandingPageDeleteParams.none())

    /** @see delete */
    fun delete(
        objectId: String,
        params: LandingPageDeleteParams = LandingPageDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see delete */
    fun delete(objectId: String, params: LandingPageDeleteParams = LandingPageDeleteParams.none()) =
        delete(objectId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: LandingPageDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see delete */
    fun delete(params: LandingPageDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(objectId: String, requestOptions: RequestOptions) =
        delete(objectId, LandingPageDeleteParams.none(), requestOptions)

    /** Create a copy of an existing landing page. */
    fun clone(params: LandingPageCloneParams): CmsPage = clone(params, RequestOptions.none())

    /** @see clone */
    fun clone(
        params: LandingPageCloneParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CmsPage

    /** @see clone */
    fun clone(
        contentCloneRequestVNext: ContentCloneRequestVNext,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CmsPage =
        clone(
            LandingPageCloneParams.builder()
                .contentCloneRequestVNext(contentCloneRequestVNext)
                .build(),
            requestOptions,
        )

    /** @see clone */
    fun clone(contentCloneRequestVNext: ContentCloneRequestVNext): CmsPage =
        clone(contentCloneRequestVNext, RequestOptions.none())

    /** Retrieve a landing page, specified by its ID. */
    fun get(objectId: String): CmsPage = get(objectId, LandingPageGetParams.none())

    /** @see get */
    fun get(
        objectId: String,
        params: LandingPageGetParams = LandingPageGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CmsPage = get(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see get */
    fun get(objectId: String, params: LandingPageGetParams = LandingPageGetParams.none()): CmsPage =
        get(objectId, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: LandingPageGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CmsPage

    /** @see get */
    fun get(params: LandingPageGetParams): CmsPage = get(params, RequestOptions.none())

    /** @see get */
    fun get(objectId: String, requestOptions: RequestOptions): CmsPage =
        get(objectId, LandingPageGetParams.none(), requestOptions)

    /** Retrieve the full draft version of a landing page, specified by page ID. */
    fun getDraft(objectId: String): CmsPage = getDraft(objectId, LandingPageGetDraftParams.none())

    /** @see getDraft */
    fun getDraft(
        objectId: String,
        params: LandingPageGetDraftParams = LandingPageGetDraftParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CmsPage = getDraft(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see getDraft */
    fun getDraft(
        objectId: String,
        params: LandingPageGetDraftParams = LandingPageGetDraftParams.none(),
    ): CmsPage = getDraft(objectId, params, RequestOptions.none())

    /** @see getDraft */
    fun getDraft(
        params: LandingPageGetDraftParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CmsPage

    /** @see getDraft */
    fun getDraft(params: LandingPageGetDraftParams): CmsPage =
        getDraft(params, RequestOptions.none())

    /** @see getDraft */
    fun getDraft(objectId: String, requestOptions: RequestOptions): CmsPage =
        getDraft(objectId, LandingPageGetDraftParams.none(), requestOptions)

    /**
     * Take any changes from the draft version of the Landing Page and apply them to the live
     * version.
     */
    fun pushDraftLive(objectId: String) =
        pushDraftLive(objectId, LandingPagePushDraftLiveParams.none())

    /** @see pushDraftLive */
    fun pushDraftLive(
        objectId: String,
        params: LandingPagePushDraftLiveParams = LandingPagePushDraftLiveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = pushDraftLive(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see pushDraftLive */
    fun pushDraftLive(
        objectId: String,
        params: LandingPagePushDraftLiveParams = LandingPagePushDraftLiveParams.none(),
    ) = pushDraftLive(objectId, params, RequestOptions.none())

    /** @see pushDraftLive */
    fun pushDraftLive(
        params: LandingPagePushDraftLiveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see pushDraftLive */
    fun pushDraftLive(params: LandingPagePushDraftLiveParams) =
        pushDraftLive(params, RequestOptions.none())

    /** @see pushDraftLive */
    fun pushDraftLive(objectId: String, requestOptions: RequestOptions) =
        pushDraftLive(objectId, LandingPagePushDraftLiveParams.none(), requestOptions)

    /** Discards any edits and resets the draft to match the live version. */
    fun resetDraft(objectId: String) = resetDraft(objectId, LandingPageResetDraftParams.none())

    /** @see resetDraft */
    fun resetDraft(
        objectId: String,
        params: LandingPageResetDraftParams = LandingPageResetDraftParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = resetDraft(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see resetDraft */
    fun resetDraft(
        objectId: String,
        params: LandingPageResetDraftParams = LandingPageResetDraftParams.none(),
    ) = resetDraft(objectId, params, RequestOptions.none())

    /** @see resetDraft */
    fun resetDraft(
        params: LandingPageResetDraftParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see resetDraft */
    fun resetDraft(params: LandingPageResetDraftParams) = resetDraft(params, RequestOptions.none())

    /** @see resetDraft */
    fun resetDraft(objectId: String, requestOptions: RequestOptions) =
        resetDraft(objectId, LandingPageResetDraftParams.none(), requestOptions)

    /** Schedule a landing page to be published. */
    fun schedule(params: LandingPageScheduleParams) = schedule(params, RequestOptions.none())

    /** @see schedule */
    fun schedule(
        params: LandingPageScheduleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see schedule */
    fun schedule(
        contentScheduleRequestVNext: ContentScheduleRequestVNext,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) =
        schedule(
            LandingPageScheduleParams.builder()
                .contentScheduleRequestVNext(contentScheduleRequestVNext)
                .build(),
            requestOptions,
        )

    /** @see schedule */
    fun schedule(contentScheduleRequestVNext: ContentScheduleRequestVNext) =
        schedule(contentScheduleRequestVNext, RequestOptions.none())

    /**
     * Partially updates the draft version of a single landing page, specified by its ID. You only
     * need to specify the column values that you are modifying.
     */
    fun updateDraft(objectId: String, params: LandingPageUpdateDraftParams): CmsPage =
        updateDraft(objectId, params, RequestOptions.none())

    /** @see updateDraft */
    fun updateDraft(
        objectId: String,
        params: LandingPageUpdateDraftParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CmsPage = updateDraft(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see updateDraft */
    fun updateDraft(params: LandingPageUpdateDraftParams): CmsPage =
        updateDraft(params, RequestOptions.none())

    /** @see updateDraft */
    fun updateDraft(
        params: LandingPageUpdateDraftParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CmsPage

    /**
     * A view of [LandingPageService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): LandingPageService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /cms/pages/2026-03/landing-pages`, but is otherwise
         * the same as [LandingPageService.create].
         */
        @MustBeClosed
        fun create(params: LandingPageCreateParams): HttpResponseFor<CmsPage> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: LandingPageCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CmsPage>

        /** @see create */
        @MustBeClosed
        fun create(
            cmsPage: CmsPage,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CmsPage> =
            create(LandingPageCreateParams.builder().cmsPage(cmsPage).build(), requestOptions)

        /** @see create */
        @MustBeClosed
        fun create(cmsPage: CmsPage): HttpResponseFor<CmsPage> =
            create(cmsPage, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `patch /cms/pages/2026-03/landing-pages/{objectId}`, but
         * is otherwise the same as [LandingPageService.update].
         */
        @MustBeClosed
        fun update(objectId: String, params: LandingPageUpdateParams): HttpResponseFor<CmsPage> =
            update(objectId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            objectId: String,
            params: LandingPageUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CmsPage> =
            update(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: LandingPageUpdateParams): HttpResponseFor<CmsPage> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: LandingPageUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CmsPage>

        /**
         * Returns a raw HTTP response for `get /cms/pages/2026-03/landing-pages`, but is otherwise
         * the same as [LandingPageService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<LandingPageListPage> = list(LandingPageListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: LandingPageListParams = LandingPageListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LandingPageListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: LandingPageListParams = LandingPageListParams.none()
        ): HttpResponseFor<LandingPageListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<LandingPageListPage> =
            list(LandingPageListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /cms/pages/2026-03/landing-pages/{objectId}`, but
         * is otherwise the same as [LandingPageService.delete].
         */
        @MustBeClosed
        fun delete(objectId: String): HttpResponse =
            delete(objectId, LandingPageDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            objectId: String,
            params: LandingPageDeleteParams = LandingPageDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            objectId: String,
            params: LandingPageDeleteParams = LandingPageDeleteParams.none(),
        ): HttpResponse = delete(objectId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: LandingPageDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: LandingPageDeleteParams): HttpResponse =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(objectId: String, requestOptions: RequestOptions): HttpResponse =
            delete(objectId, LandingPageDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /cms/pages/2026-03/landing-pages/clone`, but is
         * otherwise the same as [LandingPageService.clone].
         */
        @MustBeClosed
        fun clone(params: LandingPageCloneParams): HttpResponseFor<CmsPage> =
            clone(params, RequestOptions.none())

        /** @see clone */
        @MustBeClosed
        fun clone(
            params: LandingPageCloneParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CmsPage>

        /** @see clone */
        @MustBeClosed
        fun clone(
            contentCloneRequestVNext: ContentCloneRequestVNext,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CmsPage> =
            clone(
                LandingPageCloneParams.builder()
                    .contentCloneRequestVNext(contentCloneRequestVNext)
                    .build(),
                requestOptions,
            )

        /** @see clone */
        @MustBeClosed
        fun clone(contentCloneRequestVNext: ContentCloneRequestVNext): HttpResponseFor<CmsPage> =
            clone(contentCloneRequestVNext, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `get /cms/pages/2026-03/landing-pages/{objectId}`, but is
         * otherwise the same as [LandingPageService.get].
         */
        @MustBeClosed
        fun get(objectId: String): HttpResponseFor<CmsPage> =
            get(objectId, LandingPageGetParams.none())

        /** @see get */
        @MustBeClosed
        fun get(
            objectId: String,
            params: LandingPageGetParams = LandingPageGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CmsPage> =
            get(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see get */
        @MustBeClosed
        fun get(
            objectId: String,
            params: LandingPageGetParams = LandingPageGetParams.none(),
        ): HttpResponseFor<CmsPage> = get(objectId, params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: LandingPageGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CmsPage>

        /** @see get */
        @MustBeClosed
        fun get(params: LandingPageGetParams): HttpResponseFor<CmsPage> =
            get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(objectId: String, requestOptions: RequestOptions): HttpResponseFor<CmsPage> =
            get(objectId, LandingPageGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /cms/pages/2026-03/landing-pages/{objectId}/draft`,
         * but is otherwise the same as [LandingPageService.getDraft].
         */
        @MustBeClosed
        fun getDraft(objectId: String): HttpResponseFor<CmsPage> =
            getDraft(objectId, LandingPageGetDraftParams.none())

        /** @see getDraft */
        @MustBeClosed
        fun getDraft(
            objectId: String,
            params: LandingPageGetDraftParams = LandingPageGetDraftParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CmsPage> =
            getDraft(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see getDraft */
        @MustBeClosed
        fun getDraft(
            objectId: String,
            params: LandingPageGetDraftParams = LandingPageGetDraftParams.none(),
        ): HttpResponseFor<CmsPage> = getDraft(objectId, params, RequestOptions.none())

        /** @see getDraft */
        @MustBeClosed
        fun getDraft(
            params: LandingPageGetDraftParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CmsPage>

        /** @see getDraft */
        @MustBeClosed
        fun getDraft(params: LandingPageGetDraftParams): HttpResponseFor<CmsPage> =
            getDraft(params, RequestOptions.none())

        /** @see getDraft */
        @MustBeClosed
        fun getDraft(objectId: String, requestOptions: RequestOptions): HttpResponseFor<CmsPage> =
            getDraft(objectId, LandingPageGetDraftParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /cms/pages/2026-03/landing-pages/{objectId}/draft/push-live`, but is otherwise the same
         * as [LandingPageService.pushDraftLive].
         */
        @MustBeClosed
        fun pushDraftLive(objectId: String): HttpResponse =
            pushDraftLive(objectId, LandingPagePushDraftLiveParams.none())

        /** @see pushDraftLive */
        @MustBeClosed
        fun pushDraftLive(
            objectId: String,
            params: LandingPagePushDraftLiveParams = LandingPagePushDraftLiveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            pushDraftLive(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see pushDraftLive */
        @MustBeClosed
        fun pushDraftLive(
            objectId: String,
            params: LandingPagePushDraftLiveParams = LandingPagePushDraftLiveParams.none(),
        ): HttpResponse = pushDraftLive(objectId, params, RequestOptions.none())

        /** @see pushDraftLive */
        @MustBeClosed
        fun pushDraftLive(
            params: LandingPagePushDraftLiveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see pushDraftLive */
        @MustBeClosed
        fun pushDraftLive(params: LandingPagePushDraftLiveParams): HttpResponse =
            pushDraftLive(params, RequestOptions.none())

        /** @see pushDraftLive */
        @MustBeClosed
        fun pushDraftLive(objectId: String, requestOptions: RequestOptions): HttpResponse =
            pushDraftLive(objectId, LandingPagePushDraftLiveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /cms/pages/2026-03/landing-pages/{objectId}/draft/reset`, but is otherwise the same as
         * [LandingPageService.resetDraft].
         */
        @MustBeClosed
        fun resetDraft(objectId: String): HttpResponse =
            resetDraft(objectId, LandingPageResetDraftParams.none())

        /** @see resetDraft */
        @MustBeClosed
        fun resetDraft(
            objectId: String,
            params: LandingPageResetDraftParams = LandingPageResetDraftParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = resetDraft(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see resetDraft */
        @MustBeClosed
        fun resetDraft(
            objectId: String,
            params: LandingPageResetDraftParams = LandingPageResetDraftParams.none(),
        ): HttpResponse = resetDraft(objectId, params, RequestOptions.none())

        /** @see resetDraft */
        @MustBeClosed
        fun resetDraft(
            params: LandingPageResetDraftParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see resetDraft */
        @MustBeClosed
        fun resetDraft(params: LandingPageResetDraftParams): HttpResponse =
            resetDraft(params, RequestOptions.none())

        /** @see resetDraft */
        @MustBeClosed
        fun resetDraft(objectId: String, requestOptions: RequestOptions): HttpResponse =
            resetDraft(objectId, LandingPageResetDraftParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /cms/pages/2026-03/landing-pages/schedule`, but is
         * otherwise the same as [LandingPageService.schedule].
         */
        @MustBeClosed
        fun schedule(params: LandingPageScheduleParams): HttpResponse =
            schedule(params, RequestOptions.none())

        /** @see schedule */
        @MustBeClosed
        fun schedule(
            params: LandingPageScheduleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see schedule */
        @MustBeClosed
        fun schedule(
            contentScheduleRequestVNext: ContentScheduleRequestVNext,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            schedule(
                LandingPageScheduleParams.builder()
                    .contentScheduleRequestVNext(contentScheduleRequestVNext)
                    .build(),
                requestOptions,
            )

        /** @see schedule */
        @MustBeClosed
        fun schedule(contentScheduleRequestVNext: ContentScheduleRequestVNext): HttpResponse =
            schedule(contentScheduleRequestVNext, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `patch
         * /cms/pages/2026-03/landing-pages/{objectId}/draft`, but is otherwise the same as
         * [LandingPageService.updateDraft].
         */
        @MustBeClosed
        fun updateDraft(
            objectId: String,
            params: LandingPageUpdateDraftParams,
        ): HttpResponseFor<CmsPage> = updateDraft(objectId, params, RequestOptions.none())

        /** @see updateDraft */
        @MustBeClosed
        fun updateDraft(
            objectId: String,
            params: LandingPageUpdateDraftParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CmsPage> =
            updateDraft(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see updateDraft */
        @MustBeClosed
        fun updateDraft(params: LandingPageUpdateDraftParams): HttpResponseFor<CmsPage> =
            updateDraft(params, RequestOptions.none())

        /** @see updateDraft */
        @MustBeClosed
        fun updateDraft(
            params: LandingPageUpdateDraftParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CmsPage>
    }
}
