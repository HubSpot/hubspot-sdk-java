// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.crm.extensions.calling

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponse
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.crm.extensions.calling.settings.SettingCreateParams
import com.hubspot_sdk.api.models.crm.extensions.calling.settings.SettingDeleteParams
import com.hubspot_sdk.api.models.crm.extensions.calling.settings.SettingGetParams
import com.hubspot_sdk.api.models.crm.extensions.calling.settings.SettingUpdateParams
import com.hubspot_sdk.api.models.webhooks.SettingsResponse
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

    /** Set the menu label, target iframe URL, and dimensions for your calling extension. */
    fun create(appId: Int, params: SettingCreateParams): CompletableFuture<SettingsResponse> =
        create(appId, params, RequestOptions.none())

    /** @see create */
    fun create(
        appId: Int,
        params: SettingCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SettingsResponse> =
        create(params.toBuilder().appId(appId).build(), requestOptions)

    /** @see create */
    fun create(params: SettingCreateParams): CompletableFuture<SettingsResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: SettingCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SettingsResponse>

    /** Update existing calling extension settings. */
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
     * Delete a calling extension. This will remove your service as an option for all connected
     * accounts.
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

    /** Retrieve the settings configured for the app. */
    fun get(appId: Int): CompletableFuture<SettingsResponse> = get(appId, SettingGetParams.none())

    /** @see get */
    fun get(
        appId: Int,
        params: SettingGetParams = SettingGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SettingsResponse> =
        get(params.toBuilder().appId(appId).build(), requestOptions)

    /** @see get */
    fun get(
        appId: Int,
        params: SettingGetParams = SettingGetParams.none(),
    ): CompletableFuture<SettingsResponse> = get(appId, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: SettingGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SettingsResponse>

    /** @see get */
    fun get(params: SettingGetParams): CompletableFuture<SettingsResponse> =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(appId: Int, requestOptions: RequestOptions): CompletableFuture<SettingsResponse> =
        get(appId, SettingGetParams.none(), requestOptions)

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
         * Returns a raw HTTP response for `post /crm/v3/extensions/calling/{appId}/settings`, but
         * is otherwise the same as [SettingServiceAsync.create].
         */
        fun create(
            appId: Int,
            params: SettingCreateParams,
        ): CompletableFuture<HttpResponseFor<SettingsResponse>> =
            create(appId, params, RequestOptions.none())

        /** @see create */
        fun create(
            appId: Int,
            params: SettingCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SettingsResponse>> =
            create(params.toBuilder().appId(appId).build(), requestOptions)

        /** @see create */
        fun create(
            params: SettingCreateParams
        ): CompletableFuture<HttpResponseFor<SettingsResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: SettingCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SettingsResponse>>

        /**
         * Returns a raw HTTP response for `patch /crm/v3/extensions/calling/{appId}/settings`, but
         * is otherwise the same as [SettingServiceAsync.update].
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
         * Returns a raw HTTP response for `delete /crm/v3/extensions/calling/{appId}/settings`, but
         * is otherwise the same as [SettingServiceAsync.delete].
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

        /**
         * Returns a raw HTTP response for `get /crm/v3/extensions/calling/{appId}/settings`, but is
         * otherwise the same as [SettingServiceAsync.get].
         */
        fun get(appId: Int): CompletableFuture<HttpResponseFor<SettingsResponse>> =
            get(appId, SettingGetParams.none())

        /** @see get */
        fun get(
            appId: Int,
            params: SettingGetParams = SettingGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SettingsResponse>> =
            get(params.toBuilder().appId(appId).build(), requestOptions)

        /** @see get */
        fun get(
            appId: Int,
            params: SettingGetParams = SettingGetParams.none(),
        ): CompletableFuture<HttpResponseFor<SettingsResponse>> =
            get(appId, params, RequestOptions.none())

        /** @see get */
        fun get(
            params: SettingGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SettingsResponse>>

        /** @see get */
        fun get(params: SettingGetParams): CompletableFuture<HttpResponseFor<SettingsResponse>> =
            get(params, RequestOptions.none())

        /** @see get */
        fun get(
            appId: Int,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SettingsResponse>> =
            get(appId, SettingGetParams.none(), requestOptions)
    }
}
