// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.jsonMapper
import com.hubspot_sdk.api.models.NextPage
import com.hubspot_sdk.api.models.PreviousPage
import com.hubspot_sdk.api.models.marketing.emails.EmailsPaging
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CollectionResponseWithTotalSimplePublicObjectTest {

    @Test
    fun create() {
        val collectionResponseWithTotalSimplePublicObject =
            CollectionResponseWithTotalSimplePublicObject.builder()
                .addResult(
                    SimplePublicObject.builder()
                        .id("512")
                        .createdAt(OffsetDateTime.parse("2019-10-30T03:30:17.883Z"))
                        .properties(
                            SimplePublicObject.Properties.builder()
                                .putAdditionalProperty("property_checkbox", JsonValue.from("false"))
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
                                .putAdditionalProperty("property_radio", JsonValue.from("option_1"))
                                .putAdditionalProperty("property_string", JsonValue.from("value"))
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
                .total(0)
                .paging(
                    EmailsPaging.builder()
                        .next(NextPage.builder().after("").link("").build())
                        .prev(PreviousPage.builder().before("before").link("link").build())
                        .build()
                )
                .build()

        assertThat(collectionResponseWithTotalSimplePublicObject.results())
            .containsExactly(
                SimplePublicObject.builder()
                    .id("512")
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
        assertThat(collectionResponseWithTotalSimplePublicObject.total()).isEqualTo(0)
        assertThat(collectionResponseWithTotalSimplePublicObject.paging())
            .contains(
                EmailsPaging.builder()
                    .next(NextPage.builder().after("").link("").build())
                    .prev(PreviousPage.builder().before("before").link("link").build())
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val collectionResponseWithTotalSimplePublicObject =
            CollectionResponseWithTotalSimplePublicObject.builder()
                .addResult(
                    SimplePublicObject.builder()
                        .id("512")
                        .createdAt(OffsetDateTime.parse("2019-10-30T03:30:17.883Z"))
                        .properties(
                            SimplePublicObject.Properties.builder()
                                .putAdditionalProperty("property_checkbox", JsonValue.from("false"))
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
                                .putAdditionalProperty("property_radio", JsonValue.from("option_1"))
                                .putAdditionalProperty("property_string", JsonValue.from("value"))
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
                .total(0)
                .paging(
                    EmailsPaging.builder()
                        .next(NextPage.builder().after("").link("").build())
                        .prev(PreviousPage.builder().before("before").link("link").build())
                        .build()
                )
                .build()

        val roundtrippedCollectionResponseWithTotalSimplePublicObject =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(collectionResponseWithTotalSimplePublicObject),
                jacksonTypeRef<CollectionResponseWithTotalSimplePublicObject>(),
            )

        assertThat(roundtrippedCollectionResponseWithTotalSimplePublicObject)
            .isEqualTo(collectionResponseWithTotalSimplePublicObject)
    }
}
