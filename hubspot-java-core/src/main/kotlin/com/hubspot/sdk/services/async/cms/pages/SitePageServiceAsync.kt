// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.async.cms.pages

import com.hubspot.sdk.core.ClientOptions
import com.hubspot.sdk.core.RequestOptions
import com.hubspot.sdk.core.http.HttpResponse
import com.hubspot.sdk.core.http.HttpResponseFor
import com.hubspot.sdk.models.cms.ContentCloneRequestVNext
import com.hubspot.sdk.models.cms.ContentScheduleRequestVNext
import com.hubspot.sdk.models.cms.pages.PagesPage
import com.hubspot.sdk.models.cms.pages.sitepages.SitePageCloneParams
import com.hubspot.sdk.models.cms.pages.sitepages.SitePageCreateParams
import com.hubspot.sdk.models.cms.pages.sitepages.SitePageDeleteParams
import com.hubspot.sdk.models.cms.pages.sitepages.SitePageGetParams
import com.hubspot.sdk.models.cms.pages.sitepages.SitePageListPageAsync
import com.hubspot.sdk.models.cms.pages.sitepages.SitePageListParams
import com.hubspot.sdk.models.cms.pages.sitepages.SitePageScheduleParams
import com.hubspot.sdk.models.cms.pages.sitepages.SitePageUpdateParams
import com.hubspot.sdk.services.async.cms.pages.sitepages.AbTestServiceAsync
import com.hubspot.sdk.services.async.cms.pages.sitepages.BatchServiceAsync
import com.hubspot.sdk.services.async.cms.pages.sitepages.DraftServiceAsync
import com.hubspot.sdk.services.async.cms.pages.sitepages.MultiLanguageServiceAsync
import com.hubspot.sdk.services.async.cms.pages.sitepages.RevisionServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface SitePageServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SitePageServiceAsync

    fun abTest(): AbTestServiceAsync

    fun batch(): BatchServiceAsync

    fun draft(): DraftServiceAsync

    fun multiLanguage(): MultiLanguageServiceAsync

    fun revisions(): RevisionServiceAsync

    /** Create a new website page. */
    fun create(params: SitePageCreateParams): CompletableFuture<PagesPage> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: SitePageCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PagesPage>

    /** @see create */
    fun create(
        pagesPage: PagesPage,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PagesPage> =
        create(SitePageCreateParams.builder().pagesPage(pagesPage).build(), requestOptions)

    /** @see create */
    fun create(pagesPage: PagesPage): CompletableFuture<PagesPage> =
        create(pagesPage, RequestOptions.none())

    /**
     * Partially updates a single website page, specified by its ID. You only need to specify the
     * column values that you are modifying.
     */
    fun update(objectId: String, params: SitePageUpdateParams): CompletableFuture<PagesPage> =
        update(objectId, params, RequestOptions.none())

    /** @see update */
    fun update(
        objectId: String,
        params: SitePageUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PagesPage> =
        update(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see update */
    fun update(params: SitePageUpdateParams): CompletableFuture<PagesPage> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: SitePageUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PagesPage>

    /**
     * Retrieve all website pages. Supports paging and filtering. This method would be useful for an
     * integration that examined these models and used an external service to suggest edits.
     */
    fun list(): CompletableFuture<SitePageListPageAsync> = list(SitePageListParams.none())

    /** @see list */
    fun list(
        params: SitePageListParams = SitePageListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SitePageListPageAsync>

    /** @see list */
    fun list(
        params: SitePageListParams = SitePageListParams.none()
    ): CompletableFuture<SitePageListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<SitePageListPageAsync> =
        list(SitePageListParams.none(), requestOptions)

    /** Delete a website page, specified by its ID. */
    fun delete(objectId: String): CompletableFuture<Void?> =
        delete(objectId, SitePageDeleteParams.none())

    /** @see delete */
    fun delete(
        objectId: String,
        params: SitePageDeleteParams = SitePageDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        delete(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see delete */
    fun delete(
        objectId: String,
        params: SitePageDeleteParams = SitePageDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(objectId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: SitePageDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: SitePageDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(objectId: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(objectId, SitePageDeleteParams.none(), requestOptions)

    /** Create a copy of an existing website page. */
    fun clone(params: SitePageCloneParams): CompletableFuture<PagesPage> =
        clone(params, RequestOptions.none())

    /** @see clone */
    fun clone(
        params: SitePageCloneParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PagesPage>

    /** @see clone */
    fun clone(
        contentCloneRequestVNext: ContentCloneRequestVNext,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PagesPage> =
        clone(
            SitePageCloneParams.builder()
                .contentCloneRequestVNext(contentCloneRequestVNext)
                .build(),
            requestOptions,
        )

    /** @see clone */
    fun clone(contentCloneRequestVNext: ContentCloneRequestVNext): CompletableFuture<PagesPage> =
        clone(contentCloneRequestVNext, RequestOptions.none())

    /** Retrieve a website page by its ID. */
    fun get(objectId: String): CompletableFuture<PagesPage> =
        get(objectId, SitePageGetParams.none())

    /** @see get */
    fun get(
        objectId: String,
        params: SitePageGetParams = SitePageGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PagesPage> =
        get(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see get */
    fun get(
        objectId: String,
        params: SitePageGetParams = SitePageGetParams.none(),
    ): CompletableFuture<PagesPage> = get(objectId, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: SitePageGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PagesPage>

    /** @see get */
    fun get(params: SitePageGetParams): CompletableFuture<PagesPage> =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(objectId: String, requestOptions: RequestOptions): CompletableFuture<PagesPage> =
        get(objectId, SitePageGetParams.none(), requestOptions)

    /** Schedule a website page to published at a future time. */
    fun schedule(params: SitePageScheduleParams): CompletableFuture<Void?> =
        schedule(params, RequestOptions.none())

    /** @see schedule */
    fun schedule(
        params: SitePageScheduleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see schedule */
    fun schedule(
        contentScheduleRequestVNext: ContentScheduleRequestVNext,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        schedule(
            SitePageScheduleParams.builder()
                .contentScheduleRequestVNext(contentScheduleRequestVNext)
                .build(),
            requestOptions,
        )

    /** @see schedule */
    fun schedule(
        contentScheduleRequestVNext: ContentScheduleRequestVNext
    ): CompletableFuture<Void?> = schedule(contentScheduleRequestVNext, RequestOptions.none())

    /**
     * A view of [SitePageServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SitePageServiceAsync.WithRawResponse

        fun abTest(): AbTestServiceAsync.WithRawResponse

        fun batch(): BatchServiceAsync.WithRawResponse

        fun draft(): DraftServiceAsync.WithRawResponse

        fun multiLanguage(): MultiLanguageServiceAsync.WithRawResponse

        fun revisions(): RevisionServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /cms/pages/2026-03/site-pages`, but is otherwise
         * the same as [SitePageServiceAsync.create].
         */
        fun create(params: SitePageCreateParams): CompletableFuture<HttpResponseFor<PagesPage>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: SitePageCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PagesPage>>

        /** @see create */
        fun create(
            pagesPage: PagesPage,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PagesPage>> =
            create(SitePageCreateParams.builder().pagesPage(pagesPage).build(), requestOptions)

        /** @see create */
        fun create(pagesPage: PagesPage): CompletableFuture<HttpResponseFor<PagesPage>> =
            create(pagesPage, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `patch /cms/pages/2026-03/site-pages/{objectId}`, but is
         * otherwise the same as [SitePageServiceAsync.update].
         */
        fun update(
            objectId: String,
            params: SitePageUpdateParams,
        ): CompletableFuture<HttpResponseFor<PagesPage>> =
            update(objectId, params, RequestOptions.none())

        /** @see update */
        fun update(
            objectId: String,
            params: SitePageUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PagesPage>> =
            update(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see update */
        fun update(params: SitePageUpdateParams): CompletableFuture<HttpResponseFor<PagesPage>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: SitePageUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PagesPage>>

        /**
         * Returns a raw HTTP response for `get /cms/pages/2026-03/site-pages`, but is otherwise the
         * same as [SitePageServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<SitePageListPageAsync>> =
            list(SitePageListParams.none())

        /** @see list */
        fun list(
            params: SitePageListParams = SitePageListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SitePageListPageAsync>>

        /** @see list */
        fun list(
            params: SitePageListParams = SitePageListParams.none()
        ): CompletableFuture<HttpResponseFor<SitePageListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<SitePageListPageAsync>> =
            list(SitePageListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /cms/pages/2026-03/site-pages/{objectId}`, but is
         * otherwise the same as [SitePageServiceAsync.delete].
         */
        fun delete(objectId: String): CompletableFuture<HttpResponse> =
            delete(objectId, SitePageDeleteParams.none())

        /** @see delete */
        fun delete(
            objectId: String,
            params: SitePageDeleteParams = SitePageDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see delete */
        fun delete(
            objectId: String,
            params: SitePageDeleteParams = SitePageDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(objectId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: SitePageDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: SitePageDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            objectId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            delete(objectId, SitePageDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /cms/pages/2026-03/site-pages/clone`, but is
         * otherwise the same as [SitePageServiceAsync.clone].
         */
        fun clone(params: SitePageCloneParams): CompletableFuture<HttpResponseFor<PagesPage>> =
            clone(params, RequestOptions.none())

        /** @see clone */
        fun clone(
            params: SitePageCloneParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PagesPage>>

        /** @see clone */
        fun clone(
            contentCloneRequestVNext: ContentCloneRequestVNext,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PagesPage>> =
            clone(
                SitePageCloneParams.builder()
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
         * Returns a raw HTTP response for `get /cms/pages/2026-03/site-pages/{objectId}`, but is
         * otherwise the same as [SitePageServiceAsync.get].
         */
        fun get(objectId: String): CompletableFuture<HttpResponseFor<PagesPage>> =
            get(objectId, SitePageGetParams.none())

        /** @see get */
        fun get(
            objectId: String,
            params: SitePageGetParams = SitePageGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PagesPage>> =
            get(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see get */
        fun get(
            objectId: String,
            params: SitePageGetParams = SitePageGetParams.none(),
        ): CompletableFuture<HttpResponseFor<PagesPage>> =
            get(objectId, params, RequestOptions.none())

        /** @see get */
        fun get(
            params: SitePageGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PagesPage>>

        /** @see get */
        fun get(params: SitePageGetParams): CompletableFuture<HttpResponseFor<PagesPage>> =
            get(params, RequestOptions.none())

        /** @see get */
        fun get(
            objectId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PagesPage>> =
            get(objectId, SitePageGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /cms/pages/2026-03/site-pages/schedule`, but is
         * otherwise the same as [SitePageServiceAsync.schedule].
         */
        fun schedule(params: SitePageScheduleParams): CompletableFuture<HttpResponse> =
            schedule(params, RequestOptions.none())

        /** @see schedule */
        fun schedule(
            params: SitePageScheduleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see schedule */
        fun schedule(
            contentScheduleRequestVNext: ContentScheduleRequestVNext,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            schedule(
                SitePageScheduleParams.builder()
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
