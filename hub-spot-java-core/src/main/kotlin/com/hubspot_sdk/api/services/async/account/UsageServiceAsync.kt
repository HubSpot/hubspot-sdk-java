// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.account

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.account.CollectionResponseApiUsage
import com.hubspot_sdk.api.models.account.usage.UsageGetDailyPrivateAppsUsageParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface UsageServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): UsageServiceAsync

    /**
     * Retrieve the daily API usage for private apps in the account, along with information about
     * usage limits.
     */
    fun getDailyPrivateAppsUsage(): CompletableFuture<CollectionResponseApiUsage> =
        getDailyPrivateAppsUsage(UsageGetDailyPrivateAppsUsageParams.none())

    /** @see getDailyPrivateAppsUsage */
    fun getDailyPrivateAppsUsage(
        params: UsageGetDailyPrivateAppsUsageParams = UsageGetDailyPrivateAppsUsageParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CollectionResponseApiUsage>

    /** @see getDailyPrivateAppsUsage */
    fun getDailyPrivateAppsUsage(
        params: UsageGetDailyPrivateAppsUsageParams = UsageGetDailyPrivateAppsUsageParams.none()
    ): CompletableFuture<CollectionResponseApiUsage> =
        getDailyPrivateAppsUsage(params, RequestOptions.none())

    /** @see getDailyPrivateAppsUsage */
    fun getDailyPrivateAppsUsage(
        requestOptions: RequestOptions
    ): CompletableFuture<CollectionResponseApiUsage> =
        getDailyPrivateAppsUsage(UsageGetDailyPrivateAppsUsageParams.none(), requestOptions)

    /** A view of [UsageServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): UsageServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /account-info/v3/api-usage/daily/private-apps`, but
         * is otherwise the same as [UsageServiceAsync.getDailyPrivateAppsUsage].
         */
        fun getDailyPrivateAppsUsage():
            CompletableFuture<HttpResponseFor<CollectionResponseApiUsage>> =
            getDailyPrivateAppsUsage(UsageGetDailyPrivateAppsUsageParams.none())

        /** @see getDailyPrivateAppsUsage */
        fun getDailyPrivateAppsUsage(
            params: UsageGetDailyPrivateAppsUsageParams =
                UsageGetDailyPrivateAppsUsageParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CollectionResponseApiUsage>>

        /** @see getDailyPrivateAppsUsage */
        fun getDailyPrivateAppsUsage(
            params: UsageGetDailyPrivateAppsUsageParams = UsageGetDailyPrivateAppsUsageParams.none()
        ): CompletableFuture<HttpResponseFor<CollectionResponseApiUsage>> =
            getDailyPrivateAppsUsage(params, RequestOptions.none())

        /** @see getDailyPrivateAppsUsage */
        fun getDailyPrivateAppsUsage(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<CollectionResponseApiUsage>> =
            getDailyPrivateAppsUsage(UsageGetDailyPrivateAppsUsageParams.none(), requestOptions)
    }
}
