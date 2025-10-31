// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.propertyvalidations

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PropertyValidationGetResponseTest {

    @Test
    fun create() {
        val propertyValidationGetResponse =
            PropertyValidationGetResponse.builder()
                .addResult(
                    PropertyValidationGetResponse.Result.builder()
                        .addRuleArgument("string")
                        .ruleType("ruleType")
                        .build()
                )
                .build()

        assertThat(propertyValidationGetResponse.results())
            .containsExactly(
                PropertyValidationGetResponse.Result.builder()
                    .addRuleArgument("string")
                    .ruleType("ruleType")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val propertyValidationGetResponse =
            PropertyValidationGetResponse.builder()
                .addResult(
                    PropertyValidationGetResponse.Result.builder()
                        .addRuleArgument("string")
                        .ruleType("ruleType")
                        .build()
                )
                .build()

        val roundtrippedPropertyValidationGetResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(propertyValidationGetResponse),
                jacksonTypeRef<PropertyValidationGetResponse>(),
            )

        assertThat(roundtrippedPropertyValidationGetResponse)
            .isEqualTo(propertyValidationGetResponse)
    }
}
