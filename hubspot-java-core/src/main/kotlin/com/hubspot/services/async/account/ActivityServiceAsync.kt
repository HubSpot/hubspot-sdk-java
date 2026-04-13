// File generated from our OpenAPI spec by Stainless.

package com.hubspot.services.async.account

import com.hubspot.core.ClientOptions
import com.hubspot.core.RequestOptions
import com.hubspot.core.http.HttpResponseFor
import com.hubspot.models.account.activity.ActivityListAuditLogsPageAsync
import com.hubspot.models.account.activity.ActivityListAuditLogsParams
import com.hubspot.models.account.activity.ActivityListLoginActivitiesPageAsync
import com.hubspot.models.account.activity.ActivityListLoginActivitiesParams
import com.hubspot.models.account.activity.ActivityListSecurityActivitiesPageAsync
import com.hubspot.models.account.activity.ActivityListSecurityActivitiesParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface ActivityServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ActivityServiceAsync

    /**
     * Retrieve activity history for user actions related to approvals, content updates, CRM object
     * updates, security activity, and more (Enterprise only). Learn more about
     * [activities included in audit log exports](https://knowledge.hubspot.com/account-management/view-and-export-account-activity-history-in-a-centralized-audit-log?hubs_content=knowledge.hubspot.com/account-management/view-and-export-account-activity-history&hubs_content-cta=centralized%20audit%20log#data-included-in-the-centralized-audit-log).
     */
    fun listAuditLogs(): CompletableFuture<ActivityListAuditLogsPageAsync> =
        listAuditLogs(ActivityListAuditLogsParams.none())

    /** @see listAuditLogs */
    fun listAuditLogs(
        params: ActivityListAuditLogsParams = ActivityListAuditLogsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ActivityListAuditLogsPageAsync>

    /** @see listAuditLogs */
    fun listAuditLogs(
        params: ActivityListAuditLogsParams = ActivityListAuditLogsParams.none()
    ): CompletableFuture<ActivityListAuditLogsPageAsync> =
        listAuditLogs(params, RequestOptions.none())

    /** @see listAuditLogs */
    fun listAuditLogs(
        requestOptions: RequestOptions
    ): CompletableFuture<ActivityListAuditLogsPageAsync> =
        listAuditLogs(ActivityListAuditLogsParams.none(), requestOptions)

    /**
     * Retrieve logs of user actions related to
     * [login activity](https://knowledge.hubspot.com/account-management/view-and-export-account-activity-history#account-login-history).
     */
    fun listLoginActivities(): CompletableFuture<ActivityListLoginActivitiesPageAsync> =
        listLoginActivities(ActivityListLoginActivitiesParams.none())

    /** @see listLoginActivities */
    fun listLoginActivities(
        params: ActivityListLoginActivitiesParams = ActivityListLoginActivitiesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ActivityListLoginActivitiesPageAsync>

    /** @see listLoginActivities */
    fun listLoginActivities(
        params: ActivityListLoginActivitiesParams = ActivityListLoginActivitiesParams.none()
    ): CompletableFuture<ActivityListLoginActivitiesPageAsync> =
        listLoginActivities(params, RequestOptions.none())

    /** @see listLoginActivities */
    fun listLoginActivities(
        requestOptions: RequestOptions
    ): CompletableFuture<ActivityListLoginActivitiesPageAsync> =
        listLoginActivities(ActivityListLoginActivitiesParams.none(), requestOptions)

    /**
     * Retrieve logs of user actions related to
     * [security activity](https://knowledge.hubspot.com/account-management/view-and-export-account-activity-history#security-activity-history).
     */
    fun listSecurityActivities(): CompletableFuture<ActivityListSecurityActivitiesPageAsync> =
        listSecurityActivities(ActivityListSecurityActivitiesParams.none())

    /** @see listSecurityActivities */
    fun listSecurityActivities(
        params: ActivityListSecurityActivitiesParams = ActivityListSecurityActivitiesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ActivityListSecurityActivitiesPageAsync>

    /** @see listSecurityActivities */
    fun listSecurityActivities(
        params: ActivityListSecurityActivitiesParams = ActivityListSecurityActivitiesParams.none()
    ): CompletableFuture<ActivityListSecurityActivitiesPageAsync> =
        listSecurityActivities(params, RequestOptions.none())

    /** @see listSecurityActivities */
    fun listSecurityActivities(
        requestOptions: RequestOptions
    ): CompletableFuture<ActivityListSecurityActivitiesPageAsync> =
        listSecurityActivities(ActivityListSecurityActivitiesParams.none(), requestOptions)

    /**
     * A view of [ActivityServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ActivityServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /account-info/2026-03/activity/audit-logs`, but is
         * otherwise the same as [ActivityServiceAsync.listAuditLogs].
         */
        fun listAuditLogs(): CompletableFuture<HttpResponseFor<ActivityListAuditLogsPageAsync>> =
            listAuditLogs(ActivityListAuditLogsParams.none())

        /** @see listAuditLogs */
        fun listAuditLogs(
            params: ActivityListAuditLogsParams = ActivityListAuditLogsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ActivityListAuditLogsPageAsync>>

        /** @see listAuditLogs */
        fun listAuditLogs(
            params: ActivityListAuditLogsParams = ActivityListAuditLogsParams.none()
        ): CompletableFuture<HttpResponseFor<ActivityListAuditLogsPageAsync>> =
            listAuditLogs(params, RequestOptions.none())

        /** @see listAuditLogs */
        fun listAuditLogs(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<ActivityListAuditLogsPageAsync>> =
            listAuditLogs(ActivityListAuditLogsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /account-info/2026-03/activity/login`, but is
         * otherwise the same as [ActivityServiceAsync.listLoginActivities].
         */
        fun listLoginActivities():
            CompletableFuture<HttpResponseFor<ActivityListLoginActivitiesPageAsync>> =
            listLoginActivities(ActivityListLoginActivitiesParams.none())

        /** @see listLoginActivities */
        fun listLoginActivities(
            params: ActivityListLoginActivitiesParams = ActivityListLoginActivitiesParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ActivityListLoginActivitiesPageAsync>>

        /** @see listLoginActivities */
        fun listLoginActivities(
            params: ActivityListLoginActivitiesParams = ActivityListLoginActivitiesParams.none()
        ): CompletableFuture<HttpResponseFor<ActivityListLoginActivitiesPageAsync>> =
            listLoginActivities(params, RequestOptions.none())

        /** @see listLoginActivities */
        fun listLoginActivities(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<ActivityListLoginActivitiesPageAsync>> =
            listLoginActivities(ActivityListLoginActivitiesParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /account-info/2026-03/activity/security`, but is
         * otherwise the same as [ActivityServiceAsync.listSecurityActivities].
         */
        fun listSecurityActivities():
            CompletableFuture<HttpResponseFor<ActivityListSecurityActivitiesPageAsync>> =
            listSecurityActivities(ActivityListSecurityActivitiesParams.none())

        /** @see listSecurityActivities */
        fun listSecurityActivities(
            params: ActivityListSecurityActivitiesParams =
                ActivityListSecurityActivitiesParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ActivityListSecurityActivitiesPageAsync>>

        /** @see listSecurityActivities */
        fun listSecurityActivities(
            params: ActivityListSecurityActivitiesParams =
                ActivityListSecurityActivitiesParams.none()
        ): CompletableFuture<HttpResponseFor<ActivityListSecurityActivitiesPageAsync>> =
            listSecurityActivities(params, RequestOptions.none())

        /** @see listSecurityActivities */
        fun listSecurityActivities(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<ActivityListSecurityActivitiesPageAsync>> =
            listSecurityActivities(ActivityListSecurityActivitiesParams.none(), requestOptions)
    }
}
