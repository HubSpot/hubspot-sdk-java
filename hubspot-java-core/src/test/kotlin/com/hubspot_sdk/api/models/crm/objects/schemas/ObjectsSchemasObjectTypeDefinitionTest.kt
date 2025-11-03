// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.objects.schemas

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import com.hubspot_sdk.api.models.ObjectTypeDefinitionLabels
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ObjectsSchemasObjectTypeDefinitionTest {

    @Test
    fun create() {
        val objectsSchemasObjectTypeDefinition =
            ObjectsSchemasObjectTypeDefinition.builder()
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

        assertThat(objectsSchemasObjectTypeDefinition.id()).isEqualTo("123456")
        assertThat(objectsSchemasObjectTypeDefinition.labels())
            .isEqualTo(
                ObjectTypeDefinitionLabels.builder()
                    .plural("My objects")
                    .singular("My object")
                    .build()
            )
        assertThat(objectsSchemasObjectTypeDefinition.name()).isEqualTo("my_object")
        assertThat(objectsSchemasObjectTypeDefinition.requiredProperties())
            .containsExactly("my_object_property")
        assertThat(objectsSchemasObjectTypeDefinition.archived()).contains(true)
        assertThat(objectsSchemasObjectTypeDefinition.createdAt())
            .contains(OffsetDateTime.parse("2020-02-20T18:07:11.390Z"))
        assertThat(objectsSchemasObjectTypeDefinition.description()).contains("description")
        assertThat(objectsSchemasObjectTypeDefinition.fullyQualifiedName())
            .contains("fullyQualifiedName")
        assertThat(objectsSchemasObjectTypeDefinition.objectTypeId()).contains("objectTypeId")
        assertThat(objectsSchemasObjectTypeDefinition.portalId()).contains(12345678)
        assertThat(objectsSchemasObjectTypeDefinition.primaryDisplayProperty())
            .contains("my_object_property")
        assertThat(objectsSchemasObjectTypeDefinition.searchableProperties().getOrNull())
            .containsExactly("my_object_property")
        assertThat(objectsSchemasObjectTypeDefinition.secondaryDisplayProperties().getOrNull())
            .containsExactly("string")
        assertThat(objectsSchemasObjectTypeDefinition.updatedAt())
            .contains(OffsetDateTime.parse("2020-02-21T14:13:28.818002Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val objectsSchemasObjectTypeDefinition =
            ObjectsSchemasObjectTypeDefinition.builder()
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

        val roundtrippedObjectsSchemasObjectTypeDefinition =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(objectsSchemasObjectTypeDefinition),
                jacksonTypeRef<ObjectsSchemasObjectTypeDefinition>(),
            )

        assertThat(roundtrippedObjectsSchemasObjectTypeDefinition)
            .isEqualTo(objectsSchemasObjectTypeDefinition)
    }
}
