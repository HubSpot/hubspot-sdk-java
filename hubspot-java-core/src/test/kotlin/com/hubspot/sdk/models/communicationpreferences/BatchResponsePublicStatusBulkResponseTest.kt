// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.communicationpreferences

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.JsonValue
import com.hubspot.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BatchResponsePublicStatusBulkResponseTest {

    @Test
    fun create() {
        val batchResponsePublicStatusBulkResponse =
            BatchResponsePublicStatusBulkResponse.builder()
                .completedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addResult(
                    PublicStatusBulkResponse.builder()
                        .addStatus(
                            PublicStatus.builder()
                                .channel(PublicStatus.Channel.EMAIL)
                                .source("source")
                                .status(PublicStatus.Status.NOT_SPECIFIED)
                                .subscriberIdString("subscriberIdString")
                                .subscriptionId(0)
                                .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .businessUnitId(0L)
                                .legalBasis(PublicStatus.LegalBasis.CONSENT_WITH_NOTICE)
                                .legalBasisExplanation("legalBasisExplanation")
                                .setStatusSuccessReason(
                                    PublicStatus.SetStatusSuccessReason.NO_STATUS_CHANGE
                                )
                                .subscriptionName("subscriptionName")
                                .build()
                        )
                        .subscriberIdString("subscriberIdString")
                        .build()
                )
                .startedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .status(BatchResponsePublicStatusBulkResponse.Status.CANCELED)
                .links(
                    BatchResponsePublicStatusBulkResponse.Links.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .requestedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(batchResponsePublicStatusBulkResponse.completedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(batchResponsePublicStatusBulkResponse.results())
            .containsExactly(
                PublicStatusBulkResponse.builder()
                    .addStatus(
                        PublicStatus.builder()
                            .channel(PublicStatus.Channel.EMAIL)
                            .source("source")
                            .status(PublicStatus.Status.NOT_SPECIFIED)
                            .subscriberIdString("subscriberIdString")
                            .subscriptionId(0)
                            .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .businessUnitId(0L)
                            .legalBasis(PublicStatus.LegalBasis.CONSENT_WITH_NOTICE)
                            .legalBasisExplanation("legalBasisExplanation")
                            .setStatusSuccessReason(
                                PublicStatus.SetStatusSuccessReason.NO_STATUS_CHANGE
                            )
                            .subscriptionName("subscriptionName")
                            .build()
                    )
                    .subscriberIdString("subscriberIdString")
                    .build()
            )
        assertThat(batchResponsePublicStatusBulkResponse.startedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(batchResponsePublicStatusBulkResponse.status())
            .isEqualTo(BatchResponsePublicStatusBulkResponse.Status.CANCELED)
        assertThat(batchResponsePublicStatusBulkResponse.links())
            .contains(
                BatchResponsePublicStatusBulkResponse.Links.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(batchResponsePublicStatusBulkResponse.requestedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val batchResponsePublicStatusBulkResponse =
            BatchResponsePublicStatusBulkResponse.builder()
                .completedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addResult(
                    PublicStatusBulkResponse.builder()
                        .addStatus(
                            PublicStatus.builder()
                                .channel(PublicStatus.Channel.EMAIL)
                                .source("source")
                                .status(PublicStatus.Status.NOT_SPECIFIED)
                                .subscriberIdString("subscriberIdString")
                                .subscriptionId(0)
                                .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .businessUnitId(0L)
                                .legalBasis(PublicStatus.LegalBasis.CONSENT_WITH_NOTICE)
                                .legalBasisExplanation("legalBasisExplanation")
                                .setStatusSuccessReason(
                                    PublicStatus.SetStatusSuccessReason.NO_STATUS_CHANGE
                                )
                                .subscriptionName("subscriptionName")
                                .build()
                        )
                        .subscriberIdString("subscriberIdString")
                        .build()
                )
                .startedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .status(BatchResponsePublicStatusBulkResponse.Status.CANCELED)
                .links(
                    BatchResponsePublicStatusBulkResponse.Links.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .requestedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedBatchResponsePublicStatusBulkResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(batchResponsePublicStatusBulkResponse),
                jacksonTypeRef<BatchResponsePublicStatusBulkResponse>(),
            )

        assertThat(roundtrippedBatchResponsePublicStatusBulkResponse)
            .isEqualTo(batchResponsePublicStatusBulkResponse)
    }
}
