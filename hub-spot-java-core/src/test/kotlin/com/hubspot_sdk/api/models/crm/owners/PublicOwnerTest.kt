// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.owners

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import com.hubspot_sdk.api.models.settings.users.PublicTeam
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicOwnerTest {

    @Test
    fun create() {
        val publicOwner =
            PublicOwner.builder()
                .id("6166860")
                .archived(false)
                .createdAt(OffsetDateTime.parse("2019-10-30T03:30:17.883Z"))
                .type(PublicOwner.Type.PERSON)
                .updatedAt(OffsetDateTime.parse("2019-12-07T16:50:06.678Z"))
                .email("jsmith@example.com")
                .firstName("John")
                .lastName("Smith")
                .addTeam(
                    PublicTeam.builder()
                        .id("178588")
                        .name("West Coast Sales")
                        .addSecondaryUserId("124")
                        .addUserId("123")
                        .build()
                )
                .addTeam(
                    PublicTeam.builder()
                        .id("178590")
                        .name("California Sales")
                        .addSecondaryUserId("124")
                        .addUserId("123")
                        .build()
                )
                .userId(1296619)
                .userIdIncludingInactive(6166860)
                .build()

        assertThat(publicOwner.id()).isEqualTo("6166860")
        assertThat(publicOwner.archived()).isEqualTo(false)
        assertThat(publicOwner.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-10-30T03:30:17.883Z"))
        assertThat(publicOwner.type()).isEqualTo(PublicOwner.Type.PERSON)
        assertThat(publicOwner.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-07T16:50:06.678Z"))
        assertThat(publicOwner.email()).contains("jsmith@example.com")
        assertThat(publicOwner.firstName()).contains("John")
        assertThat(publicOwner.lastName()).contains("Smith")
        assertThat(publicOwner.teams().getOrNull())
            .containsExactly(
                PublicTeam.builder()
                    .id("178588")
                    .name("West Coast Sales")
                    .addSecondaryUserId("124")
                    .addUserId("123")
                    .build(),
                PublicTeam.builder()
                    .id("178590")
                    .name("California Sales")
                    .addSecondaryUserId("124")
                    .addUserId("123")
                    .build(),
            )
        assertThat(publicOwner.userId()).contains(1296619)
        assertThat(publicOwner.userIdIncludingInactive()).contains(6166860)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicOwner =
            PublicOwner.builder()
                .id("6166860")
                .archived(false)
                .createdAt(OffsetDateTime.parse("2019-10-30T03:30:17.883Z"))
                .type(PublicOwner.Type.PERSON)
                .updatedAt(OffsetDateTime.parse("2019-12-07T16:50:06.678Z"))
                .email("jsmith@example.com")
                .firstName("John")
                .lastName("Smith")
                .addTeam(
                    PublicTeam.builder()
                        .id("178588")
                        .name("West Coast Sales")
                        .addSecondaryUserId("124")
                        .addUserId("123")
                        .build()
                )
                .addTeam(
                    PublicTeam.builder()
                        .id("178590")
                        .name("California Sales")
                        .addSecondaryUserId("124")
                        .addUserId("123")
                        .build()
                )
                .userId(1296619)
                .userIdIncludingInactive(6166860)
                .build()

        val roundtrippedPublicOwner =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicOwner),
                jacksonTypeRef<PublicOwner>(),
            )

        assertThat(roundtrippedPublicOwner).isEqualTo(publicOwner)
    }
}
