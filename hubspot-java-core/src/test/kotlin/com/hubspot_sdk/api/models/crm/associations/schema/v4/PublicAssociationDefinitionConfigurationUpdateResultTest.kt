// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.associations.schema.v4

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicAssociationDefinitionConfigurationUpdateResultTest {

    @Test
    fun create() {
        val publicAssociationDefinitionConfigurationUpdateResult =
            PublicAssociationDefinitionConfigurationUpdateResult.builder()
                .category(
                    PublicAssociationDefinitionConfigurationUpdateResult.Category.HUBSPOT_DEFINED
                )
                .typeId(0)
                .userEnforcedMaxToObjectIds(0)
                .build()

        assertThat(publicAssociationDefinitionConfigurationUpdateResult.category())
            .isEqualTo(
                PublicAssociationDefinitionConfigurationUpdateResult.Category.HUBSPOT_DEFINED
            )
        assertThat(publicAssociationDefinitionConfigurationUpdateResult.typeId()).isEqualTo(0)
        assertThat(
                publicAssociationDefinitionConfigurationUpdateResult.userEnforcedMaxToObjectIds()
            )
            .contains(0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicAssociationDefinitionConfigurationUpdateResult =
            PublicAssociationDefinitionConfigurationUpdateResult.builder()
                .category(
                    PublicAssociationDefinitionConfigurationUpdateResult.Category.HUBSPOT_DEFINED
                )
                .typeId(0)
                .userEnforcedMaxToObjectIds(0)
                .build()

        val roundtrippedPublicAssociationDefinitionConfigurationUpdateResult =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicAssociationDefinitionConfigurationUpdateResult),
                jacksonTypeRef<PublicAssociationDefinitionConfigurationUpdateResult>(),
            )

        assertThat(roundtrippedPublicAssociationDefinitionConfigurationUpdateResult)
            .isEqualTo(publicAssociationDefinitionConfigurationUpdateResult)
    }
}
