// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.communicationpreferences

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicWideStatusTest {

    @Test
    fun create() {
        val publicWideStatus =
            PublicWideStatus.builder()
                .channel(PublicWideStatus.Channel.EMAIL)
                .status(PublicWideStatus.Status.NOT_SPECIFIED)
                .subscriberIdString("subscriberIdString")
                .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .wideStatusType(PublicWideStatus.WideStatusType.BUSINESS_UNIT_WIDE)
                .businessUnitId(0L)
                .build()

        assertThat(publicWideStatus.channel()).isEqualTo(PublicWideStatus.Channel.EMAIL)
        assertThat(publicWideStatus.status()).isEqualTo(PublicWideStatus.Status.NOT_SPECIFIED)
        assertThat(publicWideStatus.subscriberIdString()).isEqualTo("subscriberIdString")
        assertThat(publicWideStatus.timestamp())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(publicWideStatus.wideStatusType())
            .isEqualTo(PublicWideStatus.WideStatusType.BUSINESS_UNIT_WIDE)
        assertThat(publicWideStatus.businessUnitId()).contains(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicWideStatus =
            PublicWideStatus.builder()
                .channel(PublicWideStatus.Channel.EMAIL)
                .status(PublicWideStatus.Status.NOT_SPECIFIED)
                .subscriberIdString("subscriberIdString")
                .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .wideStatusType(PublicWideStatus.WideStatusType.BUSINESS_UNIT_WIDE)
                .businessUnitId(0L)
                .build()

        val roundtrippedPublicWideStatus =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicWideStatus),
                jacksonTypeRef<PublicWideStatus>(),
            )

        assertThat(roundtrippedPublicWideStatus).isEqualTo(publicWideStatus)
    }
}
