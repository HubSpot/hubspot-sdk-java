// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.objects.dealsplits

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.jsonMapper
import com.hubspot_sdk.api.models.crm.SimplePublicObject
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DealSplitBatchUpsertResponseTest {

    @Test
    fun create() {
        val dealSplitBatchUpsertResponse =
            DealSplitBatchUpsertResponse.builder()
                .completedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addResult(
                    DealSplitBatchUpsertResponse.Result.builder()
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
                .status(DealSplitBatchUpsertResponse.Status.PENDING)
                .links(
                    DealSplitBatchUpsertResponse.Links.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .requestedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(dealSplitBatchUpsertResponse.completedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(dealSplitBatchUpsertResponse.results())
            .containsExactly(
                DealSplitBatchUpsertResponse.Result.builder()
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
        assertThat(dealSplitBatchUpsertResponse.startedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(dealSplitBatchUpsertResponse.status())
            .isEqualTo(DealSplitBatchUpsertResponse.Status.PENDING)
        assertThat(dealSplitBatchUpsertResponse.links())
            .contains(
                DealSplitBatchUpsertResponse.Links.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(dealSplitBatchUpsertResponse.requestedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val dealSplitBatchUpsertResponse =
            DealSplitBatchUpsertResponse.builder()
                .completedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addResult(
                    DealSplitBatchUpsertResponse.Result.builder()
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
                .status(DealSplitBatchUpsertResponse.Status.PENDING)
                .links(
                    DealSplitBatchUpsertResponse.Links.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .requestedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedDealSplitBatchUpsertResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(dealSplitBatchUpsertResponse),
                jacksonTypeRef<DealSplitBatchUpsertResponse>(),
            )

        assertThat(roundtrippedDealSplitBatchUpsertResponse).isEqualTo(dealSplitBatchUpsertResponse)
    }
}
