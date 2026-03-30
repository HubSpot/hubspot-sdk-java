// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.marketing.events

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.marketing.events.EventDetailSettings
import com.hubspot_sdk.api.models.marketing.events.settings.SettingCreateOrUpdateParams
import com.hubspot_sdk.api.models.marketing.events.settings.SettingGetParams
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

    /** Create or update the current settings for the application. */
    fun createOrUpdate(
        appId: Int,
        params: SettingCreateOrUpdateParams,
    ): CompletableFuture<EventDetailSettings> = createOrUpdate(appId, params, RequestOptions.none())

    /** @see createOrUpdate */
    fun createOrUpdate(
        appId: Int,
        params: SettingCreateOrUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EventDetailSettings> =
        createOrUpdate(params.toBuilder().appId(appId).build(), requestOptions)

    /** @see createOrUpdate */
    fun createOrUpdate(
        params: SettingCreateOrUpdateParams
    ): CompletableFuture<EventDetailSettings> = createOrUpdate(params, RequestOptions.none())

    /** @see createOrUpdate */
    fun createOrUpdate(
        params: SettingCreateOrUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EventDetailSettings>

    /** Retrieve the current settings for the application. */
    fun get(appId: Int): CompletableFuture<EventDetailSettings> =
        get(appId, SettingGetParams.none())

    /** @see get */
    fun get(
        appId: Int,
        params: SettingGetParams = SettingGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EventDetailSettings> =
        get(params.toBuilder().appId(appId).build(), requestOptions)

    /** @see get */
    fun get(
        appId: Int,
        params: SettingGetParams = SettingGetParams.none(),
    ): CompletableFuture<EventDetailSettings> = get(appId, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: SettingGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EventDetailSettings>

    /** @see get */
    fun get(params: SettingGetParams): CompletableFuture<EventDetailSettings> =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(appId: Int, requestOptions: RequestOptions): CompletableFuture<EventDetailSettings> =
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
         * Returns a raw HTTP response for `post
         * /marketing/marketing-events/2026-03/{appId}/settings`, but is otherwise the same as
         * [SettingServiceAsync.createOrUpdate].
         */
        fun createOrUpdate(
            appId: Int,
            params: SettingCreateOrUpdateParams,
        ): CompletableFuture<HttpResponseFor<EventDetailSettings>> =
            createOrUpdate(appId, params, RequestOptions.none())

        /** @see createOrUpdate */
        fun createOrUpdate(
            appId: Int,
            params: SettingCreateOrUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EventDetailSettings>> =
            createOrUpdate(params.toBuilder().appId(appId).build(), requestOptions)

        /** @see createOrUpdate */
        fun createOrUpdate(
            params: SettingCreateOrUpdateParams
        ): CompletableFuture<HttpResponseFor<EventDetailSettings>> =
            createOrUpdate(params, RequestOptions.none())

        /** @see createOrUpdate */
        fun createOrUpdate(
            params: SettingCreateOrUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EventDetailSettings>>

        /**
         * Returns a raw HTTP response for `get
         * /marketing/marketing-events/2026-03/{appId}/settings`, but is otherwise the same as
         * [SettingServiceAsync.get].
         */
        fun get(appId: Int): CompletableFuture<HttpResponseFor<EventDetailSettings>> =
            get(appId, SettingGetParams.none())

        /** @see get */
        fun get(
            appId: Int,
            params: SettingGetParams = SettingGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EventDetailSettings>> =
            get(params.toBuilder().appId(appId).build(), requestOptions)

        /** @see get */
        fun get(
            appId: Int,
            params: SettingGetParams = SettingGetParams.none(),
        ): CompletableFuture<HttpResponseFor<EventDetailSettings>> =
            get(appId, params, RequestOptions.none())

        /** @see get */
        fun get(
            params: SettingGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EventDetailSettings>>

        /** @see get */
        fun get(params: SettingGetParams): CompletableFuture<HttpResponseFor<EventDetailSettings>> =
            get(params, RequestOptions.none())

        /** @see get */
        fun get(
            appId: Int,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<EventDetailSettings>> =
            get(appId, SettingGetParams.none(), requestOptions)
    }
}
