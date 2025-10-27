// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.account

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.account.activity.ActivityListAuditLogsParams
import com.hubspot_sdk.api.models.account.activity.ActivityListLoginActivitiesParams
import com.hubspot_sdk.api.models.account.activity.ActivityListSecurityActivitiesParams
import com.hubspot_sdk.api.models.account.activity.CollectionResponseHydratedCriticalActionForwardPaging
import com.hubspot_sdk.api.models.account.activity.CollectionResponsePublicApiUserActionEventForwardPaging
import com.hubspot_sdk.api.models.account.activity.CollectionResponsePublicLoginAuditForwardPaging
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
    fun listAuditLogs():
        CompletableFuture<CollectionResponsePublicApiUserActionEventForwardPaging> =
        listAuditLogs(ActivityListAuditLogsParams.none())

    /** @see listAuditLogs */
    fun listAuditLogs(
        params: ActivityListAuditLogsParams = ActivityListAuditLogsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CollectionResponsePublicApiUserActionEventForwardPaging>

    /** @see listAuditLogs */
    fun listAuditLogs(
        params: ActivityListAuditLogsParams = ActivityListAuditLogsParams.none()
    ): CompletableFuture<CollectionResponsePublicApiUserActionEventForwardPaging> =
        listAuditLogs(params, RequestOptions.none())

    /** @see listAuditLogs */
    fun listAuditLogs(
        requestOptions: RequestOptions
    ): CompletableFuture<CollectionResponsePublicApiUserActionEventForwardPaging> =
        listAuditLogs(ActivityListAuditLogsParams.none(), requestOptions)

    /**
     * Retrieve logs of user actions related to
     * [login activity](https://knowledge.hubspot.com/account-management/view-and-export-account-activity-history#account-login-history).
     */
    fun listLoginActivities(): CompletableFuture<CollectionResponsePublicLoginAuditForwardPaging> =
        listLoginActivities(ActivityListLoginActivitiesParams.none())

    /** @see listLoginActivities */
    fun listLoginActivities(
        params: ActivityListLoginActivitiesParams = ActivityListLoginActivitiesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CollectionResponsePublicLoginAuditForwardPaging>

    /** @see listLoginActivities */
    fun listLoginActivities(
        params: ActivityListLoginActivitiesParams = ActivityListLoginActivitiesParams.none()
    ): CompletableFuture<CollectionResponsePublicLoginAuditForwardPaging> =
        listLoginActivities(params, RequestOptions.none())

    /** @see listLoginActivities */
    fun listLoginActivities(
        requestOptions: RequestOptions
    ): CompletableFuture<CollectionResponsePublicLoginAuditForwardPaging> =
        listLoginActivities(ActivityListLoginActivitiesParams.none(), requestOptions)

    /**
     * Retrieve logs of user actions related to
     * [security activity](https://knowledge.hubspot.com/account-management/view-and-export-account-activity-history#security-activity-history).
     */
    fun listSecurityActivities():
        CompletableFuture<CollectionResponseHydratedCriticalActionForwardPaging> =
        listSecurityActivities(ActivityListSecurityActivitiesParams.none())

    /** @see listSecurityActivities */
    fun listSecurityActivities(
        params: ActivityListSecurityActivitiesParams = ActivityListSecurityActivitiesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CollectionResponseHydratedCriticalActionForwardPaging>

    /** @see listSecurityActivities */
    fun listSecurityActivities(
        params: ActivityListSecurityActivitiesParams = ActivityListSecurityActivitiesParams.none()
    ): CompletableFuture<CollectionResponseHydratedCriticalActionForwardPaging> =
        listSecurityActivities(params, RequestOptions.none())

    /** @see listSecurityActivities */
    fun listSecurityActivities(
        requestOptions: RequestOptions
    ): CompletableFuture<CollectionResponseHydratedCriticalActionForwardPaging> =
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
         * Returns a raw HTTP response for `get /account-info/v3/activity/audit-logs`, but is
         * otherwise the same as [ActivityServiceAsync.listAuditLogs].
         */
        fun listAuditLogs():
            CompletableFuture<
                HttpResponseFor<CollectionResponsePublicApiUserActionEventForwardPaging>
            > = listAuditLogs(ActivityListAuditLogsParams.none())

        /** @see listAuditLogs */
        fun listAuditLogs(
            params: ActivityListAuditLogsParams = ActivityListAuditLogsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<
            HttpResponseFor<CollectionResponsePublicApiUserActionEventForwardPaging>
        >

        /** @see listAuditLogs */
        fun listAuditLogs(
            params: ActivityListAuditLogsParams = ActivityListAuditLogsParams.none()
        ): CompletableFuture<
            HttpResponseFor<CollectionResponsePublicApiUserActionEventForwardPaging>
        > = listAuditLogs(params, RequestOptions.none())

        /** @see listAuditLogs */
        fun listAuditLogs(
            requestOptions: RequestOptions
        ): CompletableFuture<
            HttpResponseFor<CollectionResponsePublicApiUserActionEventForwardPaging>
        > = listAuditLogs(ActivityListAuditLogsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /account-info/v3/activity/login`, but is otherwise
         * the same as [ActivityServiceAsync.listLoginActivities].
         */
        fun listLoginActivities():
            CompletableFuture<HttpResponseFor<CollectionResponsePublicLoginAuditForwardPaging>> =
            listLoginActivities(ActivityListLoginActivitiesParams.none())

        /** @see listLoginActivities */
        fun listLoginActivities(
            params: ActivityListLoginActivitiesParams = ActivityListLoginActivitiesParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CollectionResponsePublicLoginAuditForwardPaging>>

        /** @see listLoginActivities */
        fun listLoginActivities(
            params: ActivityListLoginActivitiesParams = ActivityListLoginActivitiesParams.none()
        ): CompletableFuture<HttpResponseFor<CollectionResponsePublicLoginAuditForwardPaging>> =
            listLoginActivities(params, RequestOptions.none())

        /** @see listLoginActivities */
        fun listLoginActivities(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<CollectionResponsePublicLoginAuditForwardPaging>> =
            listLoginActivities(ActivityListLoginActivitiesParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /account-info/v3/activity/security`, but is
         * otherwise the same as [ActivityServiceAsync.listSecurityActivities].
         */
        fun listSecurityActivities():
            CompletableFuture<
                HttpResponseFor<CollectionResponseHydratedCriticalActionForwardPaging>
            > = listSecurityActivities(ActivityListSecurityActivitiesParams.none())

        /** @see listSecurityActivities */
        fun listSecurityActivities(
            params: ActivityListSecurityActivitiesParams =
                ActivityListSecurityActivitiesParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CollectionResponseHydratedCriticalActionForwardPaging>>

        /** @see listSecurityActivities */
        fun listSecurityActivities(
            params: ActivityListSecurityActivitiesParams =
                ActivityListSecurityActivitiesParams.none()
        ): CompletableFuture<
            HttpResponseFor<CollectionResponseHydratedCriticalActionForwardPaging>
        > = listSecurityActivities(params, RequestOptions.none())

        /** @see listSecurityActivities */
        fun listSecurityActivities(
            requestOptions: RequestOptions
        ): CompletableFuture<
            HttpResponseFor<CollectionResponseHydratedCriticalActionForwardPaging>
        > = listSecurityActivities(ActivityListSecurityActivitiesParams.none(), requestOptions)
    }
}
