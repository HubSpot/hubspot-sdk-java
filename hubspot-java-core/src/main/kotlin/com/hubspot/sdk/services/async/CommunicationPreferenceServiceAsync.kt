// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.async

import com.hubspot.sdk.core.ClientOptions
import com.hubspot.sdk.core.RequestOptions
import com.hubspot.sdk.core.http.HttpResponseFor
import com.hubspot.sdk.models.communicationpreferences.ActionResponseWithResultsPublicStatus
import com.hubspot.sdk.models.communicationpreferences.ActionResponseWithResultsPublicWideStatus
import com.hubspot.sdk.models.communicationpreferences.CommunicationPreferenceGenerateLinksParams
import com.hubspot.sdk.models.communicationpreferences.CommunicationPreferenceGetStatusesParams
import com.hubspot.sdk.models.communicationpreferences.CommunicationPreferenceGetUnsubscribeAllStatusParams
import com.hubspot.sdk.models.communicationpreferences.CommunicationPreferenceUnsubscribeAllParams
import com.hubspot.sdk.models.communicationpreferences.CommunicationPreferenceUpdateStatusParams
import com.hubspot.sdk.models.communicationpreferences.LinkGenerationResponse
import com.hubspot.sdk.services.async.communicationpreferences.DefinitionServiceAsync
import com.hubspot.sdk.services.async.communicationpreferences.StatusServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface CommunicationPreferenceServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CommunicationPreferenceServiceAsync

    fun definitions(): DefinitionServiceAsync

    fun statuses(): StatusServiceAsync

    /**
     * Generate communication preference links for a subscriber. This endpoint allows you to create
     * URLs for managing preferences and unsubscribing, tailored to a specific subscriber. It is
     * useful for integrating communication preference management into your applications.
     */
    fun generateLinks(
        params: CommunicationPreferenceGenerateLinksParams
    ): CompletableFuture<LinkGenerationResponse> = generateLinks(params, RequestOptions.none())

    /** @see generateLinks */
    fun generateLinks(
        params: CommunicationPreferenceGenerateLinksParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LinkGenerationResponse>

    /** Retrieve a contact's current email subscription preferences. */
    fun getStatuses(
        subscriberIdString: String,
        params: CommunicationPreferenceGetStatusesParams,
    ): CompletableFuture<ActionResponseWithResultsPublicStatus> =
        getStatuses(subscriberIdString, params, RequestOptions.none())

    /** @see getStatuses */
    fun getStatuses(
        subscriberIdString: String,
        params: CommunicationPreferenceGetStatusesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ActionResponseWithResultsPublicStatus> =
        getStatuses(
            params.toBuilder().subscriberIdString(subscriberIdString).build(),
            requestOptions,
        )

    /** @see getStatuses */
    fun getStatuses(
        params: CommunicationPreferenceGetStatusesParams
    ): CompletableFuture<ActionResponseWithResultsPublicStatus> =
        getStatuses(params, RequestOptions.none())

    /** @see getStatuses */
    fun getStatuses(
        params: CommunicationPreferenceGetStatusesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ActionResponseWithResultsPublicStatus>

    /**
     * Check whether a contact has unsubscribed from all email subscriptions. If a contact has not
     * opted out of all communications, the response `results` array will be empty.
     */
    fun getUnsubscribeAllStatus(
        subscriberIdString: String,
        params: CommunicationPreferenceGetUnsubscribeAllStatusParams,
    ): CompletableFuture<ActionResponseWithResultsPublicWideStatus> =
        getUnsubscribeAllStatus(subscriberIdString, params, RequestOptions.none())

    /** @see getUnsubscribeAllStatus */
    fun getUnsubscribeAllStatus(
        subscriberIdString: String,
        params: CommunicationPreferenceGetUnsubscribeAllStatusParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ActionResponseWithResultsPublicWideStatus> =
        getUnsubscribeAllStatus(
            params.toBuilder().subscriberIdString(subscriberIdString).build(),
            requestOptions,
        )

    /** @see getUnsubscribeAllStatus */
    fun getUnsubscribeAllStatus(
        params: CommunicationPreferenceGetUnsubscribeAllStatusParams
    ): CompletableFuture<ActionResponseWithResultsPublicWideStatus> =
        getUnsubscribeAllStatus(params, RequestOptions.none())

    /** @see getUnsubscribeAllStatus */
    fun getUnsubscribeAllStatus(
        params: CommunicationPreferenceGetUnsubscribeAllStatusParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ActionResponseWithResultsPublicWideStatus>

    /** Unsubscribe a contact from all email subscriptions. */
    fun unsubscribeAll(
        subscriberIdString: String,
        params: CommunicationPreferenceUnsubscribeAllParams,
    ): CompletableFuture<ActionResponseWithResultsPublicStatus> =
        unsubscribeAll(subscriberIdString, params, RequestOptions.none())

    /** @see unsubscribeAll */
    fun unsubscribeAll(
        subscriberIdString: String,
        params: CommunicationPreferenceUnsubscribeAllParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ActionResponseWithResultsPublicStatus> =
        unsubscribeAll(
            params.toBuilder().subscriberIdString(subscriberIdString).build(),
            requestOptions,
        )

    /** @see unsubscribeAll */
    fun unsubscribeAll(
        params: CommunicationPreferenceUnsubscribeAllParams
    ): CompletableFuture<ActionResponseWithResultsPublicStatus> =
        unsubscribeAll(params, RequestOptions.none())

    /** @see unsubscribeAll */
    fun unsubscribeAll(
        params: CommunicationPreferenceUnsubscribeAllParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ActionResponseWithResultsPublicStatus>

    /** Set the subscription status of a specific contact. */
    fun updateStatus(
        subscriberIdString: String,
        params: CommunicationPreferenceUpdateStatusParams,
    ): CompletableFuture<ActionResponseWithResultsPublicStatus> =
        updateStatus(subscriberIdString, params, RequestOptions.none())

    /** @see updateStatus */
    fun updateStatus(
        subscriberIdString: String,
        params: CommunicationPreferenceUpdateStatusParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ActionResponseWithResultsPublicStatus> =
        updateStatus(
            params.toBuilder().subscriberIdString(subscriberIdString).build(),
            requestOptions,
        )

    /** @see updateStatus */
    fun updateStatus(
        params: CommunicationPreferenceUpdateStatusParams
    ): CompletableFuture<ActionResponseWithResultsPublicStatus> =
        updateStatus(params, RequestOptions.none())

    /** @see updateStatus */
    fun updateStatus(
        params: CommunicationPreferenceUpdateStatusParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ActionResponseWithResultsPublicStatus>

    /**
     * A view of [CommunicationPreferenceServiceAsync] that provides access to raw HTTP responses
     * for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CommunicationPreferenceServiceAsync.WithRawResponse

        fun definitions(): DefinitionServiceAsync.WithRawResponse

        fun statuses(): StatusServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /communication-preferences/2026-03/links/generate`,
         * but is otherwise the same as [CommunicationPreferenceServiceAsync.generateLinks].
         */
        fun generateLinks(
            params: CommunicationPreferenceGenerateLinksParams
        ): CompletableFuture<HttpResponseFor<LinkGenerationResponse>> =
            generateLinks(params, RequestOptions.none())

        /** @see generateLinks */
        fun generateLinks(
            params: CommunicationPreferenceGenerateLinksParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LinkGenerationResponse>>

        /**
         * Returns a raw HTTP response for `get
         * /communication-preferences/2026-03/statuses/{subscriberIdString}`, but is otherwise the
         * same as [CommunicationPreferenceServiceAsync.getStatuses].
         */
        fun getStatuses(
            subscriberIdString: String,
            params: CommunicationPreferenceGetStatusesParams,
        ): CompletableFuture<HttpResponseFor<ActionResponseWithResultsPublicStatus>> =
            getStatuses(subscriberIdString, params, RequestOptions.none())

        /** @see getStatuses */
        fun getStatuses(
            subscriberIdString: String,
            params: CommunicationPreferenceGetStatusesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ActionResponseWithResultsPublicStatus>> =
            getStatuses(
                params.toBuilder().subscriberIdString(subscriberIdString).build(),
                requestOptions,
            )

        /** @see getStatuses */
        fun getStatuses(
            params: CommunicationPreferenceGetStatusesParams
        ): CompletableFuture<HttpResponseFor<ActionResponseWithResultsPublicStatus>> =
            getStatuses(params, RequestOptions.none())

        /** @see getStatuses */
        fun getStatuses(
            params: CommunicationPreferenceGetStatusesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ActionResponseWithResultsPublicStatus>>

        /**
         * Returns a raw HTTP response for `get
         * /communication-preferences/2026-03/statuses/{subscriberIdString}/unsubscribe-all`, but is
         * otherwise the same as [CommunicationPreferenceServiceAsync.getUnsubscribeAllStatus].
         */
        fun getUnsubscribeAllStatus(
            subscriberIdString: String,
            params: CommunicationPreferenceGetUnsubscribeAllStatusParams,
        ): CompletableFuture<HttpResponseFor<ActionResponseWithResultsPublicWideStatus>> =
            getUnsubscribeAllStatus(subscriberIdString, params, RequestOptions.none())

        /** @see getUnsubscribeAllStatus */
        fun getUnsubscribeAllStatus(
            subscriberIdString: String,
            params: CommunicationPreferenceGetUnsubscribeAllStatusParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ActionResponseWithResultsPublicWideStatus>> =
            getUnsubscribeAllStatus(
                params.toBuilder().subscriberIdString(subscriberIdString).build(),
                requestOptions,
            )

        /** @see getUnsubscribeAllStatus */
        fun getUnsubscribeAllStatus(
            params: CommunicationPreferenceGetUnsubscribeAllStatusParams
        ): CompletableFuture<HttpResponseFor<ActionResponseWithResultsPublicWideStatus>> =
            getUnsubscribeAllStatus(params, RequestOptions.none())

        /** @see getUnsubscribeAllStatus */
        fun getUnsubscribeAllStatus(
            params: CommunicationPreferenceGetUnsubscribeAllStatusParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ActionResponseWithResultsPublicWideStatus>>

        /**
         * Returns a raw HTTP response for `post
         * /communication-preferences/2026-03/statuses/{subscriberIdString}/unsubscribe-all`, but is
         * otherwise the same as [CommunicationPreferenceServiceAsync.unsubscribeAll].
         */
        fun unsubscribeAll(
            subscriberIdString: String,
            params: CommunicationPreferenceUnsubscribeAllParams,
        ): CompletableFuture<HttpResponseFor<ActionResponseWithResultsPublicStatus>> =
            unsubscribeAll(subscriberIdString, params, RequestOptions.none())

        /** @see unsubscribeAll */
        fun unsubscribeAll(
            subscriberIdString: String,
            params: CommunicationPreferenceUnsubscribeAllParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ActionResponseWithResultsPublicStatus>> =
            unsubscribeAll(
                params.toBuilder().subscriberIdString(subscriberIdString).build(),
                requestOptions,
            )

        /** @see unsubscribeAll */
        fun unsubscribeAll(
            params: CommunicationPreferenceUnsubscribeAllParams
        ): CompletableFuture<HttpResponseFor<ActionResponseWithResultsPublicStatus>> =
            unsubscribeAll(params, RequestOptions.none())

        /** @see unsubscribeAll */
        fun unsubscribeAll(
            params: CommunicationPreferenceUnsubscribeAllParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ActionResponseWithResultsPublicStatus>>

        /**
         * Returns a raw HTTP response for `post
         * /communication-preferences/2026-03/statuses/{subscriberIdString}`, but is otherwise the
         * same as [CommunicationPreferenceServiceAsync.updateStatus].
         */
        fun updateStatus(
            subscriberIdString: String,
            params: CommunicationPreferenceUpdateStatusParams,
        ): CompletableFuture<HttpResponseFor<ActionResponseWithResultsPublicStatus>> =
            updateStatus(subscriberIdString, params, RequestOptions.none())

        /** @see updateStatus */
        fun updateStatus(
            subscriberIdString: String,
            params: CommunicationPreferenceUpdateStatusParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ActionResponseWithResultsPublicStatus>> =
            updateStatus(
                params.toBuilder().subscriberIdString(subscriberIdString).build(),
                requestOptions,
            )

        /** @see updateStatus */
        fun updateStatus(
            params: CommunicationPreferenceUpdateStatusParams
        ): CompletableFuture<HttpResponseFor<ActionResponseWithResultsPublicStatus>> =
            updateStatus(params, RequestOptions.none())

        /** @see updateStatus */
        fun updateStatus(
            params: CommunicationPreferenceUpdateStatusParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ActionResponseWithResultsPublicStatus>>
    }
}
