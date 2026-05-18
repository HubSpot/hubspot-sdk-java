// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.async.cms.pages.sitepages

import com.hubspot.sdk.core.ClientOptions
import com.hubspot.sdk.core.RequestOptions
import com.hubspot.sdk.core.http.HttpResponse
import com.hubspot.sdk.core.http.HttpResponseFor
import com.hubspot.sdk.models.cms.pages.PagesPage
import com.hubspot.sdk.models.cms.pages.sitepages.draft.DraftGetDraftParams
import com.hubspot.sdk.models.cms.pages.sitepages.draft.DraftPublishDraftParams
import com.hubspot.sdk.models.cms.pages.sitepages.draft.DraftResetSitePageDraftParams
import com.hubspot.sdk.models.cms.pages.sitepages.draft.DraftUpdateDraftParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface DraftServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): DraftServiceAsync

    /** Retrieve the full draft version of a website page, specified by its ID. */
    fun getDraft(objectId: String): CompletableFuture<PagesPage> =
        getDraft(objectId, DraftGetDraftParams.none())

    /** @see getDraft */
    fun getDraft(
        objectId: String,
        params: DraftGetDraftParams = DraftGetDraftParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PagesPage> =
        getDraft(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see getDraft */
    fun getDraft(
        objectId: String,
        params: DraftGetDraftParams = DraftGetDraftParams.none(),
    ): CompletableFuture<PagesPage> = getDraft(objectId, params, RequestOptions.none())

    /** @see getDraft */
    fun getDraft(
        params: DraftGetDraftParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PagesPage>

    /** @see getDraft */
    fun getDraft(params: DraftGetDraftParams): CompletableFuture<PagesPage> =
        getDraft(params, RequestOptions.none())

    /** @see getDraft */
    fun getDraft(objectId: String, requestOptions: RequestOptions): CompletableFuture<PagesPage> =
        getDraft(objectId, DraftGetDraftParams.none(), requestOptions)

    /**
     * Take any changes from the draft version of the website page and apply them to the live
     * version.
     */
    fun publishDraft(objectId: String): CompletableFuture<Void?> =
        publishDraft(objectId, DraftPublishDraftParams.none())

    /** @see publishDraft */
    fun publishDraft(
        objectId: String,
        params: DraftPublishDraftParams = DraftPublishDraftParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        publishDraft(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see publishDraft */
    fun publishDraft(
        objectId: String,
        params: DraftPublishDraftParams = DraftPublishDraftParams.none(),
    ): CompletableFuture<Void?> = publishDraft(objectId, params, RequestOptions.none())

    /** @see publishDraft */
    fun publishDraft(
        params: DraftPublishDraftParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see publishDraft */
    fun publishDraft(params: DraftPublishDraftParams): CompletableFuture<Void?> =
        publishDraft(params, RequestOptions.none())

    /** @see publishDraft */
    fun publishDraft(objectId: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        publishDraft(objectId, DraftPublishDraftParams.none(), requestOptions)

    /** Discards any edits and resets the draft to match the live version. */
    fun resetSitePageDraft(objectId: String): CompletableFuture<Void?> =
        resetSitePageDraft(objectId, DraftResetSitePageDraftParams.none())

    /** @see resetSitePageDraft */
    fun resetSitePageDraft(
        objectId: String,
        params: DraftResetSitePageDraftParams = DraftResetSitePageDraftParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        resetSitePageDraft(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see resetSitePageDraft */
    fun resetSitePageDraft(
        objectId: String,
        params: DraftResetSitePageDraftParams = DraftResetSitePageDraftParams.none(),
    ): CompletableFuture<Void?> = resetSitePageDraft(objectId, params, RequestOptions.none())

    /** @see resetSitePageDraft */
    fun resetSitePageDraft(
        params: DraftResetSitePageDraftParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see resetSitePageDraft */
    fun resetSitePageDraft(params: DraftResetSitePageDraftParams): CompletableFuture<Void?> =
        resetSitePageDraft(params, RequestOptions.none())

    /** @see resetSitePageDraft */
    fun resetSitePageDraft(
        objectId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        resetSitePageDraft(objectId, DraftResetSitePageDraftParams.none(), requestOptions)

    /**
     * Partially update the draft version of a website page, specified by page ID. You only need to
     * specify the values for the details that you're modifying.
     */
    fun updateDraft(
        objectId: String,
        params: DraftUpdateDraftParams,
    ): CompletableFuture<PagesPage> = updateDraft(objectId, params, RequestOptions.none())

    /** @see updateDraft */
    fun updateDraft(
        objectId: String,
        params: DraftUpdateDraftParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PagesPage> =
        updateDraft(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see updateDraft */
    fun updateDraft(params: DraftUpdateDraftParams): CompletableFuture<PagesPage> =
        updateDraft(params, RequestOptions.none())

    /** @see updateDraft */
    fun updateDraft(
        params: DraftUpdateDraftParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PagesPage>

    /** A view of [DraftServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): DraftServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /cms/pages/2026-03/site-pages/{objectId}/draft`, but
         * is otherwise the same as [DraftServiceAsync.getDraft].
         */
        fun getDraft(objectId: String): CompletableFuture<HttpResponseFor<PagesPage>> =
            getDraft(objectId, DraftGetDraftParams.none())

        /** @see getDraft */
        fun getDraft(
            objectId: String,
            params: DraftGetDraftParams = DraftGetDraftParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PagesPage>> =
            getDraft(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see getDraft */
        fun getDraft(
            objectId: String,
            params: DraftGetDraftParams = DraftGetDraftParams.none(),
        ): CompletableFuture<HttpResponseFor<PagesPage>> =
            getDraft(objectId, params, RequestOptions.none())

        /** @see getDraft */
        fun getDraft(
            params: DraftGetDraftParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PagesPage>>

        /** @see getDraft */
        fun getDraft(params: DraftGetDraftParams): CompletableFuture<HttpResponseFor<PagesPage>> =
            getDraft(params, RequestOptions.none())

        /** @see getDraft */
        fun getDraft(
            objectId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PagesPage>> =
            getDraft(objectId, DraftGetDraftParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /cms/pages/2026-03/site-pages/{objectId}/draft/push-live`, but is otherwise the same as
         * [DraftServiceAsync.publishDraft].
         */
        fun publishDraft(objectId: String): CompletableFuture<HttpResponse> =
            publishDraft(objectId, DraftPublishDraftParams.none())

        /** @see publishDraft */
        fun publishDraft(
            objectId: String,
            params: DraftPublishDraftParams = DraftPublishDraftParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            publishDraft(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see publishDraft */
        fun publishDraft(
            objectId: String,
            params: DraftPublishDraftParams = DraftPublishDraftParams.none(),
        ): CompletableFuture<HttpResponse> = publishDraft(objectId, params, RequestOptions.none())

        /** @see publishDraft */
        fun publishDraft(
            params: DraftPublishDraftParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see publishDraft */
        fun publishDraft(params: DraftPublishDraftParams): CompletableFuture<HttpResponse> =
            publishDraft(params, RequestOptions.none())

        /** @see publishDraft */
        fun publishDraft(
            objectId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            publishDraft(objectId, DraftPublishDraftParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /cms/pages/2026-03/site-pages/{objectId}/draft/reset`, but is otherwise the same as
         * [DraftServiceAsync.resetSitePageDraft].
         */
        fun resetSitePageDraft(objectId: String): CompletableFuture<HttpResponse> =
            resetSitePageDraft(objectId, DraftResetSitePageDraftParams.none())

        /** @see resetSitePageDraft */
        fun resetSitePageDraft(
            objectId: String,
            params: DraftResetSitePageDraftParams = DraftResetSitePageDraftParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            resetSitePageDraft(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see resetSitePageDraft */
        fun resetSitePageDraft(
            objectId: String,
            params: DraftResetSitePageDraftParams = DraftResetSitePageDraftParams.none(),
        ): CompletableFuture<HttpResponse> =
            resetSitePageDraft(objectId, params, RequestOptions.none())

        /** @see resetSitePageDraft */
        fun resetSitePageDraft(
            params: DraftResetSitePageDraftParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see resetSitePageDraft */
        fun resetSitePageDraft(
            params: DraftResetSitePageDraftParams
        ): CompletableFuture<HttpResponse> = resetSitePageDraft(params, RequestOptions.none())

        /** @see resetSitePageDraft */
        fun resetSitePageDraft(
            objectId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            resetSitePageDraft(objectId, DraftResetSitePageDraftParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /cms/pages/2026-03/site-pages/{objectId}/draft`,
         * but is otherwise the same as [DraftServiceAsync.updateDraft].
         */
        fun updateDraft(
            objectId: String,
            params: DraftUpdateDraftParams,
        ): CompletableFuture<HttpResponseFor<PagesPage>> =
            updateDraft(objectId, params, RequestOptions.none())

        /** @see updateDraft */
        fun updateDraft(
            objectId: String,
            params: DraftUpdateDraftParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PagesPage>> =
            updateDraft(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see updateDraft */
        fun updateDraft(
            params: DraftUpdateDraftParams
        ): CompletableFuture<HttpResponseFor<PagesPage>> =
            updateDraft(params, RequestOptions.none())

        /** @see updateDraft */
        fun updateDraft(
            params: DraftUpdateDraftParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PagesPage>>
    }
}
