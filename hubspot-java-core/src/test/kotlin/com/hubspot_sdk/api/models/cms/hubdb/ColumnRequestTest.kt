// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.hubdb

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import com.hubspot_sdk.api.models.Option
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ColumnRequestTest {

    @Test
    fun create() {
        val columnRequest =
            ColumnRequest.builder()
                .id(0)
                .label("label")
                .name("name")
                .addOption(
                    Option.builder()
                        .hidden(false)
                        .label("Option A")
                        .value("A")
                        .description("Choice number one")
                        .displayOrder(1)
                        .build()
                )
                .type(ColumnRequest.Type.BOOLEAN)
                .foreignColumnId(0)
                .foreignTableId(0L)
                .maxNumberOfCharacters(0)
                .maxNumberOfOptions(0)
                .build()

        assertThat(columnRequest.id()).isEqualTo(0)
        assertThat(columnRequest.label()).isEqualTo("label")
        assertThat(columnRequest.name()).isEqualTo("name")
        assertThat(columnRequest.options())
            .containsExactly(
                Option.builder()
                    .hidden(false)
                    .label("Option A")
                    .value("A")
                    .description("Choice number one")
                    .displayOrder(1)
                    .build()
            )
        assertThat(columnRequest.type()).isEqualTo(ColumnRequest.Type.BOOLEAN)
        assertThat(columnRequest.foreignColumnId()).contains(0)
        assertThat(columnRequest.foreignTableId()).contains(0L)
        assertThat(columnRequest.maxNumberOfCharacters()).contains(0)
        assertThat(columnRequest.maxNumberOfOptions()).contains(0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val columnRequest =
            ColumnRequest.builder()
                .id(0)
                .label("label")
                .name("name")
                .addOption(
                    Option.builder()
                        .hidden(false)
                        .label("Option A")
                        .value("A")
                        .description("Choice number one")
                        .displayOrder(1)
                        .build()
                )
                .type(ColumnRequest.Type.BOOLEAN)
                .foreignColumnId(0)
                .foreignTableId(0L)
                .maxNumberOfCharacters(0)
                .maxNumberOfOptions(0)
                .build()

        val roundtrippedColumnRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(columnRequest),
                jacksonTypeRef<ColumnRequest>(),
            )

        assertThat(roundtrippedColumnRequest).isEqualTo(columnRequest)
    }
}
