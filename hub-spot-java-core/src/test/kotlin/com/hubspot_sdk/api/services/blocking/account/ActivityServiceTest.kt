// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.account

import com.hubspot_sdk.api.TestServerExtension
import com.hubspot_sdk.api.client.okhttp.HubSpotOkHttpClient
import com.hubspot_sdk.api.models.account.activity.ActivityListAuditLogsParams
import com.hubspot_sdk.api.models.account.activity.ActivityListLoginActivitiesParams
import com.hubspot_sdk.api.models.account.activity.ActivityListSecurityActivitiesParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ActivityServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun listAuditLogs() {
        val client =
            HubSpotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val activityService = client.account().activity()

        val collectionResponsePublicApiUserActionEventForwardPaging =
            activityService.listAuditLogs(
                ActivityListAuditLogsParams.builder()
                    .addActingUserId(0)
                    .after("after")
                    .limit(0)
                    .occurredAfter(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .occurredBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .addSort("string")
                    .build()
            )

        collectionResponsePublicApiUserActionEventForwardPaging.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun listLoginActivities() {
        val client =
            HubSpotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val activityService = client.account().activity()

        val collectionResponsePublicLoginAuditForwardPaging =
            activityService.listLoginActivities(
                ActivityListLoginActivitiesParams.builder()
                    .after("after")
                    .limit(0)
                    .userId(0)
                    .build()
            )

        collectionResponsePublicLoginAuditForwardPaging.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun listSecurityActivities() {
        val client =
            HubSpotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val activityService = client.account().activity()

        val collectionResponseHydratedCriticalActionForwardPaging =
            activityService.listSecurityActivities(
                ActivityListSecurityActivitiesParams.builder()
                    .after("after")
                    .fromTimestamp(0L)
                    .limit(0)
                    .toTimestamp(0L)
                    .userId(0)
                    .build()
            )

        collectionResponseHydratedCriticalActionForwardPaging.validate()
    }
}
