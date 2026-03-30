// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.marketing

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.marketing.EmailSendStatusView
import com.hubspot_sdk.api.models.marketing.PublicSingleSendRequestEgg
import com.hubspot_sdk.api.models.marketing.singlesend.SingleSendCreateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface SingleSendServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SingleSendServiceAsync

    /** Send a template email to a specific recipient. */
    fun create(params: SingleSendCreateParams): CompletableFuture<EmailSendStatusView> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: SingleSendCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EmailSendStatusView>

    /** @see create */
    fun create(
        publicSingleSendRequestEgg: PublicSingleSendRequestEgg,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EmailSendStatusView> =
        create(
            SingleSendCreateParams.builder()
                .publicSingleSendRequestEgg(publicSingleSendRequestEgg)
                .build(),
            requestOptions,
        )

    /** @see create */
    fun create(
        publicSingleSendRequestEgg: PublicSingleSendRequestEgg
    ): CompletableFuture<EmailSendStatusView> =
        create(publicSingleSendRequestEgg, RequestOptions.none())

    /**
     * A view of [SingleSendServiceAsync] that provides access to raw HTTP responses for each
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
        ): SingleSendServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /marketing/email-campaigns/2026-03/single-send`,
         * but is otherwise the same as [SingleSendServiceAsync.create].
         */
        fun create(
            params: SingleSendCreateParams
        ): CompletableFuture<HttpResponseFor<EmailSendStatusView>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: SingleSendCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EmailSendStatusView>>

        /** @see create */
        fun create(
            publicSingleSendRequestEgg: PublicSingleSendRequestEgg,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EmailSendStatusView>> =
            create(
                SingleSendCreateParams.builder()
                    .publicSingleSendRequestEgg(publicSingleSendRequestEgg)
                    .build(),
                requestOptions,
            )

        /** @see create */
        fun create(
            publicSingleSendRequestEgg: PublicSingleSendRequestEgg
        ): CompletableFuture<HttpResponseFor<EmailSendStatusView>> =
            create(publicSingleSendRequestEgg, RequestOptions.none())
    }
}
