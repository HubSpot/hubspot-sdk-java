// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BaseObjectTypeDefinitionTest {

    @Test
    fun create() {
        val baseObjectTypeDefinition =
            BaseObjectTypeDefinition.builder()
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

        assertThat(baseObjectTypeDefinition.id()).isEqualTo("id")
        assertThat(baseObjectTypeDefinition.allowsSensitiveProperties()).isEqualTo(true)
        assertThat(baseObjectTypeDefinition.archived()).isEqualTo(true)
        assertThat(baseObjectTypeDefinition.fullyQualifiedName()).isEqualTo("fullyQualifiedName")
        assertThat(baseObjectTypeDefinition.labels())
            .isEqualTo(
                ObjectTypeDefinitionLabels.builder().plural("plural").singular("singular").build()
            )
        assertThat(baseObjectTypeDefinition.name()).isEqualTo("name")
        assertThat(baseObjectTypeDefinition.objectTypeId()).isEqualTo("objectTypeId")
        assertThat(baseObjectTypeDefinition.requiredProperties()).containsExactly("string")
        assertThat(baseObjectTypeDefinition.searchableProperties()).containsExactly("string")
        assertThat(baseObjectTypeDefinition.secondaryDisplayProperties()).containsExactly("string")
        assertThat(baseObjectTypeDefinition.createdAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(baseObjectTypeDefinition.description()).contains("description")
        assertThat(baseObjectTypeDefinition.portalId()).contains(0)
        assertThat(baseObjectTypeDefinition.primaryDisplayProperty())
            .contains("primaryDisplayProperty")
        assertThat(baseObjectTypeDefinition.updatedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val baseObjectTypeDefinition =
            BaseObjectTypeDefinition.builder()
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

        val roundtrippedBaseObjectTypeDefinition =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(baseObjectTypeDefinition),
                jacksonTypeRef<BaseObjectTypeDefinition>(),
            )

        assertThat(roundtrippedBaseObjectTypeDefinition).isEqualTo(baseObjectTypeDefinition)
    }
}
