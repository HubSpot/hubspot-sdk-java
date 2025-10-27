// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.crm.extensions.calling

import com.google.errorprone.annotations.MustBeClosed
import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponse
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.crm.extensions.calling.settings.SettingCreateParams
import com.hubspot_sdk.api.models.crm.extensions.calling.settings.SettingDeleteParams
import com.hubspot_sdk.api.models.crm.extensions.calling.settings.SettingGetParams
import com.hubspot_sdk.api.models.crm.extensions.calling.settings.SettingUpdateParams
import com.hubspot_sdk.api.models.webhooks.SettingsResponse
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

    /** Set the menu label, target iframe URL, and dimensions for your calling extension. */
    fun create(appId: Int, params: SettingCreateParams): SettingsResponse =
        create(appId, params, RequestOptions.none())

    /** @see create */
    fun create(
        appId: Int,
        params: SettingCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SettingsResponse = create(params.toBuilder().appId(appId).build(), requestOptions)

    /** @see create */
    fun create(params: SettingCreateParams): SettingsResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: SettingCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SettingsResponse

    /** Update existing calling extension settings. */
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
     * Delete a calling extension. This will remove your service as an option for all connected
     * accounts.
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

    /** Retrieve the settings configured for the app. */
    fun get(appId: Int): SettingsResponse = get(appId, SettingGetParams.none())

    /** @see get */
    fun get(
        appId: Int,
        params: SettingGetParams = SettingGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SettingsResponse = get(params.toBuilder().appId(appId).build(), requestOptions)

    /** @see get */
    fun get(appId: Int, params: SettingGetParams = SettingGetParams.none()): SettingsResponse =
        get(appId, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: SettingGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SettingsResponse

    /** @see get */
    fun get(params: SettingGetParams): SettingsResponse = get(params, RequestOptions.none())

    /** @see get */
    fun get(appId: Int, requestOptions: RequestOptions): SettingsResponse =
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
         * Returns a raw HTTP response for `post /crm/v3/extensions/calling/{appId}/settings`, but
         * is otherwise the same as [SettingService.create].
         */
        @MustBeClosed
        fun create(appId: Int, params: SettingCreateParams): HttpResponseFor<SettingsResponse> =
            create(appId, params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            appId: Int,
            params: SettingCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SettingsResponse> =
            create(params.toBuilder().appId(appId).build(), requestOptions)

        /** @see create */
        @MustBeClosed
        fun create(params: SettingCreateParams): HttpResponseFor<SettingsResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: SettingCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SettingsResponse>

        /**
         * Returns a raw HTTP response for `patch /crm/v3/extensions/calling/{appId}/settings`, but
         * is otherwise the same as [SettingService.update].
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
         * Returns a raw HTTP response for `delete /crm/v3/extensions/calling/{appId}/settings`, but
         * is otherwise the same as [SettingService.delete].
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
         * Returns a raw HTTP response for `get /crm/v3/extensions/calling/{appId}/settings`, but is
         * otherwise the same as [SettingService.get].
         */
        @MustBeClosed
        fun get(appId: Int): HttpResponseFor<SettingsResponse> = get(appId, SettingGetParams.none())

        /** @see get */
        @MustBeClosed
        fun get(
            appId: Int,
            params: SettingGetParams = SettingGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SettingsResponse> =
            get(params.toBuilder().appId(appId).build(), requestOptions)

        /** @see get */
        @MustBeClosed
        fun get(
            appId: Int,
            params: SettingGetParams = SettingGetParams.none(),
        ): HttpResponseFor<SettingsResponse> = get(appId, params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: SettingGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SettingsResponse>

        /** @see get */
        @MustBeClosed
        fun get(params: SettingGetParams): HttpResponseFor<SettingsResponse> =
            get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(appId: Int, requestOptions: RequestOptions): HttpResponseFor<SettingsResponse> =
            get(appId, SettingGetParams.none(), requestOptions)
    }
}
