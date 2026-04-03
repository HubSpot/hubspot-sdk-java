// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.marketing.marketingevents

import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClientAsync
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

internal class AttendanceServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun createByEventIdAndContactId() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val attendanceServiceAsync = client.marketing().marketingEvents().attendance()

        val batchResponseSubscriberVidResponseFuture =
            attendanceServiceAsync.createByEventIdAndContactId(
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

        val batchResponseSubscriberVidResponse = batchResponseSubscriberVidResponseFuture.get()
        batchResponseSubscriberVidResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun createByEventIdAndEmail() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val attendanceServiceAsync = client.marketing().marketingEvents().attendance()

        val batchResponseSubscriberEmailResponseFuture =
            attendanceServiceAsync.createByEventIdAndEmail(
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

        val batchResponseSubscriberEmailResponse = batchResponseSubscriberEmailResponseFuture.get()
        batchResponseSubscriberEmailResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun createByExternalEventIdAndContactId() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val attendanceServiceAsync = client.marketing().marketingEvents().attendance()

        val batchResponseSubscriberVidResponseFuture =
            attendanceServiceAsync.createByExternalEventIdAndContactId(
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

        val batchResponseSubscriberVidResponse = batchResponseSubscriberVidResponseFuture.get()
        batchResponseSubscriberVidResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun createByExternalEventIdAndEmail() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val attendanceServiceAsync = client.marketing().marketingEvents().attendance()

        val batchResponseSubscriberEmailResponseFuture =
            attendanceServiceAsync.createByExternalEventIdAndEmail(
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

        val batchResponseSubscriberEmailResponse = batchResponseSubscriberEmailResponseFuture.get()
        batchResponseSubscriberEmailResponse.validate()
    }
}
