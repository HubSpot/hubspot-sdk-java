// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.associations.schema.v4

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicAssociationDefinitionCreateRequestTest {

    @Test
    fun create() {
        val publicAssociationDefinitionCreateRequest =
            PublicAssociationDefinitionCreateRequest.builder()
                .label("label")
                .name("name")
                .inverseLabel("inverseLabel")
                .build()

        assertThat(publicAssociationDefinitionCreateRequest.label()).isEqualTo("label")
        assertThat(publicAssociationDefinitionCreateRequest.name()).isEqualTo("name")
        assertThat(publicAssociationDefinitionCreateRequest.inverseLabel()).contains("inverseLabel")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicAssociationDefinitionCreateRequest =
            PublicAssociationDefinitionCreateRequest.builder()
                .label("label")
                .name("name")
                .inverseLabel("inverseLabel")
                .build()

        val roundtrippedPublicAssociationDefinitionCreateRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicAssociationDefinitionCreateRequest),
                jacksonTypeRef<PublicAssociationDefinitionCreateRequest>(),
            )

        assertThat(roundtrippedPublicAssociationDefinitionCreateRequest)
            .isEqualTo(publicAssociationDefinitionCreateRequest)
    }
}
