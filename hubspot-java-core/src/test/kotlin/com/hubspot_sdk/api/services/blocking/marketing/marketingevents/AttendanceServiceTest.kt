// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.marketing.marketingevents

import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClient
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.models.marketing.marketingevents.BatchInputMarketingEventEmailSubscriber
import com.hubspot_sdk.api.models.marketing.marketingevents.BatchInputMarketingEventSubscriber
import com.hubspot_sdk.api.models.marketing.marketingevents.MarketingEventEmailSubscriber
import com.hubspot_sdk.api.models.marketing.marketingevents.MarketingEventSubscriber
import com.hubspot_sdk.api.models.marketing.marketingevents.attendance.AttendanceCreateByEventIdAndContactIdParams
import com.hubspot_sdk.api.models.marketing.marketingevents.attendance.AttendanceCreateByEventIdAndEmailParams
import com.hubspot_sdk.api.models.marketing.marketingevents.attendance.AttendanceCreateByExternalEventIdAndContactIdParams
import com.hubspot_sdk.api.models.marketing.marketingevents.attendance.AttendanceCreateByExternalEventIdAndEmailParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class AttendanceServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun createByEventIdAndContactId() {
        val client = HubspotOkHttpClient.builder().accessToken("My Access Token").build()
        val attendanceService = client.marketing().marketingEvents().attendance()

        val batchResponseSubscriberVidResponse =
            attendanceService.createByEventIdAndContactId(
                AttendanceCreateByEventIdAndContactIdParams.builder()
                    .objectId("objectId")
                    .subscriberState("subscriberState")
                    .batchInputMarketingEventSubscriber(
                        BatchInputMarketingEventSubscriber.builder()
                            .addInput(
                                MarketingEventSubscriber.builder()
                                    .interactionDateTime(0L)
                                    .properties(
                                        MarketingEventSubscriber.Properties.builder()
                                            .putAdditionalProperty("foo", JsonValue.from("string"))
                                            .build()
                                    )
                                    .vid(0)
                                    .build()
                            )
                            .build()
                    )
                    .build()
            )

        batchResponseSubscriberVidResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun createByEventIdAndEmail() {
        val client = HubspotOkHttpClient.builder().accessToken("My Access Token").build()
        val attendanceService = client.marketing().marketingEvents().attendance()

        val batchResponseSubscriberEmailResponse =
            attendanceService.createByEventIdAndEmail(
                AttendanceCreateByEventIdAndEmailParams.builder()
                    .objectId("objectId")
                    .subscriberState("subscriberState")
                    .batchInputMarketingEventEmailSubscriber(
                        BatchInputMarketingEventEmailSubscriber.builder()
                            .addInput(
                                MarketingEventEmailSubscriber.builder()
                                    .contactProperties(
                                        MarketingEventEmailSubscriber.ContactProperties.builder()
                                            .putAdditionalProperty("foo", JsonValue.from("string"))
                                            .build()
                                    )
                                    .email("email")
                                    .interactionDateTime(0L)
                                    .properties(
                                        MarketingEventEmailSubscriber.Properties.builder()
                                            .putAdditionalProperty("foo", JsonValue.from("string"))
                                            .build()
                                    )
                                    .build()
                            )
                            .build()
                    )
                    .build()
            )

        batchResponseSubscriberEmailResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun createByExternalEventIdAndContactId() {
        val client = HubspotOkHttpClient.builder().accessToken("My Access Token").build()
        val attendanceService = client.marketing().marketingEvents().attendance()

        val batchResponseSubscriberVidResponse =
            attendanceService.createByExternalEventIdAndContactId(
                AttendanceCreateByExternalEventIdAndContactIdParams.builder()
                    .externalEventId("externalEventId")
                    .subscriberState("subscriberState")
                    .externalAccountId("externalAccountId")
                    .batchInputMarketingEventSubscriber(
                        BatchInputMarketingEventSubscriber.builder()
                            .addInput(
                                MarketingEventSubscriber.builder()
                                    .interactionDateTime(0L)
                                    .properties(
                                        MarketingEventSubscriber.Properties.builder()
                                            .putAdditionalProperty("foo", JsonValue.from("string"))
                                            .build()
                                    )
                                    .vid(0)
                                    .build()
                            )
                            .build()
                    )
                    .build()
            )

        batchResponseSubscriberVidResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun createByExternalEventIdAndEmail() {
        val client = HubspotOkHttpClient.builder().accessToken("My Access Token").build()
        val attendanceService = client.marketing().marketingEvents().attendance()

        val batchResponseSubscriberEmailResponse =
            attendanceService.createByExternalEventIdAndEmail(
                AttendanceCreateByExternalEventIdAndEmailParams.builder()
                    .externalEventId("externalEventId")
                    .subscriberState("subscriberState")
                    .externalAccountId("externalAccountId")
                    .batchInputMarketingEventEmailSubscriber(
                        BatchInputMarketingEventEmailSubscriber.builder()
                            .addInput(
                                MarketingEventEmailSubscriber.builder()
                                    .contactProperties(
                                        MarketingEventEmailSubscriber.ContactProperties.builder()
                                            .putAdditionalProperty("foo", JsonValue.from("string"))
                                            .build()
                                    )
                                    .email("email")
                                    .interactionDateTime(0L)
                                    .properties(
                                        MarketingEventEmailSubscriber.Properties.builder()
                                            .putAdditionalProperty("foo", JsonValue.from("string"))
                                            .build()
                                    )
                                    .build()
                            )
                            .build()
                    )
                    .build()
            )

        batchResponseSubscriberEmailResponse.validate()
    }
}
