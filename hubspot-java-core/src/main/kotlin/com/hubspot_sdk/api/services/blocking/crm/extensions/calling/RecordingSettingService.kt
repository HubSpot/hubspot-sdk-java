// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.crm.extensions.calling

import com.google.errorprone.annotations.MustBeClosed
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
import java.util.function.Consumer

interface RecordingSettingService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): RecordingSettingService

    fun create(appId: Int, params: RecordingSettingCreateParams): RecordingSettingsResponse =
        create(appId, params, RequestOptions.none())

    /** @see create */
    fun create(
        appId: Int,
        params: RecordingSettingCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RecordingSettingsResponse = create(params.toBuilder().appId(appId).build(), requestOptions)

    /** @see create */
    fun create(params: RecordingSettingCreateParams): RecordingSettingsResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: RecordingSettingCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RecordingSettingsResponse

    fun update(appId: Int, params: RecordingSettingUpdateParams): RecordingSettingsResponse =
        update(appId, params, RequestOptions.none())

    /** @see update */
    fun update(
        appId: Int,
        params: RecordingSettingUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RecordingSettingsResponse = update(params.toBuilder().appId(appId).build(), requestOptions)

    /** @see update */
    fun update(params: RecordingSettingUpdateParams): RecordingSettingsResponse =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: RecordingSettingUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RecordingSettingsResponse

    fun get(appId: Int): RecordingSettingsResponse = get(appId, RecordingSettingGetParams.none())

    /** @see get */
    fun get(
        appId: Int,
        params: RecordingSettingGetParams = RecordingSettingGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RecordingSettingsResponse = get(params.toBuilder().appId(appId).build(), requestOptions)

    /** @see get */
    fun get(
        appId: Int,
        params: RecordingSettingGetParams = RecordingSettingGetParams.none(),
    ): RecordingSettingsResponse = get(appId, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: RecordingSettingGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RecordingSettingsResponse

    /** @see get */
    fun get(params: RecordingSettingGetParams): RecordingSettingsResponse =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(appId: Int, requestOptions: RequestOptions): RecordingSettingsResponse =
        get(appId, RecordingSettingGetParams.none(), requestOptions)

    fun markReady(params: RecordingSettingMarkReadyParams) =
        markReady(params, RequestOptions.none())

    /** @see markReady */
    fun markReady(
        params: RecordingSettingMarkReadyParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see markReady */
    fun markReady(
        markRecordingAsReadyRequest: MarkRecordingAsReadyRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) =
        markReady(
            RecordingSettingMarkReadyParams.builder()
                .markRecordingAsReadyRequest(markRecordingAsReadyRequest)
                .build(),
            requestOptions,
        )

    /** @see markReady */
    fun markReady(markRecordingAsReadyRequest: MarkRecordingAsReadyRequest) =
        markReady(markRecordingAsReadyRequest, RequestOptions.none())

    /**
     * A view of [RecordingSettingService] that provides access to raw HTTP responses for each
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
        ): RecordingSettingService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post
         * /crm/v3/extensions/calling/{appId}/settings/recording`, but is otherwise the same as
         * [RecordingSettingService.create].
         */
        @MustBeClosed
        fun create(
            appId: Int,
            params: RecordingSettingCreateParams,
        ): HttpResponseFor<RecordingSettingsResponse> = create(appId, params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            appId: Int,
            params: RecordingSettingCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RecordingSettingsResponse> =
            create(params.toBuilder().appId(appId).build(), requestOptions)

        /** @see create */
        @MustBeClosed
        fun create(
            params: RecordingSettingCreateParams
        ): HttpResponseFor<RecordingSettingsResponse> = create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: RecordingSettingCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RecordingSettingsResponse>

        /**
         * Returns a raw HTTP response for `patch
         * /crm/v3/extensions/calling/{appId}/settings/recording`, but is otherwise the same as
         * [RecordingSettingService.update].
         */
        @MustBeClosed
        fun update(
            appId: Int,
            params: RecordingSettingUpdateParams,
        ): HttpResponseFor<RecordingSettingsResponse> = update(appId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            appId: Int,
            params: RecordingSettingUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RecordingSettingsResponse> =
            update(params.toBuilder().appId(appId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            params: RecordingSettingUpdateParams
        ): HttpResponseFor<RecordingSettingsResponse> = update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: RecordingSettingUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RecordingSettingsResponse>

        /**
         * Returns a raw HTTP response for `get
         * /crm/v3/extensions/calling/{appId}/settings/recording`, but is otherwise the same as
         * [RecordingSettingService.get].
         */
        @MustBeClosed
        fun get(appId: Int): HttpResponseFor<RecordingSettingsResponse> =
            get(appId, RecordingSettingGetParams.none())

        /** @see get */
        @MustBeClosed
        fun get(
            appId: Int,
            params: RecordingSettingGetParams = RecordingSettingGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RecordingSettingsResponse> =
            get(params.toBuilder().appId(appId).build(), requestOptions)

        /** @see get */
        @MustBeClosed
        fun get(
            appId: Int,
            params: RecordingSettingGetParams = RecordingSettingGetParams.none(),
        ): HttpResponseFor<RecordingSettingsResponse> = get(appId, params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: RecordingSettingGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RecordingSettingsResponse>

        /** @see get */
        @MustBeClosed
        fun get(params: RecordingSettingGetParams): HttpResponseFor<RecordingSettingsResponse> =
            get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            appId: Int,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RecordingSettingsResponse> =
            get(appId, RecordingSettingGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /crm/v3/extensions/calling/recordings/ready`, but
         * is otherwise the same as [RecordingSettingService.markReady].
         */
        @MustBeClosed
        fun markReady(params: RecordingSettingMarkReadyParams): HttpResponse =
            markReady(params, RequestOptions.none())

        /** @see markReady */
        @MustBeClosed
        fun markReady(
            params: RecordingSettingMarkReadyParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see markReady */
        @MustBeClosed
        fun markReady(
            markRecordingAsReadyRequest: MarkRecordingAsReadyRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            markReady(
                RecordingSettingMarkReadyParams.builder()
                    .markRecordingAsReadyRequest(markRecordingAsReadyRequest)
                    .build(),
                requestOptions,
            )

        /** @see markReady */
        @MustBeClosed
        fun markReady(markRecordingAsReadyRequest: MarkRecordingAsReadyRequest): HttpResponse =
            markReady(markRecordingAsReadyRequest, RequestOptions.none())
    }
}
