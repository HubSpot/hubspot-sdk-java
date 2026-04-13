// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.blocking.marketing

import com.github.tomakehurst.wiremock.client.WireMock.anyUrl
import com.github.tomakehurst.wiremock.client.WireMock.ok
import com.github.tomakehurst.wiremock.client.WireMock.post
import com.github.tomakehurst.wiremock.client.WireMock.stubFor
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import com.hubspot.sdk.client.okhttp.HubSpotOkHttpClient
import com.hubspot.sdk.models.PropertyValue
import com.hubspot.sdk.models.marketing.marketingevents.BatchInputMarketingEventCreateRequestParams
import com.hubspot.sdk.models.marketing.marketingevents.BatchInputMarketingEventExternalUniqueIdentifier
import com.hubspot.sdk.models.marketing.marketingevents.BatchInputMarketingEventPublicObjectIdDeleteRequest
import com.hubspot.sdk.models.marketing.marketingevents.BatchInputMarketingEventPublicUpdateRequestFullV2
import com.hubspot.sdk.models.marketing.marketingevents.MarketingEventCreateRequestParams
import com.hubspot.sdk.models.marketing.marketingevents.MarketingEventDeleteByExternalEventIdParams
import com.hubspot.sdk.models.marketing.marketingevents.MarketingEventExternalUniqueIdentifier
import com.hubspot.sdk.models.marketing.marketingevents.MarketingEventGetByExternalEventIdParams
import com.hubspot.sdk.models.marketing.marketingevents.MarketingEventPublicObjectIdDeleteRequest
import com.hubspot.sdk.models.marketing.marketingevents.MarketingEventPublicUpdateRequestFullV2
import com.hubspot.sdk.models.marketing.marketingevents.MarketingEventPublicUpdateRequestV2
import com.hubspot.sdk.models.marketing.marketingevents.MarketingEventSearchByExternalEventIdParams
import com.hubspot.sdk.models.marketing.marketingevents.MarketingEventUpdateByExternalEventIdParams
import com.hubspot.sdk.models.marketing.marketingevents.MarketingEventUpdateParams
import com.hubspot.sdk.models.marketing.marketingevents.MarketingEventUpdateRequestParams
import com.hubspot.sdk.models.marketing.marketingevents.MarketingEventUpsertByExternalEventIdParams
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.parallel.ResourceLock

@WireMockTest
@ResourceLock("https://github.com/wiremock/wiremock/issues/169")
internal class MarketingEventServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val marketingEventService = client.marketing().marketingEvents()

        val marketingEventDefaultResponse =
            marketingEventService.create(
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

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val marketingEventService = client.marketing().marketingEvents()

        val marketingEventPublicDefaultResponseV2 =
            marketingEventService.update(
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

        marketingEventPublicDefaultResponseV2.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val marketingEventService = client.marketing().marketingEvents()

        val page = marketingEventService.list()

        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val marketingEventService = client.marketing().marketingEvents()

        marketingEventService.delete("objectId")
    }

    @Test
    fun deleteBatch(wmRuntimeInfo: WireMockRuntimeInfo) {
        val client =
            HubSpotOkHttpClient.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .accessToken("My Access Token")
                .build()
        val marketingEventService = client.marketing().marketingEvents()
        stubFor(post(anyUrl()).willReturn(ok().withBody("abc")))

        val response =
            marketingEventService.deleteBatch(
                BatchInputMarketingEventPublicObjectIdDeleteRequest.builder()
                    .addInput(
                        MarketingEventPublicObjectIdDeleteRequest.builder()
                            .objectId("objectId")
                            .build()
                    )
                    .build()
            )

        assertThat(response.body()).hasContent("abc")
    }

    @Test
    fun deleteBatchByExternalEventId(wmRuntimeInfo: WireMockRuntimeInfo) {
        val client =
            HubSpotOkHttpClient.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .accessToken("My Access Token")
                .build()
        val marketingEventService = client.marketing().marketingEvents()
        stubFor(post(anyUrl()).willReturn(ok().withBody("abc")))

        val response =
            marketingEventService.deleteBatchByExternalEventId(
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

    @Disabled("Mock server tests are disabled")
    @Test
    fun deleteByExternalEventId() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val marketingEventService = client.marketing().marketingEvents()

        marketingEventService.deleteByExternalEventId(
            MarketingEventDeleteByExternalEventIdParams.builder()
                .externalEventId("externalEventId")
                .externalAccountId("externalAccountId")
                .build()
        )
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun get() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val marketingEventService = client.marketing().marketingEvents()

        val marketingEventPublicReadResponseV2 = marketingEventService.get("objectId")

        marketingEventPublicReadResponseV2.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getByExternalEventId() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val marketingEventService = client.marketing().marketingEvents()

        val marketingEventPublicReadResponse =
            marketingEventService.getByExternalEventId(
                MarketingEventGetByExternalEventIdParams.builder()
                    .externalEventId("externalEventId")
                    .externalAccountId("externalAccountId")
                    .build()
            )

        marketingEventPublicReadResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun searchByExternalEventId() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val marketingEventService = client.marketing().marketingEvents()

        val collectionResponseSearchPublicResponseWrapperNoPaging =
            marketingEventService.searchByExternalEventId(
                MarketingEventSearchByExternalEventIdParams.builder().q("q").build()
            )

        collectionResponseSearchPublicResponseWrapperNoPaging.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun searchIdentifiersByExternalEventId() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val marketingEventService = client.marketing().marketingEvents()

        val collectionResponseWithTotalMarketingEventIdentifiersResponse =
            marketingEventService.searchIdentifiersByExternalEventId("externalEventId")

        collectionResponseWithTotalMarketingEventIdentifiersResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun updateBatch() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val marketingEventService = client.marketing().marketingEvents()

        val batchResponseMarketingEventPublicDefaultResponseV2 =
            marketingEventService.updateBatch(
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

    @Disabled("Mock server tests are disabled")
    @Test
    fun updateByExternalEventId() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val marketingEventService = client.marketing().marketingEvents()

        val marketingEventPublicDefaultResponse =
            marketingEventService.updateByExternalEventId(
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

        marketingEventPublicDefaultResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun upsertBatch() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val marketingEventService = client.marketing().marketingEvents()

        val batchResponseMarketingEventPublicDefaultResponse =
            marketingEventService.upsertBatch(
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

    @Disabled("Mock server tests are disabled")
    @Test
    fun upsertByExternalEventId() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val marketingEventService = client.marketing().marketingEvents()

        val marketingEventPublicDefaultResponse =
            marketingEventService.upsertByExternalEventId(
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

        marketingEventPublicDefaultResponse.validate()
    }
}
