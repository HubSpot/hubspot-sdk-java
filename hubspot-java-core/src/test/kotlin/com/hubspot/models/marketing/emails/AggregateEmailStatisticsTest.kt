// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.marketing.emails

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.core.JsonValue
import com.hubspot.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AggregateEmailStatisticsTest {

    @Test
    fun create() {
        val aggregateEmailStatistics =
            AggregateEmailStatistics.builder()
                .aggregate(
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
                .campaignAggregations(
                    AggregateEmailStatistics.CampaignAggregations.builder()
                        .putAdditionalProperty(
                            "foo",
                            JsonValue.from(
                                mapOf(
                                    "counters" to mapOf("foo" to 0),
                                    "deviceBreakdown" to mapOf("foo" to mapOf("foo" to 0)),
                                    "qualifierStats" to mapOf("foo" to mapOf("foo" to 0)),
                                    "ratios" to mapOf("foo" to 0),
                                )
                            ),
                        )
                        .build()
                )
                .addEmail(0L)
                .build()

        assertThat(aggregateEmailStatistics.aggregate())
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
        assertThat(aggregateEmailStatistics.campaignAggregations())
            .isEqualTo(
                AggregateEmailStatistics.CampaignAggregations.builder()
                    .putAdditionalProperty(
                        "foo",
                        JsonValue.from(
                            mapOf(
                                "counters" to mapOf("foo" to 0),
                                "deviceBreakdown" to mapOf("foo" to mapOf("foo" to 0)),
                                "qualifierStats" to mapOf("foo" to mapOf("foo" to 0)),
                                "ratios" to mapOf("foo" to 0),
                            )
                        ),
                    )
                    .build()
            )
        assertThat(aggregateEmailStatistics.emails()).containsExactly(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val aggregateEmailStatistics =
            AggregateEmailStatistics.builder()
                .aggregate(
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
                .campaignAggregations(
                    AggregateEmailStatistics.CampaignAggregations.builder()
                        .putAdditionalProperty(
                            "foo",
                            JsonValue.from(
                                mapOf(
                                    "counters" to mapOf("foo" to 0),
                                    "deviceBreakdown" to mapOf("foo" to mapOf("foo" to 0)),
                                    "qualifierStats" to mapOf("foo" to mapOf("foo" to 0)),
                                    "ratios" to mapOf("foo" to 0),
                                )
                            ),
                        )
                        .build()
                )
                .addEmail(0L)
                .build()

        val roundtrippedAggregateEmailStatistics =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(aggregateEmailStatistics),
                jacksonTypeRef<AggregateEmailStatistics>(),
            )

        assertThat(roundtrippedAggregateEmailStatistics).isEqualTo(aggregateEmailStatistics)
    }
}
