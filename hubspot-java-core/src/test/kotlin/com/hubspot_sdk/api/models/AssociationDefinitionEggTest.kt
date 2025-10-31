// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AssociationDefinitionEggTest {

    @Test
    fun create() {
        val associationDefinitionEgg =
            AssociationDefinitionEgg.builder()
                .fromObjectTypeId("fromObjectTypeId")
                .toObjectTypeId("toObjectTypeId")
                .name("name")
                .build()

        assertThat(associationDefinitionEgg.fromObjectTypeId()).isEqualTo("fromObjectTypeId")
        assertThat(associationDefinitionEgg.toObjectTypeId()).isEqualTo("toObjectTypeId")
        assertThat(associationDefinitionEgg.name()).contains("name")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val associationDefinitionEgg =
            AssociationDefinitionEgg.builder()
                .fromObjectTypeId("fromObjectTypeId")
                .toObjectTypeId("toObjectTypeId")
                .name("name")
                .build()

        val roundtrippedAssociationDefinitionEgg =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(associationDefinitionEgg),
                jacksonTypeRef<AssociationDefinitionEgg>(),
            )

        assertThat(roundtrippedAssociationDefinitionEgg).isEqualTo(associationDefinitionEgg)
    }
}
