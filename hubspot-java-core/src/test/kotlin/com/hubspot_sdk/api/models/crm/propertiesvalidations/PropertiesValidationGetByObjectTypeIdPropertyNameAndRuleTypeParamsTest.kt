// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.propertiesvalidations

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PropertiesValidationGetByObjectTypeIdPropertyNameAndRuleTypeParamsTest {

    @Test
    fun create() {
        PropertiesValidationGetByObjectTypeIdPropertyNameAndRuleTypeParams.builder()
            .objectTypeId("objectTypeId")
            .propertyName("propertyName")
            .ruleType(
                PropertiesValidationGetByObjectTypeIdPropertyNameAndRuleTypeParams.RuleType
                    .AFTER_DATETIME_DURATION
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            PropertiesValidationGetByObjectTypeIdPropertyNameAndRuleTypeParams.builder()
                .objectTypeId("objectTypeId")
                .propertyName("propertyName")
                .ruleType(
                    PropertiesValidationGetByObjectTypeIdPropertyNameAndRuleTypeParams.RuleType
                        .AFTER_DATETIME_DURATION
                )
                .build()

        assertThat(params._pathParam(0)).isEqualTo("objectTypeId")
        assertThat(params._pathParam(1)).isEqualTo("propertyName")
        assertThat(params._pathParam(2)).isEqualTo("AFTER_DATETIME_DURATION")
        // out-of-bound path param
        assertThat(params._pathParam(3)).isEqualTo("")
    }
}
