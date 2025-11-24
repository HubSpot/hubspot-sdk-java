// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.conversations

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicInboxTest {

    @Test
    fun create() {
        val publicInbox =
            PublicInbox.builder()
                .id("id")
                .archived(true)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .name("name")
                .type("type")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .archivedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(publicInbox.id()).isEqualTo("id")
        assertThat(publicInbox.archived()).isEqualTo(true)
        assertThat(publicInbox.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(publicInbox.name()).isEqualTo("name")
        assertThat(publicInbox.type()).isEqualTo("type")
        assertThat(publicInbox.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(publicInbox.archivedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicInbox =
            PublicInbox.builder()
                .id("id")
                .archived(true)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .name("name")
                .type("type")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .archivedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedPublicInbox =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicInbox),
                jacksonTypeRef<PublicInbox>(),
            )

        assertThat(roundtrippedPublicInbox).isEqualTo(publicInbox)
    }
}
