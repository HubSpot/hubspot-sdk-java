// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.marketing

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.marketing.EmailSendStatusView
import com.hubspot_sdk.api.models.marketing.PublicSingleSendRequestEgg
import com.hubspot_sdk.api.models.marketing.singlesend.SingleSendSendParams
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
    fun send(params: SingleSendSendParams): CompletableFuture<EmailSendStatusView> =
        send(params, RequestOptions.none())

    /** @see send */
    fun send(
        params: SingleSendSendParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EmailSendStatusView>

    /** @see send */
    fun send(
        publicSingleSendRequestEgg: PublicSingleSendRequestEgg,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EmailSendStatusView> =
        send(
            SingleSendSendParams.builder()
                .publicSingleSendRequestEgg(publicSingleSendRequestEgg)
                .build(),
            requestOptions,
        )

    /** @see send */
    fun send(
        publicSingleSendRequestEgg: PublicSingleSendRequestEgg
    ): CompletableFuture<EmailSendStatusView> =
        send(publicSingleSendRequestEgg, RequestOptions.none())

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
         * Returns a raw HTTP response for `post /marketing/v4/email/single-send`, but is otherwise
         * the same as [SingleSendServiceAsync.send].
         */
        fun send(
            params: SingleSendSendParams
        ): CompletableFuture<HttpResponseFor<EmailSendStatusView>> =
            send(params, RequestOptions.none())

        /** @see send */
        fun send(
            params: SingleSendSendParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EmailSendStatusView>>

        /** @see send */
        fun send(
            publicSingleSendRequestEgg: PublicSingleSendRequestEgg,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EmailSendStatusView>> =
            send(
                SingleSendSendParams.builder()
                    .publicSingleSendRequestEgg(publicSingleSendRequestEgg)
                    .build(),
                requestOptions,
            )

        /** @see send */
        fun send(
            publicSingleSendRequestEgg: PublicSingleSendRequestEgg
        ): CompletableFuture<HttpResponseFor<EmailSendStatusView>> =
            send(publicSingleSendRequestEgg, RequestOptions.none())
    }
}
