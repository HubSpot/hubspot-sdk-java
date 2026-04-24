// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BaseAssociationDefinitionTest {

    @Test
    fun create() {
        val baseAssociationDefinition =
            BaseAssociationDefinition.builder()
                .id("id")
                .fromObjectTypeId("fromObjectTypeId")
                .toObjectTypeId("toObjectTypeId")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .name("name")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(baseAssociationDefinition.id()).isEqualTo("id")
        assertThat(baseAssociationDefinition.fromObjectTypeId()).isEqualTo("fromObjectTypeId")
        assertThat(baseAssociationDefinition.toObjectTypeId()).isEqualTo("toObjectTypeId")
        assertThat(baseAssociationDefinition.createdAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(baseAssociationDefinition.name()).contains("name")
        assertThat(baseAssociationDefinition.updatedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val baseAssociationDefinition =
            BaseAssociationDefinition.builder()
                .id("id")
                .fromObjectTypeId("fromObjectTypeId")
                .toObjectTypeId("toObjectTypeId")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .name("name")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedBaseAssociationDefinition =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(baseAssociationDefinition),
                jacksonTypeRef<BaseAssociationDefinition>(),
            )

        assertThat(roundtrippedBaseAssociationDefinition).isEqualTo(baseAssociationDefinition)
    }
}
