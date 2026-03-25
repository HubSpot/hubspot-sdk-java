// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.account.AccountGetDailyPrivateAppsUsageParams
import com.hubspot_sdk.api.models.account.AccountGetParams
import com.hubspot_sdk.api.models.account.CollectionResponseApiUsageNoPaging
import com.hubspot_sdk.api.models.account.PortalInformationResponse
import com.hubspot_sdk.api.services.async.account.ActivityServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface AccountServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AccountServiceAsync

    fun activity(): ActivityServiceAsync

    /**
     * Retrieve account details such as the account type, time zone, currencies, and data hosting
     * location.
     */
    fun get(): CompletableFuture<PortalInformationResponse> = get(AccountGetParams.none())

    /** @see get */
    fun get(
        params: AccountGetParams = AccountGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PortalInformationResponse>

    /** @see get */
    fun get(
        params: AccountGetParams = AccountGetParams.none()
    ): CompletableFuture<PortalInformationResponse> = get(params, RequestOptions.none())

    /** @see get */
    fun get(requestOptions: RequestOptions): CompletableFuture<PortalInformationResponse> =
        get(AccountGetParams.none(), requestOptions)

    /**
     * Retrieve the daily API usage for private apps in the account, along with information about
     * usage limits.
     */
    fun getDailyPrivateAppsUsage(): CompletableFuture<CollectionResponseApiUsageNoPaging> =
        getDailyPrivateAppsUsage(AccountGetDailyPrivateAppsUsageParams.none())

    /** @see getDailyPrivateAppsUsage */
    fun getDailyPrivateAppsUsage(
        params: AccountGetDailyPrivateAppsUsageParams =
            AccountGetDailyPrivateAppsUsageParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CollectionResponseApiUsageNoPaging>

    /** @see getDailyPrivateAppsUsage */
    fun getDailyPrivateAppsUsage(
        params: AccountGetDailyPrivateAppsUsageParams = AccountGetDailyPrivateAppsUsageParams.none()
    ): CompletableFuture<CollectionResponseApiUsageNoPaging> =
        getDailyPrivateAppsUsage(params, RequestOptions.none())

    /** @see getDailyPrivateAppsUsage */
    fun getDailyPrivateAppsUsage(
        requestOptions: RequestOptions
    ): CompletableFuture<CollectionResponseApiUsageNoPaging> =
        getDailyPrivateAppsUsage(AccountGetDailyPrivateAppsUsageParams.none(), requestOptions)

    /**
     * A view of [AccountServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AccountServiceAsync.WithRawResponse

        fun activity(): ActivityServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /account-info/2026-03/details`, but is otherwise the
         * same as [AccountServiceAsync.get].
         */
        fun get(): CompletableFuture<HttpResponseFor<PortalInformationResponse>> =
            get(AccountGetParams.none())

        /** @see get */
        fun get(
            params: AccountGetParams = AccountGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PortalInformationResponse>>

        /** @see get */
        fun get(
            params: AccountGetParams = AccountGetParams.none()
        ): CompletableFuture<HttpResponseFor<PortalInformationResponse>> =
            get(params, RequestOptions.none())

        /** @see get */
        fun get(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<PortalInformationResponse>> =
            get(AccountGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /account-info/2026-03/api-usage/daily/private-apps`,
         * but is otherwise the same as [AccountServiceAsync.getDailyPrivateAppsUsage].
         */
        fun getDailyPrivateAppsUsage():
            CompletableFuture<HttpResponseFor<CollectionResponseApiUsageNoPaging>> =
            getDailyPrivateAppsUsage(AccountGetDailyPrivateAppsUsageParams.none())

        /** @see getDailyPrivateAppsUsage */
        fun getDailyPrivateAppsUsage(
            params: AccountGetDailyPrivateAppsUsageParams =
                AccountGetDailyPrivateAppsUsageParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CollectionResponseApiUsageNoPaging>>

        /** @see getDailyPrivateAppsUsage */
        fun getDailyPrivateAppsUsage(
            params: AccountGetDailyPrivateAppsUsageParams =
                AccountGetDailyPrivateAppsUsageParams.none()
        ): CompletableFuture<HttpResponseFor<CollectionResponseApiUsageNoPaging>> =
            getDailyPrivateAppsUsage(params, RequestOptions.none())

        /** @see getDailyPrivateAppsUsage */
        fun getDailyPrivateAppsUsage(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<CollectionResponseApiUsageNoPaging>> =
            getDailyPrivateAppsUsage(AccountGetDailyPrivateAppsUsageParams.none(), requestOptions)
    }
}
