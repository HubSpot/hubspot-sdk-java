// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.cms.hubdb

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.core.JsonValue
import com.hubspot.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class HubDbTableRowV3Test {

    @Test
    fun create() {
        val hubDbTableRowV3 =
            HubDbTableRowV3.builder()
                .id("id")
                .childTableId("childTableId")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .name("name")
                .path("path")
                .publishedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .values(
                    HubDbTableRowV3.Values.builder()
                        .putAdditionalProperty("foo", JsonValue.from(mapOf<String, Any>()))
                        .build()
                )
                .build()

        assertThat(hubDbTableRowV3.id()).isEqualTo("id")
        assertThat(hubDbTableRowV3.childTableId()).isEqualTo("childTableId")
        assertThat(hubDbTableRowV3.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(hubDbTableRowV3.name()).isEqualTo("name")
        assertThat(hubDbTableRowV3.path()).isEqualTo("path")
        assertThat(hubDbTableRowV3.publishedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(hubDbTableRowV3.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(hubDbTableRowV3.values())
            .isEqualTo(
                HubDbTableRowV3.Values.builder()
                    .putAdditionalProperty("foo", JsonValue.from(mapOf<String, Any>()))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val hubDbTableRowV3 =
            HubDbTableRowV3.builder()
                .id("id")
                .childTableId("childTableId")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .name("name")
                .path("path")
                .publishedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .values(
                    HubDbTableRowV3.Values.builder()
                        .putAdditionalProperty("foo", JsonValue.from(mapOf<String, Any>()))
                        .build()
                )
                .build()

        val roundtrippedHubDbTableRowV3 =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(hubDbTableRowV3),
                jacksonTypeRef<HubDbTableRowV3>(),
            )

        assertThat(roundtrippedHubDbTableRowV3).isEqualTo(hubDbTableRowV3)
    }
}
