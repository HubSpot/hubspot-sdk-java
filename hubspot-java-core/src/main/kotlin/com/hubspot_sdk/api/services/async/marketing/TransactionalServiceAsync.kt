// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.marketing

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.marketing.transactional.EmailSendStatusView
import com.hubspot_sdk.api.models.marketing.transactional.PublicSingleSendRequestEgg
import com.hubspot_sdk.api.models.marketing.transactional.TransactionalSendParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface TransactionalServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): TransactionalServiceAsync

    fun send(params: TransactionalSendParams): CompletableFuture<EmailSendStatusView> =
        send(params, RequestOptions.none())

    /** @see send */
    fun send(
        params: TransactionalSendParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EmailSendStatusView>

    /** @see send */
    fun send(
        publicSingleSendRequestEgg: PublicSingleSendRequestEgg,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EmailSendStatusView> =
        send(
            TransactionalSendParams.builder()
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
     * A view of [TransactionalServiceAsync] that provides access to raw HTTP responses for each
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
        ): TransactionalServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post
         * /marketing/transactional/2026-03/single-email/send`, but is otherwise the same as
         * [TransactionalServiceAsync.send].
         */
        fun send(
            params: TransactionalSendParams
        ): CompletableFuture<HttpResponseFor<EmailSendStatusView>> =
            send(params, RequestOptions.none())

        /** @see send */
        fun send(
            params: TransactionalSendParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EmailSendStatusView>>

        /** @see send */
        fun send(
            publicSingleSendRequestEgg: PublicSingleSendRequestEgg,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EmailSendStatusView>> =
            send(
                TransactionalSendParams.builder()
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
