// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.propertyvalidations

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PropertyValidationCrmV3PropertyValidationsObjectTypeIdPropertyNameRuleTypeRuleTypeParamsTest {

    @Test
    fun create() {
        PropertyValidationCrmV3PropertyValidationsObjectTypeIdPropertyNameRuleTypeRuleTypeParams
            .builder()
            .objectTypeId("objectTypeId")
            .propertyName("propertyName")
            .ruleType(
                PropertyValidationCrmV3PropertyValidationsObjectTypeIdPropertyNameRuleTypeRuleTypeParams
                    .RuleType
                    .FORMAT
            )
            .publicPropertyValidationRuleUpdate(
                PublicPropertyValidationRuleUpdate.builder().addRuleArgument("string").build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            PropertyValidationCrmV3PropertyValidationsObjectTypeIdPropertyNameRuleTypeRuleTypeParams
                .builder()
                .objectTypeId("objectTypeId")
                .propertyName("propertyName")
                .ruleType(
                    PropertyValidationCrmV3PropertyValidationsObjectTypeIdPropertyNameRuleTypeRuleTypeParams
                        .RuleType
                        .FORMAT
                )
                .publicPropertyValidationRuleUpdate(
                    PublicPropertyValidationRuleUpdate.builder().addRuleArgument("string").build()
                )
                .build()

        assertThat(params._pathParam(0)).isEqualTo("objectTypeId")
        assertThat(params._pathParam(1)).isEqualTo("propertyName")
        assertThat(params._pathParam(2)).isEqualTo("FORMAT")
        // out-of-bound path param
        assertThat(params._pathParam(3)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            PropertyValidationCrmV3PropertyValidationsObjectTypeIdPropertyNameRuleTypeRuleTypeParams
                .builder()
                .objectTypeId("objectTypeId")
                .propertyName("propertyName")
                .ruleType(
                    PropertyValidationCrmV3PropertyValidationsObjectTypeIdPropertyNameRuleTypeRuleTypeParams
                        .RuleType
                        .FORMAT
                )
                .publicPropertyValidationRuleUpdate(
                    PublicPropertyValidationRuleUpdate.builder().addRuleArgument("string").build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                PublicPropertyValidationRuleUpdate.builder().addRuleArgument("string").build()
            )
    }
}
