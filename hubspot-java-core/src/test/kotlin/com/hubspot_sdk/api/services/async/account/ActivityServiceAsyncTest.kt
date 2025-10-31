// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.account

import com.hubspot_sdk.api.TestServerExtension
import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClientAsync
import com.hubspot_sdk.api.models.account.activity.ActivityListAuditLogsParams
import com.hubspot_sdk.api.models.account.activity.ActivityListLoginActivitiesParams
import com.hubspot_sdk.api.models.account.activity.ActivityListSecurityActivitiesParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ActivityServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun listAuditLogs() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val activityServiceAsync = client.account().activity()

        val collectionResponsePublicApiUserActionEventForwardPagingFuture =
            activityServiceAsync.listAuditLogs(
                ActivityListAuditLogsParams.builder()
                    .addActingUserId(0)
                    .after("after")
                    .limit(0)
                    .occurredAfter(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .occurredBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .addSort("string")
                    .build()
            )

        val collectionResponsePublicApiUserActionEventForwardPaging =
            collectionResponsePublicApiUserActionEventForwardPagingFuture.get()
        collectionResponsePublicApiUserActionEventForwardPaging.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun listLoginActivities() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val activityServiceAsync = client.account().activity()

        val collectionResponsePublicLoginAuditForwardPagingFuture =
            activityServiceAsync.listLoginActivities(
                ActivityListLoginActivitiesParams.builder()
                    .after("after")
                    .limit(0)
                    .userId(0)
                    .build()
            )

        val collectionResponsePublicLoginAuditForwardPaging =
            collectionResponsePublicLoginAuditForwardPagingFuture.get()
        collectionResponsePublicLoginAuditForwardPaging.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun listSecurityActivities() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val activityServiceAsync = client.account().activity()

        val collectionResponseHydratedCriticalActionForwardPagingFuture =
            activityServiceAsync.listSecurityActivities(
                ActivityListSecurityActivitiesParams.builder()
                    .after("after")
                    .fromTimestamp(0L)
                    .limit(0)
                    .toTimestamp(0L)
                    .userId(0)
                    .build()
            )

        val collectionResponseHydratedCriticalActionForwardPaging =
            collectionResponseHydratedCriticalActionForwardPagingFuture.get()
        collectionResponseHydratedCriticalActionForwardPaging.validate()
    }
}
