// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.marketing.emails

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EmailStatisticsDataTest {

    @Test
    fun create() {
        val emailStatisticsData =
            EmailStatisticsData.builder()
                .counters(
                    EmailStatisticsData.Counters.builder()
                        .putAdditionalProperty("foo", JsonValue.from(0))
                        .build()
                )
                .deviceBreakdown(
                    EmailStatisticsData.DeviceBreakdown.builder()
                        .putAdditionalProperty("foo", JsonValue.from(mapOf("foo" to 0)))
                        .build()
                )
                .qualifierStats(
                    EmailStatisticsData.QualifierStats.builder()
                        .putAdditionalProperty("foo", JsonValue.from(mapOf("foo" to 0)))
                        .build()
                )
                .ratios(
                    EmailStatisticsData.Ratios.builder()
                        .putAdditionalProperty("foo", JsonValue.from(0))
                        .build()
                )
                .build()

        assertThat(emailStatisticsData.counters())
            .isEqualTo(
                EmailStatisticsData.Counters.builder()
                    .putAdditionalProperty("foo", JsonValue.from(0))
                    .build()
            )
        assertThat(emailStatisticsData.deviceBreakdown())
            .isEqualTo(
                EmailStatisticsData.DeviceBreakdown.builder()
                    .putAdditionalProperty("foo", JsonValue.from(mapOf("foo" to 0)))
                    .build()
            )
        assertThat(emailStatisticsData.qualifierStats())
            .isEqualTo(
                EmailStatisticsData.QualifierStats.builder()
                    .putAdditionalProperty("foo", JsonValue.from(mapOf("foo" to 0)))
                    .build()
            )
        assertThat(emailStatisticsData.ratios())
            .isEqualTo(
                EmailStatisticsData.Ratios.builder()
                    .putAdditionalProperty("foo", JsonValue.from(0))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val emailStatisticsData =
            EmailStatisticsData.builder()
                .counters(
                    EmailStatisticsData.Counters.builder()
                        .putAdditionalProperty("foo", JsonValue.from(0))
                        .build()
                )
                .deviceBreakdown(
                    EmailStatisticsData.DeviceBreakdown.builder()
                        .putAdditionalProperty("foo", JsonValue.from(mapOf("foo" to 0)))
                        .build()
                )
                .qualifierStats(
                    EmailStatisticsData.QualifierStats.builder()
                        .putAdditionalProperty("foo", JsonValue.from(mapOf("foo" to 0)))
                        .build()
                )
                .ratios(
                    EmailStatisticsData.Ratios.builder()
                        .putAdditionalProperty("foo", JsonValue.from(0))
                        .build()
                )
                .build()

        val roundtrippedEmailStatisticsData =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(emailStatisticsData),
                jacksonTypeRef<EmailStatisticsData>(),
            )

        assertThat(roundtrippedEmailStatisticsData).isEqualTo(emailStatisticsData)
    }
}
