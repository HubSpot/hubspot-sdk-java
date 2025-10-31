// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.marketing

import com.google.errorprone.annotations.MustBeClosed
import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.marketing.EmailSendStatusView
import com.hubspot_sdk.api.models.marketing.PublicSingleSendRequestEgg
import com.hubspot_sdk.api.models.marketing.singlesend.SingleSendSendParams
import java.util.function.Consumer

interface SingleSendService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SingleSendService

    /** Send a template email to a specific recipient. */
    fun send(params: SingleSendSendParams): EmailSendStatusView =
        send(params, RequestOptions.none())

    /** @see send */
    fun send(
        params: SingleSendSendParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EmailSendStatusView

    /** @see send */
    fun send(
        publicSingleSendRequestEgg: PublicSingleSendRequestEgg,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EmailSendStatusView =
        send(
            SingleSendSendParams.builder()
                .publicSingleSendRequestEgg(publicSingleSendRequestEgg)
                .build(),
            requestOptions,
        )

    /** @see send */
    fun send(publicSingleSendRequestEgg: PublicSingleSendRequestEgg): EmailSendStatusView =
        send(publicSingleSendRequestEgg, RequestOptions.none())

    /** A view of [SingleSendService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SingleSendService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /marketing/v4/email/single-send`, but is otherwise
         * the same as [SingleSendService.send].
         */
        @MustBeClosed
        fun send(params: SingleSendSendParams): HttpResponseFor<EmailSendStatusView> =
            send(params, RequestOptions.none())

        /** @see send */
        @MustBeClosed
        fun send(
            params: SingleSendSendParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EmailSendStatusView>

        /** @see send */
        @MustBeClosed
        fun send(
            publicSingleSendRequestEgg: PublicSingleSendRequestEgg,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EmailSendStatusView> =
            send(
                SingleSendSendParams.builder()
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
