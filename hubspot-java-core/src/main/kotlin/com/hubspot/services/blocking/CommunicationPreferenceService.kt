// File generated from our OpenAPI spec by Stainless.

package com.hubspot.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.hubspot.core.ClientOptions
import com.hubspot.core.RequestOptions
import com.hubspot.core.http.HttpResponseFor
import com.hubspot.models.communicationpreferences.ActionResponseWithResultsPublicStatus
import com.hubspot.models.communicationpreferences.ActionResponseWithResultsPublicWideStatus
import com.hubspot.models.communicationpreferences.CommunicationPreferenceGenerateLinksParams
import com.hubspot.models.communicationpreferences.CommunicationPreferenceGetStatusesParams
import com.hubspot.models.communicationpreferences.CommunicationPreferenceGetUnsubscribeAllStatusParams
import com.hubspot.models.communicationpreferences.CommunicationPreferenceUnsubscribeAllParams
import com.hubspot.models.communicationpreferences.CommunicationPreferenceUpdateStatusParams
import com.hubspot.models.communicationpreferences.LinkGenerationResponse
import com.hubspot.services.blocking.communicationpreferences.DefinitionService
import com.hubspot.services.blocking.communicationpreferences.StatusService
import java.util.function.Consumer

interface CommunicationPreferenceService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CommunicationPreferenceService

    fun definitions(): DefinitionService

    fun statuses(): StatusService

    /**
     * Generate communication preference links for a subscriber. This endpoint allows you to create
     * URLs for managing preferences and unsubscribing, tailored to a specific subscriber. It is
     * useful for integrating communication preference management into your applications.
     */
    fun generateLinks(params: CommunicationPreferenceGenerateLinksParams): LinkGenerationResponse =
        generateLinks(params, RequestOptions.none())

    /** @see generateLinks */
    fun generateLinks(
        params: CommunicationPreferenceGenerateLinksParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LinkGenerationResponse

    /** Retrieve a contact's current email subscription preferences. */
    fun getStatuses(
        subscriberIdString: String,
        params: CommunicationPreferenceGetStatusesParams,
    ): ActionResponseWithResultsPublicStatus =
        getStatuses(subscriberIdString, params, RequestOptions.none())

    /** @see getStatuses */
    fun getStatuses(
        subscriberIdString: String,
        params: CommunicationPreferenceGetStatusesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ActionResponseWithResultsPublicStatus =
        getStatuses(
            params.toBuilder().subscriberIdString(subscriberIdString).build(),
            requestOptions,
        )

    /** @see getStatuses */
    fun getStatuses(
        params: CommunicationPreferenceGetStatusesParams
    ): ActionResponseWithResultsPublicStatus = getStatuses(params, RequestOptions.none())

    /** @see getStatuses */
    fun getStatuses(
        params: CommunicationPreferenceGetStatusesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ActionResponseWithResultsPublicStatus

    /**
     * Check whether a contact has unsubscribed from all email subscriptions. If a contact has not
     * opted out of all communications, the response `results` array will be empty.
     */
    fun getUnsubscribeAllStatus(
        subscriberIdString: String,
        params: CommunicationPreferenceGetUnsubscribeAllStatusParams,
    ): ActionResponseWithResultsPublicWideStatus =
        getUnsubscribeAllStatus(subscriberIdString, params, RequestOptions.none())

    /** @see getUnsubscribeAllStatus */
    fun getUnsubscribeAllStatus(
        subscriberIdString: String,
        params: CommunicationPreferenceGetUnsubscribeAllStatusParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ActionResponseWithResultsPublicWideStatus =
        getUnsubscribeAllStatus(
            params.toBuilder().subscriberIdString(subscriberIdString).build(),
            requestOptions,
        )

    /** @see getUnsubscribeAllStatus */
    fun getUnsubscribeAllStatus(
        params: CommunicationPreferenceGetUnsubscribeAllStatusParams
    ): ActionResponseWithResultsPublicWideStatus =
        getUnsubscribeAllStatus(params, RequestOptions.none())

    /** @see getUnsubscribeAllStatus */
    fun getUnsubscribeAllStatus(
        params: CommunicationPreferenceGetUnsubscribeAllStatusParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ActionResponseWithResultsPublicWideStatus

    /** Unsubscribe a contact from all email subscriptions. */
    fun unsubscribeAll(
        subscriberIdString: String,
        params: CommunicationPreferenceUnsubscribeAllParams,
    ): ActionResponseWithResultsPublicStatus =
        unsubscribeAll(subscriberIdString, params, RequestOptions.none())

    /** @see unsubscribeAll */
    fun unsubscribeAll(
        subscriberIdString: String,
        params: CommunicationPreferenceUnsubscribeAllParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ActionResponseWithResultsPublicStatus =
        unsubscribeAll(
            params.toBuilder().subscriberIdString(subscriberIdString).build(),
            requestOptions,
        )

    /** @see unsubscribeAll */
    fun unsubscribeAll(
        params: CommunicationPreferenceUnsubscribeAllParams
    ): ActionResponseWithResultsPublicStatus = unsubscribeAll(params, RequestOptions.none())

    /** @see unsubscribeAll */
    fun unsubscribeAll(
        params: CommunicationPreferenceUnsubscribeAllParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ActionResponseWithResultsPublicStatus

    /** Set the subscription status of a specific contact. */
    fun updateStatus(
        subscriberIdString: String,
        params: CommunicationPreferenceUpdateStatusParams,
    ): ActionResponseWithResultsPublicStatus =
        updateStatus(subscriberIdString, params, RequestOptions.none())

    /** @see updateStatus */
    fun updateStatus(
        subscriberIdString: String,
        params: CommunicationPreferenceUpdateStatusParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ActionResponseWithResultsPublicStatus =
        updateStatus(
            params.toBuilder().subscriberIdString(subscriberIdString).build(),
            requestOptions,
        )

    /** @see updateStatus */
    fun updateStatus(
        params: CommunicationPreferenceUpdateStatusParams
    ): ActionResponseWithResultsPublicStatus = updateStatus(params, RequestOptions.none())

    /** @see updateStatus */
    fun updateStatus(
        params: CommunicationPreferenceUpdateStatusParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ActionResponseWithResultsPublicStatus

    /**
     * A view of [CommunicationPreferenceService] that provides access to raw HTTP responses for
     * each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CommunicationPreferenceService.WithRawResponse

        fun definitions(): DefinitionService.WithRawResponse

        fun statuses(): StatusService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /communication-preferences/2026-03/links/generate`,
         * but is otherwise the same as [CommunicationPreferenceService.generateLinks].
         */
        @MustBeClosed
        fun generateLinks(
            params: CommunicationPreferenceGenerateLinksParams
        ): HttpResponseFor<LinkGenerationResponse> = generateLinks(params, RequestOptions.none())

        /** @see generateLinks */
        @MustBeClosed
        fun generateLinks(
            params: CommunicationPreferenceGenerateLinksParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LinkGenerationResponse>

        /**
         * Returns a raw HTTP response for `get
         * /communication-preferences/2026-03/statuses/{subscriberIdString}`, but is otherwise the
         * same as [CommunicationPreferenceService.getStatuses].
         */
        @MustBeClosed
        fun getStatuses(
            subscriberIdString: String,
            params: CommunicationPreferenceGetStatusesParams,
        ): HttpResponseFor<ActionResponseWithResultsPublicStatus> =
            getStatuses(subscriberIdString, params, RequestOptions.none())

        /** @see getStatuses */
        @MustBeClosed
        fun getStatuses(
            subscriberIdString: String,
            params: CommunicationPreferenceGetStatusesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ActionResponseWithResultsPublicStatus> =
            getStatuses(
                params.toBuilder().subscriberIdString(subscriberIdString).build(),
                requestOptions,
            )

        /** @see getStatuses */
        @MustBeClosed
        fun getStatuses(
            params: CommunicationPreferenceGetStatusesParams
        ): HttpResponseFor<ActionResponseWithResultsPublicStatus> =
            getStatuses(params, RequestOptions.none())

        /** @see getStatuses */
        @MustBeClosed
        fun getStatuses(
            params: CommunicationPreferenceGetStatusesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ActionResponseWithResultsPublicStatus>

        /**
         * Returns a raw HTTP response for `get
         * /communication-preferences/2026-03/statuses/{subscriberIdString}/unsubscribe-all`, but is
         * otherwise the same as [CommunicationPreferenceService.getUnsubscribeAllStatus].
         */
        @MustBeClosed
        fun getUnsubscribeAllStatus(
            subscriberIdString: String,
            params: CommunicationPreferenceGetUnsubscribeAllStatusParams,
        ): HttpResponseFor<ActionResponseWithResultsPublicWideStatus> =
            getUnsubscribeAllStatus(subscriberIdString, params, RequestOptions.none())

        /** @see getUnsubscribeAllStatus */
        @MustBeClosed
        fun getUnsubscribeAllStatus(
            subscriberIdString: String,
            params: CommunicationPreferenceGetUnsubscribeAllStatusParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ActionResponseWithResultsPublicWideStatus> =
            getUnsubscribeAllStatus(
                params.toBuilder().subscriberIdString(subscriberIdString).build(),
                requestOptions,
            )

        /** @see getUnsubscribeAllStatus */
        @MustBeClosed
        fun getUnsubscribeAllStatus(
            params: CommunicationPreferenceGetUnsubscribeAllStatusParams
        ): HttpResponseFor<ActionResponseWithResultsPublicWideStatus> =
            getUnsubscribeAllStatus(params, RequestOptions.none())

        /** @see getUnsubscribeAllStatus */
        @MustBeClosed
        fun getUnsubscribeAllStatus(
            params: CommunicationPreferenceGetUnsubscribeAllStatusParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ActionResponseWithResultsPublicWideStatus>

        /**
         * Returns a raw HTTP response for `post
         * /communication-preferences/2026-03/statuses/{subscriberIdString}/unsubscribe-all`, but is
         * otherwise the same as [CommunicationPreferenceService.unsubscribeAll].
         */
        @MustBeClosed
        fun unsubscribeAll(
            subscriberIdString: String,
            params: CommunicationPreferenceUnsubscribeAllParams,
        ): HttpResponseFor<ActionResponseWithResultsPublicStatus> =
            unsubscribeAll(subscriberIdString, params, RequestOptions.none())

        /** @see unsubscribeAll */
        @MustBeClosed
        fun unsubscribeAll(
            subscriberIdString: String,
            params: CommunicationPreferenceUnsubscribeAllParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ActionResponseWithResultsPublicStatus> =
            unsubscribeAll(
                params.toBuilder().subscriberIdString(subscriberIdString).build(),
                requestOptions,
            )

        /** @see unsubscribeAll */
        @MustBeClosed
        fun unsubscribeAll(
            params: CommunicationPreferenceUnsubscribeAllParams
        ): HttpResponseFor<ActionResponseWithResultsPublicStatus> =
            unsubscribeAll(params, RequestOptions.none())

        /** @see unsubscribeAll */
        @MustBeClosed
        fun unsubscribeAll(
            params: CommunicationPreferenceUnsubscribeAllParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ActionResponseWithResultsPublicStatus>

        /**
         * Returns a raw HTTP response for `post
         * /communication-preferences/2026-03/statuses/{subscriberIdString}`, but is otherwise the
         * same as [CommunicationPreferenceService.updateStatus].
         */
        @MustBeClosed
        fun updateStatus(
            subscriberIdString: String,
            params: CommunicationPreferenceUpdateStatusParams,
        ): HttpResponseFor<ActionResponseWithResultsPublicStatus> =
            updateStatus(subscriberIdString, params, RequestOptions.none())

        /** @see updateStatus */
        @MustBeClosed
        fun updateStatus(
            subscriberIdString: String,
            params: CommunicationPreferenceUpdateStatusParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ActionResponseWithResultsPublicStatus> =
            updateStatus(
                params.toBuilder().subscriberIdString(subscriberIdString).build(),
                requestOptions,
            )

        /** @see updateStatus */
        @MustBeClosed
        fun updateStatus(
            params: CommunicationPreferenceUpdateStatusParams
        ): HttpResponseFor<ActionResponseWithResultsPublicStatus> =
            updateStatus(params, RequestOptions.none())

        /** @see updateStatus */
        @MustBeClosed
        fun updateStatus(
            params: CommunicationPreferenceUpdateStatusParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ActionResponseWithResultsPublicStatus>
    }
}
