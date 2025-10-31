// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.jsonMapper
import com.hubspot_sdk.api.models.ErrorDetail
import com.hubspot_sdk.api.models.StandardError
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BatchResponseSimplePublicUpsertObjectTest {

    @Test
    fun create() {
        val batchResponseSimplePublicUpsertObject =
            BatchResponseSimplePublicUpsertObject.builder()
                .completedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addResult(
                    SimplePublicUpsertObject.builder()
                        .id("id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .new_(true)
                        .properties(
                            SimplePublicUpsertObject.Properties.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .archived(true)
                        .archivedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .objectWriteTraceId("objectWriteTraceId")
                        .propertiesWithHistory(
                            SimplePublicUpsertObject.PropertiesWithHistory.builder()
                                .putAdditionalProperty(
                                    "foo",
                                    JsonValue.from(
                                        listOf(
                                            mapOf(
                                                "sourceType" to "sourceType",
                                                "timestamp" to "2019-12-27T18:11:19.117Z",
                                                "value" to "value",
                                                "sourceId" to "sourceId",
                                                "sourceLabel" to "sourceLabel",
                                                "updatedByUserId" to 0,
                                            )
                                        )
                                    ),
                                )
                                .build()
                        )
                        .build()
                )
                .startedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .status(BatchResponseSimplePublicUpsertObject.Status.PENDING)
                .addError(
                    StandardError.builder()
                        .category("")
                        .context(
                            StandardError.Context.builder()
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
                            StandardError.Links.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .message("")
                        .status("")
                        .id("")
                        .subCategory(JsonValue.from(""))
                        .build()
                )
                .links(
                    BatchResponseSimplePublicUpsertObject.Links.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .numErrors(0)
                .requestedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(batchResponseSimplePublicUpsertObject.completedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(batchResponseSimplePublicUpsertObject.results())
            .containsExactly(
                SimplePublicUpsertObject.builder()
                    .id("id")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .new_(true)
                    .properties(
                        SimplePublicUpsertObject.Properties.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .archived(true)
                    .archivedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .objectWriteTraceId("objectWriteTraceId")
                    .propertiesWithHistory(
                        SimplePublicUpsertObject.PropertiesWithHistory.builder()
                            .putAdditionalProperty(
                                "foo",
                                JsonValue.from(
                                    listOf(
                                        mapOf(
                                            "sourceType" to "sourceType",
                                            "timestamp" to "2019-12-27T18:11:19.117Z",
                                            "value" to "value",
                                            "sourceId" to "sourceId",
                                            "sourceLabel" to "sourceLabel",
                                            "updatedByUserId" to 0,
                                        )
                                    )
                                ),
                            )
                            .build()
                    )
                    .build()
            )
        assertThat(batchResponseSimplePublicUpsertObject.startedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(batchResponseSimplePublicUpsertObject.status())
            .isEqualTo(BatchResponseSimplePublicUpsertObject.Status.PENDING)
        assertThat(batchResponseSimplePublicUpsertObject.errors().getOrNull())
            .containsExactly(
                StandardError.builder()
                    .category("")
                    .context(
                        StandardError.Context.builder()
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
                        StandardError.Links.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .message("")
                    .status("")
                    .id("")
                    .subCategory(JsonValue.from(""))
                    .build()
            )
        assertThat(batchResponseSimplePublicUpsertObject.links())
            .contains(
                BatchResponseSimplePublicUpsertObject.Links.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(batchResponseSimplePublicUpsertObject.numErrors()).contains(0)
        assertThat(batchResponseSimplePublicUpsertObject.requestedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val batchResponseSimplePublicUpsertObject =
            BatchResponseSimplePublicUpsertObject.builder()
                .completedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addResult(
                    SimplePublicUpsertObject.builder()
                        .id("id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .new_(true)
                        .properties(
                            SimplePublicUpsertObject.Properties.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .archived(true)
                        .archivedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .objectWriteTraceId("objectWriteTraceId")
                        .propertiesWithHistory(
                            SimplePublicUpsertObject.PropertiesWithHistory.builder()
                                .putAdditionalProperty(
                                    "foo",
                                    JsonValue.from(
                                        listOf(
                                            mapOf(
                                                "sourceType" to "sourceType",
                                                "timestamp" to "2019-12-27T18:11:19.117Z",
                                                "value" to "value",
                                                "sourceId" to "sourceId",
                                                "sourceLabel" to "sourceLabel",
                                                "updatedByUserId" to 0,
                                            )
                                        )
                                    ),
                                )
                                .build()
                        )
                        .build()
                )
                .startedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .status(BatchResponseSimplePublicUpsertObject.Status.PENDING)
                .addError(
                    StandardError.builder()
                        .category("")
                        .context(
                            StandardError.Context.builder()
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
                            StandardError.Links.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .message("")
                        .status("")
                        .id("")
                        .subCategory(JsonValue.from(""))
                        .build()
                )
                .links(
                    BatchResponseSimplePublicUpsertObject.Links.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .numErrors(0)
                .requestedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedBatchResponseSimplePublicUpsertObject =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(batchResponseSimplePublicUpsertObject),
                jacksonTypeRef<BatchResponseSimplePublicUpsertObject>(),
            )

        assertThat(roundtrippedBatchResponseSimplePublicUpsertObject)
            .isEqualTo(batchResponseSimplePublicUpsertObject)
    }
}
