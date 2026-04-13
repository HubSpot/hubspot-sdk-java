// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.crm.limits

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ObjectTypeDefinitionTest {

    @Test
    fun create() {
        val objectTypeDefinition =
            ObjectTypeDefinition.builder()
                .objectTypeId("objectTypeId")
                .pluralLabel("pluralLabel")
                .singularLabel("singularLabel")
                .build()

        assertThat(objectTypeDefinition.objectTypeId()).isEqualTo("objectTypeId")
        assertThat(objectTypeDefinition.pluralLabel()).isEqualTo("pluralLabel")
        assertThat(objectTypeDefinition.singularLabel()).isEqualTo("singularLabel")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val objectTypeDefinition =
            ObjectTypeDefinition.builder()
                .objectTypeId("objectTypeId")
                .pluralLabel("pluralLabel")
                .singularLabel("singularLabel")
                .build()

        val roundtrippedObjectTypeDefinition =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(objectTypeDefinition),
                jacksonTypeRef<ObjectTypeDefinition>(),
            )

        assertThat(roundtrippedObjectTypeDefinition).isEqualTo(objectTypeDefinition)
    }
}
