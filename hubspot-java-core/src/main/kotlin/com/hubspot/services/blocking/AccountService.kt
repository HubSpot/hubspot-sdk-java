// File generated from our OpenAPI spec by Stainless.

package com.hubspot.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.hubspot.core.ClientOptions
import com.hubspot.core.RequestOptions
import com.hubspot.core.http.HttpResponseFor
import com.hubspot.models.account.AccountGetDailyPrivateAppsUsageParams
import com.hubspot.models.account.AccountGetParams
import com.hubspot.models.account.CollectionResponseApiUsageNoPaging
import com.hubspot.models.account.PortalInformationResponse
import com.hubspot.services.blocking.account.ActivityService
import java.util.function.Consumer

interface AccountService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AccountService

    fun activity(): ActivityService

    /**
     * Retrieve account details such as the account type, time zone, currencies, and data hosting
     * location.
     */
    fun get(): PortalInformationResponse = get(AccountGetParams.none())

    /** @see get */
    fun get(
        params: AccountGetParams = AccountGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PortalInformationResponse

    /** @see get */
    fun get(params: AccountGetParams = AccountGetParams.none()): PortalInformationResponse =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(requestOptions: RequestOptions): PortalInformationResponse =
        get(AccountGetParams.none(), requestOptions)

    /**
     * Retrieve the daily API usage for private apps in the account, along with information about
     * usage limits.
     */
    fun getDailyPrivateAppsUsage(): CollectionResponseApiUsageNoPaging =
        getDailyPrivateAppsUsage(AccountGetDailyPrivateAppsUsageParams.none())

    /** @see getDailyPrivateAppsUsage */
    fun getDailyPrivateAppsUsage(
        params: AccountGetDailyPrivateAppsUsageParams =
            AccountGetDailyPrivateAppsUsageParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CollectionResponseApiUsageNoPaging

    /** @see getDailyPrivateAppsUsage */
    fun getDailyPrivateAppsUsage(
        params: AccountGetDailyPrivateAppsUsageParams = AccountGetDailyPrivateAppsUsageParams.none()
    ): CollectionResponseApiUsageNoPaging = getDailyPrivateAppsUsage(params, RequestOptions.none())

    /** @see getDailyPrivateAppsUsage */
    fun getDailyPrivateAppsUsage(
        requestOptions: RequestOptions
    ): CollectionResponseApiUsageNoPaging =
        getDailyPrivateAppsUsage(AccountGetDailyPrivateAppsUsageParams.none(), requestOptions)

    /** A view of [AccountService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): AccountService.WithRawResponse

        fun activity(): ActivityService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /account-info/2026-03/details`, but is otherwise the
         * same as [AccountService.get].
         */
        @MustBeClosed
        fun get(): HttpResponseFor<PortalInformationResponse> = get(AccountGetParams.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: AccountGetParams = AccountGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PortalInformationResponse>

        /** @see get */
        @MustBeClosed
        fun get(
            params: AccountGetParams = AccountGetParams.none()
        ): HttpResponseFor<PortalInformationResponse> = get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(requestOptions: RequestOptions): HttpResponseFor<PortalInformationResponse> =
            get(AccountGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /account-info/2026-03/api-usage/daily/private-apps`,
         * but is otherwise the same as [AccountService.getDailyPrivateAppsUsage].
         */
        @MustBeClosed
        fun getDailyPrivateAppsUsage(): HttpResponseFor<CollectionResponseApiUsageNoPaging> =
            getDailyPrivateAppsUsage(AccountGetDailyPrivateAppsUsageParams.none())

        /** @see getDailyPrivateAppsUsage */
        @MustBeClosed
        fun getDailyPrivateAppsUsage(
            params: AccountGetDailyPrivateAppsUsageParams =
                AccountGetDailyPrivateAppsUsageParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CollectionResponseApiUsageNoPaging>

        /** @see getDailyPrivateAppsUsage */
        @MustBeClosed
        fun getDailyPrivateAppsUsage(
            params: AccountGetDailyPrivateAppsUsageParams =
                AccountGetDailyPrivateAppsUsageParams.none()
        ): HttpResponseFor<CollectionResponseApiUsageNoPaging> =
            getDailyPrivateAppsUsage(params, RequestOptions.none())

        /** @see getDailyPrivateAppsUsage */
        @MustBeClosed
        fun getDailyPrivateAppsUsage(
            requestOptions: RequestOptions
        ): HttpResponseFor<CollectionResponseApiUsageNoPaging> =
            getDailyPrivateAppsUsage(AccountGetDailyPrivateAppsUsageParams.none(), requestOptions)
    }
}
