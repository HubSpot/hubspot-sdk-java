// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.crm.propertiesvalidations

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicPropertyValidationRuleMapTest {

    @Test
    fun create() {
        val publicPropertyValidationRuleMap =
            PublicPropertyValidationRuleMap.builder()
                .propertyName("propertyName")
                .addPropertyValidationRule(
                    PublicPropertyValidationRule.builder()
                        .addRuleArgument("string")
                        .ruleType(PublicPropertyValidationRule.RuleType.AFTER_DATETIME_DURATION)
                        .shouldApplyNormalization(true)
                        .build()
                )
                .build()

        assertThat(publicPropertyValidationRuleMap.propertyName()).isEqualTo("propertyName")
        assertThat(publicPropertyValidationRuleMap.propertyValidationRules())
            .containsExactly(
                PublicPropertyValidationRule.builder()
                    .addRuleArgument("string")
                    .ruleType(PublicPropertyValidationRule.RuleType.AFTER_DATETIME_DURATION)
                    .shouldApplyNormalization(true)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicPropertyValidationRuleMap =
            PublicPropertyValidationRuleMap.builder()
                .propertyName("propertyName")
                .addPropertyValidationRule(
                    PublicPropertyValidationRule.builder()
                        .addRuleArgument("string")
                        .ruleType(PublicPropertyValidationRule.RuleType.AFTER_DATETIME_DURATION)
                        .shouldApplyNormalization(true)
                        .build()
                )
                .build()

        val roundtrippedPublicPropertyValidationRuleMap =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicPropertyValidationRuleMap),
                jacksonTypeRef<PublicPropertyValidationRuleMap>(),
            )

        assertThat(roundtrippedPublicPropertyValidationRuleMap)
            .isEqualTo(publicPropertyValidationRuleMap)
    }
}
