// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.crm.extensions.calling

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponse
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.crm.extensions.calling.ChannelConnectionSettingsResponse
import com.hubspot_sdk.api.models.crm.extensions.calling.channelconnectionsettings.ChannelConnectionSettingCreateParams
import com.hubspot_sdk.api.models.crm.extensions.calling.channelconnectionsettings.ChannelConnectionSettingDeleteParams
import com.hubspot_sdk.api.models.crm.extensions.calling.channelconnectionsettings.ChannelConnectionSettingGetParams
import com.hubspot_sdk.api.models.crm.extensions.calling.channelconnectionsettings.ChannelConnectionSettingUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface ChannelConnectionSettingServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ChannelConnectionSettingServiceAsync

    fun create(
        appId: Int,
        params: ChannelConnectionSettingCreateParams,
    ): CompletableFuture<ChannelConnectionSettingsResponse> =
        create(appId, params, RequestOptions.none())

    /** @see create */
    fun create(
        appId: Int,
        params: ChannelConnectionSettingCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ChannelConnectionSettingsResponse> =
        create(params.toBuilder().appId(appId).build(), requestOptions)

    /** @see create */
    fun create(
        params: ChannelConnectionSettingCreateParams
    ): CompletableFuture<ChannelConnectionSettingsResponse> = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: ChannelConnectionSettingCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ChannelConnectionSettingsResponse>

    fun update(
        appId: Int,
        params: ChannelConnectionSettingUpdateParams,
    ): CompletableFuture<ChannelConnectionSettingsResponse> =
        update(appId, params, RequestOptions.none())

    /** @see update */
    fun update(
        appId: Int,
        params: ChannelConnectionSettingUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ChannelConnectionSettingsResponse> =
        update(params.toBuilder().appId(appId).build(), requestOptions)

    /** @see update */
    fun update(
        params: ChannelConnectionSettingUpdateParams
    ): CompletableFuture<ChannelConnectionSettingsResponse> = update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: ChannelConnectionSettingUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ChannelConnectionSettingsResponse>

    fun delete(appId: Int): CompletableFuture<Void?> =
        delete(appId, ChannelConnectionSettingDeleteParams.none())

    /** @see delete */
    fun delete(
        appId: Int,
        params: ChannelConnectionSettingDeleteParams = ChannelConnectionSettingDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = delete(params.toBuilder().appId(appId).build(), requestOptions)

    /** @see delete */
    fun delete(
        appId: Int,
        params: ChannelConnectionSettingDeleteParams = ChannelConnectionSettingDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(appId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: ChannelConnectionSettingDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: ChannelConnectionSettingDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(appId: Int, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(appId, ChannelConnectionSettingDeleteParams.none(), requestOptions)

    fun get(appId: Int): CompletableFuture<ChannelConnectionSettingsResponse> =
        get(appId, ChannelConnectionSettingGetParams.none())

    /** @see get */
    fun get(
        appId: Int,
        params: ChannelConnectionSettingGetParams = ChannelConnectionSettingGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ChannelConnectionSettingsResponse> =
        get(params.toBuilder().appId(appId).build(), requestOptions)

    /** @see get */
    fun get(
        appId: Int,
        params: ChannelConnectionSettingGetParams = ChannelConnectionSettingGetParams.none(),
    ): CompletableFuture<ChannelConnectionSettingsResponse> =
        get(appId, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: ChannelConnectionSettingGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ChannelConnectionSettingsResponse>

    /** @see get */
    fun get(
        params: ChannelConnectionSettingGetParams
    ): CompletableFuture<ChannelConnectionSettingsResponse> = get(params, RequestOptions.none())

    /** @see get */
    fun get(
        appId: Int,
        requestOptions: RequestOptions,
    ): CompletableFuture<ChannelConnectionSettingsResponse> =
        get(appId, ChannelConnectionSettingGetParams.none(), requestOptions)

    /**
     * A view of [ChannelConnectionSettingServiceAsync] that provides access to raw HTTP responses
     * for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ChannelConnectionSettingServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post
         * /crm/v3/extensions/calling/{appId}/settings/channel-connection`, but is otherwise the
         * same as [ChannelConnectionSettingServiceAsync.create].
         */
        fun create(
            appId: Int,
            params: ChannelConnectionSettingCreateParams,
        ): CompletableFuture<HttpResponseFor<ChannelConnectionSettingsResponse>> =
            create(appId, params, RequestOptions.none())

        /** @see create */
        fun create(
            appId: Int,
            params: ChannelConnectionSettingCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ChannelConnectionSettingsResponse>> =
            create(params.toBuilder().appId(appId).build(), requestOptions)

        /** @see create */
        fun create(
            params: ChannelConnectionSettingCreateParams
        ): CompletableFuture<HttpResponseFor<ChannelConnectionSettingsResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: ChannelConnectionSettingCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ChannelConnectionSettingsResponse>>

        /**
         * Returns a raw HTTP response for `patch
         * /crm/v3/extensions/calling/{appId}/settings/channel-connection`, but is otherwise the
         * same as [ChannelConnectionSettingServiceAsync.update].
         */
        fun update(
            appId: Int,
            params: ChannelConnectionSettingUpdateParams,
        ): CompletableFuture<HttpResponseFor<ChannelConnectionSettingsResponse>> =
            update(appId, params, RequestOptions.none())

        /** @see update */
        fun update(
            appId: Int,
            params: ChannelConnectionSettingUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ChannelConnectionSettingsResponse>> =
            update(params.toBuilder().appId(appId).build(), requestOptions)

        /** @see update */
        fun update(
            params: ChannelConnectionSettingUpdateParams
        ): CompletableFuture<HttpResponseFor<ChannelConnectionSettingsResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: ChannelConnectionSettingUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ChannelConnectionSettingsResponse>>

        /**
         * Returns a raw HTTP response for `delete
         * /crm/v3/extensions/calling/{appId}/settings/channel-connection`, but is otherwise the
         * same as [ChannelConnectionSettingServiceAsync.delete].
         */
        fun delete(appId: Int): CompletableFuture<HttpResponse> =
            delete(appId, ChannelConnectionSettingDeleteParams.none())

        /** @see delete */
        fun delete(
            appId: Int,
            params: ChannelConnectionSettingDeleteParams =
                ChannelConnectionSettingDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().appId(appId).build(), requestOptions)

        /** @see delete */
        fun delete(
            appId: Int,
            params: ChannelConnectionSettingDeleteParams =
                ChannelConnectionSettingDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(appId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: ChannelConnectionSettingDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: ChannelConnectionSettingDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(appId: Int, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            delete(appId, ChannelConnectionSettingDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get
         * /crm/v3/extensions/calling/{appId}/settings/channel-connection`, but is otherwise the
         * same as [ChannelConnectionSettingServiceAsync.get].
         */
        fun get(appId: Int): CompletableFuture<HttpResponseFor<ChannelConnectionSettingsResponse>> =
            get(appId, ChannelConnectionSettingGetParams.none())

        /** @see get */
        fun get(
            appId: Int,
            params: ChannelConnectionSettingGetParams = ChannelConnectionSettingGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ChannelConnectionSettingsResponse>> =
            get(params.toBuilder().appId(appId).build(), requestOptions)

        /** @see get */
        fun get(
            appId: Int,
            params: ChannelConnectionSettingGetParams = ChannelConnectionSettingGetParams.none(),
        ): CompletableFuture<HttpResponseFor<ChannelConnectionSettingsResponse>> =
            get(appId, params, RequestOptions.none())

        /** @see get */
        fun get(
            params: ChannelConnectionSettingGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ChannelConnectionSettingsResponse>>

        /** @see get */
        fun get(
            params: ChannelConnectionSettingGetParams
        ): CompletableFuture<HttpResponseFor<ChannelConnectionSettingsResponse>> =
            get(params, RequestOptions.none())

        /** @see get */
        fun get(
            appId: Int,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ChannelConnectionSettingsResponse>> =
            get(appId, ChannelConnectionSettingGetParams.none(), requestOptions)
    }
}
