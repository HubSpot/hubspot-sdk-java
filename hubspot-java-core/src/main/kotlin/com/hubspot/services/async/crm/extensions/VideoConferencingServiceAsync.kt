// File generated from our OpenAPI spec by Stainless.

package com.hubspot.services.async.crm.extensions

import com.hubspot.core.ClientOptions
import com.hubspot.core.RequestOptions
import com.hubspot.core.http.HttpResponse
import com.hubspot.core.http.HttpResponseFor
import com.hubspot.models.crm.extensions.videoconferencing.ExternalSettings
import com.hubspot.models.crm.extensions.videoconferencing.VideoConferencingDeleteParams
import com.hubspot.models.crm.extensions.videoconferencing.VideoConferencingGetParams
import com.hubspot.models.crm.extensions.videoconferencing.VideoConferencingUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface VideoConferencingServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): VideoConferencingServiceAsync

    /** Create or update video conference extension settings for your app */
    fun update(
        appId: Int,
        params: VideoConferencingUpdateParams,
    ): CompletableFuture<ExternalSettings> = update(appId, params, RequestOptions.none())

    /** @see update */
    fun update(
        appId: Int,
        params: VideoConferencingUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExternalSettings> =
        update(params.toBuilder().appId(appId).build(), requestOptions)

    /** @see update */
    fun update(params: VideoConferencingUpdateParams): CompletableFuture<ExternalSettings> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: VideoConferencingUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExternalSettings>

    /** Delete video conference extension settings for your app */
    fun delete(appId: Int): CompletableFuture<Void?> =
        delete(appId, VideoConferencingDeleteParams.none())

    /** @see delete */
    fun delete(
        appId: Int,
        params: VideoConferencingDeleteParams = VideoConferencingDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = delete(params.toBuilder().appId(appId).build(), requestOptions)

    /** @see delete */
    fun delete(
        appId: Int,
        params: VideoConferencingDeleteParams = VideoConferencingDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(appId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: VideoConferencingDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: VideoConferencingDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(appId: Int, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(appId, VideoConferencingDeleteParams.none(), requestOptions)

    /** Fetch video conference extension settings for your app */
    fun get(appId: Int): CompletableFuture<ExternalSettings> =
        get(appId, VideoConferencingGetParams.none())

    /** @see get */
    fun get(
        appId: Int,
        params: VideoConferencingGetParams = VideoConferencingGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExternalSettings> =
        get(params.toBuilder().appId(appId).build(), requestOptions)

    /** @see get */
    fun get(
        appId: Int,
        params: VideoConferencingGetParams = VideoConferencingGetParams.none(),
    ): CompletableFuture<ExternalSettings> = get(appId, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: VideoConferencingGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExternalSettings>

    /** @see get */
    fun get(params: VideoConferencingGetParams): CompletableFuture<ExternalSettings> =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(appId: Int, requestOptions: RequestOptions): CompletableFuture<ExternalSettings> =
        get(appId, VideoConferencingGetParams.none(), requestOptions)

    /**
     * A view of [VideoConferencingServiceAsync] that provides access to raw HTTP responses for each
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
        ): VideoConferencingServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `put
         * /crm/extensions/videoconferencing/2026-03/settings/{appId}`, but is otherwise the same as
         * [VideoConferencingServiceAsync.update].
         */
        fun update(
            appId: Int,
            params: VideoConferencingUpdateParams,
        ): CompletableFuture<HttpResponseFor<ExternalSettings>> =
            update(appId, params, RequestOptions.none())

        /** @see update */
        fun update(
            appId: Int,
            params: VideoConferencingUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExternalSettings>> =
            update(params.toBuilder().appId(appId).build(), requestOptions)

        /** @see update */
        fun update(
            params: VideoConferencingUpdateParams
        ): CompletableFuture<HttpResponseFor<ExternalSettings>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: VideoConferencingUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExternalSettings>>

        /**
         * Returns a raw HTTP response for `delete
         * /crm/extensions/videoconferencing/2026-03/settings/{appId}`, but is otherwise the same as
         * [VideoConferencingServiceAsync.delete].
         */
        fun delete(appId: Int): CompletableFuture<HttpResponse> =
            delete(appId, VideoConferencingDeleteParams.none())

        /** @see delete */
        fun delete(
            appId: Int,
            params: VideoConferencingDeleteParams = VideoConferencingDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().appId(appId).build(), requestOptions)

        /** @see delete */
        fun delete(
            appId: Int,
            params: VideoConferencingDeleteParams = VideoConferencingDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(appId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: VideoConferencingDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: VideoConferencingDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(appId: Int, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            delete(appId, VideoConferencingDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get
         * /crm/extensions/videoconferencing/2026-03/settings/{appId}`, but is otherwise the same as
         * [VideoConferencingServiceAsync.get].
         */
        fun get(appId: Int): CompletableFuture<HttpResponseFor<ExternalSettings>> =
            get(appId, VideoConferencingGetParams.none())

        /** @see get */
        fun get(
            appId: Int,
            params: VideoConferencingGetParams = VideoConferencingGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExternalSettings>> =
            get(params.toBuilder().appId(appId).build(), requestOptions)

        /** @see get */
        fun get(
            appId: Int,
            params: VideoConferencingGetParams = VideoConferencingGetParams.none(),
        ): CompletableFuture<HttpResponseFor<ExternalSettings>> =
            get(appId, params, RequestOptions.none())

        /** @see get */
        fun get(
            params: VideoConferencingGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExternalSettings>>

        /** @see get */
        fun get(
            params: VideoConferencingGetParams
        ): CompletableFuture<HttpResponseFor<ExternalSettings>> = get(params, RequestOptions.none())

        /** @see get */
        fun get(
            appId: Int,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ExternalSettings>> =
            get(appId, VideoConferencingGetParams.none(), requestOptions)
    }
}
