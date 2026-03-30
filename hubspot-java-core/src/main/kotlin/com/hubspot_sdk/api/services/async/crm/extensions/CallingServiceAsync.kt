// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.crm.extensions

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponse
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.crm.extensions.calling.CallingCreateInboundCallParams
import com.hubspot_sdk.api.models.crm.extensions.calling.CallingCreateParams
import com.hubspot_sdk.api.models.crm.extensions.calling.CallingDeleteParams
import com.hubspot_sdk.api.models.crm.extensions.calling.CallingGetParams
import com.hubspot_sdk.api.models.crm.extensions.calling.CallingMarkReadyParams
import com.hubspot_sdk.api.models.crm.extensions.calling.CallingUpdateParams
import com.hubspot_sdk.api.models.crm.extensions.calling.CompletedThirdPartyCallRequest
import com.hubspot_sdk.api.models.crm.extensions.calling.CompletedThirdPartyCallResponse
import com.hubspot_sdk.api.models.crm.extensions.calling.MarkRecordingAsReadyRequest
import com.hubspot_sdk.api.models.crm.extensions.calling.RecordingSettingsResponse
import com.hubspot_sdk.api.services.async.crm.extensions.calling.TranscriptServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface CallingServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CallingServiceAsync

    fun transcripts(): TranscriptServiceAsync

    /** Create new recording settings for a specific app using the provided app ID. */
    fun create(
        appId: Int,
        params: CallingCreateParams,
    ): CompletableFuture<RecordingSettingsResponse> = create(appId, params, RequestOptions.none())

    /** @see create */
    fun create(
        appId: Int,
        params: CallingCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RecordingSettingsResponse> =
        create(params.toBuilder().appId(appId).build(), requestOptions)

    /** @see create */
    fun create(params: CallingCreateParams): CompletableFuture<RecordingSettingsResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: CallingCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RecordingSettingsResponse>

    /** Update the recording settings for a specific app using the provided app ID. */
    fun update(
        appId: Int,
        params: CallingUpdateParams,
    ): CompletableFuture<RecordingSettingsResponse> = update(appId, params, RequestOptions.none())

    /** @see update */
    fun update(
        appId: Int,
        params: CallingUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RecordingSettingsResponse> =
        update(params.toBuilder().appId(appId).build(), requestOptions)

    /** @see update */
    fun update(params: CallingUpdateParams): CompletableFuture<RecordingSettingsResponse> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: CallingUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RecordingSettingsResponse>

    /** Delete the channel connection settings associated with the specified app. */
    fun delete(appId: Int): CompletableFuture<Void?> = delete(appId, CallingDeleteParams.none())

    /** @see delete */
    fun delete(
        appId: Int,
        params: CallingDeleteParams = CallingDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = delete(params.toBuilder().appId(appId).build(), requestOptions)

    /** @see delete */
    fun delete(
        appId: Int,
        params: CallingDeleteParams = CallingDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(appId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: CallingDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: CallingDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(appId: Int, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(appId, CallingDeleteParams.none(), requestOptions)

    fun createInboundCall(
        params: CallingCreateInboundCallParams
    ): CompletableFuture<CompletedThirdPartyCallResponse> =
        createInboundCall(params, RequestOptions.none())

    /** @see createInboundCall */
    fun createInboundCall(
        params: CallingCreateInboundCallParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CompletedThirdPartyCallResponse>

    /** @see createInboundCall */
    fun createInboundCall(
        completedThirdPartyCallRequest: CompletedThirdPartyCallRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CompletedThirdPartyCallResponse> =
        createInboundCall(
            CallingCreateInboundCallParams.builder()
                .completedThirdPartyCallRequest(completedThirdPartyCallRequest)
                .build(),
            requestOptions,
        )

    /** @see createInboundCall */
    fun createInboundCall(
        completedThirdPartyCallRequest: CompletedThirdPartyCallRequest
    ): CompletableFuture<CompletedThirdPartyCallResponse> =
        createInboundCall(completedThirdPartyCallRequest, RequestOptions.none())

    /** Retrieve the current recording settings for a specific app using the provided app ID. */
    fun get(appId: Int): CompletableFuture<RecordingSettingsResponse> =
        get(appId, CallingGetParams.none())

    /** @see get */
    fun get(
        appId: Int,
        params: CallingGetParams = CallingGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RecordingSettingsResponse> =
        get(params.toBuilder().appId(appId).build(), requestOptions)

    /** @see get */
    fun get(
        appId: Int,
        params: CallingGetParams = CallingGetParams.none(),
    ): CompletableFuture<RecordingSettingsResponse> = get(appId, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: CallingGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RecordingSettingsResponse>

    /** @see get */
    fun get(params: CallingGetParams): CompletableFuture<RecordingSettingsResponse> =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(
        appId: Int,
        requestOptions: RequestOptions,
    ): CompletableFuture<RecordingSettingsResponse> =
        get(appId, CallingGetParams.none(), requestOptions)

    /**
     * This endpoint is used to mark a call recording as ready. It requires the engagementId to
     * identify the specific recording.
     */
    fun markReady(params: CallingMarkReadyParams): CompletableFuture<Void?> =
        markReady(params, RequestOptions.none())

    /** @see markReady */
    fun markReady(
        params: CallingMarkReadyParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see markReady */
    fun markReady(
        markRecordingAsReadyRequest: MarkRecordingAsReadyRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        markReady(
            CallingMarkReadyParams.builder()
                .markRecordingAsReadyRequest(markRecordingAsReadyRequest)
                .build(),
            requestOptions,
        )

    /** @see markReady */
    fun markReady(
        markRecordingAsReadyRequest: MarkRecordingAsReadyRequest
    ): CompletableFuture<Void?> = markReady(markRecordingAsReadyRequest, RequestOptions.none())

    /**
     * A view of [CallingServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CallingServiceAsync.WithRawResponse

        fun transcripts(): TranscriptServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post
         * /crm/extensions/calling/2026-03/{appId}/settings/recording`, but is otherwise the same as
         * [CallingServiceAsync.create].
         */
        fun create(
            appId: Int,
            params: CallingCreateParams,
        ): CompletableFuture<HttpResponseFor<RecordingSettingsResponse>> =
            create(appId, params, RequestOptions.none())

        /** @see create */
        fun create(
            appId: Int,
            params: CallingCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RecordingSettingsResponse>> =
            create(params.toBuilder().appId(appId).build(), requestOptions)

        /** @see create */
        fun create(
            params: CallingCreateParams
        ): CompletableFuture<HttpResponseFor<RecordingSettingsResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: CallingCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RecordingSettingsResponse>>

        /**
         * Returns a raw HTTP response for `patch
         * /crm/extensions/calling/2026-03/{appId}/settings/recording`, but is otherwise the same as
         * [CallingServiceAsync.update].
         */
        fun update(
            appId: Int,
            params: CallingUpdateParams,
        ): CompletableFuture<HttpResponseFor<RecordingSettingsResponse>> =
            update(appId, params, RequestOptions.none())

        /** @see update */
        fun update(
            appId: Int,
            params: CallingUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RecordingSettingsResponse>> =
            update(params.toBuilder().appId(appId).build(), requestOptions)

        /** @see update */
        fun update(
            params: CallingUpdateParams
        ): CompletableFuture<HttpResponseFor<RecordingSettingsResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: CallingUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RecordingSettingsResponse>>

        /**
         * Returns a raw HTTP response for `delete
         * /crm/extensions/calling/2026-03/{appId}/settings/channel-connection`, but is otherwise
         * the same as [CallingServiceAsync.delete].
         */
        fun delete(appId: Int): CompletableFuture<HttpResponse> =
            delete(appId, CallingDeleteParams.none())

        /** @see delete */
        fun delete(
            appId: Int,
            params: CallingDeleteParams = CallingDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().appId(appId).build(), requestOptions)

        /** @see delete */
        fun delete(
            appId: Int,
            params: CallingDeleteParams = CallingDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(appId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: CallingDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: CallingDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(appId: Int, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            delete(appId, CallingDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /crm/extensions/calling/2026-03/inbound-call`, but
         * is otherwise the same as [CallingServiceAsync.createInboundCall].
         */
        fun createInboundCall(
            params: CallingCreateInboundCallParams
        ): CompletableFuture<HttpResponseFor<CompletedThirdPartyCallResponse>> =
            createInboundCall(params, RequestOptions.none())

        /** @see createInboundCall */
        fun createInboundCall(
            params: CallingCreateInboundCallParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CompletedThirdPartyCallResponse>>

        /** @see createInboundCall */
        fun createInboundCall(
            completedThirdPartyCallRequest: CompletedThirdPartyCallRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CompletedThirdPartyCallResponse>> =
            createInboundCall(
                CallingCreateInboundCallParams.builder()
                    .completedThirdPartyCallRequest(completedThirdPartyCallRequest)
                    .build(),
                requestOptions,
            )

        /** @see createInboundCall */
        fun createInboundCall(
            completedThirdPartyCallRequest: CompletedThirdPartyCallRequest
        ): CompletableFuture<HttpResponseFor<CompletedThirdPartyCallResponse>> =
            createInboundCall(completedThirdPartyCallRequest, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `get
         * /crm/extensions/calling/2026-03/{appId}/settings/recording`, but is otherwise the same as
         * [CallingServiceAsync.get].
         */
        fun get(appId: Int): CompletableFuture<HttpResponseFor<RecordingSettingsResponse>> =
            get(appId, CallingGetParams.none())

        /** @see get */
        fun get(
            appId: Int,
            params: CallingGetParams = CallingGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RecordingSettingsResponse>> =
            get(params.toBuilder().appId(appId).build(), requestOptions)

        /** @see get */
        fun get(
            appId: Int,
            params: CallingGetParams = CallingGetParams.none(),
        ): CompletableFuture<HttpResponseFor<RecordingSettingsResponse>> =
            get(appId, params, RequestOptions.none())

        /** @see get */
        fun get(
            params: CallingGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RecordingSettingsResponse>>

        /** @see get */
        fun get(
            params: CallingGetParams
        ): CompletableFuture<HttpResponseFor<RecordingSettingsResponse>> =
            get(params, RequestOptions.none())

        /** @see get */
        fun get(
            appId: Int,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<RecordingSettingsResponse>> =
            get(appId, CallingGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /crm/extensions/calling/2026-03/recordings/ready`,
         * but is otherwise the same as [CallingServiceAsync.markReady].
         */
        fun markReady(params: CallingMarkReadyParams): CompletableFuture<HttpResponse> =
            markReady(params, RequestOptions.none())

        /** @see markReady */
        fun markReady(
            params: CallingMarkReadyParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see markReady */
        fun markReady(
            markRecordingAsReadyRequest: MarkRecordingAsReadyRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            markReady(
                CallingMarkReadyParams.builder()
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
