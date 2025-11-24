// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.marketing.subscriptions.v4

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicWideStatusBulkResponseTest {

    @Test
    fun create() {
        val publicWideStatusBulkResponse =
            PublicWideStatusBulkResponse.builder()
                .subscriberIdString("subscriberIdString")
                .addWideStatus(
                    PublicWideStatus.builder()
                        .channel(PublicWideStatus.Channel.EMAIL)
                        .status(PublicWideStatus.Status.NOT_SPECIFIED)
                        .subscriberIdString("subscriberIdString")
                        .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .wideStatusType(PublicWideStatus.WideStatusType.BUSINESS_UNIT_WIDE)
                        .businessUnitId(0L)
                        .build()
                )
                .build()

        assertThat(publicWideStatusBulkResponse.subscriberIdString())
            .isEqualTo("subscriberIdString")
        assertThat(publicWideStatusBulkResponse.wideStatuses())
            .containsExactly(
                PublicWideStatus.builder()
                    .channel(PublicWideStatus.Channel.EMAIL)
                    .status(PublicWideStatus.Status.NOT_SPECIFIED)
                    .subscriberIdString("subscriberIdString")
                    .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .wideStatusType(PublicWideStatus.WideStatusType.BUSINESS_UNIT_WIDE)
                    .businessUnitId(0L)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicWideStatusBulkResponse =
            PublicWideStatusBulkResponse.builder()
                .subscriberIdString("subscriberIdString")
                .addWideStatus(
                    PublicWideStatus.builder()
                        .channel(PublicWideStatus.Channel.EMAIL)
                        .status(PublicWideStatus.Status.NOT_SPECIFIED)
                        .subscriberIdString("subscriberIdString")
                        .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .wideStatusType(PublicWideStatus.WideStatusType.BUSINESS_UNIT_WIDE)
                        .businessUnitId(0L)
                        .build()
                )
                .build()

        val roundtrippedPublicWideStatusBulkResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicWideStatusBulkResponse),
                jacksonTypeRef<PublicWideStatusBulkResponse>(),
            )

        assertThat(roundtrippedPublicWideStatusBulkResponse).isEqualTo(publicWideStatusBulkResponse)
    }
}
