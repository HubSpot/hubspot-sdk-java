// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.crm.propertiesvalidations

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicPropertyValidationRuleUpdateTest {

    @Test
    fun create() {
        val publicPropertyValidationRuleUpdate =
            PublicPropertyValidationRuleUpdate.builder()
                .addRuleArgument("string")
                .shouldApplyNormalization(true)
                .build()

        assertThat(publicPropertyValidationRuleUpdate.ruleArguments()).containsExactly("string")
        assertThat(publicPropertyValidationRuleUpdate.shouldApplyNormalization()).contains(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicPropertyValidationRuleUpdate =
            PublicPropertyValidationRuleUpdate.builder()
                .addRuleArgument("string")
                .shouldApplyNormalization(true)
                .build()

        val roundtrippedPublicPropertyValidationRuleUpdate =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicPropertyValidationRuleUpdate),
                jacksonTypeRef<PublicPropertyValidationRuleUpdate>(),
            )

        assertThat(roundtrippedPublicPropertyValidationRuleUpdate)
            .isEqualTo(publicPropertyValidationRuleUpdate)
    }
}
