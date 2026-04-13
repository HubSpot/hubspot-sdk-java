// File generated from our OpenAPI spec by Stainless.

package com.hubspot.services.blocking.marketing

import com.google.errorprone.annotations.MustBeClosed
import com.hubspot.core.ClientOptions
import com.hubspot.core.RequestOptions
import com.hubspot.core.http.HttpResponseFor
import com.hubspot.models.marketing.EmailSendStatusView
import com.hubspot.models.marketing.PublicSingleSendRequestEgg
import com.hubspot.models.marketing.singlesend.SingleSendCreateParams
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
    fun create(params: SingleSendCreateParams): EmailSendStatusView =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: SingleSendCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EmailSendStatusView

    /** @see create */
    fun create(
        publicSingleSendRequestEgg: PublicSingleSendRequestEgg,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EmailSendStatusView =
        create(
            SingleSendCreateParams.builder()
                .publicSingleSendRequestEgg(publicSingleSendRequestEgg)
                .build(),
            requestOptions,
        )

    /** @see create */
    fun create(publicSingleSendRequestEgg: PublicSingleSendRequestEgg): EmailSendStatusView =
        create(publicSingleSendRequestEgg, RequestOptions.none())

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
         * Returns a raw HTTP response for `post /marketing/email-campaigns/2026-03/single-send`,
         * but is otherwise the same as [SingleSendService.create].
         */
        @MustBeClosed
        fun create(params: SingleSendCreateParams): HttpResponseFor<EmailSendStatusView> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: SingleSendCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EmailSendStatusView>

        /** @see create */
        @MustBeClosed
        fun create(
            publicSingleSendRequestEgg: PublicSingleSendRequestEgg,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EmailSendStatusView> =
            create(
                SingleSendCreateParams.builder()
                    .publicSingleSendRequestEgg(publicSingleSendRequestEgg)
                    .build(),
                requestOptions,
            )

        /** @see create */
        @MustBeClosed
        fun create(
            publicSingleSendRequestEgg: PublicSingleSendRequestEgg
        ): HttpResponseFor<EmailSendStatusView> =
            create(publicSingleSendRequestEgg, RequestOptions.none())
    }
}
