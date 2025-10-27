// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.webhooks

import com.google.errorprone.annotations.MustBeClosed
import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponse
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.webhooks.SettingsResponse
import com.hubspot_sdk.api.models.webhooks.settings.SettingDeleteParams
import com.hubspot_sdk.api.models.webhooks.settings.SettingListParams
import com.hubspot_sdk.api.models.webhooks.settings.SettingUpdateParams
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

    /** Update webhook settings for the specified app. */
    fun update(appId: Int, params: SettingUpdateParams): SettingsResponse =
        update(appId, params, RequestOptions.none())

    /** @see update */
    fun update(
        appId: Int,
        params: SettingUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SettingsResponse = update(params.toBuilder().appId(appId).build(), requestOptions)

    /** @see update */
    fun update(params: SettingUpdateParams): SettingsResponse =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: SettingUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SettingsResponse

    /**
     * Retrieve the webhook settings for the specified app, including the webhook’s target URL,
     * throttle configuration, and create/update date.
     */
    fun list(appId: Int): SettingsResponse = list(appId, SettingListParams.none())

    /** @see list */
    fun list(
        appId: Int,
        params: SettingListParams = SettingListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SettingsResponse = list(params.toBuilder().appId(appId).build(), requestOptions)

    /** @see list */
    fun list(appId: Int, params: SettingListParams = SettingListParams.none()): SettingsResponse =
        list(appId, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: SettingListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SettingsResponse

    /** @see list */
    fun list(params: SettingListParams): SettingsResponse = list(params, RequestOptions.none())

    /** @see list */
    fun list(appId: Int, requestOptions: RequestOptions): SettingsResponse =
        list(appId, SettingListParams.none(), requestOptions)

    /**
     * Delete the webhook settings for the specified app. Event subscriptions will not be deleted,
     * but will be paused until another webhook is created.
     */
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

    /** A view of [SettingService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): SettingService.WithRawResponse

        /**
         * Returns a raw HTTP response for `put /webhooks/v3/{appId}/settings`, but is otherwise the
         * same as [SettingService.update].
         */
        @MustBeClosed
        fun update(appId: Int, params: SettingUpdateParams): HttpResponseFor<SettingsResponse> =
            update(appId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            appId: Int,
            params: SettingUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SettingsResponse> =
            update(params.toBuilder().appId(appId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: SettingUpdateParams): HttpResponseFor<SettingsResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: SettingUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SettingsResponse>

        /**
         * Returns a raw HTTP response for `get /webhooks/v3/{appId}/settings`, but is otherwise the
         * same as [SettingService.list].
         */
        @MustBeClosed
        fun list(appId: Int): HttpResponseFor<SettingsResponse> =
            list(appId, SettingListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            appId: Int,
            params: SettingListParams = SettingListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SettingsResponse> =
            list(params.toBuilder().appId(appId).build(), requestOptions)

        /** @see list */
        @MustBeClosed
        fun list(
            appId: Int,
            params: SettingListParams = SettingListParams.none(),
        ): HttpResponseFor<SettingsResponse> = list(appId, params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: SettingListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SettingsResponse>

        /** @see list */
        @MustBeClosed
        fun list(params: SettingListParams): HttpResponseFor<SettingsResponse> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(appId: Int, requestOptions: RequestOptions): HttpResponseFor<SettingsResponse> =
            list(appId, SettingListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /webhooks/v3/{appId}/settings`, but is otherwise
         * the same as [SettingService.delete].
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
    }
}
