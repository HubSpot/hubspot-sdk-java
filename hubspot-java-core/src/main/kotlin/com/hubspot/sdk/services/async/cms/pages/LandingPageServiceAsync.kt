// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.async.cms.pages

import com.hubspot.sdk.core.ClientOptions
import com.hubspot.sdk.core.RequestOptions
import com.hubspot.sdk.core.http.HttpResponse
import com.hubspot.sdk.core.http.HttpResponseFor
import com.hubspot.sdk.models.cms.ContentCloneRequestVNext
import com.hubspot.sdk.models.cms.ContentScheduleRequestVNext
import com.hubspot.sdk.models.cms.pages.PagesPage
import com.hubspot.sdk.models.cms.pages.landingpages.LandingPageCloneParams
import com.hubspot.sdk.models.cms.pages.landingpages.LandingPageCreateParams
import com.hubspot.sdk.models.cms.pages.landingpages.LandingPageDeleteParams
import com.hubspot.sdk.models.cms.pages.landingpages.LandingPageGetParams
import com.hubspot.sdk.models.cms.pages.landingpages.LandingPageListPageAsync
import com.hubspot.sdk.models.cms.pages.landingpages.LandingPageListParams
import com.hubspot.sdk.models.cms.pages.landingpages.LandingPageScheduleParams
import com.hubspot.sdk.models.cms.pages.landingpages.LandingPageUpdateParams
import com.hubspot.sdk.services.async.cms.pages.landingpages.AbTestServiceAsync
import com.hubspot.sdk.services.async.cms.pages.landingpages.BatchServiceAsync
import com.hubspot.sdk.services.async.cms.pages.landingpages.DraftServiceAsync
import com.hubspot.sdk.services.async.cms.pages.landingpages.FolderServiceAsync
import com.hubspot.sdk.services.async.cms.pages.landingpages.MultiLanguageServiceAsync
import com.hubspot.sdk.services.async.cms.pages.landingpages.RevisionServiceAsync
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

    fun abTest(): AbTestServiceAsync

    fun batch(): BatchServiceAsync

    fun draft(): DraftServiceAsync

    fun folders(): FolderServiceAsync

    fun multiLanguage(): MultiLanguageServiceAsync

    fun revisions(): RevisionServiceAsync

    /** Create a new landing page. */
    fun create(params: LandingPageCreateParams): CompletableFuture<PagesPage> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: LandingPageCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PagesPage>

    /** @see create */
    fun create(
        pagesPage: PagesPage,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PagesPage> =
        create(LandingPageCreateParams.builder().pagesPage(pagesPage).build(), requestOptions)

    /** @see create */
    fun create(pagesPage: PagesPage): CompletableFuture<PagesPage> =
        create(pagesPage, RequestOptions.none())

    /**
     * Sparse updates a single Landing Page object identified by the id in the path. You only need
     * to specify the column values that you are modifying.
     */
    fun update(objectId: String, params: LandingPageUpdateParams): CompletableFuture<PagesPage> =
        update(objectId, params, RequestOptions.none())

    /** @see update */
    fun update(
        objectId: String,
        params: LandingPageUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PagesPage> =
        update(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see update */
    fun update(params: LandingPageUpdateParams): CompletableFuture<PagesPage> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: LandingPageUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PagesPage>

    /**
     * Retrieve a list of landing pages in your HubSpot account. This endpoint allows you to filter
     * landing pages based on creation and update timestamps, sort them, and paginate through
     * results. You can also choose to include archived pages or specify certain properties to be
     * included in the response.
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
    fun clone(params: LandingPageCloneParams): CompletableFuture<PagesPage> =
        clone(params, RequestOptions.none())

    /** @see clone */
    fun clone(
        params: LandingPageCloneParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PagesPage>

    /** @see clone */
    fun clone(
        contentCloneRequestVNext: ContentCloneRequestVNext,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PagesPage> =
        clone(
            LandingPageCloneParams.builder()
                .contentCloneRequestVNext(contentCloneRequestVNext)
                .build(),
            requestOptions,
        )

    /** @see clone */
    fun clone(contentCloneRequestVNext: ContentCloneRequestVNext): CompletableFuture<PagesPage> =
        clone(contentCloneRequestVNext, RequestOptions.none())

    /** Retrieve a landing page, specified by its ID. */
    fun get(objectId: String): CompletableFuture<PagesPage> =
        get(objectId, LandingPageGetParams.none())

    /** @see get */
    fun get(
        objectId: String,
        params: LandingPageGetParams = LandingPageGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PagesPage> =
        get(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see get */
    fun get(
        objectId: String,
        params: LandingPageGetParams = LandingPageGetParams.none(),
    ): CompletableFuture<PagesPage> = get(objectId, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: LandingPageGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PagesPage>

    /** @see get */
    fun get(params: LandingPageGetParams): CompletableFuture<PagesPage> =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(objectId: String, requestOptions: RequestOptions): CompletableFuture<PagesPage> =
        get(objectId, LandingPageGetParams.none(), requestOptions)

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

        fun abTest(): AbTestServiceAsync.WithRawResponse

        fun batch(): BatchServiceAsync.WithRawResponse

        fun draft(): DraftServiceAsync.WithRawResponse

        fun folders(): FolderServiceAsync.WithRawResponse

        fun multiLanguage(): MultiLanguageServiceAsync.WithRawResponse

        fun revisions(): RevisionServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /cms/pages/2026-03/landing-pages`, but is otherwise
         * the same as [LandingPageServiceAsync.create].
         */
        fun create(params: LandingPageCreateParams): CompletableFuture<HttpResponseFor<PagesPage>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: LandingPageCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PagesPage>>

        /** @see create */
        fun create(
            pagesPage: PagesPage,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PagesPage>> =
            create(LandingPageCreateParams.builder().pagesPage(pagesPage).build(), requestOptions)

        /** @see create */
        fun create(pagesPage: PagesPage): CompletableFuture<HttpResponseFor<PagesPage>> =
            create(pagesPage, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `patch /cms/pages/2026-03/landing-pages/{objectId}`, but
         * is otherwise the same as [LandingPageServiceAsync.update].
         */
        fun update(
            objectId: String,
            params: LandingPageUpdateParams,
        ): CompletableFuture<HttpResponseFor<PagesPage>> =
            update(objectId, params, RequestOptions.none())

        /** @see update */
        fun update(
            objectId: String,
            params: LandingPageUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PagesPage>> =
            update(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see update */
        fun update(params: LandingPageUpdateParams): CompletableFuture<HttpResponseFor<PagesPage>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: LandingPageUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PagesPage>>

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
        fun clone(params: LandingPageCloneParams): CompletableFuture<HttpResponseFor<PagesPage>> =
            clone(params, RequestOptions.none())

        /** @see clone */
        fun clone(
            params: LandingPageCloneParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PagesPage>>

        /** @see clone */
        fun clone(
            contentCloneRequestVNext: ContentCloneRequestVNext,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PagesPage>> =
            clone(
                LandingPageCloneParams.builder()
                    .contentCloneRequestVNext(contentCloneRequestVNext)
                    .build(),
                requestOptions,
            )

        /** @see clone */
        fun clone(
            contentCloneRequestVNext: ContentCloneRequestVNext
        ): CompletableFuture<HttpResponseFor<PagesPage>> =
            clone(contentCloneRequestVNext, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `get /cms/pages/2026-03/landing-pages/{objectId}`, but is
         * otherwise the same as [LandingPageServiceAsync.get].
         */
        fun get(objectId: String): CompletableFuture<HttpResponseFor<PagesPage>> =
            get(objectId, LandingPageGetParams.none())

        /** @see get */
        fun get(
            objectId: String,
            params: LandingPageGetParams = LandingPageGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PagesPage>> =
            get(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see get */
        fun get(
            objectId: String,
            params: LandingPageGetParams = LandingPageGetParams.none(),
        ): CompletableFuture<HttpResponseFor<PagesPage>> =
            get(objectId, params, RequestOptions.none())

        /** @see get */
        fun get(
            params: LandingPageGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PagesPage>>

        /** @see get */
        fun get(params: LandingPageGetParams): CompletableFuture<HttpResponseFor<PagesPage>> =
            get(params, RequestOptions.none())

        /** @see get */
        fun get(
            objectId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PagesPage>> =
            get(objectId, LandingPageGetParams.none(), requestOptions)

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
    }
}
