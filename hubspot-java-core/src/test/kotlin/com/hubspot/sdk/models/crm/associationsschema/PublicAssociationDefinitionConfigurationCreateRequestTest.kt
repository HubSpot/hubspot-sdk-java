// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.crm.associationsschema

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicAssociationDefinitionConfigurationCreateRequestTest {

    @Test
    fun create() {
        val publicAssociationDefinitionConfigurationCreateRequest =
            PublicAssociationDefinitionConfigurationCreateRequest.builder()
                .category(
                    PublicAssociationDefinitionConfigurationCreateRequest.Category.HUBSPOT_DEFINED
                )
                .maxToObjectIds(0)
                .typeId(0)
                .build()

        assertThat(publicAssociationDefinitionConfigurationCreateRequest.category())
            .isEqualTo(
                PublicAssociationDefinitionConfigurationCreateRequest.Category.HUBSPOT_DEFINED
            )
        assertThat(publicAssociationDefinitionConfigurationCreateRequest.maxToObjectIds())
            .isEqualTo(0)
        assertThat(publicAssociationDefinitionConfigurationCreateRequest.typeId()).isEqualTo(0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicAssociationDefinitionConfigurationCreateRequest =
            PublicAssociationDefinitionConfigurationCreateRequest.builder()
                .category(
                    PublicAssociationDefinitionConfigurationCreateRequest.Category.HUBSPOT_DEFINED
                )
                .maxToObjectIds(0)
                .typeId(0)
                .build()

        val roundtrippedPublicAssociationDefinitionConfigurationCreateRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(
                    publicAssociationDefinitionConfigurationCreateRequest
                ),
                jacksonTypeRef<PublicAssociationDefinitionConfigurationCreateRequest>(),
            )

        assertThat(roundtrippedPublicAssociationDefinitionConfigurationCreateRequest)
            .isEqualTo(publicAssociationDefinitionConfigurationCreateRequest)
    }
}
