// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.account

import com.google.errorprone.annotations.MustBeClosed
import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.account.activity.ActivityListAuditLogsParams
import com.hubspot_sdk.api.models.account.activity.ActivityListLoginActivitiesParams
import com.hubspot_sdk.api.models.account.activity.ActivityListSecurityActivitiesParams
import com.hubspot_sdk.api.models.account.activity.CollectionResponseHydratedCriticalActionForwardPaging
import com.hubspot_sdk.api.models.account.activity.CollectionResponsePublicApiUserActionEventForwardPaging
import com.hubspot_sdk.api.models.account.activity.CollectionResponsePublicLoginAuditForwardPaging
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
    fun listAuditLogs(): CollectionResponsePublicApiUserActionEventForwardPaging =
        listAuditLogs(ActivityListAuditLogsParams.none())

    /** @see listAuditLogs */
    fun listAuditLogs(
        params: ActivityListAuditLogsParams = ActivityListAuditLogsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CollectionResponsePublicApiUserActionEventForwardPaging

    /** @see listAuditLogs */
    fun listAuditLogs(
        params: ActivityListAuditLogsParams = ActivityListAuditLogsParams.none()
    ): CollectionResponsePublicApiUserActionEventForwardPaging =
        listAuditLogs(params, RequestOptions.none())

    /** @see listAuditLogs */
    fun listAuditLogs(
        requestOptions: RequestOptions
    ): CollectionResponsePublicApiUserActionEventForwardPaging =
        listAuditLogs(ActivityListAuditLogsParams.none(), requestOptions)

    /**
     * Retrieve logs of user actions related to
     * [login activity](https://knowledge.hubspot.com/account-management/view-and-export-account-activity-history#account-login-history).
     */
    fun listLoginActivities(): CollectionResponsePublicLoginAuditForwardPaging =
        listLoginActivities(ActivityListLoginActivitiesParams.none())

    /** @see listLoginActivities */
    fun listLoginActivities(
        params: ActivityListLoginActivitiesParams = ActivityListLoginActivitiesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CollectionResponsePublicLoginAuditForwardPaging

    /** @see listLoginActivities */
    fun listLoginActivities(
        params: ActivityListLoginActivitiesParams = ActivityListLoginActivitiesParams.none()
    ): CollectionResponsePublicLoginAuditForwardPaging =
        listLoginActivities(params, RequestOptions.none())

    /** @see listLoginActivities */
    fun listLoginActivities(
        requestOptions: RequestOptions
    ): CollectionResponsePublicLoginAuditForwardPaging =
        listLoginActivities(ActivityListLoginActivitiesParams.none(), requestOptions)

    /**
     * Retrieve logs of user actions related to
     * [security activity](https://knowledge.hubspot.com/account-management/view-and-export-account-activity-history#security-activity-history).
     */
    fun listSecurityActivities(): CollectionResponseHydratedCriticalActionForwardPaging =
        listSecurityActivities(ActivityListSecurityActivitiesParams.none())

    /** @see listSecurityActivities */
    fun listSecurityActivities(
        params: ActivityListSecurityActivitiesParams = ActivityListSecurityActivitiesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CollectionResponseHydratedCriticalActionForwardPaging

    /** @see listSecurityActivities */
    fun listSecurityActivities(
        params: ActivityListSecurityActivitiesParams = ActivityListSecurityActivitiesParams.none()
    ): CollectionResponseHydratedCriticalActionForwardPaging =
        listSecurityActivities(params, RequestOptions.none())

    /** @see listSecurityActivities */
    fun listSecurityActivities(
        requestOptions: RequestOptions
    ): CollectionResponseHydratedCriticalActionForwardPaging =
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
         * Returns a raw HTTP response for `get /account-info/v3/activity/audit-logs`, but is
         * otherwise the same as [ActivityService.listAuditLogs].
         */
        @MustBeClosed
        fun listAuditLogs():
            HttpResponseFor<CollectionResponsePublicApiUserActionEventForwardPaging> =
            listAuditLogs(ActivityListAuditLogsParams.none())

        /** @see listAuditLogs */
        @MustBeClosed
        fun listAuditLogs(
            params: ActivityListAuditLogsParams = ActivityListAuditLogsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CollectionResponsePublicApiUserActionEventForwardPaging>

        /** @see listAuditLogs */
        @MustBeClosed
        fun listAuditLogs(
            params: ActivityListAuditLogsParams = ActivityListAuditLogsParams.none()
        ): HttpResponseFor<CollectionResponsePublicApiUserActionEventForwardPaging> =
            listAuditLogs(params, RequestOptions.none())

        /** @see listAuditLogs */
        @MustBeClosed
        fun listAuditLogs(
            requestOptions: RequestOptions
        ): HttpResponseFor<CollectionResponsePublicApiUserActionEventForwardPaging> =
            listAuditLogs(ActivityListAuditLogsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /account-info/v3/activity/login`, but is otherwise
         * the same as [ActivityService.listLoginActivities].
         */
        @MustBeClosed
        fun listLoginActivities():
            HttpResponseFor<CollectionResponsePublicLoginAuditForwardPaging> =
            listLoginActivities(ActivityListLoginActivitiesParams.none())

        /** @see listLoginActivities */
        @MustBeClosed
        fun listLoginActivities(
            params: ActivityListLoginActivitiesParams = ActivityListLoginActivitiesParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CollectionResponsePublicLoginAuditForwardPaging>

        /** @see listLoginActivities */
        @MustBeClosed
        fun listLoginActivities(
            params: ActivityListLoginActivitiesParams = ActivityListLoginActivitiesParams.none()
        ): HttpResponseFor<CollectionResponsePublicLoginAuditForwardPaging> =
            listLoginActivities(params, RequestOptions.none())

        /** @see listLoginActivities */
        @MustBeClosed
        fun listLoginActivities(
            requestOptions: RequestOptions
        ): HttpResponseFor<CollectionResponsePublicLoginAuditForwardPaging> =
            listLoginActivities(ActivityListLoginActivitiesParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /account-info/v3/activity/security`, but is
         * otherwise the same as [ActivityService.listSecurityActivities].
         */
        @MustBeClosed
        fun listSecurityActivities():
            HttpResponseFor<CollectionResponseHydratedCriticalActionForwardPaging> =
            listSecurityActivities(ActivityListSecurityActivitiesParams.none())

        /** @see listSecurityActivities */
        @MustBeClosed
        fun listSecurityActivities(
            params: ActivityListSecurityActivitiesParams =
                ActivityListSecurityActivitiesParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CollectionResponseHydratedCriticalActionForwardPaging>

        /** @see listSecurityActivities */
        @MustBeClosed
        fun listSecurityActivities(
            params: ActivityListSecurityActivitiesParams =
                ActivityListSecurityActivitiesParams.none()
        ): HttpResponseFor<CollectionResponseHydratedCriticalActionForwardPaging> =
            listSecurityActivities(params, RequestOptions.none())

        /** @see listSecurityActivities */
        @MustBeClosed
        fun listSecurityActivities(
            requestOptions: RequestOptions
        ): HttpResponseFor<CollectionResponseHydratedCriticalActionForwardPaging> =
            listSecurityActivities(ActivityListSecurityActivitiesParams.none(), requestOptions)
    }
}
