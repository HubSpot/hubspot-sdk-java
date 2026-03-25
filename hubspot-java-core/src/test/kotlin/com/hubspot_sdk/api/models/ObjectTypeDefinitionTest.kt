// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ObjectTypeDefinitionTest {

    @Test
    fun create() {
        val objectTypeDefinition =
            ObjectTypeDefinition.builder()
                .id("id")
                .allowsSensitiveProperties(true)
                .archived(true)
                .fullyQualifiedName("fullyQualifiedName")
                .labels(
                    ObjectTypeDefinitionLabels.builder()
                        .plural("plural")
                        .singular("singular")
                        .build()
                )
                .name("name")
                .objectTypeId("objectTypeId")
                .addRequiredProperty("string")
                .addSearchableProperty("string")
                .addSecondaryDisplayProperty("string")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .description("description")
                .portalId(0)
                .primaryDisplayProperty("primaryDisplayProperty")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(objectTypeDefinition.id()).isEqualTo("id")
        assertThat(objectTypeDefinition.allowsSensitiveProperties()).isEqualTo(true)
        assertThat(objectTypeDefinition.archived()).isEqualTo(true)
        assertThat(objectTypeDefinition.fullyQualifiedName()).isEqualTo("fullyQualifiedName")
        assertThat(objectTypeDefinition.labels())
            .isEqualTo(
                ObjectTypeDefinitionLabels.builder().plural("plural").singular("singular").build()
            )
        assertThat(objectTypeDefinition.name()).isEqualTo("name")
        assertThat(objectTypeDefinition.objectTypeId()).isEqualTo("objectTypeId")
        assertThat(objectTypeDefinition.requiredProperties()).containsExactly("string")
        assertThat(objectTypeDefinition.searchableProperties()).containsExactly("string")
        assertThat(objectTypeDefinition.secondaryDisplayProperties()).containsExactly("string")
        assertThat(objectTypeDefinition.createdAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(objectTypeDefinition.description()).contains("description")
        assertThat(objectTypeDefinition.portalId()).contains(0)
        assertThat(objectTypeDefinition.primaryDisplayProperty()).contains("primaryDisplayProperty")
        assertThat(objectTypeDefinition.updatedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val objectTypeDefinition =
            ObjectTypeDefinition.builder()
                .id("id")
                .allowsSensitiveProperties(true)
                .archived(true)
                .fullyQualifiedName("fullyQualifiedName")
                .labels(
                    ObjectTypeDefinitionLabels.builder()
                        .plural("plural")
                        .singular("singular")
                        .build()
                )
                .name("name")
                .objectTypeId("objectTypeId")
                .addRequiredProperty("string")
                .addSearchableProperty("string")
                .addSecondaryDisplayProperty("string")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .description("description")
                .portalId(0)
                .primaryDisplayProperty("primaryDisplayProperty")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedObjectTypeDefinition =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(objectTypeDefinition),
                jacksonTypeRef<ObjectTypeDefinition>(),
            )

        assertThat(roundtrippedObjectTypeDefinition).isEqualTo(objectTypeDefinition)
    }
}
