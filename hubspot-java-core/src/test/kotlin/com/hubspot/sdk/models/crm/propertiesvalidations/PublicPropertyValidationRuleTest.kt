// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.crm.propertiesvalidations

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicPropertyValidationRuleTest {

    @Test
    fun create() {
        val publicPropertyValidationRule =
            PublicPropertyValidationRule.builder()
                .addRuleArgument("string")
                .ruleType(PublicPropertyValidationRule.RuleType.AFTER_DATETIME_DURATION)
                .shouldApplyNormalization(true)
                .build()

        assertThat(publicPropertyValidationRule.ruleArguments()).containsExactly("string")
        assertThat(publicPropertyValidationRule.ruleType())
            .isEqualTo(PublicPropertyValidationRule.RuleType.AFTER_DATETIME_DURATION)
        assertThat(publicPropertyValidationRule.shouldApplyNormalization()).contains(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicPropertyValidationRule =
            PublicPropertyValidationRule.builder()
                .addRuleArgument("string")
                .ruleType(PublicPropertyValidationRule.RuleType.AFTER_DATETIME_DURATION)
                .shouldApplyNormalization(true)
                .build()

        val roundtrippedPublicPropertyValidationRule =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicPropertyValidationRule),
                jacksonTypeRef<PublicPropertyValidationRule>(),
            )

        assertThat(roundtrippedPublicPropertyValidationRule).isEqualTo(publicPropertyValidationRule)
    }
}
