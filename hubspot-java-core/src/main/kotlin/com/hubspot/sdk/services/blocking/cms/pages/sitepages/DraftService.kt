// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.blocking.cms.pages.sitepages

import com.google.errorprone.annotations.MustBeClosed
import com.hubspot.sdk.core.ClientOptions
import com.hubspot.sdk.core.RequestOptions
import com.hubspot.sdk.core.http.HttpResponse
import com.hubspot.sdk.core.http.HttpResponseFor
import com.hubspot.sdk.models.cms.pages.PagesPage
import com.hubspot.sdk.models.cms.pages.sitepages.draft.DraftGetDraftParams
import com.hubspot.sdk.models.cms.pages.sitepages.draft.DraftPublishDraftParams
import com.hubspot.sdk.models.cms.pages.sitepages.draft.DraftResetSitePageDraftParams
import com.hubspot.sdk.models.cms.pages.sitepages.draft.DraftUpdateDraftParams
import java.util.function.Consumer

interface DraftService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): DraftService

    /** Retrieve the full draft version of a website page, specified by its ID. */
    fun getDraft(objectId: String): PagesPage = getDraft(objectId, DraftGetDraftParams.none())

    /** @see getDraft */
    fun getDraft(
        objectId: String,
        params: DraftGetDraftParams = DraftGetDraftParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PagesPage = getDraft(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see getDraft */
    fun getDraft(
        objectId: String,
        params: DraftGetDraftParams = DraftGetDraftParams.none(),
    ): PagesPage = getDraft(objectId, params, RequestOptions.none())

    /** @see getDraft */
    fun getDraft(
        params: DraftGetDraftParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PagesPage

    /** @see getDraft */
    fun getDraft(params: DraftGetDraftParams): PagesPage = getDraft(params, RequestOptions.none())

    /** @see getDraft */
    fun getDraft(objectId: String, requestOptions: RequestOptions): PagesPage =
        getDraft(objectId, DraftGetDraftParams.none(), requestOptions)

    /**
     * Take any changes from the draft version of the website page and apply them to the live
     * version.
     */
    fun publishDraft(objectId: String) = publishDraft(objectId, DraftPublishDraftParams.none())

    /** @see publishDraft */
    fun publishDraft(
        objectId: String,
        params: DraftPublishDraftParams = DraftPublishDraftParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = publishDraft(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see publishDraft */
    fun publishDraft(
        objectId: String,
        params: DraftPublishDraftParams = DraftPublishDraftParams.none(),
    ) = publishDraft(objectId, params, RequestOptions.none())

    /** @see publishDraft */
    fun publishDraft(
        params: DraftPublishDraftParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see publishDraft */
    fun publishDraft(params: DraftPublishDraftParams) = publishDraft(params, RequestOptions.none())

    /** @see publishDraft */
    fun publishDraft(objectId: String, requestOptions: RequestOptions) =
        publishDraft(objectId, DraftPublishDraftParams.none(), requestOptions)

    /** Discards any edits and resets the draft to match the live version. */
    fun resetSitePageDraft(objectId: String) =
        resetSitePageDraft(objectId, DraftResetSitePageDraftParams.none())

    /** @see resetSitePageDraft */
    fun resetSitePageDraft(
        objectId: String,
        params: DraftResetSitePageDraftParams = DraftResetSitePageDraftParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = resetSitePageDraft(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see resetSitePageDraft */
    fun resetSitePageDraft(
        objectId: String,
        params: DraftResetSitePageDraftParams = DraftResetSitePageDraftParams.none(),
    ) = resetSitePageDraft(objectId, params, RequestOptions.none())

    /** @see resetSitePageDraft */
    fun resetSitePageDraft(
        params: DraftResetSitePageDraftParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see resetSitePageDraft */
    fun resetSitePageDraft(params: DraftResetSitePageDraftParams) =
        resetSitePageDraft(params, RequestOptions.none())

    /** @see resetSitePageDraft */
    fun resetSitePageDraft(objectId: String, requestOptions: RequestOptions) =
        resetSitePageDraft(objectId, DraftResetSitePageDraftParams.none(), requestOptions)

    /**
     * Partially update the draft version of a website page, specified by page ID. You only need to
     * specify the values for the details that you're modifying.
     */
    fun updateDraft(objectId: String, params: DraftUpdateDraftParams): PagesPage =
        updateDraft(objectId, params, RequestOptions.none())

    /** @see updateDraft */
    fun updateDraft(
        objectId: String,
        params: DraftUpdateDraftParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PagesPage = updateDraft(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see updateDraft */
    fun updateDraft(params: DraftUpdateDraftParams): PagesPage =
        updateDraft(params, RequestOptions.none())

    /** @see updateDraft */
    fun updateDraft(
        params: DraftUpdateDraftParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PagesPage

    /** A view of [DraftService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): DraftService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /cms/pages/2026-03/site-pages/{objectId}/draft`, but
         * is otherwise the same as [DraftService.getDraft].
         */
        @MustBeClosed
        fun getDraft(objectId: String): HttpResponseFor<PagesPage> =
            getDraft(objectId, DraftGetDraftParams.none())

        /** @see getDraft */
        @MustBeClosed
        fun getDraft(
            objectId: String,
            params: DraftGetDraftParams = DraftGetDraftParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PagesPage> =
            getDraft(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see getDraft */
        @MustBeClosed
        fun getDraft(
            objectId: String,
            params: DraftGetDraftParams = DraftGetDraftParams.none(),
        ): HttpResponseFor<PagesPage> = getDraft(objectId, params, RequestOptions.none())

        /** @see getDraft */
        @MustBeClosed
        fun getDraft(
            params: DraftGetDraftParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PagesPage>

        /** @see getDraft */
        @MustBeClosed
        fun getDraft(params: DraftGetDraftParams): HttpResponseFor<PagesPage> =
            getDraft(params, RequestOptions.none())

        /** @see getDraft */
        @MustBeClosed
        fun getDraft(objectId: String, requestOptions: RequestOptions): HttpResponseFor<PagesPage> =
            getDraft(objectId, DraftGetDraftParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /cms/pages/2026-03/site-pages/{objectId}/draft/push-live`, but is otherwise the same as
         * [DraftService.publishDraft].
         */
        @MustBeClosed
        fun publishDraft(objectId: String): HttpResponse =
            publishDraft(objectId, DraftPublishDraftParams.none())

        /** @see publishDraft */
        @MustBeClosed
        fun publishDraft(
            objectId: String,
            params: DraftPublishDraftParams = DraftPublishDraftParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            publishDraft(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see publishDraft */
        @MustBeClosed
        fun publishDraft(
            objectId: String,
            params: DraftPublishDraftParams = DraftPublishDraftParams.none(),
        ): HttpResponse = publishDraft(objectId, params, RequestOptions.none())

        /** @see publishDraft */
        @MustBeClosed
        fun publishDraft(
            params: DraftPublishDraftParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see publishDraft */
        @MustBeClosed
        fun publishDraft(params: DraftPublishDraftParams): HttpResponse =
            publishDraft(params, RequestOptions.none())

        /** @see publishDraft */
        @MustBeClosed
        fun publishDraft(objectId: String, requestOptions: RequestOptions): HttpResponse =
            publishDraft(objectId, DraftPublishDraftParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /cms/pages/2026-03/site-pages/{objectId}/draft/reset`, but is otherwise the same as
         * [DraftService.resetSitePageDraft].
         */
        @MustBeClosed
        fun resetSitePageDraft(objectId: String): HttpResponse =
            resetSitePageDraft(objectId, DraftResetSitePageDraftParams.none())

        /** @see resetSitePageDraft */
        @MustBeClosed
        fun resetSitePageDraft(
            objectId: String,
            params: DraftResetSitePageDraftParams = DraftResetSitePageDraftParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            resetSitePageDraft(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see resetSitePageDraft */
        @MustBeClosed
        fun resetSitePageDraft(
            objectId: String,
            params: DraftResetSitePageDraftParams = DraftResetSitePageDraftParams.none(),
        ): HttpResponse = resetSitePageDraft(objectId, params, RequestOptions.none())

        /** @see resetSitePageDraft */
        @MustBeClosed
        fun resetSitePageDraft(
            params: DraftResetSitePageDraftParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see resetSitePageDraft */
        @MustBeClosed
        fun resetSitePageDraft(params: DraftResetSitePageDraftParams): HttpResponse =
            resetSitePageDraft(params, RequestOptions.none())

        /** @see resetSitePageDraft */
        @MustBeClosed
        fun resetSitePageDraft(objectId: String, requestOptions: RequestOptions): HttpResponse =
            resetSitePageDraft(objectId, DraftResetSitePageDraftParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /cms/pages/2026-03/site-pages/{objectId}/draft`,
         * but is otherwise the same as [DraftService.updateDraft].
         */
        @MustBeClosed
        fun updateDraft(
            objectId: String,
            params: DraftUpdateDraftParams,
        ): HttpResponseFor<PagesPage> = updateDraft(objectId, params, RequestOptions.none())

        /** @see updateDraft */
        @MustBeClosed
        fun updateDraft(
            objectId: String,
            params: DraftUpdateDraftParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PagesPage> =
            updateDraft(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see updateDraft */
        @MustBeClosed
        fun updateDraft(params: DraftUpdateDraftParams): HttpResponseFor<PagesPage> =
            updateDraft(params, RequestOptions.none())

        /** @see updateDraft */
        @MustBeClosed
        fun updateDraft(
            params: DraftUpdateDraftParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PagesPage>
    }
}
