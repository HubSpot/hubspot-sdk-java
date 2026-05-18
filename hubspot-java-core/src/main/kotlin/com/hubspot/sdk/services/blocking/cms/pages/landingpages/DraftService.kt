// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.blocking.cms.pages.landingpages

import com.google.errorprone.annotations.MustBeClosed
import com.hubspot.sdk.core.ClientOptions
import com.hubspot.sdk.core.RequestOptions
import com.hubspot.sdk.core.http.HttpResponse
import com.hubspot.sdk.core.http.HttpResponseFor
import com.hubspot.sdk.models.cms.pages.PagesPage
import com.hubspot.sdk.models.cms.pages.landingpages.draft.DraftGetParams
import com.hubspot.sdk.models.cms.pages.landingpages.draft.DraftPushLiveParams
import com.hubspot.sdk.models.cms.pages.landingpages.draft.DraftResetParams
import com.hubspot.sdk.models.cms.pages.landingpages.draft.DraftUpdateParams
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

    /**
     * Partially updates the draft version of a single landing page, specified by its ID. You only
     * need to specify the column values that you are modifying.
     */
    fun update(objectId: String, params: DraftUpdateParams): PagesPage =
        update(objectId, params, RequestOptions.none())

    /** @see update */
    fun update(
        objectId: String,
        params: DraftUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PagesPage = update(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see update */
    fun update(params: DraftUpdateParams): PagesPage = update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: DraftUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PagesPage

    /** Retrieve the full draft version of a landing page, specified by page ID. */
    fun get(objectId: String): PagesPage = get(objectId, DraftGetParams.none())

    /** @see get */
    fun get(
        objectId: String,
        params: DraftGetParams = DraftGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PagesPage = get(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see get */
    fun get(objectId: String, params: DraftGetParams = DraftGetParams.none()): PagesPage =
        get(objectId, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: DraftGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PagesPage

    /** @see get */
    fun get(params: DraftGetParams): PagesPage = get(params, RequestOptions.none())

    /** @see get */
    fun get(objectId: String, requestOptions: RequestOptions): PagesPage =
        get(objectId, DraftGetParams.none(), requestOptions)

    /**
     * Take any changes from the draft version of the Landing Page and apply them to the live
     * version.
     */
    fun pushLive(objectId: String) = pushLive(objectId, DraftPushLiveParams.none())

    /** @see pushLive */
    fun pushLive(
        objectId: String,
        params: DraftPushLiveParams = DraftPushLiveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = pushLive(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see pushLive */
    fun pushLive(objectId: String, params: DraftPushLiveParams = DraftPushLiveParams.none()) =
        pushLive(objectId, params, RequestOptions.none())

    /** @see pushLive */
    fun pushLive(
        params: DraftPushLiveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see pushLive */
    fun pushLive(params: DraftPushLiveParams) = pushLive(params, RequestOptions.none())

    /** @see pushLive */
    fun pushLive(objectId: String, requestOptions: RequestOptions) =
        pushLive(objectId, DraftPushLiveParams.none(), requestOptions)

    /** Discards any edits and resets the draft to match the live version. */
    fun reset(objectId: String) = reset(objectId, DraftResetParams.none())

    /** @see reset */
    fun reset(
        objectId: String,
        params: DraftResetParams = DraftResetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = reset(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see reset */
    fun reset(objectId: String, params: DraftResetParams = DraftResetParams.none()) =
        reset(objectId, params, RequestOptions.none())

    /** @see reset */
    fun reset(params: DraftResetParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see reset */
    fun reset(params: DraftResetParams) = reset(params, RequestOptions.none())

    /** @see reset */
    fun reset(objectId: String, requestOptions: RequestOptions) =
        reset(objectId, DraftResetParams.none(), requestOptions)

    /** A view of [DraftService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): DraftService.WithRawResponse

        /**
         * Returns a raw HTTP response for `patch
         * /cms/pages/2026-03/landing-pages/{objectId}/draft`, but is otherwise the same as
         * [DraftService.update].
         */
        @MustBeClosed
        fun update(objectId: String, params: DraftUpdateParams): HttpResponseFor<PagesPage> =
            update(objectId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            objectId: String,
            params: DraftUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PagesPage> =
            update(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: DraftUpdateParams): HttpResponseFor<PagesPage> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: DraftUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PagesPage>

        /**
         * Returns a raw HTTP response for `get /cms/pages/2026-03/landing-pages/{objectId}/draft`,
         * but is otherwise the same as [DraftService.get].
         */
        @MustBeClosed
        fun get(objectId: String): HttpResponseFor<PagesPage> = get(objectId, DraftGetParams.none())

        /** @see get */
        @MustBeClosed
        fun get(
            objectId: String,
            params: DraftGetParams = DraftGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PagesPage> =
            get(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see get */
        @MustBeClosed
        fun get(
            objectId: String,
            params: DraftGetParams = DraftGetParams.none(),
        ): HttpResponseFor<PagesPage> = get(objectId, params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: DraftGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PagesPage>

        /** @see get */
        @MustBeClosed
        fun get(params: DraftGetParams): HttpResponseFor<PagesPage> =
            get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(objectId: String, requestOptions: RequestOptions): HttpResponseFor<PagesPage> =
            get(objectId, DraftGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /cms/pages/2026-03/landing-pages/{objectId}/draft/push-live`, but is otherwise the same
         * as [DraftService.pushLive].
         */
        @MustBeClosed
        fun pushLive(objectId: String): HttpResponse =
            pushLive(objectId, DraftPushLiveParams.none())

        /** @see pushLive */
        @MustBeClosed
        fun pushLive(
            objectId: String,
            params: DraftPushLiveParams = DraftPushLiveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = pushLive(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see pushLive */
        @MustBeClosed
        fun pushLive(
            objectId: String,
            params: DraftPushLiveParams = DraftPushLiveParams.none(),
        ): HttpResponse = pushLive(objectId, params, RequestOptions.none())

        /** @see pushLive */
        @MustBeClosed
        fun pushLive(
            params: DraftPushLiveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see pushLive */
        @MustBeClosed
        fun pushLive(params: DraftPushLiveParams): HttpResponse =
            pushLive(params, RequestOptions.none())

        /** @see pushLive */
        @MustBeClosed
        fun pushLive(objectId: String, requestOptions: RequestOptions): HttpResponse =
            pushLive(objectId, DraftPushLiveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /cms/pages/2026-03/landing-pages/{objectId}/draft/reset`, but is otherwise the same as
         * [DraftService.reset].
         */
        @MustBeClosed
        fun reset(objectId: String): HttpResponse = reset(objectId, DraftResetParams.none())

        /** @see reset */
        @MustBeClosed
        fun reset(
            objectId: String,
            params: DraftResetParams = DraftResetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = reset(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see reset */
        @MustBeClosed
        fun reset(
            objectId: String,
            params: DraftResetParams = DraftResetParams.none(),
        ): HttpResponse = reset(objectId, params, RequestOptions.none())

        /** @see reset */
        @MustBeClosed
        fun reset(
            params: DraftResetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see reset */
        @MustBeClosed
        fun reset(params: DraftResetParams): HttpResponse = reset(params, RequestOptions.none())

        /** @see reset */
        @MustBeClosed
        fun reset(objectId: String, requestOptions: RequestOptions): HttpResponse =
            reset(objectId, DraftResetParams.none(), requestOptions)
    }
}
