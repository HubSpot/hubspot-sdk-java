// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.marketing.events

import com.google.errorprone.annotations.MustBeClosed
import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.marketing.events.EventDetailSettings
import com.hubspot_sdk.api.models.marketing.events.settings.SettingCreateOrUpdateParams
import com.hubspot_sdk.api.models.marketing.events.settings.SettingGetParams
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

    fun createOrUpdate(appId: Int, params: SettingCreateOrUpdateParams): EventDetailSettings =
        createOrUpdate(appId, params, RequestOptions.none())

    /** @see createOrUpdate */
    fun createOrUpdate(
        appId: Int,
        params: SettingCreateOrUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EventDetailSettings = createOrUpdate(params.toBuilder().appId(appId).build(), requestOptions)

    /** @see createOrUpdate */
    fun createOrUpdate(params: SettingCreateOrUpdateParams): EventDetailSettings =
        createOrUpdate(params, RequestOptions.none())

    /** @see createOrUpdate */
    fun createOrUpdate(
        params: SettingCreateOrUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EventDetailSettings

    fun get(appId: Int): EventDetailSettings = get(appId, SettingGetParams.none())

    /** @see get */
    fun get(
        appId: Int,
        params: SettingGetParams = SettingGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EventDetailSettings = get(params.toBuilder().appId(appId).build(), requestOptions)

    /** @see get */
    fun get(appId: Int, params: SettingGetParams = SettingGetParams.none()): EventDetailSettings =
        get(appId, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: SettingGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EventDetailSettings

    /** @see get */
    fun get(params: SettingGetParams): EventDetailSettings = get(params, RequestOptions.none())

    /** @see get */
    fun get(appId: Int, requestOptions: RequestOptions): EventDetailSettings =
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
         * Returns a raw HTTP response for `post
         * /marketing/marketing-events/2026-03/{appId}/settings`, but is otherwise the same as
         * [SettingService.createOrUpdate].
         */
        @MustBeClosed
        fun createOrUpdate(
            appId: Int,
            params: SettingCreateOrUpdateParams,
        ): HttpResponseFor<EventDetailSettings> =
            createOrUpdate(appId, params, RequestOptions.none())

        /** @see createOrUpdate */
        @MustBeClosed
        fun createOrUpdate(
            appId: Int,
            params: SettingCreateOrUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EventDetailSettings> =
            createOrUpdate(params.toBuilder().appId(appId).build(), requestOptions)

        /** @see createOrUpdate */
        @MustBeClosed
        fun createOrUpdate(
            params: SettingCreateOrUpdateParams
        ): HttpResponseFor<EventDetailSettings> = createOrUpdate(params, RequestOptions.none())

        /** @see createOrUpdate */
        @MustBeClosed
        fun createOrUpdate(
            params: SettingCreateOrUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EventDetailSettings>

        /**
         * Returns a raw HTTP response for `get
         * /marketing/marketing-events/2026-03/{appId}/settings`, but is otherwise the same as
         * [SettingService.get].
         */
        @MustBeClosed
        fun get(appId: Int): HttpResponseFor<EventDetailSettings> =
            get(appId, SettingGetParams.none())

        /** @see get */
        @MustBeClosed
        fun get(
            appId: Int,
            params: SettingGetParams = SettingGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EventDetailSettings> =
            get(params.toBuilder().appId(appId).build(), requestOptions)

        /** @see get */
        @MustBeClosed
        fun get(
            appId: Int,
            params: SettingGetParams = SettingGetParams.none(),
        ): HttpResponseFor<EventDetailSettings> = get(appId, params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: SettingGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EventDetailSettings>

        /** @see get */
        @MustBeClosed
        fun get(params: SettingGetParams): HttpResponseFor<EventDetailSettings> =
            get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(appId: Int, requestOptions: RequestOptions): HttpResponseFor<EventDetailSettings> =
            get(appId, SettingGetParams.none(), requestOptions)
    }
}
