// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.objects.schemas

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import com.hubspot_sdk.api.models.ObjectTypeDefinitionLabels
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ObjectTypeDefinitionPatchTest {

    @Test
    fun create() {
        val objectTypeDefinitionPatch =
            ObjectTypeDefinitionPatch.builder()
                .clearDescription(true)
                .description("description")
                .labels(
                    ObjectTypeDefinitionLabels.builder()
                        .plural("plural")
                        .singular("singular")
                        .build()
                )
                .primaryDisplayProperty("my_object_property")
                .addRequiredProperty("my_object_property")
                .restorable(true)
                .addSearchableProperty("my_object_property")
                .addSecondaryDisplayProperty("string")
                .build()

        assertThat(objectTypeDefinitionPatch.clearDescription()).contains(true)
        assertThat(objectTypeDefinitionPatch.description()).contains("description")
        assertThat(objectTypeDefinitionPatch.labels())
            .contains(
                ObjectTypeDefinitionLabels.builder().plural("plural").singular("singular").build()
            )
        assertThat(objectTypeDefinitionPatch.primaryDisplayProperty())
            .contains("my_object_property")
        assertThat(objectTypeDefinitionPatch.requiredProperties().getOrNull())
            .containsExactly("my_object_property")
        assertThat(objectTypeDefinitionPatch.restorable()).contains(true)
        assertThat(objectTypeDefinitionPatch.searchableProperties().getOrNull())
            .containsExactly("my_object_property")
        assertThat(objectTypeDefinitionPatch.secondaryDisplayProperties().getOrNull())
            .containsExactly("string")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val objectTypeDefinitionPatch =
            ObjectTypeDefinitionPatch.builder()
                .clearDescription(true)
                .description("description")
                .labels(
                    ObjectTypeDefinitionLabels.builder()
                        .plural("plural")
                        .singular("singular")
                        .build()
                )
                .primaryDisplayProperty("my_object_property")
                .addRequiredProperty("my_object_property")
                .restorable(true)
                .addSearchableProperty("my_object_property")
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
