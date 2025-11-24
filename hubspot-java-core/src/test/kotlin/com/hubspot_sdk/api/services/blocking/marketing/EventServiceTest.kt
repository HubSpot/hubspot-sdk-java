// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.marketing

import com.github.tomakehurst.wiremock.client.WireMock.anyUrl
import com.github.tomakehurst.wiremock.client.WireMock.ok
import com.github.tomakehurst.wiremock.client.WireMock.post
import com.github.tomakehurst.wiremock.client.WireMock.stubFor
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import com.hubspot_sdk.api.TestServerExtension
import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClient
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.models.marketing.events.BatchInputMarketingEventCreateRequestParams
import com.hubspot_sdk.api.models.marketing.events.BatchInputMarketingEventEmailSubscriber
import com.hubspot_sdk.api.models.marketing.events.BatchInputMarketingEventExternalUniqueIdentifier
import com.hubspot_sdk.api.models.marketing.events.BatchInputMarketingEventPublicObjectIdDeleteRequest
import com.hubspot_sdk.api.models.marketing.events.BatchInputMarketingEventPublicUpdateRequestFullV2
import com.hubspot_sdk.api.models.marketing.events.BatchInputMarketingEventSubscriber
import com.hubspot_sdk.api.models.marketing.events.EventCancelByExternalEventIdParams
import com.hubspot_sdk.api.models.marketing.events.EventCompleteByExternalEventIdParams
import com.hubspot_sdk.api.models.marketing.events.EventDeleteByExternalEventIdParams
import com.hubspot_sdk.api.models.marketing.events.EventGetByExternalEventIdParams
import com.hubspot_sdk.api.models.marketing.events.EventSearchByExternalEventIdParams
import com.hubspot_sdk.api.models.marketing.events.EventUpdateByExternalEventIdParams
import com.hubspot_sdk.api.models.marketing.events.EventUpdateParams
import com.hubspot_sdk.api.models.marketing.events.EventUpsertByExternalEventIdParams
import com.hubspot_sdk.api.models.marketing.events.EventUpsertSubscriberStateByEmailParams
import com.hubspot_sdk.api.models.marketing.events.EventUpsertSubscriberStateByIdParams
import com.hubspot_sdk.api.models.marketing.events.MarketingEventCompleteRequestParams
import com.hubspot_sdk.api.models.marketing.events.MarketingEventCreateRequestParams
import com.hubspot_sdk.api.models.marketing.events.MarketingEventEmailSubscriber
import com.hubspot_sdk.api.models.marketing.events.MarketingEventExternalUniqueIdentifier
import com.hubspot_sdk.api.models.marketing.events.MarketingEventPublicObjectIdDeleteRequest
import com.hubspot_sdk.api.models.marketing.events.MarketingEventPublicUpdateRequestFullV2
import com.hubspot_sdk.api.models.marketing.events.MarketingEventPublicUpdateRequestV2
import com.hubspot_sdk.api.models.marketing.events.MarketingEventSubscriber
import com.hubspot_sdk.api.models.marketing.events.MarketingEventUpdateRequestParams
import com.hubspot_sdk.api.models.marketing.events.PropertyValue
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.junit.jupiter.api.parallel.ResourceLock

@ExtendWith(TestServerExtension::class)
@WireMockTest
@ResourceLock("https://github.com/wiremock/wiremock/issues/169")
internal class EventServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val eventService = client.marketing().events()

        val marketingEventDefaultResponse =
            eventService.create(
                MarketingEventCreateRequestParams.builder()
                    .addCustomProperty(
                        PropertyValue.builder()
                            .dataSensitivity(PropertyValue.DataSensitivity.HIGH)
                            .isEncrypted(true)
                            .isLargeValue(true)
                            .name("name")
                            .persistenceTimestamp(0L)
                            .requestId("requestId")
                            .selectedByUser(true)
                            .selectedByUserTimestamp(0L)
                            .source(PropertyValue.Source.ACADEMY)
                            .sourceId("sourceId")
                            .sourceLabel("sourceLabel")
                            .sourceMetadata("sourceMetadata")
                            .sourceUpstreamDeployable("sourceUpstreamDeployable")
                            .addSourceVid(0L)
                            .timestamp(0L)
                            .unit("unit")
                            .updatedByUserId(0)
                            .useTimestampAsPersistenceTimestamp(true)
                            .value("value")
                            .build()
                    )
                    .eventName("eventName")
                    .eventOrganizer("eventOrganizer")
                    .externalAccountId("externalAccountId")
                    .externalEventId("externalEventId")
                    .endDateTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .eventCancelled(true)
                    .eventCompleted(true)
                    .eventDescription("eventDescription")
                    .eventType("eventType")
                    .eventUrl("eventUrl")
                    .startDateTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )

        marketingEventDefaultResponse.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val eventService = client.marketing().events()

        val marketingEventPublicDefaultResponseV2 =
            eventService.update(
                EventUpdateParams.builder()
                    .objectId("objectId")
                    .marketingEventPublicUpdateRequestV2(
                        MarketingEventPublicUpdateRequestV2.builder()
                            .addCustomProperty(
                                PropertyValue.builder()
                                    .dataSensitivity(PropertyValue.DataSensitivity.HIGH)
                                    .isEncrypted(true)
                                    .isLargeValue(true)
                                    .name("name")
                                    .persistenceTimestamp(0L)
                                    .requestId("requestId")
                                    .selectedByUser(true)
                                    .selectedByUserTimestamp(0L)
                                    .source(PropertyValue.Source.ACADEMY)
                                    .sourceId("sourceId")
                                    .sourceLabel("sourceLabel")
                                    .sourceMetadata("sourceMetadata")
                                    .sourceUpstreamDeployable("sourceUpstreamDeployable")
                                    .addSourceVid(0L)
                                    .timestamp(0L)
                                    .unit("unit")
                                    .updatedByUserId(0)
                                    .useTimestampAsPersistenceTimestamp(true)
                                    .value("value")
                                    .build()
                            )
                            .endDateTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .eventCancelled(true)
                            .eventDescription("eventDescription")
                            .eventName("eventName")
                            .eventOrganizer("eventOrganizer")
                            .eventType("eventType")
                            .eventUrl("eventUrl")
                            .startDateTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .build()
                    )
                    .build()
            )

        marketingEventPublicDefaultResponseV2.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val eventService = client.marketing().events()

        val page = eventService.list()

        page.response().validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val eventService = client.marketing().events()

        eventService.delete("objectId")
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun cancelByExternalEventId() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val eventService = client.marketing().events()

        val marketingEventDefaultResponse =
            eventService.cancelByExternalEventId(
                EventCancelByExternalEventIdParams.builder()
                    .externalEventId("externalEventId")
                    .externalAccountId("externalAccountId")
                    .build()
            )

        marketingEventDefaultResponse.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun completeByExternalEventId() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val eventService = client.marketing().events()

        val marketingEventDefaultResponse =
            eventService.completeByExternalEventId(
                EventCompleteByExternalEventIdParams.builder()
                    .externalEventId("externalEventId")
                    .externalAccountId("externalAccountId")
                    .marketingEventCompleteRequestParams(
                        MarketingEventCompleteRequestParams.builder()
                            .endDateTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .startDateTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .build()
                    )
                    .build()
            )

        marketingEventDefaultResponse.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun deleteBatch() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val eventService = client.marketing().events()

        eventService.deleteBatch(
            BatchInputMarketingEventPublicObjectIdDeleteRequest.builder()
                .addInput(
                    MarketingEventPublicObjectIdDeleteRequest.builder().objectId("objectId").build()
                )
                .build()
        )
    }

    @Test
    fun deleteBatchByExternalEventId(wmRuntimeInfo: WireMockRuntimeInfo) {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val eventService = client.marketing().events()
        stubFor(post(anyUrl()).willReturn(ok().withBody("abc")))

        val response =
            eventService.deleteBatchByExternalEventId(
                BatchInputMarketingEventExternalUniqueIdentifier.builder()
                    .addInput(
                        MarketingEventExternalUniqueIdentifier.builder()
                            .appId(0)
                            .externalAccountId("externalAccountId")
                            .externalEventId("externalEventId")
                            .build()
                    )
                    .build()
            )

        assertThat(response.body()).hasContent("abc")
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun deleteByExternalEventId() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val eventService = client.marketing().events()

        eventService.deleteByExternalEventId(
            EventDeleteByExternalEventIdParams.builder()
                .externalEventId("externalEventId")
                .externalAccountId("externalAccountId")
                .build()
        )
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun get() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val eventService = client.marketing().events()

        val marketingEventPublicReadResponseV2 = eventService.get("objectId")

        marketingEventPublicReadResponseV2.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun getByExternalEventId() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val eventService = client.marketing().events()

        val marketingEventPublicReadResponse =
            eventService.getByExternalEventId(
                EventGetByExternalEventIdParams.builder()
                    .externalEventId("externalEventId")
                    .externalAccountId("externalAccountId")
                    .build()
            )

        marketingEventPublicReadResponse.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun searchByExternalEventId() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val eventService = client.marketing().events()

        val collectionResponseSearchPublicResponseWrapperNoPaging =
            eventService.searchByExternalEventId(
                EventSearchByExternalEventIdParams.builder().q("q").build()
            )

        collectionResponseSearchPublicResponseWrapperNoPaging.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun searchIdentifiersByExternalEventId() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val eventService = client.marketing().events()

        val collectionResponseWithTotalMarketingEventIdentifiersResponseNoPaging =
            eventService.searchIdentifiersByExternalEventId("externalEventId")

        collectionResponseWithTotalMarketingEventIdentifiersResponseNoPaging.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun updateBatch() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val eventService = client.marketing().events()

        val batchResponseMarketingEventPublicDefaultResponseV2 =
            eventService.updateBatch(
                BatchInputMarketingEventPublicUpdateRequestFullV2.builder()
                    .addInput(
                        MarketingEventPublicUpdateRequestFullV2.builder()
                            .addCustomProperty(
                                PropertyValue.builder()
                                    .dataSensitivity(PropertyValue.DataSensitivity.HIGH)
                                    .isEncrypted(true)
                                    .isLargeValue(true)
                                    .name("name")
                                    .persistenceTimestamp(0L)
                                    .requestId("requestId")
                                    .selectedByUser(true)
                                    .selectedByUserTimestamp(0L)
                                    .source(PropertyValue.Source.ACADEMY)
                                    .sourceId("sourceId")
                                    .sourceLabel("sourceLabel")
                                    .sourceMetadata("sourceMetadata")
                                    .sourceUpstreamDeployable("sourceUpstreamDeployable")
                                    .addSourceVid(0L)
                                    .timestamp(0L)
                                    .unit("unit")
                                    .updatedByUserId(0)
                                    .useTimestampAsPersistenceTimestamp(true)
                                    .value("value")
                                    .build()
                            )
                            .objectId("objectId")
                            .endDateTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .eventCancelled(true)
                            .eventDescription("eventDescription")
                            .eventName("eventName")
                            .eventOrganizer("eventOrganizer")
                            .eventType("eventType")
                            .eventUrl("eventUrl")
                            .startDateTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .build()
                    )
                    .build()
            )

        batchResponseMarketingEventPublicDefaultResponseV2.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun updateByExternalEventId() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val eventService = client.marketing().events()

        val marketingEventPublicDefaultResponse =
            eventService.updateByExternalEventId(
                EventUpdateByExternalEventIdParams.builder()
                    .externalEventId("externalEventId")
                    .externalAccountId("externalAccountId")
                    .marketingEventUpdateRequestParams(
                        MarketingEventUpdateRequestParams.builder()
                            .addCustomProperty(
                                PropertyValue.builder()
                                    .dataSensitivity(PropertyValue.DataSensitivity.HIGH)
                                    .isEncrypted(true)
                                    .isLargeValue(true)
                                    .name("name")
                                    .persistenceTimestamp(0L)
                                    .requestId("requestId")
                                    .selectedByUser(true)
                                    .selectedByUserTimestamp(0L)
                                    .source(PropertyValue.Source.ACADEMY)
                                    .sourceId("sourceId")
                                    .sourceLabel("sourceLabel")
                                    .sourceMetadata("sourceMetadata")
                                    .sourceUpstreamDeployable("sourceUpstreamDeployable")
                                    .addSourceVid(0L)
                                    .timestamp(0L)
                                    .unit("unit")
                                    .updatedByUserId(0)
                                    .useTimestampAsPersistenceTimestamp(true)
                                    .value("value")
                                    .build()
                            )
                            .endDateTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .eventCancelled(true)
                            .eventCompleted(true)
                            .eventDescription("eventDescription")
                            .eventName("eventName")
                            .eventOrganizer("eventOrganizer")
                            .eventType("eventType")
                            .eventUrl("eventUrl")
                            .startDateTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .build()
                    )
                    .build()
            )

        marketingEventPublicDefaultResponse.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun upsertBatch() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val eventService = client.marketing().events()

        val batchResponseMarketingEventPublicDefaultResponse =
            eventService.upsertBatch(
                BatchInputMarketingEventCreateRequestParams.builder()
                    .addInput(
                        MarketingEventCreateRequestParams.builder()
                            .addCustomProperty(
                                PropertyValue.builder()
                                    .dataSensitivity(PropertyValue.DataSensitivity.HIGH)
                                    .isEncrypted(true)
                                    .isLargeValue(true)
                                    .name("name")
                                    .persistenceTimestamp(0L)
                                    .requestId("requestId")
                                    .selectedByUser(true)
                                    .selectedByUserTimestamp(0L)
                                    .source(PropertyValue.Source.ACADEMY)
                                    .sourceId("sourceId")
                                    .sourceLabel("sourceLabel")
                                    .sourceMetadata("sourceMetadata")
                                    .sourceUpstreamDeployable("sourceUpstreamDeployable")
                                    .addSourceVid(0L)
                                    .timestamp(0L)
                                    .unit("unit")
                                    .updatedByUserId(0)
                                    .useTimestampAsPersistenceTimestamp(true)
                                    .value("value")
                                    .build()
                            )
                            .eventName("eventName")
                            .eventOrganizer("eventOrganizer")
                            .externalAccountId("externalAccountId")
                            .externalEventId("externalEventId")
                            .endDateTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .eventCancelled(true)
                            .eventCompleted(true)
                            .eventDescription("eventDescription")
                            .eventType("eventType")
                            .eventUrl("eventUrl")
                            .startDateTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .build()
                    )
                    .build()
            )

        batchResponseMarketingEventPublicDefaultResponse.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun upsertByExternalEventId() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val eventService = client.marketing().events()

        val marketingEventPublicDefaultResponse =
            eventService.upsertByExternalEventId(
                EventUpsertByExternalEventIdParams.builder()
                    .pathExternalEventId("externalEventId")
                    .marketingEventCreateRequestParams(
                        MarketingEventCreateRequestParams.builder()
                            .addCustomProperty(
                                PropertyValue.builder()
                                    .dataSensitivity(PropertyValue.DataSensitivity.HIGH)
                                    .isEncrypted(true)
                                    .isLargeValue(true)
                                    .name("name")
                                    .persistenceTimestamp(0L)
                                    .requestId("requestId")
                                    .selectedByUser(true)
                                    .selectedByUserTimestamp(0L)
                                    .source(PropertyValue.Source.ACADEMY)
                                    .sourceId("sourceId")
                                    .sourceLabel("sourceLabel")
                                    .sourceMetadata("sourceMetadata")
                                    .sourceUpstreamDeployable("sourceUpstreamDeployable")
                                    .addSourceVid(0L)
                                    .timestamp(0L)
                                    .unit("unit")
                                    .updatedByUserId(0)
                                    .useTimestampAsPersistenceTimestamp(true)
                                    .value("value")
                                    .build()
                            )
                            .eventName("eventName")
                            .eventOrganizer("eventOrganizer")
                            .externalAccountId("externalAccountId")
                            .externalEventId("externalEventId")
                            .endDateTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .eventCancelled(true)
                            .eventCompleted(true)
                            .eventDescription("eventDescription")
                            .eventType("eventType")
                            .eventUrl("eventUrl")
                            .startDateTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .build()
                    )
                    .build()
            )

        marketingEventPublicDefaultResponse.validate()
    }

    @Test
    fun upsertSubscriberStateByEmail(wmRuntimeInfo: WireMockRuntimeInfo) {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val eventService = client.marketing().events()
        stubFor(post(anyUrl()).willReturn(ok().withBody("abc")))

        val response =
            eventService.upsertSubscriberStateByEmail(
                EventUpsertSubscriberStateByEmailParams.builder()
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

        assertThat(response.body()).hasContent("abc")
    }

    @Test
    fun upsertSubscriberStateById(wmRuntimeInfo: WireMockRuntimeInfo) {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val eventService = client.marketing().events()
        stubFor(post(anyUrl()).willReturn(ok().withBody("abc")))

        val response =
            eventService.upsertSubscriberStateById(
                EventUpsertSubscriberStateByIdParams.builder()
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

        assertThat(response.body()).hasContent("abc")
    }
}
