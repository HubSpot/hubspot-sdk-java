// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.propertyvalidations

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CollectionResponsePublicPropertyValidationRuleNoPagingTest {

    @Test
    fun create() {
        val collectionResponsePublicPropertyValidationRuleNoPaging =
            CollectionResponsePublicPropertyValidationRuleNoPaging.builder()
                .addResult(
                    PublicPropertyValidationRule.builder()
                        .addRuleArgument("string")
                        .ruleType(PublicPropertyValidationRule.RuleType.AFTER_DATETIME_DURATION)
                        .build()
                )
                .build()

        assertThat(collectionResponsePublicPropertyValidationRuleNoPaging.results())
            .containsExactly(
                PublicPropertyValidationRule.builder()
                    .addRuleArgument("string")
                    .ruleType(PublicPropertyValidationRule.RuleType.AFTER_DATETIME_DURATION)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val collectionResponsePublicPropertyValidationRuleNoPaging =
            CollectionResponsePublicPropertyValidationRuleNoPaging.builder()
                .addResult(
                    PublicPropertyValidationRule.builder()
                        .addRuleArgument("string")
                        .ruleType(PublicPropertyValidationRule.RuleType.AFTER_DATETIME_DURATION)
                        .build()
                )
                .build()

        val roundtrippedCollectionResponsePublicPropertyValidationRuleNoPaging =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(
                    collectionResponsePublicPropertyValidationRuleNoPaging
                ),
                jacksonTypeRef<CollectionResponsePublicPropertyValidationRuleNoPaging>(),
            )

        assertThat(roundtrippedCollectionResponsePublicPropertyValidationRuleNoPaging)
            .isEqualTo(collectionResponsePublicPropertyValidationRuleNoPaging)
    }
}
