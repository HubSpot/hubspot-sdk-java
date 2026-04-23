// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.cms.hubdb

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class HubdbOptionTest {

    @Test
    fun create() {
        val hubdbOption =
            HubdbOption.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .label("label")
                .name("name")
                .order(0)
                .type("type")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .createdBy(
                    SimpleUser.builder()
                        .id("id")
                        .email("email")
                        .firstName("firstName")
                        .lastName("lastName")
                        .build()
                )
                .createdByUserId(0)
                .updatedBy(
                    SimpleUser.builder()
                        .id("id")
                        .email("email")
                        .firstName("firstName")
                        .lastName("lastName")
                        .build()
                )
                .updatedByUserId(0)
                .build()

        assertThat(hubdbOption.id()).isEqualTo("id")
        assertThat(hubdbOption.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(hubdbOption.label()).isEqualTo("label")
        assertThat(hubdbOption.name()).isEqualTo("name")
        assertThat(hubdbOption.order()).isEqualTo(0)
        assertThat(hubdbOption.type()).isEqualTo("type")
        assertThat(hubdbOption.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(hubdbOption.createdBy())
            .contains(
                SimpleUser.builder()
                    .id("id")
                    .email("email")
                    .firstName("firstName")
                    .lastName("lastName")
                    .build()
            )
        assertThat(hubdbOption.createdByUserId()).contains(0)
        assertThat(hubdbOption.updatedBy())
            .contains(
                SimpleUser.builder()
                    .id("id")
                    .email("email")
                    .firstName("firstName")
                    .lastName("lastName")
                    .build()
            )
        assertThat(hubdbOption.updatedByUserId()).contains(0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val hubdbOption =
            HubdbOption.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .label("label")
                .name("name")
                .order(0)
                .type("type")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .createdBy(
                    SimpleUser.builder()
                        .id("id")
                        .email("email")
                        .firstName("firstName")
                        .lastName("lastName")
                        .build()
                )
                .createdByUserId(0)
                .updatedBy(
                    SimpleUser.builder()
                        .id("id")
                        .email("email")
                        .firstName("firstName")
                        .lastName("lastName")
                        .build()
                )
                .updatedByUserId(0)
                .build()

        val roundtrippedHubdbOption =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(hubdbOption),
                jacksonTypeRef<HubdbOption>(),
            )

        assertThat(roundtrippedHubdbOption).isEqualTo(hubdbOption)
    }
}
