// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.crm.owners

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicOwnerTest {

    @Test
    fun create() {
        val publicOwner =
            PublicOwner.builder()
                .id("id")
                .archived(true)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .type(PublicOwner.Type.PERSON)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .email("email")
                .firstName("firstName")
                .lastName("lastName")
                .addTeam(PublicTeam.builder().id("id").name("name").primary(true).build())
                .userId(0)
                .userIdIncludingInactive(0)
                .build()

        assertThat(publicOwner.id()).isEqualTo("id")
        assertThat(publicOwner.archived()).isEqualTo(true)
        assertThat(publicOwner.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(publicOwner.type()).isEqualTo(PublicOwner.Type.PERSON)
        assertThat(publicOwner.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(publicOwner.email()).contains("email")
        assertThat(publicOwner.firstName()).contains("firstName")
        assertThat(publicOwner.lastName()).contains("lastName")
        assertThat(publicOwner.teams().getOrNull())
            .containsExactly(PublicTeam.builder().id("id").name("name").primary(true).build())
        assertThat(publicOwner.userId()).contains(0)
        assertThat(publicOwner.userIdIncludingInactive()).contains(0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicOwner =
            PublicOwner.builder()
                .id("id")
                .archived(true)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .type(PublicOwner.Type.PERSON)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .email("email")
                .firstName("firstName")
                .lastName("lastName")
                .addTeam(PublicTeam.builder().id("id").name("name").primary(true).build())
                .userId(0)
                .userIdIncludingInactive(0)
                .build()

        val roundtrippedPublicOwner =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicOwner),
                jacksonTypeRef<PublicOwner>(),
            )

        assertThat(roundtrippedPublicOwner).isEqualTo(publicOwner)
    }
}
