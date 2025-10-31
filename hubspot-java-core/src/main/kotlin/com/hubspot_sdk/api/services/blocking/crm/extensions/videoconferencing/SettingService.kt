// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.crm.extensions.videoconferencing

import com.google.errorprone.annotations.MustBeClosed
import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponse
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.crm.extensions.videoconferencing.ExternalSettings
import com.hubspot_sdk.api.models.crm.extensions.videoconferencing.settings.SettingDeleteParams
import com.hubspot_sdk.api.models.crm.extensions.videoconferencing.settings.SettingGetParams
import com.hubspot_sdk.api.models.crm.extensions.videoconferencing.settings.SettingUpdateParams
import java.util.function.Consumer

interface SettingService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SettingService

    /** Updates the settings for a video conference application with the specified ID. */
    fun update(appId: Int, params: SettingUpdateParams): ExternalSettings =
        update(appId, params, RequestOptions.none())

    /** @see update */
    fun update(
        appId: Int,
        params: SettingUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExternalSettings = update(params.toBuilder().appId(appId).build(), requestOptions)

    /** @see update */
    fun update(params: SettingUpdateParams): ExternalSettings =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: SettingUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExternalSettings

    /** Deletes the settings for a video conference application with the specified ID. */
    fun delete(appId: Int) = delete(appId, SettingDeleteParams.none())

    /** @see delete */
    fun delete(
        appId: Int,
        params: SettingDeleteParams = SettingDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().appId(appId).build(), requestOptions)

    /** @see delete */
    fun delete(appId: Int, params: SettingDeleteParams = SettingDeleteParams.none()) =
        delete(appId, params, RequestOptions.none())

    /** @see delete */
    fun delete(params: SettingDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see delete */
    fun delete(params: SettingDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(appId: Int, requestOptions: RequestOptions) =
        delete(appId, SettingDeleteParams.none(), requestOptions)

    /** Return the settings for a video conference application with the specified ID. */
    fun get(appId: Int): ExternalSettings = get(appId, SettingGetParams.none())

    /** @see get */
    fun get(
        appId: Int,
        params: SettingGetParams = SettingGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExternalSettings = get(params.toBuilder().appId(appId).build(), requestOptions)

    /** @see get */
    fun get(appId: Int, params: SettingGetParams = SettingGetParams.none()): ExternalSettings =
        get(appId, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: SettingGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExternalSettings

    /** @see get */
    fun get(params: SettingGetParams): ExternalSettings = get(params, RequestOptions.none())

    /** @see get */
    fun get(appId: Int, requestOptions: RequestOptions): ExternalSettings =
        get(appId, SettingGetParams.none(), requestOptions)

    /** A view of [SettingService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): SettingService.WithRawResponse

        /**
         * Returns a raw HTTP response for `put
         * /crm/v3/extensions/videoconferencing/settings/{appId}`, but is otherwise the same as
         * [SettingService.update].
         */
        @MustBeClosed
        fun update(appId: Int, params: SettingUpdateParams): HttpResponseFor<ExternalSettings> =
            update(appId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            appId: Int,
            params: SettingUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExternalSettings> =
            update(params.toBuilder().appId(appId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: SettingUpdateParams): HttpResponseFor<ExternalSettings> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: SettingUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExternalSettings>

        /**
         * Returns a raw HTTP response for `delete
         * /crm/v3/extensions/videoconferencing/settings/{appId}`, but is otherwise the same as
         * [SettingService.delete].
         */
        @MustBeClosed
        fun delete(appId: Int): HttpResponse = delete(appId, SettingDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            appId: Int,
            params: SettingDeleteParams = SettingDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().appId(appId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            appId: Int,
            params: SettingDeleteParams = SettingDeleteParams.none(),
        ): HttpResponse = delete(appId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: SettingDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: SettingDeleteParams): HttpResponse =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(appId: Int, requestOptions: RequestOptions): HttpResponse =
            delete(appId, SettingDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get
         * /crm/v3/extensions/videoconferencing/settings/{appId}`, but is otherwise the same as
         * [SettingService.get].
         */
        @MustBeClosed
        fun get(appId: Int): HttpResponseFor<ExternalSettings> = get(appId, SettingGetParams.none())

        /** @see get */
        @MustBeClosed
        fun get(
            appId: Int,
            params: SettingGetParams = SettingGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExternalSettings> =
            get(params.toBuilder().appId(appId).build(), requestOptions)

        /** @see get */
        @MustBeClosed
        fun get(
            appId: Int,
            params: SettingGetParams = SettingGetParams.none(),
        ): HttpResponseFor<ExternalSettings> = get(appId, params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: SettingGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExternalSettings>

        /** @see get */
        @MustBeClosed
        fun get(params: SettingGetParams): HttpResponseFor<ExternalSettings> =
            get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(appId: Int, requestOptions: RequestOptions): HttpResponseFor<ExternalSettings> =
            get(appId, SettingGetParams.none(), requestOptions)
    }
}
