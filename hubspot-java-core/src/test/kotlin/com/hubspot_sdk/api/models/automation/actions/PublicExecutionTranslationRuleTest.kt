// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.automation.actions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicExecutionTranslationRuleTest {

    @Test
    fun create() {
        val publicExecutionTranslationRule =
            PublicExecutionTranslationRule.builder()
                .conditions(
                    PublicExecutionTranslationRule.Conditions.builder()
                        .putAdditionalProperty("foo", JsonValue.from(mapOf<String, Any>()))
                        .build()
                )
                .labelName("labelName")
                .build()

        assertThat(publicExecutionTranslationRule.conditions())
            .isEqualTo(
                PublicExecutionTranslationRule.Conditions.builder()
                    .putAdditionalProperty("foo", JsonValue.from(mapOf<String, Any>()))
                    .build()
            )
        assertThat(publicExecutionTranslationRule.labelName()).isEqualTo("labelName")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicExecutionTranslationRule =
            PublicExecutionTranslationRule.builder()
                .conditions(
                    PublicExecutionTranslationRule.Conditions.builder()
                        .putAdditionalProperty("foo", JsonValue.from(mapOf<String, Any>()))
                        .build()
                )
                .labelName("labelName")
                .build()

        val roundtrippedPublicExecutionTranslationRule =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicExecutionTranslationRule),
                jacksonTypeRef<PublicExecutionTranslationRule>(),
            )

        assertThat(roundtrippedPublicExecutionTranslationRule)
            .isEqualTo(publicExecutionTranslationRule)
    }
}
