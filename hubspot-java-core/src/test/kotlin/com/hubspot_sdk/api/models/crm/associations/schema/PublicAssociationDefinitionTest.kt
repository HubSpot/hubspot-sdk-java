// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.associations.schema

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicAssociationDefinitionTest {

    @Test
    fun create() {
        val publicAssociationDefinition =
            PublicAssociationDefinition.builder().id("1").name("contact_to_company").build()

        assertThat(publicAssociationDefinition.id()).isEqualTo("1")
        assertThat(publicAssociationDefinition.name()).isEqualTo("contact_to_company")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicAssociationDefinition =
            PublicAssociationDefinition.builder().id("1").name("contact_to_company").build()

        val roundtrippedPublicAssociationDefinition =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicAssociationDefinition),
                jacksonTypeRef<PublicAssociationDefinition>(),
            )

        assertThat(roundtrippedPublicAssociationDefinition).isEqualTo(publicAssociationDefinition)
    }
}
