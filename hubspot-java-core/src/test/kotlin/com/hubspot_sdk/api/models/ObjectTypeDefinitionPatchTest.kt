// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ObjectTypeDefinitionPatchTest {

    @Test
    fun create() {
        val objectTypeDefinitionPatch =
            ObjectTypeDefinitionPatch.builder()
                .clearDescription(true)
                .allowsSensitiveProperties(true)
                .description("description")
                .labels(
                    ObjectTypeDefinitionLabels.builder()
                        .plural("plural")
                        .singular("singular")
                        .build()
                )
                .primaryDisplayProperty("primaryDisplayProperty")
                .addRequiredProperty("string")
                .restorable(true)
                .addSearchableProperty("string")
                .addSecondaryDisplayProperty("string")
                .build()

        assertThat(objectTypeDefinitionPatch.clearDescription()).isEqualTo(true)
        assertThat(objectTypeDefinitionPatch.allowsSensitiveProperties()).contains(true)
        assertThat(objectTypeDefinitionPatch.description()).contains("description")
        assertThat(objectTypeDefinitionPatch.labels())
            .contains(
                ObjectTypeDefinitionLabels.builder().plural("plural").singular("singular").build()
            )
        assertThat(objectTypeDefinitionPatch.primaryDisplayProperty())
            .contains("primaryDisplayProperty")
        assertThat(objectTypeDefinitionPatch.requiredProperties().getOrNull())
            .containsExactly("string")
        assertThat(objectTypeDefinitionPatch.restorable()).contains(true)
        assertThat(objectTypeDefinitionPatch.searchableProperties().getOrNull())
            .containsExactly("string")
        assertThat(objectTypeDefinitionPatch.secondaryDisplayProperties().getOrNull())
            .containsExactly("string")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val objectTypeDefinitionPatch =
            ObjectTypeDefinitionPatch.builder()
                .clearDescription(true)
                .allowsSensitiveProperties(true)
                .description("description")
                .labels(
                    ObjectTypeDefinitionLabels.builder()
                        .plural("plural")
                        .singular("singular")
                        .build()
                )
                .primaryDisplayProperty("primaryDisplayProperty")
                .addRequiredProperty("string")
                .restorable(true)
                .addSearchableProperty("string")
                .addSecondaryDisplayProperty("string")
                .build()

        val roundtrippedObjectTypeDefinitionPatch =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(objectTypeDefinitionPatch),
                jacksonTypeRef<ObjectTypeDefinitionPatch>(),
            )

        assertThat(roundtrippedObjectTypeDefinitionPatch).isEqualTo(objectTypeDefinitionPatch)
    }
}
