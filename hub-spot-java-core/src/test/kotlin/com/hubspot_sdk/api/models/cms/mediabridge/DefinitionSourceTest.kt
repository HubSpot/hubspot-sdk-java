// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.mediabridge

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DefinitionSourceTest {

    @Test
    fun create() {
        val definitionSource = DefinitionSource.builder().type("type").name("name").build()

        assertThat(definitionSource.type()).isEqualTo("type")
        assertThat(definitionSource.name()).contains("name")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val definitionSource = DefinitionSource.builder().type("type").name("name").build()

        val roundtrippedDefinitionSource =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(definitionSource),
                jacksonTypeRef<DefinitionSource>(),
            )

        assertThat(roundtrippedDefinitionSource).isEqualTo(definitionSource)
    }
}
