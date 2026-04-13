// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.crm.propertiesvalidations

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PropertiesValidationUpdateByObjectTypeIdPropertyNameAndRuleTypeParamsTest {

    @Test
    fun create() {
        PropertiesValidationUpdateByObjectTypeIdPropertyNameAndRuleTypeParams.builder()
            .objectTypeId("objectTypeId")
            .propertyName("propertyName")
            .ruleType(
                PropertiesValidationUpdateByObjectTypeIdPropertyNameAndRuleTypeParams.RuleType
                    .AFTER_DATETIME_DURATION
            )
            .publicPropertyValidationRuleUpdate(
                PublicPropertyValidationRuleUpdate.builder()
                    .addRuleArgument("string")
                    .shouldApplyNormalization(true)
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            PropertiesValidationUpdateByObjectTypeIdPropertyNameAndRuleTypeParams.builder()
                .objectTypeId("objectTypeId")
                .propertyName("propertyName")
                .ruleType(
                    PropertiesValidationUpdateByObjectTypeIdPropertyNameAndRuleTypeParams.RuleType
                        .AFTER_DATETIME_DURATION
                )
                .publicPropertyValidationRuleUpdate(
                    PublicPropertyValidationRuleUpdate.builder().addRuleArgument("string").build()
                )
                .build()

        assertThat(params._pathParam(0)).isEqualTo("objectTypeId")
        assertThat(params._pathParam(1)).isEqualTo("propertyName")
        assertThat(params._pathParam(2)).isEqualTo("AFTER_DATETIME_DURATION")
        // out-of-bound path param
        assertThat(params._pathParam(3)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            PropertiesValidationUpdateByObjectTypeIdPropertyNameAndRuleTypeParams.builder()
                .objectTypeId("objectTypeId")
                .propertyName("propertyName")
                .ruleType(
                    PropertiesValidationUpdateByObjectTypeIdPropertyNameAndRuleTypeParams.RuleType
                        .AFTER_DATETIME_DURATION
                )
                .publicPropertyValidationRuleUpdate(
                    PublicPropertyValidationRuleUpdate.builder()
                        .addRuleArgument("string")
                        .shouldApplyNormalization(true)
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                PublicPropertyValidationRuleUpdate.builder()
                    .addRuleArgument("string")
                    .shouldApplyNormalization(true)
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            PropertiesValidationUpdateByObjectTypeIdPropertyNameAndRuleTypeParams.builder()
                .objectTypeId("objectTypeId")
                .propertyName("propertyName")
                .ruleType(
                    PropertiesValidationUpdateByObjectTypeIdPropertyNameAndRuleTypeParams.RuleType
                        .AFTER_DATETIME_DURATION
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
