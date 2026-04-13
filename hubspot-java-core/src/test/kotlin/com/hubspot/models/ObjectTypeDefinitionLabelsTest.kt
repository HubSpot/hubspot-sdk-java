// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ObjectTypeDefinitionLabelsTest {

    @Test
    fun create() {
        val objectTypeDefinitionLabels =
            ObjectTypeDefinitionLabels.builder().plural("plural").singular("singular").build()

        assertThat(objectTypeDefinitionLabels.plural()).contains("plural")
        assertThat(objectTypeDefinitionLabels.singular()).contains("singular")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val objectTypeDefinitionLabels =
            ObjectTypeDefinitionLabels.builder().plural("plural").singular("singular").build()

        val roundtrippedObjectTypeDefinitionLabels =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(objectTypeDefinitionLabels),
                jacksonTypeRef<ObjectTypeDefinitionLabels>(),
            )

        assertThat(roundtrippedObjectTypeDefinitionLabels).isEqualTo(objectTypeDefinitionLabels)
    }
}
