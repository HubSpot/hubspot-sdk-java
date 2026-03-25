// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.automation.sequences

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicSequenceLiteResponseTest {

    @Test
    fun create() {
        val publicSequenceLiteResponse =
            PublicSequenceLiteResponse.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .name("name")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .userId("userId")
                .folderId("folderId")
                .build()

        assertThat(publicSequenceLiteResponse.id()).isEqualTo("id")
        assertThat(publicSequenceLiteResponse.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(publicSequenceLiteResponse.name()).isEqualTo("name")
        assertThat(publicSequenceLiteResponse.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(publicSequenceLiteResponse.userId()).isEqualTo("userId")
        assertThat(publicSequenceLiteResponse.folderId()).contains("folderId")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicSequenceLiteResponse =
            PublicSequenceLiteResponse.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .name("name")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .userId("userId")
                .folderId("folderId")
                .build()

        val roundtrippedPublicSequenceLiteResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicSequenceLiteResponse),
                jacksonTypeRef<PublicSequenceLiteResponse>(),
            )

        assertThat(roundtrippedPublicSequenceLiteResponse).isEqualTo(publicSequenceLiteResponse)
    }
}
