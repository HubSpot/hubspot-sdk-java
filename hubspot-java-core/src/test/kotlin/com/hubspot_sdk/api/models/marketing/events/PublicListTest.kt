// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.marketing.events

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicListTest {

    @Test
    fun create() {
        val publicList =
            PublicList.builder()
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
                .size(0L)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .updatedById("updatedById")
                .build()

        assertThat(publicList.listId()).isEqualTo("listId")
        assertThat(publicList.listVersion()).isEqualTo(0)
        assertThat(publicList.name()).isEqualTo("name")
        assertThat(publicList.objectTypeId()).isEqualTo("objectTypeId")
        assertThat(publicList.processingStatus()).isEqualTo("processingStatus")
        assertThat(publicList.processingType()).isEqualTo("processingType")
        assertThat(publicList.createdAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(publicList.createdById()).contains("createdById")
        assertThat(publicList.deletedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(publicList.filtersUpdatedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(publicList.size()).contains(0L)
        assertThat(publicList.updatedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(publicList.updatedById()).contains("updatedById")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicList =
            PublicList.builder()
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
                .size(0L)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .updatedById("updatedById")
                .build()

        val roundtrippedPublicList =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicList),
                jacksonTypeRef<PublicList>(),
            )

        assertThat(roundtrippedPublicList).isEqualTo(publicList)
    }
}
