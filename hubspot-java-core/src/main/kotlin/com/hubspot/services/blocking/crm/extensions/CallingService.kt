// File generated from our OpenAPI spec by Stainless.

package com.hubspot.services.blocking.crm.extensions

import com.google.errorprone.annotations.MustBeClosed
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
import com.hubspot.services.blocking.crm.extensions.calling.TranscriptService
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

    /** Establish new channel connection settings for the specified app. */
    fun createChannelConnectionSettings(
        appId: Int,
        params: CallingCreateChannelConnectionSettingsParams,
    ): ChannelConnectionSettingsResponse =
        createChannelConnectionSettings(appId, params, RequestOptions.none())

    /** @see createChannelConnectionSettings */
    fun createChannelConnectionSettings(
        appId: Int,
        params: CallingCreateChannelConnectionSettingsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ChannelConnectionSettingsResponse =
        createChannelConnectionSettings(params.toBuilder().appId(appId).build(), requestOptions)

    /** @see createChannelConnectionSettings */
    fun createChannelConnectionSettings(
        params: CallingCreateChannelConnectionSettingsParams
    ): ChannelConnectionSettingsResponse =
        createChannelConnectionSettings(params, RequestOptions.none())

    /** @see createChannelConnectionSettings */
    fun createChannelConnectionSettings(
        params: CallingCreateChannelConnectionSettingsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ChannelConnectionSettingsResponse

    fun createInboundCall(params: CallingCreateInboundCallParams): CompletedThirdPartyCallResponse =
        createInboundCall(params, RequestOptions.none())

    /** @see createInboundCall */
    fun createInboundCall(
        params: CallingCreateInboundCallParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletedThirdPartyCallResponse

    /** @see createInboundCall */
    fun createInboundCall(
        completedThirdPartyCallRequest: CompletedThirdPartyCallRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletedThirdPartyCallResponse =
        createInboundCall(
            CallingCreateInboundCallParams.builder()
                .completedThirdPartyCallRequest(completedThirdPartyCallRequest)
                .build(),
            requestOptions,
        )

    /** @see createInboundCall */
    fun createInboundCall(
        completedThirdPartyCallRequest: CompletedThirdPartyCallRequest
    ): CompletedThirdPartyCallResponse =
        createInboundCall(completedThirdPartyCallRequest, RequestOptions.none())

    /**
     * This endpoint is used to mark a call recording as ready. It requires the engagementId to
     * identify the specific recording.
     */
    fun createRecordingReady(params: CallingCreateRecordingReadyParams) =
        createRecordingReady(params, RequestOptions.none())

    /** @see createRecordingReady */
    fun createRecordingReady(
        params: CallingCreateRecordingReadyParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see createRecordingReady */
    fun createRecordingReady(
        markRecordingAsReadyRequest: MarkRecordingAsReadyRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) =
        createRecordingReady(
            CallingCreateRecordingReadyParams.builder()
                .markRecordingAsReadyRequest(markRecordingAsReadyRequest)
                .build(),
            requestOptions,
        )

    /** @see createRecordingReady */
    fun createRecordingReady(markRecordingAsReadyRequest: MarkRecordingAsReadyRequest) =
        createRecordingReady(markRecordingAsReadyRequest, RequestOptions.none())

    /** Create new recording settings for a specific app using the provided app ID. */
    fun createRecordingSettings(
        appId: Int,
        params: CallingCreateRecordingSettingsParams,
    ): RecordingSettingsResponse = createRecordingSettings(appId, params, RequestOptions.none())

    /** @see createRecordingSettings */
    fun createRecordingSettings(
        appId: Int,
        params: CallingCreateRecordingSettingsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RecordingSettingsResponse =
        createRecordingSettings(params.toBuilder().appId(appId).build(), requestOptions)

    /** @see createRecordingSettings */
    fun createRecordingSettings(
        params: CallingCreateRecordingSettingsParams
    ): RecordingSettingsResponse = createRecordingSettings(params, RequestOptions.none())

    /** @see createRecordingSettings */
    fun createRecordingSettings(
        params: CallingCreateRecordingSettingsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RecordingSettingsResponse

    /** Create new settings for the calling extension associated with the specified appId. */
    fun createSettings(appId: Int, params: CallingCreateSettingsParams): SettingsResponse =
        createSettings(appId, params, RequestOptions.none())

    /** @see createSettings */
    fun createSettings(
        appId: Int,
        params: CallingCreateSettingsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SettingsResponse = createSettings(params.toBuilder().appId(appId).build(), requestOptions)

    /** @see createSettings */
    fun createSettings(params: CallingCreateSettingsParams): SettingsResponse =
        createSettings(params, RequestOptions.none())

    /** @see createSettings */
    fun createSettings(
        params: CallingCreateSettingsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SettingsResponse

    /** Delete the channel connection settings associated with the specified app. */
    fun deleteChannelConnectionSettings(appId: Int) =
        deleteChannelConnectionSettings(appId, CallingDeleteChannelConnectionSettingsParams.none())

    /** @see deleteChannelConnectionSettings */
    fun deleteChannelConnectionSettings(
        appId: Int,
        params: CallingDeleteChannelConnectionSettingsParams =
            CallingDeleteChannelConnectionSettingsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = deleteChannelConnectionSettings(params.toBuilder().appId(appId).build(), requestOptions)

    /** @see deleteChannelConnectionSettings */
    fun deleteChannelConnectionSettings(
        appId: Int,
        params: CallingDeleteChannelConnectionSettingsParams =
            CallingDeleteChannelConnectionSettingsParams.none(),
    ) = deleteChannelConnectionSettings(appId, params, RequestOptions.none())

    /** @see deleteChannelConnectionSettings */
    fun deleteChannelConnectionSettings(
        params: CallingDeleteChannelConnectionSettingsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see deleteChannelConnectionSettings */
    fun deleteChannelConnectionSettings(params: CallingDeleteChannelConnectionSettingsParams) =
        deleteChannelConnectionSettings(params, RequestOptions.none())

    /** @see deleteChannelConnectionSettings */
    fun deleteChannelConnectionSettings(appId: Int, requestOptions: RequestOptions) =
        deleteChannelConnectionSettings(
            appId,
            CallingDeleteChannelConnectionSettingsParams.none(),
            requestOptions,
        )

    /**
     * Remove the calling extension settings associated with the specified appId. This action cannot
     * be undone.
     */
    fun deleteSettings(appId: Int) = deleteSettings(appId, CallingDeleteSettingsParams.none())

    /** @see deleteSettings */
    fun deleteSettings(
        appId: Int,
        params: CallingDeleteSettingsParams = CallingDeleteSettingsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = deleteSettings(params.toBuilder().appId(appId).build(), requestOptions)

    /** @see deleteSettings */
    fun deleteSettings(
        appId: Int,
        params: CallingDeleteSettingsParams = CallingDeleteSettingsParams.none(),
    ) = deleteSettings(appId, params, RequestOptions.none())

    /** @see deleteSettings */
    fun deleteSettings(
        params: CallingDeleteSettingsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see deleteSettings */
    fun deleteSettings(params: CallingDeleteSettingsParams) =
        deleteSettings(params, RequestOptions.none())

    /** @see deleteSettings */
    fun deleteSettings(appId: Int, requestOptions: RequestOptions) =
        deleteSettings(appId, CallingDeleteSettingsParams.none(), requestOptions)

    /** Access the current channel connection settings for the specified app. */
    fun getChannelConnectionSettings(appId: Int): ChannelConnectionSettingsResponse =
        getChannelConnectionSettings(appId, CallingGetChannelConnectionSettingsParams.none())

    /** @see getChannelConnectionSettings */
    fun getChannelConnectionSettings(
        appId: Int,
        params: CallingGetChannelConnectionSettingsParams =
            CallingGetChannelConnectionSettingsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ChannelConnectionSettingsResponse =
        getChannelConnectionSettings(params.toBuilder().appId(appId).build(), requestOptions)

    /** @see getChannelConnectionSettings */
    fun getChannelConnectionSettings(
        appId: Int,
        params: CallingGetChannelConnectionSettingsParams =
            CallingGetChannelConnectionSettingsParams.none(),
    ): ChannelConnectionSettingsResponse =
        getChannelConnectionSettings(appId, params, RequestOptions.none())

    /** @see getChannelConnectionSettings */
    fun getChannelConnectionSettings(
        params: CallingGetChannelConnectionSettingsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ChannelConnectionSettingsResponse

    /** @see getChannelConnectionSettings */
    fun getChannelConnectionSettings(
        params: CallingGetChannelConnectionSettingsParams
    ): ChannelConnectionSettingsResponse =
        getChannelConnectionSettings(params, RequestOptions.none())

    /** @see getChannelConnectionSettings */
    fun getChannelConnectionSettings(
        appId: Int,
        requestOptions: RequestOptions,
    ): ChannelConnectionSettingsResponse =
        getChannelConnectionSettings(
            appId,
            CallingGetChannelConnectionSettingsParams.none(),
            requestOptions,
        )

    /** Retrieve the current recording settings for a specific app using the provided app ID. */
    fun getRecordingSettings(appId: Int): RecordingSettingsResponse =
        getRecordingSettings(appId, CallingGetRecordingSettingsParams.none())

    /** @see getRecordingSettings */
    fun getRecordingSettings(
        appId: Int,
        params: CallingGetRecordingSettingsParams = CallingGetRecordingSettingsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RecordingSettingsResponse =
        getRecordingSettings(params.toBuilder().appId(appId).build(), requestOptions)

    /** @see getRecordingSettings */
    fun getRecordingSettings(
        appId: Int,
        params: CallingGetRecordingSettingsParams = CallingGetRecordingSettingsParams.none(),
    ): RecordingSettingsResponse = getRecordingSettings(appId, params, RequestOptions.none())

    /** @see getRecordingSettings */
    fun getRecordingSettings(
        params: CallingGetRecordingSettingsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RecordingSettingsResponse

    /** @see getRecordingSettings */
    fun getRecordingSettings(params: CallingGetRecordingSettingsParams): RecordingSettingsResponse =
        getRecordingSettings(params, RequestOptions.none())

    /** @see getRecordingSettings */
    fun getRecordingSettings(
        appId: Int,
        requestOptions: RequestOptions,
    ): RecordingSettingsResponse =
        getRecordingSettings(appId, CallingGetRecordingSettingsParams.none(), requestOptions)

    /** Retrieve the current settings of the calling extension for the specified appId. */
    fun getSettings(appId: Int): SettingsResponse =
        getSettings(appId, CallingGetSettingsParams.none())

    /** @see getSettings */
    fun getSettings(
        appId: Int,
        params: CallingGetSettingsParams = CallingGetSettingsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SettingsResponse = getSettings(params.toBuilder().appId(appId).build(), requestOptions)

    /** @see getSettings */
    fun getSettings(
        appId: Int,
        params: CallingGetSettingsParams = CallingGetSettingsParams.none(),
    ): SettingsResponse = getSettings(appId, params, RequestOptions.none())

    /** @see getSettings */
    fun getSettings(
        params: CallingGetSettingsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SettingsResponse

    /** @see getSettings */
    fun getSettings(params: CallingGetSettingsParams): SettingsResponse =
        getSettings(params, RequestOptions.none())

    /** @see getSettings */
    fun getSettings(appId: Int, requestOptions: RequestOptions): SettingsResponse =
        getSettings(appId, CallingGetSettingsParams.none(), requestOptions)

    /** Modify the existing channel connection settings for the specified app. */
    fun updateChannelConnectionSettings(
        appId: Int,
        params: CallingUpdateChannelConnectionSettingsParams,
    ): ChannelConnectionSettingsResponse =
        updateChannelConnectionSettings(appId, params, RequestOptions.none())

    /** @see updateChannelConnectionSettings */
    fun updateChannelConnectionSettings(
        appId: Int,
        params: CallingUpdateChannelConnectionSettingsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ChannelConnectionSettingsResponse =
        updateChannelConnectionSettings(params.toBuilder().appId(appId).build(), requestOptions)

    /** @see updateChannelConnectionSettings */
    fun updateChannelConnectionSettings(
        params: CallingUpdateChannelConnectionSettingsParams
    ): ChannelConnectionSettingsResponse =
        updateChannelConnectionSettings(params, RequestOptions.none())

    /** @see updateChannelConnectionSettings */
    fun updateChannelConnectionSettings(
        params: CallingUpdateChannelConnectionSettingsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ChannelConnectionSettingsResponse

    /** Update the recording settings for a specific app using the provided app ID. */
    fun updateRecordingSettings(
        appId: Int,
        params: CallingUpdateRecordingSettingsParams,
    ): RecordingSettingsResponse = updateRecordingSettings(appId, params, RequestOptions.none())

    /** @see updateRecordingSettings */
    fun updateRecordingSettings(
        appId: Int,
        params: CallingUpdateRecordingSettingsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RecordingSettingsResponse =
        updateRecordingSettings(params.toBuilder().appId(appId).build(), requestOptions)

    /** @see updateRecordingSettings */
    fun updateRecordingSettings(
        params: CallingUpdateRecordingSettingsParams
    ): RecordingSettingsResponse = updateRecordingSettings(params, RequestOptions.none())

    /** @see updateRecordingSettings */
    fun updateRecordingSettings(
        params: CallingUpdateRecordingSettingsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RecordingSettingsResponse

    /**
     * Modify existing calling extension settings for the specified appId. Only the fields provided
     * in the request will be updated.
     */
    fun updateSettings(appId: Int, params: CallingUpdateSettingsParams): SettingsResponse =
        updateSettings(appId, params, RequestOptions.none())

    /** @see updateSettings */
    fun updateSettings(
        appId: Int,
        params: CallingUpdateSettingsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SettingsResponse = updateSettings(params.toBuilder().appId(appId).build(), requestOptions)

    /** @see updateSettings */
    fun updateSettings(params: CallingUpdateSettingsParams): SettingsResponse =
        updateSettings(params, RequestOptions.none())

    /** @see updateSettings */
    fun updateSettings(
        params: CallingUpdateSettingsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SettingsResponse

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
         * /crm/extensions/calling/2026-03/{appId}/settings/channel-connection`, but is otherwise
         * the same as [CallingService.createChannelConnectionSettings].
         */
        @MustBeClosed
        fun createChannelConnectionSettings(
            appId: Int,
            params: CallingCreateChannelConnectionSettingsParams,
        ): HttpResponseFor<ChannelConnectionSettingsResponse> =
            createChannelConnectionSettings(appId, params, RequestOptions.none())

        /** @see createChannelConnectionSettings */
        @MustBeClosed
        fun createChannelConnectionSettings(
            appId: Int,
            params: CallingCreateChannelConnectionSettingsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ChannelConnectionSettingsResponse> =
            createChannelConnectionSettings(params.toBuilder().appId(appId).build(), requestOptions)

        /** @see createChannelConnectionSettings */
        @MustBeClosed
        fun createChannelConnectionSettings(
            params: CallingCreateChannelConnectionSettingsParams
        ): HttpResponseFor<ChannelConnectionSettingsResponse> =
            createChannelConnectionSettings(params, RequestOptions.none())

        /** @see createChannelConnectionSettings */
        @MustBeClosed
        fun createChannelConnectionSettings(
            params: CallingCreateChannelConnectionSettingsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ChannelConnectionSettingsResponse>

        /**
         * Returns a raw HTTP response for `post /crm/extensions/calling/2026-03/inbound-call`, but
         * is otherwise the same as [CallingService.createInboundCall].
         */
        @MustBeClosed
        fun createInboundCall(
            params: CallingCreateInboundCallParams
        ): HttpResponseFor<CompletedThirdPartyCallResponse> =
            createInboundCall(params, RequestOptions.none())

        /** @see createInboundCall */
        @MustBeClosed
        fun createInboundCall(
            params: CallingCreateInboundCallParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CompletedThirdPartyCallResponse>

        /** @see createInboundCall */
        @MustBeClosed
        fun createInboundCall(
            completedThirdPartyCallRequest: CompletedThirdPartyCallRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CompletedThirdPartyCallResponse> =
            createInboundCall(
                CallingCreateInboundCallParams.builder()
                    .completedThirdPartyCallRequest(completedThirdPartyCallRequest)
                    .build(),
                requestOptions,
            )

        /** @see createInboundCall */
        @MustBeClosed
        fun createInboundCall(
            completedThirdPartyCallRequest: CompletedThirdPartyCallRequest
        ): HttpResponseFor<CompletedThirdPartyCallResponse> =
            createInboundCall(completedThirdPartyCallRequest, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post /crm/extensions/calling/2026-03/recordings/ready`,
         * but is otherwise the same as [CallingService.createRecordingReady].
         */
        @MustBeClosed
        fun createRecordingReady(params: CallingCreateRecordingReadyParams): HttpResponse =
            createRecordingReady(params, RequestOptions.none())

        /** @see createRecordingReady */
        @MustBeClosed
        fun createRecordingReady(
            params: CallingCreateRecordingReadyParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see createRecordingReady */
        @MustBeClosed
        fun createRecordingReady(
            markRecordingAsReadyRequest: MarkRecordingAsReadyRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            createRecordingReady(
                CallingCreateRecordingReadyParams.builder()
                    .markRecordingAsReadyRequest(markRecordingAsReadyRequest)
                    .build(),
                requestOptions,
            )

        /** @see createRecordingReady */
        @MustBeClosed
        fun createRecordingReady(
            markRecordingAsReadyRequest: MarkRecordingAsReadyRequest
        ): HttpResponse = createRecordingReady(markRecordingAsReadyRequest, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post
         * /crm/extensions/calling/2026-03/{appId}/settings/recording`, but is otherwise the same as
         * [CallingService.createRecordingSettings].
         */
        @MustBeClosed
        fun createRecordingSettings(
            appId: Int,
            params: CallingCreateRecordingSettingsParams,
        ): HttpResponseFor<RecordingSettingsResponse> =
            createRecordingSettings(appId, params, RequestOptions.none())

        /** @see createRecordingSettings */
        @MustBeClosed
        fun createRecordingSettings(
            appId: Int,
            params: CallingCreateRecordingSettingsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RecordingSettingsResponse> =
            createRecordingSettings(params.toBuilder().appId(appId).build(), requestOptions)

        /** @see createRecordingSettings */
        @MustBeClosed
        fun createRecordingSettings(
            params: CallingCreateRecordingSettingsParams
        ): HttpResponseFor<RecordingSettingsResponse> =
            createRecordingSettings(params, RequestOptions.none())

        /** @see createRecordingSettings */
        @MustBeClosed
        fun createRecordingSettings(
            params: CallingCreateRecordingSettingsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RecordingSettingsResponse>

        /**
         * Returns a raw HTTP response for `post /crm/extensions/calling/2026-03/{appId}/settings`,
         * but is otherwise the same as [CallingService.createSettings].
         */
        @MustBeClosed
        fun createSettings(
            appId: Int,
            params: CallingCreateSettingsParams,
        ): HttpResponseFor<SettingsResponse> = createSettings(appId, params, RequestOptions.none())

        /** @see createSettings */
        @MustBeClosed
        fun createSettings(
            appId: Int,
            params: CallingCreateSettingsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SettingsResponse> =
            createSettings(params.toBuilder().appId(appId).build(), requestOptions)

        /** @see createSettings */
        @MustBeClosed
        fun createSettings(params: CallingCreateSettingsParams): HttpResponseFor<SettingsResponse> =
            createSettings(params, RequestOptions.none())

        /** @see createSettings */
        @MustBeClosed
        fun createSettings(
            params: CallingCreateSettingsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SettingsResponse>

        /**
         * Returns a raw HTTP response for `delete
         * /crm/extensions/calling/2026-03/{appId}/settings/channel-connection`, but is otherwise
         * the same as [CallingService.deleteChannelConnectionSettings].
         */
        @MustBeClosed
        fun deleteChannelConnectionSettings(appId: Int): HttpResponse =
            deleteChannelConnectionSettings(
                appId,
                CallingDeleteChannelConnectionSettingsParams.none(),
            )

        /** @see deleteChannelConnectionSettings */
        @MustBeClosed
        fun deleteChannelConnectionSettings(
            appId: Int,
            params: CallingDeleteChannelConnectionSettingsParams =
                CallingDeleteChannelConnectionSettingsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            deleteChannelConnectionSettings(params.toBuilder().appId(appId).build(), requestOptions)

        /** @see deleteChannelConnectionSettings */
        @MustBeClosed
        fun deleteChannelConnectionSettings(
            appId: Int,
            params: CallingDeleteChannelConnectionSettingsParams =
                CallingDeleteChannelConnectionSettingsParams.none(),
        ): HttpResponse = deleteChannelConnectionSettings(appId, params, RequestOptions.none())

        /** @see deleteChannelConnectionSettings */
        @MustBeClosed
        fun deleteChannelConnectionSettings(
            params: CallingDeleteChannelConnectionSettingsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see deleteChannelConnectionSettings */
        @MustBeClosed
        fun deleteChannelConnectionSettings(
            params: CallingDeleteChannelConnectionSettingsParams
        ): HttpResponse = deleteChannelConnectionSettings(params, RequestOptions.none())

        /** @see deleteChannelConnectionSettings */
        @MustBeClosed
        fun deleteChannelConnectionSettings(
            appId: Int,
            requestOptions: RequestOptions,
        ): HttpResponse =
            deleteChannelConnectionSettings(
                appId,
                CallingDeleteChannelConnectionSettingsParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `delete
         * /crm/extensions/calling/2026-03/{appId}/settings`, but is otherwise the same as
         * [CallingService.deleteSettings].
         */
        @MustBeClosed
        fun deleteSettings(appId: Int): HttpResponse =
            deleteSettings(appId, CallingDeleteSettingsParams.none())

        /** @see deleteSettings */
        @MustBeClosed
        fun deleteSettings(
            appId: Int,
            params: CallingDeleteSettingsParams = CallingDeleteSettingsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = deleteSettings(params.toBuilder().appId(appId).build(), requestOptions)

        /** @see deleteSettings */
        @MustBeClosed
        fun deleteSettings(
            appId: Int,
            params: CallingDeleteSettingsParams = CallingDeleteSettingsParams.none(),
        ): HttpResponse = deleteSettings(appId, params, RequestOptions.none())

        /** @see deleteSettings */
        @MustBeClosed
        fun deleteSettings(
            params: CallingDeleteSettingsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see deleteSettings */
        @MustBeClosed
        fun deleteSettings(params: CallingDeleteSettingsParams): HttpResponse =
            deleteSettings(params, RequestOptions.none())

        /** @see deleteSettings */
        @MustBeClosed
        fun deleteSettings(appId: Int, requestOptions: RequestOptions): HttpResponse =
            deleteSettings(appId, CallingDeleteSettingsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get
         * /crm/extensions/calling/2026-03/{appId}/settings/channel-connection`, but is otherwise
         * the same as [CallingService.getChannelConnectionSettings].
         */
        @MustBeClosed
        fun getChannelConnectionSettings(
            appId: Int
        ): HttpResponseFor<ChannelConnectionSettingsResponse> =
            getChannelConnectionSettings(appId, CallingGetChannelConnectionSettingsParams.none())

        /** @see getChannelConnectionSettings */
        @MustBeClosed
        fun getChannelConnectionSettings(
            appId: Int,
            params: CallingGetChannelConnectionSettingsParams =
                CallingGetChannelConnectionSettingsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ChannelConnectionSettingsResponse> =
            getChannelConnectionSettings(params.toBuilder().appId(appId).build(), requestOptions)

        /** @see getChannelConnectionSettings */
        @MustBeClosed
        fun getChannelConnectionSettings(
            appId: Int,
            params: CallingGetChannelConnectionSettingsParams =
                CallingGetChannelConnectionSettingsParams.none(),
        ): HttpResponseFor<ChannelConnectionSettingsResponse> =
            getChannelConnectionSettings(appId, params, RequestOptions.none())

        /** @see getChannelConnectionSettings */
        @MustBeClosed
        fun getChannelConnectionSettings(
            params: CallingGetChannelConnectionSettingsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ChannelConnectionSettingsResponse>

        /** @see getChannelConnectionSettings */
        @MustBeClosed
        fun getChannelConnectionSettings(
            params: CallingGetChannelConnectionSettingsParams
        ): HttpResponseFor<ChannelConnectionSettingsResponse> =
            getChannelConnectionSettings(params, RequestOptions.none())

        /** @see getChannelConnectionSettings */
        @MustBeClosed
        fun getChannelConnectionSettings(
            appId: Int,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ChannelConnectionSettingsResponse> =
            getChannelConnectionSettings(
                appId,
                CallingGetChannelConnectionSettingsParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `get
         * /crm/extensions/calling/2026-03/{appId}/settings/recording`, but is otherwise the same as
         * [CallingService.getRecordingSettings].
         */
        @MustBeClosed
        fun getRecordingSettings(appId: Int): HttpResponseFor<RecordingSettingsResponse> =
            getRecordingSettings(appId, CallingGetRecordingSettingsParams.none())

        /** @see getRecordingSettings */
        @MustBeClosed
        fun getRecordingSettings(
            appId: Int,
            params: CallingGetRecordingSettingsParams = CallingGetRecordingSettingsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RecordingSettingsResponse> =
            getRecordingSettings(params.toBuilder().appId(appId).build(), requestOptions)

        /** @see getRecordingSettings */
        @MustBeClosed
        fun getRecordingSettings(
            appId: Int,
            params: CallingGetRecordingSettingsParams = CallingGetRecordingSettingsParams.none(),
        ): HttpResponseFor<RecordingSettingsResponse> =
            getRecordingSettings(appId, params, RequestOptions.none())

        /** @see getRecordingSettings */
        @MustBeClosed
        fun getRecordingSettings(
            params: CallingGetRecordingSettingsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RecordingSettingsResponse>

        /** @see getRecordingSettings */
        @MustBeClosed
        fun getRecordingSettings(
            params: CallingGetRecordingSettingsParams
        ): HttpResponseFor<RecordingSettingsResponse> =
            getRecordingSettings(params, RequestOptions.none())

        /** @see getRecordingSettings */
        @MustBeClosed
        fun getRecordingSettings(
            appId: Int,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RecordingSettingsResponse> =
            getRecordingSettings(appId, CallingGetRecordingSettingsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /crm/extensions/calling/2026-03/{appId}/settings`,
         * but is otherwise the same as [CallingService.getSettings].
         */
        @MustBeClosed
        fun getSettings(appId: Int): HttpResponseFor<SettingsResponse> =
            getSettings(appId, CallingGetSettingsParams.none())

        /** @see getSettings */
        @MustBeClosed
        fun getSettings(
            appId: Int,
            params: CallingGetSettingsParams = CallingGetSettingsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SettingsResponse> =
            getSettings(params.toBuilder().appId(appId).build(), requestOptions)

        /** @see getSettings */
        @MustBeClosed
        fun getSettings(
            appId: Int,
            params: CallingGetSettingsParams = CallingGetSettingsParams.none(),
        ): HttpResponseFor<SettingsResponse> = getSettings(appId, params, RequestOptions.none())

        /** @see getSettings */
        @MustBeClosed
        fun getSettings(
            params: CallingGetSettingsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SettingsResponse>

        /** @see getSettings */
        @MustBeClosed
        fun getSettings(params: CallingGetSettingsParams): HttpResponseFor<SettingsResponse> =
            getSettings(params, RequestOptions.none())

        /** @see getSettings */
        @MustBeClosed
        fun getSettings(
            appId: Int,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SettingsResponse> =
            getSettings(appId, CallingGetSettingsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch
         * /crm/extensions/calling/2026-03/{appId}/settings/channel-connection`, but is otherwise
         * the same as [CallingService.updateChannelConnectionSettings].
         */
        @MustBeClosed
        fun updateChannelConnectionSettings(
            appId: Int,
            params: CallingUpdateChannelConnectionSettingsParams,
        ): HttpResponseFor<ChannelConnectionSettingsResponse> =
            updateChannelConnectionSettings(appId, params, RequestOptions.none())

        /** @see updateChannelConnectionSettings */
        @MustBeClosed
        fun updateChannelConnectionSettings(
            appId: Int,
            params: CallingUpdateChannelConnectionSettingsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ChannelConnectionSettingsResponse> =
            updateChannelConnectionSettings(params.toBuilder().appId(appId).build(), requestOptions)

        /** @see updateChannelConnectionSettings */
        @MustBeClosed
        fun updateChannelConnectionSettings(
            params: CallingUpdateChannelConnectionSettingsParams
        ): HttpResponseFor<ChannelConnectionSettingsResponse> =
            updateChannelConnectionSettings(params, RequestOptions.none())

        /** @see updateChannelConnectionSettings */
        @MustBeClosed
        fun updateChannelConnectionSettings(
            params: CallingUpdateChannelConnectionSettingsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ChannelConnectionSettingsResponse>

        /**
         * Returns a raw HTTP response for `patch
         * /crm/extensions/calling/2026-03/{appId}/settings/recording`, but is otherwise the same as
         * [CallingService.updateRecordingSettings].
         */
        @MustBeClosed
        fun updateRecordingSettings(
            appId: Int,
            params: CallingUpdateRecordingSettingsParams,
        ): HttpResponseFor<RecordingSettingsResponse> =
            updateRecordingSettings(appId, params, RequestOptions.none())

        /** @see updateRecordingSettings */
        @MustBeClosed
        fun updateRecordingSettings(
            appId: Int,
            params: CallingUpdateRecordingSettingsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RecordingSettingsResponse> =
            updateRecordingSettings(params.toBuilder().appId(appId).build(), requestOptions)

        /** @see updateRecordingSettings */
        @MustBeClosed
        fun updateRecordingSettings(
            params: CallingUpdateRecordingSettingsParams
        ): HttpResponseFor<RecordingSettingsResponse> =
            updateRecordingSettings(params, RequestOptions.none())

        /** @see updateRecordingSettings */
        @MustBeClosed
        fun updateRecordingSettings(
            params: CallingUpdateRecordingSettingsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RecordingSettingsResponse>

        /**
         * Returns a raw HTTP response for `patch /crm/extensions/calling/2026-03/{appId}/settings`,
         * but is otherwise the same as [CallingService.updateSettings].
         */
        @MustBeClosed
        fun updateSettings(
            appId: Int,
            params: CallingUpdateSettingsParams,
        ): HttpResponseFor<SettingsResponse> = updateSettings(appId, params, RequestOptions.none())

        /** @see updateSettings */
        @MustBeClosed
        fun updateSettings(
            appId: Int,
            params: CallingUpdateSettingsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SettingsResponse> =
            updateSettings(params.toBuilder().appId(appId).build(), requestOptions)

        /** @see updateSettings */
        @MustBeClosed
        fun updateSettings(params: CallingUpdateSettingsParams): HttpResponseFor<SettingsResponse> =
            updateSettings(params, RequestOptions.none())

        /** @see updateSettings */
        @MustBeClosed
        fun updateSettings(
            params: CallingUpdateSettingsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SettingsResponse>
    }
}
