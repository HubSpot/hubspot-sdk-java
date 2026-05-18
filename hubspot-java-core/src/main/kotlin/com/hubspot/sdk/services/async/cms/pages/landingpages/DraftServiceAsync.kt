// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.async.cms.pages.landingpages

import com.hubspot.sdk.core.ClientOptions
import com.hubspot.sdk.core.RequestOptions
import com.hubspot.sdk.core.http.HttpResponse
import com.hubspot.sdk.core.http.HttpResponseFor
import com.hubspot.sdk.models.cms.pages.PagesPage
import com.hubspot.sdk.models.cms.pages.landingpages.draft.DraftGetParams
import com.hubspot.sdk.models.cms.pages.landingpages.draft.DraftPushLiveParams
import com.hubspot.sdk.models.cms.pages.landingpages.draft.DraftResetParams
import com.hubspot.sdk.models.cms.pages.landingpages.draft.DraftUpdateParams
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

    /**
     * Partially updates the draft version of a single landing page, specified by its ID. You only
     * need to specify the column values that you are modifying.
     */
    fun update(objectId: String, params: DraftUpdateParams): CompletableFuture<PagesPage> =
        update(objectId, params, RequestOptions.none())

    /** @see update */
    fun update(
        objectId: String,
        params: DraftUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PagesPage> =
        update(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see update */
    fun update(params: DraftUpdateParams): CompletableFuture<PagesPage> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: DraftUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PagesPage>

    /** Retrieve the full draft version of a landing page, specified by page ID. */
    fun get(objectId: String): CompletableFuture<PagesPage> = get(objectId, DraftGetParams.none())

    /** @see get */
    fun get(
        objectId: String,
        params: DraftGetParams = DraftGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PagesPage> =
        get(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see get */
    fun get(
        objectId: String,
        params: DraftGetParams = DraftGetParams.none(),
    ): CompletableFuture<PagesPage> = get(objectId, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: DraftGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PagesPage>

    /** @see get */
    fun get(params: DraftGetParams): CompletableFuture<PagesPage> =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(objectId: String, requestOptions: RequestOptions): CompletableFuture<PagesPage> =
        get(objectId, DraftGetParams.none(), requestOptions)

    /**
     * Take any changes from the draft version of the Landing Page and apply them to the live
     * version.
     */
    fun pushLive(objectId: String): CompletableFuture<Void?> =
        pushLive(objectId, DraftPushLiveParams.none())

    /** @see pushLive */
    fun pushLive(
        objectId: String,
        params: DraftPushLiveParams = DraftPushLiveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        pushLive(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see pushLive */
    fun pushLive(
        objectId: String,
        params: DraftPushLiveParams = DraftPushLiveParams.none(),
    ): CompletableFuture<Void?> = pushLive(objectId, params, RequestOptions.none())

    /** @see pushLive */
    fun pushLive(
        params: DraftPushLiveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see pushLive */
    fun pushLive(params: DraftPushLiveParams): CompletableFuture<Void?> =
        pushLive(params, RequestOptions.none())

    /** @see pushLive */
    fun pushLive(objectId: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        pushLive(objectId, DraftPushLiveParams.none(), requestOptions)

    /** Discards any edits and resets the draft to match the live version. */
    fun reset(objectId: String): CompletableFuture<Void?> = reset(objectId, DraftResetParams.none())

    /** @see reset */
    fun reset(
        objectId: String,
        params: DraftResetParams = DraftResetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        reset(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see reset */
    fun reset(
        objectId: String,
        params: DraftResetParams = DraftResetParams.none(),
    ): CompletableFuture<Void?> = reset(objectId, params, RequestOptions.none())

    /** @see reset */
    fun reset(
        params: DraftResetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see reset */
    fun reset(params: DraftResetParams): CompletableFuture<Void?> =
        reset(params, RequestOptions.none())

    /** @see reset */
    fun reset(objectId: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        reset(objectId, DraftResetParams.none(), requestOptions)

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
         * Returns a raw HTTP response for `patch
         * /cms/pages/2026-03/landing-pages/{objectId}/draft`, but is otherwise the same as
         * [DraftServiceAsync.update].
         */
        fun update(
            objectId: String,
            params: DraftUpdateParams,
        ): CompletableFuture<HttpResponseFor<PagesPage>> =
            update(objectId, params, RequestOptions.none())

        /** @see update */
        fun update(
            objectId: String,
            params: DraftUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PagesPage>> =
            update(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see update */
        fun update(params: DraftUpdateParams): CompletableFuture<HttpResponseFor<PagesPage>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: DraftUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PagesPage>>

        /**
         * Returns a raw HTTP response for `get /cms/pages/2026-03/landing-pages/{objectId}/draft`,
         * but is otherwise the same as [DraftServiceAsync.get].
         */
        fun get(objectId: String): CompletableFuture<HttpResponseFor<PagesPage>> =
            get(objectId, DraftGetParams.none())

        /** @see get */
        fun get(
            objectId: String,
            params: DraftGetParams = DraftGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PagesPage>> =
            get(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see get */
        fun get(
            objectId: String,
            params: DraftGetParams = DraftGetParams.none(),
        ): CompletableFuture<HttpResponseFor<PagesPage>> =
            get(objectId, params, RequestOptions.none())

        /** @see get */
        fun get(
            params: DraftGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PagesPage>>

        /** @see get */
        fun get(params: DraftGetParams): CompletableFuture<HttpResponseFor<PagesPage>> =
            get(params, RequestOptions.none())

        /** @see get */
        fun get(
            objectId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PagesPage>> =
            get(objectId, DraftGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /cms/pages/2026-03/landing-pages/{objectId}/draft/push-live`, but is otherwise the same
         * as [DraftServiceAsync.pushLive].
         */
        fun pushLive(objectId: String): CompletableFuture<HttpResponse> =
            pushLive(objectId, DraftPushLiveParams.none())

        /** @see pushLive */
        fun pushLive(
            objectId: String,
            params: DraftPushLiveParams = DraftPushLiveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            pushLive(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see pushLive */
        fun pushLive(
            objectId: String,
            params: DraftPushLiveParams = DraftPushLiveParams.none(),
        ): CompletableFuture<HttpResponse> = pushLive(objectId, params, RequestOptions.none())

        /** @see pushLive */
        fun pushLive(
            params: DraftPushLiveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see pushLive */
        fun pushLive(params: DraftPushLiveParams): CompletableFuture<HttpResponse> =
            pushLive(params, RequestOptions.none())

        /** @see pushLive */
        fun pushLive(
            objectId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            pushLive(objectId, DraftPushLiveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /cms/pages/2026-03/landing-pages/{objectId}/draft/reset`, but is otherwise the same as
         * [DraftServiceAsync.reset].
         */
        fun reset(objectId: String): CompletableFuture<HttpResponse> =
            reset(objectId, DraftResetParams.none())

        /** @see reset */
        fun reset(
            objectId: String,
            params: DraftResetParams = DraftResetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            reset(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see reset */
        fun reset(
            objectId: String,
            params: DraftResetParams = DraftResetParams.none(),
        ): CompletableFuture<HttpResponse> = reset(objectId, params, RequestOptions.none())

        /** @see reset */
        fun reset(
            params: DraftResetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see reset */
        fun reset(params: DraftResetParams): CompletableFuture<HttpResponse> =
            reset(params, RequestOptions.none())

        /** @see reset */
        fun reset(
            objectId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            reset(objectId, DraftResetParams.none(), requestOptions)
    }
}
