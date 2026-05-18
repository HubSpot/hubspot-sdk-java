// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.blocking.cms.pages

import com.google.errorprone.annotations.MustBeClosed
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
import com.hubspot.sdk.models.cms.pages.sitepages.SitePageListPage
import com.hubspot.sdk.models.cms.pages.sitepages.SitePageListParams
import com.hubspot.sdk.models.cms.pages.sitepages.SitePageScheduleParams
import com.hubspot.sdk.models.cms.pages.sitepages.SitePageUpdateParams
import com.hubspot.sdk.services.blocking.cms.pages.sitepages.AbTestService
import com.hubspot.sdk.services.blocking.cms.pages.sitepages.BatchService
import com.hubspot.sdk.services.blocking.cms.pages.sitepages.DraftService
import com.hubspot.sdk.services.blocking.cms.pages.sitepages.MultiLanguageService
import com.hubspot.sdk.services.blocking.cms.pages.sitepages.RevisionService
import java.util.function.Consumer

interface SitePageService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SitePageService

    fun abTest(): AbTestService

    fun batch(): BatchService

    fun draft(): DraftService

    fun multiLanguage(): MultiLanguageService

    fun revisions(): RevisionService

    /** Create a new website page. */
    fun create(params: SitePageCreateParams): PagesPage = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: SitePageCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PagesPage

    /** @see create */
    fun create(
        pagesPage: PagesPage,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PagesPage =
        create(SitePageCreateParams.builder().pagesPage(pagesPage).build(), requestOptions)

    /** @see create */
    fun create(pagesPage: PagesPage): PagesPage = create(pagesPage, RequestOptions.none())

    /**
     * Partially updates a single website page, specified by its ID. You only need to specify the
     * column values that you are modifying.
     */
    fun update(objectId: String, params: SitePageUpdateParams): PagesPage =
        update(objectId, params, RequestOptions.none())

    /** @see update */
    fun update(
        objectId: String,
        params: SitePageUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PagesPage = update(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see update */
    fun update(params: SitePageUpdateParams): PagesPage = update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: SitePageUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PagesPage

    /**
     * Retrieve all website pages. Supports paging and filtering. This method would be useful for an
     * integration that examined these models and used an external service to suggest edits.
     */
    fun list(): SitePageListPage = list(SitePageListParams.none())

    /** @see list */
    fun list(
        params: SitePageListParams = SitePageListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SitePageListPage

    /** @see list */
    fun list(params: SitePageListParams = SitePageListParams.none()): SitePageListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): SitePageListPage =
        list(SitePageListParams.none(), requestOptions)

    /** Delete a website page, specified by its ID. */
    fun delete(objectId: String) = delete(objectId, SitePageDeleteParams.none())

    /** @see delete */
    fun delete(
        objectId: String,
        params: SitePageDeleteParams = SitePageDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see delete */
    fun delete(objectId: String, params: SitePageDeleteParams = SitePageDeleteParams.none()) =
        delete(objectId, params, RequestOptions.none())

    /** @see delete */
    fun delete(params: SitePageDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see delete */
    fun delete(params: SitePageDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(objectId: String, requestOptions: RequestOptions) =
        delete(objectId, SitePageDeleteParams.none(), requestOptions)

    /** Create a copy of an existing website page. */
    fun clone(params: SitePageCloneParams): PagesPage = clone(params, RequestOptions.none())

    /** @see clone */
    fun clone(
        params: SitePageCloneParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PagesPage

    /** @see clone */
    fun clone(
        contentCloneRequestVNext: ContentCloneRequestVNext,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PagesPage =
        clone(
            SitePageCloneParams.builder()
                .contentCloneRequestVNext(contentCloneRequestVNext)
                .build(),
            requestOptions,
        )

    /** @see clone */
    fun clone(contentCloneRequestVNext: ContentCloneRequestVNext): PagesPage =
        clone(contentCloneRequestVNext, RequestOptions.none())

    /** Retrieve a website page by its ID. */
    fun get(objectId: String): PagesPage = get(objectId, SitePageGetParams.none())

    /** @see get */
    fun get(
        objectId: String,
        params: SitePageGetParams = SitePageGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PagesPage = get(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see get */
    fun get(objectId: String, params: SitePageGetParams = SitePageGetParams.none()): PagesPage =
        get(objectId, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: SitePageGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PagesPage

    /** @see get */
    fun get(params: SitePageGetParams): PagesPage = get(params, RequestOptions.none())

    /** @see get */
    fun get(objectId: String, requestOptions: RequestOptions): PagesPage =
        get(objectId, SitePageGetParams.none(), requestOptions)

    /** Schedule a website page to published at a future time. */
    fun schedule(params: SitePageScheduleParams) = schedule(params, RequestOptions.none())

    /** @see schedule */
    fun schedule(
        params: SitePageScheduleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see schedule */
    fun schedule(
        contentScheduleRequestVNext: ContentScheduleRequestVNext,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) =
        schedule(
            SitePageScheduleParams.builder()
                .contentScheduleRequestVNext(contentScheduleRequestVNext)
                .build(),
            requestOptions,
        )

    /** @see schedule */
    fun schedule(contentScheduleRequestVNext: ContentScheduleRequestVNext) =
        schedule(contentScheduleRequestVNext, RequestOptions.none())

    /** A view of [SitePageService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): SitePageService.WithRawResponse

        fun abTest(): AbTestService.WithRawResponse

        fun batch(): BatchService.WithRawResponse

        fun draft(): DraftService.WithRawResponse

        fun multiLanguage(): MultiLanguageService.WithRawResponse

        fun revisions(): RevisionService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /cms/pages/2026-03/site-pages`, but is otherwise
         * the same as [SitePageService.create].
         */
        @MustBeClosed
        fun create(params: SitePageCreateParams): HttpResponseFor<PagesPage> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: SitePageCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PagesPage>

        /** @see create */
        @MustBeClosed
        fun create(
            pagesPage: PagesPage,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PagesPage> =
            create(SitePageCreateParams.builder().pagesPage(pagesPage).build(), requestOptions)

        /** @see create */
        @MustBeClosed
        fun create(pagesPage: PagesPage): HttpResponseFor<PagesPage> =
            create(pagesPage, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `patch /cms/pages/2026-03/site-pages/{objectId}`, but is
         * otherwise the same as [SitePageService.update].
         */
        @MustBeClosed
        fun update(objectId: String, params: SitePageUpdateParams): HttpResponseFor<PagesPage> =
            update(objectId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            objectId: String,
            params: SitePageUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PagesPage> =
            update(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: SitePageUpdateParams): HttpResponseFor<PagesPage> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: SitePageUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PagesPage>

        /**
         * Returns a raw HTTP response for `get /cms/pages/2026-03/site-pages`, but is otherwise the
         * same as [SitePageService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<SitePageListPage> = list(SitePageListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: SitePageListParams = SitePageListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SitePageListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: SitePageListParams = SitePageListParams.none()
        ): HttpResponseFor<SitePageListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<SitePageListPage> =
            list(SitePageListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /cms/pages/2026-03/site-pages/{objectId}`, but is
         * otherwise the same as [SitePageService.delete].
         */
        @MustBeClosed
        fun delete(objectId: String): HttpResponse = delete(objectId, SitePageDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            objectId: String,
            params: SitePageDeleteParams = SitePageDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            objectId: String,
            params: SitePageDeleteParams = SitePageDeleteParams.none(),
        ): HttpResponse = delete(objectId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: SitePageDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: SitePageDeleteParams): HttpResponse =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(objectId: String, requestOptions: RequestOptions): HttpResponse =
            delete(objectId, SitePageDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /cms/pages/2026-03/site-pages/clone`, but is
         * otherwise the same as [SitePageService.clone].
         */
        @MustBeClosed
        fun clone(params: SitePageCloneParams): HttpResponseFor<PagesPage> =
            clone(params, RequestOptions.none())

        /** @see clone */
        @MustBeClosed
        fun clone(
            params: SitePageCloneParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PagesPage>

        /** @see clone */
        @MustBeClosed
        fun clone(
            contentCloneRequestVNext: ContentCloneRequestVNext,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PagesPage> =
            clone(
                SitePageCloneParams.builder()
                    .contentCloneRequestVNext(contentCloneRequestVNext)
                    .build(),
                requestOptions,
            )

        /** @see clone */
        @MustBeClosed
        fun clone(contentCloneRequestVNext: ContentCloneRequestVNext): HttpResponseFor<PagesPage> =
            clone(contentCloneRequestVNext, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `get /cms/pages/2026-03/site-pages/{objectId}`, but is
         * otherwise the same as [SitePageService.get].
         */
        @MustBeClosed
        fun get(objectId: String): HttpResponseFor<PagesPage> =
            get(objectId, SitePageGetParams.none())

        /** @see get */
        @MustBeClosed
        fun get(
            objectId: String,
            params: SitePageGetParams = SitePageGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PagesPage> =
            get(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see get */
        @MustBeClosed
        fun get(
            objectId: String,
            params: SitePageGetParams = SitePageGetParams.none(),
        ): HttpResponseFor<PagesPage> = get(objectId, params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: SitePageGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PagesPage>

        /** @see get */
        @MustBeClosed
        fun get(params: SitePageGetParams): HttpResponseFor<PagesPage> =
            get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(objectId: String, requestOptions: RequestOptions): HttpResponseFor<PagesPage> =
            get(objectId, SitePageGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /cms/pages/2026-03/site-pages/schedule`, but is
         * otherwise the same as [SitePageService.schedule].
         */
        @MustBeClosed
        fun schedule(params: SitePageScheduleParams): HttpResponse =
            schedule(params, RequestOptions.none())

        /** @see schedule */
        @MustBeClosed
        fun schedule(
            params: SitePageScheduleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see schedule */
        @MustBeClosed
        fun schedule(
            contentScheduleRequestVNext: ContentScheduleRequestVNext,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            schedule(
                SitePageScheduleParams.builder()
                    .contentScheduleRequestVNext(contentScheduleRequestVNext)
                    .build(),
                requestOptions,
            )

        /** @see schedule */
        @MustBeClosed
        fun schedule(contentScheduleRequestVNext: ContentScheduleRequestVNext): HttpResponse =
            schedule(contentScheduleRequestVNext, RequestOptions.none())
    }
}
