// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.associations.v4

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.jsonMapper
import com.hubspot_sdk.api.models.ErrorDetail
import com.hubspot_sdk.api.models.crm.LabelsBetweenObjectPair
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
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
                .status(BatchResponseLabelsBetweenObjectPair.Status.PENDING)
                .addError(
                    StandardError1.builder()
                        .category("category")
                        .context(
                            StandardError1.Context.builder()
                                .putAdditionalProperty("foo", JsonValue.from(listOf("string")))
                                .build()
                        )
                        .addError(
                            ErrorDetail.builder()
                                .message("message")
                                .code("code")
                                .context(
                                    ErrorDetail.Context.builder()
                                        .putAdditionalProperty(
                                            "missingScopes",
                                            JsonValue.from(listOf("scope1", "scope2")),
                                        )
                                        .build()
                                )
                                .in_("in")
                                .subCategory("subCategory")
                                .build()
                        )
                        .links(
                            StandardError1.Links.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .message("message")
                        .status("status")
                        .id("id")
                        .subCategory(JsonValue.from(mapOf<String, Any>()))
                        .build()
                )
                .links(
                    BatchResponseLabelsBetweenObjectPair.Links.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .numErrors(0)
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
            .isEqualTo(BatchResponseLabelsBetweenObjectPair.Status.PENDING)
        assertThat(batchResponseLabelsBetweenObjectPair.errors().getOrNull())
            .containsExactly(
                StandardError1.builder()
                    .category("category")
                    .context(
                        StandardError1.Context.builder()
                            .putAdditionalProperty("foo", JsonValue.from(listOf("string")))
                            .build()
                    )
                    .addError(
                        ErrorDetail.builder()
                            .message("message")
                            .code("code")
                            .context(
                                ErrorDetail.Context.builder()
                                    .putAdditionalProperty(
                                        "missingScopes",
                                        JsonValue.from(listOf("scope1", "scope2")),
                                    )
                                    .build()
                            )
                            .in_("in")
                            .subCategory("subCategory")
                            .build()
                    )
                    .links(
                        StandardError1.Links.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .message("message")
                    .status("status")
                    .id("id")
                    .subCategory(JsonValue.from(mapOf<String, Any>()))
                    .build()
            )
        assertThat(batchResponseLabelsBetweenObjectPair.links())
            .contains(
                BatchResponseLabelsBetweenObjectPair.Links.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(batchResponseLabelsBetweenObjectPair.numErrors()).contains(0)
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
                .status(BatchResponseLabelsBetweenObjectPair.Status.PENDING)
                .addError(
                    StandardError1.builder()
                        .category("category")
                        .context(
                            StandardError1.Context.builder()
                                .putAdditionalProperty("foo", JsonValue.from(listOf("string")))
                                .build()
                        )
                        .addError(
                            ErrorDetail.builder()
                                .message("message")
                                .code("code")
                                .context(
                                    ErrorDetail.Context.builder()
                                        .putAdditionalProperty(
                                            "missingScopes",
                                            JsonValue.from(listOf("scope1", "scope2")),
                                        )
                                        .build()
                                )
                                .in_("in")
                                .subCategory("subCategory")
                                .build()
                        )
                        .links(
                            StandardError1.Links.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .message("message")
                        .status("status")
                        .id("id")
                        .subCategory(JsonValue.from(mapOf<String, Any>()))
                        .build()
                )
                .links(
                    BatchResponseLabelsBetweenObjectPair.Links.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .numErrors(0)
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
