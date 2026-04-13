// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.cms.mediabridge

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DefinitionSourceTest {

    @Test
    fun create() {
        val definitionSource =
            DefinitionSource.builder().type(DefinitionSource.Type.GLOBAL).name("name").build()

        assertThat(definitionSource.type()).isEqualTo(DefinitionSource.Type.GLOBAL)
        assertThat(definitionSource.name()).contains("name")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val definitionSource =
            DefinitionSource.builder().type(DefinitionSource.Type.GLOBAL).name("name").build()

        val roundtrippedDefinitionSource =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(definitionSource),
                jacksonTypeRef<DefinitionSource>(),
            )

        assertThat(roundtrippedDefinitionSource).isEqualTo(definitionSource)
    }
}
