// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.crm.extensions

import com.google.errorprone.annotations.MustBeClosed
import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponse
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.crm.extensions.videoconferencing.ExternalSettings
import com.hubspot_sdk.api.models.crm.extensions.videoconferencing.VideoConferencingDeleteParams
import com.hubspot_sdk.api.models.crm.extensions.videoconferencing.VideoConferencingGetParams
import com.hubspot_sdk.api.models.crm.extensions.videoconferencing.VideoConferencingUpdateParams
import java.util.function.Consumer

interface VideoConferencingService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): VideoConferencingService

    /** Create or update video conference extension settings for your app */
    fun update(appId: Int, params: VideoConferencingUpdateParams): ExternalSettings =
        update(appId, params, RequestOptions.none())

    /** @see update */
    fun update(
        appId: Int,
        params: VideoConferencingUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExternalSettings = update(params.toBuilder().appId(appId).build(), requestOptions)

    /** @see update */
    fun update(params: VideoConferencingUpdateParams): ExternalSettings =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: VideoConferencingUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExternalSettings

    /** Delete video conference extension settings for your app */
    fun delete(appId: Int) = delete(appId, VideoConferencingDeleteParams.none())

    /** @see delete */
    fun delete(
        appId: Int,
        params: VideoConferencingDeleteParams = VideoConferencingDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().appId(appId).build(), requestOptions)

    /** @see delete */
    fun delete(
        appId: Int,
        params: VideoConferencingDeleteParams = VideoConferencingDeleteParams.none(),
    ) = delete(appId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: VideoConferencingDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see delete */
    fun delete(params: VideoConferencingDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(appId: Int, requestOptions: RequestOptions) =
        delete(appId, VideoConferencingDeleteParams.none(), requestOptions)

    /** Fetch video conference extension settings for your app */
    fun get(appId: Int): ExternalSettings = get(appId, VideoConferencingGetParams.none())

    /** @see get */
    fun get(
        appId: Int,
        params: VideoConferencingGetParams = VideoConferencingGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExternalSettings = get(params.toBuilder().appId(appId).build(), requestOptions)

    /** @see get */
    fun get(
        appId: Int,
        params: VideoConferencingGetParams = VideoConferencingGetParams.none(),
    ): ExternalSettings = get(appId, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: VideoConferencingGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExternalSettings

    /** @see get */
    fun get(params: VideoConferencingGetParams): ExternalSettings =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(appId: Int, requestOptions: RequestOptions): ExternalSettings =
        get(appId, VideoConferencingGetParams.none(), requestOptions)

    /**
     * A view of [VideoConferencingService] that provides access to raw HTTP responses for each
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
        ): VideoConferencingService.WithRawResponse

        /**
         * Returns a raw HTTP response for `put
         * /crm/extensions/videoconferencing/2026-03/settings/{appId}`, but is otherwise the same as
         * [VideoConferencingService.update].
         */
        @MustBeClosed
        fun update(
            appId: Int,
            params: VideoConferencingUpdateParams,
        ): HttpResponseFor<ExternalSettings> = update(appId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            appId: Int,
            params: VideoConferencingUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExternalSettings> =
            update(params.toBuilder().appId(appId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: VideoConferencingUpdateParams): HttpResponseFor<ExternalSettings> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: VideoConferencingUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExternalSettings>

        /**
         * Returns a raw HTTP response for `delete
         * /crm/extensions/videoconferencing/2026-03/settings/{appId}`, but is otherwise the same as
         * [VideoConferencingService.delete].
         */
        @MustBeClosed
        fun delete(appId: Int): HttpResponse = delete(appId, VideoConferencingDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            appId: Int,
            params: VideoConferencingDeleteParams = VideoConferencingDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().appId(appId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            appId: Int,
            params: VideoConferencingDeleteParams = VideoConferencingDeleteParams.none(),
        ): HttpResponse = delete(appId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: VideoConferencingDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: VideoConferencingDeleteParams): HttpResponse =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(appId: Int, requestOptions: RequestOptions): HttpResponse =
            delete(appId, VideoConferencingDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get
         * /crm/extensions/videoconferencing/2026-03/settings/{appId}`, but is otherwise the same as
         * [VideoConferencingService.get].
         */
        @MustBeClosed
        fun get(appId: Int): HttpResponseFor<ExternalSettings> =
            get(appId, VideoConferencingGetParams.none())

        /** @see get */
        @MustBeClosed
        fun get(
            appId: Int,
            params: VideoConferencingGetParams = VideoConferencingGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExternalSettings> =
            get(params.toBuilder().appId(appId).build(), requestOptions)

        /** @see get */
        @MustBeClosed
        fun get(
            appId: Int,
            params: VideoConferencingGetParams = VideoConferencingGetParams.none(),
        ): HttpResponseFor<ExternalSettings> = get(appId, params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: VideoConferencingGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExternalSettings>

        /** @see get */
        @MustBeClosed
        fun get(params: VideoConferencingGetParams): HttpResponseFor<ExternalSettings> =
            get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(appId: Int, requestOptions: RequestOptions): HttpResponseFor<ExternalSettings> =
            get(appId, VideoConferencingGetParams.none(), requestOptions)
    }
}
