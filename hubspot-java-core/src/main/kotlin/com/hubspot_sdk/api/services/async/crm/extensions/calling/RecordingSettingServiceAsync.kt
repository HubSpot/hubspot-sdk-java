// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.crm.extensions.calling

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponse
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.crm.extensions.calling.MarkRecordingAsReadyRequest
import com.hubspot_sdk.api.models.crm.extensions.calling.RecordingSettingsResponse
import com.hubspot_sdk.api.models.crm.extensions.calling.recordingsettings.RecordingSettingCreateParams
import com.hubspot_sdk.api.models.crm.extensions.calling.recordingsettings.RecordingSettingGetParams
import com.hubspot_sdk.api.models.crm.extensions.calling.recordingsettings.RecordingSettingMarkReadyParams
import com.hubspot_sdk.api.models.crm.extensions.calling.recordingsettings.RecordingSettingUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface RecordingSettingServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): RecordingSettingServiceAsync

    fun create(
        appId: Int,
        params: RecordingSettingCreateParams,
    ): CompletableFuture<RecordingSettingsResponse> = create(appId, params, RequestOptions.none())

    /** @see create */
    fun create(
        appId: Int,
        params: RecordingSettingCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RecordingSettingsResponse> =
        create(params.toBuilder().appId(appId).build(), requestOptions)

    /** @see create */
    fun create(params: RecordingSettingCreateParams): CompletableFuture<RecordingSettingsResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: RecordingSettingCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RecordingSettingsResponse>

    fun update(
        appId: Int,
        params: RecordingSettingUpdateParams,
    ): CompletableFuture<RecordingSettingsResponse> = update(appId, params, RequestOptions.none())

    /** @see update */
    fun update(
        appId: Int,
        params: RecordingSettingUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RecordingSettingsResponse> =
        update(params.toBuilder().appId(appId).build(), requestOptions)

    /** @see update */
    fun update(params: RecordingSettingUpdateParams): CompletableFuture<RecordingSettingsResponse> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: RecordingSettingUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RecordingSettingsResponse>

    fun get(appId: Int): CompletableFuture<RecordingSettingsResponse> =
        get(appId, RecordingSettingGetParams.none())

    /** @see get */
    fun get(
        appId: Int,
        params: RecordingSettingGetParams = RecordingSettingGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RecordingSettingsResponse> =
        get(params.toBuilder().appId(appId).build(), requestOptions)

    /** @see get */
    fun get(
        appId: Int,
        params: RecordingSettingGetParams = RecordingSettingGetParams.none(),
    ): CompletableFuture<RecordingSettingsResponse> = get(appId, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: RecordingSettingGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RecordingSettingsResponse>

    /** @see get */
    fun get(params: RecordingSettingGetParams): CompletableFuture<RecordingSettingsResponse> =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(
        appId: Int,
        requestOptions: RequestOptions,
    ): CompletableFuture<RecordingSettingsResponse> =
        get(appId, RecordingSettingGetParams.none(), requestOptions)

    fun markReady(params: RecordingSettingMarkReadyParams): CompletableFuture<Void?> =
        markReady(params, RequestOptions.none())

    /** @see markReady */
    fun markReady(
        params: RecordingSettingMarkReadyParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see markReady */
    fun markReady(
        markRecordingAsReadyRequest: MarkRecordingAsReadyRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        markReady(
            RecordingSettingMarkReadyParams.builder()
                .markRecordingAsReadyRequest(markRecordingAsReadyRequest)
                .build(),
            requestOptions,
        )

    /** @see markReady */
    fun markReady(
        markRecordingAsReadyRequest: MarkRecordingAsReadyRequest
    ): CompletableFuture<Void?> = markReady(markRecordingAsReadyRequest, RequestOptions.none())

    /**
     * A view of [RecordingSettingServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): RecordingSettingServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post
         * /crm/v3/extensions/calling/{appId}/settings/recording`, but is otherwise the same as
         * [RecordingSettingServiceAsync.create].
         */
        fun create(
            appId: Int,
            params: RecordingSettingCreateParams,
        ): CompletableFuture<HttpResponseFor<RecordingSettingsResponse>> =
            create(appId, params, RequestOptions.none())

        /** @see create */
        fun create(
            appId: Int,
            params: RecordingSettingCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RecordingSettingsResponse>> =
            create(params.toBuilder().appId(appId).build(), requestOptions)

        /** @see create */
        fun create(
            params: RecordingSettingCreateParams
        ): CompletableFuture<HttpResponseFor<RecordingSettingsResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: RecordingSettingCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RecordingSettingsResponse>>

        /**
         * Returns a raw HTTP response for `patch
         * /crm/v3/extensions/calling/{appId}/settings/recording`, but is otherwise the same as
         * [RecordingSettingServiceAsync.update].
         */
        fun update(
            appId: Int,
            params: RecordingSettingUpdateParams,
        ): CompletableFuture<HttpResponseFor<RecordingSettingsResponse>> =
            update(appId, params, RequestOptions.none())

        /** @see update */
        fun update(
            appId: Int,
            params: RecordingSettingUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RecordingSettingsResponse>> =
            update(params.toBuilder().appId(appId).build(), requestOptions)

        /** @see update */
        fun update(
            params: RecordingSettingUpdateParams
        ): CompletableFuture<HttpResponseFor<RecordingSettingsResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: RecordingSettingUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RecordingSettingsResponse>>

        /**
         * Returns a raw HTTP response for `get
         * /crm/v3/extensions/calling/{appId}/settings/recording`, but is otherwise the same as
         * [RecordingSettingServiceAsync.get].
         */
        fun get(appId: Int): CompletableFuture<HttpResponseFor<RecordingSettingsResponse>> =
            get(appId, RecordingSettingGetParams.none())

        /** @see get */
        fun get(
            appId: Int,
            params: RecordingSettingGetParams = RecordingSettingGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RecordingSettingsResponse>> =
            get(params.toBuilder().appId(appId).build(), requestOptions)

        /** @see get */
        fun get(
            appId: Int,
            params: RecordingSettingGetParams = RecordingSettingGetParams.none(),
        ): CompletableFuture<HttpResponseFor<RecordingSettingsResponse>> =
            get(appId, params, RequestOptions.none())

        /** @see get */
        fun get(
            params: RecordingSettingGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RecordingSettingsResponse>>

        /** @see get */
        fun get(
            params: RecordingSettingGetParams
        ): CompletableFuture<HttpResponseFor<RecordingSettingsResponse>> =
            get(params, RequestOptions.none())

        /** @see get */
        fun get(
            appId: Int,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<RecordingSettingsResponse>> =
            get(appId, RecordingSettingGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /crm/v3/extensions/calling/recordings/ready`, but
         * is otherwise the same as [RecordingSettingServiceAsync.markReady].
         */
        fun markReady(params: RecordingSettingMarkReadyParams): CompletableFuture<HttpResponse> =
            markReady(params, RequestOptions.none())

        /** @see markReady */
        fun markReady(
            params: RecordingSettingMarkReadyParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see markReady */
        fun markReady(
            markRecordingAsReadyRequest: MarkRecordingAsReadyRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            markReady(
                RecordingSettingMarkReadyParams.builder()
                    .markRecordingAsReadyRequest(markRecordingAsReadyRequest)
                    .build(),
                requestOptions,
            )

        /** @see markReady */
        fun markReady(
            markRecordingAsReadyRequest: MarkRecordingAsReadyRequest
        ): CompletableFuture<HttpResponse> =
            markReady(markRecordingAsReadyRequest, RequestOptions.none())
    }
}
