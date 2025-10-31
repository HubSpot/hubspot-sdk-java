// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.crm.extensions.videoconferencing

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponse
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.crm.extensions.videoconferencing.ExternalSettings
import com.hubspot_sdk.api.models.crm.extensions.videoconferencing.settings.SettingDeleteParams
import com.hubspot_sdk.api.models.crm.extensions.videoconferencing.settings.SettingGetParams
import com.hubspot_sdk.api.models.crm.extensions.videoconferencing.settings.SettingUpdateParams
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

    fun update(appId: Int, params: SettingUpdateParams): CompletableFuture<ExternalSettings> =
        update(appId, params, RequestOptions.none())

    /** @see update */
    fun update(
        appId: Int,
        params: SettingUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExternalSettings> =
        update(params.toBuilder().appId(appId).build(), requestOptions)

    /** @see update */
    fun update(params: SettingUpdateParams): CompletableFuture<ExternalSettings> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: SettingUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExternalSettings>

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

    fun get(appId: Int): CompletableFuture<ExternalSettings> = get(appId, SettingGetParams.none())

    /** @see get */
    fun get(
        appId: Int,
        params: SettingGetParams = SettingGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExternalSettings> =
        get(params.toBuilder().appId(appId).build(), requestOptions)

    /** @see get */
    fun get(
        appId: Int,
        params: SettingGetParams = SettingGetParams.none(),
    ): CompletableFuture<ExternalSettings> = get(appId, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: SettingGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExternalSettings>

    /** @see get */
    fun get(params: SettingGetParams): CompletableFuture<ExternalSettings> =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(appId: Int, requestOptions: RequestOptions): CompletableFuture<ExternalSettings> =
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
         * Returns a raw HTTP response for `put
         * /crm/v3/extensions/videoconferencing/settings/{appId}`, but is otherwise the same as
         * [SettingServiceAsync.update].
         */
        fun update(
            appId: Int,
            params: SettingUpdateParams,
        ): CompletableFuture<HttpResponseFor<ExternalSettings>> =
            update(appId, params, RequestOptions.none())

        /** @see update */
        fun update(
            appId: Int,
            params: SettingUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExternalSettings>> =
            update(params.toBuilder().appId(appId).build(), requestOptions)

        /** @see update */
        fun update(
            params: SettingUpdateParams
        ): CompletableFuture<HttpResponseFor<ExternalSettings>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: SettingUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExternalSettings>>

        /**
         * Returns a raw HTTP response for `delete
         * /crm/v3/extensions/videoconferencing/settings/{appId}`, but is otherwise the same as
         * [SettingServiceAsync.delete].
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
         * Returns a raw HTTP response for `get
         * /crm/v3/extensions/videoconferencing/settings/{appId}`, but is otherwise the same as
         * [SettingServiceAsync.get].
         */
        fun get(appId: Int): CompletableFuture<HttpResponseFor<ExternalSettings>> =
            get(appId, SettingGetParams.none())

        /** @see get */
        fun get(
            appId: Int,
            params: SettingGetParams = SettingGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExternalSettings>> =
            get(params.toBuilder().appId(appId).build(), requestOptions)

        /** @see get */
        fun get(
            appId: Int,
            params: SettingGetParams = SettingGetParams.none(),
        ): CompletableFuture<HttpResponseFor<ExternalSettings>> =
            get(appId, params, RequestOptions.none())

        /** @see get */
        fun get(
            params: SettingGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExternalSettings>>

        /** @see get */
        fun get(params: SettingGetParams): CompletableFuture<HttpResponseFor<ExternalSettings>> =
            get(params, RequestOptions.none())

        /** @see get */
        fun get(
            appId: Int,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ExternalSettings>> =
            get(appId, SettingGetParams.none(), requestOptions)
    }
}
