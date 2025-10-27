// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.hubdb

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class HubDbTableRowV3RequestTest {

    @Test
    fun create() {
        val hubDbTableRowV3Request =
            HubDbTableRowV3Request.builder()
                .values(
                    HubDbTableRowV3Request.Values.builder()
                        .putAdditionalProperty("foo", JsonValue.from(mapOf<String, Any>()))
                        .build()
                )
                .childTableId(0L)
                .displayIndex(0)
                .name("name")
                .path("path")
                .build()

        assertThat(hubDbTableRowV3Request.values())
            .isEqualTo(
                HubDbTableRowV3Request.Values.builder()
                    .putAdditionalProperty("foo", JsonValue.from(mapOf<String, Any>()))
                    .build()
            )
        assertThat(hubDbTableRowV3Request.childTableId()).contains(0L)
        assertThat(hubDbTableRowV3Request.displayIndex()).contains(0)
        assertThat(hubDbTableRowV3Request.name()).contains("name")
        assertThat(hubDbTableRowV3Request.path()).contains("path")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val hubDbTableRowV3Request =
            HubDbTableRowV3Request.builder()
                .values(
                    HubDbTableRowV3Request.Values.builder()
                        .putAdditionalProperty("foo", JsonValue.from(mapOf<String, Any>()))
                        .build()
                )
                .childTableId(0L)
                .displayIndex(0)
                .name("name")
                .path("path")
                .build()

        val roundtrippedHubDbTableRowV3Request =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(hubDbTableRowV3Request),
                jacksonTypeRef<HubDbTableRowV3Request>(),
            )

        assertThat(roundtrippedHubDbTableRowV3Request).isEqualTo(hubDbTableRowV3Request)
    }
}
