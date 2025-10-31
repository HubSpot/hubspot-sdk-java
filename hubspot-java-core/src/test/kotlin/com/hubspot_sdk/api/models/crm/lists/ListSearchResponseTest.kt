// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.lists

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ListSearchResponseTest {

    @Test
    fun create() {
        val listSearchResponse =
            ListSearchResponse.builder()
                .hasMore(false)
                .addList(
                    PublicObjectListSearchResult.builder()
                        .additionalProperties(
                            PublicObjectListSearchResult.AdditionalProperties.builder()
                                .putAdditionalProperty(
                                    "hs_last_record_added_at",
                                    JsonValue.from("1695938616824"),
                                )
                                .putAdditionalProperty(
                                    "hs_list_reference_count",
                                    JsonValue.from("0"),
                                )
                                .putAdditionalProperty("hs_list_size", JsonValue.from("59"))
                                .putAdditionalProperty(
                                    "hs_list_size_week_delta",
                                    JsonValue.from("-10"),
                                )
                                .build()
                        )
                        .listId("123")
                        .listVersion(1)
                        .name("Test list")
                        .objectTypeId("0-1")
                        .processingStatus("COMPLETE")
                        .processingType("SNAPSHOT")
                        .createdAt(OffsetDateTime.parse("2023-09-28T22:03:17.998Z"))
                        .createdById("1")
                        .deletedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .filtersUpdatedAt(OffsetDateTime.parse("2023-09-28T22:03:17.998Z"))
                        .updatedAt(OffsetDateTime.parse("2023-09-28T22:03:37.005Z"))
                        .updatedById("1")
                        .build()
                )
                .offset(1)
                .total(1)
                .build()

        assertThat(listSearchResponse.hasMore()).isEqualTo(false)
        assertThat(listSearchResponse.lists())
            .containsExactly(
                PublicObjectListSearchResult.builder()
                    .additionalProperties(
                        PublicObjectListSearchResult.AdditionalProperties.builder()
                            .putAdditionalProperty(
                                "hs_last_record_added_at",
                                JsonValue.from("1695938616824"),
                            )
                            .putAdditionalProperty("hs_list_reference_count", JsonValue.from("0"))
                            .putAdditionalProperty("hs_list_size", JsonValue.from("59"))
                            .putAdditionalProperty("hs_list_size_week_delta", JsonValue.from("-10"))
                            .build()
                    )
                    .listId("123")
                    .listVersion(1)
                    .name("Test list")
                    .objectTypeId("0-1")
                    .processingStatus("COMPLETE")
                    .processingType("SNAPSHOT")
                    .createdAt(OffsetDateTime.parse("2023-09-28T22:03:17.998Z"))
                    .createdById("1")
                    .deletedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .filtersUpdatedAt(OffsetDateTime.parse("2023-09-28T22:03:17.998Z"))
                    .updatedAt(OffsetDateTime.parse("2023-09-28T22:03:37.005Z"))
                    .updatedById("1")
                    .build()
            )
        assertThat(listSearchResponse.offset()).isEqualTo(1)
        assertThat(listSearchResponse.total()).isEqualTo(1)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val listSearchResponse =
            ListSearchResponse.builder()
                .hasMore(false)
                .addList(
                    PublicObjectListSearchResult.builder()
                        .additionalProperties(
                            PublicObjectListSearchResult.AdditionalProperties.builder()
                                .putAdditionalProperty(
                                    "hs_last_record_added_at",
                                    JsonValue.from("1695938616824"),
                                )
                                .putAdditionalProperty(
                                    "hs_list_reference_count",
                                    JsonValue.from("0"),
                                )
                                .putAdditionalProperty("hs_list_size", JsonValue.from("59"))
                                .putAdditionalProperty(
                                    "hs_list_size_week_delta",
                                    JsonValue.from("-10"),
                                )
                                .build()
                        )
                        .listId("123")
                        .listVersion(1)
                        .name("Test list")
                        .objectTypeId("0-1")
                        .processingStatus("COMPLETE")
                        .processingType("SNAPSHOT")
                        .createdAt(OffsetDateTime.parse("2023-09-28T22:03:17.998Z"))
                        .createdById("1")
                        .deletedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .filtersUpdatedAt(OffsetDateTime.parse("2023-09-28T22:03:17.998Z"))
                        .updatedAt(OffsetDateTime.parse("2023-09-28T22:03:37.005Z"))
                        .updatedById("1")
                        .build()
                )
                .offset(1)
                .total(1)
                .build()

        val roundtrippedListSearchResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(listSearchResponse),
                jacksonTypeRef<ListSearchResponse>(),
            )

        assertThat(roundtrippedListSearchResponse).isEqualTo(listSearchResponse)
    }
}
