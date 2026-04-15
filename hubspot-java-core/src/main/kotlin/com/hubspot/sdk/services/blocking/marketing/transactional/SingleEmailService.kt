// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.blocking.marketing.transactional

import com.google.errorprone.annotations.MustBeClosed
import com.hubspot.sdk.core.ClientOptions
import com.hubspot.sdk.core.RequestOptions
import com.hubspot.sdk.core.http.HttpResponseFor
import com.hubspot.sdk.models.marketing.EmailSendStatusView
import com.hubspot.sdk.models.marketing.PublicSingleSendRequestEgg
import com.hubspot.sdk.models.marketing.transactional.singleemail.SingleEmailSendParams
import java.util.function.Consumer

interface SingleEmailService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SingleEmailService

    /**
     * Asynchronously send a transactional email. Returns the status of the email send with a
     * statusId that can be used to continuously query for the status using the Email Send Status
     * API.
     */
    fun send(params: SingleEmailSendParams): EmailSendStatusView =
        send(params, RequestOptions.none())

    /** @see send */
    fun send(
        params: SingleEmailSendParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EmailSendStatusView

    /** @see send */
    fun send(
        publicSingleSendRequestEgg: PublicSingleSendRequestEgg,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EmailSendStatusView =
        send(
            SingleEmailSendParams.builder()
                .publicSingleSendRequestEgg(publicSingleSendRequestEgg)
                .build(),
            requestOptions,
        )

    /** @see send */
    fun send(publicSingleSendRequestEgg: PublicSingleSendRequestEgg): EmailSendStatusView =
        send(publicSingleSendRequestEgg, RequestOptions.none())

    /**
     * A view of [SingleEmailService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SingleEmailService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post
         * /marketing/transactional/2026-03/single-email/send`, but is otherwise the same as
         * [SingleEmailService.send].
         */
        @MustBeClosed
        fun send(params: SingleEmailSendParams): HttpResponseFor<EmailSendStatusView> =
            send(params, RequestOptions.none())

        /** @see send */
        @MustBeClosed
        fun send(
            params: SingleEmailSendParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EmailSendStatusView>

        /** @see send */
        @MustBeClosed
        fun send(
            publicSingleSendRequestEgg: PublicSingleSendRequestEgg,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EmailSendStatusView> =
            send(
                SingleEmailSendParams.builder()
                    .publicSingleSendRequestEgg(publicSingleSendRequestEgg)
                    .build(),
                requestOptions,
            )

        /** @see send */
        @MustBeClosed
        fun send(
            publicSingleSendRequestEgg: PublicSingleSendRequestEgg
        ): HttpResponseFor<EmailSendStatusView> =
            send(publicSingleSendRequestEgg, RequestOptions.none())
    }
}
