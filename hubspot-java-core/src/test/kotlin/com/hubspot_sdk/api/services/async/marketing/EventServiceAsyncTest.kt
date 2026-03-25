// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.marketing

import com.github.tomakehurst.wiremock.client.WireMock.anyUrl
import com.github.tomakehurst.wiremock.client.WireMock.ok
import com.github.tomakehurst.wiremock.client.WireMock.post
import com.github.tomakehurst.wiremock.client.WireMock.stubFor
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClientAsync
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.models.PropertyValue
import com.hubspot_sdk.api.models.marketing.events.BatchInputMarketingEventCreateRequestParams
import com.hubspot_sdk.api.models.marketing.events.BatchInputMarketingEventEmailSubscriber
import com.hubspot_sdk.api.models.marketing.events.BatchInputMarketingEventExternalUniqueIdentifier
import com.hubspot_sdk.api.models.marketing.events.BatchInputMarketingEventPublicObjectIdDeleteRequest
import com.hubspot_sdk.api.models.marketing.events.BatchInputMarketingEventPublicUpdateRequestFullV2
import com.hubspot_sdk.api.models.marketing.events.BatchInputMarketingEventSubscriber
import com.hubspot_sdk.api.models.marketing.events.EventDeleteByExternalEventIdParams
import com.hubspot_sdk.api.models.marketing.events.EventGetByExternalEventIdParams
import com.hubspot_sdk.api.models.marketing.events.EventSearchByExternalEventIdParams
import com.hubspot_sdk.api.models.marketing.events.EventUpdateByExternalEventIdParams
import com.hubspot_sdk.api.models.marketing.events.EventUpdateParams
import com.hubspot_sdk.api.models.marketing.events.EventUpsertByExternalEventIdParams
import com.hubspot_sdk.api.models.marketing.events.EventUpsertSubscriberStateByEmailParams
import com.hubspot_sdk.api.models.marketing.events.EventUpsertSubscriberStateByIdParams
import com.hubspot_sdk.api.models.marketing.events.MarketingEventCreateRequestParams
import com.hubspot_sdk.api.models.marketing.events.MarketingEventEmailSubscriber
import com.hubspot_sdk.api.models.marketing.events.MarketingEventExternalUniqueIdentifier
import com.hubspot_sdk.api.models.marketing.events.MarketingEventPublicObjectIdDeleteRequest
import com.hubspot_sdk.api.models.marketing.events.MarketingEventPublicUpdateRequestFullV2
import com.hubspot_sdk.api.models.marketing.events.MarketingEventPublicUpdateRequestV2
import com.hubspot_sdk.api.models.marketing.events.MarketingEventSubscriber
import com.hubspot_sdk.api.models.marketing.events.MarketingEventUpdateRequestParams
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.parallel.ResourceLock

@WireMockTest
@ResourceLock("https://github.com/wiremock/wiremock/issues/169")
internal class EventServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val eventServiceAsync = client.marketing().events()

        val marketingEventDefaultResponseFuture =
            eventServiceAsync.create(
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

        val marketingEventDefaultResponse = marketingEventDefaultResponseFuture.get()
        marketingEventDefaultResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val eventServiceAsync = client.marketing().events()

        val marketingEventPublicDefaultResponseV2Future =
            eventServiceAsync.update(
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

        val marketingEventPublicDefaultResponseV2 =
            marketingEventPublicDefaultResponseV2Future.get()
        marketingEventPublicDefaultResponseV2.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val eventServiceAsync = client.marketing().events()

        val future = eventServiceAsync.delete("objectId")

        val response = future.get()
    }

    @Test
    fun deleteBatch(wmRuntimeInfo: WireMockRuntimeInfo) {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val eventServiceAsync = client.marketing().events()
        stubFor(post(anyUrl()).willReturn(ok().withBody("abc")))

        val responseFuture =
            eventServiceAsync.deleteBatch(
                BatchInputMarketingEventPublicObjectIdDeleteRequest.builder()
                    .addInput(
                        MarketingEventPublicObjectIdDeleteRequest.builder()
                            .objectId("objectId")
                            .build()
                    )
                    .build()
            )

        val response = responseFuture.get()
        assertThat(response.body()).hasContent("abc")
    }

    @Test
    fun deleteBatchByExternalEventId(wmRuntimeInfo: WireMockRuntimeInfo) {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val eventServiceAsync = client.marketing().events()
        stubFor(post(anyUrl()).willReturn(ok().withBody("abc")))

        val responseFuture =
            eventServiceAsync.deleteBatchByExternalEventId(
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

        val response = responseFuture.get()
        assertThat(response.body()).hasContent("abc")
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun deleteByExternalEventId() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val eventServiceAsync = client.marketing().events()

        val future =
            eventServiceAsync.deleteByExternalEventId(
                EventDeleteByExternalEventIdParams.builder()
                    .externalEventId("externalEventId")
                    .externalAccountId("externalAccountId")
                    .build()
            )

        val response = future.get()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun get() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val eventServiceAsync = client.marketing().events()

        val marketingEventPublicReadResponseV2Future = eventServiceAsync.get("objectId")

        val marketingEventPublicReadResponseV2 = marketingEventPublicReadResponseV2Future.get()
        marketingEventPublicReadResponseV2.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getByExternalEventId() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val eventServiceAsync = client.marketing().events()

        val marketingEventPublicReadResponseFuture =
            eventServiceAsync.getByExternalEventId(
                EventGetByExternalEventIdParams.builder()
                    .externalEventId("externalEventId")
                    .externalAccountId("externalAccountId")
                    .build()
            )

        val marketingEventPublicReadResponse = marketingEventPublicReadResponseFuture.get()
        marketingEventPublicReadResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun searchByExternalEventId() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val eventServiceAsync = client.marketing().events()

        val collectionResponseSearchPublicResponseWrapperNoPagingFuture =
            eventServiceAsync.searchByExternalEventId(
                EventSearchByExternalEventIdParams.builder().q("q").build()
            )

        val collectionResponseSearchPublicResponseWrapperNoPaging =
            collectionResponseSearchPublicResponseWrapperNoPagingFuture.get()
        collectionResponseSearchPublicResponseWrapperNoPaging.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun searchIdentifiersByExternalEventId() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val eventServiceAsync = client.marketing().events()

        val collectionResponseWithTotalMarketingEventIdentifiersResponseFuture =
            eventServiceAsync.searchIdentifiersByExternalEventId("externalEventId")

        val collectionResponseWithTotalMarketingEventIdentifiersResponse =
            collectionResponseWithTotalMarketingEventIdentifiersResponseFuture.get()
        collectionResponseWithTotalMarketingEventIdentifiersResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun updateBatch() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val eventServiceAsync = client.marketing().events()

        val batchResponseMarketingEventPublicDefaultResponseV2Future =
            eventServiceAsync.updateBatch(
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

        val batchResponseMarketingEventPublicDefaultResponseV2 =
            batchResponseMarketingEventPublicDefaultResponseV2Future.get()
        batchResponseMarketingEventPublicDefaultResponseV2.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun updateByExternalEventId() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val eventServiceAsync = client.marketing().events()

        val marketingEventPublicDefaultResponseFuture =
            eventServiceAsync.updateByExternalEventId(
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

        val marketingEventPublicDefaultResponse = marketingEventPublicDefaultResponseFuture.get()
        marketingEventPublicDefaultResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun upsertBatch() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val eventServiceAsync = client.marketing().events()

        val batchResponseMarketingEventPublicDefaultResponseFuture =
            eventServiceAsync.upsertBatch(
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

        val batchResponseMarketingEventPublicDefaultResponse =
            batchResponseMarketingEventPublicDefaultResponseFuture.get()
        batchResponseMarketingEventPublicDefaultResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun upsertByExternalEventId() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val eventServiceAsync = client.marketing().events()

        val marketingEventPublicDefaultResponseFuture =
            eventServiceAsync.upsertByExternalEventId(
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

        val marketingEventPublicDefaultResponse = marketingEventPublicDefaultResponseFuture.get()
        marketingEventPublicDefaultResponse.validate()
    }

    @Test
    fun upsertSubscriberStateByEmail(wmRuntimeInfo: WireMockRuntimeInfo) {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val eventServiceAsync = client.marketing().events()
        stubFor(post(anyUrl()).willReturn(ok().withBody("abc")))

        val responseFuture =
            eventServiceAsync.upsertSubscriberStateByEmail(
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

        val response = responseFuture.get()
        assertThat(response.body()).hasContent("abc")
    }

    @Test
    fun upsertSubscriberStateById(wmRuntimeInfo: WireMockRuntimeInfo) {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val eventServiceAsync = client.marketing().events()
        stubFor(post(anyUrl()).willReturn(ok().withBody("abc")))

        val responseFuture =
            eventServiceAsync.upsertSubscriberStateById(
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

        val response = responseFuture.get()
        assertThat(response.body()).hasContent("abc")
    }
}
