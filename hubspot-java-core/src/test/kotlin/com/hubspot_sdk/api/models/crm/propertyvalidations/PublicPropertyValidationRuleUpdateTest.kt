// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.propertyvalidations

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicPropertyValidationRuleUpdateTest {

    @Test
    fun create() {
        val publicPropertyValidationRuleUpdate =
            PublicPropertyValidationRuleUpdate.builder().addRuleArgument("string").build()

        assertThat(publicPropertyValidationRuleUpdate.ruleArguments()).containsExactly("string")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicPropertyValidationRuleUpdate =
            PublicPropertyValidationRuleUpdate.builder().addRuleArgument("string").build()

        val roundtrippedPublicPropertyValidationRuleUpdate =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicPropertyValidationRuleUpdate),
                jacksonTypeRef<PublicPropertyValidationRuleUpdate>(),
            )

        assertThat(roundtrippedPublicPropertyValidationRuleUpdate)
            .isEqualTo(publicPropertyValidationRuleUpdate)
    }
}
