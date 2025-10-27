// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.associations.schema.v4

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicAssociationDefinitionConfigurationUpdateRequestTest {

    @Test
    fun create() {
        val publicAssociationDefinitionConfigurationUpdateRequest =
            PublicAssociationDefinitionConfigurationUpdateRequest.builder()
                .category(
                    PublicAssociationDefinitionConfigurationUpdateRequest.Category.HUBSPOT_DEFINED
                )
                .maxToObjectIds(0)
                .typeId(0)
                .build()

        assertThat(publicAssociationDefinitionConfigurationUpdateRequest.category())
            .isEqualTo(
                PublicAssociationDefinitionConfigurationUpdateRequest.Category.HUBSPOT_DEFINED
            )
        assertThat(publicAssociationDefinitionConfigurationUpdateRequest.maxToObjectIds())
            .isEqualTo(0)
        assertThat(publicAssociationDefinitionConfigurationUpdateRequest.typeId()).isEqualTo(0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicAssociationDefinitionConfigurationUpdateRequest =
            PublicAssociationDefinitionConfigurationUpdateRequest.builder()
                .category(
                    PublicAssociationDefinitionConfigurationUpdateRequest.Category.HUBSPOT_DEFINED
                )
                .maxToObjectIds(0)
                .typeId(0)
                .build()

        val roundtrippedPublicAssociationDefinitionConfigurationUpdateRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(
                    publicAssociationDefinitionConfigurationUpdateRequest
                ),
                jacksonTypeRef<PublicAssociationDefinitionConfigurationUpdateRequest>(),
            )

        assertThat(roundtrippedPublicAssociationDefinitionConfigurationUpdateRequest)
            .isEqualTo(publicAssociationDefinitionConfigurationUpdateRequest)
    }
}
