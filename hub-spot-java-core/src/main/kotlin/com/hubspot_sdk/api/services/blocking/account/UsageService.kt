// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.account

import com.google.errorprone.annotations.MustBeClosed
import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.account.CollectionResponseApiUsage
import com.hubspot_sdk.api.models.account.usage.UsageGetDailyPrivateAppsUsageParams
import java.util.function.Consumer

interface UsageService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): UsageService

    /**
     * Retrieve the daily API usage for private apps in the account, along with information about
     * usage limits.
     */
    fun getDailyPrivateAppsUsage(): CollectionResponseApiUsage =
        getDailyPrivateAppsUsage(UsageGetDailyPrivateAppsUsageParams.none())

    /** @see getDailyPrivateAppsUsage */
    fun getDailyPrivateAppsUsage(
        params: UsageGetDailyPrivateAppsUsageParams = UsageGetDailyPrivateAppsUsageParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CollectionResponseApiUsage

    /** @see getDailyPrivateAppsUsage */
    fun getDailyPrivateAppsUsage(
        params: UsageGetDailyPrivateAppsUsageParams = UsageGetDailyPrivateAppsUsageParams.none()
    ): CollectionResponseApiUsage = getDailyPrivateAppsUsage(params, RequestOptions.none())

    /** @see getDailyPrivateAppsUsage */
    fun getDailyPrivateAppsUsage(requestOptions: RequestOptions): CollectionResponseApiUsage =
        getDailyPrivateAppsUsage(UsageGetDailyPrivateAppsUsageParams.none(), requestOptions)

    /** A view of [UsageService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): UsageService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /account-info/v3/api-usage/daily/private-apps`, but
         * is otherwise the same as [UsageService.getDailyPrivateAppsUsage].
         */
        @MustBeClosed
        fun getDailyPrivateAppsUsage(): HttpResponseFor<CollectionResponseApiUsage> =
            getDailyPrivateAppsUsage(UsageGetDailyPrivateAppsUsageParams.none())

        /** @see getDailyPrivateAppsUsage */
        @MustBeClosed
        fun getDailyPrivateAppsUsage(
            params: UsageGetDailyPrivateAppsUsageParams =
                UsageGetDailyPrivateAppsUsageParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CollectionResponseApiUsage>

        /** @see getDailyPrivateAppsUsage */
        @MustBeClosed
        fun getDailyPrivateAppsUsage(
            params: UsageGetDailyPrivateAppsUsageParams = UsageGetDailyPrivateAppsUsageParams.none()
        ): HttpResponseFor<CollectionResponseApiUsage> =
            getDailyPrivateAppsUsage(params, RequestOptions.none())

        /** @see getDailyPrivateAppsUsage */
        @MustBeClosed
        fun getDailyPrivateAppsUsage(
            requestOptions: RequestOptions
        ): HttpResponseFor<CollectionResponseApiUsage> =
            getDailyPrivateAppsUsage(UsageGetDailyPrivateAppsUsageParams.none(), requestOptions)
    }
}
