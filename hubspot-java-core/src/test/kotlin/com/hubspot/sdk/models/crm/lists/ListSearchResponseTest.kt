// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.crm.lists

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.JsonValue
import com.hubspot.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ListSearchResponseTest {

    @Test
    fun create() {
        val listSearchResponse =
            ListSearchResponse.builder()
                .hasMore(true)
                .addList(
                    PublicObjectListSearchResult.builder()
                        .listId("listId")
                        .listVersion(0)
                        .name("name")
                        .objectTypeId("objectTypeId")
                        .processingStatus("processingStatus")
                        .processingType("processingType")
                        .additionalFilterProperties(
                            PublicObjectListSearchResult.AdditionalFilterProperties.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .createdById("createdById")
                        .deletedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .filtersUpdatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .updatedById("updatedById")
                        .build()
                )
                .offset(0)
                .total(0)
                .build()

        assertThat(listSearchResponse.hasMore()).isEqualTo(true)
        assertThat(listSearchResponse.lists())
            .containsExactly(
                PublicObjectListSearchResult.builder()
                    .listId("listId")
                    .listVersion(0)
                    .name("name")
                    .objectTypeId("objectTypeId")
                    .processingStatus("processingStatus")
                    .processingType("processingType")
                    .additionalFilterProperties(
                        PublicObjectListSearchResult.AdditionalFilterProperties.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .createdById("createdById")
                    .deletedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .filtersUpdatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .updatedById("updatedById")
                    .build()
            )
        assertThat(listSearchResponse.offset()).isEqualTo(0)
        assertThat(listSearchResponse.total()).isEqualTo(0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val listSearchResponse =
            ListSearchResponse.builder()
                .hasMore(true)
                .addList(
                    PublicObjectListSearchResult.builder()
                        .listId("listId")
                        .listVersion(0)
                        .name("name")
                        .objectTypeId("objectTypeId")
                        .processingStatus("processingStatus")
                        .processingType("processingType")
                        .additionalFilterProperties(
                            PublicObjectListSearchResult.AdditionalFilterProperties.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .createdById("createdById")
                        .deletedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .filtersUpdatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .updatedById("updatedById")
                        .build()
                )
                .offset(0)
                .total(0)
                .build()

        val roundtrippedListSearchResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(listSearchResponse),
                jacksonTypeRef<ListSearchResponse>(),
            )

        assertThat(roundtrippedListSearchResponse).isEqualTo(listSearchResponse)
    }
}
