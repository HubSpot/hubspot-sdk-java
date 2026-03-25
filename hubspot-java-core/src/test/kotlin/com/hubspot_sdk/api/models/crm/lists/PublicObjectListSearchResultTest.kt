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
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .listId("listId")
                .listVersion(0)
                .name("name")
                .objectTypeId("objectTypeId")
                .processingStatus("processingStatus")
                .processingType("processingType")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .createdById("createdById")
                .deletedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .filtersUpdatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .updatedById("updatedById")
                .build()

        assertThat(publicObjectListSearchResult.additionalProperties())
            .isEqualTo(
                PublicObjectListSearchResult.AdditionalProperties.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(publicObjectListSearchResult.listId()).isEqualTo("listId")
        assertThat(publicObjectListSearchResult.listVersion()).isEqualTo(0)
        assertThat(publicObjectListSearchResult.name()).isEqualTo("name")
        assertThat(publicObjectListSearchResult.objectTypeId()).isEqualTo("objectTypeId")
        assertThat(publicObjectListSearchResult.processingStatus()).isEqualTo("processingStatus")
        assertThat(publicObjectListSearchResult.processingType()).isEqualTo("processingType")
        assertThat(publicObjectListSearchResult.createdAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(publicObjectListSearchResult.createdById()).contains("createdById")
        assertThat(publicObjectListSearchResult.deletedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(publicObjectListSearchResult.filtersUpdatedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(publicObjectListSearchResult.updatedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(publicObjectListSearchResult.updatedById()).contains("updatedById")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicObjectListSearchResult =
            PublicObjectListSearchResult.builder()
                .additionalProperties(
                    PublicObjectListSearchResult.AdditionalProperties.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .listId("listId")
                .listVersion(0)
                .name("name")
                .objectTypeId("objectTypeId")
                .processingStatus("processingStatus")
                .processingType("processingType")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .createdById("createdById")
                .deletedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .filtersUpdatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .updatedById("updatedById")
                .build()

        val roundtrippedPublicObjectListSearchResult =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicObjectListSearchResult),
                jacksonTypeRef<PublicObjectListSearchResult>(),
            )

        assertThat(roundtrippedPublicObjectListSearchResult).isEqualTo(publicObjectListSearchResult)
    }
}
