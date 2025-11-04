// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.propertyvalidations

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicPropertyValidationRuleTest {

    @Test
    fun create() {
        val publicPropertyValidationRule =
            PublicPropertyValidationRule.builder()
                .addRuleArgument("string")
                .ruleType(PublicPropertyValidationRule.RuleType.FORMAT)
                .build()

        assertThat(publicPropertyValidationRule.ruleArguments()).containsExactly("string")
        assertThat(publicPropertyValidationRule.ruleType())
            .isEqualTo(PublicPropertyValidationRule.RuleType.FORMAT)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicPropertyValidationRule =
            PublicPropertyValidationRule.builder()
                .addRuleArgument("string")
                .ruleType(PublicPropertyValidationRule.RuleType.FORMAT)
                .build()

        val roundtrippedPublicPropertyValidationRule =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicPropertyValidationRule),
                jacksonTypeRef<PublicPropertyValidationRule>(),
            )

        assertThat(roundtrippedPublicPropertyValidationRule).isEqualTo(publicPropertyValidationRule)
    }
}
