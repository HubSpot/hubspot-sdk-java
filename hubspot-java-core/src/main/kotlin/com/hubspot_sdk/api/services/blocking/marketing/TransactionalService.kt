// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.marketing

import com.google.errorprone.annotations.MustBeClosed
import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.marketing.transactional.EmailSendStatusView
import com.hubspot_sdk.api.models.marketing.transactional.PublicSingleSendRequestEgg
import com.hubspot_sdk.api.models.marketing.transactional.TransactionalSendParams
import java.util.function.Consumer

interface TransactionalService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): TransactionalService

    fun send(params: TransactionalSendParams): EmailSendStatusView =
        send(params, RequestOptions.none())

    /** @see send */
    fun send(
        params: TransactionalSendParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EmailSendStatusView

    /** @see send */
    fun send(
        publicSingleSendRequestEgg: PublicSingleSendRequestEgg,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EmailSendStatusView =
        send(
            TransactionalSendParams.builder()
                .publicSingleSendRequestEgg(publicSingleSendRequestEgg)
                .build(),
            requestOptions,
        )

    /** @see send */
    fun send(publicSingleSendRequestEgg: PublicSingleSendRequestEgg): EmailSendStatusView =
        send(publicSingleSendRequestEgg, RequestOptions.none())

    /**
     * A view of [TransactionalService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): TransactionalService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post
         * /marketing/transactional/2026-03/single-email/send`, but is otherwise the same as
         * [TransactionalService.send].
         */
        @MustBeClosed
        fun send(params: TransactionalSendParams): HttpResponseFor<EmailSendStatusView> =
            send(params, RequestOptions.none())

        /** @see send */
        @MustBeClosed
        fun send(
            params: TransactionalSendParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EmailSendStatusView>

        /** @see send */
        @MustBeClosed
        fun send(
            publicSingleSendRequestEgg: PublicSingleSendRequestEgg,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EmailSendStatusView> =
            send(
                TransactionalSendParams.builder()
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
