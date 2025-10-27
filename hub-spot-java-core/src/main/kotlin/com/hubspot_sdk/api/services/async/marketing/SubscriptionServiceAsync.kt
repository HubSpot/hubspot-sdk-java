// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.marketing

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
import com.hubspot_sdk.api.services.async.marketing.subscriptions.V4ServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface SubscriptionServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SubscriptionServiceAsync

    fun v4(): V4ServiceAsync

    /** Get a list of all subscription definitions for the portal */
    fun list(): CompletableFuture<SubscriptionDefinitionsResponse> =
        list(SubscriptionListParams.none())

    /** @see list */
    fun list(
        params: SubscriptionListParams = SubscriptionListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SubscriptionDefinitionsResponse>

    /** @see list */
    fun list(
        params: SubscriptionListParams = SubscriptionListParams.none()
    ): CompletableFuture<SubscriptionDefinitionsResponse> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<SubscriptionDefinitionsResponse> =
        list(SubscriptionListParams.none(), requestOptions)

    /** Returns a list of subscriptions and their status for a given contact. */
    fun getEmailStatus(
        emailAddress: String
    ): CompletableFuture<PublicSubscriptionStatusesResponse> =
        getEmailStatus(emailAddress, SubscriptionGetEmailStatusParams.none())

    /** @see getEmailStatus */
    fun getEmailStatus(
        emailAddress: String,
        params: SubscriptionGetEmailStatusParams = SubscriptionGetEmailStatusParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PublicSubscriptionStatusesResponse> =
        getEmailStatus(params.toBuilder().emailAddress(emailAddress).build(), requestOptions)

    /** @see getEmailStatus */
    fun getEmailStatus(
        emailAddress: String,
        params: SubscriptionGetEmailStatusParams = SubscriptionGetEmailStatusParams.none(),
    ): CompletableFuture<PublicSubscriptionStatusesResponse> =
        getEmailStatus(emailAddress, params, RequestOptions.none())

    /** @see getEmailStatus */
    fun getEmailStatus(
        params: SubscriptionGetEmailStatusParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PublicSubscriptionStatusesResponse>

    /** @see getEmailStatus */
    fun getEmailStatus(
        params: SubscriptionGetEmailStatusParams
    ): CompletableFuture<PublicSubscriptionStatusesResponse> =
        getEmailStatus(params, RequestOptions.none())

    /** @see getEmailStatus */
    fun getEmailStatus(
        emailAddress: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<PublicSubscriptionStatusesResponse> =
        getEmailStatus(emailAddress, SubscriptionGetEmailStatusParams.none(), requestOptions)

    /**
     * Subscribes a contact to the given subscription type. This API is not valid to use for
     * subscribing a contact at a brand or portal level and will return an error.
     */
    fun subscribe(
        params: SubscriptionSubscribeParams
    ): CompletableFuture<PublicSubscriptionStatus> = subscribe(params, RequestOptions.none())

    /** @see subscribe */
    fun subscribe(
        params: SubscriptionSubscribeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PublicSubscriptionStatus>

    /** @see subscribe */
    fun subscribe(
        publicUpdateSubscriptionStatusRequest: PublicUpdateSubscriptionStatusRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PublicSubscriptionStatus> =
        subscribe(
            SubscriptionSubscribeParams.builder()
                .publicUpdateSubscriptionStatusRequest(publicUpdateSubscriptionStatusRequest)
                .build(),
            requestOptions,
        )

    /** @see subscribe */
    fun subscribe(
        publicUpdateSubscriptionStatusRequest: PublicUpdateSubscriptionStatusRequest
    ): CompletableFuture<PublicSubscriptionStatus> =
        subscribe(publicUpdateSubscriptionStatusRequest, RequestOptions.none())

    /**
     * Unsubscribes a contact from the given subscription type. This API is not valid to use for
     * unsubscribing a contact at a brand or portal level and will return an error.
     */
    fun unsubscribe(
        params: SubscriptionUnsubscribeParams
    ): CompletableFuture<PublicSubscriptionStatus> = unsubscribe(params, RequestOptions.none())

    /** @see unsubscribe */
    fun unsubscribe(
        params: SubscriptionUnsubscribeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PublicSubscriptionStatus>

    /** @see unsubscribe */
    fun unsubscribe(
        publicUpdateSubscriptionStatusRequest: PublicUpdateSubscriptionStatusRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PublicSubscriptionStatus> =
        unsubscribe(
            SubscriptionUnsubscribeParams.builder()
                .publicUpdateSubscriptionStatusRequest(publicUpdateSubscriptionStatusRequest)
                .build(),
            requestOptions,
        )

    /** @see unsubscribe */
    fun unsubscribe(
        publicUpdateSubscriptionStatusRequest: PublicUpdateSubscriptionStatusRequest
    ): CompletableFuture<PublicSubscriptionStatus> =
        unsubscribe(publicUpdateSubscriptionStatusRequest, RequestOptions.none())

    /**
     * A view of [SubscriptionServiceAsync] that provides access to raw HTTP responses for each
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
        ): SubscriptionServiceAsync.WithRawResponse

        fun v4(): V4ServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /communication-preferences/v3/definitions`, but is
         * otherwise the same as [SubscriptionServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<SubscriptionDefinitionsResponse>> =
            list(SubscriptionListParams.none())

        /** @see list */
        fun list(
            params: SubscriptionListParams = SubscriptionListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SubscriptionDefinitionsResponse>>

        /** @see list */
        fun list(
            params: SubscriptionListParams = SubscriptionListParams.none()
        ): CompletableFuture<HttpResponseFor<SubscriptionDefinitionsResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<SubscriptionDefinitionsResponse>> =
            list(SubscriptionListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get
         * /communication-preferences/v3/status/email/{emailAddress}`, but is otherwise the same as
         * [SubscriptionServiceAsync.getEmailStatus].
         */
        fun getEmailStatus(
            emailAddress: String
        ): CompletableFuture<HttpResponseFor<PublicSubscriptionStatusesResponse>> =
            getEmailStatus(emailAddress, SubscriptionGetEmailStatusParams.none())

        /** @see getEmailStatus */
        fun getEmailStatus(
            emailAddress: String,
            params: SubscriptionGetEmailStatusParams = SubscriptionGetEmailStatusParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PublicSubscriptionStatusesResponse>> =
            getEmailStatus(params.toBuilder().emailAddress(emailAddress).build(), requestOptions)

        /** @see getEmailStatus */
        fun getEmailStatus(
            emailAddress: String,
            params: SubscriptionGetEmailStatusParams = SubscriptionGetEmailStatusParams.none(),
        ): CompletableFuture<HttpResponseFor<PublicSubscriptionStatusesResponse>> =
            getEmailStatus(emailAddress, params, RequestOptions.none())

        /** @see getEmailStatus */
        fun getEmailStatus(
            params: SubscriptionGetEmailStatusParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PublicSubscriptionStatusesResponse>>

        /** @see getEmailStatus */
        fun getEmailStatus(
            params: SubscriptionGetEmailStatusParams
        ): CompletableFuture<HttpResponseFor<PublicSubscriptionStatusesResponse>> =
            getEmailStatus(params, RequestOptions.none())

        /** @see getEmailStatus */
        fun getEmailStatus(
            emailAddress: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PublicSubscriptionStatusesResponse>> =
            getEmailStatus(emailAddress, SubscriptionGetEmailStatusParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /communication-preferences/v3/subscribe`, but is
         * otherwise the same as [SubscriptionServiceAsync.subscribe].
         */
        fun subscribe(
            params: SubscriptionSubscribeParams
        ): CompletableFuture<HttpResponseFor<PublicSubscriptionStatus>> =
            subscribe(params, RequestOptions.none())

        /** @see subscribe */
        fun subscribe(
            params: SubscriptionSubscribeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PublicSubscriptionStatus>>

        /** @see subscribe */
        fun subscribe(
            publicUpdateSubscriptionStatusRequest: PublicUpdateSubscriptionStatusRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PublicSubscriptionStatus>> =
            subscribe(
                SubscriptionSubscribeParams.builder()
                    .publicUpdateSubscriptionStatusRequest(publicUpdateSubscriptionStatusRequest)
                    .build(),
                requestOptions,
            )

        /** @see subscribe */
        fun subscribe(
            publicUpdateSubscriptionStatusRequest: PublicUpdateSubscriptionStatusRequest
        ): CompletableFuture<HttpResponseFor<PublicSubscriptionStatus>> =
            subscribe(publicUpdateSubscriptionStatusRequest, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post /communication-preferences/v3/unsubscribe`, but is
         * otherwise the same as [SubscriptionServiceAsync.unsubscribe].
         */
        fun unsubscribe(
            params: SubscriptionUnsubscribeParams
        ): CompletableFuture<HttpResponseFor<PublicSubscriptionStatus>> =
            unsubscribe(params, RequestOptions.none())

        /** @see unsubscribe */
        fun unsubscribe(
            params: SubscriptionUnsubscribeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PublicSubscriptionStatus>>

        /** @see unsubscribe */
        fun unsubscribe(
            publicUpdateSubscriptionStatusRequest: PublicUpdateSubscriptionStatusRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PublicSubscriptionStatus>> =
            unsubscribe(
                SubscriptionUnsubscribeParams.builder()
                    .publicUpdateSubscriptionStatusRequest(publicUpdateSubscriptionStatusRequest)
                    .build(),
                requestOptions,
            )

        /** @see unsubscribe */
        fun unsubscribe(
            publicUpdateSubscriptionStatusRequest: PublicUpdateSubscriptionStatusRequest
        ): CompletableFuture<HttpResponseFor<PublicSubscriptionStatus>> =
            unsubscribe(publicUpdateSubscriptionStatusRequest, RequestOptions.none())
    }
}
