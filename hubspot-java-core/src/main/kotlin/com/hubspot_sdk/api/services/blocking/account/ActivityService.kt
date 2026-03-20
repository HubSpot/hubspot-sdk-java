// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.account

import com.google.errorprone.annotations.MustBeClosed
import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.account.activity.ActivityListAuditLogsPage
import com.hubspot_sdk.api.models.account.activity.ActivityListAuditLogsParams
import com.hubspot_sdk.api.models.account.activity.ActivityListLoginActivitiesPage
import com.hubspot_sdk.api.models.account.activity.ActivityListLoginActivitiesParams
import com.hubspot_sdk.api.models.account.activity.ActivityListSecurityActivitiesPage
import com.hubspot_sdk.api.models.account.activity.ActivityListSecurityActivitiesParams
import java.util.function.Consumer

interface ActivityService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ActivityService

    /**
     * Retrieve activity history for user actions related to approvals, content updates, CRM object
     * updates, security activity, and more (Enterprise only). Learn more about
     * [activities included in audit log exports](https://knowledge.hubspot.com/account-management/view-and-export-account-activity-history-in-a-centralized-audit-log?hubs_content=knowledge.hubspot.com/account-management/view-and-export-account-activity-history&hubs_content-cta=centralized%20audit%20log#data-included-in-the-centralized-audit-log).
     */
    fun listAuditLogs(): ActivityListAuditLogsPage =
        listAuditLogs(ActivityListAuditLogsParams.none())

    /** @see listAuditLogs */
    fun listAuditLogs(
        params: ActivityListAuditLogsParams = ActivityListAuditLogsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ActivityListAuditLogsPage

    /** @see listAuditLogs */
    fun listAuditLogs(
        params: ActivityListAuditLogsParams = ActivityListAuditLogsParams.none()
    ): ActivityListAuditLogsPage = listAuditLogs(params, RequestOptions.none())

    /** @see listAuditLogs */
    fun listAuditLogs(requestOptions: RequestOptions): ActivityListAuditLogsPage =
        listAuditLogs(ActivityListAuditLogsParams.none(), requestOptions)

    /**
     * Retrieve logs of user actions related to
     * [login activity](https://knowledge.hubspot.com/account-management/view-and-export-account-activity-history#account-login-history).
     */
    fun listLoginActivities(): ActivityListLoginActivitiesPage =
        listLoginActivities(ActivityListLoginActivitiesParams.none())

    /** @see listLoginActivities */
    fun listLoginActivities(
        params: ActivityListLoginActivitiesParams = ActivityListLoginActivitiesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ActivityListLoginActivitiesPage

    /** @see listLoginActivities */
    fun listLoginActivities(
        params: ActivityListLoginActivitiesParams = ActivityListLoginActivitiesParams.none()
    ): ActivityListLoginActivitiesPage = listLoginActivities(params, RequestOptions.none())

    /** @see listLoginActivities */
    fun listLoginActivities(requestOptions: RequestOptions): ActivityListLoginActivitiesPage =
        listLoginActivities(ActivityListLoginActivitiesParams.none(), requestOptions)

    /**
     * Retrieve logs of user actions related to
     * [security activity](https://knowledge.hubspot.com/account-management/view-and-export-account-activity-history#security-activity-history).
     */
    fun listSecurityActivities(): ActivityListSecurityActivitiesPage =
        listSecurityActivities(ActivityListSecurityActivitiesParams.none())

    /** @see listSecurityActivities */
    fun listSecurityActivities(
        params: ActivityListSecurityActivitiesParams = ActivityListSecurityActivitiesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ActivityListSecurityActivitiesPage

    /** @see listSecurityActivities */
    fun listSecurityActivities(
        params: ActivityListSecurityActivitiesParams = ActivityListSecurityActivitiesParams.none()
    ): ActivityListSecurityActivitiesPage = listSecurityActivities(params, RequestOptions.none())

    /** @see listSecurityActivities */
    fun listSecurityActivities(requestOptions: RequestOptions): ActivityListSecurityActivitiesPage =
        listSecurityActivities(ActivityListSecurityActivitiesParams.none(), requestOptions)

    /** A view of [ActivityService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ActivityService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /account-info/2026-03/activity/audit-logs`, but is
         * otherwise the same as [ActivityService.listAuditLogs].
         */
        @MustBeClosed
        fun listAuditLogs(): HttpResponseFor<ActivityListAuditLogsPage> =
            listAuditLogs(ActivityListAuditLogsParams.none())

        /** @see listAuditLogs */
        @MustBeClosed
        fun listAuditLogs(
            params: ActivityListAuditLogsParams = ActivityListAuditLogsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ActivityListAuditLogsPage>

        /** @see listAuditLogs */
        @MustBeClosed
        fun listAuditLogs(
            params: ActivityListAuditLogsParams = ActivityListAuditLogsParams.none()
        ): HttpResponseFor<ActivityListAuditLogsPage> = listAuditLogs(params, RequestOptions.none())

        /** @see listAuditLogs */
        @MustBeClosed
        fun listAuditLogs(
            requestOptions: RequestOptions
        ): HttpResponseFor<ActivityListAuditLogsPage> =
            listAuditLogs(ActivityListAuditLogsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /account-info/2026-03/activity/login`, but is
         * otherwise the same as [ActivityService.listLoginActivities].
         */
        @MustBeClosed
        fun listLoginActivities(): HttpResponseFor<ActivityListLoginActivitiesPage> =
            listLoginActivities(ActivityListLoginActivitiesParams.none())

        /** @see listLoginActivities */
        @MustBeClosed
        fun listLoginActivities(
            params: ActivityListLoginActivitiesParams = ActivityListLoginActivitiesParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ActivityListLoginActivitiesPage>

        /** @see listLoginActivities */
        @MustBeClosed
        fun listLoginActivities(
            params: ActivityListLoginActivitiesParams = ActivityListLoginActivitiesParams.none()
        ): HttpResponseFor<ActivityListLoginActivitiesPage> =
            listLoginActivities(params, RequestOptions.none())

        /** @see listLoginActivities */
        @MustBeClosed
        fun listLoginActivities(
            requestOptions: RequestOptions
        ): HttpResponseFor<ActivityListLoginActivitiesPage> =
            listLoginActivities(ActivityListLoginActivitiesParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /account-info/2026-03/activity/security`, but is
         * otherwise the same as [ActivityService.listSecurityActivities].
         */
        @MustBeClosed
        fun listSecurityActivities(): HttpResponseFor<ActivityListSecurityActivitiesPage> =
            listSecurityActivities(ActivityListSecurityActivitiesParams.none())

        /** @see listSecurityActivities */
        @MustBeClosed
        fun listSecurityActivities(
            params: ActivityListSecurityActivitiesParams =
                ActivityListSecurityActivitiesParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ActivityListSecurityActivitiesPage>

        /** @see listSecurityActivities */
        @MustBeClosed
        fun listSecurityActivities(
            params: ActivityListSecurityActivitiesParams =
                ActivityListSecurityActivitiesParams.none()
        ): HttpResponseFor<ActivityListSecurityActivitiesPage> =
            listSecurityActivities(params, RequestOptions.none())

        /** @see listSecurityActivities */
        @MustBeClosed
        fun listSecurityActivities(
            requestOptions: RequestOptions
        ): HttpResponseFor<ActivityListSecurityActivitiesPage> =
            listSecurityActivities(ActivityListSecurityActivitiesParams.none(), requestOptions)
    }
}
