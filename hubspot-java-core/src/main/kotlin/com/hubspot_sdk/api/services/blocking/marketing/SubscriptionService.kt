// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.marketing

import com.google.errorprone.annotations.MustBeClosed
import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.marketing.subscriptions.PublicSubscriptionStatus
import com.hubspot_sdk.api.models.marketing.subscriptions.PublicSubscriptionStatusesResponse
import com.hubspot_sdk.api.models.marketing.subscriptions.PublicUpdateSubscriptionStatusRequest
import com.hubspot_sdk.api.models.marketing.subscriptions.SubscriptionDefinitionsResponse
import com.hubspot_sdk.api.models.marketing.subscriptions.SubscriptionGetEmailStatusParams
import com.hubspot_sdk.api.models.marketing.subscriptions.SubscriptionListParams
import com.hubspot_sdk.api.models.marketing.subscriptions.SubscriptionSubscribeParams
import com.hubspot_sdk.api.models.marketing.subscriptions.SubscriptionUnsubscribeParams
import com.hubspot_sdk.api.services.blocking.marketing.subscriptions.V4Service
import java.util.function.Consumer

interface SubscriptionService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SubscriptionService

    fun v4(): V4Service

    /** Get a list of all subscription definitions for the portal */
    fun list(): SubscriptionDefinitionsResponse = list(SubscriptionListParams.none())

    /** @see list */
    fun list(
        params: SubscriptionListParams = SubscriptionListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SubscriptionDefinitionsResponse

    /** @see list */
    fun list(
        params: SubscriptionListParams = SubscriptionListParams.none()
    ): SubscriptionDefinitionsResponse = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): SubscriptionDefinitionsResponse =
        list(SubscriptionListParams.none(), requestOptions)

    /** Returns a list of subscriptions and their status for a given contact. */
    fun getEmailStatus(emailAddress: String): PublicSubscriptionStatusesResponse =
        getEmailStatus(emailAddress, SubscriptionGetEmailStatusParams.none())

    /** @see getEmailStatus */
    fun getEmailStatus(
        emailAddress: String,
        params: SubscriptionGetEmailStatusParams = SubscriptionGetEmailStatusParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PublicSubscriptionStatusesResponse =
        getEmailStatus(params.toBuilder().emailAddress(emailAddress).build(), requestOptions)

    /** @see getEmailStatus */
    fun getEmailStatus(
        emailAddress: String,
        params: SubscriptionGetEmailStatusParams = SubscriptionGetEmailStatusParams.none(),
    ): PublicSubscriptionStatusesResponse =
        getEmailStatus(emailAddress, params, RequestOptions.none())

    /** @see getEmailStatus */
    fun getEmailStatus(
        params: SubscriptionGetEmailStatusParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PublicSubscriptionStatusesResponse

    /** @see getEmailStatus */
    fun getEmailStatus(
        params: SubscriptionGetEmailStatusParams
    ): PublicSubscriptionStatusesResponse = getEmailStatus(params, RequestOptions.none())

    /** @see getEmailStatus */
    fun getEmailStatus(
        emailAddress: String,
        requestOptions: RequestOptions,
    ): PublicSubscriptionStatusesResponse =
        getEmailStatus(emailAddress, SubscriptionGetEmailStatusParams.none(), requestOptions)

    /**
     * Subscribes a contact to the given subscription type. This API is not valid to use for
     * subscribing a contact at a brand or portal level and will return an error.
     */
    fun subscribe(params: SubscriptionSubscribeParams): PublicSubscriptionStatus =
        subscribe(params, RequestOptions.none())

    /** @see subscribe */
    fun subscribe(
        params: SubscriptionSubscribeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PublicSubscriptionStatus

    /** @see subscribe */
    fun subscribe(
        publicUpdateSubscriptionStatusRequest: PublicUpdateSubscriptionStatusRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PublicSubscriptionStatus =
        subscribe(
            SubscriptionSubscribeParams.builder()
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
     * Unsubscribes a contact from the given subscription type. This API is not valid to use for
     * unsubscribing a contact at a brand or portal level and will return an error.
     */
    fun unsubscribe(params: SubscriptionUnsubscribeParams): PublicSubscriptionStatus =
        unsubscribe(params, RequestOptions.none())

    /** @see unsubscribe */
    fun unsubscribe(
        params: SubscriptionUnsubscribeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PublicSubscriptionStatus

    /** @see unsubscribe */
    fun unsubscribe(
        publicUpdateSubscriptionStatusRequest: PublicUpdateSubscriptionStatusRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PublicSubscriptionStatus =
        unsubscribe(
            SubscriptionUnsubscribeParams.builder()
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
     * A view of [SubscriptionService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SubscriptionService.WithRawResponse

        fun v4(): V4Service.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /communication-preferences/v3/definitions`, but is
         * otherwise the same as [SubscriptionService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<SubscriptionDefinitionsResponse> =
            list(SubscriptionListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: SubscriptionListParams = SubscriptionListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SubscriptionDefinitionsResponse>

        /** @see list */
        @MustBeClosed
        fun list(
            params: SubscriptionListParams = SubscriptionListParams.none()
        ): HttpResponseFor<SubscriptionDefinitionsResponse> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<SubscriptionDefinitionsResponse> =
            list(SubscriptionListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get
         * /communication-preferences/v3/status/email/{emailAddress}`, but is otherwise the same as
         * [SubscriptionService.getEmailStatus].
         */
        @MustBeClosed
        fun getEmailStatus(
            emailAddress: String
        ): HttpResponseFor<PublicSubscriptionStatusesResponse> =
            getEmailStatus(emailAddress, SubscriptionGetEmailStatusParams.none())

        /** @see getEmailStatus */
        @MustBeClosed
        fun getEmailStatus(
            emailAddress: String,
            params: SubscriptionGetEmailStatusParams = SubscriptionGetEmailStatusParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PublicSubscriptionStatusesResponse> =
            getEmailStatus(params.toBuilder().emailAddress(emailAddress).build(), requestOptions)

        /** @see getEmailStatus */
        @MustBeClosed
        fun getEmailStatus(
            emailAddress: String,
            params: SubscriptionGetEmailStatusParams = SubscriptionGetEmailStatusParams.none(),
        ): HttpResponseFor<PublicSubscriptionStatusesResponse> =
            getEmailStatus(emailAddress, params, RequestOptions.none())

        /** @see getEmailStatus */
        @MustBeClosed
        fun getEmailStatus(
            params: SubscriptionGetEmailStatusParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PublicSubscriptionStatusesResponse>

        /** @see getEmailStatus */
        @MustBeClosed
        fun getEmailStatus(
            params: SubscriptionGetEmailStatusParams
        ): HttpResponseFor<PublicSubscriptionStatusesResponse> =
            getEmailStatus(params, RequestOptions.none())

        /** @see getEmailStatus */
        @MustBeClosed
        fun getEmailStatus(
            emailAddress: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PublicSubscriptionStatusesResponse> =
            getEmailStatus(emailAddress, SubscriptionGetEmailStatusParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /communication-preferences/v3/subscribe`, but is
         * otherwise the same as [SubscriptionService.subscribe].
         */
        @MustBeClosed
        fun subscribe(
            params: SubscriptionSubscribeParams
        ): HttpResponseFor<PublicSubscriptionStatus> = subscribe(params, RequestOptions.none())

        /** @see subscribe */
        @MustBeClosed
        fun subscribe(
            params: SubscriptionSubscribeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PublicSubscriptionStatus>

        /** @see subscribe */
        @MustBeClosed
        fun subscribe(
            publicUpdateSubscriptionStatusRequest: PublicUpdateSubscriptionStatusRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PublicSubscriptionStatus> =
            subscribe(
                SubscriptionSubscribeParams.builder()
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
         * Returns a raw HTTP response for `post /communication-preferences/v3/unsubscribe`, but is
         * otherwise the same as [SubscriptionService.unsubscribe].
         */
        @MustBeClosed
        fun unsubscribe(
            params: SubscriptionUnsubscribeParams
        ): HttpResponseFor<PublicSubscriptionStatus> = unsubscribe(params, RequestOptions.none())

        /** @see unsubscribe */
        @MustBeClosed
        fun unsubscribe(
            params: SubscriptionUnsubscribeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PublicSubscriptionStatus>

        /** @see unsubscribe */
        @MustBeClosed
        fun unsubscribe(
            publicUpdateSubscriptionStatusRequest: PublicUpdateSubscriptionStatusRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PublicSubscriptionStatus> =
            unsubscribe(
                SubscriptionUnsubscribeParams.builder()
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
    }
}
