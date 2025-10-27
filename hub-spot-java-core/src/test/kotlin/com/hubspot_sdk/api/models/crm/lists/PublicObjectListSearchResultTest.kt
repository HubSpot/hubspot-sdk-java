// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.lists

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicObjectListSearchResultTest {

    @Test
    fun create() {
        val publicObjectListSearchResult =
            PublicObjectListSearchResult.builder()
                .additionalProperties(
                    PublicObjectListSearchResult.AdditionalProperties.builder()
                        .putAdditionalProperty("hs_last_record_added_at", JsonValue.from("string"))
                        .putAdditionalProperty("hs_list_reference_count", JsonValue.from("string"))
                        .putAdditionalProperty("hs_list_size", JsonValue.from("string"))
                        .putAdditionalProperty("hs_list_size_week_delta", JsonValue.from("string"))
                        .build()
                )
                .listId("123")
                .listVersion(1)
                .name("Test list")
                .objectTypeId("0-1")
                .processingStatus("COMPLETED")
                .processingType("SNAPSHOT")
                .createdAt(OffsetDateTime.parse("2023-09-28T22:03:17.998Z"))
                .createdById("1")
                .deletedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .filtersUpdatedAt(OffsetDateTime.parse("2023-09-28T22:03:17.998Z"))
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .updatedById("1")
                .build()

        assertThat(publicObjectListSearchResult.additionalProperties())
            .isEqualTo(
                PublicObjectListSearchResult.AdditionalProperties.builder()
                    .putAdditionalProperty("hs_last_record_added_at", JsonValue.from("string"))
                    .putAdditionalProperty("hs_list_reference_count", JsonValue.from("string"))
                    .putAdditionalProperty("hs_list_size", JsonValue.from("string"))
                    .putAdditionalProperty("hs_list_size_week_delta", JsonValue.from("string"))
                    .build()
            )
        assertThat(publicObjectListSearchResult.listId()).isEqualTo("123")
        assertThat(publicObjectListSearchResult.listVersion()).isEqualTo(1)
        assertThat(publicObjectListSearchResult.name()).isEqualTo("Test list")
        assertThat(publicObjectListSearchResult.objectTypeId()).isEqualTo("0-1")
        assertThat(publicObjectListSearchResult.processingStatus()).isEqualTo("COMPLETED")
        assertThat(publicObjectListSearchResult.processingType()).isEqualTo("SNAPSHOT")
        assertThat(publicObjectListSearchResult.createdAt())
            .contains(OffsetDateTime.parse("2023-09-28T22:03:17.998Z"))
        assertThat(publicObjectListSearchResult.createdById()).contains("1")
        assertThat(publicObjectListSearchResult.deletedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(publicObjectListSearchResult.filtersUpdatedAt())
            .contains(OffsetDateTime.parse("2023-09-28T22:03:17.998Z"))
        assertThat(publicObjectListSearchResult.updatedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(publicObjectListSearchResult.updatedById()).contains("1")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicObjectListSearchResult =
            PublicObjectListSearchResult.builder()
                .additionalProperties(
                    PublicObjectListSearchResult.AdditionalProperties.builder()
                        .putAdditionalProperty("hs_last_record_added_at", JsonValue.from("string"))
                        .putAdditionalProperty("hs_list_reference_count", JsonValue.from("string"))
                        .putAdditionalProperty("hs_list_size", JsonValue.from("string"))
                        .putAdditionalProperty("hs_list_size_week_delta", JsonValue.from("string"))
                        .build()
                )
                .listId("123")
                .listVersion(1)
                .name("Test list")
                .objectTypeId("0-1")
                .processingStatus("COMPLETED")
                .processingType("SNAPSHOT")
                .createdAt(OffsetDateTime.parse("2023-09-28T22:03:17.998Z"))
                .createdById("1")
                .deletedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .filtersUpdatedAt(OffsetDateTime.parse("2023-09-28T22:03:17.998Z"))
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .updatedById("1")
                .build()

        val roundtrippedPublicObjectListSearchResult =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicObjectListSearchResult),
                jacksonTypeRef<PublicObjectListSearchResult>(),
            )

        assertThat(roundtrippedPublicObjectListSearchResult).isEqualTo(publicObjectListSearchResult)
    }
}
