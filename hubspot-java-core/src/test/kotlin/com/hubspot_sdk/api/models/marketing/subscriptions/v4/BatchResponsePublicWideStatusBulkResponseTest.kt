// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.marketing.subscriptions.v4

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BatchResponsePublicWideStatusBulkResponseTest {

    @Test
    fun create() {
        val batchResponsePublicWideStatusBulkResponse =
            BatchResponsePublicWideStatusBulkResponse.builder()
                .completedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addResult(
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
                )
                .startedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .status(BatchResponsePublicWideStatusBulkResponse.Status.CANCELED)
                .links(
                    BatchResponsePublicWideStatusBulkResponse.Links.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .requestedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(batchResponsePublicWideStatusBulkResponse.completedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(batchResponsePublicWideStatusBulkResponse.results())
            .containsExactly(
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
            )
        assertThat(batchResponsePublicWideStatusBulkResponse.startedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(batchResponsePublicWideStatusBulkResponse.status())
            .isEqualTo(BatchResponsePublicWideStatusBulkResponse.Status.CANCELED)
        assertThat(batchResponsePublicWideStatusBulkResponse.links())
            .contains(
                BatchResponsePublicWideStatusBulkResponse.Links.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(batchResponsePublicWideStatusBulkResponse.requestedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val batchResponsePublicWideStatusBulkResponse =
            BatchResponsePublicWideStatusBulkResponse.builder()
                .completedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addResult(
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
                )
                .startedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .status(BatchResponsePublicWideStatusBulkResponse.Status.CANCELED)
                .links(
                    BatchResponsePublicWideStatusBulkResponse.Links.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .requestedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedBatchResponsePublicWideStatusBulkResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(batchResponsePublicWideStatusBulkResponse),
                jacksonTypeRef<BatchResponsePublicWideStatusBulkResponse>(),
            )

        assertThat(roundtrippedBatchResponsePublicWideStatusBulkResponse)
            .isEqualTo(batchResponsePublicWideStatusBulkResponse)
    }
}
