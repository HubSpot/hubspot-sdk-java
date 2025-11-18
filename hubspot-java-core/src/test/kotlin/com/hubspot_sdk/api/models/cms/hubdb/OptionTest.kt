// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.hubdb

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OptionTest {

    @Test
    fun create() {
        val option =
            Option.builder()
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

        assertThat(option.id()).isEqualTo("id")
        assertThat(option.createdAt()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(option.label()).isEqualTo("label")
        assertThat(option.name()).isEqualTo("name")
        assertThat(option.order()).isEqualTo(0)
        assertThat(option.type()).isEqualTo("type")
        assertThat(option.updatedAt()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(option.createdBy())
            .contains(
                SimpleUser.builder()
                    .id("id")
                    .email("email")
                    .firstName("firstName")
                    .lastName("lastName")
                    .build()
            )
        assertThat(option.createdByUserId()).contains(0)
        assertThat(option.updatedBy())
            .contains(
                SimpleUser.builder()
                    .id("id")
                    .email("email")
                    .firstName("firstName")
                    .lastName("lastName")
                    .build()
            )
        assertThat(option.updatedByUserId()).contains(0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val option =
            Option.builder()
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

        val roundtrippedOption =
            jsonMapper.readValue(jsonMapper.writeValueAsString(option), jacksonTypeRef<Option>())

        assertThat(roundtrippedOption).isEqualTo(option)
    }
}
