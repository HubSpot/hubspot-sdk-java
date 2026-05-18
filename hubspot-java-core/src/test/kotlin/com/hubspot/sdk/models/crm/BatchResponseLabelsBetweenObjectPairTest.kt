// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.crm

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.JsonValue
import com.hubspot.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BatchResponseLabelsBetweenObjectPairTest {

    @Test
    fun create() {
        val batchResponseLabelsBetweenObjectPair =
            BatchResponseLabelsBetweenObjectPair.builder()
                .completedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addResult(
                    LabelsBetweenObjectPair.builder()
                        .fromObjectId("fromObjectId")
                        .fromObjectTypeId("fromObjectTypeId")
                        .addLabel("string")
                        .toObjectId("toObjectId")
                        .toObjectTypeId("toObjectTypeId")
                        .build()
                )
                .startedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .status(BatchResponseLabelsBetweenObjectPair.Status.CANCELED)
                .links(
                    BatchResponseLabelsBetweenObjectPair.Links.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .requestedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(batchResponseLabelsBetweenObjectPair.completedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(batchResponseLabelsBetweenObjectPair.results())
            .containsExactly(
                LabelsBetweenObjectPair.builder()
                    .fromObjectId("fromObjectId")
                    .fromObjectTypeId("fromObjectTypeId")
                    .addLabel("string")
                    .toObjectId("toObjectId")
                    .toObjectTypeId("toObjectTypeId")
                    .build()
            )
        assertThat(batchResponseLabelsBetweenObjectPair.startedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(batchResponseLabelsBetweenObjectPair.status())
            .isEqualTo(BatchResponseLabelsBetweenObjectPair.Status.CANCELED)
        assertThat(batchResponseLabelsBetweenObjectPair.links())
            .contains(
                BatchResponseLabelsBetweenObjectPair.Links.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(batchResponseLabelsBetweenObjectPair.requestedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val batchResponseLabelsBetweenObjectPair =
            BatchResponseLabelsBetweenObjectPair.builder()
                .completedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addResult(
                    LabelsBetweenObjectPair.builder()
                        .fromObjectId("fromObjectId")
                        .fromObjectTypeId("fromObjectTypeId")
                        .addLabel("string")
                        .toObjectId("toObjectId")
                        .toObjectTypeId("toObjectTypeId")
                        .build()
                )
                .startedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .status(BatchResponseLabelsBetweenObjectPair.Status.CANCELED)
                .links(
                    BatchResponseLabelsBetweenObjectPair.Links.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .requestedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedBatchResponseLabelsBetweenObjectPair =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(batchResponseLabelsBetweenObjectPair),
                jacksonTypeRef<BatchResponseLabelsBetweenObjectPair>(),
            )

        assertThat(roundtrippedBatchResponseLabelsBetweenObjectPair)
            .isEqualTo(batchResponseLabelsBetweenObjectPair)
    }
}
