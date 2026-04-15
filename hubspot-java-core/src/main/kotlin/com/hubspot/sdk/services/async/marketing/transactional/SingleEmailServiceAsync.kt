// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.async.marketing.transactional

import com.hubspot.sdk.core.ClientOptions
import com.hubspot.sdk.core.RequestOptions
import com.hubspot.sdk.core.http.HttpResponseFor
import com.hubspot.sdk.models.marketing.EmailSendStatusView
import com.hubspot.sdk.models.marketing.PublicSingleSendRequestEgg
import com.hubspot.sdk.models.marketing.transactional.singleemail.SingleEmailSendParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface SingleEmailServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SingleEmailServiceAsync

    /**
     * Asynchronously send a transactional email. Returns the status of the email send with a
     * statusId that can be used to continuously query for the status using the Email Send Status
     * API.
     */
    fun send(params: SingleEmailSendParams): CompletableFuture<EmailSendStatusView> =
        send(params, RequestOptions.none())

    /** @see send */
    fun send(
        params: SingleEmailSendParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EmailSendStatusView>

    /** @see send */
    fun send(
        publicSingleSendRequestEgg: PublicSingleSendRequestEgg,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EmailSendStatusView> =
        send(
            SingleEmailSendParams.builder()
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
     * A view of [SingleEmailServiceAsync] that provides access to raw HTTP responses for each
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
        ): SingleEmailServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post
         * /marketing/transactional/2026-03/single-email/send`, but is otherwise the same as
         * [SingleEmailServiceAsync.send].
         */
        fun send(
            params: SingleEmailSendParams
        ): CompletableFuture<HttpResponseFor<EmailSendStatusView>> =
            send(params, RequestOptions.none())

        /** @see send */
        fun send(
            params: SingleEmailSendParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EmailSendStatusView>>

        /** @see send */
        fun send(
            publicSingleSendRequestEgg: PublicSingleSendRequestEgg,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EmailSendStatusView>> =
            send(
                SingleEmailSendParams.builder()
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
