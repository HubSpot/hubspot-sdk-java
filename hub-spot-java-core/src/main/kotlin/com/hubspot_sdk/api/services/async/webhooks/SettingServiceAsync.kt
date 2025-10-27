// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.webhooks

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponse
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.webhooks.SettingsResponse
import com.hubspot_sdk.api.models.webhooks.settings.SettingDeleteParams
import com.hubspot_sdk.api.models.webhooks.settings.SettingListParams
import com.hubspot_sdk.api.models.webhooks.settings.SettingUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface SettingServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SettingServiceAsync

    /** Update webhook settings for the specified app. */
    fun update(appId: Int, params: SettingUpdateParams): CompletableFuture<SettingsResponse> =
        update(appId, params, RequestOptions.none())

    /** @see update */
    fun update(
        appId: Int,
        params: SettingUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SettingsResponse> =
        update(params.toBuilder().appId(appId).build(), requestOptions)

    /** @see update */
    fun update(params: SettingUpdateParams): CompletableFuture<SettingsResponse> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: SettingUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SettingsResponse>

    /**
     * Retrieve the webhook settings for the specified app, including the webhook’s target URL,
     * throttle configuration, and create/update date.
     */
    fun list(appId: Int): CompletableFuture<SettingsResponse> =
        list(appId, SettingListParams.none())

    /** @see list */
    fun list(
        appId: Int,
        params: SettingListParams = SettingListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SettingsResponse> =
        list(params.toBuilder().appId(appId).build(), requestOptions)

    /** @see list */
    fun list(
        appId: Int,
        params: SettingListParams = SettingListParams.none(),
    ): CompletableFuture<SettingsResponse> = list(appId, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: SettingListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SettingsResponse>

    /** @see list */
    fun list(params: SettingListParams): CompletableFuture<SettingsResponse> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(appId: Int, requestOptions: RequestOptions): CompletableFuture<SettingsResponse> =
        list(appId, SettingListParams.none(), requestOptions)

    /**
     * Delete the webhook settings for the specified app. Event subscriptions will not be deleted,
     * but will be paused until another webhook is created.
     */
    fun delete(appId: Int): CompletableFuture<Void?> = delete(appId, SettingDeleteParams.none())

    /** @see delete */
    fun delete(
        appId: Int,
        params: SettingDeleteParams = SettingDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = delete(params.toBuilder().appId(appId).build(), requestOptions)

    /** @see delete */
    fun delete(
        appId: Int,
        params: SettingDeleteParams = SettingDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(appId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: SettingDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: SettingDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(appId: Int, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(appId, SettingDeleteParams.none(), requestOptions)

    /**
     * A view of [SettingServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SettingServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `put /webhooks/v3/{appId}/settings`, but is otherwise the
         * same as [SettingServiceAsync.update].
         */
        fun update(
            appId: Int,
            params: SettingUpdateParams,
        ): CompletableFuture<HttpResponseFor<SettingsResponse>> =
            update(appId, params, RequestOptions.none())

        /** @see update */
        fun update(
            appId: Int,
            params: SettingUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SettingsResponse>> =
            update(params.toBuilder().appId(appId).build(), requestOptions)

        /** @see update */
        fun update(
            params: SettingUpdateParams
        ): CompletableFuture<HttpResponseFor<SettingsResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: SettingUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SettingsResponse>>

        /**
         * Returns a raw HTTP response for `get /webhooks/v3/{appId}/settings`, but is otherwise the
         * same as [SettingServiceAsync.list].
         */
        fun list(appId: Int): CompletableFuture<HttpResponseFor<SettingsResponse>> =
            list(appId, SettingListParams.none())

        /** @see list */
        fun list(
            appId: Int,
            params: SettingListParams = SettingListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SettingsResponse>> =
            list(params.toBuilder().appId(appId).build(), requestOptions)

        /** @see list */
        fun list(
            appId: Int,
            params: SettingListParams = SettingListParams.none(),
        ): CompletableFuture<HttpResponseFor<SettingsResponse>> =
            list(appId, params, RequestOptions.none())

        /** @see list */
        fun list(
            params: SettingListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SettingsResponse>>

        /** @see list */
        fun list(params: SettingListParams): CompletableFuture<HttpResponseFor<SettingsResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            appId: Int,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SettingsResponse>> =
            list(appId, SettingListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /webhooks/v3/{appId}/settings`, but is otherwise
         * the same as [SettingServiceAsync.delete].
         */
        fun delete(appId: Int): CompletableFuture<HttpResponse> =
            delete(appId, SettingDeleteParams.none())

        /** @see delete */
        fun delete(
            appId: Int,
            params: SettingDeleteParams = SettingDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().appId(appId).build(), requestOptions)

        /** @see delete */
        fun delete(
            appId: Int,
            params: SettingDeleteParams = SettingDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(appId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: SettingDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: SettingDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(appId: Int, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            delete(appId, SettingDeleteParams.none(), requestOptions)
    }
}
