// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.associationsschema

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicAssociationSpecTest {

    @Test
    fun create() {
        val publicAssociationSpec =
            PublicAssociationSpec.builder().category("category").typeId(0).build()

        assertThat(publicAssociationSpec.category()).isEqualTo("category")
        assertThat(publicAssociationSpec.typeId()).isEqualTo(0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicAssociationSpec =
            PublicAssociationSpec.builder().category("category").typeId(0).build()

        val roundtrippedPublicAssociationSpec =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicAssociationSpec),
                jacksonTypeRef<PublicAssociationSpec>(),
            )

        assertThat(roundtrippedPublicAssociationSpec).isEqualTo(publicAssociationSpec)
    }
}
