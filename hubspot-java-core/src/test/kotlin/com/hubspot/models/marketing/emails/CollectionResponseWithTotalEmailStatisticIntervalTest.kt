// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.marketing.emails

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.core.JsonValue
import com.hubspot.core.jsonMapper
import com.hubspot.models.NextPage
import com.hubspot.models.Paging
import com.hubspot.models.PreviousPage
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CollectionResponseWithTotalEmailStatisticIntervalTest {

    @Test
    fun create() {
        val collectionResponseWithTotalEmailStatisticInterval =
            CollectionResponseWithTotalEmailStatisticInterval.builder()
                .addResult(
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
                                        .putAdditionalProperty(
                                            "foo",
                                            JsonValue.from(mapOf("foo" to 0)),
                                        )
                                        .build()
                                )
                                .qualifierStats(
                                    EmailStatisticsData.QualifierStats.builder()
                                        .putAdditionalProperty(
                                            "foo",
                                            JsonValue.from(mapOf("foo" to 0)),
                                        )
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
                )
                .total(0)
                .paging(
                    Paging.builder()
                        .next(NextPage.builder().after("after").link("link").build())
                        .prev(PreviousPage.builder().before("before").link("link").build())
                        .build()
                )
                .build()

        assertThat(collectionResponseWithTotalEmailStatisticInterval.results())
            .containsExactly(
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
            )
        assertThat(collectionResponseWithTotalEmailStatisticInterval.total()).isEqualTo(0)
        assertThat(collectionResponseWithTotalEmailStatisticInterval.paging())
            .contains(
                Paging.builder()
                    .next(NextPage.builder().after("after").link("link").build())
                    .prev(PreviousPage.builder().before("before").link("link").build())
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val collectionResponseWithTotalEmailStatisticInterval =
            CollectionResponseWithTotalEmailStatisticInterval.builder()
                .addResult(
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
                                        .putAdditionalProperty(
                                            "foo",
                                            JsonValue.from(mapOf("foo" to 0)),
                                        )
                                        .build()
                                )
                                .qualifierStats(
                                    EmailStatisticsData.QualifierStats.builder()
                                        .putAdditionalProperty(
                                            "foo",
                                            JsonValue.from(mapOf("foo" to 0)),
                                        )
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
                )
                .total(0)
                .paging(
                    Paging.builder()
                        .next(NextPage.builder().after("after").link("link").build())
                        .prev(PreviousPage.builder().before("before").link("link").build())
                        .build()
                )
                .build()

        val roundtrippedCollectionResponseWithTotalEmailStatisticInterval =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(collectionResponseWithTotalEmailStatisticInterval),
                jacksonTypeRef<CollectionResponseWithTotalEmailStatisticInterval>(),
            )

        assertThat(roundtrippedCollectionResponseWithTotalEmailStatisticInterval)
            .isEqualTo(collectionResponseWithTotalEmailStatisticInterval)
    }
}
