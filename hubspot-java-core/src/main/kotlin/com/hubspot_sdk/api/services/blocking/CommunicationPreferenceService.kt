// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.communicationpreferences.ActionResponseWithResultsPublicStatus
import com.hubspot_sdk.api.models.communicationpreferences.ActionResponseWithResultsPublicWideStatus
import com.hubspot_sdk.api.models.communicationpreferences.CommunicationPreferenceGenerateLinksParams
import com.hubspot_sdk.api.models.communicationpreferences.CommunicationPreferenceGetStatusByEmailParams
import com.hubspot_sdk.api.models.communicationpreferences.CommunicationPreferenceGetStatusesParams
import com.hubspot_sdk.api.models.communicationpreferences.CommunicationPreferenceGetUnsubscribeAllStatusParams
import com.hubspot_sdk.api.models.communicationpreferences.CommunicationPreferenceSubscribeParams
import com.hubspot_sdk.api.models.communicationpreferences.CommunicationPreferenceUnsubscribeAllParams
import com.hubspot_sdk.api.models.communicationpreferences.CommunicationPreferenceUnsubscribeParams
import com.hubspot_sdk.api.models.communicationpreferences.CommunicationPreferenceUpdateStatusParams
import com.hubspot_sdk.api.models.communicationpreferences.LinkGenerationResponse
import com.hubspot_sdk.api.models.communicationpreferences.PublicSubscriptionStatus
import com.hubspot_sdk.api.models.communicationpreferences.PublicSubscriptionStatusesResponse
import com.hubspot_sdk.api.models.communicationpreferences.PublicUpdateSubscriptionStatusRequest
import com.hubspot_sdk.api.services.blocking.communicationpreferences.DefinitionService
import com.hubspot_sdk.api.services.blocking.communicationpreferences.StatusService
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

    /**
     * Retrieve the subscription statuses for a specific email address. This endpoint allows you to
     * check the current subscription status for email communications, which can be useful for
     * managing communication preferences and ensuring compliance with user preferences.
     */
    fun getStatusByEmail(emailAddress: String): PublicSubscriptionStatusesResponse =
        getStatusByEmail(emailAddress, CommunicationPreferenceGetStatusByEmailParams.none())

    /** @see getStatusByEmail */
    fun getStatusByEmail(
        emailAddress: String,
        params: CommunicationPreferenceGetStatusByEmailParams =
            CommunicationPreferenceGetStatusByEmailParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PublicSubscriptionStatusesResponse =
        getStatusByEmail(params.toBuilder().emailAddress(emailAddress).build(), requestOptions)

    /** @see getStatusByEmail */
    fun getStatusByEmail(
        emailAddress: String,
        params: CommunicationPreferenceGetStatusByEmailParams =
            CommunicationPreferenceGetStatusByEmailParams.none(),
    ): PublicSubscriptionStatusesResponse =
        getStatusByEmail(emailAddress, params, RequestOptions.none())

    /** @see getStatusByEmail */
    fun getStatusByEmail(
        params: CommunicationPreferenceGetStatusByEmailParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PublicSubscriptionStatusesResponse

    /** @see getStatusByEmail */
    fun getStatusByEmail(
        params: CommunicationPreferenceGetStatusByEmailParams
    ): PublicSubscriptionStatusesResponse = getStatusByEmail(params, RequestOptions.none())

    /** @see getStatusByEmail */
    fun getStatusByEmail(
        emailAddress: String,
        requestOptions: RequestOptions,
    ): PublicSubscriptionStatusesResponse =
        getStatusByEmail(
            emailAddress,
            CommunicationPreferenceGetStatusByEmailParams.none(),
            requestOptions,
        )

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

    /**
     * Subscribe a user to a specific communication preference using their email address and
     * subscription ID. This endpoint allows you to manage subscription statuses by updating them to
     * 'subscribed' for a given email address. It is useful for ensuring that users receive
     * communications they have opted into.
     */
    fun subscribe(params: CommunicationPreferenceSubscribeParams): PublicSubscriptionStatus =
        subscribe(params, RequestOptions.none())

    /** @see subscribe */
    fun subscribe(
        params: CommunicationPreferenceSubscribeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PublicSubscriptionStatus

    /** @see subscribe */
    fun subscribe(
        publicUpdateSubscriptionStatusRequest: PublicUpdateSubscriptionStatusRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PublicSubscriptionStatus =
        subscribe(
            CommunicationPreferenceSubscribeParams.builder()
                .publicUpdateSubscriptionStatusRequest(publicUpdateSubscriptionStatusRequest)
                .build(),
            requestOptions,
        )

    /** @see subscribe */
    fun subscribe(
        publicUpdateSubscriptionStatusRequest: PublicUpdateSubscriptionStatusRequest
    ): PublicSubscriptionStatus =
        subscribe(publicUpdateSubscriptionStatusRequest, RequestOptions.none())

    /**
     * Unsubscribe a user from communication preferences. This endpoint allows you to update the
     * subscription status of a user to 'unsubscribed' for specified communication channels. It is
     * useful for managing user preferences and ensuring compliance with user opt-out requests.
     */
    fun unsubscribe(params: CommunicationPreferenceUnsubscribeParams): PublicSubscriptionStatus =
        unsubscribe(params, RequestOptions.none())

    /** @see unsubscribe */
    fun unsubscribe(
        params: CommunicationPreferenceUnsubscribeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PublicSubscriptionStatus

    /** @see unsubscribe */
    fun unsubscribe(
        publicUpdateSubscriptionStatusRequest: PublicUpdateSubscriptionStatusRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PublicSubscriptionStatus =
        unsubscribe(
            CommunicationPreferenceUnsubscribeParams.builder()
                .publicUpdateSubscriptionStatusRequest(publicUpdateSubscriptionStatusRequest)
                .build(),
            requestOptions,
        )

    /** @see unsubscribe */
    fun unsubscribe(
        publicUpdateSubscriptionStatusRequest: PublicUpdateSubscriptionStatusRequest
    ): PublicSubscriptionStatus =
        unsubscribe(publicUpdateSubscriptionStatusRequest, RequestOptions.none())

    /**
     * Unsubscribe a subscriber from all communication channels. This endpoint allows you to remove
     * a subscriber from all communication preferences, effectively opting them out from receiving
     * any further communications. This can be useful for ensuring compliance with user requests or
     * legal requirements.
     */
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
         * /communication-preferences/2026-03/status/email/{emailAddress}`, but is otherwise the
         * same as [CommunicationPreferenceService.getStatusByEmail].
         */
        @MustBeClosed
        fun getStatusByEmail(
            emailAddress: String
        ): HttpResponseFor<PublicSubscriptionStatusesResponse> =
            getStatusByEmail(emailAddress, CommunicationPreferenceGetStatusByEmailParams.none())

        /** @see getStatusByEmail */
        @MustBeClosed
        fun getStatusByEmail(
            emailAddress: String,
            params: CommunicationPreferenceGetStatusByEmailParams =
                CommunicationPreferenceGetStatusByEmailParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PublicSubscriptionStatusesResponse> =
            getStatusByEmail(params.toBuilder().emailAddress(emailAddress).build(), requestOptions)

        /** @see getStatusByEmail */
        @MustBeClosed
        fun getStatusByEmail(
            emailAddress: String,
            params: CommunicationPreferenceGetStatusByEmailParams =
                CommunicationPreferenceGetStatusByEmailParams.none(),
        ): HttpResponseFor<PublicSubscriptionStatusesResponse> =
            getStatusByEmail(emailAddress, params, RequestOptions.none())

        /** @see getStatusByEmail */
        @MustBeClosed
        fun getStatusByEmail(
            params: CommunicationPreferenceGetStatusByEmailParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PublicSubscriptionStatusesResponse>

        /** @see getStatusByEmail */
        @MustBeClosed
        fun getStatusByEmail(
            params: CommunicationPreferenceGetStatusByEmailParams
        ): HttpResponseFor<PublicSubscriptionStatusesResponse> =
            getStatusByEmail(params, RequestOptions.none())

        /** @see getStatusByEmail */
        @MustBeClosed
        fun getStatusByEmail(
            emailAddress: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PublicSubscriptionStatusesResponse> =
            getStatusByEmail(
                emailAddress,
                CommunicationPreferenceGetStatusByEmailParams.none(),
                requestOptions,
            )

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
         * Returns a raw HTTP response for `post /communication-preferences/2026-03/subscribe`, but
         * is otherwise the same as [CommunicationPreferenceService.subscribe].
         */
        @MustBeClosed
        fun subscribe(
            params: CommunicationPreferenceSubscribeParams
        ): HttpResponseFor<PublicSubscriptionStatus> = subscribe(params, RequestOptions.none())

        /** @see subscribe */
        @MustBeClosed
        fun subscribe(
            params: CommunicationPreferenceSubscribeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PublicSubscriptionStatus>

        /** @see subscribe */
        @MustBeClosed
        fun subscribe(
            publicUpdateSubscriptionStatusRequest: PublicUpdateSubscriptionStatusRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PublicSubscriptionStatus> =
            subscribe(
                CommunicationPreferenceSubscribeParams.builder()
                    .publicUpdateSubscriptionStatusRequest(publicUpdateSubscriptionStatusRequest)
                    .build(),
                requestOptions,
            )

        /** @see subscribe */
        @MustBeClosed
        fun subscribe(
            publicUpdateSubscriptionStatusRequest: PublicUpdateSubscriptionStatusRequest
        ): HttpResponseFor<PublicSubscriptionStatus> =
            subscribe(publicUpdateSubscriptionStatusRequest, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post /communication-preferences/2026-03/unsubscribe`,
         * but is otherwise the same as [CommunicationPreferenceService.unsubscribe].
         */
        @MustBeClosed
        fun unsubscribe(
            params: CommunicationPreferenceUnsubscribeParams
        ): HttpResponseFor<PublicSubscriptionStatus> = unsubscribe(params, RequestOptions.none())

        /** @see unsubscribe */
        @MustBeClosed
        fun unsubscribe(
            params: CommunicationPreferenceUnsubscribeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PublicSubscriptionStatus>

        /** @see unsubscribe */
        @MustBeClosed
        fun unsubscribe(
            publicUpdateSubscriptionStatusRequest: PublicUpdateSubscriptionStatusRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PublicSubscriptionStatus> =
            unsubscribe(
                CommunicationPreferenceUnsubscribeParams.builder()
                    .publicUpdateSubscriptionStatusRequest(publicUpdateSubscriptionStatusRequest)
                    .build(),
                requestOptions,
            )

        /** @see unsubscribe */
        @MustBeClosed
        fun unsubscribe(
            publicUpdateSubscriptionStatusRequest: PublicUpdateSubscriptionStatusRequest
        ): HttpResponseFor<PublicSubscriptionStatus> =
            unsubscribe(publicUpdateSubscriptionStatusRequest, RequestOptions.none())

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
