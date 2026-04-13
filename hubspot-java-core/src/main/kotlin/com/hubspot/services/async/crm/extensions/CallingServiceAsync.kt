// File generated from our OpenAPI spec by Stainless.

package com.hubspot.services.async.crm.extensions

import com.hubspot.core.ClientOptions
import com.hubspot.core.RequestOptions
import com.hubspot.core.http.HttpResponse
import com.hubspot.core.http.HttpResponseFor
import com.hubspot.models.crm.extensions.calling.CallingCreateChannelConnectionSettingsParams
import com.hubspot.models.crm.extensions.calling.CallingCreateInboundCallParams
import com.hubspot.models.crm.extensions.calling.CallingCreateRecordingReadyParams
import com.hubspot.models.crm.extensions.calling.CallingCreateRecordingSettingsParams
import com.hubspot.models.crm.extensions.calling.CallingCreateSettingsParams
import com.hubspot.models.crm.extensions.calling.CallingDeleteChannelConnectionSettingsParams
import com.hubspot.models.crm.extensions.calling.CallingDeleteSettingsParams
import com.hubspot.models.crm.extensions.calling.CallingGetChannelConnectionSettingsParams
import com.hubspot.models.crm.extensions.calling.CallingGetRecordingSettingsParams
import com.hubspot.models.crm.extensions.calling.CallingGetSettingsParams
import com.hubspot.models.crm.extensions.calling.CallingUpdateChannelConnectionSettingsParams
import com.hubspot.models.crm.extensions.calling.CallingUpdateRecordingSettingsParams
import com.hubspot.models.crm.extensions.calling.CallingUpdateSettingsParams
import com.hubspot.models.crm.extensions.calling.ChannelConnectionSettingsResponse
import com.hubspot.models.crm.extensions.calling.CompletedThirdPartyCallRequest
import com.hubspot.models.crm.extensions.calling.CompletedThirdPartyCallResponse
import com.hubspot.models.crm.extensions.calling.MarkRecordingAsReadyRequest
import com.hubspot.models.crm.extensions.calling.RecordingSettingsResponse
import com.hubspot.models.crm.extensions.calling.SettingsResponse
import com.hubspot.services.async.crm.extensions.calling.TranscriptServiceAsync
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

    /** Establish new channel connection settings for the specified app. */
    fun createChannelConnectionSettings(
        appId: Int,
        params: CallingCreateChannelConnectionSettingsParams,
    ): CompletableFuture<ChannelConnectionSettingsResponse> =
        createChannelConnectionSettings(appId, params, RequestOptions.none())

    /** @see createChannelConnectionSettings */
    fun createChannelConnectionSettings(
        appId: Int,
        params: CallingCreateChannelConnectionSettingsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ChannelConnectionSettingsResponse> =
        createChannelConnectionSettings(params.toBuilder().appId(appId).build(), requestOptions)

    /** @see createChannelConnectionSettings */
    fun createChannelConnectionSettings(
        params: CallingCreateChannelConnectionSettingsParams
    ): CompletableFuture<ChannelConnectionSettingsResponse> =
        createChannelConnectionSettings(params, RequestOptions.none())

    /** @see createChannelConnectionSettings */
    fun createChannelConnectionSettings(
        params: CallingCreateChannelConnectionSettingsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ChannelConnectionSettingsResponse>

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

    /**
     * This endpoint is used to mark a call recording as ready. It requires the engagementId to
     * identify the specific recording.
     */
    fun createRecordingReady(params: CallingCreateRecordingReadyParams): CompletableFuture<Void?> =
        createRecordingReady(params, RequestOptions.none())

    /** @see createRecordingReady */
    fun createRecordingReady(
        params: CallingCreateRecordingReadyParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see createRecordingReady */
    fun createRecordingReady(
        markRecordingAsReadyRequest: MarkRecordingAsReadyRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        createRecordingReady(
            CallingCreateRecordingReadyParams.builder()
                .markRecordingAsReadyRequest(markRecordingAsReadyRequest)
                .build(),
            requestOptions,
        )

    /** @see createRecordingReady */
    fun createRecordingReady(
        markRecordingAsReadyRequest: MarkRecordingAsReadyRequest
    ): CompletableFuture<Void?> =
        createRecordingReady(markRecordingAsReadyRequest, RequestOptions.none())

    /** Create new recording settings for a specific app using the provided app ID. */
    fun createRecordingSettings(
        appId: Int,
        params: CallingCreateRecordingSettingsParams,
    ): CompletableFuture<RecordingSettingsResponse> =
        createRecordingSettings(appId, params, RequestOptions.none())

    /** @see createRecordingSettings */
    fun createRecordingSettings(
        appId: Int,
        params: CallingCreateRecordingSettingsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RecordingSettingsResponse> =
        createRecordingSettings(params.toBuilder().appId(appId).build(), requestOptions)

    /** @see createRecordingSettings */
    fun createRecordingSettings(
        params: CallingCreateRecordingSettingsParams
    ): CompletableFuture<RecordingSettingsResponse> =
        createRecordingSettings(params, RequestOptions.none())

    /** @see createRecordingSettings */
    fun createRecordingSettings(
        params: CallingCreateRecordingSettingsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RecordingSettingsResponse>

    /** Create new settings for the calling extension associated with the specified appId. */
    fun createSettings(
        appId: Int,
        params: CallingCreateSettingsParams,
    ): CompletableFuture<SettingsResponse> = createSettings(appId, params, RequestOptions.none())

    /** @see createSettings */
    fun createSettings(
        appId: Int,
        params: CallingCreateSettingsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SettingsResponse> =
        createSettings(params.toBuilder().appId(appId).build(), requestOptions)

    /** @see createSettings */
    fun createSettings(params: CallingCreateSettingsParams): CompletableFuture<SettingsResponse> =
        createSettings(params, RequestOptions.none())

    /** @see createSettings */
    fun createSettings(
        params: CallingCreateSettingsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SettingsResponse>

    /** Delete the channel connection settings associated with the specified app. */
    fun deleteChannelConnectionSettings(appId: Int): CompletableFuture<Void?> =
        deleteChannelConnectionSettings(appId, CallingDeleteChannelConnectionSettingsParams.none())

    /** @see deleteChannelConnectionSettings */
    fun deleteChannelConnectionSettings(
        appId: Int,
        params: CallingDeleteChannelConnectionSettingsParams =
            CallingDeleteChannelConnectionSettingsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        deleteChannelConnectionSettings(params.toBuilder().appId(appId).build(), requestOptions)

    /** @see deleteChannelConnectionSettings */
    fun deleteChannelConnectionSettings(
        appId: Int,
        params: CallingDeleteChannelConnectionSettingsParams =
            CallingDeleteChannelConnectionSettingsParams.none(),
    ): CompletableFuture<Void?> =
        deleteChannelConnectionSettings(appId, params, RequestOptions.none())

    /** @see deleteChannelConnectionSettings */
    fun deleteChannelConnectionSettings(
        params: CallingDeleteChannelConnectionSettingsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see deleteChannelConnectionSettings */
    fun deleteChannelConnectionSettings(
        params: CallingDeleteChannelConnectionSettingsParams
    ): CompletableFuture<Void?> = deleteChannelConnectionSettings(params, RequestOptions.none())

    /** @see deleteChannelConnectionSettings */
    fun deleteChannelConnectionSettings(
        appId: Int,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        deleteChannelConnectionSettings(
            appId,
            CallingDeleteChannelConnectionSettingsParams.none(),
            requestOptions,
        )

    /**
     * Remove the calling extension settings associated with the specified appId. This action cannot
     * be undone.
     */
    fun deleteSettings(appId: Int): CompletableFuture<Void?> =
        deleteSettings(appId, CallingDeleteSettingsParams.none())

    /** @see deleteSettings */
    fun deleteSettings(
        appId: Int,
        params: CallingDeleteSettingsParams = CallingDeleteSettingsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        deleteSettings(params.toBuilder().appId(appId).build(), requestOptions)

    /** @see deleteSettings */
    fun deleteSettings(
        appId: Int,
        params: CallingDeleteSettingsParams = CallingDeleteSettingsParams.none(),
    ): CompletableFuture<Void?> = deleteSettings(appId, params, RequestOptions.none())

    /** @see deleteSettings */
    fun deleteSettings(
        params: CallingDeleteSettingsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see deleteSettings */
    fun deleteSettings(params: CallingDeleteSettingsParams): CompletableFuture<Void?> =
        deleteSettings(params, RequestOptions.none())

    /** @see deleteSettings */
    fun deleteSettings(appId: Int, requestOptions: RequestOptions): CompletableFuture<Void?> =
        deleteSettings(appId, CallingDeleteSettingsParams.none(), requestOptions)

    /** Access the current channel connection settings for the specified app. */
    fun getChannelConnectionSettings(
        appId: Int
    ): CompletableFuture<ChannelConnectionSettingsResponse> =
        getChannelConnectionSettings(appId, CallingGetChannelConnectionSettingsParams.none())

    /** @see getChannelConnectionSettings */
    fun getChannelConnectionSettings(
        appId: Int,
        params: CallingGetChannelConnectionSettingsParams =
            CallingGetChannelConnectionSettingsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ChannelConnectionSettingsResponse> =
        getChannelConnectionSettings(params.toBuilder().appId(appId).build(), requestOptions)

    /** @see getChannelConnectionSettings */
    fun getChannelConnectionSettings(
        appId: Int,
        params: CallingGetChannelConnectionSettingsParams =
            CallingGetChannelConnectionSettingsParams.none(),
    ): CompletableFuture<ChannelConnectionSettingsResponse> =
        getChannelConnectionSettings(appId, params, RequestOptions.none())

    /** @see getChannelConnectionSettings */
    fun getChannelConnectionSettings(
        params: CallingGetChannelConnectionSettingsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ChannelConnectionSettingsResponse>

    /** @see getChannelConnectionSettings */
    fun getChannelConnectionSettings(
        params: CallingGetChannelConnectionSettingsParams
    ): CompletableFuture<ChannelConnectionSettingsResponse> =
        getChannelConnectionSettings(params, RequestOptions.none())

    /** @see getChannelConnectionSettings */
    fun getChannelConnectionSettings(
        appId: Int,
        requestOptions: RequestOptions,
    ): CompletableFuture<ChannelConnectionSettingsResponse> =
        getChannelConnectionSettings(
            appId,
            CallingGetChannelConnectionSettingsParams.none(),
            requestOptions,
        )

    /** Retrieve the current recording settings for a specific app using the provided app ID. */
    fun getRecordingSettings(appId: Int): CompletableFuture<RecordingSettingsResponse> =
        getRecordingSettings(appId, CallingGetRecordingSettingsParams.none())

    /** @see getRecordingSettings */
    fun getRecordingSettings(
        appId: Int,
        params: CallingGetRecordingSettingsParams = CallingGetRecordingSettingsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RecordingSettingsResponse> =
        getRecordingSettings(params.toBuilder().appId(appId).build(), requestOptions)

    /** @see getRecordingSettings */
    fun getRecordingSettings(
        appId: Int,
        params: CallingGetRecordingSettingsParams = CallingGetRecordingSettingsParams.none(),
    ): CompletableFuture<RecordingSettingsResponse> =
        getRecordingSettings(appId, params, RequestOptions.none())

    /** @see getRecordingSettings */
    fun getRecordingSettings(
        params: CallingGetRecordingSettingsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RecordingSettingsResponse>

    /** @see getRecordingSettings */
    fun getRecordingSettings(
        params: CallingGetRecordingSettingsParams
    ): CompletableFuture<RecordingSettingsResponse> =
        getRecordingSettings(params, RequestOptions.none())

    /** @see getRecordingSettings */
    fun getRecordingSettings(
        appId: Int,
        requestOptions: RequestOptions,
    ): CompletableFuture<RecordingSettingsResponse> =
        getRecordingSettings(appId, CallingGetRecordingSettingsParams.none(), requestOptions)

    /** Retrieve the current settings of the calling extension for the specified appId. */
    fun getSettings(appId: Int): CompletableFuture<SettingsResponse> =
        getSettings(appId, CallingGetSettingsParams.none())

    /** @see getSettings */
    fun getSettings(
        appId: Int,
        params: CallingGetSettingsParams = CallingGetSettingsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SettingsResponse> =
        getSettings(params.toBuilder().appId(appId).build(), requestOptions)

    /** @see getSettings */
    fun getSettings(
        appId: Int,
        params: CallingGetSettingsParams = CallingGetSettingsParams.none(),
    ): CompletableFuture<SettingsResponse> = getSettings(appId, params, RequestOptions.none())

    /** @see getSettings */
    fun getSettings(
        params: CallingGetSettingsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SettingsResponse>

    /** @see getSettings */
    fun getSettings(params: CallingGetSettingsParams): CompletableFuture<SettingsResponse> =
        getSettings(params, RequestOptions.none())

    /** @see getSettings */
    fun getSettings(
        appId: Int,
        requestOptions: RequestOptions,
    ): CompletableFuture<SettingsResponse> =
        getSettings(appId, CallingGetSettingsParams.none(), requestOptions)

    /** Modify the existing channel connection settings for the specified app. */
    fun updateChannelConnectionSettings(
        appId: Int,
        params: CallingUpdateChannelConnectionSettingsParams,
    ): CompletableFuture<ChannelConnectionSettingsResponse> =
        updateChannelConnectionSettings(appId, params, RequestOptions.none())

    /** @see updateChannelConnectionSettings */
    fun updateChannelConnectionSettings(
        appId: Int,
        params: CallingUpdateChannelConnectionSettingsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ChannelConnectionSettingsResponse> =
        updateChannelConnectionSettings(params.toBuilder().appId(appId).build(), requestOptions)

    /** @see updateChannelConnectionSettings */
    fun updateChannelConnectionSettings(
        params: CallingUpdateChannelConnectionSettingsParams
    ): CompletableFuture<ChannelConnectionSettingsResponse> =
        updateChannelConnectionSettings(params, RequestOptions.none())

    /** @see updateChannelConnectionSettings */
    fun updateChannelConnectionSettings(
        params: CallingUpdateChannelConnectionSettingsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ChannelConnectionSettingsResponse>

    /** Update the recording settings for a specific app using the provided app ID. */
    fun updateRecordingSettings(
        appId: Int,
        params: CallingUpdateRecordingSettingsParams,
    ): CompletableFuture<RecordingSettingsResponse> =
        updateRecordingSettings(appId, params, RequestOptions.none())

    /** @see updateRecordingSettings */
    fun updateRecordingSettings(
        appId: Int,
        params: CallingUpdateRecordingSettingsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RecordingSettingsResponse> =
        updateRecordingSettings(params.toBuilder().appId(appId).build(), requestOptions)

    /** @see updateRecordingSettings */
    fun updateRecordingSettings(
        params: CallingUpdateRecordingSettingsParams
    ): CompletableFuture<RecordingSettingsResponse> =
        updateRecordingSettings(params, RequestOptions.none())

    /** @see updateRecordingSettings */
    fun updateRecordingSettings(
        params: CallingUpdateRecordingSettingsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RecordingSettingsResponse>

    /**
     * Modify existing calling extension settings for the specified appId. Only the fields provided
     * in the request will be updated.
     */
    fun updateSettings(
        appId: Int,
        params: CallingUpdateSettingsParams,
    ): CompletableFuture<SettingsResponse> = updateSettings(appId, params, RequestOptions.none())

    /** @see updateSettings */
    fun updateSettings(
        appId: Int,
        params: CallingUpdateSettingsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SettingsResponse> =
        updateSettings(params.toBuilder().appId(appId).build(), requestOptions)

    /** @see updateSettings */
    fun updateSettings(params: CallingUpdateSettingsParams): CompletableFuture<SettingsResponse> =
        updateSettings(params, RequestOptions.none())

    /** @see updateSettings */
    fun updateSettings(
        params: CallingUpdateSettingsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SettingsResponse>

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
         * /crm/extensions/calling/2026-03/{appId}/settings/channel-connection`, but is otherwise
         * the same as [CallingServiceAsync.createChannelConnectionSettings].
         */
        fun createChannelConnectionSettings(
            appId: Int,
            params: CallingCreateChannelConnectionSettingsParams,
        ): CompletableFuture<HttpResponseFor<ChannelConnectionSettingsResponse>> =
            createChannelConnectionSettings(appId, params, RequestOptions.none())

        /** @see createChannelConnectionSettings */
        fun createChannelConnectionSettings(
            appId: Int,
            params: CallingCreateChannelConnectionSettingsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ChannelConnectionSettingsResponse>> =
            createChannelConnectionSettings(params.toBuilder().appId(appId).build(), requestOptions)

        /** @see createChannelConnectionSettings */
        fun createChannelConnectionSettings(
            params: CallingCreateChannelConnectionSettingsParams
        ): CompletableFuture<HttpResponseFor<ChannelConnectionSettingsResponse>> =
            createChannelConnectionSettings(params, RequestOptions.none())

        /** @see createChannelConnectionSettings */
        fun createChannelConnectionSettings(
            params: CallingCreateChannelConnectionSettingsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ChannelConnectionSettingsResponse>>

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
         * Returns a raw HTTP response for `post /crm/extensions/calling/2026-03/recordings/ready`,
         * but is otherwise the same as [CallingServiceAsync.createRecordingReady].
         */
        fun createRecordingReady(
            params: CallingCreateRecordingReadyParams
        ): CompletableFuture<HttpResponse> = createRecordingReady(params, RequestOptions.none())

        /** @see createRecordingReady */
        fun createRecordingReady(
            params: CallingCreateRecordingReadyParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see createRecordingReady */
        fun createRecordingReady(
            markRecordingAsReadyRequest: MarkRecordingAsReadyRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            createRecordingReady(
                CallingCreateRecordingReadyParams.builder()
                    .markRecordingAsReadyRequest(markRecordingAsReadyRequest)
                    .build(),
                requestOptions,
            )

        /** @see createRecordingReady */
        fun createRecordingReady(
            markRecordingAsReadyRequest: MarkRecordingAsReadyRequest
        ): CompletableFuture<HttpResponse> =
            createRecordingReady(markRecordingAsReadyRequest, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post
         * /crm/extensions/calling/2026-03/{appId}/settings/recording`, but is otherwise the same as
         * [CallingServiceAsync.createRecordingSettings].
         */
        fun createRecordingSettings(
            appId: Int,
            params: CallingCreateRecordingSettingsParams,
        ): CompletableFuture<HttpResponseFor<RecordingSettingsResponse>> =
            createRecordingSettings(appId, params, RequestOptions.none())

        /** @see createRecordingSettings */
        fun createRecordingSettings(
            appId: Int,
            params: CallingCreateRecordingSettingsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RecordingSettingsResponse>> =
            createRecordingSettings(params.toBuilder().appId(appId).build(), requestOptions)

        /** @see createRecordingSettings */
        fun createRecordingSettings(
            params: CallingCreateRecordingSettingsParams
        ): CompletableFuture<HttpResponseFor<RecordingSettingsResponse>> =
            createRecordingSettings(params, RequestOptions.none())

        /** @see createRecordingSettings */
        fun createRecordingSettings(
            params: CallingCreateRecordingSettingsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RecordingSettingsResponse>>

        /**
         * Returns a raw HTTP response for `post /crm/extensions/calling/2026-03/{appId}/settings`,
         * but is otherwise the same as [CallingServiceAsync.createSettings].
         */
        fun createSettings(
            appId: Int,
            params: CallingCreateSettingsParams,
        ): CompletableFuture<HttpResponseFor<SettingsResponse>> =
            createSettings(appId, params, RequestOptions.none())

        /** @see createSettings */
        fun createSettings(
            appId: Int,
            params: CallingCreateSettingsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SettingsResponse>> =
            createSettings(params.toBuilder().appId(appId).build(), requestOptions)

        /** @see createSettings */
        fun createSettings(
            params: CallingCreateSettingsParams
        ): CompletableFuture<HttpResponseFor<SettingsResponse>> =
            createSettings(params, RequestOptions.none())

        /** @see createSettings */
        fun createSettings(
            params: CallingCreateSettingsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SettingsResponse>>

        /**
         * Returns a raw HTTP response for `delete
         * /crm/extensions/calling/2026-03/{appId}/settings/channel-connection`, but is otherwise
         * the same as [CallingServiceAsync.deleteChannelConnectionSettings].
         */
        fun deleteChannelConnectionSettings(appId: Int): CompletableFuture<HttpResponse> =
            deleteChannelConnectionSettings(
                appId,
                CallingDeleteChannelConnectionSettingsParams.none(),
            )

        /** @see deleteChannelConnectionSettings */
        fun deleteChannelConnectionSettings(
            appId: Int,
            params: CallingDeleteChannelConnectionSettingsParams =
                CallingDeleteChannelConnectionSettingsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            deleteChannelConnectionSettings(params.toBuilder().appId(appId).build(), requestOptions)

        /** @see deleteChannelConnectionSettings */
        fun deleteChannelConnectionSettings(
            appId: Int,
            params: CallingDeleteChannelConnectionSettingsParams =
                CallingDeleteChannelConnectionSettingsParams.none(),
        ): CompletableFuture<HttpResponse> =
            deleteChannelConnectionSettings(appId, params, RequestOptions.none())

        /** @see deleteChannelConnectionSettings */
        fun deleteChannelConnectionSettings(
            params: CallingDeleteChannelConnectionSettingsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see deleteChannelConnectionSettings */
        fun deleteChannelConnectionSettings(
            params: CallingDeleteChannelConnectionSettingsParams
        ): CompletableFuture<HttpResponse> =
            deleteChannelConnectionSettings(params, RequestOptions.none())

        /** @see deleteChannelConnectionSettings */
        fun deleteChannelConnectionSettings(
            appId: Int,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            deleteChannelConnectionSettings(
                appId,
                CallingDeleteChannelConnectionSettingsParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `delete
         * /crm/extensions/calling/2026-03/{appId}/settings`, but is otherwise the same as
         * [CallingServiceAsync.deleteSettings].
         */
        fun deleteSettings(appId: Int): CompletableFuture<HttpResponse> =
            deleteSettings(appId, CallingDeleteSettingsParams.none())

        /** @see deleteSettings */
        fun deleteSettings(
            appId: Int,
            params: CallingDeleteSettingsParams = CallingDeleteSettingsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            deleteSettings(params.toBuilder().appId(appId).build(), requestOptions)

        /** @see deleteSettings */
        fun deleteSettings(
            appId: Int,
            params: CallingDeleteSettingsParams = CallingDeleteSettingsParams.none(),
        ): CompletableFuture<HttpResponse> = deleteSettings(appId, params, RequestOptions.none())

        /** @see deleteSettings */
        fun deleteSettings(
            params: CallingDeleteSettingsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see deleteSettings */
        fun deleteSettings(params: CallingDeleteSettingsParams): CompletableFuture<HttpResponse> =
            deleteSettings(params, RequestOptions.none())

        /** @see deleteSettings */
        fun deleteSettings(
            appId: Int,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            deleteSettings(appId, CallingDeleteSettingsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get
         * /crm/extensions/calling/2026-03/{appId}/settings/channel-connection`, but is otherwise
         * the same as [CallingServiceAsync.getChannelConnectionSettings].
         */
        fun getChannelConnectionSettings(
            appId: Int
        ): CompletableFuture<HttpResponseFor<ChannelConnectionSettingsResponse>> =
            getChannelConnectionSettings(appId, CallingGetChannelConnectionSettingsParams.none())

        /** @see getChannelConnectionSettings */
        fun getChannelConnectionSettings(
            appId: Int,
            params: CallingGetChannelConnectionSettingsParams =
                CallingGetChannelConnectionSettingsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ChannelConnectionSettingsResponse>> =
            getChannelConnectionSettings(params.toBuilder().appId(appId).build(), requestOptions)

        /** @see getChannelConnectionSettings */
        fun getChannelConnectionSettings(
            appId: Int,
            params: CallingGetChannelConnectionSettingsParams =
                CallingGetChannelConnectionSettingsParams.none(),
        ): CompletableFuture<HttpResponseFor<ChannelConnectionSettingsResponse>> =
            getChannelConnectionSettings(appId, params, RequestOptions.none())

        /** @see getChannelConnectionSettings */
        fun getChannelConnectionSettings(
            params: CallingGetChannelConnectionSettingsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ChannelConnectionSettingsResponse>>

        /** @see getChannelConnectionSettings */
        fun getChannelConnectionSettings(
            params: CallingGetChannelConnectionSettingsParams
        ): CompletableFuture<HttpResponseFor<ChannelConnectionSettingsResponse>> =
            getChannelConnectionSettings(params, RequestOptions.none())

        /** @see getChannelConnectionSettings */
        fun getChannelConnectionSettings(
            appId: Int,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ChannelConnectionSettingsResponse>> =
            getChannelConnectionSettings(
                appId,
                CallingGetChannelConnectionSettingsParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `get
         * /crm/extensions/calling/2026-03/{appId}/settings/recording`, but is otherwise the same as
         * [CallingServiceAsync.getRecordingSettings].
         */
        fun getRecordingSettings(
            appId: Int
        ): CompletableFuture<HttpResponseFor<RecordingSettingsResponse>> =
            getRecordingSettings(appId, CallingGetRecordingSettingsParams.none())

        /** @see getRecordingSettings */
        fun getRecordingSettings(
            appId: Int,
            params: CallingGetRecordingSettingsParams = CallingGetRecordingSettingsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RecordingSettingsResponse>> =
            getRecordingSettings(params.toBuilder().appId(appId).build(), requestOptions)

        /** @see getRecordingSettings */
        fun getRecordingSettings(
            appId: Int,
            params: CallingGetRecordingSettingsParams = CallingGetRecordingSettingsParams.none(),
        ): CompletableFuture<HttpResponseFor<RecordingSettingsResponse>> =
            getRecordingSettings(appId, params, RequestOptions.none())

        /** @see getRecordingSettings */
        fun getRecordingSettings(
            params: CallingGetRecordingSettingsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RecordingSettingsResponse>>

        /** @see getRecordingSettings */
        fun getRecordingSettings(
            params: CallingGetRecordingSettingsParams
        ): CompletableFuture<HttpResponseFor<RecordingSettingsResponse>> =
            getRecordingSettings(params, RequestOptions.none())

        /** @see getRecordingSettings */
        fun getRecordingSettings(
            appId: Int,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<RecordingSettingsResponse>> =
            getRecordingSettings(appId, CallingGetRecordingSettingsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /crm/extensions/calling/2026-03/{appId}/settings`,
         * but is otherwise the same as [CallingServiceAsync.getSettings].
         */
        fun getSettings(appId: Int): CompletableFuture<HttpResponseFor<SettingsResponse>> =
            getSettings(appId, CallingGetSettingsParams.none())

        /** @see getSettings */
        fun getSettings(
            appId: Int,
            params: CallingGetSettingsParams = CallingGetSettingsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SettingsResponse>> =
            getSettings(params.toBuilder().appId(appId).build(), requestOptions)

        /** @see getSettings */
        fun getSettings(
            appId: Int,
            params: CallingGetSettingsParams = CallingGetSettingsParams.none(),
        ): CompletableFuture<HttpResponseFor<SettingsResponse>> =
            getSettings(appId, params, RequestOptions.none())

        /** @see getSettings */
        fun getSettings(
            params: CallingGetSettingsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SettingsResponse>>

        /** @see getSettings */
        fun getSettings(
            params: CallingGetSettingsParams
        ): CompletableFuture<HttpResponseFor<SettingsResponse>> =
            getSettings(params, RequestOptions.none())

        /** @see getSettings */
        fun getSettings(
            appId: Int,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SettingsResponse>> =
            getSettings(appId, CallingGetSettingsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch
         * /crm/extensions/calling/2026-03/{appId}/settings/channel-connection`, but is otherwise
         * the same as [CallingServiceAsync.updateChannelConnectionSettings].
         */
        fun updateChannelConnectionSettings(
            appId: Int,
            params: CallingUpdateChannelConnectionSettingsParams,
        ): CompletableFuture<HttpResponseFor<ChannelConnectionSettingsResponse>> =
            updateChannelConnectionSettings(appId, params, RequestOptions.none())

        /** @see updateChannelConnectionSettings */
        fun updateChannelConnectionSettings(
            appId: Int,
            params: CallingUpdateChannelConnectionSettingsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ChannelConnectionSettingsResponse>> =
            updateChannelConnectionSettings(params.toBuilder().appId(appId).build(), requestOptions)

        /** @see updateChannelConnectionSettings */
        fun updateChannelConnectionSettings(
            params: CallingUpdateChannelConnectionSettingsParams
        ): CompletableFuture<HttpResponseFor<ChannelConnectionSettingsResponse>> =
            updateChannelConnectionSettings(params, RequestOptions.none())

        /** @see updateChannelConnectionSettings */
        fun updateChannelConnectionSettings(
            params: CallingUpdateChannelConnectionSettingsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ChannelConnectionSettingsResponse>>

        /**
         * Returns a raw HTTP response for `patch
         * /crm/extensions/calling/2026-03/{appId}/settings/recording`, but is otherwise the same as
         * [CallingServiceAsync.updateRecordingSettings].
         */
        fun updateRecordingSettings(
            appId: Int,
            params: CallingUpdateRecordingSettingsParams,
        ): CompletableFuture<HttpResponseFor<RecordingSettingsResponse>> =
            updateRecordingSettings(appId, params, RequestOptions.none())

        /** @see updateRecordingSettings */
        fun updateRecordingSettings(
            appId: Int,
            params: CallingUpdateRecordingSettingsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RecordingSettingsResponse>> =
            updateRecordingSettings(params.toBuilder().appId(appId).build(), requestOptions)

        /** @see updateRecordingSettings */
        fun updateRecordingSettings(
            params: CallingUpdateRecordingSettingsParams
        ): CompletableFuture<HttpResponseFor<RecordingSettingsResponse>> =
            updateRecordingSettings(params, RequestOptions.none())

        /** @see updateRecordingSettings */
        fun updateRecordingSettings(
            params: CallingUpdateRecordingSettingsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RecordingSettingsResponse>>

        /**
         * Returns a raw HTTP response for `patch /crm/extensions/calling/2026-03/{appId}/settings`,
         * but is otherwise the same as [CallingServiceAsync.updateSettings].
         */
        fun updateSettings(
            appId: Int,
            params: CallingUpdateSettingsParams,
        ): CompletableFuture<HttpResponseFor<SettingsResponse>> =
            updateSettings(appId, params, RequestOptions.none())

        /** @see updateSettings */
        fun updateSettings(
            appId: Int,
            params: CallingUpdateSettingsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SettingsResponse>> =
            updateSettings(params.toBuilder().appId(appId).build(), requestOptions)

        /** @see updateSettings */
        fun updateSettings(
            params: CallingUpdateSettingsParams
        ): CompletableFuture<HttpResponseFor<SettingsResponse>> =
            updateSettings(params, RequestOptions.none())

        /** @see updateSettings */
        fun updateSettings(
            params: CallingUpdateSettingsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SettingsResponse>>
    }
}
