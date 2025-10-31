// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.objects.dealsplits

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.jsonMapper
import com.hubspot_sdk.api.models.ErrorDetail
import com.hubspot_sdk.api.models.StandardError
import com.hubspot_sdk.api.models.crm.SimplePublicObject
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BatchResponseDealToDealSplitsWithErrorsTest {

    @Test
    fun create() {
        val batchResponseDealToDealSplitsWithErrors =
            BatchResponseDealToDealSplitsWithErrors.builder()
                .completedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addResult(
                    DealToDealSplits.builder()
                        .id("id")
                        .addSplit(
                            SimplePublicObject.builder()
                                .id("512")
                                .createdAt(OffsetDateTime.parse("2019-10-30T03:30:17.883Z"))
                                .properties(
                                    SimplePublicObject.Properties.builder()
                                        .putAdditionalProperty(
                                            "property_checkbox",
                                            JsonValue.from("false"),
                                        )
                                        .putAdditionalProperty(
                                            "property_date",
                                            JsonValue.from("1572480000000"),
                                        )
                                        .putAdditionalProperty(
                                            "property_dropdown",
                                            JsonValue.from("choice_b"),
                                        )
                                        .putAdditionalProperty(
                                            "property_multiple_checkboxes",
                                            JsonValue.from("chocolate;strawberry"),
                                        )
                                        .putAdditionalProperty(
                                            "property_number",
                                            JsonValue.from("17"),
                                        )
                                        .putAdditionalProperty(
                                            "property_radio",
                                            JsonValue.from("option_1"),
                                        )
                                        .putAdditionalProperty(
                                            "property_string",
                                            JsonValue.from("value"),
                                        )
                                        .build()
                                )
                                .updatedAt(OffsetDateTime.parse("2019-12-07T16:50:06.678Z"))
                                .archived(false)
                                .archivedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .objectWriteTraceId("objectWriteTraceId")
                                .propertiesWithHistory(
                                    SimplePublicObject.PropertiesWithHistory.builder()
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
                        .build()
                )
                .startedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .status(BatchResponseDealToDealSplitsWithErrors.Status.PENDING)
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
                    BatchResponseDealToDealSplitsWithErrors.Links.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .numErrors(0)
                .requestedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(batchResponseDealToDealSplitsWithErrors.completedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(batchResponseDealToDealSplitsWithErrors.results())
            .containsExactly(
                DealToDealSplits.builder()
                    .id("id")
                    .addSplit(
                        SimplePublicObject.builder()
                            .id("512")
                            .createdAt(OffsetDateTime.parse("2019-10-30T03:30:17.883Z"))
                            .properties(
                                SimplePublicObject.Properties.builder()
                                    .putAdditionalProperty(
                                        "property_checkbox",
                                        JsonValue.from("false"),
                                    )
                                    .putAdditionalProperty(
                                        "property_date",
                                        JsonValue.from("1572480000000"),
                                    )
                                    .putAdditionalProperty(
                                        "property_dropdown",
                                        JsonValue.from("choice_b"),
                                    )
                                    .putAdditionalProperty(
                                        "property_multiple_checkboxes",
                                        JsonValue.from("chocolate;strawberry"),
                                    )
                                    .putAdditionalProperty("property_number", JsonValue.from("17"))
                                    .putAdditionalProperty(
                                        "property_radio",
                                        JsonValue.from("option_1"),
                                    )
                                    .putAdditionalProperty(
                                        "property_string",
                                        JsonValue.from("value"),
                                    )
                                    .build()
                            )
                            .updatedAt(OffsetDateTime.parse("2019-12-07T16:50:06.678Z"))
                            .archived(false)
                            .archivedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .objectWriteTraceId("objectWriteTraceId")
                            .propertiesWithHistory(
                                SimplePublicObject.PropertiesWithHistory.builder()
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
                    .build()
            )
        assertThat(batchResponseDealToDealSplitsWithErrors.startedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(batchResponseDealToDealSplitsWithErrors.status())
            .isEqualTo(BatchResponseDealToDealSplitsWithErrors.Status.PENDING)
        assertThat(batchResponseDealToDealSplitsWithErrors.errors().getOrNull())
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
        assertThat(batchResponseDealToDealSplitsWithErrors.links())
            .contains(
                BatchResponseDealToDealSplitsWithErrors.Links.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(batchResponseDealToDealSplitsWithErrors.numErrors()).contains(0)
        assertThat(batchResponseDealToDealSplitsWithErrors.requestedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val batchResponseDealToDealSplitsWithErrors =
            BatchResponseDealToDealSplitsWithErrors.builder()
                .completedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addResult(
                    DealToDealSplits.builder()
                        .id("id")
                        .addSplit(
                            SimplePublicObject.builder()
                                .id("512")
                                .createdAt(OffsetDateTime.parse("2019-10-30T03:30:17.883Z"))
                                .properties(
                                    SimplePublicObject.Properties.builder()
                                        .putAdditionalProperty(
                                            "property_checkbox",
                                            JsonValue.from("false"),
                                        )
                                        .putAdditionalProperty(
                                            "property_date",
                                            JsonValue.from("1572480000000"),
                                        )
                                        .putAdditionalProperty(
                                            "property_dropdown",
                                            JsonValue.from("choice_b"),
                                        )
                                        .putAdditionalProperty(
                                            "property_multiple_checkboxes",
                                            JsonValue.from("chocolate;strawberry"),
                                        )
                                        .putAdditionalProperty(
                                            "property_number",
                                            JsonValue.from("17"),
                                        )
                                        .putAdditionalProperty(
                                            "property_radio",
                                            JsonValue.from("option_1"),
                                        )
                                        .putAdditionalProperty(
                                            "property_string",
                                            JsonValue.from("value"),
                                        )
                                        .build()
                                )
                                .updatedAt(OffsetDateTime.parse("2019-12-07T16:50:06.678Z"))
                                .archived(false)
                                .archivedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .objectWriteTraceId("objectWriteTraceId")
                                .propertiesWithHistory(
                                    SimplePublicObject.PropertiesWithHistory.builder()
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
                        .build()
                )
                .startedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .status(BatchResponseDealToDealSplitsWithErrors.Status.PENDING)
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
                    BatchResponseDealToDealSplitsWithErrors.Links.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .numErrors(0)
                .requestedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedBatchResponseDealToDealSplitsWithErrors =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(batchResponseDealToDealSplitsWithErrors),
                jacksonTypeRef<BatchResponseDealToDealSplitsWithErrors>(),
            )

        assertThat(roundtrippedBatchResponseDealToDealSplitsWithErrors)
            .isEqualTo(batchResponseDealToDealSplitsWithErrors)
    }
}
