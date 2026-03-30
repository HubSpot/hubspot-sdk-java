// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.marketing.transactional

import com.google.errorprone.annotations.MustBeClosed
import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponse
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.marketing.transactional.SmtpApiTokenRequestEgg
import com.hubspot_sdk.api.models.marketing.transactional.SmtpApiTokenView
import com.hubspot_sdk.api.models.marketing.transactional.smtptokens.SmtpTokenCreateParams
import com.hubspot_sdk.api.models.marketing.transactional.smtptokens.SmtpTokenDeleteParams
import com.hubspot_sdk.api.models.marketing.transactional.smtptokens.SmtpTokenGetParams
import com.hubspot_sdk.api.models.marketing.transactional.smtptokens.SmtpTokenListPage
import com.hubspot_sdk.api.models.marketing.transactional.smtptokens.SmtpTokenListParams
import com.hubspot_sdk.api.models.marketing.transactional.smtptokens.SmtpTokenResetPasswordParams
import java.util.function.Consumer

interface SmtpTokenService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SmtpTokenService

    /** Create a SMTP API token. */
    fun create(params: SmtpTokenCreateParams): SmtpApiTokenView =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: SmtpTokenCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SmtpApiTokenView

    /** @see create */
    fun create(
        smtpApiTokenRequestEgg: SmtpApiTokenRequestEgg,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SmtpApiTokenView =
        create(
            SmtpTokenCreateParams.builder().smtpApiTokenRequestEgg(smtpApiTokenRequestEgg).build(),
            requestOptions,
        )

    /** @see create */
    fun create(smtpApiTokenRequestEgg: SmtpApiTokenRequestEgg): SmtpApiTokenView =
        create(smtpApiTokenRequestEgg, RequestOptions.none())

    /** Query multiple SMTP API tokens by campaign name or a single token by emailCampaignId. */
    fun list(): SmtpTokenListPage = list(SmtpTokenListParams.none())

    /** @see list */
    fun list(
        params: SmtpTokenListParams = SmtpTokenListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SmtpTokenListPage

    /** @see list */
    fun list(params: SmtpTokenListParams = SmtpTokenListParams.none()): SmtpTokenListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): SmtpTokenListPage =
        list(SmtpTokenListParams.none(), requestOptions)

    /** Delete a single token by ID. */
    fun delete(tokenId: String) = delete(tokenId, SmtpTokenDeleteParams.none())

    /** @see delete */
    fun delete(
        tokenId: String,
        params: SmtpTokenDeleteParams = SmtpTokenDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().tokenId(tokenId).build(), requestOptions)

    /** @see delete */
    fun delete(tokenId: String, params: SmtpTokenDeleteParams = SmtpTokenDeleteParams.none()) =
        delete(tokenId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: SmtpTokenDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see delete */
    fun delete(params: SmtpTokenDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(tokenId: String, requestOptions: RequestOptions) =
        delete(tokenId, SmtpTokenDeleteParams.none(), requestOptions)

    /** Query a single token by ID. */
    fun get(tokenId: String): SmtpApiTokenView = get(tokenId, SmtpTokenGetParams.none())

    /** @see get */
    fun get(
        tokenId: String,
        params: SmtpTokenGetParams = SmtpTokenGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SmtpApiTokenView = get(params.toBuilder().tokenId(tokenId).build(), requestOptions)

    /** @see get */
    fun get(
        tokenId: String,
        params: SmtpTokenGetParams = SmtpTokenGetParams.none(),
    ): SmtpApiTokenView = get(tokenId, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: SmtpTokenGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SmtpApiTokenView

    /** @see get */
    fun get(params: SmtpTokenGetParams): SmtpApiTokenView = get(params, RequestOptions.none())

    /** @see get */
    fun get(tokenId: String, requestOptions: RequestOptions): SmtpApiTokenView =
        get(tokenId, SmtpTokenGetParams.none(), requestOptions)

    /**
     * Allows the creation of a replacement password for a given token. Once the password is
     * successfully reset, the old password for the token will be invalid.
     */
    fun resetPassword(tokenId: String): SmtpApiTokenView =
        resetPassword(tokenId, SmtpTokenResetPasswordParams.none())

    /** @see resetPassword */
    fun resetPassword(
        tokenId: String,
        params: SmtpTokenResetPasswordParams = SmtpTokenResetPasswordParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SmtpApiTokenView = resetPassword(params.toBuilder().tokenId(tokenId).build(), requestOptions)

    /** @see resetPassword */
    fun resetPassword(
        tokenId: String,
        params: SmtpTokenResetPasswordParams = SmtpTokenResetPasswordParams.none(),
    ): SmtpApiTokenView = resetPassword(tokenId, params, RequestOptions.none())

    /** @see resetPassword */
    fun resetPassword(
        params: SmtpTokenResetPasswordParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SmtpApiTokenView

    /** @see resetPassword */
    fun resetPassword(params: SmtpTokenResetPasswordParams): SmtpApiTokenView =
        resetPassword(params, RequestOptions.none())

    /** @see resetPassword */
    fun resetPassword(tokenId: String, requestOptions: RequestOptions): SmtpApiTokenView =
        resetPassword(tokenId, SmtpTokenResetPasswordParams.none(), requestOptions)

    /** A view of [SmtpTokenService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): SmtpTokenService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /marketing/transactional/2026-03/smtp-tokens`, but
         * is otherwise the same as [SmtpTokenService.create].
         */
        @MustBeClosed
        fun create(params: SmtpTokenCreateParams): HttpResponseFor<SmtpApiTokenView> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: SmtpTokenCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SmtpApiTokenView>

        /** @see create */
        @MustBeClosed
        fun create(
            smtpApiTokenRequestEgg: SmtpApiTokenRequestEgg,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SmtpApiTokenView> =
            create(
                SmtpTokenCreateParams.builder()
                    .smtpApiTokenRequestEgg(smtpApiTokenRequestEgg)
                    .build(),
                requestOptions,
            )

        /** @see create */
        @MustBeClosed
        fun create(
            smtpApiTokenRequestEgg: SmtpApiTokenRequestEgg
        ): HttpResponseFor<SmtpApiTokenView> = create(smtpApiTokenRequestEgg, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `get /marketing/transactional/2026-03/smtp-tokens`, but
         * is otherwise the same as [SmtpTokenService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<SmtpTokenListPage> = list(SmtpTokenListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: SmtpTokenListParams = SmtpTokenListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SmtpTokenListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: SmtpTokenListParams = SmtpTokenListParams.none()
        ): HttpResponseFor<SmtpTokenListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<SmtpTokenListPage> =
            list(SmtpTokenListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete
         * /marketing/transactional/2026-03/smtp-tokens/{tokenId}`, but is otherwise the same as
         * [SmtpTokenService.delete].
         */
        @MustBeClosed
        fun delete(tokenId: String): HttpResponse = delete(tokenId, SmtpTokenDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            tokenId: String,
            params: SmtpTokenDeleteParams = SmtpTokenDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().tokenId(tokenId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            tokenId: String,
            params: SmtpTokenDeleteParams = SmtpTokenDeleteParams.none(),
        ): HttpResponse = delete(tokenId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: SmtpTokenDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: SmtpTokenDeleteParams): HttpResponse =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(tokenId: String, requestOptions: RequestOptions): HttpResponse =
            delete(tokenId, SmtpTokenDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get
         * /marketing/transactional/2026-03/smtp-tokens/{tokenId}`, but is otherwise the same as
         * [SmtpTokenService.get].
         */
        @MustBeClosed
        fun get(tokenId: String): HttpResponseFor<SmtpApiTokenView> =
            get(tokenId, SmtpTokenGetParams.none())

        /** @see get */
        @MustBeClosed
        fun get(
            tokenId: String,
            params: SmtpTokenGetParams = SmtpTokenGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SmtpApiTokenView> =
            get(params.toBuilder().tokenId(tokenId).build(), requestOptions)

        /** @see get */
        @MustBeClosed
        fun get(
            tokenId: String,
            params: SmtpTokenGetParams = SmtpTokenGetParams.none(),
        ): HttpResponseFor<SmtpApiTokenView> = get(tokenId, params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: SmtpTokenGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SmtpApiTokenView>

        /** @see get */
        @MustBeClosed
        fun get(params: SmtpTokenGetParams): HttpResponseFor<SmtpApiTokenView> =
            get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            tokenId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SmtpApiTokenView> =
            get(tokenId, SmtpTokenGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /marketing/transactional/2026-03/smtp-tokens/{tokenId}/password-reset`, but is otherwise
         * the same as [SmtpTokenService.resetPassword].
         */
        @MustBeClosed
        fun resetPassword(tokenId: String): HttpResponseFor<SmtpApiTokenView> =
            resetPassword(tokenId, SmtpTokenResetPasswordParams.none())

        /** @see resetPassword */
        @MustBeClosed
        fun resetPassword(
            tokenId: String,
            params: SmtpTokenResetPasswordParams = SmtpTokenResetPasswordParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SmtpApiTokenView> =
            resetPassword(params.toBuilder().tokenId(tokenId).build(), requestOptions)

        /** @see resetPassword */
        @MustBeClosed
        fun resetPassword(
            tokenId: String,
            params: SmtpTokenResetPasswordParams = SmtpTokenResetPasswordParams.none(),
        ): HttpResponseFor<SmtpApiTokenView> = resetPassword(tokenId, params, RequestOptions.none())

        /** @see resetPassword */
        @MustBeClosed
        fun resetPassword(
            params: SmtpTokenResetPasswordParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SmtpApiTokenView>

        /** @see resetPassword */
        @MustBeClosed
        fun resetPassword(params: SmtpTokenResetPasswordParams): HttpResponseFor<SmtpApiTokenView> =
            resetPassword(params, RequestOptions.none())

        /** @see resetPassword */
        @MustBeClosed
        fun resetPassword(
            tokenId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SmtpApiTokenView> =
            resetPassword(tokenId, SmtpTokenResetPasswordParams.none(), requestOptions)
    }
}
