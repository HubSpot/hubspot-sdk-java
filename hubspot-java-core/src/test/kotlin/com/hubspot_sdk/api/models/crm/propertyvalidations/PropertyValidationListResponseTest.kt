// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.propertyvalidations

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PropertyValidationListResponseTest {

    @Test
    fun create() {
        val propertyValidationListResponse =
            PropertyValidationListResponse.builder()
                .addResult(
                    PropertyValidationListResponse.Result.builder()
                        .propertyName("propertyName")
                        .addPropertyValidationRule(
                            PropertyValidationListResponse.Result.PropertyValidationRule.builder()
                                .addRuleArgument("string")
                                .ruleType("ruleType")
                                .build()
                        )
                        .build()
                )
                .build()

        assertThat(propertyValidationListResponse.results())
            .containsExactly(
                PropertyValidationListResponse.Result.builder()
                    .propertyName("propertyName")
                    .addPropertyValidationRule(
                        PropertyValidationListResponse.Result.PropertyValidationRule.builder()
                            .addRuleArgument("string")
                            .ruleType("ruleType")
                            .build()
                    )
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val propertyValidationListResponse =
            PropertyValidationListResponse.builder()
                .addResult(
                    PropertyValidationListResponse.Result.builder()
                        .propertyName("propertyName")
                        .addPropertyValidationRule(
                            PropertyValidationListResponse.Result.PropertyValidationRule.builder()
                                .addRuleArgument("string")
                                .ruleType("ruleType")
                                .build()
                        )
                        .build()
                )
                .build()

        val roundtrippedPropertyValidationListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(propertyValidationListResponse),
                jacksonTypeRef<PropertyValidationListResponse>(),
            )

        assertThat(roundtrippedPropertyValidationListResponse)
            .isEqualTo(propertyValidationListResponse)
    }
}
