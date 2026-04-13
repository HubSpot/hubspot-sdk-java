// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AssociationDefinitionTest {

    @Test
    fun create() {
        val associationDefinition =
            AssociationDefinition.builder()
                .id("id")
                .fromObjectTypeId("fromObjectTypeId")
                .toObjectTypeId("toObjectTypeId")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .name("name")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(associationDefinition.id()).isEqualTo("id")
        assertThat(associationDefinition.fromObjectTypeId()).isEqualTo("fromObjectTypeId")
        assertThat(associationDefinition.toObjectTypeId()).isEqualTo("toObjectTypeId")
        assertThat(associationDefinition.createdAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(associationDefinition.name()).contains("name")
        assertThat(associationDefinition.updatedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val associationDefinition =
            AssociationDefinition.builder()
                .id("id")
                .fromObjectTypeId("fromObjectTypeId")
                .toObjectTypeId("toObjectTypeId")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .name("name")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedAssociationDefinition =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(associationDefinition),
                jacksonTypeRef<AssociationDefinition>(),
            )

        assertThat(roundtrippedAssociationDefinition).isEqualTo(associationDefinition)
    }
}
