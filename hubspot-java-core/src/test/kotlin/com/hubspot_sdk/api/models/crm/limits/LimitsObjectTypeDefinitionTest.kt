// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.limits

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LimitsObjectTypeDefinitionTest {

    @Test
    fun create() {
        val limitsObjectTypeDefinition =
            LimitsObjectTypeDefinition.builder()
                .objectTypeId("objectTypeId")
                .pluralLabel("pluralLabel")
                .singularLabel("singularLabel")
                .build()

        assertThat(limitsObjectTypeDefinition.objectTypeId()).isEqualTo("objectTypeId")
        assertThat(limitsObjectTypeDefinition.pluralLabel()).isEqualTo("pluralLabel")
        assertThat(limitsObjectTypeDefinition.singularLabel()).isEqualTo("singularLabel")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val limitsObjectTypeDefinition =
            LimitsObjectTypeDefinition.builder()
                .objectTypeId("objectTypeId")
                .pluralLabel("pluralLabel")
                .singularLabel("singularLabel")
                .build()

        val roundtrippedLimitsObjectTypeDefinition =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(limitsObjectTypeDefinition),
                jacksonTypeRef<LimitsObjectTypeDefinition>(),
            )

        assertThat(roundtrippedLimitsObjectTypeDefinition).isEqualTo(limitsObjectTypeDefinition)
    }
}
