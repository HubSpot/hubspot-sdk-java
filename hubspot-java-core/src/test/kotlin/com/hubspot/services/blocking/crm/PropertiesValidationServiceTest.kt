// File generated from our OpenAPI spec by Stainless.

package com.hubspot.services.blocking.crm

import com.hubspot.client.okhttp.HubSpotOkHttpClient
import com.hubspot.models.crm.propertiesvalidations.PropertiesValidationGetByObjectTypeIdAndPropertyNameParams
import com.hubspot.models.crm.propertiesvalidations.PropertiesValidationGetByObjectTypeIdPropertyNameAndRuleTypeParams
import com.hubspot.models.crm.propertiesvalidations.PropertiesValidationUpdateByObjectTypeIdPropertyNameAndRuleTypeParams
import com.hubspot.models.crm.propertiesvalidations.PublicPropertyValidationRuleUpdate
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class PropertiesValidationServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun getByObjectTypeId() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val propertiesValidationService = client.crm().propertiesValidations()

        val collectionResponsePublicPropertyValidationRuleMapNoPaging =
            propertiesValidationService.getByObjectTypeId("objectTypeId")

        collectionResponsePublicPropertyValidationRuleMapNoPaging.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getByObjectTypeIdAndPropertyName() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val propertiesValidationService = client.crm().propertiesValidations()

        val collectionResponsePublicPropertyValidationRuleNoPaging =
            propertiesValidationService.getByObjectTypeIdAndPropertyName(
                PropertiesValidationGetByObjectTypeIdAndPropertyNameParams.builder()
                    .objectTypeId("objectTypeId")
                    .propertyName("propertyName")
                    .build()
            )

        collectionResponsePublicPropertyValidationRuleNoPaging.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getByObjectTypeIdPropertyNameAndRuleType() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val propertiesValidationService = client.crm().propertiesValidations()

        val publicPropertyValidationRule =
            propertiesValidationService.getByObjectTypeIdPropertyNameAndRuleType(
                PropertiesValidationGetByObjectTypeIdPropertyNameAndRuleTypeParams.builder()
                    .objectTypeId("objectTypeId")
                    .propertyName("propertyName")
                    .ruleType(
                        PropertiesValidationGetByObjectTypeIdPropertyNameAndRuleTypeParams.RuleType
                            .AFTER_DATETIME_DURATION
                    )
                    .build()
            )

        publicPropertyValidationRule.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun updateByObjectTypeIdPropertyNameAndRuleType() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val propertiesValidationService = client.crm().propertiesValidations()

        propertiesValidationService.updateByObjectTypeIdPropertyNameAndRuleType(
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
        )
    }
}
