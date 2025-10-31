// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.objects.appointments

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SimplePublicObjectTest {

    @Test
    fun create() {
        val simplePublicObject =
            SimplePublicObject.builder()
                .id("512")
                .archived(false)
                .createdAt(OffsetDateTime.parse("2019-10-30T03:30:17.883Z"))
                .properties(
                    SimplePublicObject.Properties.builder()
                        .putAdditionalProperty("property_checkbox", JsonValue.from("false"))
                        .putAdditionalProperty("property_date", JsonValue.from("1572480000000"))
                        .putAdditionalProperty("property_dropdown", JsonValue.from("choice_b"))
                        .putAdditionalProperty(
                            "property_multiple_checkboxes",
                            JsonValue.from("chocolate;strawberry"),
                        )
                        .putAdditionalProperty("property_number", JsonValue.from("17"))
                        .putAdditionalProperty("property_radio", JsonValue.from("option_1"))
                        .putAdditionalProperty("property_string", JsonValue.from("value"))
                        .build()
                )
                .updatedAt(OffsetDateTime.parse("2019-12-07T16:50:06.678Z"))
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
                .url("url")
                .build()

        assertThat(simplePublicObject.id()).isEqualTo("512")
        assertThat(simplePublicObject.archived()).isEqualTo(false)
        assertThat(simplePublicObject.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-10-30T03:30:17.883Z"))
        assertThat(simplePublicObject.properties())
            .isEqualTo(
                SimplePublicObject.Properties.builder()
                    .putAdditionalProperty("property_checkbox", JsonValue.from("false"))
                    .putAdditionalProperty("property_date", JsonValue.from("1572480000000"))
                    .putAdditionalProperty("property_dropdown", JsonValue.from("choice_b"))
                    .putAdditionalProperty(
                        "property_multiple_checkboxes",
                        JsonValue.from("chocolate;strawberry"),
                    )
                    .putAdditionalProperty("property_number", JsonValue.from("17"))
                    .putAdditionalProperty("property_radio", JsonValue.from("option_1"))
                    .putAdditionalProperty("property_string", JsonValue.from("value"))
                    .build()
            )
        assertThat(simplePublicObject.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-07T16:50:06.678Z"))
        assertThat(simplePublicObject.archivedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(simplePublicObject.objectWriteTraceId()).contains("objectWriteTraceId")
        assertThat(simplePublicObject.propertiesWithHistory())
            .contains(
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
        assertThat(simplePublicObject.url()).contains("url")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val simplePublicObject =
            SimplePublicObject.builder()
                .id("512")
                .archived(false)
                .createdAt(OffsetDateTime.parse("2019-10-30T03:30:17.883Z"))
                .properties(
                    SimplePublicObject.Properties.builder()
                        .putAdditionalProperty("property_checkbox", JsonValue.from("false"))
                        .putAdditionalProperty("property_date", JsonValue.from("1572480000000"))
                        .putAdditionalProperty("property_dropdown", JsonValue.from("choice_b"))
                        .putAdditionalProperty(
                            "property_multiple_checkboxes",
                            JsonValue.from("chocolate;strawberry"),
                        )
                        .putAdditionalProperty("property_number", JsonValue.from("17"))
                        .putAdditionalProperty("property_radio", JsonValue.from("option_1"))
                        .putAdditionalProperty("property_string", JsonValue.from("value"))
                        .build()
                )
                .updatedAt(OffsetDateTime.parse("2019-12-07T16:50:06.678Z"))
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
                .url("url")
                .build()

        val roundtrippedSimplePublicObject =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(simplePublicObject),
                jacksonTypeRef<SimplePublicObject>(),
            )

        assertThat(roundtrippedSimplePublicObject).isEqualTo(simplePublicObject)
    }
}
