// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.marketing.events

import com.hubspot_sdk.api.TestServerExtension
import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClientAsync
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.models.marketing.events.BatchInputMarketingEventEmailSubscriber
import com.hubspot_sdk.api.models.marketing.events.BatchInputMarketingEventSubscriber
import com.hubspot_sdk.api.models.marketing.events.MarketingEventEmailSubscriber
import com.hubspot_sdk.api.models.marketing.events.MarketingEventSubscriber
import com.hubspot_sdk.api.models.marketing.events.attendance.AttendanceCreateByEventIdAndContactIdParams
import com.hubspot_sdk.api.models.marketing.events.attendance.AttendanceCreateByEventIdAndEmailParams
import com.hubspot_sdk.api.models.marketing.events.attendance.AttendanceCreateByExternalEventIdAndContactIdParams
import com.hubspot_sdk.api.models.marketing.events.attendance.AttendanceCreateByExternalEventIdAndEmailParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class AttendanceServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun createByEventIdAndContactId() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val attendanceServiceAsync = client.marketing().events().attendance()

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

    @Disabled("Prism tests are disabled")
    @Test
    fun createByEventIdAndEmail() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val attendanceServiceAsync = client.marketing().events().attendance()

        val batchResponseSubscriberEmailResponseFuture =
            attendanceServiceAsync.createByEventIdAndEmail(
                AttendanceCreateByEventIdAndEmailParams.builder()
                    .objectId("objectId")
                    .subscriberState("subscriberState")
                    .batchInputMarketingEventEmailSubscriber(
                        BatchInputMarketingEventEmailSubscriber.builder()
                            .addInput(
                                MarketingEventEmailSubscriber.builder()
                                    .email("email")
                                    .interactionDateTime(0L)
                                    .contactProperties(
                                        MarketingEventEmailSubscriber.ContactProperties.builder()
                                            .putAdditionalProperty("foo", JsonValue.from("string"))
                                            .build()
                                    )
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

    @Disabled("Prism tests are disabled")
    @Test
    fun createByExternalEventIdAndContactId() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val attendanceServiceAsync = client.marketing().events().attendance()

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

    @Disabled("Prism tests are disabled")
    @Test
    fun createByExternalEventIdAndEmail() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val attendanceServiceAsync = client.marketing().events().attendance()

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
                                    .email("email")
                                    .interactionDateTime(0L)
                                    .contactProperties(
                                        MarketingEventEmailSubscriber.ContactProperties.builder()
                                            .putAdditionalProperty("foo", JsonValue.from("string"))
                                            .build()
                                    )
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
