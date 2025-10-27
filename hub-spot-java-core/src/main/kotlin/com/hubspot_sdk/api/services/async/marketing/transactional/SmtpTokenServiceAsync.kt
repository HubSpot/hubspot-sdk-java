// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.marketing.transactional

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponse
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.marketing.transactional.SmtpApiTokenRequestEgg
import com.hubspot_sdk.api.models.marketing.transactional.SmtpApiTokenView
import com.hubspot_sdk.api.models.marketing.transactional.smtptokens.SmtpTokenCreateParams
import com.hubspot_sdk.api.models.marketing.transactional.smtptokens.SmtpTokenDeleteParams
import com.hubspot_sdk.api.models.marketing.transactional.smtptokens.SmtpTokenGetParams
import com.hubspot_sdk.api.models.marketing.transactional.smtptokens.SmtpTokenListPageAsync
import com.hubspot_sdk.api.models.marketing.transactional.smtptokens.SmtpTokenListParams
import com.hubspot_sdk.api.models.marketing.transactional.smtptokens.SmtpTokenResetPasswordParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface SmtpTokenServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SmtpTokenServiceAsync

    /** Create a SMTP API token. */
    fun create(params: SmtpTokenCreateParams): CompletableFuture<SmtpApiTokenView> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: SmtpTokenCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SmtpApiTokenView>

    /** @see create */
    fun create(
        smtpApiTokenRequestEgg: SmtpApiTokenRequestEgg,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SmtpApiTokenView> =
        create(
            SmtpTokenCreateParams.builder().smtpApiTokenRequestEgg(smtpApiTokenRequestEgg).build(),
            requestOptions,
        )

    /** @see create */
    fun create(
        smtpApiTokenRequestEgg: SmtpApiTokenRequestEgg
    ): CompletableFuture<SmtpApiTokenView> = create(smtpApiTokenRequestEgg, RequestOptions.none())

    /** Query multiple SMTP API tokens by campaign name or a single token by emailCampaignId. */
    fun list(): CompletableFuture<SmtpTokenListPageAsync> = list(SmtpTokenListParams.none())

    /** @see list */
    fun list(
        params: SmtpTokenListParams = SmtpTokenListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SmtpTokenListPageAsync>

    /** @see list */
    fun list(
        params: SmtpTokenListParams = SmtpTokenListParams.none()
    ): CompletableFuture<SmtpTokenListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<SmtpTokenListPageAsync> =
        list(SmtpTokenListParams.none(), requestOptions)

    /** Delete a single token by ID. */
    fun delete(tokenId: String): CompletableFuture<Void?> =
        delete(tokenId, SmtpTokenDeleteParams.none())

    /** @see delete */
    fun delete(
        tokenId: String,
        params: SmtpTokenDeleteParams = SmtpTokenDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        delete(params.toBuilder().tokenId(tokenId).build(), requestOptions)

    /** @see delete */
    fun delete(
        tokenId: String,
        params: SmtpTokenDeleteParams = SmtpTokenDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(tokenId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: SmtpTokenDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: SmtpTokenDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(tokenId: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(tokenId, SmtpTokenDeleteParams.none(), requestOptions)

    /** Query a single token by ID. */
    fun get(tokenId: String): CompletableFuture<SmtpApiTokenView> =
        get(tokenId, SmtpTokenGetParams.none())

    /** @see get */
    fun get(
        tokenId: String,
        params: SmtpTokenGetParams = SmtpTokenGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SmtpApiTokenView> =
        get(params.toBuilder().tokenId(tokenId).build(), requestOptions)

    /** @see get */
    fun get(
        tokenId: String,
        params: SmtpTokenGetParams = SmtpTokenGetParams.none(),
    ): CompletableFuture<SmtpApiTokenView> = get(tokenId, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: SmtpTokenGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SmtpApiTokenView>

    /** @see get */
    fun get(params: SmtpTokenGetParams): CompletableFuture<SmtpApiTokenView> =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(tokenId: String, requestOptions: RequestOptions): CompletableFuture<SmtpApiTokenView> =
        get(tokenId, SmtpTokenGetParams.none(), requestOptions)

    /**
     * Allows the creation of a replacement password for a given token. Once the password is
     * successfully reset, the old password for the token will be invalid.
     */
    fun resetPassword(tokenId: String): CompletableFuture<SmtpApiTokenView> =
        resetPassword(tokenId, SmtpTokenResetPasswordParams.none())

    /** @see resetPassword */
    fun resetPassword(
        tokenId: String,
        params: SmtpTokenResetPasswordParams = SmtpTokenResetPasswordParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SmtpApiTokenView> =
        resetPassword(params.toBuilder().tokenId(tokenId).build(), requestOptions)

    /** @see resetPassword */
    fun resetPassword(
        tokenId: String,
        params: SmtpTokenResetPasswordParams = SmtpTokenResetPasswordParams.none(),
    ): CompletableFuture<SmtpApiTokenView> = resetPassword(tokenId, params, RequestOptions.none())

    /** @see resetPassword */
    fun resetPassword(
        params: SmtpTokenResetPasswordParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SmtpApiTokenView>

    /** @see resetPassword */
    fun resetPassword(params: SmtpTokenResetPasswordParams): CompletableFuture<SmtpApiTokenView> =
        resetPassword(params, RequestOptions.none())

    /** @see resetPassword */
    fun resetPassword(
        tokenId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<SmtpApiTokenView> =
        resetPassword(tokenId, SmtpTokenResetPasswordParams.none(), requestOptions)

    /**
     * A view of [SmtpTokenServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SmtpTokenServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /marketing/v3/transactional/smtp-tokens`, but is
         * otherwise the same as [SmtpTokenServiceAsync.create].
         */
        fun create(
            params: SmtpTokenCreateParams
        ): CompletableFuture<HttpResponseFor<SmtpApiTokenView>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: SmtpTokenCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SmtpApiTokenView>>

        /** @see create */
        fun create(
            smtpApiTokenRequestEgg: SmtpApiTokenRequestEgg,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SmtpApiTokenView>> =
            create(
                SmtpTokenCreateParams.builder()
                    .smtpApiTokenRequestEgg(smtpApiTokenRequestEgg)
                    .build(),
                requestOptions,
            )

        /** @see create */
        fun create(
            smtpApiTokenRequestEgg: SmtpApiTokenRequestEgg
        ): CompletableFuture<HttpResponseFor<SmtpApiTokenView>> =
            create(smtpApiTokenRequestEgg, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `get /marketing/v3/transactional/smtp-tokens`, but is
         * otherwise the same as [SmtpTokenServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<SmtpTokenListPageAsync>> =
            list(SmtpTokenListParams.none())

        /** @see list */
        fun list(
            params: SmtpTokenListParams = SmtpTokenListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SmtpTokenListPageAsync>>

        /** @see list */
        fun list(
            params: SmtpTokenListParams = SmtpTokenListParams.none()
        ): CompletableFuture<HttpResponseFor<SmtpTokenListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<SmtpTokenListPageAsync>> =
            list(SmtpTokenListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete
         * /marketing/v3/transactional/smtp-tokens/{tokenId}`, but is otherwise the same as
         * [SmtpTokenServiceAsync.delete].
         */
        fun delete(tokenId: String): CompletableFuture<HttpResponse> =
            delete(tokenId, SmtpTokenDeleteParams.none())

        /** @see delete */
        fun delete(
            tokenId: String,
            params: SmtpTokenDeleteParams = SmtpTokenDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().tokenId(tokenId).build(), requestOptions)

        /** @see delete */
        fun delete(
            tokenId: String,
            params: SmtpTokenDeleteParams = SmtpTokenDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(tokenId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: SmtpTokenDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: SmtpTokenDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            tokenId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            delete(tokenId, SmtpTokenDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /marketing/v3/transactional/smtp-tokens/{tokenId}`,
         * but is otherwise the same as [SmtpTokenServiceAsync.get].
         */
        fun get(tokenId: String): CompletableFuture<HttpResponseFor<SmtpApiTokenView>> =
            get(tokenId, SmtpTokenGetParams.none())

        /** @see get */
        fun get(
            tokenId: String,
            params: SmtpTokenGetParams = SmtpTokenGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SmtpApiTokenView>> =
            get(params.toBuilder().tokenId(tokenId).build(), requestOptions)

        /** @see get */
        fun get(
            tokenId: String,
            params: SmtpTokenGetParams = SmtpTokenGetParams.none(),
        ): CompletableFuture<HttpResponseFor<SmtpApiTokenView>> =
            get(tokenId, params, RequestOptions.none())

        /** @see get */
        fun get(
            params: SmtpTokenGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SmtpApiTokenView>>

        /** @see get */
        fun get(params: SmtpTokenGetParams): CompletableFuture<HttpResponseFor<SmtpApiTokenView>> =
            get(params, RequestOptions.none())

        /** @see get */
        fun get(
            tokenId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SmtpApiTokenView>> =
            get(tokenId, SmtpTokenGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /marketing/v3/transactional/smtp-tokens/{tokenId}/password-reset`, but is otherwise the
         * same as [SmtpTokenServiceAsync.resetPassword].
         */
        fun resetPassword(tokenId: String): CompletableFuture<HttpResponseFor<SmtpApiTokenView>> =
            resetPassword(tokenId, SmtpTokenResetPasswordParams.none())

        /** @see resetPassword */
        fun resetPassword(
            tokenId: String,
            params: SmtpTokenResetPasswordParams = SmtpTokenResetPasswordParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SmtpApiTokenView>> =
            resetPassword(params.toBuilder().tokenId(tokenId).build(), requestOptions)

        /** @see resetPassword */
        fun resetPassword(
            tokenId: String,
            params: SmtpTokenResetPasswordParams = SmtpTokenResetPasswordParams.none(),
        ): CompletableFuture<HttpResponseFor<SmtpApiTokenView>> =
            resetPassword(tokenId, params, RequestOptions.none())

        /** @see resetPassword */
        fun resetPassword(
            params: SmtpTokenResetPasswordParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SmtpApiTokenView>>

        /** @see resetPassword */
        fun resetPassword(
            params: SmtpTokenResetPasswordParams
        ): CompletableFuture<HttpResponseFor<SmtpApiTokenView>> =
            resetPassword(params, RequestOptions.none())

        /** @see resetPassword */
        fun resetPassword(
            tokenId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SmtpApiTokenView>> =
            resetPassword(tokenId, SmtpTokenResetPasswordParams.none(), requestOptions)
    }
}
