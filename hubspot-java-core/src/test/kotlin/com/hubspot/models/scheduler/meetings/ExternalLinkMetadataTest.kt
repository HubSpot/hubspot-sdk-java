// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.scheduler.meetings

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExternalLinkMetadataTest {

    @Test
    fun create() {
        val externalLinkMetadata =
            ExternalLinkMetadata.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .defaultLink(true)
                .link("link")
                .organizerUserId("organizerUserId")
                .slug("slug")
                .type(ExternalLinkMetadata.Type.GROUP_CALENDAR)
                .addUserIdsOfLinkMember("string")
                .name("name")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(externalLinkMetadata.id()).isEqualTo("id")
        assertThat(externalLinkMetadata.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(externalLinkMetadata.defaultLink()).isEqualTo(true)
        assertThat(externalLinkMetadata.link()).isEqualTo("link")
        assertThat(externalLinkMetadata.organizerUserId()).isEqualTo("organizerUserId")
        assertThat(externalLinkMetadata.slug()).isEqualTo("slug")
        assertThat(externalLinkMetadata.type()).isEqualTo(ExternalLinkMetadata.Type.GROUP_CALENDAR)
        assertThat(externalLinkMetadata.userIdsOfLinkMembers()).containsExactly("string")
        assertThat(externalLinkMetadata.name()).contains("name")
        assertThat(externalLinkMetadata.updatedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val externalLinkMetadata =
            ExternalLinkMetadata.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .defaultLink(true)
                .link("link")
                .organizerUserId("organizerUserId")
                .slug("slug")
                .type(ExternalLinkMetadata.Type.GROUP_CALENDAR)
                .addUserIdsOfLinkMember("string")
                .name("name")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedExternalLinkMetadata =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(externalLinkMetadata),
                jacksonTypeRef<ExternalLinkMetadata>(),
            )

        assertThat(roundtrippedExternalLinkMetadata).isEqualTo(externalLinkMetadata)
    }
}
