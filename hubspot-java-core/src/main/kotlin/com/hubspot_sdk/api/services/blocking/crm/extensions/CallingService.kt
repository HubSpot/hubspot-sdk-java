// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.crm.extensions

import com.google.errorprone.annotations.MustBeClosed
import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponse
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.crm.extensions.calling.CallingCreateParams
import com.hubspot_sdk.api.models.crm.extensions.calling.CallingDeleteParams
import com.hubspot_sdk.api.models.crm.extensions.calling.CallingGetParams
import com.hubspot_sdk.api.models.crm.extensions.calling.CallingMarkReadyParams
import com.hubspot_sdk.api.models.crm.extensions.calling.CallingUpdateParams
import com.hubspot_sdk.api.models.crm.extensions.calling.MarkRecordingAsReadyRequest
import com.hubspot_sdk.api.models.crm.extensions.calling.RecordingSettingsResponse
import com.hubspot_sdk.api.services.blocking.crm.extensions.calling.TranscriptService
import java.util.function.Consumer

interface CallingService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CallingService

    fun transcripts(): TranscriptService

    fun create(appId: Int, params: CallingCreateParams): RecordingSettingsResponse =
        create(appId, params, RequestOptions.none())

    /** @see create */
    fun create(
        appId: Int,
        params: CallingCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RecordingSettingsResponse = create(params.toBuilder().appId(appId).build(), requestOptions)

    /** @see create */
    fun create(params: CallingCreateParams): RecordingSettingsResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: CallingCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RecordingSettingsResponse

    fun update(appId: Int, params: CallingUpdateParams): RecordingSettingsResponse =
        update(appId, params, RequestOptions.none())

    /** @see update */
    fun update(
        appId: Int,
        params: CallingUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RecordingSettingsResponse = update(params.toBuilder().appId(appId).build(), requestOptions)

    /** @see update */
    fun update(params: CallingUpdateParams): RecordingSettingsResponse =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: CallingUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RecordingSettingsResponse

    fun delete(appId: Int) = delete(appId, CallingDeleteParams.none())

    /** @see delete */
    fun delete(
        appId: Int,
        params: CallingDeleteParams = CallingDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().appId(appId).build(), requestOptions)

    /** @see delete */
    fun delete(appId: Int, params: CallingDeleteParams = CallingDeleteParams.none()) =
        delete(appId, params, RequestOptions.none())

    /** @see delete */
    fun delete(params: CallingDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see delete */
    fun delete(params: CallingDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(appId: Int, requestOptions: RequestOptions) =
        delete(appId, CallingDeleteParams.none(), requestOptions)

    fun get(appId: Int): RecordingSettingsResponse = get(appId, CallingGetParams.none())

    /** @see get */
    fun get(
        appId: Int,
        params: CallingGetParams = CallingGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RecordingSettingsResponse = get(params.toBuilder().appId(appId).build(), requestOptions)

    /** @see get */
    fun get(
        appId: Int,
        params: CallingGetParams = CallingGetParams.none(),
    ): RecordingSettingsResponse = get(appId, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: CallingGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RecordingSettingsResponse

    /** @see get */
    fun get(params: CallingGetParams): RecordingSettingsResponse =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(appId: Int, requestOptions: RequestOptions): RecordingSettingsResponse =
        get(appId, CallingGetParams.none(), requestOptions)

    fun markReady(params: CallingMarkReadyParams) = markReady(params, RequestOptions.none())

    /** @see markReady */
    fun markReady(
        params: CallingMarkReadyParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see markReady */
    fun markReady(
        markRecordingAsReadyRequest: MarkRecordingAsReadyRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) =
        markReady(
            CallingMarkReadyParams.builder()
                .markRecordingAsReadyRequest(markRecordingAsReadyRequest)
                .build(),
            requestOptions,
        )

    /** @see markReady */
    fun markReady(markRecordingAsReadyRequest: MarkRecordingAsReadyRequest) =
        markReady(markRecordingAsReadyRequest, RequestOptions.none())

    /** A view of [CallingService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): CallingService.WithRawResponse

        fun transcripts(): TranscriptService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post
         * /crm/extensions/calling/2026-03/{appId}/settings/recording`, but is otherwise the same as
         * [CallingService.create].
         */
        @MustBeClosed
        fun create(
            appId: Int,
            params: CallingCreateParams,
        ): HttpResponseFor<RecordingSettingsResponse> = create(appId, params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            appId: Int,
            params: CallingCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RecordingSettingsResponse> =
            create(params.toBuilder().appId(appId).build(), requestOptions)

        /** @see create */
        @MustBeClosed
        fun create(params: CallingCreateParams): HttpResponseFor<RecordingSettingsResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: CallingCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RecordingSettingsResponse>

        /**
         * Returns a raw HTTP response for `patch
         * /crm/extensions/calling/2026-03/{appId}/settings/recording`, but is otherwise the same as
         * [CallingService.update].
         */
        @MustBeClosed
        fun update(
            appId: Int,
            params: CallingUpdateParams,
        ): HttpResponseFor<RecordingSettingsResponse> = update(appId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            appId: Int,
            params: CallingUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RecordingSettingsResponse> =
            update(params.toBuilder().appId(appId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: CallingUpdateParams): HttpResponseFor<RecordingSettingsResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: CallingUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RecordingSettingsResponse>

        /**
         * Returns a raw HTTP response for `delete
         * /crm/extensions/calling/2026-03/{appId}/settings/channel-connection`, but is otherwise
         * the same as [CallingService.delete].
         */
        @MustBeClosed
        fun delete(appId: Int): HttpResponse = delete(appId, CallingDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            appId: Int,
            params: CallingDeleteParams = CallingDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().appId(appId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            appId: Int,
            params: CallingDeleteParams = CallingDeleteParams.none(),
        ): HttpResponse = delete(appId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: CallingDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: CallingDeleteParams): HttpResponse =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(appId: Int, requestOptions: RequestOptions): HttpResponse =
            delete(appId, CallingDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get
         * /crm/extensions/calling/2026-03/{appId}/settings/recording`, but is otherwise the same as
         * [CallingService.get].
         */
        @MustBeClosed
        fun get(appId: Int): HttpResponseFor<RecordingSettingsResponse> =
            get(appId, CallingGetParams.none())

        /** @see get */
        @MustBeClosed
        fun get(
            appId: Int,
            params: CallingGetParams = CallingGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RecordingSettingsResponse> =
            get(params.toBuilder().appId(appId).build(), requestOptions)

        /** @see get */
        @MustBeClosed
        fun get(
            appId: Int,
            params: CallingGetParams = CallingGetParams.none(),
        ): HttpResponseFor<RecordingSettingsResponse> = get(appId, params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: CallingGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RecordingSettingsResponse>

        /** @see get */
        @MustBeClosed
        fun get(params: CallingGetParams): HttpResponseFor<RecordingSettingsResponse> =
            get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            appId: Int,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RecordingSettingsResponse> =
            get(appId, CallingGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /crm/extensions/calling/2026-03/recordings/ready`,
         * but is otherwise the same as [CallingService.markReady].
         */
        @MustBeClosed
        fun markReady(params: CallingMarkReadyParams): HttpResponse =
            markReady(params, RequestOptions.none())

        /** @see markReady */
        @MustBeClosed
        fun markReady(
            params: CallingMarkReadyParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see markReady */
        @MustBeClosed
        fun markReady(
            markRecordingAsReadyRequest: MarkRecordingAsReadyRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            markReady(
                CallingMarkReadyParams.builder()
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
