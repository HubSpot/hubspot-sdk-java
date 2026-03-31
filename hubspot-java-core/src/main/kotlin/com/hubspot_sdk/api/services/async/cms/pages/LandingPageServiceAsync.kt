// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.cms.pages

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponse
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.cms.ContentCloneRequestVNext
import com.hubspot_sdk.api.models.cms.ContentScheduleRequestVNext
import com.hubspot_sdk.api.models.cms.pages.Page
import com.hubspot_sdk.api.models.cms.pages.landingpages.LandingPageCloneParams
import com.hubspot_sdk.api.models.cms.pages.landingpages.LandingPageCreateParams
import com.hubspot_sdk.api.models.cms.pages.landingpages.LandingPageDeleteParams
import com.hubspot_sdk.api.models.cms.pages.landingpages.LandingPageGetDraftParams
import com.hubspot_sdk.api.models.cms.pages.landingpages.LandingPageGetParams
import com.hubspot_sdk.api.models.cms.pages.landingpages.LandingPageListPageAsync
import com.hubspot_sdk.api.models.cms.pages.landingpages.LandingPageListParams
import com.hubspot_sdk.api.models.cms.pages.landingpages.LandingPagePushDraftLiveParams
import com.hubspot_sdk.api.models.cms.pages.landingpages.LandingPageResetDraftParams
import com.hubspot_sdk.api.models.cms.pages.landingpages.LandingPageScheduleParams
import com.hubspot_sdk.api.models.cms.pages.landingpages.LandingPageUpdateDraftParams
import com.hubspot_sdk.api.models.cms.pages.landingpages.LandingPageUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface LandingPageServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): LandingPageServiceAsync

    /** Create a new landing page. */
    fun create(params: LandingPageCreateParams): CompletableFuture<Page> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: LandingPageCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Page>

    /** @see create */
    fun create(
        page: Page,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Page> =
        create(LandingPageCreateParams.builder().page(page).build(), requestOptions)

    /** @see create */
    fun create(page: Page): CompletableFuture<Page> = create(page, RequestOptions.none())

    /**
     * Sparse updates a single Landing Page object identified by the id in the path. You only need
     * to specify the column values that you are modifying.
     */
    fun update(objectId: String, params: LandingPageUpdateParams): CompletableFuture<Page> =
        update(objectId, params, RequestOptions.none())

    /** @see update */
    fun update(
        objectId: String,
        params: LandingPageUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Page> =
        update(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see update */
    fun update(params: LandingPageUpdateParams): CompletableFuture<Page> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: LandingPageUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Page>

    /**
     * Get the list of landing pages. Supports paging and filtering. This method would be useful for
     * an integration that examined these models and used an external service to suggest edits.
     */
    fun list(): CompletableFuture<LandingPageListPageAsync> = list(LandingPageListParams.none())

    /** @see list */
    fun list(
        params: LandingPageListParams = LandingPageListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LandingPageListPageAsync>

    /** @see list */
    fun list(
        params: LandingPageListParams = LandingPageListParams.none()
    ): CompletableFuture<LandingPageListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<LandingPageListPageAsync> =
        list(LandingPageListParams.none(), requestOptions)

    /** Delete a landing page, specified by its ID. */
    fun delete(objectId: String): CompletableFuture<Void?> =
        delete(objectId, LandingPageDeleteParams.none())

    /** @see delete */
    fun delete(
        objectId: String,
        params: LandingPageDeleteParams = LandingPageDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        delete(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see delete */
    fun delete(
        objectId: String,
        params: LandingPageDeleteParams = LandingPageDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(objectId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: LandingPageDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: LandingPageDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(objectId: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(objectId, LandingPageDeleteParams.none(), requestOptions)

    /** Create a copy of an existing landing page. */
    fun clone(params: LandingPageCloneParams): CompletableFuture<Page> =
        clone(params, RequestOptions.none())

    /** @see clone */
    fun clone(
        params: LandingPageCloneParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Page>

    /** @see clone */
    fun clone(
        contentCloneRequestVNext: ContentCloneRequestVNext,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Page> =
        clone(
            LandingPageCloneParams.builder()
                .contentCloneRequestVNext(contentCloneRequestVNext)
                .build(),
            requestOptions,
        )

    /** @see clone */
    fun clone(contentCloneRequestVNext: ContentCloneRequestVNext): CompletableFuture<Page> =
        clone(contentCloneRequestVNext, RequestOptions.none())

    /** Retrieve a landing page, specified by its ID. */
    fun get(objectId: String): CompletableFuture<Page> = get(objectId, LandingPageGetParams.none())

    /** @see get */
    fun get(
        objectId: String,
        params: LandingPageGetParams = LandingPageGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Page> = get(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see get */
    fun get(
        objectId: String,
        params: LandingPageGetParams = LandingPageGetParams.none(),
    ): CompletableFuture<Page> = get(objectId, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: LandingPageGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Page>

    /** @see get */
    fun get(params: LandingPageGetParams): CompletableFuture<Page> =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(objectId: String, requestOptions: RequestOptions): CompletableFuture<Page> =
        get(objectId, LandingPageGetParams.none(), requestOptions)

    /** Retrieve the full draft version of a landing page, specified by page ID. */
    fun getDraft(objectId: String): CompletableFuture<Page> =
        getDraft(objectId, LandingPageGetDraftParams.none())

    /** @see getDraft */
    fun getDraft(
        objectId: String,
        params: LandingPageGetDraftParams = LandingPageGetDraftParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Page> =
        getDraft(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see getDraft */
    fun getDraft(
        objectId: String,
        params: LandingPageGetDraftParams = LandingPageGetDraftParams.none(),
    ): CompletableFuture<Page> = getDraft(objectId, params, RequestOptions.none())

    /** @see getDraft */
    fun getDraft(
        params: LandingPageGetDraftParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Page>

    /** @see getDraft */
    fun getDraft(params: LandingPageGetDraftParams): CompletableFuture<Page> =
        getDraft(params, RequestOptions.none())

    /** @see getDraft */
    fun getDraft(objectId: String, requestOptions: RequestOptions): CompletableFuture<Page> =
        getDraft(objectId, LandingPageGetDraftParams.none(), requestOptions)

    /**
     * Take any changes from the draft version of the Landing Page and apply them to the live
     * version.
     */
    fun pushDraftLive(objectId: String): CompletableFuture<Void?> =
        pushDraftLive(objectId, LandingPagePushDraftLiveParams.none())

    /** @see pushDraftLive */
    fun pushDraftLive(
        objectId: String,
        params: LandingPagePushDraftLiveParams = LandingPagePushDraftLiveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        pushDraftLive(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see pushDraftLive */
    fun pushDraftLive(
        objectId: String,
        params: LandingPagePushDraftLiveParams = LandingPagePushDraftLiveParams.none(),
    ): CompletableFuture<Void?> = pushDraftLive(objectId, params, RequestOptions.none())

    /** @see pushDraftLive */
    fun pushDraftLive(
        params: LandingPagePushDraftLiveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see pushDraftLive */
    fun pushDraftLive(params: LandingPagePushDraftLiveParams): CompletableFuture<Void?> =
        pushDraftLive(params, RequestOptions.none())

    /** @see pushDraftLive */
    fun pushDraftLive(objectId: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        pushDraftLive(objectId, LandingPagePushDraftLiveParams.none(), requestOptions)

    /** Discards any edits and resets the draft to match the live version. */
    fun resetDraft(objectId: String): CompletableFuture<Void?> =
        resetDraft(objectId, LandingPageResetDraftParams.none())

    /** @see resetDraft */
    fun resetDraft(
        objectId: String,
        params: LandingPageResetDraftParams = LandingPageResetDraftParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        resetDraft(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see resetDraft */
    fun resetDraft(
        objectId: String,
        params: LandingPageResetDraftParams = LandingPageResetDraftParams.none(),
    ): CompletableFuture<Void?> = resetDraft(objectId, params, RequestOptions.none())

    /** @see resetDraft */
    fun resetDraft(
        params: LandingPageResetDraftParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see resetDraft */
    fun resetDraft(params: LandingPageResetDraftParams): CompletableFuture<Void?> =
        resetDraft(params, RequestOptions.none())

    /** @see resetDraft */
    fun resetDraft(objectId: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        resetDraft(objectId, LandingPageResetDraftParams.none(), requestOptions)

    /** Schedule a landing page to be published. */
    fun schedule(params: LandingPageScheduleParams): CompletableFuture<Void?> =
        schedule(params, RequestOptions.none())

    /** @see schedule */
    fun schedule(
        params: LandingPageScheduleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see schedule */
    fun schedule(
        contentScheduleRequestVNext: ContentScheduleRequestVNext,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        schedule(
            LandingPageScheduleParams.builder()
                .contentScheduleRequestVNext(contentScheduleRequestVNext)
                .build(),
            requestOptions,
        )

    /** @see schedule */
    fun schedule(
        contentScheduleRequestVNext: ContentScheduleRequestVNext
    ): CompletableFuture<Void?> = schedule(contentScheduleRequestVNext, RequestOptions.none())

    /**
     * Partially updates the draft version of a single landing page, specified by its ID. You only
     * need to specify the column values that you are modifying.
     */
    fun updateDraft(
        objectId: String,
        params: LandingPageUpdateDraftParams,
    ): CompletableFuture<Page> = updateDraft(objectId, params, RequestOptions.none())

    /** @see updateDraft */
    fun updateDraft(
        objectId: String,
        params: LandingPageUpdateDraftParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Page> =
        updateDraft(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see updateDraft */
    fun updateDraft(params: LandingPageUpdateDraftParams): CompletableFuture<Page> =
        updateDraft(params, RequestOptions.none())

    /** @see updateDraft */
    fun updateDraft(
        params: LandingPageUpdateDraftParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Page>

    /**
     * A view of [LandingPageServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): LandingPageServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /cms/pages/2026-03/landing-pages`, but is otherwise
         * the same as [LandingPageServiceAsync.create].
         */
        fun create(params: LandingPageCreateParams): CompletableFuture<HttpResponseFor<Page>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: LandingPageCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Page>>

        /** @see create */
        fun create(
            page: Page,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Page>> =
            create(LandingPageCreateParams.builder().page(page).build(), requestOptions)

        /** @see create */
        fun create(page: Page): CompletableFuture<HttpResponseFor<Page>> =
            create(page, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `patch /cms/pages/2026-03/landing-pages/{objectId}`, but
         * is otherwise the same as [LandingPageServiceAsync.update].
         */
        fun update(
            objectId: String,
            params: LandingPageUpdateParams,
        ): CompletableFuture<HttpResponseFor<Page>> =
            update(objectId, params, RequestOptions.none())

        /** @see update */
        fun update(
            objectId: String,
            params: LandingPageUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Page>> =
            update(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see update */
        fun update(params: LandingPageUpdateParams): CompletableFuture<HttpResponseFor<Page>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: LandingPageUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Page>>

        /**
         * Returns a raw HTTP response for `get /cms/pages/2026-03/landing-pages`, but is otherwise
         * the same as [LandingPageServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<LandingPageListPageAsync>> =
            list(LandingPageListParams.none())

        /** @see list */
        fun list(
            params: LandingPageListParams = LandingPageListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LandingPageListPageAsync>>

        /** @see list */
        fun list(
            params: LandingPageListParams = LandingPageListParams.none()
        ): CompletableFuture<HttpResponseFor<LandingPageListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<LandingPageListPageAsync>> =
            list(LandingPageListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /cms/pages/2026-03/landing-pages/{objectId}`, but
         * is otherwise the same as [LandingPageServiceAsync.delete].
         */
        fun delete(objectId: String): CompletableFuture<HttpResponse> =
            delete(objectId, LandingPageDeleteParams.none())

        /** @see delete */
        fun delete(
            objectId: String,
            params: LandingPageDeleteParams = LandingPageDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see delete */
        fun delete(
            objectId: String,
            params: LandingPageDeleteParams = LandingPageDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(objectId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: LandingPageDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: LandingPageDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            objectId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            delete(objectId, LandingPageDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /cms/pages/2026-03/landing-pages/clone`, but is
         * otherwise the same as [LandingPageServiceAsync.clone].
         */
        fun clone(params: LandingPageCloneParams): CompletableFuture<HttpResponseFor<Page>> =
            clone(params, RequestOptions.none())

        /** @see clone */
        fun clone(
            params: LandingPageCloneParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Page>>

        /** @see clone */
        fun clone(
            contentCloneRequestVNext: ContentCloneRequestVNext,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Page>> =
            clone(
                LandingPageCloneParams.builder()
                    .contentCloneRequestVNext(contentCloneRequestVNext)
                    .build(),
                requestOptions,
            )

        /** @see clone */
        fun clone(
            contentCloneRequestVNext: ContentCloneRequestVNext
        ): CompletableFuture<HttpResponseFor<Page>> =
            clone(contentCloneRequestVNext, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `get /cms/pages/2026-03/landing-pages/{objectId}`, but is
         * otherwise the same as [LandingPageServiceAsync.get].
         */
        fun get(objectId: String): CompletableFuture<HttpResponseFor<Page>> =
            get(objectId, LandingPageGetParams.none())

        /** @see get */
        fun get(
            objectId: String,
            params: LandingPageGetParams = LandingPageGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Page>> =
            get(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see get */
        fun get(
            objectId: String,
            params: LandingPageGetParams = LandingPageGetParams.none(),
        ): CompletableFuture<HttpResponseFor<Page>> = get(objectId, params, RequestOptions.none())

        /** @see get */
        fun get(
            params: LandingPageGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Page>>

        /** @see get */
        fun get(params: LandingPageGetParams): CompletableFuture<HttpResponseFor<Page>> =
            get(params, RequestOptions.none())

        /** @see get */
        fun get(
            objectId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Page>> =
            get(objectId, LandingPageGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /cms/pages/2026-03/landing-pages/{objectId}/draft`,
         * but is otherwise the same as [LandingPageServiceAsync.getDraft].
         */
        fun getDraft(objectId: String): CompletableFuture<HttpResponseFor<Page>> =
            getDraft(objectId, LandingPageGetDraftParams.none())

        /** @see getDraft */
        fun getDraft(
            objectId: String,
            params: LandingPageGetDraftParams = LandingPageGetDraftParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Page>> =
            getDraft(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see getDraft */
        fun getDraft(
            objectId: String,
            params: LandingPageGetDraftParams = LandingPageGetDraftParams.none(),
        ): CompletableFuture<HttpResponseFor<Page>> =
            getDraft(objectId, params, RequestOptions.none())

        /** @see getDraft */
        fun getDraft(
            params: LandingPageGetDraftParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Page>>

        /** @see getDraft */
        fun getDraft(params: LandingPageGetDraftParams): CompletableFuture<HttpResponseFor<Page>> =
            getDraft(params, RequestOptions.none())

        /** @see getDraft */
        fun getDraft(
            objectId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Page>> =
            getDraft(objectId, LandingPageGetDraftParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /cms/pages/2026-03/landing-pages/{objectId}/draft/push-live`, but is otherwise the same
         * as [LandingPageServiceAsync.pushDraftLive].
         */
        fun pushDraftLive(objectId: String): CompletableFuture<HttpResponse> =
            pushDraftLive(objectId, LandingPagePushDraftLiveParams.none())

        /** @see pushDraftLive */
        fun pushDraftLive(
            objectId: String,
            params: LandingPagePushDraftLiveParams = LandingPagePushDraftLiveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            pushDraftLive(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see pushDraftLive */
        fun pushDraftLive(
            objectId: String,
            params: LandingPagePushDraftLiveParams = LandingPagePushDraftLiveParams.none(),
        ): CompletableFuture<HttpResponse> = pushDraftLive(objectId, params, RequestOptions.none())

        /** @see pushDraftLive */
        fun pushDraftLive(
            params: LandingPagePushDraftLiveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see pushDraftLive */
        fun pushDraftLive(params: LandingPagePushDraftLiveParams): CompletableFuture<HttpResponse> =
            pushDraftLive(params, RequestOptions.none())

        /** @see pushDraftLive */
        fun pushDraftLive(
            objectId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            pushDraftLive(objectId, LandingPagePushDraftLiveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /cms/pages/2026-03/landing-pages/{objectId}/draft/reset`, but is otherwise the same as
         * [LandingPageServiceAsync.resetDraft].
         */
        fun resetDraft(objectId: String): CompletableFuture<HttpResponse> =
            resetDraft(objectId, LandingPageResetDraftParams.none())

        /** @see resetDraft */
        fun resetDraft(
            objectId: String,
            params: LandingPageResetDraftParams = LandingPageResetDraftParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            resetDraft(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see resetDraft */
        fun resetDraft(
            objectId: String,
            params: LandingPageResetDraftParams = LandingPageResetDraftParams.none(),
        ): CompletableFuture<HttpResponse> = resetDraft(objectId, params, RequestOptions.none())

        /** @see resetDraft */
        fun resetDraft(
            params: LandingPageResetDraftParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see resetDraft */
        fun resetDraft(params: LandingPageResetDraftParams): CompletableFuture<HttpResponse> =
            resetDraft(params, RequestOptions.none())

        /** @see resetDraft */
        fun resetDraft(
            objectId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            resetDraft(objectId, LandingPageResetDraftParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /cms/pages/2026-03/landing-pages/schedule`, but is
         * otherwise the same as [LandingPageServiceAsync.schedule].
         */
        fun schedule(params: LandingPageScheduleParams): CompletableFuture<HttpResponse> =
            schedule(params, RequestOptions.none())

        /** @see schedule */
        fun schedule(
            params: LandingPageScheduleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see schedule */
        fun schedule(
            contentScheduleRequestVNext: ContentScheduleRequestVNext,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            schedule(
                LandingPageScheduleParams.builder()
                    .contentScheduleRequestVNext(contentScheduleRequestVNext)
                    .build(),
                requestOptions,
            )

        /** @see schedule */
        fun schedule(
            contentScheduleRequestVNext: ContentScheduleRequestVNext
        ): CompletableFuture<HttpResponse> =
            schedule(contentScheduleRequestVNext, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `patch
         * /cms/pages/2026-03/landing-pages/{objectId}/draft`, but is otherwise the same as
         * [LandingPageServiceAsync.updateDraft].
         */
        fun updateDraft(
            objectId: String,
            params: LandingPageUpdateDraftParams,
        ): CompletableFuture<HttpResponseFor<Page>> =
            updateDraft(objectId, params, RequestOptions.none())

        /** @see updateDraft */
        fun updateDraft(
            objectId: String,
            params: LandingPageUpdateDraftParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Page>> =
            updateDraft(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see updateDraft */
        fun updateDraft(
            params: LandingPageUpdateDraftParams
        ): CompletableFuture<HttpResponseFor<Page>> = updateDraft(params, RequestOptions.none())

        /** @see updateDraft */
        fun updateDraft(
            params: LandingPageUpdateDraftParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Page>>
    }
}
