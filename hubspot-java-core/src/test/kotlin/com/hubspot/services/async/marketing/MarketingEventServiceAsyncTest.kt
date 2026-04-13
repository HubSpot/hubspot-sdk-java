// File generated from our OpenAPI spec by Stainless.

package com.hubspot.services.async.marketing

import com.github.tomakehurst.wiremock.client.WireMock.anyUrl
import com.github.tomakehurst.wiremock.client.WireMock.ok
import com.github.tomakehurst.wiremock.client.WireMock.post
import com.github.tomakehurst.wiremock.client.WireMock.stubFor
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import com.hubspot.client.okhttp.HubSpotOkHttpClientAsync
import com.hubspot.models.PropertyValue
import com.hubspot.models.marketing.marketingevents.BatchInputMarketingEventCreateRequestParams
import com.hubspot.models.marketing.marketingevents.BatchInputMarketingEventExternalUniqueIdentifier
import com.hubspot.models.marketing.marketingevents.BatchInputMarketingEventPublicObjectIdDeleteRequest
import com.hubspot.models.marketing.marketingevents.BatchInputMarketingEventPublicUpdateRequestFullV2
import com.hubspot.models.marketing.marketingevents.MarketingEventCreateRequestParams
import com.hubspot.models.marketing.marketingevents.MarketingEventDeleteByExternalEventIdParams
import com.hubspot.models.marketing.marketingevents.MarketingEventExternalUniqueIdentifier
import com.hubspot.models.marketing.marketingevents.MarketingEventGetByExternalEventIdParams
import com.hubspot.models.marketing.marketingevents.MarketingEventPublicObjectIdDeleteRequest
import com.hubspot.models.marketing.marketingevents.MarketingEventPublicUpdateRequestFullV2
import com.hubspot.models.marketing.marketingevents.MarketingEventPublicUpdateRequestV2
import com.hubspot.models.marketing.marketingevents.MarketingEventSearchByExternalEventIdParams
import com.hubspot.models.marketing.marketingevents.MarketingEventUpdateByExternalEventIdParams
import com.hubspot.models.marketing.marketingevents.MarketingEventUpdateParams
import com.hubspot.models.marketing.marketingevents.MarketingEventUpdateRequestParams
import com.hubspot.models.marketing.marketingevents.MarketingEventUpsertByExternalEventIdParams
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.parallel.ResourceLock

@WireMockTest
@ResourceLock("https://github.com/wiremock/wiremock/issues/169")
internal class MarketingEventServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val marketingEventServiceAsync = client.marketing().marketingEvents()

        val marketingEventDefaultResponseFuture =
            marketingEventServiceAsync.create(
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
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val marketingEventServiceAsync = client.marketing().marketingEvents()

        val marketingEventPublicDefaultResponseV2Future =
            marketingEventServiceAsync.update(
                MarketingEventUpdateParams.builder()
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
    fun list() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val marketingEventServiceAsync = client.marketing().marketingEvents()

        val pageFuture = marketingEventServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val marketingEventServiceAsync = client.marketing().marketingEvents()

        val future = marketingEventServiceAsync.delete("objectId")

        val response = future.get()
    }

    @Test
    fun deleteBatch(wmRuntimeInfo: WireMockRuntimeInfo) {
        val client =
            HubSpotOkHttpClientAsync.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .accessToken("My Access Token")
                .build()
        val marketingEventServiceAsync = client.marketing().marketingEvents()
        stubFor(post(anyUrl()).willReturn(ok().withBody("abc")))

        val responseFuture =
            marketingEventServiceAsync.deleteBatch(
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
            HubSpotOkHttpClientAsync.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .accessToken("My Access Token")
                .build()
        val marketingEventServiceAsync = client.marketing().marketingEvents()
        stubFor(post(anyUrl()).willReturn(ok().withBody("abc")))

        val responseFuture =
            marketingEventServiceAsync.deleteBatchByExternalEventId(
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
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val marketingEventServiceAsync = client.marketing().marketingEvents()

        val future =
            marketingEventServiceAsync.deleteByExternalEventId(
                MarketingEventDeleteByExternalEventIdParams.builder()
                    .externalEventId("externalEventId")
                    .externalAccountId("externalAccountId")
                    .build()
            )

        val response = future.get()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun get() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val marketingEventServiceAsync = client.marketing().marketingEvents()

        val marketingEventPublicReadResponseV2Future = marketingEventServiceAsync.get("objectId")

        val marketingEventPublicReadResponseV2 = marketingEventPublicReadResponseV2Future.get()
        marketingEventPublicReadResponseV2.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getByExternalEventId() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val marketingEventServiceAsync = client.marketing().marketingEvents()

        val marketingEventPublicReadResponseFuture =
            marketingEventServiceAsync.getByExternalEventId(
                MarketingEventGetByExternalEventIdParams.builder()
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
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val marketingEventServiceAsync = client.marketing().marketingEvents()

        val collectionResponseSearchPublicResponseWrapperNoPagingFuture =
            marketingEventServiceAsync.searchByExternalEventId(
                MarketingEventSearchByExternalEventIdParams.builder().q("q").build()
            )

        val collectionResponseSearchPublicResponseWrapperNoPaging =
            collectionResponseSearchPublicResponseWrapperNoPagingFuture.get()
        collectionResponseSearchPublicResponseWrapperNoPaging.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun searchIdentifiersByExternalEventId() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val marketingEventServiceAsync = client.marketing().marketingEvents()

        val collectionResponseWithTotalMarketingEventIdentifiersResponseFuture =
            marketingEventServiceAsync.searchIdentifiersByExternalEventId("externalEventId")

        val collectionResponseWithTotalMarketingEventIdentifiersResponse =
            collectionResponseWithTotalMarketingEventIdentifiersResponseFuture.get()
        collectionResponseWithTotalMarketingEventIdentifiersResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun updateBatch() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val marketingEventServiceAsync = client.marketing().marketingEvents()

        val batchResponseMarketingEventPublicDefaultResponseV2Future =
            marketingEventServiceAsync.updateBatch(
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
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val marketingEventServiceAsync = client.marketing().marketingEvents()

        val marketingEventPublicDefaultResponseFuture =
            marketingEventServiceAsync.updateByExternalEventId(
                MarketingEventUpdateByExternalEventIdParams.builder()
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
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val marketingEventServiceAsync = client.marketing().marketingEvents()

        val batchResponseMarketingEventPublicDefaultResponseFuture =
            marketingEventServiceAsync.upsertBatch(
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
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val marketingEventServiceAsync = client.marketing().marketingEvents()

        val marketingEventPublicDefaultResponseFuture =
            marketingEventServiceAsync.upsertByExternalEventId(
                MarketingEventUpsertByExternalEventIdParams.builder()
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
}
