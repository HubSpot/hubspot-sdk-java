// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.cms.hubdb

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ForeignIdTest {

    @Test
    fun create() {
        val foreignId = ForeignId.builder().id("id").name("name").type("type").build()

        assertThat(foreignId.id()).isEqualTo("id")
        assertThat(foreignId.name()).isEqualTo("name")
        assertThat(foreignId.type()).isEqualTo("type")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val foreignId = ForeignId.builder().id("id").name("name").type("type").build()

        val roundtrippedForeignId =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(foreignId),
                jacksonTypeRef<ForeignId>(),
            )

        assertThat(roundtrippedForeignId).isEqualTo(foreignId)
    }
}
