// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.cms.hubdb

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.JsonValue
import com.hubspot.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class HubDbTableRowV3BatchUpdateRequestTest {

    @Test
    fun create() {
        val hubDbTableRowV3BatchUpdateRequest =
            HubDbTableRowV3BatchUpdateRequest.builder()
                .childTableId(0)
                .displayIndex(0)
                .values(
                    HubDbTableRowV3BatchUpdateRequest.Values.builder()
                        .putAdditionalProperty("foo", JsonValue.from(mapOf<String, Any>()))
                        .build()
                )
                .id("id")
                .name("name")
                .path("path")
                .build()

        assertThat(hubDbTableRowV3BatchUpdateRequest.childTableId()).isEqualTo(0)
        assertThat(hubDbTableRowV3BatchUpdateRequest.displayIndex()).isEqualTo(0)
        assertThat(hubDbTableRowV3BatchUpdateRequest.values())
            .isEqualTo(
                HubDbTableRowV3BatchUpdateRequest.Values.builder()
                    .putAdditionalProperty("foo", JsonValue.from(mapOf<String, Any>()))
                    .build()
            )
        assertThat(hubDbTableRowV3BatchUpdateRequest.id()).contains("id")
        assertThat(hubDbTableRowV3BatchUpdateRequest.name()).contains("name")
        assertThat(hubDbTableRowV3BatchUpdateRequest.path()).contains("path")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val hubDbTableRowV3BatchUpdateRequest =
            HubDbTableRowV3BatchUpdateRequest.builder()
                .childTableId(0)
                .displayIndex(0)
                .values(
                    HubDbTableRowV3BatchUpdateRequest.Values.builder()
                        .putAdditionalProperty("foo", JsonValue.from(mapOf<String, Any>()))
                        .build()
                )
                .id("id")
                .name("name")
                .path("path")
                .build()

        val roundtrippedHubDbTableRowV3BatchUpdateRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(hubDbTableRowV3BatchUpdateRequest),
                jacksonTypeRef<HubDbTableRowV3BatchUpdateRequest>(),
            )

        assertThat(roundtrippedHubDbTableRowV3BatchUpdateRequest)
            .isEqualTo(hubDbTableRowV3BatchUpdateRequest)
    }
}
