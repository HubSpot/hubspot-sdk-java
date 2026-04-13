// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.marketing.emails

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.core.JsonValue
import com.hubspot.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EmailStatisticIntervalTest {

    @Test
    fun create() {
        val emailStatisticInterval =
            EmailStatisticInterval.builder()
                .aggregations(
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
                )
                .interval(
                    Interval.builder()
                        .end(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .start(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .build()

        assertThat(emailStatisticInterval.aggregations())
            .isEqualTo(
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
            )
        assertThat(emailStatisticInterval.interval())
            .isEqualTo(
                Interval.builder()
                    .end(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .start(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val emailStatisticInterval =
            EmailStatisticInterval.builder()
                .aggregations(
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
                )
                .interval(
                    Interval.builder()
                        .end(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .start(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .build()

        val roundtrippedEmailStatisticInterval =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(emailStatisticInterval),
                jacksonTypeRef<EmailStatisticInterval>(),
            )

        assertThat(roundtrippedEmailStatisticInterval).isEqualTo(emailStatisticInterval)
    }
}
