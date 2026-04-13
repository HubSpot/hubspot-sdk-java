// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.crm.associationsschema

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicAssociationDefinitionUpdateRequestTest {

    @Test
    fun create() {
        val publicAssociationDefinitionUpdateRequest =
            PublicAssociationDefinitionUpdateRequest.builder()
                .associationTypeId(0)
                .label("label")
                .inverseLabel("inverseLabel")
                .build()

        assertThat(publicAssociationDefinitionUpdateRequest.associationTypeId()).isEqualTo(0)
        assertThat(publicAssociationDefinitionUpdateRequest.label()).isEqualTo("label")
        assertThat(publicAssociationDefinitionUpdateRequest.inverseLabel()).contains("inverseLabel")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicAssociationDefinitionUpdateRequest =
            PublicAssociationDefinitionUpdateRequest.builder()
                .associationTypeId(0)
                .label("label")
                .inverseLabel("inverseLabel")
                .build()

        val roundtrippedPublicAssociationDefinitionUpdateRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicAssociationDefinitionUpdateRequest),
                jacksonTypeRef<PublicAssociationDefinitionUpdateRequest>(),
            )

        assertThat(roundtrippedPublicAssociationDefinitionUpdateRequest)
            .isEqualTo(publicAssociationDefinitionUpdateRequest)
    }
}
