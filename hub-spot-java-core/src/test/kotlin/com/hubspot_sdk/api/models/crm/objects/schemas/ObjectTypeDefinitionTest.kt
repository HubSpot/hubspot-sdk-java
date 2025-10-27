// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.objects.schemas

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import com.hubspot_sdk.api.models.ObjectTypeDefinitionLabels
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ObjectTypeDefinitionTest {

    @Test
    fun create() {
        val objectTypeDefinition =
            ObjectTypeDefinition.builder()
                .id("123456")
                .labels(
                    ObjectTypeDefinitionLabels.builder()
                        .plural("My objects")
                        .singular("My object")
                        .build()
                )
                .name("my_object")
                .addRequiredProperty("my_object_property")
                .archived(true)
                .createdAt(OffsetDateTime.parse("2020-02-20T18:07:11.390Z"))
                .description("description")
                .fullyQualifiedName("fullyQualifiedName")
                .objectTypeId("objectTypeId")
                .portalId(12345678)
                .primaryDisplayProperty("my_object_property")
                .addSearchableProperty("my_object_property")
                .addSecondaryDisplayProperty("string")
                .updatedAt(OffsetDateTime.parse("2020-02-21T14:13:28.818002Z"))
                .build()

        assertThat(objectTypeDefinition.id()).isEqualTo("123456")
        assertThat(objectTypeDefinition.labels())
            .isEqualTo(
                ObjectTypeDefinitionLabels.builder()
                    .plural("My objects")
                    .singular("My object")
                    .build()
            )
        assertThat(objectTypeDefinition.name()).isEqualTo("my_object")
        assertThat(objectTypeDefinition.requiredProperties()).containsExactly("my_object_property")
        assertThat(objectTypeDefinition.archived()).contains(true)
        assertThat(objectTypeDefinition.createdAt())
            .contains(OffsetDateTime.parse("2020-02-20T18:07:11.390Z"))
        assertThat(objectTypeDefinition.description()).contains("description")
        assertThat(objectTypeDefinition.fullyQualifiedName()).contains("fullyQualifiedName")
        assertThat(objectTypeDefinition.objectTypeId()).contains("objectTypeId")
        assertThat(objectTypeDefinition.portalId()).contains(12345678)
        assertThat(objectTypeDefinition.primaryDisplayProperty()).contains("my_object_property")
        assertThat(objectTypeDefinition.searchableProperties().getOrNull())
            .containsExactly("my_object_property")
        assertThat(objectTypeDefinition.secondaryDisplayProperties().getOrNull())
            .containsExactly("string")
        assertThat(objectTypeDefinition.updatedAt())
            .contains(OffsetDateTime.parse("2020-02-21T14:13:28.818002Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val objectTypeDefinition =
            ObjectTypeDefinition.builder()
                .id("123456")
                .labels(
                    ObjectTypeDefinitionLabels.builder()
                        .plural("My objects")
                        .singular("My object")
                        .build()
                )
                .name("my_object")
                .addRequiredProperty("my_object_property")
                .archived(true)
                .createdAt(OffsetDateTime.parse("2020-02-20T18:07:11.390Z"))
                .description("description")
                .fullyQualifiedName("fullyQualifiedName")
                .objectTypeId("objectTypeId")
                .portalId(12345678)
                .primaryDisplayProperty("my_object_property")
                .addSearchableProperty("my_object_property")
                .addSecondaryDisplayProperty("string")
                .updatedAt(OffsetDateTime.parse("2020-02-21T14:13:28.818002Z"))
                .build()

        val roundtrippedObjectTypeDefinition =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(objectTypeDefinition),
                jacksonTypeRef<ObjectTypeDefinition>(),
            )

        assertThat(roundtrippedObjectTypeDefinition).isEqualTo(objectTypeDefinition)
    }
}
