// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.crm.propertiesvalidations

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CollectionResponsePublicPropertyValidationRuleMapNoPagingTest {

    @Test
    fun create() {
        val collectionResponsePublicPropertyValidationRuleMapNoPaging =
            CollectionResponsePublicPropertyValidationRuleMapNoPaging.builder()
                .addResult(
                    PublicPropertyValidationRuleMap.builder()
                        .propertyName("propertyName")
                        .addPropertyValidationRule(
                            PublicPropertyValidationRule.builder()
                                .addRuleArgument("string")
                                .ruleType(
                                    PublicPropertyValidationRule.RuleType.AFTER_DATETIME_DURATION
                                )
                                .shouldApplyNormalization(true)
                                .build()
                        )
                        .build()
                )
                .build()

        assertThat(collectionResponsePublicPropertyValidationRuleMapNoPaging.results())
            .containsExactly(
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
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val collectionResponsePublicPropertyValidationRuleMapNoPaging =
            CollectionResponsePublicPropertyValidationRuleMapNoPaging.builder()
                .addResult(
                    PublicPropertyValidationRuleMap.builder()
                        .propertyName("propertyName")
                        .addPropertyValidationRule(
                            PublicPropertyValidationRule.builder()
                                .addRuleArgument("string")
                                .ruleType(
                                    PublicPropertyValidationRule.RuleType.AFTER_DATETIME_DURATION
                                )
                                .shouldApplyNormalization(true)
                                .build()
                        )
                        .build()
                )
                .build()

        val roundtrippedCollectionResponsePublicPropertyValidationRuleMapNoPaging =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(
                    collectionResponsePublicPropertyValidationRuleMapNoPaging
                ),
                jacksonTypeRef<CollectionResponsePublicPropertyValidationRuleMapNoPaging>(),
            )

        assertThat(roundtrippedCollectionResponsePublicPropertyValidationRuleMapNoPaging)
            .isEqualTo(collectionResponsePublicPropertyValidationRuleMapNoPaging)
    }
}
