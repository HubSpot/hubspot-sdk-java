// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.hubdb

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class HubDbTableRowV3Test {

    @Test
    fun create() {
        val hubDbTableRowV3 =
            HubDbTableRowV3.builder()
                .values(
                    HubDbTableRowV3.Values.builder()
                        .putAdditionalProperty("foo", JsonValue.from(mapOf<String, Any>()))
                        .build()
                )
                .id("id")
                .childTableId("childTableId")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .name("name")
                .path("path")
                .publishedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(hubDbTableRowV3.values())
            .isEqualTo(
                HubDbTableRowV3.Values.builder()
                    .putAdditionalProperty("foo", JsonValue.from(mapOf<String, Any>()))
                    .build()
            )
        assertThat(hubDbTableRowV3.id()).contains("id")
        assertThat(hubDbTableRowV3.childTableId()).contains("childTableId")
        assertThat(hubDbTableRowV3.createdAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(hubDbTableRowV3.name()).contains("name")
        assertThat(hubDbTableRowV3.path()).contains("path")
        assertThat(hubDbTableRowV3.publishedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(hubDbTableRowV3.updatedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val hubDbTableRowV3 =
            HubDbTableRowV3.builder()
                .values(
                    HubDbTableRowV3.Values.builder()
                        .putAdditionalProperty("foo", JsonValue.from(mapOf<String, Any>()))
                        .build()
                )
                .id("id")
                .childTableId("childTableId")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .name("name")
                .path("path")
                .publishedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedHubDbTableRowV3 =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(hubDbTableRowV3),
                jacksonTypeRef<HubDbTableRowV3>(),
            )

        assertThat(roundtrippedHubDbTableRowV3).isEqualTo(hubDbTableRowV3)
    }
}
