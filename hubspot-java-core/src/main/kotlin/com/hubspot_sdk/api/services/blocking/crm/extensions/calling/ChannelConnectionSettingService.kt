// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.crm.extensions.calling

import com.google.errorprone.annotations.MustBeClosed
import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponse
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.crm.extensions.calling.ChannelConnectionSettingsResponse
import com.hubspot_sdk.api.models.crm.extensions.calling.channelconnectionsettings.ChannelConnectionSettingCreateParams
import com.hubspot_sdk.api.models.crm.extensions.calling.channelconnectionsettings.ChannelConnectionSettingDeleteParams
import com.hubspot_sdk.api.models.crm.extensions.calling.channelconnectionsettings.ChannelConnectionSettingGetParams
import com.hubspot_sdk.api.models.crm.extensions.calling.channelconnectionsettings.ChannelConnectionSettingUpdateParams
import java.util.function.Consumer

interface ChannelConnectionSettingService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ChannelConnectionSettingService

    fun create(
        appId: Int,
        params: ChannelConnectionSettingCreateParams,
    ): ChannelConnectionSettingsResponse = create(appId, params, RequestOptions.none())

    /** @see create */
    fun create(
        appId: Int,
        params: ChannelConnectionSettingCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ChannelConnectionSettingsResponse =
        create(params.toBuilder().appId(appId).build(), requestOptions)

    /** @see create */
    fun create(params: ChannelConnectionSettingCreateParams): ChannelConnectionSettingsResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: ChannelConnectionSettingCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ChannelConnectionSettingsResponse

    fun update(
        appId: Int,
        params: ChannelConnectionSettingUpdateParams,
    ): ChannelConnectionSettingsResponse = update(appId, params, RequestOptions.none())

    /** @see update */
    fun update(
        appId: Int,
        params: ChannelConnectionSettingUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ChannelConnectionSettingsResponse =
        update(params.toBuilder().appId(appId).build(), requestOptions)

    /** @see update */
    fun update(params: ChannelConnectionSettingUpdateParams): ChannelConnectionSettingsResponse =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: ChannelConnectionSettingUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ChannelConnectionSettingsResponse

    fun delete(appId: Int) = delete(appId, ChannelConnectionSettingDeleteParams.none())

    /** @see delete */
    fun delete(
        appId: Int,
        params: ChannelConnectionSettingDeleteParams = ChannelConnectionSettingDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().appId(appId).build(), requestOptions)

    /** @see delete */
    fun delete(
        appId: Int,
        params: ChannelConnectionSettingDeleteParams = ChannelConnectionSettingDeleteParams.none(),
    ) = delete(appId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: ChannelConnectionSettingDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see delete */
    fun delete(params: ChannelConnectionSettingDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(appId: Int, requestOptions: RequestOptions) =
        delete(appId, ChannelConnectionSettingDeleteParams.none(), requestOptions)

    fun get(appId: Int): ChannelConnectionSettingsResponse =
        get(appId, ChannelConnectionSettingGetParams.none())

    /** @see get */
    fun get(
        appId: Int,
        params: ChannelConnectionSettingGetParams = ChannelConnectionSettingGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ChannelConnectionSettingsResponse =
        get(params.toBuilder().appId(appId).build(), requestOptions)

    /** @see get */
    fun get(
        appId: Int,
        params: ChannelConnectionSettingGetParams = ChannelConnectionSettingGetParams.none(),
    ): ChannelConnectionSettingsResponse = get(appId, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: ChannelConnectionSettingGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ChannelConnectionSettingsResponse

    /** @see get */
    fun get(params: ChannelConnectionSettingGetParams): ChannelConnectionSettingsResponse =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(appId: Int, requestOptions: RequestOptions): ChannelConnectionSettingsResponse =
        get(appId, ChannelConnectionSettingGetParams.none(), requestOptions)

    /**
     * A view of [ChannelConnectionSettingService] that provides access to raw HTTP responses for
     * each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ChannelConnectionSettingService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post
         * /crm/v3/extensions/calling/{appId}/settings/channel-connection`, but is otherwise the
         * same as [ChannelConnectionSettingService.create].
         */
        @MustBeClosed
        fun create(
            appId: Int,
            params: ChannelConnectionSettingCreateParams,
        ): HttpResponseFor<ChannelConnectionSettingsResponse> =
            create(appId, params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            appId: Int,
            params: ChannelConnectionSettingCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ChannelConnectionSettingsResponse> =
            create(params.toBuilder().appId(appId).build(), requestOptions)

        /** @see create */
        @MustBeClosed
        fun create(
            params: ChannelConnectionSettingCreateParams
        ): HttpResponseFor<ChannelConnectionSettingsResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: ChannelConnectionSettingCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ChannelConnectionSettingsResponse>

        /**
         * Returns a raw HTTP response for `patch
         * /crm/v3/extensions/calling/{appId}/settings/channel-connection`, but is otherwise the
         * same as [ChannelConnectionSettingService.update].
         */
        @MustBeClosed
        fun update(
            appId: Int,
            params: ChannelConnectionSettingUpdateParams,
        ): HttpResponseFor<ChannelConnectionSettingsResponse> =
            update(appId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            appId: Int,
            params: ChannelConnectionSettingUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ChannelConnectionSettingsResponse> =
            update(params.toBuilder().appId(appId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            params: ChannelConnectionSettingUpdateParams
        ): HttpResponseFor<ChannelConnectionSettingsResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: ChannelConnectionSettingUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ChannelConnectionSettingsResponse>

        /**
         * Returns a raw HTTP response for `delete
         * /crm/v3/extensions/calling/{appId}/settings/channel-connection`, but is otherwise the
         * same as [ChannelConnectionSettingService.delete].
         */
        @MustBeClosed
        fun delete(appId: Int): HttpResponse =
            delete(appId, ChannelConnectionSettingDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            appId: Int,
            params: ChannelConnectionSettingDeleteParams =
                ChannelConnectionSettingDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().appId(appId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            appId: Int,
            params: ChannelConnectionSettingDeleteParams =
                ChannelConnectionSettingDeleteParams.none(),
        ): HttpResponse = delete(appId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: ChannelConnectionSettingDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: ChannelConnectionSettingDeleteParams): HttpResponse =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(appId: Int, requestOptions: RequestOptions): HttpResponse =
            delete(appId, ChannelConnectionSettingDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get
         * /crm/v3/extensions/calling/{appId}/settings/channel-connection`, but is otherwise the
         * same as [ChannelConnectionSettingService.get].
         */
        @MustBeClosed
        fun get(appId: Int): HttpResponseFor<ChannelConnectionSettingsResponse> =
            get(appId, ChannelConnectionSettingGetParams.none())

        /** @see get */
        @MustBeClosed
        fun get(
            appId: Int,
            params: ChannelConnectionSettingGetParams = ChannelConnectionSettingGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ChannelConnectionSettingsResponse> =
            get(params.toBuilder().appId(appId).build(), requestOptions)

        /** @see get */
        @MustBeClosed
        fun get(
            appId: Int,
            params: ChannelConnectionSettingGetParams = ChannelConnectionSettingGetParams.none(),
        ): HttpResponseFor<ChannelConnectionSettingsResponse> =
            get(appId, params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: ChannelConnectionSettingGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ChannelConnectionSettingsResponse>

        /** @see get */
        @MustBeClosed
        fun get(
            params: ChannelConnectionSettingGetParams
        ): HttpResponseFor<ChannelConnectionSettingsResponse> = get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            appId: Int,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ChannelConnectionSettingsResponse> =
            get(appId, ChannelConnectionSettingGetParams.none(), requestOptions)
    }
}
