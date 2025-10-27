// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AssociationDefinitionTest {

    @Test
    fun create() {
        val associationDefinition =
            AssociationDefinition.builder()
                .id("")
                .fromObjectTypeId("")
                .toObjectTypeId("")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .name("")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(associationDefinition.id()).isEqualTo("")
        assertThat(associationDefinition.fromObjectTypeId()).isEqualTo("")
        assertThat(associationDefinition.toObjectTypeId()).isEqualTo("")
        assertThat(associationDefinition.createdAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(associationDefinition.name()).contains("")
        assertThat(associationDefinition.updatedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val associationDefinition =
            AssociationDefinition.builder()
                .id("")
                .fromObjectTypeId("")
                .toObjectTypeId("")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .name("")
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
