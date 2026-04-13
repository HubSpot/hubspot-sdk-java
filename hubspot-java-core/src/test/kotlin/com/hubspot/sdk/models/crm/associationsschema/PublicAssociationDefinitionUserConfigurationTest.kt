// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.crm.associationsschema

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicAssociationDefinitionUserConfigurationTest {

    @Test
    fun create() {
        val publicAssociationDefinitionUserConfiguration =
            PublicAssociationDefinitionUserConfiguration.builder()
                .category(PublicAssociationDefinitionUserConfiguration.Category.HUBSPOT_DEFINED)
                .typeId(0)
                .label("label")
                .userEnforcedMaxToObjectIds(0)
                .build()

        assertThat(publicAssociationDefinitionUserConfiguration.category())
            .isEqualTo(PublicAssociationDefinitionUserConfiguration.Category.HUBSPOT_DEFINED)
        assertThat(publicAssociationDefinitionUserConfiguration.typeId()).isEqualTo(0)
        assertThat(publicAssociationDefinitionUserConfiguration.label()).contains("label")
        assertThat(publicAssociationDefinitionUserConfiguration.userEnforcedMaxToObjectIds())
            .contains(0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicAssociationDefinitionUserConfiguration =
            PublicAssociationDefinitionUserConfiguration.builder()
                .category(PublicAssociationDefinitionUserConfiguration.Category.HUBSPOT_DEFINED)
                .typeId(0)
                .label("label")
                .userEnforcedMaxToObjectIds(0)
                .build()

        val roundtrippedPublicAssociationDefinitionUserConfiguration =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicAssociationDefinitionUserConfiguration),
                jacksonTypeRef<PublicAssociationDefinitionUserConfiguration>(),
            )

        assertThat(roundtrippedPublicAssociationDefinitionUserConfiguration)
            .isEqualTo(publicAssociationDefinitionUserConfiguration)
    }
}
